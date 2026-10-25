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
import volucris.bindings.core.NativeIntArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class StdVideoEncodeAV1PictureInfo
		implements Struct<StdVideoEncodeAV1PictureInfo> {

	public static final StructLayout LAYOUT;

	public static final VarHandle FRAME_TYPE_HANDLE;
	public static final VarHandle FRAME_PRESENTATION_TIME_HANDLE;
	public static final VarHandle CURRENT_FRAME_ID_HANDLE;
	public static final VarHandle ORDER_HINT_HANDLE;
	public static final VarHandle PRIMARY_REF_FRAME_HANDLE;
	public static final VarHandle REFRESH_FRAME_FLAGS_HANDLE;
	public static final VarHandle CODED_DENOM_HANDLE;
	public static final VarHandle RENDER_WIDTH_MINUS_1_HANDLE;
	public static final VarHandle RENDER_HEIGHT_MINUS_1_HANDLE;
	public static final VarHandle INTERPOLATION_FILTER_HANDLE;
	public static final VarHandle TX_MODE_HANDLE;
	public static final VarHandle DELTA_Q_RES_HANDLE;
	public static final VarHandle DELTA_LF_RES_HANDLE;
	public static final VarHandle REF_ORDER_HINT_HANDLE;
	public static final VarHandle REF_FRAME_IDX_HANDLE;
	public static final VarHandle RESERVED1_HANDLE;
	public static final VarHandle DELTA_FRAME_ID_MINUS_1_HANDLE;
	public static final VarHandle P_TILE_INFO_HANDLE;
	public static final VarHandle P_QUANTIZATION_HANDLE;
	public static final VarHandle P_SEGMENTATION_HANDLE;
	public static final VarHandle P_LOOP_FILTER_HANDLE;
	public static final VarHandle P_CDEF_HANDLE;
	public static final VarHandle P_LOOP_RESTORATION_HANDLE;
	public static final VarHandle P_GLOBAL_MOTION_HANDLE;
	public static final VarHandle P_EXTENSION_HEADER_HANDLE;
	public static final VarHandle P_BUFFER_REMOVAL_TIMES_HANDLE;

	public static final long FLAGS_BYTE_OFFSET;
	public static final long FRAME_TYPE_BYTE_OFFSET;
	public static final long FRAME_PRESENTATION_TIME_BYTE_OFFSET;
	public static final long CURRENT_FRAME_ID_BYTE_OFFSET;
	public static final long ORDER_HINT_BYTE_OFFSET;
	public static final long PRIMARY_REF_FRAME_BYTE_OFFSET;
	public static final long REFRESH_FRAME_FLAGS_BYTE_OFFSET;
	public static final long CODED_DENOM_BYTE_OFFSET;
	public static final long RENDER_WIDTH_MINUS_1_BYTE_OFFSET;
	public static final long RENDER_HEIGHT_MINUS_1_BYTE_OFFSET;
	public static final long INTERPOLATION_FILTER_BYTE_OFFSET;
	public static final long TX_MODE_BYTE_OFFSET;
	public static final long DELTA_Q_RES_BYTE_OFFSET;
	public static final long DELTA_LF_RES_BYTE_OFFSET;
	public static final long REF_ORDER_HINT_BYTE_OFFSET;
	public static final long REF_FRAME_IDX_BYTE_OFFSET;
	public static final long RESERVED1_BYTE_OFFSET;
	public static final long DELTA_FRAME_ID_MINUS_1_BYTE_OFFSET;
	public static final long P_TILE_INFO_BYTE_OFFSET;
	public static final long P_QUANTIZATION_BYTE_OFFSET;
	public static final long P_SEGMENTATION_BYTE_OFFSET;
	public static final long P_LOOP_FILTER_BYTE_OFFSET;
	public static final long P_CDEF_BYTE_OFFSET;
	public static final long P_LOOP_RESTORATION_BYTE_OFFSET;
	public static final long P_GLOBAL_MOTION_BYTE_OFFSET;
	public static final long P_EXTENSION_HEADER_BYTE_OFFSET;
	public static final long P_BUFFER_REMOVAL_TIMES_BYTE_OFFSET;

	private final MemorySegment segment;

	private final StdVideoEncodeAV1PictureInfoFlags flags;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    StdVideoEncodeAV1PictureInfoFlags.LAYOUT.withName("flags"),
		    JAVA_INT.withName("frame_type"),
		    JAVA_INT.withName("frame_presentation_time"),
		    JAVA_INT.withName("current_frame_id"),
		    JAVA_BYTE.withName("order_hint"),
		    JAVA_BYTE.withName("primary_ref_frame"),
		    JAVA_BYTE.withName("refresh_frame_flags"),
		    JAVA_BYTE.withName("coded_denom"),
		    JAVA_SHORT.withName("render_width_minus_1"),
		    JAVA_SHORT.withName("render_height_minus_1"),
		    JAVA_INT.withName("interpolation_filter"),
		    JAVA_INT.withName("TxMode"),
		    JAVA_BYTE.withName("delta_q_res"),
		    JAVA_BYTE.withName("delta_lf_res"),
		    MemoryLayout.sequenceLayout(8, JAVA_BYTE).withName("ref_order_hint"),
		    MemoryLayout.sequenceLayout(7, JAVA_BYTE).withName("ref_frame_idx"),
		    MemoryLayout.sequenceLayout(3, JAVA_BYTE).withName("reserved1"),
		    MemoryLayout.sequenceLayout(7, JAVA_INT).withName("delta_frame_id_minus_1"),
		    UNBOUNDED_ADDRESS.withName("pTileInfo"),
		    UNBOUNDED_ADDRESS.withName("pQuantization"),
		    UNBOUNDED_ADDRESS.withName("pSegmentation"),
		    UNBOUNDED_ADDRESS.withName("pLoopFilter"),
		    UNBOUNDED_ADDRESS.withName("pCDEF"),
		    UNBOUNDED_ADDRESS.withName("pLoopRestoration"),
		    UNBOUNDED_ADDRESS.withName("pGlobalMotion"),
		    UNBOUNDED_ADDRESS.withName("pExtensionHeader"),
		    UNBOUNDED_ADDRESS.withName("pBufferRemovalTimes")
		).withName("StdVideoEncodeAV1PictureInfo").withByteAlignment(8);
		
		FRAME_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("frame_type"));
		FRAME_PRESENTATION_TIME_HANDLE = LAYOUT.varHandle(PathElement.groupElement("frame_presentation_time"));
		CURRENT_FRAME_ID_HANDLE = LAYOUT.varHandle(PathElement.groupElement("current_frame_id"));
		ORDER_HINT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("order_hint"));
		PRIMARY_REF_FRAME_HANDLE = LAYOUT.varHandle(PathElement.groupElement("primary_ref_frame"));
		REFRESH_FRAME_FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("refresh_frame_flags"));
		CODED_DENOM_HANDLE = LAYOUT.varHandle(PathElement.groupElement("coded_denom"));
		RENDER_WIDTH_MINUS_1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("render_width_minus_1"));
		RENDER_HEIGHT_MINUS_1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("render_height_minus_1"));
		INTERPOLATION_FILTER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("interpolation_filter"));
		TX_MODE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("TxMode"));
		DELTA_Q_RES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("delta_q_res"));
		DELTA_LF_RES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("delta_lf_res"));
		REF_ORDER_HINT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("ref_order_hint"), PathElement.sequenceElement());
		REF_FRAME_IDX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("ref_frame_idx"), PathElement.sequenceElement());
		RESERVED1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("reserved1"), PathElement.sequenceElement());
		DELTA_FRAME_ID_MINUS_1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("delta_frame_id_minus_1"), PathElement.sequenceElement());
		P_TILE_INFO_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pTileInfo"));
		P_QUANTIZATION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pQuantization"));
		P_SEGMENTATION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pSegmentation"));
		P_LOOP_FILTER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pLoopFilter"));
		P_CDEF_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pCDEF"));
		P_LOOP_RESTORATION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pLoopRestoration"));
		P_GLOBAL_MOTION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pGlobalMotion"));
		P_EXTENSION_HEADER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pExtensionHeader"));
		P_BUFFER_REMOVAL_TIMES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pBufferRemovalTimes"));
		
		FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
		FRAME_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("frame_type"));
		FRAME_PRESENTATION_TIME_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("frame_presentation_time"));
		CURRENT_FRAME_ID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("current_frame_id"));
		ORDER_HINT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("order_hint"));
		PRIMARY_REF_FRAME_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("primary_ref_frame"));
		REFRESH_FRAME_FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("refresh_frame_flags"));
		CODED_DENOM_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("coded_denom"));
		RENDER_WIDTH_MINUS_1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("render_width_minus_1"));
		RENDER_HEIGHT_MINUS_1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("render_height_minus_1"));
		INTERPOLATION_FILTER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("interpolation_filter"));
		TX_MODE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("TxMode"));
		DELTA_Q_RES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("delta_q_res"));
		DELTA_LF_RES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("delta_lf_res"));
		REF_ORDER_HINT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("ref_order_hint"));
		REF_FRAME_IDX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("ref_frame_idx"));
		RESERVED1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("reserved1"));
		DELTA_FRAME_ID_MINUS_1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("delta_frame_id_minus_1"));
		P_TILE_INFO_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pTileInfo"));
		P_QUANTIZATION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pQuantization"));
		P_SEGMENTATION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pSegmentation"));
		P_LOOP_FILTER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pLoopFilter"));
		P_CDEF_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pCDEF"));
		P_LOOP_RESTORATION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pLoopRestoration"));
		P_GLOBAL_MOTION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pGlobalMotion"));
		P_EXTENSION_HEADER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pExtensionHeader"));
		P_BUFFER_REMOVAL_TIMES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pBufferRemovalTimes"));
		//@formatter:on
	}

	public StdVideoEncodeAV1PictureInfo() {
	    this(Arena.ofAuto());
	}
	
	public StdVideoEncodeAV1PictureInfo(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public StdVideoEncodeAV1PictureInfo(MemorySegment segment) {
	    this.segment = segment;
	
	    flags = new StdVideoEncodeAV1PictureInfoFlags(segment.asSlice(FLAGS_BYTE_OFFSET, StdVideoEncodeAV1PictureInfoFlags.LAYOUT));
	}

    /// @see #flags()
    public StdVideoEncodeAV1PictureInfo flags(Consumer<StdVideoEncodeAV1PictureInfoFlags> consumer) {
    	consumer.accept(flags);
    	return this;
    }
    
    /// @see #flags()
    public StdVideoEncodeAV1PictureInfo flags(StdVideoEncodeAV1PictureInfoFlags other) {
    	flags.set(other);
    	return this;
    }
    
    public StdVideoEncodeAV1PictureInfoFlags flags() {
    	return flags;
    }
    
    /// @see #frame_type()
    public StdVideoEncodeAV1PictureInfo frame_type(int frame_type) {
    	FRAME_TYPE_HANDLE.set(segment, 0L, frame_type);
    	return this;
    }
    
    public int frame_type() {
    	return (int) FRAME_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #frame_presentation_time()
    public StdVideoEncodeAV1PictureInfo frame_presentation_time(int frame_presentation_time) {
    	FRAME_PRESENTATION_TIME_HANDLE.set(segment, 0L, frame_presentation_time);
    	return this;
    }
    
    public int frame_presentation_time() {
    	return (int) FRAME_PRESENTATION_TIME_HANDLE.get(segment, 0L);
    }
    
    /// @see #current_frame_id()
    public StdVideoEncodeAV1PictureInfo current_frame_id(int current_frame_id) {
    	CURRENT_FRAME_ID_HANDLE.set(segment, 0L, current_frame_id);
    	return this;
    }
    
    public int current_frame_id() {
    	return (int) CURRENT_FRAME_ID_HANDLE.get(segment, 0L);
    }
    
    /// @see #order_hint()
    public StdVideoEncodeAV1PictureInfo order_hint(byte order_hint) {
    	ORDER_HINT_HANDLE.set(segment, 0L, order_hint);
    	return this;
    }
    
    public byte order_hint() {
    	return (byte) ORDER_HINT_HANDLE.get(segment, 0L);
    }
    
    /// @see #primary_ref_frame()
    public StdVideoEncodeAV1PictureInfo primary_ref_frame(byte primary_ref_frame) {
    	PRIMARY_REF_FRAME_HANDLE.set(segment, 0L, primary_ref_frame);
    	return this;
    }
    
    public byte primary_ref_frame() {
    	return (byte) PRIMARY_REF_FRAME_HANDLE.get(segment, 0L);
    }
    
    /// @see #refresh_frame_flags()
    public StdVideoEncodeAV1PictureInfo refresh_frame_flags(byte refresh_frame_flags) {
    	REFRESH_FRAME_FLAGS_HANDLE.set(segment, 0L, refresh_frame_flags);
    	return this;
    }
    
    public byte refresh_frame_flags() {
    	return (byte) REFRESH_FRAME_FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #coded_denom()
    public StdVideoEncodeAV1PictureInfo coded_denom(byte coded_denom) {
    	CODED_DENOM_HANDLE.set(segment, 0L, coded_denom);
    	return this;
    }
    
    public byte coded_denom() {
    	return (byte) CODED_DENOM_HANDLE.get(segment, 0L);
    }
    
    /// @see #render_width_minus_1()
    public StdVideoEncodeAV1PictureInfo render_width_minus_1(short render_width_minus_1) {
    	RENDER_WIDTH_MINUS_1_HANDLE.set(segment, 0L, render_width_minus_1);
    	return this;
    }
    
    public short render_width_minus_1() {
    	return (short) RENDER_WIDTH_MINUS_1_HANDLE.get(segment, 0L);
    }
    
    /// @see #render_height_minus_1()
    public StdVideoEncodeAV1PictureInfo render_height_minus_1(short render_height_minus_1) {
    	RENDER_HEIGHT_MINUS_1_HANDLE.set(segment, 0L, render_height_minus_1);
    	return this;
    }
    
    public short render_height_minus_1() {
    	return (short) RENDER_HEIGHT_MINUS_1_HANDLE.get(segment, 0L);
    }
    
    /// @see #interpolation_filter()
    public StdVideoEncodeAV1PictureInfo interpolation_filter(int interpolation_filter) {
    	INTERPOLATION_FILTER_HANDLE.set(segment, 0L, interpolation_filter);
    	return this;
    }
    
    public int interpolation_filter() {
    	return (int) INTERPOLATION_FILTER_HANDLE.get(segment, 0L);
    }
    
    /// @see #txMode()
    public StdVideoEncodeAV1PictureInfo txMode(int txMode) {
    	TX_MODE_HANDLE.set(segment, 0L, txMode);
    	return this;
    }
    
    public int txMode() {
    	return (int) TX_MODE_HANDLE.get(segment, 0L);
    }
    
    /// @see #delta_q_res()
    public StdVideoEncodeAV1PictureInfo delta_q_res(byte delta_q_res) {
    	DELTA_Q_RES_HANDLE.set(segment, 0L, delta_q_res);
    	return this;
    }
    
    public byte delta_q_res() {
    	return (byte) DELTA_Q_RES_HANDLE.get(segment, 0L);
    }
    
    /// @see #delta_lf_res()
    public StdVideoEncodeAV1PictureInfo delta_lf_res(byte delta_lf_res) {
    	DELTA_LF_RES_HANDLE.set(segment, 0L, delta_lf_res);
    	return this;
    }
    
    public byte delta_lf_res() {
    	return (byte) DELTA_LF_RES_HANDLE.get(segment, 0L);
    }
    
    /// @see #ref_order_hint(int)
    public StdVideoEncodeAV1PictureInfo ref_order_hint(byte ref_order_hint, int index0) {
    	REF_ORDER_HINT_HANDLE.set(segment, 0L, index0, ref_order_hint);
    	return this;
    }
    
    public byte ref_order_hint(int index0) {
    	return (byte) REF_ORDER_HINT_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #ref_frame_idx(int)
    public StdVideoEncodeAV1PictureInfo ref_frame_idx(byte ref_frame_idx, int index0) {
    	REF_FRAME_IDX_HANDLE.set(segment, 0L, index0, ref_frame_idx);
    	return this;
    }
    
    public byte ref_frame_idx(int index0) {
    	return (byte) REF_FRAME_IDX_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #reserved1(int)
    public StdVideoEncodeAV1PictureInfo reserved1(byte reserved1, int index0) {
    	RESERVED1_HANDLE.set(segment, 0L, index0, reserved1);
    	return this;
    }
    
    public byte reserved1(int index0) {
    	return (byte) RESERVED1_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #delta_frame_id_minus_1(int)
    public StdVideoEncodeAV1PictureInfo delta_frame_id_minus_1(int delta_frame_id_minus_1, int index0) {
    	DELTA_FRAME_ID_MINUS_1_HANDLE.set(segment, 0L, index0, delta_frame_id_minus_1);
    	return this;
    }
    
    public int delta_frame_id_minus_1(int index0) {
    	return (int) DELTA_FRAME_ID_MINUS_1_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #pTileInfo()
    public StdVideoEncodeAV1PictureInfo pTileInfo(StdVideoAV1TileInfo pTileInfo) {
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
    public StdVideoEncodeAV1PictureInfo pQuantization(StdVideoAV1Quantization pQuantization) {
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
    public StdVideoEncodeAV1PictureInfo pSegmentation(StdVideoAV1Segmentation pSegmentation) {
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
    public StdVideoEncodeAV1PictureInfo pLoopFilter(StdVideoAV1LoopFilter pLoopFilter) {
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
    public StdVideoEncodeAV1PictureInfo pCDEF(StdVideoAV1CDEF pCDEF) {
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
    public StdVideoEncodeAV1PictureInfo pLoopRestoration(StdVideoAV1LoopRestoration pLoopRestoration) {
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
    public StdVideoEncodeAV1PictureInfo pGlobalMotion(StdVideoAV1GlobalMotion pGlobalMotion) {
    	P_GLOBAL_MOTION_HANDLE.set(segment, 0L, pGlobalMotion.memorySegment());
    	return this;
    }
    
    public @Nullable StdVideoAV1GlobalMotion pGlobalMotion() {
    	MemorySegment segment = (MemorySegment) P_GLOBAL_MOTION_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new StdVideoAV1GlobalMotion(segment);
    }
    
    /// @see #pExtensionHeader()
    public StdVideoEncodeAV1PictureInfo pExtensionHeader(StdVideoEncodeAV1ExtensionHeader pExtensionHeader) {
    	P_EXTENSION_HEADER_HANDLE.set(segment, 0L, pExtensionHeader.memorySegment());
    	return this;
    }
    
    public @Nullable StdVideoEncodeAV1ExtensionHeader pExtensionHeader() {
    	MemorySegment segment = (MemorySegment) P_EXTENSION_HEADER_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new StdVideoEncodeAV1ExtensionHeader(segment);
    }
    
    /// @see #pBufferRemovalTimes()
    public StdVideoEncodeAV1PictureInfo pBufferRemovalTimes(NativeIntArray pBufferRemovalTimes) {
    	P_BUFFER_REMOVAL_TIMES_HANDLE.set(segment, 0L, pBufferRemovalTimes.memorySegment());
    	return this;
    }
    
    public @Nullable NativeIntArray pBufferRemovalTimes() {
    	MemorySegment segment = (MemorySegment) P_BUFFER_REMOVAL_TIMES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeIntArray(segment);
    }
    
    @Override
    public StdVideoEncodeAV1PictureInfo set(StdVideoEncodeAV1PictureInfo other) {
        return set(other.segment);
    }
    
    @Override
    public StdVideoEncodeAV1PictureInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<StdVideoEncodeAV1PictureInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<StdVideoEncodeAV1PictureInfo> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new StdVideoEncodeAV1PictureInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<StdVideoEncodeAV1PictureInfo> array(SegmentAllocator allocator, StdVideoEncodeAV1PictureInfo... structs) {
        NativeStructArray<StdVideoEncodeAV1PictureInfo> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new StdVideoEncodeAV1PictureInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<StdVideoEncodeAV1PictureInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new StdVideoEncodeAV1PictureInfo(segment)
        );
    }

}