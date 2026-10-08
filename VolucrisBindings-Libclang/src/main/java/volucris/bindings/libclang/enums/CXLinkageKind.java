/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.libclang.enums;

public final class CXLinkageKind {

    /// ```
    /// This value indicates that no linkage information is available
    /// for a provided CXCursor.
    /// ```
    public static final int CX_LINKAGE_INVALID = 0;
    /// ```
    /// 
    /// This is the linkage for variables, parameters, and so on that
    /// have automatic storage.  This covers normal (non-extern) local variables.
    /// ```
    public static final int CX_LINKAGE_NO_LINKAGE = 1;
    /// ```
    /// This is the linkage for static variables and static functions.
    /// ```
    public static final int CX_LINKAGE_INTERNAL = 2;
    /// ```
    /// This is the linkage for entities with external linkage that live
    /// in C++ anonymous namespaces.
    /// ```
    public static final int CX_LINKAGE_UNIQUE_EXTERNAL = 3;
    /// ```
    /// This is the linkage for entities with true, external linkage.
    /// ```
    public static final int CX_LINKAGE_EXTERNAL = 4;

}