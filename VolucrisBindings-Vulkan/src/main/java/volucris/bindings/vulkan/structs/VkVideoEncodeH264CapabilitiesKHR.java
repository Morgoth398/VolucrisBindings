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
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkVideoEncodeH264CapabilitiesKHR
		implements Struct<VkVideoEncodeH264CapabilitiesKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle FLAGS_HANDLE;
	public static final VarHandle MAX_LEVEL_IDC_HANDLE;
	public static final VarHandle MAX_SLICE_COUNT_HANDLE;
	public static final VarHandle MAX_PPICTURE_L0_REFERENCE_COUNT_HANDLE;
	public static final VarHandle MAX_BPICTURE_L0_REFERENCE_COUNT_HANDLE;
	public static final VarHandle MAX_L1_REFERENCE_COUNT_HANDLE;
	public static final VarHandle MAX_TEMPORAL_LAYER_COUNT_HANDLE;
	public static final VarHandle EXPECT_DYADIC_TEMPORAL_LAYER_PATTERN_HANDLE;
	public static final VarHandle MIN_QP_HANDLE;
	public static final VarHandle MAX_QP_HANDLE;
	public static final VarHandle PREFERS_GOP_REMAINING_FRAMES_HANDLE;
	public static final VarHandle REQUIRES_GOP_REMAINING_FRAMES_HANDLE;
	public static final VarHandle STD_SYNTAX_FLAGS_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long FLAGS_BYTE_OFFSET;
	public static final long MAX_LEVEL_IDC_BYTE_OFFSET;
	public static final long MAX_SLICE_COUNT_BYTE_OFFSET;
	public static final long MAX_PPICTURE_L0_REFERENCE_COUNT_BYTE_OFFSET;
	public static final long MAX_BPICTURE_L0_REFERENCE_COUNT_BYTE_OFFSET;
	public static final long MAX_L1_REFERENCE_COUNT_BYTE_OFFSET;
	public static final long MAX_TEMPORAL_LAYER_COUNT_BYTE_OFFSET;
	public static final long EXPECT_DYADIC_TEMPORAL_LAYER_PATTERN_BYTE_OFFSET;
	public static final long MIN_QP_BYTE_OFFSET;
	public static final long MAX_QP_BYTE_OFFSET;
	public static final long PREFERS_GOP_REMAINING_FRAMES_BYTE_OFFSET;
	public static final long REQUIRES_GOP_REMAINING_FRAMES_BYTE_OFFSET;
	public static final long STD_SYNTAX_FLAGS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("flags"),
		    JAVA_INT.withName("maxLevelIdc"),
		    JAVA_INT.withName("maxSliceCount"),
		    JAVA_INT.withName("maxPPictureL0ReferenceCount"),
		    JAVA_INT.withName("maxBPictureL0ReferenceCount"),
		    JAVA_INT.withName("maxL1ReferenceCount"),
		    JAVA_INT.withName("maxTemporalLayerCount"),
		    JAVA_INT.withName("expectDyadicTemporalLayerPattern"),
		    JAVA_INT.withName("minQp"),
		    JAVA_INT.withName("maxQp"),
		    JAVA_INT.withName("prefersGopRemainingFrames"),
		    JAVA_INT.withName("requiresGopRemainingFrames"),
		    JAVA_INT.withName("stdSyntaxFlags"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkVideoEncodeH264CapabilitiesKHR").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
		MAX_LEVEL_IDC_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxLevelIdc"));
		MAX_SLICE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxSliceCount"));
		MAX_PPICTURE_L0_REFERENCE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxPPictureL0ReferenceCount"));
		MAX_BPICTURE_L0_REFERENCE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxBPictureL0ReferenceCount"));
		MAX_L1_REFERENCE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxL1ReferenceCount"));
		MAX_TEMPORAL_LAYER_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxTemporalLayerCount"));
		EXPECT_DYADIC_TEMPORAL_LAYER_PATTERN_HANDLE = LAYOUT.varHandle(PathElement.groupElement("expectDyadicTemporalLayerPattern"));
		MIN_QP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("minQp"));
		MAX_QP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxQp"));
		PREFERS_GOP_REMAINING_FRAMES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("prefersGopRemainingFrames"));
		REQUIRES_GOP_REMAINING_FRAMES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("requiresGopRemainingFrames"));
		STD_SYNTAX_FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("stdSyntaxFlags"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
		MAX_LEVEL_IDC_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxLevelIdc"));
		MAX_SLICE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxSliceCount"));
		MAX_PPICTURE_L0_REFERENCE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxPPictureL0ReferenceCount"));
		MAX_BPICTURE_L0_REFERENCE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxBPictureL0ReferenceCount"));
		MAX_L1_REFERENCE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxL1ReferenceCount"));
		MAX_TEMPORAL_LAYER_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxTemporalLayerCount"));
		EXPECT_DYADIC_TEMPORAL_LAYER_PATTERN_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("expectDyadicTemporalLayerPattern"));
		MIN_QP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("minQp"));
		MAX_QP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxQp"));
		PREFERS_GOP_REMAINING_FRAMES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("prefersGopRemainingFrames"));
		REQUIRES_GOP_REMAINING_FRAMES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("requiresGopRemainingFrames"));
		STD_SYNTAX_FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("stdSyntaxFlags"));
		//@formatter:on
	}

	public VkVideoEncodeH264CapabilitiesKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkVideoEncodeH264CapabilitiesKHR(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkVideoEncodeH264CapabilitiesKHR(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkVideoEncodeH264CapabilitiesKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkVideoEncodeH264CapabilitiesKHR pNext(MemorySegment pNext) {
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
    public VkVideoEncodeH264CapabilitiesKHR flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxLevelIdc()
    public VkVideoEncodeH264CapabilitiesKHR maxLevelIdc(int maxLevelIdc) {
    	MAX_LEVEL_IDC_HANDLE.set(segment, 0L, maxLevelIdc);
    	return this;
    }
    
    public int maxLevelIdc() {
    	return (int) MAX_LEVEL_IDC_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxSliceCount()
    public VkVideoEncodeH264CapabilitiesKHR maxSliceCount(int maxSliceCount) {
    	MAX_SLICE_COUNT_HANDLE.set(segment, 0L, maxSliceCount);
    	return this;
    }
    
    public int maxSliceCount() {
    	return (int) MAX_SLICE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxPPictureL0ReferenceCount()
    public VkVideoEncodeH264CapabilitiesKHR maxPPictureL0ReferenceCount(int maxPPictureL0ReferenceCount) {
    	MAX_PPICTURE_L0_REFERENCE_COUNT_HANDLE.set(segment, 0L, maxPPictureL0ReferenceCount);
    	return this;
    }
    
    public int maxPPictureL0ReferenceCount() {
    	return (int) MAX_PPICTURE_L0_REFERENCE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxBPictureL0ReferenceCount()
    public VkVideoEncodeH264CapabilitiesKHR maxBPictureL0ReferenceCount(int maxBPictureL0ReferenceCount) {
    	MAX_BPICTURE_L0_REFERENCE_COUNT_HANDLE.set(segment, 0L, maxBPictureL0ReferenceCount);
    	return this;
    }
    
    public int maxBPictureL0ReferenceCount() {
    	return (int) MAX_BPICTURE_L0_REFERENCE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxL1ReferenceCount()
    public VkVideoEncodeH264CapabilitiesKHR maxL1ReferenceCount(int maxL1ReferenceCount) {
    	MAX_L1_REFERENCE_COUNT_HANDLE.set(segment, 0L, maxL1ReferenceCount);
    	return this;
    }
    
    public int maxL1ReferenceCount() {
    	return (int) MAX_L1_REFERENCE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxTemporalLayerCount()
    public VkVideoEncodeH264CapabilitiesKHR maxTemporalLayerCount(int maxTemporalLayerCount) {
    	MAX_TEMPORAL_LAYER_COUNT_HANDLE.set(segment, 0L, maxTemporalLayerCount);
    	return this;
    }
    
    public int maxTemporalLayerCount() {
    	return (int) MAX_TEMPORAL_LAYER_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #expectDyadicTemporalLayerPattern()
    public VkVideoEncodeH264CapabilitiesKHR expectDyadicTemporalLayerPattern(int expectDyadicTemporalLayerPattern) {
    	EXPECT_DYADIC_TEMPORAL_LAYER_PATTERN_HANDLE.set(segment, 0L, expectDyadicTemporalLayerPattern);
    	return this;
    }
    
    public int expectDyadicTemporalLayerPattern() {
    	return (int) EXPECT_DYADIC_TEMPORAL_LAYER_PATTERN_HANDLE.get(segment, 0L);
    }
    
    /// @see #minQp()
    public VkVideoEncodeH264CapabilitiesKHR minQp(int minQp) {
    	MIN_QP_HANDLE.set(segment, 0L, minQp);
    	return this;
    }
    
    public int minQp() {
    	return (int) MIN_QP_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxQp()
    public VkVideoEncodeH264CapabilitiesKHR maxQp(int maxQp) {
    	MAX_QP_HANDLE.set(segment, 0L, maxQp);
    	return this;
    }
    
    public int maxQp() {
    	return (int) MAX_QP_HANDLE.get(segment, 0L);
    }
    
    /// @see #prefersGopRemainingFrames()
    public VkVideoEncodeH264CapabilitiesKHR prefersGopRemainingFrames(int prefersGopRemainingFrames) {
    	PREFERS_GOP_REMAINING_FRAMES_HANDLE.set(segment, 0L, prefersGopRemainingFrames);
    	return this;
    }
    
    public int prefersGopRemainingFrames() {
    	return (int) PREFERS_GOP_REMAINING_FRAMES_HANDLE.get(segment, 0L);
    }
    
    /// @see #requiresGopRemainingFrames()
    public VkVideoEncodeH264CapabilitiesKHR requiresGopRemainingFrames(int requiresGopRemainingFrames) {
    	REQUIRES_GOP_REMAINING_FRAMES_HANDLE.set(segment, 0L, requiresGopRemainingFrames);
    	return this;
    }
    
    public int requiresGopRemainingFrames() {
    	return (int) REQUIRES_GOP_REMAINING_FRAMES_HANDLE.get(segment, 0L);
    }
    
    /// @see #stdSyntaxFlags()
    public VkVideoEncodeH264CapabilitiesKHR stdSyntaxFlags(int stdSyntaxFlags) {
    	STD_SYNTAX_FLAGS_HANDLE.set(segment, 0L, stdSyntaxFlags);
    	return this;
    }
    
    public int stdSyntaxFlags() {
    	return (int) STD_SYNTAX_FLAGS_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkVideoEncodeH264CapabilitiesKHR set(VkVideoEncodeH264CapabilitiesKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkVideoEncodeH264CapabilitiesKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkVideoEncodeH264CapabilitiesKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkVideoEncodeH264CapabilitiesKHR> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkVideoEncodeH264CapabilitiesKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkVideoEncodeH264CapabilitiesKHR> array(SegmentAllocator allocator, VkVideoEncodeH264CapabilitiesKHR... structs) {
        NativeStructArray<VkVideoEncodeH264CapabilitiesKHR> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkVideoEncodeH264CapabilitiesKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkVideoEncodeH264CapabilitiesKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkVideoEncodeH264CapabilitiesKHR(segment)
        );
    }

}