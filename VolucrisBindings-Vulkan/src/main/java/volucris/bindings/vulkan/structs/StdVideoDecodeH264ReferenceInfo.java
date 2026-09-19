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

public final class StdVideoDecodeH264ReferenceInfo
		implements Struct<StdVideoDecodeH264ReferenceInfo> {

    public static final StructLayout LAYOUT;

    public static final VarHandle FRAME_NUM_HANDLE;
    public static final VarHandle RESERVED_HANDLE;
    public static final VarHandle PIC_ORDER_CNT_HANDLE;

    public static final long FLAGS_BYTE_OFFSET;
    public static final long FRAME_NUM_BYTE_OFFSET;
    public static final long RESERVED_BYTE_OFFSET;
    public static final long PIC_ORDER_CNT_BYTE_OFFSET;

    private final MemorySegment segment;

    private final StdVideoDecodeH264ReferenceInfoFlags flags;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            StdVideoDecodeH264ReferenceInfoFlags.LAYOUT.withName("flags"),
            JAVA_SHORT.withName("FrameNum"),
            JAVA_SHORT.withName("reserved"),
            MemoryLayout.sequenceLayout(2, JAVA_INT).withName("PicOrderCnt")
        ).withName("StdVideoDecodeH264ReferenceInfo").withByteAlignment(4);
        
        FRAME_NUM_HANDLE = LAYOUT.varHandle(PathElement.groupElement("FrameNum"));
        RESERVED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("reserved"));
        PIC_ORDER_CNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("PicOrderCnt"), PathElement.sequenceElement());
        
        FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
        FRAME_NUM_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("FrameNum"));
        RESERVED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("reserved"));
        PIC_ORDER_CNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("PicOrderCnt"));
        //@formatter:on
    }

    public StdVideoDecodeH264ReferenceInfo() {
        this(Arena.ofAuto());
    }
    
    public StdVideoDecodeH264ReferenceInfo(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public StdVideoDecodeH264ReferenceInfo(MemorySegment segment) {
        this.segment = segment;
    
        flags = new StdVideoDecodeH264ReferenceInfoFlags(segment.asSlice(FLAGS_BYTE_OFFSET, StdVideoDecodeH264ReferenceInfoFlags.LAYOUT));
    }

    /// @see #frameNum()
    public StdVideoDecodeH264ReferenceInfo frameNum(short frameNum) {
    	FRAME_NUM_HANDLE.set(segment, 0L, frameNum);
    	return this;
    }
    
    public short frameNum() {
    	return (short) FRAME_NUM_HANDLE.get(segment, 0L);
    }
    
    /// @see #reserved()
    public StdVideoDecodeH264ReferenceInfo reserved(short reserved) {
    	RESERVED_HANDLE.set(segment, 0L, reserved);
    	return this;
    }
    
    public short reserved() {
    	return (short) RESERVED_HANDLE.get(segment, 0L);
    }
    
    /// @see #picOrderCnt(int)
    public StdVideoDecodeH264ReferenceInfo picOrderCnt(int picOrderCnt, int index0) {
    	PIC_ORDER_CNT_HANDLE.set(segment, 0L, index0, picOrderCnt);
    	return this;
    }
    
    public int picOrderCnt(int index0) {
    	return (int) PIC_ORDER_CNT_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #flags()
    public StdVideoDecodeH264ReferenceInfo flags(Consumer<StdVideoDecodeH264ReferenceInfoFlags> consumer) {
    	consumer.accept(flags);
    	return this;
    }
    
    /// @see #flags()
    public StdVideoDecodeH264ReferenceInfo flags(StdVideoDecodeH264ReferenceInfoFlags other) {
    	flags.set(other);
    	return this;
    }
    
    public StdVideoDecodeH264ReferenceInfoFlags flags() {
    	return flags;
    }
    
    @Override
    public StdVideoDecodeH264ReferenceInfo set(StdVideoDecodeH264ReferenceInfo other) {
        return set(other.segment);
    }
    
    @Override
    public StdVideoDecodeH264ReferenceInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<StdVideoDecodeH264ReferenceInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<StdVideoDecodeH264ReferenceInfo> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new StdVideoDecodeH264ReferenceInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<StdVideoDecodeH264ReferenceInfo> array(Arena arena, StdVideoDecodeH264ReferenceInfo... structs) {
        NativeStructArray<StdVideoDecodeH264ReferenceInfo> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new StdVideoDecodeH264ReferenceInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<StdVideoDecodeH264ReferenceInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new StdVideoDecodeH264ReferenceInfo(segment)
        );
    }
    
}