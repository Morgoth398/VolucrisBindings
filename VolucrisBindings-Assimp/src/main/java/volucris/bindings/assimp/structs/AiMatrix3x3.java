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

public final class AiMatrix3x3
		implements Struct<AiMatrix3x3> {

    public static final StructLayout LAYOUT;

    public static final VarHandle A1_HANDLE;
    public static final VarHandle A2_HANDLE;
    public static final VarHandle A3_HANDLE;
    public static final VarHandle B1_HANDLE;
    public static final VarHandle B2_HANDLE;
    public static final VarHandle B3_HANDLE;
    public static final VarHandle C1_HANDLE;
    public static final VarHandle C2_HANDLE;
    public static final VarHandle C3_HANDLE;

    public static final long A1_BYTE_OFFSET;
    public static final long A2_BYTE_OFFSET;
    public static final long A3_BYTE_OFFSET;
    public static final long B1_BYTE_OFFSET;
    public static final long B2_BYTE_OFFSET;
    public static final long B3_BYTE_OFFSET;
    public static final long C1_BYTE_OFFSET;
    public static final long C2_BYTE_OFFSET;
    public static final long C3_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_FLOAT.withName("a1"),
            JAVA_FLOAT.withName("a2"),
            JAVA_FLOAT.withName("a3"),
            JAVA_FLOAT.withName("b1"),
            JAVA_FLOAT.withName("b2"),
            JAVA_FLOAT.withName("b3"),
            JAVA_FLOAT.withName("c1"),
            JAVA_FLOAT.withName("c2"),
            JAVA_FLOAT.withName("c3")
        ).withName("aiMatrix3x3").withByteAlignment(4);
        
        A1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("a1"));
        A2_HANDLE = LAYOUT.varHandle(PathElement.groupElement("a2"));
        A3_HANDLE = LAYOUT.varHandle(PathElement.groupElement("a3"));
        B1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("b1"));
        B2_HANDLE = LAYOUT.varHandle(PathElement.groupElement("b2"));
        B3_HANDLE = LAYOUT.varHandle(PathElement.groupElement("b3"));
        C1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("c1"));
        C2_HANDLE = LAYOUT.varHandle(PathElement.groupElement("c2"));
        C3_HANDLE = LAYOUT.varHandle(PathElement.groupElement("c3"));
        
        A1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("a1"));
        A2_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("a2"));
        A3_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("a3"));
        B1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("b1"));
        B2_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("b2"));
        B3_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("b3"));
        C1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("c1"));
        C2_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("c2"));
        C3_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("c3"));
        //@formatter:on
    }

    public AiMatrix3x3() {
        this(Arena.ofAuto());
    }
    
    public AiMatrix3x3(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public AiMatrix3x3(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #a1()
    public AiMatrix3x3 a1(float a1) {
    	A1_HANDLE.set(segment, 0L, a1);
    	return this;
    }
    
    public float a1() {
    	return (float) A1_HANDLE.get(segment, 0L);
    }
    
    /// @see #a2()
    public AiMatrix3x3 a2(float a2) {
    	A2_HANDLE.set(segment, 0L, a2);
    	return this;
    }
    
    public float a2() {
    	return (float) A2_HANDLE.get(segment, 0L);
    }
    
    /// @see #a3()
    public AiMatrix3x3 a3(float a3) {
    	A3_HANDLE.set(segment, 0L, a3);
    	return this;
    }
    
    public float a3() {
    	return (float) A3_HANDLE.get(segment, 0L);
    }
    
    /// @see #b1()
    public AiMatrix3x3 b1(float b1) {
    	B1_HANDLE.set(segment, 0L, b1);
    	return this;
    }
    
    public float b1() {
    	return (float) B1_HANDLE.get(segment, 0L);
    }
    
    /// @see #b2()
    public AiMatrix3x3 b2(float b2) {
    	B2_HANDLE.set(segment, 0L, b2);
    	return this;
    }
    
    public float b2() {
    	return (float) B2_HANDLE.get(segment, 0L);
    }
    
    /// @see #b3()
    public AiMatrix3x3 b3(float b3) {
    	B3_HANDLE.set(segment, 0L, b3);
    	return this;
    }
    
    public float b3() {
    	return (float) B3_HANDLE.get(segment, 0L);
    }
    
    /// @see #c1()
    public AiMatrix3x3 c1(float c1) {
    	C1_HANDLE.set(segment, 0L, c1);
    	return this;
    }
    
    public float c1() {
    	return (float) C1_HANDLE.get(segment, 0L);
    }
    
    /// @see #c2()
    public AiMatrix3x3 c2(float c2) {
    	C2_HANDLE.set(segment, 0L, c2);
    	return this;
    }
    
    public float c2() {
    	return (float) C2_HANDLE.get(segment, 0L);
    }
    
    /// @see #c3()
    public AiMatrix3x3 c3(float c3) {
    	C3_HANDLE.set(segment, 0L, c3);
    	return this;
    }
    
    public float c3() {
    	return (float) C3_HANDLE.get(segment, 0L);
    }
    
    @Override
    public AiMatrix3x3 set(AiMatrix3x3 other) {
        return set(other.segment);
    }
    
    @Override
    public AiMatrix3x3 set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<AiMatrix3x3> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<AiMatrix3x3> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new AiMatrix3x3(segment),
            count
        );
    }
    
    public static NativeStructArray<AiMatrix3x3> array(Arena arena, AiMatrix3x3... structs) {
        NativeStructArray<AiMatrix3x3> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new AiMatrix3x3(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<AiMatrix3x3> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new AiMatrix3x3(segment)
        );
    }
    
}