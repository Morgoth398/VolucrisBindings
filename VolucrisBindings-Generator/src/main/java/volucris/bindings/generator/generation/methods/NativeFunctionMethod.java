package volucris.bindings.generator.generation.methods;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import org.jspecify.annotations.Nullable;
import freemarker.template.Template;
import volucris.bindings.core.MemoryStack;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.generator.config.ClassConfig.NativeFunctionDescription;
import volucris.bindings.generator.config.GlobalConfig;
import volucris.bindings.generator.generation.GeneratorUtils;
import volucris.bindings.generator.generation.Modifier;
import volucris.bindings.generator.generation.fields.FunctionField;
import volucris.bindings.generator.parsing.AbstractNativeFunction;
import volucris.bindings.generator.parsing.NativeParameter;
import volucris.bindings.generator.parsing.NativeType;
import volucris.bindings.generator.parsing.NativeType.SimpleType;
import volucris.bindings.generator.parsing.NativeType.TypeResult;
import volucris.bindings.generator.parsing.NativeTypeKind;

public class NativeFunctionMethod extends Method {

	private NativeFunctionMethod(Template template, Builder builder, boolean rawMethod) {
		super(template, builder.dataModel);

		if (rawMethod)
			requiredImports.addAll(builder.rawMethodRequiredImports);
		else
			requiredImports.addAll(builder.typedMethodRequiredImports);
	}

	public static class Builder {

		private final Map<String, Object> dataModel;

		private final List<ParameterInfo> parameterInfos;

		private final Set<String> rawMethodRequiredImports;
		private final Set<String> typedMethodRequiredImports;

		private ReturnTypeInfo returnTypeInfo;

		public Builder(
				String rawMethodName,
				String methodName,
				@Nullable FunctionField functionField,
				AbstractNativeFunction nativeFunction,
				NativeFunctionDescription functionDescription,
				GlobalConfig globalConfig
		) {
			this.dataModel = new HashMap<String, Object>();

			if (functionField != null)
				this.dataModel.put("fieldName", functionField.getName());

			this.dataModel.put("rawMethodName", rawMethodName);
			this.dataModel.put("methodName", methodName);
			this.dataModel.put("modifiers", getModifiers(functionDescription));

			this.parameterInfos = new ArrayList<ParameterInfo>();
			this.typedMethodRequiredImports = new HashSet<String>();
			this.rawMethodRequiredImports = new HashSet<String>();

			Optional<NativeType> returnType = nativeFunction.getReturnType();

			if (returnType.isPresent()) {
				returnTypeInfo = getReturnTypeInfo(returnType.get(), functionDescription, globalConfig);

				if (returnTypeInfo.isRecord()) {
					parameterInfos.add(
							new ParameterInfo(
									"allocator",
									SegmentAllocator.class.getSimpleName(),
									false,
									false,
									false,
									false,
									false,
									false,
									false,
									false,
									false
							)
					);
				}

				dataModel.put("returnType", returnTypeInfo);
			}

			nativeFunction.getParameters().forEach(parameter -> {
				ParameterInfo info = getParameterInfo(parameter, functionDescription, globalConfig);
				parameterInfos.add(info);
			});

			if (parameterInfos.stream().filter(ParameterInfo::isInstance).count() > 1) {
				throw new RuntimeException(
						"Function " + nativeFunction.getName() + " has more than one instance parameter."
				);
			}
		}

