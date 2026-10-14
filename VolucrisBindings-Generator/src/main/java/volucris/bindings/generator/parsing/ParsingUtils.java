package volucris.bindings.generator.parsing;

import java.lang.foreign.Arena;

import org.jspecify.annotations.Nullable;

import volucris.bindings.libclang.CXTranslationUnit;
import volucris.bindings.libclang.ClangIndex;
import volucris.bindings.libclang.enums.CXCursorKind;
import volucris.bindings.libclang.enums.CXTypeKind;
import volucris.bindings.libclang.structs.CXCursor;
import volucris.bindings.libclang.structs.CXString;
import volucris.bindings.libclang.structs.CXToken;
import volucris.bindings.libclang.structs.CXType;

public final class ParsingUtils {

	private ParsingUtils() {

	}

	public static @Nullable String getCommentText(CXString cxString) {
		String rawComment = ClangIndex.clang_getCString(cxString);

		if (rawComment == null)
			return null;

		return rawComment
				.replaceAll("^/\\*[*!]?[ \\t]*", "")
				.replaceAll("[ \\t]*\\*/$", "")
				.replaceAll("(?m)^[ \\t]*//[/!]?<?[ \\t]*", "")
				.replaceAll("(?m)^[ \\t]*\\*[ \\t]*", "");
	}

	public static @Nullable String getCursorSpelling(CXCursor cursor) {
		try (Arena arena = Arena.ofConfined()) {
			CXString cursorSpelling = ClangIndex.clang_getCursorSpelling(arena, cursor);

			try {
				return ClangIndex.clang_getCString(cursorSpelling);
			} finally {
				ClangIndex.clang_disposeString(cursorSpelling);
			}
		}
	}

	public static @Nullable String getTypeSpelling(CXType type) {
		try (Arena arena = Arena.ofConfined()) {
			CXString typeSpelling = ClangIndex.clang_getTypeSpelling(arena, type);

			try {
				return ClangIndex.clang_getCString(typeSpelling);
			} finally {
				ClangIndex.clang_disposeString(typeSpelling);
			}
		}
	}

	public static @Nullable String getTokenSpelling(CXTranslationUnit translationUnit, CXToken token) {
		try (Arena arena = Arena.ofConfined()) {
			CXString tokenSpelling = ClangIndex.clang_getTokenSpelling(arena, translationUnit, token);

			try {
				return ClangIndex.clang_getCString(tokenSpelling);
			} finally {
				ClangIndex.clang_disposeString(tokenSpelling);
			}
		}
	}

	/// Returns the spelling for the type with its top-level qualifiers removed.
	/// 
	/// For example:
	/// - `const int -> int`
	/// - `volatile unsigned long -> unsigned long`
	/// - `int *const -> int *`
	/// - `const int * -> const int *` 
	public static @Nullable String getUnqualifiedTypeSpelling(CXType type) {
		try (Arena arena = Arena.ofConfined()) {
			CXType unqualifiedType = ClangIndex.clang_getUnqualifiedType(arena, type);
			CXString typeSpelling = ClangIndex.clang_getTypeSpelling(arena, unqualifiedType);

			try {
				return ClangIndex.clang_getCString(typeSpelling);
			} finally {
				ClangIndex.clang_disposeString(typeSpelling);
			}
		}
	}

	/// Fetches the cursor for the types declaration and returns its spelling.
	public static @Nullable String getTypeDeclarationCursorSpelling(CXType type) {
		try (Arena arena = Arena.ofConfined()) {
			CXCursor typeDeclaration = ClangIndex.clang_getTypeDeclaration(arena, type);
			CXString cursorSpelling = ClangIndex.clang_getCursorSpelling(arena, typeDeclaration);

			try {
				return ClangIndex.clang_getCString(cursorSpelling);
			} finally {
				ClangIndex.clang_disposeString(cursorSpelling);
			}
		}
	}

