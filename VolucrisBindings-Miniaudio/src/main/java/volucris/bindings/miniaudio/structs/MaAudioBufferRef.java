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

public final class MaAudioBufferRef
		implements Struct<MaAudioBufferRef> {

	public static final StructLayout LAYOUT;

	public static final VarHandle FORMAT_HANDLE;
	public static final VarHandle CHANNELS_HANDLE;
	public static final VarHandle SAMPLE_RATE_HANDLE;
	public static final VarHandle CURSOR_HANDLE;
	public static final VarHandle SIZE_IN_FRAMES_HANDLE;
	public static final VarHandle P_DATA_HANDLE;

	public static final long DS_BYTE_OFFSET;
	public static final long FORMAT_BYTE_OFFSET;
	public static final long CHANNELS_BYTE_OFFSET;
	public static final long SAMPLE_RATE_BYTE_OFFSET;
	public static final long CURSOR_BYTE_OFFSET;
	public static final long SIZE_IN_FRAMES_BYTE_OFFSET;
	public static final long P_DATA_BYTE_OFFSET;

	private final MemorySegment segment;

	private final MaDataSourceBase ds;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    MaDataSourceBase.LAYOUT.withName("ds"),
		    JAVA_INT.withName("format"),
		    JAVA_INT.withName("channels"),
		    JAVA_INT.withName("sampleRate"),
		    MemoryLayout.paddingLayout(4),
		    JAVA_LONG.withName("cursor"),
		    JAVA_LONG.withName("sizeInFrames"),
		    UNBOUNDED_ADDRESS.withName("pData")
		).withName("ma_audio_buffer_ref").withByteAlignment(8);
		
		FORMAT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("format"));
		CHANNELS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("channels"));
		SAMPLE_RATE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sampleRate"));
		CURSOR_HANDLE = LAYOUT.varHandle(PathElement.groupElement("cursor"));
		SIZE_IN_FRAMES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sizeInFrames"));
		P_DATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pData"));
		
		DS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("ds"));
		FORMAT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("format"));
		CHANNELS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("channels"));
		SAMPLE_RATE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sampleRate"));
		CURSOR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("cursor"));
		SIZE_IN_FRAMES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sizeInFrames"));
		P_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pData"));
		//@formatter:on
	}

	public MaAudioBufferRef() {
	    this(Arena.ofAuto());
	}
	
	public MaAudioBufferRef(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public MaAudioBufferRef(MemorySegment segment) {
	    this.segment = segment;
	
	    ds = new MaDataSourceBase(segment.asSlice(DS_BYTE_OFFSET, MaDataSourceBase.LAYOUT));
	}

    /// @see #ds()
    public MaAudioBufferRef ds(Consumer<MaDataSourceBase> consumer) {
    	consumer.accept(ds);
    	return this;
    }
    
    /// @see #ds()
    public MaAudioBufferRef ds(MaDataSourceBase other) {
    	ds.set(other);
    	return this;
    }
    
    public MaDataSourceBase ds() {
    	return ds;
    }
    
    /// @see #format()
    public MaAudioBufferRef format(int format) {
    	FORMAT_HANDLE.set(segment, 0L, format);
    	return this;
    }
    
    public int format() {
    	return (int) FORMAT_HANDLE.get(segment, 0L);
    }
    
    /// @see #channels()
    public MaAudioBufferRef channels(int channels) {
    	CHANNELS_HANDLE.set(segment, 0L, channels);
    	return this;
    }
    
    public int channels() {
    	return (int) CHANNELS_HANDLE.get(segment, 0L);
    }
    
    /// @see #sampleRate()
    public MaAudioBufferRef sampleRate(int sampleRate) {
    	SAMPLE_RATE_HANDLE.set(segment, 0L, sampleRate);
    	return this;
    }
    
    public int sampleRate() {
    	return (int) SAMPLE_RATE_HANDLE.get(segment, 0L);
    }
    
    /// @see #cursor()
    public MaAudioBufferRef cursor(long cursor) {
    	CURSOR_HANDLE.set(segment, 0L, cursor);
    	return this;
    }
    
    public long cursor() {
    	return (long) CURSOR_HANDLE.get(segment, 0L);
    }
    
    /// @see #sizeInFrames()
    public MaAudioBufferRef sizeInFrames(long sizeInFrames) {
    	SIZE_IN_FRAMES_HANDLE.set(segment, 0L, sizeInFrames);
    	return this;
    }
    
    public long sizeInFrames() {
    	return (long) SIZE_IN_FRAMES_HANDLE.get(segment, 0L);
    }
    
    /// @see #pData()
    public MaAudioBufferRef pData(MemorySegment pData) {
    	P_DATA_HANDLE.set(segment, 0L, pData);
    	return this;
    }
    
    public @Nullable MemorySegment pData() {
    	MemorySegment segment = (MemorySegment) P_DATA_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    @Override
    public MaAudioBufferRef set(MaAudioBufferRef other) {
        return set(other.segment);
    }
    
    @Override
    public MaAudioBufferRef set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaAudioBufferRef> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaAudioBufferRef> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaAudioBufferRef(segment),
            count
        );
    }
    
    public static NativeStructArray<MaAudioBufferRef> array(SegmentAllocator allocator, MaAudioBufferRef... structs) {
        NativeStructArray<MaAudioBufferRef> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaAudioBufferRef(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaAudioBufferRef> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaAudioBufferRef(segment)
        );
    }

}