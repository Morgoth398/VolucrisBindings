/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vma;

public final class VmaMemoryUsage {

    /// ```No intended memory usage specified. Use other members of VmaAllocationCreateInfo to specify your requirements.```
    public static final int VMA_MEMORY_USAGE_UNKNOWN = 0;
    /// ``````
    public static final int VMA_MEMORY_USAGE_GPU_ONLY = 1;
    /// ``````
    public static final int VMA_MEMORY_USAGE_CPU_ONLY = 2;
    /// ``````
    public static final int VMA_MEMORY_USAGE_CPU_TO_GPU = 3;
    /// ``````
    public static final int VMA_MEMORY_USAGE_GPU_TO_CPU = 4;
    /// ``````
    public static final int VMA_MEMORY_USAGE_CPU_COPY = 5;
    /// ```Lazily allocated GPU memory having `VK_MEMORY_PROPERTY_LAZILY_ALLOCATED_BIT`. Exists mostly on mobile platforms. Using it on desktop PC or other GPUs with no such memory type present will fail the allocation.```
    public static final int VMA_MEMORY_USAGE_GPU_LAZILY_ALLOCATED = 6;
    /// ```Selects best memory type automatically. This flag is recommended for most common use cases.```
    public static final int VMA_MEMORY_USAGE_AUTO = 7;
    /// ```Selects best memory type automatically with preference for GPU (device) memory.```
    public static final int VMA_MEMORY_USAGE_AUTO_PREFER_DEVICE = 8;
    /// ```Selects best memory type automatically with preference for CPU (host) memory.```
    public static final int VMA_MEMORY_USAGE_AUTO_PREFER_HOST = 9;
    /// ```Selects best memory type automatically with preference for CPU (host) memory.```
    public static final int VMA_MEMORY_USAGE_MAX_ENUM = 2147483647;

}