	/// Checks if the given cursor represents a function pointer.
	/// 
	/// If true, the type of the function pointer will be stored in `typeResult`
	/// and the cursor of the function pointer will be stored in `cursorResult`.
	public static boolean isFunctionPointer(CXCursor cursor, CXCursor cursorResult, CXType typeResult) {
		try (Arena arena = Arena.ofConfined()) {
			CXType cursorType = ClangIndex.clang_getCursorType(arena, cursor);

			return isFunctionPointer(
					arena,
					cursorType,
					cursorResult.set(cursor),
					typeResult
			);
		}
	}

	/// Checks if the given type is a function pointer.
	/// 
	/// If true, the type of the function pointer will be stored in `typeResult`
	/// and the cursor of the function pointer will be stored in `cursorResult`.
	public static boolean isFunctionPointer(CXType type, CXCursor cursorResult, CXType typeResult) {
		try (Arena arena = Arena.ofConfined()) {
			return isFunctionPointer(
					arena,
					type,
					cursorResult.set(ClangIndex.clang_getTypeDeclaration(arena, type)),
					typeResult
			);
		}
	}

	private static boolean isFunctionPointer(Arena arena, CXType type, CXCursor cursorResult, CXType typeResult) {
		while (type.kind() == CXTypeKind.CX_TYPE_ELABORATED) {
			type = ClangIndex.clang_Type_getNamedType(arena, type);
		}

		switch (type.kind()) {
			case CXTypeKind.CX_TYPE_L_VALUE_REFERENCE,
					CXTypeKind.CX_TYPE_R_VALUE_REFERENCE,
					CXTypeKind.CX_TYPE_POINTER,
					CXTypeKind.CX_TYPE_MEMBER_POINTER -> {
				CXType pointeeType = ClangIndex.clang_getPointeeType(arena, type);
				return isFunctionPointer(arena, pointeeType, cursorResult, typeResult);
			}
			case CXTypeKind.CX_TYPE_TYPEDEF -> {
				CXCursor typeDeclaration = ClangIndex.clang_getTypeDeclaration(arena, type);
				cursorResult.set(typeDeclaration);

				CXType underlyingType = ClangIndex.clang_getTypedefDeclUnderlyingType(arena, typeDeclaration);

				return isFunctionPointer(arena, underlyingType, cursorResult, typeResult);
			}
			case CXTypeKind.CX_TYPE_FUNCTION_PROTO,
					CXTypeKind.CX_TYPE_FUNCTION_NO_PROTO -> {
				typeResult.set(type);
				return true;
			}
			default -> {
				return false;
			}
		}
	}

	/// Checks if the given cursor represents an inlined function pointer.
	/// 
	/// This method should only be called when [#isFunctionPointer(CXCursor, CXCursor, CXType)]
	/// returns true. This cursor parameter should always be the same as the `cursorResult` parameter.
	public static boolean isFunctionPointerInlined(CXCursor functionPointerCursor) {
		return ClangIndex.clang_getCursorKind(functionPointerCursor) != CXCursorKind.CX_CURSOR_TYPEDEF_DECL;
	}

	/// Returns the name for the given function pointer cursor.
	/// 
	/// This method should only be called when [#isFunctionPointer(CXCursor, CXCursor, CXType)]
	/// returns true. This cursor parameter should always be the same as the `cursorResult` parameter.
	/// 
	/// @throws RuntimeException If the `prefix` is non null and the function pointer is not inlined
	public static String getFunctionPointerName(CXCursor functionPointerCursor, @Nullable String prefix) {
		if (prefix != null && !isFunctionPointerInlined(functionPointerCursor))
			throw new RuntimeException("Prefix passed for naming a function pointer that is not inlined.");

		try (Arena arena = Arena.ofConfined()) {
			CXString cursorSpelling = ClangIndex.clang_getCursorSpelling(arena, functionPointerCursor);
			try {
				return prefix != null
						? prefix + "_" + ClangIndex.clang_getCString(cursorSpelling)
						: ClangIndex.clang_getCString(cursorSpelling);
			} finally {
				ClangIndex.clang_disposeString(cursorSpelling);
			}
		}
	}

