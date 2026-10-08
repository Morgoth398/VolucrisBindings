/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.libclang.enums;

public final class CXNameRefFlags {

    /// ```
    /// 
    /// Include the nested-name-specifier, e.g. Foo:: in x.Foo::y, in the
    /// range.
    /// ```
    public static final int CX_NAME_RANGE_WANT_QUALIFIER = 1;
    /// ```
    /// 
    /// Include the explicit template arguments, e.g. \<int> in x.f<int>,
    /// in the range.
    /// ```
    public static final int CX_NAME_RANGE_WANT_TEMPLATE_ARGS = 2;
    /// ```
    /// 
    /// If the name is non-contiguous, return the full spanning range.
    /// 
    /// Non-contiguous names occur in Objective-C when a selector with two or more
    /// parameters is used, or in C++ when using an operator:
    /// \code
    /// [object doSomething:here withValue:there]; // Objective-C
    /// return some_vector[1]; // C++
    /// \endcode
    /// ```
    public static final int CX_NAME_RANGE_WANT_SINGLE_PIECE = 4;

}