package volucris.bindings.generator.generation.methods;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.util.List;

import volucris.bindings.generator.config.GlobalConfig;
import volucris.bindings.generator.generation.GeneratorUtils;

public class CleanupFunctionMethod extends Method {

	public CleanupFunctionMethod(String cleanupFunction, GlobalConfig globalConfig) {

		String source = 
				"""
				/// Attaches a cleanup function to the [MemorySegment].
				///
				/// This method must only ever be called once. A second call throws
				/// an [IllegalStateException] if the segment is no longer global-scoped.
				///
				/// If the object was created explicitly with a constructor call,
				/// this method must not be called again as the constructor calls
				/// it automatically.
				public void attachCleanupFunction(Arena arena) {
					 if (!segment.scope().equals(Arena.global().scope()))
					 	throw new IllegalStateException("Segment is already scoped, cleanup may already be attached.");
				
					segment = segment.reinterpret(arena, s -> %s(s));
				}
				""".formatted(GeneratorUtils.transformName(globalConfig, cleanupFunction, true));
		
		super(source, List.of(Arena.class.getCanonicalName(), MemorySegment.class.getCanonicalName()));
	}

}
