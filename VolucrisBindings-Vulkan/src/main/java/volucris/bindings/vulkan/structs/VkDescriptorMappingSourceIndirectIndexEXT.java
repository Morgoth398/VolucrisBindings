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

public final class VkDescriptorMappingSourceIndirectIndexEXT
		implements Struct<VkDescriptorMappingSourceIndirectIndexEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle HEAP_OFFSET_HANDLE;
	public static final VarHandle PUSH_OFFSET_HANDLE;
	public static final VarHandle ADDRESS_OFFSET_HANDLE;
	public static final VarHandle HEAP_INDEX_STRIDE_HANDLE;
	public static final VarHandle HEAP_ARRAY_STRIDE_HANDLE;
	public static final VarHandle P_EMBEDDED_SAMPLER_HANDLE;
	public static final VarHandle USE_COMBINED_IMAGE_SAMPLER_INDEX_HANDLE;
	public static final VarHandle SAMPLER_HEAP_OFFSET_HANDLE;
	public static final VarHandle SAMPLER_PUSH_OFFSET_HANDLE;
	public static final VarHandle SAMPLER_ADDRESS_OFFSET_HANDLE;
	public static final VarHandle SAMPLER_HEAP_INDEX_STRIDE_HANDLE;
	public static final VarHandle SAMPLER_HEAP_ARRAY_STRIDE_HANDLE;

	public static final long HEAP_OFFSET_BYTE_OFFSET;
	public static final long PUSH_OFFSET_BYTE_OFFSET;
	public static final long ADDRESS_OFFSET_BYTE_OFFSET;
	public static final long HEAP_INDEX_STRIDE_BYTE_OFFSET;
	public static final long HEAP_ARRAY_STRIDE_BYTE_OFFSET;
	public static final long P_EMBEDDED_SAMPLER_BYTE_OFFSET;
	public static final long USE_COMBINED_IMAGE_SAMPLER_INDEX_BYTE_OFFSET;
	public static final long SAMPLER_HEAP_OFFSET_BYTE_OFFSET;
	public static final long SAMPLER_PUSH_OFFSET_BYTE_OFFSET;
	public static final long SAMPLER_ADDRESS_OFFSET_BYTE_OFFSET;
	public static final long SAMPLER_HEAP_INDEX_STRIDE_BYTE_OFFSET;
	public static final long SAMPLER_HEAP_ARRAY_STRIDE_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("heapOffset"),
		    JAVA_INT.withName("pushOffset"),
		    JAVA_INT.withName("addressOffset"),
		    JAVA_INT.withName("heapIndexStride"),
		    JAVA_INT.withName("heapArrayStride"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pEmbeddedSampler"),
		    JAVA_INT.withName("useCombinedImageSamplerIndex"),
		    JAVA_INT.withName("samplerHeapOffset"),
		    JAVA_INT.withName("samplerPushOffset"),
		    JAVA_INT.withName("samplerAddressOffset"),
		    JAVA_INT.withName("samplerHeapIndexStride"),
		    JAVA_INT.withName("samplerHeapArrayStride")
		).withName("VkDescriptorMappingSourceIndirectIndexEXT").withByteAlignment(8);
		
		HEAP_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("heapOffset"));
		PUSH_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pushOffset"));
		ADDRESS_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("addressOffset"));
		HEAP_INDEX_STRIDE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("heapIndexStride"));
		HEAP_ARRAY_STRIDE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("heapArrayStride"));
		P_EMBEDDED_SAMPLER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pEmbeddedSampler"));
		USE_COMBINED_IMAGE_SAMPLER_INDEX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("useCombinedImageSamplerIndex"));
		SAMPLER_HEAP_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("samplerHeapOffset"));
		SAMPLER_PUSH_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("samplerPushOffset"));
		SAMPLER_ADDRESS_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("samplerAddressOffset"));
		SAMPLER_HEAP_INDEX_STRIDE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("samplerHeapIndexStride"));
		SAMPLER_HEAP_ARRAY_STRIDE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("samplerHeapArrayStride"));
		
		HEAP_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("heapOffset"));
		PUSH_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pushOffset"));
		ADDRESS_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("addressOffset"));
		HEAP_INDEX_STRIDE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("heapIndexStride"));
		HEAP_ARRAY_STRIDE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("heapArrayStride"));
		P_EMBEDDED_SAMPLER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pEmbeddedSampler"));
		USE_COMBINED_IMAGE_SAMPLER_INDEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("useCombinedImageSamplerIndex"));
		SAMPLER_HEAP_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("samplerHeapOffset"));
		SAMPLER_PUSH_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("samplerPushOffset"));
		SAMPLER_ADDRESS_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("samplerAddressOffset"));
		SAMPLER_HEAP_INDEX_STRIDE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("samplerHeapIndexStride"));
		SAMPLER_HEAP_ARRAY_STRIDE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("samplerHeapArrayStride"));
		//@formatter:on
	}

	public VkDescriptorMappingSourceIndirectIndexEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkDescriptorMappingSourceIndirectIndexEXT(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkDescriptorMappingSourceIndirectIndexEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #heapOffset()
    public VkDescriptorMappingSourceIndirectIndexEXT heapOffset(int heapOffset) {
    	HEAP_OFFSET_HANDLE.set(segment, 0L, heapOffset);
    	return this;
    }
    
    public int heapOffset() {
    	return (int) HEAP_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #pushOffset()
    public VkDescriptorMappingSourceIndirectIndexEXT pushOffset(int pushOffset) {
    	PUSH_OFFSET_HANDLE.set(segment, 0L, pushOffset);
    	return this;
    }
    
    public int pushOffset() {
    	return (int) PUSH_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #addressOffset()
    public VkDescriptorMappingSourceIndirectIndexEXT addressOffset(int addressOffset) {
    	ADDRESS_OFFSET_HANDLE.set(segment, 0L, addressOffset);
    	return this;
    }
    
    public int addressOffset() {
    	return (int) ADDRESS_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #heapIndexStride()
    public VkDescriptorMappingSourceIndirectIndexEXT heapIndexStride(int heapIndexStride) {
    	HEAP_INDEX_STRIDE_HANDLE.set(segment, 0L, heapIndexStride);
    	return this;
    }
    
    public int heapIndexStride() {
    	return (int) HEAP_INDEX_STRIDE_HANDLE.get(segment, 0L);
    }
    
    /// @see #heapArrayStride()
    public VkDescriptorMappingSourceIndirectIndexEXT heapArrayStride(int heapArrayStride) {
    	HEAP_ARRAY_STRIDE_HANDLE.set(segment, 0L, heapArrayStride);
    	return this;
    }
    
    public int heapArrayStride() {
    	return (int) HEAP_ARRAY_STRIDE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pEmbeddedSampler()
    public VkDescriptorMappingSourceIndirectIndexEXT pEmbeddedSampler(VkSamplerCreateInfo pEmbeddedSampler) {
    	P_EMBEDDED_SAMPLER_HANDLE.set(segment, 0L, pEmbeddedSampler.memorySegment());
    	return this;
    }
    
    public @Nullable VkSamplerCreateInfo pEmbeddedSampler() {
    	MemorySegment segment = (MemorySegment) P_EMBEDDED_SAMPLER_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkSamplerCreateInfo(segment);
    }
    
    /// @see #useCombinedImageSamplerIndex()
    public VkDescriptorMappingSourceIndirectIndexEXT useCombinedImageSamplerIndex(int useCombinedImageSamplerIndex) {
    	USE_COMBINED_IMAGE_SAMPLER_INDEX_HANDLE.set(segment, 0L, useCombinedImageSamplerIndex);
    	return this;
    }
    
    public int useCombinedImageSamplerIndex() {
    	return (int) USE_COMBINED_IMAGE_SAMPLER_INDEX_HANDLE.get(segment, 0L);
    }
    
    /// @see #samplerHeapOffset()
    public VkDescriptorMappingSourceIndirectIndexEXT samplerHeapOffset(int samplerHeapOffset) {
    	SAMPLER_HEAP_OFFSET_HANDLE.set(segment, 0L, samplerHeapOffset);
    	return this;
    }
    
    public int samplerHeapOffset() {
    	return (int) SAMPLER_HEAP_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #samplerPushOffset()
    public VkDescriptorMappingSourceIndirectIndexEXT samplerPushOffset(int samplerPushOffset) {
    	SAMPLER_PUSH_OFFSET_HANDLE.set(segment, 0L, samplerPushOffset);
    	return this;
    }
    
    public int samplerPushOffset() {
    	return (int) SAMPLER_PUSH_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #samplerAddressOffset()
    public VkDescriptorMappingSourceIndirectIndexEXT samplerAddressOffset(int samplerAddressOffset) {
    	SAMPLER_ADDRESS_OFFSET_HANDLE.set(segment, 0L, samplerAddressOffset);
    	return this;
    }
    
    public int samplerAddressOffset() {
    	return (int) SAMPLER_ADDRESS_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #samplerHeapIndexStride()
    public VkDescriptorMappingSourceIndirectIndexEXT samplerHeapIndexStride(int samplerHeapIndexStride) {
    	SAMPLER_HEAP_INDEX_STRIDE_HANDLE.set(segment, 0L, samplerHeapIndexStride);
    	return this;
    }
    
    public int samplerHeapIndexStride() {
    	return (int) SAMPLER_HEAP_INDEX_STRIDE_HANDLE.get(segment, 0L);
    }
    
    /// @see #samplerHeapArrayStride()
    public VkDescriptorMappingSourceIndirectIndexEXT samplerHeapArrayStride(int samplerHeapArrayStride) {
    	SAMPLER_HEAP_ARRAY_STRIDE_HANDLE.set(segment, 0L, samplerHeapArrayStride);
    	return this;
    }
    
    public int samplerHeapArrayStride() {
    	return (int) SAMPLER_HEAP_ARRAY_STRIDE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkDescriptorMappingSourceIndirectIndexEXT set(VkDescriptorMappingSourceIndirectIndexEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkDescriptorMappingSourceIndirectIndexEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDescriptorMappingSourceIndirectIndexEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDescriptorMappingSourceIndirectIndexEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDescriptorMappingSourceIndirectIndexEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDescriptorMappingSourceIndirectIndexEXT> array(Arena arena, VkDescriptorMappingSourceIndirectIndexEXT... structs) {
        NativeStructArray<VkDescriptorMappingSourceIndirectIndexEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDescriptorMappingSourceIndirectIndexEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDescriptorMappingSourceIndirectIndexEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDescriptorMappingSourceIndirectIndexEXT(segment)
        );
    }

}