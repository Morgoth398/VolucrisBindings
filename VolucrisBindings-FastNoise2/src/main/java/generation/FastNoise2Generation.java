package generation;

import volucris.bindings.generator.generation.Generator;
import volucris.bindings.generator.parsing.HeaderFile;

public class FastNoise2Generation {

	public static void main(String[] args) throws Exception {

		HeaderFile headerFile = new HeaderFile(
				"src/main/resources/nativeSources/fastNoise2-1.1.1/include/FastNoise/FastNoise_C.h",
				"-x", "c",
				"-include", "stdbool.h",
				"-Isrc/main/resources/nativeSources/fastNoise2-1.1.1/include/FastNoise"
		);

		Generator generator = new Generator("src/main/resources/configs/globalConfig.yaml", headerFile);

		generator.generate("src/main/resources/configs/FastNoise2.yaml");
	}

}
