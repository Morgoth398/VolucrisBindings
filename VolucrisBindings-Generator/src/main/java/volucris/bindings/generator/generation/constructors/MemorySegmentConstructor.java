package volucris.bindings.generator.generation.constructors;

import java.lang.foreign.MemorySegment;
import java.util.List;

import org.jspecify.annotations.Nullable;

public class MemorySegmentConstructor extends Constructor {

	public MemorySegmentConstructor(String className, boolean parentHasSegmentConstructor, @Nullable String parentConversionFunction) {
		String source;
		
		if (!parentHasSegmentConstructor) {
			source = 
					"""
					public %s(MemorySegment segment) {
						this.segment = segment;
					}
					""".formatted(className);
		} else {
			if (parentConversionFunction == null) {
				source = 
						"""
						public %s(MemorySegment segment) {
							this.segment = segment;
							super(segment);
						}
						""".formatted(className);
			} else {
				source = 
						"""
						public %s(MemorySegment segment) {
							this.segment = segment;
							super(%s(segment));
						}
						""".formatted(className, parentConversionFunction);
			}
		}
		
		super(source, List.of(MemorySegment.class.getCanonicalName()));
	}

}
