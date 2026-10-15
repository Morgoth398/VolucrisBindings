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

public final class VkPhysicalDeviceDescriptorBufferPropertiesEXT
		implements Struct<VkPhysicalDeviceDescriptorBufferPropertiesEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle COMBINED_IMAGE_SAMPLER_DESCRIPTOR_SINGLE_ARRAY_HANDLE;
	public static final VarHandle BUFFERLESS_PUSH_DESCRIPTORS_HANDLE;
	public static final VarHandle ALLOW_SAMPLER_IMAGE_VIEW_POST_SUBMIT_CREATION_HANDLE;
	public static final VarHandle DESCRIPTOR_BUFFER_OFFSET_ALIGNMENT_HANDLE;
	public static final VarHandle MAX_DESCRIPTOR_BUFFER_BINDINGS_HANDLE;
	public static final VarHandle MAX_RESOURCE_DESCRIPTOR_BUFFER_BINDINGS_HANDLE;
	public static final VarHandle MAX_SAMPLER_DESCRIPTOR_BUFFER_BINDINGS_HANDLE;
	public static final VarHandle MAX_EMBEDDED_IMMUTABLE_SAMPLER_BINDINGS_HANDLE;
	public static final VarHandle MAX_EMBEDDED_IMMUTABLE_SAMPLERS_HANDLE;
	public static final VarHandle BUFFER_CAPTURE_REPLAY_DESCRIPTOR_DATA_SIZE_HANDLE;
	public static final VarHandle IMAGE_CAPTURE_REPLAY_DESCRIPTOR_DATA_SIZE_HANDLE;
	public static final VarHandle IMAGE_VIEW_CAPTURE_REPLAY_DESCRIPTOR_DATA_SIZE_HANDLE;
	public static final VarHandle SAMPLER_CAPTURE_REPLAY_DESCRIPTOR_DATA_SIZE_HANDLE;
	public static final VarHandle ACCELERATION_STRUCTURE_CAPTURE_REPLAY_DESCRIPTOR_DATA_SIZE_HANDLE;
	public static final VarHandle SAMPLER_DESCRIPTOR_SIZE_HANDLE;
	public static final VarHandle COMBINED_IMAGE_SAMPLER_DESCRIPTOR_SIZE_HANDLE;
	public static final VarHandle SAMPLED_IMAGE_DESCRIPTOR_SIZE_HANDLE;
	public static final VarHandle STORAGE_IMAGE_DESCRIPTOR_SIZE_HANDLE;
	public static final VarHandle UNIFORM_TEXEL_BUFFER_DESCRIPTOR_SIZE_HANDLE;
	public static final VarHandle ROBUST_UNIFORM_TEXEL_BUFFER_DESCRIPTOR_SIZE_HANDLE;
	public static final VarHandle STORAGE_TEXEL_BUFFER_DESCRIPTOR_SIZE_HANDLE;
	public static final VarHandle ROBUST_STORAGE_TEXEL_BUFFER_DESCRIPTOR_SIZE_HANDLE;
	public static final VarHandle UNIFORM_BUFFER_DESCRIPTOR_SIZE_HANDLE;
	public static final VarHandle ROBUST_UNIFORM_BUFFER_DESCRIPTOR_SIZE_HANDLE;
	public static final VarHandle STORAGE_BUFFER_DESCRIPTOR_SIZE_HANDLE;
	public static final VarHandle ROBUST_STORAGE_BUFFER_DESCRIPTOR_SIZE_HANDLE;
	public static final VarHandle INPUT_ATTACHMENT_DESCRIPTOR_SIZE_HANDLE;
	public static final VarHandle ACCELERATION_STRUCTURE_DESCRIPTOR_SIZE_HANDLE;
	public static final VarHandle MAX_SAMPLER_DESCRIPTOR_BUFFER_RANGE_HANDLE;
	public static final VarHandle MAX_RESOURCE_DESCRIPTOR_BUFFER_RANGE_HANDLE;
	public static final VarHandle SAMPLER_DESCRIPTOR_BUFFER_ADDRESS_SPACE_SIZE_HANDLE;
	public static final VarHandle RESOURCE_DESCRIPTOR_BUFFER_ADDRESS_SPACE_SIZE_HANDLE;
	public static final VarHandle DESCRIPTOR_BUFFER_ADDRESS_SPACE_SIZE_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long COMBINED_IMAGE_SAMPLER_DESCRIPTOR_SINGLE_ARRAY_BYTE_OFFSET;
	public static final long BUFFERLESS_PUSH_DESCRIPTORS_BYTE_OFFSET;
	public static final long ALLOW_SAMPLER_IMAGE_VIEW_POST_SUBMIT_CREATION_BYTE_OFFSET;
	public static final long DESCRIPTOR_BUFFER_OFFSET_ALIGNMENT_BYTE_OFFSET;
	public static final long MAX_DESCRIPTOR_BUFFER_BINDINGS_BYTE_OFFSET;
	public static final long MAX_RESOURCE_DESCRIPTOR_BUFFER_BINDINGS_BYTE_OFFSET;
	public static final long MAX_SAMPLER_DESCRIPTOR_BUFFER_BINDINGS_BYTE_OFFSET;
	public static final long MAX_EMBEDDED_IMMUTABLE_SAMPLER_BINDINGS_BYTE_OFFSET;
	public static final long MAX_EMBEDDED_IMMUTABLE_SAMPLERS_BYTE_OFFSET;
	public static final long BUFFER_CAPTURE_REPLAY_DESCRIPTOR_DATA_SIZE_BYTE_OFFSET;
	public static final long IMAGE_CAPTURE_REPLAY_DESCRIPTOR_DATA_SIZE_BYTE_OFFSET;
	public static final long IMAGE_VIEW_CAPTURE_REPLAY_DESCRIPTOR_DATA_SIZE_BYTE_OFFSET;
	public static final long SAMPLER_CAPTURE_REPLAY_DESCRIPTOR_DATA_SIZE_BYTE_OFFSET;
	public static final long ACCELERATION_STRUCTURE_CAPTURE_REPLAY_DESCRIPTOR_DATA_SIZE_BYTE_OFFSET;
	public static final long SAMPLER_DESCRIPTOR_SIZE_BYTE_OFFSET;
	public static final long COMBINED_IMAGE_SAMPLER_DESCRIPTOR_SIZE_BYTE_OFFSET;
	public static final long SAMPLED_IMAGE_DESCRIPTOR_SIZE_BYTE_OFFSET;
	public static final long STORAGE_IMAGE_DESCRIPTOR_SIZE_BYTE_OFFSET;
	public static final long UNIFORM_TEXEL_BUFFER_DESCRIPTOR_SIZE_BYTE_OFFSET;
	public static final long ROBUST_UNIFORM_TEXEL_BUFFER_DESCRIPTOR_SIZE_BYTE_OFFSET;
	public static final long STORAGE_TEXEL_BUFFER_DESCRIPTOR_SIZE_BYTE_OFFSET;
	public static final long ROBUST_STORAGE_TEXEL_BUFFER_DESCRIPTOR_SIZE_BYTE_OFFSET;
	public static final long UNIFORM_BUFFER_DESCRIPTOR_SIZE_BYTE_OFFSET;
	public static final long ROBUST_UNIFORM_BUFFER_DESCRIPTOR_SIZE_BYTE_OFFSET;
	public static final long STORAGE_BUFFER_DESCRIPTOR_SIZE_BYTE_OFFSET;
	public static final long ROBUST_STORAGE_BUFFER_DESCRIPTOR_SIZE_BYTE_OFFSET;
	public static final long INPUT_ATTACHMENT_DESCRIPTOR_SIZE_BYTE_OFFSET;
	public static final long ACCELERATION_STRUCTURE_DESCRIPTOR_SIZE_BYTE_OFFSET;
	public static final long MAX_SAMPLER_DESCRIPTOR_BUFFER_RANGE_BYTE_OFFSET;
	public static final long MAX_RESOURCE_DESCRIPTOR_BUFFER_RANGE_BYTE_OFFSET;
	public static final long SAMPLER_DESCRIPTOR_BUFFER_ADDRESS_SPACE_SIZE_BYTE_OFFSET;
	public static final long RESOURCE_DESCRIPTOR_BUFFER_ADDRESS_SPACE_SIZE_BYTE_OFFSET;
	public static final long DESCRIPTOR_BUFFER_ADDRESS_SPACE_SIZE_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("combinedImageSamplerDescriptorSingleArray"),
		    JAVA_INT.withName("bufferlessPushDescriptors"),
		    JAVA_INT.withName("allowSamplerImageViewPostSubmitCreation"),
		    MemoryLayout.paddingLayout(4),
		    JAVA_LONG.withName("descriptorBufferOffsetAlignment"),
		    JAVA_INT.withName("maxDescriptorBufferBindings"),
		    JAVA_INT.withName("maxResourceDescriptorBufferBindings"),
		    JAVA_INT.withName("maxSamplerDescriptorBufferBindings"),
		    JAVA_INT.withName("maxEmbeddedImmutableSamplerBindings"),
		    JAVA_INT.withName("maxEmbeddedImmutableSamplers"),
		    MemoryLayout.paddingLayout(4),
		    JAVA_LONG.withName("bufferCaptureReplayDescriptorDataSize"),
		    JAVA_LONG.withName("imageCaptureReplayDescriptorDataSize"),
		    JAVA_LONG.withName("imageViewCaptureReplayDescriptorDataSize"),
		    JAVA_LONG.withName("samplerCaptureReplayDescriptorDataSize"),
		    JAVA_LONG.withName("accelerationStructureCaptureReplayDescriptorDataSize"),
		    JAVA_LONG.withName("samplerDescriptorSize"),
		    JAVA_LONG.withName("combinedImageSamplerDescriptorSize"),
		    JAVA_LONG.withName("sampledImageDescriptorSize"),
		    JAVA_LONG.withName("storageImageDescriptorSize"),
		    JAVA_LONG.withName("uniformTexelBufferDescriptorSize"),
		    JAVA_LONG.withName("robustUniformTexelBufferDescriptorSize"),
		    JAVA_LONG.withName("storageTexelBufferDescriptorSize"),
		    JAVA_LONG.withName("robustStorageTexelBufferDescriptorSize"),
		    JAVA_LONG.withName("uniformBufferDescriptorSize"),
		    JAVA_LONG.withName("robustUniformBufferDescriptorSize"),
		    JAVA_LONG.withName("storageBufferDescriptorSize"),
		    JAVA_LONG.withName("robustStorageBufferDescriptorSize"),
		    JAVA_LONG.withName("inputAttachmentDescriptorSize"),
		    JAVA_LONG.withName("accelerationStructureDescriptorSize"),
		    JAVA_LONG.withName("maxSamplerDescriptorBufferRange"),
		    JAVA_LONG.withName("maxResourceDescriptorBufferRange"),
		    JAVA_LONG.withName("samplerDescriptorBufferAddressSpaceSize"),
		    JAVA_LONG.withName("resourceDescriptorBufferAddressSpaceSize"),
		    JAVA_LONG.withName("descriptorBufferAddressSpaceSize")
		).withName("VkPhysicalDeviceDescriptorBufferPropertiesEXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		COMBINED_IMAGE_SAMPLER_DESCRIPTOR_SINGLE_ARRAY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("combinedImageSamplerDescriptorSingleArray"));
		BUFFERLESS_PUSH_DESCRIPTORS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("bufferlessPushDescriptors"));
		ALLOW_SAMPLER_IMAGE_VIEW_POST_SUBMIT_CREATION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("allowSamplerImageViewPostSubmitCreation"));
		DESCRIPTOR_BUFFER_OFFSET_ALIGNMENT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("descriptorBufferOffsetAlignment"));
		MAX_DESCRIPTOR_BUFFER_BINDINGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxDescriptorBufferBindings"));
		MAX_RESOURCE_DESCRIPTOR_BUFFER_BINDINGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxResourceDescriptorBufferBindings"));
		MAX_SAMPLER_DESCRIPTOR_BUFFER_BINDINGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxSamplerDescriptorBufferBindings"));
		MAX_EMBEDDED_IMMUTABLE_SAMPLER_BINDINGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxEmbeddedImmutableSamplerBindings"));
		MAX_EMBEDDED_IMMUTABLE_SAMPLERS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxEmbeddedImmutableSamplers"));
		BUFFER_CAPTURE_REPLAY_DESCRIPTOR_DATA_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("bufferCaptureReplayDescriptorDataSize"));
		IMAGE_CAPTURE_REPLAY_DESCRIPTOR_DATA_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("imageCaptureReplayDescriptorDataSize"));
		IMAGE_VIEW_CAPTURE_REPLAY_DESCRIPTOR_DATA_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("imageViewCaptureReplayDescriptorDataSize"));
		SAMPLER_CAPTURE_REPLAY_DESCRIPTOR_DATA_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("samplerCaptureReplayDescriptorDataSize"));
		ACCELERATION_STRUCTURE_CAPTURE_REPLAY_DESCRIPTOR_DATA_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("accelerationStructureCaptureReplayDescriptorDataSize"));
		SAMPLER_DESCRIPTOR_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("samplerDescriptorSize"));
		COMBINED_IMAGE_SAMPLER_DESCRIPTOR_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("combinedImageSamplerDescriptorSize"));
		SAMPLED_IMAGE_DESCRIPTOR_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sampledImageDescriptorSize"));
		STORAGE_IMAGE_DESCRIPTOR_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("storageImageDescriptorSize"));
		UNIFORM_TEXEL_BUFFER_DESCRIPTOR_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("uniformTexelBufferDescriptorSize"));
		ROBUST_UNIFORM_TEXEL_BUFFER_DESCRIPTOR_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("robustUniformTexelBufferDescriptorSize"));
		STORAGE_TEXEL_BUFFER_DESCRIPTOR_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("storageTexelBufferDescriptorSize"));
		ROBUST_STORAGE_TEXEL_BUFFER_DESCRIPTOR_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("robustStorageTexelBufferDescriptorSize"));
		UNIFORM_BUFFER_DESCRIPTOR_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("uniformBufferDescriptorSize"));
		ROBUST_UNIFORM_BUFFER_DESCRIPTOR_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("robustUniformBufferDescriptorSize"));
		STORAGE_BUFFER_DESCRIPTOR_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("storageBufferDescriptorSize"));
		ROBUST_STORAGE_BUFFER_DESCRIPTOR_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("robustStorageBufferDescriptorSize"));
		INPUT_ATTACHMENT_DESCRIPTOR_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("inputAttachmentDescriptorSize"));
		ACCELERATION_STRUCTURE_DESCRIPTOR_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("accelerationStructureDescriptorSize"));
		MAX_SAMPLER_DESCRIPTOR_BUFFER_RANGE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxSamplerDescriptorBufferRange"));
		MAX_RESOURCE_DESCRIPTOR_BUFFER_RANGE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxResourceDescriptorBufferRange"));
		SAMPLER_DESCRIPTOR_BUFFER_ADDRESS_SPACE_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("samplerDescriptorBufferAddressSpaceSize"));
		RESOURCE_DESCRIPTOR_BUFFER_ADDRESS_SPACE_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("resourceDescriptorBufferAddressSpaceSize"));
		DESCRIPTOR_BUFFER_ADDRESS_SPACE_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("descriptorBufferAddressSpaceSize"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		COMBINED_IMAGE_SAMPLER_DESCRIPTOR_SINGLE_ARRAY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("combinedImageSamplerDescriptorSingleArray"));
		BUFFERLESS_PUSH_DESCRIPTORS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("bufferlessPushDescriptors"));
		ALLOW_SAMPLER_IMAGE_VIEW_POST_SUBMIT_CREATION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("allowSamplerImageViewPostSubmitCreation"));
		DESCRIPTOR_BUFFER_OFFSET_ALIGNMENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("descriptorBufferOffsetAlignment"));
		MAX_DESCRIPTOR_BUFFER_BINDINGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorBufferBindings"));
		MAX_RESOURCE_DESCRIPTOR_BUFFER_BINDINGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxResourceDescriptorBufferBindings"));
		MAX_SAMPLER_DESCRIPTOR_BUFFER_BINDINGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxSamplerDescriptorBufferBindings"));
		MAX_EMBEDDED_IMMUTABLE_SAMPLER_BINDINGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxEmbeddedImmutableSamplerBindings"));
		MAX_EMBEDDED_IMMUTABLE_SAMPLERS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxEmbeddedImmutableSamplers"));
		BUFFER_CAPTURE_REPLAY_DESCRIPTOR_DATA_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("bufferCaptureReplayDescriptorDataSize"));
		IMAGE_CAPTURE_REPLAY_DESCRIPTOR_DATA_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("imageCaptureReplayDescriptorDataSize"));
		IMAGE_VIEW_CAPTURE_REPLAY_DESCRIPTOR_DATA_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("imageViewCaptureReplayDescriptorDataSize"));
		SAMPLER_CAPTURE_REPLAY_DESCRIPTOR_DATA_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("samplerCaptureReplayDescriptorDataSize"));
		ACCELERATION_STRUCTURE_CAPTURE_REPLAY_DESCRIPTOR_DATA_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("accelerationStructureCaptureReplayDescriptorDataSize"));
		SAMPLER_DESCRIPTOR_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("samplerDescriptorSize"));
		COMBINED_IMAGE_SAMPLER_DESCRIPTOR_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("combinedImageSamplerDescriptorSize"));
		SAMPLED_IMAGE_DESCRIPTOR_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sampledImageDescriptorSize"));
		STORAGE_IMAGE_DESCRIPTOR_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("storageImageDescriptorSize"));
		UNIFORM_TEXEL_BUFFER_DESCRIPTOR_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("uniformTexelBufferDescriptorSize"));
		ROBUST_UNIFORM_TEXEL_BUFFER_DESCRIPTOR_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("robustUniformTexelBufferDescriptorSize"));
		STORAGE_TEXEL_BUFFER_DESCRIPTOR_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("storageTexelBufferDescriptorSize"));
		ROBUST_STORAGE_TEXEL_BUFFER_DESCRIPTOR_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("robustStorageTexelBufferDescriptorSize"));
		UNIFORM_BUFFER_DESCRIPTOR_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("uniformBufferDescriptorSize"));
		ROBUST_UNIFORM_BUFFER_DESCRIPTOR_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("robustUniformBufferDescriptorSize"));
		STORAGE_BUFFER_DESCRIPTOR_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("storageBufferDescriptorSize"));
		ROBUST_STORAGE_BUFFER_DESCRIPTOR_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("robustStorageBufferDescriptorSize"));
		INPUT_ATTACHMENT_DESCRIPTOR_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("inputAttachmentDescriptorSize"));
		ACCELERATION_STRUCTURE_DESCRIPTOR_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("accelerationStructureDescriptorSize"));
		MAX_SAMPLER_DESCRIPTOR_BUFFER_RANGE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxSamplerDescriptorBufferRange"));
		MAX_RESOURCE_DESCRIPTOR_BUFFER_RANGE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxResourceDescriptorBufferRange"));
		SAMPLER_DESCRIPTOR_BUFFER_ADDRESS_SPACE_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("samplerDescriptorBufferAddressSpaceSize"));
		RESOURCE_DESCRIPTOR_BUFFER_ADDRESS_SPACE_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("resourceDescriptorBufferAddressSpaceSize"));
		DESCRIPTOR_BUFFER_ADDRESS_SPACE_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("descriptorBufferAddressSpaceSize"));
		//@formatter:on
	}

	public VkPhysicalDeviceDescriptorBufferPropertiesEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceDescriptorBufferPropertiesEXT(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceDescriptorBufferPropertiesEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #combinedImageSamplerDescriptorSingleArray()
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT combinedImageSamplerDescriptorSingleArray(int combinedImageSamplerDescriptorSingleArray) {
    	COMBINED_IMAGE_SAMPLER_DESCRIPTOR_SINGLE_ARRAY_HANDLE.set(segment, 0L, combinedImageSamplerDescriptorSingleArray);
    	return this;
    }
    
    public int combinedImageSamplerDescriptorSingleArray() {
    	return (int) COMBINED_IMAGE_SAMPLER_DESCRIPTOR_SINGLE_ARRAY_HANDLE.get(segment, 0L);
    }
    
    /// @see #bufferlessPushDescriptors()
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT bufferlessPushDescriptors(int bufferlessPushDescriptors) {
    	BUFFERLESS_PUSH_DESCRIPTORS_HANDLE.set(segment, 0L, bufferlessPushDescriptors);
    	return this;
    }
    
    public int bufferlessPushDescriptors() {
    	return (int) BUFFERLESS_PUSH_DESCRIPTORS_HANDLE.get(segment, 0L);
    }
    
    /// @see #allowSamplerImageViewPostSubmitCreation()
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT allowSamplerImageViewPostSubmitCreation(int allowSamplerImageViewPostSubmitCreation) {
    	ALLOW_SAMPLER_IMAGE_VIEW_POST_SUBMIT_CREATION_HANDLE.set(segment, 0L, allowSamplerImageViewPostSubmitCreation);
    	return this;
    }
    
    public int allowSamplerImageViewPostSubmitCreation() {
    	return (int) ALLOW_SAMPLER_IMAGE_VIEW_POST_SUBMIT_CREATION_HANDLE.get(segment, 0L);
    }
    
    /// @see #descriptorBufferOffsetAlignment()
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT descriptorBufferOffsetAlignment(long descriptorBufferOffsetAlignment) {
    	DESCRIPTOR_BUFFER_OFFSET_ALIGNMENT_HANDLE.set(segment, 0L, descriptorBufferOffsetAlignment);
    	return this;
    }
    
    public long descriptorBufferOffsetAlignment() {
    	return (long) DESCRIPTOR_BUFFER_OFFSET_ALIGNMENT_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxDescriptorBufferBindings()
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT maxDescriptorBufferBindings(int maxDescriptorBufferBindings) {
    	MAX_DESCRIPTOR_BUFFER_BINDINGS_HANDLE.set(segment, 0L, maxDescriptorBufferBindings);
    	return this;
    }
    
    public int maxDescriptorBufferBindings() {
    	return (int) MAX_DESCRIPTOR_BUFFER_BINDINGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxResourceDescriptorBufferBindings()
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT maxResourceDescriptorBufferBindings(int maxResourceDescriptorBufferBindings) {
    	MAX_RESOURCE_DESCRIPTOR_BUFFER_BINDINGS_HANDLE.set(segment, 0L, maxResourceDescriptorBufferBindings);
    	return this;
    }
    
    public int maxResourceDescriptorBufferBindings() {
    	return (int) MAX_RESOURCE_DESCRIPTOR_BUFFER_BINDINGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxSamplerDescriptorBufferBindings()
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT maxSamplerDescriptorBufferBindings(int maxSamplerDescriptorBufferBindings) {
    	MAX_SAMPLER_DESCRIPTOR_BUFFER_BINDINGS_HANDLE.set(segment, 0L, maxSamplerDescriptorBufferBindings);
    	return this;
    }
    
    public int maxSamplerDescriptorBufferBindings() {
    	return (int) MAX_SAMPLER_DESCRIPTOR_BUFFER_BINDINGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxEmbeddedImmutableSamplerBindings()
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT maxEmbeddedImmutableSamplerBindings(int maxEmbeddedImmutableSamplerBindings) {
    	MAX_EMBEDDED_IMMUTABLE_SAMPLER_BINDINGS_HANDLE.set(segment, 0L, maxEmbeddedImmutableSamplerBindings);
    	return this;
    }
    
    public int maxEmbeddedImmutableSamplerBindings() {
    	return (int) MAX_EMBEDDED_IMMUTABLE_SAMPLER_BINDINGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxEmbeddedImmutableSamplers()
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT maxEmbeddedImmutableSamplers(int maxEmbeddedImmutableSamplers) {
    	MAX_EMBEDDED_IMMUTABLE_SAMPLERS_HANDLE.set(segment, 0L, maxEmbeddedImmutableSamplers);
    	return this;
    }
    
    public int maxEmbeddedImmutableSamplers() {
    	return (int) MAX_EMBEDDED_IMMUTABLE_SAMPLERS_HANDLE.get(segment, 0L);
    }
    
    /// @see #bufferCaptureReplayDescriptorDataSize()
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT bufferCaptureReplayDescriptorDataSize(long bufferCaptureReplayDescriptorDataSize) {
    	BUFFER_CAPTURE_REPLAY_DESCRIPTOR_DATA_SIZE_HANDLE.set(segment, 0L, bufferCaptureReplayDescriptorDataSize);
    	return this;
    }
    
    public long bufferCaptureReplayDescriptorDataSize() {
    	return (long) BUFFER_CAPTURE_REPLAY_DESCRIPTOR_DATA_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #imageCaptureReplayDescriptorDataSize()
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT imageCaptureReplayDescriptorDataSize(long imageCaptureReplayDescriptorDataSize) {
    	IMAGE_CAPTURE_REPLAY_DESCRIPTOR_DATA_SIZE_HANDLE.set(segment, 0L, imageCaptureReplayDescriptorDataSize);
    	return this;
    }
    
    public long imageCaptureReplayDescriptorDataSize() {
    	return (long) IMAGE_CAPTURE_REPLAY_DESCRIPTOR_DATA_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #imageViewCaptureReplayDescriptorDataSize()
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT imageViewCaptureReplayDescriptorDataSize(long imageViewCaptureReplayDescriptorDataSize) {
    	IMAGE_VIEW_CAPTURE_REPLAY_DESCRIPTOR_DATA_SIZE_HANDLE.set(segment, 0L, imageViewCaptureReplayDescriptorDataSize);
    	return this;
    }
    
    public long imageViewCaptureReplayDescriptorDataSize() {
    	return (long) IMAGE_VIEW_CAPTURE_REPLAY_DESCRIPTOR_DATA_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #samplerCaptureReplayDescriptorDataSize()
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT samplerCaptureReplayDescriptorDataSize(long samplerCaptureReplayDescriptorDataSize) {
    	SAMPLER_CAPTURE_REPLAY_DESCRIPTOR_DATA_SIZE_HANDLE.set(segment, 0L, samplerCaptureReplayDescriptorDataSize);
    	return this;
    }
    
    public long samplerCaptureReplayDescriptorDataSize() {
    	return (long) SAMPLER_CAPTURE_REPLAY_DESCRIPTOR_DATA_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #accelerationStructureCaptureReplayDescriptorDataSize()
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT accelerationStructureCaptureReplayDescriptorDataSize(long accelerationStructureCaptureReplayDescriptorDataSize) {
    	ACCELERATION_STRUCTURE_CAPTURE_REPLAY_DESCRIPTOR_DATA_SIZE_HANDLE.set(segment, 0L, accelerationStructureCaptureReplayDescriptorDataSize);
    	return this;
    }
    
    public long accelerationStructureCaptureReplayDescriptorDataSize() {
    	return (long) ACCELERATION_STRUCTURE_CAPTURE_REPLAY_DESCRIPTOR_DATA_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #samplerDescriptorSize()
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT samplerDescriptorSize(long samplerDescriptorSize) {
    	SAMPLER_DESCRIPTOR_SIZE_HANDLE.set(segment, 0L, samplerDescriptorSize);
    	return this;
    }
    
    public long samplerDescriptorSize() {
    	return (long) SAMPLER_DESCRIPTOR_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #combinedImageSamplerDescriptorSize()
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT combinedImageSamplerDescriptorSize(long combinedImageSamplerDescriptorSize) {
    	COMBINED_IMAGE_SAMPLER_DESCRIPTOR_SIZE_HANDLE.set(segment, 0L, combinedImageSamplerDescriptorSize);
    	return this;
    }
    
    public long combinedImageSamplerDescriptorSize() {
    	return (long) COMBINED_IMAGE_SAMPLER_DESCRIPTOR_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #sampledImageDescriptorSize()
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT sampledImageDescriptorSize(long sampledImageDescriptorSize) {
    	SAMPLED_IMAGE_DESCRIPTOR_SIZE_HANDLE.set(segment, 0L, sampledImageDescriptorSize);
    	return this;
    }
    
    public long sampledImageDescriptorSize() {
    	return (long) SAMPLED_IMAGE_DESCRIPTOR_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #storageImageDescriptorSize()
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT storageImageDescriptorSize(long storageImageDescriptorSize) {
    	STORAGE_IMAGE_DESCRIPTOR_SIZE_HANDLE.set(segment, 0L, storageImageDescriptorSize);
    	return this;
    }
    
    public long storageImageDescriptorSize() {
    	return (long) STORAGE_IMAGE_DESCRIPTOR_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #uniformTexelBufferDescriptorSize()
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT uniformTexelBufferDescriptorSize(long uniformTexelBufferDescriptorSize) {
    	UNIFORM_TEXEL_BUFFER_DESCRIPTOR_SIZE_HANDLE.set(segment, 0L, uniformTexelBufferDescriptorSize);
    	return this;
    }
    
    public long uniformTexelBufferDescriptorSize() {
    	return (long) UNIFORM_TEXEL_BUFFER_DESCRIPTOR_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #robustUniformTexelBufferDescriptorSize()
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT robustUniformTexelBufferDescriptorSize(long robustUniformTexelBufferDescriptorSize) {
    	ROBUST_UNIFORM_TEXEL_BUFFER_DESCRIPTOR_SIZE_HANDLE.set(segment, 0L, robustUniformTexelBufferDescriptorSize);
    	return this;
    }
    
    public long robustUniformTexelBufferDescriptorSize() {
    	return (long) ROBUST_UNIFORM_TEXEL_BUFFER_DESCRIPTOR_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #storageTexelBufferDescriptorSize()
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT storageTexelBufferDescriptorSize(long storageTexelBufferDescriptorSize) {
    	STORAGE_TEXEL_BUFFER_DESCRIPTOR_SIZE_HANDLE.set(segment, 0L, storageTexelBufferDescriptorSize);
    	return this;
    }
    
    public long storageTexelBufferDescriptorSize() {
    	return (long) STORAGE_TEXEL_BUFFER_DESCRIPTOR_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #robustStorageTexelBufferDescriptorSize()
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT robustStorageTexelBufferDescriptorSize(long robustStorageTexelBufferDescriptorSize) {
    	ROBUST_STORAGE_TEXEL_BUFFER_DESCRIPTOR_SIZE_HANDLE.set(segment, 0L, robustStorageTexelBufferDescriptorSize);
    	return this;
    }
    
    public long robustStorageTexelBufferDescriptorSize() {
    	return (long) ROBUST_STORAGE_TEXEL_BUFFER_DESCRIPTOR_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #uniformBufferDescriptorSize()
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT uniformBufferDescriptorSize(long uniformBufferDescriptorSize) {
    	UNIFORM_BUFFER_DESCRIPTOR_SIZE_HANDLE.set(segment, 0L, uniformBufferDescriptorSize);
    	return this;
    }
    
    public long uniformBufferDescriptorSize() {
    	return (long) UNIFORM_BUFFER_DESCRIPTOR_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #robustUniformBufferDescriptorSize()
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT robustUniformBufferDescriptorSize(long robustUniformBufferDescriptorSize) {
    	ROBUST_UNIFORM_BUFFER_DESCRIPTOR_SIZE_HANDLE.set(segment, 0L, robustUniformBufferDescriptorSize);
    	return this;
    }
    
    public long robustUniformBufferDescriptorSize() {
    	return (long) ROBUST_UNIFORM_BUFFER_DESCRIPTOR_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #storageBufferDescriptorSize()
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT storageBufferDescriptorSize(long storageBufferDescriptorSize) {
    	STORAGE_BUFFER_DESCRIPTOR_SIZE_HANDLE.set(segment, 0L, storageBufferDescriptorSize);
    	return this;
    }
    
    public long storageBufferDescriptorSize() {
    	return (long) STORAGE_BUFFER_DESCRIPTOR_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #robustStorageBufferDescriptorSize()
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT robustStorageBufferDescriptorSize(long robustStorageBufferDescriptorSize) {
    	ROBUST_STORAGE_BUFFER_DESCRIPTOR_SIZE_HANDLE.set(segment, 0L, robustStorageBufferDescriptorSize);
    	return this;
    }
    
    public long robustStorageBufferDescriptorSize() {
    	return (long) ROBUST_STORAGE_BUFFER_DESCRIPTOR_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #inputAttachmentDescriptorSize()
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT inputAttachmentDescriptorSize(long inputAttachmentDescriptorSize) {
    	INPUT_ATTACHMENT_DESCRIPTOR_SIZE_HANDLE.set(segment, 0L, inputAttachmentDescriptorSize);
    	return this;
    }
    
    public long inputAttachmentDescriptorSize() {
    	return (long) INPUT_ATTACHMENT_DESCRIPTOR_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #accelerationStructureDescriptorSize()
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT accelerationStructureDescriptorSize(long accelerationStructureDescriptorSize) {
    	ACCELERATION_STRUCTURE_DESCRIPTOR_SIZE_HANDLE.set(segment, 0L, accelerationStructureDescriptorSize);
    	return this;
    }
    
    public long accelerationStructureDescriptorSize() {
    	return (long) ACCELERATION_STRUCTURE_DESCRIPTOR_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxSamplerDescriptorBufferRange()
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT maxSamplerDescriptorBufferRange(long maxSamplerDescriptorBufferRange) {
    	MAX_SAMPLER_DESCRIPTOR_BUFFER_RANGE_HANDLE.set(segment, 0L, maxSamplerDescriptorBufferRange);
    	return this;
    }
    
    public long maxSamplerDescriptorBufferRange() {
    	return (long) MAX_SAMPLER_DESCRIPTOR_BUFFER_RANGE_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxResourceDescriptorBufferRange()
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT maxResourceDescriptorBufferRange(long maxResourceDescriptorBufferRange) {
    	MAX_RESOURCE_DESCRIPTOR_BUFFER_RANGE_HANDLE.set(segment, 0L, maxResourceDescriptorBufferRange);
    	return this;
    }
    
    public long maxResourceDescriptorBufferRange() {
    	return (long) MAX_RESOURCE_DESCRIPTOR_BUFFER_RANGE_HANDLE.get(segment, 0L);
    }
    
    /// @see #samplerDescriptorBufferAddressSpaceSize()
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT samplerDescriptorBufferAddressSpaceSize(long samplerDescriptorBufferAddressSpaceSize) {
    	SAMPLER_DESCRIPTOR_BUFFER_ADDRESS_SPACE_SIZE_HANDLE.set(segment, 0L, samplerDescriptorBufferAddressSpaceSize);
    	return this;
    }
    
    public long samplerDescriptorBufferAddressSpaceSize() {
    	return (long) SAMPLER_DESCRIPTOR_BUFFER_ADDRESS_SPACE_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #resourceDescriptorBufferAddressSpaceSize()
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT resourceDescriptorBufferAddressSpaceSize(long resourceDescriptorBufferAddressSpaceSize) {
    	RESOURCE_DESCRIPTOR_BUFFER_ADDRESS_SPACE_SIZE_HANDLE.set(segment, 0L, resourceDescriptorBufferAddressSpaceSize);
    	return this;
    }
    
    public long resourceDescriptorBufferAddressSpaceSize() {
    	return (long) RESOURCE_DESCRIPTOR_BUFFER_ADDRESS_SPACE_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #descriptorBufferAddressSpaceSize()
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT descriptorBufferAddressSpaceSize(long descriptorBufferAddressSpaceSize) {
    	DESCRIPTOR_BUFFER_ADDRESS_SPACE_SIZE_HANDLE.set(segment, 0L, descriptorBufferAddressSpaceSize);
    	return this;
    }
    
    public long descriptorBufferAddressSpaceSize() {
    	return (long) DESCRIPTOR_BUFFER_ADDRESS_SPACE_SIZE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT set(VkPhysicalDeviceDescriptorBufferPropertiesEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceDescriptorBufferPropertiesEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceDescriptorBufferPropertiesEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceDescriptorBufferPropertiesEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceDescriptorBufferPropertiesEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceDescriptorBufferPropertiesEXT> array(Arena arena, VkPhysicalDeviceDescriptorBufferPropertiesEXT... structs) {
        NativeStructArray<VkPhysicalDeviceDescriptorBufferPropertiesEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceDescriptorBufferPropertiesEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceDescriptorBufferPropertiesEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceDescriptorBufferPropertiesEXT(segment)
        );
    }

}