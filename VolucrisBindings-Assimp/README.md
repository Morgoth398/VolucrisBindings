# Assimp
```Java
public static void main(String[] args) {

	AssimpLoader.loadNativeLibrary();

	// Either load the model directly from the file system...
	// The path needs to be relative to the working directory.
	AiScene aiScene = Assimp.aiImportFile("some/model/path/", 0);

	// ... or load the model from memory.
	// In this case the file needs to be on the classpath.
	try (Arena arena = Arena.ofConfined(); InputStream stream = Assimp.class.getResourceAsStream("some/model/path/")) {
		byte[] file = stream.readAllBytes();

		aiScene = Assimp.aiImportFileFromMemory(
				new NativeByteArray(arena, file),
				file.length,
				0,
				""
		);
	} catch (IOException e) {
		throw new RuntimeException("Failed to load file.");
	}

	if (aiScene == null) {
		System.err.println(Assimp.aiGetErrorString());
		System.err.println("Loading from disk failed.");
	}

	/// Extract information from the model.
	/// Assimp provides information about meshes, materials, animations, textures, etc.
	NativePointerArray meshPointers = aiScene.mMeshes();

	/// Iterate over the meshes.
	for (int i = 0; i < aiScene.mNumMeshes(); i++) {
		AiMesh mesh = new AiMesh(meshPointers.get(i));
		System.out.println("Mesh Name: " + mesh.mName().data());
		System.out.println("Primitive Types: " + mesh.mPrimitiveTypes());
		System.out.println("Vertex Count: " + mesh.mNumVertices());
	}

	/// Do not forget to free the scene when it is no longer needed.
	Assimp.aiReleaseImport(aiScene);

}
```