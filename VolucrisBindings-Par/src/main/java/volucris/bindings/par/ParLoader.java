package volucris.bindings.par;

import volucris.bindings.core.NativeLibraryLoader;

public final class ParLoader {

	private ParLoader() {
		
	}
	
	public static void loadNativeLibrary() {
		NativeLibraryLoader.loadLibrary("natives/par", "par");
	}
	
}
