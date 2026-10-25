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

public final class VkDescriptorMappingSourceShaderRecordIndexEXT
		implements Struct<VkDescriptorMappingSourceShaderRecordIndexEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle HEAP_OFFSET_HANDLE;
	public static final VarHandle SHADER_RECORD_OFFSET_HANDLE;
	public static final VarHandle HEAP_INDEX_STRIDE_HANDLE;
	public static final VarHandle HEAP_ARRAY_STRIDE_HANDLE;
	public static final VarHandle P_EMBEDDED_SAMPLER_HANDLE;
	public static final VarHandle USE_COMBINED_IMAGE_SAMPLER_INDEX_HANDLE;
	public static final VarHandle SAMPLER_HEAP_OFFSET_HANDLE;
	public static final VarHandle SAMPLER_SHADER_RECORD_OFFSET_HANDLE;
	public static final VarHandle SAMPLER_HEAP_INDEX_STRIDE_HANDLE;
	public static final VarHandle SAMPLER_HEAP_ARRAY_STRIDE_HANDLE;

	public static final long HEAP_OFFSET_BYTE_OFFSET;
	public static final long SHADER_RECORD_OFFSET_BYTE_OFFSET;
	public static final long HEAP_INDEX_STRIDE_BYTE_OFFSET;
	public static final long HEAP_ARRAY_STRIDE_BYTE_OFFSET;
	public static final long P_EMBEDDED_SAMPLER_BYTE_OFFSET;
	public static final long USE_COMBINED_IMAGE_SAMPLER_INDEX_BYTE_OFFSET;
	public static final long SAMPLER_HEAP_OFFSET_BYTE_OFFSET;
	public static final long SAMPLER_SHADER_RECORD_OFFSET_BYTE_OFFSET;
	public static final long SAMPLER_HEAP_INDEX_STRIDE_BYTE_OFFSET;
	public static final long SAMPLER_HEAP_ARRAY_STRIDE_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("heapOffset"),
		    JAVA_INT.withName("shaderRecordOffset"),
		    JAVA_INT.withName("heapIndexStride"),
		    JAVA_INT.withName("heapArrayStride"),
		    UNBOUNDED_ADDRESS.withName("pEmbeddedSampler"),
		    JAVA_INT.withName("useCombinedImageSamplerIndex"),
		    JAVA_INT.withName("samplerHeapOffset"),
		    JAVA_INT.withName("samplerShaderRecordOffset"),
		    JAVA_INT.withName("samplerHeapIndexStride"),
		    JAVA_INT.withName("samplerHeapArrayStride"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkDescriptorMappingSourceShaderRecordIndexEXT").withByteAlignment(8);
		
		HEAP_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("heapOffset"));
		SHADER_RECORD_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderRecordOffset"));
		HEAP_INDEX_STRIDE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("heapIndexStride"));
		HEAP_ARRAY_STRIDE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("heapArrayStride"));
		P_EMBEDDED_SAMPLER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pEmbeddedSampler"));
		USE_COMBINED_IMAGE_SAMPLER_INDEX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("useCombinedImageSamplerIndex"));
		SAMPLER_HEAP_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("samplerHeapOffset"));
		SAMPLER_SHADER_RECORD_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("samplerShaderRecordOffset"));
		SAMPLER_HEAP_INDEX_STRIDE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("samplerHeapIndexStride"));
		SAMPLER_HEAP_ARRAY_STRIDE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("samplerHeapArrayStride"));
		
		HEAP_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("heapOffset"));
		SHADER_RECORD_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderRecordOffset"));
		HEAP_INDEX_STRIDE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("heapIndexStride"));
		HEAP_ARRAY_STRIDE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("heapArrayStride"));
		P_EMBEDDED_SAMPLER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pEmbeddedSampler"));
		USE_COMBINED_IMAGE_SAMPLER_INDEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("useCombinedImageSamplerIndex"));
		SAMPLER_HEAP_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("samplerHeapOffset"));
		SAMPLER_SHADER_RECORD_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("samplerShaderRecordOffset"));
		SAMPLER_HEAP_INDEX_STRIDE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("samplerHeapIndexStride"));
		SAMPLER_HEAP_ARRAY_STRIDE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("samplerHeapArrayStride"));
		//@formatter:on
	}

	public VkDescriptorMappingSourceShaderRecordIndexEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkDescriptorMappingSourceShaderRecordIndexEXT(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkDescriptorMappingSourceShaderRecordIndexEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #heapOffset()
    public VkDescriptorMappingSourceShaderRecordIndexEXT heapOffset(int heapOffset) {
    	HEAP_OFFSET_HANDLE.set(segment, 0L, heapOffset);
    	return this;
    }
    
    public int heapOffset() {
    	return (int) HEAP_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderRecordOffset()
    public VkDescriptorMappingSourceShaderRecordIndexEXT shaderRecordOffset(int shaderRecordOffset) {
    	SHADER_RECORD_OFFSET_HANDLE.set(segment, 0L, shaderRecordOffset);
    	return this;
    }
    
    public int shaderRecordOffset() {
    	return (int) SHADER_RECORD_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #heapIndexStride()
    public VkDescriptorMappingSourceShaderRecordIndexEXT heapIndexStride(int heapIndexStride) {
    	HEAP_INDEX_STRIDE_HANDLE.set(segment, 0L, heapIndexStride);
    	return this;
    }
    
    public int heapIndexStride() {
    	return (int) HEAP_INDEX_STRIDE_HANDLE.get(segment, 0L);
    }
    
    /// @see #heapArrayStride()
    public VkDescriptorMappingSourceShaderRecordIndexEXT heapArrayStride(int heapArrayStride) {
    	HEAP_ARRAY_STRIDE_HANDLE.set(segment, 0L, heapArrayStride);
    	return this;
    }
    
    public int heapArrayStride() {
    	return (int) HEAP_ARRAY_STRIDE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pEmbeddedSampler()
    public VkDescriptorMappingSourceShaderRecordIndexEXT pEmbeddedSampler(VkSamplerCreateInfo pEmbeddedSampler) {
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
    public VkDescriptorMappingSourceShaderRecordIndexEXT useCombinedImageSamplerIndex(int useCombinedImageSamplerIndex) {
    	USE_COMBINED_IMAGE_SAMPLER_INDEX_HANDLE.set(segment, 0L, useCombinedImageSamplerIndex);
    	return this;
    }
    
    public int useCombinedImageSamplerIndex() {
    	return (int) USE_COMBINED_IMAGE_SAMPLER_INDEX_HANDLE.get(segment, 0L);
    }
    
    /// @see #samplerHeapOffset()
    public VkDescriptorMappingSourceShaderRecordIndexEXT samplerHeapOffset(int samplerHeapOffset) {
    	SAMPLER_HEAP_OFFSET_HANDLE.set(segment, 0L, samplerHeapOffset);
    	return this;
    }
    
    public int samplerHeapOffset() {
    	return (int) SAMPLER_HEAP_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #samplerShaderRecordOffset()
    public VkDescriptorMappingSourceShaderRecordIndexEXT samplerShaderRecordOffset(int samplerShaderRecordOffset) {
    	SAMPLER_SHADER_RECORD_OFFSET_HANDLE.set(segment, 0L, samplerShaderRecordOffset);
    	return this;
    }
    
    public int samplerShaderRecordOffset() {
    	return (int) SAMPLER_SHADER_RECORD_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #samplerHeapIndexStride()
    public VkDescriptorMappingSourceShaderRecordIndexEXT samplerHeapIndexStride(int samplerHeapIndexStride) {
    	SAMPLER_HEAP_INDEX_STRIDE_HANDLE.set(segment, 0L, samplerHeapIndexStride);
    	return this;
    }
    
    public int samplerHeapIndexStride() {
    	return (int) SAMPLER_HEAP_INDEX_STRIDE_HANDLE.get(segment, 0L);
    }
    
    /// @see #samplerHeapArrayStride()
    public VkDescriptorMappingSourceShaderRecordIndexEXT samplerHeapArrayStride(int samplerHeapArrayStride) {
    	SAMPLER_HEAP_ARRAY_STRIDE_HANDLE.set(segment, 0L, samplerHeapArrayStride);
    	return this;
    }
    
    public int samplerHeapArrayStride() {
    	return (int) SAMPLER_HEAP_ARRAY_STRIDE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkDescriptorMappingSourceShaderRecordIndexEXT set(VkDescriptorMappingSourceShaderRecordIndexEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkDescriptorMappingSourceShaderRecordIndexEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDescriptorMappingSourceShaderRecordIndexEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDescriptorMappingSourceShaderRecordIndexEXT> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkDescriptorMappingSourceShaderRecordIndexEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDescriptorMappingSourceShaderRecordIndexEXT> array(SegmentAllocator allocator, VkDescriptorMappingSourceShaderRecordIndexEXT... structs) {
        NativeStructArray<VkDescriptorMappingSourceShaderRecordIndexEXT> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkDescriptorMappingSourceShaderRecordIndexEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDescriptorMappingSourceShaderRecordIndexEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDescriptorMappingSourceShaderRecordIndexEXT(segment)
        );
    }

}