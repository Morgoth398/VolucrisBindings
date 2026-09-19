# Vulkan

The example only provides the most basic Vulkan and GLFW setup to get a working window.

For everything else you can find a lot of resources online. For example:
- [Vulkanbook](https://github.com/lwjglgamedev/vulkanbook) using Java and LWJGL
- [Khronos Vulkan Tutorial](https://docs.vulkan.org/tutorial/latest/00_Introduction.html) using C++
- [OGLDEV Vulkan Tutorial](https://www.youtube.com/watch?v=EsEP9iJKBhU&list=PLA0dXqQjCx0RntJy1pqje9uHRF1Z5vZgA) using C++

```Java
public static void main(String[] args) {

		GLFWLoader.loadNativeLibrary();

		try (Arena arena = MemoryStack.stackPush()) {

			GLFW.glfwSetErrorCallback(new GLFWErrorCallback(arena) {
				@Override
				public void invoke(int error_code, String description) {
					String error = switch (error_code) {
						case GLFW.GLFW_NOT_INITIALIZED -> "GLFW_NOT_INITIALIZED";
						case GLFW.GLFW_NO_CURRENT_CONTEXT -> "GLFW_NO_CURRENT_CONTEXT";
						case GLFW.GLFW_INVALID_ENUM -> "GLFW_INVALID_ENUM";
						case GLFW.GLFW_INVALID_VALUE -> "GLFW_INVALID_VALUE";
						case GLFW.GLFW_OUT_OF_MEMORY -> "GLFW_OUT_OF_MEMORY";
						case GLFW.GLFW_API_UNAVAILABLE -> "GLFW_API_UNAVAILABLE";
						case GLFW.GLFW_VERSION_UNAVAILABLE -> "GLFW_VERSION_UNAVAILABLE";
						case GLFW.GLFW_PLATFORM_ERROR -> "GLFW_PLATFORM_ERROR";
						case GLFW.GLFW_FORMAT_UNAVAILABLE -> "GLFW_FORMAT_UNAVAILABLE";
						case GLFW.GLFW_NO_WINDOW_CONTEXT -> "GLFW_NO_WINDOW_CONTEXT";
						default -> "";
					};
					System.err.println(error + ": " + description);
				}
			});

			if (GLFW.glfwInit() == GLFW.GLFW_FALSE)
				throw new RuntimeException("Failed to initialize GLFW.");

			if (GLFW.glfwVulkanSupported() == GLFW.GLFW_FALSE)
				throw new RuntimeException("Vulkan not supported.");
			
			GLFW.glfwDefaultWindowHints();
			GLFW.glfwWindowHint(GLFW.GLFW_CLIENT_API, GLFW.GLFW_NO_API);
			/// Mandatory when using GLFW with Vulkan

			final GLFWwindow window = GLFW.glfwCreateWindow(1280, 720, "Vulkan Test", null, null);

			if (window == null)
				throw new RuntimeException("Failed to create window");

			GLFW.glfwSetKeyCallback(window, new GLFWKeyCallback(arena) {
				@Override
				public void invoke(GLFWwindow window, int key, int scancode, int action, int mods) {
					if (key == GLFW.GLFW_KEY_ESCAPE && action == GLFW.GLFW_RELEASE)
						GLFW.glfwSetWindowShouldClose(window, GLFW.GLFW_TRUE);
				}
			});

			VkInstance vkInstance = createVulkanInstance();
			VkSurfaceKHR vkSurface = createVulkanSurface(vkInstance, window);

			GLFW.glfwShowWindow(window);

			while (GLFW.glfwWindowShouldClose(window) != GLFW.GLFW_TRUE) {

				GLFW.glfwPollEvents();
			}

			VK.vkDestroySurfaceKHR(vkInstance, vkSurface, null);
			VK.vkDestroyInstance(vkInstance, MemorySegment.NULL);

			GLFW.glfwTerminate();
		}
	}

	private static VkInstance createVulkanInstance() {
		try (Arena arena = MemoryStack.stackPush()) {
			NativeIntArray instanceVersion = new NativeIntArray(arena, 1);
			int errorCode = VK.vkEnumerateInstanceVersion(instanceVersion);

			if (errorCode != VkResult.VK_SUCCESS)
				throw new RuntimeException("Failed to enumerate instance version.");

			NativeIntArray extensionsCount = new NativeIntArray(arena, 1);

			NativePointerArray extensionNames = GLFWVulkan.glfwGetRequiredInstanceExtensions(extensionsCount);

			VkInstanceCreateInfo createInfo = new VkInstanceCreateInfo(arena)
					.sType(VkStructureType.VK_STRUCTURE_TYPE_INSTANCE_CREATE_INFO)
					.pApplicationInfo(
							new VkApplicationInfo(arena)
									.sType(VkStructureType.VK_STRUCTURE_TYPE_APPLICATION_INFO)
									.applicationVersion(1)
									.pApplicationName(arena, "VulkanTest")
									.pEngineName(arena, "SomeEngineName")
									.apiVersion(instanceVersion.get(0))
					)
					.ppEnabledExtensionNames(extensionNames)
					.enabledExtensionCount(extensionsCount.get(0));

			NativePointerArray pointerArray = new NativePointerArray(arena, 1);
			errorCode = VK.vkCreateInstance(createInfo, null, pointerArray);

			if (errorCode != VkResult.VK_SUCCESS)
				throw new RuntimeException("Vulkan Instance Creation Failed.");

			return new VkInstance(pointerArray.get(0));
		}
	}

	private static VkSurfaceKHR createVulkanSurface(VkInstance vkInstance, GLFWwindow window) {
		try (Arena arena = MemoryStack.stackPush()) {
			NativePointerArray vkSurfacePointer = new NativePointerArray(arena, 1);

			int errorCode = GLFWVulkan.glfwCreateWindowSurface(vkInstance, window, null, vkSurfacePointer);
			
			if (errorCode != VkResult.VK_SUCCESS)
				throw new RuntimeException("Vulkan surface creation failed.");

			return new VkSurfaceKHR(vkSurfacePointer.get(0));
		}
	}
```