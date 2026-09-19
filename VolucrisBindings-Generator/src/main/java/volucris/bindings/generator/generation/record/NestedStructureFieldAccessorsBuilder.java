package volucris.bindings.generator.generation.record;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

import org.jspecify.annotations.Nullable;
import freemarker.template.Template;
import volucris.bindings.generator.config.GlobalConfig;
import volucris.bindings.generator.generation.GeneratorUtils;
import volucris.bindings.generator.generation.Modifier;
import volucris.bindings.generator.generation.constructors.Constructor;
import volucris.bindings.generator.generation.constructors.RecordConstructor;
import volucris.bindings.generator.generation.fields.ArrayField;
import volucris.bindings.generator.generation.fields.Field;
import volucris.bindings.generator.generation.fields.GenericField;
import volucris.bindings.generator.generation.methods.Method;
import volucris.bindings.generator.parsing.NativeRecord;
import volucris.bindings.generator.parsing.NativeTypeKind;
import volucris.bindings.generator.parsing.NativeRecord.NativeField;
import volucris.bindings.generator.parsing.NativeRecord.PaddingField;
import volucris.bindings.generator.parsing.NativeRecord.RecordField;
import volucris.bindings.generator.parsing.NativeType.ArrayType;
import volucris.bindings.generator.parsing.NativeType.SimpleType;
import volucris.bindings.generator.parsing.NativeType.TypeResult;

/// Builds accessors for fields whose type is a struct, union, or an array thereof —
/// i.e. any field that must be accessed via a MemorySegment view/slice rather than a VarHandle.
public class NestedStructureFieldAccessorsBuilder {

	private final List<FieldInformation> fieldInformations;

	private final GlobalConfig globalConfig;

	public NestedStructureFieldAccessorsBuilder(
			GlobalConfig globalConfig,
			NativeRecord nativeRecord,
			Map<String, Field> fieldOffsetsFields
	) {
		this.globalConfig = globalConfig;

		this.fieldInformations = new ArrayList<FieldInformation>();

		nativeRecord.getFields().forEach(
				recordField -> getFieldInformation(nativeRecord.getName(), recordField, fieldOffsetsFields)
		);
	}

	private void getFieldInformation(
			String recordName, NativeField nativeField, Map<String, Field> fieldOffsetsFields
	) {
		if (nativeField instanceof PaddingField) {
			return;
		} else if (nativeField instanceof RecordField recordField) {
			TypeResult typeResult = recordField.getType();

			NativeTypeKind typeKind = typeResult.typeKind();

			String fieldName = recordField.getName();

			Field offsetField = fieldOffsetsFields.get(fieldName);

			if (typeResult.typeKind() == NativeTypeKind.RECORD) {

				SimpleType simpleType = (SimpleType) typeResult;

				String typeName = GeneratorUtils.transformName(globalConfig, simpleType.typeName(), false);

				fieldName = Character.toLowerCase(fieldName.charAt(0)) + fieldName.substring(1);

				GenericField field = new GenericField(fieldName, typeName, Modifier.PRIVATE, Modifier.FINAL);

				fieldInformations.add(new SimpleFieldInformation(recordField, field, offsetField));
				return;
			} else if (typeKind == NativeTypeKind.ARRAY) {
				ArrayFieldInformation information = getArrayFieldInformation(
						recordField, offsetField, (ArrayType) typeResult
				);

				if (information.elementType().typeKind() != NativeTypeKind.RECORD) {
					return;
				}

				if (information.dimensions().size() > 1) {
					String m1 = "Building accessor for multi dimensional arrays of nested structure types (structs/ unions) is currently not supported. ";
					String m2 = "Such case was found in record " + recordName;

					throw new RuntimeException(m1 + m2);
				}

				fieldInformations.add(information);
			} else if (typeKind != NativeTypeKind.UNKNOWN && typeKind != NativeTypeKind.VOID) {
				return;
			} else {
				throw new RuntimeException("Unsupported field type kind " + typeKind);
			}
		} else {
			throw new RuntimeException("Unsupported native field.");
		}

	}

