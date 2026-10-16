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
import volucris.bindings.core.NativeIntArray;
import volucris.bindings.core.NativePointerArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class MaContextCommandWasapi
		implements Struct<MaContextCommandWasapi> {

	public static final StructLayout LAYOUT;

	public static final VarHandle CODE_HANDLE;
	public static final VarHandle P_EVENT_HANDLE;

	public static final long CODE_BYTE_OFFSET;
	public static final long P_EVENT_BYTE_OFFSET;
	public static final long DATA_BYTE_OFFSET;

	private final MemorySegment segment;

	private final Data data;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("code"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pEvent"),
		    Data.LAYOUT.withName("data")
		).withName("ma_context_command__wasapi").withByteAlignment(8);
		
		CODE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("code"));
		P_EVENT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pEvent"));
		
		CODE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("code"));
		P_EVENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pEvent"));
		DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("data"));
		//@formatter:on
	}

	public MaContextCommandWasapi() {
	    this(Arena.ofAuto());
	}
	
	public MaContextCommandWasapi(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public MaContextCommandWasapi(MemorySegment segment) {
	    this.segment = segment;
	
	    data = new Data(segment.asSlice(DATA_BYTE_OFFSET, Data.LAYOUT));
	}

    /// @see #code()
    public MaContextCommandWasapi code(int code) {
    	CODE_HANDLE.set(segment, 0L, code);
    	return this;
    }
    
    public int code() {
    	return (int) CODE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pEvent()
    public MaContextCommandWasapi pEvent(NativePointerArray pEvent) {
    	P_EVENT_HANDLE.set(segment, 0L, pEvent.memorySegment());
    	return this;
    }
    
    public @Nullable NativePointerArray pEvent() {
    	MemorySegment segment = (MemorySegment) P_EVENT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativePointerArray(segment);
    }
    
    /// @see #data()
    public MaContextCommandWasapi data(Consumer<Data> consumer) {
    	consumer.accept(data);
    	return this;
    }
    
    /// @see #data()
    public MaContextCommandWasapi data(Data other) {
    	data.set(other);
    	return this;
    }
    
    public Data data() {
    	return data;
    }
    
    @Override
    public MaContextCommandWasapi set(MaContextCommandWasapi other) {
        return set(other.segment);
    }
    
    @Override
    public MaContextCommandWasapi set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaContextCommandWasapi> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaContextCommandWasapi> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaContextCommandWasapi(segment),
            count
        );
    }
    
    public static NativeStructArray<MaContextCommandWasapi> array(Arena arena, MaContextCommandWasapi... structs) {
        NativeStructArray<MaContextCommandWasapi> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaContextCommandWasapi(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaContextCommandWasapi> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaContextCommandWasapi(segment)
        );
    }

	public static class Data implements Struct<Data> {
	
		public static final UnionLayout LAYOUT;
	
		public static final long QUIT_BYTE_OFFSET;
		public static final long CREATE_AUDIO_CLIENT_BYTE_OFFSET;
		public static final long RELEASE_AUDIO_CLIENT_BYTE_OFFSET;
	
		private final MemorySegment segment;
	
		private final Quit quit;
		private final CreateAudioClient createAudioClient;
		private final ReleaseAudioClient releaseAudioClient;
	
		static {
			//@formatter:off
			LAYOUT = MemoryLayout.unionLayout(
			    Quit.LAYOUT.withName("quit"),
			    CreateAudioClient.LAYOUT.withName("createAudioClient"),
			    ReleaseAudioClient.LAYOUT.withName("releaseAudioClient")
			).withName("Data").withByteAlignment(8);
			
			QUIT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("quit"));
			CREATE_AUDIO_CLIENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("createAudioClient"));
			RELEASE_AUDIO_CLIENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("releaseAudioClient"));
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
		
		    quit = new Quit(segment.asSlice(QUIT_BYTE_OFFSET, Quit.LAYOUT));
		    createAudioClient = new CreateAudioClient(segment.asSlice(CREATE_AUDIO_CLIENT_BYTE_OFFSET, CreateAudioClient.LAYOUT));
		    releaseAudioClient = new ReleaseAudioClient(segment.asSlice(RELEASE_AUDIO_CLIENT_BYTE_OFFSET, ReleaseAudioClient.LAYOUT));
		}
	
	    /// @see #quit()
	    public Data quit(Consumer<Quit> consumer) {
	    	consumer.accept(quit);
	    	return this;
	    }
	    
	    /// @see #quit()
	    public Data quit(Quit other) {
	    	quit.set(other);
	    	return this;
	    }
	    
	    public Quit quit() {
	    	return quit;
	    }
	    
	    /// @see #createAudioClient()
	    public Data createAudioClient(Consumer<CreateAudioClient> consumer) {
	    	consumer.accept(createAudioClient);
	    	return this;
	    }
	    
	    /// @see #createAudioClient()
	    public Data createAudioClient(CreateAudioClient other) {
	    	createAudioClient.set(other);
	    	return this;
	    }
	    
	    public CreateAudioClient createAudioClient() {
	    	return createAudioClient;
	    }
	    
	    /// @see #releaseAudioClient()
	    public Data releaseAudioClient(Consumer<ReleaseAudioClient> consumer) {
	    	consumer.accept(releaseAudioClient);
	    	return this;
	    }
	    
	    /// @see #releaseAudioClient()
	    public Data releaseAudioClient(ReleaseAudioClient other) {
	    	releaseAudioClient.set(other);
	    	return this;
	    }
	    
	    public ReleaseAudioClient releaseAudioClient() {
	    	return releaseAudioClient;
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
	
		public static class Quit implements Struct<Quit> {
		
			public static final StructLayout LAYOUT;
		
			public static final VarHandle _UNUSED_HANDLE;
		
			public static final long _UNUSED_BYTE_OFFSET;
		
			private final MemorySegment segment;
		
			static {
				//@formatter:off
				LAYOUT = MemoryLayout.structLayout(
				    JAVA_INT.withName("_unused")
				).withName("Quit").withByteAlignment(4);
				
				_UNUSED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("_unused"));
				
				_UNUSED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("_unused"));
				//@formatter:on
			}
		
			public Quit() {
			    this(Arena.ofAuto());
			}
			
			public Quit(Arena arena) {
			    this(arena.allocate(LAYOUT));
			}
			
			public Quit(MemorySegment segment) {
			    this.segment = segment;
			
			}
		
		    /// @see #_unused()
		    public Quit _unused(int _unused) {
		    	_UNUSED_HANDLE.set(segment, 0L, _unused);
		    	return this;
		    }
		    
		    public int _unused() {
		    	return (int) _UNUSED_HANDLE.get(segment, 0L);
		    }
		    
		    @Override
		    public Quit set(Quit other) {
		        return set(other.segment);
		    }
		    
		    @Override
		    public Quit set(MemorySegment src) {
		        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
		        return this;
		    }
		    
		    @Override
		    public MemorySegment memorySegment() {
		        return segment;
		    }
		    
		    public NativeStructArray<Quit> asArray() {
		        return new NativeStructArray<>(this);
		    }
		    
		    public static NativeStructArray<Quit> array(Arena arena, int count) {
		        return new NativeStructArray<>(
		            arena,
		            LAYOUT,
		            segment -> new Quit(segment),
		            count
		        );
		    }
		    
		    public static NativeStructArray<Quit> array(Arena arena, Quit... structs) {
		        NativeStructArray<Quit> array = new NativeStructArray<>(
		            arena,
		            LAYOUT,
		            segment -> new Quit(segment),
		            structs.length
		        );
		    
		        for (int i = 0; i < structs.length; i++) {
		            array.set(i, structs[i]);
		        }
		    
		        return array;
		    }
		    
		    public static NativeStructArray<Quit> array(MemorySegment array) {
		        return new NativeStructArray<>(
		            array,
		            LAYOUT,
		            segment -> new Quit(segment)
		        );
		    }
		
		}
	    
		public static class CreateAudioClient implements Struct<CreateAudioClient> {
		
			public static final StructLayout LAYOUT;
		
			public static final VarHandle DEVICE_TYPE_HANDLE;
			public static final VarHandle P_AUDIO_CLIENT_HANDLE;
			public static final VarHandle PP_AUDIO_CLIENT_SERVICE_HANDLE;
			public static final VarHandle P_RESULT_HANDLE;
		
			public static final long DEVICE_TYPE_BYTE_OFFSET;
			public static final long P_AUDIO_CLIENT_BYTE_OFFSET;
			public static final long PP_AUDIO_CLIENT_SERVICE_BYTE_OFFSET;
			public static final long P_RESULT_BYTE_OFFSET;
		
			private final MemorySegment segment;
		
			static {
				//@formatter:off
				LAYOUT = MemoryLayout.structLayout(
				    JAVA_INT.withName("deviceType"),
				    MemoryLayout.paddingLayout(4),
				    UNBOUNDED_ADDRESS.withName("pAudioClient"),
				    UNBOUNDED_ADDRESS.withName("ppAudioClientService"),
				    UNBOUNDED_ADDRESS.withName("pResult")
				).withName("CreateAudioClient").withByteAlignment(8);
				
				DEVICE_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("deviceType"));
				P_AUDIO_CLIENT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pAudioClient"));
				PP_AUDIO_CLIENT_SERVICE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("ppAudioClientService"));
				P_RESULT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pResult"));
				
				DEVICE_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("deviceType"));
				P_AUDIO_CLIENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pAudioClient"));
				PP_AUDIO_CLIENT_SERVICE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("ppAudioClientService"));
				P_RESULT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pResult"));
				//@formatter:on
			}
		
			public CreateAudioClient() {
			    this(Arena.ofAuto());
			}
			
			public CreateAudioClient(Arena arena) {
			    this(arena.allocate(LAYOUT));
			}
			
			public CreateAudioClient(MemorySegment segment) {
			    this.segment = segment;
			
			}
		
		    /// @see #deviceType()
		    public CreateAudioClient deviceType(int deviceType) {
		    	DEVICE_TYPE_HANDLE.set(segment, 0L, deviceType);
		    	return this;
		    }
		    
		    public int deviceType() {
		    	return (int) DEVICE_TYPE_HANDLE.get(segment, 0L);
		    }
		    
		    /// @see #pAudioClient()
		    public CreateAudioClient pAudioClient(MemorySegment pAudioClient) {
		    	P_AUDIO_CLIENT_HANDLE.set(segment, 0L, pAudioClient);
		    	return this;
		    }
		    
		    public @Nullable MemorySegment pAudioClient() {
		    	MemorySegment segment = (MemorySegment) P_AUDIO_CLIENT_HANDLE.get(this.segment, 0L);
		    
		    	if (segment.equals(MemorySegment.NULL))
		    		return null;
		    	
		    	return segment;
		    }
		    
		    /// @see #ppAudioClientService()
		    public CreateAudioClient ppAudioClientService(NativePointerArray ppAudioClientService) {
		    	PP_AUDIO_CLIENT_SERVICE_HANDLE.set(segment, 0L, ppAudioClientService.memorySegment());
		    	return this;
		    }
		    
		    public @Nullable NativePointerArray ppAudioClientService() {
		    	MemorySegment segment = (MemorySegment) PP_AUDIO_CLIENT_SERVICE_HANDLE.get(this.segment, 0L);
		    
		    	if (segment.equals(MemorySegment.NULL))
		    		return null;
		    	
		    	return new NativePointerArray(segment);
		    }
		    
		    /// @see #pResult()
		    public CreateAudioClient pResult(NativeIntArray pResult) {
		    	P_RESULT_HANDLE.set(segment, 0L, pResult.memorySegment());
		    	return this;
		    }
		    
		    public @Nullable NativeIntArray pResult() {
		    	MemorySegment segment = (MemorySegment) P_RESULT_HANDLE.get(this.segment, 0L);
		    
		    	if (segment.equals(MemorySegment.NULL))
		    		return null;
		    	
		    	return new NativeIntArray(segment);
		    }
		    
		    @Override
		    public CreateAudioClient set(CreateAudioClient other) {
		        return set(other.segment);
		    }
		    
		    @Override
		    public CreateAudioClient set(MemorySegment src) {
		        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
		        return this;
		    }
		    
		    @Override
		    public MemorySegment memorySegment() {
		        return segment;
		    }
		    
		    public NativeStructArray<CreateAudioClient> asArray() {
		        return new NativeStructArray<>(this);
		    }
		    
		    public static NativeStructArray<CreateAudioClient> array(Arena arena, int count) {
		        return new NativeStructArray<>(
		            arena,
		            LAYOUT,
		            segment -> new CreateAudioClient(segment),
		            count
		        );
		    }
		    
		    public static NativeStructArray<CreateAudioClient> array(Arena arena, CreateAudioClient... structs) {
		        NativeStructArray<CreateAudioClient> array = new NativeStructArray<>(
		            arena,
		            LAYOUT,
		            segment -> new CreateAudioClient(segment),
		            structs.length
		        );
		    
		        for (int i = 0; i < structs.length; i++) {
		            array.set(i, structs[i]);
		        }
		    
		        return array;
		    }
		    
		    public static NativeStructArray<CreateAudioClient> array(MemorySegment array) {
		        return new NativeStructArray<>(
		            array,
		            LAYOUT,
		            segment -> new CreateAudioClient(segment)
		        );
		    }
		
		}
	    
		public static class ReleaseAudioClient implements Struct<ReleaseAudioClient> {
		
			public static final StructLayout LAYOUT;
		
			public static final VarHandle P_DEVICE_HANDLE;
			public static final VarHandle DEVICE_TYPE_HANDLE;
		
			public static final long P_DEVICE_BYTE_OFFSET;
			public static final long DEVICE_TYPE_BYTE_OFFSET;
		
			private final MemorySegment segment;
		
			static {
				//@formatter:off
				LAYOUT = MemoryLayout.structLayout(
				    UNBOUNDED_ADDRESS.withName("pDevice"),
				    JAVA_INT.withName("deviceType"),
				    MemoryLayout.paddingLayout(4)
				).withName("ReleaseAudioClient").withByteAlignment(8);
				
				P_DEVICE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pDevice"));
				DEVICE_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("deviceType"));
				
				P_DEVICE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pDevice"));
				DEVICE_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("deviceType"));
				//@formatter:on
			}
		
			public ReleaseAudioClient() {
			    this(Arena.ofAuto());
			}
			
			public ReleaseAudioClient(Arena arena) {
			    this(arena.allocate(LAYOUT));
			}
			
			public ReleaseAudioClient(MemorySegment segment) {
			    this.segment = segment;
			
			}
		
		    /// @see #pDevice()
		    public ReleaseAudioClient pDevice(MaDevice pDevice) {
		    	P_DEVICE_HANDLE.set(segment, 0L, pDevice.memorySegment());
		    	return this;
		    }
		    
		    public @Nullable MaDevice pDevice() {
		    	MemorySegment segment = (MemorySegment) P_DEVICE_HANDLE.get(this.segment, 0L);
		    
		    	if (segment.equals(MemorySegment.NULL))
		    		return null;
		    	
		    	return new MaDevice(segment);
		    }
		    
		    /// @see #deviceType()
		    public ReleaseAudioClient deviceType(int deviceType) {
		    	DEVICE_TYPE_HANDLE.set(segment, 0L, deviceType);
		    	return this;
		    }
		    
		    public int deviceType() {
		    	return (int) DEVICE_TYPE_HANDLE.get(segment, 0L);
		    }
		    
		    @Override
		    public ReleaseAudioClient set(ReleaseAudioClient other) {
		        return set(other.segment);
		    }
		    
		    @Override
		    public ReleaseAudioClient set(MemorySegment src) {
		        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
		        return this;
		    }
		    
		    @Override
		    public MemorySegment memorySegment() {
		        return segment;
		    }
		    
		    public NativeStructArray<ReleaseAudioClient> asArray() {
		        return new NativeStructArray<>(this);
		    }
		    
		    public static NativeStructArray<ReleaseAudioClient> array(Arena arena, int count) {
		        return new NativeStructArray<>(
		            arena,
		            LAYOUT,
		            segment -> new ReleaseAudioClient(segment),
		            count
		        );
		    }
		    
		    public static NativeStructArray<ReleaseAudioClient> array(Arena arena, ReleaseAudioClient... structs) {
		        NativeStructArray<ReleaseAudioClient> array = new NativeStructArray<>(
		            arena,
		            LAYOUT,
		            segment -> new ReleaseAudioClient(segment),
		            structs.length
		        );
		    
		        for (int i = 0; i < structs.length; i++) {
		            array.set(i, structs[i]);
		        }
		    
		        return array;
		    }
		    
		    public static NativeStructArray<ReleaseAudioClient> array(MemorySegment array) {
		        return new NativeStructArray<>(
		            array,
		            LAYOUT,
		            segment -> new ReleaseAudioClient(segment)
		        );
		    }
		
		}
	}
}