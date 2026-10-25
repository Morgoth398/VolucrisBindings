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

public final class VkBuildPartitionedAccelerationStructureIndirectCommandNV
		implements Struct<VkBuildPartitionedAccelerationStructureIndirectCommandNV> {

	public static final StructLayout LAYOUT;

	public static final VarHandle OP_TYPE_HANDLE;
	public static final VarHandle ARG_COUNT_HANDLE;

	public static final long OP_TYPE_BYTE_OFFSET;
	public static final long ARG_COUNT_BYTE_OFFSET;
	public static final long ARG_DATA_BYTE_OFFSET;

	private final MemorySegment segment;

	private final VkStridedDeviceAddressNV argData;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("opType"),
		    JAVA_INT.withName("argCount"),
		    VkStridedDeviceAddressNV.LAYOUT.withName("argData")
		).withName("VkBuildPartitionedAccelerationStructureIndirectCommandNV").withByteAlignment(8);
		
		OP_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("opType"));
		ARG_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("argCount"));
		
		OP_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("opType"));
		ARG_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("argCount"));
		ARG_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("argData"));
		//@formatter:on
	}

	public VkBuildPartitionedAccelerationStructureIndirectCommandNV() {
	    this(Arena.ofAuto());
	}
	
	public VkBuildPartitionedAccelerationStructureIndirectCommandNV(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkBuildPartitionedAccelerationStructureIndirectCommandNV(MemorySegment segment) {
	    this.segment = segment;
	
	    argData = new VkStridedDeviceAddressNV(segment.asSlice(ARG_DATA_BYTE_OFFSET, VkStridedDeviceAddressNV.LAYOUT));
	}

    /// @see #opType()
    public VkBuildPartitionedAccelerationStructureIndirectCommandNV opType(int opType) {
    	OP_TYPE_HANDLE.set(segment, 0L, opType);
    	return this;
    }
    
    public int opType() {
    	return (int) OP_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #argCount()
    public VkBuildPartitionedAccelerationStructureIndirectCommandNV argCount(int argCount) {
    	ARG_COUNT_HANDLE.set(segment, 0L, argCount);
    	return this;
    }
    
    public int argCount() {
    	return (int) ARG_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #argData()
    public VkBuildPartitionedAccelerationStructureIndirectCommandNV argData(Consumer<VkStridedDeviceAddressNV> consumer) {
    	consumer.accept(argData);
    	return this;
    }
    
    /// @see #argData()
    public VkBuildPartitionedAccelerationStructureIndirectCommandNV argData(VkStridedDeviceAddressNV other) {
    	argData.set(other);
    	return this;
    }
    
    public VkStridedDeviceAddressNV argData() {
    	return argData;
    }
    
    @Override
    public VkBuildPartitionedAccelerationStructureIndirectCommandNV set(VkBuildPartitionedAccelerationStructureIndirectCommandNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkBuildPartitionedAccelerationStructureIndirectCommandNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkBuildPartitionedAccelerationStructureIndirectCommandNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkBuildPartitionedAccelerationStructureIndirectCommandNV> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkBuildPartitionedAccelerationStructureIndirectCommandNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkBuildPartitionedAccelerationStructureIndirectCommandNV> array(SegmentAllocator allocator, VkBuildPartitionedAccelerationStructureIndirectCommandNV... structs) {
        NativeStructArray<VkBuildPartitionedAccelerationStructureIndirectCommandNV> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkBuildPartitionedAccelerationStructureIndirectCommandNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkBuildPartitionedAccelerationStructureIndirectCommandNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkBuildPartitionedAccelerationStructureIndirectCommandNV(segment)
        );
    }

}