package volucris.bindings.generator.generation.methods;

import java.util.List;

public class MemorySegmentMethod extends Method {

	public MemorySegmentMethod() {
		String source =
				"""
				public MemorySegment memorySegment() {
					return segment;
				}
				""";
		
		super(source, List.of());
	}
	
}
