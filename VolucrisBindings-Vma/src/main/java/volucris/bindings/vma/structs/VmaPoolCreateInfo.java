/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vma.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;
import static volucris.bindings.core.FFMUtils.UNBOUNDED_ADDRESS;

/// ```
/// Describes parameter of created #VmaPool.
/// ```
public final class VmaPoolCreateInfo
		implements Struct<VmaPoolCreateInfo> {

    public static final StructLayout LAYOUT;

    public static final VarHandle MEMORY_TYPE_INDEX_HANDLE;
    public static final VarHandle FLAGS_HANDLE;
    public static final VarHandle BLOCK_SIZE_HANDLE;
    public static final VarHandle MIN_BLOCK_COUNT_HANDLE;
    public static final VarHandle MAX_BLOCK_COUNT_HANDLE;
    public static final VarHandle PRIORITY_HANDLE;
    public static final VarHandle MIN_ALLOCATION_ALIGNMENT_HANDLE;
    public static final VarHandle P_MEMORY_ALLOCATE_NEXT_HANDLE;

    public static final long MEMORY_TYPE_INDEX_BYTE_OFFSET;
    public static final long FLAGS_BYTE_OFFSET;
    public static final long BLOCK_SIZE_BYTE_OFFSET;
    public static final long MIN_BLOCK_COUNT_BYTE_OFFSET;
    public static final long MAX_BLOCK_COUNT_BYTE_OFFSET;
    public static final long PRIORITY_BYTE_OFFSET;
    public static final long MIN_ALLOCATION_ALIGNMENT_BYTE_OFFSET;
    public static final long P_MEMORY_ALLOCATE_NEXT_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("memoryTypeIndex"),
            JAVA_INT.withName("flags"),
            JAVA_LONG.withName("blockSize"),
            JAVA_LONG.withName("minBlockCount"),
            JAVA_LONG.withName("maxBlockCount"),
            JAVA_FLOAT.withName("priority"),
            MemoryLayout.paddingLayout(4),
            JAVA_LONG.withName("minAllocationAlignment"),
            UNBOUNDED_ADDRESS.withName("pMemoryAllocateNext")
        ).withName("VmaPoolCreateInfo").withByteAlignment(8);
        
        MEMORY_TYPE_INDEX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("memoryTypeIndex"));
        FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
        BLOCK_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("blockSize"));
        MIN_BLOCK_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("minBlockCount"));
        MAX_BLOCK_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxBlockCount"));
        PRIORITY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("priority"));
        MIN_ALLOCATION_ALIGNMENT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("minAllocationAlignment"));
        P_MEMORY_ALLOCATE_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pMemoryAllocateNext"));
        
        MEMORY_TYPE_INDEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("memoryTypeIndex"));
        FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
        BLOCK_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("blockSize"));
        MIN_BLOCK_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("minBlockCount"));
        MAX_BLOCK_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxBlockCount"));
        PRIORITY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("priority"));
        MIN_ALLOCATION_ALIGNMENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("minAllocationAlignment"));
        P_MEMORY_ALLOCATE_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pMemoryAllocateNext"));
        //@formatter:on
    }

    public VmaPoolCreateInfo() {
        this(Arena.ofAuto());
    }
    
    public VmaPoolCreateInfo(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VmaPoolCreateInfo(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #memoryTypeIndex()
    public VmaPoolCreateInfo memoryTypeIndex(int memoryTypeIndex) {
    	MEMORY_TYPE_INDEX_HANDLE.set(segment, 0L, memoryTypeIndex);
    	return this;
    }
    
    /// ```
    /// \brief Vulkan memory type index to allocate this pool from.
    /// ```
    public int memoryTypeIndex() {
    	return (int) MEMORY_TYPE_INDEX_HANDLE.get(segment, 0L);
    }
    
    /// @see #flags()
    public VmaPoolCreateInfo flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    /// ```
    /// \brief Use combination of #VmaPoolCreateFlagBits.
    /// ```
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #blockSize()
    public VmaPoolCreateInfo blockSize(long blockSize) {
    	BLOCK_SIZE_HANDLE.set(segment, 0L, blockSize);
    	return this;
    }
    
    /// ```
    /// \brief Size of a single `VkDeviceMemory` block to be allocated as part of this pool, in bytes. Optional.
    /// 
    ///     Specify nonzero to set explicit, constant size of memory blocks used by this
    ///     pool.
    /// 
    ///     Leave 0 to use default and let the library manage block sizes automatically.
    ///     Sizes of particular blocks may vary.
    ///     In this case, the pool will also support dedicated allocations.
    /// ```
    public long blockSize() {
    	return (long) BLOCK_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #minBlockCount()
    public VmaPoolCreateInfo minBlockCount(long minBlockCount) {
    	MIN_BLOCK_COUNT_HANDLE.set(segment, 0L, minBlockCount);
    	return this;
    }
    
    /// ```
    /// \brief Minimum number of blocks to be always allocated in this pool, even if they stay empty.
    /// 
    ///     Set to 0 to have no preallocated blocks and allow the pool be completely empty.
    /// ```
    public long minBlockCount() {
    	return (long) MIN_BLOCK_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxBlockCount()
    public VmaPoolCreateInfo maxBlockCount(long maxBlockCount) {
    	MAX_BLOCK_COUNT_HANDLE.set(segment, 0L, maxBlockCount);
    	return this;
    }
    
    /// ```
    /// \brief Maximum number of blocks that can be allocated in this pool. Optional.
    /// 
    ///     Set to 0 to use default, which is `SIZE_MAX`, which means no limit.
    /// 
    ///     Set to same value as VmaPoolCreateInfo::minBlockCount to have fixed amount of memory allocated
    ///     throughout whole lifetime of this pool.
    /// ```
    public long maxBlockCount() {
    	return (long) MAX_BLOCK_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #priority()
    public VmaPoolCreateInfo priority(float priority) {
    	PRIORITY_HANDLE.set(segment, 0L, priority);
    	return this;
    }
    
    /// ```
    /// \brief A floating-point value between 0 and 1, indicating the priority of the allocations in this pool relative to other memory allocations.
    /// 
    ///     It is used only when #VMA_ALLOCATOR_CREATE_EXT_MEMORY_PRIORITY_BIT flag was used during creation of the #VmaAllocator object.
    ///     Otherwise, this variable is ignored.
    /// ```
    public float priority() {
    	return (float) PRIORITY_HANDLE.get(segment, 0L);
    }
    
    /// @see #minAllocationAlignment()
    public VmaPoolCreateInfo minAllocationAlignment(long minAllocationAlignment) {
    	MIN_ALLOCATION_ALIGNMENT_HANDLE.set(segment, 0L, minAllocationAlignment);
    	return this;
    }
    
    /// ```
    /// \brief Additional minimum alignment to be used for all allocations created from this pool. Can be 0.
    /// 
    ///     Leave 0 (default) not to impose any additional alignment. If not 0, it must be a power of two.
    ///     It can be useful in cases where alignment returned by Vulkan by functions like `vkGetBufferMemoryRequirements` is not enough,
    ///     e.g. when doing interop with OpenGL.
    /// ```
    public long minAllocationAlignment() {
    	return (long) MIN_ALLOCATION_ALIGNMENT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pMemoryAllocateNext()
    public VmaPoolCreateInfo pMemoryAllocateNext(MemorySegment pMemoryAllocateNext) {
    	P_MEMORY_ALLOCATE_NEXT_HANDLE.set(segment, 0L, pMemoryAllocateNext);
    	return this;
    }
    
    /// ```
    /// \brief Additional `pNext` chain to be attached to `VkMemoryAllocateInfo` used for every allocation made by this pool. Optional.
    /// 
    ///     Optional, can be null. If not null, it must point to a `pNext` chain of structures that can be attached to `VkMemoryAllocateInfo`.
    ///     It can be useful for special needs such as adding `VkExportMemoryAllocateInfoKHR`.
    ///     Structures pointed by this member must remain alive and unchanged for the whole lifetime of the custom pool.
    /// 
    ///     Please note that some structures, e.g. `VkMemoryPriorityAllocateInfoEXT`, `VkMemoryDedicatedAllocateInfoKHR`,
    ///     can be attached automatically by this library when using other, more convenient of its features.
    /// ```
    public @Nullable MemorySegment pMemoryAllocateNext() {
    	MemorySegment segment = (MemorySegment) P_MEMORY_ALLOCATE_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    @Override
    public VmaPoolCreateInfo set(VmaPoolCreateInfo other) {
        return set(other.segment);
    }
    
    @Override
    public VmaPoolCreateInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VmaPoolCreateInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VmaPoolCreateInfo> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VmaPoolCreateInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<VmaPoolCreateInfo> array(Arena arena, VmaPoolCreateInfo... structs) {
        NativeStructArray<VmaPoolCreateInfo> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VmaPoolCreateInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VmaPoolCreateInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VmaPoolCreateInfo(segment)
        );
    }
    
}