/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.par;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeFloatArray;
import volucris.bindings.core.NativeIntArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class ParShapesMesh
		implements Struct<ParShapesMesh> {

	public static final StructLayout LAYOUT;

	public static final VarHandle POINTS_HANDLE;
	public static final VarHandle NPOINTS_HANDLE;
	public static final VarHandle TRIANGLES_HANDLE;
	public static final VarHandle NTRIANGLES_HANDLE;
	public static final VarHandle NORMALS_HANDLE;
	public static final VarHandle TCOORDS_HANDLE;

	public static final long POINTS_BYTE_OFFSET;
	public static final long NPOINTS_BYTE_OFFSET;
	public static final long TRIANGLES_BYTE_OFFSET;
	public static final long NTRIANGLES_BYTE_OFFSET;
	public static final long NORMALS_BYTE_OFFSET;
	public static final long TCOORDS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    UNBOUNDED_ADDRESS.withName("points"),
		    JAVA_INT.withName("npoints"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("triangles"),
		    JAVA_INT.withName("ntriangles"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("normals"),
		    UNBOUNDED_ADDRESS.withName("tcoords")
		).withName("par_shapes_mesh_s").withByteAlignment(8);
		
		POINTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("points"));
		NPOINTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("npoints"));
		TRIANGLES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("triangles"));
		NTRIANGLES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("ntriangles"));
		NORMALS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("normals"));
		TCOORDS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("tcoords"));
		
		POINTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("points"));
		NPOINTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("npoints"));
		TRIANGLES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("triangles"));
		NTRIANGLES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("ntriangles"));
		NORMALS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("normals"));
		TCOORDS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("tcoords"));
		//@formatter:on
	}

	public ParShapesMesh() {
	    this(Arena.ofAuto());
	}
	
	public ParShapesMesh(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public ParShapesMesh(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #points()
    public ParShapesMesh points(NativeFloatArray points) {
    	POINTS_HANDLE.set(segment, 0L, points.memorySegment());
    	return this;
    }
    
    /// ```
    /// Flat list of 3-tuples (X Y Z X Y Z...)
    /// ```
    public @Nullable NativeFloatArray points() {
    	MemorySegment segment = (MemorySegment) POINTS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeFloatArray(segment);
    }
    
    /// @see #npoints()
    public ParShapesMesh npoints(int npoints) {
    	NPOINTS_HANDLE.set(segment, 0L, npoints);
    	return this;
    }
    
    /// ```
    /// Number of points
    /// ```
    public int npoints() {
    	return (int) NPOINTS_HANDLE.get(segment, 0L);
    }
    
    /// @see #triangles()
    public ParShapesMesh triangles(NativeIntArray triangles) {
    	TRIANGLES_HANDLE.set(segment, 0L, triangles.memorySegment());
    	return this;
    }
    
    /// ```
    /// Flat list of 3-tuples (I J K I J K...)
    /// ```
    public @Nullable NativeIntArray triangles() {
    	MemorySegment segment = (MemorySegment) TRIANGLES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeIntArray(segment);
    }
    
    /// @see #ntriangles()
    public ParShapesMesh ntriangles(int ntriangles) {
    	NTRIANGLES_HANDLE.set(segment, 0L, ntriangles);
    	return this;
    }
    
    /// ```
    /// Number of triangles
    /// ```
    public int ntriangles() {
    	return (int) NTRIANGLES_HANDLE.get(segment, 0L);
    }
    
    /// @see #normals()
    public ParShapesMesh normals(NativeFloatArray normals) {
    	NORMALS_HANDLE.set(segment, 0L, normals.memorySegment());
    	return this;
    }
    
    /// ```
    /// Optional list of 3-tuples (X Y Z X Y Z...)
    /// ```
    public @Nullable NativeFloatArray normals() {
    	MemorySegment segment = (MemorySegment) NORMALS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeFloatArray(segment);
    }
    
    /// @see #tcoords()
    public ParShapesMesh tcoords(NativeFloatArray tcoords) {
    	TCOORDS_HANDLE.set(segment, 0L, tcoords.memorySegment());
    	return this;
    }
    
    /// ```
    /// Optional list of 2-tuples (U V U V U V...)
    /// ```
    public @Nullable NativeFloatArray tcoords() {
    	MemorySegment segment = (MemorySegment) TCOORDS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeFloatArray(segment);
    }
    
    @Override
    public ParShapesMesh set(ParShapesMesh other) {
        return set(other.segment);
    }
    
    @Override
    public ParShapesMesh set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<ParShapesMesh> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<ParShapesMesh> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new ParShapesMesh(segment),
            count
        );
    }
    
    public static NativeStructArray<ParShapesMesh> array(SegmentAllocator allocator, ParShapesMesh... structs) {
        NativeStructArray<ParShapesMesh> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new ParShapesMesh(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<ParShapesMesh> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new ParShapesMesh(segment)
        );
    }

}