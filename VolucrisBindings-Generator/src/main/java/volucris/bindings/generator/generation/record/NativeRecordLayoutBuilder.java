package volucris.bindings.generator.generation.record;

import java.io.StringWriter;
import java.lang.foreign.ValueLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jspecify.annotations.Nullable;

import freemarker.template.Template;
import volucris.bindings.core.FFMUtils;
import volucris.bindings.generator.config.GlobalConfig;
import volucris.bindings.generator.generation.GeneratorUtils;
import volucris.bindings.generator.generation.fields.RecordLayoutField;
import volucris.bindings.generator.parsing.NativeRecord;
import volucris.bindings.generator.parsing.NativeType;
import volucris.bindings.generator.parsing.NativeTypeKind;
import volucris.bindings.generator.parsing.NativeType.ArrayType;
import volucris.bindings.generator.parsing.NativeType.TypeResult;

public class NativeRecordLayoutBuilder {

	private final List<String> requiredStaticImports;

	private final String layout;

	public NativeRecordLayoutBuilder(
			GlobalConfig globalConfig,
			NativeRecord nativeRecord,
			@Nullable RecordLayoutField field,
			Template layoutTemplate
	) {
		if (nativeRecord.getMembersCount() == 0) {
			throw new RuntimeException("Record (" + nativeRecord.getName() + ") has no members. Cannot create layout.");
		}

		this.requiredStaticImports = new ArrayList<String>();

		List<String> memberLayouts = new ArrayList<String>();

		nativeRecord.getMembers().forEach(member -> {
			memberLayouts.add(getMemberLayout(member, globalConfig, layoutTemplate));
		});

		try {
			Map<String, Object> dataModel = new HashMap<String, Object>();

			if (field != null)
				dataModel.put("fieldName", field.getName());

			dataModel.put("layouts", memberLayouts);
			dataModel.put("recordName", nativeRecord.getName());
			dataModel.put("alignment", nativeRecord.getAlignment());
			dataModel.put("isUnion", nativeRecord.isUnion());

			StringWriter stringWriter = new StringWriter();
			layoutTemplate.process(dataModel, stringWriter);

			layout = stringWriter.toString();
		} catch (Exception e) {
			throw new RuntimeException("Failed to create record layout. ", e);
		}
	}

	private String getMemberLayout(
			NativeRecord.NativeMember nativeMember, GlobalConfig globalConfig, Template template
	) {
		switch (nativeMember) {
			case NativeRecord.Padding padding -> {
				return "MemoryLayout.paddingLayout(" + padding.getSize() + ")";
			}
			case NativeRecord.AnonymousRecord anonymousRecord -> {
				NativeRecordLayoutBuilder layoutBuilder = new NativeRecordLayoutBuilder(
						globalConfig, anonymousRecord.getNativeRecord(), null, template
				);
				return layoutBuilder.getLayout();
			}
			case NativeRecord.NativeField nativeField -> {
				if (nativeField instanceof NativeRecord.UnnamedRecordField unnamedRecordField) {
					String fieldName = unnamedRecordField.getName();
					String recordName = unnamedRecordField.getNativeRecord().getName();
					return recordName + ".LAYOUT.withName(\"" + fieldName + "\")";
				} else {
					return getFieldLayout(nativeField, globalConfig);
				}
			}
		}
	}

	private String getFieldLayout(NativeRecord.NativeField field, GlobalConfig globalConfig) {
		TypeResult typeResult = field.getType();

		NativeTypeKind typeKind = typeResult.typeKind();

		String fieldName = field.getName();

		if (typeResult.typeKind() == NativeTypeKind.RECORD) {
			String layout = GeneratorUtils.getRecordLayout(globalConfig, typeResult);
			return layout + ".withName(\"" + fieldName + "\")";
		} else if (typeKind == NativeTypeKind.ARRAY) {
			return getArrayFieldLayout(fieldName, (ArrayType) typeResult, globalConfig);
		} else if (typeKind != NativeTypeKind.UNKNOWN && typeKind != NativeTypeKind.VOID) {

			if (typeKind.isPointer()) {
				requiredStaticImports.add(FFMUtils.class.getCanonicalName() + ".*");
			} else if (typeKind.isPrimitive()) {
				requiredStaticImports.add(ValueLayout.class.getCanonicalName() + ".*");
			}

			return typeResult.typeKind().getValueLayout() + ".withName(\"" + fieldName + "\")";
		} else {
			throw new RuntimeException("Unsupported field type kind " + typeKind);
		}
	}

	private String getArrayFieldLayout(String fieldName, NativeType.ArrayType arrayType, GlobalConfig globalConfig) {
		TypeResult elementTypeResult = arrayType.elementType();

		NativeTypeKind elementTypeKind = elementTypeResult.typeKind();

		long count = arrayType.elementCount();

		if (count == 0)
			throw new RuntimeException("Zero length array field found. This is currently not supported.");

		if (elementTypeKind == NativeTypeKind.RECORD) {
			String layout = GeneratorUtils.getRecordLayout(globalConfig, elementTypeResult);
			return "MemoryLayout.sequenceLayout(" + count + ", " + layout + ").withName(\"" + fieldName + "\")";
		} else if (elementTypeKind == NativeTypeKind.ARRAY) {
			String layout = getArrayOfArraysLayout((ArrayType) elementTypeResult, globalConfig);
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

	private String getArrayOfArraysLayout(ArrayType arrayType, GlobalConfig globalConfig) {
		TypeResult elementTypeResult = arrayType.elementType();

		NativeTypeKind elementTypeKind = elementTypeResult.typeKind();

		long count = arrayType.elementCount();

		if (count == 0)
			throw new RuntimeException("Zero length array found. This is currently not supported.");

		if (elementTypeKind == NativeTypeKind.RECORD) {
			String layout = GeneratorUtils.getRecordLayout(globalConfig, elementTypeResult);
			return "MemoryLayout.sequenceLayout(" + count + ", " + layout + ")";
		} else if (elementTypeKind == NativeTypeKind.ARRAY) {
			String layout = getArrayOfArraysLayout((ArrayType) elementTypeResult, globalConfig);
			return "MemoryLayout.sequenceLayout(" + count + ", " + layout + ")";
		} else if (elementTypeKind != NativeTypeKind.UNKNOWN && elementTypeKind != NativeTypeKind.VOID) {
			String layout = elementTypeKind.getValueLayout();
			return "MemoryLayout.sequenceLayout(" + count + ", " + layout + ")";
		} else {
			throw new RuntimeException("Unsupported array element type kind " + elementTypeKind);
		}
	}

	public List<String> getRequiredStaticImports() {
		return Collections.unmodifiableList(requiredStaticImports);
	}

	public String getLayout() {
		return layout;
	}

}
