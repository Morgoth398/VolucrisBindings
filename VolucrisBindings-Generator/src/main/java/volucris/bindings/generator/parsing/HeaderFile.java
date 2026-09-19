package volucris.bindings.generator.parsing;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

import org.lwjgl.PointerBuffer;
import org.lwjgl.llvm.CXCursor;
import org.lwjgl.llvm.CXCursorVisitor;
import org.lwjgl.llvm.CXString;
import org.lwjgl.llvm.CXType;
import org.lwjgl.llvm.ClangIndex;
import org.lwjgl.system.MemoryStack;

import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeLibraryLoader;

public class HeaderFile {

	private Map<String, NativeEnum> enums;
	private Map<String, NativeMacro> macros;
	private Map<String, NativeRecord> records;
	private Map<String, NativeFunction> functions;
	private Map<String, NativeVariable> variables;
	private Map<String, NativeFunctionPointer> functionPointers;

	static {
		NativeLibraryLoader.loadLibrary("natives/clang", "clang");
	}

	public HeaderFile(String headerFile, String... commandLineArguments) {
		this(headerFile, true, commandLineArguments);
	}

	public HeaderFile(String headerFile, boolean reportPlatformSpecificity, String... commandLineArguments) {
		this(headerFile, reportPlatformSpecificity, 0, commandLineArguments);
	}

	public HeaderFile(String headerFile, int options, String... commandLineArguments) {
		this(headerFile, true, options, commandLineArguments);
	}

	public HeaderFile(
			String headerFile, boolean reportPlatformSpecificity, int options, String... commandLineArguments
	) {
		enums = new LinkedHashMap<String, NativeEnum>();
		macros = new LinkedHashMap<String, NativeMacro>();
		records = new LinkedHashMap<String, NativeRecord>();
		functions = new LinkedHashMap<String, NativeFunction>();
		variables = new LinkedHashMap<String, NativeVariable>();
		functionPointers = new LinkedHashMap<String, NativeFunctionPointer>();

		try (MemoryStack stack = MemoryStack.stackPush()) {

			long index = ClangIndex.clang_createIndex(false, false);

			PointerBuffer arguments = stack.callocPointer(commandLineArguments.length);
			for (int i = 0; i < commandLineArguments.length; i++)
				arguments.put(i, stack.UTF8(commandLineArguments[i]));

			PointerBuffer out = stack.callocPointer(1);

			int error = ClangIndex.clang_parseTranslationUnit2(index, headerFile, arguments, null, options, out);

			if (error != 0) {
				ClangIndex.clang_disposeIndex(index);
				throw new RuntimeException("Cannot parse header file. Error: " + error);
			}

			long translationUnit = out.get(0);

			CXString cxString = CXString.calloc(stack);
			int diagnostics = ClangIndex.clang_getNumDiagnostics(out.get(0));
			for (int i = 0; i < diagnostics; i++) {
				long diagnostic = ClangIndex.clang_getDiagnostic(out.get(0), i);
				ClangIndex.clang_formatDiagnostic(
						diagnostic, ClangIndex.clang_defaultDiagnosticDisplayOptions(),
						cxString
				);
				System.err.println(ClangIndex.clang_getCString(cxString));
				ClangIndex.clang_disposeDiagnostic(diagnostic);
			}

			CXType typeResult = CXType.calloc(stack);
			CXCursor cursorResult = CXCursor.calloc(stack);

			CXCursorVisitor visitor = new CXCursorVisitor() {
				@Override
				public int invoke(CXCursor cursor, CXCursor parent, long client_data) {
					int cursorKind = ClangIndex.clang_getCursorKind(cursor);

					ClangIndex.clang_getCursorSpelling(cursor, cxString);
					String name = ClangIndex.clang_getCString(cxString);

					if (cursorKind == ClangIndex.CXCursor_FunctionDecl) {
						functions.put(name, new NativeFunction(cursor, name, reportPlatformSpecificity));
					} else if (cursorKind == ClangIndex.CXCursor_StructDecl) {
						records.put(name, new NativeRecord(cursor, name, false, reportPlatformSpecificity));
					} else if (cursorKind == ClangIndex.CXCursor_UnionDecl) {
						records.put(name, new NativeRecord(cursor, name, true, reportPlatformSpecificity));
					} else if (cursorKind == ClangIndex.CXCursor_EnumDecl) {
						enums.put(name, new NativeEnum(cursor, name));
					} else if (cursorKind == ClangIndex.CXCursor_VarDecl) {
						if (ParsingUtils.isFunctionPointer(cursor, cursorResult, typeResult)) {
							functionPointers.put(
									name,
									new NativeFunctionPointer(typeResult, cursorResult, name, reportPlatformSpecificity)
							);
						} else {
							variables.put(name, new NativeVariable(name));
						}
					} else if (cursorKind == ClangIndex.CXCursor_TypedefDecl) {
						if (ParsingUtils.isFunctionPointer(cursor, cursorResult, typeResult)) {
							functionPointers.put(
									name,
									new NativeFunctionPointer(typeResult, cursorResult, name, reportPlatformSpecificity)
							);
						}
					} else if (cursorKind == ClangIndex.CXCursor_MacroDefinition) {
						if (!ClangIndex.clang_Cursor_isMacroFunctionLike(cursor))
							macros.put(name, new NativeMacro(name, cursor, translationUnit));
					}
					return ClangIndex.CXChildVisit_Continue;
				}
			};

			CXCursor cursor = CXCursor.calloc(stack);

			ClangIndex.clang_getTranslationUnitCursor(translationUnit, cursor);
			ClangIndex.clang_visitChildren(cursor, visitor, 0);
			ClangIndex.clang_disposeTranslationUnit(translationUnit);
			ClangIndex.clang_disposeIndex(index);

			visitor.free();
		}
	}

