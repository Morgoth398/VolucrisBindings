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

public final class MaDeviceJobThreadConfig
		implements Struct<MaDeviceJobThreadConfig> {

	public static final StructLayout LAYOUT;

	public static final VarHandle NO_THREAD_HANDLE;
	public static final VarHandle JOB_QUEUE_CAPACITY_HANDLE;
	public static final VarHandle JOB_QUEUE_FLAGS_HANDLE;

	public static final long NO_THREAD_BYTE_OFFSET;
	public static final long JOB_QUEUE_CAPACITY_BYTE_OFFSET;
	public static final long JOB_QUEUE_FLAGS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("noThread"),
		    JAVA_INT.withName("jobQueueCapacity"),
		    JAVA_INT.withName("jobQueueFlags")
		).withName("ma_device_job_thread_config").withByteAlignment(4);
		
		NO_THREAD_HANDLE = LAYOUT.varHandle(PathElement.groupElement("noThread"));
		JOB_QUEUE_CAPACITY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("jobQueueCapacity"));
		JOB_QUEUE_FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("jobQueueFlags"));
		
		NO_THREAD_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("noThread"));
		JOB_QUEUE_CAPACITY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("jobQueueCapacity"));
		JOB_QUEUE_FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("jobQueueFlags"));
		//@formatter:on
	}

	public MaDeviceJobThreadConfig() {
	    this(Arena.ofAuto());
	}
	
	public MaDeviceJobThreadConfig(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public MaDeviceJobThreadConfig(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #noThread()
    public MaDeviceJobThreadConfig noThread(int noThread) {
    	NO_THREAD_HANDLE.set(segment, 0L, noThread);
    	return this;
    }
    
    public int noThread() {
    	return (int) NO_THREAD_HANDLE.get(segment, 0L);
    }
    
    /// @see #jobQueueCapacity()
    public MaDeviceJobThreadConfig jobQueueCapacity(int jobQueueCapacity) {
    	JOB_QUEUE_CAPACITY_HANDLE.set(segment, 0L, jobQueueCapacity);
    	return this;
    }
    
    public int jobQueueCapacity() {
    	return (int) JOB_QUEUE_CAPACITY_HANDLE.get(segment, 0L);
    }
    
    /// @see #jobQueueFlags()
    public MaDeviceJobThreadConfig jobQueueFlags(int jobQueueFlags) {
    	JOB_QUEUE_FLAGS_HANDLE.set(segment, 0L, jobQueueFlags);
    	return this;
    }
    
    public int jobQueueFlags() {
    	return (int) JOB_QUEUE_FLAGS_HANDLE.get(segment, 0L);
    }
    
    @Override
    public MaDeviceJobThreadConfig set(MaDeviceJobThreadConfig other) {
        return set(other.segment);
    }
    
    @Override
    public MaDeviceJobThreadConfig set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaDeviceJobThreadConfig> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaDeviceJobThreadConfig> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaDeviceJobThreadConfig(segment),
            count
        );
    }
    
    public static NativeStructArray<MaDeviceJobThreadConfig> array(Arena arena, MaDeviceJobThreadConfig... structs) {
        NativeStructArray<MaDeviceJobThreadConfig> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaDeviceJobThreadConfig(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaDeviceJobThreadConfig> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaDeviceJobThreadConfig(segment)
        );
    }

}