package volucris.bindings.generator.parsing;

import java.lang.foreign.Arena;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.jspecify.annotations.Nullable;

import volucris.bindings.libclang.ClangIndex;
import volucris.bindings.libclang.structs.CXCursor;
import volucris.bindings.libclang.structs.CXString;
import volucris.bindings.libclang.structs.CXType;

public class NativeFunction implements AbstractNativeFunction {

	private final String name;

	private final List<NativeParameter> parameters;

	private final NativeType returnType;

	private final boolean isInlined;

	private String comment;

	public NativeFunction(String name, CXCursor cursor, boolean reportPlatformSpecificity) {
		this.name = name;
		this.isInlined = ClangIndex.clang_Cursor_isFunctionInlined(cursor) != 0;

		int numParameters = ClangIndex.clang_Cursor_getNumArguments(cursor);
		this.parameters = new ArrayList<NativeParameter>(numParameters);

		try (Arena arena = Arena.ofConfined()) {
			CXString rawCommentText = ClangIndex.clang_Cursor_getRawCommentText(arena, cursor);
			comment = ParsingUtils.getCommentText(rawCommentText);
			ClangIndex.clang_disposeString(rawCommentText);

			for (int i = 0; i < numParameters; i++) {
				CXCursor argumentCursor = ClangIndex.clang_Cursor_getArgument(arena, cursor, i);

				String parameterName = ParsingUtils.getCursorSpelling(argumentCursor);

				if (parameterName == null || parameterName.isBlank())
					parameterName = "param" + i;

				CXCursor cursorResult = new CXCursor(arena);
				CXType typeResult = new CXType(arena);

				final boolean isFunctionPointer = ParsingUtils.isFunctionPointer(argumentCursor, cursorResult, typeResult);

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
						parameters.add(new NativeParameter(argumentCursor, parameterName));
					}
				} else {
					parameters.add(new NativeParameter(argumentCursor, parameterName));
				}
			}

			CXType resultType = ClangIndex.clang_getCursorResultType(arena, cursor);

			returnType = new NativeType(resultType);

			if (reportPlatformSpecificity) {
				parameters.stream()
						.filter(NativeParameter::isPlatformSpecific)
						.forEach(parameter -> {
							System.out.println(
									"Function (" + name + ") parameter is platform specific: " + parameter.toString()
							);
						});

				if (returnType.isPlatformSpecific()) {
					System.out.println(
							"Function (" + name + ") return type is platform specific: " + returnType.toString()
					);
				}
			}
		}
	}

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		parameters.forEach(parameter -> stringBuilder.append(parameter).append(", "));

		return "Function: " + name + ", Return type: " + returnType + ", Parameters: " + stringBuilder;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getComment() {
		return comment;
	}

	public void setComment(@Nullable String comment) {
		if (this.comment != null)
			return;

		this.comment = comment;
	}

	@Override
	public Optional<NativeType> getReturnType() {
		return returnType.type.typeKind() == NativeTypeKind.VOID ? Optional.empty() : Optional.of(returnType);
	}

	@Override
	public List<NativeParameter> getParameters() {
		return Collections.unmodifiableList(parameters);
	}

	public boolean isInlined() {
		return isInlined;
	}

}
