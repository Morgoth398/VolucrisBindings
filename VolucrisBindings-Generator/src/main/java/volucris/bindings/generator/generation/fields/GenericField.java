package volucris.bindings.generator.generation.fields;

import java.util.List;

import volucris.bindings.generator.generation.Modifier;

public class GenericField extends Field {

	private final String type;

	public GenericField(String name, String type, Modifier... modifiers) {
		super(name, modifiers);

		this.type = type;
	}

	@Override
	public String getType() {
		return type;
	}

	@Override
	public List<String> getRequiredImports() {
		return List.of();
	}

}
