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

public final class CXStringSet
		implements Struct<CXStringSet> {

	public static final StructLayout LAYOUT;

	public static final VarHandle STRINGS_HANDLE;
	public static final VarHandle COUNT_HANDLE;

	public static final long STRINGS_BYTE_OFFSET;
	public static final long COUNT_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    UNBOUNDED_ADDRESS.withName("Strings"),
		    JAVA_INT.withName("Count"),
		    MemoryLayout.paddingLayout(4)
		).withName("CXStringSet").withByteAlignment(8);
		
		STRINGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("Strings"));
		COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("Count"));
		
		STRINGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("Strings"));
		COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("Count"));
		//@formatter:on
	}

	public CXStringSet() {
	    this(Arena.ofAuto());
	}
	
	public CXStringSet(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public CXStringSet(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #strings()
    public CXStringSet strings(CXString strings) {
    	STRINGS_HANDLE.set(segment, 0L, strings.memorySegment());
    	return this;
    }
    
    public @Nullable CXString strings() {
    	MemorySegment segment = (MemorySegment) STRINGS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new CXString(segment);
    }
    
    /// @see #count()
    public CXStringSet count(int count) {
    	COUNT_HANDLE.set(segment, 0L, count);
    	return this;
    }
    
    public int count() {
    	return (int) COUNT_HANDLE.get(segment, 0L);
    }
    
    @Override
    public CXStringSet set(CXStringSet other) {
        return set(other.segment);
    }
    
    @Override
    public CXStringSet set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<CXStringSet> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<CXStringSet> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CXStringSet(segment),
            count
        );
    }
    
    public static NativeStructArray<CXStringSet> array(Arena arena, CXStringSet... structs) {
        NativeStructArray<CXStringSet> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CXStringSet(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<CXStringSet> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new CXStringSet(segment)
        );
    }

}