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
/// A single result of code completion.
/// ```
public final class CXCompletionResult
		implements Struct<CXCompletionResult> {

	public static final StructLayout LAYOUT;

	public static final VarHandle CURSOR_KIND_HANDLE;
	public static final VarHandle COMPLETION_STRING_HANDLE;

	public static final long CURSOR_KIND_BYTE_OFFSET;
	public static final long COMPLETION_STRING_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("CursorKind"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("CompletionString")
		).withName("CXCompletionResult").withByteAlignment(8);
		
		CURSOR_KIND_HANDLE = LAYOUT.varHandle(PathElement.groupElement("CursorKind"));
		COMPLETION_STRING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("CompletionString"));
		
		CURSOR_KIND_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("CursorKind"));
		COMPLETION_STRING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("CompletionString"));
		//@formatter:on
	}

	public CXCompletionResult() {
	    this(Arena.ofAuto());
	}
	
	public CXCompletionResult(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public CXCompletionResult(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #cursorKind()
    public CXCompletionResult cursorKind(int cursorKind) {
    	CURSOR_KIND_HANDLE.set(segment, 0L, cursorKind);
    	return this;
    }
    
    /// ```
    /// 
    /// The kind of entity that this completion refers to.
    /// 
    /// The cursor kind will be a macro, keyword, or a declaration (one of the
    /// *Decl cursor kinds), describing the entity that the completion is
    /// referring to.
    /// 
    /// \todo In the future, we would like to provide a full cursor, to allow
    /// the client to extract additional information from declaration.
    /// ```
    public int cursorKind() {
    	return (int) CURSOR_KIND_HANDLE.get(segment, 0L);
    }
    
    /// @see #completionString()
    public CXCompletionResult completionString(MemorySegment completionString) {
    	COMPLETION_STRING_HANDLE.set(segment, 0L, completionString);
    	return this;
    }
    
    /// ```
    /// 
    /// The code-completion string that describes how to insert this
    /// code-completion result into the editing buffer.
    /// ```
    public @Nullable MemorySegment completionString() {
    	MemorySegment segment = (MemorySegment) COMPLETION_STRING_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    @Override
    public CXCompletionResult set(CXCompletionResult other) {
        return set(other.segment);
    }
    
    @Override
    public CXCompletionResult set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<CXCompletionResult> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<CXCompletionResult> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CXCompletionResult(segment),
            count
        );
    }
    
    public static NativeStructArray<CXCompletionResult> array(Arena arena, CXCompletionResult... structs) {
        NativeStructArray<CXCompletionResult> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CXCompletionResult(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<CXCompletionResult> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new CXCompletionResult(segment)
        );
    }

}