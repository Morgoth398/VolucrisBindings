/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.libclang.enums;

public final class CXSaveError {

    /// ```
    /// 
    /// Indicates that no error occurred while saving a translation unit.
    /// ```
    public static final int CX_SAVE_ERROR_NONE = 0;
    /// ```
    /// 
    /// Indicates that an unknown error occurred while attempting to save
    /// the file.
    /// 
    /// This error typically indicates that file I/O failed when attempting to
    /// write the file.
    /// ```
    public static final int CX_SAVE_ERROR_UNKNOWN = 1;
    /// ```
    /// 
    /// Indicates that errors during translation prevented this attempt
    /// to save the translation unit.
    /// 
    /// Errors that prevent the translation unit from being saved can be
    /// extracted using \c clang_getNumDiagnostics() and \c clang_getDiagnostic().
    /// ```
    public static final int CX_SAVE_ERROR_TRANSLATION_ERRORS = 2;
    /// ```
    /// 
    /// Indicates that the translation unit to be saved was somehow
    /// invalid (e.g., NULL).
    /// ```
    public static final int CX_SAVE_ERROR_INVALID_TU = 3;

}