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
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeIntArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class StdVideoH264SequenceParameterSet
		implements Struct<StdVideoH264SequenceParameterSet> {

	public static final StructLayout LAYOUT;

	public static final VarHandle PROFILE_IDC_HANDLE;
	public static final VarHandle LEVEL_IDC_HANDLE;
	public static final VarHandle CHROMA_FORMAT_IDC_HANDLE;
	public static final VarHandle SEQ_PARAMETER_SET_ID_HANDLE;
	public static final VarHandle BIT_DEPTH_LUMA_MINUS8_HANDLE;
	public static final VarHandle BIT_DEPTH_CHROMA_MINUS8_HANDLE;
	public static final VarHandle LOG2_MAX_FRAME_NUM_MINUS4_HANDLE;
	public static final VarHandle PIC_ORDER_CNT_TYPE_HANDLE;
	public static final VarHandle OFFSET_FOR_NON_REF_PIC_HANDLE;
	public static final VarHandle OFFSET_FOR_TOP_TO_BOTTOM_FIELD_HANDLE;
	public static final VarHandle LOG2_MAX_PIC_ORDER_CNT_LSB_MINUS4_HANDLE;
	public static final VarHandle NUM_REF_FRAMES_IN_PIC_ORDER_CNT_CYCLE_HANDLE;
	public static final VarHandle MAX_NUM_REF_FRAMES_HANDLE;
	public static final VarHandle RESERVED1_HANDLE;
	public static final VarHandle PIC_WIDTH_IN_MBS_MINUS1_HANDLE;
	public static final VarHandle PIC_HEIGHT_IN_MAP_UNITS_MINUS1_HANDLE;
	public static final VarHandle FRAME_CROP_LEFT_OFFSET_HANDLE;
	public static final VarHandle FRAME_CROP_RIGHT_OFFSET_HANDLE;
	public static final VarHandle FRAME_CROP_TOP_OFFSET_HANDLE;
	public static final VarHandle FRAME_CROP_BOTTOM_OFFSET_HANDLE;
	public static final VarHandle RESERVED2_HANDLE;
	public static final VarHandle P_OFFSET_FOR_REF_FRAME_HANDLE;
	public static final VarHandle P_SCALING_LISTS_HANDLE;
	public static final VarHandle P_SEQUENCE_PARAMETER_SET_VUI_HANDLE;

	public static final long FLAGS_BYTE_OFFSET;
	public static final long PROFILE_IDC_BYTE_OFFSET;
	public static final long LEVEL_IDC_BYTE_OFFSET;
	public static final long CHROMA_FORMAT_IDC_BYTE_OFFSET;
	public static final long SEQ_PARAMETER_SET_ID_BYTE_OFFSET;
	public static final long BIT_DEPTH_LUMA_MINUS8_BYTE_OFFSET;
	public static final long BIT_DEPTH_CHROMA_MINUS8_BYTE_OFFSET;
	public static final long LOG2_MAX_FRAME_NUM_MINUS4_BYTE_OFFSET;
	public static final long PIC_ORDER_CNT_TYPE_BYTE_OFFSET;
	public static final long OFFSET_FOR_NON_REF_PIC_BYTE_OFFSET;
	public static final long OFFSET_FOR_TOP_TO_BOTTOM_FIELD_BYTE_OFFSET;
	public static final long LOG2_MAX_PIC_ORDER_CNT_LSB_MINUS4_BYTE_OFFSET;
	public static final long NUM_REF_FRAMES_IN_PIC_ORDER_CNT_CYCLE_BYTE_OFFSET;
	public static final long MAX_NUM_REF_FRAMES_BYTE_OFFSET;
	public static final long RESERVED1_BYTE_OFFSET;
	public static final long PIC_WIDTH_IN_MBS_MINUS1_BYTE_OFFSET;
	public static final long PIC_HEIGHT_IN_MAP_UNITS_MINUS1_BYTE_OFFSET;
	public static final long FRAME_CROP_LEFT_OFFSET_BYTE_OFFSET;
	public static final long FRAME_CROP_RIGHT_OFFSET_BYTE_OFFSET;
	public static final long FRAME_CROP_TOP_OFFSET_BYTE_OFFSET;
	public static final long FRAME_CROP_BOTTOM_OFFSET_BYTE_OFFSET;
	public static final long RESERVED2_BYTE_OFFSET;
	public static final long P_OFFSET_FOR_REF_FRAME_BYTE_OFFSET;
	public static final long P_SCALING_LISTS_BYTE_OFFSET;
	public static final long P_SEQUENCE_PARAMETER_SET_VUI_BYTE_OFFSET;

	private final MemorySegment segment;

	private final StdVideoH264SpsFlags flags;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    StdVideoH264SpsFlags.LAYOUT.withName("flags"),
		    JAVA_INT.withName("profile_idc"),
		    JAVA_INT.withName("level_idc"),
		    JAVA_INT.withName("chroma_format_idc"),
		    JAVA_BYTE.withName("seq_parameter_set_id"),
		    JAVA_BYTE.withName("bit_depth_luma_minus8"),
		    JAVA_BYTE.withName("bit_depth_chroma_minus8"),
		    JAVA_BYTE.withName("log2_max_frame_num_minus4"),
		    JAVA_INT.withName("pic_order_cnt_type"),
		    JAVA_INT.withName("offset_for_non_ref_pic"),
		    JAVA_INT.withName("offset_for_top_to_bottom_field"),
		    JAVA_BYTE.withName("log2_max_pic_order_cnt_lsb_minus4"),
		    JAVA_BYTE.withName("num_ref_frames_in_pic_order_cnt_cycle"),
		    JAVA_BYTE.withName("max_num_ref_frames"),
		    JAVA_BYTE.withName("reserved1"),
		    JAVA_INT.withName("pic_width_in_mbs_minus1"),
		    JAVA_INT.withName("pic_height_in_map_units_minus1"),
		    JAVA_INT.withName("frame_crop_left_offset"),
		    JAVA_INT.withName("frame_crop_right_offset"),
		    JAVA_INT.withName("frame_crop_top_offset"),
		    JAVA_INT.withName("frame_crop_bottom_offset"),
		    JAVA_INT.withName("reserved2"),
		    UNBOUNDED_ADDRESS.withName("pOffsetForRefFrame"),
		    UNBOUNDED_ADDRESS.withName("pScalingLists"),
		    UNBOUNDED_ADDRESS.withName("pSequenceParameterSetVui")
		).withName("StdVideoH264SequenceParameterSet").withByteAlignment(8);
		
		PROFILE_IDC_HANDLE = LAYOUT.varHandle(PathElement.groupElement("profile_idc"));
		LEVEL_IDC_HANDLE = LAYOUT.varHandle(PathElement.groupElement("level_idc"));
		CHROMA_FORMAT_IDC_HANDLE = LAYOUT.varHandle(PathElement.groupElement("chroma_format_idc"));
		SEQ_PARAMETER_SET_ID_HANDLE = LAYOUT.varHandle(PathElement.groupElement("seq_parameter_set_id"));
		BIT_DEPTH_LUMA_MINUS8_HANDLE = LAYOUT.varHandle(PathElement.groupElement("bit_depth_luma_minus8"));
		BIT_DEPTH_CHROMA_MINUS8_HANDLE = LAYOUT.varHandle(PathElement.groupElement("bit_depth_chroma_minus8"));
		LOG2_MAX_FRAME_NUM_MINUS4_HANDLE = LAYOUT.varHandle(PathElement.groupElement("log2_max_frame_num_minus4"));
		PIC_ORDER_CNT_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pic_order_cnt_type"));
		OFFSET_FOR_NON_REF_PIC_HANDLE = LAYOUT.varHandle(PathElement.groupElement("offset_for_non_ref_pic"));
		OFFSET_FOR_TOP_TO_BOTTOM_FIELD_HANDLE = LAYOUT.varHandle(PathElement.groupElement("offset_for_top_to_bottom_field"));
		LOG2_MAX_PIC_ORDER_CNT_LSB_MINUS4_HANDLE = LAYOUT.varHandle(PathElement.groupElement("log2_max_pic_order_cnt_lsb_minus4"));
		NUM_REF_FRAMES_IN_PIC_ORDER_CNT_CYCLE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("num_ref_frames_in_pic_order_cnt_cycle"));
		MAX_NUM_REF_FRAMES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("max_num_ref_frames"));
		RESERVED1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("reserved1"));
		PIC_WIDTH_IN_MBS_MINUS1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pic_width_in_mbs_minus1"));
		PIC_HEIGHT_IN_MAP_UNITS_MINUS1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pic_height_in_map_units_minus1"));
		FRAME_CROP_LEFT_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("frame_crop_left_offset"));
		FRAME_CROP_RIGHT_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("frame_crop_right_offset"));
		FRAME_CROP_TOP_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("frame_crop_top_offset"));
		FRAME_CROP_BOTTOM_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("frame_crop_bottom_offset"));
		RESERVED2_HANDLE = LAYOUT.varHandle(PathElement.groupElement("reserved2"));
		P_OFFSET_FOR_REF_FRAME_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pOffsetForRefFrame"));
		P_SCALING_LISTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pScalingLists"));
		P_SEQUENCE_PARAMETER_SET_VUI_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pSequenceParameterSetVui"));
		
		FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
		PROFILE_IDC_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("profile_idc"));
		LEVEL_IDC_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("level_idc"));
		CHROMA_FORMAT_IDC_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("chroma_format_idc"));
		SEQ_PARAMETER_SET_ID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("seq_parameter_set_id"));
		BIT_DEPTH_LUMA_MINUS8_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("bit_depth_luma_minus8"));
		BIT_DEPTH_CHROMA_MINUS8_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("bit_depth_chroma_minus8"));
		LOG2_MAX_FRAME_NUM_MINUS4_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("log2_max_frame_num_minus4"));
		PIC_ORDER_CNT_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pic_order_cnt_type"));
		OFFSET_FOR_NON_REF_PIC_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("offset_for_non_ref_pic"));
		OFFSET_FOR_TOP_TO_BOTTOM_FIELD_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("offset_for_top_to_bottom_field"));
		LOG2_MAX_PIC_ORDER_CNT_LSB_MINUS4_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("log2_max_pic_order_cnt_lsb_minus4"));
		NUM_REF_FRAMES_IN_PIC_ORDER_CNT_CYCLE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("num_ref_frames_in_pic_order_cnt_cycle"));
		MAX_NUM_REF_FRAMES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("max_num_ref_frames"));
		RESERVED1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("reserved1"));
		PIC_WIDTH_IN_MBS_MINUS1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pic_width_in_mbs_minus1"));
		PIC_HEIGHT_IN_MAP_UNITS_MINUS1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pic_height_in_map_units_minus1"));
		FRAME_CROP_LEFT_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("frame_crop_left_offset"));
		FRAME_CROP_RIGHT_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("frame_crop_right_offset"));
		FRAME_CROP_TOP_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("frame_crop_top_offset"));
		FRAME_CROP_BOTTOM_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("frame_crop_bottom_offset"));
		RESERVED2_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("reserved2"));
		P_OFFSET_FOR_REF_FRAME_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pOffsetForRefFrame"));
		P_SCALING_LISTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pScalingLists"));
		P_SEQUENCE_PARAMETER_SET_VUI_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pSequenceParameterSetVui"));
		//@formatter:on
	}

	public StdVideoH264SequenceParameterSet() {
	    this(Arena.ofAuto());
	}
	
	public StdVideoH264SequenceParameterSet(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public StdVideoH264SequenceParameterSet(MemorySegment segment) {
	    this.segment = segment;
	
	    flags = new StdVideoH264SpsFlags(segment.asSlice(FLAGS_BYTE_OFFSET, StdVideoH264SpsFlags.LAYOUT));
	}

    /// @see #flags()
    public StdVideoH264SequenceParameterSet flags(Consumer<StdVideoH264SpsFlags> consumer) {
    	consumer.accept(flags);
    	return this;
    }
    
    /// @see #flags()
    public StdVideoH264SequenceParameterSet flags(StdVideoH264SpsFlags other) {
    	flags.set(other);
    	return this;
    }
    
    public StdVideoH264SpsFlags flags() {
    	return flags;
    }
    
    /// @see #profile_idc()
    public StdVideoH264SequenceParameterSet profile_idc(int profile_idc) {
    	PROFILE_IDC_HANDLE.set(segment, 0L, profile_idc);
    	return this;
    }
    
    public int profile_idc() {
    	return (int) PROFILE_IDC_HANDLE.get(segment, 0L);
    }
    
    /// @see #level_idc()
    public StdVideoH264SequenceParameterSet level_idc(int level_idc) {
    	LEVEL_IDC_HANDLE.set(segment, 0L, level_idc);
    	return this;
    }
    
    public int level_idc() {
    	return (int) LEVEL_IDC_HANDLE.get(segment, 0L);
    }
    
    /// @see #chroma_format_idc()
    public StdVideoH264SequenceParameterSet chroma_format_idc(int chroma_format_idc) {
    	CHROMA_FORMAT_IDC_HANDLE.set(segment, 0L, chroma_format_idc);
    	return this;
    }
    
    public int chroma_format_idc() {
    	return (int) CHROMA_FORMAT_IDC_HANDLE.get(segment, 0L);
    }
    
    /// @see #seq_parameter_set_id()
    public StdVideoH264SequenceParameterSet seq_parameter_set_id(byte seq_parameter_set_id) {
    	SEQ_PARAMETER_SET_ID_HANDLE.set(segment, 0L, seq_parameter_set_id);
    	return this;
    }
    
    public byte seq_parameter_set_id() {
    	return (byte) SEQ_PARAMETER_SET_ID_HANDLE.get(segment, 0L);
    }
    
    /// @see #bit_depth_luma_minus8()
    public StdVideoH264SequenceParameterSet bit_depth_luma_minus8(byte bit_depth_luma_minus8) {
    	BIT_DEPTH_LUMA_MINUS8_HANDLE.set(segment, 0L, bit_depth_luma_minus8);
    	return this;
    }
    
    public byte bit_depth_luma_minus8() {
    	return (byte) BIT_DEPTH_LUMA_MINUS8_HANDLE.get(segment, 0L);
    }
    
    /// @see #bit_depth_chroma_minus8()
    public StdVideoH264SequenceParameterSet bit_depth_chroma_minus8(byte bit_depth_chroma_minus8) {
    	BIT_DEPTH_CHROMA_MINUS8_HANDLE.set(segment, 0L, bit_depth_chroma_minus8);
    	return this;
    }
    
    public byte bit_depth_chroma_minus8() {
    	return (byte) BIT_DEPTH_CHROMA_MINUS8_HANDLE.get(segment, 0L);
    }
    
    /// @see #log2_max_frame_num_minus4()
    public StdVideoH264SequenceParameterSet log2_max_frame_num_minus4(byte log2_max_frame_num_minus4) {
    	LOG2_MAX_FRAME_NUM_MINUS4_HANDLE.set(segment, 0L, log2_max_frame_num_minus4);
    	return this;
    }
    
    public byte log2_max_frame_num_minus4() {
    	return (byte) LOG2_MAX_FRAME_NUM_MINUS4_HANDLE.get(segment, 0L);
    }
    
    /// @see #pic_order_cnt_type()
    public StdVideoH264SequenceParameterSet pic_order_cnt_type(int pic_order_cnt_type) {
    	PIC_ORDER_CNT_TYPE_HANDLE.set(segment, 0L, pic_order_cnt_type);
    	return this;
    }
    
    public int pic_order_cnt_type() {
    	return (int) PIC_ORDER_CNT_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #offset_for_non_ref_pic()
    public StdVideoH264SequenceParameterSet offset_for_non_ref_pic(int offset_for_non_ref_pic) {
    	OFFSET_FOR_NON_REF_PIC_HANDLE.set(segment, 0L, offset_for_non_ref_pic);
    	return this;
    }
    
    public int offset_for_non_ref_pic() {
    	return (int) OFFSET_FOR_NON_REF_PIC_HANDLE.get(segment, 0L);
    }
    
    /// @see #offset_for_top_to_bottom_field()
    public StdVideoH264SequenceParameterSet offset_for_top_to_bottom_field(int offset_for_top_to_bottom_field) {
    	OFFSET_FOR_TOP_TO_BOTTOM_FIELD_HANDLE.set(segment, 0L, offset_for_top_to_bottom_field);
    	return this;
    }
    
    public int offset_for_top_to_bottom_field() {
    	return (int) OFFSET_FOR_TOP_TO_BOTTOM_FIELD_HANDLE.get(segment, 0L);
    }
    
    /// @see #log2_max_pic_order_cnt_lsb_minus4()
    public StdVideoH264SequenceParameterSet log2_max_pic_order_cnt_lsb_minus4(byte log2_max_pic_order_cnt_lsb_minus4) {
    	LOG2_MAX_PIC_ORDER_CNT_LSB_MINUS4_HANDLE.set(segment, 0L, log2_max_pic_order_cnt_lsb_minus4);
    	return this;
    }
    
    public byte log2_max_pic_order_cnt_lsb_minus4() {
    	return (byte) LOG2_MAX_PIC_ORDER_CNT_LSB_MINUS4_HANDLE.get(segment, 0L);
    }
    
    /// @see #num_ref_frames_in_pic_order_cnt_cycle()
    public StdVideoH264SequenceParameterSet num_ref_frames_in_pic_order_cnt_cycle(byte num_ref_frames_in_pic_order_cnt_cycle) {
    	NUM_REF_FRAMES_IN_PIC_ORDER_CNT_CYCLE_HANDLE.set(segment, 0L, num_ref_frames_in_pic_order_cnt_cycle);
    	return this;
    }
    
    public byte num_ref_frames_in_pic_order_cnt_cycle() {
    	return (byte) NUM_REF_FRAMES_IN_PIC_ORDER_CNT_CYCLE_HANDLE.get(segment, 0L);
    }
    
    /// @see #max_num_ref_frames()
    public StdVideoH264SequenceParameterSet max_num_ref_frames(byte max_num_ref_frames) {
    	MAX_NUM_REF_FRAMES_HANDLE.set(segment, 0L, max_num_ref_frames);
    	return this;
    }
    
    public byte max_num_ref_frames() {
    	return (byte) MAX_NUM_REF_FRAMES_HANDLE.get(segment, 0L);
    }
    
    /// @see #reserved1()
    public StdVideoH264SequenceParameterSet reserved1(byte reserved1) {
    	RESERVED1_HANDLE.set(segment, 0L, reserved1);
    	return this;
    }
    
    public byte reserved1() {
    	return (byte) RESERVED1_HANDLE.get(segment, 0L);
    }
    
    /// @see #pic_width_in_mbs_minus1()
    public StdVideoH264SequenceParameterSet pic_width_in_mbs_minus1(int pic_width_in_mbs_minus1) {
    	PIC_WIDTH_IN_MBS_MINUS1_HANDLE.set(segment, 0L, pic_width_in_mbs_minus1);
    	return this;
    }
    
    public int pic_width_in_mbs_minus1() {
    	return (int) PIC_WIDTH_IN_MBS_MINUS1_HANDLE.get(segment, 0L);
    }
    
    /// @see #pic_height_in_map_units_minus1()
    public StdVideoH264SequenceParameterSet pic_height_in_map_units_minus1(int pic_height_in_map_units_minus1) {
    	PIC_HEIGHT_IN_MAP_UNITS_MINUS1_HANDLE.set(segment, 0L, pic_height_in_map_units_minus1);
    	return this;
    }
    
    public int pic_height_in_map_units_minus1() {
    	return (int) PIC_HEIGHT_IN_MAP_UNITS_MINUS1_HANDLE.get(segment, 0L);
    }
    
    /// @see #frame_crop_left_offset()
    public StdVideoH264SequenceParameterSet frame_crop_left_offset(int frame_crop_left_offset) {
    	FRAME_CROP_LEFT_OFFSET_HANDLE.set(segment, 0L, frame_crop_left_offset);
    	return this;
    }
    
    public int frame_crop_left_offset() {
    	return (int) FRAME_CROP_LEFT_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #frame_crop_right_offset()
    public StdVideoH264SequenceParameterSet frame_crop_right_offset(int frame_crop_right_offset) {
    	FRAME_CROP_RIGHT_OFFSET_HANDLE.set(segment, 0L, frame_crop_right_offset);
    	return this;
    }
    
    public int frame_crop_right_offset() {
    	return (int) FRAME_CROP_RIGHT_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #frame_crop_top_offset()
    public StdVideoH264SequenceParameterSet frame_crop_top_offset(int frame_crop_top_offset) {
    	FRAME_CROP_TOP_OFFSET_HANDLE.set(segment, 0L, frame_crop_top_offset);
    	return this;
    }
    
    public int frame_crop_top_offset() {
    	return (int) FRAME_CROP_TOP_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #frame_crop_bottom_offset()
    public StdVideoH264SequenceParameterSet frame_crop_bottom_offset(int frame_crop_bottom_offset) {
    	FRAME_CROP_BOTTOM_OFFSET_HANDLE.set(segment, 0L, frame_crop_bottom_offset);
    	return this;
    }
    
    public int frame_crop_bottom_offset() {
    	return (int) FRAME_CROP_BOTTOM_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #reserved2()
    public StdVideoH264SequenceParameterSet reserved2(int reserved2) {
    	RESERVED2_HANDLE.set(segment, 0L, reserved2);
    	return this;
    }
    
    public int reserved2() {
    	return (int) RESERVED2_HANDLE.get(segment, 0L);
    }
    
    /// @see #pOffsetForRefFrame()
    public StdVideoH264SequenceParameterSet pOffsetForRefFrame(NativeIntArray pOffsetForRefFrame) {
    	P_OFFSET_FOR_REF_FRAME_HANDLE.set(segment, 0L, pOffsetForRefFrame.memorySegment());
    	return this;
    }
    
    public @Nullable NativeIntArray pOffsetForRefFrame() {
    	MemorySegment segment = (MemorySegment) P_OFFSET_FOR_REF_FRAME_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeIntArray(segment);
    }
    
    /// @see #pScalingLists()
    public StdVideoH264SequenceParameterSet pScalingLists(StdVideoH264ScalingLists pScalingLists) {
    	P_SCALING_LISTS_HANDLE.set(segment, 0L, pScalingLists.memorySegment());
    	return this;
    }
    
    public @Nullable StdVideoH264ScalingLists pScalingLists() {
    	MemorySegment segment = (MemorySegment) P_SCALING_LISTS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new StdVideoH264ScalingLists(segment);
    }
    
    /// @see #pSequenceParameterSetVui()
    public StdVideoH264SequenceParameterSet pSequenceParameterSetVui(StdVideoH264SequenceParameterSetVui pSequenceParameterSetVui) {
    	P_SEQUENCE_PARAMETER_SET_VUI_HANDLE.set(segment, 0L, pSequenceParameterSetVui.memorySegment());
    	return this;
    }
    
    public @Nullable StdVideoH264SequenceParameterSetVui pSequenceParameterSetVui() {
    	MemorySegment segment = (MemorySegment) P_SEQUENCE_PARAMETER_SET_VUI_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new StdVideoH264SequenceParameterSetVui(segment);
    }
    
    @Override
    public StdVideoH264SequenceParameterSet set(StdVideoH264SequenceParameterSet other) {
        return set(other.segment);
    }
    
    @Override
    public StdVideoH264SequenceParameterSet set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<StdVideoH264SequenceParameterSet> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<StdVideoH264SequenceParameterSet> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new StdVideoH264SequenceParameterSet(segment),
            count
        );
    }
    
    public static NativeStructArray<StdVideoH264SequenceParameterSet> array(SegmentAllocator allocator, StdVideoH264SequenceParameterSet... structs) {
        NativeStructArray<StdVideoH264SequenceParameterSet> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new StdVideoH264SequenceParameterSet(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<StdVideoH264SequenceParameterSet> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new StdVideoH264SequenceParameterSet(segment)
        );
    }

}