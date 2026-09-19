/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;

public final class StdVideoH264HrdParameters
		implements Struct<StdVideoH264HrdParameters> {

    public static final StructLayout LAYOUT;

    public static final VarHandle CPB_CNT_MINUS1_HANDLE;
    public static final VarHandle BIT_RATE_SCALE_HANDLE;
    public static final VarHandle CPB_SIZE_SCALE_HANDLE;
    public static final VarHandle RESERVED1_HANDLE;
    public static final VarHandle BIT_RATE_VALUE_MINUS1_HANDLE;
    public static final VarHandle CPB_SIZE_VALUE_MINUS1_HANDLE;
    public static final VarHandle CBR_FLAG_HANDLE;
    public static final VarHandle INITIAL_CPB_REMOVAL_DELAY_LENGTH_MINUS1_HANDLE;
    public static final VarHandle CPB_REMOVAL_DELAY_LENGTH_MINUS1_HANDLE;
    public static final VarHandle DPB_OUTPUT_DELAY_LENGTH_MINUS1_HANDLE;
    public static final VarHandle TIME_OFFSET_LENGTH_HANDLE;

    public static final long CPB_CNT_MINUS1_BYTE_OFFSET;
    public static final long BIT_RATE_SCALE_BYTE_OFFSET;
    public static final long CPB_SIZE_SCALE_BYTE_OFFSET;
    public static final long RESERVED1_BYTE_OFFSET;
    public static final long BIT_RATE_VALUE_MINUS1_BYTE_OFFSET;
    public static final long CPB_SIZE_VALUE_MINUS1_BYTE_OFFSET;
    public static final long CBR_FLAG_BYTE_OFFSET;
    public static final long INITIAL_CPB_REMOVAL_DELAY_LENGTH_MINUS1_BYTE_OFFSET;
    public static final long CPB_REMOVAL_DELAY_LENGTH_MINUS1_BYTE_OFFSET;
    public static final long DPB_OUTPUT_DELAY_LENGTH_MINUS1_BYTE_OFFSET;
    public static final long TIME_OFFSET_LENGTH_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_BYTE.withName("cpb_cnt_minus1"),
            JAVA_BYTE.withName("bit_rate_scale"),
            JAVA_BYTE.withName("cpb_size_scale"),
            JAVA_BYTE.withName("reserved1"),
            MemoryLayout.sequenceLayout(32, JAVA_INT).withName("bit_rate_value_minus1"),
            MemoryLayout.sequenceLayout(32, JAVA_INT).withName("cpb_size_value_minus1"),
            MemoryLayout.sequenceLayout(32, JAVA_BYTE).withName("cbr_flag"),
            JAVA_INT.withName("initial_cpb_removal_delay_length_minus1"),
            JAVA_INT.withName("cpb_removal_delay_length_minus1"),
            JAVA_INT.withName("dpb_output_delay_length_minus1"),
            JAVA_INT.withName("time_offset_length")
        ).withName("StdVideoH264HrdParameters").withByteAlignment(4);
        
        CPB_CNT_MINUS1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("cpb_cnt_minus1"));
        BIT_RATE_SCALE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("bit_rate_scale"));
        CPB_SIZE_SCALE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("cpb_size_scale"));
        RESERVED1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("reserved1"));
        BIT_RATE_VALUE_MINUS1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("bit_rate_value_minus1"), PathElement.sequenceElement());
        CPB_SIZE_VALUE_MINUS1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("cpb_size_value_minus1"), PathElement.sequenceElement());
        CBR_FLAG_HANDLE = LAYOUT.varHandle(PathElement.groupElement("cbr_flag"), PathElement.sequenceElement());
        INITIAL_CPB_REMOVAL_DELAY_LENGTH_MINUS1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("initial_cpb_removal_delay_length_minus1"));
        CPB_REMOVAL_DELAY_LENGTH_MINUS1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("cpb_removal_delay_length_minus1"));
        DPB_OUTPUT_DELAY_LENGTH_MINUS1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("dpb_output_delay_length_minus1"));
        TIME_OFFSET_LENGTH_HANDLE = LAYOUT.varHandle(PathElement.groupElement("time_offset_length"));
        
        CPB_CNT_MINUS1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("cpb_cnt_minus1"));
        BIT_RATE_SCALE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("bit_rate_scale"));
        CPB_SIZE_SCALE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("cpb_size_scale"));
        RESERVED1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("reserved1"));
        BIT_RATE_VALUE_MINUS1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("bit_rate_value_minus1"));
        CPB_SIZE_VALUE_MINUS1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("cpb_size_value_minus1"));
        CBR_FLAG_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("cbr_flag"));
        INITIAL_CPB_REMOVAL_DELAY_LENGTH_MINUS1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("initial_cpb_removal_delay_length_minus1"));
        CPB_REMOVAL_DELAY_LENGTH_MINUS1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("cpb_removal_delay_length_minus1"));
        DPB_OUTPUT_DELAY_LENGTH_MINUS1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dpb_output_delay_length_minus1"));
        TIME_OFFSET_LENGTH_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("time_offset_length"));
        //@formatter:on
    }

    public StdVideoH264HrdParameters() {
        this(Arena.ofAuto());
    }
    
    public StdVideoH264HrdParameters(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public StdVideoH264HrdParameters(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #cpb_cnt_minus1()
    public StdVideoH264HrdParameters cpb_cnt_minus1(byte cpb_cnt_minus1) {
    	CPB_CNT_MINUS1_HANDLE.set(segment, 0L, cpb_cnt_minus1);
    	return this;
    }
    
    public byte cpb_cnt_minus1() {
    	return (byte) CPB_CNT_MINUS1_HANDLE.get(segment, 0L);
    }
    
    /// @see #bit_rate_scale()
    public StdVideoH264HrdParameters bit_rate_scale(byte bit_rate_scale) {
    	BIT_RATE_SCALE_HANDLE.set(segment, 0L, bit_rate_scale);
    	return this;
    }
    
    public byte bit_rate_scale() {
    	return (byte) BIT_RATE_SCALE_HANDLE.get(segment, 0L);
    }
    
    /// @see #cpb_size_scale()
    public StdVideoH264HrdParameters cpb_size_scale(byte cpb_size_scale) {
    	CPB_SIZE_SCALE_HANDLE.set(segment, 0L, cpb_size_scale);
    	return this;
    }
    
    public byte cpb_size_scale() {
    	return (byte) CPB_SIZE_SCALE_HANDLE.get(segment, 0L);
    }
    
    /// @see #reserved1()
    public StdVideoH264HrdParameters reserved1(byte reserved1) {
    	RESERVED1_HANDLE.set(segment, 0L, reserved1);
    	return this;
    }
    
    public byte reserved1() {
    	return (byte) RESERVED1_HANDLE.get(segment, 0L);
    }
    
    /// @see #bit_rate_value_minus1(int)
    public StdVideoH264HrdParameters bit_rate_value_minus1(int bit_rate_value_minus1, int index0) {
    	BIT_RATE_VALUE_MINUS1_HANDLE.set(segment, 0L, index0, bit_rate_value_minus1);
    	return this;
    }
    
    public int bit_rate_value_minus1(int index0) {
    	return (int) BIT_RATE_VALUE_MINUS1_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #cpb_size_value_minus1(int)
    public StdVideoH264HrdParameters cpb_size_value_minus1(int cpb_size_value_minus1, int index0) {
    	CPB_SIZE_VALUE_MINUS1_HANDLE.set(segment, 0L, index0, cpb_size_value_minus1);
    	return this;
    }
    
    public int cpb_size_value_minus1(int index0) {
    	return (int) CPB_SIZE_VALUE_MINUS1_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #cbr_flag(int)
    public StdVideoH264HrdParameters cbr_flag(byte cbr_flag, int index0) {
    	CBR_FLAG_HANDLE.set(segment, 0L, index0, cbr_flag);
    	return this;
    }
    
    public byte cbr_flag(int index0) {
    	return (byte) CBR_FLAG_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #initial_cpb_removal_delay_length_minus1()
    public StdVideoH264HrdParameters initial_cpb_removal_delay_length_minus1(int initial_cpb_removal_delay_length_minus1) {
    	INITIAL_CPB_REMOVAL_DELAY_LENGTH_MINUS1_HANDLE.set(segment, 0L, initial_cpb_removal_delay_length_minus1);
    	return this;
    }
    
    public int initial_cpb_removal_delay_length_minus1() {
    	return (int) INITIAL_CPB_REMOVAL_DELAY_LENGTH_MINUS1_HANDLE.get(segment, 0L);
    }
    
    /// @see #cpb_removal_delay_length_minus1()
    public StdVideoH264HrdParameters cpb_removal_delay_length_minus1(int cpb_removal_delay_length_minus1) {
    	CPB_REMOVAL_DELAY_LENGTH_MINUS1_HANDLE.set(segment, 0L, cpb_removal_delay_length_minus1);
    	return this;
    }
    
    public int cpb_removal_delay_length_minus1() {
    	return (int) CPB_REMOVAL_DELAY_LENGTH_MINUS1_HANDLE.get(segment, 0L);
    }
    
    /// @see #dpb_output_delay_length_minus1()
    public StdVideoH264HrdParameters dpb_output_delay_length_minus1(int dpb_output_delay_length_minus1) {
    	DPB_OUTPUT_DELAY_LENGTH_MINUS1_HANDLE.set(segment, 0L, dpb_output_delay_length_minus1);
    	return this;
    }
    
    public int dpb_output_delay_length_minus1() {
    	return (int) DPB_OUTPUT_DELAY_LENGTH_MINUS1_HANDLE.get(segment, 0L);
    }
    
    /// @see #time_offset_length()
    public StdVideoH264HrdParameters time_offset_length(int time_offset_length) {
    	TIME_OFFSET_LENGTH_HANDLE.set(segment, 0L, time_offset_length);
    	return this;
    }
    
    public int time_offset_length() {
    	return (int) TIME_OFFSET_LENGTH_HANDLE.get(segment, 0L);
    }
    
    @Override
    public StdVideoH264HrdParameters set(StdVideoH264HrdParameters other) {
        return set(other.segment);
    }
    
    @Override
    public StdVideoH264HrdParameters set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<StdVideoH264HrdParameters> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<StdVideoH264HrdParameters> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new StdVideoH264HrdParameters(segment),
            count
        );
    }
    
    public static NativeStructArray<StdVideoH264HrdParameters> array(Arena arena, StdVideoH264HrdParameters... structs) {
        NativeStructArray<StdVideoH264HrdParameters> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new StdVideoH264HrdParameters(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<StdVideoH264HrdParameters> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new StdVideoH264HrdParameters(segment)
        );
    }
    
}