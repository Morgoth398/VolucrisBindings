/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan;

import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

public final class VkCommandBuffer {

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
    private final LazyConstant<MethodHandle> VK_CMD_BIND_PIPELINE;
    private final LazyConstant<MethodHandle> VK_CMD_BIND_DESCRIPTOR_SETS;
    private final LazyConstant<MethodHandle> VK_CMD_CLEAR_COLOR_IMAGE;
    private final LazyConstant<MethodHandle> VK_CMD_DISPATCH;
    private final LazyConstant<MethodHandle> VK_CMD_DISPATCH_INDIRECT;
    private final LazyConstant<MethodHandle> VK_CMD_SET_EVENT;
    private final LazyConstant<MethodHandle> VK_CMD_RESET_EVENT;
    private final LazyConstant<MethodHandle> VK_CMD_WAIT_EVENTS;
    private final LazyConstant<MethodHandle> VK_CMD_PUSH_CONSTANTS;
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
    private final LazyConstant<MethodHandle> VK_CMD_SET_DEVICE_MASK;
    private final LazyConstant<MethodHandle> VK_CMD_DISPATCH_BASE;
    private final LazyConstant<MethodHandle> VK_CMD_DRAW_INDIRECT_COUNT;
    private final LazyConstant<MethodHandle> VK_CMD_DRAW_INDEXED_INDIRECT_COUNT;
    private final LazyConstant<MethodHandle> VK_CMD_BEGIN_RENDER_PASS2;
    private final LazyConstant<MethodHandle> VK_CMD_NEXT_SUBPASS2;
    private final LazyConstant<MethodHandle> VK_CMD_END_RENDER_PASS2;
    private final LazyConstant<MethodHandle> VK_CMD_PIPELINE_BARRIER2;
    private final LazyConstant<MethodHandle> VK_CMD_WRITE_TIMESTAMP2;
    private final LazyConstant<MethodHandle> VK_CMD_COPY_BUFFER2;
    private final LazyConstant<MethodHandle> VK_CMD_COPY_IMAGE2;
    private final LazyConstant<MethodHandle> VK_CMD_COPY_BUFFER_TO_IMAGE2;
    private final LazyConstant<MethodHandle> VK_CMD_COPY_IMAGE_TO_BUFFER2;
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
    private final LazyConstant<MethodHandle> VK_CMD_PUSH_DESCRIPTOR_SET;
    private final LazyConstant<MethodHandle> VK_CMD_PUSH_DESCRIPTOR_SET_WITH_TEMPLATE;
    private final LazyConstant<MethodHandle> VK_CMD_BIND_DESCRIPTOR_SETS2;
    private final LazyConstant<MethodHandle> VK_CMD_PUSH_CONSTANTS2;
    private final LazyConstant<MethodHandle> VK_CMD_PUSH_DESCRIPTOR_SET2;
    private final LazyConstant<MethodHandle> VK_CMD_PUSH_DESCRIPTOR_SET_WITH_TEMPLATE2;
    private final LazyConstant<MethodHandle> VK_CMD_SET_LINE_STIPPLE;
    private final LazyConstant<MethodHandle> VK_CMD_BIND_INDEX_BUFFER2;
    private final LazyConstant<MethodHandle> VK_CMD_SET_RENDERING_ATTACHMENT_LOCATIONS;
    private final LazyConstant<MethodHandle> VK_CMD_SET_RENDERING_INPUT_ATTACHMENT_INDICES;
    private final LazyConstant<MethodHandle> VK_CMD_BEGIN_VIDEO_CODING_KHR;
    private final LazyConstant<MethodHandle> VK_CMD_END_VIDEO_CODING_KHR;
    private final LazyConstant<MethodHandle> VK_CMD_CONTROL_VIDEO_CODING_KHR;
    private final LazyConstant<MethodHandle> VK_CMD_DECODE_VIDEO_KHR;
    private final LazyConstant<MethodHandle> VK_CMD_SET_FRAGMENT_SHADING_RATE_KHR;
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
    private final LazyConstant<MethodHandle> VK_CMD_TRACE_RAYS_INDIRECT2_KHR;
    private final LazyConstant<MethodHandle> VK_CMD_SET_DESCRIPTOR_BUFFER_OFFSETS2_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_BIND_DESCRIPTOR_BUFFER_EMBEDDED_SAMPLERS2_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_COPY_MEMORY_INDIRECT_KHR;
    private final LazyConstant<MethodHandle> VK_CMD_COPY_MEMORY_TO_IMAGE_INDIRECT_KHR;
    private final LazyConstant<MethodHandle> VK_CMD_END_RENDERING2_KHR;
    private final LazyConstant<MethodHandle> VK_CMD_DEBUG_MARKER_BEGIN_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_DEBUG_MARKER_END_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_DEBUG_MARKER_INSERT_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_BIND_TRANSFORM_FEEDBACK_BUFFERS_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_BEGIN_TRANSFORM_FEEDBACK_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_END_TRANSFORM_FEEDBACK_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_BEGIN_QUERY_INDEXED_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_END_QUERY_INDEXED_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_DRAW_INDIRECT_BYTE_COUNT_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_CU_LAUNCH_KERNEL_NVX;
    private final LazyConstant<MethodHandle> VK_CMD_BEGIN_CONDITIONAL_RENDERING_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_END_CONDITIONAL_RENDERING_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_SET_VIEWPORT_WSCALING_NV;
    private final LazyConstant<MethodHandle> VK_CMD_SET_DISCARD_RECTANGLE_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_SET_DISCARD_RECTANGLE_ENABLE_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_SET_DISCARD_RECTANGLE_MODE_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_BEGIN_DEBUG_UTILS_LABEL_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_END_DEBUG_UTILS_LABEL_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_INSERT_DEBUG_UTILS_LABEL_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_BEGIN_GPA_SESSION_AMD;
    private final LazyConstant<MethodHandle> VK_CMD_END_GPA_SESSION_AMD;
    private final LazyConstant<MethodHandle> VK_CMD_BEGIN_GPA_SAMPLE_AMD;
    private final LazyConstant<MethodHandle> VK_CMD_END_GPA_SAMPLE_AMD;
    private final LazyConstant<MethodHandle> VK_CMD_COPY_GPA_SESSION_RESULTS_AMD;
    private final LazyConstant<MethodHandle> VK_CMD_BIND_SAMPLER_HEAP_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_BIND_RESOURCE_HEAP_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_PUSH_DATA_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_SET_SAMPLE_LOCATIONS_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_BIND_SHADING_RATE_IMAGE_NV;
    private final LazyConstant<MethodHandle> VK_CMD_SET_VIEWPORT_SHADING_RATE_PALETTE_NV;
    private final LazyConstant<MethodHandle> VK_CMD_SET_COARSE_SAMPLE_ORDER_NV;
    private final LazyConstant<MethodHandle> VK_CMD_BUILD_ACCELERATION_STRUCTURE_NV;
    private final LazyConstant<MethodHandle> VK_CMD_COPY_ACCELERATION_STRUCTURE_NV;
    private final LazyConstant<MethodHandle> VK_CMD_TRACE_RAYS_NV;
    private final LazyConstant<MethodHandle> VK_CMD_WRITE_ACCELERATION_STRUCTURES_PROPERTIES_NV;
    private final LazyConstant<MethodHandle> VK_CMD_WRITE_BUFFER_MARKER_AMD;
    private final LazyConstant<MethodHandle> VK_CMD_WRITE_BUFFER_MARKER2_AMD;
    private final LazyConstant<MethodHandle> VK_CMD_DRAW_MESH_TASKS_NV;
    private final LazyConstant<MethodHandle> VK_CMD_DRAW_MESH_TASKS_INDIRECT_NV;
    private final LazyConstant<MethodHandle> VK_CMD_DRAW_MESH_TASKS_INDIRECT_COUNT_NV;
    private final LazyConstant<MethodHandle> VK_CMD_SET_EXCLUSIVE_SCISSOR_ENABLE_NV;
    private final LazyConstant<MethodHandle> VK_CMD_SET_EXCLUSIVE_SCISSOR_NV;
    private final LazyConstant<MethodHandle> VK_CMD_SET_CHECKPOINT_NV;
    private final LazyConstant<MethodHandle> VK_CMD_SET_PERFORMANCE_MARKER_INTEL;
    private final LazyConstant<MethodHandle> VK_CMD_SET_PERFORMANCE_STREAM_MARKER_INTEL;
    private final LazyConstant<MethodHandle> VK_CMD_SET_PERFORMANCE_OVERRIDE_INTEL;
    private final LazyConstant<MethodHandle> VK_CMD_PREPROCESS_GENERATED_COMMANDS_NV;
    private final LazyConstant<MethodHandle> VK_CMD_EXECUTE_GENERATED_COMMANDS_NV;
    private final LazyConstant<MethodHandle> VK_CMD_BIND_PIPELINE_SHADER_GROUP_NV;
    private final LazyConstant<MethodHandle> VK_CMD_SET_DEPTH_BIAS2_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_DISPATCH_TILE_QCOM;
    private final LazyConstant<MethodHandle> VK_CMD_BEGIN_PER_TILE_EXECUTION_QCOM;
    private final LazyConstant<MethodHandle> VK_CMD_END_PER_TILE_EXECUTION_QCOM;
    private final LazyConstant<MethodHandle> VK_CMD_BIND_DESCRIPTOR_BUFFERS_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_SET_DESCRIPTOR_BUFFER_OFFSETS_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_BIND_DESCRIPTOR_BUFFER_EMBEDDED_SAMPLERS_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_SET_FRAGMENT_SHADING_RATE_ENUM_NV;
    private final LazyConstant<MethodHandle> VK_CMD_SET_VERTEX_INPUT_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_SUBPASS_SHADING_HUAWEI;
    private final LazyConstant<MethodHandle> VK_CMD_BIND_INVOCATION_MASK_HUAWEI;
    private final LazyConstant<MethodHandle> VK_CMD_SET_PATCH_CONTROL_POINTS_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_SET_LOGIC_OP_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_SET_COLOR_WRITE_ENABLE_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_DRAW_MULTI_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_DRAW_MULTI_INDEXED_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_BUILD_MICROMAPS_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_COPY_MICROMAP_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_COPY_MICROMAP_TO_MEMORY_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_COPY_MEMORY_TO_MICROMAP_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_WRITE_MICROMAPS_PROPERTIES_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_DRAW_CLUSTER_HUAWEI;
    private final LazyConstant<MethodHandle> VK_CMD_DRAW_CLUSTER_INDIRECT_HUAWEI;
    private final LazyConstant<MethodHandle> VK_CMD_SET_DISPATCH_PARAMETERS_ARM;
    private final LazyConstant<MethodHandle> VK_CMD_COPY_MEMORY_INDIRECT_NV;
    private final LazyConstant<MethodHandle> VK_CMD_COPY_MEMORY_TO_IMAGE_INDIRECT_NV;
    private final LazyConstant<MethodHandle> VK_CMD_DECOMPRESS_MEMORY_NV;
    private final LazyConstant<MethodHandle> VK_CMD_DECOMPRESS_MEMORY_INDIRECT_COUNT_NV;
    private final LazyConstant<MethodHandle> VK_CMD_UPDATE_PIPELINE_INDIRECT_BUFFER_NV;
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
    private final LazyConstant<MethodHandle> VK_CMD_COPY_TENSOR_ARM;
    private final LazyConstant<MethodHandle> VK_CMD_OPTICAL_FLOW_EXECUTE_NV;
    private final LazyConstant<MethodHandle> VK_CMD_BIND_SHADERS_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_SET_DEPTH_CLAMP_RANGE_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_CONVERT_COOPERATIVE_VECTOR_MATRIX_NV;
    private final LazyConstant<MethodHandle> VK_CMD_DISPATCH_DATA_GRAPH_ARM;
    private final LazyConstant<MethodHandle> VK_CMD_SET_ATTACHMENT_FEEDBACK_LOOP_ENABLE_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_BIND_TILE_MEMORY_QCOM;
    private final LazyConstant<MethodHandle> VK_CMD_DECOMPRESS_MEMORY_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_DECOMPRESS_MEMORY_INDIRECT_COUNT_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_BUILD_CLUSTER_ACCELERATION_STRUCTURE_INDIRECT_NV;
    private final LazyConstant<MethodHandle> VK_CMD_BUILD_PARTITIONED_ACCELERATION_STRUCTURES_NV;
    private final LazyConstant<MethodHandle> VK_CMD_PREPROCESS_GENERATED_COMMANDS_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_EXECUTE_GENERATED_COMMANDS_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_BEGIN_SHADER_INSTRUMENTATION_ARM;
    private final LazyConstant<MethodHandle> VK_CMD_END_SHADER_INSTRUMENTATION_ARM;
    private final LazyConstant<MethodHandle> VK_CMD_BEGIN_CUSTOM_RESOLVE_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_SET_COMPUTE_OCCUPANCY_PRIORITY_NV;
    private final LazyConstant<MethodHandle> VK_CMD_SET_PRIMITIVE_RESTART_INDEX_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_BUILD_ACCELERATION_STRUCTURES_KHR;
    private final LazyConstant<MethodHandle> VK_CMD_BUILD_ACCELERATION_STRUCTURES_INDIRECT_KHR;
    private final LazyConstant<MethodHandle> VK_CMD_COPY_ACCELERATION_STRUCTURE_KHR;
    private final LazyConstant<MethodHandle> VK_CMD_COPY_ACCELERATION_STRUCTURE_TO_MEMORY_KHR;
    private final LazyConstant<MethodHandle> VK_CMD_COPY_MEMORY_TO_ACCELERATION_STRUCTURE_KHR;
    private final LazyConstant<MethodHandle> VK_CMD_WRITE_ACCELERATION_STRUCTURES_PROPERTIES_KHR;
    private final LazyConstant<MethodHandle> VK_CMD_TRACE_RAYS_KHR;
    private final LazyConstant<MethodHandle> VK_CMD_TRACE_RAYS_INDIRECT_KHR;
    private final LazyConstant<MethodHandle> VK_CMD_SET_RAY_TRACING_PIPELINE_STACK_SIZE_KHR;
    private final LazyConstant<MethodHandle> VK_CMD_DRAW_MESH_TASKS_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_DRAW_MESH_TASKS_INDIRECT_EXT;
    private final LazyConstant<MethodHandle> VK_CMD_DRAW_MESH_TASKS_INDIRECT_COUNT_EXT;

