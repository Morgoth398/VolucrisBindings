package volucris.bindings.generator.parsing;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import volucris.bindings.libclang.CXCursorVisitor;
import volucris.bindings.libclang.ClangIndex;
import volucris.bindings.libclang.enums.CXChildVisitResult;
import volucris.bindings.libclang.enums.CXCursorKind;
import volucris.bindings.libclang.structs.CXCursor;
import volucris.bindings.libclang.structs.CXString;
import volucris.bindings.libclang.structs.CXType;

public class NativeFunctionPointer implements AbstractNativeFunction {

	private final String name;
	private final String comment;

	private final List<NativeParameter> parameters;

	private final NativeType returnType;

	public NativeFunctionPointer(String name, CXType type, CXCursor cursor, boolean reportPlatformSpecificity) {
		this.name = name;
		this.parameters = new ArrayList<NativeParameter>();

		try (Arena arena = Arena.ofConfined()) {
			List<String> parameterNames = new ArrayList<String>();

			CXCursorVisitor visitor = new CXCursorVisitor(arena) {
				@Override
				public int invoke(CXCursor cursor, CXCursor parent, MemorySegment client_data) {
					if (ClangIndex.clang_getCursorKind(cursor) == CXCursorKind.CX_CURSOR_PARM_DECL) {
						CXString cursorSpelling = ClangIndex.clang_getCursorSpelling(arena, cursor);
						parameterNames.add(ClangIndex.clang_getCString(cursorSpelling));
						ClangIndex.clang_disposeString(cursorSpelling);
					}
					return CXChildVisitResult.CX_CHILD_VISIT_CONTINUE;
				}
			};

			ClangIndex.clang_visitChildren(cursor, visitor, MemorySegment.NULL);

			CXString rawCommentText = ClangIndex.clang_Cursor_getRawCommentText(arena, cursor);
			comment = ParsingUtils.getCommentText(rawCommentText);
			ClangIndex.clang_disposeString(rawCommentText);

			int numArguments = ClangIndex.clang_getNumArgTypes(type);
			for (int i = 0; i < numArguments; i++) {
				CXType argumentType = ClangIndex.clang_getArgType(arena, type, i);

				String parameterName = i < parameterNames.size() && !parameterNames.get(i).isBlank()
						? parameterNames.get(i)
						: "param" + i;

				CXCursor cursorResult = new CXCursor(arena);
				CXType typeResult = new CXType(arena);

				final boolean isFunctionPointer = ParsingUtils
						.isFunctionPointer(argumentType, cursorResult, typeResult);

				if (isFunctionPointer) {
					if (ParsingUtils.isFunctionPointerInlined(cursorResult)) {
						parameters.add(
								new FunctionPointerParameter(
										cursorResult,
										typeResult,
										ParsingUtils.getFunctionPointerName(cursorResult, name),
										parameterName,
										reportPlatformSpecificity
								)
						);
					} else {
						parameters.add(new NativeParameter(argumentType, parameterName));
					}
				} else {
					parameters.add(new NativeParameter(argumentType, parameterName));
				}
			}

			CXType resultType = ClangIndex.clang_getResultType(arena, type);

			returnType = new NativeType(resultType);

			if (reportPlatformSpecificity) {
				parameters.stream()
						.filter(NativeParameter::isPlatformSpecific)
						.forEach(parameter -> {
							System.out.println(
									"Function pointer (" + name + ") parameter is platform specific: "
											+ parameter.toString()
							);
						});

				if (returnType.isPlatformSpecific()) {
					System.out.println(
							"Function pointer (" + name + ") return type is platform specific: " + returnType.toString()
					);
				}
			}
		}
	}

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		parameters.forEach(parameter -> stringBuilder.append(parameter).append(", "));

		return "Function Pointer: " + name + ", Return type: " + returnType + ", Parameters: " + stringBuilder;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getComment() {
		return comment;
	}

	@Override
	public Optional<NativeType> getReturnType() {
		return returnType.type.typeKind() == NativeTypeKind.VOID ? Optional.empty() : Optional.of(returnType);
	}

	@Override
	public List<NativeParameter> getParameters() {
		return Collections.unmodifiableList(parameters);
	}

}
