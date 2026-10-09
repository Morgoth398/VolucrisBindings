package volucris.bindings.generator.parsing;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

import org.jspecify.annotations.Nullable;

import volucris.bindings.core.NativeLibraryLoader;
import volucris.bindings.core.NativePointerArray;
import volucris.bindings.libclang.CXCursorVisitor;
import volucris.bindings.libclang.CXTranslationUnit;
import volucris.bindings.libclang.ClangIndex;
import volucris.bindings.libclang.enums.CXChildVisitResult;
import volucris.bindings.libclang.enums.CXCursorKind;
import volucris.bindings.libclang.enums.CXErrorCode;
import volucris.bindings.libclang.structs.CXCursor;
import volucris.bindings.libclang.structs.CXString;
import volucris.bindings.libclang.structs.CXType;

public class HeaderFile {

	private final Map<String, NativeEnum> enums;
	private final Map<String, NativeMacro> macros;
	private final Map<String, NativeRecord> records;
	private final Map<String, NativeFunction> functions;
	private final Map<String, NativeVariable> variables;
	private final Map<String, NativeFunctionPointer> functionPointers;

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

		try (Arena arena = Arena.ofConfined()) {
			MemorySegment index = ClangIndex.clang_createIndex(0, 0);

			NativePointerArray arguments = new NativePointerArray(arena, commandLineArguments.length)
					.setStrings(arena, 0, List.of(commandLineArguments));

			NativePointerArray out = new NativePointerArray(arena, 1);

			int error = ClangIndex.clang_parseTranslationUnit2(
					index, headerFile, arguments, commandLineArguments.length, null, 0, options, out
			);

			if (error != CXErrorCode.CX_ERROR_SUCCESS) {
				try {
					if (error == CXErrorCode.CX_ERROR_AST_READ_ERROR) {
						throw new RuntimeException("Cannot parse header file. An AST Read Error occured.");
					} else if (error == CXErrorCode.CX_ERROR_CRASHED) {
						throw new RuntimeException("Cannot parse header file. A crash occured.");
					} else if (error == CXErrorCode.CX_ERROR_FAILURE) {
						throw new RuntimeException("Cannot parse header file. No further details are available.");
					} else if (error == CXErrorCode.CX_ERROR_INVALID_ARGUMENTS) {
						throw new RuntimeException("Cannot parse header file. Invalid arguments.");
					}
				} finally {
					ClangIndex.clang_disposeIndex(index);
				}
			}

			CXTranslationUnit translationUnit = new CXTranslationUnit(out.get(0));

			int numDiagnostics = ClangIndex.clang_getNumDiagnostics(translationUnit);
			for (int i = 0; i < numDiagnostics; i++) {
				MemorySegment diagnostic = ClangIndex.clang_getDiagnostic(out.get(0), i);

				CXString cxString = ClangIndex.clang_formatDiagnostic(
						arena,
						diagnostic,
						ClangIndex.clang_defaultDiagnosticDisplayOptions()
				);

				System.err.println(ClangIndex.clang_getCString(cxString));

				ClangIndex.clang_disposeString(cxString);
				ClangIndex.clang_disposeDiagnostic(diagnostic);
			}

			CXCursorVisitor visitor = new CXCursorVisitor(arena) {
				@Override
				public int invoke(CXCursor cursor, CXCursor parent, MemorySegment client_data) {
					try (Arena arena = Arena.ofConfined()) {
						int cursorKind = ClangIndex.clang_getCursorKind(cursor);

						CXString cursorSpelling = ClangIndex.clang_getCursorSpelling(arena, cursor);
						String cursorName = ClangIndex.clang_getCString(cursorSpelling);
						ClangIndex.clang_disposeString(cursorSpelling);

						if (cursorKind == CXCursorKind.CX_CURSOR_FUNCTION_DECL) {
							functions.put(
									cursorName, new NativeFunction(cursorName, cursor, reportPlatformSpecificity)
							);
						} else if (cursorKind == CXCursorKind.CX_CURSOR_STRUCT_DECL) {
							records.put(
									cursorName, new NativeRecord(cursorName, cursor, false, reportPlatformSpecificity)
							);
						} else if (cursorKind == CXCursorKind.CX_CURSOR_UNION_DECL) {
							records.put(
									cursorName, new NativeRecord(cursorName, cursor, true, reportPlatformSpecificity)
							);
						} else if (cursorKind == CXCursorKind.CX_CURSOR_ENUM_DECL) {
							enums.put(cursorName, new NativeEnum(cursorName, cursor));
						} else if (cursorKind == CXCursorKind.CX_CURSOR_VAR_DECL) {
							CXType typeResult = new CXType(arena);
							CXCursor cursorResult = new CXCursor(arena);

							if (ParsingUtils.isFunctionPointer(cursor, cursorResult, typeResult)) {
								functionPointers.put(
										cursorName,
										new NativeFunctionPointer(
												cursorName, typeResult, cursorResult, reportPlatformSpecificity
										)
								);
							} else {
								variables.put(cursorName, new NativeVariable(cursorName));
							}
						} else if (cursorKind == CXCursorKind.CX_CURSOR_TYPEDEF_DECL) {
							CXType typeResult = new CXType(arena);
							CXCursor cursorResult = new CXCursor(arena);

							if (ParsingUtils.isFunctionPointer(cursor, cursorResult, typeResult)) {
								functionPointers.put(
										cursorName,
										new NativeFunctionPointer(
												cursorName, typeResult, cursorResult, reportPlatformSpecificity
										)
								);
							}
						} else if (cursorKind == CXCursorKind.CX_CURSOR_MACRO_DEFINITION) {
							if (ClangIndex.clang_Cursor_isMacroFunctionLike(cursor) == 0)
								macros.put(cursorName, new NativeMacro(cursorName, cursor, translationUnit));
						}
					}

					return CXChildVisitResult.CX_CHILD_VISIT_CONTINUE;
				}
			};

			CXCursor translationUnitCursor = ClangIndex.clang_getTranslationUnitCursor(arena, translationUnit);

			ClangIndex.clang_visitChildren(translationUnitCursor, visitor, MemorySegment.NULL);
			ClangIndex.clang_disposeTranslationUnit(translationUnit);
			ClangIndex.clang_disposeIndex(index);
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
