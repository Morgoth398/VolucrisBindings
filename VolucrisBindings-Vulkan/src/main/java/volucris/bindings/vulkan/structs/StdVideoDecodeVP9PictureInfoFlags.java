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

public final class StdVideoDecodeVP9PictureInfoFlags
		implements Struct<StdVideoDecodeVP9PictureInfoFlags> {

	public static final StructLayout LAYOUT;

	public static final VarHandle BIT_FIELDS0_HANDLE;

	public static final long BIT_FIELDS0_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("bitFields0")
		).withName("StdVideoDecodeVP9PictureInfoFlags").withByteAlignment(4);
		
		BIT_FIELDS0_HANDLE = LAYOUT.varHandle(PathElement.groupElement("bitFields0"));
		
		BIT_FIELDS0_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("bitFields0"));
		//@formatter:on
	}

	public StdVideoDecodeVP9PictureInfoFlags() {
	    this(Arena.ofAuto());
	}
	
	public StdVideoDecodeVP9PictureInfoFlags(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public StdVideoDecodeVP9PictureInfoFlags(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #bitFields0()
    public StdVideoDecodeVP9PictureInfoFlags bitFields0(int bitFields0) {
    	BIT_FIELDS0_HANDLE.set(segment, 0L, bitFields0);
    	return this;
    }
    
    /// ```
    /// All bit fields contained in this field with their bit width:
    /// error_resilient_mode : 1
    /// intra_only : 1
    /// allow_high_precision_mv : 1
    /// refresh_frame_context : 1
    /// frame_parallel_decoding_mode : 1
    /// segmentation_enabled : 1
    /// show_frame : 1
    /// UsePrevFrameMvs : 1
    /// reserved : 24
    /// ```
    public int bitFields0() {
    	return (int) BIT_FIELDS0_HANDLE.get(segment, 0L);
    }
    
    @Override
    public StdVideoDecodeVP9PictureInfoFlags set(StdVideoDecodeVP9PictureInfoFlags other) {
        return set(other.segment);
    }
    
    @Override
    public StdVideoDecodeVP9PictureInfoFlags set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<StdVideoDecodeVP9PictureInfoFlags> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<StdVideoDecodeVP9PictureInfoFlags> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new StdVideoDecodeVP9PictureInfoFlags(segment),
            count
        );
    }
    
    public static NativeStructArray<StdVideoDecodeVP9PictureInfoFlags> array(Arena arena, StdVideoDecodeVP9PictureInfoFlags... structs) {
        NativeStructArray<StdVideoDecodeVP9PictureInfoFlags> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new StdVideoDecodeVP9PictureInfoFlags(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<StdVideoDecodeVP9PictureInfoFlags> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new StdVideoDecodeVP9PictureInfoFlags(segment)
        );
    }

}