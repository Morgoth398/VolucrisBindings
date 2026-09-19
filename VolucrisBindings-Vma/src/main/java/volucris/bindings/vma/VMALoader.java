package volucris.bindings.vma;

import volucris.bindings.core.NativeLibraryLoader;

public final class VMALoader {

	private VMALoader() {
		
	}
	
	public static void loadNativeLibrary() {
		NativeLibraryLoader.loadLibrary("natives/vma", "vma");
	}
	
}
