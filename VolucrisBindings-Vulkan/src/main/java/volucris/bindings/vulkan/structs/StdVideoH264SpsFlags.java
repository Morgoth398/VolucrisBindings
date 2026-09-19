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

public final class StdVideoH264SpsFlags
		implements Struct<StdVideoH264SpsFlags> {

    public static final StructLayout LAYOUT;

    public static final VarHandle BIT_FIELDS0_HANDLE;

    public static final long BIT_FIELDS0_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("bitFields0")
        ).withName("StdVideoH264SpsFlags").withByteAlignment(4);
        
        BIT_FIELDS0_HANDLE = LAYOUT.varHandle(PathElement.groupElement("bitFields0"));
        
        BIT_FIELDS0_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("bitFields0"));
        //@formatter:on
    }

    public StdVideoH264SpsFlags() {
        this(Arena.ofAuto());
    }
    
    public StdVideoH264SpsFlags(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public StdVideoH264SpsFlags(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #bitFields0()
    public StdVideoH264SpsFlags bitFields0(int bitFields0) {
    	BIT_FIELDS0_HANDLE.set(segment, 0L, bitFields0);
    	return this;
    }
    
    /// ```
    /// All bit fields contained in this field with their bit width:
    /// constraint_set0_flag : 1
    /// constraint_set1_flag : 1
    /// constraint_set2_flag : 1
    /// constraint_set3_flag : 1
    /// constraint_set4_flag : 1
    /// constraint_set5_flag : 1
    /// direct_8x8_inference_flag : 1
    /// mb_adaptive_frame_field_flag : 1
    /// frame_mbs_only_flag : 1
    /// delta_pic_order_always_zero_flag : 1
    /// separate_colour_plane_flag : 1
    /// gaps_in_frame_num_value_allowed_flag : 1
    /// qpprime_y_zero_transform_bypass_flag : 1
    /// frame_cropping_flag : 1
    /// seq_scaling_matrix_present_flag : 1
    /// vui_parameters_present_flag : 1
    /// ```
    public int bitFields0() {
    	return (int) BIT_FIELDS0_HANDLE.get(segment, 0L);
    }
    
    @Override
    public StdVideoH264SpsFlags set(StdVideoH264SpsFlags other) {
        return set(other.segment);
    }
    
    @Override
    public StdVideoH264SpsFlags set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<StdVideoH264SpsFlags> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<StdVideoH264SpsFlags> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new StdVideoH264SpsFlags(segment),
            count
        );
    }
    
    public static NativeStructArray<StdVideoH264SpsFlags> array(Arena arena, StdVideoH264SpsFlags... structs) {
        NativeStructArray<StdVideoH264SpsFlags> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new StdVideoH264SpsFlags(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<StdVideoH264SpsFlags> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new StdVideoH264SpsFlags(segment)
        );
    }
    
}