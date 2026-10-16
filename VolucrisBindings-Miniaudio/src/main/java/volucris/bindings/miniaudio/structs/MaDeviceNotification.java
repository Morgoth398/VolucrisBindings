/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.miniaudio.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.foreign.UnionLayout;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class MaDeviceNotification
		implements Struct<MaDeviceNotification> {

	public static final StructLayout LAYOUT;

	public static final VarHandle P_DEVICE_HANDLE;
	public static final VarHandle TYPE_HANDLE;

	public static final long P_DEVICE_BYTE_OFFSET;
	public static final long TYPE_BYTE_OFFSET;
	public static final long DATA_BYTE_OFFSET;

	private final MemorySegment segment;

	private final Data data;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    UNBOUNDED_ADDRESS.withName("pDevice"),
		    JAVA_INT.withName("type"),
		    Data.LAYOUT.withName("data")
		).withName("ma_device_notification").withByteAlignment(8);
		
		P_DEVICE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pDevice"));
		TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("type"));
		
		P_DEVICE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pDevice"));
		TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("type"));
		DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("data"));
		//@formatter:on
	}

	public MaDeviceNotification() {
	    this(Arena.ofAuto());
	}
	
	public MaDeviceNotification(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public MaDeviceNotification(MemorySegment segment) {
	    this.segment = segment;
	
	    data = new Data(segment.asSlice(DATA_BYTE_OFFSET, Data.LAYOUT));
	}

    /// @see #pDevice()
    public MaDeviceNotification pDevice(MaDevice pDevice) {
    	P_DEVICE_HANDLE.set(segment, 0L, pDevice.memorySegment());
    	return this;
    }
    
    public @Nullable MaDevice pDevice() {
    	MemorySegment segment = (MemorySegment) P_DEVICE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaDevice(segment);
    }
    
    /// @see #type()
    public MaDeviceNotification type(int type) {
    	TYPE_HANDLE.set(segment, 0L, type);
    	return this;
    }
    
    public int type() {
    	return (int) TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #data()
    public MaDeviceNotification data(Consumer<Data> consumer) {
    	consumer.accept(data);
    	return this;
    }
    
    /// @see #data()
    public MaDeviceNotification data(Data other) {
    	data.set(other);
    	return this;
    }
    
    public Data data() {
    	return data;
    }
    
    @Override
    public MaDeviceNotification set(MaDeviceNotification other) {
        return set(other.segment);
    }
    
    @Override
    public MaDeviceNotification set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaDeviceNotification> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaDeviceNotification> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaDeviceNotification(segment),
            count
        );
    }
    
    public static NativeStructArray<MaDeviceNotification> array(Arena arena, MaDeviceNotification... structs) {
        NativeStructArray<MaDeviceNotification> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaDeviceNotification(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaDeviceNotification> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaDeviceNotification(segment)
        );
    }

	public static class Data implements Struct<Data> {
	
		public static final UnionLayout LAYOUT;
	
		public static final long STARTED_BYTE_OFFSET;
		public static final long STOPPED_BYTE_OFFSET;
		public static final long REROUTED_BYTE_OFFSET;
		public static final long INTERRUPTION_BYTE_OFFSET;
	
		private final MemorySegment segment;
	
		private final Started started;
		private final Stopped stopped;
		private final Rerouted rerouted;
		private final Interruption interruption;
	
		static {
			//@formatter:off
			LAYOUT = MemoryLayout.unionLayout(
			    Started.LAYOUT.withName("started"),
			    Stopped.LAYOUT.withName("stopped"),
			    Rerouted.LAYOUT.withName("rerouted"),
			    Interruption.LAYOUT.withName("interruption")
			).withName("Data").withByteAlignment(4);
			
			STARTED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("started"));
			STOPPED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("stopped"));
			REROUTED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("rerouted"));
			INTERRUPTION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("interruption"));
			//@formatter:on
		}
	
		public Data() {
		    this(Arena.ofAuto());
		}
		
		public Data(Arena arena) {
		    this(arena.allocate(LAYOUT));
		}
		
		public Data(MemorySegment segment) {
		    this.segment = segment;
		
		    started = new Started(segment.asSlice(STARTED_BYTE_OFFSET, Started.LAYOUT));
		    stopped = new Stopped(segment.asSlice(STOPPED_BYTE_OFFSET, Stopped.LAYOUT));
		    rerouted = new Rerouted(segment.asSlice(REROUTED_BYTE_OFFSET, Rerouted.LAYOUT));
		    interruption = new Interruption(segment.asSlice(INTERRUPTION_BYTE_OFFSET, Interruption.LAYOUT));
		}
	
	    /// @see #started()
	    public Data started(Consumer<Started> consumer) {
	    	consumer.accept(started);
	    	return this;
	    }
	    
	    /// @see #started()
	    public Data started(Started other) {
	    	started.set(other);
	    	return this;
	    }
	    
	    public Started started() {
	    	return started;
	    }
	    
	    /// @see #stopped()
	    public Data stopped(Consumer<Stopped> consumer) {
	    	consumer.accept(stopped);
	    	return this;
	    }
	    
	    /// @see #stopped()
	    public Data stopped(Stopped other) {
	    	stopped.set(other);
	    	return this;
	    }
	    
	    public Stopped stopped() {
	    	return stopped;
	    }
	    
	    /// @see #rerouted()
	    public Data rerouted(Consumer<Rerouted> consumer) {
	    	consumer.accept(rerouted);
	    	return this;
	    }
	    
	    /// @see #rerouted()
	    public Data rerouted(Rerouted other) {
	    	rerouted.set(other);
	    	return this;
	    }
	    
	    public Rerouted rerouted() {
	    	return rerouted;
	    }
	    
	    /// @see #interruption()
	    public Data interruption(Consumer<Interruption> consumer) {
	    	consumer.accept(interruption);
	    	return this;
	    }
	    
	    /// @see #interruption()
	    public Data interruption(Interruption other) {
	    	interruption.set(other);
	    	return this;
	    }
	    
	    public Interruption interruption() {
	    	return interruption;
	    }
	    
	    @Override
	    public Data set(Data other) {
	        return set(other.segment);
	    }
	    
	    @Override
	    public Data set(MemorySegment src) {
	        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
	        return this;
	    }
	    
	    @Override
	    public MemorySegment memorySegment() {
	        return segment;
	    }
	    
	    public NativeStructArray<Data> asArray() {
	        return new NativeStructArray<>(this);
	    }
	    
	    public static NativeStructArray<Data> array(Arena arena, int count) {
	        return new NativeStructArray<>(
	            arena,
	            LAYOUT,
	            segment -> new Data(segment),
	            count
	        );
	    }
	    
	    public static NativeStructArray<Data> array(Arena arena, Data... structs) {
	        NativeStructArray<Data> array = new NativeStructArray<>(
	            arena,
	            LAYOUT,
	            segment -> new Data(segment),
	            structs.length
	        );
	    
	        for (int i = 0; i < structs.length; i++) {
	            array.set(i, structs[i]);
	        }
	    
	        return array;
	    }
	    
	    public static NativeStructArray<Data> array(MemorySegment array) {
	        return new NativeStructArray<>(
	            array,
	            LAYOUT,
	            segment -> new Data(segment)
	        );
	    }
	
		public static class Started implements Struct<Started> {
		
			public static final StructLayout LAYOUT;
		
			public static final VarHandle _UNUSED_HANDLE;
		
			public static final long _UNUSED_BYTE_OFFSET;
		
			private final MemorySegment segment;
		
			static {
				//@formatter:off
				LAYOUT = MemoryLayout.structLayout(
				    JAVA_INT.withName("_unused")
				).withName("Started").withByteAlignment(4);
				
				_UNUSED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("_unused"));
				
				_UNUSED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("_unused"));
				//@formatter:on
			}
		
			public Started() {
			    this(Arena.ofAuto());
			}
			
			public Started(Arena arena) {
			    this(arena.allocate(LAYOUT));
			}
			
			public Started(MemorySegment segment) {
			    this.segment = segment;
			
			}
		
		    /// @see #_unused()
		    public Started _unused(int _unused) {
		    	_UNUSED_HANDLE.set(segment, 0L, _unused);
		    	return this;
		    }
		    
		    public int _unused() {
		    	return (int) _UNUSED_HANDLE.get(segment, 0L);
		    }
		    
		    @Override
		    public Started set(Started other) {
		        return set(other.segment);
		    }
		    
		    @Override
		    public Started set(MemorySegment src) {
		        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
		        return this;
		    }
		    
		    @Override
		    public MemorySegment memorySegment() {
		        return segment;
		    }
		    
		    public NativeStructArray<Started> asArray() {
		        return new NativeStructArray<>(this);
		    }
		    
		    public static NativeStructArray<Started> array(Arena arena, int count) {
		        return new NativeStructArray<>(
		            arena,
		            LAYOUT,
		            segment -> new Started(segment),
		            count
		        );
		    }
		    
		    public static NativeStructArray<Started> array(Arena arena, Started... structs) {
		        NativeStructArray<Started> array = new NativeStructArray<>(
		            arena,
		            LAYOUT,
		            segment -> new Started(segment),
		            structs.length
		        );
		    
		        for (int i = 0; i < structs.length; i++) {
		            array.set(i, structs[i]);
		        }
		    
		        return array;
		    }
		    
		    public static NativeStructArray<Started> array(MemorySegment array) {
		        return new NativeStructArray<>(
		            array,
		            LAYOUT,
		            segment -> new Started(segment)
		        );
		    }
		
		}
	    
		public static class Stopped implements Struct<Stopped> {
		
			public static final StructLayout LAYOUT;
		
			public static final VarHandle _UNUSED_HANDLE;
		
			public static final long _UNUSED_BYTE_OFFSET;
		
			private final MemorySegment segment;
		
			static {
				//@formatter:off
				LAYOUT = MemoryLayout.structLayout(
				    JAVA_INT.withName("_unused")
				).withName("Stopped").withByteAlignment(4);
				
				_UNUSED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("_unused"));
				
				_UNUSED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("_unused"));
				//@formatter:on
			}
		
			public Stopped() {
			    this(Arena.ofAuto());
			}
			
			public Stopped(Arena arena) {
			    this(arena.allocate(LAYOUT));
			}
			
			public Stopped(MemorySegment segment) {
			    this.segment = segment;
			
			}
		
		    /// @see #_unused()
		    public Stopped _unused(int _unused) {
		    	_UNUSED_HANDLE.set(segment, 0L, _unused);
		    	return this;
		    }
		    
		    public int _unused() {
		    	return (int) _UNUSED_HANDLE.get(segment, 0L);
		    }
		    
		    @Override
		    public Stopped set(Stopped other) {
		        return set(other.segment);
		    }
		    
		    @Override
		    public Stopped set(MemorySegment src) {
		        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
		        return this;
		    }
		    
		    @Override
		    public MemorySegment memorySegment() {
		        return segment;
		    }
		    
		    public NativeStructArray<Stopped> asArray() {
		        return new NativeStructArray<>(this);
		    }
		    
		    public static NativeStructArray<Stopped> array(Arena arena, int count) {
		        return new NativeStructArray<>(
		            arena,
		            LAYOUT,
		            segment -> new Stopped(segment),
		            count
		        );
		    }
		    
		    public static NativeStructArray<Stopped> array(Arena arena, Stopped... structs) {
		        NativeStructArray<Stopped> array = new NativeStructArray<>(
		            arena,
		            LAYOUT,
		            segment -> new Stopped(segment),
		            structs.length
		        );
		    
		        for (int i = 0; i < structs.length; i++) {
		            array.set(i, structs[i]);
		        }
		    
		        return array;
		    }
		    
		    public static NativeStructArray<Stopped> array(MemorySegment array) {
		        return new NativeStructArray<>(
		            array,
		            LAYOUT,
		            segment -> new Stopped(segment)
		        );
		    }
		
		}
	    
		public static class Rerouted implements Struct<Rerouted> {
		
			public static final StructLayout LAYOUT;
		
			public static final VarHandle _UNUSED_HANDLE;
		
			public static final long _UNUSED_BYTE_OFFSET;
		
			private final MemorySegment segment;
		
			static {
				//@formatter:off
				LAYOUT = MemoryLayout.structLayout(
				    JAVA_INT.withName("_unused")
				).withName("Rerouted").withByteAlignment(4);
				
				_UNUSED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("_unused"));
				
				_UNUSED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("_unused"));
				//@formatter:on
			}
		
			public Rerouted() {
			    this(Arena.ofAuto());
			}
			
			public Rerouted(Arena arena) {
			    this(arena.allocate(LAYOUT));
			}
			
			public Rerouted(MemorySegment segment) {
			    this.segment = segment;
			
			}
		
		    /// @see #_unused()
		    public Rerouted _unused(int _unused) {
		    	_UNUSED_HANDLE.set(segment, 0L, _unused);
		    	return this;
		    }
		    
		    public int _unused() {
		    	return (int) _UNUSED_HANDLE.get(segment, 0L);
		    }
		    
		    @Override
		    public Rerouted set(Rerouted other) {
		        return set(other.segment);
		    }
		    
		    @Override
		    public Rerouted set(MemorySegment src) {
		        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
		        return this;
		    }
		    
		    @Override
		    public MemorySegment memorySegment() {
		        return segment;
		    }
		    
		    public NativeStructArray<Rerouted> asArray() {
		        return new NativeStructArray<>(this);
		    }
		    
		    public static NativeStructArray<Rerouted> array(Arena arena, int count) {
		        return new NativeStructArray<>(
		            arena,
		            LAYOUT,
		            segment -> new Rerouted(segment),
		            count
		        );
		    }
		    
		    public static NativeStructArray<Rerouted> array(Arena arena, Rerouted... structs) {
		        NativeStructArray<Rerouted> array = new NativeStructArray<>(
		            arena,
		            LAYOUT,
		            segment -> new Rerouted(segment),
		            structs.length
		        );
		    
		        for (int i = 0; i < structs.length; i++) {
		            array.set(i, structs[i]);
		        }
		    
		        return array;
		    }
		    
		    public static NativeStructArray<Rerouted> array(MemorySegment array) {
		        return new NativeStructArray<>(
		            array,
		            LAYOUT,
		            segment -> new Rerouted(segment)
		        );
		    }
		
		}
	    
		public static class Interruption implements Struct<Interruption> {
		
			public static final StructLayout LAYOUT;
		
			public static final VarHandle _UNUSED_HANDLE;
		
			public static final long _UNUSED_BYTE_OFFSET;
		
			private final MemorySegment segment;
		
			static {
				//@formatter:off
				LAYOUT = MemoryLayout.structLayout(
				    JAVA_INT.withName("_unused")
				).withName("Interruption").withByteAlignment(4);
				
				_UNUSED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("_unused"));
				
				_UNUSED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("_unused"));
				//@formatter:on
			}
		
			public Interruption() {
			    this(Arena.ofAuto());
			}
			
			public Interruption(Arena arena) {
			    this(arena.allocate(LAYOUT));
			}
			
			public Interruption(MemorySegment segment) {
			    this.segment = segment;
			
			}
		
		    /// @see #_unused()
		    public Interruption _unused(int _unused) {
		    	_UNUSED_HANDLE.set(segment, 0L, _unused);
		    	return this;
		    }
		    
		    public int _unused() {
		    	return (int) _UNUSED_HANDLE.get(segment, 0L);
		    }
		    
		    @Override
		    public Interruption set(Interruption other) {
		        return set(other.segment);
		    }
		    
		    @Override
		    public Interruption set(MemorySegment src) {
		        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
		        return this;
		    }
		    
		    @Override
		    public MemorySegment memorySegment() {
		        return segment;
		    }
		    
		    public NativeStructArray<Interruption> asArray() {
		        return new NativeStructArray<>(this);
		    }
		    
		    public static NativeStructArray<Interruption> array(Arena arena, int count) {
		        return new NativeStructArray<>(
		            arena,
		            LAYOUT,
		            segment -> new Interruption(segment),
		            count
		        );
		    }
		    
		    public static NativeStructArray<Interruption> array(Arena arena, Interruption... structs) {
		        NativeStructArray<Interruption> array = new NativeStructArray<>(
		            arena,
		            LAYOUT,
		            segment -> new Interruption(segment),
		            structs.length
		        );
		    
		        for (int i = 0; i < structs.length; i++) {
		            array.set(i, structs[i]);
		        }
		    
		        return array;
		    }
		    
		    public static NativeStructArray<Interruption> array(MemorySegment array) {
		        return new NativeStructArray<>(
		            array,
		            LAYOUT,
		            segment -> new Interruption(segment)
		        );
		    }
		
		}
	}
}