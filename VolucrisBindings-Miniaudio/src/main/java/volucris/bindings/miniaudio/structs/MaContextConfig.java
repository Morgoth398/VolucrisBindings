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
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeByteArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class MaContextConfig
		implements Struct<MaContextConfig> {

	public static final StructLayout LAYOUT;

	public static final VarHandle P_LOG_HANDLE;
	public static final VarHandle THREAD_PRIORITY_HANDLE;
	public static final VarHandle THREAD_STACK_SIZE_HANDLE;
	public static final VarHandle P_USER_DATA_HANDLE;

	public static final long P_LOG_BYTE_OFFSET;
	public static final long THREAD_PRIORITY_BYTE_OFFSET;
	public static final long THREAD_STACK_SIZE_BYTE_OFFSET;
	public static final long P_USER_DATA_BYTE_OFFSET;
	public static final long ALLOCATION_CALLBACKS_BYTE_OFFSET;
	public static final long DSOUND_BYTE_OFFSET;
	public static final long ALSA_BYTE_OFFSET;
	public static final long PULSE_BYTE_OFFSET;
	public static final long COREAUDIO_BYTE_OFFSET;
	public static final long JACK_BYTE_OFFSET;
	public static final long CUSTOM_BYTE_OFFSET;

	private final MemorySegment segment;

	private final MaAllocationCallbacks allocationCallbacks;
	private final Dsound dsound;
	private final Alsa alsa;
	private final Pulse pulse;
	private final Coreaudio coreaudio;
	private final Jack jack;
	private final MaBackendCallbacks custom;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    UNBOUNDED_ADDRESS.withName("pLog"),
		    JAVA_INT.withName("threadPriority"),
		    MemoryLayout.paddingLayout(4),
		    JAVA_LONG.withName("threadStackSize"),
		    UNBOUNDED_ADDRESS.withName("pUserData"),
		    MaAllocationCallbacks.LAYOUT.withName("allocationCallbacks"),
		    Dsound.LAYOUT.withName("dsound"),
		    Alsa.LAYOUT.withName("alsa"),
		    MemoryLayout.paddingLayout(4),
		    Pulse.LAYOUT.withName("pulse"),
		    Coreaudio.LAYOUT.withName("coreaudio"),
		    Jack.LAYOUT.withName("jack"),
		    MaBackendCallbacks.LAYOUT.withName("custom")
		).withName("ma_context_config").withByteAlignment(8);
		
		P_LOG_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pLog"));
		THREAD_PRIORITY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("threadPriority"));
		THREAD_STACK_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("threadStackSize"));
		P_USER_DATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pUserData"));
		
		P_LOG_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pLog"));
		THREAD_PRIORITY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("threadPriority"));
		THREAD_STACK_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("threadStackSize"));
		P_USER_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pUserData"));
		ALLOCATION_CALLBACKS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("allocationCallbacks"));
		DSOUND_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dsound"));
		ALSA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("alsa"));
		PULSE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pulse"));
		COREAUDIO_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("coreaudio"));
		JACK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("jack"));
		CUSTOM_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("custom"));
		//@formatter:on
	}

	public MaContextConfig() {
	    this(Arena.ofAuto());
	}
	
	public MaContextConfig(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public MaContextConfig(MemorySegment segment) {
	    this.segment = segment;
	
	    allocationCallbacks = new MaAllocationCallbacks(segment.asSlice(ALLOCATION_CALLBACKS_BYTE_OFFSET, MaAllocationCallbacks.LAYOUT));
	    dsound = new Dsound(segment.asSlice(DSOUND_BYTE_OFFSET, Dsound.LAYOUT));
	    alsa = new Alsa(segment.asSlice(ALSA_BYTE_OFFSET, Alsa.LAYOUT));
	    pulse = new Pulse(segment.asSlice(PULSE_BYTE_OFFSET, Pulse.LAYOUT));
	    coreaudio = new Coreaudio(segment.asSlice(COREAUDIO_BYTE_OFFSET, Coreaudio.LAYOUT));
	    jack = new Jack(segment.asSlice(JACK_BYTE_OFFSET, Jack.LAYOUT));
	    custom = new MaBackendCallbacks(segment.asSlice(CUSTOM_BYTE_OFFSET, MaBackendCallbacks.LAYOUT));
	}

    /// @see #pLog()
    public MaContextConfig pLog(MaLog pLog) {
    	P_LOG_HANDLE.set(segment, 0L, pLog.memorySegment());
    	return this;
    }
    
    public @Nullable MaLog pLog() {
    	MemorySegment segment = (MemorySegment) P_LOG_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaLog(segment);
    }
    
    /// @see #threadPriority()
    public MaContextConfig threadPriority(int threadPriority) {
    	THREAD_PRIORITY_HANDLE.set(segment, 0L, threadPriority);
    	return this;
    }
    
    public int threadPriority() {
    	return (int) THREAD_PRIORITY_HANDLE.get(segment, 0L);
    }
    
    /// @see #threadStackSize()
    public MaContextConfig threadStackSize(long threadStackSize) {
    	THREAD_STACK_SIZE_HANDLE.set(segment, 0L, threadStackSize);
    	return this;
    }
    
    public long threadStackSize() {
    	return (long) THREAD_STACK_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pUserData()
    public MaContextConfig pUserData(MemorySegment pUserData) {
    	P_USER_DATA_HANDLE.set(segment, 0L, pUserData);
    	return this;
    }
    
    public @Nullable MemorySegment pUserData() {
    	MemorySegment segment = (MemorySegment) P_USER_DATA_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #allocationCallbacks()
    public MaContextConfig allocationCallbacks(Consumer<MaAllocationCallbacks> consumer) {
    	consumer.accept(allocationCallbacks);
    	return this;
    }
    
    /// @see #allocationCallbacks()
    public MaContextConfig allocationCallbacks(MaAllocationCallbacks other) {
    	allocationCallbacks.set(other);
    	return this;
    }
    
    public MaAllocationCallbacks allocationCallbacks() {
    	return allocationCallbacks;
    }
    
    /// @see #dsound()
    public MaContextConfig dsound(Consumer<Dsound> consumer) {
    	consumer.accept(dsound);
    	return this;
    }
    
    /// @see #dsound()
    public MaContextConfig dsound(Dsound other) {
    	dsound.set(other);
    	return this;
    }
    
    public Dsound dsound() {
    	return dsound;
    }
    
    /// @see #alsa()
    public MaContextConfig alsa(Consumer<Alsa> consumer) {
    	consumer.accept(alsa);
    	return this;
    }
    
    /// @see #alsa()
    public MaContextConfig alsa(Alsa other) {
    	alsa.set(other);
    	return this;
    }
    
    public Alsa alsa() {
    	return alsa;
    }
    
    /// @see #pulse()
    public MaContextConfig pulse(Consumer<Pulse> consumer) {
    	consumer.accept(pulse);
    	return this;
    }
    
    /// @see #pulse()
    public MaContextConfig pulse(Pulse other) {
    	pulse.set(other);
    	return this;
    }
    
    public Pulse pulse() {
    	return pulse;
    }
    
    /// @see #coreaudio()
    public MaContextConfig coreaudio(Consumer<Coreaudio> consumer) {
    	consumer.accept(coreaudio);
    	return this;
    }
    
    /// @see #coreaudio()
    public MaContextConfig coreaudio(Coreaudio other) {
    	coreaudio.set(other);
    	return this;
    }
    
    public Coreaudio coreaudio() {
    	return coreaudio;
    }
    
    /// @see #jack()
    public MaContextConfig jack(Consumer<Jack> consumer) {
    	consumer.accept(jack);
    	return this;
    }
    
    /// @see #jack()
    public MaContextConfig jack(Jack other) {
    	jack.set(other);
    	return this;
    }
    
    public Jack jack() {
    	return jack;
    }
    
    /// @see #custom()
    public MaContextConfig custom(Consumer<MaBackendCallbacks> consumer) {
    	consumer.accept(custom);
    	return this;
    }
    
    /// @see #custom()
    public MaContextConfig custom(MaBackendCallbacks other) {
    	custom.set(other);
    	return this;
    }
    
    public MaBackendCallbacks custom() {
    	return custom;
    }
    
    @Override
    public MaContextConfig set(MaContextConfig other) {
        return set(other.segment);
    }
    
    @Override
    public MaContextConfig set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaContextConfig> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaContextConfig> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaContextConfig(segment),
            count
        );
    }
    
    public static NativeStructArray<MaContextConfig> array(SegmentAllocator allocator, MaContextConfig... structs) {
        NativeStructArray<MaContextConfig> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaContextConfig(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaContextConfig> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaContextConfig(segment)
        );
    }

	public static class Dsound implements Struct<Dsound> {
	
		public static final StructLayout LAYOUT;
	
		public static final VarHandle H_WND_HANDLE;
	
		public static final long H_WND_BYTE_OFFSET;
	
		private final MemorySegment segment;
	
		static {
			//@formatter:off
			LAYOUT = MemoryLayout.structLayout(
			    UNBOUNDED_ADDRESS.withName("hWnd")
			).withName("Dsound").withByteAlignment(8);
			
			H_WND_HANDLE = LAYOUT.varHandle(PathElement.groupElement("hWnd"));
			
			H_WND_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("hWnd"));
			//@formatter:on
		}
	
		public Dsound() {
		    this(Arena.ofAuto());
		}
		
		public Dsound(SegmentAllocator allocator) {
		    this(allocator.allocate(LAYOUT));
		}
		
		public Dsound(MemorySegment segment) {
		    this.segment = segment;
		
		}
	
	    /// @see #hWnd()
	    public Dsound hWnd(MemorySegment hWnd) {
	    	H_WND_HANDLE.set(segment, 0L, hWnd);
	    	return this;
	    }
	    
	    public @Nullable MemorySegment hWnd() {
	    	MemorySegment segment = (MemorySegment) H_WND_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return segment;
	    }
	    
	    @Override
	    public Dsound set(Dsound other) {
	        return set(other.segment);
	    }
	    
	    @Override
	    public Dsound set(MemorySegment src) {
	        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
	        return this;
	    }
	    
	    @Override
	    public MemorySegment memorySegment() {
	        return segment;
	    }
	    
	    public NativeStructArray<Dsound> asArray() {
	        return new NativeStructArray<>(this);
	    }
	    
	    public static NativeStructArray<Dsound> array(SegmentAllocator allocator, int count) {
	        return new NativeStructArray<>(
	            allocator,
	            LAYOUT,
	            segment -> new Dsound(segment),
	            count
	        );
	    }
	    
	    public static NativeStructArray<Dsound> array(SegmentAllocator allocator, Dsound... structs) {
	        NativeStructArray<Dsound> array = new NativeStructArray<>(
	            allocator,
	            LAYOUT,
	            segment -> new Dsound(segment),
	            structs.length
	        );
	    
	        for (int i = 0; i < structs.length; i++) {
	            array.set(i, structs[i]);
	        }
	    
	        return array;
	    }
	    
	    public static NativeStructArray<Dsound> array(MemorySegment array) {
	        return new NativeStructArray<>(
	            array,
	            LAYOUT,
	            segment -> new Dsound(segment)
	        );
	    }
	
	}
    
	public static class Alsa implements Struct<Alsa> {
	
		public static final StructLayout LAYOUT;
	
		public static final VarHandle USE_VERBOSE_DEVICE_ENUMERATION_HANDLE;
	
		public static final long USE_VERBOSE_DEVICE_ENUMERATION_BYTE_OFFSET;
	
		private final MemorySegment segment;
	
		static {
			//@formatter:off
			LAYOUT = MemoryLayout.structLayout(
			    JAVA_INT.withName("useVerboseDeviceEnumeration")
			).withName("Alsa").withByteAlignment(4);
			
			USE_VERBOSE_DEVICE_ENUMERATION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("useVerboseDeviceEnumeration"));
			
			USE_VERBOSE_DEVICE_ENUMERATION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("useVerboseDeviceEnumeration"));
			//@formatter:on
		}
	
		public Alsa() {
		    this(Arena.ofAuto());
		}
		
		public Alsa(SegmentAllocator allocator) {
		    this(allocator.allocate(LAYOUT));
		}
		
		public Alsa(MemorySegment segment) {
		    this.segment = segment;
		
		}
	
	    /// @see #useVerboseDeviceEnumeration()
	    public Alsa useVerboseDeviceEnumeration(int useVerboseDeviceEnumeration) {
	    	USE_VERBOSE_DEVICE_ENUMERATION_HANDLE.set(segment, 0L, useVerboseDeviceEnumeration);
	    	return this;
	    }
	    
	    public int useVerboseDeviceEnumeration() {
	    	return (int) USE_VERBOSE_DEVICE_ENUMERATION_HANDLE.get(segment, 0L);
	    }
	    
	    @Override
	    public Alsa set(Alsa other) {
	        return set(other.segment);
	    }
	    
	    @Override
	    public Alsa set(MemorySegment src) {
	        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
	        return this;
	    }
	    
	    @Override
	    public MemorySegment memorySegment() {
	        return segment;
	    }
	    
	    public NativeStructArray<Alsa> asArray() {
	        return new NativeStructArray<>(this);
	    }
	    
	    public static NativeStructArray<Alsa> array(SegmentAllocator allocator, int count) {
	        return new NativeStructArray<>(
	            allocator,
	            LAYOUT,
	            segment -> new Alsa(segment),
	            count
	        );
	    }
	    
	    public static NativeStructArray<Alsa> array(SegmentAllocator allocator, Alsa... structs) {
	        NativeStructArray<Alsa> array = new NativeStructArray<>(
	            allocator,
	            LAYOUT,
	            segment -> new Alsa(segment),
	            structs.length
	        );
	    
	        for (int i = 0; i < structs.length; i++) {
	            array.set(i, structs[i]);
	        }
	    
	        return array;
	    }
	    
	    public static NativeStructArray<Alsa> array(MemorySegment array) {
	        return new NativeStructArray<>(
	            array,
	            LAYOUT,
	            segment -> new Alsa(segment)
	        );
	    }
	
	}
    
	public static class Pulse implements Struct<Pulse> {
	
		public static final StructLayout LAYOUT;
	
		public static final VarHandle P_APPLICATION_NAME_HANDLE;
		public static final VarHandle P_SERVER_NAME_HANDLE;
		public static final VarHandle TRY_AUTO_SPAWN_HANDLE;
	
		public static final long P_APPLICATION_NAME_BYTE_OFFSET;
		public static final long P_SERVER_NAME_BYTE_OFFSET;
		public static final long TRY_AUTO_SPAWN_BYTE_OFFSET;
	
		private final MemorySegment segment;
	
		static {
			//@formatter:off
			LAYOUT = MemoryLayout.structLayout(
			    UNBOUNDED_ADDRESS.withName("pApplicationName"),
			    UNBOUNDED_ADDRESS.withName("pServerName"),
			    JAVA_INT.withName("tryAutoSpawn"),
			    MemoryLayout.paddingLayout(4)
			).withName("Pulse").withByteAlignment(8);
			
			P_APPLICATION_NAME_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pApplicationName"));
			P_SERVER_NAME_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pServerName"));
			TRY_AUTO_SPAWN_HANDLE = LAYOUT.varHandle(PathElement.groupElement("tryAutoSpawn"));
			
			P_APPLICATION_NAME_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pApplicationName"));
			P_SERVER_NAME_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pServerName"));
			TRY_AUTO_SPAWN_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("tryAutoSpawn"));
			//@formatter:on
		}
	
		public Pulse() {
		    this(Arena.ofAuto());
		}
		
		public Pulse(SegmentAllocator allocator) {
		    this(allocator.allocate(LAYOUT));
		}
		
		public Pulse(MemorySegment segment) {
		    this.segment = segment;
		
		}
	
	    /// @see #pApplicationName()
	    public Pulse pApplicationName(NativeByteArray pApplicationName) {
	    	P_APPLICATION_NAME_HANDLE.set(segment, 0L, pApplicationName.memorySegment());
	    	return this;
	    }
	    
	    public @Nullable NativeByteArray pApplicationName() {
	    	MemorySegment segment = (MemorySegment) P_APPLICATION_NAME_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return new NativeByteArray(segment);
	    }
	    
	    /// @see #pServerName()
	    public Pulse pServerName(NativeByteArray pServerName) {
	    	P_SERVER_NAME_HANDLE.set(segment, 0L, pServerName.memorySegment());
	    	return this;
	    }
	    
	    public @Nullable NativeByteArray pServerName() {
	    	MemorySegment segment = (MemorySegment) P_SERVER_NAME_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return new NativeByteArray(segment);
	    }
	    
	    /// @see #tryAutoSpawn()
	    public Pulse tryAutoSpawn(int tryAutoSpawn) {
	    	TRY_AUTO_SPAWN_HANDLE.set(segment, 0L, tryAutoSpawn);
	    	return this;
	    }
	    
	    public int tryAutoSpawn() {
	    	return (int) TRY_AUTO_SPAWN_HANDLE.get(segment, 0L);
	    }
	    
	    @Override
	    public Pulse set(Pulse other) {
	        return set(other.segment);
	    }
	    
	    @Override
	    public Pulse set(MemorySegment src) {
	        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
	        return this;
	    }
	    
	    @Override
	    public MemorySegment memorySegment() {
	        return segment;
	    }
	    
	    public NativeStructArray<Pulse> asArray() {
	        return new NativeStructArray<>(this);
	    }
	    
	    public static NativeStructArray<Pulse> array(SegmentAllocator allocator, int count) {
	        return new NativeStructArray<>(
	            allocator,
	            LAYOUT,
	            segment -> new Pulse(segment),
	            count
	        );
	    }
	    
	    public static NativeStructArray<Pulse> array(SegmentAllocator allocator, Pulse... structs) {
	        NativeStructArray<Pulse> array = new NativeStructArray<>(
	            allocator,
	            LAYOUT,
	            segment -> new Pulse(segment),
	            structs.length
	        );
	    
	        for (int i = 0; i < structs.length; i++) {
	            array.set(i, structs[i]);
	        }
	    
	        return array;
	    }
	    
	    public static NativeStructArray<Pulse> array(MemorySegment array) {
	        return new NativeStructArray<>(
	            array,
	            LAYOUT,
	            segment -> new Pulse(segment)
	        );
	    }
	
	}
    
	public static class Coreaudio implements Struct<Coreaudio> {
	
		public static final StructLayout LAYOUT;
	
		public static final VarHandle SESSION_CATEGORY_HANDLE;
		public static final VarHandle SESSION_CATEGORY_OPTIONS_HANDLE;
		public static final VarHandle NO_AUDIO_SESSION_ACTIVATE_HANDLE;
		public static final VarHandle NO_AUDIO_SESSION_DEACTIVATE_HANDLE;
	
		public static final long SESSION_CATEGORY_BYTE_OFFSET;
		public static final long SESSION_CATEGORY_OPTIONS_BYTE_OFFSET;
		public static final long NO_AUDIO_SESSION_ACTIVATE_BYTE_OFFSET;
		public static final long NO_AUDIO_SESSION_DEACTIVATE_BYTE_OFFSET;
	
		private final MemorySegment segment;
	
		static {
			//@formatter:off
			LAYOUT = MemoryLayout.structLayout(
			    JAVA_INT.withName("sessionCategory"),
			    JAVA_INT.withName("sessionCategoryOptions"),
			    JAVA_INT.withName("noAudioSessionActivate"),
			    JAVA_INT.withName("noAudioSessionDeactivate")
			).withName("Coreaudio").withByteAlignment(4);
			
			SESSION_CATEGORY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sessionCategory"));
			SESSION_CATEGORY_OPTIONS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sessionCategoryOptions"));
			NO_AUDIO_SESSION_ACTIVATE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("noAudioSessionActivate"));
			NO_AUDIO_SESSION_DEACTIVATE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("noAudioSessionDeactivate"));
			
			SESSION_CATEGORY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sessionCategory"));
			SESSION_CATEGORY_OPTIONS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sessionCategoryOptions"));
			NO_AUDIO_SESSION_ACTIVATE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("noAudioSessionActivate"));
			NO_AUDIO_SESSION_DEACTIVATE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("noAudioSessionDeactivate"));
			//@formatter:on
		}
	
		public Coreaudio() {
		    this(Arena.ofAuto());
		}
		
		public Coreaudio(SegmentAllocator allocator) {
		    this(allocator.allocate(LAYOUT));
		}
		
		public Coreaudio(MemorySegment segment) {
		    this.segment = segment;
		
		}
	
	    /// @see #sessionCategory()
	    public Coreaudio sessionCategory(int sessionCategory) {
	    	SESSION_CATEGORY_HANDLE.set(segment, 0L, sessionCategory);
	    	return this;
	    }
	    
	    public int sessionCategory() {
	    	return (int) SESSION_CATEGORY_HANDLE.get(segment, 0L);
	    }
	    
	    /// @see #sessionCategoryOptions()
	    public Coreaudio sessionCategoryOptions(int sessionCategoryOptions) {
	    	SESSION_CATEGORY_OPTIONS_HANDLE.set(segment, 0L, sessionCategoryOptions);
	    	return this;
	    }
	    
	    public int sessionCategoryOptions() {
	    	return (int) SESSION_CATEGORY_OPTIONS_HANDLE.get(segment, 0L);
	    }
	    
	    /// @see #noAudioSessionActivate()
	    public Coreaudio noAudioSessionActivate(int noAudioSessionActivate) {
	    	NO_AUDIO_SESSION_ACTIVATE_HANDLE.set(segment, 0L, noAudioSessionActivate);
	    	return this;
	    }
	    
	    public int noAudioSessionActivate() {
	    	return (int) NO_AUDIO_SESSION_ACTIVATE_HANDLE.get(segment, 0L);
	    }
	    
	    /// @see #noAudioSessionDeactivate()
	    public Coreaudio noAudioSessionDeactivate(int noAudioSessionDeactivate) {
	    	NO_AUDIO_SESSION_DEACTIVATE_HANDLE.set(segment, 0L, noAudioSessionDeactivate);
	    	return this;
	    }
	    
	    public int noAudioSessionDeactivate() {
	    	return (int) NO_AUDIO_SESSION_DEACTIVATE_HANDLE.get(segment, 0L);
	    }
	    
	    @Override
	    public Coreaudio set(Coreaudio other) {
	        return set(other.segment);
	    }
	    
	    @Override
	    public Coreaudio set(MemorySegment src) {
	        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
	        return this;
	    }
	    
	    @Override
	    public MemorySegment memorySegment() {
	        return segment;
	    }
	    
	    public NativeStructArray<Coreaudio> asArray() {
	        return new NativeStructArray<>(this);
	    }
	    
	    public static NativeStructArray<Coreaudio> array(SegmentAllocator allocator, int count) {
	        return new NativeStructArray<>(
	            allocator,
	            LAYOUT,
	            segment -> new Coreaudio(segment),
	            count
	        );
	    }
	    
	    public static NativeStructArray<Coreaudio> array(SegmentAllocator allocator, Coreaudio... structs) {
	        NativeStructArray<Coreaudio> array = new NativeStructArray<>(
	            allocator,
	            LAYOUT,
	            segment -> new Coreaudio(segment),
	            structs.length
	        );
	    
	        for (int i = 0; i < structs.length; i++) {
	            array.set(i, structs[i]);
	        }
	    
	        return array;
	    }
	    
	    public static NativeStructArray<Coreaudio> array(MemorySegment array) {
	        return new NativeStructArray<>(
	            array,
	            LAYOUT,
	            segment -> new Coreaudio(segment)
	        );
	    }
	
	}
    
	public static class Jack implements Struct<Jack> {
	
		public static final StructLayout LAYOUT;
	
		public static final VarHandle P_CLIENT_NAME_HANDLE;
		public static final VarHandle TRY_START_SERVER_HANDLE;
	
		public static final long P_CLIENT_NAME_BYTE_OFFSET;
		public static final long TRY_START_SERVER_BYTE_OFFSET;
	
		private final MemorySegment segment;
	
		static {
			//@formatter:off
			LAYOUT = MemoryLayout.structLayout(
			    UNBOUNDED_ADDRESS.withName("pClientName"),
			    JAVA_INT.withName("tryStartServer"),
			    MemoryLayout.paddingLayout(4)
			).withName("Jack").withByteAlignment(8);
			
			P_CLIENT_NAME_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pClientName"));
			TRY_START_SERVER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("tryStartServer"));
			
			P_CLIENT_NAME_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pClientName"));
			TRY_START_SERVER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("tryStartServer"));
			//@formatter:on
		}
	
		public Jack() {
		    this(Arena.ofAuto());
		}
		
		public Jack(SegmentAllocator allocator) {
		    this(allocator.allocate(LAYOUT));
		}
		
		public Jack(MemorySegment segment) {
		    this.segment = segment;
		
		}
	
	    /// @see #pClientName()
	    public Jack pClientName(NativeByteArray pClientName) {
	    	P_CLIENT_NAME_HANDLE.set(segment, 0L, pClientName.memorySegment());
	    	return this;
	    }
	    
	    public @Nullable NativeByteArray pClientName() {
	    	MemorySegment segment = (MemorySegment) P_CLIENT_NAME_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return new NativeByteArray(segment);
	    }
	    
	    /// @see #tryStartServer()
	    public Jack tryStartServer(int tryStartServer) {
	    	TRY_START_SERVER_HANDLE.set(segment, 0L, tryStartServer);
	    	return this;
	    }
	    
	    public int tryStartServer() {
	    	return (int) TRY_START_SERVER_HANDLE.get(segment, 0L);
	    }
	    
	    @Override
	    public Jack set(Jack other) {
	        return set(other.segment);
	    }
	    
	    @Override
	    public Jack set(MemorySegment src) {
	        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
	        return this;
	    }
	    
	    @Override
	    public MemorySegment memorySegment() {
	        return segment;
	    }
	    
	    public NativeStructArray<Jack> asArray() {
	        return new NativeStructArray<>(this);
	    }
	    
	    public static NativeStructArray<Jack> array(SegmentAllocator allocator, int count) {
	        return new NativeStructArray<>(
	            allocator,
	            LAYOUT,
	            segment -> new Jack(segment),
	            count
	        );
	    }
	    
	    public static NativeStructArray<Jack> array(SegmentAllocator allocator, Jack... structs) {
	        NativeStructArray<Jack> array = new NativeStructArray<>(
	            allocator,
	            LAYOUT,
	            segment -> new Jack(segment),
	            structs.length
	        );
	    
	        for (int i = 0; i < structs.length; i++) {
	            array.set(i, structs[i]);
	        }
	    
	        return array;
	    }
	    
	    public static NativeStructArray<Jack> array(MemorySegment array) {
	        return new NativeStructArray<>(
	            array,
	            LAYOUT,
	            segment -> new Jack(segment)
	        );
	    }
	
	}
}