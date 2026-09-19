/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;

public final class VkPhysicalDeviceFeatures
		implements Struct<VkPhysicalDeviceFeatures> {

    public static final StructLayout LAYOUT;

    public static final VarHandle ROBUST_BUFFER_ACCESS_HANDLE;
    public static final VarHandle FULL_DRAW_INDEX_UINT32_HANDLE;
    public static final VarHandle IMAGE_CUBE_ARRAY_HANDLE;
    public static final VarHandle INDEPENDENT_BLEND_HANDLE;
    public static final VarHandle GEOMETRY_SHADER_HANDLE;
    public static final VarHandle TESSELLATION_SHADER_HANDLE;
    public static final VarHandle SAMPLE_RATE_SHADING_HANDLE;
    public static final VarHandle DUAL_SRC_BLEND_HANDLE;
    public static final VarHandle LOGIC_OP_HANDLE;
    public static final VarHandle MULTI_DRAW_INDIRECT_HANDLE;
    public static final VarHandle DRAW_INDIRECT_FIRST_INSTANCE_HANDLE;
    public static final VarHandle DEPTH_CLAMP_HANDLE;
    public static final VarHandle DEPTH_BIAS_CLAMP_HANDLE;
    public static final VarHandle FILL_MODE_NON_SOLID_HANDLE;
    public static final VarHandle DEPTH_BOUNDS_HANDLE;
    public static final VarHandle WIDE_LINES_HANDLE;
    public static final VarHandle LARGE_POINTS_HANDLE;
    public static final VarHandle ALPHA_TO_ONE_HANDLE;
    public static final VarHandle MULTI_VIEWPORT_HANDLE;
    public static final VarHandle SAMPLER_ANISOTROPY_HANDLE;
    public static final VarHandle TEXTURE_COMPRESSION_ETC2_HANDLE;
    public static final VarHandle TEXTURE_COMPRESSION_ASTC_LDR_HANDLE;
    public static final VarHandle TEXTURE_COMPRESSION_BC_HANDLE;
    public static final VarHandle OCCLUSION_QUERY_PRECISE_HANDLE;
    public static final VarHandle PIPELINE_STATISTICS_QUERY_HANDLE;
    public static final VarHandle VERTEX_PIPELINE_STORES_AND_ATOMICS_HANDLE;
    public static final VarHandle FRAGMENT_STORES_AND_ATOMICS_HANDLE;
    public static final VarHandle SHADER_TESSELLATION_AND_GEOMETRY_POINT_SIZE_HANDLE;
    public static final VarHandle SHADER_IMAGE_GATHER_EXTENDED_HANDLE;
    public static final VarHandle SHADER_STORAGE_IMAGE_EXTENDED_FORMATS_HANDLE;
    public static final VarHandle SHADER_STORAGE_IMAGE_MULTISAMPLE_HANDLE;
    public static final VarHandle SHADER_STORAGE_IMAGE_READ_WITHOUT_FORMAT_HANDLE;
    public static final VarHandle SHADER_STORAGE_IMAGE_WRITE_WITHOUT_FORMAT_HANDLE;
    public static final VarHandle SHADER_UNIFORM_BUFFER_ARRAY_DYNAMIC_INDEXING_HANDLE;
    public static final VarHandle SHADER_SAMPLED_IMAGE_ARRAY_DYNAMIC_INDEXING_HANDLE;
    public static final VarHandle SHADER_STORAGE_BUFFER_ARRAY_DYNAMIC_INDEXING_HANDLE;
    public static final VarHandle SHADER_STORAGE_IMAGE_ARRAY_DYNAMIC_INDEXING_HANDLE;
    public static final VarHandle SHADER_CLIP_DISTANCE_HANDLE;
    public static final VarHandle SHADER_CULL_DISTANCE_HANDLE;
    public static final VarHandle SHADER_FLOAT64_HANDLE;
    public static final VarHandle SHADER_INT64_HANDLE;
    public static final VarHandle SHADER_INT16_HANDLE;
    public static final VarHandle SHADER_RESOURCE_RESIDENCY_HANDLE;
    public static final VarHandle SHADER_RESOURCE_MIN_LOD_HANDLE;
    public static final VarHandle SPARSE_BINDING_HANDLE;
    public static final VarHandle SPARSE_RESIDENCY_BUFFER_HANDLE;
    public static final VarHandle SPARSE_RESIDENCY_IMAGE2_D_HANDLE;
    public static final VarHandle SPARSE_RESIDENCY_IMAGE3_D_HANDLE;
    public static final VarHandle SPARSE_RESIDENCY2_SAMPLES_HANDLE;
    public static final VarHandle SPARSE_RESIDENCY4_SAMPLES_HANDLE;
    public static final VarHandle SPARSE_RESIDENCY8_SAMPLES_HANDLE;
    public static final VarHandle SPARSE_RESIDENCY16_SAMPLES_HANDLE;
    public static final VarHandle SPARSE_RESIDENCY_ALIASED_HANDLE;
    public static final VarHandle VARIABLE_MULTISAMPLE_RATE_HANDLE;
    public static final VarHandle INHERITED_QUERIES_HANDLE;

    public static final long ROBUST_BUFFER_ACCESS_BYTE_OFFSET;
    public static final long FULL_DRAW_INDEX_UINT32_BYTE_OFFSET;
    public static final long IMAGE_CUBE_ARRAY_BYTE_OFFSET;
    public static final long INDEPENDENT_BLEND_BYTE_OFFSET;
    public static final long GEOMETRY_SHADER_BYTE_OFFSET;
    public static final long TESSELLATION_SHADER_BYTE_OFFSET;
    public static final long SAMPLE_RATE_SHADING_BYTE_OFFSET;
    public static final long DUAL_SRC_BLEND_BYTE_OFFSET;
    public static final long LOGIC_OP_BYTE_OFFSET;
    public static final long MULTI_DRAW_INDIRECT_BYTE_OFFSET;
    public static final long DRAW_INDIRECT_FIRST_INSTANCE_BYTE_OFFSET;
    public static final long DEPTH_CLAMP_BYTE_OFFSET;
    public static final long DEPTH_BIAS_CLAMP_BYTE_OFFSET;
    public static final long FILL_MODE_NON_SOLID_BYTE_OFFSET;
    public static final long DEPTH_BOUNDS_BYTE_OFFSET;
    public static final long WIDE_LINES_BYTE_OFFSET;
    public static final long LARGE_POINTS_BYTE_OFFSET;
    public static final long ALPHA_TO_ONE_BYTE_OFFSET;
    public static final long MULTI_VIEWPORT_BYTE_OFFSET;
    public static final long SAMPLER_ANISOTROPY_BYTE_OFFSET;
    public static final long TEXTURE_COMPRESSION_ETC2_BYTE_OFFSET;
    public static final long TEXTURE_COMPRESSION_ASTC_LDR_BYTE_OFFSET;
    public static final long TEXTURE_COMPRESSION_BC_BYTE_OFFSET;
    public static final long OCCLUSION_QUERY_PRECISE_BYTE_OFFSET;
    public static final long PIPELINE_STATISTICS_QUERY_BYTE_OFFSET;
    public static final long VERTEX_PIPELINE_STORES_AND_ATOMICS_BYTE_OFFSET;
    public static final long FRAGMENT_STORES_AND_ATOMICS_BYTE_OFFSET;
    public static final long SHADER_TESSELLATION_AND_GEOMETRY_POINT_SIZE_BYTE_OFFSET;
    public static final long SHADER_IMAGE_GATHER_EXTENDED_BYTE_OFFSET;
    public static final long SHADER_STORAGE_IMAGE_EXTENDED_FORMATS_BYTE_OFFSET;
    public static final long SHADER_STORAGE_IMAGE_MULTISAMPLE_BYTE_OFFSET;
    public static final long SHADER_STORAGE_IMAGE_READ_WITHOUT_FORMAT_BYTE_OFFSET;
    public static final long SHADER_STORAGE_IMAGE_WRITE_WITHOUT_FORMAT_BYTE_OFFSET;
    public static final long SHADER_UNIFORM_BUFFER_ARRAY_DYNAMIC_INDEXING_BYTE_OFFSET;
    public static final long SHADER_SAMPLED_IMAGE_ARRAY_DYNAMIC_INDEXING_BYTE_OFFSET;
    public static final long SHADER_STORAGE_BUFFER_ARRAY_DYNAMIC_INDEXING_BYTE_OFFSET;
    public static final long SHADER_STORAGE_IMAGE_ARRAY_DYNAMIC_INDEXING_BYTE_OFFSET;
    public static final long SHADER_CLIP_DISTANCE_BYTE_OFFSET;
    public static final long SHADER_CULL_DISTANCE_BYTE_OFFSET;
    public static final long SHADER_FLOAT64_BYTE_OFFSET;
    public static final long SHADER_INT64_BYTE_OFFSET;
    public static final long SHADER_INT16_BYTE_OFFSET;
    public static final long SHADER_RESOURCE_RESIDENCY_BYTE_OFFSET;
    public static final long SHADER_RESOURCE_MIN_LOD_BYTE_OFFSET;
    public static final long SPARSE_BINDING_BYTE_OFFSET;
    public static final long SPARSE_RESIDENCY_BUFFER_BYTE_OFFSET;
    public static final long SPARSE_RESIDENCY_IMAGE2_D_BYTE_OFFSET;
    public static final long SPARSE_RESIDENCY_IMAGE3_D_BYTE_OFFSET;
    public static final long SPARSE_RESIDENCY2_SAMPLES_BYTE_OFFSET;
    public static final long SPARSE_RESIDENCY4_SAMPLES_BYTE_OFFSET;
    public static final long SPARSE_RESIDENCY8_SAMPLES_BYTE_OFFSET;
    public static final long SPARSE_RESIDENCY16_SAMPLES_BYTE_OFFSET;
    public static final long SPARSE_RESIDENCY_ALIASED_BYTE_OFFSET;
    public static final long VARIABLE_MULTISAMPLE_RATE_BYTE_OFFSET;
    public static final long INHERITED_QUERIES_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("robustBufferAccess"),
            JAVA_INT.withName("fullDrawIndexUint32"),
            JAVA_INT.withName("imageCubeArray"),
            JAVA_INT.withName("independentBlend"),
            JAVA_INT.withName("geometryShader"),
            JAVA_INT.withName("tessellationShader"),
            JAVA_INT.withName("sampleRateShading"),
            JAVA_INT.withName("dualSrcBlend"),
            JAVA_INT.withName("logicOp"),
            JAVA_INT.withName("multiDrawIndirect"),
            JAVA_INT.withName("drawIndirectFirstInstance"),
            JAVA_INT.withName("depthClamp"),
            JAVA_INT.withName("depthBiasClamp"),
            JAVA_INT.withName("fillModeNonSolid"),
            JAVA_INT.withName("depthBounds"),
            JAVA_INT.withName("wideLines"),
            JAVA_INT.withName("largePoints"),
            JAVA_INT.withName("alphaToOne"),
            JAVA_INT.withName("multiViewport"),
            JAVA_INT.withName("samplerAnisotropy"),
            JAVA_INT.withName("textureCompressionETC2"),
            JAVA_INT.withName("textureCompressionASTC_LDR"),
            JAVA_INT.withName("textureCompressionBC"),
            JAVA_INT.withName("occlusionQueryPrecise"),
            JAVA_INT.withName("pipelineStatisticsQuery"),
            JAVA_INT.withName("vertexPipelineStoresAndAtomics"),
            JAVA_INT.withName("fragmentStoresAndAtomics"),
            JAVA_INT.withName("shaderTessellationAndGeometryPointSize"),
            JAVA_INT.withName("shaderImageGatherExtended"),
            JAVA_INT.withName("shaderStorageImageExtendedFormats"),
            JAVA_INT.withName("shaderStorageImageMultisample"),
            JAVA_INT.withName("shaderStorageImageReadWithoutFormat"),
            JAVA_INT.withName("shaderStorageImageWriteWithoutFormat"),
            JAVA_INT.withName("shaderUniformBufferArrayDynamicIndexing"),
            JAVA_INT.withName("shaderSampledImageArrayDynamicIndexing"),
            JAVA_INT.withName("shaderStorageBufferArrayDynamicIndexing"),
            JAVA_INT.withName("shaderStorageImageArrayDynamicIndexing"),
            JAVA_INT.withName("shaderClipDistance"),
            JAVA_INT.withName("shaderCullDistance"),
            JAVA_INT.withName("shaderFloat64"),
            JAVA_INT.withName("shaderInt64"),
            JAVA_INT.withName("shaderInt16"),
            JAVA_INT.withName("shaderResourceResidency"),
            JAVA_INT.withName("shaderResourceMinLod"),
            JAVA_INT.withName("sparseBinding"),
            JAVA_INT.withName("sparseResidencyBuffer"),
            JAVA_INT.withName("sparseResidencyImage2D"),
            JAVA_INT.withName("sparseResidencyImage3D"),
            JAVA_INT.withName("sparseResidency2Samples"),
            JAVA_INT.withName("sparseResidency4Samples"),
            JAVA_INT.withName("sparseResidency8Samples"),
            JAVA_INT.withName("sparseResidency16Samples"),
            JAVA_INT.withName("sparseResidencyAliased"),
            JAVA_INT.withName("variableMultisampleRate"),
            JAVA_INT.withName("inheritedQueries")
        ).withName("VkPhysicalDeviceFeatures").withByteAlignment(4);
        
        ROBUST_BUFFER_ACCESS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("robustBufferAccess"));
        FULL_DRAW_INDEX_UINT32_HANDLE = LAYOUT.varHandle(PathElement.groupElement("fullDrawIndexUint32"));
        IMAGE_CUBE_ARRAY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("imageCubeArray"));
        INDEPENDENT_BLEND_HANDLE = LAYOUT.varHandle(PathElement.groupElement("independentBlend"));
        GEOMETRY_SHADER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("geometryShader"));
        TESSELLATION_SHADER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("tessellationShader"));
        SAMPLE_RATE_SHADING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sampleRateShading"));
        DUAL_SRC_BLEND_HANDLE = LAYOUT.varHandle(PathElement.groupElement("dualSrcBlend"));
        LOGIC_OP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("logicOp"));
        MULTI_DRAW_INDIRECT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("multiDrawIndirect"));
        DRAW_INDIRECT_FIRST_INSTANCE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("drawIndirectFirstInstance"));
        DEPTH_CLAMP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("depthClamp"));
        DEPTH_BIAS_CLAMP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("depthBiasClamp"));
        FILL_MODE_NON_SOLID_HANDLE = LAYOUT.varHandle(PathElement.groupElement("fillModeNonSolid"));
        DEPTH_BOUNDS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("depthBounds"));
        WIDE_LINES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("wideLines"));
        LARGE_POINTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("largePoints"));
        ALPHA_TO_ONE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("alphaToOne"));
        MULTI_VIEWPORT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("multiViewport"));
        SAMPLER_ANISOTROPY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("samplerAnisotropy"));
        TEXTURE_COMPRESSION_ETC2_HANDLE = LAYOUT.varHandle(PathElement.groupElement("textureCompressionETC2"));
        TEXTURE_COMPRESSION_ASTC_LDR_HANDLE = LAYOUT.varHandle(PathElement.groupElement("textureCompressionASTC_LDR"));
        TEXTURE_COMPRESSION_BC_HANDLE = LAYOUT.varHandle(PathElement.groupElement("textureCompressionBC"));
        OCCLUSION_QUERY_PRECISE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("occlusionQueryPrecise"));
        PIPELINE_STATISTICS_QUERY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pipelineStatisticsQuery"));
        VERTEX_PIPELINE_STORES_AND_ATOMICS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("vertexPipelineStoresAndAtomics"));
        FRAGMENT_STORES_AND_ATOMICS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("fragmentStoresAndAtomics"));
        SHADER_TESSELLATION_AND_GEOMETRY_POINT_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderTessellationAndGeometryPointSize"));
        SHADER_IMAGE_GATHER_EXTENDED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderImageGatherExtended"));
        SHADER_STORAGE_IMAGE_EXTENDED_FORMATS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderStorageImageExtendedFormats"));
        SHADER_STORAGE_IMAGE_MULTISAMPLE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderStorageImageMultisample"));
        SHADER_STORAGE_IMAGE_READ_WITHOUT_FORMAT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderStorageImageReadWithoutFormat"));
        SHADER_STORAGE_IMAGE_WRITE_WITHOUT_FORMAT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderStorageImageWriteWithoutFormat"));
        SHADER_UNIFORM_BUFFER_ARRAY_DYNAMIC_INDEXING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderUniformBufferArrayDynamicIndexing"));
        SHADER_SAMPLED_IMAGE_ARRAY_DYNAMIC_INDEXING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderSampledImageArrayDynamicIndexing"));
        SHADER_STORAGE_BUFFER_ARRAY_DYNAMIC_INDEXING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderStorageBufferArrayDynamicIndexing"));
        SHADER_STORAGE_IMAGE_ARRAY_DYNAMIC_INDEXING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderStorageImageArrayDynamicIndexing"));
        SHADER_CLIP_DISTANCE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderClipDistance"));
        SHADER_CULL_DISTANCE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderCullDistance"));
        SHADER_FLOAT64_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderFloat64"));
        SHADER_INT64_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderInt64"));
        SHADER_INT16_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderInt16"));
        SHADER_RESOURCE_RESIDENCY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderResourceResidency"));
        SHADER_RESOURCE_MIN_LOD_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderResourceMinLod"));
        SPARSE_BINDING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sparseBinding"));
        SPARSE_RESIDENCY_BUFFER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sparseResidencyBuffer"));
        SPARSE_RESIDENCY_IMAGE2_D_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sparseResidencyImage2D"));
        SPARSE_RESIDENCY_IMAGE3_D_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sparseResidencyImage3D"));
        SPARSE_RESIDENCY2_SAMPLES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sparseResidency2Samples"));
        SPARSE_RESIDENCY4_SAMPLES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sparseResidency4Samples"));
        SPARSE_RESIDENCY8_SAMPLES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sparseResidency8Samples"));
        SPARSE_RESIDENCY16_SAMPLES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sparseResidency16Samples"));
        SPARSE_RESIDENCY_ALIASED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sparseResidencyAliased"));
        VARIABLE_MULTISAMPLE_RATE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("variableMultisampleRate"));
        INHERITED_QUERIES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("inheritedQueries"));
        
        ROBUST_BUFFER_ACCESS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("robustBufferAccess"));
        FULL_DRAW_INDEX_UINT32_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("fullDrawIndexUint32"));
        IMAGE_CUBE_ARRAY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("imageCubeArray"));
        INDEPENDENT_BLEND_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("independentBlend"));
        GEOMETRY_SHADER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("geometryShader"));
        TESSELLATION_SHADER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("tessellationShader"));
        SAMPLE_RATE_SHADING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sampleRateShading"));
        DUAL_SRC_BLEND_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dualSrcBlend"));
        LOGIC_OP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("logicOp"));
        MULTI_DRAW_INDIRECT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("multiDrawIndirect"));
        DRAW_INDIRECT_FIRST_INSTANCE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("drawIndirectFirstInstance"));
        DEPTH_CLAMP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("depthClamp"));
        DEPTH_BIAS_CLAMP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("depthBiasClamp"));
        FILL_MODE_NON_SOLID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("fillModeNonSolid"));
        DEPTH_BOUNDS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("depthBounds"));
        WIDE_LINES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("wideLines"));
        LARGE_POINTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("largePoints"));
        ALPHA_TO_ONE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("alphaToOne"));
        MULTI_VIEWPORT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("multiViewport"));
        SAMPLER_ANISOTROPY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("samplerAnisotropy"));
        TEXTURE_COMPRESSION_ETC2_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("textureCompressionETC2"));
        TEXTURE_COMPRESSION_ASTC_LDR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("textureCompressionASTC_LDR"));
        TEXTURE_COMPRESSION_BC_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("textureCompressionBC"));
        OCCLUSION_QUERY_PRECISE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("occlusionQueryPrecise"));
        PIPELINE_STATISTICS_QUERY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pipelineStatisticsQuery"));
        VERTEX_PIPELINE_STORES_AND_ATOMICS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vertexPipelineStoresAndAtomics"));
        FRAGMENT_STORES_AND_ATOMICS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("fragmentStoresAndAtomics"));
        SHADER_TESSELLATION_AND_GEOMETRY_POINT_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderTessellationAndGeometryPointSize"));
        SHADER_IMAGE_GATHER_EXTENDED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderImageGatherExtended"));
        SHADER_STORAGE_IMAGE_EXTENDED_FORMATS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderStorageImageExtendedFormats"));
        SHADER_STORAGE_IMAGE_MULTISAMPLE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderStorageImageMultisample"));
        SHADER_STORAGE_IMAGE_READ_WITHOUT_FORMAT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderStorageImageReadWithoutFormat"));
        SHADER_STORAGE_IMAGE_WRITE_WITHOUT_FORMAT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderStorageImageWriteWithoutFormat"));
        SHADER_UNIFORM_BUFFER_ARRAY_DYNAMIC_INDEXING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderUniformBufferArrayDynamicIndexing"));
        SHADER_SAMPLED_IMAGE_ARRAY_DYNAMIC_INDEXING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderSampledImageArrayDynamicIndexing"));
        SHADER_STORAGE_BUFFER_ARRAY_DYNAMIC_INDEXING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderStorageBufferArrayDynamicIndexing"));
        SHADER_STORAGE_IMAGE_ARRAY_DYNAMIC_INDEXING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderStorageImageArrayDynamicIndexing"));
        SHADER_CLIP_DISTANCE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderClipDistance"));
        SHADER_CULL_DISTANCE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderCullDistance"));
        SHADER_FLOAT64_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderFloat64"));
        SHADER_INT64_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderInt64"));
        SHADER_INT16_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderInt16"));
        SHADER_RESOURCE_RESIDENCY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderResourceResidency"));
        SHADER_RESOURCE_MIN_LOD_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderResourceMinLod"));
        SPARSE_BINDING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sparseBinding"));
        SPARSE_RESIDENCY_BUFFER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sparseResidencyBuffer"));
        SPARSE_RESIDENCY_IMAGE2_D_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sparseResidencyImage2D"));
        SPARSE_RESIDENCY_IMAGE3_D_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sparseResidencyImage3D"));
        SPARSE_RESIDENCY2_SAMPLES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sparseResidency2Samples"));
        SPARSE_RESIDENCY4_SAMPLES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sparseResidency4Samples"));
        SPARSE_RESIDENCY8_SAMPLES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sparseResidency8Samples"));
        SPARSE_RESIDENCY16_SAMPLES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sparseResidency16Samples"));
        SPARSE_RESIDENCY_ALIASED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sparseResidencyAliased"));
        VARIABLE_MULTISAMPLE_RATE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("variableMultisampleRate"));
        INHERITED_QUERIES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("inheritedQueries"));
        //@formatter:on
    }

    public VkPhysicalDeviceFeatures() {
        this(Arena.ofAuto());
    }
    
    public VkPhysicalDeviceFeatures(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkPhysicalDeviceFeatures(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #robustBufferAccess()
    public VkPhysicalDeviceFeatures robustBufferAccess(int robustBufferAccess) {
    	ROBUST_BUFFER_ACCESS_HANDLE.set(segment, 0L, robustBufferAccess);
    	return this;
    }
    
    public int robustBufferAccess() {
    	return (int) ROBUST_BUFFER_ACCESS_HANDLE.get(segment, 0L);
    }
    
    /// @see #fullDrawIndexUint32()
    public VkPhysicalDeviceFeatures fullDrawIndexUint32(int fullDrawIndexUint32) {
    	FULL_DRAW_INDEX_UINT32_HANDLE.set(segment, 0L, fullDrawIndexUint32);
    	return this;
    }
    
    public int fullDrawIndexUint32() {
    	return (int) FULL_DRAW_INDEX_UINT32_HANDLE.get(segment, 0L);
    }
    
    /// @see #imageCubeArray()
    public VkPhysicalDeviceFeatures imageCubeArray(int imageCubeArray) {
    	IMAGE_CUBE_ARRAY_HANDLE.set(segment, 0L, imageCubeArray);
    	return this;
    }
    
    public int imageCubeArray() {
    	return (int) IMAGE_CUBE_ARRAY_HANDLE.get(segment, 0L);
    }
    
    /// @see #independentBlend()
    public VkPhysicalDeviceFeatures independentBlend(int independentBlend) {
    	INDEPENDENT_BLEND_HANDLE.set(segment, 0L, independentBlend);
    	return this;
    }
    
    public int independentBlend() {
    	return (int) INDEPENDENT_BLEND_HANDLE.get(segment, 0L);
    }
    
    /// @see #geometryShader()
    public VkPhysicalDeviceFeatures geometryShader(int geometryShader) {
    	GEOMETRY_SHADER_HANDLE.set(segment, 0L, geometryShader);
    	return this;
    }
    
    public int geometryShader() {
    	return (int) GEOMETRY_SHADER_HANDLE.get(segment, 0L);
    }
    
    /// @see #tessellationShader()
    public VkPhysicalDeviceFeatures tessellationShader(int tessellationShader) {
    	TESSELLATION_SHADER_HANDLE.set(segment, 0L, tessellationShader);
    	return this;
    }
    
    public int tessellationShader() {
    	return (int) TESSELLATION_SHADER_HANDLE.get(segment, 0L);
    }
    
    /// @see #sampleRateShading()
    public VkPhysicalDeviceFeatures sampleRateShading(int sampleRateShading) {
    	SAMPLE_RATE_SHADING_HANDLE.set(segment, 0L, sampleRateShading);
    	return this;
    }
    
    public int sampleRateShading() {
    	return (int) SAMPLE_RATE_SHADING_HANDLE.get(segment, 0L);
    }
    
    /// @see #dualSrcBlend()
    public VkPhysicalDeviceFeatures dualSrcBlend(int dualSrcBlend) {
    	DUAL_SRC_BLEND_HANDLE.set(segment, 0L, dualSrcBlend);
    	return this;
    }
    
    public int dualSrcBlend() {
    	return (int) DUAL_SRC_BLEND_HANDLE.get(segment, 0L);
    }
    
    /// @see #logicOp()
    public VkPhysicalDeviceFeatures logicOp(int logicOp) {
    	LOGIC_OP_HANDLE.set(segment, 0L, logicOp);
    	return this;
    }
    
    public int logicOp() {
    	return (int) LOGIC_OP_HANDLE.get(segment, 0L);
    }
    
    /// @see #multiDrawIndirect()
    public VkPhysicalDeviceFeatures multiDrawIndirect(int multiDrawIndirect) {
    	MULTI_DRAW_INDIRECT_HANDLE.set(segment, 0L, multiDrawIndirect);
    	return this;
    }
    
    public int multiDrawIndirect() {
    	return (int) MULTI_DRAW_INDIRECT_HANDLE.get(segment, 0L);
    }
    
    /// @see #drawIndirectFirstInstance()
    public VkPhysicalDeviceFeatures drawIndirectFirstInstance(int drawIndirectFirstInstance) {
    	DRAW_INDIRECT_FIRST_INSTANCE_HANDLE.set(segment, 0L, drawIndirectFirstInstance);
    	return this;
    }
    
    public int drawIndirectFirstInstance() {
    	return (int) DRAW_INDIRECT_FIRST_INSTANCE_HANDLE.get(segment, 0L);
    }
    
    /// @see #depthClamp()
    public VkPhysicalDeviceFeatures depthClamp(int depthClamp) {
    	DEPTH_CLAMP_HANDLE.set(segment, 0L, depthClamp);
    	return this;
    }
    
    public int depthClamp() {
    	return (int) DEPTH_CLAMP_HANDLE.get(segment, 0L);
    }
    
    /// @see #depthBiasClamp()
    public VkPhysicalDeviceFeatures depthBiasClamp(int depthBiasClamp) {
    	DEPTH_BIAS_CLAMP_HANDLE.set(segment, 0L, depthBiasClamp);
    	return this;
    }
    
    public int depthBiasClamp() {
    	return (int) DEPTH_BIAS_CLAMP_HANDLE.get(segment, 0L);
    }
    
    /// @see #fillModeNonSolid()
    public VkPhysicalDeviceFeatures fillModeNonSolid(int fillModeNonSolid) {
    	FILL_MODE_NON_SOLID_HANDLE.set(segment, 0L, fillModeNonSolid);
    	return this;
    }
    
    public int fillModeNonSolid() {
    	return (int) FILL_MODE_NON_SOLID_HANDLE.get(segment, 0L);
    }
    
    /// @see #depthBounds()
    public VkPhysicalDeviceFeatures depthBounds(int depthBounds) {
    	DEPTH_BOUNDS_HANDLE.set(segment, 0L, depthBounds);
    	return this;
    }
    
    public int depthBounds() {
    	return (int) DEPTH_BOUNDS_HANDLE.get(segment, 0L);
    }
    
    /// @see #wideLines()
    public VkPhysicalDeviceFeatures wideLines(int wideLines) {
    	WIDE_LINES_HANDLE.set(segment, 0L, wideLines);
    	return this;
    }
    
    public int wideLines() {
    	return (int) WIDE_LINES_HANDLE.get(segment, 0L);
    }
    
    /// @see #largePoints()
    public VkPhysicalDeviceFeatures largePoints(int largePoints) {
    	LARGE_POINTS_HANDLE.set(segment, 0L, largePoints);
    	return this;
    }
    
    public int largePoints() {
    	return (int) LARGE_POINTS_HANDLE.get(segment, 0L);
    }
    
    /// @see #alphaToOne()
    public VkPhysicalDeviceFeatures alphaToOne(int alphaToOne) {
    	ALPHA_TO_ONE_HANDLE.set(segment, 0L, alphaToOne);
    	return this;
    }
    
    public int alphaToOne() {
    	return (int) ALPHA_TO_ONE_HANDLE.get(segment, 0L);
    }
    
    /// @see #multiViewport()
    public VkPhysicalDeviceFeatures multiViewport(int multiViewport) {
    	MULTI_VIEWPORT_HANDLE.set(segment, 0L, multiViewport);
    	return this;
    }
    
    public int multiViewport() {
    	return (int) MULTI_VIEWPORT_HANDLE.get(segment, 0L);
    }
    
    /// @see #samplerAnisotropy()
    public VkPhysicalDeviceFeatures samplerAnisotropy(int samplerAnisotropy) {
    	SAMPLER_ANISOTROPY_HANDLE.set(segment, 0L, samplerAnisotropy);
    	return this;
    }
    
    public int samplerAnisotropy() {
    	return (int) SAMPLER_ANISOTROPY_HANDLE.get(segment, 0L);
    }
    
    /// @see #textureCompressionETC2()
    public VkPhysicalDeviceFeatures textureCompressionETC2(int textureCompressionETC2) {
    	TEXTURE_COMPRESSION_ETC2_HANDLE.set(segment, 0L, textureCompressionETC2);
    	return this;
    }
    
    public int textureCompressionETC2() {
    	return (int) TEXTURE_COMPRESSION_ETC2_HANDLE.get(segment, 0L);
    }
    
    /// @see #textureCompressionASTC_LDR()
    public VkPhysicalDeviceFeatures textureCompressionASTC_LDR(int textureCompressionASTC_LDR) {
    	TEXTURE_COMPRESSION_ASTC_LDR_HANDLE.set(segment, 0L, textureCompressionASTC_LDR);
    	return this;
    }
    
    public int textureCompressionASTC_LDR() {
    	return (int) TEXTURE_COMPRESSION_ASTC_LDR_HANDLE.get(segment, 0L);
    }
    
    /// @see #textureCompressionBC()
    public VkPhysicalDeviceFeatures textureCompressionBC(int textureCompressionBC) {
    	TEXTURE_COMPRESSION_BC_HANDLE.set(segment, 0L, textureCompressionBC);
    	return this;
    }
    
    public int textureCompressionBC() {
    	return (int) TEXTURE_COMPRESSION_BC_HANDLE.get(segment, 0L);
    }
    
    /// @see #occlusionQueryPrecise()
    public VkPhysicalDeviceFeatures occlusionQueryPrecise(int occlusionQueryPrecise) {
    	OCCLUSION_QUERY_PRECISE_HANDLE.set(segment, 0L, occlusionQueryPrecise);
    	return this;
    }
    
    public int occlusionQueryPrecise() {
    	return (int) OCCLUSION_QUERY_PRECISE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pipelineStatisticsQuery()
    public VkPhysicalDeviceFeatures pipelineStatisticsQuery(int pipelineStatisticsQuery) {
    	PIPELINE_STATISTICS_QUERY_HANDLE.set(segment, 0L, pipelineStatisticsQuery);
    	return this;
    }
    
    public int pipelineStatisticsQuery() {
    	return (int) PIPELINE_STATISTICS_QUERY_HANDLE.get(segment, 0L);
    }
    
    /// @see #vertexPipelineStoresAndAtomics()
    public VkPhysicalDeviceFeatures vertexPipelineStoresAndAtomics(int vertexPipelineStoresAndAtomics) {
    	VERTEX_PIPELINE_STORES_AND_ATOMICS_HANDLE.set(segment, 0L, vertexPipelineStoresAndAtomics);
    	return this;
    }
    
    public int vertexPipelineStoresAndAtomics() {
    	return (int) VERTEX_PIPELINE_STORES_AND_ATOMICS_HANDLE.get(segment, 0L);
    }
    
    /// @see #fragmentStoresAndAtomics()
    public VkPhysicalDeviceFeatures fragmentStoresAndAtomics(int fragmentStoresAndAtomics) {
    	FRAGMENT_STORES_AND_ATOMICS_HANDLE.set(segment, 0L, fragmentStoresAndAtomics);
    	return this;
    }
    
    public int fragmentStoresAndAtomics() {
    	return (int) FRAGMENT_STORES_AND_ATOMICS_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderTessellationAndGeometryPointSize()
    public VkPhysicalDeviceFeatures shaderTessellationAndGeometryPointSize(int shaderTessellationAndGeometryPointSize) {
    	SHADER_TESSELLATION_AND_GEOMETRY_POINT_SIZE_HANDLE.set(segment, 0L, shaderTessellationAndGeometryPointSize);
    	return this;
    }
    
    public int shaderTessellationAndGeometryPointSize() {
    	return (int) SHADER_TESSELLATION_AND_GEOMETRY_POINT_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderImageGatherExtended()
    public VkPhysicalDeviceFeatures shaderImageGatherExtended(int shaderImageGatherExtended) {
    	SHADER_IMAGE_GATHER_EXTENDED_HANDLE.set(segment, 0L, shaderImageGatherExtended);
    	return this;
    }
    
    public int shaderImageGatherExtended() {
    	return (int) SHADER_IMAGE_GATHER_EXTENDED_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderStorageImageExtendedFormats()
    public VkPhysicalDeviceFeatures shaderStorageImageExtendedFormats(int shaderStorageImageExtendedFormats) {
    	SHADER_STORAGE_IMAGE_EXTENDED_FORMATS_HANDLE.set(segment, 0L, shaderStorageImageExtendedFormats);
    	return this;
    }
    
    public int shaderStorageImageExtendedFormats() {
    	return (int) SHADER_STORAGE_IMAGE_EXTENDED_FORMATS_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderStorageImageMultisample()
    public VkPhysicalDeviceFeatures shaderStorageImageMultisample(int shaderStorageImageMultisample) {
    	SHADER_STORAGE_IMAGE_MULTISAMPLE_HANDLE.set(segment, 0L, shaderStorageImageMultisample);
    	return this;
    }
    
    public int shaderStorageImageMultisample() {
    	return (int) SHADER_STORAGE_IMAGE_MULTISAMPLE_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderStorageImageReadWithoutFormat()
    public VkPhysicalDeviceFeatures shaderStorageImageReadWithoutFormat(int shaderStorageImageReadWithoutFormat) {
    	SHADER_STORAGE_IMAGE_READ_WITHOUT_FORMAT_HANDLE.set(segment, 0L, shaderStorageImageReadWithoutFormat);
    	return this;
    }
    
    public int shaderStorageImageReadWithoutFormat() {
    	return (int) SHADER_STORAGE_IMAGE_READ_WITHOUT_FORMAT_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderStorageImageWriteWithoutFormat()
    public VkPhysicalDeviceFeatures shaderStorageImageWriteWithoutFormat(int shaderStorageImageWriteWithoutFormat) {
    	SHADER_STORAGE_IMAGE_WRITE_WITHOUT_FORMAT_HANDLE.set(segment, 0L, shaderStorageImageWriteWithoutFormat);
    	return this;
    }
    
    public int shaderStorageImageWriteWithoutFormat() {
    	return (int) SHADER_STORAGE_IMAGE_WRITE_WITHOUT_FORMAT_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderUniformBufferArrayDynamicIndexing()
    public VkPhysicalDeviceFeatures shaderUniformBufferArrayDynamicIndexing(int shaderUniformBufferArrayDynamicIndexing) {
    	SHADER_UNIFORM_BUFFER_ARRAY_DYNAMIC_INDEXING_HANDLE.set(segment, 0L, shaderUniformBufferArrayDynamicIndexing);
    	return this;
    }
    
    public int shaderUniformBufferArrayDynamicIndexing() {
    	return (int) SHADER_UNIFORM_BUFFER_ARRAY_DYNAMIC_INDEXING_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderSampledImageArrayDynamicIndexing()
    public VkPhysicalDeviceFeatures shaderSampledImageArrayDynamicIndexing(int shaderSampledImageArrayDynamicIndexing) {
    	SHADER_SAMPLED_IMAGE_ARRAY_DYNAMIC_INDEXING_HANDLE.set(segment, 0L, shaderSampledImageArrayDynamicIndexing);
    	return this;
    }
    
    public int shaderSampledImageArrayDynamicIndexing() {
    	return (int) SHADER_SAMPLED_IMAGE_ARRAY_DYNAMIC_INDEXING_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderStorageBufferArrayDynamicIndexing()
    public VkPhysicalDeviceFeatures shaderStorageBufferArrayDynamicIndexing(int shaderStorageBufferArrayDynamicIndexing) {
    	SHADER_STORAGE_BUFFER_ARRAY_DYNAMIC_INDEXING_HANDLE.set(segment, 0L, shaderStorageBufferArrayDynamicIndexing);
    	return this;
    }
    
    public int shaderStorageBufferArrayDynamicIndexing() {
    	return (int) SHADER_STORAGE_BUFFER_ARRAY_DYNAMIC_INDEXING_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderStorageImageArrayDynamicIndexing()
    public VkPhysicalDeviceFeatures shaderStorageImageArrayDynamicIndexing(int shaderStorageImageArrayDynamicIndexing) {
    	SHADER_STORAGE_IMAGE_ARRAY_DYNAMIC_INDEXING_HANDLE.set(segment, 0L, shaderStorageImageArrayDynamicIndexing);
    	return this;
    }
    
    public int shaderStorageImageArrayDynamicIndexing() {
    	return (int) SHADER_STORAGE_IMAGE_ARRAY_DYNAMIC_INDEXING_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderClipDistance()
    public VkPhysicalDeviceFeatures shaderClipDistance(int shaderClipDistance) {
    	SHADER_CLIP_DISTANCE_HANDLE.set(segment, 0L, shaderClipDistance);
    	return this;
    }
    
    public int shaderClipDistance() {
    	return (int) SHADER_CLIP_DISTANCE_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderCullDistance()
    public VkPhysicalDeviceFeatures shaderCullDistance(int shaderCullDistance) {
    	SHADER_CULL_DISTANCE_HANDLE.set(segment, 0L, shaderCullDistance);
    	return this;
    }
    
    public int shaderCullDistance() {
    	return (int) SHADER_CULL_DISTANCE_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderFloat64()
    public VkPhysicalDeviceFeatures shaderFloat64(int shaderFloat64) {
    	SHADER_FLOAT64_HANDLE.set(segment, 0L, shaderFloat64);
    	return this;
    }
    
    public int shaderFloat64() {
    	return (int) SHADER_FLOAT64_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderInt64()
    public VkPhysicalDeviceFeatures shaderInt64(int shaderInt64) {
    	SHADER_INT64_HANDLE.set(segment, 0L, shaderInt64);
    	return this;
    }
    
    public int shaderInt64() {
    	return (int) SHADER_INT64_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderInt16()
    public VkPhysicalDeviceFeatures shaderInt16(int shaderInt16) {
    	SHADER_INT16_HANDLE.set(segment, 0L, shaderInt16);
    	return this;
    }
    
    public int shaderInt16() {
    	return (int) SHADER_INT16_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderResourceResidency()
    public VkPhysicalDeviceFeatures shaderResourceResidency(int shaderResourceResidency) {
    	SHADER_RESOURCE_RESIDENCY_HANDLE.set(segment, 0L, shaderResourceResidency);
    	return this;
    }
    
    public int shaderResourceResidency() {
    	return (int) SHADER_RESOURCE_RESIDENCY_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderResourceMinLod()
    public VkPhysicalDeviceFeatures shaderResourceMinLod(int shaderResourceMinLod) {
    	SHADER_RESOURCE_MIN_LOD_HANDLE.set(segment, 0L, shaderResourceMinLod);
    	return this;
    }
    
    public int shaderResourceMinLod() {
    	return (int) SHADER_RESOURCE_MIN_LOD_HANDLE.get(segment, 0L);
    }
    
    /// @see #sparseBinding()
    public VkPhysicalDeviceFeatures sparseBinding(int sparseBinding) {
    	SPARSE_BINDING_HANDLE.set(segment, 0L, sparseBinding);
    	return this;
    }
    
    public int sparseBinding() {
    	return (int) SPARSE_BINDING_HANDLE.get(segment, 0L);
    }
    
    /// @see #sparseResidencyBuffer()
    public VkPhysicalDeviceFeatures sparseResidencyBuffer(int sparseResidencyBuffer) {
    	SPARSE_RESIDENCY_BUFFER_HANDLE.set(segment, 0L, sparseResidencyBuffer);
    	return this;
    }
    
    public int sparseResidencyBuffer() {
    	return (int) SPARSE_RESIDENCY_BUFFER_HANDLE.get(segment, 0L);
    }
    
    /// @see #sparseResidencyImage2D()
    public VkPhysicalDeviceFeatures sparseResidencyImage2D(int sparseResidencyImage2D) {
    	SPARSE_RESIDENCY_IMAGE2_D_HANDLE.set(segment, 0L, sparseResidencyImage2D);
    	return this;
    }
    
    public int sparseResidencyImage2D() {
    	return (int) SPARSE_RESIDENCY_IMAGE2_D_HANDLE.get(segment, 0L);
    }
    
    /// @see #sparseResidencyImage3D()
    public VkPhysicalDeviceFeatures sparseResidencyImage3D(int sparseResidencyImage3D) {
    	SPARSE_RESIDENCY_IMAGE3_D_HANDLE.set(segment, 0L, sparseResidencyImage3D);
    	return this;
    }
    
    public int sparseResidencyImage3D() {
    	return (int) SPARSE_RESIDENCY_IMAGE3_D_HANDLE.get(segment, 0L);
    }
    
    /// @see #sparseResidency2Samples()
    public VkPhysicalDeviceFeatures sparseResidency2Samples(int sparseResidency2Samples) {
    	SPARSE_RESIDENCY2_SAMPLES_HANDLE.set(segment, 0L, sparseResidency2Samples);
    	return this;
    }
    
    public int sparseResidency2Samples() {
    	return (int) SPARSE_RESIDENCY2_SAMPLES_HANDLE.get(segment, 0L);
    }
    
    /// @see #sparseResidency4Samples()
    public VkPhysicalDeviceFeatures sparseResidency4Samples(int sparseResidency4Samples) {
    	SPARSE_RESIDENCY4_SAMPLES_HANDLE.set(segment, 0L, sparseResidency4Samples);
    	return this;
    }
    
    public int sparseResidency4Samples() {
    	return (int) SPARSE_RESIDENCY4_SAMPLES_HANDLE.get(segment, 0L);
    }
    
    /// @see #sparseResidency8Samples()
    public VkPhysicalDeviceFeatures sparseResidency8Samples(int sparseResidency8Samples) {
    	SPARSE_RESIDENCY8_SAMPLES_HANDLE.set(segment, 0L, sparseResidency8Samples);
    	return this;
    }
    
    public int sparseResidency8Samples() {
    	return (int) SPARSE_RESIDENCY8_SAMPLES_HANDLE.get(segment, 0L);
    }
    
    /// @see #sparseResidency16Samples()
    public VkPhysicalDeviceFeatures sparseResidency16Samples(int sparseResidency16Samples) {
    	SPARSE_RESIDENCY16_SAMPLES_HANDLE.set(segment, 0L, sparseResidency16Samples);
    	return this;
    }
    
    public int sparseResidency16Samples() {
    	return (int) SPARSE_RESIDENCY16_SAMPLES_HANDLE.get(segment, 0L);
    }
    
    /// @see #sparseResidencyAliased()
    public VkPhysicalDeviceFeatures sparseResidencyAliased(int sparseResidencyAliased) {
    	SPARSE_RESIDENCY_ALIASED_HANDLE.set(segment, 0L, sparseResidencyAliased);
    	return this;
    }
    
    public int sparseResidencyAliased() {
    	return (int) SPARSE_RESIDENCY_ALIASED_HANDLE.get(segment, 0L);
    }
    
    /// @see #variableMultisampleRate()
    public VkPhysicalDeviceFeatures variableMultisampleRate(int variableMultisampleRate) {
    	VARIABLE_MULTISAMPLE_RATE_HANDLE.set(segment, 0L, variableMultisampleRate);
    	return this;
    }
    
    public int variableMultisampleRate() {
    	return (int) VARIABLE_MULTISAMPLE_RATE_HANDLE.get(segment, 0L);
    }
    
    /// @see #inheritedQueries()
    public VkPhysicalDeviceFeatures inheritedQueries(int inheritedQueries) {
    	INHERITED_QUERIES_HANDLE.set(segment, 0L, inheritedQueries);
    	return this;
    }
    
    public int inheritedQueries() {
    	return (int) INHERITED_QUERIES_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceFeatures set(VkPhysicalDeviceFeatures other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceFeatures set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceFeatures> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceFeatures> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceFeatures(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceFeatures> array(Arena arena, VkPhysicalDeviceFeatures... structs) {
        NativeStructArray<VkPhysicalDeviceFeatures> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceFeatures(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceFeatures> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceFeatures(segment)
        );
    }
    
}