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
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.miniaudio.callbacks.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class MaEngineConfig
		implements Struct<MaEngineConfig> {

	public static final StructLayout LAYOUT;

	public static final VarHandle P_RESOURCE_MANAGER_HANDLE;
	public static final VarHandle P_CONTEXT_HANDLE;
	public static final VarHandle P_DEVICE_HANDLE;
	public static final VarHandle P_PLAYBACK_DEVICE_ID_HANDLE;
	public static final VarHandle DATA_CALLBACK_HANDLE;
	public static final VarHandle NOTIFICATION_CALLBACK_HANDLE;
	public static final VarHandle P_LOG_HANDLE;
	public static final VarHandle LISTENER_COUNT_HANDLE;
	public static final VarHandle CHANNELS_HANDLE;
	public static final VarHandle SAMPLE_RATE_HANDLE;
	public static final VarHandle PERIOD_SIZE_IN_FRAMES_HANDLE;
	public static final VarHandle PERIOD_SIZE_IN_MILLISECONDS_HANDLE;
	public static final VarHandle GAIN_SMOOTH_TIME_IN_FRAMES_HANDLE;
	public static final VarHandle GAIN_SMOOTH_TIME_IN_MILLISECONDS_HANDLE;
	public static final VarHandle DEFAULT_VOLUME_SMOOTH_TIME_IN_PCMFRAMES_HANDLE;
	public static final VarHandle PRE_MIX_STACK_SIZE_IN_BYTES_HANDLE;
	public static final VarHandle NO_AUTO_START_HANDLE;
	public static final VarHandle NO_DEVICE_HANDLE;
	public static final VarHandle MONO_EXPANSION_MODE_HANDLE;
	public static final VarHandle P_RESOURCE_MANAGER_VFS_HANDLE;
	public static final VarHandle ON_PROCESS_HANDLE;
	public static final VarHandle P_PROCESS_USER_DATA_HANDLE;

	public static final long P_RESOURCE_MANAGER_BYTE_OFFSET;
	public static final long P_CONTEXT_BYTE_OFFSET;
	public static final long P_DEVICE_BYTE_OFFSET;
	public static final long P_PLAYBACK_DEVICE_ID_BYTE_OFFSET;
	public static final long DATA_CALLBACK_BYTE_OFFSET;
	public static final long NOTIFICATION_CALLBACK_BYTE_OFFSET;
	public static final long P_LOG_BYTE_OFFSET;
	public static final long LISTENER_COUNT_BYTE_OFFSET;
	public static final long CHANNELS_BYTE_OFFSET;
	public static final long SAMPLE_RATE_BYTE_OFFSET;
	public static final long PERIOD_SIZE_IN_FRAMES_BYTE_OFFSET;
	public static final long PERIOD_SIZE_IN_MILLISECONDS_BYTE_OFFSET;
	public static final long GAIN_SMOOTH_TIME_IN_FRAMES_BYTE_OFFSET;
	public static final long GAIN_SMOOTH_TIME_IN_MILLISECONDS_BYTE_OFFSET;
	public static final long DEFAULT_VOLUME_SMOOTH_TIME_IN_PCMFRAMES_BYTE_OFFSET;
	public static final long PRE_MIX_STACK_SIZE_IN_BYTES_BYTE_OFFSET;
	public static final long ALLOCATION_CALLBACKS_BYTE_OFFSET;
	public static final long NO_AUTO_START_BYTE_OFFSET;
	public static final long NO_DEVICE_BYTE_OFFSET;
	public static final long MONO_EXPANSION_MODE_BYTE_OFFSET;
	public static final long P_RESOURCE_MANAGER_VFS_BYTE_OFFSET;
	public static final long ON_PROCESS_BYTE_OFFSET;
	public static final long P_PROCESS_USER_DATA_BYTE_OFFSET;
	public static final long RESOURCE_MANAGER_RESAMPLING_BYTE_OFFSET;
	public static final long PITCH_RESAMPLING_BYTE_OFFSET;

	private final MemorySegment segment;

	private final MaAllocationCallbacks allocationCallbacks;
	private final MaResamplerConfig resourceManagerResampling;
	private final MaResamplerConfig pitchResampling;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    UNBOUNDED_ADDRESS.withName("pResourceManager"),
		    UNBOUNDED_ADDRESS.withName("pContext"),
		    UNBOUNDED_ADDRESS.withName("pDevice"),
		    UNBOUNDED_ADDRESS.withName("pPlaybackDeviceID"),
		    UNBOUNDED_ADDRESS.withName("dataCallback"),
		    UNBOUNDED_ADDRESS.withName("notificationCallback"),
		    UNBOUNDED_ADDRESS.withName("pLog"),
		    JAVA_INT.withName("listenerCount"),
		    JAVA_INT.withName("channels"),
		    JAVA_INT.withName("sampleRate"),
		    JAVA_INT.withName("periodSizeInFrames"),
		    JAVA_INT.withName("periodSizeInMilliseconds"),
		    JAVA_INT.withName("gainSmoothTimeInFrames"),
		    JAVA_INT.withName("gainSmoothTimeInMilliseconds"),
		    JAVA_INT.withName("defaultVolumeSmoothTimeInPCMFrames"),
		    JAVA_INT.withName("preMixStackSizeInBytes"),
		    MemoryLayout.paddingLayout(4),
		    MaAllocationCallbacks.LAYOUT.withName("allocationCallbacks"),
		    JAVA_INT.withName("noAutoStart"),
		    JAVA_INT.withName("noDevice"),
		    JAVA_INT.withName("monoExpansionMode"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pResourceManagerVFS"),
		    UNBOUNDED_ADDRESS.withName("onProcess"),
		    UNBOUNDED_ADDRESS.withName("pProcessUserData"),
		    MaResamplerConfig.LAYOUT.withName("resourceManagerResampling"),
		    MaResamplerConfig.LAYOUT.withName("pitchResampling")
		).withName("ma_engine_config").withByteAlignment(8);
		
		P_RESOURCE_MANAGER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pResourceManager"));
		P_CONTEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pContext"));
		P_DEVICE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pDevice"));
		P_PLAYBACK_DEVICE_ID_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pPlaybackDeviceID"));
		DATA_CALLBACK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("dataCallback"));
		NOTIFICATION_CALLBACK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("notificationCallback"));
		P_LOG_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pLog"));
		LISTENER_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("listenerCount"));
		CHANNELS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("channels"));
		SAMPLE_RATE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sampleRate"));
		PERIOD_SIZE_IN_FRAMES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("periodSizeInFrames"));
		PERIOD_SIZE_IN_MILLISECONDS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("periodSizeInMilliseconds"));
		GAIN_SMOOTH_TIME_IN_FRAMES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("gainSmoothTimeInFrames"));
		GAIN_SMOOTH_TIME_IN_MILLISECONDS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("gainSmoothTimeInMilliseconds"));
		DEFAULT_VOLUME_SMOOTH_TIME_IN_PCMFRAMES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("defaultVolumeSmoothTimeInPCMFrames"));
		PRE_MIX_STACK_SIZE_IN_BYTES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("preMixStackSizeInBytes"));
		NO_AUTO_START_HANDLE = LAYOUT.varHandle(PathElement.groupElement("noAutoStart"));
		NO_DEVICE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("noDevice"));
		MONO_EXPANSION_MODE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("monoExpansionMode"));
		P_RESOURCE_MANAGER_VFS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pResourceManagerVFS"));
		ON_PROCESS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("onProcess"));
		P_PROCESS_USER_DATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pProcessUserData"));
		
		P_RESOURCE_MANAGER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pResourceManager"));
		P_CONTEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pContext"));
		P_DEVICE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pDevice"));
		P_PLAYBACK_DEVICE_ID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pPlaybackDeviceID"));
		DATA_CALLBACK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dataCallback"));
		NOTIFICATION_CALLBACK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("notificationCallback"));
		P_LOG_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pLog"));
		LISTENER_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("listenerCount"));
		CHANNELS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("channels"));
		SAMPLE_RATE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sampleRate"));
		PERIOD_SIZE_IN_FRAMES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("periodSizeInFrames"));
		PERIOD_SIZE_IN_MILLISECONDS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("periodSizeInMilliseconds"));
		GAIN_SMOOTH_TIME_IN_FRAMES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("gainSmoothTimeInFrames"));
		GAIN_SMOOTH_TIME_IN_MILLISECONDS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("gainSmoothTimeInMilliseconds"));
		DEFAULT_VOLUME_SMOOTH_TIME_IN_PCMFRAMES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("defaultVolumeSmoothTimeInPCMFrames"));
		PRE_MIX_STACK_SIZE_IN_BYTES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("preMixStackSizeInBytes"));
		ALLOCATION_CALLBACKS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("allocationCallbacks"));
		NO_AUTO_START_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("noAutoStart"));
		NO_DEVICE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("noDevice"));
		MONO_EXPANSION_MODE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("monoExpansionMode"));
		P_RESOURCE_MANAGER_VFS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pResourceManagerVFS"));
		ON_PROCESS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("onProcess"));
		P_PROCESS_USER_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pProcessUserData"));
		RESOURCE_MANAGER_RESAMPLING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("resourceManagerResampling"));
		PITCH_RESAMPLING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pitchResampling"));
		//@formatter:on
	}

	public MaEngineConfig() {
	    this(Arena.ofAuto());
	}
	
	public MaEngineConfig(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public MaEngineConfig(MemorySegment segment) {
	    this.segment = segment;
	
	    allocationCallbacks = new MaAllocationCallbacks(segment.asSlice(ALLOCATION_CALLBACKS_BYTE_OFFSET, MaAllocationCallbacks.LAYOUT));
	    resourceManagerResampling = new MaResamplerConfig(segment.asSlice(RESOURCE_MANAGER_RESAMPLING_BYTE_OFFSET, MaResamplerConfig.LAYOUT));
	    pitchResampling = new MaResamplerConfig(segment.asSlice(PITCH_RESAMPLING_BYTE_OFFSET, MaResamplerConfig.LAYOUT));
	}

    /// @see #pResourceManager()
    public MaEngineConfig pResourceManager(MaResourceManager pResourceManager) {
    	P_RESOURCE_MANAGER_HANDLE.set(segment, 0L, pResourceManager.memorySegment());
    	return this;
    }
    
    public @Nullable MaResourceManager pResourceManager() {
    	MemorySegment segment = (MemorySegment) P_RESOURCE_MANAGER_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaResourceManager(segment);
    }
    
    /// @see #pContext()
    public MaEngineConfig pContext(MaContext pContext) {
    	P_CONTEXT_HANDLE.set(segment, 0L, pContext.memorySegment());
    	return this;
    }
    
    public @Nullable MaContext pContext() {
    	MemorySegment segment = (MemorySegment) P_CONTEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaContext(segment);
    }
    
    /// @see #pDevice()
    public MaEngineConfig pDevice(MaDevice pDevice) {
    	P_DEVICE_HANDLE.set(segment, 0L, pDevice.memorySegment());
    	return this;
    }
    
    public @Nullable MaDevice pDevice() {
    	MemorySegment segment = (MemorySegment) P_DEVICE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaDevice(segment);
    }
    
    /// @see #pPlaybackDeviceID()
    public MaEngineConfig pPlaybackDeviceID(MaDeviceId pPlaybackDeviceID) {
    	P_PLAYBACK_DEVICE_ID_HANDLE.set(segment, 0L, pPlaybackDeviceID.memorySegment());
    	return this;
    }
    
    public @Nullable MaDeviceId pPlaybackDeviceID() {
    	MemorySegment segment = (MemorySegment) P_PLAYBACK_DEVICE_ID_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaDeviceId(segment);
    }
    
    /// @see #dataCallback()
    public MaEngineConfig dataCallback(MaDeviceDataProc dataCallback) {
    	DATA_CALLBACK_HANDLE.set(segment, 0L, dataCallback.memorySegment());
    	return this;
    }
    
    public @Nullable MaDeviceDataProc dataCallback() {
    	MemorySegment segment = (MemorySegment) DATA_CALLBACK_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return MaDeviceDataProc.get(segment);
    }
    
    /// @see #notificationCallback()
    public MaEngineConfig notificationCallback(MaDeviceNotificationProc notificationCallback) {
    	NOTIFICATION_CALLBACK_HANDLE.set(segment, 0L, notificationCallback.memorySegment());
    	return this;
    }
    
    public @Nullable MaDeviceNotificationProc notificationCallback() {
    	MemorySegment segment = (MemorySegment) NOTIFICATION_CALLBACK_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return MaDeviceNotificationProc.get(segment);
    }
    
    /// @see #pLog()
    public MaEngineConfig pLog(MaLog pLog) {
    	P_LOG_HANDLE.set(segment, 0L, pLog.memorySegment());
    	return this;
    }
    
    public @Nullable MaLog pLog() {
    	MemorySegment segment = (MemorySegment) P_LOG_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaLog(segment);
    }
    
    /// @see #listenerCount()
    public MaEngineConfig listenerCount(int listenerCount) {
    	LISTENER_COUNT_HANDLE.set(segment, 0L, listenerCount);
    	return this;
    }
    
    public int listenerCount() {
    	return (int) LISTENER_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #channels()
    public MaEngineConfig channels(int channels) {
    	CHANNELS_HANDLE.set(segment, 0L, channels);
    	return this;
    }
    
    public int channels() {
    	return (int) CHANNELS_HANDLE.get(segment, 0L);
    }
    
    /// @see #sampleRate()
    public MaEngineConfig sampleRate(int sampleRate) {
    	SAMPLE_RATE_HANDLE.set(segment, 0L, sampleRate);
    	return this;
    }
    
    public int sampleRate() {
    	return (int) SAMPLE_RATE_HANDLE.get(segment, 0L);
    }
    
    /// @see #periodSizeInFrames()
    public MaEngineConfig periodSizeInFrames(int periodSizeInFrames) {
    	PERIOD_SIZE_IN_FRAMES_HANDLE.set(segment, 0L, periodSizeInFrames);
    	return this;
    }
    
    public int periodSizeInFrames() {
    	return (int) PERIOD_SIZE_IN_FRAMES_HANDLE.get(segment, 0L);
    }
    
    /// @see #periodSizeInMilliseconds()
    public MaEngineConfig periodSizeInMilliseconds(int periodSizeInMilliseconds) {
    	PERIOD_SIZE_IN_MILLISECONDS_HANDLE.set(segment, 0L, periodSizeInMilliseconds);
    	return this;
    }
    
    public int periodSizeInMilliseconds() {
    	return (int) PERIOD_SIZE_IN_MILLISECONDS_HANDLE.get(segment, 0L);
    }
    
    /// @see #gainSmoothTimeInFrames()
    public MaEngineConfig gainSmoothTimeInFrames(int gainSmoothTimeInFrames) {
    	GAIN_SMOOTH_TIME_IN_FRAMES_HANDLE.set(segment, 0L, gainSmoothTimeInFrames);
    	return this;
    }
    
    public int gainSmoothTimeInFrames() {
    	return (int) GAIN_SMOOTH_TIME_IN_FRAMES_HANDLE.get(segment, 0L);
    }
    
    /// @see #gainSmoothTimeInMilliseconds()
    public MaEngineConfig gainSmoothTimeInMilliseconds(int gainSmoothTimeInMilliseconds) {
    	GAIN_SMOOTH_TIME_IN_MILLISECONDS_HANDLE.set(segment, 0L, gainSmoothTimeInMilliseconds);
    	return this;
    }
    
    public int gainSmoothTimeInMilliseconds() {
    	return (int) GAIN_SMOOTH_TIME_IN_MILLISECONDS_HANDLE.get(segment, 0L);
    }
    
    /// @see #defaultVolumeSmoothTimeInPCMFrames()
    public MaEngineConfig defaultVolumeSmoothTimeInPCMFrames(int defaultVolumeSmoothTimeInPCMFrames) {
    	DEFAULT_VOLUME_SMOOTH_TIME_IN_PCMFRAMES_HANDLE.set(segment, 0L, defaultVolumeSmoothTimeInPCMFrames);
    	return this;
    }
    
    public int defaultVolumeSmoothTimeInPCMFrames() {
    	return (int) DEFAULT_VOLUME_SMOOTH_TIME_IN_PCMFRAMES_HANDLE.get(segment, 0L);
    }
    
    /// @see #preMixStackSizeInBytes()
    public MaEngineConfig preMixStackSizeInBytes(int preMixStackSizeInBytes) {
    	PRE_MIX_STACK_SIZE_IN_BYTES_HANDLE.set(segment, 0L, preMixStackSizeInBytes);
    	return this;
    }
    
    public int preMixStackSizeInBytes() {
    	return (int) PRE_MIX_STACK_SIZE_IN_BYTES_HANDLE.get(segment, 0L);
    }
    
    /// @see #allocationCallbacks()
    public MaEngineConfig allocationCallbacks(Consumer<MaAllocationCallbacks> consumer) {
    	consumer.accept(allocationCallbacks);
    	return this;
    }
    
    /// @see #allocationCallbacks()
    public MaEngineConfig allocationCallbacks(MaAllocationCallbacks other) {
    	allocationCallbacks.set(other);
    	return this;
    }
    
    public MaAllocationCallbacks allocationCallbacks() {
    	return allocationCallbacks;
    }
    
    /// @see #noAutoStart()
    public MaEngineConfig noAutoStart(int noAutoStart) {
    	NO_AUTO_START_HANDLE.set(segment, 0L, noAutoStart);
    	return this;
    }
    
    public int noAutoStart() {
    	return (int) NO_AUTO_START_HANDLE.get(segment, 0L);
    }
    
    /// @see #noDevice()
    public MaEngineConfig noDevice(int noDevice) {
    	NO_DEVICE_HANDLE.set(segment, 0L, noDevice);
    	return this;
    }
    
    public int noDevice() {
    	return (int) NO_DEVICE_HANDLE.get(segment, 0L);
    }
    
    /// @see #monoExpansionMode()
    public MaEngineConfig monoExpansionMode(int monoExpansionMode) {
    	MONO_EXPANSION_MODE_HANDLE.set(segment, 0L, monoExpansionMode);
    	return this;
    }
    
    public int monoExpansionMode() {
    	return (int) MONO_EXPANSION_MODE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pResourceManagerVFS()
    public MaEngineConfig pResourceManagerVFS(MemorySegment pResourceManagerVFS) {
    	P_RESOURCE_MANAGER_VFS_HANDLE.set(segment, 0L, pResourceManagerVFS);
    	return this;
    }
    
    public @Nullable MemorySegment pResourceManagerVFS() {
    	MemorySegment segment = (MemorySegment) P_RESOURCE_MANAGER_VFS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #onProcess()
    public MaEngineConfig onProcess(MaEngineProcessProc onProcess) {
    	ON_PROCESS_HANDLE.set(segment, 0L, onProcess.memorySegment());
    	return this;
    }
    
    public @Nullable MaEngineProcessProc onProcess() {
    	MemorySegment segment = (MemorySegment) ON_PROCESS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return MaEngineProcessProc.get(segment);
    }
    
    /// @see #pProcessUserData()
    public MaEngineConfig pProcessUserData(MemorySegment pProcessUserData) {
    	P_PROCESS_USER_DATA_HANDLE.set(segment, 0L, pProcessUserData);
    	return this;
    }
    
    public @Nullable MemorySegment pProcessUserData() {
    	MemorySegment segment = (MemorySegment) P_PROCESS_USER_DATA_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #resourceManagerResampling()
    public MaEngineConfig resourceManagerResampling(Consumer<MaResamplerConfig> consumer) {
    	consumer.accept(resourceManagerResampling);
    	return this;
    }
    
    /// @see #resourceManagerResampling()
    public MaEngineConfig resourceManagerResampling(MaResamplerConfig other) {
    	resourceManagerResampling.set(other);
    	return this;
    }
    
    public MaResamplerConfig resourceManagerResampling() {
    	return resourceManagerResampling;
    }
    
    /// @see #pitchResampling()
    public MaEngineConfig pitchResampling(Consumer<MaResamplerConfig> consumer) {
    	consumer.accept(pitchResampling);
    	return this;
    }
    
    /// @see #pitchResampling()
    public MaEngineConfig pitchResampling(MaResamplerConfig other) {
    	pitchResampling.set(other);
    	return this;
    }
    
    public MaResamplerConfig pitchResampling() {
    	return pitchResampling;
    }
    
    @Override
    public MaEngineConfig set(MaEngineConfig other) {
        return set(other.segment);
    }
    
    @Override
    public MaEngineConfig set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaEngineConfig> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaEngineConfig> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaEngineConfig(segment),
            count
        );
    }
    
    public static NativeStructArray<MaEngineConfig> array(Arena arena, MaEngineConfig... structs) {
        NativeStructArray<MaEngineConfig> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaEngineConfig(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaEngineConfig> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaEngineConfig(segment)
        );
    }

}