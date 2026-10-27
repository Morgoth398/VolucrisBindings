package volucris.bindings.generator.parsing;

import java.lang.foreign.Arena;

import volucris.bindings.libclang.ClangIndex;
import volucris.bindings.libclang.enums.CXTypeKind;
import volucris.bindings.libclang.structs.CXCursor;
import volucris.bindings.libclang.structs.CXType;

public class NativeType {

	private static final String OS = System.getProperty("os.name").toLowerCase();
	private static final boolean IS_WINDOWS = OS.contains("windows");

	protected final TypeResult type;

	protected final String cursorTypeSpelling;
	protected final String canonicalTypeSpelling;

	private boolean platformSpecific;

	public NativeType(CXCursor cursor) {
		try (Arena arena = Arena.ofConfined()) {
			CXType cursorType = ClangIndex.clang_getCursorType(arena, cursor);
			CXType canonicalType = ClangIndex.clang_getCanonicalType(arena, cursorType);

			this.cursorTypeSpelling = ParsingUtils.getTypeSpelling(cursorType);
			this.canonicalTypeSpelling = ParsingUtils.getTypeSpelling(canonicalType);

			type = getType(arena, cursorType, new CXCursor(arena).set(cursor), NativeTypeKind.UNKNOWN, 0);
		}
	}

	public NativeType(CXType cursorType) {
		try (Arena arena = Arena.ofConfined()) {
			CXType canonicalType = ClangIndex.clang_getCanonicalType(arena, cursorType);

			this.cursorTypeSpelling = ParsingUtils.getTypeSpelling(cursorType);
			this.canonicalTypeSpelling = ParsingUtils.getTypeSpelling(canonicalType);

			type = getType(
					arena,
					cursorType,
					new CXCursor(arena).set(ClangIndex.clang_getTypeDeclaration(arena, cursorType)),
					NativeTypeKind.UNKNOWN, 0
			);
		}
	}

	public NativeType(NativeType nativeType) {
		this.type = nativeType.type;
		this.cursorTypeSpelling = nativeType.cursorTypeSpelling;
		this.canonicalTypeSpelling = nativeType.canonicalTypeSpelling;

		this.platformSpecific = nativeType.platformSpecific;
	}

