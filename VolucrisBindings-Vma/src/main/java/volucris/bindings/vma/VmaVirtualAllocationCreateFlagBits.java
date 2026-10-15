/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vma;

public final class VmaVirtualAllocationCreateFlagBits {

    /// ```
    /// \brief Allocation will be created from upper stack in a double stack pool.
    /// 
    ///     This flag is only allowed for virtual blocks created with #VMA_VIRTUAL_BLOCK_CREATE_LINEAR_ALGORITHM_BIT flag.
    /// ```
    public static final int VMA_VIRTUAL_ALLOCATION_CREATE_UPPER_ADDRESS_BIT = 64;
    /// ```
    /// \brief Allocation strategy that tries to minimize memory usage.
    /// ```
    public static final int VMA_VIRTUAL_ALLOCATION_CREATE_STRATEGY_MIN_MEMORY_BIT = 65536;
    /// ```
    /// \brief Allocation strategy that tries to minimize allocation time.
    /// ```
    public static final int VMA_VIRTUAL_ALLOCATION_CREATE_STRATEGY_MIN_TIME_BIT = 131072;
    /// ```
    /// Allocation strategy that chooses always the lowest offset in available space.
    ///     This is not the most efficient strategy but achieves highly packed data.
    /// ```
    public static final int VMA_VIRTUAL_ALLOCATION_CREATE_STRATEGY_MIN_OFFSET_BIT = 262144;
    /// ```
    /// \brief A bit mask to extract only `STRATEGY` bits from entire set of flags.
    /// 
    ///     These strategy flags are binary compatible with equivalent flags in #VmaAllocationCreateFlagBits.
    /// ```
    public static final int VMA_VIRTUAL_ALLOCATION_CREATE_STRATEGY_MASK = 458752;
    public static final int VMA_VIRTUAL_ALLOCATION_CREATE_FLAG_BITS_MAX_ENUM = 2147483647;

}