	private ArrayFieldInformation getArrayFieldInformation(
			NativeRecord.RecordField nativeField, Field offsetField, ArrayType arrayType
	) {
		List<Integer> dimensions = new ArrayList<Integer>();
		dimensions.add((int) arrayType.count());

		while (arrayType.elementKind() == NativeTypeKind.ARRAY) {
			arrayType = (ArrayType) arrayType.elementType();
			dimensions.add((int) arrayType.count());
		}

		SimpleType elementType = (SimpleType) arrayType.elementType();

		String typeName = GeneratorUtils.transformName(globalConfig, elementType.typeName(), false);

		String fieldName = Character.toLowerCase(nativeField.getName().charAt(0)) + nativeField.getName().substring(1);

		ArrayField field = new ArrayField(fieldName, typeName, dimensions.size(), Modifier.PRIVATE, Modifier.FINAL);

		return new ArrayFieldInformation(
				nativeField, field, offsetField, elementType, Collections.unmodifiableList(dimensions)
		);
	}

	public List<Field> getNestedStructureFields() {
		List<Field> fields = new ArrayList<Field>();

		for (FieldInformation fieldInformation : fieldInformations) {
			fields.add(fieldInformation.field());
		}

		return Collections.unmodifiableList(fields);
	}

	public Constructor getConstructor(String className, Template template) {
		RecordConstructor.Builder builder = new RecordConstructor.Builder()
				.setClassName(className);

		for (FieldInformation fieldInformation : fieldInformations) {

			if (fieldInformation instanceof ArrayFieldInformation information) {
				builder.addNestedStructureField(
						information.field(), information.offsetField(), information.dimensions()
				);
			} else {
				builder.addNestedStructureField(fieldInformation.field(), fieldInformation.offsetField());
			}
		}

		return builder.build(template);
	}

	public List<Method> getMethods(String className, Template template) {
		List<Method> methods = new ArrayList<Method>();

		Map<String, Object> dataModel = new HashMap<String, Object>();

		for (FieldInformation fieldInformation : fieldInformations) {
			dataModel.clear();

			dataModel.put("className", className);
			dataModel.put("fieldName", fieldInformation.field().getName());
			dataModel.put("javadoc", GeneratorUtils.getJavadoc(fieldInformation.comment()));

			if (fieldInformation instanceof ArrayFieldInformation information) {
				dataModel.put("typeName", information.field().getElementType());
				dataModel.put("isArray", true);
			} else {
				dataModel.put("typeName", fieldInformation.field().getType());
			}

			methods.add(new Method(template, dataModel, List.of(Consumer.class.getCanonicalName())));
		}

		return Collections.unmodifiableList(methods);

	}

	private static interface FieldInformation {
		NativeRecord.RecordField nativeField();

		Field field();

		Field offsetField();

		SimpleType type();

		String structFieldName();

		@Nullable
		String comment();
	}

	private static record SimpleFieldInformation(
			NativeRecord.RecordField nativeField, Field field, Field offsetField
	) implements FieldInformation {

		@Override
		public SimpleType type() {
			return (SimpleType) nativeField.getType();
		}

		@Override
		public String structFieldName() {
			return nativeField.getName();
		}

		@Override
		public @Nullable String comment() {
			return nativeField.getComment();
		}

	}

	private static record ArrayFieldInformation(
			NativeRecord.RecordField nativeField,
			ArrayField field,
			Field offsetField,
			SimpleType elementType,
			List<Integer> dimensions
	) implements FieldInformation {

		@Override
		public SimpleType type() {
			return elementType;
		}

		@Override
		public String structFieldName() {
			return nativeField.getName();
		}

		@Override
		public @Nullable String comment() {
			return nativeField.getComment();
		}

	}

}
