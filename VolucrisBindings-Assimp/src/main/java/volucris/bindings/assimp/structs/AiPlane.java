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

/// ```
/// Represents a plane in a three-dimensional, euclidean space
/// ```
public final class AiPlane
		implements Struct<AiPlane> {

	public static final StructLayout LAYOUT;

	public static final VarHandle A_HANDLE;
	public static final VarHandle B_HANDLE;
	public static final VarHandle C_HANDLE;
	public static final VarHandle D_HANDLE;

	public static final long A_BYTE_OFFSET;
	public static final long B_BYTE_OFFSET;
	public static final long C_BYTE_OFFSET;
	public static final long D_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_FLOAT.withName("a"),
		    JAVA_FLOAT.withName("b"),
		    JAVA_FLOAT.withName("c"),
		    JAVA_FLOAT.withName("d")
		).withName("aiPlane").withByteAlignment(4);
		
		A_HANDLE = LAYOUT.varHandle(PathElement.groupElement("a"));
		B_HANDLE = LAYOUT.varHandle(PathElement.groupElement("b"));
		C_HANDLE = LAYOUT.varHandle(PathElement.groupElement("c"));
		D_HANDLE = LAYOUT.varHandle(PathElement.groupElement("d"));
		
		A_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("a"));
		B_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("b"));
		C_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("c"));
		D_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("d"));
		//@formatter:on
	}

	public AiPlane() {
	    this(Arena.ofAuto());
	}
	
	public AiPlane(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public AiPlane(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #a()
    public AiPlane a(float a) {
    	A_HANDLE.set(segment, 0L, a);
    	return this;
    }
    
    /// ```
    /// Plane equation
    /// ```
    public float a() {
    	return (float) A_HANDLE.get(segment, 0L);
    }
    
    /// @see #b()
    public AiPlane b(float b) {
    	B_HANDLE.set(segment, 0L, b);
    	return this;
    }
    
    /// ```
    /// Plane equation
    /// ```
    public float b() {
    	return (float) B_HANDLE.get(segment, 0L);
    }
    
    /// @see #c()
    public AiPlane c(float c) {
    	C_HANDLE.set(segment, 0L, c);
    	return this;
    }
    
    /// ```
    /// Plane equation
    /// ```
    public float c() {
    	return (float) C_HANDLE.get(segment, 0L);
    }
    
    /// @see #d()
    public AiPlane d(float d) {
    	D_HANDLE.set(segment, 0L, d);
    	return this;
    }
    
    /// ```
    /// Plane equation
    /// ```
    public float d() {
    	return (float) D_HANDLE.get(segment, 0L);
    }
    
    @Override
    public AiPlane set(AiPlane other) {
        return set(other.segment);
    }
    
    @Override
    public AiPlane set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<AiPlane> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<AiPlane> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new AiPlane(segment),
            count
        );
    }
    
    public static NativeStructArray<AiPlane> array(Arena arena, AiPlane... structs) {
        NativeStructArray<AiPlane> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new AiPlane(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<AiPlane> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new AiPlane(segment)
        );
    }

}