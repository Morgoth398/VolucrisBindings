package generation;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import freemarker.template.Configuration;
import freemarker.template.Template;

public class VulkanXmlParser {

	private static final Configuration FREEMARKER_CONFIG;

	static {
		FREEMARKER_CONFIG = new Configuration(Configuration.VERSION_2_3_34);
		FREEMARKER_CONFIG.setDefaultEncoding("UTF-8");
		FREEMARKER_CONFIG.setClassForTemplateLoading(VulkanXmlParser.class, "/templates");
	}

	public static void main(String[] args) throws Exception {

		Path vulkanRegistry = Path.of(System.getenv("VULKAN_SDK"))
				.resolve("share/vulkan/registry/vk.xml");
		Path videoRegistry = Path.of(System.getenv("VULKAN_SDK"))
				.resolve("share/vulkan/registry/video.xml");

		InputStream vulkanRegistryStream = Files.newInputStream(vulkanRegistry);
		InputStream videoRegistryStream = Files.newInputStream(videoRegistry);

		XPath xPath = XPathFactory.newInstance().newXPath();

		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		factory.setNamespaceAware(true);

		DocumentBuilder builder = factory.newDocumentBuilder();

		Document vulkanRegistryDocument = builder.parse(vulkanRegistryStream);
		vulkanRegistryDocument.getDocumentElement().normalize();

		Document videoRegistryDocument = builder.parse(videoRegistryStream);
		videoRegistryDocument.getDocumentElement().normalize();

		handleCommands(vulkanRegistryDocument, xPath);
		handleUnions(vulkanRegistryDocument, xPath);
		handleStructs(vulkanRegistryDocument, xPath);
		handleHandles(vulkanRegistryDocument, xPath);
		handleCoreConstants(vulkanRegistryDocument, xPath);
		handleExtensionConstants(vulkanRegistryDocument, xPath);
		handleBitmaskEnums(vulkanRegistryDocument, xPath);

		handleUnions(videoRegistryDocument, xPath);
		handleStructs(videoRegistryDocument, xPath);

		vulkanRegistryStream.close();
		videoRegistryStream.close();
	}

	private static void handleHandles(Document document, XPath xPath) throws Exception {
		String expression = "/registry/types/type[@category='handle' and not(@alias)]";
		NodeList handles = (NodeList) xPath.evaluate(expression, document, XPathConstants.NODESET);

		if (handles == null || handles.getLength() == 0) {
			System.err.println("No handles found!");
			return;
		}

		Set<String> dispatchHandles = Set.of(
				"VkInstance", "VkPhysicalDevice", "VkDevice", "VkQueue", "VkCommandBuffer"
		);

		String template = """
				package volucris.bindings.vulkan.handles;

				import java.lang.foreign.MemorySegment;

				public record %s(MemorySegment memorySegment) {

				}
				""";

		for (int i = 0; i < handles.getLength(); i++) {
			Node handle = handles.item(i);

			String name = (String) xPath.evaluate("name", handle, XPathConstants.STRING);

			if (dispatchHandles.contains(name))
				continue;

			String source = template.formatted(name);

			Path path = Path.of("src/main/java/volucris/bindings/vulkan/handles", name + ".java");
			createDirectoryAndFile(path);

			Files.writeString(
					path,
					source,
					StandardOpenOption.TRUNCATE_EXISTING
			);
		}
	}

