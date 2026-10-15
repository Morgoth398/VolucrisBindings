/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vma;

public final class VmaVirtualBlockCreateFlagBits {

    /// ```
    /// \brief Enables alternative, linear allocation algorithm in this virtual block.
    /// 
    ///     Specify this flag to enable linear allocation algorithm, which always creates
    ///     new allocations after last one and doesn't reuse space from allocations freed in
    ///     between. It trades memory consumption for simplified algorithm and data
    ///     structure, which has better performance and uses less memory for metadata.
    /// 
    ///     By using this flag, you can achieve behavior of free-at-once, stack,
    ///     ring buffer, and double stack.
    ///     For details, see documentation chapter \ref linear_algorithm.
    /// ```
    public static final int VMA_VIRTUAL_BLOCK_CREATE_LINEAR_ALGORITHM_BIT = 1;
    /// ```
    /// \brief Bit mask to extract only `ALGORITHM` bits from entire set of flags.
    /// ```
    public static final int VMA_VIRTUAL_BLOCK_CREATE_ALGORITHM_MASK = 1;
    public static final int VMA_VIRTUAL_BLOCK_CREATE_FLAG_BITS_MAX_ENUM = 2147483647;

}