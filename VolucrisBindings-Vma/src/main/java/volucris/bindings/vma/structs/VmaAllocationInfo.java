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
import volucris.bindings.core.NativeByteArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.handles.VkDeviceMemory;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;
import static volucris.bindings.core.FFMUtils.UNBOUNDED_ADDRESS;

/// ```
/// 
/// Parameters of #VmaAllocation objects, that can be retrieved using function vmaGetAllocationInfo().
/// 
/// There is also an extended version of this structure that carries additional parameters: #VmaAllocationInfo2.
/// ```
public final class VmaAllocationInfo
		implements Struct<VmaAllocationInfo> {

	public static final StructLayout LAYOUT;

	public static final VarHandle MEMORY_TYPE_HANDLE;
	public static final VarHandle DEVICE_MEMORY_HANDLE;
	public static final VarHandle OFFSET_HANDLE;
	public static final VarHandle SIZE_HANDLE;
	public static final VarHandle P_MAPPED_DATA_HANDLE;
	public static final VarHandle P_USER_DATA_HANDLE;
	public static final VarHandle P_NAME_HANDLE;

	public static final long MEMORY_TYPE_BYTE_OFFSET;
	public static final long DEVICE_MEMORY_BYTE_OFFSET;
	public static final long OFFSET_BYTE_OFFSET;
	public static final long SIZE_BYTE_OFFSET;
	public static final long P_MAPPED_DATA_BYTE_OFFSET;
	public static final long P_USER_DATA_BYTE_OFFSET;
	public static final long P_NAME_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("memoryType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("deviceMemory"),
		    JAVA_LONG.withName("offset"),
		    JAVA_LONG.withName("size"),
		    UNBOUNDED_ADDRESS.withName("pMappedData"),
		    UNBOUNDED_ADDRESS.withName("pUserData"),
		    UNBOUNDED_ADDRESS.withName("pName")
		).withName("VmaAllocationInfo").withByteAlignment(8);
		
		MEMORY_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("memoryType"));
		DEVICE_MEMORY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("deviceMemory"));
		OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("offset"));
		SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("size"));
		P_MAPPED_DATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pMappedData"));
		P_USER_DATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pUserData"));
		P_NAME_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pName"));
		
		MEMORY_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("memoryType"));
		DEVICE_MEMORY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("deviceMemory"));
		OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("offset"));
		SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("size"));
		P_MAPPED_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pMappedData"));
		P_USER_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pUserData"));
		P_NAME_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pName"));
		//@formatter:on
	}

	public VmaAllocationInfo() {
	    this(Arena.ofAuto());
	}
	
	public VmaAllocationInfo(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VmaAllocationInfo(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #memoryType()
    public VmaAllocationInfo memoryType(int memoryType) {
    	MEMORY_TYPE_HANDLE.set(segment, 0L, memoryType);
    	return this;
    }
    
    /// ```
    /// \brief Memory type index that this allocation was allocated from.
    /// 
    ///     It never changes.
    /// ```
    public int memoryType() {
    	return (int) MEMORY_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #deviceMemory()
    public VmaAllocationInfo deviceMemory(VkDeviceMemory deviceMemory) {
    	DEVICE_MEMORY_HANDLE.set(segment, 0L, deviceMemory.memorySegment());
    	return this;
    }
    
    /// ```
    /// \brief Handle to Vulkan memory object.
    /// 
    ///     Same memory object can be shared by multiple allocations.
    /// 
    ///     It can change after the allocation is moved during \ref defragmentation.
    /// ```
    public @Nullable VkDeviceMemory deviceMemory() {
    	MemorySegment segment = (MemorySegment) DEVICE_MEMORY_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkDeviceMemory(segment);
    }
    
    /// @see #offset()
    public VmaAllocationInfo offset(long offset) {
    	OFFSET_HANDLE.set(segment, 0L, offset);
    	return this;
    }
    
    /// ```
    /// \brief Offset in `VkDeviceMemory` object to the beginning of this allocation, in bytes. `(deviceMemory, offset)` pair is unique to this allocation.
    /// 
    ///     You usually don't need to use this offset. If you create a buffer or an image together with the allocation using e.g. function
    ///     vmaCreateBuffer(), vmaCreateImage(), functions that operate on these resources refer to the beginning of the buffer or image,
    ///     not entire device memory block. Functions like vmaMapMemory(), vmaBindBufferMemory() also refer to the beginning of the allocation
    ///     and apply this offset automatically.
    /// 
    ///     It can change after the allocation is moved during \ref defragmentation.
    /// ```
    public long offset() {
    	return (long) OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #size()
    public VmaAllocationInfo size(long size) {
    	SIZE_HANDLE.set(segment, 0L, size);
    	return this;
    }
    
    /// ```
    /// \brief Size of this allocation, in bytes.
    /// 
    ///     It never changes.
    /// 
    ///     \note Allocation size returned in this variable may be greater than the size
    ///     requested for the resource e.g. as `VkBufferCreateInfo::size`. Whole size of the
    ///     allocation is accessible for operations on memory e.g. using a pointer after
    ///     mapping with vmaMapMemory(), but operations on the resource e.g. using
    ///     `vkCmdCopyBuffer` must be limited to the size of the resource.
    /// ```
    public long size() {
    	return (long) SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pMappedData()
    public VmaAllocationInfo pMappedData(MemorySegment pMappedData) {
    	P_MAPPED_DATA_HANDLE.set(segment, 0L, pMappedData);
    	return this;
    }
    
    /// ```
    /// \brief Pointer to the beginning of this allocation as mapped data.
    /// 
    ///     If the allocation hasn't been mapped using vmaMapMemory() and hasn't been
    ///     created with #VMA_ALLOCATION_CREATE_MAPPED_BIT flag, this value is null.
    /// 
    ///     It can change after call to vmaMapMemory(), vmaUnmapMemory().
    ///     It can also change after the allocation is moved during \ref defragmentation.
    /// ```
    public @Nullable MemorySegment pMappedData() {
    	MemorySegment segment = (MemorySegment) P_MAPPED_DATA_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #pUserData()
    public VmaAllocationInfo pUserData(MemorySegment pUserData) {
    	P_USER_DATA_HANDLE.set(segment, 0L, pUserData);
    	return this;
    }
    
    /// ```
    /// \brief Custom general-purpose pointer that was passed as VmaAllocationCreateInfo::pUserData or set using vmaSetAllocationUserData().
    /// 
    ///     It can change after call to vmaSetAllocationUserData() for this allocation.
    /// ```
    public @Nullable MemorySegment pUserData() {
    	MemorySegment segment = (MemorySegment) P_USER_DATA_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #pName()
    public VmaAllocationInfo pName(NativeByteArray pName) {
    	P_NAME_HANDLE.set(segment, 0L, pName.memorySegment());
    	return this;
    }
    
    /// ```
    /// \brief Custom allocation name that was set with vmaSetAllocationName().
    /// 
    ///     It can change after call to vmaSetAllocationName() for this allocation.
    /// 
    ///     Another way to set custom name is to pass it in VmaAllocationCreateInfo::pUserData with
    ///     additional flag #VMA_ALLOCATION_CREATE_USER_DATA_COPY_STRING_BIT set [DEPRECATED].
    /// ```
    public @Nullable NativeByteArray pName() {
    	MemorySegment segment = (MemorySegment) P_NAME_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeByteArray(segment);
    }
    
    @Override
    public VmaAllocationInfo set(VmaAllocationInfo other) {
        return set(other.segment);
    }
    
    @Override
    public VmaAllocationInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VmaAllocationInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VmaAllocationInfo> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VmaAllocationInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<VmaAllocationInfo> array(Arena arena, VmaAllocationInfo... structs) {
        NativeStructArray<VmaAllocationInfo> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VmaAllocationInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VmaAllocationInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VmaAllocationInfo(segment)
        );
    }

}