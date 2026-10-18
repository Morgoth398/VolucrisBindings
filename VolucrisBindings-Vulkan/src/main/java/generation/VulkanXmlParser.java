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
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

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

		try (ExecutorService executorService = Executors.newVirtualThreadPerTaskExecutor()) {

			CompletableFuture.runAsync(new VulkanRegistryCommandHandler(vulkanRegistry), executorService)
					.whenComplete((_, throwable) -> {
						if (throwable != null) {
							throwable.printStackTrace();
						}
					});
			CompletableFuture.runAsync(new VulkanRegistryHandleHandler(vulkanRegistry), executorService)
					.whenComplete((_, throwable) -> {
						if (throwable != null) {
							throwable.printStackTrace();
						}
					});
			CompletableFuture.runAsync(new VulkanRegistryApiConstantsHandler(vulkanRegistry), executorService)
					.whenComplete((_, throwable) -> {
						if (throwable != null) {
							throwable.printStackTrace();
						}
					});
			CompletableFuture.runAsync(new VulkanRegistryExtensionConstantsHandler(vulkanRegistry), executorService)
					.whenComplete((_, throwable) -> {
						if (throwable != null) {
							throwable.printStackTrace();
						}
					});
			CompletableFuture.runAsync(new VulkanRegistryBitmaskEnumsHandler(vulkanRegistry), executorService)
					.whenComplete((_, throwable) -> {
						if (throwable != null) {
							throwable.printStackTrace();
						}
					});

			CompletableFuture.runAsync(new RecordHandler(vulkanRegistry, false), executorService)
					.whenComplete((_, throwable) -> {
						if (throwable != null) {
							throwable.printStackTrace();
						}
					});
			CompletableFuture.runAsync(new RecordHandler(vulkanRegistry, true), executorService)
					.whenComplete((_, throwable) -> {
						if (throwable != null) {
							throwable.printStackTrace();
						}
					});

			CompletableFuture.runAsync(new RecordHandler(videoRegistry, false), executorService)
					.whenComplete((_, throwable) -> {
						if (throwable != null) {
							throwable.printStackTrace();
						}
					});
			CompletableFuture.runAsync(new RecordHandler(videoRegistry, true), executorService)
					.whenComplete((_, throwable) -> {
						if (throwable != null) {
							throwable.printStackTrace();
						}
					});

		}
	}

	private static class VulkanRegistryHandleHandler implements Runnable {

		private final String filePath;

		private final XPath xPath;

		private final Document document;

		private final XPathExpression handlesExpression;
		private final XPathExpression handleNameExpression;

		public VulkanRegistryHandleHandler(Path path) {
			filePath = path.toString();

			xPath = XPathFactory.newInstance().newXPath();

			try (InputStream inputStream = Files.newInputStream(path)) {
				document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(inputStream);

				handlesExpression = xPath.compile(
						"/registry/types/type[@category='handle' and not(@alias) and type='VK_DEFINE_NON_DISPATCHABLE_HANDLE']"
				);

				handleNameExpression = xPath.compile("name");
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		}

		@Override
		public void run() {

			try {
				NodeList handles = (NodeList) handlesExpression.evaluate(
						document, XPathConstants.NODESET
				);

				if (handles == null || handles.getLength() == 0) {
					System.err.println("No handles found in %s!".formatted(filePath));
					return;
				}

				String template = """
						package volucris.bindings.vulkan.handles;

						import java.lang.foreign.MemorySegment;

						public record %s(MemorySegment memorySegment) {

						}
						""";

				for (int i = 0; i < handles.getLength(); i++) {
					Node handle = handles.item(i);

					String name = (String) handleNameExpression.evaluate(handle, XPathConstants.STRING);

					String source = template.formatted(name);

					Path path = Path.of("src/main/java/volucris/bindings/vulkan/handles", name + ".java");
					createDirectoryAndFile(path);

					Files.writeString(
							path,
							source,
							StandardOpenOption.TRUNCATE_EXISTING
					);
				}

			} catch (Exception e) {
				throw new RuntimeException(e);
			}

		}

	}

	private static class VulkanRegistryCommandHandler implements Runnable {

		private final String filePath;

		private final XPath xPath;

		private final Document document;

		private final XPathExpression commandsExpression;

		private final XPathExpression commandNameExpression;

		private final XPathExpression commandParametersExpression;

		private final XPathExpression commandParameterIsPointerExpression;
		private final XPathExpression commandParameterIsOptionalExpression;
		private final XPathExpression commandParameterNameExpression;
		private final XPathExpression commandParameterTypeExpression;
		private final XPathExpression commandParameterLengthExpression;

		public VulkanRegistryCommandHandler(Path path) {
			filePath = path.toString();

			xPath = XPathFactory.newInstance().newXPath();

			try (InputStream inputStream = Files.newInputStream(path)) {
				document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(inputStream);

				commandsExpression = xPath.compile("/registry/commands/command[not(@alias)]");

				commandNameExpression = xPath.compile("proto/name");

				commandParametersExpression = xPath.compile("param");

				commandParameterIsPointerExpression = xPath.compile("text()[contains(., '*')]");
				commandParameterIsOptionalExpression = xPath.compile("@optional");
				commandParameterNameExpression = xPath.compile("name");
				commandParameterTypeExpression = xPath.compile("type");
				commandParameterLengthExpression = xPath.compile("@len");
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		}

		@Override
		public void run() {
			try {
				NodeList commands = (NodeList) commandsExpression.evaluate(document, XPathConstants.NODESET);

				if (commands == null || commands.getLength() == 0) {
					System.err.println("No commands found in %s!".formatted(filePath));
					return;
				}

				Set<Command> instanceCommands = new LinkedHashSet<Command>();
				Set<Command> physicalDeviceCommands = new LinkedHashSet<Command>();
				Set<Command> deviceCommands = new LinkedHashSet<Command>();
				Set<Command> queueCommands = new LinkedHashSet<Command>();
				Set<Command> commandBufferCommands = new LinkedHashSet<Command>();
				Set<Command> baseCommands = new LinkedHashSet<Command>();

				for (int i = 0; i < commands.getLength(); i++) {
					Command command = getCommand(commands.item(i));

					if (command.name().equals("vkGetInstanceProcAddr"))
						continue;
					if (command.name().equals("vkGetDeviceProcAddr"))
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

//				--------------------------------------------------------

				dataModel.put("name", "VkDevice");
				dataModel.put("functions", deviceCommands);

				writer.getBuffer().setLength(0);
				template.process(dataModel, writer);

				Files.writeString(
						Path.of("src/main/resources/configs/vulkan/VkDevice.yaml"),
						writer.toString(),
						StandardOpenOption.TRUNCATE_EXISTING
				);

//				--------------------------------------------------------

				dataModel.put("name", "VkQueue");
				dataModel.put("functions", queueCommands);

				writer.getBuffer().setLength(0);
				template.process(dataModel, writer);

				Files.writeString(
						Path.of("src/main/resources/configs/vulkan/VkQueue.yaml"),
						writer.toString(),
						StandardOpenOption.TRUNCATE_EXISTING
				);

//				--------------------------------------------------------

				dataModel.put("name", "VkCommandBuffer");
				dataModel.put("functions", commandBufferCommands);

				writer.getBuffer().setLength(0);
				template.process(dataModel, writer);

				Files.writeString(
						Path.of("src/main/resources/configs/vulkan/VkCommandBuffer.yaml"),
						writer.toString(),
						StandardOpenOption.TRUNCATE_EXISTING
				);

//				--------------------------------------------------------

				dataModel.put("name", "VkPhysicalDevice");
				dataModel.put("functions", physicalDeviceCommands);

				writer.getBuffer().setLength(0);
				template.process(dataModel, writer);

				Files.writeString(
						Path.of("src/main/resources/configs/vulkan/VkPhysicalDevice.yaml"),
						writer.toString(),
						StandardOpenOption.TRUNCATE_EXISTING
				);

//				--------------------------------------------------------

				dataModel.put("name", "VK");
				dataModel.put(
						"functions",
						List.of(
								instanceCommands,
								deviceCommands,
								queueCommands,
								commandBufferCommands
						)
								.stream()
								.flatMap(Set<Command>::stream)
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

			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		}

		private Command getCommand(Node command) throws Exception {
			String commandName = (String) commandNameExpression.evaluate(command, XPathConstants.STRING);

			List<CommandParameter> commandParameters = new ArrayList<>();

			NodeList parameters = (NodeList) commandParametersExpression.evaluate(command, XPathConstants.NODESET);
			for (int i = 0; i < parameters.getLength(); i++) {
				Node parameter = parameters.item(i);

				boolean isPointer = (boolean) commandParameterIsPointerExpression
						.evaluate(parameter, XPathConstants.BOOLEAN);
				boolean isOptional = ((String) commandParameterIsOptionalExpression
						.evaluate(parameter, XPathConstants.STRING)).startsWith("true");

				String name = (String) commandParameterNameExpression.evaluate(parameter, XPathConstants.STRING);
				String type = (String) commandParameterTypeExpression.evaluate(parameter, XPathConstants.STRING);
				String length = (String) commandParameterLengthExpression.evaluate(parameter, XPathConstants.STRING);

				commandParameters.add(
						new CommandParameter(name, type, length == null ? "" : length, isPointer, isOptional)
				);
			}

			CommandParameter firstParameter = commandParameters.getFirst();

			CommandType commandType = switch (firstParameter.type()) {
				case "VkInstance" -> CommandType.INSTANCE;
				case "VkDevice" -> CommandType.DEVICE;
				case "VkQueue" -> CommandType.QUEUE;
				case "VkCommandBuffer" -> CommandType.COMMAND_BUFFER;
				case "VkPhysicalDevice" -> CommandType.PHYSICAL_DEVICE;
				default -> CommandType.BASE;
			};

			List<String> structArrays = new ArrayList<>();
			List<String> stringParameters = new ArrayList<>();
			List<String> nullableParameters = new ArrayList<>();

			for (CommandParameter commandParameter : commandParameters) {
				if (commandParameter.isOptional()) {
					nullableParameters.add(commandParameter.name());
				} else if (!commandParameter.length().isBlank()) {
					CommandParameter lengthParameter = commandParameters.stream()
							.filter(parameter -> parameter.name().equals(commandParameter.length()))
							.findFirst()
							.orElse(null);

					if (lengthParameter != null && lengthParameter.isOptional())
						nullableParameters.add(commandParameter.name());
				}

				if (commandParameter.isPointer()) {
					String length = commandParameter.length();

					if (commandParameter.type().equals("char") && length.contains("null-terminated")) {
						stringParameters.add(commandParameter.name());
					} else if (!length.isBlank()) {
						structArrays.add(commandParameter.name());
					}
				}
			}

			return new Command(commandName, commandType, structArrays, stringParameters, nullableParameters);
		}

	}

	private static class VulkanRegistryApiConstantsHandler implements Runnable {

		private final String filePath;

		private final XPath xPath;

		private final Document document;

		private final XPathExpression constantsExpression;

		private final XPathExpression constantNameExpression;
		private final XPathExpression constantTypeExpression;
		private final XPathExpression constantValueExpression;

		public VulkanRegistryApiConstantsHandler(Path path) {
			filePath = path.toString();

			xPath = XPathFactory.newInstance().newXPath();

			try (InputStream inputStream = Files.newInputStream(path)) {
				document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(inputStream);

				constantsExpression = xPath.compile("/registry/enums[@name='API Constants']/enum");

				constantNameExpression = xPath.compile("@name");
				constantTypeExpression = xPath.compile("@type");
				constantValueExpression = xPath.compile("@value");
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		}

		@Override
		public void run() {
			try {
				NodeList constants = (NodeList) constantsExpression.evaluate(document, XPathConstants.NODESET);

				if (constants == null || constants.getLength() == 0) {
					System.err.println("No constants found in %s!".formatted(filePath));
					return;
				}

				List<Constant> list = new ArrayList<>();
				for (int i = 0; i < constants.getLength(); i++) {
					Node constant = constants.item(i);

					String type = (String) constantTypeExpression.evaluate(constant, XPathConstants.STRING);
					String value = (String) constantValueExpression.evaluate(constant, XPathConstants.STRING);
					String name = (String) constantNameExpression.evaluate(constant, XPathConstants.STRING);

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

			} catch (Exception e) {
				throw new RuntimeException(e);
			}

		}

	}

	private static class VulkanRegistryExtensionConstantsHandler implements Runnable {

		private final String filePath;

		private final XPath xPath;

		private final Document document;

		private final XPathExpression extensionsExpression;

		private final XPathExpression extensionAuthorExpression;
		private final XPathExpression extensionEnumsExpression;
		private final XPathExpression extensionNameExpression;

		private final XPathExpression constantNameExpression;
		private final XPathExpression constantValueExpression;
		private final XPathExpression constantTypeExpression;

		public VulkanRegistryExtensionConstantsHandler(Path path) {
			filePath = path.toString();

			xPath = XPathFactory.newInstance().newXPath();

			try (InputStream inputStream = Files.newInputStream(path)) {
				document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(inputStream);

				extensionsExpression = xPath.compile("/registry/extensions/extension[not(@supported='disabled')]");

				extensionAuthorExpression = xPath.compile("@author");
				extensionEnumsExpression = xPath.compile("require/enum[(@value or @bitpos) and not(@extends)]");
				extensionNameExpression = xPath.compile("@name");

				constantNameExpression = xPath.compile("@name");
				constantValueExpression = xPath.compile("@value");
				constantTypeExpression = xPath.compile("@type");

			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		}

		@Override
		public void run() {
			try {
				NodeList extensions = (NodeList) extensionsExpression.evaluate(document, XPathConstants.NODESET);

				if (extensions == null || extensions.getLength() == 0) {
					System.err.println("No extensions found in %s!".formatted(filePath));
					return;
				}

				Map<String, List<Constant>> extensionConstants = new HashMap<>();
				for (int i = 0; i < extensions.getLength(); i++) {
					Node extension = extensions.item(i);

					String extensionName = (String) extensionNameExpression.evaluate(extension, XPathConstants.STRING);
					String author = (String) extensionAuthorExpression.evaluate(extension, XPathConstants.STRING);

					NodeList enums = (NodeList) extensionEnumsExpression.evaluate(extension, XPathConstants.NODESET);

					if (enums == null || enums.getLength() == 0) {
						System.err.println("No enums found for extension " + extensionName);
						continue;
					}

					List<Constant> list = new ArrayList<>();
					for (int j = 0; j < enums.getLength(); j++) {
						Node constant = enums.item(j);

						String type = (String) constantTypeExpression.evaluate(constant, XPathConstants.STRING);
						String value = (String) constantValueExpression.evaluate(constant, XPathConstants.STRING);
						String name = (String) constantNameExpression.evaluate(constant, XPathConstants.STRING);

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
						extensionConstants.put(author.toLowerCase(), new ArrayList<>(list));
					else
						alreadyAddedConstants.addAll(new ArrayList<>(list));

				}

				Map<String, String> authorToClass = new HashMap<>();
				authorToClass.put("khr", "VkExtensionsKHR");
				authorToClass.put("ext", "VkExtensionsEXT");
				authorToClass.put("nv", "VkExtensionsNV");
				authorToClass.put("nvidia", "VkExtensionsNV");
				authorToClass.put("nvx", "VkExtensionsNV");
				authorToClass.put("arm", "VkExtensionsARM");
				authorToClass.put("huawei", "VkExtensionsHUAWEI");
				authorToClass.put("amd", "VkExtensionsAMD");
				authorToClass.put("intel", "VkExtensionsINTEL");
				authorToClass.put("qcom", "VkExtensionsQCOM");
				authorToClass.put("google", "VkExtensionsGOOGLE");
				authorToClass.put("valve", "VkExtensionsVALVE");
				authorToClass.put("android", "VkExtensionsANDROID");
				
				Map<String, List<Constant>> groupedConstants = new HashMap<>();
				authorToClass.forEach((_, clazz) -> {
					groupedConstants.putIfAbsent(clazz, new ArrayList<>());
				});
				groupedConstants.putIfAbsent("VkExtensionsMisc", new ArrayList<>());

				extensionConstants.forEach((author, constants) -> {
					String className = authorToClass.getOrDefault(author, "VkExtensionsMisc");
					
					if (!authorToClass.containsKey(author))
				        System.err.println("Author routed to Misc: " + author);
					
					groupedConstants.get(className).addAll(constants);
				});
				
				Template template = FREEMARKER_CONFIG.getTemplate("ConstantsTemplate.ftl");

				HashMap<String, Object> dataModel = new HashMap<>();
				dataModel.put("packageName", "volucris.bindings.vulkan.extensions");

				StringWriter writer = new StringWriter();

				groupedConstants.forEach((className, constants) -> {
					dataModel.put("className", className);
					dataModel.put("constants", constants);

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

			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		}

	}

	private static class VulkanRegistryBitmaskEnumsHandler implements Runnable {

		private final String filePath;

		private final XPath xPath;

		private final Document document;

		private final XPathExpression enumsExpression;

		private final XPathExpression enumNameExpression;
		private final XPathExpression enumConstantsExpression;

		private final XPathExpression constantNameExpression;
		private final XPathExpression constantBitposExpression;
		private final XPathExpression constantValueExpression;
		private final XPathExpression constantAliasExpression;

		public VulkanRegistryBitmaskEnumsHandler(Path path) {
			filePath = path.toString();

			xPath = XPathFactory.newInstance().newXPath();

			try (InputStream inputStream = Files.newInputStream(path)) {
				document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(inputStream);

				enumsExpression = xPath.compile("/registry/enums[@bitwidth='64' and @type='bitmask']");

				enumNameExpression = xPath.compile("@name");
				enumConstantsExpression = xPath.compile("enum");

				constantNameExpression = xPath.compile("@name");
				constantBitposExpression = xPath.compile("@bitpos");
				constantValueExpression = xPath.compile("@value");
				constantAliasExpression = xPath.compile("@alias");
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		}

		@Override
		public void run() {
			try {
				NodeList bitmaskEnums = (NodeList) enumsExpression.evaluate(document, XPathConstants.NODESET);

				if (bitmaskEnums == null || bitmaskEnums.getLength() == 0) {
					System.err.println("No bitmask enums found in %s!".formatted(filePath));
					return;
				}

				for (int i = 0; i < bitmaskEnums.getLength(); i++) {
					Node bitmaskEnum = bitmaskEnums.item(i);

					String name = (String) enumNameExpression.evaluate(bitmaskEnum, XPathConstants.STRING);

					NodeList constants = (NodeList) enumConstantsExpression
							.evaluate(bitmaskEnum, XPathConstants.NODESET);

					if (constants.getLength() == 0)
						continue;

					List<Constant> list = new ArrayList<>();
					for (int j = 0; j < constants.getLength(); j++) {
						Node constant = constants.item(j);

						String constantName = (String) constantNameExpression.evaluate(constant, XPathConstants.STRING);
						String type = "long";

						String bitPos = (String) constantBitposExpression.evaluate(constant, XPathConstants.STRING);
						String value = (String) constantValueExpression.evaluate(constant, XPathConstants.STRING);
						String alias = (String) constantAliasExpression.evaluate(constant, XPathConstants.STRING);

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

			} catch (Exception e) {
				throw new RuntimeException(e);
			}

		}

	}

	private static class RecordHandler implements Runnable {

		private final String filePath;

		private final XPath xPath;

		private final Document document;

		private final XPathExpression recordsExpression;

		private final XPathExpression structNameExpression;
		private final XPathExpression structMembersExpression;

		private final XPathExpression memberIsPointerExpression;
		private final XPathExpression memberNameExpression;
		private final XPathExpression memberTypeExpression;
		private final XPathExpression memberLengthExpression;

		private final Template template;

		private final String outputPath;

		private final boolean handleUnions;

		public RecordHandler(Path path, boolean handleUnions) {
			this.handleUnions = handleUnions;

			filePath = path.toString();

			xPath = XPathFactory.newInstance().newXPath();

			try (InputStream inputStream = Files.newInputStream(path)) {
				document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(inputStream);

				if (handleUnions) {
					recordsExpression = xPath.compile("/registry/types/type[@category='union' and not(@alias)]");

					outputPath = "src/main/resources/configs/vulkan/unions";

					template = FREEMARKER_CONFIG.getTemplate("VkUnionConfigTemplate.ftl");
				} else {
					recordsExpression = xPath.compile("/registry/types/type[@category='struct' and not(@alias)]");

					outputPath = "src/main/resources/configs/vulkan/structs";

					template = FREEMARKER_CONFIG.getTemplate("VkStructConfigTemplate.ftl");
				}

				structNameExpression = xPath.compile("@name");
				structMembersExpression = xPath.compile("member");

				memberIsPointerExpression = xPath.compile("text()[contains(., '*')]");
				memberNameExpression = xPath.compile("name");
				memberTypeExpression = xPath.compile("type");
				memberLengthExpression = xPath.compile("@len");
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		}

		@Override
		public void run() {

			try {
				NodeList records = (NodeList) recordsExpression.evaluate(document, XPathConstants.NODESET);

				if (records == null || records.getLength() == 0) {
					System.err.println("No %s found in %s!".formatted(handleUnions ? "unions" : "structs", filePath));
					return;
				}

				StringWriter writer = new StringWriter();

				Map<String, Object> dataModel = new HashMap<>();

				for (int i = 0; i < records.getLength(); i++) {
					Record record = createRecord(records.item(i));

					Path path = Path.of(outputPath, record.name + ".yaml");
					createDirectoryAndFile(path);

					dataModel.put("struct", record);
					writer.getBuffer().setLength(0);
					template.process(dataModel, writer);

					Files.writeString(
							path,
							writer.toString(),
							StandardOpenOption.TRUNCATE_EXISTING
					);
				}

			} catch (Exception e) {
				throw new RuntimeException(e);
			}

		}

		private Record createRecord(Node struct) {
			try {
				String recordName = (String) structNameExpression.evaluate(struct, XPathConstants.STRING);

				List<String> stringFields = new ArrayList<String>();
				List<String> structArrays = new ArrayList<String>();

				NodeList structMembers = (NodeList) structMembersExpression.evaluate(struct, XPathConstants.NODESET);
				for (int i = 0; i < structMembers.getLength(); i++) {
					Node member = structMembers.item(i);

					boolean isPointer = (boolean) memberIsPointerExpression.evaluate(member, XPathConstants.BOOLEAN);

					String name = (String) memberNameExpression.evaluate(member, XPathConstants.STRING);
					String type = (String) memberTypeExpression.evaluate(member, XPathConstants.STRING);
					String length = (String) memberLengthExpression.evaluate(member, XPathConstants.STRING);

					if (type.equals("char") && length.contains("null-terminated")) {
						stringFields.add(name);
					} else if (isPointer && !length.isBlank()) {
						structArrays.add(name);
					}
				}

				return new Record(recordName, structArrays, stringFields);
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
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

	public static enum CommandType {
		INSTANCE("VkInstance"),
		PHYSICAL_DEVICE("VkPhysicalDevice"),
		DEVICE("VkDevice"),
		QUEUE("VkQueue"),
		COMMAND_BUFFER("VkCommandBuffer"),
		BASE(null);

		public final String typeName;

		CommandType(String typeName) {
			this.typeName = typeName;
		}

		public String typeName() {
			return typeName;
		}
	}

	public static record Command(
			String name,
			CommandType commandType,
			List<String> structArrays,
			List<String> stringParameters,
			List<String> nullableParameters
	) {
	}

	public static record CommandParameter(
			String name,
			String type,
			String length,
			boolean isPointer,
			boolean isOptional
	) {

	}

	public static record Constant(
			String name,
			String value,
			String type
	) {

	}

	public static record Record(
			String name,
			List<String> structArrays,
			List<String> stringFields
	) {
	}

}
