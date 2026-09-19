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

public final class StdVideoAV1SequenceHeader
		implements Struct<StdVideoAV1SequenceHeader> {

    public static final StructLayout LAYOUT;

    public static final VarHandle SEQ_PROFILE_HANDLE;
    public static final VarHandle FRAME_WIDTH_BITS_MINUS_1_HANDLE;
    public static final VarHandle FRAME_HEIGHT_BITS_MINUS_1_HANDLE;
    public static final VarHandle MAX_FRAME_WIDTH_MINUS_1_HANDLE;
    public static final VarHandle MAX_FRAME_HEIGHT_MINUS_1_HANDLE;
    public static final VarHandle DELTA_FRAME_ID_LENGTH_MINUS_2_HANDLE;
    public static final VarHandle ADDITIONAL_FRAME_ID_LENGTH_MINUS_1_HANDLE;
    public static final VarHandle ORDER_HINT_BITS_MINUS_1_HANDLE;
    public static final VarHandle SEQ_FORCE_INTEGER_MV_HANDLE;
    public static final VarHandle SEQ_FORCE_SCREEN_CONTENT_TOOLS_HANDLE;
    public static final VarHandle RESERVED1_HANDLE;
    public static final VarHandle P_COLOR_CONFIG_HANDLE;
    public static final VarHandle P_TIMING_INFO_HANDLE;

    public static final long FLAGS_BYTE_OFFSET;
    public static final long SEQ_PROFILE_BYTE_OFFSET;
    public static final long FRAME_WIDTH_BITS_MINUS_1_BYTE_OFFSET;
    public static final long FRAME_HEIGHT_BITS_MINUS_1_BYTE_OFFSET;
    public static final long MAX_FRAME_WIDTH_MINUS_1_BYTE_OFFSET;
    public static final long MAX_FRAME_HEIGHT_MINUS_1_BYTE_OFFSET;
    public static final long DELTA_FRAME_ID_LENGTH_MINUS_2_BYTE_OFFSET;
    public static final long ADDITIONAL_FRAME_ID_LENGTH_MINUS_1_BYTE_OFFSET;
    public static final long ORDER_HINT_BITS_MINUS_1_BYTE_OFFSET;
    public static final long SEQ_FORCE_INTEGER_MV_BYTE_OFFSET;
    public static final long SEQ_FORCE_SCREEN_CONTENT_TOOLS_BYTE_OFFSET;
    public static final long RESERVED1_BYTE_OFFSET;
    public static final long P_COLOR_CONFIG_BYTE_OFFSET;
    public static final long P_TIMING_INFO_BYTE_OFFSET;

    private final MemorySegment segment;

    private final StdVideoAV1SequenceHeaderFlags flags;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            StdVideoAV1SequenceHeaderFlags.LAYOUT.withName("flags"),
            JAVA_INT.withName("seq_profile"),
            JAVA_BYTE.withName("frame_width_bits_minus_1"),
            JAVA_BYTE.withName("frame_height_bits_minus_1"),
            JAVA_SHORT.withName("max_frame_width_minus_1"),
            JAVA_SHORT.withName("max_frame_height_minus_1"),
            JAVA_BYTE.withName("delta_frame_id_length_minus_2"),
            JAVA_BYTE.withName("additional_frame_id_length_minus_1"),
            JAVA_BYTE.withName("order_hint_bits_minus_1"),
            JAVA_BYTE.withName("seq_force_integer_mv"),
            JAVA_BYTE.withName("seq_force_screen_content_tools"),
            MemoryLayout.sequenceLayout(5, JAVA_BYTE).withName("reserved1"),
            UNBOUNDED_ADDRESS.withName("pColorConfig"),
            UNBOUNDED_ADDRESS.withName("pTimingInfo")
        ).withName("StdVideoAV1SequenceHeader").withByteAlignment(8);
        
        SEQ_PROFILE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("seq_profile"));
        FRAME_WIDTH_BITS_MINUS_1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("frame_width_bits_minus_1"));
        FRAME_HEIGHT_BITS_MINUS_1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("frame_height_bits_minus_1"));
        MAX_FRAME_WIDTH_MINUS_1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("max_frame_width_minus_1"));
        MAX_FRAME_HEIGHT_MINUS_1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("max_frame_height_minus_1"));
        DELTA_FRAME_ID_LENGTH_MINUS_2_HANDLE = LAYOUT.varHandle(PathElement.groupElement("delta_frame_id_length_minus_2"));
        ADDITIONAL_FRAME_ID_LENGTH_MINUS_1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("additional_frame_id_length_minus_1"));
        ORDER_HINT_BITS_MINUS_1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("order_hint_bits_minus_1"));
        SEQ_FORCE_INTEGER_MV_HANDLE = LAYOUT.varHandle(PathElement.groupElement("seq_force_integer_mv"));
        SEQ_FORCE_SCREEN_CONTENT_TOOLS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("seq_force_screen_content_tools"));
        RESERVED1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("reserved1"), PathElement.sequenceElement());
        P_COLOR_CONFIG_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pColorConfig"));
        P_TIMING_INFO_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pTimingInfo"));
        
        FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
        SEQ_PROFILE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("seq_profile"));
        FRAME_WIDTH_BITS_MINUS_1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("frame_width_bits_minus_1"));
        FRAME_HEIGHT_BITS_MINUS_1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("frame_height_bits_minus_1"));
        MAX_FRAME_WIDTH_MINUS_1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("max_frame_width_minus_1"));
        MAX_FRAME_HEIGHT_MINUS_1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("max_frame_height_minus_1"));
        DELTA_FRAME_ID_LENGTH_MINUS_2_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("delta_frame_id_length_minus_2"));
        ADDITIONAL_FRAME_ID_LENGTH_MINUS_1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("additional_frame_id_length_minus_1"));
        ORDER_HINT_BITS_MINUS_1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("order_hint_bits_minus_1"));
        SEQ_FORCE_INTEGER_MV_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("seq_force_integer_mv"));
        SEQ_FORCE_SCREEN_CONTENT_TOOLS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("seq_force_screen_content_tools"));
        RESERVED1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("reserved1"));
        P_COLOR_CONFIG_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pColorConfig"));
        P_TIMING_INFO_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pTimingInfo"));
        //@formatter:on
    }

    public StdVideoAV1SequenceHeader() {
        this(Arena.ofAuto());
    }
    
    public StdVideoAV1SequenceHeader(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public StdVideoAV1SequenceHeader(MemorySegment segment) {
        this.segment = segment;
    
        flags = new StdVideoAV1SequenceHeaderFlags(segment.asSlice(FLAGS_BYTE_OFFSET, StdVideoAV1SequenceHeaderFlags.LAYOUT));
    }

    /// @see #seq_profile()
    public StdVideoAV1SequenceHeader seq_profile(int seq_profile) {
    	SEQ_PROFILE_HANDLE.set(segment, 0L, seq_profile);
    	return this;
    }
    
    public int seq_profile() {
    	return (int) SEQ_PROFILE_HANDLE.get(segment, 0L);
    }
    
    /// @see #frame_width_bits_minus_1()
    public StdVideoAV1SequenceHeader frame_width_bits_minus_1(byte frame_width_bits_minus_1) {
    	FRAME_WIDTH_BITS_MINUS_1_HANDLE.set(segment, 0L, frame_width_bits_minus_1);
    	return this;
    }
    
    public byte frame_width_bits_minus_1() {
    	return (byte) FRAME_WIDTH_BITS_MINUS_1_HANDLE.get(segment, 0L);
    }
    
    /// @see #frame_height_bits_minus_1()
    public StdVideoAV1SequenceHeader frame_height_bits_minus_1(byte frame_height_bits_minus_1) {
    	FRAME_HEIGHT_BITS_MINUS_1_HANDLE.set(segment, 0L, frame_height_bits_minus_1);
    	return this;
    }
    
    public byte frame_height_bits_minus_1() {
    	return (byte) FRAME_HEIGHT_BITS_MINUS_1_HANDLE.get(segment, 0L);
    }
    
    /// @see #max_frame_width_minus_1()
    public StdVideoAV1SequenceHeader max_frame_width_minus_1(short max_frame_width_minus_1) {
    	MAX_FRAME_WIDTH_MINUS_1_HANDLE.set(segment, 0L, max_frame_width_minus_1);
    	return this;
    }
    
    public short max_frame_width_minus_1() {
    	return (short) MAX_FRAME_WIDTH_MINUS_1_HANDLE.get(segment, 0L);
    }
    
    /// @see #max_frame_height_minus_1()
    public StdVideoAV1SequenceHeader max_frame_height_minus_1(short max_frame_height_minus_1) {
    	MAX_FRAME_HEIGHT_MINUS_1_HANDLE.set(segment, 0L, max_frame_height_minus_1);
    	return this;
    }
    
    public short max_frame_height_minus_1() {
    	return (short) MAX_FRAME_HEIGHT_MINUS_1_HANDLE.get(segment, 0L);
    }
    
    /// @see #delta_frame_id_length_minus_2()
    public StdVideoAV1SequenceHeader delta_frame_id_length_minus_2(byte delta_frame_id_length_minus_2) {
    	DELTA_FRAME_ID_LENGTH_MINUS_2_HANDLE.set(segment, 0L, delta_frame_id_length_minus_2);
    	return this;
    }
    
    public byte delta_frame_id_length_minus_2() {
    	return (byte) DELTA_FRAME_ID_LENGTH_MINUS_2_HANDLE.get(segment, 0L);
    }
    
    /// @see #additional_frame_id_length_minus_1()
    public StdVideoAV1SequenceHeader additional_frame_id_length_minus_1(byte additional_frame_id_length_minus_1) {
    	ADDITIONAL_FRAME_ID_LENGTH_MINUS_1_HANDLE.set(segment, 0L, additional_frame_id_length_minus_1);
    	return this;
    }
    
    public byte additional_frame_id_length_minus_1() {
    	return (byte) ADDITIONAL_FRAME_ID_LENGTH_MINUS_1_HANDLE.get(segment, 0L);
    }
    
    /// @see #order_hint_bits_minus_1()
    public StdVideoAV1SequenceHeader order_hint_bits_minus_1(byte order_hint_bits_minus_1) {
    	ORDER_HINT_BITS_MINUS_1_HANDLE.set(segment, 0L, order_hint_bits_minus_1);
    	return this;
    }
    
    public byte order_hint_bits_minus_1() {
    	return (byte) ORDER_HINT_BITS_MINUS_1_HANDLE.get(segment, 0L);
    }
    
    /// @see #seq_force_integer_mv()
    public StdVideoAV1SequenceHeader seq_force_integer_mv(byte seq_force_integer_mv) {
    	SEQ_FORCE_INTEGER_MV_HANDLE.set(segment, 0L, seq_force_integer_mv);
    	return this;
    }
    
    public byte seq_force_integer_mv() {
    	return (byte) SEQ_FORCE_INTEGER_MV_HANDLE.get(segment, 0L);
    }
    
    /// @see #seq_force_screen_content_tools()
    public StdVideoAV1SequenceHeader seq_force_screen_content_tools(byte seq_force_screen_content_tools) {
    	SEQ_FORCE_SCREEN_CONTENT_TOOLS_HANDLE.set(segment, 0L, seq_force_screen_content_tools);
    	return this;
    }
    
    public byte seq_force_screen_content_tools() {
    	return (byte) SEQ_FORCE_SCREEN_CONTENT_TOOLS_HANDLE.get(segment, 0L);
    }
    
    /// @see #reserved1(int)
    public StdVideoAV1SequenceHeader reserved1(byte reserved1, int index0) {
    	RESERVED1_HANDLE.set(segment, 0L, index0, reserved1);
    	return this;
    }
    
    public byte reserved1(int index0) {
    	return (byte) RESERVED1_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #pColorConfig()
    public StdVideoAV1SequenceHeader pColorConfig(StdVideoAV1ColorConfig pColorConfig) {
    	P_COLOR_CONFIG_HANDLE.set(segment, 0L, pColorConfig.memorySegment());
    	return this;
    }
    
    public @Nullable StdVideoAV1ColorConfig pColorConfig() {
    	MemorySegment segment = (MemorySegment) P_COLOR_CONFIG_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new StdVideoAV1ColorConfig(segment);
    }
    
    /// @see #pTimingInfo()
    public StdVideoAV1SequenceHeader pTimingInfo(StdVideoAV1TimingInfo pTimingInfo) {
    	P_TIMING_INFO_HANDLE.set(segment, 0L, pTimingInfo.memorySegment());
    	return this;
    }
    
    public @Nullable StdVideoAV1TimingInfo pTimingInfo() {
    	MemorySegment segment = (MemorySegment) P_TIMING_INFO_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new StdVideoAV1TimingInfo(segment);
    }
    
    /// @see #flags()
    public StdVideoAV1SequenceHeader flags(Consumer<StdVideoAV1SequenceHeaderFlags> consumer) {
    	consumer.accept(flags);
    	return this;
    }
    
    /// @see #flags()
    public StdVideoAV1SequenceHeader flags(StdVideoAV1SequenceHeaderFlags other) {
    	flags.set(other);
    	return this;
    }
    
    public StdVideoAV1SequenceHeaderFlags flags() {
    	return flags;
    }
    
    @Override
    public StdVideoAV1SequenceHeader set(StdVideoAV1SequenceHeader other) {
        return set(other.segment);
    }
    
    @Override
    public StdVideoAV1SequenceHeader set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<StdVideoAV1SequenceHeader> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<StdVideoAV1SequenceHeader> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new StdVideoAV1SequenceHeader(segment),
            count
        );
    }
    
    public static NativeStructArray<StdVideoAV1SequenceHeader> array(Arena arena, StdVideoAV1SequenceHeader... structs) {
        NativeStructArray<StdVideoAV1SequenceHeader> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new StdVideoAV1SequenceHeader(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<StdVideoAV1SequenceHeader> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new StdVideoAV1SequenceHeader(segment)
        );
    }
    
}