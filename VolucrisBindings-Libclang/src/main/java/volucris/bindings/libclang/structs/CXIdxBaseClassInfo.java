/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.libclang.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class CXIdxBaseClassInfo
		implements Struct<CXIdxBaseClassInfo> {

    public static final StructLayout LAYOUT;

    public static final VarHandle BASE_HANDLE;

    public static final long BASE_BYTE_OFFSET;
    public static final long CURSOR_BYTE_OFFSET;
    public static final long LOC_BYTE_OFFSET;

    private final MemorySegment segment;

    private final CXCursor cursor;
    private final CXIdxLoc loc;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            UNBOUNDED_ADDRESS.withName("base"),
            CXCursor.LAYOUT.withName("cursor"),
            CXIdxLoc.LAYOUT.withName("loc")
        ).withName("CXIdxBaseClassInfo").withByteAlignment(8);
        
        BASE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("base"));
        
        BASE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("base"));
        CURSOR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("cursor"));
        LOC_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("loc"));
        //@formatter:on
    }

    public CXIdxBaseClassInfo() {
        this(Arena.ofAuto());
    }
    
    public CXIdxBaseClassInfo(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public CXIdxBaseClassInfo(MemorySegment segment) {
        this.segment = segment;
    
        cursor = new CXCursor(segment.asSlice(CURSOR_BYTE_OFFSET, CXCursor.LAYOUT));
        loc = new CXIdxLoc(segment.asSlice(LOC_BYTE_OFFSET, CXIdxLoc.LAYOUT));
    }

    /// @see #base()
    public CXIdxBaseClassInfo base(CXIdxEntityInfo base) {
    	BASE_HANDLE.set(segment, 0L, base.memorySegment());
    	return this;
    }
    
    public @Nullable CXIdxEntityInfo base() {
    	MemorySegment segment = (MemorySegment) BASE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXIdxEntityInfo(segment);
    }
    
    /// @see #cursor()
    public CXIdxBaseClassInfo cursor(Consumer<CXCursor> consumer) {
    	consumer.accept(cursor);
    	return this;
    }
    
    /// @see #cursor()
    public CXIdxBaseClassInfo cursor(CXCursor other) {
    	cursor.set(other);
    	return this;
    }
    
    public CXCursor cursor() {
    	return cursor;
    }
    
    /// @see #loc()
    public CXIdxBaseClassInfo loc(Consumer<CXIdxLoc> consumer) {
    	consumer.accept(loc);
    	return this;
    }
    
    /// @see #loc()
    public CXIdxBaseClassInfo loc(CXIdxLoc other) {
    	loc.set(other);
    	return this;
    }
    
    public CXIdxLoc loc() {
    	return loc;
    }
    
    @Override
    public CXIdxBaseClassInfo set(CXIdxBaseClassInfo other) {
        return set(other.segment);
    }
    
    @Override
    public CXIdxBaseClassInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<CXIdxBaseClassInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<CXIdxBaseClassInfo> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CXIdxBaseClassInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<CXIdxBaseClassInfo> array(Arena arena, CXIdxBaseClassInfo... structs) {
        NativeStructArray<CXIdxBaseClassInfo> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CXIdxBaseClassInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<CXIdxBaseClassInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new CXIdxBaseClassInfo(segment)
        );
    }
    
}