	public int getFunctionCount() {
		return functions.size();
	}

	public void printFunctions() {
		functions.forEach((_, function) -> System.out.println(function));
	}

	public void printFunctions(Predicate<NativeFunction> predicate) {
		functions.entrySet()
				.stream()
				.filter(f -> predicate.test(f.getValue()))
				.map(Map.Entry::getValue)
				.forEach(System.out::println);
	}

	public NativeFunction getFunction(String name) {
		return functions.get(name);
	}

	public List<NativeFunction> getFunctions(Predicate<NativeFunction> predicate) {
		return functions.entrySet()
				.stream()
				.filter(f -> predicate.test(f.getValue()))
				.map(Map.Entry::getValue)
				.toList();
	}

	public List<NativeFunction> getFunctions(List<String> names) {
		return functions.entrySet()
				.stream()
				.filter(f -> names.contains(f.getValue().getName()))
				.map(Map.Entry::getValue)
				.toList();
	}

	public void forEachFunction(Consumer<NativeFunction> consumer) {
		functions.entrySet()
				.stream()
				.map(Map.Entry::getValue)
				.forEach(consumer);
	}

	public int getFunctionPointerCount() {
		return functionPointers.size();
	}

	public void printFunctionPointers() {
		functionPointers.forEach((_, function) -> System.out.println(function));
	}

	public void printFunctionPointers(Predicate<NativeFunctionPointer> predicate) {
		functionPointers.entrySet()
				.stream()
				.filter(f -> predicate.test(f.getValue()))
				.map(Map.Entry::getValue)
				.forEach(System.out::println);
	}

	public NativeFunctionPointer getFunctionPointer(String name) {
		return functionPointers.get(name);
	}

	public List<NativeFunctionPointer> getFunctionPointers(Predicate<NativeFunctionPointer> predicate) {
		return functionPointers.entrySet()
				.stream()
				.filter(f -> predicate.test(f.getValue()))
				.map(Map.Entry::getValue)
				.toList();
	}

	public List<NativeFunctionPointer> getFunctionPointers(List<String> names) {
		return functionPointers.entrySet()
				.stream()
				.filter(f -> names.contains(f.getValue().getName()))
				.map(Map.Entry::getValue)
				.toList();
	}

	public int getRecordCount() {
		return records.size();
	}

	public void printRecords() {
		records.forEach((_, record) -> System.out.println(record));
	}

	public void printRecords(Predicate<NativeRecord> predicate) {
		records.entrySet()
				.stream()
				.filter(s -> predicate.test(s.getValue()))
				.map(Map.Entry::getValue)
				.forEach(System.out::println);
	}

