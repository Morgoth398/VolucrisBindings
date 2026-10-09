package generation;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

import volucris.bindings.generator.generation.Generator;
import volucris.bindings.generator.parsing.HeaderFile;
import volucris.bindings.libclang.enums.CXTranslationUnit_Flags;

public class OpenGLGeneration {

	public static void main(String[] args) throws Exception {

		createClassGL();
		createClassGLExtensions();
	}

	private static void createClassGL() {
		String[] arguments = {
				"-Isrc/main/resources/nativeSources/glad_no_extensions/include"
		};

		int options = CXTranslationUnit_Flags.CX_TRANSLATION_UNIT_DETAILED_PREPROCESSING_RECORD;
		
		HeaderFile headerFile = new HeaderFile("src/main/resources/nativeSources/glad_no_extensions/include/glad/glad.h", options, arguments);
		
		Generator generator = new Generator("src/main/resources/configs/globalConfig.yaml", headerFile);
		generator.generate("src/main/resources/configs/GL.yaml");
		generator.generateCallbacks("src/main/resources/configs/callbacks.yaml");
	}
	
	private static void createClassGLExtensions() throws Exception {
		String[] arguments = {
				"-Isrc/main/resources/nativeSources/glad_extensions/include"
		};

		int options = CXTranslationUnit_Flags.CX_TRANSLATION_UNIT_DETAILED_PREPROCESSING_RECORD;
		
		HeaderFile headerFile = new HeaderFile("src/main/resources/nativeSources/glad_extensions/include/glad/glad.h", options, arguments);
		
		Generator generator = new Generator("src/main/resources/configs/globalConfig.yaml", headerFile);
		
		Files.walkFileTree(Path.of("src/main/resources/configs/extensions/"), new SimpleFileVisitor<Path>() {
			@Override
			public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
				String path = file.toString();

				try {
					if (path.endsWith(".yaml"))
						generator.generate(path);
				} catch (Exception e) {
					System.err.println(e.getMessage());
				}

				return FileVisitResult.CONTINUE;
			}
		});
	}
	
}