		private ParameterInfo getParameterInfo(
				NativeParameter nativeParameter,
				NativeFunctionDescription functionDescription,
				GlobalConfig globalConfig
		) {
			String parameterName = nativeParameter.getName();

			if (parameterName.equals("segment"))
				parameterName = "paramSegment";

			TypeResult type = nativeParameter.getType();

			NativeTypeKind typeKind = type.typeKind();

			if (typeKind == NativeTypeKind.UNKNOWN || typeKind == NativeTypeKind.VOID)
				throw new RuntimeException("Invalid parameter type kind " + typeKind + "for " + parameterName);

			boolean isPointer = typeKind.isPointer();
			boolean isPrimitive = typeKind.isPrimitive();
			boolean isNullable = functionDescription.getNullableParameters().contains(parameterName);

			boolean isInstanceCheck1 = parameterName.equals(functionDescription.getInstanceParameter());
			boolean isInstanceCheck2 = functionDescription.getAdditionalInstanceParameters().contains(parameterName);
			boolean isInstance = isInstanceCheck1 || isInstanceCheck2;

			if (isNullable)
				typedMethodRequiredImports.add(Nullable.class.getCanonicalName());

			boolean isString = false;
			boolean isRecord = false;
			boolean isRawSegment = false;
			boolean isStructArray = false;
			boolean isFunctionPointer = false;

			String typeName;

			if (isPrimitive) {
				typeName = NativeTypeKind.getPrimitiveType(typeKind);
			} else if (isPointer) {
				rawMethodRequiredImports.add(MemorySegment.class.getCanonicalName());

				boolean declaredAsString = functionDescription.getStringParameters().contains(parameterName);
				boolean declaredAsStructArray = functionDescription.getStructArrays().contains(parameterName);

				if (type.typeKind() == NativeTypeKind.BYTE_POINTER && declaredAsString) {
					type = new SimpleType(NativeTypeKind.STRING, type.typeName());

					typeKind = type.typeKind();

					isString = true;

					typedMethodRequiredImports.add(Arena.class.getCanonicalName());
					typedMethodRequiredImports.add(MemoryStack.class.getCanonicalName());
				}

				if (NativeTypeKind.isRawSegment(typeKind)) {
					typedMethodRequiredImports.add(MemorySegment.class.getCanonicalName());

					isRawSegment = true;
					typeName = NativeTypeKind.getPointerTypeClass(typeKind, typedMethodRequiredImports);
				} else if (typeKind == NativeTypeKind.RECORD_POINTER) {
					isStructArray = declaredAsStructArray;

					if (declaredAsStructArray)
						typedMethodRequiredImports.add(NativeStructArray.class.getCanonicalName());

					typeName = GeneratorUtils.transformName(globalConfig, type.typeName(), false);
				} else if (typeKind == NativeTypeKind.FUNCTION_POINTER) {
					isFunctionPointer = true;

					typeName = GeneratorUtils.transformName(globalConfig, type.typeName(), false);
				} else {
					typeName = NativeTypeKind.getPointerTypeClass(typeKind, typedMethodRequiredImports);
				}
			} else if (type.typeKind() == NativeTypeKind.RECORD) {
				isRecord = true;

				typeName = GeneratorUtils.transformName(globalConfig, type.typeName(), false);
			} else {
				throw new RuntimeException("Unsupported parameter type kind " + typeKind);
			}

			return new ParameterInfo(
					parameterName,
					typeName,
					isString,
					isRecord,
					isPointer,
					isNullable,
					isPrimitive,
					isRawSegment,
					isStructArray,
					isFunctionPointer,
					isInstance
			);
		}