	/// Checks if the given cursor is a field whose type is an unnamed record.
	/// (A struct or union with no tag, declared inline with a declarator).
	/// 
	/// If true, the declaration cursor of the record is copied into `cursorResult`.
	/// 
	/// ```
	/// struct Example {
	///     struct {
	///         int a;
	///         int b;
	///     } named;  	// Unnamed record field
	///
	///     struct {
	///         int x;
	///         int y;
	///     };         	// Anonymous record field
	/// };
	/// ```
	public static boolean isUnnamedRecordField(CXCursor cursor, CXCursor cursorResult) {
		try (Arena arena = Arena.ofConfined()) {

			if (ClangIndex.clang_getCursorKind(cursor) != CXCursorKind.CX_CURSOR_FIELD_DECL)
				return false;

			CXType cursorType = ClangIndex.clang_getCursorType(arena, cursor);
			CXCursor typeDeclaration = ClangIndex.clang_getTypeDeclaration(arena, cursorType);

			if (ClangIndex.clang_Cursor_isAnonymous(typeDeclaration) == 0)
				return false;
			if (ClangIndex.clang_Cursor_isAnonymousRecordDecl(typeDeclaration) != 0)
				return false;

			int cursorKind = ClangIndex.clang_getCursorKind(typeDeclaration);

			boolean isStruct = cursorKind == CXCursorKind.CX_CURSOR_STRUCT_DECL;
			boolean isUnion = cursorKind == CXCursorKind.CX_CURSOR_UNION_DECL;

			if (!isStruct && !isUnion)
				return false;

			cursorResult.set(typeDeclaration);
			return true;
		}
	}

	/// Checks if the given cursor is a field whose type is an anonymous record.
	/// (a struct or union with no tag and no declarator).
	///
	/// If true, the declaration cursor of the record is copied into `cursorResult`.
	/// 
	/// ```
	/// struct Example {
	///     struct {
	///         int a;
	///         int b;
	///     } named;  	// Unnamed record field
	///
	///     struct {
	///         int x;
	///         int y;
	///     };         	// Anonymous record field
	/// };
	/// ```
	public static boolean isAnonymousRecordField(CXCursor cursor, CXCursor cursorResult) {
		try (Arena arena = Arena.ofConfined()) {

			if (ClangIndex.clang_getCursorKind(cursor) != CXCursorKind.CX_CURSOR_FIELD_DECL) {
				if (isAnonymousRecord(cursorResult)) {
					cursorResult.set(cursor);
					return true;
				} else {
					return false;
				}
			}

			CXType cursorType = ClangIndex.clang_getCursorType(arena, cursor);
			CXCursor typeDeclaration = ClangIndex.clang_getTypeDeclaration(arena, cursorType);

			if (ClangIndex.clang_Cursor_isAnonymous(typeDeclaration) == 0)
				return false;
			if (ClangIndex.clang_Cursor_isAnonymousRecordDecl(typeDeclaration) == 0)
				return false;

			int cursorKind = ClangIndex.clang_getCursorKind(typeDeclaration);

			boolean isStruct = cursorKind == CXCursorKind.CX_CURSOR_STRUCT_DECL;
			boolean isUnion = cursorKind == CXCursorKind.CX_CURSOR_UNION_DECL;

			if (!isStruct && !isUnion)
				return false;

			cursorResult.set(typeDeclaration);
			return true;
		}
	}

	/// Checks if the given cursor is the declaration of an anonymous record.
	/// (a struct or union with no tag and no declarator).
	///
	/// If true, the declaration cursor of the record is copied into `cursorResult`.
	/// 
	/// 
	/// ```
	/// struct Example {
	///     struct {
	///         int a;
	///         int b;
	///     } named;  	// Unnamed record field
	///
	///     struct {
	///         int x;
	///         int y;
	///     };         	// Anonymous record field
	/// };
	/// ```
	private static boolean isAnonymousRecord(CXCursor cursor) {

		if (ClangIndex.clang_Cursor_isAnonymous(cursor) == 0)
			return false;

		int cursorKind = ClangIndex.clang_getCursorKind(cursor);

		boolean isStruct = cursorKind == CXCursorKind.CX_CURSOR_STRUCT_DECL;
		boolean isUnion = cursorKind == CXCursorKind.CX_CURSOR_UNION_DECL;

		if (!isStruct && !isUnion)
			return false;

		return ClangIndex.clang_Cursor_isAnonymousRecordDecl(cursor) != 0;
	}

}
