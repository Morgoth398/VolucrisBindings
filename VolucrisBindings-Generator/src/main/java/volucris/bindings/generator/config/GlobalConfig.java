package volucris.bindings.generator.config;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

public class GlobalConfig {

	private Naming naming;
	
	public static GlobalConfig create(String path) {
		try {
			ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
			mapper.setVisibility(PropertyAccessor.ALL, Visibility.ANY);
			mapper.setPropertyNamingStrategy(PropertyNamingStrategies.KEBAB_CASE);
			mapper.setDefaultSetterInfo(JsonSetter.Value.forValueNulls(Nulls.AS_EMPTY));

			return mapper.readValue(Path.of(path).toFile(), GlobalConfig.class);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public Naming getNaming() {
		return naming;
	}

	public static class Naming {
		
		private ArrayList<String> stripPrefixes;
		private ArrayList<String> stripPostfixes;

		private LinkedHashMap<String, String> typeRenames;
		
		public Naming() {
			stripPrefixes = new ArrayList<String>();
			stripPostfixes = new ArrayList<String>();
			
			typeRenames = new LinkedHashMap<String, String>();
		}
		
		public ArrayList<String> getStripPrefixes() {
			return stripPrefixes;
		}

		public ArrayList<String> getStripPostfixes() {
			return stripPostfixes;
		}
		
		public HashMap<String, String> getTypeRenames() {
			return typeRenames;
		}
		
	}
}
