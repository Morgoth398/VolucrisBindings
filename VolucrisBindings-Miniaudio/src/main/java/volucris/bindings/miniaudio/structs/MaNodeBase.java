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
import volucris.bindings.core.NativeFloatArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class MaNodeBase
		implements Struct<MaNodeBase> {

	public static final StructLayout LAYOUT;

	public static final VarHandle P_NODE_GRAPH_HANDLE;
	public static final VarHandle VTABLE_HANDLE;
	public static final VarHandle INPUT_BUS_COUNT_HANDLE;
	public static final VarHandle OUTPUT_BUS_COUNT_HANDLE;
	public static final VarHandle P_INPUT_BUSES_HANDLE;
	public static final VarHandle P_OUTPUT_BUSES_HANDLE;
	public static final VarHandle P_CACHED_DATA_HANDLE;
	public static final VarHandle CACHED_DATA_CAP_IN_FRAMES_PER_BUS_HANDLE;
	public static final VarHandle CACHED_FRAME_COUNT_OUT_HANDLE;
	public static final VarHandle CACHED_FRAME_COUNT_IN_HANDLE;
	public static final VarHandle CONSUMED_FRAME_COUNT_IN_HANDLE;
	public static final VarHandle STATE_HANDLE;
	public static final VarHandle STATE_TIMES_HANDLE;
	public static final VarHandle LOCAL_TIME_HANDLE;
	public static final VarHandle _P_HEAP_HANDLE;
	public static final VarHandle _OWNS_HEAP_HANDLE;

	public static final long P_NODE_GRAPH_BYTE_OFFSET;
	public static final long VTABLE_BYTE_OFFSET;
	public static final long INPUT_BUS_COUNT_BYTE_OFFSET;
	public static final long OUTPUT_BUS_COUNT_BYTE_OFFSET;
	public static final long P_INPUT_BUSES_BYTE_OFFSET;
	public static final long P_OUTPUT_BUSES_BYTE_OFFSET;
	public static final long P_CACHED_DATA_BYTE_OFFSET;
	public static final long CACHED_DATA_CAP_IN_FRAMES_PER_BUS_BYTE_OFFSET;
	public static final long CACHED_FRAME_COUNT_OUT_BYTE_OFFSET;
	public static final long CACHED_FRAME_COUNT_IN_BYTE_OFFSET;
	public static final long CONSUMED_FRAME_COUNT_IN_BYTE_OFFSET;
	public static final long STATE_BYTE_OFFSET;
	public static final long STATE_TIMES_BYTE_OFFSET;
	public static final long LOCAL_TIME_BYTE_OFFSET;
	public static final long _INPUT_BUSES_BYTE_OFFSET;
	public static final long _OUTPUT_BUSES_BYTE_OFFSET;
	public static final long _P_HEAP_BYTE_OFFSET;
	public static final long _OWNS_HEAP_BYTE_OFFSET;

	private final MemorySegment segment;

	private final MaNodeInputBus[] _inputBuses;
	private final MaNodeOutputBus[] _outputBuses;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    UNBOUNDED_ADDRESS.withName("pNodeGraph"),
		    UNBOUNDED_ADDRESS.withName("vtable"),
		    JAVA_INT.withName("inputBusCount"),
		    JAVA_INT.withName("outputBusCount"),
		    UNBOUNDED_ADDRESS.withName("pInputBuses"),
		    UNBOUNDED_ADDRESS.withName("pOutputBuses"),
		    UNBOUNDED_ADDRESS.withName("pCachedData"),
		    JAVA_SHORT.withName("cachedDataCapInFramesPerBus"),
		    JAVA_SHORT.withName("cachedFrameCountOut"),
		    JAVA_SHORT.withName("cachedFrameCountIn"),
		    JAVA_SHORT.withName("consumedFrameCountIn"),
		    JAVA_INT.withName("state"),
		    MemoryLayout.paddingLayout(4),
		    MemoryLayout.sequenceLayout(2, JAVA_LONG).withName("stateTimes"),
		    JAVA_LONG.withName("localTime"),
		    MemoryLayout.sequenceLayout(2, MaNodeInputBus.LAYOUT).withName("_inputBuses"),
		    MemoryLayout.sequenceLayout(2, MaNodeOutputBus.LAYOUT).withName("_outputBuses"),
		    UNBOUNDED_ADDRESS.withName("_pHeap"),
		    JAVA_INT.withName("_ownsHeap"),
		    MemoryLayout.paddingLayout(4)
		).withName("ma_node_base").withByteAlignment(8);
		
		P_NODE_GRAPH_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNodeGraph"));
		VTABLE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("vtable"));
		INPUT_BUS_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("inputBusCount"));
		OUTPUT_BUS_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("outputBusCount"));
		P_INPUT_BUSES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pInputBuses"));
		P_OUTPUT_BUSES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pOutputBuses"));
		P_CACHED_DATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pCachedData"));
		CACHED_DATA_CAP_IN_FRAMES_PER_BUS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("cachedDataCapInFramesPerBus"));
		CACHED_FRAME_COUNT_OUT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("cachedFrameCountOut"));
		CACHED_FRAME_COUNT_IN_HANDLE = LAYOUT.varHandle(PathElement.groupElement("cachedFrameCountIn"));
		CONSUMED_FRAME_COUNT_IN_HANDLE = LAYOUT.varHandle(PathElement.groupElement("consumedFrameCountIn"));
		STATE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("state"));
		STATE_TIMES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("stateTimes"), PathElement.sequenceElement());
		LOCAL_TIME_HANDLE = LAYOUT.varHandle(PathElement.groupElement("localTime"));
		_P_HEAP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("_pHeap"));
		_OWNS_HEAP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("_ownsHeap"));
		
		P_NODE_GRAPH_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNodeGraph"));
		VTABLE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vtable"));
		INPUT_BUS_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("inputBusCount"));
		OUTPUT_BUS_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("outputBusCount"));
		P_INPUT_BUSES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pInputBuses"));
		P_OUTPUT_BUSES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pOutputBuses"));
		P_CACHED_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pCachedData"));
		CACHED_DATA_CAP_IN_FRAMES_PER_BUS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("cachedDataCapInFramesPerBus"));
		CACHED_FRAME_COUNT_OUT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("cachedFrameCountOut"));
		CACHED_FRAME_COUNT_IN_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("cachedFrameCountIn"));
		CONSUMED_FRAME_COUNT_IN_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("consumedFrameCountIn"));
		STATE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("state"));
		STATE_TIMES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("stateTimes"));
		LOCAL_TIME_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("localTime"));
		_INPUT_BUSES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("_inputBuses"));
		_OUTPUT_BUSES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("_outputBuses"));
		_P_HEAP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("_pHeap"));
		_OWNS_HEAP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("_ownsHeap"));
		//@formatter:on
	}

	public MaNodeBase() {
	    this(Arena.ofAuto());
	}
	
	public MaNodeBase(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public MaNodeBase(MemorySegment segment) {
	    this.segment = segment;
	
	    _inputBuses = new MaNodeInputBus[2];
	    for (int i = 0; i < 2; i++) {
	        long offset = _INPUT_BUSES_BYTE_OFFSET + i * MaNodeInputBus.LAYOUT.byteSize();
	        _inputBuses[i] = new MaNodeInputBus(segment.asSlice(offset, MaNodeInputBus.LAYOUT));
	    }
	    _outputBuses = new MaNodeOutputBus[2];
	    for (int i = 0; i < 2; i++) {
	        long offset = _OUTPUT_BUSES_BYTE_OFFSET + i * MaNodeOutputBus.LAYOUT.byteSize();
	        _outputBuses[i] = new MaNodeOutputBus(segment.asSlice(offset, MaNodeOutputBus.LAYOUT));
	    }
	}

    /// @see #pNodeGraph()
    public MaNodeBase pNodeGraph(MaNodeGraph pNodeGraph) {
    	P_NODE_GRAPH_HANDLE.set(segment, 0L, pNodeGraph.memorySegment());
    	return this;
    }
    
    public @Nullable MaNodeGraph pNodeGraph() {
    	MemorySegment segment = (MemorySegment) P_NODE_GRAPH_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaNodeGraph(segment);
    }
    
    /// @see #vtable()
    public MaNodeBase vtable(MaNodeVtable vtable) {
    	VTABLE_HANDLE.set(segment, 0L, vtable.memorySegment());
    	return this;
    }
    
    public @Nullable MaNodeVtable vtable() {
    	MemorySegment segment = (MemorySegment) VTABLE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaNodeVtable(segment);
    }
    
    /// @see #inputBusCount()
    public MaNodeBase inputBusCount(int inputBusCount) {
    	INPUT_BUS_COUNT_HANDLE.set(segment, 0L, inputBusCount);
    	return this;
    }
    
    public int inputBusCount() {
    	return (int) INPUT_BUS_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #outputBusCount()
    public MaNodeBase outputBusCount(int outputBusCount) {
    	OUTPUT_BUS_COUNT_HANDLE.set(segment, 0L, outputBusCount);
    	return this;
    }
    
    public int outputBusCount() {
    	return (int) OUTPUT_BUS_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pInputBuses()
    public MaNodeBase pInputBuses(MaNodeInputBus pInputBuses) {
    	P_INPUT_BUSES_HANDLE.set(segment, 0L, pInputBuses.memorySegment());
    	return this;
    }
    
    public @Nullable MaNodeInputBus pInputBuses() {
    	MemorySegment segment = (MemorySegment) P_INPUT_BUSES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaNodeInputBus(segment);
    }
    
    /// @see #pOutputBuses()
    public MaNodeBase pOutputBuses(MaNodeOutputBus pOutputBuses) {
    	P_OUTPUT_BUSES_HANDLE.set(segment, 0L, pOutputBuses.memorySegment());
    	return this;
    }
    
    public @Nullable MaNodeOutputBus pOutputBuses() {
    	MemorySegment segment = (MemorySegment) P_OUTPUT_BUSES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaNodeOutputBus(segment);
    }
    
    /// @see #pCachedData()
    public MaNodeBase pCachedData(NativeFloatArray pCachedData) {
    	P_CACHED_DATA_HANDLE.set(segment, 0L, pCachedData.memorySegment());
    	return this;
    }
    
    public @Nullable NativeFloatArray pCachedData() {
    	MemorySegment segment = (MemorySegment) P_CACHED_DATA_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeFloatArray(segment);
    }
    
    /// @see #cachedDataCapInFramesPerBus()
    public MaNodeBase cachedDataCapInFramesPerBus(short cachedDataCapInFramesPerBus) {
    	CACHED_DATA_CAP_IN_FRAMES_PER_BUS_HANDLE.set(segment, 0L, cachedDataCapInFramesPerBus);
    	return this;
    }
    
    public short cachedDataCapInFramesPerBus() {
    	return (short) CACHED_DATA_CAP_IN_FRAMES_PER_BUS_HANDLE.get(segment, 0L);
    }
    
    /// @see #cachedFrameCountOut()
    public MaNodeBase cachedFrameCountOut(short cachedFrameCountOut) {
    	CACHED_FRAME_COUNT_OUT_HANDLE.set(segment, 0L, cachedFrameCountOut);
    	return this;
    }
    
    public short cachedFrameCountOut() {
    	return (short) CACHED_FRAME_COUNT_OUT_HANDLE.get(segment, 0L);
    }
    
    /// @see #cachedFrameCountIn()
    public MaNodeBase cachedFrameCountIn(short cachedFrameCountIn) {
    	CACHED_FRAME_COUNT_IN_HANDLE.set(segment, 0L, cachedFrameCountIn);
    	return this;
    }
    
    public short cachedFrameCountIn() {
    	return (short) CACHED_FRAME_COUNT_IN_HANDLE.get(segment, 0L);
    }
    
    /// @see #consumedFrameCountIn()
    public MaNodeBase consumedFrameCountIn(short consumedFrameCountIn) {
    	CONSUMED_FRAME_COUNT_IN_HANDLE.set(segment, 0L, consumedFrameCountIn);
    	return this;
    }
    
    public short consumedFrameCountIn() {
    	return (short) CONSUMED_FRAME_COUNT_IN_HANDLE.get(segment, 0L);
    }
    
    /// @see #state()
    public MaNodeBase state(int state) {
    	STATE_HANDLE.set(segment, 0L, state);
    	return this;
    }
    
    public int state() {
    	return (int) STATE_HANDLE.get(segment, 0L);
    }
    
    /// @see #stateTimes(int)
    public MaNodeBase stateTimes(long stateTimes, int index0) {
    	STATE_TIMES_HANDLE.set(segment, 0L, index0, stateTimes);
    	return this;
    }
    
    public long stateTimes(int index0) {
    	return (long) STATE_TIMES_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #localTime()
    public MaNodeBase localTime(long localTime) {
    	LOCAL_TIME_HANDLE.set(segment, 0L, localTime);
    	return this;
    }
    
    public long localTime() {
    	return (long) LOCAL_TIME_HANDLE.get(segment, 0L);
    }
    
    /// @see #_inputBuses(int)
    public MaNodeBase _inputBuses(Consumer<MaNodeInputBus> consumer, int index) {
    	consumer.accept(_inputBuses[index]);
    	return this;
    }
    
    /// @see #_inputBuses(int)
    public MaNodeBase _inputBuses(MaNodeInputBus other, int index) {
    	_inputBuses[index].set(other);
    	return this;
    }
    
    public MaNodeInputBus _inputBuses(int index) {
    	return _inputBuses[index];
    }
    
    /// @see #_outputBuses(int)
    public MaNodeBase _outputBuses(Consumer<MaNodeOutputBus> consumer, int index) {
    	consumer.accept(_outputBuses[index]);
    	return this;
    }
    
    /// @see #_outputBuses(int)
    public MaNodeBase _outputBuses(MaNodeOutputBus other, int index) {
    	_outputBuses[index].set(other);
    	return this;
    }
    
    public MaNodeOutputBus _outputBuses(int index) {
    	return _outputBuses[index];
    }
    
    /// @see #_pHeap()
    public MaNodeBase _pHeap(MemorySegment _pHeap) {
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
    public MaNodeBase _ownsHeap(int _ownsHeap) {
    	_OWNS_HEAP_HANDLE.set(segment, 0L, _ownsHeap);
    	return this;
    }
    
    public int _ownsHeap() {
    	return (int) _OWNS_HEAP_HANDLE.get(segment, 0L);
    }
    
    @Override
    public MaNodeBase set(MaNodeBase other) {
        return set(other.segment);
    }
    
    @Override
    public MaNodeBase set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaNodeBase> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaNodeBase> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaNodeBase(segment),
            count
        );
    }
    
    public static NativeStructArray<MaNodeBase> array(Arena arena, MaNodeBase... structs) {
        NativeStructArray<MaNodeBase> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaNodeBase(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaNodeBase> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaNodeBase(segment)
        );
    }

}