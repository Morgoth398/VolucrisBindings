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

public final class StdVideoEncodeH265LongTermRefPics
		implements Struct<StdVideoEncodeH265LongTermRefPics> {

	public static final StructLayout LAYOUT;

	public static final VarHandle NUM_LONG_TERM_SPS_HANDLE;
	public static final VarHandle NUM_LONG_TERM_PICS_HANDLE;
	public static final VarHandle LT_IDX_SPS_HANDLE;
	public static final VarHandle POC_LSB_LT_HANDLE;
	public static final VarHandle USED_BY_CURR_PIC_LT_FLAG_HANDLE;
	public static final VarHandle DELTA_POC_MSB_PRESENT_FLAG_HANDLE;
	public static final VarHandle DELTA_POC_MSB_CYCLE_LT_HANDLE;

	public static final long NUM_LONG_TERM_SPS_BYTE_OFFSET;
	public static final long NUM_LONG_TERM_PICS_BYTE_OFFSET;
	public static final long LT_IDX_SPS_BYTE_OFFSET;
	public static final long POC_LSB_LT_BYTE_OFFSET;
	public static final long USED_BY_CURR_PIC_LT_FLAG_BYTE_OFFSET;
	public static final long DELTA_POC_MSB_PRESENT_FLAG_BYTE_OFFSET;
	public static final long DELTA_POC_MSB_CYCLE_LT_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_BYTE.withName("num_long_term_sps"),
		    JAVA_BYTE.withName("num_long_term_pics"),
		    MemoryLayout.sequenceLayout(32, JAVA_BYTE).withName("lt_idx_sps"),
		    MemoryLayout.sequenceLayout(16, JAVA_BYTE).withName("poc_lsb_lt"),
		    JAVA_SHORT.withName("used_by_curr_pic_lt_flag"),
		    MemoryLayout.sequenceLayout(48, JAVA_BYTE).withName("delta_poc_msb_present_flag"),
		    MemoryLayout.sequenceLayout(48, JAVA_BYTE).withName("delta_poc_msb_cycle_lt")
		).withName("StdVideoEncodeH265LongTermRefPics").withByteAlignment(2);
		
		NUM_LONG_TERM_SPS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("num_long_term_sps"));
		NUM_LONG_TERM_PICS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("num_long_term_pics"));
		LT_IDX_SPS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("lt_idx_sps"), PathElement.sequenceElement());
		POC_LSB_LT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("poc_lsb_lt"), PathElement.sequenceElement());
		USED_BY_CURR_PIC_LT_FLAG_HANDLE = LAYOUT.varHandle(PathElement.groupElement("used_by_curr_pic_lt_flag"));
		DELTA_POC_MSB_PRESENT_FLAG_HANDLE = LAYOUT.varHandle(PathElement.groupElement("delta_poc_msb_present_flag"), PathElement.sequenceElement());
		DELTA_POC_MSB_CYCLE_LT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("delta_poc_msb_cycle_lt"), PathElement.sequenceElement());
		
		NUM_LONG_TERM_SPS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("num_long_term_sps"));
		NUM_LONG_TERM_PICS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("num_long_term_pics"));
		LT_IDX_SPS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("lt_idx_sps"));
		POC_LSB_LT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("poc_lsb_lt"));
		USED_BY_CURR_PIC_LT_FLAG_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("used_by_curr_pic_lt_flag"));
		DELTA_POC_MSB_PRESENT_FLAG_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("delta_poc_msb_present_flag"));
		DELTA_POC_MSB_CYCLE_LT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("delta_poc_msb_cycle_lt"));
		//@formatter:on
	}

	public StdVideoEncodeH265LongTermRefPics() {
	    this(Arena.ofAuto());
	}
	
	public StdVideoEncodeH265LongTermRefPics(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public StdVideoEncodeH265LongTermRefPics(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #num_long_term_sps()
    public StdVideoEncodeH265LongTermRefPics num_long_term_sps(byte num_long_term_sps) {
    	NUM_LONG_TERM_SPS_HANDLE.set(segment, 0L, num_long_term_sps);
    	return this;
    }
    
    public byte num_long_term_sps() {
    	return (byte) NUM_LONG_TERM_SPS_HANDLE.get(segment, 0L);
    }
    
    /// @see #num_long_term_pics()
    public StdVideoEncodeH265LongTermRefPics num_long_term_pics(byte num_long_term_pics) {
    	NUM_LONG_TERM_PICS_HANDLE.set(segment, 0L, num_long_term_pics);
    	return this;
    }
    
    public byte num_long_term_pics() {
    	return (byte) NUM_LONG_TERM_PICS_HANDLE.get(segment, 0L);
    }
    
    /// @see #lt_idx_sps(int)
    public StdVideoEncodeH265LongTermRefPics lt_idx_sps(byte lt_idx_sps, int index0) {
    	LT_IDX_SPS_HANDLE.set(segment, 0L, index0, lt_idx_sps);
    	return this;
    }
    
    public byte lt_idx_sps(int index0) {
    	return (byte) LT_IDX_SPS_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #poc_lsb_lt(int)
    public StdVideoEncodeH265LongTermRefPics poc_lsb_lt(byte poc_lsb_lt, int index0) {
    	POC_LSB_LT_HANDLE.set(segment, 0L, index0, poc_lsb_lt);
    	return this;
    }
    
    public byte poc_lsb_lt(int index0) {
    	return (byte) POC_LSB_LT_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #used_by_curr_pic_lt_flag()
    public StdVideoEncodeH265LongTermRefPics used_by_curr_pic_lt_flag(short used_by_curr_pic_lt_flag) {
    	USED_BY_CURR_PIC_LT_FLAG_HANDLE.set(segment, 0L, used_by_curr_pic_lt_flag);
    	return this;
    }
    
    public short used_by_curr_pic_lt_flag() {
    	return (short) USED_BY_CURR_PIC_LT_FLAG_HANDLE.get(segment, 0L);
    }
    
    /// @see #delta_poc_msb_present_flag(int)
    public StdVideoEncodeH265LongTermRefPics delta_poc_msb_present_flag(byte delta_poc_msb_present_flag, int index0) {
    	DELTA_POC_MSB_PRESENT_FLAG_HANDLE.set(segment, 0L, index0, delta_poc_msb_present_flag);
    	return this;
    }
    
    public byte delta_poc_msb_present_flag(int index0) {
    	return (byte) DELTA_POC_MSB_PRESENT_FLAG_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #delta_poc_msb_cycle_lt(int)
    public StdVideoEncodeH265LongTermRefPics delta_poc_msb_cycle_lt(byte delta_poc_msb_cycle_lt, int index0) {
    	DELTA_POC_MSB_CYCLE_LT_HANDLE.set(segment, 0L, index0, delta_poc_msb_cycle_lt);
    	return this;
    }
    
    public byte delta_poc_msb_cycle_lt(int index0) {
    	return (byte) DELTA_POC_MSB_CYCLE_LT_HANDLE.get(segment, 0L, index0);
    }
    
    @Override
    public StdVideoEncodeH265LongTermRefPics set(StdVideoEncodeH265LongTermRefPics other) {
        return set(other.segment);
    }
    
    @Override
    public StdVideoEncodeH265LongTermRefPics set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<StdVideoEncodeH265LongTermRefPics> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<StdVideoEncodeH265LongTermRefPics> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new StdVideoEncodeH265LongTermRefPics(segment),
            count
        );
    }
    
    public static NativeStructArray<StdVideoEncodeH265LongTermRefPics> array(SegmentAllocator allocator, StdVideoEncodeH265LongTermRefPics... structs) {
        NativeStructArray<StdVideoEncodeH265LongTermRefPics> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new StdVideoEncodeH265LongTermRefPics(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<StdVideoEncodeH265LongTermRefPics> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new StdVideoEncodeH265LongTermRefPics(segment)
        );
    }

}