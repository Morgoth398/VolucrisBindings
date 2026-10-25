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
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/// ```
/// 
/// A cursor representing some element in the abstract syntax tree for
/// a translation unit.
/// 
/// The cursor abstraction unifies the different kinds of entities in a
/// program--declaration, statements, expressions, references to declarations,
/// etc.--under a single "cursor" abstraction with a common set of operations.
/// Common operation for a cursor include: getting the physical location in
/// a source file where the cursor points, getting the name associated with a
/// cursor, and retrieving cursors for any child nodes of a particular cursor.
/// 
/// Cursors can be produced in two specific ways.
/// clang_getTranslationUnitCursor() produces a cursor for a translation unit,
/// from which one can use clang_visitChildren() to explore the rest of the
/// translation unit. clang_getCursor() maps from a physical source location
/// to the entity that resides at that location, allowing one to map from the
/// source code into the AST.
/// ```
public final class CXCursor
		implements Struct<CXCursor> {

	public static final StructLayout LAYOUT;

	public static final VarHandle KIND_HANDLE;
	public static final VarHandle XDATA_HANDLE;
	public static final VarHandle DATA_HANDLE;

	public static final long KIND_BYTE_OFFSET;
	public static final long XDATA_BYTE_OFFSET;
	public static final long DATA_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("kind"),
		    JAVA_INT.withName("xdata"),
		    MemoryLayout.sequenceLayout(3, UNBOUNDED_ADDRESS).withName("data")
		).withName("CXCursor").withByteAlignment(8);
		
		KIND_HANDLE = LAYOUT.varHandle(PathElement.groupElement("kind"));
		XDATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("xdata"));
		DATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("data"), PathElement.sequenceElement());
		
		KIND_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("kind"));
		XDATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("xdata"));
		DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("data"));
		//@formatter:on
	}

	public CXCursor() {
	    this(Arena.ofAuto());
	}
	
	public CXCursor(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public CXCursor(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #kind()
    public CXCursor kind(int kind) {
    	KIND_HANDLE.set(segment, 0L, kind);
    	return this;
    }
    
    public int kind() {
    	return (int) KIND_HANDLE.get(segment, 0L);
    }
    
    /// @see #xdata()
    public CXCursor xdata(int xdata) {
    	XDATA_HANDLE.set(segment, 0L, xdata);
    	return this;
    }
    
    public int xdata() {
    	return (int) XDATA_HANDLE.get(segment, 0L);
    }
    
    /// @see #data(int)
    public CXCursor data(MemorySegment data, int index0) {
    	DATA_HANDLE.set(segment, 0L, index0, data);
    	return this;
    }
    
    public @Nullable MemorySegment data(int index0) {
    	MemorySegment segment = (MemorySegment) DATA_HANDLE.get(this.segment, 0L, index0);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    @Override
    public CXCursor set(CXCursor other) {
        return set(other.segment);
    }
    
    @Override
    public CXCursor set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<CXCursor> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<CXCursor> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CXCursor(segment),
            count
        );
    }
    
    public static NativeStructArray<CXCursor> array(Arena arena, CXCursor... structs) {
        NativeStructArray<CXCursor> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CXCursor(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<CXCursor> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new CXCursor(segment)
        );
    }

}