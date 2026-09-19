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

public final class StdVideoDecodeH264PictureInfo
		implements Struct<StdVideoDecodeH264PictureInfo> {

    public static final StructLayout LAYOUT;

    public static final VarHandle SEQ_PARAMETER_SET_ID_HANDLE;
    public static final VarHandle PIC_PARAMETER_SET_ID_HANDLE;
    public static final VarHandle RESERVED1_HANDLE;
    public static final VarHandle RESERVED2_HANDLE;
    public static final VarHandle FRAME_NUM_HANDLE;
    public static final VarHandle IDR_PIC_ID_HANDLE;
    public static final VarHandle PIC_ORDER_CNT_HANDLE;

    public static final long FLAGS_BYTE_OFFSET;
    public static final long SEQ_PARAMETER_SET_ID_BYTE_OFFSET;
    public static final long PIC_PARAMETER_SET_ID_BYTE_OFFSET;
    public static final long RESERVED1_BYTE_OFFSET;
    public static final long RESERVED2_BYTE_OFFSET;
    public static final long FRAME_NUM_BYTE_OFFSET;
    public static final long IDR_PIC_ID_BYTE_OFFSET;
    public static final long PIC_ORDER_CNT_BYTE_OFFSET;

    private final MemorySegment segment;

    private final StdVideoDecodeH264PictureInfoFlags flags;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            StdVideoDecodeH264PictureInfoFlags.LAYOUT.withName("flags"),
            JAVA_BYTE.withName("seq_parameter_set_id"),
            JAVA_BYTE.withName("pic_parameter_set_id"),
            JAVA_BYTE.withName("reserved1"),
            JAVA_BYTE.withName("reserved2"),
            JAVA_SHORT.withName("frame_num"),
            JAVA_SHORT.withName("idr_pic_id"),
            MemoryLayout.sequenceLayout(2, JAVA_INT).withName("PicOrderCnt")
        ).withName("StdVideoDecodeH264PictureInfo").withByteAlignment(4);
        
        SEQ_PARAMETER_SET_ID_HANDLE = LAYOUT.varHandle(PathElement.groupElement("seq_parameter_set_id"));
        PIC_PARAMETER_SET_ID_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pic_parameter_set_id"));
        RESERVED1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("reserved1"));
        RESERVED2_HANDLE = LAYOUT.varHandle(PathElement.groupElement("reserved2"));
        FRAME_NUM_HANDLE = LAYOUT.varHandle(PathElement.groupElement("frame_num"));
        IDR_PIC_ID_HANDLE = LAYOUT.varHandle(PathElement.groupElement("idr_pic_id"));
        PIC_ORDER_CNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("PicOrderCnt"), PathElement.sequenceElement());
        
        FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
        SEQ_PARAMETER_SET_ID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("seq_parameter_set_id"));
        PIC_PARAMETER_SET_ID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pic_parameter_set_id"));
        RESERVED1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("reserved1"));
        RESERVED2_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("reserved2"));
        FRAME_NUM_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("frame_num"));
        IDR_PIC_ID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("idr_pic_id"));
        PIC_ORDER_CNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("PicOrderCnt"));
        //@formatter:on
    }

    public StdVideoDecodeH264PictureInfo() {
        this(Arena.ofAuto());
    }
    
    public StdVideoDecodeH264PictureInfo(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public StdVideoDecodeH264PictureInfo(MemorySegment segment) {
        this.segment = segment;
    
        flags = new StdVideoDecodeH264PictureInfoFlags(segment.asSlice(FLAGS_BYTE_OFFSET, StdVideoDecodeH264PictureInfoFlags.LAYOUT));
    }

    /// @see #seq_parameter_set_id()
    public StdVideoDecodeH264PictureInfo seq_parameter_set_id(byte seq_parameter_set_id) {
    	SEQ_PARAMETER_SET_ID_HANDLE.set(segment, 0L, seq_parameter_set_id);
    	return this;
    }
    
    public byte seq_parameter_set_id() {
    	return (byte) SEQ_PARAMETER_SET_ID_HANDLE.get(segment, 0L);
    }
    
    /// @see #pic_parameter_set_id()
    public StdVideoDecodeH264PictureInfo pic_parameter_set_id(byte pic_parameter_set_id) {
    	PIC_PARAMETER_SET_ID_HANDLE.set(segment, 0L, pic_parameter_set_id);
    	return this;
    }
    
    public byte pic_parameter_set_id() {
    	return (byte) PIC_PARAMETER_SET_ID_HANDLE.get(segment, 0L);
    }
    
    /// @see #reserved1()
    public StdVideoDecodeH264PictureInfo reserved1(byte reserved1) {
    	RESERVED1_HANDLE.set(segment, 0L, reserved1);
    	return this;
    }
    
    public byte reserved1() {
    	return (byte) RESERVED1_HANDLE.get(segment, 0L);
    }
    
    /// @see #reserved2()
    public StdVideoDecodeH264PictureInfo reserved2(byte reserved2) {
    	RESERVED2_HANDLE.set(segment, 0L, reserved2);
    	return this;
    }
    
    public byte reserved2() {
    	return (byte) RESERVED2_HANDLE.get(segment, 0L);
    }
    
    /// @see #frame_num()
    public StdVideoDecodeH264PictureInfo frame_num(short frame_num) {
    	FRAME_NUM_HANDLE.set(segment, 0L, frame_num);
    	return this;
    }
    
    public short frame_num() {
    	return (short) FRAME_NUM_HANDLE.get(segment, 0L);
    }
    
    /// @see #idr_pic_id()
    public StdVideoDecodeH264PictureInfo idr_pic_id(short idr_pic_id) {
    	IDR_PIC_ID_HANDLE.set(segment, 0L, idr_pic_id);
    	return this;
    }
    
    public short idr_pic_id() {
    	return (short) IDR_PIC_ID_HANDLE.get(segment, 0L);
    }
    
    /// @see #picOrderCnt(int)
    public StdVideoDecodeH264PictureInfo picOrderCnt(int picOrderCnt, int index0) {
    	PIC_ORDER_CNT_HANDLE.set(segment, 0L, index0, picOrderCnt);
    	return this;
    }
    
    public int picOrderCnt(int index0) {
    	return (int) PIC_ORDER_CNT_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #flags()
    public StdVideoDecodeH264PictureInfo flags(Consumer<StdVideoDecodeH264PictureInfoFlags> consumer) {
    	consumer.accept(flags);
    	return this;
    }
    
    /// @see #flags()
    public StdVideoDecodeH264PictureInfo flags(StdVideoDecodeH264PictureInfoFlags other) {
    	flags.set(other);
    	return this;
    }
    
    public StdVideoDecodeH264PictureInfoFlags flags() {
    	return flags;
    }
    
    @Override
    public StdVideoDecodeH264PictureInfo set(StdVideoDecodeH264PictureInfo other) {
        return set(other.segment);
    }
    
    @Override
    public StdVideoDecodeH264PictureInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<StdVideoDecodeH264PictureInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<StdVideoDecodeH264PictureInfo> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new StdVideoDecodeH264PictureInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<StdVideoDecodeH264PictureInfo> array(Arena arena, StdVideoDecodeH264PictureInfo... structs) {
        NativeStructArray<StdVideoDecodeH264PictureInfo> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new StdVideoDecodeH264PictureInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<StdVideoDecodeH264PictureInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new StdVideoDecodeH264PictureInfo(segment)
        );
    }
    
}