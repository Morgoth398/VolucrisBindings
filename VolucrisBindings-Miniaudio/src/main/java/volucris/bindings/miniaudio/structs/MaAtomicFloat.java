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

public final class MaAtomicFloat
		implements Struct<MaAtomicFloat> {

	public static final StructLayout LAYOUT;

	public static final VarHandle VALUE_HANDLE;

	public static final long VALUE_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_FLOAT.withName("value")
		).withName("ma_atomic_float").withByteAlignment(4);
		
		VALUE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("value"));
		
		VALUE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("value"));
		//@formatter:on
	}

	public MaAtomicFloat() {
	    this(Arena.ofAuto());
	}
	
	public MaAtomicFloat(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public MaAtomicFloat(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #value()
    public MaAtomicFloat value(float value) {
    	VALUE_HANDLE.set(segment, 0L, value);
    	return this;
    }
    
    public float value() {
    	return (float) VALUE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public MaAtomicFloat set(MaAtomicFloat other) {
        return set(other.segment);
    }
    
    @Override
    public MaAtomicFloat set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaAtomicFloat> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaAtomicFloat> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaAtomicFloat(segment),
            count
        );
    }
    
    public static NativeStructArray<MaAtomicFloat> array(Arena arena, MaAtomicFloat... structs) {
        NativeStructArray<MaAtomicFloat> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaAtomicFloat(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaAtomicFloat> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaAtomicFloat(segment)
        );
    }

}