package volucris.bindings.generator.generation.fields;

import java.util.List;

import volucris.bindings.generator.generation.Modifier;

public class LongField extends Field {

	public String value;

	public LongField(String name, String value, Modifier... modifiers) {
		super(name, modifiers);
		
		this.value = value;
	}

	@Override
	public String getType() {
		return "long";
	}

	@Override
	public String getValue() {		
		return value.isEmpty() ? value : value + "L";
	}

	@Override
	public List<String> getRequiredImports() {
		return List.of();
	}

}
