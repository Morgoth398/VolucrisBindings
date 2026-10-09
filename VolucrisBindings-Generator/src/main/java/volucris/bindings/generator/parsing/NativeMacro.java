package volucris.bindings.generator.parsing;

import java.lang.foreign.Arena;

import volucris.bindings.core.NativeIntArray;
import volucris.bindings.core.NativePointerArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.libclang.CXTranslationUnit;
import volucris.bindings.libclang.ClangIndex;
import volucris.bindings.libclang.structs.CXCursor;
import volucris.bindings.libclang.structs.CXSourceRange;
import volucris.bindings.libclang.structs.CXToken;

public class NativeMacro {

	private final String name;

	private final String value;
	
	public NativeMacro(String name, CXCursor cursor, CXTranslationUnit translationUnit) {
		this.name = name;

		try (Arena arena = Arena.ofConfined()) {
			CXSourceRange cursorExtent = ClangIndex.clang_getCursorExtent(arena, cursor);
			
			NativePointerArray tokensAddr = new NativePointerArray(arena, 1);
			NativeIntArray numTokens = new NativeIntArray(arena, 1);
			
			ClangIndex.clang_tokenize(translationUnit, cursorExtent, tokensAddr, numTokens);
			
			NativeStructArray<CXToken> tokens = CXToken.array(tokensAddr.get(0));
			
			if (numTokens.get(0) < 2) {
				value = null;
				
				ClangIndex.clang_disposeTokens(translationUnit.memorySegment(), tokens.memorySegment(), numTokens.get(0));
				return;
			}
			
			StringBuilder stringBuilder = new StringBuilder();
			for (int i = 1; i < numTokens.get(0); i++) {
				stringBuilder.append(ParsingUtils.getTokenSpelling(translationUnit, tokens.get(i)));
			}
			
			ClangIndex.clang_disposeTokens(translationUnit.memorySegment(), tokens.memorySegment(), numTokens.get(0));
			
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
