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
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkQueueFamilyGlobalPriorityProperties
		implements Struct<VkQueueFamilyGlobalPriorityProperties> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle PRIORITY_COUNT_HANDLE;
	public static final VarHandle PRIORITIES_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long PRIORITY_COUNT_BYTE_OFFSET;
	public static final long PRIORITIES_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("priorityCount"),
		    MemoryLayout.sequenceLayout(16, JAVA_INT).withName("priorities"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkQueueFamilyGlobalPriorityProperties").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		PRIORITY_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("priorityCount"));
		PRIORITIES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("priorities"), PathElement.sequenceElement());
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		PRIORITY_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("priorityCount"));
		PRIORITIES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("priorities"));
		//@formatter:on
	}

	public VkQueueFamilyGlobalPriorityProperties() {
	    this(Arena.ofAuto());
	}
	
	public VkQueueFamilyGlobalPriorityProperties(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkQueueFamilyGlobalPriorityProperties(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkQueueFamilyGlobalPriorityProperties sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkQueueFamilyGlobalPriorityProperties pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #priorityCount()
    public VkQueueFamilyGlobalPriorityProperties priorityCount(int priorityCount) {
    	PRIORITY_COUNT_HANDLE.set(segment, 0L, priorityCount);
    	return this;
    }
    
    public int priorityCount() {
    	return (int) PRIORITY_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #priorities(int)
    public VkQueueFamilyGlobalPriorityProperties priorities(int priorities, int index0) {
    	PRIORITIES_HANDLE.set(segment, 0L, index0, priorities);
    	return this;
    }
    
    public int priorities(int index0) {
    	return (int) PRIORITIES_HANDLE.get(segment, 0L, index0);
    }
    
    @Override
    public VkQueueFamilyGlobalPriorityProperties set(VkQueueFamilyGlobalPriorityProperties other) {
        return set(other.segment);
    }
    
    @Override
    public VkQueueFamilyGlobalPriorityProperties set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkQueueFamilyGlobalPriorityProperties> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkQueueFamilyGlobalPriorityProperties> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkQueueFamilyGlobalPriorityProperties(segment),
            count
        );
    }
    
    public static NativeStructArray<VkQueueFamilyGlobalPriorityProperties> array(SegmentAllocator allocator, VkQueueFamilyGlobalPriorityProperties... structs) {
        NativeStructArray<VkQueueFamilyGlobalPriorityProperties> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkQueueFamilyGlobalPriorityProperties(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkQueueFamilyGlobalPriorityProperties> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkQueueFamilyGlobalPriorityProperties(segment)
        );
    }

}