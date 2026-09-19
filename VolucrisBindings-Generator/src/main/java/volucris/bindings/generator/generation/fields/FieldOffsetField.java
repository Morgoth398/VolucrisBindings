package volucris.bindings.generator.generation.fields;

import volucris.bindings.generator.generation.Modifier;

public class FieldOffsetField extends LongField {

	public FieldOffsetField(String name) {
		name = name.replaceAll("([\\p{Ll}\\p{Nd}])(\\p{Lu})", "$1_$2").toUpperCase() + "_BYTE_OFFSET";
		super(name, "", Modifier.PUBLIC, Modifier.STATIC, Modifier.FINAL);
	}
	
}
