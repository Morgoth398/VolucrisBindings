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
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

public final class MaNodeInputBus
		implements Struct<MaNodeInputBus> {

	public static final StructLayout LAYOUT;

	public static final VarHandle NEXT_COUNTER_HANDLE;
	public static final VarHandle LOCK_HANDLE;
	public static final VarHandle CHANNELS_HANDLE;

	public static final long HEAD_BYTE_OFFSET;
	public static final long NEXT_COUNTER_BYTE_OFFSET;
	public static final long LOCK_BYTE_OFFSET;
	public static final long CHANNELS_BYTE_OFFSET;

	private final MemorySegment segment;

	private final MaNodeOutputBus head;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    MaNodeOutputBus.LAYOUT.withName("head"),
		    JAVA_INT.withName("nextCounter"),
		    JAVA_INT.withName("lock"),
		    JAVA_BYTE.withName("channels"),
		    MemoryLayout.paddingLayout(7)
		).withName("ma_node_input_bus").withByteAlignment(8);
		
		NEXT_COUNTER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("nextCounter"));
		LOCK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("lock"));
		CHANNELS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("channels"));
		
		HEAD_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("head"));
		NEXT_COUNTER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("nextCounter"));
		LOCK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("lock"));
		CHANNELS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("channels"));
		//@formatter:on
	}

	public MaNodeInputBus() {
	    this(Arena.ofAuto());
	}
	
	public MaNodeInputBus(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public MaNodeInputBus(MemorySegment segment) {
	    this.segment = segment;
	
	    head = new MaNodeOutputBus(segment.asSlice(HEAD_BYTE_OFFSET, MaNodeOutputBus.LAYOUT));
	}

    /// @see #head()
    public MaNodeInputBus head(Consumer<MaNodeOutputBus> consumer) {
    	consumer.accept(head);
    	return this;
    }
    
    /// @see #head()
    public MaNodeInputBus head(MaNodeOutputBus other) {
    	head.set(other);
    	return this;
    }
    
    public MaNodeOutputBus head() {
    	return head;
    }
    
    /// @see #nextCounter()
    public MaNodeInputBus nextCounter(int nextCounter) {
    	NEXT_COUNTER_HANDLE.set(segment, 0L, nextCounter);
    	return this;
    }
    
    public int nextCounter() {
    	return (int) NEXT_COUNTER_HANDLE.get(segment, 0L);
    }
    
    /// @see #lock()
    public MaNodeInputBus lock(int lock) {
    	LOCK_HANDLE.set(segment, 0L, lock);
    	return this;
    }
    
    public int lock() {
    	return (int) LOCK_HANDLE.get(segment, 0L);
    }
    
    /// @see #channels()
    public MaNodeInputBus channels(byte channels) {
    	CHANNELS_HANDLE.set(segment, 0L, channels);
    	return this;
    }
    
    public byte channels() {
    	return (byte) CHANNELS_HANDLE.get(segment, 0L);
    }
    
    @Override
    public MaNodeInputBus set(MaNodeInputBus other) {
        return set(other.segment);
    }
    
    @Override
    public MaNodeInputBus set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaNodeInputBus> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaNodeInputBus> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaNodeInputBus(segment),
            count
        );
    }
    
    public static NativeStructArray<MaNodeInputBus> array(SegmentAllocator allocator, MaNodeInputBus... structs) {
        NativeStructArray<MaNodeInputBus> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaNodeInputBus(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaNodeInputBus> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaNodeInputBus(segment)
        );
    }

}