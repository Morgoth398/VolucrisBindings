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

public final class StdVideoH265SequenceParameterSetVui
		implements Struct<StdVideoH265SequenceParameterSetVui> {

	public static final StructLayout LAYOUT;

	public static final VarHandle ASPECT_RATIO_IDC_HANDLE;
	public static final VarHandle SAR_WIDTH_HANDLE;
	public static final VarHandle SAR_HEIGHT_HANDLE;
	public static final VarHandle VIDEO_FORMAT_HANDLE;
	public static final VarHandle COLOUR_PRIMARIES_HANDLE;
	public static final VarHandle TRANSFER_CHARACTERISTICS_HANDLE;
	public static final VarHandle MATRIX_COEFFS_HANDLE;
	public static final VarHandle CHROMA_SAMPLE_LOC_TYPE_TOP_FIELD_HANDLE;
	public static final VarHandle CHROMA_SAMPLE_LOC_TYPE_BOTTOM_FIELD_HANDLE;
	public static final VarHandle RESERVED1_HANDLE;
	public static final VarHandle RESERVED2_HANDLE;
	public static final VarHandle DEF_DISP_WIN_LEFT_OFFSET_HANDLE;
	public static final VarHandle DEF_DISP_WIN_RIGHT_OFFSET_HANDLE;
	public static final VarHandle DEF_DISP_WIN_TOP_OFFSET_HANDLE;
	public static final VarHandle DEF_DISP_WIN_BOTTOM_OFFSET_HANDLE;
	public static final VarHandle VUI_NUM_UNITS_IN_TICK_HANDLE;
	public static final VarHandle VUI_TIME_SCALE_HANDLE;
	public static final VarHandle VUI_NUM_TICKS_POC_DIFF_ONE_MINUS1_HANDLE;
	public static final VarHandle MIN_SPATIAL_SEGMENTATION_IDC_HANDLE;
	public static final VarHandle RESERVED3_HANDLE;
	public static final VarHandle MAX_BYTES_PER_PIC_DENOM_HANDLE;
	public static final VarHandle MAX_BITS_PER_MIN_CU_DENOM_HANDLE;
	public static final VarHandle LOG2_MAX_MV_LENGTH_HORIZONTAL_HANDLE;
	public static final VarHandle LOG2_MAX_MV_LENGTH_VERTICAL_HANDLE;
	public static final VarHandle P_HRD_PARAMETERS_HANDLE;

	public static final long FLAGS_BYTE_OFFSET;
	public static final long ASPECT_RATIO_IDC_BYTE_OFFSET;
	public static final long SAR_WIDTH_BYTE_OFFSET;
	public static final long SAR_HEIGHT_BYTE_OFFSET;
	public static final long VIDEO_FORMAT_BYTE_OFFSET;
	public static final long COLOUR_PRIMARIES_BYTE_OFFSET;
	public static final long TRANSFER_CHARACTERISTICS_BYTE_OFFSET;
	public static final long MATRIX_COEFFS_BYTE_OFFSET;
	public static final long CHROMA_SAMPLE_LOC_TYPE_TOP_FIELD_BYTE_OFFSET;
	public static final long CHROMA_SAMPLE_LOC_TYPE_BOTTOM_FIELD_BYTE_OFFSET;
	public static final long RESERVED1_BYTE_OFFSET;
	public static final long RESERVED2_BYTE_OFFSET;
	public static final long DEF_DISP_WIN_LEFT_OFFSET_BYTE_OFFSET;
	public static final long DEF_DISP_WIN_RIGHT_OFFSET_BYTE_OFFSET;
	public static final long DEF_DISP_WIN_TOP_OFFSET_BYTE_OFFSET;
	public static final long DEF_DISP_WIN_BOTTOM_OFFSET_BYTE_OFFSET;
	public static final long VUI_NUM_UNITS_IN_TICK_BYTE_OFFSET;
	public static final long VUI_TIME_SCALE_BYTE_OFFSET;
	public static final long VUI_NUM_TICKS_POC_DIFF_ONE_MINUS1_BYTE_OFFSET;
	public static final long MIN_SPATIAL_SEGMENTATION_IDC_BYTE_OFFSET;
	public static final long RESERVED3_BYTE_OFFSET;
	public static final long MAX_BYTES_PER_PIC_DENOM_BYTE_OFFSET;
	public static final long MAX_BITS_PER_MIN_CU_DENOM_BYTE_OFFSET;
	public static final long LOG2_MAX_MV_LENGTH_HORIZONTAL_BYTE_OFFSET;
	public static final long LOG2_MAX_MV_LENGTH_VERTICAL_BYTE_OFFSET;
	public static final long P_HRD_PARAMETERS_BYTE_OFFSET;

	private final MemorySegment segment;

	private final StdVideoH265SpsVuiFlags flags;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    StdVideoH265SpsVuiFlags.LAYOUT.withName("flags"),
		    JAVA_INT.withName("aspect_ratio_idc"),
		    JAVA_SHORT.withName("sar_width"),
		    JAVA_SHORT.withName("sar_height"),
		    JAVA_BYTE.withName("video_format"),
		    JAVA_BYTE.withName("colour_primaries"),
		    JAVA_BYTE.withName("transfer_characteristics"),
		    JAVA_BYTE.withName("matrix_coeffs"),
		    JAVA_BYTE.withName("chroma_sample_loc_type_top_field"),
		    JAVA_BYTE.withName("chroma_sample_loc_type_bottom_field"),
		    JAVA_BYTE.withName("reserved1"),
		    JAVA_BYTE.withName("reserved2"),
		    JAVA_SHORT.withName("def_disp_win_left_offset"),
		    JAVA_SHORT.withName("def_disp_win_right_offset"),
		    JAVA_SHORT.withName("def_disp_win_top_offset"),
		    JAVA_SHORT.withName("def_disp_win_bottom_offset"),
		    JAVA_INT.withName("vui_num_units_in_tick"),
		    JAVA_INT.withName("vui_time_scale"),
		    JAVA_INT.withName("vui_num_ticks_poc_diff_one_minus1"),
		    JAVA_SHORT.withName("min_spatial_segmentation_idc"),
		    JAVA_SHORT.withName("reserved3"),
		    JAVA_BYTE.withName("max_bytes_per_pic_denom"),
		    JAVA_BYTE.withName("max_bits_per_min_cu_denom"),
		    JAVA_BYTE.withName("log2_max_mv_length_horizontal"),
		    JAVA_BYTE.withName("log2_max_mv_length_vertical"),
		    UNBOUNDED_ADDRESS.withName("pHrdParameters")
		).withName("StdVideoH265SequenceParameterSetVui").withByteAlignment(8);
		
		ASPECT_RATIO_IDC_HANDLE = LAYOUT.varHandle(PathElement.groupElement("aspect_ratio_idc"));
		SAR_WIDTH_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sar_width"));
		SAR_HEIGHT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sar_height"));
		VIDEO_FORMAT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("video_format"));
		COLOUR_PRIMARIES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("colour_primaries"));
		TRANSFER_CHARACTERISTICS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("transfer_characteristics"));
		MATRIX_COEFFS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("matrix_coeffs"));
		CHROMA_SAMPLE_LOC_TYPE_TOP_FIELD_HANDLE = LAYOUT.varHandle(PathElement.groupElement("chroma_sample_loc_type_top_field"));
		CHROMA_SAMPLE_LOC_TYPE_BOTTOM_FIELD_HANDLE = LAYOUT.varHandle(PathElement.groupElement("chroma_sample_loc_type_bottom_field"));
		RESERVED1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("reserved1"));
		RESERVED2_HANDLE = LAYOUT.varHandle(PathElement.groupElement("reserved2"));
		DEF_DISP_WIN_LEFT_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("def_disp_win_left_offset"));
		DEF_DISP_WIN_RIGHT_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("def_disp_win_right_offset"));
		DEF_DISP_WIN_TOP_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("def_disp_win_top_offset"));
		DEF_DISP_WIN_BOTTOM_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("def_disp_win_bottom_offset"));
		VUI_NUM_UNITS_IN_TICK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("vui_num_units_in_tick"));
		VUI_TIME_SCALE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("vui_time_scale"));
		VUI_NUM_TICKS_POC_DIFF_ONE_MINUS1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("vui_num_ticks_poc_diff_one_minus1"));
		MIN_SPATIAL_SEGMENTATION_IDC_HANDLE = LAYOUT.varHandle(PathElement.groupElement("min_spatial_segmentation_idc"));
		RESERVED3_HANDLE = LAYOUT.varHandle(PathElement.groupElement("reserved3"));
		MAX_BYTES_PER_PIC_DENOM_HANDLE = LAYOUT.varHandle(PathElement.groupElement("max_bytes_per_pic_denom"));
		MAX_BITS_PER_MIN_CU_DENOM_HANDLE = LAYOUT.varHandle(PathElement.groupElement("max_bits_per_min_cu_denom"));
		LOG2_MAX_MV_LENGTH_HORIZONTAL_HANDLE = LAYOUT.varHandle(PathElement.groupElement("log2_max_mv_length_horizontal"));
		LOG2_MAX_MV_LENGTH_VERTICAL_HANDLE = LAYOUT.varHandle(PathElement.groupElement("log2_max_mv_length_vertical"));
		P_HRD_PARAMETERS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pHrdParameters"));
		
		FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
		ASPECT_RATIO_IDC_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("aspect_ratio_idc"));
		SAR_WIDTH_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sar_width"));
		SAR_HEIGHT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sar_height"));
		VIDEO_FORMAT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("video_format"));
		COLOUR_PRIMARIES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("colour_primaries"));
		TRANSFER_CHARACTERISTICS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("transfer_characteristics"));
		MATRIX_COEFFS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("matrix_coeffs"));
		CHROMA_SAMPLE_LOC_TYPE_TOP_FIELD_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("chroma_sample_loc_type_top_field"));
		CHROMA_SAMPLE_LOC_TYPE_BOTTOM_FIELD_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("chroma_sample_loc_type_bottom_field"));
		RESERVED1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("reserved1"));
		RESERVED2_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("reserved2"));
		DEF_DISP_WIN_LEFT_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("def_disp_win_left_offset"));
		DEF_DISP_WIN_RIGHT_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("def_disp_win_right_offset"));
		DEF_DISP_WIN_TOP_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("def_disp_win_top_offset"));
		DEF_DISP_WIN_BOTTOM_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("def_disp_win_bottom_offset"));
		VUI_NUM_UNITS_IN_TICK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vui_num_units_in_tick"));
		VUI_TIME_SCALE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vui_time_scale"));
		VUI_NUM_TICKS_POC_DIFF_ONE_MINUS1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vui_num_ticks_poc_diff_one_minus1"));
		MIN_SPATIAL_SEGMENTATION_IDC_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("min_spatial_segmentation_idc"));
		RESERVED3_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("reserved3"));
		MAX_BYTES_PER_PIC_DENOM_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("max_bytes_per_pic_denom"));
		MAX_BITS_PER_MIN_CU_DENOM_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("max_bits_per_min_cu_denom"));
		LOG2_MAX_MV_LENGTH_HORIZONTAL_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("log2_max_mv_length_horizontal"));
		LOG2_MAX_MV_LENGTH_VERTICAL_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("log2_max_mv_length_vertical"));
		P_HRD_PARAMETERS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pHrdParameters"));
		//@formatter:on
	}

	public StdVideoH265SequenceParameterSetVui() {
	    this(Arena.ofAuto());
	}
	
	public StdVideoH265SequenceParameterSetVui(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public StdVideoH265SequenceParameterSetVui(MemorySegment segment) {
	    this.segment = segment;
	
	    flags = new StdVideoH265SpsVuiFlags(segment.asSlice(FLAGS_BYTE_OFFSET, StdVideoH265SpsVuiFlags.LAYOUT));
	}

    /// @see #flags()
    public StdVideoH265SequenceParameterSetVui flags(Consumer<StdVideoH265SpsVuiFlags> consumer) {
    	consumer.accept(flags);
    	return this;
    }
    
    /// @see #flags()
    public StdVideoH265SequenceParameterSetVui flags(StdVideoH265SpsVuiFlags other) {
    	flags.set(other);
    	return this;
    }
    
    public StdVideoH265SpsVuiFlags flags() {
    	return flags;
    }
    
    /// @see #aspect_ratio_idc()
    public StdVideoH265SequenceParameterSetVui aspect_ratio_idc(int aspect_ratio_idc) {
    	ASPECT_RATIO_IDC_HANDLE.set(segment, 0L, aspect_ratio_idc);
    	return this;
    }
    
    public int aspect_ratio_idc() {
    	return (int) ASPECT_RATIO_IDC_HANDLE.get(segment, 0L);
    }
    
    /// @see #sar_width()
    public StdVideoH265SequenceParameterSetVui sar_width(short sar_width) {
    	SAR_WIDTH_HANDLE.set(segment, 0L, sar_width);
    	return this;
    }
    
    public short sar_width() {
    	return (short) SAR_WIDTH_HANDLE.get(segment, 0L);
    }
    
    /// @see #sar_height()
    public StdVideoH265SequenceParameterSetVui sar_height(short sar_height) {
    	SAR_HEIGHT_HANDLE.set(segment, 0L, sar_height);
    	return this;
    }
    
    public short sar_height() {
    	return (short) SAR_HEIGHT_HANDLE.get(segment, 0L);
    }
    
    /// @see #video_format()
    public StdVideoH265SequenceParameterSetVui video_format(byte video_format) {
    	VIDEO_FORMAT_HANDLE.set(segment, 0L, video_format);
    	return this;
    }
    
    public byte video_format() {
    	return (byte) VIDEO_FORMAT_HANDLE.get(segment, 0L);
    }
    
    /// @see #colour_primaries()
    public StdVideoH265SequenceParameterSetVui colour_primaries(byte colour_primaries) {
    	COLOUR_PRIMARIES_HANDLE.set(segment, 0L, colour_primaries);
    	return this;
    }
    
    public byte colour_primaries() {
    	return (byte) COLOUR_PRIMARIES_HANDLE.get(segment, 0L);
    }
    
    /// @see #transfer_characteristics()
    public StdVideoH265SequenceParameterSetVui transfer_characteristics(byte transfer_characteristics) {
    	TRANSFER_CHARACTERISTICS_HANDLE.set(segment, 0L, transfer_characteristics);
    	return this;
    }
    
    public byte transfer_characteristics() {
    	return (byte) TRANSFER_CHARACTERISTICS_HANDLE.get(segment, 0L);
    }
    
    /// @see #matrix_coeffs()
    public StdVideoH265SequenceParameterSetVui matrix_coeffs(byte matrix_coeffs) {
    	MATRIX_COEFFS_HANDLE.set(segment, 0L, matrix_coeffs);
    	return this;
    }
    
    public byte matrix_coeffs() {
    	return (byte) MATRIX_COEFFS_HANDLE.get(segment, 0L);
    }
    
    /// @see #chroma_sample_loc_type_top_field()
    public StdVideoH265SequenceParameterSetVui chroma_sample_loc_type_top_field(byte chroma_sample_loc_type_top_field) {
    	CHROMA_SAMPLE_LOC_TYPE_TOP_FIELD_HANDLE.set(segment, 0L, chroma_sample_loc_type_top_field);
    	return this;
    }
    
    public byte chroma_sample_loc_type_top_field() {
    	return (byte) CHROMA_SAMPLE_LOC_TYPE_TOP_FIELD_HANDLE.get(segment, 0L);
    }
    
    /// @see #chroma_sample_loc_type_bottom_field()
    public StdVideoH265SequenceParameterSetVui chroma_sample_loc_type_bottom_field(byte chroma_sample_loc_type_bottom_field) {
    	CHROMA_SAMPLE_LOC_TYPE_BOTTOM_FIELD_HANDLE.set(segment, 0L, chroma_sample_loc_type_bottom_field);
    	return this;
    }
    
    public byte chroma_sample_loc_type_bottom_field() {
    	return (byte) CHROMA_SAMPLE_LOC_TYPE_BOTTOM_FIELD_HANDLE.get(segment, 0L);
    }
    
    /// @see #reserved1()
    public StdVideoH265SequenceParameterSetVui reserved1(byte reserved1) {
    	RESERVED1_HANDLE.set(segment, 0L, reserved1);
    	return this;
    }
    
    public byte reserved1() {
    	return (byte) RESERVED1_HANDLE.get(segment, 0L);
    }
    
    /// @see #reserved2()
    public StdVideoH265SequenceParameterSetVui reserved2(byte reserved2) {
    	RESERVED2_HANDLE.set(segment, 0L, reserved2);
    	return this;
    }
    
    public byte reserved2() {
    	return (byte) RESERVED2_HANDLE.get(segment, 0L);
    }
    
    /// @see #def_disp_win_left_offset()
    public StdVideoH265SequenceParameterSetVui def_disp_win_left_offset(short def_disp_win_left_offset) {
    	DEF_DISP_WIN_LEFT_OFFSET_HANDLE.set(segment, 0L, def_disp_win_left_offset);
    	return this;
    }
    
    public short def_disp_win_left_offset() {
    	return (short) DEF_DISP_WIN_LEFT_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #def_disp_win_right_offset()
    public StdVideoH265SequenceParameterSetVui def_disp_win_right_offset(short def_disp_win_right_offset) {
    	DEF_DISP_WIN_RIGHT_OFFSET_HANDLE.set(segment, 0L, def_disp_win_right_offset);
    	return this;
    }
    
    public short def_disp_win_right_offset() {
    	return (short) DEF_DISP_WIN_RIGHT_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #def_disp_win_top_offset()
    public StdVideoH265SequenceParameterSetVui def_disp_win_top_offset(short def_disp_win_top_offset) {
    	DEF_DISP_WIN_TOP_OFFSET_HANDLE.set(segment, 0L, def_disp_win_top_offset);
    	return this;
    }
    
    public short def_disp_win_top_offset() {
    	return (short) DEF_DISP_WIN_TOP_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #def_disp_win_bottom_offset()
    public StdVideoH265SequenceParameterSetVui def_disp_win_bottom_offset(short def_disp_win_bottom_offset) {
    	DEF_DISP_WIN_BOTTOM_OFFSET_HANDLE.set(segment, 0L, def_disp_win_bottom_offset);
    	return this;
    }
    
    public short def_disp_win_bottom_offset() {
    	return (short) DEF_DISP_WIN_BOTTOM_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #vui_num_units_in_tick()
    public StdVideoH265SequenceParameterSetVui vui_num_units_in_tick(int vui_num_units_in_tick) {
    	VUI_NUM_UNITS_IN_TICK_HANDLE.set(segment, 0L, vui_num_units_in_tick);
    	return this;
    }
    
    public int vui_num_units_in_tick() {
    	return (int) VUI_NUM_UNITS_IN_TICK_HANDLE.get(segment, 0L);
    }
    
    /// @see #vui_time_scale()
    public StdVideoH265SequenceParameterSetVui vui_time_scale(int vui_time_scale) {
    	VUI_TIME_SCALE_HANDLE.set(segment, 0L, vui_time_scale);
    	return this;
    }
    
    public int vui_time_scale() {
    	return (int) VUI_TIME_SCALE_HANDLE.get(segment, 0L);
    }
    
    /// @see #vui_num_ticks_poc_diff_one_minus1()
    public StdVideoH265SequenceParameterSetVui vui_num_ticks_poc_diff_one_minus1(int vui_num_ticks_poc_diff_one_minus1) {
    	VUI_NUM_TICKS_POC_DIFF_ONE_MINUS1_HANDLE.set(segment, 0L, vui_num_ticks_poc_diff_one_minus1);
    	return this;
    }
    
    public int vui_num_ticks_poc_diff_one_minus1() {
    	return (int) VUI_NUM_TICKS_POC_DIFF_ONE_MINUS1_HANDLE.get(segment, 0L);
    }
    
    /// @see #min_spatial_segmentation_idc()
    public StdVideoH265SequenceParameterSetVui min_spatial_segmentation_idc(short min_spatial_segmentation_idc) {
    	MIN_SPATIAL_SEGMENTATION_IDC_HANDLE.set(segment, 0L, min_spatial_segmentation_idc);
    	return this;
    }
    
    public short min_spatial_segmentation_idc() {
    	return (short) MIN_SPATIAL_SEGMENTATION_IDC_HANDLE.get(segment, 0L);
    }
    
    /// @see #reserved3()
    public StdVideoH265SequenceParameterSetVui reserved3(short reserved3) {
    	RESERVED3_HANDLE.set(segment, 0L, reserved3);
    	return this;
    }
    
    public short reserved3() {
    	return (short) RESERVED3_HANDLE.get(segment, 0L);
    }
    
    /// @see #max_bytes_per_pic_denom()
    public StdVideoH265SequenceParameterSetVui max_bytes_per_pic_denom(byte max_bytes_per_pic_denom) {
    	MAX_BYTES_PER_PIC_DENOM_HANDLE.set(segment, 0L, max_bytes_per_pic_denom);
    	return this;
    }
    
    public byte max_bytes_per_pic_denom() {
    	return (byte) MAX_BYTES_PER_PIC_DENOM_HANDLE.get(segment, 0L);
    }
    
    /// @see #max_bits_per_min_cu_denom()
    public StdVideoH265SequenceParameterSetVui max_bits_per_min_cu_denom(byte max_bits_per_min_cu_denom) {
    	MAX_BITS_PER_MIN_CU_DENOM_HANDLE.set(segment, 0L, max_bits_per_min_cu_denom);
    	return this;
    }
    
    public byte max_bits_per_min_cu_denom() {
    	return (byte) MAX_BITS_PER_MIN_CU_DENOM_HANDLE.get(segment, 0L);
    }
    
    /// @see #log2_max_mv_length_horizontal()
    public StdVideoH265SequenceParameterSetVui log2_max_mv_length_horizontal(byte log2_max_mv_length_horizontal) {
    	LOG2_MAX_MV_LENGTH_HORIZONTAL_HANDLE.set(segment, 0L, log2_max_mv_length_horizontal);
    	return this;
    }
    
    public byte log2_max_mv_length_horizontal() {
    	return (byte) LOG2_MAX_MV_LENGTH_HORIZONTAL_HANDLE.get(segment, 0L);
    }
    
    /// @see #log2_max_mv_length_vertical()
    public StdVideoH265SequenceParameterSetVui log2_max_mv_length_vertical(byte log2_max_mv_length_vertical) {
    	LOG2_MAX_MV_LENGTH_VERTICAL_HANDLE.set(segment, 0L, log2_max_mv_length_vertical);
    	return this;
    }
    
    public byte log2_max_mv_length_vertical() {
    	return (byte) LOG2_MAX_MV_LENGTH_VERTICAL_HANDLE.get(segment, 0L);
    }
    
    /// @see #pHrdParameters()
    public StdVideoH265SequenceParameterSetVui pHrdParameters(StdVideoH265HrdParameters pHrdParameters) {
    	P_HRD_PARAMETERS_HANDLE.set(segment, 0L, pHrdParameters.memorySegment());
    	return this;
    }
    
    public @Nullable StdVideoH265HrdParameters pHrdParameters() {
    	MemorySegment segment = (MemorySegment) P_HRD_PARAMETERS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new StdVideoH265HrdParameters(segment);
    }
    
    @Override
    public StdVideoH265SequenceParameterSetVui set(StdVideoH265SequenceParameterSetVui other) {
        return set(other.segment);
    }
    
    @Override
    public StdVideoH265SequenceParameterSetVui set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<StdVideoH265SequenceParameterSetVui> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<StdVideoH265SequenceParameterSetVui> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new StdVideoH265SequenceParameterSetVui(segment),
            count
        );
    }
    
    public static NativeStructArray<StdVideoH265SequenceParameterSetVui> array(SegmentAllocator allocator, StdVideoH265SequenceParameterSetVui... structs) {
        NativeStructArray<StdVideoH265SequenceParameterSetVui> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new StdVideoH265SequenceParameterSetVui(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<StdVideoH265SequenceParameterSetVui> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new StdVideoH265SequenceParameterSetVui(segment)
        );
    }

}