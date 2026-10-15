/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;

public final class VkPartitionedAccelerationStructureWriteInstanceDataNV
		implements Struct<VkPartitionedAccelerationStructureWriteInstanceDataNV> {

	public static final StructLayout LAYOUT;

	public static final VarHandle EXPLICIT_AABB_HANDLE;
	public static final VarHandle INSTANCE_ID_HANDLE;
	public static final VarHandle INSTANCE_MASK_HANDLE;
	public static final VarHandle INSTANCE_CONTRIBUTION_TO_HIT_GROUP_INDEX_HANDLE;
	public static final VarHandle INSTANCE_FLAGS_HANDLE;
	public static final VarHandle INSTANCE_INDEX_HANDLE;
	public static final VarHandle PARTITION_INDEX_HANDLE;
	public static final VarHandle ACCELERATION_STRUCTURE_HANDLE;

	public static final long TRANSFORM_BYTE_OFFSET;
	public static final long EXPLICIT_AABB_BYTE_OFFSET;
	public static final long INSTANCE_ID_BYTE_OFFSET;
	public static final long INSTANCE_MASK_BYTE_OFFSET;
	public static final long INSTANCE_CONTRIBUTION_TO_HIT_GROUP_INDEX_BYTE_OFFSET;
	public static final long INSTANCE_FLAGS_BYTE_OFFSET;
	public static final long INSTANCE_INDEX_BYTE_OFFSET;
	public static final long PARTITION_INDEX_BYTE_OFFSET;
	public static final long ACCELERATION_STRUCTURE_BYTE_OFFSET;

	private final MemorySegment segment;

	private final VkTransformMatrixKHR transform;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    VkTransformMatrixKHR.LAYOUT.withName("transform"),
		    MemoryLayout.sequenceLayout(6, JAVA_FLOAT).withName("explicitAABB"),
		    JAVA_INT.withName("instanceID"),
		    JAVA_INT.withName("instanceMask"),
		    JAVA_INT.withName("instanceContributionToHitGroupIndex"),
		    JAVA_INT.withName("instanceFlags"),
		    JAVA_INT.withName("instanceIndex"),
		    JAVA_INT.withName("partitionIndex"),
		    JAVA_LONG.withName("accelerationStructure")
		).withName("VkPartitionedAccelerationStructureWriteInstanceDataNV").withByteAlignment(8);
		
		EXPLICIT_AABB_HANDLE = LAYOUT.varHandle(PathElement.groupElement("explicitAABB"), PathElement.sequenceElement());
		INSTANCE_ID_HANDLE = LAYOUT.varHandle(PathElement.groupElement("instanceID"));
		INSTANCE_MASK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("instanceMask"));
		INSTANCE_CONTRIBUTION_TO_HIT_GROUP_INDEX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("instanceContributionToHitGroupIndex"));
		INSTANCE_FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("instanceFlags"));
		INSTANCE_INDEX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("instanceIndex"));
		PARTITION_INDEX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("partitionIndex"));
		ACCELERATION_STRUCTURE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("accelerationStructure"));
		
		TRANSFORM_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("transform"));
		EXPLICIT_AABB_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("explicitAABB"));
		INSTANCE_ID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("instanceID"));
		INSTANCE_MASK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("instanceMask"));
		INSTANCE_CONTRIBUTION_TO_HIT_GROUP_INDEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("instanceContributionToHitGroupIndex"));
		INSTANCE_FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("instanceFlags"));
		INSTANCE_INDEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("instanceIndex"));
		PARTITION_INDEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("partitionIndex"));
		ACCELERATION_STRUCTURE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("accelerationStructure"));
		//@formatter:on
	}

	public VkPartitionedAccelerationStructureWriteInstanceDataNV() {
	    this(Arena.ofAuto());
	}
	
	public VkPartitionedAccelerationStructureWriteInstanceDataNV(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPartitionedAccelerationStructureWriteInstanceDataNV(MemorySegment segment) {
	    this.segment = segment;
	
	    transform = new VkTransformMatrixKHR(segment.asSlice(TRANSFORM_BYTE_OFFSET, VkTransformMatrixKHR.LAYOUT));
	}

    /// @see #transform()
    public VkPartitionedAccelerationStructureWriteInstanceDataNV transform(Consumer<VkTransformMatrixKHR> consumer) {
    	consumer.accept(transform);
    	return this;
    }
    
    /// @see #transform()
    public VkPartitionedAccelerationStructureWriteInstanceDataNV transform(VkTransformMatrixKHR other) {
    	transform.set(other);
    	return this;
    }
    
    public VkTransformMatrixKHR transform() {
    	return transform;
    }
    
    /// @see #explicitAABB(int)
    public VkPartitionedAccelerationStructureWriteInstanceDataNV explicitAABB(float explicitAABB, int index0) {
    	EXPLICIT_AABB_HANDLE.set(segment, 0L, index0, explicitAABB);
    	return this;
    }
    
    public float explicitAABB(int index0) {
    	return (float) EXPLICIT_AABB_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #instanceID()
    public VkPartitionedAccelerationStructureWriteInstanceDataNV instanceID(int instanceID) {
    	INSTANCE_ID_HANDLE.set(segment, 0L, instanceID);
    	return this;
    }
    
    public int instanceID() {
    	return (int) INSTANCE_ID_HANDLE.get(segment, 0L);
    }
    
    /// @see #instanceMask()
    public VkPartitionedAccelerationStructureWriteInstanceDataNV instanceMask(int instanceMask) {
    	INSTANCE_MASK_HANDLE.set(segment, 0L, instanceMask);
    	return this;
    }
    
    public int instanceMask() {
    	return (int) INSTANCE_MASK_HANDLE.get(segment, 0L);
    }
    
    /// @see #instanceContributionToHitGroupIndex()
    public VkPartitionedAccelerationStructureWriteInstanceDataNV instanceContributionToHitGroupIndex(int instanceContributionToHitGroupIndex) {
    	INSTANCE_CONTRIBUTION_TO_HIT_GROUP_INDEX_HANDLE.set(segment, 0L, instanceContributionToHitGroupIndex);
    	return this;
    }
    
    public int instanceContributionToHitGroupIndex() {
    	return (int) INSTANCE_CONTRIBUTION_TO_HIT_GROUP_INDEX_HANDLE.get(segment, 0L);
    }
    
    /// @see #instanceFlags()
    public VkPartitionedAccelerationStructureWriteInstanceDataNV instanceFlags(int instanceFlags) {
    	INSTANCE_FLAGS_HANDLE.set(segment, 0L, instanceFlags);
    	return this;
    }
    
    public int instanceFlags() {
    	return (int) INSTANCE_FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #instanceIndex()
    public VkPartitionedAccelerationStructureWriteInstanceDataNV instanceIndex(int instanceIndex) {
    	INSTANCE_INDEX_HANDLE.set(segment, 0L, instanceIndex);
    	return this;
    }
    
    public int instanceIndex() {
    	return (int) INSTANCE_INDEX_HANDLE.get(segment, 0L);
    }
    
    /// @see #partitionIndex()
    public VkPartitionedAccelerationStructureWriteInstanceDataNV partitionIndex(int partitionIndex) {
    	PARTITION_INDEX_HANDLE.set(segment, 0L, partitionIndex);
    	return this;
    }
    
    public int partitionIndex() {
    	return (int) PARTITION_INDEX_HANDLE.get(segment, 0L);
    }
    
    /// @see #accelerationStructure()
    public VkPartitionedAccelerationStructureWriteInstanceDataNV accelerationStructure(long accelerationStructure) {
    	ACCELERATION_STRUCTURE_HANDLE.set(segment, 0L, accelerationStructure);
    	return this;
    }
    
    public long accelerationStructure() {
    	return (long) ACCELERATION_STRUCTURE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPartitionedAccelerationStructureWriteInstanceDataNV set(VkPartitionedAccelerationStructureWriteInstanceDataNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkPartitionedAccelerationStructureWriteInstanceDataNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPartitionedAccelerationStructureWriteInstanceDataNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPartitionedAccelerationStructureWriteInstanceDataNV> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPartitionedAccelerationStructureWriteInstanceDataNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPartitionedAccelerationStructureWriteInstanceDataNV> array(Arena arena, VkPartitionedAccelerationStructureWriteInstanceDataNV... structs) {
        NativeStructArray<VkPartitionedAccelerationStructureWriteInstanceDataNV> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPartitionedAccelerationStructureWriteInstanceDataNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPartitionedAccelerationStructureWriteInstanceDataNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPartitionedAccelerationStructureWriteInstanceDataNV(segment)
        );
    }

}