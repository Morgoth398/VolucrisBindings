/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.libclang.enums;

public final class CXIndexOptFlags {

    /// ```
    /// 
    /// Used to indicate that no special indexing options are needed.
    /// ```
    public static final int CX_INDEX_OPT_NONE = 0;
    /// ```
    /// 
    /// Used to indicate that IndexerCallbacks#indexEntityReference should
    /// be invoked for only one reference of an entity per source file that does
    /// not also include a declaration/definition of the entity.
    /// ```
    public static final int CX_INDEX_OPT_SUPPRESS_REDUNDANT_REFS = 1;
    /// ```
    /// 
    /// Function-local symbols should be indexed. If this is not set
    /// function-local symbols will be ignored.
    /// ```
    public static final int CX_INDEX_OPT_INDEX_FUNCTION_LOCAL_SYMBOLS = 2;
    /// ```
    /// 
    /// Implicit function/class template instantiations should be indexed.
    /// If this is not set, implicit instantiations will be ignored.
    /// ```
    public static final int CX_INDEX_OPT_INDEX_IMPLICIT_TEMPLATE_INSTANTIATIONS = 4;
    /// ```
    /// 
    /// Suppress all compiler warnings when parsing for indexing.
    /// ```
    public static final int CX_INDEX_OPT_SUPPRESS_WARNINGS = 8;
    /// ```
    /// 
    /// Skip a function/method body that was already parsed during an
    /// indexing session associated with a \c CXIndexAction object.
    /// Bodies in system headers are always skipped.
    /// ```
    public static final int CX_INDEX_OPT_SKIP_PARSED_BODIES_IN_SESSION = 16;

}