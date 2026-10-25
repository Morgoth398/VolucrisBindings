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

public final class StdVideoH265VideoParameterSet
		implements Struct<StdVideoH265VideoParameterSet> {

	public static final StructLayout LAYOUT;

	public static final VarHandle VPS_VIDEO_PARAMETER_SET_ID_HANDLE;
	public static final VarHandle VPS_MAX_SUB_LAYERS_MINUS1_HANDLE;
	public static final VarHandle RESERVED1_HANDLE;
	public static final VarHandle RESERVED2_HANDLE;
	public static final VarHandle VPS_NUM_UNITS_IN_TICK_HANDLE;
	public static final VarHandle VPS_TIME_SCALE_HANDLE;
	public static final VarHandle VPS_NUM_TICKS_POC_DIFF_ONE_MINUS1_HANDLE;
	public static final VarHandle RESERVED3_HANDLE;
	public static final VarHandle P_DEC_PIC_BUF_MGR_HANDLE;
	public static final VarHandle P_HRD_PARAMETERS_HANDLE;
	public static final VarHandle P_PROFILE_TIER_LEVEL_HANDLE;

	public static final long FLAGS_BYTE_OFFSET;
	public static final long VPS_VIDEO_PARAMETER_SET_ID_BYTE_OFFSET;
	public static final long VPS_MAX_SUB_LAYERS_MINUS1_BYTE_OFFSET;
	public static final long RESERVED1_BYTE_OFFSET;
	public static final long RESERVED2_BYTE_OFFSET;
	public static final long VPS_NUM_UNITS_IN_TICK_BYTE_OFFSET;
	public static final long VPS_TIME_SCALE_BYTE_OFFSET;
	public static final long VPS_NUM_TICKS_POC_DIFF_ONE_MINUS1_BYTE_OFFSET;
	public static final long RESERVED3_BYTE_OFFSET;
	public static final long P_DEC_PIC_BUF_MGR_BYTE_OFFSET;
	public static final long P_HRD_PARAMETERS_BYTE_OFFSET;
	public static final long P_PROFILE_TIER_LEVEL_BYTE_OFFSET;

	private final MemorySegment segment;

	private final StdVideoH265VpsFlags flags;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    StdVideoH265VpsFlags.LAYOUT.withName("flags"),
		    JAVA_BYTE.withName("vps_video_parameter_set_id"),
		    JAVA_BYTE.withName("vps_max_sub_layers_minus1"),
		    JAVA_BYTE.withName("reserved1"),
		    JAVA_BYTE.withName("reserved2"),
		    JAVA_INT.withName("vps_num_units_in_tick"),
		    JAVA_INT.withName("vps_time_scale"),
		    JAVA_INT.withName("vps_num_ticks_poc_diff_one_minus1"),
		    JAVA_INT.withName("reserved3"),
		    UNBOUNDED_ADDRESS.withName("pDecPicBufMgr"),
		    UNBOUNDED_ADDRESS.withName("pHrdParameters"),
		    UNBOUNDED_ADDRESS.withName("pProfileTierLevel")
		).withName("StdVideoH265VideoParameterSet").withByteAlignment(8);
		
		VPS_VIDEO_PARAMETER_SET_ID_HANDLE = LAYOUT.varHandle(PathElement.groupElement("vps_video_parameter_set_id"));
		VPS_MAX_SUB_LAYERS_MINUS1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("vps_max_sub_layers_minus1"));
		RESERVED1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("reserved1"));
		RESERVED2_HANDLE = LAYOUT.varHandle(PathElement.groupElement("reserved2"));
		VPS_NUM_UNITS_IN_TICK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("vps_num_units_in_tick"));
		VPS_TIME_SCALE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("vps_time_scale"));
		VPS_NUM_TICKS_POC_DIFF_ONE_MINUS1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("vps_num_ticks_poc_diff_one_minus1"));
		RESERVED3_HANDLE = LAYOUT.varHandle(PathElement.groupElement("reserved3"));
		P_DEC_PIC_BUF_MGR_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pDecPicBufMgr"));
		P_HRD_PARAMETERS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pHrdParameters"));
		P_PROFILE_TIER_LEVEL_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pProfileTierLevel"));
		
		FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
		VPS_VIDEO_PARAMETER_SET_ID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vps_video_parameter_set_id"));
		VPS_MAX_SUB_LAYERS_MINUS1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vps_max_sub_layers_minus1"));
		RESERVED1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("reserved1"));
		RESERVED2_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("reserved2"));
		VPS_NUM_UNITS_IN_TICK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vps_num_units_in_tick"));
		VPS_TIME_SCALE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vps_time_scale"));
		VPS_NUM_TICKS_POC_DIFF_ONE_MINUS1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vps_num_ticks_poc_diff_one_minus1"));
		RESERVED3_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("reserved3"));
		P_DEC_PIC_BUF_MGR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pDecPicBufMgr"));
		P_HRD_PARAMETERS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pHrdParameters"));
		P_PROFILE_TIER_LEVEL_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pProfileTierLevel"));
		//@formatter:on
	}

	public StdVideoH265VideoParameterSet() {
	    this(Arena.ofAuto());
	}
	
	public StdVideoH265VideoParameterSet(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public StdVideoH265VideoParameterSet(MemorySegment segment) {
	    this.segment = segment;
	
	    flags = new StdVideoH265VpsFlags(segment.asSlice(FLAGS_BYTE_OFFSET, StdVideoH265VpsFlags.LAYOUT));
	}

    /// @see #flags()
    public StdVideoH265VideoParameterSet flags(Consumer<StdVideoH265VpsFlags> consumer) {
    	consumer.accept(flags);
    	return this;
    }
    
    /// @see #flags()
    public StdVideoH265VideoParameterSet flags(StdVideoH265VpsFlags other) {
    	flags.set(other);
    	return this;
    }
    
    public StdVideoH265VpsFlags flags() {
    	return flags;
    }
    
    /// @see #vps_video_parameter_set_id()
    public StdVideoH265VideoParameterSet vps_video_parameter_set_id(byte vps_video_parameter_set_id) {
    	VPS_VIDEO_PARAMETER_SET_ID_HANDLE.set(segment, 0L, vps_video_parameter_set_id);
    	return this;
    }
    
    public byte vps_video_parameter_set_id() {
    	return (byte) VPS_VIDEO_PARAMETER_SET_ID_HANDLE.get(segment, 0L);
    }
    
    /// @see #vps_max_sub_layers_minus1()
    public StdVideoH265VideoParameterSet vps_max_sub_layers_minus1(byte vps_max_sub_layers_minus1) {
    	VPS_MAX_SUB_LAYERS_MINUS1_HANDLE.set(segment, 0L, vps_max_sub_layers_minus1);
    	return this;
    }
    
    public byte vps_max_sub_layers_minus1() {
    	return (byte) VPS_MAX_SUB_LAYERS_MINUS1_HANDLE.get(segment, 0L);
    }
    
    /// @see #reserved1()
    public StdVideoH265VideoParameterSet reserved1(byte reserved1) {
    	RESERVED1_HANDLE.set(segment, 0L, reserved1);
    	return this;
    }
    
    public byte reserved1() {
    	return (byte) RESERVED1_HANDLE.get(segment, 0L);
    }
    
    /// @see #reserved2()
    public StdVideoH265VideoParameterSet reserved2(byte reserved2) {
    	RESERVED2_HANDLE.set(segment, 0L, reserved2);
    	return this;
    }
    
    public byte reserved2() {
    	return (byte) RESERVED2_HANDLE.get(segment, 0L);
    }
    
    /// @see #vps_num_units_in_tick()
    public StdVideoH265VideoParameterSet vps_num_units_in_tick(int vps_num_units_in_tick) {
    	VPS_NUM_UNITS_IN_TICK_HANDLE.set(segment, 0L, vps_num_units_in_tick);
    	return this;
    }
    
    public int vps_num_units_in_tick() {
    	return (int) VPS_NUM_UNITS_IN_TICK_HANDLE.get(segment, 0L);
    }
    
    /// @see #vps_time_scale()
    public StdVideoH265VideoParameterSet vps_time_scale(int vps_time_scale) {
    	VPS_TIME_SCALE_HANDLE.set(segment, 0L, vps_time_scale);
    	return this;
    }
    
    public int vps_time_scale() {
    	return (int) VPS_TIME_SCALE_HANDLE.get(segment, 0L);
    }
    
    /// @see #vps_num_ticks_poc_diff_one_minus1()
    public StdVideoH265VideoParameterSet vps_num_ticks_poc_diff_one_minus1(int vps_num_ticks_poc_diff_one_minus1) {
    	VPS_NUM_TICKS_POC_DIFF_ONE_MINUS1_HANDLE.set(segment, 0L, vps_num_ticks_poc_diff_one_minus1);
    	return this;
    }
    
    public int vps_num_ticks_poc_diff_one_minus1() {
    	return (int) VPS_NUM_TICKS_POC_DIFF_ONE_MINUS1_HANDLE.get(segment, 0L);
    }
    
    /// @see #reserved3()
    public StdVideoH265VideoParameterSet reserved3(int reserved3) {
    	RESERVED3_HANDLE.set(segment, 0L, reserved3);
    	return this;
    }
    
    public int reserved3() {
    	return (int) RESERVED3_HANDLE.get(segment, 0L);
    }
    
    /// @see #pDecPicBufMgr()
    public StdVideoH265VideoParameterSet pDecPicBufMgr(StdVideoH265DecPicBufMgr pDecPicBufMgr) {
    	P_DEC_PIC_BUF_MGR_HANDLE.set(segment, 0L, pDecPicBufMgr.memorySegment());
    	return this;
    }
    
    public @Nullable StdVideoH265DecPicBufMgr pDecPicBufMgr() {
    	MemorySegment segment = (MemorySegment) P_DEC_PIC_BUF_MGR_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new StdVideoH265DecPicBufMgr(segment);
    }
    
    /// @see #pHrdParameters()
    public StdVideoH265VideoParameterSet pHrdParameters(StdVideoH265HrdParameters pHrdParameters) {
    	P_HRD_PARAMETERS_HANDLE.set(segment, 0L, pHrdParameters.memorySegment());
    	return this;
    }
    
    public @Nullable StdVideoH265HrdParameters pHrdParameters() {
    	MemorySegment segment = (MemorySegment) P_HRD_PARAMETERS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new StdVideoH265HrdParameters(segment);
    }
    
    /// @see #pProfileTierLevel()
    public StdVideoH265VideoParameterSet pProfileTierLevel(StdVideoH265ProfileTierLevel pProfileTierLevel) {
    	P_PROFILE_TIER_LEVEL_HANDLE.set(segment, 0L, pProfileTierLevel.memorySegment());
    	return this;
    }
    
    public @Nullable StdVideoH265ProfileTierLevel pProfileTierLevel() {
    	MemorySegment segment = (MemorySegment) P_PROFILE_TIER_LEVEL_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new StdVideoH265ProfileTierLevel(segment);
    }
    
    @Override
    public StdVideoH265VideoParameterSet set(StdVideoH265VideoParameterSet other) {
        return set(other.segment);
    }
    
    @Override
    public StdVideoH265VideoParameterSet set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<StdVideoH265VideoParameterSet> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<StdVideoH265VideoParameterSet> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new StdVideoH265VideoParameterSet(segment),
            count
        );
    }
    
    public static NativeStructArray<StdVideoH265VideoParameterSet> array(SegmentAllocator allocator, StdVideoH265VideoParameterSet... structs) {
        NativeStructArray<StdVideoH265VideoParameterSet> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new StdVideoH265VideoParameterSet(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<StdVideoH265VideoParameterSet> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new StdVideoH265VideoParameterSet(segment)
        );
    }

}