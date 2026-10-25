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
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

public final class MaEncoderConfig
		implements Struct<MaEncoderConfig> {

	public static final StructLayout LAYOUT;

	public static final VarHandle ENCODING_FORMAT_HANDLE;
	public static final VarHandle FORMAT_HANDLE;
	public static final VarHandle CHANNELS_HANDLE;
	public static final VarHandle SAMPLE_RATE_HANDLE;

	public static final long ENCODING_FORMAT_BYTE_OFFSET;
	public static final long FORMAT_BYTE_OFFSET;
	public static final long CHANNELS_BYTE_OFFSET;
	public static final long SAMPLE_RATE_BYTE_OFFSET;
	public static final long ALLOCATION_CALLBACKS_BYTE_OFFSET;

	private final MemorySegment segment;

	private final MaAllocationCallbacks allocationCallbacks;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("encodingFormat"),
		    JAVA_INT.withName("format"),
		    JAVA_INT.withName("channels"),
		    JAVA_INT.withName("sampleRate"),
		    MaAllocationCallbacks.LAYOUT.withName("allocationCallbacks")
		).withName("ma_encoder_config").withByteAlignment(8);
		
		ENCODING_FORMAT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("encodingFormat"));
		FORMAT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("format"));
		CHANNELS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("channels"));
		SAMPLE_RATE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sampleRate"));
		
		ENCODING_FORMAT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("encodingFormat"));
		FORMAT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("format"));
		CHANNELS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("channels"));
		SAMPLE_RATE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sampleRate"));
		ALLOCATION_CALLBACKS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("allocationCallbacks"));
		//@formatter:on
	}

	public MaEncoderConfig() {
	    this(Arena.ofAuto());
	}
	
	public MaEncoderConfig(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public MaEncoderConfig(MemorySegment segment) {
	    this.segment = segment;
	
	    allocationCallbacks = new MaAllocationCallbacks(segment.asSlice(ALLOCATION_CALLBACKS_BYTE_OFFSET, MaAllocationCallbacks.LAYOUT));
	}

    /// @see #encodingFormat()
    public MaEncoderConfig encodingFormat(int encodingFormat) {
    	ENCODING_FORMAT_HANDLE.set(segment, 0L, encodingFormat);
    	return this;
    }
    
    public int encodingFormat() {
    	return (int) ENCODING_FORMAT_HANDLE.get(segment, 0L);
    }
    
    /// @see #format()
    public MaEncoderConfig format(int format) {
    	FORMAT_HANDLE.set(segment, 0L, format);
    	return this;
    }
    
    public int format() {
    	return (int) FORMAT_HANDLE.get(segment, 0L);
    }
    
    /// @see #channels()
    public MaEncoderConfig channels(int channels) {
    	CHANNELS_HANDLE.set(segment, 0L, channels);
    	return this;
    }
    
    public int channels() {
    	return (int) CHANNELS_HANDLE.get(segment, 0L);
    }
    
    /// @see #sampleRate()
    public MaEncoderConfig sampleRate(int sampleRate) {
    	SAMPLE_RATE_HANDLE.set(segment, 0L, sampleRate);
    	return this;
    }
    
    public int sampleRate() {
    	return (int) SAMPLE_RATE_HANDLE.get(segment, 0L);
    }
    
    /// @see #allocationCallbacks()
    public MaEncoderConfig allocationCallbacks(Consumer<MaAllocationCallbacks> consumer) {
    	consumer.accept(allocationCallbacks);
    	return this;
    }
    
    /// @see #allocationCallbacks()
    public MaEncoderConfig allocationCallbacks(MaAllocationCallbacks other) {
    	allocationCallbacks.set(other);
    	return this;
    }
    
    public MaAllocationCallbacks allocationCallbacks() {
    	return allocationCallbacks;
    }
    
    @Override
    public MaEncoderConfig set(MaEncoderConfig other) {
        return set(other.segment);
    }
    
    @Override
    public MaEncoderConfig set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaEncoderConfig> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaEncoderConfig> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaEncoderConfig(segment),
            count
        );
    }
    
    public static NativeStructArray<MaEncoderConfig> array(SegmentAllocator allocator, MaEncoderConfig... structs) {
        NativeStructArray<MaEncoderConfig> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaEncoderConfig(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaEncoderConfig> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaEncoderConfig(segment)
        );
    }

}