		private ReturnTypeInfo getReturnTypeInfo(
				NativeType returnType,
				NativeFunctionDescription functionDescription,
				GlobalConfig globalConfig
		) {
			TypeResult type = returnType.getType();

			NativeTypeKind typeKind = type.typeKind();

			if (typeKind == NativeTypeKind.UNKNOWN || typeKind == NativeTypeKind.VOID)
				throw new RuntimeException("Invalid return type kind " + typeKind);

			boolean isPointer = typeKind.isPointer();
			boolean isPrimitive = typeKind.isPrimitive();

			boolean isString = false;
			boolean isRecord = false;
			boolean isRawSegment = false;
			boolean isStructArray = false;
			boolean isFunctionPointer = false;

			String typeName;

			if (isPrimitive) {
				typeName = NativeTypeKind.getPrimitiveType(typeKind);
			} else if (isPointer) {
				typedMethodRequiredImports.add(Nullable.class.getCanonicalName());
				rawMethodRequiredImports.add(MemorySegment.class.getCanonicalName());

				boolean declaredAsString = functionDescription.stringReturnType();
				boolean declaredAsStructArray = functionDescription.returnTypeIsStructArray();

				if (type.typeKind() == NativeTypeKind.BYTE_POINTER && declaredAsString) {
					type = new SimpleType(NativeTypeKind.STRING, type.typeName());

					typeKind = type.typeKind();

					isString = true;
				}

				if (NativeTypeKind.isRawSegment(typeKind)) {
					typedMethodRequiredImports.add(MemorySegment.class.getCanonicalName());

					isRawSegment = true;
					typeName = NativeTypeKind.getPointerTypeClass(typeKind, typedMethodRequiredImports);
				} else if (typeKind == NativeTypeKind.RECORD_POINTER) {
					isStructArray = declaredAsStructArray;

					typeName = GeneratorUtils.transformName(globalConfig, type.typeName(), false);
				} else if (typeKind == NativeTypeKind.FUNCTION_POINTER) {
					isFunctionPointer = true;

					typeName = GeneratorUtils.transformName(globalConfig, type.typeName(), false);
				} else {
					typeName = NativeTypeKind.getPointerTypeClass(typeKind, typedMethodRequiredImports);
				}

				if (isRawSegment && !isPrimitive)
					typedMethodRequiredImports.add(Nullable.class.getCanonicalName());
			} else if (type.typeKind() == NativeTypeKind.RECORD) {
				typedMethodRequiredImports.add(MemorySegment.class.getCanonicalName());
				typedMethodRequiredImports.add(SegmentAllocator.class.getCanonicalName());
				typedMethodRequiredImports.add(Nullable.class.getCanonicalName());

				isRecord = true;

				typeName = GeneratorUtils.transformName(globalConfig, type.typeName(), false);
			} else {
				throw new RuntimeException("Return type kind is not supproted " + typeKind);
			}

			return new ReturnTypeInfo(
					typeName, isString, isRecord, isPointer, isPrimitive, isRawSegment, isStructArray, isFunctionPointer
			);
		}

		private Modifier[] getModifiers(NativeFunctionDescription functionDescription) {
			if (!functionDescription.isStatic()) {
				if (functionDescription.isFinal()) {
					return new Modifier[] { Modifier.PUBLIC, Modifier.FINAL };
				} else {
					return new Modifier[] { Modifier.PUBLIC };
				}
			} else {
				return new Modifier[] { Modifier.PUBLIC, Modifier.STATIC };
			}
		}

		public Builder setJavadoc(String javadoc) {
			this.dataModel.put("javadoc", javadoc);
			return this;
		}

		public NativeFunctionMethod build(Template template, boolean rawMethod) {
			dataModel.put("parameters", parameterInfos);
			return new NativeFunctionMethod(template, this, rawMethod);
		}

		public NativeFunctionMethod build(Template template, @Nullable Map<String, Object> additionalData, boolean rawMethod) {
			dataModel.put("parameters", parameterInfos);

			if (additionalData != null)
				dataModel.putAll(additionalData);

			return new NativeFunctionMethod(template, this, rawMethod);
		}

		public @Nullable ReturnTypeInfo getReturnTypeInfo() {
			return returnTypeInfo;
		}

		public List<ParameterInfo> getParameterInfos() {
			return Collections.unmodifiableList(parameterInfos);
		}

		public Set<String> getTypedMethodRequiredImports() {
			return Collections.unmodifiableSet(typedMethodRequiredImports);
		}

		public Set<String> getRawMethodRequiredImports() {
			return Collections.unmodifiableSet(rawMethodRequiredImports);
		}
		
		public boolean hasNullableParameters() {
			return parameterInfos.stream().anyMatch(ParameterInfo::isNullable);
		}

	}

	public static record ParameterInfo(
			String name,
			String type,
			boolean isString,
			boolean isRecord,
			boolean isPointer,
			boolean isNullable,
			boolean isPrimitive,
			boolean isRawSegment,
			boolean isStructArray,
			boolean isFunctionPointer,
			boolean isInstance
	) {

	}

	public static record ReturnTypeInfo(
			String type,
			boolean isString,
			boolean isRecord,
			boolean isPointer,
			boolean isPrimitive,
			boolean isRawSegment,
			boolean isStructArray,
			boolean isFunctionPointer
	) {

	}

}
