package volucris.bindings.generator.generation.methods;

import java.io.StringWriter;
import java.lang.foreign.ValueLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import freemarker.template.Template;
import volucris.bindings.core.FFMUtils;
import volucris.bindings.generator.config.GlobalConfig;
import volucris.bindings.generator.generation.GeneratorUtils;
import volucris.bindings.generator.generation.fields.FunctionField;
import volucris.bindings.generator.parsing.AbstractNativeFunction;
import volucris.bindings.generator.parsing.NativeFunctionPointer;
import volucris.bindings.generator.parsing.NativeParameter;
import volucris.bindings.generator.parsing.NativeType;
import volucris.bindings.generator.parsing.NativeType.TypeResult;
import volucris.bindings.generator.parsing.NativeTypeKind;

public class FunctionLoadingBuilder {

	private final List<String> parameterValueLayouts;
	private final List<String> requiredStaticImports;

	private final Optional<String> returnTypeValueLayout;

	private final FunctionField functionField;

	private final AbstractNativeFunction nativeFunction;

	public FunctionLoadingBuilder(
			GlobalConfig globalConfig,
			FunctionField functionField,
			AbstractNativeFunction nativeFunction,
			boolean callbackBuilder
	) {
		this.functionField = functionField;
		this.nativeFunction = nativeFunction;

		this.parameterValueLayouts = new ArrayList<String>();
		this.requiredStaticImports = new ArrayList<String>();

		/// If this function loading builder not used in the [CallbackBuilder]
		/// this static imports is always required for the 'downcallHandle*` methods.
		/// For a callback this static import is only required if it contains a pointer
		/// and that is decided in `getParameterValueLayout` and `getReturnTypeValueLayout`.
		if (!callbackBuilder)
			requiredStaticImports.add(FFMUtils.class.getCanonicalName() + ".*");

		this.returnTypeValueLayout = getReturnTypeValueLayout(globalConfig, nativeFunction.getReturnType());

		nativeFunction.getParameters().forEach(parameter -> getParameterValueLayout(globalConfig, parameter));
	}

	private void getParameterValueLayout(GlobalConfig globalConfig, NativeParameter nativeParameter) {
		TypeResult typeResult = nativeParameter.getType();

		NativeTypeKind typeKind = typeResult.typeKind();

		if (typeResult.typeKind() == NativeTypeKind.RECORD) {
			String layout = GeneratorUtils.getRecordLayout(globalConfig, typeResult);
			parameterValueLayouts.add(layout);
		} else if (typeKind != NativeTypeKind.UNKNOWN && typeKind != NativeTypeKind.VOID) {
			if (typeKind.isPointer()) {
				requiredStaticImports.add(FFMUtils.class.getCanonicalName() + ".*");
			} else if (typeKind.isPrimitive()) {
				requiredStaticImports.add(ValueLayout.class.getCanonicalName() + ".*");
			}

			parameterValueLayouts.add(typeKind.getValueLayout());
		} else {
			throw new RuntimeException("Unsupported parameter type kind " + typeKind);
		}
	}

	private Optional<String> getReturnTypeValueLayout(GlobalConfig globalConfig, Optional<NativeType> returnType) {
		if (returnType.isEmpty())
			return Optional.empty();

		TypeResult typeResult = returnType.get().getType();

		NativeTypeKind typeKind = typeResult.typeKind();

		if (typeResult.typeKind() == NativeTypeKind.RECORD) {
			String layout = GeneratorUtils.getRecordLayout(globalConfig, typeResult);
			return Optional.of(layout);
		} else if (typeKind != NativeTypeKind.UNKNOWN && typeKind != NativeTypeKind.VOID) {
			if (typeKind.isPointer()) {
				requiredStaticImports.add(FFMUtils.class.getCanonicalName() + ".*");
			} else if (typeKind.isPrimitive()) {
				requiredStaticImports.add(ValueLayout.class.getCanonicalName() + ".*");
			}

			return Optional.of(typeKind.getValueLayout());
		} else {
			throw new RuntimeException("Unsupported return type kind " + typeKind);
		}
	}

	public String getFunctionLoading(Template template) {
		try {
			Map<String, Object> dataModel = new HashMap<String, Object>();
			dataModel.put("fieldName", functionField.getName());
			dataModel.put("returnType", returnTypeValueLayout.orElse(""));
			dataModel.put("parameters", parameterValueLayouts);
			dataModel.put("functionName", nativeFunction.getName());
			dataModel.put("isFunctionPointer", nativeFunction instanceof NativeFunctionPointer);

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

	public List<String> getParameterValueLayouts() {
		return Collections.unmodifiableList(parameterValueLayouts);
	}

	public Optional<String> getReturnTypeValueLayout() {
		return returnTypeValueLayout;
	}

}
