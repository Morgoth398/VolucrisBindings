package volucris.bindings.glfw;

import volucris.bindings.core.NativeLibraryLoader;

public final class GLFWLoader {

	private GLFWLoader() {
		
	}
	
	public static void loadNativeLibrary() {
		NativeLibraryLoader.loadLibrary("natives/glfw", "glfw");
	}
	
}
