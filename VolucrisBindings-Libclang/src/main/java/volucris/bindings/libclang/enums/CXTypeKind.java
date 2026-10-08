/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.libclang.enums;

public final class CXTypeKind {

    /// ```
    /// 
    /// Represents an invalid type (e.g., where no type is available).
    /// ```
    public static final int CX_TYPE_INVALID = 0;
    /// ```
    /// 
    /// A type whose specific kind is not exposed via this
    /// interface.
    /// ```
    public static final int CX_TYPE_UNEXPOSED = 1;
    public static final int CX_TYPE_VOID = 2;
    public static final int CX_TYPE_BOOL = 3;
    public static final int CX_TYPE_CHAR_U = 4;
    public static final int CX_TYPE_U_CHAR = 5;
    public static final int CX_TYPE_CHAR16 = 6;
    public static final int CX_TYPE_CHAR32 = 7;
    public static final int CX_TYPE_U_SHORT = 8;
    public static final int CX_TYPE_U_INT = 9;
    public static final int CX_TYPE_U_LONG = 10;
    public static final int CX_TYPE_U_LONG_LONG = 11;
    public static final int CX_TYPE_U_INT128 = 12;
    public static final int CX_TYPE_CHAR_S = 13;
    public static final int CX_TYPE_S_CHAR = 14;
    public static final int CX_TYPE_W_CHAR = 15;
    public static final int CX_TYPE_SHORT = 16;
    public static final int CX_TYPE_INT = 17;
    public static final int CX_TYPE_LONG = 18;
    public static final int CX_TYPE_LONG_LONG = 19;
    public static final int CX_TYPE_INT128 = 20;
    public static final int CX_TYPE_FLOAT = 21;
    public static final int CX_TYPE_DOUBLE = 22;
    public static final int CX_TYPE_LONG_DOUBLE = 23;
    public static final int CX_TYPE_NULL_PTR = 24;
    public static final int CX_TYPE_OVERLOAD = 25;
    public static final int CX_TYPE_DEPENDENT = 26;
    public static final int CX_TYPE_OBJ_C_ID = 27;
    public static final int CX_TYPE_OBJ_C_CLASS = 28;
    public static final int CX_TYPE_OBJ_C_SEL = 29;
    public static final int CX_TYPE_FLOAT128 = 30;
    public static final int CX_TYPE_HALF = 31;
    public static final int CX_TYPE_FLOAT16 = 32;
    public static final int CX_TYPE_SHORT_ACCUM = 33;
    public static final int CX_TYPE_ACCUM = 34;
    public static final int CX_TYPE_LONG_ACCUM = 35;
    public static final int CX_TYPE_U_SHORT_ACCUM = 36;
    public static final int CX_TYPE_U_ACCUM = 37;
    public static final int CX_TYPE_U_LONG_ACCUM = 38;
    public static final int CX_TYPE_B_FLOAT16 = 39;
    public static final int CX_TYPE_IBM128 = 40;
    public static final int CX_TYPE_FIRST_BUILTIN = 2;
    public static final int CX_TYPE_LAST_BUILTIN = 40;
    public static final int CX_TYPE_COMPLEX = 100;
    public static final int CX_TYPE_POINTER = 101;
    public static final int CX_TYPE_BLOCK_POINTER = 102;
    public static final int CX_TYPE_L_VALUE_REFERENCE = 103;
    public static final int CX_TYPE_R_VALUE_REFERENCE = 104;
    public static final int CX_TYPE_RECORD = 105;
    public static final int CX_TYPE_ENUM = 106;
    public static final int CX_TYPE_TYPEDEF = 107;
    public static final int CX_TYPE_OBJ_C_INTERFACE = 108;
    public static final int CX_TYPE_OBJ_C_OBJECT_POINTER = 109;
    public static final int CX_TYPE_FUNCTION_NO_PROTO = 110;
    public static final int CX_TYPE_FUNCTION_PROTO = 111;
    public static final int CX_TYPE_CONSTANT_ARRAY = 112;
    public static final int CX_TYPE_VECTOR = 113;
    public static final int CX_TYPE_INCOMPLETE_ARRAY = 114;
    public static final int CX_TYPE_VARIABLE_ARRAY = 115;
    public static final int CX_TYPE_DEPENDENT_SIZED_ARRAY = 116;
    public static final int CX_TYPE_MEMBER_POINTER = 117;
    public static final int CX_TYPE_AUTO = 118;
    /// ```
    /// 
    /// Represents a type that was referred to using an elaborated type keyword.
    /// 
    /// E.g., struct S, or via a qualified name, e.g., N::M::type, or both.
    /// ```
    public static final int CX_TYPE_ELABORATED = 119;
    public static final int CX_TYPE_PIPE = 120;
    public static final int CX_TYPE_OCL_IMAGE1D_RO = 121;
    public static final int CX_TYPE_OCL_IMAGE1D_ARRAY_RO = 122;
    public static final int CX_TYPE_OCL_IMAGE1D_BUFFER_RO = 123;
    public static final int CX_TYPE_OCL_IMAGE2D_RO = 124;
    public static final int CX_TYPE_OCL_IMAGE2D_ARRAY_RO = 125;
    public static final int CX_TYPE_OCL_IMAGE2D_DEPTH_RO = 126;
    public static final int CX_TYPE_OCL_IMAGE2D_ARRAY_DEPTH_RO = 127;
    public static final int CX_TYPE_OCL_IMAGE2D_MSAARO = 128;
    public static final int CX_TYPE_OCL_IMAGE2D_ARRAY_MSAARO = 129;
    public static final int CX_TYPE_OCL_IMAGE2D_MSAA_DEPTH_RO = 130;
    public static final int CX_TYPE_OCL_IMAGE2D_ARRAY_MSAA_DEPTH_RO = 131;
    public static final int CX_TYPE_OCL_IMAGE3D_RO = 132;
    public static final int CX_TYPE_OCL_IMAGE1D_WO = 133;
    public static final int CX_TYPE_OCL_IMAGE1D_ARRAY_WO = 134;
    public static final int CX_TYPE_OCL_IMAGE1D_BUFFER_WO = 135;
    public static final int CX_TYPE_OCL_IMAGE2D_WO = 136;
    public static final int CX_TYPE_OCL_IMAGE2D_ARRAY_WO = 137;
    public static final int CX_TYPE_OCL_IMAGE2D_DEPTH_WO = 138;
    public static final int CX_TYPE_OCL_IMAGE2D_ARRAY_DEPTH_WO = 139;
    public static final int CX_TYPE_OCL_IMAGE2D_MSAAWO = 140;
    public static final int CX_TYPE_OCL_IMAGE2D_ARRAY_MSAAWO = 141;
    public static final int CX_TYPE_OCL_IMAGE2D_MSAA_DEPTH_WO = 142;
    public static final int CX_TYPE_OCL_IMAGE2D_ARRAY_MSAA_DEPTH_WO = 143;
    public static final int CX_TYPE_OCL_IMAGE3D_WO = 144;
    public static final int CX_TYPE_OCL_IMAGE1D_RW = 145;
    public static final int CX_TYPE_OCL_IMAGE1D_ARRAY_RW = 146;
    public static final int CX_TYPE_OCL_IMAGE1D_BUFFER_RW = 147;
    public static final int CX_TYPE_OCL_IMAGE2D_RW = 148;
    public static final int CX_TYPE_OCL_IMAGE2D_ARRAY_RW = 149;
    public static final int CX_TYPE_OCL_IMAGE2D_DEPTH_RW = 150;
    public static final int CX_TYPE_OCL_IMAGE2D_ARRAY_DEPTH_RW = 151;
    public static final int CX_TYPE_OCL_IMAGE2D_MSAARW = 152;
    public static final int CX_TYPE_OCL_IMAGE2D_ARRAY_MSAARW = 153;
    public static final int CX_TYPE_OCL_IMAGE2D_MSAA_DEPTH_RW = 154;
    public static final int CX_TYPE_OCL_IMAGE2D_ARRAY_MSAA_DEPTH_RW = 155;
    public static final int CX_TYPE_OCL_IMAGE3D_RW = 156;
    public static final int CX_TYPE_OCL_SAMPLER = 157;
    public static final int CX_TYPE_OCL_EVENT = 158;
    public static final int CX_TYPE_OCL_QUEUE = 159;
    public static final int CX_TYPE_OCL_RESERVE_ID = 160;
    public static final int CX_TYPE_OBJ_C_OBJECT = 161;
    public static final int CX_TYPE_OBJ_C_TYPE_PARAM = 162;
    public static final int CX_TYPE_ATTRIBUTED = 163;
    public static final int CX_TYPE_OCL_INTEL_SUBGROUP_AVC_MCE_PAYLOAD = 164;
    public static final int CX_TYPE_OCL_INTEL_SUBGROUP_AVC_IME_PAYLOAD = 165;
    public static final int CX_TYPE_OCL_INTEL_SUBGROUP_AVC_REF_PAYLOAD = 166;
    public static final int CX_TYPE_OCL_INTEL_SUBGROUP_AVC_SIC_PAYLOAD = 167;
    public static final int CX_TYPE_OCL_INTEL_SUBGROUP_AVC_MCE_RESULT = 168;
    public static final int CX_TYPE_OCL_INTEL_SUBGROUP_AVC_IME_RESULT = 169;
    public static final int CX_TYPE_OCL_INTEL_SUBGROUP_AVC_REF_RESULT = 170;
    public static final int CX_TYPE_OCL_INTEL_SUBGROUP_AVC_SIC_RESULT = 171;
    public static final int CX_TYPE_OCL_INTEL_SUBGROUP_AVC_IME_RESULT_SINGLE_REFERENCE_STREAMOUT = 172;
    public static final int CX_TYPE_OCL_INTEL_SUBGROUP_AVC_IME_RESULT_DUAL_REFERENCE_STREAMOUT = 173;
    public static final int CX_TYPE_OCL_INTEL_SUBGROUP_AVC_IME_SINGLE_REFERENCE_STREAMIN = 174;
    public static final int CX_TYPE_OCL_INTEL_SUBGROUP_AVC_IME_DUAL_REFERENCE_STREAMIN = 175;
    public static final int CX_TYPE_OCL_INTEL_SUBGROUP_AVC_IME_RESULT_SINGLE_REF_STREAMOUT = 172;
    public static final int CX_TYPE_OCL_INTEL_SUBGROUP_AVC_IME_RESULT_DUAL_REF_STREAMOUT = 173;
    public static final int CX_TYPE_OCL_INTEL_SUBGROUP_AVC_IME_SINGLE_REF_STREAMIN = 174;
    public static final int CX_TYPE_OCL_INTEL_SUBGROUP_AVC_IME_DUAL_REF_STREAMIN = 175;
    public static final int CX_TYPE_EXT_VECTOR = 176;
    public static final int CX_TYPE_ATOMIC = 177;
    public static final int CX_TYPE_BTF_TAG_ATTRIBUTED = 178;
    public static final int CX_TYPE_HLSL_RESOURCE = 179;
    public static final int CX_TYPE_HLSL_ATTRIBUTED_RESOURCE = 180;
    public static final int CX_TYPE_HLSL_INLINE_SPIRV = 181;
    public static final int CX_TYPE_PREDEFINED_SUGAR = 182;

}