/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.stb.vorbis;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.MethodHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.MemoryStack;
import volucris.bindings.core.NativeByteArray;
import volucris.bindings.core.NativeFloatArray;
import volucris.bindings.core.NativeIntArray;
import volucris.bindings.core.NativePointerArray;
import volucris.bindings.core.NativeShortArray;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class StbVorbis {

	private static final LazyConstant<MethodHandle> STB_VORBIS_GET_INFO;
	private static final LazyConstant<MethodHandle> STB_VORBIS_GET_COMMENT;
	private static final LazyConstant<MethodHandle> STB_VORBIS_GET_ERROR;
	private static final LazyConstant<MethodHandle> STB_VORBIS_CLOSE;
	private static final LazyConstant<MethodHandle> STB_VORBIS_GET_SAMPLE_OFFSET;
	private static final LazyConstant<MethodHandle> STB_VORBIS_GET_FILE_OFFSET;
	private static final LazyConstant<MethodHandle> STB_VORBIS_OPEN_PUSHDATA;
	private static final LazyConstant<MethodHandle> STB_VORBIS_DECODE_FRAME_PUSHDATA;
	private static final LazyConstant<MethodHandle> STB_VORBIS_FLUSH_PUSHDATA;
	private static final LazyConstant<MethodHandle> STB_VORBIS_DECODE_FILENAME;
	private static final LazyConstant<MethodHandle> STB_VORBIS_DECODE_MEMORY;
	private static final LazyConstant<MethodHandle> STB_VORBIS_OPEN_MEMORY;
	private static final LazyConstant<MethodHandle> STB_VORBIS_SEEK_FRAME;
	private static final LazyConstant<MethodHandle> STB_VORBIS_SEEK;
	private static final LazyConstant<MethodHandle> STB_VORBIS_SEEK_START;
	private static final LazyConstant<MethodHandle> STB_VORBIS_STREAM_LENGTH_IN_SAMPLES;
	private static final LazyConstant<MethodHandle> STB_VORBIS_STREAM_LENGTH_IN_SECONDS;
	private static final LazyConstant<MethodHandle> STB_VORBIS_GET_FRAME_FLOAT;
	private static final LazyConstant<MethodHandle> STB_VORBIS_GET_FRAME_SHORT_INTERLEAVED;
	private static final LazyConstant<MethodHandle> STB_VORBIS_GET_FRAME_SHORT;
	private static final LazyConstant<MethodHandle> STB_VORBIS_GET_SAMPLES_FLOAT_INTERLEAVED;
	private static final LazyConstant<MethodHandle> STB_VORBIS_GET_SAMPLES_FLOAT;
	private static final LazyConstant<MethodHandle> STB_VORBIS_GET_SAMPLES_SHORT_INTERLEAVED;
	private static final LazyConstant<MethodHandle> STB_VORBIS_GET_SAMPLES_SHORT;

	static {
		//@formatter:off
		STB_VORBIS_GET_INFO = downcallHandle("stb_vorbis_get_info", StbVorbisInfo.LAYOUT, UNBOUNDED_ADDRESS);
		STB_VORBIS_GET_COMMENT = downcallHandle("stb_vorbis_get_comment", StbVorbisComment.LAYOUT, UNBOUNDED_ADDRESS);
		STB_VORBIS_GET_ERROR = downcallHandle("stb_vorbis_get_error", JAVA_INT, UNBOUNDED_ADDRESS);
		STB_VORBIS_CLOSE = downcallHandleVoid("stb_vorbis_close", UNBOUNDED_ADDRESS);
		STB_VORBIS_GET_SAMPLE_OFFSET = downcallHandle("stb_vorbis_get_sample_offset", JAVA_INT, UNBOUNDED_ADDRESS);
		STB_VORBIS_GET_FILE_OFFSET = downcallHandle("stb_vorbis_get_file_offset", JAVA_INT, UNBOUNDED_ADDRESS);
		STB_VORBIS_OPEN_PUSHDATA = downcallHandle("stb_vorbis_open_pushdata", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		STB_VORBIS_DECODE_FRAME_PUSHDATA = downcallHandle("stb_vorbis_decode_frame_pushdata", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		STB_VORBIS_FLUSH_PUSHDATA = downcallHandleVoid("stb_vorbis_flush_pushdata", UNBOUNDED_ADDRESS);
		STB_VORBIS_DECODE_FILENAME = downcallHandle("stb_vorbis_decode_filename", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		STB_VORBIS_DECODE_MEMORY = downcallHandle("stb_vorbis_decode_memory", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		STB_VORBIS_OPEN_MEMORY = downcallHandle("stb_vorbis_open_memory", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		STB_VORBIS_SEEK_FRAME = downcallHandle("stb_vorbis_seek_frame", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT);
		STB_VORBIS_SEEK = downcallHandle("stb_vorbis_seek", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT);
		STB_VORBIS_SEEK_START = downcallHandle("stb_vorbis_seek_start", JAVA_INT, UNBOUNDED_ADDRESS);
		STB_VORBIS_STREAM_LENGTH_IN_SAMPLES = downcallHandle("stb_vorbis_stream_length_in_samples", JAVA_INT, UNBOUNDED_ADDRESS);
		STB_VORBIS_STREAM_LENGTH_IN_SECONDS = downcallHandle("stb_vorbis_stream_length_in_seconds", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		STB_VORBIS_GET_FRAME_FLOAT = downcallHandle("stb_vorbis_get_frame_float", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		STB_VORBIS_GET_FRAME_SHORT_INTERLEAVED = downcallHandle("stb_vorbis_get_frame_short_interleaved", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT);
		STB_VORBIS_GET_FRAME_SHORT = downcallHandle("stb_vorbis_get_frame_short", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT);
		STB_VORBIS_GET_SAMPLES_FLOAT_INTERLEAVED = downcallHandle("stb_vorbis_get_samples_float_interleaved", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT);
		STB_VORBIS_GET_SAMPLES_FLOAT = downcallHandle("stb_vorbis_get_samples_float", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT);
		STB_VORBIS_GET_SAMPLES_SHORT_INTERLEAVED = downcallHandle("stb_vorbis_get_samples_short_interleaved", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT);
		STB_VORBIS_GET_SAMPLES_SHORT = downcallHandle("stb_vorbis_get_samples_short", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT);
		//@formatter:on
	}

	private StbVorbis() {
	}

    public static MemorySegment stb_vorbis_get_info(
    	SegmentAllocator allocator,
    	MemorySegment f
    ) {
    	MethodHandle method = STB_VORBIS_GET_INFO.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			f
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#stb_vorbis_get_info].
    public static @Nullable StbVorbisInfo stb_vorbis_get_info(
    	SegmentAllocator allocator,
    	StbVorbisHandle f
    ) {
    	MemorySegment segment = stb_vorbis_get_info(
    		allocator,
    		f.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new StbVorbisInfo(segment);
    }
    
    public static MemorySegment stb_vorbis_get_comment(
    	SegmentAllocator allocator,
    	MemorySegment f
    ) {
    	MethodHandle method = STB_VORBIS_GET_COMMENT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			f
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#stb_vorbis_get_comment].
    public static @Nullable StbVorbisComment stb_vorbis_get_comment(
    	SegmentAllocator allocator,
    	StbVorbisHandle f
    ) {
    	MemorySegment segment = stb_vorbis_get_comment(
    		allocator,
    		f.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new StbVorbisComment(segment);
    }
    
    public static int stb_vorbis_get_error(
    	MemorySegment f
    ) {
    	MethodHandle method = STB_VORBIS_GET_ERROR.get();
    	try {
    		return (int) method.invokeExact(
    			f
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#stb_vorbis_get_error].
    public static int stb_vorbis_get_error(
    	StbVorbisHandle f
    ) {
    	return stb_vorbis_get_error(
    		f.memorySegment()
    	);
    }
    
    public static void stb_vorbis_close(
    	MemorySegment f
    ) {
    	MethodHandle method = STB_VORBIS_CLOSE.get();
    	try {
    		 method.invokeExact(
    			f
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#stb_vorbis_close].
    public static void stb_vorbis_close(
    	StbVorbisHandle f
    ) {
    	stb_vorbis_close(
    		f.memorySegment()
    	);
    }
    
    public static int stb_vorbis_get_sample_offset(
    	MemorySegment f
    ) {
    	MethodHandle method = STB_VORBIS_GET_SAMPLE_OFFSET.get();
    	try {
    		return (int) method.invokeExact(
    			f
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#stb_vorbis_get_sample_offset].
    public static int stb_vorbis_get_sample_offset(
    	StbVorbisHandle f
    ) {
    	return stb_vorbis_get_sample_offset(
    		f.memorySegment()
    	);
    }
    
    public static int stb_vorbis_get_file_offset(
    	MemorySegment f
    ) {
    	MethodHandle method = STB_VORBIS_GET_FILE_OFFSET.get();
    	try {
    		return (int) method.invokeExact(
    			f
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#stb_vorbis_get_file_offset].
    public static int stb_vorbis_get_file_offset(
    	StbVorbisHandle f
    ) {
    	return stb_vorbis_get_file_offset(
    		f.memorySegment()
    	);
    }
    
    public static MemorySegment stb_vorbis_open_pushdata(
    	MemorySegment datablock,
    	int datablock_length_in_bytes,
    	MemorySegment datablock_memory_consumed_in_bytes,
    	MemorySegment error,
    	MemorySegment alloc_buffer
    ) {
    	MethodHandle method = STB_VORBIS_OPEN_PUSHDATA.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			datablock,
    			datablock_length_in_bytes,
    			datablock_memory_consumed_in_bytes,
    			error,
    			alloc_buffer
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#stb_vorbis_open_pushdata].
    public static @Nullable StbVorbisHandle stb_vorbis_open_pushdata(
    	NativeByteArray datablock,
    	int datablock_length_in_bytes,
    	NativeIntArray datablock_memory_consumed_in_bytes,
    	NativeIntArray error,
    	StbVorbisAlloc alloc_buffer
    ) {
    	MemorySegment segment = stb_vorbis_open_pushdata(
    		datablock.memorySegment(),
    		datablock_length_in_bytes,
    		datablock_memory_consumed_in_bytes.memorySegment(),
    		error.memorySegment(),
    		alloc_buffer.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new StbVorbisHandle(segment);
    }
    
    public static int stb_vorbis_decode_frame_pushdata(
    	MemorySegment f,
    	MemorySegment datablock,
    	int datablock_length_in_bytes,
    	MemorySegment channels,
    	MemorySegment output,
    	MemorySegment samples
    ) {
    	MethodHandle method = STB_VORBIS_DECODE_FRAME_PUSHDATA.get();
    	try {
    		return (int) method.invokeExact(
    			f,
    			datablock,
    			datablock_length_in_bytes,
    			channels,
    			output,
    			samples
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#stb_vorbis_decode_frame_pushdata].
    public static int stb_vorbis_decode_frame_pushdata(
    	StbVorbisHandle f,
    	NativeByteArray datablock,
    	int datablock_length_in_bytes,
    	NativeIntArray channels,
    	NativePointerArray output,
    	NativeIntArray samples
    ) {
    	return stb_vorbis_decode_frame_pushdata(
    		f.memorySegment(),
    		datablock.memorySegment(),
    		datablock_length_in_bytes,
    		channels.memorySegment(),
    		output.memorySegment(),
    		samples.memorySegment()
    	);
    }
    
    public static void stb_vorbis_flush_pushdata(
    	MemorySegment f
    ) {
    	MethodHandle method = STB_VORBIS_FLUSH_PUSHDATA.get();
    	try {
    		 method.invokeExact(
    			f
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#stb_vorbis_flush_pushdata].
    public static void stb_vorbis_flush_pushdata(
    	StbVorbisHandle f
    ) {
    	stb_vorbis_flush_pushdata(
    		f.memorySegment()
    	);
    }
    
    public static int stb_vorbis_decode_filename(
    	MemorySegment filename,
    	MemorySegment channels,
    	MemorySegment sample_rate,
    	MemorySegment output
    ) {
    	MethodHandle method = STB_VORBIS_DECODE_FILENAME.get();
    	try {
    		return (int) method.invokeExact(
    			filename,
    			channels,
    			sample_rate,
    			output
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#stb_vorbis_decode_filename].
    public static int stb_vorbis_decode_filename(
    	String filename,
    	NativeIntArray channels,
    	NativeIntArray sample_rate,
    	NativePointerArray output
    ) {
    	try (Arena arena = MemoryStack.stackPush()) {
    		return stb_vorbis_decode_filename(
    			arena.allocateFrom(filename),
    			channels.memorySegment(),
    			sample_rate.memorySegment(),
    			output.memorySegment()
    		);
    	}
    }
    
    public static int stb_vorbis_decode_memory(
    	MemorySegment mem,
    	int len,
    	MemorySegment channels,
    	MemorySegment sample_rate,
    	MemorySegment output
    ) {
    	MethodHandle method = STB_VORBIS_DECODE_MEMORY.get();
    	try {
    		return (int) method.invokeExact(
    			mem,
    			len,
    			channels,
    			sample_rate,
    			output
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#stb_vorbis_decode_memory].
    public static int stb_vorbis_decode_memory(
    	NativeByteArray mem,
    	int len,
    	NativeIntArray channels,
    	NativeIntArray sample_rate,
    	NativePointerArray output
    ) {
    	return stb_vorbis_decode_memory(
    		mem.memorySegment(),
    		len,
    		channels.memorySegment(),
    		sample_rate.memorySegment(),
    		output.memorySegment()
    	);
    }
    
    public static MemorySegment stb_vorbis_open_memory(
    	MemorySegment data,
    	int len,
    	MemorySegment error,
    	MemorySegment alloc_buffer
    ) {
    	MethodHandle method = STB_VORBIS_OPEN_MEMORY.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			data,
    			len,
    			error,
    			alloc_buffer
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#stb_vorbis_open_memory].
    public static @Nullable StbVorbisHandle stb_vorbis_open_memory(
    	NativeByteArray data,
    	int len,
    	NativeIntArray error,
    	StbVorbisAlloc alloc_buffer
    ) {
    	MemorySegment segment = stb_vorbis_open_memory(
    		data.memorySegment(),
    		len,
    		error.memorySegment(),
    		alloc_buffer.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new StbVorbisHandle(segment);
    }
    
    public static int stb_vorbis_seek_frame(
    	MemorySegment f,
    	int sample_number
    ) {
    	MethodHandle method = STB_VORBIS_SEEK_FRAME.get();
    	try {
    		return (int) method.invokeExact(
    			f,
    			sample_number
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#stb_vorbis_seek_frame].
    public static int stb_vorbis_seek_frame(
    	StbVorbisHandle f,
    	int sample_number
    ) {
    	return stb_vorbis_seek_frame(
    		f.memorySegment(),
    		sample_number
    	);
    }
    
    public static int stb_vorbis_seek(
    	MemorySegment f,
    	int sample_number
    ) {
    	MethodHandle method = STB_VORBIS_SEEK.get();
    	try {
    		return (int) method.invokeExact(
    			f,
    			sample_number
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#stb_vorbis_seek].
    public static int stb_vorbis_seek(
    	StbVorbisHandle f,
    	int sample_number
    ) {
    	return stb_vorbis_seek(
    		f.memorySegment(),
    		sample_number
    	);
    }
    
    public static int stb_vorbis_seek_start(
    	MemorySegment f
    ) {
    	MethodHandle method = STB_VORBIS_SEEK_START.get();
    	try {
    		return (int) method.invokeExact(
    			f
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#stb_vorbis_seek_start].
    public static int stb_vorbis_seek_start(
    	StbVorbisHandle f
    ) {
    	return stb_vorbis_seek_start(
    		f.memorySegment()
    	);
    }
    
    public static int stb_vorbis_stream_length_in_samples(
    	MemorySegment f
    ) {
    	MethodHandle method = STB_VORBIS_STREAM_LENGTH_IN_SAMPLES.get();
    	try {
    		return (int) method.invokeExact(
    			f
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#stb_vorbis_stream_length_in_samples].
    public static int stb_vorbis_stream_length_in_samples(
    	StbVorbisHandle f
    ) {
    	return stb_vorbis_stream_length_in_samples(
    		f.memorySegment()
    	);
    }
    
    public static float stb_vorbis_stream_length_in_seconds(
    	MemorySegment f
    ) {
    	MethodHandle method = STB_VORBIS_STREAM_LENGTH_IN_SECONDS.get();
    	try {
    		return (float) method.invokeExact(
    			f
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#stb_vorbis_stream_length_in_seconds].
    public static float stb_vorbis_stream_length_in_seconds(
    	StbVorbisHandle f
    ) {
    	return stb_vorbis_stream_length_in_seconds(
    		f.memorySegment()
    	);
    }
    
    public static int stb_vorbis_get_frame_float(
    	MemorySegment f,
    	MemorySegment channels,
    	MemorySegment output
    ) {
    	MethodHandle method = STB_VORBIS_GET_FRAME_FLOAT.get();
    	try {
    		return (int) method.invokeExact(
    			f,
    			channels,
    			output
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#stb_vorbis_get_frame_float].
    public static int stb_vorbis_get_frame_float(
    	StbVorbisHandle f,
    	NativeIntArray channels,
    	NativePointerArray output
    ) {
    	return stb_vorbis_get_frame_float(
    		f.memorySegment(),
    		channels.memorySegment(),
    		output.memorySegment()
    	);
    }
    
    public static int stb_vorbis_get_frame_short_interleaved(
    	MemorySegment f,
    	int num_c,
    	MemorySegment buffer,
    	int num_shorts
    ) {
    	MethodHandle method = STB_VORBIS_GET_FRAME_SHORT_INTERLEAVED.get();
    	try {
    		return (int) method.invokeExact(
    			f,
    			num_c,
    			buffer,
    			num_shorts
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#stb_vorbis_get_frame_short_interleaved].
    public static int stb_vorbis_get_frame_short_interleaved(
    	StbVorbisHandle f,
    	int num_c,
    	NativeShortArray buffer,
    	int num_shorts
    ) {
    	return stb_vorbis_get_frame_short_interleaved(
    		f.memorySegment(),
    		num_c,
    		buffer.memorySegment(),
    		num_shorts
    	);
    }
    
    public static int stb_vorbis_get_frame_short(
    	MemorySegment f,
    	int num_c,
    	MemorySegment buffer,
    	int num_samples
    ) {
    	MethodHandle method = STB_VORBIS_GET_FRAME_SHORT.get();
    	try {
    		return (int) method.invokeExact(
    			f,
    			num_c,
    			buffer,
    			num_samples
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#stb_vorbis_get_frame_short].
    public static int stb_vorbis_get_frame_short(
    	StbVorbisHandle f,
    	int num_c,
    	NativePointerArray buffer,
    	int num_samples
    ) {
    	return stb_vorbis_get_frame_short(
    		f.memorySegment(),
    		num_c,
    		buffer.memorySegment(),
    		num_samples
    	);
    }
    
    public static int stb_vorbis_get_samples_float_interleaved(
    	MemorySegment f,
    	int channels,
    	MemorySegment buffer,
    	int num_floats
    ) {
    	MethodHandle method = STB_VORBIS_GET_SAMPLES_FLOAT_INTERLEAVED.get();
    	try {
    		return (int) method.invokeExact(
    			f,
    			channels,
    			buffer,
    			num_floats
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#stb_vorbis_get_samples_float_interleaved].
    public static int stb_vorbis_get_samples_float_interleaved(
    	StbVorbisHandle f,
    	int channels,
    	NativeFloatArray buffer,
    	int num_floats
    ) {
    	return stb_vorbis_get_samples_float_interleaved(
    		f.memorySegment(),
    		channels,
    		buffer.memorySegment(),
    		num_floats
    	);
    }
    
    public static int stb_vorbis_get_samples_float(
    	MemorySegment f,
    	int channels,
    	MemorySegment buffer,
    	int num_samples
    ) {
    	MethodHandle method = STB_VORBIS_GET_SAMPLES_FLOAT.get();
    	try {
    		return (int) method.invokeExact(
    			f,
    			channels,
    			buffer,
    			num_samples
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#stb_vorbis_get_samples_float].
    public static int stb_vorbis_get_samples_float(
    	StbVorbisHandle f,
    	int channels,
    	NativePointerArray buffer,
    	int num_samples
    ) {
    	return stb_vorbis_get_samples_float(
    		f.memorySegment(),
    		channels,
    		buffer.memorySegment(),
    		num_samples
    	);
    }
    
    public static int stb_vorbis_get_samples_short_interleaved(
    	MemorySegment f,
    	int channels,
    	MemorySegment buffer,
    	int num_shorts
    ) {
    	MethodHandle method = STB_VORBIS_GET_SAMPLES_SHORT_INTERLEAVED.get();
    	try {
    		return (int) method.invokeExact(
    			f,
    			channels,
    			buffer,
    			num_shorts
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#stb_vorbis_get_samples_short_interleaved].
    public static int stb_vorbis_get_samples_short_interleaved(
    	StbVorbisHandle f,
    	int channels,
    	NativeShortArray buffer,
    	int num_shorts
    ) {
    	return stb_vorbis_get_samples_short_interleaved(
    		f.memorySegment(),
    		channels,
    		buffer.memorySegment(),
    		num_shorts
    	);
    }
    
    public static int stb_vorbis_get_samples_short(
    	MemorySegment f,
    	int channels,
    	MemorySegment buffer,
    	int num_samples
    ) {
    	MethodHandle method = STB_VORBIS_GET_SAMPLES_SHORT.get();
    	try {
    		return (int) method.invokeExact(
    			f,
    			channels,
    			buffer,
    			num_samples
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#stb_vorbis_get_samples_short].
    public static int stb_vorbis_get_samples_short(
    	StbVorbisHandle f,
    	int channels,
    	NativePointerArray buffer,
    	int num_samples
    ) {
    	return stb_vorbis_get_samples_short(
    		f.memorySegment(),
    		channels,
    		buffer.memorySegment(),
    		num_samples
    	);
    }

}