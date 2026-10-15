/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan;

import java.lang.foreign.Arena;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.Linker;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.MemoryStack;
import volucris.bindings.core.NativeIntArray;
import volucris.bindings.core.NativePointerArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.vulkan.glfw.GLFWVulkan;
import volucris.bindings.vulkan.structs.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public class VulkanBase {

	private static final LazyConstant<MethodHandle> VK_CREATE_INSTANCE;
	private static final LazyConstant<MethodHandle> VK_ENUMERATE_INSTANCE_EXTENSION_PROPERTIES;
	private static final LazyConstant<MethodHandle> VK_ENUMERATE_INSTANCE_LAYER_PROPERTIES;
	private static final LazyConstant<MethodHandle> VK_ENUMERATE_INSTANCE_VERSION;

    static {
        //@formatter:off
        VK_CREATE_INSTANCE = downcallHandle("vkCreateInstance", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_ENUMERATE_INSTANCE_EXTENSION_PROPERTIES = downcallHandle("vkEnumerateInstanceExtensionProperties", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_ENUMERATE_INSTANCE_LAYER_PROPERTIES = downcallHandle("vkEnumerateInstanceLayerProperties", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_ENUMERATE_INSTANCE_VERSION = downcallHandle("vkEnumerateInstanceVersion", JAVA_INT, UNBOUNDED_ADDRESS);
        //@formatter:on
    }

    protected VulkanBase() {

    }

    public static int vkCreateInstance(
    	MemorySegment pCreateInfo,
    	MemorySegment pAllocator,
    	MemorySegment pInstance
    ) {
    	MethodHandle method = VK_CREATE_INSTANCE.get();
    	try {
    		return (int) method.invokeExact(
    			pCreateInfo,
    			pAllocator,
    			pInstance
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#vkCreateInstance].
    public static int vkCreateInstance(
    	VkInstanceCreateInfo pCreateInfo,
    	@Nullable VkAllocationCallbacks pAllocator,
    	NativePointerArray pInstance
    ) {
    	return vkCreateInstance(
    		pCreateInfo.memorySegment(),
    		pAllocator == null ? MemorySegment.NULL : pAllocator.memorySegment(),
    		pInstance.memorySegment()
    	);
    }
    
    public static int vkEnumerateInstanceExtensionProperties(
    	MemorySegment pLayerName,
    	MemorySegment pPropertyCount,
    	MemorySegment pProperties
    ) {
    	MethodHandle method = VK_ENUMERATE_INSTANCE_EXTENSION_PROPERTIES.get();
    	try {
    		return (int) method.invokeExact(
    			pLayerName,
    			pPropertyCount,
    			pProperties
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#vkEnumerateInstanceExtensionProperties].
    public static int vkEnumerateInstanceExtensionProperties(
    	@Nullable String pLayerName,
    	NativeIntArray pPropertyCount,
    	@Nullable NativeStructArray<VkExtensionProperties> pProperties
    ) {
    	try (Arena arena = MemoryStack.stackPush()) {
    		return vkEnumerateInstanceExtensionProperties(
    			pLayerName == null ? MemorySegment.NULL : arena.allocateFrom(pLayerName),
    			pPropertyCount.memorySegment(),
    			pProperties == null ? MemorySegment.NULL : pProperties.memorySegment()
    		);
    	}
    }
    
    public static int vkEnumerateInstanceLayerProperties(
    	MemorySegment pPropertyCount,
    	MemorySegment pProperties
    ) {
    	MethodHandle method = VK_ENUMERATE_INSTANCE_LAYER_PROPERTIES.get();
    	try {
    		return (int) method.invokeExact(
    			pPropertyCount,
    			pProperties
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#vkEnumerateInstanceLayerProperties].
    public static int vkEnumerateInstanceLayerProperties(
    	NativeIntArray pPropertyCount,
    	@Nullable NativeStructArray<VkLayerProperties> pProperties
    ) {
    	return vkEnumerateInstanceLayerProperties(
    		pPropertyCount.memorySegment(),
    		pProperties == null ? MemorySegment.NULL : pProperties.memorySegment()
    	);
    }
    
    public static int vkEnumerateInstanceVersion(
    	MemorySegment pApiVersion
    ) {
    	MethodHandle method = VK_ENUMERATE_INSTANCE_VERSION.get();
    	try {
    		return (int) method.invokeExact(
    			pApiVersion
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#vkEnumerateInstanceVersion].
    public static int vkEnumerateInstanceVersion(
    	NativeIntArray pApiVersion
    ) {
    	return vkEnumerateInstanceVersion(
    		pApiVersion.memorySegment()
    	);
    }
    
    private static LazyConstant<MethodHandle> downcallHandle(
		String name,
		MemoryLayout resLayout,
		MemoryLayout... argLayouts
	) {
	    return LazyConstant.of(() -> {
			try (Arena arena = Arena.ofConfined()) {
				MemorySegment address = GLFWVulkan.glfwGetInstanceProcAddress(
						MemorySegment.NULL,
						arena.allocateFrom(name)
				);

				Linker linker = Linker.nativeLinker();
				return linker.downcallHandle(address, FunctionDescriptor.of(resLayout, argLayouts));
			}
		});
	}
}