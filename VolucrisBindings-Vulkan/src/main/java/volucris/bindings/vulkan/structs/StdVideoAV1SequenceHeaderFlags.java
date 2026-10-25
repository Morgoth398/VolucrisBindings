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
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;

public final class StdVideoAV1SequenceHeaderFlags
		implements Struct<StdVideoAV1SequenceHeaderFlags> {

	public static final StructLayout LAYOUT;

	public static final VarHandle BIT_FIELDS0_HANDLE;

	public static final long BIT_FIELDS0_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("bitFields0")
		).withName("StdVideoAV1SequenceHeaderFlags").withByteAlignment(4);
		
		BIT_FIELDS0_HANDLE = LAYOUT.varHandle(PathElement.groupElement("bitFields0"));
		
		BIT_FIELDS0_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("bitFields0"));
		//@formatter:on
	}

	public StdVideoAV1SequenceHeaderFlags() {
	    this(Arena.ofAuto());
	}
	
	public StdVideoAV1SequenceHeaderFlags(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public StdVideoAV1SequenceHeaderFlags(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #bitFields0()
    public StdVideoAV1SequenceHeaderFlags bitFields0(int bitFields0) {
    	BIT_FIELDS0_HANDLE.set(segment, 0L, bitFields0);
    	return this;
    }
    
    /// ```
    /// All bit fields contained in this field with their bit width:
    /// still_picture : 1
    /// reduced_still_picture_header : 1
    /// use_128x128_superblock : 1
    /// enable_filter_intra : 1
    /// enable_intra_edge_filter : 1
    /// enable_interintra_compound : 1
    /// enable_masked_compound : 1
    /// enable_warped_motion : 1
    /// enable_dual_filter : 1
    /// enable_order_hint : 1
    /// enable_jnt_comp : 1
    /// enable_ref_frame_mvs : 1
    /// frame_id_numbers_present_flag : 1
    /// enable_superres : 1
    /// enable_cdef : 1
    /// enable_restoration : 1
    /// film_grain_params_present : 1
    /// timing_info_present_flag : 1
    /// initial_display_delay_present_flag : 1
    /// reserved : 13
    /// ```
    public int bitFields0() {
    	return (int) BIT_FIELDS0_HANDLE.get(segment, 0L);
    }
    
    @Override
    public StdVideoAV1SequenceHeaderFlags set(StdVideoAV1SequenceHeaderFlags other) {
        return set(other.segment);
    }
    
    @Override
    public StdVideoAV1SequenceHeaderFlags set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<StdVideoAV1SequenceHeaderFlags> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<StdVideoAV1SequenceHeaderFlags> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new StdVideoAV1SequenceHeaderFlags(segment),
            count
        );
    }
    
    public static NativeStructArray<StdVideoAV1SequenceHeaderFlags> array(SegmentAllocator allocator, StdVideoAV1SequenceHeaderFlags... structs) {
        NativeStructArray<StdVideoAV1SequenceHeaderFlags> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new StdVideoAV1SequenceHeaderFlags(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<StdVideoAV1SequenceHeaderFlags> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new StdVideoAV1SequenceHeaderFlags(segment)
        );
    }

}