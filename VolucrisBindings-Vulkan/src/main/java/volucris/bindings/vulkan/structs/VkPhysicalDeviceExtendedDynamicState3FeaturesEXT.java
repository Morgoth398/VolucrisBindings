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

public final class VkPhysicalDeviceExtendedDynamicState3FeaturesEXT
		implements Struct<VkPhysicalDeviceExtendedDynamicState3FeaturesEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle EXTENDED_DYNAMIC_STATE3_TESSELLATION_DOMAIN_ORIGIN_HANDLE;
	public static final VarHandle EXTENDED_DYNAMIC_STATE3_DEPTH_CLAMP_ENABLE_HANDLE;
	public static final VarHandle EXTENDED_DYNAMIC_STATE3_POLYGON_MODE_HANDLE;
	public static final VarHandle EXTENDED_DYNAMIC_STATE3_RASTERIZATION_SAMPLES_HANDLE;
	public static final VarHandle EXTENDED_DYNAMIC_STATE3_SAMPLE_MASK_HANDLE;
	public static final VarHandle EXTENDED_DYNAMIC_STATE3_ALPHA_TO_COVERAGE_ENABLE_HANDLE;
	public static final VarHandle EXTENDED_DYNAMIC_STATE3_ALPHA_TO_ONE_ENABLE_HANDLE;
	public static final VarHandle EXTENDED_DYNAMIC_STATE3_LOGIC_OP_ENABLE_HANDLE;
	public static final VarHandle EXTENDED_DYNAMIC_STATE3_COLOR_BLEND_ENABLE_HANDLE;
	public static final VarHandle EXTENDED_DYNAMIC_STATE3_COLOR_BLEND_EQUATION_HANDLE;
	public static final VarHandle EXTENDED_DYNAMIC_STATE3_COLOR_WRITE_MASK_HANDLE;
	public static final VarHandle EXTENDED_DYNAMIC_STATE3_RASTERIZATION_STREAM_HANDLE;
	public static final VarHandle EXTENDED_DYNAMIC_STATE3_CONSERVATIVE_RASTERIZATION_MODE_HANDLE;
	public static final VarHandle EXTENDED_DYNAMIC_STATE3_EXTRA_PRIMITIVE_OVERESTIMATION_SIZE_HANDLE;
	public static final VarHandle EXTENDED_DYNAMIC_STATE3_DEPTH_CLIP_ENABLE_HANDLE;
	public static final VarHandle EXTENDED_DYNAMIC_STATE3_SAMPLE_LOCATIONS_ENABLE_HANDLE;
	public static final VarHandle EXTENDED_DYNAMIC_STATE3_COLOR_BLEND_ADVANCED_HANDLE;
	public static final VarHandle EXTENDED_DYNAMIC_STATE3_PROVOKING_VERTEX_MODE_HANDLE;
	public static final VarHandle EXTENDED_DYNAMIC_STATE3_LINE_RASTERIZATION_MODE_HANDLE;
	public static final VarHandle EXTENDED_DYNAMIC_STATE3_LINE_STIPPLE_ENABLE_HANDLE;
	public static final VarHandle EXTENDED_DYNAMIC_STATE3_DEPTH_CLIP_NEGATIVE_ONE_TO_ONE_HANDLE;
	public static final VarHandle EXTENDED_DYNAMIC_STATE3_VIEWPORT_WSCALING_ENABLE_HANDLE;
	public static final VarHandle EXTENDED_DYNAMIC_STATE3_VIEWPORT_SWIZZLE_HANDLE;
	public static final VarHandle EXTENDED_DYNAMIC_STATE3_COVERAGE_TO_COLOR_ENABLE_HANDLE;
	public static final VarHandle EXTENDED_DYNAMIC_STATE3_COVERAGE_TO_COLOR_LOCATION_HANDLE;
	public static final VarHandle EXTENDED_DYNAMIC_STATE3_COVERAGE_MODULATION_MODE_HANDLE;
	public static final VarHandle EXTENDED_DYNAMIC_STATE3_COVERAGE_MODULATION_TABLE_ENABLE_HANDLE;
	public static final VarHandle EXTENDED_DYNAMIC_STATE3_COVERAGE_MODULATION_TABLE_HANDLE;
	public static final VarHandle EXTENDED_DYNAMIC_STATE3_COVERAGE_REDUCTION_MODE_HANDLE;
	public static final VarHandle EXTENDED_DYNAMIC_STATE3_REPRESENTATIVE_FRAGMENT_TEST_ENABLE_HANDLE;
	public static final VarHandle EXTENDED_DYNAMIC_STATE3_SHADING_RATE_IMAGE_ENABLE_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long EXTENDED_DYNAMIC_STATE3_TESSELLATION_DOMAIN_ORIGIN_BYTE_OFFSET;
	public static final long EXTENDED_DYNAMIC_STATE3_DEPTH_CLAMP_ENABLE_BYTE_OFFSET;
	public static final long EXTENDED_DYNAMIC_STATE3_POLYGON_MODE_BYTE_OFFSET;
	public static final long EXTENDED_DYNAMIC_STATE3_RASTERIZATION_SAMPLES_BYTE_OFFSET;
	public static final long EXTENDED_DYNAMIC_STATE3_SAMPLE_MASK_BYTE_OFFSET;
	public static final long EXTENDED_DYNAMIC_STATE3_ALPHA_TO_COVERAGE_ENABLE_BYTE_OFFSET;
	public static final long EXTENDED_DYNAMIC_STATE3_ALPHA_TO_ONE_ENABLE_BYTE_OFFSET;
	public static final long EXTENDED_DYNAMIC_STATE3_LOGIC_OP_ENABLE_BYTE_OFFSET;
	public static final long EXTENDED_DYNAMIC_STATE3_COLOR_BLEND_ENABLE_BYTE_OFFSET;
	public static final long EXTENDED_DYNAMIC_STATE3_COLOR_BLEND_EQUATION_BYTE_OFFSET;
	public static final long EXTENDED_DYNAMIC_STATE3_COLOR_WRITE_MASK_BYTE_OFFSET;
	public static final long EXTENDED_DYNAMIC_STATE3_RASTERIZATION_STREAM_BYTE_OFFSET;
	public static final long EXTENDED_DYNAMIC_STATE3_CONSERVATIVE_RASTERIZATION_MODE_BYTE_OFFSET;
	public static final long EXTENDED_DYNAMIC_STATE3_EXTRA_PRIMITIVE_OVERESTIMATION_SIZE_BYTE_OFFSET;
	public static final long EXTENDED_DYNAMIC_STATE3_DEPTH_CLIP_ENABLE_BYTE_OFFSET;
	public static final long EXTENDED_DYNAMIC_STATE3_SAMPLE_LOCATIONS_ENABLE_BYTE_OFFSET;
	public static final long EXTENDED_DYNAMIC_STATE3_COLOR_BLEND_ADVANCED_BYTE_OFFSET;
	public static final long EXTENDED_DYNAMIC_STATE3_PROVOKING_VERTEX_MODE_BYTE_OFFSET;
	public static final long EXTENDED_DYNAMIC_STATE3_LINE_RASTERIZATION_MODE_BYTE_OFFSET;
	public static final long EXTENDED_DYNAMIC_STATE3_LINE_STIPPLE_ENABLE_BYTE_OFFSET;
	public static final long EXTENDED_DYNAMIC_STATE3_DEPTH_CLIP_NEGATIVE_ONE_TO_ONE_BYTE_OFFSET;
	public static final long EXTENDED_DYNAMIC_STATE3_VIEWPORT_WSCALING_ENABLE_BYTE_OFFSET;
	public static final long EXTENDED_DYNAMIC_STATE3_VIEWPORT_SWIZZLE_BYTE_OFFSET;
	public static final long EXTENDED_DYNAMIC_STATE3_COVERAGE_TO_COLOR_ENABLE_BYTE_OFFSET;
	public static final long EXTENDED_DYNAMIC_STATE3_COVERAGE_TO_COLOR_LOCATION_BYTE_OFFSET;
	public static final long EXTENDED_DYNAMIC_STATE3_COVERAGE_MODULATION_MODE_BYTE_OFFSET;
	public static final long EXTENDED_DYNAMIC_STATE3_COVERAGE_MODULATION_TABLE_ENABLE_BYTE_OFFSET;
	public static final long EXTENDED_DYNAMIC_STATE3_COVERAGE_MODULATION_TABLE_BYTE_OFFSET;
	public static final long EXTENDED_DYNAMIC_STATE3_COVERAGE_REDUCTION_MODE_BYTE_OFFSET;
	public static final long EXTENDED_DYNAMIC_STATE3_REPRESENTATIVE_FRAGMENT_TEST_ENABLE_BYTE_OFFSET;
	public static final long EXTENDED_DYNAMIC_STATE3_SHADING_RATE_IMAGE_ENABLE_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("extendedDynamicState3TessellationDomainOrigin"),
		    JAVA_INT.withName("extendedDynamicState3DepthClampEnable"),
		    JAVA_INT.withName("extendedDynamicState3PolygonMode"),
		    JAVA_INT.withName("extendedDynamicState3RasterizationSamples"),
		    JAVA_INT.withName("extendedDynamicState3SampleMask"),
		    JAVA_INT.withName("extendedDynamicState3AlphaToCoverageEnable"),
		    JAVA_INT.withName("extendedDynamicState3AlphaToOneEnable"),
		    JAVA_INT.withName("extendedDynamicState3LogicOpEnable"),
		    JAVA_INT.withName("extendedDynamicState3ColorBlendEnable"),
		    JAVA_INT.withName("extendedDynamicState3ColorBlendEquation"),
		    JAVA_INT.withName("extendedDynamicState3ColorWriteMask"),
		    JAVA_INT.withName("extendedDynamicState3RasterizationStream"),
		    JAVA_INT.withName("extendedDynamicState3ConservativeRasterizationMode"),
		    JAVA_INT.withName("extendedDynamicState3ExtraPrimitiveOverestimationSize"),
		    JAVA_INT.withName("extendedDynamicState3DepthClipEnable"),
		    JAVA_INT.withName("extendedDynamicState3SampleLocationsEnable"),
		    JAVA_INT.withName("extendedDynamicState3ColorBlendAdvanced"),
		    JAVA_INT.withName("extendedDynamicState3ProvokingVertexMode"),
		    JAVA_INT.withName("extendedDynamicState3LineRasterizationMode"),
		    JAVA_INT.withName("extendedDynamicState3LineStippleEnable"),
		    JAVA_INT.withName("extendedDynamicState3DepthClipNegativeOneToOne"),
		    JAVA_INT.withName("extendedDynamicState3ViewportWScalingEnable"),
		    JAVA_INT.withName("extendedDynamicState3ViewportSwizzle"),
		    JAVA_INT.withName("extendedDynamicState3CoverageToColorEnable"),
		    JAVA_INT.withName("extendedDynamicState3CoverageToColorLocation"),
		    JAVA_INT.withName("extendedDynamicState3CoverageModulationMode"),
		    JAVA_INT.withName("extendedDynamicState3CoverageModulationTableEnable"),
		    JAVA_INT.withName("extendedDynamicState3CoverageModulationTable"),
		    JAVA_INT.withName("extendedDynamicState3CoverageReductionMode"),
		    JAVA_INT.withName("extendedDynamicState3RepresentativeFragmentTestEnable"),
		    JAVA_INT.withName("extendedDynamicState3ShadingRateImageEnable"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPhysicalDeviceExtendedDynamicState3FeaturesEXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		EXTENDED_DYNAMIC_STATE3_TESSELLATION_DOMAIN_ORIGIN_HANDLE = LAYOUT.varHandle(PathElement.groupElement("extendedDynamicState3TessellationDomainOrigin"));
		EXTENDED_DYNAMIC_STATE3_DEPTH_CLAMP_ENABLE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("extendedDynamicState3DepthClampEnable"));
		EXTENDED_DYNAMIC_STATE3_POLYGON_MODE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("extendedDynamicState3PolygonMode"));
		EXTENDED_DYNAMIC_STATE3_RASTERIZATION_SAMPLES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("extendedDynamicState3RasterizationSamples"));
		EXTENDED_DYNAMIC_STATE3_SAMPLE_MASK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("extendedDynamicState3SampleMask"));
		EXTENDED_DYNAMIC_STATE3_ALPHA_TO_COVERAGE_ENABLE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("extendedDynamicState3AlphaToCoverageEnable"));
		EXTENDED_DYNAMIC_STATE3_ALPHA_TO_ONE_ENABLE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("extendedDynamicState3AlphaToOneEnable"));
		EXTENDED_DYNAMIC_STATE3_LOGIC_OP_ENABLE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("extendedDynamicState3LogicOpEnable"));
		EXTENDED_DYNAMIC_STATE3_COLOR_BLEND_ENABLE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("extendedDynamicState3ColorBlendEnable"));
		EXTENDED_DYNAMIC_STATE3_COLOR_BLEND_EQUATION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("extendedDynamicState3ColorBlendEquation"));
		EXTENDED_DYNAMIC_STATE3_COLOR_WRITE_MASK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("extendedDynamicState3ColorWriteMask"));
		EXTENDED_DYNAMIC_STATE3_RASTERIZATION_STREAM_HANDLE = LAYOUT.varHandle(PathElement.groupElement("extendedDynamicState3RasterizationStream"));
		EXTENDED_DYNAMIC_STATE3_CONSERVATIVE_RASTERIZATION_MODE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("extendedDynamicState3ConservativeRasterizationMode"));
		EXTENDED_DYNAMIC_STATE3_EXTRA_PRIMITIVE_OVERESTIMATION_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("extendedDynamicState3ExtraPrimitiveOverestimationSize"));
		EXTENDED_DYNAMIC_STATE3_DEPTH_CLIP_ENABLE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("extendedDynamicState3DepthClipEnable"));
		EXTENDED_DYNAMIC_STATE3_SAMPLE_LOCATIONS_ENABLE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("extendedDynamicState3SampleLocationsEnable"));
		EXTENDED_DYNAMIC_STATE3_COLOR_BLEND_ADVANCED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("extendedDynamicState3ColorBlendAdvanced"));
		EXTENDED_DYNAMIC_STATE3_PROVOKING_VERTEX_MODE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("extendedDynamicState3ProvokingVertexMode"));
		EXTENDED_DYNAMIC_STATE3_LINE_RASTERIZATION_MODE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("extendedDynamicState3LineRasterizationMode"));
		EXTENDED_DYNAMIC_STATE3_LINE_STIPPLE_ENABLE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("extendedDynamicState3LineStippleEnable"));
		EXTENDED_DYNAMIC_STATE3_DEPTH_CLIP_NEGATIVE_ONE_TO_ONE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("extendedDynamicState3DepthClipNegativeOneToOne"));
		EXTENDED_DYNAMIC_STATE3_VIEWPORT_WSCALING_ENABLE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("extendedDynamicState3ViewportWScalingEnable"));
		EXTENDED_DYNAMIC_STATE3_VIEWPORT_SWIZZLE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("extendedDynamicState3ViewportSwizzle"));
		EXTENDED_DYNAMIC_STATE3_COVERAGE_TO_COLOR_ENABLE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("extendedDynamicState3CoverageToColorEnable"));
		EXTENDED_DYNAMIC_STATE3_COVERAGE_TO_COLOR_LOCATION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("extendedDynamicState3CoverageToColorLocation"));
		EXTENDED_DYNAMIC_STATE3_COVERAGE_MODULATION_MODE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("extendedDynamicState3CoverageModulationMode"));
		EXTENDED_DYNAMIC_STATE3_COVERAGE_MODULATION_TABLE_ENABLE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("extendedDynamicState3CoverageModulationTableEnable"));
		EXTENDED_DYNAMIC_STATE3_COVERAGE_MODULATION_TABLE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("extendedDynamicState3CoverageModulationTable"));
		EXTENDED_DYNAMIC_STATE3_COVERAGE_REDUCTION_MODE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("extendedDynamicState3CoverageReductionMode"));
		EXTENDED_DYNAMIC_STATE3_REPRESENTATIVE_FRAGMENT_TEST_ENABLE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("extendedDynamicState3RepresentativeFragmentTestEnable"));
		EXTENDED_DYNAMIC_STATE3_SHADING_RATE_IMAGE_ENABLE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("extendedDynamicState3ShadingRateImageEnable"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		EXTENDED_DYNAMIC_STATE3_TESSELLATION_DOMAIN_ORIGIN_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("extendedDynamicState3TessellationDomainOrigin"));
		EXTENDED_DYNAMIC_STATE3_DEPTH_CLAMP_ENABLE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("extendedDynamicState3DepthClampEnable"));
		EXTENDED_DYNAMIC_STATE3_POLYGON_MODE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("extendedDynamicState3PolygonMode"));
		EXTENDED_DYNAMIC_STATE3_RASTERIZATION_SAMPLES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("extendedDynamicState3RasterizationSamples"));
		EXTENDED_DYNAMIC_STATE3_SAMPLE_MASK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("extendedDynamicState3SampleMask"));
		EXTENDED_DYNAMIC_STATE3_ALPHA_TO_COVERAGE_ENABLE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("extendedDynamicState3AlphaToCoverageEnable"));
		EXTENDED_DYNAMIC_STATE3_ALPHA_TO_ONE_ENABLE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("extendedDynamicState3AlphaToOneEnable"));
		EXTENDED_DYNAMIC_STATE3_LOGIC_OP_ENABLE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("extendedDynamicState3LogicOpEnable"));
		EXTENDED_DYNAMIC_STATE3_COLOR_BLEND_ENABLE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("extendedDynamicState3ColorBlendEnable"));
		EXTENDED_DYNAMIC_STATE3_COLOR_BLEND_EQUATION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("extendedDynamicState3ColorBlendEquation"));
		EXTENDED_DYNAMIC_STATE3_COLOR_WRITE_MASK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("extendedDynamicState3ColorWriteMask"));
		EXTENDED_DYNAMIC_STATE3_RASTERIZATION_STREAM_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("extendedDynamicState3RasterizationStream"));
		EXTENDED_DYNAMIC_STATE3_CONSERVATIVE_RASTERIZATION_MODE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("extendedDynamicState3ConservativeRasterizationMode"));
		EXTENDED_DYNAMIC_STATE3_EXTRA_PRIMITIVE_OVERESTIMATION_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("extendedDynamicState3ExtraPrimitiveOverestimationSize"));
		EXTENDED_DYNAMIC_STATE3_DEPTH_CLIP_ENABLE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("extendedDynamicState3DepthClipEnable"));
		EXTENDED_DYNAMIC_STATE3_SAMPLE_LOCATIONS_ENABLE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("extendedDynamicState3SampleLocationsEnable"));
		EXTENDED_DYNAMIC_STATE3_COLOR_BLEND_ADVANCED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("extendedDynamicState3ColorBlendAdvanced"));
		EXTENDED_DYNAMIC_STATE3_PROVOKING_VERTEX_MODE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("extendedDynamicState3ProvokingVertexMode"));
		EXTENDED_DYNAMIC_STATE3_LINE_RASTERIZATION_MODE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("extendedDynamicState3LineRasterizationMode"));
		EXTENDED_DYNAMIC_STATE3_LINE_STIPPLE_ENABLE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("extendedDynamicState3LineStippleEnable"));
		EXTENDED_DYNAMIC_STATE3_DEPTH_CLIP_NEGATIVE_ONE_TO_ONE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("extendedDynamicState3DepthClipNegativeOneToOne"));
		EXTENDED_DYNAMIC_STATE3_VIEWPORT_WSCALING_ENABLE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("extendedDynamicState3ViewportWScalingEnable"));
		EXTENDED_DYNAMIC_STATE3_VIEWPORT_SWIZZLE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("extendedDynamicState3ViewportSwizzle"));
		EXTENDED_DYNAMIC_STATE3_COVERAGE_TO_COLOR_ENABLE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("extendedDynamicState3CoverageToColorEnable"));
		EXTENDED_DYNAMIC_STATE3_COVERAGE_TO_COLOR_LOCATION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("extendedDynamicState3CoverageToColorLocation"));
		EXTENDED_DYNAMIC_STATE3_COVERAGE_MODULATION_MODE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("extendedDynamicState3CoverageModulationMode"));
		EXTENDED_DYNAMIC_STATE3_COVERAGE_MODULATION_TABLE_ENABLE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("extendedDynamicState3CoverageModulationTableEnable"));
		EXTENDED_DYNAMIC_STATE3_COVERAGE_MODULATION_TABLE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("extendedDynamicState3CoverageModulationTable"));
		EXTENDED_DYNAMIC_STATE3_COVERAGE_REDUCTION_MODE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("extendedDynamicState3CoverageReductionMode"));
		EXTENDED_DYNAMIC_STATE3_REPRESENTATIVE_FRAGMENT_TEST_ENABLE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("extendedDynamicState3RepresentativeFragmentTestEnable"));
		EXTENDED_DYNAMIC_STATE3_SHADING_RATE_IMAGE_ENABLE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("extendedDynamicState3ShadingRateImageEnable"));
		//@formatter:on
	}

	public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #extendedDynamicState3TessellationDomainOrigin()
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3TessellationDomainOrigin(int extendedDynamicState3TessellationDomainOrigin) {
    	EXTENDED_DYNAMIC_STATE3_TESSELLATION_DOMAIN_ORIGIN_HANDLE.set(segment, 0L, extendedDynamicState3TessellationDomainOrigin);
    	return this;
    }
    
    public int extendedDynamicState3TessellationDomainOrigin() {
    	return (int) EXTENDED_DYNAMIC_STATE3_TESSELLATION_DOMAIN_ORIGIN_HANDLE.get(segment, 0L);
    }
    
    /// @see #extendedDynamicState3DepthClampEnable()
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3DepthClampEnable(int extendedDynamicState3DepthClampEnable) {
    	EXTENDED_DYNAMIC_STATE3_DEPTH_CLAMP_ENABLE_HANDLE.set(segment, 0L, extendedDynamicState3DepthClampEnable);
    	return this;
    }
    
    public int extendedDynamicState3DepthClampEnable() {
    	return (int) EXTENDED_DYNAMIC_STATE3_DEPTH_CLAMP_ENABLE_HANDLE.get(segment, 0L);
    }
    
    /// @see #extendedDynamicState3PolygonMode()
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3PolygonMode(int extendedDynamicState3PolygonMode) {
    	EXTENDED_DYNAMIC_STATE3_POLYGON_MODE_HANDLE.set(segment, 0L, extendedDynamicState3PolygonMode);
    	return this;
    }
    
    public int extendedDynamicState3PolygonMode() {
    	return (int) EXTENDED_DYNAMIC_STATE3_POLYGON_MODE_HANDLE.get(segment, 0L);
    }
    
    /// @see #extendedDynamicState3RasterizationSamples()
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3RasterizationSamples(int extendedDynamicState3RasterizationSamples) {
    	EXTENDED_DYNAMIC_STATE3_RASTERIZATION_SAMPLES_HANDLE.set(segment, 0L, extendedDynamicState3RasterizationSamples);
    	return this;
    }
    
    public int extendedDynamicState3RasterizationSamples() {
    	return (int) EXTENDED_DYNAMIC_STATE3_RASTERIZATION_SAMPLES_HANDLE.get(segment, 0L);
    }
    
    /// @see #extendedDynamicState3SampleMask()
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3SampleMask(int extendedDynamicState3SampleMask) {
    	EXTENDED_DYNAMIC_STATE3_SAMPLE_MASK_HANDLE.set(segment, 0L, extendedDynamicState3SampleMask);
    	return this;
    }
    
    public int extendedDynamicState3SampleMask() {
    	return (int) EXTENDED_DYNAMIC_STATE3_SAMPLE_MASK_HANDLE.get(segment, 0L);
    }
    
    /// @see #extendedDynamicState3AlphaToCoverageEnable()
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3AlphaToCoverageEnable(int extendedDynamicState3AlphaToCoverageEnable) {
    	EXTENDED_DYNAMIC_STATE3_ALPHA_TO_COVERAGE_ENABLE_HANDLE.set(segment, 0L, extendedDynamicState3AlphaToCoverageEnable);
    	return this;
    }
    
    public int extendedDynamicState3AlphaToCoverageEnable() {
    	return (int) EXTENDED_DYNAMIC_STATE3_ALPHA_TO_COVERAGE_ENABLE_HANDLE.get(segment, 0L);
    }
    
    /// @see #extendedDynamicState3AlphaToOneEnable()
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3AlphaToOneEnable(int extendedDynamicState3AlphaToOneEnable) {
    	EXTENDED_DYNAMIC_STATE3_ALPHA_TO_ONE_ENABLE_HANDLE.set(segment, 0L, extendedDynamicState3AlphaToOneEnable);
    	return this;
    }
    
    public int extendedDynamicState3AlphaToOneEnable() {
    	return (int) EXTENDED_DYNAMIC_STATE3_ALPHA_TO_ONE_ENABLE_HANDLE.get(segment, 0L);
    }
    
    /// @see #extendedDynamicState3LogicOpEnable()
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3LogicOpEnable(int extendedDynamicState3LogicOpEnable) {
    	EXTENDED_DYNAMIC_STATE3_LOGIC_OP_ENABLE_HANDLE.set(segment, 0L, extendedDynamicState3LogicOpEnable);
    	return this;
    }
    
    public int extendedDynamicState3LogicOpEnable() {
    	return (int) EXTENDED_DYNAMIC_STATE3_LOGIC_OP_ENABLE_HANDLE.get(segment, 0L);
    }
    
    /// @see #extendedDynamicState3ColorBlendEnable()
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3ColorBlendEnable(int extendedDynamicState3ColorBlendEnable) {
    	EXTENDED_DYNAMIC_STATE3_COLOR_BLEND_ENABLE_HANDLE.set(segment, 0L, extendedDynamicState3ColorBlendEnable);
    	return this;
    }
    
    public int extendedDynamicState3ColorBlendEnable() {
    	return (int) EXTENDED_DYNAMIC_STATE3_COLOR_BLEND_ENABLE_HANDLE.get(segment, 0L);
    }
    
    /// @see #extendedDynamicState3ColorBlendEquation()
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3ColorBlendEquation(int extendedDynamicState3ColorBlendEquation) {
    	EXTENDED_DYNAMIC_STATE3_COLOR_BLEND_EQUATION_HANDLE.set(segment, 0L, extendedDynamicState3ColorBlendEquation);
    	return this;
    }
    
    public int extendedDynamicState3ColorBlendEquation() {
    	return (int) EXTENDED_DYNAMIC_STATE3_COLOR_BLEND_EQUATION_HANDLE.get(segment, 0L);
    }
    
    /// @see #extendedDynamicState3ColorWriteMask()
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3ColorWriteMask(int extendedDynamicState3ColorWriteMask) {
    	EXTENDED_DYNAMIC_STATE3_COLOR_WRITE_MASK_HANDLE.set(segment, 0L, extendedDynamicState3ColorWriteMask);
    	return this;
    }
    
    public int extendedDynamicState3ColorWriteMask() {
    	return (int) EXTENDED_DYNAMIC_STATE3_COLOR_WRITE_MASK_HANDLE.get(segment, 0L);
    }
    
    /// @see #extendedDynamicState3RasterizationStream()
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3RasterizationStream(int extendedDynamicState3RasterizationStream) {
    	EXTENDED_DYNAMIC_STATE3_RASTERIZATION_STREAM_HANDLE.set(segment, 0L, extendedDynamicState3RasterizationStream);
    	return this;
    }
    
    public int extendedDynamicState3RasterizationStream() {
    	return (int) EXTENDED_DYNAMIC_STATE3_RASTERIZATION_STREAM_HANDLE.get(segment, 0L);
    }
    
    /// @see #extendedDynamicState3ConservativeRasterizationMode()
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3ConservativeRasterizationMode(int extendedDynamicState3ConservativeRasterizationMode) {
    	EXTENDED_DYNAMIC_STATE3_CONSERVATIVE_RASTERIZATION_MODE_HANDLE.set(segment, 0L, extendedDynamicState3ConservativeRasterizationMode);
    	return this;
    }
    
    public int extendedDynamicState3ConservativeRasterizationMode() {
    	return (int) EXTENDED_DYNAMIC_STATE3_CONSERVATIVE_RASTERIZATION_MODE_HANDLE.get(segment, 0L);
    }
    
    /// @see #extendedDynamicState3ExtraPrimitiveOverestimationSize()
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3ExtraPrimitiveOverestimationSize(int extendedDynamicState3ExtraPrimitiveOverestimationSize) {
    	EXTENDED_DYNAMIC_STATE3_EXTRA_PRIMITIVE_OVERESTIMATION_SIZE_HANDLE.set(segment, 0L, extendedDynamicState3ExtraPrimitiveOverestimationSize);
    	return this;
    }
    
    public int extendedDynamicState3ExtraPrimitiveOverestimationSize() {
    	return (int) EXTENDED_DYNAMIC_STATE3_EXTRA_PRIMITIVE_OVERESTIMATION_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #extendedDynamicState3DepthClipEnable()
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3DepthClipEnable(int extendedDynamicState3DepthClipEnable) {
    	EXTENDED_DYNAMIC_STATE3_DEPTH_CLIP_ENABLE_HANDLE.set(segment, 0L, extendedDynamicState3DepthClipEnable);
    	return this;
    }
    
    public int extendedDynamicState3DepthClipEnable() {
    	return (int) EXTENDED_DYNAMIC_STATE3_DEPTH_CLIP_ENABLE_HANDLE.get(segment, 0L);
    }
    
    /// @see #extendedDynamicState3SampleLocationsEnable()
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3SampleLocationsEnable(int extendedDynamicState3SampleLocationsEnable) {
    	EXTENDED_DYNAMIC_STATE3_SAMPLE_LOCATIONS_ENABLE_HANDLE.set(segment, 0L, extendedDynamicState3SampleLocationsEnable);
    	return this;
    }
    
    public int extendedDynamicState3SampleLocationsEnable() {
    	return (int) EXTENDED_DYNAMIC_STATE3_SAMPLE_LOCATIONS_ENABLE_HANDLE.get(segment, 0L);
    }
    
    /// @see #extendedDynamicState3ColorBlendAdvanced()
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3ColorBlendAdvanced(int extendedDynamicState3ColorBlendAdvanced) {
    	EXTENDED_DYNAMIC_STATE3_COLOR_BLEND_ADVANCED_HANDLE.set(segment, 0L, extendedDynamicState3ColorBlendAdvanced);
    	return this;
    }
    
    public int extendedDynamicState3ColorBlendAdvanced() {
    	return (int) EXTENDED_DYNAMIC_STATE3_COLOR_BLEND_ADVANCED_HANDLE.get(segment, 0L);
    }
    
    /// @see #extendedDynamicState3ProvokingVertexMode()
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3ProvokingVertexMode(int extendedDynamicState3ProvokingVertexMode) {
    	EXTENDED_DYNAMIC_STATE3_PROVOKING_VERTEX_MODE_HANDLE.set(segment, 0L, extendedDynamicState3ProvokingVertexMode);
    	return this;
    }
    
    public int extendedDynamicState3ProvokingVertexMode() {
    	return (int) EXTENDED_DYNAMIC_STATE3_PROVOKING_VERTEX_MODE_HANDLE.get(segment, 0L);
    }
    
    /// @see #extendedDynamicState3LineRasterizationMode()
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3LineRasterizationMode(int extendedDynamicState3LineRasterizationMode) {
    	EXTENDED_DYNAMIC_STATE3_LINE_RASTERIZATION_MODE_HANDLE.set(segment, 0L, extendedDynamicState3LineRasterizationMode);
    	return this;
    }
    
    public int extendedDynamicState3LineRasterizationMode() {
    	return (int) EXTENDED_DYNAMIC_STATE3_LINE_RASTERIZATION_MODE_HANDLE.get(segment, 0L);
    }
    
    /// @see #extendedDynamicState3LineStippleEnable()
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3LineStippleEnable(int extendedDynamicState3LineStippleEnable) {
    	EXTENDED_DYNAMIC_STATE3_LINE_STIPPLE_ENABLE_HANDLE.set(segment, 0L, extendedDynamicState3LineStippleEnable);
    	return this;
    }
    
    public int extendedDynamicState3LineStippleEnable() {
    	return (int) EXTENDED_DYNAMIC_STATE3_LINE_STIPPLE_ENABLE_HANDLE.get(segment, 0L);
    }
    
    /// @see #extendedDynamicState3DepthClipNegativeOneToOne()
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3DepthClipNegativeOneToOne(int extendedDynamicState3DepthClipNegativeOneToOne) {
    	EXTENDED_DYNAMIC_STATE3_DEPTH_CLIP_NEGATIVE_ONE_TO_ONE_HANDLE.set(segment, 0L, extendedDynamicState3DepthClipNegativeOneToOne);
    	return this;
    }
    
    public int extendedDynamicState3DepthClipNegativeOneToOne() {
    	return (int) EXTENDED_DYNAMIC_STATE3_DEPTH_CLIP_NEGATIVE_ONE_TO_ONE_HANDLE.get(segment, 0L);
    }
    
    /// @see #extendedDynamicState3ViewportWScalingEnable()
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3ViewportWScalingEnable(int extendedDynamicState3ViewportWScalingEnable) {
    	EXTENDED_DYNAMIC_STATE3_VIEWPORT_WSCALING_ENABLE_HANDLE.set(segment, 0L, extendedDynamicState3ViewportWScalingEnable);
    	return this;
    }
    
    public int extendedDynamicState3ViewportWScalingEnable() {
    	return (int) EXTENDED_DYNAMIC_STATE3_VIEWPORT_WSCALING_ENABLE_HANDLE.get(segment, 0L);
    }
    
    /// @see #extendedDynamicState3ViewportSwizzle()
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3ViewportSwizzle(int extendedDynamicState3ViewportSwizzle) {
    	EXTENDED_DYNAMIC_STATE3_VIEWPORT_SWIZZLE_HANDLE.set(segment, 0L, extendedDynamicState3ViewportSwizzle);
    	return this;
    }
    
    public int extendedDynamicState3ViewportSwizzle() {
    	return (int) EXTENDED_DYNAMIC_STATE3_VIEWPORT_SWIZZLE_HANDLE.get(segment, 0L);
    }
    
    /// @see #extendedDynamicState3CoverageToColorEnable()
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3CoverageToColorEnable(int extendedDynamicState3CoverageToColorEnable) {
    	EXTENDED_DYNAMIC_STATE3_COVERAGE_TO_COLOR_ENABLE_HANDLE.set(segment, 0L, extendedDynamicState3CoverageToColorEnable);
    	return this;
    }
    
    public int extendedDynamicState3CoverageToColorEnable() {
    	return (int) EXTENDED_DYNAMIC_STATE3_COVERAGE_TO_COLOR_ENABLE_HANDLE.get(segment, 0L);
    }
    
    /// @see #extendedDynamicState3CoverageToColorLocation()
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3CoverageToColorLocation(int extendedDynamicState3CoverageToColorLocation) {
    	EXTENDED_DYNAMIC_STATE3_COVERAGE_TO_COLOR_LOCATION_HANDLE.set(segment, 0L, extendedDynamicState3CoverageToColorLocation);
    	return this;
    }
    
    public int extendedDynamicState3CoverageToColorLocation() {
    	return (int) EXTENDED_DYNAMIC_STATE3_COVERAGE_TO_COLOR_LOCATION_HANDLE.get(segment, 0L);
    }
    
    /// @see #extendedDynamicState3CoverageModulationMode()
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3CoverageModulationMode(int extendedDynamicState3CoverageModulationMode) {
    	EXTENDED_DYNAMIC_STATE3_COVERAGE_MODULATION_MODE_HANDLE.set(segment, 0L, extendedDynamicState3CoverageModulationMode);
    	return this;
    }
    
    public int extendedDynamicState3CoverageModulationMode() {
    	return (int) EXTENDED_DYNAMIC_STATE3_COVERAGE_MODULATION_MODE_HANDLE.get(segment, 0L);
    }
    
    /// @see #extendedDynamicState3CoverageModulationTableEnable()
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3CoverageModulationTableEnable(int extendedDynamicState3CoverageModulationTableEnable) {
    	EXTENDED_DYNAMIC_STATE3_COVERAGE_MODULATION_TABLE_ENABLE_HANDLE.set(segment, 0L, extendedDynamicState3CoverageModulationTableEnable);
    	return this;
    }
    
    public int extendedDynamicState3CoverageModulationTableEnable() {
    	return (int) EXTENDED_DYNAMIC_STATE3_COVERAGE_MODULATION_TABLE_ENABLE_HANDLE.get(segment, 0L);
    }
    
    /// @see #extendedDynamicState3CoverageModulationTable()
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3CoverageModulationTable(int extendedDynamicState3CoverageModulationTable) {
    	EXTENDED_DYNAMIC_STATE3_COVERAGE_MODULATION_TABLE_HANDLE.set(segment, 0L, extendedDynamicState3CoverageModulationTable);
    	return this;
    }
    
    public int extendedDynamicState3CoverageModulationTable() {
    	return (int) EXTENDED_DYNAMIC_STATE3_COVERAGE_MODULATION_TABLE_HANDLE.get(segment, 0L);
    }
    
    /// @see #extendedDynamicState3CoverageReductionMode()
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3CoverageReductionMode(int extendedDynamicState3CoverageReductionMode) {
    	EXTENDED_DYNAMIC_STATE3_COVERAGE_REDUCTION_MODE_HANDLE.set(segment, 0L, extendedDynamicState3CoverageReductionMode);
    	return this;
    }
    
    public int extendedDynamicState3CoverageReductionMode() {
    	return (int) EXTENDED_DYNAMIC_STATE3_COVERAGE_REDUCTION_MODE_HANDLE.get(segment, 0L);
    }
    
    /// @see #extendedDynamicState3RepresentativeFragmentTestEnable()
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3RepresentativeFragmentTestEnable(int extendedDynamicState3RepresentativeFragmentTestEnable) {
    	EXTENDED_DYNAMIC_STATE3_REPRESENTATIVE_FRAGMENT_TEST_ENABLE_HANDLE.set(segment, 0L, extendedDynamicState3RepresentativeFragmentTestEnable);
    	return this;
    }
    
    public int extendedDynamicState3RepresentativeFragmentTestEnable() {
    	return (int) EXTENDED_DYNAMIC_STATE3_REPRESENTATIVE_FRAGMENT_TEST_ENABLE_HANDLE.get(segment, 0L);
    }
    
    /// @see #extendedDynamicState3ShadingRateImageEnable()
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3ShadingRateImageEnable(int extendedDynamicState3ShadingRateImageEnable) {
    	EXTENDED_DYNAMIC_STATE3_SHADING_RATE_IMAGE_ENABLE_HANDLE.set(segment, 0L, extendedDynamicState3ShadingRateImageEnable);
    	return this;
    }
    
    public int extendedDynamicState3ShadingRateImageEnable() {
    	return (int) EXTENDED_DYNAMIC_STATE3_SHADING_RATE_IMAGE_ENABLE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT set(VkPhysicalDeviceExtendedDynamicState3FeaturesEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceExtendedDynamicState3FeaturesEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceExtendedDynamicState3FeaturesEXT> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceExtendedDynamicState3FeaturesEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceExtendedDynamicState3FeaturesEXT> array(SegmentAllocator allocator, VkPhysicalDeviceExtendedDynamicState3FeaturesEXT... structs) {
        NativeStructArray<VkPhysicalDeviceExtendedDynamicState3FeaturesEXT> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceExtendedDynamicState3FeaturesEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceExtendedDynamicState3FeaturesEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceExtendedDynamicState3FeaturesEXT(segment)
        );
    }

}