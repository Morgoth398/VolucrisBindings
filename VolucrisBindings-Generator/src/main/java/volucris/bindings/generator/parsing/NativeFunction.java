package volucris.bindings.generator.parsing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.lwjgl.llvm.CXCursor;
import org.lwjgl.llvm.CXString;
import org.lwjgl.llvm.CXType;
import org.lwjgl.llvm.ClangIndex;
import org.lwjgl.system.MemoryStack;

import org.jspecify.annotations.Nullable;

public class NativeFunction implements AbstractNativeFunction {

	private final String name;

	private final List<NativeParameter> parameters;

	private final NativeType returnType;

	private final boolean isInlined;

	private String comment;
	
	public NativeFunction(CXCursor functionCursor, String name, boolean reportPlatformSpecificity) {
		this.name = name;

		isInlined = ClangIndex.clang_Cursor_isFunctionInlined(functionCursor);

		int numParameters = ClangIndex.clang_Cursor_getNumArguments(functionCursor);
		List<NativeParameter> parameters = new ArrayList<NativeParameter>(numParameters);

		try (MemoryStack stack = MemoryStack.stackPush()) {
			CXCursor parameterCursor = CXCursor.calloc(stack);

			CXString cxString = CXString.calloc(stack);
			ClangIndex.clang_Cursor_getRawCommentText(functionCursor, cxString);
			comment = ParsingUtils.getCommentText(cxString);

			for (int i = 0; i < numParameters; i++) {
				ClangIndex.clang_Cursor_getArgument(functionCursor, i, parameterCursor);

				ClangIndex.clang_getCursorSpelling(parameterCursor, cxString);
				String parameterName = ClangIndex.clang_getCString(cxString);
				
				if (parameterName == null || parameterName.isBlank())
					parameterName = "param" + i;
				
				NativeParameter parameter = new NativeParameter(parameterCursor, parameterName);
				parameters.add(parameter);

				if (parameter.isPlatformSpecific() && reportPlatformSpecificity) {
					System.out.println(
							"Function (" + name + ") parameter is platform specific: " + parameter.toString()
					);
				}
			}

			CXType cxType = CXType.calloc(stack);
			ClangIndex.clang_getCursorResultType(functionCursor, cxType);

			returnType = new NativeType(cxType);
		}
		
		this.parameters = Collections.unmodifiableList(parameters);
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
		return parameters;
	}

	public boolean isInlined() {
		return isInlined;
	}

}
