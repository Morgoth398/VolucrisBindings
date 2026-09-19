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

public final class StdVideoEncodeH265ReferenceListsInfo
		implements Struct<StdVideoEncodeH265ReferenceListsInfo> {

    public static final StructLayout LAYOUT;

    public static final VarHandle NUM_REF_IDX_L0_ACTIVE_MINUS1_HANDLE;
    public static final VarHandle NUM_REF_IDX_L1_ACTIVE_MINUS1_HANDLE;
    public static final VarHandle REF_PIC_LIST0_HANDLE;
    public static final VarHandle REF_PIC_LIST1_HANDLE;
    public static final VarHandle LIST_ENTRY_L0_HANDLE;
    public static final VarHandle LIST_ENTRY_L1_HANDLE;

    public static final long FLAGS_BYTE_OFFSET;
    public static final long NUM_REF_IDX_L0_ACTIVE_MINUS1_BYTE_OFFSET;
    public static final long NUM_REF_IDX_L1_ACTIVE_MINUS1_BYTE_OFFSET;
    public static final long REF_PIC_LIST0_BYTE_OFFSET;
    public static final long REF_PIC_LIST1_BYTE_OFFSET;
    public static final long LIST_ENTRY_L0_BYTE_OFFSET;
    public static final long LIST_ENTRY_L1_BYTE_OFFSET;

    private final MemorySegment segment;

    private final StdVideoEncodeH265ReferenceListsInfoFlags flags;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            StdVideoEncodeH265ReferenceListsInfoFlags.LAYOUT.withName("flags"),
            JAVA_BYTE.withName("num_ref_idx_l0_active_minus1"),
            JAVA_BYTE.withName("num_ref_idx_l1_active_minus1"),
            MemoryLayout.sequenceLayout(15, JAVA_BYTE).withName("RefPicList0"),
            MemoryLayout.sequenceLayout(15, JAVA_BYTE).withName("RefPicList1"),
            MemoryLayout.sequenceLayout(15, JAVA_BYTE).withName("list_entry_l0"),
            MemoryLayout.sequenceLayout(15, JAVA_BYTE).withName("list_entry_l1"),
            MemoryLayout.paddingLayout(2)
        ).withName("StdVideoEncodeH265ReferenceListsInfo").withByteAlignment(4);
        
        NUM_REF_IDX_L0_ACTIVE_MINUS1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("num_ref_idx_l0_active_minus1"));
        NUM_REF_IDX_L1_ACTIVE_MINUS1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("num_ref_idx_l1_active_minus1"));
        REF_PIC_LIST0_HANDLE = LAYOUT.varHandle(PathElement.groupElement("RefPicList0"), PathElement.sequenceElement());
        REF_PIC_LIST1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("RefPicList1"), PathElement.sequenceElement());
        LIST_ENTRY_L0_HANDLE = LAYOUT.varHandle(PathElement.groupElement("list_entry_l0"), PathElement.sequenceElement());
        LIST_ENTRY_L1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("list_entry_l1"), PathElement.sequenceElement());
        
        FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
        NUM_REF_IDX_L0_ACTIVE_MINUS1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("num_ref_idx_l0_active_minus1"));
        NUM_REF_IDX_L1_ACTIVE_MINUS1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("num_ref_idx_l1_active_minus1"));
        REF_PIC_LIST0_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("RefPicList0"));
        REF_PIC_LIST1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("RefPicList1"));
        LIST_ENTRY_L0_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("list_entry_l0"));
        LIST_ENTRY_L1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("list_entry_l1"));
        //@formatter:on
    }

    public StdVideoEncodeH265ReferenceListsInfo() {
        this(Arena.ofAuto());
    }
    
    public StdVideoEncodeH265ReferenceListsInfo(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public StdVideoEncodeH265ReferenceListsInfo(MemorySegment segment) {
        this.segment = segment;
    
        flags = new StdVideoEncodeH265ReferenceListsInfoFlags(segment.asSlice(FLAGS_BYTE_OFFSET, StdVideoEncodeH265ReferenceListsInfoFlags.LAYOUT));
    }

    /// @see #num_ref_idx_l0_active_minus1()
    public StdVideoEncodeH265ReferenceListsInfo num_ref_idx_l0_active_minus1(byte num_ref_idx_l0_active_minus1) {
    	NUM_REF_IDX_L0_ACTIVE_MINUS1_HANDLE.set(segment, 0L, num_ref_idx_l0_active_minus1);
    	return this;
    }
    
    public byte num_ref_idx_l0_active_minus1() {
    	return (byte) NUM_REF_IDX_L0_ACTIVE_MINUS1_HANDLE.get(segment, 0L);
    }
    
    /// @see #num_ref_idx_l1_active_minus1()
    public StdVideoEncodeH265ReferenceListsInfo num_ref_idx_l1_active_minus1(byte num_ref_idx_l1_active_minus1) {
    	NUM_REF_IDX_L1_ACTIVE_MINUS1_HANDLE.set(segment, 0L, num_ref_idx_l1_active_minus1);
    	return this;
    }
    
    public byte num_ref_idx_l1_active_minus1() {
    	return (byte) NUM_REF_IDX_L1_ACTIVE_MINUS1_HANDLE.get(segment, 0L);
    }
    
    /// @see #refPicList0(int)
    public StdVideoEncodeH265ReferenceListsInfo refPicList0(byte refPicList0, int index0) {
    	REF_PIC_LIST0_HANDLE.set(segment, 0L, index0, refPicList0);
    	return this;
    }
    
    public byte refPicList0(int index0) {
    	return (byte) REF_PIC_LIST0_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #refPicList1(int)
    public StdVideoEncodeH265ReferenceListsInfo refPicList1(byte refPicList1, int index0) {
    	REF_PIC_LIST1_HANDLE.set(segment, 0L, index0, refPicList1);
    	return this;
    }
    
    public byte refPicList1(int index0) {
    	return (byte) REF_PIC_LIST1_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #list_entry_l0(int)
    public StdVideoEncodeH265ReferenceListsInfo list_entry_l0(byte list_entry_l0, int index0) {
    	LIST_ENTRY_L0_HANDLE.set(segment, 0L, index0, list_entry_l0);
    	return this;
    }
    
    public byte list_entry_l0(int index0) {
    	return (byte) LIST_ENTRY_L0_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #list_entry_l1(int)
    public StdVideoEncodeH265ReferenceListsInfo list_entry_l1(byte list_entry_l1, int index0) {
    	LIST_ENTRY_L1_HANDLE.set(segment, 0L, index0, list_entry_l1);
    	return this;
    }
    
    public byte list_entry_l1(int index0) {
    	return (byte) LIST_ENTRY_L1_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #flags()
    public StdVideoEncodeH265ReferenceListsInfo flags(Consumer<StdVideoEncodeH265ReferenceListsInfoFlags> consumer) {
    	consumer.accept(flags);
    	return this;
    }
    
    /// @see #flags()
    public StdVideoEncodeH265ReferenceListsInfo flags(StdVideoEncodeH265ReferenceListsInfoFlags other) {
    	flags.set(other);
    	return this;
    }
    
    public StdVideoEncodeH265ReferenceListsInfoFlags flags() {
    	return flags;
    }
    
    @Override
    public StdVideoEncodeH265ReferenceListsInfo set(StdVideoEncodeH265ReferenceListsInfo other) {
        return set(other.segment);
    }
    
    @Override
    public StdVideoEncodeH265ReferenceListsInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<StdVideoEncodeH265ReferenceListsInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<StdVideoEncodeH265ReferenceListsInfo> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new StdVideoEncodeH265ReferenceListsInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<StdVideoEncodeH265ReferenceListsInfo> array(Arena arena, StdVideoEncodeH265ReferenceListsInfo... structs) {
        NativeStructArray<StdVideoEncodeH265ReferenceListsInfo> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new StdVideoEncodeH265ReferenceListsInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<StdVideoEncodeH265ReferenceListsInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new StdVideoEncodeH265ReferenceListsInfo(segment)
        );
    }
    
}