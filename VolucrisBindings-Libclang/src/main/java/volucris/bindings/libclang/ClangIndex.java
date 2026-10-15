/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.libclang;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.MethodHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.MemoryStack;
import volucris.bindings.core.NativeByteArray;
import volucris.bindings.core.NativeIntArray;
import volucris.bindings.core.NativeLongArray;
import volucris.bindings.core.NativePointerArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.libclang.structs.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class ClangIndex {

	private static final LazyConstant<MethodHandle> CLANG_GET_CSTRING;
	private static final LazyConstant<MethodHandle> CLANG_DISPOSE_STRING;
	private static final LazyConstant<MethodHandle> CLANG_DISPOSE_STRING_SET;
	private static final LazyConstant<MethodHandle> CLANG_GET_BUILD_SESSION_TIMESTAMP;
	private static final LazyConstant<MethodHandle> CLANG_VIRTUAL_FILE_OVERLAY_CREATE;
	private static final LazyConstant<MethodHandle> CLANG_VIRTUAL_FILE_OVERLAY_ADD_FILE_MAPPING;
	private static final LazyConstant<MethodHandle> CLANG_VIRTUAL_FILE_OVERLAY_SET_CASE_SENSITIVITY;
	private static final LazyConstant<MethodHandle> CLANG_VIRTUAL_FILE_OVERLAY_WRITE_TO_BUFFER;
	private static final LazyConstant<MethodHandle> CLANG_FREE;
	private static final LazyConstant<MethodHandle> CLANG_VIRTUAL_FILE_OVERLAY_DISPOSE;
	private static final LazyConstant<MethodHandle> CLANG_MODULE_MAP_DESCRIPTOR_CREATE;
	private static final LazyConstant<MethodHandle> CLANG_MODULE_MAP_DESCRIPTOR_SET_FRAMEWORK_MODULE_NAME;
	private static final LazyConstant<MethodHandle> CLANG_MODULE_MAP_DESCRIPTOR_SET_UMBRELLA_HEADER;
	private static final LazyConstant<MethodHandle> CLANG_MODULE_MAP_DESCRIPTOR_WRITE_TO_BUFFER;
	private static final LazyConstant<MethodHandle> CLANG_MODULE_MAP_DESCRIPTOR_DISPOSE;
	private static final LazyConstant<MethodHandle> CLANG_MODULE_CACHE_PRUNE;
	private static final LazyConstant<MethodHandle> CLANG_MODULE_CACHE_PRUNE_WITH_CALLBACK;
	private static final LazyConstant<MethodHandle> CLANG_GET_FILE_NAME;
	private static final LazyConstant<MethodHandle> CLANG_GET_FILE_TIME;
	private static final LazyConstant<MethodHandle> CLANG_GET_FILE_UNIQUE_ID;
	private static final LazyConstant<MethodHandle> CLANG_FILE_IS_EQUAL;
	private static final LazyConstant<MethodHandle> CLANG_FILE_TRY_GET_REAL_PATH_NAME;
	private static final LazyConstant<MethodHandle> CLANG_GET_NULL_LOCATION;
	private static final LazyConstant<MethodHandle> CLANG_EQUAL_LOCATIONS;
	private static final LazyConstant<MethodHandle> CLANG_IS_BEFORE_IN_TRANSLATION_UNIT;
	private static final LazyConstant<MethodHandle> CLANG_LOCATION_IS_IN_SYSTEM_HEADER;
	private static final LazyConstant<MethodHandle> CLANG_LOCATION_IS_FROM_MAIN_FILE;
	private static final LazyConstant<MethodHandle> CLANG_GET_NULL_RANGE;
	private static final LazyConstant<MethodHandle> CLANG_GET_RANGE;
	private static final LazyConstant<MethodHandle> CLANG_EQUAL_RANGES;
	private static final LazyConstant<MethodHandle> CLANG_RANGE_IS_NULL;
	private static final LazyConstant<MethodHandle> CLANG_GET_EXPANSION_LOCATION;
	private static final LazyConstant<MethodHandle> CLANG_GET_PRESUMED_LOCATION;
	private static final LazyConstant<MethodHandle> CLANG_GET_INSTANTIATION_LOCATION;
	private static final LazyConstant<MethodHandle> CLANG_GET_SPELLING_LOCATION;
	private static final LazyConstant<MethodHandle> CLANG_GET_FILE_LOCATION;
	private static final LazyConstant<MethodHandle> CLANG_GET_RANGE_START;
	private static final LazyConstant<MethodHandle> CLANG_GET_RANGE_END;
	private static final LazyConstant<MethodHandle> CLANG_DISPOSE_SOURCE_RANGE_LIST;
	private static final LazyConstant<MethodHandle> CLANG_GET_NUM_DIAGNOSTICS_IN_SET;
	private static final LazyConstant<MethodHandle> CLANG_GET_DIAGNOSTIC_IN_SET;
	private static final LazyConstant<MethodHandle> CLANG_LOAD_DIAGNOSTICS;
	private static final LazyConstant<MethodHandle> CLANG_DISPOSE_DIAGNOSTIC_SET;
	private static final LazyConstant<MethodHandle> CLANG_GET_CHILD_DIAGNOSTICS;
	private static final LazyConstant<MethodHandle> CLANG_DISPOSE_DIAGNOSTIC;
	private static final LazyConstant<MethodHandle> CLANG_FORMAT_DIAGNOSTIC;
	private static final LazyConstant<MethodHandle> CLANG_DEFAULT_DIAGNOSTIC_DISPLAY_OPTIONS;
	private static final LazyConstant<MethodHandle> CLANG_GET_DIAGNOSTIC_SEVERITY;
	private static final LazyConstant<MethodHandle> CLANG_GET_DIAGNOSTIC_LOCATION;
	private static final LazyConstant<MethodHandle> CLANG_GET_DIAGNOSTIC_SPELLING;
	private static final LazyConstant<MethodHandle> CLANG_GET_DIAGNOSTIC_OPTION;
	private static final LazyConstant<MethodHandle> CLANG_GET_DIAGNOSTIC_CATEGORY;
	private static final LazyConstant<MethodHandle> CLANG_GET_DIAGNOSTIC_CATEGORY_NAME;
	private static final LazyConstant<MethodHandle> CLANG_GET_DIAGNOSTIC_CATEGORY_TEXT;
	private static final LazyConstant<MethodHandle> CLANG_GET_DIAGNOSTIC_NUM_RANGES;
	private static final LazyConstant<MethodHandle> CLANG_GET_DIAGNOSTIC_RANGE;
	private static final LazyConstant<MethodHandle> CLANG_GET_DIAGNOSTIC_NUM_FIX_ITS;
	private static final LazyConstant<MethodHandle> CLANG_GET_DIAGNOSTIC_FIX_IT;
	private static final LazyConstant<MethodHandle> CLANG_CREATE_INDEX;
	private static final LazyConstant<MethodHandle> CLANG_DISPOSE_INDEX;
	private static final LazyConstant<MethodHandle> CLANG_CREATE_INDEX_WITH_OPTIONS;
	private static final LazyConstant<MethodHandle> CLANG_CXINDEX_SET_GLOBAL_OPTIONS;
	private static final LazyConstant<MethodHandle> CLANG_CXINDEX_GET_GLOBAL_OPTIONS;
	private static final LazyConstant<MethodHandle> CLANG_CXINDEX_SET_INVOCATION_EMISSION_PATH_OPTION;
	private static final LazyConstant<MethodHandle> CLANG_IS_FILE_MULTIPLE_INCLUDE_GUARDED;
	private static final LazyConstant<MethodHandle> CLANG_GET_FILE;
	private static final LazyConstant<MethodHandle> CLANG_GET_FILE_CONTENTS;
	private static final LazyConstant<MethodHandle> CLANG_GET_LOCATION;
	private static final LazyConstant<MethodHandle> CLANG_GET_LOCATION_FOR_OFFSET;
	private static final LazyConstant<MethodHandle> CLANG_GET_SKIPPED_RANGES;
	private static final LazyConstant<MethodHandle> CLANG_GET_ALL_SKIPPED_RANGES;
	private static final LazyConstant<MethodHandle> CLANG_GET_NUM_DIAGNOSTICS;
	private static final LazyConstant<MethodHandle> CLANG_GET_DIAGNOSTIC;
	private static final LazyConstant<MethodHandle> CLANG_GET_DIAGNOSTIC_SET_FROM_TU;
	private static final LazyConstant<MethodHandle> CLANG_GET_TRANSLATION_UNIT_SPELLING;
	private static final LazyConstant<MethodHandle> CLANG_CREATE_TRANSLATION_UNIT_FROM_SOURCE_FILE;
	private static final LazyConstant<MethodHandle> CLANG_CREATE_TRANSLATION_UNIT;
	private static final LazyConstant<MethodHandle> CLANG_CREATE_TRANSLATION_UNIT2;
	private static final LazyConstant<MethodHandle> CLANG_DEFAULT_EDITING_TRANSLATION_UNIT_OPTIONS;
	private static final LazyConstant<MethodHandle> CLANG_PARSE_TRANSLATION_UNIT;
	private static final LazyConstant<MethodHandle> CLANG_PARSE_TRANSLATION_UNIT2;
	private static final LazyConstant<MethodHandle> CLANG_PARSE_TRANSLATION_UNIT2_FULL_ARGV;
	private static final LazyConstant<MethodHandle> CLANG_DEFAULT_SAVE_OPTIONS;
	private static final LazyConstant<MethodHandle> CLANG_SAVE_TRANSLATION_UNIT;
	private static final LazyConstant<MethodHandle> CLANG_SUSPEND_TRANSLATION_UNIT;
	private static final LazyConstant<MethodHandle> CLANG_DISPOSE_TRANSLATION_UNIT;
	private static final LazyConstant<MethodHandle> CLANG_DEFAULT_REPARSE_OPTIONS;
	private static final LazyConstant<MethodHandle> CLANG_REPARSE_TRANSLATION_UNIT;
	private static final LazyConstant<MethodHandle> CLANG_GET_TURESOURCE_USAGE_NAME;
	private static final LazyConstant<MethodHandle> CLANG_GET_CXTURESOURCE_USAGE;
	private static final LazyConstant<MethodHandle> CLANG_DISPOSE_CXTURESOURCE_USAGE;
	private static final LazyConstant<MethodHandle> CLANG_GET_TRANSLATION_UNIT_TARGET_INFO;
	private static final LazyConstant<MethodHandle> CLANG_TARGET_INFO_DISPOSE;
	private static final LazyConstant<MethodHandle> CLANG_TARGET_INFO_GET_TRIPLE;
	private static final LazyConstant<MethodHandle> CLANG_TARGET_INFO_GET_POINTER_WIDTH;
	private static final LazyConstant<MethodHandle> CLANG_GET_NULL_CURSOR;
	private static final LazyConstant<MethodHandle> CLANG_GET_TRANSLATION_UNIT_CURSOR;
	private static final LazyConstant<MethodHandle> CLANG_EQUAL_CURSORS;
	private static final LazyConstant<MethodHandle> CLANG_CURSOR_IS_NULL;
	private static final LazyConstant<MethodHandle> CLANG_HASH_CURSOR;
	private static final LazyConstant<MethodHandle> CLANG_GET_CURSOR_KIND;
	private static final LazyConstant<MethodHandle> CLANG_IS_DECLARATION;
	private static final LazyConstant<MethodHandle> CLANG_IS_INVALID_DECLARATION;
	private static final LazyConstant<MethodHandle> CLANG_IS_REFERENCE;
	private static final LazyConstant<MethodHandle> CLANG_IS_EXPRESSION;
	private static final LazyConstant<MethodHandle> CLANG_IS_STATEMENT;
	private static final LazyConstant<MethodHandle> CLANG_IS_ATTRIBUTE;
	private static final LazyConstant<MethodHandle> CLANG_CURSOR_HAS_ATTRS;
	private static final LazyConstant<MethodHandle> CLANG_IS_INVALID;
	private static final LazyConstant<MethodHandle> CLANG_IS_TRANSLATION_UNIT;
	private static final LazyConstant<MethodHandle> CLANG_IS_PREPROCESSING;
	private static final LazyConstant<MethodHandle> CLANG_IS_UNEXPOSED;
	private static final LazyConstant<MethodHandle> CLANG_GET_CURSOR_LINKAGE;
	private static final LazyConstant<MethodHandle> CLANG_GET_CURSOR_VISIBILITY;
	private static final LazyConstant<MethodHandle> CLANG_GET_CURSOR_AVAILABILITY;
	private static final LazyConstant<MethodHandle> CLANG_GET_CURSOR_PLATFORM_AVAILABILITY;
	private static final LazyConstant<MethodHandle> CLANG_DISPOSE_CXPLATFORM_AVAILABILITY;
	private static final LazyConstant<MethodHandle> CLANG_CURSOR_GET_VAR_DECL_INITIALIZER;
	private static final LazyConstant<MethodHandle> CLANG_CURSOR_HAS_VAR_DECL_GLOBAL_STORAGE;
	private static final LazyConstant<MethodHandle> CLANG_CURSOR_HAS_VAR_DECL_EXTERNAL_STORAGE;
	private static final LazyConstant<MethodHandle> CLANG_GET_CURSOR_LANGUAGE;
	private static final LazyConstant<MethodHandle> CLANG_GET_CURSOR_TLSKIND;
	private static final LazyConstant<MethodHandle> CLANG_CURSOR_GET_TRANSLATION_UNIT;
	private static final LazyConstant<MethodHandle> CLANG_CREATE_CXCURSOR_SET;
	private static final LazyConstant<MethodHandle> CLANG_DISPOSE_CXCURSOR_SET;
	private static final LazyConstant<MethodHandle> CLANG_CXCURSOR_SET_CONTAINS;
	private static final LazyConstant<MethodHandle> CLANG_CXCURSOR_SET_INSERT;
	private static final LazyConstant<MethodHandle> CLANG_GET_CURSOR_SEMANTIC_PARENT;
	private static final LazyConstant<MethodHandle> CLANG_GET_CURSOR_LEXICAL_PARENT;
	private static final LazyConstant<MethodHandle> CLANG_GET_OVERRIDDEN_CURSORS;
	private static final LazyConstant<MethodHandle> CLANG_DISPOSE_OVERRIDDEN_CURSORS;
	private static final LazyConstant<MethodHandle> CLANG_GET_INCLUDED_FILE;
	private static final LazyConstant<MethodHandle> CLANG_GET_CURSOR;
	private static final LazyConstant<MethodHandle> CLANG_GET_CURSOR_LOCATION;
	private static final LazyConstant<MethodHandle> CLANG_GET_CURSOR_EXTENT;
	private static final LazyConstant<MethodHandle> CLANG_GET_CURSOR_TYPE;
	private static final LazyConstant<MethodHandle> CLANG_GET_TYPE_SPELLING;
	private static final LazyConstant<MethodHandle> CLANG_GET_TYPEDEF_DECL_UNDERLYING_TYPE;
	private static final LazyConstant<MethodHandle> CLANG_GET_ENUM_DECL_INTEGER_TYPE;
	private static final LazyConstant<MethodHandle> CLANG_GET_ENUM_CONSTANT_DECL_VALUE;
	private static final LazyConstant<MethodHandle> CLANG_GET_ENUM_CONSTANT_DECL_UNSIGNED_VALUE;
	private static final LazyConstant<MethodHandle> CLANG_CURSOR_IS_BIT_FIELD;
	private static final LazyConstant<MethodHandle> CLANG_GET_FIELD_DECL_BIT_WIDTH;
	private static final LazyConstant<MethodHandle> CLANG_CURSOR_GET_NUM_ARGUMENTS;
	private static final LazyConstant<MethodHandle> CLANG_CURSOR_GET_ARGUMENT;
	private static final LazyConstant<MethodHandle> CLANG_CURSOR_GET_NUM_TEMPLATE_ARGUMENTS;
	private static final LazyConstant<MethodHandle> CLANG_CURSOR_GET_TEMPLATE_ARGUMENT_KIND;
	private static final LazyConstant<MethodHandle> CLANG_CURSOR_GET_TEMPLATE_ARGUMENT_TYPE;
	private static final LazyConstant<MethodHandle> CLANG_CURSOR_GET_TEMPLATE_ARGUMENT_VALUE;
	private static final LazyConstant<MethodHandle> CLANG_CURSOR_GET_TEMPLATE_ARGUMENT_UNSIGNED_VALUE;
	private static final LazyConstant<MethodHandle> CLANG_EQUAL_TYPES;
	private static final LazyConstant<MethodHandle> CLANG_GET_CANONICAL_TYPE;
	private static final LazyConstant<MethodHandle> CLANG_IS_CONST_QUALIFIED_TYPE;
	private static final LazyConstant<MethodHandle> CLANG_CURSOR_IS_MACRO_FUNCTION_LIKE;
	private static final LazyConstant<MethodHandle> CLANG_CURSOR_IS_MACRO_BUILTIN;
	private static final LazyConstant<MethodHandle> CLANG_CURSOR_IS_FUNCTION_INLINED;
	private static final LazyConstant<MethodHandle> CLANG_IS_VOLATILE_QUALIFIED_TYPE;
	private static final LazyConstant<MethodHandle> CLANG_IS_RESTRICT_QUALIFIED_TYPE;
	private static final LazyConstant<MethodHandle> CLANG_GET_ADDRESS_SPACE;
	private static final LazyConstant<MethodHandle> CLANG_GET_TYPEDEF_NAME;
	private static final LazyConstant<MethodHandle> CLANG_GET_POINTEE_TYPE;
	private static final LazyConstant<MethodHandle> CLANG_GET_UNQUALIFIED_TYPE;
	private static final LazyConstant<MethodHandle> CLANG_GET_NON_REFERENCE_TYPE;
	private static final LazyConstant<MethodHandle> CLANG_GET_TYPE_DECLARATION;
	private static final LazyConstant<MethodHandle> CLANG_GET_DECL_OBJ_CTYPE_ENCODING;
	private static final LazyConstant<MethodHandle> CLANG_TYPE_GET_OBJ_CENCODING;
	private static final LazyConstant<MethodHandle> CLANG_GET_TYPE_KIND_SPELLING;
	private static final LazyConstant<MethodHandle> CLANG_GET_FUNCTION_TYPE_CALLING_CONV;
	private static final LazyConstant<MethodHandle> CLANG_GET_RESULT_TYPE;
	private static final LazyConstant<MethodHandle> CLANG_GET_EXCEPTION_SPECIFICATION_TYPE;
	private static final LazyConstant<MethodHandle> CLANG_GET_NUM_ARG_TYPES;
	private static final LazyConstant<MethodHandle> CLANG_GET_ARG_TYPE;
	private static final LazyConstant<MethodHandle> CLANG_TYPE_GET_OBJ_COBJECT_BASE_TYPE;
	private static final LazyConstant<MethodHandle> CLANG_TYPE_GET_NUM_OBJ_CPROTOCOL_REFS;
	private static final LazyConstant<MethodHandle> CLANG_TYPE_GET_OBJ_CPROTOCOL_DECL;
	private static final LazyConstant<MethodHandle> CLANG_TYPE_GET_NUM_OBJ_CTYPE_ARGS;
	private static final LazyConstant<MethodHandle> CLANG_TYPE_GET_OBJ_CTYPE_ARG;
	private static final LazyConstant<MethodHandle> CLANG_IS_FUNCTION_TYPE_VARIADIC;
	private static final LazyConstant<MethodHandle> CLANG_GET_CURSOR_RESULT_TYPE;
	private static final LazyConstant<MethodHandle> CLANG_GET_CURSOR_EXCEPTION_SPECIFICATION_TYPE;
	private static final LazyConstant<MethodHandle> CLANG_IS_PODTYPE;
	private static final LazyConstant<MethodHandle> CLANG_GET_ELEMENT_TYPE;
	private static final LazyConstant<MethodHandle> CLANG_GET_NUM_ELEMENTS;
	private static final LazyConstant<MethodHandle> CLANG_GET_ARRAY_ELEMENT_TYPE;
	private static final LazyConstant<MethodHandle> CLANG_GET_ARRAY_SIZE;
	private static final LazyConstant<MethodHandle> CLANG_TYPE_GET_NAMED_TYPE;
	private static final LazyConstant<MethodHandle> CLANG_TYPE_IS_TRANSPARENT_TAG_TYPEDEF;
	private static final LazyConstant<MethodHandle> CLANG_TYPE_GET_NULLABILITY;
	private static final LazyConstant<MethodHandle> CLANG_TYPE_GET_ALIGN_OF;
	private static final LazyConstant<MethodHandle> CLANG_TYPE_GET_CLASS_TYPE;
	private static final LazyConstant<MethodHandle> CLANG_TYPE_GET_SIZE_OF;
	private static final LazyConstant<MethodHandle> CLANG_TYPE_GET_OFFSET_OF;
	private static final LazyConstant<MethodHandle> CLANG_TYPE_GET_MODIFIED_TYPE;
	private static final LazyConstant<MethodHandle> CLANG_TYPE_GET_VALUE_TYPE;
	private static final LazyConstant<MethodHandle> CLANG_CURSOR_GET_OFFSET_OF_FIELD;
	private static final LazyConstant<MethodHandle> CLANG_CURSOR_IS_ANONYMOUS;
	private static final LazyConstant<MethodHandle> CLANG_CURSOR_IS_ANONYMOUS_RECORD_DECL;
	private static final LazyConstant<MethodHandle> CLANG_CURSOR_IS_INLINE_NAMESPACE;
	private static final LazyConstant<MethodHandle> CLANG_TYPE_GET_NUM_TEMPLATE_ARGUMENTS;
	private static final LazyConstant<MethodHandle> CLANG_TYPE_GET_TEMPLATE_ARGUMENT_AS_TYPE;
	private static final LazyConstant<MethodHandle> CLANG_TYPE_GET_CXXREF_QUALIFIER;
	private static final LazyConstant<MethodHandle> CLANG_IS_VIRTUAL_BASE;
	private static final LazyConstant<MethodHandle> CLANG_GET_OFFSET_OF_BASE;
	private static final LazyConstant<MethodHandle> CLANG_GET_CXXACCESS_SPECIFIER;
	private static final LazyConstant<MethodHandle> CLANG_CURSOR_GET_BINARY_OPCODE;
	private static final LazyConstant<MethodHandle> CLANG_CURSOR_GET_BINARY_OPCODE_STR;
	private static final LazyConstant<MethodHandle> CLANG_CURSOR_GET_STORAGE_CLASS;
	private static final LazyConstant<MethodHandle> CLANG_GET_NUM_OVERLOADED_DECLS;
	private static final LazyConstant<MethodHandle> CLANG_GET_OVERLOADED_DECL;
	private static final LazyConstant<MethodHandle> CLANG_GET_IBOUTLET_COLLECTION_TYPE;
	private static final LazyConstant<MethodHandle> CLANG_VISIT_CHILDREN;
	private static final LazyConstant<MethodHandle> CLANG_GET_CURSOR_USR;
	private static final LazyConstant<MethodHandle> CLANG_CONSTRUCT_USR_OBJ_CCLASS;
	private static final LazyConstant<MethodHandle> CLANG_CONSTRUCT_USR_OBJ_CCATEGORY;
	private static final LazyConstant<MethodHandle> CLANG_CONSTRUCT_USR_OBJ_CPROTOCOL;
	private static final LazyConstant<MethodHandle> CLANG_CONSTRUCT_USR_OBJ_CIVAR;
	private static final LazyConstant<MethodHandle> CLANG_CONSTRUCT_USR_OBJ_CMETHOD;
	private static final LazyConstant<MethodHandle> CLANG_CONSTRUCT_USR_OBJ_CPROPERTY;
	private static final LazyConstant<MethodHandle> CLANG_GET_CURSOR_SPELLING;
	private static final LazyConstant<MethodHandle> CLANG_CURSOR_GET_SPELLING_NAME_RANGE;
	private static final LazyConstant<MethodHandle> CLANG_PRINTING_POLICY_GET_PROPERTY;
	private static final LazyConstant<MethodHandle> CLANG_PRINTING_POLICY_SET_PROPERTY;
	private static final LazyConstant<MethodHandle> CLANG_GET_CURSOR_PRINTING_POLICY;
	private static final LazyConstant<MethodHandle> CLANG_PRINTING_POLICY_DISPOSE;
	private static final LazyConstant<MethodHandle> CLANG_GET_CURSOR_PRETTY_PRINTED;
	private static final LazyConstant<MethodHandle> CLANG_GET_TYPE_PRETTY_PRINTED;
	private static final LazyConstant<MethodHandle> CLANG_GET_FULLY_QUALIFIED_NAME;
	private static final LazyConstant<MethodHandle> CLANG_GET_CURSOR_DISPLAY_NAME;
	private static final LazyConstant<MethodHandle> CLANG_GET_CURSOR_REFERENCED;
	private static final LazyConstant<MethodHandle> CLANG_GET_CURSOR_DEFINITION;
	private static final LazyConstant<MethodHandle> CLANG_IS_CURSOR_DEFINITION;
	private static final LazyConstant<MethodHandle> CLANG_GET_CANONICAL_CURSOR;
	private static final LazyConstant<MethodHandle> CLANG_CURSOR_GET_OBJ_CSELECTOR_INDEX;
	private static final LazyConstant<MethodHandle> CLANG_CURSOR_IS_DYNAMIC_CALL;
	private static final LazyConstant<MethodHandle> CLANG_CURSOR_GET_RECEIVER_TYPE;
	private static final LazyConstant<MethodHandle> CLANG_CURSOR_GET_OBJ_CPROPERTY_ATTRIBUTES;
	private static final LazyConstant<MethodHandle> CLANG_CURSOR_GET_OBJ_CPROPERTY_GETTER_NAME;
	private static final LazyConstant<MethodHandle> CLANG_CURSOR_GET_OBJ_CPROPERTY_SETTER_NAME;
	private static final LazyConstant<MethodHandle> CLANG_CURSOR_GET_OBJ_CDECL_QUALIFIERS;
	private static final LazyConstant<MethodHandle> CLANG_CURSOR_IS_OBJ_COPTIONAL;
	private static final LazyConstant<MethodHandle> CLANG_CURSOR_IS_VARIADIC;
	private static final LazyConstant<MethodHandle> CLANG_CURSOR_IS_EXTERNAL_SYMBOL;
	private static final LazyConstant<MethodHandle> CLANG_CURSOR_GET_COMMENT_RANGE;
	private static final LazyConstant<MethodHandle> CLANG_CURSOR_GET_RAW_COMMENT_TEXT;
	private static final LazyConstant<MethodHandle> CLANG_CURSOR_GET_BRIEF_COMMENT_TEXT;
	private static final LazyConstant<MethodHandle> CLANG_CURSOR_GET_MANGLING;
	private static final LazyConstant<MethodHandle> CLANG_CURSOR_GET_CXXMANGLINGS;
	private static final LazyConstant<MethodHandle> CLANG_CURSOR_GET_OBJ_CMANGLINGS;
	private static final LazyConstant<MethodHandle> CLANG_CURSOR_GET_GCCASSEMBLY_TEMPLATE;
	private static final LazyConstant<MethodHandle> CLANG_CURSOR_IS_GCCASSEMBLY_HAS_GOTO;
	private static final LazyConstant<MethodHandle> CLANG_CURSOR_GET_GCCASSEMBLY_NUM_OUTPUTS;
	private static final LazyConstant<MethodHandle> CLANG_CURSOR_GET_GCCASSEMBLY_NUM_INPUTS;
	private static final LazyConstant<MethodHandle> CLANG_CURSOR_GET_GCCASSEMBLY_INPUT;
	private static final LazyConstant<MethodHandle> CLANG_CURSOR_GET_GCCASSEMBLY_OUTPUT;
	private static final LazyConstant<MethodHandle> CLANG_CURSOR_GET_GCCASSEMBLY_NUM_CLOBBERS;
	private static final LazyConstant<MethodHandle> CLANG_CURSOR_GET_GCCASSEMBLY_CLOBBER;
	private static final LazyConstant<MethodHandle> CLANG_CURSOR_IS_GCCASSEMBLY_VOLATILE;
	private static final LazyConstant<MethodHandle> CLANG_CURSOR_GET_MODULE;
	private static final LazyConstant<MethodHandle> CLANG_GET_MODULE_FOR_FILE;
	private static final LazyConstant<MethodHandle> CLANG_MODULE_GET_ASTFILE;
	private static final LazyConstant<MethodHandle> CLANG_MODULE_GET_PARENT;
	private static final LazyConstant<MethodHandle> CLANG_MODULE_GET_NAME;
	private static final LazyConstant<MethodHandle> CLANG_MODULE_GET_FULL_NAME;
	private static final LazyConstant<MethodHandle> CLANG_MODULE_IS_SYSTEM;
	private static final LazyConstant<MethodHandle> CLANG_MODULE_GET_NUM_TOP_LEVEL_HEADERS;
	private static final LazyConstant<MethodHandle> CLANG_MODULE_GET_TOP_LEVEL_HEADER;
	private static final LazyConstant<MethodHandle> CLANG_CXXCONSTRUCTOR_IS_CONVERTING_CONSTRUCTOR;
	private static final LazyConstant<MethodHandle> CLANG_CXXCONSTRUCTOR_IS_COPY_CONSTRUCTOR;
	private static final LazyConstant<MethodHandle> CLANG_CXXCONSTRUCTOR_IS_DEFAULT_CONSTRUCTOR;
	private static final LazyConstant<MethodHandle> CLANG_CXXCONSTRUCTOR_IS_MOVE_CONSTRUCTOR;
	private static final LazyConstant<MethodHandle> CLANG_CXXFIELD_IS_MUTABLE;
	private static final LazyConstant<MethodHandle> CLANG_CXXMETHOD_IS_DEFAULTED;
	private static final LazyConstant<MethodHandle> CLANG_CXXMETHOD_IS_DELETED;
	private static final LazyConstant<MethodHandle> CLANG_CXXMETHOD_IS_PURE_VIRTUAL;
	private static final LazyConstant<MethodHandle> CLANG_CXXMETHOD_IS_STATIC;
	private static final LazyConstant<MethodHandle> CLANG_CXXMETHOD_IS_VIRTUAL;
	private static final LazyConstant<MethodHandle> CLANG_CXXMETHOD_IS_COPY_ASSIGNMENT_OPERATOR;
	private static final LazyConstant<MethodHandle> CLANG_CXXMETHOD_IS_MOVE_ASSIGNMENT_OPERATOR;
	private static final LazyConstant<MethodHandle> CLANG_CXXMETHOD_IS_EXPLICIT;
	private static final LazyConstant<MethodHandle> CLANG_CXXRECORD_IS_ABSTRACT;
	private static final LazyConstant<MethodHandle> CLANG_ENUM_DECL_IS_SCOPED;
	private static final LazyConstant<MethodHandle> CLANG_CXXMETHOD_IS_CONST;
	private static final LazyConstant<MethodHandle> CLANG_GET_TEMPLATE_CURSOR_KIND;
	private static final LazyConstant<MethodHandle> CLANG_GET_SPECIALIZED_CURSOR_TEMPLATE;
	private static final LazyConstant<MethodHandle> CLANG_GET_CURSOR_REFERENCE_NAME_RANGE;
	private static final LazyConstant<MethodHandle> CLANG_GET_TOKEN;
	private static final LazyConstant<MethodHandle> CLANG_GET_TOKEN_KIND;
	private static final LazyConstant<MethodHandle> CLANG_GET_TOKEN_SPELLING;
	private static final LazyConstant<MethodHandle> CLANG_GET_TOKEN_LOCATION;
	private static final LazyConstant<MethodHandle> CLANG_GET_TOKEN_EXTENT;
	private static final LazyConstant<MethodHandle> CLANG_TOKENIZE;
	private static final LazyConstant<MethodHandle> CLANG_ANNOTATE_TOKENS;
	private static final LazyConstant<MethodHandle> CLANG_DISPOSE_TOKENS;
	private static final LazyConstant<MethodHandle> CLANG_GET_CURSOR_KIND_SPELLING;
	private static final LazyConstant<MethodHandle> CLANG_GET_DEFINITION_SPELLING_AND_EXTENT;
	private static final LazyConstant<MethodHandle> CLANG_ENABLE_STACK_TRACES;
	private static final LazyConstant<MethodHandle> CLANG_GET_COMPLETION_CHUNK_KIND;
	private static final LazyConstant<MethodHandle> CLANG_GET_COMPLETION_CHUNK_TEXT;
	private static final LazyConstant<MethodHandle> CLANG_GET_COMPLETION_CHUNK_COMPLETION_STRING;
	private static final LazyConstant<MethodHandle> CLANG_GET_NUM_COMPLETION_CHUNKS;
	private static final LazyConstant<MethodHandle> CLANG_GET_COMPLETION_PRIORITY;
	private static final LazyConstant<MethodHandle> CLANG_GET_COMPLETION_AVAILABILITY;
	private static final LazyConstant<MethodHandle> CLANG_GET_COMPLETION_NUM_ANNOTATIONS;
	private static final LazyConstant<MethodHandle> CLANG_GET_COMPLETION_ANNOTATION;
	private static final LazyConstant<MethodHandle> CLANG_GET_COMPLETION_PARENT;
	private static final LazyConstant<MethodHandle> CLANG_GET_COMPLETION_BRIEF_COMMENT;
	private static final LazyConstant<MethodHandle> CLANG_GET_CURSOR_COMPLETION_STRING;
	private static final LazyConstant<MethodHandle> CLANG_GET_COMPLETION_NUM_FIX_ITS;
	private static final LazyConstant<MethodHandle> CLANG_GET_COMPLETION_FIX_IT;
	private static final LazyConstant<MethodHandle> CLANG_DEFAULT_CODE_COMPLETE_OPTIONS;
	private static final LazyConstant<MethodHandle> CLANG_CODE_COMPLETE_AT;
	private static final LazyConstant<MethodHandle> CLANG_SORT_CODE_COMPLETION_RESULTS;
	private static final LazyConstant<MethodHandle> CLANG_DISPOSE_CODE_COMPLETE_RESULTS;
	private static final LazyConstant<MethodHandle> CLANG_CODE_COMPLETE_GET_NUM_DIAGNOSTICS;
	private static final LazyConstant<MethodHandle> CLANG_CODE_COMPLETE_GET_DIAGNOSTIC;
	private static final LazyConstant<MethodHandle> CLANG_CODE_COMPLETE_GET_CONTEXTS;
	private static final LazyConstant<MethodHandle> CLANG_CODE_COMPLETE_GET_CONTAINER_KIND;
	private static final LazyConstant<MethodHandle> CLANG_CODE_COMPLETE_GET_CONTAINER_USR;
	private static final LazyConstant<MethodHandle> CLANG_CODE_COMPLETE_GET_OBJ_CSELECTOR;
	private static final LazyConstant<MethodHandle> CLANG_GET_CLANG_VERSION;
	private static final LazyConstant<MethodHandle> CLANG_TOGGLE_CRASH_RECOVERY;
	private static final LazyConstant<MethodHandle> CLANG_GET_INCLUSIONS;
	private static final LazyConstant<MethodHandle> CLANG_CURSOR_EVALUATE;
	private static final LazyConstant<MethodHandle> CLANG_EVAL_RESULT_GET_KIND;
	private static final LazyConstant<MethodHandle> CLANG_EVAL_RESULT_GET_AS_INT;
	private static final LazyConstant<MethodHandle> CLANG_EVAL_RESULT_GET_AS_LONG_LONG;
	private static final LazyConstant<MethodHandle> CLANG_EVAL_RESULT_IS_UNSIGNED_INT;
	private static final LazyConstant<MethodHandle> CLANG_EVAL_RESULT_GET_AS_UNSIGNED;
	private static final LazyConstant<MethodHandle> CLANG_EVAL_RESULT_GET_AS_DOUBLE;
	private static final LazyConstant<MethodHandle> CLANG_EVAL_RESULT_GET_AS_STR;
	private static final LazyConstant<MethodHandle> CLANG_EVAL_RESULT_DISPOSE;
	private static final LazyConstant<MethodHandle> CLANG_FIND_REFERENCES_IN_FILE;
	private static final LazyConstant<MethodHandle> CLANG_FIND_INCLUDES_IN_FILE;
	private static final LazyConstant<MethodHandle> CLANG_INDEX_IS_ENTITY_OBJ_CCONTAINER_KIND;
	private static final LazyConstant<MethodHandle> CLANG_INDEX_GET_OBJ_CCONTAINER_DECL_INFO;
	private static final LazyConstant<MethodHandle> CLANG_INDEX_GET_OBJ_CINTERFACE_DECL_INFO;
	private static final LazyConstant<MethodHandle> CLANG_INDEX_GET_OBJ_CCATEGORY_DECL_INFO;
	private static final LazyConstant<MethodHandle> CLANG_INDEX_GET_OBJ_CPROTOCOL_REF_LIST_INFO;
	private static final LazyConstant<MethodHandle> CLANG_INDEX_GET_OBJ_CPROPERTY_DECL_INFO;
	private static final LazyConstant<MethodHandle> CLANG_INDEX_GET_IBOUTLET_COLLECTION_ATTR_INFO;
	private static final LazyConstant<MethodHandle> CLANG_INDEX_GET_CXXCLASS_DECL_INFO;
	private static final LazyConstant<MethodHandle> CLANG_INDEX_GET_CLIENT_CONTAINER;
	private static final LazyConstant<MethodHandle> CLANG_INDEX_SET_CLIENT_CONTAINER;
	private static final LazyConstant<MethodHandle> CLANG_INDEX_GET_CLIENT_ENTITY;
	private static final LazyConstant<MethodHandle> CLANG_INDEX_SET_CLIENT_ENTITY;
	private static final LazyConstant<MethodHandle> CLANG_INDEX_ACTION_CREATE;
	private static final LazyConstant<MethodHandle> CLANG_INDEX_ACTION_DISPOSE;
	private static final LazyConstant<MethodHandle> CLANG_INDEX_SOURCE_FILE;
	private static final LazyConstant<MethodHandle> CLANG_INDEX_SOURCE_FILE_FULL_ARGV;
	private static final LazyConstant<MethodHandle> CLANG_INDEX_TRANSLATION_UNIT;
	private static final LazyConstant<MethodHandle> CLANG_INDEX_LOC_GET_FILE_LOCATION;
	private static final LazyConstant<MethodHandle> CLANG_INDEX_LOC_GET_CXSOURCE_LOCATION;
	private static final LazyConstant<MethodHandle> CLANG_TYPE_VISIT_FIELDS;
	private static final LazyConstant<MethodHandle> CLANG_VISIT_CXXBASE_CLASSES;
	private static final LazyConstant<MethodHandle> CLANG_VISIT_CXXMETHODS;
	private static final LazyConstant<MethodHandle> CLANG_GET_BINARY_OPERATOR_KIND_SPELLING;
	private static final LazyConstant<MethodHandle> CLANG_GET_CURSOR_BINARY_OPERATOR_KIND;
	private static final LazyConstant<MethodHandle> CLANG_GET_UNARY_OPERATOR_KIND_SPELLING;
	private static final LazyConstant<MethodHandle> CLANG_GET_CURSOR_UNARY_OPERATOR_KIND;
	private static final LazyConstant<MethodHandle> CLANG_GET_REMAPPINGS;
	private static final LazyConstant<MethodHandle> CLANG_GET_REMAPPINGS_FROM_FILE_LIST;
	private static final LazyConstant<MethodHandle> CLANG_REMAP_GET_NUM_FILES;
	private static final LazyConstant<MethodHandle> CLANG_REMAP_GET_FILENAMES;
	private static final LazyConstant<MethodHandle> CLANG_REMAP_DISPOSE;

	static {
		//@formatter:off
		CLANG_GET_CSTRING = downcallHandle("clang_getCString", UNBOUNDED_ADDRESS, CXString.LAYOUT);
		CLANG_DISPOSE_STRING = downcallHandleVoid("clang_disposeString", CXString.LAYOUT);
		CLANG_DISPOSE_STRING_SET = downcallHandleVoid("clang_disposeStringSet", UNBOUNDED_ADDRESS);
		CLANG_GET_BUILD_SESSION_TIMESTAMP = downcallHandle("clang_getBuildSessionTimestamp", JAVA_LONG);
		CLANG_VIRTUAL_FILE_OVERLAY_CREATE = downcallHandle("clang_VirtualFileOverlay_create", UNBOUNDED_ADDRESS, JAVA_INT);
		CLANG_VIRTUAL_FILE_OVERLAY_ADD_FILE_MAPPING = downcallHandle("clang_VirtualFileOverlay_addFileMapping", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		CLANG_VIRTUAL_FILE_OVERLAY_SET_CASE_SENSITIVITY = downcallHandle("clang_VirtualFileOverlay_setCaseSensitivity", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT);
		CLANG_VIRTUAL_FILE_OVERLAY_WRITE_TO_BUFFER = downcallHandle("clang_VirtualFileOverlay_writeToBuffer", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		CLANG_FREE = downcallHandleVoid("clang_free", UNBOUNDED_ADDRESS);
		CLANG_VIRTUAL_FILE_OVERLAY_DISPOSE = downcallHandleVoid("clang_VirtualFileOverlay_dispose", UNBOUNDED_ADDRESS);
		CLANG_MODULE_MAP_DESCRIPTOR_CREATE = downcallHandle("clang_ModuleMapDescriptor_create", UNBOUNDED_ADDRESS, JAVA_INT);
		CLANG_MODULE_MAP_DESCRIPTOR_SET_FRAMEWORK_MODULE_NAME = downcallHandle("clang_ModuleMapDescriptor_setFrameworkModuleName", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		CLANG_MODULE_MAP_DESCRIPTOR_SET_UMBRELLA_HEADER = downcallHandle("clang_ModuleMapDescriptor_setUmbrellaHeader", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		CLANG_MODULE_MAP_DESCRIPTOR_WRITE_TO_BUFFER = downcallHandle("clang_ModuleMapDescriptor_writeToBuffer", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		CLANG_MODULE_MAP_DESCRIPTOR_DISPOSE = downcallHandleVoid("clang_ModuleMapDescriptor_dispose", UNBOUNDED_ADDRESS);
		CLANG_MODULE_CACHE_PRUNE = downcallHandleVoid("clang_ModuleCache_prune", UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG);
		CLANG_MODULE_CACHE_PRUNE_WITH_CALLBACK = downcallHandleVoid("clang_ModuleCache_pruneWithCallback", UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		CLANG_GET_FILE_NAME = downcallHandle("clang_getFileName", CXString.LAYOUT, UNBOUNDED_ADDRESS);
		CLANG_GET_FILE_TIME = downcallHandle("clang_getFileTime", JAVA_LONG, UNBOUNDED_ADDRESS);
		CLANG_GET_FILE_UNIQUE_ID = downcallHandle("clang_getFileUniqueID", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		CLANG_FILE_IS_EQUAL = downcallHandle("clang_File_isEqual", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		CLANG_FILE_TRY_GET_REAL_PATH_NAME = downcallHandle("clang_File_tryGetRealPathName", CXString.LAYOUT, UNBOUNDED_ADDRESS);
		CLANG_GET_NULL_LOCATION = downcallHandle("clang_getNullLocation", CXSourceLocation.LAYOUT);
		CLANG_EQUAL_LOCATIONS = downcallHandle("clang_equalLocations", JAVA_INT, CXSourceLocation.LAYOUT, CXSourceLocation.LAYOUT);
		CLANG_IS_BEFORE_IN_TRANSLATION_UNIT = downcallHandle("clang_isBeforeInTranslationUnit", JAVA_INT, CXSourceLocation.LAYOUT, CXSourceLocation.LAYOUT);
		CLANG_LOCATION_IS_IN_SYSTEM_HEADER = downcallHandle("clang_Location_isInSystemHeader", JAVA_INT, CXSourceLocation.LAYOUT);
		CLANG_LOCATION_IS_FROM_MAIN_FILE = downcallHandle("clang_Location_isFromMainFile", JAVA_INT, CXSourceLocation.LAYOUT);
		CLANG_GET_NULL_RANGE = downcallHandle("clang_getNullRange", CXSourceRange.LAYOUT);
		CLANG_GET_RANGE = downcallHandle("clang_getRange", CXSourceRange.LAYOUT, CXSourceLocation.LAYOUT, CXSourceLocation.LAYOUT);
		CLANG_EQUAL_RANGES = downcallHandle("clang_equalRanges", JAVA_INT, CXSourceRange.LAYOUT, CXSourceRange.LAYOUT);
		CLANG_RANGE_IS_NULL = downcallHandle("clang_Range_isNull", JAVA_INT, CXSourceRange.LAYOUT);
		CLANG_GET_EXPANSION_LOCATION = downcallHandleVoid("clang_getExpansionLocation", CXSourceLocation.LAYOUT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		CLANG_GET_PRESUMED_LOCATION = downcallHandleVoid("clang_getPresumedLocation", CXSourceLocation.LAYOUT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		CLANG_GET_INSTANTIATION_LOCATION = downcallHandleVoid("clang_getInstantiationLocation", CXSourceLocation.LAYOUT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		CLANG_GET_SPELLING_LOCATION = downcallHandleVoid("clang_getSpellingLocation", CXSourceLocation.LAYOUT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		CLANG_GET_FILE_LOCATION = downcallHandleVoid("clang_getFileLocation", CXSourceLocation.LAYOUT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		CLANG_GET_RANGE_START = downcallHandle("clang_getRangeStart", CXSourceLocation.LAYOUT, CXSourceRange.LAYOUT);
		CLANG_GET_RANGE_END = downcallHandle("clang_getRangeEnd", CXSourceLocation.LAYOUT, CXSourceRange.LAYOUT);
		CLANG_DISPOSE_SOURCE_RANGE_LIST = downcallHandleVoid("clang_disposeSourceRangeList", UNBOUNDED_ADDRESS);
		CLANG_GET_NUM_DIAGNOSTICS_IN_SET = downcallHandle("clang_getNumDiagnosticsInSet", JAVA_INT, UNBOUNDED_ADDRESS);
		CLANG_GET_DIAGNOSTIC_IN_SET = downcallHandle("clang_getDiagnosticInSet", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
		CLANG_LOAD_DIAGNOSTICS = downcallHandle("clang_loadDiagnostics", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		CLANG_DISPOSE_DIAGNOSTIC_SET = downcallHandleVoid("clang_disposeDiagnosticSet", UNBOUNDED_ADDRESS);
		CLANG_GET_CHILD_DIAGNOSTICS = downcallHandle("clang_getChildDiagnostics", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		CLANG_DISPOSE_DIAGNOSTIC = downcallHandleVoid("clang_disposeDiagnostic", UNBOUNDED_ADDRESS);
		CLANG_FORMAT_DIAGNOSTIC = downcallHandle("clang_formatDiagnostic", CXString.LAYOUT, UNBOUNDED_ADDRESS, JAVA_INT);
		CLANG_DEFAULT_DIAGNOSTIC_DISPLAY_OPTIONS = downcallHandle("clang_defaultDiagnosticDisplayOptions", JAVA_INT);
		CLANG_GET_DIAGNOSTIC_SEVERITY = downcallHandle("clang_getDiagnosticSeverity", JAVA_INT, UNBOUNDED_ADDRESS);
		CLANG_GET_DIAGNOSTIC_LOCATION = downcallHandle("clang_getDiagnosticLocation", CXSourceLocation.LAYOUT, UNBOUNDED_ADDRESS);
		CLANG_GET_DIAGNOSTIC_SPELLING = downcallHandle("clang_getDiagnosticSpelling", CXString.LAYOUT, UNBOUNDED_ADDRESS);
		CLANG_GET_DIAGNOSTIC_OPTION = downcallHandle("clang_getDiagnosticOption", CXString.LAYOUT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		CLANG_GET_DIAGNOSTIC_CATEGORY = downcallHandle("clang_getDiagnosticCategory", JAVA_INT, UNBOUNDED_ADDRESS);
		CLANG_GET_DIAGNOSTIC_CATEGORY_NAME = downcallHandle("clang_getDiagnosticCategoryName", CXString.LAYOUT, JAVA_INT);
		CLANG_GET_DIAGNOSTIC_CATEGORY_TEXT = downcallHandle("clang_getDiagnosticCategoryText", CXString.LAYOUT, UNBOUNDED_ADDRESS);
		CLANG_GET_DIAGNOSTIC_NUM_RANGES = downcallHandle("clang_getDiagnosticNumRanges", JAVA_INT, UNBOUNDED_ADDRESS);
		CLANG_GET_DIAGNOSTIC_RANGE = downcallHandle("clang_getDiagnosticRange", CXSourceRange.LAYOUT, UNBOUNDED_ADDRESS, JAVA_INT);
		CLANG_GET_DIAGNOSTIC_NUM_FIX_ITS = downcallHandle("clang_getDiagnosticNumFixIts", JAVA_INT, UNBOUNDED_ADDRESS);
		CLANG_GET_DIAGNOSTIC_FIX_IT = downcallHandle("clang_getDiagnosticFixIt", CXString.LAYOUT, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
		CLANG_CREATE_INDEX = downcallHandle("clang_createIndex", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
		CLANG_DISPOSE_INDEX = downcallHandleVoid("clang_disposeIndex", UNBOUNDED_ADDRESS);
		CLANG_CREATE_INDEX_WITH_OPTIONS = downcallHandle("clang_createIndexWithOptions", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		CLANG_CXINDEX_SET_GLOBAL_OPTIONS = downcallHandleVoid("clang_CXIndex_setGlobalOptions", UNBOUNDED_ADDRESS, JAVA_INT);
		CLANG_CXINDEX_GET_GLOBAL_OPTIONS = downcallHandle("clang_CXIndex_getGlobalOptions", JAVA_INT, UNBOUNDED_ADDRESS);
		CLANG_CXINDEX_SET_INVOCATION_EMISSION_PATH_OPTION = downcallHandleVoid("clang_CXIndex_setInvocationEmissionPathOption", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		CLANG_IS_FILE_MULTIPLE_INCLUDE_GUARDED = downcallHandle("clang_isFileMultipleIncludeGuarded", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		CLANG_GET_FILE = downcallHandle("clang_getFile", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		CLANG_GET_FILE_CONTENTS = downcallHandle("clang_getFileContents", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		CLANG_GET_LOCATION = downcallHandle("clang_getLocation", CXSourceLocation.LAYOUT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
		CLANG_GET_LOCATION_FOR_OFFSET = downcallHandle("clang_getLocationForOffset", CXSourceLocation.LAYOUT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
		CLANG_GET_SKIPPED_RANGES = downcallHandle("clang_getSkippedRanges", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		CLANG_GET_ALL_SKIPPED_RANGES = downcallHandle("clang_getAllSkippedRanges", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		CLANG_GET_NUM_DIAGNOSTICS = downcallHandle("clang_getNumDiagnostics", JAVA_INT, UNBOUNDED_ADDRESS);
		CLANG_GET_DIAGNOSTIC = downcallHandle("clang_getDiagnostic", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
		CLANG_GET_DIAGNOSTIC_SET_FROM_TU = downcallHandle("clang_getDiagnosticSetFromTU", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		CLANG_GET_TRANSLATION_UNIT_SPELLING = downcallHandle("clang_getTranslationUnitSpelling", CXString.LAYOUT, UNBOUNDED_ADDRESS);
		CLANG_CREATE_TRANSLATION_UNIT_FROM_SOURCE_FILE = downcallHandle("clang_createTranslationUnitFromSourceFile", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
		CLANG_CREATE_TRANSLATION_UNIT = downcallHandle("clang_createTranslationUnit", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		CLANG_CREATE_TRANSLATION_UNIT2 = downcallHandle("clang_createTranslationUnit2", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		CLANG_DEFAULT_EDITING_TRANSLATION_UNIT_OPTIONS = downcallHandle("clang_defaultEditingTranslationUnitOptions", JAVA_INT);
		CLANG_PARSE_TRANSLATION_UNIT = downcallHandle("clang_parseTranslationUnit", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
		CLANG_PARSE_TRANSLATION_UNIT2 = downcallHandle("clang_parseTranslationUnit2", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		CLANG_PARSE_TRANSLATION_UNIT2_FULL_ARGV = downcallHandle("clang_parseTranslationUnit2FullArgv", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		CLANG_DEFAULT_SAVE_OPTIONS = downcallHandle("clang_defaultSaveOptions", JAVA_INT, UNBOUNDED_ADDRESS);
		CLANG_SAVE_TRANSLATION_UNIT = downcallHandle("clang_saveTranslationUnit", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
		CLANG_SUSPEND_TRANSLATION_UNIT = downcallHandle("clang_suspendTranslationUnit", JAVA_INT, UNBOUNDED_ADDRESS);
		CLANG_DISPOSE_TRANSLATION_UNIT = downcallHandleVoid("clang_disposeTranslationUnit", UNBOUNDED_ADDRESS);
		CLANG_DEFAULT_REPARSE_OPTIONS = downcallHandle("clang_defaultReparseOptions", JAVA_INT, UNBOUNDED_ADDRESS);
		CLANG_REPARSE_TRANSLATION_UNIT = downcallHandle("clang_reparseTranslationUnit", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT);
		CLANG_GET_TURESOURCE_USAGE_NAME = downcallHandle("clang_getTUResourceUsageName", UNBOUNDED_ADDRESS, JAVA_INT);
		CLANG_GET_CXTURESOURCE_USAGE = downcallHandle("clang_getCXTUResourceUsage", CXTUResourceUsage.LAYOUT, UNBOUNDED_ADDRESS);
		CLANG_DISPOSE_CXTURESOURCE_USAGE = downcallHandleVoid("clang_disposeCXTUResourceUsage", CXTUResourceUsage.LAYOUT);
		CLANG_GET_TRANSLATION_UNIT_TARGET_INFO = downcallHandle("clang_getTranslationUnitTargetInfo", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		CLANG_TARGET_INFO_DISPOSE = downcallHandleVoid("clang_TargetInfo_dispose", UNBOUNDED_ADDRESS);
		CLANG_TARGET_INFO_GET_TRIPLE = downcallHandle("clang_TargetInfo_getTriple", CXString.LAYOUT, UNBOUNDED_ADDRESS);
		CLANG_TARGET_INFO_GET_POINTER_WIDTH = downcallHandle("clang_TargetInfo_getPointerWidth", JAVA_INT, UNBOUNDED_ADDRESS);
		CLANG_GET_NULL_CURSOR = downcallHandle("clang_getNullCursor", CXCursor.LAYOUT);
		CLANG_GET_TRANSLATION_UNIT_CURSOR = downcallHandle("clang_getTranslationUnitCursor", CXCursor.LAYOUT, UNBOUNDED_ADDRESS);
		CLANG_EQUAL_CURSORS = downcallHandle("clang_equalCursors", JAVA_INT, CXCursor.LAYOUT, CXCursor.LAYOUT);
		CLANG_CURSOR_IS_NULL = downcallHandle("clang_Cursor_isNull", JAVA_INT, CXCursor.LAYOUT);
		CLANG_HASH_CURSOR = downcallHandle("clang_hashCursor", JAVA_INT, CXCursor.LAYOUT);
		CLANG_GET_CURSOR_KIND = downcallHandle("clang_getCursorKind", JAVA_INT, CXCursor.LAYOUT);
		CLANG_IS_DECLARATION = downcallHandle("clang_isDeclaration", JAVA_INT, JAVA_INT);
		CLANG_IS_INVALID_DECLARATION = downcallHandle("clang_isInvalidDeclaration", JAVA_INT, CXCursor.LAYOUT);
		CLANG_IS_REFERENCE = downcallHandle("clang_isReference", JAVA_INT, JAVA_INT);
		CLANG_IS_EXPRESSION = downcallHandle("clang_isExpression", JAVA_INT, JAVA_INT);
		CLANG_IS_STATEMENT = downcallHandle("clang_isStatement", JAVA_INT, JAVA_INT);
		CLANG_IS_ATTRIBUTE = downcallHandle("clang_isAttribute", JAVA_INT, JAVA_INT);
		CLANG_CURSOR_HAS_ATTRS = downcallHandle("clang_Cursor_hasAttrs", JAVA_INT, CXCursor.LAYOUT);
		CLANG_IS_INVALID = downcallHandle("clang_isInvalid", JAVA_INT, JAVA_INT);
		CLANG_IS_TRANSLATION_UNIT = downcallHandle("clang_isTranslationUnit", JAVA_INT, JAVA_INT);
		CLANG_IS_PREPROCESSING = downcallHandle("clang_isPreprocessing", JAVA_INT, JAVA_INT);
		CLANG_IS_UNEXPOSED = downcallHandle("clang_isUnexposed", JAVA_INT, JAVA_INT);
		CLANG_GET_CURSOR_LINKAGE = downcallHandle("clang_getCursorLinkage", JAVA_INT, CXCursor.LAYOUT);
		CLANG_GET_CURSOR_VISIBILITY = downcallHandle("clang_getCursorVisibility", JAVA_INT, CXCursor.LAYOUT);
		CLANG_GET_CURSOR_AVAILABILITY = downcallHandle("clang_getCursorAvailability", JAVA_INT, CXCursor.LAYOUT);
		CLANG_GET_CURSOR_PLATFORM_AVAILABILITY = downcallHandle("clang_getCursorPlatformAvailability", JAVA_INT, CXCursor.LAYOUT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
		CLANG_DISPOSE_CXPLATFORM_AVAILABILITY = downcallHandleVoid("clang_disposeCXPlatformAvailability", UNBOUNDED_ADDRESS);
		CLANG_CURSOR_GET_VAR_DECL_INITIALIZER = downcallHandle("clang_Cursor_getVarDeclInitializer", CXCursor.LAYOUT, CXCursor.LAYOUT);
		CLANG_CURSOR_HAS_VAR_DECL_GLOBAL_STORAGE = downcallHandle("clang_Cursor_hasVarDeclGlobalStorage", JAVA_INT, CXCursor.LAYOUT);
		CLANG_CURSOR_HAS_VAR_DECL_EXTERNAL_STORAGE = downcallHandle("clang_Cursor_hasVarDeclExternalStorage", JAVA_INT, CXCursor.LAYOUT);
		CLANG_GET_CURSOR_LANGUAGE = downcallHandle("clang_getCursorLanguage", JAVA_INT, CXCursor.LAYOUT);
		CLANG_GET_CURSOR_TLSKIND = downcallHandle("clang_getCursorTLSKind", JAVA_INT, CXCursor.LAYOUT);
		CLANG_CURSOR_GET_TRANSLATION_UNIT = downcallHandle("clang_Cursor_getTranslationUnit", UNBOUNDED_ADDRESS, CXCursor.LAYOUT);
		CLANG_CREATE_CXCURSOR_SET = downcallHandle("clang_createCXCursorSet", UNBOUNDED_ADDRESS);
		CLANG_DISPOSE_CXCURSOR_SET = downcallHandleVoid("clang_disposeCXCursorSet", UNBOUNDED_ADDRESS);
		CLANG_CXCURSOR_SET_CONTAINS = downcallHandle("clang_CXCursorSet_contains", JAVA_INT, UNBOUNDED_ADDRESS, CXCursor.LAYOUT);
		CLANG_CXCURSOR_SET_INSERT = downcallHandle("clang_CXCursorSet_insert", JAVA_INT, UNBOUNDED_ADDRESS, CXCursor.LAYOUT);
		CLANG_GET_CURSOR_SEMANTIC_PARENT = downcallHandle("clang_getCursorSemanticParent", CXCursor.LAYOUT, CXCursor.LAYOUT);
		CLANG_GET_CURSOR_LEXICAL_PARENT = downcallHandle("clang_getCursorLexicalParent", CXCursor.LAYOUT, CXCursor.LAYOUT);
		CLANG_GET_OVERRIDDEN_CURSORS = downcallHandleVoid("clang_getOverriddenCursors", CXCursor.LAYOUT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		CLANG_DISPOSE_OVERRIDDEN_CURSORS = downcallHandleVoid("clang_disposeOverriddenCursors", UNBOUNDED_ADDRESS);
		CLANG_GET_INCLUDED_FILE = downcallHandle("clang_getIncludedFile", UNBOUNDED_ADDRESS, CXCursor.LAYOUT);
		CLANG_GET_CURSOR = downcallHandle("clang_getCursor", CXCursor.LAYOUT, UNBOUNDED_ADDRESS, CXSourceLocation.LAYOUT);
		CLANG_GET_CURSOR_LOCATION = downcallHandle("clang_getCursorLocation", CXSourceLocation.LAYOUT, CXCursor.LAYOUT);
		CLANG_GET_CURSOR_EXTENT = downcallHandle("clang_getCursorExtent", CXSourceRange.LAYOUT, CXCursor.LAYOUT);
		CLANG_GET_CURSOR_TYPE = downcallHandle("clang_getCursorType", CXType.LAYOUT, CXCursor.LAYOUT);
		CLANG_GET_TYPE_SPELLING = downcallHandle("clang_getTypeSpelling", CXString.LAYOUT, CXType.LAYOUT);
		CLANG_GET_TYPEDEF_DECL_UNDERLYING_TYPE = downcallHandle("clang_getTypedefDeclUnderlyingType", CXType.LAYOUT, CXCursor.LAYOUT);
		CLANG_GET_ENUM_DECL_INTEGER_TYPE = downcallHandle("clang_getEnumDeclIntegerType", CXType.LAYOUT, CXCursor.LAYOUT);
		CLANG_GET_ENUM_CONSTANT_DECL_VALUE = downcallHandle("clang_getEnumConstantDeclValue", JAVA_LONG, CXCursor.LAYOUT);
		CLANG_GET_ENUM_CONSTANT_DECL_UNSIGNED_VALUE = downcallHandle("clang_getEnumConstantDeclUnsignedValue", JAVA_LONG, CXCursor.LAYOUT);
		CLANG_CURSOR_IS_BIT_FIELD = downcallHandle("clang_Cursor_isBitField", JAVA_INT, CXCursor.LAYOUT);
		CLANG_GET_FIELD_DECL_BIT_WIDTH = downcallHandle("clang_getFieldDeclBitWidth", JAVA_INT, CXCursor.LAYOUT);
		CLANG_CURSOR_GET_NUM_ARGUMENTS = downcallHandle("clang_Cursor_getNumArguments", JAVA_INT, CXCursor.LAYOUT);
		CLANG_CURSOR_GET_ARGUMENT = downcallHandle("clang_Cursor_getArgument", CXCursor.LAYOUT, CXCursor.LAYOUT, JAVA_INT);
		CLANG_CURSOR_GET_NUM_TEMPLATE_ARGUMENTS = downcallHandle("clang_Cursor_getNumTemplateArguments", JAVA_INT, CXCursor.LAYOUT);
		CLANG_CURSOR_GET_TEMPLATE_ARGUMENT_KIND = downcallHandle("clang_Cursor_getTemplateArgumentKind", JAVA_INT, CXCursor.LAYOUT, JAVA_INT);
		CLANG_CURSOR_GET_TEMPLATE_ARGUMENT_TYPE = downcallHandle("clang_Cursor_getTemplateArgumentType", CXType.LAYOUT, CXCursor.LAYOUT, JAVA_INT);
		CLANG_CURSOR_GET_TEMPLATE_ARGUMENT_VALUE = downcallHandle("clang_Cursor_getTemplateArgumentValue", JAVA_LONG, CXCursor.LAYOUT, JAVA_INT);
		CLANG_CURSOR_GET_TEMPLATE_ARGUMENT_UNSIGNED_VALUE = downcallHandle("clang_Cursor_getTemplateArgumentUnsignedValue", JAVA_LONG, CXCursor.LAYOUT, JAVA_INT);
		CLANG_EQUAL_TYPES = downcallHandle("clang_equalTypes", JAVA_INT, CXType.LAYOUT, CXType.LAYOUT);
		CLANG_GET_CANONICAL_TYPE = downcallHandle("clang_getCanonicalType", CXType.LAYOUT, CXType.LAYOUT);
		CLANG_IS_CONST_QUALIFIED_TYPE = downcallHandle("clang_isConstQualifiedType", JAVA_INT, CXType.LAYOUT);
		CLANG_CURSOR_IS_MACRO_FUNCTION_LIKE = downcallHandle("clang_Cursor_isMacroFunctionLike", JAVA_INT, CXCursor.LAYOUT);
		CLANG_CURSOR_IS_MACRO_BUILTIN = downcallHandle("clang_Cursor_isMacroBuiltin", JAVA_INT, CXCursor.LAYOUT);
		CLANG_CURSOR_IS_FUNCTION_INLINED = downcallHandle("clang_Cursor_isFunctionInlined", JAVA_INT, CXCursor.LAYOUT);
		CLANG_IS_VOLATILE_QUALIFIED_TYPE = downcallHandle("clang_isVolatileQualifiedType", JAVA_INT, CXType.LAYOUT);
		CLANG_IS_RESTRICT_QUALIFIED_TYPE = downcallHandle("clang_isRestrictQualifiedType", JAVA_INT, CXType.LAYOUT);
		CLANG_GET_ADDRESS_SPACE = downcallHandle("clang_getAddressSpace", JAVA_INT, CXType.LAYOUT);
		CLANG_GET_TYPEDEF_NAME = downcallHandle("clang_getTypedefName", CXString.LAYOUT, CXType.LAYOUT);
		CLANG_GET_POINTEE_TYPE = downcallHandle("clang_getPointeeType", CXType.LAYOUT, CXType.LAYOUT);
		CLANG_GET_UNQUALIFIED_TYPE = downcallHandle("clang_getUnqualifiedType", CXType.LAYOUT, CXType.LAYOUT);
		CLANG_GET_NON_REFERENCE_TYPE = downcallHandle("clang_getNonReferenceType", CXType.LAYOUT, CXType.LAYOUT);
		CLANG_GET_TYPE_DECLARATION = downcallHandle("clang_getTypeDeclaration", CXCursor.LAYOUT, CXType.LAYOUT);
		CLANG_GET_DECL_OBJ_CTYPE_ENCODING = downcallHandle("clang_getDeclObjCTypeEncoding", CXString.LAYOUT, CXCursor.LAYOUT);
		CLANG_TYPE_GET_OBJ_CENCODING = downcallHandle("clang_Type_getObjCEncoding", CXString.LAYOUT, CXType.LAYOUT);
		CLANG_GET_TYPE_KIND_SPELLING = downcallHandle("clang_getTypeKindSpelling", CXString.LAYOUT, JAVA_INT);
		CLANG_GET_FUNCTION_TYPE_CALLING_CONV = downcallHandle("clang_getFunctionTypeCallingConv", JAVA_INT, CXType.LAYOUT);
		CLANG_GET_RESULT_TYPE = downcallHandle("clang_getResultType", CXType.LAYOUT, CXType.LAYOUT);
		CLANG_GET_EXCEPTION_SPECIFICATION_TYPE = downcallHandle("clang_getExceptionSpecificationType", JAVA_INT, CXType.LAYOUT);
		CLANG_GET_NUM_ARG_TYPES = downcallHandle("clang_getNumArgTypes", JAVA_INT, CXType.LAYOUT);
		CLANG_GET_ARG_TYPE = downcallHandle("clang_getArgType", CXType.LAYOUT, CXType.LAYOUT, JAVA_INT);
		CLANG_TYPE_GET_OBJ_COBJECT_BASE_TYPE = downcallHandle("clang_Type_getObjCObjectBaseType", CXType.LAYOUT, CXType.LAYOUT);
		CLANG_TYPE_GET_NUM_OBJ_CPROTOCOL_REFS = downcallHandle("clang_Type_getNumObjCProtocolRefs", JAVA_INT, CXType.LAYOUT);
		CLANG_TYPE_GET_OBJ_CPROTOCOL_DECL = downcallHandle("clang_Type_getObjCProtocolDecl", CXCursor.LAYOUT, CXType.LAYOUT, JAVA_INT);
		CLANG_TYPE_GET_NUM_OBJ_CTYPE_ARGS = downcallHandle("clang_Type_getNumObjCTypeArgs", JAVA_INT, CXType.LAYOUT);
		CLANG_TYPE_GET_OBJ_CTYPE_ARG = downcallHandle("clang_Type_getObjCTypeArg", CXType.LAYOUT, CXType.LAYOUT, JAVA_INT);
		CLANG_IS_FUNCTION_TYPE_VARIADIC = downcallHandle("clang_isFunctionTypeVariadic", JAVA_INT, CXType.LAYOUT);
		CLANG_GET_CURSOR_RESULT_TYPE = downcallHandle("clang_getCursorResultType", CXType.LAYOUT, CXCursor.LAYOUT);
		CLANG_GET_CURSOR_EXCEPTION_SPECIFICATION_TYPE = downcallHandle("clang_getCursorExceptionSpecificationType", JAVA_INT, CXCursor.LAYOUT);
		CLANG_IS_PODTYPE = downcallHandle("clang_isPODType", JAVA_INT, CXType.LAYOUT);
		CLANG_GET_ELEMENT_TYPE = downcallHandle("clang_getElementType", CXType.LAYOUT, CXType.LAYOUT);
		CLANG_GET_NUM_ELEMENTS = downcallHandle("clang_getNumElements", JAVA_LONG, CXType.LAYOUT);
		CLANG_GET_ARRAY_ELEMENT_TYPE = downcallHandle("clang_getArrayElementType", CXType.LAYOUT, CXType.LAYOUT);
		CLANG_GET_ARRAY_SIZE = downcallHandle("clang_getArraySize", JAVA_LONG, CXType.LAYOUT);
		CLANG_TYPE_GET_NAMED_TYPE = downcallHandle("clang_Type_getNamedType", CXType.LAYOUT, CXType.LAYOUT);
		CLANG_TYPE_IS_TRANSPARENT_TAG_TYPEDEF = downcallHandle("clang_Type_isTransparentTagTypedef", JAVA_INT, CXType.LAYOUT);
		CLANG_TYPE_GET_NULLABILITY = downcallHandle("clang_Type_getNullability", JAVA_INT, CXType.LAYOUT);
		CLANG_TYPE_GET_ALIGN_OF = downcallHandle("clang_Type_getAlignOf", JAVA_LONG, CXType.LAYOUT);
		CLANG_TYPE_GET_CLASS_TYPE = downcallHandle("clang_Type_getClassType", CXType.LAYOUT, CXType.LAYOUT);
		CLANG_TYPE_GET_SIZE_OF = downcallHandle("clang_Type_getSizeOf", JAVA_LONG, CXType.LAYOUT);
		CLANG_TYPE_GET_OFFSET_OF = downcallHandle("clang_Type_getOffsetOf", JAVA_LONG, CXType.LAYOUT, UNBOUNDED_ADDRESS);
		CLANG_TYPE_GET_MODIFIED_TYPE = downcallHandle("clang_Type_getModifiedType", CXType.LAYOUT, CXType.LAYOUT);
		CLANG_TYPE_GET_VALUE_TYPE = downcallHandle("clang_Type_getValueType", CXType.LAYOUT, CXType.LAYOUT);
		CLANG_CURSOR_GET_OFFSET_OF_FIELD = downcallHandle("clang_Cursor_getOffsetOfField", JAVA_LONG, CXCursor.LAYOUT);
		CLANG_CURSOR_IS_ANONYMOUS = downcallHandle("clang_Cursor_isAnonymous", JAVA_INT, CXCursor.LAYOUT);
		CLANG_CURSOR_IS_ANONYMOUS_RECORD_DECL = downcallHandle("clang_Cursor_isAnonymousRecordDecl", JAVA_INT, CXCursor.LAYOUT);
		CLANG_CURSOR_IS_INLINE_NAMESPACE = downcallHandle("clang_Cursor_isInlineNamespace", JAVA_INT, CXCursor.LAYOUT);
		CLANG_TYPE_GET_NUM_TEMPLATE_ARGUMENTS = downcallHandle("clang_Type_getNumTemplateArguments", JAVA_INT, CXType.LAYOUT);
		CLANG_TYPE_GET_TEMPLATE_ARGUMENT_AS_TYPE = downcallHandle("clang_Type_getTemplateArgumentAsType", CXType.LAYOUT, CXType.LAYOUT, JAVA_INT);
		CLANG_TYPE_GET_CXXREF_QUALIFIER = downcallHandle("clang_Type_getCXXRefQualifier", JAVA_INT, CXType.LAYOUT);
		CLANG_IS_VIRTUAL_BASE = downcallHandle("clang_isVirtualBase", JAVA_INT, CXCursor.LAYOUT);
		CLANG_GET_OFFSET_OF_BASE = downcallHandle("clang_getOffsetOfBase", JAVA_LONG, CXCursor.LAYOUT, CXCursor.LAYOUT);
		CLANG_GET_CXXACCESS_SPECIFIER = downcallHandle("clang_getCXXAccessSpecifier", JAVA_INT, CXCursor.LAYOUT);
		CLANG_CURSOR_GET_BINARY_OPCODE = downcallHandle("clang_Cursor_getBinaryOpcode", JAVA_INT, CXCursor.LAYOUT);
		CLANG_CURSOR_GET_BINARY_OPCODE_STR = downcallHandle("clang_Cursor_getBinaryOpcodeStr", CXString.LAYOUT, JAVA_INT);
		CLANG_CURSOR_GET_STORAGE_CLASS = downcallHandle("clang_Cursor_getStorageClass", JAVA_INT, CXCursor.LAYOUT);
		CLANG_GET_NUM_OVERLOADED_DECLS = downcallHandle("clang_getNumOverloadedDecls", JAVA_INT, CXCursor.LAYOUT);
		CLANG_GET_OVERLOADED_DECL = downcallHandle("clang_getOverloadedDecl", CXCursor.LAYOUT, CXCursor.LAYOUT, JAVA_INT);
		CLANG_GET_IBOUTLET_COLLECTION_TYPE = downcallHandle("clang_getIBOutletCollectionType", CXType.LAYOUT, CXCursor.LAYOUT);
		CLANG_VISIT_CHILDREN = downcallHandle("clang_visitChildren", JAVA_INT, CXCursor.LAYOUT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		CLANG_GET_CURSOR_USR = downcallHandle("clang_getCursorUSR", CXString.LAYOUT, CXCursor.LAYOUT);
		CLANG_CONSTRUCT_USR_OBJ_CCLASS = downcallHandle("clang_constructUSR_ObjCClass", CXString.LAYOUT, UNBOUNDED_ADDRESS);
		CLANG_CONSTRUCT_USR_OBJ_CCATEGORY = downcallHandle("clang_constructUSR_ObjCCategory", CXString.LAYOUT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		CLANG_CONSTRUCT_USR_OBJ_CPROTOCOL = downcallHandle("clang_constructUSR_ObjCProtocol", CXString.LAYOUT, UNBOUNDED_ADDRESS);
		CLANG_CONSTRUCT_USR_OBJ_CIVAR = downcallHandle("clang_constructUSR_ObjCIvar", CXString.LAYOUT, UNBOUNDED_ADDRESS, CXString.LAYOUT);
		CLANG_CONSTRUCT_USR_OBJ_CMETHOD = downcallHandle("clang_constructUSR_ObjCMethod", CXString.LAYOUT, UNBOUNDED_ADDRESS, JAVA_INT, CXString.LAYOUT);
		CLANG_CONSTRUCT_USR_OBJ_CPROPERTY = downcallHandle("clang_constructUSR_ObjCProperty", CXString.LAYOUT, UNBOUNDED_ADDRESS, CXString.LAYOUT);
		CLANG_GET_CURSOR_SPELLING = downcallHandle("clang_getCursorSpelling", CXString.LAYOUT, CXCursor.LAYOUT);
		CLANG_CURSOR_GET_SPELLING_NAME_RANGE = downcallHandle("clang_Cursor_getSpellingNameRange", CXSourceRange.LAYOUT, CXCursor.LAYOUT, JAVA_INT, JAVA_INT);
		CLANG_PRINTING_POLICY_GET_PROPERTY = downcallHandle("clang_PrintingPolicy_getProperty", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT);
		CLANG_PRINTING_POLICY_SET_PROPERTY = downcallHandleVoid("clang_PrintingPolicy_setProperty", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
		CLANG_GET_CURSOR_PRINTING_POLICY = downcallHandle("clang_getCursorPrintingPolicy", UNBOUNDED_ADDRESS, CXCursor.LAYOUT);
		CLANG_PRINTING_POLICY_DISPOSE = downcallHandleVoid("clang_PrintingPolicy_dispose", UNBOUNDED_ADDRESS);
		CLANG_GET_CURSOR_PRETTY_PRINTED = downcallHandle("clang_getCursorPrettyPrinted", CXString.LAYOUT, CXCursor.LAYOUT, UNBOUNDED_ADDRESS);
		CLANG_GET_TYPE_PRETTY_PRINTED = downcallHandle("clang_getTypePrettyPrinted", CXString.LAYOUT, CXType.LAYOUT, UNBOUNDED_ADDRESS);
		CLANG_GET_FULLY_QUALIFIED_NAME = downcallHandle("clang_getFullyQualifiedName", CXString.LAYOUT, CXType.LAYOUT, UNBOUNDED_ADDRESS, JAVA_INT);
		CLANG_GET_CURSOR_DISPLAY_NAME = downcallHandle("clang_getCursorDisplayName", CXString.LAYOUT, CXCursor.LAYOUT);
		CLANG_GET_CURSOR_REFERENCED = downcallHandle("clang_getCursorReferenced", CXCursor.LAYOUT, CXCursor.LAYOUT);
		CLANG_GET_CURSOR_DEFINITION = downcallHandle("clang_getCursorDefinition", CXCursor.LAYOUT, CXCursor.LAYOUT);
		CLANG_IS_CURSOR_DEFINITION = downcallHandle("clang_isCursorDefinition", JAVA_INT, CXCursor.LAYOUT);
		CLANG_GET_CANONICAL_CURSOR = downcallHandle("clang_getCanonicalCursor", CXCursor.LAYOUT, CXCursor.LAYOUT);
		CLANG_CURSOR_GET_OBJ_CSELECTOR_INDEX = downcallHandle("clang_Cursor_getObjCSelectorIndex", JAVA_INT, CXCursor.LAYOUT);
		CLANG_CURSOR_IS_DYNAMIC_CALL = downcallHandle("clang_Cursor_isDynamicCall", JAVA_INT, CXCursor.LAYOUT);
		CLANG_CURSOR_GET_RECEIVER_TYPE = downcallHandle("clang_Cursor_getReceiverType", CXType.LAYOUT, CXCursor.LAYOUT);
		CLANG_CURSOR_GET_OBJ_CPROPERTY_ATTRIBUTES = downcallHandle("clang_Cursor_getObjCPropertyAttributes", JAVA_INT, CXCursor.LAYOUT, JAVA_INT);
		CLANG_CURSOR_GET_OBJ_CPROPERTY_GETTER_NAME = downcallHandle("clang_Cursor_getObjCPropertyGetterName", CXString.LAYOUT, CXCursor.LAYOUT);
		CLANG_CURSOR_GET_OBJ_CPROPERTY_SETTER_NAME = downcallHandle("clang_Cursor_getObjCPropertySetterName", CXString.LAYOUT, CXCursor.LAYOUT);
		CLANG_CURSOR_GET_OBJ_CDECL_QUALIFIERS = downcallHandle("clang_Cursor_getObjCDeclQualifiers", JAVA_INT, CXCursor.LAYOUT);
		CLANG_CURSOR_IS_OBJ_COPTIONAL = downcallHandle("clang_Cursor_isObjCOptional", JAVA_INT, CXCursor.LAYOUT);
		CLANG_CURSOR_IS_VARIADIC = downcallHandle("clang_Cursor_isVariadic", JAVA_INT, CXCursor.LAYOUT);
		CLANG_CURSOR_IS_EXTERNAL_SYMBOL = downcallHandle("clang_Cursor_isExternalSymbol", JAVA_INT, CXCursor.LAYOUT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		CLANG_CURSOR_GET_COMMENT_RANGE = downcallHandle("clang_Cursor_getCommentRange", CXSourceRange.LAYOUT, CXCursor.LAYOUT);
		CLANG_CURSOR_GET_RAW_COMMENT_TEXT = downcallHandle("clang_Cursor_getRawCommentText", CXString.LAYOUT, CXCursor.LAYOUT);
		CLANG_CURSOR_GET_BRIEF_COMMENT_TEXT = downcallHandle("clang_Cursor_getBriefCommentText", CXString.LAYOUT, CXCursor.LAYOUT);
		CLANG_CURSOR_GET_MANGLING = downcallHandle("clang_Cursor_getMangling", CXString.LAYOUT, CXCursor.LAYOUT);
		CLANG_CURSOR_GET_CXXMANGLINGS = downcallHandle("clang_Cursor_getCXXManglings", UNBOUNDED_ADDRESS, CXCursor.LAYOUT);
		CLANG_CURSOR_GET_OBJ_CMANGLINGS = downcallHandle("clang_Cursor_getObjCManglings", UNBOUNDED_ADDRESS, CXCursor.LAYOUT);
		CLANG_CURSOR_GET_GCCASSEMBLY_TEMPLATE = downcallHandle("clang_Cursor_getGCCAssemblyTemplate", CXString.LAYOUT, CXCursor.LAYOUT);
		CLANG_CURSOR_IS_GCCASSEMBLY_HAS_GOTO = downcallHandle("clang_Cursor_isGCCAssemblyHasGoto", JAVA_INT, CXCursor.LAYOUT);
		CLANG_CURSOR_GET_GCCASSEMBLY_NUM_OUTPUTS = downcallHandle("clang_Cursor_getGCCAssemblyNumOutputs", JAVA_INT, CXCursor.LAYOUT);
		CLANG_CURSOR_GET_GCCASSEMBLY_NUM_INPUTS = downcallHandle("clang_Cursor_getGCCAssemblyNumInputs", JAVA_INT, CXCursor.LAYOUT);
		CLANG_CURSOR_GET_GCCASSEMBLY_INPUT = downcallHandle("clang_Cursor_getGCCAssemblyInput", JAVA_INT, CXCursor.LAYOUT, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		CLANG_CURSOR_GET_GCCASSEMBLY_OUTPUT = downcallHandle("clang_Cursor_getGCCAssemblyOutput", JAVA_INT, CXCursor.LAYOUT, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		CLANG_CURSOR_GET_GCCASSEMBLY_NUM_CLOBBERS = downcallHandle("clang_Cursor_getGCCAssemblyNumClobbers", JAVA_INT, CXCursor.LAYOUT);
		CLANG_CURSOR_GET_GCCASSEMBLY_CLOBBER = downcallHandle("clang_Cursor_getGCCAssemblyClobber", CXString.LAYOUT, CXCursor.LAYOUT, JAVA_INT);
		CLANG_CURSOR_IS_GCCASSEMBLY_VOLATILE = downcallHandle("clang_Cursor_isGCCAssemblyVolatile", JAVA_INT, CXCursor.LAYOUT);
		CLANG_CURSOR_GET_MODULE = downcallHandle("clang_Cursor_getModule", UNBOUNDED_ADDRESS, CXCursor.LAYOUT);
		CLANG_GET_MODULE_FOR_FILE = downcallHandle("clang_getModuleForFile", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		CLANG_MODULE_GET_ASTFILE = downcallHandle("clang_Module_getASTFile", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		CLANG_MODULE_GET_PARENT = downcallHandle("clang_Module_getParent", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		CLANG_MODULE_GET_NAME = downcallHandle("clang_Module_getName", CXString.LAYOUT, UNBOUNDED_ADDRESS);
		CLANG_MODULE_GET_FULL_NAME = downcallHandle("clang_Module_getFullName", CXString.LAYOUT, UNBOUNDED_ADDRESS);
		CLANG_MODULE_IS_SYSTEM = downcallHandle("clang_Module_isSystem", JAVA_INT, UNBOUNDED_ADDRESS);
		CLANG_MODULE_GET_NUM_TOP_LEVEL_HEADERS = downcallHandle("clang_Module_getNumTopLevelHeaders", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		CLANG_MODULE_GET_TOP_LEVEL_HEADER = downcallHandle("clang_Module_getTopLevelHeader", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
		CLANG_CXXCONSTRUCTOR_IS_CONVERTING_CONSTRUCTOR = downcallHandle("clang_CXXConstructor_isConvertingConstructor", JAVA_INT, CXCursor.LAYOUT);
		CLANG_CXXCONSTRUCTOR_IS_COPY_CONSTRUCTOR = downcallHandle("clang_CXXConstructor_isCopyConstructor", JAVA_INT, CXCursor.LAYOUT);
		CLANG_CXXCONSTRUCTOR_IS_DEFAULT_CONSTRUCTOR = downcallHandle("clang_CXXConstructor_isDefaultConstructor", JAVA_INT, CXCursor.LAYOUT);
		CLANG_CXXCONSTRUCTOR_IS_MOVE_CONSTRUCTOR = downcallHandle("clang_CXXConstructor_isMoveConstructor", JAVA_INT, CXCursor.LAYOUT);
		CLANG_CXXFIELD_IS_MUTABLE = downcallHandle("clang_CXXField_isMutable", JAVA_INT, CXCursor.LAYOUT);
		CLANG_CXXMETHOD_IS_DEFAULTED = downcallHandle("clang_CXXMethod_isDefaulted", JAVA_INT, CXCursor.LAYOUT);
		CLANG_CXXMETHOD_IS_DELETED = downcallHandle("clang_CXXMethod_isDeleted", JAVA_INT, CXCursor.LAYOUT);
		CLANG_CXXMETHOD_IS_PURE_VIRTUAL = downcallHandle("clang_CXXMethod_isPureVirtual", JAVA_INT, CXCursor.LAYOUT);
		CLANG_CXXMETHOD_IS_STATIC = downcallHandle("clang_CXXMethod_isStatic", JAVA_INT, CXCursor.LAYOUT);
		CLANG_CXXMETHOD_IS_VIRTUAL = downcallHandle("clang_CXXMethod_isVirtual", JAVA_INT, CXCursor.LAYOUT);
		CLANG_CXXMETHOD_IS_COPY_ASSIGNMENT_OPERATOR = downcallHandle("clang_CXXMethod_isCopyAssignmentOperator", JAVA_INT, CXCursor.LAYOUT);
		CLANG_CXXMETHOD_IS_MOVE_ASSIGNMENT_OPERATOR = downcallHandle("clang_CXXMethod_isMoveAssignmentOperator", JAVA_INT, CXCursor.LAYOUT);
		CLANG_CXXMETHOD_IS_EXPLICIT = downcallHandle("clang_CXXMethod_isExplicit", JAVA_INT, CXCursor.LAYOUT);
		CLANG_CXXRECORD_IS_ABSTRACT = downcallHandle("clang_CXXRecord_isAbstract", JAVA_INT, CXCursor.LAYOUT);
		CLANG_ENUM_DECL_IS_SCOPED = downcallHandle("clang_EnumDecl_isScoped", JAVA_INT, CXCursor.LAYOUT);
		CLANG_CXXMETHOD_IS_CONST = downcallHandle("clang_CXXMethod_isConst", JAVA_INT, CXCursor.LAYOUT);
		CLANG_GET_TEMPLATE_CURSOR_KIND = downcallHandle("clang_getTemplateCursorKind", JAVA_INT, CXCursor.LAYOUT);
		CLANG_GET_SPECIALIZED_CURSOR_TEMPLATE = downcallHandle("clang_getSpecializedCursorTemplate", CXCursor.LAYOUT, CXCursor.LAYOUT);
		CLANG_GET_CURSOR_REFERENCE_NAME_RANGE = downcallHandle("clang_getCursorReferenceNameRange", CXSourceRange.LAYOUT, CXCursor.LAYOUT, JAVA_INT, JAVA_INT);
		CLANG_GET_TOKEN = downcallHandle("clang_getToken", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, CXSourceLocation.LAYOUT);
		CLANG_GET_TOKEN_KIND = downcallHandle("clang_getTokenKind", JAVA_INT, CXToken.LAYOUT);
		CLANG_GET_TOKEN_SPELLING = downcallHandle("clang_getTokenSpelling", CXString.LAYOUT, UNBOUNDED_ADDRESS, CXToken.LAYOUT);
		CLANG_GET_TOKEN_LOCATION = downcallHandle("clang_getTokenLocation", CXSourceLocation.LAYOUT, UNBOUNDED_ADDRESS, CXToken.LAYOUT);
		CLANG_GET_TOKEN_EXTENT = downcallHandle("clang_getTokenExtent", CXSourceRange.LAYOUT, UNBOUNDED_ADDRESS, CXToken.LAYOUT);
		CLANG_TOKENIZE = downcallHandleVoid("clang_tokenize", UNBOUNDED_ADDRESS, CXSourceRange.LAYOUT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		CLANG_ANNOTATE_TOKENS = downcallHandleVoid("clang_annotateTokens", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
		CLANG_DISPOSE_TOKENS = downcallHandleVoid("clang_disposeTokens", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
		CLANG_GET_CURSOR_KIND_SPELLING = downcallHandle("clang_getCursorKindSpelling", CXString.LAYOUT, JAVA_INT);
		CLANG_GET_DEFINITION_SPELLING_AND_EXTENT = downcallHandleVoid("clang_getDefinitionSpellingAndExtent", CXCursor.LAYOUT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		CLANG_ENABLE_STACK_TRACES = downcallHandleVoid("clang_enableStackTraces");
		CLANG_GET_COMPLETION_CHUNK_KIND = downcallHandle("clang_getCompletionChunkKind", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT);
		CLANG_GET_COMPLETION_CHUNK_TEXT = downcallHandle("clang_getCompletionChunkText", CXString.LAYOUT, UNBOUNDED_ADDRESS, JAVA_INT);
		CLANG_GET_COMPLETION_CHUNK_COMPLETION_STRING = downcallHandle("clang_getCompletionChunkCompletionString", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
		CLANG_GET_NUM_COMPLETION_CHUNKS = downcallHandle("clang_getNumCompletionChunks", JAVA_INT, UNBOUNDED_ADDRESS);
		CLANG_GET_COMPLETION_PRIORITY = downcallHandle("clang_getCompletionPriority", JAVA_INT, UNBOUNDED_ADDRESS);
		CLANG_GET_COMPLETION_AVAILABILITY = downcallHandle("clang_getCompletionAvailability", JAVA_INT, UNBOUNDED_ADDRESS);
		CLANG_GET_COMPLETION_NUM_ANNOTATIONS = downcallHandle("clang_getCompletionNumAnnotations", JAVA_INT, UNBOUNDED_ADDRESS);
		CLANG_GET_COMPLETION_ANNOTATION = downcallHandle("clang_getCompletionAnnotation", CXString.LAYOUT, UNBOUNDED_ADDRESS, JAVA_INT);
		CLANG_GET_COMPLETION_PARENT = downcallHandle("clang_getCompletionParent", CXString.LAYOUT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		CLANG_GET_COMPLETION_BRIEF_COMMENT = downcallHandle("clang_getCompletionBriefComment", CXString.LAYOUT, UNBOUNDED_ADDRESS);
		CLANG_GET_CURSOR_COMPLETION_STRING = downcallHandle("clang_getCursorCompletionString", UNBOUNDED_ADDRESS, CXCursor.LAYOUT);
		CLANG_GET_COMPLETION_NUM_FIX_ITS = downcallHandle("clang_getCompletionNumFixIts", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT);
		CLANG_GET_COMPLETION_FIX_IT = downcallHandle("clang_getCompletionFixIt", CXString.LAYOUT, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		CLANG_DEFAULT_CODE_COMPLETE_OPTIONS = downcallHandle("clang_defaultCodeCompleteOptions", JAVA_INT);
		CLANG_CODE_COMPLETE_AT = downcallHandle("clang_codeCompleteAt", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
		CLANG_SORT_CODE_COMPLETION_RESULTS = downcallHandleVoid("clang_sortCodeCompletionResults", UNBOUNDED_ADDRESS, JAVA_INT);
		CLANG_DISPOSE_CODE_COMPLETE_RESULTS = downcallHandleVoid("clang_disposeCodeCompleteResults", UNBOUNDED_ADDRESS);
		CLANG_CODE_COMPLETE_GET_NUM_DIAGNOSTICS = downcallHandle("clang_codeCompleteGetNumDiagnostics", JAVA_INT, UNBOUNDED_ADDRESS);
		CLANG_CODE_COMPLETE_GET_DIAGNOSTIC = downcallHandle("clang_codeCompleteGetDiagnostic", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
		CLANG_CODE_COMPLETE_GET_CONTEXTS = downcallHandle("clang_codeCompleteGetContexts", JAVA_LONG, UNBOUNDED_ADDRESS);
		CLANG_CODE_COMPLETE_GET_CONTAINER_KIND = downcallHandle("clang_codeCompleteGetContainerKind", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		CLANG_CODE_COMPLETE_GET_CONTAINER_USR = downcallHandle("clang_codeCompleteGetContainerUSR", CXString.LAYOUT, UNBOUNDED_ADDRESS);
		CLANG_CODE_COMPLETE_GET_OBJ_CSELECTOR = downcallHandle("clang_codeCompleteGetObjCSelector", CXString.LAYOUT, UNBOUNDED_ADDRESS);
		CLANG_GET_CLANG_VERSION = downcallHandle("clang_getClangVersion", CXString.LAYOUT);
		CLANG_TOGGLE_CRASH_RECOVERY = downcallHandleVoid("clang_toggleCrashRecovery", JAVA_INT);
		CLANG_GET_INCLUSIONS = downcallHandleVoid("clang_getInclusions", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		CLANG_CURSOR_EVALUATE = downcallHandle("clang_Cursor_Evaluate", UNBOUNDED_ADDRESS, CXCursor.LAYOUT);
		CLANG_EVAL_RESULT_GET_KIND = downcallHandle("clang_EvalResult_getKind", JAVA_INT, UNBOUNDED_ADDRESS);
		CLANG_EVAL_RESULT_GET_AS_INT = downcallHandle("clang_EvalResult_getAsInt", JAVA_INT, UNBOUNDED_ADDRESS);
		CLANG_EVAL_RESULT_GET_AS_LONG_LONG = downcallHandle("clang_EvalResult_getAsLongLong", JAVA_LONG, UNBOUNDED_ADDRESS);
		CLANG_EVAL_RESULT_IS_UNSIGNED_INT = downcallHandle("clang_EvalResult_isUnsignedInt", JAVA_INT, UNBOUNDED_ADDRESS);
		CLANG_EVAL_RESULT_GET_AS_UNSIGNED = downcallHandle("clang_EvalResult_getAsUnsigned", JAVA_LONG, UNBOUNDED_ADDRESS);
		CLANG_EVAL_RESULT_GET_AS_DOUBLE = downcallHandle("clang_EvalResult_getAsDouble", JAVA_DOUBLE, UNBOUNDED_ADDRESS);
		CLANG_EVAL_RESULT_GET_AS_STR = downcallHandle("clang_EvalResult_getAsStr", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		CLANG_EVAL_RESULT_DISPOSE = downcallHandleVoid("clang_EvalResult_dispose", UNBOUNDED_ADDRESS);
		CLANG_FIND_REFERENCES_IN_FILE = downcallHandle("clang_findReferencesInFile", JAVA_INT, CXCursor.LAYOUT, UNBOUNDED_ADDRESS, CXCursorAndRangeVisitor.LAYOUT);
		CLANG_FIND_INCLUDES_IN_FILE = downcallHandle("clang_findIncludesInFile", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, CXCursorAndRangeVisitor.LAYOUT);
		CLANG_INDEX_IS_ENTITY_OBJ_CCONTAINER_KIND = downcallHandle("clang_index_isEntityObjCContainerKind", JAVA_INT, JAVA_INT);
		CLANG_INDEX_GET_OBJ_CCONTAINER_DECL_INFO = downcallHandle("clang_index_getObjCContainerDeclInfo", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		CLANG_INDEX_GET_OBJ_CINTERFACE_DECL_INFO = downcallHandle("clang_index_getObjCInterfaceDeclInfo", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		CLANG_INDEX_GET_OBJ_CCATEGORY_DECL_INFO = downcallHandle("clang_index_getObjCCategoryDeclInfo", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		CLANG_INDEX_GET_OBJ_CPROTOCOL_REF_LIST_INFO = downcallHandle("clang_index_getObjCProtocolRefListInfo", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		CLANG_INDEX_GET_OBJ_CPROPERTY_DECL_INFO = downcallHandle("clang_index_getObjCPropertyDeclInfo", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		CLANG_INDEX_GET_IBOUTLET_COLLECTION_ATTR_INFO = downcallHandle("clang_index_getIBOutletCollectionAttrInfo", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		CLANG_INDEX_GET_CXXCLASS_DECL_INFO = downcallHandle("clang_index_getCXXClassDeclInfo", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		CLANG_INDEX_GET_CLIENT_CONTAINER = downcallHandle("clang_index_getClientContainer", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		CLANG_INDEX_SET_CLIENT_CONTAINER = downcallHandleVoid("clang_index_setClientContainer", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		CLANG_INDEX_GET_CLIENT_ENTITY = downcallHandle("clang_index_getClientEntity", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		CLANG_INDEX_SET_CLIENT_ENTITY = downcallHandleVoid("clang_index_setClientEntity", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		CLANG_INDEX_ACTION_CREATE = downcallHandle("clang_IndexAction_create", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		CLANG_INDEX_ACTION_DISPOSE = downcallHandleVoid("clang_IndexAction_dispose", UNBOUNDED_ADDRESS);
		CLANG_INDEX_SOURCE_FILE = downcallHandle("clang_indexSourceFile", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT);
		CLANG_INDEX_SOURCE_FILE_FULL_ARGV = downcallHandle("clang_indexSourceFileFullArgv", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT);
		CLANG_INDEX_TRANSLATION_UNIT = downcallHandle("clang_indexTranslationUnit", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		CLANG_INDEX_LOC_GET_FILE_LOCATION = downcallHandleVoid("clang_indexLoc_getFileLocation", CXIdxLoc.LAYOUT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		CLANG_INDEX_LOC_GET_CXSOURCE_LOCATION = downcallHandle("clang_indexLoc_getCXSourceLocation", CXSourceLocation.LAYOUT, CXIdxLoc.LAYOUT);
		CLANG_TYPE_VISIT_FIELDS = downcallHandle("clang_Type_visitFields", JAVA_INT, CXType.LAYOUT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		CLANG_VISIT_CXXBASE_CLASSES = downcallHandle("clang_visitCXXBaseClasses", JAVA_INT, CXType.LAYOUT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		CLANG_VISIT_CXXMETHODS = downcallHandle("clang_visitCXXMethods", JAVA_INT, CXType.LAYOUT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		CLANG_GET_BINARY_OPERATOR_KIND_SPELLING = downcallHandle("clang_getBinaryOperatorKindSpelling", CXString.LAYOUT, JAVA_INT);
		CLANG_GET_CURSOR_BINARY_OPERATOR_KIND = downcallHandle("clang_getCursorBinaryOperatorKind", JAVA_INT, CXCursor.LAYOUT);
		CLANG_GET_UNARY_OPERATOR_KIND_SPELLING = downcallHandle("clang_getUnaryOperatorKindSpelling", CXString.LAYOUT, JAVA_INT);
		CLANG_GET_CURSOR_UNARY_OPERATOR_KIND = downcallHandle("clang_getCursorUnaryOperatorKind", JAVA_INT, CXCursor.LAYOUT);
		CLANG_GET_REMAPPINGS = downcallHandle("clang_getRemappings", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		CLANG_GET_REMAPPINGS_FROM_FILE_LIST = downcallHandle("clang_getRemappingsFromFileList", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
		CLANG_REMAP_GET_NUM_FILES = downcallHandle("clang_remap_getNumFiles", JAVA_INT, UNBOUNDED_ADDRESS);
		CLANG_REMAP_GET_FILENAMES = downcallHandleVoid("clang_remap_getFilenames", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		CLANG_REMAP_DISPOSE = downcallHandleVoid("clang_remap_dispose", UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	private ClangIndex() {
	}

    /// ```
    /// 
    /// Retrieve the character data associated with the given string.
    /// 
    /// The returned data is a reference and not owned by the user. This data
    /// is only valid while the `CXString` is valid. This function is similar
    /// to `std::string::c_str()`.
    /// ```
    public static MemorySegment clang_getCString(
    	MemorySegment string
    ) {
    	MethodHandle method = CLANG_GET_CSTRING.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			string
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_getCString].
    public static @Nullable String clang_getCString(
    	CXString string
    ) {
    	MemorySegment segment = clang_getCString(
    		string.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment.getString(0);
    }
    
    /// ```
    /// 
    /// Free the given string.
    /// ```
    public static void clang_disposeString(
    	MemorySegment string
    ) {
    	MethodHandle method = CLANG_DISPOSE_STRING.get();
    	try {
    		 method.invokeExact(
    			string
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_disposeString].
    public static void clang_disposeString(
    	CXString string
    ) {
    	clang_disposeString(
    		string.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Free the given string set.
    /// ```
    public static void clang_disposeStringSet(
    	MemorySegment set
    ) {
    	MethodHandle method = CLANG_DISPOSE_STRING_SET.get();
    	try {
    		 method.invokeExact(
    			set
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_disposeStringSet].
    public static void clang_disposeStringSet(
    	CXStringSet set
    ) {
    	clang_disposeStringSet(
    		set.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Return the timestamp for use with Clang's
    /// \c -fbuild-session-timestamp= option.
    /// ```
    public static long clang_getBuildSessionTimestamp() {
    	MethodHandle method = CLANG_GET_BUILD_SESSION_TIMESTAMP.get();
    	try {
    		return (long) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// 
    /// Create a \c CXVirtualFileOverlay object.
    /// Must be disposed with \c clang_VirtualFileOverlay_dispose().
    /// 
    /// \param options is reserved, always pass 0.
    /// ```
    public static MemorySegment nclang_VirtualFileOverlay_create(
    	int options
    ) {
    	MethodHandle method = CLANG_VIRTUAL_FILE_OVERLAY_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			options
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nclang_VirtualFileOverlay_create].
    public static @Nullable CXVirtualFileOverlay clang_VirtualFileOverlay_create(
    	int options
    ) {
    	MemorySegment segment = nclang_VirtualFileOverlay_create(
    		options
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXVirtualFileOverlay(segment);
    }
    
    /// ```
    /// 
    /// Map an absolute virtual file path to an absolute real one.
    /// The virtual path must be canonicalized (not contain "."/"..").
    /// \returns 0 for success, non-zero to indicate an error.
    /// ```
    public static int clang_VirtualFileOverlay_addFileMapping(
    	MemorySegment param0,
    	MemorySegment virtualPath,
    	MemorySegment realPath
    ) {
    	MethodHandle method = CLANG_VIRTUAL_FILE_OVERLAY_ADD_FILE_MAPPING.get();
    	try {
    		return (int) method.invokeExact(
    			param0,
    			virtualPath,
    			realPath
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_VirtualFileOverlay_addFileMapping].
    public static int clang_VirtualFileOverlay_addFileMapping(
    	CXVirtualFileOverlay param0,
    	String virtualPath,
    	NativeByteArray realPath
    ) {
    	try (Arena arena = MemoryStack.stackPush()) {
    		return clang_VirtualFileOverlay_addFileMapping(
    			param0.memorySegment(),
    			arena.allocateFrom(virtualPath),
    			realPath.memorySegment()
    		);
    	}
    }
    
    /// ```
    /// 
    /// Set the case sensitivity for the \c CXVirtualFileOverlay object.
    /// The \c CXVirtualFileOverlay object is case-sensitive by default, this
    /// option can be used to override the default.
    /// \returns 0 for success, non-zero to indicate an error.
    /// ```
    public static int clang_VirtualFileOverlay_setCaseSensitivity(
    	MemorySegment param0,
    	int caseSensitive
    ) {
    	MethodHandle method = CLANG_VIRTUAL_FILE_OVERLAY_SET_CASE_SENSITIVITY.get();
    	try {
    		return (int) method.invokeExact(
    			param0,
    			caseSensitive
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_VirtualFileOverlay_setCaseSensitivity].
    public static int clang_VirtualFileOverlay_setCaseSensitivity(
    	CXVirtualFileOverlay param0,
    	int caseSensitive
    ) {
    	return clang_VirtualFileOverlay_setCaseSensitivity(
    		param0.memorySegment(),
    		caseSensitive
    	);
    }
    
    /// ```
    /// 
    /// Write out the \c CXVirtualFileOverlay object to a char buffer.
    /// 
    /// \param options is reserved, always pass 0.
    /// \param out_buffer_ptr pointer to receive the buffer pointer, which should be
    /// disposed using \c clang_free().
    /// \param out_buffer_size pointer to receive the buffer size.
    /// \returns 0 for success, non-zero to indicate an error.
    /// ```
    public static int clang_VirtualFileOverlay_writeToBuffer(
    	MemorySegment param0,
    	int options,
    	MemorySegment out_buffer_ptr,
    	MemorySegment out_buffer_size
    ) {
    	MethodHandle method = CLANG_VIRTUAL_FILE_OVERLAY_WRITE_TO_BUFFER.get();
    	try {
    		return (int) method.invokeExact(
    			param0,
    			options,
    			out_buffer_ptr,
    			out_buffer_size
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_VirtualFileOverlay_writeToBuffer].
    public static int clang_VirtualFileOverlay_writeToBuffer(
    	CXVirtualFileOverlay param0,
    	int options,
    	NativePointerArray out_buffer_ptr,
    	NativeIntArray out_buffer_size
    ) {
    	return clang_VirtualFileOverlay_writeToBuffer(
    		param0.memorySegment(),
    		options,
    		out_buffer_ptr.memorySegment(),
    		out_buffer_size.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// free memory allocated by libclang, such as the buffer returned by
    /// \c CXVirtualFileOverlay() or \c clang_ModuleMapDescriptor_writeToBuffer().
    /// 
    /// \param buffer memory pointer to free.
    /// ```
    public static void clang_free(
    	MemorySegment buffer
    ) {
    	MethodHandle method = CLANG_FREE.get();
    	try {
    		 method.invokeExact(
    			buffer
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// 
    /// Dispose a \c CXVirtualFileOverlay object.
    /// ```
    public static void clang_VirtualFileOverlay_dispose(
    	MemorySegment param0
    ) {
    	MethodHandle method = CLANG_VIRTUAL_FILE_OVERLAY_DISPOSE.get();
    	try {
    		 method.invokeExact(
    			param0
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_VirtualFileOverlay_dispose].
    public static void clang_VirtualFileOverlay_dispose(
    	CXVirtualFileOverlay param0
    ) {
    	clang_VirtualFileOverlay_dispose(
    		param0.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Create a \c CXModuleMapDescriptor object.
    /// Must be disposed with \c clang_ModuleMapDescriptor_dispose().
    /// 
    /// \param options is reserved, always pass 0.
    /// ```
    public static MemorySegment nclang_ModuleMapDescriptor_create(
    	int options
    ) {
    	MethodHandle method = CLANG_MODULE_MAP_DESCRIPTOR_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			options
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nclang_ModuleMapDescriptor_create].
    public static @Nullable CXModuleMapDescriptor clang_ModuleMapDescriptor_create(
    	int options
    ) {
    	MemorySegment segment = nclang_ModuleMapDescriptor_create(
    		options
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXModuleMapDescriptor(segment);
    }
    
    /// ```
    /// 
    /// Sets the framework module name that the module.modulemap describes.
    /// \returns 0 for success, non-zero to indicate an error.
    /// ```
    public static int clang_ModuleMapDescriptor_setFrameworkModuleName(
    	MemorySegment param0,
    	MemorySegment name
    ) {
    	MethodHandle method = CLANG_MODULE_MAP_DESCRIPTOR_SET_FRAMEWORK_MODULE_NAME.get();
    	try {
    		return (int) method.invokeExact(
    			param0,
    			name
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_ModuleMapDescriptor_setFrameworkModuleName].
    public static int clang_ModuleMapDescriptor_setFrameworkModuleName(
    	CXModuleMapDescriptor param0,
    	String name
    ) {
    	try (Arena arena = MemoryStack.stackPush()) {
    		return clang_ModuleMapDescriptor_setFrameworkModuleName(
    			param0.memorySegment(),
    			arena.allocateFrom(name)
    		);
    	}
    }
    
    /// ```
    /// 
    /// Sets the umbrella header name that the module.modulemap describes.
    /// \returns 0 for success, non-zero to indicate an error.
    /// ```
    public static int clang_ModuleMapDescriptor_setUmbrellaHeader(
    	MemorySegment param0,
    	MemorySegment name
    ) {
    	MethodHandle method = CLANG_MODULE_MAP_DESCRIPTOR_SET_UMBRELLA_HEADER.get();
    	try {
    		return (int) method.invokeExact(
    			param0,
    			name
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_ModuleMapDescriptor_setUmbrellaHeader].
    public static int clang_ModuleMapDescriptor_setUmbrellaHeader(
    	CXModuleMapDescriptor param0,
    	String name
    ) {
    	try (Arena arena = MemoryStack.stackPush()) {
    		return clang_ModuleMapDescriptor_setUmbrellaHeader(
    			param0.memorySegment(),
    			arena.allocateFrom(name)
    		);
    	}
    }
    
    /// ```
    /// 
    /// Write out the \c CXModuleMapDescriptor object to a char buffer.
    /// 
    /// \param options is reserved, always pass 0.
    /// \param out_buffer_ptr pointer to receive the buffer pointer, which should be
    /// disposed using \c clang_free().
    /// \param out_buffer_size pointer to receive the buffer size.
    /// \returns 0 for success, non-zero to indicate an error.
    /// ```
    public static int clang_ModuleMapDescriptor_writeToBuffer(
    	MemorySegment param0,
    	int options,
    	MemorySegment out_buffer_ptr,
    	MemorySegment out_buffer_size
    ) {
    	MethodHandle method = CLANG_MODULE_MAP_DESCRIPTOR_WRITE_TO_BUFFER.get();
    	try {
    		return (int) method.invokeExact(
    			param0,
    			options,
    			out_buffer_ptr,
    			out_buffer_size
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_ModuleMapDescriptor_writeToBuffer].
    public static int clang_ModuleMapDescriptor_writeToBuffer(
    	CXModuleMapDescriptor param0,
    	int options,
    	NativePointerArray out_buffer_ptr,
    	NativeIntArray out_buffer_size
    ) {
    	return clang_ModuleMapDescriptor_writeToBuffer(
    		param0.memorySegment(),
    		options,
    		out_buffer_ptr.memorySegment(),
    		out_buffer_size.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Dispose a \c CXModuleMapDescriptor object.
    /// ```
    public static void clang_ModuleMapDescriptor_dispose(
    	MemorySegment param0
    ) {
    	MethodHandle method = CLANG_MODULE_MAP_DESCRIPTOR_DISPOSE.get();
    	try {
    		 method.invokeExact(
    			param0
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_ModuleMapDescriptor_dispose].
    public static void clang_ModuleMapDescriptor_dispose(
    	CXModuleMapDescriptor param0
    ) {
    	clang_ModuleMapDescriptor_dispose(
    		param0.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Prune module files in the module cache directory that haven't been accessed
    /// in a long time.
    /// 
    /// \param Path the path to the module cache directory.
    /// 
    /// \param PruneInterval the minimum time in seconds between two prune
    /// operations. If the timestamp file is newer than this, pruning is skipped.
    /// 
    /// \param PruneAfter the time in seconds after which unused module files are
    /// removed.
    /// 
    /// ```
    public static void clang_ModuleCache_prune(
    	MemorySegment Path,
    	long PruneInterval,
    	long PruneAfter
    ) {
    	MethodHandle method = CLANG_MODULE_CACHE_PRUNE.get();
    	try {
    		 method.invokeExact(
    			Path,
    			PruneInterval,
    			PruneAfter
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_ModuleCache_prune].
    public static void clang_ModuleCache_prune(
    	String Path,
    	long PruneInterval,
    	long PruneAfter
    ) {
    	try (Arena arena = MemoryStack.stackPush()) {
    		clang_ModuleCache_prune(
    			arena.allocateFrom(Path),
    			PruneInterval,
    			PruneAfter
    		);
    	}
    }
    
    /// ```
    /// 
    /// Variant of \c clang_ModuleCache_prune() that invokes \p Callback once for
    /// each absolute path removed from the cache. This includes pruned \c .pcm
    /// files, their companion \c .timestamp files, and any cache subdirectory that
    /// becomes empty as a result of pruning.
    /// 
    /// \param Path the path to the module cache directory.
    /// 
    /// \param PruneInterval the minimum time in seconds between two prune
    /// operations. If the timestamp file is newer than this, pruning is skipped.
    /// 
    /// \param PruneAfter the time in seconds after which unused module files are
    /// removed.
    /// 
    /// \param Callback invoked for each pruned absolute path. May be NULL, in
    /// which case this function behaves like \c clang_ModuleCache_prune().
    /// 
    /// \param UserData opaque pointer passed through to \p Callback.
    /// ```
    public static void clang_ModuleCache_pruneWithCallback(
    	MemorySegment Path,
    	long PruneInterval,
    	long PruneAfter,
    	MemorySegment Callback,
    	MemorySegment UserData
    ) {
    	MethodHandle method = CLANG_MODULE_CACHE_PRUNE_WITH_CALLBACK.get();
    	try {
    		 method.invokeExact(
    			Path,
    			PruneInterval,
    			PruneAfter,
    			Callback,
    			UserData
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_ModuleCache_pruneWithCallback].
    public static void clang_ModuleCache_pruneWithCallback(
    	String Path,
    	long PruneInterval,
    	long PruneAfter,
    	CXModuleCachePruneCallback Callback,
    	MemorySegment UserData
    ) {
    	try (Arena arena = MemoryStack.stackPush()) {
    		clang_ModuleCache_pruneWithCallback(
    			arena.allocateFrom(Path),
    			PruneInterval,
    			PruneAfter,
    			Callback.memorySegment(),
    			UserData
    		);
    	}
    }
    
    /// ```
    /// 
    /// Retrieve the complete file and path name of the given file.
    /// ```
    public static MemorySegment nclang_getFileName(
    	SegmentAllocator allocator,
    	MemorySegment SFile
    ) {
    	MethodHandle method = CLANG_GET_FILE_NAME.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			SFile
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nclang_getFileName].
    public static @Nullable CXString clang_getFileName(
    	SegmentAllocator allocator,
    	MemorySegment SFile
    ) {
    	MemorySegment segment = nclang_getFileName(
    		allocator,
    		SFile
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXString(segment);
    }
    
    /// ```
    /// 
    /// Retrieve the last modification time of the given file.
    /// ```
    public static long clang_getFileTime(
    	MemorySegment SFile
    ) {
    	MethodHandle method = CLANG_GET_FILE_TIME.get();
    	try {
    		return (long) method.invokeExact(
    			SFile
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// 
    /// Retrieve the unique ID for the given \c file.
    /// 
    /// \param file the file to get the ID for.
    /// \param outID stores the returned CXFileUniqueID.
    /// \returns If there was a failure getting the unique ID, returns non-zero,
    /// otherwise returns 0.
    /// ```
    public static int clang_getFileUniqueID(
    	MemorySegment file,
    	MemorySegment outID
    ) {
    	MethodHandle method = CLANG_GET_FILE_UNIQUE_ID.get();
    	try {
    		return (int) method.invokeExact(
    			file,
    			outID
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_getFileUniqueID].
    public static int clang_getFileUniqueID(
    	MemorySegment file,
    	CXFileUniqueID outID
    ) {
    	return clang_getFileUniqueID(
    		file,
    		outID.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Returns non-zero if the \c file1 and \c file2 point to the same file,
    /// or they are both NULL.
    /// ```
    public static int clang_File_isEqual(
    	MemorySegment file1,
    	MemorySegment file2
    ) {
    	MethodHandle method = CLANG_FILE_IS_EQUAL.get();
    	try {
    		return (int) method.invokeExact(
    			file1,
    			file2
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// 
    /// Returns the real path name of \c file.
    /// 
    /// An empty string may be returned. Use \c clang_getFileName() in that case.
    /// ```
    public static MemorySegment nclang_File_tryGetRealPathName(
    	SegmentAllocator allocator,
    	MemorySegment file
    ) {
    	MethodHandle method = CLANG_FILE_TRY_GET_REAL_PATH_NAME.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			file
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nclang_File_tryGetRealPathName].
    public static @Nullable CXString clang_File_tryGetRealPathName(
    	SegmentAllocator allocator,
    	MemorySegment file
    ) {
    	MemorySegment segment = nclang_File_tryGetRealPathName(
    		allocator,
    		file
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXString(segment);
    }
    
    /// ```
    /// 
    /// Retrieve a NULL (invalid) source location.
    /// ```
    public static MemorySegment nclang_getNullLocation(
    	SegmentAllocator allocator
    ) {
    	MethodHandle method = CLANG_GET_NULL_LOCATION.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nclang_getNullLocation].
    public static @Nullable CXSourceLocation clang_getNullLocation(
    	SegmentAllocator allocator
    ) {
    	MemorySegment segment = nclang_getNullLocation(
    		allocator
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXSourceLocation(segment);
    }
    
    /// ```
    /// 
    /// Determine whether two source locations, which must refer into
    /// the same translation unit, refer to exactly the same point in the source
    /// code.
    /// 
    /// \returns non-zero if the source locations refer to the same location, zero
    /// if they refer to different locations.
    /// ```
    public static int clang_equalLocations(
    	MemorySegment loc1,
    	MemorySegment loc2
    ) {
    	MethodHandle method = CLANG_EQUAL_LOCATIONS.get();
    	try {
    		return (int) method.invokeExact(
    			loc1,
    			loc2
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_equalLocations].
    public static int clang_equalLocations(
    	CXSourceLocation loc1,
    	CXSourceLocation loc2
    ) {
    	return clang_equalLocations(
    		loc1.memorySegment(),
    		loc2.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Determine for two source locations if the first comes
    /// strictly before the second one in the source code.
    /// 
    /// \returns non-zero if the first source location comes
    /// strictly before the second one, zero otherwise.
    /// ```
    public static int clang_isBeforeInTranslationUnit(
    	MemorySegment loc1,
    	MemorySegment loc2
    ) {
    	MethodHandle method = CLANG_IS_BEFORE_IN_TRANSLATION_UNIT.get();
    	try {
    		return (int) method.invokeExact(
    			loc1,
    			loc2
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_isBeforeInTranslationUnit].
    public static int clang_isBeforeInTranslationUnit(
    	CXSourceLocation loc1,
    	CXSourceLocation loc2
    ) {
    	return clang_isBeforeInTranslationUnit(
    		loc1.memorySegment(),
    		loc2.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Returns non-zero if the given source location is in a system header.
    /// ```
    public static int clang_Location_isInSystemHeader(
    	MemorySegment location
    ) {
    	MethodHandle method = CLANG_LOCATION_IS_IN_SYSTEM_HEADER.get();
    	try {
    		return (int) method.invokeExact(
    			location
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_Location_isInSystemHeader].
    public static int clang_Location_isInSystemHeader(
    	CXSourceLocation location
    ) {
    	return clang_Location_isInSystemHeader(
    		location.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Returns non-zero if the given source location is in the main file of
    /// the corresponding translation unit.
    /// ```
    public static int clang_Location_isFromMainFile(
    	MemorySegment location
    ) {
    	MethodHandle method = CLANG_LOCATION_IS_FROM_MAIN_FILE.get();
    	try {
    		return (int) method.invokeExact(
    			location
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_Location_isFromMainFile].
    public static int clang_Location_isFromMainFile(
    	CXSourceLocation location
    ) {
    	return clang_Location_isFromMainFile(
    		location.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Retrieve a NULL (invalid) source range.
    /// ```
    public static MemorySegment nclang_getNullRange(
    	SegmentAllocator allocator
    ) {
    	MethodHandle method = CLANG_GET_NULL_RANGE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nclang_getNullRange].
    public static @Nullable CXSourceRange clang_getNullRange(
    	SegmentAllocator allocator
    ) {
    	MemorySegment segment = nclang_getNullRange(
    		allocator
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXSourceRange(segment);
    }
    
    /// ```
    /// 
    /// Retrieve a source range given the beginning and ending source
    /// locations.
    /// ```
    public static MemorySegment clang_getRange(
    	SegmentAllocator allocator,
    	MemorySegment begin,
    	MemorySegment end
    ) {
    	MethodHandle method = CLANG_GET_RANGE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			begin,
    			end
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_getRange].
    public static @Nullable CXSourceRange clang_getRange(
    	SegmentAllocator allocator,
    	CXSourceLocation begin,
    	CXSourceLocation end
    ) {
    	MemorySegment segment = clang_getRange(
    		allocator,
    		begin.memorySegment(),
    		end.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXSourceRange(segment);
    }
    
    /// ```
    /// 
    /// Determine whether two ranges are equivalent.
    /// 
    /// \returns non-zero if the ranges are the same, zero if they differ.
    /// ```
    public static int clang_equalRanges(
    	MemorySegment range1,
    	MemorySegment range2
    ) {
    	MethodHandle method = CLANG_EQUAL_RANGES.get();
    	try {
    		return (int) method.invokeExact(
    			range1,
    			range2
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_equalRanges].
    public static int clang_equalRanges(
    	CXSourceRange range1,
    	CXSourceRange range2
    ) {
    	return clang_equalRanges(
    		range1.memorySegment(),
    		range2.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Returns non-zero if \p range is null.
    /// ```
    public static int clang_Range_isNull(
    	MemorySegment range
    ) {
    	MethodHandle method = CLANG_RANGE_IS_NULL.get();
    	try {
    		return (int) method.invokeExact(
    			range
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_Range_isNull].
    public static int clang_Range_isNull(
    	CXSourceRange range
    ) {
    	return clang_Range_isNull(
    		range.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Retrieve the file, line, column, and offset represented by
    /// the given source location.
    /// 
    /// If the location refers into a macro expansion, retrieves the
    /// location of the macro expansion.
    /// 
    /// \param location the location within a source file that will be decomposed
    /// into its parts.
    /// 
    /// \param file [out] if non-NULL, will be set to the file to which the given
    /// source location points.
    /// 
    /// \param line [out] if non-NULL, will be set to the line to which the given
    /// source location points.
    /// 
    /// \param column [out] if non-NULL, will be set to the column to which the given
    /// source location points.
    /// 
    /// \param offset [out] if non-NULL, will be set to the offset into the
    /// buffer to which the given source location points.
    /// ```
    public static void clang_getExpansionLocation(
    	MemorySegment location,
    	MemorySegment file,
    	MemorySegment line,
    	MemorySegment column,
    	MemorySegment offset
    ) {
    	MethodHandle method = CLANG_GET_EXPANSION_LOCATION.get();
    	try {
    		 method.invokeExact(
    			location,
    			file,
    			line,
    			column,
    			offset
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_getExpansionLocation].
    public static void clang_getExpansionLocation(
    	CXSourceLocation location,
    	NativePointerArray file,
    	NativeIntArray line,
    	NativeIntArray column,
    	NativeIntArray offset
    ) {
    	clang_getExpansionLocation(
    		location.memorySegment(),
    		file.memorySegment(),
    		line.memorySegment(),
    		column.memorySegment(),
    		offset.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Retrieve the file, line and column represented by the given source
    /// location, as specified in a # line directive.
    /// 
    /// Example: given the following source code in a file somefile.c
    /// 
    /// \code
    /// #123 "dummy.c" 1
    /// 
    /// static int func(void)
    /// {
    /// return 0;
    /// }
    /// \endcode
    /// 
    /// the location information returned by this function would be
    /// 
    /// File: dummy.c Line: 124 Column: 12
    /// 
    /// whereas clang_getExpansionLocation would have returned
    /// 
    /// File: somefile.c Line: 3 Column: 12
    /// 
    /// \param location the location within a source file that will be decomposed
    /// into its parts.
    /// 
    /// \param filename [out] if non-NULL, will be set to the filename of the
    /// source location. Note that filenames returned will be for "virtual" files,
    /// which don't necessarily exist on the machine running clang - e.g. when
    /// parsing preprocessed output obtained from a different environment. If
    /// a non-NULL value is passed in, remember to dispose of the returned value
    /// using \c clang_disposeString() once you've finished with it. For an invalid
    /// source location, an empty string is returned.
    /// 
    /// \param line [out] if non-NULL, will be set to the line number of the
    /// source location. For an invalid source location, zero is returned.
    /// 
    /// \param column [out] if non-NULL, will be set to the column number of the
    /// source location. For an invalid source location, zero is returned.
    /// ```
    public static void clang_getPresumedLocation(
    	MemorySegment location,
    	MemorySegment filename,
    	MemorySegment line,
    	MemorySegment column
    ) {
    	MethodHandle method = CLANG_GET_PRESUMED_LOCATION.get();
    	try {
    		 method.invokeExact(
    			location,
    			filename,
    			line,
    			column
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_getPresumedLocation].
    public static void clang_getPresumedLocation(
    	CXSourceLocation location,
    	CXString filename,
    	NativeIntArray line,
    	NativeIntArray column
    ) {
    	clang_getPresumedLocation(
    		location.memorySegment(),
    		filename.memorySegment(),
    		line.memorySegment(),
    		column.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Legacy API to retrieve the file, line, column, and offset represented
    /// by the given source location.
    /// 
    /// This interface has been replaced by the newer interface
    /// #clang_getExpansionLocation(). See that interface's documentation for
    /// details.
    /// ```
    public static void clang_getInstantiationLocation(
    	MemorySegment location,
    	MemorySegment file,
    	MemorySegment line,
    	MemorySegment column,
    	MemorySegment offset
    ) {
    	MethodHandle method = CLANG_GET_INSTANTIATION_LOCATION.get();
    	try {
    		 method.invokeExact(
    			location,
    			file,
    			line,
    			column,
    			offset
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_getInstantiationLocation].
    public static void clang_getInstantiationLocation(
    	CXSourceLocation location,
    	NativePointerArray file,
    	NativeIntArray line,
    	NativeIntArray column,
    	NativeIntArray offset
    ) {
    	clang_getInstantiationLocation(
    		location.memorySegment(),
    		file.memorySegment(),
    		line.memorySegment(),
    		column.memorySegment(),
    		offset.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Retrieve the file, line, column, and offset represented by
    /// the given source location.
    /// 
    /// If the location refers into a macro instantiation, return where the
    /// location was originally spelled in the source file.
    /// 
    /// \param location the location within a source file that will be decomposed
    /// into its parts.
    /// 
    /// \param file [out] if non-NULL, will be set to the file to which the given
    /// source location points.
    /// 
    /// \param line [out] if non-NULL, will be set to the line to which the given
    /// source location points.
    /// 
    /// \param column [out] if non-NULL, will be set to the column to which the given
    /// source location points.
    /// 
    /// \param offset [out] if non-NULL, will be set to the offset into the
    /// buffer to which the given source location points.
    /// ```
    public static void clang_getSpellingLocation(
    	MemorySegment location,
    	MemorySegment file,
    	MemorySegment line,
    	MemorySegment column,
    	MemorySegment offset
    ) {
    	MethodHandle method = CLANG_GET_SPELLING_LOCATION.get();
    	try {
    		 method.invokeExact(
    			location,
    			file,
    			line,
    			column,
    			offset
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_getSpellingLocation].
    public static void clang_getSpellingLocation(
    	CXSourceLocation location,
    	NativePointerArray file,
    	NativeIntArray line,
    	NativeIntArray column,
    	NativeIntArray offset
    ) {
    	clang_getSpellingLocation(
    		location.memorySegment(),
    		file.memorySegment(),
    		line.memorySegment(),
    		column.memorySegment(),
    		offset.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Retrieve the file, line, column, and offset represented by
    /// the given source location.
    /// 
    /// If the location refers into a macro expansion, return where the macro was
    /// expanded or where the macro argument was written, if the location points at
    /// a macro argument.
    /// 
    /// \param location the location within a source file that will be decomposed
    /// into its parts.
    /// 
    /// \param file [out] if non-NULL, will be set to the file to which the given
    /// source location points.
    /// 
    /// \param line [out] if non-NULL, will be set to the line to which the given
    /// source location points.
    /// 
    /// \param column [out] if non-NULL, will be set to the column to which the given
    /// source location points.
    /// 
    /// \param offset [out] if non-NULL, will be set to the offset into the
    /// buffer to which the given source location points.
    /// ```
    public static void clang_getFileLocation(
    	MemorySegment location,
    	MemorySegment file,
    	MemorySegment line,
    	MemorySegment column,
    	MemorySegment offset
    ) {
    	MethodHandle method = CLANG_GET_FILE_LOCATION.get();
    	try {
    		 method.invokeExact(
    			location,
    			file,
    			line,
    			column,
    			offset
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_getFileLocation].
    public static void clang_getFileLocation(
    	CXSourceLocation location,
    	NativePointerArray file,
    	NativeIntArray line,
    	NativeIntArray column,
    	NativeIntArray offset
    ) {
    	clang_getFileLocation(
    		location.memorySegment(),
    		file.memorySegment(),
    		line.memorySegment(),
    		column.memorySegment(),
    		offset.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Retrieve a source location representing the first character within a
    /// source range.
    /// ```
    public static MemorySegment clang_getRangeStart(
    	SegmentAllocator allocator,
    	MemorySegment range
    ) {
    	MethodHandle method = CLANG_GET_RANGE_START.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			range
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_getRangeStart].
    public static @Nullable CXSourceLocation clang_getRangeStart(
    	SegmentAllocator allocator,
    	CXSourceRange range
    ) {
    	MemorySegment segment = clang_getRangeStart(
    		allocator,
    		range.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXSourceLocation(segment);
    }
    
    /// ```
    /// 
    /// Retrieve a source location representing the last character within a
    /// source range.
    /// ```
    public static MemorySegment clang_getRangeEnd(
    	SegmentAllocator allocator,
    	MemorySegment range
    ) {
    	MethodHandle method = CLANG_GET_RANGE_END.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			range
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_getRangeEnd].
    public static @Nullable CXSourceLocation clang_getRangeEnd(
    	SegmentAllocator allocator,
    	CXSourceRange range
    ) {
    	MemorySegment segment = clang_getRangeEnd(
    		allocator,
    		range.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXSourceLocation(segment);
    }
    
    /// ```
    /// 
    /// Destroy the given \c CXSourceRangeList.
    /// ```
    public static void clang_disposeSourceRangeList(
    	MemorySegment ranges
    ) {
    	MethodHandle method = CLANG_DISPOSE_SOURCE_RANGE_LIST.get();
    	try {
    		 method.invokeExact(
    			ranges
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_disposeSourceRangeList].
    public static void clang_disposeSourceRangeList(
    	CXSourceRangeList ranges
    ) {
    	clang_disposeSourceRangeList(
    		ranges.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Determine the number of diagnostics in a CXDiagnosticSet.
    /// ```
    public static int clang_getNumDiagnosticsInSet(
    	MemorySegment Diags
    ) {
    	MethodHandle method = CLANG_GET_NUM_DIAGNOSTICS_IN_SET.get();
    	try {
    		return (int) method.invokeExact(
    			Diags
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// 
    /// Retrieve a diagnostic associated with the given CXDiagnosticSet.
    /// 
    /// \param Diags the CXDiagnosticSet to query.
    /// \param Index the zero-based diagnostic number to retrieve.
    /// 
    /// \returns the requested diagnostic. This diagnostic must be freed
    /// via a call to \c clang_disposeDiagnostic().
    /// ```
    public static MemorySegment clang_getDiagnosticInSet(
    	MemorySegment Diags,
    	int Index
    ) {
    	MethodHandle method = CLANG_GET_DIAGNOSTIC_IN_SET.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			Diags,
    			Index
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// 
    /// Deserialize a set of diagnostics from a Clang diagnostics bitcode
    /// file.
    /// 
    /// \param file The name of the file to deserialize.
    /// \param error A pointer to a enum value recording if there was a problem
    /// deserializing the diagnostics.
    /// \param errorString A pointer to a CXString for recording the error string
    /// if the file was not successfully loaded.
    /// 
    /// \returns A loaded CXDiagnosticSet if successful, and NULL otherwise.  These
    /// diagnostics should be released using clang_disposeDiagnosticSet().
    /// ```
    public static MemorySegment clang_loadDiagnostics(
    	MemorySegment file,
    	MemorySegment error,
    	MemorySegment errorString
    ) {
    	MethodHandle method = CLANG_LOAD_DIAGNOSTICS.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			file,
    			error,
    			errorString
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_loadDiagnostics].
    public static @Nullable MemorySegment clang_loadDiagnostics(
    	String file,
    	NativeIntArray error,
    	CXString errorString
    ) {
    	try (Arena arena = MemoryStack.stackPush()) {
    		MemorySegment segment = clang_loadDiagnostics(
    			arena.allocateFrom(file),
    			error.memorySegment(),
    			errorString.memorySegment()
    		);
    
    		if (segment.equals(MemorySegment.NULL))
    			return null;
    		
    		return segment;
    	}
    }
    
    /// ```
    /// 
    /// Release a CXDiagnosticSet and all of its contained diagnostics.
    /// ```
    public static void clang_disposeDiagnosticSet(
    	MemorySegment Diags
    ) {
    	MethodHandle method = CLANG_DISPOSE_DIAGNOSTIC_SET.get();
    	try {
    		 method.invokeExact(
    			Diags
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// 
    /// Retrieve the child diagnostics of a CXDiagnostic.
    /// 
    /// This CXDiagnosticSet does not need to be released by
    /// clang_disposeDiagnosticSet.
    /// ```
    public static MemorySegment clang_getChildDiagnostics(
    	MemorySegment D
    ) {
    	MethodHandle method = CLANG_GET_CHILD_DIAGNOSTICS.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			D
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// 
    /// Destroy a diagnostic.
    /// ```
    public static void clang_disposeDiagnostic(
    	MemorySegment Diagnostic
    ) {
    	MethodHandle method = CLANG_DISPOSE_DIAGNOSTIC.get();
    	try {
    		 method.invokeExact(
    			Diagnostic
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// 
    /// Format the given diagnostic in a manner that is suitable for display.
    /// 
    /// This routine will format the given diagnostic to a string, rendering
    /// the diagnostic according to the various options given. The
    /// \c clang_defaultDiagnosticDisplayOptions() function returns the set of
    /// options that most closely mimics the behavior of the clang compiler.
    /// 
    /// \param Diagnostic The diagnostic to print.
    /// 
    /// \param Options A set of options that control the diagnostic display,
    /// created by combining \c CXDiagnosticDisplayOptions values.
    /// 
    /// \returns A new string containing for formatted diagnostic.
    /// ```
    public static MemorySegment nclang_formatDiagnostic(
    	SegmentAllocator allocator,
    	MemorySegment Diagnostic,
    	int Options
    ) {
    	MethodHandle method = CLANG_FORMAT_DIAGNOSTIC.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			Diagnostic,
    			Options
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nclang_formatDiagnostic].
    public static @Nullable CXString clang_formatDiagnostic(
    	SegmentAllocator allocator,
    	MemorySegment Diagnostic,
    	int Options
    ) {
    	MemorySegment segment = nclang_formatDiagnostic(
    		allocator,
    		Diagnostic,
    		Options
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXString(segment);
    }
    
    /// ```
    /// 
    /// Retrieve the set of display options most similar to the
    /// default behavior of the clang compiler.
    /// 
    /// \returns A set of display options suitable for use with \c
    /// clang_formatDiagnostic().
    /// ```
    public static int clang_defaultDiagnosticDisplayOptions() {
    	MethodHandle method = CLANG_DEFAULT_DIAGNOSTIC_DISPLAY_OPTIONS.get();
    	try {
    		return (int) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// 
    /// Determine the severity of the given diagnostic.
    /// ```
    public static int clang_getDiagnosticSeverity(
    	MemorySegment param0
    ) {
    	MethodHandle method = CLANG_GET_DIAGNOSTIC_SEVERITY.get();
    	try {
    		return (int) method.invokeExact(
    			param0
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// 
    /// Retrieve the source location of the given diagnostic.
    /// 
    /// This location is where Clang would print the caret ('^') when
    /// displaying the diagnostic on the command line.
    /// ```
    public static MemorySegment nclang_getDiagnosticLocation(
    	SegmentAllocator allocator,
    	MemorySegment param0
    ) {
    	MethodHandle method = CLANG_GET_DIAGNOSTIC_LOCATION.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			param0
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nclang_getDiagnosticLocation].
    public static @Nullable CXSourceLocation clang_getDiagnosticLocation(
    	SegmentAllocator allocator,
    	MemorySegment param0
    ) {
    	MemorySegment segment = nclang_getDiagnosticLocation(
    		allocator,
    		param0
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXSourceLocation(segment);
    }
    
    /// ```
    /// 
    /// Retrieve the text of the given diagnostic.
    /// ```
    public static MemorySegment nclang_getDiagnosticSpelling(
    	SegmentAllocator allocator,
    	MemorySegment param0
    ) {
    	MethodHandle method = CLANG_GET_DIAGNOSTIC_SPELLING.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			param0
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nclang_getDiagnosticSpelling].
    public static @Nullable CXString clang_getDiagnosticSpelling(
    	SegmentAllocator allocator,
    	MemorySegment param0
    ) {
    	MemorySegment segment = nclang_getDiagnosticSpelling(
    		allocator,
    		param0
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXString(segment);
    }
    
    /// ```
    /// 
    /// Retrieve the name of the command-line option that enabled this
    /// diagnostic.
    /// 
    /// \param Diag The diagnostic to be queried.
    /// 
    /// \param Disable If non-NULL, will be set to the option that disables this
    /// diagnostic (if any).
    /// 
    /// \returns A string that contains the command-line option used to enable this
    /// warning, such as "-Wconversion" or "-pedantic".
    /// ```
    public static MemorySegment clang_getDiagnosticOption(
    	SegmentAllocator allocator,
    	MemorySegment Diag,
    	MemorySegment Disable
    ) {
    	MethodHandle method = CLANG_GET_DIAGNOSTIC_OPTION.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			Diag,
    			Disable
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_getDiagnosticOption].
    public static @Nullable CXString clang_getDiagnosticOption(
    	SegmentAllocator allocator,
    	MemorySegment Diag,
    	CXString Disable
    ) {
    	MemorySegment segment = clang_getDiagnosticOption(
    		allocator,
    		Diag,
    		Disable.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXString(segment);
    }
    
    /// ```
    /// 
    /// Retrieve the category number for this diagnostic.
    /// 
    /// Diagnostics can be categorized into groups along with other, related
    /// diagnostics (e.g., diagnostics under the same warning flag). This routine
    /// retrieves the category number for the given diagnostic.
    /// 
    /// \returns The number of the category that contains this diagnostic, or zero
    /// if this diagnostic is uncategorized.
    /// ```
    public static int clang_getDiagnosticCategory(
    	MemorySegment param0
    ) {
    	MethodHandle method = CLANG_GET_DIAGNOSTIC_CATEGORY.get();
    	try {
    		return (int) method.invokeExact(
    			param0
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// 
    /// Retrieve the name of a particular diagnostic category.  This
    /// is now deprecated.  Use clang_getDiagnosticCategoryText()
    /// instead.
    /// 
    /// \param Category A diagnostic category number, as returned by
    /// \c clang_getDiagnosticCategory().
    /// 
    /// \returns The name of the given diagnostic category.
    /// ```
    public static MemorySegment nclang_getDiagnosticCategoryName(
    	SegmentAllocator allocator,
    	int Category
    ) {
    	MethodHandle method = CLANG_GET_DIAGNOSTIC_CATEGORY_NAME.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			Category
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nclang_getDiagnosticCategoryName].
    public static @Nullable CXString clang_getDiagnosticCategoryName(
    	SegmentAllocator allocator,
    	int Category
    ) {
    	MemorySegment segment = nclang_getDiagnosticCategoryName(
    		allocator,
    		Category
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXString(segment);
    }
    
    /// ```
    /// 
    /// Retrieve the diagnostic category text for a given diagnostic.
    /// 
    /// \returns The text of the given diagnostic category.
    /// ```
    public static MemorySegment nclang_getDiagnosticCategoryText(
    	SegmentAllocator allocator,
    	MemorySegment param0
    ) {
    	MethodHandle method = CLANG_GET_DIAGNOSTIC_CATEGORY_TEXT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			param0
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nclang_getDiagnosticCategoryText].
    public static @Nullable CXString clang_getDiagnosticCategoryText(
    	SegmentAllocator allocator,
    	MemorySegment param0
    ) {
    	MemorySegment segment = nclang_getDiagnosticCategoryText(
    		allocator,
    		param0
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXString(segment);
    }
    
    /// ```
    /// 
    /// Determine the number of source ranges associated with the given
    /// diagnostic.
    /// ```
    public static int clang_getDiagnosticNumRanges(
    	MemorySegment param0
    ) {
    	MethodHandle method = CLANG_GET_DIAGNOSTIC_NUM_RANGES.get();
    	try {
    		return (int) method.invokeExact(
    			param0
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// 
    /// Retrieve a source range associated with the diagnostic.
    /// 
    /// A diagnostic's source ranges highlight important elements in the source
    /// code. On the command line, Clang displays source ranges by
    /// underlining them with '~' characters.
    /// 
    /// \param Diagnostic the diagnostic whose range is being extracted.
    /// 
    /// \param Range the zero-based index specifying which range to
    /// 
    /// \returns the requested source range.
    /// ```
    public static MemorySegment nclang_getDiagnosticRange(
    	SegmentAllocator allocator,
    	MemorySegment Diagnostic,
    	int Range
    ) {
    	MethodHandle method = CLANG_GET_DIAGNOSTIC_RANGE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			Diagnostic,
    			Range
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nclang_getDiagnosticRange].
    public static @Nullable CXSourceRange clang_getDiagnosticRange(
    	SegmentAllocator allocator,
    	MemorySegment Diagnostic,
    	int Range
    ) {
    	MemorySegment segment = nclang_getDiagnosticRange(
    		allocator,
    		Diagnostic,
    		Range
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXSourceRange(segment);
    }
    
    /// ```
    /// 
    /// Determine the number of fix-it hints associated with the
    /// given diagnostic.
    /// ```
    public static int clang_getDiagnosticNumFixIts(
    	MemorySegment Diagnostic
    ) {
    	MethodHandle method = CLANG_GET_DIAGNOSTIC_NUM_FIX_ITS.get();
    	try {
    		return (int) method.invokeExact(
    			Diagnostic
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// 
    /// Retrieve the replacement information for a given fix-it.
    /// 
    /// Fix-its are described in terms of a source range whose contents
    /// should be replaced by a string. This approach generalizes over
    /// three kinds of operations: removal of source code (the range covers
    /// the code to be removed and the replacement string is empty),
    /// replacement of source code (the range covers the code to be
    /// replaced and the replacement string provides the new code), and
    /// insertion (both the start and end of the range point at the
    /// insertion location, and the replacement string provides the text to
    /// insert).
    /// 
    /// \param Diagnostic The diagnostic whose fix-its are being queried.
    /// 
    /// \param FixIt The zero-based index of the fix-it.
    /// 
    /// \param ReplacementRange The source range whose contents will be
    /// replaced with the returned replacement string. Note that source
    /// ranges are half-open ranges [a, b), so the source code should be
    /// replaced from a and up to (but not including) b.
    /// 
    /// \returns A string containing text that should be replace the source
    /// code indicated by the \c ReplacementRange.
    /// ```
    public static MemorySegment clang_getDiagnosticFixIt(
    	SegmentAllocator allocator,
    	MemorySegment Diagnostic,
    	int FixIt,
    	MemorySegment ReplacementRange
    ) {
    	MethodHandle method = CLANG_GET_DIAGNOSTIC_FIX_IT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			Diagnostic,
    			FixIt,
    			ReplacementRange
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_getDiagnosticFixIt].
    public static @Nullable CXString clang_getDiagnosticFixIt(
    	SegmentAllocator allocator,
    	MemorySegment Diagnostic,
    	int FixIt,
    	CXSourceRange ReplacementRange
    ) {
    	MemorySegment segment = clang_getDiagnosticFixIt(
    		allocator,
    		Diagnostic,
    		FixIt,
    		ReplacementRange.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXString(segment);
    }
    
    /// ```
    /// 
    /// Provides a shared context for creating translation units.
    /// 
    /// It provides two options:
    /// 
    /// - excludeDeclarationsFromPCH: When non-zero, allows enumeration of "local"
    /// declarations (when loading any new translation units). A "local" declaration
    /// is one that belongs in the translation unit itself and not in a precompiled
    /// header that was used by the translation unit. If zero, all declarations
    /// will be enumerated.
    /// 
    /// Here is an example:
    /// 
    /// \code
    /// // excludeDeclsFromPCH = 1, displayDiagnostics=1
    /// Idx = clang_createIndex(1, 1);
    /// 
    /// // IndexTest.pch was produced with the following command:
    /// // "clang -x c IndexTest.h -emit-ast -o IndexTest.pch"
    /// TU = clang_createTranslationUnit(Idx, "IndexTest.pch");
    /// 
    /// // This will load all the symbols from 'IndexTest.pch'
    /// clang_visitChildren(clang_getTranslationUnitCursor(TU),
    /// TranslationUnitVisitor, 0);
    /// clang_disposeTranslationUnit(TU);
    /// 
    /// // This will load all the symbols from 'IndexTest.c', excluding symbols
    /// // from 'IndexTest.pch'.
    /// char *args[] = { "-Xclang", "-include-pch=IndexTest.pch" };
    /// TU = clang_createTranslationUnitFromSourceFile(Idx, "IndexTest.c", 2, args,
    /// 0, 0);
    /// clang_visitChildren(clang_getTranslationUnitCursor(TU),
    /// TranslationUnitVisitor, 0);
    /// clang_disposeTranslationUnit(TU);
    /// \endcode
    /// 
    /// This process of creating the 'pch', loading it separately, and using it (via
    /// -include-pch) allows 'excludeDeclsFromPCH' to remove redundant callbacks
    /// (which gives the indexer the same performance benefit as the compiler).
    /// ```
    public static MemorySegment clang_createIndex(
    	int excludeDeclarationsFromPCH,
    	int displayDiagnostics
    ) {
    	MethodHandle method = CLANG_CREATE_INDEX.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			excludeDeclarationsFromPCH,
    			displayDiagnostics
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// 
    /// Destroy the given index.
    /// 
    /// The index must not be destroyed until all of the translation units created
    /// within that index have been destroyed.
    /// ```
    public static void clang_disposeIndex(
    	MemorySegment index
    ) {
    	MethodHandle method = CLANG_DISPOSE_INDEX.get();
    	try {
    		 method.invokeExact(
    			index
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// 
    /// Provides a shared context for creating translation units.
    /// 
    /// Call this function instead of clang_createIndex() if you need to configure
    /// the additional options in CXIndexOptions.
    /// 
    /// \returns The created index or null in case of error, such as an unsupported
    /// value of options->Size.
    /// 
    /// For example:
    /// \code
    /// CXIndex createIndex(const char *ApplicationTemporaryPath) {
    /// const int ExcludeDeclarationsFromPCH = 1;
    /// const int DisplayDiagnostics = 1;
    /// CXIndex Idx;
    /// #if CINDEX_VERSION_MINOR >= 64
    /// CXIndexOptions Opts;
    /// memset(&Opts, 0, sizeof(Opts));
    /// Opts.Size = sizeof(CXIndexOptions);
    /// Opts.ThreadBackgroundPriorityForIndexing = 1;
    /// Opts.ExcludeDeclarationsFromPCH = ExcludeDeclarationsFromPCH;
    /// Opts.DisplayDiagnostics = DisplayDiagnostics;
    /// Opts.PreambleStoragePath = ApplicationTemporaryPath;
    /// Idx = clang_createIndexWithOptions(&Opts);
    /// if (Idx)
    /// return Idx;
    /// fprintf(stderr,
    /// "clang_createIndexWithOptions() failed. "
    /// "CINDEX_VERSION_MINOR = %d, sizeof(CXIndexOptions) = %u\n",
    /// CINDEX_VERSION_MINOR, Opts.Size);
    /// #else
    /// (void)ApplicationTemporaryPath;
    /// #endif
    /// Idx = clang_createIndex(ExcludeDeclarationsFromPCH, DisplayDiagnostics);
    /// clang_CXIndex_setGlobalOptions(
    /// Idx, clang_CXIndex_getGlobalOptions(Idx) |
    /// CXGlobalOpt_ThreadBackgroundPriorityForIndexing);
    /// return Idx;
    /// }
    /// \endcode
    /// 
    /// \sa clang_createIndex()
    /// ```
    public static MemorySegment clang_createIndexWithOptions(
    	MemorySegment options
    ) {
    	MethodHandle method = CLANG_CREATE_INDEX_WITH_OPTIONS.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			options
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_createIndexWithOptions].
    public static @Nullable MemorySegment clang_createIndexWithOptions(
    	CXIndexOptions options
    ) {
    	MemorySegment segment = clang_createIndexWithOptions(
    		options.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// ```
    /// 
    /// Sets general options associated with a CXIndex.
    /// 
    /// This function is DEPRECATED. Set
    /// CXIndexOptions::ThreadBackgroundPriorityForIndexing and/or
    /// CXIndexOptions::ThreadBackgroundPriorityForEditing and call
    /// clang_createIndexWithOptions() instead.
    /// 
    /// For example:
    /// \code
    /// CXIndex idx = ...;
    /// clang_CXIndex_setGlobalOptions(idx,
    /// clang_CXIndex_getGlobalOptions(idx) |
    /// CXGlobalOpt_ThreadBackgroundPriorityForIndexing);
    /// \endcode
    /// 
    /// \param options A bitmask of options, a bitwise OR of CXGlobalOpt_XXX flags.
    /// ```
    public static void clang_CXIndex_setGlobalOptions(
    	MemorySegment param0,
    	int options
    ) {
    	MethodHandle method = CLANG_CXINDEX_SET_GLOBAL_OPTIONS.get();
    	try {
    		 method.invokeExact(
    			param0,
    			options
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// 
    /// Gets the general options associated with a CXIndex.
    /// 
    /// This function allows to obtain the final option values used by libclang after
    /// specifying the option policies via CXChoice enumerators.
    /// 
    /// \returns A bitmask of options, a bitwise OR of CXGlobalOpt_XXX flags that
    /// are associated with the given CXIndex object.
    /// ```
    public static int clang_CXIndex_getGlobalOptions(
    	MemorySegment param0
    ) {
    	MethodHandle method = CLANG_CXINDEX_GET_GLOBAL_OPTIONS.get();
    	try {
    		return (int) method.invokeExact(
    			param0
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// 
    /// Sets the invocation emission path option in a CXIndex.
    /// 
    /// This function is DEPRECATED. Set CXIndexOptions::InvocationEmissionPath and
    /// call clang_createIndexWithOptions() instead.
    /// 
    /// The invocation emission path specifies a path which will contain log
    /// files for certain libclang invocations. A null value (default) implies that
    /// libclang invocations are not logged..
    /// ```
    public static void clang_CXIndex_setInvocationEmissionPathOption(
    	MemorySegment param0,
    	MemorySegment Path
    ) {
    	MethodHandle method = CLANG_CXINDEX_SET_INVOCATION_EMISSION_PATH_OPTION.get();
    	try {
    		 method.invokeExact(
    			param0,
    			Path
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_CXIndex_setInvocationEmissionPathOption].
    public static void clang_CXIndex_setInvocationEmissionPathOption(
    	MemorySegment param0,
    	NativeByteArray Path
    ) {
    	clang_CXIndex_setInvocationEmissionPathOption(
    		param0,
    		Path.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Determine whether the given header is guarded against
    /// multiple inclusions, either with the conventional
    /// \#ifndef/\#define/\#endif macro guards or with \#pragma once.
    /// ```
    public static int clang_isFileMultipleIncludeGuarded(
    	MemorySegment tu,
    	MemorySegment file
    ) {
    	MethodHandle method = CLANG_IS_FILE_MULTIPLE_INCLUDE_GUARDED.get();
    	try {
    		return (int) method.invokeExact(
    			tu,
    			file
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_isFileMultipleIncludeGuarded].
    public static int clang_isFileMultipleIncludeGuarded(
    	CXTranslationUnit tu,
    	MemorySegment file
    ) {
    	return clang_isFileMultipleIncludeGuarded(
    		tu.memorySegment(),
    		file
    	);
    }
    
    /// ```
    /// 
    /// Retrieve a file handle within the given translation unit.
    /// 
    /// \param tu the translation unit
    /// 
    /// \param file_name the name of the file.
    /// 
    /// \returns the file handle for the named file in the translation unit \p tu,
    /// or a NULL file handle if the file was not a part of this translation unit.
    /// ```
    public static MemorySegment clang_getFile(
    	MemorySegment tu,
    	MemorySegment file_name
    ) {
    	MethodHandle method = CLANG_GET_FILE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			tu,
    			file_name
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_getFile].
    public static @Nullable MemorySegment clang_getFile(
    	CXTranslationUnit tu,
    	String file_name
    ) {
    	try (Arena arena = MemoryStack.stackPush()) {
    		MemorySegment segment = clang_getFile(
    			tu.memorySegment(),
    			arena.allocateFrom(file_name)
    		);
    
    		if (segment.equals(MemorySegment.NULL))
    			return null;
    		
    		return segment;
    	}
    }
    
    /// ```
    /// 
    /// Retrieve the buffer associated with the given file.
    /// 
    /// \param tu the translation unit
    /// 
    /// \param file the file for which to retrieve the buffer.
    /// 
    /// \param size [out] if non-NULL, will be set to the size of the buffer.
    /// 
    /// \returns a pointer to the buffer in memory that holds the contents of
    /// \p file, or a NULL pointer when the file is not loaded.
    /// ```
    public static MemorySegment clang_getFileContents(
    	MemorySegment tu,
    	MemorySegment file,
    	MemorySegment size
    ) {
    	MethodHandle method = CLANG_GET_FILE_CONTENTS.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			tu,
    			file,
    			size
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_getFileContents].
    public static @Nullable NativeByteArray clang_getFileContents(
    	CXTranslationUnit tu,
    	MemorySegment file,
    	NativeLongArray size
    ) {
    	MemorySegment segment = clang_getFileContents(
    		tu.memorySegment(),
    		file,
    		size.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeByteArray(segment);
    }
    
    /// ```
    /// 
    /// Retrieves the source location associated with a given file/line/column
    /// in a particular translation unit.
    /// ```
    public static MemorySegment clang_getLocation(
    	SegmentAllocator allocator,
    	MemorySegment tu,
    	MemorySegment file,
    	int line,
    	int column
    ) {
    	MethodHandle method = CLANG_GET_LOCATION.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			tu,
    			file,
    			line,
    			column
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_getLocation].
    public static @Nullable CXSourceLocation clang_getLocation(
    	SegmentAllocator allocator,
    	CXTranslationUnit tu,
    	MemorySegment file,
    	int line,
    	int column
    ) {
    	MemorySegment segment = clang_getLocation(
    		allocator,
    		tu.memorySegment(),
    		file,
    		line,
    		column
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXSourceLocation(segment);
    }
    
    /// ```
    /// 
    /// Retrieves the source location associated with a given character offset
    /// in a particular translation unit.
    /// ```
    public static MemorySegment clang_getLocationForOffset(
    	SegmentAllocator allocator,
    	MemorySegment tu,
    	MemorySegment file,
    	int offset
    ) {
    	MethodHandle method = CLANG_GET_LOCATION_FOR_OFFSET.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			tu,
    			file,
    			offset
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_getLocationForOffset].
    public static @Nullable CXSourceLocation clang_getLocationForOffset(
    	SegmentAllocator allocator,
    	CXTranslationUnit tu,
    	MemorySegment file,
    	int offset
    ) {
    	MemorySegment segment = clang_getLocationForOffset(
    		allocator,
    		tu.memorySegment(),
    		file,
    		offset
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXSourceLocation(segment);
    }
    
    /// ```
    /// 
    /// Retrieve all ranges that were skipped by the preprocessor.
    /// 
    /// The preprocessor will skip lines when they are surrounded by an
    /// if/ifdef/ifndef directive whose condition does not evaluate to true.
    /// ```
    public static MemorySegment clang_getSkippedRanges(
    	MemorySegment tu,
    	MemorySegment file
    ) {
    	MethodHandle method = CLANG_GET_SKIPPED_RANGES.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			tu,
    			file
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_getSkippedRanges].
    public static @Nullable CXSourceRangeList clang_getSkippedRanges(
    	CXTranslationUnit tu,
    	MemorySegment file
    ) {
    	MemorySegment segment = clang_getSkippedRanges(
    		tu.memorySegment(),
    		file
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXSourceRangeList(segment);
    }
    
    /// ```
    /// 
    /// Retrieve all ranges from all files that were skipped by the
    /// preprocessor.
    /// 
    /// The preprocessor will skip lines when they are surrounded by an
    /// if/ifdef/ifndef directive whose condition does not evaluate to true.
    /// ```
    public static MemorySegment clang_getAllSkippedRanges(
    	MemorySegment tu
    ) {
    	MethodHandle method = CLANG_GET_ALL_SKIPPED_RANGES.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			tu
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_getAllSkippedRanges].
    public static @Nullable CXSourceRangeList clang_getAllSkippedRanges(
    	CXTranslationUnit tu
    ) {
    	MemorySegment segment = clang_getAllSkippedRanges(
    		tu.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXSourceRangeList(segment);
    }
    
    /// ```
    /// 
    /// Determine the number of diagnostics produced for the given
    /// translation unit.
    /// ```
    public static int clang_getNumDiagnostics(
    	MemorySegment Unit
    ) {
    	MethodHandle method = CLANG_GET_NUM_DIAGNOSTICS.get();
    	try {
    		return (int) method.invokeExact(
    			Unit
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_getNumDiagnostics].
    public static int clang_getNumDiagnostics(
    	CXTranslationUnit Unit
    ) {
    	return clang_getNumDiagnostics(
    		Unit.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Retrieve a diagnostic associated with the given translation unit.
    /// 
    /// \param Unit the translation unit to query.
    /// \param Index the zero-based diagnostic number to retrieve.
    /// 
    /// \returns the requested diagnostic. This diagnostic must be freed
    /// via a call to \c clang_disposeDiagnostic().
    /// ```
    public static MemorySegment clang_getDiagnostic(
    	MemorySegment Unit,
    	int Index
    ) {
    	MethodHandle method = CLANG_GET_DIAGNOSTIC.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			Unit,
    			Index
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_getDiagnostic].
    public static @Nullable MemorySegment clang_getDiagnostic(
    	CXTranslationUnit Unit,
    	int Index
    ) {
    	MemorySegment segment = clang_getDiagnostic(
    		Unit.memorySegment(),
    		Index
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// ```
    /// 
    /// Retrieve the complete set of diagnostics associated with a
    /// translation unit.
    /// 
    /// \param Unit the translation unit to query.
    /// ```
    public static MemorySegment clang_getDiagnosticSetFromTU(
    	MemorySegment Unit
    ) {
    	MethodHandle method = CLANG_GET_DIAGNOSTIC_SET_FROM_TU.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			Unit
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_getDiagnosticSetFromTU].
    public static @Nullable MemorySegment clang_getDiagnosticSetFromTU(
    	CXTranslationUnit Unit
    ) {
    	MemorySegment segment = clang_getDiagnosticSetFromTU(
    		Unit.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// ```
    /// 
    /// Get the original translation unit source file name.
    /// ```
    public static MemorySegment clang_getTranslationUnitSpelling(
    	SegmentAllocator allocator,
    	MemorySegment CTUnit
    ) {
    	MethodHandle method = CLANG_GET_TRANSLATION_UNIT_SPELLING.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			CTUnit
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_getTranslationUnitSpelling].
    public static @Nullable CXString clang_getTranslationUnitSpelling(
    	SegmentAllocator allocator,
    	CXTranslationUnit CTUnit
    ) {
    	MemorySegment segment = clang_getTranslationUnitSpelling(
    		allocator,
    		CTUnit.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXString(segment);
    }
    
    /// ```
    /// 
    /// Return the CXTranslationUnit for a given source file and the provided
    /// command line arguments one would pass to the compiler.
    /// 
    /// Note: The 'source_filename' argument is optional.  If the caller provides a
    /// NULL pointer, the name of the source file is expected to reside in the
    /// specified command line arguments.
    /// 
    /// Note: When encountered in 'clang_command_line_args', the following options
    /// are ignored:
    /// 
    /// '-c'
    /// '-emit-ast'
    /// '-fsyntax-only'
    /// '-o \<output file>'  (both '-o' and '\<output file>' are ignored)
    /// 
    /// \param CIdx The index object with which the translation unit will be
    /// associated.
    /// 
    /// \param source_filename The name of the source file to load, or NULL if the
    /// source file is included in \p clang_command_line_args.
    /// 
    /// \param num_clang_command_line_args The number of command-line arguments in
    /// \p clang_command_line_args.
    /// 
    /// \param clang_command_line_args The command-line arguments that would be
    /// passed to the \c clang executable if it were being invoked out-of-process.
    /// These command-line options will be parsed and will affect how the translation
    /// unit is parsed. Note that the following options are ignored: '-c',
    /// '-emit-ast', '-fsyntax-only' (which is the default), and '-o \<output file>'.
    /// 
    /// \param num_unsaved_files the number of unsaved file entries in \p
    /// unsaved_files.
    /// 
    /// \param unsaved_files the files that have not yet been saved to disk
    /// but may be required for code completion, including the contents of
    /// those files.  The contents and name of these files (as specified by
    /// CXUnsavedFile) are copied when necessary, so the client only needs to
    /// guarantee their validity until the call to this function returns.
    /// ```
    public static MemorySegment clang_createTranslationUnitFromSourceFile(
    	MemorySegment CIdx,
    	MemorySegment source_filename,
    	int num_clang_command_line_args,
    	MemorySegment clang_command_line_args,
    	int num_unsaved_files,
    	MemorySegment unsaved_files
    ) {
    	MethodHandle method = CLANG_CREATE_TRANSLATION_UNIT_FROM_SOURCE_FILE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			CIdx,
    			source_filename,
    			num_clang_command_line_args,
    			clang_command_line_args,
    			num_unsaved_files,
    			unsaved_files
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_createTranslationUnitFromSourceFile].
    public static @Nullable CXTranslationUnit clang_createTranslationUnitFromSourceFile(
    	MemorySegment CIdx,
    	String source_filename,
    	int num_clang_command_line_args,
    	NativePointerArray clang_command_line_args,
    	int num_unsaved_files,
    	NativeStructArray<CXUnsavedFile> unsaved_files
    ) {
    	try (Arena arena = MemoryStack.stackPush()) {
    		MemorySegment segment = clang_createTranslationUnitFromSourceFile(
    			CIdx,
    			arena.allocateFrom(source_filename),
    			num_clang_command_line_args,
    			clang_command_line_args.memorySegment(),
    			num_unsaved_files,
    			unsaved_files.memorySegment()
    		);
    
    		if (segment.equals(MemorySegment.NULL))
    			return null;
    		
    		return new CXTranslationUnit(segment);
    	}
    }
    
    /// ```
    /// 
    /// Same as \c clang_createTranslationUnit2, but returns
    /// the \c CXTranslationUnit instead of an error code.  In case of an error this
    /// routine returns a \c NULL \c CXTranslationUnit, without further detailed
    /// error codes.
    /// ```
    public static MemorySegment clang_createTranslationUnit(
    	MemorySegment CIdx,
    	MemorySegment ast_filename
    ) {
    	MethodHandle method = CLANG_CREATE_TRANSLATION_UNIT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			CIdx,
    			ast_filename
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_createTranslationUnit].
    public static @Nullable CXTranslationUnit clang_createTranslationUnit(
    	MemorySegment CIdx,
    	String ast_filename
    ) {
    	try (Arena arena = MemoryStack.stackPush()) {
    		MemorySegment segment = clang_createTranslationUnit(
    			CIdx,
    			arena.allocateFrom(ast_filename)
    		);
    
    		if (segment.equals(MemorySegment.NULL))
    			return null;
    		
    		return new CXTranslationUnit(segment);
    	}
    }
    
    /// ```
    /// 
    /// Create a translation unit from an AST file (\c -emit-ast).
    /// 
    /// \param[out] out_TU A non-NULL pointer to store the created
    /// \c CXTranslationUnit.
    /// 
    /// \returns Zero on success, otherwise returns an error code.
    /// ```
    public static int clang_createTranslationUnit2(
    	MemorySegment CIdx,
    	MemorySegment ast_filename,
    	MemorySegment out_TU
    ) {
    	MethodHandle method = CLANG_CREATE_TRANSLATION_UNIT2.get();
    	try {
    		return (int) method.invokeExact(
    			CIdx,
    			ast_filename,
    			out_TU
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_createTranslationUnit2].
    public static int clang_createTranslationUnit2(
    	MemorySegment CIdx,
    	String ast_filename,
    	NativePointerArray out_TU
    ) {
    	try (Arena arena = MemoryStack.stackPush()) {
    		return clang_createTranslationUnit2(
    			CIdx,
    			arena.allocateFrom(ast_filename),
    			out_TU.memorySegment()
    		);
    	}
    }
    
    /// ```
    /// 
    /// Returns the set of flags that is suitable for parsing a translation
    /// unit that is being edited.
    /// 
    /// The set of flags returned provide options for \c clang_parseTranslationUnit()
    /// to indicate that the translation unit is likely to be reparsed many times,
    /// either explicitly (via \c clang_reparseTranslationUnit()) or implicitly
    /// (e.g., by code completion (\c clang_codeCompletionAt())). The returned flag
    /// set contains an unspecified set of optimizations (e.g., the precompiled
    /// preamble) geared toward improving the performance of these routines. The
    /// set of optimizations enabled may change from one version to the next.
    /// ```
    public static int clang_defaultEditingTranslationUnitOptions() {
    	MethodHandle method = CLANG_DEFAULT_EDITING_TRANSLATION_UNIT_OPTIONS.get();
    	try {
    		return (int) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// 
    /// Same as \c clang_parseTranslationUnit2, but returns
    /// the \c CXTranslationUnit instead of an error code.  In case of an error this
    /// routine returns a \c NULL \c CXTranslationUnit, without further detailed
    /// error codes.
    /// ```
    public static MemorySegment clang_parseTranslationUnit(
    	MemorySegment CIdx,
    	MemorySegment source_filename,
    	MemorySegment command_line_args,
    	int num_command_line_args,
    	MemorySegment unsaved_files,
    	int num_unsaved_files,
    	int options
    ) {
    	MethodHandle method = CLANG_PARSE_TRANSLATION_UNIT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			CIdx,
    			source_filename,
    			command_line_args,
    			num_command_line_args,
    			unsaved_files,
    			num_unsaved_files,
    			options
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_parseTranslationUnit].
    public static @Nullable CXTranslationUnit clang_parseTranslationUnit(
    	MemorySegment CIdx,
    	String source_filename,
    	@Nullable NativePointerArray command_line_args,
    	int num_command_line_args,
    	@Nullable NativeStructArray<CXUnsavedFile> unsaved_files,
    	int num_unsaved_files,
    	int options
    ) {
    	try (Arena arena = MemoryStack.stackPush()) {
    		MemorySegment segment = clang_parseTranslationUnit(
    			CIdx,
    			arena.allocateFrom(source_filename),
    			command_line_args == null ? MemorySegment.NULL : command_line_args.memorySegment(),
    			num_command_line_args,
    			unsaved_files == null ? MemorySegment.NULL : unsaved_files.memorySegment(),
    			num_unsaved_files,
    			options
    		);
    
    		if (segment.equals(MemorySegment.NULL))
    			return null;
    		
    		return new CXTranslationUnit(segment);
    	}
    }
    
    /// ```
    /// 
    /// Parse the given source file and the translation unit corresponding
    /// to that file.
    /// 
    /// This routine is the main entry point for the Clang C API, providing the
    /// ability to parse a source file into a translation unit that can then be
    /// queried by other functions in the API. This routine accepts a set of
    /// command-line arguments so that the compilation can be configured in the same
    /// way that the compiler is configured on the command line.
    /// 
    /// \param CIdx The index object with which the translation unit will be
    /// associated.
    /// 
    /// \param source_filename The name of the source file to load, or NULL if the
    /// source file is included in \c command_line_args.
    /// 
    /// \param command_line_args The command-line arguments that would be
    /// passed to the \c clang executable if it were being invoked out-of-process.
    /// These command-line options will be parsed and will affect how the translation
    /// unit is parsed. Note that the following options are ignored: '-c',
    /// '-emit-ast', '-fsyntax-only' (which is the default), and '-o \<output file>'.
    /// 
    /// \param num_command_line_args The number of command-line arguments in
    /// \c command_line_args.
    /// 
    /// \param unsaved_files the files that have not yet been saved to disk
    /// but may be required for parsing, including the contents of
    /// those files.  The contents and name of these files (as specified by
    /// CXUnsavedFile) are copied when necessary, so the client only needs to
    /// guarantee their validity until the call to this function returns.
    /// 
    /// \param num_unsaved_files the number of unsaved file entries in \p
    /// unsaved_files.
    /// 
    /// \param options A bitmask of options that affects how the translation unit
    /// is managed but not its compilation. This should be a bitwise OR of the
    /// CXTranslationUnit_XXX flags.
    /// 
    /// \param[out] out_TU A non-NULL pointer to store the created
    /// \c CXTranslationUnit, describing the parsed code and containing any
    /// diagnostics produced by the compiler.
    /// 
    /// \returns Zero on success, otherwise returns an error code.
    /// ```
    public static int clang_parseTranslationUnit2(
    	MemorySegment CIdx,
    	MemorySegment source_filename,
    	MemorySegment command_line_args,
    	int num_command_line_args,
    	MemorySegment unsaved_files,
    	int num_unsaved_files,
    	int options,
    	MemorySegment out_TU
    ) {
    	MethodHandle method = CLANG_PARSE_TRANSLATION_UNIT2.get();
    	try {
    		return (int) method.invokeExact(
    			CIdx,
    			source_filename,
    			command_line_args,
    			num_command_line_args,
    			unsaved_files,
    			num_unsaved_files,
    			options,
    			out_TU
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_parseTranslationUnit2].
    public static int clang_parseTranslationUnit2(
    	MemorySegment CIdx,
    	String source_filename,
    	@Nullable NativePointerArray command_line_args,
    	int num_command_line_args,
    	@Nullable NativeStructArray<CXUnsavedFile> unsaved_files,
    	int num_unsaved_files,
    	int options,
    	NativePointerArray out_TU
    ) {
    	try (Arena arena = MemoryStack.stackPush()) {
    		return clang_parseTranslationUnit2(
    			CIdx,
    			arena.allocateFrom(source_filename),
    			command_line_args == null ? MemorySegment.NULL : command_line_args.memorySegment(),
    			num_command_line_args,
    			unsaved_files == null ? MemorySegment.NULL : unsaved_files.memorySegment(),
    			num_unsaved_files,
    			options,
    			out_TU.memorySegment()
    		);
    	}
    }
    
    /// ```
    /// 
    /// Same as clang_parseTranslationUnit2 but requires a full command line
    /// for \c command_line_args including argv[0]. This is useful if the standard
    /// library paths are relative to the binary.
    /// ```
    public static int clang_parseTranslationUnit2FullArgv(
    	MemorySegment CIdx,
    	MemorySegment source_filename,
    	MemorySegment command_line_args,
    	int num_command_line_args,
    	MemorySegment unsaved_files,
    	int num_unsaved_files,
    	int options,
    	MemorySegment out_TU
    ) {
    	MethodHandle method = CLANG_PARSE_TRANSLATION_UNIT2_FULL_ARGV.get();
    	try {
    		return (int) method.invokeExact(
    			CIdx,
    			source_filename,
    			command_line_args,
    			num_command_line_args,
    			unsaved_files,
    			num_unsaved_files,
    			options,
    			out_TU
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_parseTranslationUnit2FullArgv].
    public static int clang_parseTranslationUnit2FullArgv(
    	MemorySegment CIdx,
    	String source_filename,
    	@Nullable NativePointerArray command_line_args,
    	int num_command_line_args,
    	@Nullable NativeStructArray<CXUnsavedFile> unsaved_files,
    	int num_unsaved_files,
    	int options,
    	NativePointerArray out_TU
    ) {
    	try (Arena arena = MemoryStack.stackPush()) {
    		return clang_parseTranslationUnit2FullArgv(
    			CIdx,
    			arena.allocateFrom(source_filename),
    			command_line_args == null ? MemorySegment.NULL : command_line_args.memorySegment(),
    			num_command_line_args,
    			unsaved_files == null ? MemorySegment.NULL : unsaved_files.memorySegment(),
    			num_unsaved_files,
    			options,
    			out_TU.memorySegment()
    		);
    	}
    }
    
    /// ```
    /// 
    /// Returns the set of flags that is suitable for saving a translation
    /// unit.
    /// 
    /// The set of flags returned provide options for
    /// \c clang_saveTranslationUnit() by default. The returned flag
    /// set contains an unspecified set of options that save translation units with
    /// the most commonly-requested data.
    /// ```
    public static int clang_defaultSaveOptions(
    	MemorySegment TU
    ) {
    	MethodHandle method = CLANG_DEFAULT_SAVE_OPTIONS.get();
    	try {
    		return (int) method.invokeExact(
    			TU
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_defaultSaveOptions].
    public static int clang_defaultSaveOptions(
    	CXTranslationUnit TU
    ) {
    	return clang_defaultSaveOptions(
    		TU.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Saves a translation unit into a serialized representation of
    /// that translation unit on disk.
    /// 
    /// Any translation unit that was parsed without error can be saved
    /// into a file. The translation unit can then be deserialized into a
    /// new \c CXTranslationUnit with \c clang_createTranslationUnit() or,
    /// if it is an incomplete translation unit that corresponds to a
    /// header, used as a precompiled header when parsing other translation
    /// units.
    /// 
    /// \param TU The translation unit to save.
    /// 
    /// \param FileName The file to which the translation unit will be saved.
    /// 
    /// \param options A bitmask of options that affects how the translation unit
    /// is saved. This should be a bitwise OR of the
    /// CXSaveTranslationUnit_XXX flags.
    /// 
    /// \returns A value that will match one of the enumerators of the CXSaveError
    /// enumeration. Zero (CXSaveError_None) indicates that the translation unit was
    /// saved successfully, while a non-zero value indicates that a problem occurred.
    /// ```
    public static int clang_saveTranslationUnit(
    	MemorySegment TU,
    	MemorySegment FileName,
    	int options
    ) {
    	MethodHandle method = CLANG_SAVE_TRANSLATION_UNIT.get();
    	try {
    		return (int) method.invokeExact(
    			TU,
    			FileName,
    			options
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_saveTranslationUnit].
    public static int clang_saveTranslationUnit(
    	CXTranslationUnit TU,
    	String FileName,
    	int options
    ) {
    	try (Arena arena = MemoryStack.stackPush()) {
    		return clang_saveTranslationUnit(
    			TU.memorySegment(),
    			arena.allocateFrom(FileName),
    			options
    		);
    	}
    }
    
    /// ```
    /// 
    /// Suspend a translation unit in order to free memory associated with it.
    /// 
    /// A suspended translation unit uses significantly less memory but on the other
    /// side does not support any other calls than \c clang_reparseTranslationUnit
    /// to resume it or \c clang_disposeTranslationUnit to dispose it completely.
    /// ```
    public static int clang_suspendTranslationUnit(
    	MemorySegment param0
    ) {
    	MethodHandle method = CLANG_SUSPEND_TRANSLATION_UNIT.get();
    	try {
    		return (int) method.invokeExact(
    			param0
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_suspendTranslationUnit].
    public static int clang_suspendTranslationUnit(
    	CXTranslationUnit param0
    ) {
    	return clang_suspendTranslationUnit(
    		param0.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Destroy the specified CXTranslationUnit object.
    /// ```
    public static void clang_disposeTranslationUnit(
    	MemorySegment param0
    ) {
    	MethodHandle method = CLANG_DISPOSE_TRANSLATION_UNIT.get();
    	try {
    		 method.invokeExact(
    			param0
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_disposeTranslationUnit].
    public static void clang_disposeTranslationUnit(
    	CXTranslationUnit param0
    ) {
    	clang_disposeTranslationUnit(
    		param0.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Returns the set of flags that is suitable for reparsing a translation
    /// unit.
    /// 
    /// The set of flags returned provide options for
    /// \c clang_reparseTranslationUnit() by default. The returned flag
    /// set contains an unspecified set of optimizations geared toward common uses
    /// of reparsing. The set of optimizations enabled may change from one version
    /// to the next.
    /// ```
    public static int clang_defaultReparseOptions(
    	MemorySegment TU
    ) {
    	MethodHandle method = CLANG_DEFAULT_REPARSE_OPTIONS.get();
    	try {
    		return (int) method.invokeExact(
    			TU
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_defaultReparseOptions].
    public static int clang_defaultReparseOptions(
    	CXTranslationUnit TU
    ) {
    	return clang_defaultReparseOptions(
    		TU.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Reparse the source files that produced this translation unit.
    /// 
    /// This routine can be used to re-parse the source files that originally
    /// created the given translation unit, for example because those source files
    /// have changed (either on disk or as passed via \p unsaved_files). The
    /// source code will be reparsed with the same command-line options as it
    /// was originally parsed.
    /// 
    /// Reparsing a translation unit invalidates all cursors and source locations
    /// that refer into that translation unit. This makes reparsing a translation
    /// unit semantically equivalent to destroying the translation unit and then
    /// creating a new translation unit with the same command-line arguments.
    /// However, it may be more efficient to reparse a translation
    /// unit using this routine.
    /// 
    /// \param TU The translation unit whose contents will be re-parsed. The
    /// translation unit must originally have been built with
    /// \c clang_createTranslationUnitFromSourceFile().
    /// 
    /// \param num_unsaved_files The number of unsaved file entries in \p
    /// unsaved_files.
    /// 
    /// \param unsaved_files The files that have not yet been saved to disk
    /// but may be required for parsing, including the contents of
    /// those files.  The contents and name of these files (as specified by
    /// CXUnsavedFile) are copied when necessary, so the client only needs to
    /// guarantee their validity until the call to this function returns.
    /// 
    /// \param options A bitset of options composed of the flags in CXReparse_Flags.
    /// The function \c clang_defaultReparseOptions() produces a default set of
    /// options recommended for most uses, based on the translation unit.
    /// 
    /// \returns 0 if the sources could be reparsed.  A non-zero error code will be
    /// returned if reparsing was impossible, such that the translation unit is
    /// invalid. In such cases, the only valid call for \c TU is
    /// \c clang_disposeTranslationUnit(TU).  The error codes returned by this
    /// routine are described by the \c CXErrorCode enum.
    /// ```
    public static int clang_reparseTranslationUnit(
    	MemorySegment TU,
    	int num_unsaved_files,
    	MemorySegment unsaved_files,
    	int options
    ) {
    	MethodHandle method = CLANG_REPARSE_TRANSLATION_UNIT.get();
    	try {
    		return (int) method.invokeExact(
    			TU,
    			num_unsaved_files,
    			unsaved_files,
    			options
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_reparseTranslationUnit].
    public static int clang_reparseTranslationUnit(
    	CXTranslationUnit TU,
    	int num_unsaved_files,
    	NativeStructArray<CXUnsavedFile> unsaved_files,
    	int options
    ) {
    	return clang_reparseTranslationUnit(
    		TU.memorySegment(),
    		num_unsaved_files,
    		unsaved_files.memorySegment(),
    		options
    	);
    }
    
    /// ```
    /// 
    /// Returns the human-readable null-terminated C string that represents
    /// the name of the memory category.  This string should never be freed.
    /// ```
    public static MemorySegment nclang_getTUResourceUsageName(
    	int kind
    ) {
    	MethodHandle method = CLANG_GET_TURESOURCE_USAGE_NAME.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			kind
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nclang_getTUResourceUsageName].
    public static @Nullable String clang_getTUResourceUsageName(
    	int kind
    ) {
    	MemorySegment segment = nclang_getTUResourceUsageName(
    		kind
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment.getString(0);
    }
    
    /// ```
    /// 
    /// Return the memory usage of a translation unit.  This object
    /// should be released with clang_disposeCXTUResourceUsage().
    /// ```
    public static MemorySegment clang_getCXTUResourceUsage(
    	SegmentAllocator allocator,
    	MemorySegment TU
    ) {
    	MethodHandle method = CLANG_GET_CXTURESOURCE_USAGE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			TU
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_getCXTUResourceUsage].
    public static @Nullable CXTUResourceUsage clang_getCXTUResourceUsage(
    	SegmentAllocator allocator,
    	CXTranslationUnit TU
    ) {
    	MemorySegment segment = clang_getCXTUResourceUsage(
    		allocator,
    		TU.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXTUResourceUsage(segment);
    }
    
    public static void clang_disposeCXTUResourceUsage(
    	MemorySegment usage
    ) {
    	MethodHandle method = CLANG_DISPOSE_CXTURESOURCE_USAGE.get();
    	try {
    		 method.invokeExact(
    			usage
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_disposeCXTUResourceUsage].
    public static void clang_disposeCXTUResourceUsage(
    	CXTUResourceUsage usage
    ) {
    	clang_disposeCXTUResourceUsage(
    		usage.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Get target information for this translation unit.
    /// 
    /// The CXTargetInfo object cannot outlive the CXTranslationUnit object.
    /// ```
    public static MemorySegment clang_getTranslationUnitTargetInfo(
    	MemorySegment CTUnit
    ) {
    	MethodHandle method = CLANG_GET_TRANSLATION_UNIT_TARGET_INFO.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			CTUnit
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_getTranslationUnitTargetInfo].
    public static @Nullable CXTargetInfo clang_getTranslationUnitTargetInfo(
    	CXTranslationUnit CTUnit
    ) {
    	MemorySegment segment = clang_getTranslationUnitTargetInfo(
    		CTUnit.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXTargetInfo(segment);
    }
    
    /// ```
    /// 
    /// Destroy the CXTargetInfo object.
    /// ```
    public static void clang_TargetInfo_dispose(
    	MemorySegment Info
    ) {
    	MethodHandle method = CLANG_TARGET_INFO_DISPOSE.get();
    	try {
    		 method.invokeExact(
    			Info
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_TargetInfo_dispose].
    public static void clang_TargetInfo_dispose(
    	CXTargetInfo Info
    ) {
    	clang_TargetInfo_dispose(
    		Info.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Get the normalized target triple as a string.
    /// 
    /// Returns the empty string in case of any error.
    /// ```
    public static MemorySegment clang_TargetInfo_getTriple(
    	SegmentAllocator allocator,
    	MemorySegment Info
    ) {
    	MethodHandle method = CLANG_TARGET_INFO_GET_TRIPLE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			Info
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_TargetInfo_getTriple].
    public static @Nullable CXString clang_TargetInfo_getTriple(
    	SegmentAllocator allocator,
    	CXTargetInfo Info
    ) {
    	MemorySegment segment = clang_TargetInfo_getTriple(
    		allocator,
    		Info.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXString(segment);
    }
    
    /// ```
    /// 
    /// Get the pointer width of the target in bits.
    /// 
    /// Returns -1 in case of error.
    /// ```
    public static int clang_TargetInfo_getPointerWidth(
    	MemorySegment Info
    ) {
    	MethodHandle method = CLANG_TARGET_INFO_GET_POINTER_WIDTH.get();
    	try {
    		return (int) method.invokeExact(
    			Info
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_TargetInfo_getPointerWidth].
    public static int clang_TargetInfo_getPointerWidth(
    	CXTargetInfo Info
    ) {
    	return clang_TargetInfo_getPointerWidth(
    		Info.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Retrieve the NULL cursor, which represents no entity.
    /// ```
    public static MemorySegment nclang_getNullCursor(
    	SegmentAllocator allocator
    ) {
    	MethodHandle method = CLANG_GET_NULL_CURSOR.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nclang_getNullCursor].
    public static @Nullable CXCursor clang_getNullCursor(
    	SegmentAllocator allocator
    ) {
    	MemorySegment segment = nclang_getNullCursor(
    		allocator
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXCursor(segment);
    }
    
    /// ```
    /// 
    /// Retrieve the cursor that represents the given translation unit.
    /// 
    /// The translation unit cursor can be used to start traversing the
    /// various declarations within the given translation unit.
    /// ```
    public static MemorySegment clang_getTranslationUnitCursor(
    	SegmentAllocator allocator,
    	MemorySegment param0
    ) {
    	MethodHandle method = CLANG_GET_TRANSLATION_UNIT_CURSOR.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			param0
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_getTranslationUnitCursor].
    public static @Nullable CXCursor clang_getTranslationUnitCursor(
    	SegmentAllocator allocator,
    	CXTranslationUnit param0
    ) {
    	MemorySegment segment = clang_getTranslationUnitCursor(
    		allocator,
    		param0.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXCursor(segment);
    }
    
    /// ```
    /// 
    /// Determine whether two cursors are equivalent.
    /// ```
    public static int clang_equalCursors(
    	MemorySegment param0,
    	MemorySegment param1
    ) {
    	MethodHandle method = CLANG_EQUAL_CURSORS.get();
    	try {
    		return (int) method.invokeExact(
    			param0,
    			param1
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_equalCursors].
    public static int clang_equalCursors(
    	CXCursor param0,
    	CXCursor param1
    ) {
    	return clang_equalCursors(
    		param0.memorySegment(),
    		param1.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Returns non-zero if \p cursor is null.
    /// ```
    public static int clang_Cursor_isNull(
    	MemorySegment cursor
    ) {
    	MethodHandle method = CLANG_CURSOR_IS_NULL.get();
    	try {
    		return (int) method.invokeExact(
    			cursor
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_Cursor_isNull].
    public static int clang_Cursor_isNull(
    	CXCursor cursor
    ) {
    	return clang_Cursor_isNull(
    		cursor.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Compute a hash value for the given cursor.
    /// ```
    public static int clang_hashCursor(
    	MemorySegment param0
    ) {
    	MethodHandle method = CLANG_HASH_CURSOR.get();
    	try {
    		return (int) method.invokeExact(
    			param0
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_hashCursor].
    public static int clang_hashCursor(
    	CXCursor param0
    ) {
    	return clang_hashCursor(
    		param0.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Retrieve the kind of the given cursor.
    /// ```
    public static int clang_getCursorKind(
    	MemorySegment param0
    ) {
    	MethodHandle method = CLANG_GET_CURSOR_KIND.get();
    	try {
    		return (int) method.invokeExact(
    			param0
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_getCursorKind].
    public static int clang_getCursorKind(
    	CXCursor param0
    ) {
    	return clang_getCursorKind(
    		param0.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Determine whether the given cursor kind represents a declaration.
    /// ```
    public static int clang_isDeclaration(
    	int param0
    ) {
    	MethodHandle method = CLANG_IS_DECLARATION.get();
    	try {
    		return (int) method.invokeExact(
    			param0
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// 
    /// Determine whether the given declaration is invalid.
    /// 
    /// A declaration is invalid if it could not be parsed successfully.
    /// 
    /// \returns non-zero if the cursor represents a declaration and it is
    /// invalid, otherwise zero.
    /// ```
    public static int clang_isInvalidDeclaration(
    	MemorySegment param0
    ) {
    	MethodHandle method = CLANG_IS_INVALID_DECLARATION.get();
    	try {
    		return (int) method.invokeExact(
    			param0
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_isInvalidDeclaration].
    public static int clang_isInvalidDeclaration(
    	CXCursor param0
    ) {
    	return clang_isInvalidDeclaration(
    		param0.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Determine whether the given cursor kind represents a simple
    /// reference.
    /// 
    /// Note that other kinds of cursors (such as expressions) can also refer to
    /// other cursors. Use clang_getCursorReferenced() to determine whether a
    /// particular cursor refers to another entity.
    /// ```
    public static int clang_isReference(
    	int param0
    ) {
    	MethodHandle method = CLANG_IS_REFERENCE.get();
    	try {
    		return (int) method.invokeExact(
    			param0
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// 
    /// Determine whether the given cursor kind represents an expression.
    /// ```
    public static int clang_isExpression(
    	int param0
    ) {
    	MethodHandle method = CLANG_IS_EXPRESSION.get();
    	try {
    		return (int) method.invokeExact(
    			param0
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// 
    /// Determine whether the given cursor kind represents a statement.
    /// ```
    public static int clang_isStatement(
    	int param0
    ) {
    	MethodHandle method = CLANG_IS_STATEMENT.get();
    	try {
    		return (int) method.invokeExact(
    			param0
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// 
    /// Determine whether the given cursor kind represents an attribute.
    /// ```
    public static int clang_isAttribute(
    	int param0
    ) {
    	MethodHandle method = CLANG_IS_ATTRIBUTE.get();
    	try {
    		return (int) method.invokeExact(
    			param0
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// 
    /// Determine whether the given cursor has any attributes.
    /// ```
    public static int clang_Cursor_hasAttrs(
    	MemorySegment C
    ) {
    	MethodHandle method = CLANG_CURSOR_HAS_ATTRS.get();
    	try {
    		return (int) method.invokeExact(
    			C
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_Cursor_hasAttrs].
    public static int clang_Cursor_hasAttrs(
    	CXCursor C
    ) {
    	return clang_Cursor_hasAttrs(
    		C.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Determine whether the given cursor kind represents an invalid
    /// cursor.
    /// ```
    public static int clang_isInvalid(
    	int param0
    ) {
    	MethodHandle method = CLANG_IS_INVALID.get();
    	try {
    		return (int) method.invokeExact(
    			param0
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// 
    /// Determine whether the given cursor kind represents a translation
    /// unit.
    /// ```
    public static int clang_isTranslationUnit(
    	int param0
    ) {
    	MethodHandle method = CLANG_IS_TRANSLATION_UNIT.get();
    	try {
    		return (int) method.invokeExact(
    			param0
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// 
    /// Determine whether the given cursor represents a preprocessing
    /// element, such as a preprocessor directive or macro instantiation.
    /// ```
    public static int clang_isPreprocessing(
    	int param0
    ) {
    	MethodHandle method = CLANG_IS_PREPROCESSING.get();
    	try {
    		return (int) method.invokeExact(
    			param0
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// 
    /// Determine whether the given cursor represents a currently
    /// unexposed piece of the AST (e.g., CXCursor_UnexposedStmt).
    /// ```
    public static int clang_isUnexposed(
    	int param0
    ) {
    	MethodHandle method = CLANG_IS_UNEXPOSED.get();
    	try {
    		return (int) method.invokeExact(
    			param0
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// 
    /// Determine the linkage of the entity referred to by a given cursor.
    /// ```
    public static int clang_getCursorLinkage(
    	MemorySegment cursor
    ) {
    	MethodHandle method = CLANG_GET_CURSOR_LINKAGE.get();
    	try {
    		return (int) method.invokeExact(
    			cursor
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_getCursorLinkage].
    public static int clang_getCursorLinkage(
    	CXCursor cursor
    ) {
    	return clang_getCursorLinkage(
    		cursor.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Describe the visibility of the entity referred to by a cursor.
    /// 
    /// This returns the default visibility if not explicitly specified by
    /// a visibility attribute. The default visibility may be changed by
    /// commandline arguments.
    /// 
    /// \param cursor The cursor to query.
    /// 
    /// \returns The visibility of the cursor.
    /// ```
    public static int clang_getCursorVisibility(
    	MemorySegment cursor
    ) {
    	MethodHandle method = CLANG_GET_CURSOR_VISIBILITY.get();
    	try {
    		return (int) method.invokeExact(
    			cursor
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_getCursorVisibility].
    public static int clang_getCursorVisibility(
    	CXCursor cursor
    ) {
    	return clang_getCursorVisibility(
    		cursor.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Determine the availability of the entity that this cursor refers to,
    /// taking the current target platform into account.
    /// 
    /// \param cursor The cursor to query.
    /// 
    /// \returns The availability of the cursor.
    /// ```
    public static int clang_getCursorAvailability(
    	MemorySegment cursor
    ) {
    	MethodHandle method = CLANG_GET_CURSOR_AVAILABILITY.get();
    	try {
    		return (int) method.invokeExact(
    			cursor
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_getCursorAvailability].
    public static int clang_getCursorAvailability(
    	CXCursor cursor
    ) {
    	return clang_getCursorAvailability(
    		cursor.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Determine the availability of the entity that this cursor refers to
    /// on any platforms for which availability information is known.
    /// 
    /// \param cursor The cursor to query.
    /// 
    /// \param always_deprecated If non-NULL, will be set to indicate whether the
    /// entity is deprecated on all platforms.
    /// 
    /// \param deprecated_message If non-NULL, will be set to the message text
    /// provided along with the unconditional deprecation of this entity. The client
    /// is responsible for deallocating this string.
    /// 
    /// \param always_unavailable If non-NULL, will be set to indicate whether the
    /// entity is unavailable on all platforms.
    /// 
    /// \param unavailable_message If non-NULL, will be set to the message text
    /// provided along with the unconditional unavailability of this entity. The
    /// client is responsible for deallocating this string.
    /// 
    /// \param availability If non-NULL, an array of CXPlatformAvailability instances
    /// that will be populated with platform availability information, up to either
    /// the number of platforms for which availability information is available (as
    /// returned by this function) or \c availability_size, whichever is smaller.
    /// 
    /// \param availability_size The number of elements available in the
    /// \c availability array.
    /// 
    /// \returns The number of platforms (N) for which availability information is
    /// available (which is unrelated to \c availability_size).
    /// 
    /// Note that the client is responsible for calling
    /// \c clang_disposeCXPlatformAvailability to free each of the
    /// platform-availability structures returned. There are
    /// \c min(N, availability_size) such structures.
    /// ```
    public static int clang_getCursorPlatformAvailability(
    	MemorySegment cursor,
    	MemorySegment always_deprecated,
    	MemorySegment deprecated_message,
    	MemorySegment always_unavailable,
    	MemorySegment unavailable_message,
    	MemorySegment availability,
    	int availability_size
    ) {
    	MethodHandle method = CLANG_GET_CURSOR_PLATFORM_AVAILABILITY.get();
    	try {
    		return (int) method.invokeExact(
    			cursor,
    			always_deprecated,
    			deprecated_message,
    			always_unavailable,
    			unavailable_message,
    			availability,
    			availability_size
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_getCursorPlatformAvailability].
    public static int clang_getCursorPlatformAvailability(
    	CXCursor cursor,
    	NativeIntArray always_deprecated,
    	CXString deprecated_message,
    	NativeIntArray always_unavailable,
    	CXString unavailable_message,
    	NativeStructArray<CXPlatformAvailability> availability,
    	int availability_size
    ) {
    	return clang_getCursorPlatformAvailability(
    		cursor.memorySegment(),
    		always_deprecated.memorySegment(),
    		deprecated_message.memorySegment(),
    		always_unavailable.memorySegment(),
    		unavailable_message.memorySegment(),
    		availability.memorySegment(),
    		availability_size
    	);
    }
    
    /// ```
    /// 
    /// Free the memory associated with a \c CXPlatformAvailability structure.
    /// ```
    public static void clang_disposeCXPlatformAvailability(
    	MemorySegment availability
    ) {
    	MethodHandle method = CLANG_DISPOSE_CXPLATFORM_AVAILABILITY.get();
    	try {
    		 method.invokeExact(
    			availability
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_disposeCXPlatformAvailability].
    public static void clang_disposeCXPlatformAvailability(
    	CXPlatformAvailability availability
    ) {
    	clang_disposeCXPlatformAvailability(
    		availability.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// If cursor refers to a variable declaration and it has initializer returns
    /// cursor referring to the initializer otherwise return null cursor.
    /// ```
    public static MemorySegment clang_Cursor_getVarDeclInitializer(
    	SegmentAllocator allocator,
    	MemorySegment cursor
    ) {
    	MethodHandle method = CLANG_CURSOR_GET_VAR_DECL_INITIALIZER.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			cursor
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_Cursor_getVarDeclInitializer].
    public static @Nullable CXCursor clang_Cursor_getVarDeclInitializer(
    	SegmentAllocator allocator,
    	CXCursor cursor
    ) {
    	MemorySegment segment = clang_Cursor_getVarDeclInitializer(
    		allocator,
    		cursor.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXCursor(segment);
    }
    
    /// ```
    /// 
    /// If cursor refers to a variable declaration that has global storage returns 1.
    /// If cursor refers to a variable declaration that doesn't have global storage
    /// returns 0. Otherwise returns -1.
    /// ```
    public static int clang_Cursor_hasVarDeclGlobalStorage(
    	MemorySegment cursor
    ) {
    	MethodHandle method = CLANG_CURSOR_HAS_VAR_DECL_GLOBAL_STORAGE.get();
    	try {
    		return (int) method.invokeExact(
    			cursor
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_Cursor_hasVarDeclGlobalStorage].
    public static int clang_Cursor_hasVarDeclGlobalStorage(
    	CXCursor cursor
    ) {
    	return clang_Cursor_hasVarDeclGlobalStorage(
    		cursor.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// If cursor refers to a variable declaration that has external storage
    /// returns 1. If cursor refers to a variable declaration that doesn't have
    /// external storage returns 0. Otherwise returns -1.
    /// ```
    public static int clang_Cursor_hasVarDeclExternalStorage(
    	MemorySegment cursor
    ) {
    	MethodHandle method = CLANG_CURSOR_HAS_VAR_DECL_EXTERNAL_STORAGE.get();
    	try {
    		return (int) method.invokeExact(
    			cursor
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_Cursor_hasVarDeclExternalStorage].
    public static int clang_Cursor_hasVarDeclExternalStorage(
    	CXCursor cursor
    ) {
    	return clang_Cursor_hasVarDeclExternalStorage(
    		cursor.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Determine the "language" of the entity referred to by a given cursor.
    /// ```
    public static int clang_getCursorLanguage(
    	MemorySegment cursor
    ) {
    	MethodHandle method = CLANG_GET_CURSOR_LANGUAGE.get();
    	try {
    		return (int) method.invokeExact(
    			cursor
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_getCursorLanguage].
    public static int clang_getCursorLanguage(
    	CXCursor cursor
    ) {
    	return clang_getCursorLanguage(
    		cursor.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Determine the "thread-local storage (TLS) kind" of the declaration
    /// referred to by a cursor.
    /// ```
    public static int clang_getCursorTLSKind(
    	MemorySegment cursor
    ) {
    	MethodHandle method = CLANG_GET_CURSOR_TLSKIND.get();
    	try {
    		return (int) method.invokeExact(
    			cursor
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_getCursorTLSKind].
    public static int clang_getCursorTLSKind(
    	CXCursor cursor
    ) {
    	return clang_getCursorTLSKind(
    		cursor.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Returns the translation unit that a cursor originated from.
    /// ```
    public static MemorySegment clang_Cursor_getTranslationUnit(
    	MemorySegment param0
    ) {
    	MethodHandle method = CLANG_CURSOR_GET_TRANSLATION_UNIT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			param0
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_Cursor_getTranslationUnit].
    public static @Nullable CXTranslationUnit clang_Cursor_getTranslationUnit(
    	CXCursor param0
    ) {
    	MemorySegment segment = clang_Cursor_getTranslationUnit(
    		param0.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXTranslationUnit(segment);
    }
    
    /// ```
    /// 
    /// Creates an empty CXCursorSet.
    /// ```
    public static MemorySegment nclang_createCXCursorSet() {
    	MethodHandle method = CLANG_CREATE_CXCURSOR_SET.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nclang_createCXCursorSet].
    public static @Nullable CXCursorSet clang_createCXCursorSet() {
    	MemorySegment segment = nclang_createCXCursorSet();
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    	
    	return new CXCursorSet(segment);
    }
    
    /// ```
    /// 
    /// Disposes a CXCursorSet and releases its associated memory.
    /// ```
    public static void clang_disposeCXCursorSet(
    	MemorySegment cset
    ) {
    	MethodHandle method = CLANG_DISPOSE_CXCURSOR_SET.get();
    	try {
    		 method.invokeExact(
    			cset
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_disposeCXCursorSet].
    public static void clang_disposeCXCursorSet(
    	CXCursorSet cset
    ) {
    	clang_disposeCXCursorSet(
    		cset.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Queries a CXCursorSet to see if it contains a specific CXCursor.
    /// 
    /// \returns non-zero if the set contains the specified cursor.
    /// ```
    public static int clang_CXCursorSet_contains(
    	MemorySegment cset,
    	MemorySegment cursor
    ) {
    	MethodHandle method = CLANG_CXCURSOR_SET_CONTAINS.get();
    	try {
    		return (int) method.invokeExact(
    			cset,
    			cursor
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_CXCursorSet_contains].
    public static int clang_CXCursorSet_contains(
    	CXCursorSet cset,
    	CXCursor cursor
    ) {
    	return clang_CXCursorSet_contains(
    		cset.memorySegment(),
    		cursor.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Inserts a CXCursor into a CXCursorSet.
    /// 
    /// \returns zero if the CXCursor was already in the set, and non-zero otherwise.
    /// ```
    public static int clang_CXCursorSet_insert(
    	MemorySegment cset,
    	MemorySegment cursor
    ) {
    	MethodHandle method = CLANG_CXCURSOR_SET_INSERT.get();
    	try {
    		return (int) method.invokeExact(
    			cset,
    			cursor
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_CXCursorSet_insert].
    public static int clang_CXCursorSet_insert(
    	CXCursorSet cset,
    	CXCursor cursor
    ) {
    	return clang_CXCursorSet_insert(
    		cset.memorySegment(),
    		cursor.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Determine the semantic parent of the given cursor.
    /// 
    /// The semantic parent of a cursor is the cursor that semantically contains
    /// the given \p cursor. For many declarations, the lexical and semantic parents
    /// are equivalent (the lexical parent is returned by
    /// \c clang_getCursorLexicalParent()). They diverge when declarations or
    /// definitions are provided out-of-line. For example:
    /// 
    /// \code
    /// class C {
    /// void f();
    /// };
    /// 
    /// void C::f() { }
    /// \endcode
    /// 
    /// In the out-of-line definition of \c C::f, the semantic parent is
    /// the class \c C, of which this function is a member. The lexical parent is
    /// the place where the declaration actually occurs in the source code; in this
    /// case, the definition occurs in the translation unit. In general, the
    /// lexical parent for a given entity can change without affecting the semantics
    /// of the program, and the lexical parent of different declarations of the
    /// same entity may be different. Changing the semantic parent of a declaration,
    /// on the other hand, can have a major impact on semantics, and redeclarations
    /// of a particular entity should all have the same semantic context.
    /// 
    /// In the example above, both declarations of \c C::f have \c C as their
    /// semantic context, while the lexical context of the first \c C::f is \c C
    /// and the lexical context of the second \c C::f is the translation unit.
    /// 
    /// For global declarations, the semantic parent is the translation unit.
    /// ```
    public static MemorySegment clang_getCursorSemanticParent(
    	SegmentAllocator allocator,
    	MemorySegment cursor
    ) {
    	MethodHandle method = CLANG_GET_CURSOR_SEMANTIC_PARENT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			cursor
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_getCursorSemanticParent].
    public static @Nullable CXCursor clang_getCursorSemanticParent(
    	SegmentAllocator allocator,
    	CXCursor cursor
    ) {
    	MemorySegment segment = clang_getCursorSemanticParent(
    		allocator,
    		cursor.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXCursor(segment);
    }
    
    /// ```
    /// 
    /// Determine the lexical parent of the given cursor.
    /// 
    /// The lexical parent of a cursor is the cursor in which the given \p cursor
    /// was actually written. For many declarations, the lexical and semantic parents
    /// are equivalent (the semantic parent is returned by
    /// \c clang_getCursorSemanticParent()). They diverge when declarations or
    /// definitions are provided out-of-line. For example:
    /// 
    /// \code
    /// class C {
    /// void f();
    /// };
    /// 
    /// void C::f() { }
    /// \endcode
    /// 
    /// In the out-of-line definition of \c C::f, the semantic parent is
    /// the class \c C, of which this function is a member. The lexical parent is
    /// the place where the declaration actually occurs in the source code; in this
    /// case, the definition occurs in the translation unit. In general, the
    /// lexical parent for a given entity can change without affecting the semantics
    /// of the program, and the lexical parent of different declarations of the
    /// same entity may be different. Changing the semantic parent of a declaration,
    /// on the other hand, can have a major impact on semantics, and redeclarations
    /// of a particular entity should all have the same semantic context.
    /// 
    /// In the example above, both declarations of \c C::f have \c C as their
    /// semantic context, while the lexical context of the first \c C::f is \c C
    /// and the lexical context of the second \c C::f is the translation unit.
    /// 
    /// For declarations written in the global scope, the lexical parent is
    /// the translation unit.
    /// ```
    public static MemorySegment clang_getCursorLexicalParent(
    	SegmentAllocator allocator,
    	MemorySegment cursor
    ) {
    	MethodHandle method = CLANG_GET_CURSOR_LEXICAL_PARENT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			cursor
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_getCursorLexicalParent].
    public static @Nullable CXCursor clang_getCursorLexicalParent(
    	SegmentAllocator allocator,
    	CXCursor cursor
    ) {
    	MemorySegment segment = clang_getCursorLexicalParent(
    		allocator,
    		cursor.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXCursor(segment);
    }
    
    /// ```
    /// 
    /// Determine the set of methods that are overridden by the given
    /// method.
    /// 
    /// In both Objective-C and C++, a method (aka virtual member function,
    /// in C++) can override a virtual method in a base class. For
    /// Objective-C, a method is said to override any method in the class's
    /// base class, its protocols, or its categories' protocols, that has the same
    /// selector and is of the same kind (class or instance).
    /// If no such method exists, the search continues to the class's superclass,
    /// its protocols, and its categories, and so on. A method from an Objective-C
    /// implementation is considered to override the same methods as its
    /// corresponding method in the interface.
    /// 
    /// For C++, a virtual member function overrides any virtual member
    /// function with the same signature that occurs in its base
    /// classes. With multiple inheritance, a virtual member function can
    /// override several virtual member functions coming from different
    /// base classes.
    /// 
    /// In all cases, this function determines the immediate overridden
    /// method, rather than all of the overridden methods. For example, if
    /// a method is originally declared in a class A, then overridden in B
    /// (which in inherits from A) and also in C (which inherited from B),
    /// then the only overridden method returned from this function when
    /// invoked on C's method will be B's method. The client may then
    /// invoke this function again, given the previously-found overridden
    /// methods, to map out the complete method-override set.
    /// 
    /// \param cursor A cursor representing an Objective-C or C++
    /// method. This routine will compute the set of methods that this
    /// method overrides.
    /// 
    /// \param overridden A pointer whose pointee will be replaced with a
    /// pointer to an array of cursors, representing the set of overridden
    /// methods. If there are no overridden methods, the pointee will be
    /// set to NULL. The pointee must be freed via a call to
    /// \c clang_disposeOverriddenCursors().
    /// 
    /// \param num_overridden A pointer to the number of overridden
    /// functions, will be set to the number of overridden functions in the
    /// array pointed to by \p overridden.
    /// ```
    public static void clang_getOverriddenCursors(
    	MemorySegment cursor,
    	MemorySegment overridden,
    	MemorySegment num_overridden
    ) {
    	MethodHandle method = CLANG_GET_OVERRIDDEN_CURSORS.get();
    	try {
    		 method.invokeExact(
    			cursor,
    			overridden,
    			num_overridden
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_getOverriddenCursors].
    public static void clang_getOverriddenCursors(
    	CXCursor cursor,
    	NativePointerArray overridden,
    	NativeIntArray num_overridden
    ) {
    	clang_getOverriddenCursors(
    		cursor.memorySegment(),
    		overridden.memorySegment(),
    		num_overridden.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Free the set of overridden cursors returned by \c
    /// clang_getOverriddenCursors().
    /// ```
    public static void clang_disposeOverriddenCursors(
    	MemorySegment overridden
    ) {
    	MethodHandle method = CLANG_DISPOSE_OVERRIDDEN_CURSORS.get();
    	try {
    		 method.invokeExact(
    			overridden
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_disposeOverriddenCursors].
    public static void clang_disposeOverriddenCursors(
    	NativeStructArray<CXCursor> overridden
    ) {
    	clang_disposeOverriddenCursors(
    		overridden.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Retrieve the file that is included by the given inclusion directive
    /// cursor.
    /// ```
    public static MemorySegment clang_getIncludedFile(
    	MemorySegment cursor
    ) {
    	MethodHandle method = CLANG_GET_INCLUDED_FILE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			cursor
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_getIncludedFile].
    public static @Nullable MemorySegment clang_getIncludedFile(
    	CXCursor cursor
    ) {
    	MemorySegment segment = clang_getIncludedFile(
    		cursor.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// ```
    /// 
    /// Map a source location to the cursor that describes the entity at that
    /// location in the source code.
    /// 
    /// clang_getCursor() maps an arbitrary source location within a translation
    /// unit down to the most specific cursor that describes the entity at that
    /// location. For example, given an expression \c x + y, invoking
    /// clang_getCursor() with a source location pointing to "x" will return the
    /// cursor for "x"; similarly for "y". If the cursor points anywhere between
    /// "x" or "y" (e.g., on the + or the whitespace around it), clang_getCursor()
    /// will return a cursor referring to the "+" expression.
    /// 
    /// \returns a cursor representing the entity at the given source location, or
    /// a NULL cursor if no such entity can be found.
    /// ```
    public static MemorySegment clang_getCursor(
    	SegmentAllocator allocator,
    	MemorySegment param0,
    	MemorySegment param1
    ) {
    	MethodHandle method = CLANG_GET_CURSOR.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			param0,
    			param1
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_getCursor].
    public static @Nullable CXCursor clang_getCursor(
    	SegmentAllocator allocator,
    	CXTranslationUnit param0,
    	CXSourceLocation param1
    ) {
    	MemorySegment segment = clang_getCursor(
    		allocator,
    		param0.memorySegment(),
    		param1.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXCursor(segment);
    }
    
    /// ```
    /// 
    /// Retrieve the physical location of the source constructor referenced
    /// by the given cursor.
    /// 
    /// The location of a declaration is typically the location of the name of that
    /// declaration, where the name of that declaration would occur if it is
    /// unnamed, or some keyword that introduces that particular declaration.
    /// The location of a reference is where that reference occurs within the
    /// source code.
    /// ```
    public static MemorySegment clang_getCursorLocation(
    	SegmentAllocator allocator,
    	MemorySegment param0
    ) {
    	MethodHandle method = CLANG_GET_CURSOR_LOCATION.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			param0
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_getCursorLocation].
    public static @Nullable CXSourceLocation clang_getCursorLocation(
    	SegmentAllocator allocator,
    	CXCursor param0
    ) {
    	MemorySegment segment = clang_getCursorLocation(
    		allocator,
    		param0.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXSourceLocation(segment);
    }
    
    /// ```
    /// 
    /// Retrieve the physical extent of the source construct referenced by
    /// the given cursor.
    /// 
    /// The extent of a cursor starts with the file/line/column pointing at the
    /// first character within the source construct that the cursor refers to and
    /// ends with the last character within that source construct. For a
    /// declaration, the extent covers the declaration itself. For a reference,
    /// the extent covers the location of the reference (e.g., where the referenced
    /// entity was actually used).
    /// ```
    public static MemorySegment clang_getCursorExtent(
    	SegmentAllocator allocator,
    	MemorySegment param0
    ) {
    	MethodHandle method = CLANG_GET_CURSOR_EXTENT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			param0
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_getCursorExtent].
    public static @Nullable CXSourceRange clang_getCursorExtent(
    	SegmentAllocator allocator,
    	CXCursor param0
    ) {
    	MemorySegment segment = clang_getCursorExtent(
    		allocator,
    		param0.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXSourceRange(segment);
    }
    
    /// ```
    /// 
    /// Retrieve the type of a CXCursor (if any).
    /// ```
    public static MemorySegment clang_getCursorType(
    	SegmentAllocator allocator,
    	MemorySegment C
    ) {
    	MethodHandle method = CLANG_GET_CURSOR_TYPE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			C
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_getCursorType].
    public static @Nullable CXType clang_getCursorType(
    	SegmentAllocator allocator,
    	CXCursor C
    ) {
    	MemorySegment segment = clang_getCursorType(
    		allocator,
    		C.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXType(segment);
    }
    
    /// ```
    /// 
    /// Pretty-print the underlying type using the rules of the
    /// language of the translation unit from which it came.
    /// 
    /// If the type is invalid, an empty string is returned.
    /// ```
    public static MemorySegment clang_getTypeSpelling(
    	SegmentAllocator allocator,
    	MemorySegment CT
    ) {
    	MethodHandle method = CLANG_GET_TYPE_SPELLING.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			CT
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_getTypeSpelling].
    public static @Nullable CXString clang_getTypeSpelling(
    	SegmentAllocator allocator,
    	CXType CT
    ) {
    	MemorySegment segment = clang_getTypeSpelling(
    		allocator,
    		CT.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXString(segment);
    }
    
    /// ```
    /// 
    /// Retrieve the underlying type of a typedef declaration.
    /// 
    /// If the cursor does not reference a typedef declaration, an invalid type is
    /// returned.
    /// ```
    public static MemorySegment clang_getTypedefDeclUnderlyingType(
    	SegmentAllocator allocator,
    	MemorySegment C
    ) {
    	MethodHandle method = CLANG_GET_TYPEDEF_DECL_UNDERLYING_TYPE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			C
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_getTypedefDeclUnderlyingType].
    public static @Nullable CXType clang_getTypedefDeclUnderlyingType(
    	SegmentAllocator allocator,
    	CXCursor C
    ) {
    	MemorySegment segment = clang_getTypedefDeclUnderlyingType(
    		allocator,
    		C.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXType(segment);
    }
    
    /// ```
    /// 
    /// Retrieve the integer type of an enum declaration.
    /// 
    /// If the cursor does not reference an enum declaration, an invalid type is
    /// returned.
    /// ```
    public static MemorySegment clang_getEnumDeclIntegerType(
    	SegmentAllocator allocator,
    	MemorySegment C
    ) {
    	MethodHandle method = CLANG_GET_ENUM_DECL_INTEGER_TYPE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			C
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_getEnumDeclIntegerType].
    public static @Nullable CXType clang_getEnumDeclIntegerType(
    	SegmentAllocator allocator,
    	CXCursor C
    ) {
    	MemorySegment segment = clang_getEnumDeclIntegerType(
    		allocator,
    		C.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXType(segment);
    }
    
    /// ```
    /// 
    /// Retrieve the integer value of an enum constant declaration as a signed
    /// long long.
    /// 
    /// If the cursor does not reference an enum constant declaration, LLONG_MIN is
    /// returned. Since this is also potentially a valid constant value, the kind of
    /// the cursor must be verified before calling this function.
    /// ```
    public static long clang_getEnumConstantDeclValue(
    	MemorySegment C
    ) {
    	MethodHandle method = CLANG_GET_ENUM_CONSTANT_DECL_VALUE.get();
    	try {
    		return (long) method.invokeExact(
    			C
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_getEnumConstantDeclValue].
    public static long clang_getEnumConstantDeclValue(
    	CXCursor C
    ) {
    	return clang_getEnumConstantDeclValue(
    		C.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Retrieve the integer value of an enum constant declaration as an unsigned
    /// long long.
    /// 
    /// If the cursor does not reference an enum constant declaration, ULLONG_MAX is
    /// returned. Since this is also potentially a valid constant value, the kind of
    /// the cursor must be verified before calling this function.
    /// ```
    public static long clang_getEnumConstantDeclUnsignedValue(
    	MemorySegment C
    ) {
    	MethodHandle method = CLANG_GET_ENUM_CONSTANT_DECL_UNSIGNED_VALUE.get();
    	try {
    		return (long) method.invokeExact(
    			C
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_getEnumConstantDeclUnsignedValue].
    public static long clang_getEnumConstantDeclUnsignedValue(
    	CXCursor C
    ) {
    	return clang_getEnumConstantDeclUnsignedValue(
    		C.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Returns non-zero if the cursor specifies a Record member that is a bit-field.
    /// ```
    public static int clang_Cursor_isBitField(
    	MemorySegment C
    ) {
    	MethodHandle method = CLANG_CURSOR_IS_BIT_FIELD.get();
    	try {
    		return (int) method.invokeExact(
    			C
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_Cursor_isBitField].
    public static int clang_Cursor_isBitField(
    	CXCursor C
    ) {
    	return clang_Cursor_isBitField(
    		C.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Retrieve the bit width of a bit-field declaration as an integer.
    /// 
    /// If the cursor does not reference a bit-field, or if the bit-field's width
    /// expression cannot be evaluated, -1 is returned.
    /// 
    /// For example:
    /// \code
    /// if (clang_Cursor_isBitField(Cursor)) {
    /// int Width = clang_getFieldDeclBitWidth(Cursor);
    /// if (Width != -1) {
    /// // The bit-field width is not value-dependent.
    /// }
    /// }
    /// \endcode
    /// ```
    public static int clang_getFieldDeclBitWidth(
    	MemorySegment C
    ) {
    	MethodHandle method = CLANG_GET_FIELD_DECL_BIT_WIDTH.get();
    	try {
    		return (int) method.invokeExact(
    			C
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_getFieldDeclBitWidth].
    public static int clang_getFieldDeclBitWidth(
    	CXCursor C
    ) {
    	return clang_getFieldDeclBitWidth(
    		C.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Retrieve the number of non-variadic arguments associated with a given
    /// cursor.
    /// 
    /// The number of arguments can be determined for calls as well as for
    /// declarations of functions or methods. For other cursors -1 is returned.
    /// ```
    public static int clang_Cursor_getNumArguments(
    	MemorySegment C
    ) {
    	MethodHandle method = CLANG_CURSOR_GET_NUM_ARGUMENTS.get();
    	try {
    		return (int) method.invokeExact(
    			C
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_Cursor_getNumArguments].
    public static int clang_Cursor_getNumArguments(
    	CXCursor C
    ) {
    	return clang_Cursor_getNumArguments(
    		C.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Retrieve the argument cursor of a function or method.
    /// 
    /// The argument cursor can be determined for calls as well as for declarations
    /// of functions or methods. For other cursors and for invalid indices, an
    /// invalid cursor is returned.
    /// ```
    public static MemorySegment clang_Cursor_getArgument(
    	SegmentAllocator allocator,
    	MemorySegment C,
    	int i
    ) {
    	MethodHandle method = CLANG_CURSOR_GET_ARGUMENT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			C,
    			i
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_Cursor_getArgument].
    public static @Nullable CXCursor clang_Cursor_getArgument(
    	SegmentAllocator allocator,
    	CXCursor C,
    	int i
    ) {
    	MemorySegment segment = clang_Cursor_getArgument(
    		allocator,
    		C.memorySegment(),
    		i
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXCursor(segment);
    }
    
    /// ```
    /// 
    /// Returns the number of template args of a function, struct, or class decl
    /// representing a template specialization.
    /// 
    /// If the argument cursor cannot be converted into a template function
    /// declaration, -1 is returned.
    /// 
    /// For example, for the following declaration and specialization:
    /// template <typename T, int kInt, bool kBool>
    /// void foo() { ... }
    /// 
    /// template <>
    /// void foo<float, -7, true>();
    /// 
    /// The value 3 would be returned from this call.
    /// ```
    public static int clang_Cursor_getNumTemplateArguments(
    	MemorySegment C
    ) {
    	MethodHandle method = CLANG_CURSOR_GET_NUM_TEMPLATE_ARGUMENTS.get();
    	try {
    		return (int) method.invokeExact(
    			C
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_Cursor_getNumTemplateArguments].
    public static int clang_Cursor_getNumTemplateArguments(
    	CXCursor C
    ) {
    	return clang_Cursor_getNumTemplateArguments(
    		C.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Retrieve the kind of the I'th template argument of the CXCursor C.
    /// 
    /// If the argument CXCursor does not represent a FunctionDecl, StructDecl, or
    /// ClassTemplatePartialSpecialization, an invalid template argument kind is
    /// returned.
    /// 
    /// For example, for the following declaration and specialization:
    /// template <typename T, int kInt, bool kBool>
    /// void foo() { ... }
    /// 
    /// template <>
    /// void foo<float, -7, true>();
    /// 
    /// For I = 0, 1, and 2, Type, Integral, and Integral will be returned,
    /// respectively.
    /// ```
    public static int clang_Cursor_getTemplateArgumentKind(
    	MemorySegment C,
    	int I
    ) {
    	MethodHandle method = CLANG_CURSOR_GET_TEMPLATE_ARGUMENT_KIND.get();
    	try {
    		return (int) method.invokeExact(
    			C,
    			I
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_Cursor_getTemplateArgumentKind].
    public static int clang_Cursor_getTemplateArgumentKind(
    	CXCursor C,
    	int I
    ) {
    	return clang_Cursor_getTemplateArgumentKind(
    		C.memorySegment(),
    		I
    	);
    }
    
    /// ```
    /// 
    /// Retrieve a CXType representing the type of a TemplateArgument of a
    /// function decl representing a template specialization.
    /// 
    /// If the argument CXCursor does not represent a FunctionDecl, StructDecl,
    /// ClassDecl or ClassTemplatePartialSpecialization whose I'th template argument
    /// has a kind of CXTemplateArgKind_Integral, an invalid type is returned.
    /// 
    /// For example, for the following declaration and specialization:
    /// template <typename T, int kInt, bool kBool>
    /// void foo() { ... }
    /// 
    /// template <>
    /// void foo<float, -7, true>();
    /// 
    /// If called with I = 0, "float", will be returned.
    /// Invalid types will be returned for I == 1 or 2.
    /// ```
    public static MemorySegment clang_Cursor_getTemplateArgumentType(
    	SegmentAllocator allocator,
    	MemorySegment C,
    	int I
    ) {
    	MethodHandle method = CLANG_CURSOR_GET_TEMPLATE_ARGUMENT_TYPE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			C,
    			I
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_Cursor_getTemplateArgumentType].
    public static @Nullable CXType clang_Cursor_getTemplateArgumentType(
    	SegmentAllocator allocator,
    	CXCursor C,
    	int I
    ) {
    	MemorySegment segment = clang_Cursor_getTemplateArgumentType(
    		allocator,
    		C.memorySegment(),
    		I
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXType(segment);
    }
    
    /// ```
    /// 
    /// Retrieve the value of an Integral TemplateArgument (of a function
    /// decl representing a template specialization) as a signed long long.
    /// 
    /// It is undefined to call this function on a CXCursor that does not represent a
    /// FunctionDecl, StructDecl, ClassDecl or ClassTemplatePartialSpecialization
    /// whose I'th template argument is not an integral value.
    /// 
    /// For example, for the following declaration and specialization:
    /// template <typename T, int kInt, bool kBool>
    /// void foo() { ... }
    /// 
    /// template <>
    /// void foo<float, -7, true>();
    /// 
    /// If called with I = 1 or 2, -7 or true will be returned, respectively.
    /// For I == 0, this function's behavior is undefined.
    /// ```
    public static long clang_Cursor_getTemplateArgumentValue(
    	MemorySegment C,
    	int I
    ) {
    	MethodHandle method = CLANG_CURSOR_GET_TEMPLATE_ARGUMENT_VALUE.get();
    	try {
    		return (long) method.invokeExact(
    			C,
    			I
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_Cursor_getTemplateArgumentValue].
    public static long clang_Cursor_getTemplateArgumentValue(
    	CXCursor C,
    	int I
    ) {
    	return clang_Cursor_getTemplateArgumentValue(
    		C.memorySegment(),
    		I
    	);
    }
    
    /// ```
    /// 
    /// Retrieve the value of an Integral TemplateArgument (of a function
    /// decl representing a template specialization) as an unsigned long long.
    /// 
    /// It is undefined to call this function on a CXCursor that does not represent a
    /// FunctionDecl, StructDecl, ClassDecl or ClassTemplatePartialSpecialization or
    /// whose I'th template argument is not an integral value.
    /// 
    /// For example, for the following declaration and specialization:
    /// template <typename T, int kInt, bool kBool>
    /// void foo() { ... }
    /// 
    /// template <>
    /// void foo<float, 2147483649, true>();
    /// 
    /// If called with I = 1 or 2, 2147483649 or true will be returned, respectively.
    /// For I == 0, this function's behavior is undefined.
    /// ```
    public static long clang_Cursor_getTemplateArgumentUnsignedValue(
    	MemorySegment C,
    	int I
    ) {
    	MethodHandle method = CLANG_CURSOR_GET_TEMPLATE_ARGUMENT_UNSIGNED_VALUE.get();
    	try {
    		return (long) method.invokeExact(
    			C,
    			I
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_Cursor_getTemplateArgumentUnsignedValue].
    public static long clang_Cursor_getTemplateArgumentUnsignedValue(
    	CXCursor C,
    	int I
    ) {
    	return clang_Cursor_getTemplateArgumentUnsignedValue(
    		C.memorySegment(),
    		I
    	);
    }
    
    /// ```
    /// 
    /// Determine whether two CXTypes represent the same type.
    /// 
    /// \returns non-zero if the CXTypes represent the same type and
    /// zero otherwise.
    /// ```
    public static int clang_equalTypes(
    	MemorySegment A,
    	MemorySegment B
    ) {
    	MethodHandle method = CLANG_EQUAL_TYPES.get();
    	try {
    		return (int) method.invokeExact(
    			A,
    			B
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_equalTypes].
    public static int clang_equalTypes(
    	CXType A,
    	CXType B
    ) {
    	return clang_equalTypes(
    		A.memorySegment(),
    		B.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Return the canonical type for a CXType.
    /// 
    /// Clang's type system explicitly models typedefs and all the ways
    /// a specific type can be represented.  The canonical type is the underlying
    /// type with all the "sugar" removed.  For example, if 'T' is a typedef
    /// for 'int', the canonical type for 'T' would be 'int'.
    /// ```
    public static MemorySegment clang_getCanonicalType(
    	SegmentAllocator allocator,
    	MemorySegment T
    ) {
    	MethodHandle method = CLANG_GET_CANONICAL_TYPE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			T
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_getCanonicalType].
    public static @Nullable CXType clang_getCanonicalType(
    	SegmentAllocator allocator,
    	CXType T
    ) {
    	MemorySegment segment = clang_getCanonicalType(
    		allocator,
    		T.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXType(segment);
    }
    
    /// ```
    /// 
    /// Determine whether a CXType has the "const" qualifier set,
    /// without looking through typedefs that may have added "const" at a
    /// different level.
    /// ```
    public static int clang_isConstQualifiedType(
    	MemorySegment T
    ) {
    	MethodHandle method = CLANG_IS_CONST_QUALIFIED_TYPE.get();
    	try {
    		return (int) method.invokeExact(
    			T
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_isConstQualifiedType].
    public static int clang_isConstQualifiedType(
    	CXType T
    ) {
    	return clang_isConstQualifiedType(
    		T.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Determine whether a  CXCursor that is a macro, is
    /// function like.
    /// ```
    public static int clang_Cursor_isMacroFunctionLike(
    	MemorySegment C
    ) {
    	MethodHandle method = CLANG_CURSOR_IS_MACRO_FUNCTION_LIKE.get();
    	try {
    		return (int) method.invokeExact(
    			C
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_Cursor_isMacroFunctionLike].
    public static int clang_Cursor_isMacroFunctionLike(
    	CXCursor C
    ) {
    	return clang_Cursor_isMacroFunctionLike(
    		C.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Determine whether a  CXCursor that is a macro, is a
    /// builtin one.
    /// ```
    public static int clang_Cursor_isMacroBuiltin(
    	MemorySegment C
    ) {
    	MethodHandle method = CLANG_CURSOR_IS_MACRO_BUILTIN.get();
    	try {
    		return (int) method.invokeExact(
    			C
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_Cursor_isMacroBuiltin].
    public static int clang_Cursor_isMacroBuiltin(
    	CXCursor C
    ) {
    	return clang_Cursor_isMacroBuiltin(
    		C.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Determine whether a  CXCursor that is a function declaration, is an
    /// inline declaration.
    /// ```
    public static int clang_Cursor_isFunctionInlined(
    	MemorySegment C
    ) {
    	MethodHandle method = CLANG_CURSOR_IS_FUNCTION_INLINED.get();
    	try {
    		return (int) method.invokeExact(
    			C
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_Cursor_isFunctionInlined].
    public static int clang_Cursor_isFunctionInlined(
    	CXCursor C
    ) {
    	return clang_Cursor_isFunctionInlined(
    		C.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Determine whether a CXType has the "volatile" qualifier set,
    /// without looking through typedefs that may have added "volatile" at
    /// a different level.
    /// ```
    public static int clang_isVolatileQualifiedType(
    	MemorySegment T
    ) {
    	MethodHandle method = CLANG_IS_VOLATILE_QUALIFIED_TYPE.get();
    	try {
    		return (int) method.invokeExact(
    			T
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_isVolatileQualifiedType].
    public static int clang_isVolatileQualifiedType(
    	CXType T
    ) {
    	return clang_isVolatileQualifiedType(
    		T.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Determine whether a CXType has the "restrict" qualifier set,
    /// without looking through typedefs that may have added "restrict" at a
    /// different level.
    /// ```
    public static int clang_isRestrictQualifiedType(
    	MemorySegment T
    ) {
    	MethodHandle method = CLANG_IS_RESTRICT_QUALIFIED_TYPE.get();
    	try {
    		return (int) method.invokeExact(
    			T
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_isRestrictQualifiedType].
    public static int clang_isRestrictQualifiedType(
    	CXType T
    ) {
    	return clang_isRestrictQualifiedType(
    		T.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Returns the address space of the given type.
    /// ```
    public static int clang_getAddressSpace(
    	MemorySegment T
    ) {
    	MethodHandle method = CLANG_GET_ADDRESS_SPACE.get();
    	try {
    		return (int) method.invokeExact(
    			T
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_getAddressSpace].
    public static int clang_getAddressSpace(
    	CXType T
    ) {
    	return clang_getAddressSpace(
    		T.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Returns the typedef name of the given type.
    /// ```
    public static MemorySegment clang_getTypedefName(
    	SegmentAllocator allocator,
    	MemorySegment CT
    ) {
    	MethodHandle method = CLANG_GET_TYPEDEF_NAME.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			CT
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_getTypedefName].
    public static @Nullable CXString clang_getTypedefName(
    	SegmentAllocator allocator,
    	CXType CT
    ) {
    	MemorySegment segment = clang_getTypedefName(
    		allocator,
    		CT.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXString(segment);
    }
    
    /// ```
    /// 
    /// For pointer types, returns the type of the pointee.
    /// ```
    public static MemorySegment clang_getPointeeType(
    	SegmentAllocator allocator,
    	MemorySegment T
    ) {
    	MethodHandle method = CLANG_GET_POINTEE_TYPE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			T
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_getPointeeType].
    public static @Nullable CXType clang_getPointeeType(
    	SegmentAllocator allocator,
    	CXType T
    ) {
    	MemorySegment segment = clang_getPointeeType(
    		allocator,
    		T.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXType(segment);
    }
    
    /// ```
    /// 
    /// Retrieve the unqualified variant of the given type, removing as
    /// little sugar as possible.
    /// 
    /// For example, given the following series of typedefs:
    /// 
    /// \code
    /// typedef int Integer;
    /// typedef const Integer CInteger;
    /// typedef CInteger DifferenceType;
    /// \endcode
    /// 
    /// Executing \c clang_getUnqualifiedType() on a \c CXType that
    /// represents \c DifferenceType, will desugar to a type representing
    /// \c Integer, that has no qualifiers.
    /// 
    /// And, executing \c clang_getUnqualifiedType() on the type of the
    /// first argument of the following function declaration:
    /// 
    /// \code
    /// void foo(const int);
    /// \endcode
    /// 
    /// Will return a type representing \c int, removing the \c const
    /// qualifier.
    /// 
    /// Sugar over array types is not desugared.
    /// 
    /// A type can be checked for qualifiers with \c
    /// clang_isConstQualifiedType(), \c clang_isVolatileQualifiedType()
    /// and \c clang_isRestrictQualifiedType().
    /// 
    /// A type that resulted from a call to \c clang_getUnqualifiedType
    /// will return \c false for all of the above calls.
    /// ```
    public static MemorySegment clang_getUnqualifiedType(
    	SegmentAllocator allocator,
    	MemorySegment CT
    ) {
    	MethodHandle method = CLANG_GET_UNQUALIFIED_TYPE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			CT
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_getUnqualifiedType].
    public static @Nullable CXType clang_getUnqualifiedType(
    	SegmentAllocator allocator,
    	CXType CT
    ) {
    	MemorySegment segment = clang_getUnqualifiedType(
    		allocator,
    		CT.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXType(segment);
    }
    
    /// ```
    /// 
    /// For reference types (e.g., "const int&"), returns the type that the
    /// reference refers to (e.g "const int").
    /// 
    /// Otherwise, returns the type itself.
    /// 
    /// A type that has kind \c CXType_LValueReference or
    /// \c CXType_RValueReference is a reference type.
    /// ```
    public static MemorySegment clang_getNonReferenceType(
    	SegmentAllocator allocator,
    	MemorySegment CT
    ) {
    	MethodHandle method = CLANG_GET_NON_REFERENCE_TYPE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			CT
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_getNonReferenceType].
    public static @Nullable CXType clang_getNonReferenceType(
    	SegmentAllocator allocator,
    	CXType CT
    ) {
    	MemorySegment segment = clang_getNonReferenceType(
    		allocator,
    		CT.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXType(segment);
    }
    
    /// ```
    /// 
    /// Return the cursor for the declaration of the given type.
    /// ```
    public static MemorySegment clang_getTypeDeclaration(
    	SegmentAllocator allocator,
    	MemorySegment T
    ) {
    	MethodHandle method = CLANG_GET_TYPE_DECLARATION.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			T
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_getTypeDeclaration].
    public static @Nullable CXCursor clang_getTypeDeclaration(
    	SegmentAllocator allocator,
    	CXType T
    ) {
    	MemorySegment segment = clang_getTypeDeclaration(
    		allocator,
    		T.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXCursor(segment);
    }
    
    /// ```
    /// 
    /// Returns the Objective-C type encoding for the specified declaration.
    /// ```
    public static MemorySegment clang_getDeclObjCTypeEncoding(
    	SegmentAllocator allocator,
    	MemorySegment C
    ) {
    	MethodHandle method = CLANG_GET_DECL_OBJ_CTYPE_ENCODING.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			C
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_getDeclObjCTypeEncoding].
    public static @Nullable CXString clang_getDeclObjCTypeEncoding(
    	SegmentAllocator allocator,
    	CXCursor C
    ) {
    	MemorySegment segment = clang_getDeclObjCTypeEncoding(
    		allocator,
    		C.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXString(segment);
    }
    
    /// ```
    /// 
    /// Returns the Objective-C type encoding for the specified CXType.
    /// ```
    public static MemorySegment clang_Type_getObjCEncoding(
    	SegmentAllocator allocator,
    	MemorySegment type
    ) {
    	MethodHandle method = CLANG_TYPE_GET_OBJ_CENCODING.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			type
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_Type_getObjCEncoding].
    public static @Nullable CXString clang_Type_getObjCEncoding(
    	SegmentAllocator allocator,
    	CXType type
    ) {
    	MemorySegment segment = clang_Type_getObjCEncoding(
    		allocator,
    		type.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXString(segment);
    }
    
    /// ```
    /// 
    /// Retrieve the spelling of a given CXTypeKind.
    /// ```
    public static MemorySegment nclang_getTypeKindSpelling(
    	SegmentAllocator allocator,
    	int K
    ) {
    	MethodHandle method = CLANG_GET_TYPE_KIND_SPELLING.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			K
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nclang_getTypeKindSpelling].
    public static @Nullable CXString clang_getTypeKindSpelling(
    	SegmentAllocator allocator,
    	int K
    ) {
    	MemorySegment segment = nclang_getTypeKindSpelling(
    		allocator,
    		K
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXString(segment);
    }
    
    /// ```
    /// 
    /// Retrieve the calling convention associated with a function type.
    /// 
    /// If a non-function type is passed in, CXCallingConv_Invalid is returned.
    /// ```
    public static int clang_getFunctionTypeCallingConv(
    	MemorySegment T
    ) {
    	MethodHandle method = CLANG_GET_FUNCTION_TYPE_CALLING_CONV.get();
    	try {
    		return (int) method.invokeExact(
    			T
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_getFunctionTypeCallingConv].
    public static int clang_getFunctionTypeCallingConv(
    	CXType T
    ) {
    	return clang_getFunctionTypeCallingConv(
    		T.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Retrieve the return type associated with a function type.
    /// 
    /// If a non-function type is passed in, an invalid type is returned.
    /// ```
    public static MemorySegment clang_getResultType(
    	SegmentAllocator allocator,
    	MemorySegment T
    ) {
    	MethodHandle method = CLANG_GET_RESULT_TYPE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			T
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_getResultType].
    public static @Nullable CXType clang_getResultType(
    	SegmentAllocator allocator,
    	CXType T
    ) {
    	MemorySegment segment = clang_getResultType(
    		allocator,
    		T.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXType(segment);
    }
    
    /// ```
    /// 
    /// Retrieve the exception specification type associated with a function type.
    /// This is a value of type CXCursor_ExceptionSpecificationKind.
    /// 
    /// If a non-function type is passed in, an error code of -1 is returned.
    /// ```
    public static int clang_getExceptionSpecificationType(
    	MemorySegment T
    ) {
    	MethodHandle method = CLANG_GET_EXCEPTION_SPECIFICATION_TYPE.get();
    	try {
    		return (int) method.invokeExact(
    			T
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_getExceptionSpecificationType].
    public static int clang_getExceptionSpecificationType(
    	CXType T
    ) {
    	return clang_getExceptionSpecificationType(
    		T.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Retrieve the number of non-variadic parameters associated with a
    /// function type.
    /// 
    /// If a non-function type is passed in, -1 is returned.
    /// ```
    public static int clang_getNumArgTypes(
    	MemorySegment T
    ) {
    	MethodHandle method = CLANG_GET_NUM_ARG_TYPES.get();
    	try {
    		return (int) method.invokeExact(
    			T
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_getNumArgTypes].
    public static int clang_getNumArgTypes(
    	CXType T
    ) {
    	return clang_getNumArgTypes(
    		T.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Retrieve the type of a parameter of a function type.
    /// 
    /// If a non-function type is passed in or the function does not have enough
    /// parameters, an invalid type is returned.
    /// ```
    public static MemorySegment clang_getArgType(
    	SegmentAllocator allocator,
    	MemorySegment T,
    	int i
    ) {
    	MethodHandle method = CLANG_GET_ARG_TYPE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			T,
    			i
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_getArgType].
    public static @Nullable CXType clang_getArgType(
    	SegmentAllocator allocator,
    	CXType T,
    	int i
    ) {
    	MemorySegment segment = clang_getArgType(
    		allocator,
    		T.memorySegment(),
    		i
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXType(segment);
    }
    
    /// ```
    /// 
    /// Retrieves the base type of the ObjCObjectType.
    /// 
    /// If the type is not an ObjC object, an invalid type is returned.
    /// ```
    public static MemorySegment clang_Type_getObjCObjectBaseType(
    	SegmentAllocator allocator,
    	MemorySegment T
    ) {
    	MethodHandle method = CLANG_TYPE_GET_OBJ_COBJECT_BASE_TYPE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			T
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_Type_getObjCObjectBaseType].
    public static @Nullable CXType clang_Type_getObjCObjectBaseType(
    	SegmentAllocator allocator,
    	CXType T
    ) {
    	MemorySegment segment = clang_Type_getObjCObjectBaseType(
    		allocator,
    		T.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXType(segment);
    }
    
    /// ```
    /// 
    /// Retrieve the number of protocol references associated with an ObjC object/id.
    /// 
    /// If the type is not an ObjC object, 0 is returned.
    /// ```
    public static int clang_Type_getNumObjCProtocolRefs(
    	MemorySegment T
    ) {
    	MethodHandle method = CLANG_TYPE_GET_NUM_OBJ_CPROTOCOL_REFS.get();
    	try {
    		return (int) method.invokeExact(
    			T
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_Type_getNumObjCProtocolRefs].
    public static int clang_Type_getNumObjCProtocolRefs(
    	CXType T
    ) {
    	return clang_Type_getNumObjCProtocolRefs(
    		T.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Retrieve the decl for a protocol reference for an ObjC object/id.
    /// 
    /// If the type is not an ObjC object or there are not enough protocol
    /// references, an invalid cursor is returned.
    /// ```
    public static MemorySegment clang_Type_getObjCProtocolDecl(
    	SegmentAllocator allocator,
    	MemorySegment T,
    	int i
    ) {
    	MethodHandle method = CLANG_TYPE_GET_OBJ_CPROTOCOL_DECL.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			T,
    			i
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_Type_getObjCProtocolDecl].
    public static @Nullable CXCursor clang_Type_getObjCProtocolDecl(
    	SegmentAllocator allocator,
    	CXType T,
    	int i
    ) {
    	MemorySegment segment = clang_Type_getObjCProtocolDecl(
    		allocator,
    		T.memorySegment(),
    		i
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXCursor(segment);
    }
    
    /// ```
    /// 
    /// Retrieve the number of type arguments associated with an ObjC object.
    /// 
    /// If the type is not an ObjC object, 0 is returned.
    /// ```
    public static int clang_Type_getNumObjCTypeArgs(
    	MemorySegment T
    ) {
    	MethodHandle method = CLANG_TYPE_GET_NUM_OBJ_CTYPE_ARGS.get();
    	try {
    		return (int) method.invokeExact(
    			T
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_Type_getNumObjCTypeArgs].
    public static int clang_Type_getNumObjCTypeArgs(
    	CXType T
    ) {
    	return clang_Type_getNumObjCTypeArgs(
    		T.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Retrieve a type argument associated with an ObjC object.
    /// 
    /// If the type is not an ObjC or the index is not valid,
    /// an invalid type is returned.
    /// ```
    public static MemorySegment clang_Type_getObjCTypeArg(
    	SegmentAllocator allocator,
    	MemorySegment T,
    	int i
    ) {
    	MethodHandle method = CLANG_TYPE_GET_OBJ_CTYPE_ARG.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			T,
    			i
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_Type_getObjCTypeArg].
    public static @Nullable CXType clang_Type_getObjCTypeArg(
    	SegmentAllocator allocator,
    	CXType T,
    	int i
    ) {
    	MemorySegment segment = clang_Type_getObjCTypeArg(
    		allocator,
    		T.memorySegment(),
    		i
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXType(segment);
    }
    
    /// ```
    /// 
    /// Return 1 if the CXType is a variadic function type, and 0 otherwise.
    /// ```
    public static int clang_isFunctionTypeVariadic(
    	MemorySegment T
    ) {
    	MethodHandle method = CLANG_IS_FUNCTION_TYPE_VARIADIC.get();
    	try {
    		return (int) method.invokeExact(
    			T
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_isFunctionTypeVariadic].
    public static int clang_isFunctionTypeVariadic(
    	CXType T
    ) {
    	return clang_isFunctionTypeVariadic(
    		T.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Retrieve the return type associated with a given cursor.
    /// 
    /// This only returns a valid type if the cursor refers to a function or method.
    /// ```
    public static MemorySegment clang_getCursorResultType(
    	SegmentAllocator allocator,
    	MemorySegment C
    ) {
    	MethodHandle method = CLANG_GET_CURSOR_RESULT_TYPE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			C
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_getCursorResultType].
    public static @Nullable CXType clang_getCursorResultType(
    	SegmentAllocator allocator,
    	CXCursor C
    ) {
    	MemorySegment segment = clang_getCursorResultType(
    		allocator,
    		C.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXType(segment);
    }
    
    /// ```
    /// 
    /// Retrieve the exception specification type associated with a given cursor.
    /// This is a value of type CXCursor_ExceptionSpecificationKind.
    /// 
    /// This only returns a valid result if the cursor refers to a function or
    /// method.
    /// ```
    public static int clang_getCursorExceptionSpecificationType(
    	MemorySegment C
    ) {
    	MethodHandle method = CLANG_GET_CURSOR_EXCEPTION_SPECIFICATION_TYPE.get();
    	try {
    		return (int) method.invokeExact(
    			C
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_getCursorExceptionSpecificationType].
    public static int clang_getCursorExceptionSpecificationType(
    	CXCursor C
    ) {
    	return clang_getCursorExceptionSpecificationType(
    		C.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Return 1 if the CXType is a POD (plain old data) type, and 0
    /// otherwise.
    /// ```
    public static int clang_isPODType(
    	MemorySegment T
    ) {
    	MethodHandle method = CLANG_IS_PODTYPE.get();
    	try {
    		return (int) method.invokeExact(
    			T
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_isPODType].
    public static int clang_isPODType(
    	CXType T
    ) {
    	return clang_isPODType(
    		T.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Return the element type of an array, complex, or vector type.
    /// 
    /// If a type is passed in that is not an array, complex, or vector type,
    /// an invalid type is returned.
    /// ```
    public static MemorySegment clang_getElementType(
    	SegmentAllocator allocator,
    	MemorySegment T
    ) {
    	MethodHandle method = CLANG_GET_ELEMENT_TYPE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			T
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_getElementType].
    public static @Nullable CXType clang_getElementType(
    	SegmentAllocator allocator,
    	CXType T
    ) {
    	MemorySegment segment = clang_getElementType(
    		allocator,
    		T.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXType(segment);
    }
    
    /// ```
    /// 
    /// Return the number of elements of an array or vector type.
    /// 
    /// If a type is passed in that is not an array or vector type,
    /// -1 is returned.
    /// ```
    public static long clang_getNumElements(
    	MemorySegment T
    ) {
    	MethodHandle method = CLANG_GET_NUM_ELEMENTS.get();
    	try {
    		return (long) method.invokeExact(
    			T
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_getNumElements].
    public static long clang_getNumElements(
    	CXType T
    ) {
    	return clang_getNumElements(
    		T.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Return the element type of an array type.
    /// 
    /// If a non-array type is passed in, an invalid type is returned.
    /// ```
    public static MemorySegment clang_getArrayElementType(
    	SegmentAllocator allocator,
    	MemorySegment T
    ) {
    	MethodHandle method = CLANG_GET_ARRAY_ELEMENT_TYPE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			T
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_getArrayElementType].
    public static @Nullable CXType clang_getArrayElementType(
    	SegmentAllocator allocator,
    	CXType T
    ) {
    	MemorySegment segment = clang_getArrayElementType(
    		allocator,
    		T.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXType(segment);
    }
    
    /// ```
    /// 
    /// Return the array size of a constant array.
    /// 
    /// If a non-array type is passed in, -1 is returned.
    /// ```
    public static long clang_getArraySize(
    	MemorySegment T
    ) {
    	MethodHandle method = CLANG_GET_ARRAY_SIZE.get();
    	try {
    		return (long) method.invokeExact(
    			T
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_getArraySize].
    public static long clang_getArraySize(
    	CXType T
    ) {
    	return clang_getArraySize(
    		T.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Retrieve the type named by the qualified-id.
    /// 
    /// If a non-elaborated type is passed in, an invalid type is returned.
    /// ```
    public static MemorySegment clang_Type_getNamedType(
    	SegmentAllocator allocator,
    	MemorySegment T
    ) {
    	MethodHandle method = CLANG_TYPE_GET_NAMED_TYPE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			T
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_Type_getNamedType].
    public static @Nullable CXType clang_Type_getNamedType(
    	SegmentAllocator allocator,
    	CXType T
    ) {
    	MemorySegment segment = clang_Type_getNamedType(
    		allocator,
    		T.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXType(segment);
    }
    
    /// ```
    /// 
    /// Determine if a typedef is 'transparent' tag.
    /// 
    /// A typedef is considered 'transparent' if it shares a name and spelling
    /// location with its underlying tag type, as is the case with the NS_ENUM macro.
    /// 
    /// \returns non-zero if transparent and zero otherwise.
    /// ```
    public static int clang_Type_isTransparentTagTypedef(
    	MemorySegment T
    ) {
    	MethodHandle method = CLANG_TYPE_IS_TRANSPARENT_TAG_TYPEDEF.get();
    	try {
    		return (int) method.invokeExact(
    			T
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_Type_isTransparentTagTypedef].
    public static int clang_Type_isTransparentTagTypedef(
    	CXType T
    ) {
    	return clang_Type_isTransparentTagTypedef(
    		T.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Retrieve the nullability kind of a pointer type.
    /// ```
    public static int clang_Type_getNullability(
    	MemorySegment T
    ) {
    	MethodHandle method = CLANG_TYPE_GET_NULLABILITY.get();
    	try {
    		return (int) method.invokeExact(
    			T
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_Type_getNullability].
    public static int clang_Type_getNullability(
    	CXType T
    ) {
    	return clang_Type_getNullability(
    		T.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Return the alignment of a type in bytes as per C++[expr.alignof]
    /// standard.
    /// 
    /// If the type declaration is invalid, CXTypeLayoutError_Invalid is returned.
    /// If the type declaration is an incomplete type, CXTypeLayoutError_Incomplete
    /// is returned.
    /// If the type declaration is a dependent type, CXTypeLayoutError_Dependent is
    /// returned.
    /// If the type declaration is not a constant size type,
    /// CXTypeLayoutError_NotConstantSize is returned.
    /// ```
    public static long clang_Type_getAlignOf(
    	MemorySegment T
    ) {
    	MethodHandle method = CLANG_TYPE_GET_ALIGN_OF.get();
    	try {
    		return (long) method.invokeExact(
    			T
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_Type_getAlignOf].
    public static long clang_Type_getAlignOf(
    	CXType T
    ) {
    	return clang_Type_getAlignOf(
    		T.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Return the class type of an member pointer type.
    /// 
    /// If a non-member-pointer type is passed in, an invalid type is returned.
    /// ```
    public static MemorySegment clang_Type_getClassType(
    	SegmentAllocator allocator,
    	MemorySegment T
    ) {
    	MethodHandle method = CLANG_TYPE_GET_CLASS_TYPE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			T
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_Type_getClassType].
    public static @Nullable CXType clang_Type_getClassType(
    	SegmentAllocator allocator,
    	CXType T
    ) {
    	MemorySegment segment = clang_Type_getClassType(
    		allocator,
    		T.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXType(segment);
    }
    
    /// ```
    /// 
    /// Return the size of a type in bytes as per C++[expr.sizeof] standard.
    /// 
    /// If the type declaration is invalid, CXTypeLayoutError_Invalid is returned.
    /// If the type declaration is an incomplete type, CXTypeLayoutError_Incomplete
    /// is returned.
    /// If the type declaration is a dependent type, CXTypeLayoutError_Dependent is
    /// returned.
    /// ```
    public static long clang_Type_getSizeOf(
    	MemorySegment T
    ) {
    	MethodHandle method = CLANG_TYPE_GET_SIZE_OF.get();
    	try {
    		return (long) method.invokeExact(
    			T
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_Type_getSizeOf].
    public static long clang_Type_getSizeOf(
    	CXType T
    ) {
    	return clang_Type_getSizeOf(
    		T.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Return the offset of a field named S in a record of type T in bits
    /// as it would be returned by __offsetof__ as per C++11[18.2p4]
    /// 
    /// If the cursor is not a record field declaration, CXTypeLayoutError_Invalid
    /// is returned.
    /// If the field's type declaration is an incomplete type,
    /// CXTypeLayoutError_Incomplete is returned.
    /// If the field's type declaration is a dependent type,
    /// CXTypeLayoutError_Dependent is returned.
    /// If the field's name S is not found,
    /// CXTypeLayoutError_InvalidFieldName is returned.
    /// ```
    public static long clang_Type_getOffsetOf(
    	MemorySegment T,
    	MemorySegment S
    ) {
    	MethodHandle method = CLANG_TYPE_GET_OFFSET_OF.get();
    	try {
    		return (long) method.invokeExact(
    			T,
    			S
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_Type_getOffsetOf].
    public static long clang_Type_getOffsetOf(
    	CXType T,
    	String S
    ) {
    	try (Arena arena = MemoryStack.stackPush()) {
    		return clang_Type_getOffsetOf(
    			T.memorySegment(),
    			arena.allocateFrom(S)
    		);
    	}
    }
    
    /// ```
    /// 
    /// Return the type that was modified by this attributed type.
    /// 
    /// If the type is not an attributed type, an invalid type is returned.
    /// ```
    public static MemorySegment clang_Type_getModifiedType(
    	SegmentAllocator allocator,
    	MemorySegment T
    ) {
    	MethodHandle method = CLANG_TYPE_GET_MODIFIED_TYPE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			T
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_Type_getModifiedType].
    public static @Nullable CXType clang_Type_getModifiedType(
    	SegmentAllocator allocator,
    	CXType T
    ) {
    	MemorySegment segment = clang_Type_getModifiedType(
    		allocator,
    		T.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXType(segment);
    }
    
    /// ```
    /// 
    /// Gets the type contained by this atomic type.
    /// 
    /// If a non-atomic type is passed in, an invalid type is returned.
    /// ```
    public static MemorySegment clang_Type_getValueType(
    	SegmentAllocator allocator,
    	MemorySegment CT
    ) {
    	MethodHandle method = CLANG_TYPE_GET_VALUE_TYPE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			CT
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_Type_getValueType].
    public static @Nullable CXType clang_Type_getValueType(
    	SegmentAllocator allocator,
    	CXType CT
    ) {
    	MemorySegment segment = clang_Type_getValueType(
    		allocator,
    		CT.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXType(segment);
    }
    
    /// ```
    /// 
    /// Return the offset of the field represented by the Cursor.
    /// 
    /// If the cursor is not a field declaration, -1 is returned.
    /// If the cursor semantic parent is not a record field declaration,
    /// CXTypeLayoutError_Invalid is returned.
    /// If the field's type declaration is an incomplete type,
    /// CXTypeLayoutError_Incomplete is returned.
    /// If the field's type declaration is a dependent type,
    /// CXTypeLayoutError_Dependent is returned.
    /// If the field's name S is not found,
    /// CXTypeLayoutError_InvalidFieldName is returned.
    /// ```
    public static long clang_Cursor_getOffsetOfField(
    	MemorySegment C
    ) {
    	MethodHandle method = CLANG_CURSOR_GET_OFFSET_OF_FIELD.get();
    	try {
    		return (long) method.invokeExact(
    			C
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_Cursor_getOffsetOfField].
    public static long clang_Cursor_getOffsetOfField(
    	CXCursor C
    ) {
    	return clang_Cursor_getOffsetOfField(
    		C.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Determine whether the given cursor represents an anonymous
    /// tag or namespace
    /// ```
    public static int clang_Cursor_isAnonymous(
    	MemorySegment C
    ) {
    	MethodHandle method = CLANG_CURSOR_IS_ANONYMOUS.get();
    	try {
    		return (int) method.invokeExact(
    			C
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_Cursor_isAnonymous].
    public static int clang_Cursor_isAnonymous(
    	CXCursor C
    ) {
    	return clang_Cursor_isAnonymous(
    		C.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Determine whether the given cursor represents an anonymous record
    /// declaration.
    /// ```
    public static int clang_Cursor_isAnonymousRecordDecl(
    	MemorySegment C
    ) {
    	MethodHandle method = CLANG_CURSOR_IS_ANONYMOUS_RECORD_DECL.get();
    	try {
    		return (int) method.invokeExact(
    			C
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_Cursor_isAnonymousRecordDecl].
    public static int clang_Cursor_isAnonymousRecordDecl(
    	CXCursor C
    ) {
    	return clang_Cursor_isAnonymousRecordDecl(
    		C.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Determine whether the given cursor represents an inline namespace
    /// declaration.
    /// ```
    public static int clang_Cursor_isInlineNamespace(
    	MemorySegment C
    ) {
    	MethodHandle method = CLANG_CURSOR_IS_INLINE_NAMESPACE.get();
    	try {
    		return (int) method.invokeExact(
    			C
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_Cursor_isInlineNamespace].
    public static int clang_Cursor_isInlineNamespace(
    	CXCursor C
    ) {
    	return clang_Cursor_isInlineNamespace(
    		C.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Returns the number of template arguments for given template
    /// specialization, or -1 if type \c T is not a template specialization.
    /// ```
    public static int clang_Type_getNumTemplateArguments(
    	MemorySegment T
    ) {
    	MethodHandle method = CLANG_TYPE_GET_NUM_TEMPLATE_ARGUMENTS.get();
    	try {
    		return (int) method.invokeExact(
    			T
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_Type_getNumTemplateArguments].
    public static int clang_Type_getNumTemplateArguments(
    	CXType T
    ) {
    	return clang_Type_getNumTemplateArguments(
    		T.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Returns the type template argument of a template class specialization
    /// at given index.
    /// 
    /// This function only returns template type arguments and does not handle
    /// template template arguments or variadic packs.
    /// ```
    public static MemorySegment clang_Type_getTemplateArgumentAsType(
    	SegmentAllocator allocator,
    	MemorySegment T,
    	int i
    ) {
    	MethodHandle method = CLANG_TYPE_GET_TEMPLATE_ARGUMENT_AS_TYPE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			T,
    			i
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_Type_getTemplateArgumentAsType].
    public static @Nullable CXType clang_Type_getTemplateArgumentAsType(
    	SegmentAllocator allocator,
    	CXType T,
    	int i
    ) {
    	MemorySegment segment = clang_Type_getTemplateArgumentAsType(
    		allocator,
    		T.memorySegment(),
    		i
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXType(segment);
    }
    
    /// ```
    /// 
    /// Retrieve the ref-qualifier kind of a function or method.
    /// 
    /// The ref-qualifier is returned for C++ functions or methods. For other types
    /// or non-C++ declarations, CXRefQualifier_None is returned.
    /// ```
    public static int clang_Type_getCXXRefQualifier(
    	MemorySegment T
    ) {
    	MethodHandle method = CLANG_TYPE_GET_CXXREF_QUALIFIER.get();
    	try {
    		return (int) method.invokeExact(
    			T
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_Type_getCXXRefQualifier].
    public static int clang_Type_getCXXRefQualifier(
    	CXType T
    ) {
    	return clang_Type_getCXXRefQualifier(
    		T.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Returns 1 if the base class specified by the cursor with kind
    /// CX_CXXBaseSpecifier is virtual.
    /// ```
    public static int clang_isVirtualBase(
    	MemorySegment param0
    ) {
    	MethodHandle method = CLANG_IS_VIRTUAL_BASE.get();
    	try {
    		return (int) method.invokeExact(
    			param0
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_isVirtualBase].
    public static int clang_isVirtualBase(
    	CXCursor param0
    ) {
    	return clang_isVirtualBase(
    		param0.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Returns the offset in bits of a CX_CXXBaseSpecifier relative to the parent
    /// class.
    /// 
    /// Returns a small negative number if the offset cannot be computed. See
    /// CXTypeLayoutError for error codes.
    /// ```
    public static long clang_getOffsetOfBase(
    	MemorySegment Parent,
    	MemorySegment Base
    ) {
    	MethodHandle method = CLANG_GET_OFFSET_OF_BASE.get();
    	try {
    		return (long) method.invokeExact(
    			Parent,
    			Base
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_getOffsetOfBase].
    public static long clang_getOffsetOfBase(
    	CXCursor Parent,
    	CXCursor Base
    ) {
    	return clang_getOffsetOfBase(
    		Parent.memorySegment(),
    		Base.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Returns the access control level for the referenced object.
    /// 
    /// If the cursor refers to a C++ declaration, its access control level within
    /// its parent scope is returned. Otherwise, if the cursor refers to a base
    /// specifier or access specifier, the specifier itself is returned.
    /// ```
    public static int clang_getCXXAccessSpecifier(
    	MemorySegment param0
    ) {
    	MethodHandle method = CLANG_GET_CXXACCESS_SPECIFIER.get();
    	try {
    		return (int) method.invokeExact(
    			param0
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_getCXXAccessSpecifier].
    public static int clang_getCXXAccessSpecifier(
    	CXCursor param0
    ) {
    	return clang_getCXXAccessSpecifier(
    		param0.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// \brief Returns the operator code for the binary operator.
    /// 
    /// @deprecated: use clang_getCursorBinaryOperatorKind instead.
    /// ```
    public static int clang_Cursor_getBinaryOpcode(
    	MemorySegment C
    ) {
    	MethodHandle method = CLANG_CURSOR_GET_BINARY_OPCODE.get();
    	try {
    		return (int) method.invokeExact(
    			C
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_Cursor_getBinaryOpcode].
    public static int clang_Cursor_getBinaryOpcode(
    	CXCursor C
    ) {
    	return clang_Cursor_getBinaryOpcode(
    		C.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// \brief Returns a string containing the spelling of the binary operator.
    /// 
    /// @deprecated: use clang_getBinaryOperatorKindSpelling instead
    /// ```
    public static MemorySegment nclang_Cursor_getBinaryOpcodeStr(
    	SegmentAllocator allocator,
    	int Op
    ) {
    	MethodHandle method = CLANG_CURSOR_GET_BINARY_OPCODE_STR.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			Op
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nclang_Cursor_getBinaryOpcodeStr].
    public static @Nullable CXString clang_Cursor_getBinaryOpcodeStr(
    	SegmentAllocator allocator,
    	int Op
    ) {
    	MemorySegment segment = nclang_Cursor_getBinaryOpcodeStr(
    		allocator,
    		Op
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXString(segment);
    }
    
    /// ```
    /// 
    /// Returns the storage class for a function or variable declaration.
    /// 
    /// If the passed in Cursor is not a function or variable declaration,
    /// CX_SC_Invalid is returned else the storage class.
    /// ```
    public static int clang_Cursor_getStorageClass(
    	MemorySegment param0
    ) {
    	MethodHandle method = CLANG_CURSOR_GET_STORAGE_CLASS.get();
    	try {
    		return (int) method.invokeExact(
    			param0
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_Cursor_getStorageClass].
    public static int clang_Cursor_getStorageClass(
    	CXCursor param0
    ) {
    	return clang_Cursor_getStorageClass(
    		param0.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Determine the number of overloaded declarations referenced by a
    /// \c CXCursor_OverloadedDeclRef cursor.
    /// 
    /// \param cursor The cursor whose overloaded declarations are being queried.
    /// 
    /// \returns The number of overloaded declarations referenced by \c cursor. If it
    /// is not a \c CXCursor_OverloadedDeclRef cursor, returns 0.
    /// ```
    public static int clang_getNumOverloadedDecls(
    	MemorySegment cursor
    ) {
    	MethodHandle method = CLANG_GET_NUM_OVERLOADED_DECLS.get();
    	try {
    		return (int) method.invokeExact(
    			cursor
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_getNumOverloadedDecls].
    public static int clang_getNumOverloadedDecls(
    	CXCursor cursor
    ) {
    	return clang_getNumOverloadedDecls(
    		cursor.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Retrieve a cursor for one of the overloaded declarations referenced
    /// by a \c CXCursor_OverloadedDeclRef cursor.
    /// 
    /// \param cursor The cursor whose overloaded declarations are being queried.
    /// 
    /// \param index The zero-based index into the set of overloaded declarations in
    /// the cursor.
    /// 
    /// \returns A cursor representing the declaration referenced by the given
    /// \c cursor at the specified \c index. If the cursor does not have an
    /// associated set of overloaded declarations, or if the index is out of bounds,
    /// returns \c clang_getNullCursor();
    /// ```
    public static MemorySegment clang_getOverloadedDecl(
    	SegmentAllocator allocator,
    	MemorySegment cursor,
    	int index
    ) {
    	MethodHandle method = CLANG_GET_OVERLOADED_DECL.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			cursor,
    			index
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_getOverloadedDecl].
    public static @Nullable CXCursor clang_getOverloadedDecl(
    	SegmentAllocator allocator,
    	CXCursor cursor,
    	int index
    ) {
    	MemorySegment segment = clang_getOverloadedDecl(
    		allocator,
    		cursor.memorySegment(),
    		index
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXCursor(segment);
    }
    
    /// ```
    /// 
    /// For cursors representing an iboutletcollection attribute,
    /// this function returns the collection element type.
    /// 
    /// ```
    public static MemorySegment clang_getIBOutletCollectionType(
    	SegmentAllocator allocator,
    	MemorySegment param0
    ) {
    	MethodHandle method = CLANG_GET_IBOUTLET_COLLECTION_TYPE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			param0
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_getIBOutletCollectionType].
    public static @Nullable CXType clang_getIBOutletCollectionType(
    	SegmentAllocator allocator,
    	CXCursor param0
    ) {
    	MemorySegment segment = clang_getIBOutletCollectionType(
    		allocator,
    		param0.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXType(segment);
    }
    
    /// ```
    /// 
    /// Visit the children of a particular cursor.
    /// 
    /// This function visits all the direct children of the given cursor,
    /// invoking the given \p visitor function with the cursors of each
    /// visited child. The traversal may be recursive, if the visitor returns
    /// \c CXChildVisit_Recurse. The traversal may also be ended prematurely, if
    /// the visitor returns \c CXChildVisit_Break.
    /// 
    /// \param parent the cursor whose child may be visited. All kinds of
    /// cursors can be visited, including invalid cursors (which, by
    /// definition, have no children).
    /// 
    /// \param visitor the visitor function that will be invoked for each
    /// child of \p parent.
    /// 
    /// \param client_data pointer data supplied by the client, which will
    /// be passed to the visitor each time it is invoked.
    /// 
    /// \returns a non-zero value if the traversal was terminated
    /// prematurely by the visitor returning \c CXChildVisit_Break.
    /// ```
    public static int clang_visitChildren(
    	MemorySegment parent,
    	MemorySegment visitor,
    	MemorySegment client_data
    ) {
    	MethodHandle method = CLANG_VISIT_CHILDREN.get();
    	try {
    		return (int) method.invokeExact(
    			parent,
    			visitor,
    			client_data
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_visitChildren].
    public static int clang_visitChildren(
    	CXCursor parent,
    	CXCursorVisitor visitor,
    	MemorySegment client_data
    ) {
    	return clang_visitChildren(
    		parent.memorySegment(),
    		visitor.memorySegment(),
    		client_data
    	);
    }
    
    /// ```
    /// 
    /// Retrieve a Unified Symbol Resolution (USR) for the entity referenced
    /// by the given cursor.
    /// 
    /// A Unified Symbol Resolution (USR) is a string that identifies a particular
    /// entity (function, class, variable, etc.) within a program. USRs can be
    /// compared across translation units to determine, e.g., when references in
    /// one translation refer to an entity defined in another translation unit.
    /// ```
    public static MemorySegment clang_getCursorUSR(
    	SegmentAllocator allocator,
    	MemorySegment param0
    ) {
    	MethodHandle method = CLANG_GET_CURSOR_USR.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			param0
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_getCursorUSR].
    public static @Nullable CXString clang_getCursorUSR(
    	SegmentAllocator allocator,
    	CXCursor param0
    ) {
    	MemorySegment segment = clang_getCursorUSR(
    		allocator,
    		param0.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXString(segment);
    }
    
    /// ```
    /// 
    /// Construct a USR for a specified Objective-C class.
    /// ```
    public static MemorySegment clang_constructUSR_ObjCClass(
    	SegmentAllocator allocator,
    	MemorySegment class_name
    ) {
    	MethodHandle method = CLANG_CONSTRUCT_USR_OBJ_CCLASS.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			class_name
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_constructUSR_ObjCClass].
    public static @Nullable CXString clang_constructUSR_ObjCClass(
    	SegmentAllocator allocator,
    	String class_name
    ) {
    	try (Arena arena = MemoryStack.stackPush()) {
    		MemorySegment segment = clang_constructUSR_ObjCClass(
    			allocator,
    			arena.allocateFrom(class_name)
    		);
    
    		if (segment.equals(MemorySegment.NULL))
    			return null;
    		
    		return new CXString(segment);
    	}
    }
    
    /// ```
    /// 
    /// Construct a USR for a specified Objective-C category.
    /// ```
    public static MemorySegment clang_constructUSR_ObjCCategory(
    	SegmentAllocator allocator,
    	MemorySegment class_name,
    	MemorySegment category_name
    ) {
    	MethodHandle method = CLANG_CONSTRUCT_USR_OBJ_CCATEGORY.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			class_name,
    			category_name
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_constructUSR_ObjCCategory].
    public static @Nullable CXString clang_constructUSR_ObjCCategory(
    	SegmentAllocator allocator,
    	String class_name,
    	String category_name
    ) {
    	try (Arena arena = MemoryStack.stackPush()) {
    		MemorySegment segment = clang_constructUSR_ObjCCategory(
    			allocator,
    			arena.allocateFrom(class_name),
    			arena.allocateFrom(category_name)
    		);
    
    		if (segment.equals(MemorySegment.NULL))
    			return null;
    		
    		return new CXString(segment);
    	}
    }
    
    /// ```
    /// 
    /// Construct a USR for a specified Objective-C protocol.
    /// ```
    public static MemorySegment clang_constructUSR_ObjCProtocol(
    	SegmentAllocator allocator,
    	MemorySegment protocol_name
    ) {
    	MethodHandle method = CLANG_CONSTRUCT_USR_OBJ_CPROTOCOL.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			protocol_name
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_constructUSR_ObjCProtocol].
    public static @Nullable CXString clang_constructUSR_ObjCProtocol(
    	SegmentAllocator allocator,
    	String protocol_name
    ) {
    	try (Arena arena = MemoryStack.stackPush()) {
    		MemorySegment segment = clang_constructUSR_ObjCProtocol(
    			allocator,
    			arena.allocateFrom(protocol_name)
    		);
    
    		if (segment.equals(MemorySegment.NULL))
    			return null;
    		
    		return new CXString(segment);
    	}
    }
    
    /// ```
    /// 
    /// Construct a USR for a specified Objective-C instance variable and
    /// the USR for its containing class.
    /// ```
    public static MemorySegment clang_constructUSR_ObjCIvar(
    	SegmentAllocator allocator,
    	MemorySegment name,
    	MemorySegment classUSR
    ) {
    	MethodHandle method = CLANG_CONSTRUCT_USR_OBJ_CIVAR.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			name,
    			classUSR
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_constructUSR_ObjCIvar].
    public static @Nullable CXString clang_constructUSR_ObjCIvar(
    	SegmentAllocator allocator,
    	String name,
    	CXString classUSR
    ) {
    	try (Arena arena = MemoryStack.stackPush()) {
    		MemorySegment segment = clang_constructUSR_ObjCIvar(
    			allocator,
    			arena.allocateFrom(name),
    			classUSR.memorySegment()
    		);
    
    		if (segment.equals(MemorySegment.NULL))
    			return null;
    		
    		return new CXString(segment);
    	}
    }
    
    /// ```
    /// 
    /// Construct a USR for a specified Objective-C method and
    /// the USR for its containing class.
    /// ```
    public static MemorySegment clang_constructUSR_ObjCMethod(
    	SegmentAllocator allocator,
    	MemorySegment name,
    	int isInstanceMethod,
    	MemorySegment classUSR
    ) {
    	MethodHandle method = CLANG_CONSTRUCT_USR_OBJ_CMETHOD.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			name,
    			isInstanceMethod,
    			classUSR
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_constructUSR_ObjCMethod].
    public static @Nullable CXString clang_constructUSR_ObjCMethod(
    	SegmentAllocator allocator,
    	String name,
    	int isInstanceMethod,
    	CXString classUSR
    ) {
    	try (Arena arena = MemoryStack.stackPush()) {
    		MemorySegment segment = clang_constructUSR_ObjCMethod(
    			allocator,
    			arena.allocateFrom(name),
    			isInstanceMethod,
    			classUSR.memorySegment()
    		);
    
    		if (segment.equals(MemorySegment.NULL))
    			return null;
    		
    		return new CXString(segment);
    	}
    }
    
    /// ```
    /// 
    /// Construct a USR for a specified Objective-C property and the USR
    /// for its containing class.
    /// ```
    public static MemorySegment clang_constructUSR_ObjCProperty(
    	SegmentAllocator allocator,
    	MemorySegment property,
    	MemorySegment classUSR
    ) {
    	MethodHandle method = CLANG_CONSTRUCT_USR_OBJ_CPROPERTY.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			property,
    			classUSR
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_constructUSR_ObjCProperty].
    public static @Nullable CXString clang_constructUSR_ObjCProperty(
    	SegmentAllocator allocator,
    	NativeByteArray property,
    	CXString classUSR
    ) {
    	MemorySegment segment = clang_constructUSR_ObjCProperty(
    		allocator,
    		property.memorySegment(),
    		classUSR.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXString(segment);
    }
    
    /// ```
    /// 
    /// Retrieve a name for the entity referenced by this cursor.
    /// ```
    public static MemorySegment clang_getCursorSpelling(
    	SegmentAllocator allocator,
    	MemorySegment param0
    ) {
    	MethodHandle method = CLANG_GET_CURSOR_SPELLING.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			param0
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_getCursorSpelling].
    public static @Nullable CXString clang_getCursorSpelling(
    	SegmentAllocator allocator,
    	CXCursor param0
    ) {
    	MemorySegment segment = clang_getCursorSpelling(
    		allocator,
    		param0.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXString(segment);
    }
    
    /// ```
    /// 
    /// Retrieve a range for a piece that forms the cursors spelling name.
    /// Most of the times there is only one range for the complete spelling but for
    /// Objective-C methods and Objective-C message expressions, there are multiple
    /// pieces for each selector identifier.
    /// 
    /// \param pieceIndex the index of the spelling name piece. If this is greater
    /// than the actual number of pieces, it will return a NULL (invalid) range.
    /// 
    /// \param options Reserved.
    /// ```
    public static MemorySegment clang_Cursor_getSpellingNameRange(
    	SegmentAllocator allocator,
    	MemorySegment param0,
    	int pieceIndex,
    	int options
    ) {
    	MethodHandle method = CLANG_CURSOR_GET_SPELLING_NAME_RANGE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			param0,
    			pieceIndex,
    			options
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_Cursor_getSpellingNameRange].
    public static @Nullable CXSourceRange clang_Cursor_getSpellingNameRange(
    	SegmentAllocator allocator,
    	CXCursor param0,
    	int pieceIndex,
    	int options
    ) {
    	MemorySegment segment = clang_Cursor_getSpellingNameRange(
    		allocator,
    		param0.memorySegment(),
    		pieceIndex,
    		options
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXSourceRange(segment);
    }
    
    /// ```
    /// 
    /// Get a property value for the given printing policy.
    /// ```
    public static int clang_PrintingPolicy_getProperty(
    	MemorySegment Policy,
    	int Property
    ) {
    	MethodHandle method = CLANG_PRINTING_POLICY_GET_PROPERTY.get();
    	try {
    		return (int) method.invokeExact(
    			Policy,
    			Property
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// 
    /// Set a property value for the given printing policy.
    /// ```
    public static void clang_PrintingPolicy_setProperty(
    	MemorySegment Policy,
    	int Property,
    	int Value
    ) {
    	MethodHandle method = CLANG_PRINTING_POLICY_SET_PROPERTY.get();
    	try {
    		 method.invokeExact(
    			Policy,
    			Property,
    			Value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// 
    /// Retrieve the default policy for the cursor.
    /// 
    /// The policy should be released after use with \c
    /// clang_PrintingPolicy_dispose.
    /// ```
    public static MemorySegment clang_getCursorPrintingPolicy(
    	MemorySegment param0
    ) {
    	MethodHandle method = CLANG_GET_CURSOR_PRINTING_POLICY.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			param0
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_getCursorPrintingPolicy].
    public static @Nullable MemorySegment clang_getCursorPrintingPolicy(
    	CXCursor param0
    ) {
    	MemorySegment segment = clang_getCursorPrintingPolicy(
    		param0.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// ```
    /// 
    /// Release a printing policy.
    /// ```
    public static void clang_PrintingPolicy_dispose(
    	MemorySegment Policy
    ) {
    	MethodHandle method = CLANG_PRINTING_POLICY_DISPOSE.get();
    	try {
    		 method.invokeExact(
    			Policy
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// 
    /// Pretty print declarations.
    /// 
    /// \param Cursor The cursor representing a declaration.
    /// 
    /// \param Policy The policy to control the entities being printed. If
    /// NULL, a default policy is used.
    /// 
    /// \returns The pretty printed declaration or the empty string for
    /// other cursors.
    /// ```
    public static MemorySegment clang_getCursorPrettyPrinted(
    	SegmentAllocator allocator,
    	MemorySegment Cursor,
    	MemorySegment Policy
    ) {
    	MethodHandle method = CLANG_GET_CURSOR_PRETTY_PRINTED.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			Cursor,
    			Policy
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_getCursorPrettyPrinted].
    public static @Nullable CXString clang_getCursorPrettyPrinted(
    	SegmentAllocator allocator,
    	CXCursor Cursor,
    	MemorySegment Policy
    ) {
    	MemorySegment segment = clang_getCursorPrettyPrinted(
    		allocator,
    		Cursor.memorySegment(),
    		Policy
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXString(segment);
    }
    
    /// ```
    /// 
    /// Pretty-print the underlying type using a custom printing policy.
    /// 
    /// If the type is invalid, an empty string is returned.
    /// ```
    public static MemorySegment clang_getTypePrettyPrinted(
    	SegmentAllocator allocator,
    	MemorySegment CT,
    	MemorySegment cxPolicy
    ) {
    	MethodHandle method = CLANG_GET_TYPE_PRETTY_PRINTED.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			CT,
    			cxPolicy
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_getTypePrettyPrinted].
    public static @Nullable CXString clang_getTypePrettyPrinted(
    	SegmentAllocator allocator,
    	CXType CT,
    	MemorySegment cxPolicy
    ) {
    	MemorySegment segment = clang_getTypePrettyPrinted(
    		allocator,
    		CT.memorySegment(),
    		cxPolicy
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXString(segment);
    }
    
    /// ```
    /// 
    /// Get the fully qualified name for a type.
    /// 
    /// This includes full qualification of all template parameters.
    /// 
    /// Policy - Further refine the type formatting
    /// WithGlobalNsPrefix - If non-zero, function will prepend a '::' to qualified
    /// names
    /// ```
    public static MemorySegment clang_getFullyQualifiedName(
    	SegmentAllocator allocator,
    	MemorySegment CT,
    	MemorySegment Policy,
    	int WithGlobalNsPrefix
    ) {
    	MethodHandle method = CLANG_GET_FULLY_QUALIFIED_NAME.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			CT,
    			Policy,
    			WithGlobalNsPrefix
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_getFullyQualifiedName].
    public static @Nullable CXString clang_getFullyQualifiedName(
    	SegmentAllocator allocator,
    	CXType CT,
    	MemorySegment Policy,
    	int WithGlobalNsPrefix
    ) {
    	MemorySegment segment = clang_getFullyQualifiedName(
    		allocator,
    		CT.memorySegment(),
    		Policy,
    		WithGlobalNsPrefix
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXString(segment);
    }
    
    /// ```
    /// 
    /// Retrieve the display name for the entity referenced by this cursor.
    /// 
    /// The display name contains extra information that helps identify the cursor,
    /// such as the parameters of a function or template or the arguments of a
    /// class template specialization.
    /// ```
    public static MemorySegment clang_getCursorDisplayName(
    	SegmentAllocator allocator,
    	MemorySegment param0
    ) {
    	MethodHandle method = CLANG_GET_CURSOR_DISPLAY_NAME.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			param0
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_getCursorDisplayName].
    public static @Nullable CXString clang_getCursorDisplayName(
    	SegmentAllocator allocator,
    	CXCursor param0
    ) {
    	MemorySegment segment = clang_getCursorDisplayName(
    		allocator,
    		param0.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXString(segment);
    }
    
    /// ```
    /// For a cursor that is a reference, retrieve a cursor representing the
    /// entity that it references.
    /// 
    /// Reference cursors refer to other entities in the AST. For example, an
    /// Objective-C superclass reference cursor refers to an Objective-C class.
    /// This function produces the cursor for the Objective-C class from the
    /// cursor for the superclass reference. If the input cursor is a declaration or
    /// definition, it returns that declaration or definition unchanged.
    /// Otherwise, returns the NULL cursor.
    /// ```
    public static MemorySegment clang_getCursorReferenced(
    	SegmentAllocator allocator,
    	MemorySegment param0
    ) {
    	MethodHandle method = CLANG_GET_CURSOR_REFERENCED.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			param0
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_getCursorReferenced].
    public static @Nullable CXCursor clang_getCursorReferenced(
    	SegmentAllocator allocator,
    	CXCursor param0
    ) {
    	MemorySegment segment = clang_getCursorReferenced(
    		allocator,
    		param0.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXCursor(segment);
    }
    
    /// ```
    /// 
    /// For a cursor that is either a reference to or a declaration
    /// of some entity, retrieve a cursor that describes the definition of
    /// that entity.
    /// 
    /// Some entities can be declared multiple times within a translation
    /// unit, but only one of those declarations can also be a
    /// definition. For example, given:
    /// 
    /// \code
    /// int f(int, int);
    /// int g(int x, int y) { return f(x, y); }
    /// int f(int a, int b) { return a + b; }
    /// int f(int, int);
    /// \endcode
    /// 
    /// there are three declarations of the function "f", but only the
    /// second one is a definition. The clang_getCursorDefinition()
    /// function will take any cursor pointing to a declaration of "f"
    /// (the first or fourth lines of the example) or a cursor referenced
    /// that uses "f" (the call to "f' inside "g") and will return a
    /// declaration cursor pointing to the definition (the second "f"
    /// declaration).
    /// 
    /// If given a cursor for which there is no corresponding definition,
    /// e.g., because there is no definition of that entity within this
    /// translation unit, returns a NULL cursor.
    /// ```
    public static MemorySegment clang_getCursorDefinition(
    	SegmentAllocator allocator,
    	MemorySegment param0
    ) {
    	MethodHandle method = CLANG_GET_CURSOR_DEFINITION.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			param0
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_getCursorDefinition].
    public static @Nullable CXCursor clang_getCursorDefinition(
    	SegmentAllocator allocator,
    	CXCursor param0
    ) {
    	MemorySegment segment = clang_getCursorDefinition(
    		allocator,
    		param0.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXCursor(segment);
    }
    
    /// ```
    /// 
    /// Determine whether the declaration pointed to by this cursor
    /// is also a definition of that entity.
    /// ```
    public static int clang_isCursorDefinition(
    	MemorySegment param0
    ) {
    	MethodHandle method = CLANG_IS_CURSOR_DEFINITION.get();
    	try {
    		return (int) method.invokeExact(
    			param0
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_isCursorDefinition].
    public static int clang_isCursorDefinition(
    	CXCursor param0
    ) {
    	return clang_isCursorDefinition(
    		param0.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Retrieve the canonical cursor corresponding to the given cursor.
    /// 
    /// In the C family of languages, many kinds of entities can be declared several
    /// times within a single translation unit. For example, a structure type can
    /// be forward-declared (possibly multiple times) and later defined:
    /// 
    /// \code
    /// struct X;
    /// struct X;
    /// struct X {
    /// int member;
    /// };
    /// \endcode
    /// 
    /// The declarations and the definition of \c X are represented by three
    /// different cursors, all of which are declarations of the same underlying
    /// entity. One of these cursor is considered the "canonical" cursor, which
    /// is effectively the representative for the underlying entity. One can
    /// determine if two cursors are declarations of the same underlying entity by
    /// comparing their canonical cursors.
    /// 
    /// \returns The canonical cursor for the entity referred to by the given cursor.
    /// ```
    public static MemorySegment clang_getCanonicalCursor(
    	SegmentAllocator allocator,
    	MemorySegment param0
    ) {
    	MethodHandle method = CLANG_GET_CANONICAL_CURSOR.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			param0
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_getCanonicalCursor].
    public static @Nullable CXCursor clang_getCanonicalCursor(
    	SegmentAllocator allocator,
    	CXCursor param0
    ) {
    	MemorySegment segment = clang_getCanonicalCursor(
    		allocator,
    		param0.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXCursor(segment);
    }
    
    /// ```
    /// 
    /// If the cursor points to a selector identifier in an Objective-C
    /// method or message expression, this returns the selector index.
    /// 
    /// After getting a cursor with #clang_getCursor, this can be called to
    /// determine if the location points to a selector identifier.
    /// 
    /// \returns The selector index if the cursor is an Objective-C method or message
    /// expression and the cursor is pointing to a selector identifier, or -1
    /// otherwise.
    /// ```
    public static int clang_Cursor_getObjCSelectorIndex(
    	MemorySegment param0
    ) {
    	MethodHandle method = CLANG_CURSOR_GET_OBJ_CSELECTOR_INDEX.get();
    	try {
    		return (int) method.invokeExact(
    			param0
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_Cursor_getObjCSelectorIndex].
    public static int clang_Cursor_getObjCSelectorIndex(
    	CXCursor param0
    ) {
    	return clang_Cursor_getObjCSelectorIndex(
    		param0.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Given a cursor pointing to a C++ method call or an Objective-C
    /// message, returns non-zero if the method/message is "dynamic", meaning:
    /// 
    /// For a C++ method: the call is virtual.
    /// For an Objective-C message: the receiver is an object instance, not 'super'
    /// or a specific class.
    /// 
    /// If the method/message is "static" or the cursor does not point to a
    /// method/message, it will return zero.
    /// ```
    public static int clang_Cursor_isDynamicCall(
    	MemorySegment C
    ) {
    	MethodHandle method = CLANG_CURSOR_IS_DYNAMIC_CALL.get();
    	try {
    		return (int) method.invokeExact(
    			C
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_Cursor_isDynamicCall].
    public static int clang_Cursor_isDynamicCall(
    	CXCursor C
    ) {
    	return clang_Cursor_isDynamicCall(
    		C.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Given a cursor pointing to an Objective-C message or property
    /// reference, or C++ method call, returns the CXType of the receiver.
    /// ```
    public static MemorySegment clang_Cursor_getReceiverType(
    	SegmentAllocator allocator,
    	MemorySegment C
    ) {
    	MethodHandle method = CLANG_CURSOR_GET_RECEIVER_TYPE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			C
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_Cursor_getReceiverType].
    public static @Nullable CXType clang_Cursor_getReceiverType(
    	SegmentAllocator allocator,
    	CXCursor C
    ) {
    	MemorySegment segment = clang_Cursor_getReceiverType(
    		allocator,
    		C.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXType(segment);
    }
    
    /// ```
    /// 
    /// Given a cursor that represents a property declaration, return the
    /// associated property attributes. The bits are formed from
    /// \c CXObjCPropertyAttrKind.
    /// 
    /// \param reserved Reserved for future use, pass 0.
    /// ```
    public static int clang_Cursor_getObjCPropertyAttributes(
    	MemorySegment C,
    	int reserved
    ) {
    	MethodHandle method = CLANG_CURSOR_GET_OBJ_CPROPERTY_ATTRIBUTES.get();
    	try {
    		return (int) method.invokeExact(
    			C,
    			reserved
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_Cursor_getObjCPropertyAttributes].
    public static int clang_Cursor_getObjCPropertyAttributes(
    	CXCursor C,
    	int reserved
    ) {
    	return clang_Cursor_getObjCPropertyAttributes(
    		C.memorySegment(),
    		reserved
    	);
    }
    
    /// ```
    /// 
    /// Given a cursor that represents a property declaration, return the
    /// name of the method that implements the getter.
    /// ```
    public static MemorySegment clang_Cursor_getObjCPropertyGetterName(
    	SegmentAllocator allocator,
    	MemorySegment C
    ) {
    	MethodHandle method = CLANG_CURSOR_GET_OBJ_CPROPERTY_GETTER_NAME.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			C
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_Cursor_getObjCPropertyGetterName].
    public static @Nullable CXString clang_Cursor_getObjCPropertyGetterName(
    	SegmentAllocator allocator,
    	CXCursor C
    ) {
    	MemorySegment segment = clang_Cursor_getObjCPropertyGetterName(
    		allocator,
    		C.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXString(segment);
    }
    
    /// ```
    /// 
    /// Given a cursor that represents a property declaration, return the
    /// name of the method that implements the setter, if any.
    /// ```
    public static MemorySegment clang_Cursor_getObjCPropertySetterName(
    	SegmentAllocator allocator,
    	MemorySegment C
    ) {
    	MethodHandle method = CLANG_CURSOR_GET_OBJ_CPROPERTY_SETTER_NAME.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			C
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_Cursor_getObjCPropertySetterName].
    public static @Nullable CXString clang_Cursor_getObjCPropertySetterName(
    	SegmentAllocator allocator,
    	CXCursor C
    ) {
    	MemorySegment segment = clang_Cursor_getObjCPropertySetterName(
    		allocator,
    		C.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXString(segment);
    }
    
    /// ```
    /// 
    /// Given a cursor that represents an Objective-C method or parameter
    /// declaration, return the associated Objective-C qualifiers for the return
    /// type or the parameter respectively. The bits are formed from
    /// CXObjCDeclQualifierKind.
    /// ```
    public static int clang_Cursor_getObjCDeclQualifiers(
    	MemorySegment C
    ) {
    	MethodHandle method = CLANG_CURSOR_GET_OBJ_CDECL_QUALIFIERS.get();
    	try {
    		return (int) method.invokeExact(
    			C
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_Cursor_getObjCDeclQualifiers].
    public static int clang_Cursor_getObjCDeclQualifiers(
    	CXCursor C
    ) {
    	return clang_Cursor_getObjCDeclQualifiers(
    		C.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Given a cursor that represents an Objective-C method or property
    /// declaration, return non-zero if the declaration was affected by "\@optional".
    /// Returns zero if the cursor is not such a declaration or it is "\@required".
    /// ```
    public static int clang_Cursor_isObjCOptional(
    	MemorySegment C
    ) {
    	MethodHandle method = CLANG_CURSOR_IS_OBJ_COPTIONAL.get();
    	try {
    		return (int) method.invokeExact(
    			C
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_Cursor_isObjCOptional].
    public static int clang_Cursor_isObjCOptional(
    	CXCursor C
    ) {
    	return clang_Cursor_isObjCOptional(
    		C.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Returns non-zero if the given cursor is a variadic function or method.
    /// ```
    public static int clang_Cursor_isVariadic(
    	MemorySegment C
    ) {
    	MethodHandle method = CLANG_CURSOR_IS_VARIADIC.get();
    	try {
    		return (int) method.invokeExact(
    			C
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_Cursor_isVariadic].
    public static int clang_Cursor_isVariadic(
    	CXCursor C
    ) {
    	return clang_Cursor_isVariadic(
    		C.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Returns non-zero if the given cursor points to a symbol marked with
    /// external_source_symbol attribute.
    /// 
    /// \param language If non-NULL, and the attribute is present, will be set to
    /// the 'language' string from the attribute.
    /// 
    /// \param definedIn If non-NULL, and the attribute is present, will be set to
    /// the 'definedIn' string from the attribute.
    /// 
    /// \param isGenerated If non-NULL, and the attribute is present, will be set to
    /// non-zero if the 'generated_declaration' is set in the attribute.
    /// ```
    public static int clang_Cursor_isExternalSymbol(
    	MemorySegment C,
    	MemorySegment language,
    	MemorySegment definedIn,
    	MemorySegment isGenerated
    ) {
    	MethodHandle method = CLANG_CURSOR_IS_EXTERNAL_SYMBOL.get();
    	try {
    		return (int) method.invokeExact(
    			C,
    			language,
    			definedIn,
    			isGenerated
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_Cursor_isExternalSymbol].
    public static int clang_Cursor_isExternalSymbol(
    	CXCursor C,
    	CXString language,
    	CXString definedIn,
    	NativeIntArray isGenerated
    ) {
    	return clang_Cursor_isExternalSymbol(
    		C.memorySegment(),
    		language.memorySegment(),
    		definedIn.memorySegment(),
    		isGenerated.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Given a cursor that represents a declaration, return the associated
    /// comment's source range.  The range may include multiple consecutive comments
    /// with whitespace in between.
    /// ```
    public static MemorySegment clang_Cursor_getCommentRange(
    	SegmentAllocator allocator,
    	MemorySegment C
    ) {
    	MethodHandle method = CLANG_CURSOR_GET_COMMENT_RANGE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			C
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_Cursor_getCommentRange].
    public static @Nullable CXSourceRange clang_Cursor_getCommentRange(
    	SegmentAllocator allocator,
    	CXCursor C
    ) {
    	MemorySegment segment = clang_Cursor_getCommentRange(
    		allocator,
    		C.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXSourceRange(segment);
    }
    
    /// ```
    /// 
    /// Given a cursor that represents a declaration, return the associated
    /// comment text, including comment markers.
    /// ```
    public static MemorySegment clang_Cursor_getRawCommentText(
    	SegmentAllocator allocator,
    	MemorySegment C
    ) {
    	MethodHandle method = CLANG_CURSOR_GET_RAW_COMMENT_TEXT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			C
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_Cursor_getRawCommentText].
    public static @Nullable CXString clang_Cursor_getRawCommentText(
    	SegmentAllocator allocator,
    	CXCursor C
    ) {
    	MemorySegment segment = clang_Cursor_getRawCommentText(
    		allocator,
    		C.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXString(segment);
    }
    
    /// ```
    /// 
    /// Given a cursor that represents a documentable entity (e.g.,
    /// declaration), return the associated \paragraph; otherwise return the
    /// first paragraph.
    /// ```
    public static MemorySegment clang_Cursor_getBriefCommentText(
    	SegmentAllocator allocator,
    	MemorySegment C
    ) {
    	MethodHandle method = CLANG_CURSOR_GET_BRIEF_COMMENT_TEXT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			C
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_Cursor_getBriefCommentText].
    public static @Nullable CXString clang_Cursor_getBriefCommentText(
    	SegmentAllocator allocator,
    	CXCursor C
    ) {
    	MemorySegment segment = clang_Cursor_getBriefCommentText(
    		allocator,
    		C.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXString(segment);
    }
    
    /// ```
    /// 
    /// Retrieve the CXString representing the mangled name of the cursor.
    /// ```
    public static MemorySegment clang_Cursor_getMangling(
    	SegmentAllocator allocator,
    	MemorySegment param0
    ) {
    	MethodHandle method = CLANG_CURSOR_GET_MANGLING.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			param0
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_Cursor_getMangling].
    public static @Nullable CXString clang_Cursor_getMangling(
    	SegmentAllocator allocator,
    	CXCursor param0
    ) {
    	MemorySegment segment = clang_Cursor_getMangling(
    		allocator,
    		param0.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXString(segment);
    }
    
    /// ```
    /// 
    /// Retrieve the CXStrings representing the mangled symbols of the C++
    /// constructor or destructor at the cursor.
    /// ```
    public static MemorySegment clang_Cursor_getCXXManglings(
    	MemorySegment param0
    ) {
    	MethodHandle method = CLANG_CURSOR_GET_CXXMANGLINGS.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			param0
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_Cursor_getCXXManglings].
    public static @Nullable CXStringSet clang_Cursor_getCXXManglings(
    	CXCursor param0
    ) {
    	MemorySegment segment = clang_Cursor_getCXXManglings(
    		param0.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXStringSet(segment);
    }
    
    /// ```
    /// 
    /// Retrieve the CXStrings representing the mangled symbols of the ObjC
    /// class interface or implementation at the cursor.
    /// ```
    public static MemorySegment clang_Cursor_getObjCManglings(
    	MemorySegment param0
    ) {
    	MethodHandle method = CLANG_CURSOR_GET_OBJ_CMANGLINGS.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			param0
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_Cursor_getObjCManglings].
    public static @Nullable CXStringSet clang_Cursor_getObjCManglings(
    	CXCursor param0
    ) {
    	MemorySegment segment = clang_Cursor_getObjCManglings(
    		param0.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXStringSet(segment);
    }
    
    /// ```
    /// 
    /// Given a CXCursor_GCCAsmStmt cursor, return the assembly template string.
    /// As per LLVM IR Assembly Template language, template placeholders for
    /// inputs and outputs are either of the form $N where N is a decimal number
    /// as an index into the input-output specification,
    /// or ${N:M} where N is a decimal number also as an index into the
    /// input-output specification and M is the template argument modifier.
    /// The index N in both cases points into the the total inputs and outputs,
    /// or more specifically, into the list of outputs followed by the inputs,
    /// starting from index 0 as the first available template argument.
    /// 
    /// This function also returns a valid empty string if the cursor does not point
    /// at a GCC inline assembly block.
    /// 
    /// Users are responsible for releasing the allocation of returned string via
    /// \c clang_disposeString.
    /// ```
    public static MemorySegment clang_Cursor_getGCCAssemblyTemplate(
    	SegmentAllocator allocator,
    	MemorySegment param0
    ) {
    	MethodHandle method = CLANG_CURSOR_GET_GCCASSEMBLY_TEMPLATE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			param0
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_Cursor_getGCCAssemblyTemplate].
    public static @Nullable CXString clang_Cursor_getGCCAssemblyTemplate(
    	SegmentAllocator allocator,
    	CXCursor param0
    ) {
    	MemorySegment segment = clang_Cursor_getGCCAssemblyTemplate(
    		allocator,
    		param0.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXString(segment);
    }
    
    /// ```
    /// 
    /// Given a CXCursor_GCCAsmStmt cursor, check if the assembly block has goto
    /// labels.
    /// This function also returns 0 if the cursor does not point at a GCC inline
    /// assembly block.
    /// ```
    public static int clang_Cursor_isGCCAssemblyHasGoto(
    	MemorySegment param0
    ) {
    	MethodHandle method = CLANG_CURSOR_IS_GCCASSEMBLY_HAS_GOTO.get();
    	try {
    		return (int) method.invokeExact(
    			param0
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_Cursor_isGCCAssemblyHasGoto].
    public static int clang_Cursor_isGCCAssemblyHasGoto(
    	CXCursor param0
    ) {
    	return clang_Cursor_isGCCAssemblyHasGoto(
    		param0.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Given a CXCursor_GCCAsmStmt cursor, count the number of outputs.
    /// This function also returns 0 if the cursor does not point at a GCC inline
    /// assembly block.
    /// ```
    public static int clang_Cursor_getGCCAssemblyNumOutputs(
    	MemorySegment param0
    ) {
    	MethodHandle method = CLANG_CURSOR_GET_GCCASSEMBLY_NUM_OUTPUTS.get();
    	try {
    		return (int) method.invokeExact(
    			param0
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_Cursor_getGCCAssemblyNumOutputs].
    public static int clang_Cursor_getGCCAssemblyNumOutputs(
    	CXCursor param0
    ) {
    	return clang_Cursor_getGCCAssemblyNumOutputs(
    		param0.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Given a CXCursor_GCCAsmStmt cursor, count the number of inputs.
    /// This function also returns 0 if the cursor does not point at a GCC inline
    /// assembly block.
    /// ```
    public static int clang_Cursor_getGCCAssemblyNumInputs(
    	MemorySegment param0
    ) {
    	MethodHandle method = CLANG_CURSOR_GET_GCCASSEMBLY_NUM_INPUTS.get();
    	try {
    		return (int) method.invokeExact(
    			param0
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_Cursor_getGCCAssemblyNumInputs].
    public static int clang_Cursor_getGCCAssemblyNumInputs(
    	CXCursor param0
    ) {
    	return clang_Cursor_getGCCAssemblyNumInputs(
    		param0.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Given a CXCursor_GCCAsmStmt cursor, get the constraint and expression cursor
    /// to the Index-th input.
    /// This function returns 1 when the cursor points at a GCC inline assembly
    /// statement, `Index` is within bounds and both the `Constraint` and `Expr` are
    /// not NULL.
    /// Otherwise, this function returns 0 but leaves `Constraint` and `Expr`
    /// intact.
    /// 
    /// Users are responsible for releasing the allocation of `Constraint` via
    /// \c clang_disposeString.
    /// ```
    public static int clang_Cursor_getGCCAssemblyInput(
    	MemorySegment Cursor,
    	int Index,
    	MemorySegment Constraint,
    	MemorySegment Expr
    ) {
    	MethodHandle method = CLANG_CURSOR_GET_GCCASSEMBLY_INPUT.get();
    	try {
    		return (int) method.invokeExact(
    			Cursor,
    			Index,
    			Constraint,
    			Expr
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_Cursor_getGCCAssemblyInput].
    public static int clang_Cursor_getGCCAssemblyInput(
    	CXCursor Cursor,
    	int Index,
    	CXString Constraint,
    	CXCursor Expr
    ) {
    	return clang_Cursor_getGCCAssemblyInput(
    		Cursor.memorySegment(),
    		Index,
    		Constraint.memorySegment(),
    		Expr.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Given a CXCursor_GCCAsmStmt cursor, get the constraint and expression cursor
    /// to the Index-th output.
    /// This function returns 1 when the cursor points at a GCC inline assembly
    /// statement, `Index` is within bounds and both the `Constraint` and `Expr` are
    /// not NULL.
    /// Otherwise, this function returns 0 but leaves `Constraint` and `Expr`
    /// intact.
    /// 
    /// Users are responsible for releasing the allocation of `Constraint` via
    /// \c clang_disposeString.
    /// ```
    public static int clang_Cursor_getGCCAssemblyOutput(
    	MemorySegment Cursor,
    	int Index,
    	MemorySegment Constraint,
    	MemorySegment Expr
    ) {
    	MethodHandle method = CLANG_CURSOR_GET_GCCASSEMBLY_OUTPUT.get();
    	try {
    		return (int) method.invokeExact(
    			Cursor,
    			Index,
    			Constraint,
    			Expr
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_Cursor_getGCCAssemblyOutput].
    public static int clang_Cursor_getGCCAssemblyOutput(
    	CXCursor Cursor,
    	int Index,
    	CXString Constraint,
    	CXCursor Expr
    ) {
    	return clang_Cursor_getGCCAssemblyOutput(
    		Cursor.memorySegment(),
    		Index,
    		Constraint.memorySegment(),
    		Expr.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Given a CXCursor_GCCAsmStmt cursor, count the clobbers in it.
    /// This function also returns 0 if the cursor does not point at a GCC inline
    /// assembly block.
    /// ```
    public static int clang_Cursor_getGCCAssemblyNumClobbers(
    	MemorySegment Cursor
    ) {
    	MethodHandle method = CLANG_CURSOR_GET_GCCASSEMBLY_NUM_CLOBBERS.get();
    	try {
    		return (int) method.invokeExact(
    			Cursor
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_Cursor_getGCCAssemblyNumClobbers].
    public static int clang_Cursor_getGCCAssemblyNumClobbers(
    	CXCursor Cursor
    ) {
    	return clang_Cursor_getGCCAssemblyNumClobbers(
    		Cursor.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Given a CXCursor_GCCAsmStmt cursor, get the Index-th clobber of it.
    /// This function returns a valid empty string if the cursor does not point
    /// at a GCC inline assembly block or `Index` is out of bounds.
    /// 
    /// Users are responsible for releasing the allocation of returned string via
    /// \c clang_disposeString.
    /// ```
    public static MemorySegment clang_Cursor_getGCCAssemblyClobber(
    	SegmentAllocator allocator,
    	MemorySegment Cursor,
    	int Index
    ) {
    	MethodHandle method = CLANG_CURSOR_GET_GCCASSEMBLY_CLOBBER.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			Cursor,
    			Index
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_Cursor_getGCCAssemblyClobber].
    public static @Nullable CXString clang_Cursor_getGCCAssemblyClobber(
    	SegmentAllocator allocator,
    	CXCursor Cursor,
    	int Index
    ) {
    	MemorySegment segment = clang_Cursor_getGCCAssemblyClobber(
    		allocator,
    		Cursor.memorySegment(),
    		Index
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXString(segment);
    }
    
    /// ```
    /// 
    /// Given a CXCursor_GCCAsmStmt cursor, check if the inline assembly is
    /// `volatile`.
    /// This function returns 0 if the cursor does not point at a GCC inline
    /// assembly block.
    /// ```
    public static int clang_Cursor_isGCCAssemblyVolatile(
    	MemorySegment Cursor
    ) {
    	MethodHandle method = CLANG_CURSOR_IS_GCCASSEMBLY_VOLATILE.get();
    	try {
    		return (int) method.invokeExact(
    			Cursor
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_Cursor_isGCCAssemblyVolatile].
    public static int clang_Cursor_isGCCAssemblyVolatile(
    	CXCursor Cursor
    ) {
    	return clang_Cursor_isGCCAssemblyVolatile(
    		Cursor.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Given a CXCursor_ModuleImportDecl cursor, return the associated module.
    /// ```
    public static MemorySegment clang_Cursor_getModule(
    	MemorySegment C
    ) {
    	MethodHandle method = CLANG_CURSOR_GET_MODULE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			C
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_Cursor_getModule].
    public static @Nullable MemorySegment clang_Cursor_getModule(
    	CXCursor C
    ) {
    	MemorySegment segment = clang_Cursor_getModule(
    		C.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// ```
    /// 
    /// Given a CXFile header file, return the module that contains it, if one
    /// exists.
    /// ```
    public static MemorySegment clang_getModuleForFile(
    	MemorySegment param0,
    	MemorySegment param1
    ) {
    	MethodHandle method = CLANG_GET_MODULE_FOR_FILE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			param0,
    			param1
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_getModuleForFile].
    public static @Nullable MemorySegment clang_getModuleForFile(
    	CXTranslationUnit param0,
    	MemorySegment param1
    ) {
    	MemorySegment segment = clang_getModuleForFile(
    		param0.memorySegment(),
    		param1
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// ```
    /// 
    /// \param Module a module object.
    /// 
    /// \returns the module file where the provided module object came from.
    /// 
    /// @deprecated: module files are longer guaranteed to be loaded from a CXFile
    /// ```
    public static MemorySegment clang_Module_getASTFile(
    	MemorySegment Module
    ) {
    	MethodHandle method = CLANG_MODULE_GET_ASTFILE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			Module
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// 
    /// \param Module a module object.
    /// 
    /// \returns the parent of a sub-module or NULL if the given module is top-level,
    /// e.g. for 'std.vector' it will return the 'std' module.
    /// ```
    public static MemorySegment clang_Module_getParent(
    	MemorySegment Module
    ) {
    	MethodHandle method = CLANG_MODULE_GET_PARENT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			Module
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// 
    /// \param Module a module object.
    /// 
    /// \returns the name of the module, e.g. for the 'std.vector' sub-module it
    /// will return "vector".
    /// ```
    public static MemorySegment nclang_Module_getName(
    	SegmentAllocator allocator,
    	MemorySegment Module
    ) {
    	MethodHandle method = CLANG_MODULE_GET_NAME.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			Module
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nclang_Module_getName].
    public static @Nullable CXString clang_Module_getName(
    	SegmentAllocator allocator,
    	MemorySegment Module
    ) {
    	MemorySegment segment = nclang_Module_getName(
    		allocator,
    		Module
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXString(segment);
    }
    
    /// ```
    /// 
    /// \param Module a module object.
    /// 
    /// \returns the full name of the module, e.g. "std.vector".
    /// ```
    public static MemorySegment nclang_Module_getFullName(
    	SegmentAllocator allocator,
    	MemorySegment Module
    ) {
    	MethodHandle method = CLANG_MODULE_GET_FULL_NAME.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			Module
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nclang_Module_getFullName].
    public static @Nullable CXString clang_Module_getFullName(
    	SegmentAllocator allocator,
    	MemorySegment Module
    ) {
    	MemorySegment segment = nclang_Module_getFullName(
    		allocator,
    		Module
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXString(segment);
    }
    
    /// ```
    /// 
    /// \param Module a module object.
    /// 
    /// \returns non-zero if the module is a system one.
    /// ```
    public static int clang_Module_isSystem(
    	MemorySegment Module
    ) {
    	MethodHandle method = CLANG_MODULE_IS_SYSTEM.get();
    	try {
    		return (int) method.invokeExact(
    			Module
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// 
    /// \param Module a module object.
    /// 
    /// \returns the number of top level headers associated with this module.
    /// ```
    public static int clang_Module_getNumTopLevelHeaders(
    	MemorySegment param0,
    	MemorySegment Module
    ) {
    	MethodHandle method = CLANG_MODULE_GET_NUM_TOP_LEVEL_HEADERS.get();
    	try {
    		return (int) method.invokeExact(
    			param0,
    			Module
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_Module_getNumTopLevelHeaders].
    public static int clang_Module_getNumTopLevelHeaders(
    	CXTranslationUnit param0,
    	MemorySegment Module
    ) {
    	return clang_Module_getNumTopLevelHeaders(
    		param0.memorySegment(),
    		Module
    	);
    }
    
    /// ```
    /// 
    /// \param Module a module object.
    /// 
    /// \param Index top level header index (zero-based).
    /// 
    /// \returns the specified top level header associated with the module.
    /// ```
    public static MemorySegment clang_Module_getTopLevelHeader(
    	MemorySegment param0,
    	MemorySegment Module,
    	int Index
    ) {
    	MethodHandle method = CLANG_MODULE_GET_TOP_LEVEL_HEADER.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			param0,
    			Module,
    			Index
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_Module_getTopLevelHeader].
    public static @Nullable MemorySegment clang_Module_getTopLevelHeader(
    	CXTranslationUnit param0,
    	MemorySegment Module,
    	int Index
    ) {
    	MemorySegment segment = clang_Module_getTopLevelHeader(
    		param0.memorySegment(),
    		Module,
    		Index
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// ```
    /// 
    /// Determine if a C++ constructor is a converting constructor.
    /// ```
    public static int clang_CXXConstructor_isConvertingConstructor(
    	MemorySegment C
    ) {
    	MethodHandle method = CLANG_CXXCONSTRUCTOR_IS_CONVERTING_CONSTRUCTOR.get();
    	try {
    		return (int) method.invokeExact(
    			C
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_CXXConstructor_isConvertingConstructor].
    public static int clang_CXXConstructor_isConvertingConstructor(
    	CXCursor C
    ) {
    	return clang_CXXConstructor_isConvertingConstructor(
    		C.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Determine if a C++ constructor is a copy constructor.
    /// ```
    public static int clang_CXXConstructor_isCopyConstructor(
    	MemorySegment C
    ) {
    	MethodHandle method = CLANG_CXXCONSTRUCTOR_IS_COPY_CONSTRUCTOR.get();
    	try {
    		return (int) method.invokeExact(
    			C
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_CXXConstructor_isCopyConstructor].
    public static int clang_CXXConstructor_isCopyConstructor(
    	CXCursor C
    ) {
    	return clang_CXXConstructor_isCopyConstructor(
    		C.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Determine if a C++ constructor is the default constructor.
    /// ```
    public static int clang_CXXConstructor_isDefaultConstructor(
    	MemorySegment C
    ) {
    	MethodHandle method = CLANG_CXXCONSTRUCTOR_IS_DEFAULT_CONSTRUCTOR.get();
    	try {
    		return (int) method.invokeExact(
    			C
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_CXXConstructor_isDefaultConstructor].
    public static int clang_CXXConstructor_isDefaultConstructor(
    	CXCursor C
    ) {
    	return clang_CXXConstructor_isDefaultConstructor(
    		C.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Determine if a C++ constructor is a move constructor.
    /// ```
    public static int clang_CXXConstructor_isMoveConstructor(
    	MemorySegment C
    ) {
    	MethodHandle method = CLANG_CXXCONSTRUCTOR_IS_MOVE_CONSTRUCTOR.get();
    	try {
    		return (int) method.invokeExact(
    			C
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_CXXConstructor_isMoveConstructor].
    public static int clang_CXXConstructor_isMoveConstructor(
    	CXCursor C
    ) {
    	return clang_CXXConstructor_isMoveConstructor(
    		C.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Determine if a C++ field is declared 'mutable'.
    /// ```
    public static int clang_CXXField_isMutable(
    	MemorySegment C
    ) {
    	MethodHandle method = CLANG_CXXFIELD_IS_MUTABLE.get();
    	try {
    		return (int) method.invokeExact(
    			C
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_CXXField_isMutable].
    public static int clang_CXXField_isMutable(
    	CXCursor C
    ) {
    	return clang_CXXField_isMutable(
    		C.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Determine if a C++ method is declared '= default'.
    /// ```
    public static int clang_CXXMethod_isDefaulted(
    	MemorySegment C
    ) {
    	MethodHandle method = CLANG_CXXMETHOD_IS_DEFAULTED.get();
    	try {
    		return (int) method.invokeExact(
    			C
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_CXXMethod_isDefaulted].
    public static int clang_CXXMethod_isDefaulted(
    	CXCursor C
    ) {
    	return clang_CXXMethod_isDefaulted(
    		C.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Determine if a C++ method is declared '= delete'.
    /// ```
    public static int clang_CXXMethod_isDeleted(
    	MemorySegment C
    ) {
    	MethodHandle method = CLANG_CXXMETHOD_IS_DELETED.get();
    	try {
    		return (int) method.invokeExact(
    			C
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_CXXMethod_isDeleted].
    public static int clang_CXXMethod_isDeleted(
    	CXCursor C
    ) {
    	return clang_CXXMethod_isDeleted(
    		C.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Determine if a C++ member function or member function template is
    /// pure virtual.
    /// ```
    public static int clang_CXXMethod_isPureVirtual(
    	MemorySegment C
    ) {
    	MethodHandle method = CLANG_CXXMETHOD_IS_PURE_VIRTUAL.get();
    	try {
    		return (int) method.invokeExact(
    			C
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_CXXMethod_isPureVirtual].
    public static int clang_CXXMethod_isPureVirtual(
    	CXCursor C
    ) {
    	return clang_CXXMethod_isPureVirtual(
    		C.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Determine if a C++ member function or member function template is
    /// declared 'static'.
    /// ```
    public static int clang_CXXMethod_isStatic(
    	MemorySegment C
    ) {
    	MethodHandle method = CLANG_CXXMETHOD_IS_STATIC.get();
    	try {
    		return (int) method.invokeExact(
    			C
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_CXXMethod_isStatic].
    public static int clang_CXXMethod_isStatic(
    	CXCursor C
    ) {
    	return clang_CXXMethod_isStatic(
    		C.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Determine if a C++ member function or member function template is
    /// explicitly declared 'virtual' or if it overrides a virtual method from
    /// one of the base classes.
    /// ```
    public static int clang_CXXMethod_isVirtual(
    	MemorySegment C
    ) {
    	MethodHandle method = CLANG_CXXMETHOD_IS_VIRTUAL.get();
    	try {
    		return (int) method.invokeExact(
    			C
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_CXXMethod_isVirtual].
    public static int clang_CXXMethod_isVirtual(
    	CXCursor C
    ) {
    	return clang_CXXMethod_isVirtual(
    		C.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Determine if a C++ member function is a copy-assignment operator,
    /// returning 1 if such is the case and 0 otherwise.
    /// 
    /// > A copy-assignment operator `X::operator=` is a non-static,
    /// > non-template member function of _class_ `X` with exactly one
    /// > parameter of type `X`, `X&`, `const X&`, `volatile X&` or `const
    /// > volatile X&`.
    /// 
    /// That is, for example, the `operator=` in:
    /// 
    /// class Foo {
    /// bool operator=(const volatile Foo&);
    /// };
    /// 
    /// Is a copy-assignment operator, while the `operator=` in:
    /// 
    /// class Bar {
    /// bool operator=(const int&);
    /// };
    /// 
    /// Is not.
    /// ```
    public static int clang_CXXMethod_isCopyAssignmentOperator(
    	MemorySegment C
    ) {
    	MethodHandle method = CLANG_CXXMETHOD_IS_COPY_ASSIGNMENT_OPERATOR.get();
    	try {
    		return (int) method.invokeExact(
    			C
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_CXXMethod_isCopyAssignmentOperator].
    public static int clang_CXXMethod_isCopyAssignmentOperator(
    	CXCursor C
    ) {
    	return clang_CXXMethod_isCopyAssignmentOperator(
    		C.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Determine if a C++ member function is a move-assignment operator,
    /// returning 1 if such is the case and 0 otherwise.
    /// 
    /// > A move-assignment operator `X::operator=` is a non-static,
    /// > non-template member function of _class_ `X` with exactly one
    /// > parameter of type `X&&`, `const X&&`, `volatile X&&` or `const
    /// > volatile X&&`.
    /// 
    /// That is, for example, the `operator=` in:
    /// 
    /// class Foo {
    /// bool operator=(const volatile Foo&&);
    /// };
    /// 
    /// Is a move-assignment operator, while the `operator=` in:
    /// 
    /// class Bar {
    /// bool operator=(const int&&);
    /// };
    /// 
    /// Is not.
    /// ```
    public static int clang_CXXMethod_isMoveAssignmentOperator(
    	MemorySegment C
    ) {
    	MethodHandle method = CLANG_CXXMETHOD_IS_MOVE_ASSIGNMENT_OPERATOR.get();
    	try {
    		return (int) method.invokeExact(
    			C
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_CXXMethod_isMoveAssignmentOperator].
    public static int clang_CXXMethod_isMoveAssignmentOperator(
    	CXCursor C
    ) {
    	return clang_CXXMethod_isMoveAssignmentOperator(
    		C.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Determines if a C++ constructor or conversion function was declared
    /// explicit, returning 1 if such is the case and 0 otherwise.
    /// 
    /// Constructors or conversion functions are declared explicit through
    /// the use of the explicit specifier.
    /// 
    /// For example, the following constructor and conversion function are
    /// not explicit as they lack the explicit specifier:
    /// 
    /// class Foo {
    /// Foo();
    /// operator int();
    /// };
    /// 
    /// While the following constructor and conversion function are
    /// explicit as they are declared with the explicit specifier.
    /// 
    /// class Foo {
    /// explicit Foo();
    /// explicit operator int();
    /// };
    /// 
    /// This function will return 0 when given a cursor pointing to one of
    /// the former declarations and it will return 1 for a cursor pointing
    /// to the latter declarations.
    /// 
    /// The explicit specifier allows the user to specify a
    /// conditional compile-time expression whose value decides
    /// whether the marked element is explicit or not.
    /// 
    /// For example:
    /// 
    /// constexpr bool foo(int i) { return i % 2 == 0; }
    /// 
    /// class Foo {
    /// explicit(foo(1)) Foo();
    /// explicit(foo(2)) operator int();
    /// }
    /// 
    /// This function will return 0 for the constructor and 1 for
    /// the conversion function.
    /// ```
    public static int clang_CXXMethod_isExplicit(
    	MemorySegment C
    ) {
    	MethodHandle method = CLANG_CXXMETHOD_IS_EXPLICIT.get();
    	try {
    		return (int) method.invokeExact(
    			C
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_CXXMethod_isExplicit].
    public static int clang_CXXMethod_isExplicit(
    	CXCursor C
    ) {
    	return clang_CXXMethod_isExplicit(
    		C.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Determine if a C++ record is abstract, i.e. whether a class or struct
    /// has a pure virtual member function.
    /// ```
    public static int clang_CXXRecord_isAbstract(
    	MemorySegment C
    ) {
    	MethodHandle method = CLANG_CXXRECORD_IS_ABSTRACT.get();
    	try {
    		return (int) method.invokeExact(
    			C
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_CXXRecord_isAbstract].
    public static int clang_CXXRecord_isAbstract(
    	CXCursor C
    ) {
    	return clang_CXXRecord_isAbstract(
    		C.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Determine if an enum declaration refers to a scoped enum.
    /// ```
    public static int clang_EnumDecl_isScoped(
    	MemorySegment C
    ) {
    	MethodHandle method = CLANG_ENUM_DECL_IS_SCOPED.get();
    	try {
    		return (int) method.invokeExact(
    			C
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_EnumDecl_isScoped].
    public static int clang_EnumDecl_isScoped(
    	CXCursor C
    ) {
    	return clang_EnumDecl_isScoped(
    		C.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Determine if a C++ member function or member function template is
    /// declared 'const'.
    /// ```
    public static int clang_CXXMethod_isConst(
    	MemorySegment C
    ) {
    	MethodHandle method = CLANG_CXXMETHOD_IS_CONST.get();
    	try {
    		return (int) method.invokeExact(
    			C
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_CXXMethod_isConst].
    public static int clang_CXXMethod_isConst(
    	CXCursor C
    ) {
    	return clang_CXXMethod_isConst(
    		C.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Given a cursor that represents a template, determine
    /// the cursor kind of the specializations would be generated by instantiating
    /// the template.
    /// 
    /// This routine can be used to determine what flavor of function template,
    /// class template, or class template partial specialization is stored in the
    /// cursor. For example, it can describe whether a class template cursor is
    /// declared with "struct", "class" or "union".
    /// 
    /// \param C The cursor to query. This cursor should represent a template
    /// declaration.
    /// 
    /// \returns The cursor kind of the specializations that would be generated
    /// by instantiating the template \p C. If \p C is not a template, returns
    /// \c CXCursor_NoDeclFound.
    /// ```
    public static int clang_getTemplateCursorKind(
    	MemorySegment C
    ) {
    	MethodHandle method = CLANG_GET_TEMPLATE_CURSOR_KIND.get();
    	try {
    		return (int) method.invokeExact(
    			C
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_getTemplateCursorKind].
    public static int clang_getTemplateCursorKind(
    	CXCursor C
    ) {
    	return clang_getTemplateCursorKind(
    		C.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Given a cursor that may represent a specialization or instantiation
    /// of a template, retrieve the cursor that represents the template that it
    /// specializes or from which it was instantiated.
    /// 
    /// This routine determines the template involved both for explicit
    /// specializations of templates and for implicit instantiations of the template,
    /// both of which are referred to as "specializations". For a class template
    /// specialization (e.g., \c std::vector<bool>), this routine will return
    /// either the primary template (\c std::vector) or, if the specialization was
    /// instantiated from a class template partial specialization, the class template
    /// partial specialization. For a class template partial specialization and a
    /// function template specialization (including instantiations), this
    /// this routine will return the specialized template.
    /// 
    /// For members of a class template (e.g., member functions, member classes, or
    /// static data members), returns the specialized or instantiated member.
    /// Although not strictly "templates" in the C++ language, members of class
    /// templates have the same notions of specializations and instantiations that
    /// templates do, so this routine treats them similarly.
    /// 
    /// \param C A cursor that may be a specialization of a template or a member
    /// of a template.
    /// 
    /// \returns If the given cursor is a specialization or instantiation of a
    /// template or a member thereof, the template or member that it specializes or
    /// from which it was instantiated. Otherwise, returns a NULL cursor.
    /// ```
    public static MemorySegment clang_getSpecializedCursorTemplate(
    	SegmentAllocator allocator,
    	MemorySegment C
    ) {
    	MethodHandle method = CLANG_GET_SPECIALIZED_CURSOR_TEMPLATE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			C
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_getSpecializedCursorTemplate].
    public static @Nullable CXCursor clang_getSpecializedCursorTemplate(
    	SegmentAllocator allocator,
    	CXCursor C
    ) {
    	MemorySegment segment = clang_getSpecializedCursorTemplate(
    		allocator,
    		C.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXCursor(segment);
    }
    
    /// ```
    /// 
    /// Given a cursor that references something else, return the source range
    /// covering that reference.
    /// 
    /// \param C A cursor pointing to a member reference, a declaration reference, or
    /// an operator call.
    /// \param NameFlags A bitset with three independent flags:
    /// CXNameRange_WantQualifier, CXNameRange_WantTemplateArgs, and
    /// CXNameRange_WantSinglePiece.
    /// \param PieceIndex For contiguous names or when passing the flag
    /// CXNameRange_WantSinglePiece, only one piece with index 0 is
    /// available. When the CXNameRange_WantSinglePiece flag is not passed for a
    /// non-contiguous names, this index can be used to retrieve the individual
    /// pieces of the name. See also CXNameRange_WantSinglePiece.
    /// 
    /// \returns The piece of the name pointed to by the given cursor. If there is no
    /// name, or if the PieceIndex is out-of-range, a null-cursor will be returned.
    /// ```
    public static MemorySegment clang_getCursorReferenceNameRange(
    	SegmentAllocator allocator,
    	MemorySegment C,
    	int NameFlags,
    	int PieceIndex
    ) {
    	MethodHandle method = CLANG_GET_CURSOR_REFERENCE_NAME_RANGE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			C,
    			NameFlags,
    			PieceIndex
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_getCursorReferenceNameRange].
    public static @Nullable CXSourceRange clang_getCursorReferenceNameRange(
    	SegmentAllocator allocator,
    	CXCursor C,
    	int NameFlags,
    	int PieceIndex
    ) {
    	MemorySegment segment = clang_getCursorReferenceNameRange(
    		allocator,
    		C.memorySegment(),
    		NameFlags,
    		PieceIndex
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXSourceRange(segment);
    }
    
    /// ```
    /// 
    /// Get the raw lexical token starting with the given location.
    /// 
    /// \param TU the translation unit whose text is being tokenized.
    /// 
    /// \param Location the source location with which the token starts.
    /// 
    /// \returns The token starting with the given location or NULL if no such token
    /// exist. The returned pointer must be freed with clang_disposeTokens before the
    /// translation unit is destroyed.
    /// ```
    public static MemorySegment clang_getToken(
    	MemorySegment TU,
    	MemorySegment Location
    ) {
    	MethodHandle method = CLANG_GET_TOKEN.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			TU,
    			Location
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_getToken].
    public static @Nullable CXToken clang_getToken(
    	CXTranslationUnit TU,
    	CXSourceLocation Location
    ) {
    	MemorySegment segment = clang_getToken(
    		TU.memorySegment(),
    		Location.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXToken(segment);
    }
    
    /// ```
    /// 
    /// Determine the kind of the given token.
    /// ```
    public static int clang_getTokenKind(
    	MemorySegment param0
    ) {
    	MethodHandle method = CLANG_GET_TOKEN_KIND.get();
    	try {
    		return (int) method.invokeExact(
    			param0
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_getTokenKind].
    public static int clang_getTokenKind(
    	CXToken param0
    ) {
    	return clang_getTokenKind(
    		param0.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Determine the spelling of the given token.
    /// 
    /// The spelling of a token is the textual representation of that token, e.g.,
    /// the text of an identifier or keyword.
    /// ```
    public static MemorySegment clang_getTokenSpelling(
    	SegmentAllocator allocator,
    	MemorySegment param0,
    	MemorySegment param1
    ) {
    	MethodHandle method = CLANG_GET_TOKEN_SPELLING.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			param0,
    			param1
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_getTokenSpelling].
    public static @Nullable CXString clang_getTokenSpelling(
    	SegmentAllocator allocator,
    	CXTranslationUnit param0,
    	CXToken param1
    ) {
    	MemorySegment segment = clang_getTokenSpelling(
    		allocator,
    		param0.memorySegment(),
    		param1.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXString(segment);
    }
    
    /// ```
    /// 
    /// Retrieve the source location of the given token.
    /// ```
    public static MemorySegment clang_getTokenLocation(
    	SegmentAllocator allocator,
    	MemorySegment param0,
    	MemorySegment param1
    ) {
    	MethodHandle method = CLANG_GET_TOKEN_LOCATION.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			param0,
    			param1
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_getTokenLocation].
    public static @Nullable CXSourceLocation clang_getTokenLocation(
    	SegmentAllocator allocator,
    	CXTranslationUnit param0,
    	CXToken param1
    ) {
    	MemorySegment segment = clang_getTokenLocation(
    		allocator,
    		param0.memorySegment(),
    		param1.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXSourceLocation(segment);
    }
    
    /// ```
    /// 
    /// Retrieve a source range that covers the given token.
    /// ```
    public static MemorySegment clang_getTokenExtent(
    	SegmentAllocator allocator,
    	MemorySegment param0,
    	MemorySegment param1
    ) {
    	MethodHandle method = CLANG_GET_TOKEN_EXTENT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			param0,
    			param1
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_getTokenExtent].
    public static @Nullable CXSourceRange clang_getTokenExtent(
    	SegmentAllocator allocator,
    	CXTranslationUnit param0,
    	CXToken param1
    ) {
    	MemorySegment segment = clang_getTokenExtent(
    		allocator,
    		param0.memorySegment(),
    		param1.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXSourceRange(segment);
    }
    
    /// ```
    /// 
    /// Tokenize the source code described by the given range into raw
    /// lexical tokens.
    /// 
    /// \param TU the translation unit whose text is being tokenized.
    /// 
    /// \param Range the source range in which text should be tokenized. All of the
    /// tokens produced by tokenization will fall within this source range,
    /// 
    /// \param Tokens this pointer will be set to point to the array of tokens
    /// that occur within the given source range. The returned pointer must be
    /// freed with clang_disposeTokens() before the translation unit is destroyed.
    /// 
    /// \param NumTokens will be set to the number of tokens in the \c *Tokens
    /// array.
    /// 
    /// ```
    public static void clang_tokenize(
    	MemorySegment TU,
    	MemorySegment Range,
    	MemorySegment Tokens,
    	MemorySegment NumTokens
    ) {
    	MethodHandle method = CLANG_TOKENIZE.get();
    	try {
    		 method.invokeExact(
    			TU,
    			Range,
    			Tokens,
    			NumTokens
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_tokenize].
    public static void clang_tokenize(
    	CXTranslationUnit TU,
    	CXSourceRange Range,
    	NativePointerArray Tokens,
    	NativeIntArray NumTokens
    ) {
    	clang_tokenize(
    		TU.memorySegment(),
    		Range.memorySegment(),
    		Tokens.memorySegment(),
    		NumTokens.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Annotate the given set of tokens by providing cursors for each token
    /// that can be mapped to a specific entity within the abstract syntax tree.
    /// 
    /// This token-annotation routine is equivalent to invoking
    /// clang_getCursor() for the source locations of each of the
    /// tokens. The cursors provided are filtered, so that only those
    /// cursors that have a direct correspondence to the token are
    /// accepted. For example, given a function call \c f(x),
    /// clang_getCursor() would provide the following cursors:
    /// 
    /// * when the cursor is over the 'f', a DeclRefExpr cursor referring to 'f'.
    /// * when the cursor is over the '(' or the ')', a CallExpr referring to 'f'.
    /// * when the cursor is over the 'x', a DeclRefExpr cursor referring to 'x'.
    /// 
    /// Only the first and last of these cursors will occur within the
    /// annotate, since the tokens "f" and "x' directly refer to a function
    /// and a variable, respectively, but the parentheses are just a small
    /// part of the full syntax of the function call expression, which is
    /// not provided as an annotation.
    /// 
    /// \param TU the translation unit that owns the given tokens.
    /// 
    /// \param Tokens the set of tokens to annotate.
    /// 
    /// \param NumTokens the number of tokens in \p Tokens.
    /// 
    /// \param Cursors an array of \p NumTokens cursors, whose contents will be
    /// replaced with the cursors corresponding to each token.
    /// ```
    public static void clang_annotateTokens(
    	MemorySegment TU,
    	MemorySegment Tokens,
    	int NumTokens,
    	MemorySegment Cursors
    ) {
    	MethodHandle method = CLANG_ANNOTATE_TOKENS.get();
    	try {
    		 method.invokeExact(
    			TU,
    			Tokens,
    			NumTokens,
    			Cursors
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_annotateTokens].
    public static void clang_annotateTokens(
    	CXTranslationUnit TU,
    	NativeStructArray<CXToken> Tokens,
    	int NumTokens,
    	NativeStructArray<CXCursor> Cursors
    ) {
    	clang_annotateTokens(
    		TU.memorySegment(),
    		Tokens.memorySegment(),
    		NumTokens,
    		Cursors.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Free the given set of tokens.
    /// ```
    public static void clang_disposeTokens(
    	MemorySegment TU,
    	MemorySegment Tokens,
    	int NumTokens
    ) {
    	MethodHandle method = CLANG_DISPOSE_TOKENS.get();
    	try {
    		 method.invokeExact(
    			TU,
    			Tokens,
    			NumTokens
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_disposeTokens].
    public static void clang_disposeTokens(
    	CXTranslationUnit TU,
    	NativeStructArray<CXToken> Tokens,
    	int NumTokens
    ) {
    	clang_disposeTokens(
    		TU.memorySegment(),
    		Tokens.memorySegment(),
    		NumTokens
    	);
    }
    
    /// ```
    /// 
    /// \defgroup CINDEX_DEBUG Debugging facilities
    /// 
    /// These routines are used for testing and debugging, only, and should not
    /// be relied upon.
    /// 
    /// @{
    /// ```
    public static MemorySegment nclang_getCursorKindSpelling(
    	SegmentAllocator allocator,
    	int Kind
    ) {
    	MethodHandle method = CLANG_GET_CURSOR_KIND_SPELLING.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			Kind
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nclang_getCursorKindSpelling].
    public static @Nullable CXString clang_getCursorKindSpelling(
    	SegmentAllocator allocator,
    	int Kind
    ) {
    	MemorySegment segment = nclang_getCursorKindSpelling(
    		allocator,
    		Kind
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXString(segment);
    }
    
    public static void clang_getDefinitionSpellingAndExtent(
    	MemorySegment param0,
    	MemorySegment startBuf,
    	MemorySegment endBuf,
    	MemorySegment startLine,
    	MemorySegment startColumn,
    	MemorySegment endLine,
    	MemorySegment endColumn
    ) {
    	MethodHandle method = CLANG_GET_DEFINITION_SPELLING_AND_EXTENT.get();
    	try {
    		 method.invokeExact(
    			param0,
    			startBuf,
    			endBuf,
    			startLine,
    			startColumn,
    			endLine,
    			endColumn
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_getDefinitionSpellingAndExtent].
    public static void clang_getDefinitionSpellingAndExtent(
    	CXCursor param0,
    	NativePointerArray startBuf,
    	NativePointerArray endBuf,
    	NativeIntArray startLine,
    	NativeIntArray startColumn,
    	NativeIntArray endLine,
    	NativeIntArray endColumn
    ) {
    	clang_getDefinitionSpellingAndExtent(
    		param0.memorySegment(),
    		startBuf.memorySegment(),
    		endBuf.memorySegment(),
    		startLine.memorySegment(),
    		startColumn.memorySegment(),
    		endLine.memorySegment(),
    		endColumn.memorySegment()
    	);
    }
    
    public static void clang_enableStackTraces() {
    	MethodHandle method = CLANG_ENABLE_STACK_TRACES.get();
    	try {
    		 method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// 
    /// Determine the kind of a particular chunk within a completion string.
    /// 
    /// \param completion_string the completion string to query.
    /// 
    /// \param chunk_number the 0-based index of the chunk in the completion string.
    /// 
    /// \returns the kind of the chunk at the index \c chunk_number.
    /// ```
    public static int clang_getCompletionChunkKind(
    	MemorySegment completion_string,
    	int chunk_number
    ) {
    	MethodHandle method = CLANG_GET_COMPLETION_CHUNK_KIND.get();
    	try {
    		return (int) method.invokeExact(
    			completion_string,
    			chunk_number
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// 
    /// Retrieve the text associated with a particular chunk within a
    /// completion string.
    /// 
    /// \param completion_string the completion string to query.
    /// 
    /// \param chunk_number the 0-based index of the chunk in the completion string.
    /// 
    /// \returns the text associated with the chunk at index \c chunk_number.
    /// ```
    public static MemorySegment nclang_getCompletionChunkText(
    	SegmentAllocator allocator,
    	MemorySegment completion_string,
    	int chunk_number
    ) {
    	MethodHandle method = CLANG_GET_COMPLETION_CHUNK_TEXT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			completion_string,
    			chunk_number
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nclang_getCompletionChunkText].
    public static @Nullable CXString clang_getCompletionChunkText(
    	SegmentAllocator allocator,
    	MemorySegment completion_string,
    	int chunk_number
    ) {
    	MemorySegment segment = nclang_getCompletionChunkText(
    		allocator,
    		completion_string,
    		chunk_number
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXString(segment);
    }
    
    /// ```
    /// 
    /// Retrieve the completion string associated with a particular chunk
    /// within a completion string.
    /// 
    /// \param completion_string the completion string to query.
    /// 
    /// \param chunk_number the 0-based index of the chunk in the completion string.
    /// 
    /// \returns the completion string associated with the chunk at index
    /// \c chunk_number.
    /// ```
    public static MemorySegment clang_getCompletionChunkCompletionString(
    	MemorySegment completion_string,
    	int chunk_number
    ) {
    	MethodHandle method = CLANG_GET_COMPLETION_CHUNK_COMPLETION_STRING.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			completion_string,
    			chunk_number
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// 
    /// Retrieve the number of chunks in the given code-completion string.
    /// ```
    public static int clang_getNumCompletionChunks(
    	MemorySegment completion_string
    ) {
    	MethodHandle method = CLANG_GET_NUM_COMPLETION_CHUNKS.get();
    	try {
    		return (int) method.invokeExact(
    			completion_string
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// 
    /// Determine the priority of this code completion.
    /// 
    /// The priority of a code completion indicates how likely it is that this
    /// particular completion is the completion that the user will select. The
    /// priority is selected by various internal heuristics.
    /// 
    /// \param completion_string The completion string to query.
    /// 
    /// \returns The priority of this completion string. Smaller values indicate
    /// higher-priority (more likely) completions.
    /// ```
    public static int clang_getCompletionPriority(
    	MemorySegment completion_string
    ) {
    	MethodHandle method = CLANG_GET_COMPLETION_PRIORITY.get();
    	try {
    		return (int) method.invokeExact(
    			completion_string
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// 
    /// Determine the availability of the entity that this code-completion
    /// string refers to.
    /// 
    /// \param completion_string The completion string to query.
    /// 
    /// \returns The availability of the completion string.
    /// ```
    public static int clang_getCompletionAvailability(
    	MemorySegment completion_string
    ) {
    	MethodHandle method = CLANG_GET_COMPLETION_AVAILABILITY.get();
    	try {
    		return (int) method.invokeExact(
    			completion_string
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// 
    /// Retrieve the number of annotations associated with the given
    /// completion string.
    /// 
    /// \param completion_string the completion string to query.
    /// 
    /// \returns the number of annotations associated with the given completion
    /// string.
    /// ```
    public static int clang_getCompletionNumAnnotations(
    	MemorySegment completion_string
    ) {
    	MethodHandle method = CLANG_GET_COMPLETION_NUM_ANNOTATIONS.get();
    	try {
    		return (int) method.invokeExact(
    			completion_string
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// 
    /// Retrieve the annotation associated with the given completion string.
    /// 
    /// \param completion_string the completion string to query.
    /// 
    /// \param annotation_number the 0-based index of the annotation of the
    /// completion string.
    /// 
    /// \returns annotation string associated with the completion at index
    /// \c annotation_number, or a NULL string if that annotation is not available.
    /// ```
    public static MemorySegment nclang_getCompletionAnnotation(
    	SegmentAllocator allocator,
    	MemorySegment completion_string,
    	int annotation_number
    ) {
    	MethodHandle method = CLANG_GET_COMPLETION_ANNOTATION.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			completion_string,
    			annotation_number
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nclang_getCompletionAnnotation].
    public static @Nullable CXString clang_getCompletionAnnotation(
    	SegmentAllocator allocator,
    	MemorySegment completion_string,
    	int annotation_number
    ) {
    	MemorySegment segment = nclang_getCompletionAnnotation(
    		allocator,
    		completion_string,
    		annotation_number
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXString(segment);
    }
    
    /// ```
    /// 
    /// Retrieve the parent context of the given completion string.
    /// 
    /// The parent context of a completion string is the semantic parent of
    /// the declaration (if any) that the code completion represents. For example,
    /// a code completion for an Objective-C method would have the method's class
    /// or protocol as its context.
    /// 
    /// \param completion_string The code completion string whose parent is
    /// being queried.
    /// 
    /// \param kind DEPRECATED: always set to CXCursor_NotImplemented if non-NULL.
    /// 
    /// \returns The name of the completion parent, e.g., "NSObject" if
    /// the completion string represents a method in the NSObject class.
    /// ```
    public static MemorySegment clang_getCompletionParent(
    	SegmentAllocator allocator,
    	MemorySegment completion_string,
    	MemorySegment kind
    ) {
    	MethodHandle method = CLANG_GET_COMPLETION_PARENT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			completion_string,
    			kind
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_getCompletionParent].
    public static @Nullable CXString clang_getCompletionParent(
    	SegmentAllocator allocator,
    	MemorySegment completion_string,
    	NativeIntArray kind
    ) {
    	MemorySegment segment = clang_getCompletionParent(
    		allocator,
    		completion_string,
    		kind.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXString(segment);
    }
    
    /// ```
    /// 
    /// Retrieve the brief documentation comment attached to the declaration
    /// that corresponds to the given completion string.
    /// ```
    public static MemorySegment nclang_getCompletionBriefComment(
    	SegmentAllocator allocator,
    	MemorySegment completion_string
    ) {
    	MethodHandle method = CLANG_GET_COMPLETION_BRIEF_COMMENT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			completion_string
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nclang_getCompletionBriefComment].
    public static @Nullable CXString clang_getCompletionBriefComment(
    	SegmentAllocator allocator,
    	MemorySegment completion_string
    ) {
    	MemorySegment segment = nclang_getCompletionBriefComment(
    		allocator,
    		completion_string
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXString(segment);
    }
    
    /// ```
    /// 
    /// Retrieve a completion string for an arbitrary declaration or macro
    /// definition cursor.
    /// 
    /// \param cursor The cursor to query.
    /// 
    /// \returns A non-context-sensitive completion string for declaration and macro
    /// definition cursors, or NULL for other kinds of cursors.
    /// ```
    public static MemorySegment clang_getCursorCompletionString(
    	MemorySegment cursor
    ) {
    	MethodHandle method = CLANG_GET_CURSOR_COMPLETION_STRING.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			cursor
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_getCursorCompletionString].
    public static @Nullable MemorySegment clang_getCursorCompletionString(
    	CXCursor cursor
    ) {
    	MemorySegment segment = clang_getCursorCompletionString(
    		cursor.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// ```
    /// 
    /// Retrieve the number of fix-its for the given completion index.
    /// 
    /// Calling this makes sense only if CXCodeComplete_IncludeCompletionsWithFixIts
    /// option was set.
    /// 
    /// \param results The structure keeping all completion results
    /// 
    /// \param completion_index The index of the completion
    /// 
    /// \return The number of fix-its which must be applied before the completion at
    /// completion_index can be applied
    /// ```
    public static int clang_getCompletionNumFixIts(
    	MemorySegment results,
    	int completion_index
    ) {
    	MethodHandle method = CLANG_GET_COMPLETION_NUM_FIX_ITS.get();
    	try {
    		return (int) method.invokeExact(
    			results,
    			completion_index
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_getCompletionNumFixIts].
    public static int clang_getCompletionNumFixIts(
    	CXCodeCompleteResults results,
    	int completion_index
    ) {
    	return clang_getCompletionNumFixIts(
    		results.memorySegment(),
    		completion_index
    	);
    }
    
    /// ```
    /// 
    /// Fix-its that *must* be applied before inserting the text for the
    /// corresponding completion.
    /// 
    /// By default, clang_codeCompleteAt() only returns completions with empty
    /// fix-its. Extra completions with non-empty fix-its should be explicitly
    /// requested by setting CXCodeComplete_IncludeCompletionsWithFixIts.
    /// 
    /// For the clients to be able to compute position of the cursor after applying
    /// fix-its, the following conditions are guaranteed to hold for
    /// replacement_range of the stored fix-its:
    /// - Ranges in the fix-its are guaranteed to never contain the completion
    /// point (or identifier under completion point, if any) inside them, except
    /// at the start or at the end of the range.
    /// - If a fix-it range starts or ends with completion point (or starts or
    /// ends after the identifier under completion point), it will contain at
    /// least one character. It allows to unambiguously recompute completion
    /// point after applying the fix-it.
    /// 
    /// The intuition is that provided fix-its change code around the identifier we
    /// complete, but are not allowed to touch the identifier itself or the
    /// completion point. One example of completions with corrections are the ones
    /// replacing '.' with '->' and vice versa:
    /// 
    /// std::unique_ptr<std::vector<int>> vec_ptr;
    /// In 'vec_ptr.^', one of the completions is 'push_back', it requires
    /// replacing '.' with '->'.
    /// In 'vec_ptr->^', one of the completions is 'release', it requires
    /// replacing '->' with '.'.
    /// 
    /// \param results The structure keeping all completion results
    /// 
    /// \param completion_index The index of the completion
    /// 
    /// \param fixit_index The index of the fix-it for the completion at
    /// completion_index
    /// 
    /// \param replacement_range The fix-it range that must be replaced before the
    /// completion at completion_index can be applied
    /// 
    /// \returns The fix-it string that must replace the code at replacement_range
    /// before the completion at completion_index can be applied
    /// ```
    public static MemorySegment clang_getCompletionFixIt(
    	SegmentAllocator allocator,
    	MemorySegment results,
    	int completion_index,
    	int fixit_index,
    	MemorySegment replacement_range
    ) {
    	MethodHandle method = CLANG_GET_COMPLETION_FIX_IT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			results,
    			completion_index,
    			fixit_index,
    			replacement_range
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_getCompletionFixIt].
    public static @Nullable CXString clang_getCompletionFixIt(
    	SegmentAllocator allocator,
    	CXCodeCompleteResults results,
    	int completion_index,
    	int fixit_index,
    	CXSourceRange replacement_range
    ) {
    	MemorySegment segment = clang_getCompletionFixIt(
    		allocator,
    		results.memorySegment(),
    		completion_index,
    		fixit_index,
    		replacement_range.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXString(segment);
    }
    
    /// ```
    /// 
    /// Returns a default set of code-completion options that can be
    /// passed to\c clang_codeCompleteAt().
    /// ```
    public static int clang_defaultCodeCompleteOptions() {
    	MethodHandle method = CLANG_DEFAULT_CODE_COMPLETE_OPTIONS.get();
    	try {
    		return (int) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// 
    /// Perform code completion at a given location in a translation unit.
    /// 
    /// This function performs code completion at a particular file, line, and
    /// column within source code, providing results that suggest potential
    /// code snippets based on the context of the completion. The basic model
    /// for code completion is that Clang will parse a complete source file,
    /// performing syntax checking up to the location where code-completion has
    /// been requested. At that point, a special code-completion token is passed
    /// to the parser, which recognizes this token and determines, based on the
    /// current location in the C/Objective-C/C++ grammar and the state of
    /// semantic analysis, what completions to provide. These completions are
    /// returned via a new \c CXCodeCompleteResults structure.
    /// 
    /// Code completion itself is meant to be triggered by the client when the
    /// user types punctuation characters or whitespace, at which point the
    /// code-completion location will coincide with the cursor. For example, if \c p
    /// is a pointer, code-completion might be triggered after the "-" and then
    /// after the ">" in \c p->. When the code-completion location is after the ">",
    /// the completion results will provide, e.g., the members of the struct that
    /// "p" points to. The client is responsible for placing the cursor at the
    /// beginning of the token currently being typed, then filtering the results
    /// based on the contents of the token. For example, when code-completing for
    /// the expression \c p->get, the client should provide the location just after
    /// the ">" (e.g., pointing at the "g") to this code-completion hook. Then, the
    /// client can filter the results based on the current token text ("get"), only
    /// showing those results that start with "get". The intent of this interface
    /// is to separate the relatively high-latency acquisition of code-completion
    /// results from the filtering of results on a per-character basis, which must
    /// have a lower latency.
    /// 
    /// \param TU The translation unit in which code-completion should
    /// occur. The source files for this translation unit need not be
    /// completely up-to-date (and the contents of those source files may
    /// be overridden via \p unsaved_files). Cursors referring into the
    /// translation unit may be invalidated by this invocation.
    /// 
    /// \param complete_filename The name of the source file where code
    /// completion should be performed. This filename may be any file
    /// included in the translation unit.
    /// 
    /// \param complete_line The line at which code-completion should occur.
    /// 
    /// \param complete_column The column at which code-completion should occur.
    /// Note that the column should point just after the syntactic construct that
    /// initiated code completion, and not in the middle of a lexical token.
    /// 
    /// \param unsaved_files the Files that have not yet been saved to disk
    /// but may be required for parsing or code completion, including the
    /// contents of those files.  The contents and name of these files (as
    /// specified by CXUnsavedFile) are copied when necessary, so the
    /// client only needs to guarantee their validity until the call to
    /// this function returns.
    /// 
    /// \param num_unsaved_files The number of unsaved file entries in \p
    /// unsaved_files.
    /// 
    /// \param options Extra options that control the behavior of code
    /// completion, expressed as a bitwise OR of the enumerators of the
    /// CXCodeComplete_Flags enumeration. The
    /// \c clang_defaultCodeCompleteOptions() function returns a default set
    /// of code-completion options.
    /// 
    /// \returns If successful, a new \c CXCodeCompleteResults structure
    /// containing code-completion results, which should eventually be
    /// freed with \c clang_disposeCodeCompleteResults(). If code
    /// completion fails, returns NULL.
    /// ```
    public static MemorySegment clang_codeCompleteAt(
    	MemorySegment TU,
    	MemorySegment complete_filename,
    	int complete_line,
    	int complete_column,
    	MemorySegment unsaved_files,
    	int num_unsaved_files,
    	int options
    ) {
    	MethodHandle method = CLANG_CODE_COMPLETE_AT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			TU,
    			complete_filename,
    			complete_line,
    			complete_column,
    			unsaved_files,
    			num_unsaved_files,
    			options
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_codeCompleteAt].
    public static @Nullable CXCodeCompleteResults clang_codeCompleteAt(
    	CXTranslationUnit TU,
    	String complete_filename,
    	int complete_line,
    	int complete_column,
    	NativeStructArray<CXUnsavedFile> unsaved_files,
    	int num_unsaved_files,
    	int options
    ) {
    	try (Arena arena = MemoryStack.stackPush()) {
    		MemorySegment segment = clang_codeCompleteAt(
    			TU.memorySegment(),
    			arena.allocateFrom(complete_filename),
    			complete_line,
    			complete_column,
    			unsaved_files.memorySegment(),
    			num_unsaved_files,
    			options
    		);
    
    		if (segment.equals(MemorySegment.NULL))
    			return null;
    		
    		return new CXCodeCompleteResults(segment);
    	}
    }
    
    /// ```
    /// 
    /// Sort the code-completion results in case-insensitive alphabetical
    /// order.
    /// 
    /// \param Results The set of results to sort.
    /// \param NumResults The number of results in \p Results.
    /// ```
    public static void clang_sortCodeCompletionResults(
    	MemorySegment Results,
    	int NumResults
    ) {
    	MethodHandle method = CLANG_SORT_CODE_COMPLETION_RESULTS.get();
    	try {
    		 method.invokeExact(
    			Results,
    			NumResults
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_sortCodeCompletionResults].
    public static void clang_sortCodeCompletionResults(
    	NativeStructArray<CXCompletionResult> Results,
    	int NumResults
    ) {
    	clang_sortCodeCompletionResults(
    		Results.memorySegment(),
    		NumResults
    	);
    }
    
    /// ```
    /// 
    /// Free the given set of code-completion results.
    /// ```
    public static void clang_disposeCodeCompleteResults(
    	MemorySegment Results
    ) {
    	MethodHandle method = CLANG_DISPOSE_CODE_COMPLETE_RESULTS.get();
    	try {
    		 method.invokeExact(
    			Results
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_disposeCodeCompleteResults].
    public static void clang_disposeCodeCompleteResults(
    	CXCodeCompleteResults Results
    ) {
    	clang_disposeCodeCompleteResults(
    		Results.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Determine the number of diagnostics produced prior to the
    /// location where code completion was performed.
    /// ```
    public static int clang_codeCompleteGetNumDiagnostics(
    	MemorySegment Results
    ) {
    	MethodHandle method = CLANG_CODE_COMPLETE_GET_NUM_DIAGNOSTICS.get();
    	try {
    		return (int) method.invokeExact(
    			Results
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_codeCompleteGetNumDiagnostics].
    public static int clang_codeCompleteGetNumDiagnostics(
    	CXCodeCompleteResults Results
    ) {
    	return clang_codeCompleteGetNumDiagnostics(
    		Results.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Retrieve a diagnostic associated with the given code completion.
    /// 
    /// \param Results the code completion results to query.
    /// \param Index the zero-based diagnostic number to retrieve.
    /// 
    /// \returns the requested diagnostic. This diagnostic must be freed
    /// via a call to \c clang_disposeDiagnostic().
    /// ```
    public static MemorySegment clang_codeCompleteGetDiagnostic(
    	MemorySegment Results,
    	int Index
    ) {
    	MethodHandle method = CLANG_CODE_COMPLETE_GET_DIAGNOSTIC.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			Results,
    			Index
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_codeCompleteGetDiagnostic].
    public static @Nullable MemorySegment clang_codeCompleteGetDiagnostic(
    	CXCodeCompleteResults Results,
    	int Index
    ) {
    	MemorySegment segment = clang_codeCompleteGetDiagnostic(
    		Results.memorySegment(),
    		Index
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// ```
    /// 
    /// Determines what completions are appropriate for the context
    /// the given code completion.
    /// 
    /// \param Results the code completion results to query
    /// 
    /// \returns the kinds of completions that are appropriate for use
    /// along with the given code completion results.
    /// ```
    public static long clang_codeCompleteGetContexts(
    	MemorySegment Results
    ) {
    	MethodHandle method = CLANG_CODE_COMPLETE_GET_CONTEXTS.get();
    	try {
    		return (long) method.invokeExact(
    			Results
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_codeCompleteGetContexts].
    public static long clang_codeCompleteGetContexts(
    	CXCodeCompleteResults Results
    ) {
    	return clang_codeCompleteGetContexts(
    		Results.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Returns the cursor kind for the container for the current code
    /// completion context. The container is only guaranteed to be set for
    /// contexts where a container exists (i.e. member accesses or Objective-C
    /// message sends); if there is not a container, this function will return
    /// CXCursor_InvalidCode.
    /// 
    /// \param Results the code completion results to query
    /// 
    /// \param IsIncomplete on return, this value will be false if Clang has complete
    /// information about the container. If Clang does not have complete
    /// information, this value will be true.
    /// 
    /// \returns the container kind, or CXCursor_InvalidCode if there is not a
    /// container
    /// ```
    public static int clang_codeCompleteGetContainerKind(
    	MemorySegment Results,
    	MemorySegment IsIncomplete
    ) {
    	MethodHandle method = CLANG_CODE_COMPLETE_GET_CONTAINER_KIND.get();
    	try {
    		return (int) method.invokeExact(
    			Results,
    			IsIncomplete
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_codeCompleteGetContainerKind].
    public static int clang_codeCompleteGetContainerKind(
    	CXCodeCompleteResults Results,
    	NativeIntArray IsIncomplete
    ) {
    	return clang_codeCompleteGetContainerKind(
    		Results.memorySegment(),
    		IsIncomplete.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Returns the USR for the container for the current code completion
    /// context. If there is not a container for the current context, this
    /// function will return the empty string.
    /// 
    /// \param Results the code completion results to query
    /// 
    /// \returns the USR for the container
    /// ```
    public static MemorySegment clang_codeCompleteGetContainerUSR(
    	SegmentAllocator allocator,
    	MemorySegment Results
    ) {
    	MethodHandle method = CLANG_CODE_COMPLETE_GET_CONTAINER_USR.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			Results
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_codeCompleteGetContainerUSR].
    public static @Nullable CXString clang_codeCompleteGetContainerUSR(
    	SegmentAllocator allocator,
    	CXCodeCompleteResults Results
    ) {
    	MemorySegment segment = clang_codeCompleteGetContainerUSR(
    		allocator,
    		Results.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXString(segment);
    }
    
    /// ```
    /// 
    /// Returns the currently-entered selector for an Objective-C message
    /// send, formatted like "initWithFoo:bar:". Only guaranteed to return a
    /// non-empty string for CXCompletionContext_ObjCInstanceMessage and
    /// CXCompletionContext_ObjCClassMessage.
    /// 
    /// \param Results the code completion results to query
    /// 
    /// \returns the selector (or partial selector) that has been entered thus far
    /// for an Objective-C message send.
    /// ```
    public static MemorySegment clang_codeCompleteGetObjCSelector(
    	SegmentAllocator allocator,
    	MemorySegment Results
    ) {
    	MethodHandle method = CLANG_CODE_COMPLETE_GET_OBJ_CSELECTOR.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			Results
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_codeCompleteGetObjCSelector].
    public static @Nullable CXString clang_codeCompleteGetObjCSelector(
    	SegmentAllocator allocator,
    	CXCodeCompleteResults Results
    ) {
    	MemorySegment segment = clang_codeCompleteGetObjCSelector(
    		allocator,
    		Results.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXString(segment);
    }
    
    /// ```
    /// 
    /// Return a version string, suitable for showing to a user, but not
    /// intended to be parsed (the format is not guaranteed to be stable).
    /// ```
    public static MemorySegment nclang_getClangVersion(
    	SegmentAllocator allocator
    ) {
    	MethodHandle method = CLANG_GET_CLANG_VERSION.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nclang_getClangVersion].
    public static @Nullable CXString clang_getClangVersion(
    	SegmentAllocator allocator
    ) {
    	MemorySegment segment = nclang_getClangVersion(
    		allocator
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXString(segment);
    }
    
    /// ```
    /// 
    /// Enable/disable crash recovery.
    /// 
    /// \param isEnabled Flag to indicate if crash recovery is enabled.  A non-zero
    /// value enables crash recovery, while 0 disables it.
    /// ```
    public static void clang_toggleCrashRecovery(
    	int isEnabled
    ) {
    	MethodHandle method = CLANG_TOGGLE_CRASH_RECOVERY.get();
    	try {
    		 method.invokeExact(
    			isEnabled
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// 
    /// Visit the set of preprocessor inclusions in a translation unit.
    /// The visitor function is called with the provided data for every included
    /// file.  This does not include headers included by the PCH file (unless one
    /// is inspecting the inclusions in the PCH file itself).
    /// ```
    public static void clang_getInclusions(
    	MemorySegment tu,
    	MemorySegment visitor,
    	MemorySegment client_data
    ) {
    	MethodHandle method = CLANG_GET_INCLUSIONS.get();
    	try {
    		 method.invokeExact(
    			tu,
    			visitor,
    			client_data
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_getInclusions].
    public static void clang_getInclusions(
    	CXTranslationUnit tu,
    	CXInclusionVisitor visitor,
    	MemorySegment client_data
    ) {
    	clang_getInclusions(
    		tu.memorySegment(),
    		visitor.memorySegment(),
    		client_data
    	);
    }
    
    /// ```
    /// 
    /// If cursor is a statement declaration tries to evaluate the
    /// statement and if its variable, tries to evaluate its initializer,
    /// into its corresponding type.
    /// If it's an expression, tries to evaluate the expression.
    /// ```
    public static MemorySegment clang_Cursor_Evaluate(
    	MemorySegment C
    ) {
    	MethodHandle method = CLANG_CURSOR_EVALUATE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			C
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_Cursor_Evaluate].
    public static @Nullable MemorySegment clang_Cursor_Evaluate(
    	CXCursor C
    ) {
    	MemorySegment segment = clang_Cursor_Evaluate(
    		C.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// ```
    /// 
    /// Returns the kind of the evaluated result.
    /// ```
    public static int clang_EvalResult_getKind(
    	MemorySegment E
    ) {
    	MethodHandle method = CLANG_EVAL_RESULT_GET_KIND.get();
    	try {
    		return (int) method.invokeExact(
    			E
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// 
    /// Returns the evaluation result as integer if the
    /// kind is Int.
    /// ```
    public static int clang_EvalResult_getAsInt(
    	MemorySegment E
    ) {
    	MethodHandle method = CLANG_EVAL_RESULT_GET_AS_INT.get();
    	try {
    		return (int) method.invokeExact(
    			E
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// 
    /// Returns the evaluation result as a long long integer if the
    /// kind is Int. This prevents overflows that may happen if the result is
    /// returned with clang_EvalResult_getAsInt.
    /// ```
    public static long clang_EvalResult_getAsLongLong(
    	MemorySegment E
    ) {
    	MethodHandle method = CLANG_EVAL_RESULT_GET_AS_LONG_LONG.get();
    	try {
    		return (long) method.invokeExact(
    			E
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// 
    /// Returns a non-zero value if the kind is Int and the evaluation
    /// result resulted in an unsigned integer.
    /// ```
    public static int clang_EvalResult_isUnsignedInt(
    	MemorySegment E
    ) {
    	MethodHandle method = CLANG_EVAL_RESULT_IS_UNSIGNED_INT.get();
    	try {
    		return (int) method.invokeExact(
    			E
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// 
    /// Returns the evaluation result as an unsigned integer if
    /// the kind is Int and clang_EvalResult_isUnsignedInt is non-zero.
    /// ```
    public static long clang_EvalResult_getAsUnsigned(
    	MemorySegment E
    ) {
    	MethodHandle method = CLANG_EVAL_RESULT_GET_AS_UNSIGNED.get();
    	try {
    		return (long) method.invokeExact(
    			E
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// 
    /// Returns the evaluation result as double if the
    /// kind is double.
    /// ```
    public static double clang_EvalResult_getAsDouble(
    	MemorySegment E
    ) {
    	MethodHandle method = CLANG_EVAL_RESULT_GET_AS_DOUBLE.get();
    	try {
    		return (double) method.invokeExact(
    			E
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// 
    /// Returns the evaluation result as a constant string if the
    /// kind is other than Int or float. User must not free this pointer,
    /// instead call clang_EvalResult_dispose on the CXEvalResult returned
    /// by clang_Cursor_Evaluate.
    /// ```
    public static MemorySegment nclang_EvalResult_getAsStr(
    	MemorySegment E
    ) {
    	MethodHandle method = CLANG_EVAL_RESULT_GET_AS_STR.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			E
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nclang_EvalResult_getAsStr].
    public static @Nullable String clang_EvalResult_getAsStr(
    	MemorySegment E
    ) {
    	MemorySegment segment = nclang_EvalResult_getAsStr(
    		E
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment.getString(0);
    }
    
    /// ```
    /// 
    /// Disposes the created Eval memory.
    /// ```
    public static void clang_EvalResult_dispose(
    	MemorySegment E
    ) {
    	MethodHandle method = CLANG_EVAL_RESULT_DISPOSE.get();
    	try {
    		 method.invokeExact(
    			E
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// 
    /// Find references of a declaration in a specific file.
    /// 
    /// \param cursor pointing to a declaration or a reference of one.
    /// 
    /// \param file to search for references.
    /// 
    /// \param visitor callback that will receive pairs of CXCursor/CXSourceRange for
    /// each reference found.
    /// The CXSourceRange will point inside the file; if the reference is inside
    /// a macro (and not a macro argument) the CXSourceRange will be invalid.
    /// 
    /// \returns one of the CXResult enumerators.
    /// ```
    public static int clang_findReferencesInFile(
    	MemorySegment cursor,
    	MemorySegment file,
    	MemorySegment visitor
    ) {
    	MethodHandle method = CLANG_FIND_REFERENCES_IN_FILE.get();
    	try {
    		return (int) method.invokeExact(
    			cursor,
    			file,
    			visitor
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_findReferencesInFile].
    public static int clang_findReferencesInFile(
    	CXCursor cursor,
    	MemorySegment file,
    	CXCursorAndRangeVisitor visitor
    ) {
    	return clang_findReferencesInFile(
    		cursor.memorySegment(),
    		file,
    		visitor.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Find #import/#include directives in a specific file.
    /// 
    /// \param TU translation unit containing the file to query.
    /// 
    /// \param file to search for #import/#include directives.
    /// 
    /// \param visitor callback that will receive pairs of CXCursor/CXSourceRange for
    /// each directive found.
    /// 
    /// \returns one of the CXResult enumerators.
    /// ```
    public static int clang_findIncludesInFile(
    	MemorySegment TU,
    	MemorySegment file,
    	MemorySegment visitor
    ) {
    	MethodHandle method = CLANG_FIND_INCLUDES_IN_FILE.get();
    	try {
    		return (int) method.invokeExact(
    			TU,
    			file,
    			visitor
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_findIncludesInFile].
    public static int clang_findIncludesInFile(
    	CXTranslationUnit TU,
    	MemorySegment file,
    	CXCursorAndRangeVisitor visitor
    ) {
    	return clang_findIncludesInFile(
    		TU.memorySegment(),
    		file,
    		visitor.memorySegment()
    	);
    }
    
    public static int clang_index_isEntityObjCContainerKind(
    	int param0
    ) {
    	MethodHandle method = CLANG_INDEX_IS_ENTITY_OBJ_CCONTAINER_KIND.get();
    	try {
    		return (int) method.invokeExact(
    			param0
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment clang_index_getObjCContainerDeclInfo(
    	MemorySegment param0
    ) {
    	MethodHandle method = CLANG_INDEX_GET_OBJ_CCONTAINER_DECL_INFO.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			param0
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_index_getObjCContainerDeclInfo].
    public static @Nullable CXIdxObjCContainerDeclInfo clang_index_getObjCContainerDeclInfo(
    	CXIdxDeclInfo param0
    ) {
    	MemorySegment segment = clang_index_getObjCContainerDeclInfo(
    		param0.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXIdxObjCContainerDeclInfo(segment);
    }
    
    public static MemorySegment clang_index_getObjCInterfaceDeclInfo(
    	MemorySegment param0
    ) {
    	MethodHandle method = CLANG_INDEX_GET_OBJ_CINTERFACE_DECL_INFO.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			param0
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_index_getObjCInterfaceDeclInfo].
    public static @Nullable CXIdxObjCInterfaceDeclInfo clang_index_getObjCInterfaceDeclInfo(
    	CXIdxDeclInfo param0
    ) {
    	MemorySegment segment = clang_index_getObjCInterfaceDeclInfo(
    		param0.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXIdxObjCInterfaceDeclInfo(segment);
    }
    
    public static MemorySegment clang_index_getObjCCategoryDeclInfo(
    	MemorySegment param0
    ) {
    	MethodHandle method = CLANG_INDEX_GET_OBJ_CCATEGORY_DECL_INFO.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			param0
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_index_getObjCCategoryDeclInfo].
    public static @Nullable CXIdxObjCCategoryDeclInfo clang_index_getObjCCategoryDeclInfo(
    	CXIdxDeclInfo param0
    ) {
    	MemorySegment segment = clang_index_getObjCCategoryDeclInfo(
    		param0.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXIdxObjCCategoryDeclInfo(segment);
    }
    
    public static MemorySegment clang_index_getObjCProtocolRefListInfo(
    	MemorySegment param0
    ) {
    	MethodHandle method = CLANG_INDEX_GET_OBJ_CPROTOCOL_REF_LIST_INFO.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			param0
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_index_getObjCProtocolRefListInfo].
    public static @Nullable CXIdxObjCProtocolRefListInfo clang_index_getObjCProtocolRefListInfo(
    	CXIdxDeclInfo param0
    ) {
    	MemorySegment segment = clang_index_getObjCProtocolRefListInfo(
    		param0.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXIdxObjCProtocolRefListInfo(segment);
    }
    
    public static MemorySegment clang_index_getObjCPropertyDeclInfo(
    	MemorySegment param0
    ) {
    	MethodHandle method = CLANG_INDEX_GET_OBJ_CPROPERTY_DECL_INFO.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			param0
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_index_getObjCPropertyDeclInfo].
    public static @Nullable CXIdxObjCPropertyDeclInfo clang_index_getObjCPropertyDeclInfo(
    	CXIdxDeclInfo param0
    ) {
    	MemorySegment segment = clang_index_getObjCPropertyDeclInfo(
    		param0.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXIdxObjCPropertyDeclInfo(segment);
    }
    
    public static MemorySegment clang_index_getIBOutletCollectionAttrInfo(
    	MemorySegment param0
    ) {
    	MethodHandle method = CLANG_INDEX_GET_IBOUTLET_COLLECTION_ATTR_INFO.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			param0
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_index_getIBOutletCollectionAttrInfo].
    public static @Nullable CXIdxIBOutletCollectionAttrInfo clang_index_getIBOutletCollectionAttrInfo(
    	CXIdxAttrInfo param0
    ) {
    	MemorySegment segment = clang_index_getIBOutletCollectionAttrInfo(
    		param0.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXIdxIBOutletCollectionAttrInfo(segment);
    }
    
    public static MemorySegment clang_index_getCXXClassDeclInfo(
    	MemorySegment param0
    ) {
    	MethodHandle method = CLANG_INDEX_GET_CXXCLASS_DECL_INFO.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			param0
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_index_getCXXClassDeclInfo].
    public static @Nullable CXIdxCXXClassDeclInfo clang_index_getCXXClassDeclInfo(
    	CXIdxDeclInfo param0
    ) {
    	MemorySegment segment = clang_index_getCXXClassDeclInfo(
    		param0.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXIdxCXXClassDeclInfo(segment);
    }
    
    /// ```
    /// 
    /// For retrieving a custom CXIdxClientContainer attached to a
    /// container.
    /// ```
    public static MemorySegment clang_index_getClientContainer(
    	MemorySegment param0
    ) {
    	MethodHandle method = CLANG_INDEX_GET_CLIENT_CONTAINER.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			param0
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_index_getClientContainer].
    public static @Nullable MemorySegment clang_index_getClientContainer(
    	CXIdxContainerInfo param0
    ) {
    	MemorySegment segment = clang_index_getClientContainer(
    		param0.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// ```
    /// 
    /// For setting a custom CXIdxClientContainer attached to a
    /// container.
    /// ```
    public static void clang_index_setClientContainer(
    	MemorySegment param0,
    	MemorySegment param1
    ) {
    	MethodHandle method = CLANG_INDEX_SET_CLIENT_CONTAINER.get();
    	try {
    		 method.invokeExact(
    			param0,
    			param1
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_index_setClientContainer].
    public static void clang_index_setClientContainer(
    	CXIdxContainerInfo param0,
    	MemorySegment param1
    ) {
    	clang_index_setClientContainer(
    		param0.memorySegment(),
    		param1
    	);
    }
    
    /// ```
    /// 
    /// For retrieving a custom CXIdxClientEntity attached to an entity.
    /// ```
    public static MemorySegment clang_index_getClientEntity(
    	MemorySegment param0
    ) {
    	MethodHandle method = CLANG_INDEX_GET_CLIENT_ENTITY.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			param0
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_index_getClientEntity].
    public static @Nullable MemorySegment clang_index_getClientEntity(
    	CXIdxEntityInfo param0
    ) {
    	MemorySegment segment = clang_index_getClientEntity(
    		param0.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// ```
    /// 
    /// For setting a custom CXIdxClientEntity attached to an entity.
    /// ```
    public static void clang_index_setClientEntity(
    	MemorySegment param0,
    	MemorySegment param1
    ) {
    	MethodHandle method = CLANG_INDEX_SET_CLIENT_ENTITY.get();
    	try {
    		 method.invokeExact(
    			param0,
    			param1
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_index_setClientEntity].
    public static void clang_index_setClientEntity(
    	CXIdxEntityInfo param0,
    	MemorySegment param1
    ) {
    	clang_index_setClientEntity(
    		param0.memorySegment(),
    		param1
    	);
    }
    
    /// ```
    /// 
    /// An indexing action/session, to be applied to one or multiple
    /// translation units.
    /// 
    /// \param CIdx The index object with which the index action will be associated.
    /// ```
    public static MemorySegment clang_IndexAction_create(
    	MemorySegment CIdx
    ) {
    	MethodHandle method = CLANG_INDEX_ACTION_CREATE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			CIdx
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// 
    /// Destroy the given index action.
    /// 
    /// The index action must not be destroyed until all of the translation units
    /// created within that index action have been destroyed.
    /// ```
    public static void clang_IndexAction_dispose(
    	MemorySegment param0
    ) {
    	MethodHandle method = CLANG_INDEX_ACTION_DISPOSE.get();
    	try {
    		 method.invokeExact(
    			param0
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// 
    /// Index the given source file and the translation unit corresponding
    /// to that file via callbacks implemented through #IndexerCallbacks.
    /// 
    /// \param client_data pointer data supplied by the client, which will
    /// be passed to the invoked callbacks.
    /// 
    /// \param index_callbacks Pointer to indexing callbacks that the client
    /// implements.
    /// 
    /// \param index_callbacks_size Size of #IndexerCallbacks structure that gets
    /// passed in index_callbacks.
    /// 
    /// \param index_options A bitmask of options that affects how indexing is
    /// performed. This should be a bitwise OR of the CXIndexOpt_XXX flags.
    /// 
    /// \param[out] out_TU pointer to store a \c CXTranslationUnit that can be
    /// reused after indexing is finished. Set to \c NULL if you do not require it.
    /// 
    /// \returns 0 on success or if there were errors from which the compiler could
    /// recover.  If there is a failure from which there is no recovery, returns
    /// a non-zero \c CXErrorCode.
    /// 
    /// The rest of the parameters are the same as #clang_parseTranslationUnit.
    /// ```
    public static int clang_indexSourceFile(
    	MemorySegment param0,
    	MemorySegment client_data,
    	MemorySegment index_callbacks,
    	int index_callbacks_size,
    	int index_options,
    	MemorySegment source_filename,
    	MemorySegment command_line_args,
    	int num_command_line_args,
    	MemorySegment unsaved_files,
    	int num_unsaved_files,
    	MemorySegment out_TU,
    	int TU_options
    ) {
    	MethodHandle method = CLANG_INDEX_SOURCE_FILE.get();
    	try {
    		return (int) method.invokeExact(
    			param0,
    			client_data,
    			index_callbacks,
    			index_callbacks_size,
    			index_options,
    			source_filename,
    			command_line_args,
    			num_command_line_args,
    			unsaved_files,
    			num_unsaved_files,
    			out_TU,
    			TU_options
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_indexSourceFile].
    public static int clang_indexSourceFile(
    	MemorySegment param0,
    	MemorySegment client_data,
    	IndexerCallbacks index_callbacks,
    	int index_callbacks_size,
    	int index_options,
    	String source_filename,
    	@Nullable NativePointerArray command_line_args,
    	int num_command_line_args,
    	@Nullable NativeStructArray<CXUnsavedFile> unsaved_files,
    	int num_unsaved_files,
    	NativePointerArray out_TU,
    	int TU_options
    ) {
    	try (Arena arena = MemoryStack.stackPush()) {
    		return clang_indexSourceFile(
    			param0,
    			client_data,
    			index_callbacks.memorySegment(),
    			index_callbacks_size,
    			index_options,
    			arena.allocateFrom(source_filename),
    			command_line_args == null ? MemorySegment.NULL : command_line_args.memorySegment(),
    			num_command_line_args,
    			unsaved_files == null ? MemorySegment.NULL : unsaved_files.memorySegment(),
    			num_unsaved_files,
    			out_TU.memorySegment(),
    			TU_options
    		);
    	}
    }
    
    /// ```
    /// 
    /// Same as clang_indexSourceFile but requires a full command line
    /// for \c command_line_args including argv[0]. This is useful if the standard
    /// library paths are relative to the binary.
    /// ```
    public static int clang_indexSourceFileFullArgv(
    	MemorySegment param0,
    	MemorySegment client_data,
    	MemorySegment index_callbacks,
    	int index_callbacks_size,
    	int index_options,
    	MemorySegment source_filename,
    	MemorySegment command_line_args,
    	int num_command_line_args,
    	MemorySegment unsaved_files,
    	int num_unsaved_files,
    	MemorySegment out_TU,
    	int TU_options
    ) {
    	MethodHandle method = CLANG_INDEX_SOURCE_FILE_FULL_ARGV.get();
    	try {
    		return (int) method.invokeExact(
    			param0,
    			client_data,
    			index_callbacks,
    			index_callbacks_size,
    			index_options,
    			source_filename,
    			command_line_args,
    			num_command_line_args,
    			unsaved_files,
    			num_unsaved_files,
    			out_TU,
    			TU_options
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_indexSourceFileFullArgv].
    public static int clang_indexSourceFileFullArgv(
    	MemorySegment param0,
    	MemorySegment client_data,
    	IndexerCallbacks index_callbacks,
    	int index_callbacks_size,
    	int index_options,
    	String source_filename,
    	@Nullable NativePointerArray command_line_args,
    	int num_command_line_args,
    	@Nullable NativeStructArray<CXUnsavedFile> unsaved_files,
    	int num_unsaved_files,
    	NativePointerArray out_TU,
    	int TU_options
    ) {
    	try (Arena arena = MemoryStack.stackPush()) {
    		return clang_indexSourceFileFullArgv(
    			param0,
    			client_data,
    			index_callbacks.memorySegment(),
    			index_callbacks_size,
    			index_options,
    			arena.allocateFrom(source_filename),
    			command_line_args == null ? MemorySegment.NULL : command_line_args.memorySegment(),
    			num_command_line_args,
    			unsaved_files == null ? MemorySegment.NULL : unsaved_files.memorySegment(),
    			num_unsaved_files,
    			out_TU.memorySegment(),
    			TU_options
    		);
    	}
    }
    
    /// ```
    /// 
    /// Index the given translation unit via callbacks implemented through
    /// #IndexerCallbacks.
    /// 
    /// The order of callback invocations is not guaranteed to be the same as
    /// when indexing a source file. The high level order will be:
    /// 
    /// -Preprocessor callbacks invocations
    /// -Declaration/reference callbacks invocations
    /// -Diagnostic callback invocations
    /// 
    /// The parameters are the same as #clang_indexSourceFile.
    /// 
    /// \returns If there is a failure from which there is no recovery, returns
    /// non-zero, otherwise returns 0.
    /// ```
    public static int clang_indexTranslationUnit(
    	MemorySegment param0,
    	MemorySegment client_data,
    	MemorySegment index_callbacks,
    	int index_callbacks_size,
    	int index_options,
    	MemorySegment param5
    ) {
    	MethodHandle method = CLANG_INDEX_TRANSLATION_UNIT.get();
    	try {
    		return (int) method.invokeExact(
    			param0,
    			client_data,
    			index_callbacks,
    			index_callbacks_size,
    			index_options,
    			param5
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_indexTranslationUnit].
    public static int clang_indexTranslationUnit(
    	MemorySegment param0,
    	MemorySegment client_data,
    	IndexerCallbacks index_callbacks,
    	int index_callbacks_size,
    	int index_options,
    	CXTranslationUnit param5
    ) {
    	return clang_indexTranslationUnit(
    		param0,
    		client_data,
    		index_callbacks.memorySegment(),
    		index_callbacks_size,
    		index_options,
    		param5.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Retrieve the CXIdxFile, file, line, column, and offset represented by
    /// the given CXIdxLoc.
    /// 
    /// If the location refers into a macro expansion, retrieves the
    /// location of the macro expansion and if it refers into a macro argument
    /// retrieves the location of the argument.
    /// ```
    public static void clang_indexLoc_getFileLocation(
    	MemorySegment loc,
    	MemorySegment indexFile,
    	MemorySegment file,
    	MemorySegment line,
    	MemorySegment column,
    	MemorySegment offset
    ) {
    	MethodHandle method = CLANG_INDEX_LOC_GET_FILE_LOCATION.get();
    	try {
    		 method.invokeExact(
    			loc,
    			indexFile,
    			file,
    			line,
    			column,
    			offset
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_indexLoc_getFileLocation].
    public static void clang_indexLoc_getFileLocation(
    	CXIdxLoc loc,
    	NativePointerArray indexFile,
    	NativePointerArray file,
    	NativeIntArray line,
    	NativeIntArray column,
    	NativeIntArray offset
    ) {
    	clang_indexLoc_getFileLocation(
    		loc.memorySegment(),
    		indexFile.memorySegment(),
    		file.memorySegment(),
    		line.memorySegment(),
    		column.memorySegment(),
    		offset.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Retrieve the CXSourceLocation represented by the given CXIdxLoc.
    /// ```
    public static MemorySegment clang_indexLoc_getCXSourceLocation(
    	SegmentAllocator allocator,
    	MemorySegment loc
    ) {
    	MethodHandle method = CLANG_INDEX_LOC_GET_CXSOURCE_LOCATION.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			loc
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_indexLoc_getCXSourceLocation].
    public static @Nullable CXSourceLocation clang_indexLoc_getCXSourceLocation(
    	SegmentAllocator allocator,
    	CXIdxLoc loc
    ) {
    	MemorySegment segment = clang_indexLoc_getCXSourceLocation(
    		allocator,
    		loc.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXSourceLocation(segment);
    }
    
    /// ```
    /// 
    /// Visit the fields of a particular type.
    /// 
    /// This function visits all the direct fields of the given cursor,
    /// invoking the given \p visitor function with the cursors of each
    /// visited field. The traversal may be ended prematurely, if
    /// the visitor returns \c CXFieldVisit_Break.
    /// 
    /// \param T the record type whose field may be visited.
    /// 
    /// \param visitor the visitor function that will be invoked for each
    /// field of \p T.
    /// 
    /// \param client_data pointer data supplied by the client, which will
    /// be passed to the visitor each time it is invoked.
    /// 
    /// \returns a non-zero value if the traversal was terminated
    /// prematurely by the visitor returning \c CXFieldVisit_Break.
    /// ```
    public static int clang_Type_visitFields(
    	MemorySegment T,
    	MemorySegment visitor,
    	MemorySegment client_data
    ) {
    	MethodHandle method = CLANG_TYPE_VISIT_FIELDS.get();
    	try {
    		return (int) method.invokeExact(
    			T,
    			visitor,
    			client_data
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_Type_visitFields].
    public static int clang_Type_visitFields(
    	CXType T,
    	CXFieldVisitor visitor,
    	MemorySegment client_data
    ) {
    	return clang_Type_visitFields(
    		T.memorySegment(),
    		visitor.memorySegment(),
    		client_data
    	);
    }
    
    /// ```
    /// 
    /// Visit the base classes of a type.
    /// 
    /// This function visits all the direct base classes of a the given cursor,
    /// invoking the given \p visitor function with the cursors of each
    /// visited base. The traversal may be ended prematurely, if
    /// the visitor returns \c CXFieldVisit_Break.
    /// 
    /// \param T the record type whose field may be visited.
    /// 
    /// \param visitor the visitor function that will be invoked for each
    /// field of \p T.
    /// 
    /// \param client_data pointer data supplied by the client, which will
    /// be passed to the visitor each time it is invoked.
    /// 
    /// \returns a non-zero value if the traversal was terminated
    /// prematurely by the visitor returning \c CXFieldVisit_Break.
    /// ```
    public static int clang_visitCXXBaseClasses(
    	MemorySegment T,
    	MemorySegment visitor,
    	MemorySegment client_data
    ) {
    	MethodHandle method = CLANG_VISIT_CXXBASE_CLASSES.get();
    	try {
    		return (int) method.invokeExact(
    			T,
    			visitor,
    			client_data
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_visitCXXBaseClasses].
    public static int clang_visitCXXBaseClasses(
    	CXType T,
    	CXFieldVisitor visitor,
    	MemorySegment client_data
    ) {
    	return clang_visitCXXBaseClasses(
    		T.memorySegment(),
    		visitor.memorySegment(),
    		client_data
    	);
    }
    
    /// ```
    /// 
    /// Visit the class methods of a type.
    /// 
    /// This function visits all the methods of the given cursor,
    /// invoking the given \p visitor function with the cursors of each
    /// visited method. The traversal may be ended prematurely, if
    /// the visitor returns \c CXFieldVisit_Break.
    /// 
    /// \param T The record type whose field may be visited.
    /// 
    /// \param visitor The visitor function that will be invoked for each
    /// field of \p T.
    /// 
    /// \param client_data Pointer data supplied by the client, which will
    /// be passed to the visitor each time it is invoked.
    /// 
    /// \returns A non-zero value if the traversal was terminated
    /// prematurely by the visitor returning \c CXFieldVisit_Break.
    /// ```
    public static int clang_visitCXXMethods(
    	MemorySegment T,
    	MemorySegment visitor,
    	MemorySegment client_data
    ) {
    	MethodHandle method = CLANG_VISIT_CXXMETHODS.get();
    	try {
    		return (int) method.invokeExact(
    			T,
    			visitor,
    			client_data
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_visitCXXMethods].
    public static int clang_visitCXXMethods(
    	CXType T,
    	CXFieldVisitor visitor,
    	MemorySegment client_data
    ) {
    	return clang_visitCXXMethods(
    		T.memorySegment(),
    		visitor.memorySegment(),
    		client_data
    	);
    }
    
    /// ```
    /// 
    /// Retrieve the spelling of a given CXBinaryOperatorKind.
    /// ```
    public static MemorySegment nclang_getBinaryOperatorKindSpelling(
    	SegmentAllocator allocator,
    	int kind
    ) {
    	MethodHandle method = CLANG_GET_BINARY_OPERATOR_KIND_SPELLING.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			kind
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nclang_getBinaryOperatorKindSpelling].
    public static @Nullable CXString clang_getBinaryOperatorKindSpelling(
    	SegmentAllocator allocator,
    	int kind
    ) {
    	MemorySegment segment = nclang_getBinaryOperatorKindSpelling(
    		allocator,
    		kind
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXString(segment);
    }
    
    /// ```
    /// 
    /// Retrieve the binary operator kind of this cursor.
    /// 
    /// If this cursor is not a binary operator then returns Invalid.
    /// ```
    public static int clang_getCursorBinaryOperatorKind(
    	MemorySegment cursor
    ) {
    	MethodHandle method = CLANG_GET_CURSOR_BINARY_OPERATOR_KIND.get();
    	try {
    		return (int) method.invokeExact(
    			cursor
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_getCursorBinaryOperatorKind].
    public static int clang_getCursorBinaryOperatorKind(
    	CXCursor cursor
    ) {
    	return clang_getCursorBinaryOperatorKind(
    		cursor.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Retrieve the spelling of a given CXUnaryOperatorKind.
    /// ```
    public static MemorySegment nclang_getUnaryOperatorKindSpelling(
    	SegmentAllocator allocator,
    	int kind
    ) {
    	MethodHandle method = CLANG_GET_UNARY_OPERATOR_KIND_SPELLING.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			kind
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nclang_getUnaryOperatorKindSpelling].
    public static @Nullable CXString clang_getUnaryOperatorKindSpelling(
    	SegmentAllocator allocator,
    	int kind
    ) {
    	MemorySegment segment = nclang_getUnaryOperatorKindSpelling(
    		allocator,
    		kind
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXString(segment);
    }
    
    /// ```
    /// 
    /// Retrieve the unary operator kind of this cursor.
    /// 
    /// If this cursor is not a unary operator then returns Invalid.
    /// ```
    public static int clang_getCursorUnaryOperatorKind(
    	MemorySegment cursor
    ) {
    	MethodHandle method = CLANG_GET_CURSOR_UNARY_OPERATOR_KIND.get();
    	try {
    		return (int) method.invokeExact(
    			cursor
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_getCursorUnaryOperatorKind].
    public static int clang_getCursorUnaryOperatorKind(
    	CXCursor cursor
    ) {
    	return clang_getCursorUnaryOperatorKind(
    		cursor.memorySegment()
    	);
    }
    
    public static MemorySegment clang_getRemappings(
    	MemorySegment param0
    ) {
    	MethodHandle method = CLANG_GET_REMAPPINGS.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			param0
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_getRemappings].
    public static @Nullable MemorySegment clang_getRemappings(
    	NativeByteArray param0
    ) {
    	MemorySegment segment = clang_getRemappings(
    		param0.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    public static MemorySegment clang_getRemappingsFromFileList(
    	MemorySegment param0,
    	int param1
    ) {
    	MethodHandle method = CLANG_GET_REMAPPINGS_FROM_FILE_LIST.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			param0,
    			param1
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_getRemappingsFromFileList].
    public static @Nullable MemorySegment clang_getRemappingsFromFileList(
    	NativePointerArray param0,
    	int param1
    ) {
    	MemorySegment segment = clang_getRemappingsFromFileList(
    		param0.memorySegment(),
    		param1
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    public static int clang_remap_getNumFiles(
    	MemorySegment param0
    ) {
    	MethodHandle method = CLANG_REMAP_GET_NUM_FILES.get();
    	try {
    		return (int) method.invokeExact(
    			param0
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void clang_remap_getFilenames(
    	MemorySegment param0,
    	int param1,
    	MemorySegment param2,
    	MemorySegment param3
    ) {
    	MethodHandle method = CLANG_REMAP_GET_FILENAMES.get();
    	try {
    		 method.invokeExact(
    			param0,
    			param1,
    			param2,
    			param3
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clang_remap_getFilenames].
    public static void clang_remap_getFilenames(
    	MemorySegment param0,
    	int param1,
    	CXString param2,
    	CXString param3
    ) {
    	clang_remap_getFilenames(
    		param0,
    		param1,
    		param2.memorySegment(),
    		param3.memorySegment()
    	);
    }
    
    public static void clang_remap_dispose(
    	MemorySegment param0
    ) {
    	MethodHandle method = CLANG_REMAP_DISPOSE.get();
    	try {
    		 method.invokeExact(
    			param0
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }

}