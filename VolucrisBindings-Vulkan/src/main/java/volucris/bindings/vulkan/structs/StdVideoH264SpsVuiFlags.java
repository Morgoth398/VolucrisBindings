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

public final class StdVideoH264SpsVuiFlags
		implements Struct<StdVideoH264SpsVuiFlags> {

	public static final StructLayout LAYOUT;

	public static final VarHandle BIT_FIELDS0_HANDLE;

	public static final long BIT_FIELDS0_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("bitFields0")
		).withName("StdVideoH264SpsVuiFlags").withByteAlignment(4);
		
		BIT_FIELDS0_HANDLE = LAYOUT.varHandle(PathElement.groupElement("bitFields0"));
		
		BIT_FIELDS0_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("bitFields0"));
		//@formatter:on
	}

	public StdVideoH264SpsVuiFlags() {
	    this(Arena.ofAuto());
	}
	
	public StdVideoH264SpsVuiFlags(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public StdVideoH264SpsVuiFlags(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #bitFields0()
    public StdVideoH264SpsVuiFlags bitFields0(int bitFields0) {
    	BIT_FIELDS0_HANDLE.set(segment, 0L, bitFields0);
    	return this;
    }
    
    /// ```
    /// All bit fields contained in this field with their bit width:
    /// aspect_ratio_info_present_flag : 1
    /// overscan_info_present_flag : 1
    /// overscan_appropriate_flag : 1
    /// video_signal_type_present_flag : 1
    /// video_full_range_flag : 1
    /// color_description_present_flag : 1
    /// chroma_loc_info_present_flag : 1
    /// timing_info_present_flag : 1
    /// fixed_frame_rate_flag : 1
    /// bitstream_restriction_flag : 1
    /// nal_hrd_parameters_present_flag : 1
    /// vcl_hrd_parameters_present_flag : 1
    /// ```
    public int bitFields0() {
    	return (int) BIT_FIELDS0_HANDLE.get(segment, 0L);
    }
    
    @Override
    public StdVideoH264SpsVuiFlags set(StdVideoH264SpsVuiFlags other) {
        return set(other.segment);
    }
    
    @Override
    public StdVideoH264SpsVuiFlags set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<StdVideoH264SpsVuiFlags> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<StdVideoH264SpsVuiFlags> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new StdVideoH264SpsVuiFlags(segment),
            count
        );
    }
    
    public static NativeStructArray<StdVideoH264SpsVuiFlags> array(SegmentAllocator allocator, StdVideoH264SpsVuiFlags... structs) {
        NativeStructArray<StdVideoH264SpsVuiFlags> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new StdVideoH264SpsVuiFlags(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<StdVideoH264SpsVuiFlags> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new StdVideoH264SpsVuiFlags(segment)
        );
    }

}