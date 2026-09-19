package volucris.bindings.vma.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.foreign.SymbolLookup;
import java.lang.invoke.VarHandle;

import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.VkInstance;
import volucris.bindings.vulkan.glfw.GLFWVulkan;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.UNBOUNDED_ADDRESS;;

/**
 * Pointers to some Vulkan functions - a subset used by the library.
 */
public final class VmaVulkanFunctions
		implements Struct<VmaVulkanFunctions> {

    public static final StructLayout LAYOUT;

    public static final VarHandle VK_GET_INSTANCE_PROC_ADDR_HANDLE;
    public static final VarHandle VK_GET_DEVICE_PROC_ADDR_HANDLE;
    public static final VarHandle VK_GET_PHYSICAL_DEVICE_PROPERTIES_HANDLE;
    public static final VarHandle VK_GET_PHYSICAL_DEVICE_MEMORY_PROPERTIES_HANDLE;
    public static final VarHandle VK_ALLOCATE_MEMORY_HANDLE;
    public static final VarHandle VK_FREE_MEMORY_HANDLE;
    public static final VarHandle VK_MAP_MEMORY_HANDLE;
    public static final VarHandle VK_UNMAP_MEMORY_HANDLE;
    public static final VarHandle VK_FLUSH_MAPPED_MEMORY_RANGES_HANDLE;
    public static final VarHandle VK_INVALIDATE_MAPPED_MEMORY_RANGES_HANDLE;
    public static final VarHandle VK_BIND_BUFFER_MEMORY_HANDLE;
    public static final VarHandle VK_BIND_IMAGE_MEMORY_HANDLE;
    public static final VarHandle VK_GET_BUFFER_MEMORY_REQUIREMENTS_HANDLE;
    public static final VarHandle VK_GET_IMAGE_MEMORY_REQUIREMENTS_HANDLE;
    public static final VarHandle VK_CREATE_BUFFER_HANDLE;
    public static final VarHandle VK_DESTROY_BUFFER_HANDLE;
    public static final VarHandle VK_CREATE_IMAGE_HANDLE;
    public static final VarHandle VK_DESTROY_IMAGE_HANDLE;
    public static final VarHandle VK_CMD_COPY_BUFFER_HANDLE;
    public static final VarHandle VK_GET_BUFFER_MEMORY_REQUIREMENTS2_KHR_HANDLE;
    public static final VarHandle VK_GET_IMAGE_MEMORY_REQUIREMENTS2_KHR_HANDLE;
    public static final VarHandle VK_BIND_BUFFER_MEMORY2_KHR_HANDLE;
    public static final VarHandle VK_BIND_IMAGE_MEMORY2_KHR_HANDLE;
    public static final VarHandle VK_GET_PHYSICAL_DEVICE_MEMORY_PROPERTIES2_KHR_HANDLE;
    public static final VarHandle VK_GET_DEVICE_BUFFER_MEMORY_REQUIREMENTS_HANDLE;
    public static final VarHandle VK_GET_DEVICE_IMAGE_MEMORY_REQUIREMENTS_HANDLE;
    public static final VarHandle VK_GET_MEMORY_WIN32_HANDLE_KHR_HANDLE;

    public static final long VK_GET_INSTANCE_PROC_ADDR_BYTE_OFFSET;
    public static final long VK_GET_DEVICE_PROC_ADDR_BYTE_OFFSET;
    public static final long VK_GET_PHYSICAL_DEVICE_PROPERTIES_BYTE_OFFSET;
    public static final long VK_GET_PHYSICAL_DEVICE_MEMORY_PROPERTIES_BYTE_OFFSET;
    public static final long VK_ALLOCATE_MEMORY_BYTE_OFFSET;
    public static final long VK_FREE_MEMORY_BYTE_OFFSET;
    public static final long VK_MAP_MEMORY_BYTE_OFFSET;
    public static final long VK_UNMAP_MEMORY_BYTE_OFFSET;
    public static final long VK_FLUSH_MAPPED_MEMORY_RANGES_BYTE_OFFSET;
    public static final long VK_INVALIDATE_MAPPED_MEMORY_RANGES_BYTE_OFFSET;
    public static final long VK_BIND_BUFFER_MEMORY_BYTE_OFFSET;
    public static final long VK_BIND_IMAGE_MEMORY_BYTE_OFFSET;
    public static final long VK_GET_BUFFER_MEMORY_REQUIREMENTS_BYTE_OFFSET;
    public static final long VK_GET_IMAGE_MEMORY_REQUIREMENTS_BYTE_OFFSET;
    public static final long VK_CREATE_BUFFER_BYTE_OFFSET;
    public static final long VK_DESTROY_BUFFER_BYTE_OFFSET;
    public static final long VK_CREATE_IMAGE_BYTE_OFFSET;
    public static final long VK_DESTROY_IMAGE_BYTE_OFFSET;
    public static final long VK_CMD_COPY_BUFFER_BYTE_OFFSET;
    public static final long VK_GET_BUFFER_MEMORY_REQUIREMENTS2_KHR_BYTE_OFFSET;
    public static final long VK_GET_IMAGE_MEMORY_REQUIREMENTS2_KHR_BYTE_OFFSET;
    public static final long VK_BIND_BUFFER_MEMORY2_KHR_BYTE_OFFSET;
    public static final long VK_BIND_IMAGE_MEMORY2_KHR_BYTE_OFFSET;
    public static final long VK_GET_PHYSICAL_DEVICE_MEMORY_PROPERTIES2_KHR_BYTE_OFFSET;
    public static final long VK_GET_DEVICE_BUFFER_MEMORY_REQUIREMENTS_BYTE_OFFSET;
    public static final long VK_GET_DEVICE_IMAGE_MEMORY_REQUIREMENTS_BYTE_OFFSET;
    public static final long VK_GET_MEMORY_WIN32_HANDLE_KHR_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            UNBOUNDED_ADDRESS.withName("vkGetInstanceProcAddr"),
            UNBOUNDED_ADDRESS.withName("vkGetDeviceProcAddr"),
            UNBOUNDED_ADDRESS.withName("vkGetPhysicalDeviceProperties"),
            UNBOUNDED_ADDRESS.withName("vkGetPhysicalDeviceMemoryProperties"),
            UNBOUNDED_ADDRESS.withName("vkAllocateMemory"),
            UNBOUNDED_ADDRESS.withName("vkFreeMemory"),
            UNBOUNDED_ADDRESS.withName("vkMapMemory"),
            UNBOUNDED_ADDRESS.withName("vkUnmapMemory"),
            UNBOUNDED_ADDRESS.withName("vkFlushMappedMemoryRanges"),
            UNBOUNDED_ADDRESS.withName("vkInvalidateMappedMemoryRanges"),
            UNBOUNDED_ADDRESS.withName("vkBindBufferMemory"),
            UNBOUNDED_ADDRESS.withName("vkBindImageMemory"),
            UNBOUNDED_ADDRESS.withName("vkGetBufferMemoryRequirements"),
            UNBOUNDED_ADDRESS.withName("vkGetImageMemoryRequirements"),
            UNBOUNDED_ADDRESS.withName("vkCreateBuffer"),
            UNBOUNDED_ADDRESS.withName("vkDestroyBuffer"),
            UNBOUNDED_ADDRESS.withName("vkCreateImage"),
            UNBOUNDED_ADDRESS.withName("vkDestroyImage"),
            UNBOUNDED_ADDRESS.withName("vkCmdCopyBuffer"),
            UNBOUNDED_ADDRESS.withName("vkGetBufferMemoryRequirements2KHR"),
            UNBOUNDED_ADDRESS.withName("vkGetImageMemoryRequirements2KHR"),
            UNBOUNDED_ADDRESS.withName("vkBindBufferMemory2KHR"),
            UNBOUNDED_ADDRESS.withName("vkBindImageMemory2KHR"),
            UNBOUNDED_ADDRESS.withName("vkGetPhysicalDeviceMemoryProperties2KHR"),
            UNBOUNDED_ADDRESS.withName("vkGetDeviceBufferMemoryRequirements"),
            UNBOUNDED_ADDRESS.withName("vkGetDeviceImageMemoryRequirements"),
            UNBOUNDED_ADDRESS.withName("vkGetMemoryWin32HandleKHR")
        ).withName("VmaVulkanFunctions").withByteAlignment(8);
        
        VK_GET_INSTANCE_PROC_ADDR_HANDLE = LAYOUT.varHandle(PathElement.groupElement("vkGetInstanceProcAddr"));
        VK_GET_DEVICE_PROC_ADDR_HANDLE = LAYOUT.varHandle(PathElement.groupElement("vkGetDeviceProcAddr"));
        VK_GET_PHYSICAL_DEVICE_PROPERTIES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("vkGetPhysicalDeviceProperties"));
        VK_GET_PHYSICAL_DEVICE_MEMORY_PROPERTIES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("vkGetPhysicalDeviceMemoryProperties"));
        VK_ALLOCATE_MEMORY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("vkAllocateMemory"));
        VK_FREE_MEMORY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("vkFreeMemory"));
        VK_MAP_MEMORY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("vkMapMemory"));
        VK_UNMAP_MEMORY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("vkUnmapMemory"));
        VK_FLUSH_MAPPED_MEMORY_RANGES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("vkFlushMappedMemoryRanges"));
        VK_INVALIDATE_MAPPED_MEMORY_RANGES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("vkInvalidateMappedMemoryRanges"));
        VK_BIND_BUFFER_MEMORY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("vkBindBufferMemory"));
        VK_BIND_IMAGE_MEMORY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("vkBindImageMemory"));
        VK_GET_BUFFER_MEMORY_REQUIREMENTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("vkGetBufferMemoryRequirements"));
        VK_GET_IMAGE_MEMORY_REQUIREMENTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("vkGetImageMemoryRequirements"));
        VK_CREATE_BUFFER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("vkCreateBuffer"));
        VK_DESTROY_BUFFER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("vkDestroyBuffer"));
        VK_CREATE_IMAGE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("vkCreateImage"));
        VK_DESTROY_IMAGE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("vkDestroyImage"));
        VK_CMD_COPY_BUFFER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("vkCmdCopyBuffer"));
        VK_GET_BUFFER_MEMORY_REQUIREMENTS2_KHR_HANDLE = LAYOUT.varHandle(PathElement.groupElement("vkGetBufferMemoryRequirements2KHR"));
        VK_GET_IMAGE_MEMORY_REQUIREMENTS2_KHR_HANDLE = LAYOUT.varHandle(PathElement.groupElement("vkGetImageMemoryRequirements2KHR"));
        VK_BIND_BUFFER_MEMORY2_KHR_HANDLE = LAYOUT.varHandle(PathElement.groupElement("vkBindBufferMemory2KHR"));
        VK_BIND_IMAGE_MEMORY2_KHR_HANDLE = LAYOUT.varHandle(PathElement.groupElement("vkBindImageMemory2KHR"));
        VK_GET_PHYSICAL_DEVICE_MEMORY_PROPERTIES2_KHR_HANDLE = LAYOUT.varHandle(PathElement.groupElement("vkGetPhysicalDeviceMemoryProperties2KHR"));
        VK_GET_DEVICE_BUFFER_MEMORY_REQUIREMENTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("vkGetDeviceBufferMemoryRequirements"));
        VK_GET_DEVICE_IMAGE_MEMORY_REQUIREMENTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("vkGetDeviceImageMemoryRequirements"));
        VK_GET_MEMORY_WIN32_HANDLE_KHR_HANDLE = LAYOUT.varHandle(PathElement.groupElement("vkGetMemoryWin32HandleKHR"));
        
        VK_GET_INSTANCE_PROC_ADDR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vkGetInstanceProcAddr"));
        VK_GET_DEVICE_PROC_ADDR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vkGetDeviceProcAddr"));
        VK_GET_PHYSICAL_DEVICE_PROPERTIES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vkGetPhysicalDeviceProperties"));
        VK_GET_PHYSICAL_DEVICE_MEMORY_PROPERTIES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vkGetPhysicalDeviceMemoryProperties"));
        VK_ALLOCATE_MEMORY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vkAllocateMemory"));
        VK_FREE_MEMORY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vkFreeMemory"));
        VK_MAP_MEMORY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vkMapMemory"));
        VK_UNMAP_MEMORY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vkUnmapMemory"));
        VK_FLUSH_MAPPED_MEMORY_RANGES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vkFlushMappedMemoryRanges"));
        VK_INVALIDATE_MAPPED_MEMORY_RANGES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vkInvalidateMappedMemoryRanges"));
        VK_BIND_BUFFER_MEMORY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vkBindBufferMemory"));
        VK_BIND_IMAGE_MEMORY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vkBindImageMemory"));
        VK_GET_BUFFER_MEMORY_REQUIREMENTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vkGetBufferMemoryRequirements"));
        VK_GET_IMAGE_MEMORY_REQUIREMENTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vkGetImageMemoryRequirements"));
        VK_CREATE_BUFFER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vkCreateBuffer"));
        VK_DESTROY_BUFFER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vkDestroyBuffer"));
        VK_CREATE_IMAGE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vkCreateImage"));
        VK_DESTROY_IMAGE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vkDestroyImage"));
        VK_CMD_COPY_BUFFER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vkCmdCopyBuffer"));
        VK_GET_BUFFER_MEMORY_REQUIREMENTS2_KHR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vkGetBufferMemoryRequirements2KHR"));
        VK_GET_IMAGE_MEMORY_REQUIREMENTS2_KHR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vkGetImageMemoryRequirements2KHR"));
        VK_BIND_BUFFER_MEMORY2_KHR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vkBindBufferMemory2KHR"));
        VK_BIND_IMAGE_MEMORY2_KHR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vkBindImageMemory2KHR"));
        VK_GET_PHYSICAL_DEVICE_MEMORY_PROPERTIES2_KHR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vkGetPhysicalDeviceMemoryProperties2KHR"));
        VK_GET_DEVICE_BUFFER_MEMORY_REQUIREMENTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vkGetDeviceBufferMemoryRequirements"));
        VK_GET_DEVICE_IMAGE_MEMORY_REQUIREMENTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vkGetDeviceImageMemoryRequirements"));
        VK_GET_MEMORY_WIN32_HANDLE_KHR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vkGetMemoryWin32HandleKHR"));
        //@formatter:on
    }

    public VmaVulkanFunctions() {
        this(Arena.ofAuto());
    }
    
    public VmaVulkanFunctions(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VmaVulkanFunctions(MemorySegment segment) {
        this.segment = segment; 
    }

    /**
     * Populates this struct with the addresses of
     * <ul>
     * <li> vkGetInstanceProcAddr
     * <li> vkGetDeviceProcAddr
     * </ul>
     * 
     * The rest is fetched automatically by vma using these functions.
     */
    public VmaVulkanFunctions populate(VkInstance vkInstance) {
    	SymbolLookup symbolLookup = SymbolLookup.loaderLookup();
    	
    	vkGetInstanceProcAddr(symbolLookup.findOrThrow("glfwGetInstanceProcAddress"));
    	
		try (Arena arena = Arena.ofConfined()) {
			MemorySegment address = GLFWVulkan.glfwGetInstanceProcAddress(
					vkInstance.memorySegment(),
					arena.allocateFrom("vkGetDeviceProcAddr")
			);
			
			vkGetDeviceProcAddr(address);
		}
    	return this;
    }
    
    public VmaVulkanFunctions vkGetInstanceProcAddr(MemorySegment vkGetInstanceProcAddr) {
        VK_GET_INSTANCE_PROC_ADDR_HANDLE.set(segment, 0L, vkGetInstanceProcAddr);
        return this;
    }
    
    public VmaVulkanFunctions vkGetDeviceProcAddr(MemorySegment vkGetDeviceProcAddr) {
        VK_GET_DEVICE_PROC_ADDR_HANDLE.set(segment, 0L, vkGetDeviceProcAddr);
        return this;
    }
    
    public VmaVulkanFunctions vkGetPhysicalDeviceProperties(MemorySegment vkGetPhysicalDeviceProperties) {
        VK_GET_PHYSICAL_DEVICE_PROPERTIES_HANDLE.set(segment, 0L, vkGetPhysicalDeviceProperties);
        return this;
    }
    
    public VmaVulkanFunctions vkGetPhysicalDeviceMemoryProperties(MemorySegment vkGetPhysicalDeviceMemoryProperties) {
        VK_GET_PHYSICAL_DEVICE_MEMORY_PROPERTIES_HANDLE.set(segment, 0L, vkGetPhysicalDeviceMemoryProperties);
        return this;
    }
    
    public VmaVulkanFunctions vkAllocateMemory(MemorySegment vkAllocateMemory) {
        VK_ALLOCATE_MEMORY_HANDLE.set(segment, 0L, vkAllocateMemory);
        return this;
    }
    
    public VmaVulkanFunctions vkFreeMemory(MemorySegment vkFreeMemory) {
        VK_FREE_MEMORY_HANDLE.set(segment, 0L, vkFreeMemory);
        return this;
    }
    
    public VmaVulkanFunctions vkMapMemory(MemorySegment vkMapMemory) {
        VK_MAP_MEMORY_HANDLE.set(segment, 0L, vkMapMemory);
        return this;
    }
    
    public VmaVulkanFunctions vkUnmapMemory(MemorySegment vkUnmapMemory) {
        VK_UNMAP_MEMORY_HANDLE.set(segment, 0L, vkUnmapMemory);
        return this;
    }
    
    public VmaVulkanFunctions vkFlushMappedMemoryRanges(MemorySegment vkFlushMappedMemoryRanges) {
        VK_FLUSH_MAPPED_MEMORY_RANGES_HANDLE.set(segment, 0L, vkFlushMappedMemoryRanges);
        return this;
    }
    
    public VmaVulkanFunctions vkInvalidateMappedMemoryRanges(MemorySegment vkInvalidateMappedMemoryRanges) {
        VK_INVALIDATE_MAPPED_MEMORY_RANGES_HANDLE.set(segment, 0L, vkInvalidateMappedMemoryRanges);
        return this;
    }
    
    public VmaVulkanFunctions vkBindBufferMemory(MemorySegment vkBindBufferMemory) {
        VK_BIND_BUFFER_MEMORY_HANDLE.set(segment, 0L, vkBindBufferMemory);
        return this;
    }
    
    public VmaVulkanFunctions vkBindImageMemory(MemorySegment vkBindImageMemory) {
        VK_BIND_IMAGE_MEMORY_HANDLE.set(segment, 0L, vkBindImageMemory);
        return this;
    }
    
    public VmaVulkanFunctions vkGetBufferMemoryRequirements(MemorySegment vkGetBufferMemoryRequirements) {
        VK_GET_BUFFER_MEMORY_REQUIREMENTS_HANDLE.set(segment, 0L, vkGetBufferMemoryRequirements);
        return this;
    }
    
    public VmaVulkanFunctions vkGetImageMemoryRequirements(MemorySegment vkGetImageMemoryRequirements) {
        VK_GET_IMAGE_MEMORY_REQUIREMENTS_HANDLE.set(segment, 0L, vkGetImageMemoryRequirements);
        return this;
    }
    
    public VmaVulkanFunctions vkCreateBuffer(MemorySegment vkCreateBuffer) {
        VK_CREATE_BUFFER_HANDLE.set(segment, 0L, vkCreateBuffer);
        return this;
    }
    
    public VmaVulkanFunctions vkDestroyBuffer(MemorySegment vkDestroyBuffer) {
        VK_DESTROY_BUFFER_HANDLE.set(segment, 0L, vkDestroyBuffer);
        return this;
    }
    
    public VmaVulkanFunctions vkCreateImage(MemorySegment vkCreateImage) {
        VK_CREATE_IMAGE_HANDLE.set(segment, 0L, vkCreateImage);
        return this;
    }
    
    public VmaVulkanFunctions vkDestroyImage(MemorySegment vkDestroyImage) {
        VK_DESTROY_IMAGE_HANDLE.set(segment, 0L, vkDestroyImage);
        return this;
    }
    
    public VmaVulkanFunctions vkCmdCopyBuffer(MemorySegment vkCmdCopyBuffer) {
        VK_CMD_COPY_BUFFER_HANDLE.set(segment, 0L, vkCmdCopyBuffer);
        return this;
    }
    
    public VmaVulkanFunctions vkGetBufferMemoryRequirements2KHR(MemorySegment vkGetBufferMemoryRequirements2KHR) {
        VK_GET_BUFFER_MEMORY_REQUIREMENTS2_KHR_HANDLE.set(segment, 0L, vkGetBufferMemoryRequirements2KHR);
        return this;
    }
    
    public VmaVulkanFunctions vkGetImageMemoryRequirements2KHR(MemorySegment vkGetImageMemoryRequirements2KHR) {
        VK_GET_IMAGE_MEMORY_REQUIREMENTS2_KHR_HANDLE.set(segment, 0L, vkGetImageMemoryRequirements2KHR);
        return this;
    }
    
    public VmaVulkanFunctions vkBindBufferMemory2KHR(MemorySegment vkBindBufferMemory2KHR) {
        VK_BIND_BUFFER_MEMORY2_KHR_HANDLE.set(segment, 0L, vkBindBufferMemory2KHR);
        return this;
    }
    
    public VmaVulkanFunctions vkBindImageMemory2KHR(MemorySegment vkBindImageMemory2KHR) {
        VK_BIND_IMAGE_MEMORY2_KHR_HANDLE.set(segment, 0L, vkBindImageMemory2KHR);
        return this;
    }
    
    public VmaVulkanFunctions vkGetPhysicalDeviceMemoryProperties2KHR(MemorySegment vkGetPhysicalDeviceMemoryProperties2KHR) {
        VK_GET_PHYSICAL_DEVICE_MEMORY_PROPERTIES2_KHR_HANDLE.set(segment, 0L, vkGetPhysicalDeviceMemoryProperties2KHR);
        return this;
    }
    
    public VmaVulkanFunctions vkGetDeviceBufferMemoryRequirements(MemorySegment vkGetDeviceBufferMemoryRequirements) {
        VK_GET_DEVICE_BUFFER_MEMORY_REQUIREMENTS_HANDLE.set(segment, 0L, vkGetDeviceBufferMemoryRequirements);
        return this;
    }
    
    public VmaVulkanFunctions vkGetDeviceImageMemoryRequirements(MemorySegment vkGetDeviceImageMemoryRequirements) {
        VK_GET_DEVICE_IMAGE_MEMORY_REQUIREMENTS_HANDLE.set(segment, 0L, vkGetDeviceImageMemoryRequirements);
        return this;
    }
    
    public VmaVulkanFunctions vkGetMemoryWin32HandleKHR(MemorySegment vkGetMemoryWin32HandleKHR) {
        VK_GET_MEMORY_WIN32_HANDLE_KHR_HANDLE.set(segment, 0L, vkGetMemoryWin32HandleKHR);
        return this;
    }
    
    @Override
    public VmaVulkanFunctions set(VmaVulkanFunctions other) {
        return set(other.segment);
    }
    
    @Override
    public VmaVulkanFunctions set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VmaVulkanFunctions> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VmaVulkanFunctions> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VmaVulkanFunctions(segment),
            count
        );
    }
    
    public static NativeStructArray<VmaVulkanFunctions> array(Arena arena, VmaVulkanFunctions... structs) {
        NativeStructArray<VmaVulkanFunctions> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VmaVulkanFunctions(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VmaVulkanFunctions> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VmaVulkanFunctions(segment)
        );
    }
    
}