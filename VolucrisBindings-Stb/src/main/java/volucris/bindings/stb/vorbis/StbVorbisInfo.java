/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.stb.vorbis;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

public final class StbVorbisInfo
		implements Struct<StbVorbisInfo> {

	public static final StructLayout LAYOUT;

	public static final VarHandle SAMPLE_RATE_HANDLE;
	public static final VarHandle CHANNELS_HANDLE;
	public static final VarHandle SETUP_MEMORY_REQUIRED_HANDLE;
	public static final VarHandle SETUP_TEMP_MEMORY_REQUIRED_HANDLE;
	public static final VarHandle TEMP_MEMORY_REQUIRED_HANDLE;
	public static final VarHandle MAX_FRAME_SIZE_HANDLE;

	public static final long SAMPLE_RATE_BYTE_OFFSET;
	public static final long CHANNELS_BYTE_OFFSET;
	public static final long SETUP_MEMORY_REQUIRED_BYTE_OFFSET;
	public static final long SETUP_TEMP_MEMORY_REQUIRED_BYTE_OFFSET;
	public static final long TEMP_MEMORY_REQUIRED_BYTE_OFFSET;
	public static final long MAX_FRAME_SIZE_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sample_rate"),
		    JAVA_INT.withName("channels"),
		    JAVA_INT.withName("setup_memory_required"),
		    JAVA_INT.withName("setup_temp_memory_required"),
		    JAVA_INT.withName("temp_memory_required"),
		    JAVA_INT.withName("max_frame_size")
		).withName("stb_vorbis_info").withByteAlignment(4);
		
		SAMPLE_RATE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sample_rate"));
		CHANNELS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("channels"));
		SETUP_MEMORY_REQUIRED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("setup_memory_required"));
		SETUP_TEMP_MEMORY_REQUIRED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("setup_temp_memory_required"));
		TEMP_MEMORY_REQUIRED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("temp_memory_required"));
		MAX_FRAME_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("max_frame_size"));
		
		SAMPLE_RATE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sample_rate"));
		CHANNELS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("channels"));
		SETUP_MEMORY_REQUIRED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("setup_memory_required"));
		SETUP_TEMP_MEMORY_REQUIRED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("setup_temp_memory_required"));
		TEMP_MEMORY_REQUIRED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("temp_memory_required"));
		MAX_FRAME_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("max_frame_size"));
		//@formatter:on
	}

	public StbVorbisInfo() {
	    this(Arena.ofAuto());
	}
	
	public StbVorbisInfo(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public StbVorbisInfo(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sample_rate()
    public StbVorbisInfo sample_rate(int sample_rate) {
    	SAMPLE_RATE_HANDLE.set(segment, 0L, sample_rate);
    	return this;
    }
    
    public int sample_rate() {
    	return (int) SAMPLE_RATE_HANDLE.get(segment, 0L);
    }
    
    /// @see #channels()
    public StbVorbisInfo channels(int channels) {
    	CHANNELS_HANDLE.set(segment, 0L, channels);
    	return this;
    }
    
    public int channels() {
    	return (int) CHANNELS_HANDLE.get(segment, 0L);
    }
    
    /// @see #setup_memory_required()
    public StbVorbisInfo setup_memory_required(int setup_memory_required) {
    	SETUP_MEMORY_REQUIRED_HANDLE.set(segment, 0L, setup_memory_required);
    	return this;
    }
    
    public int setup_memory_required() {
    	return (int) SETUP_MEMORY_REQUIRED_HANDLE.get(segment, 0L);
    }
    
    /// @see #setup_temp_memory_required()
    public StbVorbisInfo setup_temp_memory_required(int setup_temp_memory_required) {
    	SETUP_TEMP_MEMORY_REQUIRED_HANDLE.set(segment, 0L, setup_temp_memory_required);
    	return this;
    }
    
    public int setup_temp_memory_required() {
    	return (int) SETUP_TEMP_MEMORY_REQUIRED_HANDLE.get(segment, 0L);
    }
    
    /// @see #temp_memory_required()
    public StbVorbisInfo temp_memory_required(int temp_memory_required) {
    	TEMP_MEMORY_REQUIRED_HANDLE.set(segment, 0L, temp_memory_required);
    	return this;
    }
    
    public int temp_memory_required() {
    	return (int) TEMP_MEMORY_REQUIRED_HANDLE.get(segment, 0L);
    }
    
    /// @see #max_frame_size()
    public StbVorbisInfo max_frame_size(int max_frame_size) {
    	MAX_FRAME_SIZE_HANDLE.set(segment, 0L, max_frame_size);
    	return this;
    }
    
    public int max_frame_size() {
    	return (int) MAX_FRAME_SIZE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public StbVorbisInfo set(StbVorbisInfo other) {
        return set(other.segment);
    }
    
    @Override
    public StbVorbisInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<StbVorbisInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<StbVorbisInfo> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new StbVorbisInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<StbVorbisInfo> array(SegmentAllocator allocator, StbVorbisInfo... structs) {
        NativeStructArray<StbVorbisInfo> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new StbVorbisInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<StbVorbisInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new StbVorbisInfo(segment)
        );
    }

}