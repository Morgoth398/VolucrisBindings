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

/// ```
/// *********************************************************************************************************************************************************
/// 
/// Job Queue
/// 
/// **********************************************************************************************************************************************************
/// ```
public final class MaSlotAllocatorConfig
		implements Struct<MaSlotAllocatorConfig> {

	public static final StructLayout LAYOUT;

	public static final VarHandle CAPACITY_HANDLE;

	public static final long CAPACITY_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("capacity")
		).withName("ma_slot_allocator_config").withByteAlignment(4);
		
		CAPACITY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("capacity"));
		
		CAPACITY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("capacity"));
		//@formatter:on
	}

	public MaSlotAllocatorConfig() {
	    this(Arena.ofAuto());
	}
	
	public MaSlotAllocatorConfig(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public MaSlotAllocatorConfig(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #capacity()
    public MaSlotAllocatorConfig capacity(int capacity) {
    	CAPACITY_HANDLE.set(segment, 0L, capacity);
    	return this;
    }
    
    public int capacity() {
    	return (int) CAPACITY_HANDLE.get(segment, 0L);
    }
    
    @Override
    public MaSlotAllocatorConfig set(MaSlotAllocatorConfig other) {
        return set(other.segment);
    }
    
    @Override
    public MaSlotAllocatorConfig set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaSlotAllocatorConfig> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaSlotAllocatorConfig> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaSlotAllocatorConfig(segment),
            count
        );
    }
    
    public static NativeStructArray<MaSlotAllocatorConfig> array(Arena arena, MaSlotAllocatorConfig... structs) {
        NativeStructArray<MaSlotAllocatorConfig> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaSlotAllocatorConfig(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaSlotAllocatorConfig> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaSlotAllocatorConfig(segment)
        );
    }

}