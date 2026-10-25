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

public final class VkPhysicalDeviceConservativeRasterizationPropertiesEXT
		implements Struct<VkPhysicalDeviceConservativeRasterizationPropertiesEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle PRIMITIVE_OVERESTIMATION_SIZE_HANDLE;
	public static final VarHandle MAX_EXTRA_PRIMITIVE_OVERESTIMATION_SIZE_HANDLE;
	public static final VarHandle EXTRA_PRIMITIVE_OVERESTIMATION_SIZE_GRANULARITY_HANDLE;
	public static final VarHandle PRIMITIVE_UNDERESTIMATION_HANDLE;
	public static final VarHandle CONSERVATIVE_POINT_AND_LINE_RASTERIZATION_HANDLE;
	public static final VarHandle DEGENERATE_TRIANGLES_RASTERIZED_HANDLE;
	public static final VarHandle DEGENERATE_LINES_RASTERIZED_HANDLE;
	public static final VarHandle FULLY_COVERED_FRAGMENT_SHADER_INPUT_VARIABLE_HANDLE;
	public static final VarHandle CONSERVATIVE_RASTERIZATION_POST_DEPTH_COVERAGE_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long PRIMITIVE_OVERESTIMATION_SIZE_BYTE_OFFSET;
	public static final long MAX_EXTRA_PRIMITIVE_OVERESTIMATION_SIZE_BYTE_OFFSET;
	public static final long EXTRA_PRIMITIVE_OVERESTIMATION_SIZE_GRANULARITY_BYTE_OFFSET;
	public static final long PRIMITIVE_UNDERESTIMATION_BYTE_OFFSET;
	public static final long CONSERVATIVE_POINT_AND_LINE_RASTERIZATION_BYTE_OFFSET;
	public static final long DEGENERATE_TRIANGLES_RASTERIZED_BYTE_OFFSET;
	public static final long DEGENERATE_LINES_RASTERIZED_BYTE_OFFSET;
	public static final long FULLY_COVERED_FRAGMENT_SHADER_INPUT_VARIABLE_BYTE_OFFSET;
	public static final long CONSERVATIVE_RASTERIZATION_POST_DEPTH_COVERAGE_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_FLOAT.withName("primitiveOverestimationSize"),
		    JAVA_FLOAT.withName("maxExtraPrimitiveOverestimationSize"),
		    JAVA_FLOAT.withName("extraPrimitiveOverestimationSizeGranularity"),
		    JAVA_INT.withName("primitiveUnderestimation"),
		    JAVA_INT.withName("conservativePointAndLineRasterization"),
		    JAVA_INT.withName("degenerateTrianglesRasterized"),
		    JAVA_INT.withName("degenerateLinesRasterized"),
		    JAVA_INT.withName("fullyCoveredFragmentShaderInputVariable"),
		    JAVA_INT.withName("conservativeRasterizationPostDepthCoverage"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPhysicalDeviceConservativeRasterizationPropertiesEXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		PRIMITIVE_OVERESTIMATION_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("primitiveOverestimationSize"));
		MAX_EXTRA_PRIMITIVE_OVERESTIMATION_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxExtraPrimitiveOverestimationSize"));
		EXTRA_PRIMITIVE_OVERESTIMATION_SIZE_GRANULARITY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("extraPrimitiveOverestimationSizeGranularity"));
		PRIMITIVE_UNDERESTIMATION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("primitiveUnderestimation"));
		CONSERVATIVE_POINT_AND_LINE_RASTERIZATION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("conservativePointAndLineRasterization"));
		DEGENERATE_TRIANGLES_RASTERIZED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("degenerateTrianglesRasterized"));
		DEGENERATE_LINES_RASTERIZED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("degenerateLinesRasterized"));
		FULLY_COVERED_FRAGMENT_SHADER_INPUT_VARIABLE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("fullyCoveredFragmentShaderInputVariable"));
		CONSERVATIVE_RASTERIZATION_POST_DEPTH_COVERAGE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("conservativeRasterizationPostDepthCoverage"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		PRIMITIVE_OVERESTIMATION_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("primitiveOverestimationSize"));
		MAX_EXTRA_PRIMITIVE_OVERESTIMATION_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxExtraPrimitiveOverestimationSize"));
		EXTRA_PRIMITIVE_OVERESTIMATION_SIZE_GRANULARITY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("extraPrimitiveOverestimationSizeGranularity"));
		PRIMITIVE_UNDERESTIMATION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("primitiveUnderestimation"));
		CONSERVATIVE_POINT_AND_LINE_RASTERIZATION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("conservativePointAndLineRasterization"));
		DEGENERATE_TRIANGLES_RASTERIZED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("degenerateTrianglesRasterized"));
		DEGENERATE_LINES_RASTERIZED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("degenerateLinesRasterized"));
		FULLY_COVERED_FRAGMENT_SHADER_INPUT_VARIABLE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("fullyCoveredFragmentShaderInputVariable"));
		CONSERVATIVE_RASTERIZATION_POST_DEPTH_COVERAGE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("conservativeRasterizationPostDepthCoverage"));
		//@formatter:on
	}

	public VkPhysicalDeviceConservativeRasterizationPropertiesEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceConservativeRasterizationPropertiesEXT(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceConservativeRasterizationPropertiesEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #primitiveOverestimationSize()
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT primitiveOverestimationSize(float primitiveOverestimationSize) {
    	PRIMITIVE_OVERESTIMATION_SIZE_HANDLE.set(segment, 0L, primitiveOverestimationSize);
    	return this;
    }
    
    public float primitiveOverestimationSize() {
    	return (float) PRIMITIVE_OVERESTIMATION_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxExtraPrimitiveOverestimationSize()
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT maxExtraPrimitiveOverestimationSize(float maxExtraPrimitiveOverestimationSize) {
    	MAX_EXTRA_PRIMITIVE_OVERESTIMATION_SIZE_HANDLE.set(segment, 0L, maxExtraPrimitiveOverestimationSize);
    	return this;
    }
    
    public float maxExtraPrimitiveOverestimationSize() {
    	return (float) MAX_EXTRA_PRIMITIVE_OVERESTIMATION_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #extraPrimitiveOverestimationSizeGranularity()
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT extraPrimitiveOverestimationSizeGranularity(float extraPrimitiveOverestimationSizeGranularity) {
    	EXTRA_PRIMITIVE_OVERESTIMATION_SIZE_GRANULARITY_HANDLE.set(segment, 0L, extraPrimitiveOverestimationSizeGranularity);
    	return this;
    }
    
    public float extraPrimitiveOverestimationSizeGranularity() {
    	return (float) EXTRA_PRIMITIVE_OVERESTIMATION_SIZE_GRANULARITY_HANDLE.get(segment, 0L);
    }
    
    /// @see #primitiveUnderestimation()
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT primitiveUnderestimation(int primitiveUnderestimation) {
    	PRIMITIVE_UNDERESTIMATION_HANDLE.set(segment, 0L, primitiveUnderestimation);
    	return this;
    }
    
    public int primitiveUnderestimation() {
    	return (int) PRIMITIVE_UNDERESTIMATION_HANDLE.get(segment, 0L);
    }
    
    /// @see #conservativePointAndLineRasterization()
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT conservativePointAndLineRasterization(int conservativePointAndLineRasterization) {
    	CONSERVATIVE_POINT_AND_LINE_RASTERIZATION_HANDLE.set(segment, 0L, conservativePointAndLineRasterization);
    	return this;
    }
    
    public int conservativePointAndLineRasterization() {
    	return (int) CONSERVATIVE_POINT_AND_LINE_RASTERIZATION_HANDLE.get(segment, 0L);
    }
    
    /// @see #degenerateTrianglesRasterized()
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT degenerateTrianglesRasterized(int degenerateTrianglesRasterized) {
    	DEGENERATE_TRIANGLES_RASTERIZED_HANDLE.set(segment, 0L, degenerateTrianglesRasterized);
    	return this;
    }
    
    public int degenerateTrianglesRasterized() {
    	return (int) DEGENERATE_TRIANGLES_RASTERIZED_HANDLE.get(segment, 0L);
    }
    
    /// @see #degenerateLinesRasterized()
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT degenerateLinesRasterized(int degenerateLinesRasterized) {
    	DEGENERATE_LINES_RASTERIZED_HANDLE.set(segment, 0L, degenerateLinesRasterized);
    	return this;
    }
    
    public int degenerateLinesRasterized() {
    	return (int) DEGENERATE_LINES_RASTERIZED_HANDLE.get(segment, 0L);
    }
    
    /// @see #fullyCoveredFragmentShaderInputVariable()
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT fullyCoveredFragmentShaderInputVariable(int fullyCoveredFragmentShaderInputVariable) {
    	FULLY_COVERED_FRAGMENT_SHADER_INPUT_VARIABLE_HANDLE.set(segment, 0L, fullyCoveredFragmentShaderInputVariable);
    	return this;
    }
    
    public int fullyCoveredFragmentShaderInputVariable() {
    	return (int) FULLY_COVERED_FRAGMENT_SHADER_INPUT_VARIABLE_HANDLE.get(segment, 0L);
    }
    
    /// @see #conservativeRasterizationPostDepthCoverage()
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT conservativeRasterizationPostDepthCoverage(int conservativeRasterizationPostDepthCoverage) {
    	CONSERVATIVE_RASTERIZATION_POST_DEPTH_COVERAGE_HANDLE.set(segment, 0L, conservativeRasterizationPostDepthCoverage);
    	return this;
    }
    
    public int conservativeRasterizationPostDepthCoverage() {
    	return (int) CONSERVATIVE_RASTERIZATION_POST_DEPTH_COVERAGE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT set(VkPhysicalDeviceConservativeRasterizationPropertiesEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceConservativeRasterizationPropertiesEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceConservativeRasterizationPropertiesEXT> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceConservativeRasterizationPropertiesEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceConservativeRasterizationPropertiesEXT> array(SegmentAllocator allocator, VkPhysicalDeviceConservativeRasterizationPropertiesEXT... structs) {
        NativeStructArray<VkPhysicalDeviceConservativeRasterizationPropertiesEXT> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceConservativeRasterizationPropertiesEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceConservativeRasterizationPropertiesEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceConservativeRasterizationPropertiesEXT(segment)
        );
    }

}