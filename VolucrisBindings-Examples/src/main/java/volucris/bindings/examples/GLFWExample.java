package volucris.bindings.examples;

import java.lang.foreign.Arena;

import volucris.bindings.glfw.GLFW;
import volucris.bindings.glfw.GLFWErrorCallback;
import volucris.bindings.glfw.GLFWKeyCallback;
import volucris.bindings.glfw.GLFWLoader;
import volucris.bindings.glfw.GLFWwindow;

public class GLFWExample implements Runnable {

	public GLFWExample() {
		
	}
	
	@Override
	public void run() {
		
		GLFWLoader.loadNativeLibrary();

		try (Arena arena = Arena.ofConfined()) {

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

			GLFW.glfwDefaultWindowHints();
			GLFW.glfwWindowHint(GLFW.GLFW_CLIENT_API, GLFW.GLFW_NO_API);

			final GLFWwindow window = GLFW.glfwCreateWindow(1280, 720, "GL Test", null, null);

			if (window == null) {
				throw new RuntimeException("Failed to create window");
			}

			GLFW.glfwSetKeyCallback(window, new GLFWKeyCallback(arena) {
				@Override
				public void invoke(GLFWwindow window, int key, int scancode, int action, int mods) {
					if (key == GLFW.GLFW_KEY_ESCAPE && action == GLFW.GLFW_RELEASE)
						GLFW.glfwSetWindowShouldClose(window, GLFW.GLFW_TRUE);
				}
			});

			GLFW.glfwSwapInterval(1);
			GLFW.glfwShowWindow(window);
			
			while (GLFW.glfwWindowShouldClose(window) != GLFW.GLFW_TRUE) {
				
				if (GLFW.glfwGetTime() > 2)
					GLFW.glfwSetWindowShouldClose(window, GLFW.GLFW_TRUE);
				
				GLFW.glfwPollEvents();
			}

			GLFW.glfwTerminate();
		}
		
	}

}
