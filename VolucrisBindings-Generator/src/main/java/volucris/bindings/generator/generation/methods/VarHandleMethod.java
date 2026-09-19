package volucris.bindings.generator.generation.methods;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jspecify.annotations.Nullable;
import freemarker.template.Template;
import volucris.bindings.generator.config.GlobalConfig;
import volucris.bindings.generator.generation.GeneratorUtils;
import volucris.bindings.generator.parsing.NativeFunctionPointer;
import volucris.bindings.generator.parsing.NativeRecord.FunctionPointerField;
import volucris.bindings.generator.parsing.NativeRecord.RecordField;
import volucris.bindings.generator.parsing.NativeType.SimpleType;
import volucris.bindings.generator.parsing.NativeTypeKind;

public class VarHandleMethod extends Method {

	private VarHandleMethod(Template template, Builder builder) {
		super(template, builder.dataModel);

		this.requiredImports.addAll(builder.requiredImports);
	}

	public static abstract class Builder {

		protected final Map<String, Object> dataModel;

		protected final List<String> requiredImports;

		public Builder() {
			this.dataModel = new HashMap<String, Object>();

			this.requiredImports = new ArrayList<String>();
		}

		public Builder setClassName(String className) {
			dataModel.put("className", className);
			return this;
		}

		public Builder setStructFieldName(String fieldName) {
			fieldName = Character.toLowerCase(fieldName.charAt(0)) + fieldName.substring(1);
			dataModel.put("structFieldName", fieldName);
			return this;
		}

		public Builder setVarHandleFieldName(String fieldName) {
			dataModel.put("varHandleFieldName", fieldName);
			return this;
		}

		public Builder setJavadoc(String comment) {
			dataModel.put("javadoc", GeneratorUtils.getJavadoc(comment));
			return this;
		}
		
		public VarHandleMethod build(Template template) {
			return new VarHandleMethod(template, this);
		}
	}

	public static class PrimitiveBuilder extends Builder {

		public PrimitiveBuilder() {
			dataModel.put("isPrimitive", true);
		}

		public PrimitiveBuilder setPrimitiveType(SimpleType simpleType) {
			if (!simpleType.typeKind().isPrimitive())
				throw new RuntimeException("Type is not a primitve type.");

			dataModel.put("primitiveType", NativeTypeKind.getPrimitiveType(simpleType.typeKind()));

			return this;
		}

	}

	public static class PointerBuilder extends Builder {

		public PointerBuilder() {
			requiredImports.add(Nullable.class.getCanonicalName());
		}

		public PointerBuilder setPointerType(GlobalConfig globalConfig, RecordField recordField, SimpleType simpleType, boolean isStructArray) {			
			if (!simpleType.typeKind().isPointer())
				throw new RuntimeException("Type is not a pointer type " + simpleType.typeKind());

			switch (simpleType.typeKind()) {
				case POINTER, VOID_POINTER -> {
					dataModel.put("isRawSegment", true);
					dataModel.put(
							"pointerType", NativeTypeKind.getPointerTypeClass(simpleType.typeKind(), requiredImports)
					);
				}
				case STRING -> {
					dataModel.put("isString", true);
					dataModel.put(
							"pointerType", NativeTypeKind.getPointerTypeClass(simpleType.typeKind(), requiredImports)
					);
				}
				case RECORD_POINTER -> {
					String typeName = GeneratorUtils.transformName(globalConfig, simpleType.typeName(), false);

					dataModel.put("pointerType", typeName);
					dataModel.put("isStructArray", isStructArray);
				}
				case FUNCTION_POINTER -> {
					FunctionPointerField functionPointerField = (FunctionPointerField) recordField;
					
					NativeFunctionPointer functionPointer = functionPointerField.getFunctionPointer();
					
					String typeName = GeneratorUtils.transformName(globalConfig, functionPointer.getName(), false);

					dataModel.put("pointerType", typeName);
					dataModel.put("isFunctionPointer", true);
				}
				default -> {
					dataModel.put(
							"pointerType", NativeTypeKind.getPointerTypeClass(simpleType.typeKind(), requiredImports)
					);
				}
			}
			return this;
		}

	}

	public static class PrimitiveArrayBuilder extends PrimitiveBuilder {
		
		public PrimitiveArrayBuilder() {
			
		}
		
		public PrimitiveBuilder setDepth(int depth) {
			dataModel.put("arrayDepth", depth);
			return this;
		}
		
	}

	public static class PointerArrayBuilder extends PointerBuilder {
		
		public PointerArrayBuilder() {
			
		}
		
		public PointerArrayBuilder setDepth(int depth) {
			dataModel.put("arrayDepth", depth);
			return this;
		}
	}
	
}
