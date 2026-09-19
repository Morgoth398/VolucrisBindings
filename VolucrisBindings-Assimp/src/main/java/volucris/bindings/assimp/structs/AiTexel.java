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
/// @brief Helper structure to represent a texel in a ARGB8888 format
/// 
/// Used by aiTexture.
/// ```
public final class AiTexel
		implements Struct<AiTexel> {

    public static final StructLayout LAYOUT;

    public static final VarHandle B_HANDLE;
    public static final VarHandle G_HANDLE;
    public static final VarHandle R_HANDLE;
    public static final VarHandle A_HANDLE;

    public static final long B_BYTE_OFFSET;
    public static final long G_BYTE_OFFSET;
    public static final long R_BYTE_OFFSET;
    public static final long A_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_BYTE.withName("b"),
            JAVA_BYTE.withName("g"),
            JAVA_BYTE.withName("r"),
            JAVA_BYTE.withName("a")
        ).withName("aiTexel").withByteAlignment(1);
        
        B_HANDLE = LAYOUT.varHandle(PathElement.groupElement("b"));
        G_HANDLE = LAYOUT.varHandle(PathElement.groupElement("g"));
        R_HANDLE = LAYOUT.varHandle(PathElement.groupElement("r"));
        A_HANDLE = LAYOUT.varHandle(PathElement.groupElement("a"));
        
        B_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("b"));
        G_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("g"));
        R_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("r"));
        A_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("a"));
        //@formatter:on
    }

    public AiTexel() {
        this(Arena.ofAuto());
    }
    
    public AiTexel(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public AiTexel(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #b()
    public AiTexel b(byte b) {
    	B_HANDLE.set(segment, 0L, b);
    	return this;
    }
    
    public byte b() {
    	return (byte) B_HANDLE.get(segment, 0L);
    }
    
    /// @see #g()
    public AiTexel g(byte g) {
    	G_HANDLE.set(segment, 0L, g);
    	return this;
    }
    
    public byte g() {
    	return (byte) G_HANDLE.get(segment, 0L);
    }
    
    /// @see #r()
    public AiTexel r(byte r) {
    	R_HANDLE.set(segment, 0L, r);
    	return this;
    }
    
    public byte r() {
    	return (byte) R_HANDLE.get(segment, 0L);
    }
    
    /// @see #a()
    public AiTexel a(byte a) {
    	A_HANDLE.set(segment, 0L, a);
    	return this;
    }
    
    public byte a() {
    	return (byte) A_HANDLE.get(segment, 0L);
    }
    
    @Override
    public AiTexel set(AiTexel other) {
        return set(other.segment);
    }
    
    @Override
    public AiTexel set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<AiTexel> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<AiTexel> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new AiTexel(segment),
            count
        );
    }
    
    public static NativeStructArray<AiTexel> array(Arena arena, AiTexel... structs) {
        NativeStructArray<AiTexel> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new AiTexel(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<AiTexel> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new AiTexel(segment)
        );
    }
    
}