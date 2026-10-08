/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.libclang.enums;

public final class CXGlobalOptFlags {

    /// ```
    /// 
    /// Used to indicate that no special CXIndex options are needed.
    /// ```
    public static final int CX_GLOBAL_OPT_NONE = 0;
    /// ```
    /// 
    /// Used to indicate that threads that libclang creates for indexing
    /// purposes should use background priority.
    /// 
    /// Affects #clang_indexSourceFile, #clang_indexTranslationUnit,
    /// #clang_parseTranslationUnit, #clang_saveTranslationUnit.
    /// ```
    public static final int CX_GLOBAL_OPT_THREAD_BACKGROUND_PRIORITY_FOR_INDEXING = 1;
    /// ```
    /// 
    /// Used to indicate that threads that libclang creates for editing
    /// purposes should use background priority.
    /// 
    /// Affects #clang_reparseTranslationUnit, #clang_codeCompleteAt,
    /// #clang_annotateTokens
    /// ```
    public static final int CX_GLOBAL_OPT_THREAD_BACKGROUND_PRIORITY_FOR_EDITING = 2;
    /// ```
    /// 
    /// Used to indicate that all threads that libclang creates should use
    /// background priority.
    /// ```
    public static final int CX_GLOBAL_OPT_THREAD_BACKGROUND_PRIORITY_FOR_ALL = 3;

}