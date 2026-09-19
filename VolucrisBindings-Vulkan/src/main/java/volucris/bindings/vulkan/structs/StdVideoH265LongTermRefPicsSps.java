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

public final class StdVideoH265LongTermRefPicsSps
		implements Struct<StdVideoH265LongTermRefPicsSps> {

    public static final StructLayout LAYOUT;

    public static final VarHandle USED_BY_CURR_PIC_LT_SPS_FLAG_HANDLE;
    public static final VarHandle LT_REF_PIC_POC_LSB_SPS_HANDLE;

    public static final long USED_BY_CURR_PIC_LT_SPS_FLAG_BYTE_OFFSET;
    public static final long LT_REF_PIC_POC_LSB_SPS_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("used_by_curr_pic_lt_sps_flag"),
            MemoryLayout.sequenceLayout(32, JAVA_INT).withName("lt_ref_pic_poc_lsb_sps")
        ).withName("StdVideoH265LongTermRefPicsSps").withByteAlignment(4);
        
        USED_BY_CURR_PIC_LT_SPS_FLAG_HANDLE = LAYOUT.varHandle(PathElement.groupElement("used_by_curr_pic_lt_sps_flag"));
        LT_REF_PIC_POC_LSB_SPS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("lt_ref_pic_poc_lsb_sps"), PathElement.sequenceElement());
        
        USED_BY_CURR_PIC_LT_SPS_FLAG_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("used_by_curr_pic_lt_sps_flag"));
        LT_REF_PIC_POC_LSB_SPS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("lt_ref_pic_poc_lsb_sps"));
        //@formatter:on
    }

    public StdVideoH265LongTermRefPicsSps() {
        this(Arena.ofAuto());
    }
    
    public StdVideoH265LongTermRefPicsSps(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public StdVideoH265LongTermRefPicsSps(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #used_by_curr_pic_lt_sps_flag()
    public StdVideoH265LongTermRefPicsSps used_by_curr_pic_lt_sps_flag(int used_by_curr_pic_lt_sps_flag) {
    	USED_BY_CURR_PIC_LT_SPS_FLAG_HANDLE.set(segment, 0L, used_by_curr_pic_lt_sps_flag);
    	return this;
    }
    
    public int used_by_curr_pic_lt_sps_flag() {
    	return (int) USED_BY_CURR_PIC_LT_SPS_FLAG_HANDLE.get(segment, 0L);
    }
    
    /// @see #lt_ref_pic_poc_lsb_sps(int)
    public StdVideoH265LongTermRefPicsSps lt_ref_pic_poc_lsb_sps(int lt_ref_pic_poc_lsb_sps, int index0) {
    	LT_REF_PIC_POC_LSB_SPS_HANDLE.set(segment, 0L, index0, lt_ref_pic_poc_lsb_sps);
    	return this;
    }
    
    public int lt_ref_pic_poc_lsb_sps(int index0) {
    	return (int) LT_REF_PIC_POC_LSB_SPS_HANDLE.get(segment, 0L, index0);
    }
    
    @Override
    public StdVideoH265LongTermRefPicsSps set(StdVideoH265LongTermRefPicsSps other) {
        return set(other.segment);
    }
    
    @Override
    public StdVideoH265LongTermRefPicsSps set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<StdVideoH265LongTermRefPicsSps> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<StdVideoH265LongTermRefPicsSps> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new StdVideoH265LongTermRefPicsSps(segment),
            count
        );
    }
    
    public static NativeStructArray<StdVideoH265LongTermRefPicsSps> array(Arena arena, StdVideoH265LongTermRefPicsSps... structs) {
        NativeStructArray<StdVideoH265LongTermRefPicsSps> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new StdVideoH265LongTermRefPicsSps(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<StdVideoH265LongTermRefPicsSps> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new StdVideoH265LongTermRefPicsSps(segment)
        );
    }
    
}