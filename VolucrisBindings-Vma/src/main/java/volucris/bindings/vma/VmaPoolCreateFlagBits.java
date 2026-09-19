/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vma;

public final class VmaPoolCreateFlagBits {

    /// ```Use this flag if you always allocate only buffers and linear images or only optimal images out of this pool and so Buffer-Image Granularity can be ignored.```
    public static final int VMA_POOL_CREATE_IGNORE_BUFFER_IMAGE_GRANULARITY_BIT = 2;
    /// ```Enables alternative, linear allocation algorithm in this pool.```
    public static final int VMA_POOL_CREATE_LINEAR_ALGORITHM_BIT = 4;
    /// ```Bit mask to extract only `ALGORITHM` bits from entire set of flags.```
    public static final int VMA_POOL_CREATE_ALGORITHM_MASK = 4;
    /// ```Bit mask to extract only `ALGORITHM` bits from entire set of flags.```
    public static final int VMA_POOL_CREATE_FLAG_BITS_MAX_ENUM = 2147483647;

}