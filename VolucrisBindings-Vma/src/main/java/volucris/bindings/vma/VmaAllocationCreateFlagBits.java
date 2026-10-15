/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vma;

public final class VmaAllocationCreateFlagBits {

    /// ```
    /// \brief Set this flag if the allocation should have its own memory block.
    /// 
    ///     Use it for special, big resources, like fullscreen images used as attachments.
    /// 
    ///     If you use this flag while creating a buffer or an image, `VkMemoryDedicatedAllocateInfo`
    ///     structure is applied if possible.
    /// ```
    public static final int VMA_ALLOCATION_CREATE_DEDICATED_MEMORY_BIT = 1;
    /// ```
    /// \brief Set this flag to only try to allocate from existing `VkDeviceMemory` blocks and never create new such block.
    /// 
    ///     If new allocation cannot be placed in any of the existing blocks, allocation
    ///     fails with `VK_ERROR_OUT_OF_DEVICE_MEMORY` error.
    /// 
    ///     You should not use #VMA_ALLOCATION_CREATE_DEDICATED_MEMORY_BIT and
    ///     #VMA_ALLOCATION_CREATE_NEVER_ALLOCATE_BIT at the same time. It makes no sense.
    /// ```
    public static final int VMA_ALLOCATION_CREATE_NEVER_ALLOCATE_BIT = 2;
    /// ```
    /// \brief Set this flag to use a memory that will be persistently mapped and retrieve pointer to it.
    /// 
    ///     Pointer to mapped memory will be returned through VmaAllocationInfo::pMappedData.
    /// 
    ///     It is valid to use this flag for allocation made from memory type that is not
    ///     `HOST_VISIBLE`. This flag is then ignored and memory is not mapped. This is
    ///     useful if you need an allocation that is efficient to use on GPU
    ///     (`DEVICE_LOCAL`) and still want to map it directly if possible on platforms that
    ///     support it (e.g. Intel GPU).
    /// ```
    public static final int VMA_ALLOCATION_CREATE_MAPPED_BIT = 4;
    /// ```
    /// \deprecated Preserved for backward compatibility. Consider using vmaSetAllocationName() instead.
    /// 
    ///     Set this flag to treat VmaAllocationCreateInfo::pUserData as pointer to a
    ///     null-terminated string. Instead of copying pointer value, a local copy of the
    ///     string is made and stored in allocation's `pName`. The string is automatically
    ///     freed together with the allocation. It is also used in vmaBuildStatsString().
    /// ```
    public static final int VMA_ALLOCATION_CREATE_USER_DATA_COPY_STRING_BIT = 32;
    /// ```
    /// Allocation will be created from upper stack in a double stack pool.
    /// 
    ///     This flag is only allowed for custom pools created with #VMA_POOL_CREATE_LINEAR_ALGORITHM_BIT flag.
    /// ```
    public static final int VMA_ALLOCATION_CREATE_UPPER_ADDRESS_BIT = 64;
    /// ```
    /// Create both buffer/image and allocation, but don't bind them together.
    ///     It is useful when you want to bind yourself to do some more advanced binding, e.g. using some extensions.
    ///     The flag is meaningful only with functions that bind by default: vmaCreateBuffer(), vmaCreateImage().
    ///     Otherwise it is ignored.
    /// 
    ///     If you want to make sure the new buffer/image is not tied to the new memory allocation
    ///     through `VkMemoryDedicatedAllocateInfoKHR` structure in case the allocation ends up in its own memory block,
    ///     use also flag #VMA_ALLOCATION_CREATE_CAN_ALIAS_BIT.
    /// ```
    public static final int VMA_ALLOCATION_CREATE_DONT_BIND_BIT = 128;
    /// ```
    /// Create allocation only if additional device memory required for it, if any, won't exceed
    ///     memory budget. Otherwise return `VK_ERROR_OUT_OF_DEVICE_MEMORY`.
    /// ```
    public static final int VMA_ALLOCATION_CREATE_WITHIN_BUDGET_BIT = 256;
    /// ```
    /// \brief Set this flag if the allocated memory will have aliasing resources.
    /// 
    ///     Usage of this flag prevents supplying `VkMemoryDedicatedAllocateInfoKHR` when #VMA_ALLOCATION_CREATE_DEDICATED_MEMORY_BIT is specified.
    ///     Otherwise created dedicated memory will not be suitable for aliasing resources, resulting in Vulkan Validation Layer errors.
    /// ```
    public static final int VMA_ALLOCATION_CREATE_CAN_ALIAS_BIT = 512;
    /// ```
    /// 
    ///     Requests possibility to map the allocation (using vmaMapMemory() or #VMA_ALLOCATION_CREATE_MAPPED_BIT).
    /// 
    ///     - If you use #VMA_MEMORY_USAGE_AUTO or other `VMA_MEMORY_USAGE_AUTO*` value,
    ///       you must use this flag to be able to map the allocation. Otherwise, mapping is incorrect.
    ///     - If you use other value of #VmaMemoryUsage, this flag is ignored and mapping is always possible in memory types that are `HOST_VISIBLE`.
    ///       This includes allocations created in \ref custom_memory_pools.
    /// 
    ///     Declares that mapped memory will only be written sequentially, e.g. using `memcpy()` or a loop writing number-by-number,
    ///     never read or accessed randomly, so a memory type can be selected that is uncached and write-combined.
    /// 
    ///     \warning Violating this declaration may work correctly, but will likely be very slow.
    ///     Watch out for implicit reads introduced by doing e.g. `pMappedData[i] += x;`
    ///     Better prepare your data in a local variable and `memcpy()` it to the mapped pointer all at once.
    /// ```
    public static final int VMA_ALLOCATION_CREATE_HOST_ACCESS_SEQUENTIAL_WRITE_BIT = 1024;
    /// ```
    /// 
    ///     Requests possibility to map the allocation (using vmaMapMemory() or #VMA_ALLOCATION_CREATE_MAPPED_BIT).
    /// 
    ///     - If you use #VMA_MEMORY_USAGE_AUTO or other `VMA_MEMORY_USAGE_AUTO*` value,
    ///       you must use this flag to be able to map the allocation. Otherwise, mapping is incorrect.
    ///     - If you use other value of #VmaMemoryUsage, this flag is ignored and mapping is always possible in memory types that are `HOST_VISIBLE`.
    ///       This includes allocations created in \ref custom_memory_pools.
    /// 
    ///     Declares that mapped memory can be read, written, and accessed in random order,
    ///     so a `HOST_CACHED` memory type is preferred.
    /// ```
    public static final int VMA_ALLOCATION_CREATE_HOST_ACCESS_RANDOM_BIT = 2048;
    /// ```
    /// 
    ///     Together with #VMA_ALLOCATION_CREATE_HOST_ACCESS_SEQUENTIAL_WRITE_BIT or #VMA_ALLOCATION_CREATE_HOST_ACCESS_RANDOM_BIT,
    ///     it says that despite request for host access, a not-`HOST_VISIBLE` memory type can be selected
    ///     if it may improve performance.
    /// 
    ///     By using this flag, you declare that you will check if the allocation ended up in a `HOST_VISIBLE` memory type
    ///     (e.g. using vmaGetAllocationMemoryProperties()) and if not, you will create some "staging" buffer and
    ///     issue an explicit transfer to write/read your data.
    ///     To prepare for this possibility, don't forget to add appropriate flags like
    ///     `VK_BUFFER_USAGE_TRANSFER_DST_BIT`, `VK_BUFFER_USAGE_TRANSFER_SRC_BIT` to the parameters of created buffer or image.
    /// ```
    public static final int VMA_ALLOCATION_CREATE_HOST_ACCESS_ALLOW_TRANSFER_INSTEAD_BIT = 4096;
    /// ```
    /// Allocation strategy that chooses smallest possible free range for the allocation
    ///     to minimize memory usage and fragmentation, possibly at the expense of allocation time.
    /// ```
    public static final int VMA_ALLOCATION_CREATE_STRATEGY_MIN_MEMORY_BIT = 65536;
    /// ```
    /// Allocation strategy that chooses first suitable free range for the allocation -
    ///     not necessarily in terms of the smallest offset but the one that is easiest and fastest to find
    ///     to minimize allocation time, possibly at the expense of allocation quality.
    /// ```
    public static final int VMA_ALLOCATION_CREATE_STRATEGY_MIN_TIME_BIT = 131072;
    /// ```
    /// Allocation strategy that chooses always the lowest offset in available space.
    ///     This is not the most efficient strategy but achieves highly packed data.
    ///     Used internally by defragmentation, not recommended in typical usage.
    /// ```
    public static final int VMA_ALLOCATION_CREATE_STRATEGY_MIN_OFFSET_BIT = 262144;
    /// ```
    /// Alias to #VMA_ALLOCATION_CREATE_STRATEGY_MIN_MEMORY_BIT.
    /// ```
    public static final int VMA_ALLOCATION_CREATE_STRATEGY_BEST_FIT_BIT = 65536;
    /// ```
    /// Alias to #VMA_ALLOCATION_CREATE_STRATEGY_MIN_TIME_BIT.
    /// ```
    public static final int VMA_ALLOCATION_CREATE_STRATEGY_FIRST_FIT_BIT = 131072;
    /// ```
    /// A bit mask to extract only `STRATEGY` bits from entire set of flags.
    /// ```
    public static final int VMA_ALLOCATION_CREATE_STRATEGY_MASK = 458752;
    public static final int VMA_ALLOCATION_CREATE_FLAG_BITS_MAX_ENUM = 2147483647;

}