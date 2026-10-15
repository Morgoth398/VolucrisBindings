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

public final class VkComputeOccupancyPriorityParametersNV
		implements Struct<VkComputeOccupancyPriorityParametersNV> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle OCCUPANCY_PRIORITY_HANDLE;
	public static final VarHandle OCCUPANCY_THROTTLING_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long OCCUPANCY_PRIORITY_BYTE_OFFSET;
	public static final long OCCUPANCY_THROTTLING_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_FLOAT.withName("occupancyPriority"),
		    JAVA_FLOAT.withName("occupancyThrottling")
		).withName("VkComputeOccupancyPriorityParametersNV").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		OCCUPANCY_PRIORITY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("occupancyPriority"));
		OCCUPANCY_THROTTLING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("occupancyThrottling"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		OCCUPANCY_PRIORITY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("occupancyPriority"));
		OCCUPANCY_THROTTLING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("occupancyThrottling"));
		//@formatter:on
	}

	public VkComputeOccupancyPriorityParametersNV() {
	    this(Arena.ofAuto());
	}
	
	public VkComputeOccupancyPriorityParametersNV(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkComputeOccupancyPriorityParametersNV(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkComputeOccupancyPriorityParametersNV sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkComputeOccupancyPriorityParametersNV pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #occupancyPriority()
    public VkComputeOccupancyPriorityParametersNV occupancyPriority(float occupancyPriority) {
    	OCCUPANCY_PRIORITY_HANDLE.set(segment, 0L, occupancyPriority);
    	return this;
    }
    
    public float occupancyPriority() {
    	return (float) OCCUPANCY_PRIORITY_HANDLE.get(segment, 0L);
    }
    
    /// @see #occupancyThrottling()
    public VkComputeOccupancyPriorityParametersNV occupancyThrottling(float occupancyThrottling) {
    	OCCUPANCY_THROTTLING_HANDLE.set(segment, 0L, occupancyThrottling);
    	return this;
    }
    
    public float occupancyThrottling() {
    	return (float) OCCUPANCY_THROTTLING_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkComputeOccupancyPriorityParametersNV set(VkComputeOccupancyPriorityParametersNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkComputeOccupancyPriorityParametersNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkComputeOccupancyPriorityParametersNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkComputeOccupancyPriorityParametersNV> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkComputeOccupancyPriorityParametersNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkComputeOccupancyPriorityParametersNV> array(Arena arena, VkComputeOccupancyPriorityParametersNV... structs) {
        NativeStructArray<VkComputeOccupancyPriorityParametersNV> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkComputeOccupancyPriorityParametersNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkComputeOccupancyPriorityParametersNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkComputeOccupancyPriorityParametersNV(segment)
        );
    }

}