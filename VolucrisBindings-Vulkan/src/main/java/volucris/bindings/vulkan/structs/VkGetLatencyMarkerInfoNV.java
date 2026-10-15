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

public final class VkGetLatencyMarkerInfoNV
		implements Struct<VkGetLatencyMarkerInfoNV> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle TIMING_COUNT_HANDLE;
	public static final VarHandle P_TIMINGS_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long TIMING_COUNT_BYTE_OFFSET;
	public static final long P_TIMINGS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("timingCount"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pTimings")
		).withName("VkGetLatencyMarkerInfoNV").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		TIMING_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("timingCount"));
		P_TIMINGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pTimings"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		TIMING_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("timingCount"));
		P_TIMINGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pTimings"));
		//@formatter:on
	}

	public VkGetLatencyMarkerInfoNV() {
	    this(Arena.ofAuto());
	}
	
	public VkGetLatencyMarkerInfoNV(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkGetLatencyMarkerInfoNV(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkGetLatencyMarkerInfoNV sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkGetLatencyMarkerInfoNV pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #timingCount()
    public VkGetLatencyMarkerInfoNV timingCount(int timingCount) {
    	TIMING_COUNT_HANDLE.set(segment, 0L, timingCount);
    	return this;
    }
    
    public int timingCount() {
    	return (int) TIMING_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pTimings()
    public VkGetLatencyMarkerInfoNV pTimings(NativeStructArray<VkLatencyTimingsFrameReportNV> pTimings) {
    	P_TIMINGS_HANDLE.set(segment, 0L, pTimings.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkLatencyTimingsFrameReportNV> pTimings() {
    	MemorySegment segment = (MemorySegment) P_TIMINGS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkLatencyTimingsFrameReportNV.array(segment);
    }
    
    @Override
    public VkGetLatencyMarkerInfoNV set(VkGetLatencyMarkerInfoNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkGetLatencyMarkerInfoNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkGetLatencyMarkerInfoNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkGetLatencyMarkerInfoNV> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkGetLatencyMarkerInfoNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkGetLatencyMarkerInfoNV> array(Arena arena, VkGetLatencyMarkerInfoNV... structs) {
        NativeStructArray<VkGetLatencyMarkerInfoNV> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkGetLatencyMarkerInfoNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkGetLatencyMarkerInfoNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkGetLatencyMarkerInfoNV(segment)
        );
    }

}