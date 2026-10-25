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
import java.util.function.Consumer;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;

public final class StdVideoEncodeH264ReferenceInfo
		implements Struct<StdVideoEncodeH264ReferenceInfo> {

	public static final StructLayout LAYOUT;

	public static final VarHandle PRIMARY_PIC_TYPE_HANDLE;
	public static final VarHandle FRAME_NUM_HANDLE;
	public static final VarHandle PIC_ORDER_CNT_HANDLE;
	public static final VarHandle LONG_TERM_PIC_NUM_HANDLE;
	public static final VarHandle LONG_TERM_FRAME_IDX_HANDLE;
	public static final VarHandle TEMPORAL_ID_HANDLE;

	public static final long FLAGS_BYTE_OFFSET;
	public static final long PRIMARY_PIC_TYPE_BYTE_OFFSET;
	public static final long FRAME_NUM_BYTE_OFFSET;
	public static final long PIC_ORDER_CNT_BYTE_OFFSET;
	public static final long LONG_TERM_PIC_NUM_BYTE_OFFSET;
	public static final long LONG_TERM_FRAME_IDX_BYTE_OFFSET;
	public static final long TEMPORAL_ID_BYTE_OFFSET;

	private final MemorySegment segment;

	private final StdVideoEncodeH264ReferenceInfoFlags flags;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    StdVideoEncodeH264ReferenceInfoFlags.LAYOUT.withName("flags"),
		    JAVA_INT.withName("primary_pic_type"),
		    JAVA_INT.withName("FrameNum"),
		    JAVA_INT.withName("PicOrderCnt"),
		    JAVA_SHORT.withName("long_term_pic_num"),
		    JAVA_SHORT.withName("long_term_frame_idx"),
		    JAVA_BYTE.withName("temporal_id"),
		    MemoryLayout.paddingLayout(3)
		).withName("StdVideoEncodeH264ReferenceInfo").withByteAlignment(4);
		
		PRIMARY_PIC_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("primary_pic_type"));
		FRAME_NUM_HANDLE = LAYOUT.varHandle(PathElement.groupElement("FrameNum"));
		PIC_ORDER_CNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("PicOrderCnt"));
		LONG_TERM_PIC_NUM_HANDLE = LAYOUT.varHandle(PathElement.groupElement("long_term_pic_num"));
		LONG_TERM_FRAME_IDX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("long_term_frame_idx"));
		TEMPORAL_ID_HANDLE = LAYOUT.varHandle(PathElement.groupElement("temporal_id"));
		
		FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
		PRIMARY_PIC_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("primary_pic_type"));
		FRAME_NUM_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("FrameNum"));
		PIC_ORDER_CNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("PicOrderCnt"));
		LONG_TERM_PIC_NUM_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("long_term_pic_num"));
		LONG_TERM_FRAME_IDX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("long_term_frame_idx"));
		TEMPORAL_ID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("temporal_id"));
		//@formatter:on
	}

	public StdVideoEncodeH264ReferenceInfo() {
	    this(Arena.ofAuto());
	}
	
	public StdVideoEncodeH264ReferenceInfo(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public StdVideoEncodeH264ReferenceInfo(MemorySegment segment) {
	    this.segment = segment;
	
	    flags = new StdVideoEncodeH264ReferenceInfoFlags(segment.asSlice(FLAGS_BYTE_OFFSET, StdVideoEncodeH264ReferenceInfoFlags.LAYOUT));
	}

    /// @see #flags()
    public StdVideoEncodeH264ReferenceInfo flags(Consumer<StdVideoEncodeH264ReferenceInfoFlags> consumer) {
    	consumer.accept(flags);
    	return this;
    }
    
    /// @see #flags()
    public StdVideoEncodeH264ReferenceInfo flags(StdVideoEncodeH264ReferenceInfoFlags other) {
    	flags.set(other);
    	return this;
    }
    
    public StdVideoEncodeH264ReferenceInfoFlags flags() {
    	return flags;
    }
    
    /// @see #primary_pic_type()
    public StdVideoEncodeH264ReferenceInfo primary_pic_type(int primary_pic_type) {
    	PRIMARY_PIC_TYPE_HANDLE.set(segment, 0L, primary_pic_type);
    	return this;
    }
    
    public int primary_pic_type() {
    	return (int) PRIMARY_PIC_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #frameNum()
    public StdVideoEncodeH264ReferenceInfo frameNum(int frameNum) {
    	FRAME_NUM_HANDLE.set(segment, 0L, frameNum);
    	return this;
    }
    
    public int frameNum() {
    	return (int) FRAME_NUM_HANDLE.get(segment, 0L);
    }
    
    /// @see #picOrderCnt()
    public StdVideoEncodeH264ReferenceInfo picOrderCnt(int picOrderCnt) {
    	PIC_ORDER_CNT_HANDLE.set(segment, 0L, picOrderCnt);
    	return this;
    }
    
    public int picOrderCnt() {
    	return (int) PIC_ORDER_CNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #long_term_pic_num()
    public StdVideoEncodeH264ReferenceInfo long_term_pic_num(short long_term_pic_num) {
    	LONG_TERM_PIC_NUM_HANDLE.set(segment, 0L, long_term_pic_num);
    	return this;
    }
    
    public short long_term_pic_num() {
    	return (short) LONG_TERM_PIC_NUM_HANDLE.get(segment, 0L);
    }
    
    /// @see #long_term_frame_idx()
    public StdVideoEncodeH264ReferenceInfo long_term_frame_idx(short long_term_frame_idx) {
    	LONG_TERM_FRAME_IDX_HANDLE.set(segment, 0L, long_term_frame_idx);
    	return this;
    }
    
    public short long_term_frame_idx() {
    	return (short) LONG_TERM_FRAME_IDX_HANDLE.get(segment, 0L);
    }
    
    /// @see #temporal_id()
    public StdVideoEncodeH264ReferenceInfo temporal_id(byte temporal_id) {
    	TEMPORAL_ID_HANDLE.set(segment, 0L, temporal_id);
    	return this;
    }
    
    public byte temporal_id() {
    	return (byte) TEMPORAL_ID_HANDLE.get(segment, 0L);
    }
    
    @Override
    public StdVideoEncodeH264ReferenceInfo set(StdVideoEncodeH264ReferenceInfo other) {
        return set(other.segment);
    }
    
    @Override
    public StdVideoEncodeH264ReferenceInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<StdVideoEncodeH264ReferenceInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<StdVideoEncodeH264ReferenceInfo> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new StdVideoEncodeH264ReferenceInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<StdVideoEncodeH264ReferenceInfo> array(SegmentAllocator allocator, StdVideoEncodeH264ReferenceInfo... structs) {
        NativeStructArray<StdVideoEncodeH264ReferenceInfo> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new StdVideoEncodeH264ReferenceInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<StdVideoEncodeH264ReferenceInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new StdVideoEncodeH264ReferenceInfo(segment)
        );
    }

}