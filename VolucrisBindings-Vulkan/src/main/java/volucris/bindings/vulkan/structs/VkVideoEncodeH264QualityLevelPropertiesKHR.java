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

public final class VkVideoEncodeH264QualityLevelPropertiesKHR
		implements Struct<VkVideoEncodeH264QualityLevelPropertiesKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle PREFERRED_RATE_CONTROL_FLAGS_HANDLE;
	public static final VarHandle PREFERRED_GOP_FRAME_COUNT_HANDLE;
	public static final VarHandle PREFERRED_IDR_PERIOD_HANDLE;
	public static final VarHandle PREFERRED_CONSECUTIVE_BFRAME_COUNT_HANDLE;
	public static final VarHandle PREFERRED_TEMPORAL_LAYER_COUNT_HANDLE;
	public static final VarHandle PREFERRED_MAX_L0_REFERENCE_COUNT_HANDLE;
	public static final VarHandle PREFERRED_MAX_L1_REFERENCE_COUNT_HANDLE;
	public static final VarHandle PREFERRED_STD_ENTROPY_CODING_MODE_FLAG_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long PREFERRED_RATE_CONTROL_FLAGS_BYTE_OFFSET;
	public static final long PREFERRED_GOP_FRAME_COUNT_BYTE_OFFSET;
	public static final long PREFERRED_IDR_PERIOD_BYTE_OFFSET;
	public static final long PREFERRED_CONSECUTIVE_BFRAME_COUNT_BYTE_OFFSET;
	public static final long PREFERRED_TEMPORAL_LAYER_COUNT_BYTE_OFFSET;
	public static final long PREFERRED_CONSTANT_QP_BYTE_OFFSET;
	public static final long PREFERRED_MAX_L0_REFERENCE_COUNT_BYTE_OFFSET;
	public static final long PREFERRED_MAX_L1_REFERENCE_COUNT_BYTE_OFFSET;
	public static final long PREFERRED_STD_ENTROPY_CODING_MODE_FLAG_BYTE_OFFSET;

	private final MemorySegment segment;

	private final VkVideoEncodeH264QpKHR preferredConstantQp;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("preferredRateControlFlags"),
		    JAVA_INT.withName("preferredGopFrameCount"),
		    JAVA_INT.withName("preferredIdrPeriod"),
		    JAVA_INT.withName("preferredConsecutiveBFrameCount"),
		    JAVA_INT.withName("preferredTemporalLayerCount"),
		    VkVideoEncodeH264QpKHR.LAYOUT.withName("preferredConstantQp"),
		    JAVA_INT.withName("preferredMaxL0ReferenceCount"),
		    JAVA_INT.withName("preferredMaxL1ReferenceCount"),
		    JAVA_INT.withName("preferredStdEntropyCodingModeFlag"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkVideoEncodeH264QualityLevelPropertiesKHR").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		PREFERRED_RATE_CONTROL_FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("preferredRateControlFlags"));
		PREFERRED_GOP_FRAME_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("preferredGopFrameCount"));
		PREFERRED_IDR_PERIOD_HANDLE = LAYOUT.varHandle(PathElement.groupElement("preferredIdrPeriod"));
		PREFERRED_CONSECUTIVE_BFRAME_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("preferredConsecutiveBFrameCount"));
		PREFERRED_TEMPORAL_LAYER_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("preferredTemporalLayerCount"));
		PREFERRED_MAX_L0_REFERENCE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("preferredMaxL0ReferenceCount"));
		PREFERRED_MAX_L1_REFERENCE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("preferredMaxL1ReferenceCount"));
		PREFERRED_STD_ENTROPY_CODING_MODE_FLAG_HANDLE = LAYOUT.varHandle(PathElement.groupElement("preferredStdEntropyCodingModeFlag"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		PREFERRED_RATE_CONTROL_FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("preferredRateControlFlags"));
		PREFERRED_GOP_FRAME_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("preferredGopFrameCount"));
		PREFERRED_IDR_PERIOD_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("preferredIdrPeriod"));
		PREFERRED_CONSECUTIVE_BFRAME_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("preferredConsecutiveBFrameCount"));
		PREFERRED_TEMPORAL_LAYER_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("preferredTemporalLayerCount"));
		PREFERRED_CONSTANT_QP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("preferredConstantQp"));
		PREFERRED_MAX_L0_REFERENCE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("preferredMaxL0ReferenceCount"));
		PREFERRED_MAX_L1_REFERENCE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("preferredMaxL1ReferenceCount"));
		PREFERRED_STD_ENTROPY_CODING_MODE_FLAG_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("preferredStdEntropyCodingModeFlag"));
		//@formatter:on
	}

	public VkVideoEncodeH264QualityLevelPropertiesKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkVideoEncodeH264QualityLevelPropertiesKHR(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkVideoEncodeH264QualityLevelPropertiesKHR(MemorySegment segment) {
	    this.segment = segment;
	
	    preferredConstantQp = new VkVideoEncodeH264QpKHR(segment.asSlice(PREFERRED_CONSTANT_QP_BYTE_OFFSET, VkVideoEncodeH264QpKHR.LAYOUT));
	}

    /// @see #sType()
    public VkVideoEncodeH264QualityLevelPropertiesKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkVideoEncodeH264QualityLevelPropertiesKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #preferredRateControlFlags()
    public VkVideoEncodeH264QualityLevelPropertiesKHR preferredRateControlFlags(int preferredRateControlFlags) {
    	PREFERRED_RATE_CONTROL_FLAGS_HANDLE.set(segment, 0L, preferredRateControlFlags);
    	return this;
    }
    
    public int preferredRateControlFlags() {
    	return (int) PREFERRED_RATE_CONTROL_FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #preferredGopFrameCount()
    public VkVideoEncodeH264QualityLevelPropertiesKHR preferredGopFrameCount(int preferredGopFrameCount) {
    	PREFERRED_GOP_FRAME_COUNT_HANDLE.set(segment, 0L, preferredGopFrameCount);
    	return this;
    }
    
    public int preferredGopFrameCount() {
    	return (int) PREFERRED_GOP_FRAME_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #preferredIdrPeriod()
    public VkVideoEncodeH264QualityLevelPropertiesKHR preferredIdrPeriod(int preferredIdrPeriod) {
    	PREFERRED_IDR_PERIOD_HANDLE.set(segment, 0L, preferredIdrPeriod);
    	return this;
    }
    
    public int preferredIdrPeriod() {
    	return (int) PREFERRED_IDR_PERIOD_HANDLE.get(segment, 0L);
    }
    
    /// @see #preferredConsecutiveBFrameCount()
    public VkVideoEncodeH264QualityLevelPropertiesKHR preferredConsecutiveBFrameCount(int preferredConsecutiveBFrameCount) {
    	PREFERRED_CONSECUTIVE_BFRAME_COUNT_HANDLE.set(segment, 0L, preferredConsecutiveBFrameCount);
    	return this;
    }
    
    public int preferredConsecutiveBFrameCount() {
    	return (int) PREFERRED_CONSECUTIVE_BFRAME_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #preferredTemporalLayerCount()
    public VkVideoEncodeH264QualityLevelPropertiesKHR preferredTemporalLayerCount(int preferredTemporalLayerCount) {
    	PREFERRED_TEMPORAL_LAYER_COUNT_HANDLE.set(segment, 0L, preferredTemporalLayerCount);
    	return this;
    }
    
    public int preferredTemporalLayerCount() {
    	return (int) PREFERRED_TEMPORAL_LAYER_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #preferredConstantQp()
    public VkVideoEncodeH264QualityLevelPropertiesKHR preferredConstantQp(Consumer<VkVideoEncodeH264QpKHR> consumer) {
    	consumer.accept(preferredConstantQp);
    	return this;
    }
    
    /// @see #preferredConstantQp()
    public VkVideoEncodeH264QualityLevelPropertiesKHR preferredConstantQp(VkVideoEncodeH264QpKHR other) {
    	preferredConstantQp.set(other);
    	return this;
    }
    
    public VkVideoEncodeH264QpKHR preferredConstantQp() {
    	return preferredConstantQp;
    }
    
    /// @see #preferredMaxL0ReferenceCount()
    public VkVideoEncodeH264QualityLevelPropertiesKHR preferredMaxL0ReferenceCount(int preferredMaxL0ReferenceCount) {
    	PREFERRED_MAX_L0_REFERENCE_COUNT_HANDLE.set(segment, 0L, preferredMaxL0ReferenceCount);
    	return this;
    }
    
    public int preferredMaxL0ReferenceCount() {
    	return (int) PREFERRED_MAX_L0_REFERENCE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #preferredMaxL1ReferenceCount()
    public VkVideoEncodeH264QualityLevelPropertiesKHR preferredMaxL1ReferenceCount(int preferredMaxL1ReferenceCount) {
    	PREFERRED_MAX_L1_REFERENCE_COUNT_HANDLE.set(segment, 0L, preferredMaxL1ReferenceCount);
    	return this;
    }
    
    public int preferredMaxL1ReferenceCount() {
    	return (int) PREFERRED_MAX_L1_REFERENCE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #preferredStdEntropyCodingModeFlag()
    public VkVideoEncodeH264QualityLevelPropertiesKHR preferredStdEntropyCodingModeFlag(int preferredStdEntropyCodingModeFlag) {
    	PREFERRED_STD_ENTROPY_CODING_MODE_FLAG_HANDLE.set(segment, 0L, preferredStdEntropyCodingModeFlag);
    	return this;
    }
    
    public int preferredStdEntropyCodingModeFlag() {
    	return (int) PREFERRED_STD_ENTROPY_CODING_MODE_FLAG_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkVideoEncodeH264QualityLevelPropertiesKHR set(VkVideoEncodeH264QualityLevelPropertiesKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkVideoEncodeH264QualityLevelPropertiesKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkVideoEncodeH264QualityLevelPropertiesKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkVideoEncodeH264QualityLevelPropertiesKHR> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkVideoEncodeH264QualityLevelPropertiesKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkVideoEncodeH264QualityLevelPropertiesKHR> array(SegmentAllocator allocator, VkVideoEncodeH264QualityLevelPropertiesKHR... structs) {
        NativeStructArray<VkVideoEncodeH264QualityLevelPropertiesKHR> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkVideoEncodeH264QualityLevelPropertiesKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkVideoEncodeH264QualityLevelPropertiesKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkVideoEncodeH264QualityLevelPropertiesKHR(segment)
        );
    }

}