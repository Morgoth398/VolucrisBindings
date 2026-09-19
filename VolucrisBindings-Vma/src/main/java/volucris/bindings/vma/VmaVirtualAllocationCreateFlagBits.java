/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vma;

public final class VmaVirtualAllocationCreateFlagBits {

    /// ```Allocation will be created from upper stack in a double stack pool.```
    public static final int VMA_VIRTUAL_ALLOCATION_CREATE_UPPER_ADDRESS_BIT = 64;
    /// ```Allocation strategy that tries to minimize memory usage.```
    public static final int VMA_VIRTUAL_ALLOCATION_CREATE_STRATEGY_MIN_MEMORY_BIT = 65536;
    /// ```Allocation strategy that tries to minimize allocation time.```
    public static final int VMA_VIRTUAL_ALLOCATION_CREATE_STRATEGY_MIN_TIME_BIT = 131072;
    /// ```Allocation strategy that chooses always the lowest offset in available space. This is not the most efficient strategy but achieves highly packed data.```
    public static final int VMA_VIRTUAL_ALLOCATION_CREATE_STRATEGY_MIN_OFFSET_BIT = 262144;
    /// ```A bit mask to extract only `STRATEGY` bits from entire set of flags.```
    public static final int VMA_VIRTUAL_ALLOCATION_CREATE_STRATEGY_MASK = 458752;
    /// ```A bit mask to extract only `STRATEGY` bits from entire set of flags.```
    public static final int VMA_VIRTUAL_ALLOCATION_CREATE_FLAG_BITS_MAX_ENUM = 2147483647;

}