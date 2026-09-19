package generation;

import volucris.bindings.generator.generation.Generator;
import volucris.bindings.generator.parsing.HeaderFile;

public class StbImageWriteGeneration {

	public static void main(String[] args) {
		
		HeaderFile headerFile = new HeaderFile("src/main/resources/nativeSources/stbImageWrite-1.16/stb_image_write.h"); 
		headerFile.printFunctions(f -> f.getName().toLowerCase().contains("stbi_write_func".toLowerCase()));
		
		Generator generator = new Generator("src/main/resources/configs/stbImageWrite/globalConfig.yaml", headerFile);
		
		generator.generate("src/main/resources/configs/stbImageWrite/StbImageWrite.yaml");
		
		generator.generateCallbacks("src/main/resources/configs/stbImageWrite/callbacks.yaml");
	}
	
}
