package volucris.bindings.generator.config;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

public class EnumsConfig {

	private List<EnumConfig> configs;

	private String packageName;
	private String directory;

	private boolean generateAll;
	private boolean transformConstantsNames;

	public EnumsConfig() {
		configs = new ArrayList<EnumConfig>();
		
		transformConstantsNames = true;
	}

	public static EnumsConfig create(String path) {
		try {
			ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
			mapper.setVisibility(PropertyAccessor.ALL, Visibility.ANY);
			mapper.setPropertyNamingStrategy(PropertyNamingStrategies.KEBAB_CASE);
			mapper.setDefaultSetterInfo(JsonSetter.Value.forValueNulls(Nulls.AS_EMPTY));

			return mapper.readValue(Path.of(path).toFile(), EnumsConfig.class);
		} catch (Exception e) {
			System.err.println("File: " + path);
			throw new RuntimeException(e.getMessage());
		}
	}
	
	public List<EnumConfig> getConfigs() {
		return configs;
	}

	public String getPackageName() {
		return packageName;
	}

	public String getDirectory() {
		return directory;
	}

	public boolean generateAll() {
		return generateAll;
	}

	public boolean transformConstantsNames() {
		return transformConstantsNames;
	}

	public static class EnumConfig {

		private String name;
		private String packageName;
		private String directory;

		private boolean transformConstantsNames;
		
		public String getName() {
			return name;
		}

		public String getPackageName() {
			return packageName;
		}

		public String getDirectory() {
			return directory;
		}

		public boolean transformConstantsNames() {
			return transformConstantsNames;
		}
		
	}
}
