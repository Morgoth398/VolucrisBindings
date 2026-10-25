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
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class MaJobQueue
		implements Struct<MaJobQueue> {

	public static final StructLayout LAYOUT;

	public static final VarHandle FLAGS_HANDLE;
	public static final VarHandle CAPACITY_HANDLE;
	public static final VarHandle HEAD_HANDLE;
	public static final VarHandle TAIL_HANDLE;
	public static final VarHandle SEM_HANDLE;
	public static final VarHandle P_JOBS_HANDLE;
	public static final VarHandle LOCK_HANDLE;
	public static final VarHandle _P_HEAP_HANDLE;
	public static final VarHandle _OWNS_HEAP_HANDLE;

	public static final long FLAGS_BYTE_OFFSET;
	public static final long CAPACITY_BYTE_OFFSET;
	public static final long HEAD_BYTE_OFFSET;
	public static final long TAIL_BYTE_OFFSET;
	public static final long SEM_BYTE_OFFSET;
	public static final long ALLOCATOR_BYTE_OFFSET;
	public static final long P_JOBS_BYTE_OFFSET;
	public static final long LOCK_BYTE_OFFSET;
	public static final long _P_HEAP_BYTE_OFFSET;
	public static final long _OWNS_HEAP_BYTE_OFFSET;

	private final MemorySegment segment;

	private final MaSlotAllocator allocator;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("flags"),
		    JAVA_INT.withName("capacity"),
		    JAVA_LONG.withName("head"),
		    JAVA_LONG.withName("tail"),
		    UNBOUNDED_ADDRESS.withName("sem"),
		    MaSlotAllocator.LAYOUT.withName("allocator"),
		    UNBOUNDED_ADDRESS.withName("pJobs"),
		    JAVA_INT.withName("lock"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("_pHeap"),
		    JAVA_INT.withName("_ownsHeap"),
		    MemoryLayout.paddingLayout(4)
		).withName("ma_job_queue").withByteAlignment(8);
		
		FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
		CAPACITY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("capacity"));
		HEAD_HANDLE = LAYOUT.varHandle(PathElement.groupElement("head"));
		TAIL_HANDLE = LAYOUT.varHandle(PathElement.groupElement("tail"));
		SEM_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sem"));
		P_JOBS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pJobs"));
		LOCK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("lock"));
		_P_HEAP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("_pHeap"));
		_OWNS_HEAP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("_ownsHeap"));
		
		FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
		CAPACITY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("capacity"));
		HEAD_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("head"));
		TAIL_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("tail"));
		SEM_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sem"));
		ALLOCATOR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("allocator"));
		P_JOBS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pJobs"));
		LOCK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("lock"));
		_P_HEAP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("_pHeap"));
		_OWNS_HEAP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("_ownsHeap"));
		//@formatter:on
	}

	public MaJobQueue() {
	    this(Arena.ofAuto());
	}
	
	public MaJobQueue(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public MaJobQueue(MemorySegment segment) {
	    this.segment = segment;
	
	    allocator = new MaSlotAllocator(segment.asSlice(ALLOCATOR_BYTE_OFFSET, MaSlotAllocator.LAYOUT));
	}

    /// @see #flags()
    public MaJobQueue flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #capacity()
    public MaJobQueue capacity(int capacity) {
    	CAPACITY_HANDLE.set(segment, 0L, capacity);
    	return this;
    }
    
    public int capacity() {
    	return (int) CAPACITY_HANDLE.get(segment, 0L);
    }
    
    /// @see #head()
    public MaJobQueue head(long head) {
    	HEAD_HANDLE.set(segment, 0L, head);
    	return this;
    }
    
    public long head() {
    	return (long) HEAD_HANDLE.get(segment, 0L);
    }
    
    /// @see #tail()
    public MaJobQueue tail(long tail) {
    	TAIL_HANDLE.set(segment, 0L, tail);
    	return this;
    }
    
    public long tail() {
    	return (long) TAIL_HANDLE.get(segment, 0L);
    }
    
    /// @see #sem()
    public MaJobQueue sem(MemorySegment sem) {
    	SEM_HANDLE.set(segment, 0L, sem);
    	return this;
    }
    
    public @Nullable MemorySegment sem() {
    	MemorySegment segment = (MemorySegment) SEM_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #allocator()
    public MaJobQueue allocator(Consumer<MaSlotAllocator> consumer) {
    	consumer.accept(allocator);
    	return this;
    }
    
    /// @see #allocator()
    public MaJobQueue allocator(MaSlotAllocator other) {
    	allocator.set(other);
    	return this;
    }
    
    public MaSlotAllocator allocator() {
    	return allocator;
    }
    
    /// @see #pJobs()
    public MaJobQueue pJobs(MaJob pJobs) {
    	P_JOBS_HANDLE.set(segment, 0L, pJobs.memorySegment());
    	return this;
    }
    
    public @Nullable MaJob pJobs() {
    	MemorySegment segment = (MemorySegment) P_JOBS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaJob(segment);
    }
    
    /// @see #lock()
    public MaJobQueue lock(int lock) {
    	LOCK_HANDLE.set(segment, 0L, lock);
    	return this;
    }
    
    public int lock() {
    	return (int) LOCK_HANDLE.get(segment, 0L);
    }
    
    /// @see #_pHeap()
    public MaJobQueue _pHeap(MemorySegment _pHeap) {
    	_P_HEAP_HANDLE.set(segment, 0L, _pHeap);
    	return this;
    }
    
    public @Nullable MemorySegment _pHeap() {
    	MemorySegment segment = (MemorySegment) _P_HEAP_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #_ownsHeap()
    public MaJobQueue _ownsHeap(int _ownsHeap) {
    	_OWNS_HEAP_HANDLE.set(segment, 0L, _ownsHeap);
    	return this;
    }
    
    public int _ownsHeap() {
    	return (int) _OWNS_HEAP_HANDLE.get(segment, 0L);
    }
    
    @Override
    public MaJobQueue set(MaJobQueue other) {
        return set(other.segment);
    }
    
    @Override
    public MaJobQueue set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaJobQueue> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaJobQueue> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaJobQueue(segment),
            count
        );
    }
    
    public static NativeStructArray<MaJobQueue> array(SegmentAllocator allocator, MaJobQueue... structs) {
        NativeStructArray<MaJobQueue> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaJobQueue(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaJobQueue> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaJobQueue(segment)
        );
    }

}