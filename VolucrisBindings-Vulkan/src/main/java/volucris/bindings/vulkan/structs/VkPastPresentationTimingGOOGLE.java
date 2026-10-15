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

public final class VkPastPresentationTimingGOOGLE
		implements Struct<VkPastPresentationTimingGOOGLE> {

	public static final StructLayout LAYOUT;

	public static final VarHandle PRESENT_ID_HANDLE;
	public static final VarHandle DESIRED_PRESENT_TIME_HANDLE;
	public static final VarHandle ACTUAL_PRESENT_TIME_HANDLE;
	public static final VarHandle EARLIEST_PRESENT_TIME_HANDLE;
	public static final VarHandle PRESENT_MARGIN_HANDLE;

	public static final long PRESENT_ID_BYTE_OFFSET;
	public static final long DESIRED_PRESENT_TIME_BYTE_OFFSET;
	public static final long ACTUAL_PRESENT_TIME_BYTE_OFFSET;
	public static final long EARLIEST_PRESENT_TIME_BYTE_OFFSET;
	public static final long PRESENT_MARGIN_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("presentID"),
		    MemoryLayout.paddingLayout(4),
		    JAVA_LONG.withName("desiredPresentTime"),
		    JAVA_LONG.withName("actualPresentTime"),
		    JAVA_LONG.withName("earliestPresentTime"),
		    JAVA_LONG.withName("presentMargin")
		).withName("VkPastPresentationTimingGOOGLE").withByteAlignment(8);
		
		PRESENT_ID_HANDLE = LAYOUT.varHandle(PathElement.groupElement("presentID"));
		DESIRED_PRESENT_TIME_HANDLE = LAYOUT.varHandle(PathElement.groupElement("desiredPresentTime"));
		ACTUAL_PRESENT_TIME_HANDLE = LAYOUT.varHandle(PathElement.groupElement("actualPresentTime"));
		EARLIEST_PRESENT_TIME_HANDLE = LAYOUT.varHandle(PathElement.groupElement("earliestPresentTime"));
		PRESENT_MARGIN_HANDLE = LAYOUT.varHandle(PathElement.groupElement("presentMargin"));
		
		PRESENT_ID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("presentID"));
		DESIRED_PRESENT_TIME_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("desiredPresentTime"));
		ACTUAL_PRESENT_TIME_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("actualPresentTime"));
		EARLIEST_PRESENT_TIME_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("earliestPresentTime"));
		PRESENT_MARGIN_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("presentMargin"));
		//@formatter:on
	}

	public VkPastPresentationTimingGOOGLE() {
	    this(Arena.ofAuto());
	}
	
	public VkPastPresentationTimingGOOGLE(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPastPresentationTimingGOOGLE(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #presentID()
    public VkPastPresentationTimingGOOGLE presentID(int presentID) {
    	PRESENT_ID_HANDLE.set(segment, 0L, presentID);
    	return this;
    }
    
    public int presentID() {
    	return (int) PRESENT_ID_HANDLE.get(segment, 0L);
    }
    
    /// @see #desiredPresentTime()
    public VkPastPresentationTimingGOOGLE desiredPresentTime(long desiredPresentTime) {
    	DESIRED_PRESENT_TIME_HANDLE.set(segment, 0L, desiredPresentTime);
    	return this;
    }
    
    public long desiredPresentTime() {
    	return (long) DESIRED_PRESENT_TIME_HANDLE.get(segment, 0L);
    }
    
    /// @see #actualPresentTime()
    public VkPastPresentationTimingGOOGLE actualPresentTime(long actualPresentTime) {
    	ACTUAL_PRESENT_TIME_HANDLE.set(segment, 0L, actualPresentTime);
    	return this;
    }
    
    public long actualPresentTime() {
    	return (long) ACTUAL_PRESENT_TIME_HANDLE.get(segment, 0L);
    }
    
    /// @see #earliestPresentTime()
    public VkPastPresentationTimingGOOGLE earliestPresentTime(long earliestPresentTime) {
    	EARLIEST_PRESENT_TIME_HANDLE.set(segment, 0L, earliestPresentTime);
    	return this;
    }
    
    public long earliestPresentTime() {
    	return (long) EARLIEST_PRESENT_TIME_HANDLE.get(segment, 0L);
    }
    
    /// @see #presentMargin()
    public VkPastPresentationTimingGOOGLE presentMargin(long presentMargin) {
    	PRESENT_MARGIN_HANDLE.set(segment, 0L, presentMargin);
    	return this;
    }
    
    public long presentMargin() {
    	return (long) PRESENT_MARGIN_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPastPresentationTimingGOOGLE set(VkPastPresentationTimingGOOGLE other) {
        return set(other.segment);
    }
    
    @Override
    public VkPastPresentationTimingGOOGLE set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPastPresentationTimingGOOGLE> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPastPresentationTimingGOOGLE> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPastPresentationTimingGOOGLE(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPastPresentationTimingGOOGLE> array(Arena arena, VkPastPresentationTimingGOOGLE... structs) {
        NativeStructArray<VkPastPresentationTimingGOOGLE> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPastPresentationTimingGOOGLE(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPastPresentationTimingGOOGLE> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPastPresentationTimingGOOGLE(segment)
        );
    }

}