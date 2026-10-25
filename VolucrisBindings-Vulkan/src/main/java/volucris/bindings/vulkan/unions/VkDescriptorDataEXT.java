/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.unions;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.UnionLayout;
import java.lang.invoke.VarHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativePointerArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.structs.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkDescriptorDataEXT
		implements Struct<VkDescriptorDataEXT> {

	public static final UnionLayout LAYOUT;

	public static final VarHandle P_SAMPLER_HANDLE;
	public static final VarHandle P_COMBINED_IMAGE_SAMPLER_HANDLE;
	public static final VarHandle P_INPUT_ATTACHMENT_IMAGE_HANDLE;
	public static final VarHandle P_SAMPLED_IMAGE_HANDLE;
	public static final VarHandle P_STORAGE_IMAGE_HANDLE;
	public static final VarHandle P_UNIFORM_TEXEL_BUFFER_HANDLE;
	public static final VarHandle P_STORAGE_TEXEL_BUFFER_HANDLE;
	public static final VarHandle P_UNIFORM_BUFFER_HANDLE;
	public static final VarHandle P_STORAGE_BUFFER_HANDLE;
	public static final VarHandle ACCELERATION_STRUCTURE_HANDLE;

	public static final long P_SAMPLER_BYTE_OFFSET;
	public static final long P_COMBINED_IMAGE_SAMPLER_BYTE_OFFSET;
	public static final long P_INPUT_ATTACHMENT_IMAGE_BYTE_OFFSET;
	public static final long P_SAMPLED_IMAGE_BYTE_OFFSET;
	public static final long P_STORAGE_IMAGE_BYTE_OFFSET;
	public static final long P_UNIFORM_TEXEL_BUFFER_BYTE_OFFSET;
	public static final long P_STORAGE_TEXEL_BUFFER_BYTE_OFFSET;
	public static final long P_UNIFORM_BUFFER_BYTE_OFFSET;
	public static final long P_STORAGE_BUFFER_BYTE_OFFSET;
	public static final long ACCELERATION_STRUCTURE_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.unionLayout(
		    UNBOUNDED_ADDRESS.withName("pSampler"),
		    UNBOUNDED_ADDRESS.withName("pCombinedImageSampler"),
		    UNBOUNDED_ADDRESS.withName("pInputAttachmentImage"),
		    UNBOUNDED_ADDRESS.withName("pSampledImage"),
		    UNBOUNDED_ADDRESS.withName("pStorageImage"),
		    UNBOUNDED_ADDRESS.withName("pUniformTexelBuffer"),
		    UNBOUNDED_ADDRESS.withName("pStorageTexelBuffer"),
		    UNBOUNDED_ADDRESS.withName("pUniformBuffer"),
		    UNBOUNDED_ADDRESS.withName("pStorageBuffer"),
		    JAVA_LONG.withName("accelerationStructure")
		).withName("VkDescriptorDataEXT").withByteAlignment(8);
		
		P_SAMPLER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pSampler"));
		P_COMBINED_IMAGE_SAMPLER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pCombinedImageSampler"));
		P_INPUT_ATTACHMENT_IMAGE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pInputAttachmentImage"));
		P_SAMPLED_IMAGE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pSampledImage"));
		P_STORAGE_IMAGE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pStorageImage"));
		P_UNIFORM_TEXEL_BUFFER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pUniformTexelBuffer"));
		P_STORAGE_TEXEL_BUFFER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pStorageTexelBuffer"));
		P_UNIFORM_BUFFER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pUniformBuffer"));
		P_STORAGE_BUFFER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pStorageBuffer"));
		ACCELERATION_STRUCTURE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("accelerationStructure"));
		
		P_SAMPLER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pSampler"));
		P_COMBINED_IMAGE_SAMPLER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pCombinedImageSampler"));
		P_INPUT_ATTACHMENT_IMAGE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pInputAttachmentImage"));
		P_SAMPLED_IMAGE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pSampledImage"));
		P_STORAGE_IMAGE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pStorageImage"));
		P_UNIFORM_TEXEL_BUFFER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pUniformTexelBuffer"));
		P_STORAGE_TEXEL_BUFFER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pStorageTexelBuffer"));
		P_UNIFORM_BUFFER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pUniformBuffer"));
		P_STORAGE_BUFFER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pStorageBuffer"));
		ACCELERATION_STRUCTURE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("accelerationStructure"));
		//@formatter:on
	}

	public VkDescriptorDataEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkDescriptorDataEXT(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkDescriptorDataEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #pSampler()
    public VkDescriptorDataEXT pSampler(NativePointerArray pSampler) {
    	P_SAMPLER_HANDLE.set(segment, 0L, pSampler.memorySegment());
    	return this;
    }
    
    public @Nullable NativePointerArray pSampler() {
    	MemorySegment segment = (MemorySegment) P_SAMPLER_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativePointerArray(segment);
    }
    
    /// @see #pCombinedImageSampler()
    public VkDescriptorDataEXT pCombinedImageSampler(VkDescriptorImageInfo pCombinedImageSampler) {
    	P_COMBINED_IMAGE_SAMPLER_HANDLE.set(segment, 0L, pCombinedImageSampler.memorySegment());
    	return this;
    }
    
    public @Nullable VkDescriptorImageInfo pCombinedImageSampler() {
    	MemorySegment segment = (MemorySegment) P_COMBINED_IMAGE_SAMPLER_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkDescriptorImageInfo(segment);
    }
    
    /// @see #pInputAttachmentImage()
    public VkDescriptorDataEXT pInputAttachmentImage(VkDescriptorImageInfo pInputAttachmentImage) {
    	P_INPUT_ATTACHMENT_IMAGE_HANDLE.set(segment, 0L, pInputAttachmentImage.memorySegment());
    	return this;
    }
    
    public @Nullable VkDescriptorImageInfo pInputAttachmentImage() {
    	MemorySegment segment = (MemorySegment) P_INPUT_ATTACHMENT_IMAGE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkDescriptorImageInfo(segment);
    }
    
    /// @see #pSampledImage()
    public VkDescriptorDataEXT pSampledImage(VkDescriptorImageInfo pSampledImage) {
    	P_SAMPLED_IMAGE_HANDLE.set(segment, 0L, pSampledImage.memorySegment());
    	return this;
    }
    
    public @Nullable VkDescriptorImageInfo pSampledImage() {
    	MemorySegment segment = (MemorySegment) P_SAMPLED_IMAGE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkDescriptorImageInfo(segment);
    }
    
    /// @see #pStorageImage()
    public VkDescriptorDataEXT pStorageImage(VkDescriptorImageInfo pStorageImage) {
    	P_STORAGE_IMAGE_HANDLE.set(segment, 0L, pStorageImage.memorySegment());
    	return this;
    }
    
    public @Nullable VkDescriptorImageInfo pStorageImage() {
    	MemorySegment segment = (MemorySegment) P_STORAGE_IMAGE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkDescriptorImageInfo(segment);
    }
    
    /// @see #pUniformTexelBuffer()
    public VkDescriptorDataEXT pUniformTexelBuffer(VkDescriptorAddressInfoEXT pUniformTexelBuffer) {
    	P_UNIFORM_TEXEL_BUFFER_HANDLE.set(segment, 0L, pUniformTexelBuffer.memorySegment());
    	return this;
    }
    
    public @Nullable VkDescriptorAddressInfoEXT pUniformTexelBuffer() {
    	MemorySegment segment = (MemorySegment) P_UNIFORM_TEXEL_BUFFER_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkDescriptorAddressInfoEXT(segment);
    }
    
    /// @see #pStorageTexelBuffer()
    public VkDescriptorDataEXT pStorageTexelBuffer(VkDescriptorAddressInfoEXT pStorageTexelBuffer) {
    	P_STORAGE_TEXEL_BUFFER_HANDLE.set(segment, 0L, pStorageTexelBuffer.memorySegment());
    	return this;
    }
    
    public @Nullable VkDescriptorAddressInfoEXT pStorageTexelBuffer() {
    	MemorySegment segment = (MemorySegment) P_STORAGE_TEXEL_BUFFER_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkDescriptorAddressInfoEXT(segment);
    }
    
    /// @see #pUniformBuffer()
    public VkDescriptorDataEXT pUniformBuffer(VkDescriptorAddressInfoEXT pUniformBuffer) {
    	P_UNIFORM_BUFFER_HANDLE.set(segment, 0L, pUniformBuffer.memorySegment());
    	return this;
    }
    
    public @Nullable VkDescriptorAddressInfoEXT pUniformBuffer() {
    	MemorySegment segment = (MemorySegment) P_UNIFORM_BUFFER_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkDescriptorAddressInfoEXT(segment);
    }
    
    /// @see #pStorageBuffer()
    public VkDescriptorDataEXT pStorageBuffer(VkDescriptorAddressInfoEXT pStorageBuffer) {
    	P_STORAGE_BUFFER_HANDLE.set(segment, 0L, pStorageBuffer.memorySegment());
    	return this;
    }
    
    public @Nullable VkDescriptorAddressInfoEXT pStorageBuffer() {
    	MemorySegment segment = (MemorySegment) P_STORAGE_BUFFER_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkDescriptorAddressInfoEXT(segment);
    }
    
    /// @see #accelerationStructure()
    public VkDescriptorDataEXT accelerationStructure(long accelerationStructure) {
    	ACCELERATION_STRUCTURE_HANDLE.set(segment, 0L, accelerationStructure);
    	return this;
    }
    
    public long accelerationStructure() {
    	return (long) ACCELERATION_STRUCTURE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkDescriptorDataEXT set(VkDescriptorDataEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkDescriptorDataEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDescriptorDataEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDescriptorDataEXT> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkDescriptorDataEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDescriptorDataEXT> array(SegmentAllocator allocator, VkDescriptorDataEXT... structs) {
        NativeStructArray<VkDescriptorDataEXT> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkDescriptorDataEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDescriptorDataEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDescriptorDataEXT(segment)
        );
    }

}