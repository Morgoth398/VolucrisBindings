package volucris.bindings.generator.generation.fields;

import java.util.List;

import volucris.bindings.generator.generation.Modifier;

public class FloatField extends Field {

	private String value;

	private boolean isNumeric;

	public FloatField(String name, String value, Modifier... modifiers) {
		super(name, modifiers);

		this.value = value;
		this.isNumeric = name.chars().allMatch(Character::isDigit);
	}

	@Override
	public String getType() {
		return "float";
	}

	@Override
	public String getValue() {
		return value.isEmpty() || !isNumeric ? value : value + "f";
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
