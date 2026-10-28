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
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

public final class RpmallocGlobalStatistics
		implements Struct<RpmallocGlobalStatistics> {

	public static final StructLayout LAYOUT;

	public static final VarHandle MAPPED_HANDLE;
	public static final VarHandle MAPPED_PEAK_HANDLE;
	public static final VarHandle COMMITTED_HANDLE;
	public static final VarHandle DECOMMITTED_HANDLE;
	public static final VarHandle ACTIVE_HANDLE;
	public static final VarHandle ACTIVE_PEAK_HANDLE;
	public static final VarHandle HUGE_ALLOC_HANDLE;
	public static final VarHandle HUGE_ALLOC_PEAK_HANDLE;
	public static final VarHandle HEAP_COUNT_HANDLE;

	public static final long MAPPED_BYTE_OFFSET;
	public static final long MAPPED_PEAK_BYTE_OFFSET;
	public static final long COMMITTED_BYTE_OFFSET;
	public static final long DECOMMITTED_BYTE_OFFSET;
	public static final long ACTIVE_BYTE_OFFSET;
	public static final long ACTIVE_PEAK_BYTE_OFFSET;
	public static final long HUGE_ALLOC_BYTE_OFFSET;
	public static final long HUGE_ALLOC_PEAK_BYTE_OFFSET;
	public static final long HEAP_COUNT_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_LONG.withName("mapped"),
		    JAVA_LONG.withName("mapped_peak"),
		    JAVA_LONG.withName("committed"),
		    JAVA_LONG.withName("decommitted"),
		    JAVA_LONG.withName("active"),
		    JAVA_LONG.withName("active_peak"),
		    JAVA_LONG.withName("huge_alloc"),
		    JAVA_LONG.withName("huge_alloc_peak"),
		    JAVA_LONG.withName("heap_count")
		).withName("rpmalloc_global_statistics_t").withByteAlignment(8);
		
		MAPPED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mapped"));
		MAPPED_PEAK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mapped_peak"));
		COMMITTED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("committed"));
		DECOMMITTED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("decommitted"));
		ACTIVE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("active"));
		ACTIVE_PEAK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("active_peak"));
		HUGE_ALLOC_HANDLE = LAYOUT.varHandle(PathElement.groupElement("huge_alloc"));
		HUGE_ALLOC_PEAK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("huge_alloc_peak"));
		HEAP_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("heap_count"));
		
		MAPPED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mapped"));
		MAPPED_PEAK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mapped_peak"));
		COMMITTED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("committed"));
		DECOMMITTED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("decommitted"));
		ACTIVE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("active"));
		ACTIVE_PEAK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("active_peak"));
		HUGE_ALLOC_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("huge_alloc"));
		HUGE_ALLOC_PEAK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("huge_alloc_peak"));
		HEAP_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("heap_count"));
		//@formatter:on
	}

	public RpmallocGlobalStatistics() {
	    this(Arena.ofAuto());
	}
	
	public RpmallocGlobalStatistics(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public RpmallocGlobalStatistics(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #mapped()
    public RpmallocGlobalStatistics mapped(long mapped) {
    	MAPPED_HANDLE.set(segment, 0L, mapped);
    	return this;
    }
    
    /// ```
    /// Current amount of virtual memory mapped, all of which might not have been committed (only if
    /// ENABLE_STATISTICS=1)
    /// ```
    public long mapped() {
    	return (long) MAPPED_HANDLE.get(segment, 0L);
    }
    
    /// @see #mapped_peak()
    public RpmallocGlobalStatistics mapped_peak(long mapped_peak) {
    	MAPPED_PEAK_HANDLE.set(segment, 0L, mapped_peak);
    	return this;
    }
    
    /// ```
    /// Peak amount of virtual memory mapped, all of which might not have been committed (only if ENABLE_STATISTICS=1)
    /// ```
    public long mapped_peak() {
    	return (long) MAPPED_PEAK_HANDLE.get(segment, 0L);
    }
    
    /// @see #committed()
    public RpmallocGlobalStatistics committed(long committed) {
    	COMMITTED_HANDLE.set(segment, 0L, committed);
    	return this;
    }
    
    /// ```
    /// Running counter of total amount of memory committed (only if ENABLE_STATISTICS=1)
    /// ```
    public long committed() {
    	return (long) COMMITTED_HANDLE.get(segment, 0L);
    }
    
    /// @see #decommitted()
    public RpmallocGlobalStatistics decommitted(long decommitted) {
    	DECOMMITTED_HANDLE.set(segment, 0L, decommitted);
    	return this;
    }
    
    /// ```
    /// Running counter of total amount of memory decommitted (only if ENABLE_STATISTICS=1)
    /// ```
    public long decommitted() {
    	return (long) DECOMMITTED_HANDLE.get(segment, 0L);
    }
    
    /// @see #active()
    public RpmallocGlobalStatistics active(long active) {
    	ACTIVE_HANDLE.set(segment, 0L, active);
    	return this;
    }
    
    /// ```
    /// Current amount of virtual memory active and committed (only if ENABLE_STATISTICS=1)
    /// ```
    public long active() {
    	return (long) ACTIVE_HANDLE.get(segment, 0L);
    }
    
    /// @see #active_peak()
    public RpmallocGlobalStatistics active_peak(long active_peak) {
    	ACTIVE_PEAK_HANDLE.set(segment, 0L, active_peak);
    	return this;
    }
    
    /// ```
    /// Peak amount of virtual memory active and committed (only if ENABLE_STATISTICS=1)
    /// ```
    public long active_peak() {
    	return (long) ACTIVE_PEAK_HANDLE.get(segment, 0L);
    }
    
    /// @see #huge_alloc()
    public RpmallocGlobalStatistics huge_alloc(long huge_alloc) {
    	HUGE_ALLOC_HANDLE.set(segment, 0L, huge_alloc);
    	return this;
    }
    
    /// ```
    /// Current amount of memory allocated in huge block allocations, i.e blocks above the
    /// largest size class (only if ENABLE_STATISTICS=1)
    /// ```
    public long huge_alloc() {
    	return (long) HUGE_ALLOC_HANDLE.get(segment, 0L);
    }
    
    /// @see #huge_alloc_peak()
    public RpmallocGlobalStatistics huge_alloc_peak(long huge_alloc_peak) {
    	HUGE_ALLOC_PEAK_HANDLE.set(segment, 0L, huge_alloc_peak);
    	return this;
    }
    
    /// ```
    /// Peak amount of memory allocated in huge block allocations, i.e blocks above the
    /// largest size class (only if ENABLE_STATISTICS=1)
    /// ```
    public long huge_alloc_peak() {
    	return (long) HUGE_ALLOC_PEAK_HANDLE.get(segment, 0L);
    }
    
    /// @see #heap_count()
    public RpmallocGlobalStatistics heap_count(long heap_count) {
    	HEAP_COUNT_HANDLE.set(segment, 0L, heap_count);
    	return this;
    }
    
    /// ```
    /// Current heap count (only if ENABLE_STATISTICS=1)
    /// ```
    public long heap_count() {
    	return (long) HEAP_COUNT_HANDLE.get(segment, 0L);
    }
    
    @Override
    public RpmallocGlobalStatistics set(RpmallocGlobalStatistics other) {
        return set(other.segment);
    }
    
    @Override
    public RpmallocGlobalStatistics set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<RpmallocGlobalStatistics> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<RpmallocGlobalStatistics> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new RpmallocGlobalStatistics(segment),
            count
        );
    }
    
    public static NativeStructArray<RpmallocGlobalStatistics> array(SegmentAllocator allocator, RpmallocGlobalStatistics... structs) {
        NativeStructArray<RpmallocGlobalStatistics> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new RpmallocGlobalStatistics(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<RpmallocGlobalStatistics> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new RpmallocGlobalStatistics(segment)
        );
    }

}