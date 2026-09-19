package volucris.bindings.generator.generation.record;

import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import freemarker.template.Template;
import volucris.bindings.generator.config.ClassConfig.StructDescription;
import volucris.bindings.generator.config.GlobalConfig;
import volucris.bindings.generator.generation.fields.Field;
import volucris.bindings.generator.generation.fields.VarHandleField;
import volucris.bindings.generator.generation.methods.Method;
import volucris.bindings.generator.generation.methods.VarHandleMethod;
import volucris.bindings.generator.parsing.NativeRecord;
import volucris.bindings.generator.parsing.NativeTypeKind;
import volucris.bindings.generator.parsing.NativeRecord.NativeField;
import volucris.bindings.generator.parsing.NativeRecord.PaddingField;
import volucris.bindings.generator.parsing.NativeRecord.RecordField;
import volucris.bindings.generator.parsing.NativeType.ArrayType;
import volucris.bindings.generator.parsing.NativeType.SimpleType;
import volucris.bindings.generator.parsing.NativeType.TypeResult;

/// Builds accessors for fields whose type is a primitive or a pointer, or an array thereof —
/// i.e. any field that can be accessed through a [VarHandle].
public class ScalarFieldAccessorsBuilder {

	private final List<FieldInformation> fieldInformations;

	private final GlobalConfig globalConfig;

	private final StructDescription structDescription;

	public ScalarFieldAccessorsBuilder(
			GlobalConfig globalConfig, NativeRecord nativeRecord, StructDescription structDescription
	) {
		this.globalConfig = globalConfig;
		this.structDescription = structDescription;

		this.fieldInformations = new ArrayList<FieldInformation>();

		nativeRecord.getFields().forEach(recordField -> {
			getFieldInformation(recordField, structDescription);
		});
	}

	private void getFieldInformation(NativeField recordField, StructDescription structDescription) {
		if (recordField instanceof PaddingField) {
			return;
		} else if (recordField instanceof RecordField field) {

			if (structDescription.getNoAccessFields().contains(field.getName()))
				return;

			TypeResult typeResult = field.getType();

			NativeTypeKind typeKind = typeResult.typeKind();

			VarHandleField varHandleField = new VarHandleField(field.getName());

			if (typeResult.typeKind() == NativeTypeKind.RECORD) {
				// Record fields cannot be accessed through VarHandles.
				return;
			} else if (typeKind == NativeTypeKind.ARRAY) {
				ArrayFieldInformation information = getArrayFieldInformation(
						field, varHandleField, (ArrayType) typeResult
				);

				if (information.elementType().typeKind() == NativeTypeKind.RECORD) {
					/// An array of records cannot be accessed through VarHandles.
					return;
				}

				fieldInformations.add(information);
			} else if (typeKind != NativeTypeKind.UNKNOWN && typeKind != NativeTypeKind.VOID) {

				boolean declaredAsString = structDescription.getStringFields().contains(field.getName());

				if (typeKind == NativeTypeKind.BYTE_POINTER && declaredAsString) {
					fieldInformations.add(
							new StringFieldInformation(
									field, varHandleField, new SimpleType(NativeTypeKind.STRING, typeResult.typeName())
							)
					);
				} else {
					fieldInformations.add(new SimpleFieldInformation(field, varHandleField));
				}
			} else {
				throw new RuntimeException("Unsupported field type kind " + typeKind);
			}
		} else {
			throw new RuntimeException("Unsupported native field.");
		}

	}

	private ArrayFieldInformation getArrayFieldInformation(
			NativeRecord.RecordField field, VarHandleField varHandleField, ArrayType arrayType
	) {
		int depth = 1;

		while (arrayType.elementKind() == NativeTypeKind.ARRAY) {
			depth += 1;

			arrayType = (ArrayType) arrayType.elementType();
		}

		SimpleType elementType = (SimpleType) arrayType.elementType();
		return new ArrayFieldInformation(field, varHandleField, elementType, depth);
	}

	public List<Field> getVarHandleFields() {
		List<VarHandleField> varHandleFields = new ArrayList<VarHandleField>();

		for (FieldInformation fieldInformation : fieldInformations) {
			varHandleFields.add(fieldInformation.varHandleField());
		}

		return Collections.unmodifiableList(varHandleFields);
	}

