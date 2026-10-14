package volucris.bindings.generator.generation.fields;

import java.util.List;

import volucris.bindings.generator.generation.Modifier;

public class DoubleField extends Field {

	public String value;

	public DoubleField(String name, String value, Modifier... modifiers) {
		super(name, modifiers);

		this.value = value;
	}

	@Override
	public String getType() {
		return "double";
	}

	@Override
	public String getValue() {
		return value;
	}

	@Override
	public List<String> getRequiredImports() {
		return List.of();
	}

	@Override
	public FieldCategory getFieldCategory() {
		return FieldCategory.OTHER_FIELD;
	}

}
