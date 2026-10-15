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

public final class StdVideoH265PpsFlags
		implements Struct<StdVideoH265PpsFlags> {

	public static final StructLayout LAYOUT;

	public static final VarHandle BIT_FIELDS0_HANDLE;

	public static final long BIT_FIELDS0_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("bitFields0")
		).withName("StdVideoH265PpsFlags").withByteAlignment(4);
		
		BIT_FIELDS0_HANDLE = LAYOUT.varHandle(PathElement.groupElement("bitFields0"));
		
		BIT_FIELDS0_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("bitFields0"));
		//@formatter:on
	}

	public StdVideoH265PpsFlags() {
	    this(Arena.ofAuto());
	}
	
	public StdVideoH265PpsFlags(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public StdVideoH265PpsFlags(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #bitFields0()
    public StdVideoH265PpsFlags bitFields0(int bitFields0) {
    	BIT_FIELDS0_HANDLE.set(segment, 0L, bitFields0);
    	return this;
    }
    
    /// ```
    /// All bit fields contained in this field with their bit width:
    /// dependent_slice_segments_enabled_flag : 1
    /// output_flag_present_flag : 1
    /// sign_data_hiding_enabled_flag : 1
    /// cabac_init_present_flag : 1
    /// constrained_intra_pred_flag : 1
    /// transform_skip_enabled_flag : 1
    /// cu_qp_delta_enabled_flag : 1
    /// pps_slice_chroma_qp_offsets_present_flag : 1
    /// weighted_pred_flag : 1
    /// weighted_bipred_flag : 1
    /// transquant_bypass_enabled_flag : 1
    /// tiles_enabled_flag : 1
    /// entropy_coding_sync_enabled_flag : 1
    /// uniform_spacing_flag : 1
    /// loop_filter_across_tiles_enabled_flag : 1
    /// pps_loop_filter_across_slices_enabled_flag : 1
    /// deblocking_filter_control_present_flag : 1
    /// deblocking_filter_override_enabled_flag : 1
    /// pps_deblocking_filter_disabled_flag : 1
    /// pps_scaling_list_data_present_flag : 1
    /// lists_modification_present_flag : 1
    /// slice_segment_header_extension_present_flag : 1
    /// pps_extension_present_flag : 1
    /// cross_component_prediction_enabled_flag : 1
    /// chroma_qp_offset_list_enabled_flag : 1
    /// pps_curr_pic_ref_enabled_flag : 1
    /// residual_adaptive_colour_transform_enabled_flag : 1
    /// pps_slice_act_qp_offsets_present_flag : 1
    /// pps_palette_predictor_initializers_present_flag : 1
    /// monochrome_palette_flag : 1
    /// pps_range_extension_flag : 1
    /// ```
    public int bitFields0() {
    	return (int) BIT_FIELDS0_HANDLE.get(segment, 0L);
    }
    
    @Override
    public StdVideoH265PpsFlags set(StdVideoH265PpsFlags other) {
        return set(other.segment);
    }
    
    @Override
    public StdVideoH265PpsFlags set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<StdVideoH265PpsFlags> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<StdVideoH265PpsFlags> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new StdVideoH265PpsFlags(segment),
            count
        );
    }
    
    public static NativeStructArray<StdVideoH265PpsFlags> array(Arena arena, StdVideoH265PpsFlags... structs) {
        NativeStructArray<StdVideoH265PpsFlags> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new StdVideoH265PpsFlags(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<StdVideoH265PpsFlags> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new StdVideoH265PpsFlags(segment)
        );
    }

}