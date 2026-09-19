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

public final class StdVideoAV1FilmGrainFlags
		implements Struct<StdVideoAV1FilmGrainFlags> {

    public static final StructLayout LAYOUT;

    public static final VarHandle BIT_FIELDS0_HANDLE;

    public static final long BIT_FIELDS0_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("bitFields0")
        ).withName("StdVideoAV1FilmGrainFlags").withByteAlignment(4);
        
        BIT_FIELDS0_HANDLE = LAYOUT.varHandle(PathElement.groupElement("bitFields0"));
        
        BIT_FIELDS0_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("bitFields0"));
        //@formatter:on
    }

    public StdVideoAV1FilmGrainFlags() {
        this(Arena.ofAuto());
    }
    
    public StdVideoAV1FilmGrainFlags(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public StdVideoAV1FilmGrainFlags(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #bitFields0()
    public StdVideoAV1FilmGrainFlags bitFields0(int bitFields0) {
    	BIT_FIELDS0_HANDLE.set(segment, 0L, bitFields0);
    	return this;
    }
    
    /// ```
    /// All bit fields contained in this field with their bit width:
    /// chroma_scaling_from_luma : 1
    /// overlap_flag : 1
    /// clip_to_restricted_range : 1
    /// update_grain : 1
    /// reserved : 28
    /// ```
    public int bitFields0() {
    	return (int) BIT_FIELDS0_HANDLE.get(segment, 0L);
    }
    
    @Override
    public StdVideoAV1FilmGrainFlags set(StdVideoAV1FilmGrainFlags other) {
        return set(other.segment);
    }
    
    @Override
    public StdVideoAV1FilmGrainFlags set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<StdVideoAV1FilmGrainFlags> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<StdVideoAV1FilmGrainFlags> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new StdVideoAV1FilmGrainFlags(segment),
            count
        );
    }
    
    public static NativeStructArray<StdVideoAV1FilmGrainFlags> array(Arena arena, StdVideoAV1FilmGrainFlags... structs) {
        NativeStructArray<StdVideoAV1FilmGrainFlags> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new StdVideoAV1FilmGrainFlags(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<StdVideoAV1FilmGrainFlags> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new StdVideoAV1FilmGrainFlags(segment)
        );
    }
    
}