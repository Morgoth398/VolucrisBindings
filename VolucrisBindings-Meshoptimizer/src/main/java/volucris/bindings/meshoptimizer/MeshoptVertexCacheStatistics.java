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

public final class MeshoptVertexCacheStatistics
		implements Struct<MeshoptVertexCacheStatistics> {

	public static final StructLayout LAYOUT;

	public static final VarHandle VERTICES_TRANSFORMED_HANDLE;
	public static final VarHandle WARPS_EXECUTED_HANDLE;
	public static final VarHandle ACMR_HANDLE;
	public static final VarHandle ATVR_HANDLE;

	public static final long VERTICES_TRANSFORMED_BYTE_OFFSET;
	public static final long WARPS_EXECUTED_BYTE_OFFSET;
	public static final long ACMR_BYTE_OFFSET;
	public static final long ATVR_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("vertices_transformed"),
		    JAVA_INT.withName("warps_executed"),
		    JAVA_FLOAT.withName("acmr"),
		    JAVA_FLOAT.withName("atvr")
		).withName("meshopt_VertexCacheStatistics").withByteAlignment(4);
		
		VERTICES_TRANSFORMED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("vertices_transformed"));
		WARPS_EXECUTED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("warps_executed"));
		ACMR_HANDLE = LAYOUT.varHandle(PathElement.groupElement("acmr"));
		ATVR_HANDLE = LAYOUT.varHandle(PathElement.groupElement("atvr"));
		
		VERTICES_TRANSFORMED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vertices_transformed"));
		WARPS_EXECUTED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("warps_executed"));
		ACMR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("acmr"));
		ATVR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("atvr"));
		//@formatter:on
	}

	public MeshoptVertexCacheStatistics() {
	    this(Arena.ofAuto());
	}
	
	public MeshoptVertexCacheStatistics(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public MeshoptVertexCacheStatistics(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #vertices_transformed()
    public MeshoptVertexCacheStatistics vertices_transformed(int vertices_transformed) {
    	VERTICES_TRANSFORMED_HANDLE.set(segment, 0L, vertices_transformed);
    	return this;
    }
    
    public int vertices_transformed() {
    	return (int) VERTICES_TRANSFORMED_HANDLE.get(segment, 0L);
    }
    
    /// @see #warps_executed()
    public MeshoptVertexCacheStatistics warps_executed(int warps_executed) {
    	WARPS_EXECUTED_HANDLE.set(segment, 0L, warps_executed);
    	return this;
    }
    
    public int warps_executed() {
    	return (int) WARPS_EXECUTED_HANDLE.get(segment, 0L);
    }
    
    /// @see #acmr()
    public MeshoptVertexCacheStatistics acmr(float acmr) {
    	ACMR_HANDLE.set(segment, 0L, acmr);
    	return this;
    }
    
    public float acmr() {
    	return (float) ACMR_HANDLE.get(segment, 0L);
    }
    
    /// @see #atvr()
    public MeshoptVertexCacheStatistics atvr(float atvr) {
    	ATVR_HANDLE.set(segment, 0L, atvr);
    	return this;
    }
    
    public float atvr() {
    	return (float) ATVR_HANDLE.get(segment, 0L);
    }
    
    @Override
    public MeshoptVertexCacheStatistics set(MeshoptVertexCacheStatistics other) {
        return set(other.segment);
    }
    
    @Override
    public MeshoptVertexCacheStatistics set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MeshoptVertexCacheStatistics> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MeshoptVertexCacheStatistics> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MeshoptVertexCacheStatistics(segment),
            count
        );
    }
    
    public static NativeStructArray<MeshoptVertexCacheStatistics> array(SegmentAllocator allocator, MeshoptVertexCacheStatistics... structs) {
        NativeStructArray<MeshoptVertexCacheStatistics> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MeshoptVertexCacheStatistics(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MeshoptVertexCacheStatistics> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MeshoptVertexCacheStatistics(segment)
        );
    }

}