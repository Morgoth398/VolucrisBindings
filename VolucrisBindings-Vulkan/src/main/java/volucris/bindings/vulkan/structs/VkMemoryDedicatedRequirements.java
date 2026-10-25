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

public final class VkMemoryDedicatedRequirements
		implements Struct<VkMemoryDedicatedRequirements> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle PREFERS_DEDICATED_ALLOCATION_HANDLE;
	public static final VarHandle REQUIRES_DEDICATED_ALLOCATION_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long PREFERS_DEDICATED_ALLOCATION_BYTE_OFFSET;
	public static final long REQUIRES_DEDICATED_ALLOCATION_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("prefersDedicatedAllocation"),
		    JAVA_INT.withName("requiresDedicatedAllocation")
		).withName("VkMemoryDedicatedRequirements").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		PREFERS_DEDICATED_ALLOCATION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("prefersDedicatedAllocation"));
		REQUIRES_DEDICATED_ALLOCATION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("requiresDedicatedAllocation"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		PREFERS_DEDICATED_ALLOCATION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("prefersDedicatedAllocation"));
		REQUIRES_DEDICATED_ALLOCATION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("requiresDedicatedAllocation"));
		//@formatter:on
	}

	public VkMemoryDedicatedRequirements() {
	    this(Arena.ofAuto());
	}
	
	public VkMemoryDedicatedRequirements(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkMemoryDedicatedRequirements(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkMemoryDedicatedRequirements sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkMemoryDedicatedRequirements pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #prefersDedicatedAllocation()
    public VkMemoryDedicatedRequirements prefersDedicatedAllocation(int prefersDedicatedAllocation) {
    	PREFERS_DEDICATED_ALLOCATION_HANDLE.set(segment, 0L, prefersDedicatedAllocation);
    	return this;
    }
    
    public int prefersDedicatedAllocation() {
    	return (int) PREFERS_DEDICATED_ALLOCATION_HANDLE.get(segment, 0L);
    }
    
    /// @see #requiresDedicatedAllocation()
    public VkMemoryDedicatedRequirements requiresDedicatedAllocation(int requiresDedicatedAllocation) {
    	REQUIRES_DEDICATED_ALLOCATION_HANDLE.set(segment, 0L, requiresDedicatedAllocation);
    	return this;
    }
    
    public int requiresDedicatedAllocation() {
    	return (int) REQUIRES_DEDICATED_ALLOCATION_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkMemoryDedicatedRequirements set(VkMemoryDedicatedRequirements other) {
        return set(other.segment);
    }
    
    @Override
    public VkMemoryDedicatedRequirements set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkMemoryDedicatedRequirements> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkMemoryDedicatedRequirements> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkMemoryDedicatedRequirements(segment),
            count
        );
    }
    
    public static NativeStructArray<VkMemoryDedicatedRequirements> array(SegmentAllocator allocator, VkMemoryDedicatedRequirements... structs) {
        NativeStructArray<VkMemoryDedicatedRequirements> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkMemoryDedicatedRequirements(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkMemoryDedicatedRequirements> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkMemoryDedicatedRequirements(segment)
        );
    }

}