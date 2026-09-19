package volucris.bindings.generator.generation.fields;

import java.lang.invoke.VarHandle;
import java.util.List;

import volucris.bindings.generator.generation.Modifier;

public class VarHandleField extends Field {

	public VarHandleField(String structFieldName) {
		String varHandleFieldName = String.join(
				"",
				structFieldName.replaceAll("([\\p{Ll}\\p{Nd}])(\\p{Lu})", "$1_$2").toUpperCase(),
				"_HANDLE"
		);
		super(varHandleFieldName, Modifier.PUBLIC, Modifier.STATIC, Modifier.FINAL);
	}

	@Override
	public String getType() {
		return "VarHandle";
	}

	@Override
	public List<String> getRequiredImports() {
		return List.of(VarHandle.class.getCanonicalName());
	}

}
