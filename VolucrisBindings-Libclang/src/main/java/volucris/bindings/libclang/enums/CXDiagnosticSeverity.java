/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.libclang.enums;

public final class CXDiagnosticSeverity {

    /// ```
    /// 
    /// A diagnostic that has been suppressed, e.g., by a command-line
    /// option.
    /// ```
    public static final int CX_DIAGNOSTIC_IGNORED = 0;
    /// ```
    /// 
    /// This diagnostic is a note that should be attached to the
    /// previous (non-note) diagnostic.
    /// ```
    public static final int CX_DIAGNOSTIC_NOTE = 1;
    /// ```
    /// 
    /// This diagnostic indicates suspicious code that may not be
    /// wrong.
    /// ```
    public static final int CX_DIAGNOSTIC_WARNING = 2;
    /// ```
    /// 
    /// This diagnostic indicates that the code is ill-formed.
    /// ```
    public static final int CX_DIAGNOSTIC_ERROR = 3;
    /// ```
    /// 
    /// This diagnostic indicates that the code is ill-formed such
    /// that future parser recovery is unlikely to produce useful
    /// results.
    /// ```
    public static final int CX_DIAGNOSTIC_FATAL = 4;

}