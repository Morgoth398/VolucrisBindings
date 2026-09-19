package volucris.bindings.generator.generation.methods;

import java.lang.foreign.Arena;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.jspecify.annotations.Nullable;
import freemarker.template.Template;
import volucris.bindings.generator.config.GlobalConfig;
import volucris.bindings.generator.config.ClassConfig.NativeFunctionDescription;
import volucris.bindings.generator.generation.GeneratorUtils;
import volucris.bindings.generator.generation.constructors.Constructor;
import volucris.bindings.generator.generation.fields.FunctionField;
import volucris.bindings.generator.generation.methods.NativeFunctionMethod.ReturnTypeInfo;
import volucris.bindings.generator.parsing.AbstractNativeFunction;
import volucris.bindings.generator.parsing.NativeType;
import volucris.bindings.generator.parsing.NativeTypeKind;

public class NativeFunctionMethodsBuilder {

	private final GlobalConfig globalConfig;

	private final FunctionField field;

	private final AbstractNativeFunction nativeFunction;

	private final NativeFunctionDescription functionDescription;

	private final String methodName;
	private final String rawMethodName;

	private final boolean specifiedAsConstructor;
	private final boolean addTypeMethod;

	public NativeFunctionMethodsBuilder(
			GlobalConfig globalConfig,
			FunctionField field,
			AbstractNativeFunction nativeFunction,
			NativeFunctionDescription functionDescription,
			boolean specifiedAsConstructor
	) {
		this.globalConfig = globalConfig;
		this.field = field;
		this.nativeFunction = nativeFunction;
		this.functionDescription = functionDescription;
		this.specifiedAsConstructor = specifiedAsConstructor;

		this.methodName = GeneratorUtils.stripPrefixesAndPostfixes(globalConfig, nativeFunction.getName(), true);

		boolean onlyPrimitiveOrRawSegmentParameters = nativeFunction.getParameters().stream().allMatch(parameter -> {
			boolean check1 = NativeTypeKind.isRawSegment(parameter.getType().typeKind());
			boolean check2 = parameter.getType().typeKind().isPrimitive();
			return check1 || check2;
		});

		Optional<NativeType> returnType = nativeFunction.getReturnType();

		boolean hasReturnType = returnType.isPresent();
		boolean primitiveOrRawSegmentReturnType = hasPrimitiveOrRawSegmentReturnType(returnType);

		int parametersCount = nativeFunction.getParameters().size();

		if (specifiedAsConstructor) {
			addTypeMethod = false;
		} else if (!functionDescription.getAddTypedMethod()) {
			addTypeMethod = false;
		} else if (onlyPrimitiveOrRawSegmentParameters && (!hasReturnType || primitiveOrRawSegmentReturnType)) {
			addTypeMethod = false;
		} else if (parametersCount == 0 && !hasReturnType) {
			addTypeMethod = false;
		} else {
			addTypeMethod = true;
		}

		if (addTypeMethod && (onlyPrimitiveOrRawSegmentParameters || parametersCount == 0)) {
			rawMethodName = "n" + methodName;
		} else {
			rawMethodName = methodName;
		}
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

	public List<Method> getMethods(Template rawMethodTemplate, Template typedMethodTemplate) {
		List<Method> methods = new ArrayList<Method>();

		NativeFunctionMethod.Builder functionMethodBuilder = new NativeFunctionMethod.Builder(
				rawMethodName, methodName, field, nativeFunction, functionDescription, globalConfig
		);
		
		functionMethodBuilder.setJavadoc(getRawMethodJavadoc(nativeFunction.getComment()));
		
		methods.add(functionMethodBuilder.build(rawMethodTemplate, true));
		
		if (!addTypeMethod)
			return Collections.unmodifiableList(methods);

		functionMethodBuilder.setJavadoc(getTypedMethodJavadoc(rawMethodName));
		
		methods.add(functionMethodBuilder.build(typedMethodTemplate, false));

		return Collections.unmodifiableList(methods);
	}

	private @Nullable String getRawMethodJavadoc(String nativeComment) {
		if (nativeComment == null)
			return null;

		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("/// ```\n");
		nativeComment.lines().forEach(line -> {
			stringBuilder.append("/// ").append(line).append("\n");
		});
		stringBuilder.append("/// ```");

		return stringBuilder.toString();
	}
	
	private String getTypedMethodJavadoc(String rawMethodName) {
		StringBuilder stringBuilder = new StringBuilder();

		stringBuilder.append("/// Typed method of [#").append(rawMethodName).append("].");

		return stringBuilder.toString();
	}
	
	public Constructor asConstructor(
			String className, String destructorFunctionName, Template template, boolean parentSegmentConstructor
	) {
		if (!specifiedAsConstructor)
			throw new RuntimeException("Function was not specified to be called in a cosntructor.");
		if (nativeFunction.getReturnType().isEmpty())
			throw new RuntimeException("A function called in a constructor needs a return type.");

		NativeFunctionMethod.Builder functionMethodBuilder = new NativeFunctionMethod.Builder(
				rawMethodName, className, field, nativeFunction, functionDescription, globalConfig
		);
		functionMethodBuilder.setJavadoc(getTypedMethodJavadoc(rawMethodName));
		
		ReturnTypeInfo returnTypeInfo = functionMethodBuilder.getReturnTypeInfo();

		if (!returnTypeInfo.isPointer() && !returnTypeInfo.isRawSegment() && !returnTypeInfo.isStructArray()) {
			String m1 = "Function" + nativeFunction.getName();
			String m2 = " is not valid for a constructor call. The function must return a pointer.";
			throw new RuntimeException(m1 + m2);
		}

		String destructorMethodName = GeneratorUtils.stripPrefixesAndPostfixes(
				globalConfig, destructorFunctionName, true
		);

		Method method = functionMethodBuilder.build(
				template, Map.of("destructor", destructorMethodName, "parentConstructorCall", parentSegmentConstructor), false
		);

		List<String> requiredImports = new ArrayList<>(method.getRequiredImports());
		requiredImports.add(Arena.class.getCanonicalName());

		if (!functionMethodBuilder.hasNullableParameters())
			requiredImports.remove(Nullable.class.getCanonicalName());

		return new Constructor(method.getSource2(), requiredImports);
	}

}