	private TypeResult getType(
			Arena arena,
			CXType type,
			CXCursor cursor,
			NativeTypeKind prevKind,
			int pointerDepth
	) {

		while (type.kind() == CXTypeKind.CX_TYPE_ELABORATED) {
			type = ClangIndex.clang_Type_getNamedType(arena, type);
		}

		while (type.kind() == CXTypeKind.CX_TYPE_ATTRIBUTED) {
			type = ClangIndex.clang_Type_getModifiedType(arena, type);
		}
		
		switch (type.kind()) {
			case CXTypeKind.CX_TYPE_L_VALUE_REFERENCE,
					CXTypeKind.CX_TYPE_R_VALUE_REFERENCE,
					CXTypeKind.CX_TYPE_POINTER,
					CXTypeKind.CX_TYPE_MEMBER_POINTER -> {
				CXType pointeeType = ClangIndex.clang_getPointeeType(arena, type);
				return getType(arena, pointeeType, cursor, NativeTypeKind.POINTER, pointerDepth + 1);
			}
			case CXTypeKind.CX_TYPE_TYPEDEF -> {
				CXCursor typeDeclaration = ClangIndex.clang_getTypeDeclaration(arena, type);
				cursor.set(typeDeclaration);

				CXType underlyingType = ClangIndex.clang_getTypedefDeclUnderlyingType(arena, typeDeclaration);
				return getType(arena, underlyingType, cursor, prevKind, pointerDepth);
			}
			case CXTypeKind.CX_TYPE_INCOMPLETE_ARRAY,
					CXTypeKind.CX_TYPE_CONSTANT_ARRAY,
					CXTypeKind.CX_TYPE_VARIABLE_ARRAY,
					CXTypeKind.CX_TYPE_DEPENDENT_SIZED_ARRAY -> {
				long elementCount = ClangIndex.clang_getArraySize(type);

				CXType arrayElementType = ClangIndex.clang_getArrayElementType(arena, type);
				TypeResult typeResult = getType(arena, arrayElementType, cursor, NativeTypeKind.ARRAY, pointerDepth);

				return new ArrayType(typeResult.typeKind(), typeResult, typeResult.typeName(), elementCount);
			}
			case CXTypeKind.CX_TYPE_RECORD -> {
				NativeTypeKind typeKind = prevKind == NativeTypeKind.POINTER
						? pointerDepth > 1 ? NativeTypeKind.POINTER_TO_POINTERS : NativeTypeKind.RECORD_POINTER
						: NativeTypeKind.RECORD;

				return new SimpleType(typeKind, ParsingUtils.getTypeDeclarationCursorSpelling(type));
			}
			case CXTypeKind.CX_TYPE_ENUM -> {
				NativeTypeKind typeKind = prevKind == NativeTypeKind.POINTER
						? pointerDepth > 1 ? NativeTypeKind.POINTER_TO_POINTERS : NativeTypeKind.INT_POINTER
						: NativeTypeKind.ENUM;

				return new SimpleType(typeKind, ParsingUtils.getTypeDeclarationCursorSpelling(type));
			}
			case CXTypeKind.CX_TYPE_VOID -> {
				NativeTypeKind typeKind = prevKind == NativeTypeKind.POINTER
						? pointerDepth > 1 ? NativeTypeKind.POINTER_TO_POINTERS : NativeTypeKind.VOID_POINTER
						: NativeTypeKind.VOID;

				return new SimpleType(typeKind, ParsingUtils.getUnqualifiedTypeSpelling(type));
			}
			case CXTypeKind.CX_TYPE_BOOL -> {
				NativeTypeKind typeKind = NativeTypeKind.BOOLEAN;

				return new SimpleType(typeKind, ParsingUtils.getUnqualifiedTypeSpelling(type));
			}
			case CXTypeKind.CX_TYPE_CHAR_U,
					CXTypeKind.CX_TYPE_CHAR_S,
					CXTypeKind.CX_TYPE_U_CHAR,
					CXTypeKind.CX_TYPE_S_CHAR -> {
				NativeTypeKind typeKind = prevKind == NativeTypeKind.POINTER
						? pointerDepth > 1 ? NativeTypeKind.POINTER_TO_POINTERS : NativeTypeKind.BYTE_POINTER
						: NativeTypeKind.BYTE;

				return new SimpleType(typeKind, ParsingUtils.getUnqualifiedTypeSpelling(type));
			}
			case CXTypeKind.CX_TYPE_U_SHORT,
					CXTypeKind.CX_TYPE_SHORT -> {
				NativeTypeKind typeKind = prevKind == NativeTypeKind.POINTER
						? pointerDepth > 1 ? NativeTypeKind.POINTER_TO_POINTERS : NativeTypeKind.SHORT_POINTER
						: NativeTypeKind.SHORT;

				return new SimpleType(typeKind, ParsingUtils.getUnqualifiedTypeSpelling(type));
			}
			case CXTypeKind.CX_TYPE_U_INT,
					CXTypeKind.CX_TYPE_INT,
					CXTypeKind.CX_TYPE_CHAR32 -> {
				NativeTypeKind typeKind = prevKind == NativeTypeKind.POINTER
						? pointerDepth > 1 ? NativeTypeKind.POINTER_TO_POINTERS : NativeTypeKind.INT_POINTER
						: NativeTypeKind.INT;

				return new SimpleType(typeKind, ParsingUtils.getUnqualifiedTypeSpelling(type));
			}
			case CXTypeKind.CX_TYPE_LONG,
					CXTypeKind.CX_TYPE_U_LONG -> {
				platformSpecific = true;

				NativeTypeKind typeKind = IS_WINDOWS
						? prevKind == NativeTypeKind.POINTER
								? pointerDepth > 1 ? NativeTypeKind.POINTER_TO_POINTERS : NativeTypeKind.INT_POINTER
								: NativeTypeKind.INT
						: prevKind == NativeTypeKind.POINTER
								? pointerDepth > 1 ? NativeTypeKind.POINTER_TO_POINTERS : NativeTypeKind.LONG_POINTER
								: NativeTypeKind.LONG;

				return new SimpleType(typeKind, ParsingUtils.getUnqualifiedTypeSpelling(type));
			}
			case CXTypeKind.CX_TYPE_U_LONG_LONG,
					CXTypeKind.CX_TYPE_LONG_LONG -> {
				NativeTypeKind typeKind = prevKind == NativeTypeKind.POINTER
						? pointerDepth > 1 ? NativeTypeKind.POINTER_TO_POINTERS : NativeTypeKind.LONG_POINTER
						: NativeTypeKind.LONG;

				return new SimpleType(typeKind, ParsingUtils.getUnqualifiedTypeSpelling(type));
			}
			case CXTypeKind.CX_TYPE_HALF,
					CXTypeKind.CX_TYPE_FLOAT -> {
				NativeTypeKind typeKind = prevKind == NativeTypeKind.POINTER
						? pointerDepth > 1 ? NativeTypeKind.POINTER_TO_POINTERS : NativeTypeKind.FLOAT_POINTER
						: NativeTypeKind.FLOAT;

				return new SimpleType(typeKind, ParsingUtils.getUnqualifiedTypeSpelling(type));
			}
			case CXTypeKind.CX_TYPE_DOUBLE,
					CXTypeKind.CX_TYPE_LONG_DOUBLE -> {
				NativeTypeKind typeKind = prevKind == NativeTypeKind.POINTER
						? pointerDepth > 1 ? NativeTypeKind.POINTER_TO_POINTERS : NativeTypeKind.DOUBLE_POINTER
						: NativeTypeKind.DOUBLE;

				return new SimpleType(typeKind, ParsingUtils.getUnqualifiedTypeSpelling(type));
			}
			case CXTypeKind.CX_TYPE_W_CHAR -> {
				platformSpecific = true;

				NativeTypeKind typeKind = IS_WINDOWS
						? prevKind == NativeTypeKind.POINTER
								? pointerDepth > 1 ? NativeTypeKind.POINTER_TO_POINTERS : NativeTypeKind.SHORT_POINTER
								: NativeTypeKind.SHORT
						: prevKind == NativeTypeKind.POINTER
								? pointerDepth > 1 ? NativeTypeKind.POINTER_TO_POINTERS : NativeTypeKind.INT_POINTER
								: NativeTypeKind.INT;

				return new SimpleType(typeKind, ParsingUtils.getUnqualifiedTypeSpelling(type));
			}
			case CXTypeKind.CX_TYPE_CHAR16 -> {
				NativeTypeKind typeKind = prevKind == NativeTypeKind.POINTER
						? pointerDepth > 1 ? NativeTypeKind.POINTER_TO_POINTERS : NativeTypeKind.STRING
						: NativeTypeKind.CHAR;

				return new SimpleType(typeKind, ParsingUtils.getUnqualifiedTypeSpelling(type));
			}
			case CXTypeKind.CX_TYPE_FUNCTION_PROTO,
					CXTypeKind.CX_TYPE_FUNCTION_NO_PROTO -> {
				NativeTypeKind typeKind = NativeTypeKind.FUNCTION_POINTER;

				return new SimpleType(typeKind, ParsingUtils.getFunctionPointerName(cursor, null));
			}
			default -> {
				NativeTypeKind typeKind = prevKind != null ? prevKind : NativeTypeKind.UNKNOWN;

				return new SimpleType(typeKind, ParsingUtils.getUnqualifiedTypeSpelling(type));
			}
		}

	}

	@Override
	public String toString() {
		return type.toString();
	}

	public TypeResult getType() {
		return type;
	}

	public String getCursorType() {
		return cursorTypeSpelling;
	}

	public String getCanonicalType() {
		return canonicalTypeSpelling;
	}

	public boolean isPlatformSpecific() {
		return platformSpecific;
	}

	public sealed interface TypeResult permits SimpleType, ArrayType {
		NativeTypeKind typeKind();

		String typeName();
	}

	public record SimpleType(NativeTypeKind typeKind, String typeName) implements TypeResult {
	}

	public record ArrayType(
			NativeTypeKind elementKind, TypeResult elementType, String typeName, long elementCount
	) implements TypeResult {

		public NativeTypeKind typeKind() {
			return NativeTypeKind.ARRAY;
		}

	}

}
