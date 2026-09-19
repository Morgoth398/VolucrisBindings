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

public final class StdVideoEncodeH265SliceSegmentHeader
		implements Struct<StdVideoEncodeH265SliceSegmentHeader> {

    public static final StructLayout LAYOUT;

    public static final VarHandle SLICE_TYPE_HANDLE;
    public static final VarHandle SLICE_SEGMENT_ADDRESS_HANDLE;
    public static final VarHandle COLLOCATED_REF_IDX_HANDLE;
    public static final VarHandle MAX_NUM_MERGE_CAND_HANDLE;
    public static final VarHandle SLICE_CB_QP_OFFSET_HANDLE;
    public static final VarHandle SLICE_CR_QP_OFFSET_HANDLE;
    public static final VarHandle SLICE_BETA_OFFSET_DIV2_HANDLE;
    public static final VarHandle SLICE_TC_OFFSET_DIV2_HANDLE;
    public static final VarHandle SLICE_ACT_Y_QP_OFFSET_HANDLE;
    public static final VarHandle SLICE_ACT_CB_QP_OFFSET_HANDLE;
    public static final VarHandle SLICE_ACT_CR_QP_OFFSET_HANDLE;
    public static final VarHandle SLICE_QP_DELTA_HANDLE;
    public static final VarHandle RESERVED1_HANDLE;
    public static final VarHandle P_WEIGHT_TABLE_HANDLE;

    public static final long FLAGS_BYTE_OFFSET;
    public static final long SLICE_TYPE_BYTE_OFFSET;
    public static final long SLICE_SEGMENT_ADDRESS_BYTE_OFFSET;
    public static final long COLLOCATED_REF_IDX_BYTE_OFFSET;
    public static final long MAX_NUM_MERGE_CAND_BYTE_OFFSET;
    public static final long SLICE_CB_QP_OFFSET_BYTE_OFFSET;
    public static final long SLICE_CR_QP_OFFSET_BYTE_OFFSET;
    public static final long SLICE_BETA_OFFSET_DIV2_BYTE_OFFSET;
    public static final long SLICE_TC_OFFSET_DIV2_BYTE_OFFSET;
    public static final long SLICE_ACT_Y_QP_OFFSET_BYTE_OFFSET;
    public static final long SLICE_ACT_CB_QP_OFFSET_BYTE_OFFSET;
    public static final long SLICE_ACT_CR_QP_OFFSET_BYTE_OFFSET;
    public static final long SLICE_QP_DELTA_BYTE_OFFSET;
    public static final long RESERVED1_BYTE_OFFSET;
    public static final long P_WEIGHT_TABLE_BYTE_OFFSET;

    private final MemorySegment segment;

    private final StdVideoEncodeH265SliceSegmentHeaderFlags flags;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            StdVideoEncodeH265SliceSegmentHeaderFlags.LAYOUT.withName("flags"),
            JAVA_INT.withName("slice_type"),
            JAVA_INT.withName("slice_segment_address"),
            JAVA_BYTE.withName("collocated_ref_idx"),
            JAVA_BYTE.withName("MaxNumMergeCand"),
            JAVA_BYTE.withName("slice_cb_qp_offset"),
            JAVA_BYTE.withName("slice_cr_qp_offset"),
            JAVA_BYTE.withName("slice_beta_offset_div2"),
            JAVA_BYTE.withName("slice_tc_offset_div2"),
            JAVA_BYTE.withName("slice_act_y_qp_offset"),
            JAVA_BYTE.withName("slice_act_cb_qp_offset"),
            JAVA_BYTE.withName("slice_act_cr_qp_offset"),
            JAVA_BYTE.withName("slice_qp_delta"),
            JAVA_SHORT.withName("reserved1"),
            UNBOUNDED_ADDRESS.withName("pWeightTable")
        ).withName("StdVideoEncodeH265SliceSegmentHeader").withByteAlignment(8);
        
        SLICE_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("slice_type"));
        SLICE_SEGMENT_ADDRESS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("slice_segment_address"));
        COLLOCATED_REF_IDX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("collocated_ref_idx"));
        MAX_NUM_MERGE_CAND_HANDLE = LAYOUT.varHandle(PathElement.groupElement("MaxNumMergeCand"));
        SLICE_CB_QP_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("slice_cb_qp_offset"));
        SLICE_CR_QP_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("slice_cr_qp_offset"));
        SLICE_BETA_OFFSET_DIV2_HANDLE = LAYOUT.varHandle(PathElement.groupElement("slice_beta_offset_div2"));
        SLICE_TC_OFFSET_DIV2_HANDLE = LAYOUT.varHandle(PathElement.groupElement("slice_tc_offset_div2"));
        SLICE_ACT_Y_QP_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("slice_act_y_qp_offset"));
        SLICE_ACT_CB_QP_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("slice_act_cb_qp_offset"));
        SLICE_ACT_CR_QP_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("slice_act_cr_qp_offset"));
        SLICE_QP_DELTA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("slice_qp_delta"));
        RESERVED1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("reserved1"));
        P_WEIGHT_TABLE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pWeightTable"));
        
        FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
        SLICE_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("slice_type"));
        SLICE_SEGMENT_ADDRESS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("slice_segment_address"));
        COLLOCATED_REF_IDX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("collocated_ref_idx"));
        MAX_NUM_MERGE_CAND_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("MaxNumMergeCand"));
        SLICE_CB_QP_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("slice_cb_qp_offset"));
        SLICE_CR_QP_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("slice_cr_qp_offset"));
        SLICE_BETA_OFFSET_DIV2_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("slice_beta_offset_div2"));
        SLICE_TC_OFFSET_DIV2_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("slice_tc_offset_div2"));
        SLICE_ACT_Y_QP_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("slice_act_y_qp_offset"));
        SLICE_ACT_CB_QP_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("slice_act_cb_qp_offset"));
        SLICE_ACT_CR_QP_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("slice_act_cr_qp_offset"));
        SLICE_QP_DELTA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("slice_qp_delta"));
        RESERVED1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("reserved1"));
        P_WEIGHT_TABLE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pWeightTable"));
        //@formatter:on
    }

    public StdVideoEncodeH265SliceSegmentHeader() {
        this(Arena.ofAuto());
    }
    
    public StdVideoEncodeH265SliceSegmentHeader(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public StdVideoEncodeH265SliceSegmentHeader(MemorySegment segment) {
        this.segment = segment;
    
        flags = new StdVideoEncodeH265SliceSegmentHeaderFlags(segment.asSlice(FLAGS_BYTE_OFFSET, StdVideoEncodeH265SliceSegmentHeaderFlags.LAYOUT));
    }

    /// @see #slice_type()
    public StdVideoEncodeH265SliceSegmentHeader slice_type(int slice_type) {
    	SLICE_TYPE_HANDLE.set(segment, 0L, slice_type);
    	return this;
    }
    
    public int slice_type() {
    	return (int) SLICE_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #slice_segment_address()
    public StdVideoEncodeH265SliceSegmentHeader slice_segment_address(int slice_segment_address) {
    	SLICE_SEGMENT_ADDRESS_HANDLE.set(segment, 0L, slice_segment_address);
    	return this;
    }
    
    public int slice_segment_address() {
    	return (int) SLICE_SEGMENT_ADDRESS_HANDLE.get(segment, 0L);
    }
    
    /// @see #collocated_ref_idx()
    public StdVideoEncodeH265SliceSegmentHeader collocated_ref_idx(byte collocated_ref_idx) {
    	COLLOCATED_REF_IDX_HANDLE.set(segment, 0L, collocated_ref_idx);
    	return this;
    }
    
    public byte collocated_ref_idx() {
    	return (byte) COLLOCATED_REF_IDX_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxNumMergeCand()
    public StdVideoEncodeH265SliceSegmentHeader maxNumMergeCand(byte maxNumMergeCand) {
    	MAX_NUM_MERGE_CAND_HANDLE.set(segment, 0L, maxNumMergeCand);
    	return this;
    }
    
    public byte maxNumMergeCand() {
    	return (byte) MAX_NUM_MERGE_CAND_HANDLE.get(segment, 0L);
    }
    
    /// @see #slice_cb_qp_offset()
    public StdVideoEncodeH265SliceSegmentHeader slice_cb_qp_offset(byte slice_cb_qp_offset) {
    	SLICE_CB_QP_OFFSET_HANDLE.set(segment, 0L, slice_cb_qp_offset);
    	return this;
    }
    
    public byte slice_cb_qp_offset() {
    	return (byte) SLICE_CB_QP_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #slice_cr_qp_offset()
    public StdVideoEncodeH265SliceSegmentHeader slice_cr_qp_offset(byte slice_cr_qp_offset) {
    	SLICE_CR_QP_OFFSET_HANDLE.set(segment, 0L, slice_cr_qp_offset);
    	return this;
    }
    
    public byte slice_cr_qp_offset() {
    	return (byte) SLICE_CR_QP_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #slice_beta_offset_div2()
    public StdVideoEncodeH265SliceSegmentHeader slice_beta_offset_div2(byte slice_beta_offset_div2) {
    	SLICE_BETA_OFFSET_DIV2_HANDLE.set(segment, 0L, slice_beta_offset_div2);
    	return this;
    }
    
    public byte slice_beta_offset_div2() {
    	return (byte) SLICE_BETA_OFFSET_DIV2_HANDLE.get(segment, 0L);
    }
    
    /// @see #slice_tc_offset_div2()
    public StdVideoEncodeH265SliceSegmentHeader slice_tc_offset_div2(byte slice_tc_offset_div2) {
    	SLICE_TC_OFFSET_DIV2_HANDLE.set(segment, 0L, slice_tc_offset_div2);
    	return this;
    }
    
    public byte slice_tc_offset_div2() {
    	return (byte) SLICE_TC_OFFSET_DIV2_HANDLE.get(segment, 0L);
    }
    
    /// @see #slice_act_y_qp_offset()
    public StdVideoEncodeH265SliceSegmentHeader slice_act_y_qp_offset(byte slice_act_y_qp_offset) {
    	SLICE_ACT_Y_QP_OFFSET_HANDLE.set(segment, 0L, slice_act_y_qp_offset);
    	return this;
    }
    
    public byte slice_act_y_qp_offset() {
    	return (byte) SLICE_ACT_Y_QP_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #slice_act_cb_qp_offset()
    public StdVideoEncodeH265SliceSegmentHeader slice_act_cb_qp_offset(byte slice_act_cb_qp_offset) {
    	SLICE_ACT_CB_QP_OFFSET_HANDLE.set(segment, 0L, slice_act_cb_qp_offset);
    	return this;
    }
    
    public byte slice_act_cb_qp_offset() {
    	return (byte) SLICE_ACT_CB_QP_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #slice_act_cr_qp_offset()
    public StdVideoEncodeH265SliceSegmentHeader slice_act_cr_qp_offset(byte slice_act_cr_qp_offset) {
    	SLICE_ACT_CR_QP_OFFSET_HANDLE.set(segment, 0L, slice_act_cr_qp_offset);
    	return this;
    }
    
    public byte slice_act_cr_qp_offset() {
    	return (byte) SLICE_ACT_CR_QP_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #slice_qp_delta()
    public StdVideoEncodeH265SliceSegmentHeader slice_qp_delta(byte slice_qp_delta) {
    	SLICE_QP_DELTA_HANDLE.set(segment, 0L, slice_qp_delta);
    	return this;
    }
    
    public byte slice_qp_delta() {
    	return (byte) SLICE_QP_DELTA_HANDLE.get(segment, 0L);
    }
    
    /// @see #reserved1()
    public StdVideoEncodeH265SliceSegmentHeader reserved1(short reserved1) {
    	RESERVED1_HANDLE.set(segment, 0L, reserved1);
    	return this;
    }
    
    public short reserved1() {
    	return (short) RESERVED1_HANDLE.get(segment, 0L);
    }
    
    /// @see #pWeightTable()
    public StdVideoEncodeH265SliceSegmentHeader pWeightTable(StdVideoEncodeH265WeightTable pWeightTable) {
    	P_WEIGHT_TABLE_HANDLE.set(segment, 0L, pWeightTable.memorySegment());
    	return this;
    }
    
    public @Nullable StdVideoEncodeH265WeightTable pWeightTable() {
    	MemorySegment segment = (MemorySegment) P_WEIGHT_TABLE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new StdVideoEncodeH265WeightTable(segment);
    }
    
    /// @see #flags()
    public StdVideoEncodeH265SliceSegmentHeader flags(Consumer<StdVideoEncodeH265SliceSegmentHeaderFlags> consumer) {
    	consumer.accept(flags);
    	return this;
    }
    
    /// @see #flags()
    public StdVideoEncodeH265SliceSegmentHeader flags(StdVideoEncodeH265SliceSegmentHeaderFlags other) {
    	flags.set(other);
    	return this;
    }
    
    public StdVideoEncodeH265SliceSegmentHeaderFlags flags() {
    	return flags;
    }
    
    @Override
    public StdVideoEncodeH265SliceSegmentHeader set(StdVideoEncodeH265SliceSegmentHeader other) {
        return set(other.segment);
    }
    
    @Override
    public StdVideoEncodeH265SliceSegmentHeader set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<StdVideoEncodeH265SliceSegmentHeader> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<StdVideoEncodeH265SliceSegmentHeader> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new StdVideoEncodeH265SliceSegmentHeader(segment),
            count
        );
    }
    
    public static NativeStructArray<StdVideoEncodeH265SliceSegmentHeader> array(Arena arena, StdVideoEncodeH265SliceSegmentHeader... structs) {
        NativeStructArray<StdVideoEncodeH265SliceSegmentHeader> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new StdVideoEncodeH265SliceSegmentHeader(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<StdVideoEncodeH265SliceSegmentHeader> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new StdVideoEncodeH265SliceSegmentHeader(segment)
        );
    }
    
}