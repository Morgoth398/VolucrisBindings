/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.libclang.enums;

public final class CXCodeComplete_Flags {

    /// ```
    /// 
    /// Whether to include macros within the set of code
    /// completions returned.
    /// ```
    public static final int CX_CODE_COMPLETE_INCLUDE_MACROS = 1;
    /// ```
    /// 
    /// Whether to include code patterns for language constructs
    /// within the set of code completions, e.g., for loops.
    /// ```
    public static final int CX_CODE_COMPLETE_INCLUDE_CODE_PATTERNS = 2;
    /// ```
    /// 
    /// Whether to include brief documentation within the set of code
    /// completions returned.
    /// ```
    public static final int CX_CODE_COMPLETE_INCLUDE_BRIEF_COMMENTS = 4;
    /// ```
    /// 
    /// Whether to speed up completion by omitting top- or namespace-level entities
    /// defined in the preamble. There's no guarantee any particular entity is
    /// omitted. This may be useful if the headers are indexed externally.
    /// ```
    public static final int CX_CODE_COMPLETE_SKIP_PREAMBLE = 8;
    /// ```
    /// 
    /// Whether to include completions with small
    /// fix-its, e.g. change '.' to '->' on member access, etc.
    /// ```
    public static final int CX_CODE_COMPLETE_INCLUDE_COMPLETIONS_WITH_FIX_ITS = 16;

}