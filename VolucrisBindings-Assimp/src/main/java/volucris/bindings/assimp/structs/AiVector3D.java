/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.assimp.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

public final class AiVector3D
		implements Struct<AiVector3D> {

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
		).withName("aiVector3D").withByteAlignment(4);
		
		X_HANDLE = LAYOUT.varHandle(PathElement.groupElement("x"));
		Y_HANDLE = LAYOUT.varHandle(PathElement.groupElement("y"));
		Z_HANDLE = LAYOUT.varHandle(PathElement.groupElement("z"));
		
		X_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("x"));
		Y_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("y"));
		Z_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("z"));
		//@formatter:on
	}

	public AiVector3D() {
	    this(Arena.ofAuto());
	}
	
	public AiVector3D(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public AiVector3D(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #x()
    public AiVector3D x(float x) {
    	X_HANDLE.set(segment, 0L, x);
    	return this;
    }
    
    public float x() {
    	return (float) X_HANDLE.get(segment, 0L);
    }
    
    /// @see #y()
    public AiVector3D y(float y) {
    	Y_HANDLE.set(segment, 0L, y);
    	return this;
    }
    
    public float y() {
    	return (float) Y_HANDLE.get(segment, 0L);
    }
    
    /// @see #z()
    public AiVector3D z(float z) {
    	Z_HANDLE.set(segment, 0L, z);
    	return this;
    }
    
    public float z() {
    	return (float) Z_HANDLE.get(segment, 0L);
    }
    
    @Override
    public AiVector3D set(AiVector3D other) {
        return set(other.segment);
    }
    
    @Override
    public AiVector3D set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<AiVector3D> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<AiVector3D> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new AiVector3D(segment),
            count
        );
    }
    
    public static NativeStructArray<AiVector3D> array(Arena arena, AiVector3D... structs) {
        NativeStructArray<AiVector3D> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new AiVector3D(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<AiVector3D> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new AiVector3D(segment)
        );
    }

}