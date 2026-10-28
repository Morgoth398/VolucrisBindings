package volucris.bindings.rpmalloc;

import volucris.bindings.core.NativeLibraryLoader;

public class RpmallocLoader {

	private RpmallocLoader() {

	}

	public static void loadNativeLibrary() {
		NativeLibraryLoader.loadLibrary("natives/rpmalloc", "rpmalloc");
	}
	
}
