/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vma;

public final class VmaAllocationCreateFlagBits {

    /// ```Set this flag if the allocation should have its own memory block.```
    public static final int VMA_ALLOCATION_CREATE_DEDICATED_MEMORY_BIT = 1;
    /// ```Set this flag to only try to allocate from existing `VkDeviceMemory` blocks and never create new such block.```
    public static final int VMA_ALLOCATION_CREATE_NEVER_ALLOCATE_BIT = 2;
    /// ```Set this flag to use a memory that will be persistently mapped and retrieve pointer to it.```
    public static final int VMA_ALLOCATION_CREATE_MAPPED_BIT = 4;
    /// ``````
    public static final int VMA_ALLOCATION_CREATE_USER_DATA_COPY_STRING_BIT = 32;
    /// ```Allocation will be created from upper stack in a double stack pool.```
    public static final int VMA_ALLOCATION_CREATE_UPPER_ADDRESS_BIT = 64;
    /// ```Create both buffer/image and allocation, but don't bind them together. It is useful when you want to bind yourself to do some more advanced binding, e.g. using some extensions. The flag is meaningful only with functions that bind by default: vmaCreateBuffer(), vmaCreateImage(). Otherwise it is ignored.```
    public static final int VMA_ALLOCATION_CREATE_DONT_BIND_BIT = 128;
    /// ```Create allocation only if additional device memory required for it, if any, won't exceed memory budget. Otherwise return `VK_ERROR_OUT_OF_DEVICE_MEMORY`.```
    public static final int VMA_ALLOCATION_CREATE_WITHIN_BUDGET_BIT = 256;
    /// ```Set this flag if the allocated memory will have aliasing resources.```
    public static final int VMA_ALLOCATION_CREATE_CAN_ALIAS_BIT = 512;
    /// ```Requests possibility to map the allocation (using vmaMapMemory() or #VMA_ALLOCATION_CREATE_MAPPED_BIT).```
    public static final int VMA_ALLOCATION_CREATE_HOST_ACCESS_SEQUENTIAL_WRITE_BIT = 1024;
    /// ```Requests possibility to map the allocation (using vmaMapMemory() or #VMA_ALLOCATION_CREATE_MAPPED_BIT).```
    public static final int VMA_ALLOCATION_CREATE_HOST_ACCESS_RANDOM_BIT = 2048;
    /// ```Together with #VMA_ALLOCATION_CREATE_HOST_ACCESS_SEQUENTIAL_WRITE_BIT or #VMA_ALLOCATION_CREATE_HOST_ACCESS_RANDOM_BIT, it says that despite request for host access, a not-`HOST_VISIBLE` memory type can be selected if it may improve performance.```
    public static final int VMA_ALLOCATION_CREATE_HOST_ACCESS_ALLOW_TRANSFER_INSTEAD_BIT = 4096;
    /// ```Allocation strategy that chooses smallest possible free range for the allocation to minimize memory usage and fragmentation, possibly at the expense of allocation time.```
    public static final int VMA_ALLOCATION_CREATE_STRATEGY_MIN_MEMORY_BIT = 65536;
    /// ```Allocation strategy that chooses first suitable free range for the allocation - not necessarily in terms of the smallest offset but the one that is easiest and fastest to find to minimize allocation time, possibly at the expense of allocation quality.```
    public static final int VMA_ALLOCATION_CREATE_STRATEGY_MIN_TIME_BIT = 131072;
    /// ```Allocation strategy that chooses always the lowest offset in available space. This is not the most efficient strategy but achieves highly packed data. Used internally by defragmentation, not recommended in typical usage.```
    public static final int VMA_ALLOCATION_CREATE_STRATEGY_MIN_OFFSET_BIT = 262144;
    /// ```Alias to #VMA_ALLOCATION_CREATE_STRATEGY_MIN_MEMORY_BIT.```
    public static final int VMA_ALLOCATION_CREATE_STRATEGY_BEST_FIT_BIT = 65536;
    /// ```Alias to #VMA_ALLOCATION_CREATE_STRATEGY_MIN_TIME_BIT.```
    public static final int VMA_ALLOCATION_CREATE_STRATEGY_FIRST_FIT_BIT = 131072;
    /// ```A bit mask to extract only `STRATEGY` bits from entire set of flags.```
    public static final int VMA_ALLOCATION_CREATE_STRATEGY_MASK = 458752;
    /// ```A bit mask to extract only `STRATEGY` bits from entire set of flags.```
    public static final int VMA_ALLOCATION_CREATE_FLAG_BITS_MAX_ENUM = 2147483647;

}