/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.libclang.enums;

public final class CXTranslationUnit_Flags {

    /// ```
    /// 
    /// Used to indicate that no special translation-unit options are
    /// needed.
    /// ```
    public static final int CX_TRANSLATION_UNIT_NONE = 0;
    /// ```
    /// 
    /// Used to indicate that the parser should construct a "detailed"
    /// preprocessing record, including all macro definitions and instantiations.
    /// 
    /// Constructing a detailed preprocessing record requires more memory
    /// and time to parse, since the information contained in the record
    /// is usually not retained. However, it can be useful for
    /// applications that require more detailed information about the
    /// behavior of the preprocessor.
    /// ```
    public static final int CX_TRANSLATION_UNIT_DETAILED_PREPROCESSING_RECORD = 1;
    /// ```
    /// 
    /// Used to indicate that the translation unit is incomplete.
    /// 
    /// When a translation unit is considered "incomplete", semantic
    /// analysis that is typically performed at the end of the
    /// translation unit will be suppressed. For example, this suppresses
    /// the completion of tentative declarations in C and of
    /// instantiation of implicitly-instantiation function templates in
    /// C++. This option is typically used when parsing a header with the
    /// intent of producing a precompiled header.
    /// ```
    public static final int CX_TRANSLATION_UNIT_INCOMPLETE = 2;
    /// ```
    /// 
    /// Used to indicate that the translation unit should be built with an
    /// implicit precompiled header for the preamble.
    /// 
    /// An implicit precompiled header is used as an optimization when a
    /// particular translation unit is likely to be reparsed many times
    /// when the sources aren't changing that often. In this case, an
    /// implicit precompiled header will be built containing all of the
    /// initial includes at the top of the main file (what we refer to as
    /// the "preamble" of the file). In subsequent parses, if the
    /// preamble or the files in it have not changed, \c
    /// clang_reparseTranslationUnit() will re-use the implicit
    /// precompiled header to improve parsing performance.
    /// ```
    public static final int CX_TRANSLATION_UNIT_PRECOMPILED_PREAMBLE = 4;
    /// ```
    /// 
    /// Used to indicate that the translation unit should cache some
    /// code-completion results with each reparse of the source file.
    /// 
    /// Caching of code-completion results is a performance optimization that
    /// introduces some overhead to reparsing but improves the performance of
    /// code-completion operations.
    /// ```
    public static final int CX_TRANSLATION_UNIT_CACHE_COMPLETION_RESULTS = 8;
    /// ```
    /// 
    /// Used to indicate that the translation unit will be serialized with
    /// \c clang_saveTranslationUnit.
    /// 
    /// This option is typically used when parsing a header with the intent of
    /// producing a precompiled header.
    /// ```
    public static final int CX_TRANSLATION_UNIT_FOR_SERIALIZATION = 16;
    /// ```
    /// 
    /// DEPRECATED: Enabled chained precompiled preambles in C++.
    /// 
    /// Note: this is a *temporary* option that is available only while
    /// we are testing C++ precompiled preamble support. It is deprecated.
    /// ```
    public static final int CX_TRANSLATION_UNIT_CXX_CHAINED_PCH = 32;
    /// ```
    /// 
    /// Used to indicate that function/method bodies should be skipped while
    /// parsing.
    /// 
    /// This option can be used to search for declarations/definitions while
    /// ignoring the usages.
    /// ```
    public static final int CX_TRANSLATION_UNIT_SKIP_FUNCTION_BODIES = 64;
    /// ```
    /// 
    /// Used to indicate that brief documentation comments should be
    /// included into the set of code completions returned from this translation
    /// unit.
    /// ```
    public static final int CX_TRANSLATION_UNIT_INCLUDE_BRIEF_COMMENTS_IN_CODE_COMPLETION = 128;
    /// ```
    /// 
    /// Used to indicate that the precompiled preamble should be created on
    /// the first parse. Otherwise it will be created on the first reparse. This
    /// trades runtime on the first parse (serializing the preamble takes time) for
    /// reduced runtime on the second parse (can now reuse the preamble).
    /// ```
    public static final int CX_TRANSLATION_UNIT_CREATE_PREAMBLE_ON_FIRST_PARSE = 256;
    /// ```
    /// 
    /// Do not stop processing when fatal errors are encountered.
    /// 
    /// When fatal errors are encountered while parsing a translation unit,
    /// semantic analysis is typically stopped early when compiling code. A common
    /// source for fatal errors are unresolvable include files. For the
    /// purposes of an IDE, this is undesirable behavior and as much information
    /// as possible should be reported. Use this flag to enable this behavior.
    /// ```
    public static final int CX_TRANSLATION_UNIT_KEEP_GOING = 512;
    /// ```
    /// 
    /// Sets the preprocessor in a mode for parsing a single file only.
    /// ```
    public static final int CX_TRANSLATION_UNIT_SINGLE_FILE_PARSE = 1024;
    /// ```
    /// 
    /// Used in combination with CXTranslationUnit_SkipFunctionBodies to
    /// constrain the skipping of function bodies to the preamble.
    /// 
    /// The function bodies of the main file are not skipped.
    /// ```
    public static final int CX_TRANSLATION_UNIT_LIMIT_SKIP_FUNCTION_BODIES_TO_PREAMBLE = 2048;
    /// ```
    /// 
    /// Used to indicate that attributed types should be included in CXType.
    /// ```
    public static final int CX_TRANSLATION_UNIT_INCLUDE_ATTRIBUTED_TYPES = 4096;
    /// ```
    /// 
    /// Used to indicate that implicit attributes should be visited.
    /// ```
    public static final int CX_TRANSLATION_UNIT_VISIT_IMPLICIT_ATTRIBUTES = 8192;
    /// ```
    /// 
    /// Used to indicate that non-errors from included files should be ignored.
    /// 
    /// If set, clang_getDiagnosticSetFromTU() will not report e.g. warnings from
    /// included files anymore. This speeds up clang_getDiagnosticSetFromTU() for
    /// the case where these warnings are not of interest, as for an IDE for
    /// example, which typically shows only the diagnostics in the main file.
    /// ```
    public static final int CX_TRANSLATION_UNIT_IGNORE_NON_ERRORS_FROM_INCLUDED_FILES = 16384;
    /// ```
    /// 
    /// Tells the preprocessor not to skip excluded conditional blocks.
    /// ```
    public static final int CX_TRANSLATION_UNIT_RETAIN_EXCLUDED_CONDITIONAL_BLOCKS = 32768;

}