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
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;

public final class VkPresentTimeGOOGLE
		implements Struct<VkPresentTimeGOOGLE> {

	public static final StructLayout LAYOUT;

	public static final VarHandle PRESENT_ID_HANDLE;
	public static final VarHandle DESIRED_PRESENT_TIME_HANDLE;

	public static final long PRESENT_ID_BYTE_OFFSET;
	public static final long DESIRED_PRESENT_TIME_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("presentID"),
		    MemoryLayout.paddingLayout(4),
		    JAVA_LONG.withName("desiredPresentTime")
		).withName("VkPresentTimeGOOGLE").withByteAlignment(8);
		
		PRESENT_ID_HANDLE = LAYOUT.varHandle(PathElement.groupElement("presentID"));
		DESIRED_PRESENT_TIME_HANDLE = LAYOUT.varHandle(PathElement.groupElement("desiredPresentTime"));
		
		PRESENT_ID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("presentID"));
		DESIRED_PRESENT_TIME_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("desiredPresentTime"));
		//@formatter:on
	}

	public VkPresentTimeGOOGLE() {
	    this(Arena.ofAuto());
	}
	
	public VkPresentTimeGOOGLE(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPresentTimeGOOGLE(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #presentID()
    public VkPresentTimeGOOGLE presentID(int presentID) {
    	PRESENT_ID_HANDLE.set(segment, 0L, presentID);
    	return this;
    }
    
    public int presentID() {
    	return (int) PRESENT_ID_HANDLE.get(segment, 0L);
    }
    
    /// @see #desiredPresentTime()
    public VkPresentTimeGOOGLE desiredPresentTime(long desiredPresentTime) {
    	DESIRED_PRESENT_TIME_HANDLE.set(segment, 0L, desiredPresentTime);
    	return this;
    }
    
    public long desiredPresentTime() {
    	return (long) DESIRED_PRESENT_TIME_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPresentTimeGOOGLE set(VkPresentTimeGOOGLE other) {
        return set(other.segment);
    }
    
    @Override
    public VkPresentTimeGOOGLE set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPresentTimeGOOGLE> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPresentTimeGOOGLE> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPresentTimeGOOGLE(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPresentTimeGOOGLE> array(SegmentAllocator allocator, VkPresentTimeGOOGLE... structs) {
        NativeStructArray<VkPresentTimeGOOGLE> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPresentTimeGOOGLE(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPresentTimeGOOGLE> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPresentTimeGOOGLE(segment)
        );
    }

}