/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.miniaudio.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class MaDeviceJobThread
		implements Struct<MaDeviceJobThread> {

	public static final StructLayout LAYOUT;

	public static final VarHandle THREAD_HANDLE;
	public static final VarHandle _HAS_THREAD_HANDLE;

	public static final long THREAD_BYTE_OFFSET;
	public static final long JOB_QUEUE_BYTE_OFFSET;
	public static final long _HAS_THREAD_BYTE_OFFSET;

	private final MemorySegment segment;

	private final MaJobQueue jobQueue;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    UNBOUNDED_ADDRESS.withName("thread"),
		    MaJobQueue.LAYOUT.withName("jobQueue"),
		    JAVA_INT.withName("_hasThread"),
		    MemoryLayout.paddingLayout(4)
		).withName("ma_device_job_thread").withByteAlignment(8);
		
		THREAD_HANDLE = LAYOUT.varHandle(PathElement.groupElement("thread"));
		_HAS_THREAD_HANDLE = LAYOUT.varHandle(PathElement.groupElement("_hasThread"));
		
		THREAD_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("thread"));
		JOB_QUEUE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("jobQueue"));
		_HAS_THREAD_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("_hasThread"));
		//@formatter:on
	}

	public MaDeviceJobThread() {
	    this(Arena.ofAuto());
	}
	
	public MaDeviceJobThread(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public MaDeviceJobThread(MemorySegment segment) {
	    this.segment = segment;
	
	    jobQueue = new MaJobQueue(segment.asSlice(JOB_QUEUE_BYTE_OFFSET, MaJobQueue.LAYOUT));
	}

    /// @see #thread()
    public MaDeviceJobThread thread(MemorySegment thread) {
    	THREAD_HANDLE.set(segment, 0L, thread);
    	return this;
    }
    
    public @Nullable MemorySegment thread() {
    	MemorySegment segment = (MemorySegment) THREAD_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #jobQueue()
    public MaDeviceJobThread jobQueue(Consumer<MaJobQueue> consumer) {
    	consumer.accept(jobQueue);
    	return this;
    }
    
    /// @see #jobQueue()
    public MaDeviceJobThread jobQueue(MaJobQueue other) {
    	jobQueue.set(other);
    	return this;
    }
    
    public MaJobQueue jobQueue() {
    	return jobQueue;
    }
    
    /// @see #_hasThread()
    public MaDeviceJobThread _hasThread(int _hasThread) {
    	_HAS_THREAD_HANDLE.set(segment, 0L, _hasThread);
    	return this;
    }
    
    public int _hasThread() {
    	return (int) _HAS_THREAD_HANDLE.get(segment, 0L);
    }
    
    @Override
    public MaDeviceJobThread set(MaDeviceJobThread other) {
        return set(other.segment);
    }
    
    @Override
    public MaDeviceJobThread set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaDeviceJobThread> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaDeviceJobThread> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaDeviceJobThread(segment),
            count
        );
    }
    
    public static NativeStructArray<MaDeviceJobThread> array(Arena arena, MaDeviceJobThread... structs) {
        NativeStructArray<MaDeviceJobThread> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaDeviceJobThread(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaDeviceJobThread> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaDeviceJobThread(segment)
        );
    }

}