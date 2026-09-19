package generation;

import java.nio.file.Path;

import volucris.bindings.generator.generation.Generator;
import volucris.bindings.generator.parsing.HeaderFile;

public class GLFWVulkanGeneration {

	public static void main(String[] args) {
		
		String vulkanIncludeDirectory = "-I" + System.getenv("VULKAN_SDK") + "/Include";
		
		Path glfwHeaders = Path.of(System.getProperty("user.dir"))
				.getParent()
				.resolve("VolucrisBindings-GLFW")
				.resolve("src/main/resources/nativeSources/glfw-3.4/include/GLFW/glfw.h");
		
		HeaderFile headerFile = new HeaderFile(glfwHeaders.toString(), 0, vulkanIncludeDirectory);
		headerFile.printFunctions(f -> f.getName().equals("glfwGetInstanceProcAddress"));
		
		Generator generator = new Generator("src/main/resources/configs/globalConfig.yaml", headerFile);

		generator.generate("src/main/resources/configs/glfw/GLFWVulkan.yaml");
	}

}
