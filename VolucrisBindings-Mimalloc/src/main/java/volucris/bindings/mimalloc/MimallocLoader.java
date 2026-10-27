package volucris.bindings.mimalloc;

import volucris.bindings.core.NativeLibraryLoader;

public class MimallocLoader {

	private static final String OS = System.getProperty("os.name").toLowerCase();
	private static final boolean IS_WINDOWS = OS.contains("windows");
	
	private MimallocLoader() {
		
	}
	
	public static void loadNativeLibrary() {
		if (IS_WINDOWS) {
			NativeLibraryLoader.loadLibrary("natives", "mimalloc-redirect");
		}
		
		NativeLibraryLoader.loadLibrary("natives/release", "mimalloc");
	}
	
	public static void loadDebugNativeLibrary() {
		if (IS_WINDOWS) {
			NativeLibraryLoader.loadLibrary("natives", "mimalloc-redirect");
		}
		
		NativeLibraryLoader.loadLibrary("natives/debug", "mimalloc-debug");
	}
	
	public static void loadSecureNativeLibrary() {
		if (IS_WINDOWS) {
			NativeLibraryLoader.loadLibrary("natives", "mimalloc-redirect");
		}
		
		NativeLibraryLoader.loadLibrary("natives/secure", "mimalloc-secure");
	}
	
}
