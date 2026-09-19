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

public final class VkVideoEncodeH265CapabilitiesKHR
		implements Struct<VkVideoEncodeH265CapabilitiesKHR> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle FLAGS_HANDLE;
    public static final VarHandle MAX_LEVEL_IDC_HANDLE;
    public static final VarHandle MAX_SLICE_SEGMENT_COUNT_HANDLE;
    public static final VarHandle CTB_SIZES_HANDLE;
    public static final VarHandle TRANSFORM_BLOCK_SIZES_HANDLE;
    public static final VarHandle MAX_PPICTURE_L0_REFERENCE_COUNT_HANDLE;
    public static final VarHandle MAX_BPICTURE_L0_REFERENCE_COUNT_HANDLE;
    public static final VarHandle MAX_L1_REFERENCE_COUNT_HANDLE;
    public static final VarHandle MAX_SUB_LAYER_COUNT_HANDLE;
    public static final VarHandle EXPECT_DYADIC_TEMPORAL_SUB_LAYER_PATTERN_HANDLE;
    public static final VarHandle MIN_QP_HANDLE;
    public static final VarHandle MAX_QP_HANDLE;
    public static final VarHandle PREFERS_GOP_REMAINING_FRAMES_HANDLE;
    public static final VarHandle REQUIRES_GOP_REMAINING_FRAMES_HANDLE;
    public static final VarHandle STD_SYNTAX_FLAGS_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long FLAGS_BYTE_OFFSET;
    public static final long MAX_LEVEL_IDC_BYTE_OFFSET;
    public static final long MAX_SLICE_SEGMENT_COUNT_BYTE_OFFSET;
    public static final long MAX_TILES_BYTE_OFFSET;
    public static final long CTB_SIZES_BYTE_OFFSET;
    public static final long TRANSFORM_BLOCK_SIZES_BYTE_OFFSET;
    public static final long MAX_PPICTURE_L0_REFERENCE_COUNT_BYTE_OFFSET;
    public static final long MAX_BPICTURE_L0_REFERENCE_COUNT_BYTE_OFFSET;
    public static final long MAX_L1_REFERENCE_COUNT_BYTE_OFFSET;
    public static final long MAX_SUB_LAYER_COUNT_BYTE_OFFSET;
    public static final long EXPECT_DYADIC_TEMPORAL_SUB_LAYER_PATTERN_BYTE_OFFSET;
    public static final long MIN_QP_BYTE_OFFSET;
    public static final long MAX_QP_BYTE_OFFSET;
    public static final long PREFERS_GOP_REMAINING_FRAMES_BYTE_OFFSET;
    public static final long REQUIRES_GOP_REMAINING_FRAMES_BYTE_OFFSET;
    public static final long STD_SYNTAX_FLAGS_BYTE_OFFSET;

    private final MemorySegment segment;

    private final VkExtent2D maxTiles;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("flags"),
            JAVA_INT.withName("maxLevelIdc"),
            JAVA_INT.withName("maxSliceSegmentCount"),
            VkExtent2D.LAYOUT.withName("maxTiles"),
            JAVA_INT.withName("ctbSizes"),
            JAVA_INT.withName("transformBlockSizes"),
            JAVA_INT.withName("maxPPictureL0ReferenceCount"),
            JAVA_INT.withName("maxBPictureL0ReferenceCount"),
            JAVA_INT.withName("maxL1ReferenceCount"),
            JAVA_INT.withName("maxSubLayerCount"),
            JAVA_INT.withName("expectDyadicTemporalSubLayerPattern"),
            JAVA_INT.withName("minQp"),
            JAVA_INT.withName("maxQp"),
            JAVA_INT.withName("prefersGopRemainingFrames"),
            JAVA_INT.withName("requiresGopRemainingFrames"),
            JAVA_INT.withName("stdSyntaxFlags"),
            MemoryLayout.paddingLayout(4)
        ).withName("VkVideoEncodeH265CapabilitiesKHR").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
        MAX_LEVEL_IDC_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxLevelIdc"));
        MAX_SLICE_SEGMENT_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxSliceSegmentCount"));
        CTB_SIZES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("ctbSizes"));
        TRANSFORM_BLOCK_SIZES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("transformBlockSizes"));
        MAX_PPICTURE_L0_REFERENCE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxPPictureL0ReferenceCount"));
        MAX_BPICTURE_L0_REFERENCE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxBPictureL0ReferenceCount"));
        MAX_L1_REFERENCE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxL1ReferenceCount"));
        MAX_SUB_LAYER_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxSubLayerCount"));
        EXPECT_DYADIC_TEMPORAL_SUB_LAYER_PATTERN_HANDLE = LAYOUT.varHandle(PathElement.groupElement("expectDyadicTemporalSubLayerPattern"));
        MIN_QP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("minQp"));
        MAX_QP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxQp"));
        PREFERS_GOP_REMAINING_FRAMES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("prefersGopRemainingFrames"));
        REQUIRES_GOP_REMAINING_FRAMES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("requiresGopRemainingFrames"));
        STD_SYNTAX_FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("stdSyntaxFlags"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
        MAX_LEVEL_IDC_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxLevelIdc"));
        MAX_SLICE_SEGMENT_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxSliceSegmentCount"));
        MAX_TILES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxTiles"));
        CTB_SIZES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("ctbSizes"));
        TRANSFORM_BLOCK_SIZES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("transformBlockSizes"));
        MAX_PPICTURE_L0_REFERENCE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxPPictureL0ReferenceCount"));
        MAX_BPICTURE_L0_REFERENCE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxBPictureL0ReferenceCount"));
        MAX_L1_REFERENCE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxL1ReferenceCount"));
        MAX_SUB_LAYER_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxSubLayerCount"));
        EXPECT_DYADIC_TEMPORAL_SUB_LAYER_PATTERN_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("expectDyadicTemporalSubLayerPattern"));
        MIN_QP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("minQp"));
        MAX_QP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxQp"));
        PREFERS_GOP_REMAINING_FRAMES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("prefersGopRemainingFrames"));
        REQUIRES_GOP_REMAINING_FRAMES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("requiresGopRemainingFrames"));
        STD_SYNTAX_FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("stdSyntaxFlags"));
        //@formatter:on
    }

    public VkVideoEncodeH265CapabilitiesKHR() {
        this(Arena.ofAuto());
    }
    
    public VkVideoEncodeH265CapabilitiesKHR(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkVideoEncodeH265CapabilitiesKHR(MemorySegment segment) {
        this.segment = segment;
    
        maxTiles = new VkExtent2D(segment.asSlice(MAX_TILES_BYTE_OFFSET, VkExtent2D.LAYOUT));
    }

    /// @see #sType()
    public VkVideoEncodeH265CapabilitiesKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkVideoEncodeH265CapabilitiesKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #flags()
    public VkVideoEncodeH265CapabilitiesKHR flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxLevelIdc()
    public VkVideoEncodeH265CapabilitiesKHR maxLevelIdc(int maxLevelIdc) {
    	MAX_LEVEL_IDC_HANDLE.set(segment, 0L, maxLevelIdc);
    	return this;
    }
    
    public int maxLevelIdc() {
    	return (int) MAX_LEVEL_IDC_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxSliceSegmentCount()
    public VkVideoEncodeH265CapabilitiesKHR maxSliceSegmentCount(int maxSliceSegmentCount) {
    	MAX_SLICE_SEGMENT_COUNT_HANDLE.set(segment, 0L, maxSliceSegmentCount);
    	return this;
    }
    
    public int maxSliceSegmentCount() {
    	return (int) MAX_SLICE_SEGMENT_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #ctbSizes()
    public VkVideoEncodeH265CapabilitiesKHR ctbSizes(int ctbSizes) {
    	CTB_SIZES_HANDLE.set(segment, 0L, ctbSizes);
    	return this;
    }
    
    public int ctbSizes() {
    	return (int) CTB_SIZES_HANDLE.get(segment, 0L);
    }
    
    /// @see #transformBlockSizes()
    public VkVideoEncodeH265CapabilitiesKHR transformBlockSizes(int transformBlockSizes) {
    	TRANSFORM_BLOCK_SIZES_HANDLE.set(segment, 0L, transformBlockSizes);
    	return this;
    }
    
    public int transformBlockSizes() {
    	return (int) TRANSFORM_BLOCK_SIZES_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxPPictureL0ReferenceCount()
    public VkVideoEncodeH265CapabilitiesKHR maxPPictureL0ReferenceCount(int maxPPictureL0ReferenceCount) {
    	MAX_PPICTURE_L0_REFERENCE_COUNT_HANDLE.set(segment, 0L, maxPPictureL0ReferenceCount);
    	return this;
    }
    
    public int maxPPictureL0ReferenceCount() {
    	return (int) MAX_PPICTURE_L0_REFERENCE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxBPictureL0ReferenceCount()
    public VkVideoEncodeH265CapabilitiesKHR maxBPictureL0ReferenceCount(int maxBPictureL0ReferenceCount) {
    	MAX_BPICTURE_L0_REFERENCE_COUNT_HANDLE.set(segment, 0L, maxBPictureL0ReferenceCount);
    	return this;
    }
    
    public int maxBPictureL0ReferenceCount() {
    	return (int) MAX_BPICTURE_L0_REFERENCE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxL1ReferenceCount()
    public VkVideoEncodeH265CapabilitiesKHR maxL1ReferenceCount(int maxL1ReferenceCount) {
    	MAX_L1_REFERENCE_COUNT_HANDLE.set(segment, 0L, maxL1ReferenceCount);
    	return this;
    }
    
    public int maxL1ReferenceCount() {
    	return (int) MAX_L1_REFERENCE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxSubLayerCount()
    public VkVideoEncodeH265CapabilitiesKHR maxSubLayerCount(int maxSubLayerCount) {
    	MAX_SUB_LAYER_COUNT_HANDLE.set(segment, 0L, maxSubLayerCount);
    	return this;
    }
    
    public int maxSubLayerCount() {
    	return (int) MAX_SUB_LAYER_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #expectDyadicTemporalSubLayerPattern()
    public VkVideoEncodeH265CapabilitiesKHR expectDyadicTemporalSubLayerPattern(int expectDyadicTemporalSubLayerPattern) {
    	EXPECT_DYADIC_TEMPORAL_SUB_LAYER_PATTERN_HANDLE.set(segment, 0L, expectDyadicTemporalSubLayerPattern);
    	return this;
    }
    
    public int expectDyadicTemporalSubLayerPattern() {
    	return (int) EXPECT_DYADIC_TEMPORAL_SUB_LAYER_PATTERN_HANDLE.get(segment, 0L);
    }
    
    /// @see #minQp()
    public VkVideoEncodeH265CapabilitiesKHR minQp(int minQp) {
    	MIN_QP_HANDLE.set(segment, 0L, minQp);
    	return this;
    }
    
    public int minQp() {
    	return (int) MIN_QP_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxQp()
    public VkVideoEncodeH265CapabilitiesKHR maxQp(int maxQp) {
    	MAX_QP_HANDLE.set(segment, 0L, maxQp);
    	return this;
    }
    
    public int maxQp() {
    	return (int) MAX_QP_HANDLE.get(segment, 0L);
    }
    
    /// @see #prefersGopRemainingFrames()
    public VkVideoEncodeH265CapabilitiesKHR prefersGopRemainingFrames(int prefersGopRemainingFrames) {
    	PREFERS_GOP_REMAINING_FRAMES_HANDLE.set(segment, 0L, prefersGopRemainingFrames);
    	return this;
    }
    
    public int prefersGopRemainingFrames() {
    	return (int) PREFERS_GOP_REMAINING_FRAMES_HANDLE.get(segment, 0L);
    }
    
    /// @see #requiresGopRemainingFrames()
    public VkVideoEncodeH265CapabilitiesKHR requiresGopRemainingFrames(int requiresGopRemainingFrames) {
    	REQUIRES_GOP_REMAINING_FRAMES_HANDLE.set(segment, 0L, requiresGopRemainingFrames);
    	return this;
    }
    
    public int requiresGopRemainingFrames() {
    	return (int) REQUIRES_GOP_REMAINING_FRAMES_HANDLE.get(segment, 0L);
    }
    
    /// @see #stdSyntaxFlags()
    public VkVideoEncodeH265CapabilitiesKHR stdSyntaxFlags(int stdSyntaxFlags) {
    	STD_SYNTAX_FLAGS_HANDLE.set(segment, 0L, stdSyntaxFlags);
    	return this;
    }
    
    public int stdSyntaxFlags() {
    	return (int) STD_SYNTAX_FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxTiles()
    public VkVideoEncodeH265CapabilitiesKHR maxTiles(Consumer<VkExtent2D> consumer) {
    	consumer.accept(maxTiles);
    	return this;
    }
    
    /// @see #maxTiles()
    public VkVideoEncodeH265CapabilitiesKHR maxTiles(VkExtent2D other) {
    	maxTiles.set(other);
    	return this;
    }
    
    public VkExtent2D maxTiles() {
    	return maxTiles;
    }
    
    @Override
    public VkVideoEncodeH265CapabilitiesKHR set(VkVideoEncodeH265CapabilitiesKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkVideoEncodeH265CapabilitiesKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkVideoEncodeH265CapabilitiesKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkVideoEncodeH265CapabilitiesKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkVideoEncodeH265CapabilitiesKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkVideoEncodeH265CapabilitiesKHR> array(Arena arena, VkVideoEncodeH265CapabilitiesKHR... structs) {
        NativeStructArray<VkVideoEncodeH265CapabilitiesKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkVideoEncodeH265CapabilitiesKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkVideoEncodeH265CapabilitiesKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkVideoEncodeH265CapabilitiesKHR(segment)
        );
    }
    
}