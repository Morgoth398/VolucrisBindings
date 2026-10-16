/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.miniaudio.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeIntArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class MaSlotAllocator
		implements Struct<MaSlotAllocator> {

	public static final StructLayout LAYOUT;

	public static final VarHandle P_GROUPS_HANDLE;
	public static final VarHandle P_SLOTS_HANDLE;
	public static final VarHandle COUNT_HANDLE;
	public static final VarHandle CAPACITY_HANDLE;
	public static final VarHandle _OWNS_HEAP_HANDLE;
	public static final VarHandle _P_HEAP_HANDLE;

	public static final long P_GROUPS_BYTE_OFFSET;
	public static final long P_SLOTS_BYTE_OFFSET;
	public static final long COUNT_BYTE_OFFSET;
	public static final long CAPACITY_BYTE_OFFSET;
	public static final long _OWNS_HEAP_BYTE_OFFSET;
	public static final long _P_HEAP_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    UNBOUNDED_ADDRESS.withName("pGroups"),
		    UNBOUNDED_ADDRESS.withName("pSlots"),
		    JAVA_INT.withName("count"),
		    JAVA_INT.withName("capacity"),
		    JAVA_INT.withName("_ownsHeap"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("_pHeap")
		).withName("ma_slot_allocator").withByteAlignment(8);
		
		P_GROUPS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pGroups"));
		P_SLOTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pSlots"));
		COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("count"));
		CAPACITY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("capacity"));
		_OWNS_HEAP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("_ownsHeap"));
		_P_HEAP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("_pHeap"));
		
		P_GROUPS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pGroups"));
		P_SLOTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pSlots"));
		COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("count"));
		CAPACITY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("capacity"));
		_OWNS_HEAP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("_ownsHeap"));
		_P_HEAP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("_pHeap"));
		//@formatter:on
	}

	public MaSlotAllocator() {
	    this(Arena.ofAuto());
	}
	
	public MaSlotAllocator(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public MaSlotAllocator(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #pGroups()
    public MaSlotAllocator pGroups(MaSlotAllocatorGroup pGroups) {
    	P_GROUPS_HANDLE.set(segment, 0L, pGroups.memorySegment());
    	return this;
    }
    
    public @Nullable MaSlotAllocatorGroup pGroups() {
    	MemorySegment segment = (MemorySegment) P_GROUPS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaSlotAllocatorGroup(segment);
    }
    
    /// @see #pSlots()
    public MaSlotAllocator pSlots(NativeIntArray pSlots) {
    	P_SLOTS_HANDLE.set(segment, 0L, pSlots.memorySegment());
    	return this;
    }
    
    public @Nullable NativeIntArray pSlots() {
    	MemorySegment segment = (MemorySegment) P_SLOTS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeIntArray(segment);
    }
    
    /// @see #count()
    public MaSlotAllocator count(int count) {
    	COUNT_HANDLE.set(segment, 0L, count);
    	return this;
    }
    
    public int count() {
    	return (int) COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #capacity()
    public MaSlotAllocator capacity(int capacity) {
    	CAPACITY_HANDLE.set(segment, 0L, capacity);
    	return this;
    }
    
    public int capacity() {
    	return (int) CAPACITY_HANDLE.get(segment, 0L);
    }
    
    /// @see #_ownsHeap()
    public MaSlotAllocator _ownsHeap(int _ownsHeap) {
    	_OWNS_HEAP_HANDLE.set(segment, 0L, _ownsHeap);
    	return this;
    }
    
    public int _ownsHeap() {
    	return (int) _OWNS_HEAP_HANDLE.get(segment, 0L);
    }
    
    /// @see #_pHeap()
    public MaSlotAllocator _pHeap(MemorySegment _pHeap) {
    	_P_HEAP_HANDLE.set(segment, 0L, _pHeap);
    	return this;
    }
    
    public @Nullable MemorySegment _pHeap() {
    	MemorySegment segment = (MemorySegment) _P_HEAP_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    @Override
    public MaSlotAllocator set(MaSlotAllocator other) {
        return set(other.segment);
    }
    
    @Override
    public MaSlotAllocator set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaSlotAllocator> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaSlotAllocator> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaSlotAllocator(segment),
            count
        );
    }
    
    public static NativeStructArray<MaSlotAllocator> array(Arena arena, MaSlotAllocator... structs) {
        NativeStructArray<MaSlotAllocator> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaSlotAllocator(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaSlotAllocator> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaSlotAllocator(segment)
        );
    }

}