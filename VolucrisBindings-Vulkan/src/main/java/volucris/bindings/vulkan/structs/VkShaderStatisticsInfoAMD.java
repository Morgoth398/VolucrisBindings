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
import java.util.function.Consumer;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;

public final class VkShaderStatisticsInfoAMD
		implements Struct<VkShaderStatisticsInfoAMD> {

	public static final StructLayout LAYOUT;

	public static final VarHandle SHADER_STAGE_MASK_HANDLE;
	public static final VarHandle NUM_PHYSICAL_VGPRS_HANDLE;
	public static final VarHandle NUM_PHYSICAL_SGPRS_HANDLE;
	public static final VarHandle NUM_AVAILABLE_VGPRS_HANDLE;
	public static final VarHandle NUM_AVAILABLE_SGPRS_HANDLE;
	public static final VarHandle COMPUTE_WORK_GROUP_SIZE_HANDLE;

	public static final long SHADER_STAGE_MASK_BYTE_OFFSET;
	public static final long RESOURCE_USAGE_BYTE_OFFSET;
	public static final long NUM_PHYSICAL_VGPRS_BYTE_OFFSET;
	public static final long NUM_PHYSICAL_SGPRS_BYTE_OFFSET;
	public static final long NUM_AVAILABLE_VGPRS_BYTE_OFFSET;
	public static final long NUM_AVAILABLE_SGPRS_BYTE_OFFSET;
	public static final long COMPUTE_WORK_GROUP_SIZE_BYTE_OFFSET;

	private final MemorySegment segment;

	private final VkShaderResourceUsageAMD resourceUsage;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("shaderStageMask"),
		    MemoryLayout.paddingLayout(4),
		    VkShaderResourceUsageAMD.LAYOUT.withName("resourceUsage"),
		    JAVA_INT.withName("numPhysicalVgprs"),
		    JAVA_INT.withName("numPhysicalSgprs"),
		    JAVA_INT.withName("numAvailableVgprs"),
		    JAVA_INT.withName("numAvailableSgprs"),
		    MemoryLayout.sequenceLayout(3, JAVA_INT).withName("computeWorkGroupSize"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkShaderStatisticsInfoAMD").withByteAlignment(8);
		
		SHADER_STAGE_MASK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderStageMask"));
		NUM_PHYSICAL_VGPRS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("numPhysicalVgprs"));
		NUM_PHYSICAL_SGPRS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("numPhysicalSgprs"));
		NUM_AVAILABLE_VGPRS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("numAvailableVgprs"));
		NUM_AVAILABLE_SGPRS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("numAvailableSgprs"));
		COMPUTE_WORK_GROUP_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("computeWorkGroupSize"), PathElement.sequenceElement());
		
		SHADER_STAGE_MASK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderStageMask"));
		RESOURCE_USAGE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("resourceUsage"));
		NUM_PHYSICAL_VGPRS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("numPhysicalVgprs"));
		NUM_PHYSICAL_SGPRS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("numPhysicalSgprs"));
		NUM_AVAILABLE_VGPRS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("numAvailableVgprs"));
		NUM_AVAILABLE_SGPRS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("numAvailableSgprs"));
		COMPUTE_WORK_GROUP_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("computeWorkGroupSize"));
		//@formatter:on
	}

	public VkShaderStatisticsInfoAMD() {
	    this(Arena.ofAuto());
	}
	
	public VkShaderStatisticsInfoAMD(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkShaderStatisticsInfoAMD(MemorySegment segment) {
	    this.segment = segment;
	
	    resourceUsage = new VkShaderResourceUsageAMD(segment.asSlice(RESOURCE_USAGE_BYTE_OFFSET, VkShaderResourceUsageAMD.LAYOUT));
	}

    /// @see #shaderStageMask()
    public VkShaderStatisticsInfoAMD shaderStageMask(int shaderStageMask) {
    	SHADER_STAGE_MASK_HANDLE.set(segment, 0L, shaderStageMask);
    	return this;
    }
    
    public int shaderStageMask() {
    	return (int) SHADER_STAGE_MASK_HANDLE.get(segment, 0L);
    }
    
    /// @see #resourceUsage()
    public VkShaderStatisticsInfoAMD resourceUsage(Consumer<VkShaderResourceUsageAMD> consumer) {
    	consumer.accept(resourceUsage);
    	return this;
    }
    
    /// @see #resourceUsage()
    public VkShaderStatisticsInfoAMD resourceUsage(VkShaderResourceUsageAMD other) {
    	resourceUsage.set(other);
    	return this;
    }
    
    public VkShaderResourceUsageAMD resourceUsage() {
    	return resourceUsage;
    }
    
    /// @see #numPhysicalVgprs()
    public VkShaderStatisticsInfoAMD numPhysicalVgprs(int numPhysicalVgprs) {
    	NUM_PHYSICAL_VGPRS_HANDLE.set(segment, 0L, numPhysicalVgprs);
    	return this;
    }
    
    public int numPhysicalVgprs() {
    	return (int) NUM_PHYSICAL_VGPRS_HANDLE.get(segment, 0L);
    }
    
    /// @see #numPhysicalSgprs()
    public VkShaderStatisticsInfoAMD numPhysicalSgprs(int numPhysicalSgprs) {
    	NUM_PHYSICAL_SGPRS_HANDLE.set(segment, 0L, numPhysicalSgprs);
    	return this;
    }
    
    public int numPhysicalSgprs() {
    	return (int) NUM_PHYSICAL_SGPRS_HANDLE.get(segment, 0L);
    }
    
    /// @see #numAvailableVgprs()
    public VkShaderStatisticsInfoAMD numAvailableVgprs(int numAvailableVgprs) {
    	NUM_AVAILABLE_VGPRS_HANDLE.set(segment, 0L, numAvailableVgprs);
    	return this;
    }
    
    public int numAvailableVgprs() {
    	return (int) NUM_AVAILABLE_VGPRS_HANDLE.get(segment, 0L);
    }
    
    /// @see #numAvailableSgprs()
    public VkShaderStatisticsInfoAMD numAvailableSgprs(int numAvailableSgprs) {
    	NUM_AVAILABLE_SGPRS_HANDLE.set(segment, 0L, numAvailableSgprs);
    	return this;
    }
    
    public int numAvailableSgprs() {
    	return (int) NUM_AVAILABLE_SGPRS_HANDLE.get(segment, 0L);
    }
    
    /// @see #computeWorkGroupSize(int)
    public VkShaderStatisticsInfoAMD computeWorkGroupSize(int computeWorkGroupSize, int index0) {
    	COMPUTE_WORK_GROUP_SIZE_HANDLE.set(segment, 0L, index0, computeWorkGroupSize);
    	return this;
    }
    
    public int computeWorkGroupSize(int index0) {
    	return (int) COMPUTE_WORK_GROUP_SIZE_HANDLE.get(segment, 0L, index0);
    }
    
    @Override
    public VkShaderStatisticsInfoAMD set(VkShaderStatisticsInfoAMD other) {
        return set(other.segment);
    }
    
    @Override
    public VkShaderStatisticsInfoAMD set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkShaderStatisticsInfoAMD> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkShaderStatisticsInfoAMD> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkShaderStatisticsInfoAMD(segment),
            count
        );
    }
    
    public static NativeStructArray<VkShaderStatisticsInfoAMD> array(SegmentAllocator allocator, VkShaderStatisticsInfoAMD... structs) {
        NativeStructArray<VkShaderStatisticsInfoAMD> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkShaderStatisticsInfoAMD(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkShaderStatisticsInfoAMD> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkShaderStatisticsInfoAMD(segment)
        );
    }

}