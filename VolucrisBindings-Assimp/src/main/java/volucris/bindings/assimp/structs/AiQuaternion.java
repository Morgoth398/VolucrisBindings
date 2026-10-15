/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.assimp.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

public final class AiQuaternion
		implements Struct<AiQuaternion> {

	public static final StructLayout LAYOUT;

	public static final VarHandle W_HANDLE;
	public static final VarHandle X_HANDLE;
	public static final VarHandle Y_HANDLE;
	public static final VarHandle Z_HANDLE;

	public static final long W_BYTE_OFFSET;
	public static final long X_BYTE_OFFSET;
	public static final long Y_BYTE_OFFSET;
	public static final long Z_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_FLOAT.withName("w"),
		    JAVA_FLOAT.withName("x"),
		    JAVA_FLOAT.withName("y"),
		    JAVA_FLOAT.withName("z")
		).withName("aiQuaternion").withByteAlignment(4);
		
		W_HANDLE = LAYOUT.varHandle(PathElement.groupElement("w"));
		X_HANDLE = LAYOUT.varHandle(PathElement.groupElement("x"));
		Y_HANDLE = LAYOUT.varHandle(PathElement.groupElement("y"));
		Z_HANDLE = LAYOUT.varHandle(PathElement.groupElement("z"));
		
		W_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("w"));
		X_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("x"));
		Y_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("y"));
		Z_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("z"));
		//@formatter:on
	}

	public AiQuaternion() {
	    this(Arena.ofAuto());
	}
	
	public AiQuaternion(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public AiQuaternion(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #w()
    public AiQuaternion w(float w) {
    	W_HANDLE.set(segment, 0L, w);
    	return this;
    }
    
    public float w() {
    	return (float) W_HANDLE.get(segment, 0L);
    }
    
    /// @see #x()
    public AiQuaternion x(float x) {
    	X_HANDLE.set(segment, 0L, x);
    	return this;
    }
    
    public float x() {
    	return (float) X_HANDLE.get(segment, 0L);
    }
    
    /// @see #y()
    public AiQuaternion y(float y) {
    	Y_HANDLE.set(segment, 0L, y);
    	return this;
    }
    
    public float y() {
    	return (float) Y_HANDLE.get(segment, 0L);
    }
    
    /// @see #z()
    public AiQuaternion z(float z) {
    	Z_HANDLE.set(segment, 0L, z);
    	return this;
    }
    
    public float z() {
    	return (float) Z_HANDLE.get(segment, 0L);
    }
    
    @Override
    public AiQuaternion set(AiQuaternion other) {
        return set(other.segment);
    }
    
    @Override
    public AiQuaternion set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<AiQuaternion> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<AiQuaternion> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new AiQuaternion(segment),
            count
        );
    }
    
    public static NativeStructArray<AiQuaternion> array(Arena arena, AiQuaternion... structs) {
        NativeStructArray<AiQuaternion> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new AiQuaternion(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<AiQuaternion> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new AiQuaternion(segment)
        );
    }

}