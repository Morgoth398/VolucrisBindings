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

public final class VkQueryPoolPerformanceQueryCreateInfoINTEL
		implements Struct<VkQueryPoolPerformanceQueryCreateInfoINTEL> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle PERFORMANCE_COUNTERS_SAMPLING_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long PERFORMANCE_COUNTERS_SAMPLING_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("performanceCountersSampling"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkQueryPoolPerformanceQueryCreateInfoINTEL").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		PERFORMANCE_COUNTERS_SAMPLING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("performanceCountersSampling"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		PERFORMANCE_COUNTERS_SAMPLING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("performanceCountersSampling"));
		//@formatter:on
	}

	public VkQueryPoolPerformanceQueryCreateInfoINTEL() {
	    this(Arena.ofAuto());
	}
	
	public VkQueryPoolPerformanceQueryCreateInfoINTEL(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkQueryPoolPerformanceQueryCreateInfoINTEL(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkQueryPoolPerformanceQueryCreateInfoINTEL sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkQueryPoolPerformanceQueryCreateInfoINTEL pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #performanceCountersSampling()
    public VkQueryPoolPerformanceQueryCreateInfoINTEL performanceCountersSampling(int performanceCountersSampling) {
    	PERFORMANCE_COUNTERS_SAMPLING_HANDLE.set(segment, 0L, performanceCountersSampling);
    	return this;
    }
    
    public int performanceCountersSampling() {
    	return (int) PERFORMANCE_COUNTERS_SAMPLING_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkQueryPoolPerformanceQueryCreateInfoINTEL set(VkQueryPoolPerformanceQueryCreateInfoINTEL other) {
        return set(other.segment);
    }
    
    @Override
    public VkQueryPoolPerformanceQueryCreateInfoINTEL set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkQueryPoolPerformanceQueryCreateInfoINTEL> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkQueryPoolPerformanceQueryCreateInfoINTEL> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkQueryPoolPerformanceQueryCreateInfoINTEL(segment),
            count
        );
    }
    
    public static NativeStructArray<VkQueryPoolPerformanceQueryCreateInfoINTEL> array(Arena arena, VkQueryPoolPerformanceQueryCreateInfoINTEL... structs) {
        NativeStructArray<VkQueryPoolPerformanceQueryCreateInfoINTEL> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkQueryPoolPerformanceQueryCreateInfoINTEL(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkQueryPoolPerformanceQueryCreateInfoINTEL> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkQueryPoolPerformanceQueryCreateInfoINTEL(segment)
        );
    }

}