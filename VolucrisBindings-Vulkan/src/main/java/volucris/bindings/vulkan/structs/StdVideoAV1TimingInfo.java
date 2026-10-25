/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;

public final class StdVideoAV1TimingInfo
		implements Struct<StdVideoAV1TimingInfo> {

	public static final StructLayout LAYOUT;

	public static final VarHandle NUM_UNITS_IN_DISPLAY_TICK_HANDLE;
	public static final VarHandle TIME_SCALE_HANDLE;
	public static final VarHandle NUM_TICKS_PER_PICTURE_MINUS_1_HANDLE;

	public static final long FLAGS_BYTE_OFFSET;
	public static final long NUM_UNITS_IN_DISPLAY_TICK_BYTE_OFFSET;
	public static final long TIME_SCALE_BYTE_OFFSET;
	public static final long NUM_TICKS_PER_PICTURE_MINUS_1_BYTE_OFFSET;

	private final MemorySegment segment;

	private final StdVideoAV1TimingInfoFlags flags;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    StdVideoAV1TimingInfoFlags.LAYOUT.withName("flags"),
		    JAVA_INT.withName("num_units_in_display_tick"),
		    JAVA_INT.withName("time_scale"),
		    JAVA_INT.withName("num_ticks_per_picture_minus_1")
		).withName("StdVideoAV1TimingInfo").withByteAlignment(4);
		
		NUM_UNITS_IN_DISPLAY_TICK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("num_units_in_display_tick"));
		TIME_SCALE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("time_scale"));
		NUM_TICKS_PER_PICTURE_MINUS_1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("num_ticks_per_picture_minus_1"));
		
		FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
		NUM_UNITS_IN_DISPLAY_TICK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("num_units_in_display_tick"));
		TIME_SCALE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("time_scale"));
		NUM_TICKS_PER_PICTURE_MINUS_1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("num_ticks_per_picture_minus_1"));
		//@formatter:on
	}

	public StdVideoAV1TimingInfo() {
	    this(Arena.ofAuto());
	}
	
	public StdVideoAV1TimingInfo(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public StdVideoAV1TimingInfo(MemorySegment segment) {
	    this.segment = segment;
	
	    flags = new StdVideoAV1TimingInfoFlags(segment.asSlice(FLAGS_BYTE_OFFSET, StdVideoAV1TimingInfoFlags.LAYOUT));
	}

    /// @see #flags()
    public StdVideoAV1TimingInfo flags(Consumer<StdVideoAV1TimingInfoFlags> consumer) {
    	consumer.accept(flags);
    	return this;
    }
    
    /// @see #flags()
    public StdVideoAV1TimingInfo flags(StdVideoAV1TimingInfoFlags other) {
    	flags.set(other);
    	return this;
    }
    
    public StdVideoAV1TimingInfoFlags flags() {
    	return flags;
    }
    
    /// @see #num_units_in_display_tick()
    public StdVideoAV1TimingInfo num_units_in_display_tick(int num_units_in_display_tick) {
    	NUM_UNITS_IN_DISPLAY_TICK_HANDLE.set(segment, 0L, num_units_in_display_tick);
    	return this;
    }
    
    public int num_units_in_display_tick() {
    	return (int) NUM_UNITS_IN_DISPLAY_TICK_HANDLE.get(segment, 0L);
    }
    
    /// @see #time_scale()
    public StdVideoAV1TimingInfo time_scale(int time_scale) {
    	TIME_SCALE_HANDLE.set(segment, 0L, time_scale);
    	return this;
    }
    
    public int time_scale() {
    	return (int) TIME_SCALE_HANDLE.get(segment, 0L);
    }
    
    /// @see #num_ticks_per_picture_minus_1()
    public StdVideoAV1TimingInfo num_ticks_per_picture_minus_1(int num_ticks_per_picture_minus_1) {
    	NUM_TICKS_PER_PICTURE_MINUS_1_HANDLE.set(segment, 0L, num_ticks_per_picture_minus_1);
    	return this;
    }
    
    public int num_ticks_per_picture_minus_1() {
    	return (int) NUM_TICKS_PER_PICTURE_MINUS_1_HANDLE.get(segment, 0L);
    }
    
    @Override
    public StdVideoAV1TimingInfo set(StdVideoAV1TimingInfo other) {
        return set(other.segment);
    }
    
    @Override
    public StdVideoAV1TimingInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<StdVideoAV1TimingInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<StdVideoAV1TimingInfo> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new StdVideoAV1TimingInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<StdVideoAV1TimingInfo> array(SegmentAllocator allocator, StdVideoAV1TimingInfo... structs) {
        NativeStructArray<StdVideoAV1TimingInfo> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new StdVideoAV1TimingInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<StdVideoAV1TimingInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new StdVideoAV1TimingInfo(segment)
        );
    }

}