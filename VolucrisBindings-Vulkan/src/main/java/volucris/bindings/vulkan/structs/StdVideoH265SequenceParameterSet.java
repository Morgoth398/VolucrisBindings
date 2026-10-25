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

public final class StdVideoH265SequenceParameterSet
		implements Struct<StdVideoH265SequenceParameterSet> {

	public static final StructLayout LAYOUT;

	public static final VarHandle CHROMA_FORMAT_IDC_HANDLE;
	public static final VarHandle PIC_WIDTH_IN_LUMA_SAMPLES_HANDLE;
	public static final VarHandle PIC_HEIGHT_IN_LUMA_SAMPLES_HANDLE;
	public static final VarHandle SPS_VIDEO_PARAMETER_SET_ID_HANDLE;
	public static final VarHandle SPS_MAX_SUB_LAYERS_MINUS1_HANDLE;
	public static final VarHandle SPS_SEQ_PARAMETER_SET_ID_HANDLE;
	public static final VarHandle BIT_DEPTH_LUMA_MINUS8_HANDLE;
	public static final VarHandle BIT_DEPTH_CHROMA_MINUS8_HANDLE;
	public static final VarHandle LOG2_MAX_PIC_ORDER_CNT_LSB_MINUS4_HANDLE;
	public static final VarHandle LOG2_MIN_LUMA_CODING_BLOCK_SIZE_MINUS3_HANDLE;
	public static final VarHandle LOG2_DIFF_MAX_MIN_LUMA_CODING_BLOCK_SIZE_HANDLE;
	public static final VarHandle LOG2_MIN_LUMA_TRANSFORM_BLOCK_SIZE_MINUS2_HANDLE;
	public static final VarHandle LOG2_DIFF_MAX_MIN_LUMA_TRANSFORM_BLOCK_SIZE_HANDLE;
	public static final VarHandle MAX_TRANSFORM_HIERARCHY_DEPTH_INTER_HANDLE;
	public static final VarHandle MAX_TRANSFORM_HIERARCHY_DEPTH_INTRA_HANDLE;
	public static final VarHandle NUM_SHORT_TERM_REF_PIC_SETS_HANDLE;
	public static final VarHandle NUM_LONG_TERM_REF_PICS_SPS_HANDLE;
	public static final VarHandle PCM_SAMPLE_BIT_DEPTH_LUMA_MINUS1_HANDLE;
	public static final VarHandle PCM_SAMPLE_BIT_DEPTH_CHROMA_MINUS1_HANDLE;
	public static final VarHandle LOG2_MIN_PCM_LUMA_CODING_BLOCK_SIZE_MINUS3_HANDLE;
	public static final VarHandle LOG2_DIFF_MAX_MIN_PCM_LUMA_CODING_BLOCK_SIZE_HANDLE;
	public static final VarHandle RESERVED1_HANDLE;
	public static final VarHandle RESERVED2_HANDLE;
	public static final VarHandle PALETTE_MAX_SIZE_HANDLE;
	public static final VarHandle DELTA_PALETTE_MAX_PREDICTOR_SIZE_HANDLE;
	public static final VarHandle MOTION_VECTOR_RESOLUTION_CONTROL_IDC_HANDLE;
	public static final VarHandle SPS_NUM_PALETTE_PREDICTOR_INITIALIZERS_MINUS1_HANDLE;
	public static final VarHandle CONF_WIN_LEFT_OFFSET_HANDLE;
	public static final VarHandle CONF_WIN_RIGHT_OFFSET_HANDLE;
	public static final VarHandle CONF_WIN_TOP_OFFSET_HANDLE;
	public static final VarHandle CONF_WIN_BOTTOM_OFFSET_HANDLE;
	public static final VarHandle P_PROFILE_TIER_LEVEL_HANDLE;
	public static final VarHandle P_DEC_PIC_BUF_MGR_HANDLE;
	public static final VarHandle P_SCALING_LISTS_HANDLE;
	public static final VarHandle P_SHORT_TERM_REF_PIC_SET_HANDLE;
	public static final VarHandle P_LONG_TERM_REF_PICS_SPS_HANDLE;
	public static final VarHandle P_SEQUENCE_PARAMETER_SET_VUI_HANDLE;
	public static final VarHandle P_PREDICTOR_PALETTE_ENTRIES_HANDLE;

	public static final long FLAGS_BYTE_OFFSET;
	public static final long CHROMA_FORMAT_IDC_BYTE_OFFSET;
	public static final long PIC_WIDTH_IN_LUMA_SAMPLES_BYTE_OFFSET;
	public static final long PIC_HEIGHT_IN_LUMA_SAMPLES_BYTE_OFFSET;
	public static final long SPS_VIDEO_PARAMETER_SET_ID_BYTE_OFFSET;
	public static final long SPS_MAX_SUB_LAYERS_MINUS1_BYTE_OFFSET;
	public static final long SPS_SEQ_PARAMETER_SET_ID_BYTE_OFFSET;
	public static final long BIT_DEPTH_LUMA_MINUS8_BYTE_OFFSET;
	public static final long BIT_DEPTH_CHROMA_MINUS8_BYTE_OFFSET;
	public static final long LOG2_MAX_PIC_ORDER_CNT_LSB_MINUS4_BYTE_OFFSET;
	public static final long LOG2_MIN_LUMA_CODING_BLOCK_SIZE_MINUS3_BYTE_OFFSET;
	public static final long LOG2_DIFF_MAX_MIN_LUMA_CODING_BLOCK_SIZE_BYTE_OFFSET;
	public static final long LOG2_MIN_LUMA_TRANSFORM_BLOCK_SIZE_MINUS2_BYTE_OFFSET;
	public static final long LOG2_DIFF_MAX_MIN_LUMA_TRANSFORM_BLOCK_SIZE_BYTE_OFFSET;
	public static final long MAX_TRANSFORM_HIERARCHY_DEPTH_INTER_BYTE_OFFSET;
	public static final long MAX_TRANSFORM_HIERARCHY_DEPTH_INTRA_BYTE_OFFSET;
	public static final long NUM_SHORT_TERM_REF_PIC_SETS_BYTE_OFFSET;
	public static final long NUM_LONG_TERM_REF_PICS_SPS_BYTE_OFFSET;
	public static final long PCM_SAMPLE_BIT_DEPTH_LUMA_MINUS1_BYTE_OFFSET;
	public static final long PCM_SAMPLE_BIT_DEPTH_CHROMA_MINUS1_BYTE_OFFSET;
	public static final long LOG2_MIN_PCM_LUMA_CODING_BLOCK_SIZE_MINUS3_BYTE_OFFSET;
	public static final long LOG2_DIFF_MAX_MIN_PCM_LUMA_CODING_BLOCK_SIZE_BYTE_OFFSET;
	public static final long RESERVED1_BYTE_OFFSET;
	public static final long RESERVED2_BYTE_OFFSET;
	public static final long PALETTE_MAX_SIZE_BYTE_OFFSET;
	public static final long DELTA_PALETTE_MAX_PREDICTOR_SIZE_BYTE_OFFSET;
	public static final long MOTION_VECTOR_RESOLUTION_CONTROL_IDC_BYTE_OFFSET;
	public static final long SPS_NUM_PALETTE_PREDICTOR_INITIALIZERS_MINUS1_BYTE_OFFSET;
	public static final long CONF_WIN_LEFT_OFFSET_BYTE_OFFSET;
	public static final long CONF_WIN_RIGHT_OFFSET_BYTE_OFFSET;
	public static final long CONF_WIN_TOP_OFFSET_BYTE_OFFSET;
	public static final long CONF_WIN_BOTTOM_OFFSET_BYTE_OFFSET;
	public static final long P_PROFILE_TIER_LEVEL_BYTE_OFFSET;
	public static final long P_DEC_PIC_BUF_MGR_BYTE_OFFSET;
	public static final long P_SCALING_LISTS_BYTE_OFFSET;
	public static final long P_SHORT_TERM_REF_PIC_SET_BYTE_OFFSET;
	public static final long P_LONG_TERM_REF_PICS_SPS_BYTE_OFFSET;
	public static final long P_SEQUENCE_PARAMETER_SET_VUI_BYTE_OFFSET;
	public static final long P_PREDICTOR_PALETTE_ENTRIES_BYTE_OFFSET;

	private final MemorySegment segment;

	private final StdVideoH265SpsFlags flags;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    StdVideoH265SpsFlags.LAYOUT.withName("flags"),
		    JAVA_INT.withName("chroma_format_idc"),
		    JAVA_INT.withName("pic_width_in_luma_samples"),
		    JAVA_INT.withName("pic_height_in_luma_samples"),
		    JAVA_BYTE.withName("sps_video_parameter_set_id"),
		    JAVA_BYTE.withName("sps_max_sub_layers_minus1"),
		    JAVA_BYTE.withName("sps_seq_parameter_set_id"),
		    JAVA_BYTE.withName("bit_depth_luma_minus8"),
		    JAVA_BYTE.withName("bit_depth_chroma_minus8"),
		    JAVA_BYTE.withName("log2_max_pic_order_cnt_lsb_minus4"),
		    JAVA_BYTE.withName("log2_min_luma_coding_block_size_minus3"),
		    JAVA_BYTE.withName("log2_diff_max_min_luma_coding_block_size"),
		    JAVA_BYTE.withName("log2_min_luma_transform_block_size_minus2"),
		    JAVA_BYTE.withName("log2_diff_max_min_luma_transform_block_size"),
		    JAVA_BYTE.withName("max_transform_hierarchy_depth_inter"),
		    JAVA_BYTE.withName("max_transform_hierarchy_depth_intra"),
		    JAVA_BYTE.withName("num_short_term_ref_pic_sets"),
		    JAVA_BYTE.withName("num_long_term_ref_pics_sps"),
		    JAVA_BYTE.withName("pcm_sample_bit_depth_luma_minus1"),
		    JAVA_BYTE.withName("pcm_sample_bit_depth_chroma_minus1"),
		    JAVA_BYTE.withName("log2_min_pcm_luma_coding_block_size_minus3"),
		    JAVA_BYTE.withName("log2_diff_max_min_pcm_luma_coding_block_size"),
		    JAVA_BYTE.withName("reserved1"),
		    JAVA_BYTE.withName("reserved2"),
		    JAVA_BYTE.withName("palette_max_size"),
		    JAVA_BYTE.withName("delta_palette_max_predictor_size"),
		    JAVA_BYTE.withName("motion_vector_resolution_control_idc"),
		    JAVA_BYTE.withName("sps_num_palette_predictor_initializers_minus1"),
		    JAVA_INT.withName("conf_win_left_offset"),
		    JAVA_INT.withName("conf_win_right_offset"),
		    JAVA_INT.withName("conf_win_top_offset"),
		    JAVA_INT.withName("conf_win_bottom_offset"),
		    UNBOUNDED_ADDRESS.withName("pProfileTierLevel"),
		    UNBOUNDED_ADDRESS.withName("pDecPicBufMgr"),
		    UNBOUNDED_ADDRESS.withName("pScalingLists"),
		    UNBOUNDED_ADDRESS.withName("pShortTermRefPicSet"),
		    UNBOUNDED_ADDRESS.withName("pLongTermRefPicsSps"),
		    UNBOUNDED_ADDRESS.withName("pSequenceParameterSetVui"),
		    UNBOUNDED_ADDRESS.withName("pPredictorPaletteEntries")
		).withName("StdVideoH265SequenceParameterSet").withByteAlignment(8);
		
		CHROMA_FORMAT_IDC_HANDLE = LAYOUT.varHandle(PathElement.groupElement("chroma_format_idc"));
		PIC_WIDTH_IN_LUMA_SAMPLES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pic_width_in_luma_samples"));
		PIC_HEIGHT_IN_LUMA_SAMPLES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pic_height_in_luma_samples"));
		SPS_VIDEO_PARAMETER_SET_ID_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sps_video_parameter_set_id"));
		SPS_MAX_SUB_LAYERS_MINUS1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sps_max_sub_layers_minus1"));
		SPS_SEQ_PARAMETER_SET_ID_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sps_seq_parameter_set_id"));
		BIT_DEPTH_LUMA_MINUS8_HANDLE = LAYOUT.varHandle(PathElement.groupElement("bit_depth_luma_minus8"));
		BIT_DEPTH_CHROMA_MINUS8_HANDLE = LAYOUT.varHandle(PathElement.groupElement("bit_depth_chroma_minus8"));
		LOG2_MAX_PIC_ORDER_CNT_LSB_MINUS4_HANDLE = LAYOUT.varHandle(PathElement.groupElement("log2_max_pic_order_cnt_lsb_minus4"));
		LOG2_MIN_LUMA_CODING_BLOCK_SIZE_MINUS3_HANDLE = LAYOUT.varHandle(PathElement.groupElement("log2_min_luma_coding_block_size_minus3"));
		LOG2_DIFF_MAX_MIN_LUMA_CODING_BLOCK_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("log2_diff_max_min_luma_coding_block_size"));
		LOG2_MIN_LUMA_TRANSFORM_BLOCK_SIZE_MINUS2_HANDLE = LAYOUT.varHandle(PathElement.groupElement("log2_min_luma_transform_block_size_minus2"));
		LOG2_DIFF_MAX_MIN_LUMA_TRANSFORM_BLOCK_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("log2_diff_max_min_luma_transform_block_size"));
		MAX_TRANSFORM_HIERARCHY_DEPTH_INTER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("max_transform_hierarchy_depth_inter"));
		MAX_TRANSFORM_HIERARCHY_DEPTH_INTRA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("max_transform_hierarchy_depth_intra"));
		NUM_SHORT_TERM_REF_PIC_SETS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("num_short_term_ref_pic_sets"));
		NUM_LONG_TERM_REF_PICS_SPS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("num_long_term_ref_pics_sps"));
		PCM_SAMPLE_BIT_DEPTH_LUMA_MINUS1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pcm_sample_bit_depth_luma_minus1"));
		PCM_SAMPLE_BIT_DEPTH_CHROMA_MINUS1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pcm_sample_bit_depth_chroma_minus1"));
		LOG2_MIN_PCM_LUMA_CODING_BLOCK_SIZE_MINUS3_HANDLE = LAYOUT.varHandle(PathElement.groupElement("log2_min_pcm_luma_coding_block_size_minus3"));
		LOG2_DIFF_MAX_MIN_PCM_LUMA_CODING_BLOCK_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("log2_diff_max_min_pcm_luma_coding_block_size"));
		RESERVED1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("reserved1"));
		RESERVED2_HANDLE = LAYOUT.varHandle(PathElement.groupElement("reserved2"));
		PALETTE_MAX_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("palette_max_size"));
		DELTA_PALETTE_MAX_PREDICTOR_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("delta_palette_max_predictor_size"));
		MOTION_VECTOR_RESOLUTION_CONTROL_IDC_HANDLE = LAYOUT.varHandle(PathElement.groupElement("motion_vector_resolution_control_idc"));
		SPS_NUM_PALETTE_PREDICTOR_INITIALIZERS_MINUS1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sps_num_palette_predictor_initializers_minus1"));
		CONF_WIN_LEFT_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("conf_win_left_offset"));
		CONF_WIN_RIGHT_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("conf_win_right_offset"));
		CONF_WIN_TOP_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("conf_win_top_offset"));
		CONF_WIN_BOTTOM_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("conf_win_bottom_offset"));
		P_PROFILE_TIER_LEVEL_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pProfileTierLevel"));
		P_DEC_PIC_BUF_MGR_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pDecPicBufMgr"));
		P_SCALING_LISTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pScalingLists"));
		P_SHORT_TERM_REF_PIC_SET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pShortTermRefPicSet"));
		P_LONG_TERM_REF_PICS_SPS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pLongTermRefPicsSps"));
		P_SEQUENCE_PARAMETER_SET_VUI_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pSequenceParameterSetVui"));
		P_PREDICTOR_PALETTE_ENTRIES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pPredictorPaletteEntries"));
		
		FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
		CHROMA_FORMAT_IDC_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("chroma_format_idc"));
		PIC_WIDTH_IN_LUMA_SAMPLES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pic_width_in_luma_samples"));
		PIC_HEIGHT_IN_LUMA_SAMPLES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pic_height_in_luma_samples"));
		SPS_VIDEO_PARAMETER_SET_ID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sps_video_parameter_set_id"));
		SPS_MAX_SUB_LAYERS_MINUS1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sps_max_sub_layers_minus1"));
		SPS_SEQ_PARAMETER_SET_ID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sps_seq_parameter_set_id"));
		BIT_DEPTH_LUMA_MINUS8_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("bit_depth_luma_minus8"));
		BIT_DEPTH_CHROMA_MINUS8_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("bit_depth_chroma_minus8"));
		LOG2_MAX_PIC_ORDER_CNT_LSB_MINUS4_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("log2_max_pic_order_cnt_lsb_minus4"));
		LOG2_MIN_LUMA_CODING_BLOCK_SIZE_MINUS3_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("log2_min_luma_coding_block_size_minus3"));
		LOG2_DIFF_MAX_MIN_LUMA_CODING_BLOCK_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("log2_diff_max_min_luma_coding_block_size"));
		LOG2_MIN_LUMA_TRANSFORM_BLOCK_SIZE_MINUS2_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("log2_min_luma_transform_block_size_minus2"));
		LOG2_DIFF_MAX_MIN_LUMA_TRANSFORM_BLOCK_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("log2_diff_max_min_luma_transform_block_size"));
		MAX_TRANSFORM_HIERARCHY_DEPTH_INTER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("max_transform_hierarchy_depth_inter"));
		MAX_TRANSFORM_HIERARCHY_DEPTH_INTRA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("max_transform_hierarchy_depth_intra"));
		NUM_SHORT_TERM_REF_PIC_SETS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("num_short_term_ref_pic_sets"));
		NUM_LONG_TERM_REF_PICS_SPS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("num_long_term_ref_pics_sps"));
		PCM_SAMPLE_BIT_DEPTH_LUMA_MINUS1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pcm_sample_bit_depth_luma_minus1"));
		PCM_SAMPLE_BIT_DEPTH_CHROMA_MINUS1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pcm_sample_bit_depth_chroma_minus1"));
		LOG2_MIN_PCM_LUMA_CODING_BLOCK_SIZE_MINUS3_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("log2_min_pcm_luma_coding_block_size_minus3"));
		LOG2_DIFF_MAX_MIN_PCM_LUMA_CODING_BLOCK_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("log2_diff_max_min_pcm_luma_coding_block_size"));
		RESERVED1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("reserved1"));
		RESERVED2_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("reserved2"));
		PALETTE_MAX_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("palette_max_size"));
		DELTA_PALETTE_MAX_PREDICTOR_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("delta_palette_max_predictor_size"));
		MOTION_VECTOR_RESOLUTION_CONTROL_IDC_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("motion_vector_resolution_control_idc"));
		SPS_NUM_PALETTE_PREDICTOR_INITIALIZERS_MINUS1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sps_num_palette_predictor_initializers_minus1"));
		CONF_WIN_LEFT_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("conf_win_left_offset"));
		CONF_WIN_RIGHT_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("conf_win_right_offset"));
		CONF_WIN_TOP_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("conf_win_top_offset"));
		CONF_WIN_BOTTOM_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("conf_win_bottom_offset"));
		P_PROFILE_TIER_LEVEL_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pProfileTierLevel"));
		P_DEC_PIC_BUF_MGR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pDecPicBufMgr"));
		P_SCALING_LISTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pScalingLists"));
		P_SHORT_TERM_REF_PIC_SET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pShortTermRefPicSet"));
		P_LONG_TERM_REF_PICS_SPS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pLongTermRefPicsSps"));
		P_SEQUENCE_PARAMETER_SET_VUI_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pSequenceParameterSetVui"));
		P_PREDICTOR_PALETTE_ENTRIES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pPredictorPaletteEntries"));
		//@formatter:on
	}

	public StdVideoH265SequenceParameterSet() {
	    this(Arena.ofAuto());
	}
	
	public StdVideoH265SequenceParameterSet(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public StdVideoH265SequenceParameterSet(MemorySegment segment) {
	    this.segment = segment;
	
	    flags = new StdVideoH265SpsFlags(segment.asSlice(FLAGS_BYTE_OFFSET, StdVideoH265SpsFlags.LAYOUT));
	}

    /// @see #flags()
    public StdVideoH265SequenceParameterSet flags(Consumer<StdVideoH265SpsFlags> consumer) {
    	consumer.accept(flags);
    	return this;
    }
    
    /// @see #flags()
    public StdVideoH265SequenceParameterSet flags(StdVideoH265SpsFlags other) {
    	flags.set(other);
    	return this;
    }
    
    public StdVideoH265SpsFlags flags() {
    	return flags;
    }
    
    /// @see #chroma_format_idc()
    public StdVideoH265SequenceParameterSet chroma_format_idc(int chroma_format_idc) {
    	CHROMA_FORMAT_IDC_HANDLE.set(segment, 0L, chroma_format_idc);
    	return this;
    }
    
    public int chroma_format_idc() {
    	return (int) CHROMA_FORMAT_IDC_HANDLE.get(segment, 0L);
    }
    
    /// @see #pic_width_in_luma_samples()
    public StdVideoH265SequenceParameterSet pic_width_in_luma_samples(int pic_width_in_luma_samples) {
    	PIC_WIDTH_IN_LUMA_SAMPLES_HANDLE.set(segment, 0L, pic_width_in_luma_samples);
    	return this;
    }
    
    public int pic_width_in_luma_samples() {
    	return (int) PIC_WIDTH_IN_LUMA_SAMPLES_HANDLE.get(segment, 0L);
    }
    
    /// @see #pic_height_in_luma_samples()
    public StdVideoH265SequenceParameterSet pic_height_in_luma_samples(int pic_height_in_luma_samples) {
    	PIC_HEIGHT_IN_LUMA_SAMPLES_HANDLE.set(segment, 0L, pic_height_in_luma_samples);
    	return this;
    }
    
    public int pic_height_in_luma_samples() {
    	return (int) PIC_HEIGHT_IN_LUMA_SAMPLES_HANDLE.get(segment, 0L);
    }
    
    /// @see #sps_video_parameter_set_id()
    public StdVideoH265SequenceParameterSet sps_video_parameter_set_id(byte sps_video_parameter_set_id) {
    	SPS_VIDEO_PARAMETER_SET_ID_HANDLE.set(segment, 0L, sps_video_parameter_set_id);
    	return this;
    }
    
    public byte sps_video_parameter_set_id() {
    	return (byte) SPS_VIDEO_PARAMETER_SET_ID_HANDLE.get(segment, 0L);
    }
    
    /// @see #sps_max_sub_layers_minus1()
    public StdVideoH265SequenceParameterSet sps_max_sub_layers_minus1(byte sps_max_sub_layers_minus1) {
    	SPS_MAX_SUB_LAYERS_MINUS1_HANDLE.set(segment, 0L, sps_max_sub_layers_minus1);
    	return this;
    }
    
    public byte sps_max_sub_layers_minus1() {
    	return (byte) SPS_MAX_SUB_LAYERS_MINUS1_HANDLE.get(segment, 0L);
    }
    
    /// @see #sps_seq_parameter_set_id()
    public StdVideoH265SequenceParameterSet sps_seq_parameter_set_id(byte sps_seq_parameter_set_id) {
    	SPS_SEQ_PARAMETER_SET_ID_HANDLE.set(segment, 0L, sps_seq_parameter_set_id);
    	return this;
    }
    
    public byte sps_seq_parameter_set_id() {
    	return (byte) SPS_SEQ_PARAMETER_SET_ID_HANDLE.get(segment, 0L);
    }
    
    /// @see #bit_depth_luma_minus8()
    public StdVideoH265SequenceParameterSet bit_depth_luma_minus8(byte bit_depth_luma_minus8) {
    	BIT_DEPTH_LUMA_MINUS8_HANDLE.set(segment, 0L, bit_depth_luma_minus8);
    	return this;
    }
    
    public byte bit_depth_luma_minus8() {
    	return (byte) BIT_DEPTH_LUMA_MINUS8_HANDLE.get(segment, 0L);
    }
    
    /// @see #bit_depth_chroma_minus8()
    public StdVideoH265SequenceParameterSet bit_depth_chroma_minus8(byte bit_depth_chroma_minus8) {
    	BIT_DEPTH_CHROMA_MINUS8_HANDLE.set(segment, 0L, bit_depth_chroma_minus8);
    	return this;
    }
    
    public byte bit_depth_chroma_minus8() {
    	return (byte) BIT_DEPTH_CHROMA_MINUS8_HANDLE.get(segment, 0L);
    }
    
    /// @see #log2_max_pic_order_cnt_lsb_minus4()
    public StdVideoH265SequenceParameterSet log2_max_pic_order_cnt_lsb_minus4(byte log2_max_pic_order_cnt_lsb_minus4) {
    	LOG2_MAX_PIC_ORDER_CNT_LSB_MINUS4_HANDLE.set(segment, 0L, log2_max_pic_order_cnt_lsb_minus4);
    	return this;
    }
    
    public byte log2_max_pic_order_cnt_lsb_minus4() {
    	return (byte) LOG2_MAX_PIC_ORDER_CNT_LSB_MINUS4_HANDLE.get(segment, 0L);
    }
    
    /// @see #log2_min_luma_coding_block_size_minus3()
    public StdVideoH265SequenceParameterSet log2_min_luma_coding_block_size_minus3(byte log2_min_luma_coding_block_size_minus3) {
    	LOG2_MIN_LUMA_CODING_BLOCK_SIZE_MINUS3_HANDLE.set(segment, 0L, log2_min_luma_coding_block_size_minus3);
    	return this;
    }
    
    public byte log2_min_luma_coding_block_size_minus3() {
    	return (byte) LOG2_MIN_LUMA_CODING_BLOCK_SIZE_MINUS3_HANDLE.get(segment, 0L);
    }
    
    /// @see #log2_diff_max_min_luma_coding_block_size()
    public StdVideoH265SequenceParameterSet log2_diff_max_min_luma_coding_block_size(byte log2_diff_max_min_luma_coding_block_size) {
    	LOG2_DIFF_MAX_MIN_LUMA_CODING_BLOCK_SIZE_HANDLE.set(segment, 0L, log2_diff_max_min_luma_coding_block_size);
    	return this;
    }
    
    public byte log2_diff_max_min_luma_coding_block_size() {
    	return (byte) LOG2_DIFF_MAX_MIN_LUMA_CODING_BLOCK_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #log2_min_luma_transform_block_size_minus2()
    public StdVideoH265SequenceParameterSet log2_min_luma_transform_block_size_minus2(byte log2_min_luma_transform_block_size_minus2) {
    	LOG2_MIN_LUMA_TRANSFORM_BLOCK_SIZE_MINUS2_HANDLE.set(segment, 0L, log2_min_luma_transform_block_size_minus2);
    	return this;
    }
    
    public byte log2_min_luma_transform_block_size_minus2() {
    	return (byte) LOG2_MIN_LUMA_TRANSFORM_BLOCK_SIZE_MINUS2_HANDLE.get(segment, 0L);
    }
    
    /// @see #log2_diff_max_min_luma_transform_block_size()
    public StdVideoH265SequenceParameterSet log2_diff_max_min_luma_transform_block_size(byte log2_diff_max_min_luma_transform_block_size) {
    	LOG2_DIFF_MAX_MIN_LUMA_TRANSFORM_BLOCK_SIZE_HANDLE.set(segment, 0L, log2_diff_max_min_luma_transform_block_size);
    	return this;
    }
    
    public byte log2_diff_max_min_luma_transform_block_size() {
    	return (byte) LOG2_DIFF_MAX_MIN_LUMA_TRANSFORM_BLOCK_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #max_transform_hierarchy_depth_inter()
    public StdVideoH265SequenceParameterSet max_transform_hierarchy_depth_inter(byte max_transform_hierarchy_depth_inter) {
    	MAX_TRANSFORM_HIERARCHY_DEPTH_INTER_HANDLE.set(segment, 0L, max_transform_hierarchy_depth_inter);
    	return this;
    }
    
    public byte max_transform_hierarchy_depth_inter() {
    	return (byte) MAX_TRANSFORM_HIERARCHY_DEPTH_INTER_HANDLE.get(segment, 0L);
    }
    
    /// @see #max_transform_hierarchy_depth_intra()
    public StdVideoH265SequenceParameterSet max_transform_hierarchy_depth_intra(byte max_transform_hierarchy_depth_intra) {
    	MAX_TRANSFORM_HIERARCHY_DEPTH_INTRA_HANDLE.set(segment, 0L, max_transform_hierarchy_depth_intra);
    	return this;
    }
    
    public byte max_transform_hierarchy_depth_intra() {
    	return (byte) MAX_TRANSFORM_HIERARCHY_DEPTH_INTRA_HANDLE.get(segment, 0L);
    }
    
    /// @see #num_short_term_ref_pic_sets()
    public StdVideoH265SequenceParameterSet num_short_term_ref_pic_sets(byte num_short_term_ref_pic_sets) {
    	NUM_SHORT_TERM_REF_PIC_SETS_HANDLE.set(segment, 0L, num_short_term_ref_pic_sets);
    	return this;
    }
    
    public byte num_short_term_ref_pic_sets() {
    	return (byte) NUM_SHORT_TERM_REF_PIC_SETS_HANDLE.get(segment, 0L);
    }
    
    /// @see #num_long_term_ref_pics_sps()
    public StdVideoH265SequenceParameterSet num_long_term_ref_pics_sps(byte num_long_term_ref_pics_sps) {
    	NUM_LONG_TERM_REF_PICS_SPS_HANDLE.set(segment, 0L, num_long_term_ref_pics_sps);
    	return this;
    }
    
    public byte num_long_term_ref_pics_sps() {
    	return (byte) NUM_LONG_TERM_REF_PICS_SPS_HANDLE.get(segment, 0L);
    }
    
    /// @see #pcm_sample_bit_depth_luma_minus1()
    public StdVideoH265SequenceParameterSet pcm_sample_bit_depth_luma_minus1(byte pcm_sample_bit_depth_luma_minus1) {
    	PCM_SAMPLE_BIT_DEPTH_LUMA_MINUS1_HANDLE.set(segment, 0L, pcm_sample_bit_depth_luma_minus1);
    	return this;
    }
    
    public byte pcm_sample_bit_depth_luma_minus1() {
    	return (byte) PCM_SAMPLE_BIT_DEPTH_LUMA_MINUS1_HANDLE.get(segment, 0L);
    }
    
    /// @see #pcm_sample_bit_depth_chroma_minus1()
    public StdVideoH265SequenceParameterSet pcm_sample_bit_depth_chroma_minus1(byte pcm_sample_bit_depth_chroma_minus1) {
    	PCM_SAMPLE_BIT_DEPTH_CHROMA_MINUS1_HANDLE.set(segment, 0L, pcm_sample_bit_depth_chroma_minus1);
    	return this;
    }
    
    public byte pcm_sample_bit_depth_chroma_minus1() {
    	return (byte) PCM_SAMPLE_BIT_DEPTH_CHROMA_MINUS1_HANDLE.get(segment, 0L);
    }
    
    /// @see #log2_min_pcm_luma_coding_block_size_minus3()
    public StdVideoH265SequenceParameterSet log2_min_pcm_luma_coding_block_size_minus3(byte log2_min_pcm_luma_coding_block_size_minus3) {
    	LOG2_MIN_PCM_LUMA_CODING_BLOCK_SIZE_MINUS3_HANDLE.set(segment, 0L, log2_min_pcm_luma_coding_block_size_minus3);
    	return this;
    }
    
    public byte log2_min_pcm_luma_coding_block_size_minus3() {
    	return (byte) LOG2_MIN_PCM_LUMA_CODING_BLOCK_SIZE_MINUS3_HANDLE.get(segment, 0L);
    }
    
    /// @see #log2_diff_max_min_pcm_luma_coding_block_size()
    public StdVideoH265SequenceParameterSet log2_diff_max_min_pcm_luma_coding_block_size(byte log2_diff_max_min_pcm_luma_coding_block_size) {
    	LOG2_DIFF_MAX_MIN_PCM_LUMA_CODING_BLOCK_SIZE_HANDLE.set(segment, 0L, log2_diff_max_min_pcm_luma_coding_block_size);
    	return this;
    }
    
    public byte log2_diff_max_min_pcm_luma_coding_block_size() {
    	return (byte) LOG2_DIFF_MAX_MIN_PCM_LUMA_CODING_BLOCK_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #reserved1()
    public StdVideoH265SequenceParameterSet reserved1(byte reserved1) {
    	RESERVED1_HANDLE.set(segment, 0L, reserved1);
    	return this;
    }
    
    public byte reserved1() {
    	return (byte) RESERVED1_HANDLE.get(segment, 0L);
    }
    
    /// @see #reserved2()
    public StdVideoH265SequenceParameterSet reserved2(byte reserved2) {
    	RESERVED2_HANDLE.set(segment, 0L, reserved2);
    	return this;
    }
    
    public byte reserved2() {
    	return (byte) RESERVED2_HANDLE.get(segment, 0L);
    }
    
    /// @see #palette_max_size()
    public StdVideoH265SequenceParameterSet palette_max_size(byte palette_max_size) {
    	PALETTE_MAX_SIZE_HANDLE.set(segment, 0L, palette_max_size);
    	return this;
    }
    
    public byte palette_max_size() {
    	return (byte) PALETTE_MAX_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #delta_palette_max_predictor_size()
    public StdVideoH265SequenceParameterSet delta_palette_max_predictor_size(byte delta_palette_max_predictor_size) {
    	DELTA_PALETTE_MAX_PREDICTOR_SIZE_HANDLE.set(segment, 0L, delta_palette_max_predictor_size);
    	return this;
    }
    
    public byte delta_palette_max_predictor_size() {
    	return (byte) DELTA_PALETTE_MAX_PREDICTOR_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #motion_vector_resolution_control_idc()
    public StdVideoH265SequenceParameterSet motion_vector_resolution_control_idc(byte motion_vector_resolution_control_idc) {
    	MOTION_VECTOR_RESOLUTION_CONTROL_IDC_HANDLE.set(segment, 0L, motion_vector_resolution_control_idc);
    	return this;
    }
    
    public byte motion_vector_resolution_control_idc() {
    	return (byte) MOTION_VECTOR_RESOLUTION_CONTROL_IDC_HANDLE.get(segment, 0L);
    }
    
    /// @see #sps_num_palette_predictor_initializers_minus1()
    public StdVideoH265SequenceParameterSet sps_num_palette_predictor_initializers_minus1(byte sps_num_palette_predictor_initializers_minus1) {
    	SPS_NUM_PALETTE_PREDICTOR_INITIALIZERS_MINUS1_HANDLE.set(segment, 0L, sps_num_palette_predictor_initializers_minus1);
    	return this;
    }
    
    public byte sps_num_palette_predictor_initializers_minus1() {
    	return (byte) SPS_NUM_PALETTE_PREDICTOR_INITIALIZERS_MINUS1_HANDLE.get(segment, 0L);
    }
    
    /// @see #conf_win_left_offset()
    public StdVideoH265SequenceParameterSet conf_win_left_offset(int conf_win_left_offset) {
    	CONF_WIN_LEFT_OFFSET_HANDLE.set(segment, 0L, conf_win_left_offset);
    	return this;
    }
    
    public int conf_win_left_offset() {
    	return (int) CONF_WIN_LEFT_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #conf_win_right_offset()
    public StdVideoH265SequenceParameterSet conf_win_right_offset(int conf_win_right_offset) {
    	CONF_WIN_RIGHT_OFFSET_HANDLE.set(segment, 0L, conf_win_right_offset);
    	return this;
    }
    
    public int conf_win_right_offset() {
    	return (int) CONF_WIN_RIGHT_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #conf_win_top_offset()
    public StdVideoH265SequenceParameterSet conf_win_top_offset(int conf_win_top_offset) {
    	CONF_WIN_TOP_OFFSET_HANDLE.set(segment, 0L, conf_win_top_offset);
    	return this;
    }
    
    public int conf_win_top_offset() {
    	return (int) CONF_WIN_TOP_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #conf_win_bottom_offset()
    public StdVideoH265SequenceParameterSet conf_win_bottom_offset(int conf_win_bottom_offset) {
    	CONF_WIN_BOTTOM_OFFSET_HANDLE.set(segment, 0L, conf_win_bottom_offset);
    	return this;
    }
    
    public int conf_win_bottom_offset() {
    	return (int) CONF_WIN_BOTTOM_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #pProfileTierLevel()
    public StdVideoH265SequenceParameterSet pProfileTierLevel(StdVideoH265ProfileTierLevel pProfileTierLevel) {
    	P_PROFILE_TIER_LEVEL_HANDLE.set(segment, 0L, pProfileTierLevel.memorySegment());
    	return this;
    }
    
    public @Nullable StdVideoH265ProfileTierLevel pProfileTierLevel() {
    	MemorySegment segment = (MemorySegment) P_PROFILE_TIER_LEVEL_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new StdVideoH265ProfileTierLevel(segment);
    }
    
    /// @see #pDecPicBufMgr()
    public StdVideoH265SequenceParameterSet pDecPicBufMgr(StdVideoH265DecPicBufMgr pDecPicBufMgr) {
    	P_DEC_PIC_BUF_MGR_HANDLE.set(segment, 0L, pDecPicBufMgr.memorySegment());
    	return this;
    }
    
    public @Nullable StdVideoH265DecPicBufMgr pDecPicBufMgr() {
    	MemorySegment segment = (MemorySegment) P_DEC_PIC_BUF_MGR_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new StdVideoH265DecPicBufMgr(segment);
    }
    
    /// @see #pScalingLists()
    public StdVideoH265SequenceParameterSet pScalingLists(StdVideoH265ScalingLists pScalingLists) {
    	P_SCALING_LISTS_HANDLE.set(segment, 0L, pScalingLists.memorySegment());
    	return this;
    }
    
    public @Nullable StdVideoH265ScalingLists pScalingLists() {
    	MemorySegment segment = (MemorySegment) P_SCALING_LISTS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new StdVideoH265ScalingLists(segment);
    }
    
    /// @see #pShortTermRefPicSet()
    public StdVideoH265SequenceParameterSet pShortTermRefPicSet(NativeStructArray<StdVideoH265ShortTermRefPicSet> pShortTermRefPicSet) {
    	P_SHORT_TERM_REF_PIC_SET_HANDLE.set(segment, 0L, pShortTermRefPicSet.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<StdVideoH265ShortTermRefPicSet> pShortTermRefPicSet() {
    	MemorySegment segment = (MemorySegment) P_SHORT_TERM_REF_PIC_SET_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return StdVideoH265ShortTermRefPicSet.array(segment);
    }
    
    /// @see #pLongTermRefPicsSps()
    public StdVideoH265SequenceParameterSet pLongTermRefPicsSps(StdVideoH265LongTermRefPicsSps pLongTermRefPicsSps) {
    	P_LONG_TERM_REF_PICS_SPS_HANDLE.set(segment, 0L, pLongTermRefPicsSps.memorySegment());
    	return this;
    }
    
    public @Nullable StdVideoH265LongTermRefPicsSps pLongTermRefPicsSps() {
    	MemorySegment segment = (MemorySegment) P_LONG_TERM_REF_PICS_SPS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new StdVideoH265LongTermRefPicsSps(segment);
    }
    
    /// @see #pSequenceParameterSetVui()
    public StdVideoH265SequenceParameterSet pSequenceParameterSetVui(StdVideoH265SequenceParameterSetVui pSequenceParameterSetVui) {
    	P_SEQUENCE_PARAMETER_SET_VUI_HANDLE.set(segment, 0L, pSequenceParameterSetVui.memorySegment());
    	return this;
    }
    
    public @Nullable StdVideoH265SequenceParameterSetVui pSequenceParameterSetVui() {
    	MemorySegment segment = (MemorySegment) P_SEQUENCE_PARAMETER_SET_VUI_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new StdVideoH265SequenceParameterSetVui(segment);
    }
    
    /// @see #pPredictorPaletteEntries()
    public StdVideoH265SequenceParameterSet pPredictorPaletteEntries(StdVideoH265PredictorPaletteEntries pPredictorPaletteEntries) {
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
    public StdVideoH265SequenceParameterSet set(StdVideoH265SequenceParameterSet other) {
        return set(other.segment);
    }
    
    @Override
    public StdVideoH265SequenceParameterSet set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<StdVideoH265SequenceParameterSet> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<StdVideoH265SequenceParameterSet> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new StdVideoH265SequenceParameterSet(segment),
            count
        );
    }
    
    public static NativeStructArray<StdVideoH265SequenceParameterSet> array(SegmentAllocator allocator, StdVideoH265SequenceParameterSet... structs) {
        NativeStructArray<StdVideoH265SequenceParameterSet> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new StdVideoH265SequenceParameterSet(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<StdVideoH265SequenceParameterSet> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new StdVideoH265SequenceParameterSet(segment)
        );
    }

}