	private static void handleUnions(Document document, XPath xPath) throws Exception {
		String expression = "/registry/types/type[@category='union' and not(@alias)]";
		NodeList unions = (NodeList) xPath.evaluate(expression, document, XPathConstants.NODESET);

		if (unions == null || unions.getLength() == 0) {
			System.err.println("No unions found!");
			return;
		}

		Template template = FREEMARKER_CONFIG.getTemplate("VkUnionConfigTemplate.ftl");

		StringWriter writer = new StringWriter();

		HashMap<String, Object> dataModel = new HashMap<>();

		for (int i = 0; i < unions.getLength(); i++) {
			// Reuse the struct record, even though this method handles unions.
			Struct struct = createStruct(unions.item(i), xPath);

			Path path = Path.of("src/main/resources/configs/vulkan/unions", struct.name + ".yaml");
			createDirectoryAndFile(path);

			dataModel.put("struct", struct);
			writer.getBuffer().setLength(0);
			template.process(dataModel, writer);

			Files.writeString(
					path,
					writer.toString(),
					StandardOpenOption.TRUNCATE_EXISTING
			);
		}
	}

	private static void handleStructs(Document document, XPath xPath) throws Exception {
		String expression = "/registry/types/type[@category='struct' and not(@alias)]";
		NodeList structs = (NodeList) xPath.evaluate(expression, document, XPathConstants.NODESET);

		if (structs == null || structs.getLength() == 0) {
			System.err.println("No structs found!");
			return;
		}

		Template template = FREEMARKER_CONFIG.getTemplate("VkStructConfigTemplate.ftl");

		StringWriter writer = new StringWriter();

		HashMap<String, Object> dataModel = new HashMap<>();

		for (int i = 0; i < structs.getLength(); i++) {
			Struct struct = createStruct(structs.item(i), xPath);

			Path path = Path.of("src/main/resources/configs/vulkan/structs", struct.name + ".yaml");
			createDirectoryAndFile(path);

			dataModel.put("struct", struct);
			writer.getBuffer().setLength(0);
			template.process(dataModel, writer);

			Files.writeString(
					path,
					writer.toString(),
					StandardOpenOption.TRUNCATE_EXISTING
			);
		}
	}

	private static Struct createStruct(Node struct, XPath xPath) throws Exception {
		String structName = (String) xPath.evaluate("@name", struct, XPathConstants.STRING);

		ArrayList<String> stringFields = new ArrayList<String>();
		ArrayList<String> structArrays = new ArrayList<String>();

		NodeList structMembers = (NodeList) xPath.evaluate("member", struct, XPathConstants.NODESET);
		for (int i = 0; i < structMembers.getLength(); i++) {
			Node member = structMembers.item(i);

			boolean isPointer = member.getTextContent().contains("*");

			String name = (String) xPath.evaluate("name", member, XPathConstants.STRING);
			String type = (String) xPath.evaluate("type", member, XPathConstants.STRING);
			String length = (String) xPath.evaluate("@len", member, XPathConstants.STRING);

			if (type.equals("char") && length.contains("null-terminated")) {
				stringFields.add(name);
			} else if (isPointer && !length.isBlank()) {
				structArrays.add(name);
			}
		}

		return new Struct(structName, structArrays, stringFields);
	}

