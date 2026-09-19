package volucris.bindings.generator.generation;

import java.io.StringWriter;
import java.lang.foreign.Arena;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.Linker;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import org.jspecify.annotations.Nullable;
import freemarker.template.Template;
import volucris.bindings.generator.config.GlobalConfig;
import volucris.bindings.generator.generation.methods.FunctionLoadingBuilder;
import volucris.bindings.generator.generation.methods.NativeFunctionMethod;
import volucris.bindings.generator.generation.methods.NativeFunctionMethod.ReturnTypeInfo;
import volucris.bindings.core.MemoryStack;
import volucris.bindings.generator.config.CallbacksConfig.CallbackConfig;
import volucris.bindings.generator.parsing.NativeFunctionPointer;
import volucris.bindings.generator.parsing.NativeType;
import volucris.bindings.generator.parsing.NativeTypeKind;

public class CallbackBuilder {

	private final GlobalConfig globalConfig;

	private final CallbackConfig callbackConfig;

	private final NativeFunctionMethod.Builder nativeFunctionBuilder;

	private final FunctionLoadingBuilder functionLoadingBuilder;

	private final String javadoc;

	private final boolean addTypeMethod;

	public CallbackBuilder(
			GlobalConfig globalConfig, CallbackConfig callbackConfig, NativeFunctionPointer nativeFunction
	) {
		this.globalConfig = globalConfig;
		this.callbackConfig = callbackConfig;
		this.nativeFunctionBuilder = new NativeFunctionMethod.Builder(
				"invoke", "invoke", null, nativeFunction, callbackConfig.asNativeFunctionDescription(), globalConfig
		);
		this.functionLoadingBuilder = new FunctionLoadingBuilder(globalConfig, null, nativeFunction, true);

		boolean onlyPrimitiveOrRawSegmentParameters = nativeFunction.getParameters().stream().allMatch(parameter -> {
			boolean check1 = NativeTypeKind.isRawSegment(parameter.getType().typeKind());
			boolean check2 = parameter.getType().typeKind().isPrimitive();
			return check1 || check2;
		});

		Optional<NativeType> returnType = nativeFunction.getReturnType();

		boolean hasReturnType = returnType.isPresent();
		boolean primitiveOrRawSegmentReturnType = hasPrimitiveOrRawSegmentReturnType(returnType);

		int parametersCount = nativeFunction.getParameters().size();

		if (onlyPrimitiveOrRawSegmentParameters && (!hasReturnType || primitiveOrRawSegmentReturnType)) {
			addTypeMethod = false;
		} else if (parametersCount == 0 && !hasReturnType) {
			addTypeMethod = false;
		} else if (!callbackConfig.addTypedMethod()) {
			addTypeMethod = false;
		} else {
			addTypeMethod = true;
		}

		this.javadoc = GeneratorUtils.getJavadoc(nativeFunction.getComment());
	}

	private boolean hasPrimitiveOrRawSegmentReturnType(Optional<NativeType> returnType) {

		if (returnType.isEmpty())
			return false;

		NativeType nativeType = returnType.get();

		boolean check1 = nativeType.getType().typeKind() == NativeTypeKind.POINTER;
		boolean check2 = nativeType.getType().typeKind() == NativeTypeKind.VOID_POINTER;
		boolean check3 = nativeType.getType().typeKind() == NativeTypeKind.ARRAY;
		boolean check4 = nativeType.getType().typeKind().isPrimitive();
		return check1 || check2 || check3 || check4;
	}

	public Map<String, Object> getDataModel() {
		ReturnTypeInfo returnTypeInfo = nativeFunctionBuilder.getReturnTypeInfo();
		
		boolean recordReturnType = returnTypeInfo != null &&  returnTypeInfo.isRecord();

		Set<String> imports = new HashSet<String>();
		imports.add(Nullable.class.getCanonicalName());
		imports.add(MemorySegment.class.getCanonicalName());
		imports.add(Arena.class.getCanonicalName());
		imports.add(Linker.class.getCanonicalName());
		imports.add(FunctionDescriptor.class.getCanonicalName());
		imports.add(WeakReference.class.getCanonicalName());
		imports.add(MethodHandle.class.getCanonicalName());
		imports.add(MethodHandles.class.getCanonicalName());
		imports.add(Map.class.getCanonicalName());
		imports.add(HashMap.class.getCanonicalName());

		if (callbackConfig.addTypedMethod())
			imports.addAll(nativeFunctionBuilder.getTypedMethodRequiredImports());

		if (recordReturnType)
			imports.remove(SegmentAllocator.class.getCanonicalName());
		imports.remove(MemoryStack.class.getCanonicalName());
		
		imports.addAll(nativeFunctionBuilder.getRawMethodRequiredImports());
		imports.addAll(callbackConfig.getImports());

		Set<String> staticImports = new HashSet<String>();
		staticImports.addAll(functionLoadingBuilder.getRequiredStaticImports());
		staticImports.addAll(callbackConfig.getStaticImports());

		Map<String, Object> dataModel = new HashMap<String, Object>();
		dataModel.put(
				"parameters",
				nativeFunctionBuilder.getParameterInfos().stream()
						.filter(info -> !info.type().equals(SegmentAllocator.class.getSimpleName())).toList()
		);
		dataModel.put("returnType", nativeFunctionBuilder.getReturnTypeInfo());
		dataModel.put("valueLayouts", functionLoadingBuilder.getParameterValueLayouts());
		dataModel.put("returnTypeLayout", functionLoadingBuilder.getReturnTypeValueLayout().orElse(null));
		dataModel.put("imports", imports.stream().sorted(String::compareTo).toList());
		dataModel.put("staticImports", staticImports.stream().sorted(String::compareTo).toList());
		dataModel.put("packageName", callbackConfig.getPackageName());
		dataModel.put("addTypedMethod", addTypeMethod);
		dataModel.put("javadoc", javadoc);

		return dataModel;
	}

	public String build(Template template) {
		try {
			Map<String, Object> dataModel = getDataModel();

			String className = GeneratorUtils.transformName(globalConfig, callbackConfig.getName(), false);

			dataModel.put("className", className);

			StringWriter stringWriter = new StringWriter();
			template.process(dataModel, stringWriter);

			return stringWriter.toString();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
