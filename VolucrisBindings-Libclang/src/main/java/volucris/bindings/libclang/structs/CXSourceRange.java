/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.libclang.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/// ```
/// 
/// Identifies a half-open character range in the source code.
/// 
/// Use clang_getRangeStart() and clang_getRangeEnd() to retrieve the
/// starting and end locations from a source range, respectively.
/// ```
public final class CXSourceRange
		implements Struct<CXSourceRange> {

	public static final StructLayout LAYOUT;

	public static final VarHandle PTR_DATA_HANDLE;
	public static final VarHandle BEGIN_INT_DATA_HANDLE;
	public static final VarHandle END_INT_DATA_HANDLE;

	public static final long PTR_DATA_BYTE_OFFSET;
	public static final long BEGIN_INT_DATA_BYTE_OFFSET;
	public static final long END_INT_DATA_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    MemoryLayout.sequenceLayout(2, UNBOUNDED_ADDRESS).withName("ptr_data"),
		    JAVA_INT.withName("begin_int_data"),
		    JAVA_INT.withName("end_int_data")
		).withName("CXSourceRange").withByteAlignment(8);
		
		PTR_DATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("ptr_data"), PathElement.sequenceElement());
		BEGIN_INT_DATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("begin_int_data"));
		END_INT_DATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("end_int_data"));
		
		PTR_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("ptr_data"));
		BEGIN_INT_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("begin_int_data"));
		END_INT_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("end_int_data"));
		//@formatter:on
	}

	public CXSourceRange() {
	    this(Arena.ofAuto());
	}
	
	public CXSourceRange(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public CXSourceRange(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #ptr_data(int)
    public CXSourceRange ptr_data(MemorySegment ptr_data, int index0) {
    	PTR_DATA_HANDLE.set(segment, 0L, index0, ptr_data);
    	return this;
    }
    
    public @Nullable MemorySegment ptr_data(int index0) {
    	MemorySegment segment = (MemorySegment) PTR_DATA_HANDLE.get(this.segment, 0L, index0);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #begin_int_data()
    public CXSourceRange begin_int_data(int begin_int_data) {
    	BEGIN_INT_DATA_HANDLE.set(segment, 0L, begin_int_data);
    	return this;
    }
    
    public int begin_int_data() {
    	return (int) BEGIN_INT_DATA_HANDLE.get(segment, 0L);
    }
    
    /// @see #end_int_data()
    public CXSourceRange end_int_data(int end_int_data) {
    	END_INT_DATA_HANDLE.set(segment, 0L, end_int_data);
    	return this;
    }
    
    public int end_int_data() {
    	return (int) END_INT_DATA_HANDLE.get(segment, 0L);
    }
    
    @Override
    public CXSourceRange set(CXSourceRange other) {
        return set(other.segment);
    }
    
    @Override
    public CXSourceRange set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<CXSourceRange> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<CXSourceRange> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CXSourceRange(segment),
            count
        );
    }
    
    public static NativeStructArray<CXSourceRange> array(Arena arena, CXSourceRange... structs) {
        NativeStructArray<CXSourceRange> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CXSourceRange(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<CXSourceRange> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new CXSourceRange(segment)
        );
    }

}