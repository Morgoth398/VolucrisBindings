package generation;

import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

import freemarker.template.Template;
import volucris.bindings.generator.generation.Generator;
import volucris.bindings.generator.parsing.HeaderFile;
import volucris.bindings.libclang.enums.CXTranslationUnit_Flags;

public class VulkanGeneration {

	public static void main(String[] args) throws Exception {

		int options = CXTranslationUnit_Flags.CX_TRANSLATION_UNIT_DETAILED_PREPROCESSING_RECORD;

		String includeDirectory = System.getenv("VULKAN_SDK") + "/Include";
		HeaderFile headerFile = new HeaderFile(includeDirectory + "/vulkan/vulkan.h", options, "-I" + includeDirectory);
		
		Generator generator = new Generator("src/main/resources/configs/globalConfig.yaml", headerFile);

		Template vulkanBaseTemplate = generator.getTemplate("VulkanBaseTemplate.ftl");
		generator.generate("src/main/resources/configs/vulkan/VulkanBase.yaml", vulkanBaseTemplate, null);

		Template vkInstanceTemplate = generator.getTemplate("VkInstanceTemplate.ftl");
		generator.generate("src/main/resources/configs/vulkan/VkInstance.yaml", vkInstanceTemplate, null);

		Template vkDeviceTemplate = generator.getTemplate("VkDeviceTemplate.ftl");
		generator.generate("src/main/resources/configs/vulkan/VkDevice.yaml", vkDeviceTemplate, null);

		Template vkQueueTemplate = generator.getTemplate("VkQueueTemplate.ftl");
		generator.generate("src/main/resources/configs/vulkan/VkQueue.yaml", vkQueueTemplate, null);

		Template vkCommandBufferTemplate = generator.getTemplate("VkCommandBufferTemplate.ftl");
		generator.generate("src/main/resources/configs/vulkan/VkCommandBuffer.yaml", vkCommandBufferTemplate, null);

		Template vkPhysicalDeviceTemplate = generator.getTemplate("VkPhysicalDeviceTemplate.ftl");
		generator.generate("src/main/resources/configs/vulkan/VkPhysicalDevice.yaml", vkPhysicalDeviceTemplate, null);

		Template vKTemplate = generator.getTemplate("VKTemplate.ftl");
		generator.generate("src/main/resources/configs/vulkan/VK.yaml", vKTemplate, null);

		Files.walkFileTree(Path.of("src/main/resources/configs/vulkan/structs"), new SimpleFileVisitor<Path>() {
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

		Files.walkFileTree(Path.of("src/main/resources/configs/vulkan/unions"), new SimpleFileVisitor<Path>() {
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
		
		generator.generateCallbacks("src/main/resources/configs/vulkan/callbacks.yaml");
		
		generator.generateEnums("src/main/resources/configs/vulkan/enumsConfigs.yaml");
	}

}
