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
/// The type of an element in the abstract syntax tree.
/// 
/// ```
public final class CXType
		implements Struct<CXType> {

	public static final StructLayout LAYOUT;

	public static final VarHandle KIND_HANDLE;
	public static final VarHandle DATA_HANDLE;

	public static final long KIND_BYTE_OFFSET;
	public static final long DATA_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("kind"),
		    MemoryLayout.paddingLayout(4),
		    MemoryLayout.sequenceLayout(2, UNBOUNDED_ADDRESS).withName("data")
		).withName("CXType").withByteAlignment(8);
		
		KIND_HANDLE = LAYOUT.varHandle(PathElement.groupElement("kind"));
		DATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("data"), PathElement.sequenceElement());
		
		KIND_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("kind"));
		DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("data"));
		//@formatter:on
	}

	public CXType() {
	    this(Arena.ofAuto());
	}
	
	public CXType(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public CXType(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #kind()
    public CXType kind(int kind) {
    	KIND_HANDLE.set(segment, 0L, kind);
    	return this;
    }
    
    public int kind() {
    	return (int) KIND_HANDLE.get(segment, 0L);
    }
    
    /// @see #data(int)
    public CXType data(MemorySegment data, int index0) {
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
    public CXType set(CXType other) {
        return set(other.segment);
    }
    
    @Override
    public CXType set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<CXType> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<CXType> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CXType(segment),
            count
        );
    }
    
    public static NativeStructArray<CXType> array(Arena arena, CXType... structs) {
        NativeStructArray<CXType> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CXType(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<CXType> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new CXType(segment)
        );
    }

}