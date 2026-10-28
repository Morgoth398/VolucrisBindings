/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.rpmalloc;

import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativePointerArray;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class Rpmalloc {

	private static final LazyConstant<MethodHandle> RPMALLOC_INITIALIZE;
	private static final LazyConstant<MethodHandle> RPMALLOC_INITIALIZE_CONFIG;
	private static final LazyConstant<MethodHandle> RPMALLOC_CONFIG;
	private static final LazyConstant<MethodHandle> RPMALLOC_FINALIZE;
	private static final LazyConstant<MethodHandle> RPMALLOC_THREAD_INITIALIZE;
	private static final LazyConstant<MethodHandle> RPMALLOC_THREAD_FINALIZE;
	private static final LazyConstant<MethodHandle> RPMALLOC_THREAD_COLLECT;
	private static final LazyConstant<MethodHandle> RPMALLOC_IS_THREAD_INITIALIZED;
	private static final LazyConstant<MethodHandle> RPMALLOC_THREAD_STATISTICS;
	private static final LazyConstant<MethodHandle> RPMALLOC_GLOBAL_STATISTICS;
	private static final LazyConstant<MethodHandle> RPMALLOC_DUMP_STATISTICS;
	private static final LazyConstant<MethodHandle> RPMALLOC;
	private static final LazyConstant<MethodHandle> RPZALLOC;
	private static final LazyConstant<MethodHandle> RPCALLOC;
	private static final LazyConstant<MethodHandle> RPREALLOC;
	private static final LazyConstant<MethodHandle> RPALIGNED_REALLOC;
	private static final LazyConstant<MethodHandle> RPALIGNED_ALLOC;
	private static final LazyConstant<MethodHandle> RPALIGNED_ZALLOC;
	private static final LazyConstant<MethodHandle> RPALIGNED_CALLOC;
	private static final LazyConstant<MethodHandle> RPMEMALIGN;
	private static final LazyConstant<MethodHandle> RPPOSIX_MEMALIGN;
	private static final LazyConstant<MethodHandle> RPFREE;
	private static final LazyConstant<MethodHandle> RPMALLOC_USABLE_SIZE;
	private static final LazyConstant<MethodHandle> RPMALLOC_LINKER_REFERENCE;

	static {
		//@formatter:off
		RPMALLOC_INITIALIZE = downcallHandle("rpmalloc_initialize", JAVA_INT, UNBOUNDED_ADDRESS);
		RPMALLOC_INITIALIZE_CONFIG = downcallHandle("rpmalloc_initialize_config", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		RPMALLOC_CONFIG = downcallHandle("rpmalloc_config", UNBOUNDED_ADDRESS);
		RPMALLOC_FINALIZE = downcallHandleVoid("rpmalloc_finalize");
		RPMALLOC_THREAD_INITIALIZE = downcallHandleVoid("rpmalloc_thread_initialize");
		RPMALLOC_THREAD_FINALIZE = downcallHandleVoid("rpmalloc_thread_finalize");
		RPMALLOC_THREAD_COLLECT = downcallHandleVoid("rpmalloc_thread_collect");
		RPMALLOC_IS_THREAD_INITIALIZED = downcallHandle("rpmalloc_is_thread_initialized", JAVA_INT);
		RPMALLOC_THREAD_STATISTICS = downcallHandleVoid("rpmalloc_thread_statistics", UNBOUNDED_ADDRESS);
		RPMALLOC_GLOBAL_STATISTICS = downcallHandleVoid("rpmalloc_global_statistics", UNBOUNDED_ADDRESS);
		RPMALLOC_DUMP_STATISTICS = downcallHandleVoid("rpmalloc_dump_statistics", UNBOUNDED_ADDRESS);
		RPMALLOC = downcallHandle("rpmalloc", UNBOUNDED_ADDRESS, JAVA_LONG);
		RPZALLOC = downcallHandle("rpzalloc", UNBOUNDED_ADDRESS, JAVA_LONG);
		RPCALLOC = downcallHandle("rpcalloc", UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG);
		RPREALLOC = downcallHandle("rprealloc", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG);
		RPALIGNED_REALLOC = downcallHandle("rpaligned_realloc", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_INT);
		RPALIGNED_ALLOC = downcallHandle("rpaligned_alloc", UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG);
		RPALIGNED_ZALLOC = downcallHandle("rpaligned_zalloc", UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG);
		RPALIGNED_CALLOC = downcallHandle("rpaligned_calloc", UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG, JAVA_LONG);
		RPMEMALIGN = downcallHandle("rpmemalign", UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG);
		RPPOSIX_MEMALIGN = downcallHandle("rpposix_memalign", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG);
		RPFREE = downcallHandleVoid("rpfree", UNBOUNDED_ADDRESS);
		RPMALLOC_USABLE_SIZE = downcallHandle("rpmalloc_usable_size", JAVA_LONG, UNBOUNDED_ADDRESS);
		RPMALLOC_LINKER_REFERENCE = downcallHandleVoid("rpmalloc_linker_reference");
		//@formatter:on
	}

	private Rpmalloc() {
	}

    /// ```
    /// Initialize allocator
    /// ```
    public static int rpmalloc_initialize(
    	MemorySegment memory_interface
    ) {
    	MethodHandle method = RPMALLOC_INITIALIZE.get();
    	try {
    		return (int) method.invokeExact(
    			memory_interface
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#rpmalloc_initialize].
    public static int rpmalloc_initialize(
    	RpmallocInterface memory_interface
    ) {
    	return rpmalloc_initialize(
    		memory_interface.memorySegment()
    	);
    }
    
    /// ```
    /// Initialize allocator
    /// ```
    public static int rpmalloc_initialize_config(
    	MemorySegment memory_interface,
    	MemorySegment config
    ) {
    	MethodHandle method = RPMALLOC_INITIALIZE_CONFIG.get();
    	try {
    		return (int) method.invokeExact(
    			memory_interface,
    			config
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#rpmalloc_initialize_config].
    public static int rpmalloc_initialize_config(
    	RpmallocInterface memory_interface,
    	RpmallocConfig config
    ) {
    	return rpmalloc_initialize_config(
    		memory_interface.memorySegment(),
    		config.memorySegment()
    	);
    }
    
    /// ```
    /// Get allocator configuration
    /// ```
    public static MemorySegment nrpmalloc_config() {
    	MethodHandle method = RPMALLOC_CONFIG.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nrpmalloc_config].
    public static @Nullable RpmallocConfig rpmalloc_config() {
    	MemorySegment segment = nrpmalloc_config();
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    	
    	return new RpmallocConfig(segment);
    }
    
    /// ```
    /// Finalize allocator
    /// ```
    public static void rpmalloc_finalize() {
    	MethodHandle method = RPMALLOC_FINALIZE.get();
    	try {
    		 method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Initialize allocator for calling thread
    /// ```
    public static void rpmalloc_thread_initialize() {
    	MethodHandle method = RPMALLOC_THREAD_INITIALIZE.get();
    	try {
    		 method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Finalize allocator for calling thread
    /// ```
    public static void rpmalloc_thread_finalize() {
    	MethodHandle method = RPMALLOC_THREAD_FINALIZE.get();
    	try {
    		 method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Perform deferred deallocations pending for the calling thread heap
    /// ```
    public static void rpmalloc_thread_collect() {
    	MethodHandle method = RPMALLOC_THREAD_COLLECT.get();
    	try {
    		 method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Query if allocator is initialized for calling thread
    /// ```
    public static int rpmalloc_is_thread_initialized() {
    	MethodHandle method = RPMALLOC_IS_THREAD_INITIALIZED.get();
    	try {
    		return (int) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Get per-thread statistics
    /// ```
    public static void rpmalloc_thread_statistics(
    	MemorySegment stats
    ) {
    	MethodHandle method = RPMALLOC_THREAD_STATISTICS.get();
    	try {
    		 method.invokeExact(
    			stats
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#rpmalloc_thread_statistics].
    public static void rpmalloc_thread_statistics(
    	RpmallocThreadStatistics stats
    ) {
    	rpmalloc_thread_statistics(
    		stats.memorySegment()
    	);
    }
    
    /// ```
    /// Get global statistics
    /// ```
    public static void rpmalloc_global_statistics(
    	MemorySegment stats
    ) {
    	MethodHandle method = RPMALLOC_GLOBAL_STATISTICS.get();
    	try {
    		 method.invokeExact(
    			stats
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#rpmalloc_global_statistics].
    public static void rpmalloc_global_statistics(
    	RpmallocGlobalStatistics stats
    ) {
    	rpmalloc_global_statistics(
    		stats.memorySegment()
    	);
    }
    
    /// ```
    /// Dump all statistics in human readable format to file (should be a FILE*)
    /// ```
    public static void rpmalloc_dump_statistics(
    	MemorySegment file
    ) {
    	MethodHandle method = RPMALLOC_DUMP_STATISTICS.get();
    	try {
    		 method.invokeExact(
    			file
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Allocate a memory block of at least the given size
    /// ```
    public static MemorySegment rpmalloc(
    	long size
    ) {
    	MethodHandle method = RPMALLOC.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			size
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Allocate a zero initialized memory block of at least the given size
    /// ```
    public static MemorySegment rpzalloc(
    	long size
    ) {
    	MethodHandle method = RPZALLOC.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			size
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Allocate a memory block of at least the given size and zero initialize it
    /// ```
    public static MemorySegment rpcalloc(
    	long num,
    	long size
    ) {
    	MethodHandle method = RPCALLOC.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			num,
    			size
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Reallocate the given block to at least the given size
    /// ```
    public static MemorySegment rprealloc(
    	MemorySegment ptr,
    	long size
    ) {
    	MethodHandle method = RPREALLOC.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			ptr,
    			size
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Reallocate the given block to at least the given size and alignment,
    /// ```
    public static MemorySegment rpaligned_realloc(
    	MemorySegment ptr,
    	long alignment,
    	long size,
    	long oldsize,
    	int flags
    ) {
    	MethodHandle method = RPALIGNED_REALLOC.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			ptr,
    			alignment,
    			size,
    			oldsize,
    			flags
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Allocate a memory block of at least the given size and alignment.
    /// ```
    public static MemorySegment rpaligned_alloc(
    	long alignment,
    	long size
    ) {
    	MethodHandle method = RPALIGNED_ALLOC.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			alignment,
    			size
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Allocate a memory block of at least the given size and alignment.
    /// ```
    public static MemorySegment rpaligned_zalloc(
    	long alignment,
    	long size
    ) {
    	MethodHandle method = RPALIGNED_ZALLOC.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			alignment,
    			size
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Allocate a memory block of at least the given size and alignment, and zero initialize it.
    /// ```
    public static MemorySegment rpaligned_calloc(
    	long alignment,
    	long num,
    	long size
    ) {
    	MethodHandle method = RPALIGNED_CALLOC.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			alignment,
    			num,
    			size
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Allocate a memory block of at least the given size and alignment.
    /// ```
    public static MemorySegment rpmemalign(
    	long alignment,
    	long size
    ) {
    	MethodHandle method = RPMEMALIGN.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			alignment,
    			size
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Allocate a memory block of at least the given size and alignment.
    /// ```
    public static int rpposix_memalign(
    	MemorySegment memptr,
    	long alignment,
    	long size
    ) {
    	MethodHandle method = RPPOSIX_MEMALIGN.get();
    	try {
    		return (int) method.invokeExact(
    			memptr,
    			alignment,
    			size
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#rpposix_memalign].
    public static int rpposix_memalign(
    	NativePointerArray memptr,
    	long alignment,
    	long size
    ) {
    	return rpposix_memalign(
    		memptr.memorySegment(),
    		alignment,
    		size
    	);
    }
    
    /// ```
    /// Free the given memory block
    /// ```
    public static void rpfree(
    	MemorySegment ptr
    ) {
    	MethodHandle method = RPFREE.get();
    	try {
    		 method.invokeExact(
    			ptr
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Query the usable size of the given memory block (from given pointer to the end of block)
    /// ```
    public static long rpmalloc_usable_size(
    	MemorySegment ptr
    ) {
    	MethodHandle method = RPMALLOC_USABLE_SIZE.get();
    	try {
    		return (long) method.invokeExact(
    			ptr
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Dummy empty function for forcing linker symbol inclusion
    /// ```
    public static void rpmalloc_linker_reference() {
    	MethodHandle method = RPMALLOC_LINKER_REFERENCE.get();
    	try {
    		 method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }

}