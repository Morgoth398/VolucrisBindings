package generation;

import volucris.bindings.generator.generation.Generator;
import volucris.bindings.generator.parsing.HeaderFile;
import volucris.bindings.libclang.enums.CXTranslationUnit_Flags;

public class MimallocGeneration {

	public static void main(String[] args) {

		HeaderFile headerFile = new HeaderFile(
				"src/main/resources/nativeSources/mimalloc-3.6/mimalloc.h",
				true,
				CXTranslationUnit_Flags.CX_TRANSLATION_UNIT_INCLUDE_ATTRIBUTED_TYPES
		);
		
		Generator generator = new Generator("src/main/resources/configs/globalConfig.yaml", headerFile);
		
		generator.generate("src/main/resources/configs/Mimalloc.yaml");
		generator.generate("src/main/resources/configs/MiHeapArea.yaml");
		generator.generate("src/main/resources/configs/MiSubprocId.yaml");

		generator.generateCallbacks("src/main/resources/configs/callbacks.yaml");
		
		generator.generateEnums("src/main/resources/configs/enumsConfigs.yaml");
	}

}
