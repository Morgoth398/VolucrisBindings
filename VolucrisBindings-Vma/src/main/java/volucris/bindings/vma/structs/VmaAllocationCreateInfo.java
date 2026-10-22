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
import volucris.bindings.vma.VmaPool;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;
import static volucris.bindings.core.FFMUtils.UNBOUNDED_ADDRESS;

/// ```
/// \brief Parameters of new #VmaAllocation.
/// 
/// To be used with functions like vmaCreateBuffer(), vmaCreateImage(), and many others.
/// ```
public final class VmaAllocationCreateInfo
		implements Struct<VmaAllocationCreateInfo> {

	public static final StructLayout LAYOUT;

	public static final VarHandle FLAGS_HANDLE;
	public static final VarHandle USAGE_HANDLE;
	public static final VarHandle REQUIRED_FLAGS_HANDLE;
	public static final VarHandle PREFERRED_FLAGS_HANDLE;
	public static final VarHandle MEMORY_TYPE_BITS_HANDLE;
	public static final VarHandle POOL_HANDLE;
	public static final VarHandle P_USER_DATA_HANDLE;
	public static final VarHandle PRIORITY_HANDLE;
	public static final VarHandle MIN_ALIGNMENT_HANDLE;

	public static final long FLAGS_BYTE_OFFSET;
	public static final long USAGE_BYTE_OFFSET;
	public static final long REQUIRED_FLAGS_BYTE_OFFSET;
	public static final long PREFERRED_FLAGS_BYTE_OFFSET;
	public static final long MEMORY_TYPE_BITS_BYTE_OFFSET;
	public static final long POOL_BYTE_OFFSET;
	public static final long P_USER_DATA_BYTE_OFFSET;
	public static final long PRIORITY_BYTE_OFFSET;
	public static final long MIN_ALIGNMENT_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("flags"),
		    JAVA_INT.withName("usage"),
		    JAVA_INT.withName("requiredFlags"),
		    JAVA_INT.withName("preferredFlags"),
		    JAVA_INT.withName("memoryTypeBits"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pool"),
		    UNBOUNDED_ADDRESS.withName("pUserData"),
		    JAVA_FLOAT.withName("priority"),
		    MemoryLayout.paddingLayout(4),
		    JAVA_LONG.withName("minAlignment")
		).withName("VmaAllocationCreateInfo").withByteAlignment(8);
		
		FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
		USAGE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("usage"));
		REQUIRED_FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("requiredFlags"));
		PREFERRED_FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("preferredFlags"));
		MEMORY_TYPE_BITS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("memoryTypeBits"));
		POOL_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pool"));
		P_USER_DATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pUserData"));
		PRIORITY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("priority"));
		MIN_ALIGNMENT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("minAlignment"));
		
		FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
		USAGE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("usage"));
		REQUIRED_FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("requiredFlags"));
		PREFERRED_FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("preferredFlags"));
		MEMORY_TYPE_BITS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("memoryTypeBits"));
		POOL_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pool"));
		P_USER_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pUserData"));
		PRIORITY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("priority"));
		MIN_ALIGNMENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("minAlignment"));
		//@formatter:on
	}

	public VmaAllocationCreateInfo() {
	    this(Arena.ofAuto());
	}
	
	public VmaAllocationCreateInfo(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VmaAllocationCreateInfo(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #flags()
    public VmaAllocationCreateInfo flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    /// ```
    /// Use #VmaAllocationCreateFlagBits enum.
    /// ```
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #usage()
    public VmaAllocationCreateInfo usage(int usage) {
    	USAGE_HANDLE.set(segment, 0L, usage);
    	return this;
    }
    
    /// ```
    /// \brief Intended usage of memory.
    /// 
    ///     You can leave #VMA_MEMORY_USAGE_UNKNOWN if you specify memory requirements in other way. \n
    ///     If `pool` is not null, this member is ignored.
    /// ```
    public int usage() {
    	return (int) USAGE_HANDLE.get(segment, 0L);
    }
    
    /// @see #requiredFlags()
    public VmaAllocationCreateInfo requiredFlags(int requiredFlags) {
    	REQUIRED_FLAGS_HANDLE.set(segment, 0L, requiredFlags);
    	return this;
    }
    
    /// ```
    /// \brief Flags that must be set in a Memory Type chosen for an allocation.
    /// 
    ///     Leave 0 if you specify memory requirements in other way. \n
    ///     If `pool` is not null, this member is ignored.
    /// ```
    public int requiredFlags() {
    	return (int) REQUIRED_FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #preferredFlags()
    public VmaAllocationCreateInfo preferredFlags(int preferredFlags) {
    	PREFERRED_FLAGS_HANDLE.set(segment, 0L, preferredFlags);
    	return this;
    }
    
    /// ```
    /// \brief Flags that preferably should be set in a memory type chosen for an allocation.
    /// 
    ///     Set to 0 if no additional flags are preferred. \n
    ///     If `pool` is not null, this member is ignored.
    /// ```
    public int preferredFlags() {
    	return (int) PREFERRED_FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #memoryTypeBits()
    public VmaAllocationCreateInfo memoryTypeBits(int memoryTypeBits) {
    	MEMORY_TYPE_BITS_HANDLE.set(segment, 0L, memoryTypeBits);
    	return this;
    }
    
    /// ```
    /// \brief Bitmask containing one bit set for every memory type acceptable for this allocation.
    /// 
    ///     Value 0 is equivalent to `UINT32_MAX` - it means any memory type is accepted if
    ///     it meets other requirements specified by this structure, with no further
    ///     restrictions on memory type index. \n
    ///     If `pool` is not null, this member is ignored.
    /// ```
    public int memoryTypeBits() {
    	return (int) MEMORY_TYPE_BITS_HANDLE.get(segment, 0L);
    }
    
    /// @see #pool()
    public VmaAllocationCreateInfo pool(VmaPool pool) {
    	POOL_HANDLE.set(segment, 0L, pool.memorySegment());
    	return this;
    }
    
    /// ```
    /// \brief Pool that this allocation should be created in.
    /// 
    ///     Leave `VK_NULL_HANDLE` to allocate from default pool. If not null, members:
    ///     `usage`, `requiredFlags`, `preferredFlags`, `memoryTypeBits` are ignored.
    /// ```
    public @Nullable VmaPool pool() {
    	MemorySegment segment = (MemorySegment) POOL_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VmaPool(segment);
    }
    
    /// @see #pUserData()
    public VmaAllocationCreateInfo pUserData(MemorySegment pUserData) {
    	P_USER_DATA_HANDLE.set(segment, 0L, pUserData);
    	return this;
    }
    
    /// ```
    /// \brief Custom general-purpose pointer that will be stored in #VmaAllocation, can be read as VmaAllocationInfo::pUserData and changed using vmaSetAllocationUserData().
    /// 
    ///     If #VMA_ALLOCATION_CREATE_USER_DATA_COPY_STRING_BIT is used, it must be either
    ///     null or pointer to a null-terminated string. The string will be then copied to
    ///     internal buffer, so it doesn't need to be valid after allocation call.
    /// ```
    public @Nullable MemorySegment pUserData() {
    	MemorySegment segment = (MemorySegment) P_USER_DATA_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #priority()
    public VmaAllocationCreateInfo priority(float priority) {
    	PRIORITY_HANDLE.set(segment, 0L, priority);
    	return this;
    }
    
    /// ```
    /// \brief A floating-point value between 0 and 1, indicating the priority of the allocation relative to other memory allocations.
    /// 
    ///     It is used only when #VMA_ALLOCATOR_CREATE_EXT_MEMORY_PRIORITY_BIT flag was used during creation of the #VmaAllocator object
    ///     and this allocation ends up as dedicated or is explicitly forced as dedicated using #VMA_ALLOCATION_CREATE_DEDICATED_MEMORY_BIT.
    ///     Otherwise, it has the priority of a memory block where it is placed and this variable is ignored.
    /// ```
    public float priority() {
    	return (float) PRIORITY_HANDLE.get(segment, 0L);
    }
    
    /// @see #minAlignment()
    public VmaAllocationCreateInfo minAlignment(long minAlignment) {
    	MIN_ALIGNMENT_HANDLE.set(segment, 0L, minAlignment);
    	return this;
    }
    
    /// ```
    /// \brief Additional minimum alignment to be used for this allocation. Can be 0.
    /// 
    ///     Leave 0 (default) not to impose any additional alignment. If not 0, it must be a power of two.
    ///     
    ///     When creating a buffer or an image, specifying a custom alignment is not needed in most cases,
    ///     because Vulkan implementation inspects the `CreateInfo` structure (including intended usage flags)
    ///     and returns required alignment through functions like `vkGetBufferMemoryRequirements2`, which VMA automatically
    ///     uses and respects.
    ///     Extra alignment may be needed in some cases, like when using a buffer for acceleration structure scratch
    ///     (`VkPhysicalDeviceAccelerationStructurePropertiesKHR::minAccelerationStructureScratchOffsetAlignment`, see also issue #523)
    ///     or when doing interop with OpenGL.
    /// ```
    public long minAlignment() {
    	return (long) MIN_ALIGNMENT_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VmaAllocationCreateInfo set(VmaAllocationCreateInfo other) {
        return set(other.segment);
    }
    
    @Override
    public VmaAllocationCreateInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VmaAllocationCreateInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VmaAllocationCreateInfo> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VmaAllocationCreateInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<VmaAllocationCreateInfo> array(Arena arena, VmaAllocationCreateInfo... structs) {
        NativeStructArray<VmaAllocationCreateInfo> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VmaAllocationCreateInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VmaAllocationCreateInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VmaAllocationCreateInfo(segment)
        );
    }

}