package volucris.bindings.assimp;

import volucris.bindings.core.NativeLibraryLoader;

public final class AssimpLoader {

	private AssimpLoader() {

	}

	public static void loadNativeLibrary() {
		NativeLibraryLoader.loadLibrary("natives/assimp", "assimp");
	}

}
