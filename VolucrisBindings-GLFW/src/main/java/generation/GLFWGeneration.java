package generation;

import volucris.bindings.generator.generation.Generator;
import volucris.bindings.generator.parsing.HeaderFile;
import volucris.bindings.libclang.enums.CXTranslationUnit_Flags;

public class GLFWGeneration {

	public static void main(String[] args) {
		int options = CXTranslationUnit_Flags.CX_TRANSLATION_UNIT_DETAILED_PREPROCESSING_RECORD;

		HeaderFile headerFile = new HeaderFile(
				"src/main/resources/nativeSources/glfw-3.4/include/GLFW/glfw.h",
				options,
				"-I" + System.getenv("VULKAN_SDK") + "/Include",
				"-Isrc/main/resources/nativeSources/glfw-3.4/include/"
		);

		Generator generator = new Generator("src/main/resources/configs/globalConfig.yaml", headerFile);

		generator.generate("src/main/resources/configs/GLFW.yaml");

		generator.generate("src/main/resources/configs/GLFWallocator.yaml");
		generator.generate("src/main/resources/configs/GLFWgamepadstate.yaml");
		generator.generate("src/main/resources/configs/GLFWgammaramp.yaml");
		generator.generate("src/main/resources/configs/GLFWimage.yaml");
		generator.generate("src/main/resources/configs/GLFWvidmode.yaml");

		generator.generateCallbacks("src/main/resources/configs/callbacks.yaml");
	}

}
