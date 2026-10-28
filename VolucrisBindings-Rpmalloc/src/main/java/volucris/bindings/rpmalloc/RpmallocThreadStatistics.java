/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.rpmalloc;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

public final class RpmallocThreadStatistics
		implements Struct<RpmallocThreadStatistics> {

	public static final StructLayout LAYOUT;

	public static final VarHandle SIZECACHE_HANDLE;
	public static final VarHandle SPANCACHE_HANDLE;

	public static final long SIZECACHE_BYTE_OFFSET;
	public static final long SPANCACHE_BYTE_OFFSET;
	public static final long SPAN_USE_BYTE_OFFSET;
	public static final long SIZE_USE_BYTE_OFFSET;

	private final MemorySegment segment;

	private final Span_use[] span_use;
	private final Size_use[] size_use;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_LONG.withName("sizecache"),
		    JAVA_LONG.withName("spancache"),
		    Span_use.LAYOUT.withName("span_use"),
		    Size_use.LAYOUT.withName("size_use")
		).withName("rpmalloc_thread_statistics_t").withByteAlignment(8);
		
		SIZECACHE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sizecache"));
		SPANCACHE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("spancache"));
		
		SIZECACHE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sizecache"));
		SPANCACHE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("spancache"));
		SPAN_USE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("span_use"));
		SIZE_USE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("size_use"));
		//@formatter:on
	}

	public RpmallocThreadStatistics() {
	    this(Arena.ofAuto());
	}
	
	public RpmallocThreadStatistics(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public RpmallocThreadStatistics(MemorySegment segment) {
	    this.segment = segment;
	
	    span_use = new Span_use[5];
	    for (int i = 0; i < 5; i++) {
	        long offset = SPAN_USE_BYTE_OFFSET + i * Span_use.LAYOUT.byteSize();
	        span_use[i] = new Span_use(segment.asSlice(offset, Span_use.LAYOUT));
	    }
	    size_use = new Size_use[128];
	    for (int i = 0; i < 128; i++) {
	        long offset = SIZE_USE_BYTE_OFFSET + i * Size_use.LAYOUT.byteSize();
	        size_use[i] = new Size_use(segment.asSlice(offset, Size_use.LAYOUT));
	    }
	}

    /// @see #sizecache()
    public RpmallocThreadStatistics sizecache(long sizecache) {
    	SIZECACHE_HANDLE.set(segment, 0L, sizecache);
    	return this;
    }
    
    /// ```
    /// Current number of bytes available in thread size class caches (only if ENABLE_STATISTICS=1)
    /// ```
    public long sizecache() {
    	return (long) SIZECACHE_HANDLE.get(segment, 0L);
    }
    
    /// @see #spancache()
    public RpmallocThreadStatistics spancache(long spancache) {
    	SPANCACHE_HANDLE.set(segment, 0L, spancache);
    	return this;
    }
    
    /// ```
    /// Current number of bytes available in thread page caches (only if ENABLE_STATISTICS=1)
    /// ```
    public long spancache() {
    	return (long) SPANCACHE_HANDLE.get(segment, 0L);
    }
    
    /// @see #span_use(int)
    public RpmallocThreadStatistics span_use(Consumer<Span_use> consumer, int index) {
    	consumer.accept(span_use[index]);
    	return this;
    }
    
    /// @see #span_use(int)
    public RpmallocThreadStatistics span_use(Span_use other, int index) {
    	span_use[index].set(other);
    	return this;
    }
    
    public Span_use span_use(int index) {
    	return span_use[index];
    }
    
    /// @see #size_use(int)
    public RpmallocThreadStatistics size_use(Consumer<Size_use> consumer, int index) {
    	consumer.accept(size_use[index]);
    	return this;
    }
    
    /// @see #size_use(int)
    public RpmallocThreadStatistics size_use(Size_use other, int index) {
    	size_use[index].set(other);
    	return this;
    }
    
    public Size_use size_use(int index) {
    	return size_use[index];
    }
    
    @Override
    public RpmallocThreadStatistics set(RpmallocThreadStatistics other) {
        return set(other.segment);
    }
    
    @Override
    public RpmallocThreadStatistics set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<RpmallocThreadStatistics> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<RpmallocThreadStatistics> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new RpmallocThreadStatistics(segment),
            count
        );
    }
    
    public static NativeStructArray<RpmallocThreadStatistics> array(SegmentAllocator allocator, RpmallocThreadStatistics... structs) {
        NativeStructArray<RpmallocThreadStatistics> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new RpmallocThreadStatistics(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<RpmallocThreadStatistics> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new RpmallocThreadStatistics(segment)
        );
    }

	public static class Span_use implements Struct<Span_use> {
	
		public static final StructLayout LAYOUT;
	
		public static final VarHandle CURRENT_HANDLE;
		public static final VarHandle MAP_CALLS_HANDLE;
	
		public static final long CURRENT_BYTE_OFFSET;
		public static final long MAP_CALLS_BYTE_OFFSET;
	
		private final MemorySegment segment;
	
		static {
			//@formatter:off
			LAYOUT = MemoryLayout.structLayout(
			    JAVA_LONG.withName("current"),
			    JAVA_LONG.withName("map_calls")
			).withName("Span_use").withByteAlignment(8);
			
			CURRENT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("current"));
			MAP_CALLS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("map_calls"));
			
			CURRENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("current"));
			MAP_CALLS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("map_calls"));
			//@formatter:on
		}
	
		public Span_use() {
		    this(Arena.ofAuto());
		}
		
		public Span_use(SegmentAllocator allocator) {
		    this(allocator.allocate(LAYOUT));
		}
		
		public Span_use(MemorySegment segment) {
		    this.segment = segment;
		
		}
	
	    /// @see #current()
	    public Span_use current(long current) {
	    	CURRENT_HANDLE.set(segment, 0L, current);
	    	return this;
	    }
	    
	    /// ```
	    /// Currently mapped number of spans of this page type
	    /// ```
	    public long current() {
	    	return (long) CURRENT_HANDLE.get(segment, 0L);
	    }
	    
	    /// @see #map_calls()
	    public Span_use map_calls(long map_calls) {
	    	MAP_CALLS_HANDLE.set(segment, 0L, map_calls);
	    	return this;
	    }
	    
	    /// ```
	    /// Number of raw memory map calls for this page type resulting in actual OS mmap calls
	    /// (only if ENABLE_STATISTICS=1)
	    /// ```
	    public long map_calls() {
	    	return (long) MAP_CALLS_HANDLE.get(segment, 0L);
	    }
	    
	    @Override
	    public Span_use set(Span_use other) {
	        return set(other.segment);
	    }
	    
	    @Override
	    public Span_use set(MemorySegment src) {
	        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
	        return this;
	    }
	    
	    @Override
	    public MemorySegment memorySegment() {
	        return segment;
	    }
	    
	    public NativeStructArray<Span_use> asArray() {
	        return new NativeStructArray<>(this);
	    }
	    
	    public static NativeStructArray<Span_use> array(SegmentAllocator allocator, int count) {
	        return new NativeStructArray<>(
	            allocator,
	            LAYOUT,
	            segment -> new Span_use(segment),
	            count
	        );
	    }
	    
	    public static NativeStructArray<Span_use> array(SegmentAllocator allocator, Span_use... structs) {
	        NativeStructArray<Span_use> array = new NativeStructArray<>(
	            allocator,
	            LAYOUT,
	            segment -> new Span_use(segment),
	            structs.length
	        );
	    
	        for (int i = 0; i < structs.length; i++) {
	            array.set(i, structs[i]);
	        }
	    
	        return array;
	    }
	    
	    public static NativeStructArray<Span_use> array(MemorySegment array) {
	        return new NativeStructArray<>(
	            array,
	            LAYOUT,
	            segment -> new Span_use(segment)
	        );
	    }
	
	}
    
	public static class Size_use implements Struct<Size_use> {
	
		public static final StructLayout LAYOUT;
	
		public static final VarHandle ALLOC_CURRENT_HANDLE;
		public static final VarHandle ALLOC_PEAK_HANDLE;
		public static final VarHandle ALLOC_TOTAL_HANDLE;
		public static final VarHandle FREE_TOTAL_HANDLE;
	
		public static final long ALLOC_CURRENT_BYTE_OFFSET;
		public static final long ALLOC_PEAK_BYTE_OFFSET;
		public static final long ALLOC_TOTAL_BYTE_OFFSET;
		public static final long FREE_TOTAL_BYTE_OFFSET;
	
		private final MemorySegment segment;
	
		static {
			//@formatter:off
			LAYOUT = MemoryLayout.structLayout(
			    JAVA_LONG.withName("alloc_current"),
			    JAVA_LONG.withName("alloc_peak"),
			    JAVA_LONG.withName("alloc_total"),
			    JAVA_LONG.withName("free_total")
			).withName("Size_use").withByteAlignment(8);
			
			ALLOC_CURRENT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("alloc_current"));
			ALLOC_PEAK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("alloc_peak"));
			ALLOC_TOTAL_HANDLE = LAYOUT.varHandle(PathElement.groupElement("alloc_total"));
			FREE_TOTAL_HANDLE = LAYOUT.varHandle(PathElement.groupElement("free_total"));
			
			ALLOC_CURRENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("alloc_current"));
			ALLOC_PEAK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("alloc_peak"));
			ALLOC_TOTAL_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("alloc_total"));
			FREE_TOTAL_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("free_total"));
			//@formatter:on
		}
	
		public Size_use() {
		    this(Arena.ofAuto());
		}
		
		public Size_use(SegmentAllocator allocator) {
		    this(allocator.allocate(LAYOUT));
		}
		
		public Size_use(MemorySegment segment) {
		    this.segment = segment;
		
		}
	
	    /// @see #alloc_current()
	    public Size_use alloc_current(long alloc_current) {
	    	ALLOC_CURRENT_HANDLE.set(segment, 0L, alloc_current);
	    	return this;
	    }
	    
	    /// ```
	    /// Current number of allocations
	    /// ```
	    public long alloc_current() {
	    	return (long) ALLOC_CURRENT_HANDLE.get(segment, 0L);
	    }
	    
	    /// @see #alloc_peak()
	    public Size_use alloc_peak(long alloc_peak) {
	    	ALLOC_PEAK_HANDLE.set(segment, 0L, alloc_peak);
	    	return this;
	    }
	    
	    /// ```
	    /// Peak number of allocations
	    /// ```
	    public long alloc_peak() {
	    	return (long) ALLOC_PEAK_HANDLE.get(segment, 0L);
	    }
	    
	    /// @see #alloc_total()
	    public Size_use alloc_total(long alloc_total) {
	    	ALLOC_TOTAL_HANDLE.set(segment, 0L, alloc_total);
	    	return this;
	    }
	    
	    /// ```
	    /// Total number of allocations
	    /// ```
	    public long alloc_total() {
	    	return (long) ALLOC_TOTAL_HANDLE.get(segment, 0L);
	    }
	    
	    /// @see #free_total()
	    public Size_use free_total(long free_total) {
	    	FREE_TOTAL_HANDLE.set(segment, 0L, free_total);
	    	return this;
	    }
	    
	    /// ```
	    /// Total number of frees
	    /// ```
	    public long free_total() {
	    	return (long) FREE_TOTAL_HANDLE.get(segment, 0L);
	    }
	    
	    @Override
	    public Size_use set(Size_use other) {
	        return set(other.segment);
	    }
	    
	    @Override
	    public Size_use set(MemorySegment src) {
	        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
	        return this;
	    }
	    
	    @Override
	    public MemorySegment memorySegment() {
	        return segment;
	    }
	    
	    public NativeStructArray<Size_use> asArray() {
	        return new NativeStructArray<>(this);
	    }
	    
	    public static NativeStructArray<Size_use> array(SegmentAllocator allocator, int count) {
	        return new NativeStructArray<>(
	            allocator,
	            LAYOUT,
	            segment -> new Size_use(segment),
	            count
	        );
	    }
	    
	    public static NativeStructArray<Size_use> array(SegmentAllocator allocator, Size_use... structs) {
	        NativeStructArray<Size_use> array = new NativeStructArray<>(
	            allocator,
	            LAYOUT,
	            segment -> new Size_use(segment),
	            structs.length
	        );
	    
	        for (int i = 0; i < structs.length; i++) {
	            array.set(i, structs[i]);
	        }
	    
	        return array;
	    }
	    
	    public static NativeStructArray<Size_use> array(MemorySegment array) {
	        return new NativeStructArray<>(
	            array,
	            LAYOUT,
	            segment -> new Size_use(segment)
	        );
	    }
	
	}
}