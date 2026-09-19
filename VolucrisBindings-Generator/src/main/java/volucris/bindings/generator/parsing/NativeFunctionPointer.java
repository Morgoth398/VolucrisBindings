package volucris.bindings.generator.parsing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.lwjgl.llvm.CXCursor;
import org.lwjgl.llvm.CXCursorVisitor;
import org.lwjgl.llvm.CXString;
import org.lwjgl.llvm.CXType;
import org.lwjgl.llvm.ClangIndex;
import org.lwjgl.system.MemoryStack;

public class NativeFunctionPointer implements AbstractNativeFunction {

	private final String name;
	private final String comment;

	private final List<NativeParameter> parameters;

	private final NativeType returnType;

	public NativeFunctionPointer(CXType type, CXCursor cursor, String name, boolean reportPlatformSpecificity) {
		this.name = name;

		List<NativeParameter> parameters = new ArrayList<NativeParameter>();

		ArrayList<String> parameterNames = new ArrayList<>();

		CXCursorVisitor visitor = new CXCursorVisitor() {
			@Override
			public int invoke(CXCursor cursor, CXCursor parent, long client_data) {
				if (ClangIndex.clang_getCursorKind(cursor) == ClangIndex.CXCursor_ParmDecl) {
					try (MemoryStack stack = MemoryStack.stackPush()) {
						CXString cxString = CXString.calloc(stack);
						ClangIndex.clang_getCursorSpelling(cursor, cxString);
						parameterNames.add(ClangIndex.clang_getCString(cxString));
					}
				}
				return ClangIndex.CXChildVisit_Continue;
			}
		};

		ClangIndex.clang_visitChildren(cursor, visitor, 0);
		
		visitor.free();

		try (MemoryStack stack = MemoryStack.stackPush()) {
			CXString cxString = CXString.calloc(stack);
			ClangIndex.clang_Cursor_getRawCommentText(cursor, cxString);
			comment = ParsingUtils.getCommentText(cxString);

			int numParameters = ClangIndex.clang_getNumArgTypes(type);
			CXType argType = CXType.calloc(stack);

			for (int i = 0; i < numParameters; i++) {
				ClangIndex.clang_getArgType(type, i, argType);
				String paramName = i < parameterNames.size() 
						? parameterNames.get(i).isBlank() ? "param" + i :  parameterNames.get(i) 
						: "param" + i;

				NativeParameter parameter = new NativeParameter(argType, paramName);
				parameters.add(parameter);

				if (parameter.isPlatformSpecific() && reportPlatformSpecificity)
					System.err.println(
							"Function pointer (" + name + ") parameter is platform specific: " + parameter.toString()
					);
			}

			CXType resultType = CXType.calloc(stack);
			ClangIndex.clang_getResultType(type, resultType);
			
			returnType = new NativeType(resultType);
		}
		
		this.parameters = Collections.unmodifiableList(parameters);
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
		return parameters;
	}

}
