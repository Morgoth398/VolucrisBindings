/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.libclang.enums;

public final class CXTypeNullabilityKind {

    /// ```
    /// 
    /// Values of this type can never be null.
    /// ```
    public static final int CX_TYPE_NULLABILITY_NON_NULL = 0;
    /// ```
    /// 
    /// Values of this type can be null.
    /// ```
    public static final int CX_TYPE_NULLABILITY_NULLABLE = 1;
    /// ```
    /// 
    /// Whether values of this type can be null is (explicitly)
    /// unspecified. This captures a (fairly rare) case where we
    /// can't conclude anything about the nullability of the type even
    /// though it has been considered.
    /// ```
    public static final int CX_TYPE_NULLABILITY_UNSPECIFIED = 2;
    /// ```
    /// 
    /// Nullability is not applicable to this type.
    /// ```
    public static final int CX_TYPE_NULLABILITY_INVALID = 3;
    /// ```
    /// 
    /// Generally behaves like Nullable, except when used in a block parameter that
    /// was imported into a swift async method. There, swift will assume that the
    /// parameter can get null even if no error occurred. _Nullable parameters are
    /// assumed to only get null on error.
    /// ```
    public static final int CX_TYPE_NULLABILITY_NULLABLE_RESULT = 4;

}