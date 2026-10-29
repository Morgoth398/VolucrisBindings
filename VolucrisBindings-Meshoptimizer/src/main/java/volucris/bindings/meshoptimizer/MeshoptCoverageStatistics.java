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

public final class MeshoptCoverageStatistics
		implements Struct<MeshoptCoverageStatistics> {

	public static final StructLayout LAYOUT;

	public static final VarHandle COVERAGE_HANDLE;
	public static final VarHandle EXTENT_HANDLE;

	public static final long COVERAGE_BYTE_OFFSET;
	public static final long EXTENT_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    MemoryLayout.sequenceLayout(3, JAVA_FLOAT).withName("coverage"),
		    JAVA_FLOAT.withName("extent")
		).withName("meshopt_CoverageStatistics").withByteAlignment(4);
		
		COVERAGE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("coverage"), PathElement.sequenceElement());
		EXTENT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("extent"));
		
		COVERAGE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("coverage"));
		EXTENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("extent"));
		//@formatter:on
	}

	public MeshoptCoverageStatistics() {
	    this(Arena.ofAuto());
	}
	
	public MeshoptCoverageStatistics(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public MeshoptCoverageStatistics(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #coverage(int)
    public MeshoptCoverageStatistics coverage(float coverage, int index0) {
    	COVERAGE_HANDLE.set(segment, 0L, index0, coverage);
    	return this;
    }
    
    public float coverage(int index0) {
    	return (float) COVERAGE_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #extent()
    public MeshoptCoverageStatistics extent(float extent) {
    	EXTENT_HANDLE.set(segment, 0L, extent);
    	return this;
    }
    
    public float extent() {
    	return (float) EXTENT_HANDLE.get(segment, 0L);
    }
    
    @Override
    public MeshoptCoverageStatistics set(MeshoptCoverageStatistics other) {
        return set(other.segment);
    }
    
    @Override
    public MeshoptCoverageStatistics set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MeshoptCoverageStatistics> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MeshoptCoverageStatistics> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MeshoptCoverageStatistics(segment),
            count
        );
    }
    
    public static NativeStructArray<MeshoptCoverageStatistics> array(SegmentAllocator allocator, MeshoptCoverageStatistics... structs) {
        NativeStructArray<MeshoptCoverageStatistics> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MeshoptCoverageStatistics(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MeshoptCoverageStatistics> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MeshoptCoverageStatistics(segment)
        );
    }

}