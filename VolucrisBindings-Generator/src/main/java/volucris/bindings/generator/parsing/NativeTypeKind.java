package volucris.bindings.generator.parsing;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.util.Collection;

import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeByteArray;
import volucris.bindings.core.NativeDoubleArray;
import volucris.bindings.core.NativeFloatArray;
import volucris.bindings.core.NativeIntArray;
import volucris.bindings.core.NativeLongArray;
import volucris.bindings.core.NativePointerArray;
import volucris.bindings.core.NativeShortArray;

public enum NativeTypeKind {

	POINTER(true, false, "UNBOUNDED_ADDRESS"),
	INT_POINTER(true, false, "UNBOUNDED_ADDRESS"),
	BYTE_POINTER(true, false, "UNBOUNDED_ADDRESS"),
	VOID_POINTER(true, false, "UNBOUNDED_ADDRESS"),
	LONG_POINTER(true, false, "UNBOUNDED_ADDRESS"),
	SHORT_POINTER(true, false, "UNBOUNDED_ADDRESS"),
	FLOAT_POINTER(true, false, "UNBOUNDED_ADDRESS"),
	DOUBLE_POINTER(true, false, "UNBOUNDED_ADDRESS"),
	RECORD_POINTER(true, false, "UNBOUNDED_ADDRESS"),
	FUNCTION_POINTER(true, false, "UNBOUNDED_ADDRESS"),
	POINTER_TO_POINTERS(true, false, "UNBOUNDED_ADDRESS"),

	ARRAY(true, false, "UNBOUNDED_ADDRESS"),
	STRING(true, false, "UNBOUNDED_ADDRESS"),

	VOID(false, false, null),
	RECORD(false, false, null),
	UNKNOWN(false, false, null),

	INT(false, true, "JAVA_INT"),
	BYTE(false, true, "JAVA_BYTE"),
	ENUM(false, true, "JAVA_INT"),
	CHAR(false, true, "JAVA_CHAR"),
	LONG(false, true, "JAVA_LONG"),
	SHORT(false, true, "JAVA_SHORT"),
	FLOAT(false, true, "JAVA_FLOAT"),
	DOUBLE(false, true, "JAVA_DOUBLE"),
	BOOLEAN(false, true, "JAVA_BOOLEAN");

	private final String valueLayout;

	private final boolean pointer;
	private final boolean primitive;

	private NativeTypeKind(boolean pointer, boolean primitive, @Nullable String valueLayout) {
		this.pointer = pointer;
		this.primitive = primitive;
		this.valueLayout = valueLayout;
	}

	/// Returns the [ValueLayout] name for this type.
	/// 
	/// Only returns null for enum constants `VOID`, `RECORD` and `UNKNOWN`. 
	public @Nullable String getValueLayout() {
		return valueLayout;
	}

	public boolean isPointer() {
		return pointer;
	}

	public boolean isPrimitive() {
		return primitive;
	}

	/// Returns a string representation of the primitive type this [NativeTypeKind] maps to.
	/// 
	/// These conversions are possible:
	/// - INT, ENUM -> int
	/// - BYTE 		-> byte
	/// - CHAR 		-> char
	/// - LONG 		-> long
	/// - SHORT 	-> short
	/// - FLOAT 	-> float
	/// - DOUBLE 	-> double
	/// - BOOLEAN 	-> boolean
	/// 
	/// @throws RuntimeException If the NativeTypeKind is not a primitive type
	public static String getPrimitiveType(NativeTypeKind typeKind) {
		switch (typeKind) {
			case INT, ENUM -> {
				return "int";
			}
			case BYTE -> {
				return "byte";
			}
			case CHAR -> {
				return "char";
			}
			case LONG -> {
				return "long";
			}
			case SHORT -> {
				return "short";
			}
			case FLOAT -> {
				return "float";
			}
			case DOUBLE -> {
				return "double";
			}
			case BOOLEAN -> {
				return "boolean";
			}
			default -> {
				throw new RuntimeException("Cannot convert NativeTypeKind to java primitive type: " + typeKind);
			}
		}
	}

	/// Returns a string representation of the java class this [NativeTypeKind] maps to.
	/// 
	/// These conversions are possible:
	/// - POINTER, VOID_POINTER, FUNCTION_POINTER, ARRAY -> [MemorySegment]
	/// - POINTER_TO_POINTER -> [NativePointerArray]
	/// - INT_POINTER -> [NativeIntArray]
	/// - BYTE_POINTER -> [NativeByteArray]
	/// - LONG_POINTER -> [NativeLongArray]
	/// - SHORT_POINTER -> [NativeShortArray]
	/// - FLOAT_POINTER -> [NativeFloatArray]
	/// - DOUBLE_POINTER -> [NativeDoubleArray]
	/// - STRING -> [String]
	/// 
	/// @throws RuntimeException If the NativeTypeKind is not a pointer type
	/// @throws RuntimeException If the NativeTypeKind cannot be converted to a java class
	public static String getPointerTypeClass(NativeTypeKind typeKind, Collection<String> requiredImports) {
		if (!typeKind.isPointer())
			throw new RuntimeException("TypeKind is not a pointer type.");

		switch (typeKind) {
			case POINTER, VOID_POINTER, FUNCTION_POINTER, ARRAY -> {
				requiredImports.add(MemorySegment.class.getCanonicalName());
				return MemorySegment.class.getSimpleName();
			}
			case POINTER_TO_POINTERS -> {
				requiredImports.add(NativePointerArray.class.getCanonicalName());
				return NativePointerArray.class.getSimpleName();
			}
			case INT_POINTER -> {
				requiredImports.add(NativeIntArray.class.getCanonicalName());
				return NativeIntArray.class.getSimpleName();
			}
			case BYTE_POINTER -> {
				requiredImports.add(NativeByteArray.class.getCanonicalName());
				return NativeByteArray.class.getSimpleName();
			}
			case LONG_POINTER -> {
				requiredImports.add(NativeLongArray.class.getCanonicalName());
				return NativeLongArray.class.getSimpleName();
			}
			case SHORT_POINTER -> {
				requiredImports.add(NativeShortArray.class.getCanonicalName());
				return NativeShortArray.class.getSimpleName();
			}
			case FLOAT_POINTER -> {
				requiredImports.add(NativeFloatArray.class.getCanonicalName());
				return NativeFloatArray.class.getSimpleName();
			}
			case DOUBLE_POINTER -> {
				requiredImports.add(NativeDoubleArray.class.getCanonicalName());
				return NativeDoubleArray.class.getSimpleName();
			}
			case STRING -> {
				return String.class.getSimpleName();
			}
			default -> {
				throw new RuntimeException("Failed to convert pointer type to java class " + typeKind);
			}
		}
	}

	/// Checks if the [NativeTypeKind] represents a raw segment.
	/// 
	/// Only returns true if the typeKind is either POINTER, VOID_POINTER or ARRAY.
	public static boolean isRawSegment(NativeTypeKind typeKind) {
		boolean check1 = typeKind == NativeTypeKind.POINTER;
		boolean check2 = typeKind == NativeTypeKind.VOID_POINTER;
		boolean check3 = typeKind == NativeTypeKind.ARRAY;
		return check1 || check2 || check3;
	}

}
