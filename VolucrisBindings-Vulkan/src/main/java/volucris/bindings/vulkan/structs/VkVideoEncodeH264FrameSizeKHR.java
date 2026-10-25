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

public final class VkVideoEncodeH264FrameSizeKHR
		implements Struct<VkVideoEncodeH264FrameSizeKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle FRAME_ISIZE_HANDLE;
	public static final VarHandle FRAME_PSIZE_HANDLE;
	public static final VarHandle FRAME_BSIZE_HANDLE;

	public static final long FRAME_ISIZE_BYTE_OFFSET;
	public static final long FRAME_PSIZE_BYTE_OFFSET;
	public static final long FRAME_BSIZE_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("frameISize"),
		    JAVA_INT.withName("framePSize"),
		    JAVA_INT.withName("frameBSize")
		).withName("VkVideoEncodeH264FrameSizeKHR").withByteAlignment(4);
		
		FRAME_ISIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("frameISize"));
		FRAME_PSIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("framePSize"));
		FRAME_BSIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("frameBSize"));
		
		FRAME_ISIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("frameISize"));
		FRAME_PSIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("framePSize"));
		FRAME_BSIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("frameBSize"));
		//@formatter:on
	}

	public VkVideoEncodeH264FrameSizeKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkVideoEncodeH264FrameSizeKHR(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkVideoEncodeH264FrameSizeKHR(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #frameISize()
    public VkVideoEncodeH264FrameSizeKHR frameISize(int frameISize) {
    	FRAME_ISIZE_HANDLE.set(segment, 0L, frameISize);
    	return this;
    }
    
    public int frameISize() {
    	return (int) FRAME_ISIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #framePSize()
    public VkVideoEncodeH264FrameSizeKHR framePSize(int framePSize) {
    	FRAME_PSIZE_HANDLE.set(segment, 0L, framePSize);
    	return this;
    }
    
    public int framePSize() {
    	return (int) FRAME_PSIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #frameBSize()
    public VkVideoEncodeH264FrameSizeKHR frameBSize(int frameBSize) {
    	FRAME_BSIZE_HANDLE.set(segment, 0L, frameBSize);
    	return this;
    }
    
    public int frameBSize() {
    	return (int) FRAME_BSIZE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkVideoEncodeH264FrameSizeKHR set(VkVideoEncodeH264FrameSizeKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkVideoEncodeH264FrameSizeKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkVideoEncodeH264FrameSizeKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkVideoEncodeH264FrameSizeKHR> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkVideoEncodeH264FrameSizeKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkVideoEncodeH264FrameSizeKHR> array(SegmentAllocator allocator, VkVideoEncodeH264FrameSizeKHR... structs) {
        NativeStructArray<VkVideoEncodeH264FrameSizeKHR> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkVideoEncodeH264FrameSizeKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkVideoEncodeH264FrameSizeKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkVideoEncodeH264FrameSizeKHR(segment)
        );
    }

}