/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.libclang.enums;

public final class CXCursorKind {

    /// ```
    /// 
    /// A declaration whose specific kind is not exposed via this
    /// interface.
    /// 
    /// Unexposed declarations have the same operations as any other kind
    /// of declaration; one can extract their location information,
    /// spelling, find their definitions, etc. However, the specific kind
    /// of the declaration is not reported.
    /// ```
    public static final int CX_CURSOR_UNEXPOSED_DECL = 1;
    /// ```
    /// A C or C++ struct.
    /// ```
    public static final int CX_CURSOR_STRUCT_DECL = 2;
    /// ```
    /// A C or C++ union.
    /// ```
    public static final int CX_CURSOR_UNION_DECL = 3;
    /// ```
    /// A C++ class.
    /// ```
    public static final int CX_CURSOR_CLASS_DECL = 4;
    /// ```
    /// An enumeration.
    /// ```
    public static final int CX_CURSOR_ENUM_DECL = 5;
    /// ```
    /// 
    /// A field (in C) or non-static data member (in C++) in a
    /// struct, union, or C++ class.
    /// ```
    public static final int CX_CURSOR_FIELD_DECL = 6;
    /// ```
    /// An enumerator constant.
    /// ```
    public static final int CX_CURSOR_ENUM_CONSTANT_DECL = 7;
    /// ```
    /// A function.
    /// ```
    public static final int CX_CURSOR_FUNCTION_DECL = 8;
    /// ```
    /// A variable.
    /// ```
    public static final int CX_CURSOR_VAR_DECL = 9;
    /// ```
    /// A function or method parameter.
    /// ```
    public static final int CX_CURSOR_PARM_DECL = 10;
    /// ```
    /// An Objective-C \@interface.
    /// ```
    public static final int CX_CURSOR_OBJ_C_INTERFACE_DECL = 11;
    /// ```
    /// An Objective-C \@interface for a category.
    /// ```
    public static final int CX_CURSOR_OBJ_C_CATEGORY_DECL = 12;
    /// ```
    /// An Objective-C \@protocol declaration.
    /// ```
    public static final int CX_CURSOR_OBJ_C_PROTOCOL_DECL = 13;
    /// ```
    /// An Objective-C \@property declaration.
    /// ```
    public static final int CX_CURSOR_OBJ_C_PROPERTY_DECL = 14;
    /// ```
    /// An Objective-C instance variable.
    /// ```
    public static final int CX_CURSOR_OBJ_C_IVAR_DECL = 15;
    /// ```
    /// An Objective-C instance method.
    /// ```
    public static final int CX_CURSOR_OBJ_C_INSTANCE_METHOD_DECL = 16;
    /// ```
    /// An Objective-C class method.
    /// ```
    public static final int CX_CURSOR_OBJ_C_CLASS_METHOD_DECL = 17;
    /// ```
    /// An Objective-C \@implementation.
    /// ```
    public static final int CX_CURSOR_OBJ_C_IMPLEMENTATION_DECL = 18;
    /// ```
    /// An Objective-C \@implementation for a category.
    /// ```
    public static final int CX_CURSOR_OBJ_C_CATEGORY_IMPL_DECL = 19;
    /// ```
    /// A typedef.
    /// ```
    public static final int CX_CURSOR_TYPEDEF_DECL = 20;
    /// ```
    /// A C++ class method.
    /// ```
    public static final int CX_CURSOR_CXX_METHOD = 21;
    /// ```
    /// A C++ namespace.
    /// ```
    public static final int CX_CURSOR_NAMESPACE = 22;
    /// ```
    /// A linkage specification, e.g. 'extern "C"'.
    /// ```
    public static final int CX_CURSOR_LINKAGE_SPEC = 23;
    /// ```
    /// A C++ constructor.
    /// ```
    public static final int CX_CURSOR_CONSTRUCTOR = 24;
    /// ```
    /// A C++ destructor.
    /// ```
    public static final int CX_CURSOR_DESTRUCTOR = 25;
    /// ```
    /// A C++ conversion function.
    /// ```
    public static final int CX_CURSOR_CONVERSION_FUNCTION = 26;
    /// ```
    /// A C++ template type parameter.
    /// ```
    public static final int CX_CURSOR_TEMPLATE_TYPE_PARAMETER = 27;
    /// ```
    /// A C++ non-type template parameter.
    /// ```
    public static final int CX_CURSOR_NON_TYPE_TEMPLATE_PARAMETER = 28;
    /// ```
    /// A C++ template template parameter.
    /// ```
    public static final int CX_CURSOR_TEMPLATE_TEMPLATE_PARAMETER = 29;
    /// ```
    /// A C++ function template.
    /// ```
    public static final int CX_CURSOR_FUNCTION_TEMPLATE = 30;
    /// ```
    /// A C++ class template.
    /// ```
    public static final int CX_CURSOR_CLASS_TEMPLATE = 31;
    /// ```
    /// A C++ class template partial specialization.
    /// ```
    public static final int CX_CURSOR_CLASS_TEMPLATE_PARTIAL_SPECIALIZATION = 32;
    /// ```
    /// A C++ namespace alias declaration.
    /// ```
    public static final int CX_CURSOR_NAMESPACE_ALIAS = 33;
    /// ```
    /// A C++ using directive.
    /// ```
    public static final int CX_CURSOR_USING_DIRECTIVE = 34;
    /// ```
    /// A C++ using declaration.
    /// ```
    public static final int CX_CURSOR_USING_DECLARATION = 35;
    /// ```
    /// A C++ alias declaration
    /// ```
    public static final int CX_CURSOR_TYPE_ALIAS_DECL = 36;
    /// ```
    /// An Objective-C \@synthesize definition.
    /// ```
    public static final int CX_CURSOR_OBJ_C_SYNTHESIZE_DECL = 37;
    /// ```
    /// An Objective-C \@dynamic definition.
    /// ```
    public static final int CX_CURSOR_OBJ_C_DYNAMIC_DECL = 38;
    /// ```
    /// An access specifier.
    /// ```
    public static final int CX_CURSOR_CXX_ACCESS_SPECIFIER = 39;
    public static final int CX_CURSOR_FIRST_DECL = 1;
    public static final int CX_CURSOR_LAST_DECL = 39;
    public static final int CX_CURSOR_FIRST_REF = 40;
    public static final int CX_CURSOR_OBJ_C_SUPER_CLASS_REF = 40;
    public static final int CX_CURSOR_OBJ_C_PROTOCOL_REF = 41;
    public static final int CX_CURSOR_OBJ_C_CLASS_REF = 42;
    /// ```
    /// 
    /// A reference to a type declaration.
    /// 
    /// A type reference occurs anywhere where a type is named but not
    /// declared. For example, given:
    /// 
    /// \code
    /// typedef unsigned size_type;
    /// size_type size;
    /// \endcode
    /// 
    /// The typedef is a declaration of size_type (CXCursor_TypedefDecl),
    /// while the type of the variable "size" is referenced. The cursor
    /// referenced by the type of size is the typedef for size_type.
    /// ```
    public static final int CX_CURSOR_TYPE_REF = 43;
    public static final int CX_CURSOR_CXX_BASE_SPECIFIER = 44;
    /// ```
    /// 
    /// A reference to a class template, function template, template
    /// template parameter, or class template partial specialization.
    /// ```
    public static final int CX_CURSOR_TEMPLATE_REF = 45;
    /// ```
    /// 
    /// A reference to a namespace or namespace alias.
    /// ```
    public static final int CX_CURSOR_NAMESPACE_REF = 46;
    /// ```
    /// 
    /// A reference to a member of a struct, union, or class that occurs in
    /// some non-expression context, e.g., a designated initializer.
    /// ```
    public static final int CX_CURSOR_MEMBER_REF = 47;
    /// ```
    /// 
    /// A reference to a labeled statement.
    /// 
    /// This cursor kind is used to describe the jump to "start_over" in the
    /// goto statement in the following example:
    /// 
    /// \code
    /// start_over:
    /// ++counter;
    /// 
    /// goto start_over;
    /// \endcode
    /// 
    /// A label reference cursor refers to a label statement.
    /// ```
    public static final int CX_CURSOR_LABEL_REF = 48;
    /// ```
    /// 
    /// A reference to a set of overloaded functions or function templates
    /// that has not yet been resolved to a specific function or function template.
    /// 
    /// An overloaded declaration reference cursor occurs in C++ templates where
    /// a dependent name refers to a function. For example:
    /// 
    /// \code
    /// template<typename T> void swap(T&, T&);
    /// 
    /// struct X { ... };
    /// void swap(X&, X&);
    /// 
    /// template<typename T>
    /// void reverse(T* first, T* last) {
    /// while (first < last - 1) {
    /// swap(*first, *--last);
    /// ++first;
    /// }
    /// }
    /// 
    /// struct Y { };
    /// void swap(Y&, Y&);
    /// \endcode
    /// 
    /// Here, the identifier "swap" is associated with an overloaded declaration
    /// reference. In the template definition, "swap" refers to either of the two
    /// "swap" functions declared above, so both results will be available. At
    /// instantiation time, "swap" may also refer to other functions found via
    /// argument-dependent lookup (e.g., the "swap" function at the end of the
    /// example).
    /// 
    /// The functions \c clang_getNumOverloadedDecls() and
    /// \c clang_getOverloadedDecl() can be used to retrieve the definitions
    /// referenced by this cursor.
    /// ```
    public static final int CX_CURSOR_OVERLOADED_DECL_REF = 49;
    /// ```
    /// 
    /// A reference to a variable that occurs in some non-expression
    /// context, e.g., a C++ lambda capture list.
    /// ```
    public static final int CX_CURSOR_VARIABLE_REF = 50;
    public static final int CX_CURSOR_LAST_REF = 50;
    public static final int CX_CURSOR_FIRST_INVALID = 70;
    public static final int CX_CURSOR_INVALID_FILE = 70;
    public static final int CX_CURSOR_NO_DECL_FOUND = 71;
    public static final int CX_CURSOR_NOT_IMPLEMENTED = 72;
    public static final int CX_CURSOR_INVALID_CODE = 73;
    public static final int CX_CURSOR_LAST_INVALID = 73;
    public static final int CX_CURSOR_FIRST_EXPR = 100;
    /// ```
    /// 
    /// An expression whose specific kind is not exposed via this
    /// interface.
    /// 
    /// Unexposed expressions have the same operations as any other kind
    /// of expression; one can extract their location information,
    /// spelling, children, etc. However, the specific kind of the
    /// expression is not reported.
    /// ```
    public static final int CX_CURSOR_UNEXPOSED_EXPR = 100;
    /// ```
    /// 
    /// An expression that refers to some value declaration, such
    /// as a function, variable, or enumerator.
    /// ```
    public static final int CX_CURSOR_DECL_REF_EXPR = 101;
    /// ```
    /// 
    /// An expression that refers to a member of a struct, union,
    /// class, Objective-C class, etc.
    /// ```
    public static final int CX_CURSOR_MEMBER_REF_EXPR = 102;
    /// ```
    /// An expression that calls a function.
    /// ```
    public static final int CX_CURSOR_CALL_EXPR = 103;
    /// ```
    /// An expression that sends a message to an Objective-C
    ///    object or class.
    /// ```
    public static final int CX_CURSOR_OBJ_C_MESSAGE_EXPR = 104;
    /// ```
    /// An expression that represents a block literal.
    /// ```
    public static final int CX_CURSOR_BLOCK_EXPR = 105;
    /// ```
    /// An integer literal.
    /// ```
    public static final int CX_CURSOR_INTEGER_LITERAL = 106;
    /// ```
    /// A floating point number literal.
    /// ```
    public static final int CX_CURSOR_FLOATING_LITERAL = 107;
    /// ```
    /// An imaginary number literal.
    /// ```
    public static final int CX_CURSOR_IMAGINARY_LITERAL = 108;
    /// ```
    /// A string literal.
    /// ```
    public static final int CX_CURSOR_STRING_LITERAL = 109;
    /// ```
    /// A character literal.
    /// ```
    public static final int CX_CURSOR_CHARACTER_LITERAL = 110;
    /// ```
    /// A parenthesized expression, e.g. "(1)".
    /// 
    /// This AST node is only formed if full location information is requested.
    /// ```
    public static final int CX_CURSOR_PAREN_EXPR = 111;
    /// ```
    /// This represents the unary-expression's (except sizeof and
    /// alignof).
    /// ```
    public static final int CX_CURSOR_UNARY_OPERATOR = 112;
    /// ```
    /// [C99 6.5.2.1] Array Subscripting.
    /// ```
    public static final int CX_CURSOR_ARRAY_SUBSCRIPT_EXPR = 113;
    /// ```
    /// A builtin binary operation expression such as "x + y" or
    /// "x <= y".
    /// ```
    public static final int CX_CURSOR_BINARY_OPERATOR = 114;
    /// ```
    /// Compound assignment such as "+=".
    /// ```
    public static final int CX_CURSOR_COMPOUND_ASSIGN_OPERATOR = 115;
    /// ```
    /// The ?: ternary operator.
    /// ```
    public static final int CX_CURSOR_CONDITIONAL_OPERATOR = 116;
    /// ```
    /// An explicit cast in C (C99 6.5.4) or a C-style cast in C++
    /// (C++ [expr.cast]), which uses the syntax (Type)expr.
    /// 
    /// For example: (int)f.
    /// ```
    public static final int CX_CURSOR_C_STYLE_CAST_EXPR = 117;
    /// ```
    /// [C99 6.5.2.5]
    /// ```
    public static final int CX_CURSOR_COMPOUND_LITERAL_EXPR = 118;
    /// ```
    /// Describes an C or C++ initializer list.
    /// ```
    public static final int CX_CURSOR_INIT_LIST_EXPR = 119;
    /// ```
    /// The GNU address of label extension, representing &&label.
    /// ```
    public static final int CX_CURSOR_ADDR_LABEL_EXPR = 120;
    /// ```
    /// This is the GNU Statement Expression extension: ({int X=4; X;})
    /// ```
    public static final int CX_CURSOR_STMT_EXPR = 121;
    /// ```
    /// Represents a C11 generic selection.
    /// ```
    public static final int CX_CURSOR_GENERIC_SELECTION_EXPR = 122;
    /// ```
    /// Implements the GNU __null extension, which is a name for a null
    /// pointer constant that has integral type (e.g., int or long) and is the same
    /// size and alignment as a pointer.
    /// 
    /// The __null extension is typically only used by system headers, which define
    /// NULL as __null in C++ rather than using 0 (which is an integer that may not
    /// match the size of a pointer).
    /// ```
    public static final int CX_CURSOR_GNU_NULL_EXPR = 123;
    /// ```
    /// C++'s static_cast<> expression.
    /// ```
    public static final int CX_CURSOR_CXX_STATIC_CAST_EXPR = 124;
    /// ```
    /// C++'s dynamic_cast<> expression.
    /// ```
    public static final int CX_CURSOR_CXX_DYNAMIC_CAST_EXPR = 125;
    /// ```
    /// C++'s reinterpret_cast<> expression.
    /// ```
    public static final int CX_CURSOR_CXX_REINTERPRET_CAST_EXPR = 126;
    /// ```
    /// C++'s const_cast<> expression.
    /// ```
    public static final int CX_CURSOR_CXX_CONST_CAST_EXPR = 127;
    /// ```
    /// Represents an explicit C++ type conversion that uses "functional"
    /// notion (C++ [expr.type.conv]).
    /// 
    /// Example:
    /// \code
    /// x = int(0.5);
    /// \endcode
    /// ```
    public static final int CX_CURSOR_CXX_FUNCTIONAL_CAST_EXPR = 128;
    /// ```
    /// A C++ typeid expression (C++ [expr.typeid]).
    /// ```
    public static final int CX_CURSOR_CXX_TYPEID_EXPR = 129;
    /// ```
    /// [C++ 2.13.5] C++ Boolean Literal.
    /// ```
    public static final int CX_CURSOR_CXX_BOOL_LITERAL_EXPR = 130;
    /// ```
    /// [C++0x 2.14.7] C++ Pointer Literal.
    /// ```
    public static final int CX_CURSOR_CXX_NULL_PTR_LITERAL_EXPR = 131;
    /// ```
    /// Represents the "this" expression in C++
    /// ```
    public static final int CX_CURSOR_CXX_THIS_EXPR = 132;
    /// ```
    /// [C++ 15] C++ Throw Expression.
    /// 
    /// This handles 'throw' and 'throw' assignment-expression. When
    /// assignment-expression isn't present, Op will be null.
    /// ```
    public static final int CX_CURSOR_CXX_THROW_EXPR = 133;
    /// ```
    /// A new expression for memory allocation and constructor calls, e.g:
    /// "new CXXNewExpr(foo)".
    /// ```
    public static final int CX_CURSOR_CXX_NEW_EXPR = 134;
    /// ```
    /// A delete expression for memory deallocation and destructor calls,
    /// e.g. "delete[] pArray".
    /// ```
    public static final int CX_CURSOR_CXX_DELETE_EXPR = 135;
    /// ```
    /// A unary expression. (noexcept, sizeof, or other traits)
    /// ```
    public static final int CX_CURSOR_UNARY_EXPR = 136;
    /// ```
    /// An Objective-C string literal i.e. @"foo".
    /// ```
    public static final int CX_CURSOR_OBJ_C_STRING_LITERAL = 137;
    /// ```
    /// An Objective-C \@encode expression.
    /// ```
    public static final int CX_CURSOR_OBJ_C_ENCODE_EXPR = 138;
    /// ```
    /// An Objective-C \@selector expression.
    /// ```
    public static final int CX_CURSOR_OBJ_C_SELECTOR_EXPR = 139;
    /// ```
    /// An Objective-C \@protocol expression.
    /// ```
    public static final int CX_CURSOR_OBJ_C_PROTOCOL_EXPR = 140;
    /// ```
    /// An Objective-C "bridged" cast expression, which casts between
    /// Objective-C pointers and C pointers, transferring ownership in the process.
    /// 
    /// \code
    /// NSString *str = (__bridge_transfer NSString *)CFCreateString();
    /// \endcode
    /// ```
    public static final int CX_CURSOR_OBJ_C_BRIDGED_CAST_EXPR = 141;
    /// ```
    /// Represents a C++0x pack expansion that produces a sequence of
    /// expressions.
    /// 
    /// A pack expansion expression contains a pattern (which itself is an
    /// expression) followed by an ellipsis. For example:
    /// 
    /// \code
    /// template<typename F, typename ...Types>
    /// void forward(F f, Types &&...args) {
    /// f(static_cast<Types&&>(args)...);
    /// }
    /// \endcode
    /// ```
    public static final int CX_CURSOR_PACK_EXPANSION_EXPR = 142;
    /// ```
    /// Represents an expression that computes the length of a parameter
    /// pack.
    /// 
    /// \code
    /// template<typename ...Types>
    /// struct count {
    /// static const unsigned value = sizeof...(Types);
    /// };
    /// \endcode
    /// ```
    public static final int CX_CURSOR_SIZE_OF_PACK_EXPR = 143;
    public static final int CX_CURSOR_LAMBDA_EXPR = 144;
    /// ```
    /// Objective-c Boolean Literal.
    /// ```
    public static final int CX_CURSOR_OBJ_C_BOOL_LITERAL_EXPR = 145;
    /// ```
    /// Represents the "self" expression in an Objective-C method.
    /// ```
    public static final int CX_CURSOR_OBJ_C_SELF_EXPR = 146;
    /// ```
    /// OpenMP 5.0 [2.1.5, Array Section].
    /// OpenACC 3.3 [2.7.1, Data Specification for Data Clauses (Sub Arrays)]
    /// ```
    public static final int CX_CURSOR_ARRAY_SECTION_EXPR = 147;
    /// ```
    /// Represents an @available(...) check.
    /// ```
    public static final int CX_CURSOR_OBJ_C_AVAILABILITY_CHECK_EXPR = 148;
    /// ```
    /// 
    /// Fixed point literal
    /// ```
    public static final int CX_CURSOR_FIXED_POINT_LITERAL = 149;
    /// ```
    /// OpenMP 5.0 [2.1.4, Array Shaping].
    /// ```
    public static final int CX_CURSOR_OMP_ARRAY_SHAPING_EXPR = 150;
    /// ```
    /// 
    /// OpenMP 5.0 [2.1.6 Iterators]
    /// ```
    public static final int CX_CURSOR_OMP_ITERATOR_EXPR = 151;
    /// ```
    /// OpenCL's addrspace_cast<> expression.
    /// ```
    public static final int CX_CURSOR_CXX_ADDRSPACE_CAST_EXPR = 152;
    /// ```
    /// 
    /// Expression that references a C++20 concept.
    /// ```
    public static final int CX_CURSOR_CONCEPT_SPECIALIZATION_EXPR = 153;
    /// ```
    /// 
    /// Expression that references a C++20 requires expression.
    /// ```
    public static final int CX_CURSOR_REQUIRES_EXPR = 154;
    /// ```
    /// 
    /// Expression that references a C++20 parenthesized list aggregate
    /// initializer.
    /// ```
    public static final int CX_CURSOR_CXX_PAREN_LIST_INIT_EXPR = 155;
    /// ```
    /// 
    /// Represents a C++26 pack indexing expression.
    /// ```
    public static final int CX_CURSOR_PACK_INDEXING_EXPR = 156;
    public static final int CX_CURSOR_LAST_EXPR = 156;
    public static final int CX_CURSOR_FIRST_STMT = 200;
    /// ```
    /// 
    /// A statement whose specific kind is not exposed via this
    /// interface.
    /// 
    /// Unexposed statements have the same operations as any other kind of
    /// statement; one can extract their location information, spelling,
    /// children, etc. However, the specific kind of the statement is not
    /// reported.
    /// ```
    public static final int CX_CURSOR_UNEXPOSED_STMT = 200;
    /// ```
    /// A labelled statement in a function.
    /// 
    /// This cursor kind is used to describe the "start_over:" label statement in
    /// the following example:
    /// 
    /// \code
    /// start_over:
    /// ++counter;
    /// \endcode
    /// 
    /// ```
    public static final int CX_CURSOR_LABEL_STMT = 201;
    /// ```
    /// A group of statements like { stmt stmt }.
    /// 
    /// This cursor kind is used to describe compound statements, e.g. function
    /// bodies.
    /// ```
    public static final int CX_CURSOR_COMPOUND_STMT = 202;
    /// ```
    /// A case statement.
    /// ```
    public static final int CX_CURSOR_CASE_STMT = 203;
    /// ```
    /// A default statement.
    /// ```
    public static final int CX_CURSOR_DEFAULT_STMT = 204;
    /// ```
    /// An if statement
    /// ```
    public static final int CX_CURSOR_IF_STMT = 205;
    /// ```
    /// A switch statement.
    /// ```
    public static final int CX_CURSOR_SWITCH_STMT = 206;
    /// ```
    /// A while statement.
    /// ```
    public static final int CX_CURSOR_WHILE_STMT = 207;
    /// ```
    /// A do statement.
    /// ```
    public static final int CX_CURSOR_DO_STMT = 208;
    /// ```
    /// A for statement.
    /// ```
    public static final int CX_CURSOR_FOR_STMT = 209;
    /// ```
    /// A goto statement.
    /// ```
    public static final int CX_CURSOR_GOTO_STMT = 210;
    /// ```
    /// An indirect goto statement.
    /// ```
    public static final int CX_CURSOR_INDIRECT_GOTO_STMT = 211;
    /// ```
    /// A continue statement.
    /// ```
    public static final int CX_CURSOR_CONTINUE_STMT = 212;
    /// ```
    /// A break statement.
    /// ```
    public static final int CX_CURSOR_BREAK_STMT = 213;
    /// ```
    /// A return statement.
    /// ```
    public static final int CX_CURSOR_RETURN_STMT = 214;
    /// ```
    /// A GCC inline assembly statement extension.
    /// ```
    public static final int CX_CURSOR_GCC_ASM_STMT = 215;
    public static final int CX_CURSOR_ASM_STMT = 215;
    /// ```
    /// Objective-C's overall \@try-\@catch-\@finally statement.
    /// ```
    public static final int CX_CURSOR_OBJ_C_AT_TRY_STMT = 216;
    /// ```
    /// Objective-C's \@catch statement.
    /// ```
    public static final int CX_CURSOR_OBJ_C_AT_CATCH_STMT = 217;
    /// ```
    /// Objective-C's \@finally statement.
    /// ```
    public static final int CX_CURSOR_OBJ_C_AT_FINALLY_STMT = 218;
    /// ```
    /// Objective-C's \@throw statement.
    /// ```
    public static final int CX_CURSOR_OBJ_C_AT_THROW_STMT = 219;
    /// ```
    /// Objective-C's \@synchronized statement.
    /// ```
    public static final int CX_CURSOR_OBJ_C_AT_SYNCHRONIZED_STMT = 220;
    /// ```
    /// Objective-C's autorelease pool statement.
    /// ```
    public static final int CX_CURSOR_OBJ_C_AUTORELEASE_POOL_STMT = 221;
    /// ```
    /// Objective-C's collection statement.
    /// ```
    public static final int CX_CURSOR_OBJ_C_FOR_COLLECTION_STMT = 222;
    /// ```
    /// C++'s catch statement.
    /// ```
    public static final int CX_CURSOR_CXX_CATCH_STMT = 223;
    /// ```
    /// C++'s try statement.
    /// ```
    public static final int CX_CURSOR_CXX_TRY_STMT = 224;
    /// ```
    /// C++'s for (* : *) statement.
    /// ```
    public static final int CX_CURSOR_CXX_FOR_RANGE_STMT = 225;
    /// ```
    /// Windows Structured Exception Handling's try statement.
    /// ```
    public static final int CX_CURSOR_SEH_TRY_STMT = 226;
    /// ```
    /// Windows Structured Exception Handling's except statement.
    /// ```
    public static final int CX_CURSOR_SEH_EXCEPT_STMT = 227;
    /// ```
    /// Windows Structured Exception Handling's finally statement.
    /// ```
    public static final int CX_CURSOR_SEH_FINALLY_STMT = 228;
    /// ```
    /// A MS inline assembly statement extension.
    /// ```
    public static final int CX_CURSOR_MS_ASM_STMT = 229;
    /// ```
    /// The null statement ";": C99 6.8.3p3.
    /// 
    /// This cursor kind is used to describe the null statement.
    /// ```
    public static final int CX_CURSOR_NULL_STMT = 230;
    /// ```
    /// Adaptor class for mixing declarations with statements and
    /// expressions.
    /// ```
    public static final int CX_CURSOR_DECL_STMT = 231;
    /// ```
    /// OpenMP parallel directive.
    /// ```
    public static final int CX_CURSOR_OMP_PARALLEL_DIRECTIVE = 232;
    /// ```
    /// OpenMP SIMD directive.
    /// ```
    public static final int CX_CURSOR_OMP_SIMD_DIRECTIVE = 233;
    /// ```
    /// OpenMP for directive.
    /// ```
    public static final int CX_CURSOR_OMP_FOR_DIRECTIVE = 234;
    /// ```
    /// OpenMP sections directive.
    /// ```
    public static final int CX_CURSOR_OMP_SECTIONS_DIRECTIVE = 235;
    /// ```
    /// OpenMP section directive.
    /// ```
    public static final int CX_CURSOR_OMP_SECTION_DIRECTIVE = 236;
    /// ```
    /// OpenMP single directive.
    /// ```
    public static final int CX_CURSOR_OMP_SINGLE_DIRECTIVE = 237;
    /// ```
    /// OpenMP parallel for directive.
    /// ```
    public static final int CX_CURSOR_OMP_PARALLEL_FOR_DIRECTIVE = 238;
    /// ```
    /// OpenMP parallel sections directive.
    /// ```
    public static final int CX_CURSOR_OMP_PARALLEL_SECTIONS_DIRECTIVE = 239;
    /// ```
    /// OpenMP task directive.
    /// ```
    public static final int CX_CURSOR_OMP_TASK_DIRECTIVE = 240;
    /// ```
    /// OpenMP master directive.
    /// ```
    public static final int CX_CURSOR_OMP_MASTER_DIRECTIVE = 241;
    /// ```
    /// OpenMP critical directive.
    /// ```
    public static final int CX_CURSOR_OMP_CRITICAL_DIRECTIVE = 242;
    /// ```
    /// OpenMP taskyield directive.
    /// ```
    public static final int CX_CURSOR_OMP_TASKYIELD_DIRECTIVE = 243;
    /// ```
    /// OpenMP barrier directive.
    /// ```
    public static final int CX_CURSOR_OMP_BARRIER_DIRECTIVE = 244;
    /// ```
    /// OpenMP taskwait directive.
    /// ```
    public static final int CX_CURSOR_OMP_TASKWAIT_DIRECTIVE = 245;
    /// ```
    /// OpenMP flush directive.
    /// ```
    public static final int CX_CURSOR_OMP_FLUSH_DIRECTIVE = 246;
    /// ```
    /// Windows Structured Exception Handling's leave statement.
    /// ```
    public static final int CX_CURSOR_SEH_LEAVE_STMT = 247;
    /// ```
    /// OpenMP ordered directive.
    /// ```
    public static final int CX_CURSOR_OMP_ORDERED_DIRECTIVE = 248;
    /// ```
    /// OpenMP atomic directive.
    /// ```
    public static final int CX_CURSOR_OMP_ATOMIC_DIRECTIVE = 249;
    /// ```
    /// OpenMP for SIMD directive.
    /// ```
    public static final int CX_CURSOR_OMP_FOR_SIMD_DIRECTIVE = 250;
    /// ```
    /// OpenMP parallel for SIMD directive.
    /// ```
    public static final int CX_CURSOR_OMP_PARALLEL_FOR_SIMD_DIRECTIVE = 251;
    /// ```
    /// OpenMP target directive.
    /// ```
    public static final int CX_CURSOR_OMP_TARGET_DIRECTIVE = 252;
    /// ```
    /// OpenMP teams directive.
    /// ```
    public static final int CX_CURSOR_OMP_TEAMS_DIRECTIVE = 253;
    /// ```
    /// OpenMP taskgroup directive.
    /// ```
    public static final int CX_CURSOR_OMP_TASKGROUP_DIRECTIVE = 254;
    /// ```
    /// OpenMP cancellation point directive.
    /// ```
    public static final int CX_CURSOR_OMP_CANCELLATION_POINT_DIRECTIVE = 255;
    /// ```
    /// OpenMP cancel directive.
    /// ```
    public static final int CX_CURSOR_OMP_CANCEL_DIRECTIVE = 256;
    /// ```
    /// OpenMP target data directive.
    /// ```
    public static final int CX_CURSOR_OMP_TARGET_DATA_DIRECTIVE = 257;
    /// ```
    /// OpenMP taskloop directive.
    /// ```
    public static final int CX_CURSOR_OMP_TASK_LOOP_DIRECTIVE = 258;
    /// ```
    /// OpenMP taskloop simd directive.
    /// ```
    public static final int CX_CURSOR_OMP_TASK_LOOP_SIMD_DIRECTIVE = 259;
    /// ```
    /// OpenMP distribute directive.
    /// ```
    public static final int CX_CURSOR_OMP_DISTRIBUTE_DIRECTIVE = 260;
    /// ```
    /// OpenMP target enter data directive.
    /// ```
    public static final int CX_CURSOR_OMP_TARGET_ENTER_DATA_DIRECTIVE = 261;
    /// ```
    /// OpenMP target exit data directive.
    /// ```
    public static final int CX_CURSOR_OMP_TARGET_EXIT_DATA_DIRECTIVE = 262;
    /// ```
    /// OpenMP target parallel directive.
    /// ```
    public static final int CX_CURSOR_OMP_TARGET_PARALLEL_DIRECTIVE = 263;
    /// ```
    /// OpenMP target parallel for directive.
    /// ```
    public static final int CX_CURSOR_OMP_TARGET_PARALLEL_FOR_DIRECTIVE = 264;
    /// ```
    /// OpenMP target update directive.
    /// ```
    public static final int CX_CURSOR_OMP_TARGET_UPDATE_DIRECTIVE = 265;
    /// ```
    /// OpenMP distribute parallel for directive.
    /// ```
    public static final int CX_CURSOR_OMP_DISTRIBUTE_PARALLEL_FOR_DIRECTIVE = 266;
    /// ```
    /// OpenMP distribute parallel for simd directive.
    /// ```
    public static final int CX_CURSOR_OMP_DISTRIBUTE_PARALLEL_FOR_SIMD_DIRECTIVE = 267;
    /// ```
    /// OpenMP distribute simd directive.
    /// ```
    public static final int CX_CURSOR_OMP_DISTRIBUTE_SIMD_DIRECTIVE = 268;
    /// ```
    /// OpenMP target parallel for simd directive.
    /// ```
    public static final int CX_CURSOR_OMP_TARGET_PARALLEL_FOR_SIMD_DIRECTIVE = 269;
    /// ```
    /// OpenMP target simd directive.
    /// ```
    public static final int CX_CURSOR_OMP_TARGET_SIMD_DIRECTIVE = 270;
    /// ```
    /// OpenMP teams distribute directive.
    /// ```
    public static final int CX_CURSOR_OMP_TEAMS_DISTRIBUTE_DIRECTIVE = 271;
    /// ```
    /// OpenMP teams distribute simd directive.
    /// ```
    public static final int CX_CURSOR_OMP_TEAMS_DISTRIBUTE_SIMD_DIRECTIVE = 272;
    /// ```
    /// OpenMP teams distribute parallel for simd directive.
    /// ```
    public static final int CX_CURSOR_OMP_TEAMS_DISTRIBUTE_PARALLEL_FOR_SIMD_DIRECTIVE = 273;
    /// ```
    /// OpenMP teams distribute parallel for directive.
    /// ```
    public static final int CX_CURSOR_OMP_TEAMS_DISTRIBUTE_PARALLEL_FOR_DIRECTIVE = 274;
    /// ```
    /// OpenMP target teams directive.
    /// ```
    public static final int CX_CURSOR_OMP_TARGET_TEAMS_DIRECTIVE = 275;
    /// ```
    /// OpenMP target teams distribute directive.
    /// ```
    public static final int CX_CURSOR_OMP_TARGET_TEAMS_DISTRIBUTE_DIRECTIVE = 276;
    /// ```
    /// OpenMP target teams distribute parallel for directive.
    /// ```
    public static final int CX_CURSOR_OMP_TARGET_TEAMS_DISTRIBUTE_PARALLEL_FOR_DIRECTIVE = 277;
    /// ```
    /// OpenMP target teams distribute parallel for simd directive.
    /// ```
    public static final int CX_CURSOR_OMP_TARGET_TEAMS_DISTRIBUTE_PARALLEL_FOR_SIMD_DIRECTIVE = 278;
    /// ```
    /// OpenMP target teams distribute simd directive.
    /// ```
    public static final int CX_CURSOR_OMP_TARGET_TEAMS_DISTRIBUTE_SIMD_DIRECTIVE = 279;
    /// ```
    /// C++2a std::bit_cast expression.
    /// ```
    public static final int CX_CURSOR_BUILTIN_BIT_CAST_EXPR = 280;
    /// ```
    /// OpenMP master taskloop directive.
    /// ```
    public static final int CX_CURSOR_OMP_MASTER_TASK_LOOP_DIRECTIVE = 281;
    /// ```
    /// OpenMP parallel master taskloop directive.
    /// ```
    public static final int CX_CURSOR_OMP_PARALLEL_MASTER_TASK_LOOP_DIRECTIVE = 282;
    /// ```
    /// OpenMP master taskloop simd directive.
    /// ```
    public static final int CX_CURSOR_OMP_MASTER_TASK_LOOP_SIMD_DIRECTIVE = 283;
    /// ```
    /// OpenMP parallel master taskloop simd directive.
    /// ```
    public static final int CX_CURSOR_OMP_PARALLEL_MASTER_TASK_LOOP_SIMD_DIRECTIVE = 284;
    /// ```
    /// OpenMP parallel master directive.
    /// ```
    public static final int CX_CURSOR_OMP_PARALLEL_MASTER_DIRECTIVE = 285;
    /// ```
    /// OpenMP depobj directive.
    /// ```
    public static final int CX_CURSOR_OMP_DEPOBJ_DIRECTIVE = 286;
    /// ```
    /// OpenMP scan directive.
    /// ```
    public static final int CX_CURSOR_OMP_SCAN_DIRECTIVE = 287;
    /// ```
    /// OpenMP tile directive.
    /// ```
    public static final int CX_CURSOR_OMP_TILE_DIRECTIVE = 288;
    /// ```
    /// OpenMP canonical loop.
    /// ```
    public static final int CX_CURSOR_OMP_CANONICAL_LOOP = 289;
    /// ```
    /// OpenMP interop directive.
    /// ```
    public static final int CX_CURSOR_OMP_INTEROP_DIRECTIVE = 290;
    /// ```
    /// OpenMP dispatch directive.
    /// ```
    public static final int CX_CURSOR_OMP_DISPATCH_DIRECTIVE = 291;
    /// ```
    /// OpenMP masked directive.
    /// ```
    public static final int CX_CURSOR_OMP_MASKED_DIRECTIVE = 292;
    /// ```
    /// OpenMP unroll directive.
    /// ```
    public static final int CX_CURSOR_OMP_UNROLL_DIRECTIVE = 293;
    /// ```
    /// OpenMP metadirective directive.
    /// ```
    public static final int CX_CURSOR_OMP_META_DIRECTIVE = 294;
    /// ```
    /// OpenMP loop directive.
    /// ```
    public static final int CX_CURSOR_OMP_GENERIC_LOOP_DIRECTIVE = 295;
    /// ```
    /// OpenMP teams loop directive.
    /// ```
    public static final int CX_CURSOR_OMP_TEAMS_GENERIC_LOOP_DIRECTIVE = 296;
    /// ```
    /// OpenMP target teams loop directive.
    /// ```
    public static final int CX_CURSOR_OMP_TARGET_TEAMS_GENERIC_LOOP_DIRECTIVE = 297;
    /// ```
    /// OpenMP parallel loop directive.
    /// ```
    public static final int CX_CURSOR_OMP_PARALLEL_GENERIC_LOOP_DIRECTIVE = 298;
    /// ```
    /// OpenMP target parallel loop directive.
    /// ```
    public static final int CX_CURSOR_OMP_TARGET_PARALLEL_GENERIC_LOOP_DIRECTIVE = 299;
    /// ```
    /// OpenMP parallel masked directive.
    /// ```
    public static final int CX_CURSOR_OMP_PARALLEL_MASKED_DIRECTIVE = 300;
    /// ```
    /// OpenMP masked taskloop directive.
    /// ```
    public static final int CX_CURSOR_OMP_MASKED_TASK_LOOP_DIRECTIVE = 301;
    /// ```
    /// OpenMP masked taskloop simd directive.
    /// ```
    public static final int CX_CURSOR_OMP_MASKED_TASK_LOOP_SIMD_DIRECTIVE = 302;
    /// ```
    /// OpenMP parallel masked taskloop directive.
    /// ```
    public static final int CX_CURSOR_OMP_PARALLEL_MASKED_TASK_LOOP_DIRECTIVE = 303;
    /// ```
    /// OpenMP parallel masked taskloop simd directive.
    /// ```
    public static final int CX_CURSOR_OMP_PARALLEL_MASKED_TASK_LOOP_SIMD_DIRECTIVE = 304;
    /// ```
    /// OpenMP error directive.
    /// ```
    public static final int CX_CURSOR_OMP_ERROR_DIRECTIVE = 305;
    /// ```
    /// OpenMP scope directive.
    /// ```
    public static final int CX_CURSOR_OMP_SCOPE_DIRECTIVE = 306;
    /// ```
    /// OpenMP reverse directive.
    /// ```
    public static final int CX_CURSOR_OMP_REVERSE_DIRECTIVE = 307;
    /// ```
    /// OpenMP interchange directive.
    /// ```
    public static final int CX_CURSOR_OMP_INTERCHANGE_DIRECTIVE = 308;
    /// ```
    /// OpenMP assume directive.
    /// ```
    public static final int CX_CURSOR_OMP_ASSUME_DIRECTIVE = 309;
    public static final int CX_CURSOR_OMP_STRIPE_DIRECTIVE = 310;
    /// ```
    /// OpenMP fuse directive
    /// ```
    public static final int CX_CURSOR_OMP_FUSE_DIRECTIVE = 311;
    /// ```
    /// OpenMP split directive.
    /// ```
    public static final int CX_CURSOR_OMP_SPLIT_DIRECTIVE = 312;
    /// ```
    /// OpenACC Compute Construct.
    /// ```
    public static final int CX_CURSOR_OPEN_ACC_COMPUTE_CONSTRUCT = 320;
    /// ```
    /// OpenACC Loop Construct.
    /// ```
    public static final int CX_CURSOR_OPEN_ACC_LOOP_CONSTRUCT = 321;
    /// ```
    /// OpenACC Combined Constructs.
    /// ```
    public static final int CX_CURSOR_OPEN_ACC_COMBINED_CONSTRUCT = 322;
    /// ```
    /// OpenACC data Construct.
    /// ```
    public static final int CX_CURSOR_OPEN_ACC_DATA_CONSTRUCT = 323;
    /// ```
    /// OpenACC enter data Construct.
    /// ```
    public static final int CX_CURSOR_OPEN_ACC_ENTER_DATA_CONSTRUCT = 324;
    /// ```
    /// OpenACC exit data Construct.
    /// ```
    public static final int CX_CURSOR_OPEN_ACC_EXIT_DATA_CONSTRUCT = 325;
    /// ```
    /// OpenACC host_data Construct.
    /// ```
    public static final int CX_CURSOR_OPEN_ACC_HOST_DATA_CONSTRUCT = 326;
    /// ```
    /// OpenACC wait Construct.
    /// ```
    public static final int CX_CURSOR_OPEN_ACC_WAIT_CONSTRUCT = 327;
    /// ```
    /// OpenACC init Construct.
    /// ```
    public static final int CX_CURSOR_OPEN_ACC_INIT_CONSTRUCT = 328;
    /// ```
    /// OpenACC shutdown Construct.
    /// ```
    public static final int CX_CURSOR_OPEN_ACC_SHUTDOWN_CONSTRUCT = 329;
    /// ```
    /// OpenACC set Construct.
    /// ```
    public static final int CX_CURSOR_OPEN_ACC_SET_CONSTRUCT = 330;
    /// ```
    /// OpenACC update Construct.
    /// ```
    public static final int CX_CURSOR_OPEN_ACC_UPDATE_CONSTRUCT = 331;
    /// ```
    /// OpenACC atomic Construct.
    /// ```
    public static final int CX_CURSOR_OPEN_ACC_ATOMIC_CONSTRUCT = 332;
    /// ```
    /// OpenACC cache Construct.
    /// ```
    public static final int CX_CURSOR_OPEN_ACC_CACHE_CONSTRUCT = 333;
    public static final int CX_CURSOR_LAST_STMT = 333;
    /// ```
    /// 
    /// Cursor that represents the translation unit itself.
    /// 
    /// The translation unit cursor exists primarily to act as the root
    /// cursor for traversing the contents of a translation unit.
    /// ```
    public static final int CX_CURSOR_TRANSLATION_UNIT = 350;
    public static final int CX_CURSOR_FIRST_ATTR = 400;
    /// ```
    /// 
    /// An attribute whose specific kind is not exposed via this
    /// interface.
    /// ```
    public static final int CX_CURSOR_UNEXPOSED_ATTR = 400;
    public static final int CX_CURSOR_IB_ACTION_ATTR = 401;
    public static final int CX_CURSOR_IB_OUTLET_ATTR = 402;
    public static final int CX_CURSOR_IB_OUTLET_COLLECTION_ATTR = 403;
    public static final int CX_CURSOR_CXX_FINAL_ATTR = 404;
    public static final int CX_CURSOR_CXX_OVERRIDE_ATTR = 405;
    public static final int CX_CURSOR_ANNOTATE_ATTR = 406;
    public static final int CX_CURSOR_ASM_LABEL_ATTR = 407;
    public static final int CX_CURSOR_PACKED_ATTR = 408;
    public static final int CX_CURSOR_PURE_ATTR = 409;
    public static final int CX_CURSOR_CONST_ATTR = 410;
    public static final int CX_CURSOR_NO_DUPLICATE_ATTR = 411;
    public static final int CX_CURSOR_CUDA_CONSTANT_ATTR = 412;
    public static final int CX_CURSOR_CUDA_DEVICE_ATTR = 413;
    public static final int CX_CURSOR_CUDA_GLOBAL_ATTR = 414;
    public static final int CX_CURSOR_CUDA_HOST_ATTR = 415;
    public static final int CX_CURSOR_CUDA_SHARED_ATTR = 416;
    public static final int CX_CURSOR_VISIBILITY_ATTR = 417;
    public static final int CX_CURSOR_DLL_EXPORT = 418;
    public static final int CX_CURSOR_DLL_IMPORT = 419;
    public static final int CX_CURSOR_NS_RETURNS_RETAINED = 420;
    public static final int CX_CURSOR_NS_RETURNS_NOT_RETAINED = 421;
    public static final int CX_CURSOR_NS_RETURNS_AUTORELEASED = 422;
    public static final int CX_CURSOR_NS_CONSUMES_SELF = 423;
    public static final int CX_CURSOR_NS_CONSUMED = 424;
    public static final int CX_CURSOR_OBJ_C_EXCEPTION = 425;
    public static final int CX_CURSOR_OBJ_CNS_OBJECT = 426;
    public static final int CX_CURSOR_OBJ_C_INDEPENDENT_CLASS = 427;
    public static final int CX_CURSOR_OBJ_C_PRECISE_LIFETIME = 428;
    public static final int CX_CURSOR_OBJ_C_RETURNS_INNER_POINTER = 429;
    public static final int CX_CURSOR_OBJ_C_REQUIRES_SUPER = 430;
    public static final int CX_CURSOR_OBJ_C_ROOT_CLASS = 431;
    public static final int CX_CURSOR_OBJ_C_SUBCLASSING_RESTRICTED = 432;
    public static final int CX_CURSOR_OBJ_C_EXPLICIT_PROTOCOL_IMPL = 433;
    public static final int CX_CURSOR_OBJ_C_DESIGNATED_INITIALIZER = 434;
    public static final int CX_CURSOR_OBJ_C_RUNTIME_VISIBLE = 435;
    public static final int CX_CURSOR_OBJ_C_BOXABLE = 436;
    public static final int CX_CURSOR_FLAG_ENUM = 437;
    public static final int CX_CURSOR_CONVERGENT_ATTR = 438;
    public static final int CX_CURSOR_WARN_UNUSED_ATTR = 439;
    public static final int CX_CURSOR_WARN_UNUSED_RESULT_ATTR = 440;
    public static final int CX_CURSOR_ALIGNED_ATTR = 441;
    public static final int CX_CURSOR_LAST_ATTR = 441;
    public static final int CX_CURSOR_PREPROCESSING_DIRECTIVE = 500;
    public static final int CX_CURSOR_MACRO_DEFINITION = 501;
    public static final int CX_CURSOR_MACRO_EXPANSION = 502;
    public static final int CX_CURSOR_MACRO_INSTANTIATION = 502;
    public static final int CX_CURSOR_INCLUSION_DIRECTIVE = 503;
    public static final int CX_CURSOR_FIRST_PREPROCESSING = 500;
    public static final int CX_CURSOR_LAST_PREPROCESSING = 503;
    /// ```
    /// 
    /// A module import declaration.
    /// ```
    public static final int CX_CURSOR_MODULE_IMPORT_DECL = 600;
    public static final int CX_CURSOR_TYPE_ALIAS_TEMPLATE_DECL = 601;
    /// ```
    /// 
    /// A static_assert or _Static_assert node
    /// ```
    public static final int CX_CURSOR_STATIC_ASSERT = 602;
    /// ```
    /// 
    /// a friend declaration.
    /// ```
    public static final int CX_CURSOR_FRIEND_DECL = 603;
    /// ```
    /// 
    /// a concept declaration.
    /// ```
    public static final int CX_CURSOR_CONCEPT_DECL = 604;
    public static final int CX_CURSOR_FIRST_EXTRA_DECL = 600;
    public static final int CX_CURSOR_LAST_EXTRA_DECL = 604;
    /// ```
    /// 
    /// A code completion overload candidate.
    /// ```
    public static final int CX_CURSOR_OVERLOAD_CANDIDATE = 700;

}