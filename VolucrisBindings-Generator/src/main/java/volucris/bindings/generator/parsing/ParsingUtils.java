package volucris.bindings.generator.parsing;

import org.lwjgl.llvm.CXCursor;
import org.lwjgl.llvm.CXString;
import org.lwjgl.llvm.CXType;
import org.lwjgl.llvm.ClangIndex;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;

import org.jspecify.annotations.Nullable;

public final class ParsingUtils {

	private ParsingUtils() {

	}

	public static @Nullable String getCommentText(CXString cxString) {
		String rawComment = ClangIndex.clang_getCString(cxString);

		if (rawComment == null)
			return null;

//		return rawComment
//				.replaceAll("^/\\*[*!]?[ \\t]*", "")
//				.replaceAll("[ \\t]*\\*/$", "")
//				.replaceAll("(?m)^[ \\t]*///?[ \\t]*", "")
//				.replaceAll("(?m)^[ \\t]*\\*[ \\t]*", "");

		return rawComment
				.replaceAll("^/\\*[*!]?[ \\t]*", "")
				.replaceAll("[ \\t]*\\*/$", "")
				.replaceAll("(?m)^[ \\t]*//[/!]?<?[ \\t]*", "")
				.replaceAll("(?m)^[ \\t]*\\*[ \\t]*", "");
	}

	/// Checks if the given cursor represents a function pointer.
	/// 
	/// If true, the type of the function pointer will be stored in `result`.
	public static boolean isFunctionPointer(CXCursor cursor, @Nullable CXCursor cursorResult, CXType typeResult) {
		try (MemoryStack stack = MemoryStack.stackPush()) {
			final CXType cxType = CXType.calloc(stack);
			final CXType tmpType = CXType.calloc(stack);

			ClangIndex.clang_getCursorType(cursor, cxType);

			return isFunctionPointer(
					cxType, tmpType, typeResult, cursorResult == null ? CXCursor.calloc(stack) : cursorResult
			);
		}
	}

	private static boolean isFunctionPointer(CXType type, CXType tmpType, CXType result, CXCursor cursor) {
		while (type.kind() == ClangIndex.CXType_Elaborated) {
			ClangIndex.clang_Type_getNamedType(type, tmpType);

			CXType swap = type;
			type = tmpType;
			tmpType = swap;
		}

		switch (type.kind()) {
			case ClangIndex.CXType_LValueReference,
					ClangIndex.CXType_RValueReference,
					ClangIndex.CXType_Pointer,
					ClangIndex.CXType_MemberPointer -> {
				ClangIndex.clang_getPointeeType(type, tmpType);
				return isFunctionPointer(tmpType, type, result, cursor);
			}
			case ClangIndex.CXType_Typedef -> {
				CXCursor declaration = ClangIndex.clang_getTypeDeclaration(type, cursor);
				ClangIndex.clang_getTypedefDeclUnderlyingType(declaration, tmpType);
				return isFunctionPointer(tmpType, type, result, cursor);
			}
			case ClangIndex.CXType_FunctionProto,
					ClangIndex.CXType_FunctionNoProto -> {
				MemoryUtil.memCopy(type.address(), result.address(), CXType.SIZEOF);
				return true;
			}
			default -> {
				return false;
			}
		}
	}

	public static String getFunctionPointerName(CXCursor cursor, @Nullable String prefix) {
		try (MemoryStack stack = MemoryStack.stackPush()) {
			CXType type = CXType.calloc(stack);
			CXType tmpType = CXType.calloc(stack);
			CXString cxString = CXString.calloc(stack);

			CXCursor typedefCursor = CXCursor.calloc(stack);

			ClangIndex.clang_getCursorType(cursor, type);

			while (true) {

				if (type.kind() == ClangIndex.CXType_Elaborated) {
					ClangIndex.clang_Type_getNamedType(type, tmpType);
				} else if (type.kind() == ClangIndex.CXType_Pointer
						|| type.kind() == ClangIndex.CXType_LValueReference
						|| type.kind() == ClangIndex.CXType_RValueReference
						|| type.kind() == ClangIndex.CXType_MemberPointer) {
					ClangIndex.clang_getPointeeType(type, tmpType);
				} else {
					break;
				}

				CXType swap = type;
				type = tmpType;
				tmpType = swap;
			}

			if (type.kind() == ClangIndex.CXType_Typedef) {
				ClangIndex.clang_getTypeDeclaration(type, typedefCursor);
				ClangIndex.clang_getCursorSpelling(typedefCursor, cxString);

				return ClangIndex.clang_getCString(cxString);
			}

			ClangIndex.clang_getCursorSpelling(cursor, cxString);

			return prefix != null
					? prefix + "_" + ClangIndex.clang_getCString(cxString)
					: ClangIndex.clang_getCString(cxString);
		}
	}

}
