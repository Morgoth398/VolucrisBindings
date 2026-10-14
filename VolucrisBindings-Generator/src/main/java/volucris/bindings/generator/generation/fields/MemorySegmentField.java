package volucris.bindings.generator.generation.fields;

import java.lang.foreign.MemorySegment;
import java.util.List;

import volucris.bindings.generator.generation.Modifier;

public class MemorySegmentField extends Field {

	public MemorySegmentField(Modifier... modifiers) {
		super("segment", modifiers);
	}

	@Override
	public String getType() {
		return "MemorySegment";
	}
	
	@Override
	public List<String> getRequiredImports() {
		return List.of(MemorySegment.class.getCanonicalName());
	}
	
	@Override
	public FieldCategory getFieldCategory() {
		return FieldCategory.MEMORY_SEGMENT_FIELD;
	}
	
}
