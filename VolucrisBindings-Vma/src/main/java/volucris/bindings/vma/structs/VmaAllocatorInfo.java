/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vma.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.VkDevice;
import volucris.bindings.vulkan.VkInstance;
import volucris.bindings.vulkan.VkPhysicalDevice;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;
import static volucris.bindings.core.FFMUtils.UNBOUNDED_ADDRESS;

/// ```
/// Information about existing #VmaAllocator object.
/// ```
public final class VmaAllocatorInfo
		implements Struct<VmaAllocatorInfo> {

    public static final StructLayout LAYOUT;

    public static final VarHandle INSTANCE_HANDLE;
    public static final VarHandle PHYSICAL_DEVICE_HANDLE;
    public static final VarHandle DEVICE_HANDLE;

    public static final long INSTANCE_BYTE_OFFSET;
    public static final long PHYSICAL_DEVICE_BYTE_OFFSET;
    public static final long DEVICE_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            UNBOUNDED_ADDRESS.withName("instance"),
            UNBOUNDED_ADDRESS.withName("physicalDevice"),
            UNBOUNDED_ADDRESS.withName("device")
        ).withName("VmaAllocatorInfo").withByteAlignment(8);
        
        INSTANCE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("instance"));
        PHYSICAL_DEVICE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("physicalDevice"));
        DEVICE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("device"));
        
        INSTANCE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("instance"));
        PHYSICAL_DEVICE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("physicalDevice"));
        DEVICE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("device"));
        //@formatter:on
    }

    public VmaAllocatorInfo() {
        this(Arena.ofAuto());
    }
    
    public VmaAllocatorInfo(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VmaAllocatorInfo(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #instance()
    public VmaAllocatorInfo instance(VkInstance instance) {
    	INSTANCE_HANDLE.set(segment, 0L, instance.memorySegment());
    	return this;
    }
    
    /// ```
    /// \brief Handle to Vulkan instance object.
    /// 
    ///     This is the same value as has been passed through VmaAllocatorCreateInfo::instance.
    /// ```
    public @Nullable VkInstance instance() {
    	MemorySegment segment = (MemorySegment) INSTANCE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkInstance(segment);
    }
    
    /// @see #physicalDevice()
    public VmaAllocatorInfo physicalDevice(VkPhysicalDevice physicalDevice) {
    	PHYSICAL_DEVICE_HANDLE.set(segment, 0L, physicalDevice.memorySegment());
    	return this;
    }
    
    /// ```
    /// \brief Handle to Vulkan physical device object.
    /// 
    ///     This is the same value as has been passed through VmaAllocatorCreateInfo::physicalDevice.
    /// ```
    public @Nullable VkPhysicalDevice physicalDevice() {
    	MemorySegment segment = (MemorySegment) PHYSICAL_DEVICE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkPhysicalDevice(segment);
    }
    
    /// @see #device()
    public VmaAllocatorInfo device(VkDevice device) {
    	DEVICE_HANDLE.set(segment, 0L, device.memorySegment());
    	return this;
    }
    
    /// ```
    /// \brief Handle to Vulkan device object.
    /// 
    ///     This is the same value as has been passed through VmaAllocatorCreateInfo::device.
    /// ```
    public @Nullable VkDevice device() {
    	MemorySegment segment = (MemorySegment) DEVICE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkDevice(segment);
    }
    
    @Override
    public VmaAllocatorInfo set(VmaAllocatorInfo other) {
        return set(other.segment);
    }
    
    @Override
    public VmaAllocatorInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VmaAllocatorInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VmaAllocatorInfo> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VmaAllocatorInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<VmaAllocatorInfo> array(Arena arena, VmaAllocatorInfo... structs) {
        NativeStructArray<VmaAllocatorInfo> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VmaAllocatorInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VmaAllocatorInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VmaAllocatorInfo(segment)
        );
    }
    
}