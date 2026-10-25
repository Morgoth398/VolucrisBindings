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
import volucris.bindings.miniaudio.callbacks.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class MaDeviceConfig
		implements Struct<MaDeviceConfig> {

	public static final StructLayout LAYOUT;

	public static final VarHandle DEVICE_TYPE_HANDLE;
	public static final VarHandle SAMPLE_RATE_HANDLE;
	public static final VarHandle PERIOD_SIZE_IN_FRAMES_HANDLE;
	public static final VarHandle PERIOD_SIZE_IN_MILLISECONDS_HANDLE;
	public static final VarHandle PERIODS_HANDLE;
	public static final VarHandle PERFORMANCE_PROFILE_HANDLE;
	public static final VarHandle NO_PRE_SILENCED_OUTPUT_BUFFER_HANDLE;
	public static final VarHandle NO_CLIP_HANDLE;
	public static final VarHandle NO_DISABLE_DENORMALS_HANDLE;
	public static final VarHandle NO_FIXED_SIZED_CALLBACK_HANDLE;
	public static final VarHandle DATA_CALLBACK_HANDLE;
	public static final VarHandle NOTIFICATION_CALLBACK_HANDLE;
	public static final VarHandle STOP_CALLBACK_HANDLE;
	public static final VarHandle P_USER_DATA_HANDLE;

	public static final long DEVICE_TYPE_BYTE_OFFSET;
	public static final long SAMPLE_RATE_BYTE_OFFSET;
	public static final long PERIOD_SIZE_IN_FRAMES_BYTE_OFFSET;
	public static final long PERIOD_SIZE_IN_MILLISECONDS_BYTE_OFFSET;
	public static final long PERIODS_BYTE_OFFSET;
	public static final long PERFORMANCE_PROFILE_BYTE_OFFSET;
	public static final long NO_PRE_SILENCED_OUTPUT_BUFFER_BYTE_OFFSET;
	public static final long NO_CLIP_BYTE_OFFSET;
	public static final long NO_DISABLE_DENORMALS_BYTE_OFFSET;
	public static final long NO_FIXED_SIZED_CALLBACK_BYTE_OFFSET;
	public static final long DATA_CALLBACK_BYTE_OFFSET;
	public static final long NOTIFICATION_CALLBACK_BYTE_OFFSET;
	public static final long STOP_CALLBACK_BYTE_OFFSET;
	public static final long P_USER_DATA_BYTE_OFFSET;
	public static final long RESAMPLING_BYTE_OFFSET;
	public static final long PLAYBACK_BYTE_OFFSET;
	public static final long CAPTURE_BYTE_OFFSET;
	public static final long WASAPI_BYTE_OFFSET;
	public static final long ALSA_BYTE_OFFSET;
	public static final long PULSE_BYTE_OFFSET;
	public static final long COREAUDIO_BYTE_OFFSET;
	public static final long OPENSL_BYTE_OFFSET;
	public static final long AAUDIO_BYTE_OFFSET;

	private final MemorySegment segment;

	private final MaResamplerConfig resampling;
	private final Playback playback;
	private final Capture capture;
	private final Wasapi wasapi;
	private final Alsa alsa;
	private final Pulse pulse;
	private final Coreaudio coreaudio;
	private final Opensl opensl;
	private final Aaudio aaudio;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("deviceType"),
		    JAVA_INT.withName("sampleRate"),
		    JAVA_INT.withName("periodSizeInFrames"),
		    JAVA_INT.withName("periodSizeInMilliseconds"),
		    JAVA_INT.withName("periods"),
		    JAVA_INT.withName("performanceProfile"),
		    JAVA_BYTE.withName("noPreSilencedOutputBuffer"),
		    JAVA_BYTE.withName("noClip"),
		    JAVA_BYTE.withName("noDisableDenormals"),
		    JAVA_BYTE.withName("noFixedSizedCallback"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("dataCallback"),
		    UNBOUNDED_ADDRESS.withName("notificationCallback"),
		    UNBOUNDED_ADDRESS.withName("stopCallback"),
		    UNBOUNDED_ADDRESS.withName("pUserData"),
		    MaResamplerConfig.LAYOUT.withName("resampling"),
		    Playback.LAYOUT.withName("playback"),
		    Capture.LAYOUT.withName("capture"),
		    Wasapi.LAYOUT.withName("wasapi"),
		    Alsa.LAYOUT.withName("alsa"),
		    Pulse.LAYOUT.withName("pulse"),
		    Coreaudio.LAYOUT.withName("coreaudio"),
		    Opensl.LAYOUT.withName("opensl"),
		    Aaudio.LAYOUT.withName("aaudio"),
		    MemoryLayout.paddingLayout(4)
		).withName("ma_device_config").withByteAlignment(8);
		
		DEVICE_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("deviceType"));
		SAMPLE_RATE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sampleRate"));
		PERIOD_SIZE_IN_FRAMES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("periodSizeInFrames"));
		PERIOD_SIZE_IN_MILLISECONDS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("periodSizeInMilliseconds"));
		PERIODS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("periods"));
		PERFORMANCE_PROFILE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("performanceProfile"));
		NO_PRE_SILENCED_OUTPUT_BUFFER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("noPreSilencedOutputBuffer"));
		NO_CLIP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("noClip"));
		NO_DISABLE_DENORMALS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("noDisableDenormals"));
		NO_FIXED_SIZED_CALLBACK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("noFixedSizedCallback"));
		DATA_CALLBACK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("dataCallback"));
		NOTIFICATION_CALLBACK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("notificationCallback"));
		STOP_CALLBACK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("stopCallback"));
		P_USER_DATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pUserData"));
		
		DEVICE_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("deviceType"));
		SAMPLE_RATE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sampleRate"));
		PERIOD_SIZE_IN_FRAMES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("periodSizeInFrames"));
		PERIOD_SIZE_IN_MILLISECONDS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("periodSizeInMilliseconds"));
		PERIODS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("periods"));
		PERFORMANCE_PROFILE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("performanceProfile"));
		NO_PRE_SILENCED_OUTPUT_BUFFER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("noPreSilencedOutputBuffer"));
		NO_CLIP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("noClip"));
		NO_DISABLE_DENORMALS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("noDisableDenormals"));
		NO_FIXED_SIZED_CALLBACK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("noFixedSizedCallback"));
		DATA_CALLBACK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dataCallback"));
		NOTIFICATION_CALLBACK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("notificationCallback"));
		STOP_CALLBACK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("stopCallback"));
		P_USER_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pUserData"));
		RESAMPLING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("resampling"));
		PLAYBACK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("playback"));
		CAPTURE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("capture"));
		WASAPI_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("wasapi"));
		ALSA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("alsa"));
		PULSE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pulse"));
		COREAUDIO_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("coreaudio"));
		OPENSL_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("opensl"));
		AAUDIO_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("aaudio"));
		//@formatter:on
	}

	public MaDeviceConfig() {
	    this(Arena.ofAuto());
	}
	
	public MaDeviceConfig(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public MaDeviceConfig(MemorySegment segment) {
	    this.segment = segment;
	
	    resampling = new MaResamplerConfig(segment.asSlice(RESAMPLING_BYTE_OFFSET, MaResamplerConfig.LAYOUT));
	    playback = new Playback(segment.asSlice(PLAYBACK_BYTE_OFFSET, Playback.LAYOUT));
	    capture = new Capture(segment.asSlice(CAPTURE_BYTE_OFFSET, Capture.LAYOUT));
	    wasapi = new Wasapi(segment.asSlice(WASAPI_BYTE_OFFSET, Wasapi.LAYOUT));
	    alsa = new Alsa(segment.asSlice(ALSA_BYTE_OFFSET, Alsa.LAYOUT));
	    pulse = new Pulse(segment.asSlice(PULSE_BYTE_OFFSET, Pulse.LAYOUT));
	    coreaudio = new Coreaudio(segment.asSlice(COREAUDIO_BYTE_OFFSET, Coreaudio.LAYOUT));
	    opensl = new Opensl(segment.asSlice(OPENSL_BYTE_OFFSET, Opensl.LAYOUT));
	    aaudio = new Aaudio(segment.asSlice(AAUDIO_BYTE_OFFSET, Aaudio.LAYOUT));
	}

    /// @see #deviceType()
    public MaDeviceConfig deviceType(int deviceType) {
    	DEVICE_TYPE_HANDLE.set(segment, 0L, deviceType);
    	return this;
    }
    
    public int deviceType() {
    	return (int) DEVICE_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #sampleRate()
    public MaDeviceConfig sampleRate(int sampleRate) {
    	SAMPLE_RATE_HANDLE.set(segment, 0L, sampleRate);
    	return this;
    }
    
    public int sampleRate() {
    	return (int) SAMPLE_RATE_HANDLE.get(segment, 0L);
    }
    
    /// @see #periodSizeInFrames()
    public MaDeviceConfig periodSizeInFrames(int periodSizeInFrames) {
    	PERIOD_SIZE_IN_FRAMES_HANDLE.set(segment, 0L, periodSizeInFrames);
    	return this;
    }
    
    public int periodSizeInFrames() {
    	return (int) PERIOD_SIZE_IN_FRAMES_HANDLE.get(segment, 0L);
    }
    
    /// @see #periodSizeInMilliseconds()
    public MaDeviceConfig periodSizeInMilliseconds(int periodSizeInMilliseconds) {
    	PERIOD_SIZE_IN_MILLISECONDS_HANDLE.set(segment, 0L, periodSizeInMilliseconds);
    	return this;
    }
    
    public int periodSizeInMilliseconds() {
    	return (int) PERIOD_SIZE_IN_MILLISECONDS_HANDLE.get(segment, 0L);
    }
    
    /// @see #periods()
    public MaDeviceConfig periods(int periods) {
    	PERIODS_HANDLE.set(segment, 0L, periods);
    	return this;
    }
    
    public int periods() {
    	return (int) PERIODS_HANDLE.get(segment, 0L);
    }
    
    /// @see #performanceProfile()
    public MaDeviceConfig performanceProfile(int performanceProfile) {
    	PERFORMANCE_PROFILE_HANDLE.set(segment, 0L, performanceProfile);
    	return this;
    }
    
    public int performanceProfile() {
    	return (int) PERFORMANCE_PROFILE_HANDLE.get(segment, 0L);
    }
    
    /// @see #noPreSilencedOutputBuffer()
    public MaDeviceConfig noPreSilencedOutputBuffer(byte noPreSilencedOutputBuffer) {
    	NO_PRE_SILENCED_OUTPUT_BUFFER_HANDLE.set(segment, 0L, noPreSilencedOutputBuffer);
    	return this;
    }
    
    public byte noPreSilencedOutputBuffer() {
    	return (byte) NO_PRE_SILENCED_OUTPUT_BUFFER_HANDLE.get(segment, 0L);
    }
    
    /// @see #noClip()
    public MaDeviceConfig noClip(byte noClip) {
    	NO_CLIP_HANDLE.set(segment, 0L, noClip);
    	return this;
    }
    
    public byte noClip() {
    	return (byte) NO_CLIP_HANDLE.get(segment, 0L);
    }
    
    /// @see #noDisableDenormals()
    public MaDeviceConfig noDisableDenormals(byte noDisableDenormals) {
    	NO_DISABLE_DENORMALS_HANDLE.set(segment, 0L, noDisableDenormals);
    	return this;
    }
    
    public byte noDisableDenormals() {
    	return (byte) NO_DISABLE_DENORMALS_HANDLE.get(segment, 0L);
    }
    
    /// @see #noFixedSizedCallback()
    public MaDeviceConfig noFixedSizedCallback(byte noFixedSizedCallback) {
    	NO_FIXED_SIZED_CALLBACK_HANDLE.set(segment, 0L, noFixedSizedCallback);
    	return this;
    }
    
    public byte noFixedSizedCallback() {
    	return (byte) NO_FIXED_SIZED_CALLBACK_HANDLE.get(segment, 0L);
    }
    
    /// @see #dataCallback()
    public MaDeviceConfig dataCallback(MaDeviceDataProc dataCallback) {
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
    public MaDeviceConfig notificationCallback(MaDeviceNotificationProc notificationCallback) {
    	NOTIFICATION_CALLBACK_HANDLE.set(segment, 0L, notificationCallback.memorySegment());
    	return this;
    }
    
    public @Nullable MaDeviceNotificationProc notificationCallback() {
    	MemorySegment segment = (MemorySegment) NOTIFICATION_CALLBACK_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return MaDeviceNotificationProc.get(segment);
    }
    
    /// @see #stopCallback()
    public MaDeviceConfig stopCallback(MaStopProc stopCallback) {
    	STOP_CALLBACK_HANDLE.set(segment, 0L, stopCallback.memorySegment());
    	return this;
    }
    
    public @Nullable MaStopProc stopCallback() {
    	MemorySegment segment = (MemorySegment) STOP_CALLBACK_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return MaStopProc.get(segment);
    }
    
    /// @see #pUserData()
    public MaDeviceConfig pUserData(MemorySegment pUserData) {
    	P_USER_DATA_HANDLE.set(segment, 0L, pUserData);
    	return this;
    }
    
    public @Nullable MemorySegment pUserData() {
    	MemorySegment segment = (MemorySegment) P_USER_DATA_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #resampling()
    public MaDeviceConfig resampling(Consumer<MaResamplerConfig> consumer) {
    	consumer.accept(resampling);
    	return this;
    }
    
    /// @see #resampling()
    public MaDeviceConfig resampling(MaResamplerConfig other) {
    	resampling.set(other);
    	return this;
    }
    
    public MaResamplerConfig resampling() {
    	return resampling;
    }
    
    /// @see #playback()
    public MaDeviceConfig playback(Consumer<Playback> consumer) {
    	consumer.accept(playback);
    	return this;
    }
    
    /// @see #playback()
    public MaDeviceConfig playback(Playback other) {
    	playback.set(other);
    	return this;
    }
    
    public Playback playback() {
    	return playback;
    }
    
    /// @see #capture()
    public MaDeviceConfig capture(Consumer<Capture> consumer) {
    	consumer.accept(capture);
    	return this;
    }
    
    /// @see #capture()
    public MaDeviceConfig capture(Capture other) {
    	capture.set(other);
    	return this;
    }
    
    public Capture capture() {
    	return capture;
    }
    
    /// @see #wasapi()
    public MaDeviceConfig wasapi(Consumer<Wasapi> consumer) {
    	consumer.accept(wasapi);
    	return this;
    }
    
    /// @see #wasapi()
    public MaDeviceConfig wasapi(Wasapi other) {
    	wasapi.set(other);
    	return this;
    }
    
    public Wasapi wasapi() {
    	return wasapi;
    }
    
    /// @see #alsa()
    public MaDeviceConfig alsa(Consumer<Alsa> consumer) {
    	consumer.accept(alsa);
    	return this;
    }
    
    /// @see #alsa()
    public MaDeviceConfig alsa(Alsa other) {
    	alsa.set(other);
    	return this;
    }
    
    public Alsa alsa() {
    	return alsa;
    }
    
    /// @see #pulse()
    public MaDeviceConfig pulse(Consumer<Pulse> consumer) {
    	consumer.accept(pulse);
    	return this;
    }
    
    /// @see #pulse()
    public MaDeviceConfig pulse(Pulse other) {
    	pulse.set(other);
    	return this;
    }
    
    public Pulse pulse() {
    	return pulse;
    }
    
    /// @see #coreaudio()
    public MaDeviceConfig coreaudio(Consumer<Coreaudio> consumer) {
    	consumer.accept(coreaudio);
    	return this;
    }
    
    /// @see #coreaudio()
    public MaDeviceConfig coreaudio(Coreaudio other) {
    	coreaudio.set(other);
    	return this;
    }
    
    public Coreaudio coreaudio() {
    	return coreaudio;
    }
    
    /// @see #opensl()
    public MaDeviceConfig opensl(Consumer<Opensl> consumer) {
    	consumer.accept(opensl);
    	return this;
    }
    
    /// @see #opensl()
    public MaDeviceConfig opensl(Opensl other) {
    	opensl.set(other);
    	return this;
    }
    
    public Opensl opensl() {
    	return opensl;
    }
    
    /// @see #aaudio()
    public MaDeviceConfig aaudio(Consumer<Aaudio> consumer) {
    	consumer.accept(aaudio);
    	return this;
    }
    
    /// @see #aaudio()
    public MaDeviceConfig aaudio(Aaudio other) {
    	aaudio.set(other);
    	return this;
    }
    
    public Aaudio aaudio() {
    	return aaudio;
    }
    
    @Override
    public MaDeviceConfig set(MaDeviceConfig other) {
        return set(other.segment);
    }
    
    @Override
    public MaDeviceConfig set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaDeviceConfig> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaDeviceConfig> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaDeviceConfig(segment),
            count
        );
    }
    
    public static NativeStructArray<MaDeviceConfig> array(SegmentAllocator allocator, MaDeviceConfig... structs) {
        NativeStructArray<MaDeviceConfig> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaDeviceConfig(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaDeviceConfig> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaDeviceConfig(segment)
        );
    }

	public static class Playback implements Struct<Playback> {
	
		public static final StructLayout LAYOUT;
	
		public static final VarHandle P_DEVICE_ID_HANDLE;
		public static final VarHandle FORMAT_HANDLE;
		public static final VarHandle CHANNELS_HANDLE;
		public static final VarHandle P_CHANNEL_MAP_HANDLE;
		public static final VarHandle CHANNEL_MIX_MODE_HANDLE;
		public static final VarHandle CALCULATE_LFEFROM_SPATIAL_CHANNELS_HANDLE;
		public static final VarHandle SHARE_MODE_HANDLE;
	
		public static final long P_DEVICE_ID_BYTE_OFFSET;
		public static final long FORMAT_BYTE_OFFSET;
		public static final long CHANNELS_BYTE_OFFSET;
		public static final long P_CHANNEL_MAP_BYTE_OFFSET;
		public static final long CHANNEL_MIX_MODE_BYTE_OFFSET;
		public static final long CALCULATE_LFEFROM_SPATIAL_CHANNELS_BYTE_OFFSET;
		public static final long SHARE_MODE_BYTE_OFFSET;
	
		private final MemorySegment segment;
	
		static {
			//@formatter:off
			LAYOUT = MemoryLayout.structLayout(
			    UNBOUNDED_ADDRESS.withName("pDeviceID"),
			    JAVA_INT.withName("format"),
			    JAVA_INT.withName("channels"),
			    UNBOUNDED_ADDRESS.withName("pChannelMap"),
			    JAVA_INT.withName("channelMixMode"),
			    JAVA_INT.withName("calculateLFEFromSpatialChannels"),
			    JAVA_INT.withName("shareMode"),
			    MemoryLayout.paddingLayout(4)
			).withName("Playback").withByteAlignment(8);
			
			P_DEVICE_ID_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pDeviceID"));
			FORMAT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("format"));
			CHANNELS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("channels"));
			P_CHANNEL_MAP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pChannelMap"));
			CHANNEL_MIX_MODE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("channelMixMode"));
			CALCULATE_LFEFROM_SPATIAL_CHANNELS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("calculateLFEFromSpatialChannels"));
			SHARE_MODE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shareMode"));
			
			P_DEVICE_ID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pDeviceID"));
			FORMAT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("format"));
			CHANNELS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("channels"));
			P_CHANNEL_MAP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pChannelMap"));
			CHANNEL_MIX_MODE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("channelMixMode"));
			CALCULATE_LFEFROM_SPATIAL_CHANNELS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("calculateLFEFromSpatialChannels"));
			SHARE_MODE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shareMode"));
			//@formatter:on
		}
	
		public Playback() {
		    this(Arena.ofAuto());
		}
		
		public Playback(SegmentAllocator allocator) {
		    this(allocator.allocate(LAYOUT));
		}
		
		public Playback(MemorySegment segment) {
		    this.segment = segment;
		
		}
	
	    /// @see #pDeviceID()
	    public Playback pDeviceID(MaDeviceId pDeviceID) {
	    	P_DEVICE_ID_HANDLE.set(segment, 0L, pDeviceID.memorySegment());
	    	return this;
	    }
	    
	    public @Nullable MaDeviceId pDeviceID() {
	    	MemorySegment segment = (MemorySegment) P_DEVICE_ID_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return new MaDeviceId(segment);
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
	    
	    /// @see #pChannelMap()
	    public Playback pChannelMap(NativeByteArray pChannelMap) {
	    	P_CHANNEL_MAP_HANDLE.set(segment, 0L, pChannelMap.memorySegment());
	    	return this;
	    }
	    
	    public @Nullable NativeByteArray pChannelMap() {
	    	MemorySegment segment = (MemorySegment) P_CHANNEL_MAP_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return new NativeByteArray(segment);
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
	    
	    /// @see #shareMode()
	    public Playback shareMode(int shareMode) {
	    	SHARE_MODE_HANDLE.set(segment, 0L, shareMode);
	    	return this;
	    }
	    
	    public int shareMode() {
	    	return (int) SHARE_MODE_HANDLE.get(segment, 0L);
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
	    
	    public static NativeStructArray<Playback> array(SegmentAllocator allocator, int count) {
	        return new NativeStructArray<>(
	            allocator,
	            LAYOUT,
	            segment -> new Playback(segment),
	            count
	        );
	    }
	    
	    public static NativeStructArray<Playback> array(SegmentAllocator allocator, Playback... structs) {
	        NativeStructArray<Playback> array = new NativeStructArray<>(
	            allocator,
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
	
		public static final VarHandle P_DEVICE_ID_HANDLE;
		public static final VarHandle FORMAT_HANDLE;
		public static final VarHandle CHANNELS_HANDLE;
		public static final VarHandle P_CHANNEL_MAP_HANDLE;
		public static final VarHandle CHANNEL_MIX_MODE_HANDLE;
		public static final VarHandle CALCULATE_LFEFROM_SPATIAL_CHANNELS_HANDLE;
		public static final VarHandle SHARE_MODE_HANDLE;
	
		public static final long P_DEVICE_ID_BYTE_OFFSET;
		public static final long FORMAT_BYTE_OFFSET;
		public static final long CHANNELS_BYTE_OFFSET;
		public static final long P_CHANNEL_MAP_BYTE_OFFSET;
		public static final long CHANNEL_MIX_MODE_BYTE_OFFSET;
		public static final long CALCULATE_LFEFROM_SPATIAL_CHANNELS_BYTE_OFFSET;
		public static final long SHARE_MODE_BYTE_OFFSET;
	
		private final MemorySegment segment;
	
		static {
			//@formatter:off
			LAYOUT = MemoryLayout.structLayout(
			    UNBOUNDED_ADDRESS.withName("pDeviceID"),
			    JAVA_INT.withName("format"),
			    JAVA_INT.withName("channels"),
			    UNBOUNDED_ADDRESS.withName("pChannelMap"),
			    JAVA_INT.withName("channelMixMode"),
			    JAVA_INT.withName("calculateLFEFromSpatialChannels"),
			    JAVA_INT.withName("shareMode"),
			    MemoryLayout.paddingLayout(4)
			).withName("Capture").withByteAlignment(8);
			
			P_DEVICE_ID_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pDeviceID"));
			FORMAT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("format"));
			CHANNELS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("channels"));
			P_CHANNEL_MAP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pChannelMap"));
			CHANNEL_MIX_MODE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("channelMixMode"));
			CALCULATE_LFEFROM_SPATIAL_CHANNELS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("calculateLFEFromSpatialChannels"));
			SHARE_MODE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shareMode"));
			
			P_DEVICE_ID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pDeviceID"));
			FORMAT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("format"));
			CHANNELS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("channels"));
			P_CHANNEL_MAP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pChannelMap"));
			CHANNEL_MIX_MODE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("channelMixMode"));
			CALCULATE_LFEFROM_SPATIAL_CHANNELS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("calculateLFEFromSpatialChannels"));
			SHARE_MODE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shareMode"));
			//@formatter:on
		}
	
		public Capture() {
		    this(Arena.ofAuto());
		}
		
		public Capture(SegmentAllocator allocator) {
		    this(allocator.allocate(LAYOUT));
		}
		
		public Capture(MemorySegment segment) {
		    this.segment = segment;
		
		}
	
	    /// @see #pDeviceID()
	    public Capture pDeviceID(MaDeviceId pDeviceID) {
	    	P_DEVICE_ID_HANDLE.set(segment, 0L, pDeviceID.memorySegment());
	    	return this;
	    }
	    
	    public @Nullable MaDeviceId pDeviceID() {
	    	MemorySegment segment = (MemorySegment) P_DEVICE_ID_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return new MaDeviceId(segment);
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
	    
	    /// @see #pChannelMap()
	    public Capture pChannelMap(NativeByteArray pChannelMap) {
	    	P_CHANNEL_MAP_HANDLE.set(segment, 0L, pChannelMap.memorySegment());
	    	return this;
	    }
	    
	    public @Nullable NativeByteArray pChannelMap() {
	    	MemorySegment segment = (MemorySegment) P_CHANNEL_MAP_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return new NativeByteArray(segment);
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
	    
	    /// @see #shareMode()
	    public Capture shareMode(int shareMode) {
	    	SHARE_MODE_HANDLE.set(segment, 0L, shareMode);
	    	return this;
	    }
	    
	    public int shareMode() {
	    	return (int) SHARE_MODE_HANDLE.get(segment, 0L);
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
	    
	    public static NativeStructArray<Capture> array(SegmentAllocator allocator, int count) {
	        return new NativeStructArray<>(
	            allocator,
	            LAYOUT,
	            segment -> new Capture(segment),
	            count
	        );
	    }
	    
	    public static NativeStructArray<Capture> array(SegmentAllocator allocator, Capture... structs) {
	        NativeStructArray<Capture> array = new NativeStructArray<>(
	            allocator,
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
	
		public static final VarHandle USAGE_HANDLE;
		public static final VarHandle NO_AUTO_CONVERT_SRC_HANDLE;
		public static final VarHandle NO_DEFAULT_QUALITY_SRC_HANDLE;
		public static final VarHandle NO_AUTO_STREAM_ROUTING_HANDLE;
		public static final VarHandle NO_HARDWARE_OFFLOADING_HANDLE;
		public static final VarHandle LOOPBACK_PROCESS_ID_HANDLE;
		public static final VarHandle LOOPBACK_PROCESS_EXCLUDE_HANDLE;
	
		public static final long USAGE_BYTE_OFFSET;
		public static final long NO_AUTO_CONVERT_SRC_BYTE_OFFSET;
		public static final long NO_DEFAULT_QUALITY_SRC_BYTE_OFFSET;
		public static final long NO_AUTO_STREAM_ROUTING_BYTE_OFFSET;
		public static final long NO_HARDWARE_OFFLOADING_BYTE_OFFSET;
		public static final long LOOPBACK_PROCESS_ID_BYTE_OFFSET;
		public static final long LOOPBACK_PROCESS_EXCLUDE_BYTE_OFFSET;
	
		private final MemorySegment segment;
	
		static {
			//@formatter:off
			LAYOUT = MemoryLayout.structLayout(
			    JAVA_INT.withName("usage"),
			    JAVA_BYTE.withName("noAutoConvertSRC"),
			    JAVA_BYTE.withName("noDefaultQualitySRC"),
			    JAVA_BYTE.withName("noAutoStreamRouting"),
			    JAVA_BYTE.withName("noHardwareOffloading"),
			    JAVA_INT.withName("loopbackProcessID"),
			    JAVA_BYTE.withName("loopbackProcessExclude"),
			    MemoryLayout.paddingLayout(3)
			).withName("Wasapi").withByteAlignment(4);
			
			USAGE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("usage"));
			NO_AUTO_CONVERT_SRC_HANDLE = LAYOUT.varHandle(PathElement.groupElement("noAutoConvertSRC"));
			NO_DEFAULT_QUALITY_SRC_HANDLE = LAYOUT.varHandle(PathElement.groupElement("noDefaultQualitySRC"));
			NO_AUTO_STREAM_ROUTING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("noAutoStreamRouting"));
			NO_HARDWARE_OFFLOADING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("noHardwareOffloading"));
			LOOPBACK_PROCESS_ID_HANDLE = LAYOUT.varHandle(PathElement.groupElement("loopbackProcessID"));
			LOOPBACK_PROCESS_EXCLUDE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("loopbackProcessExclude"));
			
			USAGE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("usage"));
			NO_AUTO_CONVERT_SRC_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("noAutoConvertSRC"));
			NO_DEFAULT_QUALITY_SRC_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("noDefaultQualitySRC"));
			NO_AUTO_STREAM_ROUTING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("noAutoStreamRouting"));
			NO_HARDWARE_OFFLOADING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("noHardwareOffloading"));
			LOOPBACK_PROCESS_ID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("loopbackProcessID"));
			LOOPBACK_PROCESS_EXCLUDE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("loopbackProcessExclude"));
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
		
		}
	
	    /// @see #usage()
	    public Wasapi usage(int usage) {
	    	USAGE_HANDLE.set(segment, 0L, usage);
	    	return this;
	    }
	    
	    public int usage() {
	    	return (int) USAGE_HANDLE.get(segment, 0L);
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
	    
	    /// @see #noAutoStreamRouting()
	    public Wasapi noAutoStreamRouting(byte noAutoStreamRouting) {
	    	NO_AUTO_STREAM_ROUTING_HANDLE.set(segment, 0L, noAutoStreamRouting);
	    	return this;
	    }
	    
	    public byte noAutoStreamRouting() {
	    	return (byte) NO_AUTO_STREAM_ROUTING_HANDLE.get(segment, 0L);
	    }
	    
	    /// @see #noHardwareOffloading()
	    public Wasapi noHardwareOffloading(byte noHardwareOffloading) {
	    	NO_HARDWARE_OFFLOADING_HANDLE.set(segment, 0L, noHardwareOffloading);
	    	return this;
	    }
	    
	    public byte noHardwareOffloading() {
	    	return (byte) NO_HARDWARE_OFFLOADING_HANDLE.get(segment, 0L);
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
    
	public static class Alsa implements Struct<Alsa> {
	
		public static final StructLayout LAYOUT;
	
		public static final VarHandle NO_MMAP_HANDLE;
		public static final VarHandle NO_AUTO_FORMAT_HANDLE;
		public static final VarHandle NO_AUTO_CHANNELS_HANDLE;
		public static final VarHandle NO_AUTO_RESAMPLE_HANDLE;
	
		public static final long NO_MMAP_BYTE_OFFSET;
		public static final long NO_AUTO_FORMAT_BYTE_OFFSET;
		public static final long NO_AUTO_CHANNELS_BYTE_OFFSET;
		public static final long NO_AUTO_RESAMPLE_BYTE_OFFSET;
	
		private final MemorySegment segment;
	
		static {
			//@formatter:off
			LAYOUT = MemoryLayout.structLayout(
			    JAVA_INT.withName("noMMap"),
			    JAVA_INT.withName("noAutoFormat"),
			    JAVA_INT.withName("noAutoChannels"),
			    JAVA_INT.withName("noAutoResample")
			).withName("Alsa").withByteAlignment(4);
			
			NO_MMAP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("noMMap"));
			NO_AUTO_FORMAT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("noAutoFormat"));
			NO_AUTO_CHANNELS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("noAutoChannels"));
			NO_AUTO_RESAMPLE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("noAutoResample"));
			
			NO_MMAP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("noMMap"));
			NO_AUTO_FORMAT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("noAutoFormat"));
			NO_AUTO_CHANNELS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("noAutoChannels"));
			NO_AUTO_RESAMPLE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("noAutoResample"));
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
	
	    /// @see #noMMap()
	    public Alsa noMMap(int noMMap) {
	    	NO_MMAP_HANDLE.set(segment, 0L, noMMap);
	    	return this;
	    }
	    
	    public int noMMap() {
	    	return (int) NO_MMAP_HANDLE.get(segment, 0L);
	    }
	    
	    /// @see #noAutoFormat()
	    public Alsa noAutoFormat(int noAutoFormat) {
	    	NO_AUTO_FORMAT_HANDLE.set(segment, 0L, noAutoFormat);
	    	return this;
	    }
	    
	    public int noAutoFormat() {
	    	return (int) NO_AUTO_FORMAT_HANDLE.get(segment, 0L);
	    }
	    
	    /// @see #noAutoChannels()
	    public Alsa noAutoChannels(int noAutoChannels) {
	    	NO_AUTO_CHANNELS_HANDLE.set(segment, 0L, noAutoChannels);
	    	return this;
	    }
	    
	    public int noAutoChannels() {
	    	return (int) NO_AUTO_CHANNELS_HANDLE.get(segment, 0L);
	    }
	    
	    /// @see #noAutoResample()
	    public Alsa noAutoResample(int noAutoResample) {
	    	NO_AUTO_RESAMPLE_HANDLE.set(segment, 0L, noAutoResample);
	    	return this;
	    }
	    
	    public int noAutoResample() {
	    	return (int) NO_AUTO_RESAMPLE_HANDLE.get(segment, 0L);
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
	
		public static final VarHandle P_STREAM_NAME_PLAYBACK_HANDLE;
		public static final VarHandle P_STREAM_NAME_CAPTURE_HANDLE;
		public static final VarHandle CHANNEL_MAP_HANDLE;
	
		public static final long P_STREAM_NAME_PLAYBACK_BYTE_OFFSET;
		public static final long P_STREAM_NAME_CAPTURE_BYTE_OFFSET;
		public static final long CHANNEL_MAP_BYTE_OFFSET;
	
		private final MemorySegment segment;
	
		static {
			//@formatter:off
			LAYOUT = MemoryLayout.structLayout(
			    UNBOUNDED_ADDRESS.withName("pStreamNamePlayback"),
			    UNBOUNDED_ADDRESS.withName("pStreamNameCapture"),
			    JAVA_INT.withName("channelMap"),
			    MemoryLayout.paddingLayout(4)
			).withName("Pulse").withByteAlignment(8);
			
			P_STREAM_NAME_PLAYBACK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pStreamNamePlayback"));
			P_STREAM_NAME_CAPTURE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pStreamNameCapture"));
			CHANNEL_MAP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("channelMap"));
			
			P_STREAM_NAME_PLAYBACK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pStreamNamePlayback"));
			P_STREAM_NAME_CAPTURE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pStreamNameCapture"));
			CHANNEL_MAP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("channelMap"));
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
	
	    /// @see #pStreamNamePlayback()
	    public Pulse pStreamNamePlayback(NativeByteArray pStreamNamePlayback) {
	    	P_STREAM_NAME_PLAYBACK_HANDLE.set(segment, 0L, pStreamNamePlayback.memorySegment());
	    	return this;
	    }
	    
	    public @Nullable NativeByteArray pStreamNamePlayback() {
	    	MemorySegment segment = (MemorySegment) P_STREAM_NAME_PLAYBACK_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return new NativeByteArray(segment);
	    }
	    
	    /// @see #pStreamNameCapture()
	    public Pulse pStreamNameCapture(NativeByteArray pStreamNameCapture) {
	    	P_STREAM_NAME_CAPTURE_HANDLE.set(segment, 0L, pStreamNameCapture.memorySegment());
	    	return this;
	    }
	    
	    public @Nullable NativeByteArray pStreamNameCapture() {
	    	MemorySegment segment = (MemorySegment) P_STREAM_NAME_CAPTURE_HANDLE.get(this.segment, 0L);
	    
	    	if (segment.equals(MemorySegment.NULL))
	    		return null;
	    	
	    	return new NativeByteArray(segment);
	    }
	    
	    /// @see #channelMap()
	    public Pulse channelMap(int channelMap) {
	    	CHANNEL_MAP_HANDLE.set(segment, 0L, channelMap);
	    	return this;
	    }
	    
	    public int channelMap() {
	    	return (int) CHANNEL_MAP_HANDLE.get(segment, 0L);
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
	
		public static final VarHandle ALLOW_NOMINAL_SAMPLE_RATE_CHANGE_HANDLE;
	
		public static final long ALLOW_NOMINAL_SAMPLE_RATE_CHANGE_BYTE_OFFSET;
	
		private final MemorySegment segment;
	
		static {
			//@formatter:off
			LAYOUT = MemoryLayout.structLayout(
			    JAVA_INT.withName("allowNominalSampleRateChange")
			).withName("Coreaudio").withByteAlignment(4);
			
			ALLOW_NOMINAL_SAMPLE_RATE_CHANGE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("allowNominalSampleRateChange"));
			
			ALLOW_NOMINAL_SAMPLE_RATE_CHANGE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("allowNominalSampleRateChange"));
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
	
	    /// @see #allowNominalSampleRateChange()
	    public Coreaudio allowNominalSampleRateChange(int allowNominalSampleRateChange) {
	    	ALLOW_NOMINAL_SAMPLE_RATE_CHANGE_HANDLE.set(segment, 0L, allowNominalSampleRateChange);
	    	return this;
	    }
	    
	    public int allowNominalSampleRateChange() {
	    	return (int) ALLOW_NOMINAL_SAMPLE_RATE_CHANGE_HANDLE.get(segment, 0L);
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
    
	public static class Opensl implements Struct<Opensl> {
	
		public static final StructLayout LAYOUT;
	
		public static final VarHandle STREAM_TYPE_HANDLE;
		public static final VarHandle RECORDING_PRESET_HANDLE;
		public static final VarHandle ENABLE_COMPATIBILITY_WORKAROUNDS_HANDLE;
	
		public static final long STREAM_TYPE_BYTE_OFFSET;
		public static final long RECORDING_PRESET_BYTE_OFFSET;
		public static final long ENABLE_COMPATIBILITY_WORKAROUNDS_BYTE_OFFSET;
	
		private final MemorySegment segment;
	
		static {
			//@formatter:off
			LAYOUT = MemoryLayout.structLayout(
			    JAVA_INT.withName("streamType"),
			    JAVA_INT.withName("recordingPreset"),
			    JAVA_INT.withName("enableCompatibilityWorkarounds")
			).withName("Opensl").withByteAlignment(4);
			
			STREAM_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("streamType"));
			RECORDING_PRESET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("recordingPreset"));
			ENABLE_COMPATIBILITY_WORKAROUNDS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("enableCompatibilityWorkarounds"));
			
			STREAM_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("streamType"));
			RECORDING_PRESET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("recordingPreset"));
			ENABLE_COMPATIBILITY_WORKAROUNDS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("enableCompatibilityWorkarounds"));
			//@formatter:on
		}
	
		public Opensl() {
		    this(Arena.ofAuto());
		}
		
		public Opensl(SegmentAllocator allocator) {
		    this(allocator.allocate(LAYOUT));
		}
		
		public Opensl(MemorySegment segment) {
		    this.segment = segment;
		
		}
	
	    /// @see #streamType()
	    public Opensl streamType(int streamType) {
	    	STREAM_TYPE_HANDLE.set(segment, 0L, streamType);
	    	return this;
	    }
	    
	    public int streamType() {
	    	return (int) STREAM_TYPE_HANDLE.get(segment, 0L);
	    }
	    
	    /// @see #recordingPreset()
	    public Opensl recordingPreset(int recordingPreset) {
	    	RECORDING_PRESET_HANDLE.set(segment, 0L, recordingPreset);
	    	return this;
	    }
	    
	    public int recordingPreset() {
	    	return (int) RECORDING_PRESET_HANDLE.get(segment, 0L);
	    }
	    
	    /// @see #enableCompatibilityWorkarounds()
	    public Opensl enableCompatibilityWorkarounds(int enableCompatibilityWorkarounds) {
	    	ENABLE_COMPATIBILITY_WORKAROUNDS_HANDLE.set(segment, 0L, enableCompatibilityWorkarounds);
	    	return this;
	    }
	    
	    public int enableCompatibilityWorkarounds() {
	    	return (int) ENABLE_COMPATIBILITY_WORKAROUNDS_HANDLE.get(segment, 0L);
	    }
	    
	    @Override
	    public Opensl set(Opensl other) {
	        return set(other.segment);
	    }
	    
	    @Override
	    public Opensl set(MemorySegment src) {
	        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
	        return this;
	    }
	    
	    @Override
	    public MemorySegment memorySegment() {
	        return segment;
	    }
	    
	    public NativeStructArray<Opensl> asArray() {
	        return new NativeStructArray<>(this);
	    }
	    
	    public static NativeStructArray<Opensl> array(SegmentAllocator allocator, int count) {
	        return new NativeStructArray<>(
	            allocator,
	            LAYOUT,
	            segment -> new Opensl(segment),
	            count
	        );
	    }
	    
	    public static NativeStructArray<Opensl> array(SegmentAllocator allocator, Opensl... structs) {
	        NativeStructArray<Opensl> array = new NativeStructArray<>(
	            allocator,
	            LAYOUT,
	            segment -> new Opensl(segment),
	            structs.length
	        );
	    
	        for (int i = 0; i < structs.length; i++) {
	            array.set(i, structs[i]);
	        }
	    
	        return array;
	    }
	    
	    public static NativeStructArray<Opensl> array(MemorySegment array) {
	        return new NativeStructArray<>(
	            array,
	            LAYOUT,
	            segment -> new Opensl(segment)
	        );
	    }
	
	}
    
	public static class Aaudio implements Struct<Aaudio> {
	
		public static final StructLayout LAYOUT;
	
		public static final VarHandle USAGE_HANDLE;
		public static final VarHandle CONTENT_TYPE_HANDLE;
		public static final VarHandle INPUT_PRESET_HANDLE;
		public static final VarHandle ALLOWED_CAPTURE_POLICY_HANDLE;
		public static final VarHandle NO_AUTO_START_AFTER_REROUTE_HANDLE;
		public static final VarHandle ENABLE_COMPATIBILITY_WORKAROUNDS_HANDLE;
		public static final VarHandle ALLOW_SET_BUFFER_CAPACITY_HANDLE;
	
		public static final long USAGE_BYTE_OFFSET;
		public static final long CONTENT_TYPE_BYTE_OFFSET;
		public static final long INPUT_PRESET_BYTE_OFFSET;
		public static final long ALLOWED_CAPTURE_POLICY_BYTE_OFFSET;
		public static final long NO_AUTO_START_AFTER_REROUTE_BYTE_OFFSET;
		public static final long ENABLE_COMPATIBILITY_WORKAROUNDS_BYTE_OFFSET;
		public static final long ALLOW_SET_BUFFER_CAPACITY_BYTE_OFFSET;
	
		private final MemorySegment segment;
	
		static {
			//@formatter:off
			LAYOUT = MemoryLayout.structLayout(
			    JAVA_INT.withName("usage"),
			    JAVA_INT.withName("contentType"),
			    JAVA_INT.withName("inputPreset"),
			    JAVA_INT.withName("allowedCapturePolicy"),
			    JAVA_INT.withName("noAutoStartAfterReroute"),
			    JAVA_INT.withName("enableCompatibilityWorkarounds"),
			    JAVA_INT.withName("allowSetBufferCapacity")
			).withName("Aaudio").withByteAlignment(4);
			
			USAGE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("usage"));
			CONTENT_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("contentType"));
			INPUT_PRESET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("inputPreset"));
			ALLOWED_CAPTURE_POLICY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("allowedCapturePolicy"));
			NO_AUTO_START_AFTER_REROUTE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("noAutoStartAfterReroute"));
			ENABLE_COMPATIBILITY_WORKAROUNDS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("enableCompatibilityWorkarounds"));
			ALLOW_SET_BUFFER_CAPACITY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("allowSetBufferCapacity"));
			
			USAGE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("usage"));
			CONTENT_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("contentType"));
			INPUT_PRESET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("inputPreset"));
			ALLOWED_CAPTURE_POLICY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("allowedCapturePolicy"));
			NO_AUTO_START_AFTER_REROUTE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("noAutoStartAfterReroute"));
			ENABLE_COMPATIBILITY_WORKAROUNDS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("enableCompatibilityWorkarounds"));
			ALLOW_SET_BUFFER_CAPACITY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("allowSetBufferCapacity"));
			//@formatter:on
		}
	
		public Aaudio() {
		    this(Arena.ofAuto());
		}
		
		public Aaudio(SegmentAllocator allocator) {
		    this(allocator.allocate(LAYOUT));
		}
		
		public Aaudio(MemorySegment segment) {
		    this.segment = segment;
		
		}
	
	    /// @see #usage()
	    public Aaudio usage(int usage) {
	    	USAGE_HANDLE.set(segment, 0L, usage);
	    	return this;
	    }
	    
	    public int usage() {
	    	return (int) USAGE_HANDLE.get(segment, 0L);
	    }
	    
	    /// @see #contentType()
	    public Aaudio contentType(int contentType) {
	    	CONTENT_TYPE_HANDLE.set(segment, 0L, contentType);
	    	return this;
	    }
	    
	    public int contentType() {
	    	return (int) CONTENT_TYPE_HANDLE.get(segment, 0L);
	    }
	    
	    /// @see #inputPreset()
	    public Aaudio inputPreset(int inputPreset) {
	    	INPUT_PRESET_HANDLE.set(segment, 0L, inputPreset);
	    	return this;
	    }
	    
	    public int inputPreset() {
	    	return (int) INPUT_PRESET_HANDLE.get(segment, 0L);
	    }
	    
	    /// @see #allowedCapturePolicy()
	    public Aaudio allowedCapturePolicy(int allowedCapturePolicy) {
	    	ALLOWED_CAPTURE_POLICY_HANDLE.set(segment, 0L, allowedCapturePolicy);
	    	return this;
	    }
	    
	    public int allowedCapturePolicy() {
	    	return (int) ALLOWED_CAPTURE_POLICY_HANDLE.get(segment, 0L);
	    }
	    
	    /// @see #noAutoStartAfterReroute()
	    public Aaudio noAutoStartAfterReroute(int noAutoStartAfterReroute) {
	    	NO_AUTO_START_AFTER_REROUTE_HANDLE.set(segment, 0L, noAutoStartAfterReroute);
	    	return this;
	    }
	    
	    public int noAutoStartAfterReroute() {
	    	return (int) NO_AUTO_START_AFTER_REROUTE_HANDLE.get(segment, 0L);
	    }
	    
	    /// @see #enableCompatibilityWorkarounds()
	    public Aaudio enableCompatibilityWorkarounds(int enableCompatibilityWorkarounds) {
	    	ENABLE_COMPATIBILITY_WORKAROUNDS_HANDLE.set(segment, 0L, enableCompatibilityWorkarounds);
	    	return this;
	    }
	    
	    public int enableCompatibilityWorkarounds() {
	    	return (int) ENABLE_COMPATIBILITY_WORKAROUNDS_HANDLE.get(segment, 0L);
	    }
	    
	    /// @see #allowSetBufferCapacity()
	    public Aaudio allowSetBufferCapacity(int allowSetBufferCapacity) {
	    	ALLOW_SET_BUFFER_CAPACITY_HANDLE.set(segment, 0L, allowSetBufferCapacity);
	    	return this;
	    }
	    
	    public int allowSetBufferCapacity() {
	    	return (int) ALLOW_SET_BUFFER_CAPACITY_HANDLE.get(segment, 0L);
	    }
	    
	    @Override
	    public Aaudio set(Aaudio other) {
	        return set(other.segment);
	    }
	    
	    @Override
	    public Aaudio set(MemorySegment src) {
	        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
	        return this;
	    }
	    
	    @Override
	    public MemorySegment memorySegment() {
	        return segment;
	    }
	    
	    public NativeStructArray<Aaudio> asArray() {
	        return new NativeStructArray<>(this);
	    }
	    
	    public static NativeStructArray<Aaudio> array(SegmentAllocator allocator, int count) {
	        return new NativeStructArray<>(
	            allocator,
	            LAYOUT,
	            segment -> new Aaudio(segment),
	            count
	        );
	    }
	    
	    public static NativeStructArray<Aaudio> array(SegmentAllocator allocator, Aaudio... structs) {
	        NativeStructArray<Aaudio> array = new NativeStructArray<>(
	            allocator,
	            LAYOUT,
	            segment -> new Aaudio(segment),
	            structs.length
	        );
	    
	        for (int i = 0; i < structs.length; i++) {
	            array.set(i, structs[i]);
	        }
	    
	        return array;
	    }
	    
	    public static NativeStructArray<Aaudio> array(MemorySegment array) {
	        return new NativeStructArray<>(
	            array,
	            LAYOUT,
	            segment -> new Aaudio(segment)
	        );
	    }
	
	}
}