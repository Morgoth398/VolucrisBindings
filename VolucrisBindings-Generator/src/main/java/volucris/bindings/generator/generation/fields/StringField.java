package volucris.bindings.generator.generation.fields;

import java.util.List;

import volucris.bindings.generator.generation.Modifier;

public class StringField extends Field {

	public String value;

	public StringField(String name, String value, Modifier... modifiers) {
		super(name, modifiers);
		
		this.value = value.replace("\"", "");
	}

	@Override
	public String getType() {
		return "String";
	}

	@Override
	public String getValue() {
		return "\"" + value + "\"";
	}

	@Override
	public List<String> getRequiredImports() {
		return List.of();
	}

}
