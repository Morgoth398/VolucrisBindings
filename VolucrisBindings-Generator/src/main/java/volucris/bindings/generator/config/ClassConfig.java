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

public class ClassConfig {

	private ClassDescription classDescription;

	private List<MacroNamePrefix> macroNamePrefixes;
	private List<MacroName> macroNames;

	private List<String> excludedMacroNamePrefixes;
	private List<String> excludedMacroNames;

	private List<SymbolPrefix> symbolPrefixes;
	private List<Symbol> symbols;

	private List<String> functionNamePrefixes;
	private List<String> excludedFunctionNamePrefixes;
	private List<String> functionNamePostfixes;
	private List<String> excludedFunctionNamePostfixes;

	private List<ConstructorDescription> constructors;
	private List<NativeFunctionDescription> nativeFunctions;
	private List<NativeFunctionDescription> nativeFunctionPointers;

	private List<String> imports;
	private List<String> staticImports;

	private StructDescription struct;

	private String customConstructorCode;

	private ClassConfig() {
		macroNamePrefixes = new ArrayList<>();
		macroNames = new ArrayList<>();
		excludedMacroNamePrefixes = new ArrayList<>();
		excludedMacroNames = new ArrayList<>();
		symbolPrefixes = new ArrayList<>();
		symbols = new ArrayList<>();
		functionNamePrefixes = new ArrayList<>();
		excludedFunctionNamePrefixes = new ArrayList<>();
		functionNamePostfixes = new ArrayList<>();
		excludedFunctionNamePostfixes = new ArrayList<>();
		constructors = new ArrayList<>();
		nativeFunctions = new ArrayList<>();
		nativeFunctionPointers = new ArrayList<>();
		imports = new ArrayList<>();
		staticImports = new ArrayList<>();
	}

	public static ClassConfig create(String path) {
		try {
			ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
			mapper.setVisibility(PropertyAccessor.ALL, Visibility.ANY);
			mapper.setPropertyNamingStrategy(PropertyNamingStrategies.KEBAB_CASE);
			mapper.setDefaultSetterInfo(JsonSetter.Value.forValueNulls(Nulls.AS_EMPTY));

			return mapper.readValue(Path.of(path).toFile(), ClassConfig.class);
		} catch (Exception e) {
			System.err.println("File: " + path);
			throw new RuntimeException(e.getMessage());
		}
	}

	public StructDescription getStruct() {
		return struct;
	}

	public String getCustomConstructorCode() {
		return customConstructorCode;
	}

	public ClassDescription getClassDescription() {
		return classDescription;
	}

	public List<MacroNamePrefix> getMacroNamePrefixes() {
		return macroNamePrefixes;
	}

	public List<MacroName> getMacroNames() {
		return macroNames;
	}

	public List<String> getExcludedMacroNamePrefixes() {
		return excludedMacroNamePrefixes;
	}

	public List<String> getExcludedMacroNames() {
		return excludedMacroNames;
	}

	public List<Symbol> getSymbols() {
		return symbols;
	}

	public List<SymbolPrefix> getSymbolPrefixes() {
		return symbolPrefixes;
	}

	public List<NativeFunctionDescription> getNativeFunctionPointers() {
		return nativeFunctionPointers;
	}

	public List<String> getFunctionNamePrefixes() {
		return functionNamePrefixes;
	}

	public List<String> getExcludedFunctionNamePrefixes() {
		return excludedFunctionNamePrefixes;
	}

	public List<String> getFunctionNamePostfixes() {
		return functionNamePostfixes;
	}

	public List<String> getExcludedFunctionNamePostfixes() {
		return excludedFunctionNamePostfixes;
	}

	public List<ConstructorDescription> getConstructors() {
		return constructors;
	}

	public StructDescription getStructDescription() {
		return struct;
	}

	public List<String> getImports() {
		return imports;
	}

	public List<String> getStaticImports() {
		return staticImports;
	}

	public List<NativeFunctionDescription> getNativeFunctions() {
		return nativeFunctions;
	}

	public static class ClassDescription {

		private List<String> interfaces;
		private List<String> permits;
		private List<String> additionalInstanceParameters;

		private String name;
		private String parent;
		private String packageName;
		private String directory;
		private String instanceParameter;

		private String rawMethodTemplate;
		private String typedMethodTemplate;

		private boolean isStatic;
		private boolean isSealed;
		private boolean isAbstract;
		private boolean isFinal;
		private boolean parentHasSegmentConstructor;
		private boolean staticNativeMethods;

		public ClassDescription() {
			interfaces = new ArrayList<String>();
			permits = new ArrayList<String>();

			additionalInstanceParameters = new ArrayList<String>();
		}

		public List<String> getInterfaces() {
			return interfaces;
		}

		public List<String> getPermits() {
			return permits;
		}

		public String getName() {
			return name;
		}

		public String getParent() {
			return parent;
		}

		public String getPackageName() {
			return packageName;
		}

		public String getDirectory() {
			return directory;
		}

		public String getInstanceParameter() {
			return instanceParameter;
		}

		public boolean getIsStatic() {
			return isStatic;
		}

		public void setIsStatic(boolean isStatic) {
			this.isStatic = isStatic;
		}

		public boolean getIsSealed() {
			return isSealed;
		}

