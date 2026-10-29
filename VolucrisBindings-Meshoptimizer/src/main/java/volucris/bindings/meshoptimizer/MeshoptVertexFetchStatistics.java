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
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

public final class MeshoptVertexFetchStatistics
		implements Struct<MeshoptVertexFetchStatistics> {

	public static final StructLayout LAYOUT;

	public static final VarHandle BYTES_FETCHED_HANDLE;
	public static final VarHandle OVERFETCH_HANDLE;

	public static final long BYTES_FETCHED_BYTE_OFFSET;
	public static final long OVERFETCH_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("bytes_fetched"),
		    JAVA_FLOAT.withName("overfetch")
		).withName("meshopt_VertexFetchStatistics").withByteAlignment(4);
		
		BYTES_FETCHED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("bytes_fetched"));
		OVERFETCH_HANDLE = LAYOUT.varHandle(PathElement.groupElement("overfetch"));
		
		BYTES_FETCHED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("bytes_fetched"));
		OVERFETCH_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("overfetch"));
		//@formatter:on
	}

	public MeshoptVertexFetchStatistics() {
	    this(Arena.ofAuto());
	}
	
	public MeshoptVertexFetchStatistics(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public MeshoptVertexFetchStatistics(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #bytes_fetched()
    public MeshoptVertexFetchStatistics bytes_fetched(int bytes_fetched) {
    	BYTES_FETCHED_HANDLE.set(segment, 0L, bytes_fetched);
    	return this;
    }
    
    public int bytes_fetched() {
    	return (int) BYTES_FETCHED_HANDLE.get(segment, 0L);
    }
    
    /// @see #overfetch()
    public MeshoptVertexFetchStatistics overfetch(float overfetch) {
    	OVERFETCH_HANDLE.set(segment, 0L, overfetch);
    	return this;
    }
    
    public float overfetch() {
    	return (float) OVERFETCH_HANDLE.get(segment, 0L);
    }
    
    @Override
    public MeshoptVertexFetchStatistics set(MeshoptVertexFetchStatistics other) {
        return set(other.segment);
    }
    
    @Override
    public MeshoptVertexFetchStatistics set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MeshoptVertexFetchStatistics> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MeshoptVertexFetchStatistics> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MeshoptVertexFetchStatistics(segment),
            count
        );
    }
    
    public static NativeStructArray<MeshoptVertexFetchStatistics> array(SegmentAllocator allocator, MeshoptVertexFetchStatistics... structs) {
        NativeStructArray<MeshoptVertexFetchStatistics> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MeshoptVertexFetchStatistics(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MeshoptVertexFetchStatistics> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MeshoptVertexFetchStatistics(segment)
        );
    }

}