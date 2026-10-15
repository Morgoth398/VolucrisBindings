/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.libclang.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

/// ```
/// 
/// Uniquely identifies a CXFile, that refers to the same underlying file,
/// across an indexing session.
/// ```
public final class CXFileUniqueID
		implements Struct<CXFileUniqueID> {

	public static final StructLayout LAYOUT;

	public static final VarHandle DATA_HANDLE;

	public static final long DATA_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    MemoryLayout.sequenceLayout(3, JAVA_LONG).withName("data")
		).withName("CXFileUniqueID").withByteAlignment(8);
		
		DATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("data"), PathElement.sequenceElement());
		
		DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("data"));
		//@formatter:on
	}

	public CXFileUniqueID() {
	    this(Arena.ofAuto());
	}
	
	public CXFileUniqueID(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public CXFileUniqueID(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #data(int)
    public CXFileUniqueID data(long data, int index0) {
    	DATA_HANDLE.set(segment, 0L, index0, data);
    	return this;
    }
    
    public long data(int index0) {
    	return (long) DATA_HANDLE.get(segment, 0L, index0);
    }
    
    @Override
    public CXFileUniqueID set(CXFileUniqueID other) {
        return set(other.segment);
    }
    
    @Override
    public CXFileUniqueID set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<CXFileUniqueID> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<CXFileUniqueID> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CXFileUniqueID(segment),
            count
        );
    }
    
    public static NativeStructArray<CXFileUniqueID> array(Arena arena, CXFileUniqueID... structs) {
        NativeStructArray<CXFileUniqueID> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CXFileUniqueID(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<CXFileUniqueID> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new CXFileUniqueID(segment)
        );
    }

}