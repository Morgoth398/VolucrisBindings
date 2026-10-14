package volucris.bindings.generator.generation.fields;

import java.lang.invoke.MethodHandle;
import java.util.List;

import volucris.bindings.generator.generation.Modifier;
import volucris.bindings.generator.parsing.AbstractNativeFunction;

public class FunctionField extends Field {

	public FunctionField(AbstractNativeFunction function) {
		String name = function.getName().replaceAll("([\\p{Ll}\\p{Nd}])(\\p{Lu})", "$1_$2").toUpperCase();
		super(name, Modifier.PRIVATE, Modifier.STATIC, Modifier.FINAL);
	}

	@Override
	public String getType() {
		return "LazyConstant<MethodHandle>";
	}

	@Override
	public List<String> getRequiredImports() {
		return List.of(MethodHandle.class.getCanonicalName());
	}

	@Override
	public FieldCategory getFieldCategory() {
		return FieldCategory.FUNCTION_FIELD;
	}

}
