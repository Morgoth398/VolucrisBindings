/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.libclang.enums;

public final class CXChildVisitResult {

    /// ```
    /// 
    /// Terminates the cursor traversal.
    /// ```
    public static final int CX_CHILD_VISIT_BREAK = 0;
    /// ```
    /// 
    /// Continues the cursor traversal with the next sibling of
    /// the cursor just visited, without visiting its children.
    /// ```
    public static final int CX_CHILD_VISIT_CONTINUE = 1;
    /// ```
    /// 
    /// Recursively traverse the children of this cursor, using
    /// the same visitor and client data.
    /// ```
    public static final int CX_CHILD_VISIT_RECURSE = 2;

}