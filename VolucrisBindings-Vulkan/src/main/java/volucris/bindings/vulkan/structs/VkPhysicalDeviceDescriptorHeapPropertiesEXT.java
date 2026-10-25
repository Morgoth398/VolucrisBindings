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
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkPhysicalDeviceDescriptorHeapPropertiesEXT
		implements Struct<VkPhysicalDeviceDescriptorHeapPropertiesEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle SAMPLER_HEAP_ALIGNMENT_HANDLE;
	public static final VarHandle RESOURCE_HEAP_ALIGNMENT_HANDLE;
	public static final VarHandle MAX_SAMPLER_HEAP_SIZE_HANDLE;
	public static final VarHandle MAX_RESOURCE_HEAP_SIZE_HANDLE;
	public static final VarHandle MIN_SAMPLER_HEAP_RESERVED_RANGE_HANDLE;
	public static final VarHandle MIN_SAMPLER_HEAP_RESERVED_RANGE_WITH_EMBEDDED_HANDLE;
	public static final VarHandle MIN_RESOURCE_HEAP_RESERVED_RANGE_HANDLE;
	public static final VarHandle SAMPLER_DESCRIPTOR_SIZE_HANDLE;
	public static final VarHandle IMAGE_DESCRIPTOR_SIZE_HANDLE;
	public static final VarHandle BUFFER_DESCRIPTOR_SIZE_HANDLE;
	public static final VarHandle SAMPLER_DESCRIPTOR_ALIGNMENT_HANDLE;
	public static final VarHandle IMAGE_DESCRIPTOR_ALIGNMENT_HANDLE;
	public static final VarHandle BUFFER_DESCRIPTOR_ALIGNMENT_HANDLE;
	public static final VarHandle MAX_PUSH_DATA_SIZE_HANDLE;
	public static final VarHandle IMAGE_CAPTURE_REPLAY_OPAQUE_DATA_SIZE_HANDLE;
	public static final VarHandle MAX_DESCRIPTOR_HEAP_EMBEDDED_SAMPLERS_HANDLE;
	public static final VarHandle SAMPLER_YCBCR_CONVERSION_COUNT_HANDLE;
	public static final VarHandle SPARSE_DESCRIPTOR_HEAPS_HANDLE;
	public static final VarHandle PROTECTED_DESCRIPTOR_HEAPS_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long SAMPLER_HEAP_ALIGNMENT_BYTE_OFFSET;
	public static final long RESOURCE_HEAP_ALIGNMENT_BYTE_OFFSET;
	public static final long MAX_SAMPLER_HEAP_SIZE_BYTE_OFFSET;
	public static final long MAX_RESOURCE_HEAP_SIZE_BYTE_OFFSET;
	public static final long MIN_SAMPLER_HEAP_RESERVED_RANGE_BYTE_OFFSET;
	public static final long MIN_SAMPLER_HEAP_RESERVED_RANGE_WITH_EMBEDDED_BYTE_OFFSET;
	public static final long MIN_RESOURCE_HEAP_RESERVED_RANGE_BYTE_OFFSET;
	public static final long SAMPLER_DESCRIPTOR_SIZE_BYTE_OFFSET;
	public static final long IMAGE_DESCRIPTOR_SIZE_BYTE_OFFSET;
	public static final long BUFFER_DESCRIPTOR_SIZE_BYTE_OFFSET;
	public static final long SAMPLER_DESCRIPTOR_ALIGNMENT_BYTE_OFFSET;
	public static final long IMAGE_DESCRIPTOR_ALIGNMENT_BYTE_OFFSET;
	public static final long BUFFER_DESCRIPTOR_ALIGNMENT_BYTE_OFFSET;
	public static final long MAX_PUSH_DATA_SIZE_BYTE_OFFSET;
	public static final long IMAGE_CAPTURE_REPLAY_OPAQUE_DATA_SIZE_BYTE_OFFSET;
	public static final long MAX_DESCRIPTOR_HEAP_EMBEDDED_SAMPLERS_BYTE_OFFSET;
	public static final long SAMPLER_YCBCR_CONVERSION_COUNT_BYTE_OFFSET;
	public static final long SPARSE_DESCRIPTOR_HEAPS_BYTE_OFFSET;
	public static final long PROTECTED_DESCRIPTOR_HEAPS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_LONG.withName("samplerHeapAlignment"),
		    JAVA_LONG.withName("resourceHeapAlignment"),
		    JAVA_LONG.withName("maxSamplerHeapSize"),
		    JAVA_LONG.withName("maxResourceHeapSize"),
		    JAVA_LONG.withName("minSamplerHeapReservedRange"),
		    JAVA_LONG.withName("minSamplerHeapReservedRangeWithEmbedded"),
		    JAVA_LONG.withName("minResourceHeapReservedRange"),
		    JAVA_LONG.withName("samplerDescriptorSize"),
		    JAVA_LONG.withName("imageDescriptorSize"),
		    JAVA_LONG.withName("bufferDescriptorSize"),
		    JAVA_LONG.withName("samplerDescriptorAlignment"),
		    JAVA_LONG.withName("imageDescriptorAlignment"),
		    JAVA_LONG.withName("bufferDescriptorAlignment"),
		    JAVA_LONG.withName("maxPushDataSize"),
		    JAVA_LONG.withName("imageCaptureReplayOpaqueDataSize"),
		    JAVA_INT.withName("maxDescriptorHeapEmbeddedSamplers"),
		    JAVA_INT.withName("samplerYcbcrConversionCount"),
		    JAVA_INT.withName("sparseDescriptorHeaps"),
		    JAVA_INT.withName("protectedDescriptorHeaps")
		).withName("VkPhysicalDeviceDescriptorHeapPropertiesEXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		SAMPLER_HEAP_ALIGNMENT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("samplerHeapAlignment"));
		RESOURCE_HEAP_ALIGNMENT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("resourceHeapAlignment"));
		MAX_SAMPLER_HEAP_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxSamplerHeapSize"));
		MAX_RESOURCE_HEAP_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxResourceHeapSize"));
		MIN_SAMPLER_HEAP_RESERVED_RANGE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("minSamplerHeapReservedRange"));
		MIN_SAMPLER_HEAP_RESERVED_RANGE_WITH_EMBEDDED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("minSamplerHeapReservedRangeWithEmbedded"));
		MIN_RESOURCE_HEAP_RESERVED_RANGE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("minResourceHeapReservedRange"));
		SAMPLER_DESCRIPTOR_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("samplerDescriptorSize"));
		IMAGE_DESCRIPTOR_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("imageDescriptorSize"));
		BUFFER_DESCRIPTOR_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("bufferDescriptorSize"));
		SAMPLER_DESCRIPTOR_ALIGNMENT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("samplerDescriptorAlignment"));
		IMAGE_DESCRIPTOR_ALIGNMENT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("imageDescriptorAlignment"));
		BUFFER_DESCRIPTOR_ALIGNMENT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("bufferDescriptorAlignment"));
		MAX_PUSH_DATA_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxPushDataSize"));
		IMAGE_CAPTURE_REPLAY_OPAQUE_DATA_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("imageCaptureReplayOpaqueDataSize"));
		MAX_DESCRIPTOR_HEAP_EMBEDDED_SAMPLERS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxDescriptorHeapEmbeddedSamplers"));
		SAMPLER_YCBCR_CONVERSION_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("samplerYcbcrConversionCount"));
		SPARSE_DESCRIPTOR_HEAPS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sparseDescriptorHeaps"));
		PROTECTED_DESCRIPTOR_HEAPS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("protectedDescriptorHeaps"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		SAMPLER_HEAP_ALIGNMENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("samplerHeapAlignment"));
		RESOURCE_HEAP_ALIGNMENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("resourceHeapAlignment"));
		MAX_SAMPLER_HEAP_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxSamplerHeapSize"));
		MAX_RESOURCE_HEAP_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxResourceHeapSize"));
		MIN_SAMPLER_HEAP_RESERVED_RANGE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("minSamplerHeapReservedRange"));
		MIN_SAMPLER_HEAP_RESERVED_RANGE_WITH_EMBEDDED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("minSamplerHeapReservedRangeWithEmbedded"));
		MIN_RESOURCE_HEAP_RESERVED_RANGE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("minResourceHeapReservedRange"));
		SAMPLER_DESCRIPTOR_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("samplerDescriptorSize"));
		IMAGE_DESCRIPTOR_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("imageDescriptorSize"));
		BUFFER_DESCRIPTOR_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("bufferDescriptorSize"));
		SAMPLER_DESCRIPTOR_ALIGNMENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("samplerDescriptorAlignment"));
		IMAGE_DESCRIPTOR_ALIGNMENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("imageDescriptorAlignment"));
		BUFFER_DESCRIPTOR_ALIGNMENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("bufferDescriptorAlignment"));
		MAX_PUSH_DATA_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxPushDataSize"));
		IMAGE_CAPTURE_REPLAY_OPAQUE_DATA_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("imageCaptureReplayOpaqueDataSize"));
		MAX_DESCRIPTOR_HEAP_EMBEDDED_SAMPLERS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorHeapEmbeddedSamplers"));
		SAMPLER_YCBCR_CONVERSION_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("samplerYcbcrConversionCount"));
		SPARSE_DESCRIPTOR_HEAPS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sparseDescriptorHeaps"));
		PROTECTED_DESCRIPTOR_HEAPS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("protectedDescriptorHeaps"));
		//@formatter:on
	}

	public VkPhysicalDeviceDescriptorHeapPropertiesEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceDescriptorHeapPropertiesEXT(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceDescriptorHeapPropertiesEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceDescriptorHeapPropertiesEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceDescriptorHeapPropertiesEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #samplerHeapAlignment()
    public VkPhysicalDeviceDescriptorHeapPropertiesEXT samplerHeapAlignment(long samplerHeapAlignment) {
    	SAMPLER_HEAP_ALIGNMENT_HANDLE.set(segment, 0L, samplerHeapAlignment);
    	return this;
    }
    
    public long samplerHeapAlignment() {
    	return (long) SAMPLER_HEAP_ALIGNMENT_HANDLE.get(segment, 0L);
    }
    
    /// @see #resourceHeapAlignment()
    public VkPhysicalDeviceDescriptorHeapPropertiesEXT resourceHeapAlignment(long resourceHeapAlignment) {
    	RESOURCE_HEAP_ALIGNMENT_HANDLE.set(segment, 0L, resourceHeapAlignment);
    	return this;
    }
    
    public long resourceHeapAlignment() {
    	return (long) RESOURCE_HEAP_ALIGNMENT_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxSamplerHeapSize()
    public VkPhysicalDeviceDescriptorHeapPropertiesEXT maxSamplerHeapSize(long maxSamplerHeapSize) {
    	MAX_SAMPLER_HEAP_SIZE_HANDLE.set(segment, 0L, maxSamplerHeapSize);
    	return this;
    }
    
    public long maxSamplerHeapSize() {
    	return (long) MAX_SAMPLER_HEAP_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxResourceHeapSize()
    public VkPhysicalDeviceDescriptorHeapPropertiesEXT maxResourceHeapSize(long maxResourceHeapSize) {
    	MAX_RESOURCE_HEAP_SIZE_HANDLE.set(segment, 0L, maxResourceHeapSize);
    	return this;
    }
    
    public long maxResourceHeapSize() {
    	return (long) MAX_RESOURCE_HEAP_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #minSamplerHeapReservedRange()
    public VkPhysicalDeviceDescriptorHeapPropertiesEXT minSamplerHeapReservedRange(long minSamplerHeapReservedRange) {
    	MIN_SAMPLER_HEAP_RESERVED_RANGE_HANDLE.set(segment, 0L, minSamplerHeapReservedRange);
    	return this;
    }
    
    public long minSamplerHeapReservedRange() {
    	return (long) MIN_SAMPLER_HEAP_RESERVED_RANGE_HANDLE.get(segment, 0L);
    }
    
    /// @see #minSamplerHeapReservedRangeWithEmbedded()
    public VkPhysicalDeviceDescriptorHeapPropertiesEXT minSamplerHeapReservedRangeWithEmbedded(long minSamplerHeapReservedRangeWithEmbedded) {
    	MIN_SAMPLER_HEAP_RESERVED_RANGE_WITH_EMBEDDED_HANDLE.set(segment, 0L, minSamplerHeapReservedRangeWithEmbedded);
    	return this;
    }
    
    public long minSamplerHeapReservedRangeWithEmbedded() {
    	return (long) MIN_SAMPLER_HEAP_RESERVED_RANGE_WITH_EMBEDDED_HANDLE.get(segment, 0L);
    }
    
    /// @see #minResourceHeapReservedRange()
    public VkPhysicalDeviceDescriptorHeapPropertiesEXT minResourceHeapReservedRange(long minResourceHeapReservedRange) {
    	MIN_RESOURCE_HEAP_RESERVED_RANGE_HANDLE.set(segment, 0L, minResourceHeapReservedRange);
    	return this;
    }
    
    public long minResourceHeapReservedRange() {
    	return (long) MIN_RESOURCE_HEAP_RESERVED_RANGE_HANDLE.get(segment, 0L);
    }
    
    /// @see #samplerDescriptorSize()
    public VkPhysicalDeviceDescriptorHeapPropertiesEXT samplerDescriptorSize(long samplerDescriptorSize) {
    	SAMPLER_DESCRIPTOR_SIZE_HANDLE.set(segment, 0L, samplerDescriptorSize);
    	return this;
    }
    
    public long samplerDescriptorSize() {
    	return (long) SAMPLER_DESCRIPTOR_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #imageDescriptorSize()
    public VkPhysicalDeviceDescriptorHeapPropertiesEXT imageDescriptorSize(long imageDescriptorSize) {
    	IMAGE_DESCRIPTOR_SIZE_HANDLE.set(segment, 0L, imageDescriptorSize);
    	return this;
    }
    
    public long imageDescriptorSize() {
    	return (long) IMAGE_DESCRIPTOR_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #bufferDescriptorSize()
    public VkPhysicalDeviceDescriptorHeapPropertiesEXT bufferDescriptorSize(long bufferDescriptorSize) {
    	BUFFER_DESCRIPTOR_SIZE_HANDLE.set(segment, 0L, bufferDescriptorSize);
    	return this;
    }
    
    public long bufferDescriptorSize() {
    	return (long) BUFFER_DESCRIPTOR_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #samplerDescriptorAlignment()
    public VkPhysicalDeviceDescriptorHeapPropertiesEXT samplerDescriptorAlignment(long samplerDescriptorAlignment) {
    	SAMPLER_DESCRIPTOR_ALIGNMENT_HANDLE.set(segment, 0L, samplerDescriptorAlignment);
    	return this;
    }
    
    public long samplerDescriptorAlignment() {
    	return (long) SAMPLER_DESCRIPTOR_ALIGNMENT_HANDLE.get(segment, 0L);
    }
    
    /// @see #imageDescriptorAlignment()
    public VkPhysicalDeviceDescriptorHeapPropertiesEXT imageDescriptorAlignment(long imageDescriptorAlignment) {
    	IMAGE_DESCRIPTOR_ALIGNMENT_HANDLE.set(segment, 0L, imageDescriptorAlignment);
    	return this;
    }
    
    public long imageDescriptorAlignment() {
    	return (long) IMAGE_DESCRIPTOR_ALIGNMENT_HANDLE.get(segment, 0L);
    }
    
    /// @see #bufferDescriptorAlignment()
    public VkPhysicalDeviceDescriptorHeapPropertiesEXT bufferDescriptorAlignment(long bufferDescriptorAlignment) {
    	BUFFER_DESCRIPTOR_ALIGNMENT_HANDLE.set(segment, 0L, bufferDescriptorAlignment);
    	return this;
    }
    
    public long bufferDescriptorAlignment() {
    	return (long) BUFFER_DESCRIPTOR_ALIGNMENT_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxPushDataSize()
    public VkPhysicalDeviceDescriptorHeapPropertiesEXT maxPushDataSize(long maxPushDataSize) {
    	MAX_PUSH_DATA_SIZE_HANDLE.set(segment, 0L, maxPushDataSize);
    	return this;
    }
    
    public long maxPushDataSize() {
    	return (long) MAX_PUSH_DATA_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #imageCaptureReplayOpaqueDataSize()
    public VkPhysicalDeviceDescriptorHeapPropertiesEXT imageCaptureReplayOpaqueDataSize(long imageCaptureReplayOpaqueDataSize) {
    	IMAGE_CAPTURE_REPLAY_OPAQUE_DATA_SIZE_HANDLE.set(segment, 0L, imageCaptureReplayOpaqueDataSize);
    	return this;
    }
    
    public long imageCaptureReplayOpaqueDataSize() {
    	return (long) IMAGE_CAPTURE_REPLAY_OPAQUE_DATA_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxDescriptorHeapEmbeddedSamplers()
    public VkPhysicalDeviceDescriptorHeapPropertiesEXT maxDescriptorHeapEmbeddedSamplers(int maxDescriptorHeapEmbeddedSamplers) {
    	MAX_DESCRIPTOR_HEAP_EMBEDDED_SAMPLERS_HANDLE.set(segment, 0L, maxDescriptorHeapEmbeddedSamplers);
    	return this;
    }
    
    public int maxDescriptorHeapEmbeddedSamplers() {
    	return (int) MAX_DESCRIPTOR_HEAP_EMBEDDED_SAMPLERS_HANDLE.get(segment, 0L);
    }
    
    /// @see #samplerYcbcrConversionCount()
    public VkPhysicalDeviceDescriptorHeapPropertiesEXT samplerYcbcrConversionCount(int samplerYcbcrConversionCount) {
    	SAMPLER_YCBCR_CONVERSION_COUNT_HANDLE.set(segment, 0L, samplerYcbcrConversionCount);
    	return this;
    }
    
    public int samplerYcbcrConversionCount() {
    	return (int) SAMPLER_YCBCR_CONVERSION_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #sparseDescriptorHeaps()
    public VkPhysicalDeviceDescriptorHeapPropertiesEXT sparseDescriptorHeaps(int sparseDescriptorHeaps) {
    	SPARSE_DESCRIPTOR_HEAPS_HANDLE.set(segment, 0L, sparseDescriptorHeaps);
    	return this;
    }
    
    public int sparseDescriptorHeaps() {
    	return (int) SPARSE_DESCRIPTOR_HEAPS_HANDLE.get(segment, 0L);
    }
    
    /// @see #protectedDescriptorHeaps()
    public VkPhysicalDeviceDescriptorHeapPropertiesEXT protectedDescriptorHeaps(int protectedDescriptorHeaps) {
    	PROTECTED_DESCRIPTOR_HEAPS_HANDLE.set(segment, 0L, protectedDescriptorHeaps);
    	return this;
    }
    
    public int protectedDescriptorHeaps() {
    	return (int) PROTECTED_DESCRIPTOR_HEAPS_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceDescriptorHeapPropertiesEXT set(VkPhysicalDeviceDescriptorHeapPropertiesEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceDescriptorHeapPropertiesEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceDescriptorHeapPropertiesEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceDescriptorHeapPropertiesEXT> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceDescriptorHeapPropertiesEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceDescriptorHeapPropertiesEXT> array(SegmentAllocator allocator, VkPhysicalDeviceDescriptorHeapPropertiesEXT... structs) {
        NativeStructArray<VkPhysicalDeviceDescriptorHeapPropertiesEXT> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceDescriptorHeapPropertiesEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceDescriptorHeapPropertiesEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceDescriptorHeapPropertiesEXT(segment)
        );
    }

}