		public boolean getIsAbstract() {
			return isAbstract;
		}

		public boolean getIsFinal() {
			return isFinal;
		}

		public boolean getParentHasSegmentConstructor() {
			return parentHasSegmentConstructor;
		}

		public boolean getStaticNativeMethods() {
			return staticNativeMethods;
		}

		public List<String> getAdditionalInstanceParameters() {
			return additionalInstanceParameters;
		}

		public void getMethodTemplates(NativeFunctionDescription description) {
			if (rawMethodTemplate != null && description.rawMethodTemplate == null)
				description.rawMethodTemplate = rawMethodTemplate;
			
			if (typedMethodTemplate != null && description.typedMethodTemplate == null)
				description.typedMethodTemplate = typedMethodTemplate;
		}

	}

	public static class MacroNamePrefix {

		private String prefix;
		private String type;

		public String getPrefix() {
			return prefix;
		}

		public String getType() {
			return type;
		}

	}

	public static class MacroName {

		private String name;
		private String type;

		public String getName() {
			return name;
		}

		public String getType() {
			return type;
		}

	}

	public static class Symbol {

		private String name;
		private String type;

		@SuppressWarnings("unused")
		private Symbol() {

		}

		public Symbol(String name, String type) {
			this.name = name;
			this.type = type;
		}

		public String getName() {
			return name;
		}

		public String getType() {
			return type;
		}

	}

	public static class SymbolPrefix {

		private String prefix;
		private String type;

		public String getPrefix() {
			return prefix;
		}

		public String getType() {
			return type;
		}

	}

	public static class ConstructorDescription {

		private String nativeFunction;
		private String destructor;
		private String template;

		public String getNativeFunction() {
			return nativeFunction;
		}

		public String getDestructor() {
			return destructor;
		}

		public String getTemplate() {
			return template;
		}

	}

	/**
	 * Describes a struct or an union.
	 */
	public static class StructDescription {

		private List<String> structArrays;
		private List<String> stringFields;
		private List<String> noAccessFields;

		private String name;
		private String template;

		private boolean varHandles;

		public StructDescription() {
			structArrays = new ArrayList<String>();
			stringFields = new ArrayList<String>();
			noAccessFields = new ArrayList<String>();
		}

		public boolean isValid() {
			return name != null;
		}
		
		public List<String> getStructArrays() {
			return structArrays;
		}

		public List<String> getStringFields() {
			return stringFields;
		}

		public String getName() {
			return name;
		}

		public String getTemplate() {
			return template;
		}

		public boolean isVarHandles() {
			return varHandles;
		}

		public List<String> getNoAccessFields() {
			return noAccessFields;
		}

	}

	public static class NativeFunctionDescription {

		private List<String> structArrays;
		private List<String> stringParameters;
		private List<String> nullableParameters;
		private List<String> additionalInstanceParameters;

		private String name;
		private String instanceParameter;

		private String rawMethodTemplate;
		private String typedMethodTemplate;

		private boolean isStatic;
		private boolean returnTypeIsStructArray;
		private boolean stringReturnType;
		private boolean addTypedMethod;
		private boolean isPrivate;
		private boolean isFinal;

		public NativeFunctionDescription() {
			structArrays = new ArrayList<String>();
			stringParameters = new ArrayList<String>();
			nullableParameters = new ArrayList<String>();

			additionalInstanceParameters = new ArrayList<String>();

			addTypedMethod = true;
			isFinal = true;
		}

		public List<String> getStructArrays() {
			return structArrays;
		}

		public List<String> getStringParameters() {
			return stringParameters;
		}

		public List<String> getNullableParameters() {
			return nullableParameters;
		}

		public String getName() {
			return name;
		}

		public boolean isStatic() {
			return isStatic;
		}

		public void setIsStatic(boolean isStatic) {
			this.isStatic = isStatic;
		}

		public void setReturnTypeIsStructArray(boolean value) {
			returnTypeIsStructArray = value;
		}

		public boolean returnTypeIsStructArray() {
			return returnTypeIsStructArray;
		}

		public void setStringReturnType(boolean value) {
			stringReturnType = value;
		}

		public boolean stringReturnType() {
			return stringReturnType;
		}

		public boolean getAddTypedMethod() {
			return addTypedMethod;
		}

		public void setTypedMethod(boolean value) {
			addTypedMethod = value;
		}

		public String getInstanceParameter() {
			return instanceParameter;
		}

		public void setInstanceParameter(String instanceParameter) {
			this.instanceParameter = instanceParameter;
		}

		public void setPrivate(boolean isPrivate) {
			this.isPrivate = isPrivate;
		}

		public boolean isPrivate() {
			return isPrivate;
		}

		public boolean isFinal() {
			return isFinal;
		}

		public void setAdditionalInstanceParameters(List<String> list) {
			additionalInstanceParameters.addAll(list);
		}

		public List<String> getAdditionalInstanceParameters() {
			return additionalInstanceParameters;
		}

		public String getRawMethodTemplate() {
			return rawMethodTemplate;
		}

		public void setRawMethodTemplate(String rawMethodTemplate) {
			this.rawMethodTemplate = rawMethodTemplate;
		}

		public String getTypedMethodTemplate() {
			return typedMethodTemplate;
		}

	}

}
