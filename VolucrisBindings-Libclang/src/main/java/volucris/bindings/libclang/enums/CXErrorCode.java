/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.libclang.enums;

public final class CXErrorCode {

    /// ```
    /// 
    /// No error.
    /// ```
    public static final int CX_ERROR_SUCCESS = 0;
    /// ```
    /// 
    /// A generic error code, no further details are available.
    /// 
    /// Errors of this kind can get their own specific error codes in future
    /// libclang versions.
    /// ```
    public static final int CX_ERROR_FAILURE = 1;
    /// ```
    /// 
    /// libclang crashed while performing the requested operation.
    /// ```
    public static final int CX_ERROR_CRASHED = 2;
    /// ```
    /// 
    /// The function detected that the arguments violate the function
    /// contract.
    /// ```
    public static final int CX_ERROR_INVALID_ARGUMENTS = 3;
    /// ```
    /// 
    /// An AST deserialization error has occurred.
    /// ```
    public static final int CX_ERROR_AST_READ_ERROR = 4;

}