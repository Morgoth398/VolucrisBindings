/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vma;

public final class VmaDefragmentationFlagBits {

    public static final int VMA_DEFRAGMENTATION_FLAG_ALGORITHM_FAST_BIT = 1;
    public static final int VMA_DEFRAGMENTATION_FLAG_ALGORITHM_BALANCED_BIT = 2;
    public static final int VMA_DEFRAGMENTATION_FLAG_ALGORITHM_FULL_BIT = 4;
    /// ```Use the most roboust algorithm at the cost of time to compute and number of copies to make. Only available when bufferImageGranularity is greater than 1, since it aims to reduce alignment issues between different types of resources. Otherwise falls back to same behavior as #VMA_DEFRAGMENTATION_FLAG_ALGORITHM_FULL_BIT.```
    public static final int VMA_DEFRAGMENTATION_FLAG_ALGORITHM_EXTENSIVE_BIT = 8;
    /// ```A bit mask to extract only `ALGORITHM` bits from entire set of flags.```
    public static final int VMA_DEFRAGMENTATION_FLAG_ALGORITHM_MASK = 15;
    /// ```A bit mask to extract only `ALGORITHM` bits from entire set of flags.```
    public static final int VMA_DEFRAGMENTATION_FLAG_BITS_MAX_ENUM = 2147483647;

}