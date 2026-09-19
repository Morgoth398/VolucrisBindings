/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV
		implements Struct<VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle EXTENDED_SPARSE_ADDRESS_SPACE_SIZE_HANDLE;
    public static final VarHandle EXTENDED_SPARSE_IMAGE_USAGE_FLAGS_HANDLE;
    public static final VarHandle EXTENDED_SPARSE_BUFFER_USAGE_FLAGS_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long EXTENDED_SPARSE_ADDRESS_SPACE_SIZE_BYTE_OFFSET;
    public static final long EXTENDED_SPARSE_IMAGE_USAGE_FLAGS_BYTE_OFFSET;
    public static final long EXTENDED_SPARSE_BUFFER_USAGE_FLAGS_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_LONG.withName("extendedSparseAddressSpaceSize"),
            JAVA_INT.withName("extendedSparseImageUsageFlags"),
            JAVA_INT.withName("extendedSparseBufferUsageFlags")
        ).withName("VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        EXTENDED_SPARSE_ADDRESS_SPACE_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("extendedSparseAddressSpaceSize"));
        EXTENDED_SPARSE_IMAGE_USAGE_FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("extendedSparseImageUsageFlags"));
        EXTENDED_SPARSE_BUFFER_USAGE_FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("extendedSparseBufferUsageFlags"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        EXTENDED_SPARSE_ADDRESS_SPACE_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("extendedSparseAddressSpaceSize"));
        EXTENDED_SPARSE_IMAGE_USAGE_FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("extendedSparseImageUsageFlags"));
        EXTENDED_SPARSE_BUFFER_USAGE_FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("extendedSparseBufferUsageFlags"));
        //@formatter:on
    }

    public VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV() {
        this(Arena.ofAuto());
    }
    
    public VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #extendedSparseAddressSpaceSize()
    public VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV extendedSparseAddressSpaceSize(long extendedSparseAddressSpaceSize) {
    	EXTENDED_SPARSE_ADDRESS_SPACE_SIZE_HANDLE.set(segment, 0L, extendedSparseAddressSpaceSize);
    	return this;
    }
    
    public long extendedSparseAddressSpaceSize() {
    	return (long) EXTENDED_SPARSE_ADDRESS_SPACE_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #extendedSparseImageUsageFlags()
    public VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV extendedSparseImageUsageFlags(int extendedSparseImageUsageFlags) {
    	EXTENDED_SPARSE_IMAGE_USAGE_FLAGS_HANDLE.set(segment, 0L, extendedSparseImageUsageFlags);
    	return this;
    }
    
    public int extendedSparseImageUsageFlags() {
    	return (int) EXTENDED_SPARSE_IMAGE_USAGE_FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #extendedSparseBufferUsageFlags()
    public VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV extendedSparseBufferUsageFlags(int extendedSparseBufferUsageFlags) {
    	EXTENDED_SPARSE_BUFFER_USAGE_FLAGS_HANDLE.set(segment, 0L, extendedSparseBufferUsageFlags);
    	return this;
    }
    
    public int extendedSparseBufferUsageFlags() {
    	return (int) EXTENDED_SPARSE_BUFFER_USAGE_FLAGS_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV set(VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV> array(Arena arena, VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV... structs) {
        NativeStructArray<VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV(segment)
        );
    }
    
}