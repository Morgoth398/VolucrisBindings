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

public final class StdVideoAV1LoopFilter
		implements Struct<StdVideoAV1LoopFilter> {

	public static final StructLayout LAYOUT;

	public static final VarHandle LOOP_FILTER_LEVEL_HANDLE;
	public static final VarHandle LOOP_FILTER_SHARPNESS_HANDLE;
	public static final VarHandle UPDATE_REF_DELTA_HANDLE;
	public static final VarHandle LOOP_FILTER_REF_DELTAS_HANDLE;
	public static final VarHandle UPDATE_MODE_DELTA_HANDLE;
	public static final VarHandle LOOP_FILTER_MODE_DELTAS_HANDLE;

	public static final long FLAGS_BYTE_OFFSET;
	public static final long LOOP_FILTER_LEVEL_BYTE_OFFSET;
	public static final long LOOP_FILTER_SHARPNESS_BYTE_OFFSET;
	public static final long UPDATE_REF_DELTA_BYTE_OFFSET;
	public static final long LOOP_FILTER_REF_DELTAS_BYTE_OFFSET;
	public static final long UPDATE_MODE_DELTA_BYTE_OFFSET;
	public static final long LOOP_FILTER_MODE_DELTAS_BYTE_OFFSET;

	private final MemorySegment segment;

	private final StdVideoAV1LoopFilterFlags flags;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    StdVideoAV1LoopFilterFlags.LAYOUT.withName("flags"),
		    MemoryLayout.sequenceLayout(4, JAVA_BYTE).withName("loop_filter_level"),
		    JAVA_BYTE.withName("loop_filter_sharpness"),
		    JAVA_BYTE.withName("update_ref_delta"),
		    MemoryLayout.sequenceLayout(8, JAVA_BYTE).withName("loop_filter_ref_deltas"),
		    JAVA_BYTE.withName("update_mode_delta"),
		    MemoryLayout.sequenceLayout(2, JAVA_BYTE).withName("loop_filter_mode_deltas"),
		    MemoryLayout.paddingLayout(3)
		).withName("StdVideoAV1LoopFilter").withByteAlignment(4);
		
		LOOP_FILTER_LEVEL_HANDLE = LAYOUT.varHandle(PathElement.groupElement("loop_filter_level"), PathElement.sequenceElement());
		LOOP_FILTER_SHARPNESS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("loop_filter_sharpness"));
		UPDATE_REF_DELTA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("update_ref_delta"));
		LOOP_FILTER_REF_DELTAS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("loop_filter_ref_deltas"), PathElement.sequenceElement());
		UPDATE_MODE_DELTA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("update_mode_delta"));
		LOOP_FILTER_MODE_DELTAS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("loop_filter_mode_deltas"), PathElement.sequenceElement());
		
		FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
		LOOP_FILTER_LEVEL_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("loop_filter_level"));
		LOOP_FILTER_SHARPNESS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("loop_filter_sharpness"));
		UPDATE_REF_DELTA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("update_ref_delta"));
		LOOP_FILTER_REF_DELTAS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("loop_filter_ref_deltas"));
		UPDATE_MODE_DELTA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("update_mode_delta"));
		LOOP_FILTER_MODE_DELTAS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("loop_filter_mode_deltas"));
		//@formatter:on
	}

	public StdVideoAV1LoopFilter() {
	    this(Arena.ofAuto());
	}
	
	public StdVideoAV1LoopFilter(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public StdVideoAV1LoopFilter(MemorySegment segment) {
	    this.segment = segment;
	
	    flags = new StdVideoAV1LoopFilterFlags(segment.asSlice(FLAGS_BYTE_OFFSET, StdVideoAV1LoopFilterFlags.LAYOUT));
	}

    /// @see #flags()
    public StdVideoAV1LoopFilter flags(Consumer<StdVideoAV1LoopFilterFlags> consumer) {
    	consumer.accept(flags);
    	return this;
    }
    
    /// @see #flags()
    public StdVideoAV1LoopFilter flags(StdVideoAV1LoopFilterFlags other) {
    	flags.set(other);
    	return this;
    }
    
    public StdVideoAV1LoopFilterFlags flags() {
    	return flags;
    }
    
    /// @see #loop_filter_level(int)
    public StdVideoAV1LoopFilter loop_filter_level(byte loop_filter_level, int index0) {
    	LOOP_FILTER_LEVEL_HANDLE.set(segment, 0L, index0, loop_filter_level);
    	return this;
    }
    
    public byte loop_filter_level(int index0) {
    	return (byte) LOOP_FILTER_LEVEL_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #loop_filter_sharpness()
    public StdVideoAV1LoopFilter loop_filter_sharpness(byte loop_filter_sharpness) {
    	LOOP_FILTER_SHARPNESS_HANDLE.set(segment, 0L, loop_filter_sharpness);
    	return this;
    }
    
    public byte loop_filter_sharpness() {
    	return (byte) LOOP_FILTER_SHARPNESS_HANDLE.get(segment, 0L);
    }
    
    /// @see #update_ref_delta()
    public StdVideoAV1LoopFilter update_ref_delta(byte update_ref_delta) {
    	UPDATE_REF_DELTA_HANDLE.set(segment, 0L, update_ref_delta);
    	return this;
    }
    
    public byte update_ref_delta() {
    	return (byte) UPDATE_REF_DELTA_HANDLE.get(segment, 0L);
    }
    
    /// @see #loop_filter_ref_deltas(int)
    public StdVideoAV1LoopFilter loop_filter_ref_deltas(byte loop_filter_ref_deltas, int index0) {
    	LOOP_FILTER_REF_DELTAS_HANDLE.set(segment, 0L, index0, loop_filter_ref_deltas);
    	return this;
    }
    
    public byte loop_filter_ref_deltas(int index0) {
    	return (byte) LOOP_FILTER_REF_DELTAS_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #update_mode_delta()
    public StdVideoAV1LoopFilter update_mode_delta(byte update_mode_delta) {
    	UPDATE_MODE_DELTA_HANDLE.set(segment, 0L, update_mode_delta);
    	return this;
    }
    
    public byte update_mode_delta() {
    	return (byte) UPDATE_MODE_DELTA_HANDLE.get(segment, 0L);
    }
    
    /// @see #loop_filter_mode_deltas(int)
    public StdVideoAV1LoopFilter loop_filter_mode_deltas(byte loop_filter_mode_deltas, int index0) {
    	LOOP_FILTER_MODE_DELTAS_HANDLE.set(segment, 0L, index0, loop_filter_mode_deltas);
    	return this;
    }
    
    public byte loop_filter_mode_deltas(int index0) {
    	return (byte) LOOP_FILTER_MODE_DELTAS_HANDLE.get(segment, 0L, index0);
    }
    
    @Override
    public StdVideoAV1LoopFilter set(StdVideoAV1LoopFilter other) {
        return set(other.segment);
    }
    
    @Override
    public StdVideoAV1LoopFilter set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<StdVideoAV1LoopFilter> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<StdVideoAV1LoopFilter> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new StdVideoAV1LoopFilter(segment),
            count
        );
    }
    
    public static NativeStructArray<StdVideoAV1LoopFilter> array(Arena arena, StdVideoAV1LoopFilter... structs) {
        NativeStructArray<StdVideoAV1LoopFilter> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new StdVideoAV1LoopFilter(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<StdVideoAV1LoopFilter> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new StdVideoAV1LoopFilter(segment)
        );
    }

}