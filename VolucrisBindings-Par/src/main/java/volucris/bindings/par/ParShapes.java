/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.par;

import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeByteArray;
import volucris.bindings.core.NativeFloatArray;
import volucris.bindings.core.NativeIntArray;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class ParShapes {

	private static final LazyConstant<MethodHandle> PAR_SHAPES_FREE_MESH;
	private static final LazyConstant<MethodHandle> PAR_SHAPES_CREATE_CYLINDER;
	private static final LazyConstant<MethodHandle> PAR_SHAPES_CREATE_CONE;
	private static final LazyConstant<MethodHandle> PAR_SHAPES_CREATE_PARAMETRIC_DISK;
	private static final LazyConstant<MethodHandle> PAR_SHAPES_CREATE_TORUS;
	private static final LazyConstant<MethodHandle> PAR_SHAPES_CREATE_PARAMETRIC_SPHERE;
	private static final LazyConstant<MethodHandle> PAR_SHAPES_CREATE_SUBDIVIDED_SPHERE;
	private static final LazyConstant<MethodHandle> PAR_SHAPES_CREATE_KLEIN_BOTTLE;
	private static final LazyConstant<MethodHandle> PAR_SHAPES_CREATE_TREFOIL_KNOT;
	private static final LazyConstant<MethodHandle> PAR_SHAPES_CREATE_HEMISPHERE;
	private static final LazyConstant<MethodHandle> PAR_SHAPES_CREATE_PLANE;
	private static final LazyConstant<MethodHandle> PAR_SHAPES_CREATE_PARAMETRIC;
	private static final LazyConstant<MethodHandle> PAR_SHAPES_CREATE_ICOSAHEDRON;
	private static final LazyConstant<MethodHandle> PAR_SHAPES_CREATE_DODECAHEDRON;
	private static final LazyConstant<MethodHandle> PAR_SHAPES_CREATE_OCTAHEDRON;
	private static final LazyConstant<MethodHandle> PAR_SHAPES_CREATE_TETRAHEDRON;
	private static final LazyConstant<MethodHandle> PAR_SHAPES_CREATE_CUBE;
	private static final LazyConstant<MethodHandle> PAR_SHAPES_CREATE_DISK;
	private static final LazyConstant<MethodHandle> PAR_SHAPES_CREATE_EMPTY;
	private static final LazyConstant<MethodHandle> PAR_SHAPES_CREATE_ROCK;
	private static final LazyConstant<MethodHandle> PAR_SHAPES_CREATE_LSYSTEM;
	private static final LazyConstant<MethodHandle> PAR_SHAPES_EXPORT;
	private static final LazyConstant<MethodHandle> PAR_SHAPES_COMPUTE_AABB;
	private static final LazyConstant<MethodHandle> PAR_SHAPES_CLONE;
	private static final LazyConstant<MethodHandle> PAR_SHAPES_MERGE;
	private static final LazyConstant<MethodHandle> PAR_SHAPES_TRANSLATE;
	private static final LazyConstant<MethodHandle> PAR_SHAPES_ROTATE;
	private static final LazyConstant<MethodHandle> PAR_SHAPES_SCALE;
	private static final LazyConstant<MethodHandle> PAR_SHAPES_MERGE_AND_FREE;
	private static final LazyConstant<MethodHandle> PAR_SHAPES_INVERT;
	private static final LazyConstant<MethodHandle> PAR_SHAPES_REMOVE_DEGENERATE;
	private static final LazyConstant<MethodHandle> PAR_SHAPES_UNWELD;
	private static final LazyConstant<MethodHandle> PAR_SHAPES_WELD;
	private static final LazyConstant<MethodHandle> PAR_SHAPES_COMPUTE_NORMALS;
	private static final LazyConstant<MethodHandle> PAR_SHAPES_SET_EPSILON_WELDED_NORMALS;
	private static final LazyConstant<MethodHandle> PAR_SHAPES_SET_EPSILON_DEGENERATE_SPHERE;
	private static final LazyConstant<MethodHandle> PAR_SHAPES__COMPUTE_WELDED_NORMALS;
	private static final LazyConstant<MethodHandle> PAR_SHAPES__CONNECT;

	static {
		//@formatter:off
		PAR_SHAPES_FREE_MESH = downcallHandleVoid("par_shapes_free_mesh", UNBOUNDED_ADDRESS);
		PAR_SHAPES_CREATE_CYLINDER = downcallHandle("par_shapes_create_cylinder", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
		PAR_SHAPES_CREATE_CONE = downcallHandle("par_shapes_create_cone", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
		PAR_SHAPES_CREATE_PARAMETRIC_DISK = downcallHandle("par_shapes_create_parametric_disk", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
		PAR_SHAPES_CREATE_TORUS = downcallHandle("par_shapes_create_torus", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, JAVA_FLOAT);
		PAR_SHAPES_CREATE_PARAMETRIC_SPHERE = downcallHandle("par_shapes_create_parametric_sphere", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
		PAR_SHAPES_CREATE_SUBDIVIDED_SPHERE = downcallHandle("par_shapes_create_subdivided_sphere", UNBOUNDED_ADDRESS, JAVA_INT);
		PAR_SHAPES_CREATE_KLEIN_BOTTLE = downcallHandle("par_shapes_create_klein_bottle", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
		PAR_SHAPES_CREATE_TREFOIL_KNOT = downcallHandle("par_shapes_create_trefoil_knot", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, JAVA_FLOAT);
		PAR_SHAPES_CREATE_HEMISPHERE = downcallHandle("par_shapes_create_hemisphere", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
		PAR_SHAPES_CREATE_PLANE = downcallHandle("par_shapes_create_plane", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
		PAR_SHAPES_CREATE_PARAMETRIC = downcallHandle("par_shapes_create_parametric", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		PAR_SHAPES_CREATE_ICOSAHEDRON = downcallHandle("par_shapes_create_icosahedron", UNBOUNDED_ADDRESS);
		PAR_SHAPES_CREATE_DODECAHEDRON = downcallHandle("par_shapes_create_dodecahedron", UNBOUNDED_ADDRESS);
		PAR_SHAPES_CREATE_OCTAHEDRON = downcallHandle("par_shapes_create_octahedron", UNBOUNDED_ADDRESS);
		PAR_SHAPES_CREATE_TETRAHEDRON = downcallHandle("par_shapes_create_tetrahedron", UNBOUNDED_ADDRESS);
		PAR_SHAPES_CREATE_CUBE = downcallHandle("par_shapes_create_cube", UNBOUNDED_ADDRESS);
		PAR_SHAPES_CREATE_DISK = downcallHandle("par_shapes_create_disk", UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		PAR_SHAPES_CREATE_EMPTY = downcallHandle("par_shapes_create_empty", UNBOUNDED_ADDRESS);
		PAR_SHAPES_CREATE_ROCK = downcallHandle("par_shapes_create_rock", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
		PAR_SHAPES_CREATE_LSYSTEM = downcallHandle("par_shapes_create_lsystem", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
		PAR_SHAPES_EXPORT = downcallHandleVoid("par_shapes_export", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		PAR_SHAPES_COMPUTE_AABB = downcallHandleVoid("par_shapes_compute_aabb", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		PAR_SHAPES_CLONE = downcallHandle("par_shapes_clone", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		PAR_SHAPES_MERGE = downcallHandleVoid("par_shapes_merge", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		PAR_SHAPES_TRANSLATE = downcallHandleVoid("par_shapes_translate", UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT);
		PAR_SHAPES_ROTATE = downcallHandleVoid("par_shapes_rotate", UNBOUNDED_ADDRESS, JAVA_FLOAT, UNBOUNDED_ADDRESS);
		PAR_SHAPES_SCALE = downcallHandleVoid("par_shapes_scale", UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT);
		PAR_SHAPES_MERGE_AND_FREE = downcallHandleVoid("par_shapes_merge_and_free", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		PAR_SHAPES_INVERT = downcallHandleVoid("par_shapes_invert", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
		PAR_SHAPES_REMOVE_DEGENERATE = downcallHandleVoid("par_shapes_remove_degenerate", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		PAR_SHAPES_UNWELD = downcallHandleVoid("par_shapes_unweld", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		PAR_SHAPES_WELD = downcallHandle("par_shapes_weld", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT, UNBOUNDED_ADDRESS);
		PAR_SHAPES_COMPUTE_NORMALS = downcallHandleVoid("par_shapes_compute_normals", UNBOUNDED_ADDRESS);
		PAR_SHAPES_SET_EPSILON_WELDED_NORMALS = downcallHandleVoid("par_shapes_set_epsilon_welded_normals", JAVA_FLOAT);
		PAR_SHAPES_SET_EPSILON_DEGENERATE_SPHERE = downcallHandleVoid("par_shapes_set_epsilon_degenerate_sphere", JAVA_FLOAT);
		PAR_SHAPES__COMPUTE_WELDED_NORMALS = downcallHandleVoid("par_shapes__compute_welded_normals", UNBOUNDED_ADDRESS);
		PAR_SHAPES__CONNECT = downcallHandleVoid("par_shapes__connect", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
		//@formatter:on
	}

	private ParShapes() {
	}

    public static void free_mesh(
    	MemorySegment param0
    ) {
    	MethodHandle method = PAR_SHAPES_FREE_MESH.get();
    	try {
    		 method.invokeExact(
    			param0
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#free_mesh].
    public static void free_mesh(
    	ParShapesMesh param0
    ) {
    	free_mesh(
    		param0.memorySegment()
    	);
    }
    
    /// ```
    /// Instance a cylinder that sits on the Z=0 plane using the given tessellation
    /// levels across the UV domain.  Think of "slices" like a number of pizza
    /// slices, and "stacks" like a number of stacked rings.  Height and radius are
    /// both 1.0, but they can easily be changed with par_shapes_scale.
    /// ```
    public static MemorySegment ncreate_cylinder(
    	int slices,
    	int stacks
    ) {
    	MethodHandle method = PAR_SHAPES_CREATE_CYLINDER.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			slices,
    			stacks
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ncreate_cylinder].
    public static @Nullable ParShapesMesh create_cylinder(
    	int slices,
    	int stacks
    ) {
    	MemorySegment segment = ncreate_cylinder(
    		slices,
    		stacks
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new ParShapesMesh(segment);
    }
    
    /// ```
    /// Cone is similar to cylinder but the radius diminishes to zero as Z increases.
    /// Again, height and radius are 1.0, but can be changed with par_shapes_scale.
    /// ```
    public static MemorySegment ncreate_cone(
    	int slices,
    	int stacks
    ) {
    	MethodHandle method = PAR_SHAPES_CREATE_CONE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			slices,
    			stacks
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ncreate_cone].
    public static @Nullable ParShapesMesh create_cone(
    	int slices,
    	int stacks
    ) {
    	MemorySegment segment = ncreate_cone(
    		slices,
    		stacks
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new ParShapesMesh(segment);
    }
    
    /// ```
    /// Create a disk of radius 1.0 with texture coordinates and normals by squashing
    /// a cone flat on the Z=0 plane.
    /// ```
    public static MemorySegment ncreate_parametric_disk(
    	int slices,
    	int stacks
    ) {
    	MethodHandle method = PAR_SHAPES_CREATE_PARAMETRIC_DISK.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			slices,
    			stacks
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ncreate_parametric_disk].
    public static @Nullable ParShapesMesh create_parametric_disk(
    	int slices,
    	int stacks
    ) {
    	MemorySegment segment = ncreate_parametric_disk(
    		slices,
    		stacks
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new ParShapesMesh(segment);
    }
    
    /// ```
    /// Create a donut that sits on the Z=0 plane with the specified inner radius.
    /// The outer radius can be controlled with par_shapes_scale.
    /// ```
    public static MemorySegment ncreate_torus(
    	int slices,
    	int stacks,
    	float radius
    ) {
    	MethodHandle method = PAR_SHAPES_CREATE_TORUS.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			slices,
    			stacks,
    			radius
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ncreate_torus].
    public static @Nullable ParShapesMesh create_torus(
    	int slices,
    	int stacks,
    	float radius
    ) {
    	MemorySegment segment = ncreate_torus(
    		slices,
    		stacks,
    		radius
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new ParShapesMesh(segment);
    }
    
    /// ```
    /// Create a sphere with texture coordinates and small triangles near the poles.
    /// ```
    public static MemorySegment ncreate_parametric_sphere(
    	int slices,
    	int stacks
    ) {
    	MethodHandle method = PAR_SHAPES_CREATE_PARAMETRIC_SPHERE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			slices,
    			stacks
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ncreate_parametric_sphere].
    public static @Nullable ParShapesMesh create_parametric_sphere(
    	int slices,
    	int stacks
    ) {
    	MemorySegment segment = ncreate_parametric_sphere(
    		slices,
    		stacks
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new ParShapesMesh(segment);
    }
    
    /// ```
    /// Approximate a sphere with a subdivided icosahedron, which produces a nice
    /// distribution of triangles, but no texture coordinates.  Each subdivision
    /// level scales the number of triangles by four, so use a very low number.
    /// ```
    public static MemorySegment ncreate_subdivided_sphere(
    	int nsubdivisions
    ) {
    	MethodHandle method = PAR_SHAPES_CREATE_SUBDIVIDED_SPHERE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			nsubdivisions
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ncreate_subdivided_sphere].
    public static @Nullable ParShapesMesh create_subdivided_sphere(
    	int nsubdivisions
    ) {
    	MemorySegment segment = ncreate_subdivided_sphere(
    		nsubdivisions
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new ParShapesMesh(segment);
    }
    
    /// ```
    /// More parametric surfaces.
    /// ```
    public static MemorySegment ncreate_klein_bottle(
    	int slices,
    	int stacks
    ) {
    	MethodHandle method = PAR_SHAPES_CREATE_KLEIN_BOTTLE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			slices,
    			stacks
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ncreate_klein_bottle].
    public static @Nullable ParShapesMesh create_klein_bottle(
    	int slices,
    	int stacks
    ) {
    	MemorySegment segment = ncreate_klein_bottle(
    		slices,
    		stacks
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new ParShapesMesh(segment);
    }
    
    public static MemorySegment ncreate_trefoil_knot(
    	int slices,
    	int stacks,
    	float radius
    ) {
    	MethodHandle method = PAR_SHAPES_CREATE_TREFOIL_KNOT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			slices,
    			stacks,
    			radius
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ncreate_trefoil_knot].
    public static @Nullable ParShapesMesh create_trefoil_knot(
    	int slices,
    	int stacks,
    	float radius
    ) {
    	MemorySegment segment = ncreate_trefoil_knot(
    		slices,
    		stacks,
    		radius
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new ParShapesMesh(segment);
    }
    
    public static MemorySegment ncreate_hemisphere(
    	int slices,
    	int stacks
    ) {
    	MethodHandle method = PAR_SHAPES_CREATE_HEMISPHERE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			slices,
    			stacks
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ncreate_hemisphere].
    public static @Nullable ParShapesMesh create_hemisphere(
    	int slices,
    	int stacks
    ) {
    	MemorySegment segment = ncreate_hemisphere(
    		slices,
    		stacks
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new ParShapesMesh(segment);
    }
    
    public static MemorySegment ncreate_plane(
    	int slices,
    	int stacks
    ) {
    	MethodHandle method = PAR_SHAPES_CREATE_PLANE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			slices,
    			stacks
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ncreate_plane].
    public static @Nullable ParShapesMesh create_plane(
    	int slices,
    	int stacks
    ) {
    	MemorySegment segment = ncreate_plane(
    		slices,
    		stacks
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new ParShapesMesh(segment);
    }
    
    public static MemorySegment create_parametric(
    	MemorySegment param0,
    	int slices,
    	int stacks,
    	MemorySegment userdata
    ) {
    	MethodHandle method = PAR_SHAPES_CREATE_PARAMETRIC.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			param0,
    			slices,
    			stacks,
    			userdata
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#create_parametric].
    public static @Nullable ParShapesMesh create_parametric(
    	ParShapesFunction param0,
    	int slices,
    	int stacks,
    	MemorySegment userdata
    ) {
    	MemorySegment segment = create_parametric(
    		param0.memorySegment(),
    		slices,
    		stacks,
    		userdata
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new ParShapesMesh(segment);
    }
    
    /// ```
    /// Generate points for a 20-sided polyhedron that fits in the unit sphere.
    /// Texture coordinates and normals are not generated.
    /// ```
    public static MemorySegment ncreate_icosahedron() {
    	MethodHandle method = PAR_SHAPES_CREATE_ICOSAHEDRON.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ncreate_icosahedron].
    public static @Nullable ParShapesMesh create_icosahedron() {
    	MemorySegment segment = ncreate_icosahedron();
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    	
    	return new ParShapesMesh(segment);
    }
    
    /// ```
    /// Generate points for a 12-sided polyhedron that fits in the unit sphere.
    /// Again, texture coordinates and normals are not generated.
    /// ```
    public static MemorySegment ncreate_dodecahedron() {
    	MethodHandle method = PAR_SHAPES_CREATE_DODECAHEDRON.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ncreate_dodecahedron].
    public static @Nullable ParShapesMesh create_dodecahedron() {
    	MemorySegment segment = ncreate_dodecahedron();
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    	
    	return new ParShapesMesh(segment);
    }
    
    /// ```
    /// More platonic solids.
    /// ```
    public static MemorySegment ncreate_octahedron() {
    	MethodHandle method = PAR_SHAPES_CREATE_OCTAHEDRON.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ncreate_octahedron].
    public static @Nullable ParShapesMesh create_octahedron() {
    	MemorySegment segment = ncreate_octahedron();
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    	
    	return new ParShapesMesh(segment);
    }
    
    public static MemorySegment ncreate_tetrahedron() {
    	MethodHandle method = PAR_SHAPES_CREATE_TETRAHEDRON.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ncreate_tetrahedron].
    public static @Nullable ParShapesMesh create_tetrahedron() {
    	MemorySegment segment = ncreate_tetrahedron();
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    	
    	return new ParShapesMesh(segment);
    }
    
    public static MemorySegment ncreate_cube() {
    	MethodHandle method = PAR_SHAPES_CREATE_CUBE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ncreate_cube].
    public static @Nullable ParShapesMesh create_cube() {
    	MemorySegment segment = ncreate_cube();
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    	
    	return new ParShapesMesh(segment);
    }
    
    /// ```
    /// Generate an orientable disk shape in 3-space.  Does not include normals or
    /// texture coordinates.
    /// ```
    public static MemorySegment create_disk(
    	float radius,
    	int slices,
    	MemorySegment center,
    	MemorySegment normal
    ) {
    	MethodHandle method = PAR_SHAPES_CREATE_DISK.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			radius,
    			slices,
    			center,
    			normal
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#create_disk].
    public static @Nullable ParShapesMesh create_disk(
    	float radius,
    	int slices,
    	NativeFloatArray center,
    	NativeFloatArray normal
    ) {
    	MemorySegment segment = create_disk(
    		radius,
    		slices,
    		center.memorySegment(),
    		normal.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new ParShapesMesh(segment);
    }
    
    /// ```
    /// Create an empty shape.  Useful for building scenes with merge_and_free.
    /// ```
    public static MemorySegment ncreate_empty() {
    	MethodHandle method = PAR_SHAPES_CREATE_EMPTY.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ncreate_empty].
    public static @Nullable ParShapesMesh create_empty() {
    	MemorySegment segment = ncreate_empty();
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    	
    	return new ParShapesMesh(segment);
    }
    
    /// ```
    /// Generate a rock shape that sits on the Y=0 plane, and sinks into it a bit.
    /// This includes smooth normals but no texture coordinates.  Each subdivision
    /// level scales the number of triangles by four, so use a very low number.
    /// ```
    public static MemorySegment ncreate_rock(
    	int seed,
    	int nsubdivisions
    ) {
    	MethodHandle method = PAR_SHAPES_CREATE_ROCK.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			seed,
    			nsubdivisions
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ncreate_rock].
    public static @Nullable ParShapesMesh create_rock(
    	int seed,
    	int nsubdivisions
    ) {
    	MemorySegment segment = ncreate_rock(
    		seed,
    		nsubdivisions
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new ParShapesMesh(segment);
    }
    
    /// ```
    /// Create trees or vegetation by executing a recursive turtle graphics program.
    /// The program is a list of command-argument pairs.  See the unit test for
    /// an example.  Texture coordinates and normals are not generated.
    /// ```
    public static MemorySegment create_lsystem(
    	MemorySegment program,
    	int slices,
    	int maxdepth
    ) {
    	MethodHandle method = PAR_SHAPES_CREATE_LSYSTEM.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			program,
    			slices,
    			maxdepth
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#create_lsystem].
    public static @Nullable ParShapesMesh create_lsystem(
    	NativeByteArray program,
    	int slices,
    	int maxdepth
    ) {
    	MemorySegment segment = create_lsystem(
    		program.memorySegment(),
    		slices,
    		maxdepth
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new ParShapesMesh(segment);
    }
    
    /// ```
    /// Dump out a text file conforming to the venerable OBJ format.
    /// ```
    public static void export(
    	MemorySegment param0,
    	MemorySegment objfile
    ) {
    	MethodHandle method = PAR_SHAPES_EXPORT.get();
    	try {
    		 method.invokeExact(
    			param0,
    			objfile
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#export].
    public static void export(
    	ParShapesMesh param0,
    	NativeByteArray objfile
    ) {
    	export(
    		param0.memorySegment(),
    		objfile.memorySegment()
    	);
    }
    
    /// ```
    /// Take a pointer to 6 floats and set them to min xyz, max xyz.
    /// ```
    public static void compute_aabb(
    	MemorySegment mesh,
    	MemorySegment aabb
    ) {
    	MethodHandle method = PAR_SHAPES_COMPUTE_AABB.get();
    	try {
    		 method.invokeExact(
    			mesh,
    			aabb
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#compute_aabb].
    public static void compute_aabb(
    	ParShapesMesh mesh,
    	NativeFloatArray aabb
    ) {
    	compute_aabb(
    		mesh.memorySegment(),
    		aabb.memorySegment()
    	);
    }
    
    /// ```
    /// Make a deep copy of a mesh.  To make a brand new copy, pass null to "target".
    /// To avoid memory churn, pass an existing mesh to "target".
    /// ```
    public static MemorySegment clone(
    	MemorySegment mesh,
    	MemorySegment target
    ) {
    	MethodHandle method = PAR_SHAPES_CLONE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			mesh,
    			target
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#clone].
    public static @Nullable ParShapesMesh clone(
    	ParShapesMesh mesh,
    	ParShapesMesh target
    ) {
    	MemorySegment segment = clone(
    		mesh.memorySegment(),
    		target.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new ParShapesMesh(segment);
    }
    
    /// ```
    /// Transformations -------------------------------------------------------------
    /// ```
    public static void merge(
    	MemorySegment dst,
    	MemorySegment src
    ) {
    	MethodHandle method = PAR_SHAPES_MERGE.get();
    	try {
    		 method.invokeExact(
    			dst,
    			src
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#merge].
    public static void merge(
    	ParShapesMesh dst,
    	ParShapesMesh src
    ) {
    	merge(
    		dst.memorySegment(),
    		src.memorySegment()
    	);
    }
    
    public static void translate(
    	MemorySegment param0,
    	float x,
    	float y,
    	float z
    ) {
    	MethodHandle method = PAR_SHAPES_TRANSLATE.get();
    	try {
    		 method.invokeExact(
    			param0,
    			x,
    			y,
    			z
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#translate].
    public static void translate(
    	ParShapesMesh param0,
    	float x,
    	float y,
    	float z
    ) {
    	translate(
    		param0.memorySegment(),
    		x,
    		y,
    		z
    	);
    }
    
    public static void rotate(
    	MemorySegment param0,
    	float radians,
    	MemorySegment axis
    ) {
    	MethodHandle method = PAR_SHAPES_ROTATE.get();
    	try {
    		 method.invokeExact(
    			param0,
    			radians,
    			axis
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#rotate].
    public static void rotate(
    	ParShapesMesh param0,
    	float radians,
    	NativeFloatArray axis
    ) {
    	rotate(
    		param0.memorySegment(),
    		radians,
    		axis.memorySegment()
    	);
    }
    
    public static void scale(
    	MemorySegment param0,
    	float x,
    	float y,
    	float z
    ) {
    	MethodHandle method = PAR_SHAPES_SCALE.get();
    	try {
    		 method.invokeExact(
    			param0,
    			x,
    			y,
    			z
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#scale].
    public static void scale(
    	ParShapesMesh param0,
    	float x,
    	float y,
    	float z
    ) {
    	scale(
    		param0.memorySegment(),
    		x,
    		y,
    		z
    	);
    }
    
    public static void merge_and_free(
    	MemorySegment dst,
    	MemorySegment src
    ) {
    	MethodHandle method = PAR_SHAPES_MERGE_AND_FREE.get();
    	try {
    		 method.invokeExact(
    			dst,
    			src
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#merge_and_free].
    public static void merge_and_free(
    	ParShapesMesh dst,
    	ParShapesMesh src
    ) {
    	merge_and_free(
    		dst.memorySegment(),
    		src.memorySegment()
    	);
    }
    
    /// ```
    /// Reverse the winding of a run of faces.  Useful when drawing the inside of
    /// a Cornell Box.  Pass 0 for nfaces to reverse every face in the mesh.
    /// ```
    public static void invert(
    	MemorySegment param0,
    	int startface,
    	int nfaces
    ) {
    	MethodHandle method = PAR_SHAPES_INVERT.get();
    	try {
    		 method.invokeExact(
    			param0,
    			startface,
    			nfaces
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#invert].
    public static void invert(
    	ParShapesMesh param0,
    	int startface,
    	int nfaces
    ) {
    	invert(
    		param0.memorySegment(),
    		startface,
    		nfaces
    	);
    }
    
    /// ```
    /// Remove all triangles whose area is less than minarea.
    /// ```
    public static void remove_degenerate(
    	MemorySegment param0,
    	float minarea
    ) {
    	MethodHandle method = PAR_SHAPES_REMOVE_DEGENERATE.get();
    	try {
    		 method.invokeExact(
    			param0,
    			minarea
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#remove_degenerate].
    public static void remove_degenerate(
    	ParShapesMesh param0,
    	float minarea
    ) {
    	remove_degenerate(
    		param0.memorySegment(),
    		minarea
    	);
    }
    
    /// ```
    /// Dereference the entire index buffer and replace the point list.
    /// This creates an inefficient structure, but is useful for drawing facets.
    /// If create_indices is true, a trivial "0 1 2 3..." index buffer is generated.
    /// ```
    public static void unweld(
    	MemorySegment mesh,
    	boolean create_indices
    ) {
    	MethodHandle method = PAR_SHAPES_UNWELD.get();
    	try {
    		 method.invokeExact(
    			mesh,
    			create_indices
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#unweld].
    public static void unweld(
    	ParShapesMesh mesh,
    	boolean create_indices
    ) {
    	unweld(
    		mesh.memorySegment(),
    		create_indices
    	);
    }
    
    /// ```
    /// Merge colocated verts, build a new index buffer, and return the
    /// optimized mesh.  Epsilon is the maximum distance to consider when
    /// welding vertices. The mapping argument can be null, or a pointer to
    /// npoints integers, which gets filled with the mapping from old vertex
    /// indices to new indices.
    /// ```
    public static MemorySegment weld(
    	MemorySegment param0,
    	float epsilon,
    	MemorySegment mapping
    ) {
    	MethodHandle method = PAR_SHAPES_WELD.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			param0,
    			epsilon,
    			mapping
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#weld].
    public static @Nullable ParShapesMesh weld(
    	ParShapesMesh param0,
    	float epsilon,
    	NativeIntArray mapping
    ) {
    	MemorySegment segment = weld(
    		param0.memorySegment(),
    		epsilon,
    		mapping.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new ParShapesMesh(segment);
    }
    
    /// ```
    /// Compute smooth normals by averaging adjacent facet normals.
    /// ```
    public static void compute_normals(
    	MemorySegment m
    ) {
    	MethodHandle method = PAR_SHAPES_COMPUTE_NORMALS.get();
    	try {
    		 method.invokeExact(
    			m
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#compute_normals].
    public static void compute_normals(
    	ParShapesMesh m
    ) {
    	compute_normals(
    		m.memorySegment()
    	);
    }
    
    /// ```
    /// Global Config ---------------------------------------------------------------
    /// ```
    public static void set_epsilon_welded_normals(
    	float epsilon
    ) {
    	MethodHandle method = PAR_SHAPES_SET_EPSILON_WELDED_NORMALS.get();
    	try {
    		 method.invokeExact(
    			epsilon
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void set_epsilon_degenerate_sphere(
    	float epsilon
    ) {
    	MethodHandle method = PAR_SHAPES_SET_EPSILON_DEGENERATE_SPHERE.get();
    	try {
    		 method.invokeExact(
    			epsilon
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Advanced --------------------------------------------------------------------
    /// ```
    public static void compute_welded_normals(
    	MemorySegment m
    ) {
    	MethodHandle method = PAR_SHAPES__COMPUTE_WELDED_NORMALS.get();
    	try {
    		 method.invokeExact(
    			m
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#compute_welded_normals].
    public static void compute_welded_normals(
    	ParShapesMesh m
    ) {
    	compute_welded_normals(
    		m.memorySegment()
    	);
    }
    
    public static void connect(
    	MemorySegment scene,
    	MemorySegment cylinder,
    	int slices
    ) {
    	MethodHandle method = PAR_SHAPES__CONNECT.get();
    	try {
    		 method.invokeExact(
    			scene,
    			cylinder,
    			slices
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#connect].
    public static void connect(
    	ParShapesMesh scene,
    	ParShapesMesh cylinder,
    	int slices
    ) {
    	connect(
    		scene.memorySegment(),
    		cylinder.memorySegment(),
    		slices
    	);
    }

}