/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkPhysicalDeviceVulkan12Properties
		implements Struct<VkPhysicalDeviceVulkan12Properties> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle DRIVER_ID_HANDLE;
	public static final VarHandle DRIVER_NAME_HANDLE;
	public static final VarHandle DRIVER_INFO_HANDLE;
	public static final VarHandle DENORM_BEHAVIOR_INDEPENDENCE_HANDLE;
	public static final VarHandle ROUNDING_MODE_INDEPENDENCE_HANDLE;
	public static final VarHandle SHADER_SIGNED_ZERO_INF_NAN_PRESERVE_FLOAT16_HANDLE;
	public static final VarHandle SHADER_SIGNED_ZERO_INF_NAN_PRESERVE_FLOAT32_HANDLE;
	public static final VarHandle SHADER_SIGNED_ZERO_INF_NAN_PRESERVE_FLOAT64_HANDLE;
	public static final VarHandle SHADER_DENORM_PRESERVE_FLOAT16_HANDLE;
	public static final VarHandle SHADER_DENORM_PRESERVE_FLOAT32_HANDLE;
	public static final VarHandle SHADER_DENORM_PRESERVE_FLOAT64_HANDLE;
	public static final VarHandle SHADER_DENORM_FLUSH_TO_ZERO_FLOAT16_HANDLE;
	public static final VarHandle SHADER_DENORM_FLUSH_TO_ZERO_FLOAT32_HANDLE;
	public static final VarHandle SHADER_DENORM_FLUSH_TO_ZERO_FLOAT64_HANDLE;
	public static final VarHandle SHADER_ROUNDING_MODE_RTEFLOAT16_HANDLE;
	public static final VarHandle SHADER_ROUNDING_MODE_RTEFLOAT32_HANDLE;
	public static final VarHandle SHADER_ROUNDING_MODE_RTEFLOAT64_HANDLE;
	public static final VarHandle SHADER_ROUNDING_MODE_RTZFLOAT16_HANDLE;
	public static final VarHandle SHADER_ROUNDING_MODE_RTZFLOAT32_HANDLE;
	public static final VarHandle SHADER_ROUNDING_MODE_RTZFLOAT64_HANDLE;
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
	public static final VarHandle SUPPORTED_DEPTH_RESOLVE_MODES_HANDLE;
	public static final VarHandle SUPPORTED_STENCIL_RESOLVE_MODES_HANDLE;
	public static final VarHandle INDEPENDENT_RESOLVE_NONE_HANDLE;
	public static final VarHandle INDEPENDENT_RESOLVE_HANDLE;
	public static final VarHandle FILTER_MINMAX_SINGLE_COMPONENT_FORMATS_HANDLE;
	public static final VarHandle FILTER_MINMAX_IMAGE_COMPONENT_MAPPING_HANDLE;
	public static final VarHandle MAX_TIMELINE_SEMAPHORE_VALUE_DIFFERENCE_HANDLE;
	public static final VarHandle FRAMEBUFFER_INTEGER_COLOR_SAMPLE_COUNTS_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long DRIVER_ID_BYTE_OFFSET;
	public static final long DRIVER_NAME_BYTE_OFFSET;
	public static final long DRIVER_INFO_BYTE_OFFSET;
	public static final long CONFORMANCE_VERSION_BYTE_OFFSET;
	public static final long DENORM_BEHAVIOR_INDEPENDENCE_BYTE_OFFSET;
	public static final long ROUNDING_MODE_INDEPENDENCE_BYTE_OFFSET;
	public static final long SHADER_SIGNED_ZERO_INF_NAN_PRESERVE_FLOAT16_BYTE_OFFSET;
	public static final long SHADER_SIGNED_ZERO_INF_NAN_PRESERVE_FLOAT32_BYTE_OFFSET;
	public static final long SHADER_SIGNED_ZERO_INF_NAN_PRESERVE_FLOAT64_BYTE_OFFSET;
	public static final long SHADER_DENORM_PRESERVE_FLOAT16_BYTE_OFFSET;
	public static final long SHADER_DENORM_PRESERVE_FLOAT32_BYTE_OFFSET;
	public static final long SHADER_DENORM_PRESERVE_FLOAT64_BYTE_OFFSET;
	public static final long SHADER_DENORM_FLUSH_TO_ZERO_FLOAT16_BYTE_OFFSET;
	public static final long SHADER_DENORM_FLUSH_TO_ZERO_FLOAT32_BYTE_OFFSET;
	public static final long SHADER_DENORM_FLUSH_TO_ZERO_FLOAT64_BYTE_OFFSET;
	public static final long SHADER_ROUNDING_MODE_RTEFLOAT16_BYTE_OFFSET;
	public static final long SHADER_ROUNDING_MODE_RTEFLOAT32_BYTE_OFFSET;
	public static final long SHADER_ROUNDING_MODE_RTEFLOAT64_BYTE_OFFSET;
	public static final long SHADER_ROUNDING_MODE_RTZFLOAT16_BYTE_OFFSET;
	public static final long SHADER_ROUNDING_MODE_RTZFLOAT32_BYTE_OFFSET;
	public static final long SHADER_ROUNDING_MODE_RTZFLOAT64_BYTE_OFFSET;
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
	public static final long SUPPORTED_DEPTH_RESOLVE_MODES_BYTE_OFFSET;
	public static final long SUPPORTED_STENCIL_RESOLVE_MODES_BYTE_OFFSET;
	public static final long INDEPENDENT_RESOLVE_NONE_BYTE_OFFSET;
	public static final long INDEPENDENT_RESOLVE_BYTE_OFFSET;
	public static final long FILTER_MINMAX_SINGLE_COMPONENT_FORMATS_BYTE_OFFSET;
	public static final long FILTER_MINMAX_IMAGE_COMPONENT_MAPPING_BYTE_OFFSET;
	public static final long MAX_TIMELINE_SEMAPHORE_VALUE_DIFFERENCE_BYTE_OFFSET;
	public static final long FRAMEBUFFER_INTEGER_COLOR_SAMPLE_COUNTS_BYTE_OFFSET;

	private final MemorySegment segment;

	private final VkConformanceVersion conformanceVersion;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("driverID"),
		    MemoryLayout.sequenceLayout(256, JAVA_BYTE).withName("driverName"),
		    MemoryLayout.sequenceLayout(256, JAVA_BYTE).withName("driverInfo"),
		    VkConformanceVersion.LAYOUT.withName("conformanceVersion"),
		    JAVA_INT.withName("denormBehaviorIndependence"),
		    JAVA_INT.withName("roundingModeIndependence"),
		    JAVA_INT.withName("shaderSignedZeroInfNanPreserveFloat16"),
		    JAVA_INT.withName("shaderSignedZeroInfNanPreserveFloat32"),
		    JAVA_INT.withName("shaderSignedZeroInfNanPreserveFloat64"),
		    JAVA_INT.withName("shaderDenormPreserveFloat16"),
		    JAVA_INT.withName("shaderDenormPreserveFloat32"),
		    JAVA_INT.withName("shaderDenormPreserveFloat64"),
		    JAVA_INT.withName("shaderDenormFlushToZeroFloat16"),
		    JAVA_INT.withName("shaderDenormFlushToZeroFloat32"),
		    JAVA_INT.withName("shaderDenormFlushToZeroFloat64"),
		    JAVA_INT.withName("shaderRoundingModeRTEFloat16"),
		    JAVA_INT.withName("shaderRoundingModeRTEFloat32"),
		    JAVA_INT.withName("shaderRoundingModeRTEFloat64"),
		    JAVA_INT.withName("shaderRoundingModeRTZFloat16"),
		    JAVA_INT.withName("shaderRoundingModeRTZFloat32"),
		    JAVA_INT.withName("shaderRoundingModeRTZFloat64"),
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
		    JAVA_INT.withName("supportedDepthResolveModes"),
		    JAVA_INT.withName("supportedStencilResolveModes"),
		    JAVA_INT.withName("independentResolveNone"),
		    JAVA_INT.withName("independentResolve"),
		    JAVA_INT.withName("filterMinmaxSingleComponentFormats"),
		    JAVA_INT.withName("filterMinmaxImageComponentMapping"),
		    JAVA_LONG.withName("maxTimelineSemaphoreValueDifference"),
		    JAVA_INT.withName("framebufferIntegerColorSampleCounts"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPhysicalDeviceVulkan12Properties").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		DRIVER_ID_HANDLE = LAYOUT.varHandle(PathElement.groupElement("driverID"));
		DRIVER_NAME_HANDLE = LAYOUT.varHandle(PathElement.groupElement("driverName"), PathElement.sequenceElement());
		DRIVER_INFO_HANDLE = LAYOUT.varHandle(PathElement.groupElement("driverInfo"), PathElement.sequenceElement());
		DENORM_BEHAVIOR_INDEPENDENCE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("denormBehaviorIndependence"));
		ROUNDING_MODE_INDEPENDENCE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("roundingModeIndependence"));
		SHADER_SIGNED_ZERO_INF_NAN_PRESERVE_FLOAT16_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderSignedZeroInfNanPreserveFloat16"));
		SHADER_SIGNED_ZERO_INF_NAN_PRESERVE_FLOAT32_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderSignedZeroInfNanPreserveFloat32"));
		SHADER_SIGNED_ZERO_INF_NAN_PRESERVE_FLOAT64_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderSignedZeroInfNanPreserveFloat64"));
		SHADER_DENORM_PRESERVE_FLOAT16_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderDenormPreserveFloat16"));
		SHADER_DENORM_PRESERVE_FLOAT32_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderDenormPreserveFloat32"));
		SHADER_DENORM_PRESERVE_FLOAT64_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderDenormPreserveFloat64"));
		SHADER_DENORM_FLUSH_TO_ZERO_FLOAT16_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderDenormFlushToZeroFloat16"));
		SHADER_DENORM_FLUSH_TO_ZERO_FLOAT32_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderDenormFlushToZeroFloat32"));
		SHADER_DENORM_FLUSH_TO_ZERO_FLOAT64_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderDenormFlushToZeroFloat64"));
		SHADER_ROUNDING_MODE_RTEFLOAT16_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderRoundingModeRTEFloat16"));
		SHADER_ROUNDING_MODE_RTEFLOAT32_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderRoundingModeRTEFloat32"));
		SHADER_ROUNDING_MODE_RTEFLOAT64_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderRoundingModeRTEFloat64"));
		SHADER_ROUNDING_MODE_RTZFLOAT16_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderRoundingModeRTZFloat16"));
		SHADER_ROUNDING_MODE_RTZFLOAT32_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderRoundingModeRTZFloat32"));
		SHADER_ROUNDING_MODE_RTZFLOAT64_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderRoundingModeRTZFloat64"));
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
		SUPPORTED_DEPTH_RESOLVE_MODES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("supportedDepthResolveModes"));
		SUPPORTED_STENCIL_RESOLVE_MODES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("supportedStencilResolveModes"));
		INDEPENDENT_RESOLVE_NONE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("independentResolveNone"));
		INDEPENDENT_RESOLVE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("independentResolve"));
		FILTER_MINMAX_SINGLE_COMPONENT_FORMATS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("filterMinmaxSingleComponentFormats"));
		FILTER_MINMAX_IMAGE_COMPONENT_MAPPING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("filterMinmaxImageComponentMapping"));
		MAX_TIMELINE_SEMAPHORE_VALUE_DIFFERENCE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxTimelineSemaphoreValueDifference"));
		FRAMEBUFFER_INTEGER_COLOR_SAMPLE_COUNTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("framebufferIntegerColorSampleCounts"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		DRIVER_ID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("driverID"));
		DRIVER_NAME_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("driverName"));
		DRIVER_INFO_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("driverInfo"));
		CONFORMANCE_VERSION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("conformanceVersion"));
		DENORM_BEHAVIOR_INDEPENDENCE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("denormBehaviorIndependence"));
		ROUNDING_MODE_INDEPENDENCE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("roundingModeIndependence"));
		SHADER_SIGNED_ZERO_INF_NAN_PRESERVE_FLOAT16_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderSignedZeroInfNanPreserveFloat16"));
		SHADER_SIGNED_ZERO_INF_NAN_PRESERVE_FLOAT32_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderSignedZeroInfNanPreserveFloat32"));
		SHADER_SIGNED_ZERO_INF_NAN_PRESERVE_FLOAT64_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderSignedZeroInfNanPreserveFloat64"));
		SHADER_DENORM_PRESERVE_FLOAT16_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderDenormPreserveFloat16"));
		SHADER_DENORM_PRESERVE_FLOAT32_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderDenormPreserveFloat32"));
		SHADER_DENORM_PRESERVE_FLOAT64_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderDenormPreserveFloat64"));
		SHADER_DENORM_FLUSH_TO_ZERO_FLOAT16_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderDenormFlushToZeroFloat16"));
		SHADER_DENORM_FLUSH_TO_ZERO_FLOAT32_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderDenormFlushToZeroFloat32"));
		SHADER_DENORM_FLUSH_TO_ZERO_FLOAT64_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderDenormFlushToZeroFloat64"));
		SHADER_ROUNDING_MODE_RTEFLOAT16_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderRoundingModeRTEFloat16"));
		SHADER_ROUNDING_MODE_RTEFLOAT32_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderRoundingModeRTEFloat32"));
		SHADER_ROUNDING_MODE_RTEFLOAT64_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderRoundingModeRTEFloat64"));
		SHADER_ROUNDING_MODE_RTZFLOAT16_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderRoundingModeRTZFloat16"));
		SHADER_ROUNDING_MODE_RTZFLOAT32_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderRoundingModeRTZFloat32"));
		SHADER_ROUNDING_MODE_RTZFLOAT64_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderRoundingModeRTZFloat64"));
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
		SUPPORTED_DEPTH_RESOLVE_MODES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("supportedDepthResolveModes"));
		SUPPORTED_STENCIL_RESOLVE_MODES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("supportedStencilResolveModes"));
		INDEPENDENT_RESOLVE_NONE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("independentResolveNone"));
		INDEPENDENT_RESOLVE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("independentResolve"));
		FILTER_MINMAX_SINGLE_COMPONENT_FORMATS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("filterMinmaxSingleComponentFormats"));
		FILTER_MINMAX_IMAGE_COMPONENT_MAPPING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("filterMinmaxImageComponentMapping"));
		MAX_TIMELINE_SEMAPHORE_VALUE_DIFFERENCE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxTimelineSemaphoreValueDifference"));
		FRAMEBUFFER_INTEGER_COLOR_SAMPLE_COUNTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("framebufferIntegerColorSampleCounts"));
		//@formatter:on
	}

	public VkPhysicalDeviceVulkan12Properties() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceVulkan12Properties(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceVulkan12Properties(MemorySegment segment) {
	    this.segment = segment;
	
	    conformanceVersion = new VkConformanceVersion(segment.asSlice(CONFORMANCE_VERSION_BYTE_OFFSET, VkConformanceVersion.LAYOUT));
	}

    /// @see #sType()
    public VkPhysicalDeviceVulkan12Properties sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceVulkan12Properties pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #driverID()
    public VkPhysicalDeviceVulkan12Properties driverID(int driverID) {
    	DRIVER_ID_HANDLE.set(segment, 0L, driverID);
    	return this;
    }
    
    public int driverID() {
    	return (int) DRIVER_ID_HANDLE.get(segment, 0L);
    }
    
    /// @see #driverName(int)
    public VkPhysicalDeviceVulkan12Properties driverName(byte driverName, int index0) {
    	DRIVER_NAME_HANDLE.set(segment, 0L, index0, driverName);
    	return this;
    }
    
    public byte driverName(int index0) {
    	return (byte) DRIVER_NAME_HANDLE.get(segment, 0L, index0);
    }
    
    public String driverName() {
        return segment.getString(DRIVER_NAME_BYTE_OFFSET);
    }
    
    /// @see #driverInfo(int)
    public VkPhysicalDeviceVulkan12Properties driverInfo(byte driverInfo, int index0) {
    	DRIVER_INFO_HANDLE.set(segment, 0L, index0, driverInfo);
    	return this;
    }
    
    public byte driverInfo(int index0) {
    	return (byte) DRIVER_INFO_HANDLE.get(segment, 0L, index0);
    }
    
    public String driverInfo() {
        return segment.getString(DRIVER_INFO_BYTE_OFFSET);
    }
    
    /// @see #conformanceVersion()
    public VkPhysicalDeviceVulkan12Properties conformanceVersion(Consumer<VkConformanceVersion> consumer) {
    	consumer.accept(conformanceVersion);
    	return this;
    }
    
    /// @see #conformanceVersion()
    public VkPhysicalDeviceVulkan12Properties conformanceVersion(VkConformanceVersion other) {
    	conformanceVersion.set(other);
    	return this;
    }
    
    public VkConformanceVersion conformanceVersion() {
    	return conformanceVersion;
    }
    
    /// @see #denormBehaviorIndependence()
    public VkPhysicalDeviceVulkan12Properties denormBehaviorIndependence(int denormBehaviorIndependence) {
    	DENORM_BEHAVIOR_INDEPENDENCE_HANDLE.set(segment, 0L, denormBehaviorIndependence);
    	return this;
    }
    
    public int denormBehaviorIndependence() {
    	return (int) DENORM_BEHAVIOR_INDEPENDENCE_HANDLE.get(segment, 0L);
    }
    
    /// @see #roundingModeIndependence()
    public VkPhysicalDeviceVulkan12Properties roundingModeIndependence(int roundingModeIndependence) {
    	ROUNDING_MODE_INDEPENDENCE_HANDLE.set(segment, 0L, roundingModeIndependence);
    	return this;
    }
    
    public int roundingModeIndependence() {
    	return (int) ROUNDING_MODE_INDEPENDENCE_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderSignedZeroInfNanPreserveFloat16()
    public VkPhysicalDeviceVulkan12Properties shaderSignedZeroInfNanPreserveFloat16(int shaderSignedZeroInfNanPreserveFloat16) {
    	SHADER_SIGNED_ZERO_INF_NAN_PRESERVE_FLOAT16_HANDLE.set(segment, 0L, shaderSignedZeroInfNanPreserveFloat16);
    	return this;
    }
    
    public int shaderSignedZeroInfNanPreserveFloat16() {
    	return (int) SHADER_SIGNED_ZERO_INF_NAN_PRESERVE_FLOAT16_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderSignedZeroInfNanPreserveFloat32()
    public VkPhysicalDeviceVulkan12Properties shaderSignedZeroInfNanPreserveFloat32(int shaderSignedZeroInfNanPreserveFloat32) {
    	SHADER_SIGNED_ZERO_INF_NAN_PRESERVE_FLOAT32_HANDLE.set(segment, 0L, shaderSignedZeroInfNanPreserveFloat32);
    	return this;
    }
    
    public int shaderSignedZeroInfNanPreserveFloat32() {
    	return (int) SHADER_SIGNED_ZERO_INF_NAN_PRESERVE_FLOAT32_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderSignedZeroInfNanPreserveFloat64()
    public VkPhysicalDeviceVulkan12Properties shaderSignedZeroInfNanPreserveFloat64(int shaderSignedZeroInfNanPreserveFloat64) {
    	SHADER_SIGNED_ZERO_INF_NAN_PRESERVE_FLOAT64_HANDLE.set(segment, 0L, shaderSignedZeroInfNanPreserveFloat64);
    	return this;
    }
    
    public int shaderSignedZeroInfNanPreserveFloat64() {
    	return (int) SHADER_SIGNED_ZERO_INF_NAN_PRESERVE_FLOAT64_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderDenormPreserveFloat16()
    public VkPhysicalDeviceVulkan12Properties shaderDenormPreserveFloat16(int shaderDenormPreserveFloat16) {
    	SHADER_DENORM_PRESERVE_FLOAT16_HANDLE.set(segment, 0L, shaderDenormPreserveFloat16);
    	return this;
    }
    
    public int shaderDenormPreserveFloat16() {
    	return (int) SHADER_DENORM_PRESERVE_FLOAT16_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderDenormPreserveFloat32()
    public VkPhysicalDeviceVulkan12Properties shaderDenormPreserveFloat32(int shaderDenormPreserveFloat32) {
    	SHADER_DENORM_PRESERVE_FLOAT32_HANDLE.set(segment, 0L, shaderDenormPreserveFloat32);
    	return this;
    }
    
    public int shaderDenormPreserveFloat32() {
    	return (int) SHADER_DENORM_PRESERVE_FLOAT32_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderDenormPreserveFloat64()
    public VkPhysicalDeviceVulkan12Properties shaderDenormPreserveFloat64(int shaderDenormPreserveFloat64) {
    	SHADER_DENORM_PRESERVE_FLOAT64_HANDLE.set(segment, 0L, shaderDenormPreserveFloat64);
    	return this;
    }
    
    public int shaderDenormPreserveFloat64() {
    	return (int) SHADER_DENORM_PRESERVE_FLOAT64_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderDenormFlushToZeroFloat16()
    public VkPhysicalDeviceVulkan12Properties shaderDenormFlushToZeroFloat16(int shaderDenormFlushToZeroFloat16) {
    	SHADER_DENORM_FLUSH_TO_ZERO_FLOAT16_HANDLE.set(segment, 0L, shaderDenormFlushToZeroFloat16);
    	return this;
    }
    
    public int shaderDenormFlushToZeroFloat16() {
    	return (int) SHADER_DENORM_FLUSH_TO_ZERO_FLOAT16_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderDenormFlushToZeroFloat32()
    public VkPhysicalDeviceVulkan12Properties shaderDenormFlushToZeroFloat32(int shaderDenormFlushToZeroFloat32) {
    	SHADER_DENORM_FLUSH_TO_ZERO_FLOAT32_HANDLE.set(segment, 0L, shaderDenormFlushToZeroFloat32);
    	return this;
    }
    
    public int shaderDenormFlushToZeroFloat32() {
    	return (int) SHADER_DENORM_FLUSH_TO_ZERO_FLOAT32_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderDenormFlushToZeroFloat64()
    public VkPhysicalDeviceVulkan12Properties shaderDenormFlushToZeroFloat64(int shaderDenormFlushToZeroFloat64) {
    	SHADER_DENORM_FLUSH_TO_ZERO_FLOAT64_HANDLE.set(segment, 0L, shaderDenormFlushToZeroFloat64);
    	return this;
    }
    
    public int shaderDenormFlushToZeroFloat64() {
    	return (int) SHADER_DENORM_FLUSH_TO_ZERO_FLOAT64_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderRoundingModeRTEFloat16()
    public VkPhysicalDeviceVulkan12Properties shaderRoundingModeRTEFloat16(int shaderRoundingModeRTEFloat16) {
    	SHADER_ROUNDING_MODE_RTEFLOAT16_HANDLE.set(segment, 0L, shaderRoundingModeRTEFloat16);
    	return this;
    }
    
    public int shaderRoundingModeRTEFloat16() {
    	return (int) SHADER_ROUNDING_MODE_RTEFLOAT16_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderRoundingModeRTEFloat32()
    public VkPhysicalDeviceVulkan12Properties shaderRoundingModeRTEFloat32(int shaderRoundingModeRTEFloat32) {
    	SHADER_ROUNDING_MODE_RTEFLOAT32_HANDLE.set(segment, 0L, shaderRoundingModeRTEFloat32);
    	return this;
    }
    
    public int shaderRoundingModeRTEFloat32() {
    	return (int) SHADER_ROUNDING_MODE_RTEFLOAT32_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderRoundingModeRTEFloat64()
    public VkPhysicalDeviceVulkan12Properties shaderRoundingModeRTEFloat64(int shaderRoundingModeRTEFloat64) {
    	SHADER_ROUNDING_MODE_RTEFLOAT64_HANDLE.set(segment, 0L, shaderRoundingModeRTEFloat64);
    	return this;
    }
    
    public int shaderRoundingModeRTEFloat64() {
    	return (int) SHADER_ROUNDING_MODE_RTEFLOAT64_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderRoundingModeRTZFloat16()
    public VkPhysicalDeviceVulkan12Properties shaderRoundingModeRTZFloat16(int shaderRoundingModeRTZFloat16) {
    	SHADER_ROUNDING_MODE_RTZFLOAT16_HANDLE.set(segment, 0L, shaderRoundingModeRTZFloat16);
    	return this;
    }
    
    public int shaderRoundingModeRTZFloat16() {
    	return (int) SHADER_ROUNDING_MODE_RTZFLOAT16_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderRoundingModeRTZFloat32()
    public VkPhysicalDeviceVulkan12Properties shaderRoundingModeRTZFloat32(int shaderRoundingModeRTZFloat32) {
    	SHADER_ROUNDING_MODE_RTZFLOAT32_HANDLE.set(segment, 0L, shaderRoundingModeRTZFloat32);
    	return this;
    }
    
    public int shaderRoundingModeRTZFloat32() {
    	return (int) SHADER_ROUNDING_MODE_RTZFLOAT32_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderRoundingModeRTZFloat64()
    public VkPhysicalDeviceVulkan12Properties shaderRoundingModeRTZFloat64(int shaderRoundingModeRTZFloat64) {
    	SHADER_ROUNDING_MODE_RTZFLOAT64_HANDLE.set(segment, 0L, shaderRoundingModeRTZFloat64);
    	return this;
    }
    
    public int shaderRoundingModeRTZFloat64() {
    	return (int) SHADER_ROUNDING_MODE_RTZFLOAT64_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxUpdateAfterBindDescriptorsInAllPools()
    public VkPhysicalDeviceVulkan12Properties maxUpdateAfterBindDescriptorsInAllPools(int maxUpdateAfterBindDescriptorsInAllPools) {
    	MAX_UPDATE_AFTER_BIND_DESCRIPTORS_IN_ALL_POOLS_HANDLE.set(segment, 0L, maxUpdateAfterBindDescriptorsInAllPools);
    	return this;
    }
    
    public int maxUpdateAfterBindDescriptorsInAllPools() {
    	return (int) MAX_UPDATE_AFTER_BIND_DESCRIPTORS_IN_ALL_POOLS_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderUniformBufferArrayNonUniformIndexingNative()
    public VkPhysicalDeviceVulkan12Properties shaderUniformBufferArrayNonUniformIndexingNative(int shaderUniformBufferArrayNonUniformIndexingNative) {
    	SHADER_UNIFORM_BUFFER_ARRAY_NON_UNIFORM_INDEXING_NATIVE_HANDLE.set(segment, 0L, shaderUniformBufferArrayNonUniformIndexingNative);
    	return this;
    }
    
    public int shaderUniformBufferArrayNonUniformIndexingNative() {
    	return (int) SHADER_UNIFORM_BUFFER_ARRAY_NON_UNIFORM_INDEXING_NATIVE_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderSampledImageArrayNonUniformIndexingNative()
    public VkPhysicalDeviceVulkan12Properties shaderSampledImageArrayNonUniformIndexingNative(int shaderSampledImageArrayNonUniformIndexingNative) {
    	SHADER_SAMPLED_IMAGE_ARRAY_NON_UNIFORM_INDEXING_NATIVE_HANDLE.set(segment, 0L, shaderSampledImageArrayNonUniformIndexingNative);
    	return this;
    }
    
    public int shaderSampledImageArrayNonUniformIndexingNative() {
    	return (int) SHADER_SAMPLED_IMAGE_ARRAY_NON_UNIFORM_INDEXING_NATIVE_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderStorageBufferArrayNonUniformIndexingNative()
    public VkPhysicalDeviceVulkan12Properties shaderStorageBufferArrayNonUniformIndexingNative(int shaderStorageBufferArrayNonUniformIndexingNative) {
    	SHADER_STORAGE_BUFFER_ARRAY_NON_UNIFORM_INDEXING_NATIVE_HANDLE.set(segment, 0L, shaderStorageBufferArrayNonUniformIndexingNative);
    	return this;
    }
    
    public int shaderStorageBufferArrayNonUniformIndexingNative() {
    	return (int) SHADER_STORAGE_BUFFER_ARRAY_NON_UNIFORM_INDEXING_NATIVE_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderStorageImageArrayNonUniformIndexingNative()
    public VkPhysicalDeviceVulkan12Properties shaderStorageImageArrayNonUniformIndexingNative(int shaderStorageImageArrayNonUniformIndexingNative) {
    	SHADER_STORAGE_IMAGE_ARRAY_NON_UNIFORM_INDEXING_NATIVE_HANDLE.set(segment, 0L, shaderStorageImageArrayNonUniformIndexingNative);
    	return this;
    }
    
    public int shaderStorageImageArrayNonUniformIndexingNative() {
    	return (int) SHADER_STORAGE_IMAGE_ARRAY_NON_UNIFORM_INDEXING_NATIVE_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderInputAttachmentArrayNonUniformIndexingNative()
    public VkPhysicalDeviceVulkan12Properties shaderInputAttachmentArrayNonUniformIndexingNative(int shaderInputAttachmentArrayNonUniformIndexingNative) {
    	SHADER_INPUT_ATTACHMENT_ARRAY_NON_UNIFORM_INDEXING_NATIVE_HANDLE.set(segment, 0L, shaderInputAttachmentArrayNonUniformIndexingNative);
    	return this;
    }
    
    public int shaderInputAttachmentArrayNonUniformIndexingNative() {
    	return (int) SHADER_INPUT_ATTACHMENT_ARRAY_NON_UNIFORM_INDEXING_NATIVE_HANDLE.get(segment, 0L);
    }
    
    /// @see #robustBufferAccessUpdateAfterBind()
    public VkPhysicalDeviceVulkan12Properties robustBufferAccessUpdateAfterBind(int robustBufferAccessUpdateAfterBind) {
    	ROBUST_BUFFER_ACCESS_UPDATE_AFTER_BIND_HANDLE.set(segment, 0L, robustBufferAccessUpdateAfterBind);
    	return this;
    }
    
    public int robustBufferAccessUpdateAfterBind() {
    	return (int) ROBUST_BUFFER_ACCESS_UPDATE_AFTER_BIND_HANDLE.get(segment, 0L);
    }
    
    /// @see #quadDivergentImplicitLod()
    public VkPhysicalDeviceVulkan12Properties quadDivergentImplicitLod(int quadDivergentImplicitLod) {
    	QUAD_DIVERGENT_IMPLICIT_LOD_HANDLE.set(segment, 0L, quadDivergentImplicitLod);
    	return this;
    }
    
    public int quadDivergentImplicitLod() {
    	return (int) QUAD_DIVERGENT_IMPLICIT_LOD_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxPerStageDescriptorUpdateAfterBindSamplers()
    public VkPhysicalDeviceVulkan12Properties maxPerStageDescriptorUpdateAfterBindSamplers(int maxPerStageDescriptorUpdateAfterBindSamplers) {
    	MAX_PER_STAGE_DESCRIPTOR_UPDATE_AFTER_BIND_SAMPLERS_HANDLE.set(segment, 0L, maxPerStageDescriptorUpdateAfterBindSamplers);
    	return this;
    }
    
    public int maxPerStageDescriptorUpdateAfterBindSamplers() {
    	return (int) MAX_PER_STAGE_DESCRIPTOR_UPDATE_AFTER_BIND_SAMPLERS_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxPerStageDescriptorUpdateAfterBindUniformBuffers()
    public VkPhysicalDeviceVulkan12Properties maxPerStageDescriptorUpdateAfterBindUniformBuffers(int maxPerStageDescriptorUpdateAfterBindUniformBuffers) {
    	MAX_PER_STAGE_DESCRIPTOR_UPDATE_AFTER_BIND_UNIFORM_BUFFERS_HANDLE.set(segment, 0L, maxPerStageDescriptorUpdateAfterBindUniformBuffers);
    	return this;
    }
    
    public int maxPerStageDescriptorUpdateAfterBindUniformBuffers() {
    	return (int) MAX_PER_STAGE_DESCRIPTOR_UPDATE_AFTER_BIND_UNIFORM_BUFFERS_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxPerStageDescriptorUpdateAfterBindStorageBuffers()
    public VkPhysicalDeviceVulkan12Properties maxPerStageDescriptorUpdateAfterBindStorageBuffers(int maxPerStageDescriptorUpdateAfterBindStorageBuffers) {
    	MAX_PER_STAGE_DESCRIPTOR_UPDATE_AFTER_BIND_STORAGE_BUFFERS_HANDLE.set(segment, 0L, maxPerStageDescriptorUpdateAfterBindStorageBuffers);
    	return this;
    }
    
    public int maxPerStageDescriptorUpdateAfterBindStorageBuffers() {
    	return (int) MAX_PER_STAGE_DESCRIPTOR_UPDATE_AFTER_BIND_STORAGE_BUFFERS_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxPerStageDescriptorUpdateAfterBindSampledImages()
    public VkPhysicalDeviceVulkan12Properties maxPerStageDescriptorUpdateAfterBindSampledImages(int maxPerStageDescriptorUpdateAfterBindSampledImages) {
    	MAX_PER_STAGE_DESCRIPTOR_UPDATE_AFTER_BIND_SAMPLED_IMAGES_HANDLE.set(segment, 0L, maxPerStageDescriptorUpdateAfterBindSampledImages);
    	return this;
    }
    
    public int maxPerStageDescriptorUpdateAfterBindSampledImages() {
    	return (int) MAX_PER_STAGE_DESCRIPTOR_UPDATE_AFTER_BIND_SAMPLED_IMAGES_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxPerStageDescriptorUpdateAfterBindStorageImages()
    public VkPhysicalDeviceVulkan12Properties maxPerStageDescriptorUpdateAfterBindStorageImages(int maxPerStageDescriptorUpdateAfterBindStorageImages) {
    	MAX_PER_STAGE_DESCRIPTOR_UPDATE_AFTER_BIND_STORAGE_IMAGES_HANDLE.set(segment, 0L, maxPerStageDescriptorUpdateAfterBindStorageImages);
    	return this;
    }
    
    public int maxPerStageDescriptorUpdateAfterBindStorageImages() {
    	return (int) MAX_PER_STAGE_DESCRIPTOR_UPDATE_AFTER_BIND_STORAGE_IMAGES_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxPerStageDescriptorUpdateAfterBindInputAttachments()
    public VkPhysicalDeviceVulkan12Properties maxPerStageDescriptorUpdateAfterBindInputAttachments(int maxPerStageDescriptorUpdateAfterBindInputAttachments) {
    	MAX_PER_STAGE_DESCRIPTOR_UPDATE_AFTER_BIND_INPUT_ATTACHMENTS_HANDLE.set(segment, 0L, maxPerStageDescriptorUpdateAfterBindInputAttachments);
    	return this;
    }
    
    public int maxPerStageDescriptorUpdateAfterBindInputAttachments() {
    	return (int) MAX_PER_STAGE_DESCRIPTOR_UPDATE_AFTER_BIND_INPUT_ATTACHMENTS_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxPerStageUpdateAfterBindResources()
    public VkPhysicalDeviceVulkan12Properties maxPerStageUpdateAfterBindResources(int maxPerStageUpdateAfterBindResources) {
    	MAX_PER_STAGE_UPDATE_AFTER_BIND_RESOURCES_HANDLE.set(segment, 0L, maxPerStageUpdateAfterBindResources);
    	return this;
    }
    
    public int maxPerStageUpdateAfterBindResources() {
    	return (int) MAX_PER_STAGE_UPDATE_AFTER_BIND_RESOURCES_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxDescriptorSetUpdateAfterBindSamplers()
    public VkPhysicalDeviceVulkan12Properties maxDescriptorSetUpdateAfterBindSamplers(int maxDescriptorSetUpdateAfterBindSamplers) {
    	MAX_DESCRIPTOR_SET_UPDATE_AFTER_BIND_SAMPLERS_HANDLE.set(segment, 0L, maxDescriptorSetUpdateAfterBindSamplers);
    	return this;
    }
    
    public int maxDescriptorSetUpdateAfterBindSamplers() {
    	return (int) MAX_DESCRIPTOR_SET_UPDATE_AFTER_BIND_SAMPLERS_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxDescriptorSetUpdateAfterBindUniformBuffers()
    public VkPhysicalDeviceVulkan12Properties maxDescriptorSetUpdateAfterBindUniformBuffers(int maxDescriptorSetUpdateAfterBindUniformBuffers) {
    	MAX_DESCRIPTOR_SET_UPDATE_AFTER_BIND_UNIFORM_BUFFERS_HANDLE.set(segment, 0L, maxDescriptorSetUpdateAfterBindUniformBuffers);
    	return this;
    }
    
    public int maxDescriptorSetUpdateAfterBindUniformBuffers() {
    	return (int) MAX_DESCRIPTOR_SET_UPDATE_AFTER_BIND_UNIFORM_BUFFERS_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxDescriptorSetUpdateAfterBindUniformBuffersDynamic()
    public VkPhysicalDeviceVulkan12Properties maxDescriptorSetUpdateAfterBindUniformBuffersDynamic(int maxDescriptorSetUpdateAfterBindUniformBuffersDynamic) {
    	MAX_DESCRIPTOR_SET_UPDATE_AFTER_BIND_UNIFORM_BUFFERS_DYNAMIC_HANDLE.set(segment, 0L, maxDescriptorSetUpdateAfterBindUniformBuffersDynamic);
    	return this;
    }
    
    public int maxDescriptorSetUpdateAfterBindUniformBuffersDynamic() {
    	return (int) MAX_DESCRIPTOR_SET_UPDATE_AFTER_BIND_UNIFORM_BUFFERS_DYNAMIC_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxDescriptorSetUpdateAfterBindStorageBuffers()
    public VkPhysicalDeviceVulkan12Properties maxDescriptorSetUpdateAfterBindStorageBuffers(int maxDescriptorSetUpdateAfterBindStorageBuffers) {
    	MAX_DESCRIPTOR_SET_UPDATE_AFTER_BIND_STORAGE_BUFFERS_HANDLE.set(segment, 0L, maxDescriptorSetUpdateAfterBindStorageBuffers);
    	return this;
    }
    
    public int maxDescriptorSetUpdateAfterBindStorageBuffers() {
    	return (int) MAX_DESCRIPTOR_SET_UPDATE_AFTER_BIND_STORAGE_BUFFERS_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxDescriptorSetUpdateAfterBindStorageBuffersDynamic()
    public VkPhysicalDeviceVulkan12Properties maxDescriptorSetUpdateAfterBindStorageBuffersDynamic(int maxDescriptorSetUpdateAfterBindStorageBuffersDynamic) {
    	MAX_DESCRIPTOR_SET_UPDATE_AFTER_BIND_STORAGE_BUFFERS_DYNAMIC_HANDLE.set(segment, 0L, maxDescriptorSetUpdateAfterBindStorageBuffersDynamic);
    	return this;
    }
    
    public int maxDescriptorSetUpdateAfterBindStorageBuffersDynamic() {
    	return (int) MAX_DESCRIPTOR_SET_UPDATE_AFTER_BIND_STORAGE_BUFFERS_DYNAMIC_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxDescriptorSetUpdateAfterBindSampledImages()
    public VkPhysicalDeviceVulkan12Properties maxDescriptorSetUpdateAfterBindSampledImages(int maxDescriptorSetUpdateAfterBindSampledImages) {
    	MAX_DESCRIPTOR_SET_UPDATE_AFTER_BIND_SAMPLED_IMAGES_HANDLE.set(segment, 0L, maxDescriptorSetUpdateAfterBindSampledImages);
    	return this;
    }
    
    public int maxDescriptorSetUpdateAfterBindSampledImages() {
    	return (int) MAX_DESCRIPTOR_SET_UPDATE_AFTER_BIND_SAMPLED_IMAGES_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxDescriptorSetUpdateAfterBindStorageImages()
    public VkPhysicalDeviceVulkan12Properties maxDescriptorSetUpdateAfterBindStorageImages(int maxDescriptorSetUpdateAfterBindStorageImages) {
    	MAX_DESCRIPTOR_SET_UPDATE_AFTER_BIND_STORAGE_IMAGES_HANDLE.set(segment, 0L, maxDescriptorSetUpdateAfterBindStorageImages);
    	return this;
    }
    
    public int maxDescriptorSetUpdateAfterBindStorageImages() {
    	return (int) MAX_DESCRIPTOR_SET_UPDATE_AFTER_BIND_STORAGE_IMAGES_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxDescriptorSetUpdateAfterBindInputAttachments()
    public VkPhysicalDeviceVulkan12Properties maxDescriptorSetUpdateAfterBindInputAttachments(int maxDescriptorSetUpdateAfterBindInputAttachments) {
    	MAX_DESCRIPTOR_SET_UPDATE_AFTER_BIND_INPUT_ATTACHMENTS_HANDLE.set(segment, 0L, maxDescriptorSetUpdateAfterBindInputAttachments);
    	return this;
    }
    
    public int maxDescriptorSetUpdateAfterBindInputAttachments() {
    	return (int) MAX_DESCRIPTOR_SET_UPDATE_AFTER_BIND_INPUT_ATTACHMENTS_HANDLE.get(segment, 0L);
    }
    
    /// @see #supportedDepthResolveModes()
    public VkPhysicalDeviceVulkan12Properties supportedDepthResolveModes(int supportedDepthResolveModes) {
    	SUPPORTED_DEPTH_RESOLVE_MODES_HANDLE.set(segment, 0L, supportedDepthResolveModes);
    	return this;
    }
    
    public int supportedDepthResolveModes() {
    	return (int) SUPPORTED_DEPTH_RESOLVE_MODES_HANDLE.get(segment, 0L);
    }
    
    /// @see #supportedStencilResolveModes()
    public VkPhysicalDeviceVulkan12Properties supportedStencilResolveModes(int supportedStencilResolveModes) {
    	SUPPORTED_STENCIL_RESOLVE_MODES_HANDLE.set(segment, 0L, supportedStencilResolveModes);
    	return this;
    }
    
    public int supportedStencilResolveModes() {
    	return (int) SUPPORTED_STENCIL_RESOLVE_MODES_HANDLE.get(segment, 0L);
    }
    
    /// @see #independentResolveNone()
    public VkPhysicalDeviceVulkan12Properties independentResolveNone(int independentResolveNone) {
    	INDEPENDENT_RESOLVE_NONE_HANDLE.set(segment, 0L, independentResolveNone);
    	return this;
    }
    
    public int independentResolveNone() {
    	return (int) INDEPENDENT_RESOLVE_NONE_HANDLE.get(segment, 0L);
    }
    
    /// @see #independentResolve()
    public VkPhysicalDeviceVulkan12Properties independentResolve(int independentResolve) {
    	INDEPENDENT_RESOLVE_HANDLE.set(segment, 0L, independentResolve);
    	return this;
    }
    
    public int independentResolve() {
    	return (int) INDEPENDENT_RESOLVE_HANDLE.get(segment, 0L);
    }
    
    /// @see #filterMinmaxSingleComponentFormats()
    public VkPhysicalDeviceVulkan12Properties filterMinmaxSingleComponentFormats(int filterMinmaxSingleComponentFormats) {
    	FILTER_MINMAX_SINGLE_COMPONENT_FORMATS_HANDLE.set(segment, 0L, filterMinmaxSingleComponentFormats);
    	return this;
    }
    
    public int filterMinmaxSingleComponentFormats() {
    	return (int) FILTER_MINMAX_SINGLE_COMPONENT_FORMATS_HANDLE.get(segment, 0L);
    }
    
    /// @see #filterMinmaxImageComponentMapping()
    public VkPhysicalDeviceVulkan12Properties filterMinmaxImageComponentMapping(int filterMinmaxImageComponentMapping) {
    	FILTER_MINMAX_IMAGE_COMPONENT_MAPPING_HANDLE.set(segment, 0L, filterMinmaxImageComponentMapping);
    	return this;
    }
    
    public int filterMinmaxImageComponentMapping() {
    	return (int) FILTER_MINMAX_IMAGE_COMPONENT_MAPPING_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxTimelineSemaphoreValueDifference()
    public VkPhysicalDeviceVulkan12Properties maxTimelineSemaphoreValueDifference(long maxTimelineSemaphoreValueDifference) {
    	MAX_TIMELINE_SEMAPHORE_VALUE_DIFFERENCE_HANDLE.set(segment, 0L, maxTimelineSemaphoreValueDifference);
    	return this;
    }
    
    public long maxTimelineSemaphoreValueDifference() {
    	return (long) MAX_TIMELINE_SEMAPHORE_VALUE_DIFFERENCE_HANDLE.get(segment, 0L);
    }
    
    /// @see #framebufferIntegerColorSampleCounts()
    public VkPhysicalDeviceVulkan12Properties framebufferIntegerColorSampleCounts(int framebufferIntegerColorSampleCounts) {
    	FRAMEBUFFER_INTEGER_COLOR_SAMPLE_COUNTS_HANDLE.set(segment, 0L, framebufferIntegerColorSampleCounts);
    	return this;
    }
    
    public int framebufferIntegerColorSampleCounts() {
    	return (int) FRAMEBUFFER_INTEGER_COLOR_SAMPLE_COUNTS_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceVulkan12Properties set(VkPhysicalDeviceVulkan12Properties other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceVulkan12Properties set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceVulkan12Properties> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceVulkan12Properties> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceVulkan12Properties(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceVulkan12Properties> array(Arena arena, VkPhysicalDeviceVulkan12Properties... structs) {
        NativeStructArray<VkPhysicalDeviceVulkan12Properties> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceVulkan12Properties(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceVulkan12Properties> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceVulkan12Properties(segment)
        );
    }

}