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
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

/// ```
/// Statistics returned for defragmentation process in function vmaEndDefragmentation().
/// ```
public final class VmaDefragmentationStats
		implements Struct<VmaDefragmentationStats> {

	public static final StructLayout LAYOUT;

	public static final VarHandle BYTES_MOVED_HANDLE;
	public static final VarHandle BYTES_FREED_HANDLE;
	public static final VarHandle ALLOCATIONS_MOVED_HANDLE;
	public static final VarHandle DEVICE_MEMORY_BLOCKS_FREED_HANDLE;

	public static final long BYTES_MOVED_BYTE_OFFSET;
	public static final long BYTES_FREED_BYTE_OFFSET;
	public static final long ALLOCATIONS_MOVED_BYTE_OFFSET;
	public static final long DEVICE_MEMORY_BLOCKS_FREED_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_LONG.withName("bytesMoved"),
		    JAVA_LONG.withName("bytesFreed"),
		    JAVA_INT.withName("allocationsMoved"),
		    JAVA_INT.withName("deviceMemoryBlocksFreed")
		).withName("VmaDefragmentationStats").withByteAlignment(8);
		
		BYTES_MOVED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("bytesMoved"));
		BYTES_FREED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("bytesFreed"));
		ALLOCATIONS_MOVED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("allocationsMoved"));
		DEVICE_MEMORY_BLOCKS_FREED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("deviceMemoryBlocksFreed"));
		
		BYTES_MOVED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("bytesMoved"));
		BYTES_FREED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("bytesFreed"));
		ALLOCATIONS_MOVED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("allocationsMoved"));
		DEVICE_MEMORY_BLOCKS_FREED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("deviceMemoryBlocksFreed"));
		//@formatter:on
	}

	public VmaDefragmentationStats() {
	    this(Arena.ofAuto());
	}
	
	public VmaDefragmentationStats(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VmaDefragmentationStats(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #bytesMoved()
    public VmaDefragmentationStats bytesMoved(long bytesMoved) {
    	BYTES_MOVED_HANDLE.set(segment, 0L, bytesMoved);
    	return this;
    }
    
    /// ```
    /// Total number of bytes that have been copied while moving allocations to different places.
    /// ```
    public long bytesMoved() {
    	return (long) BYTES_MOVED_HANDLE.get(segment, 0L);
    }
    
    /// @see #bytesFreed()
    public VmaDefragmentationStats bytesFreed(long bytesFreed) {
    	BYTES_FREED_HANDLE.set(segment, 0L, bytesFreed);
    	return this;
    }
    
    /// ```
    /// Total number of bytes that have been released to the system by freeing empty `VkDeviceMemory` objects.
    /// ```
    public long bytesFreed() {
    	return (long) BYTES_FREED_HANDLE.get(segment, 0L);
    }
    
    /// @see #allocationsMoved()
    public VmaDefragmentationStats allocationsMoved(int allocationsMoved) {
    	ALLOCATIONS_MOVED_HANDLE.set(segment, 0L, allocationsMoved);
    	return this;
    }
    
    /// ```
    /// Number of allocations that have been moved to different places.
    /// ```
    public int allocationsMoved() {
    	return (int) ALLOCATIONS_MOVED_HANDLE.get(segment, 0L);
    }
    
    /// @see #deviceMemoryBlocksFreed()
    public VmaDefragmentationStats deviceMemoryBlocksFreed(int deviceMemoryBlocksFreed) {
    	DEVICE_MEMORY_BLOCKS_FREED_HANDLE.set(segment, 0L, deviceMemoryBlocksFreed);
    	return this;
    }
    
    /// ```
    /// Number of empty `VkDeviceMemory` objects that have been released to the system.
    /// ```
    public int deviceMemoryBlocksFreed() {
    	return (int) DEVICE_MEMORY_BLOCKS_FREED_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VmaDefragmentationStats set(VmaDefragmentationStats other) {
        return set(other.segment);
    }
    
    @Override
    public VmaDefragmentationStats set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VmaDefragmentationStats> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VmaDefragmentationStats> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VmaDefragmentationStats(segment),
            count
        );
    }
    
    public static NativeStructArray<VmaDefragmentationStats> array(SegmentAllocator allocator, VmaDefragmentationStats... structs) {
        NativeStructArray<VmaDefragmentationStats> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VmaDefragmentationStats(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VmaDefragmentationStats> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VmaDefragmentationStats(segment)
        );
    }

}