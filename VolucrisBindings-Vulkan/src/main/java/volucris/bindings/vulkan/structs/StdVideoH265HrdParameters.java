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
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class StdVideoH265HrdParameters
		implements Struct<StdVideoH265HrdParameters> {

    public static final StructLayout LAYOUT;

    public static final VarHandle TICK_DIVISOR_MINUS2_HANDLE;
    public static final VarHandle DU_CPB_REMOVAL_DELAY_INCREMENT_LENGTH_MINUS1_HANDLE;
    public static final VarHandle DPB_OUTPUT_DELAY_DU_LENGTH_MINUS1_HANDLE;
    public static final VarHandle BIT_RATE_SCALE_HANDLE;
    public static final VarHandle CPB_SIZE_SCALE_HANDLE;
    public static final VarHandle CPB_SIZE_DU_SCALE_HANDLE;
    public static final VarHandle INITIAL_CPB_REMOVAL_DELAY_LENGTH_MINUS1_HANDLE;
    public static final VarHandle AU_CPB_REMOVAL_DELAY_LENGTH_MINUS1_HANDLE;
    public static final VarHandle DPB_OUTPUT_DELAY_LENGTH_MINUS1_HANDLE;
    public static final VarHandle CPB_CNT_MINUS1_HANDLE;
    public static final VarHandle ELEMENTAL_DURATION_IN_TC_MINUS1_HANDLE;
    public static final VarHandle RESERVED_HANDLE;
    public static final VarHandle P_SUB_LAYER_HRD_PARAMETERS_NAL_HANDLE;
    public static final VarHandle P_SUB_LAYER_HRD_PARAMETERS_VCL_HANDLE;

    public static final long FLAGS_BYTE_OFFSET;
    public static final long TICK_DIVISOR_MINUS2_BYTE_OFFSET;
    public static final long DU_CPB_REMOVAL_DELAY_INCREMENT_LENGTH_MINUS1_BYTE_OFFSET;
    public static final long DPB_OUTPUT_DELAY_DU_LENGTH_MINUS1_BYTE_OFFSET;
    public static final long BIT_RATE_SCALE_BYTE_OFFSET;
    public static final long CPB_SIZE_SCALE_BYTE_OFFSET;
    public static final long CPB_SIZE_DU_SCALE_BYTE_OFFSET;
    public static final long INITIAL_CPB_REMOVAL_DELAY_LENGTH_MINUS1_BYTE_OFFSET;
    public static final long AU_CPB_REMOVAL_DELAY_LENGTH_MINUS1_BYTE_OFFSET;
    public static final long DPB_OUTPUT_DELAY_LENGTH_MINUS1_BYTE_OFFSET;
    public static final long CPB_CNT_MINUS1_BYTE_OFFSET;
    public static final long ELEMENTAL_DURATION_IN_TC_MINUS1_BYTE_OFFSET;
    public static final long RESERVED_BYTE_OFFSET;
    public static final long P_SUB_LAYER_HRD_PARAMETERS_NAL_BYTE_OFFSET;
    public static final long P_SUB_LAYER_HRD_PARAMETERS_VCL_BYTE_OFFSET;

    private final MemorySegment segment;

    private final StdVideoH265HrdFlags flags;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            StdVideoH265HrdFlags.LAYOUT.withName("flags"),
            JAVA_BYTE.withName("tick_divisor_minus2"),
            JAVA_BYTE.withName("du_cpb_removal_delay_increment_length_minus1"),
            JAVA_BYTE.withName("dpb_output_delay_du_length_minus1"),
            JAVA_BYTE.withName("bit_rate_scale"),
            JAVA_BYTE.withName("cpb_size_scale"),
            JAVA_BYTE.withName("cpb_size_du_scale"),
            JAVA_BYTE.withName("initial_cpb_removal_delay_length_minus1"),
            JAVA_BYTE.withName("au_cpb_removal_delay_length_minus1"),
            JAVA_BYTE.withName("dpb_output_delay_length_minus1"),
            MemoryLayout.sequenceLayout(7, JAVA_BYTE).withName("cpb_cnt_minus1"),
            MemoryLayout.sequenceLayout(7, JAVA_SHORT).withName("elemental_duration_in_tc_minus1"),
            MemoryLayout.sequenceLayout(3, JAVA_SHORT).withName("reserved"),
            UNBOUNDED_ADDRESS.withName("pSubLayerHrdParametersNal"),
            UNBOUNDED_ADDRESS.withName("pSubLayerHrdParametersVcl")
        ).withName("StdVideoH265HrdParameters").withByteAlignment(8);
        
        TICK_DIVISOR_MINUS2_HANDLE = LAYOUT.varHandle(PathElement.groupElement("tick_divisor_minus2"));
        DU_CPB_REMOVAL_DELAY_INCREMENT_LENGTH_MINUS1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("du_cpb_removal_delay_increment_length_minus1"));
        DPB_OUTPUT_DELAY_DU_LENGTH_MINUS1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("dpb_output_delay_du_length_minus1"));
        BIT_RATE_SCALE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("bit_rate_scale"));
        CPB_SIZE_SCALE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("cpb_size_scale"));
        CPB_SIZE_DU_SCALE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("cpb_size_du_scale"));
        INITIAL_CPB_REMOVAL_DELAY_LENGTH_MINUS1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("initial_cpb_removal_delay_length_minus1"));
        AU_CPB_REMOVAL_DELAY_LENGTH_MINUS1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("au_cpb_removal_delay_length_minus1"));
        DPB_OUTPUT_DELAY_LENGTH_MINUS1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("dpb_output_delay_length_minus1"));
        CPB_CNT_MINUS1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("cpb_cnt_minus1"), PathElement.sequenceElement());
        ELEMENTAL_DURATION_IN_TC_MINUS1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("elemental_duration_in_tc_minus1"), PathElement.sequenceElement());
        RESERVED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("reserved"), PathElement.sequenceElement());
        P_SUB_LAYER_HRD_PARAMETERS_NAL_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pSubLayerHrdParametersNal"));
        P_SUB_LAYER_HRD_PARAMETERS_VCL_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pSubLayerHrdParametersVcl"));
        
        FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
        TICK_DIVISOR_MINUS2_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("tick_divisor_minus2"));
        DU_CPB_REMOVAL_DELAY_INCREMENT_LENGTH_MINUS1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("du_cpb_removal_delay_increment_length_minus1"));
        DPB_OUTPUT_DELAY_DU_LENGTH_MINUS1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dpb_output_delay_du_length_minus1"));
        BIT_RATE_SCALE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("bit_rate_scale"));
        CPB_SIZE_SCALE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("cpb_size_scale"));
        CPB_SIZE_DU_SCALE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("cpb_size_du_scale"));
        INITIAL_CPB_REMOVAL_DELAY_LENGTH_MINUS1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("initial_cpb_removal_delay_length_minus1"));
        AU_CPB_REMOVAL_DELAY_LENGTH_MINUS1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("au_cpb_removal_delay_length_minus1"));
        DPB_OUTPUT_DELAY_LENGTH_MINUS1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dpb_output_delay_length_minus1"));
        CPB_CNT_MINUS1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("cpb_cnt_minus1"));
        ELEMENTAL_DURATION_IN_TC_MINUS1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("elemental_duration_in_tc_minus1"));
        RESERVED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("reserved"));
        P_SUB_LAYER_HRD_PARAMETERS_NAL_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pSubLayerHrdParametersNal"));
        P_SUB_LAYER_HRD_PARAMETERS_VCL_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pSubLayerHrdParametersVcl"));
        //@formatter:on
    }

    public StdVideoH265HrdParameters() {
        this(Arena.ofAuto());
    }
    
    public StdVideoH265HrdParameters(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public StdVideoH265HrdParameters(MemorySegment segment) {
        this.segment = segment;
    
        flags = new StdVideoH265HrdFlags(segment.asSlice(FLAGS_BYTE_OFFSET, StdVideoH265HrdFlags.LAYOUT));
    }

    /// @see #tick_divisor_minus2()
    public StdVideoH265HrdParameters tick_divisor_minus2(byte tick_divisor_minus2) {
    	TICK_DIVISOR_MINUS2_HANDLE.set(segment, 0L, tick_divisor_minus2);
    	return this;
    }
    
    public byte tick_divisor_minus2() {
    	return (byte) TICK_DIVISOR_MINUS2_HANDLE.get(segment, 0L);
    }
    
    /// @see #du_cpb_removal_delay_increment_length_minus1()
    public StdVideoH265HrdParameters du_cpb_removal_delay_increment_length_minus1(byte du_cpb_removal_delay_increment_length_minus1) {
    	DU_CPB_REMOVAL_DELAY_INCREMENT_LENGTH_MINUS1_HANDLE.set(segment, 0L, du_cpb_removal_delay_increment_length_minus1);
    	return this;
    }
    
    public byte du_cpb_removal_delay_increment_length_minus1() {
    	return (byte) DU_CPB_REMOVAL_DELAY_INCREMENT_LENGTH_MINUS1_HANDLE.get(segment, 0L);
    }
    
    /// @see #dpb_output_delay_du_length_minus1()
    public StdVideoH265HrdParameters dpb_output_delay_du_length_minus1(byte dpb_output_delay_du_length_minus1) {
    	DPB_OUTPUT_DELAY_DU_LENGTH_MINUS1_HANDLE.set(segment, 0L, dpb_output_delay_du_length_minus1);
    	return this;
    }
    
    public byte dpb_output_delay_du_length_minus1() {
    	return (byte) DPB_OUTPUT_DELAY_DU_LENGTH_MINUS1_HANDLE.get(segment, 0L);
    }
    
    /// @see #bit_rate_scale()
    public StdVideoH265HrdParameters bit_rate_scale(byte bit_rate_scale) {
    	BIT_RATE_SCALE_HANDLE.set(segment, 0L, bit_rate_scale);
    	return this;
    }
    
    public byte bit_rate_scale() {
    	return (byte) BIT_RATE_SCALE_HANDLE.get(segment, 0L);
    }
    
    /// @see #cpb_size_scale()
    public StdVideoH265HrdParameters cpb_size_scale(byte cpb_size_scale) {
    	CPB_SIZE_SCALE_HANDLE.set(segment, 0L, cpb_size_scale);
    	return this;
    }
    
    public byte cpb_size_scale() {
    	return (byte) CPB_SIZE_SCALE_HANDLE.get(segment, 0L);
    }
    
    /// @see #cpb_size_du_scale()
    public StdVideoH265HrdParameters cpb_size_du_scale(byte cpb_size_du_scale) {
    	CPB_SIZE_DU_SCALE_HANDLE.set(segment, 0L, cpb_size_du_scale);
    	return this;
    }
    
    public byte cpb_size_du_scale() {
    	return (byte) CPB_SIZE_DU_SCALE_HANDLE.get(segment, 0L);
    }
    
    /// @see #initial_cpb_removal_delay_length_minus1()
    public StdVideoH265HrdParameters initial_cpb_removal_delay_length_minus1(byte initial_cpb_removal_delay_length_minus1) {
    	INITIAL_CPB_REMOVAL_DELAY_LENGTH_MINUS1_HANDLE.set(segment, 0L, initial_cpb_removal_delay_length_minus1);
    	return this;
    }
    
    public byte initial_cpb_removal_delay_length_minus1() {
    	return (byte) INITIAL_CPB_REMOVAL_DELAY_LENGTH_MINUS1_HANDLE.get(segment, 0L);
    }
    
    /// @see #au_cpb_removal_delay_length_minus1()
    public StdVideoH265HrdParameters au_cpb_removal_delay_length_minus1(byte au_cpb_removal_delay_length_minus1) {
    	AU_CPB_REMOVAL_DELAY_LENGTH_MINUS1_HANDLE.set(segment, 0L, au_cpb_removal_delay_length_minus1);
    	return this;
    }
    
    public byte au_cpb_removal_delay_length_minus1() {
    	return (byte) AU_CPB_REMOVAL_DELAY_LENGTH_MINUS1_HANDLE.get(segment, 0L);
    }
    
    /// @see #dpb_output_delay_length_minus1()
    public StdVideoH265HrdParameters dpb_output_delay_length_minus1(byte dpb_output_delay_length_minus1) {
    	DPB_OUTPUT_DELAY_LENGTH_MINUS1_HANDLE.set(segment, 0L, dpb_output_delay_length_minus1);
    	return this;
    }
    
    public byte dpb_output_delay_length_minus1() {
    	return (byte) DPB_OUTPUT_DELAY_LENGTH_MINUS1_HANDLE.get(segment, 0L);
    }
    
    /// @see #cpb_cnt_minus1(int)
    public StdVideoH265HrdParameters cpb_cnt_minus1(byte cpb_cnt_minus1, int index0) {
    	CPB_CNT_MINUS1_HANDLE.set(segment, 0L, index0, cpb_cnt_minus1);
    	return this;
    }
    
    public byte cpb_cnt_minus1(int index0) {
    	return (byte) CPB_CNT_MINUS1_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #elemental_duration_in_tc_minus1(int)
    public StdVideoH265HrdParameters elemental_duration_in_tc_minus1(short elemental_duration_in_tc_minus1, int index0) {
    	ELEMENTAL_DURATION_IN_TC_MINUS1_HANDLE.set(segment, 0L, index0, elemental_duration_in_tc_minus1);
    	return this;
    }
    
    public short elemental_duration_in_tc_minus1(int index0) {
    	return (short) ELEMENTAL_DURATION_IN_TC_MINUS1_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #reserved(int)
    public StdVideoH265HrdParameters reserved(short reserved, int index0) {
    	RESERVED_HANDLE.set(segment, 0L, index0, reserved);
    	return this;
    }
    
    public short reserved(int index0) {
    	return (short) RESERVED_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #pSubLayerHrdParametersNal()
    public StdVideoH265HrdParameters pSubLayerHrdParametersNal(NativeStructArray<StdVideoH265SubLayerHrdParameters> pSubLayerHrdParametersNal) {
    	P_SUB_LAYER_HRD_PARAMETERS_NAL_HANDLE.set(segment, 0L, pSubLayerHrdParametersNal.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<StdVideoH265SubLayerHrdParameters> pSubLayerHrdParametersNal() {
    	MemorySegment segment = (MemorySegment) P_SUB_LAYER_HRD_PARAMETERS_NAL_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return StdVideoH265SubLayerHrdParameters.array(segment);
    }
    
    /// @see #pSubLayerHrdParametersVcl()
    public StdVideoH265HrdParameters pSubLayerHrdParametersVcl(NativeStructArray<StdVideoH265SubLayerHrdParameters> pSubLayerHrdParametersVcl) {
    	P_SUB_LAYER_HRD_PARAMETERS_VCL_HANDLE.set(segment, 0L, pSubLayerHrdParametersVcl.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<StdVideoH265SubLayerHrdParameters> pSubLayerHrdParametersVcl() {
    	MemorySegment segment = (MemorySegment) P_SUB_LAYER_HRD_PARAMETERS_VCL_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return StdVideoH265SubLayerHrdParameters.array(segment);
    }
    
    /// @see #flags()
    public StdVideoH265HrdParameters flags(Consumer<StdVideoH265HrdFlags> consumer) {
    	consumer.accept(flags);
    	return this;
    }
    
    /// @see #flags()
    public StdVideoH265HrdParameters flags(StdVideoH265HrdFlags other) {
    	flags.set(other);
    	return this;
    }
    
    public StdVideoH265HrdFlags flags() {
    	return flags;
    }
    
    @Override
    public StdVideoH265HrdParameters set(StdVideoH265HrdParameters other) {
        return set(other.segment);
    }
    
    @Override
    public StdVideoH265HrdParameters set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<StdVideoH265HrdParameters> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<StdVideoH265HrdParameters> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new StdVideoH265HrdParameters(segment),
            count
        );
    }
    
    public static NativeStructArray<StdVideoH265HrdParameters> array(Arena arena, StdVideoH265HrdParameters... structs) {
        NativeStructArray<StdVideoH265HrdParameters> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new StdVideoH265HrdParameters(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<StdVideoH265HrdParameters> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new StdVideoH265HrdParameters(segment)
        );
    }
    
}