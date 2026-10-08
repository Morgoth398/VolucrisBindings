/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.libclang.enums;

public final class CXCursor_ExceptionSpecificationKind {

    /// ```
    /// 
    /// The cursor has no exception specification.
    /// ```
    public static final int CX_CURSOR_EXCEPTION_SPECIFICATION_KIND_NONE = 0;
    /// ```
    /// 
    /// The cursor has exception specification throw()
    /// ```
    public static final int CX_CURSOR_EXCEPTION_SPECIFICATION_KIND_DYNAMIC_NONE = 1;
    /// ```
    /// 
    /// The cursor has exception specification throw(T1, T2)
    /// ```
    public static final int CX_CURSOR_EXCEPTION_SPECIFICATION_KIND_DYNAMIC = 2;
    /// ```
    /// 
    /// The cursor has exception specification throw(...).
    /// ```
    public static final int CX_CURSOR_EXCEPTION_SPECIFICATION_KIND_MS_ANY = 3;
    /// ```
    /// 
    /// The cursor has exception specification basic noexcept.
    /// ```
    public static final int CX_CURSOR_EXCEPTION_SPECIFICATION_KIND_BASIC_NOEXCEPT = 4;
    /// ```
    /// 
    /// The cursor has exception specification computed noexcept.
    /// ```
    public static final int CX_CURSOR_EXCEPTION_SPECIFICATION_KIND_COMPUTED_NOEXCEPT = 5;
    /// ```
    /// 
    /// The exception specification has not yet been evaluated.
    /// ```
    public static final int CX_CURSOR_EXCEPTION_SPECIFICATION_KIND_UNEVALUATED = 6;
    /// ```
    /// 
    /// The exception specification has not yet been instantiated.
    /// ```
    public static final int CX_CURSOR_EXCEPTION_SPECIFICATION_KIND_UNINSTANTIATED = 7;
    /// ```
    /// 
    /// The exception specification has not been parsed yet.
    /// ```
    public static final int CX_CURSOR_EXCEPTION_SPECIFICATION_KIND_UNPARSED = 8;
    /// ```
    /// 
    /// The cursor has a __declspec(nothrow) exception specification.
    /// ```
    public static final int CX_CURSOR_EXCEPTION_SPECIFICATION_KIND_NO_THROW = 9;

}