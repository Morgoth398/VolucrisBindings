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

public final class MaAtomicUint32
		implements Struct<MaAtomicUint32> {

	public static final StructLayout LAYOUT;

	public static final VarHandle VALUE_HANDLE;

	public static final long VALUE_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("value")
		).withName("ma_atomic_uint32").withByteAlignment(4);
		
		VALUE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("value"));
		
		VALUE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("value"));
		//@formatter:on
	}

	public MaAtomicUint32() {
	    this(Arena.ofAuto());
	}
	
	public MaAtomicUint32(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public MaAtomicUint32(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #value()
    public MaAtomicUint32 value(int value) {
    	VALUE_HANDLE.set(segment, 0L, value);
    	return this;
    }
    
    public int value() {
    	return (int) VALUE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public MaAtomicUint32 set(MaAtomicUint32 other) {
        return set(other.segment);
    }
    
    @Override
    public MaAtomicUint32 set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaAtomicUint32> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaAtomicUint32> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaAtomicUint32(segment),
            count
        );
    }
    
    public static NativeStructArray<MaAtomicUint32> array(SegmentAllocator allocator, MaAtomicUint32... structs) {
        NativeStructArray<MaAtomicUint32> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaAtomicUint32(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaAtomicUint32> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaAtomicUint32(segment)
        );
    }

}