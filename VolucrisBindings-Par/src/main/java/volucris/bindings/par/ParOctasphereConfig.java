/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.par;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

public final class ParOctasphereConfig
		implements Struct<ParOctasphereConfig> {

	public static final StructLayout LAYOUT;

	public static final VarHandle CORNER_RADIUS_HANDLE;
	public static final VarHandle WIDTH_HANDLE;
	public static final VarHandle HEIGHT_HANDLE;
	public static final VarHandle DEPTH_HANDLE;
	public static final VarHandle NUM_SUBDIVISIONS_HANDLE;
	public static final VarHandle UV_MODE_HANDLE;
	public static final VarHandle NORMALS_MODE_HANDLE;

	public static final long CORNER_RADIUS_BYTE_OFFSET;
	public static final long WIDTH_BYTE_OFFSET;
	public static final long HEIGHT_BYTE_OFFSET;
	public static final long DEPTH_BYTE_OFFSET;
	public static final long NUM_SUBDIVISIONS_BYTE_OFFSET;
	public static final long UV_MODE_BYTE_OFFSET;
	public static final long NORMALS_MODE_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_FLOAT.withName("corner_radius"),
		    JAVA_FLOAT.withName("width"),
		    JAVA_FLOAT.withName("height"),
		    JAVA_FLOAT.withName("depth"),
		    JAVA_INT.withName("num_subdivisions"),
		    JAVA_INT.withName("uv_mode"),
		    JAVA_INT.withName("normals_mode")
		).withName("par_octasphere_config").withByteAlignment(4);
		
		CORNER_RADIUS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("corner_radius"));
		WIDTH_HANDLE = LAYOUT.varHandle(PathElement.groupElement("width"));
		HEIGHT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("height"));
		DEPTH_HANDLE = LAYOUT.varHandle(PathElement.groupElement("depth"));
		NUM_SUBDIVISIONS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("num_subdivisions"));
		UV_MODE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("uv_mode"));
		NORMALS_MODE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("normals_mode"));
		
		CORNER_RADIUS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("corner_radius"));
		WIDTH_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("width"));
		HEIGHT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("height"));
		DEPTH_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("depth"));
		NUM_SUBDIVISIONS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("num_subdivisions"));
		UV_MODE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("uv_mode"));
		NORMALS_MODE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("normals_mode"));
		//@formatter:on
	}

	public ParOctasphereConfig() {
	    this(Arena.ofAuto());
	}
	
	public ParOctasphereConfig(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public ParOctasphereConfig(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #corner_radius()
    public ParOctasphereConfig corner_radius(float corner_radius) {
    	CORNER_RADIUS_HANDLE.set(segment, 0L, corner_radius);
    	return this;
    }
    
    public float corner_radius() {
    	return (float) CORNER_RADIUS_HANDLE.get(segment, 0L);
    }
    
    /// @see #width()
    public ParOctasphereConfig width(float width) {
    	WIDTH_HANDLE.set(segment, 0L, width);
    	return this;
    }
    
    public float width() {
    	return (float) WIDTH_HANDLE.get(segment, 0L);
    }
    
    /// @see #height()
    public ParOctasphereConfig height(float height) {
    	HEIGHT_HANDLE.set(segment, 0L, height);
    	return this;
    }
    
    public float height() {
    	return (float) HEIGHT_HANDLE.get(segment, 0L);
    }
    
    /// @see #depth()
    public ParOctasphereConfig depth(float depth) {
    	DEPTH_HANDLE.set(segment, 0L, depth);
    	return this;
    }
    
    public float depth() {
    	return (float) DEPTH_HANDLE.get(segment, 0L);
    }
    
    /// @see #num_subdivisions()
    public ParOctasphereConfig num_subdivisions(int num_subdivisions) {
    	NUM_SUBDIVISIONS_HANDLE.set(segment, 0L, num_subdivisions);
    	return this;
    }
    
    public int num_subdivisions() {
    	return (int) NUM_SUBDIVISIONS_HANDLE.get(segment, 0L);
    }
    
    /// @see #uv_mode()
    public ParOctasphereConfig uv_mode(int uv_mode) {
    	UV_MODE_HANDLE.set(segment, 0L, uv_mode);
    	return this;
    }
    
    public int uv_mode() {
    	return (int) UV_MODE_HANDLE.get(segment, 0L);
    }
    
    /// @see #normals_mode()
    public ParOctasphereConfig normals_mode(int normals_mode) {
    	NORMALS_MODE_HANDLE.set(segment, 0L, normals_mode);
    	return this;
    }
    
    public int normals_mode() {
    	return (int) NORMALS_MODE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public ParOctasphereConfig set(ParOctasphereConfig other) {
        return set(other.segment);
    }
    
    @Override
    public ParOctasphereConfig set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<ParOctasphereConfig> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<ParOctasphereConfig> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new ParOctasphereConfig(segment),
            count
        );
    }
    
    public static NativeStructArray<ParOctasphereConfig> array(Arena arena, ParOctasphereConfig... structs) {
        NativeStructArray<ParOctasphereConfig> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new ParOctasphereConfig(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<ParOctasphereConfig> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new ParOctasphereConfig(segment)
        );
    }

}