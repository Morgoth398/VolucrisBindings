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

public final class VkMemoryRangeBarriersInfoKHR
		implements Struct<VkMemoryRangeBarriersInfoKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle MEMORY_RANGE_BARRIER_COUNT_HANDLE;
	public static final VarHandle P_MEMORY_RANGE_BARRIERS_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long MEMORY_RANGE_BARRIER_COUNT_BYTE_OFFSET;
	public static final long P_MEMORY_RANGE_BARRIERS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("memoryRangeBarrierCount"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pMemoryRangeBarriers")
		).withName("VkMemoryRangeBarriersInfoKHR").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		MEMORY_RANGE_BARRIER_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("memoryRangeBarrierCount"));
		P_MEMORY_RANGE_BARRIERS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pMemoryRangeBarriers"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		MEMORY_RANGE_BARRIER_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("memoryRangeBarrierCount"));
		P_MEMORY_RANGE_BARRIERS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pMemoryRangeBarriers"));
		//@formatter:on
	}

	public VkMemoryRangeBarriersInfoKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkMemoryRangeBarriersInfoKHR(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkMemoryRangeBarriersInfoKHR(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkMemoryRangeBarriersInfoKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkMemoryRangeBarriersInfoKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #memoryRangeBarrierCount()
    public VkMemoryRangeBarriersInfoKHR memoryRangeBarrierCount(int memoryRangeBarrierCount) {
    	MEMORY_RANGE_BARRIER_COUNT_HANDLE.set(segment, 0L, memoryRangeBarrierCount);
    	return this;
    }
    
    public int memoryRangeBarrierCount() {
    	return (int) MEMORY_RANGE_BARRIER_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pMemoryRangeBarriers()
    public VkMemoryRangeBarriersInfoKHR pMemoryRangeBarriers(NativeStructArray<VkMemoryRangeBarrierKHR> pMemoryRangeBarriers) {
    	P_MEMORY_RANGE_BARRIERS_HANDLE.set(segment, 0L, pMemoryRangeBarriers.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkMemoryRangeBarrierKHR> pMemoryRangeBarriers() {
    	MemorySegment segment = (MemorySegment) P_MEMORY_RANGE_BARRIERS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkMemoryRangeBarrierKHR.array(segment);
    }
    
    @Override
    public VkMemoryRangeBarriersInfoKHR set(VkMemoryRangeBarriersInfoKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkMemoryRangeBarriersInfoKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkMemoryRangeBarriersInfoKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkMemoryRangeBarriersInfoKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkMemoryRangeBarriersInfoKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkMemoryRangeBarriersInfoKHR> array(Arena arena, VkMemoryRangeBarriersInfoKHR... structs) {
        NativeStructArray<VkMemoryRangeBarriersInfoKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkMemoryRangeBarriersInfoKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkMemoryRangeBarriersInfoKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkMemoryRangeBarriersInfoKHR(segment)
        );
    }

}