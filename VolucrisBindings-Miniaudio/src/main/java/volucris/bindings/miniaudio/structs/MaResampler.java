/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.miniaudio.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.lang.foreign.UnionLayout;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class MaResampler
		implements Struct<MaResampler> {

	public static final StructLayout LAYOUT;

	public static final VarHandle P_BACKEND_HANDLE;
	public static final VarHandle P_BACKEND_VTABLE_HANDLE;
	public static final VarHandle P_BACKEND_USER_DATA_HANDLE;
	public static final VarHandle FORMAT_HANDLE;
	public static final VarHandle CHANNELS_HANDLE;
	public static final VarHandle SAMPLE_RATE_IN_HANDLE;
	public static final VarHandle SAMPLE_RATE_OUT_HANDLE;
	public static final VarHandle _P_HEAP_HANDLE;
	public static final VarHandle _OWNS_HEAP_HANDLE;

	public static final long P_BACKEND_BYTE_OFFSET;
	public static final long P_BACKEND_VTABLE_BYTE_OFFSET;
	public static final long P_BACKEND_USER_DATA_BYTE_OFFSET;
	public static final long FORMAT_BYTE_OFFSET;
	public static final long CHANNELS_BYTE_OFFSET;
	public static final long SAMPLE_RATE_IN_BYTE_OFFSET;
	public static final long SAMPLE_RATE_OUT_BYTE_OFFSET;
	public static final long STATE_BYTE_OFFSET;
	public static final long _P_HEAP_BYTE_OFFSET;
	public static final long _OWNS_HEAP_BYTE_OFFSET;

	private final MemorySegment segment;

	private final State state;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    UNBOUNDED_ADDRESS.withName("pBackend"),
		    UNBOUNDED_ADDRESS.withName("pBackendVTable"),
		    UNBOUNDED_ADDRESS.withName("pBackendUserData"),
		    JAVA_INT.withName("format"),
		    JAVA_INT.withName("channels"),
		    JAVA_INT.withName("sampleRateIn"),
		    JAVA_INT.withName("sampleRateOut"),
		    State.LAYOUT.withName("state"),
		    UNBOUNDED_ADDRESS.withName("_pHeap"),
		    JAVA_INT.withName("_ownsHeap"),
		    MemoryLayout.paddingLayout(4)
		).withName("ma_resampler").withByteAlignment(8);
		
		P_BACKEND_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pBackend"));
		P_BACKEND_VTABLE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pBackendVTable"));
		P_BACKEND_USER_DATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pBackendUserData"));
		FORMAT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("format"));
		CHANNELS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("channels"));
		SAMPLE_RATE_IN_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sampleRateIn"));
		SAMPLE_RATE_OUT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sampleRateOut"));
		_P_HEAP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("_pHeap"));
		_OWNS_HEAP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("_ownsHeap"));
		
		P_BACKEND_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pBackend"));
		P_BACKEND_VTABLE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pBackendVTable"));
		P_BACKEND_USER_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pBackendUserData"));
		FORMAT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("format"));
		CHANNELS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("channels"));
		SAMPLE_RATE_IN_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sampleRateIn"));
		SAMPLE_RATE_OUT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sampleRateOut"));
		STATE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("state"));
		_P_HEAP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("_pHeap"));
		_OWNS_HEAP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("_ownsHeap"));
		//@formatter:on
	}

	public MaResampler() {
	    this(Arena.ofAuto());
	}
	
	public MaResampler(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public MaResampler(MemorySegment segment) {
	    this.segment = segment;
	
	    state = new State(segment.asSlice(STATE_BYTE_OFFSET, State.LAYOUT));
	}

    /// @see #pBackend()
    public MaResampler pBackend(MemorySegment pBackend) {
    	P_BACKEND_HANDLE.set(segment, 0L, pBackend);
    	return this;
    }
    
    public @Nullable MemorySegment pBackend() {
    	MemorySegment segment = (MemorySegment) P_BACKEND_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #pBackendVTable()
    public MaResampler pBackendVTable(MaResamplingBackendVtable pBackendVTable) {
    	P_BACKEND_VTABLE_HANDLE.set(segment, 0L, pBackendVTable.memorySegment());
    	return this;
    }
    
    public @Nullable MaResamplingBackendVtable pBackendVTable() {
    	MemorySegment segment = (MemorySegment) P_BACKEND_VTABLE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaResamplingBackendVtable(segment);
    }
    
    /// @see #pBackendUserData()
    public MaResampler pBackendUserData(MemorySegment pBackendUserData) {
    	P_BACKEND_USER_DATA_HANDLE.set(segment, 0L, pBackendUserData);
    	return this;
    }
    
    public @Nullable MemorySegment pBackendUserData() {
    	MemorySegment segment = (MemorySegment) P_BACKEND_USER_DATA_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #format()
    public MaResampler format(int format) {
    	FORMAT_HANDLE.set(segment, 0L, format);
    	return this;
    }
    
    public int format() {
    	return (int) FORMAT_HANDLE.get(segment, 0L);
    }
    
    /// @see #channels()
    public MaResampler channels(int channels) {
    	CHANNELS_HANDLE.set(segment, 0L, channels);
    	return this;
    }
    
    public int channels() {
    	return (int) CHANNELS_HANDLE.get(segment, 0L);
    }
    
    /// @see #sampleRateIn()
    public MaResampler sampleRateIn(int sampleRateIn) {
    	SAMPLE_RATE_IN_HANDLE.set(segment, 0L, sampleRateIn);
    	return this;
    }
    
    public int sampleRateIn() {
    	return (int) SAMPLE_RATE_IN_HANDLE.get(segment, 0L);
    }
    
    /// @see #sampleRateOut()
    public MaResampler sampleRateOut(int sampleRateOut) {
    	SAMPLE_RATE_OUT_HANDLE.set(segment, 0L, sampleRateOut);
    	return this;
    }
    
    public int sampleRateOut() {
    	return (int) SAMPLE_RATE_OUT_HANDLE.get(segment, 0L);
    }
    
    /// @see #state()
    public MaResampler state(Consumer<State> consumer) {
    	consumer.accept(state);
    	return this;
    }
    
    /// @see #state()
    public MaResampler state(State other) {
    	state.set(other);
    	return this;
    }
    
    public State state() {
    	return state;
    }
    
    /// @see #_pHeap()
    public MaResampler _pHeap(MemorySegment _pHeap) {
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
    public MaResampler _ownsHeap(int _ownsHeap) {
    	_OWNS_HEAP_HANDLE.set(segment, 0L, _ownsHeap);
    	return this;
    }
    
    public int _ownsHeap() {
    	return (int) _OWNS_HEAP_HANDLE.get(segment, 0L);
    }
    
    @Override
    public MaResampler set(MaResampler other) {
        return set(other.segment);
    }
    
    @Override
    public MaResampler set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaResampler> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaResampler> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaResampler(segment),
            count
        );
    }
    
    public static NativeStructArray<MaResampler> array(SegmentAllocator allocator, MaResampler... structs) {
        NativeStructArray<MaResampler> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaResampler(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaResampler> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaResampler(segment)
        );
    }

	public static class State implements Struct<State> {
	
		public static final UnionLayout LAYOUT;
	
		public static final long LINEAR_BYTE_OFFSET;
	
		private final MemorySegment segment;
	
		private final MaLinearResampler linear;
	
		static {
			//@formatter:off
			LAYOUT = MemoryLayout.unionLayout(
			    MaLinearResampler.LAYOUT.withName("linear")
			).withName("State").withByteAlignment(8);
			
			LINEAR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("linear"));
			//@formatter:on
		}
	
		public State() {
		    this(Arena.ofAuto());
		}
		
		public State(SegmentAllocator allocator) {
		    this(allocator.allocate(LAYOUT));
		}
		
		public State(MemorySegment segment) {
		    this.segment = segment;
		
		    linear = new MaLinearResampler(segment.asSlice(LINEAR_BYTE_OFFSET, MaLinearResampler.LAYOUT));
		}
	
	    /// @see #linear()
	    public State linear(Consumer<MaLinearResampler> consumer) {
	    	consumer.accept(linear);
	    	return this;
	    }
	    
	    /// @see #linear()
	    public State linear(MaLinearResampler other) {
	    	linear.set(other);
	    	return this;
	    }
	    
	    public MaLinearResampler linear() {
	    	return linear;
	    }
	    
	    @Override
	    public State set(State other) {
	        return set(other.segment);
	    }
	    
	    @Override
	    public State set(MemorySegment src) {
	        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
	        return this;
	    }
	    
	    @Override
	    public MemorySegment memorySegment() {
	        return segment;
	    }
	    
	    public NativeStructArray<State> asArray() {
	        return new NativeStructArray<>(this);
	    }
	    
	    public static NativeStructArray<State> array(SegmentAllocator allocator, int count) {
	        return new NativeStructArray<>(
	            allocator,
	            LAYOUT,
	            segment -> new State(segment),
	            count
	        );
	    }
	    
	    public static NativeStructArray<State> array(SegmentAllocator allocator, State... structs) {
	        NativeStructArray<State> array = new NativeStructArray<>(
	            allocator,
	            LAYOUT,
	            segment -> new State(segment),
	            structs.length
	        );
	    
	        for (int i = 0; i < structs.length; i++) {
	            array.set(i, structs[i]);
	        }
	    
	        return array;
	    }
	    
	    public static NativeStructArray<State> array(MemorySegment array) {
	        return new NativeStructArray<>(
	            array,
	            LAYOUT,
	            segment -> new State(segment)
	        );
	    }
	
	}
}