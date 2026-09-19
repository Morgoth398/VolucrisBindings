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

public final class StdVideoEncodeAV1OperatingPointInfo
		implements Struct<StdVideoEncodeAV1OperatingPointInfo> {

    public static final StructLayout LAYOUT;

    public static final VarHandle OPERATING_POINT_IDC_HANDLE;
    public static final VarHandle SEQ_LEVEL_IDX_HANDLE;
    public static final VarHandle SEQ_TIER_HANDLE;
    public static final VarHandle DECODER_BUFFER_DELAY_HANDLE;
    public static final VarHandle ENCODER_BUFFER_DELAY_HANDLE;
    public static final VarHandle INITIAL_DISPLAY_DELAY_MINUS_1_HANDLE;

    public static final long FLAGS_BYTE_OFFSET;
    public static final long OPERATING_POINT_IDC_BYTE_OFFSET;
    public static final long SEQ_LEVEL_IDX_BYTE_OFFSET;
    public static final long SEQ_TIER_BYTE_OFFSET;
    public static final long DECODER_BUFFER_DELAY_BYTE_OFFSET;
    public static final long ENCODER_BUFFER_DELAY_BYTE_OFFSET;
    public static final long INITIAL_DISPLAY_DELAY_MINUS_1_BYTE_OFFSET;

    private final MemorySegment segment;

    private final StdVideoEncodeAV1OperatingPointInfoFlags flags;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            StdVideoEncodeAV1OperatingPointInfoFlags.LAYOUT.withName("flags"),
            JAVA_SHORT.withName("operating_point_idc"),
            JAVA_BYTE.withName("seq_level_idx"),
            JAVA_BYTE.withName("seq_tier"),
            JAVA_INT.withName("decoder_buffer_delay"),
            JAVA_INT.withName("encoder_buffer_delay"),
            JAVA_BYTE.withName("initial_display_delay_minus_1"),
            MemoryLayout.paddingLayout(3)
        ).withName("StdVideoEncodeAV1OperatingPointInfo").withByteAlignment(4);
        
        OPERATING_POINT_IDC_HANDLE = LAYOUT.varHandle(PathElement.groupElement("operating_point_idc"));
        SEQ_LEVEL_IDX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("seq_level_idx"));
        SEQ_TIER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("seq_tier"));
        DECODER_BUFFER_DELAY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("decoder_buffer_delay"));
        ENCODER_BUFFER_DELAY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("encoder_buffer_delay"));
        INITIAL_DISPLAY_DELAY_MINUS_1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("initial_display_delay_minus_1"));
        
        FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
        OPERATING_POINT_IDC_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("operating_point_idc"));
        SEQ_LEVEL_IDX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("seq_level_idx"));
        SEQ_TIER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("seq_tier"));
        DECODER_BUFFER_DELAY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("decoder_buffer_delay"));
        ENCODER_BUFFER_DELAY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("encoder_buffer_delay"));
        INITIAL_DISPLAY_DELAY_MINUS_1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("initial_display_delay_minus_1"));
        //@formatter:on
    }

    public StdVideoEncodeAV1OperatingPointInfo() {
        this(Arena.ofAuto());
    }
    
    public StdVideoEncodeAV1OperatingPointInfo(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public StdVideoEncodeAV1OperatingPointInfo(MemorySegment segment) {
        this.segment = segment;
    
        flags = new StdVideoEncodeAV1OperatingPointInfoFlags(segment.asSlice(FLAGS_BYTE_OFFSET, StdVideoEncodeAV1OperatingPointInfoFlags.LAYOUT));
    }

    /// @see #operating_point_idc()
    public StdVideoEncodeAV1OperatingPointInfo operating_point_idc(short operating_point_idc) {
    	OPERATING_POINT_IDC_HANDLE.set(segment, 0L, operating_point_idc);
    	return this;
    }
    
    public short operating_point_idc() {
    	return (short) OPERATING_POINT_IDC_HANDLE.get(segment, 0L);
    }
    
    /// @see #seq_level_idx()
    public StdVideoEncodeAV1OperatingPointInfo seq_level_idx(byte seq_level_idx) {
    	SEQ_LEVEL_IDX_HANDLE.set(segment, 0L, seq_level_idx);
    	return this;
    }
    
    public byte seq_level_idx() {
    	return (byte) SEQ_LEVEL_IDX_HANDLE.get(segment, 0L);
    }
    
    /// @see #seq_tier()
    public StdVideoEncodeAV1OperatingPointInfo seq_tier(byte seq_tier) {
    	SEQ_TIER_HANDLE.set(segment, 0L, seq_tier);
    	return this;
    }
    
    public byte seq_tier() {
    	return (byte) SEQ_TIER_HANDLE.get(segment, 0L);
    }
    
    /// @see #decoder_buffer_delay()
    public StdVideoEncodeAV1OperatingPointInfo decoder_buffer_delay(int decoder_buffer_delay) {
    	DECODER_BUFFER_DELAY_HANDLE.set(segment, 0L, decoder_buffer_delay);
    	return this;
    }
    
    public int decoder_buffer_delay() {
    	return (int) DECODER_BUFFER_DELAY_HANDLE.get(segment, 0L);
    }
    
    /// @see #encoder_buffer_delay()
    public StdVideoEncodeAV1OperatingPointInfo encoder_buffer_delay(int encoder_buffer_delay) {
    	ENCODER_BUFFER_DELAY_HANDLE.set(segment, 0L, encoder_buffer_delay);
    	return this;
    }
    
    public int encoder_buffer_delay() {
    	return (int) ENCODER_BUFFER_DELAY_HANDLE.get(segment, 0L);
    }
    
    /// @see #initial_display_delay_minus_1()
    public StdVideoEncodeAV1OperatingPointInfo initial_display_delay_minus_1(byte initial_display_delay_minus_1) {
    	INITIAL_DISPLAY_DELAY_MINUS_1_HANDLE.set(segment, 0L, initial_display_delay_minus_1);
    	return this;
    }
    
    public byte initial_display_delay_minus_1() {
    	return (byte) INITIAL_DISPLAY_DELAY_MINUS_1_HANDLE.get(segment, 0L);
    }
    
    /// @see #flags()
    public StdVideoEncodeAV1OperatingPointInfo flags(Consumer<StdVideoEncodeAV1OperatingPointInfoFlags> consumer) {
    	consumer.accept(flags);
    	return this;
    }
    
    /// @see #flags()
    public StdVideoEncodeAV1OperatingPointInfo flags(StdVideoEncodeAV1OperatingPointInfoFlags other) {
    	flags.set(other);
    	return this;
    }
    
    public StdVideoEncodeAV1OperatingPointInfoFlags flags() {
    	return flags;
    }
    
    @Override
    public StdVideoEncodeAV1OperatingPointInfo set(StdVideoEncodeAV1OperatingPointInfo other) {
        return set(other.segment);
    }
    
    @Override
    public StdVideoEncodeAV1OperatingPointInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<StdVideoEncodeAV1OperatingPointInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<StdVideoEncodeAV1OperatingPointInfo> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new StdVideoEncodeAV1OperatingPointInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<StdVideoEncodeAV1OperatingPointInfo> array(Arena arena, StdVideoEncodeAV1OperatingPointInfo... structs) {
        NativeStructArray<StdVideoEncodeAV1OperatingPointInfo> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new StdVideoEncodeAV1OperatingPointInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<StdVideoEncodeAV1OperatingPointInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new StdVideoEncodeAV1OperatingPointInfo(segment)
        );
    }
    
}