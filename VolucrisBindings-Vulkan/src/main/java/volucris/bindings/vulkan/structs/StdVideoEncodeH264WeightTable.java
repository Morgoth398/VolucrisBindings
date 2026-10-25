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
import java.util.function.Consumer;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;

public final class StdVideoEncodeH264WeightTable
		implements Struct<StdVideoEncodeH264WeightTable> {

	public static final StructLayout LAYOUT;

	public static final VarHandle LUMA_LOG2_WEIGHT_DENOM_HANDLE;
	public static final VarHandle CHROMA_LOG2_WEIGHT_DENOM_HANDLE;
	public static final VarHandle LUMA_WEIGHT_L0_HANDLE;
	public static final VarHandle LUMA_OFFSET_L0_HANDLE;
	public static final VarHandle CHROMA_WEIGHT_L0_HANDLE;
	public static final VarHandle CHROMA_OFFSET_L0_HANDLE;
	public static final VarHandle LUMA_WEIGHT_L1_HANDLE;
	public static final VarHandle LUMA_OFFSET_L1_HANDLE;
	public static final VarHandle CHROMA_WEIGHT_L1_HANDLE;
	public static final VarHandle CHROMA_OFFSET_L1_HANDLE;

	public static final long FLAGS_BYTE_OFFSET;
	public static final long LUMA_LOG2_WEIGHT_DENOM_BYTE_OFFSET;
	public static final long CHROMA_LOG2_WEIGHT_DENOM_BYTE_OFFSET;
	public static final long LUMA_WEIGHT_L0_BYTE_OFFSET;
	public static final long LUMA_OFFSET_L0_BYTE_OFFSET;
	public static final long CHROMA_WEIGHT_L0_BYTE_OFFSET;
	public static final long CHROMA_OFFSET_L0_BYTE_OFFSET;
	public static final long LUMA_WEIGHT_L1_BYTE_OFFSET;
	public static final long LUMA_OFFSET_L1_BYTE_OFFSET;
	public static final long CHROMA_WEIGHT_L1_BYTE_OFFSET;
	public static final long CHROMA_OFFSET_L1_BYTE_OFFSET;

	private final MemorySegment segment;

	private final StdVideoEncodeH264WeightTableFlags flags;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    StdVideoEncodeH264WeightTableFlags.LAYOUT.withName("flags"),
		    JAVA_BYTE.withName("luma_log2_weight_denom"),
		    JAVA_BYTE.withName("chroma_log2_weight_denom"),
		    MemoryLayout.sequenceLayout(32, JAVA_BYTE).withName("luma_weight_l0"),
		    MemoryLayout.sequenceLayout(32, JAVA_BYTE).withName("luma_offset_l0"),
		    MemoryLayout.sequenceLayout(32, MemoryLayout.sequenceLayout(2, JAVA_BYTE)).withName("chroma_weight_l0"),
		    MemoryLayout.sequenceLayout(32, MemoryLayout.sequenceLayout(2, JAVA_BYTE)).withName("chroma_offset_l0"),
		    MemoryLayout.sequenceLayout(32, JAVA_BYTE).withName("luma_weight_l1"),
		    MemoryLayout.sequenceLayout(32, JAVA_BYTE).withName("luma_offset_l1"),
		    MemoryLayout.sequenceLayout(32, MemoryLayout.sequenceLayout(2, JAVA_BYTE)).withName("chroma_weight_l1"),
		    MemoryLayout.sequenceLayout(32, MemoryLayout.sequenceLayout(2, JAVA_BYTE)).withName("chroma_offset_l1"),
		    MemoryLayout.paddingLayout(2)
		).withName("StdVideoEncodeH264WeightTable").withByteAlignment(4);
		
		LUMA_LOG2_WEIGHT_DENOM_HANDLE = LAYOUT.varHandle(PathElement.groupElement("luma_log2_weight_denom"));
		CHROMA_LOG2_WEIGHT_DENOM_HANDLE = LAYOUT.varHandle(PathElement.groupElement("chroma_log2_weight_denom"));
		LUMA_WEIGHT_L0_HANDLE = LAYOUT.varHandle(PathElement.groupElement("luma_weight_l0"), PathElement.sequenceElement());
		LUMA_OFFSET_L0_HANDLE = LAYOUT.varHandle(PathElement.groupElement("luma_offset_l0"), PathElement.sequenceElement());
		CHROMA_WEIGHT_L0_HANDLE = LAYOUT.varHandle(PathElement.groupElement("chroma_weight_l0"), PathElement.sequenceElement(), PathElement.sequenceElement());
		CHROMA_OFFSET_L0_HANDLE = LAYOUT.varHandle(PathElement.groupElement("chroma_offset_l0"), PathElement.sequenceElement(), PathElement.sequenceElement());
		LUMA_WEIGHT_L1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("luma_weight_l1"), PathElement.sequenceElement());
		LUMA_OFFSET_L1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("luma_offset_l1"), PathElement.sequenceElement());
		CHROMA_WEIGHT_L1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("chroma_weight_l1"), PathElement.sequenceElement(), PathElement.sequenceElement());
		CHROMA_OFFSET_L1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("chroma_offset_l1"), PathElement.sequenceElement(), PathElement.sequenceElement());
		
		FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
		LUMA_LOG2_WEIGHT_DENOM_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("luma_log2_weight_denom"));
		CHROMA_LOG2_WEIGHT_DENOM_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("chroma_log2_weight_denom"));
		LUMA_WEIGHT_L0_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("luma_weight_l0"));
		LUMA_OFFSET_L0_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("luma_offset_l0"));
		CHROMA_WEIGHT_L0_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("chroma_weight_l0"));
		CHROMA_OFFSET_L0_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("chroma_offset_l0"));
		LUMA_WEIGHT_L1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("luma_weight_l1"));
		LUMA_OFFSET_L1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("luma_offset_l1"));
		CHROMA_WEIGHT_L1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("chroma_weight_l1"));
		CHROMA_OFFSET_L1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("chroma_offset_l1"));
		//@formatter:on
	}

	public StdVideoEncodeH264WeightTable() {
	    this(Arena.ofAuto());
	}
	
	public StdVideoEncodeH264WeightTable(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public StdVideoEncodeH264WeightTable(MemorySegment segment) {
	    this.segment = segment;
	
	    flags = new StdVideoEncodeH264WeightTableFlags(segment.asSlice(FLAGS_BYTE_OFFSET, StdVideoEncodeH264WeightTableFlags.LAYOUT));
	}

    /// @see #flags()
    public StdVideoEncodeH264WeightTable flags(Consumer<StdVideoEncodeH264WeightTableFlags> consumer) {
    	consumer.accept(flags);
    	return this;
    }
    
    /// @see #flags()
    public StdVideoEncodeH264WeightTable flags(StdVideoEncodeH264WeightTableFlags other) {
    	flags.set(other);
    	return this;
    }
    
    public StdVideoEncodeH264WeightTableFlags flags() {
    	return flags;
    }
    
    /// @see #luma_log2_weight_denom()
    public StdVideoEncodeH264WeightTable luma_log2_weight_denom(byte luma_log2_weight_denom) {
    	LUMA_LOG2_WEIGHT_DENOM_HANDLE.set(segment, 0L, luma_log2_weight_denom);
    	return this;
    }
    
    public byte luma_log2_weight_denom() {
    	return (byte) LUMA_LOG2_WEIGHT_DENOM_HANDLE.get(segment, 0L);
    }
    
    /// @see #chroma_log2_weight_denom()
    public StdVideoEncodeH264WeightTable chroma_log2_weight_denom(byte chroma_log2_weight_denom) {
    	CHROMA_LOG2_WEIGHT_DENOM_HANDLE.set(segment, 0L, chroma_log2_weight_denom);
    	return this;
    }
    
    public byte chroma_log2_weight_denom() {
    	return (byte) CHROMA_LOG2_WEIGHT_DENOM_HANDLE.get(segment, 0L);
    }
    
    /// @see #luma_weight_l0(int)
    public StdVideoEncodeH264WeightTable luma_weight_l0(byte luma_weight_l0, int index0) {
    	LUMA_WEIGHT_L0_HANDLE.set(segment, 0L, index0, luma_weight_l0);
    	return this;
    }
    
    public byte luma_weight_l0(int index0) {
    	return (byte) LUMA_WEIGHT_L0_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #luma_offset_l0(int)
    public StdVideoEncodeH264WeightTable luma_offset_l0(byte luma_offset_l0, int index0) {
    	LUMA_OFFSET_L0_HANDLE.set(segment, 0L, index0, luma_offset_l0);
    	return this;
    }
    
    public byte luma_offset_l0(int index0) {
    	return (byte) LUMA_OFFSET_L0_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #chroma_weight_l0(int, int)
    public StdVideoEncodeH264WeightTable chroma_weight_l0(byte chroma_weight_l0, int index0, int index1) {
    	CHROMA_WEIGHT_L0_HANDLE.set(segment, 0L, index0, index1, chroma_weight_l0);
    	return this;
    }
    
    public byte chroma_weight_l0(int index0, int index1) {
    	return (byte) CHROMA_WEIGHT_L0_HANDLE.get(segment, 0L, index0, index1);
    }
    
    /// @see #chroma_offset_l0(int, int)
    public StdVideoEncodeH264WeightTable chroma_offset_l0(byte chroma_offset_l0, int index0, int index1) {
    	CHROMA_OFFSET_L0_HANDLE.set(segment, 0L, index0, index1, chroma_offset_l0);
    	return this;
    }
    
    public byte chroma_offset_l0(int index0, int index1) {
    	return (byte) CHROMA_OFFSET_L0_HANDLE.get(segment, 0L, index0, index1);
    }
    
    /// @see #luma_weight_l1(int)
    public StdVideoEncodeH264WeightTable luma_weight_l1(byte luma_weight_l1, int index0) {
    	LUMA_WEIGHT_L1_HANDLE.set(segment, 0L, index0, luma_weight_l1);
    	return this;
    }
    
    public byte luma_weight_l1(int index0) {
    	return (byte) LUMA_WEIGHT_L1_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #luma_offset_l1(int)
    public StdVideoEncodeH264WeightTable luma_offset_l1(byte luma_offset_l1, int index0) {
    	LUMA_OFFSET_L1_HANDLE.set(segment, 0L, index0, luma_offset_l1);
    	return this;
    }
    
    public byte luma_offset_l1(int index0) {
    	return (byte) LUMA_OFFSET_L1_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #chroma_weight_l1(int, int)
    public StdVideoEncodeH264WeightTable chroma_weight_l1(byte chroma_weight_l1, int index0, int index1) {
    	CHROMA_WEIGHT_L1_HANDLE.set(segment, 0L, index0, index1, chroma_weight_l1);
    	return this;
    }
    
    public byte chroma_weight_l1(int index0, int index1) {
    	return (byte) CHROMA_WEIGHT_L1_HANDLE.get(segment, 0L, index0, index1);
    }
    
    /// @see #chroma_offset_l1(int, int)
    public StdVideoEncodeH264WeightTable chroma_offset_l1(byte chroma_offset_l1, int index0, int index1) {
    	CHROMA_OFFSET_L1_HANDLE.set(segment, 0L, index0, index1, chroma_offset_l1);
    	return this;
    }
    
    public byte chroma_offset_l1(int index0, int index1) {
    	return (byte) CHROMA_OFFSET_L1_HANDLE.get(segment, 0L, index0, index1);
    }
    
    @Override
    public StdVideoEncodeH264WeightTable set(StdVideoEncodeH264WeightTable other) {
        return set(other.segment);
    }
    
    @Override
    public StdVideoEncodeH264WeightTable set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<StdVideoEncodeH264WeightTable> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<StdVideoEncodeH264WeightTable> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new StdVideoEncodeH264WeightTable(segment),
            count
        );
    }
    
    public static NativeStructArray<StdVideoEncodeH264WeightTable> array(SegmentAllocator allocator, StdVideoEncodeH264WeightTable... structs) {
        NativeStructArray<StdVideoEncodeH264WeightTable> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new StdVideoEncodeH264WeightTable(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<StdVideoEncodeH264WeightTable> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new StdVideoEncodeH264WeightTable(segment)
        );
    }

}