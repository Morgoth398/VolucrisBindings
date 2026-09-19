package generation;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

import org.lwjgl.llvm.ClangIndex;

import volucris.bindings.generator.generation.Generator;
import volucris.bindings.generator.parsing.HeaderFile;

public class AssimpGeneration {

	public static void main(String[] args) throws IOException {

		int options = ClangIndex.CXTranslationUnit_DetailedPreprocessingRecord;

		String includeDirectory = "-Isrc/main/resources/nativeSources/assimp-6.0.5/include";
		HeaderFile headerFile = new HeaderFile("src/main/resources/nativeSources/assimp-6.0.5/include/UmbrellaHeader.h", false, options, includeDirectory);

		Generator generator = new Generator("src/main/resources/configs/globalConfig.yaml", headerFile);
		
		generator.generate("src/main/resources/configs/Assimp.yaml");
		
		Files.walkFileTree(Path.of("src/main/resources/configs/structs"), new SimpleFileVisitor<Path>() {
			@Override
			public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
				String path = file.toString();

				try {
					if (path.endsWith(".yaml"))
						generator.generate(path);
				} catch (Exception e) {
					System.err.println(path);
					e.printStackTrace();
				}

				return FileVisitResult.CONTINUE;
			}
		});
		
		generator.generateEnums("src/main/resources/configs/enumsConfigs.yaml");
		
		generator.generateCallbacks("src/main/resources/configs/callbacks.yaml");
	}

}
