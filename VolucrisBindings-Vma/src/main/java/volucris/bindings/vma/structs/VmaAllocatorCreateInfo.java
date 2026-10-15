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
import volucris.bindings.core.NativeIntArray;
import volucris.bindings.core.NativeLongArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.VkDevice;
import volucris.bindings.vulkan.VkInstance;
import volucris.bindings.vulkan.VkPhysicalDevice;
import volucris.bindings.vulkan.structs.VkAllocationCallbacks;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;
import static volucris.bindings.core.FFMUtils.UNBOUNDED_ADDRESS;

/// ```
/// Description of a Allocator to be created.
/// ```
public final class VmaAllocatorCreateInfo
		implements Struct<VmaAllocatorCreateInfo> {

	public static final StructLayout LAYOUT;

	public static final VarHandle FLAGS_HANDLE;
	public static final VarHandle PHYSICAL_DEVICE_HANDLE;
	public static final VarHandle DEVICE_HANDLE;
	public static final VarHandle PREFERRED_LARGE_HEAP_BLOCK_SIZE_HANDLE;
	public static final VarHandle P_ALLOCATION_CALLBACKS_HANDLE;
	public static final VarHandle P_DEVICE_MEMORY_CALLBACKS_HANDLE;
	public static final VarHandle P_HEAP_SIZE_LIMIT_HANDLE;
	public static final VarHandle P_VULKAN_FUNCTIONS_HANDLE;
	public static final VarHandle INSTANCE_HANDLE;
	public static final VarHandle VULKAN_API_VERSION_HANDLE;
	public static final VarHandle P_TYPE_EXTERNAL_MEMORY_HANDLE_TYPES_HANDLE;

	public static final long FLAGS_BYTE_OFFSET;
	public static final long PHYSICAL_DEVICE_BYTE_OFFSET;
	public static final long DEVICE_BYTE_OFFSET;
	public static final long PREFERRED_LARGE_HEAP_BLOCK_SIZE_BYTE_OFFSET;
	public static final long P_ALLOCATION_CALLBACKS_BYTE_OFFSET;
	public static final long P_DEVICE_MEMORY_CALLBACKS_BYTE_OFFSET;
	public static final long P_HEAP_SIZE_LIMIT_BYTE_OFFSET;
	public static final long P_VULKAN_FUNCTIONS_BYTE_OFFSET;
	public static final long INSTANCE_BYTE_OFFSET;
	public static final long VULKAN_API_VERSION_BYTE_OFFSET;
	public static final long P_TYPE_EXTERNAL_MEMORY_HANDLE_TYPES_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("flags"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("physicalDevice"),
		    UNBOUNDED_ADDRESS.withName("device"),
		    JAVA_LONG.withName("preferredLargeHeapBlockSize"),
		    UNBOUNDED_ADDRESS.withName("pAllocationCallbacks"),
		    UNBOUNDED_ADDRESS.withName("pDeviceMemoryCallbacks"),
		    UNBOUNDED_ADDRESS.withName("pHeapSizeLimit"),
		    UNBOUNDED_ADDRESS.withName("pVulkanFunctions"),
		    UNBOUNDED_ADDRESS.withName("instance"),
		    JAVA_INT.withName("vulkanApiVersion"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pTypeExternalMemoryHandleTypes")
		).withName("VmaAllocatorCreateInfo").withByteAlignment(8);
		
		FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
		PHYSICAL_DEVICE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("physicalDevice"));
		DEVICE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("device"));
		PREFERRED_LARGE_HEAP_BLOCK_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("preferredLargeHeapBlockSize"));
		P_ALLOCATION_CALLBACKS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pAllocationCallbacks"));
		P_DEVICE_MEMORY_CALLBACKS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pDeviceMemoryCallbacks"));
		P_HEAP_SIZE_LIMIT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pHeapSizeLimit"));
		P_VULKAN_FUNCTIONS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pVulkanFunctions"));
		INSTANCE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("instance"));
		VULKAN_API_VERSION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("vulkanApiVersion"));
		P_TYPE_EXTERNAL_MEMORY_HANDLE_TYPES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pTypeExternalMemoryHandleTypes"));
		
		FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
		PHYSICAL_DEVICE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("physicalDevice"));
		DEVICE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("device"));
		PREFERRED_LARGE_HEAP_BLOCK_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("preferredLargeHeapBlockSize"));
		P_ALLOCATION_CALLBACKS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pAllocationCallbacks"));
		P_DEVICE_MEMORY_CALLBACKS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pDeviceMemoryCallbacks"));
		P_HEAP_SIZE_LIMIT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pHeapSizeLimit"));
		P_VULKAN_FUNCTIONS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pVulkanFunctions"));
		INSTANCE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("instance"));
		VULKAN_API_VERSION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vulkanApiVersion"));
		P_TYPE_EXTERNAL_MEMORY_HANDLE_TYPES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pTypeExternalMemoryHandleTypes"));
		//@formatter:on
	}

	public VmaAllocatorCreateInfo() {
	    this(Arena.ofAuto());
	}
	
	public VmaAllocatorCreateInfo(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VmaAllocatorCreateInfo(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #flags()
    public VmaAllocatorCreateInfo flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    /// ```
    /// Flags for created allocator. Use #VmaAllocatorCreateFlagBits enum.
    /// ```
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #physicalDevice()
    public VmaAllocatorCreateInfo physicalDevice(VkPhysicalDevice physicalDevice) {
    	PHYSICAL_DEVICE_HANDLE.set(segment, 0L, physicalDevice.memorySegment());
    	return this;
    }
    
    /// ```
    /// Vulkan physical device.
    ///     /** It must be valid throughout whole lifetime of created allocator.
    /// ```
    public @Nullable VkPhysicalDevice physicalDevice() {
    	MemorySegment segment = (MemorySegment) PHYSICAL_DEVICE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkPhysicalDevice(segment);
    }
    
    /// @see #device()
    public VmaAllocatorCreateInfo device(VkDevice device) {
    	DEVICE_HANDLE.set(segment, 0L, device.memorySegment());
    	return this;
    }
    
    /// ```
    /// Vulkan device.
    ///     /** It must be valid throughout whole lifetime of created allocator.
    /// ```
    public @Nullable VkDevice device() {
    	MemorySegment segment = (MemorySegment) DEVICE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkDevice(segment);
    }
    
    /// @see #preferredLargeHeapBlockSize()
    public VmaAllocatorCreateInfo preferredLargeHeapBlockSize(long preferredLargeHeapBlockSize) {
    	PREFERRED_LARGE_HEAP_BLOCK_SIZE_HANDLE.set(segment, 0L, preferredLargeHeapBlockSize);
    	return this;
    }
    
    /// ```
    /// Preferred size of a single `VkDeviceMemory` block to be allocated from large heaps > 1 GiB. Optional.
    ///     /** Set to 0 to use default, which is currently 256 MiB.
    /// ```
    public long preferredLargeHeapBlockSize() {
    	return (long) PREFERRED_LARGE_HEAP_BLOCK_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pAllocationCallbacks()
    public VmaAllocatorCreateInfo pAllocationCallbacks(VkAllocationCallbacks pAllocationCallbacks) {
    	P_ALLOCATION_CALLBACKS_HANDLE.set(segment, 0L, pAllocationCallbacks.memorySegment());
    	return this;
    }
    
    /// ```
    /// Custom CPU memory allocation callbacks. Optional.
    ///     /** Optional, can be null. When specified, will also be used for all CPU-side memory allocations.
    /// ```
    public @Nullable VkAllocationCallbacks pAllocationCallbacks() {
    	MemorySegment segment = (MemorySegment) P_ALLOCATION_CALLBACKS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkAllocationCallbacks(segment);
    }
    
    /// @see #pDeviceMemoryCallbacks()
    public VmaAllocatorCreateInfo pDeviceMemoryCallbacks(VmaDeviceMemoryCallbacks pDeviceMemoryCallbacks) {
    	P_DEVICE_MEMORY_CALLBACKS_HANDLE.set(segment, 0L, pDeviceMemoryCallbacks.memorySegment());
    	return this;
    }
    
    /// ```
    /// Informative callbacks for `vkAllocateMemory`, `vkFreeMemory`. Optional.
    ///     /** Optional, can be null.
    /// ```
    public @Nullable VmaDeviceMemoryCallbacks pDeviceMemoryCallbacks() {
    	MemorySegment segment = (MemorySegment) P_DEVICE_MEMORY_CALLBACKS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VmaDeviceMemoryCallbacks(segment);
    }
    
    /// @see #pHeapSizeLimit()
    public VmaAllocatorCreateInfo pHeapSizeLimit(NativeLongArray pHeapSizeLimit) {
    	P_HEAP_SIZE_LIMIT_HANDLE.set(segment, 0L, pHeapSizeLimit.memorySegment());
    	return this;
    }
    
    /// ```
    /// \brief Either null or a pointer to an array of limits on maximum number of bytes that can be allocated out of particular Vulkan memory heap.
    /// 
    ///     If not NULL, it must be a pointer to an array of
    ///     `VkPhysicalDeviceMemoryProperties::memoryHeapCount` elements, defining limit on
    ///     maximum number of bytes that can be allocated out of particular Vulkan memory
    ///     heap.
    /// 
    ///     Any of the elements may be equal to `VK_WHOLE_SIZE`, which means no limit on that
    ///     heap. This is also the default in case of `pHeapSizeLimit` = NULL.
    /// 
    ///     If there is a limit defined for a heap:
    /// 
    ///     - If user tries to allocate more memory from that heap using this allocator,
    ///       the allocation fails with `VK_ERROR_OUT_OF_DEVICE_MEMORY`.
    ///     - If the limit is smaller than heap size reported in `VkMemoryHeap::size`, the
    ///       value of this limit will be reported instead when using vmaGetMemoryProperties().
    /// 
    ///     Warning! Using this feature may not be equivalent to installing a GPU with
    ///     smaller amount of memory, because graphics driver doesn't necessary fail new
    ///     allocations with `VK_ERROR_OUT_OF_DEVICE_MEMORY` result when memory capacity is
    ///     exceeded. It may return success and just silently migrate some device memory
    ///     blocks to system RAM. This driver behavior can also be controlled using
    ///     VK_AMD_memory_overallocation_behavior extension.
    /// ```
    public @Nullable NativeLongArray pHeapSizeLimit() {
    	MemorySegment segment = (MemorySegment) P_HEAP_SIZE_LIMIT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeLongArray(segment);
    }
    
    /// @see #pVulkanFunctions()
    public VmaAllocatorCreateInfo pVulkanFunctions(VmaVulkanFunctions pVulkanFunctions) {
    	P_VULKAN_FUNCTIONS_HANDLE.set(segment, 0L, pVulkanFunctions.memorySegment());
    	return this;
    }
    
    /// ```
    /// \brief Pointers to Vulkan functions. Can be null.
    /// 
    ///     For details see [Pointers to Vulkan functions](@ref config_Vulkan_functions).
    /// ```
    public @Nullable VmaVulkanFunctions pVulkanFunctions() {
    	MemorySegment segment = (MemorySegment) P_VULKAN_FUNCTIONS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VmaVulkanFunctions(segment);
    }
    
    /// @see #instance()
    public VmaAllocatorCreateInfo instance(VkInstance instance) {
    	INSTANCE_HANDLE.set(segment, 0L, instance.memorySegment());
    	return this;
    }
    
    /// ```
    /// \brief Handle to Vulkan instance object.
    /// 
    ///     Starting from version 3.0.0 this member is no longer optional, it must be set!
    /// ```
    public @Nullable VkInstance instance() {
    	MemorySegment segment = (MemorySegment) INSTANCE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkInstance(segment);
    }
    
    /// @see #vulkanApiVersion()
    public VmaAllocatorCreateInfo vulkanApiVersion(int vulkanApiVersion) {
    	VULKAN_API_VERSION_HANDLE.set(segment, 0L, vulkanApiVersion);
    	return this;
    }
    
    /// ```
    /// \brief Optional. Vulkan version that the application uses.
    /// 
    ///     It must be a value in the format as created by macro `VK_MAKE_VERSION` or a constant like: `VK_API_VERSION_1_1`, `VK_API_VERSION_1_0`.
    ///     The patch version number specified is ignored. Only the major and minor versions are considered.
    ///     Only versions 1.0...1.4 are supported by the current implementation.
    ///     Leaving it initialized to zero is equivalent to `VK_API_VERSION_1_0`.
    ///     It must match the Vulkan version used by the application and supported on the selected physical device,
    ///     so it must be no higher than `VkApplicationInfo::apiVersion` passed to `vkCreateInstance`
    ///     and no higher than `VkPhysicalDeviceProperties::apiVersion` found on the physical device used.
    /// ```
    public int vulkanApiVersion() {
    	return (int) VULKAN_API_VERSION_HANDLE.get(segment, 0L);
    }
    
    /// @see #pTypeExternalMemoryHandleTypes()
    public VmaAllocatorCreateInfo pTypeExternalMemoryHandleTypes(NativeIntArray pTypeExternalMemoryHandleTypes) {
    	P_TYPE_EXTERNAL_MEMORY_HANDLE_TYPES_HANDLE.set(segment, 0L, pTypeExternalMemoryHandleTypes.memorySegment());
    	return this;
    }
    
    /// ```
    /// \brief Either null or a pointer to an array of external memory handle types for each Vulkan memory type.
    /// 
    ///     If not NULL, it must be a pointer to an array of `VkPhysicalDeviceMemoryProperties::memoryTypeCount`
    ///     elements, defining external memory handle types of particular Vulkan memory type,
    ///     to be passed using `VkExportMemoryAllocateInfoKHR`.
    /// 
    ///     Any of the elements may be equal to 0, which means not to use `VkExportMemoryAllocateInfoKHR` on this memory type.
    ///     This is also the default in case of `pTypeExternalMemoryHandleTypes` = NULL.
    /// ```
    public @Nullable NativeIntArray pTypeExternalMemoryHandleTypes() {
    	MemorySegment segment = (MemorySegment) P_TYPE_EXTERNAL_MEMORY_HANDLE_TYPES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeIntArray(segment);
    }
    
    @Override
    public VmaAllocatorCreateInfo set(VmaAllocatorCreateInfo other) {
        return set(other.segment);
    }
    
    @Override
    public VmaAllocatorCreateInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VmaAllocatorCreateInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VmaAllocatorCreateInfo> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VmaAllocatorCreateInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<VmaAllocatorCreateInfo> array(Arena arena, VmaAllocatorCreateInfo... structs) {
        NativeStructArray<VmaAllocatorCreateInfo> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VmaAllocatorCreateInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VmaAllocatorCreateInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VmaAllocatorCreateInfo(segment)
        );
    }

}