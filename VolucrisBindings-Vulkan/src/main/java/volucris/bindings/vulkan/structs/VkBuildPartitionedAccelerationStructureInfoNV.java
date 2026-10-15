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
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkBuildPartitionedAccelerationStructureInfoNV
		implements Struct<VkBuildPartitionedAccelerationStructureInfoNV> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle SRC_ACCELERATION_STRUCTURE_DATA_HANDLE;
	public static final VarHandle DST_ACCELERATION_STRUCTURE_DATA_HANDLE;
	public static final VarHandle SCRATCH_DATA_HANDLE;
	public static final VarHandle SRC_INFOS_HANDLE;
	public static final VarHandle SRC_INFOS_COUNT_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long INPUT_BYTE_OFFSET;
	public static final long SRC_ACCELERATION_STRUCTURE_DATA_BYTE_OFFSET;
	public static final long DST_ACCELERATION_STRUCTURE_DATA_BYTE_OFFSET;
	public static final long SCRATCH_DATA_BYTE_OFFSET;
	public static final long SRC_INFOS_BYTE_OFFSET;
	public static final long SRC_INFOS_COUNT_BYTE_OFFSET;

	private final MemorySegment segment;

	private final VkPartitionedAccelerationStructureInstancesInputNV input;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    VkPartitionedAccelerationStructureInstancesInputNV.LAYOUT.withName("input"),
		    JAVA_LONG.withName("srcAccelerationStructureData"),
		    JAVA_LONG.withName("dstAccelerationStructureData"),
		    JAVA_LONG.withName("scratchData"),
		    JAVA_LONG.withName("srcInfos"),
		    JAVA_LONG.withName("srcInfosCount")
		).withName("VkBuildPartitionedAccelerationStructureInfoNV").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		SRC_ACCELERATION_STRUCTURE_DATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("srcAccelerationStructureData"));
		DST_ACCELERATION_STRUCTURE_DATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("dstAccelerationStructureData"));
		SCRATCH_DATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("scratchData"));
		SRC_INFOS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("srcInfos"));
		SRC_INFOS_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("srcInfosCount"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		INPUT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("input"));
		SRC_ACCELERATION_STRUCTURE_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("srcAccelerationStructureData"));
		DST_ACCELERATION_STRUCTURE_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dstAccelerationStructureData"));
		SCRATCH_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("scratchData"));
		SRC_INFOS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("srcInfos"));
		SRC_INFOS_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("srcInfosCount"));
		//@formatter:on
	}

	public VkBuildPartitionedAccelerationStructureInfoNV() {
	    this(Arena.ofAuto());
	}
	
	public VkBuildPartitionedAccelerationStructureInfoNV(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkBuildPartitionedAccelerationStructureInfoNV(MemorySegment segment) {
	    this.segment = segment;
	
	    input = new VkPartitionedAccelerationStructureInstancesInputNV(segment.asSlice(INPUT_BYTE_OFFSET, VkPartitionedAccelerationStructureInstancesInputNV.LAYOUT));
	}

    /// @see #sType()
    public VkBuildPartitionedAccelerationStructureInfoNV sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkBuildPartitionedAccelerationStructureInfoNV pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #input()
    public VkBuildPartitionedAccelerationStructureInfoNV input(Consumer<VkPartitionedAccelerationStructureInstancesInputNV> consumer) {
    	consumer.accept(input);
    	return this;
    }
    
    /// @see #input()
    public VkBuildPartitionedAccelerationStructureInfoNV input(VkPartitionedAccelerationStructureInstancesInputNV other) {
    	input.set(other);
    	return this;
    }
    
    public VkPartitionedAccelerationStructureInstancesInputNV input() {
    	return input;
    }
    
    /// @see #srcAccelerationStructureData()
    public VkBuildPartitionedAccelerationStructureInfoNV srcAccelerationStructureData(long srcAccelerationStructureData) {
    	SRC_ACCELERATION_STRUCTURE_DATA_HANDLE.set(segment, 0L, srcAccelerationStructureData);
    	return this;
    }
    
    public long srcAccelerationStructureData() {
    	return (long) SRC_ACCELERATION_STRUCTURE_DATA_HANDLE.get(segment, 0L);
    }
    
    /// @see #dstAccelerationStructureData()
    public VkBuildPartitionedAccelerationStructureInfoNV dstAccelerationStructureData(long dstAccelerationStructureData) {
    	DST_ACCELERATION_STRUCTURE_DATA_HANDLE.set(segment, 0L, dstAccelerationStructureData);
    	return this;
    }
    
    public long dstAccelerationStructureData() {
    	return (long) DST_ACCELERATION_STRUCTURE_DATA_HANDLE.get(segment, 0L);
    }
    
    /// @see #scratchData()
    public VkBuildPartitionedAccelerationStructureInfoNV scratchData(long scratchData) {
    	SCRATCH_DATA_HANDLE.set(segment, 0L, scratchData);
    	return this;
    }
    
    public long scratchData() {
    	return (long) SCRATCH_DATA_HANDLE.get(segment, 0L);
    }
    
    /// @see #srcInfos()
    public VkBuildPartitionedAccelerationStructureInfoNV srcInfos(long srcInfos) {
    	SRC_INFOS_HANDLE.set(segment, 0L, srcInfos);
    	return this;
    }
    
    public long srcInfos() {
    	return (long) SRC_INFOS_HANDLE.get(segment, 0L);
    }
    
    /// @see #srcInfosCount()
    public VkBuildPartitionedAccelerationStructureInfoNV srcInfosCount(long srcInfosCount) {
    	SRC_INFOS_COUNT_HANDLE.set(segment, 0L, srcInfosCount);
    	return this;
    }
    
    public long srcInfosCount() {
    	return (long) SRC_INFOS_COUNT_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkBuildPartitionedAccelerationStructureInfoNV set(VkBuildPartitionedAccelerationStructureInfoNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkBuildPartitionedAccelerationStructureInfoNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkBuildPartitionedAccelerationStructureInfoNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkBuildPartitionedAccelerationStructureInfoNV> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkBuildPartitionedAccelerationStructureInfoNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkBuildPartitionedAccelerationStructureInfoNV> array(Arena arena, VkBuildPartitionedAccelerationStructureInfoNV... structs) {
        NativeStructArray<VkBuildPartitionedAccelerationStructureInfoNV> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkBuildPartitionedAccelerationStructureInfoNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkBuildPartitionedAccelerationStructureInfoNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkBuildPartitionedAccelerationStructureInfoNV(segment)
        );
    }

}