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

public final class VkVideoEncodeAV1FrameSizeKHR
		implements Struct<VkVideoEncodeAV1FrameSizeKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle INTRA_FRAME_SIZE_HANDLE;
	public static final VarHandle PREDICTIVE_FRAME_SIZE_HANDLE;
	public static final VarHandle BIPREDICTIVE_FRAME_SIZE_HANDLE;

	public static final long INTRA_FRAME_SIZE_BYTE_OFFSET;
	public static final long PREDICTIVE_FRAME_SIZE_BYTE_OFFSET;
	public static final long BIPREDICTIVE_FRAME_SIZE_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("intraFrameSize"),
		    JAVA_INT.withName("predictiveFrameSize"),
		    JAVA_INT.withName("bipredictiveFrameSize")
		).withName("VkVideoEncodeAV1FrameSizeKHR").withByteAlignment(4);
		
		INTRA_FRAME_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("intraFrameSize"));
		PREDICTIVE_FRAME_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("predictiveFrameSize"));
		BIPREDICTIVE_FRAME_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("bipredictiveFrameSize"));
		
		INTRA_FRAME_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("intraFrameSize"));
		PREDICTIVE_FRAME_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("predictiveFrameSize"));
		BIPREDICTIVE_FRAME_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("bipredictiveFrameSize"));
		//@formatter:on
	}

	public VkVideoEncodeAV1FrameSizeKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkVideoEncodeAV1FrameSizeKHR(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkVideoEncodeAV1FrameSizeKHR(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #intraFrameSize()
    public VkVideoEncodeAV1FrameSizeKHR intraFrameSize(int intraFrameSize) {
    	INTRA_FRAME_SIZE_HANDLE.set(segment, 0L, intraFrameSize);
    	return this;
    }
    
    public int intraFrameSize() {
    	return (int) INTRA_FRAME_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #predictiveFrameSize()
    public VkVideoEncodeAV1FrameSizeKHR predictiveFrameSize(int predictiveFrameSize) {
    	PREDICTIVE_FRAME_SIZE_HANDLE.set(segment, 0L, predictiveFrameSize);
    	return this;
    }
    
    public int predictiveFrameSize() {
    	return (int) PREDICTIVE_FRAME_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #bipredictiveFrameSize()
    public VkVideoEncodeAV1FrameSizeKHR bipredictiveFrameSize(int bipredictiveFrameSize) {
    	BIPREDICTIVE_FRAME_SIZE_HANDLE.set(segment, 0L, bipredictiveFrameSize);
    	return this;
    }
    
    public int bipredictiveFrameSize() {
    	return (int) BIPREDICTIVE_FRAME_SIZE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkVideoEncodeAV1FrameSizeKHR set(VkVideoEncodeAV1FrameSizeKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkVideoEncodeAV1FrameSizeKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkVideoEncodeAV1FrameSizeKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkVideoEncodeAV1FrameSizeKHR> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkVideoEncodeAV1FrameSizeKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkVideoEncodeAV1FrameSizeKHR> array(SegmentAllocator allocator, VkVideoEncodeAV1FrameSizeKHR... structs) {
        NativeStructArray<VkVideoEncodeAV1FrameSizeKHR> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkVideoEncodeAV1FrameSizeKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkVideoEncodeAV1FrameSizeKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkVideoEncodeAV1FrameSizeKHR(segment)
        );
    }

}