package volucris.bindings.msdfgen;

import volucris.bindings.core.NativeLibraryLoader;

public final class MsdfLoader {

	private MsdfLoader() {
		
	}
	
	public static void loadNativeLibrary() {
		NativeLibraryLoader.loadLibrary("natives/msdfgen", "msdfgen");
	}
	
}
