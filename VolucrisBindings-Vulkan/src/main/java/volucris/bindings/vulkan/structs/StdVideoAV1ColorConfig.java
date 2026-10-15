/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;

public final class StdVideoAV1ColorConfig
		implements Struct<StdVideoAV1ColorConfig> {

	public static final StructLayout LAYOUT;

	public static final VarHandle BIT_DEPTH_HANDLE;
	public static final VarHandle SUBSAMPLING_X_HANDLE;
	public static final VarHandle SUBSAMPLING_Y_HANDLE;
	public static final VarHandle RESERVED1_HANDLE;
	public static final VarHandle COLOR_PRIMARIES_HANDLE;
	public static final VarHandle TRANSFER_CHARACTERISTICS_HANDLE;
	public static final VarHandle MATRIX_COEFFICIENTS_HANDLE;
	public static final VarHandle CHROMA_SAMPLE_POSITION_HANDLE;

	public static final long FLAGS_BYTE_OFFSET;
	public static final long BIT_DEPTH_BYTE_OFFSET;
	public static final long SUBSAMPLING_X_BYTE_OFFSET;
	public static final long SUBSAMPLING_Y_BYTE_OFFSET;
	public static final long RESERVED1_BYTE_OFFSET;
	public static final long COLOR_PRIMARIES_BYTE_OFFSET;
	public static final long TRANSFER_CHARACTERISTICS_BYTE_OFFSET;
	public static final long MATRIX_COEFFICIENTS_BYTE_OFFSET;
	public static final long CHROMA_SAMPLE_POSITION_BYTE_OFFSET;

	private final MemorySegment segment;

	private final StdVideoAV1ColorConfigFlags flags;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    StdVideoAV1ColorConfigFlags.LAYOUT.withName("flags"),
		    JAVA_BYTE.withName("BitDepth"),
		    JAVA_BYTE.withName("subsampling_x"),
		    JAVA_BYTE.withName("subsampling_y"),
		    JAVA_BYTE.withName("reserved1"),
		    JAVA_INT.withName("color_primaries"),
		    JAVA_INT.withName("transfer_characteristics"),
		    JAVA_INT.withName("matrix_coefficients"),
		    JAVA_INT.withName("chroma_sample_position")
		).withName("StdVideoAV1ColorConfig").withByteAlignment(4);
		
		BIT_DEPTH_HANDLE = LAYOUT.varHandle(PathElement.groupElement("BitDepth"));
		SUBSAMPLING_X_HANDLE = LAYOUT.varHandle(PathElement.groupElement("subsampling_x"));
		SUBSAMPLING_Y_HANDLE = LAYOUT.varHandle(PathElement.groupElement("subsampling_y"));
		RESERVED1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("reserved1"));
		COLOR_PRIMARIES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("color_primaries"));
		TRANSFER_CHARACTERISTICS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("transfer_characteristics"));
		MATRIX_COEFFICIENTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("matrix_coefficients"));
		CHROMA_SAMPLE_POSITION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("chroma_sample_position"));
		
		FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
		BIT_DEPTH_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("BitDepth"));
		SUBSAMPLING_X_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("subsampling_x"));
		SUBSAMPLING_Y_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("subsampling_y"));
		RESERVED1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("reserved1"));
		COLOR_PRIMARIES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("color_primaries"));
		TRANSFER_CHARACTERISTICS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("transfer_characteristics"));
		MATRIX_COEFFICIENTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("matrix_coefficients"));
		CHROMA_SAMPLE_POSITION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("chroma_sample_position"));
		//@formatter:on
	}

	public StdVideoAV1ColorConfig() {
	    this(Arena.ofAuto());
	}
	
	public StdVideoAV1ColorConfig(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public StdVideoAV1ColorConfig(MemorySegment segment) {
	    this.segment = segment;
	
	    flags = new StdVideoAV1ColorConfigFlags(segment.asSlice(FLAGS_BYTE_OFFSET, StdVideoAV1ColorConfigFlags.LAYOUT));
	}

    /// @see #flags()
    public StdVideoAV1ColorConfig flags(Consumer<StdVideoAV1ColorConfigFlags> consumer) {
    	consumer.accept(flags);
    	return this;
    }
    
    /// @see #flags()
    public StdVideoAV1ColorConfig flags(StdVideoAV1ColorConfigFlags other) {
    	flags.set(other);
    	return this;
    }
    
    public StdVideoAV1ColorConfigFlags flags() {
    	return flags;
    }
    
    /// @see #bitDepth()
    public StdVideoAV1ColorConfig bitDepth(byte bitDepth) {
    	BIT_DEPTH_HANDLE.set(segment, 0L, bitDepth);
    	return this;
    }
    
    public byte bitDepth() {
    	return (byte) BIT_DEPTH_HANDLE.get(segment, 0L);
    }
    
    /// @see #subsampling_x()
    public StdVideoAV1ColorConfig subsampling_x(byte subsampling_x) {
    	SUBSAMPLING_X_HANDLE.set(segment, 0L, subsampling_x);
    	return this;
    }
    
    public byte subsampling_x() {
    	return (byte) SUBSAMPLING_X_HANDLE.get(segment, 0L);
    }
    
    /// @see #subsampling_y()
    public StdVideoAV1ColorConfig subsampling_y(byte subsampling_y) {
    	SUBSAMPLING_Y_HANDLE.set(segment, 0L, subsampling_y);
    	return this;
    }
    
    public byte subsampling_y() {
    	return (byte) SUBSAMPLING_Y_HANDLE.get(segment, 0L);
    }
    
    /// @see #reserved1()
    public StdVideoAV1ColorConfig reserved1(byte reserved1) {
    	RESERVED1_HANDLE.set(segment, 0L, reserved1);
    	return this;
    }
    
    public byte reserved1() {
    	return (byte) RESERVED1_HANDLE.get(segment, 0L);
    }
    
    /// @see #color_primaries()
    public StdVideoAV1ColorConfig color_primaries(int color_primaries) {
    	COLOR_PRIMARIES_HANDLE.set(segment, 0L, color_primaries);
    	return this;
    }
    
    public int color_primaries() {
    	return (int) COLOR_PRIMARIES_HANDLE.get(segment, 0L);
    }
    
    /// @see #transfer_characteristics()
    public StdVideoAV1ColorConfig transfer_characteristics(int transfer_characteristics) {
    	TRANSFER_CHARACTERISTICS_HANDLE.set(segment, 0L, transfer_characteristics);
    	return this;
    }
    
    public int transfer_characteristics() {
    	return (int) TRANSFER_CHARACTERISTICS_HANDLE.get(segment, 0L);
    }
    
    /// @see #matrix_coefficients()
    public StdVideoAV1ColorConfig matrix_coefficients(int matrix_coefficients) {
    	MATRIX_COEFFICIENTS_HANDLE.set(segment, 0L, matrix_coefficients);
    	return this;
    }
    
    public int matrix_coefficients() {
    	return (int) MATRIX_COEFFICIENTS_HANDLE.get(segment, 0L);
    }
    
    /// @see #chroma_sample_position()
    public StdVideoAV1ColorConfig chroma_sample_position(int chroma_sample_position) {
    	CHROMA_SAMPLE_POSITION_HANDLE.set(segment, 0L, chroma_sample_position);
    	return this;
    }
    
    public int chroma_sample_position() {
    	return (int) CHROMA_SAMPLE_POSITION_HANDLE.get(segment, 0L);
    }
    
    @Override
    public StdVideoAV1ColorConfig set(StdVideoAV1ColorConfig other) {
        return set(other.segment);
    }
    
    @Override
    public StdVideoAV1ColorConfig set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<StdVideoAV1ColorConfig> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<StdVideoAV1ColorConfig> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new StdVideoAV1ColorConfig(segment),
            count
        );
    }
    
    public static NativeStructArray<StdVideoAV1ColorConfig> array(Arena arena, StdVideoAV1ColorConfig... structs) {
        NativeStructArray<StdVideoAV1ColorConfig> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new StdVideoAV1ColorConfig(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<StdVideoAV1ColorConfig> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new StdVideoAV1ColorConfig(segment)
        );
    }

}