	public List<String> getVarHandleLoading() {
		List<String> varHandleLoading = new ArrayList<String>();

		for (FieldInformation fieldInformation : fieldInformations) {
			if (!(fieldInformation instanceof ArrayFieldInformation)) {
				varHandleLoading.add(
						String.join(
								"",
								fieldInformation.varHandleField().getName(),
								" = LAYOUT.varHandle(PathElement.groupElement(\"",
								fieldInformation.structFieldName(),
								"\"));"
						)
				);
			} else if (fieldInformation instanceof ArrayFieldInformation information) {
				String sequenceElements = String.join(
						"",
						"PathElement.sequenceElement(), ".repeat(information.depth() - 1),
						"PathElement.sequenceElement()"
				);
				varHandleLoading.add(
						String.join(
								"",
								information.varHandleField().getName(),
								" = LAYOUT.varHandle(PathElement.groupElement(\"",
								information.structFieldName(),
								"\"), ",
								sequenceElements,
								");"
						)
				);

			} else {
				throw new RuntimeException("Unsupported field information.");
			}
		}

		return Collections.unmodifiableList(varHandleLoading);
	}

	public List<Method> getMethods(String className, Template template) {
		List<Method> methods = new ArrayList<Method>();

		for (FieldInformation fieldInformation : fieldInformations) {
			final VarHandleMethod.Builder builder;

			if (fieldInformation.containsPrimitiveType()) {
				final VarHandleMethod.PrimitiveBuilder primitiveBuilder;

				if (fieldInformation instanceof ArrayFieldInformation information) {
					primitiveBuilder = new VarHandleMethod.PrimitiveArrayBuilder()
							.setDepth(information.depth());
				} else {
					primitiveBuilder = new VarHandleMethod.PrimitiveBuilder();
				}

				builder = primitiveBuilder.setPrimitiveType(fieldInformation.type());
			} else if (fieldInformation.containsPointerType()) {
				final VarHandleMethod.PointerBuilder pointerBuilder;

				SimpleType simpleType = fieldInformation.type();

				String structFieldName = fieldInformation.structFieldName();

				boolean isString = structDescription.getStringFields().contains(structFieldName);
				boolean isStructArray = structDescription.getStructArrays().contains(structFieldName);

				if (simpleType.typeKind() == NativeTypeKind.BYTE_POINTER && isString) {
					simpleType = new SimpleType(NativeTypeKind.STRING, simpleType.typeName());
				}

				if (fieldInformation instanceof ArrayFieldInformation information) {
					pointerBuilder = new VarHandleMethod.PointerArrayBuilder()
							.setDepth(information.depth());
				} else {
					pointerBuilder = new VarHandleMethod.PointerBuilder();
				}

				builder = pointerBuilder.setPointerType(
						globalConfig, fieldInformation.nativeField(), fieldInformation.type(), isStructArray
				);
			} else {
				throw new RuntimeException("Unsupported field information.");
			}

			methods.add(
					builder.setStructFieldName(fieldInformation.structFieldName())
							.setClassName(className)
							.setVarHandleFieldName(fieldInformation.varHandleField().getName())
							.setJavadoc(fieldInformation.nativeField().getComment())
							.build(template)
			);
		}

		return Collections.unmodifiableList(methods);
	}

	private static interface FieldInformation {
		NativeRecord.RecordField nativeField();

		VarHandleField varHandleField();

		SimpleType type();

		String structFieldName();

		boolean containsPrimitiveType();

		boolean containsPointerType();
	}

	private static record StringFieldInformation(
			NativeRecord.RecordField nativeField, VarHandleField varHandleField, SimpleType simpleType
	) implements FieldInformation {

		public boolean containsPrimitiveType() {
			return simpleType.typeKind().isPrimitive();
		}

		public boolean containsPointerType() {
			return simpleType.typeKind().isPointer();
		}

		public SimpleType type() {
			return simpleType;
		}

		@Override
		public String structFieldName() {
			return nativeField.getName();
		}

	}

	private static record SimpleFieldInformation(
			NativeRecord.RecordField nativeField, VarHandleField varHandleField
	) implements FieldInformation {

		public boolean containsPrimitiveType() {
			return nativeField.getType().typeKind().isPrimitive();
		}

		public boolean containsPointerType() {
			return nativeField.getType().typeKind().isPointer();
		}

		public SimpleType type() {
			return (SimpleType) nativeField.getType();
		}

		@Override
		public String structFieldName() {
			return nativeField.getName();
		}

	}

	private static record ArrayFieldInformation(
			NativeRecord.RecordField nativeField,
			VarHandleField varHandleField,
			SimpleType elementType,
			int depth
	) implements FieldInformation {

		public boolean containsPrimitiveType() {
			return elementType.typeKind().isPrimitive();
		}

		public boolean containsPointerType() {
			return elementType.typeKind().isPointer();
		}

		public SimpleType type() {
			return elementType;
		}

		@Override
		public String structFieldName() {
			return nativeField.getName();
		}
	}

}
