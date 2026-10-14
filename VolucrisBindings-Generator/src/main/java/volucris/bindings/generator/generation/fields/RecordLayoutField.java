package volucris.bindings.generator.generation.fields;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.foreign.UnionLayout;
import java.util.List;

import volucris.bindings.generator.generation.Modifier;

public class RecordLayoutField extends Field {

	private final boolean isUnion;

	public RecordLayoutField(boolean isUnion) {
		super("LAYOUT", Modifier.PUBLIC, Modifier.STATIC, Modifier.FINAL);

		this.isUnion = isUnion;
	}

	@Override
	public String getType() {
		return !isUnion ? "StructLayout" : "UnionLayout";
	}

	@Override
	public List<String> getRequiredImports() {
		return List.of(
				isUnion ? UnionLayout.class.getCanonicalName() : StructLayout.class.getCanonicalName(),
				MemoryLayout.class.getCanonicalName()
		);
	}

	@Override
	public FieldCategory getFieldCategory() {
		return FieldCategory.RECORD_LAYOUT_FIELD;
	}
	
}
