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

public final class VkIndirectCommandsStreamNV
		implements Struct<VkIndirectCommandsStreamNV> {

	public static final StructLayout LAYOUT;

	public static final VarHandle BUFFER_HANDLE;
	public static final VarHandle OFFSET_HANDLE;

	public static final long BUFFER_BYTE_OFFSET;
	public static final long OFFSET_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    UNBOUNDED_ADDRESS.withName("buffer"),
		    JAVA_LONG.withName("offset")
		).withName("VkIndirectCommandsStreamNV").withByteAlignment(8);
		
		BUFFER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("buffer"));
		OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("offset"));
		
		BUFFER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("buffer"));
		OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("offset"));
		//@formatter:on
	}

	public VkIndirectCommandsStreamNV() {
	    this(Arena.ofAuto());
	}
	
	public VkIndirectCommandsStreamNV(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkIndirectCommandsStreamNV(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #buffer()
    public VkIndirectCommandsStreamNV buffer(VkBuffer buffer) {
    	BUFFER_HANDLE.set(segment, 0L, buffer.memorySegment());
    	return this;
    }
    
    public @Nullable VkBuffer buffer() {
    	MemorySegment segment = (MemorySegment) BUFFER_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkBuffer(segment);
    }
    
    /// @see #offset()
    public VkIndirectCommandsStreamNV offset(long offset) {
    	OFFSET_HANDLE.set(segment, 0L, offset);
    	return this;
    }
    
    public long offset() {
    	return (long) OFFSET_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkIndirectCommandsStreamNV set(VkIndirectCommandsStreamNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkIndirectCommandsStreamNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkIndirectCommandsStreamNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkIndirectCommandsStreamNV> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkIndirectCommandsStreamNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkIndirectCommandsStreamNV> array(SegmentAllocator allocator, VkIndirectCommandsStreamNV... structs) {
        NativeStructArray<VkIndirectCommandsStreamNV> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkIndirectCommandsStreamNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkIndirectCommandsStreamNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkIndirectCommandsStreamNV(segment)
        );
    }

}