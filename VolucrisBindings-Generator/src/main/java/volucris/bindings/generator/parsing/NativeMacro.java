package volucris.bindings.generator.parsing;

import java.nio.IntBuffer;

import org.lwjgl.PointerBuffer;
import org.lwjgl.llvm.CXCursor;
import org.lwjgl.llvm.CXSourceRange;
import org.lwjgl.llvm.CXString;
import org.lwjgl.llvm.CXToken;
import org.lwjgl.llvm.ClangIndex;
import org.lwjgl.system.MemoryStack;

public class NativeMacro {

	private final String name;

	private final String value;
	
	public NativeMacro(String name, CXCursor cursor, long translationUnit) {
		this.name = name;

		try (MemoryStack stack = MemoryStack.stackPush()) {
			CXSourceRange sourceRange = CXSourceRange.calloc(stack);
			
			ClangIndex.clang_getCursorExtent(cursor, sourceRange);
			
			PointerBuffer pointerBuffer = stack.callocPointer(1);
			IntBuffer numTokens = stack.callocInt(1);
			
			ClangIndex.clang_tokenize(translationUnit, sourceRange, pointerBuffer, numTokens);
			
			CXToken.Buffer tokens = CXToken.create(pointerBuffer.get(0), numTokens.get(0));
			
			if (numTokens.get(0) < 2) {
				value = null;
				ClangIndex.clang_disposeTokens(translationUnit, tokens);
				return;
			}
			
			CXString cxString = CXString.calloc(stack);
			
			StringBuilder stringBuilder = new StringBuilder();
			for (int i = 1; i < numTokens.get(0); i++) {
				ClangIndex.clang_getTokenSpelling(translationUnit, tokens.get(i), cxString);
				stringBuilder.append(ClangIndex.clang_getCString(cxString));
			}
			
			ClangIndex.clang_disposeTokens(translationUnit, tokens);
			
			value = stringBuilder.toString();
		}

	}

	@Override
	public String toString() {
		return "Macro: " + name + ", Value: " + value;
	}
	
	public String getName() {
		return name;
	}

	public String getValue() {
		return value;
	}
	
}
