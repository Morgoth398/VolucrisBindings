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

public final class MaAtomicUint64
		implements Struct<MaAtomicUint64> {

	public static final StructLayout LAYOUT;

	public static final VarHandle VALUE_HANDLE;

	public static final long VALUE_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_LONG.withName("value")
		).withName("ma_atomic_uint64").withByteAlignment(8);
		
		VALUE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("value"));
		
		VALUE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("value"));
		//@formatter:on
	}

	public MaAtomicUint64() {
	    this(Arena.ofAuto());
	}
	
	public MaAtomicUint64(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public MaAtomicUint64(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #value()
    public MaAtomicUint64 value(long value) {
    	VALUE_HANDLE.set(segment, 0L, value);
    	return this;
    }
    
    public long value() {
    	return (long) VALUE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public MaAtomicUint64 set(MaAtomicUint64 other) {
        return set(other.segment);
    }
    
    @Override
    public MaAtomicUint64 set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaAtomicUint64> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaAtomicUint64> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaAtomicUint64(segment),
            count
        );
    }
    
    public static NativeStructArray<MaAtomicUint64> array(SegmentAllocator allocator, MaAtomicUint64... structs) {
        NativeStructArray<MaAtomicUint64> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaAtomicUint64(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaAtomicUint64> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaAtomicUint64(segment)
        );
    }

}