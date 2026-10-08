/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.libclang.enums;

public final class CXDiagnosticDisplayOptions {

    /// ```
    /// 
    /// Display the source-location information where the
    /// diagnostic was located.
    /// 
    /// When set, diagnostics will be prefixed by the file, line, and
    /// (optionally) column to which the diagnostic refers. For example,
    /// 
    /// \code
    /// test.c:28: warning: extra tokens at end of #endif directive
    /// \endcode
    /// 
    /// This option corresponds to the clang flag \c -fshow-source-location.
    /// ```
    public static final int CX_DIAGNOSTIC_DISPLAY_SOURCE_LOCATION = 1;
    /// ```
    /// 
    /// If displaying the source-location information of the
    /// diagnostic, also include the column number.
    /// 
    /// This option corresponds to the clang flag \c -fshow-column.
    /// ```
    public static final int CX_DIAGNOSTIC_DISPLAY_COLUMN = 2;
    /// ```
    /// 
    /// If displaying the source-location information of the
    /// diagnostic, also include information about source ranges in a
    /// machine-parsable format.
    /// 
    /// This option corresponds to the clang flag
    /// \c -fdiagnostics-print-source-range-info.
    /// ```
    public static final int CX_DIAGNOSTIC_DISPLAY_SOURCE_RANGES = 4;
    /// ```
    /// 
    /// Display the option name associated with this diagnostic, if any.
    /// 
    /// The option name displayed (e.g., -Wconversion) will be placed in brackets
    /// after the diagnostic text. This option corresponds to the clang flag
    /// \c -fdiagnostics-show-option.
    /// ```
    public static final int CX_DIAGNOSTIC_DISPLAY_OPTION = 8;
    /// ```
    /// 
    /// Display the category number associated with this diagnostic, if any.
    /// 
    /// The category number is displayed within brackets after the diagnostic text.
    /// This option corresponds to the clang flag
    /// \c -fdiagnostics-show-category=id.
    /// ```
    public static final int CX_DIAGNOSTIC_DISPLAY_CATEGORY_ID = 16;
    /// ```
    /// 
    /// Display the category name associated with this diagnostic, if any.
    /// 
    /// The category name is displayed within brackets after the diagnostic text.
    /// This option corresponds to the clang flag
    /// \c -fdiagnostics-show-category=name.
    /// ```
    public static final int CX_DIAGNOSTIC_DISPLAY_CATEGORY_NAME = 32;

}