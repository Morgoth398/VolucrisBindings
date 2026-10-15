/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vma.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

/// ```
/// \brief Calculated statistics of memory usage e.g. in a specific memory type, heap, custom pool, or total.
/// 
/// These are fast to calculate.
/// See functions: vmaGetHeapBudgets(), vmaGetPoolStatistics().
/// ```
public final class VmaStatistics
		implements Struct<VmaStatistics> {

	public static final StructLayout LAYOUT;

	public static final VarHandle BLOCK_COUNT_HANDLE;
	public static final VarHandle ALLOCATION_COUNT_HANDLE;
	public static final VarHandle BLOCK_BYTES_HANDLE;
	public static final VarHandle ALLOCATION_BYTES_HANDLE;

	public static final long BLOCK_COUNT_BYTE_OFFSET;
	public static final long ALLOCATION_COUNT_BYTE_OFFSET;
	public static final long BLOCK_BYTES_BYTE_OFFSET;
	public static final long ALLOCATION_BYTES_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("blockCount"),
		    JAVA_INT.withName("allocationCount"),
		    JAVA_LONG.withName("blockBytes"),
		    JAVA_LONG.withName("allocationBytes")
		).withName("VmaStatistics").withByteAlignment(8);
		
		BLOCK_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("blockCount"));
		ALLOCATION_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("allocationCount"));
		BLOCK_BYTES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("blockBytes"));
		ALLOCATION_BYTES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("allocationBytes"));
		
		BLOCK_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("blockCount"));
		ALLOCATION_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("allocationCount"));
		BLOCK_BYTES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("blockBytes"));
		ALLOCATION_BYTES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("allocationBytes"));
		//@formatter:on
	}

	public VmaStatistics() {
	    this(Arena.ofAuto());
	}
	
	public VmaStatistics(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VmaStatistics(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #blockCount()
    public VmaStatistics blockCount(int blockCount) {
    	BLOCK_COUNT_HANDLE.set(segment, 0L, blockCount);
    	return this;
    }
    
    /// ```
    /// \brief Number of `VkDeviceMemory` objects - Vulkan memory blocks allocated.
    /// ```
    public int blockCount() {
    	return (int) BLOCK_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #allocationCount()
    public VmaStatistics allocationCount(int allocationCount) {
    	ALLOCATION_COUNT_HANDLE.set(segment, 0L, allocationCount);
    	return this;
    }
    
    /// ```
    /// \brief Number of #VmaAllocation objects allocated.
    /// 
    ///     Dedicated allocations have their own blocks, so each one adds 1 to `allocationCount` as well as `blockCount`.
    /// ```
    public int allocationCount() {
    	return (int) ALLOCATION_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #blockBytes()
    public VmaStatistics blockBytes(long blockBytes) {
    	BLOCK_BYTES_HANDLE.set(segment, 0L, blockBytes);
    	return this;
    }
    
    /// ```
    /// \brief Number of bytes allocated in `VkDeviceMemory` blocks.
    /// 
    ///     \note To avoid confusion, please be aware that what Vulkan calls an "allocation" - a whole `VkDeviceMemory` object
    ///     (e.g. as in `VkPhysicalDeviceLimits::maxMemoryAllocationCount`) is called a "block" in VMA, while VMA calls
    ///     "allocation" a #VmaAllocation object that represents a memory region sub-allocated from such block, usually for a single buffer or image.
    /// ```
    public long blockBytes() {
    	return (long) BLOCK_BYTES_HANDLE.get(segment, 0L);
    }
    
    /// @see #allocationBytes()
    public VmaStatistics allocationBytes(long allocationBytes) {
    	ALLOCATION_BYTES_HANDLE.set(segment, 0L, allocationBytes);
    	return this;
    }
    
    /// ```
    /// \brief Total number of bytes occupied by all #VmaAllocation objects.
    /// 
    ///     Always less or equal than `blockBytes`.
    ///     Difference `(blockBytes - allocationBytes)` is the amount of memory allocated from Vulkan
    ///     but unused by any #VmaAllocation.
    /// ```
    public long allocationBytes() {
    	return (long) ALLOCATION_BYTES_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VmaStatistics set(VmaStatistics other) {
        return set(other.segment);
    }
    
    @Override
    public VmaStatistics set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VmaStatistics> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VmaStatistics> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VmaStatistics(segment),
            count
        );
    }
    
    public static NativeStructArray<VmaStatistics> array(Arena arena, VmaStatistics... structs) {
        NativeStructArray<VmaStatistics> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VmaStatistics(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VmaStatistics> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VmaStatistics(segment)
        );
    }

}