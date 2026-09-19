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

public final class StdVideoH264SequenceParameterSetVui
		implements Struct<StdVideoH264SequenceParameterSetVui> {

    public static final StructLayout LAYOUT;

    public static final VarHandle ASPECT_RATIO_IDC_HANDLE;
    public static final VarHandle SAR_WIDTH_HANDLE;
    public static final VarHandle SAR_HEIGHT_HANDLE;
    public static final VarHandle VIDEO_FORMAT_HANDLE;
    public static final VarHandle COLOUR_PRIMARIES_HANDLE;
    public static final VarHandle TRANSFER_CHARACTERISTICS_HANDLE;
    public static final VarHandle MATRIX_COEFFICIENTS_HANDLE;
    public static final VarHandle NUM_UNITS_IN_TICK_HANDLE;
    public static final VarHandle TIME_SCALE_HANDLE;
    public static final VarHandle MAX_NUM_REORDER_FRAMES_HANDLE;
    public static final VarHandle MAX_DEC_FRAME_BUFFERING_HANDLE;
    public static final VarHandle CHROMA_SAMPLE_LOC_TYPE_TOP_FIELD_HANDLE;
    public static final VarHandle CHROMA_SAMPLE_LOC_TYPE_BOTTOM_FIELD_HANDLE;
    public static final VarHandle RESERVED1_HANDLE;
    public static final VarHandle P_HRD_PARAMETERS_HANDLE;

    public static final long FLAGS_BYTE_OFFSET;
    public static final long ASPECT_RATIO_IDC_BYTE_OFFSET;
    public static final long SAR_WIDTH_BYTE_OFFSET;
    public static final long SAR_HEIGHT_BYTE_OFFSET;
    public static final long VIDEO_FORMAT_BYTE_OFFSET;
    public static final long COLOUR_PRIMARIES_BYTE_OFFSET;
    public static final long TRANSFER_CHARACTERISTICS_BYTE_OFFSET;
    public static final long MATRIX_COEFFICIENTS_BYTE_OFFSET;
    public static final long NUM_UNITS_IN_TICK_BYTE_OFFSET;
    public static final long TIME_SCALE_BYTE_OFFSET;
    public static final long MAX_NUM_REORDER_FRAMES_BYTE_OFFSET;
    public static final long MAX_DEC_FRAME_BUFFERING_BYTE_OFFSET;
    public static final long CHROMA_SAMPLE_LOC_TYPE_TOP_FIELD_BYTE_OFFSET;
    public static final long CHROMA_SAMPLE_LOC_TYPE_BOTTOM_FIELD_BYTE_OFFSET;
    public static final long RESERVED1_BYTE_OFFSET;
    public static final long P_HRD_PARAMETERS_BYTE_OFFSET;

    private final MemorySegment segment;

    private final StdVideoH264SpsVuiFlags flags;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            StdVideoH264SpsVuiFlags.LAYOUT.withName("flags"),
            JAVA_INT.withName("aspect_ratio_idc"),
            JAVA_SHORT.withName("sar_width"),
            JAVA_SHORT.withName("sar_height"),
            JAVA_BYTE.withName("video_format"),
            JAVA_BYTE.withName("colour_primaries"),
            JAVA_BYTE.withName("transfer_characteristics"),
            JAVA_BYTE.withName("matrix_coefficients"),
            JAVA_INT.withName("num_units_in_tick"),
            JAVA_INT.withName("time_scale"),
            JAVA_BYTE.withName("max_num_reorder_frames"),
            JAVA_BYTE.withName("max_dec_frame_buffering"),
            JAVA_BYTE.withName("chroma_sample_loc_type_top_field"),
            JAVA_BYTE.withName("chroma_sample_loc_type_bottom_field"),
            JAVA_INT.withName("reserved1"),
            UNBOUNDED_ADDRESS.withName("pHrdParameters")
        ).withName("StdVideoH264SequenceParameterSetVui").withByteAlignment(8);
        
        ASPECT_RATIO_IDC_HANDLE = LAYOUT.varHandle(PathElement.groupElement("aspect_ratio_idc"));
        SAR_WIDTH_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sar_width"));
        SAR_HEIGHT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sar_height"));
        VIDEO_FORMAT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("video_format"));
        COLOUR_PRIMARIES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("colour_primaries"));
        TRANSFER_CHARACTERISTICS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("transfer_characteristics"));
        MATRIX_COEFFICIENTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("matrix_coefficients"));
        NUM_UNITS_IN_TICK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("num_units_in_tick"));
        TIME_SCALE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("time_scale"));
        MAX_NUM_REORDER_FRAMES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("max_num_reorder_frames"));
        MAX_DEC_FRAME_BUFFERING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("max_dec_frame_buffering"));
        CHROMA_SAMPLE_LOC_TYPE_TOP_FIELD_HANDLE = LAYOUT.varHandle(PathElement.groupElement("chroma_sample_loc_type_top_field"));
        CHROMA_SAMPLE_LOC_TYPE_BOTTOM_FIELD_HANDLE = LAYOUT.varHandle(PathElement.groupElement("chroma_sample_loc_type_bottom_field"));
        RESERVED1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("reserved1"));
        P_HRD_PARAMETERS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pHrdParameters"));
        
        FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
        ASPECT_RATIO_IDC_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("aspect_ratio_idc"));
        SAR_WIDTH_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sar_width"));
        SAR_HEIGHT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sar_height"));
        VIDEO_FORMAT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("video_format"));
        COLOUR_PRIMARIES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("colour_primaries"));
        TRANSFER_CHARACTERISTICS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("transfer_characteristics"));
        MATRIX_COEFFICIENTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("matrix_coefficients"));
        NUM_UNITS_IN_TICK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("num_units_in_tick"));
        TIME_SCALE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("time_scale"));
        MAX_NUM_REORDER_FRAMES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("max_num_reorder_frames"));
        MAX_DEC_FRAME_BUFFERING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("max_dec_frame_buffering"));
        CHROMA_SAMPLE_LOC_TYPE_TOP_FIELD_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("chroma_sample_loc_type_top_field"));
        CHROMA_SAMPLE_LOC_TYPE_BOTTOM_FIELD_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("chroma_sample_loc_type_bottom_field"));
        RESERVED1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("reserved1"));
        P_HRD_PARAMETERS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pHrdParameters"));
        //@formatter:on
    }

    public StdVideoH264SequenceParameterSetVui() {
        this(Arena.ofAuto());
    }
    
    public StdVideoH264SequenceParameterSetVui(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public StdVideoH264SequenceParameterSetVui(MemorySegment segment) {
        this.segment = segment;
    
        flags = new StdVideoH264SpsVuiFlags(segment.asSlice(FLAGS_BYTE_OFFSET, StdVideoH264SpsVuiFlags.LAYOUT));
    }

    /// @see #aspect_ratio_idc()
    public StdVideoH264SequenceParameterSetVui aspect_ratio_idc(int aspect_ratio_idc) {
    	ASPECT_RATIO_IDC_HANDLE.set(segment, 0L, aspect_ratio_idc);
    	return this;
    }
    
    public int aspect_ratio_idc() {
    	return (int) ASPECT_RATIO_IDC_HANDLE.get(segment, 0L);
    }
    
    /// @see #sar_width()
    public StdVideoH264SequenceParameterSetVui sar_width(short sar_width) {
    	SAR_WIDTH_HANDLE.set(segment, 0L, sar_width);
    	return this;
    }
    
    public short sar_width() {
    	return (short) SAR_WIDTH_HANDLE.get(segment, 0L);
    }
    
    /// @see #sar_height()
    public StdVideoH264SequenceParameterSetVui sar_height(short sar_height) {
    	SAR_HEIGHT_HANDLE.set(segment, 0L, sar_height);
    	return this;
    }
    
    public short sar_height() {
    	return (short) SAR_HEIGHT_HANDLE.get(segment, 0L);
    }
    
    /// @see #video_format()
    public StdVideoH264SequenceParameterSetVui video_format(byte video_format) {
    	VIDEO_FORMAT_HANDLE.set(segment, 0L, video_format);
    	return this;
    }
    
    public byte video_format() {
    	return (byte) VIDEO_FORMAT_HANDLE.get(segment, 0L);
    }
    
    /// @see #colour_primaries()
    public StdVideoH264SequenceParameterSetVui colour_primaries(byte colour_primaries) {
    	COLOUR_PRIMARIES_HANDLE.set(segment, 0L, colour_primaries);
    	return this;
    }
    
    public byte colour_primaries() {
    	return (byte) COLOUR_PRIMARIES_HANDLE.get(segment, 0L);
    }
    
    /// @see #transfer_characteristics()
    public StdVideoH264SequenceParameterSetVui transfer_characteristics(byte transfer_characteristics) {
    	TRANSFER_CHARACTERISTICS_HANDLE.set(segment, 0L, transfer_characteristics);
    	return this;
    }
    
    public byte transfer_characteristics() {
    	return (byte) TRANSFER_CHARACTERISTICS_HANDLE.get(segment, 0L);
    }
    
    /// @see #matrix_coefficients()
    public StdVideoH264SequenceParameterSetVui matrix_coefficients(byte matrix_coefficients) {
    	MATRIX_COEFFICIENTS_HANDLE.set(segment, 0L, matrix_coefficients);
    	return this;
    }
    
    public byte matrix_coefficients() {
    	return (byte) MATRIX_COEFFICIENTS_HANDLE.get(segment, 0L);
    }
    
    /// @see #num_units_in_tick()
    public StdVideoH264SequenceParameterSetVui num_units_in_tick(int num_units_in_tick) {
    	NUM_UNITS_IN_TICK_HANDLE.set(segment, 0L, num_units_in_tick);
    	return this;
    }
    
    public int num_units_in_tick() {
    	return (int) NUM_UNITS_IN_TICK_HANDLE.get(segment, 0L);
    }
    
    /// @see #time_scale()
    public StdVideoH264SequenceParameterSetVui time_scale(int time_scale) {
    	TIME_SCALE_HANDLE.set(segment, 0L, time_scale);
    	return this;
    }
    
    public int time_scale() {
    	return (int) TIME_SCALE_HANDLE.get(segment, 0L);
    }
    
    /// @see #max_num_reorder_frames()
    public StdVideoH264SequenceParameterSetVui max_num_reorder_frames(byte max_num_reorder_frames) {
    	MAX_NUM_REORDER_FRAMES_HANDLE.set(segment, 0L, max_num_reorder_frames);
    	return this;
    }
    
    public byte max_num_reorder_frames() {
    	return (byte) MAX_NUM_REORDER_FRAMES_HANDLE.get(segment, 0L);
    }
    
    /// @see #max_dec_frame_buffering()
    public StdVideoH264SequenceParameterSetVui max_dec_frame_buffering(byte max_dec_frame_buffering) {
    	MAX_DEC_FRAME_BUFFERING_HANDLE.set(segment, 0L, max_dec_frame_buffering);
    	return this;
    }
    
    public byte max_dec_frame_buffering() {
    	return (byte) MAX_DEC_FRAME_BUFFERING_HANDLE.get(segment, 0L);
    }
    
    /// @see #chroma_sample_loc_type_top_field()
    public StdVideoH264SequenceParameterSetVui chroma_sample_loc_type_top_field(byte chroma_sample_loc_type_top_field) {
    	CHROMA_SAMPLE_LOC_TYPE_TOP_FIELD_HANDLE.set(segment, 0L, chroma_sample_loc_type_top_field);
    	return this;
    }
    
    public byte chroma_sample_loc_type_top_field() {
    	return (byte) CHROMA_SAMPLE_LOC_TYPE_TOP_FIELD_HANDLE.get(segment, 0L);
    }
    
    /// @see #chroma_sample_loc_type_bottom_field()
    public StdVideoH264SequenceParameterSetVui chroma_sample_loc_type_bottom_field(byte chroma_sample_loc_type_bottom_field) {
    	CHROMA_SAMPLE_LOC_TYPE_BOTTOM_FIELD_HANDLE.set(segment, 0L, chroma_sample_loc_type_bottom_field);
    	return this;
    }
    
    public byte chroma_sample_loc_type_bottom_field() {
    	return (byte) CHROMA_SAMPLE_LOC_TYPE_BOTTOM_FIELD_HANDLE.get(segment, 0L);
    }
    
    /// @see #reserved1()
    public StdVideoH264SequenceParameterSetVui reserved1(int reserved1) {
    	RESERVED1_HANDLE.set(segment, 0L, reserved1);
    	return this;
    }
    
    public int reserved1() {
    	return (int) RESERVED1_HANDLE.get(segment, 0L);
    }
    
    /// @see #pHrdParameters()
    public StdVideoH264SequenceParameterSetVui pHrdParameters(StdVideoH264HrdParameters pHrdParameters) {
    	P_HRD_PARAMETERS_HANDLE.set(segment, 0L, pHrdParameters.memorySegment());
    	return this;
    }
    
    public @Nullable StdVideoH264HrdParameters pHrdParameters() {
    	MemorySegment segment = (MemorySegment) P_HRD_PARAMETERS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new StdVideoH264HrdParameters(segment);
    }
    
    /// @see #flags()
    public StdVideoH264SequenceParameterSetVui flags(Consumer<StdVideoH264SpsVuiFlags> consumer) {
    	consumer.accept(flags);
    	return this;
    }
    
    /// @see #flags()
    public StdVideoH264SequenceParameterSetVui flags(StdVideoH264SpsVuiFlags other) {
    	flags.set(other);
    	return this;
    }
    
    public StdVideoH264SpsVuiFlags flags() {
    	return flags;
    }
    
    @Override
    public StdVideoH264SequenceParameterSetVui set(StdVideoH264SequenceParameterSetVui other) {
        return set(other.segment);
    }
    
    @Override
    public StdVideoH264SequenceParameterSetVui set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<StdVideoH264SequenceParameterSetVui> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<StdVideoH264SequenceParameterSetVui> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new StdVideoH264SequenceParameterSetVui(segment),
            count
        );
    }
    
    public static NativeStructArray<StdVideoH264SequenceParameterSetVui> array(Arena arena, StdVideoH264SequenceParameterSetVui... structs) {
        NativeStructArray<StdVideoH264SequenceParameterSetVui> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new StdVideoH264SequenceParameterSetVui(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<StdVideoH264SequenceParameterSetVui> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new StdVideoH264SequenceParameterSetVui(segment)
        );
    }
    
}