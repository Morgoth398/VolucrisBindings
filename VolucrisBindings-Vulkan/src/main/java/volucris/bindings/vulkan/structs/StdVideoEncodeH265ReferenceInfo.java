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

public final class StdVideoEncodeH265ReferenceInfo
		implements Struct<StdVideoEncodeH265ReferenceInfo> {

    public static final StructLayout LAYOUT;

    public static final VarHandle PIC_TYPE_HANDLE;
    public static final VarHandle PIC_ORDER_CNT_VAL_HANDLE;
    public static final VarHandle TEMPORAL_ID_HANDLE;

    public static final long FLAGS_BYTE_OFFSET;
    public static final long PIC_TYPE_BYTE_OFFSET;
    public static final long PIC_ORDER_CNT_VAL_BYTE_OFFSET;
    public static final long TEMPORAL_ID_BYTE_OFFSET;

    private final MemorySegment segment;

    private final StdVideoEncodeH265ReferenceInfoFlags flags;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            StdVideoEncodeH265ReferenceInfoFlags.LAYOUT.withName("flags"),
            JAVA_INT.withName("pic_type"),
            JAVA_INT.withName("PicOrderCntVal"),
            JAVA_BYTE.withName("TemporalId"),
            MemoryLayout.paddingLayout(3)
        ).withName("StdVideoEncodeH265ReferenceInfo").withByteAlignment(4);
        
        PIC_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pic_type"));
        PIC_ORDER_CNT_VAL_HANDLE = LAYOUT.varHandle(PathElement.groupElement("PicOrderCntVal"));
        TEMPORAL_ID_HANDLE = LAYOUT.varHandle(PathElement.groupElement("TemporalId"));
        
        FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
        PIC_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pic_type"));
        PIC_ORDER_CNT_VAL_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("PicOrderCntVal"));
        TEMPORAL_ID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("TemporalId"));
        //@formatter:on
    }

    public StdVideoEncodeH265ReferenceInfo() {
        this(Arena.ofAuto());
    }
    
    public StdVideoEncodeH265ReferenceInfo(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public StdVideoEncodeH265ReferenceInfo(MemorySegment segment) {
        this.segment = segment;
    
        flags = new StdVideoEncodeH265ReferenceInfoFlags(segment.asSlice(FLAGS_BYTE_OFFSET, StdVideoEncodeH265ReferenceInfoFlags.LAYOUT));
    }

    /// @see #pic_type()
    public StdVideoEncodeH265ReferenceInfo pic_type(int pic_type) {
    	PIC_TYPE_HANDLE.set(segment, 0L, pic_type);
    	return this;
    }
    
    public int pic_type() {
    	return (int) PIC_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #picOrderCntVal()
    public StdVideoEncodeH265ReferenceInfo picOrderCntVal(int picOrderCntVal) {
    	PIC_ORDER_CNT_VAL_HANDLE.set(segment, 0L, picOrderCntVal);
    	return this;
    }
    
    public int picOrderCntVal() {
    	return (int) PIC_ORDER_CNT_VAL_HANDLE.get(segment, 0L);
    }
    
    /// @see #temporalId()
    public StdVideoEncodeH265ReferenceInfo temporalId(byte temporalId) {
    	TEMPORAL_ID_HANDLE.set(segment, 0L, temporalId);
    	return this;
    }
    
    public byte temporalId() {
    	return (byte) TEMPORAL_ID_HANDLE.get(segment, 0L);
    }
    
    /// @see #flags()
    public StdVideoEncodeH265ReferenceInfo flags(Consumer<StdVideoEncodeH265ReferenceInfoFlags> consumer) {
    	consumer.accept(flags);
    	return this;
    }
    
    /// @see #flags()
    public StdVideoEncodeH265ReferenceInfo flags(StdVideoEncodeH265ReferenceInfoFlags other) {
    	flags.set(other);
    	return this;
    }
    
    public StdVideoEncodeH265ReferenceInfoFlags flags() {
    	return flags;
    }
    
    @Override
    public StdVideoEncodeH265ReferenceInfo set(StdVideoEncodeH265ReferenceInfo other) {
        return set(other.segment);
    }
    
    @Override
    public StdVideoEncodeH265ReferenceInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<StdVideoEncodeH265ReferenceInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<StdVideoEncodeH265ReferenceInfo> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new StdVideoEncodeH265ReferenceInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<StdVideoEncodeH265ReferenceInfo> array(Arena arena, StdVideoEncodeH265ReferenceInfo... structs) {
        NativeStructArray<StdVideoEncodeH265ReferenceInfo> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new StdVideoEncodeH265ReferenceInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<StdVideoEncodeH265ReferenceInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new StdVideoEncodeH265ReferenceInfo(segment)
        );
    }
    
}