	private static void handleCommands(Document document, XPath xPath) throws Exception {
		String expression = "/registry/commands/command[not(@alias)]";
		NodeList commands = (NodeList) xPath.evaluate(expression, document, XPathConstants.NODESET);

		if (commands == null || commands.getLength() == 0) {
			System.err.println("No commands found!");
			return;
		}

		LinkedHashSet<Command> instanceCommands = new LinkedHashSet<Command>();
		LinkedHashSet<Command> physicalDeviceCommands = new LinkedHashSet<Command>();
		LinkedHashSet<Command> deviceCommands = new LinkedHashSet<Command>();
		LinkedHashSet<Command> queueCommands = new LinkedHashSet<Command>();
		LinkedHashSet<Command> commandBufferCommands = new LinkedHashSet<Command>();
		LinkedHashSet<Command> baseCommands = new LinkedHashSet<Command>();

		for (int i = 0; i < commands.getLength(); i++) {
			Command command = createCommand(commands.item(i), xPath);

			if (command.name.equals("vkGetInstanceProcAddr"))
				continue;
			if (command.name.equals("vkGetDeviceProcAddr"))
				continue;

			switch (command.commandType()) {
				case BASE:
					baseCommands.add(command);
					break;
				case COMMAND_BUFFER:
					commandBufferCommands.add(command);
					deviceCommands.add(command);
					break;
				case DEVICE:
					deviceCommands.add(command);
					break;
				case INSTANCE:
					instanceCommands.add(command);
					break;
				case QUEUE:
					queueCommands.add(command);
					deviceCommands.add(command);
					break;
				case PHYSICAL_DEVICE:
					physicalDeviceCommands.add(command);
					instanceCommands.add(command);
					break;
			}
		}

		Template template = FREEMARKER_CONFIG.getTemplate("VkClassConfigTemplate.ftl");

		HashMap<String, Object> dataModel = new HashMap<String, Object>();
		dataModel.put("name", "VkInstance");
		dataModel.put("functions", instanceCommands);
		dataModel.put("allInformation", false);
		dataModel.put("static", false);

		StringWriter writer = new StringWriter();
		template.process(dataModel, writer);

		Files.writeString(
				Path.of("src/main/resources/configs/vulkan/VkInstance.yaml"),
				writer.toString(),
				StandardOpenOption.TRUNCATE_EXISTING
		);

//		--------------------------------------------------------

		dataModel.put("name", "VkDevice");
		dataModel.put("functions", deviceCommands);

		writer.getBuffer().setLength(0);
		template.process(dataModel, writer);

		Files.writeString(
				Path.of("src/main/resources/configs/vulkan/VkDevice.yaml"),
				writer.toString(),
				StandardOpenOption.TRUNCATE_EXISTING
		);

//		--------------------------------------------------------

		dataModel.put("name", "VkQueue");
		dataModel.put("functions", queueCommands);

		writer.getBuffer().setLength(0);
		template.process(dataModel, writer);

		Files.writeString(
				Path.of("src/main/resources/configs/vulkan/VkQueue.yaml"),
				writer.toString(),
				StandardOpenOption.TRUNCATE_EXISTING
		);

//		--------------------------------------------------------

		dataModel.put("name", "VkCommandBuffer");
		dataModel.put("functions", commandBufferCommands);

		writer.getBuffer().setLength(0);
		template.process(dataModel, writer);

		Files.writeString(
				Path.of("src/main/resources/configs/vulkan/VkCommandBuffer.yaml"),
				writer.toString(),
				StandardOpenOption.TRUNCATE_EXISTING
		);

//		--------------------------------------------------------

		dataModel.put("name", "VkPhysicalDevice");
		dataModel.put("functions", physicalDeviceCommands);

		writer.getBuffer().setLength(0);
		template.process(dataModel, writer);

		Files.writeString(
				Path.of("src/main/resources/configs/vulkan/VkPhysicalDevice.yaml"),
				writer.toString(),
				StandardOpenOption.TRUNCATE_EXISTING
		);

//		--------------------------------------------------------

		dataModel.put("name", "VK");
		dataModel.put(
				"functions",
				List.of(instanceCommands, deviceCommands, queueCommands, commandBufferCommands)
						.stream().flatMap(l -> l.stream())
						.toList()
		);
		dataModel.put("allInformation", true);
		dataModel.put("static", true);
		dataModel.put("rawMethodTemplate", "VKRawMethodTemplate.ftl");
		dataModel.put("typeMethodTemplate", "VKTypedMethodTemplate.ftl");
		dataModel.put("parent", "VulkanBase");

		writer.getBuffer().setLength(0);
		template.process(dataModel, writer);

		Files.writeString(
				Path.of("src/main/resources/configs/vulkan/VK.yaml"),
				writer.toString(),
				StandardOpenOption.TRUNCATE_EXISTING
		);
	}

