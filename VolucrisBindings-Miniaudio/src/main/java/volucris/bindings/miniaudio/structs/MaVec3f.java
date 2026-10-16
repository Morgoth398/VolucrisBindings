/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.miniaudio.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

public final class MaVec3f
		implements Struct<MaVec3f> {

	public static final StructLayout LAYOUT;

	public static final VarHandle X_HANDLE;
	public static final VarHandle Y_HANDLE;
	public static final VarHandle Z_HANDLE;

	public static final long X_BYTE_OFFSET;
	public static final long Y_BYTE_OFFSET;
	public static final long Z_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_FLOAT.withName("x"),
		    JAVA_FLOAT.withName("y"),
		    JAVA_FLOAT.withName("z")
		).withName("ma_vec3f").withByteAlignment(4);
		
		X_HANDLE = LAYOUT.varHandle(PathElement.groupElement("x"));
		Y_HANDLE = LAYOUT.varHandle(PathElement.groupElement("y"));
		Z_HANDLE = LAYOUT.varHandle(PathElement.groupElement("z"));
		
		X_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("x"));
		Y_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("y"));
		Z_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("z"));
		//@formatter:on
	}

	public MaVec3f() {
	    this(Arena.ofAuto());
	}
	
	public MaVec3f(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public MaVec3f(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #x()
    public MaVec3f x(float x) {
    	X_HANDLE.set(segment, 0L, x);
    	return this;
    }
    
    public float x() {
    	return (float) X_HANDLE.get(segment, 0L);
    }
    
    /// @see #y()
    public MaVec3f y(float y) {
    	Y_HANDLE.set(segment, 0L, y);
    	return this;
    }
    
    public float y() {
    	return (float) Y_HANDLE.get(segment, 0L);
    }
    
    /// @see #z()
    public MaVec3f z(float z) {
    	Z_HANDLE.set(segment, 0L, z);
    	return this;
    }
    
    public float z() {
    	return (float) Z_HANDLE.get(segment, 0L);
    }
    
    @Override
    public MaVec3f set(MaVec3f other) {
        return set(other.segment);
    }
    
    @Override
    public MaVec3f set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaVec3f> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaVec3f> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaVec3f(segment),
            count
        );
    }
    
    public static NativeStructArray<MaVec3f> array(Arena arena, MaVec3f... structs) {
        NativeStructArray<MaVec3f> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaVec3f(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaVec3f> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaVec3f(segment)
        );
    }

}