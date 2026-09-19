package volucris.bindings.generator.parsing;

import org.lwjgl.llvm.CXCursor;
import org.lwjgl.llvm.CXString;
import org.lwjgl.llvm.CXType;
import org.lwjgl.llvm.ClangIndex;
import org.lwjgl.system.MemoryStack;

public class NativeType {

	private static final String OS = System.getProperty("os.name").toLowerCase();
	private static final boolean IS_WINDOWS = OS.contains("windows");

	protected final TypeResult type;

	protected final String cursorType;
	protected final String canonicalType;

	private boolean platformSpecific;

	public NativeType(CXCursor cursor) {
		try (MemoryStack stack = MemoryStack.stackPush()) {
			CXType cursorType = CXType.calloc(stack);
			CXType canonicalType = CXType.calloc(stack);

			ClangIndex.clang_getCursorType(cursor, cursorType);
			ClangIndex.clang_getCanonicalType(cursorType, canonicalType);

			CXString cxString = CXString.calloc(stack);
			this.cursorType = ClangIndex.clang_getCString(ClangIndex.clang_getTypeSpelling(cursorType, cxString));
			this.canonicalType = ClangIndex.clang_getCString(ClangIndex.clang_getTypeSpelling(canonicalType, cxString));

			type = getType(cursorType, canonicalType, CXCursor.calloc(stack), cxString, NativeTypeKind.UNKNOWN, 0);
		}
	}

	public NativeType(CXType cursorType) {
		try (MemoryStack stack = MemoryStack.stackPush()) {
			CXType canonicalType = CXType.calloc(stack);

			ClangIndex.clang_getCanonicalType(cursorType, canonicalType);

			CXString cxString = CXString.calloc(stack);
			this.cursorType = ClangIndex.clang_getCString(ClangIndex.clang_getTypeSpelling(cursorType, cxString));
			this.canonicalType = ClangIndex.clang_getCString(ClangIndex.clang_getTypeSpelling(canonicalType, cxString));

			type = getType(cursorType, canonicalType, CXCursor.calloc(stack), cxString, NativeTypeKind.UNKNOWN, 0);
		}
	}

	public NativeType(NativeType nativeType) {
		this.type = nativeType.type;
		this.cursorType = nativeType.cursorType;
		this.canonicalType = nativeType.canonicalType;
		
		this.platformSpecific = nativeType.platformSpecific;
	}
	
