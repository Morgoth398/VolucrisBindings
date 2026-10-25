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

public final class VkPhysicalDeviceVulkan12Features
		implements Struct<VkPhysicalDeviceVulkan12Features> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle SAMPLER_MIRROR_CLAMP_TO_EDGE_HANDLE;
	public static final VarHandle DRAW_INDIRECT_COUNT_HANDLE;
	public static final VarHandle STORAGE_BUFFER8_BIT_ACCESS_HANDLE;
	public static final VarHandle UNIFORM_AND_STORAGE_BUFFER8_BIT_ACCESS_HANDLE;
	public static final VarHandle STORAGE_PUSH_CONSTANT8_HANDLE;
	public static final VarHandle SHADER_BUFFER_INT64_ATOMICS_HANDLE;
	public static final VarHandle SHADER_SHARED_INT64_ATOMICS_HANDLE;
	public static final VarHandle SHADER_FLOAT16_HANDLE;
	public static final VarHandle SHADER_INT8_HANDLE;
	public static final VarHandle DESCRIPTOR_INDEXING_HANDLE;
	public static final VarHandle SHADER_INPUT_ATTACHMENT_ARRAY_DYNAMIC_INDEXING_HANDLE;
	public static final VarHandle SHADER_UNIFORM_TEXEL_BUFFER_ARRAY_DYNAMIC_INDEXING_HANDLE;
	public static final VarHandle SHADER_STORAGE_TEXEL_BUFFER_ARRAY_DYNAMIC_INDEXING_HANDLE;
	public static final VarHandle SHADER_UNIFORM_BUFFER_ARRAY_NON_UNIFORM_INDEXING_HANDLE;
	public static final VarHandle SHADER_SAMPLED_IMAGE_ARRAY_NON_UNIFORM_INDEXING_HANDLE;
	public static final VarHandle SHADER_STORAGE_BUFFER_ARRAY_NON_UNIFORM_INDEXING_HANDLE;
	public static final VarHandle SHADER_STORAGE_IMAGE_ARRAY_NON_UNIFORM_INDEXING_HANDLE;
	public static final VarHandle SHADER_INPUT_ATTACHMENT_ARRAY_NON_UNIFORM_INDEXING_HANDLE;
	public static final VarHandle SHADER_UNIFORM_TEXEL_BUFFER_ARRAY_NON_UNIFORM_INDEXING_HANDLE;
	public static final VarHandle SHADER_STORAGE_TEXEL_BUFFER_ARRAY_NON_UNIFORM_INDEXING_HANDLE;
	public static final VarHandle DESCRIPTOR_BINDING_UNIFORM_BUFFER_UPDATE_AFTER_BIND_HANDLE;
	public static final VarHandle DESCRIPTOR_BINDING_SAMPLED_IMAGE_UPDATE_AFTER_BIND_HANDLE;
	public static final VarHandle DESCRIPTOR_BINDING_STORAGE_IMAGE_UPDATE_AFTER_BIND_HANDLE;
	public static final VarHandle DESCRIPTOR_BINDING_STORAGE_BUFFER_UPDATE_AFTER_BIND_HANDLE;
	public static final VarHandle DESCRIPTOR_BINDING_UNIFORM_TEXEL_BUFFER_UPDATE_AFTER_BIND_HANDLE;
	public static final VarHandle DESCRIPTOR_BINDING_STORAGE_TEXEL_BUFFER_UPDATE_AFTER_BIND_HANDLE;
	public static final VarHandle DESCRIPTOR_BINDING_UPDATE_UNUSED_WHILE_PENDING_HANDLE;
	public static final VarHandle DESCRIPTOR_BINDING_PARTIALLY_BOUND_HANDLE;
	public static final VarHandle DESCRIPTOR_BINDING_VARIABLE_DESCRIPTOR_COUNT_HANDLE;
	public static final VarHandle RUNTIME_DESCRIPTOR_ARRAY_HANDLE;
	public static final VarHandle SAMPLER_FILTER_MINMAX_HANDLE;
	public static final VarHandle SCALAR_BLOCK_LAYOUT_HANDLE;
	public static final VarHandle IMAGELESS_FRAMEBUFFER_HANDLE;
	public static final VarHandle UNIFORM_BUFFER_STANDARD_LAYOUT_HANDLE;
	public static final VarHandle SHADER_SUBGROUP_EXTENDED_TYPES_HANDLE;
	public static final VarHandle SEPARATE_DEPTH_STENCIL_LAYOUTS_HANDLE;
	public static final VarHandle HOST_QUERY_RESET_HANDLE;
	public static final VarHandle TIMELINE_SEMAPHORE_HANDLE;
	public static final VarHandle BUFFER_DEVICE_ADDRESS_HANDLE;
	public static final VarHandle BUFFER_DEVICE_ADDRESS_CAPTURE_REPLAY_HANDLE;
	public static final VarHandle BUFFER_DEVICE_ADDRESS_MULTI_DEVICE_HANDLE;
	public static final VarHandle VULKAN_MEMORY_MODEL_HANDLE;
	public static final VarHandle VULKAN_MEMORY_MODEL_DEVICE_SCOPE_HANDLE;
	public static final VarHandle VULKAN_MEMORY_MODEL_AVAILABILITY_VISIBILITY_CHAINS_HANDLE;
	public static final VarHandle SHADER_OUTPUT_VIEWPORT_INDEX_HANDLE;
	public static final VarHandle SHADER_OUTPUT_LAYER_HANDLE;
	public static final VarHandle SUBGROUP_BROADCAST_DYNAMIC_ID_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long SAMPLER_MIRROR_CLAMP_TO_EDGE_BYTE_OFFSET;
	public static final long DRAW_INDIRECT_COUNT_BYTE_OFFSET;
	public static final long STORAGE_BUFFER8_BIT_ACCESS_BYTE_OFFSET;
	public static final long UNIFORM_AND_STORAGE_BUFFER8_BIT_ACCESS_BYTE_OFFSET;
	public static final long STORAGE_PUSH_CONSTANT8_BYTE_OFFSET;
	public static final long SHADER_BUFFER_INT64_ATOMICS_BYTE_OFFSET;
	public static final long SHADER_SHARED_INT64_ATOMICS_BYTE_OFFSET;
	public static final long SHADER_FLOAT16_BYTE_OFFSET;
	public static final long SHADER_INT8_BYTE_OFFSET;
	public static final long DESCRIPTOR_INDEXING_BYTE_OFFSET;
	public static final long SHADER_INPUT_ATTACHMENT_ARRAY_DYNAMIC_INDEXING_BYTE_OFFSET;
	public static final long SHADER_UNIFORM_TEXEL_BUFFER_ARRAY_DYNAMIC_INDEXING_BYTE_OFFSET;
	public static final long SHADER_STORAGE_TEXEL_BUFFER_ARRAY_DYNAMIC_INDEXING_BYTE_OFFSET;
	public static final long SHADER_UNIFORM_BUFFER_ARRAY_NON_UNIFORM_INDEXING_BYTE_OFFSET;
	public static final long SHADER_SAMPLED_IMAGE_ARRAY_NON_UNIFORM_INDEXING_BYTE_OFFSET;
	public static final long SHADER_STORAGE_BUFFER_ARRAY_NON_UNIFORM_INDEXING_BYTE_OFFSET;
	public static final long SHADER_STORAGE_IMAGE_ARRAY_NON_UNIFORM_INDEXING_BYTE_OFFSET;
	public static final long SHADER_INPUT_ATTACHMENT_ARRAY_NON_UNIFORM_INDEXING_BYTE_OFFSET;
	public static final long SHADER_UNIFORM_TEXEL_BUFFER_ARRAY_NON_UNIFORM_INDEXING_BYTE_OFFSET;
	public static final long SHADER_STORAGE_TEXEL_BUFFER_ARRAY_NON_UNIFORM_INDEXING_BYTE_OFFSET;
	public static final long DESCRIPTOR_BINDING_UNIFORM_BUFFER_UPDATE_AFTER_BIND_BYTE_OFFSET;
	public static final long DESCRIPTOR_BINDING_SAMPLED_IMAGE_UPDATE_AFTER_BIND_BYTE_OFFSET;
	public static final long DESCRIPTOR_BINDING_STORAGE_IMAGE_UPDATE_AFTER_BIND_BYTE_OFFSET;
	public static final long DESCRIPTOR_BINDING_STORAGE_BUFFER_UPDATE_AFTER_BIND_BYTE_OFFSET;
	public static final long DESCRIPTOR_BINDING_UNIFORM_TEXEL_BUFFER_UPDATE_AFTER_BIND_BYTE_OFFSET;
	public static final long DESCRIPTOR_BINDING_STORAGE_TEXEL_BUFFER_UPDATE_AFTER_BIND_BYTE_OFFSET;
	public static final long DESCRIPTOR_BINDING_UPDATE_UNUSED_WHILE_PENDING_BYTE_OFFSET;
	public static final long DESCRIPTOR_BINDING_PARTIALLY_BOUND_BYTE_OFFSET;
	public static final long DESCRIPTOR_BINDING_VARIABLE_DESCRIPTOR_COUNT_BYTE_OFFSET;
	public static final long RUNTIME_DESCRIPTOR_ARRAY_BYTE_OFFSET;
	public static final long SAMPLER_FILTER_MINMAX_BYTE_OFFSET;
	public static final long SCALAR_BLOCK_LAYOUT_BYTE_OFFSET;
	public static final long IMAGELESS_FRAMEBUFFER_BYTE_OFFSET;
	public static final long UNIFORM_BUFFER_STANDARD_LAYOUT_BYTE_OFFSET;
	public static final long SHADER_SUBGROUP_EXTENDED_TYPES_BYTE_OFFSET;
	public static final long SEPARATE_DEPTH_STENCIL_LAYOUTS_BYTE_OFFSET;
	public static final long HOST_QUERY_RESET_BYTE_OFFSET;
	public static final long TIMELINE_SEMAPHORE_BYTE_OFFSET;
	public static final long BUFFER_DEVICE_ADDRESS_BYTE_OFFSET;
	public static final long BUFFER_DEVICE_ADDRESS_CAPTURE_REPLAY_BYTE_OFFSET;
	public static final long BUFFER_DEVICE_ADDRESS_MULTI_DEVICE_BYTE_OFFSET;
	public static final long VULKAN_MEMORY_MODEL_BYTE_OFFSET;
	public static final long VULKAN_MEMORY_MODEL_DEVICE_SCOPE_BYTE_OFFSET;
	public static final long VULKAN_MEMORY_MODEL_AVAILABILITY_VISIBILITY_CHAINS_BYTE_OFFSET;
	public static final long SHADER_OUTPUT_VIEWPORT_INDEX_BYTE_OFFSET;
	public static final long SHADER_OUTPUT_LAYER_BYTE_OFFSET;
	public static final long SUBGROUP_BROADCAST_DYNAMIC_ID_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("samplerMirrorClampToEdge"),
		    JAVA_INT.withName("drawIndirectCount"),
		    JAVA_INT.withName("storageBuffer8BitAccess"),
		    JAVA_INT.withName("uniformAndStorageBuffer8BitAccess"),
		    JAVA_INT.withName("storagePushConstant8"),
		    JAVA_INT.withName("shaderBufferInt64Atomics"),
		    JAVA_INT.withName("shaderSharedInt64Atomics"),
		    JAVA_INT.withName("shaderFloat16"),
		    JAVA_INT.withName("shaderInt8"),
		    JAVA_INT.withName("descriptorIndexing"),
		    JAVA_INT.withName("shaderInputAttachmentArrayDynamicIndexing"),
		    JAVA_INT.withName("shaderUniformTexelBufferArrayDynamicIndexing"),
		    JAVA_INT.withName("shaderStorageTexelBufferArrayDynamicIndexing"),
		    JAVA_INT.withName("shaderUniformBufferArrayNonUniformIndexing"),
		    JAVA_INT.withName("shaderSampledImageArrayNonUniformIndexing"),
		    JAVA_INT.withName("shaderStorageBufferArrayNonUniformIndexing"),
		    JAVA_INT.withName("shaderStorageImageArrayNonUniformIndexing"),
		    JAVA_INT.withName("shaderInputAttachmentArrayNonUniformIndexing"),
		    JAVA_INT.withName("shaderUniformTexelBufferArrayNonUniformIndexing"),
		    JAVA_INT.withName("shaderStorageTexelBufferArrayNonUniformIndexing"),
		    JAVA_INT.withName("descriptorBindingUniformBufferUpdateAfterBind"),
		    JAVA_INT.withName("descriptorBindingSampledImageUpdateAfterBind"),
		    JAVA_INT.withName("descriptorBindingStorageImageUpdateAfterBind"),
		    JAVA_INT.withName("descriptorBindingStorageBufferUpdateAfterBind"),
		    JAVA_INT.withName("descriptorBindingUniformTexelBufferUpdateAfterBind"),
		    JAVA_INT.withName("descriptorBindingStorageTexelBufferUpdateAfterBind"),
		    JAVA_INT.withName("descriptorBindingUpdateUnusedWhilePending"),
		    JAVA_INT.withName("descriptorBindingPartiallyBound"),
		    JAVA_INT.withName("descriptorBindingVariableDescriptorCount"),
		    JAVA_INT.withName("runtimeDescriptorArray"),
		    JAVA_INT.withName("samplerFilterMinmax"),
		    JAVA_INT.withName("scalarBlockLayout"),
		    JAVA_INT.withName("imagelessFramebuffer"),
		    JAVA_INT.withName("uniformBufferStandardLayout"),
		    JAVA_INT.withName("shaderSubgroupExtendedTypes"),
		    JAVA_INT.withName("separateDepthStencilLayouts"),
		    JAVA_INT.withName("hostQueryReset"),
		    JAVA_INT.withName("timelineSemaphore"),
		    JAVA_INT.withName("bufferDeviceAddress"),
		    JAVA_INT.withName("bufferDeviceAddressCaptureReplay"),
		    JAVA_INT.withName("bufferDeviceAddressMultiDevice"),
		    JAVA_INT.withName("vulkanMemoryModel"),
		    JAVA_INT.withName("vulkanMemoryModelDeviceScope"),
		    JAVA_INT.withName("vulkanMemoryModelAvailabilityVisibilityChains"),
		    JAVA_INT.withName("shaderOutputViewportIndex"),
		    JAVA_INT.withName("shaderOutputLayer"),
		    JAVA_INT.withName("subgroupBroadcastDynamicId"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPhysicalDeviceVulkan12Features").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		SAMPLER_MIRROR_CLAMP_TO_EDGE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("samplerMirrorClampToEdge"));
		DRAW_INDIRECT_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("drawIndirectCount"));
		STORAGE_BUFFER8_BIT_ACCESS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("storageBuffer8BitAccess"));
		UNIFORM_AND_STORAGE_BUFFER8_BIT_ACCESS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("uniformAndStorageBuffer8BitAccess"));
		STORAGE_PUSH_CONSTANT8_HANDLE = LAYOUT.varHandle(PathElement.groupElement("storagePushConstant8"));
		SHADER_BUFFER_INT64_ATOMICS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderBufferInt64Atomics"));
		SHADER_SHARED_INT64_ATOMICS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderSharedInt64Atomics"));
		SHADER_FLOAT16_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderFloat16"));
		SHADER_INT8_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderInt8"));
		DESCRIPTOR_INDEXING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("descriptorIndexing"));
		SHADER_INPUT_ATTACHMENT_ARRAY_DYNAMIC_INDEXING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderInputAttachmentArrayDynamicIndexing"));
		SHADER_UNIFORM_TEXEL_BUFFER_ARRAY_DYNAMIC_INDEXING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderUniformTexelBufferArrayDynamicIndexing"));
		SHADER_STORAGE_TEXEL_BUFFER_ARRAY_DYNAMIC_INDEXING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderStorageTexelBufferArrayDynamicIndexing"));
		SHADER_UNIFORM_BUFFER_ARRAY_NON_UNIFORM_INDEXING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderUniformBufferArrayNonUniformIndexing"));
		SHADER_SAMPLED_IMAGE_ARRAY_NON_UNIFORM_INDEXING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderSampledImageArrayNonUniformIndexing"));
		SHADER_STORAGE_BUFFER_ARRAY_NON_UNIFORM_INDEXING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderStorageBufferArrayNonUniformIndexing"));
		SHADER_STORAGE_IMAGE_ARRAY_NON_UNIFORM_INDEXING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderStorageImageArrayNonUniformIndexing"));
		SHADER_INPUT_ATTACHMENT_ARRAY_NON_UNIFORM_INDEXING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderInputAttachmentArrayNonUniformIndexing"));
		SHADER_UNIFORM_TEXEL_BUFFER_ARRAY_NON_UNIFORM_INDEXING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderUniformTexelBufferArrayNonUniformIndexing"));
		SHADER_STORAGE_TEXEL_BUFFER_ARRAY_NON_UNIFORM_INDEXING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderStorageTexelBufferArrayNonUniformIndexing"));
		DESCRIPTOR_BINDING_UNIFORM_BUFFER_UPDATE_AFTER_BIND_HANDLE = LAYOUT.varHandle(PathElement.groupElement("descriptorBindingUniformBufferUpdateAfterBind"));
		DESCRIPTOR_BINDING_SAMPLED_IMAGE_UPDATE_AFTER_BIND_HANDLE = LAYOUT.varHandle(PathElement.groupElement("descriptorBindingSampledImageUpdateAfterBind"));
		DESCRIPTOR_BINDING_STORAGE_IMAGE_UPDATE_AFTER_BIND_HANDLE = LAYOUT.varHandle(PathElement.groupElement("descriptorBindingStorageImageUpdateAfterBind"));
		DESCRIPTOR_BINDING_STORAGE_BUFFER_UPDATE_AFTER_BIND_HANDLE = LAYOUT.varHandle(PathElement.groupElement("descriptorBindingStorageBufferUpdateAfterBind"));
		DESCRIPTOR_BINDING_UNIFORM_TEXEL_BUFFER_UPDATE_AFTER_BIND_HANDLE = LAYOUT.varHandle(PathElement.groupElement("descriptorBindingUniformTexelBufferUpdateAfterBind"));
		DESCRIPTOR_BINDING_STORAGE_TEXEL_BUFFER_UPDATE_AFTER_BIND_HANDLE = LAYOUT.varHandle(PathElement.groupElement("descriptorBindingStorageTexelBufferUpdateAfterBind"));
		DESCRIPTOR_BINDING_UPDATE_UNUSED_WHILE_PENDING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("descriptorBindingUpdateUnusedWhilePending"));
		DESCRIPTOR_BINDING_PARTIALLY_BOUND_HANDLE = LAYOUT.varHandle(PathElement.groupElement("descriptorBindingPartiallyBound"));
		DESCRIPTOR_BINDING_VARIABLE_DESCRIPTOR_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("descriptorBindingVariableDescriptorCount"));
		RUNTIME_DESCRIPTOR_ARRAY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("runtimeDescriptorArray"));
		SAMPLER_FILTER_MINMAX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("samplerFilterMinmax"));
		SCALAR_BLOCK_LAYOUT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("scalarBlockLayout"));
		IMAGELESS_FRAMEBUFFER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("imagelessFramebuffer"));
		UNIFORM_BUFFER_STANDARD_LAYOUT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("uniformBufferStandardLayout"));
		SHADER_SUBGROUP_EXTENDED_TYPES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderSubgroupExtendedTypes"));
		SEPARATE_DEPTH_STENCIL_LAYOUTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("separateDepthStencilLayouts"));
		HOST_QUERY_RESET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("hostQueryReset"));
		TIMELINE_SEMAPHORE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("timelineSemaphore"));
		BUFFER_DEVICE_ADDRESS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("bufferDeviceAddress"));
		BUFFER_DEVICE_ADDRESS_CAPTURE_REPLAY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("bufferDeviceAddressCaptureReplay"));
		BUFFER_DEVICE_ADDRESS_MULTI_DEVICE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("bufferDeviceAddressMultiDevice"));
		VULKAN_MEMORY_MODEL_HANDLE = LAYOUT.varHandle(PathElement.groupElement("vulkanMemoryModel"));
		VULKAN_MEMORY_MODEL_DEVICE_SCOPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("vulkanMemoryModelDeviceScope"));
		VULKAN_MEMORY_MODEL_AVAILABILITY_VISIBILITY_CHAINS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("vulkanMemoryModelAvailabilityVisibilityChains"));
		SHADER_OUTPUT_VIEWPORT_INDEX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderOutputViewportIndex"));
		SHADER_OUTPUT_LAYER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderOutputLayer"));
		SUBGROUP_BROADCAST_DYNAMIC_ID_HANDLE = LAYOUT.varHandle(PathElement.groupElement("subgroupBroadcastDynamicId"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		SAMPLER_MIRROR_CLAMP_TO_EDGE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("samplerMirrorClampToEdge"));
		DRAW_INDIRECT_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("drawIndirectCount"));
		STORAGE_BUFFER8_BIT_ACCESS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("storageBuffer8BitAccess"));
		UNIFORM_AND_STORAGE_BUFFER8_BIT_ACCESS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("uniformAndStorageBuffer8BitAccess"));
		STORAGE_PUSH_CONSTANT8_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("storagePushConstant8"));
		SHADER_BUFFER_INT64_ATOMICS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderBufferInt64Atomics"));
		SHADER_SHARED_INT64_ATOMICS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderSharedInt64Atomics"));
		SHADER_FLOAT16_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderFloat16"));
		SHADER_INT8_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderInt8"));
		DESCRIPTOR_INDEXING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("descriptorIndexing"));
		SHADER_INPUT_ATTACHMENT_ARRAY_DYNAMIC_INDEXING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderInputAttachmentArrayDynamicIndexing"));
		SHADER_UNIFORM_TEXEL_BUFFER_ARRAY_DYNAMIC_INDEXING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderUniformTexelBufferArrayDynamicIndexing"));
		SHADER_STORAGE_TEXEL_BUFFER_ARRAY_DYNAMIC_INDEXING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderStorageTexelBufferArrayDynamicIndexing"));
		SHADER_UNIFORM_BUFFER_ARRAY_NON_UNIFORM_INDEXING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderUniformBufferArrayNonUniformIndexing"));
		SHADER_SAMPLED_IMAGE_ARRAY_NON_UNIFORM_INDEXING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderSampledImageArrayNonUniformIndexing"));
		SHADER_STORAGE_BUFFER_ARRAY_NON_UNIFORM_INDEXING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderStorageBufferArrayNonUniformIndexing"));
		SHADER_STORAGE_IMAGE_ARRAY_NON_UNIFORM_INDEXING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderStorageImageArrayNonUniformIndexing"));
		SHADER_INPUT_ATTACHMENT_ARRAY_NON_UNIFORM_INDEXING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderInputAttachmentArrayNonUniformIndexing"));
		SHADER_UNIFORM_TEXEL_BUFFER_ARRAY_NON_UNIFORM_INDEXING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderUniformTexelBufferArrayNonUniformIndexing"));
		SHADER_STORAGE_TEXEL_BUFFER_ARRAY_NON_UNIFORM_INDEXING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderStorageTexelBufferArrayNonUniformIndexing"));
		DESCRIPTOR_BINDING_UNIFORM_BUFFER_UPDATE_AFTER_BIND_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("descriptorBindingUniformBufferUpdateAfterBind"));
		DESCRIPTOR_BINDING_SAMPLED_IMAGE_UPDATE_AFTER_BIND_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("descriptorBindingSampledImageUpdateAfterBind"));
		DESCRIPTOR_BINDING_STORAGE_IMAGE_UPDATE_AFTER_BIND_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("descriptorBindingStorageImageUpdateAfterBind"));
		DESCRIPTOR_BINDING_STORAGE_BUFFER_UPDATE_AFTER_BIND_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("descriptorBindingStorageBufferUpdateAfterBind"));
		DESCRIPTOR_BINDING_UNIFORM_TEXEL_BUFFER_UPDATE_AFTER_BIND_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("descriptorBindingUniformTexelBufferUpdateAfterBind"));
		DESCRIPTOR_BINDING_STORAGE_TEXEL_BUFFER_UPDATE_AFTER_BIND_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("descriptorBindingStorageTexelBufferUpdateAfterBind"));
		DESCRIPTOR_BINDING_UPDATE_UNUSED_WHILE_PENDING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("descriptorBindingUpdateUnusedWhilePending"));
		DESCRIPTOR_BINDING_PARTIALLY_BOUND_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("descriptorBindingPartiallyBound"));
		DESCRIPTOR_BINDING_VARIABLE_DESCRIPTOR_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("descriptorBindingVariableDescriptorCount"));
		RUNTIME_DESCRIPTOR_ARRAY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("runtimeDescriptorArray"));
		SAMPLER_FILTER_MINMAX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("samplerFilterMinmax"));
		SCALAR_BLOCK_LAYOUT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("scalarBlockLayout"));
		IMAGELESS_FRAMEBUFFER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("imagelessFramebuffer"));
		UNIFORM_BUFFER_STANDARD_LAYOUT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("uniformBufferStandardLayout"));
		SHADER_SUBGROUP_EXTENDED_TYPES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderSubgroupExtendedTypes"));
		SEPARATE_DEPTH_STENCIL_LAYOUTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("separateDepthStencilLayouts"));
		HOST_QUERY_RESET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("hostQueryReset"));
		TIMELINE_SEMAPHORE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("timelineSemaphore"));
		BUFFER_DEVICE_ADDRESS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("bufferDeviceAddress"));
		BUFFER_DEVICE_ADDRESS_CAPTURE_REPLAY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("bufferDeviceAddressCaptureReplay"));
		BUFFER_DEVICE_ADDRESS_MULTI_DEVICE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("bufferDeviceAddressMultiDevice"));
		VULKAN_MEMORY_MODEL_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vulkanMemoryModel"));
		VULKAN_MEMORY_MODEL_DEVICE_SCOPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vulkanMemoryModelDeviceScope"));
		VULKAN_MEMORY_MODEL_AVAILABILITY_VISIBILITY_CHAINS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vulkanMemoryModelAvailabilityVisibilityChains"));
		SHADER_OUTPUT_VIEWPORT_INDEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderOutputViewportIndex"));
		SHADER_OUTPUT_LAYER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderOutputLayer"));
		SUBGROUP_BROADCAST_DYNAMIC_ID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("subgroupBroadcastDynamicId"));
		//@formatter:on
	}

	public VkPhysicalDeviceVulkan12Features() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceVulkan12Features(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceVulkan12Features(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceVulkan12Features sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceVulkan12Features pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #samplerMirrorClampToEdge()
    public VkPhysicalDeviceVulkan12Features samplerMirrorClampToEdge(int samplerMirrorClampToEdge) {
    	SAMPLER_MIRROR_CLAMP_TO_EDGE_HANDLE.set(segment, 0L, samplerMirrorClampToEdge);
    	return this;
    }
    
    public int samplerMirrorClampToEdge() {
    	return (int) SAMPLER_MIRROR_CLAMP_TO_EDGE_HANDLE.get(segment, 0L);
    }
    
    /// @see #drawIndirectCount()
    public VkPhysicalDeviceVulkan12Features drawIndirectCount(int drawIndirectCount) {
    	DRAW_INDIRECT_COUNT_HANDLE.set(segment, 0L, drawIndirectCount);
    	return this;
    }
    
    public int drawIndirectCount() {
    	return (int) DRAW_INDIRECT_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #storageBuffer8BitAccess()
    public VkPhysicalDeviceVulkan12Features storageBuffer8BitAccess(int storageBuffer8BitAccess) {
    	STORAGE_BUFFER8_BIT_ACCESS_HANDLE.set(segment, 0L, storageBuffer8BitAccess);
    	return this;
    }
    
    public int storageBuffer8BitAccess() {
    	return (int) STORAGE_BUFFER8_BIT_ACCESS_HANDLE.get(segment, 0L);
    }
    
    /// @see #uniformAndStorageBuffer8BitAccess()
    public VkPhysicalDeviceVulkan12Features uniformAndStorageBuffer8BitAccess(int uniformAndStorageBuffer8BitAccess) {
    	UNIFORM_AND_STORAGE_BUFFER8_BIT_ACCESS_HANDLE.set(segment, 0L, uniformAndStorageBuffer8BitAccess);
    	return this;
    }
    
    public int uniformAndStorageBuffer8BitAccess() {
    	return (int) UNIFORM_AND_STORAGE_BUFFER8_BIT_ACCESS_HANDLE.get(segment, 0L);
    }
    
    /// @see #storagePushConstant8()
    public VkPhysicalDeviceVulkan12Features storagePushConstant8(int storagePushConstant8) {
    	STORAGE_PUSH_CONSTANT8_HANDLE.set(segment, 0L, storagePushConstant8);
    	return this;
    }
    
    public int storagePushConstant8() {
    	return (int) STORAGE_PUSH_CONSTANT8_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderBufferInt64Atomics()
    public VkPhysicalDeviceVulkan12Features shaderBufferInt64Atomics(int shaderBufferInt64Atomics) {
    	SHADER_BUFFER_INT64_ATOMICS_HANDLE.set(segment, 0L, shaderBufferInt64Atomics);
    	return this;
    }
    
    public int shaderBufferInt64Atomics() {
    	return (int) SHADER_BUFFER_INT64_ATOMICS_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderSharedInt64Atomics()
    public VkPhysicalDeviceVulkan12Features shaderSharedInt64Atomics(int shaderSharedInt64Atomics) {
    	SHADER_SHARED_INT64_ATOMICS_HANDLE.set(segment, 0L, shaderSharedInt64Atomics);
    	return this;
    }
    
    public int shaderSharedInt64Atomics() {
    	return (int) SHADER_SHARED_INT64_ATOMICS_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderFloat16()
    public VkPhysicalDeviceVulkan12Features shaderFloat16(int shaderFloat16) {
    	SHADER_FLOAT16_HANDLE.set(segment, 0L, shaderFloat16);
    	return this;
    }
    
    public int shaderFloat16() {
    	return (int) SHADER_FLOAT16_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderInt8()
    public VkPhysicalDeviceVulkan12Features shaderInt8(int shaderInt8) {
    	SHADER_INT8_HANDLE.set(segment, 0L, shaderInt8);
    	return this;
    }
    
    public int shaderInt8() {
    	return (int) SHADER_INT8_HANDLE.get(segment, 0L);
    }
    
    /// @see #descriptorIndexing()
    public VkPhysicalDeviceVulkan12Features descriptorIndexing(int descriptorIndexing) {
    	DESCRIPTOR_INDEXING_HANDLE.set(segment, 0L, descriptorIndexing);
    	return this;
    }
    
    public int descriptorIndexing() {
    	return (int) DESCRIPTOR_INDEXING_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderInputAttachmentArrayDynamicIndexing()
    public VkPhysicalDeviceVulkan12Features shaderInputAttachmentArrayDynamicIndexing(int shaderInputAttachmentArrayDynamicIndexing) {
    	SHADER_INPUT_ATTACHMENT_ARRAY_DYNAMIC_INDEXING_HANDLE.set(segment, 0L, shaderInputAttachmentArrayDynamicIndexing);
    	return this;
    }
    
    public int shaderInputAttachmentArrayDynamicIndexing() {
    	return (int) SHADER_INPUT_ATTACHMENT_ARRAY_DYNAMIC_INDEXING_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderUniformTexelBufferArrayDynamicIndexing()
    public VkPhysicalDeviceVulkan12Features shaderUniformTexelBufferArrayDynamicIndexing(int shaderUniformTexelBufferArrayDynamicIndexing) {
    	SHADER_UNIFORM_TEXEL_BUFFER_ARRAY_DYNAMIC_INDEXING_HANDLE.set(segment, 0L, shaderUniformTexelBufferArrayDynamicIndexing);
    	return this;
    }
    
    public int shaderUniformTexelBufferArrayDynamicIndexing() {
    	return (int) SHADER_UNIFORM_TEXEL_BUFFER_ARRAY_DYNAMIC_INDEXING_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderStorageTexelBufferArrayDynamicIndexing()
    public VkPhysicalDeviceVulkan12Features shaderStorageTexelBufferArrayDynamicIndexing(int shaderStorageTexelBufferArrayDynamicIndexing) {
    	SHADER_STORAGE_TEXEL_BUFFER_ARRAY_DYNAMIC_INDEXING_HANDLE.set(segment, 0L, shaderStorageTexelBufferArrayDynamicIndexing);
    	return this;
    }
    
    public int shaderStorageTexelBufferArrayDynamicIndexing() {
    	return (int) SHADER_STORAGE_TEXEL_BUFFER_ARRAY_DYNAMIC_INDEXING_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderUniformBufferArrayNonUniformIndexing()
    public VkPhysicalDeviceVulkan12Features shaderUniformBufferArrayNonUniformIndexing(int shaderUniformBufferArrayNonUniformIndexing) {
    	SHADER_UNIFORM_BUFFER_ARRAY_NON_UNIFORM_INDEXING_HANDLE.set(segment, 0L, shaderUniformBufferArrayNonUniformIndexing);
    	return this;
    }
    
    public int shaderUniformBufferArrayNonUniformIndexing() {
    	return (int) SHADER_UNIFORM_BUFFER_ARRAY_NON_UNIFORM_INDEXING_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderSampledImageArrayNonUniformIndexing()
    public VkPhysicalDeviceVulkan12Features shaderSampledImageArrayNonUniformIndexing(int shaderSampledImageArrayNonUniformIndexing) {
    	SHADER_SAMPLED_IMAGE_ARRAY_NON_UNIFORM_INDEXING_HANDLE.set(segment, 0L, shaderSampledImageArrayNonUniformIndexing);
    	return this;
    }
    
    public int shaderSampledImageArrayNonUniformIndexing() {
    	return (int) SHADER_SAMPLED_IMAGE_ARRAY_NON_UNIFORM_INDEXING_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderStorageBufferArrayNonUniformIndexing()
    public VkPhysicalDeviceVulkan12Features shaderStorageBufferArrayNonUniformIndexing(int shaderStorageBufferArrayNonUniformIndexing) {
    	SHADER_STORAGE_BUFFER_ARRAY_NON_UNIFORM_INDEXING_HANDLE.set(segment, 0L, shaderStorageBufferArrayNonUniformIndexing);
    	return this;
    }
    
    public int shaderStorageBufferArrayNonUniformIndexing() {
    	return (int) SHADER_STORAGE_BUFFER_ARRAY_NON_UNIFORM_INDEXING_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderStorageImageArrayNonUniformIndexing()
    public VkPhysicalDeviceVulkan12Features shaderStorageImageArrayNonUniformIndexing(int shaderStorageImageArrayNonUniformIndexing) {
    	SHADER_STORAGE_IMAGE_ARRAY_NON_UNIFORM_INDEXING_HANDLE.set(segment, 0L, shaderStorageImageArrayNonUniformIndexing);
    	return this;
    }
    
    public int shaderStorageImageArrayNonUniformIndexing() {
    	return (int) SHADER_STORAGE_IMAGE_ARRAY_NON_UNIFORM_INDEXING_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderInputAttachmentArrayNonUniformIndexing()
    public VkPhysicalDeviceVulkan12Features shaderInputAttachmentArrayNonUniformIndexing(int shaderInputAttachmentArrayNonUniformIndexing) {
    	SHADER_INPUT_ATTACHMENT_ARRAY_NON_UNIFORM_INDEXING_HANDLE.set(segment, 0L, shaderInputAttachmentArrayNonUniformIndexing);
    	return this;
    }
    
    public int shaderInputAttachmentArrayNonUniformIndexing() {
    	return (int) SHADER_INPUT_ATTACHMENT_ARRAY_NON_UNIFORM_INDEXING_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderUniformTexelBufferArrayNonUniformIndexing()
    public VkPhysicalDeviceVulkan12Features shaderUniformTexelBufferArrayNonUniformIndexing(int shaderUniformTexelBufferArrayNonUniformIndexing) {
    	SHADER_UNIFORM_TEXEL_BUFFER_ARRAY_NON_UNIFORM_INDEXING_HANDLE.set(segment, 0L, shaderUniformTexelBufferArrayNonUniformIndexing);
    	return this;
    }
    
    public int shaderUniformTexelBufferArrayNonUniformIndexing() {
    	return (int) SHADER_UNIFORM_TEXEL_BUFFER_ARRAY_NON_UNIFORM_INDEXING_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderStorageTexelBufferArrayNonUniformIndexing()
    public VkPhysicalDeviceVulkan12Features shaderStorageTexelBufferArrayNonUniformIndexing(int shaderStorageTexelBufferArrayNonUniformIndexing) {
    	SHADER_STORAGE_TEXEL_BUFFER_ARRAY_NON_UNIFORM_INDEXING_HANDLE.set(segment, 0L, shaderStorageTexelBufferArrayNonUniformIndexing);
    	return this;
    }
    
    public int shaderStorageTexelBufferArrayNonUniformIndexing() {
    	return (int) SHADER_STORAGE_TEXEL_BUFFER_ARRAY_NON_UNIFORM_INDEXING_HANDLE.get(segment, 0L);
    }
    
    /// @see #descriptorBindingUniformBufferUpdateAfterBind()
    public VkPhysicalDeviceVulkan12Features descriptorBindingUniformBufferUpdateAfterBind(int descriptorBindingUniformBufferUpdateAfterBind) {
    	DESCRIPTOR_BINDING_UNIFORM_BUFFER_UPDATE_AFTER_BIND_HANDLE.set(segment, 0L, descriptorBindingUniformBufferUpdateAfterBind);
    	return this;
    }
    
    public int descriptorBindingUniformBufferUpdateAfterBind() {
    	return (int) DESCRIPTOR_BINDING_UNIFORM_BUFFER_UPDATE_AFTER_BIND_HANDLE.get(segment, 0L);
    }
    
    /// @see #descriptorBindingSampledImageUpdateAfterBind()
    public VkPhysicalDeviceVulkan12Features descriptorBindingSampledImageUpdateAfterBind(int descriptorBindingSampledImageUpdateAfterBind) {
    	DESCRIPTOR_BINDING_SAMPLED_IMAGE_UPDATE_AFTER_BIND_HANDLE.set(segment, 0L, descriptorBindingSampledImageUpdateAfterBind);
    	return this;
    }
    
    public int descriptorBindingSampledImageUpdateAfterBind() {
    	return (int) DESCRIPTOR_BINDING_SAMPLED_IMAGE_UPDATE_AFTER_BIND_HANDLE.get(segment, 0L);
    }
    
    /// @see #descriptorBindingStorageImageUpdateAfterBind()
    public VkPhysicalDeviceVulkan12Features descriptorBindingStorageImageUpdateAfterBind(int descriptorBindingStorageImageUpdateAfterBind) {
    	DESCRIPTOR_BINDING_STORAGE_IMAGE_UPDATE_AFTER_BIND_HANDLE.set(segment, 0L, descriptorBindingStorageImageUpdateAfterBind);
    	return this;
    }
    
    public int descriptorBindingStorageImageUpdateAfterBind() {
    	return (int) DESCRIPTOR_BINDING_STORAGE_IMAGE_UPDATE_AFTER_BIND_HANDLE.get(segment, 0L);
    }
    
    /// @see #descriptorBindingStorageBufferUpdateAfterBind()
    public VkPhysicalDeviceVulkan12Features descriptorBindingStorageBufferUpdateAfterBind(int descriptorBindingStorageBufferUpdateAfterBind) {
    	DESCRIPTOR_BINDING_STORAGE_BUFFER_UPDATE_AFTER_BIND_HANDLE.set(segment, 0L, descriptorBindingStorageBufferUpdateAfterBind);
    	return this;
    }
    
    public int descriptorBindingStorageBufferUpdateAfterBind() {
    	return (int) DESCRIPTOR_BINDING_STORAGE_BUFFER_UPDATE_AFTER_BIND_HANDLE.get(segment, 0L);
    }
    
    /// @see #descriptorBindingUniformTexelBufferUpdateAfterBind()
    public VkPhysicalDeviceVulkan12Features descriptorBindingUniformTexelBufferUpdateAfterBind(int descriptorBindingUniformTexelBufferUpdateAfterBind) {
    	DESCRIPTOR_BINDING_UNIFORM_TEXEL_BUFFER_UPDATE_AFTER_BIND_HANDLE.set(segment, 0L, descriptorBindingUniformTexelBufferUpdateAfterBind);
    	return this;
    }
    
    public int descriptorBindingUniformTexelBufferUpdateAfterBind() {
    	return (int) DESCRIPTOR_BINDING_UNIFORM_TEXEL_BUFFER_UPDATE_AFTER_BIND_HANDLE.get(segment, 0L);
    }
    
    /// @see #descriptorBindingStorageTexelBufferUpdateAfterBind()
    public VkPhysicalDeviceVulkan12Features descriptorBindingStorageTexelBufferUpdateAfterBind(int descriptorBindingStorageTexelBufferUpdateAfterBind) {
    	DESCRIPTOR_BINDING_STORAGE_TEXEL_BUFFER_UPDATE_AFTER_BIND_HANDLE.set(segment, 0L, descriptorBindingStorageTexelBufferUpdateAfterBind);
    	return this;
    }
    
    public int descriptorBindingStorageTexelBufferUpdateAfterBind() {
    	return (int) DESCRIPTOR_BINDING_STORAGE_TEXEL_BUFFER_UPDATE_AFTER_BIND_HANDLE.get(segment, 0L);
    }
    
    /// @see #descriptorBindingUpdateUnusedWhilePending()
    public VkPhysicalDeviceVulkan12Features descriptorBindingUpdateUnusedWhilePending(int descriptorBindingUpdateUnusedWhilePending) {
    	DESCRIPTOR_BINDING_UPDATE_UNUSED_WHILE_PENDING_HANDLE.set(segment, 0L, descriptorBindingUpdateUnusedWhilePending);
    	return this;
    }
    
    public int descriptorBindingUpdateUnusedWhilePending() {
    	return (int) DESCRIPTOR_BINDING_UPDATE_UNUSED_WHILE_PENDING_HANDLE.get(segment, 0L);
    }
    
    /// @see #descriptorBindingPartiallyBound()
    public VkPhysicalDeviceVulkan12Features descriptorBindingPartiallyBound(int descriptorBindingPartiallyBound) {
    	DESCRIPTOR_BINDING_PARTIALLY_BOUND_HANDLE.set(segment, 0L, descriptorBindingPartiallyBound);
    	return this;
    }
    
    public int descriptorBindingPartiallyBound() {
    	return (int) DESCRIPTOR_BINDING_PARTIALLY_BOUND_HANDLE.get(segment, 0L);
    }
    
    /// @see #descriptorBindingVariableDescriptorCount()
    public VkPhysicalDeviceVulkan12Features descriptorBindingVariableDescriptorCount(int descriptorBindingVariableDescriptorCount) {
    	DESCRIPTOR_BINDING_VARIABLE_DESCRIPTOR_COUNT_HANDLE.set(segment, 0L, descriptorBindingVariableDescriptorCount);
    	return this;
    }
    
    public int descriptorBindingVariableDescriptorCount() {
    	return (int) DESCRIPTOR_BINDING_VARIABLE_DESCRIPTOR_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #runtimeDescriptorArray()
    public VkPhysicalDeviceVulkan12Features runtimeDescriptorArray(int runtimeDescriptorArray) {
    	RUNTIME_DESCRIPTOR_ARRAY_HANDLE.set(segment, 0L, runtimeDescriptorArray);
    	return this;
    }
    
    public int runtimeDescriptorArray() {
    	return (int) RUNTIME_DESCRIPTOR_ARRAY_HANDLE.get(segment, 0L);
    }
    
    /// @see #samplerFilterMinmax()
    public VkPhysicalDeviceVulkan12Features samplerFilterMinmax(int samplerFilterMinmax) {
    	SAMPLER_FILTER_MINMAX_HANDLE.set(segment, 0L, samplerFilterMinmax);
    	return this;
    }
    
    public int samplerFilterMinmax() {
    	return (int) SAMPLER_FILTER_MINMAX_HANDLE.get(segment, 0L);
    }
    
    /// @see #scalarBlockLayout()
    public VkPhysicalDeviceVulkan12Features scalarBlockLayout(int scalarBlockLayout) {
    	SCALAR_BLOCK_LAYOUT_HANDLE.set(segment, 0L, scalarBlockLayout);
    	return this;
    }
    
    public int scalarBlockLayout() {
    	return (int) SCALAR_BLOCK_LAYOUT_HANDLE.get(segment, 0L);
    }
    
    /// @see #imagelessFramebuffer()
    public VkPhysicalDeviceVulkan12Features imagelessFramebuffer(int imagelessFramebuffer) {
    	IMAGELESS_FRAMEBUFFER_HANDLE.set(segment, 0L, imagelessFramebuffer);
    	return this;
    }
    
    public int imagelessFramebuffer() {
    	return (int) IMAGELESS_FRAMEBUFFER_HANDLE.get(segment, 0L);
    }
    
    /// @see #uniformBufferStandardLayout()
    public VkPhysicalDeviceVulkan12Features uniformBufferStandardLayout(int uniformBufferStandardLayout) {
    	UNIFORM_BUFFER_STANDARD_LAYOUT_HANDLE.set(segment, 0L, uniformBufferStandardLayout);
    	return this;
    }
    
    public int uniformBufferStandardLayout() {
    	return (int) UNIFORM_BUFFER_STANDARD_LAYOUT_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderSubgroupExtendedTypes()
    public VkPhysicalDeviceVulkan12Features shaderSubgroupExtendedTypes(int shaderSubgroupExtendedTypes) {
    	SHADER_SUBGROUP_EXTENDED_TYPES_HANDLE.set(segment, 0L, shaderSubgroupExtendedTypes);
    	return this;
    }
    
    public int shaderSubgroupExtendedTypes() {
    	return (int) SHADER_SUBGROUP_EXTENDED_TYPES_HANDLE.get(segment, 0L);
    }
    
    /// @see #separateDepthStencilLayouts()
    public VkPhysicalDeviceVulkan12Features separateDepthStencilLayouts(int separateDepthStencilLayouts) {
    	SEPARATE_DEPTH_STENCIL_LAYOUTS_HANDLE.set(segment, 0L, separateDepthStencilLayouts);
    	return this;
    }
    
    public int separateDepthStencilLayouts() {
    	return (int) SEPARATE_DEPTH_STENCIL_LAYOUTS_HANDLE.get(segment, 0L);
    }
    
    /// @see #hostQueryReset()
    public VkPhysicalDeviceVulkan12Features hostQueryReset(int hostQueryReset) {
    	HOST_QUERY_RESET_HANDLE.set(segment, 0L, hostQueryReset);
    	return this;
    }
    
    public int hostQueryReset() {
    	return (int) HOST_QUERY_RESET_HANDLE.get(segment, 0L);
    }
    
    /// @see #timelineSemaphore()
    public VkPhysicalDeviceVulkan12Features timelineSemaphore(int timelineSemaphore) {
    	TIMELINE_SEMAPHORE_HANDLE.set(segment, 0L, timelineSemaphore);
    	return this;
    }
    
    public int timelineSemaphore() {
    	return (int) TIMELINE_SEMAPHORE_HANDLE.get(segment, 0L);
    }
    
    /// @see #bufferDeviceAddress()
    public VkPhysicalDeviceVulkan12Features bufferDeviceAddress(int bufferDeviceAddress) {
    	BUFFER_DEVICE_ADDRESS_HANDLE.set(segment, 0L, bufferDeviceAddress);
    	return this;
    }
    
    public int bufferDeviceAddress() {
    	return (int) BUFFER_DEVICE_ADDRESS_HANDLE.get(segment, 0L);
    }
    
    /// @see #bufferDeviceAddressCaptureReplay()
    public VkPhysicalDeviceVulkan12Features bufferDeviceAddressCaptureReplay(int bufferDeviceAddressCaptureReplay) {
    	BUFFER_DEVICE_ADDRESS_CAPTURE_REPLAY_HANDLE.set(segment, 0L, bufferDeviceAddressCaptureReplay);
    	return this;
    }
    
    public int bufferDeviceAddressCaptureReplay() {
    	return (int) BUFFER_DEVICE_ADDRESS_CAPTURE_REPLAY_HANDLE.get(segment, 0L);
    }
    
    /// @see #bufferDeviceAddressMultiDevice()
    public VkPhysicalDeviceVulkan12Features bufferDeviceAddressMultiDevice(int bufferDeviceAddressMultiDevice) {
    	BUFFER_DEVICE_ADDRESS_MULTI_DEVICE_HANDLE.set(segment, 0L, bufferDeviceAddressMultiDevice);
    	return this;
    }
    
    public int bufferDeviceAddressMultiDevice() {
    	return (int) BUFFER_DEVICE_ADDRESS_MULTI_DEVICE_HANDLE.get(segment, 0L);
    }
    
    /// @see #vulkanMemoryModel()
    public VkPhysicalDeviceVulkan12Features vulkanMemoryModel(int vulkanMemoryModel) {
    	VULKAN_MEMORY_MODEL_HANDLE.set(segment, 0L, vulkanMemoryModel);
    	return this;
    }
    
    public int vulkanMemoryModel() {
    	return (int) VULKAN_MEMORY_MODEL_HANDLE.get(segment, 0L);
    }
    
    /// @see #vulkanMemoryModelDeviceScope()
    public VkPhysicalDeviceVulkan12Features vulkanMemoryModelDeviceScope(int vulkanMemoryModelDeviceScope) {
    	VULKAN_MEMORY_MODEL_DEVICE_SCOPE_HANDLE.set(segment, 0L, vulkanMemoryModelDeviceScope);
    	return this;
    }
    
    public int vulkanMemoryModelDeviceScope() {
    	return (int) VULKAN_MEMORY_MODEL_DEVICE_SCOPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #vulkanMemoryModelAvailabilityVisibilityChains()
    public VkPhysicalDeviceVulkan12Features vulkanMemoryModelAvailabilityVisibilityChains(int vulkanMemoryModelAvailabilityVisibilityChains) {
    	VULKAN_MEMORY_MODEL_AVAILABILITY_VISIBILITY_CHAINS_HANDLE.set(segment, 0L, vulkanMemoryModelAvailabilityVisibilityChains);
    	return this;
    }
    
    public int vulkanMemoryModelAvailabilityVisibilityChains() {
    	return (int) VULKAN_MEMORY_MODEL_AVAILABILITY_VISIBILITY_CHAINS_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderOutputViewportIndex()
    public VkPhysicalDeviceVulkan12Features shaderOutputViewportIndex(int shaderOutputViewportIndex) {
    	SHADER_OUTPUT_VIEWPORT_INDEX_HANDLE.set(segment, 0L, shaderOutputViewportIndex);
    	return this;
    }
    
    public int shaderOutputViewportIndex() {
    	return (int) SHADER_OUTPUT_VIEWPORT_INDEX_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderOutputLayer()
    public VkPhysicalDeviceVulkan12Features shaderOutputLayer(int shaderOutputLayer) {
    	SHADER_OUTPUT_LAYER_HANDLE.set(segment, 0L, shaderOutputLayer);
    	return this;
    }
    
    public int shaderOutputLayer() {
    	return (int) SHADER_OUTPUT_LAYER_HANDLE.get(segment, 0L);
    }
    
    /// @see #subgroupBroadcastDynamicId()
    public VkPhysicalDeviceVulkan12Features subgroupBroadcastDynamicId(int subgroupBroadcastDynamicId) {
    	SUBGROUP_BROADCAST_DYNAMIC_ID_HANDLE.set(segment, 0L, subgroupBroadcastDynamicId);
    	return this;
    }
    
    public int subgroupBroadcastDynamicId() {
    	return (int) SUBGROUP_BROADCAST_DYNAMIC_ID_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceVulkan12Features set(VkPhysicalDeviceVulkan12Features other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceVulkan12Features set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceVulkan12Features> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceVulkan12Features> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceVulkan12Features(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceVulkan12Features> array(SegmentAllocator allocator, VkPhysicalDeviceVulkan12Features... structs) {
        NativeStructArray<VkPhysicalDeviceVulkan12Features> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceVulkan12Features(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceVulkan12Features> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceVulkan12Features(segment)
        );
    }

}