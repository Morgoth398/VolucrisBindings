package volucris.bindings.generator.generation.fields.macro;

import volucris.bindings.generator.generation.Modifier;
import volucris.bindings.generator.generation.fields.FieldCategory;
import volucris.bindings.generator.generation.fields.IntField;

public class MacroIntField extends IntField {

	public MacroIntField(String name, String value, Modifier... modifiers) {
		super(name, value, modifiers);
	}

	@Override
	public FieldCategory getFieldCategory() {
		return FieldCategory.MACRO_FIELD;
	}
	
}
