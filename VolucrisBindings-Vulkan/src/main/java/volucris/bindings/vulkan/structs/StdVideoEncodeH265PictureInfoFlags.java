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

public final class StdVideoEncodeH265PictureInfoFlags
		implements Struct<StdVideoEncodeH265PictureInfoFlags> {

	public static final StructLayout LAYOUT;

	public static final VarHandle BIT_FIELDS0_HANDLE;

	public static final long BIT_FIELDS0_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("bitFields0")
		).withName("StdVideoEncodeH265PictureInfoFlags").withByteAlignment(4);
		
		BIT_FIELDS0_HANDLE = LAYOUT.varHandle(PathElement.groupElement("bitFields0"));
		
		BIT_FIELDS0_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("bitFields0"));
		//@formatter:on
	}

	public StdVideoEncodeH265PictureInfoFlags() {
	    this(Arena.ofAuto());
	}
	
	public StdVideoEncodeH265PictureInfoFlags(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public StdVideoEncodeH265PictureInfoFlags(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #bitFields0()
    public StdVideoEncodeH265PictureInfoFlags bitFields0(int bitFields0) {
    	BIT_FIELDS0_HANDLE.set(segment, 0L, bitFields0);
    	return this;
    }
    
    /// ```
    /// All bit fields contained in this field with their bit width:
    /// is_reference : 1
    /// IrapPicFlag : 1
    /// used_for_long_term_reference : 1
    /// discardable_flag : 1
    /// cross_layer_bla_flag : 1
    /// pic_output_flag : 1
    /// no_output_of_prior_pics_flag : 1
    /// short_term_ref_pic_set_sps_flag : 1
    /// slice_temporal_mvp_enabled_flag : 1
    /// reserved : 23
    /// ```
    public int bitFields0() {
    	return (int) BIT_FIELDS0_HANDLE.get(segment, 0L);
    }
    
    @Override
    public StdVideoEncodeH265PictureInfoFlags set(StdVideoEncodeH265PictureInfoFlags other) {
        return set(other.segment);
    }
    
    @Override
    public StdVideoEncodeH265PictureInfoFlags set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<StdVideoEncodeH265PictureInfoFlags> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<StdVideoEncodeH265PictureInfoFlags> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new StdVideoEncodeH265PictureInfoFlags(segment),
            count
        );
    }
    
    public static NativeStructArray<StdVideoEncodeH265PictureInfoFlags> array(Arena arena, StdVideoEncodeH265PictureInfoFlags... structs) {
        NativeStructArray<StdVideoEncodeH265PictureInfoFlags> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new StdVideoEncodeH265PictureInfoFlags(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<StdVideoEncodeH265PictureInfoFlags> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new StdVideoEncodeH265PictureInfoFlags(segment)
        );
    }

}