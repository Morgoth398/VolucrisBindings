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

public final class MaAtomicDeviceState
		implements Struct<MaAtomicDeviceState> {

	public static final StructLayout LAYOUT;

	public static final VarHandle VALUE_HANDLE;

	public static final long VALUE_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("value")
		).withName("ma_atomic_device_state").withByteAlignment(4);
		
		VALUE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("value"));
		
		VALUE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("value"));
		//@formatter:on
	}

	public MaAtomicDeviceState() {
	    this(Arena.ofAuto());
	}
	
	public MaAtomicDeviceState(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public MaAtomicDeviceState(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #value()
    public MaAtomicDeviceState value(int value) {
    	VALUE_HANDLE.set(segment, 0L, value);
    	return this;
    }
    
    public int value() {
    	return (int) VALUE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public MaAtomicDeviceState set(MaAtomicDeviceState other) {
        return set(other.segment);
    }
    
    @Override
    public MaAtomicDeviceState set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaAtomicDeviceState> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaAtomicDeviceState> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaAtomicDeviceState(segment),
            count
        );
    }
    
    public static NativeStructArray<MaAtomicDeviceState> array(Arena arena, MaAtomicDeviceState... structs) {
        NativeStructArray<MaAtomicDeviceState> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaAtomicDeviceState(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaAtomicDeviceState> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaAtomicDeviceState(segment)
        );
    }

}