package generation;

import java.io.IOException;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import freemarker.template.Configuration;
import freemarker.template.Template;
import volucris.bindings.fastNoise2.FastNoise2;
import volucris.bindings.fastNoise2.FastNoise2Loader;
import volucris.bindings.generator.generation.Generator;

public class MetadataGeneration {

	public static void main(String[] args) throws Exception {

		FastNoise2Loader.loadNativeLibrary();

		Configuration config = new Configuration(Configuration.VERSION_2_3_34);
		config.setDefaultEncoding("UTF-8");
		config.setClassForTemplateLoading(Generator.class, "/templates");

		Template template = config.getTemplate("MetadataTemplate.ftl");

		StringWriter stringWriter = new StringWriter();

		ArrayList<Variable> variables = new ArrayList<>();
		ArrayList<Enum> enums = new ArrayList<>();

		
		
		int metadataCount = FastNoise2.getMetadataCount();
		for (int i = 0; i < metadataCount; i++) {
			variables.clear();

			String metadataName = FastNoise2.getMetadataName(i);

			int variableCount = FastNoise2.getMetadataVariableCount(i);
			for (int j = 0; j < variableCount; j++) {
				enums.clear();

				String variableName = transformName(FastNoise2.getMetadataVariableName(i, j).replace(' ', '_'));

				int variableType = FastNoise2.getMetadataVariableType(i, j);

				int enumCount = FastNoise2.getMetadataEnumCount(i, j);
				for (int e = 0; e < enumCount; e++) {
					String enumName = FastNoise2.getMetadataEnumName(i, j, e);

					enums.add(new Enum(transformName(enumName.replace(' ', '_')), e));
				}

				if (variables.stream().anyMatch(v -> v.name.equals(variableName))) {
					variables.add(new Variable(variableName + "_" + j, j, variableType, List.copyOf(enums)));
				} else {
					variables.add(new Variable(variableName, j, variableType, List.copyOf(enums)));
				}
			}

			int hybridCount = FastNoise2.getMetadataHybridCount(i);
			for (int j = 0; j < hybridCount; j++) {
				String hybridName = transformName(FastNoise2.getMetadataHybridName(i, j).replace(' ', '_'));

				if (variables.stream().anyMatch(v -> v.name.equals(hybridName))) {
					variables.add(new Variable(hybridName + "_" + j, j, 3, List.of()));
				} else {
					variables.add(new Variable(hybridName, j, 3, List.of()));
				}
			}

			int nodeLookupCount = FastNoise2.getMetadataNodeLookupCount(i);
			for (int j = 0; j < nodeLookupCount; j++) {
				String nodeLookupName = transformName(FastNoise2.getMetadataNodeLookupName(i, j).replace(' ', '_'));

				if (variables.stream().anyMatch(v -> v.name.equals(nodeLookupName))) {
					variables.add(new Variable(nodeLookupName + "_" + j, j, 4, List.of()));
				} else {
					variables.add(new Variable(nodeLookupName, j, 4, List.of()));
				}
			}

			HashMap<String, Object> dataModel = new HashMap<>();
			dataModel.put("name", metadataName);
			dataModel.put("variables", variables);
			dataModel.put("index", i);

			stringWriter.getBuffer().setLength(0);
			template.process(dataModel, stringWriter);

			Path path = Path.of("src/main/java/volucris/bindings/fastNoise2/metadata", metadataName + ".java");
			createDirectoryAndFile(path);

			Files.writeString(
					path,
					stringWriter.toString(),
					StandardOpenOption.TRUNCATE_EXISTING
			);
		}
	}

	private static String transformName(String name) {
		return name.replaceAll("([\\p{Ll}\\p{Nd}])(\\p{Lu})", "$1_$2").toUpperCase();
	}

	private static void createDirectoryAndFile(Path path) {
		if (Files.exists(path))
			return;
		try {
			if (path.toString().contains(".")) {
				Path parent = path.getParent();
				if (parent != null)
					Files.createDirectories(path.getParent());
				Files.createFile(path);
			} else {
				Files.createDirectories(path);
			}
		} catch (IOException e) {
		}
	}

	public static record Enum(String name, int value) {
	}

	public static record Variable(String name, int index, int type, List<Enum> enums) {

	}

}
