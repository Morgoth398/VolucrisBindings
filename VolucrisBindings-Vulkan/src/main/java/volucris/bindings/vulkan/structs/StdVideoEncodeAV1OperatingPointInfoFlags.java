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

public final class StdVideoEncodeAV1OperatingPointInfoFlags
		implements Struct<StdVideoEncodeAV1OperatingPointInfoFlags> {

    public static final StructLayout LAYOUT;

    public static final VarHandle BIT_FIELDS0_HANDLE;

    public static final long BIT_FIELDS0_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("bitFields0")
        ).withName("StdVideoEncodeAV1OperatingPointInfoFlags").withByteAlignment(4);
        
        BIT_FIELDS0_HANDLE = LAYOUT.varHandle(PathElement.groupElement("bitFields0"));
        
        BIT_FIELDS0_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("bitFields0"));
        //@formatter:on
    }

    public StdVideoEncodeAV1OperatingPointInfoFlags() {
        this(Arena.ofAuto());
    }
    
    public StdVideoEncodeAV1OperatingPointInfoFlags(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public StdVideoEncodeAV1OperatingPointInfoFlags(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #bitFields0()
    public StdVideoEncodeAV1OperatingPointInfoFlags bitFields0(int bitFields0) {
    	BIT_FIELDS0_HANDLE.set(segment, 0L, bitFields0);
    	return this;
    }
    
    /// ```
    /// All bit fields contained in this field with their bit width:
    /// decoder_model_present_for_this_op : 1
    /// low_delay_mode_flag : 1
    /// initial_display_delay_present_for_this_op : 1
    /// reserved : 29
    /// ```
    public int bitFields0() {
    	return (int) BIT_FIELDS0_HANDLE.get(segment, 0L);
    }
    
    @Override
    public StdVideoEncodeAV1OperatingPointInfoFlags set(StdVideoEncodeAV1OperatingPointInfoFlags other) {
        return set(other.segment);
    }
    
    @Override
    public StdVideoEncodeAV1OperatingPointInfoFlags set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<StdVideoEncodeAV1OperatingPointInfoFlags> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<StdVideoEncodeAV1OperatingPointInfoFlags> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new StdVideoEncodeAV1OperatingPointInfoFlags(segment),
            count
        );
    }
    
    public static NativeStructArray<StdVideoEncodeAV1OperatingPointInfoFlags> array(Arena arena, StdVideoEncodeAV1OperatingPointInfoFlags... structs) {
        NativeStructArray<StdVideoEncodeAV1OperatingPointInfoFlags> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new StdVideoEncodeAV1OperatingPointInfoFlags(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<StdVideoEncodeAV1OperatingPointInfoFlags> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new StdVideoEncodeAV1OperatingPointInfoFlags(segment)
        );
    }
    
}