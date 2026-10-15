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

public final class VkPhysicalDeviceVulkan14Features
		implements Struct<VkPhysicalDeviceVulkan14Features> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle GLOBAL_PRIORITY_QUERY_HANDLE;
	public static final VarHandle SHADER_SUBGROUP_ROTATE_HANDLE;
	public static final VarHandle SHADER_SUBGROUP_ROTATE_CLUSTERED_HANDLE;
	public static final VarHandle SHADER_FLOAT_CONTROLS2_HANDLE;
	public static final VarHandle SHADER_EXPECT_ASSUME_HANDLE;
	public static final VarHandle RECTANGULAR_LINES_HANDLE;
	public static final VarHandle BRESENHAM_LINES_HANDLE;
	public static final VarHandle SMOOTH_LINES_HANDLE;
	public static final VarHandle STIPPLED_RECTANGULAR_LINES_HANDLE;
	public static final VarHandle STIPPLED_BRESENHAM_LINES_HANDLE;
	public static final VarHandle STIPPLED_SMOOTH_LINES_HANDLE;
	public static final VarHandle VERTEX_ATTRIBUTE_INSTANCE_RATE_DIVISOR_HANDLE;
	public static final VarHandle VERTEX_ATTRIBUTE_INSTANCE_RATE_ZERO_DIVISOR_HANDLE;
	public static final VarHandle INDEX_TYPE_UINT8_HANDLE;
	public static final VarHandle DYNAMIC_RENDERING_LOCAL_READ_HANDLE;
	public static final VarHandle MAINTENANCE5_HANDLE;
	public static final VarHandle MAINTENANCE6_HANDLE;
	public static final VarHandle PIPELINE_PROTECTED_ACCESS_HANDLE;
	public static final VarHandle PIPELINE_ROBUSTNESS_HANDLE;
	public static final VarHandle HOST_IMAGE_COPY_HANDLE;
	public static final VarHandle PUSH_DESCRIPTOR_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long GLOBAL_PRIORITY_QUERY_BYTE_OFFSET;
	public static final long SHADER_SUBGROUP_ROTATE_BYTE_OFFSET;
	public static final long SHADER_SUBGROUP_ROTATE_CLUSTERED_BYTE_OFFSET;
	public static final long SHADER_FLOAT_CONTROLS2_BYTE_OFFSET;
	public static final long SHADER_EXPECT_ASSUME_BYTE_OFFSET;
	public static final long RECTANGULAR_LINES_BYTE_OFFSET;
	public static final long BRESENHAM_LINES_BYTE_OFFSET;
	public static final long SMOOTH_LINES_BYTE_OFFSET;
	public static final long STIPPLED_RECTANGULAR_LINES_BYTE_OFFSET;
	public static final long STIPPLED_BRESENHAM_LINES_BYTE_OFFSET;
	public static final long STIPPLED_SMOOTH_LINES_BYTE_OFFSET;
	public static final long VERTEX_ATTRIBUTE_INSTANCE_RATE_DIVISOR_BYTE_OFFSET;
	public static final long VERTEX_ATTRIBUTE_INSTANCE_RATE_ZERO_DIVISOR_BYTE_OFFSET;
	public static final long INDEX_TYPE_UINT8_BYTE_OFFSET;
	public static final long DYNAMIC_RENDERING_LOCAL_READ_BYTE_OFFSET;
	public static final long MAINTENANCE5_BYTE_OFFSET;
	public static final long MAINTENANCE6_BYTE_OFFSET;
	public static final long PIPELINE_PROTECTED_ACCESS_BYTE_OFFSET;
	public static final long PIPELINE_ROBUSTNESS_BYTE_OFFSET;
	public static final long HOST_IMAGE_COPY_BYTE_OFFSET;
	public static final long PUSH_DESCRIPTOR_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("globalPriorityQuery"),
		    JAVA_INT.withName("shaderSubgroupRotate"),
		    JAVA_INT.withName("shaderSubgroupRotateClustered"),
		    JAVA_INT.withName("shaderFloatControls2"),
		    JAVA_INT.withName("shaderExpectAssume"),
		    JAVA_INT.withName("rectangularLines"),
		    JAVA_INT.withName("bresenhamLines"),
		    JAVA_INT.withName("smoothLines"),
		    JAVA_INT.withName("stippledRectangularLines"),
		    JAVA_INT.withName("stippledBresenhamLines"),
		    JAVA_INT.withName("stippledSmoothLines"),
		    JAVA_INT.withName("vertexAttributeInstanceRateDivisor"),
		    JAVA_INT.withName("vertexAttributeInstanceRateZeroDivisor"),
		    JAVA_INT.withName("indexTypeUint8"),
		    JAVA_INT.withName("dynamicRenderingLocalRead"),
		    JAVA_INT.withName("maintenance5"),
		    JAVA_INT.withName("maintenance6"),
		    JAVA_INT.withName("pipelineProtectedAccess"),
		    JAVA_INT.withName("pipelineRobustness"),
		    JAVA_INT.withName("hostImageCopy"),
		    JAVA_INT.withName("pushDescriptor"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPhysicalDeviceVulkan14Features").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		GLOBAL_PRIORITY_QUERY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("globalPriorityQuery"));
		SHADER_SUBGROUP_ROTATE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderSubgroupRotate"));
		SHADER_SUBGROUP_ROTATE_CLUSTERED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderSubgroupRotateClustered"));
		SHADER_FLOAT_CONTROLS2_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderFloatControls2"));
		SHADER_EXPECT_ASSUME_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderExpectAssume"));
		RECTANGULAR_LINES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("rectangularLines"));
		BRESENHAM_LINES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("bresenhamLines"));
		SMOOTH_LINES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("smoothLines"));
		STIPPLED_RECTANGULAR_LINES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("stippledRectangularLines"));
		STIPPLED_BRESENHAM_LINES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("stippledBresenhamLines"));
		STIPPLED_SMOOTH_LINES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("stippledSmoothLines"));
		VERTEX_ATTRIBUTE_INSTANCE_RATE_DIVISOR_HANDLE = LAYOUT.varHandle(PathElement.groupElement("vertexAttributeInstanceRateDivisor"));
		VERTEX_ATTRIBUTE_INSTANCE_RATE_ZERO_DIVISOR_HANDLE = LAYOUT.varHandle(PathElement.groupElement("vertexAttributeInstanceRateZeroDivisor"));
		INDEX_TYPE_UINT8_HANDLE = LAYOUT.varHandle(PathElement.groupElement("indexTypeUint8"));
		DYNAMIC_RENDERING_LOCAL_READ_HANDLE = LAYOUT.varHandle(PathElement.groupElement("dynamicRenderingLocalRead"));
		MAINTENANCE5_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maintenance5"));
		MAINTENANCE6_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maintenance6"));
		PIPELINE_PROTECTED_ACCESS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pipelineProtectedAccess"));
		PIPELINE_ROBUSTNESS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pipelineRobustness"));
		HOST_IMAGE_COPY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("hostImageCopy"));
		PUSH_DESCRIPTOR_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pushDescriptor"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		GLOBAL_PRIORITY_QUERY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("globalPriorityQuery"));
		SHADER_SUBGROUP_ROTATE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderSubgroupRotate"));
		SHADER_SUBGROUP_ROTATE_CLUSTERED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderSubgroupRotateClustered"));
		SHADER_FLOAT_CONTROLS2_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderFloatControls2"));
		SHADER_EXPECT_ASSUME_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderExpectAssume"));
		RECTANGULAR_LINES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("rectangularLines"));
		BRESENHAM_LINES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("bresenhamLines"));
		SMOOTH_LINES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("smoothLines"));
		STIPPLED_RECTANGULAR_LINES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("stippledRectangularLines"));
		STIPPLED_BRESENHAM_LINES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("stippledBresenhamLines"));
		STIPPLED_SMOOTH_LINES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("stippledSmoothLines"));
		VERTEX_ATTRIBUTE_INSTANCE_RATE_DIVISOR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vertexAttributeInstanceRateDivisor"));
		VERTEX_ATTRIBUTE_INSTANCE_RATE_ZERO_DIVISOR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vertexAttributeInstanceRateZeroDivisor"));
		INDEX_TYPE_UINT8_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("indexTypeUint8"));
		DYNAMIC_RENDERING_LOCAL_READ_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dynamicRenderingLocalRead"));
		MAINTENANCE5_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maintenance5"));
		MAINTENANCE6_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maintenance6"));
		PIPELINE_PROTECTED_ACCESS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pipelineProtectedAccess"));
		PIPELINE_ROBUSTNESS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pipelineRobustness"));
		HOST_IMAGE_COPY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("hostImageCopy"));
		PUSH_DESCRIPTOR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pushDescriptor"));
		//@formatter:on
	}

	public VkPhysicalDeviceVulkan14Features() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceVulkan14Features(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceVulkan14Features(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceVulkan14Features sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceVulkan14Features pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #globalPriorityQuery()
    public VkPhysicalDeviceVulkan14Features globalPriorityQuery(int globalPriorityQuery) {
    	GLOBAL_PRIORITY_QUERY_HANDLE.set(segment, 0L, globalPriorityQuery);
    	return this;
    }
    
    public int globalPriorityQuery() {
    	return (int) GLOBAL_PRIORITY_QUERY_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderSubgroupRotate()
    public VkPhysicalDeviceVulkan14Features shaderSubgroupRotate(int shaderSubgroupRotate) {
    	SHADER_SUBGROUP_ROTATE_HANDLE.set(segment, 0L, shaderSubgroupRotate);
    	return this;
    }
    
    public int shaderSubgroupRotate() {
    	return (int) SHADER_SUBGROUP_ROTATE_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderSubgroupRotateClustered()
    public VkPhysicalDeviceVulkan14Features shaderSubgroupRotateClustered(int shaderSubgroupRotateClustered) {
    	SHADER_SUBGROUP_ROTATE_CLUSTERED_HANDLE.set(segment, 0L, shaderSubgroupRotateClustered);
    	return this;
    }
    
    public int shaderSubgroupRotateClustered() {
    	return (int) SHADER_SUBGROUP_ROTATE_CLUSTERED_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderFloatControls2()
    public VkPhysicalDeviceVulkan14Features shaderFloatControls2(int shaderFloatControls2) {
    	SHADER_FLOAT_CONTROLS2_HANDLE.set(segment, 0L, shaderFloatControls2);
    	return this;
    }
    
    public int shaderFloatControls2() {
    	return (int) SHADER_FLOAT_CONTROLS2_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderExpectAssume()
    public VkPhysicalDeviceVulkan14Features shaderExpectAssume(int shaderExpectAssume) {
    	SHADER_EXPECT_ASSUME_HANDLE.set(segment, 0L, shaderExpectAssume);
    	return this;
    }
    
    public int shaderExpectAssume() {
    	return (int) SHADER_EXPECT_ASSUME_HANDLE.get(segment, 0L);
    }
    
    /// @see #rectangularLines()
    public VkPhysicalDeviceVulkan14Features rectangularLines(int rectangularLines) {
    	RECTANGULAR_LINES_HANDLE.set(segment, 0L, rectangularLines);
    	return this;
    }
    
    public int rectangularLines() {
    	return (int) RECTANGULAR_LINES_HANDLE.get(segment, 0L);
    }
    
    /// @see #bresenhamLines()
    public VkPhysicalDeviceVulkan14Features bresenhamLines(int bresenhamLines) {
    	BRESENHAM_LINES_HANDLE.set(segment, 0L, bresenhamLines);
    	return this;
    }
    
    public int bresenhamLines() {
    	return (int) BRESENHAM_LINES_HANDLE.get(segment, 0L);
    }
    
    /// @see #smoothLines()
    public VkPhysicalDeviceVulkan14Features smoothLines(int smoothLines) {
    	SMOOTH_LINES_HANDLE.set(segment, 0L, smoothLines);
    	return this;
    }
    
    public int smoothLines() {
    	return (int) SMOOTH_LINES_HANDLE.get(segment, 0L);
    }
    
    /// @see #stippledRectangularLines()
    public VkPhysicalDeviceVulkan14Features stippledRectangularLines(int stippledRectangularLines) {
    	STIPPLED_RECTANGULAR_LINES_HANDLE.set(segment, 0L, stippledRectangularLines);
    	return this;
    }
    
    public int stippledRectangularLines() {
    	return (int) STIPPLED_RECTANGULAR_LINES_HANDLE.get(segment, 0L);
    }
    
    /// @see #stippledBresenhamLines()
    public VkPhysicalDeviceVulkan14Features stippledBresenhamLines(int stippledBresenhamLines) {
    	STIPPLED_BRESENHAM_LINES_HANDLE.set(segment, 0L, stippledBresenhamLines);
    	return this;
    }
    
    public int stippledBresenhamLines() {
    	return (int) STIPPLED_BRESENHAM_LINES_HANDLE.get(segment, 0L);
    }
    
    /// @see #stippledSmoothLines()
    public VkPhysicalDeviceVulkan14Features stippledSmoothLines(int stippledSmoothLines) {
    	STIPPLED_SMOOTH_LINES_HANDLE.set(segment, 0L, stippledSmoothLines);
    	return this;
    }
    
    public int stippledSmoothLines() {
    	return (int) STIPPLED_SMOOTH_LINES_HANDLE.get(segment, 0L);
    }
    
    /// @see #vertexAttributeInstanceRateDivisor()
    public VkPhysicalDeviceVulkan14Features vertexAttributeInstanceRateDivisor(int vertexAttributeInstanceRateDivisor) {
    	VERTEX_ATTRIBUTE_INSTANCE_RATE_DIVISOR_HANDLE.set(segment, 0L, vertexAttributeInstanceRateDivisor);
    	return this;
    }
    
    public int vertexAttributeInstanceRateDivisor() {
    	return (int) VERTEX_ATTRIBUTE_INSTANCE_RATE_DIVISOR_HANDLE.get(segment, 0L);
    }
    
    /// @see #vertexAttributeInstanceRateZeroDivisor()
    public VkPhysicalDeviceVulkan14Features vertexAttributeInstanceRateZeroDivisor(int vertexAttributeInstanceRateZeroDivisor) {
    	VERTEX_ATTRIBUTE_INSTANCE_RATE_ZERO_DIVISOR_HANDLE.set(segment, 0L, vertexAttributeInstanceRateZeroDivisor);
    	return this;
    }
    
    public int vertexAttributeInstanceRateZeroDivisor() {
    	return (int) VERTEX_ATTRIBUTE_INSTANCE_RATE_ZERO_DIVISOR_HANDLE.get(segment, 0L);
    }
    
    /// @see #indexTypeUint8()
    public VkPhysicalDeviceVulkan14Features indexTypeUint8(int indexTypeUint8) {
    	INDEX_TYPE_UINT8_HANDLE.set(segment, 0L, indexTypeUint8);
    	return this;
    }
    
    public int indexTypeUint8() {
    	return (int) INDEX_TYPE_UINT8_HANDLE.get(segment, 0L);
    }
    
    /// @see #dynamicRenderingLocalRead()
    public VkPhysicalDeviceVulkan14Features dynamicRenderingLocalRead(int dynamicRenderingLocalRead) {
    	DYNAMIC_RENDERING_LOCAL_READ_HANDLE.set(segment, 0L, dynamicRenderingLocalRead);
    	return this;
    }
    
    public int dynamicRenderingLocalRead() {
    	return (int) DYNAMIC_RENDERING_LOCAL_READ_HANDLE.get(segment, 0L);
    }
    
    /// @see #maintenance5()
    public VkPhysicalDeviceVulkan14Features maintenance5(int maintenance5) {
    	MAINTENANCE5_HANDLE.set(segment, 0L, maintenance5);
    	return this;
    }
    
    public int maintenance5() {
    	return (int) MAINTENANCE5_HANDLE.get(segment, 0L);
    }
    
    /// @see #maintenance6()
    public VkPhysicalDeviceVulkan14Features maintenance6(int maintenance6) {
    	MAINTENANCE6_HANDLE.set(segment, 0L, maintenance6);
    	return this;
    }
    
    public int maintenance6() {
    	return (int) MAINTENANCE6_HANDLE.get(segment, 0L);
    }
    
    /// @see #pipelineProtectedAccess()
    public VkPhysicalDeviceVulkan14Features pipelineProtectedAccess(int pipelineProtectedAccess) {
    	PIPELINE_PROTECTED_ACCESS_HANDLE.set(segment, 0L, pipelineProtectedAccess);
    	return this;
    }
    
    public int pipelineProtectedAccess() {
    	return (int) PIPELINE_PROTECTED_ACCESS_HANDLE.get(segment, 0L);
    }
    
    /// @see #pipelineRobustness()
    public VkPhysicalDeviceVulkan14Features pipelineRobustness(int pipelineRobustness) {
    	PIPELINE_ROBUSTNESS_HANDLE.set(segment, 0L, pipelineRobustness);
    	return this;
    }
    
    public int pipelineRobustness() {
    	return (int) PIPELINE_ROBUSTNESS_HANDLE.get(segment, 0L);
    }
    
    /// @see #hostImageCopy()
    public VkPhysicalDeviceVulkan14Features hostImageCopy(int hostImageCopy) {
    	HOST_IMAGE_COPY_HANDLE.set(segment, 0L, hostImageCopy);
    	return this;
    }
    
    public int hostImageCopy() {
    	return (int) HOST_IMAGE_COPY_HANDLE.get(segment, 0L);
    }
    
    /// @see #pushDescriptor()
    public VkPhysicalDeviceVulkan14Features pushDescriptor(int pushDescriptor) {
    	PUSH_DESCRIPTOR_HANDLE.set(segment, 0L, pushDescriptor);
    	return this;
    }
    
    public int pushDescriptor() {
    	return (int) PUSH_DESCRIPTOR_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceVulkan14Features set(VkPhysicalDeviceVulkan14Features other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceVulkan14Features set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceVulkan14Features> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceVulkan14Features> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceVulkan14Features(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceVulkan14Features> array(Arena arena, VkPhysicalDeviceVulkan14Features... structs) {
        NativeStructArray<VkPhysicalDeviceVulkan14Features> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceVulkan14Features(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceVulkan14Features> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceVulkan14Features(segment)
        );
    }

}