/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.libclang.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

public final class CXIdxAttrInfo
		implements Struct<CXIdxAttrInfo> {

	public static final StructLayout LAYOUT;

	public static final VarHandle KIND_HANDLE;

	public static final long KIND_BYTE_OFFSET;
	public static final long CURSOR_BYTE_OFFSET;
	public static final long LOC_BYTE_OFFSET;

	private final MemorySegment segment;

	private final CXCursor cursor;
	private final CXIdxLoc loc;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("kind"),
		    MemoryLayout.paddingLayout(4),
		    CXCursor.LAYOUT.withName("cursor"),
		    CXIdxLoc.LAYOUT.withName("loc")
		).withName("CXIdxAttrInfo").withByteAlignment(8);
		
		KIND_HANDLE = LAYOUT.varHandle(PathElement.groupElement("kind"));
		
		KIND_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("kind"));
		CURSOR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("cursor"));
		LOC_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("loc"));
		//@formatter:on
	}

	public CXIdxAttrInfo() {
	    this(Arena.ofAuto());
	}
	
	public CXIdxAttrInfo(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public CXIdxAttrInfo(MemorySegment segment) {
	    this.segment = segment;
	
	    cursor = new CXCursor(segment.asSlice(CURSOR_BYTE_OFFSET, CXCursor.LAYOUT));
	    loc = new CXIdxLoc(segment.asSlice(LOC_BYTE_OFFSET, CXIdxLoc.LAYOUT));
	}

    /// @see #kind()
    public CXIdxAttrInfo kind(int kind) {
    	KIND_HANDLE.set(segment, 0L, kind);
    	return this;
    }
    
    public int kind() {
    	return (int) KIND_HANDLE.get(segment, 0L);
    }
    
    /// @see #cursor()
    public CXIdxAttrInfo cursor(Consumer<CXCursor> consumer) {
    	consumer.accept(cursor);
    	return this;
    }
    
    /// @see #cursor()
    public CXIdxAttrInfo cursor(CXCursor other) {
    	cursor.set(other);
    	return this;
    }
    
    public CXCursor cursor() {
    	return cursor;
    }
    
    /// @see #loc()
    public CXIdxAttrInfo loc(Consumer<CXIdxLoc> consumer) {
    	consumer.accept(loc);
    	return this;
    }
    
    /// @see #loc()
    public CXIdxAttrInfo loc(CXIdxLoc other) {
    	loc.set(other);
    	return this;
    }
    
    public CXIdxLoc loc() {
    	return loc;
    }
    
    @Override
    public CXIdxAttrInfo set(CXIdxAttrInfo other) {
        return set(other.segment);
    }
    
    @Override
    public CXIdxAttrInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<CXIdxAttrInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<CXIdxAttrInfo> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CXIdxAttrInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<CXIdxAttrInfo> array(Arena arena, CXIdxAttrInfo... structs) {
        NativeStructArray<CXIdxAttrInfo> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CXIdxAttrInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<CXIdxAttrInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new CXIdxAttrInfo(segment)
        );
    }

}