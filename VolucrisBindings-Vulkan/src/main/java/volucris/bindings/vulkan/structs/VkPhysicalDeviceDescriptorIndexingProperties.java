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

public final class VkPhysicalDeviceDescriptorIndexingProperties
		implements Struct<VkPhysicalDeviceDescriptorIndexingProperties> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle MAX_UPDATE_AFTER_BIND_DESCRIPTORS_IN_ALL_POOLS_HANDLE;
	public static final VarHandle SHADER_UNIFORM_BUFFER_ARRAY_NON_UNIFORM_INDEXING_NATIVE_HANDLE;
	public static final VarHandle SHADER_SAMPLED_IMAGE_ARRAY_NON_UNIFORM_INDEXING_NATIVE_HANDLE;
	public static final VarHandle SHADER_STORAGE_BUFFER_ARRAY_NON_UNIFORM_INDEXING_NATIVE_HANDLE;
	public static final VarHandle SHADER_STORAGE_IMAGE_ARRAY_NON_UNIFORM_INDEXING_NATIVE_HANDLE;
	public static final VarHandle SHADER_INPUT_ATTACHMENT_ARRAY_NON_UNIFORM_INDEXING_NATIVE_HANDLE;
	public static final VarHandle ROBUST_BUFFER_ACCESS_UPDATE_AFTER_BIND_HANDLE;
	public static final VarHandle QUAD_DIVERGENT_IMPLICIT_LOD_HANDLE;
	public static final VarHandle MAX_PER_STAGE_DESCRIPTOR_UPDATE_AFTER_BIND_SAMPLERS_HANDLE;
	public static final VarHandle MAX_PER_STAGE_DESCRIPTOR_UPDATE_AFTER_BIND_UNIFORM_BUFFERS_HANDLE;
	public static final VarHandle MAX_PER_STAGE_DESCRIPTOR_UPDATE_AFTER_BIND_STORAGE_BUFFERS_HANDLE;
	public static final VarHandle MAX_PER_STAGE_DESCRIPTOR_UPDATE_AFTER_BIND_SAMPLED_IMAGES_HANDLE;
	public static final VarHandle MAX_PER_STAGE_DESCRIPTOR_UPDATE_AFTER_BIND_STORAGE_IMAGES_HANDLE;
	public static final VarHandle MAX_PER_STAGE_DESCRIPTOR_UPDATE_AFTER_BIND_INPUT_ATTACHMENTS_HANDLE;
	public static final VarHandle MAX_PER_STAGE_UPDATE_AFTER_BIND_RESOURCES_HANDLE;
	public static final VarHandle MAX_DESCRIPTOR_SET_UPDATE_AFTER_BIND_SAMPLERS_HANDLE;
	public static final VarHandle MAX_DESCRIPTOR_SET_UPDATE_AFTER_BIND_UNIFORM_BUFFERS_HANDLE;
	public static final VarHandle MAX_DESCRIPTOR_SET_UPDATE_AFTER_BIND_UNIFORM_BUFFERS_DYNAMIC_HANDLE;
	public static final VarHandle MAX_DESCRIPTOR_SET_UPDATE_AFTER_BIND_STORAGE_BUFFERS_HANDLE;
	public static final VarHandle MAX_DESCRIPTOR_SET_UPDATE_AFTER_BIND_STORAGE_BUFFERS_DYNAMIC_HANDLE;
	public static final VarHandle MAX_DESCRIPTOR_SET_UPDATE_AFTER_BIND_SAMPLED_IMAGES_HANDLE;
	public static final VarHandle MAX_DESCRIPTOR_SET_UPDATE_AFTER_BIND_STORAGE_IMAGES_HANDLE;
	public static final VarHandle MAX_DESCRIPTOR_SET_UPDATE_AFTER_BIND_INPUT_ATTACHMENTS_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long MAX_UPDATE_AFTER_BIND_DESCRIPTORS_IN_ALL_POOLS_BYTE_OFFSET;
	public static final long SHADER_UNIFORM_BUFFER_ARRAY_NON_UNIFORM_INDEXING_NATIVE_BYTE_OFFSET;
	public static final long SHADER_SAMPLED_IMAGE_ARRAY_NON_UNIFORM_INDEXING_NATIVE_BYTE_OFFSET;
	public static final long SHADER_STORAGE_BUFFER_ARRAY_NON_UNIFORM_INDEXING_NATIVE_BYTE_OFFSET;
	public static final long SHADER_STORAGE_IMAGE_ARRAY_NON_UNIFORM_INDEXING_NATIVE_BYTE_OFFSET;
	public static final long SHADER_INPUT_ATTACHMENT_ARRAY_NON_UNIFORM_INDEXING_NATIVE_BYTE_OFFSET;
	public static final long ROBUST_BUFFER_ACCESS_UPDATE_AFTER_BIND_BYTE_OFFSET;
	public static final long QUAD_DIVERGENT_IMPLICIT_LOD_BYTE_OFFSET;
	public static final long MAX_PER_STAGE_DESCRIPTOR_UPDATE_AFTER_BIND_SAMPLERS_BYTE_OFFSET;
	public static final long MAX_PER_STAGE_DESCRIPTOR_UPDATE_AFTER_BIND_UNIFORM_BUFFERS_BYTE_OFFSET;
	public static final long MAX_PER_STAGE_DESCRIPTOR_UPDATE_AFTER_BIND_STORAGE_BUFFERS_BYTE_OFFSET;
	public static final long MAX_PER_STAGE_DESCRIPTOR_UPDATE_AFTER_BIND_SAMPLED_IMAGES_BYTE_OFFSET;
	public static final long MAX_PER_STAGE_DESCRIPTOR_UPDATE_AFTER_BIND_STORAGE_IMAGES_BYTE_OFFSET;
	public static final long MAX_PER_STAGE_DESCRIPTOR_UPDATE_AFTER_BIND_INPUT_ATTACHMENTS_BYTE_OFFSET;
	public static final long MAX_PER_STAGE_UPDATE_AFTER_BIND_RESOURCES_BYTE_OFFSET;
	public static final long MAX_DESCRIPTOR_SET_UPDATE_AFTER_BIND_SAMPLERS_BYTE_OFFSET;
	public static final long MAX_DESCRIPTOR_SET_UPDATE_AFTER_BIND_UNIFORM_BUFFERS_BYTE_OFFSET;
	public static final long MAX_DESCRIPTOR_SET_UPDATE_AFTER_BIND_UNIFORM_BUFFERS_DYNAMIC_BYTE_OFFSET;
	public static final long MAX_DESCRIPTOR_SET_UPDATE_AFTER_BIND_STORAGE_BUFFERS_BYTE_OFFSET;
	public static final long MAX_DESCRIPTOR_SET_UPDATE_AFTER_BIND_STORAGE_BUFFERS_DYNAMIC_BYTE_OFFSET;
	public static final long MAX_DESCRIPTOR_SET_UPDATE_AFTER_BIND_SAMPLED_IMAGES_BYTE_OFFSET;
	public static final long MAX_DESCRIPTOR_SET_UPDATE_AFTER_BIND_STORAGE_IMAGES_BYTE_OFFSET;
	public static final long MAX_DESCRIPTOR_SET_UPDATE_AFTER_BIND_INPUT_ATTACHMENTS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("maxUpdateAfterBindDescriptorsInAllPools"),
		    JAVA_INT.withName("shaderUniformBufferArrayNonUniformIndexingNative"),
		    JAVA_INT.withName("shaderSampledImageArrayNonUniformIndexingNative"),
		    JAVA_INT.withName("shaderStorageBufferArrayNonUniformIndexingNative"),
		    JAVA_INT.withName("shaderStorageImageArrayNonUniformIndexingNative"),
		    JAVA_INT.withName("shaderInputAttachmentArrayNonUniformIndexingNative"),
		    JAVA_INT.withName("robustBufferAccessUpdateAfterBind"),
		    JAVA_INT.withName("quadDivergentImplicitLod"),
		    JAVA_INT.withName("maxPerStageDescriptorUpdateAfterBindSamplers"),
		    JAVA_INT.withName("maxPerStageDescriptorUpdateAfterBindUniformBuffers"),
		    JAVA_INT.withName("maxPerStageDescriptorUpdateAfterBindStorageBuffers"),
		    JAVA_INT.withName("maxPerStageDescriptorUpdateAfterBindSampledImages"),
		    JAVA_INT.withName("maxPerStageDescriptorUpdateAfterBindStorageImages"),
		    JAVA_INT.withName("maxPerStageDescriptorUpdateAfterBindInputAttachments"),
		    JAVA_INT.withName("maxPerStageUpdateAfterBindResources"),
		    JAVA_INT.withName("maxDescriptorSetUpdateAfterBindSamplers"),
		    JAVA_INT.withName("maxDescriptorSetUpdateAfterBindUniformBuffers"),
		    JAVA_INT.withName("maxDescriptorSetUpdateAfterBindUniformBuffersDynamic"),
		    JAVA_INT.withName("maxDescriptorSetUpdateAfterBindStorageBuffers"),
		    JAVA_INT.withName("maxDescriptorSetUpdateAfterBindStorageBuffersDynamic"),
		    JAVA_INT.withName("maxDescriptorSetUpdateAfterBindSampledImages"),
		    JAVA_INT.withName("maxDescriptorSetUpdateAfterBindStorageImages"),
		    JAVA_INT.withName("maxDescriptorSetUpdateAfterBindInputAttachments"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPhysicalDeviceDescriptorIndexingProperties").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		MAX_UPDATE_AFTER_BIND_DESCRIPTORS_IN_ALL_POOLS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxUpdateAfterBindDescriptorsInAllPools"));
		SHADER_UNIFORM_BUFFER_ARRAY_NON_UNIFORM_INDEXING_NATIVE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderUniformBufferArrayNonUniformIndexingNative"));
		SHADER_SAMPLED_IMAGE_ARRAY_NON_UNIFORM_INDEXING_NATIVE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderSampledImageArrayNonUniformIndexingNative"));
		SHADER_STORAGE_BUFFER_ARRAY_NON_UNIFORM_INDEXING_NATIVE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderStorageBufferArrayNonUniformIndexingNative"));
		SHADER_STORAGE_IMAGE_ARRAY_NON_UNIFORM_INDEXING_NATIVE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderStorageImageArrayNonUniformIndexingNative"));
		SHADER_INPUT_ATTACHMENT_ARRAY_NON_UNIFORM_INDEXING_NATIVE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderInputAttachmentArrayNonUniformIndexingNative"));
		ROBUST_BUFFER_ACCESS_UPDATE_AFTER_BIND_HANDLE = LAYOUT.varHandle(PathElement.groupElement("robustBufferAccessUpdateAfterBind"));
		QUAD_DIVERGENT_IMPLICIT_LOD_HANDLE = LAYOUT.varHandle(PathElement.groupElement("quadDivergentImplicitLod"));
		MAX_PER_STAGE_DESCRIPTOR_UPDATE_AFTER_BIND_SAMPLERS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindSamplers"));
		MAX_PER_STAGE_DESCRIPTOR_UPDATE_AFTER_BIND_UNIFORM_BUFFERS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindUniformBuffers"));
		MAX_PER_STAGE_DESCRIPTOR_UPDATE_AFTER_BIND_STORAGE_BUFFERS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindStorageBuffers"));
		MAX_PER_STAGE_DESCRIPTOR_UPDATE_AFTER_BIND_SAMPLED_IMAGES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindSampledImages"));
		MAX_PER_STAGE_DESCRIPTOR_UPDATE_AFTER_BIND_STORAGE_IMAGES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindStorageImages"));
		MAX_PER_STAGE_DESCRIPTOR_UPDATE_AFTER_BIND_INPUT_ATTACHMENTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindInputAttachments"));
		MAX_PER_STAGE_UPDATE_AFTER_BIND_RESOURCES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxPerStageUpdateAfterBindResources"));
		MAX_DESCRIPTOR_SET_UPDATE_AFTER_BIND_SAMPLERS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxDescriptorSetUpdateAfterBindSamplers"));
		MAX_DESCRIPTOR_SET_UPDATE_AFTER_BIND_UNIFORM_BUFFERS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxDescriptorSetUpdateAfterBindUniformBuffers"));
		MAX_DESCRIPTOR_SET_UPDATE_AFTER_BIND_UNIFORM_BUFFERS_DYNAMIC_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxDescriptorSetUpdateAfterBindUniformBuffersDynamic"));
		MAX_DESCRIPTOR_SET_UPDATE_AFTER_BIND_STORAGE_BUFFERS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxDescriptorSetUpdateAfterBindStorageBuffers"));
		MAX_DESCRIPTOR_SET_UPDATE_AFTER_BIND_STORAGE_BUFFERS_DYNAMIC_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxDescriptorSetUpdateAfterBindStorageBuffersDynamic"));
		MAX_DESCRIPTOR_SET_UPDATE_AFTER_BIND_SAMPLED_IMAGES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxDescriptorSetUpdateAfterBindSampledImages"));
		MAX_DESCRIPTOR_SET_UPDATE_AFTER_BIND_STORAGE_IMAGES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxDescriptorSetUpdateAfterBindStorageImages"));
		MAX_DESCRIPTOR_SET_UPDATE_AFTER_BIND_INPUT_ATTACHMENTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxDescriptorSetUpdateAfterBindInputAttachments"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		MAX_UPDATE_AFTER_BIND_DESCRIPTORS_IN_ALL_POOLS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxUpdateAfterBindDescriptorsInAllPools"));
		SHADER_UNIFORM_BUFFER_ARRAY_NON_UNIFORM_INDEXING_NATIVE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderUniformBufferArrayNonUniformIndexingNative"));
		SHADER_SAMPLED_IMAGE_ARRAY_NON_UNIFORM_INDEXING_NATIVE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderSampledImageArrayNonUniformIndexingNative"));
		SHADER_STORAGE_BUFFER_ARRAY_NON_UNIFORM_INDEXING_NATIVE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderStorageBufferArrayNonUniformIndexingNative"));
		SHADER_STORAGE_IMAGE_ARRAY_NON_UNIFORM_INDEXING_NATIVE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderStorageImageArrayNonUniformIndexingNative"));
		SHADER_INPUT_ATTACHMENT_ARRAY_NON_UNIFORM_INDEXING_NATIVE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderInputAttachmentArrayNonUniformIndexingNative"));
		ROBUST_BUFFER_ACCESS_UPDATE_AFTER_BIND_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("robustBufferAccessUpdateAfterBind"));
		QUAD_DIVERGENT_IMPLICIT_LOD_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("quadDivergentImplicitLod"));
		MAX_PER_STAGE_DESCRIPTOR_UPDATE_AFTER_BIND_SAMPLERS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindSamplers"));
		MAX_PER_STAGE_DESCRIPTOR_UPDATE_AFTER_BIND_UNIFORM_BUFFERS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindUniformBuffers"));
		MAX_PER_STAGE_DESCRIPTOR_UPDATE_AFTER_BIND_STORAGE_BUFFERS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindStorageBuffers"));
		MAX_PER_STAGE_DESCRIPTOR_UPDATE_AFTER_BIND_SAMPLED_IMAGES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindSampledImages"));
		MAX_PER_STAGE_DESCRIPTOR_UPDATE_AFTER_BIND_STORAGE_IMAGES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindStorageImages"));
		MAX_PER_STAGE_DESCRIPTOR_UPDATE_AFTER_BIND_INPUT_ATTACHMENTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindInputAttachments"));
		MAX_PER_STAGE_UPDATE_AFTER_BIND_RESOURCES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxPerStageUpdateAfterBindResources"));
		MAX_DESCRIPTOR_SET_UPDATE_AFTER_BIND_SAMPLERS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetUpdateAfterBindSamplers"));
		MAX_DESCRIPTOR_SET_UPDATE_AFTER_BIND_UNIFORM_BUFFERS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetUpdateAfterBindUniformBuffers"));
		MAX_DESCRIPTOR_SET_UPDATE_AFTER_BIND_UNIFORM_BUFFERS_DYNAMIC_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetUpdateAfterBindUniformBuffersDynamic"));
		MAX_DESCRIPTOR_SET_UPDATE_AFTER_BIND_STORAGE_BUFFERS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetUpdateAfterBindStorageBuffers"));
		MAX_DESCRIPTOR_SET_UPDATE_AFTER_BIND_STORAGE_BUFFERS_DYNAMIC_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetUpdateAfterBindStorageBuffersDynamic"));
		MAX_DESCRIPTOR_SET_UPDATE_AFTER_BIND_SAMPLED_IMAGES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetUpdateAfterBindSampledImages"));
		MAX_DESCRIPTOR_SET_UPDATE_AFTER_BIND_STORAGE_IMAGES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetUpdateAfterBindStorageImages"));
		MAX_DESCRIPTOR_SET_UPDATE_AFTER_BIND_INPUT_ATTACHMENTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetUpdateAfterBindInputAttachments"));
		//@formatter:on
	}

	public VkPhysicalDeviceDescriptorIndexingProperties() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceDescriptorIndexingProperties(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceDescriptorIndexingProperties(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceDescriptorIndexingProperties sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceDescriptorIndexingProperties pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #maxUpdateAfterBindDescriptorsInAllPools()
    public VkPhysicalDeviceDescriptorIndexingProperties maxUpdateAfterBindDescriptorsInAllPools(int maxUpdateAfterBindDescriptorsInAllPools) {
    	MAX_UPDATE_AFTER_BIND_DESCRIPTORS_IN_ALL_POOLS_HANDLE.set(segment, 0L, maxUpdateAfterBindDescriptorsInAllPools);
    	return this;
    }
    
    public int maxUpdateAfterBindDescriptorsInAllPools() {
    	return (int) MAX_UPDATE_AFTER_BIND_DESCRIPTORS_IN_ALL_POOLS_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderUniformBufferArrayNonUniformIndexingNative()
    public VkPhysicalDeviceDescriptorIndexingProperties shaderUniformBufferArrayNonUniformIndexingNative(int shaderUniformBufferArrayNonUniformIndexingNative) {
    	SHADER_UNIFORM_BUFFER_ARRAY_NON_UNIFORM_INDEXING_NATIVE_HANDLE.set(segment, 0L, shaderUniformBufferArrayNonUniformIndexingNative);
    	return this;
    }
    
    public int shaderUniformBufferArrayNonUniformIndexingNative() {
    	return (int) SHADER_UNIFORM_BUFFER_ARRAY_NON_UNIFORM_INDEXING_NATIVE_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderSampledImageArrayNonUniformIndexingNative()
    public VkPhysicalDeviceDescriptorIndexingProperties shaderSampledImageArrayNonUniformIndexingNative(int shaderSampledImageArrayNonUniformIndexingNative) {
    	SHADER_SAMPLED_IMAGE_ARRAY_NON_UNIFORM_INDEXING_NATIVE_HANDLE.set(segment, 0L, shaderSampledImageArrayNonUniformIndexingNative);
    	return this;
    }
    
    public int shaderSampledImageArrayNonUniformIndexingNative() {
    	return (int) SHADER_SAMPLED_IMAGE_ARRAY_NON_UNIFORM_INDEXING_NATIVE_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderStorageBufferArrayNonUniformIndexingNative()
    public VkPhysicalDeviceDescriptorIndexingProperties shaderStorageBufferArrayNonUniformIndexingNative(int shaderStorageBufferArrayNonUniformIndexingNative) {
    	SHADER_STORAGE_BUFFER_ARRAY_NON_UNIFORM_INDEXING_NATIVE_HANDLE.set(segment, 0L, shaderStorageBufferArrayNonUniformIndexingNative);
    	return this;
    }
    
    public int shaderStorageBufferArrayNonUniformIndexingNative() {
    	return (int) SHADER_STORAGE_BUFFER_ARRAY_NON_UNIFORM_INDEXING_NATIVE_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderStorageImageArrayNonUniformIndexingNative()
    public VkPhysicalDeviceDescriptorIndexingProperties shaderStorageImageArrayNonUniformIndexingNative(int shaderStorageImageArrayNonUniformIndexingNative) {
    	SHADER_STORAGE_IMAGE_ARRAY_NON_UNIFORM_INDEXING_NATIVE_HANDLE.set(segment, 0L, shaderStorageImageArrayNonUniformIndexingNative);
    	return this;
    }
    
    public int shaderStorageImageArrayNonUniformIndexingNative() {
    	return (int) SHADER_STORAGE_IMAGE_ARRAY_NON_UNIFORM_INDEXING_NATIVE_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderInputAttachmentArrayNonUniformIndexingNative()
    public VkPhysicalDeviceDescriptorIndexingProperties shaderInputAttachmentArrayNonUniformIndexingNative(int shaderInputAttachmentArrayNonUniformIndexingNative) {
    	SHADER_INPUT_ATTACHMENT_ARRAY_NON_UNIFORM_INDEXING_NATIVE_HANDLE.set(segment, 0L, shaderInputAttachmentArrayNonUniformIndexingNative);
    	return this;
    }
    
    public int shaderInputAttachmentArrayNonUniformIndexingNative() {
    	return (int) SHADER_INPUT_ATTACHMENT_ARRAY_NON_UNIFORM_INDEXING_NATIVE_HANDLE.get(segment, 0L);
    }
    
    /// @see #robustBufferAccessUpdateAfterBind()
    public VkPhysicalDeviceDescriptorIndexingProperties robustBufferAccessUpdateAfterBind(int robustBufferAccessUpdateAfterBind) {
    	ROBUST_BUFFER_ACCESS_UPDATE_AFTER_BIND_HANDLE.set(segment, 0L, robustBufferAccessUpdateAfterBind);
    	return this;
    }
    
    public int robustBufferAccessUpdateAfterBind() {
    	return (int) ROBUST_BUFFER_ACCESS_UPDATE_AFTER_BIND_HANDLE.get(segment, 0L);
    }
    
    /// @see #quadDivergentImplicitLod()
    public VkPhysicalDeviceDescriptorIndexingProperties quadDivergentImplicitLod(int quadDivergentImplicitLod) {
    	QUAD_DIVERGENT_IMPLICIT_LOD_HANDLE.set(segment, 0L, quadDivergentImplicitLod);
    	return this;
    }
    
    public int quadDivergentImplicitLod() {
    	return (int) QUAD_DIVERGENT_IMPLICIT_LOD_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxPerStageDescriptorUpdateAfterBindSamplers()
    public VkPhysicalDeviceDescriptorIndexingProperties maxPerStageDescriptorUpdateAfterBindSamplers(int maxPerStageDescriptorUpdateAfterBindSamplers) {
    	MAX_PER_STAGE_DESCRIPTOR_UPDATE_AFTER_BIND_SAMPLERS_HANDLE.set(segment, 0L, maxPerStageDescriptorUpdateAfterBindSamplers);
    	return this;
    }
    
    public int maxPerStageDescriptorUpdateAfterBindSamplers() {
    	return (int) MAX_PER_STAGE_DESCRIPTOR_UPDATE_AFTER_BIND_SAMPLERS_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxPerStageDescriptorUpdateAfterBindUniformBuffers()
    public VkPhysicalDeviceDescriptorIndexingProperties maxPerStageDescriptorUpdateAfterBindUniformBuffers(int maxPerStageDescriptorUpdateAfterBindUniformBuffers) {
    	MAX_PER_STAGE_DESCRIPTOR_UPDATE_AFTER_BIND_UNIFORM_BUFFERS_HANDLE.set(segment, 0L, maxPerStageDescriptorUpdateAfterBindUniformBuffers);
    	return this;
    }
    
    public int maxPerStageDescriptorUpdateAfterBindUniformBuffers() {
    	return (int) MAX_PER_STAGE_DESCRIPTOR_UPDATE_AFTER_BIND_UNIFORM_BUFFERS_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxPerStageDescriptorUpdateAfterBindStorageBuffers()
    public VkPhysicalDeviceDescriptorIndexingProperties maxPerStageDescriptorUpdateAfterBindStorageBuffers(int maxPerStageDescriptorUpdateAfterBindStorageBuffers) {
    	MAX_PER_STAGE_DESCRIPTOR_UPDATE_AFTER_BIND_STORAGE_BUFFERS_HANDLE.set(segment, 0L, maxPerStageDescriptorUpdateAfterBindStorageBuffers);
    	return this;
    }
    
    public int maxPerStageDescriptorUpdateAfterBindStorageBuffers() {
    	return (int) MAX_PER_STAGE_DESCRIPTOR_UPDATE_AFTER_BIND_STORAGE_BUFFERS_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxPerStageDescriptorUpdateAfterBindSampledImages()
    public VkPhysicalDeviceDescriptorIndexingProperties maxPerStageDescriptorUpdateAfterBindSampledImages(int maxPerStageDescriptorUpdateAfterBindSampledImages) {
    	MAX_PER_STAGE_DESCRIPTOR_UPDATE_AFTER_BIND_SAMPLED_IMAGES_HANDLE.set(segment, 0L, maxPerStageDescriptorUpdateAfterBindSampledImages);
    	return this;
    }
    
    public int maxPerStageDescriptorUpdateAfterBindSampledImages() {
    	return (int) MAX_PER_STAGE_DESCRIPTOR_UPDATE_AFTER_BIND_SAMPLED_IMAGES_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxPerStageDescriptorUpdateAfterBindStorageImages()
    public VkPhysicalDeviceDescriptorIndexingProperties maxPerStageDescriptorUpdateAfterBindStorageImages(int maxPerStageDescriptorUpdateAfterBindStorageImages) {
    	MAX_PER_STAGE_DESCRIPTOR_UPDATE_AFTER_BIND_STORAGE_IMAGES_HANDLE.set(segment, 0L, maxPerStageDescriptorUpdateAfterBindStorageImages);
    	return this;
    }
    
    public int maxPerStageDescriptorUpdateAfterBindStorageImages() {
    	return (int) MAX_PER_STAGE_DESCRIPTOR_UPDATE_AFTER_BIND_STORAGE_IMAGES_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxPerStageDescriptorUpdateAfterBindInputAttachments()
    public VkPhysicalDeviceDescriptorIndexingProperties maxPerStageDescriptorUpdateAfterBindInputAttachments(int maxPerStageDescriptorUpdateAfterBindInputAttachments) {
    	MAX_PER_STAGE_DESCRIPTOR_UPDATE_AFTER_BIND_INPUT_ATTACHMENTS_HANDLE.set(segment, 0L, maxPerStageDescriptorUpdateAfterBindInputAttachments);
    	return this;
    }
    
    public int maxPerStageDescriptorUpdateAfterBindInputAttachments() {
    	return (int) MAX_PER_STAGE_DESCRIPTOR_UPDATE_AFTER_BIND_INPUT_ATTACHMENTS_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxPerStageUpdateAfterBindResources()
    public VkPhysicalDeviceDescriptorIndexingProperties maxPerStageUpdateAfterBindResources(int maxPerStageUpdateAfterBindResources) {
    	MAX_PER_STAGE_UPDATE_AFTER_BIND_RESOURCES_HANDLE.set(segment, 0L, maxPerStageUpdateAfterBindResources);
    	return this;
    }
    
    public int maxPerStageUpdateAfterBindResources() {
    	return (int) MAX_PER_STAGE_UPDATE_AFTER_BIND_RESOURCES_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxDescriptorSetUpdateAfterBindSamplers()
    public VkPhysicalDeviceDescriptorIndexingProperties maxDescriptorSetUpdateAfterBindSamplers(int maxDescriptorSetUpdateAfterBindSamplers) {
    	MAX_DESCRIPTOR_SET_UPDATE_AFTER_BIND_SAMPLERS_HANDLE.set(segment, 0L, maxDescriptorSetUpdateAfterBindSamplers);
    	return this;
    }
    
    public int maxDescriptorSetUpdateAfterBindSamplers() {
    	return (int) MAX_DESCRIPTOR_SET_UPDATE_AFTER_BIND_SAMPLERS_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxDescriptorSetUpdateAfterBindUniformBuffers()
    public VkPhysicalDeviceDescriptorIndexingProperties maxDescriptorSetUpdateAfterBindUniformBuffers(int maxDescriptorSetUpdateAfterBindUniformBuffers) {
    	MAX_DESCRIPTOR_SET_UPDATE_AFTER_BIND_UNIFORM_BUFFERS_HANDLE.set(segment, 0L, maxDescriptorSetUpdateAfterBindUniformBuffers);
    	return this;
    }
    
    public int maxDescriptorSetUpdateAfterBindUniformBuffers() {
    	return (int) MAX_DESCRIPTOR_SET_UPDATE_AFTER_BIND_UNIFORM_BUFFERS_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxDescriptorSetUpdateAfterBindUniformBuffersDynamic()
    public VkPhysicalDeviceDescriptorIndexingProperties maxDescriptorSetUpdateAfterBindUniformBuffersDynamic(int maxDescriptorSetUpdateAfterBindUniformBuffersDynamic) {
    	MAX_DESCRIPTOR_SET_UPDATE_AFTER_BIND_UNIFORM_BUFFERS_DYNAMIC_HANDLE.set(segment, 0L, maxDescriptorSetUpdateAfterBindUniformBuffersDynamic);
    	return this;
    }
    
    public int maxDescriptorSetUpdateAfterBindUniformBuffersDynamic() {
    	return (int) MAX_DESCRIPTOR_SET_UPDATE_AFTER_BIND_UNIFORM_BUFFERS_DYNAMIC_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxDescriptorSetUpdateAfterBindStorageBuffers()
    public VkPhysicalDeviceDescriptorIndexingProperties maxDescriptorSetUpdateAfterBindStorageBuffers(int maxDescriptorSetUpdateAfterBindStorageBuffers) {
    	MAX_DESCRIPTOR_SET_UPDATE_AFTER_BIND_STORAGE_BUFFERS_HANDLE.set(segment, 0L, maxDescriptorSetUpdateAfterBindStorageBuffers);
    	return this;
    }
    
    public int maxDescriptorSetUpdateAfterBindStorageBuffers() {
    	return (int) MAX_DESCRIPTOR_SET_UPDATE_AFTER_BIND_STORAGE_BUFFERS_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxDescriptorSetUpdateAfterBindStorageBuffersDynamic()
    public VkPhysicalDeviceDescriptorIndexingProperties maxDescriptorSetUpdateAfterBindStorageBuffersDynamic(int maxDescriptorSetUpdateAfterBindStorageBuffersDynamic) {
    	MAX_DESCRIPTOR_SET_UPDATE_AFTER_BIND_STORAGE_BUFFERS_DYNAMIC_HANDLE.set(segment, 0L, maxDescriptorSetUpdateAfterBindStorageBuffersDynamic);
    	return this;
    }
    
    public int maxDescriptorSetUpdateAfterBindStorageBuffersDynamic() {
    	return (int) MAX_DESCRIPTOR_SET_UPDATE_AFTER_BIND_STORAGE_BUFFERS_DYNAMIC_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxDescriptorSetUpdateAfterBindSampledImages()
    public VkPhysicalDeviceDescriptorIndexingProperties maxDescriptorSetUpdateAfterBindSampledImages(int maxDescriptorSetUpdateAfterBindSampledImages) {
    	MAX_DESCRIPTOR_SET_UPDATE_AFTER_BIND_SAMPLED_IMAGES_HANDLE.set(segment, 0L, maxDescriptorSetUpdateAfterBindSampledImages);
    	return this;
    }
    
    public int maxDescriptorSetUpdateAfterBindSampledImages() {
    	return (int) MAX_DESCRIPTOR_SET_UPDATE_AFTER_BIND_SAMPLED_IMAGES_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxDescriptorSetUpdateAfterBindStorageImages()
    public VkPhysicalDeviceDescriptorIndexingProperties maxDescriptorSetUpdateAfterBindStorageImages(int maxDescriptorSetUpdateAfterBindStorageImages) {
    	MAX_DESCRIPTOR_SET_UPDATE_AFTER_BIND_STORAGE_IMAGES_HANDLE.set(segment, 0L, maxDescriptorSetUpdateAfterBindStorageImages);
    	return this;
    }
    
    public int maxDescriptorSetUpdateAfterBindStorageImages() {
    	return (int) MAX_DESCRIPTOR_SET_UPDATE_AFTER_BIND_STORAGE_IMAGES_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxDescriptorSetUpdateAfterBindInputAttachments()
    public VkPhysicalDeviceDescriptorIndexingProperties maxDescriptorSetUpdateAfterBindInputAttachments(int maxDescriptorSetUpdateAfterBindInputAttachments) {
    	MAX_DESCRIPTOR_SET_UPDATE_AFTER_BIND_INPUT_ATTACHMENTS_HANDLE.set(segment, 0L, maxDescriptorSetUpdateAfterBindInputAttachments);
    	return this;
    }
    
    public int maxDescriptorSetUpdateAfterBindInputAttachments() {
    	return (int) MAX_DESCRIPTOR_SET_UPDATE_AFTER_BIND_INPUT_ATTACHMENTS_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceDescriptorIndexingProperties set(VkPhysicalDeviceDescriptorIndexingProperties other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceDescriptorIndexingProperties set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceDescriptorIndexingProperties> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceDescriptorIndexingProperties> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceDescriptorIndexingProperties(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceDescriptorIndexingProperties> array(Arena arena, VkPhysicalDeviceDescriptorIndexingProperties... structs) {
        NativeStructArray<VkPhysicalDeviceDescriptorIndexingProperties> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceDescriptorIndexingProperties(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceDescriptorIndexingProperties> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceDescriptorIndexingProperties(segment)
        );
    }

}