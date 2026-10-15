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

public final class CXIdxObjCProtocolRefInfo
		implements Struct<CXIdxObjCProtocolRefInfo> {

	public static final StructLayout LAYOUT;

	public static final VarHandle PROTOCOL_HANDLE;

	public static final long PROTOCOL_BYTE_OFFSET;
	public static final long CURSOR_BYTE_OFFSET;
	public static final long LOC_BYTE_OFFSET;

	private final MemorySegment segment;

	private final CXCursor cursor;
	private final CXIdxLoc loc;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    UNBOUNDED_ADDRESS.withName("protocol"),
		    CXCursor.LAYOUT.withName("cursor"),
		    CXIdxLoc.LAYOUT.withName("loc")
		).withName("CXIdxObjCProtocolRefInfo").withByteAlignment(8);
		
		PROTOCOL_HANDLE = LAYOUT.varHandle(PathElement.groupElement("protocol"));
		
		PROTOCOL_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("protocol"));
		CURSOR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("cursor"));
		LOC_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("loc"));
		//@formatter:on
	}

	public CXIdxObjCProtocolRefInfo() {
	    this(Arena.ofAuto());
	}
	
	public CXIdxObjCProtocolRefInfo(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public CXIdxObjCProtocolRefInfo(MemorySegment segment) {
	    this.segment = segment;
	
	    cursor = new CXCursor(segment.asSlice(CURSOR_BYTE_OFFSET, CXCursor.LAYOUT));
	    loc = new CXIdxLoc(segment.asSlice(LOC_BYTE_OFFSET, CXIdxLoc.LAYOUT));
	}

    /// @see #protocol()
    public CXIdxObjCProtocolRefInfo protocol(CXIdxEntityInfo protocol) {
    	PROTOCOL_HANDLE.set(segment, 0L, protocol.memorySegment());
    	return this;
    }
    
    public @Nullable CXIdxEntityInfo protocol() {
    	MemorySegment segment = (MemorySegment) PROTOCOL_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXIdxEntityInfo(segment);
    }
    
    /// @see #cursor()
    public CXIdxObjCProtocolRefInfo cursor(Consumer<CXCursor> consumer) {
    	consumer.accept(cursor);
    	return this;
    }
    
    /// @see #cursor()
    public CXIdxObjCProtocolRefInfo cursor(CXCursor other) {
    	cursor.set(other);
    	return this;
    }
    
    public CXCursor cursor() {
    	return cursor;
    }
    
    /// @see #loc()
    public CXIdxObjCProtocolRefInfo loc(Consumer<CXIdxLoc> consumer) {
    	consumer.accept(loc);
    	return this;
    }
    
    /// @see #loc()
    public CXIdxObjCProtocolRefInfo loc(CXIdxLoc other) {
    	loc.set(other);
    	return this;
    }
    
    public CXIdxLoc loc() {
    	return loc;
    }
    
    @Override
    public CXIdxObjCProtocolRefInfo set(CXIdxObjCProtocolRefInfo other) {
        return set(other.segment);
    }
    
    @Override
    public CXIdxObjCProtocolRefInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<CXIdxObjCProtocolRefInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<CXIdxObjCProtocolRefInfo> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CXIdxObjCProtocolRefInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<CXIdxObjCProtocolRefInfo> array(Arena arena, CXIdxObjCProtocolRefInfo... structs) {
        NativeStructArray<CXIdxObjCProtocolRefInfo> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CXIdxObjCProtocolRefInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<CXIdxObjCProtocolRefInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new CXIdxObjCProtocolRefInfo(segment)
        );
    }

}