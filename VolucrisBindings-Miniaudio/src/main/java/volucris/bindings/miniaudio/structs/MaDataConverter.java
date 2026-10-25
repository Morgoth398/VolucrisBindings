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
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class MaDataConverter
		implements Struct<MaDataConverter> {

	public static final StructLayout LAYOUT;

	public static final VarHandle FORMAT_IN_HANDLE;
	public static final VarHandle FORMAT_OUT_HANDLE;
	public static final VarHandle CHANNELS_IN_HANDLE;
	public static final VarHandle CHANNELS_OUT_HANDLE;
	public static final VarHandle SAMPLE_RATE_IN_HANDLE;
	public static final VarHandle SAMPLE_RATE_OUT_HANDLE;
	public static final VarHandle DITHER_MODE_HANDLE;
	public static final VarHandle EXECUTION_PATH_HANDLE;
	public static final VarHandle HAS_PRE_FORMAT_CONVERSION_HANDLE;
	public static final VarHandle HAS_POST_FORMAT_CONVERSION_HANDLE;
	public static final VarHandle HAS_CHANNEL_CONVERTER_HANDLE;
	public static final VarHandle HAS_RESAMPLER_HANDLE;
	public static final VarHandle IS_PASSTHROUGH_HANDLE;
	public static final VarHandle _OWNS_HEAP_HANDLE;
	public static final VarHandle _P_HEAP_HANDLE;

	public static final long FORMAT_IN_BYTE_OFFSET;
	public static final long FORMAT_OUT_BYTE_OFFSET;
	public static final long CHANNELS_IN_BYTE_OFFSET;
	public static final long CHANNELS_OUT_BYTE_OFFSET;
	public static final long SAMPLE_RATE_IN_BYTE_OFFSET;
	public static final long SAMPLE_RATE_OUT_BYTE_OFFSET;
	public static final long DITHER_MODE_BYTE_OFFSET;
	public static final long EXECUTION_PATH_BYTE_OFFSET;
	public static final long CHANNEL_CONVERTER_BYTE_OFFSET;
	public static final long RESAMPLER_BYTE_OFFSET;
	public static final long HAS_PRE_FORMAT_CONVERSION_BYTE_OFFSET;
	public static final long HAS_POST_FORMAT_CONVERSION_BYTE_OFFSET;
	public static final long HAS_CHANNEL_CONVERTER_BYTE_OFFSET;
	public static final long HAS_RESAMPLER_BYTE_OFFSET;
	public static final long IS_PASSTHROUGH_BYTE_OFFSET;
	public static final long _OWNS_HEAP_BYTE_OFFSET;
	public static final long _P_HEAP_BYTE_OFFSET;

	private final MemorySegment segment;

	private final MaChannelConverter channelConverter;
	private final MaResampler resampler;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("formatIn"),
		    JAVA_INT.withName("formatOut"),
		    JAVA_INT.withName("channelsIn"),
		    JAVA_INT.withName("channelsOut"),
		    JAVA_INT.withName("sampleRateIn"),
		    JAVA_INT.withName("sampleRateOut"),
		    JAVA_INT.withName("ditherMode"),
		    JAVA_INT.withName("executionPath"),
		    MaChannelConverter.LAYOUT.withName("channelConverter"),
		    MaResampler.LAYOUT.withName("resampler"),
		    JAVA_BYTE.withName("hasPreFormatConversion"),
		    JAVA_BYTE.withName("hasPostFormatConversion"),
		    JAVA_BYTE.withName("hasChannelConverter"),
		    JAVA_BYTE.withName("hasResampler"),
		    JAVA_BYTE.withName("isPassthrough"),
		    JAVA_BYTE.withName("_ownsHeap"),
		    MemoryLayout.paddingLayout(2),
		    UNBOUNDED_ADDRESS.withName("_pHeap")
		).withName("ma_data_converter").withByteAlignment(8);
		
		FORMAT_IN_HANDLE = LAYOUT.varHandle(PathElement.groupElement("formatIn"));
		FORMAT_OUT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("formatOut"));
		CHANNELS_IN_HANDLE = LAYOUT.varHandle(PathElement.groupElement("channelsIn"));
		CHANNELS_OUT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("channelsOut"));
		SAMPLE_RATE_IN_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sampleRateIn"));
		SAMPLE_RATE_OUT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sampleRateOut"));
		DITHER_MODE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("ditherMode"));
		EXECUTION_PATH_HANDLE = LAYOUT.varHandle(PathElement.groupElement("executionPath"));
		HAS_PRE_FORMAT_CONVERSION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("hasPreFormatConversion"));
		HAS_POST_FORMAT_CONVERSION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("hasPostFormatConversion"));
		HAS_CHANNEL_CONVERTER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("hasChannelConverter"));
		HAS_RESAMPLER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("hasResampler"));
		IS_PASSTHROUGH_HANDLE = LAYOUT.varHandle(PathElement.groupElement("isPassthrough"));
		_OWNS_HEAP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("_ownsHeap"));
		_P_HEAP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("_pHeap"));
		
		FORMAT_IN_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("formatIn"));
		FORMAT_OUT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("formatOut"));
		CHANNELS_IN_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("channelsIn"));
		CHANNELS_OUT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("channelsOut"));
		SAMPLE_RATE_IN_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sampleRateIn"));
		SAMPLE_RATE_OUT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sampleRateOut"));
		DITHER_MODE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("ditherMode"));
		EXECUTION_PATH_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("executionPath"));
		CHANNEL_CONVERTER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("channelConverter"));
		RESAMPLER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("resampler"));
		HAS_PRE_FORMAT_CONVERSION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("hasPreFormatConversion"));
		HAS_POST_FORMAT_CONVERSION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("hasPostFormatConversion"));
		HAS_CHANNEL_CONVERTER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("hasChannelConverter"));
		HAS_RESAMPLER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("hasResampler"));
		IS_PASSTHROUGH_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("isPassthrough"));
		_OWNS_HEAP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("_ownsHeap"));
		_P_HEAP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("_pHeap"));
		//@formatter:on
	}

	public MaDataConverter() {
	    this(Arena.ofAuto());
	}
	
	public MaDataConverter(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public MaDataConverter(MemorySegment segment) {
	    this.segment = segment;
	
	    channelConverter = new MaChannelConverter(segment.asSlice(CHANNEL_CONVERTER_BYTE_OFFSET, MaChannelConverter.LAYOUT));
	    resampler = new MaResampler(segment.asSlice(RESAMPLER_BYTE_OFFSET, MaResampler.LAYOUT));
	}

    /// @see #formatIn()
    public MaDataConverter formatIn(int formatIn) {
    	FORMAT_IN_HANDLE.set(segment, 0L, formatIn);
    	return this;
    }
    
    public int formatIn() {
    	return (int) FORMAT_IN_HANDLE.get(segment, 0L);
    }
    
    /// @see #formatOut()
    public MaDataConverter formatOut(int formatOut) {
    	FORMAT_OUT_HANDLE.set(segment, 0L, formatOut);
    	return this;
    }
    
    public int formatOut() {
    	return (int) FORMAT_OUT_HANDLE.get(segment, 0L);
    }
    
    /// @see #channelsIn()
    public MaDataConverter channelsIn(int channelsIn) {
    	CHANNELS_IN_HANDLE.set(segment, 0L, channelsIn);
    	return this;
    }
    
    public int channelsIn() {
    	return (int) CHANNELS_IN_HANDLE.get(segment, 0L);
    }
    
    /// @see #channelsOut()
    public MaDataConverter channelsOut(int channelsOut) {
    	CHANNELS_OUT_HANDLE.set(segment, 0L, channelsOut);
    	return this;
    }
    
    public int channelsOut() {
    	return (int) CHANNELS_OUT_HANDLE.get(segment, 0L);
    }
    
    /// @see #sampleRateIn()
    public MaDataConverter sampleRateIn(int sampleRateIn) {
    	SAMPLE_RATE_IN_HANDLE.set(segment, 0L, sampleRateIn);
    	return this;
    }
    
    public int sampleRateIn() {
    	return (int) SAMPLE_RATE_IN_HANDLE.get(segment, 0L);
    }
    
    /// @see #sampleRateOut()
    public MaDataConverter sampleRateOut(int sampleRateOut) {
    	SAMPLE_RATE_OUT_HANDLE.set(segment, 0L, sampleRateOut);
    	return this;
    }
    
    public int sampleRateOut() {
    	return (int) SAMPLE_RATE_OUT_HANDLE.get(segment, 0L);
    }
    
    /// @see #ditherMode()
    public MaDataConverter ditherMode(int ditherMode) {
    	DITHER_MODE_HANDLE.set(segment, 0L, ditherMode);
    	return this;
    }
    
    public int ditherMode() {
    	return (int) DITHER_MODE_HANDLE.get(segment, 0L);
    }
    
    /// @see #executionPath()
    public MaDataConverter executionPath(int executionPath) {
    	EXECUTION_PATH_HANDLE.set(segment, 0L, executionPath);
    	return this;
    }
    
    public int executionPath() {
    	return (int) EXECUTION_PATH_HANDLE.get(segment, 0L);
    }
    
    /// @see #channelConverter()
    public MaDataConverter channelConverter(Consumer<MaChannelConverter> consumer) {
    	consumer.accept(channelConverter);
    	return this;
    }
    
    /// @see #channelConverter()
    public MaDataConverter channelConverter(MaChannelConverter other) {
    	channelConverter.set(other);
    	return this;
    }
    
    public MaChannelConverter channelConverter() {
    	return channelConverter;
    }
    
    /// @see #resampler()
    public MaDataConverter resampler(Consumer<MaResampler> consumer) {
    	consumer.accept(resampler);
    	return this;
    }
    
    /// @see #resampler()
    public MaDataConverter resampler(MaResampler other) {
    	resampler.set(other);
    	return this;
    }
    
    public MaResampler resampler() {
    	return resampler;
    }
    
    /// @see #hasPreFormatConversion()
    public MaDataConverter hasPreFormatConversion(byte hasPreFormatConversion) {
    	HAS_PRE_FORMAT_CONVERSION_HANDLE.set(segment, 0L, hasPreFormatConversion);
    	return this;
    }
    
    public byte hasPreFormatConversion() {
    	return (byte) HAS_PRE_FORMAT_CONVERSION_HANDLE.get(segment, 0L);
    }
    
    /// @see #hasPostFormatConversion()
    public MaDataConverter hasPostFormatConversion(byte hasPostFormatConversion) {
    	HAS_POST_FORMAT_CONVERSION_HANDLE.set(segment, 0L, hasPostFormatConversion);
    	return this;
    }
    
    public byte hasPostFormatConversion() {
    	return (byte) HAS_POST_FORMAT_CONVERSION_HANDLE.get(segment, 0L);
    }
    
    /// @see #hasChannelConverter()
    public MaDataConverter hasChannelConverter(byte hasChannelConverter) {
    	HAS_CHANNEL_CONVERTER_HANDLE.set(segment, 0L, hasChannelConverter);
    	return this;
    }
    
    public byte hasChannelConverter() {
    	return (byte) HAS_CHANNEL_CONVERTER_HANDLE.get(segment, 0L);
    }
    
    /// @see #hasResampler()
    public MaDataConverter hasResampler(byte hasResampler) {
    	HAS_RESAMPLER_HANDLE.set(segment, 0L, hasResampler);
    	return this;
    }
    
    public byte hasResampler() {
    	return (byte) HAS_RESAMPLER_HANDLE.get(segment, 0L);
    }
    
    /// @see #isPassthrough()
    public MaDataConverter isPassthrough(byte isPassthrough) {
    	IS_PASSTHROUGH_HANDLE.set(segment, 0L, isPassthrough);
    	return this;
    }
    
    public byte isPassthrough() {
    	return (byte) IS_PASSTHROUGH_HANDLE.get(segment, 0L);
    }
    
    /// @see #_ownsHeap()
    public MaDataConverter _ownsHeap(byte _ownsHeap) {
    	_OWNS_HEAP_HANDLE.set(segment, 0L, _ownsHeap);
    	return this;
    }
    
    public byte _ownsHeap() {
    	return (byte) _OWNS_HEAP_HANDLE.get(segment, 0L);
    }
    
    /// @see #_pHeap()
    public MaDataConverter _pHeap(MemorySegment _pHeap) {
    	_P_HEAP_HANDLE.set(segment, 0L, _pHeap);
    	return this;
    }
    
    public @Nullable MemorySegment _pHeap() {
    	MemorySegment segment = (MemorySegment) _P_HEAP_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    @Override
    public MaDataConverter set(MaDataConverter other) {
        return set(other.segment);
    }
    
    @Override
    public MaDataConverter set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaDataConverter> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaDataConverter> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaDataConverter(segment),
            count
        );
    }
    
    public static NativeStructArray<MaDataConverter> array(SegmentAllocator allocator, MaDataConverter... structs) {
        NativeStructArray<MaDataConverter> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaDataConverter(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaDataConverter> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaDataConverter(segment)
        );
    }

}