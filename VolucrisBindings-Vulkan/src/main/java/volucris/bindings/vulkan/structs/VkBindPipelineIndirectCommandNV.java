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

public final class VkBindPipelineIndirectCommandNV
		implements Struct<VkBindPipelineIndirectCommandNV> {

	public static final StructLayout LAYOUT;

	public static final VarHandle PIPELINE_ADDRESS_HANDLE;

	public static final long PIPELINE_ADDRESS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_LONG.withName("pipelineAddress")
		).withName("VkBindPipelineIndirectCommandNV").withByteAlignment(8);
		
		PIPELINE_ADDRESS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pipelineAddress"));
		
		PIPELINE_ADDRESS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pipelineAddress"));
		//@formatter:on
	}

	public VkBindPipelineIndirectCommandNV() {
	    this(Arena.ofAuto());
	}
	
	public VkBindPipelineIndirectCommandNV(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkBindPipelineIndirectCommandNV(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #pipelineAddress()
    public VkBindPipelineIndirectCommandNV pipelineAddress(long pipelineAddress) {
    	PIPELINE_ADDRESS_HANDLE.set(segment, 0L, pipelineAddress);
    	return this;
    }
    
    public long pipelineAddress() {
    	return (long) PIPELINE_ADDRESS_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkBindPipelineIndirectCommandNV set(VkBindPipelineIndirectCommandNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkBindPipelineIndirectCommandNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkBindPipelineIndirectCommandNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkBindPipelineIndirectCommandNV> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkBindPipelineIndirectCommandNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkBindPipelineIndirectCommandNV> array(SegmentAllocator allocator, VkBindPipelineIndirectCommandNV... structs) {
        NativeStructArray<VkBindPipelineIndirectCommandNV> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkBindPipelineIndirectCommandNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkBindPipelineIndirectCommandNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkBindPipelineIndirectCommandNV(segment)
        );
    }

}