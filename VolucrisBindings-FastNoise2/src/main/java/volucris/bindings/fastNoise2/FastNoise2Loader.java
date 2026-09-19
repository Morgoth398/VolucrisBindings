package volucris.bindings.fastNoise2;

import volucris.bindings.core.NativeLibraryLoader;

public final class FastNoise2Loader {

	private FastNoise2Loader() {

	}

	public static void loadNativeLibrary() {
		NativeLibraryLoader.loadLibrary("natives/fastNoise2", "fastNoise2");
	}
}