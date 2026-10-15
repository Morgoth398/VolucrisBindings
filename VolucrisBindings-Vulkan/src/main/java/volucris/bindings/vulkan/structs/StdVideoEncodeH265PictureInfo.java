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

public final class StdVideoEncodeH265PictureInfo
		implements Struct<StdVideoEncodeH265PictureInfo> {

	public static final StructLayout LAYOUT;

	public static final VarHandle PIC_TYPE_HANDLE;
	public static final VarHandle SPS_VIDEO_PARAMETER_SET_ID_HANDLE;
	public static final VarHandle PPS_SEQ_PARAMETER_SET_ID_HANDLE;
	public static final VarHandle PPS_PIC_PARAMETER_SET_ID_HANDLE;
	public static final VarHandle SHORT_TERM_REF_PIC_SET_IDX_HANDLE;
	public static final VarHandle PIC_ORDER_CNT_VAL_HANDLE;
	public static final VarHandle TEMPORAL_ID_HANDLE;
	public static final VarHandle RESERVED1_HANDLE;
	public static final VarHandle P_REF_LISTS_HANDLE;
	public static final VarHandle P_SHORT_TERM_REF_PIC_SET_HANDLE;
	public static final VarHandle P_LONG_TERM_REF_PICS_HANDLE;

	public static final long FLAGS_BYTE_OFFSET;
	public static final long PIC_TYPE_BYTE_OFFSET;
	public static final long SPS_VIDEO_PARAMETER_SET_ID_BYTE_OFFSET;
	public static final long PPS_SEQ_PARAMETER_SET_ID_BYTE_OFFSET;
	public static final long PPS_PIC_PARAMETER_SET_ID_BYTE_OFFSET;
	public static final long SHORT_TERM_REF_PIC_SET_IDX_BYTE_OFFSET;
	public static final long PIC_ORDER_CNT_VAL_BYTE_OFFSET;
	public static final long TEMPORAL_ID_BYTE_OFFSET;
	public static final long RESERVED1_BYTE_OFFSET;
	public static final long P_REF_LISTS_BYTE_OFFSET;
	public static final long P_SHORT_TERM_REF_PIC_SET_BYTE_OFFSET;
	public static final long P_LONG_TERM_REF_PICS_BYTE_OFFSET;

	private final MemorySegment segment;

	private final StdVideoEncodeH265PictureInfoFlags flags;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    StdVideoEncodeH265PictureInfoFlags.LAYOUT.withName("flags"),
		    JAVA_INT.withName("pic_type"),
		    JAVA_BYTE.withName("sps_video_parameter_set_id"),
		    JAVA_BYTE.withName("pps_seq_parameter_set_id"),
		    JAVA_BYTE.withName("pps_pic_parameter_set_id"),
		    JAVA_BYTE.withName("short_term_ref_pic_set_idx"),
		    JAVA_INT.withName("PicOrderCntVal"),
		    JAVA_BYTE.withName("TemporalId"),
		    MemoryLayout.sequenceLayout(7, JAVA_BYTE).withName("reserved1"),
		    UNBOUNDED_ADDRESS.withName("pRefLists"),
		    UNBOUNDED_ADDRESS.withName("pShortTermRefPicSet"),
		    UNBOUNDED_ADDRESS.withName("pLongTermRefPics")
		).withName("StdVideoEncodeH265PictureInfo").withByteAlignment(8);
		
		PIC_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pic_type"));
		SPS_VIDEO_PARAMETER_SET_ID_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sps_video_parameter_set_id"));
		PPS_SEQ_PARAMETER_SET_ID_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pps_seq_parameter_set_id"));
		PPS_PIC_PARAMETER_SET_ID_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pps_pic_parameter_set_id"));
		SHORT_TERM_REF_PIC_SET_IDX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("short_term_ref_pic_set_idx"));
		PIC_ORDER_CNT_VAL_HANDLE = LAYOUT.varHandle(PathElement.groupElement("PicOrderCntVal"));
		TEMPORAL_ID_HANDLE = LAYOUT.varHandle(PathElement.groupElement("TemporalId"));
		RESERVED1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("reserved1"), PathElement.sequenceElement());
		P_REF_LISTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pRefLists"));
		P_SHORT_TERM_REF_PIC_SET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pShortTermRefPicSet"));
		P_LONG_TERM_REF_PICS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pLongTermRefPics"));
		
		FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
		PIC_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pic_type"));
		SPS_VIDEO_PARAMETER_SET_ID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sps_video_parameter_set_id"));
		PPS_SEQ_PARAMETER_SET_ID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pps_seq_parameter_set_id"));
		PPS_PIC_PARAMETER_SET_ID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pps_pic_parameter_set_id"));
		SHORT_TERM_REF_PIC_SET_IDX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("short_term_ref_pic_set_idx"));
		PIC_ORDER_CNT_VAL_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("PicOrderCntVal"));
		TEMPORAL_ID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("TemporalId"));
		RESERVED1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("reserved1"));
		P_REF_LISTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pRefLists"));
		P_SHORT_TERM_REF_PIC_SET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pShortTermRefPicSet"));
		P_LONG_TERM_REF_PICS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pLongTermRefPics"));
		//@formatter:on
	}

	public StdVideoEncodeH265PictureInfo() {
	    this(Arena.ofAuto());
	}
	
	public StdVideoEncodeH265PictureInfo(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public StdVideoEncodeH265PictureInfo(MemorySegment segment) {
	    this.segment = segment;
	
	    flags = new StdVideoEncodeH265PictureInfoFlags(segment.asSlice(FLAGS_BYTE_OFFSET, StdVideoEncodeH265PictureInfoFlags.LAYOUT));
	}

    /// @see #flags()
    public StdVideoEncodeH265PictureInfo flags(Consumer<StdVideoEncodeH265PictureInfoFlags> consumer) {
    	consumer.accept(flags);
    	return this;
    }
    
    /// @see #flags()
    public StdVideoEncodeH265PictureInfo flags(StdVideoEncodeH265PictureInfoFlags other) {
    	flags.set(other);
    	return this;
    }
    
    public StdVideoEncodeH265PictureInfoFlags flags() {
    	return flags;
    }
    
    /// @see #pic_type()
    public StdVideoEncodeH265PictureInfo pic_type(int pic_type) {
    	PIC_TYPE_HANDLE.set(segment, 0L, pic_type);
    	return this;
    }
    
    public int pic_type() {
    	return (int) PIC_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #sps_video_parameter_set_id()
    public StdVideoEncodeH265PictureInfo sps_video_parameter_set_id(byte sps_video_parameter_set_id) {
    	SPS_VIDEO_PARAMETER_SET_ID_HANDLE.set(segment, 0L, sps_video_parameter_set_id);
    	return this;
    }
    
    public byte sps_video_parameter_set_id() {
    	return (byte) SPS_VIDEO_PARAMETER_SET_ID_HANDLE.get(segment, 0L);
    }
    
    /// @see #pps_seq_parameter_set_id()
    public StdVideoEncodeH265PictureInfo pps_seq_parameter_set_id(byte pps_seq_parameter_set_id) {
    	PPS_SEQ_PARAMETER_SET_ID_HANDLE.set(segment, 0L, pps_seq_parameter_set_id);
    	return this;
    }
    
    public byte pps_seq_parameter_set_id() {
    	return (byte) PPS_SEQ_PARAMETER_SET_ID_HANDLE.get(segment, 0L);
    }
    
    /// @see #pps_pic_parameter_set_id()
    public StdVideoEncodeH265PictureInfo pps_pic_parameter_set_id(byte pps_pic_parameter_set_id) {
    	PPS_PIC_PARAMETER_SET_ID_HANDLE.set(segment, 0L, pps_pic_parameter_set_id);
    	return this;
    }
    
    public byte pps_pic_parameter_set_id() {
    	return (byte) PPS_PIC_PARAMETER_SET_ID_HANDLE.get(segment, 0L);
    }
    
    /// @see #short_term_ref_pic_set_idx()
    public StdVideoEncodeH265PictureInfo short_term_ref_pic_set_idx(byte short_term_ref_pic_set_idx) {
    	SHORT_TERM_REF_PIC_SET_IDX_HANDLE.set(segment, 0L, short_term_ref_pic_set_idx);
    	return this;
    }
    
    public byte short_term_ref_pic_set_idx() {
    	return (byte) SHORT_TERM_REF_PIC_SET_IDX_HANDLE.get(segment, 0L);
    }
    
    /// @see #picOrderCntVal()
    public StdVideoEncodeH265PictureInfo picOrderCntVal(int picOrderCntVal) {
    	PIC_ORDER_CNT_VAL_HANDLE.set(segment, 0L, picOrderCntVal);
    	return this;
    }
    
    public int picOrderCntVal() {
    	return (int) PIC_ORDER_CNT_VAL_HANDLE.get(segment, 0L);
    }
    
    /// @see #temporalId()
    public StdVideoEncodeH265PictureInfo temporalId(byte temporalId) {
    	TEMPORAL_ID_HANDLE.set(segment, 0L, temporalId);
    	return this;
    }
    
    public byte temporalId() {
    	return (byte) TEMPORAL_ID_HANDLE.get(segment, 0L);
    }
    
    /// @see #reserved1(int)
    public StdVideoEncodeH265PictureInfo reserved1(byte reserved1, int index0) {
    	RESERVED1_HANDLE.set(segment, 0L, index0, reserved1);
    	return this;
    }
    
    public byte reserved1(int index0) {
    	return (byte) RESERVED1_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #pRefLists()
    public StdVideoEncodeH265PictureInfo pRefLists(StdVideoEncodeH265ReferenceListsInfo pRefLists) {
    	P_REF_LISTS_HANDLE.set(segment, 0L, pRefLists.memorySegment());
    	return this;
    }
    
    public @Nullable StdVideoEncodeH265ReferenceListsInfo pRefLists() {
    	MemorySegment segment = (MemorySegment) P_REF_LISTS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new StdVideoEncodeH265ReferenceListsInfo(segment);
    }
    
    /// @see #pShortTermRefPicSet()
    public StdVideoEncodeH265PictureInfo pShortTermRefPicSet(StdVideoH265ShortTermRefPicSet pShortTermRefPicSet) {
    	P_SHORT_TERM_REF_PIC_SET_HANDLE.set(segment, 0L, pShortTermRefPicSet.memorySegment());
    	return this;
    }
    
    public @Nullable StdVideoH265ShortTermRefPicSet pShortTermRefPicSet() {
    	MemorySegment segment = (MemorySegment) P_SHORT_TERM_REF_PIC_SET_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new StdVideoH265ShortTermRefPicSet(segment);
    }
    
    /// @see #pLongTermRefPics()
    public StdVideoEncodeH265PictureInfo pLongTermRefPics(StdVideoEncodeH265LongTermRefPics pLongTermRefPics) {
    	P_LONG_TERM_REF_PICS_HANDLE.set(segment, 0L, pLongTermRefPics.memorySegment());
    	return this;
    }
    
    public @Nullable StdVideoEncodeH265LongTermRefPics pLongTermRefPics() {
    	MemorySegment segment = (MemorySegment) P_LONG_TERM_REF_PICS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new StdVideoEncodeH265LongTermRefPics(segment);
    }
    
    @Override
    public StdVideoEncodeH265PictureInfo set(StdVideoEncodeH265PictureInfo other) {
        return set(other.segment);
    }
    
    @Override
    public StdVideoEncodeH265PictureInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<StdVideoEncodeH265PictureInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<StdVideoEncodeH265PictureInfo> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new StdVideoEncodeH265PictureInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<StdVideoEncodeH265PictureInfo> array(Arena arena, StdVideoEncodeH265PictureInfo... structs) {
        NativeStructArray<StdVideoEncodeH265PictureInfo> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new StdVideoEncodeH265PictureInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<StdVideoEncodeH265PictureInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new StdVideoEncodeH265PictureInfo(segment)
        );
    }

}