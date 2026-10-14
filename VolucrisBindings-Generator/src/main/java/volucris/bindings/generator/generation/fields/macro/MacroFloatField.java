package volucris.bindings.generator.generation.fields.macro;

import volucris.bindings.generator.generation.Modifier;
import volucris.bindings.generator.generation.fields.FieldCategory;
import volucris.bindings.generator.generation.fields.FloatField;

public class MacroFloatField extends FloatField {

	public MacroFloatField(String name, String value, Modifier... modifiers) {
		super(name, value, modifiers);
	}

	@Override
	public FieldCategory getFieldCategory() {
		return FieldCategory.MACRO_FIELD;
	}

}
