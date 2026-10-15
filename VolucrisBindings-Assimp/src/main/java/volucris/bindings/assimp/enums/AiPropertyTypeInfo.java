/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.assimp.enums;

public final class AiPropertyTypeInfo {

    /// ```
    /// Array of single-precision (32 Bit) floats
    /// 
    /// It is possible to use aiGetMaterialInteger[Array]() (or the C++-API
    /// aiMaterial::Get()) to query properties stored in floating-point format.
    /// The material system performs the type conversion automatically.
    /// ```
    public static final int AI_PTI_FLOAT = 1;
    /// ```
    /// Array of double-precision (64 Bit) floats
    /// 
    /// It is possible to use aiGetMaterialInteger[Array]() (or the C++-API
    /// aiMaterial::Get()) to query properties stored in floating-point format.
    /// The material system performs the type conversion automatically.
    /// ```
    public static final int AI_PTI_DOUBLE = 2;
    /// ```
    /// The material property is an aiString.
    /// 
    /// Arrays of strings aren't possible, aiGetMaterialString() (or the
    /// C++-API aiMaterial::Get()) *must* be used to query a string property.
    /// ```
    public static final int AI_PTI_STRING = 3;
    /// ```
    /// Array of (32 Bit) integers
    /// 
    /// It is possible to use aiGetMaterialFloat[Array]() (or the C++-API
    /// aiMaterial::Get()) to query properties stored in integer format.
    /// The material system performs the type conversion automatically.
    /// ```
    public static final int AI_PTI_INTEGER = 4;
    /// ```
    /// Simple binary buffer, content undefined. Not convertible to anything.
    /// ```
    public static final int AI_PTI_BUFFER = 5;

}