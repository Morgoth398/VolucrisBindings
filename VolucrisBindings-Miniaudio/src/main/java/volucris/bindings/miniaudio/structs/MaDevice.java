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
import volucris.bindings.core.NativeByteArray;
import volucris.bindings.core.NativeFloatArray;
import volucris.bindings.core.NativePointerArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.miniaudio.callbacks.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class MaDevice
		implements Struct<MaDevice> {

	public static final StructLayout LAYOUT;

	public static final VarHandle P_CONTEXT_HANDLE;
	public static final VarHandle TYPE_HANDLE;
	public static final VarHandle SAMPLE_RATE_HANDLE;
	public static final VarHandle ON_DATA_HANDLE;
	public static final VarHandle ON_NOTIFICATION_HANDLE;
	public static final VarHandle ON_STOP_HANDLE;
	public static final VarHandle P_USER_DATA_HANDLE;
	public static final VarHandle START_STOP_LOCK_HANDLE;
	public static final VarHandle WAKEUP_EVENT_HANDLE;
	public static final VarHandle START_EVENT_HANDLE;
	public static final VarHandle STOP_EVENT_HANDLE;
	public static final VarHandle THREAD_HANDLE;
	public static final VarHandle WORK_RESULT_HANDLE;
	public static final VarHandle IS_OWNER_OF_CONTEXT_HANDLE;
	public static final VarHandle NO_PRE_SILENCED_OUTPUT_BUFFER_HANDLE;
	public static final VarHandle NO_CLIP_HANDLE;
	public static final VarHandle NO_DISABLE_DENORMALS_HANDLE;
	public static final VarHandle NO_FIXED_SIZED_CALLBACK_HANDLE;

	public static final long P_CONTEXT_BYTE_OFFSET;
	public static final long TYPE_BYTE_OFFSET;
	public static final long SAMPLE_RATE_BYTE_OFFSET;
	public static final long STATE_BYTE_OFFSET;
	public static final long ON_DATA_BYTE_OFFSET;
	public static final long ON_NOTIFICATION_BYTE_OFFSET;
	public static final long ON_STOP_BYTE_OFFSET;
	public static final long P_USER_DATA_BYTE_OFFSET;
	public static final long START_STOP_LOCK_BYTE_OFFSET;
	public static final long WAKEUP_EVENT_BYTE_OFFSET;
	public static final long START_EVENT_BYTE_OFFSET;
	public static final long STOP_EVENT_BYTE_OFFSET;
	public static final long THREAD_BYTE_OFFSET;
	public static final long WORK_RESULT_BYTE_OFFSET;
	public static final long IS_OWNER_OF_CONTEXT_BYTE_OFFSET;
	public static final long NO_PRE_SILENCED_OUTPUT_BUFFER_BYTE_OFFSET;
	public static final long NO_CLIP_BYTE_OFFSET;
	public static final long NO_DISABLE_DENORMALS_BYTE_OFFSET;
	public static final long NO_FIXED_SIZED_CALLBACK_BYTE_OFFSET;
	public static final long MASTER_VOLUME_FACTOR_BYTE_OFFSET;
	public static final long DUPLEX_RB_BYTE_OFFSET;
	public static final long RESAMPLING_BYTE_OFFSET;
	public static final long PLAYBACK_BYTE_OFFSET;
	public static final long CAPTURE_BYTE_OFFSET;
	public static final long WASAPI_BYTE_OFFSET;
	public static final long DSOUND_BYTE_OFFSET;
	public static final long WINMM_BYTE_OFFSET;
	public static final long JACK_BYTE_OFFSET;
	public static final long NULL_DEVICE_BYTE_OFFSET;

	private final MemorySegment segment;

	private final MaAtomicDeviceState state;
	private final MaAtomicFloat masterVolumeFactor;
	private final MaDuplexRb duplexRB;
	private final Resampling resampling;
	private final Playback playback;
	private final Capture capture;
	private final Wasapi wasapi;
	private final Dsound dsound;
	private final Winmm winmm;
	private final Jack jack;
	private final Null_device null_device;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    UNBOUNDED_ADDRESS.withName("pContext"),
		    JAVA_INT.withName("type"),
		    JAVA_INT.withName("sampleRate"),
		    MaAtomicDeviceState.LAYOUT.withName("state"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("onData"),
		    UNBOUNDED_ADDRESS.withName("onNotification"),
		    UNBOUNDED_ADDRESS.withName("onStop"),
		    UNBOUNDED_ADDRESS.withName("pUserData"),
		    UNBOUNDED_ADDRESS.withName("startStopLock"),
		    UNBOUNDED_ADDRESS.withName("wakeupEvent"),
		    UNBOUNDED_ADDRESS.withName("startEvent"),
		    UNBOUNDED_ADDRESS.withName("stopEvent"),
		    UNBOUNDED_ADDRESS.withName("thread"),
		    JAVA_INT.withName("workResult"),
		    JAVA_BYTE.withName("isOwnerOfContext"),
		    JAVA_BYTE.withName("noPreSilencedOutputBuffer"),
		    JAVA_BYTE.withName("noClip"),
		    JAVA_BYTE.withName("noDisableDenormals"),
		    JAVA_BYTE.withName("noFixedSizedCallback"),
		    MemoryLayout.paddingLayout(3),
		    MaAtomicFloat.LAYOUT.withName("masterVolumeFactor"),
		    MaDuplexRb.LAYOUT.withName("duplexRB"),
		    Resampling.LAYOUT.withName("resampling"),
		    Playback.LAYOUT.withName("playback"),
		    Capture.LAYOUT.withName("capture"),
		    MemoryLayout.unionLayout(
		        Wasapi.LAYOUT.withName("wasapi"),
		        Dsound.LAYOUT.withName("dsound"),
		        Winmm.LAYOUT.withName("winmm"),
		        Jack.LAYOUT.withName("jack"),
		        Null_device.LAYOUT.withName("null_device")
		    ).withName("$anon$7863:5").withByteAlignment(8)
		).withName("ma_device").withByteAlignment(8);
		
		P_CONTEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pContext"));
		TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("type"));
		SAMPLE_RATE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sampleRate"));
		ON_DATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("onData"));
		ON_NOTIFICATION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("onNotification"));
		ON_STOP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("onStop"));
		P_USER_DATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pUserData"));
		START_STOP_LOCK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("startStopLock"));
		WAKEUP_EVENT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("wakeupEvent"));
		START_EVENT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("startEvent"));
		STOP_EVENT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("stopEvent"));
		THREAD_HANDLE = LAYOUT.varHandle(PathElement.groupElement("thread"));
		WORK_RESULT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("workResult"));
		IS_OWNER_OF_CONTEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("isOwnerOfContext"));
		NO_PRE_SILENCED_OUTPUT_BUFFER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("noPreSilencedOutputBuffer"));
		NO_CLIP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("noClip"));
		NO_DISABLE_DENORMALS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("noDisableDenormals"));
		NO_FIXED_SIZED_CALLBACK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("noFixedSizedCallback"));
		
		P_CONTEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pContext"));
		TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("type"));
		SAMPLE_RATE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sampleRate"));
		STATE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("state"));
		ON_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("onData"));
		ON_NOTIFICATION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("onNotification"));
		ON_STOP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("onStop"));
		P_USER_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pUserData"));
		START_STOP_LOCK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("startStopLock"));
		WAKEUP_EVENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("wakeupEvent"));
		START_EVENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("startEvent"));
		STOP_EVENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("stopEvent"));
		THREAD_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("thread"));
		WORK_RESULT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("workResult"));
		IS_OWNER_OF_CONTEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("isOwnerOfContext"));
		NO_PRE_SILENCED_OUTPUT_BUFFER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("noPreSilencedOutputBuffer"));
		NO_CLIP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("noClip"));
		NO_DISABLE_DENORMALS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("noDisableDenormals"));
		NO_FIXED_SIZED_CALLBACK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("noFixedSizedCallback"));
		MASTER_VOLUME_FACTOR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("masterVolumeFactor"));
		DUPLEX_RB_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("duplexRB"));
		RESAMPLING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("resampling"));
		PLAYBACK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("playback"));
		CAPTURE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("capture"));
		WASAPI_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("$anon$7863:5"), PathElement.groupElement("wasapi"));
		DSOUND_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("$anon$7863:5"), PathElement.groupElement("dsound"));
		WINMM_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("$anon$7863:5"), PathElement.groupElement("winmm"));
		JACK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("$anon$7863:5"), PathElement.groupElement("jack"));
		NULL_DEVICE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("$anon$7863:5"), PathElement.groupElement("null_device"));
		//@formatter:on
	}

	public MaDevice() {
	    this(Arena.ofAuto());
	}
	
	public MaDevice(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public MaDevice(MemorySegment segment) {
	    this.segment = segment;
	
	    state = new MaAtomicDeviceState(segment.asSlice(STATE_BYTE_OFFSET, MaAtomicDeviceState.LAYOUT));
	    masterVolumeFactor = new MaAtomicFloat(segment.asSlice(MASTER_VOLUME_FACTOR_BYTE_OFFSET, MaAtomicFloat.LAYOUT));
	    duplexRB = new MaDuplexRb(segment.asSlice(DUPLEX_RB_BYTE_OFFSET, MaDuplexRb.LAYOUT));
	    resampling = new Resampling(segment.asSlice(RESAMPLING_BYTE_OFFSET, Resampling.LAYOUT));
	    playback = new Playback(segment.asSlice(PLAYBACK_BYTE_OFFSET, Playback.LAYOUT));
	    capture = new Capture(segment.asSlice(CAPTURE_BYTE_OFFSET, Capture.LAYOUT));
	    wasapi = new Wasapi(segment.asSlice(WASAPI_BYTE_OFFSET, Wasapi.LAYOUT));
	    dsound = new Dsound(segment.asSlice(DSOUND_BYTE_OFFSET, Dsound.LAYOUT));
	    winmm = new Winmm(segment.asSlice(WINMM_BYTE_OFFSET, Winmm.LAYOUT));
	    jack = new Jack(segment.asSlice(JACK_BYTE_OFFSET, Jack.LAYOUT));
	    null_device = new Null_device(segment.asSlice(NULL_DEVICE_BYTE_OFFSET, Null_device.LAYOUT));
	}

    /// @see #pContext()
    public MaDevice pContext(MaContext pContext) {
    	P_CONTEXT_HANDLE.set(segment, 0L, pContext.memorySegment());
    	return this;
    }
    
    public @Nullable MaContext pContext() {
    	MemorySegment segment = (MemorySegment) P_CONTEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaContext(segment);
    }
    
    /// @see #type()
    public MaDevice type(int type) {
    	TYPE_HANDLE.set(segment, 0L, type);
    	return this;
    }
    
    public int type() {
    	return (int) TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #sampleRate()
    public MaDevice sampleRate(int sampleRate) {
    	SAMPLE_RATE_HANDLE.set(segment, 0L, sampleRate);
    	return this;
    }
    
    public int sampleRate() {
    	return (int) SAMPLE_RATE_HANDLE.get(segment, 0L);
    }
    
    /// @see #state()
    public MaDevice state(Consumer<MaAtomicDeviceState> consumer) {
    	consumer.accept(state);
    	return this;
    }
    
    /// @see #state()
    public MaDevice state(MaAtomicDeviceState other) {
    	state.set(other);
    	return this;
    }
    
    public MaAtomicDeviceState state() {
    	return state;
    }
    
    /// @see #onData()
    public MaDevice onData(MaDeviceDataProc onData) {
    	ON_DATA_HANDLE.set(segment, 0L, onData.memorySegment());
    	return this;
    }
    
    public @Nullable MaDeviceDataProc onData() {
    	MemorySegment segment = (MemorySegment) ON_DATA_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return MaDeviceDataProc.get(segment);
    }
    
    /// @see #onNotification()
    public MaDevice onNotification(MaDeviceNotificationProc onNotification) {
    	ON_NOTIFICATION_HANDLE.set(segment, 0L, onNotification.memorySegment());
    	return this;
    }
    
    public @Nullable MaDeviceNotificationProc onNotification() {
    	MemorySegment segment = (MemorySegment) ON_NOTIFICATION_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return MaDeviceNotificationProc.get(segment);
    }
    
    /// @see #onStop()
    public MaDevice onStop(MaStopProc onStop) {
    	ON_STOP_HANDLE.set(segment, 0L, onStop.memorySegment());
    	return this;
    }
    
    public @Nullable MaStopProc onStop() {
    	MemorySegment segment = (MemorySegment) ON_STOP_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return MaStopProc.get(segment);
    }
    
    /// @see #pUserData()
    public MaDevice pUserData(MemorySegment pUserData) {
    	P_USER_DATA_HANDLE.set(segment, 0L, pUserData);
    	return this;
    }
    
    public @Nullable MemorySegment pUserData() {
    	MemorySegment segment = (MemorySegment) P_USER_DATA_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #startStopLock()
    public MaDevice startStopLock(MemorySegment startStopLock) {
    	START_STOP_LOCK_HANDLE.set(segment, 0L, startStopLock);
    	return this;
    }
    
    public @Nullable MemorySegment startStopLock() {
    	MemorySegment segment = (MemorySegment) START_STOP_LOCK_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #wakeupEvent()
    public MaDevice wakeupEvent(MemorySegment wakeupEvent) {
    	WAKEUP_EVENT_HANDLE.set(segment, 0L, wakeupEvent);
    	return this;
    }
    
    public @Nullable MemorySegment wakeupEvent() {
    	MemorySegment segment = (MemorySegment) WAKEUP_EVENT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #startEvent()
    public MaDevice startEvent(MemorySegment startEvent) {
    	START_EVENT_HANDLE.set(segment, 0L, startEvent);
    	return this;
    }
    
    public @Nullable MemorySegment startEvent() {
    	MemorySegment segment = (MemorySegment) START_EVENT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #stopEvent()
    public MaDevice stopEvent(MemorySegment stopEvent) {
    	STOP_EVENT_HANDLE.set(segment, 0L, stopEvent);
    	return this;
    }
    
    public @Nullable MemorySegment stopEvent() {
    	MemorySegment segment = (MemorySegment) STOP_EVENT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #thread()
    public MaDevice thread(MemorySegment thread) {
    	THREAD_HANDLE.set(segment, 0L, thread);
    	return this;
    }
    
    public @Nullable MemorySegment thread() {
    	MemorySegment segment = (MemorySegment) THREAD_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #workResult()
    public MaDevice workResult(int workResult) {
    	WORK_RESULT_HANDLE.set(segment, 0L, workResult);
    	return this;
    }
    
    public int workResult() {
    	return (int) WORK_RESULT_HANDLE.get(segment, 0L);
    }
    
    /// @see #isOwnerOfContext()
    public MaDevice isOwnerOfContext(byte isOwnerOfContext) {
    	IS_OWNER_OF_CONTEXT_HANDLE.set(segment, 0L, isOwnerOfContext);
    	return this;
    }
    
    public byte isOwnerOfContext() {
    	return (byte) IS_OWNER_OF_CONTEXT_HANDLE.get(segment, 0L);
    }
    
    /// @see #noPreSilencedOutputBuffer()
    public MaDevice noPreSilencedOutputBuffer(byte noPreSilencedOutputBuffer) {
    	NO_PRE_SILENCED_OUTPUT_BUFFER_HANDLE.set(segment, 0L, noPreSilencedOutputBuffer);
    	return this;
    }
    
    public byte noPreSilencedOutputBuffer() {
    	return (byte) NO_PRE_SILENCED_OUTPUT_BUFFER_HANDLE.get(segment, 0L);
    }
    
    /// @see #noClip()
    public MaDevice noClip(byte noClip) {
    	NO_CLIP_HANDLE.set(segment, 0L, noClip);
    	return this;
    }
    
    public byte noClip() {
    	return (byte) NO_CLIP_HANDLE.get(segment, 0L);
    }
    
    /// @see #noDisableDenormals()
    public MaDevice noDisableDenormals(byte noDisableDenormals) {
    	NO_DISABLE_DENORMALS_HANDLE.set(segment, 0L, noDisableDenormals);
    	return this;
    }
    
    public byte noDisableDenormals() {
    	return (byte) NO_DISABLE_DENORMALS_HANDLE.get(segment, 0L);
    }
    
    /// @see #noFixedSizedCallback()
    public MaDevice noFixedSizedCallback(byte noFixedSizedCallback) {
    	NO_FIXED_SIZED_CALLBACK_HANDLE.set(segment, 0L, noFixedSizedCallback);
    	return this;
    }
    
    public byte noFixedSizedCallback() {
    	return (byte) NO_FIXED_SIZED_CALLBACK_HANDLE.get(segment, 0L);
    }
    
    /// @see #masterVolumeFactor()
    public MaDevice masterVolumeFactor(Consumer<MaAtomicFloat> consumer) {
    	consumer.accept(masterVolumeFactor);
    	return this;
    }
    
    /// @see #masterVolumeFactor()
    public MaDevice masterVolumeFactor(MaAtomicFloat other) {
    	masterVolumeFactor.set(other);
    	return this;
    }
    
    public MaAtomicFloat masterVolumeFactor() {
    	return masterVolumeFactor;
    }
    
    /// @see #duplexRB()
    public MaDevice duplexRB(Consumer<MaDuplexRb> consumer) {
    	consumer.accept(duplexRB);
    	return this;
    }
    
    /// @see #duplexRB()
    public MaDevice duplexRB(MaDuplexRb other) {
    	duplexRB.set(other);
    	return this;
    }
    
    public MaDuplexRb duplexRB() {
    	return duplexRB;
    }
    
    /// @see #resampling()
    public MaDevice resampling(Consumer<Resampling> consumer) {
    	consumer.accept(resampling);
    	return this;
    }
    
    /// @see #resampling()
    public MaDevice resampling(Resampling other) {
    	resampling.set(other);
    	return this;
    }
    
    public Resampling resampling() {
    	return resampling;
    }
    
    /// @see #playback()
    public MaDevice playback(Consumer<Playback> consumer) {
    	consumer.accept(playback);
    	return this;
    }
    
    /// @see #playback()
    public MaDevice playback(Playback other) {
    	playback.set(other);
    	return this;
    }
    
    public Playback playback() {
    	return playback;
    }
    
    /// @see #capture()
    public MaDevice capture(Consumer<Capture> consumer) {
    	consumer.accept(capture);
    	return this;
    }
    
    /// @see #capture()
    public MaDevice capture(Capture other) {
    	capture.set(other);
    	return this;
    }
    
    public Capture capture() {
    	return capture;
    }
    
    /// @see #wasapi()
    public MaDevice wasapi(Consumer<Wasapi> consumer) {
    	consumer.accept(wasapi);
    	return this;
    }
    
    /// @see #wasapi()
    public MaDevice wasapi(Wasapi other) {
    	wasapi.set(other);
    	return this;
    }
    
    public Wasapi wasapi() {
    	return wasapi;
    }
    
    /// @see #dsound()
    public MaDevice dsound(Consumer<Dsound> consumer) {
    	consumer.accept(dsound);
    	return this;
    }
    
    /// @see #dsound()
    public MaDevice dsound(Dsound other) {
    	dsound.set(other);
    	return this;
    }
    
    public Dsound dsound() {
    	return dsound;
    }
    
    /// @see #winmm()
    public MaDevice winmm(Consumer<Winmm> consumer) {
    	consumer.accept(winmm);
    	return this;
    }
    
    /// @see #winmm()
    public MaDevice winmm(Winmm other) {
    	winmm.set(other);
    	return this;
    }
    
    public Winmm winmm() {
    	return winmm;
    }
    
    /// @see #jack()
    public MaDevice jack(Consumer<Jack> consumer) {
    	consumer.accept(jack);
    	return this;
    }
    
    /// @see #jack()
    public MaDevice jack(Jack other) {
    	jack.set(other);
    	return this;
    }
    
    public Jack jack() {
    	return jack;
    }
    
    /// @see #null_device()
    public MaDevice null_device(Consumer<Null_device> consumer) {
    	consumer.accept(null_device);
    	return this;
    }
    
    /// @see #null_device()
    public MaDevice null_device(Null_device other) {
    	null_device.set(other);
    	return this;
    }
    
    public Null_device null_device() {
    	return null_device;
    }
    
    @Override
    public MaDevice set(MaDevice other) {
        return set(other.segment);
    }
    
    @Override
    public MaDevice set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaDevice> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaDevice> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaDevice(segment),
            count
        );
    }
    
    public static NativeStructArray<MaDevice> array(Arena arena, MaDevice... structs) {
        NativeStructArray<MaDevice> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaDevice(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaDevice> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaDevice(segment)
        );
    }

	public static class Resampling implements Struct<Resampling> {
	
		public static final StructLayout LAYOUT;
	
		public static final VarHandle ALGORITHM_HANDLE;
		public static final VarHandle P_BACKEND_VTABLE_HANDLE;
		public static final VarHandle P_BACKEND_USER_DATA_HANDLE;
	
		public static final long ALGORITHM_BYTE_OFFSET;
		public static final long P_BACKEND_VTABLE_BYTE_OFFSET;
		public static final long P_BACKEND_USER_DATA_BYTE_OFFSET;
		public static final long LINEAR_BYTE_OFFSET;
	
		private final MemorySegment segment;
	
		private final Linear linear;
	
		static {
			//@formatter:off
			LAYOUT = MemoryLayout.structLayout(
			    JAVA_INT.withName("algorithm"),
			    MemoryLayout.paddingLayout(4),
			    UNBOUNDED_ADDRESS.withName("pBackendVTable"),
			    UNBOUNDED_ADDRESS.withName("pBackendUserData"),
			    Linear.LAYOUT.withName("linear"),
			    MemoryLayout.paddingLayout(4)
			).withName("Resampling").withByteAlignment(8);
			
			ALGORITHM_HANDLE = LAYOUT.varHandle(PathElement.groupElement("algorithm"));
			P_BACKEND_VTABLE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pBackendVTable"));
			P_BACKEND_USER_DATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pBackendUserData"));
			
			ALGORITHM_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("algorithm"));
			P_BACKEND_VTABLE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pBackendVTable"));
			P_BACKEND_USER_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pBackendUserData"));
			LINEAR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("linear"));
			//@formatter:on
		}
	
		public Resampling() {
		    this(Arena.ofAuto());
		}
		
		public Resampling(Arena arena) {
		    this(arena.allocate(LAYOUT));
		}
		
		public Resampling(MemorySegment segment) {
		    this.segment = segment;
		
		    linear = new Linear(segment.asSlice(LINEAR_BYTE_OFFSET, Linear.LAYOUT));
		}
	
	    /// @see #algorithm()
	    public Resampling algorithm(int algorithm) {
	    	ALGORITHM_HANDLE.set(segment, 0L, algorithm);
	    	return this;
	    }
	    
	    public int algorithm() {
	    	return (int) ALGORITHM_HANDLE.get(segment, 0L);
	    }
	    
	    /// @see #pBackendVTable()
	    public Resampling pBackendVTable(MaResamplingBackendVtable pBackendVTable) {
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
	    public Resampling pBackendUserData(MemorySegment pBackendUserData) {
	    	P_BACKEND_USER_DATA_HANDLE.set(segment, 0L, pBackendUserData);
	    	return this;
	    }
	    
	    public @Nullable MemorySegment pBackendUserData() {
	    	MemorySegment segment = (MemorySegment) P_BACKEND_USER_DATA_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return segment;
	    }
	    
	    /// @see #linear()
	    public Resampling linear(Consumer<Linear> consumer) {
	    	consumer.accept(linear);
	    	return this;
	    }
	    
	    /// @see #linear()
	    public Resampling linear(Linear other) {
	    	linear.set(other);
	    	return this;
	    }
	    
	    public Linear linear() {
	    	return linear;
	    }
	    
	    @Override
	    public Resampling set(Resampling other) {
	        return set(other.segment);
	    }
	    
	    @Override
	    public Resampling set(MemorySegment src) {
	        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
	        return this;
	    }
	    
	    @Override
	    public MemorySegment memorySegment() {
	        return segment;
	    }
	    
	    public NativeStructArray<Resampling> asArray() {
	        return new NativeStructArray<>(this);
	    }
	    
	    public static NativeStructArray<Resampling> array(Arena arena, int count) {
	        return new NativeStructArray<>(
	            arena,
	            LAYOUT,
	            segment -> new Resampling(segment),
	            count
	        );
	    }
	    
	    public static NativeStructArray<Resampling> array(Arena arena, Resampling... structs) {
	        NativeStructArray<Resampling> array = new NativeStructArray<>(
	            arena,
	            LAYOUT,
	            segment -> new Resampling(segment),
	            structs.length
	        );
	    
	        for (int i = 0; i < structs.length; i++) {
	            array.set(i, structs[i]);
	        }
	    
	        return array;
	    }
	    
	    public static NativeStructArray<Resampling> array(MemorySegment array) {
	        return new NativeStructArray<>(
	            array,
	            LAYOUT,
	            segment -> new Resampling(segment)
	        );
	    }
	
		public static class Linear implements Struct<Linear> {
		
			public static final StructLayout LAYOUT;
		
			public static final VarHandle LPF_ORDER_HANDLE;
		
			public static final long LPF_ORDER_BYTE_OFFSET;
		
			private final MemorySegment segment;
		
			static {
				//@formatter:off
				LAYOUT = MemoryLayout.structLayout(
				    JAVA_INT.withName("lpfOrder")
				).withName("Linear").withByteAlignment(4);
				
				LPF_ORDER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("lpfOrder"));
				
				LPF_ORDER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("lpfOrder"));
				//@formatter:on
			}
		
			public Linear() {
			    this(Arena.ofAuto());
			}
			
			public Linear(Arena arena) {
			    this(arena.allocate(LAYOUT));
			}
			
			public Linear(MemorySegment segment) {
			    this.segment = segment;
			
			}
		
		    /// @see #lpfOrder()
		    public Linear lpfOrder(int lpfOrder) {
		    	LPF_ORDER_HANDLE.set(segment, 0L, lpfOrder);
		    	return this;
		    }
		    
		    public int lpfOrder() {
		    	return (int) LPF_ORDER_HANDLE.get(segment, 0L);
		    }
		    
		    @Override
		    public Linear set(Linear other) {
		        return set(other.segment);
		    }
		    
		    @Override
		    public Linear set(MemorySegment src) {
		        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
		        return this;
		    }
		    
		    @Override
		    public MemorySegment memorySegment() {
		        return segment;
		    }
		    
		    public NativeStructArray<Linear> asArray() {
		        return new NativeStructArray<>(this);
		    }
		    
		    public static NativeStructArray<Linear> array(Arena arena, int count) {
		        return new NativeStructArray<>(
		            arena,
		            LAYOUT,
		            segment -> new Linear(segment),
		            count
		        );
		    }
		    
		    public static NativeStructArray<Linear> array(Arena arena, Linear... structs) {
		        NativeStructArray<Linear> array = new NativeStructArray<>(
		            arena,
		            LAYOUT,
		            segment -> new Linear(segment),
		            structs.length
		        );
		    
		        for (int i = 0; i < structs.length; i++) {
		            array.set(i, structs[i]);
		        }
		    
		        return array;
		    }
		    
		    public static NativeStructArray<Linear> array(MemorySegment array) {
		        return new NativeStructArray<>(
		            array,
		            LAYOUT,
		            segment -> new Linear(segment)
		        );
		    }
		
		}
	}
    
	public static class Playback implements Struct<Playback> {
	
		public static final StructLayout LAYOUT;
	
		public static final VarHandle P_ID_HANDLE;
		public static final VarHandle NAME_HANDLE;
		public static final VarHandle SHARE_MODE_HANDLE;
		public static final VarHandle FORMAT_HANDLE;
		public static final VarHandle CHANNELS_HANDLE;
		public static final VarHandle CHANNEL_MAP_HANDLE;
		public static final VarHandle INTERNAL_FORMAT_HANDLE;
		public static final VarHandle INTERNAL_CHANNELS_HANDLE;
		public static final VarHandle INTERNAL_SAMPLE_RATE_HANDLE;
		public static final VarHandle INTERNAL_CHANNEL_MAP_HANDLE;
		public static final VarHandle INTERNAL_PERIOD_SIZE_IN_FRAMES_HANDLE;
		public static final VarHandle INTERNAL_PERIODS_HANDLE;
		public static final VarHandle CHANNEL_MIX_MODE_HANDLE;
		public static final VarHandle CALCULATE_LFEFROM_SPATIAL_CHANNELS_HANDLE;
		public static final VarHandle P_INTERMEDIARY_BUFFER_HANDLE;
		public static final VarHandle INTERMEDIARY_BUFFER_CAP_HANDLE;
		public static final VarHandle INTERMEDIARY_BUFFER_LEN_HANDLE;
		public static final VarHandle P_INPUT_CACHE_HANDLE;
		public static final VarHandle INPUT_CACHE_CAP_HANDLE;
		public static final VarHandle INPUT_CACHE_CONSUMED_HANDLE;
		public static final VarHandle INPUT_CACHE_REMAINING_HANDLE;
	
		public static final long P_ID_BYTE_OFFSET;
		public static final long ID_BYTE_OFFSET;
		public static final long NAME_BYTE_OFFSET;
		public static final long SHARE_MODE_BYTE_OFFSET;
		public static final long FORMAT_BYTE_OFFSET;
		public static final long CHANNELS_BYTE_OFFSET;
		public static final long CHANNEL_MAP_BYTE_OFFSET;
		public static final long INTERNAL_FORMAT_BYTE_OFFSET;
		public static final long INTERNAL_CHANNELS_BYTE_OFFSET;
		public static final long INTERNAL_SAMPLE_RATE_BYTE_OFFSET;
		public static final long INTERNAL_CHANNEL_MAP_BYTE_OFFSET;
		public static final long INTERNAL_PERIOD_SIZE_IN_FRAMES_BYTE_OFFSET;
		public static final long INTERNAL_PERIODS_BYTE_OFFSET;
		public static final long CHANNEL_MIX_MODE_BYTE_OFFSET;
		public static final long CALCULATE_LFEFROM_SPATIAL_CHANNELS_BYTE_OFFSET;
		public static final long CONVERTER_BYTE_OFFSET;
		public static final long P_INTERMEDIARY_BUFFER_BYTE_OFFSET;
		public static final long INTERMEDIARY_BUFFER_CAP_BYTE_OFFSET;
		public static final long INTERMEDIARY_BUFFER_LEN_BYTE_OFFSET;
		public static final long P_INPUT_CACHE_BYTE_OFFSET;
		public static final long INPUT_CACHE_CAP_BYTE_OFFSET;
		public static final long INPUT_CACHE_CONSUMED_BYTE_OFFSET;
		public static final long INPUT_CACHE_REMAINING_BYTE_OFFSET;
	
		private final MemorySegment segment;
	
		private final MaDeviceId id;
		private final MaDataConverter converter;
	
		static {
			//@formatter:off
			LAYOUT = MemoryLayout.structLayout(
			    UNBOUNDED_ADDRESS.withName("pID"),
			    MaDeviceId.LAYOUT.withName("id"),
			    MemoryLayout.sequenceLayout(256, JAVA_BYTE).withName("name"),
			    JAVA_INT.withName("shareMode"),
			    JAVA_INT.withName("format"),
			    JAVA_INT.withName("channels"),
			    MemoryLayout.sequenceLayout(254, JAVA_BYTE).withName("channelMap"),
			    MemoryLayout.paddingLayout(2),
			    JAVA_INT.withName("internalFormat"),
			    JAVA_INT.withName("internalChannels"),
			    JAVA_INT.withName("internalSampleRate"),
			    MemoryLayout.sequenceLayout(254, JAVA_BYTE).withName("internalChannelMap"),
			    MemoryLayout.paddingLayout(2),
			    JAVA_INT.withName("internalPeriodSizeInFrames"),
			    JAVA_INT.withName("internalPeriods"),
			    JAVA_INT.withName("channelMixMode"),
			    JAVA_INT.withName("calculateLFEFromSpatialChannels"),
			    MaDataConverter.LAYOUT.withName("converter"),
			    UNBOUNDED_ADDRESS.withName("pIntermediaryBuffer"),
			    JAVA_INT.withName("intermediaryBufferCap"),
			    JAVA_INT.withName("intermediaryBufferLen"),
			    UNBOUNDED_ADDRESS.withName("pInputCache"),
			    JAVA_LONG.withName("inputCacheCap"),
			    JAVA_LONG.withName("inputCacheConsumed"),
			    JAVA_LONG.withName("inputCacheRemaining")
			).withName("Playback").withByteAlignment(8);
			
			P_ID_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pID"));
			NAME_HANDLE = LAYOUT.varHandle(PathElement.groupElement("name"), PathElement.sequenceElement());
			SHARE_MODE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shareMode"));
			FORMAT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("format"));
			CHANNELS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("channels"));
			CHANNEL_MAP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("channelMap"), PathElement.sequenceElement());
			INTERNAL_FORMAT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("internalFormat"));
			INTERNAL_CHANNELS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("internalChannels"));
			INTERNAL_SAMPLE_RATE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("internalSampleRate"));
			INTERNAL_CHANNEL_MAP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("internalChannelMap"), PathElement.sequenceElement());
			INTERNAL_PERIOD_SIZE_IN_FRAMES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("internalPeriodSizeInFrames"));
			INTERNAL_PERIODS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("internalPeriods"));
			CHANNEL_MIX_MODE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("channelMixMode"));
			CALCULATE_LFEFROM_SPATIAL_CHANNELS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("calculateLFEFromSpatialChannels"));
			P_INTERMEDIARY_BUFFER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pIntermediaryBuffer"));
			INTERMEDIARY_BUFFER_CAP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("intermediaryBufferCap"));
			INTERMEDIARY_BUFFER_LEN_HANDLE = LAYOUT.varHandle(PathElement.groupElement("intermediaryBufferLen"));
			P_INPUT_CACHE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pInputCache"));
			INPUT_CACHE_CAP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("inputCacheCap"));
			INPUT_CACHE_CONSUMED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("inputCacheConsumed"));
			INPUT_CACHE_REMAINING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("inputCacheRemaining"));
			
			P_ID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pID"));
			ID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("id"));
			NAME_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("name"));
			SHARE_MODE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shareMode"));
			FORMAT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("format"));
			CHANNELS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("channels"));
			CHANNEL_MAP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("channelMap"));
			INTERNAL_FORMAT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("internalFormat"));
			INTERNAL_CHANNELS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("internalChannels"));
			INTERNAL_SAMPLE_RATE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("internalSampleRate"));
			INTERNAL_CHANNEL_MAP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("internalChannelMap"));
			INTERNAL_PERIOD_SIZE_IN_FRAMES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("internalPeriodSizeInFrames"));
			INTERNAL_PERIODS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("internalPeriods"));
			CHANNEL_MIX_MODE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("channelMixMode"));
			CALCULATE_LFEFROM_SPATIAL_CHANNELS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("calculateLFEFromSpatialChannels"));
			CONVERTER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("converter"));
			P_INTERMEDIARY_BUFFER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pIntermediaryBuffer"));
			INTERMEDIARY_BUFFER_CAP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("intermediaryBufferCap"));
			INTERMEDIARY_BUFFER_LEN_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("intermediaryBufferLen"));
			P_INPUT_CACHE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pInputCache"));
			INPUT_CACHE_CAP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("inputCacheCap"));
			INPUT_CACHE_CONSUMED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("inputCacheConsumed"));
			INPUT_CACHE_REMAINING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("inputCacheRemaining"));
			//@formatter:on
		}
	
		public Playback() {
		    this(Arena.ofAuto());
		}
		
		public Playback(Arena arena) {
		    this(arena.allocate(LAYOUT));
		}
		
		public Playback(MemorySegment segment) {
		    this.segment = segment;
		
		    id = new MaDeviceId(segment.asSlice(ID_BYTE_OFFSET, MaDeviceId.LAYOUT));
		    converter = new MaDataConverter(segment.asSlice(CONVERTER_BYTE_OFFSET, MaDataConverter.LAYOUT));
		}
	
	    /// @see #pID()
	    public Playback pID(MaDeviceId pID) {
	    	P_ID_HANDLE.set(segment, 0L, pID.memorySegment());
	    	return this;
	    }
	    
	    public @Nullable MaDeviceId pID() {
	    	MemorySegment segment = (MemorySegment) P_ID_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return new MaDeviceId(segment);
	    }
	    
	    /// @see #id()
	    public Playback id(Consumer<MaDeviceId> consumer) {
	    	consumer.accept(id);
	    	return this;
	    }
	    
	    /// @see #id()
	    public Playback id(MaDeviceId other) {
	    	id.set(other);
	    	return this;
	    }
	    
	    public MaDeviceId id() {
	    	return id;
	    }
	    
	    /// @see #name(int)
	    public Playback name(byte name, int index0) {
	    	NAME_HANDLE.set(segment, 0L, index0, name);
	    	return this;
	    }
	    
	    public byte name(int index0) {
	    	return (byte) NAME_HANDLE.get(segment, 0L, index0);
	    }
	    
	    /// @see #shareMode()
	    public Playback shareMode(int shareMode) {
	    	SHARE_MODE_HANDLE.set(segment, 0L, shareMode);
	    	return this;
	    }
	    
	    public int shareMode() {
	    	return (int) SHARE_MODE_HANDLE.get(segment, 0L);
	    }
	    
	    /// @see #format()
	    public Playback format(int format) {
	    	FORMAT_HANDLE.set(segment, 0L, format);
	    	return this;
	    }
	    
	    public int format() {
	    	return (int) FORMAT_HANDLE.get(segment, 0L);
	    }
	    
	    /// @see #channels()
	    public Playback channels(int channels) {
	    	CHANNELS_HANDLE.set(segment, 0L, channels);
	    	return this;
	    }
	    
	    public int channels() {
	    	return (int) CHANNELS_HANDLE.get(segment, 0L);
	    }
	    
	    /// @see #channelMap(int)
	    public Playback channelMap(byte channelMap, int index0) {
	    	CHANNEL_MAP_HANDLE.set(segment, 0L, index0, channelMap);
	    	return this;
	    }
	    
	    public byte channelMap(int index0) {
	    	return (byte) CHANNEL_MAP_HANDLE.get(segment, 0L, index0);
	    }
	    
	    /// @see #internalFormat()
	    public Playback internalFormat(int internalFormat) {
	    	INTERNAL_FORMAT_HANDLE.set(segment, 0L, internalFormat);
	    	return this;
	    }
	    
	    public int internalFormat() {
	    	return (int) INTERNAL_FORMAT_HANDLE.get(segment, 0L);
	    }
	    
	    /// @see #internalChannels()
	    public Playback internalChannels(int internalChannels) {
	    	INTERNAL_CHANNELS_HANDLE.set(segment, 0L, internalChannels);
	    	return this;
	    }
	    
	    public int internalChannels() {
	    	return (int) INTERNAL_CHANNELS_HANDLE.get(segment, 0L);
	    }
	    
	    /// @see #internalSampleRate()
	    public Playback internalSampleRate(int internalSampleRate) {
	    	INTERNAL_SAMPLE_RATE_HANDLE.set(segment, 0L, internalSampleRate);
	    	return this;
	    }
	    
	    public int internalSampleRate() {
	    	return (int) INTERNAL_SAMPLE_RATE_HANDLE.get(segment, 0L);
	    }
	    
	    /// @see #internalChannelMap(int)
	    public Playback internalChannelMap(byte internalChannelMap, int index0) {
	    	INTERNAL_CHANNEL_MAP_HANDLE.set(segment, 0L, index0, internalChannelMap);
	    	return this;
	    }
	    
	    public byte internalChannelMap(int index0) {
	    	return (byte) INTERNAL_CHANNEL_MAP_HANDLE.get(segment, 0L, index0);
	    }
	    
	    /// @see #internalPeriodSizeInFrames()
	    public Playback internalPeriodSizeInFrames(int internalPeriodSizeInFrames) {
	    	INTERNAL_PERIOD_SIZE_IN_FRAMES_HANDLE.set(segment, 0L, internalPeriodSizeInFrames);
	    	return this;
	    }
	    
	    public int internalPeriodSizeInFrames() {
	    	return (int) INTERNAL_PERIOD_SIZE_IN_FRAMES_HANDLE.get(segment, 0L);
	    }
	    
	    /// @see #internalPeriods()
	    public Playback internalPeriods(int internalPeriods) {
	    	INTERNAL_PERIODS_HANDLE.set(segment, 0L, internalPeriods);
	    	return this;
	    }
	    
	    public int internalPeriods() {
	    	return (int) INTERNAL_PERIODS_HANDLE.get(segment, 0L);
	    }
	    
	    /// @see #channelMixMode()
	    public Playback channelMixMode(int channelMixMode) {
	    	CHANNEL_MIX_MODE_HANDLE.set(segment, 0L, channelMixMode);
	    	return this;
	    }
	    
	    public int channelMixMode() {
	    	return (int) CHANNEL_MIX_MODE_HANDLE.get(segment, 0L);
	    }
	    
	    /// @see #calculateLFEFromSpatialChannels()
	    public Playback calculateLFEFromSpatialChannels(int calculateLFEFromSpatialChannels) {
	    	CALCULATE_LFEFROM_SPATIAL_CHANNELS_HANDLE.set(segment, 0L, calculateLFEFromSpatialChannels);
	    	return this;
	    }
	    
	    public int calculateLFEFromSpatialChannels() {
	    	return (int) CALCULATE_LFEFROM_SPATIAL_CHANNELS_HANDLE.get(segment, 0L);
	    }
	    
	    /// @see #converter()
	    public Playback converter(Consumer<MaDataConverter> consumer) {
	    	consumer.accept(converter);
	    	return this;
	    }
	    
	    /// @see #converter()
	    public Playback converter(MaDataConverter other) {
	    	converter.set(other);
	    	return this;
	    }
	    
	    public MaDataConverter converter() {
	    	return converter;
	    }
	    
	    /// @see #pIntermediaryBuffer()
	    public Playback pIntermediaryBuffer(MemorySegment pIntermediaryBuffer) {
	    	P_INTERMEDIARY_BUFFER_HANDLE.set(segment, 0L, pIntermediaryBuffer);
	    	return this;
	    }
	    
	    public @Nullable MemorySegment pIntermediaryBuffer() {
	    	MemorySegment segment = (MemorySegment) P_INTERMEDIARY_BUFFER_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return segment;
	    }
	    
	    /// @see #intermediaryBufferCap()
	    public Playback intermediaryBufferCap(int intermediaryBufferCap) {
	    	INTERMEDIARY_BUFFER_CAP_HANDLE.set(segment, 0L, intermediaryBufferCap);
	    	return this;
	    }
	    
	    public int intermediaryBufferCap() {
	    	return (int) INTERMEDIARY_BUFFER_CAP_HANDLE.get(segment, 0L);
	    }
	    
	    /// @see #intermediaryBufferLen()
	    public Playback intermediaryBufferLen(int intermediaryBufferLen) {
	    	INTERMEDIARY_BUFFER_LEN_HANDLE.set(segment, 0L, intermediaryBufferLen);
	    	return this;
	    }
	    
	    public int intermediaryBufferLen() {
	    	return (int) INTERMEDIARY_BUFFER_LEN_HANDLE.get(segment, 0L);
	    }
	    
	    /// @see #pInputCache()
	    public Playback pInputCache(MemorySegment pInputCache) {
	    	P_INPUT_CACHE_HANDLE.set(segment, 0L, pInputCache);
	    	return this;
	    }
	    
	    public @Nullable MemorySegment pInputCache() {
	    	MemorySegment segment = (MemorySegment) P_INPUT_CACHE_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return segment;
	    }
	    
	    /// @see #inputCacheCap()
	    public Playback inputCacheCap(long inputCacheCap) {
	    	INPUT_CACHE_CAP_HANDLE.set(segment, 0L, inputCacheCap);
	    	return this;
	    }
	    
	    public long inputCacheCap() {
	    	return (long) INPUT_CACHE_CAP_HANDLE.get(segment, 0L);
	    }
	    
	    /// @see #inputCacheConsumed()
	    public Playback inputCacheConsumed(long inputCacheConsumed) {
	    	INPUT_CACHE_CONSUMED_HANDLE.set(segment, 0L, inputCacheConsumed);
	    	return this;
	    }
	    
	    public long inputCacheConsumed() {
	    	return (long) INPUT_CACHE_CONSUMED_HANDLE.get(segment, 0L);
	    }
	    
	    /// @see #inputCacheRemaining()
	    public Playback inputCacheRemaining(long inputCacheRemaining) {
	    	INPUT_CACHE_REMAINING_HANDLE.set(segment, 0L, inputCacheRemaining);
	    	return this;
	    }
	    
	    public long inputCacheRemaining() {
	    	return (long) INPUT_CACHE_REMAINING_HANDLE.get(segment, 0L);
	    }
	    
	    @Override
	    public Playback set(Playback other) {
	        return set(other.segment);
	    }
	    
	    @Override
	    public Playback set(MemorySegment src) {
	        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
	        return this;
	    }
	    
	    @Override
	    public MemorySegment memorySegment() {
	        return segment;
	    }
	    
	    public NativeStructArray<Playback> asArray() {
	        return new NativeStructArray<>(this);
	    }
	    
	    public static NativeStructArray<Playback> array(Arena arena, int count) {
	        return new NativeStructArray<>(
	            arena,
	            LAYOUT,
	            segment -> new Playback(segment),
	            count
	        );
	    }
	    
	    public static NativeStructArray<Playback> array(Arena arena, Playback... structs) {
	        NativeStructArray<Playback> array = new NativeStructArray<>(
	            arena,
	            LAYOUT,
	            segment -> new Playback(segment),
	            structs.length
	        );
	    
	        for (int i = 0; i < structs.length; i++) {
	            array.set(i, structs[i]);
	        }
	    
	        return array;
	    }
	    
	    public static NativeStructArray<Playback> array(MemorySegment array) {
	        return new NativeStructArray<>(
	            array,
	            LAYOUT,
	            segment -> new Playback(segment)
	        );
	    }
	
	}
    
	public static class Capture implements Struct<Capture> {
	
		public static final StructLayout LAYOUT;
	
		public static final VarHandle P_ID_HANDLE;
		public static final VarHandle NAME_HANDLE;
		public static final VarHandle SHARE_MODE_HANDLE;
		public static final VarHandle FORMAT_HANDLE;
		public static final VarHandle CHANNELS_HANDLE;
		public static final VarHandle CHANNEL_MAP_HANDLE;
		public static final VarHandle INTERNAL_FORMAT_HANDLE;
		public static final VarHandle INTERNAL_CHANNELS_HANDLE;
		public static final VarHandle INTERNAL_SAMPLE_RATE_HANDLE;
		public static final VarHandle INTERNAL_CHANNEL_MAP_HANDLE;
		public static final VarHandle INTERNAL_PERIOD_SIZE_IN_FRAMES_HANDLE;
		public static final VarHandle INTERNAL_PERIODS_HANDLE;
		public static final VarHandle CHANNEL_MIX_MODE_HANDLE;
		public static final VarHandle CALCULATE_LFEFROM_SPATIAL_CHANNELS_HANDLE;
		public static final VarHandle P_INTERMEDIARY_BUFFER_HANDLE;
		public static final VarHandle INTERMEDIARY_BUFFER_CAP_HANDLE;
		public static final VarHandle INTERMEDIARY_BUFFER_LEN_HANDLE;
	
		public static final long P_ID_BYTE_OFFSET;
		public static final long ID_BYTE_OFFSET;
		public static final long NAME_BYTE_OFFSET;
		public static final long SHARE_MODE_BYTE_OFFSET;
		public static final long FORMAT_BYTE_OFFSET;
		public static final long CHANNELS_BYTE_OFFSET;
		public static final long CHANNEL_MAP_BYTE_OFFSET;
		public static final long INTERNAL_FORMAT_BYTE_OFFSET;
		public static final long INTERNAL_CHANNELS_BYTE_OFFSET;
		public static final long INTERNAL_SAMPLE_RATE_BYTE_OFFSET;
		public static final long INTERNAL_CHANNEL_MAP_BYTE_OFFSET;
		public static final long INTERNAL_PERIOD_SIZE_IN_FRAMES_BYTE_OFFSET;
		public static final long INTERNAL_PERIODS_BYTE_OFFSET;
		public static final long CHANNEL_MIX_MODE_BYTE_OFFSET;
		public static final long CALCULATE_LFEFROM_SPATIAL_CHANNELS_BYTE_OFFSET;
		public static final long CONVERTER_BYTE_OFFSET;
		public static final long P_INTERMEDIARY_BUFFER_BYTE_OFFSET;
		public static final long INTERMEDIARY_BUFFER_CAP_BYTE_OFFSET;
		public static final long INTERMEDIARY_BUFFER_LEN_BYTE_OFFSET;
	
		private final MemorySegment segment;
	
		private final MaDeviceId id;
		private final MaDataConverter converter;
	
		static {
			//@formatter:off
			LAYOUT = MemoryLayout.structLayout(
			    UNBOUNDED_ADDRESS.withName("pID"),
			    MaDeviceId.LAYOUT.withName("id"),
			    MemoryLayout.sequenceLayout(256, JAVA_BYTE).withName("name"),
			    JAVA_INT.withName("shareMode"),
			    JAVA_INT.withName("format"),
			    JAVA_INT.withName("channels"),
			    MemoryLayout.sequenceLayout(254, JAVA_BYTE).withName("channelMap"),
			    MemoryLayout.paddingLayout(2),
			    JAVA_INT.withName("internalFormat"),
			    JAVA_INT.withName("internalChannels"),
			    JAVA_INT.withName("internalSampleRate"),
			    MemoryLayout.sequenceLayout(254, JAVA_BYTE).withName("internalChannelMap"),
			    MemoryLayout.paddingLayout(2),
			    JAVA_INT.withName("internalPeriodSizeInFrames"),
			    JAVA_INT.withName("internalPeriods"),
			    JAVA_INT.withName("channelMixMode"),
			    JAVA_INT.withName("calculateLFEFromSpatialChannels"),
			    MaDataConverter.LAYOUT.withName("converter"),
			    UNBOUNDED_ADDRESS.withName("pIntermediaryBuffer"),
			    JAVA_INT.withName("intermediaryBufferCap"),
			    JAVA_INT.withName("intermediaryBufferLen")
			).withName("Capture").withByteAlignment(8);
			
			P_ID_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pID"));
			NAME_HANDLE = LAYOUT.varHandle(PathElement.groupElement("name"), PathElement.sequenceElement());
			SHARE_MODE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shareMode"));
			FORMAT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("format"));
			CHANNELS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("channels"));
			CHANNEL_MAP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("channelMap"), PathElement.sequenceElement());
			INTERNAL_FORMAT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("internalFormat"));
			INTERNAL_CHANNELS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("internalChannels"));
			INTERNAL_SAMPLE_RATE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("internalSampleRate"));
			INTERNAL_CHANNEL_MAP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("internalChannelMap"), PathElement.sequenceElement());
			INTERNAL_PERIOD_SIZE_IN_FRAMES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("internalPeriodSizeInFrames"));
			INTERNAL_PERIODS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("internalPeriods"));
			CHANNEL_MIX_MODE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("channelMixMode"));
			CALCULATE_LFEFROM_SPATIAL_CHANNELS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("calculateLFEFromSpatialChannels"));
			P_INTERMEDIARY_BUFFER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pIntermediaryBuffer"));
			INTERMEDIARY_BUFFER_CAP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("intermediaryBufferCap"));
			INTERMEDIARY_BUFFER_LEN_HANDLE = LAYOUT.varHandle(PathElement.groupElement("intermediaryBufferLen"));
			
			P_ID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pID"));
			ID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("id"));
			NAME_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("name"));
			SHARE_MODE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shareMode"));
			FORMAT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("format"));
			CHANNELS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("channels"));
			CHANNEL_MAP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("channelMap"));
			INTERNAL_FORMAT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("internalFormat"));
			INTERNAL_CHANNELS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("internalChannels"));
			INTERNAL_SAMPLE_RATE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("internalSampleRate"));
			INTERNAL_CHANNEL_MAP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("internalChannelMap"));
			INTERNAL_PERIOD_SIZE_IN_FRAMES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("internalPeriodSizeInFrames"));
			INTERNAL_PERIODS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("internalPeriods"));
			CHANNEL_MIX_MODE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("channelMixMode"));
			CALCULATE_LFEFROM_SPATIAL_CHANNELS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("calculateLFEFromSpatialChannels"));
			CONVERTER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("converter"));
			P_INTERMEDIARY_BUFFER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pIntermediaryBuffer"));
			INTERMEDIARY_BUFFER_CAP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("intermediaryBufferCap"));
			INTERMEDIARY_BUFFER_LEN_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("intermediaryBufferLen"));
			//@formatter:on
		}
	
		public Capture() {
		    this(Arena.ofAuto());
		}
		
		public Capture(Arena arena) {
		    this(arena.allocate(LAYOUT));
		}
		
		public Capture(MemorySegment segment) {
		    this.segment = segment;
		
		    id = new MaDeviceId(segment.asSlice(ID_BYTE_OFFSET, MaDeviceId.LAYOUT));
		    converter = new MaDataConverter(segment.asSlice(CONVERTER_BYTE_OFFSET, MaDataConverter.LAYOUT));
		}
	
	    /// @see #pID()
	    public Capture pID(MaDeviceId pID) {
	    	P_ID_HANDLE.set(segment, 0L, pID.memorySegment());
	    	return this;
	    }
	    
	    public @Nullable MaDeviceId pID() {
	    	MemorySegment segment = (MemorySegment) P_ID_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return new MaDeviceId(segment);
	    }
	    
	    /// @see #id()
	    public Capture id(Consumer<MaDeviceId> consumer) {
	    	consumer.accept(id);
	    	return this;
	    }
	    
	    /// @see #id()
	    public Capture id(MaDeviceId other) {
	    	id.set(other);
	    	return this;
	    }
	    
	    public MaDeviceId id() {
	    	return id;
	    }
	    
	    /// @see #name(int)
	    public Capture name(byte name, int index0) {
	    	NAME_HANDLE.set(segment, 0L, index0, name);
	    	return this;
	    }
	    
	    public byte name(int index0) {
	    	return (byte) NAME_HANDLE.get(segment, 0L, index0);
	    }
	    
	    /// @see #shareMode()
	    public Capture shareMode(int shareMode) {
	    	SHARE_MODE_HANDLE.set(segment, 0L, shareMode);
	    	return this;
	    }
	    
	    public int shareMode() {
	    	return (int) SHARE_MODE_HANDLE.get(segment, 0L);
	    }
	    
	    /// @see #format()
	    public Capture format(int format) {
	    	FORMAT_HANDLE.set(segment, 0L, format);
	    	return this;
	    }
	    
	    public int format() {
	    	return (int) FORMAT_HANDLE.get(segment, 0L);
	    }
	    
	    /// @see #channels()
	    public Capture channels(int channels) {
	    	CHANNELS_HANDLE.set(segment, 0L, channels);
	    	return this;
	    }
	    
	    public int channels() {
	    	return (int) CHANNELS_HANDLE.get(segment, 0L);
	    }
	    
	    /// @see #channelMap(int)
	    public Capture channelMap(byte channelMap, int index0) {
	    	CHANNEL_MAP_HANDLE.set(segment, 0L, index0, channelMap);
	    	return this;
	    }
	    
	    public byte channelMap(int index0) {
	    	return (byte) CHANNEL_MAP_HANDLE.get(segment, 0L, index0);
	    }
	    
	    /// @see #internalFormat()
	    public Capture internalFormat(int internalFormat) {
	    	INTERNAL_FORMAT_HANDLE.set(segment, 0L, internalFormat);
	    	return this;
	    }
	    
	    public int internalFormat() {
	    	return (int) INTERNAL_FORMAT_HANDLE.get(segment, 0L);
	    }
	    
	    /// @see #internalChannels()
	    public Capture internalChannels(int internalChannels) {
	    	INTERNAL_CHANNELS_HANDLE.set(segment, 0L, internalChannels);
	    	return this;
	    }
	    
	    public int internalChannels() {
	    	return (int) INTERNAL_CHANNELS_HANDLE.get(segment, 0L);
	    }
	    
	    /// @see #internalSampleRate()
	    public Capture internalSampleRate(int internalSampleRate) {
	    	INTERNAL_SAMPLE_RATE_HANDLE.set(segment, 0L, internalSampleRate);
	    	return this;
	    }
	    
	    public int internalSampleRate() {
	    	return (int) INTERNAL_SAMPLE_RATE_HANDLE.get(segment, 0L);
	    }
	    
	    /// @see #internalChannelMap(int)
	    public Capture internalChannelMap(byte internalChannelMap, int index0) {
	    	INTERNAL_CHANNEL_MAP_HANDLE.set(segment, 0L, index0, internalChannelMap);
	    	return this;
	    }
	    
	    public byte internalChannelMap(int index0) {
	    	return (byte) INTERNAL_CHANNEL_MAP_HANDLE.get(segment, 0L, index0);
	    }
	    
	    /// @see #internalPeriodSizeInFrames()
	    public Capture internalPeriodSizeInFrames(int internalPeriodSizeInFrames) {
	    	INTERNAL_PERIOD_SIZE_IN_FRAMES_HANDLE.set(segment, 0L, internalPeriodSizeInFrames);
	    	return this;
	    }
	    
	    public int internalPeriodSizeInFrames() {
	    	return (int) INTERNAL_PERIOD_SIZE_IN_FRAMES_HANDLE.get(segment, 0L);
	    }
	    
	    /// @see #internalPeriods()
	    public Capture internalPeriods(int internalPeriods) {
	    	INTERNAL_PERIODS_HANDLE.set(segment, 0L, internalPeriods);
	    	return this;
	    }
	    
	    public int internalPeriods() {
	    	return (int) INTERNAL_PERIODS_HANDLE.get(segment, 0L);
	    }
	    
	    /// @see #channelMixMode()
	    public Capture channelMixMode(int channelMixMode) {
	    	CHANNEL_MIX_MODE_HANDLE.set(segment, 0L, channelMixMode);
	    	return this;
	    }
	    
	    public int channelMixMode() {
	    	return (int) CHANNEL_MIX_MODE_HANDLE.get(segment, 0L);
	    }
	    
	    /// @see #calculateLFEFromSpatialChannels()
	    public Capture calculateLFEFromSpatialChannels(int calculateLFEFromSpatialChannels) {
	    	CALCULATE_LFEFROM_SPATIAL_CHANNELS_HANDLE.set(segment, 0L, calculateLFEFromSpatialChannels);
	    	return this;
	    }
	    
	    public int calculateLFEFromSpatialChannels() {
	    	return (int) CALCULATE_LFEFROM_SPATIAL_CHANNELS_HANDLE.get(segment, 0L);
	    }
	    
	    /// @see #converter()
	    public Capture converter(Consumer<MaDataConverter> consumer) {
	    	consumer.accept(converter);
	    	return this;
	    }
	    
	    /// @see #converter()
	    public Capture converter(MaDataConverter other) {
	    	converter.set(other);
	    	return this;
	    }
	    
	    public MaDataConverter converter() {
	    	return converter;
	    }
	    
	    /// @see #pIntermediaryBuffer()
	    public Capture pIntermediaryBuffer(MemorySegment pIntermediaryBuffer) {
	    	P_INTERMEDIARY_BUFFER_HANDLE.set(segment, 0L, pIntermediaryBuffer);
	    	return this;
	    }
	    
	    public @Nullable MemorySegment pIntermediaryBuffer() {
	    	MemorySegment segment = (MemorySegment) P_INTERMEDIARY_BUFFER_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return segment;
	    }
	    
	    /// @see #intermediaryBufferCap()
	    public Capture intermediaryBufferCap(int intermediaryBufferCap) {
	    	INTERMEDIARY_BUFFER_CAP_HANDLE.set(segment, 0L, intermediaryBufferCap);
	    	return this;
	    }
	    
	    public int intermediaryBufferCap() {
	    	return (int) INTERMEDIARY_BUFFER_CAP_HANDLE.get(segment, 0L);
	    }
	    
	    /// @see #intermediaryBufferLen()
	    public Capture intermediaryBufferLen(int intermediaryBufferLen) {
	    	INTERMEDIARY_BUFFER_LEN_HANDLE.set(segment, 0L, intermediaryBufferLen);
	    	return this;
	    }
	    
	    public int intermediaryBufferLen() {
	    	return (int) INTERMEDIARY_BUFFER_LEN_HANDLE.get(segment, 0L);
	    }
	    
	    @Override
	    public Capture set(Capture other) {
	        return set(other.segment);
	    }
	    
	    @Override
	    public Capture set(MemorySegment src) {
	        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
	        return this;
	    }
	    
	    @Override
	    public MemorySegment memorySegment() {
	        return segment;
	    }
	    
	    public NativeStructArray<Capture> asArray() {
	        return new NativeStructArray<>(this);
	    }
	    
	    public static NativeStructArray<Capture> array(Arena arena, int count) {
	        return new NativeStructArray<>(
	            arena,
	            LAYOUT,
	            segment -> new Capture(segment),
	            count
	        );
	    }
	    
	    public static NativeStructArray<Capture> array(Arena arena, Capture... structs) {
	        NativeStructArray<Capture> array = new NativeStructArray<>(
	            arena,
	            LAYOUT,
	            segment -> new Capture(segment),
	            structs.length
	        );
	    
	        for (int i = 0; i < structs.length; i++) {
	            array.set(i, structs[i]);
	        }
	    
	        return array;
	    }
	    
	    public static NativeStructArray<Capture> array(MemorySegment array) {
	        return new NativeStructArray<>(
	            array,
	            LAYOUT,
	            segment -> new Capture(segment)
	        );
	    }
	
	}
    
	public static class Wasapi implements Struct<Wasapi> {
	
		public static final StructLayout LAYOUT;
	
		public static final VarHandle P_AUDIO_CLIENT_PLAYBACK_HANDLE;
		public static final VarHandle P_AUDIO_CLIENT_CAPTURE_HANDLE;
		public static final VarHandle P_RENDER_CLIENT_HANDLE;
		public static final VarHandle P_CAPTURE_CLIENT_HANDLE;
		public static final VarHandle P_DEVICE_ENUMERATOR_HANDLE;
		public static final VarHandle H_EVENT_PLAYBACK_HANDLE;
		public static final VarHandle H_EVENT_CAPTURE_HANDLE;
		public static final VarHandle ACTUAL_BUFFER_SIZE_IN_FRAMES_PLAYBACK_HANDLE;
		public static final VarHandle ACTUAL_BUFFER_SIZE_IN_FRAMES_CAPTURE_HANDLE;
		public static final VarHandle ORIGINAL_PERIOD_SIZE_IN_FRAMES_HANDLE;
		public static final VarHandle ORIGINAL_PERIOD_SIZE_IN_MILLISECONDS_HANDLE;
		public static final VarHandle ORIGINAL_PERIODS_HANDLE;
		public static final VarHandle ORIGINAL_PERFORMANCE_PROFILE_HANDLE;
		public static final VarHandle PERIOD_SIZE_IN_FRAMES_PLAYBACK_HANDLE;
		public static final VarHandle PERIOD_SIZE_IN_FRAMES_CAPTURE_HANDLE;
		public static final VarHandle P_MAPPED_BUFFER_CAPTURE_HANDLE;
		public static final VarHandle MAPPED_BUFFER_CAPTURE_CAP_HANDLE;
		public static final VarHandle MAPPED_BUFFER_CAPTURE_LEN_HANDLE;
		public static final VarHandle P_MAPPED_BUFFER_PLAYBACK_HANDLE;
		public static final VarHandle MAPPED_BUFFER_PLAYBACK_CAP_HANDLE;
		public static final VarHandle MAPPED_BUFFER_PLAYBACK_LEN_HANDLE;
		public static final VarHandle LOOPBACK_PROCESS_ID_HANDLE;
		public static final VarHandle LOOPBACK_PROCESS_EXCLUDE_HANDLE;
		public static final VarHandle NO_AUTO_CONVERT_SRC_HANDLE;
		public static final VarHandle NO_DEFAULT_QUALITY_SRC_HANDLE;
		public static final VarHandle NO_HARDWARE_OFFLOADING_HANDLE;
		public static final VarHandle ALLOW_CAPTURE_AUTO_STREAM_ROUTING_HANDLE;
		public static final VarHandle ALLOW_PLAYBACK_AUTO_STREAM_ROUTING_HANDLE;
		public static final VarHandle IS_DETACHED_PLAYBACK_HANDLE;
		public static final VarHandle IS_DETACHED_CAPTURE_HANDLE;
		public static final VarHandle USAGE_HANDLE;
		public static final VarHandle H_AVRT_HANDLE_HANDLE;
		public static final VarHandle REROUTE_LOCK_HANDLE;
	
		public static final long P_AUDIO_CLIENT_PLAYBACK_BYTE_OFFSET;
		public static final long P_AUDIO_CLIENT_CAPTURE_BYTE_OFFSET;
		public static final long P_RENDER_CLIENT_BYTE_OFFSET;
		public static final long P_CAPTURE_CLIENT_BYTE_OFFSET;
		public static final long P_DEVICE_ENUMERATOR_BYTE_OFFSET;
		public static final long NOTIFICATION_CLIENT_BYTE_OFFSET;
		public static final long H_EVENT_PLAYBACK_BYTE_OFFSET;
		public static final long H_EVENT_CAPTURE_BYTE_OFFSET;
		public static final long ACTUAL_BUFFER_SIZE_IN_FRAMES_PLAYBACK_BYTE_OFFSET;
		public static final long ACTUAL_BUFFER_SIZE_IN_FRAMES_CAPTURE_BYTE_OFFSET;
		public static final long ORIGINAL_PERIOD_SIZE_IN_FRAMES_BYTE_OFFSET;
		public static final long ORIGINAL_PERIOD_SIZE_IN_MILLISECONDS_BYTE_OFFSET;
		public static final long ORIGINAL_PERIODS_BYTE_OFFSET;
		public static final long ORIGINAL_PERFORMANCE_PROFILE_BYTE_OFFSET;
		public static final long PERIOD_SIZE_IN_FRAMES_PLAYBACK_BYTE_OFFSET;
		public static final long PERIOD_SIZE_IN_FRAMES_CAPTURE_BYTE_OFFSET;
		public static final long P_MAPPED_BUFFER_CAPTURE_BYTE_OFFSET;
		public static final long MAPPED_BUFFER_CAPTURE_CAP_BYTE_OFFSET;
		public static final long MAPPED_BUFFER_CAPTURE_LEN_BYTE_OFFSET;
		public static final long P_MAPPED_BUFFER_PLAYBACK_BYTE_OFFSET;
		public static final long MAPPED_BUFFER_PLAYBACK_CAP_BYTE_OFFSET;
		public static final long MAPPED_BUFFER_PLAYBACK_LEN_BYTE_OFFSET;
		public static final long IS_STARTED_CAPTURE_BYTE_OFFSET;
		public static final long IS_STARTED_PLAYBACK_BYTE_OFFSET;
		public static final long LOOPBACK_PROCESS_ID_BYTE_OFFSET;
		public static final long LOOPBACK_PROCESS_EXCLUDE_BYTE_OFFSET;
		public static final long NO_AUTO_CONVERT_SRC_BYTE_OFFSET;
		public static final long NO_DEFAULT_QUALITY_SRC_BYTE_OFFSET;
		public static final long NO_HARDWARE_OFFLOADING_BYTE_OFFSET;
		public static final long ALLOW_CAPTURE_AUTO_STREAM_ROUTING_BYTE_OFFSET;
		public static final long ALLOW_PLAYBACK_AUTO_STREAM_ROUTING_BYTE_OFFSET;
		public static final long IS_DETACHED_PLAYBACK_BYTE_OFFSET;
		public static final long IS_DETACHED_CAPTURE_BYTE_OFFSET;
		public static final long USAGE_BYTE_OFFSET;
		public static final long H_AVRT_HANDLE_BYTE_OFFSET;
		public static final long REROUTE_LOCK_BYTE_OFFSET;
	
		private final MemorySegment segment;
	
		private final MaIMMNotificationClient notificationClient;
		private final MaAtomicBool32 isStartedCapture;
		private final MaAtomicBool32 isStartedPlayback;
	
		static {
			//@formatter:off
			LAYOUT = MemoryLayout.structLayout(
			    UNBOUNDED_ADDRESS.withName("pAudioClientPlayback"),
			    UNBOUNDED_ADDRESS.withName("pAudioClientCapture"),
			    UNBOUNDED_ADDRESS.withName("pRenderClient"),
			    UNBOUNDED_ADDRESS.withName("pCaptureClient"),
			    UNBOUNDED_ADDRESS.withName("pDeviceEnumerator"),
			    MaIMMNotificationClient.LAYOUT.withName("notificationClient"),
			    UNBOUNDED_ADDRESS.withName("hEventPlayback"),
			    UNBOUNDED_ADDRESS.withName("hEventCapture"),
			    JAVA_INT.withName("actualBufferSizeInFramesPlayback"),
			    JAVA_INT.withName("actualBufferSizeInFramesCapture"),
			    JAVA_INT.withName("originalPeriodSizeInFrames"),
			    JAVA_INT.withName("originalPeriodSizeInMilliseconds"),
			    JAVA_INT.withName("originalPeriods"),
			    JAVA_INT.withName("originalPerformanceProfile"),
			    JAVA_INT.withName("periodSizeInFramesPlayback"),
			    JAVA_INT.withName("periodSizeInFramesCapture"),
			    UNBOUNDED_ADDRESS.withName("pMappedBufferCapture"),
			    JAVA_INT.withName("mappedBufferCaptureCap"),
			    JAVA_INT.withName("mappedBufferCaptureLen"),
			    UNBOUNDED_ADDRESS.withName("pMappedBufferPlayback"),
			    JAVA_INT.withName("mappedBufferPlaybackCap"),
			    JAVA_INT.withName("mappedBufferPlaybackLen"),
			    MaAtomicBool32.LAYOUT.withName("isStartedCapture"),
			    MaAtomicBool32.LAYOUT.withName("isStartedPlayback"),
			    JAVA_INT.withName("loopbackProcessID"),
			    JAVA_BYTE.withName("loopbackProcessExclude"),
			    JAVA_BYTE.withName("noAutoConvertSRC"),
			    JAVA_BYTE.withName("noDefaultQualitySRC"),
			    JAVA_BYTE.withName("noHardwareOffloading"),
			    JAVA_BYTE.withName("allowCaptureAutoStreamRouting"),
			    JAVA_BYTE.withName("allowPlaybackAutoStreamRouting"),
			    JAVA_BYTE.withName("isDetachedPlayback"),
			    JAVA_BYTE.withName("isDetachedCapture"),
			    JAVA_INT.withName("usage"),
			    UNBOUNDED_ADDRESS.withName("hAvrtHandle"),
			    UNBOUNDED_ADDRESS.withName("rerouteLock")
			).withName("Wasapi").withByteAlignment(8);
			
			P_AUDIO_CLIENT_PLAYBACK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pAudioClientPlayback"));
			P_AUDIO_CLIENT_CAPTURE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pAudioClientCapture"));
			P_RENDER_CLIENT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pRenderClient"));
			P_CAPTURE_CLIENT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pCaptureClient"));
			P_DEVICE_ENUMERATOR_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pDeviceEnumerator"));
			H_EVENT_PLAYBACK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("hEventPlayback"));
			H_EVENT_CAPTURE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("hEventCapture"));
			ACTUAL_BUFFER_SIZE_IN_FRAMES_PLAYBACK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("actualBufferSizeInFramesPlayback"));
			ACTUAL_BUFFER_SIZE_IN_FRAMES_CAPTURE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("actualBufferSizeInFramesCapture"));
			ORIGINAL_PERIOD_SIZE_IN_FRAMES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("originalPeriodSizeInFrames"));
			ORIGINAL_PERIOD_SIZE_IN_MILLISECONDS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("originalPeriodSizeInMilliseconds"));
			ORIGINAL_PERIODS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("originalPeriods"));
			ORIGINAL_PERFORMANCE_PROFILE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("originalPerformanceProfile"));
			PERIOD_SIZE_IN_FRAMES_PLAYBACK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("periodSizeInFramesPlayback"));
			PERIOD_SIZE_IN_FRAMES_CAPTURE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("periodSizeInFramesCapture"));
			P_MAPPED_BUFFER_CAPTURE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pMappedBufferCapture"));
			MAPPED_BUFFER_CAPTURE_CAP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mappedBufferCaptureCap"));
			MAPPED_BUFFER_CAPTURE_LEN_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mappedBufferCaptureLen"));
			P_MAPPED_BUFFER_PLAYBACK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pMappedBufferPlayback"));
			MAPPED_BUFFER_PLAYBACK_CAP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mappedBufferPlaybackCap"));
			MAPPED_BUFFER_PLAYBACK_LEN_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mappedBufferPlaybackLen"));
			LOOPBACK_PROCESS_ID_HANDLE = LAYOUT.varHandle(PathElement.groupElement("loopbackProcessID"));
			LOOPBACK_PROCESS_EXCLUDE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("loopbackProcessExclude"));
			NO_AUTO_CONVERT_SRC_HANDLE = LAYOUT.varHandle(PathElement.groupElement("noAutoConvertSRC"));
			NO_DEFAULT_QUALITY_SRC_HANDLE = LAYOUT.varHandle(PathElement.groupElement("noDefaultQualitySRC"));
			NO_HARDWARE_OFFLOADING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("noHardwareOffloading"));
			ALLOW_CAPTURE_AUTO_STREAM_ROUTING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("allowCaptureAutoStreamRouting"));
			ALLOW_PLAYBACK_AUTO_STREAM_ROUTING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("allowPlaybackAutoStreamRouting"));
			IS_DETACHED_PLAYBACK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("isDetachedPlayback"));
			IS_DETACHED_CAPTURE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("isDetachedCapture"));
			USAGE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("usage"));
			H_AVRT_HANDLE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("hAvrtHandle"));
			REROUTE_LOCK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("rerouteLock"));
			
			P_AUDIO_CLIENT_PLAYBACK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pAudioClientPlayback"));
			P_AUDIO_CLIENT_CAPTURE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pAudioClientCapture"));
			P_RENDER_CLIENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pRenderClient"));
			P_CAPTURE_CLIENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pCaptureClient"));
			P_DEVICE_ENUMERATOR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pDeviceEnumerator"));
			NOTIFICATION_CLIENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("notificationClient"));
			H_EVENT_PLAYBACK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("hEventPlayback"));
			H_EVENT_CAPTURE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("hEventCapture"));
			ACTUAL_BUFFER_SIZE_IN_FRAMES_PLAYBACK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("actualBufferSizeInFramesPlayback"));
			ACTUAL_BUFFER_SIZE_IN_FRAMES_CAPTURE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("actualBufferSizeInFramesCapture"));
			ORIGINAL_PERIOD_SIZE_IN_FRAMES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("originalPeriodSizeInFrames"));
			ORIGINAL_PERIOD_SIZE_IN_MILLISECONDS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("originalPeriodSizeInMilliseconds"));
			ORIGINAL_PERIODS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("originalPeriods"));
			ORIGINAL_PERFORMANCE_PROFILE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("originalPerformanceProfile"));
			PERIOD_SIZE_IN_FRAMES_PLAYBACK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("periodSizeInFramesPlayback"));
			PERIOD_SIZE_IN_FRAMES_CAPTURE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("periodSizeInFramesCapture"));
			P_MAPPED_BUFFER_CAPTURE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pMappedBufferCapture"));
			MAPPED_BUFFER_CAPTURE_CAP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mappedBufferCaptureCap"));
			MAPPED_BUFFER_CAPTURE_LEN_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mappedBufferCaptureLen"));
			P_MAPPED_BUFFER_PLAYBACK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pMappedBufferPlayback"));
			MAPPED_BUFFER_PLAYBACK_CAP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mappedBufferPlaybackCap"));
			MAPPED_BUFFER_PLAYBACK_LEN_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mappedBufferPlaybackLen"));
			IS_STARTED_CAPTURE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("isStartedCapture"));
			IS_STARTED_PLAYBACK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("isStartedPlayback"));
			LOOPBACK_PROCESS_ID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("loopbackProcessID"));
			LOOPBACK_PROCESS_EXCLUDE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("loopbackProcessExclude"));
			NO_AUTO_CONVERT_SRC_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("noAutoConvertSRC"));
			NO_DEFAULT_QUALITY_SRC_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("noDefaultQualitySRC"));
			NO_HARDWARE_OFFLOADING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("noHardwareOffloading"));
			ALLOW_CAPTURE_AUTO_STREAM_ROUTING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("allowCaptureAutoStreamRouting"));
			ALLOW_PLAYBACK_AUTO_STREAM_ROUTING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("allowPlaybackAutoStreamRouting"));
			IS_DETACHED_PLAYBACK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("isDetachedPlayback"));
			IS_DETACHED_CAPTURE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("isDetachedCapture"));
			USAGE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("usage"));
			H_AVRT_HANDLE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("hAvrtHandle"));
			REROUTE_LOCK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("rerouteLock"));
			//@formatter:on
		}
	
		public Wasapi() {
		    this(Arena.ofAuto());
		}
		
		public Wasapi(Arena arena) {
		    this(arena.allocate(LAYOUT));
		}
		
		public Wasapi(MemorySegment segment) {
		    this.segment = segment;
		
		    notificationClient = new MaIMMNotificationClient(segment.asSlice(NOTIFICATION_CLIENT_BYTE_OFFSET, MaIMMNotificationClient.LAYOUT));
		    isStartedCapture = new MaAtomicBool32(segment.asSlice(IS_STARTED_CAPTURE_BYTE_OFFSET, MaAtomicBool32.LAYOUT));
		    isStartedPlayback = new MaAtomicBool32(segment.asSlice(IS_STARTED_PLAYBACK_BYTE_OFFSET, MaAtomicBool32.LAYOUT));
		}
	
	    /// @see #pAudioClientPlayback()
	    public Wasapi pAudioClientPlayback(MemorySegment pAudioClientPlayback) {
	    	P_AUDIO_CLIENT_PLAYBACK_HANDLE.set(segment, 0L, pAudioClientPlayback);
	    	return this;
	    }
	    
	    public @Nullable MemorySegment pAudioClientPlayback() {
	    	MemorySegment segment = (MemorySegment) P_AUDIO_CLIENT_PLAYBACK_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return segment;
	    }
	    
	    /// @see #pAudioClientCapture()
	    public Wasapi pAudioClientCapture(MemorySegment pAudioClientCapture) {
	    	P_AUDIO_CLIENT_CAPTURE_HANDLE.set(segment, 0L, pAudioClientCapture);
	    	return this;
	    }
	    
	    public @Nullable MemorySegment pAudioClientCapture() {
	    	MemorySegment segment = (MemorySegment) P_AUDIO_CLIENT_CAPTURE_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return segment;
	    }
	    
	    /// @see #pRenderClient()
	    public Wasapi pRenderClient(MemorySegment pRenderClient) {
	    	P_RENDER_CLIENT_HANDLE.set(segment, 0L, pRenderClient);
	    	return this;
	    }
	    
	    public @Nullable MemorySegment pRenderClient() {
	    	MemorySegment segment = (MemorySegment) P_RENDER_CLIENT_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return segment;
	    }
	    
	    /// @see #pCaptureClient()
	    public Wasapi pCaptureClient(MemorySegment pCaptureClient) {
	    	P_CAPTURE_CLIENT_HANDLE.set(segment, 0L, pCaptureClient);
	    	return this;
	    }
	    
	    public @Nullable MemorySegment pCaptureClient() {
	    	MemorySegment segment = (MemorySegment) P_CAPTURE_CLIENT_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return segment;
	    }
	    
	    /// @see #pDeviceEnumerator()
	    public Wasapi pDeviceEnumerator(MemorySegment pDeviceEnumerator) {
	    	P_DEVICE_ENUMERATOR_HANDLE.set(segment, 0L, pDeviceEnumerator);
	    	return this;
	    }
	    
	    public @Nullable MemorySegment pDeviceEnumerator() {
	    	MemorySegment segment = (MemorySegment) P_DEVICE_ENUMERATOR_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return segment;
	    }
	    
	    /// @see #notificationClient()
	    public Wasapi notificationClient(Consumer<MaIMMNotificationClient> consumer) {
	    	consumer.accept(notificationClient);
	    	return this;
	    }
	    
	    /// @see #notificationClient()
	    public Wasapi notificationClient(MaIMMNotificationClient other) {
	    	notificationClient.set(other);
	    	return this;
	    }
	    
	    public MaIMMNotificationClient notificationClient() {
	    	return notificationClient;
	    }
	    
	    /// @see #hEventPlayback()
	    public Wasapi hEventPlayback(MemorySegment hEventPlayback) {
	    	H_EVENT_PLAYBACK_HANDLE.set(segment, 0L, hEventPlayback);
	    	return this;
	    }
	    
	    public @Nullable MemorySegment hEventPlayback() {
	    	MemorySegment segment = (MemorySegment) H_EVENT_PLAYBACK_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return segment;
	    }
	    
	    /// @see #hEventCapture()
	    public Wasapi hEventCapture(MemorySegment hEventCapture) {
	    	H_EVENT_CAPTURE_HANDLE.set(segment, 0L, hEventCapture);
	    	return this;
	    }
	    
	    public @Nullable MemorySegment hEventCapture() {
	    	MemorySegment segment = (MemorySegment) H_EVENT_CAPTURE_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return segment;
	    }
	    
	    /// @see #actualBufferSizeInFramesPlayback()
	    public Wasapi actualBufferSizeInFramesPlayback(int actualBufferSizeInFramesPlayback) {
	    	ACTUAL_BUFFER_SIZE_IN_FRAMES_PLAYBACK_HANDLE.set(segment, 0L, actualBufferSizeInFramesPlayback);
	    	return this;
	    }
	    
	    public int actualBufferSizeInFramesPlayback() {
	    	return (int) ACTUAL_BUFFER_SIZE_IN_FRAMES_PLAYBACK_HANDLE.get(segment, 0L);
	    }
	    
	    /// @see #actualBufferSizeInFramesCapture()
	    public Wasapi actualBufferSizeInFramesCapture(int actualBufferSizeInFramesCapture) {
	    	ACTUAL_BUFFER_SIZE_IN_FRAMES_CAPTURE_HANDLE.set(segment, 0L, actualBufferSizeInFramesCapture);
	    	return this;
	    }
	    
	    public int actualBufferSizeInFramesCapture() {
	    	return (int) ACTUAL_BUFFER_SIZE_IN_FRAMES_CAPTURE_HANDLE.get(segment, 0L);
	    }
	    
	    /// @see #originalPeriodSizeInFrames()
	    public Wasapi originalPeriodSizeInFrames(int originalPeriodSizeInFrames) {
	    	ORIGINAL_PERIOD_SIZE_IN_FRAMES_HANDLE.set(segment, 0L, originalPeriodSizeInFrames);
	    	return this;
	    }
	    
	    public int originalPeriodSizeInFrames() {
	    	return (int) ORIGINAL_PERIOD_SIZE_IN_FRAMES_HANDLE.get(segment, 0L);
	    }
	    
	    /// @see #originalPeriodSizeInMilliseconds()
	    public Wasapi originalPeriodSizeInMilliseconds(int originalPeriodSizeInMilliseconds) {
	    	ORIGINAL_PERIOD_SIZE_IN_MILLISECONDS_HANDLE.set(segment, 0L, originalPeriodSizeInMilliseconds);
	    	return this;
	    }
	    
	    public int originalPeriodSizeInMilliseconds() {
	    	return (int) ORIGINAL_PERIOD_SIZE_IN_MILLISECONDS_HANDLE.get(segment, 0L);
	    }
	    
	    /// @see #originalPeriods()
	    public Wasapi originalPeriods(int originalPeriods) {
	    	ORIGINAL_PERIODS_HANDLE.set(segment, 0L, originalPeriods);
	    	return this;
	    }
	    
	    public int originalPeriods() {
	    	return (int) ORIGINAL_PERIODS_HANDLE.get(segment, 0L);
	    }
	    
	    /// @see #originalPerformanceProfile()
	    public Wasapi originalPerformanceProfile(int originalPerformanceProfile) {
	    	ORIGINAL_PERFORMANCE_PROFILE_HANDLE.set(segment, 0L, originalPerformanceProfile);
	    	return this;
	    }
	    
	    public int originalPerformanceProfile() {
	    	return (int) ORIGINAL_PERFORMANCE_PROFILE_HANDLE.get(segment, 0L);
	    }
	    
	    /// @see #periodSizeInFramesPlayback()
	    public Wasapi periodSizeInFramesPlayback(int periodSizeInFramesPlayback) {
	    	PERIOD_SIZE_IN_FRAMES_PLAYBACK_HANDLE.set(segment, 0L, periodSizeInFramesPlayback);
	    	return this;
	    }
	    
	    public int periodSizeInFramesPlayback() {
	    	return (int) PERIOD_SIZE_IN_FRAMES_PLAYBACK_HANDLE.get(segment, 0L);
	    }
	    
	    /// @see #periodSizeInFramesCapture()
	    public Wasapi periodSizeInFramesCapture(int periodSizeInFramesCapture) {
	    	PERIOD_SIZE_IN_FRAMES_CAPTURE_HANDLE.set(segment, 0L, periodSizeInFramesCapture);
	    	return this;
	    }
	    
	    public int periodSizeInFramesCapture() {
	    	return (int) PERIOD_SIZE_IN_FRAMES_CAPTURE_HANDLE.get(segment, 0L);
	    }
	    
	    /// @see #pMappedBufferCapture()
	    public Wasapi pMappedBufferCapture(MemorySegment pMappedBufferCapture) {
	    	P_MAPPED_BUFFER_CAPTURE_HANDLE.set(segment, 0L, pMappedBufferCapture);
	    	return this;
	    }
	    
	    public @Nullable MemorySegment pMappedBufferCapture() {
	    	MemorySegment segment = (MemorySegment) P_MAPPED_BUFFER_CAPTURE_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return segment;
	    }
	    
	    /// @see #mappedBufferCaptureCap()
	    public Wasapi mappedBufferCaptureCap(int mappedBufferCaptureCap) {
	    	MAPPED_BUFFER_CAPTURE_CAP_HANDLE.set(segment, 0L, mappedBufferCaptureCap);
	    	return this;
	    }
	    
	    public int mappedBufferCaptureCap() {
	    	return (int) MAPPED_BUFFER_CAPTURE_CAP_HANDLE.get(segment, 0L);
	    }
	    
	    /// @see #mappedBufferCaptureLen()
	    public Wasapi mappedBufferCaptureLen(int mappedBufferCaptureLen) {
	    	MAPPED_BUFFER_CAPTURE_LEN_HANDLE.set(segment, 0L, mappedBufferCaptureLen);
	    	return this;
	    }
	    
	    public int mappedBufferCaptureLen() {
	    	return (int) MAPPED_BUFFER_CAPTURE_LEN_HANDLE.get(segment, 0L);
	    }
	    
	    /// @see #pMappedBufferPlayback()
	    public Wasapi pMappedBufferPlayback(MemorySegment pMappedBufferPlayback) {
	    	P_MAPPED_BUFFER_PLAYBACK_HANDLE.set(segment, 0L, pMappedBufferPlayback);
	    	return this;
	    }
	    
	    public @Nullable MemorySegment pMappedBufferPlayback() {
	    	MemorySegment segment = (MemorySegment) P_MAPPED_BUFFER_PLAYBACK_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return segment;
	    }
	    
	    /// @see #mappedBufferPlaybackCap()
	    public Wasapi mappedBufferPlaybackCap(int mappedBufferPlaybackCap) {
	    	MAPPED_BUFFER_PLAYBACK_CAP_HANDLE.set(segment, 0L, mappedBufferPlaybackCap);
	    	return this;
	    }
	    
	    public int mappedBufferPlaybackCap() {
	    	return (int) MAPPED_BUFFER_PLAYBACK_CAP_HANDLE.get(segment, 0L);
	    }
	    
	    /// @see #mappedBufferPlaybackLen()
	    public Wasapi mappedBufferPlaybackLen(int mappedBufferPlaybackLen) {
	    	MAPPED_BUFFER_PLAYBACK_LEN_HANDLE.set(segment, 0L, mappedBufferPlaybackLen);
	    	return this;
	    }
	    
	    public int mappedBufferPlaybackLen() {
	    	return (int) MAPPED_BUFFER_PLAYBACK_LEN_HANDLE.get(segment, 0L);
	    }
	    
	    /// @see #isStartedCapture()
	    public Wasapi isStartedCapture(Consumer<MaAtomicBool32> consumer) {
	    	consumer.accept(isStartedCapture);
	    	return this;
	    }
	    
	    /// @see #isStartedCapture()
	    public Wasapi isStartedCapture(MaAtomicBool32 other) {
	    	isStartedCapture.set(other);
	    	return this;
	    }
	    
	    public MaAtomicBool32 isStartedCapture() {
	    	return isStartedCapture;
	    }
	    
	    /// @see #isStartedPlayback()
	    public Wasapi isStartedPlayback(Consumer<MaAtomicBool32> consumer) {
	    	consumer.accept(isStartedPlayback);
	    	return this;
	    }
	    
	    /// @see #isStartedPlayback()
	    public Wasapi isStartedPlayback(MaAtomicBool32 other) {
	    	isStartedPlayback.set(other);
	    	return this;
	    }
	    
	    public MaAtomicBool32 isStartedPlayback() {
	    	return isStartedPlayback;
	    }
	    
	    /// @see #loopbackProcessID()
	    public Wasapi loopbackProcessID(int loopbackProcessID) {
	    	LOOPBACK_PROCESS_ID_HANDLE.set(segment, 0L, loopbackProcessID);
	    	return this;
	    }
	    
	    public int loopbackProcessID() {
	    	return (int) LOOPBACK_PROCESS_ID_HANDLE.get(segment, 0L);
	    }
	    
	    /// @see #loopbackProcessExclude()
	    public Wasapi loopbackProcessExclude(byte loopbackProcessExclude) {
	    	LOOPBACK_PROCESS_EXCLUDE_HANDLE.set(segment, 0L, loopbackProcessExclude);
	    	return this;
	    }
	    
	    public byte loopbackProcessExclude() {
	    	return (byte) LOOPBACK_PROCESS_EXCLUDE_HANDLE.get(segment, 0L);
	    }
	    
	    /// @see #noAutoConvertSRC()
	    public Wasapi noAutoConvertSRC(byte noAutoConvertSRC) {
	    	NO_AUTO_CONVERT_SRC_HANDLE.set(segment, 0L, noAutoConvertSRC);
	    	return this;
	    }
	    
	    public byte noAutoConvertSRC() {
	    	return (byte) NO_AUTO_CONVERT_SRC_HANDLE.get(segment, 0L);
	    }
	    
	    /// @see #noDefaultQualitySRC()
	    public Wasapi noDefaultQualitySRC(byte noDefaultQualitySRC) {
	    	NO_DEFAULT_QUALITY_SRC_HANDLE.set(segment, 0L, noDefaultQualitySRC);
	    	return this;
	    }
	    
	    public byte noDefaultQualitySRC() {
	    	return (byte) NO_DEFAULT_QUALITY_SRC_HANDLE.get(segment, 0L);
	    }
	    
	    /// @see #noHardwareOffloading()
	    public Wasapi noHardwareOffloading(byte noHardwareOffloading) {
	    	NO_HARDWARE_OFFLOADING_HANDLE.set(segment, 0L, noHardwareOffloading);
	    	return this;
	    }
	    
	    public byte noHardwareOffloading() {
	    	return (byte) NO_HARDWARE_OFFLOADING_HANDLE.get(segment, 0L);
	    }
	    
	    /// @see #allowCaptureAutoStreamRouting()
	    public Wasapi allowCaptureAutoStreamRouting(byte allowCaptureAutoStreamRouting) {
	    	ALLOW_CAPTURE_AUTO_STREAM_ROUTING_HANDLE.set(segment, 0L, allowCaptureAutoStreamRouting);
	    	return this;
	    }
	    
	    public byte allowCaptureAutoStreamRouting() {
	    	return (byte) ALLOW_CAPTURE_AUTO_STREAM_ROUTING_HANDLE.get(segment, 0L);
	    }
	    
	    /// @see #allowPlaybackAutoStreamRouting()
	    public Wasapi allowPlaybackAutoStreamRouting(byte allowPlaybackAutoStreamRouting) {
	    	ALLOW_PLAYBACK_AUTO_STREAM_ROUTING_HANDLE.set(segment, 0L, allowPlaybackAutoStreamRouting);
	    	return this;
	    }
	    
	    public byte allowPlaybackAutoStreamRouting() {
	    	return (byte) ALLOW_PLAYBACK_AUTO_STREAM_ROUTING_HANDLE.get(segment, 0L);
	    }
	    
	    /// @see #isDetachedPlayback()
	    public Wasapi isDetachedPlayback(byte isDetachedPlayback) {
	    	IS_DETACHED_PLAYBACK_HANDLE.set(segment, 0L, isDetachedPlayback);
	    	return this;
	    }
	    
	    public byte isDetachedPlayback() {
	    	return (byte) IS_DETACHED_PLAYBACK_HANDLE.get(segment, 0L);
	    }
	    
	    /// @see #isDetachedCapture()
	    public Wasapi isDetachedCapture(byte isDetachedCapture) {
	    	IS_DETACHED_CAPTURE_HANDLE.set(segment, 0L, isDetachedCapture);
	    	return this;
	    }
	    
	    public byte isDetachedCapture() {
	    	return (byte) IS_DETACHED_CAPTURE_HANDLE.get(segment, 0L);
	    }
	    
	    /// @see #usage()
	    public Wasapi usage(int usage) {
	    	USAGE_HANDLE.set(segment, 0L, usage);
	    	return this;
	    }
	    
	    public int usage() {
	    	return (int) USAGE_HANDLE.get(segment, 0L);
	    }
	    
	    /// @see #hAvrtHandle()
	    public Wasapi hAvrtHandle(MemorySegment hAvrtHandle) {
	    	H_AVRT_HANDLE_HANDLE.set(segment, 0L, hAvrtHandle);
	    	return this;
	    }
	    
	    public @Nullable MemorySegment hAvrtHandle() {
	    	MemorySegment segment = (MemorySegment) H_AVRT_HANDLE_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return segment;
	    }
	    
	    /// @see #rerouteLock()
	    public Wasapi rerouteLock(MemorySegment rerouteLock) {
	    	REROUTE_LOCK_HANDLE.set(segment, 0L, rerouteLock);
	    	return this;
	    }
	    
	    public @Nullable MemorySegment rerouteLock() {
	    	MemorySegment segment = (MemorySegment) REROUTE_LOCK_HANDLE.get(this.segment, 0L);
	    
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
	    
	    public static NativeStructArray<Wasapi> array(Arena arena, int count) {
	        return new NativeStructArray<>(
	            arena,
	            LAYOUT,
	            segment -> new Wasapi(segment),
	            count
	        );
	    }
	    
	    public static NativeStructArray<Wasapi> array(Arena arena, Wasapi... structs) {
	        NativeStructArray<Wasapi> array = new NativeStructArray<>(
	            arena,
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
	
		public static final VarHandle P_PLAYBACK_HANDLE;
		public static final VarHandle P_PLAYBACK_PRIMARY_BUFFER_HANDLE;
		public static final VarHandle P_PLAYBACK_BUFFER_HANDLE;
		public static final VarHandle P_CAPTURE_HANDLE;
		public static final VarHandle P_CAPTURE_BUFFER_HANDLE;
	
		public static final long P_PLAYBACK_BYTE_OFFSET;
		public static final long P_PLAYBACK_PRIMARY_BUFFER_BYTE_OFFSET;
		public static final long P_PLAYBACK_BUFFER_BYTE_OFFSET;
		public static final long P_CAPTURE_BYTE_OFFSET;
		public static final long P_CAPTURE_BUFFER_BYTE_OFFSET;
	
		private final MemorySegment segment;
	
		static {
			//@formatter:off
			LAYOUT = MemoryLayout.structLayout(
			    UNBOUNDED_ADDRESS.withName("pPlayback"),
			    UNBOUNDED_ADDRESS.withName("pPlaybackPrimaryBuffer"),
			    UNBOUNDED_ADDRESS.withName("pPlaybackBuffer"),
			    UNBOUNDED_ADDRESS.withName("pCapture"),
			    UNBOUNDED_ADDRESS.withName("pCaptureBuffer")
			).withName("Dsound").withByteAlignment(8);
			
			P_PLAYBACK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pPlayback"));
			P_PLAYBACK_PRIMARY_BUFFER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pPlaybackPrimaryBuffer"));
			P_PLAYBACK_BUFFER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pPlaybackBuffer"));
			P_CAPTURE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pCapture"));
			P_CAPTURE_BUFFER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pCaptureBuffer"));
			
			P_PLAYBACK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pPlayback"));
			P_PLAYBACK_PRIMARY_BUFFER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pPlaybackPrimaryBuffer"));
			P_PLAYBACK_BUFFER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pPlaybackBuffer"));
			P_CAPTURE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pCapture"));
			P_CAPTURE_BUFFER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pCaptureBuffer"));
			//@formatter:on
		}
	
		public Dsound() {
		    this(Arena.ofAuto());
		}
		
		public Dsound(Arena arena) {
		    this(arena.allocate(LAYOUT));
		}
		
		public Dsound(MemorySegment segment) {
		    this.segment = segment;
		
		}
	
	    /// @see #pPlayback()
	    public Dsound pPlayback(MemorySegment pPlayback) {
	    	P_PLAYBACK_HANDLE.set(segment, 0L, pPlayback);
	    	return this;
	    }
	    
	    public @Nullable MemorySegment pPlayback() {
	    	MemorySegment segment = (MemorySegment) P_PLAYBACK_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return segment;
	    }
	    
	    /// @see #pPlaybackPrimaryBuffer()
	    public Dsound pPlaybackPrimaryBuffer(MemorySegment pPlaybackPrimaryBuffer) {
	    	P_PLAYBACK_PRIMARY_BUFFER_HANDLE.set(segment, 0L, pPlaybackPrimaryBuffer);
	    	return this;
	    }
	    
	    public @Nullable MemorySegment pPlaybackPrimaryBuffer() {
	    	MemorySegment segment = (MemorySegment) P_PLAYBACK_PRIMARY_BUFFER_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return segment;
	    }
	    
	    /// @see #pPlaybackBuffer()
	    public Dsound pPlaybackBuffer(MemorySegment pPlaybackBuffer) {
	    	P_PLAYBACK_BUFFER_HANDLE.set(segment, 0L, pPlaybackBuffer);
	    	return this;
	    }
	    
	    public @Nullable MemorySegment pPlaybackBuffer() {
	    	MemorySegment segment = (MemorySegment) P_PLAYBACK_BUFFER_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return segment;
	    }
	    
	    /// @see #pCapture()
	    public Dsound pCapture(MemorySegment pCapture) {
	    	P_CAPTURE_HANDLE.set(segment, 0L, pCapture);
	    	return this;
	    }
	    
	    public @Nullable MemorySegment pCapture() {
	    	MemorySegment segment = (MemorySegment) P_CAPTURE_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return segment;
	    }
	    
	    /// @see #pCaptureBuffer()
	    public Dsound pCaptureBuffer(MemorySegment pCaptureBuffer) {
	    	P_CAPTURE_BUFFER_HANDLE.set(segment, 0L, pCaptureBuffer);
	    	return this;
	    }
	    
	    public @Nullable MemorySegment pCaptureBuffer() {
	    	MemorySegment segment = (MemorySegment) P_CAPTURE_BUFFER_HANDLE.get(this.segment, 0L);
	    
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
	    
	    public static NativeStructArray<Dsound> array(Arena arena, int count) {
	        return new NativeStructArray<>(
	            arena,
	            LAYOUT,
	            segment -> new Dsound(segment),
	            count
	        );
	    }
	    
	    public static NativeStructArray<Dsound> array(Arena arena, Dsound... structs) {
	        NativeStructArray<Dsound> array = new NativeStructArray<>(
	            arena,
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
	
		public static final VarHandle H_DEVICE_PLAYBACK_HANDLE;
		public static final VarHandle H_DEVICE_CAPTURE_HANDLE;
		public static final VarHandle H_EVENT_PLAYBACK_HANDLE;
		public static final VarHandle H_EVENT_CAPTURE_HANDLE;
		public static final VarHandle FRAGMENT_SIZE_IN_FRAMES_HANDLE;
		public static final VarHandle I_NEXT_HEADER_PLAYBACK_HANDLE;
		public static final VarHandle I_NEXT_HEADER_CAPTURE_HANDLE;
		public static final VarHandle HEADER_FRAMES_CONSUMED_PLAYBACK_HANDLE;
		public static final VarHandle HEADER_FRAMES_CONSUMED_CAPTURE_HANDLE;
		public static final VarHandle P_WAVEHDRPLAYBACK_HANDLE;
		public static final VarHandle P_WAVEHDRCAPTURE_HANDLE;
		public static final VarHandle P_INTERMEDIARY_BUFFER_PLAYBACK_HANDLE;
		public static final VarHandle P_INTERMEDIARY_BUFFER_CAPTURE_HANDLE;
		public static final VarHandle _P_HEAP_DATA_HANDLE;
	
		public static final long H_DEVICE_PLAYBACK_BYTE_OFFSET;
		public static final long H_DEVICE_CAPTURE_BYTE_OFFSET;
		public static final long H_EVENT_PLAYBACK_BYTE_OFFSET;
		public static final long H_EVENT_CAPTURE_BYTE_OFFSET;
		public static final long FRAGMENT_SIZE_IN_FRAMES_BYTE_OFFSET;
		public static final long I_NEXT_HEADER_PLAYBACK_BYTE_OFFSET;
		public static final long I_NEXT_HEADER_CAPTURE_BYTE_OFFSET;
		public static final long HEADER_FRAMES_CONSUMED_PLAYBACK_BYTE_OFFSET;
		public static final long HEADER_FRAMES_CONSUMED_CAPTURE_BYTE_OFFSET;
		public static final long P_WAVEHDRPLAYBACK_BYTE_OFFSET;
		public static final long P_WAVEHDRCAPTURE_BYTE_OFFSET;
		public static final long P_INTERMEDIARY_BUFFER_PLAYBACK_BYTE_OFFSET;
		public static final long P_INTERMEDIARY_BUFFER_CAPTURE_BYTE_OFFSET;
		public static final long _P_HEAP_DATA_BYTE_OFFSET;
	
		private final MemorySegment segment;
	
		static {
			//@formatter:off
			LAYOUT = MemoryLayout.structLayout(
			    UNBOUNDED_ADDRESS.withName("hDevicePlayback"),
			    UNBOUNDED_ADDRESS.withName("hDeviceCapture"),
			    UNBOUNDED_ADDRESS.withName("hEventPlayback"),
			    UNBOUNDED_ADDRESS.withName("hEventCapture"),
			    JAVA_INT.withName("fragmentSizeInFrames"),
			    JAVA_INT.withName("iNextHeaderPlayback"),
			    JAVA_INT.withName("iNextHeaderCapture"),
			    JAVA_INT.withName("headerFramesConsumedPlayback"),
			    JAVA_INT.withName("headerFramesConsumedCapture"),
			    MemoryLayout.paddingLayout(4),
			    UNBOUNDED_ADDRESS.withName("pWAVEHDRPlayback"),
			    UNBOUNDED_ADDRESS.withName("pWAVEHDRCapture"),
			    UNBOUNDED_ADDRESS.withName("pIntermediaryBufferPlayback"),
			    UNBOUNDED_ADDRESS.withName("pIntermediaryBufferCapture"),
			    UNBOUNDED_ADDRESS.withName("_pHeapData")
			).withName("Winmm").withByteAlignment(8);
			
			H_DEVICE_PLAYBACK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("hDevicePlayback"));
			H_DEVICE_CAPTURE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("hDeviceCapture"));
			H_EVENT_PLAYBACK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("hEventPlayback"));
			H_EVENT_CAPTURE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("hEventCapture"));
			FRAGMENT_SIZE_IN_FRAMES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("fragmentSizeInFrames"));
			I_NEXT_HEADER_PLAYBACK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("iNextHeaderPlayback"));
			I_NEXT_HEADER_CAPTURE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("iNextHeaderCapture"));
			HEADER_FRAMES_CONSUMED_PLAYBACK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("headerFramesConsumedPlayback"));
			HEADER_FRAMES_CONSUMED_CAPTURE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("headerFramesConsumedCapture"));
			P_WAVEHDRPLAYBACK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pWAVEHDRPlayback"));
			P_WAVEHDRCAPTURE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pWAVEHDRCapture"));
			P_INTERMEDIARY_BUFFER_PLAYBACK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pIntermediaryBufferPlayback"));
			P_INTERMEDIARY_BUFFER_CAPTURE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pIntermediaryBufferCapture"));
			_P_HEAP_DATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("_pHeapData"));
			
			H_DEVICE_PLAYBACK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("hDevicePlayback"));
			H_DEVICE_CAPTURE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("hDeviceCapture"));
			H_EVENT_PLAYBACK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("hEventPlayback"));
			H_EVENT_CAPTURE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("hEventCapture"));
			FRAGMENT_SIZE_IN_FRAMES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("fragmentSizeInFrames"));
			I_NEXT_HEADER_PLAYBACK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("iNextHeaderPlayback"));
			I_NEXT_HEADER_CAPTURE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("iNextHeaderCapture"));
			HEADER_FRAMES_CONSUMED_PLAYBACK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("headerFramesConsumedPlayback"));
			HEADER_FRAMES_CONSUMED_CAPTURE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("headerFramesConsumedCapture"));
			P_WAVEHDRPLAYBACK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pWAVEHDRPlayback"));
			P_WAVEHDRCAPTURE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pWAVEHDRCapture"));
			P_INTERMEDIARY_BUFFER_PLAYBACK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pIntermediaryBufferPlayback"));
			P_INTERMEDIARY_BUFFER_CAPTURE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pIntermediaryBufferCapture"));
			_P_HEAP_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("_pHeapData"));
			//@formatter:on
		}
	
		public Winmm() {
		    this(Arena.ofAuto());
		}
		
		public Winmm(Arena arena) {
		    this(arena.allocate(LAYOUT));
		}
		
		public Winmm(MemorySegment segment) {
		    this.segment = segment;
		
		}
	
	    /// @see #hDevicePlayback()
	    public Winmm hDevicePlayback(MemorySegment hDevicePlayback) {
	    	H_DEVICE_PLAYBACK_HANDLE.set(segment, 0L, hDevicePlayback);
	    	return this;
	    }
	    
	    public @Nullable MemorySegment hDevicePlayback() {
	    	MemorySegment segment = (MemorySegment) H_DEVICE_PLAYBACK_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return segment;
	    }
	    
	    /// @see #hDeviceCapture()
	    public Winmm hDeviceCapture(MemorySegment hDeviceCapture) {
	    	H_DEVICE_CAPTURE_HANDLE.set(segment, 0L, hDeviceCapture);
	    	return this;
	    }
	    
	    public @Nullable MemorySegment hDeviceCapture() {
	    	MemorySegment segment = (MemorySegment) H_DEVICE_CAPTURE_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return segment;
	    }
	    
	    /// @see #hEventPlayback()
	    public Winmm hEventPlayback(MemorySegment hEventPlayback) {
	    	H_EVENT_PLAYBACK_HANDLE.set(segment, 0L, hEventPlayback);
	    	return this;
	    }
	    
	    public @Nullable MemorySegment hEventPlayback() {
	    	MemorySegment segment = (MemorySegment) H_EVENT_PLAYBACK_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return segment;
	    }
	    
	    /// @see #hEventCapture()
	    public Winmm hEventCapture(MemorySegment hEventCapture) {
	    	H_EVENT_CAPTURE_HANDLE.set(segment, 0L, hEventCapture);
	    	return this;
	    }
	    
	    public @Nullable MemorySegment hEventCapture() {
	    	MemorySegment segment = (MemorySegment) H_EVENT_CAPTURE_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return segment;
	    }
	    
	    /// @see #fragmentSizeInFrames()
	    public Winmm fragmentSizeInFrames(int fragmentSizeInFrames) {
	    	FRAGMENT_SIZE_IN_FRAMES_HANDLE.set(segment, 0L, fragmentSizeInFrames);
	    	return this;
	    }
	    
	    public int fragmentSizeInFrames() {
	    	return (int) FRAGMENT_SIZE_IN_FRAMES_HANDLE.get(segment, 0L);
	    }
	    
	    /// @see #iNextHeaderPlayback()
	    public Winmm iNextHeaderPlayback(int iNextHeaderPlayback) {
	    	I_NEXT_HEADER_PLAYBACK_HANDLE.set(segment, 0L, iNextHeaderPlayback);
	    	return this;
	    }
	    
	    public int iNextHeaderPlayback() {
	    	return (int) I_NEXT_HEADER_PLAYBACK_HANDLE.get(segment, 0L);
	    }
	    
	    /// @see #iNextHeaderCapture()
	    public Winmm iNextHeaderCapture(int iNextHeaderCapture) {
	    	I_NEXT_HEADER_CAPTURE_HANDLE.set(segment, 0L, iNextHeaderCapture);
	    	return this;
	    }
	    
	    public int iNextHeaderCapture() {
	    	return (int) I_NEXT_HEADER_CAPTURE_HANDLE.get(segment, 0L);
	    }
	    
	    /// @see #headerFramesConsumedPlayback()
	    public Winmm headerFramesConsumedPlayback(int headerFramesConsumedPlayback) {
	    	HEADER_FRAMES_CONSUMED_PLAYBACK_HANDLE.set(segment, 0L, headerFramesConsumedPlayback);
	    	return this;
	    }
	    
	    public int headerFramesConsumedPlayback() {
	    	return (int) HEADER_FRAMES_CONSUMED_PLAYBACK_HANDLE.get(segment, 0L);
	    }
	    
	    /// @see #headerFramesConsumedCapture()
	    public Winmm headerFramesConsumedCapture(int headerFramesConsumedCapture) {
	    	HEADER_FRAMES_CONSUMED_CAPTURE_HANDLE.set(segment, 0L, headerFramesConsumedCapture);
	    	return this;
	    }
	    
	    public int headerFramesConsumedCapture() {
	    	return (int) HEADER_FRAMES_CONSUMED_CAPTURE_HANDLE.get(segment, 0L);
	    }
	    
	    /// @see #pWAVEHDRPlayback()
	    public Winmm pWAVEHDRPlayback(NativeByteArray pWAVEHDRPlayback) {
	    	P_WAVEHDRPLAYBACK_HANDLE.set(segment, 0L, pWAVEHDRPlayback.memorySegment());
	    	return this;
	    }
	    
	    public @Nullable NativeByteArray pWAVEHDRPlayback() {
	    	MemorySegment segment = (MemorySegment) P_WAVEHDRPLAYBACK_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return new NativeByteArray(segment);
	    }
	    
	    /// @see #pWAVEHDRCapture()
	    public Winmm pWAVEHDRCapture(NativeByteArray pWAVEHDRCapture) {
	    	P_WAVEHDRCAPTURE_HANDLE.set(segment, 0L, pWAVEHDRCapture.memorySegment());
	    	return this;
	    }
	    
	    public @Nullable NativeByteArray pWAVEHDRCapture() {
	    	MemorySegment segment = (MemorySegment) P_WAVEHDRCAPTURE_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return new NativeByteArray(segment);
	    }
	    
	    /// @see #pIntermediaryBufferPlayback()
	    public Winmm pIntermediaryBufferPlayback(NativeByteArray pIntermediaryBufferPlayback) {
	    	P_INTERMEDIARY_BUFFER_PLAYBACK_HANDLE.set(segment, 0L, pIntermediaryBufferPlayback.memorySegment());
	    	return this;
	    }
	    
	    public @Nullable NativeByteArray pIntermediaryBufferPlayback() {
	    	MemorySegment segment = (MemorySegment) P_INTERMEDIARY_BUFFER_PLAYBACK_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return new NativeByteArray(segment);
	    }
	    
	    /// @see #pIntermediaryBufferCapture()
	    public Winmm pIntermediaryBufferCapture(NativeByteArray pIntermediaryBufferCapture) {
	    	P_INTERMEDIARY_BUFFER_CAPTURE_HANDLE.set(segment, 0L, pIntermediaryBufferCapture.memorySegment());
	    	return this;
	    }
	    
	    public @Nullable NativeByteArray pIntermediaryBufferCapture() {
	    	MemorySegment segment = (MemorySegment) P_INTERMEDIARY_BUFFER_CAPTURE_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return new NativeByteArray(segment);
	    }
	    
	    /// @see #_pHeapData()
	    public Winmm _pHeapData(NativeByteArray _pHeapData) {
	    	_P_HEAP_DATA_HANDLE.set(segment, 0L, _pHeapData.memorySegment());
	    	return this;
	    }
	    
	    public @Nullable NativeByteArray _pHeapData() {
	    	MemorySegment segment = (MemorySegment) _P_HEAP_DATA_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return new NativeByteArray(segment);
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
	    
	    public static NativeStructArray<Winmm> array(Arena arena, int count) {
	        return new NativeStructArray<>(
	            arena,
	            LAYOUT,
	            segment -> new Winmm(segment),
	            count
	        );
	    }
	    
	    public static NativeStructArray<Winmm> array(Arena arena, Winmm... structs) {
	        NativeStructArray<Winmm> array = new NativeStructArray<>(
	            arena,
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
	
		public static final VarHandle P_CLIENT_HANDLE;
		public static final VarHandle PP_PORTS_PLAYBACK_HANDLE;
		public static final VarHandle PP_PORTS_CAPTURE_HANDLE;
		public static final VarHandle P_INTERMEDIARY_BUFFER_PLAYBACK_HANDLE;
		public static final VarHandle P_INTERMEDIARY_BUFFER_CAPTURE_HANDLE;
	
		public static final long P_CLIENT_BYTE_OFFSET;
		public static final long PP_PORTS_PLAYBACK_BYTE_OFFSET;
		public static final long PP_PORTS_CAPTURE_BYTE_OFFSET;
		public static final long P_INTERMEDIARY_BUFFER_PLAYBACK_BYTE_OFFSET;
		public static final long P_INTERMEDIARY_BUFFER_CAPTURE_BYTE_OFFSET;
	
		private final MemorySegment segment;
	
		static {
			//@formatter:off
			LAYOUT = MemoryLayout.structLayout(
			    UNBOUNDED_ADDRESS.withName("pClient"),
			    UNBOUNDED_ADDRESS.withName("ppPortsPlayback"),
			    UNBOUNDED_ADDRESS.withName("ppPortsCapture"),
			    UNBOUNDED_ADDRESS.withName("pIntermediaryBufferPlayback"),
			    UNBOUNDED_ADDRESS.withName("pIntermediaryBufferCapture")
			).withName("Jack").withByteAlignment(8);
			
			P_CLIENT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pClient"));
			PP_PORTS_PLAYBACK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("ppPortsPlayback"));
			PP_PORTS_CAPTURE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("ppPortsCapture"));
			P_INTERMEDIARY_BUFFER_PLAYBACK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pIntermediaryBufferPlayback"));
			P_INTERMEDIARY_BUFFER_CAPTURE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pIntermediaryBufferCapture"));
			
			P_CLIENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pClient"));
			PP_PORTS_PLAYBACK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("ppPortsPlayback"));
			PP_PORTS_CAPTURE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("ppPortsCapture"));
			P_INTERMEDIARY_BUFFER_PLAYBACK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pIntermediaryBufferPlayback"));
			P_INTERMEDIARY_BUFFER_CAPTURE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pIntermediaryBufferCapture"));
			//@formatter:on
		}
	
		public Jack() {
		    this(Arena.ofAuto());
		}
		
		public Jack(Arena arena) {
		    this(arena.allocate(LAYOUT));
		}
		
		public Jack(MemorySegment segment) {
		    this.segment = segment;
		
		}
	
	    /// @see #pClient()
	    public Jack pClient(MemorySegment pClient) {
	    	P_CLIENT_HANDLE.set(segment, 0L, pClient);
	    	return this;
	    }
	    
	    public @Nullable MemorySegment pClient() {
	    	MemorySegment segment = (MemorySegment) P_CLIENT_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return segment;
	    }
	    
	    /// @see #ppPortsPlayback()
	    public Jack ppPortsPlayback(NativePointerArray ppPortsPlayback) {
	    	PP_PORTS_PLAYBACK_HANDLE.set(segment, 0L, ppPortsPlayback.memorySegment());
	    	return this;
	    }
	    
	    public @Nullable NativePointerArray ppPortsPlayback() {
	    	MemorySegment segment = (MemorySegment) PP_PORTS_PLAYBACK_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return new NativePointerArray(segment);
	    }
	    
	    /// @see #ppPortsCapture()
	    public Jack ppPortsCapture(NativePointerArray ppPortsCapture) {
	    	PP_PORTS_CAPTURE_HANDLE.set(segment, 0L, ppPortsCapture.memorySegment());
	    	return this;
	    }
	    
	    public @Nullable NativePointerArray ppPortsCapture() {
	    	MemorySegment segment = (MemorySegment) PP_PORTS_CAPTURE_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return new NativePointerArray(segment);
	    }
	    
	    /// @see #pIntermediaryBufferPlayback()
	    public Jack pIntermediaryBufferPlayback(NativeFloatArray pIntermediaryBufferPlayback) {
	    	P_INTERMEDIARY_BUFFER_PLAYBACK_HANDLE.set(segment, 0L, pIntermediaryBufferPlayback.memorySegment());
	    	return this;
	    }
	    
	    public @Nullable NativeFloatArray pIntermediaryBufferPlayback() {
	    	MemorySegment segment = (MemorySegment) P_INTERMEDIARY_BUFFER_PLAYBACK_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return new NativeFloatArray(segment);
	    }
	    
	    /// @see #pIntermediaryBufferCapture()
	    public Jack pIntermediaryBufferCapture(NativeFloatArray pIntermediaryBufferCapture) {
	    	P_INTERMEDIARY_BUFFER_CAPTURE_HANDLE.set(segment, 0L, pIntermediaryBufferCapture.memorySegment());
	    	return this;
	    }
	    
	    public @Nullable NativeFloatArray pIntermediaryBufferCapture() {
	    	MemorySegment segment = (MemorySegment) P_INTERMEDIARY_BUFFER_CAPTURE_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return new NativeFloatArray(segment);
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
	    
	    public static NativeStructArray<Jack> array(Arena arena, int count) {
	        return new NativeStructArray<>(
	            arena,
	            LAYOUT,
	            segment -> new Jack(segment),
	            count
	        );
	    }
	    
	    public static NativeStructArray<Jack> array(Arena arena, Jack... structs) {
	        NativeStructArray<Jack> array = new NativeStructArray<>(
	            arena,
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
    
	public static class Null_device implements Struct<Null_device> {
	
		public static final StructLayout LAYOUT;
	
		public static final VarHandle DEVICE_THREAD_HANDLE;
		public static final VarHandle OPERATION_EVENT_HANDLE;
		public static final VarHandle OPERATION_COMPLETION_EVENT_HANDLE;
		public static final VarHandle OPERATION_SEMAPHORE_HANDLE;
		public static final VarHandle OPERATION_HANDLE;
		public static final VarHandle OPERATION_RESULT_HANDLE;
		public static final VarHandle PRIOR_RUN_TIME_HANDLE;
		public static final VarHandle CURRENT_PERIOD_FRAMES_REMAINING_PLAYBACK_HANDLE;
		public static final VarHandle CURRENT_PERIOD_FRAMES_REMAINING_CAPTURE_HANDLE;
		public static final VarHandle LAST_PROCESSED_FRAME_PLAYBACK_HANDLE;
		public static final VarHandle LAST_PROCESSED_FRAME_CAPTURE_HANDLE;
	
		public static final long DEVICE_THREAD_BYTE_OFFSET;
		public static final long OPERATION_EVENT_BYTE_OFFSET;
		public static final long OPERATION_COMPLETION_EVENT_BYTE_OFFSET;
		public static final long OPERATION_SEMAPHORE_BYTE_OFFSET;
		public static final long OPERATION_BYTE_OFFSET;
		public static final long OPERATION_RESULT_BYTE_OFFSET;
		public static final long TIMER_BYTE_OFFSET;
		public static final long PRIOR_RUN_TIME_BYTE_OFFSET;
		public static final long CURRENT_PERIOD_FRAMES_REMAINING_PLAYBACK_BYTE_OFFSET;
		public static final long CURRENT_PERIOD_FRAMES_REMAINING_CAPTURE_BYTE_OFFSET;
		public static final long LAST_PROCESSED_FRAME_PLAYBACK_BYTE_OFFSET;
		public static final long LAST_PROCESSED_FRAME_CAPTURE_BYTE_OFFSET;
		public static final long IS_STARTED_BYTE_OFFSET;
	
		private final MemorySegment segment;
	
		private final MaTimer timer;
		private final MaAtomicBool32 isStarted;
	
		static {
			//@formatter:off
			LAYOUT = MemoryLayout.structLayout(
			    UNBOUNDED_ADDRESS.withName("deviceThread"),
			    UNBOUNDED_ADDRESS.withName("operationEvent"),
			    UNBOUNDED_ADDRESS.withName("operationCompletionEvent"),
			    UNBOUNDED_ADDRESS.withName("operationSemaphore"),
			    JAVA_INT.withName("operation"),
			    JAVA_INT.withName("operationResult"),
			    MaTimer.LAYOUT.withName("timer"),
			    JAVA_DOUBLE.withName("priorRunTime"),
			    JAVA_INT.withName("currentPeriodFramesRemainingPlayback"),
			    JAVA_INT.withName("currentPeriodFramesRemainingCapture"),
			    JAVA_LONG.withName("lastProcessedFramePlayback"),
			    JAVA_LONG.withName("lastProcessedFrameCapture"),
			    MaAtomicBool32.LAYOUT.withName("isStarted"),
			    MemoryLayout.paddingLayout(4)
			).withName("Null_device").withByteAlignment(8);
			
			DEVICE_THREAD_HANDLE = LAYOUT.varHandle(PathElement.groupElement("deviceThread"));
			OPERATION_EVENT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("operationEvent"));
			OPERATION_COMPLETION_EVENT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("operationCompletionEvent"));
			OPERATION_SEMAPHORE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("operationSemaphore"));
			OPERATION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("operation"));
			OPERATION_RESULT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("operationResult"));
			PRIOR_RUN_TIME_HANDLE = LAYOUT.varHandle(PathElement.groupElement("priorRunTime"));
			CURRENT_PERIOD_FRAMES_REMAINING_PLAYBACK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("currentPeriodFramesRemainingPlayback"));
			CURRENT_PERIOD_FRAMES_REMAINING_CAPTURE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("currentPeriodFramesRemainingCapture"));
			LAST_PROCESSED_FRAME_PLAYBACK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("lastProcessedFramePlayback"));
			LAST_PROCESSED_FRAME_CAPTURE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("lastProcessedFrameCapture"));
			
			DEVICE_THREAD_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("deviceThread"));
			OPERATION_EVENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("operationEvent"));
			OPERATION_COMPLETION_EVENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("operationCompletionEvent"));
			OPERATION_SEMAPHORE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("operationSemaphore"));
			OPERATION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("operation"));
			OPERATION_RESULT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("operationResult"));
			TIMER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("timer"));
			PRIOR_RUN_TIME_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("priorRunTime"));
			CURRENT_PERIOD_FRAMES_REMAINING_PLAYBACK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("currentPeriodFramesRemainingPlayback"));
			CURRENT_PERIOD_FRAMES_REMAINING_CAPTURE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("currentPeriodFramesRemainingCapture"));
			LAST_PROCESSED_FRAME_PLAYBACK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("lastProcessedFramePlayback"));
			LAST_PROCESSED_FRAME_CAPTURE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("lastProcessedFrameCapture"));
			IS_STARTED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("isStarted"));
			//@formatter:on
		}
	
		public Null_device() {
		    this(Arena.ofAuto());
		}
		
		public Null_device(Arena arena) {
		    this(arena.allocate(LAYOUT));
		}
		
		public Null_device(MemorySegment segment) {
		    this.segment = segment;
		
		    timer = new MaTimer(segment.asSlice(TIMER_BYTE_OFFSET, MaTimer.LAYOUT));
		    isStarted = new MaAtomicBool32(segment.asSlice(IS_STARTED_BYTE_OFFSET, MaAtomicBool32.LAYOUT));
		}
	
	    /// @see #deviceThread()
	    public Null_device deviceThread(MemorySegment deviceThread) {
	    	DEVICE_THREAD_HANDLE.set(segment, 0L, deviceThread);
	    	return this;
	    }
	    
	    public @Nullable MemorySegment deviceThread() {
	    	MemorySegment segment = (MemorySegment) DEVICE_THREAD_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return segment;
	    }
	    
	    /// @see #operationEvent()
	    public Null_device operationEvent(MemorySegment operationEvent) {
	    	OPERATION_EVENT_HANDLE.set(segment, 0L, operationEvent);
	    	return this;
	    }
	    
	    public @Nullable MemorySegment operationEvent() {
	    	MemorySegment segment = (MemorySegment) OPERATION_EVENT_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return segment;
	    }
	    
	    /// @see #operationCompletionEvent()
	    public Null_device operationCompletionEvent(MemorySegment operationCompletionEvent) {
	    	OPERATION_COMPLETION_EVENT_HANDLE.set(segment, 0L, operationCompletionEvent);
	    	return this;
	    }
	    
	    public @Nullable MemorySegment operationCompletionEvent() {
	    	MemorySegment segment = (MemorySegment) OPERATION_COMPLETION_EVENT_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return segment;
	    }
	    
	    /// @see #operationSemaphore()
	    public Null_device operationSemaphore(MemorySegment operationSemaphore) {
	    	OPERATION_SEMAPHORE_HANDLE.set(segment, 0L, operationSemaphore);
	    	return this;
	    }
	    
	    public @Nullable MemorySegment operationSemaphore() {
	    	MemorySegment segment = (MemorySegment) OPERATION_SEMAPHORE_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return segment;
	    }
	    
	    /// @see #operation()
	    public Null_device operation(int operation) {
	    	OPERATION_HANDLE.set(segment, 0L, operation);
	    	return this;
	    }
	    
	    public int operation() {
	    	return (int) OPERATION_HANDLE.get(segment, 0L);
	    }
	    
	    /// @see #operationResult()
	    public Null_device operationResult(int operationResult) {
	    	OPERATION_RESULT_HANDLE.set(segment, 0L, operationResult);
	    	return this;
	    }
	    
	    public int operationResult() {
	    	return (int) OPERATION_RESULT_HANDLE.get(segment, 0L);
	    }
	    
	    /// @see #timer()
	    public Null_device timer(Consumer<MaTimer> consumer) {
	    	consumer.accept(timer);
	    	return this;
	    }
	    
	    /// @see #timer()
	    public Null_device timer(MaTimer other) {
	    	timer.set(other);
	    	return this;
	    }
	    
	    public MaTimer timer() {
	    	return timer;
	    }
	    
	    /// @see #priorRunTime()
	    public Null_device priorRunTime(double priorRunTime) {
	    	PRIOR_RUN_TIME_HANDLE.set(segment, 0L, priorRunTime);
	    	return this;
	    }
	    
	    public double priorRunTime() {
	    	return (double) PRIOR_RUN_TIME_HANDLE.get(segment, 0L);
	    }
	    
	    /// @see #currentPeriodFramesRemainingPlayback()
	    public Null_device currentPeriodFramesRemainingPlayback(int currentPeriodFramesRemainingPlayback) {
	    	CURRENT_PERIOD_FRAMES_REMAINING_PLAYBACK_HANDLE.set(segment, 0L, currentPeriodFramesRemainingPlayback);
	    	return this;
	    }
	    
	    public int currentPeriodFramesRemainingPlayback() {
	    	return (int) CURRENT_PERIOD_FRAMES_REMAINING_PLAYBACK_HANDLE.get(segment, 0L);
	    }
	    
	    /// @see #currentPeriodFramesRemainingCapture()
	    public Null_device currentPeriodFramesRemainingCapture(int currentPeriodFramesRemainingCapture) {
	    	CURRENT_PERIOD_FRAMES_REMAINING_CAPTURE_HANDLE.set(segment, 0L, currentPeriodFramesRemainingCapture);
	    	return this;
	    }
	    
	    public int currentPeriodFramesRemainingCapture() {
	    	return (int) CURRENT_PERIOD_FRAMES_REMAINING_CAPTURE_HANDLE.get(segment, 0L);
	    }
	    
	    /// @see #lastProcessedFramePlayback()
	    public Null_device lastProcessedFramePlayback(long lastProcessedFramePlayback) {
	    	LAST_PROCESSED_FRAME_PLAYBACK_HANDLE.set(segment, 0L, lastProcessedFramePlayback);
	    	return this;
	    }
	    
	    public long lastProcessedFramePlayback() {
	    	return (long) LAST_PROCESSED_FRAME_PLAYBACK_HANDLE.get(segment, 0L);
	    }
	    
	    /// @see #lastProcessedFrameCapture()
	    public Null_device lastProcessedFrameCapture(long lastProcessedFrameCapture) {
	    	LAST_PROCESSED_FRAME_CAPTURE_HANDLE.set(segment, 0L, lastProcessedFrameCapture);
	    	return this;
	    }
	    
	    public long lastProcessedFrameCapture() {
	    	return (long) LAST_PROCESSED_FRAME_CAPTURE_HANDLE.get(segment, 0L);
	    }
	    
	    /// @see #isStarted()
	    public Null_device isStarted(Consumer<MaAtomicBool32> consumer) {
	    	consumer.accept(isStarted);
	    	return this;
	    }
	    
	    /// @see #isStarted()
	    public Null_device isStarted(MaAtomicBool32 other) {
	    	isStarted.set(other);
	    	return this;
	    }
	    
	    public MaAtomicBool32 isStarted() {
	    	return isStarted;
	    }
	    
	    @Override
	    public Null_device set(Null_device other) {
	        return set(other.segment);
	    }
	    
	    @Override
	    public Null_device set(MemorySegment src) {
	        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
	        return this;
	    }
	    
	    @Override
	    public MemorySegment memorySegment() {
	        return segment;
	    }
	    
	    public NativeStructArray<Null_device> asArray() {
	        return new NativeStructArray<>(this);
	    }
	    
	    public static NativeStructArray<Null_device> array(Arena arena, int count) {
	        return new NativeStructArray<>(
	            arena,
	            LAYOUT,
	            segment -> new Null_device(segment),
	            count
	        );
	    }
	    
	    public static NativeStructArray<Null_device> array(Arena arena, Null_device... structs) {
	        NativeStructArray<Null_device> array = new NativeStructArray<>(
	            arena,
	            LAYOUT,
	            segment -> new Null_device(segment),
	            structs.length
	        );
	    
	        for (int i = 0; i < structs.length; i++) {
	            array.set(i, structs[i]);
	        }
	    
	        return array;
	    }
	    
	    public static NativeStructArray<Null_device> array(MemorySegment array) {
	        return new NativeStructArray<>(
	            array,
	            LAYOUT,
	            segment -> new Null_device(segment)
	        );
	    }
	
	}
}