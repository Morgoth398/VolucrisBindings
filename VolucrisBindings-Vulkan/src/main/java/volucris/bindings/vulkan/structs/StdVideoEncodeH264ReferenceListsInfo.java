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
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class StdVideoEncodeH264ReferenceListsInfo
		implements Struct<StdVideoEncodeH264ReferenceListsInfo> {

	public static final StructLayout LAYOUT;

	public static final VarHandle NUM_REF_IDX_L0_ACTIVE_MINUS1_HANDLE;
	public static final VarHandle NUM_REF_IDX_L1_ACTIVE_MINUS1_HANDLE;
	public static final VarHandle REF_PIC_LIST0_HANDLE;
	public static final VarHandle REF_PIC_LIST1_HANDLE;
	public static final VarHandle REF_LIST0_MOD_OP_COUNT_HANDLE;
	public static final VarHandle REF_LIST1_MOD_OP_COUNT_HANDLE;
	public static final VarHandle REF_PIC_MARKING_OP_COUNT_HANDLE;
	public static final VarHandle RESERVED1_HANDLE;
	public static final VarHandle P_REF_LIST0_MOD_OPERATIONS_HANDLE;
	public static final VarHandle P_REF_LIST1_MOD_OPERATIONS_HANDLE;
	public static final VarHandle P_REF_PIC_MARKING_OPERATIONS_HANDLE;

	public static final long FLAGS_BYTE_OFFSET;
	public static final long NUM_REF_IDX_L0_ACTIVE_MINUS1_BYTE_OFFSET;
	public static final long NUM_REF_IDX_L1_ACTIVE_MINUS1_BYTE_OFFSET;
	public static final long REF_PIC_LIST0_BYTE_OFFSET;
	public static final long REF_PIC_LIST1_BYTE_OFFSET;
	public static final long REF_LIST0_MOD_OP_COUNT_BYTE_OFFSET;
	public static final long REF_LIST1_MOD_OP_COUNT_BYTE_OFFSET;
	public static final long REF_PIC_MARKING_OP_COUNT_BYTE_OFFSET;
	public static final long RESERVED1_BYTE_OFFSET;
	public static final long P_REF_LIST0_MOD_OPERATIONS_BYTE_OFFSET;
	public static final long P_REF_LIST1_MOD_OPERATIONS_BYTE_OFFSET;
	public static final long P_REF_PIC_MARKING_OPERATIONS_BYTE_OFFSET;

	private final MemorySegment segment;

	private final StdVideoEncodeH264ReferenceListsInfoFlags flags;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    StdVideoEncodeH264ReferenceListsInfoFlags.LAYOUT.withName("flags"),
		    JAVA_BYTE.withName("num_ref_idx_l0_active_minus1"),
		    JAVA_BYTE.withName("num_ref_idx_l1_active_minus1"),
		    MemoryLayout.sequenceLayout(32, JAVA_BYTE).withName("RefPicList0"),
		    MemoryLayout.sequenceLayout(32, JAVA_BYTE).withName("RefPicList1"),
		    JAVA_BYTE.withName("refList0ModOpCount"),
		    JAVA_BYTE.withName("refList1ModOpCount"),
		    JAVA_BYTE.withName("refPicMarkingOpCount"),
		    MemoryLayout.sequenceLayout(7, JAVA_BYTE).withName("reserved1"),
		    UNBOUNDED_ADDRESS.withName("pRefList0ModOperations"),
		    UNBOUNDED_ADDRESS.withName("pRefList1ModOperations"),
		    UNBOUNDED_ADDRESS.withName("pRefPicMarkingOperations")
		).withName("StdVideoEncodeH264ReferenceListsInfo").withByteAlignment(8);
		
		NUM_REF_IDX_L0_ACTIVE_MINUS1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("num_ref_idx_l0_active_minus1"));
		NUM_REF_IDX_L1_ACTIVE_MINUS1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("num_ref_idx_l1_active_minus1"));
		REF_PIC_LIST0_HANDLE = LAYOUT.varHandle(PathElement.groupElement("RefPicList0"), PathElement.sequenceElement());
		REF_PIC_LIST1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("RefPicList1"), PathElement.sequenceElement());
		REF_LIST0_MOD_OP_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("refList0ModOpCount"));
		REF_LIST1_MOD_OP_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("refList1ModOpCount"));
		REF_PIC_MARKING_OP_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("refPicMarkingOpCount"));
		RESERVED1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("reserved1"), PathElement.sequenceElement());
		P_REF_LIST0_MOD_OPERATIONS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pRefList0ModOperations"));
		P_REF_LIST1_MOD_OPERATIONS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pRefList1ModOperations"));
		P_REF_PIC_MARKING_OPERATIONS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pRefPicMarkingOperations"));
		
		FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
		NUM_REF_IDX_L0_ACTIVE_MINUS1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("num_ref_idx_l0_active_minus1"));
		NUM_REF_IDX_L1_ACTIVE_MINUS1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("num_ref_idx_l1_active_minus1"));
		REF_PIC_LIST0_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("RefPicList0"));
		REF_PIC_LIST1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("RefPicList1"));
		REF_LIST0_MOD_OP_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("refList0ModOpCount"));
		REF_LIST1_MOD_OP_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("refList1ModOpCount"));
		REF_PIC_MARKING_OP_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("refPicMarkingOpCount"));
		RESERVED1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("reserved1"));
		P_REF_LIST0_MOD_OPERATIONS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pRefList0ModOperations"));
		P_REF_LIST1_MOD_OPERATIONS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pRefList1ModOperations"));
		P_REF_PIC_MARKING_OPERATIONS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pRefPicMarkingOperations"));
		//@formatter:on
	}

	public StdVideoEncodeH264ReferenceListsInfo() {
	    this(Arena.ofAuto());
	}
	
	public StdVideoEncodeH264ReferenceListsInfo(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public StdVideoEncodeH264ReferenceListsInfo(MemorySegment segment) {
	    this.segment = segment;
	
	    flags = new StdVideoEncodeH264ReferenceListsInfoFlags(segment.asSlice(FLAGS_BYTE_OFFSET, StdVideoEncodeH264ReferenceListsInfoFlags.LAYOUT));
	}

    /// @see #flags()
    public StdVideoEncodeH264ReferenceListsInfo flags(Consumer<StdVideoEncodeH264ReferenceListsInfoFlags> consumer) {
    	consumer.accept(flags);
    	return this;
    }
    
    /// @see #flags()
    public StdVideoEncodeH264ReferenceListsInfo flags(StdVideoEncodeH264ReferenceListsInfoFlags other) {
    	flags.set(other);
    	return this;
    }
    
    public StdVideoEncodeH264ReferenceListsInfoFlags flags() {
    	return flags;
    }
    
    /// @see #num_ref_idx_l0_active_minus1()
    public StdVideoEncodeH264ReferenceListsInfo num_ref_idx_l0_active_minus1(byte num_ref_idx_l0_active_minus1) {
    	NUM_REF_IDX_L0_ACTIVE_MINUS1_HANDLE.set(segment, 0L, num_ref_idx_l0_active_minus1);
    	return this;
    }
    
    public byte num_ref_idx_l0_active_minus1() {
    	return (byte) NUM_REF_IDX_L0_ACTIVE_MINUS1_HANDLE.get(segment, 0L);
    }
    
    /// @see #num_ref_idx_l1_active_minus1()
    public StdVideoEncodeH264ReferenceListsInfo num_ref_idx_l1_active_minus1(byte num_ref_idx_l1_active_minus1) {
    	NUM_REF_IDX_L1_ACTIVE_MINUS1_HANDLE.set(segment, 0L, num_ref_idx_l1_active_minus1);
    	return this;
    }
    
    public byte num_ref_idx_l1_active_minus1() {
    	return (byte) NUM_REF_IDX_L1_ACTIVE_MINUS1_HANDLE.get(segment, 0L);
    }
    
    /// @see #refPicList0(int)
    public StdVideoEncodeH264ReferenceListsInfo refPicList0(byte refPicList0, int index0) {
    	REF_PIC_LIST0_HANDLE.set(segment, 0L, index0, refPicList0);
    	return this;
    }
    
    public byte refPicList0(int index0) {
    	return (byte) REF_PIC_LIST0_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #refPicList1(int)
    public StdVideoEncodeH264ReferenceListsInfo refPicList1(byte refPicList1, int index0) {
    	REF_PIC_LIST1_HANDLE.set(segment, 0L, index0, refPicList1);
    	return this;
    }
    
    public byte refPicList1(int index0) {
    	return (byte) REF_PIC_LIST1_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #refList0ModOpCount()
    public StdVideoEncodeH264ReferenceListsInfo refList0ModOpCount(byte refList0ModOpCount) {
    	REF_LIST0_MOD_OP_COUNT_HANDLE.set(segment, 0L, refList0ModOpCount);
    	return this;
    }
    
    public byte refList0ModOpCount() {
    	return (byte) REF_LIST0_MOD_OP_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #refList1ModOpCount()
    public StdVideoEncodeH264ReferenceListsInfo refList1ModOpCount(byte refList1ModOpCount) {
    	REF_LIST1_MOD_OP_COUNT_HANDLE.set(segment, 0L, refList1ModOpCount);
    	return this;
    }
    
    public byte refList1ModOpCount() {
    	return (byte) REF_LIST1_MOD_OP_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #refPicMarkingOpCount()
    public StdVideoEncodeH264ReferenceListsInfo refPicMarkingOpCount(byte refPicMarkingOpCount) {
    	REF_PIC_MARKING_OP_COUNT_HANDLE.set(segment, 0L, refPicMarkingOpCount);
    	return this;
    }
    
    public byte refPicMarkingOpCount() {
    	return (byte) REF_PIC_MARKING_OP_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #reserved1(int)
    public StdVideoEncodeH264ReferenceListsInfo reserved1(byte reserved1, int index0) {
    	RESERVED1_HANDLE.set(segment, 0L, index0, reserved1);
    	return this;
    }
    
    public byte reserved1(int index0) {
    	return (byte) RESERVED1_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #pRefList0ModOperations()
    public StdVideoEncodeH264ReferenceListsInfo pRefList0ModOperations(NativeStructArray<StdVideoEncodeH264RefListModEntry> pRefList0ModOperations) {
    	P_REF_LIST0_MOD_OPERATIONS_HANDLE.set(segment, 0L, pRefList0ModOperations.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<StdVideoEncodeH264RefListModEntry> pRefList0ModOperations() {
    	MemorySegment segment = (MemorySegment) P_REF_LIST0_MOD_OPERATIONS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return StdVideoEncodeH264RefListModEntry.array(segment);
    }
    
    /// @see #pRefList1ModOperations()
    public StdVideoEncodeH264ReferenceListsInfo pRefList1ModOperations(NativeStructArray<StdVideoEncodeH264RefListModEntry> pRefList1ModOperations) {
    	P_REF_LIST1_MOD_OPERATIONS_HANDLE.set(segment, 0L, pRefList1ModOperations.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<StdVideoEncodeH264RefListModEntry> pRefList1ModOperations() {
    	MemorySegment segment = (MemorySegment) P_REF_LIST1_MOD_OPERATIONS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return StdVideoEncodeH264RefListModEntry.array(segment);
    }
    
    /// @see #pRefPicMarkingOperations()
    public StdVideoEncodeH264ReferenceListsInfo pRefPicMarkingOperations(NativeStructArray<StdVideoEncodeH264RefPicMarkingEntry> pRefPicMarkingOperations) {
    	P_REF_PIC_MARKING_OPERATIONS_HANDLE.set(segment, 0L, pRefPicMarkingOperations.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<StdVideoEncodeH264RefPicMarkingEntry> pRefPicMarkingOperations() {
    	MemorySegment segment = (MemorySegment) P_REF_PIC_MARKING_OPERATIONS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return StdVideoEncodeH264RefPicMarkingEntry.array(segment);
    }
    
    @Override
    public StdVideoEncodeH264ReferenceListsInfo set(StdVideoEncodeH264ReferenceListsInfo other) {
        return set(other.segment);
    }
    
    @Override
    public StdVideoEncodeH264ReferenceListsInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<StdVideoEncodeH264ReferenceListsInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<StdVideoEncodeH264ReferenceListsInfo> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new StdVideoEncodeH264ReferenceListsInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<StdVideoEncodeH264ReferenceListsInfo> array(SegmentAllocator allocator, StdVideoEncodeH264ReferenceListsInfo... structs) {
        NativeStructArray<StdVideoEncodeH264ReferenceListsInfo> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new StdVideoEncodeH264ReferenceListsInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<StdVideoEncodeH264ReferenceListsInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new StdVideoEncodeH264ReferenceListsInfo(segment)
        );
    }

}