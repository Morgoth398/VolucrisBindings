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

public final class StdVideoEncodeH264SliceHeader
		implements Struct<StdVideoEncodeH264SliceHeader> {

	public static final StructLayout LAYOUT;

	public static final VarHandle FIRST_MB_IN_SLICE_HANDLE;
	public static final VarHandle SLICE_TYPE_HANDLE;
	public static final VarHandle SLICE_ALPHA_C0_OFFSET_DIV2_HANDLE;
	public static final VarHandle SLICE_BETA_OFFSET_DIV2_HANDLE;
	public static final VarHandle SLICE_QP_DELTA_HANDLE;
	public static final VarHandle RESERVED1_HANDLE;
	public static final VarHandle CABAC_INIT_IDC_HANDLE;
	public static final VarHandle DISABLE_DEBLOCKING_FILTER_IDC_HANDLE;
	public static final VarHandle P_WEIGHT_TABLE_HANDLE;

	public static final long FLAGS_BYTE_OFFSET;
	public static final long FIRST_MB_IN_SLICE_BYTE_OFFSET;
	public static final long SLICE_TYPE_BYTE_OFFSET;
	public static final long SLICE_ALPHA_C0_OFFSET_DIV2_BYTE_OFFSET;
	public static final long SLICE_BETA_OFFSET_DIV2_BYTE_OFFSET;
	public static final long SLICE_QP_DELTA_BYTE_OFFSET;
	public static final long RESERVED1_BYTE_OFFSET;
	public static final long CABAC_INIT_IDC_BYTE_OFFSET;
	public static final long DISABLE_DEBLOCKING_FILTER_IDC_BYTE_OFFSET;
	public static final long P_WEIGHT_TABLE_BYTE_OFFSET;

	private final MemorySegment segment;

	private final StdVideoEncodeH264SliceHeaderFlags flags;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    StdVideoEncodeH264SliceHeaderFlags.LAYOUT.withName("flags"),
		    JAVA_INT.withName("first_mb_in_slice"),
		    JAVA_INT.withName("slice_type"),
		    JAVA_BYTE.withName("slice_alpha_c0_offset_div2"),
		    JAVA_BYTE.withName("slice_beta_offset_div2"),
		    JAVA_BYTE.withName("slice_qp_delta"),
		    JAVA_BYTE.withName("reserved1"),
		    JAVA_INT.withName("cabac_init_idc"),
		    JAVA_INT.withName("disable_deblocking_filter_idc"),
		    UNBOUNDED_ADDRESS.withName("pWeightTable")
		).withName("StdVideoEncodeH264SliceHeader").withByteAlignment(8);
		
		FIRST_MB_IN_SLICE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("first_mb_in_slice"));
		SLICE_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("slice_type"));
		SLICE_ALPHA_C0_OFFSET_DIV2_HANDLE = LAYOUT.varHandle(PathElement.groupElement("slice_alpha_c0_offset_div2"));
		SLICE_BETA_OFFSET_DIV2_HANDLE = LAYOUT.varHandle(PathElement.groupElement("slice_beta_offset_div2"));
		SLICE_QP_DELTA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("slice_qp_delta"));
		RESERVED1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("reserved1"));
		CABAC_INIT_IDC_HANDLE = LAYOUT.varHandle(PathElement.groupElement("cabac_init_idc"));
		DISABLE_DEBLOCKING_FILTER_IDC_HANDLE = LAYOUT.varHandle(PathElement.groupElement("disable_deblocking_filter_idc"));
		P_WEIGHT_TABLE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pWeightTable"));
		
		FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
		FIRST_MB_IN_SLICE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("first_mb_in_slice"));
		SLICE_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("slice_type"));
		SLICE_ALPHA_C0_OFFSET_DIV2_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("slice_alpha_c0_offset_div2"));
		SLICE_BETA_OFFSET_DIV2_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("slice_beta_offset_div2"));
		SLICE_QP_DELTA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("slice_qp_delta"));
		RESERVED1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("reserved1"));
		CABAC_INIT_IDC_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("cabac_init_idc"));
		DISABLE_DEBLOCKING_FILTER_IDC_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("disable_deblocking_filter_idc"));
		P_WEIGHT_TABLE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pWeightTable"));
		//@formatter:on
	}

	public StdVideoEncodeH264SliceHeader() {
	    this(Arena.ofAuto());
	}
	
	public StdVideoEncodeH264SliceHeader(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public StdVideoEncodeH264SliceHeader(MemorySegment segment) {
	    this.segment = segment;
	
	    flags = new StdVideoEncodeH264SliceHeaderFlags(segment.asSlice(FLAGS_BYTE_OFFSET, StdVideoEncodeH264SliceHeaderFlags.LAYOUT));
	}

    /// @see #flags()
    public StdVideoEncodeH264SliceHeader flags(Consumer<StdVideoEncodeH264SliceHeaderFlags> consumer) {
    	consumer.accept(flags);
    	return this;
    }
    
    /// @see #flags()
    public StdVideoEncodeH264SliceHeader flags(StdVideoEncodeH264SliceHeaderFlags other) {
    	flags.set(other);
    	return this;
    }
    
    public StdVideoEncodeH264SliceHeaderFlags flags() {
    	return flags;
    }
    
    /// @see #first_mb_in_slice()
    public StdVideoEncodeH264SliceHeader first_mb_in_slice(int first_mb_in_slice) {
    	FIRST_MB_IN_SLICE_HANDLE.set(segment, 0L, first_mb_in_slice);
    	return this;
    }
    
    public int first_mb_in_slice() {
    	return (int) FIRST_MB_IN_SLICE_HANDLE.get(segment, 0L);
    }
    
    /// @see #slice_type()
    public StdVideoEncodeH264SliceHeader slice_type(int slice_type) {
    	SLICE_TYPE_HANDLE.set(segment, 0L, slice_type);
    	return this;
    }
    
    public int slice_type() {
    	return (int) SLICE_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #slice_alpha_c0_offset_div2()
    public StdVideoEncodeH264SliceHeader slice_alpha_c0_offset_div2(byte slice_alpha_c0_offset_div2) {
    	SLICE_ALPHA_C0_OFFSET_DIV2_HANDLE.set(segment, 0L, slice_alpha_c0_offset_div2);
    	return this;
    }
    
    public byte slice_alpha_c0_offset_div2() {
    	return (byte) SLICE_ALPHA_C0_OFFSET_DIV2_HANDLE.get(segment, 0L);
    }
    
    /// @see #slice_beta_offset_div2()
    public StdVideoEncodeH264SliceHeader slice_beta_offset_div2(byte slice_beta_offset_div2) {
    	SLICE_BETA_OFFSET_DIV2_HANDLE.set(segment, 0L, slice_beta_offset_div2);
    	return this;
    }
    
    public byte slice_beta_offset_div2() {
    	return (byte) SLICE_BETA_OFFSET_DIV2_HANDLE.get(segment, 0L);
    }
    
    /// @see #slice_qp_delta()
    public StdVideoEncodeH264SliceHeader slice_qp_delta(byte slice_qp_delta) {
    	SLICE_QP_DELTA_HANDLE.set(segment, 0L, slice_qp_delta);
    	return this;
    }
    
    public byte slice_qp_delta() {
    	return (byte) SLICE_QP_DELTA_HANDLE.get(segment, 0L);
    }
    
    /// @see #reserved1()
    public StdVideoEncodeH264SliceHeader reserved1(byte reserved1) {
    	RESERVED1_HANDLE.set(segment, 0L, reserved1);
    	return this;
    }
    
    public byte reserved1() {
    	return (byte) RESERVED1_HANDLE.get(segment, 0L);
    }
    
    /// @see #cabac_init_idc()
    public StdVideoEncodeH264SliceHeader cabac_init_idc(int cabac_init_idc) {
    	CABAC_INIT_IDC_HANDLE.set(segment, 0L, cabac_init_idc);
    	return this;
    }
    
    public int cabac_init_idc() {
    	return (int) CABAC_INIT_IDC_HANDLE.get(segment, 0L);
    }
    
    /// @see #disable_deblocking_filter_idc()
    public StdVideoEncodeH264SliceHeader disable_deblocking_filter_idc(int disable_deblocking_filter_idc) {
    	DISABLE_DEBLOCKING_FILTER_IDC_HANDLE.set(segment, 0L, disable_deblocking_filter_idc);
    	return this;
    }
    
    public int disable_deblocking_filter_idc() {
    	return (int) DISABLE_DEBLOCKING_FILTER_IDC_HANDLE.get(segment, 0L);
    }
    
    /// @see #pWeightTable()
    public StdVideoEncodeH264SliceHeader pWeightTable(StdVideoEncodeH264WeightTable pWeightTable) {
    	P_WEIGHT_TABLE_HANDLE.set(segment, 0L, pWeightTable.memorySegment());
    	return this;
    }
    
    public @Nullable StdVideoEncodeH264WeightTable pWeightTable() {
    	MemorySegment segment = (MemorySegment) P_WEIGHT_TABLE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new StdVideoEncodeH264WeightTable(segment);
    }
    
    @Override
    public StdVideoEncodeH264SliceHeader set(StdVideoEncodeH264SliceHeader other) {
        return set(other.segment);
    }
    
    @Override
    public StdVideoEncodeH264SliceHeader set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<StdVideoEncodeH264SliceHeader> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<StdVideoEncodeH264SliceHeader> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new StdVideoEncodeH264SliceHeader(segment),
            count
        );
    }
    
    public static NativeStructArray<StdVideoEncodeH264SliceHeader> array(Arena arena, StdVideoEncodeH264SliceHeader... structs) {
        NativeStructArray<StdVideoEncodeH264SliceHeader> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new StdVideoEncodeH264SliceHeader(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<StdVideoEncodeH264SliceHeader> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new StdVideoEncodeH264SliceHeader(segment)
        );
    }

}