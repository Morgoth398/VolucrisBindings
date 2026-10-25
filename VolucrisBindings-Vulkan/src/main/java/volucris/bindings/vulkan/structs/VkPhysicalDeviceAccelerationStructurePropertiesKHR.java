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

public final class VkPhysicalDeviceAccelerationStructurePropertiesKHR
		implements Struct<VkPhysicalDeviceAccelerationStructurePropertiesKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle MAX_GEOMETRY_COUNT_HANDLE;
	public static final VarHandle MAX_INSTANCE_COUNT_HANDLE;
	public static final VarHandle MAX_PRIMITIVE_COUNT_HANDLE;
	public static final VarHandle MAX_PER_STAGE_DESCRIPTOR_ACCELERATION_STRUCTURES_HANDLE;
	public static final VarHandle MAX_PER_STAGE_DESCRIPTOR_UPDATE_AFTER_BIND_ACCELERATION_STRUCTURES_HANDLE;
	public static final VarHandle MAX_DESCRIPTOR_SET_ACCELERATION_STRUCTURES_HANDLE;
	public static final VarHandle MAX_DESCRIPTOR_SET_UPDATE_AFTER_BIND_ACCELERATION_STRUCTURES_HANDLE;
	public static final VarHandle MIN_ACCELERATION_STRUCTURE_SCRATCH_OFFSET_ALIGNMENT_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long MAX_GEOMETRY_COUNT_BYTE_OFFSET;
	public static final long MAX_INSTANCE_COUNT_BYTE_OFFSET;
	public static final long MAX_PRIMITIVE_COUNT_BYTE_OFFSET;
	public static final long MAX_PER_STAGE_DESCRIPTOR_ACCELERATION_STRUCTURES_BYTE_OFFSET;
	public static final long MAX_PER_STAGE_DESCRIPTOR_UPDATE_AFTER_BIND_ACCELERATION_STRUCTURES_BYTE_OFFSET;
	public static final long MAX_DESCRIPTOR_SET_ACCELERATION_STRUCTURES_BYTE_OFFSET;
	public static final long MAX_DESCRIPTOR_SET_UPDATE_AFTER_BIND_ACCELERATION_STRUCTURES_BYTE_OFFSET;
	public static final long MIN_ACCELERATION_STRUCTURE_SCRATCH_OFFSET_ALIGNMENT_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_LONG.withName("maxGeometryCount"),
		    JAVA_LONG.withName("maxInstanceCount"),
		    JAVA_LONG.withName("maxPrimitiveCount"),
		    JAVA_INT.withName("maxPerStageDescriptorAccelerationStructures"),
		    JAVA_INT.withName("maxPerStageDescriptorUpdateAfterBindAccelerationStructures"),
		    JAVA_INT.withName("maxDescriptorSetAccelerationStructures"),
		    JAVA_INT.withName("maxDescriptorSetUpdateAfterBindAccelerationStructures"),
		    JAVA_INT.withName("minAccelerationStructureScratchOffsetAlignment"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPhysicalDeviceAccelerationStructurePropertiesKHR").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		MAX_GEOMETRY_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxGeometryCount"));
		MAX_INSTANCE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxInstanceCount"));
		MAX_PRIMITIVE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxPrimitiveCount"));
		MAX_PER_STAGE_DESCRIPTOR_ACCELERATION_STRUCTURES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxPerStageDescriptorAccelerationStructures"));
		MAX_PER_STAGE_DESCRIPTOR_UPDATE_AFTER_BIND_ACCELERATION_STRUCTURES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindAccelerationStructures"));
		MAX_DESCRIPTOR_SET_ACCELERATION_STRUCTURES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxDescriptorSetAccelerationStructures"));
		MAX_DESCRIPTOR_SET_UPDATE_AFTER_BIND_ACCELERATION_STRUCTURES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxDescriptorSetUpdateAfterBindAccelerationStructures"));
		MIN_ACCELERATION_STRUCTURE_SCRATCH_OFFSET_ALIGNMENT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("minAccelerationStructureScratchOffsetAlignment"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		MAX_GEOMETRY_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxGeometryCount"));
		MAX_INSTANCE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxInstanceCount"));
		MAX_PRIMITIVE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxPrimitiveCount"));
		MAX_PER_STAGE_DESCRIPTOR_ACCELERATION_STRUCTURES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxPerStageDescriptorAccelerationStructures"));
		MAX_PER_STAGE_DESCRIPTOR_UPDATE_AFTER_BIND_ACCELERATION_STRUCTURES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindAccelerationStructures"));
		MAX_DESCRIPTOR_SET_ACCELERATION_STRUCTURES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetAccelerationStructures"));
		MAX_DESCRIPTOR_SET_UPDATE_AFTER_BIND_ACCELERATION_STRUCTURES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetUpdateAfterBindAccelerationStructures"));
		MIN_ACCELERATION_STRUCTURE_SCRATCH_OFFSET_ALIGNMENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("minAccelerationStructureScratchOffsetAlignment"));
		//@formatter:on
	}

	public VkPhysicalDeviceAccelerationStructurePropertiesKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceAccelerationStructurePropertiesKHR(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceAccelerationStructurePropertiesKHR(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceAccelerationStructurePropertiesKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceAccelerationStructurePropertiesKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #maxGeometryCount()
    public VkPhysicalDeviceAccelerationStructurePropertiesKHR maxGeometryCount(long maxGeometryCount) {
    	MAX_GEOMETRY_COUNT_HANDLE.set(segment, 0L, maxGeometryCount);
    	return this;
    }
    
    public long maxGeometryCount() {
    	return (long) MAX_GEOMETRY_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxInstanceCount()
    public VkPhysicalDeviceAccelerationStructurePropertiesKHR maxInstanceCount(long maxInstanceCount) {
    	MAX_INSTANCE_COUNT_HANDLE.set(segment, 0L, maxInstanceCount);
    	return this;
    }
    
    public long maxInstanceCount() {
    	return (long) MAX_INSTANCE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxPrimitiveCount()
    public VkPhysicalDeviceAccelerationStructurePropertiesKHR maxPrimitiveCount(long maxPrimitiveCount) {
    	MAX_PRIMITIVE_COUNT_HANDLE.set(segment, 0L, maxPrimitiveCount);
    	return this;
    }
    
    public long maxPrimitiveCount() {
    	return (long) MAX_PRIMITIVE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxPerStageDescriptorAccelerationStructures()
    public VkPhysicalDeviceAccelerationStructurePropertiesKHR maxPerStageDescriptorAccelerationStructures(int maxPerStageDescriptorAccelerationStructures) {
    	MAX_PER_STAGE_DESCRIPTOR_ACCELERATION_STRUCTURES_HANDLE.set(segment, 0L, maxPerStageDescriptorAccelerationStructures);
    	return this;
    }
    
    public int maxPerStageDescriptorAccelerationStructures() {
    	return (int) MAX_PER_STAGE_DESCRIPTOR_ACCELERATION_STRUCTURES_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxPerStageDescriptorUpdateAfterBindAccelerationStructures()
    public VkPhysicalDeviceAccelerationStructurePropertiesKHR maxPerStageDescriptorUpdateAfterBindAccelerationStructures(int maxPerStageDescriptorUpdateAfterBindAccelerationStructures) {
    	MAX_PER_STAGE_DESCRIPTOR_UPDATE_AFTER_BIND_ACCELERATION_STRUCTURES_HANDLE.set(segment, 0L, maxPerStageDescriptorUpdateAfterBindAccelerationStructures);
    	return this;
    }
    
    public int maxPerStageDescriptorUpdateAfterBindAccelerationStructures() {
    	return (int) MAX_PER_STAGE_DESCRIPTOR_UPDATE_AFTER_BIND_ACCELERATION_STRUCTURES_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxDescriptorSetAccelerationStructures()
    public VkPhysicalDeviceAccelerationStructurePropertiesKHR maxDescriptorSetAccelerationStructures(int maxDescriptorSetAccelerationStructures) {
    	MAX_DESCRIPTOR_SET_ACCELERATION_STRUCTURES_HANDLE.set(segment, 0L, maxDescriptorSetAccelerationStructures);
    	return this;
    }
    
    public int maxDescriptorSetAccelerationStructures() {
    	return (int) MAX_DESCRIPTOR_SET_ACCELERATION_STRUCTURES_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxDescriptorSetUpdateAfterBindAccelerationStructures()
    public VkPhysicalDeviceAccelerationStructurePropertiesKHR maxDescriptorSetUpdateAfterBindAccelerationStructures(int maxDescriptorSetUpdateAfterBindAccelerationStructures) {
    	MAX_DESCRIPTOR_SET_UPDATE_AFTER_BIND_ACCELERATION_STRUCTURES_HANDLE.set(segment, 0L, maxDescriptorSetUpdateAfterBindAccelerationStructures);
    	return this;
    }
    
    public int maxDescriptorSetUpdateAfterBindAccelerationStructures() {
    	return (int) MAX_DESCRIPTOR_SET_UPDATE_AFTER_BIND_ACCELERATION_STRUCTURES_HANDLE.get(segment, 0L);
    }
    
    /// @see #minAccelerationStructureScratchOffsetAlignment()
    public VkPhysicalDeviceAccelerationStructurePropertiesKHR minAccelerationStructureScratchOffsetAlignment(int minAccelerationStructureScratchOffsetAlignment) {
    	MIN_ACCELERATION_STRUCTURE_SCRATCH_OFFSET_ALIGNMENT_HANDLE.set(segment, 0L, minAccelerationStructureScratchOffsetAlignment);
    	return this;
    }
    
    public int minAccelerationStructureScratchOffsetAlignment() {
    	return (int) MIN_ACCELERATION_STRUCTURE_SCRATCH_OFFSET_ALIGNMENT_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceAccelerationStructurePropertiesKHR set(VkPhysicalDeviceAccelerationStructurePropertiesKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceAccelerationStructurePropertiesKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceAccelerationStructurePropertiesKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceAccelerationStructurePropertiesKHR> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceAccelerationStructurePropertiesKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceAccelerationStructurePropertiesKHR> array(SegmentAllocator allocator, VkPhysicalDeviceAccelerationStructurePropertiesKHR... structs) {
        NativeStructArray<VkPhysicalDeviceAccelerationStructurePropertiesKHR> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceAccelerationStructurePropertiesKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceAccelerationStructurePropertiesKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceAccelerationStructurePropertiesKHR(segment)
        );
    }

}