	public @Nullable NativeRecord getRecord(String name) {
		return records.get(name);
	}

	public void forEachRecord(Consumer<NativeRecord> consumer) {
		records.forEach((_, record) -> consumer.accept(record));
	}

	public List<NativeRecord> getRecords(Predicate<NativeRecord> predicate) {
		return records.entrySet()
				.stream()
				.filter(s -> predicate.test(s.getValue()))
				.map(Map.Entry::getValue)
				.toList();
	}

	public List<NativeRecord> getRecords(List<String> names) {
		return records.entrySet()
				.stream()
				.filter(s -> names.contains(s.getValue().getName()))
				.map(Map.Entry::getValue)
				.toList();
	}

	public int getEnumCount() {
		return enums.size();
	}

	public void printEnums() {
		enums.forEach((_, enumeration) -> System.out.println(enumeration));
	}

	public void printEnums(Predicate<NativeEnum> predicate) {
		enums.entrySet()
				.stream()
				.filter(e -> predicate.test(e.getValue()))
				.map(Map.Entry::getValue)
				.forEach(System.out::println);
	}

	public NativeEnum getEnum(String name) {
		return enums.get(name);
	}

	public List<NativeEnum> getEnums() {
		return enums.entrySet().stream().map(Map.Entry::getValue).toList();
	}

	public List<NativeEnum> getEnums(Predicate<NativeEnum> predicate) {
		return enums.entrySet()
				.stream()
				.filter(e -> predicate.test(e.getValue()))
				.map(Map.Entry::getValue)
				.toList();
	}

	public List<NativeEnum> getEnums(List<String> names) {
		return enums.entrySet()
				.stream()
				.filter(f -> names.contains(f.getValue().getName()))
				.map(Map.Entry::getValue)
				.toList();
	}

	public int getMacroCount() {
		return macros.size();
	}

	public void printMacros() {
		macros.forEach((_, macro) -> System.out.println(macro));
	}

	public void printMacros(Predicate<NativeMacro> predicate) {
		macros.entrySet()
				.stream()
				.filter(e -> predicate.test(e.getValue()))
				.map(Map.Entry::getValue)
				.forEach(System.out::println);
	}

	public NativeMacro getMacro(String name) {
		return macros.get(name);
	}

	public List<NativeMacro> getMacros(Predicate<NativeMacro> predicate) {
		return macros.entrySet()
				.stream()
				.filter(e -> predicate.test(e.getValue()))
				.map(Map.Entry::getValue)
				.toList();
	}

	public List<NativeMacro> getMacros(List<String> names) {
		return macros.entrySet()
				.stream()
				.filter(f -> names.contains(f.getValue().getName()))
				.map(Map.Entry::getValue)
				.toList();
	}

	public void forEachMacro(Consumer<NativeMacro> consumer) {
		macros.entrySet()
				.stream()
				.map(Map.Entry::getValue)
				.forEach(consumer);
	}

	public int getVariableCount() {
		return variables.size();
	}

	public void printVariables() {
		variables.forEach((_, variable) -> System.out.println(variable));
	}

	public void printVariables(Predicate<NativeVariable> predicate) {
		variables.entrySet()
				.stream()
				.filter(e -> predicate.test(e.getValue()))
				.map(Map.Entry::getValue)
				.forEach(System.out::println);
	}

	public NativeVariable getVariable(String name) {
		return variables.get(name);
	}

	public List<NativeVariable> getVariables(Predicate<NativeVariable> predicate) {
		return variables.entrySet()
				.stream()
				.filter(e -> predicate.test(e.getValue()))
				.map(Map.Entry::getValue)
				.toList();
	}

	public List<NativeVariable> getVariables(List<String> names) {
		return variables.entrySet()
				.stream()
				.filter(f -> names.contains(f.getValue().getName()))
				.map(Map.Entry::getValue)
				.toList();
	}

	public void forEachVariable(Consumer<NativeVariable> consumer) {
		variables.entrySet()
				.stream()
				.map(Map.Entry::getValue)
				.forEach(consumer);
	}

}
