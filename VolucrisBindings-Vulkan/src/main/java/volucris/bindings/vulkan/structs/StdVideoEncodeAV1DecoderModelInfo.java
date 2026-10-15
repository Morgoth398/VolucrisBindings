/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;

public final class StdVideoEncodeAV1DecoderModelInfo
		implements Struct<StdVideoEncodeAV1DecoderModelInfo> {

	public static final StructLayout LAYOUT;

	public static final VarHandle BUFFER_DELAY_LENGTH_MINUS_1_HANDLE;
	public static final VarHandle BUFFER_REMOVAL_TIME_LENGTH_MINUS_1_HANDLE;
	public static final VarHandle FRAME_PRESENTATION_TIME_LENGTH_MINUS_1_HANDLE;
	public static final VarHandle RESERVED1_HANDLE;
	public static final VarHandle NUM_UNITS_IN_DECODING_TICK_HANDLE;

	public static final long BUFFER_DELAY_LENGTH_MINUS_1_BYTE_OFFSET;
	public static final long BUFFER_REMOVAL_TIME_LENGTH_MINUS_1_BYTE_OFFSET;
	public static final long FRAME_PRESENTATION_TIME_LENGTH_MINUS_1_BYTE_OFFSET;
	public static final long RESERVED1_BYTE_OFFSET;
	public static final long NUM_UNITS_IN_DECODING_TICK_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_BYTE.withName("buffer_delay_length_minus_1"),
		    JAVA_BYTE.withName("buffer_removal_time_length_minus_1"),
		    JAVA_BYTE.withName("frame_presentation_time_length_minus_1"),
		    JAVA_BYTE.withName("reserved1"),
		    JAVA_INT.withName("num_units_in_decoding_tick")
		).withName("StdVideoEncodeAV1DecoderModelInfo").withByteAlignment(4);
		
		BUFFER_DELAY_LENGTH_MINUS_1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("buffer_delay_length_minus_1"));
		BUFFER_REMOVAL_TIME_LENGTH_MINUS_1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("buffer_removal_time_length_minus_1"));
		FRAME_PRESENTATION_TIME_LENGTH_MINUS_1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("frame_presentation_time_length_minus_1"));
		RESERVED1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("reserved1"));
		NUM_UNITS_IN_DECODING_TICK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("num_units_in_decoding_tick"));
		
		BUFFER_DELAY_LENGTH_MINUS_1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("buffer_delay_length_minus_1"));
		BUFFER_REMOVAL_TIME_LENGTH_MINUS_1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("buffer_removal_time_length_minus_1"));
		FRAME_PRESENTATION_TIME_LENGTH_MINUS_1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("frame_presentation_time_length_minus_1"));
		RESERVED1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("reserved1"));
		NUM_UNITS_IN_DECODING_TICK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("num_units_in_decoding_tick"));
		//@formatter:on
	}

	public StdVideoEncodeAV1DecoderModelInfo() {
	    this(Arena.ofAuto());
	}
	
	public StdVideoEncodeAV1DecoderModelInfo(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public StdVideoEncodeAV1DecoderModelInfo(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #buffer_delay_length_minus_1()
    public StdVideoEncodeAV1DecoderModelInfo buffer_delay_length_minus_1(byte buffer_delay_length_minus_1) {
    	BUFFER_DELAY_LENGTH_MINUS_1_HANDLE.set(segment, 0L, buffer_delay_length_minus_1);
    	return this;
    }
    
    public byte buffer_delay_length_minus_1() {
    	return (byte) BUFFER_DELAY_LENGTH_MINUS_1_HANDLE.get(segment, 0L);
    }
    
    /// @see #buffer_removal_time_length_minus_1()
    public StdVideoEncodeAV1DecoderModelInfo buffer_removal_time_length_minus_1(byte buffer_removal_time_length_minus_1) {
    	BUFFER_REMOVAL_TIME_LENGTH_MINUS_1_HANDLE.set(segment, 0L, buffer_removal_time_length_minus_1);
    	return this;
    }
    
    public byte buffer_removal_time_length_minus_1() {
    	return (byte) BUFFER_REMOVAL_TIME_LENGTH_MINUS_1_HANDLE.get(segment, 0L);
    }
    
    /// @see #frame_presentation_time_length_minus_1()
    public StdVideoEncodeAV1DecoderModelInfo frame_presentation_time_length_minus_1(byte frame_presentation_time_length_minus_1) {
    	FRAME_PRESENTATION_TIME_LENGTH_MINUS_1_HANDLE.set(segment, 0L, frame_presentation_time_length_minus_1);
    	return this;
    }
    
    public byte frame_presentation_time_length_minus_1() {
    	return (byte) FRAME_PRESENTATION_TIME_LENGTH_MINUS_1_HANDLE.get(segment, 0L);
    }
    
    /// @see #reserved1()
    public StdVideoEncodeAV1DecoderModelInfo reserved1(byte reserved1) {
    	RESERVED1_HANDLE.set(segment, 0L, reserved1);
    	return this;
    }
    
    public byte reserved1() {
    	return (byte) RESERVED1_HANDLE.get(segment, 0L);
    }
    
    /// @see #num_units_in_decoding_tick()
    public StdVideoEncodeAV1DecoderModelInfo num_units_in_decoding_tick(int num_units_in_decoding_tick) {
    	NUM_UNITS_IN_DECODING_TICK_HANDLE.set(segment, 0L, num_units_in_decoding_tick);
    	return this;
    }
    
    public int num_units_in_decoding_tick() {
    	return (int) NUM_UNITS_IN_DECODING_TICK_HANDLE.get(segment, 0L);
    }
    
    @Override
    public StdVideoEncodeAV1DecoderModelInfo set(StdVideoEncodeAV1DecoderModelInfo other) {
        return set(other.segment);
    }
    
    @Override
    public StdVideoEncodeAV1DecoderModelInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<StdVideoEncodeAV1DecoderModelInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<StdVideoEncodeAV1DecoderModelInfo> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new StdVideoEncodeAV1DecoderModelInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<StdVideoEncodeAV1DecoderModelInfo> array(Arena arena, StdVideoEncodeAV1DecoderModelInfo... structs) {
        NativeStructArray<StdVideoEncodeAV1DecoderModelInfo> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new StdVideoEncodeAV1DecoderModelInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<StdVideoEncodeAV1DecoderModelInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new StdVideoEncodeAV1DecoderModelInfo(segment)
        );
    }

}