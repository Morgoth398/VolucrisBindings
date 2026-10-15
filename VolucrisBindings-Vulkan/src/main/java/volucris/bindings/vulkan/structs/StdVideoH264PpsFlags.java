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

public final class StdVideoH264PpsFlags
		implements Struct<StdVideoH264PpsFlags> {

	public static final StructLayout LAYOUT;

	public static final VarHandle BIT_FIELDS0_HANDLE;

	public static final long BIT_FIELDS0_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("bitFields0")
		).withName("StdVideoH264PpsFlags").withByteAlignment(4);
		
		BIT_FIELDS0_HANDLE = LAYOUT.varHandle(PathElement.groupElement("bitFields0"));
		
		BIT_FIELDS0_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("bitFields0"));
		//@formatter:on
	}

	public StdVideoH264PpsFlags() {
	    this(Arena.ofAuto());
	}
	
	public StdVideoH264PpsFlags(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public StdVideoH264PpsFlags(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #bitFields0()
    public StdVideoH264PpsFlags bitFields0(int bitFields0) {
    	BIT_FIELDS0_HANDLE.set(segment, 0L, bitFields0);
    	return this;
    }
    
    /// ```
    /// All bit fields contained in this field with their bit width:
    /// transform_8x8_mode_flag : 1
    /// redundant_pic_cnt_present_flag : 1
    /// constrained_intra_pred_flag : 1
    /// deblocking_filter_control_present_flag : 1
    /// weighted_pred_flag : 1
    /// bottom_field_pic_order_in_frame_present_flag : 1
    /// entropy_coding_mode_flag : 1
    /// pic_scaling_matrix_present_flag : 1
    /// ```
    public int bitFields0() {
    	return (int) BIT_FIELDS0_HANDLE.get(segment, 0L);
    }
    
    @Override
    public StdVideoH264PpsFlags set(StdVideoH264PpsFlags other) {
        return set(other.segment);
    }
    
    @Override
    public StdVideoH264PpsFlags set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<StdVideoH264PpsFlags> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<StdVideoH264PpsFlags> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new StdVideoH264PpsFlags(segment),
            count
        );
    }
    
    public static NativeStructArray<StdVideoH264PpsFlags> array(Arena arena, StdVideoH264PpsFlags... structs) {
        NativeStructArray<StdVideoH264PpsFlags> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new StdVideoH264PpsFlags(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<StdVideoH264PpsFlags> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new StdVideoH264PpsFlags(segment)
        );
    }

}