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

import volucris.bindings.generator.config.ClassConfig.NativeFunctionDescription;

public class CallbacksConfig {

	private List<CallbackConfig> callbacks;
	
	public CallbacksConfig() {
		callbacks = new ArrayList<CallbackConfig>();
	}
	
	public static CallbacksConfig create(String path) {
		try {
			ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
			mapper.setVisibility(PropertyAccessor.ALL, Visibility.ANY);
			mapper.setPropertyNamingStrategy(PropertyNamingStrategies.KEBAB_CASE);
			mapper.setDefaultSetterInfo(JsonSetter.Value.forValueNulls(Nulls.AS_EMPTY));

			return mapper.readValue(Path.of(path).toFile(), CallbacksConfig.class);
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}
	
	public List<CallbackConfig> getCallbacks() {
		return callbacks;
	}
	
	public static class CallbackConfig {
		
		private List<String> imports;
		private List<String> staticImports;
		private List<String> structArrays;
		private List<String> stringParameters;
		
		private String name;
		private String packageName;
		private String directory;
		
		private boolean addTypedMethod;
		private boolean returnTypeIsStructArray;
		private boolean stringReturnType;
		
		public CallbackConfig() {
			imports = new ArrayList<String>();
			staticImports = new ArrayList<String>();
			structArrays = new ArrayList<String>();
			stringParameters = new ArrayList<String>();
			
			addTypedMethod = true;
		}
		
		public NativeFunctionDescription asNativeFunctionDescription() {
			NativeFunctionDescription description = new NativeFunctionDescription();
			description.getStructArrays().addAll(structArrays);
			description.getStringParameters().addAll(stringParameters);
			description.setReturnTypeIsStructArray(returnTypeIsStructArray);
			description.setStringReturnType(stringReturnType);
			return description;
		}
		
		public String getName() {
			return name;
		}
		
		public String getPackageName() {
			return packageName;
		}
		
		public String getDirectory() {
			return directory;
		}
		
		public List<String> getImports() {
			return imports;
		}
		
		public List<String> getStaticImports() {
			return staticImports;
		}
		
		public boolean addTypedMethod() {
			return addTypedMethod;
		}

		public List<String> getStructArrays() {
			return structArrays;
		}

		public List<String> getStringParameters() {
			return stringParameters;
		}
		
		public boolean returnTypeIsStructArray() {
			return returnTypeIsStructArray;
		}

		public boolean stringReturnType() {
			return stringReturnType;
		}
		
	}
	
}
