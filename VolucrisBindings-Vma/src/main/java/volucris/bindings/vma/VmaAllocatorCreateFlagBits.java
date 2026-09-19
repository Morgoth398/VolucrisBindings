/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vma;

public final class VmaAllocatorCreateFlagBits {

    /// ```Allocator and all objects created from it will not be synchronized internally, so you must guarantee they are used from only one thread at a time or synchronized externally by you.```
    public static final int VMA_ALLOCATOR_CREATE_EXTERNALLY_SYNCHRONIZED_BIT = 1;
    /// ```Enables usage of VK_KHR_dedicated_allocation extension.```
    public static final int VMA_ALLOCATOR_CREATE_KHR_DEDICATED_ALLOCATION_BIT = 2;
    /// ```Enables usage of VK_KHR_bind_memory2 extension.```
    public static final int VMA_ALLOCATOR_CREATE_KHR_BIND_MEMORY2_BIT = 4;
    /// ```Enables usage of VK_EXT_memory_budget extension.```
    public static final int VMA_ALLOCATOR_CREATE_EXT_MEMORY_BUDGET_BIT = 8;
    /// ```Enables usage of VK_AMD_device_coherent_memory extension.```
    public static final int VMA_ALLOCATOR_CREATE_AMD_DEVICE_COHERENT_MEMORY_BIT = 16;
    /// ```Enables usage of "buffer device address" feature, which allows you to use function `vkGetBufferDeviceAddress*` to get raw GPU pointer to a buffer and pass it for usage inside a shader.```
    public static final int VMA_ALLOCATOR_CREATE_BUFFER_DEVICE_ADDRESS_BIT = 32;
    /// ```Enables usage of VK_EXT_memory_priority extension in the library.```
    public static final int VMA_ALLOCATOR_CREATE_EXT_MEMORY_PRIORITY_BIT = 64;
    /// ```Enables usage of VK_KHR_maintenance4 extension in the library.```
    public static final int VMA_ALLOCATOR_CREATE_KHR_MAINTENANCE4_BIT = 128;
    /// ```Enables usage of VK_KHR_maintenance5 extension in the library.```
    public static final int VMA_ALLOCATOR_CREATE_KHR_MAINTENANCE5_BIT = 256;
    /// ```Enables usage of VK_KHR_external_memory_win32 extension in the library.```
    public static final int VMA_ALLOCATOR_CREATE_KHR_EXTERNAL_MEMORY_WIN32_BIT = 512;
    /// ```Enables usage of VK_KHR_external_memory_win32 extension in the library.```
    public static final int VMA_ALLOCATOR_CREATE_FLAG_BITS_MAX_ENUM = 2147483647;

}