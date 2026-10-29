/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.meshoptimizer;

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
/// Vertex attribute stream
/// Each element takes size bytes, beginning at data, with stride controlling the spacing between successive elements (stride >= size).
/// ```
public final class MeshoptStream
		implements Struct<MeshoptStream> {

	public static final StructLayout LAYOUT;

	public static final VarHandle DATA_HANDLE;
	public static final VarHandle SIZE_HANDLE;
	public static final VarHandle STRIDE_HANDLE;

	public static final long DATA_BYTE_OFFSET;
	public static final long SIZE_BYTE_OFFSET;
	public static final long STRIDE_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    UNBOUNDED_ADDRESS.withName("data"),
		    JAVA_LONG.withName("size"),
		    JAVA_LONG.withName("stride")
		).withName("meshopt_Stream").withByteAlignment(8);
		
		DATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("data"));
		SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("size"));
		STRIDE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("stride"));
		
		DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("data"));
		SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("size"));
		STRIDE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("stride"));
		//@formatter:on
	}

	public MeshoptStream() {
	    this(Arena.ofAuto());
	}
	
	public MeshoptStream(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public MeshoptStream(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #data()
    public MeshoptStream data(MemorySegment data) {
    	DATA_HANDLE.set(segment, 0L, data);
    	return this;
    }
    
    public @Nullable MemorySegment data() {
    	MemorySegment segment = (MemorySegment) DATA_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #size()
    public MeshoptStream size(long size) {
    	SIZE_HANDLE.set(segment, 0L, size);
    	return this;
    }
    
    public long size() {
    	return (long) SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #stride()
    public MeshoptStream stride(long stride) {
    	STRIDE_HANDLE.set(segment, 0L, stride);
    	return this;
    }
    
    public long stride() {
    	return (long) STRIDE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public MeshoptStream set(MeshoptStream other) {
        return set(other.segment);
    }
    
    @Override
    public MeshoptStream set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MeshoptStream> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MeshoptStream> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MeshoptStream(segment),
            count
        );
    }
    
    public static NativeStructArray<MeshoptStream> array(SegmentAllocator allocator, MeshoptStream... structs) {
        NativeStructArray<MeshoptStream> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MeshoptStream(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MeshoptStream> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MeshoptStream(segment)
        );
    }

}