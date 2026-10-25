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

public final class VkPipelineViewportExclusiveScissorStateCreateInfoNV
		implements Struct<VkPipelineViewportExclusiveScissorStateCreateInfoNV> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle EXCLUSIVE_SCISSOR_COUNT_HANDLE;
	public static final VarHandle P_EXCLUSIVE_SCISSORS_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long EXCLUSIVE_SCISSOR_COUNT_BYTE_OFFSET;
	public static final long P_EXCLUSIVE_SCISSORS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("exclusiveScissorCount"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pExclusiveScissors")
		).withName("VkPipelineViewportExclusiveScissorStateCreateInfoNV").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		EXCLUSIVE_SCISSOR_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("exclusiveScissorCount"));
		P_EXCLUSIVE_SCISSORS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pExclusiveScissors"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		EXCLUSIVE_SCISSOR_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("exclusiveScissorCount"));
		P_EXCLUSIVE_SCISSORS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pExclusiveScissors"));
		//@formatter:on
	}

	public VkPipelineViewportExclusiveScissorStateCreateInfoNV() {
	    this(Arena.ofAuto());
	}
	
	public VkPipelineViewportExclusiveScissorStateCreateInfoNV(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPipelineViewportExclusiveScissorStateCreateInfoNV(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPipelineViewportExclusiveScissorStateCreateInfoNV sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPipelineViewportExclusiveScissorStateCreateInfoNV pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #exclusiveScissorCount()
    public VkPipelineViewportExclusiveScissorStateCreateInfoNV exclusiveScissorCount(int exclusiveScissorCount) {
    	EXCLUSIVE_SCISSOR_COUNT_HANDLE.set(segment, 0L, exclusiveScissorCount);
    	return this;
    }
    
    public int exclusiveScissorCount() {
    	return (int) EXCLUSIVE_SCISSOR_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pExclusiveScissors()
    public VkPipelineViewportExclusiveScissorStateCreateInfoNV pExclusiveScissors(NativeStructArray<VkRect2D> pExclusiveScissors) {
    	P_EXCLUSIVE_SCISSORS_HANDLE.set(segment, 0L, pExclusiveScissors.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkRect2D> pExclusiveScissors() {
    	MemorySegment segment = (MemorySegment) P_EXCLUSIVE_SCISSORS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkRect2D.array(segment);
    }
    
    @Override
    public VkPipelineViewportExclusiveScissorStateCreateInfoNV set(VkPipelineViewportExclusiveScissorStateCreateInfoNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkPipelineViewportExclusiveScissorStateCreateInfoNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPipelineViewportExclusiveScissorStateCreateInfoNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPipelineViewportExclusiveScissorStateCreateInfoNV> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPipelineViewportExclusiveScissorStateCreateInfoNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPipelineViewportExclusiveScissorStateCreateInfoNV> array(SegmentAllocator allocator, VkPipelineViewportExclusiveScissorStateCreateInfoNV... structs) {
        NativeStructArray<VkPipelineViewportExclusiveScissorStateCreateInfoNV> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPipelineViewportExclusiveScissorStateCreateInfoNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPipelineViewportExclusiveScissorStateCreateInfoNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPipelineViewportExclusiveScissorStateCreateInfoNV(segment)
        );
    }

}