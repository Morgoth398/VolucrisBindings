package volucris.bindings.miniaudio;

import volucris.bindings.core.NativeLibraryLoader;

public class MiniaudioLoader {

	private MiniaudioLoader() {

	}

	public static void loadNativeLibrary() {
		NativeLibraryLoader.loadLibrary("natives/miniaudio", "miniaudio");
	}
	
}
