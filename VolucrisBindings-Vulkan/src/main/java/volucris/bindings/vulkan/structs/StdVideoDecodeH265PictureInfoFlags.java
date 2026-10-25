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
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;

public final class StdVideoDecodeH265PictureInfoFlags
		implements Struct<StdVideoDecodeH265PictureInfoFlags> {

	public static final StructLayout LAYOUT;

	public static final VarHandle BIT_FIELDS0_HANDLE;

	public static final long BIT_FIELDS0_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("bitFields0")
		).withName("StdVideoDecodeH265PictureInfoFlags").withByteAlignment(4);
		
		BIT_FIELDS0_HANDLE = LAYOUT.varHandle(PathElement.groupElement("bitFields0"));
		
		BIT_FIELDS0_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("bitFields0"));
		//@formatter:on
	}

	public StdVideoDecodeH265PictureInfoFlags() {
	    this(Arena.ofAuto());
	}
	
	public StdVideoDecodeH265PictureInfoFlags(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public StdVideoDecodeH265PictureInfoFlags(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #bitFields0()
    public StdVideoDecodeH265PictureInfoFlags bitFields0(int bitFields0) {
    	BIT_FIELDS0_HANDLE.set(segment, 0L, bitFields0);
    	return this;
    }
    
    /// ```
    /// All bit fields contained in this field with their bit width:
    /// IrapPicFlag : 1
    /// IdrPicFlag : 1
    /// IsReference : 1
    /// short_term_ref_pic_set_sps_flag : 1
    /// ```
    public int bitFields0() {
    	return (int) BIT_FIELDS0_HANDLE.get(segment, 0L);
    }
    
    @Override
    public StdVideoDecodeH265PictureInfoFlags set(StdVideoDecodeH265PictureInfoFlags other) {
        return set(other.segment);
    }
    
    @Override
    public StdVideoDecodeH265PictureInfoFlags set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<StdVideoDecodeH265PictureInfoFlags> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<StdVideoDecodeH265PictureInfoFlags> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new StdVideoDecodeH265PictureInfoFlags(segment),
            count
        );
    }
    
    public static NativeStructArray<StdVideoDecodeH265PictureInfoFlags> array(SegmentAllocator allocator, StdVideoDecodeH265PictureInfoFlags... structs) {
        NativeStructArray<StdVideoDecodeH265PictureInfoFlags> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new StdVideoDecodeH265PictureInfoFlags(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<StdVideoDecodeH265PictureInfoFlags> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new StdVideoDecodeH265PictureInfoFlags(segment)
        );
    }

}