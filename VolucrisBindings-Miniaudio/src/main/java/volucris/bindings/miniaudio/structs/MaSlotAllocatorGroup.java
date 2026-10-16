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

public final class MaSlotAllocatorGroup
		implements Struct<MaSlotAllocatorGroup> {

	public static final StructLayout LAYOUT;

	public static final VarHandle BITFIELD_HANDLE;

	public static final long BITFIELD_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("bitfield")
		).withName("ma_slot_allocator_group").withByteAlignment(4);
		
		BITFIELD_HANDLE = LAYOUT.varHandle(PathElement.groupElement("bitfield"));
		
		BITFIELD_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("bitfield"));
		//@formatter:on
	}

	public MaSlotAllocatorGroup() {
	    this(Arena.ofAuto());
	}
	
	public MaSlotAllocatorGroup(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public MaSlotAllocatorGroup(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #bitfield()
    public MaSlotAllocatorGroup bitfield(int bitfield) {
    	BITFIELD_HANDLE.set(segment, 0L, bitfield);
    	return this;
    }
    
    public int bitfield() {
    	return (int) BITFIELD_HANDLE.get(segment, 0L);
    }
    
    @Override
    public MaSlotAllocatorGroup set(MaSlotAllocatorGroup other) {
        return set(other.segment);
    }
    
    @Override
    public MaSlotAllocatorGroup set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaSlotAllocatorGroup> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaSlotAllocatorGroup> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaSlotAllocatorGroup(segment),
            count
        );
    }
    
    public static NativeStructArray<MaSlotAllocatorGroup> array(Arena arena, MaSlotAllocatorGroup... structs) {
        NativeStructArray<MaSlotAllocatorGroup> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaSlotAllocatorGroup(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaSlotAllocatorGroup> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaSlotAllocatorGroup(segment)
        );
    }

}