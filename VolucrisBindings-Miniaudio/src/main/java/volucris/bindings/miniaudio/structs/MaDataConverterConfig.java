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
import volucris.bindings.core.NativePointerArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/// ```
/// ***********************************************************************************************************************************************************
/// 
/// Data Conversion
/// 
/// ************************************************************************************************************************************************************
/// ```
public final class MaDataConverterConfig
		implements Struct<MaDataConverterConfig> {

	public static final StructLayout LAYOUT;

	public static final VarHandle FORMAT_IN_HANDLE;
	public static final VarHandle FORMAT_OUT_HANDLE;
	public static final VarHandle CHANNELS_IN_HANDLE;
	public static final VarHandle CHANNELS_OUT_HANDLE;
	public static final VarHandle SAMPLE_RATE_IN_HANDLE;
	public static final VarHandle SAMPLE_RATE_OUT_HANDLE;
	public static final VarHandle P_CHANNEL_MAP_IN_HANDLE;
	public static final VarHandle P_CHANNEL_MAP_OUT_HANDLE;
	public static final VarHandle DITHER_MODE_HANDLE;
	public static final VarHandle CHANNEL_MIX_MODE_HANDLE;
	public static final VarHandle CALCULATE_LFEFROM_SPATIAL_CHANNELS_HANDLE;
	public static final VarHandle PP_CHANNEL_WEIGHTS_HANDLE;
	public static final VarHandle ALLOW_DYNAMIC_SAMPLE_RATE_HANDLE;

	public static final long FORMAT_IN_BYTE_OFFSET;
	public static final long FORMAT_OUT_BYTE_OFFSET;
	public static final long CHANNELS_IN_BYTE_OFFSET;
	public static final long CHANNELS_OUT_BYTE_OFFSET;
	public static final long SAMPLE_RATE_IN_BYTE_OFFSET;
	public static final long SAMPLE_RATE_OUT_BYTE_OFFSET;
	public static final long P_CHANNEL_MAP_IN_BYTE_OFFSET;
	public static final long P_CHANNEL_MAP_OUT_BYTE_OFFSET;
	public static final long DITHER_MODE_BYTE_OFFSET;
	public static final long CHANNEL_MIX_MODE_BYTE_OFFSET;
	public static final long CALCULATE_LFEFROM_SPATIAL_CHANNELS_BYTE_OFFSET;
	public static final long PP_CHANNEL_WEIGHTS_BYTE_OFFSET;
	public static final long ALLOW_DYNAMIC_SAMPLE_RATE_BYTE_OFFSET;
	public static final long RESAMPLING_BYTE_OFFSET;

	private final MemorySegment segment;

	private final MaResamplerConfig resampling;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("formatIn"),
		    JAVA_INT.withName("formatOut"),
		    JAVA_INT.withName("channelsIn"),
		    JAVA_INT.withName("channelsOut"),
		    JAVA_INT.withName("sampleRateIn"),
		    JAVA_INT.withName("sampleRateOut"),
		    UNBOUNDED_ADDRESS.withName("pChannelMapIn"),
		    UNBOUNDED_ADDRESS.withName("pChannelMapOut"),
		    JAVA_INT.withName("ditherMode"),
		    JAVA_INT.withName("channelMixMode"),
		    JAVA_INT.withName("calculateLFEFromSpatialChannels"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("ppChannelWeights"),
		    JAVA_INT.withName("allowDynamicSampleRate"),
		    MemoryLayout.paddingLayout(4),
		    MaResamplerConfig.LAYOUT.withName("resampling")
		).withName("ma_data_converter_config").withByteAlignment(8);
		
		FORMAT_IN_HANDLE = LAYOUT.varHandle(PathElement.groupElement("formatIn"));
		FORMAT_OUT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("formatOut"));
		CHANNELS_IN_HANDLE = LAYOUT.varHandle(PathElement.groupElement("channelsIn"));
		CHANNELS_OUT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("channelsOut"));
		SAMPLE_RATE_IN_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sampleRateIn"));
		SAMPLE_RATE_OUT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sampleRateOut"));
		P_CHANNEL_MAP_IN_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pChannelMapIn"));
		P_CHANNEL_MAP_OUT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pChannelMapOut"));
		DITHER_MODE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("ditherMode"));
		CHANNEL_MIX_MODE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("channelMixMode"));
		CALCULATE_LFEFROM_SPATIAL_CHANNELS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("calculateLFEFromSpatialChannels"));
		PP_CHANNEL_WEIGHTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("ppChannelWeights"));
		ALLOW_DYNAMIC_SAMPLE_RATE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("allowDynamicSampleRate"));
		
		FORMAT_IN_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("formatIn"));
		FORMAT_OUT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("formatOut"));
		CHANNELS_IN_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("channelsIn"));
		CHANNELS_OUT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("channelsOut"));
		SAMPLE_RATE_IN_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sampleRateIn"));
		SAMPLE_RATE_OUT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sampleRateOut"));
		P_CHANNEL_MAP_IN_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pChannelMapIn"));
		P_CHANNEL_MAP_OUT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pChannelMapOut"));
		DITHER_MODE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("ditherMode"));
		CHANNEL_MIX_MODE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("channelMixMode"));
		CALCULATE_LFEFROM_SPATIAL_CHANNELS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("calculateLFEFromSpatialChannels"));
		PP_CHANNEL_WEIGHTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("ppChannelWeights"));
		ALLOW_DYNAMIC_SAMPLE_RATE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("allowDynamicSampleRate"));
		RESAMPLING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("resampling"));
		//@formatter:on
	}

	public MaDataConverterConfig() {
	    this(Arena.ofAuto());
	}
	
	public MaDataConverterConfig(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public MaDataConverterConfig(MemorySegment segment) {
	    this.segment = segment;
	
	    resampling = new MaResamplerConfig(segment.asSlice(RESAMPLING_BYTE_OFFSET, MaResamplerConfig.LAYOUT));
	}

    /// @see #formatIn()
    public MaDataConverterConfig formatIn(int formatIn) {
    	FORMAT_IN_HANDLE.set(segment, 0L, formatIn);
    	return this;
    }
    
    public int formatIn() {
    	return (int) FORMAT_IN_HANDLE.get(segment, 0L);
    }
    
    /// @see #formatOut()
    public MaDataConverterConfig formatOut(int formatOut) {
    	FORMAT_OUT_HANDLE.set(segment, 0L, formatOut);
    	return this;
    }
    
    public int formatOut() {
    	return (int) FORMAT_OUT_HANDLE.get(segment, 0L);
    }
    
    /// @see #channelsIn()
    public MaDataConverterConfig channelsIn(int channelsIn) {
    	CHANNELS_IN_HANDLE.set(segment, 0L, channelsIn);
    	return this;
    }
    
    public int channelsIn() {
    	return (int) CHANNELS_IN_HANDLE.get(segment, 0L);
    }
    
    /// @see #channelsOut()
    public MaDataConverterConfig channelsOut(int channelsOut) {
    	CHANNELS_OUT_HANDLE.set(segment, 0L, channelsOut);
    	return this;
    }
    
    public int channelsOut() {
    	return (int) CHANNELS_OUT_HANDLE.get(segment, 0L);
    }
    
    /// @see #sampleRateIn()
    public MaDataConverterConfig sampleRateIn(int sampleRateIn) {
    	SAMPLE_RATE_IN_HANDLE.set(segment, 0L, sampleRateIn);
    	return this;
    }
    
    public int sampleRateIn() {
    	return (int) SAMPLE_RATE_IN_HANDLE.get(segment, 0L);
    }
    
    /// @see #sampleRateOut()
    public MaDataConverterConfig sampleRateOut(int sampleRateOut) {
    	SAMPLE_RATE_OUT_HANDLE.set(segment, 0L, sampleRateOut);
    	return this;
    }
    
    public int sampleRateOut() {
    	return (int) SAMPLE_RATE_OUT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pChannelMapIn()
    public MaDataConverterConfig pChannelMapIn(NativeByteArray pChannelMapIn) {
    	P_CHANNEL_MAP_IN_HANDLE.set(segment, 0L, pChannelMapIn.memorySegment());
    	return this;
    }
    
    public @Nullable NativeByteArray pChannelMapIn() {
    	MemorySegment segment = (MemorySegment) P_CHANNEL_MAP_IN_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeByteArray(segment);
    }
    
    /// @see #pChannelMapOut()
    public MaDataConverterConfig pChannelMapOut(NativeByteArray pChannelMapOut) {
    	P_CHANNEL_MAP_OUT_HANDLE.set(segment, 0L, pChannelMapOut.memorySegment());
    	return this;
    }
    
    public @Nullable NativeByteArray pChannelMapOut() {
    	MemorySegment segment = (MemorySegment) P_CHANNEL_MAP_OUT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeByteArray(segment);
    }
    
    /// @see #ditherMode()
    public MaDataConverterConfig ditherMode(int ditherMode) {
    	DITHER_MODE_HANDLE.set(segment, 0L, ditherMode);
    	return this;
    }
    
    public int ditherMode() {
    	return (int) DITHER_MODE_HANDLE.get(segment, 0L);
    }
    
    /// @see #channelMixMode()
    public MaDataConverterConfig channelMixMode(int channelMixMode) {
    	CHANNEL_MIX_MODE_HANDLE.set(segment, 0L, channelMixMode);
    	return this;
    }
    
    public int channelMixMode() {
    	return (int) CHANNEL_MIX_MODE_HANDLE.get(segment, 0L);
    }
    
    /// @see #calculateLFEFromSpatialChannels()
    public MaDataConverterConfig calculateLFEFromSpatialChannels(int calculateLFEFromSpatialChannels) {
    	CALCULATE_LFEFROM_SPATIAL_CHANNELS_HANDLE.set(segment, 0L, calculateLFEFromSpatialChannels);
    	return this;
    }
    
    public int calculateLFEFromSpatialChannels() {
    	return (int) CALCULATE_LFEFROM_SPATIAL_CHANNELS_HANDLE.get(segment, 0L);
    }
    
    /// @see #ppChannelWeights()
    public MaDataConverterConfig ppChannelWeights(NativePointerArray ppChannelWeights) {
    	PP_CHANNEL_WEIGHTS_HANDLE.set(segment, 0L, ppChannelWeights.memorySegment());
    	return this;
    }
    
    public @Nullable NativePointerArray ppChannelWeights() {
    	MemorySegment segment = (MemorySegment) PP_CHANNEL_WEIGHTS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativePointerArray(segment);
    }
    
    /// @see #allowDynamicSampleRate()
    public MaDataConverterConfig allowDynamicSampleRate(int allowDynamicSampleRate) {
    	ALLOW_DYNAMIC_SAMPLE_RATE_HANDLE.set(segment, 0L, allowDynamicSampleRate);
    	return this;
    }
    
    public int allowDynamicSampleRate() {
    	return (int) ALLOW_DYNAMIC_SAMPLE_RATE_HANDLE.get(segment, 0L);
    }
    
    /// @see #resampling()
    public MaDataConverterConfig resampling(Consumer<MaResamplerConfig> consumer) {
    	consumer.accept(resampling);
    	return this;
    }
    
    /// @see #resampling()
    public MaDataConverterConfig resampling(MaResamplerConfig other) {
    	resampling.set(other);
    	return this;
    }
    
    public MaResamplerConfig resampling() {
    	return resampling;
    }
    
    @Override
    public MaDataConverterConfig set(MaDataConverterConfig other) {
        return set(other.segment);
    }
    
    @Override
    public MaDataConverterConfig set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaDataConverterConfig> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaDataConverterConfig> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaDataConverterConfig(segment),
            count
        );
    }
    
    public static NativeStructArray<MaDataConverterConfig> array(Arena arena, MaDataConverterConfig... structs) {
        NativeStructArray<MaDataConverterConfig> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaDataConverterConfig(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaDataConverterConfig> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaDataConverterConfig(segment)
        );
    }

}