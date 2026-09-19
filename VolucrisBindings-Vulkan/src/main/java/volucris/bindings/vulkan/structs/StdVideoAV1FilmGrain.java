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

public final class StdVideoAV1FilmGrain
		implements Struct<StdVideoAV1FilmGrain> {

    public static final StructLayout LAYOUT;

    public static final VarHandle GRAIN_SCALING_MINUS_8_HANDLE;
    public static final VarHandle AR_COEFF_LAG_HANDLE;
    public static final VarHandle AR_COEFF_SHIFT_MINUS_6_HANDLE;
    public static final VarHandle GRAIN_SCALE_SHIFT_HANDLE;
    public static final VarHandle GRAIN_SEED_HANDLE;
    public static final VarHandle FILM_GRAIN_PARAMS_REF_IDX_HANDLE;
    public static final VarHandle NUM_Y_POINTS_HANDLE;
    public static final VarHandle POINT_Y_VALUE_HANDLE;
    public static final VarHandle POINT_Y_SCALING_HANDLE;
    public static final VarHandle NUM_CB_POINTS_HANDLE;
    public static final VarHandle POINT_CB_VALUE_HANDLE;
    public static final VarHandle POINT_CB_SCALING_HANDLE;
    public static final VarHandle NUM_CR_POINTS_HANDLE;
    public static final VarHandle POINT_CR_VALUE_HANDLE;
    public static final VarHandle POINT_CR_SCALING_HANDLE;
    public static final VarHandle AR_COEFFS_Y_PLUS_128_HANDLE;
    public static final VarHandle AR_COEFFS_CB_PLUS_128_HANDLE;
    public static final VarHandle AR_COEFFS_CR_PLUS_128_HANDLE;
    public static final VarHandle CB_MULT_HANDLE;
    public static final VarHandle CB_LUMA_MULT_HANDLE;
    public static final VarHandle CB_OFFSET_HANDLE;
    public static final VarHandle CR_MULT_HANDLE;
    public static final VarHandle CR_LUMA_MULT_HANDLE;
    public static final VarHandle CR_OFFSET_HANDLE;

    public static final long FLAGS_BYTE_OFFSET;
    public static final long GRAIN_SCALING_MINUS_8_BYTE_OFFSET;
    public static final long AR_COEFF_LAG_BYTE_OFFSET;
    public static final long AR_COEFF_SHIFT_MINUS_6_BYTE_OFFSET;
    public static final long GRAIN_SCALE_SHIFT_BYTE_OFFSET;
    public static final long GRAIN_SEED_BYTE_OFFSET;
    public static final long FILM_GRAIN_PARAMS_REF_IDX_BYTE_OFFSET;
    public static final long NUM_Y_POINTS_BYTE_OFFSET;
    public static final long POINT_Y_VALUE_BYTE_OFFSET;
    public static final long POINT_Y_SCALING_BYTE_OFFSET;
    public static final long NUM_CB_POINTS_BYTE_OFFSET;
    public static final long POINT_CB_VALUE_BYTE_OFFSET;
    public static final long POINT_CB_SCALING_BYTE_OFFSET;
    public static final long NUM_CR_POINTS_BYTE_OFFSET;
    public static final long POINT_CR_VALUE_BYTE_OFFSET;
    public static final long POINT_CR_SCALING_BYTE_OFFSET;
    public static final long AR_COEFFS_Y_PLUS_128_BYTE_OFFSET;
    public static final long AR_COEFFS_CB_PLUS_128_BYTE_OFFSET;
    public static final long AR_COEFFS_CR_PLUS_128_BYTE_OFFSET;
    public static final long CB_MULT_BYTE_OFFSET;
    public static final long CB_LUMA_MULT_BYTE_OFFSET;
    public static final long CB_OFFSET_BYTE_OFFSET;
    public static final long CR_MULT_BYTE_OFFSET;
    public static final long CR_LUMA_MULT_BYTE_OFFSET;
    public static final long CR_OFFSET_BYTE_OFFSET;

    private final MemorySegment segment;

    private final StdVideoAV1FilmGrainFlags flags;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            StdVideoAV1FilmGrainFlags.LAYOUT.withName("flags"),
            JAVA_BYTE.withName("grain_scaling_minus_8"),
            JAVA_BYTE.withName("ar_coeff_lag"),
            JAVA_BYTE.withName("ar_coeff_shift_minus_6"),
            JAVA_BYTE.withName("grain_scale_shift"),
            JAVA_SHORT.withName("grain_seed"),
            JAVA_BYTE.withName("film_grain_params_ref_idx"),
            JAVA_BYTE.withName("num_y_points"),
            MemoryLayout.sequenceLayout(14, JAVA_BYTE).withName("point_y_value"),
            MemoryLayout.sequenceLayout(14, JAVA_BYTE).withName("point_y_scaling"),
            JAVA_BYTE.withName("num_cb_points"),
            MemoryLayout.sequenceLayout(10, JAVA_BYTE).withName("point_cb_value"),
            MemoryLayout.sequenceLayout(10, JAVA_BYTE).withName("point_cb_scaling"),
            JAVA_BYTE.withName("num_cr_points"),
            MemoryLayout.sequenceLayout(10, JAVA_BYTE).withName("point_cr_value"),
            MemoryLayout.sequenceLayout(10, JAVA_BYTE).withName("point_cr_scaling"),
            MemoryLayout.sequenceLayout(24, JAVA_BYTE).withName("ar_coeffs_y_plus_128"),
            MemoryLayout.sequenceLayout(25, JAVA_BYTE).withName("ar_coeffs_cb_plus_128"),
            MemoryLayout.sequenceLayout(25, JAVA_BYTE).withName("ar_coeffs_cr_plus_128"),
            JAVA_BYTE.withName("cb_mult"),
            JAVA_BYTE.withName("cb_luma_mult"),
            JAVA_SHORT.withName("cb_offset"),
            JAVA_BYTE.withName("cr_mult"),
            JAVA_BYTE.withName("cr_luma_mult"),
            JAVA_SHORT.withName("cr_offset")
        ).withName("StdVideoAV1FilmGrain").withByteAlignment(4);
        
        GRAIN_SCALING_MINUS_8_HANDLE = LAYOUT.varHandle(PathElement.groupElement("grain_scaling_minus_8"));
        AR_COEFF_LAG_HANDLE = LAYOUT.varHandle(PathElement.groupElement("ar_coeff_lag"));
        AR_COEFF_SHIFT_MINUS_6_HANDLE = LAYOUT.varHandle(PathElement.groupElement("ar_coeff_shift_minus_6"));
        GRAIN_SCALE_SHIFT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("grain_scale_shift"));
        GRAIN_SEED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("grain_seed"));
        FILM_GRAIN_PARAMS_REF_IDX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("film_grain_params_ref_idx"));
        NUM_Y_POINTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("num_y_points"));
        POINT_Y_VALUE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("point_y_value"), PathElement.sequenceElement());
        POINT_Y_SCALING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("point_y_scaling"), PathElement.sequenceElement());
        NUM_CB_POINTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("num_cb_points"));
        POINT_CB_VALUE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("point_cb_value"), PathElement.sequenceElement());
        POINT_CB_SCALING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("point_cb_scaling"), PathElement.sequenceElement());
        NUM_CR_POINTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("num_cr_points"));
        POINT_CR_VALUE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("point_cr_value"), PathElement.sequenceElement());
        POINT_CR_SCALING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("point_cr_scaling"), PathElement.sequenceElement());
        AR_COEFFS_Y_PLUS_128_HANDLE = LAYOUT.varHandle(PathElement.groupElement("ar_coeffs_y_plus_128"), PathElement.sequenceElement());
        AR_COEFFS_CB_PLUS_128_HANDLE = LAYOUT.varHandle(PathElement.groupElement("ar_coeffs_cb_plus_128"), PathElement.sequenceElement());
        AR_COEFFS_CR_PLUS_128_HANDLE = LAYOUT.varHandle(PathElement.groupElement("ar_coeffs_cr_plus_128"), PathElement.sequenceElement());
        CB_MULT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("cb_mult"));
        CB_LUMA_MULT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("cb_luma_mult"));
        CB_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("cb_offset"));
        CR_MULT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("cr_mult"));
        CR_LUMA_MULT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("cr_luma_mult"));
        CR_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("cr_offset"));
        
        FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
        GRAIN_SCALING_MINUS_8_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("grain_scaling_minus_8"));
        AR_COEFF_LAG_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("ar_coeff_lag"));
        AR_COEFF_SHIFT_MINUS_6_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("ar_coeff_shift_minus_6"));
        GRAIN_SCALE_SHIFT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("grain_scale_shift"));
        GRAIN_SEED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("grain_seed"));
        FILM_GRAIN_PARAMS_REF_IDX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("film_grain_params_ref_idx"));
        NUM_Y_POINTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("num_y_points"));
        POINT_Y_VALUE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("point_y_value"));
        POINT_Y_SCALING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("point_y_scaling"));
        NUM_CB_POINTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("num_cb_points"));
        POINT_CB_VALUE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("point_cb_value"));
        POINT_CB_SCALING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("point_cb_scaling"));
        NUM_CR_POINTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("num_cr_points"));
        POINT_CR_VALUE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("point_cr_value"));
        POINT_CR_SCALING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("point_cr_scaling"));
        AR_COEFFS_Y_PLUS_128_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("ar_coeffs_y_plus_128"));
        AR_COEFFS_CB_PLUS_128_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("ar_coeffs_cb_plus_128"));
        AR_COEFFS_CR_PLUS_128_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("ar_coeffs_cr_plus_128"));
        CB_MULT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("cb_mult"));
        CB_LUMA_MULT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("cb_luma_mult"));
        CB_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("cb_offset"));
        CR_MULT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("cr_mult"));
        CR_LUMA_MULT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("cr_luma_mult"));
        CR_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("cr_offset"));
        //@formatter:on
    }

    public StdVideoAV1FilmGrain() {
        this(Arena.ofAuto());
    }
    
    public StdVideoAV1FilmGrain(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public StdVideoAV1FilmGrain(MemorySegment segment) {
        this.segment = segment;
    
        flags = new StdVideoAV1FilmGrainFlags(segment.asSlice(FLAGS_BYTE_OFFSET, StdVideoAV1FilmGrainFlags.LAYOUT));
    }

    /// @see #grain_scaling_minus_8()
    public StdVideoAV1FilmGrain grain_scaling_minus_8(byte grain_scaling_minus_8) {
    	GRAIN_SCALING_MINUS_8_HANDLE.set(segment, 0L, grain_scaling_minus_8);
    	return this;
    }
    
    public byte grain_scaling_minus_8() {
    	return (byte) GRAIN_SCALING_MINUS_8_HANDLE.get(segment, 0L);
    }
    
    /// @see #ar_coeff_lag()
    public StdVideoAV1FilmGrain ar_coeff_lag(byte ar_coeff_lag) {
    	AR_COEFF_LAG_HANDLE.set(segment, 0L, ar_coeff_lag);
    	return this;
    }
    
    public byte ar_coeff_lag() {
    	return (byte) AR_COEFF_LAG_HANDLE.get(segment, 0L);
    }
    
    /// @see #ar_coeff_shift_minus_6()
    public StdVideoAV1FilmGrain ar_coeff_shift_minus_6(byte ar_coeff_shift_minus_6) {
    	AR_COEFF_SHIFT_MINUS_6_HANDLE.set(segment, 0L, ar_coeff_shift_minus_6);
    	return this;
    }
    
    public byte ar_coeff_shift_minus_6() {
    	return (byte) AR_COEFF_SHIFT_MINUS_6_HANDLE.get(segment, 0L);
    }
    
    /// @see #grain_scale_shift()
    public StdVideoAV1FilmGrain grain_scale_shift(byte grain_scale_shift) {
    	GRAIN_SCALE_SHIFT_HANDLE.set(segment, 0L, grain_scale_shift);
    	return this;
    }
    
    public byte grain_scale_shift() {
    	return (byte) GRAIN_SCALE_SHIFT_HANDLE.get(segment, 0L);
    }
    
    /// @see #grain_seed()
    public StdVideoAV1FilmGrain grain_seed(short grain_seed) {
    	GRAIN_SEED_HANDLE.set(segment, 0L, grain_seed);
    	return this;
    }
    
    public short grain_seed() {
    	return (short) GRAIN_SEED_HANDLE.get(segment, 0L);
    }
    
    /// @see #film_grain_params_ref_idx()
    public StdVideoAV1FilmGrain film_grain_params_ref_idx(byte film_grain_params_ref_idx) {
    	FILM_GRAIN_PARAMS_REF_IDX_HANDLE.set(segment, 0L, film_grain_params_ref_idx);
    	return this;
    }
    
    public byte film_grain_params_ref_idx() {
    	return (byte) FILM_GRAIN_PARAMS_REF_IDX_HANDLE.get(segment, 0L);
    }
    
    /// @see #num_y_points()
    public StdVideoAV1FilmGrain num_y_points(byte num_y_points) {
    	NUM_Y_POINTS_HANDLE.set(segment, 0L, num_y_points);
    	return this;
    }
    
    public byte num_y_points() {
    	return (byte) NUM_Y_POINTS_HANDLE.get(segment, 0L);
    }
    
    /// @see #point_y_value(int)
    public StdVideoAV1FilmGrain point_y_value(byte point_y_value, int index0) {
    	POINT_Y_VALUE_HANDLE.set(segment, 0L, index0, point_y_value);
    	return this;
    }
    
    public byte point_y_value(int index0) {
    	return (byte) POINT_Y_VALUE_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #point_y_scaling(int)
    public StdVideoAV1FilmGrain point_y_scaling(byte point_y_scaling, int index0) {
    	POINT_Y_SCALING_HANDLE.set(segment, 0L, index0, point_y_scaling);
    	return this;
    }
    
    public byte point_y_scaling(int index0) {
    	return (byte) POINT_Y_SCALING_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #num_cb_points()
    public StdVideoAV1FilmGrain num_cb_points(byte num_cb_points) {
    	NUM_CB_POINTS_HANDLE.set(segment, 0L, num_cb_points);
    	return this;
    }
    
    public byte num_cb_points() {
    	return (byte) NUM_CB_POINTS_HANDLE.get(segment, 0L);
    }
    
    /// @see #point_cb_value(int)
    public StdVideoAV1FilmGrain point_cb_value(byte point_cb_value, int index0) {
    	POINT_CB_VALUE_HANDLE.set(segment, 0L, index0, point_cb_value);
    	return this;
    }
    
    public byte point_cb_value(int index0) {
    	return (byte) POINT_CB_VALUE_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #point_cb_scaling(int)
    public StdVideoAV1FilmGrain point_cb_scaling(byte point_cb_scaling, int index0) {
    	POINT_CB_SCALING_HANDLE.set(segment, 0L, index0, point_cb_scaling);
    	return this;
    }
    
    public byte point_cb_scaling(int index0) {
    	return (byte) POINT_CB_SCALING_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #num_cr_points()
    public StdVideoAV1FilmGrain num_cr_points(byte num_cr_points) {
    	NUM_CR_POINTS_HANDLE.set(segment, 0L, num_cr_points);
    	return this;
    }
    
    public byte num_cr_points() {
    	return (byte) NUM_CR_POINTS_HANDLE.get(segment, 0L);
    }
    
    /// @see #point_cr_value(int)
    public StdVideoAV1FilmGrain point_cr_value(byte point_cr_value, int index0) {
    	POINT_CR_VALUE_HANDLE.set(segment, 0L, index0, point_cr_value);
    	return this;
    }
    
    public byte point_cr_value(int index0) {
    	return (byte) POINT_CR_VALUE_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #point_cr_scaling(int)
    public StdVideoAV1FilmGrain point_cr_scaling(byte point_cr_scaling, int index0) {
    	POINT_CR_SCALING_HANDLE.set(segment, 0L, index0, point_cr_scaling);
    	return this;
    }
    
    public byte point_cr_scaling(int index0) {
    	return (byte) POINT_CR_SCALING_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #ar_coeffs_y_plus_128(int)
    public StdVideoAV1FilmGrain ar_coeffs_y_plus_128(byte ar_coeffs_y_plus_128, int index0) {
    	AR_COEFFS_Y_PLUS_128_HANDLE.set(segment, 0L, index0, ar_coeffs_y_plus_128);
    	return this;
    }
    
    public byte ar_coeffs_y_plus_128(int index0) {
    	return (byte) AR_COEFFS_Y_PLUS_128_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #ar_coeffs_cb_plus_128(int)
    public StdVideoAV1FilmGrain ar_coeffs_cb_plus_128(byte ar_coeffs_cb_plus_128, int index0) {
    	AR_COEFFS_CB_PLUS_128_HANDLE.set(segment, 0L, index0, ar_coeffs_cb_plus_128);
    	return this;
    }
    
    public byte ar_coeffs_cb_plus_128(int index0) {
    	return (byte) AR_COEFFS_CB_PLUS_128_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #ar_coeffs_cr_plus_128(int)
    public StdVideoAV1FilmGrain ar_coeffs_cr_plus_128(byte ar_coeffs_cr_plus_128, int index0) {
    	AR_COEFFS_CR_PLUS_128_HANDLE.set(segment, 0L, index0, ar_coeffs_cr_plus_128);
    	return this;
    }
    
    public byte ar_coeffs_cr_plus_128(int index0) {
    	return (byte) AR_COEFFS_CR_PLUS_128_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #cb_mult()
    public StdVideoAV1FilmGrain cb_mult(byte cb_mult) {
    	CB_MULT_HANDLE.set(segment, 0L, cb_mult);
    	return this;
    }
    
    public byte cb_mult() {
    	return (byte) CB_MULT_HANDLE.get(segment, 0L);
    }
    
    /// @see #cb_luma_mult()
    public StdVideoAV1FilmGrain cb_luma_mult(byte cb_luma_mult) {
    	CB_LUMA_MULT_HANDLE.set(segment, 0L, cb_luma_mult);
    	return this;
    }
    
    public byte cb_luma_mult() {
    	return (byte) CB_LUMA_MULT_HANDLE.get(segment, 0L);
    }
    
    /// @see #cb_offset()
    public StdVideoAV1FilmGrain cb_offset(short cb_offset) {
    	CB_OFFSET_HANDLE.set(segment, 0L, cb_offset);
    	return this;
    }
    
    public short cb_offset() {
    	return (short) CB_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #cr_mult()
    public StdVideoAV1FilmGrain cr_mult(byte cr_mult) {
    	CR_MULT_HANDLE.set(segment, 0L, cr_mult);
    	return this;
    }
    
    public byte cr_mult() {
    	return (byte) CR_MULT_HANDLE.get(segment, 0L);
    }
    
    /// @see #cr_luma_mult()
    public StdVideoAV1FilmGrain cr_luma_mult(byte cr_luma_mult) {
    	CR_LUMA_MULT_HANDLE.set(segment, 0L, cr_luma_mult);
    	return this;
    }
    
    public byte cr_luma_mult() {
    	return (byte) CR_LUMA_MULT_HANDLE.get(segment, 0L);
    }
    
    /// @see #cr_offset()
    public StdVideoAV1FilmGrain cr_offset(short cr_offset) {
    	CR_OFFSET_HANDLE.set(segment, 0L, cr_offset);
    	return this;
    }
    
    public short cr_offset() {
    	return (short) CR_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #flags()
    public StdVideoAV1FilmGrain flags(Consumer<StdVideoAV1FilmGrainFlags> consumer) {
    	consumer.accept(flags);
    	return this;
    }
    
    /// @see #flags()
    public StdVideoAV1FilmGrain flags(StdVideoAV1FilmGrainFlags other) {
    	flags.set(other);
    	return this;
    }
    
    public StdVideoAV1FilmGrainFlags flags() {
    	return flags;
    }
    
    @Override
    public StdVideoAV1FilmGrain set(StdVideoAV1FilmGrain other) {
        return set(other.segment);
    }
    
    @Override
    public StdVideoAV1FilmGrain set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<StdVideoAV1FilmGrain> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<StdVideoAV1FilmGrain> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new StdVideoAV1FilmGrain(segment),
            count
        );
    }
    
    public static NativeStructArray<StdVideoAV1FilmGrain> array(Arena arena, StdVideoAV1FilmGrain... structs) {
        NativeStructArray<StdVideoAV1FilmGrain> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new StdVideoAV1FilmGrain(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<StdVideoAV1FilmGrain> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new StdVideoAV1FilmGrain(segment)
        );
    }
    
}