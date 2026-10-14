package volucris.bindings.generator.generation;

import java.io.IOException;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ParseResult;
import com.github.javaparser.ParserConfiguration.LanguageLevel;
import com.github.javaparser.ast.CompilationUnit;

import org.jspecify.annotations.Nullable;
import freemarker.template.Configuration;
import freemarker.template.Template;
import volucris.bindings.generator.config.CallbacksConfig;
import volucris.bindings.generator.config.ClassConfig;
import volucris.bindings.generator.config.EnumsConfig;
import volucris.bindings.generator.config.GlobalConfig;
import volucris.bindings.generator.config.CallbacksConfig.CallbackConfig;
import volucris.bindings.generator.config.ClassConfig.ConstructorDescription;
import volucris.bindings.generator.config.ClassConfig.MacroName;
import volucris.bindings.generator.config.ClassConfig.MacroNamePrefix;
import volucris.bindings.generator.config.ClassConfig.NativeFunctionDescription;
import volucris.bindings.generator.config.ClassConfig.StructDescription;
import volucris.bindings.generator.config.ClassConfig.Symbol;
import volucris.bindings.generator.config.ClassConfig.SymbolPrefix;
import volucris.bindings.generator.config.EnumsConfig.EnumConfig;
import volucris.bindings.generator.generation.constructors.MemorySegmentConstructor;
import volucris.bindings.generator.generation.constructors.PrivateConstructor;
import volucris.bindings.generator.generation.fields.FunctionField;
import volucris.bindings.generator.generation.fields.MemorySegmentField;
import volucris.bindings.generator.generation.fields.SymbolField;
import volucris.bindings.generator.generation.fields.macro.MacroDoubleField;
import volucris.bindings.generator.generation.fields.macro.MacroFloatField;
import volucris.bindings.generator.generation.fields.macro.MacroIntField;
import volucris.bindings.generator.generation.fields.macro.MacroLongField;
import volucris.bindings.generator.generation.fields.macro.MacroStringField;
import volucris.bindings.generator.generation.methods.FunctionLoadingBuilder;
import volucris.bindings.generator.generation.methods.MemorySegmentMethod;
import volucris.bindings.generator.generation.methods.NativeFunctionMethodsBuilder;
import volucris.bindings.generator.generation.methods.SymbolMethod;
import volucris.bindings.generator.generation.record.NativeRecordHandler;
import volucris.bindings.generator.parsing.AbstractNativeFunction;
import volucris.bindings.generator.parsing.HeaderFile;
import volucris.bindings.generator.parsing.NativeEnum;
import volucris.bindings.generator.parsing.NativeFunction;
import volucris.bindings.generator.parsing.NativeFunctionPointer;
import volucris.bindings.generator.parsing.NativeMacro;
import volucris.bindings.generator.parsing.NativeRecord;

public class Generator {

	private static final Template ENUM_TEMPLATE;
	private static final Template CLASS_TEMPLATE;
	private static final Template CALLBACK_TEMPLATE;
	private static final Template RAW_METHOD_TEMPLATE;
	private static final Template TYPED_METHOD_TEMPLATE;
	private static final Template SYMBOL_METHOD_TEMPLATE;
	private static final Template FUNCTION_LOADING_TEMPLATE;
	private static final Template FUNCTION_CONSTRUCTOR_TEMPLATE;
	private static final Configuration CONFIG;

	private final GlobalConfig globalConfig;

	private final HeaderFile headerFile;

