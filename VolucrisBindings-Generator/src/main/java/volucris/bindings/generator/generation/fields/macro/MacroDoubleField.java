package volucris.bindings.generator.generation.fields.macro;

import volucris.bindings.generator.generation.Modifier;
import volucris.bindings.generator.generation.fields.DoubleField;
import volucris.bindings.generator.generation.fields.FieldCategory;

public class MacroDoubleField extends DoubleField {

	public MacroDoubleField(String name, String value, Modifier... modifiers) {
		super(name, value, modifiers);
	}

	@Override
	public FieldCategory getFieldCategory() {
		return FieldCategory.MACRO_FIELD;
	}

}
