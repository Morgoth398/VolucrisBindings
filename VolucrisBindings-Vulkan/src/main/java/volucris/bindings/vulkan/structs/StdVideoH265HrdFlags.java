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

public final class StdVideoH265HrdFlags
		implements Struct<StdVideoH265HrdFlags> {

    public static final StructLayout LAYOUT;

    public static final VarHandle BIT_FIELDS0_HANDLE;

    public static final long BIT_FIELDS0_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("bitFields0")
        ).withName("StdVideoH265HrdFlags").withByteAlignment(4);
        
        BIT_FIELDS0_HANDLE = LAYOUT.varHandle(PathElement.groupElement("bitFields0"));
        
        BIT_FIELDS0_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("bitFields0"));
        //@formatter:on
    }

    public StdVideoH265HrdFlags() {
        this(Arena.ofAuto());
    }
    
    public StdVideoH265HrdFlags(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public StdVideoH265HrdFlags(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #bitFields0()
    public StdVideoH265HrdFlags bitFields0(int bitFields0) {
    	BIT_FIELDS0_HANDLE.set(segment, 0L, bitFields0);
    	return this;
    }
    
    /// ```
    /// All bit fields contained in this field with their bit width:
    /// nal_hrd_parameters_present_flag : 1
    /// vcl_hrd_parameters_present_flag : 1
    /// sub_pic_hrd_params_present_flag : 1
    /// sub_pic_cpb_params_in_pic_timing_sei_flag : 1
    /// fixed_pic_rate_general_flag : 8
    /// fixed_pic_rate_within_cvs_flag : 8
    /// low_delay_hrd_flag : 8
    /// ```
    public int bitFields0() {
    	return (int) BIT_FIELDS0_HANDLE.get(segment, 0L);
    }
    
    @Override
    public StdVideoH265HrdFlags set(StdVideoH265HrdFlags other) {
        return set(other.segment);
    }
    
    @Override
    public StdVideoH265HrdFlags set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<StdVideoH265HrdFlags> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<StdVideoH265HrdFlags> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new StdVideoH265HrdFlags(segment),
            count
        );
    }
    
    public static NativeStructArray<StdVideoH265HrdFlags> array(Arena arena, StdVideoH265HrdFlags... structs) {
        NativeStructArray<StdVideoH265HrdFlags> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new StdVideoH265HrdFlags(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<StdVideoH265HrdFlags> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new StdVideoH265HrdFlags(segment)
        );
    }
    
}