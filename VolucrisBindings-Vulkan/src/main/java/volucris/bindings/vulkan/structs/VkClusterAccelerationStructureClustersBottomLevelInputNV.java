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

public final class VkClusterAccelerationStructureClustersBottomLevelInputNV
		implements Struct<VkClusterAccelerationStructureClustersBottomLevelInputNV> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle MAX_TOTAL_CLUSTER_COUNT_HANDLE;
	public static final VarHandle MAX_CLUSTER_COUNT_PER_ACCELERATION_STRUCTURE_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long MAX_TOTAL_CLUSTER_COUNT_BYTE_OFFSET;
	public static final long MAX_CLUSTER_COUNT_PER_ACCELERATION_STRUCTURE_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("maxTotalClusterCount"),
		    JAVA_INT.withName("maxClusterCountPerAccelerationStructure")
		).withName("VkClusterAccelerationStructureClustersBottomLevelInputNV").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		MAX_TOTAL_CLUSTER_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxTotalClusterCount"));
		MAX_CLUSTER_COUNT_PER_ACCELERATION_STRUCTURE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxClusterCountPerAccelerationStructure"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		MAX_TOTAL_CLUSTER_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxTotalClusterCount"));
		MAX_CLUSTER_COUNT_PER_ACCELERATION_STRUCTURE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxClusterCountPerAccelerationStructure"));
		//@formatter:on
	}

	public VkClusterAccelerationStructureClustersBottomLevelInputNV() {
	    this(Arena.ofAuto());
	}
	
	public VkClusterAccelerationStructureClustersBottomLevelInputNV(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkClusterAccelerationStructureClustersBottomLevelInputNV(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkClusterAccelerationStructureClustersBottomLevelInputNV sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkClusterAccelerationStructureClustersBottomLevelInputNV pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #maxTotalClusterCount()
    public VkClusterAccelerationStructureClustersBottomLevelInputNV maxTotalClusterCount(int maxTotalClusterCount) {
    	MAX_TOTAL_CLUSTER_COUNT_HANDLE.set(segment, 0L, maxTotalClusterCount);
    	return this;
    }
    
    public int maxTotalClusterCount() {
    	return (int) MAX_TOTAL_CLUSTER_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxClusterCountPerAccelerationStructure()
    public VkClusterAccelerationStructureClustersBottomLevelInputNV maxClusterCountPerAccelerationStructure(int maxClusterCountPerAccelerationStructure) {
    	MAX_CLUSTER_COUNT_PER_ACCELERATION_STRUCTURE_HANDLE.set(segment, 0L, maxClusterCountPerAccelerationStructure);
    	return this;
    }
    
    public int maxClusterCountPerAccelerationStructure() {
    	return (int) MAX_CLUSTER_COUNT_PER_ACCELERATION_STRUCTURE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkClusterAccelerationStructureClustersBottomLevelInputNV set(VkClusterAccelerationStructureClustersBottomLevelInputNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkClusterAccelerationStructureClustersBottomLevelInputNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkClusterAccelerationStructureClustersBottomLevelInputNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkClusterAccelerationStructureClustersBottomLevelInputNV> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkClusterAccelerationStructureClustersBottomLevelInputNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkClusterAccelerationStructureClustersBottomLevelInputNV> array(Arena arena, VkClusterAccelerationStructureClustersBottomLevelInputNV... structs) {
        NativeStructArray<VkClusterAccelerationStructureClustersBottomLevelInputNV> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkClusterAccelerationStructureClustersBottomLevelInputNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkClusterAccelerationStructureClustersBottomLevelInputNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkClusterAccelerationStructureClustersBottomLevelInputNV(segment)
        );
    }

}