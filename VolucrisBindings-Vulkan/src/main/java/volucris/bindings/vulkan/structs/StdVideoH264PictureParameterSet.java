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

public final class StdVideoH264PictureParameterSet
		implements Struct<StdVideoH264PictureParameterSet> {

	public static final StructLayout LAYOUT;

	public static final VarHandle SEQ_PARAMETER_SET_ID_HANDLE;
	public static final VarHandle PIC_PARAMETER_SET_ID_HANDLE;
	public static final VarHandle NUM_REF_IDX_L0_DEFAULT_ACTIVE_MINUS1_HANDLE;
	public static final VarHandle NUM_REF_IDX_L1_DEFAULT_ACTIVE_MINUS1_HANDLE;
	public static final VarHandle WEIGHTED_BIPRED_IDC_HANDLE;
	public static final VarHandle PIC_INIT_QP_MINUS26_HANDLE;
	public static final VarHandle PIC_INIT_QS_MINUS26_HANDLE;
	public static final VarHandle CHROMA_QP_INDEX_OFFSET_HANDLE;
	public static final VarHandle SECOND_CHROMA_QP_INDEX_OFFSET_HANDLE;
	public static final VarHandle P_SCALING_LISTS_HANDLE;

	public static final long FLAGS_BYTE_OFFSET;
	public static final long SEQ_PARAMETER_SET_ID_BYTE_OFFSET;
	public static final long PIC_PARAMETER_SET_ID_BYTE_OFFSET;
	public static final long NUM_REF_IDX_L0_DEFAULT_ACTIVE_MINUS1_BYTE_OFFSET;
	public static final long NUM_REF_IDX_L1_DEFAULT_ACTIVE_MINUS1_BYTE_OFFSET;
	public static final long WEIGHTED_BIPRED_IDC_BYTE_OFFSET;
	public static final long PIC_INIT_QP_MINUS26_BYTE_OFFSET;
	public static final long PIC_INIT_QS_MINUS26_BYTE_OFFSET;
	public static final long CHROMA_QP_INDEX_OFFSET_BYTE_OFFSET;
	public static final long SECOND_CHROMA_QP_INDEX_OFFSET_BYTE_OFFSET;
	public static final long P_SCALING_LISTS_BYTE_OFFSET;

	private final MemorySegment segment;

	private final StdVideoH264PpsFlags flags;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    StdVideoH264PpsFlags.LAYOUT.withName("flags"),
		    JAVA_BYTE.withName("seq_parameter_set_id"),
		    JAVA_BYTE.withName("pic_parameter_set_id"),
		    JAVA_BYTE.withName("num_ref_idx_l0_default_active_minus1"),
		    JAVA_BYTE.withName("num_ref_idx_l1_default_active_minus1"),
		    JAVA_INT.withName("weighted_bipred_idc"),
		    JAVA_BYTE.withName("pic_init_qp_minus26"),
		    JAVA_BYTE.withName("pic_init_qs_minus26"),
		    JAVA_BYTE.withName("chroma_qp_index_offset"),
		    JAVA_BYTE.withName("second_chroma_qp_index_offset"),
		    UNBOUNDED_ADDRESS.withName("pScalingLists")
		).withName("StdVideoH264PictureParameterSet").withByteAlignment(8);
		
		SEQ_PARAMETER_SET_ID_HANDLE = LAYOUT.varHandle(PathElement.groupElement("seq_parameter_set_id"));
		PIC_PARAMETER_SET_ID_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pic_parameter_set_id"));
		NUM_REF_IDX_L0_DEFAULT_ACTIVE_MINUS1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("num_ref_idx_l0_default_active_minus1"));
		NUM_REF_IDX_L1_DEFAULT_ACTIVE_MINUS1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("num_ref_idx_l1_default_active_minus1"));
		WEIGHTED_BIPRED_IDC_HANDLE = LAYOUT.varHandle(PathElement.groupElement("weighted_bipred_idc"));
		PIC_INIT_QP_MINUS26_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pic_init_qp_minus26"));
		PIC_INIT_QS_MINUS26_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pic_init_qs_minus26"));
		CHROMA_QP_INDEX_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("chroma_qp_index_offset"));
		SECOND_CHROMA_QP_INDEX_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("second_chroma_qp_index_offset"));
		P_SCALING_LISTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pScalingLists"));
		
		FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
		SEQ_PARAMETER_SET_ID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("seq_parameter_set_id"));
		PIC_PARAMETER_SET_ID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pic_parameter_set_id"));
		NUM_REF_IDX_L0_DEFAULT_ACTIVE_MINUS1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("num_ref_idx_l0_default_active_minus1"));
		NUM_REF_IDX_L1_DEFAULT_ACTIVE_MINUS1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("num_ref_idx_l1_default_active_minus1"));
		WEIGHTED_BIPRED_IDC_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("weighted_bipred_idc"));
		PIC_INIT_QP_MINUS26_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pic_init_qp_minus26"));
		PIC_INIT_QS_MINUS26_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pic_init_qs_minus26"));
		CHROMA_QP_INDEX_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("chroma_qp_index_offset"));
		SECOND_CHROMA_QP_INDEX_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("second_chroma_qp_index_offset"));
		P_SCALING_LISTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pScalingLists"));
		//@formatter:on
	}

	public StdVideoH264PictureParameterSet() {
	    this(Arena.ofAuto());
	}
	
	public StdVideoH264PictureParameterSet(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public StdVideoH264PictureParameterSet(MemorySegment segment) {
	    this.segment = segment;
	
	    flags = new StdVideoH264PpsFlags(segment.asSlice(FLAGS_BYTE_OFFSET, StdVideoH264PpsFlags.LAYOUT));
	}

    /// @see #flags()
    public StdVideoH264PictureParameterSet flags(Consumer<StdVideoH264PpsFlags> consumer) {
    	consumer.accept(flags);
    	return this;
    }
    
    /// @see #flags()
    public StdVideoH264PictureParameterSet flags(StdVideoH264PpsFlags other) {
    	flags.set(other);
    	return this;
    }
    
    public StdVideoH264PpsFlags flags() {
    	return flags;
    }
    
    /// @see #seq_parameter_set_id()
    public StdVideoH264PictureParameterSet seq_parameter_set_id(byte seq_parameter_set_id) {
    	SEQ_PARAMETER_SET_ID_HANDLE.set(segment, 0L, seq_parameter_set_id);
    	return this;
    }
    
    public byte seq_parameter_set_id() {
    	return (byte) SEQ_PARAMETER_SET_ID_HANDLE.get(segment, 0L);
    }
    
    /// @see #pic_parameter_set_id()
    public StdVideoH264PictureParameterSet pic_parameter_set_id(byte pic_parameter_set_id) {
    	PIC_PARAMETER_SET_ID_HANDLE.set(segment, 0L, pic_parameter_set_id);
    	return this;
    }
    
    public byte pic_parameter_set_id() {
    	return (byte) PIC_PARAMETER_SET_ID_HANDLE.get(segment, 0L);
    }
    
    /// @see #num_ref_idx_l0_default_active_minus1()
    public StdVideoH264PictureParameterSet num_ref_idx_l0_default_active_minus1(byte num_ref_idx_l0_default_active_minus1) {
    	NUM_REF_IDX_L0_DEFAULT_ACTIVE_MINUS1_HANDLE.set(segment, 0L, num_ref_idx_l0_default_active_minus1);
    	return this;
    }
    
    public byte num_ref_idx_l0_default_active_minus1() {
    	return (byte) NUM_REF_IDX_L0_DEFAULT_ACTIVE_MINUS1_HANDLE.get(segment, 0L);
    }
    
    /// @see #num_ref_idx_l1_default_active_minus1()
    public StdVideoH264PictureParameterSet num_ref_idx_l1_default_active_minus1(byte num_ref_idx_l1_default_active_minus1) {
    	NUM_REF_IDX_L1_DEFAULT_ACTIVE_MINUS1_HANDLE.set(segment, 0L, num_ref_idx_l1_default_active_minus1);
    	return this;
    }
    
    public byte num_ref_idx_l1_default_active_minus1() {
    	return (byte) NUM_REF_IDX_L1_DEFAULT_ACTIVE_MINUS1_HANDLE.get(segment, 0L);
    }
    
    /// @see #weighted_bipred_idc()
    public StdVideoH264PictureParameterSet weighted_bipred_idc(int weighted_bipred_idc) {
    	WEIGHTED_BIPRED_IDC_HANDLE.set(segment, 0L, weighted_bipred_idc);
    	return this;
    }
    
    public int weighted_bipred_idc() {
    	return (int) WEIGHTED_BIPRED_IDC_HANDLE.get(segment, 0L);
    }
    
    /// @see #pic_init_qp_minus26()
    public StdVideoH264PictureParameterSet pic_init_qp_minus26(byte pic_init_qp_minus26) {
    	PIC_INIT_QP_MINUS26_HANDLE.set(segment, 0L, pic_init_qp_minus26);
    	return this;
    }
    
    public byte pic_init_qp_minus26() {
    	return (byte) PIC_INIT_QP_MINUS26_HANDLE.get(segment, 0L);
    }
    
    /// @see #pic_init_qs_minus26()
    public StdVideoH264PictureParameterSet pic_init_qs_minus26(byte pic_init_qs_minus26) {
    	PIC_INIT_QS_MINUS26_HANDLE.set(segment, 0L, pic_init_qs_minus26);
    	return this;
    }
    
    public byte pic_init_qs_minus26() {
    	return (byte) PIC_INIT_QS_MINUS26_HANDLE.get(segment, 0L);
    }
    
    /// @see #chroma_qp_index_offset()
    public StdVideoH264PictureParameterSet chroma_qp_index_offset(byte chroma_qp_index_offset) {
    	CHROMA_QP_INDEX_OFFSET_HANDLE.set(segment, 0L, chroma_qp_index_offset);
    	return this;
    }
    
    public byte chroma_qp_index_offset() {
    	return (byte) CHROMA_QP_INDEX_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #second_chroma_qp_index_offset()
    public StdVideoH264PictureParameterSet second_chroma_qp_index_offset(byte second_chroma_qp_index_offset) {
    	SECOND_CHROMA_QP_INDEX_OFFSET_HANDLE.set(segment, 0L, second_chroma_qp_index_offset);
    	return this;
    }
    
    public byte second_chroma_qp_index_offset() {
    	return (byte) SECOND_CHROMA_QP_INDEX_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #pScalingLists()
    public StdVideoH264PictureParameterSet pScalingLists(StdVideoH264ScalingLists pScalingLists) {
    	P_SCALING_LISTS_HANDLE.set(segment, 0L, pScalingLists.memorySegment());
    	return this;
    }
    
    public @Nullable StdVideoH264ScalingLists pScalingLists() {
    	MemorySegment segment = (MemorySegment) P_SCALING_LISTS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new StdVideoH264ScalingLists(segment);
    }
    
    @Override
    public StdVideoH264PictureParameterSet set(StdVideoH264PictureParameterSet other) {
        return set(other.segment);
    }
    
    @Override
    public StdVideoH264PictureParameterSet set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<StdVideoH264PictureParameterSet> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<StdVideoH264PictureParameterSet> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new StdVideoH264PictureParameterSet(segment),
            count
        );
    }
    
    public static NativeStructArray<StdVideoH264PictureParameterSet> array(SegmentAllocator allocator, StdVideoH264PictureParameterSet... structs) {
        NativeStructArray<StdVideoH264PictureParameterSet> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new StdVideoH264PictureParameterSet(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<StdVideoH264PictureParameterSet> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new StdVideoH264PictureParameterSet(segment)
        );
    }

}