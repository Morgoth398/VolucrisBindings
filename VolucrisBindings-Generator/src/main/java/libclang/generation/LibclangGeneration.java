package libclang.generation;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.HashMap;
import java.util.Map;

import volucris.bindings.generator.generation.Generator;
import volucris.bindings.generator.parsing.HeaderFile;
import volucris.bindings.generator.parsing.NativeFunctionPointer;

public class LibclangGeneration {

	public static void main(String[] args) throws IOException {

		String basePath = "../VolucrisBindings-Libclang/";
		
		HeaderFile headerFile = new HeaderFile(
				basePath + "src/main/resources/nativeSources/clang-c/Index.h",
				false,
				"-I" + basePath + "src/main/resources/nativeSources/"
		);

		Generator generator = new Generator(basePath + "src/main/resources/configs/globalConfig.yaml", headerFile);

		generator.generate(basePath + "src/main/resources/configs/ClangIndex.yaml");

		Map<String, NativeFunctionPointer> functionPointers = new HashMap<>();
		headerFile.getRecord("CXCursorAndRangeVisitor").getFunctionPointerFields().forEach(f -> {
			NativeFunctionPointer functionPointer = f.getFunctionPointer();
			functionPointers.put(functionPointer.getName(), functionPointer);
		});
		headerFile.getRecord("IndexerCallbacks").getFunctionPointerFields().forEach(f -> {
			NativeFunctionPointer functionPointer = f.getFunctionPointer();
			functionPointers.put(functionPointer.getName(), functionPointer);
		});

		generator.generateCallbacks(basePath + "src/main/resources/configs/callbacks.yaml", functionPointers);

		generator.generateEnums(basePath + "src/main/resources/configs/enumsConfigs.yaml");

		Files.walkFileTree(Path.of(basePath + "src/main/resources/configs/structs"), new SimpleFileVisitor<Path>() {
			@Override
			public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
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
