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

public final class StdVideoH265DecPicBufMgr
		implements Struct<StdVideoH265DecPicBufMgr> {

    public static final StructLayout LAYOUT;

    public static final VarHandle MAX_LATENCY_INCREASE_PLUS1_HANDLE;
    public static final VarHandle MAX_DEC_PIC_BUFFERING_MINUS1_HANDLE;
    public static final VarHandle MAX_NUM_REORDER_PICS_HANDLE;

    public static final long MAX_LATENCY_INCREASE_PLUS1_BYTE_OFFSET;
    public static final long MAX_DEC_PIC_BUFFERING_MINUS1_BYTE_OFFSET;
    public static final long MAX_NUM_REORDER_PICS_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(7, JAVA_INT).withName("max_latency_increase_plus1"),
            MemoryLayout.sequenceLayout(7, JAVA_BYTE).withName("max_dec_pic_buffering_minus1"),
            MemoryLayout.sequenceLayout(7, JAVA_BYTE).withName("max_num_reorder_pics"),
            MemoryLayout.paddingLayout(2)
        ).withName("StdVideoH265DecPicBufMgr").withByteAlignment(4);
        
        MAX_LATENCY_INCREASE_PLUS1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("max_latency_increase_plus1"), PathElement.sequenceElement());
        MAX_DEC_PIC_BUFFERING_MINUS1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("max_dec_pic_buffering_minus1"), PathElement.sequenceElement());
        MAX_NUM_REORDER_PICS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("max_num_reorder_pics"), PathElement.sequenceElement());
        
        MAX_LATENCY_INCREASE_PLUS1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("max_latency_increase_plus1"));
        MAX_DEC_PIC_BUFFERING_MINUS1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("max_dec_pic_buffering_minus1"));
        MAX_NUM_REORDER_PICS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("max_num_reorder_pics"));
        //@formatter:on
    }

    public StdVideoH265DecPicBufMgr() {
        this(Arena.ofAuto());
    }
    
    public StdVideoH265DecPicBufMgr(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public StdVideoH265DecPicBufMgr(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #max_latency_increase_plus1(int)
    public StdVideoH265DecPicBufMgr max_latency_increase_plus1(int max_latency_increase_plus1, int index0) {
    	MAX_LATENCY_INCREASE_PLUS1_HANDLE.set(segment, 0L, index0, max_latency_increase_plus1);
    	return this;
    }
    
    public int max_latency_increase_plus1(int index0) {
    	return (int) MAX_LATENCY_INCREASE_PLUS1_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #max_dec_pic_buffering_minus1(int)
    public StdVideoH265DecPicBufMgr max_dec_pic_buffering_minus1(byte max_dec_pic_buffering_minus1, int index0) {
    	MAX_DEC_PIC_BUFFERING_MINUS1_HANDLE.set(segment, 0L, index0, max_dec_pic_buffering_minus1);
    	return this;
    }
    
    public byte max_dec_pic_buffering_minus1(int index0) {
    	return (byte) MAX_DEC_PIC_BUFFERING_MINUS1_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #max_num_reorder_pics(int)
    public StdVideoH265DecPicBufMgr max_num_reorder_pics(byte max_num_reorder_pics, int index0) {
    	MAX_NUM_REORDER_PICS_HANDLE.set(segment, 0L, index0, max_num_reorder_pics);
    	return this;
    }
    
    public byte max_num_reorder_pics(int index0) {
    	return (byte) MAX_NUM_REORDER_PICS_HANDLE.get(segment, 0L, index0);
    }
    
    @Override
    public StdVideoH265DecPicBufMgr set(StdVideoH265DecPicBufMgr other) {
        return set(other.segment);
    }
    
    @Override
    public StdVideoH265DecPicBufMgr set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<StdVideoH265DecPicBufMgr> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<StdVideoH265DecPicBufMgr> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new StdVideoH265DecPicBufMgr(segment),
            count
        );
    }
    
    public static NativeStructArray<StdVideoH265DecPicBufMgr> array(Arena arena, StdVideoH265DecPicBufMgr... structs) {
        NativeStructArray<StdVideoH265DecPicBufMgr> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new StdVideoH265DecPicBufMgr(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<StdVideoH265DecPicBufMgr> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new StdVideoH265DecPicBufMgr(segment)
        );
    }
    
}