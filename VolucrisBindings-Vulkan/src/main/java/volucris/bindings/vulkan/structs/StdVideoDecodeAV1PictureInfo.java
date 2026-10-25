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

public final class StdVideoDecodeAV1PictureInfo
		implements Struct<StdVideoDecodeAV1PictureInfo> {

	public static final StructLayout LAYOUT;

	public static final VarHandle FRAME_TYPE_HANDLE;
	public static final VarHandle CURRENT_FRAME_ID_HANDLE;
	public static final VarHandle ORDER_HINT_HANDLE;
	public static final VarHandle PRIMARY_REF_FRAME_HANDLE;
	public static final VarHandle REFRESH_FRAME_FLAGS_HANDLE;
	public static final VarHandle RESERVED1_HANDLE;
	public static final VarHandle INTERPOLATION_FILTER_HANDLE;
	public static final VarHandle TX_MODE_HANDLE;
	public static final VarHandle DELTA_Q_RES_HANDLE;
	public static final VarHandle DELTA_LF_RES_HANDLE;
	public static final VarHandle SKIP_MODE_FRAME_HANDLE;
	public static final VarHandle CODED_DENOM_HANDLE;
	public static final VarHandle RESERVED2_HANDLE;
	public static final VarHandle ORDER_HINTS_HANDLE;
	public static final VarHandle EXPECTED_FRAME_ID_HANDLE;
	public static final VarHandle P_TILE_INFO_HANDLE;
	public static final VarHandle P_QUANTIZATION_HANDLE;
	public static final VarHandle P_SEGMENTATION_HANDLE;
	public static final VarHandle P_LOOP_FILTER_HANDLE;
	public static final VarHandle P_CDEF_HANDLE;
	public static final VarHandle P_LOOP_RESTORATION_HANDLE;
	public static final VarHandle P_GLOBAL_MOTION_HANDLE;
	public static final VarHandle P_FILM_GRAIN_HANDLE;

	public static final long FLAGS_BYTE_OFFSET;
	public static final long FRAME_TYPE_BYTE_OFFSET;
	public static final long CURRENT_FRAME_ID_BYTE_OFFSET;
	public static final long ORDER_HINT_BYTE_OFFSET;
	public static final long PRIMARY_REF_FRAME_BYTE_OFFSET;
	public static final long REFRESH_FRAME_FLAGS_BYTE_OFFSET;
	public static final long RESERVED1_BYTE_OFFSET;
	public static final long INTERPOLATION_FILTER_BYTE_OFFSET;
	public static final long TX_MODE_BYTE_OFFSET;
	public static final long DELTA_Q_RES_BYTE_OFFSET;
	public static final long DELTA_LF_RES_BYTE_OFFSET;
	public static final long SKIP_MODE_FRAME_BYTE_OFFSET;
	public static final long CODED_DENOM_BYTE_OFFSET;
	public static final long RESERVED2_BYTE_OFFSET;
	public static final long ORDER_HINTS_BYTE_OFFSET;
	public static final long EXPECTED_FRAME_ID_BYTE_OFFSET;
	public static final long P_TILE_INFO_BYTE_OFFSET;
	public static final long P_QUANTIZATION_BYTE_OFFSET;
	public static final long P_SEGMENTATION_BYTE_OFFSET;
	public static final long P_LOOP_FILTER_BYTE_OFFSET;
	public static final long P_CDEF_BYTE_OFFSET;
	public static final long P_LOOP_RESTORATION_BYTE_OFFSET;
	public static final long P_GLOBAL_MOTION_BYTE_OFFSET;
	public static final long P_FILM_GRAIN_BYTE_OFFSET;

	private final MemorySegment segment;

	private final StdVideoDecodeAV1PictureInfoFlags flags;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    StdVideoDecodeAV1PictureInfoFlags.LAYOUT.withName("flags"),
		    JAVA_INT.withName("frame_type"),
		    JAVA_INT.withName("current_frame_id"),
		    JAVA_BYTE.withName("OrderHint"),
		    JAVA_BYTE.withName("primary_ref_frame"),
		    JAVA_BYTE.withName("refresh_frame_flags"),
		    JAVA_BYTE.withName("reserved1"),
		    JAVA_INT.withName("interpolation_filter"),
		    JAVA_INT.withName("TxMode"),
		    JAVA_BYTE.withName("delta_q_res"),
		    JAVA_BYTE.withName("delta_lf_res"),
		    MemoryLayout.sequenceLayout(2, JAVA_BYTE).withName("SkipModeFrame"),
		    JAVA_BYTE.withName("coded_denom"),
		    MemoryLayout.sequenceLayout(3, JAVA_BYTE).withName("reserved2"),
		    MemoryLayout.sequenceLayout(8, JAVA_BYTE).withName("OrderHints"),
		    MemoryLayout.sequenceLayout(8, JAVA_INT).withName("expectedFrameId"),
		    UNBOUNDED_ADDRESS.withName("pTileInfo"),
		    UNBOUNDED_ADDRESS.withName("pQuantization"),
		    UNBOUNDED_ADDRESS.withName("pSegmentation"),
		    UNBOUNDED_ADDRESS.withName("pLoopFilter"),
		    UNBOUNDED_ADDRESS.withName("pCDEF"),
		    UNBOUNDED_ADDRESS.withName("pLoopRestoration"),
		    UNBOUNDED_ADDRESS.withName("pGlobalMotion"),
		    UNBOUNDED_ADDRESS.withName("pFilmGrain")
		).withName("StdVideoDecodeAV1PictureInfo").withByteAlignment(8);
		
		FRAME_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("frame_type"));
		CURRENT_FRAME_ID_HANDLE = LAYOUT.varHandle(PathElement.groupElement("current_frame_id"));
		ORDER_HINT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("OrderHint"));
		PRIMARY_REF_FRAME_HANDLE = LAYOUT.varHandle(PathElement.groupElement("primary_ref_frame"));
		REFRESH_FRAME_FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("refresh_frame_flags"));
		RESERVED1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("reserved1"));
		INTERPOLATION_FILTER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("interpolation_filter"));
		TX_MODE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("TxMode"));
		DELTA_Q_RES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("delta_q_res"));
		DELTA_LF_RES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("delta_lf_res"));
		SKIP_MODE_FRAME_HANDLE = LAYOUT.varHandle(PathElement.groupElement("SkipModeFrame"), PathElement.sequenceElement());
		CODED_DENOM_HANDLE = LAYOUT.varHandle(PathElement.groupElement("coded_denom"));
		RESERVED2_HANDLE = LAYOUT.varHandle(PathElement.groupElement("reserved2"), PathElement.sequenceElement());
		ORDER_HINTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("OrderHints"), PathElement.sequenceElement());
		EXPECTED_FRAME_ID_HANDLE = LAYOUT.varHandle(PathElement.groupElement("expectedFrameId"), PathElement.sequenceElement());
		P_TILE_INFO_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pTileInfo"));
		P_QUANTIZATION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pQuantization"));
		P_SEGMENTATION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pSegmentation"));
		P_LOOP_FILTER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pLoopFilter"));
		P_CDEF_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pCDEF"));
		P_LOOP_RESTORATION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pLoopRestoration"));
		P_GLOBAL_MOTION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pGlobalMotion"));
		P_FILM_GRAIN_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pFilmGrain"));
		
		FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
		FRAME_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("frame_type"));
		CURRENT_FRAME_ID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("current_frame_id"));
		ORDER_HINT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("OrderHint"));
		PRIMARY_REF_FRAME_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("primary_ref_frame"));
		REFRESH_FRAME_FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("refresh_frame_flags"));
		RESERVED1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("reserved1"));
		INTERPOLATION_FILTER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("interpolation_filter"));
		TX_MODE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("TxMode"));
		DELTA_Q_RES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("delta_q_res"));
		DELTA_LF_RES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("delta_lf_res"));
		SKIP_MODE_FRAME_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("SkipModeFrame"));
		CODED_DENOM_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("coded_denom"));
		RESERVED2_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("reserved2"));
		ORDER_HINTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("OrderHints"));
		EXPECTED_FRAME_ID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("expectedFrameId"));
		P_TILE_INFO_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pTileInfo"));
		P_QUANTIZATION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pQuantization"));
		P_SEGMENTATION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pSegmentation"));
		P_LOOP_FILTER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pLoopFilter"));
		P_CDEF_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pCDEF"));
		P_LOOP_RESTORATION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pLoopRestoration"));
		P_GLOBAL_MOTION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pGlobalMotion"));
		P_FILM_GRAIN_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pFilmGrain"));
		//@formatter:on
	}

	public StdVideoDecodeAV1PictureInfo() {
	    this(Arena.ofAuto());
	}
	
	public StdVideoDecodeAV1PictureInfo(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public StdVideoDecodeAV1PictureInfo(MemorySegment segment) {
	    this.segment = segment;
	
	    flags = new StdVideoDecodeAV1PictureInfoFlags(segment.asSlice(FLAGS_BYTE_OFFSET, StdVideoDecodeAV1PictureInfoFlags.LAYOUT));
	}

    /// @see #flags()
    public StdVideoDecodeAV1PictureInfo flags(Consumer<StdVideoDecodeAV1PictureInfoFlags> consumer) {
    	consumer.accept(flags);
    	return this;
    }
    
    /// @see #flags()
    public StdVideoDecodeAV1PictureInfo flags(StdVideoDecodeAV1PictureInfoFlags other) {
    	flags.set(other);
    	return this;
    }
    
    public StdVideoDecodeAV1PictureInfoFlags flags() {
    	return flags;
    }
    
    /// @see #frame_type()
    public StdVideoDecodeAV1PictureInfo frame_type(int frame_type) {
    	FRAME_TYPE_HANDLE.set(segment, 0L, frame_type);
    	return this;
    }
    
    public int frame_type() {
    	return (int) FRAME_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #current_frame_id()
    public StdVideoDecodeAV1PictureInfo current_frame_id(int current_frame_id) {
    	CURRENT_FRAME_ID_HANDLE.set(segment, 0L, current_frame_id);
    	return this;
    }
    
    public int current_frame_id() {
    	return (int) CURRENT_FRAME_ID_HANDLE.get(segment, 0L);
    }
    
    /// @see #orderHint()
    public StdVideoDecodeAV1PictureInfo orderHint(byte orderHint) {
    	ORDER_HINT_HANDLE.set(segment, 0L, orderHint);
    	return this;
    }
    
    public byte orderHint() {
    	return (byte) ORDER_HINT_HANDLE.get(segment, 0L);
    }
    
    /// @see #primary_ref_frame()
    public StdVideoDecodeAV1PictureInfo primary_ref_frame(byte primary_ref_frame) {
    	PRIMARY_REF_FRAME_HANDLE.set(segment, 0L, primary_ref_frame);
    	return this;
    }
    
    public byte primary_ref_frame() {
    	return (byte) PRIMARY_REF_FRAME_HANDLE.get(segment, 0L);
    }
    
    /// @see #refresh_frame_flags()
    public StdVideoDecodeAV1PictureInfo refresh_frame_flags(byte refresh_frame_flags) {
    	REFRESH_FRAME_FLAGS_HANDLE.set(segment, 0L, refresh_frame_flags);
    	return this;
    }
    
    public byte refresh_frame_flags() {
    	return (byte) REFRESH_FRAME_FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #reserved1()
    public StdVideoDecodeAV1PictureInfo reserved1(byte reserved1) {
    	RESERVED1_HANDLE.set(segment, 0L, reserved1);
    	return this;
    }
    
    public byte reserved1() {
    	return (byte) RESERVED1_HANDLE.get(segment, 0L);
    }
    
    /// @see #interpolation_filter()
    public StdVideoDecodeAV1PictureInfo interpolation_filter(int interpolation_filter) {
    	INTERPOLATION_FILTER_HANDLE.set(segment, 0L, interpolation_filter);
    	return this;
    }
    
    public int interpolation_filter() {
    	return (int) INTERPOLATION_FILTER_HANDLE.get(segment, 0L);
    }
    
    /// @see #txMode()
    public StdVideoDecodeAV1PictureInfo txMode(int txMode) {
    	TX_MODE_HANDLE.set(segment, 0L, txMode);
    	return this;
    }
    
    public int txMode() {
    	return (int) TX_MODE_HANDLE.get(segment, 0L);
    }
    
    /// @see #delta_q_res()
    public StdVideoDecodeAV1PictureInfo delta_q_res(byte delta_q_res) {
    	DELTA_Q_RES_HANDLE.set(segment, 0L, delta_q_res);
    	return this;
    }
    
    public byte delta_q_res() {
    	return (byte) DELTA_Q_RES_HANDLE.get(segment, 0L);
    }
    
    /// @see #delta_lf_res()
    public StdVideoDecodeAV1PictureInfo delta_lf_res(byte delta_lf_res) {
    	DELTA_LF_RES_HANDLE.set(segment, 0L, delta_lf_res);
    	return this;
    }
    
    public byte delta_lf_res() {
    	return (byte) DELTA_LF_RES_HANDLE.get(segment, 0L);
    }
    
    /// @see #skipModeFrame(int)
    public StdVideoDecodeAV1PictureInfo skipModeFrame(byte skipModeFrame, int index0) {
    	SKIP_MODE_FRAME_HANDLE.set(segment, 0L, index0, skipModeFrame);
    	return this;
    }
    
    public byte skipModeFrame(int index0) {
    	return (byte) SKIP_MODE_FRAME_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #coded_denom()
    public StdVideoDecodeAV1PictureInfo coded_denom(byte coded_denom) {
    	CODED_DENOM_HANDLE.set(segment, 0L, coded_denom);
    	return this;
    }
    
    public byte coded_denom() {
    	return (byte) CODED_DENOM_HANDLE.get(segment, 0L);
    }
    
    /// @see #reserved2(int)
    public StdVideoDecodeAV1PictureInfo reserved2(byte reserved2, int index0) {
    	RESERVED2_HANDLE.set(segment, 0L, index0, reserved2);
    	return this;
    }
    
    public byte reserved2(int index0) {
    	return (byte) RESERVED2_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #orderHints(int)
    public StdVideoDecodeAV1PictureInfo orderHints(byte orderHints, int index0) {
    	ORDER_HINTS_HANDLE.set(segment, 0L, index0, orderHints);
    	return this;
    }
    
    public byte orderHints(int index0) {
    	return (byte) ORDER_HINTS_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #expectedFrameId(int)
    public StdVideoDecodeAV1PictureInfo expectedFrameId(int expectedFrameId, int index0) {
    	EXPECTED_FRAME_ID_HANDLE.set(segment, 0L, index0, expectedFrameId);
    	return this;
    }
    
    public int expectedFrameId(int index0) {
    	return (int) EXPECTED_FRAME_ID_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #pTileInfo()
    public StdVideoDecodeAV1PictureInfo pTileInfo(StdVideoAV1TileInfo pTileInfo) {
    	P_TILE_INFO_HANDLE.set(segment, 0L, pTileInfo.memorySegment());
    	return this;
    }
    
    public @Nullable StdVideoAV1TileInfo pTileInfo() {
    	MemorySegment segment = (MemorySegment) P_TILE_INFO_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new StdVideoAV1TileInfo(segment);
    }
    
    /// @see #pQuantization()
    public StdVideoDecodeAV1PictureInfo pQuantization(StdVideoAV1Quantization pQuantization) {
    	P_QUANTIZATION_HANDLE.set(segment, 0L, pQuantization.memorySegment());
    	return this;
    }
    
    public @Nullable StdVideoAV1Quantization pQuantization() {
    	MemorySegment segment = (MemorySegment) P_QUANTIZATION_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new StdVideoAV1Quantization(segment);
    }
    
    /// @see #pSegmentation()
    public StdVideoDecodeAV1PictureInfo pSegmentation(StdVideoAV1Segmentation pSegmentation) {
    	P_SEGMENTATION_HANDLE.set(segment, 0L, pSegmentation.memorySegment());
    	return this;
    }
    
    public @Nullable StdVideoAV1Segmentation pSegmentation() {
    	MemorySegment segment = (MemorySegment) P_SEGMENTATION_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new StdVideoAV1Segmentation(segment);
    }
    
    /// @see #pLoopFilter()
    public StdVideoDecodeAV1PictureInfo pLoopFilter(StdVideoAV1LoopFilter pLoopFilter) {
    	P_LOOP_FILTER_HANDLE.set(segment, 0L, pLoopFilter.memorySegment());
    	return this;
    }
    
    public @Nullable StdVideoAV1LoopFilter pLoopFilter() {
    	MemorySegment segment = (MemorySegment) P_LOOP_FILTER_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new StdVideoAV1LoopFilter(segment);
    }
    
    /// @see #pCDEF()
    public StdVideoDecodeAV1PictureInfo pCDEF(StdVideoAV1CDEF pCDEF) {
    	P_CDEF_HANDLE.set(segment, 0L, pCDEF.memorySegment());
    	return this;
    }
    
    public @Nullable StdVideoAV1CDEF pCDEF() {
    	MemorySegment segment = (MemorySegment) P_CDEF_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new StdVideoAV1CDEF(segment);
    }
    
    /// @see #pLoopRestoration()
    public StdVideoDecodeAV1PictureInfo pLoopRestoration(StdVideoAV1LoopRestoration pLoopRestoration) {
    	P_LOOP_RESTORATION_HANDLE.set(segment, 0L, pLoopRestoration.memorySegment());
    	return this;
    }
    
    public @Nullable StdVideoAV1LoopRestoration pLoopRestoration() {
    	MemorySegment segment = (MemorySegment) P_LOOP_RESTORATION_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new StdVideoAV1LoopRestoration(segment);
    }
    
    /// @see #pGlobalMotion()
    public StdVideoDecodeAV1PictureInfo pGlobalMotion(StdVideoAV1GlobalMotion pGlobalMotion) {
    	P_GLOBAL_MOTION_HANDLE.set(segment, 0L, pGlobalMotion.memorySegment());
    	return this;
    }
    
    public @Nullable StdVideoAV1GlobalMotion pGlobalMotion() {
    	MemorySegment segment = (MemorySegment) P_GLOBAL_MOTION_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new StdVideoAV1GlobalMotion(segment);
    }
    
    /// @see #pFilmGrain()
    public StdVideoDecodeAV1PictureInfo pFilmGrain(StdVideoAV1FilmGrain pFilmGrain) {
    	P_FILM_GRAIN_HANDLE.set(segment, 0L, pFilmGrain.memorySegment());
    	return this;
    }
    
    public @Nullable StdVideoAV1FilmGrain pFilmGrain() {
    	MemorySegment segment = (MemorySegment) P_FILM_GRAIN_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new StdVideoAV1FilmGrain(segment);
    }
    
    @Override
    public StdVideoDecodeAV1PictureInfo set(StdVideoDecodeAV1PictureInfo other) {
        return set(other.segment);
    }
    
    @Override
    public StdVideoDecodeAV1PictureInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<StdVideoDecodeAV1PictureInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<StdVideoDecodeAV1PictureInfo> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new StdVideoDecodeAV1PictureInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<StdVideoDecodeAV1PictureInfo> array(SegmentAllocator allocator, StdVideoDecodeAV1PictureInfo... structs) {
        NativeStructArray<StdVideoDecodeAV1PictureInfo> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new StdVideoDecodeAV1PictureInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<StdVideoDecodeAV1PictureInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new StdVideoDecodeAV1PictureInfo(segment)
        );
    }

}