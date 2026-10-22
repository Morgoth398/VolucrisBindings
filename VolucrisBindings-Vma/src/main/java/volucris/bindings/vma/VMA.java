/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vma;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.MemoryStack;
import volucris.bindings.core.NativeByteArray;
import volucris.bindings.core.NativeIntArray;
import volucris.bindings.core.NativeLongArray;
import volucris.bindings.core.NativePointerArray;
import volucris.bindings.vma.structs.*;
import volucris.bindings.vulkan.handles.VkBuffer;
import volucris.bindings.vulkan.handles.VkImage;
import volucris.bindings.vulkan.structs.VkBufferCreateInfo;
import volucris.bindings.vulkan.structs.VkImageCreateInfo;
import volucris.bindings.vulkan.structs.VkMemoryRequirements;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VMA {

	private static final LazyConstant<MethodHandle> VMA_CREATE_ALLOCATOR;
	private static final LazyConstant<MethodHandle> VMA_DESTROY_ALLOCATOR;
	private static final LazyConstant<MethodHandle> VMA_GET_ALLOCATOR_INFO;
	private static final LazyConstant<MethodHandle> VMA_GET_PHYSICAL_DEVICE_PROPERTIES;
	private static final LazyConstant<MethodHandle> VMA_GET_MEMORY_PROPERTIES;
	private static final LazyConstant<MethodHandle> VMA_GET_MEMORY_TYPE_PROPERTIES;
	private static final LazyConstant<MethodHandle> VMA_SET_CURRENT_FRAME_INDEX;
	private static final LazyConstant<MethodHandle> VMA_CALCULATE_STATISTICS;
	private static final LazyConstant<MethodHandle> VMA_GET_HEAP_BUDGETS;
	private static final LazyConstant<MethodHandle> VMA_FIND_MEMORY_TYPE_INDEX;
	private static final LazyConstant<MethodHandle> VMA_FIND_MEMORY_TYPE_INDEX_FOR_BUFFER_INFO;
	private static final LazyConstant<MethodHandle> VMA_FIND_MEMORY_TYPE_INDEX_FOR_IMAGE_INFO;
	private static final LazyConstant<MethodHandle> VMA_CREATE_POOL;
	private static final LazyConstant<MethodHandle> VMA_DESTROY_POOL;
	private static final LazyConstant<MethodHandle> VMA_GET_POOL_STATISTICS;
	private static final LazyConstant<MethodHandle> VMA_CALCULATE_POOL_STATISTICS;
	private static final LazyConstant<MethodHandle> VMA_CHECK_POOL_CORRUPTION;
	private static final LazyConstant<MethodHandle> VMA_GET_POOL_NAME;
	private static final LazyConstant<MethodHandle> VMA_SET_POOL_NAME;
	private static final LazyConstant<MethodHandle> VMA_ALLOCATE_MEMORY;
	private static final LazyConstant<MethodHandle> VMA_ALLOCATE_DEDICATED_MEMORY;
	private static final LazyConstant<MethodHandle> VMA_ALLOCATE_MEMORY_PAGES;
	private static final LazyConstant<MethodHandle> VMA_ALLOCATE_MEMORY_FOR_BUFFER;
	private static final LazyConstant<MethodHandle> VMA_ALLOCATE_MEMORY_FOR_IMAGE;
	private static final LazyConstant<MethodHandle> VMA_FREE_MEMORY;
	private static final LazyConstant<MethodHandle> VMA_FREE_MEMORY_PAGES;
	private static final LazyConstant<MethodHandle> VMA_GET_ALLOCATION_INFO;
	private static final LazyConstant<MethodHandle> VMA_GET_ALLOCATION_INFO2;
	private static final LazyConstant<MethodHandle> VMA_SET_ALLOCATION_USER_DATA;
	private static final LazyConstant<MethodHandle> VMA_SET_ALLOCATION_NAME;
	private static final LazyConstant<MethodHandle> VMA_GET_ALLOCATION_MEMORY_PROPERTIES;
	private static final LazyConstant<MethodHandle> VMA_MAP_MEMORY;
	private static final LazyConstant<MethodHandle> VMA_UNMAP_MEMORY;
	private static final LazyConstant<MethodHandle> VMA_FLUSH_ALLOCATION;
	private static final LazyConstant<MethodHandle> VMA_INVALIDATE_ALLOCATION;
	private static final LazyConstant<MethodHandle> VMA_FLUSH_ALLOCATIONS;
	private static final LazyConstant<MethodHandle> VMA_INVALIDATE_ALLOCATIONS;
	private static final LazyConstant<MethodHandle> VMA_COPY_MEMORY_TO_ALLOCATION;
	private static final LazyConstant<MethodHandle> VMA_COPY_ALLOCATION_TO_MEMORY;
	private static final LazyConstant<MethodHandle> VMA_CHECK_CORRUPTION;
	private static final LazyConstant<MethodHandle> VMA_BEGIN_DEFRAGMENTATION;
	private static final LazyConstant<MethodHandle> VMA_END_DEFRAGMENTATION;
	private static final LazyConstant<MethodHandle> VMA_BEGIN_DEFRAGMENTATION_PASS;
	private static final LazyConstant<MethodHandle> VMA_END_DEFRAGMENTATION_PASS;
	private static final LazyConstant<MethodHandle> VMA_BIND_BUFFER_MEMORY;
	private static final LazyConstant<MethodHandle> VMA_BIND_BUFFER_MEMORY2;
	private static final LazyConstant<MethodHandle> VMA_BIND_IMAGE_MEMORY;
	private static final LazyConstant<MethodHandle> VMA_BIND_IMAGE_MEMORY2;
	private static final LazyConstant<MethodHandle> VMA_CREATE_BUFFER;
	private static final LazyConstant<MethodHandle> VMA_CREATE_BUFFER_WITH_ALIGNMENT;
	private static final LazyConstant<MethodHandle> VMA_CREATE_DEDICATED_BUFFER;
	private static final LazyConstant<MethodHandle> VMA_CREATE_ALIASING_BUFFER;
	private static final LazyConstant<MethodHandle> VMA_CREATE_ALIASING_BUFFER2;
	private static final LazyConstant<MethodHandle> VMA_DESTROY_BUFFER;
	private static final LazyConstant<MethodHandle> VMA_CREATE_IMAGE;
	private static final LazyConstant<MethodHandle> VMA_CREATE_DEDICATED_IMAGE;
	private static final LazyConstant<MethodHandle> VMA_CREATE_ALIASING_IMAGE;
	private static final LazyConstant<MethodHandle> VMA_CREATE_ALIASING_IMAGE2;
	private static final LazyConstant<MethodHandle> VMA_DESTROY_IMAGE;
	private static final LazyConstant<MethodHandle> VMA_CREATE_VIRTUAL_BLOCK;
	private static final LazyConstant<MethodHandle> VMA_DESTROY_VIRTUAL_BLOCK;
	private static final LazyConstant<MethodHandle> VMA_IS_VIRTUAL_BLOCK_EMPTY;
	private static final LazyConstant<MethodHandle> VMA_GET_VIRTUAL_ALLOCATION_INFO;
	private static final LazyConstant<MethodHandle> VMA_VIRTUAL_ALLOCATE;
	private static final LazyConstant<MethodHandle> VMA_VIRTUAL_FREE;
	private static final LazyConstant<MethodHandle> VMA_CLEAR_VIRTUAL_BLOCK;
	private static final LazyConstant<MethodHandle> VMA_SET_VIRTUAL_ALLOCATION_USER_DATA;
	private static final LazyConstant<MethodHandle> VMA_GET_VIRTUAL_BLOCK_STATISTICS;
	private static final LazyConstant<MethodHandle> VMA_CALCULATE_VIRTUAL_BLOCK_STATISTICS;
	private static final LazyConstant<MethodHandle> VMA_BUILD_VIRTUAL_BLOCK_STATS_STRING;
	private static final LazyConstant<MethodHandle> VMA_FREE_VIRTUAL_BLOCK_STATS_STRING;
	private static final LazyConstant<MethodHandle> VMA_BUILD_STATS_STRING;
	private static final LazyConstant<MethodHandle> VMA_FREE_STATS_STRING;

	static {
		//@formatter:off
		VMA_CREATE_ALLOCATOR = downcallHandle("vmaCreateAllocator", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		VMA_DESTROY_ALLOCATOR = downcallHandleVoid("vmaDestroyAllocator", UNBOUNDED_ADDRESS);
		VMA_GET_ALLOCATOR_INFO = downcallHandleVoid("vmaGetAllocatorInfo", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		VMA_GET_PHYSICAL_DEVICE_PROPERTIES = downcallHandleVoid("vmaGetPhysicalDeviceProperties", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		VMA_GET_MEMORY_PROPERTIES = downcallHandleVoid("vmaGetMemoryProperties", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		VMA_GET_MEMORY_TYPE_PROPERTIES = downcallHandleVoid("vmaGetMemoryTypeProperties", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
		VMA_SET_CURRENT_FRAME_INDEX = downcallHandleVoid("vmaSetCurrentFrameIndex", UNBOUNDED_ADDRESS, JAVA_INT);
		VMA_CALCULATE_STATISTICS = downcallHandleVoid("vmaCalculateStatistics", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		VMA_GET_HEAP_BUDGETS = downcallHandleVoid("vmaGetHeapBudgets", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		VMA_FIND_MEMORY_TYPE_INDEX = downcallHandle("vmaFindMemoryTypeIndex", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		VMA_FIND_MEMORY_TYPE_INDEX_FOR_BUFFER_INFO = downcallHandle("vmaFindMemoryTypeIndexForBufferInfo", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		VMA_FIND_MEMORY_TYPE_INDEX_FOR_IMAGE_INFO = downcallHandle("vmaFindMemoryTypeIndexForImageInfo", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		VMA_CREATE_POOL = downcallHandle("vmaCreatePool", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		VMA_DESTROY_POOL = downcallHandleVoid("vmaDestroyPool", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		VMA_GET_POOL_STATISTICS = downcallHandleVoid("vmaGetPoolStatistics", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		VMA_CALCULATE_POOL_STATISTICS = downcallHandleVoid("vmaCalculatePoolStatistics", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		VMA_CHECK_POOL_CORRUPTION = downcallHandle("vmaCheckPoolCorruption", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		VMA_GET_POOL_NAME = downcallHandleVoid("vmaGetPoolName", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		VMA_SET_POOL_NAME = downcallHandleVoid("vmaSetPoolName", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		VMA_ALLOCATE_MEMORY = downcallHandle("vmaAllocateMemory", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		VMA_ALLOCATE_DEDICATED_MEMORY = downcallHandle("vmaAllocateDedicatedMemory", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		VMA_ALLOCATE_MEMORY_PAGES = downcallHandle("vmaAllocateMemoryPages", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		VMA_ALLOCATE_MEMORY_FOR_BUFFER = downcallHandle("vmaAllocateMemoryForBuffer", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		VMA_ALLOCATE_MEMORY_FOR_IMAGE = downcallHandle("vmaAllocateMemoryForImage", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		VMA_FREE_MEMORY = downcallHandleVoid("vmaFreeMemory", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		VMA_FREE_MEMORY_PAGES = downcallHandleVoid("vmaFreeMemoryPages", UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS);
		VMA_GET_ALLOCATION_INFO = downcallHandleVoid("vmaGetAllocationInfo", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		VMA_GET_ALLOCATION_INFO2 = downcallHandleVoid("vmaGetAllocationInfo2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		VMA_SET_ALLOCATION_USER_DATA = downcallHandleVoid("vmaSetAllocationUserData", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		VMA_SET_ALLOCATION_NAME = downcallHandleVoid("vmaSetAllocationName", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		VMA_GET_ALLOCATION_MEMORY_PROPERTIES = downcallHandleVoid("vmaGetAllocationMemoryProperties", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		VMA_MAP_MEMORY = downcallHandle("vmaMapMemory", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		VMA_UNMAP_MEMORY = downcallHandleVoid("vmaUnmapMemory", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		VMA_FLUSH_ALLOCATION = downcallHandle("vmaFlushAllocation", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG);
		VMA_INVALIDATE_ALLOCATION = downcallHandle("vmaInvalidateAllocation", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG);
		VMA_FLUSH_ALLOCATIONS = downcallHandle("vmaFlushAllocations", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		VMA_INVALIDATE_ALLOCATIONS = downcallHandle("vmaInvalidateAllocations", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		VMA_COPY_MEMORY_TO_ALLOCATION = downcallHandle("vmaCopyMemoryToAllocation", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG);
		VMA_COPY_ALLOCATION_TO_MEMORY = downcallHandle("vmaCopyAllocationToMemory", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS, JAVA_LONG);
		VMA_CHECK_CORRUPTION = downcallHandle("vmaCheckCorruption", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT);
		VMA_BEGIN_DEFRAGMENTATION = downcallHandle("vmaBeginDefragmentation", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		VMA_END_DEFRAGMENTATION = downcallHandleVoid("vmaEndDefragmentation", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		VMA_BEGIN_DEFRAGMENTATION_PASS = downcallHandle("vmaBeginDefragmentationPass", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		VMA_END_DEFRAGMENTATION_PASS = downcallHandle("vmaEndDefragmentationPass", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		VMA_BIND_BUFFER_MEMORY = downcallHandle("vmaBindBufferMemory", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		VMA_BIND_BUFFER_MEMORY2 = downcallHandle("vmaBindBufferMemory2", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		VMA_BIND_IMAGE_MEMORY = downcallHandle("vmaBindImageMemory", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		VMA_BIND_IMAGE_MEMORY2 = downcallHandle("vmaBindImageMemory2", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		VMA_CREATE_BUFFER = downcallHandle("vmaCreateBuffer", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		VMA_CREATE_BUFFER_WITH_ALIGNMENT = downcallHandle("vmaCreateBufferWithAlignment", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		VMA_CREATE_DEDICATED_BUFFER = downcallHandle("vmaCreateDedicatedBuffer", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		VMA_CREATE_ALIASING_BUFFER = downcallHandle("vmaCreateAliasingBuffer", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		VMA_CREATE_ALIASING_BUFFER2 = downcallHandle("vmaCreateAliasingBuffer2", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		VMA_DESTROY_BUFFER = downcallHandleVoid("vmaDestroyBuffer", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		VMA_CREATE_IMAGE = downcallHandle("vmaCreateImage", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		VMA_CREATE_DEDICATED_IMAGE = downcallHandle("vmaCreateDedicatedImage", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		VMA_CREATE_ALIASING_IMAGE = downcallHandle("vmaCreateAliasingImage", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		VMA_CREATE_ALIASING_IMAGE2 = downcallHandle("vmaCreateAliasingImage2", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		VMA_DESTROY_IMAGE = downcallHandleVoid("vmaDestroyImage", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		VMA_CREATE_VIRTUAL_BLOCK = downcallHandle("vmaCreateVirtualBlock", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		VMA_DESTROY_VIRTUAL_BLOCK = downcallHandleVoid("vmaDestroyVirtualBlock", UNBOUNDED_ADDRESS);
		VMA_IS_VIRTUAL_BLOCK_EMPTY = downcallHandle("vmaIsVirtualBlockEmpty", JAVA_INT, UNBOUNDED_ADDRESS);
		VMA_GET_VIRTUAL_ALLOCATION_INFO = downcallHandleVoid("vmaGetVirtualAllocationInfo", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		VMA_VIRTUAL_ALLOCATE = downcallHandle("vmaVirtualAllocate", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		VMA_VIRTUAL_FREE = downcallHandleVoid("vmaVirtualFree", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		VMA_CLEAR_VIRTUAL_BLOCK = downcallHandleVoid("vmaClearVirtualBlock", UNBOUNDED_ADDRESS);
		VMA_SET_VIRTUAL_ALLOCATION_USER_DATA = downcallHandleVoid("vmaSetVirtualAllocationUserData", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		VMA_GET_VIRTUAL_BLOCK_STATISTICS = downcallHandleVoid("vmaGetVirtualBlockStatistics", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		VMA_CALCULATE_VIRTUAL_BLOCK_STATISTICS = downcallHandleVoid("vmaCalculateVirtualBlockStatistics", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		VMA_BUILD_VIRTUAL_BLOCK_STATS_STRING = downcallHandleVoid("vmaBuildVirtualBlockStatsString", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
		VMA_FREE_VIRTUAL_BLOCK_STATS_STRING = downcallHandleVoid("vmaFreeVirtualBlockStatsString", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		VMA_BUILD_STATS_STRING = downcallHandleVoid("vmaBuildStatsString", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
		VMA_FREE_STATS_STRING = downcallHandleVoid("vmaFreeStatsString", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	private VMA() {
	}

    /// ```
    /// Creates #VmaAllocator object.
    /// ```
    public static int vmaCreateAllocator(
    	MemorySegment pCreateInfo,
    	MemorySegment pAllocator
    ) {
    	MethodHandle method = VMA_CREATE_ALLOCATOR.get();
    	try {
    		return (int) method.invokeExact(
    			pCreateInfo,
    			pAllocator
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#vmaCreateAllocator].
    public static int vmaCreateAllocator(
    	VmaAllocatorCreateInfo pCreateInfo,
    	NativePointerArray pAllocator
    ) {
    	return vmaCreateAllocator(
    		pCreateInfo.memorySegment(),
    		pAllocator.memorySegment()
    	);
    }
    
    /// ```
    /// Destroys allocator object.
    /// ```
    public static void vmaDestroyAllocator(
    	MemorySegment allocator
    ) {
    	MethodHandle method = VMA_DESTROY_ALLOCATOR.get();
    	try {
    		 method.invokeExact(
    			allocator
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#vmaDestroyAllocator].
    public static void vmaDestroyAllocator(
    	VmaAllocator allocator
    ) {
    	vmaDestroyAllocator(
    		allocator.memorySegment()
    	);
    }
    
    /// ```
    /// \brief Returns information about existing #VmaAllocator object - handle to Vulkan device etc.
    /// 
    /// It might be useful if you want to keep just the #VmaAllocator handle and fetch other required handles to
    /// `VkPhysicalDevice`, `VkDevice` etc. every time using this function.
    /// ```
    public static void vmaGetAllocatorInfo(
    	MemorySegment allocator,
    	MemorySegment pAllocatorInfo
    ) {
    	MethodHandle method = VMA_GET_ALLOCATOR_INFO.get();
    	try {
    		 method.invokeExact(
    			allocator,
    			pAllocatorInfo
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#vmaGetAllocatorInfo].
    public static void vmaGetAllocatorInfo(
    	VmaAllocator allocator,
    	VmaAllocatorInfo pAllocatorInfo
    ) {
    	vmaGetAllocatorInfo(
    		allocator.memorySegment(),
    		pAllocatorInfo.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// PhysicalDeviceProperties are fetched from physicalDevice by the allocator.
    /// You can access it here, without fetching it again on your own.
    /// ```
    public static void vmaGetPhysicalDeviceProperties(
    	MemorySegment allocator,
    	MemorySegment ppPhysicalDeviceProperties
    ) {
    	MethodHandle method = VMA_GET_PHYSICAL_DEVICE_PROPERTIES.get();
    	try {
    		 method.invokeExact(
    			allocator,
    			ppPhysicalDeviceProperties
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#vmaGetPhysicalDeviceProperties].
    public static void vmaGetPhysicalDeviceProperties(
    	VmaAllocator allocator,
    	NativePointerArray ppPhysicalDeviceProperties
    ) {
    	vmaGetPhysicalDeviceProperties(
    		allocator.memorySegment(),
    		ppPhysicalDeviceProperties.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// PhysicalDeviceMemoryProperties are fetched from physicalDevice by the allocator.
    /// You can access it here, without fetching it again on your own.
    /// ```
    public static void vmaGetMemoryProperties(
    	MemorySegment allocator,
    	MemorySegment ppPhysicalDeviceMemoryProperties
    ) {
    	MethodHandle method = VMA_GET_MEMORY_PROPERTIES.get();
    	try {
    		 method.invokeExact(
    			allocator,
    			ppPhysicalDeviceMemoryProperties
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#vmaGetMemoryProperties].
    public static void vmaGetMemoryProperties(
    	VmaAllocator allocator,
    	NativePointerArray ppPhysicalDeviceMemoryProperties
    ) {
    	vmaGetMemoryProperties(
    		allocator.memorySegment(),
    		ppPhysicalDeviceMemoryProperties.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// \brief Given Memory Type Index, returns Property Flags of this memory type.
    /// 
    /// This is just a convenience function. Same information can be obtained using
    /// vmaGetMemoryProperties().
    /// ```
    public static void vmaGetMemoryTypeProperties(
    	MemorySegment allocator,
    	int memoryTypeIndex,
    	MemorySegment pFlags
    ) {
    	MethodHandle method = VMA_GET_MEMORY_TYPE_PROPERTIES.get();
    	try {
    		 method.invokeExact(
    			allocator,
    			memoryTypeIndex,
    			pFlags
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#vmaGetMemoryTypeProperties].
    public static void vmaGetMemoryTypeProperties(
    	VmaAllocator allocator,
    	int memoryTypeIndex,
    	NativeIntArray pFlags
    ) {
    	vmaGetMemoryTypeProperties(
    		allocator.memorySegment(),
    		memoryTypeIndex,
    		pFlags.memorySegment()
    	);
    }
    
    /// ```
    /// \brief Sets index of the current frame.
    /// ```
    public static void vmaSetCurrentFrameIndex(
    	MemorySegment allocator,
    	int frameIndex
    ) {
    	MethodHandle method = VMA_SET_CURRENT_FRAME_INDEX.get();
    	try {
    		 method.invokeExact(
    			allocator,
    			frameIndex
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#vmaSetCurrentFrameIndex].
    public static void vmaSetCurrentFrameIndex(
    	VmaAllocator allocator,
    	int frameIndex
    ) {
    	vmaSetCurrentFrameIndex(
    		allocator.memorySegment(),
    		frameIndex
    	);
    }
    
    /// ```
    /// \brief Retrieves statistics from current state of the Allocator.
    /// 
    /// This function is called "calculate" not "get" because it has to traverse all
    /// internal data structures, so it may be quite slow. Use it for debugging purposes.
    /// For faster but more brief statistics suitable to be called every frame or every allocation,
    /// use vmaGetHeapBudgets().
    /// 
    /// Note that when using allocator from multiple threads, returned information may immediately
    /// become outdated.
    /// ```
    public static void vmaCalculateStatistics(
    	MemorySegment allocator,
    	MemorySegment pStats
    ) {
    	MethodHandle method = VMA_CALCULATE_STATISTICS.get();
    	try {
    		 method.invokeExact(
    			allocator,
    			pStats
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#vmaCalculateStatistics].
    public static void vmaCalculateStatistics(
    	VmaAllocator allocator,
    	VmaTotalStatistics pStats
    ) {
    	vmaCalculateStatistics(
    		allocator.memorySegment(),
    		pStats.memorySegment()
    	);
    }
    
    /// ```
    /// \brief Retrieves information about current memory usage and budget for all memory heaps.
    /// 
    /// \param allocator
    /// \param[out] pBudgets Must point to array with number of elements at least equal to number of memory heaps in physical device used.
    /// 
    /// This function is called "get" not "calculate" because it is very fast, suitable to be called
    /// every frame or every allocation. For more detailed statistics use vmaCalculateStatistics().
    /// 
    /// Note that when using allocator from multiple threads, returned information may immediately
    /// become outdated.
    /// ```
    public static void vmaGetHeapBudgets(
    	MemorySegment allocator,
    	MemorySegment pBudgets
    ) {
    	MethodHandle method = VMA_GET_HEAP_BUDGETS.get();
    	try {
    		 method.invokeExact(
    			allocator,
    			pBudgets
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#vmaGetHeapBudgets].
    public static void vmaGetHeapBudgets(
    	VmaAllocator allocator,
    	VmaBudget pBudgets
    ) {
    	vmaGetHeapBudgets(
    		allocator.memorySegment(),
    		pBudgets.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// \brief Helps to find `memoryTypeIndex`, given `memoryTypeBits` and #VmaAllocationCreateInfo.
    /// 
    /// This algorithm tries to find a memory type that:
    /// 
    /// - Is allowed by `memoryTypeBits`.
    /// - Contains all the flags from `pAllocationCreateInfo->requiredFlags`.
    /// - Matches intended usage.
    /// - Has as many flags from `pAllocationCreateInfo->preferredFlags` as possible.
    /// 
    /// \return Returns `VK_ERROR_FEATURE_NOT_PRESENT` if not found. Receiving such result
    /// from this function or any other allocating function probably means that your
    /// device doesn't support any memory type with requested features for the specific
    /// type of resource you want to use it for. Please check parameters of your
    /// resource, like image layout (`OPTIMAL` versus `LINEAR`) or mip level count.
    /// ```
    public static int vmaFindMemoryTypeIndex(
    	MemorySegment allocator,
    	int memoryTypeBits,
    	MemorySegment pAllocationCreateInfo,
    	MemorySegment pMemoryTypeIndex
    ) {
    	MethodHandle method = VMA_FIND_MEMORY_TYPE_INDEX.get();
    	try {
    		return (int) method.invokeExact(
    			allocator,
    			memoryTypeBits,
    			pAllocationCreateInfo,
    			pMemoryTypeIndex
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#vmaFindMemoryTypeIndex].
    public static int vmaFindMemoryTypeIndex(
    	VmaAllocator allocator,
    	int memoryTypeBits,
    	VmaAllocationCreateInfo pAllocationCreateInfo,
    	NativeIntArray pMemoryTypeIndex
    ) {
    	return vmaFindMemoryTypeIndex(
    		allocator.memorySegment(),
    		memoryTypeBits,
    		pAllocationCreateInfo.memorySegment(),
    		pMemoryTypeIndex.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// \brief Helps to find `memoryTypeIndex`, given `VkBufferCreateInfo` and #VmaAllocationCreateInfo.
    /// 
    /// It can be useful e.g. to determine value to be used as VmaPoolCreateInfo::memoryTypeIndex.
    /// It may need to internally create a temporary, dummy buffer that never has memory bound.
    /// ```
    public static int vmaFindMemoryTypeIndexForBufferInfo(
    	MemorySegment allocator,
    	MemorySegment pBufferCreateInfo,
    	MemorySegment pAllocationCreateInfo,
    	MemorySegment pMemoryTypeIndex
    ) {
    	MethodHandle method = VMA_FIND_MEMORY_TYPE_INDEX_FOR_BUFFER_INFO.get();
    	try {
    		return (int) method.invokeExact(
    			allocator,
    			pBufferCreateInfo,
    			pAllocationCreateInfo,
    			pMemoryTypeIndex
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#vmaFindMemoryTypeIndexForBufferInfo].
    public static int vmaFindMemoryTypeIndexForBufferInfo(
    	VmaAllocator allocator,
    	VkBufferCreateInfo pBufferCreateInfo,
    	VmaAllocationCreateInfo pAllocationCreateInfo,
    	NativeIntArray pMemoryTypeIndex
    ) {
    	return vmaFindMemoryTypeIndexForBufferInfo(
    		allocator.memorySegment(),
    		pBufferCreateInfo.memorySegment(),
    		pAllocationCreateInfo.memorySegment(),
    		pMemoryTypeIndex.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// \brief Helps to find `memoryTypeIndex`, given `VkImageCreateInfo` and #VmaAllocationCreateInfo.
    /// 
    /// It can be useful e.g. to determine value to be used as VmaPoolCreateInfo::memoryTypeIndex.
    /// It may need to internally create a temporary, dummy image that never has memory bound.
    /// ```
    public static int vmaFindMemoryTypeIndexForImageInfo(
    	MemorySegment allocator,
    	MemorySegment pImageCreateInfo,
    	MemorySegment pAllocationCreateInfo,
    	MemorySegment pMemoryTypeIndex
    ) {
    	MethodHandle method = VMA_FIND_MEMORY_TYPE_INDEX_FOR_IMAGE_INFO.get();
    	try {
    		return (int) method.invokeExact(
    			allocator,
    			pImageCreateInfo,
    			pAllocationCreateInfo,
    			pMemoryTypeIndex
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#vmaFindMemoryTypeIndexForImageInfo].
    public static int vmaFindMemoryTypeIndexForImageInfo(
    	VmaAllocator allocator,
    	VkImageCreateInfo pImageCreateInfo,
    	VmaAllocationCreateInfo pAllocationCreateInfo,
    	NativeIntArray pMemoryTypeIndex
    ) {
    	return vmaFindMemoryTypeIndexForImageInfo(
    		allocator.memorySegment(),
    		pImageCreateInfo.memorySegment(),
    		pAllocationCreateInfo.memorySegment(),
    		pMemoryTypeIndex.memorySegment()
    	);
    }
    
    /// ```
    /// \brief Allocates Vulkan device memory and creates #VmaPool object.
    /// 
    /// \param allocator Allocator object.
    /// \param pCreateInfo Parameters of pool to create.
    /// \param[out] pPool Handle to created pool.
    /// ```
    public static int vmaCreatePool(
    	MemorySegment allocator,
    	MemorySegment pCreateInfo,
    	MemorySegment pPool
    ) {
    	MethodHandle method = VMA_CREATE_POOL.get();
    	try {
    		return (int) method.invokeExact(
    			allocator,
    			pCreateInfo,
    			pPool
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#vmaCreatePool].
    public static int vmaCreatePool(
    	VmaAllocator allocator,
    	VmaPoolCreateInfo pCreateInfo,
    	NativePointerArray pPool
    ) {
    	return vmaCreatePool(
    		allocator.memorySegment(),
    		pCreateInfo.memorySegment(),
    		pPool.memorySegment()
    	);
    }
    
    /// ```
    /// \brief Destroys #VmaPool object and frees Vulkan device memory.
    /// ```
    public static void vmaDestroyPool(
    	MemorySegment allocator,
    	MemorySegment pool
    ) {
    	MethodHandle method = VMA_DESTROY_POOL.get();
    	try {
    		 method.invokeExact(
    			allocator,
    			pool
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#vmaDestroyPool].
    public static void vmaDestroyPool(
    	VmaAllocator allocator,
    	VmaPool pool
    ) {
    	vmaDestroyPool(
    		allocator.memorySegment(),
    		pool.memorySegment()
    	);
    }
    
    /// ```
    /// \brief Retrieves statistics of existing #VmaPool object.
    /// 
    /// \param allocator Allocator object.
    /// \param pool Pool object.
    /// \param[out] pPoolStats Statistics of specified pool.
    /// 
    /// Note that when using the pool from multiple threads, returned information may immediately
    /// become outdated.
    /// ```
    public static void vmaGetPoolStatistics(
    	MemorySegment allocator,
    	MemorySegment pool,
    	MemorySegment pPoolStats
    ) {
    	MethodHandle method = VMA_GET_POOL_STATISTICS.get();
    	try {
    		 method.invokeExact(
    			allocator,
    			pool,
    			pPoolStats
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#vmaGetPoolStatistics].
    public static void vmaGetPoolStatistics(
    	VmaAllocator allocator,
    	VmaPool pool,
    	VmaStatistics pPoolStats
    ) {
    	vmaGetPoolStatistics(
    		allocator.memorySegment(),
    		pool.memorySegment(),
    		pPoolStats.memorySegment()
    	);
    }
    
    /// ```
    /// \brief Retrieves detailed statistics of existing #VmaPool object.
    /// 
    /// \param allocator Allocator object.
    /// \param pool Pool object.
    /// \param[out] pPoolStats Statistics of specified pool.
    /// ```
    public static void vmaCalculatePoolStatistics(
    	MemorySegment allocator,
    	MemorySegment pool,
    	MemorySegment pPoolStats
    ) {
    	MethodHandle method = VMA_CALCULATE_POOL_STATISTICS.get();
    	try {
    		 method.invokeExact(
    			allocator,
    			pool,
    			pPoolStats
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#vmaCalculatePoolStatistics].
    public static void vmaCalculatePoolStatistics(
    	VmaAllocator allocator,
    	VmaPool pool,
    	VmaDetailedStatistics pPoolStats
    ) {
    	vmaCalculatePoolStatistics(
    		allocator.memorySegment(),
    		pool.memorySegment(),
    		pPoolStats.memorySegment()
    	);
    }
    
    /// ```
    /// \brief Checks magic number in margins around all allocations in given memory pool in search for corruptions.
    /// 
    /// Corruption detection is enabled only when `VMA_DEBUG_DETECT_CORRUPTION` macro is defined to nonzero,
    /// `VMA_DEBUG_MARGIN` is defined to nonzero and the pool is created in memory type that is
    /// `HOST_VISIBLE` and `HOST_COHERENT`. For more information, see [Corruption detection](@ref debugging_memory_usage_corruption_detection).
    /// 
    /// Possible return values:
    /// 
    /// - `VK_ERROR_FEATURE_NOT_PRESENT` - corruption detection is not enabled for specified pool.
    /// - `VK_SUCCESS` - corruption detection has been performed and succeeded.
    /// - `VK_ERROR_UNKNOWN` - corruption detection has been performed and found memory corruptions around one of the allocations.
    ///   `VMA_ASSERT` is also fired in that case.
    /// - Other value: Error returned by Vulkan, e.g. memory mapping failure.
    /// ```
    public static int vmaCheckPoolCorruption(
    	MemorySegment allocator,
    	MemorySegment pool
    ) {
    	MethodHandle method = VMA_CHECK_POOL_CORRUPTION.get();
    	try {
    		return (int) method.invokeExact(
    			allocator,
    			pool
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#vmaCheckPoolCorruption].
    public static int vmaCheckPoolCorruption(
    	VmaAllocator allocator,
    	VmaPool pool
    ) {
    	return vmaCheckPoolCorruption(
    		allocator.memorySegment(),
    		pool.memorySegment()
    	);
    }
    
    /// ```
    /// \brief Retrieves name of a custom pool.
    /// 
    /// After the call `ppName` is either null or points to an internally-owned null-terminated string
    /// containing name of the pool that was previously set. The pointer becomes invalid when the pool is
    /// destroyed or its name is changed using vmaSetPoolName().
    /// ```
    public static void vmaGetPoolName(
    	MemorySegment allocator,
    	MemorySegment pool,
    	MemorySegment ppName
    ) {
    	MethodHandle method = VMA_GET_POOL_NAME.get();
    	try {
    		 method.invokeExact(
    			allocator,
    			pool,
    			ppName
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#vmaGetPoolName].
    public static void vmaGetPoolName(
    	VmaAllocator allocator,
    	VmaPool pool,
    	NativePointerArray ppName
    ) {
    	vmaGetPoolName(
    		allocator.memorySegment(),
    		pool.memorySegment(),
    		ppName.memorySegment()
    	);
    }
    
    /// ```
    /// \brief Sets name of a custom pool.
    /// 
    /// `pName` can be either null or pointer to a null-terminated string with new name for the pool.
    /// Function makes internal copy of the string, so it can be changed or freed immediately after this call.
    /// ```
    public static void vmaSetPoolName(
    	MemorySegment allocator,
    	MemorySegment pool,
    	MemorySegment pName
    ) {
    	MethodHandle method = VMA_SET_POOL_NAME.get();
    	try {
    		 method.invokeExact(
    			allocator,
    			pool,
    			pName
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#vmaSetPoolName].
    public static void vmaSetPoolName(
    	VmaAllocator allocator,
    	VmaPool pool,
    	@Nullable String pName
    ) {
    	try (Arena arena = MemoryStack.stackPush()) {
    		vmaSetPoolName(
    			allocator.memorySegment(),
    			pool.memorySegment(),
    			pName == null ? MemorySegment.NULL : arena.allocateFrom(pName)
    		);
    	}
    }
    
    /// ```
    /// \brief General purpose memory allocation.
    /// 
    /// \param allocator The main allocator object.
    /// \param pVkMemoryRequirements Requirements for the allocated memory.
    /// \param pCreateInfo Allocation creation parameters.
    /// \param[out] pAllocation Handle to allocated memory.
    /// \param[out] pAllocationInfo Optional, can be null. Information about allocated memory. It can be also fetched later using vmaGetAllocationInfo().
    /// 
    /// The function creates a #VmaAllocation object without creating a buffer or an image together with it.
    /// 
    /// - It is recommended to use vmaAllocateMemoryForBuffer(), vmaAllocateMemoryForImage(),
    ///   vmaCreateBuffer(), vmaCreateImage() instead whenever possible.
    /// - You can also create a buffer or an image later in an existing allocation using
    ///   vmaCreateAliasingBuffer2(), vmaCreateAliasingImage2().
    /// - You can also create a buffer or an image on your own and bind it to an existing allocation
    ///   using vmaBindBufferMemory2(), vmaBindImageMemory2().
    /// 
    /// You must free the returned allocation object using vmaFreeMemory() or vmaFreeMemoryPages().
    /// 
    /// There is also extended version of this function: vmaAllocateDedicatedMemory()
    /// that offers additional parameter `pMemoryAllocateNext`.
    /// ```
    public static int vmaAllocateMemory(
    	MemorySegment allocator,
    	MemorySegment pVkMemoryRequirements,
    	MemorySegment pCreateInfo,
    	MemorySegment pAllocation,
    	MemorySegment pAllocationInfo
    ) {
    	MethodHandle method = VMA_ALLOCATE_MEMORY.get();
    	try {
    		return (int) method.invokeExact(
    			allocator,
    			pVkMemoryRequirements,
    			pCreateInfo,
    			pAllocation,
    			pAllocationInfo
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#vmaAllocateMemory].
    public static int vmaAllocateMemory(
    	VmaAllocator allocator,
    	VkMemoryRequirements pVkMemoryRequirements,
    	VmaAllocationCreateInfo pCreateInfo,
    	NativePointerArray pAllocation,
    	@Nullable VmaAllocationInfo pAllocationInfo
    ) {
    	return vmaAllocateMemory(
    		allocator.memorySegment(),
    		pVkMemoryRequirements.memorySegment(),
    		pCreateInfo.memorySegment(),
    		pAllocation.memorySegment(),
    		pAllocationInfo == null ? MemorySegment.NULL : pAllocationInfo.memorySegment()
    	);
    }
    
    /// ```
    /// \brief General purpose allocation of a dedicated memory.
    /// 
    /// This function is similar vmaAllocateMemory(), but
    /// it always allocates dedicated memory - flag #VMA_ALLOCATION_CREATE_DEDICATED_MEMORY_BIT is implied.
    /// It offers additional parameter `pMemoryAllocateNext`,
    /// which can be used to attach `pNext` chain to the `VkMemoryAllocateInfo` structure.
    /// It can be useful for importing external memory. For more information, see \ref other_api_interop.
    /// ```
    public static int vmaAllocateDedicatedMemory(
    	MemorySegment allocator,
    	MemorySegment pVkMemoryRequirements,
    	MemorySegment pCreateInfo,
    	MemorySegment pMemoryAllocateNext,
    	MemorySegment pAllocation,
    	MemorySegment pAllocationInfo
    ) {
    	MethodHandle method = VMA_ALLOCATE_DEDICATED_MEMORY.get();
    	try {
    		return (int) method.invokeExact(
    			allocator,
    			pVkMemoryRequirements,
    			pCreateInfo,
    			pMemoryAllocateNext,
    			pAllocation,
    			pAllocationInfo
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#vmaAllocateDedicatedMemory].
    public static int vmaAllocateDedicatedMemory(
    	VmaAllocator allocator,
    	VkMemoryRequirements pVkMemoryRequirements,
    	VmaAllocationCreateInfo pCreateInfo,
    	MemorySegment pMemoryAllocateNext,
    	NativePointerArray pAllocation,
    	@Nullable VmaAllocationInfo pAllocationInfo
    ) {
    	return vmaAllocateDedicatedMemory(
    		allocator.memorySegment(),
    		pVkMemoryRequirements.memorySegment(),
    		pCreateInfo.memorySegment(),
    		pMemoryAllocateNext,
    		pAllocation.memorySegment(),
    		pAllocationInfo == null ? MemorySegment.NULL : pAllocationInfo.memorySegment()
    	);
    }
    
    /// ```
    /// \brief General purpose memory allocation for multiple allocation objects at once.
    /// 
    /// \param allocator Allocator object.
    /// \param pVkMemoryRequirements Memory requirements for each allocation.
    /// \param pCreateInfo Creation parameters for each allocation.
    /// \param allocationCount Number of allocations to make.
    /// \param[out] pAllocations Pointer to array that will be filled with handles to created allocations.
    /// \param[out] pAllocationInfo Optional. Pointer to array that will be filled with parameters of created allocations.
    /// 
    /// You should free the memory using vmaFreeMemory() or vmaFreeMemoryPages().
    /// 
    /// Word "pages" is just a suggestion to use this function to allocate pieces of memory needed for sparse binding.
    /// It is just a general purpose allocation function able to make multiple allocations at once.
    /// It may be internally optimized to be more efficient than calling vmaAllocateMemory() `allocationCount` times.
    /// 
    /// All allocations are made using same parameters. All of them are created out of the same memory pool and type.
    /// If any allocation fails, all allocations already made within this function call are also freed, so that when
    /// returned result is not `VK_SUCCESS`, `pAllocation` array is always entirely filled with `VK_NULL_HANDLE`.
    /// ```
    public static int vmaAllocateMemoryPages(
    	MemorySegment allocator,
    	MemorySegment pVkMemoryRequirements,
    	MemorySegment pCreateInfo,
    	long allocationCount,
    	MemorySegment pAllocations,
    	MemorySegment pAllocationInfo
    ) {
    	MethodHandle method = VMA_ALLOCATE_MEMORY_PAGES.get();
    	try {
    		return (int) method.invokeExact(
    			allocator,
    			pVkMemoryRequirements,
    			pCreateInfo,
    			allocationCount,
    			pAllocations,
    			pAllocationInfo
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#vmaAllocateMemoryPages].
    public static int vmaAllocateMemoryPages(
    	VmaAllocator allocator,
    	VkMemoryRequirements pVkMemoryRequirements,
    	VmaAllocationCreateInfo pCreateInfo,
    	long allocationCount,
    	NativePointerArray pAllocations,
    	@Nullable VmaAllocationInfo pAllocationInfo
    ) {
    	return vmaAllocateMemoryPages(
    		allocator.memorySegment(),
    		pVkMemoryRequirements.memorySegment(),
    		pCreateInfo.memorySegment(),
    		allocationCount,
    		pAllocations.memorySegment(),
    		pAllocationInfo == null ? MemorySegment.NULL : pAllocationInfo.memorySegment()
    	);
    }
    
    /// ```
    /// \brief Allocates memory suitable for given `VkBuffer`.
    /// 
    /// \param allocator
    /// \param buffer
    /// \param pCreateInfo
    /// \param[out] pAllocation Handle to allocated memory.
    /// \param[out] pAllocationInfo Optional. Information about allocated memory. It can be later fetched using function vmaGetAllocationInfo().
    /// 
    /// It only creates #VmaAllocation. To bind the memory to the buffer, use vmaBindBufferMemory().
    /// 
    /// This is a special-purpose function. In most cases you should use vmaCreateBuffer().
    /// 
    /// You must free the allocation using vmaFreeMemory() when no longer needed.
    /// ```
    public static int vmaAllocateMemoryForBuffer(
    	MemorySegment allocator,
    	MemorySegment buffer,
    	MemorySegment pCreateInfo,
    	MemorySegment pAllocation,
    	MemorySegment pAllocationInfo
    ) {
    	MethodHandle method = VMA_ALLOCATE_MEMORY_FOR_BUFFER.get();
    	try {
    		return (int) method.invokeExact(
    			allocator,
    			buffer,
    			pCreateInfo,
    			pAllocation,
    			pAllocationInfo
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#vmaAllocateMemoryForBuffer].
    public static int vmaAllocateMemoryForBuffer(
    	VmaAllocator allocator,
    	VkBuffer buffer,
    	VmaAllocationCreateInfo pCreateInfo,
    	NativePointerArray pAllocation,
    	@Nullable VmaAllocationInfo pAllocationInfo
    ) {
    	return vmaAllocateMemoryForBuffer(
    		allocator.memorySegment(),
    		buffer.memorySegment(),
    		pCreateInfo.memorySegment(),
    		pAllocation.memorySegment(),
    		pAllocationInfo == null ? MemorySegment.NULL : pAllocationInfo.memorySegment()
    	);
    }
    
    /// ```
    /// \brief Allocates memory suitable for given `VkImage`.
    /// 
    /// \param allocator
    /// \param image
    /// \param pCreateInfo
    /// \param[out] pAllocation Handle to allocated memory.
    /// \param[out] pAllocationInfo Optional. Information about allocated memory. It can be later fetched using function vmaGetAllocationInfo().
    /// 
    /// It only creates #VmaAllocation. To bind the memory to the buffer, use vmaBindImageMemory().
    /// 
    /// This is a special-purpose function. In most cases you should use vmaCreateImage().
    /// 
    /// You must free the allocation using vmaFreeMemory() when no longer needed.
    /// ```
    public static int vmaAllocateMemoryForImage(
    	MemorySegment allocator,
    	MemorySegment image,
    	MemorySegment pCreateInfo,
    	MemorySegment pAllocation,
    	MemorySegment pAllocationInfo
    ) {
    	MethodHandle method = VMA_ALLOCATE_MEMORY_FOR_IMAGE.get();
    	try {
    		return (int) method.invokeExact(
    			allocator,
    			image,
    			pCreateInfo,
    			pAllocation,
    			pAllocationInfo
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#vmaAllocateMemoryForImage].
    public static int vmaAllocateMemoryForImage(
    	VmaAllocator allocator,
    	VkImage image,
    	VmaAllocationCreateInfo pCreateInfo,
    	NativePointerArray pAllocation,
    	@Nullable VmaAllocationInfo pAllocationInfo
    ) {
    	return vmaAllocateMemoryForImage(
    		allocator.memorySegment(),
    		image.memorySegment(),
    		pCreateInfo.memorySegment(),
    		pAllocation.memorySegment(),
    		pAllocationInfo == null ? MemorySegment.NULL : pAllocationInfo.memorySegment()
    	);
    }
    
    /// ```
    /// \brief Frees memory previously allocated using vmaAllocateMemory(), vmaAllocateMemoryForBuffer(), or vmaAllocateMemoryForImage().
    /// 
    /// Passing `VK_NULL_HANDLE` as `allocation` is valid. Such function call is just skipped.
    /// ```
    public static void vmaFreeMemory(
    	MemorySegment allocator,
    	MemorySegment allocation
    ) {
    	MethodHandle method = VMA_FREE_MEMORY.get();
    	try {
    		 method.invokeExact(
    			allocator,
    			allocation
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#vmaFreeMemory].
    public static void vmaFreeMemory(
    	VmaAllocator allocator,
    	VmaAllocation allocation
    ) {
    	vmaFreeMemory(
    		allocator.memorySegment(),
    		allocation.memorySegment()
    	);
    }
    
    /// ```
    /// \brief Frees memory and destroys multiple allocations.
    /// 
    /// Word "pages" is just a suggestion to use this function to free pieces of memory used for sparse binding.
    /// It is just a general purpose function to free memory and destroy allocations made using e.g. vmaAllocateMemory(),
    /// vmaAllocateMemoryPages() and other functions.
    /// It may be internally optimized to be more efficient than calling vmaFreeMemory() `allocationCount` times.
    /// 
    /// Allocations in `pAllocations` array can come from any memory pools and types.
    /// Passing `VK_NULL_HANDLE` as elements of `pAllocations` array is valid. Such entries are just skipped.
    /// ```
    public static void vmaFreeMemoryPages(
    	MemorySegment allocator,
    	long allocationCount,
    	MemorySegment pAllocations
    ) {
    	MethodHandle method = VMA_FREE_MEMORY_PAGES.get();
    	try {
    		 method.invokeExact(
    			allocator,
    			allocationCount,
    			pAllocations
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#vmaFreeMemoryPages].
    public static void vmaFreeMemoryPages(
    	VmaAllocator allocator,
    	long allocationCount,
    	NativePointerArray pAllocations
    ) {
    	vmaFreeMemoryPages(
    		allocator.memorySegment(),
    		allocationCount,
    		pAllocations.memorySegment()
    	);
    }
    
    /// ```
    /// \brief Returns current information about specified allocation.
    /// 
    /// Current parameters of given allocation are returned in `pAllocationInfo`.
    /// 
    /// Although this function doesn't lock any mutex, so it should be quite efficient,
    /// you should avoid calling it too often.
    /// You can retrieve same VmaAllocationInfo structure while creating your resource, from function
    /// vmaCreateBuffer(), vmaCreateImage(). You can remember it if you are sure parameters don't change
    /// (e.g. due to defragmentation).
    /// 
    /// There is also a new function vmaGetAllocationInfo2() that offers extended information
    /// about the allocation, returned using new structure #VmaAllocationInfo2.
    /// ```
    public static void vmaGetAllocationInfo(
    	MemorySegment allocator,
    	MemorySegment allocation,
    	MemorySegment pAllocationInfo
    ) {
    	MethodHandle method = VMA_GET_ALLOCATION_INFO.get();
    	try {
    		 method.invokeExact(
    			allocator,
    			allocation,
    			pAllocationInfo
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#vmaGetAllocationInfo].
    public static void vmaGetAllocationInfo(
    	VmaAllocator allocator,
    	VmaAllocation allocation,
    	VmaAllocationInfo pAllocationInfo
    ) {
    	vmaGetAllocationInfo(
    		allocator.memorySegment(),
    		allocation.memorySegment(),
    		pAllocationInfo.memorySegment()
    	);
    }
    
    /// ```
    /// \brief Returns extended information about specified allocation.
    /// 
    /// Current parameters of given allocation are returned in `pAllocationInfo`.
    /// Extended parameters in structure #VmaAllocationInfo2 include memory block size
    /// and a flag telling whether the allocation has dedicated memory.
    /// It can be useful e.g. for interop with OpenGL.
    /// ```
    public static void vmaGetAllocationInfo2(
    	MemorySegment allocator,
    	MemorySegment allocation,
    	MemorySegment pAllocationInfo
    ) {
    	MethodHandle method = VMA_GET_ALLOCATION_INFO2.get();
    	try {
    		 method.invokeExact(
    			allocator,
    			allocation,
    			pAllocationInfo
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#vmaGetAllocationInfo2].
    public static void vmaGetAllocationInfo2(
    	VmaAllocator allocator,
    	VmaAllocation allocation,
    	VmaAllocationInfo2 pAllocationInfo
    ) {
    	vmaGetAllocationInfo2(
    		allocator.memorySegment(),
    		allocation.memorySegment(),
    		pAllocationInfo.memorySegment()
    	);
    }
    
    /// ```
    /// \brief Sets pUserData in given allocation to new value.
    /// 
    /// The value of pointer `pUserData` is copied to allocation's `pUserData`.
    /// It is opaque, so you can use it however you want - e.g.
    /// as a pointer, ordinal number or some handle to you own data.
    /// ```
    public static void vmaSetAllocationUserData(
    	MemorySegment allocator,
    	MemorySegment allocation,
    	MemorySegment pUserData
    ) {
    	MethodHandle method = VMA_SET_ALLOCATION_USER_DATA.get();
    	try {
    		 method.invokeExact(
    			allocator,
    			allocation,
    			pUserData
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#vmaSetAllocationUserData].
    public static void vmaSetAllocationUserData(
    	VmaAllocator allocator,
    	VmaAllocation allocation,
    	MemorySegment pUserData
    ) {
    	vmaSetAllocationUserData(
    		allocator.memorySegment(),
    		allocation.memorySegment(),
    		pUserData
    	);
    }
    
    /// ```
    /// \brief Sets pName in given allocation to new value.
    /// 
    /// `pName` must be either null, or pointer to a null-terminated string. The function
    /// makes local copy of the string and sets it as allocation's `pName`. String
    /// passed as pName doesn't need to be valid for whole lifetime of the allocation -
    /// you can free it after this call. String previously pointed by allocation's
    /// `pName` is freed from memory.
    /// ```
    public static void vmaSetAllocationName(
    	MemorySegment allocator,
    	MemorySegment allocation,
    	MemorySegment pName
    ) {
    	MethodHandle method = VMA_SET_ALLOCATION_NAME.get();
    	try {
    		 method.invokeExact(
    			allocator,
    			allocation,
    			pName
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#vmaSetAllocationName].
    public static void vmaSetAllocationName(
    	VmaAllocator allocator,
    	VmaAllocation allocation,
    	@Nullable String pName
    ) {
    	try (Arena arena = MemoryStack.stackPush()) {
    		vmaSetAllocationName(
    			allocator.memorySegment(),
    			allocation.memorySegment(),
    			pName == null ? MemorySegment.NULL : arena.allocateFrom(pName)
    		);
    	}
    }
    
    /// ```
    /// 
    /// \brief Given an allocation, returns Property Flags of its memory type.
    /// 
    /// This is just a convenience function. Same information can be obtained using
    /// vmaGetAllocationInfo() + vmaGetMemoryProperties().
    /// ```
    public static void vmaGetAllocationMemoryProperties(
    	MemorySegment allocator,
    	MemorySegment allocation,
    	MemorySegment pFlags
    ) {
    	MethodHandle method = VMA_GET_ALLOCATION_MEMORY_PROPERTIES.get();
    	try {
    		 method.invokeExact(
    			allocator,
    			allocation,
    			pFlags
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#vmaGetAllocationMemoryProperties].
    public static void vmaGetAllocationMemoryProperties(
    	VmaAllocator allocator,
    	VmaAllocation allocation,
    	NativeIntArray pFlags
    ) {
    	vmaGetAllocationMemoryProperties(
    		allocator.memorySegment(),
    		allocation.memorySegment(),
    		pFlags.memorySegment()
    	);
    }
    
    /// ```
    /// \brief Maps memory represented by given allocation and returns pointer to it.
    /// 
    /// Maps memory represented by given allocation to make it accessible to CPU code.
    /// When succeeded, `*ppData` contains pointer to first byte of this memory.
    /// 
    /// \warning
    /// If the allocation is part of a bigger `VkDeviceMemory` block, returned pointer is
    /// correctly offsetted to the beginning of region assigned to this particular allocation.
    /// Unlike the result of `vkMapMemory`, it points to the allocation, not to the beginning of the whole block.
    /// You should not add VmaAllocationInfo::offset to it!
    /// 
    /// Mapping is internally reference-counted and synchronized, so despite raw Vulkan
    /// function `vkMapMemory()` cannot be used to map same block of `VkDeviceMemory`
    /// multiple times simultaneously, it is safe to call this function on allocations
    /// assigned to the same memory block. Actual Vulkan memory will be mapped on first
    /// mapping and unmapped on last unmapping.
    /// 
    /// If the function succeeded, you must call vmaUnmapMemory() to unmap the
    /// allocation when mapping is no longer needed or before freeing the allocation, at
    /// the latest.
    /// 
    /// It also safe to call this function multiple times on the same allocation. You
    /// must call vmaUnmapMemory() same number of times as you called vmaMapMemory().
    /// 
    /// It is also safe to call this function on allocation created with
    /// #VMA_ALLOCATION_CREATE_MAPPED_BIT flag. Its memory stays mapped all the time.
    /// You must still call vmaUnmapMemory() same number of times as you called
    /// vmaMapMemory(). You must not call vmaUnmapMemory() additional time to free the
    /// "0-th" mapping made automatically due to #VMA_ALLOCATION_CREATE_MAPPED_BIT flag.
    /// 
    /// This function fails when used on allocation made in memory type that is not
    /// `HOST_VISIBLE`.
    /// 
    /// This function doesn't automatically flush or invalidate caches.
    /// If the allocation is made from a memory types that is not `HOST_COHERENT`,
    /// you also need to use vmaInvalidateAllocation() / vmaFlushAllocation(), as required by Vulkan specification.
    /// ```
    public static int vmaMapMemory(
    	MemorySegment allocator,
    	MemorySegment allocation,
    	MemorySegment ppData
    ) {
    	MethodHandle method = VMA_MAP_MEMORY.get();
    	try {
    		return (int) method.invokeExact(
    			allocator,
    			allocation,
    			ppData
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#vmaMapMemory].
    public static int vmaMapMemory(
    	VmaAllocator allocator,
    	VmaAllocation allocation,
    	NativePointerArray ppData
    ) {
    	return vmaMapMemory(
    		allocator.memorySegment(),
    		allocation.memorySegment(),
    		ppData.memorySegment()
    	);
    }
    
    /// ```
    /// \brief Unmaps memory represented by given allocation, mapped previously using vmaMapMemory().
    /// 
    /// For details, see description of vmaMapMemory().
    /// 
    /// This function doesn't automatically flush or invalidate caches.
    /// If the allocation is made from a memory types that is not `HOST_COHERENT`,
    /// you also need to use vmaInvalidateAllocation() / vmaFlushAllocation(), as required by Vulkan specification.
    /// ```
    public static void vmaUnmapMemory(
    	MemorySegment allocator,
    	MemorySegment allocation
    ) {
    	MethodHandle method = VMA_UNMAP_MEMORY.get();
    	try {
    		 method.invokeExact(
    			allocator,
    			allocation
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#vmaUnmapMemory].
    public static void vmaUnmapMemory(
    	VmaAllocator allocator,
    	VmaAllocation allocation
    ) {
    	vmaUnmapMemory(
    		allocator.memorySegment(),
    		allocation.memorySegment()
    	);
    }
    
    /// ```
    /// \brief Flushes memory of given allocation.
    /// 
    /// Calls `vkFlushMappedMemoryRanges()` for memory associated with given range of given allocation.
    /// It needs to be called after writing to a mapped memory for memory types that are not `HOST_COHERENT`.
    /// Unmap operation doesn't do that automatically.
    /// 
    /// - `offset` must be relative to the beginning of allocation.
    /// - `size` can be `VK_WHOLE_SIZE`. It means all memory from `offset` the the end of given allocation.
    /// - `offset` and `size` don't have to be aligned.
    ///   They are internally rounded down/up to multiply of `nonCoherentAtomSize`.
    /// - If `size` is 0, this call is ignored.
    /// - If memory type that the `allocation` belongs to is not `HOST_VISIBLE` or it is `HOST_COHERENT`,
    ///   this call is ignored.
    /// 
    /// Warning! `offset` and `size` are relative to the contents of given `allocation`.
    /// If you mean whole allocation, you can pass 0 and `VK_WHOLE_SIZE`, respectively.
    /// Do not pass allocation's offset as `offset`!!!
    /// 
    /// This function returns the `VkResult` from `vkFlushMappedMemoryRanges` if it is
    /// called, otherwise `VK_SUCCESS`.
    /// ```
    public static int vmaFlushAllocation(
    	MemorySegment allocator,
    	MemorySegment allocation,
    	long offset,
    	long size
    ) {
    	MethodHandle method = VMA_FLUSH_ALLOCATION.get();
    	try {
    		return (int) method.invokeExact(
    			allocator,
    			allocation,
    			offset,
    			size
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#vmaFlushAllocation].
    public static int vmaFlushAllocation(
    	VmaAllocator allocator,
    	VmaAllocation allocation,
    	long offset,
    	long size
    ) {
    	return vmaFlushAllocation(
    		allocator.memorySegment(),
    		allocation.memorySegment(),
    		offset,
    		size
    	);
    }
    
    /// ```
    /// \brief Invalidates memory of given allocation.
    /// 
    /// Calls `vkInvalidateMappedMemoryRanges()` for memory associated with given range of given allocation.
    /// It needs to be called before reading from a mapped memory for memory types that are not `HOST_COHERENT`.
    /// Map operation doesn't do that automatically.
    /// 
    /// - `offset` must be relative to the beginning of allocation.
    /// - `size` can be `VK_WHOLE_SIZE`. It means all memory from `offset` the the end of given allocation.
    /// - `offset` and `size` don't have to be aligned.
    ///   They are internally rounded down/up to multiply of `nonCoherentAtomSize`.
    /// - If `size` is 0, this call is ignored.
    /// - If memory type that the `allocation` belongs to is not `HOST_VISIBLE` or it is `HOST_COHERENT`,
    ///   this call is ignored.
    /// 
    /// Warning! `offset` and `size` are relative to the contents of given `allocation`.
    /// If you mean whole allocation, you can pass 0 and `VK_WHOLE_SIZE`, respectively.
    /// Do not pass allocation's offset as `offset`!!!
    /// 
    /// This function returns the `VkResult` from `vkInvalidateMappedMemoryRanges` if
    /// it is called, otherwise `VK_SUCCESS`.
    /// ```
    public static int vmaInvalidateAllocation(
    	MemorySegment allocator,
    	MemorySegment allocation,
    	long offset,
    	long size
    ) {
    	MethodHandle method = VMA_INVALIDATE_ALLOCATION.get();
    	try {
    		return (int) method.invokeExact(
    			allocator,
    			allocation,
    			offset,
    			size
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#vmaInvalidateAllocation].
    public static int vmaInvalidateAllocation(
    	VmaAllocator allocator,
    	VmaAllocation allocation,
    	long offset,
    	long size
    ) {
    	return vmaInvalidateAllocation(
    		allocator.memorySegment(),
    		allocation.memorySegment(),
    		offset,
    		size
    	);
    }
    
    /// ```
    /// \brief Flushes memory of given set of allocations.
    /// 
    /// Calls `vkFlushMappedMemoryRanges()` for memory associated with given ranges of given allocations.
    /// For more information, see documentation of vmaFlushAllocation().
    /// 
    /// \param allocator
    /// \param allocationCount
    /// \param allocations
    /// \param offsets If not null, it must point to an array of offsets of regions to flush, relative to the beginning of respective allocations. Null means all offsets are zero.
    /// \param sizes If not null, it must point to an array of sizes of regions to flush in respective allocations. Null means `VK_WHOLE_SIZE` for all allocations.
    /// 
    /// This function returns the `VkResult` from `vkFlushMappedMemoryRanges` if it is
    /// called, otherwise `VK_SUCCESS`.
    /// ```
    public static int vmaFlushAllocations(
    	MemorySegment allocator,
    	int allocationCount,
    	MemorySegment allocations,
    	MemorySegment offsets,
    	MemorySegment sizes
    ) {
    	MethodHandle method = VMA_FLUSH_ALLOCATIONS.get();
    	try {
    		return (int) method.invokeExact(
    			allocator,
    			allocationCount,
    			allocations,
    			offsets,
    			sizes
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#vmaFlushAllocations].
    public static int vmaFlushAllocations(
    	VmaAllocator allocator,
    	int allocationCount,
    	NativePointerArray allocations,
    	NativeLongArray offsets,
    	NativeLongArray sizes
    ) {
    	return vmaFlushAllocations(
    		allocator.memorySegment(),
    		allocationCount,
    		allocations.memorySegment(),
    		offsets.memorySegment(),
    		sizes.memorySegment()
    	);
    }
    
    /// ```
    /// \brief Invalidates memory of given set of allocations.
    /// 
    /// Calls `vkInvalidateMappedMemoryRanges()` for memory associated with given ranges of given allocations.
    /// For more information, see documentation of vmaInvalidateAllocation().
    /// 
    /// \param allocator
    /// \param allocationCount
    /// \param allocations
    /// \param offsets If not null, it must point to an array of offsets of regions to flush, relative to the beginning of respective allocations. Null means all offsets are zero.
    /// \param sizes If not null, it must point to an array of sizes of regions to flush in respective allocations. Null means `VK_WHOLE_SIZE` for all allocations.
    /// 
    /// This function returns the `VkResult` from `vkInvalidateMappedMemoryRanges` if it is
    /// called, otherwise `VK_SUCCESS`.
    /// ```
    public static int vmaInvalidateAllocations(
    	MemorySegment allocator,
    	int allocationCount,
    	MemorySegment allocations,
    	MemorySegment offsets,
    	MemorySegment sizes
    ) {
    	MethodHandle method = VMA_INVALIDATE_ALLOCATIONS.get();
    	try {
    		return (int) method.invokeExact(
    			allocator,
    			allocationCount,
    			allocations,
    			offsets,
    			sizes
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#vmaInvalidateAllocations].
    public static int vmaInvalidateAllocations(
    	VmaAllocator allocator,
    	int allocationCount,
    	NativePointerArray allocations,
    	NativeLongArray offsets,
    	NativeLongArray sizes
    ) {
    	return vmaInvalidateAllocations(
    		allocator.memorySegment(),
    		allocationCount,
    		allocations.memorySegment(),
    		offsets.memorySegment(),
    		sizes.memorySegment()
    	);
    }
    
    /// ```
    /// \brief Maps the allocation temporarily if needed, copies data from specified host pointer to it, and flushes the memory from the host caches if needed.
    /// 
    /// \param allocator
    /// \param pSrcHostPointer Pointer to the host data that become source of the copy.
    /// \param dstAllocation   Handle to the allocation that becomes destination of the copy.
    /// \param dstAllocationLocalOffset  Offset within `dstAllocation` where to write copied data, in bytes.
    /// \param size            Number of bytes to copy.
    /// 
    /// This is a convenience function that allows to copy data from a host pointer to an allocation easily.
    /// Same behavior can be achieved by calling vmaMapMemory(), `memcpy()`, vmaUnmapMemory(), vmaFlushAllocation().
    /// 
    /// This function can be called only for allocations created in a memory type that has `VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT` flag.
    /// It can be ensured e.g. by using #VMA_MEMORY_USAGE_AUTO and #VMA_ALLOCATION_CREATE_HOST_ACCESS_SEQUENTIAL_WRITE_BIT or
    /// #VMA_ALLOCATION_CREATE_HOST_ACCESS_RANDOM_BIT.
    /// Otherwise, the function will fail and generate a Validation Layers error.
    /// 
    /// `dstAllocationLocalOffset` is relative to the contents of given `dstAllocation`.
    /// If you mean whole allocation, you should pass 0.
    /// Do not pass allocation's offset within device memory block this parameter!
    /// ```
    public static int vmaCopyMemoryToAllocation(
    	MemorySegment allocator,
    	MemorySegment pSrcHostPointer,
    	MemorySegment dstAllocation,
    	long dstAllocationLocalOffset,
    	long size
    ) {
    	MethodHandle method = VMA_COPY_MEMORY_TO_ALLOCATION.get();
    	try {
    		return (int) method.invokeExact(
    			allocator,
    			pSrcHostPointer,
    			dstAllocation,
    			dstAllocationLocalOffset,
    			size
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#vmaCopyMemoryToAllocation].
    public static int vmaCopyMemoryToAllocation(
    	VmaAllocator allocator,
    	MemorySegment pSrcHostPointer,
    	VmaAllocation dstAllocation,
    	long dstAllocationLocalOffset,
    	long size
    ) {
    	return vmaCopyMemoryToAllocation(
    		allocator.memorySegment(),
    		pSrcHostPointer,
    		dstAllocation.memorySegment(),
    		dstAllocationLocalOffset,
    		size
    	);
    }
    
    /// ```
    /// \brief Invalidates memory in the host caches if needed, maps the allocation temporarily if needed, and copies data from it to a specified host pointer.
    /// 
    /// \param allocator
    /// \param srcAllocation   Handle to the allocation that becomes source of the copy.
    /// \param srcAllocationLocalOffset  Offset within `srcAllocation` where to read copied data, in bytes.
    /// \param pDstHostPointer Pointer to the host memory that become destination of the copy.
    /// \param size            Number of bytes to copy.
    /// 
    /// This is a convenience function that allows to copy data from an allocation to a host pointer easily.
    /// Same behavior can be achieved by calling vmaInvalidateAllocation(), vmaMapMemory(), `memcpy()`, vmaUnmapMemory().
    /// 
    /// This function should be called only for allocations created in a memory type that has `VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT`
    /// and `VK_MEMORY_PROPERTY_HOST_CACHED_BIT` flag.
    /// It can be ensured e.g. by using #VMA_MEMORY_USAGE_AUTO and #VMA_ALLOCATION_CREATE_HOST_ACCESS_RANDOM_BIT.
    /// Otherwise, the function may fail and generate a Validation Layers error.
    /// It may also work very slowly when reading from an uncached memory.
    /// 
    /// `srcAllocationLocalOffset` is relative to the contents of given `srcAllocation`.
    /// If you mean whole allocation, you should pass 0.
    /// Do not pass allocation's offset within device memory block as this parameter!
    /// ```
    public static int vmaCopyAllocationToMemory(
    	MemorySegment allocator,
    	MemorySegment srcAllocation,
    	long srcAllocationLocalOffset,
    	MemorySegment pDstHostPointer,
    	long size
    ) {
    	MethodHandle method = VMA_COPY_ALLOCATION_TO_MEMORY.get();
    	try {
    		return (int) method.invokeExact(
    			allocator,
    			srcAllocation,
    			srcAllocationLocalOffset,
    			pDstHostPointer,
    			size
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#vmaCopyAllocationToMemory].
    public static int vmaCopyAllocationToMemory(
    	VmaAllocator allocator,
    	VmaAllocation srcAllocation,
    	long srcAllocationLocalOffset,
    	MemorySegment pDstHostPointer,
    	long size
    ) {
    	return vmaCopyAllocationToMemory(
    		allocator.memorySegment(),
    		srcAllocation.memorySegment(),
    		srcAllocationLocalOffset,
    		pDstHostPointer,
    		size
    	);
    }
    
    /// ```
    /// \brief Checks magic number in margins around all allocations in given memory types (in both default and custom pools) in search for corruptions.
    /// 
    /// \param allocator
    /// \param memoryTypeBits Bit mask, where each bit set means that a memory type with that index should be checked.
    /// 
    /// Corruption detection is enabled only when `VMA_DEBUG_DETECT_CORRUPTION` macro is defined to nonzero,
    /// `VMA_DEBUG_MARGIN` is defined to nonzero and only for memory types that are
    /// `HOST_VISIBLE` and `HOST_COHERENT`. For more information, see [Corruption detection](@ref debugging_memory_usage_corruption_detection).
    /// 
    /// Possible return values:
    /// 
    /// - `VK_ERROR_FEATURE_NOT_PRESENT` - corruption detection is not enabled for any of specified memory types.
    /// - `VK_SUCCESS` - corruption detection has been performed and succeeded.
    /// - `VK_ERROR_UNKNOWN` - corruption detection has been performed and found memory corruptions around one of the allocations.
    ///   `VMA_ASSERT` is also fired in that case.
    /// - Other value: Error returned by Vulkan, e.g. memory mapping failure.
    /// ```
    public static int vmaCheckCorruption(
    	MemorySegment allocator,
    	int memoryTypeBits
    ) {
    	MethodHandle method = VMA_CHECK_CORRUPTION.get();
    	try {
    		return (int) method.invokeExact(
    			allocator,
    			memoryTypeBits
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#vmaCheckCorruption].
    public static int vmaCheckCorruption(
    	VmaAllocator allocator,
    	int memoryTypeBits
    ) {
    	return vmaCheckCorruption(
    		allocator.memorySegment(),
    		memoryTypeBits
    	);
    }
    
    /// ```
    /// \brief Begins defragmentation process.
    /// 
    /// \param allocator Allocator object.
    /// \param pInfo Structure filled with parameters of defragmentation.
    /// \param[out] pContext Context object that must be passed to vmaEndDefragmentation() to finish defragmentation.
    /// \returns
    /// - `VK_SUCCESS` if defragmentation can begin.
    /// - `VK_ERROR_FEATURE_NOT_PRESENT` if defragmentation is not supported.
    /// 
    /// For more information about defragmentation, see documentation chapter:
    /// [Defragmentation](@ref defragmentation).
    /// ```
    public static int vmaBeginDefragmentation(
    	MemorySegment allocator,
    	MemorySegment pInfo,
    	MemorySegment pContext
    ) {
    	MethodHandle method = VMA_BEGIN_DEFRAGMENTATION.get();
    	try {
    		return (int) method.invokeExact(
    			allocator,
    			pInfo,
    			pContext
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#vmaBeginDefragmentation].
    public static int vmaBeginDefragmentation(
    	VmaAllocator allocator,
    	VmaDefragmentationInfo pInfo,
    	NativePointerArray pContext
    ) {
    	return vmaBeginDefragmentation(
    		allocator.memorySegment(),
    		pInfo.memorySegment(),
    		pContext.memorySegment()
    	);
    }
    
    /// ```
    /// \brief Ends defragmentation process.
    /// 
    /// \param allocator Allocator object.
    /// \param context Context object that has been created by vmaBeginDefragmentation().
    /// \param[out] pStats Optional stats for the defragmentation. Can be null.
    /// 
    /// Use this function to finish defragmentation started by vmaBeginDefragmentation().
    /// ```
    public static void vmaEndDefragmentation(
    	MemorySegment allocator,
    	MemorySegment context,
    	MemorySegment pStats
    ) {
    	MethodHandle method = VMA_END_DEFRAGMENTATION.get();
    	try {
    		 method.invokeExact(
    			allocator,
    			context,
    			pStats
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#vmaEndDefragmentation].
    public static void vmaEndDefragmentation(
    	VmaAllocator allocator,
    	VmaDefragmentationContext context,
    	@Nullable VmaDefragmentationStats pStats
    ) {
    	vmaEndDefragmentation(
    		allocator.memorySegment(),
    		context.memorySegment(),
    		pStats == null ? MemorySegment.NULL : pStats.memorySegment()
    	);
    }
    
    /// ```
    /// \brief Starts single defragmentation pass.
    /// 
    /// \param allocator Allocator object.
    /// \param context Context object that has been created by vmaBeginDefragmentation().
    /// \param[out] pPassInfo Computed information for current pass.
    /// \returns
    /// - `VK_SUCCESS` if no more moves are possible. Then you can omit call to vmaEndDefragmentationPass() and simply end whole defragmentation.
    /// - `VK_INCOMPLETE` if there are pending moves returned in `pPassInfo`. You need to perform them, call vmaEndDefragmentationPass(),
    ///   and then preferably try another pass with vmaBeginDefragmentationPass().
    /// ```
    public static int vmaBeginDefragmentationPass(
    	MemorySegment allocator,
    	MemorySegment context,
    	MemorySegment pPassInfo
    ) {
    	MethodHandle method = VMA_BEGIN_DEFRAGMENTATION_PASS.get();
    	try {
    		return (int) method.invokeExact(
    			allocator,
    			context,
    			pPassInfo
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#vmaBeginDefragmentationPass].
    public static int vmaBeginDefragmentationPass(
    	VmaAllocator allocator,
    	VmaDefragmentationContext context,
    	VmaDefragmentationPassMoveInfo pPassInfo
    ) {
    	return vmaBeginDefragmentationPass(
    		allocator.memorySegment(),
    		context.memorySegment(),
    		pPassInfo.memorySegment()
    	);
    }
    
    /// ```
    /// \brief Ends single defragmentation pass.
    /// 
    /// \param allocator Allocator object.
    /// \param context Context object that has been created by vmaBeginDefragmentation().
    /// \param pPassInfo Computed information for current pass filled by vmaBeginDefragmentationPass() and possibly modified by you.
    /// 
    /// Returns `VK_SUCCESS` if no more moves are possible or `VK_INCOMPLETE` if more defragmentations are possible.
    /// 
    /// Ends incremental defragmentation pass and commits all defragmentation moves from `pPassInfo`.
    /// After this call:
    /// 
    /// - Allocations at `pPassInfo[i].srcAllocation` that had `pPassInfo[i].operation ==` #VMA_DEFRAGMENTATION_MOVE_OPERATION_COPY
    ///   (which is the default) will be pointing to the new destination place.
    /// - Allocation at `pPassInfo[i].srcAllocation` that had `pPassInfo[i].operation ==` #VMA_DEFRAGMENTATION_MOVE_OPERATION_DESTROY
    ///   will be freed.
    /// 
    /// If no more moves are possible you can end whole defragmentation.
    /// ```
    public static int vmaEndDefragmentationPass(
    	MemorySegment allocator,
    	MemorySegment context,
    	MemorySegment pPassInfo
    ) {
    	MethodHandle method = VMA_END_DEFRAGMENTATION_PASS.get();
    	try {
    		return (int) method.invokeExact(
    			allocator,
    			context,
    			pPassInfo
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#vmaEndDefragmentationPass].
    public static int vmaEndDefragmentationPass(
    	VmaAllocator allocator,
    	VmaDefragmentationContext context,
    	VmaDefragmentationPassMoveInfo pPassInfo
    ) {
    	return vmaEndDefragmentationPass(
    		allocator.memorySegment(),
    		context.memorySegment(),
    		pPassInfo.memorySegment()
    	);
    }
    
    /// ```
    /// \brief Binds buffer to allocation.
    /// 
    /// Binds specified buffer to region of memory represented by specified allocation.
    /// Gets `VkDeviceMemory` handle and offset from the allocation.
    /// If you want to create a buffer, allocate memory for it and bind them together separately,
    /// you should use this function for binding instead of standard `vkBindBufferMemory()`,
    /// because it ensures proper synchronization so that when a `VkDeviceMemory` object is used by multiple
    /// allocations, calls to `vkBind*Memory()` or `vkMapMemory()` won't happen from multiple threads simultaneously
    /// (which is illegal in Vulkan).
    /// 
    /// It is recommended to use function vmaCreateBuffer() instead of this one.
    /// ```
    public static int vmaBindBufferMemory(
    	MemorySegment allocator,
    	MemorySegment allocation,
    	MemorySegment buffer
    ) {
    	MethodHandle method = VMA_BIND_BUFFER_MEMORY.get();
    	try {
    		return (int) method.invokeExact(
    			allocator,
    			allocation,
    			buffer
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#vmaBindBufferMemory].
    public static int vmaBindBufferMemory(
    	VmaAllocator allocator,
    	VmaAllocation allocation,
    	VkBuffer buffer
    ) {
    	return vmaBindBufferMemory(
    		allocator.memorySegment(),
    		allocation.memorySegment(),
    		buffer.memorySegment()
    	);
    }
    
    /// ```
    /// \brief Binds buffer to allocation with additional parameters.
    /// 
    /// \param allocator
    /// \param allocation
    /// \param allocationLocalOffset Additional offset to be added while binding, relative to the beginning of the `allocation`. Normally it should be 0.
    /// \param buffer
    /// \param pNext A chain of structures to be attached to `VkBindBufferMemoryInfoKHR` structure used internally. Normally it should be null.
    /// 
    /// This function is similar to vmaBindBufferMemory(), but it provides additional parameters.
    /// 
    /// If `pNext` is not null, #VmaAllocator object must have been created with #VMA_ALLOCATOR_CREATE_KHR_BIND_MEMORY2_BIT flag
    /// or with VmaAllocatorCreateInfo::vulkanApiVersion `>= VK_API_VERSION_1_1`. Otherwise the call fails.
    /// ```
    public static int vmaBindBufferMemory2(
    	MemorySegment allocator,
    	MemorySegment allocation,
    	long allocationLocalOffset,
    	MemorySegment buffer,
    	MemorySegment pNext
    ) {
    	MethodHandle method = VMA_BIND_BUFFER_MEMORY2.get();
    	try {
    		return (int) method.invokeExact(
    			allocator,
    			allocation,
    			allocationLocalOffset,
    			buffer,
    			pNext
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#vmaBindBufferMemory2].
    public static int vmaBindBufferMemory2(
    	VmaAllocator allocator,
    	VmaAllocation allocation,
    	long allocationLocalOffset,
    	VkBuffer buffer,
    	MemorySegment pNext
    ) {
    	return vmaBindBufferMemory2(
    		allocator.memorySegment(),
    		allocation.memorySegment(),
    		allocationLocalOffset,
    		buffer.memorySegment(),
    		pNext
    	);
    }
    
    /// ```
    /// \brief Binds image to allocation.
    /// 
    /// Binds specified image to region of memory represented by specified allocation.
    /// Gets `VkDeviceMemory` handle and offset from the allocation.
    /// If you want to create an image, allocate memory for it and bind them together separately,
    /// you should use this function for binding instead of standard `vkBindImageMemory()`,
    /// because it ensures proper synchronization so that when a `VkDeviceMemory` object is used by multiple
    /// allocations, calls to `vkBind*Memory()` or `vkMapMemory()` won't happen from multiple threads simultaneously
    /// (which is illegal in Vulkan).
    /// 
    /// It is recommended to use function vmaCreateImage() instead of this one.
    /// ```
    public static int vmaBindImageMemory(
    	MemorySegment allocator,
    	MemorySegment allocation,
    	MemorySegment image
    ) {
    	MethodHandle method = VMA_BIND_IMAGE_MEMORY.get();
    	try {
    		return (int) method.invokeExact(
    			allocator,
    			allocation,
    			image
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#vmaBindImageMemory].
    public static int vmaBindImageMemory(
    	VmaAllocator allocator,
    	VmaAllocation allocation,
    	VkImage image
    ) {
    	return vmaBindImageMemory(
    		allocator.memorySegment(),
    		allocation.memorySegment(),
    		image.memorySegment()
    	);
    }
    
    /// ```
    /// \brief Binds image to allocation with additional parameters.
    /// 
    /// \param allocator
    /// \param allocation
    /// \param allocationLocalOffset Additional offset to be added while binding, relative to the beginning of the `allocation`. Normally it should be 0.
    /// \param image
    /// \param pNext A chain of structures to be attached to `VkBindImageMemoryInfoKHR` structure used internally. Normally it should be null.
    /// 
    /// This function is similar to vmaBindImageMemory(), but it provides additional parameters.
    /// 
    /// If `pNext` is not null, #VmaAllocator object must have been created with #VMA_ALLOCATOR_CREATE_KHR_BIND_MEMORY2_BIT flag
    /// or with VmaAllocatorCreateInfo::vulkanApiVersion `>= VK_API_VERSION_1_1`. Otherwise the call fails.
    /// ```
    public static int vmaBindImageMemory2(
    	MemorySegment allocator,
    	MemorySegment allocation,
    	long allocationLocalOffset,
    	MemorySegment image,
    	MemorySegment pNext
    ) {
    	MethodHandle method = VMA_BIND_IMAGE_MEMORY2.get();
    	try {
    		return (int) method.invokeExact(
    			allocator,
    			allocation,
    			allocationLocalOffset,
    			image,
    			pNext
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#vmaBindImageMemory2].
    public static int vmaBindImageMemory2(
    	VmaAllocator allocator,
    	VmaAllocation allocation,
    	long allocationLocalOffset,
    	VkImage image,
    	MemorySegment pNext
    ) {
    	return vmaBindImageMemory2(
    		allocator.memorySegment(),
    		allocation.memorySegment(),
    		allocationLocalOffset,
    		image.memorySegment(),
    		pNext
    	);
    }
    
    /// ```
    /// \brief Creates a new `VkBuffer`, allocates and binds memory for it.
    /// 
    /// \param allocator The main allocator object.
    /// \param pBufferCreateInfo Buffer creation parameters.
    /// \param pAllocationCreateInfo Allocation creation parameters.
    /// \param[out] pBuffer Buffer that was created.
    /// \param[out] pAllocation Allocation that was created.
    /// \param[out] pAllocationInfo Optional, can be null. Information about allocated memory.
    ///     It can be also fetched later using vmaGetAllocationInfo().
    /// 
    /// This function automatically:
    /// 
    /// -# Creates buffer.
    /// -# Allocates appropriate memory for it.
    /// -# Binds the buffer with the memory.
    /// 
    /// If any of these operations fail, buffer and allocation are not created,
    /// returned value is negative error code, `*pBuffer` and `*pAllocation` are returned as null.
    /// 
    /// If the function succeeded, you must destroy both buffer and allocation when you
    /// no longer need them using either convenience function vmaDestroyBuffer() or
    /// separately, using `vkDestroyBuffer()` and vmaFreeMemory().
    /// 
    /// If VK_KHR_dedicated_allocation extenion or Vulkan version >= 1.1 is used,
    /// the function queries the driver whether
    /// it requires or prefers the new buffer to have dedicated allocation. If yes,
    /// and if dedicated allocation is possible
    /// (#VMA_ALLOCATION_CREATE_NEVER_ALLOCATE_BIT is not used), it creates dedicated
    /// allocation for this buffer, just like when using
    /// #VMA_ALLOCATION_CREATE_DEDICATED_MEMORY_BIT.
    /// 
    /// \note This function creates a new `VkBuffer`. Sub-allocation of parts of one large buffer,
    /// although recommended as a good practice, is out of scope of this library and could be implemented
    /// by the user as a higher-level logic on top of VMA.
    /// 
    /// There is also an extended versions of this function available with additional parameter `pMemoryAllocateNext` -
    /// see vmaCreateDedicatedBuffer().
    /// ```
    public static int vmaCreateBuffer(
    	MemorySegment allocator,
    	MemorySegment pBufferCreateInfo,
    	MemorySegment pAllocationCreateInfo,
    	MemorySegment pBuffer,
    	MemorySegment pAllocation,
    	MemorySegment pAllocationInfo
    ) {
    	MethodHandle method = VMA_CREATE_BUFFER.get();
    	try {
    		return (int) method.invokeExact(
    			allocator,
    			pBufferCreateInfo,
    			pAllocationCreateInfo,
    			pBuffer,
    			pAllocation,
    			pAllocationInfo
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#vmaCreateBuffer].
    public static int vmaCreateBuffer(
    	VmaAllocator allocator,
    	VkBufferCreateInfo pBufferCreateInfo,
    	VmaAllocationCreateInfo pAllocationCreateInfo,
    	NativePointerArray pBuffer,
    	NativePointerArray pAllocation,
    	@Nullable VmaAllocationInfo pAllocationInfo
    ) {
    	return vmaCreateBuffer(
    		allocator.memorySegment(),
    		pBufferCreateInfo.memorySegment(),
    		pAllocationCreateInfo.memorySegment(),
    		pBuffer.memorySegment(),
    		pAllocation.memorySegment(),
    		pAllocationInfo == null ? MemorySegment.NULL : pAllocationInfo.memorySegment()
    	);
    }
    
    /// ```
    /// \brief Creates a buffer with additional minimum alignment.
    /// 
    /// Similar to vmaCreateBuffer() but provides additional parameter `minAlignment` which allows to specify custom,
    /// minimum alignment to be used when placing the buffer inside a larger memory block, which may be needed e.g.
    /// for interop with OpenGL.
    /// 
    /// \deprecated
    /// This function in obsolete since new VmaAllocationCreateInfo::minAlignment member allows specifying custom
    /// alignment while using any allocation function, like the standard vmaCreateBuffer().
    /// ```
    public static int vmaCreateBufferWithAlignment(
    	MemorySegment allocator,
    	MemorySegment pBufferCreateInfo,
    	MemorySegment pAllocationCreateInfo,
    	long minAlignment,
    	MemorySegment pBuffer,
    	MemorySegment pAllocation,
    	MemorySegment pAllocationInfo
    ) {
    	MethodHandle method = VMA_CREATE_BUFFER_WITH_ALIGNMENT.get();
    	try {
    		return (int) method.invokeExact(
    			allocator,
    			pBufferCreateInfo,
    			pAllocationCreateInfo,
    			minAlignment,
    			pBuffer,
    			pAllocation,
    			pAllocationInfo
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#vmaCreateBufferWithAlignment].
    public static int vmaCreateBufferWithAlignment(
    	VmaAllocator allocator,
    	VkBufferCreateInfo pBufferCreateInfo,
    	VmaAllocationCreateInfo pAllocationCreateInfo,
    	long minAlignment,
    	NativePointerArray pBuffer,
    	NativePointerArray pAllocation,
    	@Nullable VmaAllocationInfo pAllocationInfo
    ) {
    	return vmaCreateBufferWithAlignment(
    		allocator.memorySegment(),
    		pBufferCreateInfo.memorySegment(),
    		pAllocationCreateInfo.memorySegment(),
    		minAlignment,
    		pBuffer.memorySegment(),
    		pAllocation.memorySegment(),
    		pAllocationInfo == null ? MemorySegment.NULL : pAllocationInfo.memorySegment()
    	);
    }
    
    /// ```
    /// \brief Creates a dedicated buffer while offering extra parameter `pMemoryAllocateNext`.
    /// 
    /// This function is similar vmaCreateBuffer(), but
    /// it always allocates dedicated memory for the buffer - flag #VMA_ALLOCATION_CREATE_DEDICATED_MEMORY_BIT is implied.
    /// It offers additional parameter `pMemoryAllocateNext`,
    /// which can be used to attach `pNext` chain to the `VkMemoryAllocateInfo` structure.
    /// It can be useful for importing external memory. For more information, see \ref other_api_interop.
    /// ```
    public static int vmaCreateDedicatedBuffer(
    	MemorySegment allocator,
    	MemorySegment pBufferCreateInfo,
    	MemorySegment pAllocationCreateInfo,
    	MemorySegment pMemoryAllocateNext,
    	MemorySegment pBuffer,
    	MemorySegment pAllocation,
    	MemorySegment pAllocationInfo
    ) {
    	MethodHandle method = VMA_CREATE_DEDICATED_BUFFER.get();
    	try {
    		return (int) method.invokeExact(
    			allocator,
    			pBufferCreateInfo,
    			pAllocationCreateInfo,
    			pMemoryAllocateNext,
    			pBuffer,
    			pAllocation,
    			pAllocationInfo
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#vmaCreateDedicatedBuffer].
    public static int vmaCreateDedicatedBuffer(
    	VmaAllocator allocator,
    	VkBufferCreateInfo pBufferCreateInfo,
    	VmaAllocationCreateInfo pAllocationCreateInfo,
    	MemorySegment pMemoryAllocateNext,
    	NativePointerArray pBuffer,
    	NativePointerArray pAllocation,
    	@Nullable VmaAllocationInfo pAllocationInfo
    ) {
    	return vmaCreateDedicatedBuffer(
    		allocator.memorySegment(),
    		pBufferCreateInfo.memorySegment(),
    		pAllocationCreateInfo.memorySegment(),
    		pMemoryAllocateNext,
    		pBuffer.memorySegment(),
    		pAllocation.memorySegment(),
    		pAllocationInfo == null ? MemorySegment.NULL : pAllocationInfo.memorySegment()
    	);
    }
    
    /// ```
    /// \brief Creates a new `VkBuffer`, binds already created memory for it.
    /// 
    /// \param allocator
    /// \param allocation Allocation that provides memory to be used for binding new buffer to it.
    /// \param pBufferCreateInfo
    /// \param[out] pBuffer Buffer that was created.
    /// 
    /// This function automatically:
    /// 
    /// -# Creates buffer.
    /// -# Binds the buffer with the supplied memory.
    /// 
    /// If any of these operations fail, buffer is not created,
    /// returned value is negative error code and `*pBuffer` is null.
    /// 
    /// If the function succeeded, you must destroy the buffer when you
    /// no longer need it using `vkDestroyBuffer()`. If you want to also destroy the corresponding
    /// allocation you can use convenience function vmaDestroyBuffer().
    /// 
    /// \note There is a new version of this function augmented with parameter `allocationLocalOffset` - see vmaCreateAliasingBuffer2().
    /// ```
    public static int vmaCreateAliasingBuffer(
    	MemorySegment allocator,
    	MemorySegment allocation,
    	MemorySegment pBufferCreateInfo,
    	MemorySegment pBuffer
    ) {
    	MethodHandle method = VMA_CREATE_ALIASING_BUFFER.get();
    	try {
    		return (int) method.invokeExact(
    			allocator,
    			allocation,
    			pBufferCreateInfo,
    			pBuffer
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#vmaCreateAliasingBuffer].
    public static int vmaCreateAliasingBuffer(
    	VmaAllocator allocator,
    	VmaAllocation allocation,
    	VkBufferCreateInfo pBufferCreateInfo,
    	NativePointerArray pBuffer
    ) {
    	return vmaCreateAliasingBuffer(
    		allocator.memorySegment(),
    		allocation.memorySegment(),
    		pBufferCreateInfo.memorySegment(),
    		pBuffer.memorySegment()
    	);
    }
    
    /// ```
    /// \brief Creates a new `VkBuffer`, binds already created memory for it.
    /// 
    /// \param allocator
    /// \param allocation Allocation that provides memory to be used for binding new buffer to it.
    /// \param allocationLocalOffset Additional offset to be added while binding, relative to the beginning of the allocation. Normally it should be 0.
    /// \param pBufferCreateInfo 
    /// \param[out] pBuffer Buffer that was created.
    /// 
    /// This function automatically:
    /// 
    /// -# Creates buffer.
    /// -# Binds the buffer with the supplied memory.
    /// 
    /// If any of these operations fail, buffer is not created,
    /// returned value is negative error code and `*pBuffer` is null.
    /// 
    /// If the function succeeded, you must destroy the buffer when you
    /// no longer need it using `vkDestroyBuffer()`. If you want to also destroy the corresponding
    /// allocation you can use convenience function vmaDestroyBuffer().
    /// 
    /// \note This is a new version of the function augmented with parameter `allocationLocalOffset`.
    /// ```
    public static int vmaCreateAliasingBuffer2(
    	MemorySegment allocator,
    	MemorySegment allocation,
    	long allocationLocalOffset,
    	MemorySegment pBufferCreateInfo,
    	MemorySegment pBuffer
    ) {
    	MethodHandle method = VMA_CREATE_ALIASING_BUFFER2.get();
    	try {
    		return (int) method.invokeExact(
    			allocator,
    			allocation,
    			allocationLocalOffset,
    			pBufferCreateInfo,
    			pBuffer
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#vmaCreateAliasingBuffer2].
    public static int vmaCreateAliasingBuffer2(
    	VmaAllocator allocator,
    	VmaAllocation allocation,
    	long allocationLocalOffset,
    	VkBufferCreateInfo pBufferCreateInfo,
    	NativePointerArray pBuffer
    ) {
    	return vmaCreateAliasingBuffer2(
    		allocator.memorySegment(),
    		allocation.memorySegment(),
    		allocationLocalOffset,
    		pBufferCreateInfo.memorySegment(),
    		pBuffer.memorySegment()
    	);
    }
    
    /// ```
    /// \brief Destroys Vulkan buffer and frees allocated memory.
    /// 
    /// This is just a convenience function equivalent to:
    /// 
    /// \code
    /// vkDestroyBuffer(device, buffer, allocationCallbacks);
    /// vmaFreeMemory(allocator, allocation);
    /// \endcode
    /// 
    /// It is safe to pass null as buffer and/or allocation.
    /// ```
    public static void vmaDestroyBuffer(
    	MemorySegment allocator,
    	MemorySegment buffer,
    	MemorySegment allocation
    ) {
    	MethodHandle method = VMA_DESTROY_BUFFER.get();
    	try {
    		 method.invokeExact(
    			allocator,
    			buffer,
    			allocation
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#vmaDestroyBuffer].
    public static void vmaDestroyBuffer(
    	VmaAllocator allocator,
    	@Nullable VkBuffer buffer,
    	@Nullable VmaAllocation allocation
    ) {
    	vmaDestroyBuffer(
    		allocator.memorySegment(),
    		buffer == null ? MemorySegment.NULL : buffer.memorySegment(),
    		allocation == null ? MemorySegment.NULL : allocation.memorySegment()
    	);
    }
    
    /// ```
    /// \brief Function similar to vmaCreateBuffer() but for images.
    /// 
    /// There is also an extended version of this function available: vmaCreateDedicatedImage()
    /// which offers additional parameter `pMemoryAllocateNext`.
    /// ```
    public static int vmaCreateImage(
    	MemorySegment allocator,
    	MemorySegment pImageCreateInfo,
    	MemorySegment pAllocationCreateInfo,
    	MemorySegment pImage,
    	MemorySegment pAllocation,
    	MemorySegment pAllocationInfo
    ) {
    	MethodHandle method = VMA_CREATE_IMAGE.get();
    	try {
    		return (int) method.invokeExact(
    			allocator,
    			pImageCreateInfo,
    			pAllocationCreateInfo,
    			pImage,
    			pAllocation,
    			pAllocationInfo
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#vmaCreateImage].
    public static int vmaCreateImage(
    	VmaAllocator allocator,
    	VkImageCreateInfo pImageCreateInfo,
    	VmaAllocationCreateInfo pAllocationCreateInfo,
    	NativePointerArray pImage,
    	NativePointerArray pAllocation,
    	@Nullable VmaAllocationInfo pAllocationInfo
    ) {
    	return vmaCreateImage(
    		allocator.memorySegment(),
    		pImageCreateInfo.memorySegment(),
    		pAllocationCreateInfo.memorySegment(),
    		pImage.memorySegment(),
    		pAllocation.memorySegment(),
    		pAllocationInfo == null ? MemorySegment.NULL : pAllocationInfo.memorySegment()
    	);
    }
    
    /// ```
    /// \brief Function similar to vmaCreateDedicatedBuffer() but for images.
    /// 
    /// This function is similar vmaCreateImage(), but
    /// it always allocates dedicated memory for the image - flag #VMA_ALLOCATION_CREATE_DEDICATED_MEMORY_BIT is implied.
    /// It offers additional parameter `pMemoryAllocateNext`,
    /// which can be used to attach `pNext` chain to the `VkMemoryAllocateInfo` structure.
    /// It can be useful for importing external memory. For more information, see \ref other_api_interop.
    /// ```
    public static int vmaCreateDedicatedImage(
    	MemorySegment allocator,
    	MemorySegment pImageCreateInfo,
    	MemorySegment pAllocationCreateInfo,
    	MemorySegment pMemoryAllocateNext,
    	MemorySegment pImage,
    	MemorySegment pAllocation,
    	MemorySegment pAllocationInfo
    ) {
    	MethodHandle method = VMA_CREATE_DEDICATED_IMAGE.get();
    	try {
    		return (int) method.invokeExact(
    			allocator,
    			pImageCreateInfo,
    			pAllocationCreateInfo,
    			pMemoryAllocateNext,
    			pImage,
    			pAllocation,
    			pAllocationInfo
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#vmaCreateDedicatedImage].
    public static int vmaCreateDedicatedImage(
    	VmaAllocator allocator,
    	VkImageCreateInfo pImageCreateInfo,
    	VmaAllocationCreateInfo pAllocationCreateInfo,
    	MemorySegment pMemoryAllocateNext,
    	NativePointerArray pImage,
    	NativePointerArray pAllocation,
    	@Nullable VmaAllocationInfo pAllocationInfo
    ) {
    	return vmaCreateDedicatedImage(
    		allocator.memorySegment(),
    		pImageCreateInfo.memorySegment(),
    		pAllocationCreateInfo.memorySegment(),
    		pMemoryAllocateNext,
    		pImage.memorySegment(),
    		pAllocation.memorySegment(),
    		pAllocationInfo == null ? MemorySegment.NULL : pAllocationInfo.memorySegment()
    	);
    }
    
    /// ```
    /// Function similar to vmaCreateAliasingBuffer() but for images.
    /// ```
    public static int vmaCreateAliasingImage(
    	MemorySegment allocator,
    	MemorySegment allocation,
    	MemorySegment pImageCreateInfo,
    	MemorySegment pImage
    ) {
    	MethodHandle method = VMA_CREATE_ALIASING_IMAGE.get();
    	try {
    		return (int) method.invokeExact(
    			allocator,
    			allocation,
    			pImageCreateInfo,
    			pImage
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#vmaCreateAliasingImage].
    public static int vmaCreateAliasingImage(
    	VmaAllocator allocator,
    	VmaAllocation allocation,
    	VkImageCreateInfo pImageCreateInfo,
    	NativePointerArray pImage
    ) {
    	return vmaCreateAliasingImage(
    		allocator.memorySegment(),
    		allocation.memorySegment(),
    		pImageCreateInfo.memorySegment(),
    		pImage.memorySegment()
    	);
    }
    
    /// ```
    /// Function similar to vmaCreateAliasingBuffer2() but for images.
    /// ```
    public static int vmaCreateAliasingImage2(
    	MemorySegment allocator,
    	MemorySegment allocation,
    	long allocationLocalOffset,
    	MemorySegment pImageCreateInfo,
    	MemorySegment pImage
    ) {
    	MethodHandle method = VMA_CREATE_ALIASING_IMAGE2.get();
    	try {
    		return (int) method.invokeExact(
    			allocator,
    			allocation,
    			allocationLocalOffset,
    			pImageCreateInfo,
    			pImage
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#vmaCreateAliasingImage2].
    public static int vmaCreateAliasingImage2(
    	VmaAllocator allocator,
    	VmaAllocation allocation,
    	long allocationLocalOffset,
    	VkImageCreateInfo pImageCreateInfo,
    	NativePointerArray pImage
    ) {
    	return vmaCreateAliasingImage2(
    		allocator.memorySegment(),
    		allocation.memorySegment(),
    		allocationLocalOffset,
    		pImageCreateInfo.memorySegment(),
    		pImage.memorySegment()
    	);
    }
    
    /// ```
    /// \brief Destroys Vulkan image and frees allocated memory.
    /// 
    /// This is just a convenience function equivalent to:
    /// 
    /// \code
    /// vkDestroyImage(device, image, allocationCallbacks);
    /// vmaFreeMemory(allocator, allocation);
    /// \endcode
    /// 
    /// It is safe to pass null as image and/or allocation.
    /// ```
    public static void vmaDestroyImage(
    	MemorySegment allocator,
    	MemorySegment image,
    	MemorySegment allocation
    ) {
    	MethodHandle method = VMA_DESTROY_IMAGE.get();
    	try {
    		 method.invokeExact(
    			allocator,
    			image,
    			allocation
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#vmaDestroyImage].
    public static void vmaDestroyImage(
    	VmaAllocator allocator,
    	@Nullable VkImage image,
    	@Nullable VmaAllocation allocation
    ) {
    	vmaDestroyImage(
    		allocator.memorySegment(),
    		image == null ? MemorySegment.NULL : image.memorySegment(),
    		allocation == null ? MemorySegment.NULL : allocation.memorySegment()
    	);
    }
    
    /// ```
    /// \brief Creates new #VmaVirtualBlock object.
    /// 
    /// \param pCreateInfo Parameters for creation.
    /// \param[out] pVirtualBlock Returned virtual block object or `VMA_NULL` if creation failed.
    /// ```
    public static int vmaCreateVirtualBlock(
    	MemorySegment pCreateInfo,
    	MemorySegment pVirtualBlock
    ) {
    	MethodHandle method = VMA_CREATE_VIRTUAL_BLOCK.get();
    	try {
    		return (int) method.invokeExact(
    			pCreateInfo,
    			pVirtualBlock
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#vmaCreateVirtualBlock].
    public static int vmaCreateVirtualBlock(
    	VmaVirtualBlockCreateInfo pCreateInfo,
    	NativePointerArray pVirtualBlock
    ) {
    	return vmaCreateVirtualBlock(
    		pCreateInfo.memorySegment(),
    		pVirtualBlock.memorySegment()
    	);
    }
    
    /// ```
    /// \brief Destroys #VmaVirtualBlock object.
    /// 
    /// Please note that you should consciously handle virtual allocations that could remain unfreed in the block.
    /// You should either free them individually using vmaVirtualFree() or call vmaClearVirtualBlock()
    /// if you are sure this is what you want. If you do neither, an assert is called.
    /// 
    /// If you keep pointers to some additional metadata associated with your virtual allocations in their `pUserData`,
    /// don't forget to free them.
    /// ```
    public static void vmaDestroyVirtualBlock(
    	MemorySegment virtualBlock
    ) {
    	MethodHandle method = VMA_DESTROY_VIRTUAL_BLOCK.get();
    	try {
    		 method.invokeExact(
    			virtualBlock
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#vmaDestroyVirtualBlock].
    public static void vmaDestroyVirtualBlock(
    	VmaVirtualBlock virtualBlock
    ) {
    	vmaDestroyVirtualBlock(
    		virtualBlock.memorySegment()
    	);
    }
    
    /// ```
    /// \brief Returns true of the #VmaVirtualBlock is empty - contains 0 virtual allocations and has all its space available for new allocations.
    /// ```
    public static int vmaIsVirtualBlockEmpty(
    	MemorySegment virtualBlock
    ) {
    	MethodHandle method = VMA_IS_VIRTUAL_BLOCK_EMPTY.get();
    	try {
    		return (int) method.invokeExact(
    			virtualBlock
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#vmaIsVirtualBlockEmpty].
    public static int vmaIsVirtualBlockEmpty(
    	VmaVirtualBlock virtualBlock
    ) {
    	return vmaIsVirtualBlockEmpty(
    		virtualBlock.memorySegment()
    	);
    }
    
    /// ```
    /// \brief Returns information about a specific virtual allocation within a virtual block, like its size and `pUserData` pointer.
    /// ```
    public static void vmaGetVirtualAllocationInfo(
    	MemorySegment virtualBlock,
    	MemorySegment allocation,
    	MemorySegment pVirtualAllocInfo
    ) {
    	MethodHandle method = VMA_GET_VIRTUAL_ALLOCATION_INFO.get();
    	try {
    		 method.invokeExact(
    			virtualBlock,
    			allocation,
    			pVirtualAllocInfo
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#vmaGetVirtualAllocationInfo].
    public static void vmaGetVirtualAllocationInfo(
    	VmaVirtualBlock virtualBlock,
    	VmaVirtualAllocation allocation,
    	VmaVirtualAllocationInfo pVirtualAllocInfo
    ) {
    	vmaGetVirtualAllocationInfo(
    		virtualBlock.memorySegment(),
    		allocation.memorySegment(),
    		pVirtualAllocInfo.memorySegment()
    	);
    }
    
    /// ```
    /// \brief Allocates new virtual allocation inside given #VmaVirtualBlock.
    /// 
    /// If the allocation fails due to not enough free space available, `VK_ERROR_OUT_OF_DEVICE_MEMORY` is returned
    /// (despite the function doesn't ever allocate actual GPU memory).
    /// `pAllocation` is then set to `VK_NULL_HANDLE` and `pOffset`, if not null, it set to `UINT64_MAX`.
    /// 
    /// \param virtualBlock Virtual block
    /// \param pCreateInfo Parameters for the allocation
    /// \param[out] pAllocation Returned handle of the new allocation
    /// \param[out] pOffset Returned offset of the new allocation. Optional, can be null.
    /// ```
    public static int vmaVirtualAllocate(
    	MemorySegment virtualBlock,
    	MemorySegment pCreateInfo,
    	MemorySegment pAllocation,
    	MemorySegment pOffset
    ) {
    	MethodHandle method = VMA_VIRTUAL_ALLOCATE.get();
    	try {
    		return (int) method.invokeExact(
    			virtualBlock,
    			pCreateInfo,
    			pAllocation,
    			pOffset
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#vmaVirtualAllocate].
    public static int vmaVirtualAllocate(
    	VmaVirtualBlock virtualBlock,
    	VmaVirtualAllocationCreateInfo pCreateInfo,
    	NativePointerArray pAllocation,
    	NativeLongArray pOffset
    ) {
    	return vmaVirtualAllocate(
    		virtualBlock.memorySegment(),
    		pCreateInfo.memorySegment(),
    		pAllocation.memorySegment(),
    		pOffset.memorySegment()
    	);
    }
    
    /// ```
    /// \brief Frees virtual allocation inside given #VmaVirtualBlock.
    /// 
    /// It is correct to call this function with `allocation == VK_NULL_HANDLE` - it does nothing.
    /// ```
    public static void vmaVirtualFree(
    	MemorySegment virtualBlock,
    	MemorySegment allocation
    ) {
    	MethodHandle method = VMA_VIRTUAL_FREE.get();
    	try {
    		 method.invokeExact(
    			virtualBlock,
    			allocation
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#vmaVirtualFree].
    public static void vmaVirtualFree(
    	VmaVirtualBlock virtualBlock,
    	VmaVirtualAllocation allocation
    ) {
    	vmaVirtualFree(
    		virtualBlock.memorySegment(),
    		allocation.memorySegment()
    	);
    }
    
    /// ```
    /// \brief Frees all virtual allocations inside given #VmaVirtualBlock.
    /// 
    /// You must either call this function or free each virtual allocation individually with vmaVirtualFree()
    /// before destroying a virtual block. Otherwise, an assert is called.
    /// 
    /// If you keep pointer to some additional metadata associated with your virtual allocation in its `pUserData`,
    /// don't forget to free it as well.
    /// ```
    public static void vmaClearVirtualBlock(
    	MemorySegment virtualBlock
    ) {
    	MethodHandle method = VMA_CLEAR_VIRTUAL_BLOCK.get();
    	try {
    		 method.invokeExact(
    			virtualBlock
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#vmaClearVirtualBlock].
    public static void vmaClearVirtualBlock(
    	VmaVirtualBlock virtualBlock
    ) {
    	vmaClearVirtualBlock(
    		virtualBlock.memorySegment()
    	);
    }
    
    /// ```
    /// \brief Changes custom pointer associated with given virtual allocation.
    /// ```
    public static void vmaSetVirtualAllocationUserData(
    	MemorySegment virtualBlock,
    	MemorySegment allocation,
    	MemorySegment pUserData
    ) {
    	MethodHandle method = VMA_SET_VIRTUAL_ALLOCATION_USER_DATA.get();
    	try {
    		 method.invokeExact(
    			virtualBlock,
    			allocation,
    			pUserData
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#vmaSetVirtualAllocationUserData].
    public static void vmaSetVirtualAllocationUserData(
    	VmaVirtualBlock virtualBlock,
    	VmaVirtualAllocation allocation,
    	MemorySegment pUserData
    ) {
    	vmaSetVirtualAllocationUserData(
    		virtualBlock.memorySegment(),
    		allocation.memorySegment(),
    		pUserData
    	);
    }
    
    /// ```
    /// \brief Calculates and returns statistics about virtual allocations and memory usage in given #VmaVirtualBlock.
    /// 
    /// This function is fast to call. For more detailed statistics, see vmaCalculateVirtualBlockStatistics().
    /// ```
    public static void vmaGetVirtualBlockStatistics(
    	MemorySegment virtualBlock,
    	MemorySegment pStats
    ) {
    	MethodHandle method = VMA_GET_VIRTUAL_BLOCK_STATISTICS.get();
    	try {
    		 method.invokeExact(
    			virtualBlock,
    			pStats
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#vmaGetVirtualBlockStatistics].
    public static void vmaGetVirtualBlockStatistics(
    	VmaVirtualBlock virtualBlock,
    	VmaStatistics pStats
    ) {
    	vmaGetVirtualBlockStatistics(
    		virtualBlock.memorySegment(),
    		pStats.memorySegment()
    	);
    }
    
    /// ```
    /// \brief Calculates and returns detailed statistics about virtual allocations and memory usage in given #VmaVirtualBlock.
    /// 
    /// This function is slow to call. Use for debugging purposes.
    /// For less detailed statistics, see vmaGetVirtualBlockStatistics().
    /// ```
    public static void vmaCalculateVirtualBlockStatistics(
    	MemorySegment virtualBlock,
    	MemorySegment pStats
    ) {
    	MethodHandle method = VMA_CALCULATE_VIRTUAL_BLOCK_STATISTICS.get();
    	try {
    		 method.invokeExact(
    			virtualBlock,
    			pStats
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#vmaCalculateVirtualBlockStatistics].
    public static void vmaCalculateVirtualBlockStatistics(
    	VmaVirtualBlock virtualBlock,
    	VmaDetailedStatistics pStats
    ) {
    	vmaCalculateVirtualBlockStatistics(
    		virtualBlock.memorySegment(),
    		pStats.memorySegment()
    	);
    }
    
    /// ```
    /// \brief Builds and returns a null-terminated string in JSON format with information about given #VmaVirtualBlock.
    /// \param virtualBlock Virtual block.
    /// \param[out] ppStatsString Returned string.
    /// \param detailedMap Pass `VK_FALSE` to only obtain statistics as returned by vmaCalculateVirtualBlockStatistics(). Pass `VK_TRUE` to also obtain full list of allocations and free spaces.
    /// 
    /// Returned string must be freed using vmaFreeVirtualBlockStatsString().
    /// ```
    public static void vmaBuildVirtualBlockStatsString(
    	MemorySegment virtualBlock,
    	MemorySegment ppStatsString,
    	int detailedMap
    ) {
    	MethodHandle method = VMA_BUILD_VIRTUAL_BLOCK_STATS_STRING.get();
    	try {
    		 method.invokeExact(
    			virtualBlock,
    			ppStatsString,
    			detailedMap
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#vmaBuildVirtualBlockStatsString].
    public static void vmaBuildVirtualBlockStatsString(
    	VmaVirtualBlock virtualBlock,
    	NativePointerArray ppStatsString,
    	int detailedMap
    ) {
    	vmaBuildVirtualBlockStatsString(
    		virtualBlock.memorySegment(),
    		ppStatsString.memorySegment(),
    		detailedMap
    	);
    }
    
    /// ```
    /// Frees a string returned by vmaBuildVirtualBlockStatsString().
    /// ```
    public static void vmaFreeVirtualBlockStatsString(
    	MemorySegment virtualBlock,
    	MemorySegment pStatsString
    ) {
    	MethodHandle method = VMA_FREE_VIRTUAL_BLOCK_STATS_STRING.get();
    	try {
    		 method.invokeExact(
    			virtualBlock,
    			pStatsString
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#vmaFreeVirtualBlockStatsString].
    public static void vmaFreeVirtualBlockStatsString(
    	VmaVirtualBlock virtualBlock,
    	NativeByteArray pStatsString
    ) {
    	vmaFreeVirtualBlockStatsString(
    		virtualBlock.memorySegment(),
    		pStatsString.memorySegment()
    	);
    }
    
    /// ```
    /// \brief Builds and returns statistics as a null-terminated string in JSON format.
    /// \param allocator
    /// \param[out] ppStatsString Must be freed using vmaFreeStatsString() function.
    /// \param detailedMap
    /// ```
    public static void vmaBuildStatsString(
    	MemorySegment allocator,
    	MemorySegment ppStatsString,
    	int detailedMap
    ) {
    	MethodHandle method = VMA_BUILD_STATS_STRING.get();
    	try {
    		 method.invokeExact(
    			allocator,
    			ppStatsString,
    			detailedMap
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#vmaBuildStatsString].
    public static void vmaBuildStatsString(
    	VmaAllocator allocator,
    	NativePointerArray ppStatsString,
    	int detailedMap
    ) {
    	vmaBuildStatsString(
    		allocator.memorySegment(),
    		ppStatsString.memorySegment(),
    		detailedMap
    	);
    }
    
    public static void vmaFreeStatsString(
    	MemorySegment allocator,
    	MemorySegment pStatsString
    ) {
    	MethodHandle method = VMA_FREE_STATS_STRING.get();
    	try {
    		 method.invokeExact(
    			allocator,
    			pStatsString
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#vmaFreeStatsString].
    public static void vmaFreeStatsString(
    	VmaAllocator allocator,
    	NativeByteArray pStatsString
    ) {
    	vmaFreeStatsString(
    		allocator.memorySegment(),
    		pStatsString.memorySegment()
    	);
    }

}