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

public final class MaDecoderConfig
		implements Struct<MaDecoderConfig> {

	public static final StructLayout LAYOUT;

	public static final VarHandle FORMAT_HANDLE;
	public static final VarHandle CHANNELS_HANDLE;
	public static final VarHandle SAMPLE_RATE_HANDLE;
	public static final VarHandle P_CHANNEL_MAP_HANDLE;
	public static final VarHandle CHANNEL_MIX_MODE_HANDLE;
	public static final VarHandle DITHER_MODE_HANDLE;
	public static final VarHandle ENCODING_FORMAT_HANDLE;
	public static final VarHandle SEEK_POINT_COUNT_HANDLE;
	public static final VarHandle PP_CUSTOM_BACKEND_VTABLES_HANDLE;
	public static final VarHandle CUSTOM_BACKEND_COUNT_HANDLE;
	public static final VarHandle P_CUSTOM_BACKEND_USER_DATA_HANDLE;

	public static final long FORMAT_BYTE_OFFSET;
	public static final long CHANNELS_BYTE_OFFSET;
	public static final long SAMPLE_RATE_BYTE_OFFSET;
	public static final long P_CHANNEL_MAP_BYTE_OFFSET;
	public static final long CHANNEL_MIX_MODE_BYTE_OFFSET;
	public static final long DITHER_MODE_BYTE_OFFSET;
	public static final long RESAMPLING_BYTE_OFFSET;
	public static final long ALLOCATION_CALLBACKS_BYTE_OFFSET;
	public static final long ENCODING_FORMAT_BYTE_OFFSET;
	public static final long SEEK_POINT_COUNT_BYTE_OFFSET;
	public static final long PP_CUSTOM_BACKEND_VTABLES_BYTE_OFFSET;
	public static final long CUSTOM_BACKEND_COUNT_BYTE_OFFSET;
	public static final long P_CUSTOM_BACKEND_USER_DATA_BYTE_OFFSET;

	private final MemorySegment segment;

	private final MaResamplerConfig resampling;
	private final MaAllocationCallbacks allocationCallbacks;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("format"),
		    JAVA_INT.withName("channels"),
		    JAVA_INT.withName("sampleRate"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pChannelMap"),
		    JAVA_INT.withName("channelMixMode"),
		    JAVA_INT.withName("ditherMode"),
		    MaResamplerConfig.LAYOUT.withName("resampling"),
		    MaAllocationCallbacks.LAYOUT.withName("allocationCallbacks"),
		    JAVA_INT.withName("encodingFormat"),
		    JAVA_INT.withName("seekPointCount"),
		    UNBOUNDED_ADDRESS.withName("ppCustomBackendVTables"),
		    JAVA_INT.withName("customBackendCount"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pCustomBackendUserData")
		).withName("ma_decoder_config").withByteAlignment(8);
		
		FORMAT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("format"));
		CHANNELS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("channels"));
		SAMPLE_RATE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sampleRate"));
		P_CHANNEL_MAP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pChannelMap"));
		CHANNEL_MIX_MODE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("channelMixMode"));
		DITHER_MODE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("ditherMode"));
		ENCODING_FORMAT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("encodingFormat"));
		SEEK_POINT_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("seekPointCount"));
		PP_CUSTOM_BACKEND_VTABLES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("ppCustomBackendVTables"));
		CUSTOM_BACKEND_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("customBackendCount"));
		P_CUSTOM_BACKEND_USER_DATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pCustomBackendUserData"));
		
		FORMAT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("format"));
		CHANNELS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("channels"));
		SAMPLE_RATE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sampleRate"));
		P_CHANNEL_MAP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pChannelMap"));
		CHANNEL_MIX_MODE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("channelMixMode"));
		DITHER_MODE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("ditherMode"));
		RESAMPLING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("resampling"));
		ALLOCATION_CALLBACKS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("allocationCallbacks"));
		ENCODING_FORMAT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("encodingFormat"));
		SEEK_POINT_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("seekPointCount"));
		PP_CUSTOM_BACKEND_VTABLES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("ppCustomBackendVTables"));
		CUSTOM_BACKEND_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("customBackendCount"));
		P_CUSTOM_BACKEND_USER_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pCustomBackendUserData"));
		//@formatter:on
	}

	public MaDecoderConfig() {
	    this(Arena.ofAuto());
	}
	
	public MaDecoderConfig(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public MaDecoderConfig(MemorySegment segment) {
	    this.segment = segment;
	
	    resampling = new MaResamplerConfig(segment.asSlice(RESAMPLING_BYTE_OFFSET, MaResamplerConfig.LAYOUT));
	    allocationCallbacks = new MaAllocationCallbacks(segment.asSlice(ALLOCATION_CALLBACKS_BYTE_OFFSET, MaAllocationCallbacks.LAYOUT));
	}

    /// @see #format()
    public MaDecoderConfig format(int format) {
    	FORMAT_HANDLE.set(segment, 0L, format);
    	return this;
    }
    
    public int format() {
    	return (int) FORMAT_HANDLE.get(segment, 0L);
    }
    
    /// @see #channels()
    public MaDecoderConfig channels(int channels) {
    	CHANNELS_HANDLE.set(segment, 0L, channels);
    	return this;
    }
    
    public int channels() {
    	return (int) CHANNELS_HANDLE.get(segment, 0L);
    }
    
    /// @see #sampleRate()
    public MaDecoderConfig sampleRate(int sampleRate) {
    	SAMPLE_RATE_HANDLE.set(segment, 0L, sampleRate);
    	return this;
    }
    
    public int sampleRate() {
    	return (int) SAMPLE_RATE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pChannelMap()
    public MaDecoderConfig pChannelMap(NativeByteArray pChannelMap) {
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
    public MaDecoderConfig channelMixMode(int channelMixMode) {
    	CHANNEL_MIX_MODE_HANDLE.set(segment, 0L, channelMixMode);
    	return this;
    }
    
    public int channelMixMode() {
    	return (int) CHANNEL_MIX_MODE_HANDLE.get(segment, 0L);
    }
    
    /// @see #ditherMode()
    public MaDecoderConfig ditherMode(int ditherMode) {
    	DITHER_MODE_HANDLE.set(segment, 0L, ditherMode);
    	return this;
    }
    
    public int ditherMode() {
    	return (int) DITHER_MODE_HANDLE.get(segment, 0L);
    }
    
    /// @see #resampling()
    public MaDecoderConfig resampling(Consumer<MaResamplerConfig> consumer) {
    	consumer.accept(resampling);
    	return this;
    }
    
    /// @see #resampling()
    public MaDecoderConfig resampling(MaResamplerConfig other) {
    	resampling.set(other);
    	return this;
    }
    
    public MaResamplerConfig resampling() {
    	return resampling;
    }
    
    /// @see #allocationCallbacks()
    public MaDecoderConfig allocationCallbacks(Consumer<MaAllocationCallbacks> consumer) {
    	consumer.accept(allocationCallbacks);
    	return this;
    }
    
    /// @see #allocationCallbacks()
    public MaDecoderConfig allocationCallbacks(MaAllocationCallbacks other) {
    	allocationCallbacks.set(other);
    	return this;
    }
    
    public MaAllocationCallbacks allocationCallbacks() {
    	return allocationCallbacks;
    }
    
    /// @see #encodingFormat()
    public MaDecoderConfig encodingFormat(int encodingFormat) {
    	ENCODING_FORMAT_HANDLE.set(segment, 0L, encodingFormat);
    	return this;
    }
    
    public int encodingFormat() {
    	return (int) ENCODING_FORMAT_HANDLE.get(segment, 0L);
    }
    
    /// @see #seekPointCount()
    public MaDecoderConfig seekPointCount(int seekPointCount) {
    	SEEK_POINT_COUNT_HANDLE.set(segment, 0L, seekPointCount);
    	return this;
    }
    
    public int seekPointCount() {
    	return (int) SEEK_POINT_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #ppCustomBackendVTables()
    public MaDecoderConfig ppCustomBackendVTables(NativePointerArray ppCustomBackendVTables) {
    	PP_CUSTOM_BACKEND_VTABLES_HANDLE.set(segment, 0L, ppCustomBackendVTables.memorySegment());
    	return this;
    }
    
    public @Nullable NativePointerArray ppCustomBackendVTables() {
    	MemorySegment segment = (MemorySegment) PP_CUSTOM_BACKEND_VTABLES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativePointerArray(segment);
    }
    
    /// @see #customBackendCount()
    public MaDecoderConfig customBackendCount(int customBackendCount) {
    	CUSTOM_BACKEND_COUNT_HANDLE.set(segment, 0L, customBackendCount);
    	return this;
    }
    
    public int customBackendCount() {
    	return (int) CUSTOM_BACKEND_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pCustomBackendUserData()
    public MaDecoderConfig pCustomBackendUserData(MemorySegment pCustomBackendUserData) {
    	P_CUSTOM_BACKEND_USER_DATA_HANDLE.set(segment, 0L, pCustomBackendUserData);
    	return this;
    }
    
    public @Nullable MemorySegment pCustomBackendUserData() {
    	MemorySegment segment = (MemorySegment) P_CUSTOM_BACKEND_USER_DATA_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    @Override
    public MaDecoderConfig set(MaDecoderConfig other) {
        return set(other.segment);
    }
    
    @Override
    public MaDecoderConfig set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaDecoderConfig> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaDecoderConfig> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaDecoderConfig(segment),
            count
        );
    }
    
    public static NativeStructArray<MaDecoderConfig> array(Arena arena, MaDecoderConfig... structs) {
        NativeStructArray<MaDecoderConfig> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaDecoderConfig(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaDecoderConfig> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaDecoderConfig(segment)
        );
    }

}