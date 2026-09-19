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

public final class StdVideoEncodeH265SliceSegmentHeaderFlags
		implements Struct<StdVideoEncodeH265SliceSegmentHeaderFlags> {

    public static final StructLayout LAYOUT;

    public static final VarHandle BIT_FIELDS0_HANDLE;

    public static final long BIT_FIELDS0_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("bitFields0")
        ).withName("StdVideoEncodeH265SliceSegmentHeaderFlags").withByteAlignment(4);
        
        BIT_FIELDS0_HANDLE = LAYOUT.varHandle(PathElement.groupElement("bitFields0"));
        
        BIT_FIELDS0_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("bitFields0"));
        //@formatter:on
    }

    public StdVideoEncodeH265SliceSegmentHeaderFlags() {
        this(Arena.ofAuto());
    }
    
    public StdVideoEncodeH265SliceSegmentHeaderFlags(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public StdVideoEncodeH265SliceSegmentHeaderFlags(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #bitFields0()
    public StdVideoEncodeH265SliceSegmentHeaderFlags bitFields0(int bitFields0) {
    	BIT_FIELDS0_HANDLE.set(segment, 0L, bitFields0);
    	return this;
    }
    
    /// ```
    /// All bit fields contained in this field with their bit width:
    /// first_slice_segment_in_pic_flag : 1
    /// dependent_slice_segment_flag : 1
    /// slice_sao_luma_flag : 1
    /// slice_sao_chroma_flag : 1
    /// num_ref_idx_active_override_flag : 1
    /// mvd_l1_zero_flag : 1
    /// cabac_init_flag : 1
    /// cu_chroma_qp_offset_enabled_flag : 1
    /// deblocking_filter_override_flag : 1
    /// slice_deblocking_filter_disabled_flag : 1
    /// collocated_from_l0_flag : 1
    /// slice_loop_filter_across_slices_enabled_flag : 1
    /// reserved : 20
    /// ```
    public int bitFields0() {
    	return (int) BIT_FIELDS0_HANDLE.get(segment, 0L);
    }
    
    @Override
    public StdVideoEncodeH265SliceSegmentHeaderFlags set(StdVideoEncodeH265SliceSegmentHeaderFlags other) {
        return set(other.segment);
    }
    
    @Override
    public StdVideoEncodeH265SliceSegmentHeaderFlags set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<StdVideoEncodeH265SliceSegmentHeaderFlags> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<StdVideoEncodeH265SliceSegmentHeaderFlags> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new StdVideoEncodeH265SliceSegmentHeaderFlags(segment),
            count
        );
    }
    
    public static NativeStructArray<StdVideoEncodeH265SliceSegmentHeaderFlags> array(Arena arena, StdVideoEncodeH265SliceSegmentHeaderFlags... structs) {
        NativeStructArray<StdVideoEncodeH265SliceSegmentHeaderFlags> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new StdVideoEncodeH265SliceSegmentHeaderFlags(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<StdVideoEncodeH265SliceSegmentHeaderFlags> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new StdVideoEncodeH265SliceSegmentHeaderFlags(segment)
        );
    }
    
}