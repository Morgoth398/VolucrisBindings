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

public final class StdVideoDecodeAV1PictureInfoFlags
		implements Struct<StdVideoDecodeAV1PictureInfoFlags> {

    public static final StructLayout LAYOUT;

    public static final VarHandle BIT_FIELDS0_HANDLE;

    public static final long BIT_FIELDS0_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("bitFields0")
        ).withName("StdVideoDecodeAV1PictureInfoFlags").withByteAlignment(4);
        
        BIT_FIELDS0_HANDLE = LAYOUT.varHandle(PathElement.groupElement("bitFields0"));
        
        BIT_FIELDS0_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("bitFields0"));
        //@formatter:on
    }

    public StdVideoDecodeAV1PictureInfoFlags() {
        this(Arena.ofAuto());
    }
    
    public StdVideoDecodeAV1PictureInfoFlags(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public StdVideoDecodeAV1PictureInfoFlags(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #bitFields0()
    public StdVideoDecodeAV1PictureInfoFlags bitFields0(int bitFields0) {
    	BIT_FIELDS0_HANDLE.set(segment, 0L, bitFields0);
    	return this;
    }
    
    /// ```
    /// All bit fields contained in this field with their bit width:
    /// error_resilient_mode : 1
    /// disable_cdf_update : 1
    /// use_superres : 1
    /// render_and_frame_size_different : 1
    /// allow_screen_content_tools : 1
    /// is_filter_switchable : 1
    /// force_integer_mv : 1
    /// frame_size_override_flag : 1
    /// buffer_removal_time_present_flag : 1
    /// allow_intrabc : 1
    /// frame_refs_short_signaling : 1
    /// allow_high_precision_mv : 1
    /// is_motion_mode_switchable : 1
    /// use_ref_frame_mvs : 1
    /// disable_frame_end_update_cdf : 1
    /// allow_warped_motion : 1
    /// reduced_tx_set : 1
    /// reference_select : 1
    /// skip_mode_present : 1
    /// delta_q_present : 1
    /// delta_lf_present : 1
    /// delta_lf_multi : 1
    /// segmentation_enabled : 1
    /// segmentation_update_map : 1
    /// segmentation_temporal_update : 1
    /// segmentation_update_data : 1
    /// UsesLr : 1
    /// usesChromaLr : 1
    /// apply_grain : 1
    /// reserved : 3
    /// ```
    public int bitFields0() {
    	return (int) BIT_FIELDS0_HANDLE.get(segment, 0L);
    }
    
    @Override
    public StdVideoDecodeAV1PictureInfoFlags set(StdVideoDecodeAV1PictureInfoFlags other) {
        return set(other.segment);
    }
    
    @Override
    public StdVideoDecodeAV1PictureInfoFlags set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<StdVideoDecodeAV1PictureInfoFlags> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<StdVideoDecodeAV1PictureInfoFlags> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new StdVideoDecodeAV1PictureInfoFlags(segment),
            count
        );
    }
    
    public static NativeStructArray<StdVideoDecodeAV1PictureInfoFlags> array(Arena arena, StdVideoDecodeAV1PictureInfoFlags... structs) {
        NativeStructArray<StdVideoDecodeAV1PictureInfoFlags> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new StdVideoDecodeAV1PictureInfoFlags(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<StdVideoDecodeAV1PictureInfoFlags> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new StdVideoDecodeAV1PictureInfoFlags(segment)
        );
    }
    
}