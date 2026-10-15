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

public final class AiColor4D
		implements Struct<AiColor4D> {

	public static final StructLayout LAYOUT;

	public static final VarHandle R_HANDLE;
	public static final VarHandle G_HANDLE;
	public static final VarHandle B_HANDLE;
	public static final VarHandle A_HANDLE;

	public static final long R_BYTE_OFFSET;
	public static final long G_BYTE_OFFSET;
	public static final long B_BYTE_OFFSET;
	public static final long A_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_FLOAT.withName("r"),
		    JAVA_FLOAT.withName("g"),
		    JAVA_FLOAT.withName("b"),
		    JAVA_FLOAT.withName("a")
		).withName("aiColor4D").withByteAlignment(4);
		
		R_HANDLE = LAYOUT.varHandle(PathElement.groupElement("r"));
		G_HANDLE = LAYOUT.varHandle(PathElement.groupElement("g"));
		B_HANDLE = LAYOUT.varHandle(PathElement.groupElement("b"));
		A_HANDLE = LAYOUT.varHandle(PathElement.groupElement("a"));
		
		R_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("r"));
		G_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("g"));
		B_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("b"));
		A_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("a"));
		//@formatter:on
	}

	public AiColor4D() {
	    this(Arena.ofAuto());
	}
	
	public AiColor4D(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public AiColor4D(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #r()
    public AiColor4D r(float r) {
    	R_HANDLE.set(segment, 0L, r);
    	return this;
    }
    
    public float r() {
    	return (float) R_HANDLE.get(segment, 0L);
    }
    
    /// @see #g()
    public AiColor4D g(float g) {
    	G_HANDLE.set(segment, 0L, g);
    	return this;
    }
    
    public float g() {
    	return (float) G_HANDLE.get(segment, 0L);
    }
    
    /// @see #b()
    public AiColor4D b(float b) {
    	B_HANDLE.set(segment, 0L, b);
    	return this;
    }
    
    public float b() {
    	return (float) B_HANDLE.get(segment, 0L);
    }
    
    /// @see #a()
    public AiColor4D a(float a) {
    	A_HANDLE.set(segment, 0L, a);
    	return this;
    }
    
    public float a() {
    	return (float) A_HANDLE.get(segment, 0L);
    }
    
    @Override
    public AiColor4D set(AiColor4D other) {
        return set(other.segment);
    }
    
    @Override
    public AiColor4D set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<AiColor4D> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<AiColor4D> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new AiColor4D(segment),
            count
        );
    }
    
    public static NativeStructArray<AiColor4D> array(Arena arena, AiColor4D... structs) {
        NativeStructArray<AiColor4D> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new AiColor4D(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<AiColor4D> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new AiColor4D(segment)
        );
    }

}