/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.miniaudio.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class MaDeviceDescriptor
		implements Struct<MaDeviceDescriptor> {

	public static final StructLayout LAYOUT;

	public static final VarHandle P_DEVICE_ID_HANDLE;
	public static final VarHandle SHARE_MODE_HANDLE;
	public static final VarHandle FORMAT_HANDLE;
	public static final VarHandle CHANNELS_HANDLE;
	public static final VarHandle SAMPLE_RATE_HANDLE;
	public static final VarHandle CHANNEL_MAP_HANDLE;
	public static final VarHandle PERIOD_SIZE_IN_FRAMES_HANDLE;
	public static final VarHandle PERIOD_SIZE_IN_MILLISECONDS_HANDLE;
	public static final VarHandle PERIOD_COUNT_HANDLE;

	public static final long P_DEVICE_ID_BYTE_OFFSET;
	public static final long SHARE_MODE_BYTE_OFFSET;
	public static final long FORMAT_BYTE_OFFSET;
	public static final long CHANNELS_BYTE_OFFSET;
	public static final long SAMPLE_RATE_BYTE_OFFSET;
	public static final long CHANNEL_MAP_BYTE_OFFSET;
	public static final long PERIOD_SIZE_IN_FRAMES_BYTE_OFFSET;
	public static final long PERIOD_SIZE_IN_MILLISECONDS_BYTE_OFFSET;
	public static final long PERIOD_COUNT_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    UNBOUNDED_ADDRESS.withName("pDeviceID"),
		    JAVA_INT.withName("shareMode"),
		    JAVA_INT.withName("format"),
		    JAVA_INT.withName("channels"),
		    JAVA_INT.withName("sampleRate"),
		    MemoryLayout.sequenceLayout(254, JAVA_BYTE).withName("channelMap"),
		    MemoryLayout.paddingLayout(2),
		    JAVA_INT.withName("periodSizeInFrames"),
		    JAVA_INT.withName("periodSizeInMilliseconds"),
		    JAVA_INT.withName("periodCount"),
		    MemoryLayout.paddingLayout(4)
		).withName("ma_device_descriptor").withByteAlignment(8);
		
		P_DEVICE_ID_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pDeviceID"));
		SHARE_MODE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shareMode"));
		FORMAT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("format"));
		CHANNELS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("channels"));
		SAMPLE_RATE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sampleRate"));
		CHANNEL_MAP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("channelMap"), PathElement.sequenceElement());
		PERIOD_SIZE_IN_FRAMES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("periodSizeInFrames"));
		PERIOD_SIZE_IN_MILLISECONDS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("periodSizeInMilliseconds"));
		PERIOD_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("periodCount"));
		
		P_DEVICE_ID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pDeviceID"));
		SHARE_MODE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shareMode"));
		FORMAT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("format"));
		CHANNELS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("channels"));
		SAMPLE_RATE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sampleRate"));
		CHANNEL_MAP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("channelMap"));
		PERIOD_SIZE_IN_FRAMES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("periodSizeInFrames"));
		PERIOD_SIZE_IN_MILLISECONDS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("periodSizeInMilliseconds"));
		PERIOD_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("periodCount"));
		//@formatter:on
	}

	public MaDeviceDescriptor() {
	    this(Arena.ofAuto());
	}
	
	public MaDeviceDescriptor(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public MaDeviceDescriptor(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #pDeviceID()
    public MaDeviceDescriptor pDeviceID(MaDeviceId pDeviceID) {
    	P_DEVICE_ID_HANDLE.set(segment, 0L, pDeviceID.memorySegment());
    	return this;
    }
    
    public @Nullable MaDeviceId pDeviceID() {
    	MemorySegment segment = (MemorySegment) P_DEVICE_ID_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MaDeviceId(segment);
    }
    
    /// @see #shareMode()
    public MaDeviceDescriptor shareMode(int shareMode) {
    	SHARE_MODE_HANDLE.set(segment, 0L, shareMode);
    	return this;
    }
    
    public int shareMode() {
    	return (int) SHARE_MODE_HANDLE.get(segment, 0L);
    }
    
    /// @see #format()
    public MaDeviceDescriptor format(int format) {
    	FORMAT_HANDLE.set(segment, 0L, format);
    	return this;
    }
    
    public int format() {
    	return (int) FORMAT_HANDLE.get(segment, 0L);
    }
    
    /// @see #channels()
    public MaDeviceDescriptor channels(int channels) {
    	CHANNELS_HANDLE.set(segment, 0L, channels);
    	return this;
    }
    
    public int channels() {
    	return (int) CHANNELS_HANDLE.get(segment, 0L);
    }
    
    /// @see #sampleRate()
    public MaDeviceDescriptor sampleRate(int sampleRate) {
    	SAMPLE_RATE_HANDLE.set(segment, 0L, sampleRate);
    	return this;
    }
    
    public int sampleRate() {
    	return (int) SAMPLE_RATE_HANDLE.get(segment, 0L);
    }
    
    /// @see #channelMap(int)
    public MaDeviceDescriptor channelMap(byte channelMap, int index0) {
    	CHANNEL_MAP_HANDLE.set(segment, 0L, index0, channelMap);
    	return this;
    }
    
    public byte channelMap(int index0) {
    	return (byte) CHANNEL_MAP_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #periodSizeInFrames()
    public MaDeviceDescriptor periodSizeInFrames(int periodSizeInFrames) {
    	PERIOD_SIZE_IN_FRAMES_HANDLE.set(segment, 0L, periodSizeInFrames);
    	return this;
    }
    
    public int periodSizeInFrames() {
    	return (int) PERIOD_SIZE_IN_FRAMES_HANDLE.get(segment, 0L);
    }
    
    /// @see #periodSizeInMilliseconds()
    public MaDeviceDescriptor periodSizeInMilliseconds(int periodSizeInMilliseconds) {
    	PERIOD_SIZE_IN_MILLISECONDS_HANDLE.set(segment, 0L, periodSizeInMilliseconds);
    	return this;
    }
    
    public int periodSizeInMilliseconds() {
    	return (int) PERIOD_SIZE_IN_MILLISECONDS_HANDLE.get(segment, 0L);
    }
    
    /// @see #periodCount()
    public MaDeviceDescriptor periodCount(int periodCount) {
    	PERIOD_COUNT_HANDLE.set(segment, 0L, periodCount);
    	return this;
    }
    
    public int periodCount() {
    	return (int) PERIOD_COUNT_HANDLE.get(segment, 0L);
    }
    
    @Override
    public MaDeviceDescriptor set(MaDeviceDescriptor other) {
        return set(other.segment);
    }
    
    @Override
    public MaDeviceDescriptor set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaDeviceDescriptor> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaDeviceDescriptor> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaDeviceDescriptor(segment),
            count
        );
    }
    
    public static NativeStructArray<MaDeviceDescriptor> array(Arena arena, MaDeviceDescriptor... structs) {
        NativeStructArray<MaDeviceDescriptor> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaDeviceDescriptor(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaDeviceDescriptor> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaDeviceDescriptor(segment)
        );
    }

}