	static {
		CONFIG = new Configuration(Configuration.VERSION_2_3_35);
		CONFIG.setDefaultEncoding("UTF-8");
		CONFIG.setClassForTemplateLoading(Generator.class, "/templates");

		try {
			ENUM_TEMPLATE = CONFIG.getTemplate("EnumTemplate.ftl");

			CLASS_TEMPLATE = CONFIG.getTemplate("ClassTemplate.ftl");
			CALLBACK_TEMPLATE = CONFIG.getTemplate("CallbackTemplate.ftl");

			RAW_METHOD_TEMPLATE = CONFIG.getTemplate("RawMethodTemplate.ftl");

			TYPED_METHOD_TEMPLATE = CONFIG.getTemplate("TypedMethodTemplate.ftl");

			SYMBOL_METHOD_TEMPLATE = CONFIG.getTemplate("SymbolMethodTemplate.ftl");

			FUNCTION_LOADING_TEMPLATE = CONFIG.getTemplate("FunctionLoadingTemplate.ftl");

			FUNCTION_CONSTRUCTOR_TEMPLATE = CONFIG.getTemplate("FunctionConstructorTemplate.ftl");
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}

	public Generator(String globalConfig, HeaderFile headerFile) {
		this.globalConfig = GlobalConfig.create(globalConfig);
		this.headerFile = headerFile;
	}

	/// Generates a java class from the given config file using the default class template.
	public void generate(String classConfigPath) {
		generate(classConfigPath, null, Map.of(), List.of(), List.of());
	}

	public void generate(
			String classConfigPath, @Nullable Template template, @Nullable Map<String, Object> additionalData
	) {
		generate(classConfigPath, template, additionalData, List.of(), List.of());
	}

	/// Generates the class from the given config file using the provided template
	/// and optionally additional data.
	public void generate(
			String classConfigPath,
			@Nullable Template template,
			@Nullable Map<String, Object> additionalData,
			@Nullable Collection<String> imports,
			@Nullable Collection<String> staticImports
	) {
		ClassConfig classConfig = ClassConfig.create(classConfigPath);

		boolean classHasStruct = classConfig.getStructDescription().isValid();
		boolean classHasConstructor = !classConfig.getConstructors().isEmpty();
		boolean classIsStatic = classConfig.getClassDescription().getIsStatic();

		if (classHasStruct && classHasConstructor) {
			throw new RuntimeException("Class cannot contain a struct and call a method in its constructor.");
		}

		if (classIsStatic && (classHasConstructor || classHasStruct)) {
			String m1 = "INFO: Class " + classConfig.getClassDescription().getName();
			String m2 = " has a defined constructor or contains a struct and was declared static. This is not possible and the class will be generated non-static.";
			System.out.println(m1 + m2);
			classConfig.getClassDescription().setIsStatic(false);
		}

		TopLevelClazz clazz = new TopLevelClazz(classConfig.getClassDescription(), classHasStruct);
		clazz.addImports(classConfig.getImports());
		clazz.addStaticImports(classConfig.getStaticImports());

		if (imports != null)
			clazz.addImports(imports);
		if (staticImports != null)
			clazz.addStaticImports(staticImports);

		handleMacros(clazz, classConfig);
		handleSymbols(clazz, classConfig);
		handleFunctions(clazz, classConfig);

		StructDescription structDescription = classConfig.getStructDescription();

		if (structDescription != null && structDescription.getName() != null) {
			NativeRecord nativeRecord = headerFile.getRecord(structDescription.getName());

			if (nativeRecord == null)
				throw new RuntimeException("Record not found: " + structDescription.getName());

			new NativeRecordHandler(clazz, structDescription, nativeRecord, globalConfig);
		} else {
			if (!clazz.getDescription().getIsStatic()) {
				clazz.addField(new MemorySegmentField(Modifier.PRIVATE, Modifier.FINAL));

				clazz.addConstructor(
						new MemorySegmentConstructor(
								clazz.getDescription().getName(),
								clazz.getDescription().getParentHasSegmentConstructor()
						)
				);

				clazz.addMethod(new MemorySegmentMethod());
			} else {
				clazz.addConstructor(new PrivateConstructor(clazz.getDescription().getName()));
			}
		}

		try {
			Map<String, Object> dataModel = new HashMap<String, Object>();

			if (additionalData != null)
				dataModel.putAll(additionalData);

			dataModel.put("clazz", clazz);

			StringWriter writer = new StringWriter();

			if (template != null)
				template.process(dataModel, writer);
			else
				CLASS_TEMPLATE.process(dataModel, writer);

			String output = writer.toString();

			JavaParser javaParser = new JavaParser();
			javaParser.getParserConfiguration().setLanguageLevel(LanguageLevel.JAVA_25);

			ParseResult<CompilationUnit> javaFile = javaParser.parse(output);

			if (!javaFile.isSuccessful()) {
				System.err.println("Errors for generated class " + clazz.getDescription().getName());
				javaFile.getProblems().forEach(problem -> {
					System.err.println(problem.getMessage());
				});
			}

			String className = classConfig.getClassDescription().getName();
			String outputDirectory = classConfig.getClassDescription().getDirectory();
			Path path = Path.of(outputDirectory + "/" + className + ".java");

			createDirectoryAndFile(path);

			Files.writeString(path, output);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	private void createDirectoryAndFile(Path path) {
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

	private void handleMacros(TopLevelClazz clazz, ClassConfig classConfig) {
		List<MacroNamePrefix> macroPrefixes = classConfig.getMacroNamePrefixes();
		List<MacroName> macroNames = classConfig.getMacroNames();

		List<String> excludedMacroPrefixes = classConfig.getExcludedMacroNamePrefixes();
		List<String> excludedMacroNames = classConfig.getExcludedMacroNames();

		headerFile.forEachMacro(macro -> {

			if (macro.getValue() == null || macro.getValue().isBlank())
				return;

			String name = macro.getName();

			boolean excludedByPrefix = excludedMacroPrefixes.stream().anyMatch(name::startsWith);
			boolean excludedByName = excludedMacroNames.stream().anyMatch(name::equals);

			if (excludedByPrefix || excludedByName)
				return;

			for (MacroName macroName : macroNames) {
				if (macro.getName().equals(macroName.getName())) {
					addMacroField(clazz, macroName.getType().trim(), macro);
					return;
				}
			}

			for (MacroNamePrefix prefix : macroPrefixes) {
				if (macro.getName().startsWith(prefix.getPrefix())) {
					addMacroField(clazz, prefix.getType().trim(), macro);
					return;
				}
			}
		});
	}

	private void addMacroField(TopLevelClazz clazz, String type, NativeMacro macro) {
		Modifier[] modifiers = { Modifier.PUBLIC, Modifier.STATIC, Modifier.FINAL };

		String name = GeneratorUtils.stripPrefixesAndPostfixes(globalConfig, macro.getName(), false);

		if (type.equals("int")) {
			clazz.addField(new MacroIntField(name, macro.getValue(), modifiers));
		} else if (type.equals("long")) {
			clazz.addField(new MacroLongField(name, macro.getValue(), modifiers));
		} else if (type.equals("float")) {
			clazz.addField(new MacroFloatField(name, macro.getValue(), modifiers));
		} else if (type.equals("double")) {
			clazz.addField(new MacroDoubleField(name, macro.getValue(), modifiers));
		} else if (type.equals("String")) {
			clazz.addField(new MacroStringField(name, macro.getValue(), modifiers));
		} else {
			throw new RuntimeException("Invalid macro type: " + type);
		}
	}

	private void handleSymbols(TopLevelClazz clazz, ClassConfig classConfig) {
		List<Symbol> symbols = classConfig.getSymbols();
		List<SymbolPrefix> symbolPrefixes = classConfig.getSymbolPrefixes();

		if (symbols.isEmpty() && symbolPrefixes.isEmpty())
			return;

		headerFile.forEachVariable(variable -> {
			for (SymbolPrefix prefix : symbolPrefixes) {
				if (variable.getName().startsWith(prefix.getPrefix())) {
					Symbol symbol = new Symbol(variable.getName(), prefix.getType());
					addSymbol(clazz, symbol);
					return;
				}
			}
		});

		for (Symbol symbol : symbols) {
			addSymbol(clazz, symbol);
		}
	}

	private void addSymbol(TopLevelClazz clazz, Symbol symbol) {
		String symbolName = GeneratorUtils.stripPrefixesAndPostfixes(globalConfig, symbol.getName(), false);
		String symbolType = symbol.getType();

		SymbolField field = new SymbolField(symbolName, symbolType);

		clazz.addField(field);
		clazz.getStaticBlock().addSymbolFieldInitialization(field, symbol);
		clazz.addMethod(new SymbolMethod(SYMBOL_METHOD_TEMPLATE, field, symbol, symbolName));
	}

	private void handleFunctions(TopLevelClazz clazz, ClassConfig classConfig) {
		List<NativeFunction> functions = getFunctions(classConfig);
		List<NativeFunctionPointer> functionPointers = getFunctionPointers(classConfig);

		HashMap<String, NativeFunctionDescription> functionDescriptions = new HashMap<>();
		HashMap<String, NativeFunctionDescription> functionPointerDescriptions = new HashMap<>();

		classConfig.getNativeFunctions().forEach(function -> functionDescriptions.put(function.getName(), function));
		classConfig.getNativeFunctionPointers().forEach(
				function -> functionPointerDescriptions.put(function.getName(), function)
		);

		functions.forEach(function -> {
			NativeFunctionDescription description = functionDescriptions
					.getOrDefault(function.getName(), new NativeFunctionDescription());

			handleFunction(clazz, classConfig, function, description);
		});

		functionPointers.forEach(functionPointer -> {
			NativeFunctionDescription description = functionPointerDescriptions
					.getOrDefault(functionPointer.getName(), new NativeFunctionDescription());

			handleFunction(clazz, classConfig, functionPointer, description);
		});
	}

	private List<NativeFunction> getFunctions(ClassConfig classConfig) {
		List<String> functionPrefixes = classConfig.getFunctionNamePrefixes();
		List<String> functionPostfixes = classConfig.getFunctionNamePostfixes();

		List<String> excludedFunctionPrefixes = classConfig.getExcludedFunctionNamePrefixes();
		List<String> excludedFunctionPostfixes = classConfig.getExcludedFunctionNamePostfixes();

		HashSet<String> requestedFunctions = new HashSet<String>();
		classConfig.getNativeFunctions().forEach(function -> requestedFunctions.add(function.getName()));

		List<NativeFunction> functions = headerFile.getFunctions(function -> {
			String functionName = function.getName();

			if (requestedFunctions.contains(functionName))
				return true;

			boolean includedByPrefix = functionPrefixes.stream().anyMatch(functionName::startsWith);
			boolean includedByPostfix = functionPostfixes.stream().anyMatch(functionName::endsWith);

			boolean excludedByPrefix = excludedFunctionPrefixes.stream().anyMatch(functionName::startsWith);
			boolean excludedByPostfix = excludedFunctionPostfixes.stream().anyMatch(functionName::endsWith);

			return (includedByPrefix || includedByPostfix) && !(excludedByPrefix || excludedByPostfix);
		});

		functions.forEach(function -> {
			if (function.isInlined())
				System.out.println("WARNING: Function " + function.getName() + " is inlined.");
		});

		return functions;
	}

	private List<NativeFunctionPointer> getFunctionPointers(ClassConfig classConfig) {
		List<String> functionPrefixes = classConfig.getFunctionNamePrefixes();
		List<String> functionPostfixes = classConfig.getFunctionNamePostfixes();

		List<String> excludedFunctionPrefixes = classConfig.getExcludedFunctionNamePrefixes();
		List<String> excludedFunctionPostfixes = classConfig.getExcludedFunctionNamePostfixes();

		HashSet<String> requestedFunctions = new HashSet<String>();
		classConfig.getNativeFunctionPointers().forEach(function -> requestedFunctions.add(function.getName()));

		List<NativeFunctionPointer> functions = headerFile.getFunctionPointers(functionPointer -> {
			String functionName = functionPointer.getName();

			if (requestedFunctions.contains(functionName))
				return true;

			boolean includedByPrefix = functionPrefixes.stream().anyMatch(functionName::startsWith);
			boolean includedByPostfix = functionPostfixes.stream().anyMatch(functionName::endsWith);

			boolean excludedByPrefix = excludedFunctionPrefixes.stream().anyMatch(functionName::startsWith);
			boolean excludedByPostfix = excludedFunctionPostfixes.stream().anyMatch(functionName::endsWith);

			return (includedByPrefix || includedByPostfix) && !(excludedByPrefix || excludedByPostfix);
		});

		return functions;
	}

	private void handleFunction(
			TopLevelClazz clazz,
			ClassConfig classConfig,
			AbstractNativeFunction nativeFunction,
			NativeFunctionDescription functionDescription
	) {

		// If a function was not specified as static but the class specifies all
		// functions to be static or itself is static, the functions will be converted
		// to be static. If a functions is specified as static, it will never be
		// changed.
		if (!functionDescription.isStatic()) {
			boolean check1 = classConfig.getClassDescription().getStaticNativeMethods();
			boolean check2 = classConfig.getClassDescription().getIsStatic();

			if (check1 || check2)
				functionDescription.setIsStatic(true);
		}

		// Adds the on class level specified instance parameters to the class
		// description for easier use.
		functionDescription.setInstanceParameter(clazz.getDescription().getInstanceParameter());
		functionDescription.setAdditionalInstanceParameters(clazz.getDescription().getAdditionalInstanceParameters());

		// If the function itself does not have a custom template, set the templates
		// that were specified for the entire class to the function.
		classConfig.getClassDescription().getMethodTemplates(functionDescription);

		// Search if the function is specified as a constructor.
		ConstructorDescription constructorDescription = classConfig.getConstructors().stream().filter(c -> {
			return c.getNativeFunction().equals(nativeFunction.getName());
		}).findFirst().orElse(null);

		// Search if the function is specified as a destructor.
		boolean destructorMethod = classConfig.getConstructors().stream().anyMatch(c -> {
			return c.getDestructor().equals(nativeFunction.getName());
		});

		// Disable typed methods for functions that are specified as a destructor.
		if (functionDescription.getAddTypedMethod())
			functionDescription.setTypedMethod(!destructorMethod);

		FunctionField field = new FunctionField(nativeFunction);
		clazz.addField(field);

		FunctionLoadingBuilder functionLoadingBuilder = new FunctionLoadingBuilder(
				globalConfig, field, nativeFunction, false
		);

		clazz.getStaticBlock().addFunctionLoading(functionLoadingBuilder.getFunctionLoading(FUNCTION_LOADING_TEMPLATE));
		clazz.addStaticImports(functionLoadingBuilder.getRequiredStaticImports());

		NativeFunctionMethodsBuilder methodsBuilder = new NativeFunctionMethodsBuilder(
				globalConfig, field, nativeFunction, functionDescription, constructorDescription != null
		);

		try {
			Template rawMethodTemplate = functionDescription.getRawMethodTemplate() != null
					? CONFIG.getTemplate(functionDescription.getRawMethodTemplate())
					: RAW_METHOD_TEMPLATE;

			Template typedMethodTemplate = functionDescription.getTypedMethodTemplate() != null
					? CONFIG.getTemplate(functionDescription.getTypedMethodTemplate())
					: TYPED_METHOD_TEMPLATE;

			clazz.addMethods(methodsBuilder.getMethods(rawMethodTemplate, typedMethodTemplate));
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

		if (constructorDescription != null) {

			String destructor = constructorDescription.getDestructor();
			if (destructor == null || destructor.isBlank())
				throw new RuntimeException("Constructor function needs a destructor function method!");

			try {
				Template constructorTemplate = constructorDescription.getTemplate() != null
						? CONFIG.getTemplate(constructorDescription.getTemplate())
						: FUNCTION_CONSTRUCTOR_TEMPLATE;

				clazz.addConstructor(
						methodsBuilder.asConstructor(
								clazz.getDescription().getName(),
								destructor,
								constructorTemplate,
								clazz.getDescription().getParentHasSegmentConstructor()
						)
				);
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		}
	}

	public void generateCallbacks(String callbacksConfigPath) {
		generateCallbacks(callbacksConfigPath, Map.of());
	}

	/// Generates all callbacks specified in the config.
	/// 
	/// If a function pointer is defined/ stored in a struct, it can be passed with the given map to this function.
	public void generateCallbacks(
			String callbacksConfigPath, @Nullable Map<String, NativeFunctionPointer> functionPointers
	) {
		CallbacksConfig callbacksConfig = CallbacksConfig.create(callbacksConfigPath);

		for (CallbackConfig callbackConfig : callbacksConfig.getCallbacks()) {
			try {
				NativeFunctionPointer functionPointer = headerFile.getFunctionPointer(callbackConfig.getName());

				if (functionPointer == null)
					functionPointer = functionPointers.get(callbackConfig.getName());

				if (functionPointer == null) {
					System.err.println("Function Pointer not found: " + callbackConfig.getName());
					continue;
				}

				CallbackBuilder callbackBuilder = new CallbackBuilder(globalConfig, callbackConfig, functionPointer);

				String output = callbackBuilder.build(CALLBACK_TEMPLATE);

				String className = GeneratorUtils.transformName(globalConfig, callbackConfig.getName(), false);

				JavaParser javaParser = new JavaParser();
				javaParser.getParserConfiguration().setLanguageLevel(LanguageLevel.JAVA_25);

				ParseResult<CompilationUnit> javaFile = javaParser.parse(output);

				if (!javaFile.isSuccessful()) {
					System.err.println("Errors for generated callback " + className);
					javaFile.getProblems().forEach(problem -> {
						System.err.println(problem.getMessage());
					});
				}

				String outputDirectory = callbackConfig.getDirectory();
				Path path = Path.of(outputDirectory + "/" + className + ".java");

				createDirectoryAndFile(path);

				Files.writeString(path, output);
			} catch (Exception e) {
				e.printStackTrace();
				continue;
			}
		}
	}

	public void generateEnums(String enumConfigPath) {
		EnumsConfig config = EnumsConfig.create(enumConfigPath);

		if (config.generateAll()) {
			List<NativeEnum> enums = headerFile.getEnums();

			for (NativeEnum nativeEnum : enums) {
				EnumBuilder enumBuilder = new EnumBuilder(
						globalConfig, nativeEnum, config.getPackageName(), config.transformConstantsNames()
				);

				String output = enumBuilder.build(ENUM_TEMPLATE);

				try {
					String outputDirectory = config.getDirectory();
					Path path = Path.of(outputDirectory + "/" + enumBuilder.getClassName() + ".java");

					createDirectoryAndFile(path);
					Files.writeString(path, output);
				} catch (Exception e) {
					throw new RuntimeException(e);
				}
			}
		} else {
			List<EnumConfig> configs = config.getConfigs();

			for (EnumConfig enumConfig : configs) {
				NativeEnum nativeEnum = headerFile.getEnum(enumConfig.getName());

				EnumBuilder enumBuilder = new EnumBuilder(
						globalConfig, nativeEnum, enumConfig.getPackageName(), enumConfig.transformConstantsNames()
				);

				String output = enumBuilder.build(ENUM_TEMPLATE);

				try {
					String outputDirectory = enumConfig.getDirectory();
					Path path = Path.of(outputDirectory + "/" + enumBuilder.getClassName() + ".java");

					createDirectoryAndFile(path);
					Files.writeString(path, output);
				} catch (Exception e) {
					e.printStackTrace();
					continue;
				}
			}
		}
	}

	public Template getTemplate(String name) {
		try {
			return CONFIG.getTemplate(name);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public GlobalConfig getGlobalConfig() {
		return globalConfig;
	}

}
