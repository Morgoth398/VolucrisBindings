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

public final class VkClusterAccelerationStructureMoveObjectsInfoNV
		implements Struct<VkClusterAccelerationStructureMoveObjectsInfoNV> {

	public static final StructLayout LAYOUT;

	public static final VarHandle SRC_ACCELERATION_STRUCTURE_HANDLE;

	public static final long SRC_ACCELERATION_STRUCTURE_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_LONG.withName("srcAccelerationStructure")
		).withName("VkClusterAccelerationStructureMoveObjectsInfoNV").withByteAlignment(8);
		
		SRC_ACCELERATION_STRUCTURE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("srcAccelerationStructure"));
		
		SRC_ACCELERATION_STRUCTURE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("srcAccelerationStructure"));
		//@formatter:on
	}

	public VkClusterAccelerationStructureMoveObjectsInfoNV() {
	    this(Arena.ofAuto());
	}
	
	public VkClusterAccelerationStructureMoveObjectsInfoNV(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkClusterAccelerationStructureMoveObjectsInfoNV(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #srcAccelerationStructure()
    public VkClusterAccelerationStructureMoveObjectsInfoNV srcAccelerationStructure(long srcAccelerationStructure) {
    	SRC_ACCELERATION_STRUCTURE_HANDLE.set(segment, 0L, srcAccelerationStructure);
    	return this;
    }
    
    public long srcAccelerationStructure() {
    	return (long) SRC_ACCELERATION_STRUCTURE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkClusterAccelerationStructureMoveObjectsInfoNV set(VkClusterAccelerationStructureMoveObjectsInfoNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkClusterAccelerationStructureMoveObjectsInfoNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkClusterAccelerationStructureMoveObjectsInfoNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkClusterAccelerationStructureMoveObjectsInfoNV> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkClusterAccelerationStructureMoveObjectsInfoNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkClusterAccelerationStructureMoveObjectsInfoNV> array(Arena arena, VkClusterAccelerationStructureMoveObjectsInfoNV... structs) {
        NativeStructArray<VkClusterAccelerationStructureMoveObjectsInfoNV> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkClusterAccelerationStructureMoveObjectsInfoNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkClusterAccelerationStructureMoveObjectsInfoNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkClusterAccelerationStructureMoveObjectsInfoNV(segment)
        );
    }

}