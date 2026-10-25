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

public final class MaLog
		implements Struct<MaLog> {

	public static final StructLayout LAYOUT;

	public static final VarHandle CALLBACK_COUNT_HANDLE;
	public static final VarHandle LOCK_HANDLE;

	public static final long CALLBACKS_BYTE_OFFSET;
	public static final long CALLBACK_COUNT_BYTE_OFFSET;
	public static final long ALLOCATION_CALLBACKS_BYTE_OFFSET;
	public static final long LOCK_BYTE_OFFSET;

	private final MemorySegment segment;

	private final MaLogCallback[] callbacks;
	private final MaAllocationCallbacks allocationCallbacks;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    MemoryLayout.sequenceLayout(4, MaLogCallback.LAYOUT).withName("callbacks"),
		    JAVA_INT.withName("callbackCount"),
		    MemoryLayout.paddingLayout(4),
		    MaAllocationCallbacks.LAYOUT.withName("allocationCallbacks"),
		    UNBOUNDED_ADDRESS.withName("lock")
		).withName("ma_log").withByteAlignment(8);
		
		CALLBACK_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("callbackCount"));
		LOCK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("lock"));
		
		CALLBACKS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("callbacks"));
		CALLBACK_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("callbackCount"));
		ALLOCATION_CALLBACKS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("allocationCallbacks"));
		LOCK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("lock"));
		//@formatter:on
	}

	public MaLog() {
	    this(Arena.ofAuto());
	}
	
	public MaLog(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public MaLog(MemorySegment segment) {
	    this.segment = segment;
	
	    callbacks = new MaLogCallback[4];
	    for (int i = 0; i < 4; i++) {
	        long offset = CALLBACKS_BYTE_OFFSET + i * MaLogCallback.LAYOUT.byteSize();
	        callbacks[i] = new MaLogCallback(segment.asSlice(offset, MaLogCallback.LAYOUT));
	    }
	    allocationCallbacks = new MaAllocationCallbacks(segment.asSlice(ALLOCATION_CALLBACKS_BYTE_OFFSET, MaAllocationCallbacks.LAYOUT));
	}

    /// @see #callbacks(int)
    public MaLog callbacks(Consumer<MaLogCallback> consumer, int index) {
    	consumer.accept(callbacks[index]);
    	return this;
    }
    
    /// @see #callbacks(int)
    public MaLog callbacks(MaLogCallback other, int index) {
    	callbacks[index].set(other);
    	return this;
    }
    
    public MaLogCallback callbacks(int index) {
    	return callbacks[index];
    }
    
    /// @see #callbackCount()
    public MaLog callbackCount(int callbackCount) {
    	CALLBACK_COUNT_HANDLE.set(segment, 0L, callbackCount);
    	return this;
    }
    
    public int callbackCount() {
    	return (int) CALLBACK_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #allocationCallbacks()
    public MaLog allocationCallbacks(Consumer<MaAllocationCallbacks> consumer) {
    	consumer.accept(allocationCallbacks);
    	return this;
    }
    
    /// @see #allocationCallbacks()
    public MaLog allocationCallbacks(MaAllocationCallbacks other) {
    	allocationCallbacks.set(other);
    	return this;
    }
    
    public MaAllocationCallbacks allocationCallbacks() {
    	return allocationCallbacks;
    }
    
    /// @see #lock()
    public MaLog lock(MemorySegment lock) {
    	LOCK_HANDLE.set(segment, 0L, lock);
    	return this;
    }
    
    public @Nullable MemorySegment lock() {
    	MemorySegment segment = (MemorySegment) LOCK_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    @Override
    public MaLog set(MaLog other) {
        return set(other.segment);
    }
    
    @Override
    public MaLog set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaLog> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaLog> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaLog(segment),
            count
        );
    }
    
    public static NativeStructArray<MaLog> array(SegmentAllocator allocator, MaLog... structs) {
        NativeStructArray<MaLog> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaLog(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaLog> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaLog(segment)
        );
    }

}