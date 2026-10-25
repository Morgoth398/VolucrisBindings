/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;

public final class VkQueueFamilyProperties
		implements Struct<VkQueueFamilyProperties> {

	public static final StructLayout LAYOUT;

	public static final VarHandle QUEUE_FLAGS_HANDLE;
	public static final VarHandle QUEUE_COUNT_HANDLE;
	public static final VarHandle TIMESTAMP_VALID_BITS_HANDLE;

	public static final long QUEUE_FLAGS_BYTE_OFFSET;
	public static final long QUEUE_COUNT_BYTE_OFFSET;
	public static final long TIMESTAMP_VALID_BITS_BYTE_OFFSET;
	public static final long MIN_IMAGE_TRANSFER_GRANULARITY_BYTE_OFFSET;

	private final MemorySegment segment;

	private final VkExtent3D minImageTransferGranularity;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("queueFlags"),
		    JAVA_INT.withName("queueCount"),
		    JAVA_INT.withName("timestampValidBits"),
		    VkExtent3D.LAYOUT.withName("minImageTransferGranularity")
		).withName("VkQueueFamilyProperties").withByteAlignment(4);
		
		QUEUE_FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("queueFlags"));
		QUEUE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("queueCount"));
		TIMESTAMP_VALID_BITS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("timestampValidBits"));
		
		QUEUE_FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("queueFlags"));
		QUEUE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("queueCount"));
		TIMESTAMP_VALID_BITS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("timestampValidBits"));
		MIN_IMAGE_TRANSFER_GRANULARITY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("minImageTransferGranularity"));
		//@formatter:on
	}

	public VkQueueFamilyProperties() {
	    this(Arena.ofAuto());
	}
	
	public VkQueueFamilyProperties(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkQueueFamilyProperties(MemorySegment segment) {
	    this.segment = segment;
	
	    minImageTransferGranularity = new VkExtent3D(segment.asSlice(MIN_IMAGE_TRANSFER_GRANULARITY_BYTE_OFFSET, VkExtent3D.LAYOUT));
	}

    /// @see #queueFlags()
    public VkQueueFamilyProperties queueFlags(int queueFlags) {
    	QUEUE_FLAGS_HANDLE.set(segment, 0L, queueFlags);
    	return this;
    }
    
    public int queueFlags() {
    	return (int) QUEUE_FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #queueCount()
    public VkQueueFamilyProperties queueCount(int queueCount) {
    	QUEUE_COUNT_HANDLE.set(segment, 0L, queueCount);
    	return this;
    }
    
    public int queueCount() {
    	return (int) QUEUE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #timestampValidBits()
    public VkQueueFamilyProperties timestampValidBits(int timestampValidBits) {
    	TIMESTAMP_VALID_BITS_HANDLE.set(segment, 0L, timestampValidBits);
    	return this;
    }
    
    public int timestampValidBits() {
    	return (int) TIMESTAMP_VALID_BITS_HANDLE.get(segment, 0L);
    }
    
    /// @see #minImageTransferGranularity()
    public VkQueueFamilyProperties minImageTransferGranularity(Consumer<VkExtent3D> consumer) {
    	consumer.accept(minImageTransferGranularity);
    	return this;
    }
    
    /// @see #minImageTransferGranularity()
    public VkQueueFamilyProperties minImageTransferGranularity(VkExtent3D other) {
    	minImageTransferGranularity.set(other);
    	return this;
    }
    
    public VkExtent3D minImageTransferGranularity() {
    	return minImageTransferGranularity;
    }
    
    @Override
    public VkQueueFamilyProperties set(VkQueueFamilyProperties other) {
        return set(other.segment);
    }
    
    @Override
    public VkQueueFamilyProperties set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkQueueFamilyProperties> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkQueueFamilyProperties> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkQueueFamilyProperties(segment),
            count
        );
    }
    
    public static NativeStructArray<VkQueueFamilyProperties> array(SegmentAllocator allocator, VkQueueFamilyProperties... structs) {
        NativeStructArray<VkQueueFamilyProperties> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkQueueFamilyProperties(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkQueueFamilyProperties> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkQueueFamilyProperties(segment)
        );
    }

}