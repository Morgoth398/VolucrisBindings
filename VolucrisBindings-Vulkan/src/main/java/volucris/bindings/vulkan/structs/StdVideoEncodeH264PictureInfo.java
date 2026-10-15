/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class StdVideoEncodeH264PictureInfo
		implements Struct<StdVideoEncodeH264PictureInfo> {

	public static final StructLayout LAYOUT;

	public static final VarHandle SEQ_PARAMETER_SET_ID_HANDLE;
	public static final VarHandle PIC_PARAMETER_SET_ID_HANDLE;
	public static final VarHandle IDR_PIC_ID_HANDLE;
	public static final VarHandle PRIMARY_PIC_TYPE_HANDLE;
	public static final VarHandle FRAME_NUM_HANDLE;
	public static final VarHandle PIC_ORDER_CNT_HANDLE;
	public static final VarHandle TEMPORAL_ID_HANDLE;
	public static final VarHandle RESERVED1_HANDLE;
	public static final VarHandle P_REF_LISTS_HANDLE;

	public static final long FLAGS_BYTE_OFFSET;
	public static final long SEQ_PARAMETER_SET_ID_BYTE_OFFSET;
	public static final long PIC_PARAMETER_SET_ID_BYTE_OFFSET;
	public static final long IDR_PIC_ID_BYTE_OFFSET;
	public static final long PRIMARY_PIC_TYPE_BYTE_OFFSET;
	public static final long FRAME_NUM_BYTE_OFFSET;
	public static final long PIC_ORDER_CNT_BYTE_OFFSET;
	public static final long TEMPORAL_ID_BYTE_OFFSET;
	public static final long RESERVED1_BYTE_OFFSET;
	public static final long P_REF_LISTS_BYTE_OFFSET;

	private final MemorySegment segment;

	private final StdVideoEncodeH264PictureInfoFlags flags;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    StdVideoEncodeH264PictureInfoFlags.LAYOUT.withName("flags"),
		    JAVA_BYTE.withName("seq_parameter_set_id"),
		    JAVA_BYTE.withName("pic_parameter_set_id"),
		    JAVA_SHORT.withName("idr_pic_id"),
		    JAVA_INT.withName("primary_pic_type"),
		    JAVA_INT.withName("frame_num"),
		    JAVA_INT.withName("PicOrderCnt"),
		    JAVA_BYTE.withName("temporal_id"),
		    MemoryLayout.sequenceLayout(3, JAVA_BYTE).withName("reserved1"),
		    UNBOUNDED_ADDRESS.withName("pRefLists")
		).withName("StdVideoEncodeH264PictureInfo").withByteAlignment(8);
		
		SEQ_PARAMETER_SET_ID_HANDLE = LAYOUT.varHandle(PathElement.groupElement("seq_parameter_set_id"));
		PIC_PARAMETER_SET_ID_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pic_parameter_set_id"));
		IDR_PIC_ID_HANDLE = LAYOUT.varHandle(PathElement.groupElement("idr_pic_id"));
		PRIMARY_PIC_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("primary_pic_type"));
		FRAME_NUM_HANDLE = LAYOUT.varHandle(PathElement.groupElement("frame_num"));
		PIC_ORDER_CNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("PicOrderCnt"));
		TEMPORAL_ID_HANDLE = LAYOUT.varHandle(PathElement.groupElement("temporal_id"));
		RESERVED1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("reserved1"), PathElement.sequenceElement());
		P_REF_LISTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pRefLists"));
		
		FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
		SEQ_PARAMETER_SET_ID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("seq_parameter_set_id"));
		PIC_PARAMETER_SET_ID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pic_parameter_set_id"));
		IDR_PIC_ID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("idr_pic_id"));
		PRIMARY_PIC_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("primary_pic_type"));
		FRAME_NUM_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("frame_num"));
		PIC_ORDER_CNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("PicOrderCnt"));
		TEMPORAL_ID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("temporal_id"));
		RESERVED1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("reserved1"));
		P_REF_LISTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pRefLists"));
		//@formatter:on
	}

	public StdVideoEncodeH264PictureInfo() {
	    this(Arena.ofAuto());
	}
	
	public StdVideoEncodeH264PictureInfo(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public StdVideoEncodeH264PictureInfo(MemorySegment segment) {
	    this.segment = segment;
	
	    flags = new StdVideoEncodeH264PictureInfoFlags(segment.asSlice(FLAGS_BYTE_OFFSET, StdVideoEncodeH264PictureInfoFlags.LAYOUT));
	}

    /// @see #flags()
    public StdVideoEncodeH264PictureInfo flags(Consumer<StdVideoEncodeH264PictureInfoFlags> consumer) {
    	consumer.accept(flags);
    	return this;
    }
    
    /// @see #flags()
    public StdVideoEncodeH264PictureInfo flags(StdVideoEncodeH264PictureInfoFlags other) {
    	flags.set(other);
    	return this;
    }
    
    public StdVideoEncodeH264PictureInfoFlags flags() {
    	return flags;
    }
    
    /// @see #seq_parameter_set_id()
    public StdVideoEncodeH264PictureInfo seq_parameter_set_id(byte seq_parameter_set_id) {
    	SEQ_PARAMETER_SET_ID_HANDLE.set(segment, 0L, seq_parameter_set_id);
    	return this;
    }
    
    public byte seq_parameter_set_id() {
    	return (byte) SEQ_PARAMETER_SET_ID_HANDLE.get(segment, 0L);
    }
    
    /// @see #pic_parameter_set_id()
    public StdVideoEncodeH264PictureInfo pic_parameter_set_id(byte pic_parameter_set_id) {
    	PIC_PARAMETER_SET_ID_HANDLE.set(segment, 0L, pic_parameter_set_id);
    	return this;
    }
    
    public byte pic_parameter_set_id() {
    	return (byte) PIC_PARAMETER_SET_ID_HANDLE.get(segment, 0L);
    }
    
    /// @see #idr_pic_id()
    public StdVideoEncodeH264PictureInfo idr_pic_id(short idr_pic_id) {
    	IDR_PIC_ID_HANDLE.set(segment, 0L, idr_pic_id);
    	return this;
    }
    
    public short idr_pic_id() {
    	return (short) IDR_PIC_ID_HANDLE.get(segment, 0L);
    }
    
    /// @see #primary_pic_type()
    public StdVideoEncodeH264PictureInfo primary_pic_type(int primary_pic_type) {
    	PRIMARY_PIC_TYPE_HANDLE.set(segment, 0L, primary_pic_type);
    	return this;
    }
    
    public int primary_pic_type() {
    	return (int) PRIMARY_PIC_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #frame_num()
    public StdVideoEncodeH264PictureInfo frame_num(int frame_num) {
    	FRAME_NUM_HANDLE.set(segment, 0L, frame_num);
    	return this;
    }
    
    public int frame_num() {
    	return (int) FRAME_NUM_HANDLE.get(segment, 0L);
    }
    
    /// @see #picOrderCnt()
    public StdVideoEncodeH264PictureInfo picOrderCnt(int picOrderCnt) {
    	PIC_ORDER_CNT_HANDLE.set(segment, 0L, picOrderCnt);
    	return this;
    }
    
    public int picOrderCnt() {
    	return (int) PIC_ORDER_CNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #temporal_id()
    public StdVideoEncodeH264PictureInfo temporal_id(byte temporal_id) {
    	TEMPORAL_ID_HANDLE.set(segment, 0L, temporal_id);
    	return this;
    }
    
    public byte temporal_id() {
    	return (byte) TEMPORAL_ID_HANDLE.get(segment, 0L);
    }
    
    /// @see #reserved1(int)
    public StdVideoEncodeH264PictureInfo reserved1(byte reserved1, int index0) {
    	RESERVED1_HANDLE.set(segment, 0L, index0, reserved1);
    	return this;
    }
    
    public byte reserved1(int index0) {
    	return (byte) RESERVED1_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #pRefLists()
    public StdVideoEncodeH264PictureInfo pRefLists(StdVideoEncodeH264ReferenceListsInfo pRefLists) {
    	P_REF_LISTS_HANDLE.set(segment, 0L, pRefLists.memorySegment());
    	return this;
    }
    
    public @Nullable StdVideoEncodeH264ReferenceListsInfo pRefLists() {
    	MemorySegment segment = (MemorySegment) P_REF_LISTS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new StdVideoEncodeH264ReferenceListsInfo(segment);
    }
    
    @Override
    public StdVideoEncodeH264PictureInfo set(StdVideoEncodeH264PictureInfo other) {
        return set(other.segment);
    }
    
    @Override
    public StdVideoEncodeH264PictureInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<StdVideoEncodeH264PictureInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<StdVideoEncodeH264PictureInfo> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new StdVideoEncodeH264PictureInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<StdVideoEncodeH264PictureInfo> array(Arena arena, StdVideoEncodeH264PictureInfo... structs) {
        NativeStructArray<StdVideoEncodeH264PictureInfo> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new StdVideoEncodeH264PictureInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<StdVideoEncodeH264PictureInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new StdVideoEncodeH264PictureInfo(segment)
        );
    }

}