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
import volucris.bindings.core.NativeIntArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkPhysicalDeviceVulkan14Properties
		implements Struct<VkPhysicalDeviceVulkan14Properties> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle LINE_SUB_PIXEL_PRECISION_BITS_HANDLE;
	public static final VarHandle MAX_VERTEX_ATTRIB_DIVISOR_HANDLE;
	public static final VarHandle SUPPORTS_NON_ZERO_FIRST_INSTANCE_HANDLE;
	public static final VarHandle MAX_PUSH_DESCRIPTORS_HANDLE;
	public static final VarHandle DYNAMIC_RENDERING_LOCAL_READ_DEPTH_STENCIL_ATTACHMENTS_HANDLE;
	public static final VarHandle DYNAMIC_RENDERING_LOCAL_READ_MULTISAMPLED_ATTACHMENTS_HANDLE;
	public static final VarHandle EARLY_FRAGMENT_MULTISAMPLE_COVERAGE_AFTER_SAMPLE_COUNTING_HANDLE;
	public static final VarHandle EARLY_FRAGMENT_SAMPLE_MASK_TEST_BEFORE_SAMPLE_COUNTING_HANDLE;
	public static final VarHandle DEPTH_STENCIL_SWIZZLE_ONE_SUPPORT_HANDLE;
	public static final VarHandle POLYGON_MODE_POINT_SIZE_HANDLE;
	public static final VarHandle NON_STRICT_SINGLE_PIXEL_WIDE_LINES_USE_PARALLELOGRAM_HANDLE;
	public static final VarHandle NON_STRICT_WIDE_LINES_USE_PARALLELOGRAM_HANDLE;
	public static final VarHandle BLOCK_TEXEL_VIEW_COMPATIBLE_MULTIPLE_LAYERS_HANDLE;
	public static final VarHandle MAX_COMBINED_IMAGE_SAMPLER_DESCRIPTOR_COUNT_HANDLE;
	public static final VarHandle FRAGMENT_SHADING_RATE_CLAMP_COMBINER_INPUTS_HANDLE;
	public static final VarHandle DEFAULT_ROBUSTNESS_STORAGE_BUFFERS_HANDLE;
	public static final VarHandle DEFAULT_ROBUSTNESS_UNIFORM_BUFFERS_HANDLE;
	public static final VarHandle DEFAULT_ROBUSTNESS_VERTEX_INPUTS_HANDLE;
	public static final VarHandle DEFAULT_ROBUSTNESS_IMAGES_HANDLE;
	public static final VarHandle COPY_SRC_LAYOUT_COUNT_HANDLE;
	public static final VarHandle P_COPY_SRC_LAYOUTS_HANDLE;
	public static final VarHandle COPY_DST_LAYOUT_COUNT_HANDLE;
	public static final VarHandle P_COPY_DST_LAYOUTS_HANDLE;
	public static final VarHandle OPTIMAL_TILING_LAYOUT_UUID_HANDLE;
	public static final VarHandle IDENTICAL_MEMORY_TYPE_REQUIREMENTS_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long LINE_SUB_PIXEL_PRECISION_BITS_BYTE_OFFSET;
	public static final long MAX_VERTEX_ATTRIB_DIVISOR_BYTE_OFFSET;
	public static final long SUPPORTS_NON_ZERO_FIRST_INSTANCE_BYTE_OFFSET;
	public static final long MAX_PUSH_DESCRIPTORS_BYTE_OFFSET;
	public static final long DYNAMIC_RENDERING_LOCAL_READ_DEPTH_STENCIL_ATTACHMENTS_BYTE_OFFSET;
	public static final long DYNAMIC_RENDERING_LOCAL_READ_MULTISAMPLED_ATTACHMENTS_BYTE_OFFSET;
	public static final long EARLY_FRAGMENT_MULTISAMPLE_COVERAGE_AFTER_SAMPLE_COUNTING_BYTE_OFFSET;
	public static final long EARLY_FRAGMENT_SAMPLE_MASK_TEST_BEFORE_SAMPLE_COUNTING_BYTE_OFFSET;
	public static final long DEPTH_STENCIL_SWIZZLE_ONE_SUPPORT_BYTE_OFFSET;
	public static final long POLYGON_MODE_POINT_SIZE_BYTE_OFFSET;
	public static final long NON_STRICT_SINGLE_PIXEL_WIDE_LINES_USE_PARALLELOGRAM_BYTE_OFFSET;
	public static final long NON_STRICT_WIDE_LINES_USE_PARALLELOGRAM_BYTE_OFFSET;
	public static final long BLOCK_TEXEL_VIEW_COMPATIBLE_MULTIPLE_LAYERS_BYTE_OFFSET;
	public static final long MAX_COMBINED_IMAGE_SAMPLER_DESCRIPTOR_COUNT_BYTE_OFFSET;
	public static final long FRAGMENT_SHADING_RATE_CLAMP_COMBINER_INPUTS_BYTE_OFFSET;
	public static final long DEFAULT_ROBUSTNESS_STORAGE_BUFFERS_BYTE_OFFSET;
	public static final long DEFAULT_ROBUSTNESS_UNIFORM_BUFFERS_BYTE_OFFSET;
	public static final long DEFAULT_ROBUSTNESS_VERTEX_INPUTS_BYTE_OFFSET;
	public static final long DEFAULT_ROBUSTNESS_IMAGES_BYTE_OFFSET;
	public static final long COPY_SRC_LAYOUT_COUNT_BYTE_OFFSET;
	public static final long P_COPY_SRC_LAYOUTS_BYTE_OFFSET;
	public static final long COPY_DST_LAYOUT_COUNT_BYTE_OFFSET;
	public static final long P_COPY_DST_LAYOUTS_BYTE_OFFSET;
	public static final long OPTIMAL_TILING_LAYOUT_UUID_BYTE_OFFSET;
	public static final long IDENTICAL_MEMORY_TYPE_REQUIREMENTS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("lineSubPixelPrecisionBits"),
		    JAVA_INT.withName("maxVertexAttribDivisor"),
		    JAVA_INT.withName("supportsNonZeroFirstInstance"),
		    JAVA_INT.withName("maxPushDescriptors"),
		    JAVA_INT.withName("dynamicRenderingLocalReadDepthStencilAttachments"),
		    JAVA_INT.withName("dynamicRenderingLocalReadMultisampledAttachments"),
		    JAVA_INT.withName("earlyFragmentMultisampleCoverageAfterSampleCounting"),
		    JAVA_INT.withName("earlyFragmentSampleMaskTestBeforeSampleCounting"),
		    JAVA_INT.withName("depthStencilSwizzleOneSupport"),
		    JAVA_INT.withName("polygonModePointSize"),
		    JAVA_INT.withName("nonStrictSinglePixelWideLinesUseParallelogram"),
		    JAVA_INT.withName("nonStrictWideLinesUseParallelogram"),
		    JAVA_INT.withName("blockTexelViewCompatibleMultipleLayers"),
		    JAVA_INT.withName("maxCombinedImageSamplerDescriptorCount"),
		    JAVA_INT.withName("fragmentShadingRateClampCombinerInputs"),
		    JAVA_INT.withName("defaultRobustnessStorageBuffers"),
		    JAVA_INT.withName("defaultRobustnessUniformBuffers"),
		    JAVA_INT.withName("defaultRobustnessVertexInputs"),
		    JAVA_INT.withName("defaultRobustnessImages"),
		    JAVA_INT.withName("copySrcLayoutCount"),
		    UNBOUNDED_ADDRESS.withName("pCopySrcLayouts"),
		    JAVA_INT.withName("copyDstLayoutCount"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pCopyDstLayouts"),
		    MemoryLayout.sequenceLayout(16, JAVA_BYTE).withName("optimalTilingLayoutUUID"),
		    JAVA_INT.withName("identicalMemoryTypeRequirements"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPhysicalDeviceVulkan14Properties").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		LINE_SUB_PIXEL_PRECISION_BITS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("lineSubPixelPrecisionBits"));
		MAX_VERTEX_ATTRIB_DIVISOR_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxVertexAttribDivisor"));
		SUPPORTS_NON_ZERO_FIRST_INSTANCE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("supportsNonZeroFirstInstance"));
		MAX_PUSH_DESCRIPTORS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxPushDescriptors"));
		DYNAMIC_RENDERING_LOCAL_READ_DEPTH_STENCIL_ATTACHMENTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("dynamicRenderingLocalReadDepthStencilAttachments"));
		DYNAMIC_RENDERING_LOCAL_READ_MULTISAMPLED_ATTACHMENTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("dynamicRenderingLocalReadMultisampledAttachments"));
		EARLY_FRAGMENT_MULTISAMPLE_COVERAGE_AFTER_SAMPLE_COUNTING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("earlyFragmentMultisampleCoverageAfterSampleCounting"));
		EARLY_FRAGMENT_SAMPLE_MASK_TEST_BEFORE_SAMPLE_COUNTING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("earlyFragmentSampleMaskTestBeforeSampleCounting"));
		DEPTH_STENCIL_SWIZZLE_ONE_SUPPORT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("depthStencilSwizzleOneSupport"));
		POLYGON_MODE_POINT_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("polygonModePointSize"));
		NON_STRICT_SINGLE_PIXEL_WIDE_LINES_USE_PARALLELOGRAM_HANDLE = LAYOUT.varHandle(PathElement.groupElement("nonStrictSinglePixelWideLinesUseParallelogram"));
		NON_STRICT_WIDE_LINES_USE_PARALLELOGRAM_HANDLE = LAYOUT.varHandle(PathElement.groupElement("nonStrictWideLinesUseParallelogram"));
		BLOCK_TEXEL_VIEW_COMPATIBLE_MULTIPLE_LAYERS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("blockTexelViewCompatibleMultipleLayers"));
		MAX_COMBINED_IMAGE_SAMPLER_DESCRIPTOR_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxCombinedImageSamplerDescriptorCount"));
		FRAGMENT_SHADING_RATE_CLAMP_COMBINER_INPUTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("fragmentShadingRateClampCombinerInputs"));
		DEFAULT_ROBUSTNESS_STORAGE_BUFFERS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("defaultRobustnessStorageBuffers"));
		DEFAULT_ROBUSTNESS_UNIFORM_BUFFERS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("defaultRobustnessUniformBuffers"));
		DEFAULT_ROBUSTNESS_VERTEX_INPUTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("defaultRobustnessVertexInputs"));
		DEFAULT_ROBUSTNESS_IMAGES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("defaultRobustnessImages"));
		COPY_SRC_LAYOUT_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("copySrcLayoutCount"));
		P_COPY_SRC_LAYOUTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pCopySrcLayouts"));
		COPY_DST_LAYOUT_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("copyDstLayoutCount"));
		P_COPY_DST_LAYOUTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pCopyDstLayouts"));
		OPTIMAL_TILING_LAYOUT_UUID_HANDLE = LAYOUT.varHandle(PathElement.groupElement("optimalTilingLayoutUUID"), PathElement.sequenceElement());
		IDENTICAL_MEMORY_TYPE_REQUIREMENTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("identicalMemoryTypeRequirements"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		LINE_SUB_PIXEL_PRECISION_BITS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("lineSubPixelPrecisionBits"));
		MAX_VERTEX_ATTRIB_DIVISOR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxVertexAttribDivisor"));
		SUPPORTS_NON_ZERO_FIRST_INSTANCE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("supportsNonZeroFirstInstance"));
		MAX_PUSH_DESCRIPTORS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxPushDescriptors"));
		DYNAMIC_RENDERING_LOCAL_READ_DEPTH_STENCIL_ATTACHMENTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dynamicRenderingLocalReadDepthStencilAttachments"));
		DYNAMIC_RENDERING_LOCAL_READ_MULTISAMPLED_ATTACHMENTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dynamicRenderingLocalReadMultisampledAttachments"));
		EARLY_FRAGMENT_MULTISAMPLE_COVERAGE_AFTER_SAMPLE_COUNTING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("earlyFragmentMultisampleCoverageAfterSampleCounting"));
		EARLY_FRAGMENT_SAMPLE_MASK_TEST_BEFORE_SAMPLE_COUNTING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("earlyFragmentSampleMaskTestBeforeSampleCounting"));
		DEPTH_STENCIL_SWIZZLE_ONE_SUPPORT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("depthStencilSwizzleOneSupport"));
		POLYGON_MODE_POINT_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("polygonModePointSize"));
		NON_STRICT_SINGLE_PIXEL_WIDE_LINES_USE_PARALLELOGRAM_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("nonStrictSinglePixelWideLinesUseParallelogram"));
		NON_STRICT_WIDE_LINES_USE_PARALLELOGRAM_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("nonStrictWideLinesUseParallelogram"));
		BLOCK_TEXEL_VIEW_COMPATIBLE_MULTIPLE_LAYERS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("blockTexelViewCompatibleMultipleLayers"));
		MAX_COMBINED_IMAGE_SAMPLER_DESCRIPTOR_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxCombinedImageSamplerDescriptorCount"));
		FRAGMENT_SHADING_RATE_CLAMP_COMBINER_INPUTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("fragmentShadingRateClampCombinerInputs"));
		DEFAULT_ROBUSTNESS_STORAGE_BUFFERS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("defaultRobustnessStorageBuffers"));
		DEFAULT_ROBUSTNESS_UNIFORM_BUFFERS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("defaultRobustnessUniformBuffers"));
		DEFAULT_ROBUSTNESS_VERTEX_INPUTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("defaultRobustnessVertexInputs"));
		DEFAULT_ROBUSTNESS_IMAGES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("defaultRobustnessImages"));
		COPY_SRC_LAYOUT_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("copySrcLayoutCount"));
		P_COPY_SRC_LAYOUTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pCopySrcLayouts"));
		COPY_DST_LAYOUT_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("copyDstLayoutCount"));
		P_COPY_DST_LAYOUTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pCopyDstLayouts"));
		OPTIMAL_TILING_LAYOUT_UUID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("optimalTilingLayoutUUID"));
		IDENTICAL_MEMORY_TYPE_REQUIREMENTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("identicalMemoryTypeRequirements"));
		//@formatter:on
	}

	public VkPhysicalDeviceVulkan14Properties() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceVulkan14Properties(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceVulkan14Properties(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceVulkan14Properties sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceVulkan14Properties pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #lineSubPixelPrecisionBits()
    public VkPhysicalDeviceVulkan14Properties lineSubPixelPrecisionBits(int lineSubPixelPrecisionBits) {
    	LINE_SUB_PIXEL_PRECISION_BITS_HANDLE.set(segment, 0L, lineSubPixelPrecisionBits);
    	return this;
    }
    
    public int lineSubPixelPrecisionBits() {
    	return (int) LINE_SUB_PIXEL_PRECISION_BITS_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxVertexAttribDivisor()
    public VkPhysicalDeviceVulkan14Properties maxVertexAttribDivisor(int maxVertexAttribDivisor) {
    	MAX_VERTEX_ATTRIB_DIVISOR_HANDLE.set(segment, 0L, maxVertexAttribDivisor);
    	return this;
    }
    
    public int maxVertexAttribDivisor() {
    	return (int) MAX_VERTEX_ATTRIB_DIVISOR_HANDLE.get(segment, 0L);
    }
    
    /// @see #supportsNonZeroFirstInstance()
    public VkPhysicalDeviceVulkan14Properties supportsNonZeroFirstInstance(int supportsNonZeroFirstInstance) {
    	SUPPORTS_NON_ZERO_FIRST_INSTANCE_HANDLE.set(segment, 0L, supportsNonZeroFirstInstance);
    	return this;
    }
    
    public int supportsNonZeroFirstInstance() {
    	return (int) SUPPORTS_NON_ZERO_FIRST_INSTANCE_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxPushDescriptors()
    public VkPhysicalDeviceVulkan14Properties maxPushDescriptors(int maxPushDescriptors) {
    	MAX_PUSH_DESCRIPTORS_HANDLE.set(segment, 0L, maxPushDescriptors);
    	return this;
    }
    
    public int maxPushDescriptors() {
    	return (int) MAX_PUSH_DESCRIPTORS_HANDLE.get(segment, 0L);
    }
    
    /// @see #dynamicRenderingLocalReadDepthStencilAttachments()
    public VkPhysicalDeviceVulkan14Properties dynamicRenderingLocalReadDepthStencilAttachments(int dynamicRenderingLocalReadDepthStencilAttachments) {
    	DYNAMIC_RENDERING_LOCAL_READ_DEPTH_STENCIL_ATTACHMENTS_HANDLE.set(segment, 0L, dynamicRenderingLocalReadDepthStencilAttachments);
    	return this;
    }
    
    public int dynamicRenderingLocalReadDepthStencilAttachments() {
    	return (int) DYNAMIC_RENDERING_LOCAL_READ_DEPTH_STENCIL_ATTACHMENTS_HANDLE.get(segment, 0L);
    }
    
    /// @see #dynamicRenderingLocalReadMultisampledAttachments()
    public VkPhysicalDeviceVulkan14Properties dynamicRenderingLocalReadMultisampledAttachments(int dynamicRenderingLocalReadMultisampledAttachments) {
    	DYNAMIC_RENDERING_LOCAL_READ_MULTISAMPLED_ATTACHMENTS_HANDLE.set(segment, 0L, dynamicRenderingLocalReadMultisampledAttachments);
    	return this;
    }
    
    public int dynamicRenderingLocalReadMultisampledAttachments() {
    	return (int) DYNAMIC_RENDERING_LOCAL_READ_MULTISAMPLED_ATTACHMENTS_HANDLE.get(segment, 0L);
    }
    
    /// @see #earlyFragmentMultisampleCoverageAfterSampleCounting()
    public VkPhysicalDeviceVulkan14Properties earlyFragmentMultisampleCoverageAfterSampleCounting(int earlyFragmentMultisampleCoverageAfterSampleCounting) {
    	EARLY_FRAGMENT_MULTISAMPLE_COVERAGE_AFTER_SAMPLE_COUNTING_HANDLE.set(segment, 0L, earlyFragmentMultisampleCoverageAfterSampleCounting);
    	return this;
    }
    
    public int earlyFragmentMultisampleCoverageAfterSampleCounting() {
    	return (int) EARLY_FRAGMENT_MULTISAMPLE_COVERAGE_AFTER_SAMPLE_COUNTING_HANDLE.get(segment, 0L);
    }
    
    /// @see #earlyFragmentSampleMaskTestBeforeSampleCounting()
    public VkPhysicalDeviceVulkan14Properties earlyFragmentSampleMaskTestBeforeSampleCounting(int earlyFragmentSampleMaskTestBeforeSampleCounting) {
    	EARLY_FRAGMENT_SAMPLE_MASK_TEST_BEFORE_SAMPLE_COUNTING_HANDLE.set(segment, 0L, earlyFragmentSampleMaskTestBeforeSampleCounting);
    	return this;
    }
    
    public int earlyFragmentSampleMaskTestBeforeSampleCounting() {
    	return (int) EARLY_FRAGMENT_SAMPLE_MASK_TEST_BEFORE_SAMPLE_COUNTING_HANDLE.get(segment, 0L);
    }
    
    /// @see #depthStencilSwizzleOneSupport()
    public VkPhysicalDeviceVulkan14Properties depthStencilSwizzleOneSupport(int depthStencilSwizzleOneSupport) {
    	DEPTH_STENCIL_SWIZZLE_ONE_SUPPORT_HANDLE.set(segment, 0L, depthStencilSwizzleOneSupport);
    	return this;
    }
    
    public int depthStencilSwizzleOneSupport() {
    	return (int) DEPTH_STENCIL_SWIZZLE_ONE_SUPPORT_HANDLE.get(segment, 0L);
    }
    
    /// @see #polygonModePointSize()
    public VkPhysicalDeviceVulkan14Properties polygonModePointSize(int polygonModePointSize) {
    	POLYGON_MODE_POINT_SIZE_HANDLE.set(segment, 0L, polygonModePointSize);
    	return this;
    }
    
    public int polygonModePointSize() {
    	return (int) POLYGON_MODE_POINT_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #nonStrictSinglePixelWideLinesUseParallelogram()
    public VkPhysicalDeviceVulkan14Properties nonStrictSinglePixelWideLinesUseParallelogram(int nonStrictSinglePixelWideLinesUseParallelogram) {
    	NON_STRICT_SINGLE_PIXEL_WIDE_LINES_USE_PARALLELOGRAM_HANDLE.set(segment, 0L, nonStrictSinglePixelWideLinesUseParallelogram);
    	return this;
    }
    
    public int nonStrictSinglePixelWideLinesUseParallelogram() {
    	return (int) NON_STRICT_SINGLE_PIXEL_WIDE_LINES_USE_PARALLELOGRAM_HANDLE.get(segment, 0L);
    }
    
    /// @see #nonStrictWideLinesUseParallelogram()
    public VkPhysicalDeviceVulkan14Properties nonStrictWideLinesUseParallelogram(int nonStrictWideLinesUseParallelogram) {
    	NON_STRICT_WIDE_LINES_USE_PARALLELOGRAM_HANDLE.set(segment, 0L, nonStrictWideLinesUseParallelogram);
    	return this;
    }
    
    public int nonStrictWideLinesUseParallelogram() {
    	return (int) NON_STRICT_WIDE_LINES_USE_PARALLELOGRAM_HANDLE.get(segment, 0L);
    }
    
    /// @see #blockTexelViewCompatibleMultipleLayers()
    public VkPhysicalDeviceVulkan14Properties blockTexelViewCompatibleMultipleLayers(int blockTexelViewCompatibleMultipleLayers) {
    	BLOCK_TEXEL_VIEW_COMPATIBLE_MULTIPLE_LAYERS_HANDLE.set(segment, 0L, blockTexelViewCompatibleMultipleLayers);
    	return this;
    }
    
    public int blockTexelViewCompatibleMultipleLayers() {
    	return (int) BLOCK_TEXEL_VIEW_COMPATIBLE_MULTIPLE_LAYERS_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxCombinedImageSamplerDescriptorCount()
    public VkPhysicalDeviceVulkan14Properties maxCombinedImageSamplerDescriptorCount(int maxCombinedImageSamplerDescriptorCount) {
    	MAX_COMBINED_IMAGE_SAMPLER_DESCRIPTOR_COUNT_HANDLE.set(segment, 0L, maxCombinedImageSamplerDescriptorCount);
    	return this;
    }
    
    public int maxCombinedImageSamplerDescriptorCount() {
    	return (int) MAX_COMBINED_IMAGE_SAMPLER_DESCRIPTOR_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #fragmentShadingRateClampCombinerInputs()
    public VkPhysicalDeviceVulkan14Properties fragmentShadingRateClampCombinerInputs(int fragmentShadingRateClampCombinerInputs) {
    	FRAGMENT_SHADING_RATE_CLAMP_COMBINER_INPUTS_HANDLE.set(segment, 0L, fragmentShadingRateClampCombinerInputs);
    	return this;
    }
    
    public int fragmentShadingRateClampCombinerInputs() {
    	return (int) FRAGMENT_SHADING_RATE_CLAMP_COMBINER_INPUTS_HANDLE.get(segment, 0L);
    }
    
    /// @see #defaultRobustnessStorageBuffers()
    public VkPhysicalDeviceVulkan14Properties defaultRobustnessStorageBuffers(int defaultRobustnessStorageBuffers) {
    	DEFAULT_ROBUSTNESS_STORAGE_BUFFERS_HANDLE.set(segment, 0L, defaultRobustnessStorageBuffers);
    	return this;
    }
    
    public int defaultRobustnessStorageBuffers() {
    	return (int) DEFAULT_ROBUSTNESS_STORAGE_BUFFERS_HANDLE.get(segment, 0L);
    }
    
    /// @see #defaultRobustnessUniformBuffers()
    public VkPhysicalDeviceVulkan14Properties defaultRobustnessUniformBuffers(int defaultRobustnessUniformBuffers) {
    	DEFAULT_ROBUSTNESS_UNIFORM_BUFFERS_HANDLE.set(segment, 0L, defaultRobustnessUniformBuffers);
    	return this;
    }
    
    public int defaultRobustnessUniformBuffers() {
    	return (int) DEFAULT_ROBUSTNESS_UNIFORM_BUFFERS_HANDLE.get(segment, 0L);
    }
    
    /// @see #defaultRobustnessVertexInputs()
    public VkPhysicalDeviceVulkan14Properties defaultRobustnessVertexInputs(int defaultRobustnessVertexInputs) {
    	DEFAULT_ROBUSTNESS_VERTEX_INPUTS_HANDLE.set(segment, 0L, defaultRobustnessVertexInputs);
    	return this;
    }
    
    public int defaultRobustnessVertexInputs() {
    	return (int) DEFAULT_ROBUSTNESS_VERTEX_INPUTS_HANDLE.get(segment, 0L);
    }
    
    /// @see #defaultRobustnessImages()
    public VkPhysicalDeviceVulkan14Properties defaultRobustnessImages(int defaultRobustnessImages) {
    	DEFAULT_ROBUSTNESS_IMAGES_HANDLE.set(segment, 0L, defaultRobustnessImages);
    	return this;
    }
    
    public int defaultRobustnessImages() {
    	return (int) DEFAULT_ROBUSTNESS_IMAGES_HANDLE.get(segment, 0L);
    }
    
    /// @see #copySrcLayoutCount()
    public VkPhysicalDeviceVulkan14Properties copySrcLayoutCount(int copySrcLayoutCount) {
    	COPY_SRC_LAYOUT_COUNT_HANDLE.set(segment, 0L, copySrcLayoutCount);
    	return this;
    }
    
    public int copySrcLayoutCount() {
    	return (int) COPY_SRC_LAYOUT_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pCopySrcLayouts()
    public VkPhysicalDeviceVulkan14Properties pCopySrcLayouts(NativeIntArray pCopySrcLayouts) {
    	P_COPY_SRC_LAYOUTS_HANDLE.set(segment, 0L, pCopySrcLayouts.memorySegment());
    	return this;
    }
    
    public @Nullable NativeIntArray pCopySrcLayouts() {
    	MemorySegment segment = (MemorySegment) P_COPY_SRC_LAYOUTS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeIntArray(segment);
    }
    
    /// @see #copyDstLayoutCount()
    public VkPhysicalDeviceVulkan14Properties copyDstLayoutCount(int copyDstLayoutCount) {
    	COPY_DST_LAYOUT_COUNT_HANDLE.set(segment, 0L, copyDstLayoutCount);
    	return this;
    }
    
    public int copyDstLayoutCount() {
    	return (int) COPY_DST_LAYOUT_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pCopyDstLayouts()
    public VkPhysicalDeviceVulkan14Properties pCopyDstLayouts(NativeIntArray pCopyDstLayouts) {
    	P_COPY_DST_LAYOUTS_HANDLE.set(segment, 0L, pCopyDstLayouts.memorySegment());
    	return this;
    }
    
    public @Nullable NativeIntArray pCopyDstLayouts() {
    	MemorySegment segment = (MemorySegment) P_COPY_DST_LAYOUTS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeIntArray(segment);
    }
    
    /// @see #optimalTilingLayoutUUID(int)
    public VkPhysicalDeviceVulkan14Properties optimalTilingLayoutUUID(byte optimalTilingLayoutUUID, int index0) {
    	OPTIMAL_TILING_LAYOUT_UUID_HANDLE.set(segment, 0L, index0, optimalTilingLayoutUUID);
    	return this;
    }
    
    public byte optimalTilingLayoutUUID(int index0) {
    	return (byte) OPTIMAL_TILING_LAYOUT_UUID_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #identicalMemoryTypeRequirements()
    public VkPhysicalDeviceVulkan14Properties identicalMemoryTypeRequirements(int identicalMemoryTypeRequirements) {
    	IDENTICAL_MEMORY_TYPE_REQUIREMENTS_HANDLE.set(segment, 0L, identicalMemoryTypeRequirements);
    	return this;
    }
    
    public int identicalMemoryTypeRequirements() {
    	return (int) IDENTICAL_MEMORY_TYPE_REQUIREMENTS_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceVulkan14Properties set(VkPhysicalDeviceVulkan14Properties other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceVulkan14Properties set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceVulkan14Properties> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceVulkan14Properties> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceVulkan14Properties(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceVulkan14Properties> array(SegmentAllocator allocator, VkPhysicalDeviceVulkan14Properties... structs) {
        NativeStructArray<VkPhysicalDeviceVulkan14Properties> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceVulkan14Properties(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceVulkan14Properties> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceVulkan14Properties(segment)
        );
    }

}