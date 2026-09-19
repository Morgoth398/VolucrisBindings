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

public final class StdVideoDecodeVP9PictureInfo
		implements Struct<StdVideoDecodeVP9PictureInfo> {

    public static final StructLayout LAYOUT;

    public static final VarHandle PROFILE_HANDLE;
    public static final VarHandle FRAME_TYPE_HANDLE;
    public static final VarHandle FRAME_CONTEXT_IDX_HANDLE;
    public static final VarHandle RESET_FRAME_CONTEXT_HANDLE;
    public static final VarHandle REFRESH_FRAME_FLAGS_HANDLE;
    public static final VarHandle REF_FRAME_SIGN_BIAS_MASK_HANDLE;
    public static final VarHandle INTERPOLATION_FILTER_HANDLE;
    public static final VarHandle BASE_Q_IDX_HANDLE;
    public static final VarHandle DELTA_Q_Y_DC_HANDLE;
    public static final VarHandle DELTA_Q_UV_DC_HANDLE;
    public static final VarHandle DELTA_Q_UV_AC_HANDLE;
    public static final VarHandle TILE_COLS_LOG2_HANDLE;
    public static final VarHandle TILE_ROWS_LOG2_HANDLE;
    public static final VarHandle RESERVED1_HANDLE;
    public static final VarHandle P_COLOR_CONFIG_HANDLE;
    public static final VarHandle P_LOOP_FILTER_HANDLE;
    public static final VarHandle P_SEGMENTATION_HANDLE;

    public static final long FLAGS_BYTE_OFFSET;
    public static final long PROFILE_BYTE_OFFSET;
    public static final long FRAME_TYPE_BYTE_OFFSET;
    public static final long FRAME_CONTEXT_IDX_BYTE_OFFSET;
    public static final long RESET_FRAME_CONTEXT_BYTE_OFFSET;
    public static final long REFRESH_FRAME_FLAGS_BYTE_OFFSET;
    public static final long REF_FRAME_SIGN_BIAS_MASK_BYTE_OFFSET;
    public static final long INTERPOLATION_FILTER_BYTE_OFFSET;
    public static final long BASE_Q_IDX_BYTE_OFFSET;
    public static final long DELTA_Q_Y_DC_BYTE_OFFSET;
    public static final long DELTA_Q_UV_DC_BYTE_OFFSET;
    public static final long DELTA_Q_UV_AC_BYTE_OFFSET;
    public static final long TILE_COLS_LOG2_BYTE_OFFSET;
    public static final long TILE_ROWS_LOG2_BYTE_OFFSET;
    public static final long RESERVED1_BYTE_OFFSET;
    public static final long P_COLOR_CONFIG_BYTE_OFFSET;
    public static final long P_LOOP_FILTER_BYTE_OFFSET;
    public static final long P_SEGMENTATION_BYTE_OFFSET;

    private final MemorySegment segment;

    private final StdVideoDecodeVP9PictureInfoFlags flags;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            StdVideoDecodeVP9PictureInfoFlags.LAYOUT.withName("flags"),
            JAVA_INT.withName("profile"),
            JAVA_INT.withName("frame_type"),
            JAVA_BYTE.withName("frame_context_idx"),
            JAVA_BYTE.withName("reset_frame_context"),
            JAVA_BYTE.withName("refresh_frame_flags"),
            JAVA_BYTE.withName("ref_frame_sign_bias_mask"),
            JAVA_INT.withName("interpolation_filter"),
            JAVA_BYTE.withName("base_q_idx"),
            JAVA_BYTE.withName("delta_q_y_dc"),
            JAVA_BYTE.withName("delta_q_uv_dc"),
            JAVA_BYTE.withName("delta_q_uv_ac"),
            JAVA_BYTE.withName("tile_cols_log2"),
            JAVA_BYTE.withName("tile_rows_log2"),
            MemoryLayout.sequenceLayout(3, JAVA_SHORT).withName("reserved1"),
            UNBOUNDED_ADDRESS.withName("pColorConfig"),
            UNBOUNDED_ADDRESS.withName("pLoopFilter"),
            UNBOUNDED_ADDRESS.withName("pSegmentation")
        ).withName("StdVideoDecodeVP9PictureInfo").withByteAlignment(8);
        
        PROFILE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("profile"));
        FRAME_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("frame_type"));
        FRAME_CONTEXT_IDX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("frame_context_idx"));
        RESET_FRAME_CONTEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("reset_frame_context"));
        REFRESH_FRAME_FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("refresh_frame_flags"));
        REF_FRAME_SIGN_BIAS_MASK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("ref_frame_sign_bias_mask"));
        INTERPOLATION_FILTER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("interpolation_filter"));
        BASE_Q_IDX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("base_q_idx"));
        DELTA_Q_Y_DC_HANDLE = LAYOUT.varHandle(PathElement.groupElement("delta_q_y_dc"));
        DELTA_Q_UV_DC_HANDLE = LAYOUT.varHandle(PathElement.groupElement("delta_q_uv_dc"));
        DELTA_Q_UV_AC_HANDLE = LAYOUT.varHandle(PathElement.groupElement("delta_q_uv_ac"));
        TILE_COLS_LOG2_HANDLE = LAYOUT.varHandle(PathElement.groupElement("tile_cols_log2"));
        TILE_ROWS_LOG2_HANDLE = LAYOUT.varHandle(PathElement.groupElement("tile_rows_log2"));
        RESERVED1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("reserved1"), PathElement.sequenceElement());
        P_COLOR_CONFIG_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pColorConfig"));
        P_LOOP_FILTER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pLoopFilter"));
        P_SEGMENTATION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pSegmentation"));
        
        FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
        PROFILE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("profile"));
        FRAME_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("frame_type"));
        FRAME_CONTEXT_IDX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("frame_context_idx"));
        RESET_FRAME_CONTEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("reset_frame_context"));
        REFRESH_FRAME_FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("refresh_frame_flags"));
        REF_FRAME_SIGN_BIAS_MASK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("ref_frame_sign_bias_mask"));
        INTERPOLATION_FILTER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("interpolation_filter"));
        BASE_Q_IDX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("base_q_idx"));
        DELTA_Q_Y_DC_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("delta_q_y_dc"));
        DELTA_Q_UV_DC_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("delta_q_uv_dc"));
        DELTA_Q_UV_AC_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("delta_q_uv_ac"));
        TILE_COLS_LOG2_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("tile_cols_log2"));
        TILE_ROWS_LOG2_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("tile_rows_log2"));
        RESERVED1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("reserved1"));
        P_COLOR_CONFIG_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pColorConfig"));
        P_LOOP_FILTER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pLoopFilter"));
        P_SEGMENTATION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pSegmentation"));
        //@formatter:on
    }

    public StdVideoDecodeVP9PictureInfo() {
        this(Arena.ofAuto());
    }
    
    public StdVideoDecodeVP9PictureInfo(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public StdVideoDecodeVP9PictureInfo(MemorySegment segment) {
        this.segment = segment;
    
        flags = new StdVideoDecodeVP9PictureInfoFlags(segment.asSlice(FLAGS_BYTE_OFFSET, StdVideoDecodeVP9PictureInfoFlags.LAYOUT));
    }

    /// @see #profile()
    public StdVideoDecodeVP9PictureInfo profile(int profile) {
    	PROFILE_HANDLE.set(segment, 0L, profile);
    	return this;
    }
    
    public int profile() {
    	return (int) PROFILE_HANDLE.get(segment, 0L);
    }
    
    /// @see #frame_type()
    public StdVideoDecodeVP9PictureInfo frame_type(int frame_type) {
    	FRAME_TYPE_HANDLE.set(segment, 0L, frame_type);
    	return this;
    }
    
    public int frame_type() {
    	return (int) FRAME_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #frame_context_idx()
    public StdVideoDecodeVP9PictureInfo frame_context_idx(byte frame_context_idx) {
    	FRAME_CONTEXT_IDX_HANDLE.set(segment, 0L, frame_context_idx);
    	return this;
    }
    
    public byte frame_context_idx() {
    	return (byte) FRAME_CONTEXT_IDX_HANDLE.get(segment, 0L);
    }
    
    /// @see #reset_frame_context()
    public StdVideoDecodeVP9PictureInfo reset_frame_context(byte reset_frame_context) {
    	RESET_FRAME_CONTEXT_HANDLE.set(segment, 0L, reset_frame_context);
    	return this;
    }
    
    public byte reset_frame_context() {
    	return (byte) RESET_FRAME_CONTEXT_HANDLE.get(segment, 0L);
    }
    
    /// @see #refresh_frame_flags()
    public StdVideoDecodeVP9PictureInfo refresh_frame_flags(byte refresh_frame_flags) {
    	REFRESH_FRAME_FLAGS_HANDLE.set(segment, 0L, refresh_frame_flags);
    	return this;
    }
    
    public byte refresh_frame_flags() {
    	return (byte) REFRESH_FRAME_FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #ref_frame_sign_bias_mask()
    public StdVideoDecodeVP9PictureInfo ref_frame_sign_bias_mask(byte ref_frame_sign_bias_mask) {
    	REF_FRAME_SIGN_BIAS_MASK_HANDLE.set(segment, 0L, ref_frame_sign_bias_mask);
    	return this;
    }
    
    public byte ref_frame_sign_bias_mask() {
    	return (byte) REF_FRAME_SIGN_BIAS_MASK_HANDLE.get(segment, 0L);
    }
    
    /// @see #interpolation_filter()
    public StdVideoDecodeVP9PictureInfo interpolation_filter(int interpolation_filter) {
    	INTERPOLATION_FILTER_HANDLE.set(segment, 0L, interpolation_filter);
    	return this;
    }
    
    public int interpolation_filter() {
    	return (int) INTERPOLATION_FILTER_HANDLE.get(segment, 0L);
    }
    
    /// @see #base_q_idx()
    public StdVideoDecodeVP9PictureInfo base_q_idx(byte base_q_idx) {
    	BASE_Q_IDX_HANDLE.set(segment, 0L, base_q_idx);
    	return this;
    }
    
    public byte base_q_idx() {
    	return (byte) BASE_Q_IDX_HANDLE.get(segment, 0L);
    }
    
    /// @see #delta_q_y_dc()
    public StdVideoDecodeVP9PictureInfo delta_q_y_dc(byte delta_q_y_dc) {
    	DELTA_Q_Y_DC_HANDLE.set(segment, 0L, delta_q_y_dc);
    	return this;
    }
    
    public byte delta_q_y_dc() {
    	return (byte) DELTA_Q_Y_DC_HANDLE.get(segment, 0L);
    }
    
    /// @see #delta_q_uv_dc()
    public StdVideoDecodeVP9PictureInfo delta_q_uv_dc(byte delta_q_uv_dc) {
    	DELTA_Q_UV_DC_HANDLE.set(segment, 0L, delta_q_uv_dc);
    	return this;
    }
    
    public byte delta_q_uv_dc() {
    	return (byte) DELTA_Q_UV_DC_HANDLE.get(segment, 0L);
    }
    
    /// @see #delta_q_uv_ac()
    public StdVideoDecodeVP9PictureInfo delta_q_uv_ac(byte delta_q_uv_ac) {
    	DELTA_Q_UV_AC_HANDLE.set(segment, 0L, delta_q_uv_ac);
    	return this;
    }
    
    public byte delta_q_uv_ac() {
    	return (byte) DELTA_Q_UV_AC_HANDLE.get(segment, 0L);
    }
    
    /// @see #tile_cols_log2()
    public StdVideoDecodeVP9PictureInfo tile_cols_log2(byte tile_cols_log2) {
    	TILE_COLS_LOG2_HANDLE.set(segment, 0L, tile_cols_log2);
    	return this;
    }
    
    public byte tile_cols_log2() {
    	return (byte) TILE_COLS_LOG2_HANDLE.get(segment, 0L);
    }
    
    /// @see #tile_rows_log2()
    public StdVideoDecodeVP9PictureInfo tile_rows_log2(byte tile_rows_log2) {
    	TILE_ROWS_LOG2_HANDLE.set(segment, 0L, tile_rows_log2);
    	return this;
    }
    
    public byte tile_rows_log2() {
    	return (byte) TILE_ROWS_LOG2_HANDLE.get(segment, 0L);
    }
    
    /// @see #reserved1(int)
    public StdVideoDecodeVP9PictureInfo reserved1(short reserved1, int index0) {
    	RESERVED1_HANDLE.set(segment, 0L, index0, reserved1);
    	return this;
    }
    
    public short reserved1(int index0) {
    	return (short) RESERVED1_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #pColorConfig()
    public StdVideoDecodeVP9PictureInfo pColorConfig(StdVideoVP9ColorConfig pColorConfig) {
    	P_COLOR_CONFIG_HANDLE.set(segment, 0L, pColorConfig.memorySegment());
    	return this;
    }
    
    public @Nullable StdVideoVP9ColorConfig pColorConfig() {
    	MemorySegment segment = (MemorySegment) P_COLOR_CONFIG_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new StdVideoVP9ColorConfig(segment);
    }
    
    /// @see #pLoopFilter()
    public StdVideoDecodeVP9PictureInfo pLoopFilter(StdVideoVP9LoopFilter pLoopFilter) {
    	P_LOOP_FILTER_HANDLE.set(segment, 0L, pLoopFilter.memorySegment());
    	return this;
    }
    
    public @Nullable StdVideoVP9LoopFilter pLoopFilter() {
    	MemorySegment segment = (MemorySegment) P_LOOP_FILTER_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new StdVideoVP9LoopFilter(segment);
    }
    
    /// @see #pSegmentation()
    public StdVideoDecodeVP9PictureInfo pSegmentation(StdVideoVP9Segmentation pSegmentation) {
    	P_SEGMENTATION_HANDLE.set(segment, 0L, pSegmentation.memorySegment());
    	return this;
    }
    
    public @Nullable StdVideoVP9Segmentation pSegmentation() {
    	MemorySegment segment = (MemorySegment) P_SEGMENTATION_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new StdVideoVP9Segmentation(segment);
    }
    
    /// @see #flags()
    public StdVideoDecodeVP9PictureInfo flags(Consumer<StdVideoDecodeVP9PictureInfoFlags> consumer) {
    	consumer.accept(flags);
    	return this;
    }
    
    /// @see #flags()
    public StdVideoDecodeVP9PictureInfo flags(StdVideoDecodeVP9PictureInfoFlags other) {
    	flags.set(other);
    	return this;
    }
    
    public StdVideoDecodeVP9PictureInfoFlags flags() {
    	return flags;
    }
    
    @Override
    public StdVideoDecodeVP9PictureInfo set(StdVideoDecodeVP9PictureInfo other) {
        return set(other.segment);
    }
    
    @Override
    public StdVideoDecodeVP9PictureInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<StdVideoDecodeVP9PictureInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<StdVideoDecodeVP9PictureInfo> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new StdVideoDecodeVP9PictureInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<StdVideoDecodeVP9PictureInfo> array(Arena arena, StdVideoDecodeVP9PictureInfo... structs) {
        NativeStructArray<StdVideoDecodeVP9PictureInfo> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new StdVideoDecodeVP9PictureInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<StdVideoDecodeVP9PictureInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new StdVideoDecodeVP9PictureInfo(segment)
        );
    }
    
}