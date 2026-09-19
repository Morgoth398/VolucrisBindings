package generation;

import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

import org.lwjgl.llvm.ClangIndex;

import volucris.bindings.generator.generation.Generator;
import volucris.bindings.generator.parsing.HeaderFile;

public class VmaGenerator {

	public static void main(String[] args) throws Exception {

		int options = ClangIndex.CXTranslationUnit_DetailedPreprocessingRecord;

		String vulkanIncludeDirectory = System.getenv("VULKAN_SDK") + "/Include";
		HeaderFile headerFile = new HeaderFile(
				"src/main/resources/nativeSources/VulkanMemoryAllocator-3.3.0/include/vk_mem_alloc.h",
				options,
				"-I" + vulkanIncludeDirectory);
		
		Generator generator = new Generator("src/main/resources/configs/globalConfig.yaml", headerFile);

		generator.generate("src/main/resources/configs/VMA.yaml");
		generator.generateEnums("src/main/resources/configs/enumsConfigs.yaml");
		generator.generateCallbacks("src/main/resources/configs/callbacks.yaml");

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
