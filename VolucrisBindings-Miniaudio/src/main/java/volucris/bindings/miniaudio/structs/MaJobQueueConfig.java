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

public final class MaJobQueueConfig
		implements Struct<MaJobQueueConfig> {

	public static final StructLayout LAYOUT;

	public static final VarHandle FLAGS_HANDLE;
	public static final VarHandle CAPACITY_HANDLE;

	public static final long FLAGS_BYTE_OFFSET;
	public static final long CAPACITY_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("flags"),
		    JAVA_INT.withName("capacity")
		).withName("ma_job_queue_config").withByteAlignment(4);
		
		FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
		CAPACITY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("capacity"));
		
		FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
		CAPACITY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("capacity"));
		//@formatter:on
	}

	public MaJobQueueConfig() {
	    this(Arena.ofAuto());
	}
	
	public MaJobQueueConfig(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public MaJobQueueConfig(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #flags()
    public MaJobQueueConfig flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #capacity()
    public MaJobQueueConfig capacity(int capacity) {
    	CAPACITY_HANDLE.set(segment, 0L, capacity);
    	return this;
    }
    
    public int capacity() {
    	return (int) CAPACITY_HANDLE.get(segment, 0L);
    }
    
    @Override
    public MaJobQueueConfig set(MaJobQueueConfig other) {
        return set(other.segment);
    }
    
    @Override
    public MaJobQueueConfig set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaJobQueueConfig> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaJobQueueConfig> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaJobQueueConfig(segment),
            count
        );
    }
    
    public static NativeStructArray<MaJobQueueConfig> array(SegmentAllocator allocator, MaJobQueueConfig... structs) {
        NativeStructArray<MaJobQueueConfig> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaJobQueueConfig(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaJobQueueConfig> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaJobQueueConfig(segment)
        );
    }

}