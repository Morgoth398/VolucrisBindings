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

public final class MaResourceManagerDataSupply
		implements Struct<MaResourceManagerDataSupply> {

	public static final StructLayout LAYOUT;

	public static final VarHandle TYPE_HANDLE;

	public static final long TYPE_BYTE_OFFSET;
	public static final long BACKEND_BYTE_OFFSET;

	private final MemorySegment segment;

	private final Backend backend;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("type"),
		    MemoryLayout.paddingLayout(4),
		    Backend.LAYOUT.withName("backend")
		).withName("ma_resource_manager_data_supply").withByteAlignment(8);
		
		TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("type"));
		
		TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("type"));
		BACKEND_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("backend"));
		//@formatter:on
	}

	public MaResourceManagerDataSupply() {
	    this(Arena.ofAuto());
	}
	
	public MaResourceManagerDataSupply(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public MaResourceManagerDataSupply(MemorySegment segment) {
	    this.segment = segment;
	
	    backend = new Backend(segment.asSlice(BACKEND_BYTE_OFFSET, Backend.LAYOUT));
	}

    /// @see #type()
    public MaResourceManagerDataSupply type(int type) {
    	TYPE_HANDLE.set(segment, 0L, type);
    	return this;
    }
    
    public int type() {
    	return (int) TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #backend()
    public MaResourceManagerDataSupply backend(Consumer<Backend> consumer) {
    	consumer.accept(backend);
    	return this;
    }
    
    /// @see #backend()
    public MaResourceManagerDataSupply backend(Backend other) {
    	backend.set(other);
    	return this;
    }
    
    public Backend backend() {
    	return backend;
    }
    
    @Override
    public MaResourceManagerDataSupply set(MaResourceManagerDataSupply other) {
        return set(other.segment);
    }
    
    @Override
    public MaResourceManagerDataSupply set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaResourceManagerDataSupply> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaResourceManagerDataSupply> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaResourceManagerDataSupply(segment),
            count
        );
    }
    
    public static NativeStructArray<MaResourceManagerDataSupply> array(Arena arena, MaResourceManagerDataSupply... structs) {
        NativeStructArray<MaResourceManagerDataSupply> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaResourceManagerDataSupply(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaResourceManagerDataSupply> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaResourceManagerDataSupply(segment)
        );
    }

	public static class Backend implements Struct<Backend> {
	
		public static final UnionLayout LAYOUT;
	
		public static final long ENCODED_BYTE_OFFSET;
		public static final long DECODED_BYTE_OFFSET;
		public static final long DECODED_PAGED_BYTE_OFFSET;
	
		private final MemorySegment segment;
	
		private final Encoded encoded;
		private final Decoded decoded;
		private final DecodedPaged decodedPaged;
	
		static {
			//@formatter:off
			LAYOUT = MemoryLayout.unionLayout(
			    Encoded.LAYOUT.withName("encoded"),
			    Decoded.LAYOUT.withName("decoded"),
			    DecodedPaged.LAYOUT.withName("decodedPaged")
			).withName("Backend").withByteAlignment(8);
			
			ENCODED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("encoded"));
			DECODED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("decoded"));
			DECODED_PAGED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("decodedPaged"));
			//@formatter:on
		}
	
		public Backend() {
		    this(Arena.ofAuto());
		}
		
		public Backend(Arena arena) {
		    this(arena.allocate(LAYOUT));
		}
		
		public Backend(MemorySegment segment) {
		    this.segment = segment;
		
		    encoded = new Encoded(segment.asSlice(ENCODED_BYTE_OFFSET, Encoded.LAYOUT));
		    decoded = new Decoded(segment.asSlice(DECODED_BYTE_OFFSET, Decoded.LAYOUT));
		    decodedPaged = new DecodedPaged(segment.asSlice(DECODED_PAGED_BYTE_OFFSET, DecodedPaged.LAYOUT));
		}
	
	    /// @see #encoded()
	    public Backend encoded(Consumer<Encoded> consumer) {
	    	consumer.accept(encoded);
	    	return this;
	    }
	    
	    /// @see #encoded()
	    public Backend encoded(Encoded other) {
	    	encoded.set(other);
	    	return this;
	    }
	    
	    public Encoded encoded() {
	    	return encoded;
	    }
	    
	    /// @see #decoded()
	    public Backend decoded(Consumer<Decoded> consumer) {
	    	consumer.accept(decoded);
	    	return this;
	    }
	    
	    /// @see #decoded()
	    public Backend decoded(Decoded other) {
	    	decoded.set(other);
	    	return this;
	    }
	    
	    public Decoded decoded() {
	    	return decoded;
	    }
	    
	    /// @see #decodedPaged()
	    public Backend decodedPaged(Consumer<DecodedPaged> consumer) {
	    	consumer.accept(decodedPaged);
	    	return this;
	    }
	    
	    /// @see #decodedPaged()
	    public Backend decodedPaged(DecodedPaged other) {
	    	decodedPaged.set(other);
	    	return this;
	    }
	    
	    public DecodedPaged decodedPaged() {
	    	return decodedPaged;
	    }
	    
	    @Override
	    public Backend set(Backend other) {
	        return set(other.segment);
	    }
	    
	    @Override
	    public Backend set(MemorySegment src) {
	        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
	        return this;
	    }
	    
	    @Override
	    public MemorySegment memorySegment() {
	        return segment;
	    }
	    
	    public NativeStructArray<Backend> asArray() {
	        return new NativeStructArray<>(this);
	    }
	    
	    public static NativeStructArray<Backend> array(Arena arena, int count) {
	        return new NativeStructArray<>(
	            arena,
	            LAYOUT,
	            segment -> new Backend(segment),
	            count
	        );
	    }
	    
	    public static NativeStructArray<Backend> array(Arena arena, Backend... structs) {
	        NativeStructArray<Backend> array = new NativeStructArray<>(
	            arena,
	            LAYOUT,
	            segment -> new Backend(segment),
	            structs.length
	        );
	    
	        for (int i = 0; i < structs.length; i++) {
	            array.set(i, structs[i]);
	        }
	    
	        return array;
	    }
	    
	    public static NativeStructArray<Backend> array(MemorySegment array) {
	        return new NativeStructArray<>(
	            array,
	            LAYOUT,
	            segment -> new Backend(segment)
	        );
	    }
	
		public static class Encoded implements Struct<Encoded> {
		
			public static final StructLayout LAYOUT;
		
			public static final VarHandle P_DATA_HANDLE;
			public static final VarHandle SIZE_IN_BYTES_HANDLE;
		
			public static final long P_DATA_BYTE_OFFSET;
			public static final long SIZE_IN_BYTES_BYTE_OFFSET;
		
			private final MemorySegment segment;
		
			static {
				//@formatter:off
				LAYOUT = MemoryLayout.structLayout(
				    UNBOUNDED_ADDRESS.withName("pData"),
				    JAVA_LONG.withName("sizeInBytes")
				).withName("Encoded").withByteAlignment(8);
				
				P_DATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pData"));
				SIZE_IN_BYTES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sizeInBytes"));
				
				P_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pData"));
				SIZE_IN_BYTES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sizeInBytes"));
				//@formatter:on
			}
		
			public Encoded() {
			    this(Arena.ofAuto());
			}
			
			public Encoded(Arena arena) {
			    this(arena.allocate(LAYOUT));
			}
			
			public Encoded(MemorySegment segment) {
			    this.segment = segment;
			
			}
		
		    /// @see #pData()
		    public Encoded pData(MemorySegment pData) {
		    	P_DATA_HANDLE.set(segment, 0L, pData);
		    	return this;
		    }
		    
		    public @Nullable MemorySegment pData() {
		    	MemorySegment segment = (MemorySegment) P_DATA_HANDLE.get(this.segment, 0L);
		    
		    	if (segment.equals(MemorySegment.NULL))
		    		return null;
		    	
		    	return segment;
		    }
		    
		    /// @see #sizeInBytes()
		    public Encoded sizeInBytes(long sizeInBytes) {
		    	SIZE_IN_BYTES_HANDLE.set(segment, 0L, sizeInBytes);
		    	return this;
		    }
		    
		    public long sizeInBytes() {
		    	return (long) SIZE_IN_BYTES_HANDLE.get(segment, 0L);
		    }
		    
		    @Override
		    public Encoded set(Encoded other) {
		        return set(other.segment);
		    }
		    
		    @Override
		    public Encoded set(MemorySegment src) {
		        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
		        return this;
		    }
		    
		    @Override
		    public MemorySegment memorySegment() {
		        return segment;
		    }
		    
		    public NativeStructArray<Encoded> asArray() {
		        return new NativeStructArray<>(this);
		    }
		    
		    public static NativeStructArray<Encoded> array(Arena arena, int count) {
		        return new NativeStructArray<>(
		            arena,
		            LAYOUT,
		            segment -> new Encoded(segment),
		            count
		        );
		    }
		    
		    public static NativeStructArray<Encoded> array(Arena arena, Encoded... structs) {
		        NativeStructArray<Encoded> array = new NativeStructArray<>(
		            arena,
		            LAYOUT,
		            segment -> new Encoded(segment),
		            structs.length
		        );
		    
		        for (int i = 0; i < structs.length; i++) {
		            array.set(i, structs[i]);
		        }
		    
		        return array;
		    }
		    
		    public static NativeStructArray<Encoded> array(MemorySegment array) {
		        return new NativeStructArray<>(
		            array,
		            LAYOUT,
		            segment -> new Encoded(segment)
		        );
		    }
		
		}
	    
		public static class Decoded implements Struct<Decoded> {
		
			public static final StructLayout LAYOUT;
		
			public static final VarHandle P_DATA_HANDLE;
			public static final VarHandle TOTAL_FRAME_COUNT_HANDLE;
			public static final VarHandle DECODED_FRAME_COUNT_HANDLE;
			public static final VarHandle FORMAT_HANDLE;
			public static final VarHandle CHANNELS_HANDLE;
			public static final VarHandle SAMPLE_RATE_HANDLE;
		
			public static final long P_DATA_BYTE_OFFSET;
			public static final long TOTAL_FRAME_COUNT_BYTE_OFFSET;
			public static final long DECODED_FRAME_COUNT_BYTE_OFFSET;
			public static final long FORMAT_BYTE_OFFSET;
			public static final long CHANNELS_BYTE_OFFSET;
			public static final long SAMPLE_RATE_BYTE_OFFSET;
		
			private final MemorySegment segment;
		
			static {
				//@formatter:off
				LAYOUT = MemoryLayout.structLayout(
				    UNBOUNDED_ADDRESS.withName("pData"),
				    JAVA_LONG.withName("totalFrameCount"),
				    JAVA_LONG.withName("decodedFrameCount"),
				    JAVA_INT.withName("format"),
				    JAVA_INT.withName("channels"),
				    JAVA_INT.withName("sampleRate"),
				    MemoryLayout.paddingLayout(4)
				).withName("Decoded").withByteAlignment(8);
				
				P_DATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pData"));
				TOTAL_FRAME_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("totalFrameCount"));
				DECODED_FRAME_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("decodedFrameCount"));
				FORMAT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("format"));
				CHANNELS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("channels"));
				SAMPLE_RATE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sampleRate"));
				
				P_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pData"));
				TOTAL_FRAME_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("totalFrameCount"));
				DECODED_FRAME_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("decodedFrameCount"));
				FORMAT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("format"));
				CHANNELS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("channels"));
				SAMPLE_RATE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sampleRate"));
				//@formatter:on
			}
		
			public Decoded() {
			    this(Arena.ofAuto());
			}
			
			public Decoded(Arena arena) {
			    this(arena.allocate(LAYOUT));
			}
			
			public Decoded(MemorySegment segment) {
			    this.segment = segment;
			
			}
		
		    /// @see #pData()
		    public Decoded pData(MemorySegment pData) {
		    	P_DATA_HANDLE.set(segment, 0L, pData);
		    	return this;
		    }
		    
		    public @Nullable MemorySegment pData() {
		    	MemorySegment segment = (MemorySegment) P_DATA_HANDLE.get(this.segment, 0L);
		    
		    	if (segment.equals(MemorySegment.NULL))
		    		return null;
		    	
		    	return segment;
		    }
		    
		    /// @see #totalFrameCount()
		    public Decoded totalFrameCount(long totalFrameCount) {
		    	TOTAL_FRAME_COUNT_HANDLE.set(segment, 0L, totalFrameCount);
		    	return this;
		    }
		    
		    public long totalFrameCount() {
		    	return (long) TOTAL_FRAME_COUNT_HANDLE.get(segment, 0L);
		    }
		    
		    /// @see #decodedFrameCount()
		    public Decoded decodedFrameCount(long decodedFrameCount) {
		    	DECODED_FRAME_COUNT_HANDLE.set(segment, 0L, decodedFrameCount);
		    	return this;
		    }
		    
		    public long decodedFrameCount() {
		    	return (long) DECODED_FRAME_COUNT_HANDLE.get(segment, 0L);
		    }
		    
		    /// @see #format()
		    public Decoded format(int format) {
		    	FORMAT_HANDLE.set(segment, 0L, format);
		    	return this;
		    }
		    
		    public int format() {
		    	return (int) FORMAT_HANDLE.get(segment, 0L);
		    }
		    
		    /// @see #channels()
		    public Decoded channels(int channels) {
		    	CHANNELS_HANDLE.set(segment, 0L, channels);
		    	return this;
		    }
		    
		    public int channels() {
		    	return (int) CHANNELS_HANDLE.get(segment, 0L);
		    }
		    
		    /// @see #sampleRate()
		    public Decoded sampleRate(int sampleRate) {
		    	SAMPLE_RATE_HANDLE.set(segment, 0L, sampleRate);
		    	return this;
		    }
		    
		    public int sampleRate() {
		    	return (int) SAMPLE_RATE_HANDLE.get(segment, 0L);
		    }
		    
		    @Override
		    public Decoded set(Decoded other) {
		        return set(other.segment);
		    }
		    
		    @Override
		    public Decoded set(MemorySegment src) {
		        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
		        return this;
		    }
		    
		    @Override
		    public MemorySegment memorySegment() {
		        return segment;
		    }
		    
		    public NativeStructArray<Decoded> asArray() {
		        return new NativeStructArray<>(this);
		    }
		    
		    public static NativeStructArray<Decoded> array(Arena arena, int count) {
		        return new NativeStructArray<>(
		            arena,
		            LAYOUT,
		            segment -> new Decoded(segment),
		            count
		        );
		    }
		    
		    public static NativeStructArray<Decoded> array(Arena arena, Decoded... structs) {
		        NativeStructArray<Decoded> array = new NativeStructArray<>(
		            arena,
		            LAYOUT,
		            segment -> new Decoded(segment),
		            structs.length
		        );
		    
		        for (int i = 0; i < structs.length; i++) {
		            array.set(i, structs[i]);
		        }
		    
		        return array;
		    }
		    
		    public static NativeStructArray<Decoded> array(MemorySegment array) {
		        return new NativeStructArray<>(
		            array,
		            LAYOUT,
		            segment -> new Decoded(segment)
		        );
		    }
		
		}
	    
		public static class DecodedPaged implements Struct<DecodedPaged> {
		
			public static final StructLayout LAYOUT;
		
			public static final VarHandle DECODED_FRAME_COUNT_HANDLE;
			public static final VarHandle SAMPLE_RATE_HANDLE;
		
			public static final long DATA_BYTE_OFFSET;
			public static final long DECODED_FRAME_COUNT_BYTE_OFFSET;
			public static final long SAMPLE_RATE_BYTE_OFFSET;
		
			private final MemorySegment segment;
		
			private final MaPagedAudioBufferData data;
		
			static {
				//@formatter:off
				LAYOUT = MemoryLayout.structLayout(
				    MaPagedAudioBufferData.LAYOUT.withName("data"),
				    JAVA_LONG.withName("decodedFrameCount"),
				    JAVA_INT.withName("sampleRate"),
				    MemoryLayout.paddingLayout(4)
				).withName("DecodedPaged").withByteAlignment(8);
				
				DECODED_FRAME_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("decodedFrameCount"));
				SAMPLE_RATE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sampleRate"));
				
				DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("data"));
				DECODED_FRAME_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("decodedFrameCount"));
				SAMPLE_RATE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sampleRate"));
				//@formatter:on
			}
		
			public DecodedPaged() {
			    this(Arena.ofAuto());
			}
			
			public DecodedPaged(Arena arena) {
			    this(arena.allocate(LAYOUT));
			}
			
			public DecodedPaged(MemorySegment segment) {
			    this.segment = segment;
			
			    data = new MaPagedAudioBufferData(segment.asSlice(DATA_BYTE_OFFSET, MaPagedAudioBufferData.LAYOUT));
			}
		
		    /// @see #data()
		    public DecodedPaged data(Consumer<MaPagedAudioBufferData> consumer) {
		    	consumer.accept(data);
		    	return this;
		    }
		    
		    /// @see #data()
		    public DecodedPaged data(MaPagedAudioBufferData other) {
		    	data.set(other);
		    	return this;
		    }
		    
		    public MaPagedAudioBufferData data() {
		    	return data;
		    }
		    
		    /// @see #decodedFrameCount()
		    public DecodedPaged decodedFrameCount(long decodedFrameCount) {
		    	DECODED_FRAME_COUNT_HANDLE.set(segment, 0L, decodedFrameCount);
		    	return this;
		    }
		    
		    public long decodedFrameCount() {
		    	return (long) DECODED_FRAME_COUNT_HANDLE.get(segment, 0L);
		    }
		    
		    /// @see #sampleRate()
		    public DecodedPaged sampleRate(int sampleRate) {
		    	SAMPLE_RATE_HANDLE.set(segment, 0L, sampleRate);
		    	return this;
		    }
		    
		    public int sampleRate() {
		    	return (int) SAMPLE_RATE_HANDLE.get(segment, 0L);
		    }
		    
		    @Override
		    public DecodedPaged set(DecodedPaged other) {
		        return set(other.segment);
		    }
		    
		    @Override
		    public DecodedPaged set(MemorySegment src) {
		        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
		        return this;
		    }
		    
		    @Override
		    public MemorySegment memorySegment() {
		        return segment;
		    }
		    
		    public NativeStructArray<DecodedPaged> asArray() {
		        return new NativeStructArray<>(this);
		    }
		    
		    public static NativeStructArray<DecodedPaged> array(Arena arena, int count) {
		        return new NativeStructArray<>(
		            arena,
		            LAYOUT,
		            segment -> new DecodedPaged(segment),
		            count
		        );
		    }
		    
		    public static NativeStructArray<DecodedPaged> array(Arena arena, DecodedPaged... structs) {
		        NativeStructArray<DecodedPaged> array = new NativeStructArray<>(
		            arena,
		            LAYOUT,
		            segment -> new DecodedPaged(segment),
		            structs.length
		        );
		    
		        for (int i = 0; i < structs.length; i++) {
		            array.set(i, structs[i]);
		        }
		    
		        return array;
		    }
		    
		    public static NativeStructArray<DecodedPaged> array(MemorySegment array) {
		        return new NativeStructArray<>(
		            array,
		            LAYOUT,
		            segment -> new DecodedPaged(segment)
		        );
		    }
		
		}
	}
}