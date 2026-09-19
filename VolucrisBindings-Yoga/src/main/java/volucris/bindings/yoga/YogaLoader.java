package volucris.bindings.yoga;

import volucris.bindings.core.NativeLibraryLoader;

public final class YogaLoader {

	private YogaLoader() {
		
	}
	
	public static void loadNativeLibrary() {
		NativeLibraryLoader.loadLibrary("natives/yoga", "yoga");
	}
	
}
