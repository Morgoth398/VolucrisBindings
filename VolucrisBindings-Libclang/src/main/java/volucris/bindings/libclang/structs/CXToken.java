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
/// Describes a single preprocessing token.
/// ```
public final class CXToken
		implements Struct<CXToken> {

	public static final StructLayout LAYOUT;

	public static final VarHandle INT_DATA_HANDLE;
	public static final VarHandle PTR_DATA_HANDLE;

	public static final long INT_DATA_BYTE_OFFSET;
	public static final long PTR_DATA_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    MemoryLayout.sequenceLayout(4, JAVA_INT).withName("int_data"),
		    UNBOUNDED_ADDRESS.withName("ptr_data")
		).withName("CXToken").withByteAlignment(8);
		
		INT_DATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("int_data"), PathElement.sequenceElement());
		PTR_DATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("ptr_data"));
		
		INT_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("int_data"));
		PTR_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("ptr_data"));
		//@formatter:on
	}

	public CXToken() {
	    this(Arena.ofAuto());
	}
	
	public CXToken(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public CXToken(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #int_data(int)
    public CXToken int_data(int int_data, int index0) {
    	INT_DATA_HANDLE.set(segment, 0L, index0, int_data);
    	return this;
    }
    
    public int int_data(int index0) {
    	return (int) INT_DATA_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #ptr_data()
    public CXToken ptr_data(MemorySegment ptr_data) {
    	PTR_DATA_HANDLE.set(segment, 0L, ptr_data);
    	return this;
    }
    
    public @Nullable MemorySegment ptr_data() {
    	MemorySegment segment = (MemorySegment) PTR_DATA_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    @Override
    public CXToken set(CXToken other) {
        return set(other.segment);
    }
    
    @Override
    public CXToken set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<CXToken> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<CXToken> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CXToken(segment),
            count
        );
    }
    
    public static NativeStructArray<CXToken> array(Arena arena, CXToken... structs) {
        NativeStructArray<CXToken> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new CXToken(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<CXToken> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new CXToken(segment)
        );
    }

}