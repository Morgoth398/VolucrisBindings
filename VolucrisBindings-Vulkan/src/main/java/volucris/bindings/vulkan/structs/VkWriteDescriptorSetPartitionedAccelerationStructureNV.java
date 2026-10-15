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
import volucris.bindings.core.NativeLongArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkWriteDescriptorSetPartitionedAccelerationStructureNV
		implements Struct<VkWriteDescriptorSetPartitionedAccelerationStructureNV> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle ACCELERATION_STRUCTURE_COUNT_HANDLE;
	public static final VarHandle P_ACCELERATION_STRUCTURES_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long ACCELERATION_STRUCTURE_COUNT_BYTE_OFFSET;
	public static final long P_ACCELERATION_STRUCTURES_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("accelerationStructureCount"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pAccelerationStructures")
		).withName("VkWriteDescriptorSetPartitionedAccelerationStructureNV").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		ACCELERATION_STRUCTURE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("accelerationStructureCount"));
		P_ACCELERATION_STRUCTURES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pAccelerationStructures"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		ACCELERATION_STRUCTURE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("accelerationStructureCount"));
		P_ACCELERATION_STRUCTURES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pAccelerationStructures"));
		//@formatter:on
	}

	public VkWriteDescriptorSetPartitionedAccelerationStructureNV() {
	    this(Arena.ofAuto());
	}
	
	public VkWriteDescriptorSetPartitionedAccelerationStructureNV(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkWriteDescriptorSetPartitionedAccelerationStructureNV(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkWriteDescriptorSetPartitionedAccelerationStructureNV sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkWriteDescriptorSetPartitionedAccelerationStructureNV pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #accelerationStructureCount()
    public VkWriteDescriptorSetPartitionedAccelerationStructureNV accelerationStructureCount(int accelerationStructureCount) {
    	ACCELERATION_STRUCTURE_COUNT_HANDLE.set(segment, 0L, accelerationStructureCount);
    	return this;
    }
    
    public int accelerationStructureCount() {
    	return (int) ACCELERATION_STRUCTURE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pAccelerationStructures()
    public VkWriteDescriptorSetPartitionedAccelerationStructureNV pAccelerationStructures(NativeLongArray pAccelerationStructures) {
    	P_ACCELERATION_STRUCTURES_HANDLE.set(segment, 0L, pAccelerationStructures.memorySegment());
    	return this;
    }
    
    public @Nullable NativeLongArray pAccelerationStructures() {
    	MemorySegment segment = (MemorySegment) P_ACCELERATION_STRUCTURES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeLongArray(segment);
    }
    
    @Override
    public VkWriteDescriptorSetPartitionedAccelerationStructureNV set(VkWriteDescriptorSetPartitionedAccelerationStructureNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkWriteDescriptorSetPartitionedAccelerationStructureNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkWriteDescriptorSetPartitionedAccelerationStructureNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkWriteDescriptorSetPartitionedAccelerationStructureNV> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkWriteDescriptorSetPartitionedAccelerationStructureNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkWriteDescriptorSetPartitionedAccelerationStructureNV> array(Arena arena, VkWriteDescriptorSetPartitionedAccelerationStructureNV... structs) {
        NativeStructArray<VkWriteDescriptorSetPartitionedAccelerationStructureNV> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkWriteDescriptorSetPartitionedAccelerationStructureNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkWriteDescriptorSetPartitionedAccelerationStructureNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkWriteDescriptorSetPartitionedAccelerationStructureNV(segment)
        );
    }

}