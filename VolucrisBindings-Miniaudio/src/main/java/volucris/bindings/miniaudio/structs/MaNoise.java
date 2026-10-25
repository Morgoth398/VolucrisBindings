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
import volucris.bindings.core.NativeDoubleArray;
import volucris.bindings.core.NativeIntArray;
import volucris.bindings.core.NativePointerArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class MaNoise
		implements Struct<MaNoise> {

	public static final StructLayout LAYOUT;

	public static final VarHandle _P_HEAP_HANDLE;
	public static final VarHandle _OWNS_HEAP_HANDLE;

	public static final long DS_BYTE_OFFSET;
	public static final long CONFIG_BYTE_OFFSET;
	public static final long LCG_BYTE_OFFSET;
	public static final long STATE_BYTE_OFFSET;
	public static final long _P_HEAP_BYTE_OFFSET;
	public static final long _OWNS_HEAP_BYTE_OFFSET;

	private final MemorySegment segment;

	private final MaDataSourceBase ds;
	private final MaNoiseConfig config;
	private final MaLcg lcg;
	private final State state;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    MaDataSourceBase.LAYOUT.withName("ds"),
		    MaNoiseConfig.LAYOUT.withName("config"),
		    MaLcg.LAYOUT.withName("lcg"),
		    MemoryLayout.paddingLayout(4),
		    State.LAYOUT.withName("state"),
		    UNBOUNDED_ADDRESS.withName("_pHeap"),
		    JAVA_INT.withName("_ownsHeap"),
		    MemoryLayout.paddingLayout(4)
		).withName("ma_noise").withByteAlignment(8);
		
		_P_HEAP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("_pHeap"));
		_OWNS_HEAP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("_ownsHeap"));
		
		DS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("ds"));
		CONFIG_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("config"));
		LCG_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("lcg"));
		STATE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("state"));
		_P_HEAP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("_pHeap"));
		_OWNS_HEAP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("_ownsHeap"));
		//@formatter:on
	}

	public MaNoise() {
	    this(Arena.ofAuto());
	}
	
	public MaNoise(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public MaNoise(MemorySegment segment) {
	    this.segment = segment;
	
	    ds = new MaDataSourceBase(segment.asSlice(DS_BYTE_OFFSET, MaDataSourceBase.LAYOUT));
	    config = new MaNoiseConfig(segment.asSlice(CONFIG_BYTE_OFFSET, MaNoiseConfig.LAYOUT));
	    lcg = new MaLcg(segment.asSlice(LCG_BYTE_OFFSET, MaLcg.LAYOUT));
	    state = new State(segment.asSlice(STATE_BYTE_OFFSET, State.LAYOUT));
	}

    /// @see #ds()
    public MaNoise ds(Consumer<MaDataSourceBase> consumer) {
    	consumer.accept(ds);
    	return this;
    }
    
    /// @see #ds()
    public MaNoise ds(MaDataSourceBase other) {
    	ds.set(other);
    	return this;
    }
    
    public MaDataSourceBase ds() {
    	return ds;
    }
    
    /// @see #config()
    public MaNoise config(Consumer<MaNoiseConfig> consumer) {
    	consumer.accept(config);
    	return this;
    }
    
    /// @see #config()
    public MaNoise config(MaNoiseConfig other) {
    	config.set(other);
    	return this;
    }
    
    public MaNoiseConfig config() {
    	return config;
    }
    
    /// @see #lcg()
    public MaNoise lcg(Consumer<MaLcg> consumer) {
    	consumer.accept(lcg);
    	return this;
    }
    
    /// @see #lcg()
    public MaNoise lcg(MaLcg other) {
    	lcg.set(other);
    	return this;
    }
    
    public MaLcg lcg() {
    	return lcg;
    }
    
    /// @see #state()
    public MaNoise state(Consumer<State> consumer) {
    	consumer.accept(state);
    	return this;
    }
    
    /// @see #state()
    public MaNoise state(State other) {
    	state.set(other);
    	return this;
    }
    
    public State state() {
    	return state;
    }
    
    /// @see #_pHeap()
    public MaNoise _pHeap(MemorySegment _pHeap) {
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
    public MaNoise _ownsHeap(int _ownsHeap) {
    	_OWNS_HEAP_HANDLE.set(segment, 0L, _ownsHeap);
    	return this;
    }
    
    public int _ownsHeap() {
    	return (int) _OWNS_HEAP_HANDLE.get(segment, 0L);
    }
    
    @Override
    public MaNoise set(MaNoise other) {
        return set(other.segment);
    }
    
    @Override
    public MaNoise set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaNoise> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaNoise> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaNoise(segment),
            count
        );
    }
    
    public static NativeStructArray<MaNoise> array(SegmentAllocator allocator, MaNoise... structs) {
        NativeStructArray<MaNoise> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaNoise(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaNoise> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaNoise(segment)
        );
    }

	public static class State implements Struct<State> {
	
		public static final UnionLayout LAYOUT;
	
		public static final long PINK_BYTE_OFFSET;
		public static final long BROWNIAN_BYTE_OFFSET;
	
		private final MemorySegment segment;
	
		private final Pink pink;
		private final Brownian brownian;
	
		static {
			//@formatter:off
			LAYOUT = MemoryLayout.unionLayout(
			    Pink.LAYOUT.withName("pink"),
			    Brownian.LAYOUT.withName("brownian")
			).withName("State").withByteAlignment(8);
			
			PINK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pink"));
			BROWNIAN_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("brownian"));
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
		
		    pink = new Pink(segment.asSlice(PINK_BYTE_OFFSET, Pink.LAYOUT));
		    brownian = new Brownian(segment.asSlice(BROWNIAN_BYTE_OFFSET, Brownian.LAYOUT));
		}
	
	    /// @see #pink()
	    public State pink(Consumer<Pink> consumer) {
	    	consumer.accept(pink);
	    	return this;
	    }
	    
	    /// @see #pink()
	    public State pink(Pink other) {
	    	pink.set(other);
	    	return this;
	    }
	    
	    public Pink pink() {
	    	return pink;
	    }
	    
	    /// @see #brownian()
	    public State brownian(Consumer<Brownian> consumer) {
	    	consumer.accept(brownian);
	    	return this;
	    }
	    
	    /// @see #brownian()
	    public State brownian(Brownian other) {
	    	brownian.set(other);
	    	return this;
	    }
	    
	    public Brownian brownian() {
	    	return brownian;
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
	
		public static class Pink implements Struct<Pink> {
		
			public static final StructLayout LAYOUT;
		
			public static final VarHandle BIN_HANDLE;
			public static final VarHandle ACCUMULATION_HANDLE;
			public static final VarHandle COUNTER_HANDLE;
		
			public static final long BIN_BYTE_OFFSET;
			public static final long ACCUMULATION_BYTE_OFFSET;
			public static final long COUNTER_BYTE_OFFSET;
		
			private final MemorySegment segment;
		
			static {
				//@formatter:off
				LAYOUT = MemoryLayout.structLayout(
				    UNBOUNDED_ADDRESS.withName("bin"),
				    UNBOUNDED_ADDRESS.withName("accumulation"),
				    UNBOUNDED_ADDRESS.withName("counter")
				).withName("Pink").withByteAlignment(8);
				
				BIN_HANDLE = LAYOUT.varHandle(PathElement.groupElement("bin"));
				ACCUMULATION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("accumulation"));
				COUNTER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("counter"));
				
				BIN_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("bin"));
				ACCUMULATION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("accumulation"));
				COUNTER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("counter"));
				//@formatter:on
			}
		
			public Pink() {
			    this(Arena.ofAuto());
			}
			
			public Pink(SegmentAllocator allocator) {
			    this(allocator.allocate(LAYOUT));
			}
			
			public Pink(MemorySegment segment) {
			    this.segment = segment;
			
			}
		
		    /// @see #bin()
		    public Pink bin(NativePointerArray bin) {
		    	BIN_HANDLE.set(segment, 0L, bin.memorySegment());
		    	return this;
		    }
		    
		    public @Nullable NativePointerArray bin() {
		    	MemorySegment segment = (MemorySegment) BIN_HANDLE.get(this.segment, 0L);
		    
		    	if (segment.equals(MemorySegment.NULL))
		    		return null;
		    	
		    	return new NativePointerArray(segment);
		    }
		    
		    /// @see #accumulation()
		    public Pink accumulation(NativeDoubleArray accumulation) {
		    	ACCUMULATION_HANDLE.set(segment, 0L, accumulation.memorySegment());
		    	return this;
		    }
		    
		    public @Nullable NativeDoubleArray accumulation() {
		    	MemorySegment segment = (MemorySegment) ACCUMULATION_HANDLE.get(this.segment, 0L);
		    
		    	if (segment.equals(MemorySegment.NULL))
		    		return null;
		    	
		    	return new NativeDoubleArray(segment);
		    }
		    
		    /// @see #counter()
		    public Pink counter(NativeIntArray counter) {
		    	COUNTER_HANDLE.set(segment, 0L, counter.memorySegment());
		    	return this;
		    }
		    
		    public @Nullable NativeIntArray counter() {
		    	MemorySegment segment = (MemorySegment) COUNTER_HANDLE.get(this.segment, 0L);
		    
		    	if (segment.equals(MemorySegment.NULL))
		    		return null;
		    	
		    	return new NativeIntArray(segment);
		    }
		    
		    @Override
		    public Pink set(Pink other) {
		        return set(other.segment);
		    }
		    
		    @Override
		    public Pink set(MemorySegment src) {
		        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
		        return this;
		    }
		    
		    @Override
		    public MemorySegment memorySegment() {
		        return segment;
		    }
		    
		    public NativeStructArray<Pink> asArray() {
		        return new NativeStructArray<>(this);
		    }
		    
		    public static NativeStructArray<Pink> array(SegmentAllocator allocator, int count) {
		        return new NativeStructArray<>(
		            allocator,
		            LAYOUT,
		            segment -> new Pink(segment),
		            count
		        );
		    }
		    
		    public static NativeStructArray<Pink> array(SegmentAllocator allocator, Pink... structs) {
		        NativeStructArray<Pink> array = new NativeStructArray<>(
		            allocator,
		            LAYOUT,
		            segment -> new Pink(segment),
		            structs.length
		        );
		    
		        for (int i = 0; i < structs.length; i++) {
		            array.set(i, structs[i]);
		        }
		    
		        return array;
		    }
		    
		    public static NativeStructArray<Pink> array(MemorySegment array) {
		        return new NativeStructArray<>(
		            array,
		            LAYOUT,
		            segment -> new Pink(segment)
		        );
		    }
		
		}
	    
		public static class Brownian implements Struct<Brownian> {
		
			public static final StructLayout LAYOUT;
		
			public static final VarHandle ACCUMULATION_HANDLE;
		
			public static final long ACCUMULATION_BYTE_OFFSET;
		
			private final MemorySegment segment;
		
			static {
				//@formatter:off
				LAYOUT = MemoryLayout.structLayout(
				    UNBOUNDED_ADDRESS.withName("accumulation")
				).withName("Brownian").withByteAlignment(8);
				
				ACCUMULATION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("accumulation"));
				
				ACCUMULATION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("accumulation"));
				//@formatter:on
			}
		
			public Brownian() {
			    this(Arena.ofAuto());
			}
			
			public Brownian(SegmentAllocator allocator) {
			    this(allocator.allocate(LAYOUT));
			}
			
			public Brownian(MemorySegment segment) {
			    this.segment = segment;
			
			}
		
		    /// @see #accumulation()
		    public Brownian accumulation(NativeDoubleArray accumulation) {
		    	ACCUMULATION_HANDLE.set(segment, 0L, accumulation.memorySegment());
		    	return this;
		    }
		    
		    public @Nullable NativeDoubleArray accumulation() {
		    	MemorySegment segment = (MemorySegment) ACCUMULATION_HANDLE.get(this.segment, 0L);
		    
		    	if (segment.equals(MemorySegment.NULL))
		    		return null;
		    	
		    	return new NativeDoubleArray(segment);
		    }
		    
		    @Override
		    public Brownian set(Brownian other) {
		        return set(other.segment);
		    }
		    
		    @Override
		    public Brownian set(MemorySegment src) {
		        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
		        return this;
		    }
		    
		    @Override
		    public MemorySegment memorySegment() {
		        return segment;
		    }
		    
		    public NativeStructArray<Brownian> asArray() {
		        return new NativeStructArray<>(this);
		    }
		    
		    public static NativeStructArray<Brownian> array(SegmentAllocator allocator, int count) {
		        return new NativeStructArray<>(
		            allocator,
		            LAYOUT,
		            segment -> new Brownian(segment),
		            count
		        );
		    }
		    
		    public static NativeStructArray<Brownian> array(SegmentAllocator allocator, Brownian... structs) {
		        NativeStructArray<Brownian> array = new NativeStructArray<>(
		            allocator,
		            LAYOUT,
		            segment -> new Brownian(segment),
		            structs.length
		        );
		    
		        for (int i = 0; i < structs.length; i++) {
		            array.set(i, structs[i]);
		        }
		    
		        return array;
		    }
		    
		    public static NativeStructArray<Brownian> array(MemorySegment array) {
		        return new NativeStructArray<>(
		            array,
		            LAYOUT,
		            segment -> new Brownian(segment)
		        );
		    }
		
		}
	}
}