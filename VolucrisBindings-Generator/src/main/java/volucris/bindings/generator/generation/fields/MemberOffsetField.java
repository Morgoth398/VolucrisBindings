package volucris.bindings.generator.generation.fields;

import java.lang.foreign.ValueLayout;
import java.util.List;

import volucris.bindings.generator.generation.Modifier;

public class MemberOffsetField extends LongField {

	public MemberOffsetField(String memberName) {
		String fieldName = String.join(
				"",
				memberName.replaceAll("([\\p{Ll}\\p{Nd}])(\\p{Lu})", "$1_$2").toUpperCase(),
				"_BYTE_OFFSET"
		);
		super(fieldName, "", Modifier.PUBLIC, Modifier.STATIC, Modifier.FINAL);
	}

	@Override
	public List<String> getRequiredStaticImports() {
		return List.of(ValueLayout.class.getCanonicalName() + ".*");
	}
	
	@Override
	public FieldCategory getFieldCategory() {
		return FieldCategory.MEMBER_OFFSET_FIELD;
	}
	
}