package volucris.bindings.generator.generation.constructors;

import java.lang.foreign.MemorySegment;
import java.util.List;

public class MemorySegmentConstructor extends Constructor {

	public MemorySegmentConstructor(String className, boolean parentHasSegmentConstructor) {
		String source;
		
		if (!parentHasSegmentConstructor) {
			source = 
					"""
					public %s(MemorySegment segment) {
						this.segment = segment;
					}
					""".formatted(className);
		} else {
			source = 
					"""
					public %s(MemorySegment segment) {
						this.segment = segment;
						super(segment);
					}
					""".formatted(className);
		}
		
		super(source, List.of(MemorySegment.class.getCanonicalName()));
	}

}
