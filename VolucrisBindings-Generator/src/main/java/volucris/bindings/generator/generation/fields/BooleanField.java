package volucris.bindings.generator.generation.fields;

import java.util.List;

import volucris.bindings.generator.generation.Modifier;

public class BooleanField extends Field {

	public String value;

	public BooleanField(String name, String value, Modifier... modifiers) {
		super(name, modifiers);
		
		this.value = value;
	}

	@Override
	public String getType() {
		return "boolean";
	}

	@Override
	public String getValue() {
		return value;
	}

	@Override
	public List<String> getRequiredImports() {
		return List.of();
	}

}
