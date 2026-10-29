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

/// ```
/// 
/// Meshlet is a small mesh cluster (subset) that consists of:
/// - triangles, an 8-bit micro triangle (index) buffer, that for each triangle specifies three local vertices to use;
/// - vertices, a 32-bit vertex indirection buffer, that for each local vertex specifies which mesh vertex to fetch vertex attributes from.
/// 
/// For efficiency, meshlet triangles and vertices are packed into two large arrays; this structure contains offsets and counts to access the data.
/// ```
public final class MeshoptMeshlet
		implements Struct<MeshoptMeshlet> {

	public static final StructLayout LAYOUT;

	public static final VarHandle VERTEX_OFFSET_HANDLE;
	public static final VarHandle TRIANGLE_OFFSET_HANDLE;
	public static final VarHandle VERTEX_COUNT_HANDLE;
	public static final VarHandle TRIANGLE_COUNT_HANDLE;

	public static final long VERTEX_OFFSET_BYTE_OFFSET;
	public static final long TRIANGLE_OFFSET_BYTE_OFFSET;
	public static final long VERTEX_COUNT_BYTE_OFFSET;
	public static final long TRIANGLE_COUNT_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("vertex_offset"),
		    JAVA_INT.withName("triangle_offset"),
		    JAVA_INT.withName("vertex_count"),
		    JAVA_INT.withName("triangle_count")
		).withName("meshopt_Meshlet").withByteAlignment(4);
		
		VERTEX_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("vertex_offset"));
		TRIANGLE_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("triangle_offset"));
		VERTEX_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("vertex_count"));
		TRIANGLE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("triangle_count"));
		
		VERTEX_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vertex_offset"));
		TRIANGLE_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("triangle_offset"));
		VERTEX_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vertex_count"));
		TRIANGLE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("triangle_count"));
		//@formatter:on
	}

	public MeshoptMeshlet() {
	    this(Arena.ofAuto());
	}
	
	public MeshoptMeshlet(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public MeshoptMeshlet(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #vertex_offset()
    public MeshoptMeshlet vertex_offset(int vertex_offset) {
    	VERTEX_OFFSET_HANDLE.set(segment, 0L, vertex_offset);
    	return this;
    }
    
    public int vertex_offset() {
    	return (int) VERTEX_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #triangle_offset()
    public MeshoptMeshlet triangle_offset(int triangle_offset) {
    	TRIANGLE_OFFSET_HANDLE.set(segment, 0L, triangle_offset);
    	return this;
    }
    
    public int triangle_offset() {
    	return (int) TRIANGLE_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #vertex_count()
    public MeshoptMeshlet vertex_count(int vertex_count) {
    	VERTEX_COUNT_HANDLE.set(segment, 0L, vertex_count);
    	return this;
    }
    
    public int vertex_count() {
    	return (int) VERTEX_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #triangle_count()
    public MeshoptMeshlet triangle_count(int triangle_count) {
    	TRIANGLE_COUNT_HANDLE.set(segment, 0L, triangle_count);
    	return this;
    }
    
    public int triangle_count() {
    	return (int) TRIANGLE_COUNT_HANDLE.get(segment, 0L);
    }
    
    @Override
    public MeshoptMeshlet set(MeshoptMeshlet other) {
        return set(other.segment);
    }
    
    @Override
    public MeshoptMeshlet set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MeshoptMeshlet> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MeshoptMeshlet> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MeshoptMeshlet(segment),
            count
        );
    }
    
    public static NativeStructArray<MeshoptMeshlet> array(SegmentAllocator allocator, MeshoptMeshlet... structs) {
        NativeStructArray<MeshoptMeshlet> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MeshoptMeshlet(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MeshoptMeshlet> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MeshoptMeshlet(segment)
        );
    }

}