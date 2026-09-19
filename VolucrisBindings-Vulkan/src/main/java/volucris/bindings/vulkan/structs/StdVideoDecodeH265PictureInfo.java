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
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;

public final class StdVideoDecodeH265PictureInfo
		implements Struct<StdVideoDecodeH265PictureInfo> {

    public static final StructLayout LAYOUT;

    public static final VarHandle SPS_VIDEO_PARAMETER_SET_ID_HANDLE;
    public static final VarHandle PPS_SEQ_PARAMETER_SET_ID_HANDLE;
    public static final VarHandle PPS_PIC_PARAMETER_SET_ID_HANDLE;
    public static final VarHandle NUM_DELTA_POCS_OF_REF_RPS_IDX_HANDLE;
    public static final VarHandle PIC_ORDER_CNT_VAL_HANDLE;
    public static final VarHandle NUM_BITS_FOR_STREF_PIC_SET_IN_SLICE_HANDLE;
    public static final VarHandle RESERVED_HANDLE;
    public static final VarHandle REF_PIC_SET_ST_CURR_BEFORE_HANDLE;
    public static final VarHandle REF_PIC_SET_ST_CURR_AFTER_HANDLE;
    public static final VarHandle REF_PIC_SET_LT_CURR_HANDLE;

    public static final long FLAGS_BYTE_OFFSET;
    public static final long SPS_VIDEO_PARAMETER_SET_ID_BYTE_OFFSET;
    public static final long PPS_SEQ_PARAMETER_SET_ID_BYTE_OFFSET;
    public static final long PPS_PIC_PARAMETER_SET_ID_BYTE_OFFSET;
    public static final long NUM_DELTA_POCS_OF_REF_RPS_IDX_BYTE_OFFSET;
    public static final long PIC_ORDER_CNT_VAL_BYTE_OFFSET;
    public static final long NUM_BITS_FOR_STREF_PIC_SET_IN_SLICE_BYTE_OFFSET;
    public static final long RESERVED_BYTE_OFFSET;
    public static final long REF_PIC_SET_ST_CURR_BEFORE_BYTE_OFFSET;
    public static final long REF_PIC_SET_ST_CURR_AFTER_BYTE_OFFSET;
    public static final long REF_PIC_SET_LT_CURR_BYTE_OFFSET;

    private final MemorySegment segment;

    private final StdVideoDecodeH265PictureInfoFlags flags;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            StdVideoDecodeH265PictureInfoFlags.LAYOUT.withName("flags"),
            JAVA_BYTE.withName("sps_video_parameter_set_id"),
            JAVA_BYTE.withName("pps_seq_parameter_set_id"),
            JAVA_BYTE.withName("pps_pic_parameter_set_id"),
            JAVA_BYTE.withName("NumDeltaPocsOfRefRpsIdx"),
            JAVA_INT.withName("PicOrderCntVal"),
            JAVA_SHORT.withName("NumBitsForSTRefPicSetInSlice"),
            JAVA_SHORT.withName("reserved"),
            MemoryLayout.sequenceLayout(8, JAVA_BYTE).withName("RefPicSetStCurrBefore"),
            MemoryLayout.sequenceLayout(8, JAVA_BYTE).withName("RefPicSetStCurrAfter"),
            MemoryLayout.sequenceLayout(8, JAVA_BYTE).withName("RefPicSetLtCurr")
        ).withName("StdVideoDecodeH265PictureInfo").withByteAlignment(4);
        
        SPS_VIDEO_PARAMETER_SET_ID_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sps_video_parameter_set_id"));
        PPS_SEQ_PARAMETER_SET_ID_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pps_seq_parameter_set_id"));
        PPS_PIC_PARAMETER_SET_ID_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pps_pic_parameter_set_id"));
        NUM_DELTA_POCS_OF_REF_RPS_IDX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("NumDeltaPocsOfRefRpsIdx"));
        PIC_ORDER_CNT_VAL_HANDLE = LAYOUT.varHandle(PathElement.groupElement("PicOrderCntVal"));
        NUM_BITS_FOR_STREF_PIC_SET_IN_SLICE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("NumBitsForSTRefPicSetInSlice"));
        RESERVED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("reserved"));
        REF_PIC_SET_ST_CURR_BEFORE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("RefPicSetStCurrBefore"), PathElement.sequenceElement());
        REF_PIC_SET_ST_CURR_AFTER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("RefPicSetStCurrAfter"), PathElement.sequenceElement());
        REF_PIC_SET_LT_CURR_HANDLE = LAYOUT.varHandle(PathElement.groupElement("RefPicSetLtCurr"), PathElement.sequenceElement());
        
        FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
        SPS_VIDEO_PARAMETER_SET_ID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sps_video_parameter_set_id"));
        PPS_SEQ_PARAMETER_SET_ID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pps_seq_parameter_set_id"));
        PPS_PIC_PARAMETER_SET_ID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pps_pic_parameter_set_id"));
        NUM_DELTA_POCS_OF_REF_RPS_IDX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("NumDeltaPocsOfRefRpsIdx"));
        PIC_ORDER_CNT_VAL_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("PicOrderCntVal"));
        NUM_BITS_FOR_STREF_PIC_SET_IN_SLICE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("NumBitsForSTRefPicSetInSlice"));
        RESERVED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("reserved"));
        REF_PIC_SET_ST_CURR_BEFORE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("RefPicSetStCurrBefore"));
        REF_PIC_SET_ST_CURR_AFTER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("RefPicSetStCurrAfter"));
        REF_PIC_SET_LT_CURR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("RefPicSetLtCurr"));
        //@formatter:on
    }

    public StdVideoDecodeH265PictureInfo() {
        this(Arena.ofAuto());
    }
    
    public StdVideoDecodeH265PictureInfo(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public StdVideoDecodeH265PictureInfo(MemorySegment segment) {
        this.segment = segment;
    
        flags = new StdVideoDecodeH265PictureInfoFlags(segment.asSlice(FLAGS_BYTE_OFFSET, StdVideoDecodeH265PictureInfoFlags.LAYOUT));
    }

    /// @see #sps_video_parameter_set_id()
    public StdVideoDecodeH265PictureInfo sps_video_parameter_set_id(byte sps_video_parameter_set_id) {
    	SPS_VIDEO_PARAMETER_SET_ID_HANDLE.set(segment, 0L, sps_video_parameter_set_id);
    	return this;
    }
    
    public byte sps_video_parameter_set_id() {
    	return (byte) SPS_VIDEO_PARAMETER_SET_ID_HANDLE.get(segment, 0L);
    }
    
    /// @see #pps_seq_parameter_set_id()
    public StdVideoDecodeH265PictureInfo pps_seq_parameter_set_id(byte pps_seq_parameter_set_id) {
    	PPS_SEQ_PARAMETER_SET_ID_HANDLE.set(segment, 0L, pps_seq_parameter_set_id);
    	return this;
    }
    
    public byte pps_seq_parameter_set_id() {
    	return (byte) PPS_SEQ_PARAMETER_SET_ID_HANDLE.get(segment, 0L);
    }
    
    /// @see #pps_pic_parameter_set_id()
    public StdVideoDecodeH265PictureInfo pps_pic_parameter_set_id(byte pps_pic_parameter_set_id) {
    	PPS_PIC_PARAMETER_SET_ID_HANDLE.set(segment, 0L, pps_pic_parameter_set_id);
    	return this;
    }
    
    public byte pps_pic_parameter_set_id() {
    	return (byte) PPS_PIC_PARAMETER_SET_ID_HANDLE.get(segment, 0L);
    }
    
    /// @see #numDeltaPocsOfRefRpsIdx()
    public StdVideoDecodeH265PictureInfo numDeltaPocsOfRefRpsIdx(byte numDeltaPocsOfRefRpsIdx) {
    	NUM_DELTA_POCS_OF_REF_RPS_IDX_HANDLE.set(segment, 0L, numDeltaPocsOfRefRpsIdx);
    	return this;
    }
    
    public byte numDeltaPocsOfRefRpsIdx() {
    	return (byte) NUM_DELTA_POCS_OF_REF_RPS_IDX_HANDLE.get(segment, 0L);
    }
    
    /// @see #picOrderCntVal()
    public StdVideoDecodeH265PictureInfo picOrderCntVal(int picOrderCntVal) {
    	PIC_ORDER_CNT_VAL_HANDLE.set(segment, 0L, picOrderCntVal);
    	return this;
    }
    
    public int picOrderCntVal() {
    	return (int) PIC_ORDER_CNT_VAL_HANDLE.get(segment, 0L);
    }
    
    /// @see #numBitsForSTRefPicSetInSlice()
    public StdVideoDecodeH265PictureInfo numBitsForSTRefPicSetInSlice(short numBitsForSTRefPicSetInSlice) {
    	NUM_BITS_FOR_STREF_PIC_SET_IN_SLICE_HANDLE.set(segment, 0L, numBitsForSTRefPicSetInSlice);
    	return this;
    }
    
    public short numBitsForSTRefPicSetInSlice() {
    	return (short) NUM_BITS_FOR_STREF_PIC_SET_IN_SLICE_HANDLE.get(segment, 0L);
    }
    
    /// @see #reserved()
    public StdVideoDecodeH265PictureInfo reserved(short reserved) {
    	RESERVED_HANDLE.set(segment, 0L, reserved);
    	return this;
    }
    
    public short reserved() {
    	return (short) RESERVED_HANDLE.get(segment, 0L);
    }
    
    /// @see #refPicSetStCurrBefore(int)
    public StdVideoDecodeH265PictureInfo refPicSetStCurrBefore(byte refPicSetStCurrBefore, int index0) {
    	REF_PIC_SET_ST_CURR_BEFORE_HANDLE.set(segment, 0L, index0, refPicSetStCurrBefore);
    	return this;
    }
    
    public byte refPicSetStCurrBefore(int index0) {
    	return (byte) REF_PIC_SET_ST_CURR_BEFORE_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #refPicSetStCurrAfter(int)
    public StdVideoDecodeH265PictureInfo refPicSetStCurrAfter(byte refPicSetStCurrAfter, int index0) {
    	REF_PIC_SET_ST_CURR_AFTER_HANDLE.set(segment, 0L, index0, refPicSetStCurrAfter);
    	return this;
    }
    
    public byte refPicSetStCurrAfter(int index0) {
    	return (byte) REF_PIC_SET_ST_CURR_AFTER_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #refPicSetLtCurr(int)
    public StdVideoDecodeH265PictureInfo refPicSetLtCurr(byte refPicSetLtCurr, int index0) {
    	REF_PIC_SET_LT_CURR_HANDLE.set(segment, 0L, index0, refPicSetLtCurr);
    	return this;
    }
    
    public byte refPicSetLtCurr(int index0) {
    	return (byte) REF_PIC_SET_LT_CURR_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #flags()
    public StdVideoDecodeH265PictureInfo flags(Consumer<StdVideoDecodeH265PictureInfoFlags> consumer) {
    	consumer.accept(flags);
    	return this;
    }
    
    /// @see #flags()
    public StdVideoDecodeH265PictureInfo flags(StdVideoDecodeH265PictureInfoFlags other) {
    	flags.set(other);
    	return this;
    }
    
    public StdVideoDecodeH265PictureInfoFlags flags() {
    	return flags;
    }
    
    @Override
    public StdVideoDecodeH265PictureInfo set(StdVideoDecodeH265PictureInfo other) {
        return set(other.segment);
    }
    
    @Override
    public StdVideoDecodeH265PictureInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<StdVideoDecodeH265PictureInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<StdVideoDecodeH265PictureInfo> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new StdVideoDecodeH265PictureInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<StdVideoDecodeH265PictureInfo> array(Arena arena, StdVideoDecodeH265PictureInfo... structs) {
        NativeStructArray<StdVideoDecodeH265PictureInfo> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new StdVideoDecodeH265PictureInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<StdVideoDecodeH265PictureInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new StdVideoDecodeH265PictureInfo(segment)
        );
    }
    
}