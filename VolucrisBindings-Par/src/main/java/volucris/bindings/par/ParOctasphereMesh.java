/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.par;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeFloatArray;
import volucris.bindings.core.NativeShortArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class ParOctasphereMesh
		implements Struct<ParOctasphereMesh> {

	public static final StructLayout LAYOUT;

	public static final VarHandle POSITIONS_HANDLE;
	public static final VarHandle NORMALS_HANDLE;
	public static final VarHandle TEXCOORDS_HANDLE;
	public static final VarHandle INDICES_HANDLE;
	public static final VarHandle NUM_INDICES_HANDLE;
	public static final VarHandle NUM_VERTICES_HANDLE;

	public static final long POSITIONS_BYTE_OFFSET;
	public static final long NORMALS_BYTE_OFFSET;
	public static final long TEXCOORDS_BYTE_OFFSET;
	public static final long INDICES_BYTE_OFFSET;
	public static final long NUM_INDICES_BYTE_OFFSET;
	public static final long NUM_VERTICES_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    UNBOUNDED_ADDRESS.withName("positions"),
		    UNBOUNDED_ADDRESS.withName("normals"),
		    UNBOUNDED_ADDRESS.withName("texcoords"),
		    UNBOUNDED_ADDRESS.withName("indices"),
		    JAVA_INT.withName("num_indices"),
		    JAVA_INT.withName("num_vertices")
		).withName("par_octasphere_mesh").withByteAlignment(8);
		
		POSITIONS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("positions"));
		NORMALS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("normals"));
		TEXCOORDS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("texcoords"));
		INDICES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("indices"));
		NUM_INDICES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("num_indices"));
		NUM_VERTICES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("num_vertices"));
		
		POSITIONS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("positions"));
		NORMALS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("normals"));
		TEXCOORDS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("texcoords"));
		INDICES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("indices"));
		NUM_INDICES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("num_indices"));
		NUM_VERTICES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("num_vertices"));
		//@formatter:on
	}

	public ParOctasphereMesh() {
	    this(Arena.ofAuto());
	}
	
	public ParOctasphereMesh(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public ParOctasphereMesh(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #positions()
    public ParOctasphereMesh positions(NativeFloatArray positions) {
    	POSITIONS_HANDLE.set(segment, 0L, positions.memorySegment());
    	return this;
    }
    
    public @Nullable NativeFloatArray positions() {
    	MemorySegment segment = (MemorySegment) POSITIONS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeFloatArray(segment);
    }
    
    /// @see #normals()
    public ParOctasphereMesh normals(NativeFloatArray normals) {
    	NORMALS_HANDLE.set(segment, 0L, normals.memorySegment());
    	return this;
    }
    
    public @Nullable NativeFloatArray normals() {
    	MemorySegment segment = (MemorySegment) NORMALS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeFloatArray(segment);
    }
    
    /// @see #texcoords()
    public ParOctasphereMesh texcoords(NativeFloatArray texcoords) {
    	TEXCOORDS_HANDLE.set(segment, 0L, texcoords.memorySegment());
    	return this;
    }
    
    public @Nullable NativeFloatArray texcoords() {
    	MemorySegment segment = (MemorySegment) TEXCOORDS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeFloatArray(segment);
    }
    
    /// @see #indices()
    public ParOctasphereMesh indices(NativeShortArray indices) {
    	INDICES_HANDLE.set(segment, 0L, indices.memorySegment());
    	return this;
    }
    
    public @Nullable NativeShortArray indices() {
    	MemorySegment segment = (MemorySegment) INDICES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeShortArray(segment);
    }
    
    /// @see #num_indices()
    public ParOctasphereMesh num_indices(int num_indices) {
    	NUM_INDICES_HANDLE.set(segment, 0L, num_indices);
    	return this;
    }
    
    public int num_indices() {
    	return (int) NUM_INDICES_HANDLE.get(segment, 0L);
    }
    
    /// @see #num_vertices()
    public ParOctasphereMesh num_vertices(int num_vertices) {
    	NUM_VERTICES_HANDLE.set(segment, 0L, num_vertices);
    	return this;
    }
    
    public int num_vertices() {
    	return (int) NUM_VERTICES_HANDLE.get(segment, 0L);
    }
    
    @Override
    public ParOctasphereMesh set(ParOctasphereMesh other) {
        return set(other.segment);
    }
    
    @Override
    public ParOctasphereMesh set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<ParOctasphereMesh> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<ParOctasphereMesh> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new ParOctasphereMesh(segment),
            count
        );
    }
    
    public static NativeStructArray<ParOctasphereMesh> array(Arena arena, ParOctasphereMesh... structs) {
        NativeStructArray<ParOctasphereMesh> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new ParOctasphereMesh(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<ParOctasphereMesh> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new ParOctasphereMesh(segment)
        );
    }

}