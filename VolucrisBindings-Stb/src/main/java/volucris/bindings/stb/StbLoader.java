package volucris.bindings.stb;

import volucris.bindings.core.NativeLibraryLoader;

public final class StbLoader {

	private StbLoader() {
		
	}
	
	public static void loadStbImageNativeLibrary() {
		NativeLibraryLoader.loadLibrary("natives/stbImage", "stbImage");
	}
	
	public static void loadStbImageWriteNativeLibrary() {
		NativeLibraryLoader.loadLibrary("natives/stbImageWrite", "stbImageWrite");
	}
	
}
