package generation;

import volucris.bindings.generator.generation.Generator;
import volucris.bindings.generator.parsing.HeaderFile;

public class StbVorbisGeneration {

	public static void main(String[] args) {

		HeaderFile headerFile = new HeaderFile(
				"src/main/resources/nativeSources/stbVorbis-1.22/stb_vorbis.c",
				false,
				"-DSTB_VORBIS_HEADER_ONLY"
		);

		Generator generator = new Generator("src/main/resources/configs/stbVorbis/globalConfig.yaml", headerFile);
		
		generator.generate("src/main/resources/configs/stbVorbis/StbVorbis.yaml");
		generator.generate("src/main/resources/configs/stbVorbis/StbVorbisAlloc.yaml");
		generator.generate("src/main/resources/configs/stbVorbis/StbVorbisComment.yaml");
		generator.generate("src/main/resources/configs/stbVorbis/StbVorbisInfo.yaml");
		
		generator.generateEnums("src/main/resources/configs/stbVorbis/enumsConfigs.yaml");
	}

}
