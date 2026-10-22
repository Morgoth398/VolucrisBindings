/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.glfw;

import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeIntArray;
import volucris.bindings.core.NativePointerArray;
import volucris.bindings.glfw.GLFWwindow;
import volucris.bindings.vulkan.VkInstance;
import volucris.bindings.vulkan.VkPhysicalDevice;
import volucris.bindings.vulkan.structs.VkAllocationCallbacks;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class GLFWVulkan {

	private static final LazyConstant<MethodHandle> GLFW_INIT_VULKAN_LOADER;
	private static final LazyConstant<MethodHandle> GLFW_GET_REQUIRED_INSTANCE_EXTENSIONS;
	private static final LazyConstant<MethodHandle> GLFW_GET_INSTANCE_PROC_ADDRESS;
	private static final LazyConstant<MethodHandle> GLFW_GET_PHYSICAL_DEVICE_PRESENTATION_SUPPORT;
	private static final LazyConstant<MethodHandle> GLFW_CREATE_WINDOW_SURFACE;

	static {
		//@formatter:off
		GLFW_INIT_VULKAN_LOADER = downcallHandleVoid("glfwInitVulkanLoader", UNBOUNDED_ADDRESS);
		GLFW_GET_REQUIRED_INSTANCE_EXTENSIONS = downcallHandle("glfwGetRequiredInstanceExtensions", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		GLFW_GET_INSTANCE_PROC_ADDRESS = downcallHandle("glfwGetInstanceProcAddress", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		GLFW_GET_PHYSICAL_DEVICE_PRESENTATION_SUPPORT = downcallHandle("glfwGetPhysicalDevicePresentationSupport", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
		GLFW_CREATE_WINDOW_SURFACE = downcallHandle("glfwCreateWindowSurface", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	private GLFWVulkan() {
	}

    /// ```
    /// @brief Sets the desired Vulkan `vkGetInstanceProcAddr` function.
    /// 
    /// This function sets the `vkGetInstanceProcAddr` function that GLFW will use for all
    /// Vulkan related entry point queries.
    /// 
    /// This feature is mostly useful on macOS, if your copy of the Vulkan loader is in
    /// a location where GLFW cannot find it through dynamic loading, or if you are still
    /// using the static library version of the loader.
    /// 
    /// If set to `NULL`, GLFW will try to load the Vulkan loader dynamically by its standard
    /// name and get this function from there.  This is the default behavior.
    /// 
    /// The standard name of the loader is `vulkan-1.dll` on Windows, `libvulkan.so.1` on
    /// Linux and other Unix-like systems and `libvulkan.1.dylib` on macOS.  If your code is
    /// also loading it via these names then you probably don't need to use this function.
    /// 
    /// The function address you set is never reset by GLFW, but it only takes effect during
    /// initialization.  Once GLFW has been initialized, any updates will be ignored until the
    /// library is terminated and initialized again.
    /// 
    /// @param[in] loader The address of the function to use, or `NULL`.
    /// 
    /// @par Loader function signature
    /// @code
    /// PFN_vkVoidFunction vkGetInstanceProcAddr(VkInstance instance, const char* name)
    /// @endcode
    /// For more information about this function, see the
    /// [Vulkan Registry](https://www.khronos.org/registry/vulkan/).
    /// 
    /// @errors None.
    /// 
    /// @remark This function may be called before @ref glfwInit.
    /// 
    /// @thread_safety This function must only be called from the main thread.
    /// 
    /// @sa @ref vulkan_loader
    /// @sa @ref glfwInit
    /// 
    /// @since Added in version 3.4.
    /// 
    /// @ingroup init
    /// ```
    public static void glfwInitVulkanLoader(
    	MemorySegment loader
    ) {
    	MethodHandle method = GLFW_INIT_VULKAN_LOADER.get();
    	try {
    		 method.invokeExact(
    			loader
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// @brief Returns the Vulkan instance extensions required by GLFW.
    /// 
    /// This function returns an array of names of Vulkan instance extensions required
    /// by GLFW for creating Vulkan surfaces for GLFW windows.  If successful, the
    /// list will always contain `VK_KHR_surface`, so if you don't require any
    /// additional extensions you can pass this list directly to the
    /// `VkInstanceCreateInfo` struct.
    /// 
    /// If Vulkan is not available on the machine, this function returns `NULL` and
    /// generates a @ref GLFW_API_UNAVAILABLE error.  Call @ref glfwVulkanSupported
    /// to check whether Vulkan is at least minimally available.
    /// 
    /// If Vulkan is available but no set of extensions allowing window surface
    /// creation was found, this function returns `NULL`.  You may still use Vulkan
    /// for off-screen rendering and compute work.
    /// 
    /// @param[out] count Where to store the number of extensions in the returned
    /// array.  This is set to zero if an error occurred.
    /// @return An array of ASCII encoded extension names, or `NULL` if an
    /// [error](@ref error_handling) occurred.
    /// 
    /// @errors Possible errors include @ref GLFW_NOT_INITIALIZED and @ref
    /// GLFW_API_UNAVAILABLE.
    /// 
    /// @remark Additional extensions may be required by future versions of GLFW.
    /// You should check if any extensions you wish to enable are already in the
    /// returned array, as it is an error to specify an extension more than once in
    /// the `VkInstanceCreateInfo` struct.
    /// 
    /// @pointer_lifetime The returned array is allocated and freed by GLFW.  You
    /// should not free it yourself.  It is guaranteed to be valid only until the
    /// library is terminated.
    /// 
    /// @thread_safety This function may be called from any thread.
    /// 
    /// @sa @ref vulkan_ext
    /// @sa @ref glfwCreateWindowSurface
    /// 
    /// @since Added in version 3.2.
    /// 
    /// @ingroup vulkan
    /// ```
    public static MemorySegment glfwGetRequiredInstanceExtensions(
    	MemorySegment count
    ) {
    	MethodHandle method = GLFW_GET_REQUIRED_INSTANCE_EXTENSIONS.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			count
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glfwGetRequiredInstanceExtensions].
    public static @Nullable NativePointerArray glfwGetRequiredInstanceExtensions(
    	NativeIntArray count
    ) {
    	MemorySegment segment = glfwGetRequiredInstanceExtensions(
    		count.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativePointerArray(segment);
    }
    
    /// ```
    /// @brief Returns the address of the specified Vulkan instance function.
    /// 
    /// This function returns the address of the specified Vulkan core or extension
    /// function for the specified instance.  If instance is set to `NULL` it can
    /// return any function exported from the Vulkan loader, including at least the
    /// following functions:
    /// 
    /// - `vkEnumerateInstanceExtensionProperties`
    /// - `vkEnumerateInstanceLayerProperties`
    /// - `vkCreateInstance`
    /// - `vkGetInstanceProcAddr`
    /// 
    /// If Vulkan is not available on the machine, this function returns `NULL` and
    /// generates a @ref GLFW_API_UNAVAILABLE error.  Call @ref glfwVulkanSupported
    /// to check whether Vulkan is at least minimally available.
    /// 
    /// This function is equivalent to calling `vkGetInstanceProcAddr` with
    /// a platform-specific query of the Vulkan loader as a fallback.
    /// 
    /// @param[in] instance The Vulkan instance to query, or `NULL` to retrieve
    /// functions related to instance creation.
    /// @param[in] procname The ASCII encoded name of the function.
    /// @return The address of the function, or `NULL` if an
    /// [error](@ref error_handling) occurred.
    /// 
    /// @errors Possible errors include @ref GLFW_NOT_INITIALIZED and @ref
    /// GLFW_API_UNAVAILABLE.
    /// 
    /// @pointer_lifetime The returned function pointer is valid until the library
    /// is terminated.
    /// 
    /// @thread_safety This function may be called from any thread.
    /// 
    /// @sa @ref vulkan_proc
    /// 
    /// @since Added in version 3.2.
    /// 
    /// @ingroup vulkan
    /// ```
    public static MemorySegment glfwGetInstanceProcAddress(
    	MemorySegment instance,
    	MemorySegment procname
    ) {
    	MethodHandle method = GLFW_GET_INSTANCE_PROC_ADDRESS.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			instance,
    			procname
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// @brief Returns whether the specified queue family can present images.
    /// 
    /// This function returns whether the specified queue family of the specified
    /// physical device supports presentation to the platform GLFW was built for.
    /// 
    /// If Vulkan or the required window surface creation instance extensions are
    /// not available on the machine, or if the specified instance was not created
    /// with the required extensions, this function returns `GLFW_FALSE` and
    /// generates a @ref GLFW_API_UNAVAILABLE error.  Call @ref glfwVulkanSupported
    /// to check whether Vulkan is at least minimally available and @ref
    /// glfwGetRequiredInstanceExtensions to check what instance extensions are
    /// required.
    /// 
    /// @param[in] instance The instance that the physical device belongs to.
    /// @param[in] device The physical device that the queue family belongs to.
    /// @param[in] queuefamily The index of the queue family to query.
    /// @return `GLFW_TRUE` if the queue family supports presentation, or
    /// `GLFW_FALSE` otherwise.
    /// 
    /// @errors Possible errors include @ref GLFW_NOT_INITIALIZED, @ref
    /// GLFW_API_UNAVAILABLE and @ref GLFW_PLATFORM_ERROR.
    /// 
    /// @remark __macOS:__ This function currently always returns `GLFW_TRUE`, as the
    /// `VK_MVK_macos_surface` and `VK_EXT_metal_surface` extensions do not provide
    /// a `vkGetPhysicalDevice*PresentationSupport` type function.
    /// 
    /// @thread_safety This function may be called from any thread.  For
    /// synchronization details of Vulkan objects, see the Vulkan specification.
    /// 
    /// @sa @ref vulkan_present
    /// 
    /// @since Added in version 3.2.
    /// 
    /// @ingroup vulkan
    /// ```
    public static int glfwGetPhysicalDevicePresentationSupport(
    	MemorySegment instance,
    	MemorySegment device,
    	int queuefamily
    ) {
    	MethodHandle method = GLFW_GET_PHYSICAL_DEVICE_PRESENTATION_SUPPORT.get();
    	try {
    		return (int) method.invokeExact(
    			instance,
    			device,
    			queuefamily
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glfwGetPhysicalDevicePresentationSupport].
    public static int glfwGetPhysicalDevicePresentationSupport(
    	VkInstance instance,
    	VkPhysicalDevice device,
    	int queuefamily
    ) {
    	return glfwGetPhysicalDevicePresentationSupport(
    		instance.memorySegment(),
    		device.memorySegment(),
    		queuefamily
    	);
    }
    
    /// ```
    /// @brief Creates a Vulkan surface for the specified window.
    /// 
    /// This function creates a Vulkan surface for the specified window.
    /// 
    /// If the Vulkan loader or at least one minimally functional ICD were not found,
    /// this function returns `VK_ERROR_INITIALIZATION_FAILED` and generates a @ref
    /// GLFW_API_UNAVAILABLE error.  Call @ref glfwVulkanSupported to check whether
    /// Vulkan is at least minimally available.
    /// 
    /// If the required window surface creation instance extensions are not
    /// available or if the specified instance was not created with these extensions
    /// enabled, this function returns `VK_ERROR_EXTENSION_NOT_PRESENT` and
    /// generates a @ref GLFW_API_UNAVAILABLE error.  Call @ref
    /// glfwGetRequiredInstanceExtensions to check what instance extensions are
    /// required.
    /// 
    /// The window surface cannot be shared with another API so the window must
    /// have been created with the [client api hint](@ref GLFW_CLIENT_API_attrib)
    /// set to `GLFW_NO_API` otherwise it generates a @ref GLFW_INVALID_VALUE error
    /// and returns `VK_ERROR_NATIVE_WINDOW_IN_USE_KHR`.
    /// 
    /// The window surface must be destroyed before the specified Vulkan instance.
    /// It is the responsibility of the caller to destroy the window surface.  GLFW
    /// does not destroy it for you.  Call `vkDestroySurfaceKHR` to destroy the
    /// surface.
    /// 
    /// @param[in] instance The Vulkan instance to create the surface in.
    /// @param[in] window The window to create the surface for.
    /// @param[in] allocator The allocator to use, or `NULL` to use the default
    /// allocator.
    /// @param[out] surface Where to store the handle of the surface.  This is set
    /// to `VK_NULL_HANDLE` if an error occurred.
    /// @return `VK_SUCCESS` if successful, or a Vulkan error code if an
    /// [error](@ref error_handling) occurred.
    /// 
    /// @errors Possible errors include @ref GLFW_NOT_INITIALIZED, @ref
    /// GLFW_API_UNAVAILABLE, @ref GLFW_PLATFORM_ERROR and @ref GLFW_INVALID_VALUE
    /// 
    /// @remark If an error occurs before the creation call is made, GLFW returns
    /// the Vulkan error code most appropriate for the error.  Appropriate use of
    /// @ref glfwVulkanSupported and @ref glfwGetRequiredInstanceExtensions should
    /// eliminate almost all occurrences of these errors.
    /// 
    /// @remark __macOS:__ GLFW prefers the `VK_EXT_metal_surface` extension, with the
    /// `VK_MVK_macos_surface` extension as a fallback.  The name of the selected
    /// extension, if any, is included in the array returned by @ref
    /// glfwGetRequiredInstanceExtensions.
    /// 
    /// @remark __macOS:__ This function creates and sets a `CAMetalLayer` instance for
    /// the window content view, which is required for MoltenVK to function.
    /// 
    /// @remark __X11:__ By default GLFW prefers the `VK_KHR_xcb_surface` extension,
    /// with the `VK_KHR_xlib_surface` extension as a fallback.  You can make
    /// `VK_KHR_xlib_surface` the preferred extension by setting the
    /// [GLFW_X11_XCB_VULKAN_SURFACE](@ref GLFW_X11_XCB_VULKAN_SURFACE_hint) init
    /// hint.  The name of the selected extension, if any, is included in the array
    /// returned by @ref glfwGetRequiredInstanceExtensions.
    /// 
    /// @thread_safety This function may be called from any thread.  For
    /// synchronization details of Vulkan objects, see the Vulkan specification.
    /// 
    /// @sa @ref vulkan_surface
    /// @sa @ref glfwGetRequiredInstanceExtensions
    /// 
    /// @since Added in version 3.2.
    /// 
    /// @ingroup vulkan
    /// ```
    public static int glfwCreateWindowSurface(
    	MemorySegment instance,
    	MemorySegment window,
    	MemorySegment allocator,
    	MemorySegment surface
    ) {
    	MethodHandle method = GLFW_CREATE_WINDOW_SURFACE.get();
    	try {
    		return (int) method.invokeExact(
    			instance,
    			window,
    			allocator,
    			surface
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glfwCreateWindowSurface].
    public static int glfwCreateWindowSurface(
    	VkInstance instance,
    	GLFWwindow window,
    	@Nullable VkAllocationCallbacks allocator,
    	NativePointerArray surface
    ) {
    	return glfwCreateWindowSurface(
    		instance.memorySegment(),
    		window.memorySegment(),
    		allocator == null ? MemorySegment.NULL : allocator.memorySegment(),
    		surface.memorySegment()
    	);
    }

}