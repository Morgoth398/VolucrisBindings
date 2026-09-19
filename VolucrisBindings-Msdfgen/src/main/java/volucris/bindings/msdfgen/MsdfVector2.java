/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.msdfgen;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

public final class MsdfVector2
		implements Struct<MsdfVector2> {

    public static final StructLayout LAYOUT;

    public static final VarHandle X_HANDLE;
    public static final VarHandle Y_HANDLE;

    public static final long X_BYTE_OFFSET;
    public static final long Y_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_DOUBLE.withName("x"),
            JAVA_DOUBLE.withName("y")
        ).withName("msdf_vector2").withByteAlignment(8);
        
        X_HANDLE = LAYOUT.varHandle(PathElement.groupElement("x"));
        Y_HANDLE = LAYOUT.varHandle(PathElement.groupElement("y"));
        
        X_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("x"));
        Y_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("y"));
        //@formatter:on
    }

    public MsdfVector2() {
        this(Arena.ofAuto());
    }
    
    public MsdfVector2(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public MsdfVector2(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #x()
    public MsdfVector2 x(double x) {
    	X_HANDLE.set(segment, 0L, x);
    	return this;
    }
    
    public double x() {
    	return (double) X_HANDLE.get(segment, 0L);
    }
    
    /// @see #y()
    public MsdfVector2 y(double y) {
    	Y_HANDLE.set(segment, 0L, y);
    	return this;
    }
    
    public double y() {
    	return (double) Y_HANDLE.get(segment, 0L);
    }
    
    @Override
    public MsdfVector2 set(MsdfVector2 other) {
        return set(other.segment);
    }
    
    @Override
    public MsdfVector2 set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MsdfVector2> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MsdfVector2> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MsdfVector2(segment),
            count
        );
    }
    
    public static NativeStructArray<MsdfVector2> array(Arena arena, MsdfVector2... structs) {
        NativeStructArray<MsdfVector2> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MsdfVector2(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MsdfVector2> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MsdfVector2(segment)
        );
    }
    
}