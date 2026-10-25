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

public final class VkDedicatedAllocationImageCreateInfoNV
		implements Struct<VkDedicatedAllocationImageCreateInfoNV> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle DEDICATED_ALLOCATION_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long DEDICATED_ALLOCATION_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("dedicatedAllocation"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkDedicatedAllocationImageCreateInfoNV").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		DEDICATED_ALLOCATION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("dedicatedAllocation"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		DEDICATED_ALLOCATION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dedicatedAllocation"));
		//@formatter:on
	}

	public VkDedicatedAllocationImageCreateInfoNV() {
	    this(Arena.ofAuto());
	}
	
	public VkDedicatedAllocationImageCreateInfoNV(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkDedicatedAllocationImageCreateInfoNV(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkDedicatedAllocationImageCreateInfoNV sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkDedicatedAllocationImageCreateInfoNV pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #dedicatedAllocation()
    public VkDedicatedAllocationImageCreateInfoNV dedicatedAllocation(int dedicatedAllocation) {
    	DEDICATED_ALLOCATION_HANDLE.set(segment, 0L, dedicatedAllocation);
    	return this;
    }
    
    public int dedicatedAllocation() {
    	return (int) DEDICATED_ALLOCATION_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkDedicatedAllocationImageCreateInfoNV set(VkDedicatedAllocationImageCreateInfoNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkDedicatedAllocationImageCreateInfoNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDedicatedAllocationImageCreateInfoNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDedicatedAllocationImageCreateInfoNV> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkDedicatedAllocationImageCreateInfoNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDedicatedAllocationImageCreateInfoNV> array(SegmentAllocator allocator, VkDedicatedAllocationImageCreateInfoNV... structs) {
        NativeStructArray<VkDedicatedAllocationImageCreateInfoNV> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkDedicatedAllocationImageCreateInfoNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDedicatedAllocationImageCreateInfoNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDedicatedAllocationImageCreateInfoNV(segment)
        );
    }

}