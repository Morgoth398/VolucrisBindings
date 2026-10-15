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

public final class StdVideoVP9LoopFilter
		implements Struct<StdVideoVP9LoopFilter> {

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

	private final StdVideoVP9LoopFilterFlags flags;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    StdVideoVP9LoopFilterFlags.LAYOUT.withName("flags"),
		    JAVA_BYTE.withName("loop_filter_level"),
		    JAVA_BYTE.withName("loop_filter_sharpness"),
		    JAVA_BYTE.withName("update_ref_delta"),
		    MemoryLayout.sequenceLayout(4, JAVA_BYTE).withName("loop_filter_ref_deltas"),
		    JAVA_BYTE.withName("update_mode_delta"),
		    MemoryLayout.sequenceLayout(2, JAVA_BYTE).withName("loop_filter_mode_deltas"),
		    MemoryLayout.paddingLayout(2)
		).withName("StdVideoVP9LoopFilter").withByteAlignment(4);
		
		LOOP_FILTER_LEVEL_HANDLE = LAYOUT.varHandle(PathElement.groupElement("loop_filter_level"));
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

	public StdVideoVP9LoopFilter() {
	    this(Arena.ofAuto());
	}
	
	public StdVideoVP9LoopFilter(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public StdVideoVP9LoopFilter(MemorySegment segment) {
	    this.segment = segment;
	
	    flags = new StdVideoVP9LoopFilterFlags(segment.asSlice(FLAGS_BYTE_OFFSET, StdVideoVP9LoopFilterFlags.LAYOUT));
	}

    /// @see #flags()
    public StdVideoVP9LoopFilter flags(Consumer<StdVideoVP9LoopFilterFlags> consumer) {
    	consumer.accept(flags);
    	return this;
    }
    
    /// @see #flags()
    public StdVideoVP9LoopFilter flags(StdVideoVP9LoopFilterFlags other) {
    	flags.set(other);
    	return this;
    }
    
    public StdVideoVP9LoopFilterFlags flags() {
    	return flags;
    }
    
    /// @see #loop_filter_level()
    public StdVideoVP9LoopFilter loop_filter_level(byte loop_filter_level) {
    	LOOP_FILTER_LEVEL_HANDLE.set(segment, 0L, loop_filter_level);
    	return this;
    }
    
    public byte loop_filter_level() {
    	return (byte) LOOP_FILTER_LEVEL_HANDLE.get(segment, 0L);
    }
    
    /// @see #loop_filter_sharpness()
    public StdVideoVP9LoopFilter loop_filter_sharpness(byte loop_filter_sharpness) {
    	LOOP_FILTER_SHARPNESS_HANDLE.set(segment, 0L, loop_filter_sharpness);
    	return this;
    }
    
    public byte loop_filter_sharpness() {
    	return (byte) LOOP_FILTER_SHARPNESS_HANDLE.get(segment, 0L);
    }
    
    /// @see #update_ref_delta()
    public StdVideoVP9LoopFilter update_ref_delta(byte update_ref_delta) {
    	UPDATE_REF_DELTA_HANDLE.set(segment, 0L, update_ref_delta);
    	return this;
    }
    
    public byte update_ref_delta() {
    	return (byte) UPDATE_REF_DELTA_HANDLE.get(segment, 0L);
    }
    
    /// @see #loop_filter_ref_deltas(int)
    public StdVideoVP9LoopFilter loop_filter_ref_deltas(byte loop_filter_ref_deltas, int index0) {
    	LOOP_FILTER_REF_DELTAS_HANDLE.set(segment, 0L, index0, loop_filter_ref_deltas);
    	return this;
    }
    
    public byte loop_filter_ref_deltas(int index0) {
    	return (byte) LOOP_FILTER_REF_DELTAS_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #update_mode_delta()
    public StdVideoVP9LoopFilter update_mode_delta(byte update_mode_delta) {
    	UPDATE_MODE_DELTA_HANDLE.set(segment, 0L, update_mode_delta);
    	return this;
    }
    
    public byte update_mode_delta() {
    	return (byte) UPDATE_MODE_DELTA_HANDLE.get(segment, 0L);
    }
    
    /// @see #loop_filter_mode_deltas(int)
    public StdVideoVP9LoopFilter loop_filter_mode_deltas(byte loop_filter_mode_deltas, int index0) {
    	LOOP_FILTER_MODE_DELTAS_HANDLE.set(segment, 0L, index0, loop_filter_mode_deltas);
    	return this;
    }
    
    public byte loop_filter_mode_deltas(int index0) {
    	return (byte) LOOP_FILTER_MODE_DELTAS_HANDLE.get(segment, 0L, index0);
    }
    
    @Override
    public StdVideoVP9LoopFilter set(StdVideoVP9LoopFilter other) {
        return set(other.segment);
    }
    
    @Override
    public StdVideoVP9LoopFilter set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<StdVideoVP9LoopFilter> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<StdVideoVP9LoopFilter> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new StdVideoVP9LoopFilter(segment),
            count
        );
    }
    
    public static NativeStructArray<StdVideoVP9LoopFilter> array(Arena arena, StdVideoVP9LoopFilter... structs) {
        NativeStructArray<StdVideoVP9LoopFilter> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new StdVideoVP9LoopFilter(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<StdVideoVP9LoopFilter> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new StdVideoVP9LoopFilter(segment)
        );
    }

}