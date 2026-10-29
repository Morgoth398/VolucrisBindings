package volucris.bindings.meshoptimizer;

import volucris.bindings.core.NativeLibraryLoader;

public class MeshoptimizerLoader {

	private MeshoptimizerLoader() {

	}

	public static void loadNativeLibrary() {
		NativeLibraryLoader.loadLibrary("natives/meshoptimizer", "meshoptimizer");
	}
	
}
