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

public final class StdVideoAV1Quantization
		implements Struct<StdVideoAV1Quantization> {

	public static final StructLayout LAYOUT;

	public static final VarHandle BASE_Q_IDX_HANDLE;
	public static final VarHandle DELTA_QYDC_HANDLE;
	public static final VarHandle DELTA_QUDC_HANDLE;
	public static final VarHandle DELTA_QUAC_HANDLE;
	public static final VarHandle DELTA_QVDC_HANDLE;
	public static final VarHandle DELTA_QVAC_HANDLE;
	public static final VarHandle QM_Y_HANDLE;
	public static final VarHandle QM_U_HANDLE;
	public static final VarHandle QM_V_HANDLE;

	public static final long FLAGS_BYTE_OFFSET;
	public static final long BASE_Q_IDX_BYTE_OFFSET;
	public static final long DELTA_QYDC_BYTE_OFFSET;
	public static final long DELTA_QUDC_BYTE_OFFSET;
	public static final long DELTA_QUAC_BYTE_OFFSET;
	public static final long DELTA_QVDC_BYTE_OFFSET;
	public static final long DELTA_QVAC_BYTE_OFFSET;
	public static final long QM_Y_BYTE_OFFSET;
	public static final long QM_U_BYTE_OFFSET;
	public static final long QM_V_BYTE_OFFSET;

	private final MemorySegment segment;

	private final StdVideoAV1QuantizationFlags flags;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    StdVideoAV1QuantizationFlags.LAYOUT.withName("flags"),
		    JAVA_BYTE.withName("base_q_idx"),
		    JAVA_BYTE.withName("DeltaQYDc"),
		    JAVA_BYTE.withName("DeltaQUDc"),
		    JAVA_BYTE.withName("DeltaQUAc"),
		    JAVA_BYTE.withName("DeltaQVDc"),
		    JAVA_BYTE.withName("DeltaQVAc"),
		    JAVA_BYTE.withName("qm_y"),
		    JAVA_BYTE.withName("qm_u"),
		    JAVA_BYTE.withName("qm_v"),
		    MemoryLayout.paddingLayout(3)
		).withName("StdVideoAV1Quantization").withByteAlignment(4);
		
		BASE_Q_IDX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("base_q_idx"));
		DELTA_QYDC_HANDLE = LAYOUT.varHandle(PathElement.groupElement("DeltaQYDc"));
		DELTA_QUDC_HANDLE = LAYOUT.varHandle(PathElement.groupElement("DeltaQUDc"));
		DELTA_QUAC_HANDLE = LAYOUT.varHandle(PathElement.groupElement("DeltaQUAc"));
		DELTA_QVDC_HANDLE = LAYOUT.varHandle(PathElement.groupElement("DeltaQVDc"));
		DELTA_QVAC_HANDLE = LAYOUT.varHandle(PathElement.groupElement("DeltaQVAc"));
		QM_Y_HANDLE = LAYOUT.varHandle(PathElement.groupElement("qm_y"));
		QM_U_HANDLE = LAYOUT.varHandle(PathElement.groupElement("qm_u"));
		QM_V_HANDLE = LAYOUT.varHandle(PathElement.groupElement("qm_v"));
		
		FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
		BASE_Q_IDX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("base_q_idx"));
		DELTA_QYDC_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("DeltaQYDc"));
		DELTA_QUDC_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("DeltaQUDc"));
		DELTA_QUAC_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("DeltaQUAc"));
		DELTA_QVDC_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("DeltaQVDc"));
		DELTA_QVAC_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("DeltaQVAc"));
		QM_Y_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("qm_y"));
		QM_U_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("qm_u"));
		QM_V_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("qm_v"));
		//@formatter:on
	}

	public StdVideoAV1Quantization() {
	    this(Arena.ofAuto());
	}
	
	public StdVideoAV1Quantization(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public StdVideoAV1Quantization(MemorySegment segment) {
	    this.segment = segment;
	
	    flags = new StdVideoAV1QuantizationFlags(segment.asSlice(FLAGS_BYTE_OFFSET, StdVideoAV1QuantizationFlags.LAYOUT));
	}

    /// @see #flags()
    public StdVideoAV1Quantization flags(Consumer<StdVideoAV1QuantizationFlags> consumer) {
    	consumer.accept(flags);
    	return this;
    }
    
    /// @see #flags()
    public StdVideoAV1Quantization flags(StdVideoAV1QuantizationFlags other) {
    	flags.set(other);
    	return this;
    }
    
    public StdVideoAV1QuantizationFlags flags() {
    	return flags;
    }
    
    /// @see #base_q_idx()
    public StdVideoAV1Quantization base_q_idx(byte base_q_idx) {
    	BASE_Q_IDX_HANDLE.set(segment, 0L, base_q_idx);
    	return this;
    }
    
    public byte base_q_idx() {
    	return (byte) BASE_Q_IDX_HANDLE.get(segment, 0L);
    }
    
    /// @see #deltaQYDc()
    public StdVideoAV1Quantization deltaQYDc(byte deltaQYDc) {
    	DELTA_QYDC_HANDLE.set(segment, 0L, deltaQYDc);
    	return this;
    }
    
    public byte deltaQYDc() {
    	return (byte) DELTA_QYDC_HANDLE.get(segment, 0L);
    }
    
    /// @see #deltaQUDc()
    public StdVideoAV1Quantization deltaQUDc(byte deltaQUDc) {
    	DELTA_QUDC_HANDLE.set(segment, 0L, deltaQUDc);
    	return this;
    }
    
    public byte deltaQUDc() {
    	return (byte) DELTA_QUDC_HANDLE.get(segment, 0L);
    }
    
    /// @see #deltaQUAc()
    public StdVideoAV1Quantization deltaQUAc(byte deltaQUAc) {
    	DELTA_QUAC_HANDLE.set(segment, 0L, deltaQUAc);
    	return this;
    }
    
    public byte deltaQUAc() {
    	return (byte) DELTA_QUAC_HANDLE.get(segment, 0L);
    }
    
    /// @see #deltaQVDc()
    public StdVideoAV1Quantization deltaQVDc(byte deltaQVDc) {
    	DELTA_QVDC_HANDLE.set(segment, 0L, deltaQVDc);
    	return this;
    }
    
    public byte deltaQVDc() {
    	return (byte) DELTA_QVDC_HANDLE.get(segment, 0L);
    }
    
    /// @see #deltaQVAc()
    public StdVideoAV1Quantization deltaQVAc(byte deltaQVAc) {
    	DELTA_QVAC_HANDLE.set(segment, 0L, deltaQVAc);
    	return this;
    }
    
    public byte deltaQVAc() {
    	return (byte) DELTA_QVAC_HANDLE.get(segment, 0L);
    }
    
    /// @see #qm_y()
    public StdVideoAV1Quantization qm_y(byte qm_y) {
    	QM_Y_HANDLE.set(segment, 0L, qm_y);
    	return this;
    }
    
    public byte qm_y() {
    	return (byte) QM_Y_HANDLE.get(segment, 0L);
    }
    
    /// @see #qm_u()
    public StdVideoAV1Quantization qm_u(byte qm_u) {
    	QM_U_HANDLE.set(segment, 0L, qm_u);
    	return this;
    }
    
    public byte qm_u() {
    	return (byte) QM_U_HANDLE.get(segment, 0L);
    }
    
    /// @see #qm_v()
    public StdVideoAV1Quantization qm_v(byte qm_v) {
    	QM_V_HANDLE.set(segment, 0L, qm_v);
    	return this;
    }
    
    public byte qm_v() {
    	return (byte) QM_V_HANDLE.get(segment, 0L);
    }
    
    @Override
    public StdVideoAV1Quantization set(StdVideoAV1Quantization other) {
        return set(other.segment);
    }
    
    @Override
    public StdVideoAV1Quantization set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<StdVideoAV1Quantization> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<StdVideoAV1Quantization> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new StdVideoAV1Quantization(segment),
            count
        );
    }
    
    public static NativeStructArray<StdVideoAV1Quantization> array(SegmentAllocator allocator, StdVideoAV1Quantization... structs) {
        NativeStructArray<StdVideoAV1Quantization> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new StdVideoAV1Quantization(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<StdVideoAV1Quantization> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new StdVideoAV1Quantization(segment)
        );
    }

}