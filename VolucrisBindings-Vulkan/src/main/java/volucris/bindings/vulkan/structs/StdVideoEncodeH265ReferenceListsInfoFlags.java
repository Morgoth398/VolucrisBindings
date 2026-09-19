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

public final class StdVideoEncodeH265ReferenceListsInfoFlags
		implements Struct<StdVideoEncodeH265ReferenceListsInfoFlags> {

    public static final StructLayout LAYOUT;

    public static final VarHandle BIT_FIELDS0_HANDLE;

    public static final long BIT_FIELDS0_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("bitFields0")
        ).withName("StdVideoEncodeH265ReferenceListsInfoFlags").withByteAlignment(4);
        
        BIT_FIELDS0_HANDLE = LAYOUT.varHandle(PathElement.groupElement("bitFields0"));
        
        BIT_FIELDS0_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("bitFields0"));
        //@formatter:on
    }

    public StdVideoEncodeH265ReferenceListsInfoFlags() {
        this(Arena.ofAuto());
    }
    
    public StdVideoEncodeH265ReferenceListsInfoFlags(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public StdVideoEncodeH265ReferenceListsInfoFlags(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #bitFields0()
    public StdVideoEncodeH265ReferenceListsInfoFlags bitFields0(int bitFields0) {
    	BIT_FIELDS0_HANDLE.set(segment, 0L, bitFields0);
    	return this;
    }
    
    /// ```
    /// All bit fields contained in this field with their bit width:
    /// ref_pic_list_modification_flag_l0 : 1
    /// ref_pic_list_modification_flag_l1 : 1
    /// reserved : 30
    /// ```
    public int bitFields0() {
    	return (int) BIT_FIELDS0_HANDLE.get(segment, 0L);
    }
    
    @Override
    public StdVideoEncodeH265ReferenceListsInfoFlags set(StdVideoEncodeH265ReferenceListsInfoFlags other) {
        return set(other.segment);
    }
    
    @Override
    public StdVideoEncodeH265ReferenceListsInfoFlags set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<StdVideoEncodeH265ReferenceListsInfoFlags> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<StdVideoEncodeH265ReferenceListsInfoFlags> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new StdVideoEncodeH265ReferenceListsInfoFlags(segment),
            count
        );
    }
    
    public static NativeStructArray<StdVideoEncodeH265ReferenceListsInfoFlags> array(Arena arena, StdVideoEncodeH265ReferenceListsInfoFlags... structs) {
        NativeStructArray<StdVideoEncodeH265ReferenceListsInfoFlags> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new StdVideoEncodeH265ReferenceListsInfoFlags(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<StdVideoEncodeH265ReferenceListsInfoFlags> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new StdVideoEncodeH265ReferenceListsInfoFlags(segment)
        );
    }
    
}