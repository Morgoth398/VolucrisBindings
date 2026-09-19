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

public final class StdVideoEncodeH265WeightTable
		implements Struct<StdVideoEncodeH265WeightTable> {

    public static final StructLayout LAYOUT;

    public static final VarHandle LUMA_LOG2_WEIGHT_DENOM_HANDLE;
    public static final VarHandle DELTA_CHROMA_LOG2_WEIGHT_DENOM_HANDLE;
    public static final VarHandle DELTA_LUMA_WEIGHT_L0_HANDLE;
    public static final VarHandle LUMA_OFFSET_L0_HANDLE;
    public static final VarHandle DELTA_CHROMA_WEIGHT_L0_HANDLE;
    public static final VarHandle DELTA_CHROMA_OFFSET_L0_HANDLE;
    public static final VarHandle DELTA_LUMA_WEIGHT_L1_HANDLE;
    public static final VarHandle LUMA_OFFSET_L1_HANDLE;
    public static final VarHandle DELTA_CHROMA_WEIGHT_L1_HANDLE;
    public static final VarHandle DELTA_CHROMA_OFFSET_L1_HANDLE;

    public static final long FLAGS_BYTE_OFFSET;
    public static final long LUMA_LOG2_WEIGHT_DENOM_BYTE_OFFSET;
    public static final long DELTA_CHROMA_LOG2_WEIGHT_DENOM_BYTE_OFFSET;
    public static final long DELTA_LUMA_WEIGHT_L0_BYTE_OFFSET;
    public static final long LUMA_OFFSET_L0_BYTE_OFFSET;
    public static final long DELTA_CHROMA_WEIGHT_L0_BYTE_OFFSET;
    public static final long DELTA_CHROMA_OFFSET_L0_BYTE_OFFSET;
    public static final long DELTA_LUMA_WEIGHT_L1_BYTE_OFFSET;
    public static final long LUMA_OFFSET_L1_BYTE_OFFSET;
    public static final long DELTA_CHROMA_WEIGHT_L1_BYTE_OFFSET;
    public static final long DELTA_CHROMA_OFFSET_L1_BYTE_OFFSET;

    private final MemorySegment segment;

    private final StdVideoEncodeH265WeightTableFlags flags;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            StdVideoEncodeH265WeightTableFlags.LAYOUT.withName("flags"),
            JAVA_BYTE.withName("luma_log2_weight_denom"),
            JAVA_BYTE.withName("delta_chroma_log2_weight_denom"),
            MemoryLayout.sequenceLayout(15, JAVA_BYTE).withName("delta_luma_weight_l0"),
            MemoryLayout.sequenceLayout(15, JAVA_BYTE).withName("luma_offset_l0"),
            MemoryLayout.sequenceLayout(15, MemoryLayout.sequenceLayout(2, JAVA_BYTE)).withName("delta_chroma_weight_l0"),
            MemoryLayout.sequenceLayout(15, MemoryLayout.sequenceLayout(2, JAVA_BYTE)).withName("delta_chroma_offset_l0"),
            MemoryLayout.sequenceLayout(15, JAVA_BYTE).withName("delta_luma_weight_l1"),
            MemoryLayout.sequenceLayout(15, JAVA_BYTE).withName("luma_offset_l1"),
            MemoryLayout.sequenceLayout(15, MemoryLayout.sequenceLayout(2, JAVA_BYTE)).withName("delta_chroma_weight_l1"),
            MemoryLayout.sequenceLayout(15, MemoryLayout.sequenceLayout(2, JAVA_BYTE)).withName("delta_chroma_offset_l1")
        ).withName("StdVideoEncodeH265WeightTable").withByteAlignment(2);
        
        LUMA_LOG2_WEIGHT_DENOM_HANDLE = LAYOUT.varHandle(PathElement.groupElement("luma_log2_weight_denom"));
        DELTA_CHROMA_LOG2_WEIGHT_DENOM_HANDLE = LAYOUT.varHandle(PathElement.groupElement("delta_chroma_log2_weight_denom"));
        DELTA_LUMA_WEIGHT_L0_HANDLE = LAYOUT.varHandle(PathElement.groupElement("delta_luma_weight_l0"), PathElement.sequenceElement());
        LUMA_OFFSET_L0_HANDLE = LAYOUT.varHandle(PathElement.groupElement("luma_offset_l0"), PathElement.sequenceElement());
        DELTA_CHROMA_WEIGHT_L0_HANDLE = LAYOUT.varHandle(PathElement.groupElement("delta_chroma_weight_l0"), PathElement.sequenceElement(), PathElement.sequenceElement());
        DELTA_CHROMA_OFFSET_L0_HANDLE = LAYOUT.varHandle(PathElement.groupElement("delta_chroma_offset_l0"), PathElement.sequenceElement(), PathElement.sequenceElement());
        DELTA_LUMA_WEIGHT_L1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("delta_luma_weight_l1"), PathElement.sequenceElement());
        LUMA_OFFSET_L1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("luma_offset_l1"), PathElement.sequenceElement());
        DELTA_CHROMA_WEIGHT_L1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("delta_chroma_weight_l1"), PathElement.sequenceElement(), PathElement.sequenceElement());
        DELTA_CHROMA_OFFSET_L1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("delta_chroma_offset_l1"), PathElement.sequenceElement(), PathElement.sequenceElement());
        
        FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
        LUMA_LOG2_WEIGHT_DENOM_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("luma_log2_weight_denom"));
        DELTA_CHROMA_LOG2_WEIGHT_DENOM_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("delta_chroma_log2_weight_denom"));
        DELTA_LUMA_WEIGHT_L0_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("delta_luma_weight_l0"));
        LUMA_OFFSET_L0_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("luma_offset_l0"));
        DELTA_CHROMA_WEIGHT_L0_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("delta_chroma_weight_l0"));
        DELTA_CHROMA_OFFSET_L0_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("delta_chroma_offset_l0"));
        DELTA_LUMA_WEIGHT_L1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("delta_luma_weight_l1"));
        LUMA_OFFSET_L1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("luma_offset_l1"));
        DELTA_CHROMA_WEIGHT_L1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("delta_chroma_weight_l1"));
        DELTA_CHROMA_OFFSET_L1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("delta_chroma_offset_l1"));
        //@formatter:on
    }

    public StdVideoEncodeH265WeightTable() {
        this(Arena.ofAuto());
    }
    
    public StdVideoEncodeH265WeightTable(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public StdVideoEncodeH265WeightTable(MemorySegment segment) {
        this.segment = segment;
    
        flags = new StdVideoEncodeH265WeightTableFlags(segment.asSlice(FLAGS_BYTE_OFFSET, StdVideoEncodeH265WeightTableFlags.LAYOUT));
    }

    /// @see #luma_log2_weight_denom()
    public StdVideoEncodeH265WeightTable luma_log2_weight_denom(byte luma_log2_weight_denom) {
    	LUMA_LOG2_WEIGHT_DENOM_HANDLE.set(segment, 0L, luma_log2_weight_denom);
    	return this;
    }
    
    public byte luma_log2_weight_denom() {
    	return (byte) LUMA_LOG2_WEIGHT_DENOM_HANDLE.get(segment, 0L);
    }
    
    /// @see #delta_chroma_log2_weight_denom()
    public StdVideoEncodeH265WeightTable delta_chroma_log2_weight_denom(byte delta_chroma_log2_weight_denom) {
    	DELTA_CHROMA_LOG2_WEIGHT_DENOM_HANDLE.set(segment, 0L, delta_chroma_log2_weight_denom);
    	return this;
    }
    
    public byte delta_chroma_log2_weight_denom() {
    	return (byte) DELTA_CHROMA_LOG2_WEIGHT_DENOM_HANDLE.get(segment, 0L);
    }
    
    /// @see #delta_luma_weight_l0(int)
    public StdVideoEncodeH265WeightTable delta_luma_weight_l0(byte delta_luma_weight_l0, int index0) {
    	DELTA_LUMA_WEIGHT_L0_HANDLE.set(segment, 0L, index0, delta_luma_weight_l0);
    	return this;
    }
    
    public byte delta_luma_weight_l0(int index0) {
    	return (byte) DELTA_LUMA_WEIGHT_L0_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #luma_offset_l0(int)
    public StdVideoEncodeH265WeightTable luma_offset_l0(byte luma_offset_l0, int index0) {
    	LUMA_OFFSET_L0_HANDLE.set(segment, 0L, index0, luma_offset_l0);
    	return this;
    }
    
    public byte luma_offset_l0(int index0) {
    	return (byte) LUMA_OFFSET_L0_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #delta_chroma_weight_l0(int, int)
    public StdVideoEncodeH265WeightTable delta_chroma_weight_l0(byte delta_chroma_weight_l0, int index0, int index1) {
    	DELTA_CHROMA_WEIGHT_L0_HANDLE.set(segment, 0L, index0, index1, delta_chroma_weight_l0);
    	return this;
    }
    
    public byte delta_chroma_weight_l0(int index0, int index1) {
    	return (byte) DELTA_CHROMA_WEIGHT_L0_HANDLE.get(segment, 0L, index0, index1);
    }
    
    /// @see #delta_chroma_offset_l0(int, int)
    public StdVideoEncodeH265WeightTable delta_chroma_offset_l0(byte delta_chroma_offset_l0, int index0, int index1) {
    	DELTA_CHROMA_OFFSET_L0_HANDLE.set(segment, 0L, index0, index1, delta_chroma_offset_l0);
    	return this;
    }
    
    public byte delta_chroma_offset_l0(int index0, int index1) {
    	return (byte) DELTA_CHROMA_OFFSET_L0_HANDLE.get(segment, 0L, index0, index1);
    }
    
    /// @see #delta_luma_weight_l1(int)
    public StdVideoEncodeH265WeightTable delta_luma_weight_l1(byte delta_luma_weight_l1, int index0) {
    	DELTA_LUMA_WEIGHT_L1_HANDLE.set(segment, 0L, index0, delta_luma_weight_l1);
    	return this;
    }
    
    public byte delta_luma_weight_l1(int index0) {
    	return (byte) DELTA_LUMA_WEIGHT_L1_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #luma_offset_l1(int)
    public StdVideoEncodeH265WeightTable luma_offset_l1(byte luma_offset_l1, int index0) {
    	LUMA_OFFSET_L1_HANDLE.set(segment, 0L, index0, luma_offset_l1);
    	return this;
    }
    
    public byte luma_offset_l1(int index0) {
    	return (byte) LUMA_OFFSET_L1_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #delta_chroma_weight_l1(int, int)
    public StdVideoEncodeH265WeightTable delta_chroma_weight_l1(byte delta_chroma_weight_l1, int index0, int index1) {
    	DELTA_CHROMA_WEIGHT_L1_HANDLE.set(segment, 0L, index0, index1, delta_chroma_weight_l1);
    	return this;
    }
    
    public byte delta_chroma_weight_l1(int index0, int index1) {
    	return (byte) DELTA_CHROMA_WEIGHT_L1_HANDLE.get(segment, 0L, index0, index1);
    }
    
    /// @see #delta_chroma_offset_l1(int, int)
    public StdVideoEncodeH265WeightTable delta_chroma_offset_l1(byte delta_chroma_offset_l1, int index0, int index1) {
    	DELTA_CHROMA_OFFSET_L1_HANDLE.set(segment, 0L, index0, index1, delta_chroma_offset_l1);
    	return this;
    }
    
    public byte delta_chroma_offset_l1(int index0, int index1) {
    	return (byte) DELTA_CHROMA_OFFSET_L1_HANDLE.get(segment, 0L, index0, index1);
    }
    
    /// @see #flags()
    public StdVideoEncodeH265WeightTable flags(Consumer<StdVideoEncodeH265WeightTableFlags> consumer) {
    	consumer.accept(flags);
    	return this;
    }
    
    /// @see #flags()
    public StdVideoEncodeH265WeightTable flags(StdVideoEncodeH265WeightTableFlags other) {
    	flags.set(other);
    	return this;
    }
    
    public StdVideoEncodeH265WeightTableFlags flags() {
    	return flags;
    }
    
    @Override
    public StdVideoEncodeH265WeightTable set(StdVideoEncodeH265WeightTable other) {
        return set(other.segment);
    }
    
    @Override
    public StdVideoEncodeH265WeightTable set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<StdVideoEncodeH265WeightTable> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<StdVideoEncodeH265WeightTable> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new StdVideoEncodeH265WeightTable(segment),
            count
        );
    }
    
    public static NativeStructArray<StdVideoEncodeH265WeightTable> array(Arena arena, StdVideoEncodeH265WeightTable... structs) {
        NativeStructArray<StdVideoEncodeH265WeightTable> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new StdVideoEncodeH265WeightTable(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<StdVideoEncodeH265WeightTable> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new StdVideoEncodeH265WeightTable(segment)
        );
    }
    
}