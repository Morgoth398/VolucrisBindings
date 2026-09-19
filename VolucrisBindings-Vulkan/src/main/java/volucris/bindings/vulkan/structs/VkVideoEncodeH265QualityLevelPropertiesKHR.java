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

public final class VkVideoEncodeH265QualityLevelPropertiesKHR
		implements Struct<VkVideoEncodeH265QualityLevelPropertiesKHR> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle PREFERRED_RATE_CONTROL_FLAGS_HANDLE;
    public static final VarHandle PREFERRED_GOP_FRAME_COUNT_HANDLE;
    public static final VarHandle PREFERRED_IDR_PERIOD_HANDLE;
    public static final VarHandle PREFERRED_CONSECUTIVE_BFRAME_COUNT_HANDLE;
    public static final VarHandle PREFERRED_SUB_LAYER_COUNT_HANDLE;
    public static final VarHandle PREFERRED_MAX_L0_REFERENCE_COUNT_HANDLE;
    public static final VarHandle PREFERRED_MAX_L1_REFERENCE_COUNT_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long PREFERRED_RATE_CONTROL_FLAGS_BYTE_OFFSET;
    public static final long PREFERRED_GOP_FRAME_COUNT_BYTE_OFFSET;
    public static final long PREFERRED_IDR_PERIOD_BYTE_OFFSET;
    public static final long PREFERRED_CONSECUTIVE_BFRAME_COUNT_BYTE_OFFSET;
    public static final long PREFERRED_SUB_LAYER_COUNT_BYTE_OFFSET;
    public static final long PREFERRED_CONSTANT_QP_BYTE_OFFSET;
    public static final long PREFERRED_MAX_L0_REFERENCE_COUNT_BYTE_OFFSET;
    public static final long PREFERRED_MAX_L1_REFERENCE_COUNT_BYTE_OFFSET;

    private final MemorySegment segment;

    private final VkVideoEncodeH265QpKHR preferredConstantQp;

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
            JAVA_INT.withName("preferredSubLayerCount"),
            VkVideoEncodeH265QpKHR.LAYOUT.withName("preferredConstantQp"),
            JAVA_INT.withName("preferredMaxL0ReferenceCount"),
            JAVA_INT.withName("preferredMaxL1ReferenceCount")
        ).withName("VkVideoEncodeH265QualityLevelPropertiesKHR").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        PREFERRED_RATE_CONTROL_FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("preferredRateControlFlags"));
        PREFERRED_GOP_FRAME_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("preferredGopFrameCount"));
        PREFERRED_IDR_PERIOD_HANDLE = LAYOUT.varHandle(PathElement.groupElement("preferredIdrPeriod"));
        PREFERRED_CONSECUTIVE_BFRAME_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("preferredConsecutiveBFrameCount"));
        PREFERRED_SUB_LAYER_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("preferredSubLayerCount"));
        PREFERRED_MAX_L0_REFERENCE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("preferredMaxL0ReferenceCount"));
        PREFERRED_MAX_L1_REFERENCE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("preferredMaxL1ReferenceCount"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        PREFERRED_RATE_CONTROL_FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("preferredRateControlFlags"));
        PREFERRED_GOP_FRAME_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("preferredGopFrameCount"));
        PREFERRED_IDR_PERIOD_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("preferredIdrPeriod"));
        PREFERRED_CONSECUTIVE_BFRAME_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("preferredConsecutiveBFrameCount"));
        PREFERRED_SUB_LAYER_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("preferredSubLayerCount"));
        PREFERRED_CONSTANT_QP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("preferredConstantQp"));
        PREFERRED_MAX_L0_REFERENCE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("preferredMaxL0ReferenceCount"));
        PREFERRED_MAX_L1_REFERENCE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("preferredMaxL1ReferenceCount"));
        //@formatter:on
    }

    public VkVideoEncodeH265QualityLevelPropertiesKHR() {
        this(Arena.ofAuto());
    }
    
    public VkVideoEncodeH265QualityLevelPropertiesKHR(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkVideoEncodeH265QualityLevelPropertiesKHR(MemorySegment segment) {
        this.segment = segment;
    
        preferredConstantQp = new VkVideoEncodeH265QpKHR(segment.asSlice(PREFERRED_CONSTANT_QP_BYTE_OFFSET, VkVideoEncodeH265QpKHR.LAYOUT));
    }

    /// @see #sType()
    public VkVideoEncodeH265QualityLevelPropertiesKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkVideoEncodeH265QualityLevelPropertiesKHR pNext(MemorySegment pNext) {
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
    public VkVideoEncodeH265QualityLevelPropertiesKHR preferredRateControlFlags(int preferredRateControlFlags) {
    	PREFERRED_RATE_CONTROL_FLAGS_HANDLE.set(segment, 0L, preferredRateControlFlags);
    	return this;
    }
    
    public int preferredRateControlFlags() {
    	return (int) PREFERRED_RATE_CONTROL_FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #preferredGopFrameCount()
    public VkVideoEncodeH265QualityLevelPropertiesKHR preferredGopFrameCount(int preferredGopFrameCount) {
    	PREFERRED_GOP_FRAME_COUNT_HANDLE.set(segment, 0L, preferredGopFrameCount);
    	return this;
    }
    
    public int preferredGopFrameCount() {
    	return (int) PREFERRED_GOP_FRAME_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #preferredIdrPeriod()
    public VkVideoEncodeH265QualityLevelPropertiesKHR preferredIdrPeriod(int preferredIdrPeriod) {
    	PREFERRED_IDR_PERIOD_HANDLE.set(segment, 0L, preferredIdrPeriod);
    	return this;
    }
    
    public int preferredIdrPeriod() {
    	return (int) PREFERRED_IDR_PERIOD_HANDLE.get(segment, 0L);
    }
    
    /// @see #preferredConsecutiveBFrameCount()
    public VkVideoEncodeH265QualityLevelPropertiesKHR preferredConsecutiveBFrameCount(int preferredConsecutiveBFrameCount) {
    	PREFERRED_CONSECUTIVE_BFRAME_COUNT_HANDLE.set(segment, 0L, preferredConsecutiveBFrameCount);
    	return this;
    }
    
    public int preferredConsecutiveBFrameCount() {
    	return (int) PREFERRED_CONSECUTIVE_BFRAME_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #preferredSubLayerCount()
    public VkVideoEncodeH265QualityLevelPropertiesKHR preferredSubLayerCount(int preferredSubLayerCount) {
    	PREFERRED_SUB_LAYER_COUNT_HANDLE.set(segment, 0L, preferredSubLayerCount);
    	return this;
    }
    
    public int preferredSubLayerCount() {
    	return (int) PREFERRED_SUB_LAYER_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #preferredMaxL0ReferenceCount()
    public VkVideoEncodeH265QualityLevelPropertiesKHR preferredMaxL0ReferenceCount(int preferredMaxL0ReferenceCount) {
    	PREFERRED_MAX_L0_REFERENCE_COUNT_HANDLE.set(segment, 0L, preferredMaxL0ReferenceCount);
    	return this;
    }
    
    public int preferredMaxL0ReferenceCount() {
    	return (int) PREFERRED_MAX_L0_REFERENCE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #preferredMaxL1ReferenceCount()
    public VkVideoEncodeH265QualityLevelPropertiesKHR preferredMaxL1ReferenceCount(int preferredMaxL1ReferenceCount) {
    	PREFERRED_MAX_L1_REFERENCE_COUNT_HANDLE.set(segment, 0L, preferredMaxL1ReferenceCount);
    	return this;
    }
    
    public int preferredMaxL1ReferenceCount() {
    	return (int) PREFERRED_MAX_L1_REFERENCE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #preferredConstantQp()
    public VkVideoEncodeH265QualityLevelPropertiesKHR preferredConstantQp(Consumer<VkVideoEncodeH265QpKHR> consumer) {
    	consumer.accept(preferredConstantQp);
    	return this;
    }
    
    /// @see #preferredConstantQp()
    public VkVideoEncodeH265QualityLevelPropertiesKHR preferredConstantQp(VkVideoEncodeH265QpKHR other) {
    	preferredConstantQp.set(other);
    	return this;
    }
    
    public VkVideoEncodeH265QpKHR preferredConstantQp() {
    	return preferredConstantQp;
    }
    
    @Override
    public VkVideoEncodeH265QualityLevelPropertiesKHR set(VkVideoEncodeH265QualityLevelPropertiesKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkVideoEncodeH265QualityLevelPropertiesKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkVideoEncodeH265QualityLevelPropertiesKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkVideoEncodeH265QualityLevelPropertiesKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkVideoEncodeH265QualityLevelPropertiesKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkVideoEncodeH265QualityLevelPropertiesKHR> array(Arena arena, VkVideoEncodeH265QualityLevelPropertiesKHR... structs) {
        NativeStructArray<VkVideoEncodeH265QualityLevelPropertiesKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkVideoEncodeH265QualityLevelPropertiesKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkVideoEncodeH265QualityLevelPropertiesKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkVideoEncodeH265QualityLevelPropertiesKHR(segment)
        );
    }
    
}