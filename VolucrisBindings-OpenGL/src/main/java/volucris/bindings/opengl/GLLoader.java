package volucris.bindings.opengl;

import volucris.bindings.core.NativeLibraryLoader;

public final class GLLoader {

	private GLLoader() {
		
	}
	
	public static void loadNativeLibrary() {
		NativeLibraryLoader.loadLibrary("natives/glad", "glad");
	}
	
}
