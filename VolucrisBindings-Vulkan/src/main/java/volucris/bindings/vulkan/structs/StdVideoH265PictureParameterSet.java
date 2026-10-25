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
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class StdVideoH265PictureParameterSet
		implements Struct<StdVideoH265PictureParameterSet> {

	public static final StructLayout LAYOUT;

	public static final VarHandle PPS_PIC_PARAMETER_SET_ID_HANDLE;
	public static final VarHandle PPS_SEQ_PARAMETER_SET_ID_HANDLE;
	public static final VarHandle SPS_VIDEO_PARAMETER_SET_ID_HANDLE;
	public static final VarHandle NUM_EXTRA_SLICE_HEADER_BITS_HANDLE;
	public static final VarHandle NUM_REF_IDX_L0_DEFAULT_ACTIVE_MINUS1_HANDLE;
	public static final VarHandle NUM_REF_IDX_L1_DEFAULT_ACTIVE_MINUS1_HANDLE;
	public static final VarHandle INIT_QP_MINUS26_HANDLE;
	public static final VarHandle DIFF_CU_QP_DELTA_DEPTH_HANDLE;
	public static final VarHandle PPS_CB_QP_OFFSET_HANDLE;
	public static final VarHandle PPS_CR_QP_OFFSET_HANDLE;
	public static final VarHandle PPS_BETA_OFFSET_DIV2_HANDLE;
	public static final VarHandle PPS_TC_OFFSET_DIV2_HANDLE;
	public static final VarHandle LOG2_PARALLEL_MERGE_LEVEL_MINUS2_HANDLE;
	public static final VarHandle LOG2_MAX_TRANSFORM_SKIP_BLOCK_SIZE_MINUS2_HANDLE;
	public static final VarHandle DIFF_CU_CHROMA_QP_OFFSET_DEPTH_HANDLE;
	public static final VarHandle CHROMA_QP_OFFSET_LIST_LEN_MINUS1_HANDLE;
	public static final VarHandle CB_QP_OFFSET_LIST_HANDLE;
	public static final VarHandle CR_QP_OFFSET_LIST_HANDLE;
	public static final VarHandle LOG2_SAO_OFFSET_SCALE_LUMA_HANDLE;
	public static final VarHandle LOG2_SAO_OFFSET_SCALE_CHROMA_HANDLE;
	public static final VarHandle PPS_ACT_Y_QP_OFFSET_PLUS5_HANDLE;
	public static final VarHandle PPS_ACT_CB_QP_OFFSET_PLUS5_HANDLE;
	public static final VarHandle PPS_ACT_CR_QP_OFFSET_PLUS3_HANDLE;
	public static final VarHandle PPS_NUM_PALETTE_PREDICTOR_INITIALIZERS_HANDLE;
	public static final VarHandle LUMA_BIT_DEPTH_ENTRY_MINUS8_HANDLE;
	public static final VarHandle CHROMA_BIT_DEPTH_ENTRY_MINUS8_HANDLE;
	public static final VarHandle NUM_TILE_COLUMNS_MINUS1_HANDLE;
	public static final VarHandle NUM_TILE_ROWS_MINUS1_HANDLE;
	public static final VarHandle RESERVED1_HANDLE;
	public static final VarHandle RESERVED2_HANDLE;
	public static final VarHandle COLUMN_WIDTH_MINUS1_HANDLE;
	public static final VarHandle ROW_HEIGHT_MINUS1_HANDLE;
	public static final VarHandle RESERVED3_HANDLE;
	public static final VarHandle P_SCALING_LISTS_HANDLE;
	public static final VarHandle P_PREDICTOR_PALETTE_ENTRIES_HANDLE;

	public static final long FLAGS_BYTE_OFFSET;
	public static final long PPS_PIC_PARAMETER_SET_ID_BYTE_OFFSET;
	public static final long PPS_SEQ_PARAMETER_SET_ID_BYTE_OFFSET;
	public static final long SPS_VIDEO_PARAMETER_SET_ID_BYTE_OFFSET;
	public static final long NUM_EXTRA_SLICE_HEADER_BITS_BYTE_OFFSET;
	public static final long NUM_REF_IDX_L0_DEFAULT_ACTIVE_MINUS1_BYTE_OFFSET;
	public static final long NUM_REF_IDX_L1_DEFAULT_ACTIVE_MINUS1_BYTE_OFFSET;
	public static final long INIT_QP_MINUS26_BYTE_OFFSET;
	public static final long DIFF_CU_QP_DELTA_DEPTH_BYTE_OFFSET;
	public static final long PPS_CB_QP_OFFSET_BYTE_OFFSET;
	public static final long PPS_CR_QP_OFFSET_BYTE_OFFSET;
	public static final long PPS_BETA_OFFSET_DIV2_BYTE_OFFSET;
	public static final long PPS_TC_OFFSET_DIV2_BYTE_OFFSET;
	public static final long LOG2_PARALLEL_MERGE_LEVEL_MINUS2_BYTE_OFFSET;
	public static final long LOG2_MAX_TRANSFORM_SKIP_BLOCK_SIZE_MINUS2_BYTE_OFFSET;
	public static final long DIFF_CU_CHROMA_QP_OFFSET_DEPTH_BYTE_OFFSET;
	public static final long CHROMA_QP_OFFSET_LIST_LEN_MINUS1_BYTE_OFFSET;
	public static final long CB_QP_OFFSET_LIST_BYTE_OFFSET;
	public static final long CR_QP_OFFSET_LIST_BYTE_OFFSET;
	public static final long LOG2_SAO_OFFSET_SCALE_LUMA_BYTE_OFFSET;
	public static final long LOG2_SAO_OFFSET_SCALE_CHROMA_BYTE_OFFSET;
	public static final long PPS_ACT_Y_QP_OFFSET_PLUS5_BYTE_OFFSET;
	public static final long PPS_ACT_CB_QP_OFFSET_PLUS5_BYTE_OFFSET;
	public static final long PPS_ACT_CR_QP_OFFSET_PLUS3_BYTE_OFFSET;
	public static final long PPS_NUM_PALETTE_PREDICTOR_INITIALIZERS_BYTE_OFFSET;
	public static final long LUMA_BIT_DEPTH_ENTRY_MINUS8_BYTE_OFFSET;
	public static final long CHROMA_BIT_DEPTH_ENTRY_MINUS8_BYTE_OFFSET;
	public static final long NUM_TILE_COLUMNS_MINUS1_BYTE_OFFSET;
	public static final long NUM_TILE_ROWS_MINUS1_BYTE_OFFSET;
	public static final long RESERVED1_BYTE_OFFSET;
	public static final long RESERVED2_BYTE_OFFSET;
	public static final long COLUMN_WIDTH_MINUS1_BYTE_OFFSET;
	public static final long ROW_HEIGHT_MINUS1_BYTE_OFFSET;
	public static final long RESERVED3_BYTE_OFFSET;
	public static final long P_SCALING_LISTS_BYTE_OFFSET;
	public static final long P_PREDICTOR_PALETTE_ENTRIES_BYTE_OFFSET;

	private final MemorySegment segment;

	private final StdVideoH265PpsFlags flags;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    StdVideoH265PpsFlags.LAYOUT.withName("flags"),
		    JAVA_BYTE.withName("pps_pic_parameter_set_id"),
		    JAVA_BYTE.withName("pps_seq_parameter_set_id"),
		    JAVA_BYTE.withName("sps_video_parameter_set_id"),
		    JAVA_BYTE.withName("num_extra_slice_header_bits"),
		    JAVA_BYTE.withName("num_ref_idx_l0_default_active_minus1"),
		    JAVA_BYTE.withName("num_ref_idx_l1_default_active_minus1"),
		    JAVA_BYTE.withName("init_qp_minus26"),
		    JAVA_BYTE.withName("diff_cu_qp_delta_depth"),
		    JAVA_BYTE.withName("pps_cb_qp_offset"),
		    JAVA_BYTE.withName("pps_cr_qp_offset"),
		    JAVA_BYTE.withName("pps_beta_offset_div2"),
		    JAVA_BYTE.withName("pps_tc_offset_div2"),
		    JAVA_BYTE.withName("log2_parallel_merge_level_minus2"),
		    JAVA_BYTE.withName("log2_max_transform_skip_block_size_minus2"),
		    JAVA_BYTE.withName("diff_cu_chroma_qp_offset_depth"),
		    JAVA_BYTE.withName("chroma_qp_offset_list_len_minus1"),
		    MemoryLayout.sequenceLayout(6, JAVA_BYTE).withName("cb_qp_offset_list"),
		    MemoryLayout.sequenceLayout(6, JAVA_BYTE).withName("cr_qp_offset_list"),
		    JAVA_BYTE.withName("log2_sao_offset_scale_luma"),
		    JAVA_BYTE.withName("log2_sao_offset_scale_chroma"),
		    JAVA_BYTE.withName("pps_act_y_qp_offset_plus5"),
		    JAVA_BYTE.withName("pps_act_cb_qp_offset_plus5"),
		    JAVA_BYTE.withName("pps_act_cr_qp_offset_plus3"),
		    JAVA_BYTE.withName("pps_num_palette_predictor_initializers"),
		    JAVA_BYTE.withName("luma_bit_depth_entry_minus8"),
		    JAVA_BYTE.withName("chroma_bit_depth_entry_minus8"),
		    JAVA_BYTE.withName("num_tile_columns_minus1"),
		    JAVA_BYTE.withName("num_tile_rows_minus1"),
		    JAVA_BYTE.withName("reserved1"),
		    JAVA_BYTE.withName("reserved2"),
		    MemoryLayout.sequenceLayout(19, JAVA_SHORT).withName("column_width_minus1"),
		    MemoryLayout.sequenceLayout(21, JAVA_SHORT).withName("row_height_minus1"),
		    JAVA_INT.withName("reserved3"),
		    UNBOUNDED_ADDRESS.withName("pScalingLists"),
		    UNBOUNDED_ADDRESS.withName("pPredictorPaletteEntries")
		).withName("StdVideoH265PictureParameterSet").withByteAlignment(8);
		
		PPS_PIC_PARAMETER_SET_ID_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pps_pic_parameter_set_id"));
		PPS_SEQ_PARAMETER_SET_ID_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pps_seq_parameter_set_id"));
		SPS_VIDEO_PARAMETER_SET_ID_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sps_video_parameter_set_id"));
		NUM_EXTRA_SLICE_HEADER_BITS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("num_extra_slice_header_bits"));
		NUM_REF_IDX_L0_DEFAULT_ACTIVE_MINUS1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("num_ref_idx_l0_default_active_minus1"));
		NUM_REF_IDX_L1_DEFAULT_ACTIVE_MINUS1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("num_ref_idx_l1_default_active_minus1"));
		INIT_QP_MINUS26_HANDLE = LAYOUT.varHandle(PathElement.groupElement("init_qp_minus26"));
		DIFF_CU_QP_DELTA_DEPTH_HANDLE = LAYOUT.varHandle(PathElement.groupElement("diff_cu_qp_delta_depth"));
		PPS_CB_QP_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pps_cb_qp_offset"));
		PPS_CR_QP_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pps_cr_qp_offset"));
		PPS_BETA_OFFSET_DIV2_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pps_beta_offset_div2"));
		PPS_TC_OFFSET_DIV2_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pps_tc_offset_div2"));
		LOG2_PARALLEL_MERGE_LEVEL_MINUS2_HANDLE = LAYOUT.varHandle(PathElement.groupElement("log2_parallel_merge_level_minus2"));
		LOG2_MAX_TRANSFORM_SKIP_BLOCK_SIZE_MINUS2_HANDLE = LAYOUT.varHandle(PathElement.groupElement("log2_max_transform_skip_block_size_minus2"));
		DIFF_CU_CHROMA_QP_OFFSET_DEPTH_HANDLE = LAYOUT.varHandle(PathElement.groupElement("diff_cu_chroma_qp_offset_depth"));
		CHROMA_QP_OFFSET_LIST_LEN_MINUS1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("chroma_qp_offset_list_len_minus1"));
		CB_QP_OFFSET_LIST_HANDLE = LAYOUT.varHandle(PathElement.groupElement("cb_qp_offset_list"), PathElement.sequenceElement());
		CR_QP_OFFSET_LIST_HANDLE = LAYOUT.varHandle(PathElement.groupElement("cr_qp_offset_list"), PathElement.sequenceElement());
		LOG2_SAO_OFFSET_SCALE_LUMA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("log2_sao_offset_scale_luma"));
		LOG2_SAO_OFFSET_SCALE_CHROMA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("log2_sao_offset_scale_chroma"));
		PPS_ACT_Y_QP_OFFSET_PLUS5_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pps_act_y_qp_offset_plus5"));
		PPS_ACT_CB_QP_OFFSET_PLUS5_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pps_act_cb_qp_offset_plus5"));
		PPS_ACT_CR_QP_OFFSET_PLUS3_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pps_act_cr_qp_offset_plus3"));
		PPS_NUM_PALETTE_PREDICTOR_INITIALIZERS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pps_num_palette_predictor_initializers"));
		LUMA_BIT_DEPTH_ENTRY_MINUS8_HANDLE = LAYOUT.varHandle(PathElement.groupElement("luma_bit_depth_entry_minus8"));
		CHROMA_BIT_DEPTH_ENTRY_MINUS8_HANDLE = LAYOUT.varHandle(PathElement.groupElement("chroma_bit_depth_entry_minus8"));
		NUM_TILE_COLUMNS_MINUS1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("num_tile_columns_minus1"));
		NUM_TILE_ROWS_MINUS1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("num_tile_rows_minus1"));
		RESERVED1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("reserved1"));
		RESERVED2_HANDLE = LAYOUT.varHandle(PathElement.groupElement("reserved2"));
		COLUMN_WIDTH_MINUS1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("column_width_minus1"), PathElement.sequenceElement());
		ROW_HEIGHT_MINUS1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("row_height_minus1"), PathElement.sequenceElement());
		RESERVED3_HANDLE = LAYOUT.varHandle(PathElement.groupElement("reserved3"));
		P_SCALING_LISTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pScalingLists"));
		P_PREDICTOR_PALETTE_ENTRIES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pPredictorPaletteEntries"));
		
		FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
		PPS_PIC_PARAMETER_SET_ID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pps_pic_parameter_set_id"));
		PPS_SEQ_PARAMETER_SET_ID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pps_seq_parameter_set_id"));
		SPS_VIDEO_PARAMETER_SET_ID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sps_video_parameter_set_id"));
		NUM_EXTRA_SLICE_HEADER_BITS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("num_extra_slice_header_bits"));
		NUM_REF_IDX_L0_DEFAULT_ACTIVE_MINUS1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("num_ref_idx_l0_default_active_minus1"));
		NUM_REF_IDX_L1_DEFAULT_ACTIVE_MINUS1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("num_ref_idx_l1_default_active_minus1"));
		INIT_QP_MINUS26_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("init_qp_minus26"));
		DIFF_CU_QP_DELTA_DEPTH_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("diff_cu_qp_delta_depth"));
		PPS_CB_QP_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pps_cb_qp_offset"));
		PPS_CR_QP_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pps_cr_qp_offset"));
		PPS_BETA_OFFSET_DIV2_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pps_beta_offset_div2"));
		PPS_TC_OFFSET_DIV2_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pps_tc_offset_div2"));
		LOG2_PARALLEL_MERGE_LEVEL_MINUS2_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("log2_parallel_merge_level_minus2"));
		LOG2_MAX_TRANSFORM_SKIP_BLOCK_SIZE_MINUS2_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("log2_max_transform_skip_block_size_minus2"));
		DIFF_CU_CHROMA_QP_OFFSET_DEPTH_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("diff_cu_chroma_qp_offset_depth"));
		CHROMA_QP_OFFSET_LIST_LEN_MINUS1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("chroma_qp_offset_list_len_minus1"));
		CB_QP_OFFSET_LIST_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("cb_qp_offset_list"));
		CR_QP_OFFSET_LIST_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("cr_qp_offset_list"));
		LOG2_SAO_OFFSET_SCALE_LUMA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("log2_sao_offset_scale_luma"));
		LOG2_SAO_OFFSET_SCALE_CHROMA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("log2_sao_offset_scale_chroma"));
		PPS_ACT_Y_QP_OFFSET_PLUS5_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pps_act_y_qp_offset_plus5"));
		PPS_ACT_CB_QP_OFFSET_PLUS5_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pps_act_cb_qp_offset_plus5"));
		PPS_ACT_CR_QP_OFFSET_PLUS3_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pps_act_cr_qp_offset_plus3"));
		PPS_NUM_PALETTE_PREDICTOR_INITIALIZERS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pps_num_palette_predictor_initializers"));
		LUMA_BIT_DEPTH_ENTRY_MINUS8_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("luma_bit_depth_entry_minus8"));
		CHROMA_BIT_DEPTH_ENTRY_MINUS8_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("chroma_bit_depth_entry_minus8"));
		NUM_TILE_COLUMNS_MINUS1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("num_tile_columns_minus1"));
		NUM_TILE_ROWS_MINUS1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("num_tile_rows_minus1"));
		RESERVED1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("reserved1"));
		RESERVED2_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("reserved2"));
		COLUMN_WIDTH_MINUS1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("column_width_minus1"));
		ROW_HEIGHT_MINUS1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("row_height_minus1"));
		RESERVED3_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("reserved3"));
		P_SCALING_LISTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pScalingLists"));
		P_PREDICTOR_PALETTE_ENTRIES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pPredictorPaletteEntries"));
		//@formatter:on
	}

	public StdVideoH265PictureParameterSet() {
	    this(Arena.ofAuto());
	}
	
	public StdVideoH265PictureParameterSet(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public StdVideoH265PictureParameterSet(MemorySegment segment) {
	    this.segment = segment;
	
	    flags = new StdVideoH265PpsFlags(segment.asSlice(FLAGS_BYTE_OFFSET, StdVideoH265PpsFlags.LAYOUT));
	}

    /// @see #flags()
    public StdVideoH265PictureParameterSet flags(Consumer<StdVideoH265PpsFlags> consumer) {
    	consumer.accept(flags);
    	return this;
    }
    
    /// @see #flags()
    public StdVideoH265PictureParameterSet flags(StdVideoH265PpsFlags other) {
    	flags.set(other);
    	return this;
    }
    
    public StdVideoH265PpsFlags flags() {
    	return flags;
    }
    
    /// @see #pps_pic_parameter_set_id()
    public StdVideoH265PictureParameterSet pps_pic_parameter_set_id(byte pps_pic_parameter_set_id) {
    	PPS_PIC_PARAMETER_SET_ID_HANDLE.set(segment, 0L, pps_pic_parameter_set_id);
    	return this;
    }
    
    public byte pps_pic_parameter_set_id() {
    	return (byte) PPS_PIC_PARAMETER_SET_ID_HANDLE.get(segment, 0L);
    }
    
    /// @see #pps_seq_parameter_set_id()
    public StdVideoH265PictureParameterSet pps_seq_parameter_set_id(byte pps_seq_parameter_set_id) {
    	PPS_SEQ_PARAMETER_SET_ID_HANDLE.set(segment, 0L, pps_seq_parameter_set_id);
    	return this;
    }
    
    public byte pps_seq_parameter_set_id() {
    	return (byte) PPS_SEQ_PARAMETER_SET_ID_HANDLE.get(segment, 0L);
    }
    
    /// @see #sps_video_parameter_set_id()
    public StdVideoH265PictureParameterSet sps_video_parameter_set_id(byte sps_video_parameter_set_id) {
    	SPS_VIDEO_PARAMETER_SET_ID_HANDLE.set(segment, 0L, sps_video_parameter_set_id);
    	return this;
    }
    
    public byte sps_video_parameter_set_id() {
    	return (byte) SPS_VIDEO_PARAMETER_SET_ID_HANDLE.get(segment, 0L);
    }
    
    /// @see #num_extra_slice_header_bits()
    public StdVideoH265PictureParameterSet num_extra_slice_header_bits(byte num_extra_slice_header_bits) {
    	NUM_EXTRA_SLICE_HEADER_BITS_HANDLE.set(segment, 0L, num_extra_slice_header_bits);
    	return this;
    }
    
    public byte num_extra_slice_header_bits() {
    	return (byte) NUM_EXTRA_SLICE_HEADER_BITS_HANDLE.get(segment, 0L);
    }
    
    /// @see #num_ref_idx_l0_default_active_minus1()
    public StdVideoH265PictureParameterSet num_ref_idx_l0_default_active_minus1(byte num_ref_idx_l0_default_active_minus1) {
    	NUM_REF_IDX_L0_DEFAULT_ACTIVE_MINUS1_HANDLE.set(segment, 0L, num_ref_idx_l0_default_active_minus1);
    	return this;
    }
    
    public byte num_ref_idx_l0_default_active_minus1() {
    	return (byte) NUM_REF_IDX_L0_DEFAULT_ACTIVE_MINUS1_HANDLE.get(segment, 0L);
    }
    
    /// @see #num_ref_idx_l1_default_active_minus1()
    public StdVideoH265PictureParameterSet num_ref_idx_l1_default_active_minus1(byte num_ref_idx_l1_default_active_minus1) {
    	NUM_REF_IDX_L1_DEFAULT_ACTIVE_MINUS1_HANDLE.set(segment, 0L, num_ref_idx_l1_default_active_minus1);
    	return this;
    }
    
    public byte num_ref_idx_l1_default_active_minus1() {
    	return (byte) NUM_REF_IDX_L1_DEFAULT_ACTIVE_MINUS1_HANDLE.get(segment, 0L);
    }
    
    /// @see #init_qp_minus26()
    public StdVideoH265PictureParameterSet init_qp_minus26(byte init_qp_minus26) {
    	INIT_QP_MINUS26_HANDLE.set(segment, 0L, init_qp_minus26);
    	return this;
    }
    
    public byte init_qp_minus26() {
    	return (byte) INIT_QP_MINUS26_HANDLE.get(segment, 0L);
    }
    
    /// @see #diff_cu_qp_delta_depth()
    public StdVideoH265PictureParameterSet diff_cu_qp_delta_depth(byte diff_cu_qp_delta_depth) {
    	DIFF_CU_QP_DELTA_DEPTH_HANDLE.set(segment, 0L, diff_cu_qp_delta_depth);
    	return this;
    }
    
    public byte diff_cu_qp_delta_depth() {
    	return (byte) DIFF_CU_QP_DELTA_DEPTH_HANDLE.get(segment, 0L);
    }
    
    /// @see #pps_cb_qp_offset()
    public StdVideoH265PictureParameterSet pps_cb_qp_offset(byte pps_cb_qp_offset) {
    	PPS_CB_QP_OFFSET_HANDLE.set(segment, 0L, pps_cb_qp_offset);
    	return this;
    }
    
    public byte pps_cb_qp_offset() {
    	return (byte) PPS_CB_QP_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #pps_cr_qp_offset()
    public StdVideoH265PictureParameterSet pps_cr_qp_offset(byte pps_cr_qp_offset) {
    	PPS_CR_QP_OFFSET_HANDLE.set(segment, 0L, pps_cr_qp_offset);
    	return this;
    }
    
    public byte pps_cr_qp_offset() {
    	return (byte) PPS_CR_QP_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #pps_beta_offset_div2()
    public StdVideoH265PictureParameterSet pps_beta_offset_div2(byte pps_beta_offset_div2) {
    	PPS_BETA_OFFSET_DIV2_HANDLE.set(segment, 0L, pps_beta_offset_div2);
    	return this;
    }
    
    public byte pps_beta_offset_div2() {
    	return (byte) PPS_BETA_OFFSET_DIV2_HANDLE.get(segment, 0L);
    }
    
    /// @see #pps_tc_offset_div2()
    public StdVideoH265PictureParameterSet pps_tc_offset_div2(byte pps_tc_offset_div2) {
    	PPS_TC_OFFSET_DIV2_HANDLE.set(segment, 0L, pps_tc_offset_div2);
    	return this;
    }
    
    public byte pps_tc_offset_div2() {
    	return (byte) PPS_TC_OFFSET_DIV2_HANDLE.get(segment, 0L);
    }
    
    /// @see #log2_parallel_merge_level_minus2()
    public StdVideoH265PictureParameterSet log2_parallel_merge_level_minus2(byte log2_parallel_merge_level_minus2) {
    	LOG2_PARALLEL_MERGE_LEVEL_MINUS2_HANDLE.set(segment, 0L, log2_parallel_merge_level_minus2);
    	return this;
    }
    
    public byte log2_parallel_merge_level_minus2() {
    	return (byte) LOG2_PARALLEL_MERGE_LEVEL_MINUS2_HANDLE.get(segment, 0L);
    }
    
    /// @see #log2_max_transform_skip_block_size_minus2()
    public StdVideoH265PictureParameterSet log2_max_transform_skip_block_size_minus2(byte log2_max_transform_skip_block_size_minus2) {
    	LOG2_MAX_TRANSFORM_SKIP_BLOCK_SIZE_MINUS2_HANDLE.set(segment, 0L, log2_max_transform_skip_block_size_minus2);
    	return this;
    }
    
    public byte log2_max_transform_skip_block_size_minus2() {
    	return (byte) LOG2_MAX_TRANSFORM_SKIP_BLOCK_SIZE_MINUS2_HANDLE.get(segment, 0L);
    }
    
    /// @see #diff_cu_chroma_qp_offset_depth()
    public StdVideoH265PictureParameterSet diff_cu_chroma_qp_offset_depth(byte diff_cu_chroma_qp_offset_depth) {
    	DIFF_CU_CHROMA_QP_OFFSET_DEPTH_HANDLE.set(segment, 0L, diff_cu_chroma_qp_offset_depth);
    	return this;
    }
    
    public byte diff_cu_chroma_qp_offset_depth() {
    	return (byte) DIFF_CU_CHROMA_QP_OFFSET_DEPTH_HANDLE.get(segment, 0L);
    }
    
    /// @see #chroma_qp_offset_list_len_minus1()
    public StdVideoH265PictureParameterSet chroma_qp_offset_list_len_minus1(byte chroma_qp_offset_list_len_minus1) {
    	CHROMA_QP_OFFSET_LIST_LEN_MINUS1_HANDLE.set(segment, 0L, chroma_qp_offset_list_len_minus1);
    	return this;
    }
    
    public byte chroma_qp_offset_list_len_minus1() {
    	return (byte) CHROMA_QP_OFFSET_LIST_LEN_MINUS1_HANDLE.get(segment, 0L);
    }
    
    /// @see #cb_qp_offset_list(int)
    public StdVideoH265PictureParameterSet cb_qp_offset_list(byte cb_qp_offset_list, int index0) {
    	CB_QP_OFFSET_LIST_HANDLE.set(segment, 0L, index0, cb_qp_offset_list);
    	return this;
    }
    
    public byte cb_qp_offset_list(int index0) {
    	return (byte) CB_QP_OFFSET_LIST_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #cr_qp_offset_list(int)
    public StdVideoH265PictureParameterSet cr_qp_offset_list(byte cr_qp_offset_list, int index0) {
    	CR_QP_OFFSET_LIST_HANDLE.set(segment, 0L, index0, cr_qp_offset_list);
    	return this;
    }
    
    public byte cr_qp_offset_list(int index0) {
    	return (byte) CR_QP_OFFSET_LIST_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #log2_sao_offset_scale_luma()
    public StdVideoH265PictureParameterSet log2_sao_offset_scale_luma(byte log2_sao_offset_scale_luma) {
    	LOG2_SAO_OFFSET_SCALE_LUMA_HANDLE.set(segment, 0L, log2_sao_offset_scale_luma);
    	return this;
    }
    
    public byte log2_sao_offset_scale_luma() {
    	return (byte) LOG2_SAO_OFFSET_SCALE_LUMA_HANDLE.get(segment, 0L);
    }
    
    /// @see #log2_sao_offset_scale_chroma()
    public StdVideoH265PictureParameterSet log2_sao_offset_scale_chroma(byte log2_sao_offset_scale_chroma) {
    	LOG2_SAO_OFFSET_SCALE_CHROMA_HANDLE.set(segment, 0L, log2_sao_offset_scale_chroma);
    	return this;
    }
    
    public byte log2_sao_offset_scale_chroma() {
    	return (byte) LOG2_SAO_OFFSET_SCALE_CHROMA_HANDLE.get(segment, 0L);
    }
    
    /// @see #pps_act_y_qp_offset_plus5()
    public StdVideoH265PictureParameterSet pps_act_y_qp_offset_plus5(byte pps_act_y_qp_offset_plus5) {
    	PPS_ACT_Y_QP_OFFSET_PLUS5_HANDLE.set(segment, 0L, pps_act_y_qp_offset_plus5);
    	return this;
    }
    
    public byte pps_act_y_qp_offset_plus5() {
    	return (byte) PPS_ACT_Y_QP_OFFSET_PLUS5_HANDLE.get(segment, 0L);
    }
    
    /// @see #pps_act_cb_qp_offset_plus5()
    public StdVideoH265PictureParameterSet pps_act_cb_qp_offset_plus5(byte pps_act_cb_qp_offset_plus5) {
    	PPS_ACT_CB_QP_OFFSET_PLUS5_HANDLE.set(segment, 0L, pps_act_cb_qp_offset_plus5);
    	return this;
    }
    
    public byte pps_act_cb_qp_offset_plus5() {
    	return (byte) PPS_ACT_CB_QP_OFFSET_PLUS5_HANDLE.get(segment, 0L);
    }
    
    /// @see #pps_act_cr_qp_offset_plus3()
    public StdVideoH265PictureParameterSet pps_act_cr_qp_offset_plus3(byte pps_act_cr_qp_offset_plus3) {
    	PPS_ACT_CR_QP_OFFSET_PLUS3_HANDLE.set(segment, 0L, pps_act_cr_qp_offset_plus3);
    	return this;
    }
    
    public byte pps_act_cr_qp_offset_plus3() {
    	return (byte) PPS_ACT_CR_QP_OFFSET_PLUS3_HANDLE.get(segment, 0L);
    }
    
    /// @see #pps_num_palette_predictor_initializers()
    public StdVideoH265PictureParameterSet pps_num_palette_predictor_initializers(byte pps_num_palette_predictor_initializers) {
    	PPS_NUM_PALETTE_PREDICTOR_INITIALIZERS_HANDLE.set(segment, 0L, pps_num_palette_predictor_initializers);
    	return this;
    }
    
    public byte pps_num_palette_predictor_initializers() {
    	return (byte) PPS_NUM_PALETTE_PREDICTOR_INITIALIZERS_HANDLE.get(segment, 0L);
    }
    
    /// @see #luma_bit_depth_entry_minus8()
    public StdVideoH265PictureParameterSet luma_bit_depth_entry_minus8(byte luma_bit_depth_entry_minus8) {
    	LUMA_BIT_DEPTH_ENTRY_MINUS8_HANDLE.set(segment, 0L, luma_bit_depth_entry_minus8);
    	return this;
    }
    
    public byte luma_bit_depth_entry_minus8() {
    	return (byte) LUMA_BIT_DEPTH_ENTRY_MINUS8_HANDLE.get(segment, 0L);
    }
    
    /// @see #chroma_bit_depth_entry_minus8()
    public StdVideoH265PictureParameterSet chroma_bit_depth_entry_minus8(byte chroma_bit_depth_entry_minus8) {
    	CHROMA_BIT_DEPTH_ENTRY_MINUS8_HANDLE.set(segment, 0L, chroma_bit_depth_entry_minus8);
    	return this;
    }
    
    public byte chroma_bit_depth_entry_minus8() {
    	return (byte) CHROMA_BIT_DEPTH_ENTRY_MINUS8_HANDLE.get(segment, 0L);
    }
    
    /// @see #num_tile_columns_minus1()
    public StdVideoH265PictureParameterSet num_tile_columns_minus1(byte num_tile_columns_minus1) {
    	NUM_TILE_COLUMNS_MINUS1_HANDLE.set(segment, 0L, num_tile_columns_minus1);
    	return this;
    }
    
    public byte num_tile_columns_minus1() {
    	return (byte) NUM_TILE_COLUMNS_MINUS1_HANDLE.get(segment, 0L);
    }
    
    /// @see #num_tile_rows_minus1()
    public StdVideoH265PictureParameterSet num_tile_rows_minus1(byte num_tile_rows_minus1) {
    	NUM_TILE_ROWS_MINUS1_HANDLE.set(segment, 0L, num_tile_rows_minus1);
    	return this;
    }
    
    public byte num_tile_rows_minus1() {
    	return (byte) NUM_TILE_ROWS_MINUS1_HANDLE.get(segment, 0L);
    }
    
    /// @see #reserved1()
    public StdVideoH265PictureParameterSet reserved1(byte reserved1) {
    	RESERVED1_HANDLE.set(segment, 0L, reserved1);
    	return this;
    }
    
    public byte reserved1() {
    	return (byte) RESERVED1_HANDLE.get(segment, 0L);
    }
    
    /// @see #reserved2()
    public StdVideoH265PictureParameterSet reserved2(byte reserved2) {
    	RESERVED2_HANDLE.set(segment, 0L, reserved2);
    	return this;
    }
    
    public byte reserved2() {
    	return (byte) RESERVED2_HANDLE.get(segment, 0L);
    }
    
    /// @see #column_width_minus1(int)
    public StdVideoH265PictureParameterSet column_width_minus1(short column_width_minus1, int index0) {
    	COLUMN_WIDTH_MINUS1_HANDLE.set(segment, 0L, index0, column_width_minus1);
    	return this;
    }
    
    public short column_width_minus1(int index0) {
    	return (short) COLUMN_WIDTH_MINUS1_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #row_height_minus1(int)
    public StdVideoH265PictureParameterSet row_height_minus1(short row_height_minus1, int index0) {
    	ROW_HEIGHT_MINUS1_HANDLE.set(segment, 0L, index0, row_height_minus1);
    	return this;
    }
    
    public short row_height_minus1(int index0) {
    	return (short) ROW_HEIGHT_MINUS1_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #reserved3()
    public StdVideoH265PictureParameterSet reserved3(int reserved3) {
    	RESERVED3_HANDLE.set(segment, 0L, reserved3);
    	return this;
    }
    
    public int reserved3() {
    	return (int) RESERVED3_HANDLE.get(segment, 0L);
    }
    
    /// @see #pScalingLists()
    public StdVideoH265PictureParameterSet pScalingLists(StdVideoH265ScalingLists pScalingLists) {
    	P_SCALING_LISTS_HANDLE.set(segment, 0L, pScalingLists.memorySegment());
    	return this;
    }
    
    public @Nullable StdVideoH265ScalingLists pScalingLists() {
    	MemorySegment segment = (MemorySegment) P_SCALING_LISTS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new StdVideoH265ScalingLists(segment);
    }
    
    /// @see #pPredictorPaletteEntries()
    public StdVideoH265PictureParameterSet pPredictorPaletteEntries(StdVideoH265PredictorPaletteEntries pPredictorPaletteEntries) {
    	P_PREDICTOR_PALETTE_ENTRIES_HANDLE.set(segment, 0L, pPredictorPaletteEntries.memorySegment());
    	return this;
    }
    
    public @Nullable StdVideoH265PredictorPaletteEntries pPredictorPaletteEntries() {
    	MemorySegment segment = (MemorySegment) P_PREDICTOR_PALETTE_ENTRIES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new StdVideoH265PredictorPaletteEntries(segment);
    }
    
    @Override
    public StdVideoH265PictureParameterSet set(StdVideoH265PictureParameterSet other) {
        return set(other.segment);
    }
    
    @Override
    public StdVideoH265PictureParameterSet set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<StdVideoH265PictureParameterSet> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<StdVideoH265PictureParameterSet> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new StdVideoH265PictureParameterSet(segment),
            count
        );
    }
    
    public static NativeStructArray<StdVideoH265PictureParameterSet> array(SegmentAllocator allocator, StdVideoH265PictureParameterSet... structs) {
        NativeStructArray<StdVideoH265PictureParameterSet> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new StdVideoH265PictureParameterSet(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<StdVideoH265PictureParameterSet> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new StdVideoH265PictureParameterSet(segment)
        );
    }

}