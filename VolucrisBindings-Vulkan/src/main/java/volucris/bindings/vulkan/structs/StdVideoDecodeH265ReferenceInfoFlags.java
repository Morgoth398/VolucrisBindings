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

public final class StdVideoDecodeH265ReferenceInfoFlags
		implements Struct<StdVideoDecodeH265ReferenceInfoFlags> {

    public static final StructLayout LAYOUT;

    public static final VarHandle BIT_FIELDS0_HANDLE;

    public static final long BIT_FIELDS0_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("bitFields0")
        ).withName("StdVideoDecodeH265ReferenceInfoFlags").withByteAlignment(4);
        
        BIT_FIELDS0_HANDLE = LAYOUT.varHandle(PathElement.groupElement("bitFields0"));
        
        BIT_FIELDS0_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("bitFields0"));
        //@formatter:on
    }

    public StdVideoDecodeH265ReferenceInfoFlags() {
        this(Arena.ofAuto());
    }
    
    public StdVideoDecodeH265ReferenceInfoFlags(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public StdVideoDecodeH265ReferenceInfoFlags(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #bitFields0()
    public StdVideoDecodeH265ReferenceInfoFlags bitFields0(int bitFields0) {
    	BIT_FIELDS0_HANDLE.set(segment, 0L, bitFields0);
    	return this;
    }
    
    /// ```
    /// All bit fields contained in this field with their bit width:
    /// used_for_long_term_reference : 1
    /// unused_for_reference : 1
    /// ```
    public int bitFields0() {
    	return (int) BIT_FIELDS0_HANDLE.get(segment, 0L);
    }
    
    @Override
    public StdVideoDecodeH265ReferenceInfoFlags set(StdVideoDecodeH265ReferenceInfoFlags other) {
        return set(other.segment);
    }
    
    @Override
    public StdVideoDecodeH265ReferenceInfoFlags set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<StdVideoDecodeH265ReferenceInfoFlags> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<StdVideoDecodeH265ReferenceInfoFlags> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new StdVideoDecodeH265ReferenceInfoFlags(segment),
            count
        );
    }
    
    public static NativeStructArray<StdVideoDecodeH265ReferenceInfoFlags> array(Arena arena, StdVideoDecodeH265ReferenceInfoFlags... structs) {
        NativeStructArray<StdVideoDecodeH265ReferenceInfoFlags> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new StdVideoDecodeH265ReferenceInfoFlags(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<StdVideoDecodeH265ReferenceInfoFlags> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new StdVideoDecodeH265ReferenceInfoFlags(segment)
        );
    }
    
}