    private final MemorySegment segment;

    static {

    }

    /**
     * This constructor must not be used. It will always throw an UnsupportedOperationException.
     * This constructor only exists to fix some compiler errors caused by generating all sources.
     * If a struct contains an address to a command buffer (e.g. VkCommandBufferSubmitInfo) the getter
     * for this field must not be used as it will call this constructor.
     */
    public VkCommandBuffer(MemorySegment segment) {
        throw new UnsupportedOperationException(
            "Cannot create a VkCommandBuffer this way. Fetch the segment and create the command buffer manually."
        );
    }

    public VkCommandBuffer(MemorySegment segment, VkDevice vkDevice) {
        this.segment = segment;

        VK_BEGIN_COMMAND_BUFFER = vkDevice.VK_BEGIN_COMMAND_BUFFER();
        VK_END_COMMAND_BUFFER = vkDevice.VK_END_COMMAND_BUFFER();
        VK_RESET_COMMAND_BUFFER = vkDevice.VK_RESET_COMMAND_BUFFER();
        VK_CMD_COPY_BUFFER = vkDevice.VK_CMD_COPY_BUFFER();
        VK_CMD_COPY_IMAGE = vkDevice.VK_CMD_COPY_IMAGE();
        VK_CMD_COPY_BUFFER_TO_IMAGE = vkDevice.VK_CMD_COPY_BUFFER_TO_IMAGE();
        VK_CMD_COPY_IMAGE_TO_BUFFER = vkDevice.VK_CMD_COPY_IMAGE_TO_BUFFER();
        VK_CMD_UPDATE_BUFFER = vkDevice.VK_CMD_UPDATE_BUFFER();
        VK_CMD_FILL_BUFFER = vkDevice.VK_CMD_FILL_BUFFER();
        VK_CMD_PIPELINE_BARRIER = vkDevice.VK_CMD_PIPELINE_BARRIER();
        VK_CMD_BEGIN_QUERY = vkDevice.VK_CMD_BEGIN_QUERY();
        VK_CMD_END_QUERY = vkDevice.VK_CMD_END_QUERY();
        VK_CMD_RESET_QUERY_POOL = vkDevice.VK_CMD_RESET_QUERY_POOL();
        VK_CMD_WRITE_TIMESTAMP = vkDevice.VK_CMD_WRITE_TIMESTAMP();
        VK_CMD_COPY_QUERY_POOL_RESULTS = vkDevice.VK_CMD_COPY_QUERY_POOL_RESULTS();
        VK_CMD_EXECUTE_COMMANDS = vkDevice.VK_CMD_EXECUTE_COMMANDS();
        VK_CMD_BIND_PIPELINE = vkDevice.VK_CMD_BIND_PIPELINE();
        VK_CMD_BIND_DESCRIPTOR_SETS = vkDevice.VK_CMD_BIND_DESCRIPTOR_SETS();
        VK_CMD_CLEAR_COLOR_IMAGE = vkDevice.VK_CMD_CLEAR_COLOR_IMAGE();
        VK_CMD_DISPATCH = vkDevice.VK_CMD_DISPATCH();
        VK_CMD_DISPATCH_INDIRECT = vkDevice.VK_CMD_DISPATCH_INDIRECT();
        VK_CMD_SET_EVENT = vkDevice.VK_CMD_SET_EVENT();
        VK_CMD_RESET_EVENT = vkDevice.VK_CMD_RESET_EVENT();
        VK_CMD_WAIT_EVENTS = vkDevice.VK_CMD_WAIT_EVENTS();
        VK_CMD_PUSH_CONSTANTS = vkDevice.VK_CMD_PUSH_CONSTANTS();
        VK_CMD_SET_VIEWPORT = vkDevice.VK_CMD_SET_VIEWPORT();
        VK_CMD_SET_SCISSOR = vkDevice.VK_CMD_SET_SCISSOR();
        VK_CMD_SET_LINE_WIDTH = vkDevice.VK_CMD_SET_LINE_WIDTH();
        VK_CMD_SET_DEPTH_BIAS = vkDevice.VK_CMD_SET_DEPTH_BIAS();
        VK_CMD_SET_BLEND_CONSTANTS = vkDevice.VK_CMD_SET_BLEND_CONSTANTS();
        VK_CMD_SET_DEPTH_BOUNDS = vkDevice.VK_CMD_SET_DEPTH_BOUNDS();
        VK_CMD_SET_STENCIL_COMPARE_MASK = vkDevice.VK_CMD_SET_STENCIL_COMPARE_MASK();
        VK_CMD_SET_STENCIL_WRITE_MASK = vkDevice.VK_CMD_SET_STENCIL_WRITE_MASK();
        VK_CMD_SET_STENCIL_REFERENCE = vkDevice.VK_CMD_SET_STENCIL_REFERENCE();
        VK_CMD_BIND_INDEX_BUFFER = vkDevice.VK_CMD_BIND_INDEX_BUFFER();
        VK_CMD_BIND_VERTEX_BUFFERS = vkDevice.VK_CMD_BIND_VERTEX_BUFFERS();
        VK_CMD_DRAW = vkDevice.VK_CMD_DRAW();
        VK_CMD_DRAW_INDEXED = vkDevice.VK_CMD_DRAW_INDEXED();
        VK_CMD_DRAW_INDIRECT = vkDevice.VK_CMD_DRAW_INDIRECT();
        VK_CMD_DRAW_INDEXED_INDIRECT = vkDevice.VK_CMD_DRAW_INDEXED_INDIRECT();
        VK_CMD_BLIT_IMAGE = vkDevice.VK_CMD_BLIT_IMAGE();
        VK_CMD_CLEAR_DEPTH_STENCIL_IMAGE = vkDevice.VK_CMD_CLEAR_DEPTH_STENCIL_IMAGE();
        VK_CMD_CLEAR_ATTACHMENTS = vkDevice.VK_CMD_CLEAR_ATTACHMENTS();
        VK_CMD_RESOLVE_IMAGE = vkDevice.VK_CMD_RESOLVE_IMAGE();
        VK_CMD_BEGIN_RENDER_PASS = vkDevice.VK_CMD_BEGIN_RENDER_PASS();
        VK_CMD_NEXT_SUBPASS = vkDevice.VK_CMD_NEXT_SUBPASS();
        VK_CMD_END_RENDER_PASS = vkDevice.VK_CMD_END_RENDER_PASS();
        VK_CMD_SET_DEVICE_MASK = vkDevice.VK_CMD_SET_DEVICE_MASK();
        VK_CMD_DISPATCH_BASE = vkDevice.VK_CMD_DISPATCH_BASE();
        VK_CMD_DRAW_INDIRECT_COUNT = vkDevice.VK_CMD_DRAW_INDIRECT_COUNT();
        VK_CMD_DRAW_INDEXED_INDIRECT_COUNT = vkDevice.VK_CMD_DRAW_INDEXED_INDIRECT_COUNT();
        VK_CMD_BEGIN_RENDER_PASS2 = vkDevice.VK_CMD_BEGIN_RENDER_PASS2();
        VK_CMD_NEXT_SUBPASS2 = vkDevice.VK_CMD_NEXT_SUBPASS2();
        VK_CMD_END_RENDER_PASS2 = vkDevice.VK_CMD_END_RENDER_PASS2();
        VK_CMD_PIPELINE_BARRIER2 = vkDevice.VK_CMD_PIPELINE_BARRIER2();
        VK_CMD_WRITE_TIMESTAMP2 = vkDevice.VK_CMD_WRITE_TIMESTAMP2();
        VK_CMD_COPY_BUFFER2 = vkDevice.VK_CMD_COPY_BUFFER2();
        VK_CMD_COPY_IMAGE2 = vkDevice.VK_CMD_COPY_IMAGE2();
        VK_CMD_COPY_BUFFER_TO_IMAGE2 = vkDevice.VK_CMD_COPY_BUFFER_TO_IMAGE2();
        VK_CMD_COPY_IMAGE_TO_BUFFER2 = vkDevice.VK_CMD_COPY_IMAGE_TO_BUFFER2();
        VK_CMD_SET_EVENT2 = vkDevice.VK_CMD_SET_EVENT2();
        VK_CMD_RESET_EVENT2 = vkDevice.VK_CMD_RESET_EVENT2();
        VK_CMD_WAIT_EVENTS2 = vkDevice.VK_CMD_WAIT_EVENTS2();
        VK_CMD_BLIT_IMAGE2 = vkDevice.VK_CMD_BLIT_IMAGE2();
        VK_CMD_RESOLVE_IMAGE2 = vkDevice.VK_CMD_RESOLVE_IMAGE2();
        VK_CMD_BEGIN_RENDERING = vkDevice.VK_CMD_BEGIN_RENDERING();
        VK_CMD_END_RENDERING = vkDevice.VK_CMD_END_RENDERING();
        VK_CMD_SET_CULL_MODE = vkDevice.VK_CMD_SET_CULL_MODE();
        VK_CMD_SET_FRONT_FACE = vkDevice.VK_CMD_SET_FRONT_FACE();
        VK_CMD_SET_PRIMITIVE_TOPOLOGY = vkDevice.VK_CMD_SET_PRIMITIVE_TOPOLOGY();
        VK_CMD_SET_VIEWPORT_WITH_COUNT = vkDevice.VK_CMD_SET_VIEWPORT_WITH_COUNT();
        VK_CMD_SET_SCISSOR_WITH_COUNT = vkDevice.VK_CMD_SET_SCISSOR_WITH_COUNT();
        VK_CMD_BIND_VERTEX_BUFFERS2 = vkDevice.VK_CMD_BIND_VERTEX_BUFFERS2();
        VK_CMD_SET_DEPTH_TEST_ENABLE = vkDevice.VK_CMD_SET_DEPTH_TEST_ENABLE();
        VK_CMD_SET_DEPTH_WRITE_ENABLE = vkDevice.VK_CMD_SET_DEPTH_WRITE_ENABLE();
        VK_CMD_SET_DEPTH_COMPARE_OP = vkDevice.VK_CMD_SET_DEPTH_COMPARE_OP();
        VK_CMD_SET_DEPTH_BOUNDS_TEST_ENABLE = vkDevice.VK_CMD_SET_DEPTH_BOUNDS_TEST_ENABLE();
        VK_CMD_SET_STENCIL_TEST_ENABLE = vkDevice.VK_CMD_SET_STENCIL_TEST_ENABLE();
        VK_CMD_SET_STENCIL_OP = vkDevice.VK_CMD_SET_STENCIL_OP();
        VK_CMD_SET_RASTERIZER_DISCARD_ENABLE = vkDevice.VK_CMD_SET_RASTERIZER_DISCARD_ENABLE();
        VK_CMD_SET_DEPTH_BIAS_ENABLE = vkDevice.VK_CMD_SET_DEPTH_BIAS_ENABLE();
        VK_CMD_SET_PRIMITIVE_RESTART_ENABLE = vkDevice.VK_CMD_SET_PRIMITIVE_RESTART_ENABLE();
        VK_CMD_PUSH_DESCRIPTOR_SET = vkDevice.VK_CMD_PUSH_DESCRIPTOR_SET();
        VK_CMD_PUSH_DESCRIPTOR_SET_WITH_TEMPLATE = vkDevice.VK_CMD_PUSH_DESCRIPTOR_SET_WITH_TEMPLATE();
        VK_CMD_BIND_DESCRIPTOR_SETS2 = vkDevice.VK_CMD_BIND_DESCRIPTOR_SETS2();
        VK_CMD_PUSH_CONSTANTS2 = vkDevice.VK_CMD_PUSH_CONSTANTS2();
        VK_CMD_PUSH_DESCRIPTOR_SET2 = vkDevice.VK_CMD_PUSH_DESCRIPTOR_SET2();
        VK_CMD_PUSH_DESCRIPTOR_SET_WITH_TEMPLATE2 = vkDevice.VK_CMD_PUSH_DESCRIPTOR_SET_WITH_TEMPLATE2();
        VK_CMD_SET_LINE_STIPPLE = vkDevice.VK_CMD_SET_LINE_STIPPLE();
        VK_CMD_BIND_INDEX_BUFFER2 = vkDevice.VK_CMD_BIND_INDEX_BUFFER2();
        VK_CMD_SET_RENDERING_ATTACHMENT_LOCATIONS = vkDevice.VK_CMD_SET_RENDERING_ATTACHMENT_LOCATIONS();
        VK_CMD_SET_RENDERING_INPUT_ATTACHMENT_INDICES = vkDevice.VK_CMD_SET_RENDERING_INPUT_ATTACHMENT_INDICES();
        VK_CMD_BEGIN_VIDEO_CODING_KHR = vkDevice.VK_CMD_BEGIN_VIDEO_CODING_KHR();
        VK_CMD_END_VIDEO_CODING_KHR = vkDevice.VK_CMD_END_VIDEO_CODING_KHR();
        VK_CMD_CONTROL_VIDEO_CODING_KHR = vkDevice.VK_CMD_CONTROL_VIDEO_CODING_KHR();
        VK_CMD_DECODE_VIDEO_KHR = vkDevice.VK_CMD_DECODE_VIDEO_KHR();
        VK_CMD_SET_FRAGMENT_SHADING_RATE_KHR = vkDevice.VK_CMD_SET_FRAGMENT_SHADING_RATE_KHR();
        VK_CMD_ENCODE_VIDEO_KHR = vkDevice.VK_CMD_ENCODE_VIDEO_KHR();
        VK_CMD_BIND_INDEX_BUFFER3_KHR = vkDevice.VK_CMD_BIND_INDEX_BUFFER3_KHR();
        VK_CMD_BIND_VERTEX_BUFFERS3_KHR = vkDevice.VK_CMD_BIND_VERTEX_BUFFERS3_KHR();
        VK_CMD_DRAW_INDIRECT2_KHR = vkDevice.VK_CMD_DRAW_INDIRECT2_KHR();
        VK_CMD_DRAW_INDEXED_INDIRECT2_KHR = vkDevice.VK_CMD_DRAW_INDEXED_INDIRECT2_KHR();
        VK_CMD_DISPATCH_INDIRECT2_KHR = vkDevice.VK_CMD_DISPATCH_INDIRECT2_KHR();
        VK_CMD_COPY_MEMORY_KHR = vkDevice.VK_CMD_COPY_MEMORY_KHR();
        VK_CMD_COPY_MEMORY_TO_IMAGE_KHR = vkDevice.VK_CMD_COPY_MEMORY_TO_IMAGE_KHR();
        VK_CMD_COPY_IMAGE_TO_MEMORY_KHR = vkDevice.VK_CMD_COPY_IMAGE_TO_MEMORY_KHR();
        VK_CMD_UPDATE_MEMORY_KHR = vkDevice.VK_CMD_UPDATE_MEMORY_KHR();
        VK_CMD_FILL_MEMORY_KHR = vkDevice.VK_CMD_FILL_MEMORY_KHR();
        VK_CMD_COPY_QUERY_POOL_RESULTS_TO_MEMORY_KHR = vkDevice.VK_CMD_COPY_QUERY_POOL_RESULTS_TO_MEMORY_KHR();
        VK_CMD_DRAW_INDIRECT_COUNT2_KHR = vkDevice.VK_CMD_DRAW_INDIRECT_COUNT2_KHR();
        VK_CMD_DRAW_INDEXED_INDIRECT_COUNT2_KHR = vkDevice.VK_CMD_DRAW_INDEXED_INDIRECT_COUNT2_KHR();
        VK_CMD_BEGIN_CONDITIONAL_RENDERING2_EXT = vkDevice.VK_CMD_BEGIN_CONDITIONAL_RENDERING2_EXT();
        VK_CMD_BIND_TRANSFORM_FEEDBACK_BUFFERS2_EXT = vkDevice.VK_CMD_BIND_TRANSFORM_FEEDBACK_BUFFERS2_EXT();
        VK_CMD_BEGIN_TRANSFORM_FEEDBACK2_EXT = vkDevice.VK_CMD_BEGIN_TRANSFORM_FEEDBACK2_EXT();
        VK_CMD_END_TRANSFORM_FEEDBACK2_EXT = vkDevice.VK_CMD_END_TRANSFORM_FEEDBACK2_EXT();
        VK_CMD_DRAW_INDIRECT_BYTE_COUNT2_EXT = vkDevice.VK_CMD_DRAW_INDIRECT_BYTE_COUNT2_EXT();
        VK_CMD_DRAW_MESH_TASKS_INDIRECT2_EXT = vkDevice.VK_CMD_DRAW_MESH_TASKS_INDIRECT2_EXT();
        VK_CMD_DRAW_MESH_TASKS_INDIRECT_COUNT2_EXT = vkDevice.VK_CMD_DRAW_MESH_TASKS_INDIRECT_COUNT2_EXT();
        VK_CMD_WRITE_MARKER_TO_MEMORY_AMD = vkDevice.VK_CMD_WRITE_MARKER_TO_MEMORY_AMD();
        VK_CMD_TRACE_RAYS_INDIRECT2_KHR = vkDevice.VK_CMD_TRACE_RAYS_INDIRECT2_KHR();
        VK_CMD_SET_DESCRIPTOR_BUFFER_OFFSETS2_EXT = vkDevice.VK_CMD_SET_DESCRIPTOR_BUFFER_OFFSETS2_EXT();
        VK_CMD_BIND_DESCRIPTOR_BUFFER_EMBEDDED_SAMPLERS2_EXT = vkDevice.VK_CMD_BIND_DESCRIPTOR_BUFFER_EMBEDDED_SAMPLERS2_EXT();
        VK_CMD_COPY_MEMORY_INDIRECT_KHR = vkDevice.VK_CMD_COPY_MEMORY_INDIRECT_KHR();
        VK_CMD_COPY_MEMORY_TO_IMAGE_INDIRECT_KHR = vkDevice.VK_CMD_COPY_MEMORY_TO_IMAGE_INDIRECT_KHR();
        VK_CMD_END_RENDERING2_KHR = vkDevice.VK_CMD_END_RENDERING2_KHR();
        VK_CMD_DEBUG_MARKER_BEGIN_EXT = vkDevice.VK_CMD_DEBUG_MARKER_BEGIN_EXT();
        VK_CMD_DEBUG_MARKER_END_EXT = vkDevice.VK_CMD_DEBUG_MARKER_END_EXT();
        VK_CMD_DEBUG_MARKER_INSERT_EXT = vkDevice.VK_CMD_DEBUG_MARKER_INSERT_EXT();
        VK_CMD_BIND_TRANSFORM_FEEDBACK_BUFFERS_EXT = vkDevice.VK_CMD_BIND_TRANSFORM_FEEDBACK_BUFFERS_EXT();
        VK_CMD_BEGIN_TRANSFORM_FEEDBACK_EXT = vkDevice.VK_CMD_BEGIN_TRANSFORM_FEEDBACK_EXT();
        VK_CMD_END_TRANSFORM_FEEDBACK_EXT = vkDevice.VK_CMD_END_TRANSFORM_FEEDBACK_EXT();
        VK_CMD_BEGIN_QUERY_INDEXED_EXT = vkDevice.VK_CMD_BEGIN_QUERY_INDEXED_EXT();
        VK_CMD_END_QUERY_INDEXED_EXT = vkDevice.VK_CMD_END_QUERY_INDEXED_EXT();
        VK_CMD_DRAW_INDIRECT_BYTE_COUNT_EXT = vkDevice.VK_CMD_DRAW_INDIRECT_BYTE_COUNT_EXT();
        VK_CMD_CU_LAUNCH_KERNEL_NVX = vkDevice.VK_CMD_CU_LAUNCH_KERNEL_NVX();
        VK_CMD_BEGIN_CONDITIONAL_RENDERING_EXT = vkDevice.VK_CMD_BEGIN_CONDITIONAL_RENDERING_EXT();
        VK_CMD_END_CONDITIONAL_RENDERING_EXT = vkDevice.VK_CMD_END_CONDITIONAL_RENDERING_EXT();
        VK_CMD_SET_VIEWPORT_WSCALING_NV = vkDevice.VK_CMD_SET_VIEWPORT_WSCALING_NV();
        VK_CMD_SET_DISCARD_RECTANGLE_EXT = vkDevice.VK_CMD_SET_DISCARD_RECTANGLE_EXT();
        VK_CMD_SET_DISCARD_RECTANGLE_ENABLE_EXT = vkDevice.VK_CMD_SET_DISCARD_RECTANGLE_ENABLE_EXT();
        VK_CMD_SET_DISCARD_RECTANGLE_MODE_EXT = vkDevice.VK_CMD_SET_DISCARD_RECTANGLE_MODE_EXT();
        VK_CMD_BEGIN_DEBUG_UTILS_LABEL_EXT = vkDevice.VK_CMD_BEGIN_DEBUG_UTILS_LABEL_EXT();
        VK_CMD_END_DEBUG_UTILS_LABEL_EXT = vkDevice.VK_CMD_END_DEBUG_UTILS_LABEL_EXT();
        VK_CMD_INSERT_DEBUG_UTILS_LABEL_EXT = vkDevice.VK_CMD_INSERT_DEBUG_UTILS_LABEL_EXT();
        VK_CMD_BEGIN_GPA_SESSION_AMD = vkDevice.VK_CMD_BEGIN_GPA_SESSION_AMD();
        VK_CMD_END_GPA_SESSION_AMD = vkDevice.VK_CMD_END_GPA_SESSION_AMD();
        VK_CMD_BEGIN_GPA_SAMPLE_AMD = vkDevice.VK_CMD_BEGIN_GPA_SAMPLE_AMD();
        VK_CMD_END_GPA_SAMPLE_AMD = vkDevice.VK_CMD_END_GPA_SAMPLE_AMD();
        VK_CMD_COPY_GPA_SESSION_RESULTS_AMD = vkDevice.VK_CMD_COPY_GPA_SESSION_RESULTS_AMD();
        VK_CMD_BIND_SAMPLER_HEAP_EXT = vkDevice.VK_CMD_BIND_SAMPLER_HEAP_EXT();
        VK_CMD_BIND_RESOURCE_HEAP_EXT = vkDevice.VK_CMD_BIND_RESOURCE_HEAP_EXT();
        VK_CMD_PUSH_DATA_EXT = vkDevice.VK_CMD_PUSH_DATA_EXT();
        VK_CMD_SET_SAMPLE_LOCATIONS_EXT = vkDevice.VK_CMD_SET_SAMPLE_LOCATIONS_EXT();
        VK_CMD_BIND_SHADING_RATE_IMAGE_NV = vkDevice.VK_CMD_BIND_SHADING_RATE_IMAGE_NV();
        VK_CMD_SET_VIEWPORT_SHADING_RATE_PALETTE_NV = vkDevice.VK_CMD_SET_VIEWPORT_SHADING_RATE_PALETTE_NV();
        VK_CMD_SET_COARSE_SAMPLE_ORDER_NV = vkDevice.VK_CMD_SET_COARSE_SAMPLE_ORDER_NV();
        VK_CMD_BUILD_ACCELERATION_STRUCTURE_NV = vkDevice.VK_CMD_BUILD_ACCELERATION_STRUCTURE_NV();
        VK_CMD_COPY_ACCELERATION_STRUCTURE_NV = vkDevice.VK_CMD_COPY_ACCELERATION_STRUCTURE_NV();
        VK_CMD_TRACE_RAYS_NV = vkDevice.VK_CMD_TRACE_RAYS_NV();
        VK_CMD_WRITE_ACCELERATION_STRUCTURES_PROPERTIES_NV = vkDevice.VK_CMD_WRITE_ACCELERATION_STRUCTURES_PROPERTIES_NV();
        VK_CMD_WRITE_BUFFER_MARKER_AMD = vkDevice.VK_CMD_WRITE_BUFFER_MARKER_AMD();
        VK_CMD_WRITE_BUFFER_MARKER2_AMD = vkDevice.VK_CMD_WRITE_BUFFER_MARKER2_AMD();
        VK_CMD_DRAW_MESH_TASKS_NV = vkDevice.VK_CMD_DRAW_MESH_TASKS_NV();
        VK_CMD_DRAW_MESH_TASKS_INDIRECT_NV = vkDevice.VK_CMD_DRAW_MESH_TASKS_INDIRECT_NV();
        VK_CMD_DRAW_MESH_TASKS_INDIRECT_COUNT_NV = vkDevice.VK_CMD_DRAW_MESH_TASKS_INDIRECT_COUNT_NV();
        VK_CMD_SET_EXCLUSIVE_SCISSOR_ENABLE_NV = vkDevice.VK_CMD_SET_EXCLUSIVE_SCISSOR_ENABLE_NV();
        VK_CMD_SET_EXCLUSIVE_SCISSOR_NV = vkDevice.VK_CMD_SET_EXCLUSIVE_SCISSOR_NV();
        VK_CMD_SET_CHECKPOINT_NV = vkDevice.VK_CMD_SET_CHECKPOINT_NV();
        VK_CMD_SET_PERFORMANCE_MARKER_INTEL = vkDevice.VK_CMD_SET_PERFORMANCE_MARKER_INTEL();
        VK_CMD_SET_PERFORMANCE_STREAM_MARKER_INTEL = vkDevice.VK_CMD_SET_PERFORMANCE_STREAM_MARKER_INTEL();
        VK_CMD_SET_PERFORMANCE_OVERRIDE_INTEL = vkDevice.VK_CMD_SET_PERFORMANCE_OVERRIDE_INTEL();
        VK_CMD_PREPROCESS_GENERATED_COMMANDS_NV = vkDevice.VK_CMD_PREPROCESS_GENERATED_COMMANDS_NV();
        VK_CMD_EXECUTE_GENERATED_COMMANDS_NV = vkDevice.VK_CMD_EXECUTE_GENERATED_COMMANDS_NV();
        VK_CMD_BIND_PIPELINE_SHADER_GROUP_NV = vkDevice.VK_CMD_BIND_PIPELINE_SHADER_GROUP_NV();
        VK_CMD_SET_DEPTH_BIAS2_EXT = vkDevice.VK_CMD_SET_DEPTH_BIAS2_EXT();
        VK_CMD_DISPATCH_TILE_QCOM = vkDevice.VK_CMD_DISPATCH_TILE_QCOM();
        VK_CMD_BEGIN_PER_TILE_EXECUTION_QCOM = vkDevice.VK_CMD_BEGIN_PER_TILE_EXECUTION_QCOM();
        VK_CMD_END_PER_TILE_EXECUTION_QCOM = vkDevice.VK_CMD_END_PER_TILE_EXECUTION_QCOM();
        VK_CMD_BIND_DESCRIPTOR_BUFFERS_EXT = vkDevice.VK_CMD_BIND_DESCRIPTOR_BUFFERS_EXT();
        VK_CMD_SET_DESCRIPTOR_BUFFER_OFFSETS_EXT = vkDevice.VK_CMD_SET_DESCRIPTOR_BUFFER_OFFSETS_EXT();
        VK_CMD_BIND_DESCRIPTOR_BUFFER_EMBEDDED_SAMPLERS_EXT = vkDevice.VK_CMD_BIND_DESCRIPTOR_BUFFER_EMBEDDED_SAMPLERS_EXT();
        VK_CMD_SET_FRAGMENT_SHADING_RATE_ENUM_NV = vkDevice.VK_CMD_SET_FRAGMENT_SHADING_RATE_ENUM_NV();
        VK_CMD_SET_VERTEX_INPUT_EXT = vkDevice.VK_CMD_SET_VERTEX_INPUT_EXT();
        VK_CMD_SUBPASS_SHADING_HUAWEI = vkDevice.VK_CMD_SUBPASS_SHADING_HUAWEI();
        VK_CMD_BIND_INVOCATION_MASK_HUAWEI = vkDevice.VK_CMD_BIND_INVOCATION_MASK_HUAWEI();
        VK_CMD_SET_PATCH_CONTROL_POINTS_EXT = vkDevice.VK_CMD_SET_PATCH_CONTROL_POINTS_EXT();
        VK_CMD_SET_LOGIC_OP_EXT = vkDevice.VK_CMD_SET_LOGIC_OP_EXT();
        VK_CMD_SET_COLOR_WRITE_ENABLE_EXT = vkDevice.VK_CMD_SET_COLOR_WRITE_ENABLE_EXT();
        VK_CMD_DRAW_MULTI_EXT = vkDevice.VK_CMD_DRAW_MULTI_EXT();
        VK_CMD_DRAW_MULTI_INDEXED_EXT = vkDevice.VK_CMD_DRAW_MULTI_INDEXED_EXT();
        VK_CMD_BUILD_MICROMAPS_EXT = vkDevice.VK_CMD_BUILD_MICROMAPS_EXT();
        VK_CMD_COPY_MICROMAP_EXT = vkDevice.VK_CMD_COPY_MICROMAP_EXT();
        VK_CMD_COPY_MICROMAP_TO_MEMORY_EXT = vkDevice.VK_CMD_COPY_MICROMAP_TO_MEMORY_EXT();
        VK_CMD_COPY_MEMORY_TO_MICROMAP_EXT = vkDevice.VK_CMD_COPY_MEMORY_TO_MICROMAP_EXT();
        VK_CMD_WRITE_MICROMAPS_PROPERTIES_EXT = vkDevice.VK_CMD_WRITE_MICROMAPS_PROPERTIES_EXT();
        VK_CMD_DRAW_CLUSTER_HUAWEI = vkDevice.VK_CMD_DRAW_CLUSTER_HUAWEI();
        VK_CMD_DRAW_CLUSTER_INDIRECT_HUAWEI = vkDevice.VK_CMD_DRAW_CLUSTER_INDIRECT_HUAWEI();
        VK_CMD_SET_DISPATCH_PARAMETERS_ARM = vkDevice.VK_CMD_SET_DISPATCH_PARAMETERS_ARM();
        VK_CMD_COPY_MEMORY_INDIRECT_NV = vkDevice.VK_CMD_COPY_MEMORY_INDIRECT_NV();
        VK_CMD_COPY_MEMORY_TO_IMAGE_INDIRECT_NV = vkDevice.VK_CMD_COPY_MEMORY_TO_IMAGE_INDIRECT_NV();
        VK_CMD_DECOMPRESS_MEMORY_NV = vkDevice.VK_CMD_DECOMPRESS_MEMORY_NV();
        VK_CMD_DECOMPRESS_MEMORY_INDIRECT_COUNT_NV = vkDevice.VK_CMD_DECOMPRESS_MEMORY_INDIRECT_COUNT_NV();
        VK_CMD_UPDATE_PIPELINE_INDIRECT_BUFFER_NV = vkDevice.VK_CMD_UPDATE_PIPELINE_INDIRECT_BUFFER_NV();
        VK_CMD_SET_DEPTH_CLAMP_ENABLE_EXT = vkDevice.VK_CMD_SET_DEPTH_CLAMP_ENABLE_EXT();
        VK_CMD_SET_POLYGON_MODE_EXT = vkDevice.VK_CMD_SET_POLYGON_MODE_EXT();
        VK_CMD_SET_RASTERIZATION_SAMPLES_EXT = vkDevice.VK_CMD_SET_RASTERIZATION_SAMPLES_EXT();
        VK_CMD_SET_SAMPLE_MASK_EXT = vkDevice.VK_CMD_SET_SAMPLE_MASK_EXT();
        VK_CMD_SET_ALPHA_TO_COVERAGE_ENABLE_EXT = vkDevice.VK_CMD_SET_ALPHA_TO_COVERAGE_ENABLE_EXT();
        VK_CMD_SET_ALPHA_TO_ONE_ENABLE_EXT = vkDevice.VK_CMD_SET_ALPHA_TO_ONE_ENABLE_EXT();
        VK_CMD_SET_LOGIC_OP_ENABLE_EXT = vkDevice.VK_CMD_SET_LOGIC_OP_ENABLE_EXT();
        VK_CMD_SET_COLOR_BLEND_ENABLE_EXT = vkDevice.VK_CMD_SET_COLOR_BLEND_ENABLE_EXT();
        VK_CMD_SET_COLOR_BLEND_EQUATION_EXT = vkDevice.VK_CMD_SET_COLOR_BLEND_EQUATION_EXT();
        VK_CMD_SET_COLOR_WRITE_MASK_EXT = vkDevice.VK_CMD_SET_COLOR_WRITE_MASK_EXT();
        VK_CMD_SET_TESSELLATION_DOMAIN_ORIGIN_EXT = vkDevice.VK_CMD_SET_TESSELLATION_DOMAIN_ORIGIN_EXT();
        VK_CMD_SET_RASTERIZATION_STREAM_EXT = vkDevice.VK_CMD_SET_RASTERIZATION_STREAM_EXT();
        VK_CMD_SET_CONSERVATIVE_RASTERIZATION_MODE_EXT = vkDevice.VK_CMD_SET_CONSERVATIVE_RASTERIZATION_MODE_EXT();
        VK_CMD_SET_EXTRA_PRIMITIVE_OVERESTIMATION_SIZE_EXT = vkDevice.VK_CMD_SET_EXTRA_PRIMITIVE_OVERESTIMATION_SIZE_EXT();
        VK_CMD_SET_DEPTH_CLIP_ENABLE_EXT = vkDevice.VK_CMD_SET_DEPTH_CLIP_ENABLE_EXT();
        VK_CMD_SET_SAMPLE_LOCATIONS_ENABLE_EXT = vkDevice.VK_CMD_SET_SAMPLE_LOCATIONS_ENABLE_EXT();
        VK_CMD_SET_COLOR_BLEND_ADVANCED_EXT = vkDevice.VK_CMD_SET_COLOR_BLEND_ADVANCED_EXT();
        VK_CMD_SET_PROVOKING_VERTEX_MODE_EXT = vkDevice.VK_CMD_SET_PROVOKING_VERTEX_MODE_EXT();
        VK_CMD_SET_LINE_RASTERIZATION_MODE_EXT = vkDevice.VK_CMD_SET_LINE_RASTERIZATION_MODE_EXT();
        VK_CMD_SET_LINE_STIPPLE_ENABLE_EXT = vkDevice.VK_CMD_SET_LINE_STIPPLE_ENABLE_EXT();
        VK_CMD_SET_DEPTH_CLIP_NEGATIVE_ONE_TO_ONE_EXT = vkDevice.VK_CMD_SET_DEPTH_CLIP_NEGATIVE_ONE_TO_ONE_EXT();
        VK_CMD_SET_VIEWPORT_WSCALING_ENABLE_NV = vkDevice.VK_CMD_SET_VIEWPORT_WSCALING_ENABLE_NV();
        VK_CMD_SET_VIEWPORT_SWIZZLE_NV = vkDevice.VK_CMD_SET_VIEWPORT_SWIZZLE_NV();
        VK_CMD_SET_COVERAGE_TO_COLOR_ENABLE_NV = vkDevice.VK_CMD_SET_COVERAGE_TO_COLOR_ENABLE_NV();
        VK_CMD_SET_COVERAGE_TO_COLOR_LOCATION_NV = vkDevice.VK_CMD_SET_COVERAGE_TO_COLOR_LOCATION_NV();
        VK_CMD_SET_COVERAGE_MODULATION_MODE_NV = vkDevice.VK_CMD_SET_COVERAGE_MODULATION_MODE_NV();
        VK_CMD_SET_COVERAGE_MODULATION_TABLE_ENABLE_NV = vkDevice.VK_CMD_SET_COVERAGE_MODULATION_TABLE_ENABLE_NV();
        VK_CMD_SET_COVERAGE_MODULATION_TABLE_NV = vkDevice.VK_CMD_SET_COVERAGE_MODULATION_TABLE_NV();
        VK_CMD_SET_SHADING_RATE_IMAGE_ENABLE_NV = vkDevice.VK_CMD_SET_SHADING_RATE_IMAGE_ENABLE_NV();
        VK_CMD_SET_REPRESENTATIVE_FRAGMENT_TEST_ENABLE_NV = vkDevice.VK_CMD_SET_REPRESENTATIVE_FRAGMENT_TEST_ENABLE_NV();
        VK_CMD_SET_COVERAGE_REDUCTION_MODE_NV = vkDevice.VK_CMD_SET_COVERAGE_REDUCTION_MODE_NV();
        VK_CMD_COPY_TENSOR_ARM = vkDevice.VK_CMD_COPY_TENSOR_ARM();
        VK_CMD_OPTICAL_FLOW_EXECUTE_NV = vkDevice.VK_CMD_OPTICAL_FLOW_EXECUTE_NV();
        VK_CMD_BIND_SHADERS_EXT = vkDevice.VK_CMD_BIND_SHADERS_EXT();
        VK_CMD_SET_DEPTH_CLAMP_RANGE_EXT = vkDevice.VK_CMD_SET_DEPTH_CLAMP_RANGE_EXT();
        VK_CMD_CONVERT_COOPERATIVE_VECTOR_MATRIX_NV = vkDevice.VK_CMD_CONVERT_COOPERATIVE_VECTOR_MATRIX_NV();
        VK_CMD_DISPATCH_DATA_GRAPH_ARM = vkDevice.VK_CMD_DISPATCH_DATA_GRAPH_ARM();
        VK_CMD_SET_ATTACHMENT_FEEDBACK_LOOP_ENABLE_EXT = vkDevice.VK_CMD_SET_ATTACHMENT_FEEDBACK_LOOP_ENABLE_EXT();
        VK_CMD_BIND_TILE_MEMORY_QCOM = vkDevice.VK_CMD_BIND_TILE_MEMORY_QCOM();
        VK_CMD_DECOMPRESS_MEMORY_EXT = vkDevice.VK_CMD_DECOMPRESS_MEMORY_EXT();
        VK_CMD_DECOMPRESS_MEMORY_INDIRECT_COUNT_EXT = vkDevice.VK_CMD_DECOMPRESS_MEMORY_INDIRECT_COUNT_EXT();
        VK_CMD_BUILD_CLUSTER_ACCELERATION_STRUCTURE_INDIRECT_NV = vkDevice.VK_CMD_BUILD_CLUSTER_ACCELERATION_STRUCTURE_INDIRECT_NV();
        VK_CMD_BUILD_PARTITIONED_ACCELERATION_STRUCTURES_NV = vkDevice.VK_CMD_BUILD_PARTITIONED_ACCELERATION_STRUCTURES_NV();
        VK_CMD_PREPROCESS_GENERATED_COMMANDS_EXT = vkDevice.VK_CMD_PREPROCESS_GENERATED_COMMANDS_EXT();
        VK_CMD_EXECUTE_GENERATED_COMMANDS_EXT = vkDevice.VK_CMD_EXECUTE_GENERATED_COMMANDS_EXT();
        VK_CMD_BEGIN_SHADER_INSTRUMENTATION_ARM = vkDevice.VK_CMD_BEGIN_SHADER_INSTRUMENTATION_ARM();
        VK_CMD_END_SHADER_INSTRUMENTATION_ARM = vkDevice.VK_CMD_END_SHADER_INSTRUMENTATION_ARM();
        VK_CMD_BEGIN_CUSTOM_RESOLVE_EXT = vkDevice.VK_CMD_BEGIN_CUSTOM_RESOLVE_EXT();
        VK_CMD_SET_COMPUTE_OCCUPANCY_PRIORITY_NV = vkDevice.VK_CMD_SET_COMPUTE_OCCUPANCY_PRIORITY_NV();
        VK_CMD_SET_PRIMITIVE_RESTART_INDEX_EXT = vkDevice.VK_CMD_SET_PRIMITIVE_RESTART_INDEX_EXT();
        VK_CMD_BUILD_ACCELERATION_STRUCTURES_KHR = vkDevice.VK_CMD_BUILD_ACCELERATION_STRUCTURES_KHR();
        VK_CMD_BUILD_ACCELERATION_STRUCTURES_INDIRECT_KHR = vkDevice.VK_CMD_BUILD_ACCELERATION_STRUCTURES_INDIRECT_KHR();
        VK_CMD_COPY_ACCELERATION_STRUCTURE_KHR = vkDevice.VK_CMD_COPY_ACCELERATION_STRUCTURE_KHR();
        VK_CMD_COPY_ACCELERATION_STRUCTURE_TO_MEMORY_KHR = vkDevice.VK_CMD_COPY_ACCELERATION_STRUCTURE_TO_MEMORY_KHR();
        VK_CMD_COPY_MEMORY_TO_ACCELERATION_STRUCTURE_KHR = vkDevice.VK_CMD_COPY_MEMORY_TO_ACCELERATION_STRUCTURE_KHR();
        VK_CMD_WRITE_ACCELERATION_STRUCTURES_PROPERTIES_KHR = vkDevice.VK_CMD_WRITE_ACCELERATION_STRUCTURES_PROPERTIES_KHR();
        VK_CMD_TRACE_RAYS_KHR = vkDevice.VK_CMD_TRACE_RAYS_KHR();
        VK_CMD_TRACE_RAYS_INDIRECT_KHR = vkDevice.VK_CMD_TRACE_RAYS_INDIRECT_KHR();
        VK_CMD_SET_RAY_TRACING_PIPELINE_STACK_SIZE_KHR = vkDevice.VK_CMD_SET_RAY_TRACING_PIPELINE_STACK_SIZE_KHR();
        VK_CMD_DRAW_MESH_TASKS_EXT = vkDevice.VK_CMD_DRAW_MESH_TASKS_EXT();
        VK_CMD_DRAW_MESH_TASKS_INDIRECT_EXT = vkDevice.VK_CMD_DRAW_MESH_TASKS_INDIRECT_EXT();
        VK_CMD_DRAW_MESH_TASKS_INDIRECT_COUNT_EXT = vkDevice.VK_CMD_DRAW_MESH_TASKS_INDIRECT_COUNT_EXT();
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

    public final LazyConstant<MethodHandle> VK_CMD_SET_DEVICE_MASK() {
        return VK_CMD_SET_DEVICE_MASK;
    }

    public final LazyConstant<MethodHandle> VK_CMD_DISPATCH_BASE() {
        return VK_CMD_DISPATCH_BASE;
    }

    public final LazyConstant<MethodHandle> VK_CMD_DRAW_INDIRECT_COUNT() {
        return VK_CMD_DRAW_INDIRECT_COUNT;
    }

    public final LazyConstant<MethodHandle> VK_CMD_DRAW_INDEXED_INDIRECT_COUNT() {
        return VK_CMD_DRAW_INDEXED_INDIRECT_COUNT;
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

    public final LazyConstant<MethodHandle> VK_CMD_PIPELINE_BARRIER2() {
        return VK_CMD_PIPELINE_BARRIER2;
    }

    public final LazyConstant<MethodHandle> VK_CMD_WRITE_TIMESTAMP2() {
        return VK_CMD_WRITE_TIMESTAMP2;
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

    public final LazyConstant<MethodHandle> VK_CMD_SET_RENDERING_ATTACHMENT_LOCATIONS() {
        return VK_CMD_SET_RENDERING_ATTACHMENT_LOCATIONS;
    }

    public final LazyConstant<MethodHandle> VK_CMD_SET_RENDERING_INPUT_ATTACHMENT_INDICES() {
        return VK_CMD_SET_RENDERING_INPUT_ATTACHMENT_INDICES;
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

    public final LazyConstant<MethodHandle> VK_CMD_SET_FRAGMENT_SHADING_RATE_KHR() {
        return VK_CMD_SET_FRAGMENT_SHADING_RATE_KHR;
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

    public final LazyConstant<MethodHandle> VK_CMD_TRACE_RAYS_INDIRECT2_KHR() {
        return VK_CMD_TRACE_RAYS_INDIRECT2_KHR;
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

    public final LazyConstant<MethodHandle> VK_CMD_END_RENDERING2_KHR() {
        return VK_CMD_END_RENDERING2_KHR;
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

    public final LazyConstant<MethodHandle> VK_CMD_CU_LAUNCH_KERNEL_NVX() {
        return VK_CMD_CU_LAUNCH_KERNEL_NVX;
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

    public final LazyConstant<MethodHandle> VK_CMD_SET_DISCARD_RECTANGLE_EXT() {
        return VK_CMD_SET_DISCARD_RECTANGLE_EXT;
    }

    public final LazyConstant<MethodHandle> VK_CMD_SET_DISCARD_RECTANGLE_ENABLE_EXT() {
        return VK_CMD_SET_DISCARD_RECTANGLE_ENABLE_EXT;
    }

    public final LazyConstant<MethodHandle> VK_CMD_SET_DISCARD_RECTANGLE_MODE_EXT() {
        return VK_CMD_SET_DISCARD_RECTANGLE_MODE_EXT;
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

    public final LazyConstant<MethodHandle> VK_CMD_COPY_GPA_SESSION_RESULTS_AMD() {
        return VK_CMD_COPY_GPA_SESSION_RESULTS_AMD;
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

    public final LazyConstant<MethodHandle> VK_CMD_SET_SAMPLE_LOCATIONS_EXT() {
        return VK_CMD_SET_SAMPLE_LOCATIONS_EXT;
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

    public final LazyConstant<MethodHandle> VK_CMD_BUILD_ACCELERATION_STRUCTURE_NV() {
        return VK_CMD_BUILD_ACCELERATION_STRUCTURE_NV;
    }

    public final LazyConstant<MethodHandle> VK_CMD_COPY_ACCELERATION_STRUCTURE_NV() {
        return VK_CMD_COPY_ACCELERATION_STRUCTURE_NV;
    }

    public final LazyConstant<MethodHandle> VK_CMD_TRACE_RAYS_NV() {
        return VK_CMD_TRACE_RAYS_NV;
    }

    public final LazyConstant<MethodHandle> VK_CMD_WRITE_ACCELERATION_STRUCTURES_PROPERTIES_NV() {
        return VK_CMD_WRITE_ACCELERATION_STRUCTURES_PROPERTIES_NV;
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

    public final LazyConstant<MethodHandle> VK_CMD_SET_PERFORMANCE_MARKER_INTEL() {
        return VK_CMD_SET_PERFORMANCE_MARKER_INTEL;
    }

    public final LazyConstant<MethodHandle> VK_CMD_SET_PERFORMANCE_STREAM_MARKER_INTEL() {
        return VK_CMD_SET_PERFORMANCE_STREAM_MARKER_INTEL;
    }

    public final LazyConstant<MethodHandle> VK_CMD_SET_PERFORMANCE_OVERRIDE_INTEL() {
        return VK_CMD_SET_PERFORMANCE_OVERRIDE_INTEL;
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

    public final LazyConstant<MethodHandle> VK_CMD_SET_DEPTH_BIAS2_EXT() {
        return VK_CMD_SET_DEPTH_BIAS2_EXT;
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

    public final LazyConstant<MethodHandle> VK_CMD_BIND_DESCRIPTOR_BUFFERS_EXT() {
        return VK_CMD_BIND_DESCRIPTOR_BUFFERS_EXT;
    }

    public final LazyConstant<MethodHandle> VK_CMD_SET_DESCRIPTOR_BUFFER_OFFSETS_EXT() {
        return VK_CMD_SET_DESCRIPTOR_BUFFER_OFFSETS_EXT;
    }

    public final LazyConstant<MethodHandle> VK_CMD_BIND_DESCRIPTOR_BUFFER_EMBEDDED_SAMPLERS_EXT() {
        return VK_CMD_BIND_DESCRIPTOR_BUFFER_EMBEDDED_SAMPLERS_EXT;
    }

    public final LazyConstant<MethodHandle> VK_CMD_SET_FRAGMENT_SHADING_RATE_ENUM_NV() {
        return VK_CMD_SET_FRAGMENT_SHADING_RATE_ENUM_NV;
    }

    public final LazyConstant<MethodHandle> VK_CMD_SET_VERTEX_INPUT_EXT() {
        return VK_CMD_SET_VERTEX_INPUT_EXT;
    }

    public final LazyConstant<MethodHandle> VK_CMD_SUBPASS_SHADING_HUAWEI() {
        return VK_CMD_SUBPASS_SHADING_HUAWEI;
    }

    public final LazyConstant<MethodHandle> VK_CMD_BIND_INVOCATION_MASK_HUAWEI() {
        return VK_CMD_BIND_INVOCATION_MASK_HUAWEI;
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

    public final LazyConstant<MethodHandle> VK_CMD_BUILD_MICROMAPS_EXT() {
        return VK_CMD_BUILD_MICROMAPS_EXT;
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

    public final LazyConstant<MethodHandle> VK_CMD_DRAW_CLUSTER_HUAWEI() {
        return VK_CMD_DRAW_CLUSTER_HUAWEI;
    }

    public final LazyConstant<MethodHandle> VK_CMD_DRAW_CLUSTER_INDIRECT_HUAWEI() {
        return VK_CMD_DRAW_CLUSTER_INDIRECT_HUAWEI;
    }

    public final LazyConstant<MethodHandle> VK_CMD_SET_DISPATCH_PARAMETERS_ARM() {
        return VK_CMD_SET_DISPATCH_PARAMETERS_ARM;
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

    public final LazyConstant<MethodHandle> VK_CMD_UPDATE_PIPELINE_INDIRECT_BUFFER_NV() {
        return VK_CMD_UPDATE_PIPELINE_INDIRECT_BUFFER_NV;
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

    public final LazyConstant<MethodHandle> VK_CMD_COPY_TENSOR_ARM() {
        return VK_CMD_COPY_TENSOR_ARM;
    }

    public final LazyConstant<MethodHandle> VK_CMD_OPTICAL_FLOW_EXECUTE_NV() {
        return VK_CMD_OPTICAL_FLOW_EXECUTE_NV;
    }

    public final LazyConstant<MethodHandle> VK_CMD_BIND_SHADERS_EXT() {
        return VK_CMD_BIND_SHADERS_EXT;
    }

    public final LazyConstant<MethodHandle> VK_CMD_SET_DEPTH_CLAMP_RANGE_EXT() {
        return VK_CMD_SET_DEPTH_CLAMP_RANGE_EXT;
    }

    public final LazyConstant<MethodHandle> VK_CMD_CONVERT_COOPERATIVE_VECTOR_MATRIX_NV() {
        return VK_CMD_CONVERT_COOPERATIVE_VECTOR_MATRIX_NV;
    }

    public final LazyConstant<MethodHandle> VK_CMD_DISPATCH_DATA_GRAPH_ARM() {
        return VK_CMD_DISPATCH_DATA_GRAPH_ARM;
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

    public final LazyConstant<MethodHandle> VK_CMD_BUILD_CLUSTER_ACCELERATION_STRUCTURE_INDIRECT_NV() {
        return VK_CMD_BUILD_CLUSTER_ACCELERATION_STRUCTURE_INDIRECT_NV;
    }

    public final LazyConstant<MethodHandle> VK_CMD_BUILD_PARTITIONED_ACCELERATION_STRUCTURES_NV() {
        return VK_CMD_BUILD_PARTITIONED_ACCELERATION_STRUCTURES_NV;
    }

    public final LazyConstant<MethodHandle> VK_CMD_PREPROCESS_GENERATED_COMMANDS_EXT() {
        return VK_CMD_PREPROCESS_GENERATED_COMMANDS_EXT;
    }

    public final LazyConstant<MethodHandle> VK_CMD_EXECUTE_GENERATED_COMMANDS_EXT() {
        return VK_CMD_EXECUTE_GENERATED_COMMANDS_EXT;
    }

    public final LazyConstant<MethodHandle> VK_CMD_BEGIN_SHADER_INSTRUMENTATION_ARM() {
        return VK_CMD_BEGIN_SHADER_INSTRUMENTATION_ARM;
    }

    public final LazyConstant<MethodHandle> VK_CMD_END_SHADER_INSTRUMENTATION_ARM() {
        return VK_CMD_END_SHADER_INSTRUMENTATION_ARM;
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

    public final LazyConstant<MethodHandle> VK_CMD_BUILD_ACCELERATION_STRUCTURES_KHR() {
        return VK_CMD_BUILD_ACCELERATION_STRUCTURES_KHR;
    }

    public final LazyConstant<MethodHandle> VK_CMD_BUILD_ACCELERATION_STRUCTURES_INDIRECT_KHR() {
        return VK_CMD_BUILD_ACCELERATION_STRUCTURES_INDIRECT_KHR;
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

    public final LazyConstant<MethodHandle> VK_CMD_WRITE_ACCELERATION_STRUCTURES_PROPERTIES_KHR() {
        return VK_CMD_WRITE_ACCELERATION_STRUCTURES_PROPERTIES_KHR;
    }

    public final LazyConstant<MethodHandle> VK_CMD_TRACE_RAYS_KHR() {
        return VK_CMD_TRACE_RAYS_KHR;
    }

    public final LazyConstant<MethodHandle> VK_CMD_TRACE_RAYS_INDIRECT_KHR() {
        return VK_CMD_TRACE_RAYS_INDIRECT_KHR;
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

}