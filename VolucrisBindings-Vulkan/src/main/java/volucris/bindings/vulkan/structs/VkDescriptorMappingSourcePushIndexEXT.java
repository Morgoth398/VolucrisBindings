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

public final class VkDescriptorMappingSourcePushIndexEXT
		implements Struct<VkDescriptorMappingSourcePushIndexEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle HEAP_OFFSET_HANDLE;
	public static final VarHandle PUSH_OFFSET_HANDLE;
	public static final VarHandle HEAP_INDEX_STRIDE_HANDLE;
	public static final VarHandle HEAP_ARRAY_STRIDE_HANDLE;
	public static final VarHandle P_EMBEDDED_SAMPLER_HANDLE;
	public static final VarHandle USE_COMBINED_IMAGE_SAMPLER_INDEX_HANDLE;
	public static final VarHandle SAMPLER_HEAP_OFFSET_HANDLE;
	public static final VarHandle SAMPLER_PUSH_OFFSET_HANDLE;
	public static final VarHandle SAMPLER_HEAP_INDEX_STRIDE_HANDLE;
	public static final VarHandle SAMPLER_HEAP_ARRAY_STRIDE_HANDLE;

	public static final long HEAP_OFFSET_BYTE_OFFSET;
	public static final long PUSH_OFFSET_BYTE_OFFSET;
	public static final long HEAP_INDEX_STRIDE_BYTE_OFFSET;
	public static final long HEAP_ARRAY_STRIDE_BYTE_OFFSET;
	public static final long P_EMBEDDED_SAMPLER_BYTE_OFFSET;
	public static final long USE_COMBINED_IMAGE_SAMPLER_INDEX_BYTE_OFFSET;
	public static final long SAMPLER_HEAP_OFFSET_BYTE_OFFSET;
	public static final long SAMPLER_PUSH_OFFSET_BYTE_OFFSET;
	public static final long SAMPLER_HEAP_INDEX_STRIDE_BYTE_OFFSET;
	public static final long SAMPLER_HEAP_ARRAY_STRIDE_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("heapOffset"),
		    JAVA_INT.withName("pushOffset"),
		    JAVA_INT.withName("heapIndexStride"),
		    JAVA_INT.withName("heapArrayStride"),
		    UNBOUNDED_ADDRESS.withName("pEmbeddedSampler"),
		    JAVA_INT.withName("useCombinedImageSamplerIndex"),
		    JAVA_INT.withName("samplerHeapOffset"),
		    JAVA_INT.withName("samplerPushOffset"),
		    JAVA_INT.withName("samplerHeapIndexStride"),
		    JAVA_INT.withName("samplerHeapArrayStride"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkDescriptorMappingSourcePushIndexEXT").withByteAlignment(8);
		
		HEAP_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("heapOffset"));
		PUSH_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pushOffset"));
		HEAP_INDEX_STRIDE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("heapIndexStride"));
		HEAP_ARRAY_STRIDE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("heapArrayStride"));
		P_EMBEDDED_SAMPLER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pEmbeddedSampler"));
		USE_COMBINED_IMAGE_SAMPLER_INDEX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("useCombinedImageSamplerIndex"));
		SAMPLER_HEAP_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("samplerHeapOffset"));
		SAMPLER_PUSH_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("samplerPushOffset"));
		SAMPLER_HEAP_INDEX_STRIDE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("samplerHeapIndexStride"));
		SAMPLER_HEAP_ARRAY_STRIDE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("samplerHeapArrayStride"));
		
		HEAP_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("heapOffset"));
		PUSH_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pushOffset"));
		HEAP_INDEX_STRIDE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("heapIndexStride"));
		HEAP_ARRAY_STRIDE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("heapArrayStride"));
		P_EMBEDDED_SAMPLER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pEmbeddedSampler"));
		USE_COMBINED_IMAGE_SAMPLER_INDEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("useCombinedImageSamplerIndex"));
		SAMPLER_HEAP_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("samplerHeapOffset"));
		SAMPLER_PUSH_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("samplerPushOffset"));
		SAMPLER_HEAP_INDEX_STRIDE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("samplerHeapIndexStride"));
		SAMPLER_HEAP_ARRAY_STRIDE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("samplerHeapArrayStride"));
		//@formatter:on
	}

	public VkDescriptorMappingSourcePushIndexEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkDescriptorMappingSourcePushIndexEXT(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkDescriptorMappingSourcePushIndexEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #heapOffset()
    public VkDescriptorMappingSourcePushIndexEXT heapOffset(int heapOffset) {
    	HEAP_OFFSET_HANDLE.set(segment, 0L, heapOffset);
    	return this;
    }
    
    public int heapOffset() {
    	return (int) HEAP_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #pushOffset()
    public VkDescriptorMappingSourcePushIndexEXT pushOffset(int pushOffset) {
    	PUSH_OFFSET_HANDLE.set(segment, 0L, pushOffset);
    	return this;
    }
    
    public int pushOffset() {
    	return (int) PUSH_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #heapIndexStride()
    public VkDescriptorMappingSourcePushIndexEXT heapIndexStride(int heapIndexStride) {
    	HEAP_INDEX_STRIDE_HANDLE.set(segment, 0L, heapIndexStride);
    	return this;
    }
    
    public int heapIndexStride() {
    	return (int) HEAP_INDEX_STRIDE_HANDLE.get(segment, 0L);
    }
    
    /// @see #heapArrayStride()
    public VkDescriptorMappingSourcePushIndexEXT heapArrayStride(int heapArrayStride) {
    	HEAP_ARRAY_STRIDE_HANDLE.set(segment, 0L, heapArrayStride);
    	return this;
    }
    
    public int heapArrayStride() {
    	return (int) HEAP_ARRAY_STRIDE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pEmbeddedSampler()
    public VkDescriptorMappingSourcePushIndexEXT pEmbeddedSampler(VkSamplerCreateInfo pEmbeddedSampler) {
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
    public VkDescriptorMappingSourcePushIndexEXT useCombinedImageSamplerIndex(int useCombinedImageSamplerIndex) {
    	USE_COMBINED_IMAGE_SAMPLER_INDEX_HANDLE.set(segment, 0L, useCombinedImageSamplerIndex);
    	return this;
    }
    
    public int useCombinedImageSamplerIndex() {
    	return (int) USE_COMBINED_IMAGE_SAMPLER_INDEX_HANDLE.get(segment, 0L);
    }
    
    /// @see #samplerHeapOffset()
    public VkDescriptorMappingSourcePushIndexEXT samplerHeapOffset(int samplerHeapOffset) {
    	SAMPLER_HEAP_OFFSET_HANDLE.set(segment, 0L, samplerHeapOffset);
    	return this;
    }
    
    public int samplerHeapOffset() {
    	return (int) SAMPLER_HEAP_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #samplerPushOffset()
    public VkDescriptorMappingSourcePushIndexEXT samplerPushOffset(int samplerPushOffset) {
    	SAMPLER_PUSH_OFFSET_HANDLE.set(segment, 0L, samplerPushOffset);
    	return this;
    }
    
    public int samplerPushOffset() {
    	return (int) SAMPLER_PUSH_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #samplerHeapIndexStride()
    public VkDescriptorMappingSourcePushIndexEXT samplerHeapIndexStride(int samplerHeapIndexStride) {
    	SAMPLER_HEAP_INDEX_STRIDE_HANDLE.set(segment, 0L, samplerHeapIndexStride);
    	return this;
    }
    
    public int samplerHeapIndexStride() {
    	return (int) SAMPLER_HEAP_INDEX_STRIDE_HANDLE.get(segment, 0L);
    }
    
    /// @see #samplerHeapArrayStride()
    public VkDescriptorMappingSourcePushIndexEXT samplerHeapArrayStride(int samplerHeapArrayStride) {
    	SAMPLER_HEAP_ARRAY_STRIDE_HANDLE.set(segment, 0L, samplerHeapArrayStride);
    	return this;
    }
    
    public int samplerHeapArrayStride() {
    	return (int) SAMPLER_HEAP_ARRAY_STRIDE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkDescriptorMappingSourcePushIndexEXT set(VkDescriptorMappingSourcePushIndexEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkDescriptorMappingSourcePushIndexEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDescriptorMappingSourcePushIndexEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDescriptorMappingSourcePushIndexEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDescriptorMappingSourcePushIndexEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDescriptorMappingSourcePushIndexEXT> array(Arena arena, VkDescriptorMappingSourcePushIndexEXT... structs) {
        NativeStructArray<VkDescriptorMappingSourcePushIndexEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDescriptorMappingSourcePushIndexEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDescriptorMappingSourcePushIndexEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDescriptorMappingSourcePushIndexEXT(segment)
        );
    }

}