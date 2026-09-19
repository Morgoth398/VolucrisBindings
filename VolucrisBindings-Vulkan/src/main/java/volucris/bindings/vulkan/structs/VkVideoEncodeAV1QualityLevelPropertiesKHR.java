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

public final class VkVideoEncodeAV1QualityLevelPropertiesKHR
		implements Struct<VkVideoEncodeAV1QualityLevelPropertiesKHR> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle PREFERRED_RATE_CONTROL_FLAGS_HANDLE;
    public static final VarHandle PREFERRED_GOP_FRAME_COUNT_HANDLE;
    public static final VarHandle PREFERRED_KEY_FRAME_PERIOD_HANDLE;
    public static final VarHandle PREFERRED_CONSECUTIVE_BIPREDICTIVE_FRAME_COUNT_HANDLE;
    public static final VarHandle PREFERRED_TEMPORAL_LAYER_COUNT_HANDLE;
    public static final VarHandle PREFERRED_MAX_SINGLE_REFERENCE_COUNT_HANDLE;
    public static final VarHandle PREFERRED_SINGLE_REFERENCE_NAME_MASK_HANDLE;
    public static final VarHandle PREFERRED_MAX_UNIDIRECTIONAL_COMPOUND_REFERENCE_COUNT_HANDLE;
    public static final VarHandle PREFERRED_MAX_UNIDIRECTIONAL_COMPOUND_GROUP1_REFERENCE_COUNT_HANDLE;
    public static final VarHandle PREFERRED_UNIDIRECTIONAL_COMPOUND_REFERENCE_NAME_MASK_HANDLE;
    public static final VarHandle PREFERRED_MAX_BIDIRECTIONAL_COMPOUND_REFERENCE_COUNT_HANDLE;
    public static final VarHandle PREFERRED_MAX_BIDIRECTIONAL_COMPOUND_GROUP1_REFERENCE_COUNT_HANDLE;
    public static final VarHandle PREFERRED_MAX_BIDIRECTIONAL_COMPOUND_GROUP2_REFERENCE_COUNT_HANDLE;
    public static final VarHandle PREFERRED_BIDIRECTIONAL_COMPOUND_REFERENCE_NAME_MASK_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long PREFERRED_RATE_CONTROL_FLAGS_BYTE_OFFSET;
    public static final long PREFERRED_GOP_FRAME_COUNT_BYTE_OFFSET;
    public static final long PREFERRED_KEY_FRAME_PERIOD_BYTE_OFFSET;
    public static final long PREFERRED_CONSECUTIVE_BIPREDICTIVE_FRAME_COUNT_BYTE_OFFSET;
    public static final long PREFERRED_TEMPORAL_LAYER_COUNT_BYTE_OFFSET;
    public static final long PREFERRED_CONSTANT_QINDEX_BYTE_OFFSET;
    public static final long PREFERRED_MAX_SINGLE_REFERENCE_COUNT_BYTE_OFFSET;
    public static final long PREFERRED_SINGLE_REFERENCE_NAME_MASK_BYTE_OFFSET;
    public static final long PREFERRED_MAX_UNIDIRECTIONAL_COMPOUND_REFERENCE_COUNT_BYTE_OFFSET;
    public static final long PREFERRED_MAX_UNIDIRECTIONAL_COMPOUND_GROUP1_REFERENCE_COUNT_BYTE_OFFSET;
    public static final long PREFERRED_UNIDIRECTIONAL_COMPOUND_REFERENCE_NAME_MASK_BYTE_OFFSET;
    public static final long PREFERRED_MAX_BIDIRECTIONAL_COMPOUND_REFERENCE_COUNT_BYTE_OFFSET;
    public static final long PREFERRED_MAX_BIDIRECTIONAL_COMPOUND_GROUP1_REFERENCE_COUNT_BYTE_OFFSET;
    public static final long PREFERRED_MAX_BIDIRECTIONAL_COMPOUND_GROUP2_REFERENCE_COUNT_BYTE_OFFSET;
    public static final long PREFERRED_BIDIRECTIONAL_COMPOUND_REFERENCE_NAME_MASK_BYTE_OFFSET;

    private final MemorySegment segment;

    private final VkVideoEncodeAV1QIndexKHR preferredConstantQIndex;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("preferredRateControlFlags"),
            JAVA_INT.withName("preferredGopFrameCount"),
            JAVA_INT.withName("preferredKeyFramePeriod"),
            JAVA_INT.withName("preferredConsecutiveBipredictiveFrameCount"),
            JAVA_INT.withName("preferredTemporalLayerCount"),
            VkVideoEncodeAV1QIndexKHR.LAYOUT.withName("preferredConstantQIndex"),
            JAVA_INT.withName("preferredMaxSingleReferenceCount"),
            JAVA_INT.withName("preferredSingleReferenceNameMask"),
            JAVA_INT.withName("preferredMaxUnidirectionalCompoundReferenceCount"),
            JAVA_INT.withName("preferredMaxUnidirectionalCompoundGroup1ReferenceCount"),
            JAVA_INT.withName("preferredUnidirectionalCompoundReferenceNameMask"),
            JAVA_INT.withName("preferredMaxBidirectionalCompoundReferenceCount"),
            JAVA_INT.withName("preferredMaxBidirectionalCompoundGroup1ReferenceCount"),
            JAVA_INT.withName("preferredMaxBidirectionalCompoundGroup2ReferenceCount"),
            JAVA_INT.withName("preferredBidirectionalCompoundReferenceNameMask"),
            MemoryLayout.paddingLayout(4)
        ).withName("VkVideoEncodeAV1QualityLevelPropertiesKHR").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        PREFERRED_RATE_CONTROL_FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("preferredRateControlFlags"));
        PREFERRED_GOP_FRAME_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("preferredGopFrameCount"));
        PREFERRED_KEY_FRAME_PERIOD_HANDLE = LAYOUT.varHandle(PathElement.groupElement("preferredKeyFramePeriod"));
        PREFERRED_CONSECUTIVE_BIPREDICTIVE_FRAME_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("preferredConsecutiveBipredictiveFrameCount"));
        PREFERRED_TEMPORAL_LAYER_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("preferredTemporalLayerCount"));
        PREFERRED_MAX_SINGLE_REFERENCE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("preferredMaxSingleReferenceCount"));
        PREFERRED_SINGLE_REFERENCE_NAME_MASK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("preferredSingleReferenceNameMask"));
        PREFERRED_MAX_UNIDIRECTIONAL_COMPOUND_REFERENCE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("preferredMaxUnidirectionalCompoundReferenceCount"));
        PREFERRED_MAX_UNIDIRECTIONAL_COMPOUND_GROUP1_REFERENCE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("preferredMaxUnidirectionalCompoundGroup1ReferenceCount"));
        PREFERRED_UNIDIRECTIONAL_COMPOUND_REFERENCE_NAME_MASK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("preferredUnidirectionalCompoundReferenceNameMask"));
        PREFERRED_MAX_BIDIRECTIONAL_COMPOUND_REFERENCE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("preferredMaxBidirectionalCompoundReferenceCount"));
        PREFERRED_MAX_BIDIRECTIONAL_COMPOUND_GROUP1_REFERENCE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("preferredMaxBidirectionalCompoundGroup1ReferenceCount"));
        PREFERRED_MAX_BIDIRECTIONAL_COMPOUND_GROUP2_REFERENCE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("preferredMaxBidirectionalCompoundGroup2ReferenceCount"));
        PREFERRED_BIDIRECTIONAL_COMPOUND_REFERENCE_NAME_MASK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("preferredBidirectionalCompoundReferenceNameMask"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        PREFERRED_RATE_CONTROL_FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("preferredRateControlFlags"));
        PREFERRED_GOP_FRAME_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("preferredGopFrameCount"));
        PREFERRED_KEY_FRAME_PERIOD_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("preferredKeyFramePeriod"));
        PREFERRED_CONSECUTIVE_BIPREDICTIVE_FRAME_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("preferredConsecutiveBipredictiveFrameCount"));
        PREFERRED_TEMPORAL_LAYER_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("preferredTemporalLayerCount"));
        PREFERRED_CONSTANT_QINDEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("preferredConstantQIndex"));
        PREFERRED_MAX_SINGLE_REFERENCE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("preferredMaxSingleReferenceCount"));
        PREFERRED_SINGLE_REFERENCE_NAME_MASK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("preferredSingleReferenceNameMask"));
        PREFERRED_MAX_UNIDIRECTIONAL_COMPOUND_REFERENCE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("preferredMaxUnidirectionalCompoundReferenceCount"));
        PREFERRED_MAX_UNIDIRECTIONAL_COMPOUND_GROUP1_REFERENCE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("preferredMaxUnidirectionalCompoundGroup1ReferenceCount"));
        PREFERRED_UNIDIRECTIONAL_COMPOUND_REFERENCE_NAME_MASK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("preferredUnidirectionalCompoundReferenceNameMask"));
        PREFERRED_MAX_BIDIRECTIONAL_COMPOUND_REFERENCE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("preferredMaxBidirectionalCompoundReferenceCount"));
        PREFERRED_MAX_BIDIRECTIONAL_COMPOUND_GROUP1_REFERENCE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("preferredMaxBidirectionalCompoundGroup1ReferenceCount"));
        PREFERRED_MAX_BIDIRECTIONAL_COMPOUND_GROUP2_REFERENCE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("preferredMaxBidirectionalCompoundGroup2ReferenceCount"));
        PREFERRED_BIDIRECTIONAL_COMPOUND_REFERENCE_NAME_MASK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("preferredBidirectionalCompoundReferenceNameMask"));
        //@formatter:on
    }

    public VkVideoEncodeAV1QualityLevelPropertiesKHR() {
        this(Arena.ofAuto());
    }
    
    public VkVideoEncodeAV1QualityLevelPropertiesKHR(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkVideoEncodeAV1QualityLevelPropertiesKHR(MemorySegment segment) {
        this.segment = segment;
    
        preferredConstantQIndex = new VkVideoEncodeAV1QIndexKHR(segment.asSlice(PREFERRED_CONSTANT_QINDEX_BYTE_OFFSET, VkVideoEncodeAV1QIndexKHR.LAYOUT));
    }

    /// @see #sType()
    public VkVideoEncodeAV1QualityLevelPropertiesKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkVideoEncodeAV1QualityLevelPropertiesKHR pNext(MemorySegment pNext) {
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
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredRateControlFlags(int preferredRateControlFlags) {
    	PREFERRED_RATE_CONTROL_FLAGS_HANDLE.set(segment, 0L, preferredRateControlFlags);
    	return this;
    }
    
    public int preferredRateControlFlags() {
    	return (int) PREFERRED_RATE_CONTROL_FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #preferredGopFrameCount()
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredGopFrameCount(int preferredGopFrameCount) {
    	PREFERRED_GOP_FRAME_COUNT_HANDLE.set(segment, 0L, preferredGopFrameCount);
    	return this;
    }
    
    public int preferredGopFrameCount() {
    	return (int) PREFERRED_GOP_FRAME_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #preferredKeyFramePeriod()
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredKeyFramePeriod(int preferredKeyFramePeriod) {
    	PREFERRED_KEY_FRAME_PERIOD_HANDLE.set(segment, 0L, preferredKeyFramePeriod);
    	return this;
    }
    
    public int preferredKeyFramePeriod() {
    	return (int) PREFERRED_KEY_FRAME_PERIOD_HANDLE.get(segment, 0L);
    }
    
    /// @see #preferredConsecutiveBipredictiveFrameCount()
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredConsecutiveBipredictiveFrameCount(int preferredConsecutiveBipredictiveFrameCount) {
    	PREFERRED_CONSECUTIVE_BIPREDICTIVE_FRAME_COUNT_HANDLE.set(segment, 0L, preferredConsecutiveBipredictiveFrameCount);
    	return this;
    }
    
    public int preferredConsecutiveBipredictiveFrameCount() {
    	return (int) PREFERRED_CONSECUTIVE_BIPREDICTIVE_FRAME_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #preferredTemporalLayerCount()
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredTemporalLayerCount(int preferredTemporalLayerCount) {
    	PREFERRED_TEMPORAL_LAYER_COUNT_HANDLE.set(segment, 0L, preferredTemporalLayerCount);
    	return this;
    }
    
    public int preferredTemporalLayerCount() {
    	return (int) PREFERRED_TEMPORAL_LAYER_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #preferredMaxSingleReferenceCount()
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredMaxSingleReferenceCount(int preferredMaxSingleReferenceCount) {
    	PREFERRED_MAX_SINGLE_REFERENCE_COUNT_HANDLE.set(segment, 0L, preferredMaxSingleReferenceCount);
    	return this;
    }
    
    public int preferredMaxSingleReferenceCount() {
    	return (int) PREFERRED_MAX_SINGLE_REFERENCE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #preferredSingleReferenceNameMask()
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredSingleReferenceNameMask(int preferredSingleReferenceNameMask) {
    	PREFERRED_SINGLE_REFERENCE_NAME_MASK_HANDLE.set(segment, 0L, preferredSingleReferenceNameMask);
    	return this;
    }
    
    public int preferredSingleReferenceNameMask() {
    	return (int) PREFERRED_SINGLE_REFERENCE_NAME_MASK_HANDLE.get(segment, 0L);
    }
    
    /// @see #preferredMaxUnidirectionalCompoundReferenceCount()
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredMaxUnidirectionalCompoundReferenceCount(int preferredMaxUnidirectionalCompoundReferenceCount) {
    	PREFERRED_MAX_UNIDIRECTIONAL_COMPOUND_REFERENCE_COUNT_HANDLE.set(segment, 0L, preferredMaxUnidirectionalCompoundReferenceCount);
    	return this;
    }
    
    public int preferredMaxUnidirectionalCompoundReferenceCount() {
    	return (int) PREFERRED_MAX_UNIDIRECTIONAL_COMPOUND_REFERENCE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #preferredMaxUnidirectionalCompoundGroup1ReferenceCount()
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredMaxUnidirectionalCompoundGroup1ReferenceCount(int preferredMaxUnidirectionalCompoundGroup1ReferenceCount) {
    	PREFERRED_MAX_UNIDIRECTIONAL_COMPOUND_GROUP1_REFERENCE_COUNT_HANDLE.set(segment, 0L, preferredMaxUnidirectionalCompoundGroup1ReferenceCount);
    	return this;
    }
    
    public int preferredMaxUnidirectionalCompoundGroup1ReferenceCount() {
    	return (int) PREFERRED_MAX_UNIDIRECTIONAL_COMPOUND_GROUP1_REFERENCE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #preferredUnidirectionalCompoundReferenceNameMask()
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredUnidirectionalCompoundReferenceNameMask(int preferredUnidirectionalCompoundReferenceNameMask) {
    	PREFERRED_UNIDIRECTIONAL_COMPOUND_REFERENCE_NAME_MASK_HANDLE.set(segment, 0L, preferredUnidirectionalCompoundReferenceNameMask);
    	return this;
    }
    
    public int preferredUnidirectionalCompoundReferenceNameMask() {
    	return (int) PREFERRED_UNIDIRECTIONAL_COMPOUND_REFERENCE_NAME_MASK_HANDLE.get(segment, 0L);
    }
    
    /// @see #preferredMaxBidirectionalCompoundReferenceCount()
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredMaxBidirectionalCompoundReferenceCount(int preferredMaxBidirectionalCompoundReferenceCount) {
    	PREFERRED_MAX_BIDIRECTIONAL_COMPOUND_REFERENCE_COUNT_HANDLE.set(segment, 0L, preferredMaxBidirectionalCompoundReferenceCount);
    	return this;
    }
    
    public int preferredMaxBidirectionalCompoundReferenceCount() {
    	return (int) PREFERRED_MAX_BIDIRECTIONAL_COMPOUND_REFERENCE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #preferredMaxBidirectionalCompoundGroup1ReferenceCount()
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredMaxBidirectionalCompoundGroup1ReferenceCount(int preferredMaxBidirectionalCompoundGroup1ReferenceCount) {
    	PREFERRED_MAX_BIDIRECTIONAL_COMPOUND_GROUP1_REFERENCE_COUNT_HANDLE.set(segment, 0L, preferredMaxBidirectionalCompoundGroup1ReferenceCount);
    	return this;
    }
    
    public int preferredMaxBidirectionalCompoundGroup1ReferenceCount() {
    	return (int) PREFERRED_MAX_BIDIRECTIONAL_COMPOUND_GROUP1_REFERENCE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #preferredMaxBidirectionalCompoundGroup2ReferenceCount()
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredMaxBidirectionalCompoundGroup2ReferenceCount(int preferredMaxBidirectionalCompoundGroup2ReferenceCount) {
    	PREFERRED_MAX_BIDIRECTIONAL_COMPOUND_GROUP2_REFERENCE_COUNT_HANDLE.set(segment, 0L, preferredMaxBidirectionalCompoundGroup2ReferenceCount);
    	return this;
    }
    
    public int preferredMaxBidirectionalCompoundGroup2ReferenceCount() {
    	return (int) PREFERRED_MAX_BIDIRECTIONAL_COMPOUND_GROUP2_REFERENCE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #preferredBidirectionalCompoundReferenceNameMask()
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredBidirectionalCompoundReferenceNameMask(int preferredBidirectionalCompoundReferenceNameMask) {
    	PREFERRED_BIDIRECTIONAL_COMPOUND_REFERENCE_NAME_MASK_HANDLE.set(segment, 0L, preferredBidirectionalCompoundReferenceNameMask);
    	return this;
    }
    
    public int preferredBidirectionalCompoundReferenceNameMask() {
    	return (int) PREFERRED_BIDIRECTIONAL_COMPOUND_REFERENCE_NAME_MASK_HANDLE.get(segment, 0L);
    }
    
    /// @see #preferredConstantQIndex()
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredConstantQIndex(Consumer<VkVideoEncodeAV1QIndexKHR> consumer) {
    	consumer.accept(preferredConstantQIndex);
    	return this;
    }
    
    /// @see #preferredConstantQIndex()
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredConstantQIndex(VkVideoEncodeAV1QIndexKHR other) {
    	preferredConstantQIndex.set(other);
    	return this;
    }
    
    public VkVideoEncodeAV1QIndexKHR preferredConstantQIndex() {
    	return preferredConstantQIndex;
    }
    
    @Override
    public VkVideoEncodeAV1QualityLevelPropertiesKHR set(VkVideoEncodeAV1QualityLevelPropertiesKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkVideoEncodeAV1QualityLevelPropertiesKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkVideoEncodeAV1QualityLevelPropertiesKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkVideoEncodeAV1QualityLevelPropertiesKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkVideoEncodeAV1QualityLevelPropertiesKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkVideoEncodeAV1QualityLevelPropertiesKHR> array(Arena arena, VkVideoEncodeAV1QualityLevelPropertiesKHR... structs) {
        NativeStructArray<VkVideoEncodeAV1QualityLevelPropertiesKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkVideoEncodeAV1QualityLevelPropertiesKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkVideoEncodeAV1QualityLevelPropertiesKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkVideoEncodeAV1QualityLevelPropertiesKHR(segment)
        );
    }
    
}