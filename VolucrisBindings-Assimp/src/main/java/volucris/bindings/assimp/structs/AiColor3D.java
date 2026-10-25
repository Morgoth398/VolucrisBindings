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

/// ```
/// Represents a color in Red-Green-Blue space.
/// ```
public final class AiColor3D
		implements Struct<AiColor3D> {

	public static final StructLayout LAYOUT;

	public static final VarHandle R_HANDLE;
	public static final VarHandle G_HANDLE;
	public static final VarHandle B_HANDLE;

	public static final long R_BYTE_OFFSET;
	public static final long G_BYTE_OFFSET;
	public static final long B_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_FLOAT.withName("r"),
		    JAVA_FLOAT.withName("g"),
		    JAVA_FLOAT.withName("b")
		).withName("aiColor3D").withByteAlignment(4);
		
		R_HANDLE = LAYOUT.varHandle(PathElement.groupElement("r"));
		G_HANDLE = LAYOUT.varHandle(PathElement.groupElement("g"));
		B_HANDLE = LAYOUT.varHandle(PathElement.groupElement("b"));
		
		R_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("r"));
		G_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("g"));
		B_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("b"));
		//@formatter:on
	}

	public AiColor3D() {
	    this(Arena.ofAuto());
	}
	
	public AiColor3D(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public AiColor3D(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #r()
    public AiColor3D r(float r) {
    	R_HANDLE.set(segment, 0L, r);
    	return this;
    }
    
    /// ```
    /// Red, green and blue color values
    /// ```
    public float r() {
    	return (float) R_HANDLE.get(segment, 0L);
    }
    
    /// @see #g()
    public AiColor3D g(float g) {
    	G_HANDLE.set(segment, 0L, g);
    	return this;
    }
    
    /// ```
    /// Red, green and blue color values
    /// ```
    public float g() {
    	return (float) G_HANDLE.get(segment, 0L);
    }
    
    /// @see #b()
    public AiColor3D b(float b) {
    	B_HANDLE.set(segment, 0L, b);
    	return this;
    }
    
    /// ```
    /// Red, green and blue color values
    /// ```
    public float b() {
    	return (float) B_HANDLE.get(segment, 0L);
    }
    
    @Override
    public AiColor3D set(AiColor3D other) {
        return set(other.segment);
    }
    
    @Override
    public AiColor3D set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<AiColor3D> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<AiColor3D> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new AiColor3D(segment),
            count
        );
    }
    
    public static NativeStructArray<AiColor3D> array(Arena arena, AiColor3D... structs) {
        NativeStructArray<AiColor3D> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new AiColor3D(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<AiColor3D> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new AiColor3D(segment)
        );
    }

}