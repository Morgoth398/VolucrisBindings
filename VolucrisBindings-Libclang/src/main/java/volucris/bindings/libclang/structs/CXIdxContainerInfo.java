/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.libclang.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.util.function.Consumer;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

public final class CXIdxContainerInfo
		implements Struct<CXIdxContainerInfo> {

    public static final StructLayout LAYOUT;

    public static final long CURSOR_BYTE_OFFSET;

    private final MemorySegment segment;

    private final CXCursor cursor;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            CXCursor.LAYOUT.withName("cursor")
        ).withName("CXIdxContainerInfo").withByteAlignment(8);
        
        CURSOR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("cursor"));
        //@formatter:on
    }

    public CXIdxContainerInfo() {
        this(Arena.ofAuto());
    }
    
    public CXIdxContainerInfo(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public CXIdxContainerInfo(MemorySegment segment) {
        this.segment = segment;
    
        cursor = new CXCursor(segment.asSlice(CURSOR_BYTE_OFFSET, CXCursor.LAYOUT));
    }

    /// @see #cursor()
    public CXIdxContainerInfo cursor(Consumer<CXCursor> consumer) {
    	consumer.accept(cursor);
    	return this;
    }
    
    /// @see #cursor()
    public CXIdxContainerInfo cursor(CXCursor other) {
    	cursor.set(other);
    	return this;
    }
    
    public CXCursor cursor() {
    	return cursor;
    }
    
    @Override
    public CXIdxContainerInfo set(CXIdxContainerInfo other) {
        return set(other.segment);
    }
    
    @Override
    public CXIdxContainerInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<CXIdxContainerInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<CXIdxContainerInfo> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CXIdxContainerInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<CXIdxContainerInfo> array(Arena arena, CXIdxContainerInfo... structs) {
        NativeStructArray<CXIdxContainerInfo> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CXIdxContainerInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<CXIdxContainerInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new CXIdxContainerInfo(segment)
        );
    }
    
}