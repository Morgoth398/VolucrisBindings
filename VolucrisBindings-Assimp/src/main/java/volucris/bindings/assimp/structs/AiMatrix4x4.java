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

public final class AiMatrix4x4
		implements Struct<AiMatrix4x4> {

	public static final StructLayout LAYOUT;

	public static final VarHandle A1_HANDLE;
	public static final VarHandle A2_HANDLE;
	public static final VarHandle A3_HANDLE;
	public static final VarHandle A4_HANDLE;
	public static final VarHandle B1_HANDLE;
	public static final VarHandle B2_HANDLE;
	public static final VarHandle B3_HANDLE;
	public static final VarHandle B4_HANDLE;
	public static final VarHandle C1_HANDLE;
	public static final VarHandle C2_HANDLE;
	public static final VarHandle C3_HANDLE;
	public static final VarHandle C4_HANDLE;
	public static final VarHandle D1_HANDLE;
	public static final VarHandle D2_HANDLE;
	public static final VarHandle D3_HANDLE;
	public static final VarHandle D4_HANDLE;

	public static final long A1_BYTE_OFFSET;
	public static final long A2_BYTE_OFFSET;
	public static final long A3_BYTE_OFFSET;
	public static final long A4_BYTE_OFFSET;
	public static final long B1_BYTE_OFFSET;
	public static final long B2_BYTE_OFFSET;
	public static final long B3_BYTE_OFFSET;
	public static final long B4_BYTE_OFFSET;
	public static final long C1_BYTE_OFFSET;
	public static final long C2_BYTE_OFFSET;
	public static final long C3_BYTE_OFFSET;
	public static final long C4_BYTE_OFFSET;
	public static final long D1_BYTE_OFFSET;
	public static final long D2_BYTE_OFFSET;
	public static final long D3_BYTE_OFFSET;
	public static final long D4_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_FLOAT.withName("a1"),
		    JAVA_FLOAT.withName("a2"),
		    JAVA_FLOAT.withName("a3"),
		    JAVA_FLOAT.withName("a4"),
		    JAVA_FLOAT.withName("b1"),
		    JAVA_FLOAT.withName("b2"),
		    JAVA_FLOAT.withName("b3"),
		    JAVA_FLOAT.withName("b4"),
		    JAVA_FLOAT.withName("c1"),
		    JAVA_FLOAT.withName("c2"),
		    JAVA_FLOAT.withName("c3"),
		    JAVA_FLOAT.withName("c4"),
		    JAVA_FLOAT.withName("d1"),
		    JAVA_FLOAT.withName("d2"),
		    JAVA_FLOAT.withName("d3"),
		    JAVA_FLOAT.withName("d4")
		).withName("aiMatrix4x4").withByteAlignment(4);
		
		A1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("a1"));
		A2_HANDLE = LAYOUT.varHandle(PathElement.groupElement("a2"));
		A3_HANDLE = LAYOUT.varHandle(PathElement.groupElement("a3"));
		A4_HANDLE = LAYOUT.varHandle(PathElement.groupElement("a4"));
		B1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("b1"));
		B2_HANDLE = LAYOUT.varHandle(PathElement.groupElement("b2"));
		B3_HANDLE = LAYOUT.varHandle(PathElement.groupElement("b3"));
		B4_HANDLE = LAYOUT.varHandle(PathElement.groupElement("b4"));
		C1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("c1"));
		C2_HANDLE = LAYOUT.varHandle(PathElement.groupElement("c2"));
		C3_HANDLE = LAYOUT.varHandle(PathElement.groupElement("c3"));
		C4_HANDLE = LAYOUT.varHandle(PathElement.groupElement("c4"));
		D1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("d1"));
		D2_HANDLE = LAYOUT.varHandle(PathElement.groupElement("d2"));
		D3_HANDLE = LAYOUT.varHandle(PathElement.groupElement("d3"));
		D4_HANDLE = LAYOUT.varHandle(PathElement.groupElement("d4"));
		
		A1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("a1"));
		A2_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("a2"));
		A3_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("a3"));
		A4_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("a4"));
		B1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("b1"));
		B2_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("b2"));
		B3_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("b3"));
		B4_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("b4"));
		C1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("c1"));
		C2_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("c2"));
		C3_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("c3"));
		C4_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("c4"));
		D1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("d1"));
		D2_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("d2"));
		D3_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("d3"));
		D4_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("d4"));
		//@formatter:on
	}

	public AiMatrix4x4() {
	    this(Arena.ofAuto());
	}
	
	public AiMatrix4x4(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public AiMatrix4x4(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #a1()
    public AiMatrix4x4 a1(float a1) {
    	A1_HANDLE.set(segment, 0L, a1);
    	return this;
    }
    
    public float a1() {
    	return (float) A1_HANDLE.get(segment, 0L);
    }
    
    /// @see #a2()
    public AiMatrix4x4 a2(float a2) {
    	A2_HANDLE.set(segment, 0L, a2);
    	return this;
    }
    
    public float a2() {
    	return (float) A2_HANDLE.get(segment, 0L);
    }
    
    /// @see #a3()
    public AiMatrix4x4 a3(float a3) {
    	A3_HANDLE.set(segment, 0L, a3);
    	return this;
    }
    
    public float a3() {
    	return (float) A3_HANDLE.get(segment, 0L);
    }
    
    /// @see #a4()
    public AiMatrix4x4 a4(float a4) {
    	A4_HANDLE.set(segment, 0L, a4);
    	return this;
    }
    
    public float a4() {
    	return (float) A4_HANDLE.get(segment, 0L);
    }
    
    /// @see #b1()
    public AiMatrix4x4 b1(float b1) {
    	B1_HANDLE.set(segment, 0L, b1);
    	return this;
    }
    
    public float b1() {
    	return (float) B1_HANDLE.get(segment, 0L);
    }
    
    /// @see #b2()
    public AiMatrix4x4 b2(float b2) {
    	B2_HANDLE.set(segment, 0L, b2);
    	return this;
    }
    
    public float b2() {
    	return (float) B2_HANDLE.get(segment, 0L);
    }
    
    /// @see #b3()
    public AiMatrix4x4 b3(float b3) {
    	B3_HANDLE.set(segment, 0L, b3);
    	return this;
    }
    
    public float b3() {
    	return (float) B3_HANDLE.get(segment, 0L);
    }
    
    /// @see #b4()
    public AiMatrix4x4 b4(float b4) {
    	B4_HANDLE.set(segment, 0L, b4);
    	return this;
    }
    
    public float b4() {
    	return (float) B4_HANDLE.get(segment, 0L);
    }
    
    /// @see #c1()
    public AiMatrix4x4 c1(float c1) {
    	C1_HANDLE.set(segment, 0L, c1);
    	return this;
    }
    
    public float c1() {
    	return (float) C1_HANDLE.get(segment, 0L);
    }
    
    /// @see #c2()
    public AiMatrix4x4 c2(float c2) {
    	C2_HANDLE.set(segment, 0L, c2);
    	return this;
    }
    
    public float c2() {
    	return (float) C2_HANDLE.get(segment, 0L);
    }
    
    /// @see #c3()
    public AiMatrix4x4 c3(float c3) {
    	C3_HANDLE.set(segment, 0L, c3);
    	return this;
    }
    
    public float c3() {
    	return (float) C3_HANDLE.get(segment, 0L);
    }
    
    /// @see #c4()
    public AiMatrix4x4 c4(float c4) {
    	C4_HANDLE.set(segment, 0L, c4);
    	return this;
    }
    
    public float c4() {
    	return (float) C4_HANDLE.get(segment, 0L);
    }
    
    /// @see #d1()
    public AiMatrix4x4 d1(float d1) {
    	D1_HANDLE.set(segment, 0L, d1);
    	return this;
    }
    
    public float d1() {
    	return (float) D1_HANDLE.get(segment, 0L);
    }
    
    /// @see #d2()
    public AiMatrix4x4 d2(float d2) {
    	D2_HANDLE.set(segment, 0L, d2);
    	return this;
    }
    
    public float d2() {
    	return (float) D2_HANDLE.get(segment, 0L);
    }
    
    /// @see #d3()
    public AiMatrix4x4 d3(float d3) {
    	D3_HANDLE.set(segment, 0L, d3);
    	return this;
    }
    
    public float d3() {
    	return (float) D3_HANDLE.get(segment, 0L);
    }
    
    /// @see #d4()
    public AiMatrix4x4 d4(float d4) {
    	D4_HANDLE.set(segment, 0L, d4);
    	return this;
    }
    
    public float d4() {
    	return (float) D4_HANDLE.get(segment, 0L);
    }
    
    @Override
    public AiMatrix4x4 set(AiMatrix4x4 other) {
        return set(other.segment);
    }
    
    @Override
    public AiMatrix4x4 set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<AiMatrix4x4> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<AiMatrix4x4> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new AiMatrix4x4(segment),
            count
        );
    }
    
    public static NativeStructArray<AiMatrix4x4> array(Arena arena, AiMatrix4x4... structs) {
        NativeStructArray<AiMatrix4x4> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new AiMatrix4x4(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<AiMatrix4x4> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new AiMatrix4x4(segment)
        );
    }

}