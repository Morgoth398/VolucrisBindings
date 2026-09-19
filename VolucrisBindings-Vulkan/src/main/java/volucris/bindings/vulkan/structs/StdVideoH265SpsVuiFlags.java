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

public final class StdVideoH265SpsVuiFlags
		implements Struct<StdVideoH265SpsVuiFlags> {

    public static final StructLayout LAYOUT;

    public static final VarHandle BIT_FIELDS0_HANDLE;

    public static final long BIT_FIELDS0_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("bitFields0")
        ).withName("StdVideoH265SpsVuiFlags").withByteAlignment(4);
        
        BIT_FIELDS0_HANDLE = LAYOUT.varHandle(PathElement.groupElement("bitFields0"));
        
        BIT_FIELDS0_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("bitFields0"));
        //@formatter:on
    }

    public StdVideoH265SpsVuiFlags() {
        this(Arena.ofAuto());
    }
    
    public StdVideoH265SpsVuiFlags(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public StdVideoH265SpsVuiFlags(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #bitFields0()
    public StdVideoH265SpsVuiFlags bitFields0(int bitFields0) {
    	BIT_FIELDS0_HANDLE.set(segment, 0L, bitFields0);
    	return this;
    }
    
    /// ```
    /// All bit fields contained in this field with their bit width:
    /// aspect_ratio_info_present_flag : 1
    /// overscan_info_present_flag : 1
    /// overscan_appropriate_flag : 1
    /// video_signal_type_present_flag : 1
    /// video_full_range_flag : 1
    /// colour_description_present_flag : 1
    /// chroma_loc_info_present_flag : 1
    /// neutral_chroma_indication_flag : 1
    /// field_seq_flag : 1
    /// frame_field_info_present_flag : 1
    /// default_display_window_flag : 1
    /// vui_timing_info_present_flag : 1
    /// vui_poc_proportional_to_timing_flag : 1
    /// vui_hrd_parameters_present_flag : 1
    /// bitstream_restriction_flag : 1
    /// tiles_fixed_structure_flag : 1
    /// motion_vectors_over_pic_boundaries_flag : 1
    /// restricted_ref_pic_lists_flag : 1
    /// ```
    public int bitFields0() {
    	return (int) BIT_FIELDS0_HANDLE.get(segment, 0L);
    }
    
    @Override
    public StdVideoH265SpsVuiFlags set(StdVideoH265SpsVuiFlags other) {
        return set(other.segment);
    }
    
    @Override
    public StdVideoH265SpsVuiFlags set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<StdVideoH265SpsVuiFlags> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<StdVideoH265SpsVuiFlags> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new StdVideoH265SpsVuiFlags(segment),
            count
        );
    }
    
    public static NativeStructArray<StdVideoH265SpsVuiFlags> array(Arena arena, StdVideoH265SpsVuiFlags... structs) {
        NativeStructArray<StdVideoH265SpsVuiFlags> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new StdVideoH265SpsVuiFlags(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<StdVideoH265SpsVuiFlags> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new StdVideoH265SpsVuiFlags(segment)
        );
    }
    
}