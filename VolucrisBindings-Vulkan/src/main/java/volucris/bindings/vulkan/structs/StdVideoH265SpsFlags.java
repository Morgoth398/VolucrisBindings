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

public final class StdVideoH265SpsFlags
		implements Struct<StdVideoH265SpsFlags> {

    public static final StructLayout LAYOUT;

    public static final VarHandle BIT_FIELDS0_HANDLE;

    public static final long BIT_FIELDS0_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("bitFields0")
        ).withName("StdVideoH265SpsFlags").withByteAlignment(4);
        
        BIT_FIELDS0_HANDLE = LAYOUT.varHandle(PathElement.groupElement("bitFields0"));
        
        BIT_FIELDS0_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("bitFields0"));
        //@formatter:on
    }

    public StdVideoH265SpsFlags() {
        this(Arena.ofAuto());
    }
    
    public StdVideoH265SpsFlags(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public StdVideoH265SpsFlags(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #bitFields0()
    public StdVideoH265SpsFlags bitFields0(int bitFields0) {
    	BIT_FIELDS0_HANDLE.set(segment, 0L, bitFields0);
    	return this;
    }
    
    /// ```
    /// All bit fields contained in this field with their bit width:
    /// sps_temporal_id_nesting_flag : 1
    /// separate_colour_plane_flag : 1
    /// conformance_window_flag : 1
    /// sps_sub_layer_ordering_info_present_flag : 1
    /// scaling_list_enabled_flag : 1
    /// sps_scaling_list_data_present_flag : 1
    /// amp_enabled_flag : 1
    /// sample_adaptive_offset_enabled_flag : 1
    /// pcm_enabled_flag : 1
    /// pcm_loop_filter_disabled_flag : 1
    /// long_term_ref_pics_present_flag : 1
    /// sps_temporal_mvp_enabled_flag : 1
    /// strong_intra_smoothing_enabled_flag : 1
    /// vui_parameters_present_flag : 1
    /// sps_extension_present_flag : 1
    /// sps_range_extension_flag : 1
    /// transform_skip_rotation_enabled_flag : 1
    /// transform_skip_context_enabled_flag : 1
    /// implicit_rdpcm_enabled_flag : 1
    /// explicit_rdpcm_enabled_flag : 1
    /// extended_precision_processing_flag : 1
    /// intra_smoothing_disabled_flag : 1
    /// high_precision_offsets_enabled_flag : 1
    /// persistent_rice_adaptation_enabled_flag : 1
    /// cabac_bypass_alignment_enabled_flag : 1
    /// sps_scc_extension_flag : 1
    /// sps_curr_pic_ref_enabled_flag : 1
    /// palette_mode_enabled_flag : 1
    /// sps_palette_predictor_initializers_present_flag : 1
    /// intra_boundary_filtering_disabled_flag : 1
    /// ```
    public int bitFields0() {
    	return (int) BIT_FIELDS0_HANDLE.get(segment, 0L);
    }
    
    @Override
    public StdVideoH265SpsFlags set(StdVideoH265SpsFlags other) {
        return set(other.segment);
    }
    
    @Override
    public StdVideoH265SpsFlags set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<StdVideoH265SpsFlags> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<StdVideoH265SpsFlags> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new StdVideoH265SpsFlags(segment),
            count
        );
    }
    
    public static NativeStructArray<StdVideoH265SpsFlags> array(Arena arena, StdVideoH265SpsFlags... structs) {
        NativeStructArray<StdVideoH265SpsFlags> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new StdVideoH265SpsFlags(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<StdVideoH265SpsFlags> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new StdVideoH265SpsFlags(segment)
        );
    }
    
}