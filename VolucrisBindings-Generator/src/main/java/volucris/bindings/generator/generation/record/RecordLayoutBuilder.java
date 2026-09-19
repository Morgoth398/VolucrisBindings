package volucris.bindings.generator.generation.record;

import java.io.StringWriter;
import java.lang.foreign.ValueLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import freemarker.template.Template;
import volucris.bindings.core.FFMUtils;
import volucris.bindings.generator.config.GlobalConfig;
import volucris.bindings.generator.generation.GeneratorUtils;
import volucris.bindings.generator.generation.fields.RecordLayoutField;
import volucris.bindings.generator.parsing.NativeRecord;
import volucris.bindings.generator.parsing.NativeRecord.NativeField;
import volucris.bindings.generator.parsing.NativeRecord.PaddingField;
import volucris.bindings.generator.parsing.NativeRecord.RecordField;
import volucris.bindings.generator.parsing.NativeType.ArrayType;
import volucris.bindings.generator.parsing.NativeType.TypeResult;
import volucris.bindings.generator.parsing.NativeTypeKind;

public class RecordLayoutBuilder {

	private final List<String> recordFields;
	private final List<String> requiredStaticImports;

	private final RecordLayoutField field;

	private final GlobalConfig globalConfig;

	private final NativeRecord nativeRecord;

	public RecordLayoutBuilder(GlobalConfig globalConfig, RecordLayoutField field, NativeRecord nativeRecord) {
		this.globalConfig = globalConfig;
		this.field = field;
		this.nativeRecord = nativeRecord;

		this.recordFields = new ArrayList<String>();
		this.requiredStaticImports = new ArrayList<String>();

		nativeRecord.getFields().forEach(recordField -> addRecordField(recordField));
	}

	private void addRecordField(NativeField recordField) {
		if (recordField instanceof PaddingField field) {
			long padding = field.getSize();
			recordFields.add("MemoryLayout.paddingLayout(" + padding + ")");
		} else if (recordField instanceof RecordField field) {
			TypeResult typeResult = field.getType();

			NativeTypeKind typeKind = typeResult.typeKind();

			String fieldName = field.getName();

			if (typeResult.typeKind() == NativeTypeKind.RECORD) {
				String layout = GeneratorUtils.getRecordLayout(globalConfig, typeResult);
				recordFields.add(layout + ".withName(\"" + fieldName + "\")");
			} else if (typeKind == NativeTypeKind.ARRAY) {
				recordFields.add(handleArrayField(fieldName, (ArrayType) typeResult));
			} else if (typeKind != NativeTypeKind.UNKNOWN && typeKind != NativeTypeKind.VOID) {
				if (typeKind.isPointer()) {
					requiredStaticImports.add(FFMUtils.class.getCanonicalName() + ".*");
				} else if (typeKind.isPrimitive()) {
					requiredStaticImports.add(ValueLayout.class.getCanonicalName() + ".*");
				}

				recordFields.add(typeResult.typeKind().getValueLayout() + ".withName(\"" + fieldName + "\")");
			} else {
				throw new RuntimeException("Unsupported field type kind " + typeKind);
			}
		} else {
			throw new RuntimeException("Unsupported native field.");
		}
	}

	private String handleArrayField(String fieldName, ArrayType arrayType) {
		TypeResult elementTypeResult = arrayType.elementType();

		NativeTypeKind elementTypeKind = elementTypeResult.typeKind();

		long count = arrayType.count();

		if (count == 0)
			throw new RuntimeException("Zero length struct array field found. This is currently not supported.");

		if (elementTypeKind == NativeTypeKind.RECORD) {
			String layout = GeneratorUtils.getRecordLayout(globalConfig, elementTypeResult);
			return "MemoryLayout.sequenceLayout(" + count + ", " + layout + ").withName(\"" + fieldName + "\")";
		} else if (elementTypeKind == NativeTypeKind.ARRAY) {
			String layout = getArrayOfArraysLayout((ArrayType) elementTypeResult);
			return "MemoryLayout.sequenceLayout(" + count + ", " + layout + ").withName(\"" + fieldName + "\")";
		} else if (elementTypeKind != NativeTypeKind.UNKNOWN && elementTypeKind != NativeTypeKind.VOID) {
			if (elementTypeKind.isPointer()) {
				requiredStaticImports.add(FFMUtils.class.getCanonicalName() + ".*");
			} else if (elementTypeKind.isPrimitive()) {
				requiredStaticImports.add(ValueLayout.class.getCanonicalName() + ".*");
			}

			String layout = elementTypeKind.getValueLayout();
			return "MemoryLayout.sequenceLayout(" + count + ", " + layout + ").withName(\"" + fieldName + "\")";
		} else {
			throw new RuntimeException("Unsupported array element type kind " + elementTypeKind);
		}

	}

	private String getArrayOfArraysLayout(ArrayType arrayType) {
		TypeResult elementTypeResult = arrayType.elementType();

		NativeTypeKind elementTypeKind = elementTypeResult.typeKind();

		long count = arrayType.count();

		if (count == 0)
			throw new RuntimeException("Zero length array found. This is currently not supported.");

		if (elementTypeKind == NativeTypeKind.RECORD) {
			String layout = GeneratorUtils.getRecordLayout(globalConfig, elementTypeResult);
			return "MemoryLayout.sequenceLayout(" + count + ", " + layout + ")";
		} else if (elementTypeKind == NativeTypeKind.ARRAY) {
			String layout = getArrayOfArraysLayout((ArrayType) elementTypeResult);
			return "MemoryLayout.sequenceLayout(" + count + ", " + layout + ")";
		} else if (elementTypeKind != NativeTypeKind.UNKNOWN && elementTypeKind != NativeTypeKind.VOID) {
			String layout = elementTypeKind.getValueLayout();
			return "MemoryLayout.sequenceLayout(" + count + ", " + layout + ")";
		} else {
			throw new RuntimeException("Unsupported array element type kind " + elementTypeKind);
		}
	}

	public String getLayout(Template template) {
		try {
			Map<String, Object> dataModel = new HashMap<String, Object>();
			dataModel.put("fieldName", field.getName());
			dataModel.put("fields", recordFields);
			dataModel.put("structName", nativeRecord.getName());
			dataModel.put("alignment", nativeRecord.getAlignment());
			dataModel.put("isUnion", nativeRecord.isUnion());

			StringWriter stringWriter = new StringWriter();
			template.process(dataModel, stringWriter);

			return stringWriter.toString();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public List<String> getRequiredStaticImports() {
		return Collections.unmodifiableList(requiredStaticImports);
	}
	
}
