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
/// A character string.
/// 
/// The \c CXString type is used to return strings from the interface when
/// the ownership of that string might differ from one call to the next.
/// Use \c clang_getCString() to retrieve the string data and, once finished
/// with the string data, call \c clang_disposeString() to free the string.
/// ```
public final class CXString
		implements Struct<CXString> {

	public static final StructLayout LAYOUT;

	public static final VarHandle DATA_HANDLE;
	public static final VarHandle PRIVATE_FLAGS_HANDLE;

	public static final long DATA_BYTE_OFFSET;
	public static final long PRIVATE_FLAGS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    UNBOUNDED_ADDRESS.withName("data"),
		    JAVA_INT.withName("private_flags"),
		    MemoryLayout.paddingLayout(4)
		).withName("CXString").withByteAlignment(8);
		
		DATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("data"));
		PRIVATE_FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("private_flags"));
		
		DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("data"));
		PRIVATE_FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("private_flags"));
		//@formatter:on
	}

	public CXString() {
	    this(Arena.ofAuto());
	}
	
	public CXString(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public CXString(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #data()
    public CXString data(MemorySegment data) {
    	DATA_HANDLE.set(segment, 0L, data);
    	return this;
    }
    
    public @Nullable MemorySegment data() {
    	MemorySegment segment = (MemorySegment) DATA_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #private_flags()
    public CXString private_flags(int private_flags) {
    	PRIVATE_FLAGS_HANDLE.set(segment, 0L, private_flags);
    	return this;
    }
    
    public int private_flags() {
    	return (int) PRIVATE_FLAGS_HANDLE.get(segment, 0L);
    }
    
    @Override
    public CXString set(CXString other) {
        return set(other.segment);
    }
    
    @Override
    public CXString set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<CXString> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<CXString> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CXString(segment),
            count
        );
    }
    
    public static NativeStructArray<CXString> array(Arena arena, CXString... structs) {
        NativeStructArray<CXString> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CXString(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<CXString> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new CXString(segment)
        );
    }

}