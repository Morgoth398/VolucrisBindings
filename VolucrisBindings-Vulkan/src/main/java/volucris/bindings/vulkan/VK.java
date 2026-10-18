/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.MemoryStack;
import volucris.bindings.core.NativeFloatArray;
import volucris.bindings.core.NativeIntArray;
import volucris.bindings.core.NativeLongArray;
import volucris.bindings.core.NativePointerArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.structs.*;
import volucris.bindings.vulkan.unions.VkClearColorValue;

/**
 * 
 */
public final class VK extends VulkanBase {


    static {

    }
    
    private VK() {
        
    }

    public static void vkDestroyInstance(
        VkInstance instance,
    	MemorySegment pAllocator
    ) {
        MethodHandle method = instance.VK_DESTROY_INSTANCE().get();
        try {
             method.invokeExact(
                instance.memorySegment(),
                pAllocator
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkDestroyInstance].
    public static void vkDestroyInstance(
    	VkInstance instance,
    	@Nullable VkAllocationCallbacks pAllocator
    ) {
    	vkDestroyInstance(
    		instance,
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment()
    	);
    }
    
    public static int vkEnumeratePhysicalDevices(
        VkInstance instance,
    	MemorySegment pPhysicalDeviceCount,
    	MemorySegment pPhysicalDevices
    ) {
        MethodHandle method = instance.VK_ENUMERATE_PHYSICAL_DEVICES().get();
        try {
            return (int) method.invokeExact(
                instance.memorySegment(),
                pPhysicalDeviceCount,
                pPhysicalDevices
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkEnumeratePhysicalDevices].
    public static int vkEnumeratePhysicalDevices(
    	VkInstance instance,
    	NativeIntArray pPhysicalDeviceCount,
    	@Nullable NativePointerArray pPhysicalDevices
    ) {
    	return vkEnumeratePhysicalDevices(
    		instance,
    		pPhysicalDeviceCount.memorySegment(),
    		pPhysicalDevices == null ? MemorySegment.NULL : pPhysicalDevices.memorySegment()
    	);
    }
    
    public static void vkGetPhysicalDeviceFeatures(
        VkPhysicalDevice physicalDevice,
    	MemorySegment pFeatures
    ) {
        MethodHandle method = physicalDevice.VK_GET_PHYSICAL_DEVICE_FEATURES().get();
        try {
             method.invokeExact(
                physicalDevice.memorySegment(),
                pFeatures
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetPhysicalDeviceFeatures].
    public static void vkGetPhysicalDeviceFeatures(
    	VkPhysicalDevice physicalDevice,
    	VkPhysicalDeviceFeatures pFeatures
    ) {
    	vkGetPhysicalDeviceFeatures(
    		physicalDevice,
    		pFeatures.memorySegment()
    	);
    }
    
    public static void vkGetPhysicalDeviceFormatProperties(
        VkPhysicalDevice physicalDevice,
    	int format,
    	MemorySegment pFormatProperties
    ) {
        MethodHandle method = physicalDevice.VK_GET_PHYSICAL_DEVICE_FORMAT_PROPERTIES().get();
        try {
             method.invokeExact(
                physicalDevice.memorySegment(),
                format,
                pFormatProperties
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetPhysicalDeviceFormatProperties].
    public static void vkGetPhysicalDeviceFormatProperties(
    	VkPhysicalDevice physicalDevice,
    	int format,
    	VkFormatProperties pFormatProperties
    ) {
    	vkGetPhysicalDeviceFormatProperties(
    		physicalDevice,
    		format,
    		pFormatProperties.memorySegment()
    	);
    }
    
    public static int vkGetPhysicalDeviceImageFormatProperties(
        VkPhysicalDevice physicalDevice,
    	int format,
    	int type,
    	int tiling,
    	int usage,
    	int flags,
    	MemorySegment pImageFormatProperties
    ) {
        MethodHandle method = physicalDevice.VK_GET_PHYSICAL_DEVICE_IMAGE_FORMAT_PROPERTIES().get();
        try {
            return (int) method.invokeExact(
                physicalDevice.memorySegment(),
                format,
                type,
                tiling,
                usage,
                flags,
                pImageFormatProperties
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetPhysicalDeviceImageFormatProperties].
    public static int vkGetPhysicalDeviceImageFormatProperties(
    	VkPhysicalDevice physicalDevice,
    	int format,
    	int type,
    	int tiling,
    	int usage,
    	int flags,
    	VkImageFormatProperties pImageFormatProperties
    ) {
    	return vkGetPhysicalDeviceImageFormatProperties(
    		physicalDevice,
    		format,
    		type,
    		tiling,
    		usage,
    		flags,
    		pImageFormatProperties.memorySegment()
    	);
    }
    
    public static void vkGetPhysicalDeviceProperties(
        VkPhysicalDevice physicalDevice,
    	MemorySegment pProperties
    ) {
        MethodHandle method = physicalDevice.VK_GET_PHYSICAL_DEVICE_PROPERTIES().get();
        try {
             method.invokeExact(
                physicalDevice.memorySegment(),
                pProperties
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetPhysicalDeviceProperties].
    public static void vkGetPhysicalDeviceProperties(
    	VkPhysicalDevice physicalDevice,
    	VkPhysicalDeviceProperties pProperties
    ) {
    	vkGetPhysicalDeviceProperties(
    		physicalDevice,
    		pProperties.memorySegment()
    	);
    }
    
    public static void vkGetPhysicalDeviceQueueFamilyProperties(
        VkPhysicalDevice physicalDevice,
    	MemorySegment pQueueFamilyPropertyCount,
    	MemorySegment pQueueFamilyProperties
    ) {
        MethodHandle method = physicalDevice.VK_GET_PHYSICAL_DEVICE_QUEUE_FAMILY_PROPERTIES().get();
        try {
             method.invokeExact(
                physicalDevice.memorySegment(),
                pQueueFamilyPropertyCount,
                pQueueFamilyProperties
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetPhysicalDeviceQueueFamilyProperties].
    public static void vkGetPhysicalDeviceQueueFamilyProperties(
    	VkPhysicalDevice physicalDevice,
    	NativeIntArray pQueueFamilyPropertyCount,
    	@Nullable NativeStructArray<VkQueueFamilyProperties> pQueueFamilyProperties
    ) {
    	vkGetPhysicalDeviceQueueFamilyProperties(
    		physicalDevice,
    		pQueueFamilyPropertyCount.memorySegment(),
    		pQueueFamilyProperties == null ? MemorySegment.NULL : pQueueFamilyProperties.memorySegment()
    	);
    }
    
    public static void vkGetPhysicalDeviceMemoryProperties(
        VkPhysicalDevice physicalDevice,
    	MemorySegment pMemoryProperties
    ) {
        MethodHandle method = physicalDevice.VK_GET_PHYSICAL_DEVICE_MEMORY_PROPERTIES().get();
        try {
             method.invokeExact(
                physicalDevice.memorySegment(),
                pMemoryProperties
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetPhysicalDeviceMemoryProperties].
    public static void vkGetPhysicalDeviceMemoryProperties(
    	VkPhysicalDevice physicalDevice,
    	VkPhysicalDeviceMemoryProperties pMemoryProperties
    ) {
    	vkGetPhysicalDeviceMemoryProperties(
    		physicalDevice,
    		pMemoryProperties.memorySegment()
    	);
    }
    
    public static int vkCreateDevice(
        VkPhysicalDevice physicalDevice,
    	MemorySegment pCreateInfo,
    	MemorySegment pAllocator,
    	MemorySegment pDevice
    ) {
        MethodHandle method = physicalDevice.VK_CREATE_DEVICE().get();
        try {
            return (int) method.invokeExact(
                physicalDevice.memorySegment(),
                pCreateInfo,
                pAllocator,
                pDevice
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCreateDevice].
    public static int vkCreateDevice(
    	VkPhysicalDevice physicalDevice,
    	VkDeviceCreateInfo pCreateInfo,
    	@Nullable VkAllocationCallbacks pAllocator,
    	NativePointerArray pDevice
    ) {
    	return vkCreateDevice(
    		physicalDevice,
    		pCreateInfo.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment(),
    		pDevice.memorySegment()
    	);
    }
    
    public static void vkDestroyDevice(
        VkDevice device,
    	MemorySegment pAllocator
    ) {
        MethodHandle method = device.VK_DESTROY_DEVICE().get();
        try {
             method.invokeExact(
                device.memorySegment(),
                pAllocator
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkDestroyDevice].
    public static void vkDestroyDevice(
    	VkDevice device,
    	@Nullable VkAllocationCallbacks pAllocator
    ) {
    	vkDestroyDevice(
    		device,
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment()
    	);
    }
    
    public static int vkEnumerateDeviceExtensionProperties(
        VkPhysicalDevice physicalDevice,
    	MemorySegment pLayerName,
    	MemorySegment pPropertyCount,
    	MemorySegment pProperties
    ) {
        MethodHandle method = physicalDevice.VK_ENUMERATE_DEVICE_EXTENSION_PROPERTIES().get();
        try {
            return (int) method.invokeExact(
                physicalDevice.memorySegment(),
                pLayerName,
                pPropertyCount,
                pProperties
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkEnumerateDeviceExtensionProperties].
    public static int vkEnumerateDeviceExtensionProperties(
    	VkPhysicalDevice physicalDevice,
    	@Nullable String pLayerName,
    	NativeIntArray pPropertyCount,
    	@Nullable NativeStructArray<VkExtensionProperties> pProperties
    ) {
    	try (Arena arena = MemoryStack.stackPush()) {
    		return vkEnumerateDeviceExtensionProperties(
    			physicalDevice,
    			pLayerName == null ? MemorySegment.NULL : arena.allocateFrom(pLayerName),
    			pPropertyCount.memorySegment(),
    			pProperties == null ? MemorySegment.NULL : pProperties.memorySegment()
    		);
    	}
    }
    
    public static int vkEnumerateDeviceLayerProperties(
        VkPhysicalDevice physicalDevice,
    	MemorySegment pPropertyCount,
    	MemorySegment pProperties
    ) {
        MethodHandle method = physicalDevice.VK_ENUMERATE_DEVICE_LAYER_PROPERTIES().get();
        try {
            return (int) method.invokeExact(
                physicalDevice.memorySegment(),
                pPropertyCount,
                pProperties
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkEnumerateDeviceLayerProperties].
    public static int vkEnumerateDeviceLayerProperties(
    	VkPhysicalDevice physicalDevice,
    	NativeIntArray pPropertyCount,
    	@Nullable NativeStructArray<VkLayerProperties> pProperties
    ) {
    	return vkEnumerateDeviceLayerProperties(
    		physicalDevice,
    		pPropertyCount.memorySegment(),
    		pProperties == null ? MemorySegment.NULL : pProperties.memorySegment()
    	);
    }
    
    public static void vkGetDeviceQueue(
        VkDevice device,
    	int queueFamilyIndex,
    	int queueIndex,
    	MemorySegment pQueue
    ) {
        MethodHandle method = device.VK_GET_DEVICE_QUEUE().get();
        try {
             method.invokeExact(
                device.memorySegment(),
                queueFamilyIndex,
                queueIndex,
                pQueue
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetDeviceQueue].
    public static void vkGetDeviceQueue(
    	VkDevice device,
    	int queueFamilyIndex,
    	int queueIndex,
    	NativePointerArray pQueue
    ) {
    	vkGetDeviceQueue(
    		device,
    		queueFamilyIndex,
    		queueIndex,
    		pQueue.memorySegment()
    	);
    }
    
    public static int vkQueueSubmit(
        VkQueue queue,
    	int submitCount,
    	MemorySegment pSubmits,
    	MemorySegment fence
    ) {
        MethodHandle method = queue.VK_QUEUE_SUBMIT().get();
        try {
            return (int) method.invokeExact(
                queue.memorySegment(),
                submitCount,
                pSubmits,
                fence
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkQueueSubmit].
    public static int vkQueueSubmit(
    	VkQueue queue,
    	int submitCount,
    	@Nullable NativeStructArray<VkSubmitInfo> pSubmits,
    	@Nullable VkFence fence
    ) {
    	return vkQueueSubmit(
    		queue,
    		submitCount,
    		pSubmits == null ? MemorySegment.NULL : pSubmits.memorySegment(),
    		fence == null ? MemorySegment.NULL : fence.memorySegment()
    	);
    }
    
    public static int vkQueueWaitIdle(
        VkQueue queue
    ) {
        MethodHandle method = queue.VK_QUEUE_WAIT_IDLE().get();
        try {
            return (int) method.invokeExact(
                queue.memorySegment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    
    public static int vkDeviceWaitIdle(
        VkDevice device
    ) {
        MethodHandle method = device.VK_DEVICE_WAIT_IDLE().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    
    public static int vkAllocateMemory(
        VkDevice device,
    	MemorySegment pAllocateInfo,
    	MemorySegment pAllocator,
    	MemorySegment pMemory
    ) {
        MethodHandle method = device.VK_ALLOCATE_MEMORY().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                pAllocateInfo,
                pAllocator,
                pMemory
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkAllocateMemory].
    public static int vkAllocateMemory(
    	VkDevice device,
    	VkMemoryAllocateInfo pAllocateInfo,
    	@Nullable VkAllocationCallbacks pAllocator,
    	NativePointerArray pMemory
    ) {
    	return vkAllocateMemory(
    		device,
    		pAllocateInfo.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment(),
    		pMemory.memorySegment()
    	);
    }
    
    public static void vkFreeMemory(
        VkDevice device,
    	MemorySegment memory,
    	MemorySegment pAllocator
    ) {
        MethodHandle method = device.VK_FREE_MEMORY().get();
        try {
             method.invokeExact(
                device.memorySegment(),
                memory,
                pAllocator
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkFreeMemory].
    public static void vkFreeMemory(
    	VkDevice device,
    	@Nullable VkDeviceMemory memory,
    	@Nullable VkAllocationCallbacks pAllocator
    ) {
    	vkFreeMemory(
    		device,
    		memory == null ? MemorySegment.NULL : memory.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment()
    	);
    }
    
    public static int vkMapMemory(
        VkDevice device,
    	MemorySegment memory,
    	long offset,
    	long size,
    	int flags,
    	MemorySegment ppData
    ) {
        MethodHandle method = device.VK_MAP_MEMORY().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                memory,
                offset,
                size,
                flags,
                ppData
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkMapMemory].
    public static int vkMapMemory(
    	VkDevice device,
    	VkDeviceMemory memory,
    	long offset,
    	long size,
    	int flags,
    	NativePointerArray ppData
    ) {
    	return vkMapMemory(
    		device,
    		memory.memorySegment(),
    		offset,
    		size,
    		flags,
    		ppData.memorySegment()
    	);
    }
    
    public static void vkUnmapMemory(
        VkDevice device,
    	MemorySegment memory
    ) {
        MethodHandle method = device.VK_UNMAP_MEMORY().get();
        try {
             method.invokeExact(
                device.memorySegment(),
                memory
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkUnmapMemory].
    public static void vkUnmapMemory(
    	VkDevice device,
    	VkDeviceMemory memory
    ) {
    	vkUnmapMemory(
    		device,
    		memory.memorySegment()
    	);
    }
    
    public static int vkFlushMappedMemoryRanges(
        VkDevice device,
    	int memoryRangeCount,
    	MemorySegment pMemoryRanges
    ) {
        MethodHandle method = device.VK_FLUSH_MAPPED_MEMORY_RANGES().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                memoryRangeCount,
                pMemoryRanges
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkFlushMappedMemoryRanges].
    public static int vkFlushMappedMemoryRanges(
    	VkDevice device,
    	int memoryRangeCount,
    	NativeStructArray<VkMappedMemoryRange> pMemoryRanges
    ) {
    	return vkFlushMappedMemoryRanges(
    		device,
    		memoryRangeCount,
    		pMemoryRanges.memorySegment()
    	);
    }
    
    public static int vkInvalidateMappedMemoryRanges(
        VkDevice device,
    	int memoryRangeCount,
    	MemorySegment pMemoryRanges
    ) {
        MethodHandle method = device.VK_INVALIDATE_MAPPED_MEMORY_RANGES().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                memoryRangeCount,
                pMemoryRanges
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkInvalidateMappedMemoryRanges].
    public static int vkInvalidateMappedMemoryRanges(
    	VkDevice device,
    	int memoryRangeCount,
    	NativeStructArray<VkMappedMemoryRange> pMemoryRanges
    ) {
    	return vkInvalidateMappedMemoryRanges(
    		device,
    		memoryRangeCount,
    		pMemoryRanges.memorySegment()
    	);
    }
    
    public static void vkGetDeviceMemoryCommitment(
        VkDevice device,
    	MemorySegment memory,
    	MemorySegment pCommittedMemoryInBytes
    ) {
        MethodHandle method = device.VK_GET_DEVICE_MEMORY_COMMITMENT().get();
        try {
             method.invokeExact(
                device.memorySegment(),
                memory,
                pCommittedMemoryInBytes
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetDeviceMemoryCommitment].
    public static void vkGetDeviceMemoryCommitment(
    	VkDevice device,
    	VkDeviceMemory memory,
    	NativeLongArray pCommittedMemoryInBytes
    ) {
    	vkGetDeviceMemoryCommitment(
    		device,
    		memory.memorySegment(),
    		pCommittedMemoryInBytes.memorySegment()
    	);
    }
    
    public static int vkBindBufferMemory(
        VkDevice device,
    	MemorySegment buffer,
    	MemorySegment memory,
    	long memoryOffset
    ) {
        MethodHandle method = device.VK_BIND_BUFFER_MEMORY().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                buffer,
                memory,
                memoryOffset
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkBindBufferMemory].
    public static int vkBindBufferMemory(
    	VkDevice device,
    	VkBuffer buffer,
    	VkDeviceMemory memory,
    	long memoryOffset
    ) {
    	return vkBindBufferMemory(
    		device,
    		buffer.memorySegment(),
    		memory.memorySegment(),
    		memoryOffset
    	);
    }
    
    public static int vkBindImageMemory(
        VkDevice device,
    	MemorySegment image,
    	MemorySegment memory,
    	long memoryOffset
    ) {
        MethodHandle method = device.VK_BIND_IMAGE_MEMORY().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                image,
                memory,
                memoryOffset
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkBindImageMemory].
    public static int vkBindImageMemory(
    	VkDevice device,
    	VkImage image,
    	VkDeviceMemory memory,
    	long memoryOffset
    ) {
    	return vkBindImageMemory(
    		device,
    		image.memorySegment(),
    		memory.memorySegment(),
    		memoryOffset
    	);
    }
    
    public static void vkGetBufferMemoryRequirements(
        VkDevice device,
    	MemorySegment buffer,
    	MemorySegment pMemoryRequirements
    ) {
        MethodHandle method = device.VK_GET_BUFFER_MEMORY_REQUIREMENTS().get();
        try {
             method.invokeExact(
                device.memorySegment(),
                buffer,
                pMemoryRequirements
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetBufferMemoryRequirements].
    public static void vkGetBufferMemoryRequirements(
    	VkDevice device,
    	VkBuffer buffer,
    	VkMemoryRequirements pMemoryRequirements
    ) {
    	vkGetBufferMemoryRequirements(
    		device,
    		buffer.memorySegment(),
    		pMemoryRequirements.memorySegment()
    	);
    }
    
    public static void vkGetImageMemoryRequirements(
        VkDevice device,
    	MemorySegment image,
    	MemorySegment pMemoryRequirements
    ) {
        MethodHandle method = device.VK_GET_IMAGE_MEMORY_REQUIREMENTS().get();
        try {
             method.invokeExact(
                device.memorySegment(),
                image,
                pMemoryRequirements
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetImageMemoryRequirements].
    public static void vkGetImageMemoryRequirements(
    	VkDevice device,
    	VkImage image,
    	VkMemoryRequirements pMemoryRequirements
    ) {
    	vkGetImageMemoryRequirements(
    		device,
    		image.memorySegment(),
    		pMemoryRequirements.memorySegment()
    	);
    }
    
    public static void vkGetImageSparseMemoryRequirements(
        VkDevice device,
    	MemorySegment image,
    	MemorySegment pSparseMemoryRequirementCount,
    	MemorySegment pSparseMemoryRequirements
    ) {
        MethodHandle method = device.VK_GET_IMAGE_SPARSE_MEMORY_REQUIREMENTS().get();
        try {
             method.invokeExact(
                device.memorySegment(),
                image,
                pSparseMemoryRequirementCount,
                pSparseMemoryRequirements
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetImageSparseMemoryRequirements].
    public static void vkGetImageSparseMemoryRequirements(
    	VkDevice device,
    	VkImage image,
    	NativeIntArray pSparseMemoryRequirementCount,
    	@Nullable NativeStructArray<VkSparseImageMemoryRequirements> pSparseMemoryRequirements
    ) {
    	vkGetImageSparseMemoryRequirements(
    		device,
    		image.memorySegment(),
    		pSparseMemoryRequirementCount.memorySegment(),
    		pSparseMemoryRequirements == null ? MemorySegment.NULL : pSparseMemoryRequirements.memorySegment()
    	);
    }
    
    public static void vkGetPhysicalDeviceSparseImageFormatProperties(
        VkPhysicalDevice physicalDevice,
    	int format,
    	int type,
    	int samples,
    	int usage,
    	int tiling,
    	MemorySegment pPropertyCount,
    	MemorySegment pProperties
    ) {
        MethodHandle method = physicalDevice.VK_GET_PHYSICAL_DEVICE_SPARSE_IMAGE_FORMAT_PROPERTIES().get();
        try {
             method.invokeExact(
                physicalDevice.memorySegment(),
                format,
                type,
                samples,
                usage,
                tiling,
                pPropertyCount,
                pProperties
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetPhysicalDeviceSparseImageFormatProperties].
    public static void vkGetPhysicalDeviceSparseImageFormatProperties(
    	VkPhysicalDevice physicalDevice,
    	int format,
    	int type,
    	int samples,
    	int usage,
    	int tiling,
    	NativeIntArray pPropertyCount,
    	@Nullable NativeStructArray<VkSparseImageFormatProperties> pProperties
    ) {
    	vkGetPhysicalDeviceSparseImageFormatProperties(
    		physicalDevice,
    		format,
    		type,
    		samples,
    		usage,
    		tiling,
    		pPropertyCount.memorySegment(),
    		pProperties == null ? MemorySegment.NULL : pProperties.memorySegment()
    	);
    }
    
    public static int vkQueueBindSparse(
        VkQueue queue,
    	int bindInfoCount,
    	MemorySegment pBindInfo,
    	MemorySegment fence
    ) {
        MethodHandle method = queue.VK_QUEUE_BIND_SPARSE().get();
        try {
            return (int) method.invokeExact(
                queue.memorySegment(),
                bindInfoCount,
                pBindInfo,
                fence
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkQueueBindSparse].
    public static int vkQueueBindSparse(
    	VkQueue queue,
    	int bindInfoCount,
    	@Nullable NativeStructArray<VkBindSparseInfo> pBindInfo,
    	@Nullable VkFence fence
    ) {
    	return vkQueueBindSparse(
    		queue,
    		bindInfoCount,
    		pBindInfo == null ? MemorySegment.NULL : pBindInfo.memorySegment(),
    		fence == null ? MemorySegment.NULL : fence.memorySegment()
    	);
    }
    
    public static int vkCreateFence(
        VkDevice device,
    	MemorySegment pCreateInfo,
    	MemorySegment pAllocator,
    	MemorySegment pFence
    ) {
        MethodHandle method = device.VK_CREATE_FENCE().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                pCreateInfo,
                pAllocator,
                pFence
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCreateFence].
    public static int vkCreateFence(
    	VkDevice device,
    	VkFenceCreateInfo pCreateInfo,
    	@Nullable VkAllocationCallbacks pAllocator,
    	NativePointerArray pFence
    ) {
    	return vkCreateFence(
    		device,
    		pCreateInfo.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment(),
    		pFence.memorySegment()
    	);
    }
    
    public static void vkDestroyFence(
        VkDevice device,
    	MemorySegment fence,
    	MemorySegment pAllocator
    ) {
        MethodHandle method = device.VK_DESTROY_FENCE().get();
        try {
             method.invokeExact(
                device.memorySegment(),
                fence,
                pAllocator
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkDestroyFence].
    public static void vkDestroyFence(
    	VkDevice device,
    	@Nullable VkFence fence,
    	@Nullable VkAllocationCallbacks pAllocator
    ) {
    	vkDestroyFence(
    		device,
    		fence == null ? MemorySegment.NULL : fence.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment()
    	);
    }
    
    public static int vkResetFences(
        VkDevice device,
    	int fenceCount,
    	MemorySegment pFences
    ) {
        MethodHandle method = device.VK_RESET_FENCES().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                fenceCount,
                pFences
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkResetFences].
    public static int vkResetFences(
    	VkDevice device,
    	int fenceCount,
    	NativePointerArray pFences
    ) {
    	return vkResetFences(
    		device,
    		fenceCount,
    		pFences.memorySegment()
    	);
    }
    
    public static int vkGetFenceStatus(
        VkDevice device,
    	MemorySegment fence
    ) {
        MethodHandle method = device.VK_GET_FENCE_STATUS().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                fence
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetFenceStatus].
    public static int vkGetFenceStatus(
    	VkDevice device,
    	VkFence fence
    ) {
    	return vkGetFenceStatus(
    		device,
    		fence.memorySegment()
    	);
    }
    
    public static int vkWaitForFences(
        VkDevice device,
    	int fenceCount,
    	MemorySegment pFences,
    	int waitAll,
    	long timeout
    ) {
        MethodHandle method = device.VK_WAIT_FOR_FENCES().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                fenceCount,
                pFences,
                waitAll,
                timeout
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkWaitForFences].
    public static int vkWaitForFences(
    	VkDevice device,
    	int fenceCount,
    	NativePointerArray pFences,
    	int waitAll,
    	long timeout
    ) {
    	return vkWaitForFences(
    		device,
    		fenceCount,
    		pFences.memorySegment(),
    		waitAll,
    		timeout
    	);
    }
    
    public static int vkCreateSemaphore(
        VkDevice device,
    	MemorySegment pCreateInfo,
    	MemorySegment pAllocator,
    	MemorySegment pSemaphore
    ) {
        MethodHandle method = device.VK_CREATE_SEMAPHORE().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                pCreateInfo,
                pAllocator,
                pSemaphore
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCreateSemaphore].
    public static int vkCreateSemaphore(
    	VkDevice device,
    	VkSemaphoreCreateInfo pCreateInfo,
    	@Nullable VkAllocationCallbacks pAllocator,
    	NativePointerArray pSemaphore
    ) {
    	return vkCreateSemaphore(
    		device,
    		pCreateInfo.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment(),
    		pSemaphore.memorySegment()
    	);
    }
    
    public static void vkDestroySemaphore(
        VkDevice device,
    	MemorySegment semaphore,
    	MemorySegment pAllocator
    ) {
        MethodHandle method = device.VK_DESTROY_SEMAPHORE().get();
        try {
             method.invokeExact(
                device.memorySegment(),
                semaphore,
                pAllocator
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkDestroySemaphore].
    public static void vkDestroySemaphore(
    	VkDevice device,
    	@Nullable VkSemaphore semaphore,
    	@Nullable VkAllocationCallbacks pAllocator
    ) {
    	vkDestroySemaphore(
    		device,
    		semaphore == null ? MemorySegment.NULL : semaphore.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment()
    	);
    }
    
    public static int vkCreateQueryPool(
        VkDevice device,
    	MemorySegment pCreateInfo,
    	MemorySegment pAllocator,
    	MemorySegment pQueryPool
    ) {
        MethodHandle method = device.VK_CREATE_QUERY_POOL().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                pCreateInfo,
                pAllocator,
                pQueryPool
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCreateQueryPool].
    public static int vkCreateQueryPool(
    	VkDevice device,
    	VkQueryPoolCreateInfo pCreateInfo,
    	@Nullable VkAllocationCallbacks pAllocator,
    	NativePointerArray pQueryPool
    ) {
    	return vkCreateQueryPool(
    		device,
    		pCreateInfo.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment(),
    		pQueryPool.memorySegment()
    	);
    }
    
    public static void vkDestroyQueryPool(
        VkDevice device,
    	MemorySegment queryPool,
    	MemorySegment pAllocator
    ) {
        MethodHandle method = device.VK_DESTROY_QUERY_POOL().get();
        try {
             method.invokeExact(
                device.memorySegment(),
                queryPool,
                pAllocator
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkDestroyQueryPool].
    public static void vkDestroyQueryPool(
    	VkDevice device,
    	@Nullable VkQueryPool queryPool,
    	@Nullable VkAllocationCallbacks pAllocator
    ) {
    	vkDestroyQueryPool(
    		device,
    		queryPool == null ? MemorySegment.NULL : queryPool.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment()
    	);
    }
    
    public static int vkGetQueryPoolResults(
        VkDevice device,
    	MemorySegment queryPool,
    	int firstQuery,
    	int queryCount,
    	long dataSize,
    	MemorySegment pData,
    	long stride,
    	int flags
    ) {
        MethodHandle method = device.VK_GET_QUERY_POOL_RESULTS().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                queryPool,
                firstQuery,
                queryCount,
                dataSize,
                pData,
                stride,
                flags
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetQueryPoolResults].
    public static int vkGetQueryPoolResults(
    	VkDevice device,
    	VkQueryPool queryPool,
    	int firstQuery,
    	int queryCount,
    	long dataSize,
    	MemorySegment pData,
    	long stride,
    	int flags
    ) {
    	return vkGetQueryPoolResults(
    		device,
    		queryPool.memorySegment(),
    		firstQuery,
    		queryCount,
    		dataSize,
    		pData,
    		stride,
    		flags
    	);
    }
    
    public static int vkCreateBuffer(
        VkDevice device,
    	MemorySegment pCreateInfo,
    	MemorySegment pAllocator,
    	MemorySegment pBuffer
    ) {
        MethodHandle method = device.VK_CREATE_BUFFER().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                pCreateInfo,
                pAllocator,
                pBuffer
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCreateBuffer].
    public static int vkCreateBuffer(
    	VkDevice device,
    	VkBufferCreateInfo pCreateInfo,
    	@Nullable VkAllocationCallbacks pAllocator,
    	NativePointerArray pBuffer
    ) {
    	return vkCreateBuffer(
    		device,
    		pCreateInfo.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment(),
    		pBuffer.memorySegment()
    	);
    }
    
    public static void vkDestroyBuffer(
        VkDevice device,
    	MemorySegment buffer,
    	MemorySegment pAllocator
    ) {
        MethodHandle method = device.VK_DESTROY_BUFFER().get();
        try {
             method.invokeExact(
                device.memorySegment(),
                buffer,
                pAllocator
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkDestroyBuffer].
    public static void vkDestroyBuffer(
    	VkDevice device,
    	@Nullable VkBuffer buffer,
    	@Nullable VkAllocationCallbacks pAllocator
    ) {
    	vkDestroyBuffer(
    		device,
    		buffer == null ? MemorySegment.NULL : buffer.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment()
    	);
    }
    
    public static int vkCreateImage(
        VkDevice device,
    	MemorySegment pCreateInfo,
    	MemorySegment pAllocator,
    	MemorySegment pImage
    ) {
        MethodHandle method = device.VK_CREATE_IMAGE().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                pCreateInfo,
                pAllocator,
                pImage
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCreateImage].
    public static int vkCreateImage(
    	VkDevice device,
    	VkImageCreateInfo pCreateInfo,
    	@Nullable VkAllocationCallbacks pAllocator,
    	NativePointerArray pImage
    ) {
    	return vkCreateImage(
    		device,
    		pCreateInfo.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment(),
    		pImage.memorySegment()
    	);
    }
    
    public static void vkDestroyImage(
        VkDevice device,
    	MemorySegment image,
    	MemorySegment pAllocator
    ) {
        MethodHandle method = device.VK_DESTROY_IMAGE().get();
        try {
             method.invokeExact(
                device.memorySegment(),
                image,
                pAllocator
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkDestroyImage].
    public static void vkDestroyImage(
    	VkDevice device,
    	@Nullable VkImage image,
    	@Nullable VkAllocationCallbacks pAllocator
    ) {
    	vkDestroyImage(
    		device,
    		image == null ? MemorySegment.NULL : image.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment()
    	);
    }
    
    public static void vkGetImageSubresourceLayout(
        VkDevice device,
    	MemorySegment image,
    	MemorySegment pSubresource,
    	MemorySegment pLayout
    ) {
        MethodHandle method = device.VK_GET_IMAGE_SUBRESOURCE_LAYOUT().get();
        try {
             method.invokeExact(
                device.memorySegment(),
                image,
                pSubresource,
                pLayout
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetImageSubresourceLayout].
    public static void vkGetImageSubresourceLayout(
    	VkDevice device,
    	VkImage image,
    	VkImageSubresource pSubresource,
    	VkSubresourceLayout pLayout
    ) {
    	vkGetImageSubresourceLayout(
    		device,
    		image.memorySegment(),
    		pSubresource.memorySegment(),
    		pLayout.memorySegment()
    	);
    }
    
    public static int vkCreateImageView(
        VkDevice device,
    	MemorySegment pCreateInfo,
    	MemorySegment pAllocator,
    	MemorySegment pView
    ) {
        MethodHandle method = device.VK_CREATE_IMAGE_VIEW().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                pCreateInfo,
                pAllocator,
                pView
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCreateImageView].
    public static int vkCreateImageView(
    	VkDevice device,
    	VkImageViewCreateInfo pCreateInfo,
    	@Nullable VkAllocationCallbacks pAllocator,
    	NativePointerArray pView
    ) {
    	return vkCreateImageView(
    		device,
    		pCreateInfo.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment(),
    		pView.memorySegment()
    	);
    }
    
    public static void vkDestroyImageView(
        VkDevice device,
    	MemorySegment imageView,
    	MemorySegment pAllocator
    ) {
        MethodHandle method = device.VK_DESTROY_IMAGE_VIEW().get();
        try {
             method.invokeExact(
                device.memorySegment(),
                imageView,
                pAllocator
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkDestroyImageView].
    public static void vkDestroyImageView(
    	VkDevice device,
    	@Nullable VkImageView imageView,
    	@Nullable VkAllocationCallbacks pAllocator
    ) {
    	vkDestroyImageView(
    		device,
    		imageView == null ? MemorySegment.NULL : imageView.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment()
    	);
    }
    
    public static int vkCreateCommandPool(
        VkDevice device,
    	MemorySegment pCreateInfo,
    	MemorySegment pAllocator,
    	MemorySegment pCommandPool
    ) {
        MethodHandle method = device.VK_CREATE_COMMAND_POOL().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                pCreateInfo,
                pAllocator,
                pCommandPool
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCreateCommandPool].
    public static int vkCreateCommandPool(
    	VkDevice device,
    	VkCommandPoolCreateInfo pCreateInfo,
    	@Nullable VkAllocationCallbacks pAllocator,
    	NativePointerArray pCommandPool
    ) {
    	return vkCreateCommandPool(
    		device,
    		pCreateInfo.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment(),
    		pCommandPool.memorySegment()
    	);
    }
    
    public static void vkDestroyCommandPool(
        VkDevice device,
    	MemorySegment commandPool,
    	MemorySegment pAllocator
    ) {
        MethodHandle method = device.VK_DESTROY_COMMAND_POOL().get();
        try {
             method.invokeExact(
                device.memorySegment(),
                commandPool,
                pAllocator
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkDestroyCommandPool].
    public static void vkDestroyCommandPool(
    	VkDevice device,
    	@Nullable VkCommandPool commandPool,
    	@Nullable VkAllocationCallbacks pAllocator
    ) {
    	vkDestroyCommandPool(
    		device,
    		commandPool == null ? MemorySegment.NULL : commandPool.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment()
    	);
    }
    
    public static int vkResetCommandPool(
        VkDevice device,
    	MemorySegment commandPool,
    	int flags
    ) {
        MethodHandle method = device.VK_RESET_COMMAND_POOL().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                commandPool,
                flags
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkResetCommandPool].
    public static int vkResetCommandPool(
    	VkDevice device,
    	VkCommandPool commandPool,
    	int flags
    ) {
    	return vkResetCommandPool(
    		device,
    		commandPool.memorySegment(),
    		flags
    	);
    }
    
    public static int vkAllocateCommandBuffers(
        VkDevice device,
    	MemorySegment pAllocateInfo,
    	MemorySegment pCommandBuffers
    ) {
        MethodHandle method = device.VK_ALLOCATE_COMMAND_BUFFERS().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                pAllocateInfo,
                pCommandBuffers
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkAllocateCommandBuffers].
    public static int vkAllocateCommandBuffers(
    	VkDevice device,
    	VkCommandBufferAllocateInfo pAllocateInfo,
    	NativePointerArray pCommandBuffers
    ) {
    	return vkAllocateCommandBuffers(
    		device,
    		pAllocateInfo.memorySegment(),
    		pCommandBuffers.memorySegment()
    	);
    }
    
    public static void vkFreeCommandBuffers(
        VkDevice device,
    	MemorySegment commandPool,
    	int commandBufferCount,
    	MemorySegment pCommandBuffers
    ) {
        MethodHandle method = device.VK_FREE_COMMAND_BUFFERS().get();
        try {
             method.invokeExact(
                device.memorySegment(),
                commandPool,
                commandBufferCount,
                pCommandBuffers
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkFreeCommandBuffers].
    public static void vkFreeCommandBuffers(
    	VkDevice device,
    	VkCommandPool commandPool,
    	int commandBufferCount,
    	NativePointerArray pCommandBuffers
    ) {
    	vkFreeCommandBuffers(
    		device,
    		commandPool.memorySegment(),
    		commandBufferCount,
    		pCommandBuffers.memorySegment()
    	);
    }
    
    public static int vkBeginCommandBuffer(
        VkCommandBuffer commandBuffer,
    	MemorySegment pBeginInfo
    ) {
        MethodHandle method = commandBuffer.VK_BEGIN_COMMAND_BUFFER().get();
        try {
            return (int) method.invokeExact(
                commandBuffer.memorySegment(),
                pBeginInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkBeginCommandBuffer].
    public static int vkBeginCommandBuffer(
    	VkCommandBuffer commandBuffer,
    	VkCommandBufferBeginInfo pBeginInfo
    ) {
    	return vkBeginCommandBuffer(
    		commandBuffer,
    		pBeginInfo.memorySegment()
    	);
    }
    
    public static int vkEndCommandBuffer(
        VkCommandBuffer commandBuffer
    ) {
        MethodHandle method = commandBuffer.VK_END_COMMAND_BUFFER().get();
        try {
            return (int) method.invokeExact(
                commandBuffer.memorySegment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    
    public static int vkResetCommandBuffer(
        VkCommandBuffer commandBuffer,
    	int flags
    ) {
        MethodHandle method = commandBuffer.VK_RESET_COMMAND_BUFFER().get();
        try {
            return (int) method.invokeExact(
                commandBuffer.memorySegment(),
                flags
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    
    public static void vkCmdCopyBuffer(
        VkCommandBuffer commandBuffer,
    	MemorySegment srcBuffer,
    	MemorySegment dstBuffer,
    	int regionCount,
    	MemorySegment pRegions
    ) {
        MethodHandle method = commandBuffer.VK_CMD_COPY_BUFFER().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                srcBuffer,
                dstBuffer,
                regionCount,
                pRegions
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdCopyBuffer].
    public static void vkCmdCopyBuffer(
    	VkCommandBuffer commandBuffer,
    	VkBuffer srcBuffer,
    	VkBuffer dstBuffer,
    	int regionCount,
    	NativeStructArray<VkBufferCopy> pRegions
    ) {
    	vkCmdCopyBuffer(
    		commandBuffer,
    		srcBuffer.memorySegment(),
    		dstBuffer.memorySegment(),
    		regionCount,
    		pRegions.memorySegment()
    	);
    }
    
    public static void vkCmdCopyImage(
        VkCommandBuffer commandBuffer,
    	MemorySegment srcImage,
    	int srcImageLayout,
    	MemorySegment dstImage,
    	int dstImageLayout,
    	int regionCount,
    	MemorySegment pRegions
    ) {
        MethodHandle method = commandBuffer.VK_CMD_COPY_IMAGE().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                srcImage,
                srcImageLayout,
                dstImage,
                dstImageLayout,
                regionCount,
                pRegions
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdCopyImage].
    public static void vkCmdCopyImage(
    	VkCommandBuffer commandBuffer,
    	VkImage srcImage,
    	int srcImageLayout,
    	VkImage dstImage,
    	int dstImageLayout,
    	int regionCount,
    	NativeStructArray<VkImageCopy> pRegions
    ) {
    	vkCmdCopyImage(
    		commandBuffer,
    		srcImage.memorySegment(),
    		srcImageLayout,
    		dstImage.memorySegment(),
    		dstImageLayout,
    		regionCount,
    		pRegions.memorySegment()
    	);
    }
    
    public static void vkCmdCopyBufferToImage(
        VkCommandBuffer commandBuffer,
    	MemorySegment srcBuffer,
    	MemorySegment dstImage,
    	int dstImageLayout,
    	int regionCount,
    	MemorySegment pRegions
    ) {
        MethodHandle method = commandBuffer.VK_CMD_COPY_BUFFER_TO_IMAGE().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                srcBuffer,
                dstImage,
                dstImageLayout,
                regionCount,
                pRegions
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdCopyBufferToImage].
    public static void vkCmdCopyBufferToImage(
    	VkCommandBuffer commandBuffer,
    	VkBuffer srcBuffer,
    	VkImage dstImage,
    	int dstImageLayout,
    	int regionCount,
    	NativeStructArray<VkBufferImageCopy> pRegions
    ) {
    	vkCmdCopyBufferToImage(
    		commandBuffer,
    		srcBuffer.memorySegment(),
    		dstImage.memorySegment(),
    		dstImageLayout,
    		regionCount,
    		pRegions.memorySegment()
    	);
    }
    
    public static void vkCmdCopyImageToBuffer(
        VkCommandBuffer commandBuffer,
    	MemorySegment srcImage,
    	int srcImageLayout,
    	MemorySegment dstBuffer,
    	int regionCount,
    	MemorySegment pRegions
    ) {
        MethodHandle method = commandBuffer.VK_CMD_COPY_IMAGE_TO_BUFFER().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                srcImage,
                srcImageLayout,
                dstBuffer,
                regionCount,
                pRegions
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdCopyImageToBuffer].
    public static void vkCmdCopyImageToBuffer(
    	VkCommandBuffer commandBuffer,
    	VkImage srcImage,
    	int srcImageLayout,
    	VkBuffer dstBuffer,
    	int regionCount,
    	NativeStructArray<VkBufferImageCopy> pRegions
    ) {
    	vkCmdCopyImageToBuffer(
    		commandBuffer,
    		srcImage.memorySegment(),
    		srcImageLayout,
    		dstBuffer.memorySegment(),
    		regionCount,
    		pRegions.memorySegment()
    	);
    }
    
    public static void vkCmdUpdateBuffer(
        VkCommandBuffer commandBuffer,
    	MemorySegment dstBuffer,
    	long dstOffset,
    	long dataSize,
    	MemorySegment pData
    ) {
        MethodHandle method = commandBuffer.VK_CMD_UPDATE_BUFFER().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                dstBuffer,
                dstOffset,
                dataSize,
                pData
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdUpdateBuffer].
    public static void vkCmdUpdateBuffer(
    	VkCommandBuffer commandBuffer,
    	VkBuffer dstBuffer,
    	long dstOffset,
    	long dataSize,
    	MemorySegment pData
    ) {
    	vkCmdUpdateBuffer(
    		commandBuffer,
    		dstBuffer.memorySegment(),
    		dstOffset,
    		dataSize,
    		pData
    	);
    }
    
    public static void vkCmdFillBuffer(
        VkCommandBuffer commandBuffer,
    	MemorySegment dstBuffer,
    	long dstOffset,
    	long size,
    	int data
    ) {
        MethodHandle method = commandBuffer.VK_CMD_FILL_BUFFER().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                dstBuffer,
                dstOffset,
                size,
                data
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdFillBuffer].
    public static void vkCmdFillBuffer(
    	VkCommandBuffer commandBuffer,
    	VkBuffer dstBuffer,
    	long dstOffset,
    	long size,
    	int data
    ) {
    	vkCmdFillBuffer(
    		commandBuffer,
    		dstBuffer.memorySegment(),
    		dstOffset,
    		size,
    		data
    	);
    }
    
    public static void vkCmdPipelineBarrier(
        VkCommandBuffer commandBuffer,
    	int srcStageMask,
    	int dstStageMask,
    	int dependencyFlags,
    	int memoryBarrierCount,
    	MemorySegment pMemoryBarriers,
    	int bufferMemoryBarrierCount,
    	MemorySegment pBufferMemoryBarriers,
    	int imageMemoryBarrierCount,
    	MemorySegment pImageMemoryBarriers
    ) {
        MethodHandle method = commandBuffer.VK_CMD_PIPELINE_BARRIER().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                srcStageMask,
                dstStageMask,
                dependencyFlags,
                memoryBarrierCount,
                pMemoryBarriers,
                bufferMemoryBarrierCount,
                pBufferMemoryBarriers,
                imageMemoryBarrierCount,
                pImageMemoryBarriers
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdPipelineBarrier].
    public static void vkCmdPipelineBarrier(
    	VkCommandBuffer commandBuffer,
    	int srcStageMask,
    	int dstStageMask,
    	int dependencyFlags,
    	int memoryBarrierCount,
    	@Nullable NativeStructArray<VkMemoryBarrier> pMemoryBarriers,
    	int bufferMemoryBarrierCount,
    	@Nullable NativeStructArray<VkBufferMemoryBarrier> pBufferMemoryBarriers,
    	int imageMemoryBarrierCount,
    	@Nullable NativeStructArray<VkImageMemoryBarrier> pImageMemoryBarriers
    ) {
    	vkCmdPipelineBarrier(
    		commandBuffer,
    		srcStageMask,
    		dstStageMask,
    		dependencyFlags,
    		memoryBarrierCount,
    		pMemoryBarriers == null ? MemorySegment.NULL : pMemoryBarriers.memorySegment(),
    		bufferMemoryBarrierCount,
    		pBufferMemoryBarriers == null ? MemorySegment.NULL : pBufferMemoryBarriers.memorySegment(),
    		imageMemoryBarrierCount,
    		pImageMemoryBarriers == null ? MemorySegment.NULL : pImageMemoryBarriers.memorySegment()
    	);
    }
    
    public static void vkCmdBeginQuery(
        VkCommandBuffer commandBuffer,
    	MemorySegment queryPool,
    	int query,
    	int flags
    ) {
        MethodHandle method = commandBuffer.VK_CMD_BEGIN_QUERY().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                queryPool,
                query,
                flags
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdBeginQuery].
    public static void vkCmdBeginQuery(
    	VkCommandBuffer commandBuffer,
    	VkQueryPool queryPool,
    	int query,
    	int flags
    ) {
    	vkCmdBeginQuery(
    		commandBuffer,
    		queryPool.memorySegment(),
    		query,
    		flags
    	);
    }
    
    public static void vkCmdEndQuery(
        VkCommandBuffer commandBuffer,
    	MemorySegment queryPool,
    	int query
    ) {
        MethodHandle method = commandBuffer.VK_CMD_END_QUERY().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                queryPool,
                query
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdEndQuery].
    public static void vkCmdEndQuery(
    	VkCommandBuffer commandBuffer,
    	VkQueryPool queryPool,
    	int query
    ) {
    	vkCmdEndQuery(
    		commandBuffer,
    		queryPool.memorySegment(),
    		query
    	);
    }
    
    public static void vkCmdResetQueryPool(
        VkCommandBuffer commandBuffer,
    	MemorySegment queryPool,
    	int firstQuery,
    	int queryCount
    ) {
        MethodHandle method = commandBuffer.VK_CMD_RESET_QUERY_POOL().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                queryPool,
                firstQuery,
                queryCount
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdResetQueryPool].
    public static void vkCmdResetQueryPool(
    	VkCommandBuffer commandBuffer,
    	VkQueryPool queryPool,
    	int firstQuery,
    	int queryCount
    ) {
    	vkCmdResetQueryPool(
    		commandBuffer,
    		queryPool.memorySegment(),
    		firstQuery,
    		queryCount
    	);
    }
    
    public static void vkCmdWriteTimestamp(
        VkCommandBuffer commandBuffer,
    	int pipelineStage,
    	MemorySegment queryPool,
    	int query
    ) {
        MethodHandle method = commandBuffer.VK_CMD_WRITE_TIMESTAMP().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                pipelineStage,
                queryPool,
                query
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdWriteTimestamp].
    public static void vkCmdWriteTimestamp(
    	VkCommandBuffer commandBuffer,
    	int pipelineStage,
    	VkQueryPool queryPool,
    	int query
    ) {
    	vkCmdWriteTimestamp(
    		commandBuffer,
    		pipelineStage,
    		queryPool.memorySegment(),
    		query
    	);
    }
    
    public static void vkCmdCopyQueryPoolResults(
        VkCommandBuffer commandBuffer,
    	MemorySegment queryPool,
    	int firstQuery,
    	int queryCount,
    	MemorySegment dstBuffer,
    	long dstOffset,
    	long stride,
    	int flags
    ) {
        MethodHandle method = commandBuffer.VK_CMD_COPY_QUERY_POOL_RESULTS().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                queryPool,
                firstQuery,
                queryCount,
                dstBuffer,
                dstOffset,
                stride,
                flags
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdCopyQueryPoolResults].
    public static void vkCmdCopyQueryPoolResults(
    	VkCommandBuffer commandBuffer,
    	VkQueryPool queryPool,
    	int firstQuery,
    	int queryCount,
    	VkBuffer dstBuffer,
    	long dstOffset,
    	long stride,
    	int flags
    ) {
    	vkCmdCopyQueryPoolResults(
    		commandBuffer,
    		queryPool.memorySegment(),
    		firstQuery,
    		queryCount,
    		dstBuffer.memorySegment(),
    		dstOffset,
    		stride,
    		flags
    	);
    }
    
    public static void vkCmdExecuteCommands(
        VkCommandBuffer commandBuffer,
    	int commandBufferCount,
    	MemorySegment pCommandBuffers
    ) {
        MethodHandle method = commandBuffer.VK_CMD_EXECUTE_COMMANDS().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                commandBufferCount,
                pCommandBuffers
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdExecuteCommands].
    public static void vkCmdExecuteCommands(
    	VkCommandBuffer commandBuffer,
    	int commandBufferCount,
    	NativePointerArray pCommandBuffers
    ) {
    	vkCmdExecuteCommands(
    		commandBuffer,
    		commandBufferCount,
    		pCommandBuffers.memorySegment()
    	);
    }
    
    public static int vkCreateEvent(
        VkDevice device,
    	MemorySegment pCreateInfo,
    	MemorySegment pAllocator,
    	MemorySegment pEvent
    ) {
        MethodHandle method = device.VK_CREATE_EVENT().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                pCreateInfo,
                pAllocator,
                pEvent
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCreateEvent].
    public static int vkCreateEvent(
    	VkDevice device,
    	VkEventCreateInfo pCreateInfo,
    	@Nullable VkAllocationCallbacks pAllocator,
    	NativePointerArray pEvent
    ) {
    	return vkCreateEvent(
    		device,
    		pCreateInfo.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment(),
    		pEvent.memorySegment()
    	);
    }
    
    public static void vkDestroyEvent(
        VkDevice device,
    	MemorySegment event,
    	MemorySegment pAllocator
    ) {
        MethodHandle method = device.VK_DESTROY_EVENT().get();
        try {
             method.invokeExact(
                device.memorySegment(),
                event,
                pAllocator
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkDestroyEvent].
    public static void vkDestroyEvent(
    	VkDevice device,
    	@Nullable VkEvent event,
    	@Nullable VkAllocationCallbacks pAllocator
    ) {
    	vkDestroyEvent(
    		device,
    		event == null ? MemorySegment.NULL : event.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment()
    	);
    }
    
    public static int vkGetEventStatus(
        VkDevice device,
    	MemorySegment event
    ) {
        MethodHandle method = device.VK_GET_EVENT_STATUS().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                event
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetEventStatus].
    public static int vkGetEventStatus(
    	VkDevice device,
    	VkEvent event
    ) {
    	return vkGetEventStatus(
    		device,
    		event.memorySegment()
    	);
    }
    
    public static int vkSetEvent(
        VkDevice device,
    	MemorySegment event
    ) {
        MethodHandle method = device.VK_SET_EVENT().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                event
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkSetEvent].
    public static int vkSetEvent(
    	VkDevice device,
    	VkEvent event
    ) {
    	return vkSetEvent(
    		device,
    		event.memorySegment()
    	);
    }
    
    public static int vkResetEvent(
        VkDevice device,
    	MemorySegment event
    ) {
        MethodHandle method = device.VK_RESET_EVENT().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                event
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkResetEvent].
    public static int vkResetEvent(
    	VkDevice device,
    	VkEvent event
    ) {
    	return vkResetEvent(
    		device,
    		event.memorySegment()
    	);
    }
    
    public static int vkCreateBufferView(
        VkDevice device,
    	MemorySegment pCreateInfo,
    	MemorySegment pAllocator,
    	MemorySegment pView
    ) {
        MethodHandle method = device.VK_CREATE_BUFFER_VIEW().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                pCreateInfo,
                pAllocator,
                pView
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCreateBufferView].
    public static int vkCreateBufferView(
    	VkDevice device,
    	VkBufferViewCreateInfo pCreateInfo,
    	@Nullable VkAllocationCallbacks pAllocator,
    	NativePointerArray pView
    ) {
    	return vkCreateBufferView(
    		device,
    		pCreateInfo.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment(),
    		pView.memorySegment()
    	);
    }
    
    public static void vkDestroyBufferView(
        VkDevice device,
    	MemorySegment bufferView,
    	MemorySegment pAllocator
    ) {
        MethodHandle method = device.VK_DESTROY_BUFFER_VIEW().get();
        try {
             method.invokeExact(
                device.memorySegment(),
                bufferView,
                pAllocator
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkDestroyBufferView].
    public static void vkDestroyBufferView(
    	VkDevice device,
    	@Nullable VkBufferView bufferView,
    	@Nullable VkAllocationCallbacks pAllocator
    ) {
    	vkDestroyBufferView(
    		device,
    		bufferView == null ? MemorySegment.NULL : bufferView.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment()
    	);
    }
    
    public static int vkCreateShaderModule(
        VkDevice device,
    	MemorySegment pCreateInfo,
    	MemorySegment pAllocator,
    	MemorySegment pShaderModule
    ) {
        MethodHandle method = device.VK_CREATE_SHADER_MODULE().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                pCreateInfo,
                pAllocator,
                pShaderModule
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCreateShaderModule].
    public static int vkCreateShaderModule(
    	VkDevice device,
    	VkShaderModuleCreateInfo pCreateInfo,
    	@Nullable VkAllocationCallbacks pAllocator,
    	NativePointerArray pShaderModule
    ) {
    	return vkCreateShaderModule(
    		device,
    		pCreateInfo.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment(),
    		pShaderModule.memorySegment()
    	);
    }
    
    public static void vkDestroyShaderModule(
        VkDevice device,
    	MemorySegment shaderModule,
    	MemorySegment pAllocator
    ) {
        MethodHandle method = device.VK_DESTROY_SHADER_MODULE().get();
        try {
             method.invokeExact(
                device.memorySegment(),
                shaderModule,
                pAllocator
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkDestroyShaderModule].
    public static void vkDestroyShaderModule(
    	VkDevice device,
    	@Nullable VkShaderModule shaderModule,
    	@Nullable VkAllocationCallbacks pAllocator
    ) {
    	vkDestroyShaderModule(
    		device,
    		shaderModule == null ? MemorySegment.NULL : shaderModule.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment()
    	);
    }
    
    public static int vkCreatePipelineCache(
        VkDevice device,
    	MemorySegment pCreateInfo,
    	MemorySegment pAllocator,
    	MemorySegment pPipelineCache
    ) {
        MethodHandle method = device.VK_CREATE_PIPELINE_CACHE().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                pCreateInfo,
                pAllocator,
                pPipelineCache
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCreatePipelineCache].
    public static int vkCreatePipelineCache(
    	VkDevice device,
    	VkPipelineCacheCreateInfo pCreateInfo,
    	@Nullable VkAllocationCallbacks pAllocator,
    	NativePointerArray pPipelineCache
    ) {
    	return vkCreatePipelineCache(
    		device,
    		pCreateInfo.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment(),
    		pPipelineCache.memorySegment()
    	);
    }
    
    public static void vkDestroyPipelineCache(
        VkDevice device,
    	MemorySegment pipelineCache,
    	MemorySegment pAllocator
    ) {
        MethodHandle method = device.VK_DESTROY_PIPELINE_CACHE().get();
        try {
             method.invokeExact(
                device.memorySegment(),
                pipelineCache,
                pAllocator
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkDestroyPipelineCache].
    public static void vkDestroyPipelineCache(
    	VkDevice device,
    	@Nullable VkPipelineCache pipelineCache,
    	@Nullable VkAllocationCallbacks pAllocator
    ) {
    	vkDestroyPipelineCache(
    		device,
    		pipelineCache == null ? MemorySegment.NULL : pipelineCache.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment()
    	);
    }
    
    public static int vkGetPipelineCacheData(
        VkDevice device,
    	MemorySegment pipelineCache,
    	MemorySegment pDataSize,
    	MemorySegment pData
    ) {
        MethodHandle method = device.VK_GET_PIPELINE_CACHE_DATA().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                pipelineCache,
                pDataSize,
                pData
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetPipelineCacheData].
    public static int vkGetPipelineCacheData(
    	VkDevice device,
    	VkPipelineCache pipelineCache,
    	NativeLongArray pDataSize,
    	@Nullable MemorySegment pData
    ) {
    	return vkGetPipelineCacheData(
    		device,
    		pipelineCache.memorySegment(),
    		pDataSize.memorySegment(),
    		pData
    	);
    }
    
    public static int vkMergePipelineCaches(
        VkDevice device,
    	MemorySegment dstCache,
    	int srcCacheCount,
    	MemorySegment pSrcCaches
    ) {
        MethodHandle method = device.VK_MERGE_PIPELINE_CACHES().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                dstCache,
                srcCacheCount,
                pSrcCaches
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkMergePipelineCaches].
    public static int vkMergePipelineCaches(
    	VkDevice device,
    	VkPipelineCache dstCache,
    	int srcCacheCount,
    	NativePointerArray pSrcCaches
    ) {
    	return vkMergePipelineCaches(
    		device,
    		dstCache.memorySegment(),
    		srcCacheCount,
    		pSrcCaches.memorySegment()
    	);
    }
    
    public static int vkCreateComputePipelines(
        VkDevice device,
    	MemorySegment pipelineCache,
    	int createInfoCount,
    	MemorySegment pCreateInfos,
    	MemorySegment pAllocator,
    	MemorySegment pPipelines
    ) {
        MethodHandle method = device.VK_CREATE_COMPUTE_PIPELINES().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                pipelineCache,
                createInfoCount,
                pCreateInfos,
                pAllocator,
                pPipelines
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCreateComputePipelines].
    public static int vkCreateComputePipelines(
    	VkDevice device,
    	VkPipelineCache pipelineCache,
    	int createInfoCount,
    	NativeStructArray<VkComputePipelineCreateInfo> pCreateInfos,
    	@Nullable VkAllocationCallbacks pAllocator,
    	NativePointerArray pPipelines
    ) {
    	return vkCreateComputePipelines(
    		device,
    		pipelineCache.memorySegment(),
    		createInfoCount,
    		pCreateInfos.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment(),
    		pPipelines.memorySegment()
    	);
    }
    
    public static void vkDestroyPipeline(
        VkDevice device,
    	MemorySegment pipeline,
    	MemorySegment pAllocator
    ) {
        MethodHandle method = device.VK_DESTROY_PIPELINE().get();
        try {
             method.invokeExact(
                device.memorySegment(),
                pipeline,
                pAllocator
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkDestroyPipeline].
    public static void vkDestroyPipeline(
    	VkDevice device,
    	@Nullable VkPipeline pipeline,
    	@Nullable VkAllocationCallbacks pAllocator
    ) {
    	vkDestroyPipeline(
    		device,
    		pipeline == null ? MemorySegment.NULL : pipeline.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment()
    	);
    }
    
    public static int vkCreatePipelineLayout(
        VkDevice device,
    	MemorySegment pCreateInfo,
    	MemorySegment pAllocator,
    	MemorySegment pPipelineLayout
    ) {
        MethodHandle method = device.VK_CREATE_PIPELINE_LAYOUT().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                pCreateInfo,
                pAllocator,
                pPipelineLayout
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCreatePipelineLayout].
    public static int vkCreatePipelineLayout(
    	VkDevice device,
    	VkPipelineLayoutCreateInfo pCreateInfo,
    	@Nullable VkAllocationCallbacks pAllocator,
    	NativePointerArray pPipelineLayout
    ) {
    	return vkCreatePipelineLayout(
    		device,
    		pCreateInfo.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment(),
    		pPipelineLayout.memorySegment()
    	);
    }
    
    public static void vkDestroyPipelineLayout(
        VkDevice device,
    	MemorySegment pipelineLayout,
    	MemorySegment pAllocator
    ) {
        MethodHandle method = device.VK_DESTROY_PIPELINE_LAYOUT().get();
        try {
             method.invokeExact(
                device.memorySegment(),
                pipelineLayout,
                pAllocator
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkDestroyPipelineLayout].
    public static void vkDestroyPipelineLayout(
    	VkDevice device,
    	@Nullable VkPipelineLayout pipelineLayout,
    	@Nullable VkAllocationCallbacks pAllocator
    ) {
    	vkDestroyPipelineLayout(
    		device,
    		pipelineLayout == null ? MemorySegment.NULL : pipelineLayout.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment()
    	);
    }
    
    public static int vkCreateSampler(
        VkDevice device,
    	MemorySegment pCreateInfo,
    	MemorySegment pAllocator,
    	MemorySegment pSampler
    ) {
        MethodHandle method = device.VK_CREATE_SAMPLER().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                pCreateInfo,
                pAllocator,
                pSampler
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCreateSampler].
    public static int vkCreateSampler(
    	VkDevice device,
    	VkSamplerCreateInfo pCreateInfo,
    	@Nullable VkAllocationCallbacks pAllocator,
    	NativePointerArray pSampler
    ) {
    	return vkCreateSampler(
    		device,
    		pCreateInfo.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment(),
    		pSampler.memorySegment()
    	);
    }
    
    public static void vkDestroySampler(
        VkDevice device,
    	MemorySegment sampler,
    	MemorySegment pAllocator
    ) {
        MethodHandle method = device.VK_DESTROY_SAMPLER().get();
        try {
             method.invokeExact(
                device.memorySegment(),
                sampler,
                pAllocator
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkDestroySampler].
    public static void vkDestroySampler(
    	VkDevice device,
    	@Nullable VkSampler sampler,
    	@Nullable VkAllocationCallbacks pAllocator
    ) {
    	vkDestroySampler(
    		device,
    		sampler == null ? MemorySegment.NULL : sampler.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment()
    	);
    }
    
    public static int vkCreateDescriptorSetLayout(
        VkDevice device,
    	MemorySegment pCreateInfo,
    	MemorySegment pAllocator,
    	MemorySegment pSetLayout
    ) {
        MethodHandle method = device.VK_CREATE_DESCRIPTOR_SET_LAYOUT().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                pCreateInfo,
                pAllocator,
                pSetLayout
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCreateDescriptorSetLayout].
    public static int vkCreateDescriptorSetLayout(
    	VkDevice device,
    	VkDescriptorSetLayoutCreateInfo pCreateInfo,
    	@Nullable VkAllocationCallbacks pAllocator,
    	NativePointerArray pSetLayout
    ) {
    	return vkCreateDescriptorSetLayout(
    		device,
    		pCreateInfo.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment(),
    		pSetLayout.memorySegment()
    	);
    }
    
    public static void vkDestroyDescriptorSetLayout(
        VkDevice device,
    	MemorySegment descriptorSetLayout,
    	MemorySegment pAllocator
    ) {
        MethodHandle method = device.VK_DESTROY_DESCRIPTOR_SET_LAYOUT().get();
        try {
             method.invokeExact(
                device.memorySegment(),
                descriptorSetLayout,
                pAllocator
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkDestroyDescriptorSetLayout].
    public static void vkDestroyDescriptorSetLayout(
    	VkDevice device,
    	@Nullable VkDescriptorSetLayout descriptorSetLayout,
    	@Nullable VkAllocationCallbacks pAllocator
    ) {
    	vkDestroyDescriptorSetLayout(
    		device,
    		descriptorSetLayout == null ? MemorySegment.NULL : descriptorSetLayout.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment()
    	);
    }
    
    public static int vkCreateDescriptorPool(
        VkDevice device,
    	MemorySegment pCreateInfo,
    	MemorySegment pAllocator,
    	MemorySegment pDescriptorPool
    ) {
        MethodHandle method = device.VK_CREATE_DESCRIPTOR_POOL().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                pCreateInfo,
                pAllocator,
                pDescriptorPool
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCreateDescriptorPool].
    public static int vkCreateDescriptorPool(
    	VkDevice device,
    	VkDescriptorPoolCreateInfo pCreateInfo,
    	@Nullable VkAllocationCallbacks pAllocator,
    	NativePointerArray pDescriptorPool
    ) {
    	return vkCreateDescriptorPool(
    		device,
    		pCreateInfo.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment(),
    		pDescriptorPool.memorySegment()
    	);
    }
    
    public static void vkDestroyDescriptorPool(
        VkDevice device,
    	MemorySegment descriptorPool,
    	MemorySegment pAllocator
    ) {
        MethodHandle method = device.VK_DESTROY_DESCRIPTOR_POOL().get();
        try {
             method.invokeExact(
                device.memorySegment(),
                descriptorPool,
                pAllocator
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkDestroyDescriptorPool].
    public static void vkDestroyDescriptorPool(
    	VkDevice device,
    	@Nullable VkDescriptorPool descriptorPool,
    	@Nullable VkAllocationCallbacks pAllocator
    ) {
    	vkDestroyDescriptorPool(
    		device,
    		descriptorPool == null ? MemorySegment.NULL : descriptorPool.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment()
    	);
    }
    
    public static int vkResetDescriptorPool(
        VkDevice device,
    	MemorySegment descriptorPool,
    	int flags
    ) {
        MethodHandle method = device.VK_RESET_DESCRIPTOR_POOL().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                descriptorPool,
                flags
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkResetDescriptorPool].
    public static int vkResetDescriptorPool(
    	VkDevice device,
    	VkDescriptorPool descriptorPool,
    	int flags
    ) {
    	return vkResetDescriptorPool(
    		device,
    		descriptorPool.memorySegment(),
    		flags
    	);
    }
    
    public static int vkAllocateDescriptorSets(
        VkDevice device,
    	MemorySegment pAllocateInfo,
    	MemorySegment pDescriptorSets
    ) {
        MethodHandle method = device.VK_ALLOCATE_DESCRIPTOR_SETS().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                pAllocateInfo,
                pDescriptorSets
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkAllocateDescriptorSets].
    public static int vkAllocateDescriptorSets(
    	VkDevice device,
    	VkDescriptorSetAllocateInfo pAllocateInfo,
    	NativePointerArray pDescriptorSets
    ) {
    	return vkAllocateDescriptorSets(
    		device,
    		pAllocateInfo.memorySegment(),
    		pDescriptorSets.memorySegment()
    	);
    }
    
    public static int vkFreeDescriptorSets(
        VkDevice device,
    	MemorySegment descriptorPool,
    	int descriptorSetCount,
    	MemorySegment pDescriptorSets
    ) {
        MethodHandle method = device.VK_FREE_DESCRIPTOR_SETS().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                descriptorPool,
                descriptorSetCount,
                pDescriptorSets
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkFreeDescriptorSets].
    public static int vkFreeDescriptorSets(
    	VkDevice device,
    	VkDescriptorPool descriptorPool,
    	int descriptorSetCount,
    	NativePointerArray pDescriptorSets
    ) {
    	return vkFreeDescriptorSets(
    		device,
    		descriptorPool.memorySegment(),
    		descriptorSetCount,
    		pDescriptorSets.memorySegment()
    	);
    }
    
    public static void vkUpdateDescriptorSets(
        VkDevice device,
    	int descriptorWriteCount,
    	MemorySegment pDescriptorWrites,
    	int descriptorCopyCount,
    	MemorySegment pDescriptorCopies
    ) {
        MethodHandle method = device.VK_UPDATE_DESCRIPTOR_SETS().get();
        try {
             method.invokeExact(
                device.memorySegment(),
                descriptorWriteCount,
                pDescriptorWrites,
                descriptorCopyCount,
                pDescriptorCopies
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkUpdateDescriptorSets].
    public static void vkUpdateDescriptorSets(
    	VkDevice device,
    	int descriptorWriteCount,
    	@Nullable NativeStructArray<VkWriteDescriptorSet> pDescriptorWrites,
    	int descriptorCopyCount,
    	@Nullable NativeStructArray<VkCopyDescriptorSet> pDescriptorCopies
    ) {
    	vkUpdateDescriptorSets(
    		device,
    		descriptorWriteCount,
    		pDescriptorWrites == null ? MemorySegment.NULL : pDescriptorWrites.memorySegment(),
    		descriptorCopyCount,
    		pDescriptorCopies == null ? MemorySegment.NULL : pDescriptorCopies.memorySegment()
    	);
    }
    
    public static void vkCmdBindPipeline(
        VkCommandBuffer commandBuffer,
    	int pipelineBindPoint,
    	MemorySegment pipeline
    ) {
        MethodHandle method = commandBuffer.VK_CMD_BIND_PIPELINE().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                pipelineBindPoint,
                pipeline
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdBindPipeline].
    public static void vkCmdBindPipeline(
    	VkCommandBuffer commandBuffer,
    	int pipelineBindPoint,
    	VkPipeline pipeline
    ) {
    	vkCmdBindPipeline(
    		commandBuffer,
    		pipelineBindPoint,
    		pipeline.memorySegment()
    	);
    }
    
    public static void vkCmdBindDescriptorSets(
        VkCommandBuffer commandBuffer,
    	int pipelineBindPoint,
    	MemorySegment layout,
    	int firstSet,
    	int descriptorSetCount,
    	MemorySegment pDescriptorSets,
    	int dynamicOffsetCount,
    	MemorySegment pDynamicOffsets
    ) {
        MethodHandle method = commandBuffer.VK_CMD_BIND_DESCRIPTOR_SETS().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                pipelineBindPoint,
                layout,
                firstSet,
                descriptorSetCount,
                pDescriptorSets,
                dynamicOffsetCount,
                pDynamicOffsets
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdBindDescriptorSets].
    public static void vkCmdBindDescriptorSets(
    	VkCommandBuffer commandBuffer,
    	int pipelineBindPoint,
    	VkPipelineLayout layout,
    	int firstSet,
    	int descriptorSetCount,
    	NativePointerArray pDescriptorSets,
    	int dynamicOffsetCount,
    	@Nullable NativeIntArray pDynamicOffsets
    ) {
    	vkCmdBindDescriptorSets(
    		commandBuffer,
    		pipelineBindPoint,
    		layout.memorySegment(),
    		firstSet,
    		descriptorSetCount,
    		pDescriptorSets.memorySegment(),
    		dynamicOffsetCount,
    		pDynamicOffsets == null ? MemorySegment.NULL : pDynamicOffsets.memorySegment()
    	);
    }
    
    public static void vkCmdClearColorImage(
        VkCommandBuffer commandBuffer,
    	MemorySegment image,
    	int imageLayout,
    	MemorySegment pColor,
    	int rangeCount,
    	MemorySegment pRanges
    ) {
        MethodHandle method = commandBuffer.VK_CMD_CLEAR_COLOR_IMAGE().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                image,
                imageLayout,
                pColor,
                rangeCount,
                pRanges
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdClearColorImage].
    public static void vkCmdClearColorImage(
    	VkCommandBuffer commandBuffer,
    	VkImage image,
    	int imageLayout,
    	VkClearColorValue pColor,
    	int rangeCount,
    	NativeStructArray<VkImageSubresourceRange> pRanges
    ) {
    	vkCmdClearColorImage(
    		commandBuffer,
    		image.memorySegment(),
    		imageLayout,
    		pColor.memorySegment(),
    		rangeCount,
    		pRanges.memorySegment()
    	);
    }
    
    public static void vkCmdDispatch(
        VkCommandBuffer commandBuffer,
    	int groupCountX,
    	int groupCountY,
    	int groupCountZ
    ) {
        MethodHandle method = commandBuffer.VK_CMD_DISPATCH().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                groupCountX,
                groupCountY,
                groupCountZ
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    
    public static void vkCmdDispatchIndirect(
        VkCommandBuffer commandBuffer,
    	MemorySegment buffer,
    	long offset
    ) {
        MethodHandle method = commandBuffer.VK_CMD_DISPATCH_INDIRECT().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                buffer,
                offset
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdDispatchIndirect].
    public static void vkCmdDispatchIndirect(
    	VkCommandBuffer commandBuffer,
    	VkBuffer buffer,
    	long offset
    ) {
    	vkCmdDispatchIndirect(
    		commandBuffer,
    		buffer.memorySegment(),
    		offset
    	);
    }
    
    public static void vkCmdSetEvent(
        VkCommandBuffer commandBuffer,
    	MemorySegment event,
    	int stageMask
    ) {
        MethodHandle method = commandBuffer.VK_CMD_SET_EVENT().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                event,
                stageMask
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdSetEvent].
    public static void vkCmdSetEvent(
    	VkCommandBuffer commandBuffer,
    	VkEvent event,
    	int stageMask
    ) {
    	vkCmdSetEvent(
    		commandBuffer,
    		event.memorySegment(),
    		stageMask
    	);
    }
    
    public static void vkCmdResetEvent(
        VkCommandBuffer commandBuffer,
    	MemorySegment event,
    	int stageMask
    ) {
        MethodHandle method = commandBuffer.VK_CMD_RESET_EVENT().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                event,
                stageMask
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdResetEvent].
    public static void vkCmdResetEvent(
    	VkCommandBuffer commandBuffer,
    	VkEvent event,
    	int stageMask
    ) {
    	vkCmdResetEvent(
    		commandBuffer,
    		event.memorySegment(),
    		stageMask
    	);
    }
    
    public static void vkCmdWaitEvents(
        VkCommandBuffer commandBuffer,
    	int eventCount,
    	MemorySegment pEvents,
    	int srcStageMask,
    	int dstStageMask,
    	int memoryBarrierCount,
    	MemorySegment pMemoryBarriers,
    	int bufferMemoryBarrierCount,
    	MemorySegment pBufferMemoryBarriers,
    	int imageMemoryBarrierCount,
    	MemorySegment pImageMemoryBarriers
    ) {
        MethodHandle method = commandBuffer.VK_CMD_WAIT_EVENTS().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                eventCount,
                pEvents,
                srcStageMask,
                dstStageMask,
                memoryBarrierCount,
                pMemoryBarriers,
                bufferMemoryBarrierCount,
                pBufferMemoryBarriers,
                imageMemoryBarrierCount,
                pImageMemoryBarriers
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdWaitEvents].
    public static void vkCmdWaitEvents(
    	VkCommandBuffer commandBuffer,
    	int eventCount,
    	NativePointerArray pEvents,
    	int srcStageMask,
    	int dstStageMask,
    	int memoryBarrierCount,
    	@Nullable NativeStructArray<VkMemoryBarrier> pMemoryBarriers,
    	int bufferMemoryBarrierCount,
    	@Nullable NativeStructArray<VkBufferMemoryBarrier> pBufferMemoryBarriers,
    	int imageMemoryBarrierCount,
    	@Nullable NativeStructArray<VkImageMemoryBarrier> pImageMemoryBarriers
    ) {
    	vkCmdWaitEvents(
    		commandBuffer,
    		eventCount,
    		pEvents.memorySegment(),
    		srcStageMask,
    		dstStageMask,
    		memoryBarrierCount,
    		pMemoryBarriers == null ? MemorySegment.NULL : pMemoryBarriers.memorySegment(),
    		bufferMemoryBarrierCount,
    		pBufferMemoryBarriers == null ? MemorySegment.NULL : pBufferMemoryBarriers.memorySegment(),
    		imageMemoryBarrierCount,
    		pImageMemoryBarriers == null ? MemorySegment.NULL : pImageMemoryBarriers.memorySegment()
    	);
    }
    
    public static void vkCmdPushConstants(
        VkCommandBuffer commandBuffer,
    	MemorySegment layout,
    	int stageFlags,
    	int offset,
    	int size,
    	MemorySegment pValues
    ) {
        MethodHandle method = commandBuffer.VK_CMD_PUSH_CONSTANTS().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                layout,
                stageFlags,
                offset,
                size,
                pValues
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdPushConstants].
    public static void vkCmdPushConstants(
    	VkCommandBuffer commandBuffer,
    	VkPipelineLayout layout,
    	int stageFlags,
    	int offset,
    	int size,
    	MemorySegment pValues
    ) {
    	vkCmdPushConstants(
    		commandBuffer,
    		layout.memorySegment(),
    		stageFlags,
    		offset,
    		size,
    		pValues
    	);
    }
    
    public static int vkCreateGraphicsPipelines(
        VkDevice device,
    	MemorySegment pipelineCache,
    	int createInfoCount,
    	MemorySegment pCreateInfos,
    	MemorySegment pAllocator,
    	MemorySegment pPipelines
    ) {
        MethodHandle method = device.VK_CREATE_GRAPHICS_PIPELINES().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                pipelineCache,
                createInfoCount,
                pCreateInfos,
                pAllocator,
                pPipelines
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCreateGraphicsPipelines].
    public static int vkCreateGraphicsPipelines(
    	VkDevice device,
    	VkPipelineCache pipelineCache,
    	int createInfoCount,
    	NativeStructArray<VkGraphicsPipelineCreateInfo> pCreateInfos,
    	@Nullable VkAllocationCallbacks pAllocator,
    	NativePointerArray pPipelines
    ) {
    	return vkCreateGraphicsPipelines(
    		device,
    		pipelineCache.memorySegment(),
    		createInfoCount,
    		pCreateInfos.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment(),
    		pPipelines.memorySegment()
    	);
    }
    
    public static int vkCreateFramebuffer(
        VkDevice device,
    	MemorySegment pCreateInfo,
    	MemorySegment pAllocator,
    	MemorySegment pFramebuffer
    ) {
        MethodHandle method = device.VK_CREATE_FRAMEBUFFER().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                pCreateInfo,
                pAllocator,
                pFramebuffer
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCreateFramebuffer].
    public static int vkCreateFramebuffer(
    	VkDevice device,
    	VkFramebufferCreateInfo pCreateInfo,
    	@Nullable VkAllocationCallbacks pAllocator,
    	NativePointerArray pFramebuffer
    ) {
    	return vkCreateFramebuffer(
    		device,
    		pCreateInfo.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment(),
    		pFramebuffer.memorySegment()
    	);
    }
    
    public static void vkDestroyFramebuffer(
        VkDevice device,
    	MemorySegment framebuffer,
    	MemorySegment pAllocator
    ) {
        MethodHandle method = device.VK_DESTROY_FRAMEBUFFER().get();
        try {
             method.invokeExact(
                device.memorySegment(),
                framebuffer,
                pAllocator
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkDestroyFramebuffer].
    public static void vkDestroyFramebuffer(
    	VkDevice device,
    	@Nullable VkFramebuffer framebuffer,
    	@Nullable VkAllocationCallbacks pAllocator
    ) {
    	vkDestroyFramebuffer(
    		device,
    		framebuffer == null ? MemorySegment.NULL : framebuffer.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment()
    	);
    }
    
    public static int vkCreateRenderPass(
        VkDevice device,
    	MemorySegment pCreateInfo,
    	MemorySegment pAllocator,
    	MemorySegment pRenderPass
    ) {
        MethodHandle method = device.VK_CREATE_RENDER_PASS().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                pCreateInfo,
                pAllocator,
                pRenderPass
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCreateRenderPass].
    public static int vkCreateRenderPass(
    	VkDevice device,
    	VkRenderPassCreateInfo pCreateInfo,
    	@Nullable VkAllocationCallbacks pAllocator,
    	NativePointerArray pRenderPass
    ) {
    	return vkCreateRenderPass(
    		device,
    		pCreateInfo.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment(),
    		pRenderPass.memorySegment()
    	);
    }
    
    public static void vkDestroyRenderPass(
        VkDevice device,
    	MemorySegment renderPass,
    	MemorySegment pAllocator
    ) {
        MethodHandle method = device.VK_DESTROY_RENDER_PASS().get();
        try {
             method.invokeExact(
                device.memorySegment(),
                renderPass,
                pAllocator
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkDestroyRenderPass].
    public static void vkDestroyRenderPass(
    	VkDevice device,
    	@Nullable VkRenderPass renderPass,
    	@Nullable VkAllocationCallbacks pAllocator
    ) {
    	vkDestroyRenderPass(
    		device,
    		renderPass == null ? MemorySegment.NULL : renderPass.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment()
    	);
    }
    
    public static void vkGetRenderAreaGranularity(
        VkDevice device,
    	MemorySegment renderPass,
    	MemorySegment pGranularity
    ) {
        MethodHandle method = device.VK_GET_RENDER_AREA_GRANULARITY().get();
        try {
             method.invokeExact(
                device.memorySegment(),
                renderPass,
                pGranularity
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetRenderAreaGranularity].
    public static void vkGetRenderAreaGranularity(
    	VkDevice device,
    	VkRenderPass renderPass,
    	VkExtent2D pGranularity
    ) {
    	vkGetRenderAreaGranularity(
    		device,
    		renderPass.memorySegment(),
    		pGranularity.memorySegment()
    	);
    }
    
    public static void vkCmdSetViewport(
        VkCommandBuffer commandBuffer,
    	int firstViewport,
    	int viewportCount,
    	MemorySegment pViewports
    ) {
        MethodHandle method = commandBuffer.VK_CMD_SET_VIEWPORT().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                firstViewport,
                viewportCount,
                pViewports
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdSetViewport].
    public static void vkCmdSetViewport(
    	VkCommandBuffer commandBuffer,
    	int firstViewport,
    	int viewportCount,
    	NativeStructArray<VkViewport> pViewports
    ) {
    	vkCmdSetViewport(
    		commandBuffer,
    		firstViewport,
    		viewportCount,
    		pViewports.memorySegment()
    	);
    }
    
    public static void vkCmdSetScissor(
        VkCommandBuffer commandBuffer,
    	int firstScissor,
    	int scissorCount,
    	MemorySegment pScissors
    ) {
        MethodHandle method = commandBuffer.VK_CMD_SET_SCISSOR().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                firstScissor,
                scissorCount,
                pScissors
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdSetScissor].
    public static void vkCmdSetScissor(
    	VkCommandBuffer commandBuffer,
    	int firstScissor,
    	int scissorCount,
    	NativeStructArray<VkRect2D> pScissors
    ) {
    	vkCmdSetScissor(
    		commandBuffer,
    		firstScissor,
    		scissorCount,
    		pScissors.memorySegment()
    	);
    }
    
    public static void vkCmdSetLineWidth(
        VkCommandBuffer commandBuffer,
    	float lineWidth
    ) {
        MethodHandle method = commandBuffer.VK_CMD_SET_LINE_WIDTH().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                lineWidth
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    
    public static void vkCmdSetDepthBias(
        VkCommandBuffer commandBuffer,
    	float depthBiasConstantFactor,
    	float depthBiasClamp,
    	float depthBiasSlopeFactor
    ) {
        MethodHandle method = commandBuffer.VK_CMD_SET_DEPTH_BIAS().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                depthBiasConstantFactor,
                depthBiasClamp,
                depthBiasSlopeFactor
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    
    public static void vkCmdSetBlendConstants(
        VkCommandBuffer commandBuffer,
    	MemorySegment blendConstants
    ) {
        MethodHandle method = commandBuffer.VK_CMD_SET_BLEND_CONSTANTS().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                blendConstants
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    
    public static void vkCmdSetDepthBounds(
        VkCommandBuffer commandBuffer,
    	float minDepthBounds,
    	float maxDepthBounds
    ) {
        MethodHandle method = commandBuffer.VK_CMD_SET_DEPTH_BOUNDS().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                minDepthBounds,
                maxDepthBounds
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    
    public static void vkCmdSetStencilCompareMask(
        VkCommandBuffer commandBuffer,
    	int faceMask,
    	int compareMask
    ) {
        MethodHandle method = commandBuffer.VK_CMD_SET_STENCIL_COMPARE_MASK().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                faceMask,
                compareMask
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    
    public static void vkCmdSetStencilWriteMask(
        VkCommandBuffer commandBuffer,
    	int faceMask,
    	int writeMask
    ) {
        MethodHandle method = commandBuffer.VK_CMD_SET_STENCIL_WRITE_MASK().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                faceMask,
                writeMask
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    
    public static void vkCmdSetStencilReference(
        VkCommandBuffer commandBuffer,
    	int faceMask,
    	int reference
    ) {
        MethodHandle method = commandBuffer.VK_CMD_SET_STENCIL_REFERENCE().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                faceMask,
                reference
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    
    public static void vkCmdBindIndexBuffer(
        VkCommandBuffer commandBuffer,
    	MemorySegment buffer,
    	long offset,
    	int indexType
    ) {
        MethodHandle method = commandBuffer.VK_CMD_BIND_INDEX_BUFFER().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                buffer,
                offset,
                indexType
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdBindIndexBuffer].
    public static void vkCmdBindIndexBuffer(
    	VkCommandBuffer commandBuffer,
    	@Nullable VkBuffer buffer,
    	long offset,
    	int indexType
    ) {
    	vkCmdBindIndexBuffer(
    		commandBuffer,
    		buffer == null ? MemorySegment.NULL : buffer.memorySegment(),
    		offset,
    		indexType
    	);
    }
    
    public static void vkCmdBindVertexBuffers(
        VkCommandBuffer commandBuffer,
    	int firstBinding,
    	int bindingCount,
    	MemorySegment pBuffers,
    	MemorySegment pOffsets
    ) {
        MethodHandle method = commandBuffer.VK_CMD_BIND_VERTEX_BUFFERS().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                firstBinding,
                bindingCount,
                pBuffers,
                pOffsets
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdBindVertexBuffers].
    public static void vkCmdBindVertexBuffers(
    	VkCommandBuffer commandBuffer,
    	int firstBinding,
    	int bindingCount,
    	NativePointerArray pBuffers,
    	NativeLongArray pOffsets
    ) {
    	vkCmdBindVertexBuffers(
    		commandBuffer,
    		firstBinding,
    		bindingCount,
    		pBuffers.memorySegment(),
    		pOffsets.memorySegment()
    	);
    }
    
    public static void vkCmdDraw(
        VkCommandBuffer commandBuffer,
    	int vertexCount,
    	int instanceCount,
    	int firstVertex,
    	int firstInstance
    ) {
        MethodHandle method = commandBuffer.VK_CMD_DRAW().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                vertexCount,
                instanceCount,
                firstVertex,
                firstInstance
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    
    public static void vkCmdDrawIndexed(
        VkCommandBuffer commandBuffer,
    	int indexCount,
    	int instanceCount,
    	int firstIndex,
    	int vertexOffset,
    	int firstInstance
    ) {
        MethodHandle method = commandBuffer.VK_CMD_DRAW_INDEXED().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                indexCount,
                instanceCount,
                firstIndex,
                vertexOffset,
                firstInstance
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    
    public static void vkCmdDrawIndirect(
        VkCommandBuffer commandBuffer,
    	MemorySegment buffer,
    	long offset,
    	int drawCount,
    	int stride
    ) {
        MethodHandle method = commandBuffer.VK_CMD_DRAW_INDIRECT().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                buffer,
                offset,
                drawCount,
                stride
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdDrawIndirect].
    public static void vkCmdDrawIndirect(
    	VkCommandBuffer commandBuffer,
    	VkBuffer buffer,
    	long offset,
    	int drawCount,
    	int stride
    ) {
    	vkCmdDrawIndirect(
    		commandBuffer,
    		buffer.memorySegment(),
    		offset,
    		drawCount,
    		stride
    	);
    }
    
    public static void vkCmdDrawIndexedIndirect(
        VkCommandBuffer commandBuffer,
    	MemorySegment buffer,
    	long offset,
    	int drawCount,
    	int stride
    ) {
        MethodHandle method = commandBuffer.VK_CMD_DRAW_INDEXED_INDIRECT().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                buffer,
                offset,
                drawCount,
                stride
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdDrawIndexedIndirect].
    public static void vkCmdDrawIndexedIndirect(
    	VkCommandBuffer commandBuffer,
    	VkBuffer buffer,
    	long offset,
    	int drawCount,
    	int stride
    ) {
    	vkCmdDrawIndexedIndirect(
    		commandBuffer,
    		buffer.memorySegment(),
    		offset,
    		drawCount,
    		stride
    	);
    }
    
    public static void vkCmdBlitImage(
        VkCommandBuffer commandBuffer,
    	MemorySegment srcImage,
    	int srcImageLayout,
    	MemorySegment dstImage,
    	int dstImageLayout,
    	int regionCount,
    	MemorySegment pRegions,
    	int filter
    ) {
        MethodHandle method = commandBuffer.VK_CMD_BLIT_IMAGE().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                srcImage,
                srcImageLayout,
                dstImage,
                dstImageLayout,
                regionCount,
                pRegions,
                filter
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdBlitImage].
    public static void vkCmdBlitImage(
    	VkCommandBuffer commandBuffer,
    	VkImage srcImage,
    	int srcImageLayout,
    	VkImage dstImage,
    	int dstImageLayout,
    	int regionCount,
    	NativeStructArray<VkImageBlit> pRegions,
    	int filter
    ) {
    	vkCmdBlitImage(
    		commandBuffer,
    		srcImage.memorySegment(),
    		srcImageLayout,
    		dstImage.memorySegment(),
    		dstImageLayout,
    		regionCount,
    		pRegions.memorySegment(),
    		filter
    	);
    }
    
    public static void vkCmdClearDepthStencilImage(
        VkCommandBuffer commandBuffer,
    	MemorySegment image,
    	int imageLayout,
    	MemorySegment pDepthStencil,
    	int rangeCount,
    	MemorySegment pRanges
    ) {
        MethodHandle method = commandBuffer.VK_CMD_CLEAR_DEPTH_STENCIL_IMAGE().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                image,
                imageLayout,
                pDepthStencil,
                rangeCount,
                pRanges
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdClearDepthStencilImage].
    public static void vkCmdClearDepthStencilImage(
    	VkCommandBuffer commandBuffer,
    	VkImage image,
    	int imageLayout,
    	VkClearDepthStencilValue pDepthStencil,
    	int rangeCount,
    	NativeStructArray<VkImageSubresourceRange> pRanges
    ) {
    	vkCmdClearDepthStencilImage(
    		commandBuffer,
    		image.memorySegment(),
    		imageLayout,
    		pDepthStencil.memorySegment(),
    		rangeCount,
    		pRanges.memorySegment()
    	);
    }
    
    public static void vkCmdClearAttachments(
        VkCommandBuffer commandBuffer,
    	int attachmentCount,
    	MemorySegment pAttachments,
    	int rectCount,
    	MemorySegment pRects
    ) {
        MethodHandle method = commandBuffer.VK_CMD_CLEAR_ATTACHMENTS().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                attachmentCount,
                pAttachments,
                rectCount,
                pRects
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdClearAttachments].
    public static void vkCmdClearAttachments(
    	VkCommandBuffer commandBuffer,
    	int attachmentCount,
    	NativeStructArray<VkClearAttachment> pAttachments,
    	int rectCount,
    	NativeStructArray<VkClearRect> pRects
    ) {
    	vkCmdClearAttachments(
    		commandBuffer,
    		attachmentCount,
    		pAttachments.memorySegment(),
    		rectCount,
    		pRects.memorySegment()
    	);
    }
    
    public static void vkCmdResolveImage(
        VkCommandBuffer commandBuffer,
    	MemorySegment srcImage,
    	int srcImageLayout,
    	MemorySegment dstImage,
    	int dstImageLayout,
    	int regionCount,
    	MemorySegment pRegions
    ) {
        MethodHandle method = commandBuffer.VK_CMD_RESOLVE_IMAGE().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                srcImage,
                srcImageLayout,
                dstImage,
                dstImageLayout,
                regionCount,
                pRegions
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdResolveImage].
    public static void vkCmdResolveImage(
    	VkCommandBuffer commandBuffer,
    	VkImage srcImage,
    	int srcImageLayout,
    	VkImage dstImage,
    	int dstImageLayout,
    	int regionCount,
    	NativeStructArray<VkImageResolve> pRegions
    ) {
    	vkCmdResolveImage(
    		commandBuffer,
    		srcImage.memorySegment(),
    		srcImageLayout,
    		dstImage.memorySegment(),
    		dstImageLayout,
    		regionCount,
    		pRegions.memorySegment()
    	);
    }
    
    public static void vkCmdBeginRenderPass(
        VkCommandBuffer commandBuffer,
    	MemorySegment pRenderPassBegin,
    	int contents
    ) {
        MethodHandle method = commandBuffer.VK_CMD_BEGIN_RENDER_PASS().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                pRenderPassBegin,
                contents
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdBeginRenderPass].
    public static void vkCmdBeginRenderPass(
    	VkCommandBuffer commandBuffer,
    	VkRenderPassBeginInfo pRenderPassBegin,
    	int contents
    ) {
    	vkCmdBeginRenderPass(
    		commandBuffer,
    		pRenderPassBegin.memorySegment(),
    		contents
    	);
    }
    
    public static void vkCmdNextSubpass(
        VkCommandBuffer commandBuffer,
    	int contents
    ) {
        MethodHandle method = commandBuffer.VK_CMD_NEXT_SUBPASS().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                contents
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    
    public static void vkCmdEndRenderPass(
        VkCommandBuffer commandBuffer
    ) {
        MethodHandle method = commandBuffer.VK_CMD_END_RENDER_PASS().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    
    public static int vkBindBufferMemory2(
        VkDevice device,
    	int bindInfoCount,
    	MemorySegment pBindInfos
    ) {
        MethodHandle method = device.VK_BIND_BUFFER_MEMORY2().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                bindInfoCount,
                pBindInfos
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkBindBufferMemory2].
    public static int vkBindBufferMemory2(
    	VkDevice device,
    	int bindInfoCount,
    	NativeStructArray<VkBindBufferMemoryInfo> pBindInfos
    ) {
    	return vkBindBufferMemory2(
    		device,
    		bindInfoCount,
    		pBindInfos.memorySegment()
    	);
    }
    
    public static int vkBindImageMemory2(
        VkDevice device,
    	int bindInfoCount,
    	MemorySegment pBindInfos
    ) {
        MethodHandle method = device.VK_BIND_IMAGE_MEMORY2().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                bindInfoCount,
                pBindInfos
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkBindImageMemory2].
    public static int vkBindImageMemory2(
    	VkDevice device,
    	int bindInfoCount,
    	NativeStructArray<VkBindImageMemoryInfo> pBindInfos
    ) {
    	return vkBindImageMemory2(
    		device,
    		bindInfoCount,
    		pBindInfos.memorySegment()
    	);
    }
    
    public static void vkGetDeviceGroupPeerMemoryFeatures(
        VkDevice device,
    	int heapIndex,
    	int localDeviceIndex,
    	int remoteDeviceIndex,
    	MemorySegment pPeerMemoryFeatures
    ) {
        MethodHandle method = device.VK_GET_DEVICE_GROUP_PEER_MEMORY_FEATURES().get();
        try {
             method.invokeExact(
                device.memorySegment(),
                heapIndex,
                localDeviceIndex,
                remoteDeviceIndex,
                pPeerMemoryFeatures
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetDeviceGroupPeerMemoryFeatures].
    public static void vkGetDeviceGroupPeerMemoryFeatures(
    	VkDevice device,
    	int heapIndex,
    	int localDeviceIndex,
    	int remoteDeviceIndex,
    	NativeIntArray pPeerMemoryFeatures
    ) {
    	vkGetDeviceGroupPeerMemoryFeatures(
    		device,
    		heapIndex,
    		localDeviceIndex,
    		remoteDeviceIndex,
    		pPeerMemoryFeatures.memorySegment()
    	);
    }
    
    public static void vkCmdSetDeviceMask(
        VkCommandBuffer commandBuffer,
    	int deviceMask
    ) {
        MethodHandle method = commandBuffer.VK_CMD_SET_DEVICE_MASK().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                deviceMask
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    
    public static int vkEnumeratePhysicalDeviceGroups(
        VkInstance instance,
    	MemorySegment pPhysicalDeviceGroupCount,
    	MemorySegment pPhysicalDeviceGroupProperties
    ) {
        MethodHandle method = instance.VK_ENUMERATE_PHYSICAL_DEVICE_GROUPS().get();
        try {
            return (int) method.invokeExact(
                instance.memorySegment(),
                pPhysicalDeviceGroupCount,
                pPhysicalDeviceGroupProperties
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkEnumeratePhysicalDeviceGroups].
    public static int vkEnumeratePhysicalDeviceGroups(
    	VkInstance instance,
    	NativeIntArray pPhysicalDeviceGroupCount,
    	@Nullable NativeStructArray<VkPhysicalDeviceGroupProperties> pPhysicalDeviceGroupProperties
    ) {
    	return vkEnumeratePhysicalDeviceGroups(
    		instance,
    		pPhysicalDeviceGroupCount.memorySegment(),
    		pPhysicalDeviceGroupProperties == null ? MemorySegment.NULL : pPhysicalDeviceGroupProperties.memorySegment()
    	);
    }
    
    public static void vkGetImageMemoryRequirements2(
        VkDevice device,
    	MemorySegment pInfo,
    	MemorySegment pMemoryRequirements
    ) {
        MethodHandle method = device.VK_GET_IMAGE_MEMORY_REQUIREMENTS2().get();
        try {
             method.invokeExact(
                device.memorySegment(),
                pInfo,
                pMemoryRequirements
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetImageMemoryRequirements2].
    public static void vkGetImageMemoryRequirements2(
    	VkDevice device,
    	VkImageMemoryRequirementsInfo2 pInfo,
    	VkMemoryRequirements2 pMemoryRequirements
    ) {
    	vkGetImageMemoryRequirements2(
    		device,
    		pInfo.memorySegment(),
    		pMemoryRequirements.memorySegment()
    	);
    }
    
    public static void vkGetBufferMemoryRequirements2(
        VkDevice device,
    	MemorySegment pInfo,
    	MemorySegment pMemoryRequirements
    ) {
        MethodHandle method = device.VK_GET_BUFFER_MEMORY_REQUIREMENTS2().get();
        try {
             method.invokeExact(
                device.memorySegment(),
                pInfo,
                pMemoryRequirements
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetBufferMemoryRequirements2].
    public static void vkGetBufferMemoryRequirements2(
    	VkDevice device,
    	VkBufferMemoryRequirementsInfo2 pInfo,
    	VkMemoryRequirements2 pMemoryRequirements
    ) {
    	vkGetBufferMemoryRequirements2(
    		device,
    		pInfo.memorySegment(),
    		pMemoryRequirements.memorySegment()
    	);
    }
    
    public static void vkGetImageSparseMemoryRequirements2(
        VkDevice device,
    	MemorySegment pInfo,
    	MemorySegment pSparseMemoryRequirementCount,
    	MemorySegment pSparseMemoryRequirements
    ) {
        MethodHandle method = device.VK_GET_IMAGE_SPARSE_MEMORY_REQUIREMENTS2().get();
        try {
             method.invokeExact(
                device.memorySegment(),
                pInfo,
                pSparseMemoryRequirementCount,
                pSparseMemoryRequirements
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetImageSparseMemoryRequirements2].
    public static void vkGetImageSparseMemoryRequirements2(
    	VkDevice device,
    	VkImageSparseMemoryRequirementsInfo2 pInfo,
    	NativeIntArray pSparseMemoryRequirementCount,
    	@Nullable NativeStructArray<VkSparseImageMemoryRequirements2> pSparseMemoryRequirements
    ) {
    	vkGetImageSparseMemoryRequirements2(
    		device,
    		pInfo.memorySegment(),
    		pSparseMemoryRequirementCount.memorySegment(),
    		pSparseMemoryRequirements == null ? MemorySegment.NULL : pSparseMemoryRequirements.memorySegment()
    	);
    }
    
    public static void vkGetPhysicalDeviceFeatures2(
        VkPhysicalDevice physicalDevice,
    	MemorySegment pFeatures
    ) {
        MethodHandle method = physicalDevice.VK_GET_PHYSICAL_DEVICE_FEATURES2().get();
        try {
             method.invokeExact(
                physicalDevice.memorySegment(),
                pFeatures
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetPhysicalDeviceFeatures2].
    public static void vkGetPhysicalDeviceFeatures2(
    	VkPhysicalDevice physicalDevice,
    	VkPhysicalDeviceFeatures2 pFeatures
    ) {
    	vkGetPhysicalDeviceFeatures2(
    		physicalDevice,
    		pFeatures.memorySegment()
    	);
    }
    
    public static void vkGetPhysicalDeviceProperties2(
        VkPhysicalDevice physicalDevice,
    	MemorySegment pProperties
    ) {
        MethodHandle method = physicalDevice.VK_GET_PHYSICAL_DEVICE_PROPERTIES2().get();
        try {
             method.invokeExact(
                physicalDevice.memorySegment(),
                pProperties
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetPhysicalDeviceProperties2].
    public static void vkGetPhysicalDeviceProperties2(
    	VkPhysicalDevice physicalDevice,
    	VkPhysicalDeviceProperties2 pProperties
    ) {
    	vkGetPhysicalDeviceProperties2(
    		physicalDevice,
    		pProperties.memorySegment()
    	);
    }
    
    public static void vkGetPhysicalDeviceFormatProperties2(
        VkPhysicalDevice physicalDevice,
    	int format,
    	MemorySegment pFormatProperties
    ) {
        MethodHandle method = physicalDevice.VK_GET_PHYSICAL_DEVICE_FORMAT_PROPERTIES2().get();
        try {
             method.invokeExact(
                physicalDevice.memorySegment(),
                format,
                pFormatProperties
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetPhysicalDeviceFormatProperties2].
    public static void vkGetPhysicalDeviceFormatProperties2(
    	VkPhysicalDevice physicalDevice,
    	int format,
    	VkFormatProperties2 pFormatProperties
    ) {
    	vkGetPhysicalDeviceFormatProperties2(
    		physicalDevice,
    		format,
    		pFormatProperties.memorySegment()
    	);
    }
    
    public static int vkGetPhysicalDeviceImageFormatProperties2(
        VkPhysicalDevice physicalDevice,
    	MemorySegment pImageFormatInfo,
    	MemorySegment pImageFormatProperties
    ) {
        MethodHandle method = physicalDevice.VK_GET_PHYSICAL_DEVICE_IMAGE_FORMAT_PROPERTIES2().get();
        try {
            return (int) method.invokeExact(
                physicalDevice.memorySegment(),
                pImageFormatInfo,
                pImageFormatProperties
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetPhysicalDeviceImageFormatProperties2].
    public static int vkGetPhysicalDeviceImageFormatProperties2(
    	VkPhysicalDevice physicalDevice,
    	VkPhysicalDeviceImageFormatInfo2 pImageFormatInfo,
    	VkImageFormatProperties2 pImageFormatProperties
    ) {
    	return vkGetPhysicalDeviceImageFormatProperties2(
    		physicalDevice,
    		pImageFormatInfo.memorySegment(),
    		pImageFormatProperties.memorySegment()
    	);
    }
    
    public static void vkGetPhysicalDeviceQueueFamilyProperties2(
        VkPhysicalDevice physicalDevice,
    	MemorySegment pQueueFamilyPropertyCount,
    	MemorySegment pQueueFamilyProperties
    ) {
        MethodHandle method = physicalDevice.VK_GET_PHYSICAL_DEVICE_QUEUE_FAMILY_PROPERTIES2().get();
        try {
             method.invokeExact(
                physicalDevice.memorySegment(),
                pQueueFamilyPropertyCount,
                pQueueFamilyProperties
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetPhysicalDeviceQueueFamilyProperties2].
    public static void vkGetPhysicalDeviceQueueFamilyProperties2(
    	VkPhysicalDevice physicalDevice,
    	NativeIntArray pQueueFamilyPropertyCount,
    	@Nullable NativeStructArray<VkQueueFamilyProperties2> pQueueFamilyProperties
    ) {
    	vkGetPhysicalDeviceQueueFamilyProperties2(
    		physicalDevice,
    		pQueueFamilyPropertyCount.memorySegment(),
    		pQueueFamilyProperties == null ? MemorySegment.NULL : pQueueFamilyProperties.memorySegment()
    	);
    }
    
    public static void vkGetPhysicalDeviceMemoryProperties2(
        VkPhysicalDevice physicalDevice,
    	MemorySegment pMemoryProperties
    ) {
        MethodHandle method = physicalDevice.VK_GET_PHYSICAL_DEVICE_MEMORY_PROPERTIES2().get();
        try {
             method.invokeExact(
                physicalDevice.memorySegment(),
                pMemoryProperties
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetPhysicalDeviceMemoryProperties2].
    public static void vkGetPhysicalDeviceMemoryProperties2(
    	VkPhysicalDevice physicalDevice,
    	VkPhysicalDeviceMemoryProperties2 pMemoryProperties
    ) {
    	vkGetPhysicalDeviceMemoryProperties2(
    		physicalDevice,
    		pMemoryProperties.memorySegment()
    	);
    }
    
    public static void vkGetPhysicalDeviceSparseImageFormatProperties2(
        VkPhysicalDevice physicalDevice,
    	MemorySegment pFormatInfo,
    	MemorySegment pPropertyCount,
    	MemorySegment pProperties
    ) {
        MethodHandle method = physicalDevice.VK_GET_PHYSICAL_DEVICE_SPARSE_IMAGE_FORMAT_PROPERTIES2().get();
        try {
             method.invokeExact(
                physicalDevice.memorySegment(),
                pFormatInfo,
                pPropertyCount,
                pProperties
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetPhysicalDeviceSparseImageFormatProperties2].
    public static void vkGetPhysicalDeviceSparseImageFormatProperties2(
    	VkPhysicalDevice physicalDevice,
    	VkPhysicalDeviceSparseImageFormatInfo2 pFormatInfo,
    	NativeIntArray pPropertyCount,
    	@Nullable NativeStructArray<VkSparseImageFormatProperties2> pProperties
    ) {
    	vkGetPhysicalDeviceSparseImageFormatProperties2(
    		physicalDevice,
    		pFormatInfo.memorySegment(),
    		pPropertyCount.memorySegment(),
    		pProperties == null ? MemorySegment.NULL : pProperties.memorySegment()
    	);
    }
    
    public static void vkTrimCommandPool(
        VkDevice device,
    	MemorySegment commandPool,
    	int flags
    ) {
        MethodHandle method = device.VK_TRIM_COMMAND_POOL().get();
        try {
             method.invokeExact(
                device.memorySegment(),
                commandPool,
                flags
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkTrimCommandPool].
    public static void vkTrimCommandPool(
    	VkDevice device,
    	VkCommandPool commandPool,
    	int flags
    ) {
    	vkTrimCommandPool(
    		device,
    		commandPool.memorySegment(),
    		flags
    	);
    }
    
    public static void vkGetDeviceQueue2(
        VkDevice device,
    	MemorySegment pQueueInfo,
    	MemorySegment pQueue
    ) {
        MethodHandle method = device.VK_GET_DEVICE_QUEUE2().get();
        try {
             method.invokeExact(
                device.memorySegment(),
                pQueueInfo,
                pQueue
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetDeviceQueue2].
    public static void vkGetDeviceQueue2(
    	VkDevice device,
    	VkDeviceQueueInfo2 pQueueInfo,
    	NativePointerArray pQueue
    ) {
    	vkGetDeviceQueue2(
    		device,
    		pQueueInfo.memorySegment(),
    		pQueue.memorySegment()
    	);
    }
    
    public static void vkGetPhysicalDeviceExternalBufferProperties(
        VkPhysicalDevice physicalDevice,
    	MemorySegment pExternalBufferInfo,
    	MemorySegment pExternalBufferProperties
    ) {
        MethodHandle method = physicalDevice.VK_GET_PHYSICAL_DEVICE_EXTERNAL_BUFFER_PROPERTIES().get();
        try {
             method.invokeExact(
                physicalDevice.memorySegment(),
                pExternalBufferInfo,
                pExternalBufferProperties
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetPhysicalDeviceExternalBufferProperties].
    public static void vkGetPhysicalDeviceExternalBufferProperties(
    	VkPhysicalDevice physicalDevice,
    	VkPhysicalDeviceExternalBufferInfo pExternalBufferInfo,
    	VkExternalBufferProperties pExternalBufferProperties
    ) {
    	vkGetPhysicalDeviceExternalBufferProperties(
    		physicalDevice,
    		pExternalBufferInfo.memorySegment(),
    		pExternalBufferProperties.memorySegment()
    	);
    }
    
    public static void vkGetPhysicalDeviceExternalFenceProperties(
        VkPhysicalDevice physicalDevice,
    	MemorySegment pExternalFenceInfo,
    	MemorySegment pExternalFenceProperties
    ) {
        MethodHandle method = physicalDevice.VK_GET_PHYSICAL_DEVICE_EXTERNAL_FENCE_PROPERTIES().get();
        try {
             method.invokeExact(
                physicalDevice.memorySegment(),
                pExternalFenceInfo,
                pExternalFenceProperties
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetPhysicalDeviceExternalFenceProperties].
    public static void vkGetPhysicalDeviceExternalFenceProperties(
    	VkPhysicalDevice physicalDevice,
    	VkPhysicalDeviceExternalFenceInfo pExternalFenceInfo,
    	VkExternalFenceProperties pExternalFenceProperties
    ) {
    	vkGetPhysicalDeviceExternalFenceProperties(
    		physicalDevice,
    		pExternalFenceInfo.memorySegment(),
    		pExternalFenceProperties.memorySegment()
    	);
    }
    
    public static void vkGetPhysicalDeviceExternalSemaphoreProperties(
        VkPhysicalDevice physicalDevice,
    	MemorySegment pExternalSemaphoreInfo,
    	MemorySegment pExternalSemaphoreProperties
    ) {
        MethodHandle method = physicalDevice.VK_GET_PHYSICAL_DEVICE_EXTERNAL_SEMAPHORE_PROPERTIES().get();
        try {
             method.invokeExact(
                physicalDevice.memorySegment(),
                pExternalSemaphoreInfo,
                pExternalSemaphoreProperties
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetPhysicalDeviceExternalSemaphoreProperties].
    public static void vkGetPhysicalDeviceExternalSemaphoreProperties(
    	VkPhysicalDevice physicalDevice,
    	VkPhysicalDeviceExternalSemaphoreInfo pExternalSemaphoreInfo,
    	VkExternalSemaphoreProperties pExternalSemaphoreProperties
    ) {
    	vkGetPhysicalDeviceExternalSemaphoreProperties(
    		physicalDevice,
    		pExternalSemaphoreInfo.memorySegment(),
    		pExternalSemaphoreProperties.memorySegment()
    	);
    }
    
    public static void vkCmdDispatchBase(
        VkCommandBuffer commandBuffer,
    	int baseGroupX,
    	int baseGroupY,
    	int baseGroupZ,
    	int groupCountX,
    	int groupCountY,
    	int groupCountZ
    ) {
        MethodHandle method = commandBuffer.VK_CMD_DISPATCH_BASE().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                baseGroupX,
                baseGroupY,
                baseGroupZ,
                groupCountX,
                groupCountY,
                groupCountZ
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    
    public static int vkCreateDescriptorUpdateTemplate(
        VkDevice device,
    	MemorySegment pCreateInfo,
    	MemorySegment pAllocator,
    	MemorySegment pDescriptorUpdateTemplate
    ) {
        MethodHandle method = device.VK_CREATE_DESCRIPTOR_UPDATE_TEMPLATE().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                pCreateInfo,
                pAllocator,
                pDescriptorUpdateTemplate
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCreateDescriptorUpdateTemplate].
    public static int vkCreateDescriptorUpdateTemplate(
    	VkDevice device,
    	VkDescriptorUpdateTemplateCreateInfo pCreateInfo,
    	@Nullable VkAllocationCallbacks pAllocator,
    	NativePointerArray pDescriptorUpdateTemplate
    ) {
    	return vkCreateDescriptorUpdateTemplate(
    		device,
    		pCreateInfo.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment(),
    		pDescriptorUpdateTemplate.memorySegment()
    	);
    }
    
    public static void vkDestroyDescriptorUpdateTemplate(
        VkDevice device,
    	MemorySegment descriptorUpdateTemplate,
    	MemorySegment pAllocator
    ) {
        MethodHandle method = device.VK_DESTROY_DESCRIPTOR_UPDATE_TEMPLATE().get();
        try {
             method.invokeExact(
                device.memorySegment(),
                descriptorUpdateTemplate,
                pAllocator
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkDestroyDescriptorUpdateTemplate].
    public static void vkDestroyDescriptorUpdateTemplate(
    	VkDevice device,
    	@Nullable VkDescriptorUpdateTemplate descriptorUpdateTemplate,
    	@Nullable VkAllocationCallbacks pAllocator
    ) {
    	vkDestroyDescriptorUpdateTemplate(
    		device,
    		descriptorUpdateTemplate == null ? MemorySegment.NULL : descriptorUpdateTemplate.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment()
    	);
    }
    
    public static void vkUpdateDescriptorSetWithTemplate(
        VkDevice device,
    	MemorySegment descriptorSet,
    	MemorySegment descriptorUpdateTemplate,
    	MemorySegment pData
    ) {
        MethodHandle method = device.VK_UPDATE_DESCRIPTOR_SET_WITH_TEMPLATE().get();
        try {
             method.invokeExact(
                device.memorySegment(),
                descriptorSet,
                descriptorUpdateTemplate,
                pData
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkUpdateDescriptorSetWithTemplate].
    public static void vkUpdateDescriptorSetWithTemplate(
    	VkDevice device,
    	VkDescriptorSet descriptorSet,
    	VkDescriptorUpdateTemplate descriptorUpdateTemplate,
    	MemorySegment pData
    ) {
    	vkUpdateDescriptorSetWithTemplate(
    		device,
    		descriptorSet.memorySegment(),
    		descriptorUpdateTemplate.memorySegment(),
    		pData
    	);
    }
    
    public static void vkGetDescriptorSetLayoutSupport(
        VkDevice device,
    	MemorySegment pCreateInfo,
    	MemorySegment pSupport
    ) {
        MethodHandle method = device.VK_GET_DESCRIPTOR_SET_LAYOUT_SUPPORT().get();
        try {
             method.invokeExact(
                device.memorySegment(),
                pCreateInfo,
                pSupport
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetDescriptorSetLayoutSupport].
    public static void vkGetDescriptorSetLayoutSupport(
    	VkDevice device,
    	VkDescriptorSetLayoutCreateInfo pCreateInfo,
    	VkDescriptorSetLayoutSupport pSupport
    ) {
    	vkGetDescriptorSetLayoutSupport(
    		device,
    		pCreateInfo.memorySegment(),
    		pSupport.memorySegment()
    	);
    }
    
    public static int vkCreateSamplerYcbcrConversion(
        VkDevice device,
    	MemorySegment pCreateInfo,
    	MemorySegment pAllocator,
    	MemorySegment pYcbcrConversion
    ) {
        MethodHandle method = device.VK_CREATE_SAMPLER_YCBCR_CONVERSION().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                pCreateInfo,
                pAllocator,
                pYcbcrConversion
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCreateSamplerYcbcrConversion].
    public static int vkCreateSamplerYcbcrConversion(
    	VkDevice device,
    	VkSamplerYcbcrConversionCreateInfo pCreateInfo,
    	@Nullable VkAllocationCallbacks pAllocator,
    	NativePointerArray pYcbcrConversion
    ) {
    	return vkCreateSamplerYcbcrConversion(
    		device,
    		pCreateInfo.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment(),
    		pYcbcrConversion.memorySegment()
    	);
    }
    
    public static void vkDestroySamplerYcbcrConversion(
        VkDevice device,
    	MemorySegment ycbcrConversion,
    	MemorySegment pAllocator
    ) {
        MethodHandle method = device.VK_DESTROY_SAMPLER_YCBCR_CONVERSION().get();
        try {
             method.invokeExact(
                device.memorySegment(),
                ycbcrConversion,
                pAllocator
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkDestroySamplerYcbcrConversion].
    public static void vkDestroySamplerYcbcrConversion(
    	VkDevice device,
    	@Nullable VkSamplerYcbcrConversion ycbcrConversion,
    	@Nullable VkAllocationCallbacks pAllocator
    ) {
    	vkDestroySamplerYcbcrConversion(
    		device,
    		ycbcrConversion == null ? MemorySegment.NULL : ycbcrConversion.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment()
    	);
    }
    
    public static void vkResetQueryPool(
        VkDevice device,
    	MemorySegment queryPool,
    	int firstQuery,
    	int queryCount
    ) {
        MethodHandle method = device.VK_RESET_QUERY_POOL().get();
        try {
             method.invokeExact(
                device.memorySegment(),
                queryPool,
                firstQuery,
                queryCount
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkResetQueryPool].
    public static void vkResetQueryPool(
    	VkDevice device,
    	VkQueryPool queryPool,
    	int firstQuery,
    	int queryCount
    ) {
    	vkResetQueryPool(
    		device,
    		queryPool.memorySegment(),
    		firstQuery,
    		queryCount
    	);
    }
    
    public static int vkGetSemaphoreCounterValue(
        VkDevice device,
    	MemorySegment semaphore,
    	MemorySegment pValue
    ) {
        MethodHandle method = device.VK_GET_SEMAPHORE_COUNTER_VALUE().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                semaphore,
                pValue
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetSemaphoreCounterValue].
    public static int vkGetSemaphoreCounterValue(
    	VkDevice device,
    	VkSemaphore semaphore,
    	NativeLongArray pValue
    ) {
    	return vkGetSemaphoreCounterValue(
    		device,
    		semaphore.memorySegment(),
    		pValue.memorySegment()
    	);
    }
    
    public static int vkWaitSemaphores(
        VkDevice device,
    	MemorySegment pWaitInfo,
    	long timeout
    ) {
        MethodHandle method = device.VK_WAIT_SEMAPHORES().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                pWaitInfo,
                timeout
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkWaitSemaphores].
    public static int vkWaitSemaphores(
    	VkDevice device,
    	VkSemaphoreWaitInfo pWaitInfo,
    	long timeout
    ) {
    	return vkWaitSemaphores(
    		device,
    		pWaitInfo.memorySegment(),
    		timeout
    	);
    }
    
    public static int vkSignalSemaphore(
        VkDevice device,
    	MemorySegment pSignalInfo
    ) {
        MethodHandle method = device.VK_SIGNAL_SEMAPHORE().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                pSignalInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkSignalSemaphore].
    public static int vkSignalSemaphore(
    	VkDevice device,
    	VkSemaphoreSignalInfo pSignalInfo
    ) {
    	return vkSignalSemaphore(
    		device,
    		pSignalInfo.memorySegment()
    	);
    }
    
    public static long vkGetBufferDeviceAddress(
        VkDevice device,
    	MemorySegment pInfo
    ) {
        MethodHandle method = device.VK_GET_BUFFER_DEVICE_ADDRESS().get();
        try {
            return (long) method.invokeExact(
                device.memorySegment(),
                pInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetBufferDeviceAddress].
    public static long vkGetBufferDeviceAddress(
    	VkDevice device,
    	VkBufferDeviceAddressInfo pInfo
    ) {
    	return vkGetBufferDeviceAddress(
    		device,
    		pInfo.memorySegment()
    	);
    }
    
    public static long vkGetBufferOpaqueCaptureAddress(
        VkDevice device,
    	MemorySegment pInfo
    ) {
        MethodHandle method = device.VK_GET_BUFFER_OPAQUE_CAPTURE_ADDRESS().get();
        try {
            return (long) method.invokeExact(
                device.memorySegment(),
                pInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetBufferOpaqueCaptureAddress].
    public static long vkGetBufferOpaqueCaptureAddress(
    	VkDevice device,
    	VkBufferDeviceAddressInfo pInfo
    ) {
    	return vkGetBufferOpaqueCaptureAddress(
    		device,
    		pInfo.memorySegment()
    	);
    }
    
    public static long vkGetDeviceMemoryOpaqueCaptureAddress(
        VkDevice device,
    	MemorySegment pInfo
    ) {
        MethodHandle method = device.VK_GET_DEVICE_MEMORY_OPAQUE_CAPTURE_ADDRESS().get();
        try {
            return (long) method.invokeExact(
                device.memorySegment(),
                pInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetDeviceMemoryOpaqueCaptureAddress].
    public static long vkGetDeviceMemoryOpaqueCaptureAddress(
    	VkDevice device,
    	VkDeviceMemoryOpaqueCaptureAddressInfo pInfo
    ) {
    	return vkGetDeviceMemoryOpaqueCaptureAddress(
    		device,
    		pInfo.memorySegment()
    	);
    }
    
    public static void vkCmdDrawIndirectCount(
        VkCommandBuffer commandBuffer,
    	MemorySegment buffer,
    	long offset,
    	MemorySegment countBuffer,
    	long countBufferOffset,
    	int maxDrawCount,
    	int stride
    ) {
        MethodHandle method = commandBuffer.VK_CMD_DRAW_INDIRECT_COUNT().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                buffer,
                offset,
                countBuffer,
                countBufferOffset,
                maxDrawCount,
                stride
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdDrawIndirectCount].
    public static void vkCmdDrawIndirectCount(
    	VkCommandBuffer commandBuffer,
    	VkBuffer buffer,
    	long offset,
    	VkBuffer countBuffer,
    	long countBufferOffset,
    	int maxDrawCount,
    	int stride
    ) {
    	vkCmdDrawIndirectCount(
    		commandBuffer,
    		buffer.memorySegment(),
    		offset,
    		countBuffer.memorySegment(),
    		countBufferOffset,
    		maxDrawCount,
    		stride
    	);
    }
    
    public static void vkCmdDrawIndexedIndirectCount(
        VkCommandBuffer commandBuffer,
    	MemorySegment buffer,
    	long offset,
    	MemorySegment countBuffer,
    	long countBufferOffset,
    	int maxDrawCount,
    	int stride
    ) {
        MethodHandle method = commandBuffer.VK_CMD_DRAW_INDEXED_INDIRECT_COUNT().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                buffer,
                offset,
                countBuffer,
                countBufferOffset,
                maxDrawCount,
                stride
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdDrawIndexedIndirectCount].
    public static void vkCmdDrawIndexedIndirectCount(
    	VkCommandBuffer commandBuffer,
    	VkBuffer buffer,
    	long offset,
    	VkBuffer countBuffer,
    	long countBufferOffset,
    	int maxDrawCount,
    	int stride
    ) {
    	vkCmdDrawIndexedIndirectCount(
    		commandBuffer,
    		buffer.memorySegment(),
    		offset,
    		countBuffer.memorySegment(),
    		countBufferOffset,
    		maxDrawCount,
    		stride
    	);
    }
    
    public static int vkCreateRenderPass2(
        VkDevice device,
    	MemorySegment pCreateInfo,
    	MemorySegment pAllocator,
    	MemorySegment pRenderPass
    ) {
        MethodHandle method = device.VK_CREATE_RENDER_PASS2().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                pCreateInfo,
                pAllocator,
                pRenderPass
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCreateRenderPass2].
    public static int vkCreateRenderPass2(
    	VkDevice device,
    	VkRenderPassCreateInfo2 pCreateInfo,
    	@Nullable VkAllocationCallbacks pAllocator,
    	NativePointerArray pRenderPass
    ) {
    	return vkCreateRenderPass2(
    		device,
    		pCreateInfo.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment(),
    		pRenderPass.memorySegment()
    	);
    }
    
    public static void vkCmdBeginRenderPass2(
        VkCommandBuffer commandBuffer,
    	MemorySegment pRenderPassBegin,
    	MemorySegment pSubpassBeginInfo
    ) {
        MethodHandle method = commandBuffer.VK_CMD_BEGIN_RENDER_PASS2().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                pRenderPassBegin,
                pSubpassBeginInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdBeginRenderPass2].
    public static void vkCmdBeginRenderPass2(
    	VkCommandBuffer commandBuffer,
    	VkRenderPassBeginInfo pRenderPassBegin,
    	VkSubpassBeginInfo pSubpassBeginInfo
    ) {
    	vkCmdBeginRenderPass2(
    		commandBuffer,
    		pRenderPassBegin.memorySegment(),
    		pSubpassBeginInfo.memorySegment()
    	);
    }
    
    public static void vkCmdNextSubpass2(
        VkCommandBuffer commandBuffer,
    	MemorySegment pSubpassBeginInfo,
    	MemorySegment pSubpassEndInfo
    ) {
        MethodHandle method = commandBuffer.VK_CMD_NEXT_SUBPASS2().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                pSubpassBeginInfo,
                pSubpassEndInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdNextSubpass2].
    public static void vkCmdNextSubpass2(
    	VkCommandBuffer commandBuffer,
    	VkSubpassBeginInfo pSubpassBeginInfo,
    	VkSubpassEndInfo pSubpassEndInfo
    ) {
    	vkCmdNextSubpass2(
    		commandBuffer,
    		pSubpassBeginInfo.memorySegment(),
    		pSubpassEndInfo.memorySegment()
    	);
    }
    
    public static void vkCmdEndRenderPass2(
        VkCommandBuffer commandBuffer,
    	MemorySegment pSubpassEndInfo
    ) {
        MethodHandle method = commandBuffer.VK_CMD_END_RENDER_PASS2().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                pSubpassEndInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdEndRenderPass2].
    public static void vkCmdEndRenderPass2(
    	VkCommandBuffer commandBuffer,
    	VkSubpassEndInfo pSubpassEndInfo
    ) {
    	vkCmdEndRenderPass2(
    		commandBuffer,
    		pSubpassEndInfo.memorySegment()
    	);
    }
    
    public static int vkGetPhysicalDeviceToolProperties(
        VkPhysicalDevice physicalDevice,
    	MemorySegment pToolCount,
    	MemorySegment pToolProperties
    ) {
        MethodHandle method = physicalDevice.VK_GET_PHYSICAL_DEVICE_TOOL_PROPERTIES().get();
        try {
            return (int) method.invokeExact(
                physicalDevice.memorySegment(),
                pToolCount,
                pToolProperties
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetPhysicalDeviceToolProperties].
    public static int vkGetPhysicalDeviceToolProperties(
    	VkPhysicalDevice physicalDevice,
    	NativeIntArray pToolCount,
    	@Nullable NativeStructArray<VkPhysicalDeviceToolProperties> pToolProperties
    ) {
    	return vkGetPhysicalDeviceToolProperties(
    		physicalDevice,
    		pToolCount.memorySegment(),
    		pToolProperties == null ? MemorySegment.NULL : pToolProperties.memorySegment()
    	);
    }
    
    public static int vkCreatePrivateDataSlot(
        VkDevice device,
    	MemorySegment pCreateInfo,
    	MemorySegment pAllocator,
    	MemorySegment pPrivateDataSlot
    ) {
        MethodHandle method = device.VK_CREATE_PRIVATE_DATA_SLOT().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                pCreateInfo,
                pAllocator,
                pPrivateDataSlot
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCreatePrivateDataSlot].
    public static int vkCreatePrivateDataSlot(
    	VkDevice device,
    	VkPrivateDataSlotCreateInfo pCreateInfo,
    	@Nullable VkAllocationCallbacks pAllocator,
    	NativePointerArray pPrivateDataSlot
    ) {
    	return vkCreatePrivateDataSlot(
    		device,
    		pCreateInfo.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment(),
    		pPrivateDataSlot.memorySegment()
    	);
    }
    
    public static void vkDestroyPrivateDataSlot(
        VkDevice device,
    	MemorySegment privateDataSlot,
    	MemorySegment pAllocator
    ) {
        MethodHandle method = device.VK_DESTROY_PRIVATE_DATA_SLOT().get();
        try {
             method.invokeExact(
                device.memorySegment(),
                privateDataSlot,
                pAllocator
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkDestroyPrivateDataSlot].
    public static void vkDestroyPrivateDataSlot(
    	VkDevice device,
    	@Nullable VkPrivateDataSlot privateDataSlot,
    	@Nullable VkAllocationCallbacks pAllocator
    ) {
    	vkDestroyPrivateDataSlot(
    		device,
    		privateDataSlot == null ? MemorySegment.NULL : privateDataSlot.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment()
    	);
    }
    
    public static int vkSetPrivateData(
        VkDevice device,
    	int objectType,
    	long objectHandle,
    	MemorySegment privateDataSlot,
    	long data
    ) {
        MethodHandle method = device.VK_SET_PRIVATE_DATA().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                objectType,
                objectHandle,
                privateDataSlot,
                data
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkSetPrivateData].
    public static int vkSetPrivateData(
    	VkDevice device,
    	int objectType,
    	long objectHandle,
    	VkPrivateDataSlot privateDataSlot,
    	long data
    ) {
    	return vkSetPrivateData(
    		device,
    		objectType,
    		objectHandle,
    		privateDataSlot.memorySegment(),
    		data
    	);
    }
    
    public static void vkGetPrivateData(
        VkDevice device,
    	int objectType,
    	long objectHandle,
    	MemorySegment privateDataSlot,
    	MemorySegment pData
    ) {
        MethodHandle method = device.VK_GET_PRIVATE_DATA().get();
        try {
             method.invokeExact(
                device.memorySegment(),
                objectType,
                objectHandle,
                privateDataSlot,
                pData
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetPrivateData].
    public static void vkGetPrivateData(
    	VkDevice device,
    	int objectType,
    	long objectHandle,
    	VkPrivateDataSlot privateDataSlot,
    	NativeLongArray pData
    ) {
    	vkGetPrivateData(
    		device,
    		objectType,
    		objectHandle,
    		privateDataSlot.memorySegment(),
    		pData.memorySegment()
    	);
    }
    
    public static void vkCmdPipelineBarrier2(
        VkCommandBuffer commandBuffer,
    	MemorySegment pDependencyInfo
    ) {
        MethodHandle method = commandBuffer.VK_CMD_PIPELINE_BARRIER2().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                pDependencyInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdPipelineBarrier2].
    public static void vkCmdPipelineBarrier2(
    	VkCommandBuffer commandBuffer,
    	VkDependencyInfo pDependencyInfo
    ) {
    	vkCmdPipelineBarrier2(
    		commandBuffer,
    		pDependencyInfo.memorySegment()
    	);
    }
    
    public static void vkCmdWriteTimestamp2(
        VkCommandBuffer commandBuffer,
    	long stage,
    	MemorySegment queryPool,
    	int query
    ) {
        MethodHandle method = commandBuffer.VK_CMD_WRITE_TIMESTAMP2().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                stage,
                queryPool,
                query
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdWriteTimestamp2].
    public static void vkCmdWriteTimestamp2(
    	VkCommandBuffer commandBuffer,
    	long stage,
    	VkQueryPool queryPool,
    	int query
    ) {
    	vkCmdWriteTimestamp2(
    		commandBuffer,
    		stage,
    		queryPool.memorySegment(),
    		query
    	);
    }
    
    public static int vkQueueSubmit2(
        VkQueue queue,
    	int submitCount,
    	MemorySegment pSubmits,
    	MemorySegment fence
    ) {
        MethodHandle method = queue.VK_QUEUE_SUBMIT2().get();
        try {
            return (int) method.invokeExact(
                queue.memorySegment(),
                submitCount,
                pSubmits,
                fence
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkQueueSubmit2].
    public static int vkQueueSubmit2(
    	VkQueue queue,
    	int submitCount,
    	@Nullable NativeStructArray<VkSubmitInfo2> pSubmits,
    	@Nullable VkFence fence
    ) {
    	return vkQueueSubmit2(
    		queue,
    		submitCount,
    		pSubmits == null ? MemorySegment.NULL : pSubmits.memorySegment(),
    		fence == null ? MemorySegment.NULL : fence.memorySegment()
    	);
    }
    
    public static void vkCmdCopyBuffer2(
        VkCommandBuffer commandBuffer,
    	MemorySegment pCopyBufferInfo
    ) {
        MethodHandle method = commandBuffer.VK_CMD_COPY_BUFFER2().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                pCopyBufferInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdCopyBuffer2].
    public static void vkCmdCopyBuffer2(
    	VkCommandBuffer commandBuffer,
    	VkCopyBufferInfo2 pCopyBufferInfo
    ) {
    	vkCmdCopyBuffer2(
    		commandBuffer,
    		pCopyBufferInfo.memorySegment()
    	);
    }
    
    public static void vkCmdCopyImage2(
        VkCommandBuffer commandBuffer,
    	MemorySegment pCopyImageInfo
    ) {
        MethodHandle method = commandBuffer.VK_CMD_COPY_IMAGE2().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                pCopyImageInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdCopyImage2].
    public static void vkCmdCopyImage2(
    	VkCommandBuffer commandBuffer,
    	VkCopyImageInfo2 pCopyImageInfo
    ) {
    	vkCmdCopyImage2(
    		commandBuffer,
    		pCopyImageInfo.memorySegment()
    	);
    }
    
    public static void vkCmdCopyBufferToImage2(
        VkCommandBuffer commandBuffer,
    	MemorySegment pCopyBufferToImageInfo
    ) {
        MethodHandle method = commandBuffer.VK_CMD_COPY_BUFFER_TO_IMAGE2().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                pCopyBufferToImageInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdCopyBufferToImage2].
    public static void vkCmdCopyBufferToImage2(
    	VkCommandBuffer commandBuffer,
    	VkCopyBufferToImageInfo2 pCopyBufferToImageInfo
    ) {
    	vkCmdCopyBufferToImage2(
    		commandBuffer,
    		pCopyBufferToImageInfo.memorySegment()
    	);
    }
    
    public static void vkCmdCopyImageToBuffer2(
        VkCommandBuffer commandBuffer,
    	MemorySegment pCopyImageToBufferInfo
    ) {
        MethodHandle method = commandBuffer.VK_CMD_COPY_IMAGE_TO_BUFFER2().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                pCopyImageToBufferInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdCopyImageToBuffer2].
    public static void vkCmdCopyImageToBuffer2(
    	VkCommandBuffer commandBuffer,
    	VkCopyImageToBufferInfo2 pCopyImageToBufferInfo
    ) {
    	vkCmdCopyImageToBuffer2(
    		commandBuffer,
    		pCopyImageToBufferInfo.memorySegment()
    	);
    }
    
    public static void vkGetDeviceBufferMemoryRequirements(
        VkDevice device,
    	MemorySegment pInfo,
    	MemorySegment pMemoryRequirements
    ) {
        MethodHandle method = device.VK_GET_DEVICE_BUFFER_MEMORY_REQUIREMENTS().get();
        try {
             method.invokeExact(
                device.memorySegment(),
                pInfo,
                pMemoryRequirements
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetDeviceBufferMemoryRequirements].
    public static void vkGetDeviceBufferMemoryRequirements(
    	VkDevice device,
    	VkDeviceBufferMemoryRequirements pInfo,
    	VkMemoryRequirements2 pMemoryRequirements
    ) {
    	vkGetDeviceBufferMemoryRequirements(
    		device,
    		pInfo.memorySegment(),
    		pMemoryRequirements.memorySegment()
    	);
    }
    
    public static void vkGetDeviceImageMemoryRequirements(
        VkDevice device,
    	MemorySegment pInfo,
    	MemorySegment pMemoryRequirements
    ) {
        MethodHandle method = device.VK_GET_DEVICE_IMAGE_MEMORY_REQUIREMENTS().get();
        try {
             method.invokeExact(
                device.memorySegment(),
                pInfo,
                pMemoryRequirements
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetDeviceImageMemoryRequirements].
    public static void vkGetDeviceImageMemoryRequirements(
    	VkDevice device,
    	VkDeviceImageMemoryRequirements pInfo,
    	VkMemoryRequirements2 pMemoryRequirements
    ) {
    	vkGetDeviceImageMemoryRequirements(
    		device,
    		pInfo.memorySegment(),
    		pMemoryRequirements.memorySegment()
    	);
    }
    
    public static void vkGetDeviceImageSparseMemoryRequirements(
        VkDevice device,
    	MemorySegment pInfo,
    	MemorySegment pSparseMemoryRequirementCount,
    	MemorySegment pSparseMemoryRequirements
    ) {
        MethodHandle method = device.VK_GET_DEVICE_IMAGE_SPARSE_MEMORY_REQUIREMENTS().get();
        try {
             method.invokeExact(
                device.memorySegment(),
                pInfo,
                pSparseMemoryRequirementCount,
                pSparseMemoryRequirements
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetDeviceImageSparseMemoryRequirements].
    public static void vkGetDeviceImageSparseMemoryRequirements(
    	VkDevice device,
    	VkDeviceImageMemoryRequirements pInfo,
    	NativeIntArray pSparseMemoryRequirementCount,
    	@Nullable NativeStructArray<VkSparseImageMemoryRequirements2> pSparseMemoryRequirements
    ) {
    	vkGetDeviceImageSparseMemoryRequirements(
    		device,
    		pInfo.memorySegment(),
    		pSparseMemoryRequirementCount.memorySegment(),
    		pSparseMemoryRequirements == null ? MemorySegment.NULL : pSparseMemoryRequirements.memorySegment()
    	);
    }
    
    public static void vkCmdSetEvent2(
        VkCommandBuffer commandBuffer,
    	MemorySegment event,
    	MemorySegment pDependencyInfo
    ) {
        MethodHandle method = commandBuffer.VK_CMD_SET_EVENT2().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                event,
                pDependencyInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdSetEvent2].
    public static void vkCmdSetEvent2(
    	VkCommandBuffer commandBuffer,
    	VkEvent event,
    	VkDependencyInfo pDependencyInfo
    ) {
    	vkCmdSetEvent2(
    		commandBuffer,
    		event.memorySegment(),
    		pDependencyInfo.memorySegment()
    	);
    }
    
    public static void vkCmdResetEvent2(
        VkCommandBuffer commandBuffer,
    	MemorySegment event,
    	long stageMask
    ) {
        MethodHandle method = commandBuffer.VK_CMD_RESET_EVENT2().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                event,
                stageMask
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdResetEvent2].
    public static void vkCmdResetEvent2(
    	VkCommandBuffer commandBuffer,
    	VkEvent event,
    	long stageMask
    ) {
    	vkCmdResetEvent2(
    		commandBuffer,
    		event.memorySegment(),
    		stageMask
    	);
    }
    
    public static void vkCmdWaitEvents2(
        VkCommandBuffer commandBuffer,
    	int eventCount,
    	MemorySegment pEvents,
    	MemorySegment pDependencyInfos
    ) {
        MethodHandle method = commandBuffer.VK_CMD_WAIT_EVENTS2().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                eventCount,
                pEvents,
                pDependencyInfos
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdWaitEvents2].
    public static void vkCmdWaitEvents2(
    	VkCommandBuffer commandBuffer,
    	int eventCount,
    	NativePointerArray pEvents,
    	NativeStructArray<VkDependencyInfo> pDependencyInfos
    ) {
    	vkCmdWaitEvents2(
    		commandBuffer,
    		eventCount,
    		pEvents.memorySegment(),
    		pDependencyInfos.memorySegment()
    	);
    }
    
    public static void vkCmdBlitImage2(
        VkCommandBuffer commandBuffer,
    	MemorySegment pBlitImageInfo
    ) {
        MethodHandle method = commandBuffer.VK_CMD_BLIT_IMAGE2().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                pBlitImageInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdBlitImage2].
    public static void vkCmdBlitImage2(
    	VkCommandBuffer commandBuffer,
    	VkBlitImageInfo2 pBlitImageInfo
    ) {
    	vkCmdBlitImage2(
    		commandBuffer,
    		pBlitImageInfo.memorySegment()
    	);
    }
    
    public static void vkCmdResolveImage2(
        VkCommandBuffer commandBuffer,
    	MemorySegment pResolveImageInfo
    ) {
        MethodHandle method = commandBuffer.VK_CMD_RESOLVE_IMAGE2().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                pResolveImageInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdResolveImage2].
    public static void vkCmdResolveImage2(
    	VkCommandBuffer commandBuffer,
    	VkResolveImageInfo2 pResolveImageInfo
    ) {
    	vkCmdResolveImage2(
    		commandBuffer,
    		pResolveImageInfo.memorySegment()
    	);
    }
    
    public static void vkCmdBeginRendering(
        VkCommandBuffer commandBuffer,
    	MemorySegment pRenderingInfo
    ) {
        MethodHandle method = commandBuffer.VK_CMD_BEGIN_RENDERING().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                pRenderingInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdBeginRendering].
    public static void vkCmdBeginRendering(
    	VkCommandBuffer commandBuffer,
    	VkRenderingInfo pRenderingInfo
    ) {
    	vkCmdBeginRendering(
    		commandBuffer,
    		pRenderingInfo.memorySegment()
    	);
    }
    
    public static void vkCmdEndRendering(
        VkCommandBuffer commandBuffer
    ) {
        MethodHandle method = commandBuffer.VK_CMD_END_RENDERING().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    
    public static void vkCmdSetCullMode(
        VkCommandBuffer commandBuffer,
    	int cullMode
    ) {
        MethodHandle method = commandBuffer.VK_CMD_SET_CULL_MODE().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                cullMode
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    
    public static void vkCmdSetFrontFace(
        VkCommandBuffer commandBuffer,
    	int frontFace
    ) {
        MethodHandle method = commandBuffer.VK_CMD_SET_FRONT_FACE().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                frontFace
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    
    public static void vkCmdSetPrimitiveTopology(
        VkCommandBuffer commandBuffer,
    	int primitiveTopology
    ) {
        MethodHandle method = commandBuffer.VK_CMD_SET_PRIMITIVE_TOPOLOGY().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                primitiveTopology
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    
    public static void vkCmdSetViewportWithCount(
        VkCommandBuffer commandBuffer,
    	int viewportCount,
    	MemorySegment pViewports
    ) {
        MethodHandle method = commandBuffer.VK_CMD_SET_VIEWPORT_WITH_COUNT().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                viewportCount,
                pViewports
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdSetViewportWithCount].
    public static void vkCmdSetViewportWithCount(
    	VkCommandBuffer commandBuffer,
    	int viewportCount,
    	NativeStructArray<VkViewport> pViewports
    ) {
    	vkCmdSetViewportWithCount(
    		commandBuffer,
    		viewportCount,
    		pViewports.memorySegment()
    	);
    }
    
    public static void vkCmdSetScissorWithCount(
        VkCommandBuffer commandBuffer,
    	int scissorCount,
    	MemorySegment pScissors
    ) {
        MethodHandle method = commandBuffer.VK_CMD_SET_SCISSOR_WITH_COUNT().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                scissorCount,
                pScissors
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdSetScissorWithCount].
    public static void vkCmdSetScissorWithCount(
    	VkCommandBuffer commandBuffer,
    	int scissorCount,
    	NativeStructArray<VkRect2D> pScissors
    ) {
    	vkCmdSetScissorWithCount(
    		commandBuffer,
    		scissorCount,
    		pScissors.memorySegment()
    	);
    }
    
    public static void vkCmdBindVertexBuffers2(
        VkCommandBuffer commandBuffer,
    	int firstBinding,
    	int bindingCount,
    	MemorySegment pBuffers,
    	MemorySegment pOffsets,
    	MemorySegment pSizes,
    	MemorySegment pStrides
    ) {
        MethodHandle method = commandBuffer.VK_CMD_BIND_VERTEX_BUFFERS2().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                firstBinding,
                bindingCount,
                pBuffers,
                pOffsets,
                pSizes,
                pStrides
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdBindVertexBuffers2].
    public static void vkCmdBindVertexBuffers2(
    	VkCommandBuffer commandBuffer,
    	int firstBinding,
    	int bindingCount,
    	NativePointerArray pBuffers,
    	NativeLongArray pOffsets,
    	@Nullable NativeLongArray pSizes,
    	@Nullable NativeLongArray pStrides
    ) {
    	vkCmdBindVertexBuffers2(
    		commandBuffer,
    		firstBinding,
    		bindingCount,
    		pBuffers.memorySegment(),
    		pOffsets.memorySegment(),
    		pSizes == null ? MemorySegment.NULL : pSizes.memorySegment(),
    		pStrides == null ? MemorySegment.NULL : pStrides.memorySegment()
    	);
    }
    
    public static void vkCmdSetDepthTestEnable(
        VkCommandBuffer commandBuffer,
    	int depthTestEnable
    ) {
        MethodHandle method = commandBuffer.VK_CMD_SET_DEPTH_TEST_ENABLE().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                depthTestEnable
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    
    public static void vkCmdSetDepthWriteEnable(
        VkCommandBuffer commandBuffer,
    	int depthWriteEnable
    ) {
        MethodHandle method = commandBuffer.VK_CMD_SET_DEPTH_WRITE_ENABLE().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                depthWriteEnable
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    
    public static void vkCmdSetDepthCompareOp(
        VkCommandBuffer commandBuffer,
    	int depthCompareOp
    ) {
        MethodHandle method = commandBuffer.VK_CMD_SET_DEPTH_COMPARE_OP().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                depthCompareOp
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    
    public static void vkCmdSetDepthBoundsTestEnable(
        VkCommandBuffer commandBuffer,
    	int depthBoundsTestEnable
    ) {
        MethodHandle method = commandBuffer.VK_CMD_SET_DEPTH_BOUNDS_TEST_ENABLE().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                depthBoundsTestEnable
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    
    public static void vkCmdSetStencilTestEnable(
        VkCommandBuffer commandBuffer,
    	int stencilTestEnable
    ) {
        MethodHandle method = commandBuffer.VK_CMD_SET_STENCIL_TEST_ENABLE().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                stencilTestEnable
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    
    public static void vkCmdSetStencilOp(
        VkCommandBuffer commandBuffer,
    	int faceMask,
    	int failOp,
    	int passOp,
    	int depthFailOp,
    	int compareOp
    ) {
        MethodHandle method = commandBuffer.VK_CMD_SET_STENCIL_OP().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                faceMask,
                failOp,
                passOp,
                depthFailOp,
                compareOp
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    
    public static void vkCmdSetRasterizerDiscardEnable(
        VkCommandBuffer commandBuffer,
    	int rasterizerDiscardEnable
    ) {
        MethodHandle method = commandBuffer.VK_CMD_SET_RASTERIZER_DISCARD_ENABLE().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                rasterizerDiscardEnable
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    
    public static void vkCmdSetDepthBiasEnable(
        VkCommandBuffer commandBuffer,
    	int depthBiasEnable
    ) {
        MethodHandle method = commandBuffer.VK_CMD_SET_DEPTH_BIAS_ENABLE().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                depthBiasEnable
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    
    public static void vkCmdSetPrimitiveRestartEnable(
        VkCommandBuffer commandBuffer,
    	int primitiveRestartEnable
    ) {
        MethodHandle method = commandBuffer.VK_CMD_SET_PRIMITIVE_RESTART_ENABLE().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                primitiveRestartEnable
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    
    public static int vkMapMemory2(
        VkDevice device,
    	MemorySegment pMemoryMapInfo,
    	MemorySegment ppData
    ) {
        MethodHandle method = device.VK_MAP_MEMORY2().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                pMemoryMapInfo,
                ppData
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkMapMemory2].
    public static int vkMapMemory2(
    	VkDevice device,
    	VkMemoryMapInfo pMemoryMapInfo,
    	NativePointerArray ppData
    ) {
    	return vkMapMemory2(
    		device,
    		pMemoryMapInfo.memorySegment(),
    		ppData.memorySegment()
    	);
    }
    
    public static int vkUnmapMemory2(
        VkDevice device,
    	MemorySegment pMemoryUnmapInfo
    ) {
        MethodHandle method = device.VK_UNMAP_MEMORY2().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                pMemoryUnmapInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkUnmapMemory2].
    public static int vkUnmapMemory2(
    	VkDevice device,
    	VkMemoryUnmapInfo pMemoryUnmapInfo
    ) {
    	return vkUnmapMemory2(
    		device,
    		pMemoryUnmapInfo.memorySegment()
    	);
    }
    
    public static void vkGetDeviceImageSubresourceLayout(
        VkDevice device,
    	MemorySegment pInfo,
    	MemorySegment pLayout
    ) {
        MethodHandle method = device.VK_GET_DEVICE_IMAGE_SUBRESOURCE_LAYOUT().get();
        try {
             method.invokeExact(
                device.memorySegment(),
                pInfo,
                pLayout
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetDeviceImageSubresourceLayout].
    public static void vkGetDeviceImageSubresourceLayout(
    	VkDevice device,
    	VkDeviceImageSubresourceInfo pInfo,
    	VkSubresourceLayout2 pLayout
    ) {
    	vkGetDeviceImageSubresourceLayout(
    		device,
    		pInfo.memorySegment(),
    		pLayout.memorySegment()
    	);
    }
    
    public static void vkGetImageSubresourceLayout2(
        VkDevice device,
    	MemorySegment image,
    	MemorySegment pSubresource,
    	MemorySegment pLayout
    ) {
        MethodHandle method = device.VK_GET_IMAGE_SUBRESOURCE_LAYOUT2().get();
        try {
             method.invokeExact(
                device.memorySegment(),
                image,
                pSubresource,
                pLayout
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetImageSubresourceLayout2].
    public static void vkGetImageSubresourceLayout2(
    	VkDevice device,
    	VkImage image,
    	VkImageSubresource2 pSubresource,
    	VkSubresourceLayout2 pLayout
    ) {
    	vkGetImageSubresourceLayout2(
    		device,
    		image.memorySegment(),
    		pSubresource.memorySegment(),
    		pLayout.memorySegment()
    	);
    }
    
    public static int vkCopyMemoryToImage(
        VkDevice device,
    	MemorySegment pCopyMemoryToImageInfo
    ) {
        MethodHandle method = device.VK_COPY_MEMORY_TO_IMAGE().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                pCopyMemoryToImageInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCopyMemoryToImage].
    public static int vkCopyMemoryToImage(
    	VkDevice device,
    	VkCopyMemoryToImageInfo pCopyMemoryToImageInfo
    ) {
    	return vkCopyMemoryToImage(
    		device,
    		pCopyMemoryToImageInfo.memorySegment()
    	);
    }
    
    public static int vkCopyImageToMemory(
        VkDevice device,
    	MemorySegment pCopyImageToMemoryInfo
    ) {
        MethodHandle method = device.VK_COPY_IMAGE_TO_MEMORY().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                pCopyImageToMemoryInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCopyImageToMemory].
    public static int vkCopyImageToMemory(
    	VkDevice device,
    	VkCopyImageToMemoryInfo pCopyImageToMemoryInfo
    ) {
    	return vkCopyImageToMemory(
    		device,
    		pCopyImageToMemoryInfo.memorySegment()
    	);
    }
    
    public static int vkCopyImageToImage(
        VkDevice device,
    	MemorySegment pCopyImageToImageInfo
    ) {
        MethodHandle method = device.VK_COPY_IMAGE_TO_IMAGE().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                pCopyImageToImageInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCopyImageToImage].
    public static int vkCopyImageToImage(
    	VkDevice device,
    	VkCopyImageToImageInfo pCopyImageToImageInfo
    ) {
    	return vkCopyImageToImage(
    		device,
    		pCopyImageToImageInfo.memorySegment()
    	);
    }
    
    public static int vkTransitionImageLayout(
        VkDevice device,
    	int transitionCount,
    	MemorySegment pTransitions
    ) {
        MethodHandle method = device.VK_TRANSITION_IMAGE_LAYOUT().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                transitionCount,
                pTransitions
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkTransitionImageLayout].
    public static int vkTransitionImageLayout(
    	VkDevice device,
    	int transitionCount,
    	NativeStructArray<VkHostImageLayoutTransitionInfo> pTransitions
    ) {
    	return vkTransitionImageLayout(
    		device,
    		transitionCount,
    		pTransitions.memorySegment()
    	);
    }
    
    public static void vkCmdPushDescriptorSet(
        VkCommandBuffer commandBuffer,
    	int pipelineBindPoint,
    	MemorySegment layout,
    	int set,
    	int descriptorWriteCount,
    	MemorySegment pDescriptorWrites
    ) {
        MethodHandle method = commandBuffer.VK_CMD_PUSH_DESCRIPTOR_SET().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                pipelineBindPoint,
                layout,
                set,
                descriptorWriteCount,
                pDescriptorWrites
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdPushDescriptorSet].
    public static void vkCmdPushDescriptorSet(
    	VkCommandBuffer commandBuffer,
    	int pipelineBindPoint,
    	VkPipelineLayout layout,
    	int set,
    	int descriptorWriteCount,
    	NativeStructArray<VkWriteDescriptorSet> pDescriptorWrites
    ) {
    	vkCmdPushDescriptorSet(
    		commandBuffer,
    		pipelineBindPoint,
    		layout.memorySegment(),
    		set,
    		descriptorWriteCount,
    		pDescriptorWrites.memorySegment()
    	);
    }
    
    public static void vkCmdPushDescriptorSetWithTemplate(
        VkCommandBuffer commandBuffer,
    	MemorySegment descriptorUpdateTemplate,
    	MemorySegment layout,
    	int set,
    	MemorySegment pData
    ) {
        MethodHandle method = commandBuffer.VK_CMD_PUSH_DESCRIPTOR_SET_WITH_TEMPLATE().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                descriptorUpdateTemplate,
                layout,
                set,
                pData
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdPushDescriptorSetWithTemplate].
    public static void vkCmdPushDescriptorSetWithTemplate(
    	VkCommandBuffer commandBuffer,
    	VkDescriptorUpdateTemplate descriptorUpdateTemplate,
    	VkPipelineLayout layout,
    	int set,
    	MemorySegment pData
    ) {
    	vkCmdPushDescriptorSetWithTemplate(
    		commandBuffer,
    		descriptorUpdateTemplate.memorySegment(),
    		layout.memorySegment(),
    		set,
    		pData
    	);
    }
    
    public static void vkCmdBindDescriptorSets2(
        VkCommandBuffer commandBuffer,
    	MemorySegment pBindDescriptorSetsInfo
    ) {
        MethodHandle method = commandBuffer.VK_CMD_BIND_DESCRIPTOR_SETS2().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                pBindDescriptorSetsInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdBindDescriptorSets2].
    public static void vkCmdBindDescriptorSets2(
    	VkCommandBuffer commandBuffer,
    	VkBindDescriptorSetsInfo pBindDescriptorSetsInfo
    ) {
    	vkCmdBindDescriptorSets2(
    		commandBuffer,
    		pBindDescriptorSetsInfo.memorySegment()
    	);
    }
    
    public static void vkCmdPushConstants2(
        VkCommandBuffer commandBuffer,
    	MemorySegment pPushConstantsInfo
    ) {
        MethodHandle method = commandBuffer.VK_CMD_PUSH_CONSTANTS2().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                pPushConstantsInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdPushConstants2].
    public static void vkCmdPushConstants2(
    	VkCommandBuffer commandBuffer,
    	VkPushConstantsInfo pPushConstantsInfo
    ) {
    	vkCmdPushConstants2(
    		commandBuffer,
    		pPushConstantsInfo.memorySegment()
    	);
    }
    
    public static void vkCmdPushDescriptorSet2(
        VkCommandBuffer commandBuffer,
    	MemorySegment pPushDescriptorSetInfo
    ) {
        MethodHandle method = commandBuffer.VK_CMD_PUSH_DESCRIPTOR_SET2().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                pPushDescriptorSetInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdPushDescriptorSet2].
    public static void vkCmdPushDescriptorSet2(
    	VkCommandBuffer commandBuffer,
    	VkPushDescriptorSetInfo pPushDescriptorSetInfo
    ) {
    	vkCmdPushDescriptorSet2(
    		commandBuffer,
    		pPushDescriptorSetInfo.memorySegment()
    	);
    }
    
    public static void vkCmdPushDescriptorSetWithTemplate2(
        VkCommandBuffer commandBuffer,
    	MemorySegment pPushDescriptorSetWithTemplateInfo
    ) {
        MethodHandle method = commandBuffer.VK_CMD_PUSH_DESCRIPTOR_SET_WITH_TEMPLATE2().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                pPushDescriptorSetWithTemplateInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdPushDescriptorSetWithTemplate2].
    public static void vkCmdPushDescriptorSetWithTemplate2(
    	VkCommandBuffer commandBuffer,
    	VkPushDescriptorSetWithTemplateInfo pPushDescriptorSetWithTemplateInfo
    ) {
    	vkCmdPushDescriptorSetWithTemplate2(
    		commandBuffer,
    		pPushDescriptorSetWithTemplateInfo.memorySegment()
    	);
    }
    
    public static void vkCmdSetLineStipple(
        VkCommandBuffer commandBuffer,
    	int lineStippleFactor,
    	short lineStipplePattern
    ) {
        MethodHandle method = commandBuffer.VK_CMD_SET_LINE_STIPPLE().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                lineStippleFactor,
                lineStipplePattern
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    
    public static void vkCmdBindIndexBuffer2(
        VkCommandBuffer commandBuffer,
    	MemorySegment buffer,
    	long offset,
    	long size,
    	int indexType
    ) {
        MethodHandle method = commandBuffer.VK_CMD_BIND_INDEX_BUFFER2().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                buffer,
                offset,
                size,
                indexType
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdBindIndexBuffer2].
    public static void vkCmdBindIndexBuffer2(
    	VkCommandBuffer commandBuffer,
    	@Nullable VkBuffer buffer,
    	long offset,
    	long size,
    	int indexType
    ) {
    	vkCmdBindIndexBuffer2(
    		commandBuffer,
    		buffer == null ? MemorySegment.NULL : buffer.memorySegment(),
    		offset,
    		size,
    		indexType
    	);
    }
    
    public static void vkGetRenderingAreaGranularity(
        VkDevice device,
    	MemorySegment pRenderingAreaInfo,
    	MemorySegment pGranularity
    ) {
        MethodHandle method = device.VK_GET_RENDERING_AREA_GRANULARITY().get();
        try {
             method.invokeExact(
                device.memorySegment(),
                pRenderingAreaInfo,
                pGranularity
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetRenderingAreaGranularity].
    public static void vkGetRenderingAreaGranularity(
    	VkDevice device,
    	VkRenderingAreaInfo pRenderingAreaInfo,
    	VkExtent2D pGranularity
    ) {
    	vkGetRenderingAreaGranularity(
    		device,
    		pRenderingAreaInfo.memorySegment(),
    		pGranularity.memorySegment()
    	);
    }
    
    public static void vkCmdSetRenderingAttachmentLocations(
        VkCommandBuffer commandBuffer,
    	MemorySegment pLocationInfo
    ) {
        MethodHandle method = commandBuffer.VK_CMD_SET_RENDERING_ATTACHMENT_LOCATIONS().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                pLocationInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdSetRenderingAttachmentLocations].
    public static void vkCmdSetRenderingAttachmentLocations(
    	VkCommandBuffer commandBuffer,
    	VkRenderingAttachmentLocationInfo pLocationInfo
    ) {
    	vkCmdSetRenderingAttachmentLocations(
    		commandBuffer,
    		pLocationInfo.memorySegment()
    	);
    }
    
    public static void vkCmdSetRenderingInputAttachmentIndices(
        VkCommandBuffer commandBuffer,
    	MemorySegment pInputAttachmentIndexInfo
    ) {
        MethodHandle method = commandBuffer.VK_CMD_SET_RENDERING_INPUT_ATTACHMENT_INDICES().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                pInputAttachmentIndexInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdSetRenderingInputAttachmentIndices].
    public static void vkCmdSetRenderingInputAttachmentIndices(
    	VkCommandBuffer commandBuffer,
    	VkRenderingInputAttachmentIndexInfo pInputAttachmentIndexInfo
    ) {
    	vkCmdSetRenderingInputAttachmentIndices(
    		commandBuffer,
    		pInputAttachmentIndexInfo.memorySegment()
    	);
    }
    
    public static void vkDestroySurfaceKHR(
        VkInstance instance,
    	MemorySegment surface,
    	MemorySegment pAllocator
    ) {
        MethodHandle method = instance.VK_DESTROY_SURFACE_KHR().get();
        try {
             method.invokeExact(
                instance.memorySegment(),
                surface,
                pAllocator
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkDestroySurfaceKHR].
    public static void vkDestroySurfaceKHR(
    	VkInstance instance,
    	@Nullable VkSurfaceKHR surface,
    	@Nullable VkAllocationCallbacks pAllocator
    ) {
    	vkDestroySurfaceKHR(
    		instance,
    		surface == null ? MemorySegment.NULL : surface.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment()
    	);
    }
    
    public static int vkGetPhysicalDeviceSurfaceSupportKHR(
        VkPhysicalDevice physicalDevice,
    	int queueFamilyIndex,
    	MemorySegment surface,
    	MemorySegment pSupported
    ) {
        MethodHandle method = physicalDevice.VK_GET_PHYSICAL_DEVICE_SURFACE_SUPPORT_KHR().get();
        try {
            return (int) method.invokeExact(
                physicalDevice.memorySegment(),
                queueFamilyIndex,
                surface,
                pSupported
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetPhysicalDeviceSurfaceSupportKHR].
    public static int vkGetPhysicalDeviceSurfaceSupportKHR(
    	VkPhysicalDevice physicalDevice,
    	int queueFamilyIndex,
    	VkSurfaceKHR surface,
    	NativeIntArray pSupported
    ) {
    	return vkGetPhysicalDeviceSurfaceSupportKHR(
    		physicalDevice,
    		queueFamilyIndex,
    		surface.memorySegment(),
    		pSupported.memorySegment()
    	);
    }
    
    public static int vkGetPhysicalDeviceSurfaceCapabilitiesKHR(
        VkPhysicalDevice physicalDevice,
    	MemorySegment surface,
    	MemorySegment pSurfaceCapabilities
    ) {
        MethodHandle method = physicalDevice.VK_GET_PHYSICAL_DEVICE_SURFACE_CAPABILITIES_KHR().get();
        try {
            return (int) method.invokeExact(
                physicalDevice.memorySegment(),
                surface,
                pSurfaceCapabilities
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetPhysicalDeviceSurfaceCapabilitiesKHR].
    public static int vkGetPhysicalDeviceSurfaceCapabilitiesKHR(
    	VkPhysicalDevice physicalDevice,
    	VkSurfaceKHR surface,
    	VkSurfaceCapabilitiesKHR pSurfaceCapabilities
    ) {
    	return vkGetPhysicalDeviceSurfaceCapabilitiesKHR(
    		physicalDevice,
    		surface.memorySegment(),
    		pSurfaceCapabilities.memorySegment()
    	);
    }
    
    public static int vkGetPhysicalDeviceSurfaceFormatsKHR(
        VkPhysicalDevice physicalDevice,
    	MemorySegment surface,
    	MemorySegment pSurfaceFormatCount,
    	MemorySegment pSurfaceFormats
    ) {
        MethodHandle method = physicalDevice.VK_GET_PHYSICAL_DEVICE_SURFACE_FORMATS_KHR().get();
        try {
            return (int) method.invokeExact(
                physicalDevice.memorySegment(),
                surface,
                pSurfaceFormatCount,
                pSurfaceFormats
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetPhysicalDeviceSurfaceFormatsKHR].
    public static int vkGetPhysicalDeviceSurfaceFormatsKHR(
    	VkPhysicalDevice physicalDevice,
    	@Nullable VkSurfaceKHR surface,
    	NativeIntArray pSurfaceFormatCount,
    	@Nullable NativeStructArray<VkSurfaceFormatKHR> pSurfaceFormats
    ) {
    	return vkGetPhysicalDeviceSurfaceFormatsKHR(
    		physicalDevice,
    		surface == null ? MemorySegment.NULL : surface.memorySegment(),
    		pSurfaceFormatCount.memorySegment(),
    		pSurfaceFormats == null ? MemorySegment.NULL : pSurfaceFormats.memorySegment()
    	);
    }
    
    public static int vkGetPhysicalDeviceSurfacePresentModesKHR(
        VkPhysicalDevice physicalDevice,
    	MemorySegment surface,
    	MemorySegment pPresentModeCount,
    	MemorySegment pPresentModes
    ) {
        MethodHandle method = physicalDevice.VK_GET_PHYSICAL_DEVICE_SURFACE_PRESENT_MODES_KHR().get();
        try {
            return (int) method.invokeExact(
                physicalDevice.memorySegment(),
                surface,
                pPresentModeCount,
                pPresentModes
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetPhysicalDeviceSurfacePresentModesKHR].
    public static int vkGetPhysicalDeviceSurfacePresentModesKHR(
    	VkPhysicalDevice physicalDevice,
    	@Nullable VkSurfaceKHR surface,
    	NativeIntArray pPresentModeCount,
    	@Nullable NativeIntArray pPresentModes
    ) {
    	return vkGetPhysicalDeviceSurfacePresentModesKHR(
    		physicalDevice,
    		surface == null ? MemorySegment.NULL : surface.memorySegment(),
    		pPresentModeCount.memorySegment(),
    		pPresentModes == null ? MemorySegment.NULL : pPresentModes.memorySegment()
    	);
    }
    
    public static int vkCreateSwapchainKHR(
        VkDevice device,
    	MemorySegment pCreateInfo,
    	MemorySegment pAllocator,
    	MemorySegment pSwapchain
    ) {
        MethodHandle method = device.VK_CREATE_SWAPCHAIN_KHR().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                pCreateInfo,
                pAllocator,
                pSwapchain
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCreateSwapchainKHR].
    public static int vkCreateSwapchainKHR(
    	VkDevice device,
    	VkSwapchainCreateInfoKHR pCreateInfo,
    	@Nullable VkAllocationCallbacks pAllocator,
    	NativePointerArray pSwapchain
    ) {
    	return vkCreateSwapchainKHR(
    		device,
    		pCreateInfo.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment(),
    		pSwapchain.memorySegment()
    	);
    }
    
    public static void vkDestroySwapchainKHR(
        VkDevice device,
    	MemorySegment swapchain,
    	MemorySegment pAllocator
    ) {
        MethodHandle method = device.VK_DESTROY_SWAPCHAIN_KHR().get();
        try {
             method.invokeExact(
                device.memorySegment(),
                swapchain,
                pAllocator
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkDestroySwapchainKHR].
    public static void vkDestroySwapchainKHR(
    	VkDevice device,
    	@Nullable VkSwapchainKHR swapchain,
    	@Nullable VkAllocationCallbacks pAllocator
    ) {
    	vkDestroySwapchainKHR(
    		device,
    		swapchain == null ? MemorySegment.NULL : swapchain.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment()
    	);
    }
    
    public static int vkGetSwapchainImagesKHR(
        VkDevice device,
    	MemorySegment swapchain,
    	MemorySegment pSwapchainImageCount,
    	MemorySegment pSwapchainImages
    ) {
        MethodHandle method = device.VK_GET_SWAPCHAIN_IMAGES_KHR().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                swapchain,
                pSwapchainImageCount,
                pSwapchainImages
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetSwapchainImagesKHR].
    public static int vkGetSwapchainImagesKHR(
    	VkDevice device,
    	VkSwapchainKHR swapchain,
    	NativeIntArray pSwapchainImageCount,
    	@Nullable NativePointerArray pSwapchainImages
    ) {
    	return vkGetSwapchainImagesKHR(
    		device,
    		swapchain.memorySegment(),
    		pSwapchainImageCount.memorySegment(),
    		pSwapchainImages == null ? MemorySegment.NULL : pSwapchainImages.memorySegment()
    	);
    }
    
    public static int vkAcquireNextImageKHR(
        VkDevice device,
    	MemorySegment swapchain,
    	long timeout,
    	MemorySegment semaphore,
    	MemorySegment fence,
    	MemorySegment pImageIndex
    ) {
        MethodHandle method = device.VK_ACQUIRE_NEXT_IMAGE_KHR().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                swapchain,
                timeout,
                semaphore,
                fence,
                pImageIndex
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkAcquireNextImageKHR].
    public static int vkAcquireNextImageKHR(
    	VkDevice device,
    	VkSwapchainKHR swapchain,
    	long timeout,
    	@Nullable VkSemaphore semaphore,
    	@Nullable VkFence fence,
    	NativeIntArray pImageIndex
    ) {
    	return vkAcquireNextImageKHR(
    		device,
    		swapchain.memorySegment(),
    		timeout,
    		semaphore == null ? MemorySegment.NULL : semaphore.memorySegment(),
    		fence == null ? MemorySegment.NULL : fence.memorySegment(),
    		pImageIndex.memorySegment()
    	);
    }
    
    public static int vkQueuePresentKHR(
        VkQueue queue,
    	MemorySegment pPresentInfo
    ) {
        MethodHandle method = queue.VK_QUEUE_PRESENT_KHR().get();
        try {
            return (int) method.invokeExact(
                queue.memorySegment(),
                pPresentInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkQueuePresentKHR].
    public static int vkQueuePresentKHR(
    	VkQueue queue,
    	VkPresentInfoKHR pPresentInfo
    ) {
    	return vkQueuePresentKHR(
    		queue,
    		pPresentInfo.memorySegment()
    	);
    }
    
    public static int vkGetDeviceGroupPresentCapabilitiesKHR(
        VkDevice device,
    	MemorySegment pDeviceGroupPresentCapabilities
    ) {
        MethodHandle method = device.VK_GET_DEVICE_GROUP_PRESENT_CAPABILITIES_KHR().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                pDeviceGroupPresentCapabilities
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetDeviceGroupPresentCapabilitiesKHR].
    public static int vkGetDeviceGroupPresentCapabilitiesKHR(
    	VkDevice device,
    	VkDeviceGroupPresentCapabilitiesKHR pDeviceGroupPresentCapabilities
    ) {
    	return vkGetDeviceGroupPresentCapabilitiesKHR(
    		device,
    		pDeviceGroupPresentCapabilities.memorySegment()
    	);
    }
    
    public static int vkGetDeviceGroupSurfacePresentModesKHR(
        VkDevice device,
    	MemorySegment surface,
    	MemorySegment pModes
    ) {
        MethodHandle method = device.VK_GET_DEVICE_GROUP_SURFACE_PRESENT_MODES_KHR().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                surface,
                pModes
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetDeviceGroupSurfacePresentModesKHR].
    public static int vkGetDeviceGroupSurfacePresentModesKHR(
    	VkDevice device,
    	VkSurfaceKHR surface,
    	NativeIntArray pModes
    ) {
    	return vkGetDeviceGroupSurfacePresentModesKHR(
    		device,
    		surface.memorySegment(),
    		pModes.memorySegment()
    	);
    }
    
    public static int vkGetPhysicalDevicePresentRectanglesKHR(
        VkPhysicalDevice physicalDevice,
    	MemorySegment surface,
    	MemorySegment pRectCount,
    	MemorySegment pRects
    ) {
        MethodHandle method = physicalDevice.VK_GET_PHYSICAL_DEVICE_PRESENT_RECTANGLES_KHR().get();
        try {
            return (int) method.invokeExact(
                physicalDevice.memorySegment(),
                surface,
                pRectCount,
                pRects
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetPhysicalDevicePresentRectanglesKHR].
    public static int vkGetPhysicalDevicePresentRectanglesKHR(
    	VkPhysicalDevice physicalDevice,
    	VkSurfaceKHR surface,
    	NativeIntArray pRectCount,
    	@Nullable NativeStructArray<VkRect2D> pRects
    ) {
    	return vkGetPhysicalDevicePresentRectanglesKHR(
    		physicalDevice,
    		surface.memorySegment(),
    		pRectCount.memorySegment(),
    		pRects == null ? MemorySegment.NULL : pRects.memorySegment()
    	);
    }
    
    public static int vkAcquireNextImage2KHR(
        VkDevice device,
    	MemorySegment pAcquireInfo,
    	MemorySegment pImageIndex
    ) {
        MethodHandle method = device.VK_ACQUIRE_NEXT_IMAGE2_KHR().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                pAcquireInfo,
                pImageIndex
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkAcquireNextImage2KHR].
    public static int vkAcquireNextImage2KHR(
    	VkDevice device,
    	VkAcquireNextImageInfoKHR pAcquireInfo,
    	NativeIntArray pImageIndex
    ) {
    	return vkAcquireNextImage2KHR(
    		device,
    		pAcquireInfo.memorySegment(),
    		pImageIndex.memorySegment()
    	);
    }
    
    public static int vkGetPhysicalDeviceDisplayPropertiesKHR(
        VkPhysicalDevice physicalDevice,
    	MemorySegment pPropertyCount,
    	MemorySegment pProperties
    ) {
        MethodHandle method = physicalDevice.VK_GET_PHYSICAL_DEVICE_DISPLAY_PROPERTIES_KHR().get();
        try {
            return (int) method.invokeExact(
                physicalDevice.memorySegment(),
                pPropertyCount,
                pProperties
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetPhysicalDeviceDisplayPropertiesKHR].
    public static int vkGetPhysicalDeviceDisplayPropertiesKHR(
    	VkPhysicalDevice physicalDevice,
    	NativeIntArray pPropertyCount,
    	@Nullable NativeStructArray<VkDisplayPropertiesKHR> pProperties
    ) {
    	return vkGetPhysicalDeviceDisplayPropertiesKHR(
    		physicalDevice,
    		pPropertyCount.memorySegment(),
    		pProperties == null ? MemorySegment.NULL : pProperties.memorySegment()
    	);
    }
    
    public static int vkGetPhysicalDeviceDisplayPlanePropertiesKHR(
        VkPhysicalDevice physicalDevice,
    	MemorySegment pPropertyCount,
    	MemorySegment pProperties
    ) {
        MethodHandle method = physicalDevice.VK_GET_PHYSICAL_DEVICE_DISPLAY_PLANE_PROPERTIES_KHR().get();
        try {
            return (int) method.invokeExact(
                physicalDevice.memorySegment(),
                pPropertyCount,
                pProperties
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetPhysicalDeviceDisplayPlanePropertiesKHR].
    public static int vkGetPhysicalDeviceDisplayPlanePropertiesKHR(
    	VkPhysicalDevice physicalDevice,
    	NativeIntArray pPropertyCount,
    	@Nullable NativeStructArray<VkDisplayPlanePropertiesKHR> pProperties
    ) {
    	return vkGetPhysicalDeviceDisplayPlanePropertiesKHR(
    		physicalDevice,
    		pPropertyCount.memorySegment(),
    		pProperties == null ? MemorySegment.NULL : pProperties.memorySegment()
    	);
    }
    
    public static int vkGetDisplayPlaneSupportedDisplaysKHR(
        VkPhysicalDevice physicalDevice,
    	int planeIndex,
    	MemorySegment pDisplayCount,
    	MemorySegment pDisplays
    ) {
        MethodHandle method = physicalDevice.VK_GET_DISPLAY_PLANE_SUPPORTED_DISPLAYS_KHR().get();
        try {
            return (int) method.invokeExact(
                physicalDevice.memorySegment(),
                planeIndex,
                pDisplayCount,
                pDisplays
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetDisplayPlaneSupportedDisplaysKHR].
    public static int vkGetDisplayPlaneSupportedDisplaysKHR(
    	VkPhysicalDevice physicalDevice,
    	int planeIndex,
    	NativeIntArray pDisplayCount,
    	@Nullable NativePointerArray pDisplays
    ) {
    	return vkGetDisplayPlaneSupportedDisplaysKHR(
    		physicalDevice,
    		planeIndex,
    		pDisplayCount.memorySegment(),
    		pDisplays == null ? MemorySegment.NULL : pDisplays.memorySegment()
    	);
    }
    
    public static int vkGetDisplayModePropertiesKHR(
        VkPhysicalDevice physicalDevice,
    	MemorySegment display,
    	MemorySegment pPropertyCount,
    	MemorySegment pProperties
    ) {
        MethodHandle method = physicalDevice.VK_GET_DISPLAY_MODE_PROPERTIES_KHR().get();
        try {
            return (int) method.invokeExact(
                physicalDevice.memorySegment(),
                display,
                pPropertyCount,
                pProperties
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetDisplayModePropertiesKHR].
    public static int vkGetDisplayModePropertiesKHR(
    	VkPhysicalDevice physicalDevice,
    	VkDisplayKHR display,
    	NativeIntArray pPropertyCount,
    	@Nullable NativeStructArray<VkDisplayModePropertiesKHR> pProperties
    ) {
    	return vkGetDisplayModePropertiesKHR(
    		physicalDevice,
    		display.memorySegment(),
    		pPropertyCount.memorySegment(),
    		pProperties == null ? MemorySegment.NULL : pProperties.memorySegment()
    	);
    }
    
    public static int vkCreateDisplayModeKHR(
        VkPhysicalDevice physicalDevice,
    	MemorySegment display,
    	MemorySegment pCreateInfo,
    	MemorySegment pAllocator,
    	MemorySegment pMode
    ) {
        MethodHandle method = physicalDevice.VK_CREATE_DISPLAY_MODE_KHR().get();
        try {
            return (int) method.invokeExact(
                physicalDevice.memorySegment(),
                display,
                pCreateInfo,
                pAllocator,
                pMode
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCreateDisplayModeKHR].
    public static int vkCreateDisplayModeKHR(
    	VkPhysicalDevice physicalDevice,
    	VkDisplayKHR display,
    	VkDisplayModeCreateInfoKHR pCreateInfo,
    	@Nullable VkAllocationCallbacks pAllocator,
    	NativePointerArray pMode
    ) {
    	return vkCreateDisplayModeKHR(
    		physicalDevice,
    		display.memorySegment(),
    		pCreateInfo.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment(),
    		pMode.memorySegment()
    	);
    }
    
    public static int vkGetDisplayPlaneCapabilitiesKHR(
        VkPhysicalDevice physicalDevice,
    	MemorySegment mode,
    	int planeIndex,
    	MemorySegment pCapabilities
    ) {
        MethodHandle method = physicalDevice.VK_GET_DISPLAY_PLANE_CAPABILITIES_KHR().get();
        try {
            return (int) method.invokeExact(
                physicalDevice.memorySegment(),
                mode,
                planeIndex,
                pCapabilities
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetDisplayPlaneCapabilitiesKHR].
    public static int vkGetDisplayPlaneCapabilitiesKHR(
    	VkPhysicalDevice physicalDevice,
    	VkDisplayModeKHR mode,
    	int planeIndex,
    	VkDisplayPlaneCapabilitiesKHR pCapabilities
    ) {
    	return vkGetDisplayPlaneCapabilitiesKHR(
    		physicalDevice,
    		mode.memorySegment(),
    		planeIndex,
    		pCapabilities.memorySegment()
    	);
    }
    
    public static int vkCreateDisplayPlaneSurfaceKHR(
        VkInstance instance,
    	MemorySegment pCreateInfo,
    	MemorySegment pAllocator,
    	MemorySegment pSurface
    ) {
        MethodHandle method = instance.VK_CREATE_DISPLAY_PLANE_SURFACE_KHR().get();
        try {
            return (int) method.invokeExact(
                instance.memorySegment(),
                pCreateInfo,
                pAllocator,
                pSurface
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCreateDisplayPlaneSurfaceKHR].
    public static int vkCreateDisplayPlaneSurfaceKHR(
    	VkInstance instance,
    	VkDisplaySurfaceCreateInfoKHR pCreateInfo,
    	@Nullable VkAllocationCallbacks pAllocator,
    	NativePointerArray pSurface
    ) {
    	return vkCreateDisplayPlaneSurfaceKHR(
    		instance,
    		pCreateInfo.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment(),
    		pSurface.memorySegment()
    	);
    }
    
    public static int vkCreateSharedSwapchainsKHR(
        VkDevice device,
    	int swapchainCount,
    	MemorySegment pCreateInfos,
    	MemorySegment pAllocator,
    	MemorySegment pSwapchains
    ) {
        MethodHandle method = device.VK_CREATE_SHARED_SWAPCHAINS_KHR().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                swapchainCount,
                pCreateInfos,
                pAllocator,
                pSwapchains
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCreateSharedSwapchainsKHR].
    public static int vkCreateSharedSwapchainsKHR(
    	VkDevice device,
    	int swapchainCount,
    	NativeStructArray<VkSwapchainCreateInfoKHR> pCreateInfos,
    	@Nullable VkAllocationCallbacks pAllocator,
    	NativePointerArray pSwapchains
    ) {
    	return vkCreateSharedSwapchainsKHR(
    		device,
    		swapchainCount,
    		pCreateInfos.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment(),
    		pSwapchains.memorySegment()
    	);
    }
    
    public static int vkGetPhysicalDeviceVideoCapabilitiesKHR(
        VkPhysicalDevice physicalDevice,
    	MemorySegment pVideoProfile,
    	MemorySegment pCapabilities
    ) {
        MethodHandle method = physicalDevice.VK_GET_PHYSICAL_DEVICE_VIDEO_CAPABILITIES_KHR().get();
        try {
            return (int) method.invokeExact(
                physicalDevice.memorySegment(),
                pVideoProfile,
                pCapabilities
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetPhysicalDeviceVideoCapabilitiesKHR].
    public static int vkGetPhysicalDeviceVideoCapabilitiesKHR(
    	VkPhysicalDevice physicalDevice,
    	VkVideoProfileInfoKHR pVideoProfile,
    	VkVideoCapabilitiesKHR pCapabilities
    ) {
    	return vkGetPhysicalDeviceVideoCapabilitiesKHR(
    		physicalDevice,
    		pVideoProfile.memorySegment(),
    		pCapabilities.memorySegment()
    	);
    }
    
    public static int vkGetPhysicalDeviceVideoFormatPropertiesKHR(
        VkPhysicalDevice physicalDevice,
    	MemorySegment pVideoFormatInfo,
    	MemorySegment pVideoFormatPropertyCount,
    	MemorySegment pVideoFormatProperties
    ) {
        MethodHandle method = physicalDevice.VK_GET_PHYSICAL_DEVICE_VIDEO_FORMAT_PROPERTIES_KHR().get();
        try {
            return (int) method.invokeExact(
                physicalDevice.memorySegment(),
                pVideoFormatInfo,
                pVideoFormatPropertyCount,
                pVideoFormatProperties
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetPhysicalDeviceVideoFormatPropertiesKHR].
    public static int vkGetPhysicalDeviceVideoFormatPropertiesKHR(
    	VkPhysicalDevice physicalDevice,
    	VkPhysicalDeviceVideoFormatInfoKHR pVideoFormatInfo,
    	NativeIntArray pVideoFormatPropertyCount,
    	@Nullable NativeStructArray<VkVideoFormatPropertiesKHR> pVideoFormatProperties
    ) {
    	return vkGetPhysicalDeviceVideoFormatPropertiesKHR(
    		physicalDevice,
    		pVideoFormatInfo.memorySegment(),
    		pVideoFormatPropertyCount.memorySegment(),
    		pVideoFormatProperties == null ? MemorySegment.NULL : pVideoFormatProperties.memorySegment()
    	);
    }
    
    public static int vkCreateVideoSessionKHR(
        VkDevice device,
    	MemorySegment pCreateInfo,
    	MemorySegment pAllocator,
    	MemorySegment pVideoSession
    ) {
        MethodHandle method = device.VK_CREATE_VIDEO_SESSION_KHR().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                pCreateInfo,
                pAllocator,
                pVideoSession
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCreateVideoSessionKHR].
    public static int vkCreateVideoSessionKHR(
    	VkDevice device,
    	VkVideoSessionCreateInfoKHR pCreateInfo,
    	@Nullable VkAllocationCallbacks pAllocator,
    	NativePointerArray pVideoSession
    ) {
    	return vkCreateVideoSessionKHR(
    		device,
    		pCreateInfo.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment(),
    		pVideoSession.memorySegment()
    	);
    }
    
    public static void vkDestroyVideoSessionKHR(
        VkDevice device,
    	MemorySegment videoSession,
    	MemorySegment pAllocator
    ) {
        MethodHandle method = device.VK_DESTROY_VIDEO_SESSION_KHR().get();
        try {
             method.invokeExact(
                device.memorySegment(),
                videoSession,
                pAllocator
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkDestroyVideoSessionKHR].
    public static void vkDestroyVideoSessionKHR(
    	VkDevice device,
    	@Nullable VkVideoSessionKHR videoSession,
    	@Nullable VkAllocationCallbacks pAllocator
    ) {
    	vkDestroyVideoSessionKHR(
    		device,
    		videoSession == null ? MemorySegment.NULL : videoSession.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment()
    	);
    }
    
    public static int vkGetVideoSessionMemoryRequirementsKHR(
        VkDevice device,
    	MemorySegment videoSession,
    	MemorySegment pMemoryRequirementsCount,
    	MemorySegment pMemoryRequirements
    ) {
        MethodHandle method = device.VK_GET_VIDEO_SESSION_MEMORY_REQUIREMENTS_KHR().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                videoSession,
                pMemoryRequirementsCount,
                pMemoryRequirements
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetVideoSessionMemoryRequirementsKHR].
    public static int vkGetVideoSessionMemoryRequirementsKHR(
    	VkDevice device,
    	VkVideoSessionKHR videoSession,
    	NativeIntArray pMemoryRequirementsCount,
    	@Nullable NativeStructArray<VkVideoSessionMemoryRequirementsKHR> pMemoryRequirements
    ) {
    	return vkGetVideoSessionMemoryRequirementsKHR(
    		device,
    		videoSession.memorySegment(),
    		pMemoryRequirementsCount.memorySegment(),
    		pMemoryRequirements == null ? MemorySegment.NULL : pMemoryRequirements.memorySegment()
    	);
    }
    
    public static int vkBindVideoSessionMemoryKHR(
        VkDevice device,
    	MemorySegment videoSession,
    	int bindSessionMemoryInfoCount,
    	MemorySegment pBindSessionMemoryInfos
    ) {
        MethodHandle method = device.VK_BIND_VIDEO_SESSION_MEMORY_KHR().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                videoSession,
                bindSessionMemoryInfoCount,
                pBindSessionMemoryInfos
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkBindVideoSessionMemoryKHR].
    public static int vkBindVideoSessionMemoryKHR(
    	VkDevice device,
    	VkVideoSessionKHR videoSession,
    	int bindSessionMemoryInfoCount,
    	NativeStructArray<VkBindVideoSessionMemoryInfoKHR> pBindSessionMemoryInfos
    ) {
    	return vkBindVideoSessionMemoryKHR(
    		device,
    		videoSession.memorySegment(),
    		bindSessionMemoryInfoCount,
    		pBindSessionMemoryInfos.memorySegment()
    	);
    }
    
    public static int vkCreateVideoSessionParametersKHR(
        VkDevice device,
    	MemorySegment pCreateInfo,
    	MemorySegment pAllocator,
    	MemorySegment pVideoSessionParameters
    ) {
        MethodHandle method = device.VK_CREATE_VIDEO_SESSION_PARAMETERS_KHR().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                pCreateInfo,
                pAllocator,
                pVideoSessionParameters
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCreateVideoSessionParametersKHR].
    public static int vkCreateVideoSessionParametersKHR(
    	VkDevice device,
    	VkVideoSessionParametersCreateInfoKHR pCreateInfo,
    	@Nullable VkAllocationCallbacks pAllocator,
    	NativePointerArray pVideoSessionParameters
    ) {
    	return vkCreateVideoSessionParametersKHR(
    		device,
    		pCreateInfo.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment(),
    		pVideoSessionParameters.memorySegment()
    	);
    }
    
    public static int vkUpdateVideoSessionParametersKHR(
        VkDevice device,
    	MemorySegment videoSessionParameters,
    	MemorySegment pUpdateInfo
    ) {
        MethodHandle method = device.VK_UPDATE_VIDEO_SESSION_PARAMETERS_KHR().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                videoSessionParameters,
                pUpdateInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkUpdateVideoSessionParametersKHR].
    public static int vkUpdateVideoSessionParametersKHR(
    	VkDevice device,
    	VkVideoSessionParametersKHR videoSessionParameters,
    	VkVideoSessionParametersUpdateInfoKHR pUpdateInfo
    ) {
    	return vkUpdateVideoSessionParametersKHR(
    		device,
    		videoSessionParameters.memorySegment(),
    		pUpdateInfo.memorySegment()
    	);
    }
    
    public static void vkDestroyVideoSessionParametersKHR(
        VkDevice device,
    	MemorySegment videoSessionParameters,
    	MemorySegment pAllocator
    ) {
        MethodHandle method = device.VK_DESTROY_VIDEO_SESSION_PARAMETERS_KHR().get();
        try {
             method.invokeExact(
                device.memorySegment(),
                videoSessionParameters,
                pAllocator
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkDestroyVideoSessionParametersKHR].
    public static void vkDestroyVideoSessionParametersKHR(
    	VkDevice device,
    	@Nullable VkVideoSessionParametersKHR videoSessionParameters,
    	@Nullable VkAllocationCallbacks pAllocator
    ) {
    	vkDestroyVideoSessionParametersKHR(
    		device,
    		videoSessionParameters == null ? MemorySegment.NULL : videoSessionParameters.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment()
    	);
    }
    
    public static void vkCmdBeginVideoCodingKHR(
        VkCommandBuffer commandBuffer,
    	MemorySegment pBeginInfo
    ) {
        MethodHandle method = commandBuffer.VK_CMD_BEGIN_VIDEO_CODING_KHR().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                pBeginInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdBeginVideoCodingKHR].
    public static void vkCmdBeginVideoCodingKHR(
    	VkCommandBuffer commandBuffer,
    	VkVideoBeginCodingInfoKHR pBeginInfo
    ) {
    	vkCmdBeginVideoCodingKHR(
    		commandBuffer,
    		pBeginInfo.memorySegment()
    	);
    }
    
    public static void vkCmdEndVideoCodingKHR(
        VkCommandBuffer commandBuffer,
    	MemorySegment pEndCodingInfo
    ) {
        MethodHandle method = commandBuffer.VK_CMD_END_VIDEO_CODING_KHR().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                pEndCodingInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdEndVideoCodingKHR].
    public static void vkCmdEndVideoCodingKHR(
    	VkCommandBuffer commandBuffer,
    	VkVideoEndCodingInfoKHR pEndCodingInfo
    ) {
    	vkCmdEndVideoCodingKHR(
    		commandBuffer,
    		pEndCodingInfo.memorySegment()
    	);
    }
    
    public static void vkCmdControlVideoCodingKHR(
        VkCommandBuffer commandBuffer,
    	MemorySegment pCodingControlInfo
    ) {
        MethodHandle method = commandBuffer.VK_CMD_CONTROL_VIDEO_CODING_KHR().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                pCodingControlInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdControlVideoCodingKHR].
    public static void vkCmdControlVideoCodingKHR(
    	VkCommandBuffer commandBuffer,
    	VkVideoCodingControlInfoKHR pCodingControlInfo
    ) {
    	vkCmdControlVideoCodingKHR(
    		commandBuffer,
    		pCodingControlInfo.memorySegment()
    	);
    }
    
    public static void vkCmdDecodeVideoKHR(
        VkCommandBuffer commandBuffer,
    	MemorySegment pDecodeInfo
    ) {
        MethodHandle method = commandBuffer.VK_CMD_DECODE_VIDEO_KHR().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                pDecodeInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdDecodeVideoKHR].
    public static void vkCmdDecodeVideoKHR(
    	VkCommandBuffer commandBuffer,
    	VkVideoDecodeInfoKHR pDecodeInfo
    ) {
    	vkCmdDecodeVideoKHR(
    		commandBuffer,
    		pDecodeInfo.memorySegment()
    	);
    }
    
    public static int vkGetMemoryFdKHR(
        VkDevice device,
    	MemorySegment pGetFdInfo,
    	MemorySegment pFd
    ) {
        MethodHandle method = device.VK_GET_MEMORY_FD_KHR().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                pGetFdInfo,
                pFd
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetMemoryFdKHR].
    public static int vkGetMemoryFdKHR(
    	VkDevice device,
    	VkMemoryGetFdInfoKHR pGetFdInfo,
    	NativeIntArray pFd
    ) {
    	return vkGetMemoryFdKHR(
    		device,
    		pGetFdInfo.memorySegment(),
    		pFd.memorySegment()
    	);
    }
    
    public static int vkGetMemoryFdPropertiesKHR(
        VkDevice device,
    	int handleType,
    	int fd,
    	MemorySegment pMemoryFdProperties
    ) {
        MethodHandle method = device.VK_GET_MEMORY_FD_PROPERTIES_KHR().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                handleType,
                fd,
                pMemoryFdProperties
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetMemoryFdPropertiesKHR].
    public static int vkGetMemoryFdPropertiesKHR(
    	VkDevice device,
    	int handleType,
    	int fd,
    	VkMemoryFdPropertiesKHR pMemoryFdProperties
    ) {
    	return vkGetMemoryFdPropertiesKHR(
    		device,
    		handleType,
    		fd,
    		pMemoryFdProperties.memorySegment()
    	);
    }
    
    public static int vkImportSemaphoreFdKHR(
        VkDevice device,
    	MemorySegment pImportSemaphoreFdInfo
    ) {
        MethodHandle method = device.VK_IMPORT_SEMAPHORE_FD_KHR().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                pImportSemaphoreFdInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkImportSemaphoreFdKHR].
    public static int vkImportSemaphoreFdKHR(
    	VkDevice device,
    	VkImportSemaphoreFdInfoKHR pImportSemaphoreFdInfo
    ) {
    	return vkImportSemaphoreFdKHR(
    		device,
    		pImportSemaphoreFdInfo.memorySegment()
    	);
    }
    
    public static int vkGetSemaphoreFdKHR(
        VkDevice device,
    	MemorySegment pGetFdInfo,
    	MemorySegment pFd
    ) {
        MethodHandle method = device.VK_GET_SEMAPHORE_FD_KHR().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                pGetFdInfo,
                pFd
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetSemaphoreFdKHR].
    public static int vkGetSemaphoreFdKHR(
    	VkDevice device,
    	VkSemaphoreGetFdInfoKHR pGetFdInfo,
    	NativeIntArray pFd
    ) {
    	return vkGetSemaphoreFdKHR(
    		device,
    		pGetFdInfo.memorySegment(),
    		pFd.memorySegment()
    	);
    }
    
    public static int vkGetSwapchainStatusKHR(
        VkDevice device,
    	MemorySegment swapchain
    ) {
        MethodHandle method = device.VK_GET_SWAPCHAIN_STATUS_KHR().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                swapchain
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetSwapchainStatusKHR].
    public static int vkGetSwapchainStatusKHR(
    	VkDevice device,
    	VkSwapchainKHR swapchain
    ) {
    	return vkGetSwapchainStatusKHR(
    		device,
    		swapchain.memorySegment()
    	);
    }
    
    public static int vkImportFenceFdKHR(
        VkDevice device,
    	MemorySegment pImportFenceFdInfo
    ) {
        MethodHandle method = device.VK_IMPORT_FENCE_FD_KHR().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                pImportFenceFdInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkImportFenceFdKHR].
    public static int vkImportFenceFdKHR(
    	VkDevice device,
    	VkImportFenceFdInfoKHR pImportFenceFdInfo
    ) {
    	return vkImportFenceFdKHR(
    		device,
    		pImportFenceFdInfo.memorySegment()
    	);
    }
    
    public static int vkGetFenceFdKHR(
        VkDevice device,
    	MemorySegment pGetFdInfo,
    	MemorySegment pFd
    ) {
        MethodHandle method = device.VK_GET_FENCE_FD_KHR().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                pGetFdInfo,
                pFd
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetFenceFdKHR].
    public static int vkGetFenceFdKHR(
    	VkDevice device,
    	VkFenceGetFdInfoKHR pGetFdInfo,
    	NativeIntArray pFd
    ) {
    	return vkGetFenceFdKHR(
    		device,
    		pGetFdInfo.memorySegment(),
    		pFd.memorySegment()
    	);
    }
    
    public static int vkEnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR(
        VkPhysicalDevice physicalDevice,
    	int queueFamilyIndex,
    	MemorySegment pCounterCount,
    	MemorySegment pCounters,
    	MemorySegment pCounterDescriptions
    ) {
        MethodHandle method = physicalDevice.VK_ENUMERATE_PHYSICAL_DEVICE_QUEUE_FAMILY_PERFORMANCE_QUERY_COUNTERS_KHR().get();
        try {
            return (int) method.invokeExact(
                physicalDevice.memorySegment(),
                queueFamilyIndex,
                pCounterCount,
                pCounters,
                pCounterDescriptions
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkEnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR].
    public static int vkEnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR(
    	VkPhysicalDevice physicalDevice,
    	int queueFamilyIndex,
    	NativeIntArray pCounterCount,
    	@Nullable NativeStructArray<VkPerformanceCounterKHR> pCounters,
    	@Nullable NativeStructArray<VkPerformanceCounterDescriptionKHR> pCounterDescriptions
    ) {
    	return vkEnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR(
    		physicalDevice,
    		queueFamilyIndex,
    		pCounterCount.memorySegment(),
    		pCounters == null ? MemorySegment.NULL : pCounters.memorySegment(),
    		pCounterDescriptions == null ? MemorySegment.NULL : pCounterDescriptions.memorySegment()
    	);
    }
    
    public static void vkGetPhysicalDeviceQueueFamilyPerformanceQueryPassesKHR(
        VkPhysicalDevice physicalDevice,
    	MemorySegment pPerformanceQueryCreateInfo,
    	MemorySegment pNumPasses
    ) {
        MethodHandle method = physicalDevice.VK_GET_PHYSICAL_DEVICE_QUEUE_FAMILY_PERFORMANCE_QUERY_PASSES_KHR().get();
        try {
             method.invokeExact(
                physicalDevice.memorySegment(),
                pPerformanceQueryCreateInfo,
                pNumPasses
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetPhysicalDeviceQueueFamilyPerformanceQueryPassesKHR].
    public static void vkGetPhysicalDeviceQueueFamilyPerformanceQueryPassesKHR(
    	VkPhysicalDevice physicalDevice,
    	VkQueryPoolPerformanceCreateInfoKHR pPerformanceQueryCreateInfo,
    	NativeIntArray pNumPasses
    ) {
    	vkGetPhysicalDeviceQueueFamilyPerformanceQueryPassesKHR(
    		physicalDevice,
    		pPerformanceQueryCreateInfo.memorySegment(),
    		pNumPasses.memorySegment()
    	);
    }
    
    public static int vkAcquireProfilingLockKHR(
        VkDevice device,
    	MemorySegment pInfo
    ) {
        MethodHandle method = device.VK_ACQUIRE_PROFILING_LOCK_KHR().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                pInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkAcquireProfilingLockKHR].
    public static int vkAcquireProfilingLockKHR(
    	VkDevice device,
    	VkAcquireProfilingLockInfoKHR pInfo
    ) {
    	return vkAcquireProfilingLockKHR(
    		device,
    		pInfo.memorySegment()
    	);
    }
    
    public static void vkReleaseProfilingLockKHR(
        VkDevice device
    ) {
        MethodHandle method = device.VK_RELEASE_PROFILING_LOCK_KHR().get();
        try {
             method.invokeExact(
                device.memorySegment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    
    public static int vkGetPhysicalDeviceSurfaceCapabilities2KHR(
        VkPhysicalDevice physicalDevice,
    	MemorySegment pSurfaceInfo,
    	MemorySegment pSurfaceCapabilities
    ) {
        MethodHandle method = physicalDevice.VK_GET_PHYSICAL_DEVICE_SURFACE_CAPABILITIES2_KHR().get();
        try {
            return (int) method.invokeExact(
                physicalDevice.memorySegment(),
                pSurfaceInfo,
                pSurfaceCapabilities
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetPhysicalDeviceSurfaceCapabilities2KHR].
    public static int vkGetPhysicalDeviceSurfaceCapabilities2KHR(
    	VkPhysicalDevice physicalDevice,
    	VkPhysicalDeviceSurfaceInfo2KHR pSurfaceInfo,
    	VkSurfaceCapabilities2KHR pSurfaceCapabilities
    ) {
    	return vkGetPhysicalDeviceSurfaceCapabilities2KHR(
    		physicalDevice,
    		pSurfaceInfo.memorySegment(),
    		pSurfaceCapabilities.memorySegment()
    	);
    }
    
    public static int vkGetPhysicalDeviceSurfaceFormats2KHR(
        VkPhysicalDevice physicalDevice,
    	MemorySegment pSurfaceInfo,
    	MemorySegment pSurfaceFormatCount,
    	MemorySegment pSurfaceFormats
    ) {
        MethodHandle method = physicalDevice.VK_GET_PHYSICAL_DEVICE_SURFACE_FORMATS2_KHR().get();
        try {
            return (int) method.invokeExact(
                physicalDevice.memorySegment(),
                pSurfaceInfo,
                pSurfaceFormatCount,
                pSurfaceFormats
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetPhysicalDeviceSurfaceFormats2KHR].
    public static int vkGetPhysicalDeviceSurfaceFormats2KHR(
    	VkPhysicalDevice physicalDevice,
    	VkPhysicalDeviceSurfaceInfo2KHR pSurfaceInfo,
    	NativeIntArray pSurfaceFormatCount,
    	@Nullable NativeStructArray<VkSurfaceFormat2KHR> pSurfaceFormats
    ) {
    	return vkGetPhysicalDeviceSurfaceFormats2KHR(
    		physicalDevice,
    		pSurfaceInfo.memorySegment(),
    		pSurfaceFormatCount.memorySegment(),
    		pSurfaceFormats == null ? MemorySegment.NULL : pSurfaceFormats.memorySegment()
    	);
    }
    
    public static int vkGetPhysicalDeviceDisplayProperties2KHR(
        VkPhysicalDevice physicalDevice,
    	MemorySegment pPropertyCount,
    	MemorySegment pProperties
    ) {
        MethodHandle method = physicalDevice.VK_GET_PHYSICAL_DEVICE_DISPLAY_PROPERTIES2_KHR().get();
        try {
            return (int) method.invokeExact(
                physicalDevice.memorySegment(),
                pPropertyCount,
                pProperties
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetPhysicalDeviceDisplayProperties2KHR].
    public static int vkGetPhysicalDeviceDisplayProperties2KHR(
    	VkPhysicalDevice physicalDevice,
    	NativeIntArray pPropertyCount,
    	@Nullable NativeStructArray<VkDisplayProperties2KHR> pProperties
    ) {
    	return vkGetPhysicalDeviceDisplayProperties2KHR(
    		physicalDevice,
    		pPropertyCount.memorySegment(),
    		pProperties == null ? MemorySegment.NULL : pProperties.memorySegment()
    	);
    }
    
    public static int vkGetPhysicalDeviceDisplayPlaneProperties2KHR(
        VkPhysicalDevice physicalDevice,
    	MemorySegment pPropertyCount,
    	MemorySegment pProperties
    ) {
        MethodHandle method = physicalDevice.VK_GET_PHYSICAL_DEVICE_DISPLAY_PLANE_PROPERTIES2_KHR().get();
        try {
            return (int) method.invokeExact(
                physicalDevice.memorySegment(),
                pPropertyCount,
                pProperties
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetPhysicalDeviceDisplayPlaneProperties2KHR].
    public static int vkGetPhysicalDeviceDisplayPlaneProperties2KHR(
    	VkPhysicalDevice physicalDevice,
    	NativeIntArray pPropertyCount,
    	@Nullable NativeStructArray<VkDisplayPlaneProperties2KHR> pProperties
    ) {
    	return vkGetPhysicalDeviceDisplayPlaneProperties2KHR(
    		physicalDevice,
    		pPropertyCount.memorySegment(),
    		pProperties == null ? MemorySegment.NULL : pProperties.memorySegment()
    	);
    }
    
    public static int vkGetDisplayModeProperties2KHR(
        VkPhysicalDevice physicalDevice,
    	MemorySegment display,
    	MemorySegment pPropertyCount,
    	MemorySegment pProperties
    ) {
        MethodHandle method = physicalDevice.VK_GET_DISPLAY_MODE_PROPERTIES2_KHR().get();
        try {
            return (int) method.invokeExact(
                physicalDevice.memorySegment(),
                display,
                pPropertyCount,
                pProperties
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetDisplayModeProperties2KHR].
    public static int vkGetDisplayModeProperties2KHR(
    	VkPhysicalDevice physicalDevice,
    	VkDisplayKHR display,
    	NativeIntArray pPropertyCount,
    	@Nullable NativeStructArray<VkDisplayModeProperties2KHR> pProperties
    ) {
    	return vkGetDisplayModeProperties2KHR(
    		physicalDevice,
    		display.memorySegment(),
    		pPropertyCount.memorySegment(),
    		pProperties == null ? MemorySegment.NULL : pProperties.memorySegment()
    	);
    }
    
    public static int vkGetDisplayPlaneCapabilities2KHR(
        VkPhysicalDevice physicalDevice,
    	MemorySegment pDisplayPlaneInfo,
    	MemorySegment pCapabilities
    ) {
        MethodHandle method = physicalDevice.VK_GET_DISPLAY_PLANE_CAPABILITIES2_KHR().get();
        try {
            return (int) method.invokeExact(
                physicalDevice.memorySegment(),
                pDisplayPlaneInfo,
                pCapabilities
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetDisplayPlaneCapabilities2KHR].
    public static int vkGetDisplayPlaneCapabilities2KHR(
    	VkPhysicalDevice physicalDevice,
    	VkDisplayPlaneInfo2KHR pDisplayPlaneInfo,
    	VkDisplayPlaneCapabilities2KHR pCapabilities
    ) {
    	return vkGetDisplayPlaneCapabilities2KHR(
    		physicalDevice,
    		pDisplayPlaneInfo.memorySegment(),
    		pCapabilities.memorySegment()
    	);
    }
    
    public static int vkGetPhysicalDeviceFragmentShadingRatesKHR(
        VkPhysicalDevice physicalDevice,
    	MemorySegment pFragmentShadingRateCount,
    	MemorySegment pFragmentShadingRates
    ) {
        MethodHandle method = physicalDevice.VK_GET_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATES_KHR().get();
        try {
            return (int) method.invokeExact(
                physicalDevice.memorySegment(),
                pFragmentShadingRateCount,
                pFragmentShadingRates
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetPhysicalDeviceFragmentShadingRatesKHR].
    public static int vkGetPhysicalDeviceFragmentShadingRatesKHR(
    	VkPhysicalDevice physicalDevice,
    	NativeIntArray pFragmentShadingRateCount,
    	@Nullable NativeStructArray<VkPhysicalDeviceFragmentShadingRateKHR> pFragmentShadingRates
    ) {
    	return vkGetPhysicalDeviceFragmentShadingRatesKHR(
    		physicalDevice,
    		pFragmentShadingRateCount.memorySegment(),
    		pFragmentShadingRates == null ? MemorySegment.NULL : pFragmentShadingRates.memorySegment()
    	);
    }
    
    public static void vkCmdSetFragmentShadingRateKHR(
        VkCommandBuffer commandBuffer,
    	MemorySegment pFragmentSize,
    	MemorySegment combinerOps
    ) {
        MethodHandle method = commandBuffer.VK_CMD_SET_FRAGMENT_SHADING_RATE_KHR().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                pFragmentSize,
                combinerOps
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdSetFragmentShadingRateKHR].
    public static void vkCmdSetFragmentShadingRateKHR(
    	VkCommandBuffer commandBuffer,
    	VkExtent2D pFragmentSize,
    	MemorySegment combinerOps
    ) {
    	vkCmdSetFragmentShadingRateKHR(
    		commandBuffer,
    		pFragmentSize.memorySegment(),
    		combinerOps
    	);
    }
    
    public static int vkWaitForPresentKHR(
        VkDevice device,
    	MemorySegment swapchain,
    	long presentId,
    	long timeout
    ) {
        MethodHandle method = device.VK_WAIT_FOR_PRESENT_KHR().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                swapchain,
                presentId,
                timeout
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkWaitForPresentKHR].
    public static int vkWaitForPresentKHR(
    	VkDevice device,
    	VkSwapchainKHR swapchain,
    	long presentId,
    	long timeout
    ) {
    	return vkWaitForPresentKHR(
    		device,
    		swapchain.memorySegment(),
    		presentId,
    		timeout
    	);
    }
    
    public static int vkCreateDeferredOperationKHR(
        VkDevice device,
    	MemorySegment pAllocator,
    	MemorySegment pDeferredOperation
    ) {
        MethodHandle method = device.VK_CREATE_DEFERRED_OPERATION_KHR().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                pAllocator,
                pDeferredOperation
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCreateDeferredOperationKHR].
    public static int vkCreateDeferredOperationKHR(
    	VkDevice device,
    	@Nullable VkAllocationCallbacks pAllocator,
    	NativePointerArray pDeferredOperation
    ) {
    	return vkCreateDeferredOperationKHR(
    		device,
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment(),
    		pDeferredOperation.memorySegment()
    	);
    }
    
    public static void vkDestroyDeferredOperationKHR(
        VkDevice device,
    	MemorySegment operation,
    	MemorySegment pAllocator
    ) {
        MethodHandle method = device.VK_DESTROY_DEFERRED_OPERATION_KHR().get();
        try {
             method.invokeExact(
                device.memorySegment(),
                operation,
                pAllocator
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkDestroyDeferredOperationKHR].
    public static void vkDestroyDeferredOperationKHR(
    	VkDevice device,
    	@Nullable VkDeferredOperationKHR operation,
    	@Nullable VkAllocationCallbacks pAllocator
    ) {
    	vkDestroyDeferredOperationKHR(
    		device,
    		operation == null ? MemorySegment.NULL : operation.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment()
    	);
    }
    
    public static int vkGetDeferredOperationMaxConcurrencyKHR(
        VkDevice device,
    	MemorySegment operation
    ) {
        MethodHandle method = device.VK_GET_DEFERRED_OPERATION_MAX_CONCURRENCY_KHR().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                operation
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetDeferredOperationMaxConcurrencyKHR].
    public static int vkGetDeferredOperationMaxConcurrencyKHR(
    	VkDevice device,
    	VkDeferredOperationKHR operation
    ) {
    	return vkGetDeferredOperationMaxConcurrencyKHR(
    		device,
    		operation.memorySegment()
    	);
    }
    
    public static int vkGetDeferredOperationResultKHR(
        VkDevice device,
    	MemorySegment operation
    ) {
        MethodHandle method = device.VK_GET_DEFERRED_OPERATION_RESULT_KHR().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                operation
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetDeferredOperationResultKHR].
    public static int vkGetDeferredOperationResultKHR(
    	VkDevice device,
    	VkDeferredOperationKHR operation
    ) {
    	return vkGetDeferredOperationResultKHR(
    		device,
    		operation.memorySegment()
    	);
    }
    
    public static int vkDeferredOperationJoinKHR(
        VkDevice device,
    	MemorySegment operation
    ) {
        MethodHandle method = device.VK_DEFERRED_OPERATION_JOIN_KHR().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                operation
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkDeferredOperationJoinKHR].
    public static int vkDeferredOperationJoinKHR(
    	VkDevice device,
    	VkDeferredOperationKHR operation
    ) {
    	return vkDeferredOperationJoinKHR(
    		device,
    		operation.memorySegment()
    	);
    }
    
    public static int vkGetPipelineExecutablePropertiesKHR(
        VkDevice device,
    	MemorySegment pPipelineInfo,
    	MemorySegment pExecutableCount,
    	MemorySegment pProperties
    ) {
        MethodHandle method = device.VK_GET_PIPELINE_EXECUTABLE_PROPERTIES_KHR().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                pPipelineInfo,
                pExecutableCount,
                pProperties
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetPipelineExecutablePropertiesKHR].
    public static int vkGetPipelineExecutablePropertiesKHR(
    	VkDevice device,
    	VkPipelineInfoKHR pPipelineInfo,
    	NativeIntArray pExecutableCount,
    	@Nullable NativeStructArray<VkPipelineExecutablePropertiesKHR> pProperties
    ) {
    	return vkGetPipelineExecutablePropertiesKHR(
    		device,
    		pPipelineInfo.memorySegment(),
    		pExecutableCount.memorySegment(),
    		pProperties == null ? MemorySegment.NULL : pProperties.memorySegment()
    	);
    }
    
    public static int vkGetPipelineExecutableStatisticsKHR(
        VkDevice device,
    	MemorySegment pExecutableInfo,
    	MemorySegment pStatisticCount,
    	MemorySegment pStatistics
    ) {
        MethodHandle method = device.VK_GET_PIPELINE_EXECUTABLE_STATISTICS_KHR().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                pExecutableInfo,
                pStatisticCount,
                pStatistics
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetPipelineExecutableStatisticsKHR].
    public static int vkGetPipelineExecutableStatisticsKHR(
    	VkDevice device,
    	VkPipelineExecutableInfoKHR pExecutableInfo,
    	NativeIntArray pStatisticCount,
    	@Nullable NativeStructArray<VkPipelineExecutableStatisticKHR> pStatistics
    ) {
    	return vkGetPipelineExecutableStatisticsKHR(
    		device,
    		pExecutableInfo.memorySegment(),
    		pStatisticCount.memorySegment(),
    		pStatistics == null ? MemorySegment.NULL : pStatistics.memorySegment()
    	);
    }
    
    public static int vkGetPipelineExecutableInternalRepresentationsKHR(
        VkDevice device,
    	MemorySegment pExecutableInfo,
    	MemorySegment pInternalRepresentationCount,
    	MemorySegment pInternalRepresentations
    ) {
        MethodHandle method = device.VK_GET_PIPELINE_EXECUTABLE_INTERNAL_REPRESENTATIONS_KHR().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                pExecutableInfo,
                pInternalRepresentationCount,
                pInternalRepresentations
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetPipelineExecutableInternalRepresentationsKHR].
    public static int vkGetPipelineExecutableInternalRepresentationsKHR(
    	VkDevice device,
    	VkPipelineExecutableInfoKHR pExecutableInfo,
    	NativeIntArray pInternalRepresentationCount,
    	@Nullable NativeStructArray<VkPipelineExecutableInternalRepresentationKHR> pInternalRepresentations
    ) {
    	return vkGetPipelineExecutableInternalRepresentationsKHR(
    		device,
    		pExecutableInfo.memorySegment(),
    		pInternalRepresentationCount.memorySegment(),
    		pInternalRepresentations == null ? MemorySegment.NULL : pInternalRepresentations.memorySegment()
    	);
    }
    
    public static int vkGetPhysicalDeviceVideoEncodeQualityLevelPropertiesKHR(
        VkPhysicalDevice physicalDevice,
    	MemorySegment pQualityLevelInfo,
    	MemorySegment pQualityLevelProperties
    ) {
        MethodHandle method = physicalDevice.VK_GET_PHYSICAL_DEVICE_VIDEO_ENCODE_QUALITY_LEVEL_PROPERTIES_KHR().get();
        try {
            return (int) method.invokeExact(
                physicalDevice.memorySegment(),
                pQualityLevelInfo,
                pQualityLevelProperties
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetPhysicalDeviceVideoEncodeQualityLevelPropertiesKHR].
    public static int vkGetPhysicalDeviceVideoEncodeQualityLevelPropertiesKHR(
    	VkPhysicalDevice physicalDevice,
    	VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR pQualityLevelInfo,
    	VkVideoEncodeQualityLevelPropertiesKHR pQualityLevelProperties
    ) {
    	return vkGetPhysicalDeviceVideoEncodeQualityLevelPropertiesKHR(
    		physicalDevice,
    		pQualityLevelInfo.memorySegment(),
    		pQualityLevelProperties.memorySegment()
    	);
    }
    
    public static int vkGetEncodedVideoSessionParametersKHR(
        VkDevice device,
    	MemorySegment pVideoSessionParametersInfo,
    	MemorySegment pFeedbackInfo,
    	MemorySegment pDataSize,
    	MemorySegment pData
    ) {
        MethodHandle method = device.VK_GET_ENCODED_VIDEO_SESSION_PARAMETERS_KHR().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                pVideoSessionParametersInfo,
                pFeedbackInfo,
                pDataSize,
                pData
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetEncodedVideoSessionParametersKHR].
    public static int vkGetEncodedVideoSessionParametersKHR(
    	VkDevice device,
    	VkVideoEncodeSessionParametersGetInfoKHR pVideoSessionParametersInfo,
    	@Nullable VkVideoEncodeSessionParametersFeedbackInfoKHR pFeedbackInfo,
    	NativeLongArray pDataSize,
    	@Nullable MemorySegment pData
    ) {
    	return vkGetEncodedVideoSessionParametersKHR(
    		device,
    		pVideoSessionParametersInfo.memorySegment(),
    		pFeedbackInfo == null ? MemorySegment.NULL : pFeedbackInfo.memorySegment(),
    		pDataSize.memorySegment(),
    		pData
    	);
    }
    
    public static void vkCmdEncodeVideoKHR(
        VkCommandBuffer commandBuffer,
    	MemorySegment pEncodeInfo
    ) {
        MethodHandle method = commandBuffer.VK_CMD_ENCODE_VIDEO_KHR().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                pEncodeInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdEncodeVideoKHR].
    public static void vkCmdEncodeVideoKHR(
    	VkCommandBuffer commandBuffer,
    	VkVideoEncodeInfoKHR pEncodeInfo
    ) {
    	vkCmdEncodeVideoKHR(
    		commandBuffer,
    		pEncodeInfo.memorySegment()
    	);
    }
    
    public static void vkCmdBindIndexBuffer3KHR(
        VkCommandBuffer commandBuffer,
    	MemorySegment pInfo
    ) {
        MethodHandle method = commandBuffer.VK_CMD_BIND_INDEX_BUFFER3_KHR().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                pInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdBindIndexBuffer3KHR].
    public static void vkCmdBindIndexBuffer3KHR(
    	VkCommandBuffer commandBuffer,
    	VkBindIndexBuffer3InfoKHR pInfo
    ) {
    	vkCmdBindIndexBuffer3KHR(
    		commandBuffer,
    		pInfo.memorySegment()
    	);
    }
    
    public static void vkCmdBindVertexBuffers3KHR(
        VkCommandBuffer commandBuffer,
    	int firstBinding,
    	int bindingCount,
    	MemorySegment pBindingInfos
    ) {
        MethodHandle method = commandBuffer.VK_CMD_BIND_VERTEX_BUFFERS3_KHR().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                firstBinding,
                bindingCount,
                pBindingInfos
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdBindVertexBuffers3KHR].
    public static void vkCmdBindVertexBuffers3KHR(
    	VkCommandBuffer commandBuffer,
    	int firstBinding,
    	int bindingCount,
    	NativeStructArray<VkBindVertexBuffer3InfoKHR> pBindingInfos
    ) {
    	vkCmdBindVertexBuffers3KHR(
    		commandBuffer,
    		firstBinding,
    		bindingCount,
    		pBindingInfos.memorySegment()
    	);
    }
    
    public static void vkCmdDrawIndirect2KHR(
        VkCommandBuffer commandBuffer,
    	MemorySegment pInfo
    ) {
        MethodHandle method = commandBuffer.VK_CMD_DRAW_INDIRECT2_KHR().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                pInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdDrawIndirect2KHR].
    public static void vkCmdDrawIndirect2KHR(
    	VkCommandBuffer commandBuffer,
    	VkDrawIndirect2InfoKHR pInfo
    ) {
    	vkCmdDrawIndirect2KHR(
    		commandBuffer,
    		pInfo.memorySegment()
    	);
    }
    
    public static void vkCmdDrawIndexedIndirect2KHR(
        VkCommandBuffer commandBuffer,
    	MemorySegment pInfo
    ) {
        MethodHandle method = commandBuffer.VK_CMD_DRAW_INDEXED_INDIRECT2_KHR().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                pInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdDrawIndexedIndirect2KHR].
    public static void vkCmdDrawIndexedIndirect2KHR(
    	VkCommandBuffer commandBuffer,
    	VkDrawIndirect2InfoKHR pInfo
    ) {
    	vkCmdDrawIndexedIndirect2KHR(
    		commandBuffer,
    		pInfo.memorySegment()
    	);
    }
    
    public static void vkCmdDispatchIndirect2KHR(
        VkCommandBuffer commandBuffer,
    	MemorySegment pInfo
    ) {
        MethodHandle method = commandBuffer.VK_CMD_DISPATCH_INDIRECT2_KHR().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                pInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdDispatchIndirect2KHR].
    public static void vkCmdDispatchIndirect2KHR(
    	VkCommandBuffer commandBuffer,
    	VkDispatchIndirect2InfoKHR pInfo
    ) {
    	vkCmdDispatchIndirect2KHR(
    		commandBuffer,
    		pInfo.memorySegment()
    	);
    }
    
    public static void vkCmdCopyMemoryKHR(
        VkCommandBuffer commandBuffer,
    	MemorySegment pCopyMemoryInfo
    ) {
        MethodHandle method = commandBuffer.VK_CMD_COPY_MEMORY_KHR().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                pCopyMemoryInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdCopyMemoryKHR].
    public static void vkCmdCopyMemoryKHR(
    	VkCommandBuffer commandBuffer,
    	@Nullable VkCopyDeviceMemoryInfoKHR pCopyMemoryInfo
    ) {
    	vkCmdCopyMemoryKHR(
    		commandBuffer,
    		pCopyMemoryInfo == null ? MemorySegment.NULL : pCopyMemoryInfo.memorySegment()
    	);
    }
    
    public static void vkCmdCopyMemoryToImageKHR(
        VkCommandBuffer commandBuffer,
    	MemorySegment pCopyMemoryInfo
    ) {
        MethodHandle method = commandBuffer.VK_CMD_COPY_MEMORY_TO_IMAGE_KHR().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                pCopyMemoryInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdCopyMemoryToImageKHR].
    public static void vkCmdCopyMemoryToImageKHR(
    	VkCommandBuffer commandBuffer,
    	@Nullable VkCopyDeviceMemoryImageInfoKHR pCopyMemoryInfo
    ) {
    	vkCmdCopyMemoryToImageKHR(
    		commandBuffer,
    		pCopyMemoryInfo == null ? MemorySegment.NULL : pCopyMemoryInfo.memorySegment()
    	);
    }
    
    public static void vkCmdCopyImageToMemoryKHR(
        VkCommandBuffer commandBuffer,
    	MemorySegment pCopyMemoryInfo
    ) {
        MethodHandle method = commandBuffer.VK_CMD_COPY_IMAGE_TO_MEMORY_KHR().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                pCopyMemoryInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdCopyImageToMemoryKHR].
    public static void vkCmdCopyImageToMemoryKHR(
    	VkCommandBuffer commandBuffer,
    	@Nullable VkCopyDeviceMemoryImageInfoKHR pCopyMemoryInfo
    ) {
    	vkCmdCopyImageToMemoryKHR(
    		commandBuffer,
    		pCopyMemoryInfo == null ? MemorySegment.NULL : pCopyMemoryInfo.memorySegment()
    	);
    }
    
    public static void vkCmdUpdateMemoryKHR(
        VkCommandBuffer commandBuffer,
    	MemorySegment pDstRange,
    	int dstFlags,
    	long dataSize,
    	MemorySegment pData
    ) {
        MethodHandle method = commandBuffer.VK_CMD_UPDATE_MEMORY_KHR().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                pDstRange,
                dstFlags,
                dataSize,
                pData
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdUpdateMemoryKHR].
    public static void vkCmdUpdateMemoryKHR(
    	VkCommandBuffer commandBuffer,
    	VkDeviceAddressRangeKHR pDstRange,
    	int dstFlags,
    	long dataSize,
    	MemorySegment pData
    ) {
    	vkCmdUpdateMemoryKHR(
    		commandBuffer,
    		pDstRange.memorySegment(),
    		dstFlags,
    		dataSize,
    		pData
    	);
    }
    
    public static void vkCmdFillMemoryKHR(
        VkCommandBuffer commandBuffer,
    	MemorySegment pDstRange,
    	int dstFlags,
    	int data
    ) {
        MethodHandle method = commandBuffer.VK_CMD_FILL_MEMORY_KHR().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                pDstRange,
                dstFlags,
                data
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdFillMemoryKHR].
    public static void vkCmdFillMemoryKHR(
    	VkCommandBuffer commandBuffer,
    	VkDeviceAddressRangeKHR pDstRange,
    	int dstFlags,
    	int data
    ) {
    	vkCmdFillMemoryKHR(
    		commandBuffer,
    		pDstRange.memorySegment(),
    		dstFlags,
    		data
    	);
    }
    
    public static void vkCmdCopyQueryPoolResultsToMemoryKHR(
        VkCommandBuffer commandBuffer,
    	MemorySegment queryPool,
    	int firstQuery,
    	int queryCount,
    	MemorySegment pDstRange,
    	int dstFlags,
    	int queryResultFlags
    ) {
        MethodHandle method = commandBuffer.VK_CMD_COPY_QUERY_POOL_RESULTS_TO_MEMORY_KHR().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                queryPool,
                firstQuery,
                queryCount,
                pDstRange,
                dstFlags,
                queryResultFlags
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdCopyQueryPoolResultsToMemoryKHR].
    public static void vkCmdCopyQueryPoolResultsToMemoryKHR(
    	VkCommandBuffer commandBuffer,
    	VkQueryPool queryPool,
    	int firstQuery,
    	int queryCount,
    	VkStridedDeviceAddressRangeKHR pDstRange,
    	int dstFlags,
    	int queryResultFlags
    ) {
    	vkCmdCopyQueryPoolResultsToMemoryKHR(
    		commandBuffer,
    		queryPool.memorySegment(),
    		firstQuery,
    		queryCount,
    		pDstRange.memorySegment(),
    		dstFlags,
    		queryResultFlags
    	);
    }
    
    public static void vkCmdDrawIndirectCount2KHR(
        VkCommandBuffer commandBuffer,
    	MemorySegment pInfo
    ) {
        MethodHandle method = commandBuffer.VK_CMD_DRAW_INDIRECT_COUNT2_KHR().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                pInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdDrawIndirectCount2KHR].
    public static void vkCmdDrawIndirectCount2KHR(
    	VkCommandBuffer commandBuffer,
    	VkDrawIndirectCount2InfoKHR pInfo
    ) {
    	vkCmdDrawIndirectCount2KHR(
    		commandBuffer,
    		pInfo.memorySegment()
    	);
    }
    
    public static void vkCmdDrawIndexedIndirectCount2KHR(
        VkCommandBuffer commandBuffer,
    	MemorySegment pInfo
    ) {
        MethodHandle method = commandBuffer.VK_CMD_DRAW_INDEXED_INDIRECT_COUNT2_KHR().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                pInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdDrawIndexedIndirectCount2KHR].
    public static void vkCmdDrawIndexedIndirectCount2KHR(
    	VkCommandBuffer commandBuffer,
    	VkDrawIndirectCount2InfoKHR pInfo
    ) {
    	vkCmdDrawIndexedIndirectCount2KHR(
    		commandBuffer,
    		pInfo.memorySegment()
    	);
    }
    
    public static void vkCmdBeginConditionalRendering2EXT(
        VkCommandBuffer commandBuffer,
    	MemorySegment pConditionalRenderingBegin
    ) {
        MethodHandle method = commandBuffer.VK_CMD_BEGIN_CONDITIONAL_RENDERING2_EXT().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                pConditionalRenderingBegin
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdBeginConditionalRendering2EXT].
    public static void vkCmdBeginConditionalRendering2EXT(
    	VkCommandBuffer commandBuffer,
    	VkConditionalRenderingBeginInfo2EXT pConditionalRenderingBegin
    ) {
    	vkCmdBeginConditionalRendering2EXT(
    		commandBuffer,
    		pConditionalRenderingBegin.memorySegment()
    	);
    }
    
    public static void vkCmdBindTransformFeedbackBuffers2EXT(
        VkCommandBuffer commandBuffer,
    	int firstBinding,
    	int bindingCount,
    	MemorySegment pBindingInfos
    ) {
        MethodHandle method = commandBuffer.VK_CMD_BIND_TRANSFORM_FEEDBACK_BUFFERS2_EXT().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                firstBinding,
                bindingCount,
                pBindingInfos
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdBindTransformFeedbackBuffers2EXT].
    public static void vkCmdBindTransformFeedbackBuffers2EXT(
    	VkCommandBuffer commandBuffer,
    	int firstBinding,
    	int bindingCount,
    	@Nullable NativeStructArray<VkBindTransformFeedbackBuffer2InfoEXT> pBindingInfos
    ) {
    	vkCmdBindTransformFeedbackBuffers2EXT(
    		commandBuffer,
    		firstBinding,
    		bindingCount,
    		pBindingInfos == null ? MemorySegment.NULL : pBindingInfos.memorySegment()
    	);
    }
    
    public static void vkCmdBeginTransformFeedback2EXT(
        VkCommandBuffer commandBuffer,
    	int firstCounterRange,
    	int counterRangeCount,
    	MemorySegment pCounterInfos
    ) {
        MethodHandle method = commandBuffer.VK_CMD_BEGIN_TRANSFORM_FEEDBACK2_EXT().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                firstCounterRange,
                counterRangeCount,
                pCounterInfos
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdBeginTransformFeedback2EXT].
    public static void vkCmdBeginTransformFeedback2EXT(
    	VkCommandBuffer commandBuffer,
    	int firstCounterRange,
    	int counterRangeCount,
    	@Nullable NativeStructArray<VkBindTransformFeedbackBuffer2InfoEXT> pCounterInfos
    ) {
    	vkCmdBeginTransformFeedback2EXT(
    		commandBuffer,
    		firstCounterRange,
    		counterRangeCount,
    		pCounterInfos == null ? MemorySegment.NULL : pCounterInfos.memorySegment()
    	);
    }
    
    public static void vkCmdEndTransformFeedback2EXT(
        VkCommandBuffer commandBuffer,
    	int firstCounterRange,
    	int counterRangeCount,
    	MemorySegment pCounterInfos
    ) {
        MethodHandle method = commandBuffer.VK_CMD_END_TRANSFORM_FEEDBACK2_EXT().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                firstCounterRange,
                counterRangeCount,
                pCounterInfos
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdEndTransformFeedback2EXT].
    public static void vkCmdEndTransformFeedback2EXT(
    	VkCommandBuffer commandBuffer,
    	int firstCounterRange,
    	int counterRangeCount,
    	@Nullable NativeStructArray<VkBindTransformFeedbackBuffer2InfoEXT> pCounterInfos
    ) {
    	vkCmdEndTransformFeedback2EXT(
    		commandBuffer,
    		firstCounterRange,
    		counterRangeCount,
    		pCounterInfos == null ? MemorySegment.NULL : pCounterInfos.memorySegment()
    	);
    }
    
    public static void vkCmdDrawIndirectByteCount2EXT(
        VkCommandBuffer commandBuffer,
    	int instanceCount,
    	int firstInstance,
    	MemorySegment pCounterInfo,
    	int counterOffset,
    	int vertexStride
    ) {
        MethodHandle method = commandBuffer.VK_CMD_DRAW_INDIRECT_BYTE_COUNT2_EXT().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                instanceCount,
                firstInstance,
                pCounterInfo,
                counterOffset,
                vertexStride
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdDrawIndirectByteCount2EXT].
    public static void vkCmdDrawIndirectByteCount2EXT(
    	VkCommandBuffer commandBuffer,
    	int instanceCount,
    	int firstInstance,
    	VkBindTransformFeedbackBuffer2InfoEXT pCounterInfo,
    	int counterOffset,
    	int vertexStride
    ) {
    	vkCmdDrawIndirectByteCount2EXT(
    		commandBuffer,
    		instanceCount,
    		firstInstance,
    		pCounterInfo.memorySegment(),
    		counterOffset,
    		vertexStride
    	);
    }
    
    public static void vkCmdDrawMeshTasksIndirect2EXT(
        VkCommandBuffer commandBuffer,
    	MemorySegment pInfo
    ) {
        MethodHandle method = commandBuffer.VK_CMD_DRAW_MESH_TASKS_INDIRECT2_EXT().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                pInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdDrawMeshTasksIndirect2EXT].
    public static void vkCmdDrawMeshTasksIndirect2EXT(
    	VkCommandBuffer commandBuffer,
    	VkDrawIndirect2InfoKHR pInfo
    ) {
    	vkCmdDrawMeshTasksIndirect2EXT(
    		commandBuffer,
    		pInfo.memorySegment()
    	);
    }
    
    public static void vkCmdDrawMeshTasksIndirectCount2EXT(
        VkCommandBuffer commandBuffer,
    	MemorySegment pInfo
    ) {
        MethodHandle method = commandBuffer.VK_CMD_DRAW_MESH_TASKS_INDIRECT_COUNT2_EXT().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                pInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdDrawMeshTasksIndirectCount2EXT].
    public static void vkCmdDrawMeshTasksIndirectCount2EXT(
    	VkCommandBuffer commandBuffer,
    	VkDrawIndirectCount2InfoKHR pInfo
    ) {
    	vkCmdDrawMeshTasksIndirectCount2EXT(
    		commandBuffer,
    		pInfo.memorySegment()
    	);
    }
    
    public static void vkCmdWriteMarkerToMemoryAMD(
        VkCommandBuffer commandBuffer,
    	MemorySegment pInfo
    ) {
        MethodHandle method = commandBuffer.VK_CMD_WRITE_MARKER_TO_MEMORY_AMD().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                pInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdWriteMarkerToMemoryAMD].
    public static void vkCmdWriteMarkerToMemoryAMD(
    	VkCommandBuffer commandBuffer,
    	VkMemoryMarkerInfoAMD pInfo
    ) {
    	vkCmdWriteMarkerToMemoryAMD(
    		commandBuffer,
    		pInfo.memorySegment()
    	);
    }
    
    public static int vkCreateAccelerationStructure2KHR(
        VkDevice device,
    	MemorySegment pCreateInfo,
    	MemorySegment pAllocator,
    	MemorySegment pAccelerationStructure
    ) {
        MethodHandle method = device.VK_CREATE_ACCELERATION_STRUCTURE2_KHR().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                pCreateInfo,
                pAllocator,
                pAccelerationStructure
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCreateAccelerationStructure2KHR].
    public static int vkCreateAccelerationStructure2KHR(
    	VkDevice device,
    	VkAccelerationStructureCreateInfo2KHR pCreateInfo,
    	@Nullable VkAllocationCallbacks pAllocator,
    	NativePointerArray pAccelerationStructure
    ) {
    	return vkCreateAccelerationStructure2KHR(
    		device,
    		pCreateInfo.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment(),
    		pAccelerationStructure.memorySegment()
    	);
    }
    
    public static void vkCmdTraceRaysIndirect2KHR(
        VkCommandBuffer commandBuffer,
    	long indirectDeviceAddress
    ) {
        MethodHandle method = commandBuffer.VK_CMD_TRACE_RAYS_INDIRECT2_KHR().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                indirectDeviceAddress
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    
    public static int vkWaitForPresent2KHR(
        VkDevice device,
    	MemorySegment swapchain,
    	MemorySegment pPresentWait2Info
    ) {
        MethodHandle method = device.VK_WAIT_FOR_PRESENT2_KHR().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                swapchain,
                pPresentWait2Info
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkWaitForPresent2KHR].
    public static int vkWaitForPresent2KHR(
    	VkDevice device,
    	VkSwapchainKHR swapchain,
    	VkPresentWait2InfoKHR pPresentWait2Info
    ) {
    	return vkWaitForPresent2KHR(
    		device,
    		swapchain.memorySegment(),
    		pPresentWait2Info.memorySegment()
    	);
    }
    
    public static int vkCreatePipelineBinariesKHR(
        VkDevice device,
    	MemorySegment pCreateInfo,
    	MemorySegment pAllocator,
    	MemorySegment pBinaries
    ) {
        MethodHandle method = device.VK_CREATE_PIPELINE_BINARIES_KHR().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                pCreateInfo,
                pAllocator,
                pBinaries
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCreatePipelineBinariesKHR].
    public static int vkCreatePipelineBinariesKHR(
    	VkDevice device,
    	VkPipelineBinaryCreateInfoKHR pCreateInfo,
    	@Nullable VkAllocationCallbacks pAllocator,
    	VkPipelineBinaryHandlesInfoKHR pBinaries
    ) {
    	return vkCreatePipelineBinariesKHR(
    		device,
    		pCreateInfo.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment(),
    		pBinaries.memorySegment()
    	);
    }
    
    public static void vkDestroyPipelineBinaryKHR(
        VkDevice device,
    	MemorySegment pipelineBinary,
    	MemorySegment pAllocator
    ) {
        MethodHandle method = device.VK_DESTROY_PIPELINE_BINARY_KHR().get();
        try {
             method.invokeExact(
                device.memorySegment(),
                pipelineBinary,
                pAllocator
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkDestroyPipelineBinaryKHR].
    public static void vkDestroyPipelineBinaryKHR(
    	VkDevice device,
    	@Nullable VkPipelineBinaryKHR pipelineBinary,
    	@Nullable VkAllocationCallbacks pAllocator
    ) {
    	vkDestroyPipelineBinaryKHR(
    		device,
    		pipelineBinary == null ? MemorySegment.NULL : pipelineBinary.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment()
    	);
    }
    
    public static int vkGetPipelineKeyKHR(
        VkDevice device,
    	MemorySegment pPipelineCreateInfo,
    	MemorySegment pPipelineKey
    ) {
        MethodHandle method = device.VK_GET_PIPELINE_KEY_KHR().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                pPipelineCreateInfo,
                pPipelineKey
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetPipelineKeyKHR].
    public static int vkGetPipelineKeyKHR(
    	VkDevice device,
    	@Nullable VkPipelineCreateInfoKHR pPipelineCreateInfo,
    	VkPipelineBinaryKeyKHR pPipelineKey
    ) {
    	return vkGetPipelineKeyKHR(
    		device,
    		pPipelineCreateInfo == null ? MemorySegment.NULL : pPipelineCreateInfo.memorySegment(),
    		pPipelineKey.memorySegment()
    	);
    }
    
    public static int vkGetPipelineBinaryDataKHR(
        VkDevice device,
    	MemorySegment pInfo,
    	MemorySegment pPipelineBinaryKey,
    	MemorySegment pPipelineBinaryDataSize,
    	MemorySegment pPipelineBinaryData
    ) {
        MethodHandle method = device.VK_GET_PIPELINE_BINARY_DATA_KHR().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                pInfo,
                pPipelineBinaryKey,
                pPipelineBinaryDataSize,
                pPipelineBinaryData
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetPipelineBinaryDataKHR].
    public static int vkGetPipelineBinaryDataKHR(
    	VkDevice device,
    	VkPipelineBinaryDataInfoKHR pInfo,
    	VkPipelineBinaryKeyKHR pPipelineBinaryKey,
    	NativeLongArray pPipelineBinaryDataSize,
    	@Nullable MemorySegment pPipelineBinaryData
    ) {
    	return vkGetPipelineBinaryDataKHR(
    		device,
    		pInfo.memorySegment(),
    		pPipelineBinaryKey.memorySegment(),
    		pPipelineBinaryDataSize.memorySegment(),
    		pPipelineBinaryData
    	);
    }
    
    public static int vkReleaseCapturedPipelineDataKHR(
        VkDevice device,
    	MemorySegment pInfo,
    	MemorySegment pAllocator
    ) {
        MethodHandle method = device.VK_RELEASE_CAPTURED_PIPELINE_DATA_KHR().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                pInfo,
                pAllocator
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkReleaseCapturedPipelineDataKHR].
    public static int vkReleaseCapturedPipelineDataKHR(
    	VkDevice device,
    	VkReleaseCapturedPipelineDataInfoKHR pInfo,
    	@Nullable VkAllocationCallbacks pAllocator
    ) {
    	return vkReleaseCapturedPipelineDataKHR(
    		device,
    		pInfo.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment()
    	);
    }
    
    public static int vkReleaseSwapchainImagesKHR(
        VkDevice device,
    	MemorySegment pReleaseInfo
    ) {
        MethodHandle method = device.VK_RELEASE_SWAPCHAIN_IMAGES_KHR().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                pReleaseInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkReleaseSwapchainImagesKHR].
    public static int vkReleaseSwapchainImagesKHR(
    	VkDevice device,
    	VkReleaseSwapchainImagesInfoKHR pReleaseInfo
    ) {
    	return vkReleaseSwapchainImagesKHR(
    		device,
    		pReleaseInfo.memorySegment()
    	);
    }
    
    public static int vkGetPhysicalDeviceCooperativeMatrixPropertiesKHR(
        VkPhysicalDevice physicalDevice,
    	MemorySegment pPropertyCount,
    	MemorySegment pProperties
    ) {
        MethodHandle method = physicalDevice.VK_GET_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_PROPERTIES_KHR().get();
        try {
            return (int) method.invokeExact(
                physicalDevice.memorySegment(),
                pPropertyCount,
                pProperties
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetPhysicalDeviceCooperativeMatrixPropertiesKHR].
    public static int vkGetPhysicalDeviceCooperativeMatrixPropertiesKHR(
    	VkPhysicalDevice physicalDevice,
    	NativeIntArray pPropertyCount,
    	@Nullable NativeStructArray<VkCooperativeMatrixPropertiesKHR> pProperties
    ) {
    	return vkGetPhysicalDeviceCooperativeMatrixPropertiesKHR(
    		physicalDevice,
    		pPropertyCount.memorySegment(),
    		pProperties == null ? MemorySegment.NULL : pProperties.memorySegment()
    	);
    }
    
    public static int vkGetPhysicalDeviceCalibrateableTimeDomainsKHR(
        VkPhysicalDevice physicalDevice,
    	MemorySegment pTimeDomainCount,
    	MemorySegment pTimeDomains
    ) {
        MethodHandle method = physicalDevice.VK_GET_PHYSICAL_DEVICE_CALIBRATEABLE_TIME_DOMAINS_KHR().get();
        try {
            return (int) method.invokeExact(
                physicalDevice.memorySegment(),
                pTimeDomainCount,
                pTimeDomains
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetPhysicalDeviceCalibrateableTimeDomainsKHR].
    public static int vkGetPhysicalDeviceCalibrateableTimeDomainsKHR(
    	VkPhysicalDevice physicalDevice,
    	NativeIntArray pTimeDomainCount,
    	@Nullable NativeIntArray pTimeDomains
    ) {
    	return vkGetPhysicalDeviceCalibrateableTimeDomainsKHR(
    		physicalDevice,
    		pTimeDomainCount.memorySegment(),
    		pTimeDomains == null ? MemorySegment.NULL : pTimeDomains.memorySegment()
    	);
    }
    
    public static int vkGetCalibratedTimestampsKHR(
        VkDevice device,
    	int timestampCount,
    	MemorySegment pTimestampInfos,
    	MemorySegment pTimestamps,
    	MemorySegment pMaxDeviation
    ) {
        MethodHandle method = device.VK_GET_CALIBRATED_TIMESTAMPS_KHR().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                timestampCount,
                pTimestampInfos,
                pTimestamps,
                pMaxDeviation
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetCalibratedTimestampsKHR].
    public static int vkGetCalibratedTimestampsKHR(
    	VkDevice device,
    	int timestampCount,
    	NativeStructArray<VkCalibratedTimestampInfoKHR> pTimestampInfos,
    	NativeLongArray pTimestamps,
    	NativeLongArray pMaxDeviation
    ) {
    	return vkGetCalibratedTimestampsKHR(
    		device,
    		timestampCount,
    		pTimestampInfos.memorySegment(),
    		pTimestamps.memorySegment(),
    		pMaxDeviation.memorySegment()
    	);
    }
    
    public static void vkCmdSetDescriptorBufferOffsets2EXT(
        VkCommandBuffer commandBuffer,
    	MemorySegment pSetDescriptorBufferOffsetsInfo
    ) {
        MethodHandle method = commandBuffer.VK_CMD_SET_DESCRIPTOR_BUFFER_OFFSETS2_EXT().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                pSetDescriptorBufferOffsetsInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdSetDescriptorBufferOffsets2EXT].
    public static void vkCmdSetDescriptorBufferOffsets2EXT(
    	VkCommandBuffer commandBuffer,
    	VkSetDescriptorBufferOffsetsInfoEXT pSetDescriptorBufferOffsetsInfo
    ) {
    	vkCmdSetDescriptorBufferOffsets2EXT(
    		commandBuffer,
    		pSetDescriptorBufferOffsetsInfo.memorySegment()
    	);
    }
    
    public static void vkCmdBindDescriptorBufferEmbeddedSamplers2EXT(
        VkCommandBuffer commandBuffer,
    	MemorySegment pBindDescriptorBufferEmbeddedSamplersInfo
    ) {
        MethodHandle method = commandBuffer.VK_CMD_BIND_DESCRIPTOR_BUFFER_EMBEDDED_SAMPLERS2_EXT().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                pBindDescriptorBufferEmbeddedSamplersInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdBindDescriptorBufferEmbeddedSamplers2EXT].
    public static void vkCmdBindDescriptorBufferEmbeddedSamplers2EXT(
    	VkCommandBuffer commandBuffer,
    	VkBindDescriptorBufferEmbeddedSamplersInfoEXT pBindDescriptorBufferEmbeddedSamplersInfo
    ) {
    	vkCmdBindDescriptorBufferEmbeddedSamplers2EXT(
    		commandBuffer,
    		pBindDescriptorBufferEmbeddedSamplersInfo.memorySegment()
    	);
    }
    
    public static void vkCmdCopyMemoryIndirectKHR(
        VkCommandBuffer commandBuffer,
    	MemorySegment pCopyMemoryIndirectInfo
    ) {
        MethodHandle method = commandBuffer.VK_CMD_COPY_MEMORY_INDIRECT_KHR().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                pCopyMemoryIndirectInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdCopyMemoryIndirectKHR].
    public static void vkCmdCopyMemoryIndirectKHR(
    	VkCommandBuffer commandBuffer,
    	VkCopyMemoryIndirectInfoKHR pCopyMemoryIndirectInfo
    ) {
    	vkCmdCopyMemoryIndirectKHR(
    		commandBuffer,
    		pCopyMemoryIndirectInfo.memorySegment()
    	);
    }
    
    public static void vkCmdCopyMemoryToImageIndirectKHR(
        VkCommandBuffer commandBuffer,
    	MemorySegment pCopyMemoryToImageIndirectInfo
    ) {
        MethodHandle method = commandBuffer.VK_CMD_COPY_MEMORY_TO_IMAGE_INDIRECT_KHR().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                pCopyMemoryToImageIndirectInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdCopyMemoryToImageIndirectKHR].
    public static void vkCmdCopyMemoryToImageIndirectKHR(
    	VkCommandBuffer commandBuffer,
    	VkCopyMemoryToImageIndirectInfoKHR pCopyMemoryToImageIndirectInfo
    ) {
    	vkCmdCopyMemoryToImageIndirectKHR(
    		commandBuffer,
    		pCopyMemoryToImageIndirectInfo.memorySegment()
    	);
    }
    
    public static int vkGetDeviceFaultReportsKHR(
        VkDevice device,
    	long timeout,
    	MemorySegment pFaultCounts,
    	MemorySegment pFaultInfo
    ) {
        MethodHandle method = device.VK_GET_DEVICE_FAULT_REPORTS_KHR().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                timeout,
                pFaultCounts,
                pFaultInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetDeviceFaultReportsKHR].
    public static int vkGetDeviceFaultReportsKHR(
    	VkDevice device,
    	long timeout,
    	NativeIntArray pFaultCounts,
    	@Nullable NativeStructArray<VkDeviceFaultInfoKHR> pFaultInfo
    ) {
    	return vkGetDeviceFaultReportsKHR(
    		device,
    		timeout,
    		pFaultCounts.memorySegment(),
    		pFaultInfo == null ? MemorySegment.NULL : pFaultInfo.memorySegment()
    	);
    }
    
    public static int vkGetDeviceFaultDebugInfoKHR(
        VkDevice device,
    	MemorySegment pDebugInfo
    ) {
        MethodHandle method = device.VK_GET_DEVICE_FAULT_DEBUG_INFO_KHR().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                pDebugInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetDeviceFaultDebugInfoKHR].
    public static int vkGetDeviceFaultDebugInfoKHR(
    	VkDevice device,
    	VkDeviceFaultDebugInfoKHR pDebugInfo
    ) {
    	return vkGetDeviceFaultDebugInfoKHR(
    		device,
    		pDebugInfo.memorySegment()
    	);
    }
    
    public static void vkCmdEndRendering2KHR(
        VkCommandBuffer commandBuffer,
    	MemorySegment pRenderingEndInfo
    ) {
        MethodHandle method = commandBuffer.VK_CMD_END_RENDERING2_KHR().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                pRenderingEndInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdEndRendering2KHR].
    public static void vkCmdEndRendering2KHR(
    	VkCommandBuffer commandBuffer,
    	@Nullable VkRenderingEndInfoKHR pRenderingEndInfo
    ) {
    	vkCmdEndRendering2KHR(
    		commandBuffer,
    		pRenderingEndInfo == null ? MemorySegment.NULL : pRenderingEndInfo.memorySegment()
    	);
    }
    
    public static int vkCreateDebugReportCallbackEXT(
        VkInstance instance,
    	MemorySegment pCreateInfo,
    	MemorySegment pAllocator,
    	MemorySegment pCallback
    ) {
        MethodHandle method = instance.VK_CREATE_DEBUG_REPORT_CALLBACK_EXT().get();
        try {
            return (int) method.invokeExact(
                instance.memorySegment(),
                pCreateInfo,
                pAllocator,
                pCallback
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCreateDebugReportCallbackEXT].
    public static int vkCreateDebugReportCallbackEXT(
    	VkInstance instance,
    	VkDebugReportCallbackCreateInfoEXT pCreateInfo,
    	@Nullable VkAllocationCallbacks pAllocator,
    	NativePointerArray pCallback
    ) {
    	return vkCreateDebugReportCallbackEXT(
    		instance,
    		pCreateInfo.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment(),
    		pCallback.memorySegment()
    	);
    }
    
    public static void vkDestroyDebugReportCallbackEXT(
        VkInstance instance,
    	MemorySegment callback,
    	MemorySegment pAllocator
    ) {
        MethodHandle method = instance.VK_DESTROY_DEBUG_REPORT_CALLBACK_EXT().get();
        try {
             method.invokeExact(
                instance.memorySegment(),
                callback,
                pAllocator
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkDestroyDebugReportCallbackEXT].
    public static void vkDestroyDebugReportCallbackEXT(
    	VkInstance instance,
    	@Nullable VkDebugReportCallbackEXT callback,
    	@Nullable VkAllocationCallbacks pAllocator
    ) {
    	vkDestroyDebugReportCallbackEXT(
    		instance,
    		callback == null ? MemorySegment.NULL : callback.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment()
    	);
    }
    
    public static void vkDebugReportMessageEXT(
        VkInstance instance,
    	int flags,
    	int objectType,
    	long object,
    	long location,
    	int messageCode,
    	MemorySegment pLayerPrefix,
    	MemorySegment pMessage
    ) {
        MethodHandle method = instance.VK_DEBUG_REPORT_MESSAGE_EXT().get();
        try {
             method.invokeExact(
                instance.memorySegment(),
                flags,
                objectType,
                object,
                location,
                messageCode,
                pLayerPrefix,
                pMessage
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkDebugReportMessageEXT].
    public static void vkDebugReportMessageEXT(
    	VkInstance instance,
    	int flags,
    	int objectType,
    	long object,
    	long location,
    	int messageCode,
    	String pLayerPrefix,
    	String pMessage
    ) {
    	try (Arena arena = MemoryStack.stackPush()) {
    		vkDebugReportMessageEXT(
    			instance,
    			flags,
    			objectType,
    			object,
    			location,
    			messageCode,
    			arena.allocateFrom(pLayerPrefix),
    			arena.allocateFrom(pMessage)
    		);
    	}
    }
    
    public static int vkDebugMarkerSetObjectTagEXT(
        VkDevice device,
    	MemorySegment pTagInfo
    ) {
        MethodHandle method = device.VK_DEBUG_MARKER_SET_OBJECT_TAG_EXT().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                pTagInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkDebugMarkerSetObjectTagEXT].
    public static int vkDebugMarkerSetObjectTagEXT(
    	VkDevice device,
    	VkDebugMarkerObjectTagInfoEXT pTagInfo
    ) {
    	return vkDebugMarkerSetObjectTagEXT(
    		device,
    		pTagInfo.memorySegment()
    	);
    }
    
    public static int vkDebugMarkerSetObjectNameEXT(
        VkDevice device,
    	MemorySegment pNameInfo
    ) {
        MethodHandle method = device.VK_DEBUG_MARKER_SET_OBJECT_NAME_EXT().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                pNameInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkDebugMarkerSetObjectNameEXT].
    public static int vkDebugMarkerSetObjectNameEXT(
    	VkDevice device,
    	VkDebugMarkerObjectNameInfoEXT pNameInfo
    ) {
    	return vkDebugMarkerSetObjectNameEXT(
    		device,
    		pNameInfo.memorySegment()
    	);
    }
    
    public static void vkCmdDebugMarkerBeginEXT(
        VkCommandBuffer commandBuffer,
    	MemorySegment pMarkerInfo
    ) {
        MethodHandle method = commandBuffer.VK_CMD_DEBUG_MARKER_BEGIN_EXT().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                pMarkerInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdDebugMarkerBeginEXT].
    public static void vkCmdDebugMarkerBeginEXT(
    	VkCommandBuffer commandBuffer,
    	VkDebugMarkerMarkerInfoEXT pMarkerInfo
    ) {
    	vkCmdDebugMarkerBeginEXT(
    		commandBuffer,
    		pMarkerInfo.memorySegment()
    	);
    }
    
    public static void vkCmdDebugMarkerEndEXT(
        VkCommandBuffer commandBuffer
    ) {
        MethodHandle method = commandBuffer.VK_CMD_DEBUG_MARKER_END_EXT().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    
    public static void vkCmdDebugMarkerInsertEXT(
        VkCommandBuffer commandBuffer,
    	MemorySegment pMarkerInfo
    ) {
        MethodHandle method = commandBuffer.VK_CMD_DEBUG_MARKER_INSERT_EXT().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                pMarkerInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdDebugMarkerInsertEXT].
    public static void vkCmdDebugMarkerInsertEXT(
    	VkCommandBuffer commandBuffer,
    	VkDebugMarkerMarkerInfoEXT pMarkerInfo
    ) {
    	vkCmdDebugMarkerInsertEXT(
    		commandBuffer,
    		pMarkerInfo.memorySegment()
    	);
    }
    
    public static void vkCmdBindTransformFeedbackBuffersEXT(
        VkCommandBuffer commandBuffer,
    	int firstBinding,
    	int bindingCount,
    	MemorySegment pBuffers,
    	MemorySegment pOffsets,
    	MemorySegment pSizes
    ) {
        MethodHandle method = commandBuffer.VK_CMD_BIND_TRANSFORM_FEEDBACK_BUFFERS_EXT().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                firstBinding,
                bindingCount,
                pBuffers,
                pOffsets,
                pSizes
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdBindTransformFeedbackBuffersEXT].
    public static void vkCmdBindTransformFeedbackBuffersEXT(
    	VkCommandBuffer commandBuffer,
    	int firstBinding,
    	int bindingCount,
    	NativePointerArray pBuffers,
    	NativeLongArray pOffsets,
    	@Nullable NativeLongArray pSizes
    ) {
    	vkCmdBindTransformFeedbackBuffersEXT(
    		commandBuffer,
    		firstBinding,
    		bindingCount,
    		pBuffers.memorySegment(),
    		pOffsets.memorySegment(),
    		pSizes == null ? MemorySegment.NULL : pSizes.memorySegment()
    	);
    }
    
    public static void vkCmdBeginTransformFeedbackEXT(
        VkCommandBuffer commandBuffer,
    	int firstCounterBuffer,
    	int counterBufferCount,
    	MemorySegment pCounterBuffers,
    	MemorySegment pCounterBufferOffsets
    ) {
        MethodHandle method = commandBuffer.VK_CMD_BEGIN_TRANSFORM_FEEDBACK_EXT().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                firstCounterBuffer,
                counterBufferCount,
                pCounterBuffers,
                pCounterBufferOffsets
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdBeginTransformFeedbackEXT].
    public static void vkCmdBeginTransformFeedbackEXT(
    	VkCommandBuffer commandBuffer,
    	int firstCounterBuffer,
    	int counterBufferCount,
    	@Nullable NativePointerArray pCounterBuffers,
    	@Nullable NativeLongArray pCounterBufferOffsets
    ) {
    	vkCmdBeginTransformFeedbackEXT(
    		commandBuffer,
    		firstCounterBuffer,
    		counterBufferCount,
    		pCounterBuffers == null ? MemorySegment.NULL : pCounterBuffers.memorySegment(),
    		pCounterBufferOffsets == null ? MemorySegment.NULL : pCounterBufferOffsets.memorySegment()
    	);
    }
    
    public static void vkCmdEndTransformFeedbackEXT(
        VkCommandBuffer commandBuffer,
    	int firstCounterBuffer,
    	int counterBufferCount,
    	MemorySegment pCounterBuffers,
    	MemorySegment pCounterBufferOffsets
    ) {
        MethodHandle method = commandBuffer.VK_CMD_END_TRANSFORM_FEEDBACK_EXT().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                firstCounterBuffer,
                counterBufferCount,
                pCounterBuffers,
                pCounterBufferOffsets
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdEndTransformFeedbackEXT].
    public static void vkCmdEndTransformFeedbackEXT(
    	VkCommandBuffer commandBuffer,
    	int firstCounterBuffer,
    	int counterBufferCount,
    	@Nullable NativePointerArray pCounterBuffers,
    	@Nullable NativeLongArray pCounterBufferOffsets
    ) {
    	vkCmdEndTransformFeedbackEXT(
    		commandBuffer,
    		firstCounterBuffer,
    		counterBufferCount,
    		pCounterBuffers == null ? MemorySegment.NULL : pCounterBuffers.memorySegment(),
    		pCounterBufferOffsets == null ? MemorySegment.NULL : pCounterBufferOffsets.memorySegment()
    	);
    }
    
    public static void vkCmdBeginQueryIndexedEXT(
        VkCommandBuffer commandBuffer,
    	MemorySegment queryPool,
    	int query,
    	int flags,
    	int index
    ) {
        MethodHandle method = commandBuffer.VK_CMD_BEGIN_QUERY_INDEXED_EXT().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                queryPool,
                query,
                flags,
                index
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdBeginQueryIndexedEXT].
    public static void vkCmdBeginQueryIndexedEXT(
    	VkCommandBuffer commandBuffer,
    	VkQueryPool queryPool,
    	int query,
    	int flags,
    	int index
    ) {
    	vkCmdBeginQueryIndexedEXT(
    		commandBuffer,
    		queryPool.memorySegment(),
    		query,
    		flags,
    		index
    	);
    }
    
    public static void vkCmdEndQueryIndexedEXT(
        VkCommandBuffer commandBuffer,
    	MemorySegment queryPool,
    	int query,
    	int index
    ) {
        MethodHandle method = commandBuffer.VK_CMD_END_QUERY_INDEXED_EXT().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                queryPool,
                query,
                index
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdEndQueryIndexedEXT].
    public static void vkCmdEndQueryIndexedEXT(
    	VkCommandBuffer commandBuffer,
    	VkQueryPool queryPool,
    	int query,
    	int index
    ) {
    	vkCmdEndQueryIndexedEXT(
    		commandBuffer,
    		queryPool.memorySegment(),
    		query,
    		index
    	);
    }
    
    public static void vkCmdDrawIndirectByteCountEXT(
        VkCommandBuffer commandBuffer,
    	int instanceCount,
    	int firstInstance,
    	MemorySegment counterBuffer,
    	long counterBufferOffset,
    	int counterOffset,
    	int vertexStride
    ) {
        MethodHandle method = commandBuffer.VK_CMD_DRAW_INDIRECT_BYTE_COUNT_EXT().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                instanceCount,
                firstInstance,
                counterBuffer,
                counterBufferOffset,
                counterOffset,
                vertexStride
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdDrawIndirectByteCountEXT].
    public static void vkCmdDrawIndirectByteCountEXT(
    	VkCommandBuffer commandBuffer,
    	int instanceCount,
    	int firstInstance,
    	VkBuffer counterBuffer,
    	long counterBufferOffset,
    	int counterOffset,
    	int vertexStride
    ) {
    	vkCmdDrawIndirectByteCountEXT(
    		commandBuffer,
    		instanceCount,
    		firstInstance,
    		counterBuffer.memorySegment(),
    		counterBufferOffset,
    		counterOffset,
    		vertexStride
    	);
    }
    
    public static int vkCreateCuModuleNVX(
        VkDevice device,
    	MemorySegment pCreateInfo,
    	MemorySegment pAllocator,
    	MemorySegment pModule
    ) {
        MethodHandle method = device.VK_CREATE_CU_MODULE_NVX().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                pCreateInfo,
                pAllocator,
                pModule
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCreateCuModuleNVX].
    public static int vkCreateCuModuleNVX(
    	VkDevice device,
    	VkCuModuleCreateInfoNVX pCreateInfo,
    	@Nullable VkAllocationCallbacks pAllocator,
    	NativePointerArray pModule
    ) {
    	return vkCreateCuModuleNVX(
    		device,
    		pCreateInfo.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment(),
    		pModule.memorySegment()
    	);
    }
    
    public static int vkCreateCuFunctionNVX(
        VkDevice device,
    	MemorySegment pCreateInfo,
    	MemorySegment pAllocator,
    	MemorySegment pFunction
    ) {
        MethodHandle method = device.VK_CREATE_CU_FUNCTION_NVX().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                pCreateInfo,
                pAllocator,
                pFunction
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCreateCuFunctionNVX].
    public static int vkCreateCuFunctionNVX(
    	VkDevice device,
    	VkCuFunctionCreateInfoNVX pCreateInfo,
    	@Nullable VkAllocationCallbacks pAllocator,
    	NativePointerArray pFunction
    ) {
    	return vkCreateCuFunctionNVX(
    		device,
    		pCreateInfo.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment(),
    		pFunction.memorySegment()
    	);
    }
    
    public static void vkDestroyCuModuleNVX(
        VkDevice device,
    	MemorySegment module,
    	MemorySegment pAllocator
    ) {
        MethodHandle method = device.VK_DESTROY_CU_MODULE_NVX().get();
        try {
             method.invokeExact(
                device.memorySegment(),
                module,
                pAllocator
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkDestroyCuModuleNVX].
    public static void vkDestroyCuModuleNVX(
    	VkDevice device,
    	VkCuModuleNVX module,
    	@Nullable VkAllocationCallbacks pAllocator
    ) {
    	vkDestroyCuModuleNVX(
    		device,
    		module.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment()
    	);
    }
    
    public static void vkDestroyCuFunctionNVX(
        VkDevice device,
    	MemorySegment function,
    	MemorySegment pAllocator
    ) {
        MethodHandle method = device.VK_DESTROY_CU_FUNCTION_NVX().get();
        try {
             method.invokeExact(
                device.memorySegment(),
                function,
                pAllocator
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkDestroyCuFunctionNVX].
    public static void vkDestroyCuFunctionNVX(
    	VkDevice device,
    	VkCuFunctionNVX function,
    	@Nullable VkAllocationCallbacks pAllocator
    ) {
    	vkDestroyCuFunctionNVX(
    		device,
    		function.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment()
    	);
    }
    
    public static void vkCmdCuLaunchKernelNVX(
        VkCommandBuffer commandBuffer,
    	MemorySegment pLaunchInfo
    ) {
        MethodHandle method = commandBuffer.VK_CMD_CU_LAUNCH_KERNEL_NVX().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                pLaunchInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdCuLaunchKernelNVX].
    public static void vkCmdCuLaunchKernelNVX(
    	VkCommandBuffer commandBuffer,
    	VkCuLaunchInfoNVX pLaunchInfo
    ) {
    	vkCmdCuLaunchKernelNVX(
    		commandBuffer,
    		pLaunchInfo.memorySegment()
    	);
    }
    
    public static int vkGetImageViewHandleNVX(
        VkDevice device,
    	MemorySegment pInfo
    ) {
        MethodHandle method = device.VK_GET_IMAGE_VIEW_HANDLE_NVX().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                pInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetImageViewHandleNVX].
    public static int vkGetImageViewHandleNVX(
    	VkDevice device,
    	VkImageViewHandleInfoNVX pInfo
    ) {
    	return vkGetImageViewHandleNVX(
    		device,
    		pInfo.memorySegment()
    	);
    }
    
    public static long vkGetImageViewHandle64NVX(
        VkDevice device,
    	MemorySegment pInfo
    ) {
        MethodHandle method = device.VK_GET_IMAGE_VIEW_HANDLE64_NVX().get();
        try {
            return (long) method.invokeExact(
                device.memorySegment(),
                pInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetImageViewHandle64NVX].
    public static long vkGetImageViewHandle64NVX(
    	VkDevice device,
    	VkImageViewHandleInfoNVX pInfo
    ) {
    	return vkGetImageViewHandle64NVX(
    		device,
    		pInfo.memorySegment()
    	);
    }
    
    public static int vkGetImageViewAddressNVX(
        VkDevice device,
    	MemorySegment imageView,
    	MemorySegment pProperties
    ) {
        MethodHandle method = device.VK_GET_IMAGE_VIEW_ADDRESS_NVX().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                imageView,
                pProperties
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetImageViewAddressNVX].
    public static int vkGetImageViewAddressNVX(
    	VkDevice device,
    	VkImageView imageView,
    	VkImageViewAddressPropertiesNVX pProperties
    ) {
    	return vkGetImageViewAddressNVX(
    		device,
    		imageView.memorySegment(),
    		pProperties.memorySegment()
    	);
    }
    
    public static long vkGetDeviceCombinedImageSamplerIndexNVX(
        VkDevice device,
    	long imageViewIndex,
    	long samplerIndex
    ) {
        MethodHandle method = device.VK_GET_DEVICE_COMBINED_IMAGE_SAMPLER_INDEX_NVX().get();
        try {
            return (long) method.invokeExact(
                device.memorySegment(),
                imageViewIndex,
                samplerIndex
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    
    public static int vkGetShaderInfoAMD(
        VkDevice device,
    	MemorySegment pipeline,
    	int shaderStage,
    	int infoType,
    	MemorySegment pInfoSize,
    	MemorySegment pInfo
    ) {
        MethodHandle method = device.VK_GET_SHADER_INFO_AMD().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                pipeline,
                shaderStage,
                infoType,
                pInfoSize,
                pInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetShaderInfoAMD].
    public static int vkGetShaderInfoAMD(
    	VkDevice device,
    	VkPipeline pipeline,
    	int shaderStage,
    	int infoType,
    	NativeLongArray pInfoSize,
    	@Nullable MemorySegment pInfo
    ) {
    	return vkGetShaderInfoAMD(
    		device,
    		pipeline.memorySegment(),
    		shaderStage,
    		infoType,
    		pInfoSize.memorySegment(),
    		pInfo
    	);
    }
    
    public static int vkGetPhysicalDeviceExternalImageFormatPropertiesNV(
        VkPhysicalDevice physicalDevice,
    	int format,
    	int type,
    	int tiling,
    	int usage,
    	int flags,
    	int externalHandleType,
    	MemorySegment pExternalImageFormatProperties
    ) {
        MethodHandle method = physicalDevice.VK_GET_PHYSICAL_DEVICE_EXTERNAL_IMAGE_FORMAT_PROPERTIES_NV().get();
        try {
            return (int) method.invokeExact(
                physicalDevice.memorySegment(),
                format,
                type,
                tiling,
                usage,
                flags,
                externalHandleType,
                pExternalImageFormatProperties
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetPhysicalDeviceExternalImageFormatPropertiesNV].
    public static int vkGetPhysicalDeviceExternalImageFormatPropertiesNV(
    	VkPhysicalDevice physicalDevice,
    	int format,
    	int type,
    	int tiling,
    	int usage,
    	int flags,
    	int externalHandleType,
    	VkExternalImageFormatPropertiesNV pExternalImageFormatProperties
    ) {
    	return vkGetPhysicalDeviceExternalImageFormatPropertiesNV(
    		physicalDevice,
    		format,
    		type,
    		tiling,
    		usage,
    		flags,
    		externalHandleType,
    		pExternalImageFormatProperties.memorySegment()
    	);
    }
    
    public static void vkCmdBeginConditionalRenderingEXT(
        VkCommandBuffer commandBuffer,
    	MemorySegment pConditionalRenderingBegin
    ) {
        MethodHandle method = commandBuffer.VK_CMD_BEGIN_CONDITIONAL_RENDERING_EXT().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                pConditionalRenderingBegin
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdBeginConditionalRenderingEXT].
    public static void vkCmdBeginConditionalRenderingEXT(
    	VkCommandBuffer commandBuffer,
    	VkConditionalRenderingBeginInfoEXT pConditionalRenderingBegin
    ) {
    	vkCmdBeginConditionalRenderingEXT(
    		commandBuffer,
    		pConditionalRenderingBegin.memorySegment()
    	);
    }
    
    public static void vkCmdEndConditionalRenderingEXT(
        VkCommandBuffer commandBuffer
    ) {
        MethodHandle method = commandBuffer.VK_CMD_END_CONDITIONAL_RENDERING_EXT().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    
    public static void vkCmdSetViewportWScalingNV(
        VkCommandBuffer commandBuffer,
    	int firstViewport,
    	int viewportCount,
    	MemorySegment pViewportWScalings
    ) {
        MethodHandle method = commandBuffer.VK_CMD_SET_VIEWPORT_WSCALING_NV().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                firstViewport,
                viewportCount,
                pViewportWScalings
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdSetViewportWScalingNV].
    public static void vkCmdSetViewportWScalingNV(
    	VkCommandBuffer commandBuffer,
    	int firstViewport,
    	int viewportCount,
    	NativeStructArray<VkViewportWScalingNV> pViewportWScalings
    ) {
    	vkCmdSetViewportWScalingNV(
    		commandBuffer,
    		firstViewport,
    		viewportCount,
    		pViewportWScalings.memorySegment()
    	);
    }
    
    public static int vkReleaseDisplayEXT(
        VkPhysicalDevice physicalDevice,
    	MemorySegment display
    ) {
        MethodHandle method = physicalDevice.VK_RELEASE_DISPLAY_EXT().get();
        try {
            return (int) method.invokeExact(
                physicalDevice.memorySegment(),
                display
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkReleaseDisplayEXT].
    public static int vkReleaseDisplayEXT(
    	VkPhysicalDevice physicalDevice,
    	VkDisplayKHR display
    ) {
    	return vkReleaseDisplayEXT(
    		physicalDevice,
    		display.memorySegment()
    	);
    }
    
    public static int vkGetPhysicalDeviceSurfaceCapabilities2EXT(
        VkPhysicalDevice physicalDevice,
    	MemorySegment surface,
    	MemorySegment pSurfaceCapabilities
    ) {
        MethodHandle method = physicalDevice.VK_GET_PHYSICAL_DEVICE_SURFACE_CAPABILITIES2_EXT().get();
        try {
            return (int) method.invokeExact(
                physicalDevice.memorySegment(),
                surface,
                pSurfaceCapabilities
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetPhysicalDeviceSurfaceCapabilities2EXT].
    public static int vkGetPhysicalDeviceSurfaceCapabilities2EXT(
    	VkPhysicalDevice physicalDevice,
    	VkSurfaceKHR surface,
    	VkSurfaceCapabilities2EXT pSurfaceCapabilities
    ) {
    	return vkGetPhysicalDeviceSurfaceCapabilities2EXT(
    		physicalDevice,
    		surface.memorySegment(),
    		pSurfaceCapabilities.memorySegment()
    	);
    }
    
    public static int vkDisplayPowerControlEXT(
        VkDevice device,
    	MemorySegment display,
    	MemorySegment pDisplayPowerInfo
    ) {
        MethodHandle method = device.VK_DISPLAY_POWER_CONTROL_EXT().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                display,
                pDisplayPowerInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkDisplayPowerControlEXT].
    public static int vkDisplayPowerControlEXT(
    	VkDevice device,
    	VkDisplayKHR display,
    	VkDisplayPowerInfoEXT pDisplayPowerInfo
    ) {
    	return vkDisplayPowerControlEXT(
    		device,
    		display.memorySegment(),
    		pDisplayPowerInfo.memorySegment()
    	);
    }
    
    public static int vkRegisterDeviceEventEXT(
        VkDevice device,
    	MemorySegment pDeviceEventInfo,
    	MemorySegment pAllocator,
    	MemorySegment pFence
    ) {
        MethodHandle method = device.VK_REGISTER_DEVICE_EVENT_EXT().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                pDeviceEventInfo,
                pAllocator,
                pFence
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkRegisterDeviceEventEXT].
    public static int vkRegisterDeviceEventEXT(
    	VkDevice device,
    	VkDeviceEventInfoEXT pDeviceEventInfo,
    	@Nullable VkAllocationCallbacks pAllocator,
    	NativePointerArray pFence
    ) {
    	return vkRegisterDeviceEventEXT(
    		device,
    		pDeviceEventInfo.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment(),
    		pFence.memorySegment()
    	);
    }
    
    public static int vkRegisterDisplayEventEXT(
        VkDevice device,
    	MemorySegment display,
    	MemorySegment pDisplayEventInfo,
    	MemorySegment pAllocator,
    	MemorySegment pFence
    ) {
        MethodHandle method = device.VK_REGISTER_DISPLAY_EVENT_EXT().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                display,
                pDisplayEventInfo,
                pAllocator,
                pFence
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkRegisterDisplayEventEXT].
    public static int vkRegisterDisplayEventEXT(
    	VkDevice device,
    	VkDisplayKHR display,
    	VkDisplayEventInfoEXT pDisplayEventInfo,
    	@Nullable VkAllocationCallbacks pAllocator,
    	NativePointerArray pFence
    ) {
    	return vkRegisterDisplayEventEXT(
    		device,
    		display.memorySegment(),
    		pDisplayEventInfo.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment(),
    		pFence.memorySegment()
    	);
    }
    
    public static int vkGetSwapchainCounterEXT(
        VkDevice device,
    	MemorySegment swapchain,
    	int counter,
    	MemorySegment pCounterValue
    ) {
        MethodHandle method = device.VK_GET_SWAPCHAIN_COUNTER_EXT().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                swapchain,
                counter,
                pCounterValue
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetSwapchainCounterEXT].
    public static int vkGetSwapchainCounterEXT(
    	VkDevice device,
    	VkSwapchainKHR swapchain,
    	int counter,
    	NativeLongArray pCounterValue
    ) {
    	return vkGetSwapchainCounterEXT(
    		device,
    		swapchain.memorySegment(),
    		counter,
    		pCounterValue.memorySegment()
    	);
    }
    
    public static int vkGetRefreshCycleDurationGOOGLE(
        VkDevice device,
    	MemorySegment swapchain,
    	MemorySegment pDisplayTimingProperties
    ) {
        MethodHandle method = device.VK_GET_REFRESH_CYCLE_DURATION_GOOGLE().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                swapchain,
                pDisplayTimingProperties
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetRefreshCycleDurationGOOGLE].
    public static int vkGetRefreshCycleDurationGOOGLE(
    	VkDevice device,
    	VkSwapchainKHR swapchain,
    	VkRefreshCycleDurationGOOGLE pDisplayTimingProperties
    ) {
    	return vkGetRefreshCycleDurationGOOGLE(
    		device,
    		swapchain.memorySegment(),
    		pDisplayTimingProperties.memorySegment()
    	);
    }
    
    public static int vkGetPastPresentationTimingGOOGLE(
        VkDevice device,
    	MemorySegment swapchain,
    	MemorySegment pPresentationTimingCount,
    	MemorySegment pPresentationTimings
    ) {
        MethodHandle method = device.VK_GET_PAST_PRESENTATION_TIMING_GOOGLE().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                swapchain,
                pPresentationTimingCount,
                pPresentationTimings
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetPastPresentationTimingGOOGLE].
    public static int vkGetPastPresentationTimingGOOGLE(
    	VkDevice device,
    	VkSwapchainKHR swapchain,
    	NativeIntArray pPresentationTimingCount,
    	@Nullable NativeStructArray<VkPastPresentationTimingGOOGLE> pPresentationTimings
    ) {
    	return vkGetPastPresentationTimingGOOGLE(
    		device,
    		swapchain.memorySegment(),
    		pPresentationTimingCount.memorySegment(),
    		pPresentationTimings == null ? MemorySegment.NULL : pPresentationTimings.memorySegment()
    	);
    }
    
    public static void vkCmdSetDiscardRectangleEXT(
        VkCommandBuffer commandBuffer,
    	int firstDiscardRectangle,
    	int discardRectangleCount,
    	MemorySegment pDiscardRectangles
    ) {
        MethodHandle method = commandBuffer.VK_CMD_SET_DISCARD_RECTANGLE_EXT().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                firstDiscardRectangle,
                discardRectangleCount,
                pDiscardRectangles
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdSetDiscardRectangleEXT].
    public static void vkCmdSetDiscardRectangleEXT(
    	VkCommandBuffer commandBuffer,
    	int firstDiscardRectangle,
    	int discardRectangleCount,
    	NativeStructArray<VkRect2D> pDiscardRectangles
    ) {
    	vkCmdSetDiscardRectangleEXT(
    		commandBuffer,
    		firstDiscardRectangle,
    		discardRectangleCount,
    		pDiscardRectangles.memorySegment()
    	);
    }
    
    public static void vkCmdSetDiscardRectangleEnableEXT(
        VkCommandBuffer commandBuffer,
    	int discardRectangleEnable
    ) {
        MethodHandle method = commandBuffer.VK_CMD_SET_DISCARD_RECTANGLE_ENABLE_EXT().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                discardRectangleEnable
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    
    public static void vkCmdSetDiscardRectangleModeEXT(
        VkCommandBuffer commandBuffer,
    	int discardRectangleMode
    ) {
        MethodHandle method = commandBuffer.VK_CMD_SET_DISCARD_RECTANGLE_MODE_EXT().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                discardRectangleMode
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    
    public static void vkSetHdrMetadataEXT(
        VkDevice device,
    	int swapchainCount,
    	MemorySegment pSwapchains,
    	MemorySegment pMetadata
    ) {
        MethodHandle method = device.VK_SET_HDR_METADATA_EXT().get();
        try {
             method.invokeExact(
                device.memorySegment(),
                swapchainCount,
                pSwapchains,
                pMetadata
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkSetHdrMetadataEXT].
    public static void vkSetHdrMetadataEXT(
    	VkDevice device,
    	int swapchainCount,
    	NativePointerArray pSwapchains,
    	NativeStructArray<VkHdrMetadataEXT> pMetadata
    ) {
    	vkSetHdrMetadataEXT(
    		device,
    		swapchainCount,
    		pSwapchains.memorySegment(),
    		pMetadata.memorySegment()
    	);
    }
    
    public static int vkSetDebugUtilsObjectNameEXT(
        VkDevice device,
    	MemorySegment pNameInfo
    ) {
        MethodHandle method = device.VK_SET_DEBUG_UTILS_OBJECT_NAME_EXT().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                pNameInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkSetDebugUtilsObjectNameEXT].
    public static int vkSetDebugUtilsObjectNameEXT(
    	VkDevice device,
    	VkDebugUtilsObjectNameInfoEXT pNameInfo
    ) {
    	return vkSetDebugUtilsObjectNameEXT(
    		device,
    		pNameInfo.memorySegment()
    	);
    }
    
    public static int vkSetDebugUtilsObjectTagEXT(
        VkDevice device,
    	MemorySegment pTagInfo
    ) {
        MethodHandle method = device.VK_SET_DEBUG_UTILS_OBJECT_TAG_EXT().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                pTagInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkSetDebugUtilsObjectTagEXT].
    public static int vkSetDebugUtilsObjectTagEXT(
    	VkDevice device,
    	VkDebugUtilsObjectTagInfoEXT pTagInfo
    ) {
    	return vkSetDebugUtilsObjectTagEXT(
    		device,
    		pTagInfo.memorySegment()
    	);
    }
    
    public static void vkQueueBeginDebugUtilsLabelEXT(
        VkQueue queue,
    	MemorySegment pLabelInfo
    ) {
        MethodHandle method = queue.VK_QUEUE_BEGIN_DEBUG_UTILS_LABEL_EXT().get();
        try {
             method.invokeExact(
                queue.memorySegment(),
                pLabelInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkQueueBeginDebugUtilsLabelEXT].
    public static void vkQueueBeginDebugUtilsLabelEXT(
    	VkQueue queue,
    	VkDebugUtilsLabelEXT pLabelInfo
    ) {
    	vkQueueBeginDebugUtilsLabelEXT(
    		queue,
    		pLabelInfo.memorySegment()
    	);
    }
    
    public static void vkQueueEndDebugUtilsLabelEXT(
        VkQueue queue
    ) {
        MethodHandle method = queue.VK_QUEUE_END_DEBUG_UTILS_LABEL_EXT().get();
        try {
             method.invokeExact(
                queue.memorySegment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    
    public static void vkQueueInsertDebugUtilsLabelEXT(
        VkQueue queue,
    	MemorySegment pLabelInfo
    ) {
        MethodHandle method = queue.VK_QUEUE_INSERT_DEBUG_UTILS_LABEL_EXT().get();
        try {
             method.invokeExact(
                queue.memorySegment(),
                pLabelInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkQueueInsertDebugUtilsLabelEXT].
    public static void vkQueueInsertDebugUtilsLabelEXT(
    	VkQueue queue,
    	VkDebugUtilsLabelEXT pLabelInfo
    ) {
    	vkQueueInsertDebugUtilsLabelEXT(
    		queue,
    		pLabelInfo.memorySegment()
    	);
    }
    
    public static void vkCmdBeginDebugUtilsLabelEXT(
        VkCommandBuffer commandBuffer,
    	MemorySegment pLabelInfo
    ) {
        MethodHandle method = commandBuffer.VK_CMD_BEGIN_DEBUG_UTILS_LABEL_EXT().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                pLabelInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdBeginDebugUtilsLabelEXT].
    public static void vkCmdBeginDebugUtilsLabelEXT(
    	VkCommandBuffer commandBuffer,
    	VkDebugUtilsLabelEXT pLabelInfo
    ) {
    	vkCmdBeginDebugUtilsLabelEXT(
    		commandBuffer,
    		pLabelInfo.memorySegment()
    	);
    }
    
    public static void vkCmdEndDebugUtilsLabelEXT(
        VkCommandBuffer commandBuffer
    ) {
        MethodHandle method = commandBuffer.VK_CMD_END_DEBUG_UTILS_LABEL_EXT().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    
    public static void vkCmdInsertDebugUtilsLabelEXT(
        VkCommandBuffer commandBuffer,
    	MemorySegment pLabelInfo
    ) {
        MethodHandle method = commandBuffer.VK_CMD_INSERT_DEBUG_UTILS_LABEL_EXT().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                pLabelInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdInsertDebugUtilsLabelEXT].
    public static void vkCmdInsertDebugUtilsLabelEXT(
    	VkCommandBuffer commandBuffer,
    	VkDebugUtilsLabelEXT pLabelInfo
    ) {
    	vkCmdInsertDebugUtilsLabelEXT(
    		commandBuffer,
    		pLabelInfo.memorySegment()
    	);
    }
    
    public static int vkCreateDebugUtilsMessengerEXT(
        VkInstance instance,
    	MemorySegment pCreateInfo,
    	MemorySegment pAllocator,
    	MemorySegment pMessenger
    ) {
        MethodHandle method = instance.VK_CREATE_DEBUG_UTILS_MESSENGER_EXT().get();
        try {
            return (int) method.invokeExact(
                instance.memorySegment(),
                pCreateInfo,
                pAllocator,
                pMessenger
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCreateDebugUtilsMessengerEXT].
    public static int vkCreateDebugUtilsMessengerEXT(
    	VkInstance instance,
    	VkDebugUtilsMessengerCreateInfoEXT pCreateInfo,
    	@Nullable VkAllocationCallbacks pAllocator,
    	NativePointerArray pMessenger
    ) {
    	return vkCreateDebugUtilsMessengerEXT(
    		instance,
    		pCreateInfo.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment(),
    		pMessenger.memorySegment()
    	);
    }
    
    public static void vkDestroyDebugUtilsMessengerEXT(
        VkInstance instance,
    	MemorySegment messenger,
    	MemorySegment pAllocator
    ) {
        MethodHandle method = instance.VK_DESTROY_DEBUG_UTILS_MESSENGER_EXT().get();
        try {
             method.invokeExact(
                instance.memorySegment(),
                messenger,
                pAllocator
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkDestroyDebugUtilsMessengerEXT].
    public static void vkDestroyDebugUtilsMessengerEXT(
    	VkInstance instance,
    	@Nullable VkDebugUtilsMessengerEXT messenger,
    	@Nullable VkAllocationCallbacks pAllocator
    ) {
    	vkDestroyDebugUtilsMessengerEXT(
    		instance,
    		messenger == null ? MemorySegment.NULL : messenger.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment()
    	);
    }
    
    public static void vkSubmitDebugUtilsMessageEXT(
        VkInstance instance,
    	int messageSeverity,
    	int messageTypes,
    	MemorySegment pCallbackData
    ) {
        MethodHandle method = instance.VK_SUBMIT_DEBUG_UTILS_MESSAGE_EXT().get();
        try {
             method.invokeExact(
                instance.memorySegment(),
                messageSeverity,
                messageTypes,
                pCallbackData
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkSubmitDebugUtilsMessageEXT].
    public static void vkSubmitDebugUtilsMessageEXT(
    	VkInstance instance,
    	int messageSeverity,
    	int messageTypes,
    	VkDebugUtilsMessengerCallbackDataEXT pCallbackData
    ) {
    	vkSubmitDebugUtilsMessageEXT(
    		instance,
    		messageSeverity,
    		messageTypes,
    		pCallbackData.memorySegment()
    	);
    }
    
    public static int vkCreateGpaSessionAMD(
        VkDevice device,
    	MemorySegment pCreateInfo,
    	MemorySegment pAllocator,
    	MemorySegment pGpaSession
    ) {
        MethodHandle method = device.VK_CREATE_GPA_SESSION_AMD().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                pCreateInfo,
                pAllocator,
                pGpaSession
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCreateGpaSessionAMD].
    public static int vkCreateGpaSessionAMD(
    	VkDevice device,
    	VkGpaSessionCreateInfoAMD pCreateInfo,
    	@Nullable VkAllocationCallbacks pAllocator,
    	NativePointerArray pGpaSession
    ) {
    	return vkCreateGpaSessionAMD(
    		device,
    		pCreateInfo.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment(),
    		pGpaSession.memorySegment()
    	);
    }
    
    public static void vkDestroyGpaSessionAMD(
        VkDevice device,
    	MemorySegment gpaSession,
    	MemorySegment pAllocator
    ) {
        MethodHandle method = device.VK_DESTROY_GPA_SESSION_AMD().get();
        try {
             method.invokeExact(
                device.memorySegment(),
                gpaSession,
                pAllocator
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkDestroyGpaSessionAMD].
    public static void vkDestroyGpaSessionAMD(
    	VkDevice device,
    	@Nullable VkGpaSessionAMD gpaSession,
    	@Nullable VkAllocationCallbacks pAllocator
    ) {
    	vkDestroyGpaSessionAMD(
    		device,
    		gpaSession == null ? MemorySegment.NULL : gpaSession.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment()
    	);
    }
    
    public static int vkSetGpaDeviceClockModeAMD(
        VkDevice device,
    	MemorySegment pInfo
    ) {
        MethodHandle method = device.VK_SET_GPA_DEVICE_CLOCK_MODE_AMD().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                pInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkSetGpaDeviceClockModeAMD].
    public static int vkSetGpaDeviceClockModeAMD(
    	VkDevice device,
    	VkGpaDeviceClockModeInfoAMD pInfo
    ) {
    	return vkSetGpaDeviceClockModeAMD(
    		device,
    		pInfo.memorySegment()
    	);
    }
    
    public static int vkGetGpaDeviceClockInfoAMD(
        VkDevice device,
    	MemorySegment pInfo
    ) {
        MethodHandle method = device.VK_GET_GPA_DEVICE_CLOCK_INFO_AMD().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                pInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetGpaDeviceClockInfoAMD].
    public static int vkGetGpaDeviceClockInfoAMD(
    	VkDevice device,
    	VkGpaDeviceGetClockInfoAMD pInfo
    ) {
    	return vkGetGpaDeviceClockInfoAMD(
    		device,
    		pInfo.memorySegment()
    	);
    }
    
    public static int vkCmdBeginGpaSessionAMD(
        VkCommandBuffer commandBuffer,
    	MemorySegment gpaSession
    ) {
        MethodHandle method = commandBuffer.VK_CMD_BEGIN_GPA_SESSION_AMD().get();
        try {
            return (int) method.invokeExact(
                commandBuffer.memorySegment(),
                gpaSession
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdBeginGpaSessionAMD].
    public static int vkCmdBeginGpaSessionAMD(
    	VkCommandBuffer commandBuffer,
    	VkGpaSessionAMD gpaSession
    ) {
    	return vkCmdBeginGpaSessionAMD(
    		commandBuffer,
    		gpaSession.memorySegment()
    	);
    }
    
    public static int vkCmdEndGpaSessionAMD(
        VkCommandBuffer commandBuffer,
    	MemorySegment gpaSession
    ) {
        MethodHandle method = commandBuffer.VK_CMD_END_GPA_SESSION_AMD().get();
        try {
            return (int) method.invokeExact(
                commandBuffer.memorySegment(),
                gpaSession
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdEndGpaSessionAMD].
    public static int vkCmdEndGpaSessionAMD(
    	VkCommandBuffer commandBuffer,
    	VkGpaSessionAMD gpaSession
    ) {
    	return vkCmdEndGpaSessionAMD(
    		commandBuffer,
    		gpaSession.memorySegment()
    	);
    }
    
    public static int vkCmdBeginGpaSampleAMD(
        VkCommandBuffer commandBuffer,
    	MemorySegment gpaSession,
    	MemorySegment pGpaSampleBeginInfo,
    	MemorySegment pSampleID
    ) {
        MethodHandle method = commandBuffer.VK_CMD_BEGIN_GPA_SAMPLE_AMD().get();
        try {
            return (int) method.invokeExact(
                commandBuffer.memorySegment(),
                gpaSession,
                pGpaSampleBeginInfo,
                pSampleID
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdBeginGpaSampleAMD].
    public static int vkCmdBeginGpaSampleAMD(
    	VkCommandBuffer commandBuffer,
    	VkGpaSessionAMD gpaSession,
    	VkGpaSampleBeginInfoAMD pGpaSampleBeginInfo,
    	NativeIntArray pSampleID
    ) {
    	return vkCmdBeginGpaSampleAMD(
    		commandBuffer,
    		gpaSession.memorySegment(),
    		pGpaSampleBeginInfo.memorySegment(),
    		pSampleID.memorySegment()
    	);
    }
    
    public static void vkCmdEndGpaSampleAMD(
        VkCommandBuffer commandBuffer,
    	MemorySegment gpaSession,
    	int sampleID
    ) {
        MethodHandle method = commandBuffer.VK_CMD_END_GPA_SAMPLE_AMD().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                gpaSession,
                sampleID
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdEndGpaSampleAMD].
    public static void vkCmdEndGpaSampleAMD(
    	VkCommandBuffer commandBuffer,
    	VkGpaSessionAMD gpaSession,
    	int sampleID
    ) {
    	vkCmdEndGpaSampleAMD(
    		commandBuffer,
    		gpaSession.memorySegment(),
    		sampleID
    	);
    }
    
    public static int vkGetGpaSessionStatusAMD(
        VkDevice device,
    	MemorySegment gpaSession
    ) {
        MethodHandle method = device.VK_GET_GPA_SESSION_STATUS_AMD().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                gpaSession
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetGpaSessionStatusAMD].
    public static int vkGetGpaSessionStatusAMD(
    	VkDevice device,
    	VkGpaSessionAMD gpaSession
    ) {
    	return vkGetGpaSessionStatusAMD(
    		device,
    		gpaSession.memorySegment()
    	);
    }
    
    public static int vkGetGpaSessionResultsAMD(
        VkDevice device,
    	MemorySegment gpaSession,
    	int sampleID,
    	MemorySegment pSizeInBytes,
    	MemorySegment pData
    ) {
        MethodHandle method = device.VK_GET_GPA_SESSION_RESULTS_AMD().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                gpaSession,
                sampleID,
                pSizeInBytes,
                pData
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetGpaSessionResultsAMD].
    public static int vkGetGpaSessionResultsAMD(
    	VkDevice device,
    	VkGpaSessionAMD gpaSession,
    	int sampleID,
    	NativeLongArray pSizeInBytes,
    	@Nullable MemorySegment pData
    ) {
    	return vkGetGpaSessionResultsAMD(
    		device,
    		gpaSession.memorySegment(),
    		sampleID,
    		pSizeInBytes.memorySegment(),
    		pData
    	);
    }
    
    public static int vkResetGpaSessionAMD(
        VkDevice device,
    	MemorySegment gpaSession
    ) {
        MethodHandle method = device.VK_RESET_GPA_SESSION_AMD().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                gpaSession
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkResetGpaSessionAMD].
    public static int vkResetGpaSessionAMD(
    	VkDevice device,
    	VkGpaSessionAMD gpaSession
    ) {
    	return vkResetGpaSessionAMD(
    		device,
    		gpaSession.memorySegment()
    	);
    }
    
    public static void vkCmdCopyGpaSessionResultsAMD(
        VkCommandBuffer commandBuffer,
    	MemorySegment gpaSession
    ) {
        MethodHandle method = commandBuffer.VK_CMD_COPY_GPA_SESSION_RESULTS_AMD().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                gpaSession
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdCopyGpaSessionResultsAMD].
    public static void vkCmdCopyGpaSessionResultsAMD(
    	VkCommandBuffer commandBuffer,
    	VkGpaSessionAMD gpaSession
    ) {
    	vkCmdCopyGpaSessionResultsAMD(
    		commandBuffer,
    		gpaSession.memorySegment()
    	);
    }
    
    public static int vkWriteSamplerDescriptorsEXT(
        VkDevice device,
    	int samplerCount,
    	MemorySegment pSamplers,
    	MemorySegment pDescriptors
    ) {
        MethodHandle method = device.VK_WRITE_SAMPLER_DESCRIPTORS_EXT().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                samplerCount,
                pSamplers,
                pDescriptors
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkWriteSamplerDescriptorsEXT].
    public static int vkWriteSamplerDescriptorsEXT(
    	VkDevice device,
    	int samplerCount,
    	NativeStructArray<VkSamplerCreateInfo> pSamplers,
    	NativeStructArray<VkHostAddressRangeEXT> pDescriptors
    ) {
    	return vkWriteSamplerDescriptorsEXT(
    		device,
    		samplerCount,
    		pSamplers.memorySegment(),
    		pDescriptors.memorySegment()
    	);
    }
    
    public static int vkWriteResourceDescriptorsEXT(
        VkDevice device,
    	int resourceCount,
    	MemorySegment pResources,
    	MemorySegment pDescriptors
    ) {
        MethodHandle method = device.VK_WRITE_RESOURCE_DESCRIPTORS_EXT().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                resourceCount,
                pResources,
                pDescriptors
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkWriteResourceDescriptorsEXT].
    public static int vkWriteResourceDescriptorsEXT(
    	VkDevice device,
    	int resourceCount,
    	NativeStructArray<VkResourceDescriptorInfoEXT> pResources,
    	NativeStructArray<VkHostAddressRangeEXT> pDescriptors
    ) {
    	return vkWriteResourceDescriptorsEXT(
    		device,
    		resourceCount,
    		pResources.memorySegment(),
    		pDescriptors.memorySegment()
    	);
    }
    
    public static void vkCmdBindSamplerHeapEXT(
        VkCommandBuffer commandBuffer,
    	MemorySegment pBindInfo
    ) {
        MethodHandle method = commandBuffer.VK_CMD_BIND_SAMPLER_HEAP_EXT().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                pBindInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdBindSamplerHeapEXT].
    public static void vkCmdBindSamplerHeapEXT(
    	VkCommandBuffer commandBuffer,
    	VkBindHeapInfoEXT pBindInfo
    ) {
    	vkCmdBindSamplerHeapEXT(
    		commandBuffer,
    		pBindInfo.memorySegment()
    	);
    }
    
    public static void vkCmdBindResourceHeapEXT(
        VkCommandBuffer commandBuffer,
    	MemorySegment pBindInfo
    ) {
        MethodHandle method = commandBuffer.VK_CMD_BIND_RESOURCE_HEAP_EXT().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                pBindInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdBindResourceHeapEXT].
    public static void vkCmdBindResourceHeapEXT(
    	VkCommandBuffer commandBuffer,
    	VkBindHeapInfoEXT pBindInfo
    ) {
    	vkCmdBindResourceHeapEXT(
    		commandBuffer,
    		pBindInfo.memorySegment()
    	);
    }
    
    public static void vkCmdPushDataEXT(
        VkCommandBuffer commandBuffer,
    	MemorySegment pPushDataInfo
    ) {
        MethodHandle method = commandBuffer.VK_CMD_PUSH_DATA_EXT().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                pPushDataInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdPushDataEXT].
    public static void vkCmdPushDataEXT(
    	VkCommandBuffer commandBuffer,
    	VkPushDataInfoEXT pPushDataInfo
    ) {
    	vkCmdPushDataEXT(
    		commandBuffer,
    		pPushDataInfo.memorySegment()
    	);
    }
    
    public static int vkGetImageOpaqueCaptureDataEXT(
        VkDevice device,
    	int imageCount,
    	MemorySegment pImages,
    	MemorySegment pDatas
    ) {
        MethodHandle method = device.VK_GET_IMAGE_OPAQUE_CAPTURE_DATA_EXT().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                imageCount,
                pImages,
                pDatas
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetImageOpaqueCaptureDataEXT].
    public static int vkGetImageOpaqueCaptureDataEXT(
    	VkDevice device,
    	int imageCount,
    	NativePointerArray pImages,
    	NativeStructArray<VkHostAddressRangeEXT> pDatas
    ) {
    	return vkGetImageOpaqueCaptureDataEXT(
    		device,
    		imageCount,
    		pImages.memorySegment(),
    		pDatas.memorySegment()
    	);
    }
    
    public static long vkGetPhysicalDeviceDescriptorSizeEXT(
        VkPhysicalDevice physicalDevice,
    	int descriptorType
    ) {
        MethodHandle method = physicalDevice.VK_GET_PHYSICAL_DEVICE_DESCRIPTOR_SIZE_EXT().get();
        try {
            return (long) method.invokeExact(
                physicalDevice.memorySegment(),
                descriptorType
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    
    public static int vkRegisterCustomBorderColorEXT(
        VkDevice device,
    	MemorySegment pBorderColor,
    	int requestIndex,
    	MemorySegment pIndex
    ) {
        MethodHandle method = device.VK_REGISTER_CUSTOM_BORDER_COLOR_EXT().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                pBorderColor,
                requestIndex,
                pIndex
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkRegisterCustomBorderColorEXT].
    public static int vkRegisterCustomBorderColorEXT(
    	VkDevice device,
    	VkSamplerCustomBorderColorCreateInfoEXT pBorderColor,
    	int requestIndex,
    	NativeIntArray pIndex
    ) {
    	return vkRegisterCustomBorderColorEXT(
    		device,
    		pBorderColor.memorySegment(),
    		requestIndex,
    		pIndex.memorySegment()
    	);
    }
    
    public static void vkUnregisterCustomBorderColorEXT(
        VkDevice device,
    	int index
    ) {
        MethodHandle method = device.VK_UNREGISTER_CUSTOM_BORDER_COLOR_EXT().get();
        try {
             method.invokeExact(
                device.memorySegment(),
                index
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    
    public static int vkGetTensorOpaqueCaptureDataARM(
        VkDevice device,
    	int tensorCount,
    	MemorySegment pTensors,
    	MemorySegment pDatas
    ) {
        MethodHandle method = device.VK_GET_TENSOR_OPAQUE_CAPTURE_DATA_ARM().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                tensorCount,
                pTensors,
                pDatas
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetTensorOpaqueCaptureDataARM].
    public static int vkGetTensorOpaqueCaptureDataARM(
    	VkDevice device,
    	int tensorCount,
    	NativePointerArray pTensors,
    	NativeStructArray<VkHostAddressRangeEXT> pDatas
    ) {
    	return vkGetTensorOpaqueCaptureDataARM(
    		device,
    		tensorCount,
    		pTensors.memorySegment(),
    		pDatas.memorySegment()
    	);
    }
    
    public static void vkCmdSetSampleLocationsEXT(
        VkCommandBuffer commandBuffer,
    	MemorySegment pSampleLocationsInfo
    ) {
        MethodHandle method = commandBuffer.VK_CMD_SET_SAMPLE_LOCATIONS_EXT().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                pSampleLocationsInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdSetSampleLocationsEXT].
    public static void vkCmdSetSampleLocationsEXT(
    	VkCommandBuffer commandBuffer,
    	VkSampleLocationsInfoEXT pSampleLocationsInfo
    ) {
    	vkCmdSetSampleLocationsEXT(
    		commandBuffer,
    		pSampleLocationsInfo.memorySegment()
    	);
    }
    
    public static void vkGetPhysicalDeviceMultisamplePropertiesEXT(
        VkPhysicalDevice physicalDevice,
    	int samples,
    	MemorySegment pMultisampleProperties
    ) {
        MethodHandle method = physicalDevice.VK_GET_PHYSICAL_DEVICE_MULTISAMPLE_PROPERTIES_EXT().get();
        try {
             method.invokeExact(
                physicalDevice.memorySegment(),
                samples,
                pMultisampleProperties
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetPhysicalDeviceMultisamplePropertiesEXT].
    public static void vkGetPhysicalDeviceMultisamplePropertiesEXT(
    	VkPhysicalDevice physicalDevice,
    	int samples,
    	VkMultisamplePropertiesEXT pMultisampleProperties
    ) {
    	vkGetPhysicalDeviceMultisamplePropertiesEXT(
    		physicalDevice,
    		samples,
    		pMultisampleProperties.memorySegment()
    	);
    }
    
    public static int vkGetImageDrmFormatModifierPropertiesEXT(
        VkDevice device,
    	MemorySegment image,
    	MemorySegment pProperties
    ) {
        MethodHandle method = device.VK_GET_IMAGE_DRM_FORMAT_MODIFIER_PROPERTIES_EXT().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                image,
                pProperties
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetImageDrmFormatModifierPropertiesEXT].
    public static int vkGetImageDrmFormatModifierPropertiesEXT(
    	VkDevice device,
    	VkImage image,
    	VkImageDrmFormatModifierPropertiesEXT pProperties
    ) {
    	return vkGetImageDrmFormatModifierPropertiesEXT(
    		device,
    		image.memorySegment(),
    		pProperties.memorySegment()
    	);
    }
    
    public static int vkCreateValidationCacheEXT(
        VkDevice device,
    	MemorySegment pCreateInfo,
    	MemorySegment pAllocator,
    	MemorySegment pValidationCache
    ) {
        MethodHandle method = device.VK_CREATE_VALIDATION_CACHE_EXT().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                pCreateInfo,
                pAllocator,
                pValidationCache
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCreateValidationCacheEXT].
    public static int vkCreateValidationCacheEXT(
    	VkDevice device,
    	VkValidationCacheCreateInfoEXT pCreateInfo,
    	@Nullable VkAllocationCallbacks pAllocator,
    	NativePointerArray pValidationCache
    ) {
    	return vkCreateValidationCacheEXT(
    		device,
    		pCreateInfo.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment(),
    		pValidationCache.memorySegment()
    	);
    }
    
    public static void vkDestroyValidationCacheEXT(
        VkDevice device,
    	MemorySegment validationCache,
    	MemorySegment pAllocator
    ) {
        MethodHandle method = device.VK_DESTROY_VALIDATION_CACHE_EXT().get();
        try {
             method.invokeExact(
                device.memorySegment(),
                validationCache,
                pAllocator
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkDestroyValidationCacheEXT].
    public static void vkDestroyValidationCacheEXT(
    	VkDevice device,
    	@Nullable VkValidationCacheEXT validationCache,
    	@Nullable VkAllocationCallbacks pAllocator
    ) {
    	vkDestroyValidationCacheEXT(
    		device,
    		validationCache == null ? MemorySegment.NULL : validationCache.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment()
    	);
    }
    
    public static int vkMergeValidationCachesEXT(
        VkDevice device,
    	MemorySegment dstCache,
    	int srcCacheCount,
    	MemorySegment pSrcCaches
    ) {
        MethodHandle method = device.VK_MERGE_VALIDATION_CACHES_EXT().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                dstCache,
                srcCacheCount,
                pSrcCaches
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkMergeValidationCachesEXT].
    public static int vkMergeValidationCachesEXT(
    	VkDevice device,
    	VkValidationCacheEXT dstCache,
    	int srcCacheCount,
    	NativePointerArray pSrcCaches
    ) {
    	return vkMergeValidationCachesEXT(
    		device,
    		dstCache.memorySegment(),
    		srcCacheCount,
    		pSrcCaches.memorySegment()
    	);
    }
    
    public static int vkGetValidationCacheDataEXT(
        VkDevice device,
    	MemorySegment validationCache,
    	MemorySegment pDataSize,
    	MemorySegment pData
    ) {
        MethodHandle method = device.VK_GET_VALIDATION_CACHE_DATA_EXT().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                validationCache,
                pDataSize,
                pData
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetValidationCacheDataEXT].
    public static int vkGetValidationCacheDataEXT(
    	VkDevice device,
    	VkValidationCacheEXT validationCache,
    	NativeLongArray pDataSize,
    	@Nullable MemorySegment pData
    ) {
    	return vkGetValidationCacheDataEXT(
    		device,
    		validationCache.memorySegment(),
    		pDataSize.memorySegment(),
    		pData
    	);
    }
    
    public static void vkCmdBindShadingRateImageNV(
        VkCommandBuffer commandBuffer,
    	MemorySegment imageView,
    	int imageLayout
    ) {
        MethodHandle method = commandBuffer.VK_CMD_BIND_SHADING_RATE_IMAGE_NV().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                imageView,
                imageLayout
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdBindShadingRateImageNV].
    public static void vkCmdBindShadingRateImageNV(
    	VkCommandBuffer commandBuffer,
    	@Nullable VkImageView imageView,
    	int imageLayout
    ) {
    	vkCmdBindShadingRateImageNV(
    		commandBuffer,
    		imageView == null ? MemorySegment.NULL : imageView.memorySegment(),
    		imageLayout
    	);
    }
    
    public static void vkCmdSetViewportShadingRatePaletteNV(
        VkCommandBuffer commandBuffer,
    	int firstViewport,
    	int viewportCount,
    	MemorySegment pShadingRatePalettes
    ) {
        MethodHandle method = commandBuffer.VK_CMD_SET_VIEWPORT_SHADING_RATE_PALETTE_NV().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                firstViewport,
                viewportCount,
                pShadingRatePalettes
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdSetViewportShadingRatePaletteNV].
    public static void vkCmdSetViewportShadingRatePaletteNV(
    	VkCommandBuffer commandBuffer,
    	int firstViewport,
    	int viewportCount,
    	NativeStructArray<VkShadingRatePaletteNV> pShadingRatePalettes
    ) {
    	vkCmdSetViewportShadingRatePaletteNV(
    		commandBuffer,
    		firstViewport,
    		viewportCount,
    		pShadingRatePalettes.memorySegment()
    	);
    }
    
    public static void vkCmdSetCoarseSampleOrderNV(
        VkCommandBuffer commandBuffer,
    	int sampleOrderType,
    	int customSampleOrderCount,
    	MemorySegment pCustomSampleOrders
    ) {
        MethodHandle method = commandBuffer.VK_CMD_SET_COARSE_SAMPLE_ORDER_NV().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                sampleOrderType,
                customSampleOrderCount,
                pCustomSampleOrders
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdSetCoarseSampleOrderNV].
    public static void vkCmdSetCoarseSampleOrderNV(
    	VkCommandBuffer commandBuffer,
    	int sampleOrderType,
    	int customSampleOrderCount,
    	@Nullable NativeStructArray<VkCoarseSampleOrderCustomNV> pCustomSampleOrders
    ) {
    	vkCmdSetCoarseSampleOrderNV(
    		commandBuffer,
    		sampleOrderType,
    		customSampleOrderCount,
    		pCustomSampleOrders == null ? MemorySegment.NULL : pCustomSampleOrders.memorySegment()
    	);
    }
    
    public static int vkCreateAccelerationStructureNV(
        VkDevice device,
    	MemorySegment pCreateInfo,
    	MemorySegment pAllocator,
    	MemorySegment pAccelerationStructure
    ) {
        MethodHandle method = device.VK_CREATE_ACCELERATION_STRUCTURE_NV().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                pCreateInfo,
                pAllocator,
                pAccelerationStructure
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCreateAccelerationStructureNV].
    public static int vkCreateAccelerationStructureNV(
    	VkDevice device,
    	VkAccelerationStructureCreateInfoNV pCreateInfo,
    	@Nullable VkAllocationCallbacks pAllocator,
    	NativePointerArray pAccelerationStructure
    ) {
    	return vkCreateAccelerationStructureNV(
    		device,
    		pCreateInfo.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment(),
    		pAccelerationStructure.memorySegment()
    	);
    }
    
    public static void vkDestroyAccelerationStructureNV(
        VkDevice device,
    	MemorySegment accelerationStructure,
    	MemorySegment pAllocator
    ) {
        MethodHandle method = device.VK_DESTROY_ACCELERATION_STRUCTURE_NV().get();
        try {
             method.invokeExact(
                device.memorySegment(),
                accelerationStructure,
                pAllocator
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkDestroyAccelerationStructureNV].
    public static void vkDestroyAccelerationStructureNV(
    	VkDevice device,
    	@Nullable VkAccelerationStructureNV accelerationStructure,
    	@Nullable VkAllocationCallbacks pAllocator
    ) {
    	vkDestroyAccelerationStructureNV(
    		device,
    		accelerationStructure == null ? MemorySegment.NULL : accelerationStructure.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment()
    	);
    }
    
    public static void vkGetAccelerationStructureMemoryRequirementsNV(
        VkDevice device,
    	MemorySegment pInfo,
    	MemorySegment pMemoryRequirements
    ) {
        MethodHandle method = device.VK_GET_ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_NV().get();
        try {
             method.invokeExact(
                device.memorySegment(),
                pInfo,
                pMemoryRequirements
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetAccelerationStructureMemoryRequirementsNV].
    public static void vkGetAccelerationStructureMemoryRequirementsNV(
    	VkDevice device,
    	VkAccelerationStructureMemoryRequirementsInfoNV pInfo,
    	VkMemoryRequirements2 pMemoryRequirements
    ) {
    	vkGetAccelerationStructureMemoryRequirementsNV(
    		device,
    		pInfo.memorySegment(),
    		pMemoryRequirements.memorySegment()
    	);
    }
    
    public static int vkBindAccelerationStructureMemoryNV(
        VkDevice device,
    	int bindInfoCount,
    	MemorySegment pBindInfos
    ) {
        MethodHandle method = device.VK_BIND_ACCELERATION_STRUCTURE_MEMORY_NV().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                bindInfoCount,
                pBindInfos
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkBindAccelerationStructureMemoryNV].
    public static int vkBindAccelerationStructureMemoryNV(
    	VkDevice device,
    	int bindInfoCount,
    	NativeStructArray<VkBindAccelerationStructureMemoryInfoNV> pBindInfos
    ) {
    	return vkBindAccelerationStructureMemoryNV(
    		device,
    		bindInfoCount,
    		pBindInfos.memorySegment()
    	);
    }
    
    public static void vkCmdBuildAccelerationStructureNV(
        VkCommandBuffer commandBuffer,
    	MemorySegment pInfo,
    	MemorySegment instanceData,
    	long instanceOffset,
    	int update,
    	MemorySegment dst,
    	MemorySegment src,
    	MemorySegment scratch,
    	long scratchOffset
    ) {
        MethodHandle method = commandBuffer.VK_CMD_BUILD_ACCELERATION_STRUCTURE_NV().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                pInfo,
                instanceData,
                instanceOffset,
                update,
                dst,
                src,
                scratch,
                scratchOffset
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdBuildAccelerationStructureNV].
    public static void vkCmdBuildAccelerationStructureNV(
    	VkCommandBuffer commandBuffer,
    	VkAccelerationStructureInfoNV pInfo,
    	@Nullable VkBuffer instanceData,
    	long instanceOffset,
    	int update,
    	VkAccelerationStructureNV dst,
    	@Nullable VkAccelerationStructureNV src,
    	VkBuffer scratch,
    	long scratchOffset
    ) {
    	vkCmdBuildAccelerationStructureNV(
    		commandBuffer,
    		pInfo.memorySegment(),
    		instanceData == null ? MemorySegment.NULL : instanceData.memorySegment(),
    		instanceOffset,
    		update,
    		dst.memorySegment(),
    		src == null ? MemorySegment.NULL : src.memorySegment(),
    		scratch.memorySegment(),
    		scratchOffset
    	);
    }
    
    public static void vkCmdCopyAccelerationStructureNV(
        VkCommandBuffer commandBuffer,
    	MemorySegment dst,
    	MemorySegment src,
    	int mode
    ) {
        MethodHandle method = commandBuffer.VK_CMD_COPY_ACCELERATION_STRUCTURE_NV().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                dst,
                src,
                mode
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdCopyAccelerationStructureNV].
    public static void vkCmdCopyAccelerationStructureNV(
    	VkCommandBuffer commandBuffer,
    	VkAccelerationStructureNV dst,
    	VkAccelerationStructureNV src,
    	int mode
    ) {
    	vkCmdCopyAccelerationStructureNV(
    		commandBuffer,
    		dst.memorySegment(),
    		src.memorySegment(),
    		mode
    	);
    }
    
    public static void vkCmdTraceRaysNV(
        VkCommandBuffer commandBuffer,
    	MemorySegment raygenShaderBindingTableBuffer,
    	long raygenShaderBindingOffset,
    	MemorySegment missShaderBindingTableBuffer,
    	long missShaderBindingOffset,
    	long missShaderBindingStride,
    	MemorySegment hitShaderBindingTableBuffer,
    	long hitShaderBindingOffset,
    	long hitShaderBindingStride,
    	MemorySegment callableShaderBindingTableBuffer,
    	long callableShaderBindingOffset,
    	long callableShaderBindingStride,
    	int width,
    	int height,
    	int depth
    ) {
        MethodHandle method = commandBuffer.VK_CMD_TRACE_RAYS_NV().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                raygenShaderBindingTableBuffer,
                raygenShaderBindingOffset,
                missShaderBindingTableBuffer,
                missShaderBindingOffset,
                missShaderBindingStride,
                hitShaderBindingTableBuffer,
                hitShaderBindingOffset,
                hitShaderBindingStride,
                callableShaderBindingTableBuffer,
                callableShaderBindingOffset,
                callableShaderBindingStride,
                width,
                height,
                depth
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdTraceRaysNV].
    public static void vkCmdTraceRaysNV(
    	VkCommandBuffer commandBuffer,
    	VkBuffer raygenShaderBindingTableBuffer,
    	long raygenShaderBindingOffset,
    	@Nullable VkBuffer missShaderBindingTableBuffer,
    	long missShaderBindingOffset,
    	long missShaderBindingStride,
    	@Nullable VkBuffer hitShaderBindingTableBuffer,
    	long hitShaderBindingOffset,
    	long hitShaderBindingStride,
    	@Nullable VkBuffer callableShaderBindingTableBuffer,
    	long callableShaderBindingOffset,
    	long callableShaderBindingStride,
    	int width,
    	int height,
    	int depth
    ) {
    	vkCmdTraceRaysNV(
    		commandBuffer,
    		raygenShaderBindingTableBuffer.memorySegment(),
    		raygenShaderBindingOffset,
    		missShaderBindingTableBuffer == null ? MemorySegment.NULL : missShaderBindingTableBuffer.memorySegment(),
    		missShaderBindingOffset,
    		missShaderBindingStride,
    		hitShaderBindingTableBuffer == null ? MemorySegment.NULL : hitShaderBindingTableBuffer.memorySegment(),
    		hitShaderBindingOffset,
    		hitShaderBindingStride,
    		callableShaderBindingTableBuffer == null ? MemorySegment.NULL : callableShaderBindingTableBuffer.memorySegment(),
    		callableShaderBindingOffset,
    		callableShaderBindingStride,
    		width,
    		height,
    		depth
    	);
    }
    
    public static int vkCreateRayTracingPipelinesNV(
        VkDevice device,
    	MemorySegment pipelineCache,
    	int createInfoCount,
    	MemorySegment pCreateInfos,
    	MemorySegment pAllocator,
    	MemorySegment pPipelines
    ) {
        MethodHandle method = device.VK_CREATE_RAY_TRACING_PIPELINES_NV().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                pipelineCache,
                createInfoCount,
                pCreateInfos,
                pAllocator,
                pPipelines
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCreateRayTracingPipelinesNV].
    public static int vkCreateRayTracingPipelinesNV(
    	VkDevice device,
    	VkPipelineCache pipelineCache,
    	int createInfoCount,
    	NativeStructArray<VkRayTracingPipelineCreateInfoNV> pCreateInfos,
    	@Nullable VkAllocationCallbacks pAllocator,
    	NativePointerArray pPipelines
    ) {
    	return vkCreateRayTracingPipelinesNV(
    		device,
    		pipelineCache.memorySegment(),
    		createInfoCount,
    		pCreateInfos.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment(),
    		pPipelines.memorySegment()
    	);
    }
    
    public static int vkGetRayTracingShaderGroupHandlesKHR(
        VkDevice device,
    	MemorySegment pipeline,
    	int firstGroup,
    	int groupCount,
    	long dataSize,
    	MemorySegment pData
    ) {
        MethodHandle method = device.VK_GET_RAY_TRACING_SHADER_GROUP_HANDLES_KHR().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                pipeline,
                firstGroup,
                groupCount,
                dataSize,
                pData
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetRayTracingShaderGroupHandlesKHR].
    public static int vkGetRayTracingShaderGroupHandlesKHR(
    	VkDevice device,
    	VkPipeline pipeline,
    	int firstGroup,
    	int groupCount,
    	long dataSize,
    	MemorySegment pData
    ) {
    	return vkGetRayTracingShaderGroupHandlesKHR(
    		device,
    		pipeline.memorySegment(),
    		firstGroup,
    		groupCount,
    		dataSize,
    		pData
    	);
    }
    
    public static int vkGetAccelerationStructureHandleNV(
        VkDevice device,
    	MemorySegment accelerationStructure,
    	long dataSize,
    	MemorySegment pData
    ) {
        MethodHandle method = device.VK_GET_ACCELERATION_STRUCTURE_HANDLE_NV().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                accelerationStructure,
                dataSize,
                pData
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetAccelerationStructureHandleNV].
    public static int vkGetAccelerationStructureHandleNV(
    	VkDevice device,
    	VkAccelerationStructureNV accelerationStructure,
    	long dataSize,
    	MemorySegment pData
    ) {
    	return vkGetAccelerationStructureHandleNV(
    		device,
    		accelerationStructure.memorySegment(),
    		dataSize,
    		pData
    	);
    }
    
    public static void vkCmdWriteAccelerationStructuresPropertiesNV(
        VkCommandBuffer commandBuffer,
    	int accelerationStructureCount,
    	MemorySegment pAccelerationStructures,
    	int queryType,
    	MemorySegment queryPool,
    	int firstQuery
    ) {
        MethodHandle method = commandBuffer.VK_CMD_WRITE_ACCELERATION_STRUCTURES_PROPERTIES_NV().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                accelerationStructureCount,
                pAccelerationStructures,
                queryType,
                queryPool,
                firstQuery
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdWriteAccelerationStructuresPropertiesNV].
    public static void vkCmdWriteAccelerationStructuresPropertiesNV(
    	VkCommandBuffer commandBuffer,
    	int accelerationStructureCount,
    	NativePointerArray pAccelerationStructures,
    	int queryType,
    	VkQueryPool queryPool,
    	int firstQuery
    ) {
    	vkCmdWriteAccelerationStructuresPropertiesNV(
    		commandBuffer,
    		accelerationStructureCount,
    		pAccelerationStructures.memorySegment(),
    		queryType,
    		queryPool.memorySegment(),
    		firstQuery
    	);
    }
    
    public static int vkCompileDeferredNV(
        VkDevice device,
    	MemorySegment pipeline,
    	int shader
    ) {
        MethodHandle method = device.VK_COMPILE_DEFERRED_NV().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                pipeline,
                shader
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCompileDeferredNV].
    public static int vkCompileDeferredNV(
    	VkDevice device,
    	VkPipeline pipeline,
    	int shader
    ) {
    	return vkCompileDeferredNV(
    		device,
    		pipeline.memorySegment(),
    		shader
    	);
    }
    
    public static int vkGetMemoryHostPointerPropertiesEXT(
        VkDevice device,
    	int handleType,
    	MemorySegment pHostPointer,
    	MemorySegment pMemoryHostPointerProperties
    ) {
        MethodHandle method = device.VK_GET_MEMORY_HOST_POINTER_PROPERTIES_EXT().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                handleType,
                pHostPointer,
                pMemoryHostPointerProperties
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetMemoryHostPointerPropertiesEXT].
    public static int vkGetMemoryHostPointerPropertiesEXT(
    	VkDevice device,
    	int handleType,
    	MemorySegment pHostPointer,
    	VkMemoryHostPointerPropertiesEXT pMemoryHostPointerProperties
    ) {
    	return vkGetMemoryHostPointerPropertiesEXT(
    		device,
    		handleType,
    		pHostPointer,
    		pMemoryHostPointerProperties.memorySegment()
    	);
    }
    
    public static void vkCmdWriteBufferMarkerAMD(
        VkCommandBuffer commandBuffer,
    	int pipelineStage,
    	MemorySegment dstBuffer,
    	long dstOffset,
    	int marker
    ) {
        MethodHandle method = commandBuffer.VK_CMD_WRITE_BUFFER_MARKER_AMD().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                pipelineStage,
                dstBuffer,
                dstOffset,
                marker
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdWriteBufferMarkerAMD].
    public static void vkCmdWriteBufferMarkerAMD(
    	VkCommandBuffer commandBuffer,
    	int pipelineStage,
    	VkBuffer dstBuffer,
    	long dstOffset,
    	int marker
    ) {
    	vkCmdWriteBufferMarkerAMD(
    		commandBuffer,
    		pipelineStage,
    		dstBuffer.memorySegment(),
    		dstOffset,
    		marker
    	);
    }
    
    public static void vkCmdWriteBufferMarker2AMD(
        VkCommandBuffer commandBuffer,
    	long stage,
    	MemorySegment dstBuffer,
    	long dstOffset,
    	int marker
    ) {
        MethodHandle method = commandBuffer.VK_CMD_WRITE_BUFFER_MARKER2_AMD().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                stage,
                dstBuffer,
                dstOffset,
                marker
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdWriteBufferMarker2AMD].
    public static void vkCmdWriteBufferMarker2AMD(
    	VkCommandBuffer commandBuffer,
    	long stage,
    	VkBuffer dstBuffer,
    	long dstOffset,
    	int marker
    ) {
    	vkCmdWriteBufferMarker2AMD(
    		commandBuffer,
    		stage,
    		dstBuffer.memorySegment(),
    		dstOffset,
    		marker
    	);
    }
    
    public static void vkCmdDrawMeshTasksNV(
        VkCommandBuffer commandBuffer,
    	int taskCount,
    	int firstTask
    ) {
        MethodHandle method = commandBuffer.VK_CMD_DRAW_MESH_TASKS_NV().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                taskCount,
                firstTask
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    
    public static void vkCmdDrawMeshTasksIndirectNV(
        VkCommandBuffer commandBuffer,
    	MemorySegment buffer,
    	long offset,
    	int drawCount,
    	int stride
    ) {
        MethodHandle method = commandBuffer.VK_CMD_DRAW_MESH_TASKS_INDIRECT_NV().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                buffer,
                offset,
                drawCount,
                stride
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdDrawMeshTasksIndirectNV].
    public static void vkCmdDrawMeshTasksIndirectNV(
    	VkCommandBuffer commandBuffer,
    	VkBuffer buffer,
    	long offset,
    	int drawCount,
    	int stride
    ) {
    	vkCmdDrawMeshTasksIndirectNV(
    		commandBuffer,
    		buffer.memorySegment(),
    		offset,
    		drawCount,
    		stride
    	);
    }
    
    public static void vkCmdDrawMeshTasksIndirectCountNV(
        VkCommandBuffer commandBuffer,
    	MemorySegment buffer,
    	long offset,
    	MemorySegment countBuffer,
    	long countBufferOffset,
    	int maxDrawCount,
    	int stride
    ) {
        MethodHandle method = commandBuffer.VK_CMD_DRAW_MESH_TASKS_INDIRECT_COUNT_NV().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                buffer,
                offset,
                countBuffer,
                countBufferOffset,
                maxDrawCount,
                stride
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdDrawMeshTasksIndirectCountNV].
    public static void vkCmdDrawMeshTasksIndirectCountNV(
    	VkCommandBuffer commandBuffer,
    	VkBuffer buffer,
    	long offset,
    	VkBuffer countBuffer,
    	long countBufferOffset,
    	int maxDrawCount,
    	int stride
    ) {
    	vkCmdDrawMeshTasksIndirectCountNV(
    		commandBuffer,
    		buffer.memorySegment(),
    		offset,
    		countBuffer.memorySegment(),
    		countBufferOffset,
    		maxDrawCount,
    		stride
    	);
    }
    
    public static void vkCmdSetExclusiveScissorEnableNV(
        VkCommandBuffer commandBuffer,
    	int firstExclusiveScissor,
    	int exclusiveScissorCount,
    	MemorySegment pExclusiveScissorEnables
    ) {
        MethodHandle method = commandBuffer.VK_CMD_SET_EXCLUSIVE_SCISSOR_ENABLE_NV().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                firstExclusiveScissor,
                exclusiveScissorCount,
                pExclusiveScissorEnables
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdSetExclusiveScissorEnableNV].
    public static void vkCmdSetExclusiveScissorEnableNV(
    	VkCommandBuffer commandBuffer,
    	int firstExclusiveScissor,
    	int exclusiveScissorCount,
    	NativeIntArray pExclusiveScissorEnables
    ) {
    	vkCmdSetExclusiveScissorEnableNV(
    		commandBuffer,
    		firstExclusiveScissor,
    		exclusiveScissorCount,
    		pExclusiveScissorEnables.memorySegment()
    	);
    }
    
    public static void vkCmdSetExclusiveScissorNV(
        VkCommandBuffer commandBuffer,
    	int firstExclusiveScissor,
    	int exclusiveScissorCount,
    	MemorySegment pExclusiveScissors
    ) {
        MethodHandle method = commandBuffer.VK_CMD_SET_EXCLUSIVE_SCISSOR_NV().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                firstExclusiveScissor,
                exclusiveScissorCount,
                pExclusiveScissors
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdSetExclusiveScissorNV].
    public static void vkCmdSetExclusiveScissorNV(
    	VkCommandBuffer commandBuffer,
    	int firstExclusiveScissor,
    	int exclusiveScissorCount,
    	NativeStructArray<VkRect2D> pExclusiveScissors
    ) {
    	vkCmdSetExclusiveScissorNV(
    		commandBuffer,
    		firstExclusiveScissor,
    		exclusiveScissorCount,
    		pExclusiveScissors.memorySegment()
    	);
    }
    
    public static void vkCmdSetCheckpointNV(
        VkCommandBuffer commandBuffer,
    	MemorySegment pCheckpointMarker
    ) {
        MethodHandle method = commandBuffer.VK_CMD_SET_CHECKPOINT_NV().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                pCheckpointMarker
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    
    public static void vkGetQueueCheckpointDataNV(
        VkQueue queue,
    	MemorySegment pCheckpointDataCount,
    	MemorySegment pCheckpointData
    ) {
        MethodHandle method = queue.VK_GET_QUEUE_CHECKPOINT_DATA_NV().get();
        try {
             method.invokeExact(
                queue.memorySegment(),
                pCheckpointDataCount,
                pCheckpointData
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetQueueCheckpointDataNV].
    public static void vkGetQueueCheckpointDataNV(
    	VkQueue queue,
    	NativeIntArray pCheckpointDataCount,
    	@Nullable NativeStructArray<VkCheckpointDataNV> pCheckpointData
    ) {
    	vkGetQueueCheckpointDataNV(
    		queue,
    		pCheckpointDataCount.memorySegment(),
    		pCheckpointData == null ? MemorySegment.NULL : pCheckpointData.memorySegment()
    	);
    }
    
    public static void vkGetQueueCheckpointData2NV(
        VkQueue queue,
    	MemorySegment pCheckpointDataCount,
    	MemorySegment pCheckpointData
    ) {
        MethodHandle method = queue.VK_GET_QUEUE_CHECKPOINT_DATA2_NV().get();
        try {
             method.invokeExact(
                queue.memorySegment(),
                pCheckpointDataCount,
                pCheckpointData
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetQueueCheckpointData2NV].
    public static void vkGetQueueCheckpointData2NV(
    	VkQueue queue,
    	NativeIntArray pCheckpointDataCount,
    	@Nullable NativeStructArray<VkCheckpointData2NV> pCheckpointData
    ) {
    	vkGetQueueCheckpointData2NV(
    		queue,
    		pCheckpointDataCount.memorySegment(),
    		pCheckpointData == null ? MemorySegment.NULL : pCheckpointData.memorySegment()
    	);
    }
    
    public static int vkSetSwapchainPresentTimingQueueSizeEXT(
        VkDevice device,
    	MemorySegment swapchain,
    	int size
    ) {
        MethodHandle method = device.VK_SET_SWAPCHAIN_PRESENT_TIMING_QUEUE_SIZE_EXT().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                swapchain,
                size
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkSetSwapchainPresentTimingQueueSizeEXT].
    public static int vkSetSwapchainPresentTimingQueueSizeEXT(
    	VkDevice device,
    	VkSwapchainKHR swapchain,
    	int size
    ) {
    	return vkSetSwapchainPresentTimingQueueSizeEXT(
    		device,
    		swapchain.memorySegment(),
    		size
    	);
    }
    
    public static int vkGetSwapchainTimingPropertiesEXT(
        VkDevice device,
    	MemorySegment swapchain,
    	MemorySegment pSwapchainTimingProperties,
    	MemorySegment pSwapchainTimingPropertiesCounter
    ) {
        MethodHandle method = device.VK_GET_SWAPCHAIN_TIMING_PROPERTIES_EXT().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                swapchain,
                pSwapchainTimingProperties,
                pSwapchainTimingPropertiesCounter
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetSwapchainTimingPropertiesEXT].
    public static int vkGetSwapchainTimingPropertiesEXT(
    	VkDevice device,
    	VkSwapchainKHR swapchain,
    	VkSwapchainTimingPropertiesEXT pSwapchainTimingProperties,
    	@Nullable NativeLongArray pSwapchainTimingPropertiesCounter
    ) {
    	return vkGetSwapchainTimingPropertiesEXT(
    		device,
    		swapchain.memorySegment(),
    		pSwapchainTimingProperties.memorySegment(),
    		pSwapchainTimingPropertiesCounter == null ? MemorySegment.NULL : pSwapchainTimingPropertiesCounter.memorySegment()
    	);
    }
    
    public static int vkGetSwapchainTimeDomainPropertiesEXT(
        VkDevice device,
    	MemorySegment swapchain,
    	MemorySegment pSwapchainTimeDomainProperties,
    	MemorySegment pTimeDomainsCounter
    ) {
        MethodHandle method = device.VK_GET_SWAPCHAIN_TIME_DOMAIN_PROPERTIES_EXT().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                swapchain,
                pSwapchainTimeDomainProperties,
                pTimeDomainsCounter
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetSwapchainTimeDomainPropertiesEXT].
    public static int vkGetSwapchainTimeDomainPropertiesEXT(
    	VkDevice device,
    	VkSwapchainKHR swapchain,
    	VkSwapchainTimeDomainPropertiesEXT pSwapchainTimeDomainProperties,
    	@Nullable NativeLongArray pTimeDomainsCounter
    ) {
    	return vkGetSwapchainTimeDomainPropertiesEXT(
    		device,
    		swapchain.memorySegment(),
    		pSwapchainTimeDomainProperties.memorySegment(),
    		pTimeDomainsCounter == null ? MemorySegment.NULL : pTimeDomainsCounter.memorySegment()
    	);
    }
    
    public static int vkGetPastPresentationTimingEXT(
        VkDevice device,
    	MemorySegment pPastPresentationTimingInfo,
    	MemorySegment pPastPresentationTimingProperties
    ) {
        MethodHandle method = device.VK_GET_PAST_PRESENTATION_TIMING_EXT().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                pPastPresentationTimingInfo,
                pPastPresentationTimingProperties
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetPastPresentationTimingEXT].
    public static int vkGetPastPresentationTimingEXT(
    	VkDevice device,
    	VkPastPresentationTimingInfoEXT pPastPresentationTimingInfo,
    	VkPastPresentationTimingPropertiesEXT pPastPresentationTimingProperties
    ) {
    	return vkGetPastPresentationTimingEXT(
    		device,
    		pPastPresentationTimingInfo.memorySegment(),
    		pPastPresentationTimingProperties.memorySegment()
    	);
    }
    
    public static int vkInitializePerformanceApiINTEL(
        VkDevice device,
    	MemorySegment pInitializeInfo
    ) {
        MethodHandle method = device.VK_INITIALIZE_PERFORMANCE_API_INTEL().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                pInitializeInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkInitializePerformanceApiINTEL].
    public static int vkInitializePerformanceApiINTEL(
    	VkDevice device,
    	VkInitializePerformanceApiInfoINTEL pInitializeInfo
    ) {
    	return vkInitializePerformanceApiINTEL(
    		device,
    		pInitializeInfo.memorySegment()
    	);
    }
    
    public static void vkUninitializePerformanceApiINTEL(
        VkDevice device
    ) {
        MethodHandle method = device.VK_UNINITIALIZE_PERFORMANCE_API_INTEL().get();
        try {
             method.invokeExact(
                device.memorySegment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    
    public static int vkCmdSetPerformanceMarkerINTEL(
        VkCommandBuffer commandBuffer,
    	MemorySegment pMarkerInfo
    ) {
        MethodHandle method = commandBuffer.VK_CMD_SET_PERFORMANCE_MARKER_INTEL().get();
        try {
            return (int) method.invokeExact(
                commandBuffer.memorySegment(),
                pMarkerInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdSetPerformanceMarkerINTEL].
    public static int vkCmdSetPerformanceMarkerINTEL(
    	VkCommandBuffer commandBuffer,
    	VkPerformanceMarkerInfoINTEL pMarkerInfo
    ) {
    	return vkCmdSetPerformanceMarkerINTEL(
    		commandBuffer,
    		pMarkerInfo.memorySegment()
    	);
    }
    
    public static int vkCmdSetPerformanceStreamMarkerINTEL(
        VkCommandBuffer commandBuffer,
    	MemorySegment pMarkerInfo
    ) {
        MethodHandle method = commandBuffer.VK_CMD_SET_PERFORMANCE_STREAM_MARKER_INTEL().get();
        try {
            return (int) method.invokeExact(
                commandBuffer.memorySegment(),
                pMarkerInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdSetPerformanceStreamMarkerINTEL].
    public static int vkCmdSetPerformanceStreamMarkerINTEL(
    	VkCommandBuffer commandBuffer,
    	VkPerformanceStreamMarkerInfoINTEL pMarkerInfo
    ) {
    	return vkCmdSetPerformanceStreamMarkerINTEL(
    		commandBuffer,
    		pMarkerInfo.memorySegment()
    	);
    }
    
    public static int vkCmdSetPerformanceOverrideINTEL(
        VkCommandBuffer commandBuffer,
    	MemorySegment pOverrideInfo
    ) {
        MethodHandle method = commandBuffer.VK_CMD_SET_PERFORMANCE_OVERRIDE_INTEL().get();
        try {
            return (int) method.invokeExact(
                commandBuffer.memorySegment(),
                pOverrideInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdSetPerformanceOverrideINTEL].
    public static int vkCmdSetPerformanceOverrideINTEL(
    	VkCommandBuffer commandBuffer,
    	VkPerformanceOverrideInfoINTEL pOverrideInfo
    ) {
    	return vkCmdSetPerformanceOverrideINTEL(
    		commandBuffer,
    		pOverrideInfo.memorySegment()
    	);
    }
    
    public static int vkAcquirePerformanceConfigurationINTEL(
        VkDevice device,
    	MemorySegment pAcquireInfo,
    	MemorySegment pConfiguration
    ) {
        MethodHandle method = device.VK_ACQUIRE_PERFORMANCE_CONFIGURATION_INTEL().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                pAcquireInfo,
                pConfiguration
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkAcquirePerformanceConfigurationINTEL].
    public static int vkAcquirePerformanceConfigurationINTEL(
    	VkDevice device,
    	VkPerformanceConfigurationAcquireInfoINTEL pAcquireInfo,
    	NativePointerArray pConfiguration
    ) {
    	return vkAcquirePerformanceConfigurationINTEL(
    		device,
    		pAcquireInfo.memorySegment(),
    		pConfiguration.memorySegment()
    	);
    }
    
    public static int vkReleasePerformanceConfigurationINTEL(
        VkDevice device,
    	MemorySegment configuration
    ) {
        MethodHandle method = device.VK_RELEASE_PERFORMANCE_CONFIGURATION_INTEL().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                configuration
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkReleasePerformanceConfigurationINTEL].
    public static int vkReleasePerformanceConfigurationINTEL(
    	VkDevice device,
    	@Nullable VkPerformanceConfigurationINTEL configuration
    ) {
    	return vkReleasePerformanceConfigurationINTEL(
    		device,
    		configuration == null ? MemorySegment.NULL : configuration.memorySegment()
    	);
    }
    
    public static int vkQueueSetPerformanceConfigurationINTEL(
        VkQueue queue,
    	MemorySegment configuration
    ) {
        MethodHandle method = queue.VK_QUEUE_SET_PERFORMANCE_CONFIGURATION_INTEL().get();
        try {
            return (int) method.invokeExact(
                queue.memorySegment(),
                configuration
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkQueueSetPerformanceConfigurationINTEL].
    public static int vkQueueSetPerformanceConfigurationINTEL(
    	VkQueue queue,
    	VkPerformanceConfigurationINTEL configuration
    ) {
    	return vkQueueSetPerformanceConfigurationINTEL(
    		queue,
    		configuration.memorySegment()
    	);
    }
    
    public static int vkGetPerformanceParameterINTEL(
        VkDevice device,
    	int parameter,
    	MemorySegment pValue
    ) {
        MethodHandle method = device.VK_GET_PERFORMANCE_PARAMETER_INTEL().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                parameter,
                pValue
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetPerformanceParameterINTEL].
    public static int vkGetPerformanceParameterINTEL(
    	VkDevice device,
    	int parameter,
    	VkPerformanceValueINTEL pValue
    ) {
    	return vkGetPerformanceParameterINTEL(
    		device,
    		parameter,
    		pValue.memorySegment()
    	);
    }
    
    public static void vkSetLocalDimmingAMD(
        VkDevice device,
    	MemorySegment swapChain,
    	int localDimmingEnable
    ) {
        MethodHandle method = device.VK_SET_LOCAL_DIMMING_AMD().get();
        try {
             method.invokeExact(
                device.memorySegment(),
                swapChain,
                localDimmingEnable
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkSetLocalDimmingAMD].
    public static void vkSetLocalDimmingAMD(
    	VkDevice device,
    	VkSwapchainKHR swapChain,
    	int localDimmingEnable
    ) {
    	vkSetLocalDimmingAMD(
    		device,
    		swapChain.memorySegment(),
    		localDimmingEnable
    	);
    }
    
    public static int vkGetPhysicalDeviceCooperativeMatrixPropertiesNV(
        VkPhysicalDevice physicalDevice,
    	MemorySegment pPropertyCount,
    	MemorySegment pProperties
    ) {
        MethodHandle method = physicalDevice.VK_GET_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_PROPERTIES_NV().get();
        try {
            return (int) method.invokeExact(
                physicalDevice.memorySegment(),
                pPropertyCount,
                pProperties
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetPhysicalDeviceCooperativeMatrixPropertiesNV].
    public static int vkGetPhysicalDeviceCooperativeMatrixPropertiesNV(
    	VkPhysicalDevice physicalDevice,
    	NativeIntArray pPropertyCount,
    	@Nullable NativeStructArray<VkCooperativeMatrixPropertiesNV> pProperties
    ) {
    	return vkGetPhysicalDeviceCooperativeMatrixPropertiesNV(
    		physicalDevice,
    		pPropertyCount.memorySegment(),
    		pProperties == null ? MemorySegment.NULL : pProperties.memorySegment()
    	);
    }
    
    public static int vkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV(
        VkPhysicalDevice physicalDevice,
    	MemorySegment pCombinationCount,
    	MemorySegment pCombinations
    ) {
        MethodHandle method = physicalDevice.VK_GET_PHYSICAL_DEVICE_SUPPORTED_FRAMEBUFFER_MIXED_SAMPLES_COMBINATIONS_NV().get();
        try {
            return (int) method.invokeExact(
                physicalDevice.memorySegment(),
                pCombinationCount,
                pCombinations
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV].
    public static int vkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV(
    	VkPhysicalDevice physicalDevice,
    	NativeIntArray pCombinationCount,
    	@Nullable NativeStructArray<VkFramebufferMixedSamplesCombinationNV> pCombinations
    ) {
    	return vkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV(
    		physicalDevice,
    		pCombinationCount.memorySegment(),
    		pCombinations == null ? MemorySegment.NULL : pCombinations.memorySegment()
    	);
    }
    
    public static int vkCreateHeadlessSurfaceEXT(
        VkInstance instance,
    	MemorySegment pCreateInfo,
    	MemorySegment pAllocator,
    	MemorySegment pSurface
    ) {
        MethodHandle method = instance.VK_CREATE_HEADLESS_SURFACE_EXT().get();
        try {
            return (int) method.invokeExact(
                instance.memorySegment(),
                pCreateInfo,
                pAllocator,
                pSurface
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCreateHeadlessSurfaceEXT].
    public static int vkCreateHeadlessSurfaceEXT(
    	VkInstance instance,
    	VkHeadlessSurfaceCreateInfoEXT pCreateInfo,
    	@Nullable VkAllocationCallbacks pAllocator,
    	NativePointerArray pSurface
    ) {
    	return vkCreateHeadlessSurfaceEXT(
    		instance,
    		pCreateInfo.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment(),
    		pSurface.memorySegment()
    	);
    }
    
    public static void vkGetGeneratedCommandsMemoryRequirementsNV(
        VkDevice device,
    	MemorySegment pInfo,
    	MemorySegment pMemoryRequirements
    ) {
        MethodHandle method = device.VK_GET_GENERATED_COMMANDS_MEMORY_REQUIREMENTS_NV().get();
        try {
             method.invokeExact(
                device.memorySegment(),
                pInfo,
                pMemoryRequirements
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetGeneratedCommandsMemoryRequirementsNV].
    public static void vkGetGeneratedCommandsMemoryRequirementsNV(
    	VkDevice device,
    	VkGeneratedCommandsMemoryRequirementsInfoNV pInfo,
    	VkMemoryRequirements2 pMemoryRequirements
    ) {
    	vkGetGeneratedCommandsMemoryRequirementsNV(
    		device,
    		pInfo.memorySegment(),
    		pMemoryRequirements.memorySegment()
    	);
    }
    
    public static void vkCmdPreprocessGeneratedCommandsNV(
        VkCommandBuffer commandBuffer,
    	MemorySegment pGeneratedCommandsInfo
    ) {
        MethodHandle method = commandBuffer.VK_CMD_PREPROCESS_GENERATED_COMMANDS_NV().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                pGeneratedCommandsInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdPreprocessGeneratedCommandsNV].
    public static void vkCmdPreprocessGeneratedCommandsNV(
    	VkCommandBuffer commandBuffer,
    	VkGeneratedCommandsInfoNV pGeneratedCommandsInfo
    ) {
    	vkCmdPreprocessGeneratedCommandsNV(
    		commandBuffer,
    		pGeneratedCommandsInfo.memorySegment()
    	);
    }
    
    public static void vkCmdExecuteGeneratedCommandsNV(
        VkCommandBuffer commandBuffer,
    	int isPreprocessed,
    	MemorySegment pGeneratedCommandsInfo
    ) {
        MethodHandle method = commandBuffer.VK_CMD_EXECUTE_GENERATED_COMMANDS_NV().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                isPreprocessed,
                pGeneratedCommandsInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdExecuteGeneratedCommandsNV].
    public static void vkCmdExecuteGeneratedCommandsNV(
    	VkCommandBuffer commandBuffer,
    	int isPreprocessed,
    	VkGeneratedCommandsInfoNV pGeneratedCommandsInfo
    ) {
    	vkCmdExecuteGeneratedCommandsNV(
    		commandBuffer,
    		isPreprocessed,
    		pGeneratedCommandsInfo.memorySegment()
    	);
    }
    
    public static void vkCmdBindPipelineShaderGroupNV(
        VkCommandBuffer commandBuffer,
    	int pipelineBindPoint,
    	MemorySegment pipeline,
    	int groupIndex
    ) {
        MethodHandle method = commandBuffer.VK_CMD_BIND_PIPELINE_SHADER_GROUP_NV().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                pipelineBindPoint,
                pipeline,
                groupIndex
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdBindPipelineShaderGroupNV].
    public static void vkCmdBindPipelineShaderGroupNV(
    	VkCommandBuffer commandBuffer,
    	int pipelineBindPoint,
    	VkPipeline pipeline,
    	int groupIndex
    ) {
    	vkCmdBindPipelineShaderGroupNV(
    		commandBuffer,
    		pipelineBindPoint,
    		pipeline.memorySegment(),
    		groupIndex
    	);
    }
    
    public static int vkCreateIndirectCommandsLayoutNV(
        VkDevice device,
    	MemorySegment pCreateInfo,
    	MemorySegment pAllocator,
    	MemorySegment pIndirectCommandsLayout
    ) {
        MethodHandle method = device.VK_CREATE_INDIRECT_COMMANDS_LAYOUT_NV().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                pCreateInfo,
                pAllocator,
                pIndirectCommandsLayout
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCreateIndirectCommandsLayoutNV].
    public static int vkCreateIndirectCommandsLayoutNV(
    	VkDevice device,
    	VkIndirectCommandsLayoutCreateInfoNV pCreateInfo,
    	@Nullable VkAllocationCallbacks pAllocator,
    	NativePointerArray pIndirectCommandsLayout
    ) {
    	return vkCreateIndirectCommandsLayoutNV(
    		device,
    		pCreateInfo.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment(),
    		pIndirectCommandsLayout.memorySegment()
    	);
    }
    
    public static void vkDestroyIndirectCommandsLayoutNV(
        VkDevice device,
    	MemorySegment indirectCommandsLayout,
    	MemorySegment pAllocator
    ) {
        MethodHandle method = device.VK_DESTROY_INDIRECT_COMMANDS_LAYOUT_NV().get();
        try {
             method.invokeExact(
                device.memorySegment(),
                indirectCommandsLayout,
                pAllocator
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkDestroyIndirectCommandsLayoutNV].
    public static void vkDestroyIndirectCommandsLayoutNV(
    	VkDevice device,
    	@Nullable VkIndirectCommandsLayoutNV indirectCommandsLayout,
    	@Nullable VkAllocationCallbacks pAllocator
    ) {
    	vkDestroyIndirectCommandsLayoutNV(
    		device,
    		indirectCommandsLayout == null ? MemorySegment.NULL : indirectCommandsLayout.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment()
    	);
    }
    
    public static void vkCmdSetDepthBias2EXT(
        VkCommandBuffer commandBuffer,
    	MemorySegment pDepthBiasInfo
    ) {
        MethodHandle method = commandBuffer.VK_CMD_SET_DEPTH_BIAS2_EXT().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                pDepthBiasInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdSetDepthBias2EXT].
    public static void vkCmdSetDepthBias2EXT(
    	VkCommandBuffer commandBuffer,
    	VkDepthBiasInfoEXT pDepthBiasInfo
    ) {
    	vkCmdSetDepthBias2EXT(
    		commandBuffer,
    		pDepthBiasInfo.memorySegment()
    	);
    }
    
    public static int vkAcquireDrmDisplayEXT(
        VkPhysicalDevice physicalDevice,
    	int drmFd,
    	MemorySegment display
    ) {
        MethodHandle method = physicalDevice.VK_ACQUIRE_DRM_DISPLAY_EXT().get();
        try {
            return (int) method.invokeExact(
                physicalDevice.memorySegment(),
                drmFd,
                display
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkAcquireDrmDisplayEXT].
    public static int vkAcquireDrmDisplayEXT(
    	VkPhysicalDevice physicalDevice,
    	int drmFd,
    	VkDisplayKHR display
    ) {
    	return vkAcquireDrmDisplayEXT(
    		physicalDevice,
    		drmFd,
    		display.memorySegment()
    	);
    }
    
    public static int vkGetDrmDisplayEXT(
        VkPhysicalDevice physicalDevice,
    	int drmFd,
    	int connectorId,
    	MemorySegment display
    ) {
        MethodHandle method = physicalDevice.VK_GET_DRM_DISPLAY_EXT().get();
        try {
            return (int) method.invokeExact(
                physicalDevice.memorySegment(),
                drmFd,
                connectorId,
                display
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetDrmDisplayEXT].
    public static int vkGetDrmDisplayEXT(
    	VkPhysicalDevice physicalDevice,
    	int drmFd,
    	int connectorId,
    	NativePointerArray display
    ) {
    	return vkGetDrmDisplayEXT(
    		physicalDevice,
    		drmFd,
    		connectorId,
    		display.memorySegment()
    	);
    }
    
    public static int vkQueueSetPerfHintQCOM(
        VkQueue queue,
    	MemorySegment pPerfHintInfo
    ) {
        MethodHandle method = queue.VK_QUEUE_SET_PERF_HINT_QCOM().get();
        try {
            return (int) method.invokeExact(
                queue.memorySegment(),
                pPerfHintInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkQueueSetPerfHintQCOM].
    public static int vkQueueSetPerfHintQCOM(
    	VkQueue queue,
    	VkPerfHintInfoQCOM pPerfHintInfo
    ) {
    	return vkQueueSetPerfHintQCOM(
    		queue,
    		pPerfHintInfo.memorySegment()
    	);
    }
    
    public static void vkCmdDispatchTileQCOM(
        VkCommandBuffer commandBuffer,
    	MemorySegment pDispatchTileInfo
    ) {
        MethodHandle method = commandBuffer.VK_CMD_DISPATCH_TILE_QCOM().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                pDispatchTileInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdDispatchTileQCOM].
    public static void vkCmdDispatchTileQCOM(
    	VkCommandBuffer commandBuffer,
    	VkDispatchTileInfoQCOM pDispatchTileInfo
    ) {
    	vkCmdDispatchTileQCOM(
    		commandBuffer,
    		pDispatchTileInfo.memorySegment()
    	);
    }
    
    public static void vkCmdBeginPerTileExecutionQCOM(
        VkCommandBuffer commandBuffer,
    	MemorySegment pPerTileBeginInfo
    ) {
        MethodHandle method = commandBuffer.VK_CMD_BEGIN_PER_TILE_EXECUTION_QCOM().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                pPerTileBeginInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdBeginPerTileExecutionQCOM].
    public static void vkCmdBeginPerTileExecutionQCOM(
    	VkCommandBuffer commandBuffer,
    	VkPerTileBeginInfoQCOM pPerTileBeginInfo
    ) {
    	vkCmdBeginPerTileExecutionQCOM(
    		commandBuffer,
    		pPerTileBeginInfo.memorySegment()
    	);
    }
    
    public static void vkCmdEndPerTileExecutionQCOM(
        VkCommandBuffer commandBuffer,
    	MemorySegment pPerTileEndInfo
    ) {
        MethodHandle method = commandBuffer.VK_CMD_END_PER_TILE_EXECUTION_QCOM().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                pPerTileEndInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdEndPerTileExecutionQCOM].
    public static void vkCmdEndPerTileExecutionQCOM(
    	VkCommandBuffer commandBuffer,
    	VkPerTileEndInfoQCOM pPerTileEndInfo
    ) {
    	vkCmdEndPerTileExecutionQCOM(
    		commandBuffer,
    		pPerTileEndInfo.memorySegment()
    	);
    }
    
    public static void vkSetLatencySleepModeLegacyNV(
        VkDevice device,
    	int lowLatencyMode,
    	int lowLatencyBoost,
    	int minimumIntervalUs
    ) {
        MethodHandle method = device.VK_SET_LATENCY_SLEEP_MODE_LEGACY_NV().get();
        try {
             method.invokeExact(
                device.memorySegment(),
                lowLatencyMode,
                lowLatencyBoost,
                minimumIntervalUs
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    
    public static void vkLatencySleepLegacyNV(
        VkDevice device,
    	MemorySegment signalSemaphore,
    	long value
    ) {
        MethodHandle method = device.VK_LATENCY_SLEEP_LEGACY_NV().get();
        try {
             method.invokeExact(
                device.memorySegment(),
                signalSemaphore,
                value
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkLatencySleepLegacyNV].
    public static void vkLatencySleepLegacyNV(
    	VkDevice device,
    	VkSemaphore signalSemaphore,
    	long value
    ) {
    	vkLatencySleepLegacyNV(
    		device,
    		signalSemaphore.memorySegment(),
    		value
    	);
    }
    
    public static void vkSetLatencyMarkerLegacyNV(
        VkDevice device,
    	long frameID,
    	int marker
    ) {
        MethodHandle method = device.VK_SET_LATENCY_MARKER_LEGACY_NV().get();
        try {
             method.invokeExact(
                device.memorySegment(),
                frameID,
                marker
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    
    public static void vkGetLatencyTimingsLegacyNV(
        VkDevice device,
    	MemorySegment pTimings
    ) {
        MethodHandle method = device.VK_GET_LATENCY_TIMINGS_LEGACY_NV().get();
        try {
             method.invokeExact(
                device.memorySegment(),
                pTimings
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    
    public static void vkQueueNotifyOutOfBandLegacyNV(
        VkQueue queue,
    	int queueType
    ) {
        MethodHandle method = queue.VK_QUEUE_NOTIFY_OUT_OF_BAND_LEGACY_NV().get();
        try {
             method.invokeExact(
                queue.memorySegment(),
                queueType
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    
    public static void vkGetSleepStatusLegacyNV(
        VkDevice device,
    	MemorySegment pLowLatencyMode
    ) {
        MethodHandle method = device.VK_GET_SLEEP_STATUS_LEGACY_NV().get();
        try {
             method.invokeExact(
                device.memorySegment(),
                pLowLatencyMode
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetSleepStatusLegacyNV].
    public static void vkGetSleepStatusLegacyNV(
    	VkDevice device,
    	NativeIntArray pLowLatencyMode
    ) {
    	vkGetSleepStatusLegacyNV(
    		device,
    		pLowLatencyMode.memorySegment()
    	);
    }
    
    public static void vkShutdownLatencyDeviceLegacyNV(
        VkDevice device
    ) {
        MethodHandle method = device.VK_SHUTDOWN_LATENCY_DEVICE_LEGACY_NV().get();
        try {
             method.invokeExact(
                device.memorySegment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    
    public static void vkGetDescriptorSetLayoutSizeEXT(
        VkDevice device,
    	MemorySegment layout,
    	MemorySegment pLayoutSizeInBytes
    ) {
        MethodHandle method = device.VK_GET_DESCRIPTOR_SET_LAYOUT_SIZE_EXT().get();
        try {
             method.invokeExact(
                device.memorySegment(),
                layout,
                pLayoutSizeInBytes
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetDescriptorSetLayoutSizeEXT].
    public static void vkGetDescriptorSetLayoutSizeEXT(
    	VkDevice device,
    	VkDescriptorSetLayout layout,
    	NativeLongArray pLayoutSizeInBytes
    ) {
    	vkGetDescriptorSetLayoutSizeEXT(
    		device,
    		layout.memorySegment(),
    		pLayoutSizeInBytes.memorySegment()
    	);
    }
    
    public static void vkGetDescriptorSetLayoutBindingOffsetEXT(
        VkDevice device,
    	MemorySegment layout,
    	int binding,
    	MemorySegment pOffset
    ) {
        MethodHandle method = device.VK_GET_DESCRIPTOR_SET_LAYOUT_BINDING_OFFSET_EXT().get();
        try {
             method.invokeExact(
                device.memorySegment(),
                layout,
                binding,
                pOffset
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetDescriptorSetLayoutBindingOffsetEXT].
    public static void vkGetDescriptorSetLayoutBindingOffsetEXT(
    	VkDevice device,
    	VkDescriptorSetLayout layout,
    	int binding,
    	NativeLongArray pOffset
    ) {
    	vkGetDescriptorSetLayoutBindingOffsetEXT(
    		device,
    		layout.memorySegment(),
    		binding,
    		pOffset.memorySegment()
    	);
    }
    
    public static void vkGetDescriptorEXT(
        VkDevice device,
    	MemorySegment pDescriptorInfo,
    	long dataSize,
    	MemorySegment pDescriptor
    ) {
        MethodHandle method = device.VK_GET_DESCRIPTOR_EXT().get();
        try {
             method.invokeExact(
                device.memorySegment(),
                pDescriptorInfo,
                dataSize,
                pDescriptor
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetDescriptorEXT].
    public static void vkGetDescriptorEXT(
    	VkDevice device,
    	VkDescriptorGetInfoEXT pDescriptorInfo,
    	long dataSize,
    	MemorySegment pDescriptor
    ) {
    	vkGetDescriptorEXT(
    		device,
    		pDescriptorInfo.memorySegment(),
    		dataSize,
    		pDescriptor
    	);
    }
    
    public static void vkCmdBindDescriptorBuffersEXT(
        VkCommandBuffer commandBuffer,
    	int bufferCount,
    	MemorySegment pBindingInfos
    ) {
        MethodHandle method = commandBuffer.VK_CMD_BIND_DESCRIPTOR_BUFFERS_EXT().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                bufferCount,
                pBindingInfos
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdBindDescriptorBuffersEXT].
    public static void vkCmdBindDescriptorBuffersEXT(
    	VkCommandBuffer commandBuffer,
    	int bufferCount,
    	NativeStructArray<VkDescriptorBufferBindingInfoEXT> pBindingInfos
    ) {
    	vkCmdBindDescriptorBuffersEXT(
    		commandBuffer,
    		bufferCount,
    		pBindingInfos.memorySegment()
    	);
    }
    
    public static void vkCmdSetDescriptorBufferOffsetsEXT(
        VkCommandBuffer commandBuffer,
    	int pipelineBindPoint,
    	MemorySegment layout,
    	int firstSet,
    	int setCount,
    	MemorySegment pBufferIndices,
    	MemorySegment pOffsets
    ) {
        MethodHandle method = commandBuffer.VK_CMD_SET_DESCRIPTOR_BUFFER_OFFSETS_EXT().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                pipelineBindPoint,
                layout,
                firstSet,
                setCount,
                pBufferIndices,
                pOffsets
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdSetDescriptorBufferOffsetsEXT].
    public static void vkCmdSetDescriptorBufferOffsetsEXT(
    	VkCommandBuffer commandBuffer,
    	int pipelineBindPoint,
    	VkPipelineLayout layout,
    	int firstSet,
    	int setCount,
    	NativeIntArray pBufferIndices,
    	NativeLongArray pOffsets
    ) {
    	vkCmdSetDescriptorBufferOffsetsEXT(
    		commandBuffer,
    		pipelineBindPoint,
    		layout.memorySegment(),
    		firstSet,
    		setCount,
    		pBufferIndices.memorySegment(),
    		pOffsets.memorySegment()
    	);
    }
    
    public static void vkCmdBindDescriptorBufferEmbeddedSamplersEXT(
        VkCommandBuffer commandBuffer,
    	int pipelineBindPoint,
    	MemorySegment layout,
    	int set
    ) {
        MethodHandle method = commandBuffer.VK_CMD_BIND_DESCRIPTOR_BUFFER_EMBEDDED_SAMPLERS_EXT().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                pipelineBindPoint,
                layout,
                set
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdBindDescriptorBufferEmbeddedSamplersEXT].
    public static void vkCmdBindDescriptorBufferEmbeddedSamplersEXT(
    	VkCommandBuffer commandBuffer,
    	int pipelineBindPoint,
    	VkPipelineLayout layout,
    	int set
    ) {
    	vkCmdBindDescriptorBufferEmbeddedSamplersEXT(
    		commandBuffer,
    		pipelineBindPoint,
    		layout.memorySegment(),
    		set
    	);
    }
    
    public static int vkGetBufferOpaqueCaptureDescriptorDataEXT(
        VkDevice device,
    	MemorySegment pInfo,
    	MemorySegment pData
    ) {
        MethodHandle method = device.VK_GET_BUFFER_OPAQUE_CAPTURE_DESCRIPTOR_DATA_EXT().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                pInfo,
                pData
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetBufferOpaqueCaptureDescriptorDataEXT].
    public static int vkGetBufferOpaqueCaptureDescriptorDataEXT(
    	VkDevice device,
    	VkBufferCaptureDescriptorDataInfoEXT pInfo,
    	MemorySegment pData
    ) {
    	return vkGetBufferOpaqueCaptureDescriptorDataEXT(
    		device,
    		pInfo.memorySegment(),
    		pData
    	);
    }
    
    public static int vkGetImageOpaqueCaptureDescriptorDataEXT(
        VkDevice device,
    	MemorySegment pInfo,
    	MemorySegment pData
    ) {
        MethodHandle method = device.VK_GET_IMAGE_OPAQUE_CAPTURE_DESCRIPTOR_DATA_EXT().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                pInfo,
                pData
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetImageOpaqueCaptureDescriptorDataEXT].
    public static int vkGetImageOpaqueCaptureDescriptorDataEXT(
    	VkDevice device,
    	VkImageCaptureDescriptorDataInfoEXT pInfo,
    	MemorySegment pData
    ) {
    	return vkGetImageOpaqueCaptureDescriptorDataEXT(
    		device,
    		pInfo.memorySegment(),
    		pData
    	);
    }
    
    public static int vkGetImageViewOpaqueCaptureDescriptorDataEXT(
        VkDevice device,
    	MemorySegment pInfo,
    	MemorySegment pData
    ) {
        MethodHandle method = device.VK_GET_IMAGE_VIEW_OPAQUE_CAPTURE_DESCRIPTOR_DATA_EXT().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                pInfo,
                pData
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetImageViewOpaqueCaptureDescriptorDataEXT].
    public static int vkGetImageViewOpaqueCaptureDescriptorDataEXT(
    	VkDevice device,
    	VkImageViewCaptureDescriptorDataInfoEXT pInfo,
    	MemorySegment pData
    ) {
    	return vkGetImageViewOpaqueCaptureDescriptorDataEXT(
    		device,
    		pInfo.memorySegment(),
    		pData
    	);
    }
    
    public static int vkGetSamplerOpaqueCaptureDescriptorDataEXT(
        VkDevice device,
    	MemorySegment pInfo,
    	MemorySegment pData
    ) {
        MethodHandle method = device.VK_GET_SAMPLER_OPAQUE_CAPTURE_DESCRIPTOR_DATA_EXT().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                pInfo,
                pData
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetSamplerOpaqueCaptureDescriptorDataEXT].
    public static int vkGetSamplerOpaqueCaptureDescriptorDataEXT(
    	VkDevice device,
    	VkSamplerCaptureDescriptorDataInfoEXT pInfo,
    	MemorySegment pData
    ) {
    	return vkGetSamplerOpaqueCaptureDescriptorDataEXT(
    		device,
    		pInfo.memorySegment(),
    		pData
    	);
    }
    
    public static int vkGetAccelerationStructureOpaqueCaptureDescriptorDataEXT(
        VkDevice device,
    	MemorySegment pInfo,
    	MemorySegment pData
    ) {
        MethodHandle method = device.VK_GET_ACCELERATION_STRUCTURE_OPAQUE_CAPTURE_DESCRIPTOR_DATA_EXT().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                pInfo,
                pData
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetAccelerationStructureOpaqueCaptureDescriptorDataEXT].
    public static int vkGetAccelerationStructureOpaqueCaptureDescriptorDataEXT(
    	VkDevice device,
    	VkAccelerationStructureCaptureDescriptorDataInfoEXT pInfo,
    	MemorySegment pData
    ) {
    	return vkGetAccelerationStructureOpaqueCaptureDescriptorDataEXT(
    		device,
    		pInfo.memorySegment(),
    		pData
    	);
    }
    
    public static void vkCmdSetFragmentShadingRateEnumNV(
        VkCommandBuffer commandBuffer,
    	int shadingRate,
    	MemorySegment combinerOps
    ) {
        MethodHandle method = commandBuffer.VK_CMD_SET_FRAGMENT_SHADING_RATE_ENUM_NV().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                shadingRate,
                combinerOps
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    
    public static int vkGetDeviceFaultInfoEXT(
        VkDevice device,
    	MemorySegment pFaultCounts,
    	MemorySegment pFaultInfo
    ) {
        MethodHandle method = device.VK_GET_DEVICE_FAULT_INFO_EXT().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                pFaultCounts,
                pFaultInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetDeviceFaultInfoEXT].
    public static int vkGetDeviceFaultInfoEXT(
    	VkDevice device,
    	VkDeviceFaultCountsEXT pFaultCounts,
    	@Nullable VkDeviceFaultInfoEXT pFaultInfo
    ) {
    	return vkGetDeviceFaultInfoEXT(
    		device,
    		pFaultCounts.memorySegment(),
    		pFaultInfo == null ? MemorySegment.NULL : pFaultInfo.memorySegment()
    	);
    }
    
    public static void vkCmdSetVertexInputEXT(
        VkCommandBuffer commandBuffer,
    	int vertexBindingDescriptionCount,
    	MemorySegment pVertexBindingDescriptions,
    	int vertexAttributeDescriptionCount,
    	MemorySegment pVertexAttributeDescriptions
    ) {
        MethodHandle method = commandBuffer.VK_CMD_SET_VERTEX_INPUT_EXT().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                vertexBindingDescriptionCount,
                pVertexBindingDescriptions,
                vertexAttributeDescriptionCount,
                pVertexAttributeDescriptions
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdSetVertexInputEXT].
    public static void vkCmdSetVertexInputEXT(
    	VkCommandBuffer commandBuffer,
    	int vertexBindingDescriptionCount,
    	@Nullable NativeStructArray<VkVertexInputBindingDescription2EXT> pVertexBindingDescriptions,
    	int vertexAttributeDescriptionCount,
    	@Nullable NativeStructArray<VkVertexInputAttributeDescription2EXT> pVertexAttributeDescriptions
    ) {
    	vkCmdSetVertexInputEXT(
    		commandBuffer,
    		vertexBindingDescriptionCount,
    		pVertexBindingDescriptions == null ? MemorySegment.NULL : pVertexBindingDescriptions.memorySegment(),
    		vertexAttributeDescriptionCount,
    		pVertexAttributeDescriptions == null ? MemorySegment.NULL : pVertexAttributeDescriptions.memorySegment()
    	);
    }
    
    public static int vkGetDeviceSubpassShadingMaxWorkgroupSizeHUAWEI(
        VkDevice device,
    	MemorySegment renderpass,
    	MemorySegment pMaxWorkgroupSize
    ) {
        MethodHandle method = device.VK_GET_DEVICE_SUBPASS_SHADING_MAX_WORKGROUP_SIZE_HUAWEI().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                renderpass,
                pMaxWorkgroupSize
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetDeviceSubpassShadingMaxWorkgroupSizeHUAWEI].
    public static int vkGetDeviceSubpassShadingMaxWorkgroupSizeHUAWEI(
    	VkDevice device,
    	VkRenderPass renderpass,
    	NativeStructArray<VkExtent2D> pMaxWorkgroupSize
    ) {
    	return vkGetDeviceSubpassShadingMaxWorkgroupSizeHUAWEI(
    		device,
    		renderpass.memorySegment(),
    		pMaxWorkgroupSize.memorySegment()
    	);
    }
    
    public static void vkCmdSubpassShadingHUAWEI(
        VkCommandBuffer commandBuffer
    ) {
        MethodHandle method = commandBuffer.VK_CMD_SUBPASS_SHADING_HUAWEI().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    
    public static void vkCmdBindInvocationMaskHUAWEI(
        VkCommandBuffer commandBuffer,
    	MemorySegment imageView,
    	int imageLayout
    ) {
        MethodHandle method = commandBuffer.VK_CMD_BIND_INVOCATION_MASK_HUAWEI().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                imageView,
                imageLayout
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdBindInvocationMaskHUAWEI].
    public static void vkCmdBindInvocationMaskHUAWEI(
    	VkCommandBuffer commandBuffer,
    	@Nullable VkImageView imageView,
    	int imageLayout
    ) {
    	vkCmdBindInvocationMaskHUAWEI(
    		commandBuffer,
    		imageView == null ? MemorySegment.NULL : imageView.memorySegment(),
    		imageLayout
    	);
    }
    
    public static int vkGetMemoryRemoteAddressNV(
        VkDevice device,
    	MemorySegment pMemoryGetRemoteAddressInfo,
    	MemorySegment pAddress
    ) {
        MethodHandle method = device.VK_GET_MEMORY_REMOTE_ADDRESS_NV().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                pMemoryGetRemoteAddressInfo,
                pAddress
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetMemoryRemoteAddressNV].
    public static int vkGetMemoryRemoteAddressNV(
    	VkDevice device,
    	VkMemoryGetRemoteAddressInfoNV pMemoryGetRemoteAddressInfo,
    	NativePointerArray pAddress
    ) {
    	return vkGetMemoryRemoteAddressNV(
    		device,
    		pMemoryGetRemoteAddressInfo.memorySegment(),
    		pAddress.memorySegment()
    	);
    }
    
    public static int vkGetPipelinePropertiesEXT(
        VkDevice device,
    	MemorySegment pPipelineInfo,
    	MemorySegment pPipelineProperties
    ) {
        MethodHandle method = device.VK_GET_PIPELINE_PROPERTIES_EXT().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                pPipelineInfo,
                pPipelineProperties
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetPipelinePropertiesEXT].
    public static int vkGetPipelinePropertiesEXT(
    	VkDevice device,
    	VkPipelineInfoKHR pPipelineInfo,
    	VkBaseOutStructure pPipelineProperties
    ) {
    	return vkGetPipelinePropertiesEXT(
    		device,
    		pPipelineInfo.memorySegment(),
    		pPipelineProperties.memorySegment()
    	);
    }
    
    public static void vkCmdSetPatchControlPointsEXT(
        VkCommandBuffer commandBuffer,
    	int patchControlPoints
    ) {
        MethodHandle method = commandBuffer.VK_CMD_SET_PATCH_CONTROL_POINTS_EXT().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                patchControlPoints
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    
    public static void vkCmdSetLogicOpEXT(
        VkCommandBuffer commandBuffer,
    	int logicOp
    ) {
        MethodHandle method = commandBuffer.VK_CMD_SET_LOGIC_OP_EXT().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                logicOp
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    
    public static void vkCmdSetColorWriteEnableEXT(
        VkCommandBuffer commandBuffer,
    	int attachmentCount,
    	MemorySegment pColorWriteEnables
    ) {
        MethodHandle method = commandBuffer.VK_CMD_SET_COLOR_WRITE_ENABLE_EXT().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                attachmentCount,
                pColorWriteEnables
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdSetColorWriteEnableEXT].
    public static void vkCmdSetColorWriteEnableEXT(
    	VkCommandBuffer commandBuffer,
    	int attachmentCount,
    	NativeIntArray pColorWriteEnables
    ) {
    	vkCmdSetColorWriteEnableEXT(
    		commandBuffer,
    		attachmentCount,
    		pColorWriteEnables.memorySegment()
    	);
    }
    
    public static void vkCmdDrawMultiEXT(
        VkCommandBuffer commandBuffer,
    	int drawCount,
    	MemorySegment pVertexInfo,
    	int instanceCount,
    	int firstInstance,
    	int stride
    ) {
        MethodHandle method = commandBuffer.VK_CMD_DRAW_MULTI_EXT().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                drawCount,
                pVertexInfo,
                instanceCount,
                firstInstance,
                stride
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdDrawMultiEXT].
    public static void vkCmdDrawMultiEXT(
    	VkCommandBuffer commandBuffer,
    	int drawCount,
    	@Nullable NativeStructArray<VkMultiDrawInfoEXT> pVertexInfo,
    	int instanceCount,
    	int firstInstance,
    	int stride
    ) {
    	vkCmdDrawMultiEXT(
    		commandBuffer,
    		drawCount,
    		pVertexInfo == null ? MemorySegment.NULL : pVertexInfo.memorySegment(),
    		instanceCount,
    		firstInstance,
    		stride
    	);
    }
    
    public static void vkCmdDrawMultiIndexedEXT(
        VkCommandBuffer commandBuffer,
    	int drawCount,
    	MemorySegment pIndexInfo,
    	int instanceCount,
    	int firstInstance,
    	int stride,
    	MemorySegment pVertexOffset
    ) {
        MethodHandle method = commandBuffer.VK_CMD_DRAW_MULTI_INDEXED_EXT().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                drawCount,
                pIndexInfo,
                instanceCount,
                firstInstance,
                stride,
                pVertexOffset
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdDrawMultiIndexedEXT].
    public static void vkCmdDrawMultiIndexedEXT(
    	VkCommandBuffer commandBuffer,
    	int drawCount,
    	@Nullable NativeStructArray<VkMultiDrawIndexedInfoEXT> pIndexInfo,
    	int instanceCount,
    	int firstInstance,
    	int stride,
    	@Nullable NativeIntArray pVertexOffset
    ) {
    	vkCmdDrawMultiIndexedEXT(
    		commandBuffer,
    		drawCount,
    		pIndexInfo == null ? MemorySegment.NULL : pIndexInfo.memorySegment(),
    		instanceCount,
    		firstInstance,
    		stride,
    		pVertexOffset == null ? MemorySegment.NULL : pVertexOffset.memorySegment()
    	);
    }
    
    public static int vkCreateMicromapEXT(
        VkDevice device,
    	MemorySegment pCreateInfo,
    	MemorySegment pAllocator,
    	MemorySegment pMicromap
    ) {
        MethodHandle method = device.VK_CREATE_MICROMAP_EXT().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                pCreateInfo,
                pAllocator,
                pMicromap
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCreateMicromapEXT].
    public static int vkCreateMicromapEXT(
    	VkDevice device,
    	VkMicromapCreateInfoEXT pCreateInfo,
    	@Nullable VkAllocationCallbacks pAllocator,
    	NativePointerArray pMicromap
    ) {
    	return vkCreateMicromapEXT(
    		device,
    		pCreateInfo.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment(),
    		pMicromap.memorySegment()
    	);
    }
    
    public static void vkDestroyMicromapEXT(
        VkDevice device,
    	MemorySegment micromap,
    	MemorySegment pAllocator
    ) {
        MethodHandle method = device.VK_DESTROY_MICROMAP_EXT().get();
        try {
             method.invokeExact(
                device.memorySegment(),
                micromap,
                pAllocator
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkDestroyMicromapEXT].
    public static void vkDestroyMicromapEXT(
    	VkDevice device,
    	@Nullable VkMicromapEXT micromap,
    	@Nullable VkAllocationCallbacks pAllocator
    ) {
    	vkDestroyMicromapEXT(
    		device,
    		micromap == null ? MemorySegment.NULL : micromap.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment()
    	);
    }
    
    public static void vkCmdBuildMicromapsEXT(
        VkCommandBuffer commandBuffer,
    	int infoCount,
    	MemorySegment pInfos
    ) {
        MethodHandle method = commandBuffer.VK_CMD_BUILD_MICROMAPS_EXT().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                infoCount,
                pInfos
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdBuildMicromapsEXT].
    public static void vkCmdBuildMicromapsEXT(
    	VkCommandBuffer commandBuffer,
    	int infoCount,
    	NativeStructArray<VkMicromapBuildInfoEXT> pInfos
    ) {
    	vkCmdBuildMicromapsEXT(
    		commandBuffer,
    		infoCount,
    		pInfos.memorySegment()
    	);
    }
    
    public static int vkBuildMicromapsEXT(
        VkDevice device,
    	MemorySegment deferredOperation,
    	int infoCount,
    	MemorySegment pInfos
    ) {
        MethodHandle method = device.VK_BUILD_MICROMAPS_EXT().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                deferredOperation,
                infoCount,
                pInfos
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkBuildMicromapsEXT].
    public static int vkBuildMicromapsEXT(
    	VkDevice device,
    	@Nullable VkDeferredOperationKHR deferredOperation,
    	int infoCount,
    	NativeStructArray<VkMicromapBuildInfoEXT> pInfos
    ) {
    	return vkBuildMicromapsEXT(
    		device,
    		deferredOperation == null ? MemorySegment.NULL : deferredOperation.memorySegment(),
    		infoCount,
    		pInfos.memorySegment()
    	);
    }
    
    public static int vkCopyMicromapEXT(
        VkDevice device,
    	MemorySegment deferredOperation,
    	MemorySegment pInfo
    ) {
        MethodHandle method = device.VK_COPY_MICROMAP_EXT().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                deferredOperation,
                pInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCopyMicromapEXT].
    public static int vkCopyMicromapEXT(
    	VkDevice device,
    	@Nullable VkDeferredOperationKHR deferredOperation,
    	VkCopyMicromapInfoEXT pInfo
    ) {
    	return vkCopyMicromapEXT(
    		device,
    		deferredOperation == null ? MemorySegment.NULL : deferredOperation.memorySegment(),
    		pInfo.memorySegment()
    	);
    }
    
    public static int vkCopyMicromapToMemoryEXT(
        VkDevice device,
    	MemorySegment deferredOperation,
    	MemorySegment pInfo
    ) {
        MethodHandle method = device.VK_COPY_MICROMAP_TO_MEMORY_EXT().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                deferredOperation,
                pInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCopyMicromapToMemoryEXT].
    public static int vkCopyMicromapToMemoryEXT(
    	VkDevice device,
    	@Nullable VkDeferredOperationKHR deferredOperation,
    	VkCopyMicromapToMemoryInfoEXT pInfo
    ) {
    	return vkCopyMicromapToMemoryEXT(
    		device,
    		deferredOperation == null ? MemorySegment.NULL : deferredOperation.memorySegment(),
    		pInfo.memorySegment()
    	);
    }
    
    public static int vkCopyMemoryToMicromapEXT(
        VkDevice device,
    	MemorySegment deferredOperation,
    	MemorySegment pInfo
    ) {
        MethodHandle method = device.VK_COPY_MEMORY_TO_MICROMAP_EXT().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                deferredOperation,
                pInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCopyMemoryToMicromapEXT].
    public static int vkCopyMemoryToMicromapEXT(
    	VkDevice device,
    	@Nullable VkDeferredOperationKHR deferredOperation,
    	VkCopyMemoryToMicromapInfoEXT pInfo
    ) {
    	return vkCopyMemoryToMicromapEXT(
    		device,
    		deferredOperation == null ? MemorySegment.NULL : deferredOperation.memorySegment(),
    		pInfo.memorySegment()
    	);
    }
    
    public static int vkWriteMicromapsPropertiesEXT(
        VkDevice device,
    	int micromapCount,
    	MemorySegment pMicromaps,
    	int queryType,
    	long dataSize,
    	MemorySegment pData,
    	long stride
    ) {
        MethodHandle method = device.VK_WRITE_MICROMAPS_PROPERTIES_EXT().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                micromapCount,
                pMicromaps,
                queryType,
                dataSize,
                pData,
                stride
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkWriteMicromapsPropertiesEXT].
    public static int vkWriteMicromapsPropertiesEXT(
    	VkDevice device,
    	int micromapCount,
    	NativePointerArray pMicromaps,
    	int queryType,
    	long dataSize,
    	MemorySegment pData,
    	long stride
    ) {
    	return vkWriteMicromapsPropertiesEXT(
    		device,
    		micromapCount,
    		pMicromaps.memorySegment(),
    		queryType,
    		dataSize,
    		pData,
    		stride
    	);
    }
    
    public static void vkCmdCopyMicromapEXT(
        VkCommandBuffer commandBuffer,
    	MemorySegment pInfo
    ) {
        MethodHandle method = commandBuffer.VK_CMD_COPY_MICROMAP_EXT().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                pInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdCopyMicromapEXT].
    public static void vkCmdCopyMicromapEXT(
    	VkCommandBuffer commandBuffer,
    	VkCopyMicromapInfoEXT pInfo
    ) {
    	vkCmdCopyMicromapEXT(
    		commandBuffer,
    		pInfo.memorySegment()
    	);
    }
    
    public static void vkCmdCopyMicromapToMemoryEXT(
        VkCommandBuffer commandBuffer,
    	MemorySegment pInfo
    ) {
        MethodHandle method = commandBuffer.VK_CMD_COPY_MICROMAP_TO_MEMORY_EXT().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                pInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdCopyMicromapToMemoryEXT].
    public static void vkCmdCopyMicromapToMemoryEXT(
    	VkCommandBuffer commandBuffer,
    	VkCopyMicromapToMemoryInfoEXT pInfo
    ) {
    	vkCmdCopyMicromapToMemoryEXT(
    		commandBuffer,
    		pInfo.memorySegment()
    	);
    }
    
    public static void vkCmdCopyMemoryToMicromapEXT(
        VkCommandBuffer commandBuffer,
    	MemorySegment pInfo
    ) {
        MethodHandle method = commandBuffer.VK_CMD_COPY_MEMORY_TO_MICROMAP_EXT().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                pInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdCopyMemoryToMicromapEXT].
    public static void vkCmdCopyMemoryToMicromapEXT(
    	VkCommandBuffer commandBuffer,
    	VkCopyMemoryToMicromapInfoEXT pInfo
    ) {
    	vkCmdCopyMemoryToMicromapEXT(
    		commandBuffer,
    		pInfo.memorySegment()
    	);
    }
    
    public static void vkCmdWriteMicromapsPropertiesEXT(
        VkCommandBuffer commandBuffer,
    	int micromapCount,
    	MemorySegment pMicromaps,
    	int queryType,
    	MemorySegment queryPool,
    	int firstQuery
    ) {
        MethodHandle method = commandBuffer.VK_CMD_WRITE_MICROMAPS_PROPERTIES_EXT().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                micromapCount,
                pMicromaps,
                queryType,
                queryPool,
                firstQuery
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdWriteMicromapsPropertiesEXT].
    public static void vkCmdWriteMicromapsPropertiesEXT(
    	VkCommandBuffer commandBuffer,
    	int micromapCount,
    	NativePointerArray pMicromaps,
    	int queryType,
    	VkQueryPool queryPool,
    	int firstQuery
    ) {
    	vkCmdWriteMicromapsPropertiesEXT(
    		commandBuffer,
    		micromapCount,
    		pMicromaps.memorySegment(),
    		queryType,
    		queryPool.memorySegment(),
    		firstQuery
    	);
    }
    
    public static void vkGetDeviceMicromapCompatibilityEXT(
        VkDevice device,
    	MemorySegment pVersionInfo,
    	MemorySegment pCompatibility
    ) {
        MethodHandle method = device.VK_GET_DEVICE_MICROMAP_COMPATIBILITY_EXT().get();
        try {
             method.invokeExact(
                device.memorySegment(),
                pVersionInfo,
                pCompatibility
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetDeviceMicromapCompatibilityEXT].
    public static void vkGetDeviceMicromapCompatibilityEXT(
    	VkDevice device,
    	VkMicromapVersionInfoEXT pVersionInfo,
    	NativeIntArray pCompatibility
    ) {
    	vkGetDeviceMicromapCompatibilityEXT(
    		device,
    		pVersionInfo.memorySegment(),
    		pCompatibility.memorySegment()
    	);
    }
    
    public static void vkGetMicromapBuildSizesEXT(
        VkDevice device,
    	int buildType,
    	MemorySegment pBuildInfo,
    	MemorySegment pSizeInfo
    ) {
        MethodHandle method = device.VK_GET_MICROMAP_BUILD_SIZES_EXT().get();
        try {
             method.invokeExact(
                device.memorySegment(),
                buildType,
                pBuildInfo,
                pSizeInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetMicromapBuildSizesEXT].
    public static void vkGetMicromapBuildSizesEXT(
    	VkDevice device,
    	int buildType,
    	VkMicromapBuildInfoEXT pBuildInfo,
    	VkMicromapBuildSizesInfoEXT pSizeInfo
    ) {
    	vkGetMicromapBuildSizesEXT(
    		device,
    		buildType,
    		pBuildInfo.memorySegment(),
    		pSizeInfo.memorySegment()
    	);
    }
    
    public static void vkCmdDrawClusterHUAWEI(
        VkCommandBuffer commandBuffer,
    	int groupCountX,
    	int groupCountY,
    	int groupCountZ
    ) {
        MethodHandle method = commandBuffer.VK_CMD_DRAW_CLUSTER_HUAWEI().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                groupCountX,
                groupCountY,
                groupCountZ
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    
    public static void vkCmdDrawClusterIndirectHUAWEI(
        VkCommandBuffer commandBuffer,
    	MemorySegment buffer,
    	long offset
    ) {
        MethodHandle method = commandBuffer.VK_CMD_DRAW_CLUSTER_INDIRECT_HUAWEI().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                buffer,
                offset
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdDrawClusterIndirectHUAWEI].
    public static void vkCmdDrawClusterIndirectHUAWEI(
    	VkCommandBuffer commandBuffer,
    	VkBuffer buffer,
    	long offset
    ) {
    	vkCmdDrawClusterIndirectHUAWEI(
    		commandBuffer,
    		buffer.memorySegment(),
    		offset
    	);
    }
    
    public static void vkSetDeviceMemoryPriorityEXT(
        VkDevice device,
    	MemorySegment memory,
    	float priority
    ) {
        MethodHandle method = device.VK_SET_DEVICE_MEMORY_PRIORITY_EXT().get();
        try {
             method.invokeExact(
                device.memorySegment(),
                memory,
                priority
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkSetDeviceMemoryPriorityEXT].
    public static void vkSetDeviceMemoryPriorityEXT(
    	VkDevice device,
    	VkDeviceMemory memory,
    	float priority
    ) {
    	vkSetDeviceMemoryPriorityEXT(
    		device,
    		memory.memorySegment(),
    		priority
    	);
    }
    
    public static void vkCmdSetDispatchParametersARM(
        VkCommandBuffer commandBuffer,
    	MemorySegment pDispatchParameters
    ) {
        MethodHandle method = commandBuffer.VK_CMD_SET_DISPATCH_PARAMETERS_ARM().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                pDispatchParameters
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdSetDispatchParametersARM].
    public static void vkCmdSetDispatchParametersARM(
    	VkCommandBuffer commandBuffer,
    	VkDispatchParametersARM pDispatchParameters
    ) {
    	vkCmdSetDispatchParametersARM(
    		commandBuffer,
    		pDispatchParameters.memorySegment()
    	);
    }
    
    public static void vkGetDescriptorSetLayoutHostMappingInfoVALVE(
        VkDevice device,
    	MemorySegment pBindingReference,
    	MemorySegment pHostMapping
    ) {
        MethodHandle method = device.VK_GET_DESCRIPTOR_SET_LAYOUT_HOST_MAPPING_INFO_VALVE().get();
        try {
             method.invokeExact(
                device.memorySegment(),
                pBindingReference,
                pHostMapping
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetDescriptorSetLayoutHostMappingInfoVALVE].
    public static void vkGetDescriptorSetLayoutHostMappingInfoVALVE(
    	VkDevice device,
    	VkDescriptorSetBindingReferenceVALVE pBindingReference,
    	VkDescriptorSetLayoutHostMappingInfoVALVE pHostMapping
    ) {
    	vkGetDescriptorSetLayoutHostMappingInfoVALVE(
    		device,
    		pBindingReference.memorySegment(),
    		pHostMapping.memorySegment()
    	);
    }
    
    public static void vkGetDescriptorSetHostMappingVALVE(
        VkDevice device,
    	MemorySegment descriptorSet,
    	MemorySegment ppData
    ) {
        MethodHandle method = device.VK_GET_DESCRIPTOR_SET_HOST_MAPPING_VALVE().get();
        try {
             method.invokeExact(
                device.memorySegment(),
                descriptorSet,
                ppData
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetDescriptorSetHostMappingVALVE].
    public static void vkGetDescriptorSetHostMappingVALVE(
    	VkDevice device,
    	VkDescriptorSet descriptorSet,
    	NativePointerArray ppData
    ) {
    	vkGetDescriptorSetHostMappingVALVE(
    		device,
    		descriptorSet.memorySegment(),
    		ppData.memorySegment()
    	);
    }
    
    public static void vkCmdCopyMemoryIndirectNV(
        VkCommandBuffer commandBuffer,
    	long copyBufferAddress,
    	int copyCount,
    	int stride
    ) {
        MethodHandle method = commandBuffer.VK_CMD_COPY_MEMORY_INDIRECT_NV().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                copyBufferAddress,
                copyCount,
                stride
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    
    public static void vkCmdCopyMemoryToImageIndirectNV(
        VkCommandBuffer commandBuffer,
    	long copyBufferAddress,
    	int copyCount,
    	int stride,
    	MemorySegment dstImage,
    	int dstImageLayout,
    	MemorySegment pImageSubresources
    ) {
        MethodHandle method = commandBuffer.VK_CMD_COPY_MEMORY_TO_IMAGE_INDIRECT_NV().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                copyBufferAddress,
                copyCount,
                stride,
                dstImage,
                dstImageLayout,
                pImageSubresources
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdCopyMemoryToImageIndirectNV].
    public static void vkCmdCopyMemoryToImageIndirectNV(
    	VkCommandBuffer commandBuffer,
    	long copyBufferAddress,
    	int copyCount,
    	int stride,
    	VkImage dstImage,
    	int dstImageLayout,
    	NativeStructArray<VkImageSubresourceLayers> pImageSubresources
    ) {
    	vkCmdCopyMemoryToImageIndirectNV(
    		commandBuffer,
    		copyBufferAddress,
    		copyCount,
    		stride,
    		dstImage.memorySegment(),
    		dstImageLayout,
    		pImageSubresources.memorySegment()
    	);
    }
    
    public static void vkCmdDecompressMemoryNV(
        VkCommandBuffer commandBuffer,
    	int decompressRegionCount,
    	MemorySegment pDecompressMemoryRegions
    ) {
        MethodHandle method = commandBuffer.VK_CMD_DECOMPRESS_MEMORY_NV().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                decompressRegionCount,
                pDecompressMemoryRegions
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdDecompressMemoryNV].
    public static void vkCmdDecompressMemoryNV(
    	VkCommandBuffer commandBuffer,
    	int decompressRegionCount,
    	NativeStructArray<VkDecompressMemoryRegionNV> pDecompressMemoryRegions
    ) {
    	vkCmdDecompressMemoryNV(
    		commandBuffer,
    		decompressRegionCount,
    		pDecompressMemoryRegions.memorySegment()
    	);
    }
    
    public static void vkCmdDecompressMemoryIndirectCountNV(
        VkCommandBuffer commandBuffer,
    	long indirectCommandsAddress,
    	long indirectCommandsCountAddress,
    	int stride
    ) {
        MethodHandle method = commandBuffer.VK_CMD_DECOMPRESS_MEMORY_INDIRECT_COUNT_NV().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                indirectCommandsAddress,
                indirectCommandsCountAddress,
                stride
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    
    public static void vkGetPipelineIndirectMemoryRequirementsNV(
        VkDevice device,
    	MemorySegment pCreateInfo,
    	MemorySegment pMemoryRequirements
    ) {
        MethodHandle method = device.VK_GET_PIPELINE_INDIRECT_MEMORY_REQUIREMENTS_NV().get();
        try {
             method.invokeExact(
                device.memorySegment(),
                pCreateInfo,
                pMemoryRequirements
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetPipelineIndirectMemoryRequirementsNV].
    public static void vkGetPipelineIndirectMemoryRequirementsNV(
    	VkDevice device,
    	VkComputePipelineCreateInfo pCreateInfo,
    	VkMemoryRequirements2 pMemoryRequirements
    ) {
    	vkGetPipelineIndirectMemoryRequirementsNV(
    		device,
    		pCreateInfo.memorySegment(),
    		pMemoryRequirements.memorySegment()
    	);
    }
    
    public static void vkCmdUpdatePipelineIndirectBufferNV(
        VkCommandBuffer commandBuffer,
    	int pipelineBindPoint,
    	MemorySegment pipeline
    ) {
        MethodHandle method = commandBuffer.VK_CMD_UPDATE_PIPELINE_INDIRECT_BUFFER_NV().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                pipelineBindPoint,
                pipeline
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdUpdatePipelineIndirectBufferNV].
    public static void vkCmdUpdatePipelineIndirectBufferNV(
    	VkCommandBuffer commandBuffer,
    	int pipelineBindPoint,
    	VkPipeline pipeline
    ) {
    	vkCmdUpdatePipelineIndirectBufferNV(
    		commandBuffer,
    		pipelineBindPoint,
    		pipeline.memorySegment()
    	);
    }
    
    public static long vkGetPipelineIndirectDeviceAddressNV(
        VkDevice device,
    	MemorySegment pInfo
    ) {
        MethodHandle method = device.VK_GET_PIPELINE_INDIRECT_DEVICE_ADDRESS_NV().get();
        try {
            return (long) method.invokeExact(
                device.memorySegment(),
                pInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetPipelineIndirectDeviceAddressNV].
    public static long vkGetPipelineIndirectDeviceAddressNV(
    	VkDevice device,
    	VkPipelineIndirectDeviceAddressInfoNV pInfo
    ) {
    	return vkGetPipelineIndirectDeviceAddressNV(
    		device,
    		pInfo.memorySegment()
    	);
    }
    
    public static void vkCmdSetDepthClampEnableEXT(
        VkCommandBuffer commandBuffer,
    	int depthClampEnable
    ) {
        MethodHandle method = commandBuffer.VK_CMD_SET_DEPTH_CLAMP_ENABLE_EXT().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                depthClampEnable
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    
    public static void vkCmdSetPolygonModeEXT(
        VkCommandBuffer commandBuffer,
    	int polygonMode
    ) {
        MethodHandle method = commandBuffer.VK_CMD_SET_POLYGON_MODE_EXT().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                polygonMode
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    
    public static void vkCmdSetRasterizationSamplesEXT(
        VkCommandBuffer commandBuffer,
    	int rasterizationSamples
    ) {
        MethodHandle method = commandBuffer.VK_CMD_SET_RASTERIZATION_SAMPLES_EXT().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                rasterizationSamples
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    
    public static void vkCmdSetSampleMaskEXT(
        VkCommandBuffer commandBuffer,
    	int samples,
    	MemorySegment pSampleMask
    ) {
        MethodHandle method = commandBuffer.VK_CMD_SET_SAMPLE_MASK_EXT().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                samples,
                pSampleMask
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdSetSampleMaskEXT].
    public static void vkCmdSetSampleMaskEXT(
    	VkCommandBuffer commandBuffer,
    	int samples,
    	@Nullable NativeIntArray pSampleMask
    ) {
    	vkCmdSetSampleMaskEXT(
    		commandBuffer,
    		samples,
    		pSampleMask == null ? MemorySegment.NULL : pSampleMask.memorySegment()
    	);
    }
    
    public static void vkCmdSetAlphaToCoverageEnableEXT(
        VkCommandBuffer commandBuffer,
    	int alphaToCoverageEnable
    ) {
        MethodHandle method = commandBuffer.VK_CMD_SET_ALPHA_TO_COVERAGE_ENABLE_EXT().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                alphaToCoverageEnable
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    
    public static void vkCmdSetAlphaToOneEnableEXT(
        VkCommandBuffer commandBuffer,
    	int alphaToOneEnable
    ) {
        MethodHandle method = commandBuffer.VK_CMD_SET_ALPHA_TO_ONE_ENABLE_EXT().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                alphaToOneEnable
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    
    public static void vkCmdSetLogicOpEnableEXT(
        VkCommandBuffer commandBuffer,
    	int logicOpEnable
    ) {
        MethodHandle method = commandBuffer.VK_CMD_SET_LOGIC_OP_ENABLE_EXT().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                logicOpEnable
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    
    public static void vkCmdSetColorBlendEnableEXT(
        VkCommandBuffer commandBuffer,
    	int firstAttachment,
    	int attachmentCount,
    	MemorySegment pColorBlendEnables
    ) {
        MethodHandle method = commandBuffer.VK_CMD_SET_COLOR_BLEND_ENABLE_EXT().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                firstAttachment,
                attachmentCount,
                pColorBlendEnables
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdSetColorBlendEnableEXT].
    public static void vkCmdSetColorBlendEnableEXT(
    	VkCommandBuffer commandBuffer,
    	int firstAttachment,
    	int attachmentCount,
    	NativeIntArray pColorBlendEnables
    ) {
    	vkCmdSetColorBlendEnableEXT(
    		commandBuffer,
    		firstAttachment,
    		attachmentCount,
    		pColorBlendEnables.memorySegment()
    	);
    }
    
    public static void vkCmdSetColorBlendEquationEXT(
        VkCommandBuffer commandBuffer,
    	int firstAttachment,
    	int attachmentCount,
    	MemorySegment pColorBlendEquations
    ) {
        MethodHandle method = commandBuffer.VK_CMD_SET_COLOR_BLEND_EQUATION_EXT().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                firstAttachment,
                attachmentCount,
                pColorBlendEquations
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdSetColorBlendEquationEXT].
    public static void vkCmdSetColorBlendEquationEXT(
    	VkCommandBuffer commandBuffer,
    	int firstAttachment,
    	int attachmentCount,
    	NativeStructArray<VkColorBlendEquationEXT> pColorBlendEquations
    ) {
    	vkCmdSetColorBlendEquationEXT(
    		commandBuffer,
    		firstAttachment,
    		attachmentCount,
    		pColorBlendEquations.memorySegment()
    	);
    }
    
    public static void vkCmdSetColorWriteMaskEXT(
        VkCommandBuffer commandBuffer,
    	int firstAttachment,
    	int attachmentCount,
    	MemorySegment pColorWriteMasks
    ) {
        MethodHandle method = commandBuffer.VK_CMD_SET_COLOR_WRITE_MASK_EXT().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                firstAttachment,
                attachmentCount,
                pColorWriteMasks
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdSetColorWriteMaskEXT].
    public static void vkCmdSetColorWriteMaskEXT(
    	VkCommandBuffer commandBuffer,
    	int firstAttachment,
    	int attachmentCount,
    	NativeIntArray pColorWriteMasks
    ) {
    	vkCmdSetColorWriteMaskEXT(
    		commandBuffer,
    		firstAttachment,
    		attachmentCount,
    		pColorWriteMasks.memorySegment()
    	);
    }
    
    public static void vkCmdSetTessellationDomainOriginEXT(
        VkCommandBuffer commandBuffer,
    	int domainOrigin
    ) {
        MethodHandle method = commandBuffer.VK_CMD_SET_TESSELLATION_DOMAIN_ORIGIN_EXT().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                domainOrigin
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    
    public static void vkCmdSetRasterizationStreamEXT(
        VkCommandBuffer commandBuffer,
    	int rasterizationStream
    ) {
        MethodHandle method = commandBuffer.VK_CMD_SET_RASTERIZATION_STREAM_EXT().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                rasterizationStream
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    
    public static void vkCmdSetConservativeRasterizationModeEXT(
        VkCommandBuffer commandBuffer,
    	int conservativeRasterizationMode
    ) {
        MethodHandle method = commandBuffer.VK_CMD_SET_CONSERVATIVE_RASTERIZATION_MODE_EXT().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                conservativeRasterizationMode
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    
    public static void vkCmdSetExtraPrimitiveOverestimationSizeEXT(
        VkCommandBuffer commandBuffer,
    	float extraPrimitiveOverestimationSize
    ) {
        MethodHandle method = commandBuffer.VK_CMD_SET_EXTRA_PRIMITIVE_OVERESTIMATION_SIZE_EXT().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                extraPrimitiveOverestimationSize
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    
    public static void vkCmdSetDepthClipEnableEXT(
        VkCommandBuffer commandBuffer,
    	int depthClipEnable
    ) {
        MethodHandle method = commandBuffer.VK_CMD_SET_DEPTH_CLIP_ENABLE_EXT().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                depthClipEnable
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    
    public static void vkCmdSetSampleLocationsEnableEXT(
        VkCommandBuffer commandBuffer,
    	int sampleLocationsEnable
    ) {
        MethodHandle method = commandBuffer.VK_CMD_SET_SAMPLE_LOCATIONS_ENABLE_EXT().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                sampleLocationsEnable
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    
    public static void vkCmdSetColorBlendAdvancedEXT(
        VkCommandBuffer commandBuffer,
    	int firstAttachment,
    	int attachmentCount,
    	MemorySegment pColorBlendAdvanced
    ) {
        MethodHandle method = commandBuffer.VK_CMD_SET_COLOR_BLEND_ADVANCED_EXT().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                firstAttachment,
                attachmentCount,
                pColorBlendAdvanced
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdSetColorBlendAdvancedEXT].
    public static void vkCmdSetColorBlendAdvancedEXT(
    	VkCommandBuffer commandBuffer,
    	int firstAttachment,
    	int attachmentCount,
    	NativeStructArray<VkColorBlendAdvancedEXT> pColorBlendAdvanced
    ) {
    	vkCmdSetColorBlendAdvancedEXT(
    		commandBuffer,
    		firstAttachment,
    		attachmentCount,
    		pColorBlendAdvanced.memorySegment()
    	);
    }
    
    public static void vkCmdSetProvokingVertexModeEXT(
        VkCommandBuffer commandBuffer,
    	int provokingVertexMode
    ) {
        MethodHandle method = commandBuffer.VK_CMD_SET_PROVOKING_VERTEX_MODE_EXT().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                provokingVertexMode
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    
    public static void vkCmdSetLineRasterizationModeEXT(
        VkCommandBuffer commandBuffer,
    	int lineRasterizationMode
    ) {
        MethodHandle method = commandBuffer.VK_CMD_SET_LINE_RASTERIZATION_MODE_EXT().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                lineRasterizationMode
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    
    public static void vkCmdSetLineStippleEnableEXT(
        VkCommandBuffer commandBuffer,
    	int stippledLineEnable
    ) {
        MethodHandle method = commandBuffer.VK_CMD_SET_LINE_STIPPLE_ENABLE_EXT().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                stippledLineEnable
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    
    public static void vkCmdSetDepthClipNegativeOneToOneEXT(
        VkCommandBuffer commandBuffer,
    	int negativeOneToOne
    ) {
        MethodHandle method = commandBuffer.VK_CMD_SET_DEPTH_CLIP_NEGATIVE_ONE_TO_ONE_EXT().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                negativeOneToOne
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    
    public static void vkCmdSetViewportWScalingEnableNV(
        VkCommandBuffer commandBuffer,
    	int viewportWScalingEnable
    ) {
        MethodHandle method = commandBuffer.VK_CMD_SET_VIEWPORT_WSCALING_ENABLE_NV().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                viewportWScalingEnable
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    
    public static void vkCmdSetViewportSwizzleNV(
        VkCommandBuffer commandBuffer,
    	int firstViewport,
    	int viewportCount,
    	MemorySegment pViewportSwizzles
    ) {
        MethodHandle method = commandBuffer.VK_CMD_SET_VIEWPORT_SWIZZLE_NV().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                firstViewport,
                viewportCount,
                pViewportSwizzles
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdSetViewportSwizzleNV].
    public static void vkCmdSetViewportSwizzleNV(
    	VkCommandBuffer commandBuffer,
    	int firstViewport,
    	int viewportCount,
    	NativeStructArray<VkViewportSwizzleNV> pViewportSwizzles
    ) {
    	vkCmdSetViewportSwizzleNV(
    		commandBuffer,
    		firstViewport,
    		viewportCount,
    		pViewportSwizzles.memorySegment()
    	);
    }
    
    public static void vkCmdSetCoverageToColorEnableNV(
        VkCommandBuffer commandBuffer,
    	int coverageToColorEnable
    ) {
        MethodHandle method = commandBuffer.VK_CMD_SET_COVERAGE_TO_COLOR_ENABLE_NV().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                coverageToColorEnable
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    
    public static void vkCmdSetCoverageToColorLocationNV(
        VkCommandBuffer commandBuffer,
    	int coverageToColorLocation
    ) {
        MethodHandle method = commandBuffer.VK_CMD_SET_COVERAGE_TO_COLOR_LOCATION_NV().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                coverageToColorLocation
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    
    public static void vkCmdSetCoverageModulationModeNV(
        VkCommandBuffer commandBuffer,
    	int coverageModulationMode
    ) {
        MethodHandle method = commandBuffer.VK_CMD_SET_COVERAGE_MODULATION_MODE_NV().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                coverageModulationMode
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    
    public static void vkCmdSetCoverageModulationTableEnableNV(
        VkCommandBuffer commandBuffer,
    	int coverageModulationTableEnable
    ) {
        MethodHandle method = commandBuffer.VK_CMD_SET_COVERAGE_MODULATION_TABLE_ENABLE_NV().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                coverageModulationTableEnable
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    
    public static void vkCmdSetCoverageModulationTableNV(
        VkCommandBuffer commandBuffer,
    	int coverageModulationTableCount,
    	MemorySegment pCoverageModulationTable
    ) {
        MethodHandle method = commandBuffer.VK_CMD_SET_COVERAGE_MODULATION_TABLE_NV().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                coverageModulationTableCount,
                pCoverageModulationTable
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdSetCoverageModulationTableNV].
    public static void vkCmdSetCoverageModulationTableNV(
    	VkCommandBuffer commandBuffer,
    	int coverageModulationTableCount,
    	NativeFloatArray pCoverageModulationTable
    ) {
    	vkCmdSetCoverageModulationTableNV(
    		commandBuffer,
    		coverageModulationTableCount,
    		pCoverageModulationTable.memorySegment()
    	);
    }
    
    public static void vkCmdSetShadingRateImageEnableNV(
        VkCommandBuffer commandBuffer,
    	int shadingRateImageEnable
    ) {
        MethodHandle method = commandBuffer.VK_CMD_SET_SHADING_RATE_IMAGE_ENABLE_NV().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                shadingRateImageEnable
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    
    public static void vkCmdSetRepresentativeFragmentTestEnableNV(
        VkCommandBuffer commandBuffer,
    	int representativeFragmentTestEnable
    ) {
        MethodHandle method = commandBuffer.VK_CMD_SET_REPRESENTATIVE_FRAGMENT_TEST_ENABLE_NV().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                representativeFragmentTestEnable
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    
    public static void vkCmdSetCoverageReductionModeNV(
        VkCommandBuffer commandBuffer,
    	int coverageReductionMode
    ) {
        MethodHandle method = commandBuffer.VK_CMD_SET_COVERAGE_REDUCTION_MODE_NV().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                coverageReductionMode
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    
    public static int vkCreateTensorARM(
        VkDevice device,
    	MemorySegment pCreateInfo,
    	MemorySegment pAllocator,
    	MemorySegment pTensor
    ) {
        MethodHandle method = device.VK_CREATE_TENSOR_ARM().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                pCreateInfo,
                pAllocator,
                pTensor
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCreateTensorARM].
    public static int vkCreateTensorARM(
    	VkDevice device,
    	VkTensorCreateInfoARM pCreateInfo,
    	@Nullable VkAllocationCallbacks pAllocator,
    	NativePointerArray pTensor
    ) {
    	return vkCreateTensorARM(
    		device,
    		pCreateInfo.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment(),
    		pTensor.memorySegment()
    	);
    }
    
    public static void vkDestroyTensorARM(
        VkDevice device,
    	MemorySegment tensor,
    	MemorySegment pAllocator
    ) {
        MethodHandle method = device.VK_DESTROY_TENSOR_ARM().get();
        try {
             method.invokeExact(
                device.memorySegment(),
                tensor,
                pAllocator
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkDestroyTensorARM].
    public static void vkDestroyTensorARM(
    	VkDevice device,
    	@Nullable VkTensorARM tensor,
    	@Nullable VkAllocationCallbacks pAllocator
    ) {
    	vkDestroyTensorARM(
    		device,
    		tensor == null ? MemorySegment.NULL : tensor.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment()
    	);
    }
    
    public static int vkCreateTensorViewARM(
        VkDevice device,
    	MemorySegment pCreateInfo,
    	MemorySegment pAllocator,
    	MemorySegment pView
    ) {
        MethodHandle method = device.VK_CREATE_TENSOR_VIEW_ARM().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                pCreateInfo,
                pAllocator,
                pView
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCreateTensorViewARM].
    public static int vkCreateTensorViewARM(
    	VkDevice device,
    	VkTensorViewCreateInfoARM pCreateInfo,
    	@Nullable VkAllocationCallbacks pAllocator,
    	NativePointerArray pView
    ) {
    	return vkCreateTensorViewARM(
    		device,
    		pCreateInfo.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment(),
    		pView.memorySegment()
    	);
    }
    
    public static void vkDestroyTensorViewARM(
        VkDevice device,
    	MemorySegment tensorView,
    	MemorySegment pAllocator
    ) {
        MethodHandle method = device.VK_DESTROY_TENSOR_VIEW_ARM().get();
        try {
             method.invokeExact(
                device.memorySegment(),
                tensorView,
                pAllocator
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkDestroyTensorViewARM].
    public static void vkDestroyTensorViewARM(
    	VkDevice device,
    	@Nullable VkTensorViewARM tensorView,
    	@Nullable VkAllocationCallbacks pAllocator
    ) {
    	vkDestroyTensorViewARM(
    		device,
    		tensorView == null ? MemorySegment.NULL : tensorView.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment()
    	);
    }
    
    public static void vkGetTensorMemoryRequirementsARM(
        VkDevice device,
    	MemorySegment pInfo,
    	MemorySegment pMemoryRequirements
    ) {
        MethodHandle method = device.VK_GET_TENSOR_MEMORY_REQUIREMENTS_ARM().get();
        try {
             method.invokeExact(
                device.memorySegment(),
                pInfo,
                pMemoryRequirements
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetTensorMemoryRequirementsARM].
    public static void vkGetTensorMemoryRequirementsARM(
    	VkDevice device,
    	VkTensorMemoryRequirementsInfoARM pInfo,
    	VkMemoryRequirements2 pMemoryRequirements
    ) {
    	vkGetTensorMemoryRequirementsARM(
    		device,
    		pInfo.memorySegment(),
    		pMemoryRequirements.memorySegment()
    	);
    }
    
    public static int vkBindTensorMemoryARM(
        VkDevice device,
    	int bindInfoCount,
    	MemorySegment pBindInfos
    ) {
        MethodHandle method = device.VK_BIND_TENSOR_MEMORY_ARM().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                bindInfoCount,
                pBindInfos
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkBindTensorMemoryARM].
    public static int vkBindTensorMemoryARM(
    	VkDevice device,
    	int bindInfoCount,
    	NativeStructArray<VkBindTensorMemoryInfoARM> pBindInfos
    ) {
    	return vkBindTensorMemoryARM(
    		device,
    		bindInfoCount,
    		pBindInfos.memorySegment()
    	);
    }
    
    public static void vkGetDeviceTensorMemoryRequirementsARM(
        VkDevice device,
    	MemorySegment pInfo,
    	MemorySegment pMemoryRequirements
    ) {
        MethodHandle method = device.VK_GET_DEVICE_TENSOR_MEMORY_REQUIREMENTS_ARM().get();
        try {
             method.invokeExact(
                device.memorySegment(),
                pInfo,
                pMemoryRequirements
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetDeviceTensorMemoryRequirementsARM].
    public static void vkGetDeviceTensorMemoryRequirementsARM(
    	VkDevice device,
    	VkDeviceTensorMemoryRequirementsARM pInfo,
    	VkMemoryRequirements2 pMemoryRequirements
    ) {
    	vkGetDeviceTensorMemoryRequirementsARM(
    		device,
    		pInfo.memorySegment(),
    		pMemoryRequirements.memorySegment()
    	);
    }
    
    public static void vkCmdCopyTensorARM(
        VkCommandBuffer commandBuffer,
    	MemorySegment pCopyTensorInfo
    ) {
        MethodHandle method = commandBuffer.VK_CMD_COPY_TENSOR_ARM().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                pCopyTensorInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdCopyTensorARM].
    public static void vkCmdCopyTensorARM(
    	VkCommandBuffer commandBuffer,
    	VkCopyTensorInfoARM pCopyTensorInfo
    ) {
    	vkCmdCopyTensorARM(
    		commandBuffer,
    		pCopyTensorInfo.memorySegment()
    	);
    }
    
    public static void vkGetPhysicalDeviceExternalTensorPropertiesARM(
        VkPhysicalDevice physicalDevice,
    	MemorySegment pExternalTensorInfo,
    	MemorySegment pExternalTensorProperties
    ) {
        MethodHandle method = physicalDevice.VK_GET_PHYSICAL_DEVICE_EXTERNAL_TENSOR_PROPERTIES_ARM().get();
        try {
             method.invokeExact(
                physicalDevice.memorySegment(),
                pExternalTensorInfo,
                pExternalTensorProperties
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetPhysicalDeviceExternalTensorPropertiesARM].
    public static void vkGetPhysicalDeviceExternalTensorPropertiesARM(
    	VkPhysicalDevice physicalDevice,
    	VkPhysicalDeviceExternalTensorInfoARM pExternalTensorInfo,
    	VkExternalTensorPropertiesARM pExternalTensorProperties
    ) {
    	vkGetPhysicalDeviceExternalTensorPropertiesARM(
    		physicalDevice,
    		pExternalTensorInfo.memorySegment(),
    		pExternalTensorProperties.memorySegment()
    	);
    }
    
    public static int vkGetTensorOpaqueCaptureDescriptorDataARM(
        VkDevice device,
    	MemorySegment pInfo,
    	MemorySegment pData
    ) {
        MethodHandle method = device.VK_GET_TENSOR_OPAQUE_CAPTURE_DESCRIPTOR_DATA_ARM().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                pInfo,
                pData
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetTensorOpaqueCaptureDescriptorDataARM].
    public static int vkGetTensorOpaqueCaptureDescriptorDataARM(
    	VkDevice device,
    	VkTensorCaptureDescriptorDataInfoARM pInfo,
    	MemorySegment pData
    ) {
    	return vkGetTensorOpaqueCaptureDescriptorDataARM(
    		device,
    		pInfo.memorySegment(),
    		pData
    	);
    }
    
    public static int vkGetTensorViewOpaqueCaptureDescriptorDataARM(
        VkDevice device,
    	MemorySegment pInfo,
    	MemorySegment pData
    ) {
        MethodHandle method = device.VK_GET_TENSOR_VIEW_OPAQUE_CAPTURE_DESCRIPTOR_DATA_ARM().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                pInfo,
                pData
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetTensorViewOpaqueCaptureDescriptorDataARM].
    public static int vkGetTensorViewOpaqueCaptureDescriptorDataARM(
    	VkDevice device,
    	VkTensorViewCaptureDescriptorDataInfoARM pInfo,
    	MemorySegment pData
    ) {
    	return vkGetTensorViewOpaqueCaptureDescriptorDataARM(
    		device,
    		pInfo.memorySegment(),
    		pData
    	);
    }
    
    public static void vkGetShaderModuleIdentifierEXT(
        VkDevice device,
    	MemorySegment shaderModule,
    	MemorySegment pIdentifier
    ) {
        MethodHandle method = device.VK_GET_SHADER_MODULE_IDENTIFIER_EXT().get();
        try {
             method.invokeExact(
                device.memorySegment(),
                shaderModule,
                pIdentifier
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetShaderModuleIdentifierEXT].
    public static void vkGetShaderModuleIdentifierEXT(
    	VkDevice device,
    	VkShaderModule shaderModule,
    	VkShaderModuleIdentifierEXT pIdentifier
    ) {
    	vkGetShaderModuleIdentifierEXT(
    		device,
    		shaderModule.memorySegment(),
    		pIdentifier.memorySegment()
    	);
    }
    
    public static void vkGetShaderModuleCreateInfoIdentifierEXT(
        VkDevice device,
    	MemorySegment pCreateInfo,
    	MemorySegment pIdentifier
    ) {
        MethodHandle method = device.VK_GET_SHADER_MODULE_CREATE_INFO_IDENTIFIER_EXT().get();
        try {
             method.invokeExact(
                device.memorySegment(),
                pCreateInfo,
                pIdentifier
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetShaderModuleCreateInfoIdentifierEXT].
    public static void vkGetShaderModuleCreateInfoIdentifierEXT(
    	VkDevice device,
    	VkShaderModuleCreateInfo pCreateInfo,
    	VkShaderModuleIdentifierEXT pIdentifier
    ) {
    	vkGetShaderModuleCreateInfoIdentifierEXT(
    		device,
    		pCreateInfo.memorySegment(),
    		pIdentifier.memorySegment()
    	);
    }
    
    public static int vkGetPhysicalDeviceOpticalFlowImageFormatsNV(
        VkPhysicalDevice physicalDevice,
    	MemorySegment pOpticalFlowImageFormatInfo,
    	MemorySegment pFormatCount,
    	MemorySegment pImageFormatProperties
    ) {
        MethodHandle method = physicalDevice.VK_GET_PHYSICAL_DEVICE_OPTICAL_FLOW_IMAGE_FORMATS_NV().get();
        try {
            return (int) method.invokeExact(
                physicalDevice.memorySegment(),
                pOpticalFlowImageFormatInfo,
                pFormatCount,
                pImageFormatProperties
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetPhysicalDeviceOpticalFlowImageFormatsNV].
    public static int vkGetPhysicalDeviceOpticalFlowImageFormatsNV(
    	VkPhysicalDevice physicalDevice,
    	VkOpticalFlowImageFormatInfoNV pOpticalFlowImageFormatInfo,
    	NativeIntArray pFormatCount,
    	@Nullable NativeStructArray<VkOpticalFlowImageFormatPropertiesNV> pImageFormatProperties
    ) {
    	return vkGetPhysicalDeviceOpticalFlowImageFormatsNV(
    		physicalDevice,
    		pOpticalFlowImageFormatInfo.memorySegment(),
    		pFormatCount.memorySegment(),
    		pImageFormatProperties == null ? MemorySegment.NULL : pImageFormatProperties.memorySegment()
    	);
    }
    
    public static int vkCreateOpticalFlowSessionNV(
        VkDevice device,
    	MemorySegment pCreateInfo,
    	MemorySegment pAllocator,
    	MemorySegment pSession
    ) {
        MethodHandle method = device.VK_CREATE_OPTICAL_FLOW_SESSION_NV().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                pCreateInfo,
                pAllocator,
                pSession
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCreateOpticalFlowSessionNV].
    public static int vkCreateOpticalFlowSessionNV(
    	VkDevice device,
    	VkOpticalFlowSessionCreateInfoNV pCreateInfo,
    	@Nullable VkAllocationCallbacks pAllocator,
    	NativePointerArray pSession
    ) {
    	return vkCreateOpticalFlowSessionNV(
    		device,
    		pCreateInfo.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment(),
    		pSession.memorySegment()
    	);
    }
    
    public static void vkDestroyOpticalFlowSessionNV(
        VkDevice device,
    	MemorySegment session,
    	MemorySegment pAllocator
    ) {
        MethodHandle method = device.VK_DESTROY_OPTICAL_FLOW_SESSION_NV().get();
        try {
             method.invokeExact(
                device.memorySegment(),
                session,
                pAllocator
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkDestroyOpticalFlowSessionNV].
    public static void vkDestroyOpticalFlowSessionNV(
    	VkDevice device,
    	VkOpticalFlowSessionNV session,
    	@Nullable VkAllocationCallbacks pAllocator
    ) {
    	vkDestroyOpticalFlowSessionNV(
    		device,
    		session.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment()
    	);
    }
    
    public static int vkBindOpticalFlowSessionImageNV(
        VkDevice device,
    	MemorySegment session,
    	int bindingPoint,
    	MemorySegment view,
    	int layout
    ) {
        MethodHandle method = device.VK_BIND_OPTICAL_FLOW_SESSION_IMAGE_NV().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                session,
                bindingPoint,
                view,
                layout
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkBindOpticalFlowSessionImageNV].
    public static int vkBindOpticalFlowSessionImageNV(
    	VkDevice device,
    	VkOpticalFlowSessionNV session,
    	int bindingPoint,
    	@Nullable VkImageView view,
    	int layout
    ) {
    	return vkBindOpticalFlowSessionImageNV(
    		device,
    		session.memorySegment(),
    		bindingPoint,
    		view == null ? MemorySegment.NULL : view.memorySegment(),
    		layout
    	);
    }
    
    public static void vkCmdOpticalFlowExecuteNV(
        VkCommandBuffer commandBuffer,
    	MemorySegment session,
    	MemorySegment pExecuteInfo
    ) {
        MethodHandle method = commandBuffer.VK_CMD_OPTICAL_FLOW_EXECUTE_NV().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                session,
                pExecuteInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdOpticalFlowExecuteNV].
    public static void vkCmdOpticalFlowExecuteNV(
    	VkCommandBuffer commandBuffer,
    	VkOpticalFlowSessionNV session,
    	VkOpticalFlowExecuteInfoNV pExecuteInfo
    ) {
    	vkCmdOpticalFlowExecuteNV(
    		commandBuffer,
    		session.memorySegment(),
    		pExecuteInfo.memorySegment()
    	);
    }
    
    public static void vkAntiLagUpdateAMD(
        VkDevice device,
    	MemorySegment pData
    ) {
        MethodHandle method = device.VK_ANTI_LAG_UPDATE_AMD().get();
        try {
             method.invokeExact(
                device.memorySegment(),
                pData
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkAntiLagUpdateAMD].
    public static void vkAntiLagUpdateAMD(
    	VkDevice device,
    	VkAntiLagDataAMD pData
    ) {
    	vkAntiLagUpdateAMD(
    		device,
    		pData.memorySegment()
    	);
    }
    
    public static int vkCreateShadersEXT(
        VkDevice device,
    	int createInfoCount,
    	MemorySegment pCreateInfos,
    	MemorySegment pAllocator,
    	MemorySegment pShaders
    ) {
        MethodHandle method = device.VK_CREATE_SHADERS_EXT().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                createInfoCount,
                pCreateInfos,
                pAllocator,
                pShaders
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCreateShadersEXT].
    public static int vkCreateShadersEXT(
    	VkDevice device,
    	int createInfoCount,
    	NativeStructArray<VkShaderCreateInfoEXT> pCreateInfos,
    	@Nullable VkAllocationCallbacks pAllocator,
    	NativePointerArray pShaders
    ) {
    	return vkCreateShadersEXT(
    		device,
    		createInfoCount,
    		pCreateInfos.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment(),
    		pShaders.memorySegment()
    	);
    }
    
    public static void vkDestroyShaderEXT(
        VkDevice device,
    	MemorySegment shader,
    	MemorySegment pAllocator
    ) {
        MethodHandle method = device.VK_DESTROY_SHADER_EXT().get();
        try {
             method.invokeExact(
                device.memorySegment(),
                shader,
                pAllocator
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkDestroyShaderEXT].
    public static void vkDestroyShaderEXT(
    	VkDevice device,
    	@Nullable VkShaderEXT shader,
    	@Nullable VkAllocationCallbacks pAllocator
    ) {
    	vkDestroyShaderEXT(
    		device,
    		shader == null ? MemorySegment.NULL : shader.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment()
    	);
    }
    
    public static int vkGetShaderBinaryDataEXT(
        VkDevice device,
    	MemorySegment shader,
    	MemorySegment pDataSize,
    	MemorySegment pData
    ) {
        MethodHandle method = device.VK_GET_SHADER_BINARY_DATA_EXT().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                shader,
                pDataSize,
                pData
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetShaderBinaryDataEXT].
    public static int vkGetShaderBinaryDataEXT(
    	VkDevice device,
    	VkShaderEXT shader,
    	NativeLongArray pDataSize,
    	@Nullable MemorySegment pData
    ) {
    	return vkGetShaderBinaryDataEXT(
    		device,
    		shader.memorySegment(),
    		pDataSize.memorySegment(),
    		pData
    	);
    }
    
    public static void vkCmdBindShadersEXT(
        VkCommandBuffer commandBuffer,
    	int stageCount,
    	MemorySegment pStages,
    	MemorySegment pShaders
    ) {
        MethodHandle method = commandBuffer.VK_CMD_BIND_SHADERS_EXT().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                stageCount,
                pStages,
                pShaders
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdBindShadersEXT].
    public static void vkCmdBindShadersEXT(
    	VkCommandBuffer commandBuffer,
    	int stageCount,
    	NativeIntArray pStages,
    	@Nullable NativePointerArray pShaders
    ) {
    	vkCmdBindShadersEXT(
    		commandBuffer,
    		stageCount,
    		pStages.memorySegment(),
    		pShaders == null ? MemorySegment.NULL : pShaders.memorySegment()
    	);
    }
    
    public static void vkCmdSetDepthClampRangeEXT(
        VkCommandBuffer commandBuffer,
    	int depthClampMode,
    	MemorySegment pDepthClampRange
    ) {
        MethodHandle method = commandBuffer.VK_CMD_SET_DEPTH_CLAMP_RANGE_EXT().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                depthClampMode,
                pDepthClampRange
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdSetDepthClampRangeEXT].
    public static void vkCmdSetDepthClampRangeEXT(
    	VkCommandBuffer commandBuffer,
    	int depthClampMode,
    	@Nullable VkDepthClampRangeEXT pDepthClampRange
    ) {
    	vkCmdSetDepthClampRangeEXT(
    		commandBuffer,
    		depthClampMode,
    		pDepthClampRange == null ? MemorySegment.NULL : pDepthClampRange.memorySegment()
    	);
    }
    
    public static int vkGetFramebufferTilePropertiesQCOM(
        VkDevice device,
    	MemorySegment framebuffer,
    	MemorySegment pPropertiesCount,
    	MemorySegment pProperties
    ) {
        MethodHandle method = device.VK_GET_FRAMEBUFFER_TILE_PROPERTIES_QCOM().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                framebuffer,
                pPropertiesCount,
                pProperties
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetFramebufferTilePropertiesQCOM].
    public static int vkGetFramebufferTilePropertiesQCOM(
    	VkDevice device,
    	VkFramebuffer framebuffer,
    	NativeIntArray pPropertiesCount,
    	@Nullable NativeStructArray<VkTilePropertiesQCOM> pProperties
    ) {
    	return vkGetFramebufferTilePropertiesQCOM(
    		device,
    		framebuffer.memorySegment(),
    		pPropertiesCount.memorySegment(),
    		pProperties == null ? MemorySegment.NULL : pProperties.memorySegment()
    	);
    }
    
    public static int vkGetDynamicRenderingTilePropertiesQCOM(
        VkDevice device,
    	MemorySegment pRenderingInfo,
    	MemorySegment pProperties
    ) {
        MethodHandle method = device.VK_GET_DYNAMIC_RENDERING_TILE_PROPERTIES_QCOM().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                pRenderingInfo,
                pProperties
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetDynamicRenderingTilePropertiesQCOM].
    public static int vkGetDynamicRenderingTilePropertiesQCOM(
    	VkDevice device,
    	VkRenderingInfo pRenderingInfo,
    	VkTilePropertiesQCOM pProperties
    ) {
    	return vkGetDynamicRenderingTilePropertiesQCOM(
    		device,
    		pRenderingInfo.memorySegment(),
    		pProperties.memorySegment()
    	);
    }
    
    public static int vkGetPhysicalDeviceCooperativeVectorPropertiesNV(
        VkPhysicalDevice physicalDevice,
    	MemorySegment pPropertyCount,
    	MemorySegment pProperties
    ) {
        MethodHandle method = physicalDevice.VK_GET_PHYSICAL_DEVICE_COOPERATIVE_VECTOR_PROPERTIES_NV().get();
        try {
            return (int) method.invokeExact(
                physicalDevice.memorySegment(),
                pPropertyCount,
                pProperties
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetPhysicalDeviceCooperativeVectorPropertiesNV].
    public static int vkGetPhysicalDeviceCooperativeVectorPropertiesNV(
    	VkPhysicalDevice physicalDevice,
    	NativeIntArray pPropertyCount,
    	@Nullable NativeStructArray<VkCooperativeVectorPropertiesNV> pProperties
    ) {
    	return vkGetPhysicalDeviceCooperativeVectorPropertiesNV(
    		physicalDevice,
    		pPropertyCount.memorySegment(),
    		pProperties == null ? MemorySegment.NULL : pProperties.memorySegment()
    	);
    }
    
    public static int vkConvertCooperativeVectorMatrixNV(
        VkDevice device,
    	MemorySegment pInfo
    ) {
        MethodHandle method = device.VK_CONVERT_COOPERATIVE_VECTOR_MATRIX_NV().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                pInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkConvertCooperativeVectorMatrixNV].
    public static int vkConvertCooperativeVectorMatrixNV(
    	VkDevice device,
    	VkConvertCooperativeVectorMatrixInfoNV pInfo
    ) {
    	return vkConvertCooperativeVectorMatrixNV(
    		device,
    		pInfo.memorySegment()
    	);
    }
    
    public static void vkCmdConvertCooperativeVectorMatrixNV(
        VkCommandBuffer commandBuffer,
    	int infoCount,
    	MemorySegment pInfos
    ) {
        MethodHandle method = commandBuffer.VK_CMD_CONVERT_COOPERATIVE_VECTOR_MATRIX_NV().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                infoCount,
                pInfos
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdConvertCooperativeVectorMatrixNV].
    public static void vkCmdConvertCooperativeVectorMatrixNV(
    	VkCommandBuffer commandBuffer,
    	int infoCount,
    	NativeStructArray<VkConvertCooperativeVectorMatrixInfoNV> pInfos
    ) {
    	vkCmdConvertCooperativeVectorMatrixNV(
    		commandBuffer,
    		infoCount,
    		pInfos.memorySegment()
    	);
    }
    
    public static int vkSetLatencySleepModeNV(
        VkDevice device,
    	MemorySegment swapchain,
    	MemorySegment pSleepModeInfo
    ) {
        MethodHandle method = device.VK_SET_LATENCY_SLEEP_MODE_NV().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                swapchain,
                pSleepModeInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkSetLatencySleepModeNV].
    public static int vkSetLatencySleepModeNV(
    	VkDevice device,
    	VkSwapchainKHR swapchain,
    	VkLatencySleepModeInfoNV pSleepModeInfo
    ) {
    	return vkSetLatencySleepModeNV(
    		device,
    		swapchain.memorySegment(),
    		pSleepModeInfo.memorySegment()
    	);
    }
    
    public static int vkLatencySleepNV(
        VkDevice device,
    	MemorySegment swapchain,
    	MemorySegment pSleepInfo
    ) {
        MethodHandle method = device.VK_LATENCY_SLEEP_NV().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                swapchain,
                pSleepInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkLatencySleepNV].
    public static int vkLatencySleepNV(
    	VkDevice device,
    	VkSwapchainKHR swapchain,
    	VkLatencySleepInfoNV pSleepInfo
    ) {
    	return vkLatencySleepNV(
    		device,
    		swapchain.memorySegment(),
    		pSleepInfo.memorySegment()
    	);
    }
    
    public static void vkSetLatencyMarkerNV(
        VkDevice device,
    	MemorySegment swapchain,
    	MemorySegment pLatencyMarkerInfo
    ) {
        MethodHandle method = device.VK_SET_LATENCY_MARKER_NV().get();
        try {
             method.invokeExact(
                device.memorySegment(),
                swapchain,
                pLatencyMarkerInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkSetLatencyMarkerNV].
    public static void vkSetLatencyMarkerNV(
    	VkDevice device,
    	VkSwapchainKHR swapchain,
    	VkSetLatencyMarkerInfoNV pLatencyMarkerInfo
    ) {
    	vkSetLatencyMarkerNV(
    		device,
    		swapchain.memorySegment(),
    		pLatencyMarkerInfo.memorySegment()
    	);
    }
    
    public static void vkGetLatencyTimingsNV(
        VkDevice device,
    	MemorySegment swapchain,
    	MemorySegment pLatencyMarkerInfo
    ) {
        MethodHandle method = device.VK_GET_LATENCY_TIMINGS_NV().get();
        try {
             method.invokeExact(
                device.memorySegment(),
                swapchain,
                pLatencyMarkerInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetLatencyTimingsNV].
    public static void vkGetLatencyTimingsNV(
    	VkDevice device,
    	VkSwapchainKHR swapchain,
    	VkGetLatencyMarkerInfoNV pLatencyMarkerInfo
    ) {
    	vkGetLatencyTimingsNV(
    		device,
    		swapchain.memorySegment(),
    		pLatencyMarkerInfo.memorySegment()
    	);
    }
    
    public static void vkQueueNotifyOutOfBandNV(
        VkQueue queue,
    	MemorySegment pQueueTypeInfo
    ) {
        MethodHandle method = queue.VK_QUEUE_NOTIFY_OUT_OF_BAND_NV().get();
        try {
             method.invokeExact(
                queue.memorySegment(),
                pQueueTypeInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkQueueNotifyOutOfBandNV].
    public static void vkQueueNotifyOutOfBandNV(
    	VkQueue queue,
    	VkOutOfBandQueueTypeInfoNV pQueueTypeInfo
    ) {
    	vkQueueNotifyOutOfBandNV(
    		queue,
    		pQueueTypeInfo.memorySegment()
    	);
    }
    
    public static int vkCreateDataGraphPipelinesARM(
        VkDevice device,
    	MemorySegment deferredOperation,
    	MemorySegment pipelineCache,
    	int createInfoCount,
    	MemorySegment pCreateInfos,
    	MemorySegment pAllocator,
    	MemorySegment pPipelines
    ) {
        MethodHandle method = device.VK_CREATE_DATA_GRAPH_PIPELINES_ARM().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                deferredOperation,
                pipelineCache,
                createInfoCount,
                pCreateInfos,
                pAllocator,
                pPipelines
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCreateDataGraphPipelinesARM].
    public static int vkCreateDataGraphPipelinesARM(
    	VkDevice device,
    	@Nullable VkDeferredOperationKHR deferredOperation,
    	@Nullable VkPipelineCache pipelineCache,
    	int createInfoCount,
    	NativeStructArray<VkDataGraphPipelineCreateInfoARM> pCreateInfos,
    	@Nullable VkAllocationCallbacks pAllocator,
    	NativePointerArray pPipelines
    ) {
    	return vkCreateDataGraphPipelinesARM(
    		device,
    		deferredOperation == null ? MemorySegment.NULL : deferredOperation.memorySegment(),
    		pipelineCache == null ? MemorySegment.NULL : pipelineCache.memorySegment(),
    		createInfoCount,
    		pCreateInfos.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment(),
    		pPipelines.memorySegment()
    	);
    }
    
    public static int vkCreateDataGraphPipelineSessionARM(
        VkDevice device,
    	MemorySegment pCreateInfo,
    	MemorySegment pAllocator,
    	MemorySegment pSession
    ) {
        MethodHandle method = device.VK_CREATE_DATA_GRAPH_PIPELINE_SESSION_ARM().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                pCreateInfo,
                pAllocator,
                pSession
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCreateDataGraphPipelineSessionARM].
    public static int vkCreateDataGraphPipelineSessionARM(
    	VkDevice device,
    	VkDataGraphPipelineSessionCreateInfoARM pCreateInfo,
    	@Nullable VkAllocationCallbacks pAllocator,
    	NativePointerArray pSession
    ) {
    	return vkCreateDataGraphPipelineSessionARM(
    		device,
    		pCreateInfo.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment(),
    		pSession.memorySegment()
    	);
    }
    
    public static int vkGetDataGraphPipelineSessionBindPointRequirementsARM(
        VkDevice device,
    	MemorySegment pInfo,
    	MemorySegment pBindPointRequirementCount,
    	MemorySegment pBindPointRequirements
    ) {
        MethodHandle method = device.VK_GET_DATA_GRAPH_PIPELINE_SESSION_BIND_POINT_REQUIREMENTS_ARM().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                pInfo,
                pBindPointRequirementCount,
                pBindPointRequirements
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetDataGraphPipelineSessionBindPointRequirementsARM].
    public static int vkGetDataGraphPipelineSessionBindPointRequirementsARM(
    	VkDevice device,
    	VkDataGraphPipelineSessionBindPointRequirementsInfoARM pInfo,
    	NativeIntArray pBindPointRequirementCount,
    	@Nullable NativeStructArray<VkDataGraphPipelineSessionBindPointRequirementARM> pBindPointRequirements
    ) {
    	return vkGetDataGraphPipelineSessionBindPointRequirementsARM(
    		device,
    		pInfo.memorySegment(),
    		pBindPointRequirementCount.memorySegment(),
    		pBindPointRequirements == null ? MemorySegment.NULL : pBindPointRequirements.memorySegment()
    	);
    }
    
    public static void vkGetDataGraphPipelineSessionMemoryRequirementsARM(
        VkDevice device,
    	MemorySegment pInfo,
    	MemorySegment pMemoryRequirements
    ) {
        MethodHandle method = device.VK_GET_DATA_GRAPH_PIPELINE_SESSION_MEMORY_REQUIREMENTS_ARM().get();
        try {
             method.invokeExact(
                device.memorySegment(),
                pInfo,
                pMemoryRequirements
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetDataGraphPipelineSessionMemoryRequirementsARM].
    public static void vkGetDataGraphPipelineSessionMemoryRequirementsARM(
    	VkDevice device,
    	VkDataGraphPipelineSessionMemoryRequirementsInfoARM pInfo,
    	VkMemoryRequirements2 pMemoryRequirements
    ) {
    	vkGetDataGraphPipelineSessionMemoryRequirementsARM(
    		device,
    		pInfo.memorySegment(),
    		pMemoryRequirements.memorySegment()
    	);
    }
    
    public static int vkBindDataGraphPipelineSessionMemoryARM(
        VkDevice device,
    	int bindInfoCount,
    	MemorySegment pBindInfos
    ) {
        MethodHandle method = device.VK_BIND_DATA_GRAPH_PIPELINE_SESSION_MEMORY_ARM().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                bindInfoCount,
                pBindInfos
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkBindDataGraphPipelineSessionMemoryARM].
    public static int vkBindDataGraphPipelineSessionMemoryARM(
    	VkDevice device,
    	int bindInfoCount,
    	NativeStructArray<VkBindDataGraphPipelineSessionMemoryInfoARM> pBindInfos
    ) {
    	return vkBindDataGraphPipelineSessionMemoryARM(
    		device,
    		bindInfoCount,
    		pBindInfos.memorySegment()
    	);
    }
    
    public static void vkDestroyDataGraphPipelineSessionARM(
        VkDevice device,
    	MemorySegment session,
    	MemorySegment pAllocator
    ) {
        MethodHandle method = device.VK_DESTROY_DATA_GRAPH_PIPELINE_SESSION_ARM().get();
        try {
             method.invokeExact(
                device.memorySegment(),
                session,
                pAllocator
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkDestroyDataGraphPipelineSessionARM].
    public static void vkDestroyDataGraphPipelineSessionARM(
    	VkDevice device,
    	VkDataGraphPipelineSessionARM session,
    	@Nullable VkAllocationCallbacks pAllocator
    ) {
    	vkDestroyDataGraphPipelineSessionARM(
    		device,
    		session.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment()
    	);
    }
    
    public static void vkCmdDispatchDataGraphARM(
        VkCommandBuffer commandBuffer,
    	MemorySegment session,
    	MemorySegment pInfo
    ) {
        MethodHandle method = commandBuffer.VK_CMD_DISPATCH_DATA_GRAPH_ARM().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                session,
                pInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdDispatchDataGraphARM].
    public static void vkCmdDispatchDataGraphARM(
    	VkCommandBuffer commandBuffer,
    	VkDataGraphPipelineSessionARM session,
    	@Nullable VkDataGraphPipelineDispatchInfoARM pInfo
    ) {
    	vkCmdDispatchDataGraphARM(
    		commandBuffer,
    		session.memorySegment(),
    		pInfo == null ? MemorySegment.NULL : pInfo.memorySegment()
    	);
    }
    
    public static int vkGetDataGraphPipelineAvailablePropertiesARM(
        VkDevice device,
    	MemorySegment pPipelineInfo,
    	MemorySegment pPropertiesCount,
    	MemorySegment pProperties
    ) {
        MethodHandle method = device.VK_GET_DATA_GRAPH_PIPELINE_AVAILABLE_PROPERTIES_ARM().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                pPipelineInfo,
                pPropertiesCount,
                pProperties
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetDataGraphPipelineAvailablePropertiesARM].
    public static int vkGetDataGraphPipelineAvailablePropertiesARM(
    	VkDevice device,
    	VkDataGraphPipelineInfoARM pPipelineInfo,
    	NativeIntArray pPropertiesCount,
    	@Nullable NativeIntArray pProperties
    ) {
    	return vkGetDataGraphPipelineAvailablePropertiesARM(
    		device,
    		pPipelineInfo.memorySegment(),
    		pPropertiesCount.memorySegment(),
    		pProperties == null ? MemorySegment.NULL : pProperties.memorySegment()
    	);
    }
    
    public static int vkGetDataGraphPipelinePropertiesARM(
        VkDevice device,
    	MemorySegment pPipelineInfo,
    	int propertiesCount,
    	MemorySegment pProperties
    ) {
        MethodHandle method = device.VK_GET_DATA_GRAPH_PIPELINE_PROPERTIES_ARM().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                pPipelineInfo,
                propertiesCount,
                pProperties
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetDataGraphPipelinePropertiesARM].
    public static int vkGetDataGraphPipelinePropertiesARM(
    	VkDevice device,
    	VkDataGraphPipelineInfoARM pPipelineInfo,
    	int propertiesCount,
    	NativeStructArray<VkDataGraphPipelinePropertyQueryResultARM> pProperties
    ) {
    	return vkGetDataGraphPipelinePropertiesARM(
    		device,
    		pPipelineInfo.memorySegment(),
    		propertiesCount,
    		pProperties.memorySegment()
    	);
    }
    
    public static int vkGetPhysicalDeviceQueueFamilyDataGraphPropertiesARM(
        VkPhysicalDevice physicalDevice,
    	int queueFamilyIndex,
    	MemorySegment pQueueFamilyDataGraphPropertyCount,
    	MemorySegment pQueueFamilyDataGraphProperties
    ) {
        MethodHandle method = physicalDevice.VK_GET_PHYSICAL_DEVICE_QUEUE_FAMILY_DATA_GRAPH_PROPERTIES_ARM().get();
        try {
            return (int) method.invokeExact(
                physicalDevice.memorySegment(),
                queueFamilyIndex,
                pQueueFamilyDataGraphPropertyCount,
                pQueueFamilyDataGraphProperties
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetPhysicalDeviceQueueFamilyDataGraphPropertiesARM].
    public static int vkGetPhysicalDeviceQueueFamilyDataGraphPropertiesARM(
    	VkPhysicalDevice physicalDevice,
    	int queueFamilyIndex,
    	NativeIntArray pQueueFamilyDataGraphPropertyCount,
    	@Nullable NativeStructArray<VkQueueFamilyDataGraphPropertiesARM> pQueueFamilyDataGraphProperties
    ) {
    	return vkGetPhysicalDeviceQueueFamilyDataGraphPropertiesARM(
    		physicalDevice,
    		queueFamilyIndex,
    		pQueueFamilyDataGraphPropertyCount.memorySegment(),
    		pQueueFamilyDataGraphProperties == null ? MemorySegment.NULL : pQueueFamilyDataGraphProperties.memorySegment()
    	);
    }
    
    public static void vkGetPhysicalDeviceQueueFamilyDataGraphProcessingEnginePropertiesARM(
        VkPhysicalDevice physicalDevice,
    	MemorySegment pQueueFamilyDataGraphProcessingEngineInfo,
    	MemorySegment pQueueFamilyDataGraphProcessingEngineProperties
    ) {
        MethodHandle method = physicalDevice.VK_GET_PHYSICAL_DEVICE_QUEUE_FAMILY_DATA_GRAPH_PROCESSING_ENGINE_PROPERTIES_ARM().get();
        try {
             method.invokeExact(
                physicalDevice.memorySegment(),
                pQueueFamilyDataGraphProcessingEngineInfo,
                pQueueFamilyDataGraphProcessingEngineProperties
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetPhysicalDeviceQueueFamilyDataGraphProcessingEnginePropertiesARM].
    public static void vkGetPhysicalDeviceQueueFamilyDataGraphProcessingEnginePropertiesARM(
    	VkPhysicalDevice physicalDevice,
    	VkPhysicalDeviceQueueFamilyDataGraphProcessingEngineInfoARM pQueueFamilyDataGraphProcessingEngineInfo,
    	VkQueueFamilyDataGraphProcessingEnginePropertiesARM pQueueFamilyDataGraphProcessingEngineProperties
    ) {
    	vkGetPhysicalDeviceQueueFamilyDataGraphProcessingEnginePropertiesARM(
    		physicalDevice,
    		pQueueFamilyDataGraphProcessingEngineInfo.memorySegment(),
    		pQueueFamilyDataGraphProcessingEngineProperties.memorySegment()
    	);
    }
    
    public static int vkGetPhysicalDeviceQueueFamilyDataGraphEngineOperationPropertiesARM(
        VkPhysicalDevice physicalDevice,
    	int queueFamilyIndex,
    	MemorySegment pQueueFamilyDataGraphProperties,
    	MemorySegment pProperties
    ) {
        MethodHandle method = physicalDevice.VK_GET_PHYSICAL_DEVICE_QUEUE_FAMILY_DATA_GRAPH_ENGINE_OPERATION_PROPERTIES_ARM().get();
        try {
            return (int) method.invokeExact(
                physicalDevice.memorySegment(),
                queueFamilyIndex,
                pQueueFamilyDataGraphProperties,
                pProperties
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetPhysicalDeviceQueueFamilyDataGraphEngineOperationPropertiesARM].
    public static int vkGetPhysicalDeviceQueueFamilyDataGraphEngineOperationPropertiesARM(
    	VkPhysicalDevice physicalDevice,
    	int queueFamilyIndex,
    	VkQueueFamilyDataGraphPropertiesARM pQueueFamilyDataGraphProperties,
    	VkBaseOutStructure pProperties
    ) {
    	return vkGetPhysicalDeviceQueueFamilyDataGraphEngineOperationPropertiesARM(
    		physicalDevice,
    		queueFamilyIndex,
    		pQueueFamilyDataGraphProperties.memorySegment(),
    		pProperties.memorySegment()
    	);
    }
    
    public static void vkCmdSetAttachmentFeedbackLoopEnableEXT(
        VkCommandBuffer commandBuffer,
    	int aspectMask
    ) {
        MethodHandle method = commandBuffer.VK_CMD_SET_ATTACHMENT_FEEDBACK_LOOP_ENABLE_EXT().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                aspectMask
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    
    public static void vkCmdBindTileMemoryQCOM(
        VkCommandBuffer commandBuffer,
    	MemorySegment pTileMemoryBindInfo
    ) {
        MethodHandle method = commandBuffer.VK_CMD_BIND_TILE_MEMORY_QCOM().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                pTileMemoryBindInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdBindTileMemoryQCOM].
    public static void vkCmdBindTileMemoryQCOM(
    	VkCommandBuffer commandBuffer,
    	@Nullable VkTileMemoryBindInfoQCOM pTileMemoryBindInfo
    ) {
    	vkCmdBindTileMemoryQCOM(
    		commandBuffer,
    		pTileMemoryBindInfo == null ? MemorySegment.NULL : pTileMemoryBindInfo.memorySegment()
    	);
    }
    
    public static void vkCmdDecompressMemoryEXT(
        VkCommandBuffer commandBuffer,
    	MemorySegment pDecompressMemoryInfoEXT
    ) {
        MethodHandle method = commandBuffer.VK_CMD_DECOMPRESS_MEMORY_EXT().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                pDecompressMemoryInfoEXT
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdDecompressMemoryEXT].
    public static void vkCmdDecompressMemoryEXT(
    	VkCommandBuffer commandBuffer,
    	VkDecompressMemoryInfoEXT pDecompressMemoryInfoEXT
    ) {
    	vkCmdDecompressMemoryEXT(
    		commandBuffer,
    		pDecompressMemoryInfoEXT.memorySegment()
    	);
    }
    
    public static void vkCmdDecompressMemoryIndirectCountEXT(
        VkCommandBuffer commandBuffer,
    	long decompressionMethod,
    	long indirectCommandsAddress,
    	long indirectCommandsCountAddress,
    	int maxDecompressionCount,
    	int stride
    ) {
        MethodHandle method = commandBuffer.VK_CMD_DECOMPRESS_MEMORY_INDIRECT_COUNT_EXT().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                decompressionMethod,
                indirectCommandsAddress,
                indirectCommandsCountAddress,
                maxDecompressionCount,
                stride
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    
    public static int vkCreateExternalComputeQueueNV(
        VkDevice device,
    	MemorySegment pCreateInfo,
    	MemorySegment pAllocator,
    	MemorySegment pExternalQueue
    ) {
        MethodHandle method = device.VK_CREATE_EXTERNAL_COMPUTE_QUEUE_NV().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                pCreateInfo,
                pAllocator,
                pExternalQueue
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCreateExternalComputeQueueNV].
    public static int vkCreateExternalComputeQueueNV(
    	VkDevice device,
    	VkExternalComputeQueueCreateInfoNV pCreateInfo,
    	@Nullable VkAllocationCallbacks pAllocator,
    	NativePointerArray pExternalQueue
    ) {
    	return vkCreateExternalComputeQueueNV(
    		device,
    		pCreateInfo.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment(),
    		pExternalQueue.memorySegment()
    	);
    }
    
    public static void vkDestroyExternalComputeQueueNV(
        VkDevice device,
    	MemorySegment externalQueue,
    	MemorySegment pAllocator
    ) {
        MethodHandle method = device.VK_DESTROY_EXTERNAL_COMPUTE_QUEUE_NV().get();
        try {
             method.invokeExact(
                device.memorySegment(),
                externalQueue,
                pAllocator
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkDestroyExternalComputeQueueNV].
    public static void vkDestroyExternalComputeQueueNV(
    	VkDevice device,
    	VkExternalComputeQueueNV externalQueue,
    	@Nullable VkAllocationCallbacks pAllocator
    ) {
    	vkDestroyExternalComputeQueueNV(
    		device,
    		externalQueue.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment()
    	);
    }
    
    public static void vkGetClusterAccelerationStructureBuildSizesNV(
        VkDevice device,
    	MemorySegment pInfo,
    	MemorySegment pSizeInfo
    ) {
        MethodHandle method = device.VK_GET_CLUSTER_ACCELERATION_STRUCTURE_BUILD_SIZES_NV().get();
        try {
             method.invokeExact(
                device.memorySegment(),
                pInfo,
                pSizeInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetClusterAccelerationStructureBuildSizesNV].
    public static void vkGetClusterAccelerationStructureBuildSizesNV(
    	VkDevice device,
    	VkClusterAccelerationStructureInputInfoNV pInfo,
    	VkAccelerationStructureBuildSizesInfoKHR pSizeInfo
    ) {
    	vkGetClusterAccelerationStructureBuildSizesNV(
    		device,
    		pInfo.memorySegment(),
    		pSizeInfo.memorySegment()
    	);
    }
    
    public static void vkCmdBuildClusterAccelerationStructureIndirectNV(
        VkCommandBuffer commandBuffer,
    	MemorySegment pCommandInfos
    ) {
        MethodHandle method = commandBuffer.VK_CMD_BUILD_CLUSTER_ACCELERATION_STRUCTURE_INDIRECT_NV().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                pCommandInfos
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdBuildClusterAccelerationStructureIndirectNV].
    public static void vkCmdBuildClusterAccelerationStructureIndirectNV(
    	VkCommandBuffer commandBuffer,
    	VkClusterAccelerationStructureCommandsInfoNV pCommandInfos
    ) {
    	vkCmdBuildClusterAccelerationStructureIndirectNV(
    		commandBuffer,
    		pCommandInfos.memorySegment()
    	);
    }
    
    public static void vkGetPartitionedAccelerationStructuresBuildSizesNV(
        VkDevice device,
    	MemorySegment pInfo,
    	MemorySegment pSizeInfo
    ) {
        MethodHandle method = device.VK_GET_PARTITIONED_ACCELERATION_STRUCTURES_BUILD_SIZES_NV().get();
        try {
             method.invokeExact(
                device.memorySegment(),
                pInfo,
                pSizeInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetPartitionedAccelerationStructuresBuildSizesNV].
    public static void vkGetPartitionedAccelerationStructuresBuildSizesNV(
    	VkDevice device,
    	VkPartitionedAccelerationStructureInstancesInputNV pInfo,
    	VkAccelerationStructureBuildSizesInfoKHR pSizeInfo
    ) {
    	vkGetPartitionedAccelerationStructuresBuildSizesNV(
    		device,
    		pInfo.memorySegment(),
    		pSizeInfo.memorySegment()
    	);
    }
    
    public static void vkCmdBuildPartitionedAccelerationStructuresNV(
        VkCommandBuffer commandBuffer,
    	MemorySegment pBuildInfo
    ) {
        MethodHandle method = commandBuffer.VK_CMD_BUILD_PARTITIONED_ACCELERATION_STRUCTURES_NV().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                pBuildInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdBuildPartitionedAccelerationStructuresNV].
    public static void vkCmdBuildPartitionedAccelerationStructuresNV(
    	VkCommandBuffer commandBuffer,
    	VkBuildPartitionedAccelerationStructureInfoNV pBuildInfo
    ) {
    	vkCmdBuildPartitionedAccelerationStructuresNV(
    		commandBuffer,
    		pBuildInfo.memorySegment()
    	);
    }
    
    public static void vkGetGeneratedCommandsMemoryRequirementsEXT(
        VkDevice device,
    	MemorySegment pInfo,
    	MemorySegment pMemoryRequirements
    ) {
        MethodHandle method = device.VK_GET_GENERATED_COMMANDS_MEMORY_REQUIREMENTS_EXT().get();
        try {
             method.invokeExact(
                device.memorySegment(),
                pInfo,
                pMemoryRequirements
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetGeneratedCommandsMemoryRequirementsEXT].
    public static void vkGetGeneratedCommandsMemoryRequirementsEXT(
    	VkDevice device,
    	VkGeneratedCommandsMemoryRequirementsInfoEXT pInfo,
    	VkMemoryRequirements2 pMemoryRequirements
    ) {
    	vkGetGeneratedCommandsMemoryRequirementsEXT(
    		device,
    		pInfo.memorySegment(),
    		pMemoryRequirements.memorySegment()
    	);
    }
    
    public static void vkCmdPreprocessGeneratedCommandsEXT(
        VkCommandBuffer commandBuffer,
    	MemorySegment pGeneratedCommandsInfo,
    	MemorySegment stateCommandBuffer
    ) {
        MethodHandle method = commandBuffer.VK_CMD_PREPROCESS_GENERATED_COMMANDS_EXT().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                pGeneratedCommandsInfo,
                stateCommandBuffer
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdPreprocessGeneratedCommandsEXT].
    public static void vkCmdPreprocessGeneratedCommandsEXT(
    	VkCommandBuffer commandBuffer,
    	VkGeneratedCommandsInfoEXT pGeneratedCommandsInfo,
    	VkCommandBuffer stateCommandBuffer
    ) {
    	vkCmdPreprocessGeneratedCommandsEXT(
    		commandBuffer,
    		pGeneratedCommandsInfo.memorySegment(),
    		stateCommandBuffer.memorySegment()
    	);
    }
    
    public static void vkCmdExecuteGeneratedCommandsEXT(
        VkCommandBuffer commandBuffer,
    	int isPreprocessed,
    	MemorySegment pGeneratedCommandsInfo
    ) {
        MethodHandle method = commandBuffer.VK_CMD_EXECUTE_GENERATED_COMMANDS_EXT().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                isPreprocessed,
                pGeneratedCommandsInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdExecuteGeneratedCommandsEXT].
    public static void vkCmdExecuteGeneratedCommandsEXT(
    	VkCommandBuffer commandBuffer,
    	int isPreprocessed,
    	VkGeneratedCommandsInfoEXT pGeneratedCommandsInfo
    ) {
    	vkCmdExecuteGeneratedCommandsEXT(
    		commandBuffer,
    		isPreprocessed,
    		pGeneratedCommandsInfo.memorySegment()
    	);
    }
    
    public static int vkCreateIndirectCommandsLayoutEXT(
        VkDevice device,
    	MemorySegment pCreateInfo,
    	MemorySegment pAllocator,
    	MemorySegment pIndirectCommandsLayout
    ) {
        MethodHandle method = device.VK_CREATE_INDIRECT_COMMANDS_LAYOUT_EXT().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                pCreateInfo,
                pAllocator,
                pIndirectCommandsLayout
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCreateIndirectCommandsLayoutEXT].
    public static int vkCreateIndirectCommandsLayoutEXT(
    	VkDevice device,
    	VkIndirectCommandsLayoutCreateInfoEXT pCreateInfo,
    	@Nullable VkAllocationCallbacks pAllocator,
    	NativePointerArray pIndirectCommandsLayout
    ) {
    	return vkCreateIndirectCommandsLayoutEXT(
    		device,
    		pCreateInfo.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment(),
    		pIndirectCommandsLayout.memorySegment()
    	);
    }
    
    public static void vkDestroyIndirectCommandsLayoutEXT(
        VkDevice device,
    	MemorySegment indirectCommandsLayout,
    	MemorySegment pAllocator
    ) {
        MethodHandle method = device.VK_DESTROY_INDIRECT_COMMANDS_LAYOUT_EXT().get();
        try {
             method.invokeExact(
                device.memorySegment(),
                indirectCommandsLayout,
                pAllocator
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkDestroyIndirectCommandsLayoutEXT].
    public static void vkDestroyIndirectCommandsLayoutEXT(
    	VkDevice device,
    	@Nullable VkIndirectCommandsLayoutEXT indirectCommandsLayout,
    	@Nullable VkAllocationCallbacks pAllocator
    ) {
    	vkDestroyIndirectCommandsLayoutEXT(
    		device,
    		indirectCommandsLayout == null ? MemorySegment.NULL : indirectCommandsLayout.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment()
    	);
    }
    
    public static int vkCreateIndirectExecutionSetEXT(
        VkDevice device,
    	MemorySegment pCreateInfo,
    	MemorySegment pAllocator,
    	MemorySegment pIndirectExecutionSet
    ) {
        MethodHandle method = device.VK_CREATE_INDIRECT_EXECUTION_SET_EXT().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                pCreateInfo,
                pAllocator,
                pIndirectExecutionSet
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCreateIndirectExecutionSetEXT].
    public static int vkCreateIndirectExecutionSetEXT(
    	VkDevice device,
    	VkIndirectExecutionSetCreateInfoEXT pCreateInfo,
    	@Nullable VkAllocationCallbacks pAllocator,
    	NativePointerArray pIndirectExecutionSet
    ) {
    	return vkCreateIndirectExecutionSetEXT(
    		device,
    		pCreateInfo.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment(),
    		pIndirectExecutionSet.memorySegment()
    	);
    }
    
    public static void vkDestroyIndirectExecutionSetEXT(
        VkDevice device,
    	MemorySegment indirectExecutionSet,
    	MemorySegment pAllocator
    ) {
        MethodHandle method = device.VK_DESTROY_INDIRECT_EXECUTION_SET_EXT().get();
        try {
             method.invokeExact(
                device.memorySegment(),
                indirectExecutionSet,
                pAllocator
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkDestroyIndirectExecutionSetEXT].
    public static void vkDestroyIndirectExecutionSetEXT(
    	VkDevice device,
    	@Nullable VkIndirectExecutionSetEXT indirectExecutionSet,
    	@Nullable VkAllocationCallbacks pAllocator
    ) {
    	vkDestroyIndirectExecutionSetEXT(
    		device,
    		indirectExecutionSet == null ? MemorySegment.NULL : indirectExecutionSet.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment()
    	);
    }
    
    public static void vkUpdateIndirectExecutionSetPipelineEXT(
        VkDevice device,
    	MemorySegment indirectExecutionSet,
    	int executionSetWriteCount,
    	MemorySegment pExecutionSetWrites
    ) {
        MethodHandle method = device.VK_UPDATE_INDIRECT_EXECUTION_SET_PIPELINE_EXT().get();
        try {
             method.invokeExact(
                device.memorySegment(),
                indirectExecutionSet,
                executionSetWriteCount,
                pExecutionSetWrites
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkUpdateIndirectExecutionSetPipelineEXT].
    public static void vkUpdateIndirectExecutionSetPipelineEXT(
    	VkDevice device,
    	VkIndirectExecutionSetEXT indirectExecutionSet,
    	int executionSetWriteCount,
    	NativeStructArray<VkWriteIndirectExecutionSetPipelineEXT> pExecutionSetWrites
    ) {
    	vkUpdateIndirectExecutionSetPipelineEXT(
    		device,
    		indirectExecutionSet.memorySegment(),
    		executionSetWriteCount,
    		pExecutionSetWrites.memorySegment()
    	);
    }
    
    public static void vkUpdateIndirectExecutionSetShaderEXT(
        VkDevice device,
    	MemorySegment indirectExecutionSet,
    	int executionSetWriteCount,
    	MemorySegment pExecutionSetWrites
    ) {
        MethodHandle method = device.VK_UPDATE_INDIRECT_EXECUTION_SET_SHADER_EXT().get();
        try {
             method.invokeExact(
                device.memorySegment(),
                indirectExecutionSet,
                executionSetWriteCount,
                pExecutionSetWrites
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkUpdateIndirectExecutionSetShaderEXT].
    public static void vkUpdateIndirectExecutionSetShaderEXT(
    	VkDevice device,
    	VkIndirectExecutionSetEXT indirectExecutionSet,
    	int executionSetWriteCount,
    	NativeStructArray<VkWriteIndirectExecutionSetShaderEXT> pExecutionSetWrites
    ) {
    	vkUpdateIndirectExecutionSetShaderEXT(
    		device,
    		indirectExecutionSet.memorySegment(),
    		executionSetWriteCount,
    		pExecutionSetWrites.memorySegment()
    	);
    }
    
    public static int vkGetPhysicalDeviceCooperativeMatrixFlexibleDimensionsPropertiesNV(
        VkPhysicalDevice physicalDevice,
    	MemorySegment pPropertyCount,
    	MemorySegment pProperties
    ) {
        MethodHandle method = physicalDevice.VK_GET_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_FLEXIBLE_DIMENSIONS_PROPERTIES_NV().get();
        try {
            return (int) method.invokeExact(
                physicalDevice.memorySegment(),
                pPropertyCount,
                pProperties
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetPhysicalDeviceCooperativeMatrixFlexibleDimensionsPropertiesNV].
    public static int vkGetPhysicalDeviceCooperativeMatrixFlexibleDimensionsPropertiesNV(
    	VkPhysicalDevice physicalDevice,
    	NativeIntArray pPropertyCount,
    	@Nullable NativeStructArray<VkCooperativeMatrixFlexibleDimensionsPropertiesNV> pProperties
    ) {
    	return vkGetPhysicalDeviceCooperativeMatrixFlexibleDimensionsPropertiesNV(
    		physicalDevice,
    		pPropertyCount.memorySegment(),
    		pProperties == null ? MemorySegment.NULL : pProperties.memorySegment()
    	);
    }
    
    public static int vkEnumeratePhysicalDeviceQueueFamilyPerformanceCountersByRegionARM(
        VkPhysicalDevice physicalDevice,
    	int queueFamilyIndex,
    	MemorySegment pCounterCount,
    	MemorySegment pCounters,
    	MemorySegment pCounterDescriptions
    ) {
        MethodHandle method = physicalDevice.VK_ENUMERATE_PHYSICAL_DEVICE_QUEUE_FAMILY_PERFORMANCE_COUNTERS_BY_REGION_ARM().get();
        try {
            return (int) method.invokeExact(
                physicalDevice.memorySegment(),
                queueFamilyIndex,
                pCounterCount,
                pCounters,
                pCounterDescriptions
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkEnumeratePhysicalDeviceQueueFamilyPerformanceCountersByRegionARM].
    public static int vkEnumeratePhysicalDeviceQueueFamilyPerformanceCountersByRegionARM(
    	VkPhysicalDevice physicalDevice,
    	int queueFamilyIndex,
    	NativeIntArray pCounterCount,
    	@Nullable NativeStructArray<VkPerformanceCounterARM> pCounters,
    	@Nullable NativeStructArray<VkPerformanceCounterDescriptionARM> pCounterDescriptions
    ) {
    	return vkEnumeratePhysicalDeviceQueueFamilyPerformanceCountersByRegionARM(
    		physicalDevice,
    		queueFamilyIndex,
    		pCounterCount.memorySegment(),
    		pCounters == null ? MemorySegment.NULL : pCounters.memorySegment(),
    		pCounterDescriptions == null ? MemorySegment.NULL : pCounterDescriptions.memorySegment()
    	);
    }
    
    public static int vkEnumeratePhysicalDeviceShaderInstrumentationMetricsARM(
        VkPhysicalDevice physicalDevice,
    	MemorySegment pDescriptionCount,
    	MemorySegment pDescriptions
    ) {
        MethodHandle method = physicalDevice.VK_ENUMERATE_PHYSICAL_DEVICE_SHADER_INSTRUMENTATION_METRICS_ARM().get();
        try {
            return (int) method.invokeExact(
                physicalDevice.memorySegment(),
                pDescriptionCount,
                pDescriptions
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkEnumeratePhysicalDeviceShaderInstrumentationMetricsARM].
    public static int vkEnumeratePhysicalDeviceShaderInstrumentationMetricsARM(
    	VkPhysicalDevice physicalDevice,
    	NativeIntArray pDescriptionCount,
    	@Nullable NativeStructArray<VkShaderInstrumentationMetricDescriptionARM> pDescriptions
    ) {
    	return vkEnumeratePhysicalDeviceShaderInstrumentationMetricsARM(
    		physicalDevice,
    		pDescriptionCount.memorySegment(),
    		pDescriptions == null ? MemorySegment.NULL : pDescriptions.memorySegment()
    	);
    }
    
    public static int vkCreateShaderInstrumentationARM(
        VkDevice device,
    	MemorySegment pCreateInfo,
    	MemorySegment pAllocator,
    	MemorySegment pInstrumentation
    ) {
        MethodHandle method = device.VK_CREATE_SHADER_INSTRUMENTATION_ARM().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                pCreateInfo,
                pAllocator,
                pInstrumentation
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCreateShaderInstrumentationARM].
    public static int vkCreateShaderInstrumentationARM(
    	VkDevice device,
    	VkShaderInstrumentationCreateInfoARM pCreateInfo,
    	@Nullable VkAllocationCallbacks pAllocator,
    	NativePointerArray pInstrumentation
    ) {
    	return vkCreateShaderInstrumentationARM(
    		device,
    		pCreateInfo.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment(),
    		pInstrumentation.memorySegment()
    	);
    }
    
    public static void vkDestroyShaderInstrumentationARM(
        VkDevice device,
    	MemorySegment instrumentation,
    	MemorySegment pAllocator
    ) {
        MethodHandle method = device.VK_DESTROY_SHADER_INSTRUMENTATION_ARM().get();
        try {
             method.invokeExact(
                device.memorySegment(),
                instrumentation,
                pAllocator
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkDestroyShaderInstrumentationARM].
    public static void vkDestroyShaderInstrumentationARM(
    	VkDevice device,
    	@Nullable VkShaderInstrumentationARM instrumentation,
    	@Nullable VkAllocationCallbacks pAllocator
    ) {
    	vkDestroyShaderInstrumentationARM(
    		device,
    		instrumentation == null ? MemorySegment.NULL : instrumentation.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment()
    	);
    }
    
    public static void vkCmdBeginShaderInstrumentationARM(
        VkCommandBuffer commandBuffer,
    	MemorySegment instrumentation
    ) {
        MethodHandle method = commandBuffer.VK_CMD_BEGIN_SHADER_INSTRUMENTATION_ARM().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                instrumentation
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdBeginShaderInstrumentationARM].
    public static void vkCmdBeginShaderInstrumentationARM(
    	VkCommandBuffer commandBuffer,
    	VkShaderInstrumentationARM instrumentation
    ) {
    	vkCmdBeginShaderInstrumentationARM(
    		commandBuffer,
    		instrumentation.memorySegment()
    	);
    }
    
    public static void vkCmdEndShaderInstrumentationARM(
        VkCommandBuffer commandBuffer
    ) {
        MethodHandle method = commandBuffer.VK_CMD_END_SHADER_INSTRUMENTATION_ARM().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    
    public static int vkGetShaderInstrumentationValuesARM(
        VkDevice device,
    	MemorySegment instrumentation,
    	MemorySegment pMetricBlockCount,
    	MemorySegment pMetricValues,
    	int flags
    ) {
        MethodHandle method = device.VK_GET_SHADER_INSTRUMENTATION_VALUES_ARM().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                instrumentation,
                pMetricBlockCount,
                pMetricValues,
                flags
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetShaderInstrumentationValuesARM].
    public static int vkGetShaderInstrumentationValuesARM(
    	VkDevice device,
    	VkShaderInstrumentationARM instrumentation,
    	NativeIntArray pMetricBlockCount,
    	MemorySegment pMetricValues,
    	int flags
    ) {
    	return vkGetShaderInstrumentationValuesARM(
    		device,
    		instrumentation.memorySegment(),
    		pMetricBlockCount.memorySegment(),
    		pMetricValues,
    		flags
    	);
    }
    
    public static void vkClearShaderInstrumentationMetricsARM(
        VkDevice device,
    	MemorySegment instrumentation
    ) {
        MethodHandle method = device.VK_CLEAR_SHADER_INSTRUMENTATION_METRICS_ARM().get();
        try {
             method.invokeExact(
                device.memorySegment(),
                instrumentation
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkClearShaderInstrumentationMetricsARM].
    public static void vkClearShaderInstrumentationMetricsARM(
    	VkDevice device,
    	VkShaderInstrumentationARM instrumentation
    ) {
    	vkClearShaderInstrumentationMetricsARM(
    		device,
    		instrumentation.memorySegment()
    	);
    }
    
    public static void vkCmdBeginCustomResolveEXT(
        VkCommandBuffer commandBuffer,
    	MemorySegment pBeginCustomResolveInfo
    ) {
        MethodHandle method = commandBuffer.VK_CMD_BEGIN_CUSTOM_RESOLVE_EXT().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                pBeginCustomResolveInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdBeginCustomResolveEXT].
    public static void vkCmdBeginCustomResolveEXT(
    	VkCommandBuffer commandBuffer,
    	@Nullable VkBeginCustomResolveInfoEXT pBeginCustomResolveInfo
    ) {
    	vkCmdBeginCustomResolveEXT(
    		commandBuffer,
    		pBeginCustomResolveInfo == null ? MemorySegment.NULL : pBeginCustomResolveInfo.memorySegment()
    	);
    }
    
    public static int vkGetPhysicalDeviceQueueFamilyDataGraphOpticalFlowImageFormatsARM(
        VkPhysicalDevice physicalDevice,
    	int queueFamilyIndex,
    	MemorySegment pQueueFamilyDataGraphProperties,
    	MemorySegment pOpticalFlowImageFormatInfo,
    	MemorySegment pFormatCount,
    	MemorySegment pImageFormatProperties
    ) {
        MethodHandle method = physicalDevice.VK_GET_PHYSICAL_DEVICE_QUEUE_FAMILY_DATA_GRAPH_OPTICAL_FLOW_IMAGE_FORMATS_ARM().get();
        try {
            return (int) method.invokeExact(
                physicalDevice.memorySegment(),
                queueFamilyIndex,
                pQueueFamilyDataGraphProperties,
                pOpticalFlowImageFormatInfo,
                pFormatCount,
                pImageFormatProperties
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetPhysicalDeviceQueueFamilyDataGraphOpticalFlowImageFormatsARM].
    public static int vkGetPhysicalDeviceQueueFamilyDataGraphOpticalFlowImageFormatsARM(
    	VkPhysicalDevice physicalDevice,
    	int queueFamilyIndex,
    	VkQueueFamilyDataGraphPropertiesARM pQueueFamilyDataGraphProperties,
    	VkDataGraphOpticalFlowImageFormatInfoARM pOpticalFlowImageFormatInfo,
    	NativeIntArray pFormatCount,
    	@Nullable NativeStructArray<VkDataGraphOpticalFlowImageFormatPropertiesARM> pImageFormatProperties
    ) {
    	return vkGetPhysicalDeviceQueueFamilyDataGraphOpticalFlowImageFormatsARM(
    		physicalDevice,
    		queueFamilyIndex,
    		pQueueFamilyDataGraphProperties.memorySegment(),
    		pOpticalFlowImageFormatInfo.memorySegment(),
    		pFormatCount.memorySegment(),
    		pImageFormatProperties == null ? MemorySegment.NULL : pImageFormatProperties.memorySegment()
    	);
    }
    
    public static void vkCmdSetComputeOccupancyPriorityNV(
        VkCommandBuffer commandBuffer,
    	MemorySegment pParameters
    ) {
        MethodHandle method = commandBuffer.VK_CMD_SET_COMPUTE_OCCUPANCY_PRIORITY_NV().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                pParameters
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdSetComputeOccupancyPriorityNV].
    public static void vkCmdSetComputeOccupancyPriorityNV(
    	VkCommandBuffer commandBuffer,
    	VkComputeOccupancyPriorityParametersNV pParameters
    ) {
    	vkCmdSetComputeOccupancyPriorityNV(
    		commandBuffer,
    		pParameters.memorySegment()
    	);
    }
    
    public static void vkCmdSetPrimitiveRestartIndexEXT(
        VkCommandBuffer commandBuffer,
    	int primitiveRestartIndex
    ) {
        MethodHandle method = commandBuffer.VK_CMD_SET_PRIMITIVE_RESTART_INDEX_EXT().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                primitiveRestartIndex
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    
    public static int vkCreateAccelerationStructureKHR(
        VkDevice device,
    	MemorySegment pCreateInfo,
    	MemorySegment pAllocator,
    	MemorySegment pAccelerationStructure
    ) {
        MethodHandle method = device.VK_CREATE_ACCELERATION_STRUCTURE_KHR().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                pCreateInfo,
                pAllocator,
                pAccelerationStructure
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCreateAccelerationStructureKHR].
    public static int vkCreateAccelerationStructureKHR(
    	VkDevice device,
    	VkAccelerationStructureCreateInfoKHR pCreateInfo,
    	@Nullable VkAllocationCallbacks pAllocator,
    	NativePointerArray pAccelerationStructure
    ) {
    	return vkCreateAccelerationStructureKHR(
    		device,
    		pCreateInfo.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment(),
    		pAccelerationStructure.memorySegment()
    	);
    }
    
    public static void vkDestroyAccelerationStructureKHR(
        VkDevice device,
    	MemorySegment accelerationStructure,
    	MemorySegment pAllocator
    ) {
        MethodHandle method = device.VK_DESTROY_ACCELERATION_STRUCTURE_KHR().get();
        try {
             method.invokeExact(
                device.memorySegment(),
                accelerationStructure,
                pAllocator
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkDestroyAccelerationStructureKHR].
    public static void vkDestroyAccelerationStructureKHR(
    	VkDevice device,
    	@Nullable VkAccelerationStructureKHR accelerationStructure,
    	@Nullable VkAllocationCallbacks pAllocator
    ) {
    	vkDestroyAccelerationStructureKHR(
    		device,
    		accelerationStructure == null ? MemorySegment.NULL : accelerationStructure.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment()
    	);
    }
    
    public static void vkCmdBuildAccelerationStructuresKHR(
        VkCommandBuffer commandBuffer,
    	int infoCount,
    	MemorySegment pInfos,
    	MemorySegment ppBuildRangeInfos
    ) {
        MethodHandle method = commandBuffer.VK_CMD_BUILD_ACCELERATION_STRUCTURES_KHR().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                infoCount,
                pInfos,
                ppBuildRangeInfos
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdBuildAccelerationStructuresKHR].
    public static void vkCmdBuildAccelerationStructuresKHR(
    	VkCommandBuffer commandBuffer,
    	int infoCount,
    	NativeStructArray<VkAccelerationStructureBuildGeometryInfoKHR> pInfos,
    	NativePointerArray ppBuildRangeInfos
    ) {
    	vkCmdBuildAccelerationStructuresKHR(
    		commandBuffer,
    		infoCount,
    		pInfos.memorySegment(),
    		ppBuildRangeInfos.memorySegment()
    	);
    }
    
    public static void vkCmdBuildAccelerationStructuresIndirectKHR(
        VkCommandBuffer commandBuffer,
    	int infoCount,
    	MemorySegment pInfos,
    	MemorySegment pIndirectDeviceAddresses,
    	MemorySegment pIndirectStrides,
    	MemorySegment ppMaxPrimitiveCounts
    ) {
        MethodHandle method = commandBuffer.VK_CMD_BUILD_ACCELERATION_STRUCTURES_INDIRECT_KHR().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                infoCount,
                pInfos,
                pIndirectDeviceAddresses,
                pIndirectStrides,
                ppMaxPrimitiveCounts
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdBuildAccelerationStructuresIndirectKHR].
    public static void vkCmdBuildAccelerationStructuresIndirectKHR(
    	VkCommandBuffer commandBuffer,
    	int infoCount,
    	NativeStructArray<VkAccelerationStructureBuildGeometryInfoKHR> pInfos,
    	NativeLongArray pIndirectDeviceAddresses,
    	NativeIntArray pIndirectStrides,
    	NativePointerArray ppMaxPrimitiveCounts
    ) {
    	vkCmdBuildAccelerationStructuresIndirectKHR(
    		commandBuffer,
    		infoCount,
    		pInfos.memorySegment(),
    		pIndirectDeviceAddresses.memorySegment(),
    		pIndirectStrides.memorySegment(),
    		ppMaxPrimitiveCounts.memorySegment()
    	);
    }
    
    public static int vkBuildAccelerationStructuresKHR(
        VkDevice device,
    	MemorySegment deferredOperation,
    	int infoCount,
    	MemorySegment pInfos,
    	MemorySegment ppBuildRangeInfos
    ) {
        MethodHandle method = device.VK_BUILD_ACCELERATION_STRUCTURES_KHR().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                deferredOperation,
                infoCount,
                pInfos,
                ppBuildRangeInfos
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkBuildAccelerationStructuresKHR].
    public static int vkBuildAccelerationStructuresKHR(
    	VkDevice device,
    	@Nullable VkDeferredOperationKHR deferredOperation,
    	int infoCount,
    	NativeStructArray<VkAccelerationStructureBuildGeometryInfoKHR> pInfos,
    	NativePointerArray ppBuildRangeInfos
    ) {
    	return vkBuildAccelerationStructuresKHR(
    		device,
    		deferredOperation == null ? MemorySegment.NULL : deferredOperation.memorySegment(),
    		infoCount,
    		pInfos.memorySegment(),
    		ppBuildRangeInfos.memorySegment()
    	);
    }
    
    public static int vkCopyAccelerationStructureKHR(
        VkDevice device,
    	MemorySegment deferredOperation,
    	MemorySegment pInfo
    ) {
        MethodHandle method = device.VK_COPY_ACCELERATION_STRUCTURE_KHR().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                deferredOperation,
                pInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCopyAccelerationStructureKHR].
    public static int vkCopyAccelerationStructureKHR(
    	VkDevice device,
    	@Nullable VkDeferredOperationKHR deferredOperation,
    	VkCopyAccelerationStructureInfoKHR pInfo
    ) {
    	return vkCopyAccelerationStructureKHR(
    		device,
    		deferredOperation == null ? MemorySegment.NULL : deferredOperation.memorySegment(),
    		pInfo.memorySegment()
    	);
    }
    
    public static int vkCopyAccelerationStructureToMemoryKHR(
        VkDevice device,
    	MemorySegment deferredOperation,
    	MemorySegment pInfo
    ) {
        MethodHandle method = device.VK_COPY_ACCELERATION_STRUCTURE_TO_MEMORY_KHR().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                deferredOperation,
                pInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCopyAccelerationStructureToMemoryKHR].
    public static int vkCopyAccelerationStructureToMemoryKHR(
    	VkDevice device,
    	@Nullable VkDeferredOperationKHR deferredOperation,
    	VkCopyAccelerationStructureToMemoryInfoKHR pInfo
    ) {
    	return vkCopyAccelerationStructureToMemoryKHR(
    		device,
    		deferredOperation == null ? MemorySegment.NULL : deferredOperation.memorySegment(),
    		pInfo.memorySegment()
    	);
    }
    
    public static int vkCopyMemoryToAccelerationStructureKHR(
        VkDevice device,
    	MemorySegment deferredOperation,
    	MemorySegment pInfo
    ) {
        MethodHandle method = device.VK_COPY_MEMORY_TO_ACCELERATION_STRUCTURE_KHR().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                deferredOperation,
                pInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCopyMemoryToAccelerationStructureKHR].
    public static int vkCopyMemoryToAccelerationStructureKHR(
    	VkDevice device,
    	@Nullable VkDeferredOperationKHR deferredOperation,
    	VkCopyMemoryToAccelerationStructureInfoKHR pInfo
    ) {
    	return vkCopyMemoryToAccelerationStructureKHR(
    		device,
    		deferredOperation == null ? MemorySegment.NULL : deferredOperation.memorySegment(),
    		pInfo.memorySegment()
    	);
    }
    
    public static int vkWriteAccelerationStructuresPropertiesKHR(
        VkDevice device,
    	int accelerationStructureCount,
    	MemorySegment pAccelerationStructures,
    	int queryType,
    	long dataSize,
    	MemorySegment pData,
    	long stride
    ) {
        MethodHandle method = device.VK_WRITE_ACCELERATION_STRUCTURES_PROPERTIES_KHR().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                accelerationStructureCount,
                pAccelerationStructures,
                queryType,
                dataSize,
                pData,
                stride
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkWriteAccelerationStructuresPropertiesKHR].
    public static int vkWriteAccelerationStructuresPropertiesKHR(
    	VkDevice device,
    	int accelerationStructureCount,
    	NativePointerArray pAccelerationStructures,
    	int queryType,
    	long dataSize,
    	MemorySegment pData,
    	long stride
    ) {
    	return vkWriteAccelerationStructuresPropertiesKHR(
    		device,
    		accelerationStructureCount,
    		pAccelerationStructures.memorySegment(),
    		queryType,
    		dataSize,
    		pData,
    		stride
    	);
    }
    
    public static void vkCmdCopyAccelerationStructureKHR(
        VkCommandBuffer commandBuffer,
    	MemorySegment pInfo
    ) {
        MethodHandle method = commandBuffer.VK_CMD_COPY_ACCELERATION_STRUCTURE_KHR().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                pInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdCopyAccelerationStructureKHR].
    public static void vkCmdCopyAccelerationStructureKHR(
    	VkCommandBuffer commandBuffer,
    	VkCopyAccelerationStructureInfoKHR pInfo
    ) {
    	vkCmdCopyAccelerationStructureKHR(
    		commandBuffer,
    		pInfo.memorySegment()
    	);
    }
    
    public static void vkCmdCopyAccelerationStructureToMemoryKHR(
        VkCommandBuffer commandBuffer,
    	MemorySegment pInfo
    ) {
        MethodHandle method = commandBuffer.VK_CMD_COPY_ACCELERATION_STRUCTURE_TO_MEMORY_KHR().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                pInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdCopyAccelerationStructureToMemoryKHR].
    public static void vkCmdCopyAccelerationStructureToMemoryKHR(
    	VkCommandBuffer commandBuffer,
    	VkCopyAccelerationStructureToMemoryInfoKHR pInfo
    ) {
    	vkCmdCopyAccelerationStructureToMemoryKHR(
    		commandBuffer,
    		pInfo.memorySegment()
    	);
    }
    
    public static void vkCmdCopyMemoryToAccelerationStructureKHR(
        VkCommandBuffer commandBuffer,
    	MemorySegment pInfo
    ) {
        MethodHandle method = commandBuffer.VK_CMD_COPY_MEMORY_TO_ACCELERATION_STRUCTURE_KHR().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                pInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdCopyMemoryToAccelerationStructureKHR].
    public static void vkCmdCopyMemoryToAccelerationStructureKHR(
    	VkCommandBuffer commandBuffer,
    	VkCopyMemoryToAccelerationStructureInfoKHR pInfo
    ) {
    	vkCmdCopyMemoryToAccelerationStructureKHR(
    		commandBuffer,
    		pInfo.memorySegment()
    	);
    }
    
    public static long vkGetAccelerationStructureDeviceAddressKHR(
        VkDevice device,
    	MemorySegment pInfo
    ) {
        MethodHandle method = device.VK_GET_ACCELERATION_STRUCTURE_DEVICE_ADDRESS_KHR().get();
        try {
            return (long) method.invokeExact(
                device.memorySegment(),
                pInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetAccelerationStructureDeviceAddressKHR].
    public static long vkGetAccelerationStructureDeviceAddressKHR(
    	VkDevice device,
    	VkAccelerationStructureDeviceAddressInfoKHR pInfo
    ) {
    	return vkGetAccelerationStructureDeviceAddressKHR(
    		device,
    		pInfo.memorySegment()
    	);
    }
    
    public static void vkCmdWriteAccelerationStructuresPropertiesKHR(
        VkCommandBuffer commandBuffer,
    	int accelerationStructureCount,
    	MemorySegment pAccelerationStructures,
    	int queryType,
    	MemorySegment queryPool,
    	int firstQuery
    ) {
        MethodHandle method = commandBuffer.VK_CMD_WRITE_ACCELERATION_STRUCTURES_PROPERTIES_KHR().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                accelerationStructureCount,
                pAccelerationStructures,
                queryType,
                queryPool,
                firstQuery
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdWriteAccelerationStructuresPropertiesKHR].
    public static void vkCmdWriteAccelerationStructuresPropertiesKHR(
    	VkCommandBuffer commandBuffer,
    	int accelerationStructureCount,
    	NativePointerArray pAccelerationStructures,
    	int queryType,
    	VkQueryPool queryPool,
    	int firstQuery
    ) {
    	vkCmdWriteAccelerationStructuresPropertiesKHR(
    		commandBuffer,
    		accelerationStructureCount,
    		pAccelerationStructures.memorySegment(),
    		queryType,
    		queryPool.memorySegment(),
    		firstQuery
    	);
    }
    
    public static void vkGetDeviceAccelerationStructureCompatibilityKHR(
        VkDevice device,
    	MemorySegment pVersionInfo,
    	MemorySegment pCompatibility
    ) {
        MethodHandle method = device.VK_GET_DEVICE_ACCELERATION_STRUCTURE_COMPATIBILITY_KHR().get();
        try {
             method.invokeExact(
                device.memorySegment(),
                pVersionInfo,
                pCompatibility
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetDeviceAccelerationStructureCompatibilityKHR].
    public static void vkGetDeviceAccelerationStructureCompatibilityKHR(
    	VkDevice device,
    	VkAccelerationStructureVersionInfoKHR pVersionInfo,
    	NativeIntArray pCompatibility
    ) {
    	vkGetDeviceAccelerationStructureCompatibilityKHR(
    		device,
    		pVersionInfo.memorySegment(),
    		pCompatibility.memorySegment()
    	);
    }
    
    public static void vkGetAccelerationStructureBuildSizesKHR(
        VkDevice device,
    	int buildType,
    	MemorySegment pBuildInfo,
    	MemorySegment pMaxPrimitiveCounts,
    	MemorySegment pSizeInfo
    ) {
        MethodHandle method = device.VK_GET_ACCELERATION_STRUCTURE_BUILD_SIZES_KHR().get();
        try {
             method.invokeExact(
                device.memorySegment(),
                buildType,
                pBuildInfo,
                pMaxPrimitiveCounts,
                pSizeInfo
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetAccelerationStructureBuildSizesKHR].
    public static void vkGetAccelerationStructureBuildSizesKHR(
    	VkDevice device,
    	int buildType,
    	VkAccelerationStructureBuildGeometryInfoKHR pBuildInfo,
    	@Nullable NativeIntArray pMaxPrimitiveCounts,
    	VkAccelerationStructureBuildSizesInfoKHR pSizeInfo
    ) {
    	vkGetAccelerationStructureBuildSizesKHR(
    		device,
    		buildType,
    		pBuildInfo.memorySegment(),
    		pMaxPrimitiveCounts == null ? MemorySegment.NULL : pMaxPrimitiveCounts.memorySegment(),
    		pSizeInfo.memorySegment()
    	);
    }
    
    public static void vkCmdTraceRaysKHR(
        VkCommandBuffer commandBuffer,
    	MemorySegment pRaygenShaderBindingTable,
    	MemorySegment pMissShaderBindingTable,
    	MemorySegment pHitShaderBindingTable,
    	MemorySegment pCallableShaderBindingTable,
    	int width,
    	int height,
    	int depth
    ) {
        MethodHandle method = commandBuffer.VK_CMD_TRACE_RAYS_KHR().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                pRaygenShaderBindingTable,
                pMissShaderBindingTable,
                pHitShaderBindingTable,
                pCallableShaderBindingTable,
                width,
                height,
                depth
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdTraceRaysKHR].
    public static void vkCmdTraceRaysKHR(
    	VkCommandBuffer commandBuffer,
    	VkStridedDeviceAddressRegionKHR pRaygenShaderBindingTable,
    	VkStridedDeviceAddressRegionKHR pMissShaderBindingTable,
    	VkStridedDeviceAddressRegionKHR pHitShaderBindingTable,
    	VkStridedDeviceAddressRegionKHR pCallableShaderBindingTable,
    	int width,
    	int height,
    	int depth
    ) {
    	vkCmdTraceRaysKHR(
    		commandBuffer,
    		pRaygenShaderBindingTable.memorySegment(),
    		pMissShaderBindingTable.memorySegment(),
    		pHitShaderBindingTable.memorySegment(),
    		pCallableShaderBindingTable.memorySegment(),
    		width,
    		height,
    		depth
    	);
    }
    
    public static int vkCreateRayTracingPipelinesKHR(
        VkDevice device,
    	MemorySegment deferredOperation,
    	MemorySegment pipelineCache,
    	int createInfoCount,
    	MemorySegment pCreateInfos,
    	MemorySegment pAllocator,
    	MemorySegment pPipelines
    ) {
        MethodHandle method = device.VK_CREATE_RAY_TRACING_PIPELINES_KHR().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                deferredOperation,
                pipelineCache,
                createInfoCount,
                pCreateInfos,
                pAllocator,
                pPipelines
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCreateRayTracingPipelinesKHR].
    public static int vkCreateRayTracingPipelinesKHR(
    	VkDevice device,
    	@Nullable VkDeferredOperationKHR deferredOperation,
    	VkPipelineCache pipelineCache,
    	int createInfoCount,
    	NativeStructArray<VkRayTracingPipelineCreateInfoKHR> pCreateInfos,
    	@Nullable VkAllocationCallbacks pAllocator,
    	NativePointerArray pPipelines
    ) {
    	return vkCreateRayTracingPipelinesKHR(
    		device,
    		deferredOperation == null ? MemorySegment.NULL : deferredOperation.memorySegment(),
    		pipelineCache.memorySegment(),
    		createInfoCount,
    		pCreateInfos.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment(),
    		pPipelines.memorySegment()
    	);
    }
    
    public static int vkGetRayTracingCaptureReplayShaderGroupHandlesKHR(
        VkDevice device,
    	MemorySegment pipeline,
    	int firstGroup,
    	int groupCount,
    	long dataSize,
    	MemorySegment pData
    ) {
        MethodHandle method = device.VK_GET_RAY_TRACING_CAPTURE_REPLAY_SHADER_GROUP_HANDLES_KHR().get();
        try {
            return (int) method.invokeExact(
                device.memorySegment(),
                pipeline,
                firstGroup,
                groupCount,
                dataSize,
                pData
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetRayTracingCaptureReplayShaderGroupHandlesKHR].
    public static int vkGetRayTracingCaptureReplayShaderGroupHandlesKHR(
    	VkDevice device,
    	VkPipeline pipeline,
    	int firstGroup,
    	int groupCount,
    	long dataSize,
    	MemorySegment pData
    ) {
    	return vkGetRayTracingCaptureReplayShaderGroupHandlesKHR(
    		device,
    		pipeline.memorySegment(),
    		firstGroup,
    		groupCount,
    		dataSize,
    		pData
    	);
    }
    
    public static void vkCmdTraceRaysIndirectKHR(
        VkCommandBuffer commandBuffer,
    	MemorySegment pRaygenShaderBindingTable,
    	MemorySegment pMissShaderBindingTable,
    	MemorySegment pHitShaderBindingTable,
    	MemorySegment pCallableShaderBindingTable,
    	long indirectDeviceAddress
    ) {
        MethodHandle method = commandBuffer.VK_CMD_TRACE_RAYS_INDIRECT_KHR().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                pRaygenShaderBindingTable,
                pMissShaderBindingTable,
                pHitShaderBindingTable,
                pCallableShaderBindingTable,
                indirectDeviceAddress
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdTraceRaysIndirectKHR].
    public static void vkCmdTraceRaysIndirectKHR(
    	VkCommandBuffer commandBuffer,
    	VkStridedDeviceAddressRegionKHR pRaygenShaderBindingTable,
    	VkStridedDeviceAddressRegionKHR pMissShaderBindingTable,
    	VkStridedDeviceAddressRegionKHR pHitShaderBindingTable,
    	VkStridedDeviceAddressRegionKHR pCallableShaderBindingTable,
    	long indirectDeviceAddress
    ) {
    	vkCmdTraceRaysIndirectKHR(
    		commandBuffer,
    		pRaygenShaderBindingTable.memorySegment(),
    		pMissShaderBindingTable.memorySegment(),
    		pHitShaderBindingTable.memorySegment(),
    		pCallableShaderBindingTable.memorySegment(),
    		indirectDeviceAddress
    	);
    }
    
    public static long vkGetRayTracingShaderGroupStackSizeKHR(
        VkDevice device,
    	MemorySegment pipeline,
    	int group,
    	int groupShader
    ) {
        MethodHandle method = device.VK_GET_RAY_TRACING_SHADER_GROUP_STACK_SIZE_KHR().get();
        try {
            return (long) method.invokeExact(
                device.memorySegment(),
                pipeline,
                group,
                groupShader
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkGetRayTracingShaderGroupStackSizeKHR].
    public static long vkGetRayTracingShaderGroupStackSizeKHR(
    	VkDevice device,
    	VkPipeline pipeline,
    	int group,
    	int groupShader
    ) {
    	return vkGetRayTracingShaderGroupStackSizeKHR(
    		device,
    		pipeline.memorySegment(),
    		group,
    		groupShader
    	);
    }
    
    public static void vkCmdSetRayTracingPipelineStackSizeKHR(
        VkCommandBuffer commandBuffer,
    	int pipelineStackSize
    ) {
        MethodHandle method = commandBuffer.VK_CMD_SET_RAY_TRACING_PIPELINE_STACK_SIZE_KHR().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                pipelineStackSize
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    
    public static void vkCmdDrawMeshTasksEXT(
        VkCommandBuffer commandBuffer,
    	int groupCountX,
    	int groupCountY,
    	int groupCountZ
    ) {
        MethodHandle method = commandBuffer.VK_CMD_DRAW_MESH_TASKS_EXT().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                groupCountX,
                groupCountY,
                groupCountZ
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    
    public static void vkCmdDrawMeshTasksIndirectEXT(
        VkCommandBuffer commandBuffer,
    	MemorySegment buffer,
    	long offset,
    	int drawCount,
    	int stride
    ) {
        MethodHandle method = commandBuffer.VK_CMD_DRAW_MESH_TASKS_INDIRECT_EXT().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                buffer,
                offset,
                drawCount,
                stride
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdDrawMeshTasksIndirectEXT].
    public static void vkCmdDrawMeshTasksIndirectEXT(
    	VkCommandBuffer commandBuffer,
    	VkBuffer buffer,
    	long offset,
    	int drawCount,
    	int stride
    ) {
    	vkCmdDrawMeshTasksIndirectEXT(
    		commandBuffer,
    		buffer.memorySegment(),
    		offset,
    		drawCount,
    		stride
    	);
    }
    
    public static void vkCmdDrawMeshTasksIndirectCountEXT(
        VkCommandBuffer commandBuffer,
    	MemorySegment buffer,
    	long offset,
    	MemorySegment countBuffer,
    	long countBufferOffset,
    	int maxDrawCount,
    	int stride
    ) {
        MethodHandle method = commandBuffer.VK_CMD_DRAW_MESH_TASKS_INDIRECT_COUNT_EXT().get();
        try {
             method.invokeExact(
                commandBuffer.memorySegment(),
                buffer,
                offset,
                countBuffer,
                countBufferOffset,
                maxDrawCount,
                stride
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    
    /// Typed method of [#vkCmdDrawMeshTasksIndirectCountEXT].
    public static void vkCmdDrawMeshTasksIndirectCountEXT(
    	VkCommandBuffer commandBuffer,
    	VkBuffer buffer,
    	long offset,
    	VkBuffer countBuffer,
    	long countBufferOffset,
    	int maxDrawCount,
    	int stride
    ) {
    	vkCmdDrawMeshTasksIndirectCountEXT(
    		commandBuffer,
    		buffer.memorySegment(),
    		offset,
    		countBuffer.memorySegment(),
    		countBufferOffset,
    		maxDrawCount,
    		stride
    	);
    }

}