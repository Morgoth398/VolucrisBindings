/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vma.structs;

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

/// ```
/// \brief More detailed statistics than #VmaStatistics.
/// 
/// These are slower to calculate. Use for debugging purposes.
/// See functions: vmaCalculateStatistics(), vmaCalculatePoolStatistics().
/// 
/// Previous version of the statistics API provided averages, but they have been removed
/// because they can be easily calculated as:
/// 
/// \code
/// VkDeviceSize allocationSizeAvg = detailedStats.statistics.allocationBytes / detailedStats.statistics.allocationCount;
/// VkDeviceSize unusedBytes = detailedStats.statistics.blockBytes - detailedStats.statistics.allocationBytes;
/// VkDeviceSize unusedRangeSizeAvg = unusedBytes / detailedStats.unusedRangeCount;
/// \endcode
/// ```
public final class VmaDetailedStatistics
		implements Struct<VmaDetailedStatistics> {

	public static final StructLayout LAYOUT;

	public static final VarHandle UNUSED_RANGE_COUNT_HANDLE;
	public static final VarHandle ALLOCATION_SIZE_MIN_HANDLE;
	public static final VarHandle ALLOCATION_SIZE_MAX_HANDLE;
	public static final VarHandle UNUSED_RANGE_SIZE_MIN_HANDLE;
	public static final VarHandle UNUSED_RANGE_SIZE_MAX_HANDLE;

	public static final long STATISTICS_BYTE_OFFSET;
	public static final long UNUSED_RANGE_COUNT_BYTE_OFFSET;
	public static final long ALLOCATION_SIZE_MIN_BYTE_OFFSET;
	public static final long ALLOCATION_SIZE_MAX_BYTE_OFFSET;
	public static final long UNUSED_RANGE_SIZE_MIN_BYTE_OFFSET;
	public static final long UNUSED_RANGE_SIZE_MAX_BYTE_OFFSET;

	private final MemorySegment segment;

	private final VmaStatistics statistics;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    VmaStatistics.LAYOUT.withName("statistics"),
		    JAVA_INT.withName("unusedRangeCount"),
		    MemoryLayout.paddingLayout(4),
		    JAVA_LONG.withName("allocationSizeMin"),
		    JAVA_LONG.withName("allocationSizeMax"),
		    JAVA_LONG.withName("unusedRangeSizeMin"),
		    JAVA_LONG.withName("unusedRangeSizeMax")
		).withName("VmaDetailedStatistics").withByteAlignment(8);
		
		UNUSED_RANGE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("unusedRangeCount"));
		ALLOCATION_SIZE_MIN_HANDLE = LAYOUT.varHandle(PathElement.groupElement("allocationSizeMin"));
		ALLOCATION_SIZE_MAX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("allocationSizeMax"));
		UNUSED_RANGE_SIZE_MIN_HANDLE = LAYOUT.varHandle(PathElement.groupElement("unusedRangeSizeMin"));
		UNUSED_RANGE_SIZE_MAX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("unusedRangeSizeMax"));
		
		STATISTICS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("statistics"));
		UNUSED_RANGE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("unusedRangeCount"));
		ALLOCATION_SIZE_MIN_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("allocationSizeMin"));
		ALLOCATION_SIZE_MAX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("allocationSizeMax"));
		UNUSED_RANGE_SIZE_MIN_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("unusedRangeSizeMin"));
		UNUSED_RANGE_SIZE_MAX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("unusedRangeSizeMax"));
		//@formatter:on
	}

	public VmaDetailedStatistics() {
	    this(Arena.ofAuto());
	}
	
	public VmaDetailedStatistics(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VmaDetailedStatistics(MemorySegment segment) {
	    this.segment = segment;
	
	    statistics = new VmaStatistics(segment.asSlice(STATISTICS_BYTE_OFFSET, VmaStatistics.LAYOUT));
	}

    /// @see #statistics()
    public VmaDetailedStatistics statistics(Consumer<VmaStatistics> consumer) {
    	consumer.accept(statistics);
    	return this;
    }
    
    /// @see #statistics()
    public VmaDetailedStatistics statistics(VmaStatistics other) {
    	statistics.set(other);
    	return this;
    }
    
    /// ```
    /// Basic statistics.
    /// ```
    public VmaStatistics statistics() {
    	return statistics;
    }
    
    /// @see #unusedRangeCount()
    public VmaDetailedStatistics unusedRangeCount(int unusedRangeCount) {
    	UNUSED_RANGE_COUNT_HANDLE.set(segment, 0L, unusedRangeCount);
    	return this;
    }
    
    /// ```
    /// Number of free ranges of memory between allocations.
    /// ```
    public int unusedRangeCount() {
    	return (int) UNUSED_RANGE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #allocationSizeMin()
    public VmaDetailedStatistics allocationSizeMin(long allocationSizeMin) {
    	ALLOCATION_SIZE_MIN_HANDLE.set(segment, 0L, allocationSizeMin);
    	return this;
    }
    
    /// ```
    /// Smallest allocation size. `VK_WHOLE_SIZE` if there are 0 allocations.
    /// ```
    public long allocationSizeMin() {
    	return (long) ALLOCATION_SIZE_MIN_HANDLE.get(segment, 0L);
    }
    
    /// @see #allocationSizeMax()
    public VmaDetailedStatistics allocationSizeMax(long allocationSizeMax) {
    	ALLOCATION_SIZE_MAX_HANDLE.set(segment, 0L, allocationSizeMax);
    	return this;
    }
    
    /// ```
    /// Largest allocation size. 0 if there are 0 allocations.
    /// ```
    public long allocationSizeMax() {
    	return (long) ALLOCATION_SIZE_MAX_HANDLE.get(segment, 0L);
    }
    
    /// @see #unusedRangeSizeMin()
    public VmaDetailedStatistics unusedRangeSizeMin(long unusedRangeSizeMin) {
    	UNUSED_RANGE_SIZE_MIN_HANDLE.set(segment, 0L, unusedRangeSizeMin);
    	return this;
    }
    
    /// ```
    /// Smallest empty range size. `VK_WHOLE_SIZE` if there are 0 empty ranges.
    /// ```
    public long unusedRangeSizeMin() {
    	return (long) UNUSED_RANGE_SIZE_MIN_HANDLE.get(segment, 0L);
    }
    
    /// @see #unusedRangeSizeMax()
    public VmaDetailedStatistics unusedRangeSizeMax(long unusedRangeSizeMax) {
    	UNUSED_RANGE_SIZE_MAX_HANDLE.set(segment, 0L, unusedRangeSizeMax);
    	return this;
    }
    
    /// ```
    /// Largest empty range size. 0 if there are 0 empty ranges.
    /// ```
    public long unusedRangeSizeMax() {
    	return (long) UNUSED_RANGE_SIZE_MAX_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VmaDetailedStatistics set(VmaDetailedStatistics other) {
        return set(other.segment);
    }
    
    @Override
    public VmaDetailedStatistics set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VmaDetailedStatistics> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VmaDetailedStatistics> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VmaDetailedStatistics(segment),
            count
        );
    }
    
    public static NativeStructArray<VmaDetailedStatistics> array(SegmentAllocator allocator, VmaDetailedStatistics... structs) {
        NativeStructArray<VmaDetailedStatistics> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VmaDetailedStatistics(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VmaDetailedStatistics> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VmaDetailedStatistics(segment)
        );
    }

}