	private static Command createCommand(Node command, XPath xPath) throws Exception {
		String commandName = (String) xPath.evaluate("proto/name", command, XPathConstants.STRING);

		Node proto = (Node) xPath.evaluate("proto", command, XPathConstants.NODE);
		String length = (String) xPath.evaluate("@len", proto, XPathConstants.STRING);
		String returnType = (String) xPath.evaluate("proto/type", command, XPathConstants.STRING);

		ArrayList<String> structArrays = new ArrayList<String>();
		ArrayList<String> stringParameters = new ArrayList<String>();
		ArrayList<String> nullableParameters = new ArrayList<String>();

		CommandType commandType = null;

		NodeList commandParameters = (NodeList) xPath.evaluate("param", command, XPathConstants.NODESET);
		for (int i = 0; i < commandParameters.getLength(); i++) {
			Node commandParameter = commandParameters.item(i);

			boolean isPointer = commandParameter.getTextContent().contains("*");
			boolean isOptional = ((String) xPath.evaluate("@optional", commandParameter, XPathConstants.STRING))
					.startsWith("true");

			String name = (String) xPath.evaluate("name", commandParameter, XPathConstants.STRING);
			String type = (String) xPath.evaluate("type", commandParameter, XPathConstants.STRING);

			if (i == 0) {
				if (type.equals("VkInstance")) {
					commandType = CommandType.INSTANCE;
				} else if (type.equals("VkDevice")) {
					commandType = CommandType.DEVICE;
				} else if (type.equals("VkQueue")) {
					commandType = CommandType.QUEUE;
				} else if (type.equals("VkCommandBuffer")) {
					commandType = CommandType.COMMAND_BUFFER;
				} else if (type.equals("VkPhysicalDevice")) {
					commandType = CommandType.PHYSICAL_DEVICE;
				} else {
					commandType = CommandType.BASE;
				}
			}

			if (isPointer) {
				String pointerLength = (String) xPath.evaluate("@len", commandParameter, XPathConstants.STRING);

				if (type.equals("char") && pointerLength.contains("null-terminated")) {
					stringParameters.add(name);
				} else if (!pointerLength.isBlank()) {
					structArrays.add(name);
				}
			}

			if (isOptional) {
				nullableParameters.add(name);
			}

		}

		return new Command(
				commandName,
				commandType,
				structArrays,
				stringParameters,
				nullableParameters,
				proto.getTextContent().contains("*") && !length.isBlank(),
				proto.getTextContent().contains("*") && returnType.equals("char")
		);
	}

	private static void handleCoreConstants(Document document, XPath xPath) throws Exception {
		String expression = "/registry/enums[@name='API Constants']/enum";
		NodeList constants = (NodeList) xPath.evaluate(expression, document, XPathConstants.NODESET);

		if (constants == null || constants.getLength() == 0) {
			System.err.println("No macros found!");
			return;
		}

		ArrayList<Constant> list = new ArrayList<>();
		for (int i = 0; i < constants.getLength(); i++) {
			Node macro = constants.item(i);

			String type = (String) xPath.evaluate("@type", macro, XPathConstants.STRING);
			String value = (String) xPath.evaluate("@value", macro, XPathConstants.STRING);
			String name = (String) xPath.evaluate("@name", macro, XPathConstants.STRING);

			value = value
					.replace("(", "")
					.replace(")", "")
					.replace("ULL", "L")
					.replace("UL", "L")
					.replace("U", "")
					.replace("F", "f");

			if (type.contains("int32"))
				type = "int";
			else if (type.contains("int64"))
				type = "long";
			else if (type.contains("float"))
				type = "float";
			else if (type.equals("String") || type.isEmpty())
				type = "String";

			list.add(new Constant(name, value, type));
		}

		Template template = FREEMARKER_CONFIG.getTemplate("ConstantsTemplate.ftl");

		HashMap<String, Object> dataModel = new HashMap<>();
		dataModel.put("packageName", "volucris.bindings.vulkan");
		dataModel.put("className", "VKConstants");
		dataModel.put("constants", list);

		StringWriter writer = new StringWriter();
		template.process(dataModel, writer);

		Path path = Path.of("src/main/java/volucris/bindings/vulkan/VKConstants.java");
		createDirectoryAndFile(path);

		Files.writeString(
				path,
				writer.toString(),
				StandardOpenOption.TRUNCATE_EXISTING
		);
	}

