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

public final class VkPartitionedAccelerationStructureUpdateInstanceDataNV
		implements Struct<VkPartitionedAccelerationStructureUpdateInstanceDataNV> {

    public static final StructLayout LAYOUT;

    public static final VarHandle INSTANCE_INDEX_HANDLE;
    public static final VarHandle INSTANCE_CONTRIBUTION_TO_HIT_GROUP_INDEX_HANDLE;
    public static final VarHandle ACCELERATION_STRUCTURE_HANDLE;

    public static final long INSTANCE_INDEX_BYTE_OFFSET;
    public static final long INSTANCE_CONTRIBUTION_TO_HIT_GROUP_INDEX_BYTE_OFFSET;
    public static final long ACCELERATION_STRUCTURE_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("instanceIndex"),
            JAVA_INT.withName("instanceContributionToHitGroupIndex"),
            JAVA_LONG.withName("accelerationStructure")
        ).withName("VkPartitionedAccelerationStructureUpdateInstanceDataNV").withByteAlignment(8);
        
        INSTANCE_INDEX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("instanceIndex"));
        INSTANCE_CONTRIBUTION_TO_HIT_GROUP_INDEX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("instanceContributionToHitGroupIndex"));
        ACCELERATION_STRUCTURE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("accelerationStructure"));
        
        INSTANCE_INDEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("instanceIndex"));
        INSTANCE_CONTRIBUTION_TO_HIT_GROUP_INDEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("instanceContributionToHitGroupIndex"));
        ACCELERATION_STRUCTURE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("accelerationStructure"));
        //@formatter:on
    }

    public VkPartitionedAccelerationStructureUpdateInstanceDataNV() {
        this(Arena.ofAuto());
    }
    
    public VkPartitionedAccelerationStructureUpdateInstanceDataNV(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkPartitionedAccelerationStructureUpdateInstanceDataNV(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #instanceIndex()
    public VkPartitionedAccelerationStructureUpdateInstanceDataNV instanceIndex(int instanceIndex) {
    	INSTANCE_INDEX_HANDLE.set(segment, 0L, instanceIndex);
    	return this;
    }
    
    public int instanceIndex() {
    	return (int) INSTANCE_INDEX_HANDLE.get(segment, 0L);
    }
    
    /// @see #instanceContributionToHitGroupIndex()
    public VkPartitionedAccelerationStructureUpdateInstanceDataNV instanceContributionToHitGroupIndex(int instanceContributionToHitGroupIndex) {
    	INSTANCE_CONTRIBUTION_TO_HIT_GROUP_INDEX_HANDLE.set(segment, 0L, instanceContributionToHitGroupIndex);
    	return this;
    }
    
    public int instanceContributionToHitGroupIndex() {
    	return (int) INSTANCE_CONTRIBUTION_TO_HIT_GROUP_INDEX_HANDLE.get(segment, 0L);
    }
    
    /// @see #accelerationStructure()
    public VkPartitionedAccelerationStructureUpdateInstanceDataNV accelerationStructure(long accelerationStructure) {
    	ACCELERATION_STRUCTURE_HANDLE.set(segment, 0L, accelerationStructure);
    	return this;
    }
    
    public long accelerationStructure() {
    	return (long) ACCELERATION_STRUCTURE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPartitionedAccelerationStructureUpdateInstanceDataNV set(VkPartitionedAccelerationStructureUpdateInstanceDataNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkPartitionedAccelerationStructureUpdateInstanceDataNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPartitionedAccelerationStructureUpdateInstanceDataNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPartitionedAccelerationStructureUpdateInstanceDataNV> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPartitionedAccelerationStructureUpdateInstanceDataNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPartitionedAccelerationStructureUpdateInstanceDataNV> array(Arena arena, VkPartitionedAccelerationStructureUpdateInstanceDataNV... structs) {
        NativeStructArray<VkPartitionedAccelerationStructureUpdateInstanceDataNV> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPartitionedAccelerationStructureUpdateInstanceDataNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPartitionedAccelerationStructureUpdateInstanceDataNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPartitionedAccelerationStructureUpdateInstanceDataNV(segment)
        );
    }
    
}