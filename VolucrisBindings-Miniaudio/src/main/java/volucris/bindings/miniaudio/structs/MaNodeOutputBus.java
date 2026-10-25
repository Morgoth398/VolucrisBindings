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
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class MaNodeOutputBus
		implements Struct<MaNodeOutputBus> {

	public static final StructLayout LAYOUT;

	public static final VarHandle P_NODE_HANDLE;
	public static final VarHandle OUTPUT_BUS_INDEX_HANDLE;
	public static final VarHandle CHANNELS_HANDLE;
	public static final VarHandle INPUT_NODE_INPUT_BUS_INDEX_HANDLE;
	public static final VarHandle FLAGS_HANDLE;
	public static final VarHandle REF_COUNT_HANDLE;
	public static final VarHandle IS_ATTACHED_HANDLE;
	public static final VarHandle LOCK_HANDLE;
	public static final VarHandle VOLUME_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle P_PREV_HANDLE;
	public static final VarHandle P_INPUT_NODE_HANDLE;

	public static final long P_NODE_BYTE_OFFSET;
	public static final long OUTPUT_BUS_INDEX_BYTE_OFFSET;
	public static final long CHANNELS_BYTE_OFFSET;
	public static final long INPUT_NODE_INPUT_BUS_INDEX_BYTE_OFFSET;
	public static final long FLAGS_BYTE_OFFSET;
	public static final long REF_COUNT_BYTE_OFFSET;
	public static final long IS_ATTACHED_BYTE_OFFSET;
	public static final long LOCK_BYTE_OFFSET;
	public static final long VOLUME_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long P_PREV_BYTE_OFFSET;
	public static final long P_INPUT_NODE_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    UNBOUNDED_ADDRESS.withName("pNode"),
		    JAVA_BYTE.withName("outputBusIndex"),
		    JAVA_BYTE.withName("channels"),
		    JAVA_BYTE.withName("inputNodeInputBusIndex"),
		    MemoryLayout.paddingLayout(1),
		    JAVA_INT.withName("flags"),
		    JAVA_INT.withName("refCount"),
		    JAVA_INT.withName("isAttached"),
		    JAVA_INT.withName("lock"),
		    JAVA_FLOAT.withName("volume"),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    UNBOUNDED_ADDRESS.withName("pPrev"),
		    UNBOUNDED_ADDRESS.withName("pInputNode")
		).withName("ma_node_output_bus").withByteAlignment(8);
		
		P_NODE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNode"));
		OUTPUT_BUS_INDEX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("outputBusIndex"));
		CHANNELS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("channels"));
		INPUT_NODE_INPUT_BUS_INDEX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("inputNodeInputBusIndex"));
		FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
		REF_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("refCount"));
		IS_ATTACHED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("isAttached"));
		LOCK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("lock"));
		VOLUME_HANDLE = LAYOUT.varHandle(PathElement.groupElement("volume"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		P_PREV_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pPrev"));
		P_INPUT_NODE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pInputNode"));
		
		P_NODE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNode"));
		OUTPUT_BUS_INDEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("outputBusIndex"));
		CHANNELS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("channels"));
		INPUT_NODE_INPUT_BUS_INDEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("inputNodeInputBusIndex"));
		FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
		REF_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("refCount"));
		IS_ATTACHED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("isAttached"));
		LOCK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("lock"));
		VOLUME_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("volume"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		P_PREV_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pPrev"));
		P_INPUT_NODE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pInputNode"));
		//@formatter:on
	}

	public MaNodeOutputBus() {
	    this(Arena.ofAuto());
	}
	
	public MaNodeOutputBus(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public MaNodeOutputBus(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #pNode()
    public MaNodeOutputBus pNode(MemorySegment pNode) {
    	P_NODE_HANDLE.set(segment, 0L, pNode);
    	return this;
    }
    
    public @Nullable MemorySegment pNode() {
    	MemorySegment segment = (MemorySegment) P_NODE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #outputBusIndex()
    public MaNodeOutputBus outputBusIndex(byte outputBusIndex) {
    	OUTPUT_BUS_INDEX_HANDLE.set(segment, 0L, outputBusIndex);
    	return this;
    }
    
    public byte outputBusIndex() {
    	return (byte) OUTPUT_BUS_INDEX_HANDLE.get(segment, 0L);
    }
    
    /// @see #channels()
    public MaNodeOutputBus channels(byte channels) {
    	CHANNELS_HANDLE.set(segment, 0L, channels);
    	return this;
    }
    
    public byte channels() {
    	return (byte) CHANNELS_HANDLE.get(segment, 0L);
    }
    
    /// @see #inputNodeInputBusIndex()
    public MaNodeOutputBus inputNodeInputBusIndex(byte inputNodeInputBusIndex) {
    	INPUT_NODE_INPUT_BUS_INDEX_HANDLE.set(segment, 0L, inputNodeInputBusIndex);
    	return this;
    }
    
    public byte inputNodeInputBusIndex() {
    	return (byte) INPUT_NODE_INPUT_BUS_INDEX_HANDLE.get(segment, 0L);
    }
    
    /// @see #flags()
    public MaNodeOutputBus flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #refCount()
    public MaNodeOutputBus refCount(int refCount) {
    	REF_COUNT_HANDLE.set(segment, 0L, refCount);
    	return this;
    }
    
    public int refCount() {
    	return (int) REF_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #isAttached()
    public MaNodeOutputBus isAttached(int isAttached) {
    	IS_ATTACHED_HANDLE.set(segment, 0L, isAttached);
    	return this;
    }
    
    public int isAttached() {
    	return (int) IS_ATTACHED_HANDLE.get(segment, 0L);
    }
    
    /// @see #lock()
    public MaNodeOutputBus lock(int lock) {
    	LOCK_HANDLE.set(segment, 0L, lock);
    	return this;
    }
    
    public int lock() {
    	return (int) LOCK_HANDLE.get(segment, 0L);
    }
    
    /// @see #volume()
    public MaNodeOutputBus volume(float volume) {
    	VOLUME_HANDLE.set(segment, 0L, volume);
    	return this;
    }
    
    public float volume() {
    	return (float) VOLUME_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public MaNodeOutputBus pNext(MaNodeOutputBus pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext.memorySegment());
    	return this;
    }
    
    public @Nullable MaNodeOutputBus pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaNodeOutputBus(segment);
    }
    
    /// @see #pPrev()
    public MaNodeOutputBus pPrev(MaNodeOutputBus pPrev) {
    	P_PREV_HANDLE.set(segment, 0L, pPrev.memorySegment());
    	return this;
    }
    
    public @Nullable MaNodeOutputBus pPrev() {
    	MemorySegment segment = (MemorySegment) P_PREV_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaNodeOutputBus(segment);
    }
    
    /// @see #pInputNode()
    public MaNodeOutputBus pInputNode(MemorySegment pInputNode) {
    	P_INPUT_NODE_HANDLE.set(segment, 0L, pInputNode);
    	return this;
    }
    
    public @Nullable MemorySegment pInputNode() {
    	MemorySegment segment = (MemorySegment) P_INPUT_NODE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    @Override
    public MaNodeOutputBus set(MaNodeOutputBus other) {
        return set(other.segment);
    }
    
    @Override
    public MaNodeOutputBus set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaNodeOutputBus> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaNodeOutputBus> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaNodeOutputBus(segment),
            count
        );
    }
    
    public static NativeStructArray<MaNodeOutputBus> array(SegmentAllocator allocator, MaNodeOutputBus... structs) {
        NativeStructArray<MaNodeOutputBus> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaNodeOutputBus(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaNodeOutputBus> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaNodeOutputBus(segment)
        );
    }

}