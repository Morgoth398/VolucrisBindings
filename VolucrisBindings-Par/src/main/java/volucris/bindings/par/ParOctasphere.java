/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.par;

import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.core.NativeIntArray;

import static volucris.bindings.core.FFMUtils.*;

public final class ParOctasphere {

    private static final LazyConstant<MethodHandle> PAR_OCTASPHERE_GET_COUNTS;
    private static final LazyConstant<MethodHandle> PAR_OCTASPHERE_POPULATE;

    static {
        //@formatter:off
        PAR_OCTASPHERE_GET_COUNTS = downcallHandleVoid("par_octasphere_get_counts", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        PAR_OCTASPHERE_POPULATE = downcallHandleVoid("par_octasphere_populate", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        //@formatter:on
    }

    private ParOctasphere() {
    }

    /// ```
    /// Computes the maximum possible number of indices and vertices for the given octasphere config.
    /// ```
    public static void get_counts(
    	MemorySegment config,
    	MemorySegment num_indices,
    	MemorySegment num_vertices
    ) {
    	MethodHandle method = PAR_OCTASPHERE_GET_COUNTS.get();
    	try {
    		 method.invokeExact(
    			config,
    			num_indices,
    			num_vertices
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#get_counts].
    public static void get_counts(
    	ParOctasphereConfig config,
    	NativeIntArray num_indices,
    	NativeIntArray num_vertices
    ) {
    	get_counts(
    		config.memorySegment(),
    		num_indices.memorySegment(),
    		num_vertices.memorySegment()
    	);
    }
    
    /// ```
    /// Populates a pre-allocated mesh structure with indices and vertices.
    /// ```
    public static void populate(
    	MemorySegment config,
    	MemorySegment mesh
    ) {
    	MethodHandle method = PAR_OCTASPHERE_POPULATE.get();
    	try {
    		 method.invokeExact(
    			config,
    			mesh
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#populate].
    public static void populate(
    	ParOctasphereConfig config,
    	ParOctasphereMesh mesh
    ) {
    	populate(
    		config.memorySegment(),
    		mesh.memorySegment()
    	);
    }
    
}