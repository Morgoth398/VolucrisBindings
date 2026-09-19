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

public final class StdVideoEncodeH264RefPicMarkingEntry
		implements Struct<StdVideoEncodeH264RefPicMarkingEntry> {

    public static final StructLayout LAYOUT;

    public static final VarHandle MEMORY_MANAGEMENT_CONTROL_OPERATION_HANDLE;
    public static final VarHandle DIFFERENCE_OF_PIC_NUMS_MINUS1_HANDLE;
    public static final VarHandle LONG_TERM_PIC_NUM_HANDLE;
    public static final VarHandle LONG_TERM_FRAME_IDX_HANDLE;
    public static final VarHandle MAX_LONG_TERM_FRAME_IDX_PLUS1_HANDLE;

    public static final long MEMORY_MANAGEMENT_CONTROL_OPERATION_BYTE_OFFSET;
    public static final long DIFFERENCE_OF_PIC_NUMS_MINUS1_BYTE_OFFSET;
    public static final long LONG_TERM_PIC_NUM_BYTE_OFFSET;
    public static final long LONG_TERM_FRAME_IDX_BYTE_OFFSET;
    public static final long MAX_LONG_TERM_FRAME_IDX_PLUS1_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("memory_management_control_operation"),
            JAVA_SHORT.withName("difference_of_pic_nums_minus1"),
            JAVA_SHORT.withName("long_term_pic_num"),
            JAVA_SHORT.withName("long_term_frame_idx"),
            JAVA_SHORT.withName("max_long_term_frame_idx_plus1")
        ).withName("StdVideoEncodeH264RefPicMarkingEntry").withByteAlignment(4);
        
        MEMORY_MANAGEMENT_CONTROL_OPERATION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("memory_management_control_operation"));
        DIFFERENCE_OF_PIC_NUMS_MINUS1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("difference_of_pic_nums_minus1"));
        LONG_TERM_PIC_NUM_HANDLE = LAYOUT.varHandle(PathElement.groupElement("long_term_pic_num"));
        LONG_TERM_FRAME_IDX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("long_term_frame_idx"));
        MAX_LONG_TERM_FRAME_IDX_PLUS1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("max_long_term_frame_idx_plus1"));
        
        MEMORY_MANAGEMENT_CONTROL_OPERATION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("memory_management_control_operation"));
        DIFFERENCE_OF_PIC_NUMS_MINUS1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("difference_of_pic_nums_minus1"));
        LONG_TERM_PIC_NUM_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("long_term_pic_num"));
        LONG_TERM_FRAME_IDX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("long_term_frame_idx"));
        MAX_LONG_TERM_FRAME_IDX_PLUS1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("max_long_term_frame_idx_plus1"));
        //@formatter:on
    }

    public StdVideoEncodeH264RefPicMarkingEntry() {
        this(Arena.ofAuto());
    }
    
    public StdVideoEncodeH264RefPicMarkingEntry(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public StdVideoEncodeH264RefPicMarkingEntry(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #memory_management_control_operation()
    public StdVideoEncodeH264RefPicMarkingEntry memory_management_control_operation(int memory_management_control_operation) {
    	MEMORY_MANAGEMENT_CONTROL_OPERATION_HANDLE.set(segment, 0L, memory_management_control_operation);
    	return this;
    }
    
    public int memory_management_control_operation() {
    	return (int) MEMORY_MANAGEMENT_CONTROL_OPERATION_HANDLE.get(segment, 0L);
    }
    
    /// @see #difference_of_pic_nums_minus1()
    public StdVideoEncodeH264RefPicMarkingEntry difference_of_pic_nums_minus1(short difference_of_pic_nums_minus1) {
    	DIFFERENCE_OF_PIC_NUMS_MINUS1_HANDLE.set(segment, 0L, difference_of_pic_nums_minus1);
    	return this;
    }
    
    public short difference_of_pic_nums_minus1() {
    	return (short) DIFFERENCE_OF_PIC_NUMS_MINUS1_HANDLE.get(segment, 0L);
    }
    
    /// @see #long_term_pic_num()
    public StdVideoEncodeH264RefPicMarkingEntry long_term_pic_num(short long_term_pic_num) {
    	LONG_TERM_PIC_NUM_HANDLE.set(segment, 0L, long_term_pic_num);
    	return this;
    }
    
    public short long_term_pic_num() {
    	return (short) LONG_TERM_PIC_NUM_HANDLE.get(segment, 0L);
    }
    
    /// @see #long_term_frame_idx()
    public StdVideoEncodeH264RefPicMarkingEntry long_term_frame_idx(short long_term_frame_idx) {
    	LONG_TERM_FRAME_IDX_HANDLE.set(segment, 0L, long_term_frame_idx);
    	return this;
    }
    
    public short long_term_frame_idx() {
    	return (short) LONG_TERM_FRAME_IDX_HANDLE.get(segment, 0L);
    }
    
    /// @see #max_long_term_frame_idx_plus1()
    public StdVideoEncodeH264RefPicMarkingEntry max_long_term_frame_idx_plus1(short max_long_term_frame_idx_plus1) {
    	MAX_LONG_TERM_FRAME_IDX_PLUS1_HANDLE.set(segment, 0L, max_long_term_frame_idx_plus1);
    	return this;
    }
    
    public short max_long_term_frame_idx_plus1() {
    	return (short) MAX_LONG_TERM_FRAME_IDX_PLUS1_HANDLE.get(segment, 0L);
    }
    
    @Override
    public StdVideoEncodeH264RefPicMarkingEntry set(StdVideoEncodeH264RefPicMarkingEntry other) {
        return set(other.segment);
    }
    
    @Override
    public StdVideoEncodeH264RefPicMarkingEntry set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<StdVideoEncodeH264RefPicMarkingEntry> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<StdVideoEncodeH264RefPicMarkingEntry> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new StdVideoEncodeH264RefPicMarkingEntry(segment),
            count
        );
    }
    
    public static NativeStructArray<StdVideoEncodeH264RefPicMarkingEntry> array(Arena arena, StdVideoEncodeH264RefPicMarkingEntry... structs) {
        NativeStructArray<StdVideoEncodeH264RefPicMarkingEntry> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new StdVideoEncodeH264RefPicMarkingEntry(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<StdVideoEncodeH264RefPicMarkingEntry> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new StdVideoEncodeH264RefPicMarkingEntry(segment)
        );
    }
    
}