	private TypeResult getType(
			CXType type,
			CXType tmpType,
			CXCursor cursor,
			CXString string,
			NativeTypeKind prevKind,
			int pointerDepth
	) {

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
				return getType(tmpType, type, cursor, string, NativeTypeKind.POINTER, pointerDepth + 1);
			}
			case ClangIndex.CXType_Typedef -> {
				CXCursor declaration = ClangIndex.clang_getTypeDeclaration(type, cursor);
				ClangIndex.clang_getTypedefDeclUnderlyingType(declaration, tmpType);
				return getType(tmpType, type, cursor, string, prevKind, pointerDepth);
			}
			case ClangIndex.CXType_IncompleteArray,
					ClangIndex.CXType_ConstantArray,
					ClangIndex.CXType_VariableArray,
					ClangIndex.CXType_DependentSizedArray -> {
				long arrayCount = ClangIndex.clang_getArraySize(type);
				ClangIndex.clang_getArrayElementType(type, tmpType);
				TypeResult typeResult = getType(tmpType, type, cursor, string, NativeTypeKind.ARRAY, pointerDepth);
				return new ArrayType(typeResult.typeKind(), typeResult, typeResult.typeName(), arrayCount);
			}
			case ClangIndex.CXType_Record -> {
				NativeTypeKind typeKind = prevKind == NativeTypeKind.POINTER
						? pointerDepth > 1 ? NativeTypeKind.POINTER_TO_POINTERS : NativeTypeKind.RECORD_POINTER
						: NativeTypeKind.RECORD;
				String typeName = getCursorSpelling(type, cursor, string);
				return new SimpleType(typeKind, typeName);
			}
			case ClangIndex.CXType_Enum -> {
				NativeTypeKind typeKind = prevKind == NativeTypeKind.POINTER
						? pointerDepth > 1 ? NativeTypeKind.POINTER_TO_POINTERS : NativeTypeKind.INT_POINTER
						: NativeTypeKind.ENUM;
				String typeName = getCursorSpelling(type, cursor, string);
				return new SimpleType(typeKind, typeName);
			}
			case ClangIndex.CXType_Void -> {
				NativeTypeKind typeKind = prevKind == NativeTypeKind.POINTER
						? pointerDepth > 1 ? NativeTypeKind.POINTER_TO_POINTERS : NativeTypeKind.VOID_POINTER
						: NativeTypeKind.VOID;
				String typeName = getTypeSpelling(type, tmpType, string);
				return new SimpleType(typeKind, typeName);
			}
			case ClangIndex.CXType_Bool -> {
				NativeTypeKind typeKind = NativeTypeKind.BOOLEAN;
				String typeName = getTypeSpelling(type, tmpType, string);
				return new SimpleType(typeKind, typeName);
			}
			case ClangIndex.CXType_Char_U,
					ClangIndex.CXType_Char_S,
					ClangIndex.CXType_UChar,
					ClangIndex.CXType_SChar -> {
				NativeTypeKind typeKind = prevKind == NativeTypeKind.POINTER
						? pointerDepth > 1 ? NativeTypeKind.POINTER_TO_POINTERS : NativeTypeKind.BYTE_POINTER
						: NativeTypeKind.BYTE;
				String typeName = getTypeSpelling(type, tmpType, string);
				return new SimpleType(typeKind, typeName);
			}
			case ClangIndex.CXType_UShort,
					ClangIndex.CXType_Short -> {
				NativeTypeKind typeKind = prevKind == NativeTypeKind.POINTER
						? pointerDepth > 1 ? NativeTypeKind.POINTER_TO_POINTERS : NativeTypeKind.SHORT_POINTER
						: NativeTypeKind.SHORT;
				String typeName = getTypeSpelling(type, tmpType, string);
				return new SimpleType(typeKind, typeName);
			}
			case ClangIndex.CXType_UInt,
					ClangIndex.CXType_Int,
					ClangIndex.CXType_Char32 -> {
				NativeTypeKind typeKind = prevKind == NativeTypeKind.POINTER
						? pointerDepth > 1 ? NativeTypeKind.POINTER_TO_POINTERS : NativeTypeKind.INT_POINTER
						: NativeTypeKind.INT;
				String typeName = getTypeSpelling(type, tmpType, string);
				return new SimpleType(typeKind, typeName);
			}
			case ClangIndex.CXType_Long,
					ClangIndex.CXType_ULong -> {
				platformSpecific = true;

				NativeTypeKind typeKind = IS_WINDOWS
						? prevKind == NativeTypeKind.POINTER
								? pointerDepth > 1 ? NativeTypeKind.POINTER_TO_POINTERS : NativeTypeKind.INT_POINTER
								: NativeTypeKind.INT
						: prevKind == NativeTypeKind.POINTER
								? pointerDepth > 1 ? NativeTypeKind.POINTER_TO_POINTERS : NativeTypeKind.LONG_POINTER
								: NativeTypeKind.LONG;
				String typeName = getTypeSpelling(type, tmpType, string);
				return new SimpleType(typeKind, typeName);
			}
			case ClangIndex.CXType_ULongLong,
					ClangIndex.CXType_LongLong -> {
				NativeTypeKind typeKind = prevKind == NativeTypeKind.POINTER
						? pointerDepth > 1 ? NativeTypeKind.POINTER_TO_POINTERS : NativeTypeKind.LONG_POINTER
						: NativeTypeKind.LONG;
				String typeName = getTypeSpelling(type, tmpType, string);
				return new SimpleType(typeKind, typeName);
			}
			case ClangIndex.CXType_Half,
					ClangIndex.CXType_Float -> {
				NativeTypeKind typeKind = prevKind == NativeTypeKind.POINTER
						? pointerDepth > 1 ? NativeTypeKind.POINTER_TO_POINTERS : NativeTypeKind.FLOAT_POINTER
						: NativeTypeKind.FLOAT;
				String typeName = getTypeSpelling(type, tmpType, string);
				return new SimpleType(typeKind, typeName);
			}
			case ClangIndex.CXType_Double,
					ClangIndex.CXType_LongDouble -> {
				NativeTypeKind typeKind = prevKind == NativeTypeKind.POINTER
						? pointerDepth > 1 ? NativeTypeKind.POINTER_TO_POINTERS : NativeTypeKind.DOUBLE_POINTER
						: NativeTypeKind.DOUBLE;
				String typeName = getTypeSpelling(type, tmpType, string);
				return new SimpleType(typeKind, typeName);
			}
			case ClangIndex.CXType_WChar -> {
				platformSpecific = true;

				NativeTypeKind typeKind = IS_WINDOWS
						? prevKind == NativeTypeKind.POINTER
								? pointerDepth > 1 ? NativeTypeKind.POINTER_TO_POINTERS : NativeTypeKind.SHORT_POINTER
								: NativeTypeKind.SHORT
						: prevKind == NativeTypeKind.POINTER
								? pointerDepth > 1 ? NativeTypeKind.POINTER_TO_POINTERS : NativeTypeKind.INT_POINTER
								: NativeTypeKind.INT;
				String typeName = getTypeSpelling(type, tmpType, string);
				return new SimpleType(typeKind, typeName);
			}
			case ClangIndex.CXType_Char16 -> {
				NativeTypeKind typeKind = prevKind == NativeTypeKind.POINTER
						? pointerDepth > 1 ? NativeTypeKind.POINTER_TO_POINTERS : NativeTypeKind.STRING
						: NativeTypeKind.CHAR;
				String typeName = getTypeSpelling(type, tmpType, string);
				return new SimpleType(typeKind, typeName);
			}
			case ClangIndex.CXType_FunctionProto,
					ClangIndex.CXType_FunctionNoProto -> {
				NativeTypeKind typeKind = NativeTypeKind.FUNCTION_POINTER;
//				String typeName = getTypeSpelling(type, tmpType, string);
				String typeName = ParsingUtils.getFunctionPointerName(cursor, null);
				return new SimpleType(typeKind, typeName);
			}
			default -> {
				NativeTypeKind typeKind = prevKind != null ? prevKind : NativeTypeKind.UNKNOWN;
				String typeName = getTypeSpelling(type, tmpType, string);
				return new SimpleType(typeKind, typeName);
			}
		}

	}

	private String getTypeSpelling(CXType type, CXType tmpType, CXString cxString) {
		ClangIndex.clang_getUnqualifiedType(type, tmpType);
		ClangIndex.clang_getTypeSpelling(tmpType, cxString);
		return ClangIndex.clang_getCString(cxString);
	}

	private String getCursorSpelling(CXType type, CXCursor cursor, CXString cxString) {
		ClangIndex.clang_getTypeDeclaration(type, cursor);
		ClangIndex.clang_getCursorSpelling(cursor, cxString);
		return ClangIndex.clang_getCString(cxString);
	}

	@Override
	public String toString() {
		return type.toString();
	}

	public TypeResult getType() {
		return type;
	}

	public String getCursorType() {
		return cursorType;
	}

	public String getCanonicalType() {
		return canonicalType;
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

	public record ArrayType(NativeTypeKind elementKind, TypeResult elementType, String typeName, long count)
			implements TypeResult {

		public NativeTypeKind typeKind() {
			return NativeTypeKind.ARRAY;
		}

	}

}
