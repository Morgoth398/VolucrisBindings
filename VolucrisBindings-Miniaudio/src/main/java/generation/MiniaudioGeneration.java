package generation;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import volucris.bindings.generator.generation.Generator;
import volucris.bindings.generator.parsing.HeaderFile;
import volucris.bindings.generator.parsing.NativeFunctionPointer;
import volucris.bindings.generator.parsing.NativeRecord;
import volucris.bindings.libclang.enums.CXTranslationUnit_Flags;

public class MiniaudioGeneration {

	public static void main(String[] args) throws IOException {
		int options = CXTranslationUnit_Flags.CX_TRANSLATION_UNIT_DETAILED_PREPROCESSING_RECORD;
		
		HeaderFile headerFile = new HeaderFile("src/main/resources/nativeSources/miniaudio.h", options);

		Generator generator = new Generator("src/main/resources/configs/globalConfig.yaml", headerFile);

		generator.generate("src/main/resources/configs/Miniaudio.yaml");

		generator.generateEnums("src/main/resources/configs/enumsConfigs.yaml");

		Map<String, NativeFunctionPointer> functionPointersMap = new HashMap<>();
		headerFile.getRecords(_ -> true).forEach(nativeRecord -> {
			List<NativeFunctionPointer> functionPointers = nativeRecord
					.getFunctionPointerFields()
					.stream()
					.map(NativeRecord.FunctionPointerField::getFunctionPointer)
					.toList();

			functionPointers.forEach(functionPointer -> {
				if (functionPointersMap.containsKey(functionPointer.getName())) {
					System.err.println("Duplicated function pointer name " + functionPointer.getName());
				} else {
					functionPointersMap.put(functionPointer.getName(), functionPointer);
				}
			});
		});

		generator.generateCallbacks("src/main/resources/configs/callbacks.yaml", functionPointersMap);

		Files.walkFileTree(Path.of("src/main/resources/configs/structs"), new SimpleFileVisitor<Path>() {
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