	private static void handleExtensionConstants(Document document, XPath xPath) throws Exception {
		String expression = "/registry/extensions/extension";
		NodeList extensions = (NodeList) xPath.evaluate(expression, document, XPathConstants.NODESET);

		if (extensions == null || extensions.getLength() == 0) {
			System.err.println("No extensions found!");
			return;
		}

		XPathExpression authorExpr = xPath.compile("@author");
		XPathExpression enumsExpr = xPath.compile("require/enum[(@value or @bitpos) and not(@extends)]");
		XPathExpression nameExpr = xPath.compile("@name");
		XPathExpression valueExpr = xPath.compile("@value");
		XPathExpression typeExpr = xPath.compile("@type");

		HashMap<String, List<Constant>> extensionConstants = new HashMap<>();
		for (int i = 0; i < extensions.getLength(); i++) {
			Node extension = extensions.item(i);

			String extensionName = (String) nameExpr.evaluate(extension, XPathConstants.STRING);
			String author = (String) authorExpr.evaluate(extension, XPathConstants.STRING);

			NodeList enums = (NodeList) enumsExpr.evaluate(extension, XPathConstants.NODESET);

			if (enums == null || enums.getLength() == 0) {
				System.err.println("No enums found for extension " + extensionName);
				continue;
			}

			ArrayList<Constant> list = new ArrayList<>();
			for (int j = 0; j < enums.getLength(); j++) {
				Node constant = enums.item(j);

				String type = (String) typeExpr.evaluate(constant, XPathConstants.STRING);
				String value = (String) valueExpr.evaluate(constant, XPathConstants.STRING);
				String name = (String) nameExpr.evaluate(constant, XPathConstants.STRING);

				value = value
						.replace("(", "")
						.replace(")", "")
						.replace("ULL", "L")
						.replace("UL", "L")
						.replace("U", "")
						.replace("F", "f");

				if (value.startsWith("\"")) {
					type = "String";
				} else if (value.endsWith("L")) {
					type = "long";
				} else if (value.endsWith("f")) {
					type = "float";
				} else {
					type = "int";
				}

				list.add(new Constant(name, value, type));
			}

			List<Constant> alreadyAddedConstants = extensionConstants.get(author.toLowerCase());

			if (alreadyAddedConstants == null)
				extensionConstants.put(author.toLowerCase(), list);
			else
				alreadyAddedConstants.addAll(list);
		}

		Map<String, List<String>> classToAuthors = Map.ofEntries(
				Map.entry("VkExtensionsKHR", List.of("khr")),
				Map.entry("VkExtensionsEXT", List.of("ext")),
				Map.entry("VkExtensionsNV", List.of("nv", "nvidia", "nvx")),
				Map.entry("VkExtensionsARM", List.of("arm")),
				Map.entry("VkExtensionsHUAWEI", List.of("huawei")),
				Map.entry("VkExtensionsAMD", List.of("amd")),
				Map.entry("VkExtensionsINTEL", List.of("intel")),
				Map.entry("VkExtensionsQCOM", List.of("qcom")),
				Map.entry("VkExtensionsGOOGLE", List.of("google")),
				Map.entry("VkExtensionsVALVE", List.of("valve")),
				Map.entry("VkExtensionsANDROID", List.of("android")),
				Map.entry(
						"VkExtensionsMisc", List.of(
								"msft", "nn", "ggp", "mvk", "mesa", "img",
								"fuchsia", "brcm", "baldur karlsson", "lunarg", "rastergrid",
								"juice", "qnx", "sec", "fb", "mtk", "coreavi"
						)
				)
		);

		Template template = FREEMARKER_CONFIG.getTemplate("ConstantsTemplate.ftl");

		HashMap<String, Object> dataModel = new HashMap<>();
		dataModel.put("packageName", "volucris.bindings.vulkan.extensions");

		StringWriter writer = new StringWriter();

		classToAuthors.forEach((className, authors) -> {
			List<Constant> list = extensionConstants.entrySet().stream()
					.filter(e -> authors.contains(e.getKey()))
					.flatMap(e -> e.getValue().stream())
					.toList();

			dataModel.put("className", className);
			dataModel.put("constants", list);

			writer.getBuffer().setLength(0);
			try {
				template.process(dataModel, writer);

				Path path = Path.of("src/main/java/volucris/bindings/vulkan/extensions/", className + ".java");
				createDirectoryAndFile(path);

				Files.writeString(
						path,
						writer.toString(),
						StandardOpenOption.TRUNCATE_EXISTING
				);
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		});
	}

	private static void handleBitmaskEnums(Document document, XPath xPath) throws Exception {
		String expression = "/registry/enums[@bitwidth='64' and @type='bitmask']";
		NodeList bitEnums = (NodeList) xPath.evaluate(expression, document, XPathConstants.NODESET);

		if (bitEnums == null || bitEnums.getLength() == 0) {
			System.err.println("No macros found!");
			return;
		}

		for (int i = 0; i < bitEnums.getLength(); i++) {
			Node bitEnum = bitEnums.item(i);

			String name = (String) xPath.evaluate("@name", bitEnum, XPathConstants.STRING);

			NodeList constants = (NodeList) xPath.evaluate("enum", bitEnum, XPathConstants.NODESET);

			if (constants.getLength() == 0)
				continue;

			ArrayList<Constant> list = new ArrayList<>();
			for (int j = 0; j < constants.getLength(); j++) {
				Node constant = constants.item(j);

				String constantName = (String) xPath.evaluate("@name", constant, XPathConstants.STRING);
				String type = "long";

				String bitPos = (String) xPath.evaluate("@bitpos", constant, XPathConstants.STRING);
				String value = (String) xPath.evaluate("@value", constant, XPathConstants.STRING);
				String alias = (String) xPath.evaluate("@alias", constant, XPathConstants.STRING);

				if (!bitPos.isBlank())
					value = "1L << " + bitPos;
				if (!alias.isBlank())
					value = alias;

				list.add(new Constant(constantName, value, type));
			}

			Template template = FREEMARKER_CONFIG.getTemplate("ConstantsTemplate.ftl");

			HashMap<String, Object> dataModel = new HashMap<>();
			dataModel.put("packageName", "volucris.bindings.vulkan.enums");
			dataModel.put("className", name);
			dataModel.put("constants", list);

			StringWriter writer = new StringWriter();
			template.process(dataModel, writer);

			Path path = Path.of("src/main/java/volucris/bindings/vulkan/enums/" + name + ".java");
			createDirectoryAndFile(path);

			Files.writeString(
					path,
					writer.toString(),
					StandardOpenOption.TRUNCATE_EXISTING
			);

		}

	}

	private static void createDirectoryAndFile(Path path) throws IOException {
		if (Files.isDirectory(path))
			throw new RuntimeException("Invalid file path");

		if (Files.exists(path))
			return;

		Path parent = path.getParent();
		if (parent != null)
			Files.createDirectories(path.getParent());

		Files.createFile(path);
	}

	public static record Command(
			String name,
			CommandType commandType,
			List<String> structArrays,
			List<String> stringParameters,
			List<String> nullableParameters,
			boolean returnTypeIsStructArray,
			boolean returnTypeIsString
	) {
	}

	public static enum CommandType {
		INSTANCE,
		PHYSICAL_DEVICE,
		DEVICE,
		QUEUE,
		COMMAND_BUFFER,
		BASE
	}

	public static record Struct(
			String name,
			List<String> structArrays,
			List<String> stringFields
	) {
	}

	public static record Constant(
			String name,
			String value,
			String type
	) {

	}

}
