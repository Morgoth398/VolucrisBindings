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

public final class StdVideoVP9ColorConfig
		implements Struct<StdVideoVP9ColorConfig> {

    public static final StructLayout LAYOUT;

    public static final VarHandle BIT_DEPTH_HANDLE;
    public static final VarHandle SUBSAMPLING_X_HANDLE;
    public static final VarHandle SUBSAMPLING_Y_HANDLE;
    public static final VarHandle RESERVED1_HANDLE;
    public static final VarHandle COLOR_SPACE_HANDLE;

    public static final long FLAGS_BYTE_OFFSET;
    public static final long BIT_DEPTH_BYTE_OFFSET;
    public static final long SUBSAMPLING_X_BYTE_OFFSET;
    public static final long SUBSAMPLING_Y_BYTE_OFFSET;
    public static final long RESERVED1_BYTE_OFFSET;
    public static final long COLOR_SPACE_BYTE_OFFSET;

    private final MemorySegment segment;

    private final StdVideoVP9ColorConfigFlags flags;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            StdVideoVP9ColorConfigFlags.LAYOUT.withName("flags"),
            JAVA_BYTE.withName("BitDepth"),
            JAVA_BYTE.withName("subsampling_x"),
            JAVA_BYTE.withName("subsampling_y"),
            JAVA_BYTE.withName("reserved1"),
            JAVA_INT.withName("color_space")
        ).withName("StdVideoVP9ColorConfig").withByteAlignment(4);
        
        BIT_DEPTH_HANDLE = LAYOUT.varHandle(PathElement.groupElement("BitDepth"));
        SUBSAMPLING_X_HANDLE = LAYOUT.varHandle(PathElement.groupElement("subsampling_x"));
        SUBSAMPLING_Y_HANDLE = LAYOUT.varHandle(PathElement.groupElement("subsampling_y"));
        RESERVED1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("reserved1"));
        COLOR_SPACE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("color_space"));
        
        FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
        BIT_DEPTH_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("BitDepth"));
        SUBSAMPLING_X_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("subsampling_x"));
        SUBSAMPLING_Y_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("subsampling_y"));
        RESERVED1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("reserved1"));
        COLOR_SPACE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("color_space"));
        //@formatter:on
    }

    public StdVideoVP9ColorConfig() {
        this(Arena.ofAuto());
    }
    
    public StdVideoVP9ColorConfig(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public StdVideoVP9ColorConfig(MemorySegment segment) {
        this.segment = segment;
    
        flags = new StdVideoVP9ColorConfigFlags(segment.asSlice(FLAGS_BYTE_OFFSET, StdVideoVP9ColorConfigFlags.LAYOUT));
    }

    /// @see #bitDepth()
    public StdVideoVP9ColorConfig bitDepth(byte bitDepth) {
    	BIT_DEPTH_HANDLE.set(segment, 0L, bitDepth);
    	return this;
    }
    
    public byte bitDepth() {
    	return (byte) BIT_DEPTH_HANDLE.get(segment, 0L);
    }
    
    /// @see #subsampling_x()
    public StdVideoVP9ColorConfig subsampling_x(byte subsampling_x) {
    	SUBSAMPLING_X_HANDLE.set(segment, 0L, subsampling_x);
    	return this;
    }
    
    public byte subsampling_x() {
    	return (byte) SUBSAMPLING_X_HANDLE.get(segment, 0L);
    }
    
    /// @see #subsampling_y()
    public StdVideoVP9ColorConfig subsampling_y(byte subsampling_y) {
    	SUBSAMPLING_Y_HANDLE.set(segment, 0L, subsampling_y);
    	return this;
    }
    
    public byte subsampling_y() {
    	return (byte) SUBSAMPLING_Y_HANDLE.get(segment, 0L);
    }
    
    /// @see #reserved1()
    public StdVideoVP9ColorConfig reserved1(byte reserved1) {
    	RESERVED1_HANDLE.set(segment, 0L, reserved1);
    	return this;
    }
    
    public byte reserved1() {
    	return (byte) RESERVED1_HANDLE.get(segment, 0L);
    }
    
    /// @see #color_space()
    public StdVideoVP9ColorConfig color_space(int color_space) {
    	COLOR_SPACE_HANDLE.set(segment, 0L, color_space);
    	return this;
    }
    
    public int color_space() {
    	return (int) COLOR_SPACE_HANDLE.get(segment, 0L);
    }
    
    /// @see #flags()
    public StdVideoVP9ColorConfig flags(Consumer<StdVideoVP9ColorConfigFlags> consumer) {
    	consumer.accept(flags);
    	return this;
    }
    
    /// @see #flags()
    public StdVideoVP9ColorConfig flags(StdVideoVP9ColorConfigFlags other) {
    	flags.set(other);
    	return this;
    }
    
    public StdVideoVP9ColorConfigFlags flags() {
    	return flags;
    }
    
    @Override
    public StdVideoVP9ColorConfig set(StdVideoVP9ColorConfig other) {
        return set(other.segment);
    }
    
    @Override
    public StdVideoVP9ColorConfig set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<StdVideoVP9ColorConfig> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<StdVideoVP9ColorConfig> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new StdVideoVP9ColorConfig(segment),
            count
        );
    }
    
    public static NativeStructArray<StdVideoVP9ColorConfig> array(Arena arena, StdVideoVP9ColorConfig... structs) {
        NativeStructArray<StdVideoVP9ColorConfig> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new StdVideoVP9ColorConfig(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<StdVideoVP9ColorConfig> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new StdVideoVP9ColorConfig(segment)
        );
    }
    
}