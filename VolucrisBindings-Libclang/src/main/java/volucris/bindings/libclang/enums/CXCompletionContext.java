/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.libclang.enums;

public final class CXCompletionContext {

    /// ```
    /// 
    /// The context for completions is unexposed, as only Clang results
    /// should be included. (This is equivalent to having no context bits set.)
    /// ```
    public static final int CX_COMPLETION_CONTEXT_UNEXPOSED = 0;
    /// ```
    /// 
    /// Completions for any possible type should be included in the results.
    /// ```
    public static final int CX_COMPLETION_CONTEXT_ANY_TYPE = 1;
    /// ```
    /// 
    /// Completions for any possible value (variables, function calls, etc.)
    /// should be included in the results.
    /// ```
    public static final int CX_COMPLETION_CONTEXT_ANY_VALUE = 2;
    /// ```
    /// 
    /// Completions for values that resolve to an Objective-C object should
    /// be included in the results.
    /// ```
    public static final int CX_COMPLETION_CONTEXT_OBJ_C_OBJECT_VALUE = 4;
    /// ```
    /// 
    /// Completions for values that resolve to an Objective-C selector
    /// should be included in the results.
    /// ```
    public static final int CX_COMPLETION_CONTEXT_OBJ_C_SELECTOR_VALUE = 8;
    /// ```
    /// 
    /// Completions for values that resolve to a C++ class type should be
    /// included in the results.
    /// ```
    public static final int CX_COMPLETION_CONTEXT_CXX_CLASS_TYPE_VALUE = 16;
    /// ```
    /// 
    /// Completions for fields of the member being accessed using the dot
    /// operator should be included in the results.
    /// ```
    public static final int CX_COMPLETION_CONTEXT_DOT_MEMBER_ACCESS = 32;
    /// ```
    /// 
    /// Completions for fields of the member being accessed using the arrow
    /// operator should be included in the results.
    /// ```
    public static final int CX_COMPLETION_CONTEXT_ARROW_MEMBER_ACCESS = 64;
    /// ```
    /// 
    /// Completions for properties of the Objective-C object being accessed
    /// using the dot operator should be included in the results.
    /// ```
    public static final int CX_COMPLETION_CONTEXT_OBJ_C_PROPERTY_ACCESS = 128;
    /// ```
    /// 
    /// Completions for enum tags should be included in the results.
    /// ```
    public static final int CX_COMPLETION_CONTEXT_ENUM_TAG = 256;
    /// ```
    /// 
    /// Completions for union tags should be included in the results.
    /// ```
    public static final int CX_COMPLETION_CONTEXT_UNION_TAG = 512;
    /// ```
    /// 
    /// Completions for struct tags should be included in the results.
    /// ```
    public static final int CX_COMPLETION_CONTEXT_STRUCT_TAG = 1024;
    /// ```
    /// 
    /// Completions for C++ class names should be included in the results.
    /// ```
    public static final int CX_COMPLETION_CONTEXT_CLASS_TAG = 2048;
    /// ```
    /// 
    /// Completions for C++ namespaces and namespace aliases should be
    /// included in the results.
    /// ```
    public static final int CX_COMPLETION_CONTEXT_NAMESPACE = 4096;
    /// ```
    /// 
    /// Completions for C++ nested name specifiers should be included in
    /// the results.
    /// ```
    public static final int CX_COMPLETION_CONTEXT_NESTED_NAME_SPECIFIER = 8192;
    /// ```
    /// 
    /// Completions for Objective-C interfaces (classes) should be included
    /// in the results.
    /// ```
    public static final int CX_COMPLETION_CONTEXT_OBJ_C_INTERFACE = 16384;
    /// ```
    /// 
    /// Completions for Objective-C protocols should be included in
    /// the results.
    /// ```
    public static final int CX_COMPLETION_CONTEXT_OBJ_C_PROTOCOL = 32768;
    /// ```
    /// 
    /// Completions for Objective-C categories should be included in
    /// the results.
    /// ```
    public static final int CX_COMPLETION_CONTEXT_OBJ_C_CATEGORY = 65536;
    /// ```
    /// 
    /// Completions for Objective-C instance messages should be included
    /// in the results.
    /// ```
    public static final int CX_COMPLETION_CONTEXT_OBJ_C_INSTANCE_MESSAGE = 131072;
    /// ```
    /// 
    /// Completions for Objective-C class messages should be included in
    /// the results.
    /// ```
    public static final int CX_COMPLETION_CONTEXT_OBJ_C_CLASS_MESSAGE = 262144;
    /// ```
    /// 
    /// Completions for Objective-C selector names should be included in
    /// the results.
    /// ```
    public static final int CX_COMPLETION_CONTEXT_OBJ_C_SELECTOR_NAME = 524288;
    /// ```
    /// 
    /// Completions for preprocessor macro names should be included in
    /// the results.
    /// ```
    public static final int CX_COMPLETION_CONTEXT_MACRO_NAME = 1048576;
    /// ```
    /// 
    /// Natural language completions should be included in the results.
    /// ```
    public static final int CX_COMPLETION_CONTEXT_NATURAL_LANGUAGE = 2097152;
    /// ```
    /// 
    /// #include file completions should be included in the results.
    /// ```
    public static final int CX_COMPLETION_CONTEXT_INCLUDED_FILE = 4194304;
    /// ```
    /// 
    /// The current context is unknown, so set all contexts.
    /// ```
    public static final int CX_COMPLETION_CONTEXT_UNKNOWN = 8388607;

}