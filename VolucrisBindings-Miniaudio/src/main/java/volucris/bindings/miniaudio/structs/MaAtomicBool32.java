/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.miniaudio.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

public final class MaAtomicBool32
		implements Struct<MaAtomicBool32> {

	public static final StructLayout LAYOUT;

	public static final VarHandle VALUE_HANDLE;

	public static final long VALUE_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("value")
		).withName("ma_atomic_bool32").withByteAlignment(4);
		
		VALUE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("value"));
		
		VALUE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("value"));
		//@formatter:on
	}

	public MaAtomicBool32() {
	    this(Arena.ofAuto());
	}
	
	public MaAtomicBool32(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public MaAtomicBool32(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #value()
    public MaAtomicBool32 value(int value) {
    	VALUE_HANDLE.set(segment, 0L, value);
    	return this;
    }
    
    public int value() {
    	return (int) VALUE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public MaAtomicBool32 set(MaAtomicBool32 other) {
        return set(other.segment);
    }
    
    @Override
    public MaAtomicBool32 set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaAtomicBool32> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaAtomicBool32> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaAtomicBool32(segment),
            count
        );
    }
    
    public static NativeStructArray<MaAtomicBool32> array(SegmentAllocator allocator, MaAtomicBool32... structs) {
        NativeStructArray<MaAtomicBool32> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaAtomicBool32(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaAtomicBool32> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaAtomicBool32(segment)
        );
    }

}