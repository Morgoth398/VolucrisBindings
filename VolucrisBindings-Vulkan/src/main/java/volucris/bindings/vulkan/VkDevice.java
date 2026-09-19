/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan;

import java.lang.foreign.Arena;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.Linker;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkDevice {

    private final LazyConstant<MethodHandle> VK_GET_DEVICE_PROC_ADDR;
    private final LazyConstant<MethodHandle> VK_DESTROY_DEVICE;
    private final LazyConstant<MethodHandle> VK_GET_DEVICE_QUEUE;
    private final LazyConstant<MethodHandle> VK_QUEUE_SUBMIT;
    private final LazyConstant<MethodHandle> VK_QUEUE_WAIT_IDLE;
    private final LazyConstant<MethodHandle> VK_DEVICE_WAIT_IDLE;
    private final LazyConstant<MethodHandle> VK_ALLOCATE_MEMORY;
    private final LazyConstant<MethodHandle> VK_FREE_MEMORY;
    private final LazyConstant<MethodHandle> VK_MAP_MEMORY;
    private final LazyConstant<MethodHandle> VK_UNMAP_MEMORY;
    private final LazyConstant<MethodHandle> VK_FLUSH_MAPPED_MEMORY_RANGES;
    private final LazyConstant<MethodHandle> VK_INVALIDATE_MAPPED_MEMORY_RANGES;
    private final LazyConstant<MethodHandle> VK_GET_DEVICE_MEMORY_COMMITMENT;
    private final LazyConstant<MethodHandle> VK_BIND_BUFFER_MEMORY;
    private final LazyConstant<MethodHandle> VK_BIND_IMAGE_MEMORY;
    private final LazyConstant<MethodHandle> VK_GET_BUFFER_MEMORY_REQUIREMENTS;
    private final LazyConstant<MethodHandle> VK_GET_IMAGE_MEMORY_REQUIREMENTS;
    private final LazyConstant<MethodHandle> VK_GET_IMAGE_SPARSE_MEMORY_REQUIREMENTS;
    private final LazyConstant<MethodHandle> VK_QUEUE_BIND_SPARSE;
    private final LazyConstant<MethodHandle> VK_CREATE_FENCE;
    private final LazyConstant<MethodHandle> VK_DESTROY_FENCE;
    private final LazyConstant<MethodHandle> VK_RESET_FENCES;
    private final LazyConstant<MethodHandle> VK_GET_FENCE_STATUS;
    private final LazyConstant<MethodHandle> VK_WAIT_FOR_FENCES;
    private final LazyConstant<MethodHandle> VK_CREATE_SEMAPHORE;
    private final LazyConstant<MethodHandle> VK_DESTROY_SEMAPHORE;
    private final LazyConstant<MethodHandle> VK_CREATE_QUERY_POOL;
    private final LazyConstant<MethodHandle> VK_DESTROY_QUERY_POOL;
    private final LazyConstant<MethodHandle> VK_GET_QUERY_POOL_RESULTS;
    private final LazyConstant<MethodHandle> VK_CREATE_BUFFER;
    private final LazyConstant<MethodHandle> VK_DESTROY_BUFFER;
    private final LazyConstant<MethodHandle> VK_CREATE_IMAGE;
    private final LazyConstant<MethodHandle> VK_DESTROY_IMAGE;
    private final LazyConstant<MethodHandle> VK_GET_IMAGE_SUBRESOURCE_LAYOUT;
    private final LazyConstant<MethodHandle> VK_CREATE_IMAGE_VIEW;
    private final LazyConstant<MethodHandle> VK_DESTROY_IMAGE_VIEW;
    private final LazyConstant<MethodHandle> VK_CREATE_COMMAND_POOL;
    private final LazyConstant<MethodHandle> VK_DESTROY_COMMAND_POOL;
    private final LazyConstant<MethodHandle> VK_RESET_COMMAND_POOL;
    private final LazyConstant<MethodHandle> VK_ALLOCATE_COMMAND_BUFFERS;
    private final LazyConstant<MethodHandle> VK_FREE_COMMAND_BUFFERS;
    private final LazyConstant<MethodHandle> VK_BEGIN_COMMAND_BUFFER;
    private final LazyConstant<MethodHandle> VK_END_COMMAND_BUFFER;
    private final LazyConstant<MethodHandle> VK_RESET_COMMAND_BUFFER;
    private final LazyConstant<MethodHandle> VK_CMD_COPY_BUFFER;
    private final LazyConstant<MethodHandle> VK_CMD_COPY_IMAGE;
    private final LazyConstant<MethodHandle> VK_CMD_COPY_BUFFER_TO_IMAGE;
    private final LazyConstant<MethodHandle> VK_CMD_COPY_IMAGE_TO_BUFFER;
    private final LazyConstant<MethodHandle> VK_CMD_UPDATE_BUFFER;
    private final LazyConstant<MethodHandle> VK_CMD_FILL_BUFFER;
    private final LazyConstant<MethodHandle> VK_CMD_PIPELINE_BARRIER;
    private final LazyConstant<MethodHandle> VK_CMD_BEGIN_QUERY;
    private final LazyConstant<MethodHandle> VK_CMD_END_QUERY;
    private final LazyConstant<MethodHandle> VK_CMD_RESET_QUERY_POOL;
    private final LazyConstant<MethodHandle> VK_CMD_WRITE_TIMESTAMP;
    private final LazyConstant<MethodHandle> VK_CMD_COPY_QUERY_POOL_RESULTS;
    private final LazyConstant<MethodHandle> VK_CMD_EXECUTE_COMMANDS;
    private final LazyConstant<MethodHandle> VK_CREATE_EVENT;
    private final LazyConstant<MethodHandle> VK_DESTROY_EVENT;
    private final LazyConstant<MethodHandle> VK_GET_EVENT_STATUS;
    private final LazyConstant<MethodHandle> VK_SET_EVENT;
    private final LazyConstant<MethodHandle> VK_RESET_EVENT;
    private final LazyConstant<MethodHandle> VK_CREATE_BUFFER_VIEW;
    private final LazyConstant<MethodHandle> VK_DESTROY_BUFFER_VIEW;
    private final LazyConstant<MethodHandle> VK_CREATE_SHADER_MODULE;
    private final LazyConstant<MethodHandle> VK_DESTROY_SHADER_MODULE;
    private final LazyConstant<MethodHandle> VK_CREATE_PIPELINE_CACHE;
    private final LazyConstant<MethodHandle> VK_DESTROY_PIPELINE_CACHE;
    private final LazyConstant<MethodHandle> VK_GET_PIPELINE_CACHE_DATA;
    private final LazyConstant<MethodHandle> VK_MERGE_PIPELINE_CACHES;
    private final LazyConstant<MethodHandle> VK_CREATE_COMPUTE_PIPELINES;
    private final LazyConstant<MethodHandle> VK_DESTROY_PIPELINE;
    private final LazyConstant<MethodHandle> VK_CREATE_PIPELINE_LAYOUT;
    private final LazyConstant<MethodHandle> VK_DESTROY_PIPELINE_LAYOUT;
    private final LazyConstant<MethodHandle> VK_CREATE_SAMPLER;
    private final LazyConstant<MethodHandle> VK_DESTROY_SAMPLER;
    private final LazyConstant<MethodHandle> VK_CREATE_DESCRIPTOR_SET_LAYOUT;
    private final LazyConstant<MethodHandle> VK_DESTROY_DESCRIPTOR_SET_LAYOUT;
    private final LazyConstant<MethodHandle> VK_CREATE_DESCRIPTOR_POOL;
    private final LazyConstant<MethodHandle> VK_DESTROY_DESCRIPTOR_POOL;
    private final LazyConstant<MethodHandle> VK_RESET_DESCRIPTOR_POOL;
    private final LazyConstant<MethodHandle> VK_ALLOCATE_DESCRIPTOR_SETS;
    private final LazyConstant<MethodHandle> VK_FREE_DESCRIPTOR_SETS;
    private final LazyConstant<MethodHandle> VK_UPDATE_DESCRIPTOR_SETS;
    private final LazyConstant<MethodHandle> VK_CMD_BIND_PIPELINE;
    private final LazyConstant<MethodHandle> VK_CMD_BIND_DESCRIPTOR_SETS;
    private final LazyConstant<MethodHandle> VK_CMD_CLEAR_COLOR_IMAGE;
    private final LazyConstant<MethodHandle> VK_CMD_DISPATCH;
    private final LazyConstant<MethodHandle> VK_CMD_DISPATCH_INDIRECT;
    private final LazyConstant<MethodHandle> VK_CMD_SET_EVENT;
    private final LazyConstant<MethodHandle> VK_CMD_RESET_EVENT;
    private final LazyConstant<MethodHandle> VK_CMD_WAIT_EVENTS;
    private final LazyConstant<MethodHandle> VK_CMD_PUSH_CONSTANTS;
    private final LazyConstant<MethodHandle> VK_CREATE_GRAPHICS_PIPELINES;
    private final LazyConstant<MethodHandle> VK_CREATE_FRAMEBUFFER;
    private final LazyConstant<MethodHandle> VK_DESTROY_FRAMEBUFFER;
    private final LazyConstant<MethodHandle> VK_CREATE_RENDER_PASS;
    private final LazyConstant<MethodHandle> VK_DESTROY_RENDER_PASS;
    private final LazyConstant<MethodHandle> VK_GET_RENDER_AREA_GRANULARITY;
    private final LazyConstant<MethodHandle> VK_CMD_SET_VIEWPORT;
    private final LazyConstant<MethodHandle> VK_CMD_SET_SCISSOR;
    private final LazyConstant<MethodHandle> VK_CMD_SET_LINE_WIDTH;
    private final LazyConstant<MethodHandle> VK_CMD_SET_DEPTH_BIAS;
    private final LazyConstant<MethodHandle> VK_CMD_SET_BLEND_CONSTANTS;
    private final LazyConstant<MethodHandle> VK_CMD_SET_DEPTH_BOUNDS;
    private final LazyConstant<MethodHandle> VK_CMD_SET_STENCIL_COMPARE_MASK;
    private final LazyConstant<MethodHandle> VK_CMD_SET_STENCIL_WRITE_MASK;
    private final LazyConstant<MethodHandle> VK_CMD_SET_STENCIL_REFERENCE;
    private final LazyConstant<MethodHandle> VK_CMD_BIND_INDEX_BUFFER;
    private final LazyConstant<MethodHandle> VK_CMD_BIND_VERTEX_BUFFERS;
    private final LazyConstant<MethodHandle> VK_CMD_DRAW;
    private final LazyConstant<MethodHandle> VK_CMD_DRAW_INDEXED;
    private final LazyConstant<MethodHandle> VK_CMD_DRAW_INDIRECT;
    private final LazyConstant<MethodHandle> VK_CMD_DRAW_INDEXED_INDIRECT;
    private final LazyConstant<MethodHandle> VK_CMD_BLIT_IMAGE;
    private final LazyConstant<MethodHandle> VK_CMD_CLEAR_DEPTH_STENCIL_IMAGE;
    private final LazyConstant<MethodHandle> VK_CMD_CLEAR_ATTACHMENTS;
    private final LazyConstant<MethodHandle> VK_CMD_RESOLVE_IMAGE;
    private final LazyConstant<MethodHandle> VK_CMD_BEGIN_RENDER_PASS;
    private final LazyConstant<MethodHandle> VK_CMD_NEXT_SUBPASS;
    private final LazyConstant<MethodHandle> VK_CMD_END_RENDER_PASS;
    private final LazyConstant<MethodHandle> VK_BIND_BUFFER_MEMORY2;
    private final LazyConstant<MethodHandle> VK_BIND_IMAGE_MEMORY2;
    private final LazyConstant<MethodHandle> VK_GET_DEVICE_GROUP_PEER_MEMORY_FEATURES;
    private final LazyConstant<MethodHandle> VK_CMD_SET_DEVICE_MASK;
    private final LazyConstant<MethodHandle> VK_GET_IMAGE_MEMORY_REQUIREMENTS2;
    private final LazyConstant<MethodHandle> VK_GET_BUFFER_MEMORY_REQUIREMENTS2;
    private final LazyConstant<MethodHandle> VK_GET_IMAGE_SPARSE_MEMORY_REQUIREMENTS2;
    private final LazyConstant<MethodHandle> VK_TRIM_COMMAND_POOL;
    private final LazyConstant<MethodHandle> VK_GET_DEVICE_QUEUE2;
    private final LazyConstant<MethodHandle> VK_CMD_DISPATCH_BASE;
    private final LazyConstant<MethodHandle> VK_CREATE_DESCRIPTOR_UPDATE_TEMPLATE;
    private final LazyConstant<MethodHandle> VK_DESTROY_DESCRIPTOR_UPDATE_TEMPLATE;
    private final LazyConstant<MethodHandle> VK_UPDATE_DESCRIPTOR_SET_WITH_TEMPLATE;
    private final LazyConstant<MethodHandle> VK_GET_DESCRIPTOR_SET_LAYOUT_SUPPORT;
    private final LazyConstant<MethodHandle> VK_CREATE_SAMPLER_YCBCR_CONVERSION;
    private final LazyConstant<MethodHandle> VK_DESTROY_SAMPLER_YCBCR_CONVERSION;
    private final LazyConstant<MethodHandle> VK_RESET_QUERY_POOL;
    private final LazyConstant<MethodHandle> VK_GET_SEMAPHORE_COUNTER_VALUE;
    private final LazyConstant<MethodHandle> VK_WAIT_SEMAPHORES;
    private final LazyConstant<MethodHandle> VK_SIGNAL_SEMAPHORE;
    private final LazyConstant<MethodHandle> VK_GET_BUFFER_DEVICE_ADDRESS;
    private final LazyConstant<MethodHandle> VK_GET_BUFFER_OPAQUE_CAPTURE_ADDRESS;
    private final LazyConstant<MethodHandle> VK_GET_DEVICE_MEMORY_OPAQUE_CAPTURE_ADDRESS;
    private final LazyConstant<MethodHandle> VK_CMD_DRAW_INDIRECT_COUNT;
    private final LazyConstant<MethodHandle> VK_CMD_DRAW_INDEXED_INDIRECT_COUNT;
    private final LazyConstant<MethodHandle> VK_CREATE_RENDER_PASS2;
    private final LazyConstant<MethodHandle> VK_CMD_BEGIN_RENDER_PASS2;
    private final LazyConstant<MethodHandle> VK_CMD_NEXT_SUBPASS2;
    private final LazyConstant<MethodHandle> VK_CMD_END_RENDER_PASS2;
    private final LazyConstant<MethodHandle> VK_CREATE_PRIVATE_DATA_SLOT;
    private final LazyConstant<MethodHandle> VK_DESTROY_PRIVATE_DATA_SLOT;
    private final LazyConstant<MethodHandle> VK_SET_PRIVATE_DATA;
    private final LazyConstant<MethodHandle> VK_GET_PRIVATE_DATA;
    private final LazyConstant<MethodHandle> VK_CMD_PIPELINE_BARRIER2;
    private final LazyConstant<MethodHandle> VK_CMD_WRITE_TIMESTAMP2;
    private final LazyConstant<MethodHandle> VK_QUEUE_SUBMIT2;
    private final LazyConstant<MethodHandle> VK_CMD_COPY_BUFFER2;
    private final LazyConstant<MethodHandle> VK_CMD_COPY_IMAGE2;
    private final LazyConstant<MethodHandle> VK_CMD_COPY_BUFFER_TO_IMAGE2;
    private final LazyConstant<MethodHandle> VK_CMD_COPY_IMAGE_TO_BUFFER2;
    private final LazyConstant<MethodHandle> VK_GET_DEVICE_BUFFER_MEMORY_REQUIREMENTS;
    private final LazyConstant<MethodHandle> VK_GET_DEVICE_IMAGE_MEMORY_REQUIREMENTS;
    private final LazyConstant<MethodHandle> VK_GET_DEVICE_IMAGE_SPARSE_MEMORY_REQUIREMENTS;
    private final LazyConstant<MethodHandle> VK_CMD_SET_EVENT2;
    private final LazyConstant<MethodHandle> VK_CMD_RESET_EVENT2;
    private final LazyConstant<MethodHandle> VK_CMD_WAIT_EVENTS2;
    private final LazyConstant<MethodHandle> VK_CMD_BLIT_IMAGE2;
    private final LazyConstant<MethodHandle> VK_CMD_RESOLVE_IMAGE2;
    private final LazyConstant<MethodHandle> VK_CMD_BEGIN_RENDERING;
    private final LazyConstant<MethodHandle> VK_CMD_END_RENDERING;
    private final LazyConstant<MethodHandle> VK_CMD_SET_CULL_MODE;
    private final LazyConstant<MethodHandle> VK_CMD_SET_FRONT_FACE;
    private final LazyConstant<MethodHandle> VK_CMD_SET_PRIMITIVE_TOPOLOGY;
    private final LazyConstant<MethodHandle> VK_CMD_SET_VIEWPORT_WITH_COUNT;
    private final LazyConstant<MethodHandle> VK_CMD_SET_SCISSOR_WITH_COUNT;
    private final LazyConstant<MethodHandle> VK_CMD_BIND_VERTEX_BUFFERS2;
    private final LazyConstant<MethodHandle> VK_CMD_SET_DEPTH_TEST_ENABLE;
    private final LazyConstant<MethodHandle> VK_CMD_SET_DEPTH_WRITE_ENABLE;
    private final LazyConstant<MethodHandle> VK_CMD_SET_DEPTH_COMPARE_OP;
    private final LazyConstant<MethodHandle> VK_CMD_SET_DEPTH_BOUNDS_TEST_ENABLE;
    private final LazyConstant<MethodHandle> VK_CMD_SET_STENCIL_TEST_ENABLE;
    private final LazyConstant<MethodHandle> VK_CMD_SET_STENCIL_OP;
    private final LazyConstant<MethodHandle> VK_CMD_SET_RASTERIZER_DISCARD_ENABLE;
    private final LazyConstant<MethodHandle> VK_CMD_SET_DEPTH_BIAS_ENABLE;
    private final LazyConstant<MethodHandle> VK_CMD_SET_PRIMITIVE_RESTART_ENABLE;
    private final LazyConstant<MethodHandle> VK_MAP_MEMORY2;
    private final LazyConstant<MethodHandle> VK_UNMAP_MEMORY2;
    private final LazyConstant<MethodHandle> VK_GET_DEVICE_IMAGE_SUBRESOURCE_LAYOUT;
    private final LazyConstant<MethodHandle> VK_GET_IMAGE_SUBRESOURCE_LAYOUT2;
    private final LazyConstant<MethodHandle> VK_COPY_MEMORY_TO_IMAGE;
    private final LazyConstant<MethodHandle> VK_COPY_IMAGE_TO_MEMORY;
    private final LazyConstant<MethodHandle> VK_COPY_IMAGE_TO_IMAGE;
    private final LazyConstant<MethodHandle> VK_TRANSITION_IMAGE_LAYOUT;
    private final LazyConstant<MethodHandle> VK_CMD_PUSH_DESCRIPTOR_SET;
    private final LazyConstant<MethodHandle> VK_CMD_PUSH_DESCRIPTOR_SET_WITH_TEMPLATE;
    private final LazyConstant<MethodHandle> VK_CMD_BIND_DESCRIPTOR_SETS2;
    private final LazyConstant<MethodHandle> VK_CMD_PUSH_CONSTANTS2;
    private final LazyConstant<MethodHandle> VK_CMD_PUSH_DESCRIPTOR_SET2;
    private final LazyConstant<MethodHandle> VK_CMD_PUSH_DESCRIPTOR_SET_WITH_TEMPLATE2;
    private final LazyConstant<MethodHandle> VK_CMD_SET_LINE_STIPPLE;
    private final LazyConstant<MethodHandle> VK_CMD_BIND_INDEX_BUFFER2;
    private final LazyConstant<MethodHandle> VK_GET_RENDERING_AREA_GRANULARITY;
    private final LazyConstant<MethodHandle> VK_CMD_SET_RENDERING_ATTACHMENT_LOCATIONS;
    private final LazyConstant<MethodHandle> VK_CMD_SET_RENDERING_INPUT_ATTACHMENT_INDICES;
    private final LazyConstant<MethodHandle> VK_CREATE_SWAPCHAIN_KHR;
    private final LazyConstant<MethodHandle> VK_DESTROY_SWAPCHAIN_KHR;
    private final LazyConstant<MethodHandle> VK_GET_SWAPCHAIN_IMAGES_KHR;
    private final LazyConstant<MethodHandle> VK_ACQUIRE_NEXT_IMAGE_KHR;
    private final LazyConstant<MethodHandle> VK_QUEUE_PRESENT_KHR;
    private final LazyConstant<MethodHandle> VK_GET_DEVICE_GROUP_PRESENT_CAPABILITIES_KHR;
    private final LazyConstant<MethodHandle> VK_GET_DEVICE_GROUP_SURFACE_PRESENT_MODES_KHR;
    private final LazyConstant<MethodHandle> VK_ACQUIRE_NEXT_IMAGE2_KHR;
    private final LazyConstant<MethodHandle> VK_CREATE_SHARED_SWAPCHAINS_KHR;
    private final LazyConstant<MethodHandle> VK_CREATE_VIDEO_SESSION_KHR;
    private final LazyConstant<MethodHandle> VK_DESTROY_VIDEO_SESSION_KHR;
    private final LazyConstant<MethodHandle> VK_GET_VIDEO_SESSION_MEMORY_REQUIREMENTS_KHR;
    private final LazyConstant<MethodHandle> VK_BIND_VIDEO_SESSION_MEMORY_KHR;
    private final LazyConstant<MethodHandle> VK_CREATE_VIDEO_SESSION_PARAMETERS_KHR;
    private final LazyConstant<MethodHandle> VK_UPDATE_VIDEO_SESSION_PARAMETERS_KHR;
    private final LazyConstant<MethodHandle> VK_DESTROY_VIDEO_SESSION_PARAMETERS_KHR;
    private final LazyConstant<MethodHandle> VK_CMD_BEGIN_VIDEO_CODING_KHR;
    private final LazyConstant<MethodHandle> VK_CMD_END_VIDEO_CODING_KHR;
    private final LazyConstant<MethodHandle> VK_CMD_CONTROL_VIDEO_CODING_KHR;
    private final LazyConstant<MethodHandle> VK_CMD_DECODE_VIDEO_KHR;
    private final LazyConstant<MethodHandle> VK_GET_MEMORY_FD_KHR;
    private final LazyConstant<MethodHandle> VK_GET_MEMORY_FD_PROPERTIES_KHR;
    private final LazyConstant<MethodHandle> VK_IMPORT_SEMAPHORE_FD_KHR;
    private final LazyConstant<MethodHandle> VK_GET_SEMAPHORE_FD_KHR;
    private final LazyConstant<MethodHandle> VK_GET_SWAPCHAIN_STATUS_KHR;
    private final LazyConstant<MethodHandle> VK_IMPORT_FENCE_FD_KHR;
    private final LazyConstant<MethodHandle> VK_GET_FENCE_FD_KHR;
    private final LazyConstant<MethodHandle> VK_ACQUIRE_PROFILING_LOCK_KHR;
    private final LazyConstant<MethodHandle> VK_RELEASE_PROFILING_LOCK_KHR;
    private final LazyConstant<MethodHandle> VK_CMD_SET_FRAGMENT_SHADING_RATE_KHR;
    private final LazyConstant<MethodHandle> VK_WAIT_FOR_PRESENT_KHR;
    private final LazyConstant<MethodHandle> VK_CREATE_DEFERRED_OPERATION_KHR;
    private final LazyConstant<MethodHandle> VK_DESTROY_DEFERRED_OPERATION_KHR;
    private final LazyConstant<MethodHandle> VK_GET_DEFERRED_OPERATION_MAX_CONCURRENCY_KHR;
    private final LazyConstant<MethodHandle> VK_GET_DEFERRED_OPERATION_RESULT_KHR;
    private final LazyConstant<MethodHandle> VK_DEFERRED_OPERATION_JOIN_KHR;
    private final LazyConstant<MethodHandle> VK_GET_PIPELINE_EXECUTABLE_PROPERTIES_KHR;
    private final LazyConstant<MethodHandle> VK_GET_PIPELINE_EXECUTABLE_STATISTICS_KHR;
    private final LazyConstant<MethodHandle> VK_GET_PIPELINE_EXECUTABLE_INTERNAL_REPRESENTATIONS_KHR;
    private final LazyConstant<MethodHandle> VK_GET_ENCODED_VIDEO_SESSION_PARAMETERS_KHR;
    private final LazyConstant<MethodHandle> VK_CMD_ENCODE_VIDEO_KHR;
    private final LazyConstant<MethodHandle> VK_CMD_BIND_INDEX_BUFFER3_KHR;
    private final LazyConstant<MethodHandle> VK_CMD_BIND_VERTEX_BUFFERS3_KHR;
    private final LazyConstant<MethodHandle> VK_CMD_DRAW_INDIRECT2_KHR;
    private final LazyConstant<MethodHandle> VK_CMD_DRAW_INDEXED_INDIRECT2_KHR;
    private final LazyConstant<MethodHandle> VK_CMD_DISPATCH_INDIRECT2_KHR;
    private final LazyConstant<MethodHandle> VK_CMD_COPY_MEMORY_KHR;
    private final LazyConstant<MethodHandle> VK_CMD_COPY_MEMORY_TO_IMAGE_KHR;
    private final LazyConstant<MethodHandle> VK_CMD_COPY_IMAGE_TO_MEMORY_KHR;
    private final LazyConstant<MethodHandle> VK_CMD_UPDATE_MEMORY_KHR;
    private final LazyConstant<MethodHandle> VK_CMD_FILL_MEMORY_KHR;
    private final LazyConstant<MethodHandle> VK_CMD_COPY_QUERY_POOL_RESULTS_TO_MEMORY_KHR;
    private final LazyConstant<MethodHandle> VK_CMD_DRAW_INDIRECT_COUNT2_KHR;
    private final LazyConstant<MethodHandle> VK_CMD_DRAW_INDEXED_INDIRECT_COUNT2_KHR;
    private final LazyConstant<MethodHandle> VK_CMD_BEGIN_CONDITIONAL_RENDERING2_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_BIND_TRANSFORM_FEEDBACK_BUFFERS2_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_BEGIN_TRANSFORM_FEEDBACK2_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_END_TRANSFORM_FEEDBACK2_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_DRAW_INDIRECT_BYTE_COUNT2_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_DRAW_MESH_TASKS_INDIRECT2_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_DRAW_MESH_TASKS_INDIRECT_COUNT2_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_WRITE_MARKER_TO_MEMORY_AMD;
    private final LazyConstant<MethodHandle> VK_CREATE_ACCELERATION_STRUCTURE2_KHR;
    private final LazyConstant<MethodHandle> VK_CMD_TRACE_RAYS_INDIRECT2_KHR;
    private final LazyConstant<MethodHandle> VK_WAIT_FOR_PRESENT2_KHR;
    private final LazyConstant<MethodHandle> VK_CREATE_PIPELINE_BINARIES_KHR;
    private final LazyConstant<MethodHandle> VK_DESTROY_PIPELINE_BINARY_KHR;
    private final LazyConstant<MethodHandle> VK_GET_PIPELINE_KEY_KHR;
    private final LazyConstant<MethodHandle> VK_GET_PIPELINE_BINARY_DATA_KHR;
    private final LazyConstant<MethodHandle> VK_RELEASE_CAPTURED_PIPELINE_DATA_KHR;
    private final LazyConstant<MethodHandle> VK_RELEASE_SWAPCHAIN_IMAGES_KHR;
    private final LazyConstant<MethodHandle> VK_GET_CALIBRATED_TIMESTAMPS_KHR;
    private final LazyConstant<MethodHandle> VK_CMD_SET_DESCRIPTOR_BUFFER_OFFSETS2_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_BIND_DESCRIPTOR_BUFFER_EMBEDDED_SAMPLERS2_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_COPY_MEMORY_INDIRECT_KHR;
    private final LazyConstant<MethodHandle> VK_CMD_COPY_MEMORY_TO_IMAGE_INDIRECT_KHR;
    private final LazyConstant<MethodHandle> VK_GET_DEVICE_FAULT_REPORTS_KHR;
    private final LazyConstant<MethodHandle> VK_GET_DEVICE_FAULT_DEBUG_INFO_KHR;
    private final LazyConstant<MethodHandle> VK_CMD_END_RENDERING2_KHR;
    private final LazyConstant<MethodHandle> VK_DEBUG_MARKER_SET_OBJECT_TAG_EXT;
    private final LazyConstant<MethodHandle> VK_DEBUG_MARKER_SET_OBJECT_NAME_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_DEBUG_MARKER_BEGIN_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_DEBUG_MARKER_END_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_DEBUG_MARKER_INSERT_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_BIND_TRANSFORM_FEEDBACK_BUFFERS_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_BEGIN_TRANSFORM_FEEDBACK_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_END_TRANSFORM_FEEDBACK_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_BEGIN_QUERY_INDEXED_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_END_QUERY_INDEXED_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_DRAW_INDIRECT_BYTE_COUNT_EXT;
    private final LazyConstant<MethodHandle> VK_CREATE_CU_MODULE_NVX;
    private final LazyConstant<MethodHandle> VK_CREATE_CU_FUNCTION_NVX;
    private final LazyConstant<MethodHandle> VK_DESTROY_CU_MODULE_NVX;
    private final LazyConstant<MethodHandle> VK_DESTROY_CU_FUNCTION_NVX;
    private final LazyConstant<MethodHandle> VK_CMD_CU_LAUNCH_KERNEL_NVX;
    private final LazyConstant<MethodHandle> VK_GET_IMAGE_VIEW_HANDLE_NVX;
    private final LazyConstant<MethodHandle> VK_GET_IMAGE_VIEW_HANDLE64_NVX;
    private final LazyConstant<MethodHandle> VK_GET_IMAGE_VIEW_ADDRESS_NVX;
    private final LazyConstant<MethodHandle> VK_GET_DEVICE_COMBINED_IMAGE_SAMPLER_INDEX_NVX;
    private final LazyConstant<MethodHandle> VK_GET_SHADER_INFO_AMD;
    private final LazyConstant<MethodHandle> VK_CMD_BEGIN_CONDITIONAL_RENDERING_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_END_CONDITIONAL_RENDERING_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_SET_VIEWPORT_WSCALING_NV;
    private final LazyConstant<MethodHandle> VK_DISPLAY_POWER_CONTROL_EXT;
    private final LazyConstant<MethodHandle> VK_REGISTER_DEVICE_EVENT_EXT;
    private final LazyConstant<MethodHandle> VK_REGISTER_DISPLAY_EVENT_EXT;
    private final LazyConstant<MethodHandle> VK_GET_SWAPCHAIN_COUNTER_EXT;
    private final LazyConstant<MethodHandle> VK_GET_REFRESH_CYCLE_DURATION_GOOGLE;
    private final LazyConstant<MethodHandle> VK_GET_PAST_PRESENTATION_TIMING_GOOGLE;
    private final LazyConstant<MethodHandle> VK_CMD_SET_DISCARD_RECTANGLE_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_SET_DISCARD_RECTANGLE_ENABLE_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_SET_DISCARD_RECTANGLE_MODE_EXT;
    private final LazyConstant<MethodHandle> VK_SET_HDR_METADATA_EXT;
    private final LazyConstant<MethodHandle> VK_SET_DEBUG_UTILS_OBJECT_NAME_EXT;
    private final LazyConstant<MethodHandle> VK_SET_DEBUG_UTILS_OBJECT_TAG_EXT;
    private final LazyConstant<MethodHandle> VK_QUEUE_BEGIN_DEBUG_UTILS_LABEL_EXT;
    private final LazyConstant<MethodHandle> VK_QUEUE_END_DEBUG_UTILS_LABEL_EXT;
    private final LazyConstant<MethodHandle> VK_QUEUE_INSERT_DEBUG_UTILS_LABEL_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_BEGIN_DEBUG_UTILS_LABEL_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_END_DEBUG_UTILS_LABEL_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_INSERT_DEBUG_UTILS_LABEL_EXT;
    private final LazyConstant<MethodHandle> VK_CREATE_GPA_SESSION_AMD;
    private final LazyConstant<MethodHandle> VK_DESTROY_GPA_SESSION_AMD;
    private final LazyConstant<MethodHandle> VK_SET_GPA_DEVICE_CLOCK_MODE_AMD;
    private final LazyConstant<MethodHandle> VK_GET_GPA_DEVICE_CLOCK_INFO_AMD;
    private final LazyConstant<MethodHandle> VK_CMD_BEGIN_GPA_SESSION_AMD;
    private final LazyConstant<MethodHandle> VK_CMD_END_GPA_SESSION_AMD;
    private final LazyConstant<MethodHandle> VK_CMD_BEGIN_GPA_SAMPLE_AMD;
    private final LazyConstant<MethodHandle> VK_CMD_END_GPA_SAMPLE_AMD;
    private final LazyConstant<MethodHandle> VK_GET_GPA_SESSION_STATUS_AMD;
    private final LazyConstant<MethodHandle> VK_GET_GPA_SESSION_RESULTS_AMD;
    private final LazyConstant<MethodHandle> VK_RESET_GPA_SESSION_AMD;
    private final LazyConstant<MethodHandle> VK_CMD_COPY_GPA_SESSION_RESULTS_AMD;
    private final LazyConstant<MethodHandle> VK_WRITE_SAMPLER_DESCRIPTORS_EXT;
    private final LazyConstant<MethodHandle> VK_WRITE_RESOURCE_DESCRIPTORS_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_BIND_SAMPLER_HEAP_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_BIND_RESOURCE_HEAP_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_PUSH_DATA_EXT;
    private final LazyConstant<MethodHandle> VK_GET_IMAGE_OPAQUE_CAPTURE_DATA_EXT;
    private final LazyConstant<MethodHandle> VK_REGISTER_CUSTOM_BORDER_COLOR_EXT;
    private final LazyConstant<MethodHandle> VK_UNREGISTER_CUSTOM_BORDER_COLOR_EXT;
    private final LazyConstant<MethodHandle> VK_GET_TENSOR_OPAQUE_CAPTURE_DATA_ARM;
    private final LazyConstant<MethodHandle> VK_CMD_SET_SAMPLE_LOCATIONS_EXT;
    private final LazyConstant<MethodHandle> VK_GET_IMAGE_DRM_FORMAT_MODIFIER_PROPERTIES_EXT;
    private final LazyConstant<MethodHandle> VK_CREATE_VALIDATION_CACHE_EXT;
    private final LazyConstant<MethodHandle> VK_DESTROY_VALIDATION_CACHE_EXT;
    private final LazyConstant<MethodHandle> VK_MERGE_VALIDATION_CACHES_EXT;
    private final LazyConstant<MethodHandle> VK_GET_VALIDATION_CACHE_DATA_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_BIND_SHADING_RATE_IMAGE_NV;
    private final LazyConstant<MethodHandle> VK_CMD_SET_VIEWPORT_SHADING_RATE_PALETTE_NV;
    private final LazyConstant<MethodHandle> VK_CMD_SET_COARSE_SAMPLE_ORDER_NV;
    private final LazyConstant<MethodHandle> VK_CREATE_ACCELERATION_STRUCTURE_NV;
    private final LazyConstant<MethodHandle> VK_DESTROY_ACCELERATION_STRUCTURE_NV;
    private final LazyConstant<MethodHandle> VK_GET_ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_NV;
    private final LazyConstant<MethodHandle> VK_BIND_ACCELERATION_STRUCTURE_MEMORY_NV;
    private final LazyConstant<MethodHandle> VK_CMD_BUILD_ACCELERATION_STRUCTURE_NV;
    private final LazyConstant<MethodHandle> VK_CMD_COPY_ACCELERATION_STRUCTURE_NV;
    private final LazyConstant<MethodHandle> VK_CMD_TRACE_RAYS_NV;
    private final LazyConstant<MethodHandle> VK_CREATE_RAY_TRACING_PIPELINES_NV;
    private final LazyConstant<MethodHandle> VK_GET_RAY_TRACING_SHADER_GROUP_HANDLES_KHR;
    private final LazyConstant<MethodHandle> VK_GET_ACCELERATION_STRUCTURE_HANDLE_NV;
    private final LazyConstant<MethodHandle> VK_CMD_WRITE_ACCELERATION_STRUCTURES_PROPERTIES_NV;
    private final LazyConstant<MethodHandle> VK_COMPILE_DEFERRED_NV;
    private final LazyConstant<MethodHandle> VK_GET_MEMORY_HOST_POINTER_PROPERTIES_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_WRITE_BUFFER_MARKER_AMD;
    private final LazyConstant<MethodHandle> VK_CMD_WRITE_BUFFER_MARKER2_AMD;
    private final LazyConstant<MethodHandle> VK_CMD_DRAW_MESH_TASKS_NV;
    private final LazyConstant<MethodHandle> VK_CMD_DRAW_MESH_TASKS_INDIRECT_NV;
    private final LazyConstant<MethodHandle> VK_CMD_DRAW_MESH_TASKS_INDIRECT_COUNT_NV;
    private final LazyConstant<MethodHandle> VK_CMD_SET_EXCLUSIVE_SCISSOR_ENABLE_NV;
    private final LazyConstant<MethodHandle> VK_CMD_SET_EXCLUSIVE_SCISSOR_NV;
    private final LazyConstant<MethodHandle> VK_CMD_SET_CHECKPOINT_NV;
    private final LazyConstant<MethodHandle> VK_GET_QUEUE_CHECKPOINT_DATA_NV;
    private final LazyConstant<MethodHandle> VK_GET_QUEUE_CHECKPOINT_DATA2_NV;
    private final LazyConstant<MethodHandle> VK_SET_SWAPCHAIN_PRESENT_TIMING_QUEUE_SIZE_EXT;
    private final LazyConstant<MethodHandle> VK_GET_SWAPCHAIN_TIMING_PROPERTIES_EXT;
    private final LazyConstant<MethodHandle> VK_GET_SWAPCHAIN_TIME_DOMAIN_PROPERTIES_EXT;
    private final LazyConstant<MethodHandle> VK_GET_PAST_PRESENTATION_TIMING_EXT;
    private final LazyConstant<MethodHandle> VK_INITIALIZE_PERFORMANCE_API_INTEL;
    private final LazyConstant<MethodHandle> VK_UNINITIALIZE_PERFORMANCE_API_INTEL;
    private final LazyConstant<MethodHandle> VK_CMD_SET_PERFORMANCE_MARKER_INTEL;
    private final LazyConstant<MethodHandle> VK_CMD_SET_PERFORMANCE_STREAM_MARKER_INTEL;
    private final LazyConstant<MethodHandle> VK_CMD_SET_PERFORMANCE_OVERRIDE_INTEL;
    private final LazyConstant<MethodHandle> VK_ACQUIRE_PERFORMANCE_CONFIGURATION_INTEL;
    private final LazyConstant<MethodHandle> VK_RELEASE_PERFORMANCE_CONFIGURATION_INTEL;
    private final LazyConstant<MethodHandle> VK_QUEUE_SET_PERFORMANCE_CONFIGURATION_INTEL;
    private final LazyConstant<MethodHandle> VK_GET_PERFORMANCE_PARAMETER_INTEL;
    private final LazyConstant<MethodHandle> VK_SET_LOCAL_DIMMING_AMD;
    private final LazyConstant<MethodHandle> VK_GET_GENERATED_COMMANDS_MEMORY_REQUIREMENTS_NV;
    private final LazyConstant<MethodHandle> VK_CMD_PREPROCESS_GENERATED_COMMANDS_NV;
    private final LazyConstant<MethodHandle> VK_CMD_EXECUTE_GENERATED_COMMANDS_NV;
    private final LazyConstant<MethodHandle> VK_CMD_BIND_PIPELINE_SHADER_GROUP_NV;
    private final LazyConstant<MethodHandle> VK_CREATE_INDIRECT_COMMANDS_LAYOUT_NV;
    private final LazyConstant<MethodHandle> VK_DESTROY_INDIRECT_COMMANDS_LAYOUT_NV;
    private final LazyConstant<MethodHandle> VK_CMD_SET_DEPTH_BIAS2_EXT;
    private final LazyConstant<MethodHandle> VK_QUEUE_SET_PERF_HINT_QCOM;
    private final LazyConstant<MethodHandle> VK_CMD_DISPATCH_TILE_QCOM;
    private final LazyConstant<MethodHandle> VK_CMD_BEGIN_PER_TILE_EXECUTION_QCOM;
    private final LazyConstant<MethodHandle> VK_CMD_END_PER_TILE_EXECUTION_QCOM;
    private final LazyConstant<MethodHandle> VK_SET_LATENCY_SLEEP_MODE_LEGACY_NV;
    private final LazyConstant<MethodHandle> VK_LATENCY_SLEEP_LEGACY_NV;
    private final LazyConstant<MethodHandle> VK_SET_LATENCY_MARKER_LEGACY_NV;
    private final LazyConstant<MethodHandle> VK_GET_LATENCY_TIMINGS_LEGACY_NV;
    private final LazyConstant<MethodHandle> VK_QUEUE_NOTIFY_OUT_OF_BAND_LEGACY_NV;
    private final LazyConstant<MethodHandle> VK_GET_SLEEP_STATUS_LEGACY_NV;
    private final LazyConstant<MethodHandle> VK_SHUTDOWN_LATENCY_DEVICE_LEGACY_NV;
    private final LazyConstant<MethodHandle> VK_GET_DESCRIPTOR_SET_LAYOUT_SIZE_EXT;
    private final LazyConstant<MethodHandle> VK_GET_DESCRIPTOR_SET_LAYOUT_BINDING_OFFSET_EXT;
    private final LazyConstant<MethodHandle> VK_GET_DESCRIPTOR_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_BIND_DESCRIPTOR_BUFFERS_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_SET_DESCRIPTOR_BUFFER_OFFSETS_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_BIND_DESCRIPTOR_BUFFER_EMBEDDED_SAMPLERS_EXT;
    private final LazyConstant<MethodHandle> VK_GET_BUFFER_OPAQUE_CAPTURE_DESCRIPTOR_DATA_EXT;
    private final LazyConstant<MethodHandle> VK_GET_IMAGE_OPAQUE_CAPTURE_DESCRIPTOR_DATA_EXT;
    private final LazyConstant<MethodHandle> VK_GET_IMAGE_VIEW_OPAQUE_CAPTURE_DESCRIPTOR_DATA_EXT;
    private final LazyConstant<MethodHandle> VK_GET_SAMPLER_OPAQUE_CAPTURE_DESCRIPTOR_DATA_EXT;
    private final LazyConstant<MethodHandle> VK_GET_ACCELERATION_STRUCTURE_OPAQUE_CAPTURE_DESCRIPTOR_DATA_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_SET_FRAGMENT_SHADING_RATE_ENUM_NV;
    private final LazyConstant<MethodHandle> VK_GET_DEVICE_FAULT_INFO_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_SET_VERTEX_INPUT_EXT;
    private final LazyConstant<MethodHandle> VK_GET_DEVICE_SUBPASS_SHADING_MAX_WORKGROUP_SIZE_HUAWEI;
    private final LazyConstant<MethodHandle> VK_CMD_SUBPASS_SHADING_HUAWEI;
    private final LazyConstant<MethodHandle> VK_CMD_BIND_INVOCATION_MASK_HUAWEI;
    private final LazyConstant<MethodHandle> VK_GET_MEMORY_REMOTE_ADDRESS_NV;
    private final LazyConstant<MethodHandle> VK_GET_PIPELINE_PROPERTIES_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_SET_PATCH_CONTROL_POINTS_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_SET_LOGIC_OP_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_SET_COLOR_WRITE_ENABLE_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_DRAW_MULTI_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_DRAW_MULTI_INDEXED_EXT;
    private final LazyConstant<MethodHandle> VK_CREATE_MICROMAP_EXT;
    private final LazyConstant<MethodHandle> VK_DESTROY_MICROMAP_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_BUILD_MICROMAPS_EXT;
    private final LazyConstant<MethodHandle> VK_BUILD_MICROMAPS_EXT;
    private final LazyConstant<MethodHandle> VK_COPY_MICROMAP_EXT;
    private final LazyConstant<MethodHandle> VK_COPY_MICROMAP_TO_MEMORY_EXT;
    private final LazyConstant<MethodHandle> VK_COPY_MEMORY_TO_MICROMAP_EXT;
    private final LazyConstant<MethodHandle> VK_WRITE_MICROMAPS_PROPERTIES_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_COPY_MICROMAP_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_COPY_MICROMAP_TO_MEMORY_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_COPY_MEMORY_TO_MICROMAP_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_WRITE_MICROMAPS_PROPERTIES_EXT;
    private final LazyConstant<MethodHandle> VK_GET_DEVICE_MICROMAP_COMPATIBILITY_EXT;
    private final LazyConstant<MethodHandle> VK_GET_MICROMAP_BUILD_SIZES_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_DRAW_CLUSTER_HUAWEI;
    private final LazyConstant<MethodHandle> VK_CMD_DRAW_CLUSTER_INDIRECT_HUAWEI;
    private final LazyConstant<MethodHandle> VK_SET_DEVICE_MEMORY_PRIORITY_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_SET_DISPATCH_PARAMETERS_ARM;
    private final LazyConstant<MethodHandle> VK_GET_DESCRIPTOR_SET_LAYOUT_HOST_MAPPING_INFO_VALVE;
    private final LazyConstant<MethodHandle> VK_GET_DESCRIPTOR_SET_HOST_MAPPING_VALVE;
    private final LazyConstant<MethodHandle> VK_CMD_COPY_MEMORY_INDIRECT_NV;
    private final LazyConstant<MethodHandle> VK_CMD_COPY_MEMORY_TO_IMAGE_INDIRECT_NV;
    private final LazyConstant<MethodHandle> VK_CMD_DECOMPRESS_MEMORY_NV;
    private final LazyConstant<MethodHandle> VK_CMD_DECOMPRESS_MEMORY_INDIRECT_COUNT_NV;
    private final LazyConstant<MethodHandle> VK_GET_PIPELINE_INDIRECT_MEMORY_REQUIREMENTS_NV;
    private final LazyConstant<MethodHandle> VK_CMD_UPDATE_PIPELINE_INDIRECT_BUFFER_NV;
    private final LazyConstant<MethodHandle> VK_GET_PIPELINE_INDIRECT_DEVICE_ADDRESS_NV;
    private final LazyConstant<MethodHandle> VK_CMD_SET_DEPTH_CLAMP_ENABLE_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_SET_POLYGON_MODE_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_SET_RASTERIZATION_SAMPLES_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_SET_SAMPLE_MASK_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_SET_ALPHA_TO_COVERAGE_ENABLE_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_SET_ALPHA_TO_ONE_ENABLE_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_SET_LOGIC_OP_ENABLE_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_SET_COLOR_BLEND_ENABLE_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_SET_COLOR_BLEND_EQUATION_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_SET_COLOR_WRITE_MASK_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_SET_TESSELLATION_DOMAIN_ORIGIN_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_SET_RASTERIZATION_STREAM_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_SET_CONSERVATIVE_RASTERIZATION_MODE_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_SET_EXTRA_PRIMITIVE_OVERESTIMATION_SIZE_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_SET_DEPTH_CLIP_ENABLE_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_SET_SAMPLE_LOCATIONS_ENABLE_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_SET_COLOR_BLEND_ADVANCED_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_SET_PROVOKING_VERTEX_MODE_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_SET_LINE_RASTERIZATION_MODE_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_SET_LINE_STIPPLE_ENABLE_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_SET_DEPTH_CLIP_NEGATIVE_ONE_TO_ONE_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_SET_VIEWPORT_WSCALING_ENABLE_NV;
    private final LazyConstant<MethodHandle> VK_CMD_SET_VIEWPORT_SWIZZLE_NV;
    private final LazyConstant<MethodHandle> VK_CMD_SET_COVERAGE_TO_COLOR_ENABLE_NV;
    private final LazyConstant<MethodHandle> VK_CMD_SET_COVERAGE_TO_COLOR_LOCATION_NV;
    private final LazyConstant<MethodHandle> VK_CMD_SET_COVERAGE_MODULATION_MODE_NV;
    private final LazyConstant<MethodHandle> VK_CMD_SET_COVERAGE_MODULATION_TABLE_ENABLE_NV;
    private final LazyConstant<MethodHandle> VK_CMD_SET_COVERAGE_MODULATION_TABLE_NV;
    private final LazyConstant<MethodHandle> VK_CMD_SET_SHADING_RATE_IMAGE_ENABLE_NV;
    private final LazyConstant<MethodHandle> VK_CMD_SET_REPRESENTATIVE_FRAGMENT_TEST_ENABLE_NV;
    private final LazyConstant<MethodHandle> VK_CMD_SET_COVERAGE_REDUCTION_MODE_NV;
    private final LazyConstant<MethodHandle> VK_CREATE_TENSOR_ARM;
    private final LazyConstant<MethodHandle> VK_DESTROY_TENSOR_ARM;
    private final LazyConstant<MethodHandle> VK_CREATE_TENSOR_VIEW_ARM;
    private final LazyConstant<MethodHandle> VK_DESTROY_TENSOR_VIEW_ARM;
    private final LazyConstant<MethodHandle> VK_GET_TENSOR_MEMORY_REQUIREMENTS_ARM;
    private final LazyConstant<MethodHandle> VK_BIND_TENSOR_MEMORY_ARM;
    private final LazyConstant<MethodHandle> VK_GET_DEVICE_TENSOR_MEMORY_REQUIREMENTS_ARM;
    private final LazyConstant<MethodHandle> VK_CMD_COPY_TENSOR_ARM;
    private final LazyConstant<MethodHandle> VK_GET_TENSOR_OPAQUE_CAPTURE_DESCRIPTOR_DATA_ARM;
    private final LazyConstant<MethodHandle> VK_GET_TENSOR_VIEW_OPAQUE_CAPTURE_DESCRIPTOR_DATA_ARM;
    private final LazyConstant<MethodHandle> VK_GET_SHADER_MODULE_IDENTIFIER_EXT;
    private final LazyConstant<MethodHandle> VK_GET_SHADER_MODULE_CREATE_INFO_IDENTIFIER_EXT;
    private final LazyConstant<MethodHandle> VK_CREATE_OPTICAL_FLOW_SESSION_NV;
    private final LazyConstant<MethodHandle> VK_DESTROY_OPTICAL_FLOW_SESSION_NV;
    private final LazyConstant<MethodHandle> VK_BIND_OPTICAL_FLOW_SESSION_IMAGE_NV;
    private final LazyConstant<MethodHandle> VK_CMD_OPTICAL_FLOW_EXECUTE_NV;
    private final LazyConstant<MethodHandle> VK_ANTI_LAG_UPDATE_AMD;
    private final LazyConstant<MethodHandle> VK_CREATE_SHADERS_EXT;
    private final LazyConstant<MethodHandle> VK_DESTROY_SHADER_EXT;
    private final LazyConstant<MethodHandle> VK_GET_SHADER_BINARY_DATA_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_BIND_SHADERS_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_SET_DEPTH_CLAMP_RANGE_EXT;
    private final LazyConstant<MethodHandle> VK_GET_FRAMEBUFFER_TILE_PROPERTIES_QCOM;
    private final LazyConstant<MethodHandle> VK_GET_DYNAMIC_RENDERING_TILE_PROPERTIES_QCOM;
    private final LazyConstant<MethodHandle> VK_CONVERT_COOPERATIVE_VECTOR_MATRIX_NV;
    private final LazyConstant<MethodHandle> VK_CMD_CONVERT_COOPERATIVE_VECTOR_MATRIX_NV;
    private final LazyConstant<MethodHandle> VK_SET_LATENCY_SLEEP_MODE_NV;
    private final LazyConstant<MethodHandle> VK_LATENCY_SLEEP_NV;
    private final LazyConstant<MethodHandle> VK_SET_LATENCY_MARKER_NV;
    private final LazyConstant<MethodHandle> VK_GET_LATENCY_TIMINGS_NV;
    private final LazyConstant<MethodHandle> VK_QUEUE_NOTIFY_OUT_OF_BAND_NV;
    private final LazyConstant<MethodHandle> VK_CREATE_DATA_GRAPH_PIPELINES_ARM;
    private final LazyConstant<MethodHandle> VK_CREATE_DATA_GRAPH_PIPELINE_SESSION_ARM;
    private final LazyConstant<MethodHandle> VK_GET_DATA_GRAPH_PIPELINE_SESSION_BIND_POINT_REQUIREMENTS_ARM;
    private final LazyConstant<MethodHandle> VK_GET_DATA_GRAPH_PIPELINE_SESSION_MEMORY_REQUIREMENTS_ARM;
    private final LazyConstant<MethodHandle> VK_BIND_DATA_GRAPH_PIPELINE_SESSION_MEMORY_ARM;
    private final LazyConstant<MethodHandle> VK_DESTROY_DATA_GRAPH_PIPELINE_SESSION_ARM;
    private final LazyConstant<MethodHandle> VK_CMD_DISPATCH_DATA_GRAPH_ARM;
    private final LazyConstant<MethodHandle> VK_GET_DATA_GRAPH_PIPELINE_AVAILABLE_PROPERTIES_ARM;
    private final LazyConstant<MethodHandle> VK_GET_DATA_GRAPH_PIPELINE_PROPERTIES_ARM;
    private final LazyConstant<MethodHandle> VK_CMD_SET_ATTACHMENT_FEEDBACK_LOOP_ENABLE_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_BIND_TILE_MEMORY_QCOM;
    private final LazyConstant<MethodHandle> VK_CMD_DECOMPRESS_MEMORY_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_DECOMPRESS_MEMORY_INDIRECT_COUNT_EXT;
    private final LazyConstant<MethodHandle> VK_CREATE_EXTERNAL_COMPUTE_QUEUE_NV;
    private final LazyConstant<MethodHandle> VK_DESTROY_EXTERNAL_COMPUTE_QUEUE_NV;
    private final LazyConstant<MethodHandle> VK_GET_CLUSTER_ACCELERATION_STRUCTURE_BUILD_SIZES_NV;
    private final LazyConstant<MethodHandle> VK_CMD_BUILD_CLUSTER_ACCELERATION_STRUCTURE_INDIRECT_NV;
    private final LazyConstant<MethodHandle> VK_GET_PARTITIONED_ACCELERATION_STRUCTURES_BUILD_SIZES_NV;
    private final LazyConstant<MethodHandle> VK_CMD_BUILD_PARTITIONED_ACCELERATION_STRUCTURES_NV;
    private final LazyConstant<MethodHandle> VK_GET_GENERATED_COMMANDS_MEMORY_REQUIREMENTS_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_PREPROCESS_GENERATED_COMMANDS_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_EXECUTE_GENERATED_COMMANDS_EXT;
    private final LazyConstant<MethodHandle> VK_CREATE_INDIRECT_COMMANDS_LAYOUT_EXT;
    private final LazyConstant<MethodHandle> VK_DESTROY_INDIRECT_COMMANDS_LAYOUT_EXT;
    private final LazyConstant<MethodHandle> VK_CREATE_INDIRECT_EXECUTION_SET_EXT;
    private final LazyConstant<MethodHandle> VK_DESTROY_INDIRECT_EXECUTION_SET_EXT;
    private final LazyConstant<MethodHandle> VK_UPDATE_INDIRECT_EXECUTION_SET_PIPELINE_EXT;
    private final LazyConstant<MethodHandle> VK_UPDATE_INDIRECT_EXECUTION_SET_SHADER_EXT;
    private final LazyConstant<MethodHandle> VK_CREATE_SHADER_INSTRUMENTATION_ARM;
    private final LazyConstant<MethodHandle> VK_DESTROY_SHADER_INSTRUMENTATION_ARM;
    private final LazyConstant<MethodHandle> VK_CMD_BEGIN_SHADER_INSTRUMENTATION_ARM;
    private final LazyConstant<MethodHandle> VK_CMD_END_SHADER_INSTRUMENTATION_ARM;
    private final LazyConstant<MethodHandle> VK_GET_SHADER_INSTRUMENTATION_VALUES_ARM;
    private final LazyConstant<MethodHandle> VK_CLEAR_SHADER_INSTRUMENTATION_METRICS_ARM;
    private final LazyConstant<MethodHandle> VK_CMD_BEGIN_CUSTOM_RESOLVE_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_SET_COMPUTE_OCCUPANCY_PRIORITY_NV;
    private final LazyConstant<MethodHandle> VK_CMD_SET_PRIMITIVE_RESTART_INDEX_EXT;
    private final LazyConstant<MethodHandle> VK_CREATE_ACCELERATION_STRUCTURE_KHR;
    private final LazyConstant<MethodHandle> VK_DESTROY_ACCELERATION_STRUCTURE_KHR;
    private final LazyConstant<MethodHandle> VK_CMD_BUILD_ACCELERATION_STRUCTURES_KHR;
    private final LazyConstant<MethodHandle> VK_CMD_BUILD_ACCELERATION_STRUCTURES_INDIRECT_KHR;
    private final LazyConstant<MethodHandle> VK_BUILD_ACCELERATION_STRUCTURES_KHR;
    private final LazyConstant<MethodHandle> VK_COPY_ACCELERATION_STRUCTURE_KHR;
    private final LazyConstant<MethodHandle> VK_COPY_ACCELERATION_STRUCTURE_TO_MEMORY_KHR;
    private final LazyConstant<MethodHandle> VK_COPY_MEMORY_TO_ACCELERATION_STRUCTURE_KHR;
    private final LazyConstant<MethodHandle> VK_WRITE_ACCELERATION_STRUCTURES_PROPERTIES_KHR;
    private final LazyConstant<MethodHandle> VK_CMD_COPY_ACCELERATION_STRUCTURE_KHR;
    private final LazyConstant<MethodHandle> VK_CMD_COPY_ACCELERATION_STRUCTURE_TO_MEMORY_KHR;
    private final LazyConstant<MethodHandle> VK_CMD_COPY_MEMORY_TO_ACCELERATION_STRUCTURE_KHR;
    private final LazyConstant<MethodHandle> VK_GET_ACCELERATION_STRUCTURE_DEVICE_ADDRESS_KHR;
    private final LazyConstant<MethodHandle> VK_CMD_WRITE_ACCELERATION_STRUCTURES_PROPERTIES_KHR;
    private final LazyConstant<MethodHandle> VK_GET_DEVICE_ACCELERATION_STRUCTURE_COMPATIBILITY_KHR;
    private final LazyConstant<MethodHandle> VK_GET_ACCELERATION_STRUCTURE_BUILD_SIZES_KHR;
    private final LazyConstant<MethodHandle> VK_CMD_TRACE_RAYS_KHR;
    private final LazyConstant<MethodHandle> VK_CREATE_RAY_TRACING_PIPELINES_KHR;
    private final LazyConstant<MethodHandle> VK_GET_RAY_TRACING_CAPTURE_REPLAY_SHADER_GROUP_HANDLES_KHR;
    private final LazyConstant<MethodHandle> VK_CMD_TRACE_RAYS_INDIRECT_KHR;
    private final LazyConstant<MethodHandle> VK_GET_RAY_TRACING_SHADER_GROUP_STACK_SIZE_KHR;
    private final LazyConstant<MethodHandle> VK_CMD_SET_RAY_TRACING_PIPELINE_STACK_SIZE_KHR;
    private final LazyConstant<MethodHandle> VK_CMD_DRAW_MESH_TASKS_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_DRAW_MESH_TASKS_INDIRECT_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_DRAW_MESH_TASKS_INDIRECT_COUNT_EXT;

    private final MemorySegment segment;

    static {
        //@formatter:off
        //@formatter:on
    }

    /**
     * This constructor must not be used. It will always throw an UnsupportedOperationException.
     * The constructor only exists to fix some compiler errors caused by generating all sources.
     * If a struct contains an address to a device (e.g. VmaAllocatorCreateInfo) the getter
     * for this field must not be used as it will call this constructor.
     */
    public VkDevice(MemorySegment segment) {
        throw new UnsupportedOperationException(
            "Cannot create a VkDevice this way. Fetch the segment and create the device manually."
        );
    }

    public VkDevice(MemorySegment segment, VkInstance vkInstance) {
        this.segment = segment;

        VK_GET_DEVICE_PROC_ADDR = vkInstance.downcallHandle("vkGetDeviceProcAddr", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_DESTROY_DEVICE = downcallHandleVoid("vkDestroyDevice", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_GET_DEVICE_QUEUE = downcallHandleVoid("vkGetDeviceQueue", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
        VK_QUEUE_SUBMIT = downcallHandle("vkQueueSubmit", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_QUEUE_WAIT_IDLE = downcallHandle("vkQueueWaitIdle", JAVA_INT, UNBOUNDED_ADDRESS);
        VK_DEVICE_WAIT_IDLE = downcallHandle("vkDeviceWaitIdle", JAVA_INT, UNBOUNDED_ADDRESS);
        VK_ALLOCATE_MEMORY = downcallHandle("vkAllocateMemory", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_FREE_MEMORY = downcallHandleVoid("vkFreeMemory", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_MAP_MEMORY = downcallHandle("vkMapMemory", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG, JAVA_INT, UNBOUNDED_ADDRESS);
        VK_UNMAP_MEMORY = downcallHandleVoid("vkUnmapMemory", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_FLUSH_MAPPED_MEMORY_RANGES = downcallHandle("vkFlushMappedMemoryRanges", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
        VK_INVALIDATE_MAPPED_MEMORY_RANGES = downcallHandle("vkInvalidateMappedMemoryRanges", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
        VK_GET_DEVICE_MEMORY_COMMITMENT = downcallHandleVoid("vkGetDeviceMemoryCommitment", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_BIND_BUFFER_MEMORY = downcallHandle("vkBindBufferMemory", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG);
        VK_BIND_IMAGE_MEMORY = downcallHandle("vkBindImageMemory", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG);
        VK_GET_BUFFER_MEMORY_REQUIREMENTS = downcallHandleVoid("vkGetBufferMemoryRequirements", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_GET_IMAGE_MEMORY_REQUIREMENTS = downcallHandleVoid("vkGetImageMemoryRequirements", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_GET_IMAGE_SPARSE_MEMORY_REQUIREMENTS = downcallHandleVoid("vkGetImageSparseMemoryRequirements", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_QUEUE_BIND_SPARSE = downcallHandle("vkQueueBindSparse", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CREATE_FENCE = downcallHandle("vkCreateFence", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_DESTROY_FENCE = downcallHandleVoid("vkDestroyFence", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_RESET_FENCES = downcallHandle("vkResetFences", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
        VK_GET_FENCE_STATUS = downcallHandle("vkGetFenceStatus", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_WAIT_FOR_FENCES = downcallHandle("vkWaitForFences", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_LONG);
        VK_CREATE_SEMAPHORE = downcallHandle("vkCreateSemaphore", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_DESTROY_SEMAPHORE = downcallHandleVoid("vkDestroySemaphore", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CREATE_QUERY_POOL = downcallHandle("vkCreateQueryPool", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_DESTROY_QUERY_POOL = downcallHandleVoid("vkDestroyQueryPool", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_GET_QUERY_POOL_RESULTS = downcallHandle("vkGetQueryPoolResults", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, JAVA_LONG, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_INT);
        VK_CREATE_BUFFER = downcallHandle("vkCreateBuffer", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_DESTROY_BUFFER = downcallHandleVoid("vkDestroyBuffer", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CREATE_IMAGE = downcallHandle("vkCreateImage", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_DESTROY_IMAGE = downcallHandleVoid("vkDestroyImage", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_GET_IMAGE_SUBRESOURCE_LAYOUT = downcallHandleVoid("vkGetImageSubresourceLayout", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CREATE_IMAGE_VIEW = downcallHandle("vkCreateImageView", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_DESTROY_IMAGE_VIEW = downcallHandleVoid("vkDestroyImageView", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CREATE_COMMAND_POOL = downcallHandle("vkCreateCommandPool", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_DESTROY_COMMAND_POOL = downcallHandleVoid("vkDestroyCommandPool", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_RESET_COMMAND_POOL = downcallHandle("vkResetCommandPool", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
        VK_ALLOCATE_COMMAND_BUFFERS = downcallHandle("vkAllocateCommandBuffers", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_FREE_COMMAND_BUFFERS = downcallHandleVoid("vkFreeCommandBuffers", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
        VK_BEGIN_COMMAND_BUFFER = downcallHandle("vkBeginCommandBuffer", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_END_COMMAND_BUFFER = downcallHandle("vkEndCommandBuffer", JAVA_INT, UNBOUNDED_ADDRESS);
        VK_RESET_COMMAND_BUFFER = downcallHandle("vkResetCommandBuffer", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT);
        VK_CMD_COPY_BUFFER = downcallHandleVoid("vkCmdCopyBuffer", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
        VK_CMD_COPY_IMAGE = downcallHandleVoid("vkCmdCopyImage", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
        VK_CMD_COPY_BUFFER_TO_IMAGE = downcallHandleVoid("vkCmdCopyBufferToImage", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
        VK_CMD_COPY_IMAGE_TO_BUFFER = downcallHandleVoid("vkCmdCopyImageToBuffer", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
        VK_CMD_UPDATE_BUFFER = downcallHandleVoid("vkCmdUpdateBuffer", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG, UNBOUNDED_ADDRESS);
        VK_CMD_FILL_BUFFER = downcallHandleVoid("vkCmdFillBuffer", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG, JAVA_INT);
        VK_CMD_PIPELINE_BARRIER = downcallHandleVoid("vkCmdPipelineBarrier", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
        VK_CMD_BEGIN_QUERY = downcallHandleVoid("vkCmdBeginQuery", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
        VK_CMD_END_QUERY = downcallHandleVoid("vkCmdEndQuery", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
        VK_CMD_RESET_QUERY_POOL = downcallHandleVoid("vkCmdResetQueryPool", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
        VK_CMD_WRITE_TIMESTAMP = downcallHandleVoid("vkCmdWriteTimestamp", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT);
        VK_CMD_COPY_QUERY_POOL_RESULTS = downcallHandleVoid("vkCmdCopyQueryPoolResults", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG, JAVA_INT);
        VK_CMD_EXECUTE_COMMANDS = downcallHandleVoid("vkCmdExecuteCommands", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
        VK_CREATE_EVENT = downcallHandle("vkCreateEvent", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_DESTROY_EVENT = downcallHandleVoid("vkDestroyEvent", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_GET_EVENT_STATUS = downcallHandle("vkGetEventStatus", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_SET_EVENT = downcallHandle("vkSetEvent", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_RESET_EVENT = downcallHandle("vkResetEvent", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CREATE_BUFFER_VIEW = downcallHandle("vkCreateBufferView", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_DESTROY_BUFFER_VIEW = downcallHandleVoid("vkDestroyBufferView", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CREATE_SHADER_MODULE = downcallHandle("vkCreateShaderModule", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_DESTROY_SHADER_MODULE = downcallHandleVoid("vkDestroyShaderModule", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CREATE_PIPELINE_CACHE = downcallHandle("vkCreatePipelineCache", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_DESTROY_PIPELINE_CACHE = downcallHandleVoid("vkDestroyPipelineCache", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_GET_PIPELINE_CACHE_DATA = downcallHandle("vkGetPipelineCacheData", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_MERGE_PIPELINE_CACHES = downcallHandle("vkMergePipelineCaches", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
        VK_CREATE_COMPUTE_PIPELINES = downcallHandle("vkCreateComputePipelines", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_DESTROY_PIPELINE = downcallHandleVoid("vkDestroyPipeline", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CREATE_PIPELINE_LAYOUT = downcallHandle("vkCreatePipelineLayout", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_DESTROY_PIPELINE_LAYOUT = downcallHandleVoid("vkDestroyPipelineLayout", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CREATE_SAMPLER = downcallHandle("vkCreateSampler", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_DESTROY_SAMPLER = downcallHandleVoid("vkDestroySampler", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CREATE_DESCRIPTOR_SET_LAYOUT = downcallHandle("vkCreateDescriptorSetLayout", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_DESTROY_DESCRIPTOR_SET_LAYOUT = downcallHandleVoid("vkDestroyDescriptorSetLayout", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CREATE_DESCRIPTOR_POOL = downcallHandle("vkCreateDescriptorPool", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_DESTROY_DESCRIPTOR_POOL = downcallHandleVoid("vkDestroyDescriptorPool", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_RESET_DESCRIPTOR_POOL = downcallHandle("vkResetDescriptorPool", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
        VK_ALLOCATE_DESCRIPTOR_SETS = downcallHandle("vkAllocateDescriptorSets", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_FREE_DESCRIPTOR_SETS = downcallHandle("vkFreeDescriptorSets", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
        VK_UPDATE_DESCRIPTOR_SETS = downcallHandleVoid("vkUpdateDescriptorSets", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
        VK_CMD_BIND_PIPELINE = downcallHandleVoid("vkCmdBindPipeline", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
        VK_CMD_BIND_DESCRIPTOR_SETS = downcallHandleVoid("vkCmdBindDescriptorSets", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
        VK_CMD_CLEAR_COLOR_IMAGE = downcallHandleVoid("vkCmdClearColorImage", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
        VK_CMD_DISPATCH = downcallHandleVoid("vkCmdDispatch", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, JAVA_INT);
        VK_CMD_DISPATCH_INDIRECT = downcallHandleVoid("vkCmdDispatchIndirect", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG);
        VK_CMD_SET_EVENT = downcallHandleVoid("vkCmdSetEvent", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
        VK_CMD_RESET_EVENT = downcallHandleVoid("vkCmdResetEvent", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
        VK_CMD_WAIT_EVENTS = downcallHandleVoid("vkCmdWaitEvents", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
        VK_CMD_PUSH_CONSTANTS = downcallHandleVoid("vkCmdPushConstants", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
        VK_CREATE_GRAPHICS_PIPELINES = downcallHandle("vkCreateGraphicsPipelines", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CREATE_FRAMEBUFFER = downcallHandle("vkCreateFramebuffer", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_DESTROY_FRAMEBUFFER = downcallHandleVoid("vkDestroyFramebuffer", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CREATE_RENDER_PASS = downcallHandle("vkCreateRenderPass", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_DESTROY_RENDER_PASS = downcallHandleVoid("vkDestroyRenderPass", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_GET_RENDER_AREA_GRANULARITY = downcallHandleVoid("vkGetRenderAreaGranularity", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_SET_VIEWPORT = downcallHandleVoid("vkCmdSetViewport", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
        VK_CMD_SET_SCISSOR = downcallHandleVoid("vkCmdSetScissor", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
        VK_CMD_SET_LINE_WIDTH = downcallHandleVoid("vkCmdSetLineWidth", UNBOUNDED_ADDRESS, JAVA_FLOAT);
        VK_CMD_SET_DEPTH_BIAS = downcallHandleVoid("vkCmdSetDepthBias", UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT);
        VK_CMD_SET_BLEND_CONSTANTS = downcallHandleVoid("vkCmdSetBlendConstants", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_SET_DEPTH_BOUNDS = downcallHandleVoid("vkCmdSetDepthBounds", UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT);
        VK_CMD_SET_STENCIL_COMPARE_MASK = downcallHandleVoid("vkCmdSetStencilCompareMask", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
        VK_CMD_SET_STENCIL_WRITE_MASK = downcallHandleVoid("vkCmdSetStencilWriteMask", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
        VK_CMD_SET_STENCIL_REFERENCE = downcallHandleVoid("vkCmdSetStencilReference", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
        VK_CMD_BIND_INDEX_BUFFER = downcallHandleVoid("vkCmdBindIndexBuffer", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_INT);
        VK_CMD_BIND_VERTEX_BUFFERS = downcallHandleVoid("vkCmdBindVertexBuffers", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_DRAW = downcallHandleVoid("vkCmdDraw", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT);
        VK_CMD_DRAW_INDEXED = downcallHandleVoid("vkCmdDrawIndexed", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT);
        VK_CMD_DRAW_INDIRECT = downcallHandleVoid("vkCmdDrawIndirect", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_INT, JAVA_INT);
        VK_CMD_DRAW_INDEXED_INDIRECT = downcallHandleVoid("vkCmdDrawIndexedIndirect", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_INT, JAVA_INT);
        VK_CMD_BLIT_IMAGE = downcallHandleVoid("vkCmdBlitImage", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT);
        VK_CMD_CLEAR_DEPTH_STENCIL_IMAGE = downcallHandleVoid("vkCmdClearDepthStencilImage", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
        VK_CMD_CLEAR_ATTACHMENTS = downcallHandleVoid("vkCmdClearAttachments", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
        VK_CMD_RESOLVE_IMAGE = downcallHandleVoid("vkCmdResolveImage", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
        VK_CMD_BEGIN_RENDER_PASS = downcallHandleVoid("vkCmdBeginRenderPass", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
        VK_CMD_NEXT_SUBPASS = downcallHandleVoid("vkCmdNextSubpass", UNBOUNDED_ADDRESS, JAVA_INT);
        VK_CMD_END_RENDER_PASS = downcallHandleVoid("vkCmdEndRenderPass", UNBOUNDED_ADDRESS);
        VK_BIND_BUFFER_MEMORY2 = downcallHandle("vkBindBufferMemory2", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
        VK_BIND_IMAGE_MEMORY2 = downcallHandle("vkBindImageMemory2", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
        VK_GET_DEVICE_GROUP_PEER_MEMORY_FEATURES = downcallHandleVoid("vkGetDeviceGroupPeerMemoryFeatures", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
        VK_CMD_SET_DEVICE_MASK = downcallHandleVoid("vkCmdSetDeviceMask", UNBOUNDED_ADDRESS, JAVA_INT);
        VK_GET_IMAGE_MEMORY_REQUIREMENTS2 = downcallHandleVoid("vkGetImageMemoryRequirements2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_GET_BUFFER_MEMORY_REQUIREMENTS2 = downcallHandleVoid("vkGetBufferMemoryRequirements2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_GET_IMAGE_SPARSE_MEMORY_REQUIREMENTS2 = downcallHandleVoid("vkGetImageSparseMemoryRequirements2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_TRIM_COMMAND_POOL = downcallHandleVoid("vkTrimCommandPool", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
        VK_GET_DEVICE_QUEUE2 = downcallHandleVoid("vkGetDeviceQueue2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_DISPATCH_BASE = downcallHandleVoid("vkCmdDispatchBase", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT);
        VK_CREATE_DESCRIPTOR_UPDATE_TEMPLATE = downcallHandle("vkCreateDescriptorUpdateTemplate", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_DESTROY_DESCRIPTOR_UPDATE_TEMPLATE = downcallHandleVoid("vkDestroyDescriptorUpdateTemplate", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_UPDATE_DESCRIPTOR_SET_WITH_TEMPLATE = downcallHandleVoid("vkUpdateDescriptorSetWithTemplate", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_GET_DESCRIPTOR_SET_LAYOUT_SUPPORT = downcallHandleVoid("vkGetDescriptorSetLayoutSupport", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CREATE_SAMPLER_YCBCR_CONVERSION = downcallHandle("vkCreateSamplerYcbcrConversion", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_DESTROY_SAMPLER_YCBCR_CONVERSION = downcallHandleVoid("vkDestroySamplerYcbcrConversion", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_RESET_QUERY_POOL = downcallHandleVoid("vkResetQueryPool", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
        VK_GET_SEMAPHORE_COUNTER_VALUE = downcallHandle("vkGetSemaphoreCounterValue", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_WAIT_SEMAPHORES = downcallHandle("vkWaitSemaphores", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG);
        VK_SIGNAL_SEMAPHORE = downcallHandle("vkSignalSemaphore", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_GET_BUFFER_DEVICE_ADDRESS = downcallHandle("vkGetBufferDeviceAddress", JAVA_LONG, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_GET_BUFFER_OPAQUE_CAPTURE_ADDRESS = downcallHandle("vkGetBufferOpaqueCaptureAddress", JAVA_LONG, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_GET_DEVICE_MEMORY_OPAQUE_CAPTURE_ADDRESS = downcallHandle("vkGetDeviceMemoryOpaqueCaptureAddress", JAVA_LONG, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_DRAW_INDIRECT_COUNT = downcallHandleVoid("vkCmdDrawIndirectCount", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_INT, JAVA_INT);
        VK_CMD_DRAW_INDEXED_INDIRECT_COUNT = downcallHandleVoid("vkCmdDrawIndexedIndirectCount", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_INT, JAVA_INT);
        VK_CREATE_RENDER_PASS2 = downcallHandle("vkCreateRenderPass2", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_BEGIN_RENDER_PASS2 = downcallHandleVoid("vkCmdBeginRenderPass2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_NEXT_SUBPASS2 = downcallHandleVoid("vkCmdNextSubpass2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_END_RENDER_PASS2 = downcallHandleVoid("vkCmdEndRenderPass2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CREATE_PRIVATE_DATA_SLOT = downcallHandle("vkCreatePrivateDataSlot", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_DESTROY_PRIVATE_DATA_SLOT = downcallHandleVoid("vkDestroyPrivateDataSlot", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_SET_PRIVATE_DATA = downcallHandle("vkSetPrivateData", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_LONG, UNBOUNDED_ADDRESS, JAVA_LONG);
        VK_GET_PRIVATE_DATA = downcallHandleVoid("vkGetPrivateData", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_LONG, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_PIPELINE_BARRIER2 = downcallHandleVoid("vkCmdPipelineBarrier2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_WRITE_TIMESTAMP2 = downcallHandleVoid("vkCmdWriteTimestamp2", UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS, JAVA_INT);
        VK_QUEUE_SUBMIT2 = downcallHandle("vkQueueSubmit2", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_COPY_BUFFER2 = downcallHandleVoid("vkCmdCopyBuffer2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_COPY_IMAGE2 = downcallHandleVoid("vkCmdCopyImage2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_COPY_BUFFER_TO_IMAGE2 = downcallHandleVoid("vkCmdCopyBufferToImage2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_COPY_IMAGE_TO_BUFFER2 = downcallHandleVoid("vkCmdCopyImageToBuffer2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_GET_DEVICE_BUFFER_MEMORY_REQUIREMENTS = downcallHandleVoid("vkGetDeviceBufferMemoryRequirements", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_GET_DEVICE_IMAGE_MEMORY_REQUIREMENTS = downcallHandleVoid("vkGetDeviceImageMemoryRequirements", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_GET_DEVICE_IMAGE_SPARSE_MEMORY_REQUIREMENTS = downcallHandleVoid("vkGetDeviceImageSparseMemoryRequirements", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_SET_EVENT2 = downcallHandleVoid("vkCmdSetEvent2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_RESET_EVENT2 = downcallHandleVoid("vkCmdResetEvent2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG);
        VK_CMD_WAIT_EVENTS2 = downcallHandleVoid("vkCmdWaitEvents2", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_BLIT_IMAGE2 = downcallHandleVoid("vkCmdBlitImage2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_RESOLVE_IMAGE2 = downcallHandleVoid("vkCmdResolveImage2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_BEGIN_RENDERING = downcallHandleVoid("vkCmdBeginRendering", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_END_RENDERING = downcallHandleVoid("vkCmdEndRendering", UNBOUNDED_ADDRESS);
        VK_CMD_SET_CULL_MODE = downcallHandleVoid("vkCmdSetCullMode", UNBOUNDED_ADDRESS, JAVA_INT);
        VK_CMD_SET_FRONT_FACE = downcallHandleVoid("vkCmdSetFrontFace", UNBOUNDED_ADDRESS, JAVA_INT);
        VK_CMD_SET_PRIMITIVE_TOPOLOGY = downcallHandleVoid("vkCmdSetPrimitiveTopology", UNBOUNDED_ADDRESS, JAVA_INT);
        VK_CMD_SET_VIEWPORT_WITH_COUNT = downcallHandleVoid("vkCmdSetViewportWithCount", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
        VK_CMD_SET_SCISSOR_WITH_COUNT = downcallHandleVoid("vkCmdSetScissorWithCount", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
        VK_CMD_BIND_VERTEX_BUFFERS2 = downcallHandleVoid("vkCmdBindVertexBuffers2", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_SET_DEPTH_TEST_ENABLE = downcallHandleVoid("vkCmdSetDepthTestEnable", UNBOUNDED_ADDRESS, JAVA_INT);
        VK_CMD_SET_DEPTH_WRITE_ENABLE = downcallHandleVoid("vkCmdSetDepthWriteEnable", UNBOUNDED_ADDRESS, JAVA_INT);
        VK_CMD_SET_DEPTH_COMPARE_OP = downcallHandleVoid("vkCmdSetDepthCompareOp", UNBOUNDED_ADDRESS, JAVA_INT);
        VK_CMD_SET_DEPTH_BOUNDS_TEST_ENABLE = downcallHandleVoid("vkCmdSetDepthBoundsTestEnable", UNBOUNDED_ADDRESS, JAVA_INT);
        VK_CMD_SET_STENCIL_TEST_ENABLE = downcallHandleVoid("vkCmdSetStencilTestEnable", UNBOUNDED_ADDRESS, JAVA_INT);
        VK_CMD_SET_STENCIL_OP = downcallHandleVoid("vkCmdSetStencilOp", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT);
        VK_CMD_SET_RASTERIZER_DISCARD_ENABLE = downcallHandleVoid("vkCmdSetRasterizerDiscardEnable", UNBOUNDED_ADDRESS, JAVA_INT);
        VK_CMD_SET_DEPTH_BIAS_ENABLE = downcallHandleVoid("vkCmdSetDepthBiasEnable", UNBOUNDED_ADDRESS, JAVA_INT);
        VK_CMD_SET_PRIMITIVE_RESTART_ENABLE = downcallHandleVoid("vkCmdSetPrimitiveRestartEnable", UNBOUNDED_ADDRESS, JAVA_INT);
        VK_MAP_MEMORY2 = downcallHandle("vkMapMemory2", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_UNMAP_MEMORY2 = downcallHandle("vkUnmapMemory2", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_GET_DEVICE_IMAGE_SUBRESOURCE_LAYOUT = downcallHandleVoid("vkGetDeviceImageSubresourceLayout", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_GET_IMAGE_SUBRESOURCE_LAYOUT2 = downcallHandleVoid("vkGetImageSubresourceLayout2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_COPY_MEMORY_TO_IMAGE = downcallHandle("vkCopyMemoryToImage", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_COPY_IMAGE_TO_MEMORY = downcallHandle("vkCopyImageToMemory", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_COPY_IMAGE_TO_IMAGE = downcallHandle("vkCopyImageToImage", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_TRANSITION_IMAGE_LAYOUT = downcallHandle("vkTransitionImageLayout", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
        VK_CMD_PUSH_DESCRIPTOR_SET = downcallHandleVoid("vkCmdPushDescriptorSet", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
        VK_CMD_PUSH_DESCRIPTOR_SET_WITH_TEMPLATE = downcallHandleVoid("vkCmdPushDescriptorSetWithTemplate", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
        VK_CMD_BIND_DESCRIPTOR_SETS2 = downcallHandleVoid("vkCmdBindDescriptorSets2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_PUSH_CONSTANTS2 = downcallHandleVoid("vkCmdPushConstants2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_PUSH_DESCRIPTOR_SET2 = downcallHandleVoid("vkCmdPushDescriptorSet2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_PUSH_DESCRIPTOR_SET_WITH_TEMPLATE2 = downcallHandleVoid("vkCmdPushDescriptorSetWithTemplate2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_SET_LINE_STIPPLE = downcallHandleVoid("vkCmdSetLineStipple", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_SHORT);
        VK_CMD_BIND_INDEX_BUFFER2 = downcallHandleVoid("vkCmdBindIndexBuffer2", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG, JAVA_INT);
        VK_GET_RENDERING_AREA_GRANULARITY = downcallHandleVoid("vkGetRenderingAreaGranularity", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_SET_RENDERING_ATTACHMENT_LOCATIONS = downcallHandleVoid("vkCmdSetRenderingAttachmentLocations", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_SET_RENDERING_INPUT_ATTACHMENT_INDICES = downcallHandleVoid("vkCmdSetRenderingInputAttachmentIndices", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CREATE_SWAPCHAIN_KHR = downcallHandle("vkCreateSwapchainKHR", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_DESTROY_SWAPCHAIN_KHR = downcallHandleVoid("vkDestroySwapchainKHR", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_GET_SWAPCHAIN_IMAGES_KHR = downcallHandle("vkGetSwapchainImagesKHR", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_ACQUIRE_NEXT_IMAGE_KHR = downcallHandle("vkAcquireNextImageKHR", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_QUEUE_PRESENT_KHR = downcallHandle("vkQueuePresentKHR", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_GET_DEVICE_GROUP_PRESENT_CAPABILITIES_KHR = downcallHandle("vkGetDeviceGroupPresentCapabilitiesKHR", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_GET_DEVICE_GROUP_SURFACE_PRESENT_MODES_KHR = downcallHandle("vkGetDeviceGroupSurfacePresentModesKHR", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_ACQUIRE_NEXT_IMAGE2_KHR = downcallHandle("vkAcquireNextImage2KHR", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CREATE_SHARED_SWAPCHAINS_KHR = downcallHandle("vkCreateSharedSwapchainsKHR", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CREATE_VIDEO_SESSION_KHR = downcallHandle("vkCreateVideoSessionKHR", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_DESTROY_VIDEO_SESSION_KHR = downcallHandleVoid("vkDestroyVideoSessionKHR", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_GET_VIDEO_SESSION_MEMORY_REQUIREMENTS_KHR = downcallHandle("vkGetVideoSessionMemoryRequirementsKHR", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_BIND_VIDEO_SESSION_MEMORY_KHR = downcallHandle("vkBindVideoSessionMemoryKHR", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
        VK_CREATE_VIDEO_SESSION_PARAMETERS_KHR = downcallHandle("vkCreateVideoSessionParametersKHR", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_UPDATE_VIDEO_SESSION_PARAMETERS_KHR = downcallHandle("vkUpdateVideoSessionParametersKHR", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_DESTROY_VIDEO_SESSION_PARAMETERS_KHR = downcallHandleVoid("vkDestroyVideoSessionParametersKHR", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_BEGIN_VIDEO_CODING_KHR = downcallHandleVoid("vkCmdBeginVideoCodingKHR", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_END_VIDEO_CODING_KHR = downcallHandleVoid("vkCmdEndVideoCodingKHR", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_CONTROL_VIDEO_CODING_KHR = downcallHandleVoid("vkCmdControlVideoCodingKHR", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_DECODE_VIDEO_KHR = downcallHandleVoid("vkCmdDecodeVideoKHR", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_GET_MEMORY_FD_KHR = downcallHandle("vkGetMemoryFdKHR", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_GET_MEMORY_FD_PROPERTIES_KHR = downcallHandle("vkGetMemoryFdPropertiesKHR", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
        VK_IMPORT_SEMAPHORE_FD_KHR = downcallHandle("vkImportSemaphoreFdKHR", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_GET_SEMAPHORE_FD_KHR = downcallHandle("vkGetSemaphoreFdKHR", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_GET_SWAPCHAIN_STATUS_KHR = downcallHandle("vkGetSwapchainStatusKHR", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_IMPORT_FENCE_FD_KHR = downcallHandle("vkImportFenceFdKHR", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_GET_FENCE_FD_KHR = downcallHandle("vkGetFenceFdKHR", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_ACQUIRE_PROFILING_LOCK_KHR = downcallHandle("vkAcquireProfilingLockKHR", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_RELEASE_PROFILING_LOCK_KHR = downcallHandleVoid("vkReleaseProfilingLockKHR", UNBOUNDED_ADDRESS);
        VK_CMD_SET_FRAGMENT_SHADING_RATE_KHR = downcallHandleVoid("vkCmdSetFragmentShadingRateKHR", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_WAIT_FOR_PRESENT_KHR = downcallHandle("vkWaitForPresentKHR", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG);
        VK_CREATE_DEFERRED_OPERATION_KHR = downcallHandle("vkCreateDeferredOperationKHR", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_DESTROY_DEFERRED_OPERATION_KHR = downcallHandleVoid("vkDestroyDeferredOperationKHR", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_GET_DEFERRED_OPERATION_MAX_CONCURRENCY_KHR = downcallHandle("vkGetDeferredOperationMaxConcurrencyKHR", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_GET_DEFERRED_OPERATION_RESULT_KHR = downcallHandle("vkGetDeferredOperationResultKHR", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_DEFERRED_OPERATION_JOIN_KHR = downcallHandle("vkDeferredOperationJoinKHR", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_GET_PIPELINE_EXECUTABLE_PROPERTIES_KHR = downcallHandle("vkGetPipelineExecutablePropertiesKHR", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_GET_PIPELINE_EXECUTABLE_STATISTICS_KHR = downcallHandle("vkGetPipelineExecutableStatisticsKHR", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_GET_PIPELINE_EXECUTABLE_INTERNAL_REPRESENTATIONS_KHR = downcallHandle("vkGetPipelineExecutableInternalRepresentationsKHR", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_GET_ENCODED_VIDEO_SESSION_PARAMETERS_KHR = downcallHandle("vkGetEncodedVideoSessionParametersKHR", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_ENCODE_VIDEO_KHR = downcallHandleVoid("vkCmdEncodeVideoKHR", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_BIND_INDEX_BUFFER3_KHR = downcallHandleVoid("vkCmdBindIndexBuffer3KHR", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_BIND_VERTEX_BUFFERS3_KHR = downcallHandleVoid("vkCmdBindVertexBuffers3KHR", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
        VK_CMD_DRAW_INDIRECT2_KHR = downcallHandleVoid("vkCmdDrawIndirect2KHR", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_DRAW_INDEXED_INDIRECT2_KHR = downcallHandleVoid("vkCmdDrawIndexedIndirect2KHR", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_DISPATCH_INDIRECT2_KHR = downcallHandleVoid("vkCmdDispatchIndirect2KHR", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_COPY_MEMORY_KHR = downcallHandleVoid("vkCmdCopyMemoryKHR", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_COPY_MEMORY_TO_IMAGE_KHR = downcallHandleVoid("vkCmdCopyMemoryToImageKHR", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_COPY_IMAGE_TO_MEMORY_KHR = downcallHandleVoid("vkCmdCopyImageToMemoryKHR", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_UPDATE_MEMORY_KHR = downcallHandleVoid("vkCmdUpdateMemoryKHR", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_LONG, UNBOUNDED_ADDRESS);
        VK_CMD_FILL_MEMORY_KHR = downcallHandleVoid("vkCmdFillMemoryKHR", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
        VK_CMD_COPY_QUERY_POOL_RESULTS_TO_MEMORY_KHR = downcallHandleVoid("vkCmdCopyQueryPoolResultsToMemoryKHR", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
        VK_CMD_DRAW_INDIRECT_COUNT2_KHR = downcallHandleVoid("vkCmdDrawIndirectCount2KHR", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_DRAW_INDEXED_INDIRECT_COUNT2_KHR = downcallHandleVoid("vkCmdDrawIndexedIndirectCount2KHR", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_BEGIN_CONDITIONAL_RENDERING2_EXT = downcallHandleVoid("vkCmdBeginConditionalRendering2EXT", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_BIND_TRANSFORM_FEEDBACK_BUFFERS2_EXT = downcallHandleVoid("vkCmdBindTransformFeedbackBuffers2EXT", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
        VK_CMD_BEGIN_TRANSFORM_FEEDBACK2_EXT = downcallHandleVoid("vkCmdBeginTransformFeedback2EXT", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
        VK_CMD_END_TRANSFORM_FEEDBACK2_EXT = downcallHandleVoid("vkCmdEndTransformFeedback2EXT", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
        VK_CMD_DRAW_INDIRECT_BYTE_COUNT2_EXT = downcallHandleVoid("vkCmdDrawIndirectByteCount2EXT", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
        VK_CMD_DRAW_MESH_TASKS_INDIRECT2_EXT = downcallHandleVoid("vkCmdDrawMeshTasksIndirect2EXT", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_DRAW_MESH_TASKS_INDIRECT_COUNT2_EXT = downcallHandleVoid("vkCmdDrawMeshTasksIndirectCount2EXT", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_WRITE_MARKER_TO_MEMORY_AMD = downcallHandleVoid("vkCmdWriteMarkerToMemoryAMD", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CREATE_ACCELERATION_STRUCTURE2_KHR = downcallHandle("vkCreateAccelerationStructure2KHR", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_TRACE_RAYS_INDIRECT2_KHR = downcallHandleVoid("vkCmdTraceRaysIndirect2KHR", UNBOUNDED_ADDRESS, JAVA_LONG);
        VK_WAIT_FOR_PRESENT2_KHR = downcallHandle("vkWaitForPresent2KHR", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CREATE_PIPELINE_BINARIES_KHR = downcallHandle("vkCreatePipelineBinariesKHR", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_DESTROY_PIPELINE_BINARY_KHR = downcallHandleVoid("vkDestroyPipelineBinaryKHR", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_GET_PIPELINE_KEY_KHR = downcallHandle("vkGetPipelineKeyKHR", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_GET_PIPELINE_BINARY_DATA_KHR = downcallHandle("vkGetPipelineBinaryDataKHR", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_RELEASE_CAPTURED_PIPELINE_DATA_KHR = downcallHandle("vkReleaseCapturedPipelineDataKHR", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_RELEASE_SWAPCHAIN_IMAGES_KHR = downcallHandle("vkReleaseSwapchainImagesKHR", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_GET_CALIBRATED_TIMESTAMPS_KHR = downcallHandle("vkGetCalibratedTimestampsKHR", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_SET_DESCRIPTOR_BUFFER_OFFSETS2_EXT = downcallHandleVoid("vkCmdSetDescriptorBufferOffsets2EXT", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_BIND_DESCRIPTOR_BUFFER_EMBEDDED_SAMPLERS2_EXT = downcallHandleVoid("vkCmdBindDescriptorBufferEmbeddedSamplers2EXT", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_COPY_MEMORY_INDIRECT_KHR = downcallHandleVoid("vkCmdCopyMemoryIndirectKHR", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_COPY_MEMORY_TO_IMAGE_INDIRECT_KHR = downcallHandleVoid("vkCmdCopyMemoryToImageIndirectKHR", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_GET_DEVICE_FAULT_REPORTS_KHR = downcallHandle("vkGetDeviceFaultReportsKHR", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_GET_DEVICE_FAULT_DEBUG_INFO_KHR = downcallHandle("vkGetDeviceFaultDebugInfoKHR", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_END_RENDERING2_KHR = downcallHandleVoid("vkCmdEndRendering2KHR", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_DEBUG_MARKER_SET_OBJECT_TAG_EXT = downcallHandle("vkDebugMarkerSetObjectTagEXT", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_DEBUG_MARKER_SET_OBJECT_NAME_EXT = downcallHandle("vkDebugMarkerSetObjectNameEXT", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_DEBUG_MARKER_BEGIN_EXT = downcallHandleVoid("vkCmdDebugMarkerBeginEXT", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_DEBUG_MARKER_END_EXT = downcallHandleVoid("vkCmdDebugMarkerEndEXT", UNBOUNDED_ADDRESS);
        VK_CMD_DEBUG_MARKER_INSERT_EXT = downcallHandleVoid("vkCmdDebugMarkerInsertEXT", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_BIND_TRANSFORM_FEEDBACK_BUFFERS_EXT = downcallHandleVoid("vkCmdBindTransformFeedbackBuffersEXT", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_BEGIN_TRANSFORM_FEEDBACK_EXT = downcallHandleVoid("vkCmdBeginTransformFeedbackEXT", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_END_TRANSFORM_FEEDBACK_EXT = downcallHandleVoid("vkCmdEndTransformFeedbackEXT", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_BEGIN_QUERY_INDEXED_EXT = downcallHandleVoid("vkCmdBeginQueryIndexedEXT", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, JAVA_INT);
        VK_CMD_END_QUERY_INDEXED_EXT = downcallHandleVoid("vkCmdEndQueryIndexedEXT", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
        VK_CMD_DRAW_INDIRECT_BYTE_COUNT_EXT = downcallHandleVoid("vkCmdDrawIndirectByteCountEXT", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_INT, JAVA_INT);
        VK_CREATE_CU_MODULE_NVX = downcallHandle("vkCreateCuModuleNVX", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CREATE_CU_FUNCTION_NVX = downcallHandle("vkCreateCuFunctionNVX", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_DESTROY_CU_MODULE_NVX = downcallHandleVoid("vkDestroyCuModuleNVX", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_DESTROY_CU_FUNCTION_NVX = downcallHandleVoid("vkDestroyCuFunctionNVX", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_CU_LAUNCH_KERNEL_NVX = downcallHandleVoid("vkCmdCuLaunchKernelNVX", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_GET_IMAGE_VIEW_HANDLE_NVX = downcallHandle("vkGetImageViewHandleNVX", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_GET_IMAGE_VIEW_HANDLE64_NVX = downcallHandle("vkGetImageViewHandle64NVX", JAVA_LONG, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_GET_IMAGE_VIEW_ADDRESS_NVX = downcallHandle("vkGetImageViewAddressNVX", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_GET_DEVICE_COMBINED_IMAGE_SAMPLER_INDEX_NVX = downcallHandle("vkGetDeviceCombinedImageSamplerIndexNVX", JAVA_LONG, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG);
        VK_GET_SHADER_INFO_AMD = downcallHandle("vkGetShaderInfoAMD", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_BEGIN_CONDITIONAL_RENDERING_EXT = downcallHandleVoid("vkCmdBeginConditionalRenderingEXT", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_END_CONDITIONAL_RENDERING_EXT = downcallHandleVoid("vkCmdEndConditionalRenderingEXT", UNBOUNDED_ADDRESS);
        VK_CMD_SET_VIEWPORT_WSCALING_NV = downcallHandleVoid("vkCmdSetViewportWScalingNV", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
        VK_DISPLAY_POWER_CONTROL_EXT = downcallHandle("vkDisplayPowerControlEXT", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_REGISTER_DEVICE_EVENT_EXT = downcallHandle("vkRegisterDeviceEventEXT", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_REGISTER_DISPLAY_EVENT_EXT = downcallHandle("vkRegisterDisplayEventEXT", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_GET_SWAPCHAIN_COUNTER_EXT = downcallHandle("vkGetSwapchainCounterEXT", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
        VK_GET_REFRESH_CYCLE_DURATION_GOOGLE = downcallHandle("vkGetRefreshCycleDurationGOOGLE", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_GET_PAST_PRESENTATION_TIMING_GOOGLE = downcallHandle("vkGetPastPresentationTimingGOOGLE", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_SET_DISCARD_RECTANGLE_EXT = downcallHandleVoid("vkCmdSetDiscardRectangleEXT", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
        VK_CMD_SET_DISCARD_RECTANGLE_ENABLE_EXT = downcallHandleVoid("vkCmdSetDiscardRectangleEnableEXT", UNBOUNDED_ADDRESS, JAVA_INT);
        VK_CMD_SET_DISCARD_RECTANGLE_MODE_EXT = downcallHandleVoid("vkCmdSetDiscardRectangleModeEXT", UNBOUNDED_ADDRESS, JAVA_INT);
        VK_SET_HDR_METADATA_EXT = downcallHandleVoid("vkSetHdrMetadataEXT", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_SET_DEBUG_UTILS_OBJECT_NAME_EXT = downcallHandle("vkSetDebugUtilsObjectNameEXT", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_SET_DEBUG_UTILS_OBJECT_TAG_EXT = downcallHandle("vkSetDebugUtilsObjectTagEXT", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_QUEUE_BEGIN_DEBUG_UTILS_LABEL_EXT = downcallHandleVoid("vkQueueBeginDebugUtilsLabelEXT", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_QUEUE_END_DEBUG_UTILS_LABEL_EXT = downcallHandleVoid("vkQueueEndDebugUtilsLabelEXT", UNBOUNDED_ADDRESS);
        VK_QUEUE_INSERT_DEBUG_UTILS_LABEL_EXT = downcallHandleVoid("vkQueueInsertDebugUtilsLabelEXT", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_BEGIN_DEBUG_UTILS_LABEL_EXT = downcallHandleVoid("vkCmdBeginDebugUtilsLabelEXT", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_END_DEBUG_UTILS_LABEL_EXT = downcallHandleVoid("vkCmdEndDebugUtilsLabelEXT", UNBOUNDED_ADDRESS);
        VK_CMD_INSERT_DEBUG_UTILS_LABEL_EXT = downcallHandleVoid("vkCmdInsertDebugUtilsLabelEXT", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CREATE_GPA_SESSION_AMD = downcallHandle("vkCreateGpaSessionAMD", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_DESTROY_GPA_SESSION_AMD = downcallHandleVoid("vkDestroyGpaSessionAMD", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_SET_GPA_DEVICE_CLOCK_MODE_AMD = downcallHandle("vkSetGpaDeviceClockModeAMD", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_GET_GPA_DEVICE_CLOCK_INFO_AMD = downcallHandle("vkGetGpaDeviceClockInfoAMD", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_BEGIN_GPA_SESSION_AMD = downcallHandle("vkCmdBeginGpaSessionAMD", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_END_GPA_SESSION_AMD = downcallHandle("vkCmdEndGpaSessionAMD", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_BEGIN_GPA_SAMPLE_AMD = downcallHandle("vkCmdBeginGpaSampleAMD", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_END_GPA_SAMPLE_AMD = downcallHandleVoid("vkCmdEndGpaSampleAMD", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
        VK_GET_GPA_SESSION_STATUS_AMD = downcallHandle("vkGetGpaSessionStatusAMD", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_GET_GPA_SESSION_RESULTS_AMD = downcallHandle("vkGetGpaSessionResultsAMD", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_RESET_GPA_SESSION_AMD = downcallHandle("vkResetGpaSessionAMD", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_COPY_GPA_SESSION_RESULTS_AMD = downcallHandleVoid("vkCmdCopyGpaSessionResultsAMD", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_WRITE_SAMPLER_DESCRIPTORS_EXT = downcallHandle("vkWriteSamplerDescriptorsEXT", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_WRITE_RESOURCE_DESCRIPTORS_EXT = downcallHandle("vkWriteResourceDescriptorsEXT", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_BIND_SAMPLER_HEAP_EXT = downcallHandleVoid("vkCmdBindSamplerHeapEXT", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_BIND_RESOURCE_HEAP_EXT = downcallHandleVoid("vkCmdBindResourceHeapEXT", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_PUSH_DATA_EXT = downcallHandleVoid("vkCmdPushDataEXT", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_GET_IMAGE_OPAQUE_CAPTURE_DATA_EXT = downcallHandle("vkGetImageOpaqueCaptureDataEXT", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_REGISTER_CUSTOM_BORDER_COLOR_EXT = downcallHandle("vkRegisterCustomBorderColorEXT", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
        VK_UNREGISTER_CUSTOM_BORDER_COLOR_EXT = downcallHandleVoid("vkUnregisterCustomBorderColorEXT", UNBOUNDED_ADDRESS, JAVA_INT);
        VK_GET_TENSOR_OPAQUE_CAPTURE_DATA_ARM = downcallHandle("vkGetTensorOpaqueCaptureDataARM", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_SET_SAMPLE_LOCATIONS_EXT = downcallHandleVoid("vkCmdSetSampleLocationsEXT", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_GET_IMAGE_DRM_FORMAT_MODIFIER_PROPERTIES_EXT = downcallHandle("vkGetImageDrmFormatModifierPropertiesEXT", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CREATE_VALIDATION_CACHE_EXT = downcallHandle("vkCreateValidationCacheEXT", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_DESTROY_VALIDATION_CACHE_EXT = downcallHandleVoid("vkDestroyValidationCacheEXT", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_MERGE_VALIDATION_CACHES_EXT = downcallHandle("vkMergeValidationCachesEXT", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
        VK_GET_VALIDATION_CACHE_DATA_EXT = downcallHandle("vkGetValidationCacheDataEXT", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_BIND_SHADING_RATE_IMAGE_NV = downcallHandleVoid("vkCmdBindShadingRateImageNV", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
        VK_CMD_SET_VIEWPORT_SHADING_RATE_PALETTE_NV = downcallHandleVoid("vkCmdSetViewportShadingRatePaletteNV", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
        VK_CMD_SET_COARSE_SAMPLE_ORDER_NV = downcallHandleVoid("vkCmdSetCoarseSampleOrderNV", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
        VK_CREATE_ACCELERATION_STRUCTURE_NV = downcallHandle("vkCreateAccelerationStructureNV", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_DESTROY_ACCELERATION_STRUCTURE_NV = downcallHandleVoid("vkDestroyAccelerationStructureNV", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_GET_ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_NV = downcallHandleVoid("vkGetAccelerationStructureMemoryRequirementsNV", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_BIND_ACCELERATION_STRUCTURE_MEMORY_NV = downcallHandle("vkBindAccelerationStructureMemoryNV", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
        VK_CMD_BUILD_ACCELERATION_STRUCTURE_NV = downcallHandleVoid("vkCmdBuildAccelerationStructureNV", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG);
        VK_CMD_COPY_ACCELERATION_STRUCTURE_NV = downcallHandleVoid("vkCmdCopyAccelerationStructureNV", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
        VK_CMD_TRACE_RAYS_NV = downcallHandleVoid("vkCmdTraceRaysNV", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG, JAVA_INT, JAVA_INT, JAVA_INT);
        VK_CREATE_RAY_TRACING_PIPELINES_NV = downcallHandle("vkCreateRayTracingPipelinesNV", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_GET_RAY_TRACING_SHADER_GROUP_HANDLES_KHR = downcallHandle("vkGetRayTracingShaderGroupHandlesKHR", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, JAVA_LONG, UNBOUNDED_ADDRESS);
        VK_GET_ACCELERATION_STRUCTURE_HANDLE_NV = downcallHandle("vkGetAccelerationStructureHandleNV", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS);
        VK_CMD_WRITE_ACCELERATION_STRUCTURES_PROPERTIES_NV = downcallHandleVoid("vkCmdWriteAccelerationStructuresPropertiesNV", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT);
        VK_COMPILE_DEFERRED_NV = downcallHandle("vkCompileDeferredNV", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
        VK_GET_MEMORY_HOST_POINTER_PROPERTIES_EXT = downcallHandle("vkGetMemoryHostPointerPropertiesEXT", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_WRITE_BUFFER_MARKER_AMD = downcallHandleVoid("vkCmdWriteBufferMarkerAMD", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_INT);
        VK_CMD_WRITE_BUFFER_MARKER2_AMD = downcallHandleVoid("vkCmdWriteBufferMarker2AMD", UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_INT);
        VK_CMD_DRAW_MESH_TASKS_NV = downcallHandleVoid("vkCmdDrawMeshTasksNV", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
        VK_CMD_DRAW_MESH_TASKS_INDIRECT_NV = downcallHandleVoid("vkCmdDrawMeshTasksIndirectNV", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_INT, JAVA_INT);
        VK_CMD_DRAW_MESH_TASKS_INDIRECT_COUNT_NV = downcallHandleVoid("vkCmdDrawMeshTasksIndirectCountNV", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_INT, JAVA_INT);
        VK_CMD_SET_EXCLUSIVE_SCISSOR_ENABLE_NV = downcallHandleVoid("vkCmdSetExclusiveScissorEnableNV", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
        VK_CMD_SET_EXCLUSIVE_SCISSOR_NV = downcallHandleVoid("vkCmdSetExclusiveScissorNV", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
        VK_CMD_SET_CHECKPOINT_NV = downcallHandleVoid("vkCmdSetCheckpointNV", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_GET_QUEUE_CHECKPOINT_DATA_NV = downcallHandleVoid("vkGetQueueCheckpointDataNV", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_GET_QUEUE_CHECKPOINT_DATA2_NV = downcallHandleVoid("vkGetQueueCheckpointData2NV", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_SET_SWAPCHAIN_PRESENT_TIMING_QUEUE_SIZE_EXT = downcallHandle("vkSetSwapchainPresentTimingQueueSizeEXT", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
        VK_GET_SWAPCHAIN_TIMING_PROPERTIES_EXT = downcallHandle("vkGetSwapchainTimingPropertiesEXT", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_GET_SWAPCHAIN_TIME_DOMAIN_PROPERTIES_EXT = downcallHandle("vkGetSwapchainTimeDomainPropertiesEXT", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_GET_PAST_PRESENTATION_TIMING_EXT = downcallHandle("vkGetPastPresentationTimingEXT", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_INITIALIZE_PERFORMANCE_API_INTEL = downcallHandle("vkInitializePerformanceApiINTEL", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_UNINITIALIZE_PERFORMANCE_API_INTEL = downcallHandleVoid("vkUninitializePerformanceApiINTEL", UNBOUNDED_ADDRESS);
        VK_CMD_SET_PERFORMANCE_MARKER_INTEL = downcallHandle("vkCmdSetPerformanceMarkerINTEL", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_SET_PERFORMANCE_STREAM_MARKER_INTEL = downcallHandle("vkCmdSetPerformanceStreamMarkerINTEL", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_SET_PERFORMANCE_OVERRIDE_INTEL = downcallHandle("vkCmdSetPerformanceOverrideINTEL", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_ACQUIRE_PERFORMANCE_CONFIGURATION_INTEL = downcallHandle("vkAcquirePerformanceConfigurationINTEL", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_RELEASE_PERFORMANCE_CONFIGURATION_INTEL = downcallHandle("vkReleasePerformanceConfigurationINTEL", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_QUEUE_SET_PERFORMANCE_CONFIGURATION_INTEL = downcallHandle("vkQueueSetPerformanceConfigurationINTEL", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_GET_PERFORMANCE_PARAMETER_INTEL = downcallHandle("vkGetPerformanceParameterINTEL", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
        VK_SET_LOCAL_DIMMING_AMD = downcallHandleVoid("vkSetLocalDimmingAMD", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
        VK_GET_GENERATED_COMMANDS_MEMORY_REQUIREMENTS_NV = downcallHandleVoid("vkGetGeneratedCommandsMemoryRequirementsNV", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_PREPROCESS_GENERATED_COMMANDS_NV = downcallHandleVoid("vkCmdPreprocessGeneratedCommandsNV", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_EXECUTE_GENERATED_COMMANDS_NV = downcallHandleVoid("vkCmdExecuteGeneratedCommandsNV", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
        VK_CMD_BIND_PIPELINE_SHADER_GROUP_NV = downcallHandleVoid("vkCmdBindPipelineShaderGroupNV", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT);
        VK_CREATE_INDIRECT_COMMANDS_LAYOUT_NV = downcallHandle("vkCreateIndirectCommandsLayoutNV", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_DESTROY_INDIRECT_COMMANDS_LAYOUT_NV = downcallHandleVoid("vkDestroyIndirectCommandsLayoutNV", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_SET_DEPTH_BIAS2_EXT = downcallHandleVoid("vkCmdSetDepthBias2EXT", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_QUEUE_SET_PERF_HINT_QCOM = downcallHandle("vkQueueSetPerfHintQCOM", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_DISPATCH_TILE_QCOM = downcallHandleVoid("vkCmdDispatchTileQCOM", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_BEGIN_PER_TILE_EXECUTION_QCOM = downcallHandleVoid("vkCmdBeginPerTileExecutionQCOM", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_END_PER_TILE_EXECUTION_QCOM = downcallHandleVoid("vkCmdEndPerTileExecutionQCOM", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_SET_LATENCY_SLEEP_MODE_LEGACY_NV = downcallHandleVoid("vkSetLatencySleepModeLegacyNV", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, JAVA_INT);
        VK_LATENCY_SLEEP_LEGACY_NV = downcallHandleVoid("vkLatencySleepLegacyNV", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG);
        VK_SET_LATENCY_MARKER_LEGACY_NV = downcallHandleVoid("vkSetLatencyMarkerLegacyNV", UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_INT);
        VK_GET_LATENCY_TIMINGS_LEGACY_NV = downcallHandleVoid("vkGetLatencyTimingsLegacyNV", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_QUEUE_NOTIFY_OUT_OF_BAND_LEGACY_NV = downcallHandleVoid("vkQueueNotifyOutOfBandLegacyNV", UNBOUNDED_ADDRESS, JAVA_INT);
        VK_GET_SLEEP_STATUS_LEGACY_NV = downcallHandleVoid("vkGetSleepStatusLegacyNV", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_SHUTDOWN_LATENCY_DEVICE_LEGACY_NV = downcallHandleVoid("vkShutdownLatencyDeviceLegacyNV", UNBOUNDED_ADDRESS);
        VK_GET_DESCRIPTOR_SET_LAYOUT_SIZE_EXT = downcallHandleVoid("vkGetDescriptorSetLayoutSizeEXT", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_GET_DESCRIPTOR_SET_LAYOUT_BINDING_OFFSET_EXT = downcallHandleVoid("vkGetDescriptorSetLayoutBindingOffsetEXT", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
        VK_GET_DESCRIPTOR_EXT = downcallHandleVoid("vkGetDescriptorEXT", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS);
        VK_CMD_BIND_DESCRIPTOR_BUFFERS_EXT = downcallHandleVoid("vkCmdBindDescriptorBuffersEXT", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
        VK_CMD_SET_DESCRIPTOR_BUFFER_OFFSETS_EXT = downcallHandleVoid("vkCmdSetDescriptorBufferOffsetsEXT", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_BIND_DESCRIPTOR_BUFFER_EMBEDDED_SAMPLERS_EXT = downcallHandleVoid("vkCmdBindDescriptorBufferEmbeddedSamplersEXT", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT);
        VK_GET_BUFFER_OPAQUE_CAPTURE_DESCRIPTOR_DATA_EXT = downcallHandle("vkGetBufferOpaqueCaptureDescriptorDataEXT", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_GET_IMAGE_OPAQUE_CAPTURE_DESCRIPTOR_DATA_EXT = downcallHandle("vkGetImageOpaqueCaptureDescriptorDataEXT", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_GET_IMAGE_VIEW_OPAQUE_CAPTURE_DESCRIPTOR_DATA_EXT = downcallHandle("vkGetImageViewOpaqueCaptureDescriptorDataEXT", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_GET_SAMPLER_OPAQUE_CAPTURE_DESCRIPTOR_DATA_EXT = downcallHandle("vkGetSamplerOpaqueCaptureDescriptorDataEXT", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_GET_ACCELERATION_STRUCTURE_OPAQUE_CAPTURE_DESCRIPTOR_DATA_EXT = downcallHandle("vkGetAccelerationStructureOpaqueCaptureDescriptorDataEXT", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_SET_FRAGMENT_SHADING_RATE_ENUM_NV = downcallHandleVoid("vkCmdSetFragmentShadingRateEnumNV", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
        VK_GET_DEVICE_FAULT_INFO_EXT = downcallHandle("vkGetDeviceFaultInfoEXT", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_SET_VERTEX_INPUT_EXT = downcallHandleVoid("vkCmdSetVertexInputEXT", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
        VK_GET_DEVICE_SUBPASS_SHADING_MAX_WORKGROUP_SIZE_HUAWEI = downcallHandle("vkGetDeviceSubpassShadingMaxWorkgroupSizeHUAWEI", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_SUBPASS_SHADING_HUAWEI = downcallHandleVoid("vkCmdSubpassShadingHUAWEI", UNBOUNDED_ADDRESS);
        VK_CMD_BIND_INVOCATION_MASK_HUAWEI = downcallHandleVoid("vkCmdBindInvocationMaskHUAWEI", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
        VK_GET_MEMORY_REMOTE_ADDRESS_NV = downcallHandle("vkGetMemoryRemoteAddressNV", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_GET_PIPELINE_PROPERTIES_EXT = downcallHandle("vkGetPipelinePropertiesEXT", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_SET_PATCH_CONTROL_POINTS_EXT = downcallHandleVoid("vkCmdSetPatchControlPointsEXT", UNBOUNDED_ADDRESS, JAVA_INT);
        VK_CMD_SET_LOGIC_OP_EXT = downcallHandleVoid("vkCmdSetLogicOpEXT", UNBOUNDED_ADDRESS, JAVA_INT);
        VK_CMD_SET_COLOR_WRITE_ENABLE_EXT = downcallHandleVoid("vkCmdSetColorWriteEnableEXT", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
        VK_CMD_DRAW_MULTI_EXT = downcallHandleVoid("vkCmdDrawMultiEXT", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, JAVA_INT);
        VK_CMD_DRAW_MULTI_INDEXED_EXT = downcallHandleVoid("vkCmdDrawMultiIndexedEXT", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
        VK_CREATE_MICROMAP_EXT = downcallHandle("vkCreateMicromapEXT", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_DESTROY_MICROMAP_EXT = downcallHandleVoid("vkDestroyMicromapEXT", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_BUILD_MICROMAPS_EXT = downcallHandleVoid("vkCmdBuildMicromapsEXT", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
        VK_BUILD_MICROMAPS_EXT = downcallHandle("vkBuildMicromapsEXT", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
        VK_COPY_MICROMAP_EXT = downcallHandle("vkCopyMicromapEXT", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_COPY_MICROMAP_TO_MEMORY_EXT = downcallHandle("vkCopyMicromapToMemoryEXT", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_COPY_MEMORY_TO_MICROMAP_EXT = downcallHandle("vkCopyMemoryToMicromapEXT", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_WRITE_MICROMAPS_PROPERTIES_EXT = downcallHandle("vkWriteMicromapsPropertiesEXT", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_LONG, UNBOUNDED_ADDRESS, JAVA_LONG);
        VK_CMD_COPY_MICROMAP_EXT = downcallHandleVoid("vkCmdCopyMicromapEXT", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_COPY_MICROMAP_TO_MEMORY_EXT = downcallHandleVoid("vkCmdCopyMicromapToMemoryEXT", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_COPY_MEMORY_TO_MICROMAP_EXT = downcallHandleVoid("vkCmdCopyMemoryToMicromapEXT", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_WRITE_MICROMAPS_PROPERTIES_EXT = downcallHandleVoid("vkCmdWriteMicromapsPropertiesEXT", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT);
        VK_GET_DEVICE_MICROMAP_COMPATIBILITY_EXT = downcallHandleVoid("vkGetDeviceMicromapCompatibilityEXT", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_GET_MICROMAP_BUILD_SIZES_EXT = downcallHandleVoid("vkGetMicromapBuildSizesEXT", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_DRAW_CLUSTER_HUAWEI = downcallHandleVoid("vkCmdDrawClusterHUAWEI", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, JAVA_INT);
        VK_CMD_DRAW_CLUSTER_INDIRECT_HUAWEI = downcallHandleVoid("vkCmdDrawClusterIndirectHUAWEI", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG);
        VK_SET_DEVICE_MEMORY_PRIORITY_EXT = downcallHandleVoid("vkSetDeviceMemoryPriorityEXT", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT);
        VK_CMD_SET_DISPATCH_PARAMETERS_ARM = downcallHandleVoid("vkCmdSetDispatchParametersARM", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_GET_DESCRIPTOR_SET_LAYOUT_HOST_MAPPING_INFO_VALVE = downcallHandleVoid("vkGetDescriptorSetLayoutHostMappingInfoVALVE", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_GET_DESCRIPTOR_SET_HOST_MAPPING_VALVE = downcallHandleVoid("vkGetDescriptorSetHostMappingVALVE", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_COPY_MEMORY_INDIRECT_NV = downcallHandleVoid("vkCmdCopyMemoryIndirectNV", UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_INT, JAVA_INT);
        VK_CMD_COPY_MEMORY_TO_IMAGE_INDIRECT_NV = downcallHandleVoid("vkCmdCopyMemoryToImageIndirectNV", UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
        VK_CMD_DECOMPRESS_MEMORY_NV = downcallHandleVoid("vkCmdDecompressMemoryNV", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
        VK_CMD_DECOMPRESS_MEMORY_INDIRECT_COUNT_NV = downcallHandleVoid("vkCmdDecompressMemoryIndirectCountNV", UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG, JAVA_INT);
        VK_GET_PIPELINE_INDIRECT_MEMORY_REQUIREMENTS_NV = downcallHandleVoid("vkGetPipelineIndirectMemoryRequirementsNV", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_UPDATE_PIPELINE_INDIRECT_BUFFER_NV = downcallHandleVoid("vkCmdUpdatePipelineIndirectBufferNV", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
        VK_GET_PIPELINE_INDIRECT_DEVICE_ADDRESS_NV = downcallHandle("vkGetPipelineIndirectDeviceAddressNV", JAVA_LONG, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_SET_DEPTH_CLAMP_ENABLE_EXT = downcallHandleVoid("vkCmdSetDepthClampEnableEXT", UNBOUNDED_ADDRESS, JAVA_INT);
        VK_CMD_SET_POLYGON_MODE_EXT = downcallHandleVoid("vkCmdSetPolygonModeEXT", UNBOUNDED_ADDRESS, JAVA_INT);
        VK_CMD_SET_RASTERIZATION_SAMPLES_EXT = downcallHandleVoid("vkCmdSetRasterizationSamplesEXT", UNBOUNDED_ADDRESS, JAVA_INT);
        VK_CMD_SET_SAMPLE_MASK_EXT = downcallHandleVoid("vkCmdSetSampleMaskEXT", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
        VK_CMD_SET_ALPHA_TO_COVERAGE_ENABLE_EXT = downcallHandleVoid("vkCmdSetAlphaToCoverageEnableEXT", UNBOUNDED_ADDRESS, JAVA_INT);
        VK_CMD_SET_ALPHA_TO_ONE_ENABLE_EXT = downcallHandleVoid("vkCmdSetAlphaToOneEnableEXT", UNBOUNDED_ADDRESS, JAVA_INT);
        VK_CMD_SET_LOGIC_OP_ENABLE_EXT = downcallHandleVoid("vkCmdSetLogicOpEnableEXT", UNBOUNDED_ADDRESS, JAVA_INT);
        VK_CMD_SET_COLOR_BLEND_ENABLE_EXT = downcallHandleVoid("vkCmdSetColorBlendEnableEXT", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
        VK_CMD_SET_COLOR_BLEND_EQUATION_EXT = downcallHandleVoid("vkCmdSetColorBlendEquationEXT", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
        VK_CMD_SET_COLOR_WRITE_MASK_EXT = downcallHandleVoid("vkCmdSetColorWriteMaskEXT", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
        VK_CMD_SET_TESSELLATION_DOMAIN_ORIGIN_EXT = downcallHandleVoid("vkCmdSetTessellationDomainOriginEXT", UNBOUNDED_ADDRESS, JAVA_INT);
        VK_CMD_SET_RASTERIZATION_STREAM_EXT = downcallHandleVoid("vkCmdSetRasterizationStreamEXT", UNBOUNDED_ADDRESS, JAVA_INT);
        VK_CMD_SET_CONSERVATIVE_RASTERIZATION_MODE_EXT = downcallHandleVoid("vkCmdSetConservativeRasterizationModeEXT", UNBOUNDED_ADDRESS, JAVA_INT);
        VK_CMD_SET_EXTRA_PRIMITIVE_OVERESTIMATION_SIZE_EXT = downcallHandleVoid("vkCmdSetExtraPrimitiveOverestimationSizeEXT", UNBOUNDED_ADDRESS, JAVA_FLOAT);
        VK_CMD_SET_DEPTH_CLIP_ENABLE_EXT = downcallHandleVoid("vkCmdSetDepthClipEnableEXT", UNBOUNDED_ADDRESS, JAVA_INT);
        VK_CMD_SET_SAMPLE_LOCATIONS_ENABLE_EXT = downcallHandleVoid("vkCmdSetSampleLocationsEnableEXT", UNBOUNDED_ADDRESS, JAVA_INT);
        VK_CMD_SET_COLOR_BLEND_ADVANCED_EXT = downcallHandleVoid("vkCmdSetColorBlendAdvancedEXT", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
        VK_CMD_SET_PROVOKING_VERTEX_MODE_EXT = downcallHandleVoid("vkCmdSetProvokingVertexModeEXT", UNBOUNDED_ADDRESS, JAVA_INT);
        VK_CMD_SET_LINE_RASTERIZATION_MODE_EXT = downcallHandleVoid("vkCmdSetLineRasterizationModeEXT", UNBOUNDED_ADDRESS, JAVA_INT);
        VK_CMD_SET_LINE_STIPPLE_ENABLE_EXT = downcallHandleVoid("vkCmdSetLineStippleEnableEXT", UNBOUNDED_ADDRESS, JAVA_INT);
        VK_CMD_SET_DEPTH_CLIP_NEGATIVE_ONE_TO_ONE_EXT = downcallHandleVoid("vkCmdSetDepthClipNegativeOneToOneEXT", UNBOUNDED_ADDRESS, JAVA_INT);
        VK_CMD_SET_VIEWPORT_WSCALING_ENABLE_NV = downcallHandleVoid("vkCmdSetViewportWScalingEnableNV", UNBOUNDED_ADDRESS, JAVA_INT);
        VK_CMD_SET_VIEWPORT_SWIZZLE_NV = downcallHandleVoid("vkCmdSetViewportSwizzleNV", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
        VK_CMD_SET_COVERAGE_TO_COLOR_ENABLE_NV = downcallHandleVoid("vkCmdSetCoverageToColorEnableNV", UNBOUNDED_ADDRESS, JAVA_INT);
        VK_CMD_SET_COVERAGE_TO_COLOR_LOCATION_NV = downcallHandleVoid("vkCmdSetCoverageToColorLocationNV", UNBOUNDED_ADDRESS, JAVA_INT);
        VK_CMD_SET_COVERAGE_MODULATION_MODE_NV = downcallHandleVoid("vkCmdSetCoverageModulationModeNV", UNBOUNDED_ADDRESS, JAVA_INT);
        VK_CMD_SET_COVERAGE_MODULATION_TABLE_ENABLE_NV = downcallHandleVoid("vkCmdSetCoverageModulationTableEnableNV", UNBOUNDED_ADDRESS, JAVA_INT);
        VK_CMD_SET_COVERAGE_MODULATION_TABLE_NV = downcallHandleVoid("vkCmdSetCoverageModulationTableNV", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
        VK_CMD_SET_SHADING_RATE_IMAGE_ENABLE_NV = downcallHandleVoid("vkCmdSetShadingRateImageEnableNV", UNBOUNDED_ADDRESS, JAVA_INT);
        VK_CMD_SET_REPRESENTATIVE_FRAGMENT_TEST_ENABLE_NV = downcallHandleVoid("vkCmdSetRepresentativeFragmentTestEnableNV", UNBOUNDED_ADDRESS, JAVA_INT);
        VK_CMD_SET_COVERAGE_REDUCTION_MODE_NV = downcallHandleVoid("vkCmdSetCoverageReductionModeNV", UNBOUNDED_ADDRESS, JAVA_INT);
        VK_CREATE_TENSOR_ARM = downcallHandle("vkCreateTensorARM", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_DESTROY_TENSOR_ARM = downcallHandleVoid("vkDestroyTensorARM", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CREATE_TENSOR_VIEW_ARM = downcallHandle("vkCreateTensorViewARM", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_DESTROY_TENSOR_VIEW_ARM = downcallHandleVoid("vkDestroyTensorViewARM", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_GET_TENSOR_MEMORY_REQUIREMENTS_ARM = downcallHandleVoid("vkGetTensorMemoryRequirementsARM", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_BIND_TENSOR_MEMORY_ARM = downcallHandle("vkBindTensorMemoryARM", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
        VK_GET_DEVICE_TENSOR_MEMORY_REQUIREMENTS_ARM = downcallHandleVoid("vkGetDeviceTensorMemoryRequirementsARM", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_COPY_TENSOR_ARM = downcallHandleVoid("vkCmdCopyTensorARM", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_GET_TENSOR_OPAQUE_CAPTURE_DESCRIPTOR_DATA_ARM = downcallHandle("vkGetTensorOpaqueCaptureDescriptorDataARM", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_GET_TENSOR_VIEW_OPAQUE_CAPTURE_DESCRIPTOR_DATA_ARM = downcallHandle("vkGetTensorViewOpaqueCaptureDescriptorDataARM", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_GET_SHADER_MODULE_IDENTIFIER_EXT = downcallHandleVoid("vkGetShaderModuleIdentifierEXT", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_GET_SHADER_MODULE_CREATE_INFO_IDENTIFIER_EXT = downcallHandleVoid("vkGetShaderModuleCreateInfoIdentifierEXT", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CREATE_OPTICAL_FLOW_SESSION_NV = downcallHandle("vkCreateOpticalFlowSessionNV", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_DESTROY_OPTICAL_FLOW_SESSION_NV = downcallHandleVoid("vkDestroyOpticalFlowSessionNV", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_BIND_OPTICAL_FLOW_SESSION_IMAGE_NV = downcallHandle("vkBindOpticalFlowSessionImageNV", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT);
        VK_CMD_OPTICAL_FLOW_EXECUTE_NV = downcallHandleVoid("vkCmdOpticalFlowExecuteNV", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_ANTI_LAG_UPDATE_AMD = downcallHandleVoid("vkAntiLagUpdateAMD", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CREATE_SHADERS_EXT = downcallHandle("vkCreateShadersEXT", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_DESTROY_SHADER_EXT = downcallHandleVoid("vkDestroyShaderEXT", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_GET_SHADER_BINARY_DATA_EXT = downcallHandle("vkGetShaderBinaryDataEXT", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_BIND_SHADERS_EXT = downcallHandleVoid("vkCmdBindShadersEXT", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_SET_DEPTH_CLAMP_RANGE_EXT = downcallHandleVoid("vkCmdSetDepthClampRangeEXT", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
        VK_GET_FRAMEBUFFER_TILE_PROPERTIES_QCOM = downcallHandle("vkGetFramebufferTilePropertiesQCOM", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_GET_DYNAMIC_RENDERING_TILE_PROPERTIES_QCOM = downcallHandle("vkGetDynamicRenderingTilePropertiesQCOM", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CONVERT_COOPERATIVE_VECTOR_MATRIX_NV = downcallHandle("vkConvertCooperativeVectorMatrixNV", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_CONVERT_COOPERATIVE_VECTOR_MATRIX_NV = downcallHandleVoid("vkCmdConvertCooperativeVectorMatrixNV", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
        VK_SET_LATENCY_SLEEP_MODE_NV = downcallHandle("vkSetLatencySleepModeNV", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_LATENCY_SLEEP_NV = downcallHandle("vkLatencySleepNV", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_SET_LATENCY_MARKER_NV = downcallHandleVoid("vkSetLatencyMarkerNV", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_GET_LATENCY_TIMINGS_NV = downcallHandleVoid("vkGetLatencyTimingsNV", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_QUEUE_NOTIFY_OUT_OF_BAND_NV = downcallHandleVoid("vkQueueNotifyOutOfBandNV", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CREATE_DATA_GRAPH_PIPELINES_ARM = downcallHandle("vkCreateDataGraphPipelinesARM", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CREATE_DATA_GRAPH_PIPELINE_SESSION_ARM = downcallHandle("vkCreateDataGraphPipelineSessionARM", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_GET_DATA_GRAPH_PIPELINE_SESSION_BIND_POINT_REQUIREMENTS_ARM = downcallHandle("vkGetDataGraphPipelineSessionBindPointRequirementsARM", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_GET_DATA_GRAPH_PIPELINE_SESSION_MEMORY_REQUIREMENTS_ARM = downcallHandleVoid("vkGetDataGraphPipelineSessionMemoryRequirementsARM", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_BIND_DATA_GRAPH_PIPELINE_SESSION_MEMORY_ARM = downcallHandle("vkBindDataGraphPipelineSessionMemoryARM", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
        VK_DESTROY_DATA_GRAPH_PIPELINE_SESSION_ARM = downcallHandleVoid("vkDestroyDataGraphPipelineSessionARM", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_DISPATCH_DATA_GRAPH_ARM = downcallHandleVoid("vkCmdDispatchDataGraphARM", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_GET_DATA_GRAPH_PIPELINE_AVAILABLE_PROPERTIES_ARM = downcallHandle("vkGetDataGraphPipelineAvailablePropertiesARM", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_GET_DATA_GRAPH_PIPELINE_PROPERTIES_ARM = downcallHandle("vkGetDataGraphPipelinePropertiesARM", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
        VK_CMD_SET_ATTACHMENT_FEEDBACK_LOOP_ENABLE_EXT = downcallHandleVoid("vkCmdSetAttachmentFeedbackLoopEnableEXT", UNBOUNDED_ADDRESS, JAVA_INT);
        VK_CMD_BIND_TILE_MEMORY_QCOM = downcallHandleVoid("vkCmdBindTileMemoryQCOM", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_DECOMPRESS_MEMORY_EXT = downcallHandleVoid("vkCmdDecompressMemoryEXT", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_DECOMPRESS_MEMORY_INDIRECT_COUNT_EXT = downcallHandleVoid("vkCmdDecompressMemoryIndirectCountEXT", UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_INT, JAVA_INT);
        VK_CREATE_EXTERNAL_COMPUTE_QUEUE_NV = downcallHandle("vkCreateExternalComputeQueueNV", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_DESTROY_EXTERNAL_COMPUTE_QUEUE_NV = downcallHandleVoid("vkDestroyExternalComputeQueueNV", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_GET_CLUSTER_ACCELERATION_STRUCTURE_BUILD_SIZES_NV = downcallHandleVoid("vkGetClusterAccelerationStructureBuildSizesNV", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_BUILD_CLUSTER_ACCELERATION_STRUCTURE_INDIRECT_NV = downcallHandleVoid("vkCmdBuildClusterAccelerationStructureIndirectNV", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_GET_PARTITIONED_ACCELERATION_STRUCTURES_BUILD_SIZES_NV = downcallHandleVoid("vkGetPartitionedAccelerationStructuresBuildSizesNV", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_BUILD_PARTITIONED_ACCELERATION_STRUCTURES_NV = downcallHandleVoid("vkCmdBuildPartitionedAccelerationStructuresNV", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_GET_GENERATED_COMMANDS_MEMORY_REQUIREMENTS_EXT = downcallHandleVoid("vkGetGeneratedCommandsMemoryRequirementsEXT", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_PREPROCESS_GENERATED_COMMANDS_EXT = downcallHandleVoid("vkCmdPreprocessGeneratedCommandsEXT", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_EXECUTE_GENERATED_COMMANDS_EXT = downcallHandleVoid("vkCmdExecuteGeneratedCommandsEXT", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
        VK_CREATE_INDIRECT_COMMANDS_LAYOUT_EXT = downcallHandle("vkCreateIndirectCommandsLayoutEXT", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_DESTROY_INDIRECT_COMMANDS_LAYOUT_EXT = downcallHandleVoid("vkDestroyIndirectCommandsLayoutEXT", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CREATE_INDIRECT_EXECUTION_SET_EXT = downcallHandle("vkCreateIndirectExecutionSetEXT", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_DESTROY_INDIRECT_EXECUTION_SET_EXT = downcallHandleVoid("vkDestroyIndirectExecutionSetEXT", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_UPDATE_INDIRECT_EXECUTION_SET_PIPELINE_EXT = downcallHandleVoid("vkUpdateIndirectExecutionSetPipelineEXT", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
        VK_UPDATE_INDIRECT_EXECUTION_SET_SHADER_EXT = downcallHandleVoid("vkUpdateIndirectExecutionSetShaderEXT", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
        VK_CREATE_SHADER_INSTRUMENTATION_ARM = downcallHandle("vkCreateShaderInstrumentationARM", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_DESTROY_SHADER_INSTRUMENTATION_ARM = downcallHandleVoid("vkDestroyShaderInstrumentationARM", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_BEGIN_SHADER_INSTRUMENTATION_ARM = downcallHandleVoid("vkCmdBeginShaderInstrumentationARM", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_END_SHADER_INSTRUMENTATION_ARM = downcallHandleVoid("vkCmdEndShaderInstrumentationARM", UNBOUNDED_ADDRESS);
        VK_GET_SHADER_INSTRUMENTATION_VALUES_ARM = downcallHandle("vkGetShaderInstrumentationValuesARM", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
        VK_CLEAR_SHADER_INSTRUMENTATION_METRICS_ARM = downcallHandleVoid("vkClearShaderInstrumentationMetricsARM", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_BEGIN_CUSTOM_RESOLVE_EXT = downcallHandleVoid("vkCmdBeginCustomResolveEXT", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_SET_COMPUTE_OCCUPANCY_PRIORITY_NV = downcallHandleVoid("vkCmdSetComputeOccupancyPriorityNV", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_SET_PRIMITIVE_RESTART_INDEX_EXT = downcallHandleVoid("vkCmdSetPrimitiveRestartIndexEXT", UNBOUNDED_ADDRESS, JAVA_INT);
        VK_CREATE_ACCELERATION_STRUCTURE_KHR = downcallHandle("vkCreateAccelerationStructureKHR", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_DESTROY_ACCELERATION_STRUCTURE_KHR = downcallHandleVoid("vkDestroyAccelerationStructureKHR", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_BUILD_ACCELERATION_STRUCTURES_KHR = downcallHandleVoid("vkCmdBuildAccelerationStructuresKHR", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_BUILD_ACCELERATION_STRUCTURES_INDIRECT_KHR = downcallHandleVoid("vkCmdBuildAccelerationStructuresIndirectKHR", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_BUILD_ACCELERATION_STRUCTURES_KHR = downcallHandle("vkBuildAccelerationStructuresKHR", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_COPY_ACCELERATION_STRUCTURE_KHR = downcallHandle("vkCopyAccelerationStructureKHR", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_COPY_ACCELERATION_STRUCTURE_TO_MEMORY_KHR = downcallHandle("vkCopyAccelerationStructureToMemoryKHR", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_COPY_MEMORY_TO_ACCELERATION_STRUCTURE_KHR = downcallHandle("vkCopyMemoryToAccelerationStructureKHR", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_WRITE_ACCELERATION_STRUCTURES_PROPERTIES_KHR = downcallHandle("vkWriteAccelerationStructuresPropertiesKHR", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_LONG, UNBOUNDED_ADDRESS, JAVA_LONG);
        VK_CMD_COPY_ACCELERATION_STRUCTURE_KHR = downcallHandleVoid("vkCmdCopyAccelerationStructureKHR", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_COPY_ACCELERATION_STRUCTURE_TO_MEMORY_KHR = downcallHandleVoid("vkCmdCopyAccelerationStructureToMemoryKHR", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_COPY_MEMORY_TO_ACCELERATION_STRUCTURE_KHR = downcallHandleVoid("vkCmdCopyMemoryToAccelerationStructureKHR", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_GET_ACCELERATION_STRUCTURE_DEVICE_ADDRESS_KHR = downcallHandle("vkGetAccelerationStructureDeviceAddressKHR", JAVA_LONG, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_WRITE_ACCELERATION_STRUCTURES_PROPERTIES_KHR = downcallHandleVoid("vkCmdWriteAccelerationStructuresPropertiesKHR", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT);
        VK_GET_DEVICE_ACCELERATION_STRUCTURE_COMPATIBILITY_KHR = downcallHandleVoid("vkGetDeviceAccelerationStructureCompatibilityKHR", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_GET_ACCELERATION_STRUCTURE_BUILD_SIZES_KHR = downcallHandleVoid("vkGetAccelerationStructureBuildSizesKHR", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_CMD_TRACE_RAYS_KHR = downcallHandleVoid("vkCmdTraceRaysKHR", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, JAVA_INT);
        VK_CREATE_RAY_TRACING_PIPELINES_KHR = downcallHandle("vkCreateRayTracingPipelinesKHR", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        VK_GET_RAY_TRACING_CAPTURE_REPLAY_SHADER_GROUP_HANDLES_KHR = downcallHandle("vkGetRayTracingCaptureReplayShaderGroupHandlesKHR", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, JAVA_LONG, UNBOUNDED_ADDRESS);
        VK_CMD_TRACE_RAYS_INDIRECT_KHR = downcallHandleVoid("vkCmdTraceRaysIndirectKHR", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG);
        VK_GET_RAY_TRACING_SHADER_GROUP_STACK_SIZE_KHR = downcallHandle("vkGetRayTracingShaderGroupStackSizeKHR", JAVA_LONG, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
        VK_CMD_SET_RAY_TRACING_PIPELINE_STACK_SIZE_KHR = downcallHandleVoid("vkCmdSetRayTracingPipelineStackSizeKHR", UNBOUNDED_ADDRESS, JAVA_INT);
        VK_CMD_DRAW_MESH_TASKS_EXT = downcallHandleVoid("vkCmdDrawMeshTasksEXT", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, JAVA_INT);
        VK_CMD_DRAW_MESH_TASKS_INDIRECT_EXT = downcallHandleVoid("vkCmdDrawMeshTasksIndirectEXT", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_INT, JAVA_INT);
        VK_CMD_DRAW_MESH_TASKS_INDIRECT_COUNT_EXT = downcallHandleVoid("vkCmdDrawMeshTasksIndirectCountEXT", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_INT, JAVA_INT);
    }
    
    public final LazyConstant<MethodHandle> VK_DESTROY_DEVICE() {
        return VK_DESTROY_DEVICE;
    }

    public final LazyConstant<MethodHandle> VK_GET_DEVICE_QUEUE() {
        return VK_GET_DEVICE_QUEUE;
    }

    public final LazyConstant<MethodHandle> VK_QUEUE_SUBMIT() {
        return VK_QUEUE_SUBMIT;
    }

    public final LazyConstant<MethodHandle> VK_QUEUE_WAIT_IDLE() {
        return VK_QUEUE_WAIT_IDLE;
    }

    public final LazyConstant<MethodHandle> VK_DEVICE_WAIT_IDLE() {
        return VK_DEVICE_WAIT_IDLE;
    }

    public final LazyConstant<MethodHandle> VK_ALLOCATE_MEMORY() {
        return VK_ALLOCATE_MEMORY;
    }

    public final LazyConstant<MethodHandle> VK_FREE_MEMORY() {
        return VK_FREE_MEMORY;
    }

    public final LazyConstant<MethodHandle> VK_MAP_MEMORY() {
        return VK_MAP_MEMORY;
    }

    public final LazyConstant<MethodHandle> VK_UNMAP_MEMORY() {
        return VK_UNMAP_MEMORY;
    }

    public final LazyConstant<MethodHandle> VK_FLUSH_MAPPED_MEMORY_RANGES() {
        return VK_FLUSH_MAPPED_MEMORY_RANGES;
    }

    public final LazyConstant<MethodHandle> VK_INVALIDATE_MAPPED_MEMORY_RANGES() {
        return VK_INVALIDATE_MAPPED_MEMORY_RANGES;
    }

    public final LazyConstant<MethodHandle> VK_GET_DEVICE_MEMORY_COMMITMENT() {
        return VK_GET_DEVICE_MEMORY_COMMITMENT;
    }

    public final LazyConstant<MethodHandle> VK_BIND_BUFFER_MEMORY() {
        return VK_BIND_BUFFER_MEMORY;
    }

    public final LazyConstant<MethodHandle> VK_BIND_IMAGE_MEMORY() {
        return VK_BIND_IMAGE_MEMORY;
    }

    public final LazyConstant<MethodHandle> VK_GET_BUFFER_MEMORY_REQUIREMENTS() {
        return VK_GET_BUFFER_MEMORY_REQUIREMENTS;
    }

    public final LazyConstant<MethodHandle> VK_GET_IMAGE_MEMORY_REQUIREMENTS() {
        return VK_GET_IMAGE_MEMORY_REQUIREMENTS;
    }

    public final LazyConstant<MethodHandle> VK_GET_IMAGE_SPARSE_MEMORY_REQUIREMENTS() {
        return VK_GET_IMAGE_SPARSE_MEMORY_REQUIREMENTS;
    }

    public final LazyConstant<MethodHandle> VK_QUEUE_BIND_SPARSE() {
        return VK_QUEUE_BIND_SPARSE;
    }

    public final LazyConstant<MethodHandle> VK_CREATE_FENCE() {
        return VK_CREATE_FENCE;
    }

    public final LazyConstant<MethodHandle> VK_DESTROY_FENCE() {
        return VK_DESTROY_FENCE;
    }

    public final LazyConstant<MethodHandle> VK_RESET_FENCES() {
        return VK_RESET_FENCES;
    }

    public final LazyConstant<MethodHandle> VK_GET_FENCE_STATUS() {
        return VK_GET_FENCE_STATUS;
    }

    public final LazyConstant<MethodHandle> VK_WAIT_FOR_FENCES() {
        return VK_WAIT_FOR_FENCES;
    }

    public final LazyConstant<MethodHandle> VK_CREATE_SEMAPHORE() {
        return VK_CREATE_SEMAPHORE;
    }

    public final LazyConstant<MethodHandle> VK_DESTROY_SEMAPHORE() {
        return VK_DESTROY_SEMAPHORE;
    }

    public final LazyConstant<MethodHandle> VK_CREATE_QUERY_POOL() {
        return VK_CREATE_QUERY_POOL;
    }

    public final LazyConstant<MethodHandle> VK_DESTROY_QUERY_POOL() {
        return VK_DESTROY_QUERY_POOL;
    }

    public final LazyConstant<MethodHandle> VK_GET_QUERY_POOL_RESULTS() {
        return VK_GET_QUERY_POOL_RESULTS;
    }

    public final LazyConstant<MethodHandle> VK_CREATE_BUFFER() {
        return VK_CREATE_BUFFER;
    }

    public final LazyConstant<MethodHandle> VK_DESTROY_BUFFER() {
        return VK_DESTROY_BUFFER;
    }

    public final LazyConstant<MethodHandle> VK_CREATE_IMAGE() {
        return VK_CREATE_IMAGE;
    }

    public final LazyConstant<MethodHandle> VK_DESTROY_IMAGE() {
        return VK_DESTROY_IMAGE;
    }

    public final LazyConstant<MethodHandle> VK_GET_IMAGE_SUBRESOURCE_LAYOUT() {
        return VK_GET_IMAGE_SUBRESOURCE_LAYOUT;
    }

    public final LazyConstant<MethodHandle> VK_CREATE_IMAGE_VIEW() {
        return VK_CREATE_IMAGE_VIEW;
    }

    public final LazyConstant<MethodHandle> VK_DESTROY_IMAGE_VIEW() {
        return VK_DESTROY_IMAGE_VIEW;
    }

    public final LazyConstant<MethodHandle> VK_CREATE_COMMAND_POOL() {
        return VK_CREATE_COMMAND_POOL;
    }

    public final LazyConstant<MethodHandle> VK_DESTROY_COMMAND_POOL() {
        return VK_DESTROY_COMMAND_POOL;
    }

    public final LazyConstant<MethodHandle> VK_RESET_COMMAND_POOL() {
        return VK_RESET_COMMAND_POOL;
    }

    public final LazyConstant<MethodHandle> VK_ALLOCATE_COMMAND_BUFFERS() {
        return VK_ALLOCATE_COMMAND_BUFFERS;
    }

    public final LazyConstant<MethodHandle> VK_FREE_COMMAND_BUFFERS() {
        return VK_FREE_COMMAND_BUFFERS;
    }

    public final LazyConstant<MethodHandle> VK_BEGIN_COMMAND_BUFFER() {
        return VK_BEGIN_COMMAND_BUFFER;
    }

    public final LazyConstant<MethodHandle> VK_END_COMMAND_BUFFER() {
        return VK_END_COMMAND_BUFFER;
    }

    public final LazyConstant<MethodHandle> VK_RESET_COMMAND_BUFFER() {
        return VK_RESET_COMMAND_BUFFER;
    }

    public final LazyConstant<MethodHandle> VK_CMD_COPY_BUFFER() {
        return VK_CMD_COPY_BUFFER;
    }

    public final LazyConstant<MethodHandle> VK_CMD_COPY_IMAGE() {
        return VK_CMD_COPY_IMAGE;
    }

    public final LazyConstant<MethodHandle> VK_CMD_COPY_BUFFER_TO_IMAGE() {
        return VK_CMD_COPY_BUFFER_TO_IMAGE;
    }

    public final LazyConstant<MethodHandle> VK_CMD_COPY_IMAGE_TO_BUFFER() {
        return VK_CMD_COPY_IMAGE_TO_BUFFER;
    }

    public final LazyConstant<MethodHandle> VK_CMD_UPDATE_BUFFER() {
        return VK_CMD_UPDATE_BUFFER;
    }

    public final LazyConstant<MethodHandle> VK_CMD_FILL_BUFFER() {
        return VK_CMD_FILL_BUFFER;
    }

    public final LazyConstant<MethodHandle> VK_CMD_PIPELINE_BARRIER() {
        return VK_CMD_PIPELINE_BARRIER;
    }

    public final LazyConstant<MethodHandle> VK_CMD_BEGIN_QUERY() {
        return VK_CMD_BEGIN_QUERY;
    }

    public final LazyConstant<MethodHandle> VK_CMD_END_QUERY() {
        return VK_CMD_END_QUERY;
    }

    public final LazyConstant<MethodHandle> VK_CMD_RESET_QUERY_POOL() {
        return VK_CMD_RESET_QUERY_POOL;
    }

    public final LazyConstant<MethodHandle> VK_CMD_WRITE_TIMESTAMP() {
        return VK_CMD_WRITE_TIMESTAMP;
    }

    public final LazyConstant<MethodHandle> VK_CMD_COPY_QUERY_POOL_RESULTS() {
        return VK_CMD_COPY_QUERY_POOL_RESULTS;
    }

    public final LazyConstant<MethodHandle> VK_CMD_EXECUTE_COMMANDS() {
        return VK_CMD_EXECUTE_COMMANDS;
    }

    public final LazyConstant<MethodHandle> VK_CREATE_EVENT() {
        return VK_CREATE_EVENT;
    }

    public final LazyConstant<MethodHandle> VK_DESTROY_EVENT() {
        return VK_DESTROY_EVENT;
    }

    public final LazyConstant<MethodHandle> VK_GET_EVENT_STATUS() {
        return VK_GET_EVENT_STATUS;
    }

    public final LazyConstant<MethodHandle> VK_SET_EVENT() {
        return VK_SET_EVENT;
    }

    public final LazyConstant<MethodHandle> VK_RESET_EVENT() {
        return VK_RESET_EVENT;
    }

    public final LazyConstant<MethodHandle> VK_CREATE_BUFFER_VIEW() {
        return VK_CREATE_BUFFER_VIEW;
    }

    public final LazyConstant<MethodHandle> VK_DESTROY_BUFFER_VIEW() {
        return VK_DESTROY_BUFFER_VIEW;
    }

    public final LazyConstant<MethodHandle> VK_CREATE_SHADER_MODULE() {
        return VK_CREATE_SHADER_MODULE;
    }

    public final LazyConstant<MethodHandle> VK_DESTROY_SHADER_MODULE() {
        return VK_DESTROY_SHADER_MODULE;
    }

    public final LazyConstant<MethodHandle> VK_CREATE_PIPELINE_CACHE() {
        return VK_CREATE_PIPELINE_CACHE;
    }

    public final LazyConstant<MethodHandle> VK_DESTROY_PIPELINE_CACHE() {
        return VK_DESTROY_PIPELINE_CACHE;
    }

    public final LazyConstant<MethodHandle> VK_GET_PIPELINE_CACHE_DATA() {
        return VK_GET_PIPELINE_CACHE_DATA;
    }

    public final LazyConstant<MethodHandle> VK_MERGE_PIPELINE_CACHES() {
        return VK_MERGE_PIPELINE_CACHES;
    }

    public final LazyConstant<MethodHandle> VK_CREATE_COMPUTE_PIPELINES() {
        return VK_CREATE_COMPUTE_PIPELINES;
    }

    public final LazyConstant<MethodHandle> VK_DESTROY_PIPELINE() {
        return VK_DESTROY_PIPELINE;
    }

    public final LazyConstant<MethodHandle> VK_CREATE_PIPELINE_LAYOUT() {
        return VK_CREATE_PIPELINE_LAYOUT;
    }

    public final LazyConstant<MethodHandle> VK_DESTROY_PIPELINE_LAYOUT() {
        return VK_DESTROY_PIPELINE_LAYOUT;
    }

    public final LazyConstant<MethodHandle> VK_CREATE_SAMPLER() {
        return VK_CREATE_SAMPLER;
    }

    public final LazyConstant<MethodHandle> VK_DESTROY_SAMPLER() {
        return VK_DESTROY_SAMPLER;
    }

    public final LazyConstant<MethodHandle> VK_CREATE_DESCRIPTOR_SET_LAYOUT() {
        return VK_CREATE_DESCRIPTOR_SET_LAYOUT;
    }

    public final LazyConstant<MethodHandle> VK_DESTROY_DESCRIPTOR_SET_LAYOUT() {
        return VK_DESTROY_DESCRIPTOR_SET_LAYOUT;
    }

    public final LazyConstant<MethodHandle> VK_CREATE_DESCRIPTOR_POOL() {
        return VK_CREATE_DESCRIPTOR_POOL;
    }

    public final LazyConstant<MethodHandle> VK_DESTROY_DESCRIPTOR_POOL() {
        return VK_DESTROY_DESCRIPTOR_POOL;
    }

    public final LazyConstant<MethodHandle> VK_RESET_DESCRIPTOR_POOL() {
        return VK_RESET_DESCRIPTOR_POOL;
    }

    public final LazyConstant<MethodHandle> VK_ALLOCATE_DESCRIPTOR_SETS() {
        return VK_ALLOCATE_DESCRIPTOR_SETS;
    }

    public final LazyConstant<MethodHandle> VK_FREE_DESCRIPTOR_SETS() {
        return VK_FREE_DESCRIPTOR_SETS;
    }

    public final LazyConstant<MethodHandle> VK_UPDATE_DESCRIPTOR_SETS() {
        return VK_UPDATE_DESCRIPTOR_SETS;
    }

    public final LazyConstant<MethodHandle> VK_CMD_BIND_PIPELINE() {
        return VK_CMD_BIND_PIPELINE;
    }

    public final LazyConstant<MethodHandle> VK_CMD_BIND_DESCRIPTOR_SETS() {
        return VK_CMD_BIND_DESCRIPTOR_SETS;
    }

    public final LazyConstant<MethodHandle> VK_CMD_CLEAR_COLOR_IMAGE() {
        return VK_CMD_CLEAR_COLOR_IMAGE;
    }

    public final LazyConstant<MethodHandle> VK_CMD_DISPATCH() {
        return VK_CMD_DISPATCH;
    }

    public final LazyConstant<MethodHandle> VK_CMD_DISPATCH_INDIRECT() {
        return VK_CMD_DISPATCH_INDIRECT;
    }

    public final LazyConstant<MethodHandle> VK_CMD_SET_EVENT() {
        return VK_CMD_SET_EVENT;
    }

    public final LazyConstant<MethodHandle> VK_CMD_RESET_EVENT() {
        return VK_CMD_RESET_EVENT;
    }

    public final LazyConstant<MethodHandle> VK_CMD_WAIT_EVENTS() {
        return VK_CMD_WAIT_EVENTS;
    }

    public final LazyConstant<MethodHandle> VK_CMD_PUSH_CONSTANTS() {
        return VK_CMD_PUSH_CONSTANTS;
    }

    public final LazyConstant<MethodHandle> VK_CREATE_GRAPHICS_PIPELINES() {
        return VK_CREATE_GRAPHICS_PIPELINES;
    }

    public final LazyConstant<MethodHandle> VK_CREATE_FRAMEBUFFER() {
        return VK_CREATE_FRAMEBUFFER;
    }

    public final LazyConstant<MethodHandle> VK_DESTROY_FRAMEBUFFER() {
        return VK_DESTROY_FRAMEBUFFER;
    }

    public final LazyConstant<MethodHandle> VK_CREATE_RENDER_PASS() {
        return VK_CREATE_RENDER_PASS;
    }

    public final LazyConstant<MethodHandle> VK_DESTROY_RENDER_PASS() {
        return VK_DESTROY_RENDER_PASS;
    }

    public final LazyConstant<MethodHandle> VK_GET_RENDER_AREA_GRANULARITY() {
        return VK_GET_RENDER_AREA_GRANULARITY;
    }

    public final LazyConstant<MethodHandle> VK_CMD_SET_VIEWPORT() {
        return VK_CMD_SET_VIEWPORT;
    }

    public final LazyConstant<MethodHandle> VK_CMD_SET_SCISSOR() {
        return VK_CMD_SET_SCISSOR;
    }

    public final LazyConstant<MethodHandle> VK_CMD_SET_LINE_WIDTH() {
        return VK_CMD_SET_LINE_WIDTH;
    }

    public final LazyConstant<MethodHandle> VK_CMD_SET_DEPTH_BIAS() {
        return VK_CMD_SET_DEPTH_BIAS;
    }

    public final LazyConstant<MethodHandle> VK_CMD_SET_BLEND_CONSTANTS() {
        return VK_CMD_SET_BLEND_CONSTANTS;
    }

    public final LazyConstant<MethodHandle> VK_CMD_SET_DEPTH_BOUNDS() {
        return VK_CMD_SET_DEPTH_BOUNDS;
    }

    public final LazyConstant<MethodHandle> VK_CMD_SET_STENCIL_COMPARE_MASK() {
        return VK_CMD_SET_STENCIL_COMPARE_MASK;
    }

    public final LazyConstant<MethodHandle> VK_CMD_SET_STENCIL_WRITE_MASK() {
        return VK_CMD_SET_STENCIL_WRITE_MASK;
    }

    public final LazyConstant<MethodHandle> VK_CMD_SET_STENCIL_REFERENCE() {
        return VK_CMD_SET_STENCIL_REFERENCE;
    }

    public final LazyConstant<MethodHandle> VK_CMD_BIND_INDEX_BUFFER() {
        return VK_CMD_BIND_INDEX_BUFFER;
    }

    public final LazyConstant<MethodHandle> VK_CMD_BIND_VERTEX_BUFFERS() {
        return VK_CMD_BIND_VERTEX_BUFFERS;
    }

    public final LazyConstant<MethodHandle> VK_CMD_DRAW() {
        return VK_CMD_DRAW;
    }

    public final LazyConstant<MethodHandle> VK_CMD_DRAW_INDEXED() {
        return VK_CMD_DRAW_INDEXED;
    }

    public final LazyConstant<MethodHandle> VK_CMD_DRAW_INDIRECT() {
        return VK_CMD_DRAW_INDIRECT;
    }

    public final LazyConstant<MethodHandle> VK_CMD_DRAW_INDEXED_INDIRECT() {
        return VK_CMD_DRAW_INDEXED_INDIRECT;
    }

    public final LazyConstant<MethodHandle> VK_CMD_BLIT_IMAGE() {
        return VK_CMD_BLIT_IMAGE;
    }

    public final LazyConstant<MethodHandle> VK_CMD_CLEAR_DEPTH_STENCIL_IMAGE() {
        return VK_CMD_CLEAR_DEPTH_STENCIL_IMAGE;
    }

    public final LazyConstant<MethodHandle> VK_CMD_CLEAR_ATTACHMENTS() {
        return VK_CMD_CLEAR_ATTACHMENTS;
    }

    public final LazyConstant<MethodHandle> VK_CMD_RESOLVE_IMAGE() {
        return VK_CMD_RESOLVE_IMAGE;
    }

    public final LazyConstant<MethodHandle> VK_CMD_BEGIN_RENDER_PASS() {
        return VK_CMD_BEGIN_RENDER_PASS;
    }

    public final LazyConstant<MethodHandle> VK_CMD_NEXT_SUBPASS() {
        return VK_CMD_NEXT_SUBPASS;
    }

    public final LazyConstant<MethodHandle> VK_CMD_END_RENDER_PASS() {
        return VK_CMD_END_RENDER_PASS;
    }

    public final LazyConstant<MethodHandle> VK_BIND_BUFFER_MEMORY2() {
        return VK_BIND_BUFFER_MEMORY2;
    }

    public final LazyConstant<MethodHandle> VK_BIND_IMAGE_MEMORY2() {
        return VK_BIND_IMAGE_MEMORY2;
    }

    public final LazyConstant<MethodHandle> VK_GET_DEVICE_GROUP_PEER_MEMORY_FEATURES() {
        return VK_GET_DEVICE_GROUP_PEER_MEMORY_FEATURES;
    }

    public final LazyConstant<MethodHandle> VK_CMD_SET_DEVICE_MASK() {
        return VK_CMD_SET_DEVICE_MASK;
    }

    public final LazyConstant<MethodHandle> VK_GET_IMAGE_MEMORY_REQUIREMENTS2() {
        return VK_GET_IMAGE_MEMORY_REQUIREMENTS2;
    }

    public final LazyConstant<MethodHandle> VK_GET_BUFFER_MEMORY_REQUIREMENTS2() {
        return VK_GET_BUFFER_MEMORY_REQUIREMENTS2;
    }

    public final LazyConstant<MethodHandle> VK_GET_IMAGE_SPARSE_MEMORY_REQUIREMENTS2() {
        return VK_GET_IMAGE_SPARSE_MEMORY_REQUIREMENTS2;
    }

    public final LazyConstant<MethodHandle> VK_TRIM_COMMAND_POOL() {
        return VK_TRIM_COMMAND_POOL;
    }

    public final LazyConstant<MethodHandle> VK_GET_DEVICE_QUEUE2() {
        return VK_GET_DEVICE_QUEUE2;
    }

    public final LazyConstant<MethodHandle> VK_CMD_DISPATCH_BASE() {
        return VK_CMD_DISPATCH_BASE;
    }

    public final LazyConstant<MethodHandle> VK_CREATE_DESCRIPTOR_UPDATE_TEMPLATE() {
        return VK_CREATE_DESCRIPTOR_UPDATE_TEMPLATE;
    }

    public final LazyConstant<MethodHandle> VK_DESTROY_DESCRIPTOR_UPDATE_TEMPLATE() {
        return VK_DESTROY_DESCRIPTOR_UPDATE_TEMPLATE;
    }

    public final LazyConstant<MethodHandle> VK_UPDATE_DESCRIPTOR_SET_WITH_TEMPLATE() {
        return VK_UPDATE_DESCRIPTOR_SET_WITH_TEMPLATE;
    }

    public final LazyConstant<MethodHandle> VK_GET_DESCRIPTOR_SET_LAYOUT_SUPPORT() {
        return VK_GET_DESCRIPTOR_SET_LAYOUT_SUPPORT;
    }

    public final LazyConstant<MethodHandle> VK_CREATE_SAMPLER_YCBCR_CONVERSION() {
        return VK_CREATE_SAMPLER_YCBCR_CONVERSION;
    }

    public final LazyConstant<MethodHandle> VK_DESTROY_SAMPLER_YCBCR_CONVERSION() {
        return VK_DESTROY_SAMPLER_YCBCR_CONVERSION;
    }

    public final LazyConstant<MethodHandle> VK_RESET_QUERY_POOL() {
        return VK_RESET_QUERY_POOL;
    }

    public final LazyConstant<MethodHandle> VK_GET_SEMAPHORE_COUNTER_VALUE() {
        return VK_GET_SEMAPHORE_COUNTER_VALUE;
    }

    public final LazyConstant<MethodHandle> VK_WAIT_SEMAPHORES() {
        return VK_WAIT_SEMAPHORES;
    }

    public final LazyConstant<MethodHandle> VK_SIGNAL_SEMAPHORE() {
        return VK_SIGNAL_SEMAPHORE;
    }

    public final LazyConstant<MethodHandle> VK_GET_BUFFER_DEVICE_ADDRESS() {
        return VK_GET_BUFFER_DEVICE_ADDRESS;
    }

    public final LazyConstant<MethodHandle> VK_GET_BUFFER_OPAQUE_CAPTURE_ADDRESS() {
        return VK_GET_BUFFER_OPAQUE_CAPTURE_ADDRESS;
    }

    public final LazyConstant<MethodHandle> VK_GET_DEVICE_MEMORY_OPAQUE_CAPTURE_ADDRESS() {
        return VK_GET_DEVICE_MEMORY_OPAQUE_CAPTURE_ADDRESS;
    }

    public final LazyConstant<MethodHandle> VK_CMD_DRAW_INDIRECT_COUNT() {
        return VK_CMD_DRAW_INDIRECT_COUNT;
    }

    public final LazyConstant<MethodHandle> VK_CMD_DRAW_INDEXED_INDIRECT_COUNT() {
        return VK_CMD_DRAW_INDEXED_INDIRECT_COUNT;
    }

    public final LazyConstant<MethodHandle> VK_CREATE_RENDER_PASS2() {
        return VK_CREATE_RENDER_PASS2;
    }

    public final LazyConstant<MethodHandle> VK_CMD_BEGIN_RENDER_PASS2() {
        return VK_CMD_BEGIN_RENDER_PASS2;
    }

    public final LazyConstant<MethodHandle> VK_CMD_NEXT_SUBPASS2() {
        return VK_CMD_NEXT_SUBPASS2;
    }

    public final LazyConstant<MethodHandle> VK_CMD_END_RENDER_PASS2() {
        return VK_CMD_END_RENDER_PASS2;
    }

    public final LazyConstant<MethodHandle> VK_CREATE_PRIVATE_DATA_SLOT() {
        return VK_CREATE_PRIVATE_DATA_SLOT;
    }

    public final LazyConstant<MethodHandle> VK_DESTROY_PRIVATE_DATA_SLOT() {
        return VK_DESTROY_PRIVATE_DATA_SLOT;
    }

    public final LazyConstant<MethodHandle> VK_SET_PRIVATE_DATA() {
        return VK_SET_PRIVATE_DATA;
    }

    public final LazyConstant<MethodHandle> VK_GET_PRIVATE_DATA() {
        return VK_GET_PRIVATE_DATA;
    }

    public final LazyConstant<MethodHandle> VK_CMD_PIPELINE_BARRIER2() {
        return VK_CMD_PIPELINE_BARRIER2;
    }

    public final LazyConstant<MethodHandle> VK_CMD_WRITE_TIMESTAMP2() {
        return VK_CMD_WRITE_TIMESTAMP2;
    }

    public final LazyConstant<MethodHandle> VK_QUEUE_SUBMIT2() {
        return VK_QUEUE_SUBMIT2;
    }

    public final LazyConstant<MethodHandle> VK_CMD_COPY_BUFFER2() {
        return VK_CMD_COPY_BUFFER2;
    }

    public final LazyConstant<MethodHandle> VK_CMD_COPY_IMAGE2() {
        return VK_CMD_COPY_IMAGE2;
    }

    public final LazyConstant<MethodHandle> VK_CMD_COPY_BUFFER_TO_IMAGE2() {
        return VK_CMD_COPY_BUFFER_TO_IMAGE2;
    }

    public final LazyConstant<MethodHandle> VK_CMD_COPY_IMAGE_TO_BUFFER2() {
        return VK_CMD_COPY_IMAGE_TO_BUFFER2;
    }

    public final LazyConstant<MethodHandle> VK_GET_DEVICE_BUFFER_MEMORY_REQUIREMENTS() {
        return VK_GET_DEVICE_BUFFER_MEMORY_REQUIREMENTS;
    }

    public final LazyConstant<MethodHandle> VK_GET_DEVICE_IMAGE_MEMORY_REQUIREMENTS() {
        return VK_GET_DEVICE_IMAGE_MEMORY_REQUIREMENTS;
    }

    public final LazyConstant<MethodHandle> VK_GET_DEVICE_IMAGE_SPARSE_MEMORY_REQUIREMENTS() {
        return VK_GET_DEVICE_IMAGE_SPARSE_MEMORY_REQUIREMENTS;
    }

    public final LazyConstant<MethodHandle> VK_CMD_SET_EVENT2() {
        return VK_CMD_SET_EVENT2;
    }

    public final LazyConstant<MethodHandle> VK_CMD_RESET_EVENT2() {
        return VK_CMD_RESET_EVENT2;
    }

    public final LazyConstant<MethodHandle> VK_CMD_WAIT_EVENTS2() {
        return VK_CMD_WAIT_EVENTS2;
    }

    public final LazyConstant<MethodHandle> VK_CMD_BLIT_IMAGE2() {
        return VK_CMD_BLIT_IMAGE2;
    }

    public final LazyConstant<MethodHandle> VK_CMD_RESOLVE_IMAGE2() {
        return VK_CMD_RESOLVE_IMAGE2;
    }

    public final LazyConstant<MethodHandle> VK_CMD_BEGIN_RENDERING() {
        return VK_CMD_BEGIN_RENDERING;
    }

    public final LazyConstant<MethodHandle> VK_CMD_END_RENDERING() {
        return VK_CMD_END_RENDERING;
    }

    public final LazyConstant<MethodHandle> VK_CMD_SET_CULL_MODE() {
        return VK_CMD_SET_CULL_MODE;
    }

    public final LazyConstant<MethodHandle> VK_CMD_SET_FRONT_FACE() {
        return VK_CMD_SET_FRONT_FACE;
    }

    public final LazyConstant<MethodHandle> VK_CMD_SET_PRIMITIVE_TOPOLOGY() {
        return VK_CMD_SET_PRIMITIVE_TOPOLOGY;
    }

    public final LazyConstant<MethodHandle> VK_CMD_SET_VIEWPORT_WITH_COUNT() {
        return VK_CMD_SET_VIEWPORT_WITH_COUNT;
    }

    public final LazyConstant<MethodHandle> VK_CMD_SET_SCISSOR_WITH_COUNT() {
        return VK_CMD_SET_SCISSOR_WITH_COUNT;
    }

    public final LazyConstant<MethodHandle> VK_CMD_BIND_VERTEX_BUFFERS2() {
        return VK_CMD_BIND_VERTEX_BUFFERS2;
    }

    public final LazyConstant<MethodHandle> VK_CMD_SET_DEPTH_TEST_ENABLE() {
        return VK_CMD_SET_DEPTH_TEST_ENABLE;
    }

    public final LazyConstant<MethodHandle> VK_CMD_SET_DEPTH_WRITE_ENABLE() {
        return VK_CMD_SET_DEPTH_WRITE_ENABLE;
    }

    public final LazyConstant<MethodHandle> VK_CMD_SET_DEPTH_COMPARE_OP() {
        return VK_CMD_SET_DEPTH_COMPARE_OP;
    }

    public final LazyConstant<MethodHandle> VK_CMD_SET_DEPTH_BOUNDS_TEST_ENABLE() {
        return VK_CMD_SET_DEPTH_BOUNDS_TEST_ENABLE;
    }

    public final LazyConstant<MethodHandle> VK_CMD_SET_STENCIL_TEST_ENABLE() {
        return VK_CMD_SET_STENCIL_TEST_ENABLE;
    }

    public final LazyConstant<MethodHandle> VK_CMD_SET_STENCIL_OP() {
        return VK_CMD_SET_STENCIL_OP;
    }

    public final LazyConstant<MethodHandle> VK_CMD_SET_RASTERIZER_DISCARD_ENABLE() {
        return VK_CMD_SET_RASTERIZER_DISCARD_ENABLE;
    }

    public final LazyConstant<MethodHandle> VK_CMD_SET_DEPTH_BIAS_ENABLE() {
        return VK_CMD_SET_DEPTH_BIAS_ENABLE;
    }

    public final LazyConstant<MethodHandle> VK_CMD_SET_PRIMITIVE_RESTART_ENABLE() {
        return VK_CMD_SET_PRIMITIVE_RESTART_ENABLE;
    }

    public final LazyConstant<MethodHandle> VK_MAP_MEMORY2() {
        return VK_MAP_MEMORY2;
    }

    public final LazyConstant<MethodHandle> VK_UNMAP_MEMORY2() {
        return VK_UNMAP_MEMORY2;
    }

    public final LazyConstant<MethodHandle> VK_GET_DEVICE_IMAGE_SUBRESOURCE_LAYOUT() {
        return VK_GET_DEVICE_IMAGE_SUBRESOURCE_LAYOUT;
    }

    public final LazyConstant<MethodHandle> VK_GET_IMAGE_SUBRESOURCE_LAYOUT2() {
        return VK_GET_IMAGE_SUBRESOURCE_LAYOUT2;
    }

    public final LazyConstant<MethodHandle> VK_COPY_MEMORY_TO_IMAGE() {
        return VK_COPY_MEMORY_TO_IMAGE;
    }

    public final LazyConstant<MethodHandle> VK_COPY_IMAGE_TO_MEMORY() {
        return VK_COPY_IMAGE_TO_MEMORY;
    }

    public final LazyConstant<MethodHandle> VK_COPY_IMAGE_TO_IMAGE() {
        return VK_COPY_IMAGE_TO_IMAGE;
    }

    public final LazyConstant<MethodHandle> VK_TRANSITION_IMAGE_LAYOUT() {
        return VK_TRANSITION_IMAGE_LAYOUT;
    }

    public final LazyConstant<MethodHandle> VK_CMD_PUSH_DESCRIPTOR_SET() {
        return VK_CMD_PUSH_DESCRIPTOR_SET;
    }

    public final LazyConstant<MethodHandle> VK_CMD_PUSH_DESCRIPTOR_SET_WITH_TEMPLATE() {
        return VK_CMD_PUSH_DESCRIPTOR_SET_WITH_TEMPLATE;
    }

    public final LazyConstant<MethodHandle> VK_CMD_BIND_DESCRIPTOR_SETS2() {
        return VK_CMD_BIND_DESCRIPTOR_SETS2;
    }

    public final LazyConstant<MethodHandle> VK_CMD_PUSH_CONSTANTS2() {
        return VK_CMD_PUSH_CONSTANTS2;
    }

    public final LazyConstant<MethodHandle> VK_CMD_PUSH_DESCRIPTOR_SET2() {
        return VK_CMD_PUSH_DESCRIPTOR_SET2;
    }

    public final LazyConstant<MethodHandle> VK_CMD_PUSH_DESCRIPTOR_SET_WITH_TEMPLATE2() {
        return VK_CMD_PUSH_DESCRIPTOR_SET_WITH_TEMPLATE2;
    }

    public final LazyConstant<MethodHandle> VK_CMD_SET_LINE_STIPPLE() {
        return VK_CMD_SET_LINE_STIPPLE;
    }

    public final LazyConstant<MethodHandle> VK_CMD_BIND_INDEX_BUFFER2() {
        return VK_CMD_BIND_INDEX_BUFFER2;
    }

    public final LazyConstant<MethodHandle> VK_GET_RENDERING_AREA_GRANULARITY() {
        return VK_GET_RENDERING_AREA_GRANULARITY;
    }

    public final LazyConstant<MethodHandle> VK_CMD_SET_RENDERING_ATTACHMENT_LOCATIONS() {
        return VK_CMD_SET_RENDERING_ATTACHMENT_LOCATIONS;
    }

    public final LazyConstant<MethodHandle> VK_CMD_SET_RENDERING_INPUT_ATTACHMENT_INDICES() {
        return VK_CMD_SET_RENDERING_INPUT_ATTACHMENT_INDICES;
    }

    public final LazyConstant<MethodHandle> VK_CREATE_SWAPCHAIN_KHR() {
        return VK_CREATE_SWAPCHAIN_KHR;
    }

    public final LazyConstant<MethodHandle> VK_DESTROY_SWAPCHAIN_KHR() {
        return VK_DESTROY_SWAPCHAIN_KHR;
    }

    public final LazyConstant<MethodHandle> VK_GET_SWAPCHAIN_IMAGES_KHR() {
        return VK_GET_SWAPCHAIN_IMAGES_KHR;
    }

    public final LazyConstant<MethodHandle> VK_ACQUIRE_NEXT_IMAGE_KHR() {
        return VK_ACQUIRE_NEXT_IMAGE_KHR;
    }

    public final LazyConstant<MethodHandle> VK_QUEUE_PRESENT_KHR() {
        return VK_QUEUE_PRESENT_KHR;
    }

    public final LazyConstant<MethodHandle> VK_GET_DEVICE_GROUP_PRESENT_CAPABILITIES_KHR() {
        return VK_GET_DEVICE_GROUP_PRESENT_CAPABILITIES_KHR;
    }

    public final LazyConstant<MethodHandle> VK_GET_DEVICE_GROUP_SURFACE_PRESENT_MODES_KHR() {
        return VK_GET_DEVICE_GROUP_SURFACE_PRESENT_MODES_KHR;
    }

    public final LazyConstant<MethodHandle> VK_ACQUIRE_NEXT_IMAGE2_KHR() {
        return VK_ACQUIRE_NEXT_IMAGE2_KHR;
    }

    public final LazyConstant<MethodHandle> VK_CREATE_SHARED_SWAPCHAINS_KHR() {
        return VK_CREATE_SHARED_SWAPCHAINS_KHR;
    }

    public final LazyConstant<MethodHandle> VK_CREATE_VIDEO_SESSION_KHR() {
        return VK_CREATE_VIDEO_SESSION_KHR;
    }

    public final LazyConstant<MethodHandle> VK_DESTROY_VIDEO_SESSION_KHR() {
        return VK_DESTROY_VIDEO_SESSION_KHR;
    }

    public final LazyConstant<MethodHandle> VK_GET_VIDEO_SESSION_MEMORY_REQUIREMENTS_KHR() {
        return VK_GET_VIDEO_SESSION_MEMORY_REQUIREMENTS_KHR;
    }

    public final LazyConstant<MethodHandle> VK_BIND_VIDEO_SESSION_MEMORY_KHR() {
        return VK_BIND_VIDEO_SESSION_MEMORY_KHR;
    }

    public final LazyConstant<MethodHandle> VK_CREATE_VIDEO_SESSION_PARAMETERS_KHR() {
        return VK_CREATE_VIDEO_SESSION_PARAMETERS_KHR;
    }

    public final LazyConstant<MethodHandle> VK_UPDATE_VIDEO_SESSION_PARAMETERS_KHR() {
        return VK_UPDATE_VIDEO_SESSION_PARAMETERS_KHR;
    }

    public final LazyConstant<MethodHandle> VK_DESTROY_VIDEO_SESSION_PARAMETERS_KHR() {
        return VK_DESTROY_VIDEO_SESSION_PARAMETERS_KHR;
    }

    public final LazyConstant<MethodHandle> VK_CMD_BEGIN_VIDEO_CODING_KHR() {
        return VK_CMD_BEGIN_VIDEO_CODING_KHR;
    }

    public final LazyConstant<MethodHandle> VK_CMD_END_VIDEO_CODING_KHR() {
        return VK_CMD_END_VIDEO_CODING_KHR;
    }

    public final LazyConstant<MethodHandle> VK_CMD_CONTROL_VIDEO_CODING_KHR() {
        return VK_CMD_CONTROL_VIDEO_CODING_KHR;
    }

    public final LazyConstant<MethodHandle> VK_CMD_DECODE_VIDEO_KHR() {
        return VK_CMD_DECODE_VIDEO_KHR;
    }

    public final LazyConstant<MethodHandle> VK_GET_MEMORY_FD_KHR() {
        return VK_GET_MEMORY_FD_KHR;
    }

    public final LazyConstant<MethodHandle> VK_GET_MEMORY_FD_PROPERTIES_KHR() {
        return VK_GET_MEMORY_FD_PROPERTIES_KHR;
    }

    public final LazyConstant<MethodHandle> VK_IMPORT_SEMAPHORE_FD_KHR() {
        return VK_IMPORT_SEMAPHORE_FD_KHR;
    }

    public final LazyConstant<MethodHandle> VK_GET_SEMAPHORE_FD_KHR() {
        return VK_GET_SEMAPHORE_FD_KHR;
    }

    public final LazyConstant<MethodHandle> VK_GET_SWAPCHAIN_STATUS_KHR() {
        return VK_GET_SWAPCHAIN_STATUS_KHR;
    }

    public final LazyConstant<MethodHandle> VK_IMPORT_FENCE_FD_KHR() {
        return VK_IMPORT_FENCE_FD_KHR;
    }

    public final LazyConstant<MethodHandle> VK_GET_FENCE_FD_KHR() {
        return VK_GET_FENCE_FD_KHR;
    }

    public final LazyConstant<MethodHandle> VK_ACQUIRE_PROFILING_LOCK_KHR() {
        return VK_ACQUIRE_PROFILING_LOCK_KHR;
    }

    public final LazyConstant<MethodHandle> VK_RELEASE_PROFILING_LOCK_KHR() {
        return VK_RELEASE_PROFILING_LOCK_KHR;
    }

    public final LazyConstant<MethodHandle> VK_CMD_SET_FRAGMENT_SHADING_RATE_KHR() {
        return VK_CMD_SET_FRAGMENT_SHADING_RATE_KHR;
    }

    public final LazyConstant<MethodHandle> VK_WAIT_FOR_PRESENT_KHR() {
        return VK_WAIT_FOR_PRESENT_KHR;
    }

    public final LazyConstant<MethodHandle> VK_CREATE_DEFERRED_OPERATION_KHR() {
        return VK_CREATE_DEFERRED_OPERATION_KHR;
    }

    public final LazyConstant<MethodHandle> VK_DESTROY_DEFERRED_OPERATION_KHR() {
        return VK_DESTROY_DEFERRED_OPERATION_KHR;
    }

    public final LazyConstant<MethodHandle> VK_GET_DEFERRED_OPERATION_MAX_CONCURRENCY_KHR() {
        return VK_GET_DEFERRED_OPERATION_MAX_CONCURRENCY_KHR;
    }

    public final LazyConstant<MethodHandle> VK_GET_DEFERRED_OPERATION_RESULT_KHR() {
        return VK_GET_DEFERRED_OPERATION_RESULT_KHR;
    }

    public final LazyConstant<MethodHandle> VK_DEFERRED_OPERATION_JOIN_KHR() {
        return VK_DEFERRED_OPERATION_JOIN_KHR;
    }

    public final LazyConstant<MethodHandle> VK_GET_PIPELINE_EXECUTABLE_PROPERTIES_KHR() {
        return VK_GET_PIPELINE_EXECUTABLE_PROPERTIES_KHR;
    }

    public final LazyConstant<MethodHandle> VK_GET_PIPELINE_EXECUTABLE_STATISTICS_KHR() {
        return VK_GET_PIPELINE_EXECUTABLE_STATISTICS_KHR;
    }

    public final LazyConstant<MethodHandle> VK_GET_PIPELINE_EXECUTABLE_INTERNAL_REPRESENTATIONS_KHR() {
        return VK_GET_PIPELINE_EXECUTABLE_INTERNAL_REPRESENTATIONS_KHR;
    }

    public final LazyConstant<MethodHandle> VK_GET_ENCODED_VIDEO_SESSION_PARAMETERS_KHR() {
        return VK_GET_ENCODED_VIDEO_SESSION_PARAMETERS_KHR;
    }

    public final LazyConstant<MethodHandle> VK_CMD_ENCODE_VIDEO_KHR() {
        return VK_CMD_ENCODE_VIDEO_KHR;
    }

    public final LazyConstant<MethodHandle> VK_CMD_BIND_INDEX_BUFFER3_KHR() {
        return VK_CMD_BIND_INDEX_BUFFER3_KHR;
    }

    public final LazyConstant<MethodHandle> VK_CMD_BIND_VERTEX_BUFFERS3_KHR() {
        return VK_CMD_BIND_VERTEX_BUFFERS3_KHR;
    }

    public final LazyConstant<MethodHandle> VK_CMD_DRAW_INDIRECT2_KHR() {
        return VK_CMD_DRAW_INDIRECT2_KHR;
    }

    public final LazyConstant<MethodHandle> VK_CMD_DRAW_INDEXED_INDIRECT2_KHR() {
        return VK_CMD_DRAW_INDEXED_INDIRECT2_KHR;
    }

    public final LazyConstant<MethodHandle> VK_CMD_DISPATCH_INDIRECT2_KHR() {
        return VK_CMD_DISPATCH_INDIRECT2_KHR;
    }

    public final LazyConstant<MethodHandle> VK_CMD_COPY_MEMORY_KHR() {
        return VK_CMD_COPY_MEMORY_KHR;
    }

    public final LazyConstant<MethodHandle> VK_CMD_COPY_MEMORY_TO_IMAGE_KHR() {
        return VK_CMD_COPY_MEMORY_TO_IMAGE_KHR;
    }

    public final LazyConstant<MethodHandle> VK_CMD_COPY_IMAGE_TO_MEMORY_KHR() {
        return VK_CMD_COPY_IMAGE_TO_MEMORY_KHR;
    }

    public final LazyConstant<MethodHandle> VK_CMD_UPDATE_MEMORY_KHR() {
        return VK_CMD_UPDATE_MEMORY_KHR;
    }

    public final LazyConstant<MethodHandle> VK_CMD_FILL_MEMORY_KHR() {
        return VK_CMD_FILL_MEMORY_KHR;
    }

    public final LazyConstant<MethodHandle> VK_CMD_COPY_QUERY_POOL_RESULTS_TO_MEMORY_KHR() {
        return VK_CMD_COPY_QUERY_POOL_RESULTS_TO_MEMORY_KHR;
    }

    public final LazyConstant<MethodHandle> VK_CMD_DRAW_INDIRECT_COUNT2_KHR() {
        return VK_CMD_DRAW_INDIRECT_COUNT2_KHR;
    }

    public final LazyConstant<MethodHandle> VK_CMD_DRAW_INDEXED_INDIRECT_COUNT2_KHR() {
        return VK_CMD_DRAW_INDEXED_INDIRECT_COUNT2_KHR;
    }

    public final LazyConstant<MethodHandle> VK_CMD_BEGIN_CONDITIONAL_RENDERING2_EXT() {
        return VK_CMD_BEGIN_CONDITIONAL_RENDERING2_EXT;
    }

    public final LazyConstant<MethodHandle> VK_CMD_BIND_TRANSFORM_FEEDBACK_BUFFERS2_EXT() {
        return VK_CMD_BIND_TRANSFORM_FEEDBACK_BUFFERS2_EXT;
    }

    public final LazyConstant<MethodHandle> VK_CMD_BEGIN_TRANSFORM_FEEDBACK2_EXT() {
        return VK_CMD_BEGIN_TRANSFORM_FEEDBACK2_EXT;
    }

    public final LazyConstant<MethodHandle> VK_CMD_END_TRANSFORM_FEEDBACK2_EXT() {
        return VK_CMD_END_TRANSFORM_FEEDBACK2_EXT;
    }

    public final LazyConstant<MethodHandle> VK_CMD_DRAW_INDIRECT_BYTE_COUNT2_EXT() {
        return VK_CMD_DRAW_INDIRECT_BYTE_COUNT2_EXT;
    }

    public final LazyConstant<MethodHandle> VK_CMD_DRAW_MESH_TASKS_INDIRECT2_EXT() {
        return VK_CMD_DRAW_MESH_TASKS_INDIRECT2_EXT;
    }

    public final LazyConstant<MethodHandle> VK_CMD_DRAW_MESH_TASKS_INDIRECT_COUNT2_EXT() {
        return VK_CMD_DRAW_MESH_TASKS_INDIRECT_COUNT2_EXT;
    }

    public final LazyConstant<MethodHandle> VK_CMD_WRITE_MARKER_TO_MEMORY_AMD() {
        return VK_CMD_WRITE_MARKER_TO_MEMORY_AMD;
    }

    public final LazyConstant<MethodHandle> VK_CREATE_ACCELERATION_STRUCTURE2_KHR() {
        return VK_CREATE_ACCELERATION_STRUCTURE2_KHR;
    }

    public final LazyConstant<MethodHandle> VK_CMD_TRACE_RAYS_INDIRECT2_KHR() {
        return VK_CMD_TRACE_RAYS_INDIRECT2_KHR;
    }

    public final LazyConstant<MethodHandle> VK_WAIT_FOR_PRESENT2_KHR() {
        return VK_WAIT_FOR_PRESENT2_KHR;
    }

    public final LazyConstant<MethodHandle> VK_CREATE_PIPELINE_BINARIES_KHR() {
        return VK_CREATE_PIPELINE_BINARIES_KHR;
    }

    public final LazyConstant<MethodHandle> VK_DESTROY_PIPELINE_BINARY_KHR() {
        return VK_DESTROY_PIPELINE_BINARY_KHR;
    }

    public final LazyConstant<MethodHandle> VK_GET_PIPELINE_KEY_KHR() {
        return VK_GET_PIPELINE_KEY_KHR;
    }

    public final LazyConstant<MethodHandle> VK_GET_PIPELINE_BINARY_DATA_KHR() {
        return VK_GET_PIPELINE_BINARY_DATA_KHR;
    }

    public final LazyConstant<MethodHandle> VK_RELEASE_CAPTURED_PIPELINE_DATA_KHR() {
        return VK_RELEASE_CAPTURED_PIPELINE_DATA_KHR;
    }

    public final LazyConstant<MethodHandle> VK_RELEASE_SWAPCHAIN_IMAGES_KHR() {
        return VK_RELEASE_SWAPCHAIN_IMAGES_KHR;
    }

    public final LazyConstant<MethodHandle> VK_GET_CALIBRATED_TIMESTAMPS_KHR() {
        return VK_GET_CALIBRATED_TIMESTAMPS_KHR;
    }

    public final LazyConstant<MethodHandle> VK_CMD_SET_DESCRIPTOR_BUFFER_OFFSETS2_EXT() {
        return VK_CMD_SET_DESCRIPTOR_BUFFER_OFFSETS2_EXT;
    }

    public final LazyConstant<MethodHandle> VK_CMD_BIND_DESCRIPTOR_BUFFER_EMBEDDED_SAMPLERS2_EXT() {
        return VK_CMD_BIND_DESCRIPTOR_BUFFER_EMBEDDED_SAMPLERS2_EXT;
    }

    public final LazyConstant<MethodHandle> VK_CMD_COPY_MEMORY_INDIRECT_KHR() {
        return VK_CMD_COPY_MEMORY_INDIRECT_KHR;
    }

    public final LazyConstant<MethodHandle> VK_CMD_COPY_MEMORY_TO_IMAGE_INDIRECT_KHR() {
        return VK_CMD_COPY_MEMORY_TO_IMAGE_INDIRECT_KHR;
    }

    public final LazyConstant<MethodHandle> VK_GET_DEVICE_FAULT_REPORTS_KHR() {
        return VK_GET_DEVICE_FAULT_REPORTS_KHR;
    }

    public final LazyConstant<MethodHandle> VK_GET_DEVICE_FAULT_DEBUG_INFO_KHR() {
        return VK_GET_DEVICE_FAULT_DEBUG_INFO_KHR;
    }

    public final LazyConstant<MethodHandle> VK_CMD_END_RENDERING2_KHR() {
        return VK_CMD_END_RENDERING2_KHR;
    }

    public final LazyConstant<MethodHandle> VK_DEBUG_MARKER_SET_OBJECT_TAG_EXT() {
        return VK_DEBUG_MARKER_SET_OBJECT_TAG_EXT;
    }

    public final LazyConstant<MethodHandle> VK_DEBUG_MARKER_SET_OBJECT_NAME_EXT() {
        return VK_DEBUG_MARKER_SET_OBJECT_NAME_EXT;
    }

    public final LazyConstant<MethodHandle> VK_CMD_DEBUG_MARKER_BEGIN_EXT() {
        return VK_CMD_DEBUG_MARKER_BEGIN_EXT;
    }

    public final LazyConstant<MethodHandle> VK_CMD_DEBUG_MARKER_END_EXT() {
        return VK_CMD_DEBUG_MARKER_END_EXT;
    }

    public final LazyConstant<MethodHandle> VK_CMD_DEBUG_MARKER_INSERT_EXT() {
        return VK_CMD_DEBUG_MARKER_INSERT_EXT;
    }

    public final LazyConstant<MethodHandle> VK_CMD_BIND_TRANSFORM_FEEDBACK_BUFFERS_EXT() {
        return VK_CMD_BIND_TRANSFORM_FEEDBACK_BUFFERS_EXT;
    }

    public final LazyConstant<MethodHandle> VK_CMD_BEGIN_TRANSFORM_FEEDBACK_EXT() {
        return VK_CMD_BEGIN_TRANSFORM_FEEDBACK_EXT;
    }

    public final LazyConstant<MethodHandle> VK_CMD_END_TRANSFORM_FEEDBACK_EXT() {
        return VK_CMD_END_TRANSFORM_FEEDBACK_EXT;
    }

    public final LazyConstant<MethodHandle> VK_CMD_BEGIN_QUERY_INDEXED_EXT() {
        return VK_CMD_BEGIN_QUERY_INDEXED_EXT;
    }

    public final LazyConstant<MethodHandle> VK_CMD_END_QUERY_INDEXED_EXT() {
        return VK_CMD_END_QUERY_INDEXED_EXT;
    }

    public final LazyConstant<MethodHandle> VK_CMD_DRAW_INDIRECT_BYTE_COUNT_EXT() {
        return VK_CMD_DRAW_INDIRECT_BYTE_COUNT_EXT;
    }

    public final LazyConstant<MethodHandle> VK_CREATE_CU_MODULE_NVX() {
        return VK_CREATE_CU_MODULE_NVX;
    }

    public final LazyConstant<MethodHandle> VK_CREATE_CU_FUNCTION_NVX() {
        return VK_CREATE_CU_FUNCTION_NVX;
    }

    public final LazyConstant<MethodHandle> VK_DESTROY_CU_MODULE_NVX() {
        return VK_DESTROY_CU_MODULE_NVX;
    }

    public final LazyConstant<MethodHandle> VK_DESTROY_CU_FUNCTION_NVX() {
        return VK_DESTROY_CU_FUNCTION_NVX;
    }

    public final LazyConstant<MethodHandle> VK_CMD_CU_LAUNCH_KERNEL_NVX() {
        return VK_CMD_CU_LAUNCH_KERNEL_NVX;
    }

    public final LazyConstant<MethodHandle> VK_GET_IMAGE_VIEW_HANDLE_NVX() {
        return VK_GET_IMAGE_VIEW_HANDLE_NVX;
    }

    public final LazyConstant<MethodHandle> VK_GET_IMAGE_VIEW_HANDLE64_NVX() {
        return VK_GET_IMAGE_VIEW_HANDLE64_NVX;
    }

    public final LazyConstant<MethodHandle> VK_GET_IMAGE_VIEW_ADDRESS_NVX() {
        return VK_GET_IMAGE_VIEW_ADDRESS_NVX;
    }

    public final LazyConstant<MethodHandle> VK_GET_DEVICE_COMBINED_IMAGE_SAMPLER_INDEX_NVX() {
        return VK_GET_DEVICE_COMBINED_IMAGE_SAMPLER_INDEX_NVX;
    }

    public final LazyConstant<MethodHandle> VK_GET_SHADER_INFO_AMD() {
        return VK_GET_SHADER_INFO_AMD;
    }

    public final LazyConstant<MethodHandle> VK_CMD_BEGIN_CONDITIONAL_RENDERING_EXT() {
        return VK_CMD_BEGIN_CONDITIONAL_RENDERING_EXT;
    }

    public final LazyConstant<MethodHandle> VK_CMD_END_CONDITIONAL_RENDERING_EXT() {
        return VK_CMD_END_CONDITIONAL_RENDERING_EXT;
    }

    public final LazyConstant<MethodHandle> VK_CMD_SET_VIEWPORT_WSCALING_NV() {
        return VK_CMD_SET_VIEWPORT_WSCALING_NV;
    }

    public final LazyConstant<MethodHandle> VK_DISPLAY_POWER_CONTROL_EXT() {
        return VK_DISPLAY_POWER_CONTROL_EXT;
    }

    public final LazyConstant<MethodHandle> VK_REGISTER_DEVICE_EVENT_EXT() {
        return VK_REGISTER_DEVICE_EVENT_EXT;
    }

    public final LazyConstant<MethodHandle> VK_REGISTER_DISPLAY_EVENT_EXT() {
        return VK_REGISTER_DISPLAY_EVENT_EXT;
    }

    public final LazyConstant<MethodHandle> VK_GET_SWAPCHAIN_COUNTER_EXT() {
        return VK_GET_SWAPCHAIN_COUNTER_EXT;
    }

    public final LazyConstant<MethodHandle> VK_GET_REFRESH_CYCLE_DURATION_GOOGLE() {
        return VK_GET_REFRESH_CYCLE_DURATION_GOOGLE;
    }

    public final LazyConstant<MethodHandle> VK_GET_PAST_PRESENTATION_TIMING_GOOGLE() {
        return VK_GET_PAST_PRESENTATION_TIMING_GOOGLE;
    }

    public final LazyConstant<MethodHandle> VK_CMD_SET_DISCARD_RECTANGLE_EXT() {
        return VK_CMD_SET_DISCARD_RECTANGLE_EXT;
    }

    public final LazyConstant<MethodHandle> VK_CMD_SET_DISCARD_RECTANGLE_ENABLE_EXT() {
        return VK_CMD_SET_DISCARD_RECTANGLE_ENABLE_EXT;
    }

    public final LazyConstant<MethodHandle> VK_CMD_SET_DISCARD_RECTANGLE_MODE_EXT() {
        return VK_CMD_SET_DISCARD_RECTANGLE_MODE_EXT;
    }

    public final LazyConstant<MethodHandle> VK_SET_HDR_METADATA_EXT() {
        return VK_SET_HDR_METADATA_EXT;
    }

    public final LazyConstant<MethodHandle> VK_SET_DEBUG_UTILS_OBJECT_NAME_EXT() {
        return VK_SET_DEBUG_UTILS_OBJECT_NAME_EXT;
    }

    public final LazyConstant<MethodHandle> VK_SET_DEBUG_UTILS_OBJECT_TAG_EXT() {
        return VK_SET_DEBUG_UTILS_OBJECT_TAG_EXT;
    }

    public final LazyConstant<MethodHandle> VK_QUEUE_BEGIN_DEBUG_UTILS_LABEL_EXT() {
        return VK_QUEUE_BEGIN_DEBUG_UTILS_LABEL_EXT;
    }

    public final LazyConstant<MethodHandle> VK_QUEUE_END_DEBUG_UTILS_LABEL_EXT() {
        return VK_QUEUE_END_DEBUG_UTILS_LABEL_EXT;
    }

    public final LazyConstant<MethodHandle> VK_QUEUE_INSERT_DEBUG_UTILS_LABEL_EXT() {
        return VK_QUEUE_INSERT_DEBUG_UTILS_LABEL_EXT;
    }

    public final LazyConstant<MethodHandle> VK_CMD_BEGIN_DEBUG_UTILS_LABEL_EXT() {
        return VK_CMD_BEGIN_DEBUG_UTILS_LABEL_EXT;
    }

    public final LazyConstant<MethodHandle> VK_CMD_END_DEBUG_UTILS_LABEL_EXT() {
        return VK_CMD_END_DEBUG_UTILS_LABEL_EXT;
    }

    public final LazyConstant<MethodHandle> VK_CMD_INSERT_DEBUG_UTILS_LABEL_EXT() {
        return VK_CMD_INSERT_DEBUG_UTILS_LABEL_EXT;
    }

    public final LazyConstant<MethodHandle> VK_CREATE_GPA_SESSION_AMD() {
        return VK_CREATE_GPA_SESSION_AMD;
    }

    public final LazyConstant<MethodHandle> VK_DESTROY_GPA_SESSION_AMD() {
        return VK_DESTROY_GPA_SESSION_AMD;
    }

    public final LazyConstant<MethodHandle> VK_SET_GPA_DEVICE_CLOCK_MODE_AMD() {
        return VK_SET_GPA_DEVICE_CLOCK_MODE_AMD;
    }

    public final LazyConstant<MethodHandle> VK_GET_GPA_DEVICE_CLOCK_INFO_AMD() {
        return VK_GET_GPA_DEVICE_CLOCK_INFO_AMD;
    }

    public final LazyConstant<MethodHandle> VK_CMD_BEGIN_GPA_SESSION_AMD() {
        return VK_CMD_BEGIN_GPA_SESSION_AMD;
    }

    public final LazyConstant<MethodHandle> VK_CMD_END_GPA_SESSION_AMD() {
        return VK_CMD_END_GPA_SESSION_AMD;
    }

    public final LazyConstant<MethodHandle> VK_CMD_BEGIN_GPA_SAMPLE_AMD() {
        return VK_CMD_BEGIN_GPA_SAMPLE_AMD;
    }

    public final LazyConstant<MethodHandle> VK_CMD_END_GPA_SAMPLE_AMD() {
        return VK_CMD_END_GPA_SAMPLE_AMD;
    }

    public final LazyConstant<MethodHandle> VK_GET_GPA_SESSION_STATUS_AMD() {
        return VK_GET_GPA_SESSION_STATUS_AMD;
    }

    public final LazyConstant<MethodHandle> VK_GET_GPA_SESSION_RESULTS_AMD() {
        return VK_GET_GPA_SESSION_RESULTS_AMD;
    }

    public final LazyConstant<MethodHandle> VK_RESET_GPA_SESSION_AMD() {
        return VK_RESET_GPA_SESSION_AMD;
    }

    public final LazyConstant<MethodHandle> VK_CMD_COPY_GPA_SESSION_RESULTS_AMD() {
        return VK_CMD_COPY_GPA_SESSION_RESULTS_AMD;
    }

    public final LazyConstant<MethodHandle> VK_WRITE_SAMPLER_DESCRIPTORS_EXT() {
        return VK_WRITE_SAMPLER_DESCRIPTORS_EXT;
    }

    public final LazyConstant<MethodHandle> VK_WRITE_RESOURCE_DESCRIPTORS_EXT() {
        return VK_WRITE_RESOURCE_DESCRIPTORS_EXT;
    }

    public final LazyConstant<MethodHandle> VK_CMD_BIND_SAMPLER_HEAP_EXT() {
        return VK_CMD_BIND_SAMPLER_HEAP_EXT;
    }

    public final LazyConstant<MethodHandle> VK_CMD_BIND_RESOURCE_HEAP_EXT() {
        return VK_CMD_BIND_RESOURCE_HEAP_EXT;
    }

    public final LazyConstant<MethodHandle> VK_CMD_PUSH_DATA_EXT() {
        return VK_CMD_PUSH_DATA_EXT;
    }

    public final LazyConstant<MethodHandle> VK_GET_IMAGE_OPAQUE_CAPTURE_DATA_EXT() {
        return VK_GET_IMAGE_OPAQUE_CAPTURE_DATA_EXT;
    }

    public final LazyConstant<MethodHandle> VK_REGISTER_CUSTOM_BORDER_COLOR_EXT() {
        return VK_REGISTER_CUSTOM_BORDER_COLOR_EXT;
    }

    public final LazyConstant<MethodHandle> VK_UNREGISTER_CUSTOM_BORDER_COLOR_EXT() {
        return VK_UNREGISTER_CUSTOM_BORDER_COLOR_EXT;
    }

    public final LazyConstant<MethodHandle> VK_GET_TENSOR_OPAQUE_CAPTURE_DATA_ARM() {
        return VK_GET_TENSOR_OPAQUE_CAPTURE_DATA_ARM;
    }

    public final LazyConstant<MethodHandle> VK_CMD_SET_SAMPLE_LOCATIONS_EXT() {
        return VK_CMD_SET_SAMPLE_LOCATIONS_EXT;
    }

    public final LazyConstant<MethodHandle> VK_GET_IMAGE_DRM_FORMAT_MODIFIER_PROPERTIES_EXT() {
        return VK_GET_IMAGE_DRM_FORMAT_MODIFIER_PROPERTIES_EXT;
    }

    public final LazyConstant<MethodHandle> VK_CREATE_VALIDATION_CACHE_EXT() {
        return VK_CREATE_VALIDATION_CACHE_EXT;
    }

    public final LazyConstant<MethodHandle> VK_DESTROY_VALIDATION_CACHE_EXT() {
        return VK_DESTROY_VALIDATION_CACHE_EXT;
    }

    public final LazyConstant<MethodHandle> VK_MERGE_VALIDATION_CACHES_EXT() {
        return VK_MERGE_VALIDATION_CACHES_EXT;
    }

    public final LazyConstant<MethodHandle> VK_GET_VALIDATION_CACHE_DATA_EXT() {
        return VK_GET_VALIDATION_CACHE_DATA_EXT;
    }

    public final LazyConstant<MethodHandle> VK_CMD_BIND_SHADING_RATE_IMAGE_NV() {
        return VK_CMD_BIND_SHADING_RATE_IMAGE_NV;
    }

    public final LazyConstant<MethodHandle> VK_CMD_SET_VIEWPORT_SHADING_RATE_PALETTE_NV() {
        return VK_CMD_SET_VIEWPORT_SHADING_RATE_PALETTE_NV;
    }

    public final LazyConstant<MethodHandle> VK_CMD_SET_COARSE_SAMPLE_ORDER_NV() {
        return VK_CMD_SET_COARSE_SAMPLE_ORDER_NV;
    }

    public final LazyConstant<MethodHandle> VK_CREATE_ACCELERATION_STRUCTURE_NV() {
        return VK_CREATE_ACCELERATION_STRUCTURE_NV;
    }

    public final LazyConstant<MethodHandle> VK_DESTROY_ACCELERATION_STRUCTURE_NV() {
        return VK_DESTROY_ACCELERATION_STRUCTURE_NV;
    }

    public final LazyConstant<MethodHandle> VK_GET_ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_NV() {
        return VK_GET_ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_NV;
    }

    public final LazyConstant<MethodHandle> VK_BIND_ACCELERATION_STRUCTURE_MEMORY_NV() {
        return VK_BIND_ACCELERATION_STRUCTURE_MEMORY_NV;
    }

    public final LazyConstant<MethodHandle> VK_CMD_BUILD_ACCELERATION_STRUCTURE_NV() {
        return VK_CMD_BUILD_ACCELERATION_STRUCTURE_NV;
    }

    public final LazyConstant<MethodHandle> VK_CMD_COPY_ACCELERATION_STRUCTURE_NV() {
        return VK_CMD_COPY_ACCELERATION_STRUCTURE_NV;
    }

    public final LazyConstant<MethodHandle> VK_CMD_TRACE_RAYS_NV() {
        return VK_CMD_TRACE_RAYS_NV;
    }

    public final LazyConstant<MethodHandle> VK_CREATE_RAY_TRACING_PIPELINES_NV() {
        return VK_CREATE_RAY_TRACING_PIPELINES_NV;
    }

    public final LazyConstant<MethodHandle> VK_GET_RAY_TRACING_SHADER_GROUP_HANDLES_KHR() {
        return VK_GET_RAY_TRACING_SHADER_GROUP_HANDLES_KHR;
    }

    public final LazyConstant<MethodHandle> VK_GET_ACCELERATION_STRUCTURE_HANDLE_NV() {
        return VK_GET_ACCELERATION_STRUCTURE_HANDLE_NV;
    }

    public final LazyConstant<MethodHandle> VK_CMD_WRITE_ACCELERATION_STRUCTURES_PROPERTIES_NV() {
        return VK_CMD_WRITE_ACCELERATION_STRUCTURES_PROPERTIES_NV;
    }

    public final LazyConstant<MethodHandle> VK_COMPILE_DEFERRED_NV() {
        return VK_COMPILE_DEFERRED_NV;
    }

    public final LazyConstant<MethodHandle> VK_GET_MEMORY_HOST_POINTER_PROPERTIES_EXT() {
        return VK_GET_MEMORY_HOST_POINTER_PROPERTIES_EXT;
    }

    public final LazyConstant<MethodHandle> VK_CMD_WRITE_BUFFER_MARKER_AMD() {
        return VK_CMD_WRITE_BUFFER_MARKER_AMD;
    }

    public final LazyConstant<MethodHandle> VK_CMD_WRITE_BUFFER_MARKER2_AMD() {
        return VK_CMD_WRITE_BUFFER_MARKER2_AMD;
    }

    public final LazyConstant<MethodHandle> VK_CMD_DRAW_MESH_TASKS_NV() {
        return VK_CMD_DRAW_MESH_TASKS_NV;
    }

    public final LazyConstant<MethodHandle> VK_CMD_DRAW_MESH_TASKS_INDIRECT_NV() {
        return VK_CMD_DRAW_MESH_TASKS_INDIRECT_NV;
    }

    public final LazyConstant<MethodHandle> VK_CMD_DRAW_MESH_TASKS_INDIRECT_COUNT_NV() {
        return VK_CMD_DRAW_MESH_TASKS_INDIRECT_COUNT_NV;
    }

    public final LazyConstant<MethodHandle> VK_CMD_SET_EXCLUSIVE_SCISSOR_ENABLE_NV() {
        return VK_CMD_SET_EXCLUSIVE_SCISSOR_ENABLE_NV;
    }

    public final LazyConstant<MethodHandle> VK_CMD_SET_EXCLUSIVE_SCISSOR_NV() {
        return VK_CMD_SET_EXCLUSIVE_SCISSOR_NV;
    }

    public final LazyConstant<MethodHandle> VK_CMD_SET_CHECKPOINT_NV() {
        return VK_CMD_SET_CHECKPOINT_NV;
    }

    public final LazyConstant<MethodHandle> VK_GET_QUEUE_CHECKPOINT_DATA_NV() {
        return VK_GET_QUEUE_CHECKPOINT_DATA_NV;
    }

    public final LazyConstant<MethodHandle> VK_GET_QUEUE_CHECKPOINT_DATA2_NV() {
        return VK_GET_QUEUE_CHECKPOINT_DATA2_NV;
    }

    public final LazyConstant<MethodHandle> VK_SET_SWAPCHAIN_PRESENT_TIMING_QUEUE_SIZE_EXT() {
        return VK_SET_SWAPCHAIN_PRESENT_TIMING_QUEUE_SIZE_EXT;
    }

    public final LazyConstant<MethodHandle> VK_GET_SWAPCHAIN_TIMING_PROPERTIES_EXT() {
        return VK_GET_SWAPCHAIN_TIMING_PROPERTIES_EXT;
    }

    public final LazyConstant<MethodHandle> VK_GET_SWAPCHAIN_TIME_DOMAIN_PROPERTIES_EXT() {
        return VK_GET_SWAPCHAIN_TIME_DOMAIN_PROPERTIES_EXT;
    }

    public final LazyConstant<MethodHandle> VK_GET_PAST_PRESENTATION_TIMING_EXT() {
        return VK_GET_PAST_PRESENTATION_TIMING_EXT;
    }

    public final LazyConstant<MethodHandle> VK_INITIALIZE_PERFORMANCE_API_INTEL() {
        return VK_INITIALIZE_PERFORMANCE_API_INTEL;
    }

    public final LazyConstant<MethodHandle> VK_UNINITIALIZE_PERFORMANCE_API_INTEL() {
        return VK_UNINITIALIZE_PERFORMANCE_API_INTEL;
    }

    public final LazyConstant<MethodHandle> VK_CMD_SET_PERFORMANCE_MARKER_INTEL() {
        return VK_CMD_SET_PERFORMANCE_MARKER_INTEL;
    }

    public final LazyConstant<MethodHandle> VK_CMD_SET_PERFORMANCE_STREAM_MARKER_INTEL() {
        return VK_CMD_SET_PERFORMANCE_STREAM_MARKER_INTEL;
    }

    public final LazyConstant<MethodHandle> VK_CMD_SET_PERFORMANCE_OVERRIDE_INTEL() {
        return VK_CMD_SET_PERFORMANCE_OVERRIDE_INTEL;
    }

    public final LazyConstant<MethodHandle> VK_ACQUIRE_PERFORMANCE_CONFIGURATION_INTEL() {
        return VK_ACQUIRE_PERFORMANCE_CONFIGURATION_INTEL;
    }

    public final LazyConstant<MethodHandle> VK_RELEASE_PERFORMANCE_CONFIGURATION_INTEL() {
        return VK_RELEASE_PERFORMANCE_CONFIGURATION_INTEL;
    }

    public final LazyConstant<MethodHandle> VK_QUEUE_SET_PERFORMANCE_CONFIGURATION_INTEL() {
        return VK_QUEUE_SET_PERFORMANCE_CONFIGURATION_INTEL;
    }

    public final LazyConstant<MethodHandle> VK_GET_PERFORMANCE_PARAMETER_INTEL() {
        return VK_GET_PERFORMANCE_PARAMETER_INTEL;
    }

    public final LazyConstant<MethodHandle> VK_SET_LOCAL_DIMMING_AMD() {
        return VK_SET_LOCAL_DIMMING_AMD;
    }

    public final LazyConstant<MethodHandle> VK_GET_GENERATED_COMMANDS_MEMORY_REQUIREMENTS_NV() {
        return VK_GET_GENERATED_COMMANDS_MEMORY_REQUIREMENTS_NV;
    }

    public final LazyConstant<MethodHandle> VK_CMD_PREPROCESS_GENERATED_COMMANDS_NV() {
        return VK_CMD_PREPROCESS_GENERATED_COMMANDS_NV;
    }

    public final LazyConstant<MethodHandle> VK_CMD_EXECUTE_GENERATED_COMMANDS_NV() {
        return VK_CMD_EXECUTE_GENERATED_COMMANDS_NV;
    }

    public final LazyConstant<MethodHandle> VK_CMD_BIND_PIPELINE_SHADER_GROUP_NV() {
        return VK_CMD_BIND_PIPELINE_SHADER_GROUP_NV;
    }

    public final LazyConstant<MethodHandle> VK_CREATE_INDIRECT_COMMANDS_LAYOUT_NV() {
        return VK_CREATE_INDIRECT_COMMANDS_LAYOUT_NV;
    }

    public final LazyConstant<MethodHandle> VK_DESTROY_INDIRECT_COMMANDS_LAYOUT_NV() {
        return VK_DESTROY_INDIRECT_COMMANDS_LAYOUT_NV;
    }

    public final LazyConstant<MethodHandle> VK_CMD_SET_DEPTH_BIAS2_EXT() {
        return VK_CMD_SET_DEPTH_BIAS2_EXT;
    }

    public final LazyConstant<MethodHandle> VK_QUEUE_SET_PERF_HINT_QCOM() {
        return VK_QUEUE_SET_PERF_HINT_QCOM;
    }

    public final LazyConstant<MethodHandle> VK_CMD_DISPATCH_TILE_QCOM() {
        return VK_CMD_DISPATCH_TILE_QCOM;
    }

    public final LazyConstant<MethodHandle> VK_CMD_BEGIN_PER_TILE_EXECUTION_QCOM() {
        return VK_CMD_BEGIN_PER_TILE_EXECUTION_QCOM;
    }

    public final LazyConstant<MethodHandle> VK_CMD_END_PER_TILE_EXECUTION_QCOM() {
        return VK_CMD_END_PER_TILE_EXECUTION_QCOM;
    }

    public final LazyConstant<MethodHandle> VK_SET_LATENCY_SLEEP_MODE_LEGACY_NV() {
        return VK_SET_LATENCY_SLEEP_MODE_LEGACY_NV;
    }

    public final LazyConstant<MethodHandle> VK_LATENCY_SLEEP_LEGACY_NV() {
        return VK_LATENCY_SLEEP_LEGACY_NV;
    }

    public final LazyConstant<MethodHandle> VK_SET_LATENCY_MARKER_LEGACY_NV() {
        return VK_SET_LATENCY_MARKER_LEGACY_NV;
    }

    public final LazyConstant<MethodHandle> VK_GET_LATENCY_TIMINGS_LEGACY_NV() {
        return VK_GET_LATENCY_TIMINGS_LEGACY_NV;
    }

    public final LazyConstant<MethodHandle> VK_QUEUE_NOTIFY_OUT_OF_BAND_LEGACY_NV() {
        return VK_QUEUE_NOTIFY_OUT_OF_BAND_LEGACY_NV;
    }

    public final LazyConstant<MethodHandle> VK_GET_SLEEP_STATUS_LEGACY_NV() {
        return VK_GET_SLEEP_STATUS_LEGACY_NV;
    }

    public final LazyConstant<MethodHandle> VK_SHUTDOWN_LATENCY_DEVICE_LEGACY_NV() {
        return VK_SHUTDOWN_LATENCY_DEVICE_LEGACY_NV;
    }

    public final LazyConstant<MethodHandle> VK_GET_DESCRIPTOR_SET_LAYOUT_SIZE_EXT() {
        return VK_GET_DESCRIPTOR_SET_LAYOUT_SIZE_EXT;
    }

    public final LazyConstant<MethodHandle> VK_GET_DESCRIPTOR_SET_LAYOUT_BINDING_OFFSET_EXT() {
        return VK_GET_DESCRIPTOR_SET_LAYOUT_BINDING_OFFSET_EXT;
    }

    public final LazyConstant<MethodHandle> VK_GET_DESCRIPTOR_EXT() {
        return VK_GET_DESCRIPTOR_EXT;
    }

    public final LazyConstant<MethodHandle> VK_CMD_BIND_DESCRIPTOR_BUFFERS_EXT() {
        return VK_CMD_BIND_DESCRIPTOR_BUFFERS_EXT;
    }

    public final LazyConstant<MethodHandle> VK_CMD_SET_DESCRIPTOR_BUFFER_OFFSETS_EXT() {
        return VK_CMD_SET_DESCRIPTOR_BUFFER_OFFSETS_EXT;
    }

    public final LazyConstant<MethodHandle> VK_CMD_BIND_DESCRIPTOR_BUFFER_EMBEDDED_SAMPLERS_EXT() {
        return VK_CMD_BIND_DESCRIPTOR_BUFFER_EMBEDDED_SAMPLERS_EXT;
    }

    public final LazyConstant<MethodHandle> VK_GET_BUFFER_OPAQUE_CAPTURE_DESCRIPTOR_DATA_EXT() {
        return VK_GET_BUFFER_OPAQUE_CAPTURE_DESCRIPTOR_DATA_EXT;
    }

    public final LazyConstant<MethodHandle> VK_GET_IMAGE_OPAQUE_CAPTURE_DESCRIPTOR_DATA_EXT() {
        return VK_GET_IMAGE_OPAQUE_CAPTURE_DESCRIPTOR_DATA_EXT;
    }

    public final LazyConstant<MethodHandle> VK_GET_IMAGE_VIEW_OPAQUE_CAPTURE_DESCRIPTOR_DATA_EXT() {
        return VK_GET_IMAGE_VIEW_OPAQUE_CAPTURE_DESCRIPTOR_DATA_EXT;
    }

    public final LazyConstant<MethodHandle> VK_GET_SAMPLER_OPAQUE_CAPTURE_DESCRIPTOR_DATA_EXT() {
        return VK_GET_SAMPLER_OPAQUE_CAPTURE_DESCRIPTOR_DATA_EXT;
    }

    public final LazyConstant<MethodHandle> VK_GET_ACCELERATION_STRUCTURE_OPAQUE_CAPTURE_DESCRIPTOR_DATA_EXT() {
        return VK_GET_ACCELERATION_STRUCTURE_OPAQUE_CAPTURE_DESCRIPTOR_DATA_EXT;
    }

    public final LazyConstant<MethodHandle> VK_CMD_SET_FRAGMENT_SHADING_RATE_ENUM_NV() {
        return VK_CMD_SET_FRAGMENT_SHADING_RATE_ENUM_NV;
    }

    public final LazyConstant<MethodHandle> VK_GET_DEVICE_FAULT_INFO_EXT() {
        return VK_GET_DEVICE_FAULT_INFO_EXT;
    }

    public final LazyConstant<MethodHandle> VK_CMD_SET_VERTEX_INPUT_EXT() {
        return VK_CMD_SET_VERTEX_INPUT_EXT;
    }

    public final LazyConstant<MethodHandle> VK_GET_DEVICE_SUBPASS_SHADING_MAX_WORKGROUP_SIZE_HUAWEI() {
        return VK_GET_DEVICE_SUBPASS_SHADING_MAX_WORKGROUP_SIZE_HUAWEI;
    }

    public final LazyConstant<MethodHandle> VK_CMD_SUBPASS_SHADING_HUAWEI() {
        return VK_CMD_SUBPASS_SHADING_HUAWEI;
    }

    public final LazyConstant<MethodHandle> VK_CMD_BIND_INVOCATION_MASK_HUAWEI() {
        return VK_CMD_BIND_INVOCATION_MASK_HUAWEI;
    }

    public final LazyConstant<MethodHandle> VK_GET_MEMORY_REMOTE_ADDRESS_NV() {
        return VK_GET_MEMORY_REMOTE_ADDRESS_NV;
    }

    public final LazyConstant<MethodHandle> VK_GET_PIPELINE_PROPERTIES_EXT() {
        return VK_GET_PIPELINE_PROPERTIES_EXT;
    }

    public final LazyConstant<MethodHandle> VK_CMD_SET_PATCH_CONTROL_POINTS_EXT() {
        return VK_CMD_SET_PATCH_CONTROL_POINTS_EXT;
    }

    public final LazyConstant<MethodHandle> VK_CMD_SET_LOGIC_OP_EXT() {
        return VK_CMD_SET_LOGIC_OP_EXT;
    }

    public final LazyConstant<MethodHandle> VK_CMD_SET_COLOR_WRITE_ENABLE_EXT() {
        return VK_CMD_SET_COLOR_WRITE_ENABLE_EXT;
    }

    public final LazyConstant<MethodHandle> VK_CMD_DRAW_MULTI_EXT() {
        return VK_CMD_DRAW_MULTI_EXT;
    }

    public final LazyConstant<MethodHandle> VK_CMD_DRAW_MULTI_INDEXED_EXT() {
        return VK_CMD_DRAW_MULTI_INDEXED_EXT;
    }

    public final LazyConstant<MethodHandle> VK_CREATE_MICROMAP_EXT() {
        return VK_CREATE_MICROMAP_EXT;
    }

    public final LazyConstant<MethodHandle> VK_DESTROY_MICROMAP_EXT() {
        return VK_DESTROY_MICROMAP_EXT;
    }

    public final LazyConstant<MethodHandle> VK_CMD_BUILD_MICROMAPS_EXT() {
        return VK_CMD_BUILD_MICROMAPS_EXT;
    }

    public final LazyConstant<MethodHandle> VK_BUILD_MICROMAPS_EXT() {
        return VK_BUILD_MICROMAPS_EXT;
    }

    public final LazyConstant<MethodHandle> VK_COPY_MICROMAP_EXT() {
        return VK_COPY_MICROMAP_EXT;
    }

    public final LazyConstant<MethodHandle> VK_COPY_MICROMAP_TO_MEMORY_EXT() {
        return VK_COPY_MICROMAP_TO_MEMORY_EXT;
    }

    public final LazyConstant<MethodHandle> VK_COPY_MEMORY_TO_MICROMAP_EXT() {
        return VK_COPY_MEMORY_TO_MICROMAP_EXT;
    }

    public final LazyConstant<MethodHandle> VK_WRITE_MICROMAPS_PROPERTIES_EXT() {
        return VK_WRITE_MICROMAPS_PROPERTIES_EXT;
    }

    public final LazyConstant<MethodHandle> VK_CMD_COPY_MICROMAP_EXT() {
        return VK_CMD_COPY_MICROMAP_EXT;
    }

    public final LazyConstant<MethodHandle> VK_CMD_COPY_MICROMAP_TO_MEMORY_EXT() {
        return VK_CMD_COPY_MICROMAP_TO_MEMORY_EXT;
    }

    public final LazyConstant<MethodHandle> VK_CMD_COPY_MEMORY_TO_MICROMAP_EXT() {
        return VK_CMD_COPY_MEMORY_TO_MICROMAP_EXT;
    }

    public final LazyConstant<MethodHandle> VK_CMD_WRITE_MICROMAPS_PROPERTIES_EXT() {
        return VK_CMD_WRITE_MICROMAPS_PROPERTIES_EXT;
    }

    public final LazyConstant<MethodHandle> VK_GET_DEVICE_MICROMAP_COMPATIBILITY_EXT() {
        return VK_GET_DEVICE_MICROMAP_COMPATIBILITY_EXT;
    }

    public final LazyConstant<MethodHandle> VK_GET_MICROMAP_BUILD_SIZES_EXT() {
        return VK_GET_MICROMAP_BUILD_SIZES_EXT;
    }

    public final LazyConstant<MethodHandle> VK_CMD_DRAW_CLUSTER_HUAWEI() {
        return VK_CMD_DRAW_CLUSTER_HUAWEI;
    }

    public final LazyConstant<MethodHandle> VK_CMD_DRAW_CLUSTER_INDIRECT_HUAWEI() {
        return VK_CMD_DRAW_CLUSTER_INDIRECT_HUAWEI;
    }

    public final LazyConstant<MethodHandle> VK_SET_DEVICE_MEMORY_PRIORITY_EXT() {
        return VK_SET_DEVICE_MEMORY_PRIORITY_EXT;
    }

    public final LazyConstant<MethodHandle> VK_CMD_SET_DISPATCH_PARAMETERS_ARM() {
        return VK_CMD_SET_DISPATCH_PARAMETERS_ARM;
    }

    public final LazyConstant<MethodHandle> VK_GET_DESCRIPTOR_SET_LAYOUT_HOST_MAPPING_INFO_VALVE() {
        return VK_GET_DESCRIPTOR_SET_LAYOUT_HOST_MAPPING_INFO_VALVE;
    }

    public final LazyConstant<MethodHandle> VK_GET_DESCRIPTOR_SET_HOST_MAPPING_VALVE() {
        return VK_GET_DESCRIPTOR_SET_HOST_MAPPING_VALVE;
    }

    public final LazyConstant<MethodHandle> VK_CMD_COPY_MEMORY_INDIRECT_NV() {
        return VK_CMD_COPY_MEMORY_INDIRECT_NV;
    }

    public final LazyConstant<MethodHandle> VK_CMD_COPY_MEMORY_TO_IMAGE_INDIRECT_NV() {
        return VK_CMD_COPY_MEMORY_TO_IMAGE_INDIRECT_NV;
    }

    public final LazyConstant<MethodHandle> VK_CMD_DECOMPRESS_MEMORY_NV() {
        return VK_CMD_DECOMPRESS_MEMORY_NV;
    }

    public final LazyConstant<MethodHandle> VK_CMD_DECOMPRESS_MEMORY_INDIRECT_COUNT_NV() {
        return VK_CMD_DECOMPRESS_MEMORY_INDIRECT_COUNT_NV;
    }

    public final LazyConstant<MethodHandle> VK_GET_PIPELINE_INDIRECT_MEMORY_REQUIREMENTS_NV() {
        return VK_GET_PIPELINE_INDIRECT_MEMORY_REQUIREMENTS_NV;
    }

    public final LazyConstant<MethodHandle> VK_CMD_UPDATE_PIPELINE_INDIRECT_BUFFER_NV() {
        return VK_CMD_UPDATE_PIPELINE_INDIRECT_BUFFER_NV;
    }

    public final LazyConstant<MethodHandle> VK_GET_PIPELINE_INDIRECT_DEVICE_ADDRESS_NV() {
        return VK_GET_PIPELINE_INDIRECT_DEVICE_ADDRESS_NV;
    }

    public final LazyConstant<MethodHandle> VK_CMD_SET_DEPTH_CLAMP_ENABLE_EXT() {
        return VK_CMD_SET_DEPTH_CLAMP_ENABLE_EXT;
    }

    public final LazyConstant<MethodHandle> VK_CMD_SET_POLYGON_MODE_EXT() {
        return VK_CMD_SET_POLYGON_MODE_EXT;
    }

    public final LazyConstant<MethodHandle> VK_CMD_SET_RASTERIZATION_SAMPLES_EXT() {
        return VK_CMD_SET_RASTERIZATION_SAMPLES_EXT;
    }

    public final LazyConstant<MethodHandle> VK_CMD_SET_SAMPLE_MASK_EXT() {
        return VK_CMD_SET_SAMPLE_MASK_EXT;
    }

    public final LazyConstant<MethodHandle> VK_CMD_SET_ALPHA_TO_COVERAGE_ENABLE_EXT() {
        return VK_CMD_SET_ALPHA_TO_COVERAGE_ENABLE_EXT;
    }

    public final LazyConstant<MethodHandle> VK_CMD_SET_ALPHA_TO_ONE_ENABLE_EXT() {
        return VK_CMD_SET_ALPHA_TO_ONE_ENABLE_EXT;
    }

    public final LazyConstant<MethodHandle> VK_CMD_SET_LOGIC_OP_ENABLE_EXT() {
        return VK_CMD_SET_LOGIC_OP_ENABLE_EXT;
    }

    public final LazyConstant<MethodHandle> VK_CMD_SET_COLOR_BLEND_ENABLE_EXT() {
        return VK_CMD_SET_COLOR_BLEND_ENABLE_EXT;
    }

    public final LazyConstant<MethodHandle> VK_CMD_SET_COLOR_BLEND_EQUATION_EXT() {
        return VK_CMD_SET_COLOR_BLEND_EQUATION_EXT;
    }

    public final LazyConstant<MethodHandle> VK_CMD_SET_COLOR_WRITE_MASK_EXT() {
        return VK_CMD_SET_COLOR_WRITE_MASK_EXT;
    }

    public final LazyConstant<MethodHandle> VK_CMD_SET_TESSELLATION_DOMAIN_ORIGIN_EXT() {
        return VK_CMD_SET_TESSELLATION_DOMAIN_ORIGIN_EXT;
    }

    public final LazyConstant<MethodHandle> VK_CMD_SET_RASTERIZATION_STREAM_EXT() {
        return VK_CMD_SET_RASTERIZATION_STREAM_EXT;
    }

    public final LazyConstant<MethodHandle> VK_CMD_SET_CONSERVATIVE_RASTERIZATION_MODE_EXT() {
        return VK_CMD_SET_CONSERVATIVE_RASTERIZATION_MODE_EXT;
    }

    public final LazyConstant<MethodHandle> VK_CMD_SET_EXTRA_PRIMITIVE_OVERESTIMATION_SIZE_EXT() {
        return VK_CMD_SET_EXTRA_PRIMITIVE_OVERESTIMATION_SIZE_EXT;
    }

    public final LazyConstant<MethodHandle> VK_CMD_SET_DEPTH_CLIP_ENABLE_EXT() {
        return VK_CMD_SET_DEPTH_CLIP_ENABLE_EXT;
    }

    public final LazyConstant<MethodHandle> VK_CMD_SET_SAMPLE_LOCATIONS_ENABLE_EXT() {
        return VK_CMD_SET_SAMPLE_LOCATIONS_ENABLE_EXT;
    }

    public final LazyConstant<MethodHandle> VK_CMD_SET_COLOR_BLEND_ADVANCED_EXT() {
        return VK_CMD_SET_COLOR_BLEND_ADVANCED_EXT;
    }

    public final LazyConstant<MethodHandle> VK_CMD_SET_PROVOKING_VERTEX_MODE_EXT() {
        return VK_CMD_SET_PROVOKING_VERTEX_MODE_EXT;
    }

    public final LazyConstant<MethodHandle> VK_CMD_SET_LINE_RASTERIZATION_MODE_EXT() {
        return VK_CMD_SET_LINE_RASTERIZATION_MODE_EXT;
    }

    public final LazyConstant<MethodHandle> VK_CMD_SET_LINE_STIPPLE_ENABLE_EXT() {
        return VK_CMD_SET_LINE_STIPPLE_ENABLE_EXT;
    }

    public final LazyConstant<MethodHandle> VK_CMD_SET_DEPTH_CLIP_NEGATIVE_ONE_TO_ONE_EXT() {
        return VK_CMD_SET_DEPTH_CLIP_NEGATIVE_ONE_TO_ONE_EXT;
    }

    public final LazyConstant<MethodHandle> VK_CMD_SET_VIEWPORT_WSCALING_ENABLE_NV() {
        return VK_CMD_SET_VIEWPORT_WSCALING_ENABLE_NV;
    }

    public final LazyConstant<MethodHandle> VK_CMD_SET_VIEWPORT_SWIZZLE_NV() {
        return VK_CMD_SET_VIEWPORT_SWIZZLE_NV;
    }

    public final LazyConstant<MethodHandle> VK_CMD_SET_COVERAGE_TO_COLOR_ENABLE_NV() {
        return VK_CMD_SET_COVERAGE_TO_COLOR_ENABLE_NV;
    }

    public final LazyConstant<MethodHandle> VK_CMD_SET_COVERAGE_TO_COLOR_LOCATION_NV() {
        return VK_CMD_SET_COVERAGE_TO_COLOR_LOCATION_NV;
    }

    public final LazyConstant<MethodHandle> VK_CMD_SET_COVERAGE_MODULATION_MODE_NV() {
        return VK_CMD_SET_COVERAGE_MODULATION_MODE_NV;
    }

    public final LazyConstant<MethodHandle> VK_CMD_SET_COVERAGE_MODULATION_TABLE_ENABLE_NV() {
        return VK_CMD_SET_COVERAGE_MODULATION_TABLE_ENABLE_NV;
    }

    public final LazyConstant<MethodHandle> VK_CMD_SET_COVERAGE_MODULATION_TABLE_NV() {
        return VK_CMD_SET_COVERAGE_MODULATION_TABLE_NV;
    }

    public final LazyConstant<MethodHandle> VK_CMD_SET_SHADING_RATE_IMAGE_ENABLE_NV() {
        return VK_CMD_SET_SHADING_RATE_IMAGE_ENABLE_NV;
    }

    public final LazyConstant<MethodHandle> VK_CMD_SET_REPRESENTATIVE_FRAGMENT_TEST_ENABLE_NV() {
        return VK_CMD_SET_REPRESENTATIVE_FRAGMENT_TEST_ENABLE_NV;
    }

    public final LazyConstant<MethodHandle> VK_CMD_SET_COVERAGE_REDUCTION_MODE_NV() {
        return VK_CMD_SET_COVERAGE_REDUCTION_MODE_NV;
    }

    public final LazyConstant<MethodHandle> VK_CREATE_TENSOR_ARM() {
        return VK_CREATE_TENSOR_ARM;
    }

    public final LazyConstant<MethodHandle> VK_DESTROY_TENSOR_ARM() {
        return VK_DESTROY_TENSOR_ARM;
    }

    public final LazyConstant<MethodHandle> VK_CREATE_TENSOR_VIEW_ARM() {
        return VK_CREATE_TENSOR_VIEW_ARM;
    }

    public final LazyConstant<MethodHandle> VK_DESTROY_TENSOR_VIEW_ARM() {
        return VK_DESTROY_TENSOR_VIEW_ARM;
    }

    public final LazyConstant<MethodHandle> VK_GET_TENSOR_MEMORY_REQUIREMENTS_ARM() {
        return VK_GET_TENSOR_MEMORY_REQUIREMENTS_ARM;
    }

    public final LazyConstant<MethodHandle> VK_BIND_TENSOR_MEMORY_ARM() {
        return VK_BIND_TENSOR_MEMORY_ARM;
    }

    public final LazyConstant<MethodHandle> VK_GET_DEVICE_TENSOR_MEMORY_REQUIREMENTS_ARM() {
        return VK_GET_DEVICE_TENSOR_MEMORY_REQUIREMENTS_ARM;
    }

    public final LazyConstant<MethodHandle> VK_CMD_COPY_TENSOR_ARM() {
        return VK_CMD_COPY_TENSOR_ARM;
    }

    public final LazyConstant<MethodHandle> VK_GET_TENSOR_OPAQUE_CAPTURE_DESCRIPTOR_DATA_ARM() {
        return VK_GET_TENSOR_OPAQUE_CAPTURE_DESCRIPTOR_DATA_ARM;
    }

    public final LazyConstant<MethodHandle> VK_GET_TENSOR_VIEW_OPAQUE_CAPTURE_DESCRIPTOR_DATA_ARM() {
        return VK_GET_TENSOR_VIEW_OPAQUE_CAPTURE_DESCRIPTOR_DATA_ARM;
    }

    public final LazyConstant<MethodHandle> VK_GET_SHADER_MODULE_IDENTIFIER_EXT() {
        return VK_GET_SHADER_MODULE_IDENTIFIER_EXT;
    }

    public final LazyConstant<MethodHandle> VK_GET_SHADER_MODULE_CREATE_INFO_IDENTIFIER_EXT() {
        return VK_GET_SHADER_MODULE_CREATE_INFO_IDENTIFIER_EXT;
    }

    public final LazyConstant<MethodHandle> VK_CREATE_OPTICAL_FLOW_SESSION_NV() {
        return VK_CREATE_OPTICAL_FLOW_SESSION_NV;
    }

    public final LazyConstant<MethodHandle> VK_DESTROY_OPTICAL_FLOW_SESSION_NV() {
        return VK_DESTROY_OPTICAL_FLOW_SESSION_NV;
    }

    public final LazyConstant<MethodHandle> VK_BIND_OPTICAL_FLOW_SESSION_IMAGE_NV() {
        return VK_BIND_OPTICAL_FLOW_SESSION_IMAGE_NV;
    }

    public final LazyConstant<MethodHandle> VK_CMD_OPTICAL_FLOW_EXECUTE_NV() {
        return VK_CMD_OPTICAL_FLOW_EXECUTE_NV;
    }

    public final LazyConstant<MethodHandle> VK_ANTI_LAG_UPDATE_AMD() {
        return VK_ANTI_LAG_UPDATE_AMD;
    }

    public final LazyConstant<MethodHandle> VK_CREATE_SHADERS_EXT() {
        return VK_CREATE_SHADERS_EXT;
    }

    public final LazyConstant<MethodHandle> VK_DESTROY_SHADER_EXT() {
        return VK_DESTROY_SHADER_EXT;
    }

    public final LazyConstant<MethodHandle> VK_GET_SHADER_BINARY_DATA_EXT() {
        return VK_GET_SHADER_BINARY_DATA_EXT;
    }

    public final LazyConstant<MethodHandle> VK_CMD_BIND_SHADERS_EXT() {
        return VK_CMD_BIND_SHADERS_EXT;
    }

    public final LazyConstant<MethodHandle> VK_CMD_SET_DEPTH_CLAMP_RANGE_EXT() {
        return VK_CMD_SET_DEPTH_CLAMP_RANGE_EXT;
    }

    public final LazyConstant<MethodHandle> VK_GET_FRAMEBUFFER_TILE_PROPERTIES_QCOM() {
        return VK_GET_FRAMEBUFFER_TILE_PROPERTIES_QCOM;
    }

    public final LazyConstant<MethodHandle> VK_GET_DYNAMIC_RENDERING_TILE_PROPERTIES_QCOM() {
        return VK_GET_DYNAMIC_RENDERING_TILE_PROPERTIES_QCOM;
    }

    public final LazyConstant<MethodHandle> VK_CONVERT_COOPERATIVE_VECTOR_MATRIX_NV() {
        return VK_CONVERT_COOPERATIVE_VECTOR_MATRIX_NV;
    }

    public final LazyConstant<MethodHandle> VK_CMD_CONVERT_COOPERATIVE_VECTOR_MATRIX_NV() {
        return VK_CMD_CONVERT_COOPERATIVE_VECTOR_MATRIX_NV;
    }

    public final LazyConstant<MethodHandle> VK_SET_LATENCY_SLEEP_MODE_NV() {
        return VK_SET_LATENCY_SLEEP_MODE_NV;
    }

    public final LazyConstant<MethodHandle> VK_LATENCY_SLEEP_NV() {
        return VK_LATENCY_SLEEP_NV;
    }

    public final LazyConstant<MethodHandle> VK_SET_LATENCY_MARKER_NV() {
        return VK_SET_LATENCY_MARKER_NV;
    }

    public final LazyConstant<MethodHandle> VK_GET_LATENCY_TIMINGS_NV() {
        return VK_GET_LATENCY_TIMINGS_NV;
    }

    public final LazyConstant<MethodHandle> VK_QUEUE_NOTIFY_OUT_OF_BAND_NV() {
        return VK_QUEUE_NOTIFY_OUT_OF_BAND_NV;
    }

    public final LazyConstant<MethodHandle> VK_CREATE_DATA_GRAPH_PIPELINES_ARM() {
        return VK_CREATE_DATA_GRAPH_PIPELINES_ARM;
    }

    public final LazyConstant<MethodHandle> VK_CREATE_DATA_GRAPH_PIPELINE_SESSION_ARM() {
        return VK_CREATE_DATA_GRAPH_PIPELINE_SESSION_ARM;
    }

    public final LazyConstant<MethodHandle> VK_GET_DATA_GRAPH_PIPELINE_SESSION_BIND_POINT_REQUIREMENTS_ARM() {
        return VK_GET_DATA_GRAPH_PIPELINE_SESSION_BIND_POINT_REQUIREMENTS_ARM;
    }

    public final LazyConstant<MethodHandle> VK_GET_DATA_GRAPH_PIPELINE_SESSION_MEMORY_REQUIREMENTS_ARM() {
        return VK_GET_DATA_GRAPH_PIPELINE_SESSION_MEMORY_REQUIREMENTS_ARM;
    }

    public final LazyConstant<MethodHandle> VK_BIND_DATA_GRAPH_PIPELINE_SESSION_MEMORY_ARM() {
        return VK_BIND_DATA_GRAPH_PIPELINE_SESSION_MEMORY_ARM;
    }

    public final LazyConstant<MethodHandle> VK_DESTROY_DATA_GRAPH_PIPELINE_SESSION_ARM() {
        return VK_DESTROY_DATA_GRAPH_PIPELINE_SESSION_ARM;
    }

    public final LazyConstant<MethodHandle> VK_CMD_DISPATCH_DATA_GRAPH_ARM() {
        return VK_CMD_DISPATCH_DATA_GRAPH_ARM;
    }

    public final LazyConstant<MethodHandle> VK_GET_DATA_GRAPH_PIPELINE_AVAILABLE_PROPERTIES_ARM() {
        return VK_GET_DATA_GRAPH_PIPELINE_AVAILABLE_PROPERTIES_ARM;
    }

    public final LazyConstant<MethodHandle> VK_GET_DATA_GRAPH_PIPELINE_PROPERTIES_ARM() {
        return VK_GET_DATA_GRAPH_PIPELINE_PROPERTIES_ARM;
    }

    public final LazyConstant<MethodHandle> VK_CMD_SET_ATTACHMENT_FEEDBACK_LOOP_ENABLE_EXT() {
        return VK_CMD_SET_ATTACHMENT_FEEDBACK_LOOP_ENABLE_EXT;
    }

    public final LazyConstant<MethodHandle> VK_CMD_BIND_TILE_MEMORY_QCOM() {
        return VK_CMD_BIND_TILE_MEMORY_QCOM;
    }

    public final LazyConstant<MethodHandle> VK_CMD_DECOMPRESS_MEMORY_EXT() {
        return VK_CMD_DECOMPRESS_MEMORY_EXT;
    }

    public final LazyConstant<MethodHandle> VK_CMD_DECOMPRESS_MEMORY_INDIRECT_COUNT_EXT() {
        return VK_CMD_DECOMPRESS_MEMORY_INDIRECT_COUNT_EXT;
    }

    public final LazyConstant<MethodHandle> VK_CREATE_EXTERNAL_COMPUTE_QUEUE_NV() {
        return VK_CREATE_EXTERNAL_COMPUTE_QUEUE_NV;
    }

    public final LazyConstant<MethodHandle> VK_DESTROY_EXTERNAL_COMPUTE_QUEUE_NV() {
        return VK_DESTROY_EXTERNAL_COMPUTE_QUEUE_NV;
    }

    public final LazyConstant<MethodHandle> VK_GET_CLUSTER_ACCELERATION_STRUCTURE_BUILD_SIZES_NV() {
        return VK_GET_CLUSTER_ACCELERATION_STRUCTURE_BUILD_SIZES_NV;
    }

    public final LazyConstant<MethodHandle> VK_CMD_BUILD_CLUSTER_ACCELERATION_STRUCTURE_INDIRECT_NV() {
        return VK_CMD_BUILD_CLUSTER_ACCELERATION_STRUCTURE_INDIRECT_NV;
    }

    public final LazyConstant<MethodHandle> VK_GET_PARTITIONED_ACCELERATION_STRUCTURES_BUILD_SIZES_NV() {
        return VK_GET_PARTITIONED_ACCELERATION_STRUCTURES_BUILD_SIZES_NV;
    }

    public final LazyConstant<MethodHandle> VK_CMD_BUILD_PARTITIONED_ACCELERATION_STRUCTURES_NV() {
        return VK_CMD_BUILD_PARTITIONED_ACCELERATION_STRUCTURES_NV;
    }

    public final LazyConstant<MethodHandle> VK_GET_GENERATED_COMMANDS_MEMORY_REQUIREMENTS_EXT() {
        return VK_GET_GENERATED_COMMANDS_MEMORY_REQUIREMENTS_EXT;
    }

    public final LazyConstant<MethodHandle> VK_CMD_PREPROCESS_GENERATED_COMMANDS_EXT() {
        return VK_CMD_PREPROCESS_GENERATED_COMMANDS_EXT;
    }

    public final LazyConstant<MethodHandle> VK_CMD_EXECUTE_GENERATED_COMMANDS_EXT() {
        return VK_CMD_EXECUTE_GENERATED_COMMANDS_EXT;
    }

    public final LazyConstant<MethodHandle> VK_CREATE_INDIRECT_COMMANDS_LAYOUT_EXT() {
        return VK_CREATE_INDIRECT_COMMANDS_LAYOUT_EXT;
    }

    public final LazyConstant<MethodHandle> VK_DESTROY_INDIRECT_COMMANDS_LAYOUT_EXT() {
        return VK_DESTROY_INDIRECT_COMMANDS_LAYOUT_EXT;
    }

    public final LazyConstant<MethodHandle> VK_CREATE_INDIRECT_EXECUTION_SET_EXT() {
        return VK_CREATE_INDIRECT_EXECUTION_SET_EXT;
    }

    public final LazyConstant<MethodHandle> VK_DESTROY_INDIRECT_EXECUTION_SET_EXT() {
        return VK_DESTROY_INDIRECT_EXECUTION_SET_EXT;
    }

    public final LazyConstant<MethodHandle> VK_UPDATE_INDIRECT_EXECUTION_SET_PIPELINE_EXT() {
        return VK_UPDATE_INDIRECT_EXECUTION_SET_PIPELINE_EXT;
    }

    public final LazyConstant<MethodHandle> VK_UPDATE_INDIRECT_EXECUTION_SET_SHADER_EXT() {
        return VK_UPDATE_INDIRECT_EXECUTION_SET_SHADER_EXT;
    }

    public final LazyConstant<MethodHandle> VK_CREATE_SHADER_INSTRUMENTATION_ARM() {
        return VK_CREATE_SHADER_INSTRUMENTATION_ARM;
    }

    public final LazyConstant<MethodHandle> VK_DESTROY_SHADER_INSTRUMENTATION_ARM() {
        return VK_DESTROY_SHADER_INSTRUMENTATION_ARM;
    }

    public final LazyConstant<MethodHandle> VK_CMD_BEGIN_SHADER_INSTRUMENTATION_ARM() {
        return VK_CMD_BEGIN_SHADER_INSTRUMENTATION_ARM;
    }

    public final LazyConstant<MethodHandle> VK_CMD_END_SHADER_INSTRUMENTATION_ARM() {
        return VK_CMD_END_SHADER_INSTRUMENTATION_ARM;
    }

    public final LazyConstant<MethodHandle> VK_GET_SHADER_INSTRUMENTATION_VALUES_ARM() {
        return VK_GET_SHADER_INSTRUMENTATION_VALUES_ARM;
    }

    public final LazyConstant<MethodHandle> VK_CLEAR_SHADER_INSTRUMENTATION_METRICS_ARM() {
        return VK_CLEAR_SHADER_INSTRUMENTATION_METRICS_ARM;
    }

    public final LazyConstant<MethodHandle> VK_CMD_BEGIN_CUSTOM_RESOLVE_EXT() {
        return VK_CMD_BEGIN_CUSTOM_RESOLVE_EXT;
    }

    public final LazyConstant<MethodHandle> VK_CMD_SET_COMPUTE_OCCUPANCY_PRIORITY_NV() {
        return VK_CMD_SET_COMPUTE_OCCUPANCY_PRIORITY_NV;
    }

    public final LazyConstant<MethodHandle> VK_CMD_SET_PRIMITIVE_RESTART_INDEX_EXT() {
        return VK_CMD_SET_PRIMITIVE_RESTART_INDEX_EXT;
    }

    public final LazyConstant<MethodHandle> VK_CREATE_ACCELERATION_STRUCTURE_KHR() {
        return VK_CREATE_ACCELERATION_STRUCTURE_KHR;
    }

    public final LazyConstant<MethodHandle> VK_DESTROY_ACCELERATION_STRUCTURE_KHR() {
        return VK_DESTROY_ACCELERATION_STRUCTURE_KHR;
    }

    public final LazyConstant<MethodHandle> VK_CMD_BUILD_ACCELERATION_STRUCTURES_KHR() {
        return VK_CMD_BUILD_ACCELERATION_STRUCTURES_KHR;
    }

    public final LazyConstant<MethodHandle> VK_CMD_BUILD_ACCELERATION_STRUCTURES_INDIRECT_KHR() {
        return VK_CMD_BUILD_ACCELERATION_STRUCTURES_INDIRECT_KHR;
    }

    public final LazyConstant<MethodHandle> VK_BUILD_ACCELERATION_STRUCTURES_KHR() {
        return VK_BUILD_ACCELERATION_STRUCTURES_KHR;
    }

    public final LazyConstant<MethodHandle> VK_COPY_ACCELERATION_STRUCTURE_KHR() {
        return VK_COPY_ACCELERATION_STRUCTURE_KHR;
    }

    public final LazyConstant<MethodHandle> VK_COPY_ACCELERATION_STRUCTURE_TO_MEMORY_KHR() {
        return VK_COPY_ACCELERATION_STRUCTURE_TO_MEMORY_KHR;
    }

    public final LazyConstant<MethodHandle> VK_COPY_MEMORY_TO_ACCELERATION_STRUCTURE_KHR() {
        return VK_COPY_MEMORY_TO_ACCELERATION_STRUCTURE_KHR;
    }

    public final LazyConstant<MethodHandle> VK_WRITE_ACCELERATION_STRUCTURES_PROPERTIES_KHR() {
        return VK_WRITE_ACCELERATION_STRUCTURES_PROPERTIES_KHR;
    }

    public final LazyConstant<MethodHandle> VK_CMD_COPY_ACCELERATION_STRUCTURE_KHR() {
        return VK_CMD_COPY_ACCELERATION_STRUCTURE_KHR;
    }

    public final LazyConstant<MethodHandle> VK_CMD_COPY_ACCELERATION_STRUCTURE_TO_MEMORY_KHR() {
        return VK_CMD_COPY_ACCELERATION_STRUCTURE_TO_MEMORY_KHR;
    }

    public final LazyConstant<MethodHandle> VK_CMD_COPY_MEMORY_TO_ACCELERATION_STRUCTURE_KHR() {
        return VK_CMD_COPY_MEMORY_TO_ACCELERATION_STRUCTURE_KHR;
    }

    public final LazyConstant<MethodHandle> VK_GET_ACCELERATION_STRUCTURE_DEVICE_ADDRESS_KHR() {
        return VK_GET_ACCELERATION_STRUCTURE_DEVICE_ADDRESS_KHR;
    }

    public final LazyConstant<MethodHandle> VK_CMD_WRITE_ACCELERATION_STRUCTURES_PROPERTIES_KHR() {
        return VK_CMD_WRITE_ACCELERATION_STRUCTURES_PROPERTIES_KHR;
    }

    public final LazyConstant<MethodHandle> VK_GET_DEVICE_ACCELERATION_STRUCTURE_COMPATIBILITY_KHR() {
        return VK_GET_DEVICE_ACCELERATION_STRUCTURE_COMPATIBILITY_KHR;
    }

    public final LazyConstant<MethodHandle> VK_GET_ACCELERATION_STRUCTURE_BUILD_SIZES_KHR() {
        return VK_GET_ACCELERATION_STRUCTURE_BUILD_SIZES_KHR;
    }

    public final LazyConstant<MethodHandle> VK_CMD_TRACE_RAYS_KHR() {
        return VK_CMD_TRACE_RAYS_KHR;
    }

    public final LazyConstant<MethodHandle> VK_CREATE_RAY_TRACING_PIPELINES_KHR() {
        return VK_CREATE_RAY_TRACING_PIPELINES_KHR;
    }

    public final LazyConstant<MethodHandle> VK_GET_RAY_TRACING_CAPTURE_REPLAY_SHADER_GROUP_HANDLES_KHR() {
        return VK_GET_RAY_TRACING_CAPTURE_REPLAY_SHADER_GROUP_HANDLES_KHR;
    }

    public final LazyConstant<MethodHandle> VK_CMD_TRACE_RAYS_INDIRECT_KHR() {
        return VK_CMD_TRACE_RAYS_INDIRECT_KHR;
    }

    public final LazyConstant<MethodHandle> VK_GET_RAY_TRACING_SHADER_GROUP_STACK_SIZE_KHR() {
        return VK_GET_RAY_TRACING_SHADER_GROUP_STACK_SIZE_KHR;
    }

    public final LazyConstant<MethodHandle> VK_CMD_SET_RAY_TRACING_PIPELINE_STACK_SIZE_KHR() {
        return VK_CMD_SET_RAY_TRACING_PIPELINE_STACK_SIZE_KHR;
    }

    public final LazyConstant<MethodHandle> VK_CMD_DRAW_MESH_TASKS_EXT() {
        return VK_CMD_DRAW_MESH_TASKS_EXT;
    }

    public final LazyConstant<MethodHandle> VK_CMD_DRAW_MESH_TASKS_INDIRECT_EXT() {
        return VK_CMD_DRAW_MESH_TASKS_INDIRECT_EXT;
    }

    public final LazyConstant<MethodHandle> VK_CMD_DRAW_MESH_TASKS_INDIRECT_COUNT_EXT() {
        return VK_CMD_DRAW_MESH_TASKS_INDIRECT_COUNT_EXT;
    }

    public MemorySegment memorySegment() {
        return segment;
    }

    public LazyConstant<MethodHandle> downcallHandle(
		String name,
		MemoryLayout resLayout,
		MemoryLayout... argLayouts
	) {
	    return LazyConstant.of(() -> {
			try (Arena arena = Arena.ofConfined()) {
                MethodHandle method = VK_GET_DEVICE_PROC_ADDR.get();

				MemorySegment address = (MemorySegment) method.invokeExact(
						segment,
						arena.allocateFrom(name)
				);

				Linker linker = Linker.nativeLinker();
				return linker.downcallHandle(address, FunctionDescriptor.of(resLayout, argLayouts));
			} catch (Throwable e) {
                throw new RuntimeException(e);
            }
		});
	}

    public LazyConstant<MethodHandle> downcallHandleVoid(
		String name,
		MemoryLayout... argLayouts
	) {
	    return LazyConstant.of(() -> {
			try (Arena arena = Arena.ofConfined()) {
                MethodHandle method = VK_GET_DEVICE_PROC_ADDR.get();

				MemorySegment address = (MemorySegment) method.invokeExact(
						segment,
						arena.allocateFrom(name)
				);

				Linker linker = Linker.nativeLinker();
				return linker.downcallHandle(address, FunctionDescriptor.ofVoid(argLayouts));
			} catch (Throwable e) {
                throw new RuntimeException(e);
            }
		});
	}

}