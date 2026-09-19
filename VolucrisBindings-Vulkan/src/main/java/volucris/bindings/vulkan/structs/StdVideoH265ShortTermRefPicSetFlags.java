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

public final class StdVideoH265ShortTermRefPicSetFlags
		implements Struct<StdVideoH265ShortTermRefPicSetFlags> {

    public static final StructLayout LAYOUT;

    public static final VarHandle BIT_FIELDS0_HANDLE;

    public static final long BIT_FIELDS0_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("bitFields0")
        ).withName("StdVideoH265ShortTermRefPicSetFlags").withByteAlignment(4);
        
        BIT_FIELDS0_HANDLE = LAYOUT.varHandle(PathElement.groupElement("bitFields0"));
        
        BIT_FIELDS0_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("bitFields0"));
        //@formatter:on
    }

    public StdVideoH265ShortTermRefPicSetFlags() {
        this(Arena.ofAuto());
    }
    
    public StdVideoH265ShortTermRefPicSetFlags(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public StdVideoH265ShortTermRefPicSetFlags(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #bitFields0()
    public StdVideoH265ShortTermRefPicSetFlags bitFields0(int bitFields0) {
    	BIT_FIELDS0_HANDLE.set(segment, 0L, bitFields0);
    	return this;
    }
    
    /// ```
    /// All bit fields contained in this field with their bit width:
    /// inter_ref_pic_set_prediction_flag : 1
    /// delta_rps_sign : 1
    /// ```
    public int bitFields0() {
    	return (int) BIT_FIELDS0_HANDLE.get(segment, 0L);
    }
    
    @Override
    public StdVideoH265ShortTermRefPicSetFlags set(StdVideoH265ShortTermRefPicSetFlags other) {
        return set(other.segment);
    }
    
    @Override
    public StdVideoH265ShortTermRefPicSetFlags set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<StdVideoH265ShortTermRefPicSetFlags> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<StdVideoH265ShortTermRefPicSetFlags> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new StdVideoH265ShortTermRefPicSetFlags(segment),
            count
        );
    }
    
    public static NativeStructArray<StdVideoH265ShortTermRefPicSetFlags> array(Arena arena, StdVideoH265ShortTermRefPicSetFlags... structs) {
        NativeStructArray<StdVideoH265ShortTermRefPicSetFlags> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new StdVideoH265ShortTermRefPicSetFlags(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<StdVideoH265ShortTermRefPicSetFlags> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new StdVideoH265ShortTermRefPicSetFlags(segment)
        );
    }
    
}