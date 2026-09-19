package generation;

import volucris.bindings.generator.generation.Generator;
import volucris.bindings.generator.parsing.HeaderFile;

public class YogaGenerator {

	public static void main(String[] args) {

		HeaderFile headerFile = new HeaderFile(
				"src/main/resources/nativeSources/yoga/Yoga.h",
				"-Isrc/main/resources/nativeSources/"
		);
		
		Generator generator = new Generator("src/main/resources/configs/globalConfig.yaml", headerFile);
		generator.generate("src/main/resources/configs/Yoga.yaml");
		generator.generate("src/main/resources/configs/YGSize.yaml");
		generator.generate("src/main/resources/configs/YGValue.yaml");
		
		generator.generateCallbacks("src/main/resources/configs/callbacksConfig.yaml");
		
		generator.generateEnums("src/main/resources/configs/enumsConfigs.yaml");
	}

}
