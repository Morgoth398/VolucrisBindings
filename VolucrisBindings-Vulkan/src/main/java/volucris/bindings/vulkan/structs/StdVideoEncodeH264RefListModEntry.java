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

public final class StdVideoEncodeH264RefListModEntry
		implements Struct<StdVideoEncodeH264RefListModEntry> {

	public static final StructLayout LAYOUT;

	public static final VarHandle MODIFICATION_OF_PIC_NUMS_IDC_HANDLE;
	public static final VarHandle ABS_DIFF_PIC_NUM_MINUS1_HANDLE;
	public static final VarHandle LONG_TERM_PIC_NUM_HANDLE;

	public static final long MODIFICATION_OF_PIC_NUMS_IDC_BYTE_OFFSET;
	public static final long ABS_DIFF_PIC_NUM_MINUS1_BYTE_OFFSET;
	public static final long LONG_TERM_PIC_NUM_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("modification_of_pic_nums_idc"),
		    JAVA_SHORT.withName("abs_diff_pic_num_minus1"),
		    JAVA_SHORT.withName("long_term_pic_num")
		).withName("StdVideoEncodeH264RefListModEntry").withByteAlignment(4);
		
		MODIFICATION_OF_PIC_NUMS_IDC_HANDLE = LAYOUT.varHandle(PathElement.groupElement("modification_of_pic_nums_idc"));
		ABS_DIFF_PIC_NUM_MINUS1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("abs_diff_pic_num_minus1"));
		LONG_TERM_PIC_NUM_HANDLE = LAYOUT.varHandle(PathElement.groupElement("long_term_pic_num"));
		
		MODIFICATION_OF_PIC_NUMS_IDC_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("modification_of_pic_nums_idc"));
		ABS_DIFF_PIC_NUM_MINUS1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("abs_diff_pic_num_minus1"));
		LONG_TERM_PIC_NUM_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("long_term_pic_num"));
		//@formatter:on
	}

	public StdVideoEncodeH264RefListModEntry() {
	    this(Arena.ofAuto());
	}
	
	public StdVideoEncodeH264RefListModEntry(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public StdVideoEncodeH264RefListModEntry(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #modification_of_pic_nums_idc()
    public StdVideoEncodeH264RefListModEntry modification_of_pic_nums_idc(int modification_of_pic_nums_idc) {
    	MODIFICATION_OF_PIC_NUMS_IDC_HANDLE.set(segment, 0L, modification_of_pic_nums_idc);
    	return this;
    }
    
    public int modification_of_pic_nums_idc() {
    	return (int) MODIFICATION_OF_PIC_NUMS_IDC_HANDLE.get(segment, 0L);
    }
    
    /// @see #abs_diff_pic_num_minus1()
    public StdVideoEncodeH264RefListModEntry abs_diff_pic_num_minus1(short abs_diff_pic_num_minus1) {
    	ABS_DIFF_PIC_NUM_MINUS1_HANDLE.set(segment, 0L, abs_diff_pic_num_minus1);
    	return this;
    }
    
    public short abs_diff_pic_num_minus1() {
    	return (short) ABS_DIFF_PIC_NUM_MINUS1_HANDLE.get(segment, 0L);
    }
    
    /// @see #long_term_pic_num()
    public StdVideoEncodeH264RefListModEntry long_term_pic_num(short long_term_pic_num) {
    	LONG_TERM_PIC_NUM_HANDLE.set(segment, 0L, long_term_pic_num);
    	return this;
    }
    
    public short long_term_pic_num() {
    	return (short) LONG_TERM_PIC_NUM_HANDLE.get(segment, 0L);
    }
    
    @Override
    public StdVideoEncodeH264RefListModEntry set(StdVideoEncodeH264RefListModEntry other) {
        return set(other.segment);
    }
    
    @Override
    public StdVideoEncodeH264RefListModEntry set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<StdVideoEncodeH264RefListModEntry> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<StdVideoEncodeH264RefListModEntry> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new StdVideoEncodeH264RefListModEntry(segment),
            count
        );
    }
    
    public static NativeStructArray<StdVideoEncodeH264RefListModEntry> array(SegmentAllocator allocator, StdVideoEncodeH264RefListModEntry... structs) {
        NativeStructArray<StdVideoEncodeH264RefListModEntry> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new StdVideoEncodeH264RefListModEntry(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<StdVideoEncodeH264RefListModEntry> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new StdVideoEncodeH264RefListModEntry(segment)
        );
    }

}