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
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;

public final class VkPhysicalDeviceLimits
		implements Struct<VkPhysicalDeviceLimits> {

	public static final StructLayout LAYOUT;

	public static final VarHandle MAX_IMAGE_DIMENSION1_D_HANDLE;
	public static final VarHandle MAX_IMAGE_DIMENSION2_D_HANDLE;
	public static final VarHandle MAX_IMAGE_DIMENSION3_D_HANDLE;
	public static final VarHandle MAX_IMAGE_DIMENSION_CUBE_HANDLE;
	public static final VarHandle MAX_IMAGE_ARRAY_LAYERS_HANDLE;
	public static final VarHandle MAX_TEXEL_BUFFER_ELEMENTS_HANDLE;
	public static final VarHandle MAX_UNIFORM_BUFFER_RANGE_HANDLE;
	public static final VarHandle MAX_STORAGE_BUFFER_RANGE_HANDLE;
	public static final VarHandle MAX_PUSH_CONSTANTS_SIZE_HANDLE;
	public static final VarHandle MAX_MEMORY_ALLOCATION_COUNT_HANDLE;
	public static final VarHandle MAX_SAMPLER_ALLOCATION_COUNT_HANDLE;
	public static final VarHandle BUFFER_IMAGE_GRANULARITY_HANDLE;
	public static final VarHandle SPARSE_ADDRESS_SPACE_SIZE_HANDLE;
	public static final VarHandle MAX_BOUND_DESCRIPTOR_SETS_HANDLE;
	public static final VarHandle MAX_PER_STAGE_DESCRIPTOR_SAMPLERS_HANDLE;
	public static final VarHandle MAX_PER_STAGE_DESCRIPTOR_UNIFORM_BUFFERS_HANDLE;
	public static final VarHandle MAX_PER_STAGE_DESCRIPTOR_STORAGE_BUFFERS_HANDLE;
	public static final VarHandle MAX_PER_STAGE_DESCRIPTOR_SAMPLED_IMAGES_HANDLE;
	public static final VarHandle MAX_PER_STAGE_DESCRIPTOR_STORAGE_IMAGES_HANDLE;
	public static final VarHandle MAX_PER_STAGE_DESCRIPTOR_INPUT_ATTACHMENTS_HANDLE;
	public static final VarHandle MAX_PER_STAGE_RESOURCES_HANDLE;
	public static final VarHandle MAX_DESCRIPTOR_SET_SAMPLERS_HANDLE;
	public static final VarHandle MAX_DESCRIPTOR_SET_UNIFORM_BUFFERS_HANDLE;
	public static final VarHandle MAX_DESCRIPTOR_SET_UNIFORM_BUFFERS_DYNAMIC_HANDLE;
	public static final VarHandle MAX_DESCRIPTOR_SET_STORAGE_BUFFERS_HANDLE;
	public static final VarHandle MAX_DESCRIPTOR_SET_STORAGE_BUFFERS_DYNAMIC_HANDLE;
	public static final VarHandle MAX_DESCRIPTOR_SET_SAMPLED_IMAGES_HANDLE;
	public static final VarHandle MAX_DESCRIPTOR_SET_STORAGE_IMAGES_HANDLE;
	public static final VarHandle MAX_DESCRIPTOR_SET_INPUT_ATTACHMENTS_HANDLE;
	public static final VarHandle MAX_VERTEX_INPUT_ATTRIBUTES_HANDLE;
	public static final VarHandle MAX_VERTEX_INPUT_BINDINGS_HANDLE;
	public static final VarHandle MAX_VERTEX_INPUT_ATTRIBUTE_OFFSET_HANDLE;
	public static final VarHandle MAX_VERTEX_INPUT_BINDING_STRIDE_HANDLE;
	public static final VarHandle MAX_VERTEX_OUTPUT_COMPONENTS_HANDLE;
	public static final VarHandle MAX_TESSELLATION_GENERATION_LEVEL_HANDLE;
	public static final VarHandle MAX_TESSELLATION_PATCH_SIZE_HANDLE;
	public static final VarHandle MAX_TESSELLATION_CONTROL_PER_VERTEX_INPUT_COMPONENTS_HANDLE;
	public static final VarHandle MAX_TESSELLATION_CONTROL_PER_VERTEX_OUTPUT_COMPONENTS_HANDLE;
	public static final VarHandle MAX_TESSELLATION_CONTROL_PER_PATCH_OUTPUT_COMPONENTS_HANDLE;
	public static final VarHandle MAX_TESSELLATION_CONTROL_TOTAL_OUTPUT_COMPONENTS_HANDLE;
	public static final VarHandle MAX_TESSELLATION_EVALUATION_INPUT_COMPONENTS_HANDLE;
	public static final VarHandle MAX_TESSELLATION_EVALUATION_OUTPUT_COMPONENTS_HANDLE;
	public static final VarHandle MAX_GEOMETRY_SHADER_INVOCATIONS_HANDLE;
	public static final VarHandle MAX_GEOMETRY_INPUT_COMPONENTS_HANDLE;
	public static final VarHandle MAX_GEOMETRY_OUTPUT_COMPONENTS_HANDLE;
	public static final VarHandle MAX_GEOMETRY_OUTPUT_VERTICES_HANDLE;
	public static final VarHandle MAX_GEOMETRY_TOTAL_OUTPUT_COMPONENTS_HANDLE;
	public static final VarHandle MAX_FRAGMENT_INPUT_COMPONENTS_HANDLE;
	public static final VarHandle MAX_FRAGMENT_OUTPUT_ATTACHMENTS_HANDLE;
	public static final VarHandle MAX_FRAGMENT_DUAL_SRC_ATTACHMENTS_HANDLE;
	public static final VarHandle MAX_FRAGMENT_COMBINED_OUTPUT_RESOURCES_HANDLE;
	public static final VarHandle MAX_COMPUTE_SHARED_MEMORY_SIZE_HANDLE;
	public static final VarHandle MAX_COMPUTE_WORK_GROUP_COUNT_HANDLE;
	public static final VarHandle MAX_COMPUTE_WORK_GROUP_INVOCATIONS_HANDLE;
	public static final VarHandle MAX_COMPUTE_WORK_GROUP_SIZE_HANDLE;
	public static final VarHandle SUB_PIXEL_PRECISION_BITS_HANDLE;
	public static final VarHandle SUB_TEXEL_PRECISION_BITS_HANDLE;
	public static final VarHandle MIPMAP_PRECISION_BITS_HANDLE;
	public static final VarHandle MAX_DRAW_INDEXED_INDEX_VALUE_HANDLE;
	public static final VarHandle MAX_DRAW_INDIRECT_COUNT_HANDLE;
	public static final VarHandle MAX_SAMPLER_LOD_BIAS_HANDLE;
	public static final VarHandle MAX_SAMPLER_ANISOTROPY_HANDLE;
	public static final VarHandle MAX_VIEWPORTS_HANDLE;
	public static final VarHandle MAX_VIEWPORT_DIMENSIONS_HANDLE;
	public static final VarHandle VIEWPORT_BOUNDS_RANGE_HANDLE;
	public static final VarHandle VIEWPORT_SUB_PIXEL_BITS_HANDLE;
	public static final VarHandle MIN_MEMORY_MAP_ALIGNMENT_HANDLE;
	public static final VarHandle MIN_TEXEL_BUFFER_OFFSET_ALIGNMENT_HANDLE;
	public static final VarHandle MIN_UNIFORM_BUFFER_OFFSET_ALIGNMENT_HANDLE;
	public static final VarHandle MIN_STORAGE_BUFFER_OFFSET_ALIGNMENT_HANDLE;
	public static final VarHandle MIN_TEXEL_OFFSET_HANDLE;
	public static final VarHandle MAX_TEXEL_OFFSET_HANDLE;
	public static final VarHandle MIN_TEXEL_GATHER_OFFSET_HANDLE;
	public static final VarHandle MAX_TEXEL_GATHER_OFFSET_HANDLE;
	public static final VarHandle MIN_INTERPOLATION_OFFSET_HANDLE;
	public static final VarHandle MAX_INTERPOLATION_OFFSET_HANDLE;
	public static final VarHandle SUB_PIXEL_INTERPOLATION_OFFSET_BITS_HANDLE;
	public static final VarHandle MAX_FRAMEBUFFER_WIDTH_HANDLE;
	public static final VarHandle MAX_FRAMEBUFFER_HEIGHT_HANDLE;
	public static final VarHandle MAX_FRAMEBUFFER_LAYERS_HANDLE;
	public static final VarHandle FRAMEBUFFER_COLOR_SAMPLE_COUNTS_HANDLE;
	public static final VarHandle FRAMEBUFFER_DEPTH_SAMPLE_COUNTS_HANDLE;
	public static final VarHandle FRAMEBUFFER_STENCIL_SAMPLE_COUNTS_HANDLE;
	public static final VarHandle FRAMEBUFFER_NO_ATTACHMENTS_SAMPLE_COUNTS_HANDLE;
	public static final VarHandle MAX_COLOR_ATTACHMENTS_HANDLE;
	public static final VarHandle SAMPLED_IMAGE_COLOR_SAMPLE_COUNTS_HANDLE;
	public static final VarHandle SAMPLED_IMAGE_INTEGER_SAMPLE_COUNTS_HANDLE;
	public static final VarHandle SAMPLED_IMAGE_DEPTH_SAMPLE_COUNTS_HANDLE;
	public static final VarHandle SAMPLED_IMAGE_STENCIL_SAMPLE_COUNTS_HANDLE;
	public static final VarHandle STORAGE_IMAGE_SAMPLE_COUNTS_HANDLE;
	public static final VarHandle MAX_SAMPLE_MASK_WORDS_HANDLE;
	public static final VarHandle TIMESTAMP_COMPUTE_AND_GRAPHICS_HANDLE;
	public static final VarHandle TIMESTAMP_PERIOD_HANDLE;
	public static final VarHandle MAX_CLIP_DISTANCES_HANDLE;
	public static final VarHandle MAX_CULL_DISTANCES_HANDLE;
	public static final VarHandle MAX_COMBINED_CLIP_AND_CULL_DISTANCES_HANDLE;
	public static final VarHandle DISCRETE_QUEUE_PRIORITIES_HANDLE;
	public static final VarHandle POINT_SIZE_RANGE_HANDLE;
	public static final VarHandle LINE_WIDTH_RANGE_HANDLE;
	public static final VarHandle POINT_SIZE_GRANULARITY_HANDLE;
	public static final VarHandle LINE_WIDTH_GRANULARITY_HANDLE;
	public static final VarHandle STRICT_LINES_HANDLE;
	public static final VarHandle STANDARD_SAMPLE_LOCATIONS_HANDLE;
	public static final VarHandle OPTIMAL_BUFFER_COPY_OFFSET_ALIGNMENT_HANDLE;
	public static final VarHandle OPTIMAL_BUFFER_COPY_ROW_PITCH_ALIGNMENT_HANDLE;
	public static final VarHandle NON_COHERENT_ATOM_SIZE_HANDLE;

	public static final long MAX_IMAGE_DIMENSION1_D_BYTE_OFFSET;
	public static final long MAX_IMAGE_DIMENSION2_D_BYTE_OFFSET;
	public static final long MAX_IMAGE_DIMENSION3_D_BYTE_OFFSET;
	public static final long MAX_IMAGE_DIMENSION_CUBE_BYTE_OFFSET;
	public static final long MAX_IMAGE_ARRAY_LAYERS_BYTE_OFFSET;
	public static final long MAX_TEXEL_BUFFER_ELEMENTS_BYTE_OFFSET;
	public static final long MAX_UNIFORM_BUFFER_RANGE_BYTE_OFFSET;
	public static final long MAX_STORAGE_BUFFER_RANGE_BYTE_OFFSET;
	public static final long MAX_PUSH_CONSTANTS_SIZE_BYTE_OFFSET;
	public static final long MAX_MEMORY_ALLOCATION_COUNT_BYTE_OFFSET;
	public static final long MAX_SAMPLER_ALLOCATION_COUNT_BYTE_OFFSET;
	public static final long BUFFER_IMAGE_GRANULARITY_BYTE_OFFSET;
	public static final long SPARSE_ADDRESS_SPACE_SIZE_BYTE_OFFSET;
	public static final long MAX_BOUND_DESCRIPTOR_SETS_BYTE_OFFSET;
	public static final long MAX_PER_STAGE_DESCRIPTOR_SAMPLERS_BYTE_OFFSET;
	public static final long MAX_PER_STAGE_DESCRIPTOR_UNIFORM_BUFFERS_BYTE_OFFSET;
	public static final long MAX_PER_STAGE_DESCRIPTOR_STORAGE_BUFFERS_BYTE_OFFSET;
	public static final long MAX_PER_STAGE_DESCRIPTOR_SAMPLED_IMAGES_BYTE_OFFSET;
	public static final long MAX_PER_STAGE_DESCRIPTOR_STORAGE_IMAGES_BYTE_OFFSET;
	public static final long MAX_PER_STAGE_DESCRIPTOR_INPUT_ATTACHMENTS_BYTE_OFFSET;
	public static final long MAX_PER_STAGE_RESOURCES_BYTE_OFFSET;
	public static final long MAX_DESCRIPTOR_SET_SAMPLERS_BYTE_OFFSET;
	public static final long MAX_DESCRIPTOR_SET_UNIFORM_BUFFERS_BYTE_OFFSET;
	public static final long MAX_DESCRIPTOR_SET_UNIFORM_BUFFERS_DYNAMIC_BYTE_OFFSET;
	public static final long MAX_DESCRIPTOR_SET_STORAGE_BUFFERS_BYTE_OFFSET;
	public static final long MAX_DESCRIPTOR_SET_STORAGE_BUFFERS_DYNAMIC_BYTE_OFFSET;
	public static final long MAX_DESCRIPTOR_SET_SAMPLED_IMAGES_BYTE_OFFSET;
	public static final long MAX_DESCRIPTOR_SET_STORAGE_IMAGES_BYTE_OFFSET;
	public static final long MAX_DESCRIPTOR_SET_INPUT_ATTACHMENTS_BYTE_OFFSET;
	public static final long MAX_VERTEX_INPUT_ATTRIBUTES_BYTE_OFFSET;
	public static final long MAX_VERTEX_INPUT_BINDINGS_BYTE_OFFSET;
	public static final long MAX_VERTEX_INPUT_ATTRIBUTE_OFFSET_BYTE_OFFSET;
	public static final long MAX_VERTEX_INPUT_BINDING_STRIDE_BYTE_OFFSET;
	public static final long MAX_VERTEX_OUTPUT_COMPONENTS_BYTE_OFFSET;
	public static final long MAX_TESSELLATION_GENERATION_LEVEL_BYTE_OFFSET;
	public static final long MAX_TESSELLATION_PATCH_SIZE_BYTE_OFFSET;
	public static final long MAX_TESSELLATION_CONTROL_PER_VERTEX_INPUT_COMPONENTS_BYTE_OFFSET;
	public static final long MAX_TESSELLATION_CONTROL_PER_VERTEX_OUTPUT_COMPONENTS_BYTE_OFFSET;
	public static final long MAX_TESSELLATION_CONTROL_PER_PATCH_OUTPUT_COMPONENTS_BYTE_OFFSET;
	public static final long MAX_TESSELLATION_CONTROL_TOTAL_OUTPUT_COMPONENTS_BYTE_OFFSET;
	public static final long MAX_TESSELLATION_EVALUATION_INPUT_COMPONENTS_BYTE_OFFSET;
	public static final long MAX_TESSELLATION_EVALUATION_OUTPUT_COMPONENTS_BYTE_OFFSET;
	public static final long MAX_GEOMETRY_SHADER_INVOCATIONS_BYTE_OFFSET;
	public static final long MAX_GEOMETRY_INPUT_COMPONENTS_BYTE_OFFSET;
	public static final long MAX_GEOMETRY_OUTPUT_COMPONENTS_BYTE_OFFSET;
	public static final long MAX_GEOMETRY_OUTPUT_VERTICES_BYTE_OFFSET;
	public static final long MAX_GEOMETRY_TOTAL_OUTPUT_COMPONENTS_BYTE_OFFSET;
	public static final long MAX_FRAGMENT_INPUT_COMPONENTS_BYTE_OFFSET;
	public static final long MAX_FRAGMENT_OUTPUT_ATTACHMENTS_BYTE_OFFSET;
	public static final long MAX_FRAGMENT_DUAL_SRC_ATTACHMENTS_BYTE_OFFSET;
	public static final long MAX_FRAGMENT_COMBINED_OUTPUT_RESOURCES_BYTE_OFFSET;
	public static final long MAX_COMPUTE_SHARED_MEMORY_SIZE_BYTE_OFFSET;
	public static final long MAX_COMPUTE_WORK_GROUP_COUNT_BYTE_OFFSET;
	public static final long MAX_COMPUTE_WORK_GROUP_INVOCATIONS_BYTE_OFFSET;
	public static final long MAX_COMPUTE_WORK_GROUP_SIZE_BYTE_OFFSET;
	public static final long SUB_PIXEL_PRECISION_BITS_BYTE_OFFSET;
	public static final long SUB_TEXEL_PRECISION_BITS_BYTE_OFFSET;
	public static final long MIPMAP_PRECISION_BITS_BYTE_OFFSET;
	public static final long MAX_DRAW_INDEXED_INDEX_VALUE_BYTE_OFFSET;
	public static final long MAX_DRAW_INDIRECT_COUNT_BYTE_OFFSET;
	public static final long MAX_SAMPLER_LOD_BIAS_BYTE_OFFSET;
	public static final long MAX_SAMPLER_ANISOTROPY_BYTE_OFFSET;
	public static final long MAX_VIEWPORTS_BYTE_OFFSET;
	public static final long MAX_VIEWPORT_DIMENSIONS_BYTE_OFFSET;
	public static final long VIEWPORT_BOUNDS_RANGE_BYTE_OFFSET;
	public static final long VIEWPORT_SUB_PIXEL_BITS_BYTE_OFFSET;
	public static final long MIN_MEMORY_MAP_ALIGNMENT_BYTE_OFFSET;
	public static final long MIN_TEXEL_BUFFER_OFFSET_ALIGNMENT_BYTE_OFFSET;
	public static final long MIN_UNIFORM_BUFFER_OFFSET_ALIGNMENT_BYTE_OFFSET;
	public static final long MIN_STORAGE_BUFFER_OFFSET_ALIGNMENT_BYTE_OFFSET;
	public static final long MIN_TEXEL_OFFSET_BYTE_OFFSET;
	public static final long MAX_TEXEL_OFFSET_BYTE_OFFSET;
	public static final long MIN_TEXEL_GATHER_OFFSET_BYTE_OFFSET;
	public static final long MAX_TEXEL_GATHER_OFFSET_BYTE_OFFSET;
	public static final long MIN_INTERPOLATION_OFFSET_BYTE_OFFSET;
	public static final long MAX_INTERPOLATION_OFFSET_BYTE_OFFSET;
	public static final long SUB_PIXEL_INTERPOLATION_OFFSET_BITS_BYTE_OFFSET;
	public static final long MAX_FRAMEBUFFER_WIDTH_BYTE_OFFSET;
	public static final long MAX_FRAMEBUFFER_HEIGHT_BYTE_OFFSET;
	public static final long MAX_FRAMEBUFFER_LAYERS_BYTE_OFFSET;
	public static final long FRAMEBUFFER_COLOR_SAMPLE_COUNTS_BYTE_OFFSET;
	public static final long FRAMEBUFFER_DEPTH_SAMPLE_COUNTS_BYTE_OFFSET;
	public static final long FRAMEBUFFER_STENCIL_SAMPLE_COUNTS_BYTE_OFFSET;
	public static final long FRAMEBUFFER_NO_ATTACHMENTS_SAMPLE_COUNTS_BYTE_OFFSET;
	public static final long MAX_COLOR_ATTACHMENTS_BYTE_OFFSET;
	public static final long SAMPLED_IMAGE_COLOR_SAMPLE_COUNTS_BYTE_OFFSET;
	public static final long SAMPLED_IMAGE_INTEGER_SAMPLE_COUNTS_BYTE_OFFSET;
	public static final long SAMPLED_IMAGE_DEPTH_SAMPLE_COUNTS_BYTE_OFFSET;
	public static final long SAMPLED_IMAGE_STENCIL_SAMPLE_COUNTS_BYTE_OFFSET;
	public static final long STORAGE_IMAGE_SAMPLE_COUNTS_BYTE_OFFSET;
	public static final long MAX_SAMPLE_MASK_WORDS_BYTE_OFFSET;
	public static final long TIMESTAMP_COMPUTE_AND_GRAPHICS_BYTE_OFFSET;
	public static final long TIMESTAMP_PERIOD_BYTE_OFFSET;
	public static final long MAX_CLIP_DISTANCES_BYTE_OFFSET;
	public static final long MAX_CULL_DISTANCES_BYTE_OFFSET;
	public static final long MAX_COMBINED_CLIP_AND_CULL_DISTANCES_BYTE_OFFSET;
	public static final long DISCRETE_QUEUE_PRIORITIES_BYTE_OFFSET;
	public static final long POINT_SIZE_RANGE_BYTE_OFFSET;
	public static final long LINE_WIDTH_RANGE_BYTE_OFFSET;
	public static final long POINT_SIZE_GRANULARITY_BYTE_OFFSET;
	public static final long LINE_WIDTH_GRANULARITY_BYTE_OFFSET;
	public static final long STRICT_LINES_BYTE_OFFSET;
	public static final long STANDARD_SAMPLE_LOCATIONS_BYTE_OFFSET;
	public static final long OPTIMAL_BUFFER_COPY_OFFSET_ALIGNMENT_BYTE_OFFSET;
	public static final long OPTIMAL_BUFFER_COPY_ROW_PITCH_ALIGNMENT_BYTE_OFFSET;
	public static final long NON_COHERENT_ATOM_SIZE_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("maxImageDimension1D"),
		    JAVA_INT.withName("maxImageDimension2D"),
		    JAVA_INT.withName("maxImageDimension3D"),
		    JAVA_INT.withName("maxImageDimensionCube"),
		    JAVA_INT.withName("maxImageArrayLayers"),
		    JAVA_INT.withName("maxTexelBufferElements"),
		    JAVA_INT.withName("maxUniformBufferRange"),
		    JAVA_INT.withName("maxStorageBufferRange"),
		    JAVA_INT.withName("maxPushConstantsSize"),
		    JAVA_INT.withName("maxMemoryAllocationCount"),
		    JAVA_INT.withName("maxSamplerAllocationCount"),
		    MemoryLayout.paddingLayout(4),
		    JAVA_LONG.withName("bufferImageGranularity"),
		    JAVA_LONG.withName("sparseAddressSpaceSize"),
		    JAVA_INT.withName("maxBoundDescriptorSets"),
		    JAVA_INT.withName("maxPerStageDescriptorSamplers"),
		    JAVA_INT.withName("maxPerStageDescriptorUniformBuffers"),
		    JAVA_INT.withName("maxPerStageDescriptorStorageBuffers"),
		    JAVA_INT.withName("maxPerStageDescriptorSampledImages"),
		    JAVA_INT.withName("maxPerStageDescriptorStorageImages"),
		    JAVA_INT.withName("maxPerStageDescriptorInputAttachments"),
		    JAVA_INT.withName("maxPerStageResources"),
		    JAVA_INT.withName("maxDescriptorSetSamplers"),
		    JAVA_INT.withName("maxDescriptorSetUniformBuffers"),
		    JAVA_INT.withName("maxDescriptorSetUniformBuffersDynamic"),
		    JAVA_INT.withName("maxDescriptorSetStorageBuffers"),
		    JAVA_INT.withName("maxDescriptorSetStorageBuffersDynamic"),
		    JAVA_INT.withName("maxDescriptorSetSampledImages"),
		    JAVA_INT.withName("maxDescriptorSetStorageImages"),
		    JAVA_INT.withName("maxDescriptorSetInputAttachments"),
		    JAVA_INT.withName("maxVertexInputAttributes"),
		    JAVA_INT.withName("maxVertexInputBindings"),
		    JAVA_INT.withName("maxVertexInputAttributeOffset"),
		    JAVA_INT.withName("maxVertexInputBindingStride"),
		    JAVA_INT.withName("maxVertexOutputComponents"),
		    JAVA_INT.withName("maxTessellationGenerationLevel"),
		    JAVA_INT.withName("maxTessellationPatchSize"),
		    JAVA_INT.withName("maxTessellationControlPerVertexInputComponents"),
		    JAVA_INT.withName("maxTessellationControlPerVertexOutputComponents"),
		    JAVA_INT.withName("maxTessellationControlPerPatchOutputComponents"),
		    JAVA_INT.withName("maxTessellationControlTotalOutputComponents"),
		    JAVA_INT.withName("maxTessellationEvaluationInputComponents"),
		    JAVA_INT.withName("maxTessellationEvaluationOutputComponents"),
		    JAVA_INT.withName("maxGeometryShaderInvocations"),
		    JAVA_INT.withName("maxGeometryInputComponents"),
		    JAVA_INT.withName("maxGeometryOutputComponents"),
		    JAVA_INT.withName("maxGeometryOutputVertices"),
		    JAVA_INT.withName("maxGeometryTotalOutputComponents"),
		    JAVA_INT.withName("maxFragmentInputComponents"),
		    JAVA_INT.withName("maxFragmentOutputAttachments"),
		    JAVA_INT.withName("maxFragmentDualSrcAttachments"),
		    JAVA_INT.withName("maxFragmentCombinedOutputResources"),
		    JAVA_INT.withName("maxComputeSharedMemorySize"),
		    MemoryLayout.sequenceLayout(3, JAVA_INT).withName("maxComputeWorkGroupCount"),
		    JAVA_INT.withName("maxComputeWorkGroupInvocations"),
		    MemoryLayout.sequenceLayout(3, JAVA_INT).withName("maxComputeWorkGroupSize"),
		    JAVA_INT.withName("subPixelPrecisionBits"),
		    JAVA_INT.withName("subTexelPrecisionBits"),
		    JAVA_INT.withName("mipmapPrecisionBits"),
		    JAVA_INT.withName("maxDrawIndexedIndexValue"),
		    JAVA_INT.withName("maxDrawIndirectCount"),
		    JAVA_FLOAT.withName("maxSamplerLodBias"),
		    JAVA_FLOAT.withName("maxSamplerAnisotropy"),
		    JAVA_INT.withName("maxViewports"),
		    MemoryLayout.sequenceLayout(2, JAVA_INT).withName("maxViewportDimensions"),
		    MemoryLayout.sequenceLayout(2, JAVA_FLOAT).withName("viewportBoundsRange"),
		    JAVA_INT.withName("viewportSubPixelBits"),
		    MemoryLayout.paddingLayout(4),
		    JAVA_LONG.withName("minMemoryMapAlignment"),
		    JAVA_LONG.withName("minTexelBufferOffsetAlignment"),
		    JAVA_LONG.withName("minUniformBufferOffsetAlignment"),
		    JAVA_LONG.withName("minStorageBufferOffsetAlignment"),
		    JAVA_INT.withName("minTexelOffset"),
		    JAVA_INT.withName("maxTexelOffset"),
		    JAVA_INT.withName("minTexelGatherOffset"),
		    JAVA_INT.withName("maxTexelGatherOffset"),
		    JAVA_FLOAT.withName("minInterpolationOffset"),
		    JAVA_FLOAT.withName("maxInterpolationOffset"),
		    JAVA_INT.withName("subPixelInterpolationOffsetBits"),
		    JAVA_INT.withName("maxFramebufferWidth"),
		    JAVA_INT.withName("maxFramebufferHeight"),
		    JAVA_INT.withName("maxFramebufferLayers"),
		    JAVA_INT.withName("framebufferColorSampleCounts"),
		    JAVA_INT.withName("framebufferDepthSampleCounts"),
		    JAVA_INT.withName("framebufferStencilSampleCounts"),
		    JAVA_INT.withName("framebufferNoAttachmentsSampleCounts"),
		    JAVA_INT.withName("maxColorAttachments"),
		    JAVA_INT.withName("sampledImageColorSampleCounts"),
		    JAVA_INT.withName("sampledImageIntegerSampleCounts"),
		    JAVA_INT.withName("sampledImageDepthSampleCounts"),
		    JAVA_INT.withName("sampledImageStencilSampleCounts"),
		    JAVA_INT.withName("storageImageSampleCounts"),
		    JAVA_INT.withName("maxSampleMaskWords"),
		    JAVA_INT.withName("timestampComputeAndGraphics"),
		    JAVA_FLOAT.withName("timestampPeriod"),
		    JAVA_INT.withName("maxClipDistances"),
		    JAVA_INT.withName("maxCullDistances"),
		    JAVA_INT.withName("maxCombinedClipAndCullDistances"),
		    JAVA_INT.withName("discreteQueuePriorities"),
		    MemoryLayout.sequenceLayout(2, JAVA_FLOAT).withName("pointSizeRange"),
		    MemoryLayout.sequenceLayout(2, JAVA_FLOAT).withName("lineWidthRange"),
		    JAVA_FLOAT.withName("pointSizeGranularity"),
		    JAVA_FLOAT.withName("lineWidthGranularity"),
		    JAVA_INT.withName("strictLines"),
		    JAVA_INT.withName("standardSampleLocations"),
		    MemoryLayout.paddingLayout(4),
		    JAVA_LONG.withName("optimalBufferCopyOffsetAlignment"),
		    JAVA_LONG.withName("optimalBufferCopyRowPitchAlignment"),
		    JAVA_LONG.withName("nonCoherentAtomSize")
		).withName("VkPhysicalDeviceLimits").withByteAlignment(8);
		
		MAX_IMAGE_DIMENSION1_D_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxImageDimension1D"));
		MAX_IMAGE_DIMENSION2_D_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxImageDimension2D"));
		MAX_IMAGE_DIMENSION3_D_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxImageDimension3D"));
		MAX_IMAGE_DIMENSION_CUBE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxImageDimensionCube"));
		MAX_IMAGE_ARRAY_LAYERS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxImageArrayLayers"));
		MAX_TEXEL_BUFFER_ELEMENTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxTexelBufferElements"));
		MAX_UNIFORM_BUFFER_RANGE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxUniformBufferRange"));
		MAX_STORAGE_BUFFER_RANGE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxStorageBufferRange"));
		MAX_PUSH_CONSTANTS_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxPushConstantsSize"));
		MAX_MEMORY_ALLOCATION_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxMemoryAllocationCount"));
		MAX_SAMPLER_ALLOCATION_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxSamplerAllocationCount"));
		BUFFER_IMAGE_GRANULARITY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("bufferImageGranularity"));
		SPARSE_ADDRESS_SPACE_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sparseAddressSpaceSize"));
		MAX_BOUND_DESCRIPTOR_SETS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxBoundDescriptorSets"));
		MAX_PER_STAGE_DESCRIPTOR_SAMPLERS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxPerStageDescriptorSamplers"));
		MAX_PER_STAGE_DESCRIPTOR_UNIFORM_BUFFERS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxPerStageDescriptorUniformBuffers"));
		MAX_PER_STAGE_DESCRIPTOR_STORAGE_BUFFERS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxPerStageDescriptorStorageBuffers"));
		MAX_PER_STAGE_DESCRIPTOR_SAMPLED_IMAGES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxPerStageDescriptorSampledImages"));
		MAX_PER_STAGE_DESCRIPTOR_STORAGE_IMAGES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxPerStageDescriptorStorageImages"));
		MAX_PER_STAGE_DESCRIPTOR_INPUT_ATTACHMENTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxPerStageDescriptorInputAttachments"));
		MAX_PER_STAGE_RESOURCES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxPerStageResources"));
		MAX_DESCRIPTOR_SET_SAMPLERS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxDescriptorSetSamplers"));
		MAX_DESCRIPTOR_SET_UNIFORM_BUFFERS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxDescriptorSetUniformBuffers"));
		MAX_DESCRIPTOR_SET_UNIFORM_BUFFERS_DYNAMIC_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxDescriptorSetUniformBuffersDynamic"));
		MAX_DESCRIPTOR_SET_STORAGE_BUFFERS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxDescriptorSetStorageBuffers"));
		MAX_DESCRIPTOR_SET_STORAGE_BUFFERS_DYNAMIC_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxDescriptorSetStorageBuffersDynamic"));
		MAX_DESCRIPTOR_SET_SAMPLED_IMAGES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxDescriptorSetSampledImages"));
		MAX_DESCRIPTOR_SET_STORAGE_IMAGES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxDescriptorSetStorageImages"));
		MAX_DESCRIPTOR_SET_INPUT_ATTACHMENTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxDescriptorSetInputAttachments"));
		MAX_VERTEX_INPUT_ATTRIBUTES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxVertexInputAttributes"));
		MAX_VERTEX_INPUT_BINDINGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxVertexInputBindings"));
		MAX_VERTEX_INPUT_ATTRIBUTE_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxVertexInputAttributeOffset"));
		MAX_VERTEX_INPUT_BINDING_STRIDE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxVertexInputBindingStride"));
		MAX_VERTEX_OUTPUT_COMPONENTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxVertexOutputComponents"));
		MAX_TESSELLATION_GENERATION_LEVEL_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxTessellationGenerationLevel"));
		MAX_TESSELLATION_PATCH_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxTessellationPatchSize"));
		MAX_TESSELLATION_CONTROL_PER_VERTEX_INPUT_COMPONENTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxTessellationControlPerVertexInputComponents"));
		MAX_TESSELLATION_CONTROL_PER_VERTEX_OUTPUT_COMPONENTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxTessellationControlPerVertexOutputComponents"));
		MAX_TESSELLATION_CONTROL_PER_PATCH_OUTPUT_COMPONENTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxTessellationControlPerPatchOutputComponents"));
		MAX_TESSELLATION_CONTROL_TOTAL_OUTPUT_COMPONENTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxTessellationControlTotalOutputComponents"));
		MAX_TESSELLATION_EVALUATION_INPUT_COMPONENTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxTessellationEvaluationInputComponents"));
		MAX_TESSELLATION_EVALUATION_OUTPUT_COMPONENTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxTessellationEvaluationOutputComponents"));
		MAX_GEOMETRY_SHADER_INVOCATIONS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxGeometryShaderInvocations"));
		MAX_GEOMETRY_INPUT_COMPONENTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxGeometryInputComponents"));
		MAX_GEOMETRY_OUTPUT_COMPONENTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxGeometryOutputComponents"));
		MAX_GEOMETRY_OUTPUT_VERTICES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxGeometryOutputVertices"));
		MAX_GEOMETRY_TOTAL_OUTPUT_COMPONENTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxGeometryTotalOutputComponents"));
		MAX_FRAGMENT_INPUT_COMPONENTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxFragmentInputComponents"));
		MAX_FRAGMENT_OUTPUT_ATTACHMENTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxFragmentOutputAttachments"));
		MAX_FRAGMENT_DUAL_SRC_ATTACHMENTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxFragmentDualSrcAttachments"));
		MAX_FRAGMENT_COMBINED_OUTPUT_RESOURCES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxFragmentCombinedOutputResources"));
		MAX_COMPUTE_SHARED_MEMORY_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxComputeSharedMemorySize"));
		MAX_COMPUTE_WORK_GROUP_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxComputeWorkGroupCount"), PathElement.sequenceElement());
		MAX_COMPUTE_WORK_GROUP_INVOCATIONS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxComputeWorkGroupInvocations"));
		MAX_COMPUTE_WORK_GROUP_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxComputeWorkGroupSize"), PathElement.sequenceElement());
		SUB_PIXEL_PRECISION_BITS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("subPixelPrecisionBits"));
		SUB_TEXEL_PRECISION_BITS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("subTexelPrecisionBits"));
		MIPMAP_PRECISION_BITS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mipmapPrecisionBits"));
		MAX_DRAW_INDEXED_INDEX_VALUE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxDrawIndexedIndexValue"));
		MAX_DRAW_INDIRECT_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxDrawIndirectCount"));
		MAX_SAMPLER_LOD_BIAS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxSamplerLodBias"));
		MAX_SAMPLER_ANISOTROPY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxSamplerAnisotropy"));
		MAX_VIEWPORTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxViewports"));
		MAX_VIEWPORT_DIMENSIONS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxViewportDimensions"), PathElement.sequenceElement());
		VIEWPORT_BOUNDS_RANGE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("viewportBoundsRange"), PathElement.sequenceElement());
		VIEWPORT_SUB_PIXEL_BITS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("viewportSubPixelBits"));
		MIN_MEMORY_MAP_ALIGNMENT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("minMemoryMapAlignment"));
		MIN_TEXEL_BUFFER_OFFSET_ALIGNMENT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("minTexelBufferOffsetAlignment"));
		MIN_UNIFORM_BUFFER_OFFSET_ALIGNMENT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("minUniformBufferOffsetAlignment"));
		MIN_STORAGE_BUFFER_OFFSET_ALIGNMENT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("minStorageBufferOffsetAlignment"));
		MIN_TEXEL_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("minTexelOffset"));
		MAX_TEXEL_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxTexelOffset"));
		MIN_TEXEL_GATHER_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("minTexelGatherOffset"));
		MAX_TEXEL_GATHER_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxTexelGatherOffset"));
		MIN_INTERPOLATION_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("minInterpolationOffset"));
		MAX_INTERPOLATION_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxInterpolationOffset"));
		SUB_PIXEL_INTERPOLATION_OFFSET_BITS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("subPixelInterpolationOffsetBits"));
		MAX_FRAMEBUFFER_WIDTH_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxFramebufferWidth"));
		MAX_FRAMEBUFFER_HEIGHT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxFramebufferHeight"));
		MAX_FRAMEBUFFER_LAYERS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxFramebufferLayers"));
		FRAMEBUFFER_COLOR_SAMPLE_COUNTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("framebufferColorSampleCounts"));
		FRAMEBUFFER_DEPTH_SAMPLE_COUNTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("framebufferDepthSampleCounts"));
		FRAMEBUFFER_STENCIL_SAMPLE_COUNTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("framebufferStencilSampleCounts"));
		FRAMEBUFFER_NO_ATTACHMENTS_SAMPLE_COUNTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("framebufferNoAttachmentsSampleCounts"));
		MAX_COLOR_ATTACHMENTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxColorAttachments"));
		SAMPLED_IMAGE_COLOR_SAMPLE_COUNTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sampledImageColorSampleCounts"));
		SAMPLED_IMAGE_INTEGER_SAMPLE_COUNTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sampledImageIntegerSampleCounts"));
		SAMPLED_IMAGE_DEPTH_SAMPLE_COUNTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sampledImageDepthSampleCounts"));
		SAMPLED_IMAGE_STENCIL_SAMPLE_COUNTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sampledImageStencilSampleCounts"));
		STORAGE_IMAGE_SAMPLE_COUNTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("storageImageSampleCounts"));
		MAX_SAMPLE_MASK_WORDS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxSampleMaskWords"));
		TIMESTAMP_COMPUTE_AND_GRAPHICS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("timestampComputeAndGraphics"));
		TIMESTAMP_PERIOD_HANDLE = LAYOUT.varHandle(PathElement.groupElement("timestampPeriod"));
		MAX_CLIP_DISTANCES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxClipDistances"));
		MAX_CULL_DISTANCES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxCullDistances"));
		MAX_COMBINED_CLIP_AND_CULL_DISTANCES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxCombinedClipAndCullDistances"));
		DISCRETE_QUEUE_PRIORITIES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("discreteQueuePriorities"));
		POINT_SIZE_RANGE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pointSizeRange"), PathElement.sequenceElement());
		LINE_WIDTH_RANGE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("lineWidthRange"), PathElement.sequenceElement());
		POINT_SIZE_GRANULARITY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pointSizeGranularity"));
		LINE_WIDTH_GRANULARITY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("lineWidthGranularity"));
		STRICT_LINES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("strictLines"));
		STANDARD_SAMPLE_LOCATIONS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("standardSampleLocations"));
		OPTIMAL_BUFFER_COPY_OFFSET_ALIGNMENT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("optimalBufferCopyOffsetAlignment"));
		OPTIMAL_BUFFER_COPY_ROW_PITCH_ALIGNMENT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("optimalBufferCopyRowPitchAlignment"));
		NON_COHERENT_ATOM_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("nonCoherentAtomSize"));
		
		MAX_IMAGE_DIMENSION1_D_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxImageDimension1D"));
		MAX_IMAGE_DIMENSION2_D_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxImageDimension2D"));
		MAX_IMAGE_DIMENSION3_D_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxImageDimension3D"));
		MAX_IMAGE_DIMENSION_CUBE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxImageDimensionCube"));
		MAX_IMAGE_ARRAY_LAYERS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxImageArrayLayers"));
		MAX_TEXEL_BUFFER_ELEMENTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxTexelBufferElements"));
		MAX_UNIFORM_BUFFER_RANGE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxUniformBufferRange"));
		MAX_STORAGE_BUFFER_RANGE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxStorageBufferRange"));
		MAX_PUSH_CONSTANTS_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxPushConstantsSize"));
		MAX_MEMORY_ALLOCATION_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxMemoryAllocationCount"));
		MAX_SAMPLER_ALLOCATION_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxSamplerAllocationCount"));
		BUFFER_IMAGE_GRANULARITY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("bufferImageGranularity"));
		SPARSE_ADDRESS_SPACE_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sparseAddressSpaceSize"));
		MAX_BOUND_DESCRIPTOR_SETS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxBoundDescriptorSets"));
		MAX_PER_STAGE_DESCRIPTOR_SAMPLERS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxPerStageDescriptorSamplers"));
		MAX_PER_STAGE_DESCRIPTOR_UNIFORM_BUFFERS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxPerStageDescriptorUniformBuffers"));
		MAX_PER_STAGE_DESCRIPTOR_STORAGE_BUFFERS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxPerStageDescriptorStorageBuffers"));
		MAX_PER_STAGE_DESCRIPTOR_SAMPLED_IMAGES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxPerStageDescriptorSampledImages"));
		MAX_PER_STAGE_DESCRIPTOR_STORAGE_IMAGES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxPerStageDescriptorStorageImages"));
		MAX_PER_STAGE_DESCRIPTOR_INPUT_ATTACHMENTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxPerStageDescriptorInputAttachments"));
		MAX_PER_STAGE_RESOURCES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxPerStageResources"));
		MAX_DESCRIPTOR_SET_SAMPLERS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetSamplers"));
		MAX_DESCRIPTOR_SET_UNIFORM_BUFFERS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetUniformBuffers"));
		MAX_DESCRIPTOR_SET_UNIFORM_BUFFERS_DYNAMIC_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetUniformBuffersDynamic"));
		MAX_DESCRIPTOR_SET_STORAGE_BUFFERS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetStorageBuffers"));
		MAX_DESCRIPTOR_SET_STORAGE_BUFFERS_DYNAMIC_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetStorageBuffersDynamic"));
		MAX_DESCRIPTOR_SET_SAMPLED_IMAGES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetSampledImages"));
		MAX_DESCRIPTOR_SET_STORAGE_IMAGES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetStorageImages"));
		MAX_DESCRIPTOR_SET_INPUT_ATTACHMENTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetInputAttachments"));
		MAX_VERTEX_INPUT_ATTRIBUTES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxVertexInputAttributes"));
		MAX_VERTEX_INPUT_BINDINGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxVertexInputBindings"));
		MAX_VERTEX_INPUT_ATTRIBUTE_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxVertexInputAttributeOffset"));
		MAX_VERTEX_INPUT_BINDING_STRIDE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxVertexInputBindingStride"));
		MAX_VERTEX_OUTPUT_COMPONENTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxVertexOutputComponents"));
		MAX_TESSELLATION_GENERATION_LEVEL_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxTessellationGenerationLevel"));
		MAX_TESSELLATION_PATCH_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxTessellationPatchSize"));
		MAX_TESSELLATION_CONTROL_PER_VERTEX_INPUT_COMPONENTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxTessellationControlPerVertexInputComponents"));
		MAX_TESSELLATION_CONTROL_PER_VERTEX_OUTPUT_COMPONENTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxTessellationControlPerVertexOutputComponents"));
		MAX_TESSELLATION_CONTROL_PER_PATCH_OUTPUT_COMPONENTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxTessellationControlPerPatchOutputComponents"));
		MAX_TESSELLATION_CONTROL_TOTAL_OUTPUT_COMPONENTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxTessellationControlTotalOutputComponents"));
		MAX_TESSELLATION_EVALUATION_INPUT_COMPONENTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxTessellationEvaluationInputComponents"));
		MAX_TESSELLATION_EVALUATION_OUTPUT_COMPONENTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxTessellationEvaluationOutputComponents"));
		MAX_GEOMETRY_SHADER_INVOCATIONS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxGeometryShaderInvocations"));
		MAX_GEOMETRY_INPUT_COMPONENTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxGeometryInputComponents"));
		MAX_GEOMETRY_OUTPUT_COMPONENTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxGeometryOutputComponents"));
		MAX_GEOMETRY_OUTPUT_VERTICES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxGeometryOutputVertices"));
		MAX_GEOMETRY_TOTAL_OUTPUT_COMPONENTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxGeometryTotalOutputComponents"));
		MAX_FRAGMENT_INPUT_COMPONENTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxFragmentInputComponents"));
		MAX_FRAGMENT_OUTPUT_ATTACHMENTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxFragmentOutputAttachments"));
		MAX_FRAGMENT_DUAL_SRC_ATTACHMENTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxFragmentDualSrcAttachments"));
		MAX_FRAGMENT_COMBINED_OUTPUT_RESOURCES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxFragmentCombinedOutputResources"));
		MAX_COMPUTE_SHARED_MEMORY_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxComputeSharedMemorySize"));
		MAX_COMPUTE_WORK_GROUP_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxComputeWorkGroupCount"));
		MAX_COMPUTE_WORK_GROUP_INVOCATIONS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxComputeWorkGroupInvocations"));
		MAX_COMPUTE_WORK_GROUP_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxComputeWorkGroupSize"));
		SUB_PIXEL_PRECISION_BITS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("subPixelPrecisionBits"));
		SUB_TEXEL_PRECISION_BITS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("subTexelPrecisionBits"));
		MIPMAP_PRECISION_BITS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mipmapPrecisionBits"));
		MAX_DRAW_INDEXED_INDEX_VALUE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxDrawIndexedIndexValue"));
		MAX_DRAW_INDIRECT_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxDrawIndirectCount"));
		MAX_SAMPLER_LOD_BIAS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxSamplerLodBias"));
		MAX_SAMPLER_ANISOTROPY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxSamplerAnisotropy"));
		MAX_VIEWPORTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxViewports"));
		MAX_VIEWPORT_DIMENSIONS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxViewportDimensions"));
		VIEWPORT_BOUNDS_RANGE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("viewportBoundsRange"));
		VIEWPORT_SUB_PIXEL_BITS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("viewportSubPixelBits"));
		MIN_MEMORY_MAP_ALIGNMENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("minMemoryMapAlignment"));
		MIN_TEXEL_BUFFER_OFFSET_ALIGNMENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("minTexelBufferOffsetAlignment"));
		MIN_UNIFORM_BUFFER_OFFSET_ALIGNMENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("minUniformBufferOffsetAlignment"));
		MIN_STORAGE_BUFFER_OFFSET_ALIGNMENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("minStorageBufferOffsetAlignment"));
		MIN_TEXEL_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("minTexelOffset"));
		MAX_TEXEL_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxTexelOffset"));
		MIN_TEXEL_GATHER_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("minTexelGatherOffset"));
		MAX_TEXEL_GATHER_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxTexelGatherOffset"));
		MIN_INTERPOLATION_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("minInterpolationOffset"));
		MAX_INTERPOLATION_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxInterpolationOffset"));
		SUB_PIXEL_INTERPOLATION_OFFSET_BITS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("subPixelInterpolationOffsetBits"));
		MAX_FRAMEBUFFER_WIDTH_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxFramebufferWidth"));
		MAX_FRAMEBUFFER_HEIGHT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxFramebufferHeight"));
		MAX_FRAMEBUFFER_LAYERS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxFramebufferLayers"));
		FRAMEBUFFER_COLOR_SAMPLE_COUNTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("framebufferColorSampleCounts"));
		FRAMEBUFFER_DEPTH_SAMPLE_COUNTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("framebufferDepthSampleCounts"));
		FRAMEBUFFER_STENCIL_SAMPLE_COUNTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("framebufferStencilSampleCounts"));
		FRAMEBUFFER_NO_ATTACHMENTS_SAMPLE_COUNTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("framebufferNoAttachmentsSampleCounts"));
		MAX_COLOR_ATTACHMENTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxColorAttachments"));
		SAMPLED_IMAGE_COLOR_SAMPLE_COUNTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sampledImageColorSampleCounts"));
		SAMPLED_IMAGE_INTEGER_SAMPLE_COUNTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sampledImageIntegerSampleCounts"));
		SAMPLED_IMAGE_DEPTH_SAMPLE_COUNTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sampledImageDepthSampleCounts"));
		SAMPLED_IMAGE_STENCIL_SAMPLE_COUNTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sampledImageStencilSampleCounts"));
		STORAGE_IMAGE_SAMPLE_COUNTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("storageImageSampleCounts"));
		MAX_SAMPLE_MASK_WORDS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxSampleMaskWords"));
		TIMESTAMP_COMPUTE_AND_GRAPHICS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("timestampComputeAndGraphics"));
		TIMESTAMP_PERIOD_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("timestampPeriod"));
		MAX_CLIP_DISTANCES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxClipDistances"));
		MAX_CULL_DISTANCES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxCullDistances"));
		MAX_COMBINED_CLIP_AND_CULL_DISTANCES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxCombinedClipAndCullDistances"));
		DISCRETE_QUEUE_PRIORITIES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("discreteQueuePriorities"));
		POINT_SIZE_RANGE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pointSizeRange"));
		LINE_WIDTH_RANGE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("lineWidthRange"));
		POINT_SIZE_GRANULARITY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pointSizeGranularity"));
		LINE_WIDTH_GRANULARITY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("lineWidthGranularity"));
		STRICT_LINES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("strictLines"));
		STANDARD_SAMPLE_LOCATIONS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("standardSampleLocations"));
		OPTIMAL_BUFFER_COPY_OFFSET_ALIGNMENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("optimalBufferCopyOffsetAlignment"));
		OPTIMAL_BUFFER_COPY_ROW_PITCH_ALIGNMENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("optimalBufferCopyRowPitchAlignment"));
		NON_COHERENT_ATOM_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("nonCoherentAtomSize"));
		//@formatter:on
	}

	public VkPhysicalDeviceLimits() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceLimits(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceLimits(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #maxImageDimension1D()
    public VkPhysicalDeviceLimits maxImageDimension1D(int maxImageDimension1D) {
    	MAX_IMAGE_DIMENSION1_D_HANDLE.set(segment, 0L, maxImageDimension1D);
    	return this;
    }
    
    public int maxImageDimension1D() {
    	return (int) MAX_IMAGE_DIMENSION1_D_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxImageDimension2D()
    public VkPhysicalDeviceLimits maxImageDimension2D(int maxImageDimension2D) {
    	MAX_IMAGE_DIMENSION2_D_HANDLE.set(segment, 0L, maxImageDimension2D);
    	return this;
    }
    
    public int maxImageDimension2D() {
    	return (int) MAX_IMAGE_DIMENSION2_D_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxImageDimension3D()
    public VkPhysicalDeviceLimits maxImageDimension3D(int maxImageDimension3D) {
    	MAX_IMAGE_DIMENSION3_D_HANDLE.set(segment, 0L, maxImageDimension3D);
    	return this;
    }
    
    public int maxImageDimension3D() {
    	return (int) MAX_IMAGE_DIMENSION3_D_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxImageDimensionCube()
    public VkPhysicalDeviceLimits maxImageDimensionCube(int maxImageDimensionCube) {
    	MAX_IMAGE_DIMENSION_CUBE_HANDLE.set(segment, 0L, maxImageDimensionCube);
    	return this;
    }
    
    public int maxImageDimensionCube() {
    	return (int) MAX_IMAGE_DIMENSION_CUBE_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxImageArrayLayers()
    public VkPhysicalDeviceLimits maxImageArrayLayers(int maxImageArrayLayers) {
    	MAX_IMAGE_ARRAY_LAYERS_HANDLE.set(segment, 0L, maxImageArrayLayers);
    	return this;
    }
    
    public int maxImageArrayLayers() {
    	return (int) MAX_IMAGE_ARRAY_LAYERS_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxTexelBufferElements()
    public VkPhysicalDeviceLimits maxTexelBufferElements(int maxTexelBufferElements) {
    	MAX_TEXEL_BUFFER_ELEMENTS_HANDLE.set(segment, 0L, maxTexelBufferElements);
    	return this;
    }
    
    public int maxTexelBufferElements() {
    	return (int) MAX_TEXEL_BUFFER_ELEMENTS_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxUniformBufferRange()
    public VkPhysicalDeviceLimits maxUniformBufferRange(int maxUniformBufferRange) {
    	MAX_UNIFORM_BUFFER_RANGE_HANDLE.set(segment, 0L, maxUniformBufferRange);
    	return this;
    }
    
    public int maxUniformBufferRange() {
    	return (int) MAX_UNIFORM_BUFFER_RANGE_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxStorageBufferRange()
    public VkPhysicalDeviceLimits maxStorageBufferRange(int maxStorageBufferRange) {
    	MAX_STORAGE_BUFFER_RANGE_HANDLE.set(segment, 0L, maxStorageBufferRange);
    	return this;
    }
    
    public int maxStorageBufferRange() {
    	return (int) MAX_STORAGE_BUFFER_RANGE_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxPushConstantsSize()
    public VkPhysicalDeviceLimits maxPushConstantsSize(int maxPushConstantsSize) {
    	MAX_PUSH_CONSTANTS_SIZE_HANDLE.set(segment, 0L, maxPushConstantsSize);
    	return this;
    }
    
    public int maxPushConstantsSize() {
    	return (int) MAX_PUSH_CONSTANTS_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxMemoryAllocationCount()
    public VkPhysicalDeviceLimits maxMemoryAllocationCount(int maxMemoryAllocationCount) {
    	MAX_MEMORY_ALLOCATION_COUNT_HANDLE.set(segment, 0L, maxMemoryAllocationCount);
    	return this;
    }
    
    public int maxMemoryAllocationCount() {
    	return (int) MAX_MEMORY_ALLOCATION_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxSamplerAllocationCount()
    public VkPhysicalDeviceLimits maxSamplerAllocationCount(int maxSamplerAllocationCount) {
    	MAX_SAMPLER_ALLOCATION_COUNT_HANDLE.set(segment, 0L, maxSamplerAllocationCount);
    	return this;
    }
    
    public int maxSamplerAllocationCount() {
    	return (int) MAX_SAMPLER_ALLOCATION_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #bufferImageGranularity()
    public VkPhysicalDeviceLimits bufferImageGranularity(long bufferImageGranularity) {
    	BUFFER_IMAGE_GRANULARITY_HANDLE.set(segment, 0L, bufferImageGranularity);
    	return this;
    }
    
    public long bufferImageGranularity() {
    	return (long) BUFFER_IMAGE_GRANULARITY_HANDLE.get(segment, 0L);
    }
    
    /// @see #sparseAddressSpaceSize()
    public VkPhysicalDeviceLimits sparseAddressSpaceSize(long sparseAddressSpaceSize) {
    	SPARSE_ADDRESS_SPACE_SIZE_HANDLE.set(segment, 0L, sparseAddressSpaceSize);
    	return this;
    }
    
    public long sparseAddressSpaceSize() {
    	return (long) SPARSE_ADDRESS_SPACE_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxBoundDescriptorSets()
    public VkPhysicalDeviceLimits maxBoundDescriptorSets(int maxBoundDescriptorSets) {
    	MAX_BOUND_DESCRIPTOR_SETS_HANDLE.set(segment, 0L, maxBoundDescriptorSets);
    	return this;
    }
    
    public int maxBoundDescriptorSets() {
    	return (int) MAX_BOUND_DESCRIPTOR_SETS_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxPerStageDescriptorSamplers()
    public VkPhysicalDeviceLimits maxPerStageDescriptorSamplers(int maxPerStageDescriptorSamplers) {
    	MAX_PER_STAGE_DESCRIPTOR_SAMPLERS_HANDLE.set(segment, 0L, maxPerStageDescriptorSamplers);
    	return this;
    }
    
    public int maxPerStageDescriptorSamplers() {
    	return (int) MAX_PER_STAGE_DESCRIPTOR_SAMPLERS_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxPerStageDescriptorUniformBuffers()
    public VkPhysicalDeviceLimits maxPerStageDescriptorUniformBuffers(int maxPerStageDescriptorUniformBuffers) {
    	MAX_PER_STAGE_DESCRIPTOR_UNIFORM_BUFFERS_HANDLE.set(segment, 0L, maxPerStageDescriptorUniformBuffers);
    	return this;
    }
    
    public int maxPerStageDescriptorUniformBuffers() {
    	return (int) MAX_PER_STAGE_DESCRIPTOR_UNIFORM_BUFFERS_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxPerStageDescriptorStorageBuffers()
    public VkPhysicalDeviceLimits maxPerStageDescriptorStorageBuffers(int maxPerStageDescriptorStorageBuffers) {
    	MAX_PER_STAGE_DESCRIPTOR_STORAGE_BUFFERS_HANDLE.set(segment, 0L, maxPerStageDescriptorStorageBuffers);
    	return this;
    }
    
    public int maxPerStageDescriptorStorageBuffers() {
    	return (int) MAX_PER_STAGE_DESCRIPTOR_STORAGE_BUFFERS_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxPerStageDescriptorSampledImages()
    public VkPhysicalDeviceLimits maxPerStageDescriptorSampledImages(int maxPerStageDescriptorSampledImages) {
    	MAX_PER_STAGE_DESCRIPTOR_SAMPLED_IMAGES_HANDLE.set(segment, 0L, maxPerStageDescriptorSampledImages);
    	return this;
    }
    
    public int maxPerStageDescriptorSampledImages() {
    	return (int) MAX_PER_STAGE_DESCRIPTOR_SAMPLED_IMAGES_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxPerStageDescriptorStorageImages()
    public VkPhysicalDeviceLimits maxPerStageDescriptorStorageImages(int maxPerStageDescriptorStorageImages) {
    	MAX_PER_STAGE_DESCRIPTOR_STORAGE_IMAGES_HANDLE.set(segment, 0L, maxPerStageDescriptorStorageImages);
    	return this;
    }
    
    public int maxPerStageDescriptorStorageImages() {
    	return (int) MAX_PER_STAGE_DESCRIPTOR_STORAGE_IMAGES_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxPerStageDescriptorInputAttachments()
    public VkPhysicalDeviceLimits maxPerStageDescriptorInputAttachments(int maxPerStageDescriptorInputAttachments) {
    	MAX_PER_STAGE_DESCRIPTOR_INPUT_ATTACHMENTS_HANDLE.set(segment, 0L, maxPerStageDescriptorInputAttachments);
    	return this;
    }
    
    public int maxPerStageDescriptorInputAttachments() {
    	return (int) MAX_PER_STAGE_DESCRIPTOR_INPUT_ATTACHMENTS_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxPerStageResources()
    public VkPhysicalDeviceLimits maxPerStageResources(int maxPerStageResources) {
    	MAX_PER_STAGE_RESOURCES_HANDLE.set(segment, 0L, maxPerStageResources);
    	return this;
    }
    
    public int maxPerStageResources() {
    	return (int) MAX_PER_STAGE_RESOURCES_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxDescriptorSetSamplers()
    public VkPhysicalDeviceLimits maxDescriptorSetSamplers(int maxDescriptorSetSamplers) {
    	MAX_DESCRIPTOR_SET_SAMPLERS_HANDLE.set(segment, 0L, maxDescriptorSetSamplers);
    	return this;
    }
    
    public int maxDescriptorSetSamplers() {
    	return (int) MAX_DESCRIPTOR_SET_SAMPLERS_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxDescriptorSetUniformBuffers()
    public VkPhysicalDeviceLimits maxDescriptorSetUniformBuffers(int maxDescriptorSetUniformBuffers) {
    	MAX_DESCRIPTOR_SET_UNIFORM_BUFFERS_HANDLE.set(segment, 0L, maxDescriptorSetUniformBuffers);
    	return this;
    }
    
    public int maxDescriptorSetUniformBuffers() {
    	return (int) MAX_DESCRIPTOR_SET_UNIFORM_BUFFERS_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxDescriptorSetUniformBuffersDynamic()
    public VkPhysicalDeviceLimits maxDescriptorSetUniformBuffersDynamic(int maxDescriptorSetUniformBuffersDynamic) {
    	MAX_DESCRIPTOR_SET_UNIFORM_BUFFERS_DYNAMIC_HANDLE.set(segment, 0L, maxDescriptorSetUniformBuffersDynamic);
    	return this;
    }
    
    public int maxDescriptorSetUniformBuffersDynamic() {
    	return (int) MAX_DESCRIPTOR_SET_UNIFORM_BUFFERS_DYNAMIC_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxDescriptorSetStorageBuffers()
    public VkPhysicalDeviceLimits maxDescriptorSetStorageBuffers(int maxDescriptorSetStorageBuffers) {
    	MAX_DESCRIPTOR_SET_STORAGE_BUFFERS_HANDLE.set(segment, 0L, maxDescriptorSetStorageBuffers);
    	return this;
    }
    
    public int maxDescriptorSetStorageBuffers() {
    	return (int) MAX_DESCRIPTOR_SET_STORAGE_BUFFERS_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxDescriptorSetStorageBuffersDynamic()
    public VkPhysicalDeviceLimits maxDescriptorSetStorageBuffersDynamic(int maxDescriptorSetStorageBuffersDynamic) {
    	MAX_DESCRIPTOR_SET_STORAGE_BUFFERS_DYNAMIC_HANDLE.set(segment, 0L, maxDescriptorSetStorageBuffersDynamic);
    	return this;
    }
    
    public int maxDescriptorSetStorageBuffersDynamic() {
    	return (int) MAX_DESCRIPTOR_SET_STORAGE_BUFFERS_DYNAMIC_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxDescriptorSetSampledImages()
    public VkPhysicalDeviceLimits maxDescriptorSetSampledImages(int maxDescriptorSetSampledImages) {
    	MAX_DESCRIPTOR_SET_SAMPLED_IMAGES_HANDLE.set(segment, 0L, maxDescriptorSetSampledImages);
    	return this;
    }
    
    public int maxDescriptorSetSampledImages() {
    	return (int) MAX_DESCRIPTOR_SET_SAMPLED_IMAGES_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxDescriptorSetStorageImages()
    public VkPhysicalDeviceLimits maxDescriptorSetStorageImages(int maxDescriptorSetStorageImages) {
    	MAX_DESCRIPTOR_SET_STORAGE_IMAGES_HANDLE.set(segment, 0L, maxDescriptorSetStorageImages);
    	return this;
    }
    
    public int maxDescriptorSetStorageImages() {
    	return (int) MAX_DESCRIPTOR_SET_STORAGE_IMAGES_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxDescriptorSetInputAttachments()
    public VkPhysicalDeviceLimits maxDescriptorSetInputAttachments(int maxDescriptorSetInputAttachments) {
    	MAX_DESCRIPTOR_SET_INPUT_ATTACHMENTS_HANDLE.set(segment, 0L, maxDescriptorSetInputAttachments);
    	return this;
    }
    
    public int maxDescriptorSetInputAttachments() {
    	return (int) MAX_DESCRIPTOR_SET_INPUT_ATTACHMENTS_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxVertexInputAttributes()
    public VkPhysicalDeviceLimits maxVertexInputAttributes(int maxVertexInputAttributes) {
    	MAX_VERTEX_INPUT_ATTRIBUTES_HANDLE.set(segment, 0L, maxVertexInputAttributes);
    	return this;
    }
    
    public int maxVertexInputAttributes() {
    	return (int) MAX_VERTEX_INPUT_ATTRIBUTES_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxVertexInputBindings()
    public VkPhysicalDeviceLimits maxVertexInputBindings(int maxVertexInputBindings) {
    	MAX_VERTEX_INPUT_BINDINGS_HANDLE.set(segment, 0L, maxVertexInputBindings);
    	return this;
    }
    
    public int maxVertexInputBindings() {
    	return (int) MAX_VERTEX_INPUT_BINDINGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxVertexInputAttributeOffset()
    public VkPhysicalDeviceLimits maxVertexInputAttributeOffset(int maxVertexInputAttributeOffset) {
    	MAX_VERTEX_INPUT_ATTRIBUTE_OFFSET_HANDLE.set(segment, 0L, maxVertexInputAttributeOffset);
    	return this;
    }
    
    public int maxVertexInputAttributeOffset() {
    	return (int) MAX_VERTEX_INPUT_ATTRIBUTE_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxVertexInputBindingStride()
    public VkPhysicalDeviceLimits maxVertexInputBindingStride(int maxVertexInputBindingStride) {
    	MAX_VERTEX_INPUT_BINDING_STRIDE_HANDLE.set(segment, 0L, maxVertexInputBindingStride);
    	return this;
    }
    
    public int maxVertexInputBindingStride() {
    	return (int) MAX_VERTEX_INPUT_BINDING_STRIDE_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxVertexOutputComponents()
    public VkPhysicalDeviceLimits maxVertexOutputComponents(int maxVertexOutputComponents) {
    	MAX_VERTEX_OUTPUT_COMPONENTS_HANDLE.set(segment, 0L, maxVertexOutputComponents);
    	return this;
    }
    
    public int maxVertexOutputComponents() {
    	return (int) MAX_VERTEX_OUTPUT_COMPONENTS_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxTessellationGenerationLevel()
    public VkPhysicalDeviceLimits maxTessellationGenerationLevel(int maxTessellationGenerationLevel) {
    	MAX_TESSELLATION_GENERATION_LEVEL_HANDLE.set(segment, 0L, maxTessellationGenerationLevel);
    	return this;
    }
    
    public int maxTessellationGenerationLevel() {
    	return (int) MAX_TESSELLATION_GENERATION_LEVEL_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxTessellationPatchSize()
    public VkPhysicalDeviceLimits maxTessellationPatchSize(int maxTessellationPatchSize) {
    	MAX_TESSELLATION_PATCH_SIZE_HANDLE.set(segment, 0L, maxTessellationPatchSize);
    	return this;
    }
    
    public int maxTessellationPatchSize() {
    	return (int) MAX_TESSELLATION_PATCH_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxTessellationControlPerVertexInputComponents()
    public VkPhysicalDeviceLimits maxTessellationControlPerVertexInputComponents(int maxTessellationControlPerVertexInputComponents) {
    	MAX_TESSELLATION_CONTROL_PER_VERTEX_INPUT_COMPONENTS_HANDLE.set(segment, 0L, maxTessellationControlPerVertexInputComponents);
    	return this;
    }
    
    public int maxTessellationControlPerVertexInputComponents() {
    	return (int) MAX_TESSELLATION_CONTROL_PER_VERTEX_INPUT_COMPONENTS_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxTessellationControlPerVertexOutputComponents()
    public VkPhysicalDeviceLimits maxTessellationControlPerVertexOutputComponents(int maxTessellationControlPerVertexOutputComponents) {
    	MAX_TESSELLATION_CONTROL_PER_VERTEX_OUTPUT_COMPONENTS_HANDLE.set(segment, 0L, maxTessellationControlPerVertexOutputComponents);
    	return this;
    }
    
    public int maxTessellationControlPerVertexOutputComponents() {
    	return (int) MAX_TESSELLATION_CONTROL_PER_VERTEX_OUTPUT_COMPONENTS_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxTessellationControlPerPatchOutputComponents()
    public VkPhysicalDeviceLimits maxTessellationControlPerPatchOutputComponents(int maxTessellationControlPerPatchOutputComponents) {
    	MAX_TESSELLATION_CONTROL_PER_PATCH_OUTPUT_COMPONENTS_HANDLE.set(segment, 0L, maxTessellationControlPerPatchOutputComponents);
    	return this;
    }
    
    public int maxTessellationControlPerPatchOutputComponents() {
    	return (int) MAX_TESSELLATION_CONTROL_PER_PATCH_OUTPUT_COMPONENTS_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxTessellationControlTotalOutputComponents()
    public VkPhysicalDeviceLimits maxTessellationControlTotalOutputComponents(int maxTessellationControlTotalOutputComponents) {
    	MAX_TESSELLATION_CONTROL_TOTAL_OUTPUT_COMPONENTS_HANDLE.set(segment, 0L, maxTessellationControlTotalOutputComponents);
    	return this;
    }
    
    public int maxTessellationControlTotalOutputComponents() {
    	return (int) MAX_TESSELLATION_CONTROL_TOTAL_OUTPUT_COMPONENTS_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxTessellationEvaluationInputComponents()
    public VkPhysicalDeviceLimits maxTessellationEvaluationInputComponents(int maxTessellationEvaluationInputComponents) {
    	MAX_TESSELLATION_EVALUATION_INPUT_COMPONENTS_HANDLE.set(segment, 0L, maxTessellationEvaluationInputComponents);
    	return this;
    }
    
    public int maxTessellationEvaluationInputComponents() {
    	return (int) MAX_TESSELLATION_EVALUATION_INPUT_COMPONENTS_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxTessellationEvaluationOutputComponents()
    public VkPhysicalDeviceLimits maxTessellationEvaluationOutputComponents(int maxTessellationEvaluationOutputComponents) {
    	MAX_TESSELLATION_EVALUATION_OUTPUT_COMPONENTS_HANDLE.set(segment, 0L, maxTessellationEvaluationOutputComponents);
    	return this;
    }
    
    public int maxTessellationEvaluationOutputComponents() {
    	return (int) MAX_TESSELLATION_EVALUATION_OUTPUT_COMPONENTS_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxGeometryShaderInvocations()
    public VkPhysicalDeviceLimits maxGeometryShaderInvocations(int maxGeometryShaderInvocations) {
    	MAX_GEOMETRY_SHADER_INVOCATIONS_HANDLE.set(segment, 0L, maxGeometryShaderInvocations);
    	return this;
    }
    
    public int maxGeometryShaderInvocations() {
    	return (int) MAX_GEOMETRY_SHADER_INVOCATIONS_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxGeometryInputComponents()
    public VkPhysicalDeviceLimits maxGeometryInputComponents(int maxGeometryInputComponents) {
    	MAX_GEOMETRY_INPUT_COMPONENTS_HANDLE.set(segment, 0L, maxGeometryInputComponents);
    	return this;
    }
    
    public int maxGeometryInputComponents() {
    	return (int) MAX_GEOMETRY_INPUT_COMPONENTS_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxGeometryOutputComponents()
    public VkPhysicalDeviceLimits maxGeometryOutputComponents(int maxGeometryOutputComponents) {
    	MAX_GEOMETRY_OUTPUT_COMPONENTS_HANDLE.set(segment, 0L, maxGeometryOutputComponents);
    	return this;
    }
    
    public int maxGeometryOutputComponents() {
    	return (int) MAX_GEOMETRY_OUTPUT_COMPONENTS_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxGeometryOutputVertices()
    public VkPhysicalDeviceLimits maxGeometryOutputVertices(int maxGeometryOutputVertices) {
    	MAX_GEOMETRY_OUTPUT_VERTICES_HANDLE.set(segment, 0L, maxGeometryOutputVertices);
    	return this;
    }
    
    public int maxGeometryOutputVertices() {
    	return (int) MAX_GEOMETRY_OUTPUT_VERTICES_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxGeometryTotalOutputComponents()
    public VkPhysicalDeviceLimits maxGeometryTotalOutputComponents(int maxGeometryTotalOutputComponents) {
    	MAX_GEOMETRY_TOTAL_OUTPUT_COMPONENTS_HANDLE.set(segment, 0L, maxGeometryTotalOutputComponents);
    	return this;
    }
    
    public int maxGeometryTotalOutputComponents() {
    	return (int) MAX_GEOMETRY_TOTAL_OUTPUT_COMPONENTS_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxFragmentInputComponents()
    public VkPhysicalDeviceLimits maxFragmentInputComponents(int maxFragmentInputComponents) {
    	MAX_FRAGMENT_INPUT_COMPONENTS_HANDLE.set(segment, 0L, maxFragmentInputComponents);
    	return this;
    }
    
    public int maxFragmentInputComponents() {
    	return (int) MAX_FRAGMENT_INPUT_COMPONENTS_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxFragmentOutputAttachments()
    public VkPhysicalDeviceLimits maxFragmentOutputAttachments(int maxFragmentOutputAttachments) {
    	MAX_FRAGMENT_OUTPUT_ATTACHMENTS_HANDLE.set(segment, 0L, maxFragmentOutputAttachments);
    	return this;
    }
    
    public int maxFragmentOutputAttachments() {
    	return (int) MAX_FRAGMENT_OUTPUT_ATTACHMENTS_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxFragmentDualSrcAttachments()
    public VkPhysicalDeviceLimits maxFragmentDualSrcAttachments(int maxFragmentDualSrcAttachments) {
    	MAX_FRAGMENT_DUAL_SRC_ATTACHMENTS_HANDLE.set(segment, 0L, maxFragmentDualSrcAttachments);
    	return this;
    }
    
    public int maxFragmentDualSrcAttachments() {
    	return (int) MAX_FRAGMENT_DUAL_SRC_ATTACHMENTS_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxFragmentCombinedOutputResources()
    public VkPhysicalDeviceLimits maxFragmentCombinedOutputResources(int maxFragmentCombinedOutputResources) {
    	MAX_FRAGMENT_COMBINED_OUTPUT_RESOURCES_HANDLE.set(segment, 0L, maxFragmentCombinedOutputResources);
    	return this;
    }
    
    public int maxFragmentCombinedOutputResources() {
    	return (int) MAX_FRAGMENT_COMBINED_OUTPUT_RESOURCES_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxComputeSharedMemorySize()
    public VkPhysicalDeviceLimits maxComputeSharedMemorySize(int maxComputeSharedMemorySize) {
    	MAX_COMPUTE_SHARED_MEMORY_SIZE_HANDLE.set(segment, 0L, maxComputeSharedMemorySize);
    	return this;
    }
    
    public int maxComputeSharedMemorySize() {
    	return (int) MAX_COMPUTE_SHARED_MEMORY_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxComputeWorkGroupCount(int)
    public VkPhysicalDeviceLimits maxComputeWorkGroupCount(int maxComputeWorkGroupCount, int index0) {
    	MAX_COMPUTE_WORK_GROUP_COUNT_HANDLE.set(segment, 0L, index0, maxComputeWorkGroupCount);
    	return this;
    }
    
    public int maxComputeWorkGroupCount(int index0) {
    	return (int) MAX_COMPUTE_WORK_GROUP_COUNT_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #maxComputeWorkGroupInvocations()
    public VkPhysicalDeviceLimits maxComputeWorkGroupInvocations(int maxComputeWorkGroupInvocations) {
    	MAX_COMPUTE_WORK_GROUP_INVOCATIONS_HANDLE.set(segment, 0L, maxComputeWorkGroupInvocations);
    	return this;
    }
    
    public int maxComputeWorkGroupInvocations() {
    	return (int) MAX_COMPUTE_WORK_GROUP_INVOCATIONS_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxComputeWorkGroupSize(int)
    public VkPhysicalDeviceLimits maxComputeWorkGroupSize(int maxComputeWorkGroupSize, int index0) {
    	MAX_COMPUTE_WORK_GROUP_SIZE_HANDLE.set(segment, 0L, index0, maxComputeWorkGroupSize);
    	return this;
    }
    
    public int maxComputeWorkGroupSize(int index0) {
    	return (int) MAX_COMPUTE_WORK_GROUP_SIZE_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #subPixelPrecisionBits()
    public VkPhysicalDeviceLimits subPixelPrecisionBits(int subPixelPrecisionBits) {
    	SUB_PIXEL_PRECISION_BITS_HANDLE.set(segment, 0L, subPixelPrecisionBits);
    	return this;
    }
    
    public int subPixelPrecisionBits() {
    	return (int) SUB_PIXEL_PRECISION_BITS_HANDLE.get(segment, 0L);
    }
    
    /// @see #subTexelPrecisionBits()
    public VkPhysicalDeviceLimits subTexelPrecisionBits(int subTexelPrecisionBits) {
    	SUB_TEXEL_PRECISION_BITS_HANDLE.set(segment, 0L, subTexelPrecisionBits);
    	return this;
    }
    
    public int subTexelPrecisionBits() {
    	return (int) SUB_TEXEL_PRECISION_BITS_HANDLE.get(segment, 0L);
    }
    
    /// @see #mipmapPrecisionBits()
    public VkPhysicalDeviceLimits mipmapPrecisionBits(int mipmapPrecisionBits) {
    	MIPMAP_PRECISION_BITS_HANDLE.set(segment, 0L, mipmapPrecisionBits);
    	return this;
    }
    
    public int mipmapPrecisionBits() {
    	return (int) MIPMAP_PRECISION_BITS_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxDrawIndexedIndexValue()
    public VkPhysicalDeviceLimits maxDrawIndexedIndexValue(int maxDrawIndexedIndexValue) {
    	MAX_DRAW_INDEXED_INDEX_VALUE_HANDLE.set(segment, 0L, maxDrawIndexedIndexValue);
    	return this;
    }
    
    public int maxDrawIndexedIndexValue() {
    	return (int) MAX_DRAW_INDEXED_INDEX_VALUE_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxDrawIndirectCount()
    public VkPhysicalDeviceLimits maxDrawIndirectCount(int maxDrawIndirectCount) {
    	MAX_DRAW_INDIRECT_COUNT_HANDLE.set(segment, 0L, maxDrawIndirectCount);
    	return this;
    }
    
    public int maxDrawIndirectCount() {
    	return (int) MAX_DRAW_INDIRECT_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxSamplerLodBias()
    public VkPhysicalDeviceLimits maxSamplerLodBias(float maxSamplerLodBias) {
    	MAX_SAMPLER_LOD_BIAS_HANDLE.set(segment, 0L, maxSamplerLodBias);
    	return this;
    }
    
    public float maxSamplerLodBias() {
    	return (float) MAX_SAMPLER_LOD_BIAS_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxSamplerAnisotropy()
    public VkPhysicalDeviceLimits maxSamplerAnisotropy(float maxSamplerAnisotropy) {
    	MAX_SAMPLER_ANISOTROPY_HANDLE.set(segment, 0L, maxSamplerAnisotropy);
    	return this;
    }
    
    public float maxSamplerAnisotropy() {
    	return (float) MAX_SAMPLER_ANISOTROPY_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxViewports()
    public VkPhysicalDeviceLimits maxViewports(int maxViewports) {
    	MAX_VIEWPORTS_HANDLE.set(segment, 0L, maxViewports);
    	return this;
    }
    
    public int maxViewports() {
    	return (int) MAX_VIEWPORTS_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxViewportDimensions(int)
    public VkPhysicalDeviceLimits maxViewportDimensions(int maxViewportDimensions, int index0) {
    	MAX_VIEWPORT_DIMENSIONS_HANDLE.set(segment, 0L, index0, maxViewportDimensions);
    	return this;
    }
    
    public int maxViewportDimensions(int index0) {
    	return (int) MAX_VIEWPORT_DIMENSIONS_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #viewportBoundsRange(int)
    public VkPhysicalDeviceLimits viewportBoundsRange(float viewportBoundsRange, int index0) {
    	VIEWPORT_BOUNDS_RANGE_HANDLE.set(segment, 0L, index0, viewportBoundsRange);
    	return this;
    }
    
    public float viewportBoundsRange(int index0) {
    	return (float) VIEWPORT_BOUNDS_RANGE_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #viewportSubPixelBits()
    public VkPhysicalDeviceLimits viewportSubPixelBits(int viewportSubPixelBits) {
    	VIEWPORT_SUB_PIXEL_BITS_HANDLE.set(segment, 0L, viewportSubPixelBits);
    	return this;
    }
    
    public int viewportSubPixelBits() {
    	return (int) VIEWPORT_SUB_PIXEL_BITS_HANDLE.get(segment, 0L);
    }
    
    /// @see #minMemoryMapAlignment()
    public VkPhysicalDeviceLimits minMemoryMapAlignment(long minMemoryMapAlignment) {
    	MIN_MEMORY_MAP_ALIGNMENT_HANDLE.set(segment, 0L, minMemoryMapAlignment);
    	return this;
    }
    
    public long minMemoryMapAlignment() {
    	return (long) MIN_MEMORY_MAP_ALIGNMENT_HANDLE.get(segment, 0L);
    }
    
    /// @see #minTexelBufferOffsetAlignment()
    public VkPhysicalDeviceLimits minTexelBufferOffsetAlignment(long minTexelBufferOffsetAlignment) {
    	MIN_TEXEL_BUFFER_OFFSET_ALIGNMENT_HANDLE.set(segment, 0L, minTexelBufferOffsetAlignment);
    	return this;
    }
    
    public long minTexelBufferOffsetAlignment() {
    	return (long) MIN_TEXEL_BUFFER_OFFSET_ALIGNMENT_HANDLE.get(segment, 0L);
    }
    
    /// @see #minUniformBufferOffsetAlignment()
    public VkPhysicalDeviceLimits minUniformBufferOffsetAlignment(long minUniformBufferOffsetAlignment) {
    	MIN_UNIFORM_BUFFER_OFFSET_ALIGNMENT_HANDLE.set(segment, 0L, minUniformBufferOffsetAlignment);
    	return this;
    }
    
    public long minUniformBufferOffsetAlignment() {
    	return (long) MIN_UNIFORM_BUFFER_OFFSET_ALIGNMENT_HANDLE.get(segment, 0L);
    }
    
    /// @see #minStorageBufferOffsetAlignment()
    public VkPhysicalDeviceLimits minStorageBufferOffsetAlignment(long minStorageBufferOffsetAlignment) {
    	MIN_STORAGE_BUFFER_OFFSET_ALIGNMENT_HANDLE.set(segment, 0L, minStorageBufferOffsetAlignment);
    	return this;
    }
    
    public long minStorageBufferOffsetAlignment() {
    	return (long) MIN_STORAGE_BUFFER_OFFSET_ALIGNMENT_HANDLE.get(segment, 0L);
    }
    
    /// @see #minTexelOffset()
    public VkPhysicalDeviceLimits minTexelOffset(int minTexelOffset) {
    	MIN_TEXEL_OFFSET_HANDLE.set(segment, 0L, minTexelOffset);
    	return this;
    }
    
    public int minTexelOffset() {
    	return (int) MIN_TEXEL_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxTexelOffset()
    public VkPhysicalDeviceLimits maxTexelOffset(int maxTexelOffset) {
    	MAX_TEXEL_OFFSET_HANDLE.set(segment, 0L, maxTexelOffset);
    	return this;
    }
    
    public int maxTexelOffset() {
    	return (int) MAX_TEXEL_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #minTexelGatherOffset()
    public VkPhysicalDeviceLimits minTexelGatherOffset(int minTexelGatherOffset) {
    	MIN_TEXEL_GATHER_OFFSET_HANDLE.set(segment, 0L, minTexelGatherOffset);
    	return this;
    }
    
    public int minTexelGatherOffset() {
    	return (int) MIN_TEXEL_GATHER_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxTexelGatherOffset()
    public VkPhysicalDeviceLimits maxTexelGatherOffset(int maxTexelGatherOffset) {
    	MAX_TEXEL_GATHER_OFFSET_HANDLE.set(segment, 0L, maxTexelGatherOffset);
    	return this;
    }
    
    public int maxTexelGatherOffset() {
    	return (int) MAX_TEXEL_GATHER_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #minInterpolationOffset()
    public VkPhysicalDeviceLimits minInterpolationOffset(float minInterpolationOffset) {
    	MIN_INTERPOLATION_OFFSET_HANDLE.set(segment, 0L, minInterpolationOffset);
    	return this;
    }
    
    public float minInterpolationOffset() {
    	return (float) MIN_INTERPOLATION_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxInterpolationOffset()
    public VkPhysicalDeviceLimits maxInterpolationOffset(float maxInterpolationOffset) {
    	MAX_INTERPOLATION_OFFSET_HANDLE.set(segment, 0L, maxInterpolationOffset);
    	return this;
    }
    
    public float maxInterpolationOffset() {
    	return (float) MAX_INTERPOLATION_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #subPixelInterpolationOffsetBits()
    public VkPhysicalDeviceLimits subPixelInterpolationOffsetBits(int subPixelInterpolationOffsetBits) {
    	SUB_PIXEL_INTERPOLATION_OFFSET_BITS_HANDLE.set(segment, 0L, subPixelInterpolationOffsetBits);
    	return this;
    }
    
    public int subPixelInterpolationOffsetBits() {
    	return (int) SUB_PIXEL_INTERPOLATION_OFFSET_BITS_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxFramebufferWidth()
    public VkPhysicalDeviceLimits maxFramebufferWidth(int maxFramebufferWidth) {
    	MAX_FRAMEBUFFER_WIDTH_HANDLE.set(segment, 0L, maxFramebufferWidth);
    	return this;
    }
    
    public int maxFramebufferWidth() {
    	return (int) MAX_FRAMEBUFFER_WIDTH_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxFramebufferHeight()
    public VkPhysicalDeviceLimits maxFramebufferHeight(int maxFramebufferHeight) {
    	MAX_FRAMEBUFFER_HEIGHT_HANDLE.set(segment, 0L, maxFramebufferHeight);
    	return this;
    }
    
    public int maxFramebufferHeight() {
    	return (int) MAX_FRAMEBUFFER_HEIGHT_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxFramebufferLayers()
    public VkPhysicalDeviceLimits maxFramebufferLayers(int maxFramebufferLayers) {
    	MAX_FRAMEBUFFER_LAYERS_HANDLE.set(segment, 0L, maxFramebufferLayers);
    	return this;
    }
    
    public int maxFramebufferLayers() {
    	return (int) MAX_FRAMEBUFFER_LAYERS_HANDLE.get(segment, 0L);
    }
    
    /// @see #framebufferColorSampleCounts()
    public VkPhysicalDeviceLimits framebufferColorSampleCounts(int framebufferColorSampleCounts) {
    	FRAMEBUFFER_COLOR_SAMPLE_COUNTS_HANDLE.set(segment, 0L, framebufferColorSampleCounts);
    	return this;
    }
    
    public int framebufferColorSampleCounts() {
    	return (int) FRAMEBUFFER_COLOR_SAMPLE_COUNTS_HANDLE.get(segment, 0L);
    }
    
    /// @see #framebufferDepthSampleCounts()
    public VkPhysicalDeviceLimits framebufferDepthSampleCounts(int framebufferDepthSampleCounts) {
    	FRAMEBUFFER_DEPTH_SAMPLE_COUNTS_HANDLE.set(segment, 0L, framebufferDepthSampleCounts);
    	return this;
    }
    
    public int framebufferDepthSampleCounts() {
    	return (int) FRAMEBUFFER_DEPTH_SAMPLE_COUNTS_HANDLE.get(segment, 0L);
    }
    
    /// @see #framebufferStencilSampleCounts()
    public VkPhysicalDeviceLimits framebufferStencilSampleCounts(int framebufferStencilSampleCounts) {
    	FRAMEBUFFER_STENCIL_SAMPLE_COUNTS_HANDLE.set(segment, 0L, framebufferStencilSampleCounts);
    	return this;
    }
    
    public int framebufferStencilSampleCounts() {
    	return (int) FRAMEBUFFER_STENCIL_SAMPLE_COUNTS_HANDLE.get(segment, 0L);
    }
    
    /// @see #framebufferNoAttachmentsSampleCounts()
    public VkPhysicalDeviceLimits framebufferNoAttachmentsSampleCounts(int framebufferNoAttachmentsSampleCounts) {
    	FRAMEBUFFER_NO_ATTACHMENTS_SAMPLE_COUNTS_HANDLE.set(segment, 0L, framebufferNoAttachmentsSampleCounts);
    	return this;
    }
    
    public int framebufferNoAttachmentsSampleCounts() {
    	return (int) FRAMEBUFFER_NO_ATTACHMENTS_SAMPLE_COUNTS_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxColorAttachments()
    public VkPhysicalDeviceLimits maxColorAttachments(int maxColorAttachments) {
    	MAX_COLOR_ATTACHMENTS_HANDLE.set(segment, 0L, maxColorAttachments);
    	return this;
    }
    
    public int maxColorAttachments() {
    	return (int) MAX_COLOR_ATTACHMENTS_HANDLE.get(segment, 0L);
    }
    
    /// @see #sampledImageColorSampleCounts()
    public VkPhysicalDeviceLimits sampledImageColorSampleCounts(int sampledImageColorSampleCounts) {
    	SAMPLED_IMAGE_COLOR_SAMPLE_COUNTS_HANDLE.set(segment, 0L, sampledImageColorSampleCounts);
    	return this;
    }
    
    public int sampledImageColorSampleCounts() {
    	return (int) SAMPLED_IMAGE_COLOR_SAMPLE_COUNTS_HANDLE.get(segment, 0L);
    }
    
    /// @see #sampledImageIntegerSampleCounts()
    public VkPhysicalDeviceLimits sampledImageIntegerSampleCounts(int sampledImageIntegerSampleCounts) {
    	SAMPLED_IMAGE_INTEGER_SAMPLE_COUNTS_HANDLE.set(segment, 0L, sampledImageIntegerSampleCounts);
    	return this;
    }
    
    public int sampledImageIntegerSampleCounts() {
    	return (int) SAMPLED_IMAGE_INTEGER_SAMPLE_COUNTS_HANDLE.get(segment, 0L);
    }
    
    /// @see #sampledImageDepthSampleCounts()
    public VkPhysicalDeviceLimits sampledImageDepthSampleCounts(int sampledImageDepthSampleCounts) {
    	SAMPLED_IMAGE_DEPTH_SAMPLE_COUNTS_HANDLE.set(segment, 0L, sampledImageDepthSampleCounts);
    	return this;
    }
    
    public int sampledImageDepthSampleCounts() {
    	return (int) SAMPLED_IMAGE_DEPTH_SAMPLE_COUNTS_HANDLE.get(segment, 0L);
    }
    
    /// @see #sampledImageStencilSampleCounts()
    public VkPhysicalDeviceLimits sampledImageStencilSampleCounts(int sampledImageStencilSampleCounts) {
    	SAMPLED_IMAGE_STENCIL_SAMPLE_COUNTS_HANDLE.set(segment, 0L, sampledImageStencilSampleCounts);
    	return this;
    }
    
    public int sampledImageStencilSampleCounts() {
    	return (int) SAMPLED_IMAGE_STENCIL_SAMPLE_COUNTS_HANDLE.get(segment, 0L);
    }
    
    /// @see #storageImageSampleCounts()
    public VkPhysicalDeviceLimits storageImageSampleCounts(int storageImageSampleCounts) {
    	STORAGE_IMAGE_SAMPLE_COUNTS_HANDLE.set(segment, 0L, storageImageSampleCounts);
    	return this;
    }
    
    public int storageImageSampleCounts() {
    	return (int) STORAGE_IMAGE_SAMPLE_COUNTS_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxSampleMaskWords()
    public VkPhysicalDeviceLimits maxSampleMaskWords(int maxSampleMaskWords) {
    	MAX_SAMPLE_MASK_WORDS_HANDLE.set(segment, 0L, maxSampleMaskWords);
    	return this;
    }
    
    public int maxSampleMaskWords() {
    	return (int) MAX_SAMPLE_MASK_WORDS_HANDLE.get(segment, 0L);
    }
    
    /// @see #timestampComputeAndGraphics()
    public VkPhysicalDeviceLimits timestampComputeAndGraphics(int timestampComputeAndGraphics) {
    	TIMESTAMP_COMPUTE_AND_GRAPHICS_HANDLE.set(segment, 0L, timestampComputeAndGraphics);
    	return this;
    }
    
    public int timestampComputeAndGraphics() {
    	return (int) TIMESTAMP_COMPUTE_AND_GRAPHICS_HANDLE.get(segment, 0L);
    }
    
    /// @see #timestampPeriod()
    public VkPhysicalDeviceLimits timestampPeriod(float timestampPeriod) {
    	TIMESTAMP_PERIOD_HANDLE.set(segment, 0L, timestampPeriod);
    	return this;
    }
    
    public float timestampPeriod() {
    	return (float) TIMESTAMP_PERIOD_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxClipDistances()
    public VkPhysicalDeviceLimits maxClipDistances(int maxClipDistances) {
    	MAX_CLIP_DISTANCES_HANDLE.set(segment, 0L, maxClipDistances);
    	return this;
    }
    
    public int maxClipDistances() {
    	return (int) MAX_CLIP_DISTANCES_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxCullDistances()
    public VkPhysicalDeviceLimits maxCullDistances(int maxCullDistances) {
    	MAX_CULL_DISTANCES_HANDLE.set(segment, 0L, maxCullDistances);
    	return this;
    }
    
    public int maxCullDistances() {
    	return (int) MAX_CULL_DISTANCES_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxCombinedClipAndCullDistances()
    public VkPhysicalDeviceLimits maxCombinedClipAndCullDistances(int maxCombinedClipAndCullDistances) {
    	MAX_COMBINED_CLIP_AND_CULL_DISTANCES_HANDLE.set(segment, 0L, maxCombinedClipAndCullDistances);
    	return this;
    }
    
    public int maxCombinedClipAndCullDistances() {
    	return (int) MAX_COMBINED_CLIP_AND_CULL_DISTANCES_HANDLE.get(segment, 0L);
    }
    
    /// @see #discreteQueuePriorities()
    public VkPhysicalDeviceLimits discreteQueuePriorities(int discreteQueuePriorities) {
    	DISCRETE_QUEUE_PRIORITIES_HANDLE.set(segment, 0L, discreteQueuePriorities);
    	return this;
    }
    
    public int discreteQueuePriorities() {
    	return (int) DISCRETE_QUEUE_PRIORITIES_HANDLE.get(segment, 0L);
    }
    
    /// @see #pointSizeRange(int)
    public VkPhysicalDeviceLimits pointSizeRange(float pointSizeRange, int index0) {
    	POINT_SIZE_RANGE_HANDLE.set(segment, 0L, index0, pointSizeRange);
    	return this;
    }
    
    public float pointSizeRange(int index0) {
    	return (float) POINT_SIZE_RANGE_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #lineWidthRange(int)
    public VkPhysicalDeviceLimits lineWidthRange(float lineWidthRange, int index0) {
    	LINE_WIDTH_RANGE_HANDLE.set(segment, 0L, index0, lineWidthRange);
    	return this;
    }
    
    public float lineWidthRange(int index0) {
    	return (float) LINE_WIDTH_RANGE_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #pointSizeGranularity()
    public VkPhysicalDeviceLimits pointSizeGranularity(float pointSizeGranularity) {
    	POINT_SIZE_GRANULARITY_HANDLE.set(segment, 0L, pointSizeGranularity);
    	return this;
    }
    
    public float pointSizeGranularity() {
    	return (float) POINT_SIZE_GRANULARITY_HANDLE.get(segment, 0L);
    }
    
    /// @see #lineWidthGranularity()
    public VkPhysicalDeviceLimits lineWidthGranularity(float lineWidthGranularity) {
    	LINE_WIDTH_GRANULARITY_HANDLE.set(segment, 0L, lineWidthGranularity);
    	return this;
    }
    
    public float lineWidthGranularity() {
    	return (float) LINE_WIDTH_GRANULARITY_HANDLE.get(segment, 0L);
    }
    
    /// @see #strictLines()
    public VkPhysicalDeviceLimits strictLines(int strictLines) {
    	STRICT_LINES_HANDLE.set(segment, 0L, strictLines);
    	return this;
    }
    
    public int strictLines() {
    	return (int) STRICT_LINES_HANDLE.get(segment, 0L);
    }
    
    /// @see #standardSampleLocations()
    public VkPhysicalDeviceLimits standardSampleLocations(int standardSampleLocations) {
    	STANDARD_SAMPLE_LOCATIONS_HANDLE.set(segment, 0L, standardSampleLocations);
    	return this;
    }
    
    public int standardSampleLocations() {
    	return (int) STANDARD_SAMPLE_LOCATIONS_HANDLE.get(segment, 0L);
    }
    
    /// @see #optimalBufferCopyOffsetAlignment()
    public VkPhysicalDeviceLimits optimalBufferCopyOffsetAlignment(long optimalBufferCopyOffsetAlignment) {
    	OPTIMAL_BUFFER_COPY_OFFSET_ALIGNMENT_HANDLE.set(segment, 0L, optimalBufferCopyOffsetAlignment);
    	return this;
    }
    
    public long optimalBufferCopyOffsetAlignment() {
    	return (long) OPTIMAL_BUFFER_COPY_OFFSET_ALIGNMENT_HANDLE.get(segment, 0L);
    }
    
    /// @see #optimalBufferCopyRowPitchAlignment()
    public VkPhysicalDeviceLimits optimalBufferCopyRowPitchAlignment(long optimalBufferCopyRowPitchAlignment) {
    	OPTIMAL_BUFFER_COPY_ROW_PITCH_ALIGNMENT_HANDLE.set(segment, 0L, optimalBufferCopyRowPitchAlignment);
    	return this;
    }
    
    public long optimalBufferCopyRowPitchAlignment() {
    	return (long) OPTIMAL_BUFFER_COPY_ROW_PITCH_ALIGNMENT_HANDLE.get(segment, 0L);
    }
    
    /// @see #nonCoherentAtomSize()
    public VkPhysicalDeviceLimits nonCoherentAtomSize(long nonCoherentAtomSize) {
    	NON_COHERENT_ATOM_SIZE_HANDLE.set(segment, 0L, nonCoherentAtomSize);
    	return this;
    }
    
    public long nonCoherentAtomSize() {
    	return (long) NON_COHERENT_ATOM_SIZE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceLimits set(VkPhysicalDeviceLimits other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceLimits set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceLimits> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceLimits> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceLimits(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceLimits> array(SegmentAllocator allocator, VkPhysicalDeviceLimits... structs) {
        NativeStructArray<VkPhysicalDeviceLimits> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceLimits(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceLimits> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceLimits(segment)
        );
    }

}