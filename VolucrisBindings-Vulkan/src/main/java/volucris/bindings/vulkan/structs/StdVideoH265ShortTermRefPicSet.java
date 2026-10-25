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

public final class StdVideoH265ShortTermRefPicSet
		implements Struct<StdVideoH265ShortTermRefPicSet> {

	public static final StructLayout LAYOUT;

	public static final VarHandle DELTA_IDX_MINUS1_HANDLE;
	public static final VarHandle USE_DELTA_FLAG_HANDLE;
	public static final VarHandle ABS_DELTA_RPS_MINUS1_HANDLE;
	public static final VarHandle USED_BY_CURR_PIC_FLAG_HANDLE;
	public static final VarHandle USED_BY_CURR_PIC_S0_FLAG_HANDLE;
	public static final VarHandle USED_BY_CURR_PIC_S1_FLAG_HANDLE;
	public static final VarHandle RESERVED1_HANDLE;
	public static final VarHandle RESERVED2_HANDLE;
	public static final VarHandle RESERVED3_HANDLE;
	public static final VarHandle NUM_NEGATIVE_PICS_HANDLE;
	public static final VarHandle NUM_POSITIVE_PICS_HANDLE;
	public static final VarHandle DELTA_POC_S0_MINUS1_HANDLE;
	public static final VarHandle DELTA_POC_S1_MINUS1_HANDLE;

	public static final long FLAGS_BYTE_OFFSET;
	public static final long DELTA_IDX_MINUS1_BYTE_OFFSET;
	public static final long USE_DELTA_FLAG_BYTE_OFFSET;
	public static final long ABS_DELTA_RPS_MINUS1_BYTE_OFFSET;
	public static final long USED_BY_CURR_PIC_FLAG_BYTE_OFFSET;
	public static final long USED_BY_CURR_PIC_S0_FLAG_BYTE_OFFSET;
	public static final long USED_BY_CURR_PIC_S1_FLAG_BYTE_OFFSET;
	public static final long RESERVED1_BYTE_OFFSET;
	public static final long RESERVED2_BYTE_OFFSET;
	public static final long RESERVED3_BYTE_OFFSET;
	public static final long NUM_NEGATIVE_PICS_BYTE_OFFSET;
	public static final long NUM_POSITIVE_PICS_BYTE_OFFSET;
	public static final long DELTA_POC_S0_MINUS1_BYTE_OFFSET;
	public static final long DELTA_POC_S1_MINUS1_BYTE_OFFSET;

	private final MemorySegment segment;

	private final StdVideoH265ShortTermRefPicSetFlags flags;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    StdVideoH265ShortTermRefPicSetFlags.LAYOUT.withName("flags"),
		    JAVA_INT.withName("delta_idx_minus1"),
		    JAVA_SHORT.withName("use_delta_flag"),
		    JAVA_SHORT.withName("abs_delta_rps_minus1"),
		    JAVA_SHORT.withName("used_by_curr_pic_flag"),
		    JAVA_SHORT.withName("used_by_curr_pic_s0_flag"),
		    JAVA_SHORT.withName("used_by_curr_pic_s1_flag"),
		    JAVA_SHORT.withName("reserved1"),
		    JAVA_BYTE.withName("reserved2"),
		    JAVA_BYTE.withName("reserved3"),
		    JAVA_BYTE.withName("num_negative_pics"),
		    JAVA_BYTE.withName("num_positive_pics"),
		    MemoryLayout.sequenceLayout(16, JAVA_SHORT).withName("delta_poc_s0_minus1"),
		    MemoryLayout.sequenceLayout(16, JAVA_SHORT).withName("delta_poc_s1_minus1")
		).withName("StdVideoH265ShortTermRefPicSet").withByteAlignment(4);
		
		DELTA_IDX_MINUS1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("delta_idx_minus1"));
		USE_DELTA_FLAG_HANDLE = LAYOUT.varHandle(PathElement.groupElement("use_delta_flag"));
		ABS_DELTA_RPS_MINUS1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("abs_delta_rps_minus1"));
		USED_BY_CURR_PIC_FLAG_HANDLE = LAYOUT.varHandle(PathElement.groupElement("used_by_curr_pic_flag"));
		USED_BY_CURR_PIC_S0_FLAG_HANDLE = LAYOUT.varHandle(PathElement.groupElement("used_by_curr_pic_s0_flag"));
		USED_BY_CURR_PIC_S1_FLAG_HANDLE = LAYOUT.varHandle(PathElement.groupElement("used_by_curr_pic_s1_flag"));
		RESERVED1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("reserved1"));
		RESERVED2_HANDLE = LAYOUT.varHandle(PathElement.groupElement("reserved2"));
		RESERVED3_HANDLE = LAYOUT.varHandle(PathElement.groupElement("reserved3"));
		NUM_NEGATIVE_PICS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("num_negative_pics"));
		NUM_POSITIVE_PICS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("num_positive_pics"));
		DELTA_POC_S0_MINUS1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("delta_poc_s0_minus1"), PathElement.sequenceElement());
		DELTA_POC_S1_MINUS1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("delta_poc_s1_minus1"), PathElement.sequenceElement());
		
		FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
		DELTA_IDX_MINUS1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("delta_idx_minus1"));
		USE_DELTA_FLAG_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("use_delta_flag"));
		ABS_DELTA_RPS_MINUS1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("abs_delta_rps_minus1"));
		USED_BY_CURR_PIC_FLAG_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("used_by_curr_pic_flag"));
		USED_BY_CURR_PIC_S0_FLAG_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("used_by_curr_pic_s0_flag"));
		USED_BY_CURR_PIC_S1_FLAG_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("used_by_curr_pic_s1_flag"));
		RESERVED1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("reserved1"));
		RESERVED2_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("reserved2"));
		RESERVED3_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("reserved3"));
		NUM_NEGATIVE_PICS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("num_negative_pics"));
		NUM_POSITIVE_PICS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("num_positive_pics"));
		DELTA_POC_S0_MINUS1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("delta_poc_s0_minus1"));
		DELTA_POC_S1_MINUS1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("delta_poc_s1_minus1"));
		//@formatter:on
	}

	public StdVideoH265ShortTermRefPicSet() {
	    this(Arena.ofAuto());
	}
	
	public StdVideoH265ShortTermRefPicSet(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public StdVideoH265ShortTermRefPicSet(MemorySegment segment) {
	    this.segment = segment;
	
	    flags = new StdVideoH265ShortTermRefPicSetFlags(segment.asSlice(FLAGS_BYTE_OFFSET, StdVideoH265ShortTermRefPicSetFlags.LAYOUT));
	}

    /// @see #flags()
    public StdVideoH265ShortTermRefPicSet flags(Consumer<StdVideoH265ShortTermRefPicSetFlags> consumer) {
    	consumer.accept(flags);
    	return this;
    }
    
    /// @see #flags()
    public StdVideoH265ShortTermRefPicSet flags(StdVideoH265ShortTermRefPicSetFlags other) {
    	flags.set(other);
    	return this;
    }
    
    public StdVideoH265ShortTermRefPicSetFlags flags() {
    	return flags;
    }
    
    /// @see #delta_idx_minus1()
    public StdVideoH265ShortTermRefPicSet delta_idx_minus1(int delta_idx_minus1) {
    	DELTA_IDX_MINUS1_HANDLE.set(segment, 0L, delta_idx_minus1);
    	return this;
    }
    
    public int delta_idx_minus1() {
    	return (int) DELTA_IDX_MINUS1_HANDLE.get(segment, 0L);
    }
    
    /// @see #use_delta_flag()
    public StdVideoH265ShortTermRefPicSet use_delta_flag(short use_delta_flag) {
    	USE_DELTA_FLAG_HANDLE.set(segment, 0L, use_delta_flag);
    	return this;
    }
    
    public short use_delta_flag() {
    	return (short) USE_DELTA_FLAG_HANDLE.get(segment, 0L);
    }
    
    /// @see #abs_delta_rps_minus1()
    public StdVideoH265ShortTermRefPicSet abs_delta_rps_minus1(short abs_delta_rps_minus1) {
    	ABS_DELTA_RPS_MINUS1_HANDLE.set(segment, 0L, abs_delta_rps_minus1);
    	return this;
    }
    
    public short abs_delta_rps_minus1() {
    	return (short) ABS_DELTA_RPS_MINUS1_HANDLE.get(segment, 0L);
    }
    
    /// @see #used_by_curr_pic_flag()
    public StdVideoH265ShortTermRefPicSet used_by_curr_pic_flag(short used_by_curr_pic_flag) {
    	USED_BY_CURR_PIC_FLAG_HANDLE.set(segment, 0L, used_by_curr_pic_flag);
    	return this;
    }
    
    public short used_by_curr_pic_flag() {
    	return (short) USED_BY_CURR_PIC_FLAG_HANDLE.get(segment, 0L);
    }
    
    /// @see #used_by_curr_pic_s0_flag()
    public StdVideoH265ShortTermRefPicSet used_by_curr_pic_s0_flag(short used_by_curr_pic_s0_flag) {
    	USED_BY_CURR_PIC_S0_FLAG_HANDLE.set(segment, 0L, used_by_curr_pic_s0_flag);
    	return this;
    }
    
    public short used_by_curr_pic_s0_flag() {
    	return (short) USED_BY_CURR_PIC_S0_FLAG_HANDLE.get(segment, 0L);
    }
    
    /// @see #used_by_curr_pic_s1_flag()
    public StdVideoH265ShortTermRefPicSet used_by_curr_pic_s1_flag(short used_by_curr_pic_s1_flag) {
    	USED_BY_CURR_PIC_S1_FLAG_HANDLE.set(segment, 0L, used_by_curr_pic_s1_flag);
    	return this;
    }
    
    public short used_by_curr_pic_s1_flag() {
    	return (short) USED_BY_CURR_PIC_S1_FLAG_HANDLE.get(segment, 0L);
    }
    
    /// @see #reserved1()
    public StdVideoH265ShortTermRefPicSet reserved1(short reserved1) {
    	RESERVED1_HANDLE.set(segment, 0L, reserved1);
    	return this;
    }
    
    public short reserved1() {
    	return (short) RESERVED1_HANDLE.get(segment, 0L);
    }
    
    /// @see #reserved2()
    public StdVideoH265ShortTermRefPicSet reserved2(byte reserved2) {
    	RESERVED2_HANDLE.set(segment, 0L, reserved2);
    	return this;
    }
    
    public byte reserved2() {
    	return (byte) RESERVED2_HANDLE.get(segment, 0L);
    }
    
    /// @see #reserved3()
    public StdVideoH265ShortTermRefPicSet reserved3(byte reserved3) {
    	RESERVED3_HANDLE.set(segment, 0L, reserved3);
    	return this;
    }
    
    public byte reserved3() {
    	return (byte) RESERVED3_HANDLE.get(segment, 0L);
    }
    
    /// @see #num_negative_pics()
    public StdVideoH265ShortTermRefPicSet num_negative_pics(byte num_negative_pics) {
    	NUM_NEGATIVE_PICS_HANDLE.set(segment, 0L, num_negative_pics);
    	return this;
    }
    
    public byte num_negative_pics() {
    	return (byte) NUM_NEGATIVE_PICS_HANDLE.get(segment, 0L);
    }
    
    /// @see #num_positive_pics()
    public StdVideoH265ShortTermRefPicSet num_positive_pics(byte num_positive_pics) {
    	NUM_POSITIVE_PICS_HANDLE.set(segment, 0L, num_positive_pics);
    	return this;
    }
    
    public byte num_positive_pics() {
    	return (byte) NUM_POSITIVE_PICS_HANDLE.get(segment, 0L);
    }
    
    /// @see #delta_poc_s0_minus1(int)
    public StdVideoH265ShortTermRefPicSet delta_poc_s0_minus1(short delta_poc_s0_minus1, int index0) {
    	DELTA_POC_S0_MINUS1_HANDLE.set(segment, 0L, index0, delta_poc_s0_minus1);
    	return this;
    }
    
    public short delta_poc_s0_minus1(int index0) {
    	return (short) DELTA_POC_S0_MINUS1_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #delta_poc_s1_minus1(int)
    public StdVideoH265ShortTermRefPicSet delta_poc_s1_minus1(short delta_poc_s1_minus1, int index0) {
    	DELTA_POC_S1_MINUS1_HANDLE.set(segment, 0L, index0, delta_poc_s1_minus1);
    	return this;
    }
    
    public short delta_poc_s1_minus1(int index0) {
    	return (short) DELTA_POC_S1_MINUS1_HANDLE.get(segment, 0L, index0);
    }
    
    @Override
    public StdVideoH265ShortTermRefPicSet set(StdVideoH265ShortTermRefPicSet other) {
        return set(other.segment);
    }
    
    @Override
    public StdVideoH265ShortTermRefPicSet set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<StdVideoH265ShortTermRefPicSet> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<StdVideoH265ShortTermRefPicSet> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new StdVideoH265ShortTermRefPicSet(segment),
            count
        );
    }
    
    public static NativeStructArray<StdVideoH265ShortTermRefPicSet> array(SegmentAllocator allocator, StdVideoH265ShortTermRefPicSet... structs) {
        NativeStructArray<StdVideoH265ShortTermRefPicSet> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new StdVideoH265ShortTermRefPicSet(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<StdVideoH265ShortTermRefPicSet> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new StdVideoH265ShortTermRefPicSet(segment)
        );
    }

}