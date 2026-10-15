/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vma.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

/// ```
/// Extended parameters of a #VmaAllocation object that can be retrieved using function vmaGetAllocationInfo2().
/// ```
public final class VmaAllocationInfo2
		implements Struct<VmaAllocationInfo2> {

	public static final StructLayout LAYOUT;

	public static final VarHandle BLOCK_SIZE_HANDLE;
	public static final VarHandle DEDICATED_MEMORY_HANDLE;

	public static final long ALLOCATION_INFO_BYTE_OFFSET;
	public static final long BLOCK_SIZE_BYTE_OFFSET;
	public static final long DEDICATED_MEMORY_BYTE_OFFSET;

	private final MemorySegment segment;

	private final VmaAllocationInfo allocationInfo;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    VmaAllocationInfo.LAYOUT.withName("allocationInfo"),
		    JAVA_LONG.withName("blockSize"),
		    JAVA_INT.withName("dedicatedMemory"),
		    MemoryLayout.paddingLayout(4)
		).withName("VmaAllocationInfo2").withByteAlignment(8);
		
		BLOCK_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("blockSize"));
		DEDICATED_MEMORY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("dedicatedMemory"));
		
		ALLOCATION_INFO_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("allocationInfo"));
		BLOCK_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("blockSize"));
		DEDICATED_MEMORY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dedicatedMemory"));
		//@formatter:on
	}

	public VmaAllocationInfo2() {
	    this(Arena.ofAuto());
	}
	
	public VmaAllocationInfo2(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VmaAllocationInfo2(MemorySegment segment) {
	    this.segment = segment;
	
	    allocationInfo = new VmaAllocationInfo(segment.asSlice(ALLOCATION_INFO_BYTE_OFFSET, VmaAllocationInfo.LAYOUT));
	}

    /// @see #allocationInfo()
    public VmaAllocationInfo2 allocationInfo(Consumer<VmaAllocationInfo> consumer) {
    	consumer.accept(allocationInfo);
    	return this;
    }
    
    /// @see #allocationInfo()
    public VmaAllocationInfo2 allocationInfo(VmaAllocationInfo other) {
    	allocationInfo.set(other);
    	return this;
    }
    
    /// ```
    /// \brief Basic parameters of the allocation.
    ///     
    ///     If you need only these, you can use function vmaGetAllocationInfo() and structure #VmaAllocationInfo instead.
    /// ```
    public VmaAllocationInfo allocationInfo() {
    	return allocationInfo;
    }
    
    /// @see #blockSize()
    public VmaAllocationInfo2 blockSize(long blockSize) {
    	BLOCK_SIZE_HANDLE.set(segment, 0L, blockSize);
    	return this;
    }
    
    /// ```
    /// \brief Size of the `VkDeviceMemory` block that the allocation belongs to.
    ///     
    ///     In case of an allocation with dedicated memory, it will be equal to `allocationInfo.size`.
    /// ```
    public long blockSize() {
    	return (long) BLOCK_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #dedicatedMemory()
    public VmaAllocationInfo2 dedicatedMemory(int dedicatedMemory) {
    	DEDICATED_MEMORY_HANDLE.set(segment, 0L, dedicatedMemory);
    	return this;
    }
    
    /// ```
    /// \brief `VK_TRUE` if the allocation has dedicated memory, `VK_FALSE` if it was placed as part of a larger memory block.
    ///     
    ///     When `VK_TRUE`, it also means `VkMemoryDedicatedAllocateInfo` was used when creating the allocation
    ///     (if VK_KHR_dedicated_allocation extension or Vulkan version >= 1.1 is enabled).
    /// ```
    public int dedicatedMemory() {
    	return (int) DEDICATED_MEMORY_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VmaAllocationInfo2 set(VmaAllocationInfo2 other) {
        return set(other.segment);
    }
    
    @Override
    public VmaAllocationInfo2 set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VmaAllocationInfo2> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VmaAllocationInfo2> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VmaAllocationInfo2(segment),
            count
        );
    }
    
    public static NativeStructArray<VmaAllocationInfo2> array(Arena arena, VmaAllocationInfo2... structs) {
        NativeStructArray<VmaAllocationInfo2> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VmaAllocationInfo2(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VmaAllocationInfo2> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VmaAllocationInfo2(segment)
        );
    }

}