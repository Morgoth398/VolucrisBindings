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

public final class MaContext
		implements Struct<MaContext> {

	public static final StructLayout LAYOUT;

	public static final VarHandle BACKEND_HANDLE;
	public static final VarHandle P_LOG_HANDLE;
	public static final VarHandle THREAD_PRIORITY_HANDLE;
	public static final VarHandle THREAD_STACK_SIZE_HANDLE;
	public static final VarHandle P_USER_DATA_HANDLE;
	public static final VarHandle DEVICE_ENUM_LOCK_HANDLE;
	public static final VarHandle DEVICE_INFO_LOCK_HANDLE;
	public static final VarHandle DEVICE_INFO_CAPACITY_HANDLE;
	public static final VarHandle PLAYBACK_DEVICE_INFO_COUNT_HANDLE;
	public static final VarHandle CAPTURE_DEVICE_INFO_COUNT_HANDLE;
	public static final VarHandle P_DEVICE_INFOS_HANDLE;
	public static final VarHandle _UNUSED_HANDLE;

	public static final long CALLBACKS_BYTE_OFFSET;
	public static final long BACKEND_BYTE_OFFSET;
	public static final long P_LOG_BYTE_OFFSET;
	public static final long LOG_BYTE_OFFSET;
	public static final long THREAD_PRIORITY_BYTE_OFFSET;
	public static final long THREAD_STACK_SIZE_BYTE_OFFSET;
	public static final long P_USER_DATA_BYTE_OFFSET;
	public static final long ALLOCATION_CALLBACKS_BYTE_OFFSET;
	public static final long DEVICE_ENUM_LOCK_BYTE_OFFSET;
	public static final long DEVICE_INFO_LOCK_BYTE_OFFSET;
	public static final long DEVICE_INFO_CAPACITY_BYTE_OFFSET;
	public static final long PLAYBACK_DEVICE_INFO_COUNT_BYTE_OFFSET;
	public static final long CAPTURE_DEVICE_INFO_COUNT_BYTE_OFFSET;
	public static final long P_DEVICE_INFOS_BYTE_OFFSET;
	public static final long WASAPI_BYTE_OFFSET;
	public static final long DSOUND_BYTE_OFFSET;
	public static final long WINMM_BYTE_OFFSET;
	public static final long JACK_BYTE_OFFSET;
	public static final long NULL_BACKEND_BYTE_OFFSET;
	public static final long WIN32_BYTE_OFFSET;
	public static final long _UNUSED_BYTE_OFFSET;

	private final MemorySegment segment;

	private final MaBackendCallbacks callbacks;
	private final MaLog log;
	private final MaAllocationCallbacks allocationCallbacks;
	private final Wasapi wasapi;
	private final Dsound dsound;
	private final Winmm winmm;
	private final Jack jack;
	private final Null_backend null_backend;
	private final Win32 win32;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    MaBackendCallbacks.LAYOUT.withName("callbacks"),
		    JAVA_INT.withName("backend"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pLog"),
		    MaLog.LAYOUT.withName("log"),
		    JAVA_INT.withName("threadPriority"),
		    MemoryLayout.paddingLayout(4),
		    JAVA_LONG.withName("threadStackSize"),
		    UNBOUNDED_ADDRESS.withName("pUserData"),
		    MaAllocationCallbacks.LAYOUT.withName("allocationCallbacks"),
		    UNBOUNDED_ADDRESS.withName("deviceEnumLock"),
		    UNBOUNDED_ADDRESS.withName("deviceInfoLock"),
		    JAVA_INT.withName("deviceInfoCapacity"),
		    JAVA_INT.withName("playbackDeviceInfoCount"),
		    JAVA_INT.withName("captureDeviceInfoCount"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pDeviceInfos"),
		    MemoryLayout.unionLayout(
		        Wasapi.LAYOUT.withName("wasapi"),
		        Dsound.LAYOUT.withName("dsound"),
		        Winmm.LAYOUT.withName("winmm"),
		        Jack.LAYOUT.withName("jack"),
		        Null_backend.LAYOUT.withName("null_backend")
		    ).withName("$anon$7389:5").withByteAlignment(8),
		    MemoryLayout.unionLayout(
		        Win32.LAYOUT.withName("win32"),
		        JAVA_INT.withName("_unused")
		    ).withName("$anon$7745:5").withByteAlignment(8)
		).withName("ma_context").withByteAlignment(8);
		
		BACKEND_HANDLE = LAYOUT.varHandle(PathElement.groupElement("backend"));
		P_LOG_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pLog"));
		THREAD_PRIORITY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("threadPriority"));
		THREAD_STACK_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("threadStackSize"));
		P_USER_DATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pUserData"));
		DEVICE_ENUM_LOCK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("deviceEnumLock"));
		DEVICE_INFO_LOCK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("deviceInfoLock"));
		DEVICE_INFO_CAPACITY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("deviceInfoCapacity"));
		PLAYBACK_DEVICE_INFO_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("playbackDeviceInfoCount"));
		CAPTURE_DEVICE_INFO_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("captureDeviceInfoCount"));
		P_DEVICE_INFOS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pDeviceInfos"));
		_UNUSED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("$anon$7745:5"), PathElement.groupElement("_unused"));
		
		CALLBACKS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("callbacks"));
		BACKEND_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("backend"));
		P_LOG_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pLog"));
		LOG_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("log"));
		THREAD_PRIORITY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("threadPriority"));
		THREAD_STACK_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("threadStackSize"));
		P_USER_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pUserData"));
		ALLOCATION_CALLBACKS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("allocationCallbacks"));
		DEVICE_ENUM_LOCK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("deviceEnumLock"));
		DEVICE_INFO_LOCK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("deviceInfoLock"));
		DEVICE_INFO_CAPACITY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("deviceInfoCapacity"));
		PLAYBACK_DEVICE_INFO_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("playbackDeviceInfoCount"));
		CAPTURE_DEVICE_INFO_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("captureDeviceInfoCount"));
		P_DEVICE_INFOS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pDeviceInfos"));
		WASAPI_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("$anon$7389:5"), PathElement.groupElement("wasapi"));
		DSOUND_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("$anon$7389:5"), PathElement.groupElement("dsound"));
		WINMM_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("$anon$7389:5"), PathElement.groupElement("winmm"));
		JACK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("$anon$7389:5"), PathElement.groupElement("jack"));
		NULL_BACKEND_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("$anon$7389:5"), PathElement.groupElement("null_backend"));
		WIN32_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("$anon$7745:5"), PathElement.groupElement("win32"));
		_UNUSED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("$anon$7745:5"), PathElement.groupElement("_unused"));
		//@formatter:on
	}

	public MaContext() {
	    this(Arena.ofAuto());
	}
	
	public MaContext(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public MaContext(MemorySegment segment) {
	    this.segment = segment;
	
	    callbacks = new MaBackendCallbacks(segment.asSlice(CALLBACKS_BYTE_OFFSET, MaBackendCallbacks.LAYOUT));
	    log = new MaLog(segment.asSlice(LOG_BYTE_OFFSET, MaLog.LAYOUT));
	    allocationCallbacks = new MaAllocationCallbacks(segment.asSlice(ALLOCATION_CALLBACKS_BYTE_OFFSET, MaAllocationCallbacks.LAYOUT));
	    wasapi = new Wasapi(segment.asSlice(WASAPI_BYTE_OFFSET, Wasapi.LAYOUT));
	    dsound = new Dsound(segment.asSlice(DSOUND_BYTE_OFFSET, Dsound.LAYOUT));
	    winmm = new Winmm(segment.asSlice(WINMM_BYTE_OFFSET, Winmm.LAYOUT));
	    jack = new Jack(segment.asSlice(JACK_BYTE_OFFSET, Jack.LAYOUT));
	    null_backend = new Null_backend(segment.asSlice(NULL_BACKEND_BYTE_OFFSET, Null_backend.LAYOUT));
	    win32 = new Win32(segment.asSlice(WIN32_BYTE_OFFSET, Win32.LAYOUT));
	}

    /// @see #callbacks()
    public MaContext callbacks(Consumer<MaBackendCallbacks> consumer) {
    	consumer.accept(callbacks);
    	return this;
    }
    
    /// @see #callbacks()
    public MaContext callbacks(MaBackendCallbacks other) {
    	callbacks.set(other);
    	return this;
    }
    
    public MaBackendCallbacks callbacks() {
    	return callbacks;
    }
    
    /// @see #backend()
    public MaContext backend(int backend) {
    	BACKEND_HANDLE.set(segment, 0L, backend);
    	return this;
    }
    
    public int backend() {
    	return (int) BACKEND_HANDLE.get(segment, 0L);
    }
    
    /// @see #pLog()
    public MaContext pLog(MaLog pLog) {
    	P_LOG_HANDLE.set(segment, 0L, pLog.memorySegment());
    	return this;
    }
    
    public @Nullable MaLog pLog() {
    	MemorySegment segment = (MemorySegment) P_LOG_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaLog(segment);
    }
    
    /// @see #log()
    public MaContext log(Consumer<MaLog> consumer) {
    	consumer.accept(log);
    	return this;
    }
    
    /// @see #log()
    public MaContext log(MaLog other) {
    	log.set(other);
    	return this;
    }
    
    public MaLog log() {
    	return log;
    }
    
    /// @see #threadPriority()
    public MaContext threadPriority(int threadPriority) {
    	THREAD_PRIORITY_HANDLE.set(segment, 0L, threadPriority);
    	return this;
    }
    
    public int threadPriority() {
    	return (int) THREAD_PRIORITY_HANDLE.get(segment, 0L);
    }
    
    /// @see #threadStackSize()
    public MaContext threadStackSize(long threadStackSize) {
    	THREAD_STACK_SIZE_HANDLE.set(segment, 0L, threadStackSize);
    	return this;
    }
    
    public long threadStackSize() {
    	return (long) THREAD_STACK_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pUserData()
    public MaContext pUserData(MemorySegment pUserData) {
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
    public MaContext allocationCallbacks(Consumer<MaAllocationCallbacks> consumer) {
    	consumer.accept(allocationCallbacks);
    	return this;
    }
    
    /// @see #allocationCallbacks()
    public MaContext allocationCallbacks(MaAllocationCallbacks other) {
    	allocationCallbacks.set(other);
    	return this;
    }
    
    public MaAllocationCallbacks allocationCallbacks() {
    	return allocationCallbacks;
    }
    
    /// @see #deviceEnumLock()
    public MaContext deviceEnumLock(MemorySegment deviceEnumLock) {
    	DEVICE_ENUM_LOCK_HANDLE.set(segment, 0L, deviceEnumLock);
    	return this;
    }
    
    public @Nullable MemorySegment deviceEnumLock() {
    	MemorySegment segment = (MemorySegment) DEVICE_ENUM_LOCK_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #deviceInfoLock()
    public MaContext deviceInfoLock(MemorySegment deviceInfoLock) {
    	DEVICE_INFO_LOCK_HANDLE.set(segment, 0L, deviceInfoLock);
    	return this;
    }
    
    public @Nullable MemorySegment deviceInfoLock() {
    	MemorySegment segment = (MemorySegment) DEVICE_INFO_LOCK_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #deviceInfoCapacity()
    public MaContext deviceInfoCapacity(int deviceInfoCapacity) {
    	DEVICE_INFO_CAPACITY_HANDLE.set(segment, 0L, deviceInfoCapacity);
    	return this;
    }
    
    public int deviceInfoCapacity() {
    	return (int) DEVICE_INFO_CAPACITY_HANDLE.get(segment, 0L);
    }
    
    /// @see #playbackDeviceInfoCount()
    public MaContext playbackDeviceInfoCount(int playbackDeviceInfoCount) {
    	PLAYBACK_DEVICE_INFO_COUNT_HANDLE.set(segment, 0L, playbackDeviceInfoCount);
    	return this;
    }
    
    public int playbackDeviceInfoCount() {
    	return (int) PLAYBACK_DEVICE_INFO_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #captureDeviceInfoCount()
    public MaContext captureDeviceInfoCount(int captureDeviceInfoCount) {
    	CAPTURE_DEVICE_INFO_COUNT_HANDLE.set(segment, 0L, captureDeviceInfoCount);
    	return this;
    }
    
    public int captureDeviceInfoCount() {
    	return (int) CAPTURE_DEVICE_INFO_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pDeviceInfos()
    public MaContext pDeviceInfos(MaDeviceInfo pDeviceInfos) {
    	P_DEVICE_INFOS_HANDLE.set(segment, 0L, pDeviceInfos.memorySegment());
    	return this;
    }
    
    public @Nullable MaDeviceInfo pDeviceInfos() {
    	MemorySegment segment = (MemorySegment) P_DEVICE_INFOS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaDeviceInfo(segment);
    }
    
    /// @see #wasapi()
    public MaContext wasapi(Consumer<Wasapi> consumer) {
    	consumer.accept(wasapi);
    	return this;
    }
    
    /// @see #wasapi()
    public MaContext wasapi(Wasapi other) {
    	wasapi.set(other);
    	return this;
    }
    
    public Wasapi wasapi() {
    	return wasapi;
    }
    
    /// @see #dsound()
    public MaContext dsound(Consumer<Dsound> consumer) {
    	consumer.accept(dsound);
    	return this;
    }
    
    /// @see #dsound()
    public MaContext dsound(Dsound other) {
    	dsound.set(other);
    	return this;
    }
    
    public Dsound dsound() {
    	return dsound;
    }
    
    /// @see #winmm()
    public MaContext winmm(Consumer<Winmm> consumer) {
    	consumer.accept(winmm);
    	return this;
    }
    
    /// @see #winmm()
    public MaContext winmm(Winmm other) {
    	winmm.set(other);
    	return this;
    }
    
    public Winmm winmm() {
    	return winmm;
    }
    
    /// @see #jack()
    public MaContext jack(Consumer<Jack> consumer) {
    	consumer.accept(jack);
    	return this;
    }
    
    /// @see #jack()
    public MaContext jack(Jack other) {
    	jack.set(other);
    	return this;
    }
    
    public Jack jack() {
    	return jack;
    }
    
    /// @see #null_backend()
    public MaContext null_backend(Consumer<Null_backend> consumer) {
    	consumer.accept(null_backend);
    	return this;
    }
    
    /// @see #null_backend()
    public MaContext null_backend(Null_backend other) {
    	null_backend.set(other);
    	return this;
    }
    
    public Null_backend null_backend() {
    	return null_backend;
    }
    
    /// @see #win32()
    public MaContext win32(Consumer<Win32> consumer) {
    	consumer.accept(win32);
    	return this;
    }
    
    /// @see #win32()
    public MaContext win32(Win32 other) {
    	win32.set(other);
    	return this;
    }
    
    public Win32 win32() {
    	return win32;
    }
    
    /// @see #_unused()
    public MaContext _unused(int _unused) {
    	_UNUSED_HANDLE.set(segment, 0L, _unused);
    	return this;
    }
    
    public int _unused() {
    	return (int) _UNUSED_HANDLE.get(segment, 0L);
    }
    
    @Override
    public MaContext set(MaContext other) {
        return set(other.segment);
    }
    
    @Override
    public MaContext set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaContext> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaContext> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaContext(segment),
            count
        );
    }
    
    public static NativeStructArray<MaContext> array(SegmentAllocator allocator, MaContext... structs) {
        NativeStructArray<MaContext> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaContext(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaContext> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaContext(segment)
        );
    }

	public static class Wasapi implements Struct<Wasapi> {
	
		public static final StructLayout LAYOUT;
	
		public static final VarHandle COMMAND_THREAD_HANDLE;
		public static final VarHandle COMMAND_LOCK_HANDLE;
		public static final VarHandle COMMAND_SEM_HANDLE;
		public static final VarHandle COMMAND_INDEX_HANDLE;
		public static final VarHandle COMMAND_COUNT_HANDLE;
		public static final VarHandle H_AVRT_HANDLE;
		public static final VarHandle AV_SET_MM_THREAD_CHARACTERISTICS_A_HANDLE;
		public static final VarHandle AV_REVERT_MM_THREADCHARACTERISTICS_HANDLE;
		public static final VarHandle H_MMDEVAPI_HANDLE;
		public static final VarHandle ACTIVATE_AUDIO_INTERFACE_ASYNC_HANDLE;
	
		public static final long COMMAND_THREAD_BYTE_OFFSET;
		public static final long COMMAND_LOCK_BYTE_OFFSET;
		public static final long COMMAND_SEM_BYTE_OFFSET;
		public static final long COMMAND_INDEX_BYTE_OFFSET;
		public static final long COMMAND_COUNT_BYTE_OFFSET;
		public static final long COMMANDS_BYTE_OFFSET;
		public static final long H_AVRT_BYTE_OFFSET;
		public static final long AV_SET_MM_THREAD_CHARACTERISTICS_A_BYTE_OFFSET;
		public static final long AV_REVERT_MM_THREADCHARACTERISTICS_BYTE_OFFSET;
		public static final long H_MMDEVAPI_BYTE_OFFSET;
		public static final long ACTIVATE_AUDIO_INTERFACE_ASYNC_BYTE_OFFSET;
	
		private final MemorySegment segment;
	
		private final MaContextCommandWasapi[] commands;
	
		static {
			//@formatter:off
			LAYOUT = MemoryLayout.structLayout(
			    UNBOUNDED_ADDRESS.withName("commandThread"),
			    UNBOUNDED_ADDRESS.withName("commandLock"),
			    UNBOUNDED_ADDRESS.withName("commandSem"),
			    JAVA_INT.withName("commandIndex"),
			    JAVA_INT.withName("commandCount"),
			    MemoryLayout.sequenceLayout(4, MaContextCommandWasapi.LAYOUT).withName("commands"),
			    UNBOUNDED_ADDRESS.withName("hAvrt"),
			    UNBOUNDED_ADDRESS.withName("AvSetMmThreadCharacteristicsA"),
			    UNBOUNDED_ADDRESS.withName("AvRevertMmThreadcharacteristics"),
			    UNBOUNDED_ADDRESS.withName("hMMDevapi"),
			    UNBOUNDED_ADDRESS.withName("ActivateAudioInterfaceAsync")
			).withName("Wasapi").withByteAlignment(8);
			
			COMMAND_THREAD_HANDLE = LAYOUT.varHandle(PathElement.groupElement("commandThread"));
			COMMAND_LOCK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("commandLock"));
			COMMAND_SEM_HANDLE = LAYOUT.varHandle(PathElement.groupElement("commandSem"));
			COMMAND_INDEX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("commandIndex"));
			COMMAND_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("commandCount"));
			H_AVRT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("hAvrt"));
			AV_SET_MM_THREAD_CHARACTERISTICS_A_HANDLE = LAYOUT.varHandle(PathElement.groupElement("AvSetMmThreadCharacteristicsA"));
			AV_REVERT_MM_THREADCHARACTERISTICS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("AvRevertMmThreadcharacteristics"));
			H_MMDEVAPI_HANDLE = LAYOUT.varHandle(PathElement.groupElement("hMMDevapi"));
			ACTIVATE_AUDIO_INTERFACE_ASYNC_HANDLE = LAYOUT.varHandle(PathElement.groupElement("ActivateAudioInterfaceAsync"));
			
			COMMAND_THREAD_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("commandThread"));
			COMMAND_LOCK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("commandLock"));
			COMMAND_SEM_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("commandSem"));
			COMMAND_INDEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("commandIndex"));
			COMMAND_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("commandCount"));
			COMMANDS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("commands"));
			H_AVRT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("hAvrt"));
			AV_SET_MM_THREAD_CHARACTERISTICS_A_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("AvSetMmThreadCharacteristicsA"));
			AV_REVERT_MM_THREADCHARACTERISTICS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("AvRevertMmThreadcharacteristics"));
			H_MMDEVAPI_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("hMMDevapi"));
			ACTIVATE_AUDIO_INTERFACE_ASYNC_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("ActivateAudioInterfaceAsync"));
			//@formatter:on
		}
	
		public Wasapi() {
		    this(Arena.ofAuto());
		}
		
		public Wasapi(SegmentAllocator allocator) {
		    this(allocator.allocate(LAYOUT));
		}
		
		public Wasapi(MemorySegment segment) {
		    this.segment = segment;
		
		    commands = new MaContextCommandWasapi[4];
		    for (int i = 0; i < 4; i++) {
		        long offset = COMMANDS_BYTE_OFFSET + i * MaContextCommandWasapi.LAYOUT.byteSize();
		        commands[i] = new MaContextCommandWasapi(segment.asSlice(offset, MaContextCommandWasapi.LAYOUT));
		    }
		}
	
	    /// @see #commandThread()
	    public Wasapi commandThread(MemorySegment commandThread) {
	    	COMMAND_THREAD_HANDLE.set(segment, 0L, commandThread);
	    	return this;
	    }
	    
	    public @Nullable MemorySegment commandThread() {
	    	MemorySegment segment = (MemorySegment) COMMAND_THREAD_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return segment;
	    }
	    
	    /// @see #commandLock()
	    public Wasapi commandLock(MemorySegment commandLock) {
	    	COMMAND_LOCK_HANDLE.set(segment, 0L, commandLock);
	    	return this;
	    }
	    
	    public @Nullable MemorySegment commandLock() {
	    	MemorySegment segment = (MemorySegment) COMMAND_LOCK_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return segment;
	    }
	    
	    /// @see #commandSem()
	    public Wasapi commandSem(MemorySegment commandSem) {
	    	COMMAND_SEM_HANDLE.set(segment, 0L, commandSem);
	    	return this;
	    }
	    
	    public @Nullable MemorySegment commandSem() {
	    	MemorySegment segment = (MemorySegment) COMMAND_SEM_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return segment;
	    }
	    
	    /// @see #commandIndex()
	    public Wasapi commandIndex(int commandIndex) {
	    	COMMAND_INDEX_HANDLE.set(segment, 0L, commandIndex);
	    	return this;
	    }
	    
	    public int commandIndex() {
	    	return (int) COMMAND_INDEX_HANDLE.get(segment, 0L);
	    }
	    
	    /// @see #commandCount()
	    public Wasapi commandCount(int commandCount) {
	    	COMMAND_COUNT_HANDLE.set(segment, 0L, commandCount);
	    	return this;
	    }
	    
	    public int commandCount() {
	    	return (int) COMMAND_COUNT_HANDLE.get(segment, 0L);
	    }
	    
	    /// @see #commands(int)
	    public Wasapi commands(Consumer<MaContextCommandWasapi> consumer, int index) {
	    	consumer.accept(commands[index]);
	    	return this;
	    }
	    
	    /// @see #commands(int)
	    public Wasapi commands(MaContextCommandWasapi other, int index) {
	    	commands[index].set(other);
	    	return this;
	    }
	    
	    public MaContextCommandWasapi commands(int index) {
	    	return commands[index];
	    }
	    
	    /// @see #hAvrt()
	    public Wasapi hAvrt(MemorySegment hAvrt) {
	    	H_AVRT_HANDLE.set(segment, 0L, hAvrt);
	    	return this;
	    }
	    
	    public @Nullable MemorySegment hAvrt() {
	    	MemorySegment segment = (MemorySegment) H_AVRT_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return segment;
	    }
	    
	    /// @see #avSetMmThreadCharacteristicsA()
	    public Wasapi avSetMmThreadCharacteristicsA(MemorySegment avSetMmThreadCharacteristicsA) {
	    	AV_SET_MM_THREAD_CHARACTERISTICS_A_HANDLE.set(segment, 0L, avSetMmThreadCharacteristicsA);
	    	return this;
	    }
	    
	    public @Nullable MemorySegment avSetMmThreadCharacteristicsA() {
	    	MemorySegment segment = (MemorySegment) AV_SET_MM_THREAD_CHARACTERISTICS_A_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return segment;
	    }
	    
	    /// @see #avRevertMmThreadcharacteristics()
	    public Wasapi avRevertMmThreadcharacteristics(MemorySegment avRevertMmThreadcharacteristics) {
	    	AV_REVERT_MM_THREADCHARACTERISTICS_HANDLE.set(segment, 0L, avRevertMmThreadcharacteristics);
	    	return this;
	    }
	    
	    public @Nullable MemorySegment avRevertMmThreadcharacteristics() {
	    	MemorySegment segment = (MemorySegment) AV_REVERT_MM_THREADCHARACTERISTICS_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return segment;
	    }
	    
	    /// @see #hMMDevapi()
	    public Wasapi hMMDevapi(MemorySegment hMMDevapi) {
	    	H_MMDEVAPI_HANDLE.set(segment, 0L, hMMDevapi);
	    	return this;
	    }
	    
	    public @Nullable MemorySegment hMMDevapi() {
	    	MemorySegment segment = (MemorySegment) H_MMDEVAPI_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return segment;
	    }
	    
	    /// @see #activateAudioInterfaceAsync()
	    public Wasapi activateAudioInterfaceAsync(MemorySegment activateAudioInterfaceAsync) {
	    	ACTIVATE_AUDIO_INTERFACE_ASYNC_HANDLE.set(segment, 0L, activateAudioInterfaceAsync);
	    	return this;
	    }
	    
	    public @Nullable MemorySegment activateAudioInterfaceAsync() {
	    	MemorySegment segment = (MemorySegment) ACTIVATE_AUDIO_INTERFACE_ASYNC_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return segment;
	    }
	    
	    @Override
	    public Wasapi set(Wasapi other) {
	        return set(other.segment);
	    }
	    
	    @Override
	    public Wasapi set(MemorySegment src) {
	        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
	        return this;
	    }
	    
	    @Override
	    public MemorySegment memorySegment() {
	        return segment;
	    }
	    
	    public NativeStructArray<Wasapi> asArray() {
	        return new NativeStructArray<>(this);
	    }
	    
	    public static NativeStructArray<Wasapi> array(SegmentAllocator allocator, int count) {
	        return new NativeStructArray<>(
	            allocator,
	            LAYOUT,
	            segment -> new Wasapi(segment),
	            count
	        );
	    }
	    
	    public static NativeStructArray<Wasapi> array(SegmentAllocator allocator, Wasapi... structs) {
	        NativeStructArray<Wasapi> array = new NativeStructArray<>(
	            allocator,
	            LAYOUT,
	            segment -> new Wasapi(segment),
	            structs.length
	        );
	    
	        for (int i = 0; i < structs.length; i++) {
	            array.set(i, structs[i]);
	        }
	    
	        return array;
	    }
	    
	    public static NativeStructArray<Wasapi> array(MemorySegment array) {
	        return new NativeStructArray<>(
	            array,
	            LAYOUT,
	            segment -> new Wasapi(segment)
	        );
	    }
	
	}
    
	public static class Dsound implements Struct<Dsound> {
	
		public static final StructLayout LAYOUT;
	
		public static final VarHandle H_WND_HANDLE;
		public static final VarHandle H_DSOUND_DLL_HANDLE;
		public static final VarHandle DIRECT_SOUND_CREATE_HANDLE;
		public static final VarHandle DIRECT_SOUND_ENUMERATE_A_HANDLE;
		public static final VarHandle DIRECT_SOUND_CAPTURE_CREATE_HANDLE;
		public static final VarHandle DIRECT_SOUND_CAPTURE_ENUMERATE_A_HANDLE;
	
		public static final long H_WND_BYTE_OFFSET;
		public static final long H_DSOUND_DLL_BYTE_OFFSET;
		public static final long DIRECT_SOUND_CREATE_BYTE_OFFSET;
		public static final long DIRECT_SOUND_ENUMERATE_A_BYTE_OFFSET;
		public static final long DIRECT_SOUND_CAPTURE_CREATE_BYTE_OFFSET;
		public static final long DIRECT_SOUND_CAPTURE_ENUMERATE_A_BYTE_OFFSET;
	
		private final MemorySegment segment;
	
		static {
			//@formatter:off
			LAYOUT = MemoryLayout.structLayout(
			    UNBOUNDED_ADDRESS.withName("hWnd"),
			    UNBOUNDED_ADDRESS.withName("hDSoundDLL"),
			    UNBOUNDED_ADDRESS.withName("DirectSoundCreate"),
			    UNBOUNDED_ADDRESS.withName("DirectSoundEnumerateA"),
			    UNBOUNDED_ADDRESS.withName("DirectSoundCaptureCreate"),
			    UNBOUNDED_ADDRESS.withName("DirectSoundCaptureEnumerateA")
			).withName("Dsound").withByteAlignment(8);
			
			H_WND_HANDLE = LAYOUT.varHandle(PathElement.groupElement("hWnd"));
			H_DSOUND_DLL_HANDLE = LAYOUT.varHandle(PathElement.groupElement("hDSoundDLL"));
			DIRECT_SOUND_CREATE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("DirectSoundCreate"));
			DIRECT_SOUND_ENUMERATE_A_HANDLE = LAYOUT.varHandle(PathElement.groupElement("DirectSoundEnumerateA"));
			DIRECT_SOUND_CAPTURE_CREATE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("DirectSoundCaptureCreate"));
			DIRECT_SOUND_CAPTURE_ENUMERATE_A_HANDLE = LAYOUT.varHandle(PathElement.groupElement("DirectSoundCaptureEnumerateA"));
			
			H_WND_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("hWnd"));
			H_DSOUND_DLL_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("hDSoundDLL"));
			DIRECT_SOUND_CREATE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("DirectSoundCreate"));
			DIRECT_SOUND_ENUMERATE_A_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("DirectSoundEnumerateA"));
			DIRECT_SOUND_CAPTURE_CREATE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("DirectSoundCaptureCreate"));
			DIRECT_SOUND_CAPTURE_ENUMERATE_A_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("DirectSoundCaptureEnumerateA"));
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
	    
	    /// @see #hDSoundDLL()
	    public Dsound hDSoundDLL(MemorySegment hDSoundDLL) {
	    	H_DSOUND_DLL_HANDLE.set(segment, 0L, hDSoundDLL);
	    	return this;
	    }
	    
	    public @Nullable MemorySegment hDSoundDLL() {
	    	MemorySegment segment = (MemorySegment) H_DSOUND_DLL_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return segment;
	    }
	    
	    /// @see #directSoundCreate()
	    public Dsound directSoundCreate(MemorySegment directSoundCreate) {
	    	DIRECT_SOUND_CREATE_HANDLE.set(segment, 0L, directSoundCreate);
	    	return this;
	    }
	    
	    public @Nullable MemorySegment directSoundCreate() {
	    	MemorySegment segment = (MemorySegment) DIRECT_SOUND_CREATE_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return segment;
	    }
	    
	    /// @see #directSoundEnumerateA()
	    public Dsound directSoundEnumerateA(MemorySegment directSoundEnumerateA) {
	    	DIRECT_SOUND_ENUMERATE_A_HANDLE.set(segment, 0L, directSoundEnumerateA);
	    	return this;
	    }
	    
	    public @Nullable MemorySegment directSoundEnumerateA() {
	    	MemorySegment segment = (MemorySegment) DIRECT_SOUND_ENUMERATE_A_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return segment;
	    }
	    
	    /// @see #directSoundCaptureCreate()
	    public Dsound directSoundCaptureCreate(MemorySegment directSoundCaptureCreate) {
	    	DIRECT_SOUND_CAPTURE_CREATE_HANDLE.set(segment, 0L, directSoundCaptureCreate);
	    	return this;
	    }
	    
	    public @Nullable MemorySegment directSoundCaptureCreate() {
	    	MemorySegment segment = (MemorySegment) DIRECT_SOUND_CAPTURE_CREATE_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return segment;
	    }
	    
	    /// @see #directSoundCaptureEnumerateA()
	    public Dsound directSoundCaptureEnumerateA(MemorySegment directSoundCaptureEnumerateA) {
	    	DIRECT_SOUND_CAPTURE_ENUMERATE_A_HANDLE.set(segment, 0L, directSoundCaptureEnumerateA);
	    	return this;
	    }
	    
	    public @Nullable MemorySegment directSoundCaptureEnumerateA() {
	    	MemorySegment segment = (MemorySegment) DIRECT_SOUND_CAPTURE_ENUMERATE_A_HANDLE.get(this.segment, 0L);
	    
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
    
	public static class Winmm implements Struct<Winmm> {
	
		public static final StructLayout LAYOUT;
	
		public static final VarHandle H_WIN_MM_HANDLE;
		public static final VarHandle WAVE_OUT_GET_NUM_DEVS_HANDLE;
		public static final VarHandle WAVE_OUT_GET_DEV_CAPS_A_HANDLE;
		public static final VarHandle WAVE_OUT_OPEN_HANDLE;
		public static final VarHandle WAVE_OUT_CLOSE_HANDLE;
		public static final VarHandle WAVE_OUT_PREPARE_HEADER_HANDLE;
		public static final VarHandle WAVE_OUT_UNPREPARE_HEADER_HANDLE;
		public static final VarHandle WAVE_OUT_WRITE_HANDLE;
		public static final VarHandle WAVE_OUT_RESET_HANDLE;
		public static final VarHandle WAVE_IN_GET_NUM_DEVS_HANDLE;
		public static final VarHandle WAVE_IN_GET_DEV_CAPS_A_HANDLE;
		public static final VarHandle WAVE_IN_OPEN_HANDLE;
		public static final VarHandle WAVE_IN_CLOSE_HANDLE;
		public static final VarHandle WAVE_IN_PREPARE_HEADER_HANDLE;
		public static final VarHandle WAVE_IN_UNPREPARE_HEADER_HANDLE;
		public static final VarHandle WAVE_IN_ADD_BUFFER_HANDLE;
		public static final VarHandle WAVE_IN_START_HANDLE;
		public static final VarHandle WAVE_IN_RESET_HANDLE;
	
		public static final long H_WIN_MM_BYTE_OFFSET;
		public static final long WAVE_OUT_GET_NUM_DEVS_BYTE_OFFSET;
		public static final long WAVE_OUT_GET_DEV_CAPS_A_BYTE_OFFSET;
		public static final long WAVE_OUT_OPEN_BYTE_OFFSET;
		public static final long WAVE_OUT_CLOSE_BYTE_OFFSET;
		public static final long WAVE_OUT_PREPARE_HEADER_BYTE_OFFSET;
		public static final long WAVE_OUT_UNPREPARE_HEADER_BYTE_OFFSET;
		public static final long WAVE_OUT_WRITE_BYTE_OFFSET;
		public static final long WAVE_OUT_RESET_BYTE_OFFSET;
		public static final long WAVE_IN_GET_NUM_DEVS_BYTE_OFFSET;
		public static final long WAVE_IN_GET_DEV_CAPS_A_BYTE_OFFSET;
		public static final long WAVE_IN_OPEN_BYTE_OFFSET;
		public static final long WAVE_IN_CLOSE_BYTE_OFFSET;
		public static final long WAVE_IN_PREPARE_HEADER_BYTE_OFFSET;
		public static final long WAVE_IN_UNPREPARE_HEADER_BYTE_OFFSET;
		public static final long WAVE_IN_ADD_BUFFER_BYTE_OFFSET;
		public static final long WAVE_IN_START_BYTE_OFFSET;
		public static final long WAVE_IN_RESET_BYTE_OFFSET;
	
		private final MemorySegment segment;
	
		static {
			//@formatter:off
			LAYOUT = MemoryLayout.structLayout(
			    UNBOUNDED_ADDRESS.withName("hWinMM"),
			    UNBOUNDED_ADDRESS.withName("waveOutGetNumDevs"),
			    UNBOUNDED_ADDRESS.withName("waveOutGetDevCapsA"),
			    UNBOUNDED_ADDRESS.withName("waveOutOpen"),
			    UNBOUNDED_ADDRESS.withName("waveOutClose"),
			    UNBOUNDED_ADDRESS.withName("waveOutPrepareHeader"),
			    UNBOUNDED_ADDRESS.withName("waveOutUnprepareHeader"),
			    UNBOUNDED_ADDRESS.withName("waveOutWrite"),
			    UNBOUNDED_ADDRESS.withName("waveOutReset"),
			    UNBOUNDED_ADDRESS.withName("waveInGetNumDevs"),
			    UNBOUNDED_ADDRESS.withName("waveInGetDevCapsA"),
			    UNBOUNDED_ADDRESS.withName("waveInOpen"),
			    UNBOUNDED_ADDRESS.withName("waveInClose"),
			    UNBOUNDED_ADDRESS.withName("waveInPrepareHeader"),
			    UNBOUNDED_ADDRESS.withName("waveInUnprepareHeader"),
			    UNBOUNDED_ADDRESS.withName("waveInAddBuffer"),
			    UNBOUNDED_ADDRESS.withName("waveInStart"),
			    UNBOUNDED_ADDRESS.withName("waveInReset")
			).withName("Winmm").withByteAlignment(8);
			
			H_WIN_MM_HANDLE = LAYOUT.varHandle(PathElement.groupElement("hWinMM"));
			WAVE_OUT_GET_NUM_DEVS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("waveOutGetNumDevs"));
			WAVE_OUT_GET_DEV_CAPS_A_HANDLE = LAYOUT.varHandle(PathElement.groupElement("waveOutGetDevCapsA"));
			WAVE_OUT_OPEN_HANDLE = LAYOUT.varHandle(PathElement.groupElement("waveOutOpen"));
			WAVE_OUT_CLOSE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("waveOutClose"));
			WAVE_OUT_PREPARE_HEADER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("waveOutPrepareHeader"));
			WAVE_OUT_UNPREPARE_HEADER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("waveOutUnprepareHeader"));
			WAVE_OUT_WRITE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("waveOutWrite"));
			WAVE_OUT_RESET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("waveOutReset"));
			WAVE_IN_GET_NUM_DEVS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("waveInGetNumDevs"));
			WAVE_IN_GET_DEV_CAPS_A_HANDLE = LAYOUT.varHandle(PathElement.groupElement("waveInGetDevCapsA"));
			WAVE_IN_OPEN_HANDLE = LAYOUT.varHandle(PathElement.groupElement("waveInOpen"));
			WAVE_IN_CLOSE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("waveInClose"));
			WAVE_IN_PREPARE_HEADER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("waveInPrepareHeader"));
			WAVE_IN_UNPREPARE_HEADER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("waveInUnprepareHeader"));
			WAVE_IN_ADD_BUFFER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("waveInAddBuffer"));
			WAVE_IN_START_HANDLE = LAYOUT.varHandle(PathElement.groupElement("waveInStart"));
			WAVE_IN_RESET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("waveInReset"));
			
			H_WIN_MM_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("hWinMM"));
			WAVE_OUT_GET_NUM_DEVS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("waveOutGetNumDevs"));
			WAVE_OUT_GET_DEV_CAPS_A_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("waveOutGetDevCapsA"));
			WAVE_OUT_OPEN_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("waveOutOpen"));
			WAVE_OUT_CLOSE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("waveOutClose"));
			WAVE_OUT_PREPARE_HEADER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("waveOutPrepareHeader"));
			WAVE_OUT_UNPREPARE_HEADER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("waveOutUnprepareHeader"));
			WAVE_OUT_WRITE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("waveOutWrite"));
			WAVE_OUT_RESET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("waveOutReset"));
			WAVE_IN_GET_NUM_DEVS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("waveInGetNumDevs"));
			WAVE_IN_GET_DEV_CAPS_A_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("waveInGetDevCapsA"));
			WAVE_IN_OPEN_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("waveInOpen"));
			WAVE_IN_CLOSE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("waveInClose"));
			WAVE_IN_PREPARE_HEADER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("waveInPrepareHeader"));
			WAVE_IN_UNPREPARE_HEADER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("waveInUnprepareHeader"));
			WAVE_IN_ADD_BUFFER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("waveInAddBuffer"));
			WAVE_IN_START_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("waveInStart"));
			WAVE_IN_RESET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("waveInReset"));
			//@formatter:on
		}
	
		public Winmm() {
		    this(Arena.ofAuto());
		}
		
		public Winmm(SegmentAllocator allocator) {
		    this(allocator.allocate(LAYOUT));
		}
		
		public Winmm(MemorySegment segment) {
		    this.segment = segment;
		
		}
	
	    /// @see #hWinMM()
	    public Winmm hWinMM(MemorySegment hWinMM) {
	    	H_WIN_MM_HANDLE.set(segment, 0L, hWinMM);
	    	return this;
	    }
	    
	    public @Nullable MemorySegment hWinMM() {
	    	MemorySegment segment = (MemorySegment) H_WIN_MM_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return segment;
	    }
	    
	    /// @see #waveOutGetNumDevs()
	    public Winmm waveOutGetNumDevs(MemorySegment waveOutGetNumDevs) {
	    	WAVE_OUT_GET_NUM_DEVS_HANDLE.set(segment, 0L, waveOutGetNumDevs);
	    	return this;
	    }
	    
	    public @Nullable MemorySegment waveOutGetNumDevs() {
	    	MemorySegment segment = (MemorySegment) WAVE_OUT_GET_NUM_DEVS_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return segment;
	    }
	    
	    /// @see #waveOutGetDevCapsA()
	    public Winmm waveOutGetDevCapsA(MemorySegment waveOutGetDevCapsA) {
	    	WAVE_OUT_GET_DEV_CAPS_A_HANDLE.set(segment, 0L, waveOutGetDevCapsA);
	    	return this;
	    }
	    
	    public @Nullable MemorySegment waveOutGetDevCapsA() {
	    	MemorySegment segment = (MemorySegment) WAVE_OUT_GET_DEV_CAPS_A_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return segment;
	    }
	    
	    /// @see #waveOutOpen()
	    public Winmm waveOutOpen(MemorySegment waveOutOpen) {
	    	WAVE_OUT_OPEN_HANDLE.set(segment, 0L, waveOutOpen);
	    	return this;
	    }
	    
	    public @Nullable MemorySegment waveOutOpen() {
	    	MemorySegment segment = (MemorySegment) WAVE_OUT_OPEN_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return segment;
	    }
	    
	    /// @see #waveOutClose()
	    public Winmm waveOutClose(MemorySegment waveOutClose) {
	    	WAVE_OUT_CLOSE_HANDLE.set(segment, 0L, waveOutClose);
	    	return this;
	    }
	    
	    public @Nullable MemorySegment waveOutClose() {
	    	MemorySegment segment = (MemorySegment) WAVE_OUT_CLOSE_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return segment;
	    }
	    
	    /// @see #waveOutPrepareHeader()
	    public Winmm waveOutPrepareHeader(MemorySegment waveOutPrepareHeader) {
	    	WAVE_OUT_PREPARE_HEADER_HANDLE.set(segment, 0L, waveOutPrepareHeader);
	    	return this;
	    }
	    
	    public @Nullable MemorySegment waveOutPrepareHeader() {
	    	MemorySegment segment = (MemorySegment) WAVE_OUT_PREPARE_HEADER_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return segment;
	    }
	    
	    /// @see #waveOutUnprepareHeader()
	    public Winmm waveOutUnprepareHeader(MemorySegment waveOutUnprepareHeader) {
	    	WAVE_OUT_UNPREPARE_HEADER_HANDLE.set(segment, 0L, waveOutUnprepareHeader);
	    	return this;
	    }
	    
	    public @Nullable MemorySegment waveOutUnprepareHeader() {
	    	MemorySegment segment = (MemorySegment) WAVE_OUT_UNPREPARE_HEADER_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return segment;
	    }
	    
	    /// @see #waveOutWrite()
	    public Winmm waveOutWrite(MemorySegment waveOutWrite) {
	    	WAVE_OUT_WRITE_HANDLE.set(segment, 0L, waveOutWrite);
	    	return this;
	    }
	    
	    public @Nullable MemorySegment waveOutWrite() {
	    	MemorySegment segment = (MemorySegment) WAVE_OUT_WRITE_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return segment;
	    }
	    
	    /// @see #waveOutReset()
	    public Winmm waveOutReset(MemorySegment waveOutReset) {
	    	WAVE_OUT_RESET_HANDLE.set(segment, 0L, waveOutReset);
	    	return this;
	    }
	    
	    public @Nullable MemorySegment waveOutReset() {
	    	MemorySegment segment = (MemorySegment) WAVE_OUT_RESET_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return segment;
	    }
	    
	    /// @see #waveInGetNumDevs()
	    public Winmm waveInGetNumDevs(MemorySegment waveInGetNumDevs) {
	    	WAVE_IN_GET_NUM_DEVS_HANDLE.set(segment, 0L, waveInGetNumDevs);
	    	return this;
	    }
	    
	    public @Nullable MemorySegment waveInGetNumDevs() {
	    	MemorySegment segment = (MemorySegment) WAVE_IN_GET_NUM_DEVS_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return segment;
	    }
	    
	    /// @see #waveInGetDevCapsA()
	    public Winmm waveInGetDevCapsA(MemorySegment waveInGetDevCapsA) {
	    	WAVE_IN_GET_DEV_CAPS_A_HANDLE.set(segment, 0L, waveInGetDevCapsA);
	    	return this;
	    }
	    
	    public @Nullable MemorySegment waveInGetDevCapsA() {
	    	MemorySegment segment = (MemorySegment) WAVE_IN_GET_DEV_CAPS_A_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return segment;
	    }
	    
	    /// @see #waveInOpen()
	    public Winmm waveInOpen(MemorySegment waveInOpen) {
	    	WAVE_IN_OPEN_HANDLE.set(segment, 0L, waveInOpen);
	    	return this;
	    }
	    
	    public @Nullable MemorySegment waveInOpen() {
	    	MemorySegment segment = (MemorySegment) WAVE_IN_OPEN_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return segment;
	    }
	    
	    /// @see #waveInClose()
	    public Winmm waveInClose(MemorySegment waveInClose) {
	    	WAVE_IN_CLOSE_HANDLE.set(segment, 0L, waveInClose);
	    	return this;
	    }
	    
	    public @Nullable MemorySegment waveInClose() {
	    	MemorySegment segment = (MemorySegment) WAVE_IN_CLOSE_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return segment;
	    }
	    
	    /// @see #waveInPrepareHeader()
	    public Winmm waveInPrepareHeader(MemorySegment waveInPrepareHeader) {
	    	WAVE_IN_PREPARE_HEADER_HANDLE.set(segment, 0L, waveInPrepareHeader);
	    	return this;
	    }
	    
	    public @Nullable MemorySegment waveInPrepareHeader() {
	    	MemorySegment segment = (MemorySegment) WAVE_IN_PREPARE_HEADER_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return segment;
	    }
	    
	    /// @see #waveInUnprepareHeader()
	    public Winmm waveInUnprepareHeader(MemorySegment waveInUnprepareHeader) {
	    	WAVE_IN_UNPREPARE_HEADER_HANDLE.set(segment, 0L, waveInUnprepareHeader);
	    	return this;
	    }
	    
	    public @Nullable MemorySegment waveInUnprepareHeader() {
	    	MemorySegment segment = (MemorySegment) WAVE_IN_UNPREPARE_HEADER_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return segment;
	    }
	    
	    /// @see #waveInAddBuffer()
	    public Winmm waveInAddBuffer(MemorySegment waveInAddBuffer) {
	    	WAVE_IN_ADD_BUFFER_HANDLE.set(segment, 0L, waveInAddBuffer);
	    	return this;
	    }
	    
	    public @Nullable MemorySegment waveInAddBuffer() {
	    	MemorySegment segment = (MemorySegment) WAVE_IN_ADD_BUFFER_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return segment;
	    }
	    
	    /// @see #waveInStart()
	    public Winmm waveInStart(MemorySegment waveInStart) {
	    	WAVE_IN_START_HANDLE.set(segment, 0L, waveInStart);
	    	return this;
	    }
	    
	    public @Nullable MemorySegment waveInStart() {
	    	MemorySegment segment = (MemorySegment) WAVE_IN_START_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return segment;
	    }
	    
	    /// @see #waveInReset()
	    public Winmm waveInReset(MemorySegment waveInReset) {
	    	WAVE_IN_RESET_HANDLE.set(segment, 0L, waveInReset);
	    	return this;
	    }
	    
	    public @Nullable MemorySegment waveInReset() {
	    	MemorySegment segment = (MemorySegment) WAVE_IN_RESET_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return segment;
	    }
	    
	    @Override
	    public Winmm set(Winmm other) {
	        return set(other.segment);
	    }
	    
	    @Override
	    public Winmm set(MemorySegment src) {
	        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
	        return this;
	    }
	    
	    @Override
	    public MemorySegment memorySegment() {
	        return segment;
	    }
	    
	    public NativeStructArray<Winmm> asArray() {
	        return new NativeStructArray<>(this);
	    }
	    
	    public static NativeStructArray<Winmm> array(SegmentAllocator allocator, int count) {
	        return new NativeStructArray<>(
	            allocator,
	            LAYOUT,
	            segment -> new Winmm(segment),
	            count
	        );
	    }
	    
	    public static NativeStructArray<Winmm> array(SegmentAllocator allocator, Winmm... structs) {
	        NativeStructArray<Winmm> array = new NativeStructArray<>(
	            allocator,
	            LAYOUT,
	            segment -> new Winmm(segment),
	            structs.length
	        );
	    
	        for (int i = 0; i < structs.length; i++) {
	            array.set(i, structs[i]);
	        }
	    
	        return array;
	    }
	    
	    public static NativeStructArray<Winmm> array(MemorySegment array) {
	        return new NativeStructArray<>(
	            array,
	            LAYOUT,
	            segment -> new Winmm(segment)
	        );
	    }
	
	}
    
	public static class Jack implements Struct<Jack> {
	
		public static final StructLayout LAYOUT;
	
		public static final VarHandle JACK_SO_HANDLE;
		public static final VarHandle JACK_CLIENT_OPEN_HANDLE;
		public static final VarHandle JACK_CLIENT_CLOSE_HANDLE;
		public static final VarHandle JACK_CLIENT_NAME_SIZE_HANDLE;
		public static final VarHandle JACK_SET_PROCESS_CALLBACK_HANDLE;
		public static final VarHandle JACK_SET_BUFFER_SIZE_CALLBACK_HANDLE;
		public static final VarHandle JACK_ON_SHUTDOWN_HANDLE;
		public static final VarHandle JACK_GET_SAMPLE_RATE_HANDLE;
		public static final VarHandle JACK_GET_BUFFER_SIZE_HANDLE;
		public static final VarHandle JACK_GET_PORTS_HANDLE;
		public static final VarHandle JACK_ACTIVATE_HANDLE;
		public static final VarHandle JACK_DEACTIVATE_HANDLE;
		public static final VarHandle JACK_CONNECT_HANDLE;
		public static final VarHandle JACK_PORT_REGISTER_HANDLE;
		public static final VarHandle JACK_PORT_NAME_HANDLE;
		public static final VarHandle JACK_PORT_GET_BUFFER_HANDLE;
		public static final VarHandle JACK_FREE_HANDLE;
		public static final VarHandle P_CLIENT_NAME_HANDLE;
		public static final VarHandle TRY_START_SERVER_HANDLE;
	
		public static final long JACK_SO_BYTE_OFFSET;
		public static final long JACK_CLIENT_OPEN_BYTE_OFFSET;
		public static final long JACK_CLIENT_CLOSE_BYTE_OFFSET;
		public static final long JACK_CLIENT_NAME_SIZE_BYTE_OFFSET;
		public static final long JACK_SET_PROCESS_CALLBACK_BYTE_OFFSET;
		public static final long JACK_SET_BUFFER_SIZE_CALLBACK_BYTE_OFFSET;
		public static final long JACK_ON_SHUTDOWN_BYTE_OFFSET;
		public static final long JACK_GET_SAMPLE_RATE_BYTE_OFFSET;
		public static final long JACK_GET_BUFFER_SIZE_BYTE_OFFSET;
		public static final long JACK_GET_PORTS_BYTE_OFFSET;
		public static final long JACK_ACTIVATE_BYTE_OFFSET;
		public static final long JACK_DEACTIVATE_BYTE_OFFSET;
		public static final long JACK_CONNECT_BYTE_OFFSET;
		public static final long JACK_PORT_REGISTER_BYTE_OFFSET;
		public static final long JACK_PORT_NAME_BYTE_OFFSET;
		public static final long JACK_PORT_GET_BUFFER_BYTE_OFFSET;
		public static final long JACK_FREE_BYTE_OFFSET;
		public static final long P_CLIENT_NAME_BYTE_OFFSET;
		public static final long TRY_START_SERVER_BYTE_OFFSET;
	
		private final MemorySegment segment;
	
		static {
			//@formatter:off
			LAYOUT = MemoryLayout.structLayout(
			    UNBOUNDED_ADDRESS.withName("jackSO"),
			    UNBOUNDED_ADDRESS.withName("jack_client_open"),
			    UNBOUNDED_ADDRESS.withName("jack_client_close"),
			    UNBOUNDED_ADDRESS.withName("jack_client_name_size"),
			    UNBOUNDED_ADDRESS.withName("jack_set_process_callback"),
			    UNBOUNDED_ADDRESS.withName("jack_set_buffer_size_callback"),
			    UNBOUNDED_ADDRESS.withName("jack_on_shutdown"),
			    UNBOUNDED_ADDRESS.withName("jack_get_sample_rate"),
			    UNBOUNDED_ADDRESS.withName("jack_get_buffer_size"),
			    UNBOUNDED_ADDRESS.withName("jack_get_ports"),
			    UNBOUNDED_ADDRESS.withName("jack_activate"),
			    UNBOUNDED_ADDRESS.withName("jack_deactivate"),
			    UNBOUNDED_ADDRESS.withName("jack_connect"),
			    UNBOUNDED_ADDRESS.withName("jack_port_register"),
			    UNBOUNDED_ADDRESS.withName("jack_port_name"),
			    UNBOUNDED_ADDRESS.withName("jack_port_get_buffer"),
			    UNBOUNDED_ADDRESS.withName("jack_free"),
			    UNBOUNDED_ADDRESS.withName("pClientName"),
			    JAVA_INT.withName("tryStartServer"),
			    MemoryLayout.paddingLayout(4)
			).withName("Jack").withByteAlignment(8);
			
			JACK_SO_HANDLE = LAYOUT.varHandle(PathElement.groupElement("jackSO"));
			JACK_CLIENT_OPEN_HANDLE = LAYOUT.varHandle(PathElement.groupElement("jack_client_open"));
			JACK_CLIENT_CLOSE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("jack_client_close"));
			JACK_CLIENT_NAME_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("jack_client_name_size"));
			JACK_SET_PROCESS_CALLBACK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("jack_set_process_callback"));
			JACK_SET_BUFFER_SIZE_CALLBACK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("jack_set_buffer_size_callback"));
			JACK_ON_SHUTDOWN_HANDLE = LAYOUT.varHandle(PathElement.groupElement("jack_on_shutdown"));
			JACK_GET_SAMPLE_RATE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("jack_get_sample_rate"));
			JACK_GET_BUFFER_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("jack_get_buffer_size"));
			JACK_GET_PORTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("jack_get_ports"));
			JACK_ACTIVATE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("jack_activate"));
			JACK_DEACTIVATE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("jack_deactivate"));
			JACK_CONNECT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("jack_connect"));
			JACK_PORT_REGISTER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("jack_port_register"));
			JACK_PORT_NAME_HANDLE = LAYOUT.varHandle(PathElement.groupElement("jack_port_name"));
			JACK_PORT_GET_BUFFER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("jack_port_get_buffer"));
			JACK_FREE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("jack_free"));
			P_CLIENT_NAME_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pClientName"));
			TRY_START_SERVER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("tryStartServer"));
			
			JACK_SO_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("jackSO"));
			JACK_CLIENT_OPEN_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("jack_client_open"));
			JACK_CLIENT_CLOSE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("jack_client_close"));
			JACK_CLIENT_NAME_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("jack_client_name_size"));
			JACK_SET_PROCESS_CALLBACK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("jack_set_process_callback"));
			JACK_SET_BUFFER_SIZE_CALLBACK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("jack_set_buffer_size_callback"));
			JACK_ON_SHUTDOWN_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("jack_on_shutdown"));
			JACK_GET_SAMPLE_RATE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("jack_get_sample_rate"));
			JACK_GET_BUFFER_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("jack_get_buffer_size"));
			JACK_GET_PORTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("jack_get_ports"));
			JACK_ACTIVATE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("jack_activate"));
			JACK_DEACTIVATE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("jack_deactivate"));
			JACK_CONNECT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("jack_connect"));
			JACK_PORT_REGISTER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("jack_port_register"));
			JACK_PORT_NAME_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("jack_port_name"));
			JACK_PORT_GET_BUFFER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("jack_port_get_buffer"));
			JACK_FREE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("jack_free"));
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
	
	    /// @see #jackSO()
	    public Jack jackSO(MemorySegment jackSO) {
	    	JACK_SO_HANDLE.set(segment, 0L, jackSO);
	    	return this;
	    }
	    
	    public @Nullable MemorySegment jackSO() {
	    	MemorySegment segment = (MemorySegment) JACK_SO_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return segment;
	    }
	    
	    /// @see #jack_client_open()
	    public Jack jack_client_open(MemorySegment jack_client_open) {
	    	JACK_CLIENT_OPEN_HANDLE.set(segment, 0L, jack_client_open);
	    	return this;
	    }
	    
	    public @Nullable MemorySegment jack_client_open() {
	    	MemorySegment segment = (MemorySegment) JACK_CLIENT_OPEN_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return segment;
	    }
	    
	    /// @see #jack_client_close()
	    public Jack jack_client_close(MemorySegment jack_client_close) {
	    	JACK_CLIENT_CLOSE_HANDLE.set(segment, 0L, jack_client_close);
	    	return this;
	    }
	    
	    public @Nullable MemorySegment jack_client_close() {
	    	MemorySegment segment = (MemorySegment) JACK_CLIENT_CLOSE_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return segment;
	    }
	    
	    /// @see #jack_client_name_size()
	    public Jack jack_client_name_size(MemorySegment jack_client_name_size) {
	    	JACK_CLIENT_NAME_SIZE_HANDLE.set(segment, 0L, jack_client_name_size);
	    	return this;
	    }
	    
	    public @Nullable MemorySegment jack_client_name_size() {
	    	MemorySegment segment = (MemorySegment) JACK_CLIENT_NAME_SIZE_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return segment;
	    }
	    
	    /// @see #jack_set_process_callback()
	    public Jack jack_set_process_callback(MemorySegment jack_set_process_callback) {
	    	JACK_SET_PROCESS_CALLBACK_HANDLE.set(segment, 0L, jack_set_process_callback);
	    	return this;
	    }
	    
	    public @Nullable MemorySegment jack_set_process_callback() {
	    	MemorySegment segment = (MemorySegment) JACK_SET_PROCESS_CALLBACK_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return segment;
	    }
	    
	    /// @see #jack_set_buffer_size_callback()
	    public Jack jack_set_buffer_size_callback(MemorySegment jack_set_buffer_size_callback) {
	    	JACK_SET_BUFFER_SIZE_CALLBACK_HANDLE.set(segment, 0L, jack_set_buffer_size_callback);
	    	return this;
	    }
	    
	    public @Nullable MemorySegment jack_set_buffer_size_callback() {
	    	MemorySegment segment = (MemorySegment) JACK_SET_BUFFER_SIZE_CALLBACK_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return segment;
	    }
	    
	    /// @see #jack_on_shutdown()
	    public Jack jack_on_shutdown(MemorySegment jack_on_shutdown) {
	    	JACK_ON_SHUTDOWN_HANDLE.set(segment, 0L, jack_on_shutdown);
	    	return this;
	    }
	    
	    public @Nullable MemorySegment jack_on_shutdown() {
	    	MemorySegment segment = (MemorySegment) JACK_ON_SHUTDOWN_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return segment;
	    }
	    
	    /// @see #jack_get_sample_rate()
	    public Jack jack_get_sample_rate(MemorySegment jack_get_sample_rate) {
	    	JACK_GET_SAMPLE_RATE_HANDLE.set(segment, 0L, jack_get_sample_rate);
	    	return this;
	    }
	    
	    public @Nullable MemorySegment jack_get_sample_rate() {
	    	MemorySegment segment = (MemorySegment) JACK_GET_SAMPLE_RATE_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return segment;
	    }
	    
	    /// @see #jack_get_buffer_size()
	    public Jack jack_get_buffer_size(MemorySegment jack_get_buffer_size) {
	    	JACK_GET_BUFFER_SIZE_HANDLE.set(segment, 0L, jack_get_buffer_size);
	    	return this;
	    }
	    
	    public @Nullable MemorySegment jack_get_buffer_size() {
	    	MemorySegment segment = (MemorySegment) JACK_GET_BUFFER_SIZE_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return segment;
	    }
	    
	    /// @see #jack_get_ports()
	    public Jack jack_get_ports(MemorySegment jack_get_ports) {
	    	JACK_GET_PORTS_HANDLE.set(segment, 0L, jack_get_ports);
	    	return this;
	    }
	    
	    public @Nullable MemorySegment jack_get_ports() {
	    	MemorySegment segment = (MemorySegment) JACK_GET_PORTS_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return segment;
	    }
	    
	    /// @see #jack_activate()
	    public Jack jack_activate(MemorySegment jack_activate) {
	    	JACK_ACTIVATE_HANDLE.set(segment, 0L, jack_activate);
	    	return this;
	    }
	    
	    public @Nullable MemorySegment jack_activate() {
	    	MemorySegment segment = (MemorySegment) JACK_ACTIVATE_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return segment;
	    }
	    
	    /// @see #jack_deactivate()
	    public Jack jack_deactivate(MemorySegment jack_deactivate) {
	    	JACK_DEACTIVATE_HANDLE.set(segment, 0L, jack_deactivate);
	    	return this;
	    }
	    
	    public @Nullable MemorySegment jack_deactivate() {
	    	MemorySegment segment = (MemorySegment) JACK_DEACTIVATE_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return segment;
	    }
	    
	    /// @see #jack_connect()
	    public Jack jack_connect(MemorySegment jack_connect) {
	    	JACK_CONNECT_HANDLE.set(segment, 0L, jack_connect);
	    	return this;
	    }
	    
	    public @Nullable MemorySegment jack_connect() {
	    	MemorySegment segment = (MemorySegment) JACK_CONNECT_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return segment;
	    }
	    
	    /// @see #jack_port_register()
	    public Jack jack_port_register(MemorySegment jack_port_register) {
	    	JACK_PORT_REGISTER_HANDLE.set(segment, 0L, jack_port_register);
	    	return this;
	    }
	    
	    public @Nullable MemorySegment jack_port_register() {
	    	MemorySegment segment = (MemorySegment) JACK_PORT_REGISTER_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return segment;
	    }
	    
	    /// @see #jack_port_name()
	    public Jack jack_port_name(MemorySegment jack_port_name) {
	    	JACK_PORT_NAME_HANDLE.set(segment, 0L, jack_port_name);
	    	return this;
	    }
	    
	    public @Nullable MemorySegment jack_port_name() {
	    	MemorySegment segment = (MemorySegment) JACK_PORT_NAME_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return segment;
	    }
	    
	    /// @see #jack_port_get_buffer()
	    public Jack jack_port_get_buffer(MemorySegment jack_port_get_buffer) {
	    	JACK_PORT_GET_BUFFER_HANDLE.set(segment, 0L, jack_port_get_buffer);
	    	return this;
	    }
	    
	    public @Nullable MemorySegment jack_port_get_buffer() {
	    	MemorySegment segment = (MemorySegment) JACK_PORT_GET_BUFFER_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return segment;
	    }
	    
	    /// @see #jack_free()
	    public Jack jack_free(MemorySegment jack_free) {
	    	JACK_FREE_HANDLE.set(segment, 0L, jack_free);
	    	return this;
	    }
	    
	    public @Nullable MemorySegment jack_free() {
	    	MemorySegment segment = (MemorySegment) JACK_FREE_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return segment;
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
    
	public static class Null_backend implements Struct<Null_backend> {
	
		public static final StructLayout LAYOUT;
	
		public static final VarHandle _UNUSED_HANDLE;
	
		public static final long _UNUSED_BYTE_OFFSET;
	
		private final MemorySegment segment;
	
		static {
			//@formatter:off
			LAYOUT = MemoryLayout.structLayout(
			    JAVA_INT.withName("_unused")
			).withName("Null_backend").withByteAlignment(4);
			
			_UNUSED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("_unused"));
			
			_UNUSED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("_unused"));
			//@formatter:on
		}
	
		public Null_backend() {
		    this(Arena.ofAuto());
		}
		
		public Null_backend(SegmentAllocator allocator) {
		    this(allocator.allocate(LAYOUT));
		}
		
		public Null_backend(MemorySegment segment) {
		    this.segment = segment;
		
		}
	
	    /// @see #_unused()
	    public Null_backend _unused(int _unused) {
	    	_UNUSED_HANDLE.set(segment, 0L, _unused);
	    	return this;
	    }
	    
	    public int _unused() {
	    	return (int) _UNUSED_HANDLE.get(segment, 0L);
	    }
	    
	    @Override
	    public Null_backend set(Null_backend other) {
	        return set(other.segment);
	    }
	    
	    @Override
	    public Null_backend set(MemorySegment src) {
	        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
	        return this;
	    }
	    
	    @Override
	    public MemorySegment memorySegment() {
	        return segment;
	    }
	    
	    public NativeStructArray<Null_backend> asArray() {
	        return new NativeStructArray<>(this);
	    }
	    
	    public static NativeStructArray<Null_backend> array(SegmentAllocator allocator, int count) {
	        return new NativeStructArray<>(
	            allocator,
	            LAYOUT,
	            segment -> new Null_backend(segment),
	            count
	        );
	    }
	    
	    public static NativeStructArray<Null_backend> array(SegmentAllocator allocator, Null_backend... structs) {
	        NativeStructArray<Null_backend> array = new NativeStructArray<>(
	            allocator,
	            LAYOUT,
	            segment -> new Null_backend(segment),
	            structs.length
	        );
	    
	        for (int i = 0; i < structs.length; i++) {
	            array.set(i, structs[i]);
	        }
	    
	        return array;
	    }
	    
	    public static NativeStructArray<Null_backend> array(MemorySegment array) {
	        return new NativeStructArray<>(
	            array,
	            LAYOUT,
	            segment -> new Null_backend(segment)
	        );
	    }
	
	}
    
	public static class Win32 implements Struct<Win32> {
	
		public static final StructLayout LAYOUT;
	
		public static final VarHandle H_OLE32_DLL_HANDLE;
		public static final VarHandle CO_INITIALIZE_HANDLE;
		public static final VarHandle CO_INITIALIZE_EX_HANDLE;
		public static final VarHandle CO_UNINITIALIZE_HANDLE;
		public static final VarHandle CO_CREATE_INSTANCE_HANDLE;
		public static final VarHandle CO_TASK_MEM_FREE_HANDLE;
		public static final VarHandle PROP_VARIANT_CLEAR_HANDLE;
		public static final VarHandle STRING_FROM_GUID2_HANDLE;
		public static final VarHandle H_USER32_DLL_HANDLE;
		public static final VarHandle GET_FOREGROUND_WINDOW_HANDLE;
		public static final VarHandle GET_DESKTOP_WINDOW_HANDLE;
		public static final VarHandle H_ADVAPI32_DLL_HANDLE;
		public static final VarHandle REG_OPEN_KEY_EX_A_HANDLE;
		public static final VarHandle REG_CLOSE_KEY_HANDLE;
		public static final VarHandle REG_QUERY_VALUE_EX_A_HANDLE;
		public static final VarHandle CO_INITIALIZE_RESULT_HANDLE;
	
		public static final long H_OLE32_DLL_BYTE_OFFSET;
		public static final long CO_INITIALIZE_BYTE_OFFSET;
		public static final long CO_INITIALIZE_EX_BYTE_OFFSET;
		public static final long CO_UNINITIALIZE_BYTE_OFFSET;
		public static final long CO_CREATE_INSTANCE_BYTE_OFFSET;
		public static final long CO_TASK_MEM_FREE_BYTE_OFFSET;
		public static final long PROP_VARIANT_CLEAR_BYTE_OFFSET;
		public static final long STRING_FROM_GUID2_BYTE_OFFSET;
		public static final long H_USER32_DLL_BYTE_OFFSET;
		public static final long GET_FOREGROUND_WINDOW_BYTE_OFFSET;
		public static final long GET_DESKTOP_WINDOW_BYTE_OFFSET;
		public static final long H_ADVAPI32_DLL_BYTE_OFFSET;
		public static final long REG_OPEN_KEY_EX_A_BYTE_OFFSET;
		public static final long REG_CLOSE_KEY_BYTE_OFFSET;
		public static final long REG_QUERY_VALUE_EX_A_BYTE_OFFSET;
		public static final long CO_INITIALIZE_RESULT_BYTE_OFFSET;
	
		private final MemorySegment segment;
	
		static {
			//@formatter:off
			LAYOUT = MemoryLayout.structLayout(
			    UNBOUNDED_ADDRESS.withName("hOle32DLL"),
			    UNBOUNDED_ADDRESS.withName("CoInitialize"),
			    UNBOUNDED_ADDRESS.withName("CoInitializeEx"),
			    UNBOUNDED_ADDRESS.withName("CoUninitialize"),
			    UNBOUNDED_ADDRESS.withName("CoCreateInstance"),
			    UNBOUNDED_ADDRESS.withName("CoTaskMemFree"),
			    UNBOUNDED_ADDRESS.withName("PropVariantClear"),
			    UNBOUNDED_ADDRESS.withName("StringFromGUID2"),
			    UNBOUNDED_ADDRESS.withName("hUser32DLL"),
			    UNBOUNDED_ADDRESS.withName("GetForegroundWindow"),
			    UNBOUNDED_ADDRESS.withName("GetDesktopWindow"),
			    UNBOUNDED_ADDRESS.withName("hAdvapi32DLL"),
			    UNBOUNDED_ADDRESS.withName("RegOpenKeyExA"),
			    UNBOUNDED_ADDRESS.withName("RegCloseKey"),
			    UNBOUNDED_ADDRESS.withName("RegQueryValueExA"),
			    JAVA_INT.withName("CoInitializeResult"),
			    MemoryLayout.paddingLayout(4)
			).withName("Win32").withByteAlignment(8);
			
			H_OLE32_DLL_HANDLE = LAYOUT.varHandle(PathElement.groupElement("hOle32DLL"));
			CO_INITIALIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("CoInitialize"));
			CO_INITIALIZE_EX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("CoInitializeEx"));
			CO_UNINITIALIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("CoUninitialize"));
			CO_CREATE_INSTANCE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("CoCreateInstance"));
			CO_TASK_MEM_FREE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("CoTaskMemFree"));
			PROP_VARIANT_CLEAR_HANDLE = LAYOUT.varHandle(PathElement.groupElement("PropVariantClear"));
			STRING_FROM_GUID2_HANDLE = LAYOUT.varHandle(PathElement.groupElement("StringFromGUID2"));
			H_USER32_DLL_HANDLE = LAYOUT.varHandle(PathElement.groupElement("hUser32DLL"));
			GET_FOREGROUND_WINDOW_HANDLE = LAYOUT.varHandle(PathElement.groupElement("GetForegroundWindow"));
			GET_DESKTOP_WINDOW_HANDLE = LAYOUT.varHandle(PathElement.groupElement("GetDesktopWindow"));
			H_ADVAPI32_DLL_HANDLE = LAYOUT.varHandle(PathElement.groupElement("hAdvapi32DLL"));
			REG_OPEN_KEY_EX_A_HANDLE = LAYOUT.varHandle(PathElement.groupElement("RegOpenKeyExA"));
			REG_CLOSE_KEY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("RegCloseKey"));
			REG_QUERY_VALUE_EX_A_HANDLE = LAYOUT.varHandle(PathElement.groupElement("RegQueryValueExA"));
			CO_INITIALIZE_RESULT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("CoInitializeResult"));
			
			H_OLE32_DLL_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("hOle32DLL"));
			CO_INITIALIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("CoInitialize"));
			CO_INITIALIZE_EX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("CoInitializeEx"));
			CO_UNINITIALIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("CoUninitialize"));
			CO_CREATE_INSTANCE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("CoCreateInstance"));
			CO_TASK_MEM_FREE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("CoTaskMemFree"));
			PROP_VARIANT_CLEAR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("PropVariantClear"));
			STRING_FROM_GUID2_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("StringFromGUID2"));
			H_USER32_DLL_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("hUser32DLL"));
			GET_FOREGROUND_WINDOW_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("GetForegroundWindow"));
			GET_DESKTOP_WINDOW_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("GetDesktopWindow"));
			H_ADVAPI32_DLL_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("hAdvapi32DLL"));
			REG_OPEN_KEY_EX_A_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("RegOpenKeyExA"));
			REG_CLOSE_KEY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("RegCloseKey"));
			REG_QUERY_VALUE_EX_A_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("RegQueryValueExA"));
			CO_INITIALIZE_RESULT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("CoInitializeResult"));
			//@formatter:on
		}
	
		public Win32() {
		    this(Arena.ofAuto());
		}
		
		public Win32(SegmentAllocator allocator) {
		    this(allocator.allocate(LAYOUT));
		}
		
		public Win32(MemorySegment segment) {
		    this.segment = segment;
		
		}
	
	    /// @see #hOle32DLL()
	    public Win32 hOle32DLL(MemorySegment hOle32DLL) {
	    	H_OLE32_DLL_HANDLE.set(segment, 0L, hOle32DLL);
	    	return this;
	    }
	    
	    public @Nullable MemorySegment hOle32DLL() {
	    	MemorySegment segment = (MemorySegment) H_OLE32_DLL_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return segment;
	    }
	    
	    /// @see #coInitialize()
	    public Win32 coInitialize(MemorySegment coInitialize) {
	    	CO_INITIALIZE_HANDLE.set(segment, 0L, coInitialize);
	    	return this;
	    }
	    
	    public @Nullable MemorySegment coInitialize() {
	    	MemorySegment segment = (MemorySegment) CO_INITIALIZE_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return segment;
	    }
	    
	    /// @see #coInitializeEx()
	    public Win32 coInitializeEx(MemorySegment coInitializeEx) {
	    	CO_INITIALIZE_EX_HANDLE.set(segment, 0L, coInitializeEx);
	    	return this;
	    }
	    
	    public @Nullable MemorySegment coInitializeEx() {
	    	MemorySegment segment = (MemorySegment) CO_INITIALIZE_EX_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return segment;
	    }
	    
	    /// @see #coUninitialize()
	    public Win32 coUninitialize(MemorySegment coUninitialize) {
	    	CO_UNINITIALIZE_HANDLE.set(segment, 0L, coUninitialize);
	    	return this;
	    }
	    
	    public @Nullable MemorySegment coUninitialize() {
	    	MemorySegment segment = (MemorySegment) CO_UNINITIALIZE_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return segment;
	    }
	    
	    /// @see #coCreateInstance()
	    public Win32 coCreateInstance(MemorySegment coCreateInstance) {
	    	CO_CREATE_INSTANCE_HANDLE.set(segment, 0L, coCreateInstance);
	    	return this;
	    }
	    
	    public @Nullable MemorySegment coCreateInstance() {
	    	MemorySegment segment = (MemorySegment) CO_CREATE_INSTANCE_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return segment;
	    }
	    
	    /// @see #coTaskMemFree()
	    public Win32 coTaskMemFree(MemorySegment coTaskMemFree) {
	    	CO_TASK_MEM_FREE_HANDLE.set(segment, 0L, coTaskMemFree);
	    	return this;
	    }
	    
	    public @Nullable MemorySegment coTaskMemFree() {
	    	MemorySegment segment = (MemorySegment) CO_TASK_MEM_FREE_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return segment;
	    }
	    
	    /// @see #propVariantClear()
	    public Win32 propVariantClear(MemorySegment propVariantClear) {
	    	PROP_VARIANT_CLEAR_HANDLE.set(segment, 0L, propVariantClear);
	    	return this;
	    }
	    
	    public @Nullable MemorySegment propVariantClear() {
	    	MemorySegment segment = (MemorySegment) PROP_VARIANT_CLEAR_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return segment;
	    }
	    
	    /// @see #stringFromGUID2()
	    public Win32 stringFromGUID2(MemorySegment stringFromGUID2) {
	    	STRING_FROM_GUID2_HANDLE.set(segment, 0L, stringFromGUID2);
	    	return this;
	    }
	    
	    public @Nullable MemorySegment stringFromGUID2() {
	    	MemorySegment segment = (MemorySegment) STRING_FROM_GUID2_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return segment;
	    }
	    
	    /// @see #hUser32DLL()
	    public Win32 hUser32DLL(MemorySegment hUser32DLL) {
	    	H_USER32_DLL_HANDLE.set(segment, 0L, hUser32DLL);
	    	return this;
	    }
	    
	    public @Nullable MemorySegment hUser32DLL() {
	    	MemorySegment segment = (MemorySegment) H_USER32_DLL_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return segment;
	    }
	    
	    /// @see #getForegroundWindow()
	    public Win32 getForegroundWindow(MemorySegment getForegroundWindow) {
	    	GET_FOREGROUND_WINDOW_HANDLE.set(segment, 0L, getForegroundWindow);
	    	return this;
	    }
	    
	    public @Nullable MemorySegment getForegroundWindow() {
	    	MemorySegment segment = (MemorySegment) GET_FOREGROUND_WINDOW_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return segment;
	    }
	    
	    /// @see #getDesktopWindow()
	    public Win32 getDesktopWindow(MemorySegment getDesktopWindow) {
	    	GET_DESKTOP_WINDOW_HANDLE.set(segment, 0L, getDesktopWindow);
	    	return this;
	    }
	    
	    public @Nullable MemorySegment getDesktopWindow() {
	    	MemorySegment segment = (MemorySegment) GET_DESKTOP_WINDOW_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return segment;
	    }
	    
	    /// @see #hAdvapi32DLL()
	    public Win32 hAdvapi32DLL(MemorySegment hAdvapi32DLL) {
	    	H_ADVAPI32_DLL_HANDLE.set(segment, 0L, hAdvapi32DLL);
	    	return this;
	    }
	    
	    public @Nullable MemorySegment hAdvapi32DLL() {
	    	MemorySegment segment = (MemorySegment) H_ADVAPI32_DLL_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return segment;
	    }
	    
	    /// @see #regOpenKeyExA()
	    public Win32 regOpenKeyExA(MemorySegment regOpenKeyExA) {
	    	REG_OPEN_KEY_EX_A_HANDLE.set(segment, 0L, regOpenKeyExA);
	    	return this;
	    }
	    
	    public @Nullable MemorySegment regOpenKeyExA() {
	    	MemorySegment segment = (MemorySegment) REG_OPEN_KEY_EX_A_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return segment;
	    }
	    
	    /// @see #regCloseKey()
	    public Win32 regCloseKey(MemorySegment regCloseKey) {
	    	REG_CLOSE_KEY_HANDLE.set(segment, 0L, regCloseKey);
	    	return this;
	    }
	    
	    public @Nullable MemorySegment regCloseKey() {
	    	MemorySegment segment = (MemorySegment) REG_CLOSE_KEY_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return segment;
	    }
	    
	    /// @see #regQueryValueExA()
	    public Win32 regQueryValueExA(MemorySegment regQueryValueExA) {
	    	REG_QUERY_VALUE_EX_A_HANDLE.set(segment, 0L, regQueryValueExA);
	    	return this;
	    }
	    
	    public @Nullable MemorySegment regQueryValueExA() {
	    	MemorySegment segment = (MemorySegment) REG_QUERY_VALUE_EX_A_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return segment;
	    }
	    
	    /// @see #coInitializeResult()
	    public Win32 coInitializeResult(int coInitializeResult) {
	    	CO_INITIALIZE_RESULT_HANDLE.set(segment, 0L, coInitializeResult);
	    	return this;
	    }
	    
	    public int coInitializeResult() {
	    	return (int) CO_INITIALIZE_RESULT_HANDLE.get(segment, 0L);
	    }
	    
	    @Override
	    public Win32 set(Win32 other) {
	        return set(other.segment);
	    }
	    
	    @Override
	    public Win32 set(MemorySegment src) {
	        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
	        return this;
	    }
	    
	    @Override
	    public MemorySegment memorySegment() {
	        return segment;
	    }
	    
	    public NativeStructArray<Win32> asArray() {
	        return new NativeStructArray<>(this);
	    }
	    
	    public static NativeStructArray<Win32> array(SegmentAllocator allocator, int count) {
	        return new NativeStructArray<>(
	            allocator,
	            LAYOUT,
	            segment -> new Win32(segment),
	            count
	        );
	    }
	    
	    public static NativeStructArray<Win32> array(SegmentAllocator allocator, Win32... structs) {
	        NativeStructArray<Win32> array = new NativeStructArray<>(
	            allocator,
	            LAYOUT,
	            segment -> new Win32(segment),
	            structs.length
	        );
	    
	        for (int i = 0; i < structs.length; i++) {
	            array.set(i, structs[i]);
	        }
	    
	        return array;
	    }
	    
	    public static NativeStructArray<Win32> array(MemorySegment array) {
	        return new NativeStructArray<>(
	            array,
	            LAYOUT,
	            segment -> new Win32(segment)
	        );
	    }
	
	}
}