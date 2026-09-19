/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
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

public final class VkVideoEncodeH264RateControlInfoKHR
		implements Struct<VkVideoEncodeH264RateControlInfoKHR> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle FLAGS_HANDLE;
    public static final VarHandle GOP_FRAME_COUNT_HANDLE;
    public static final VarHandle IDR_PERIOD_HANDLE;
    public static final VarHandle CONSECUTIVE_BFRAME_COUNT_HANDLE;
    public static final VarHandle TEMPORAL_LAYER_COUNT_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long FLAGS_BYTE_OFFSET;
    public static final long GOP_FRAME_COUNT_BYTE_OFFSET;
    public static final long IDR_PERIOD_BYTE_OFFSET;
    public static final long CONSECUTIVE_BFRAME_COUNT_BYTE_OFFSET;
    public static final long TEMPORAL_LAYER_COUNT_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("flags"),
            JAVA_INT.withName("gopFrameCount"),
            JAVA_INT.withName("idrPeriod"),
            JAVA_INT.withName("consecutiveBFrameCount"),
            JAVA_INT.withName("temporalLayerCount"),
            MemoryLayout.paddingLayout(4)
        ).withName("VkVideoEncodeH264RateControlInfoKHR").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
        GOP_FRAME_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("gopFrameCount"));
        IDR_PERIOD_HANDLE = LAYOUT.varHandle(PathElement.groupElement("idrPeriod"));
        CONSECUTIVE_BFRAME_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("consecutiveBFrameCount"));
        TEMPORAL_LAYER_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("temporalLayerCount"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
        GOP_FRAME_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("gopFrameCount"));
        IDR_PERIOD_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("idrPeriod"));
        CONSECUTIVE_BFRAME_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("consecutiveBFrameCount"));
        TEMPORAL_LAYER_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("temporalLayerCount"));
        //@formatter:on
    }

    public VkVideoEncodeH264RateControlInfoKHR() {
        this(Arena.ofAuto());
    }
    
    public VkVideoEncodeH264RateControlInfoKHR(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkVideoEncodeH264RateControlInfoKHR(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkVideoEncodeH264RateControlInfoKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkVideoEncodeH264RateControlInfoKHR pNext(MemorySegment pNext) {
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
    public VkVideoEncodeH264RateControlInfoKHR flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #gopFrameCount()
    public VkVideoEncodeH264RateControlInfoKHR gopFrameCount(int gopFrameCount) {
    	GOP_FRAME_COUNT_HANDLE.set(segment, 0L, gopFrameCount);
    	return this;
    }
    
    public int gopFrameCount() {
    	return (int) GOP_FRAME_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #idrPeriod()
    public VkVideoEncodeH264RateControlInfoKHR idrPeriod(int idrPeriod) {
    	IDR_PERIOD_HANDLE.set(segment, 0L, idrPeriod);
    	return this;
    }
    
    public int idrPeriod() {
    	return (int) IDR_PERIOD_HANDLE.get(segment, 0L);
    }
    
    /// @see #consecutiveBFrameCount()
    public VkVideoEncodeH264RateControlInfoKHR consecutiveBFrameCount(int consecutiveBFrameCount) {
    	CONSECUTIVE_BFRAME_COUNT_HANDLE.set(segment, 0L, consecutiveBFrameCount);
    	return this;
    }
    
    public int consecutiveBFrameCount() {
    	return (int) CONSECUTIVE_BFRAME_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #temporalLayerCount()
    public VkVideoEncodeH264RateControlInfoKHR temporalLayerCount(int temporalLayerCount) {
    	TEMPORAL_LAYER_COUNT_HANDLE.set(segment, 0L, temporalLayerCount);
    	return this;
    }
    
    public int temporalLayerCount() {
    	return (int) TEMPORAL_LAYER_COUNT_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkVideoEncodeH264RateControlInfoKHR set(VkVideoEncodeH264RateControlInfoKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkVideoEncodeH264RateControlInfoKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkVideoEncodeH264RateControlInfoKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkVideoEncodeH264RateControlInfoKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkVideoEncodeH264RateControlInfoKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkVideoEncodeH264RateControlInfoKHR> array(Arena arena, VkVideoEncodeH264RateControlInfoKHR... structs) {
        NativeStructArray<VkVideoEncodeH264RateControlInfoKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkVideoEncodeH264RateControlInfoKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkVideoEncodeH264RateControlInfoKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkVideoEncodeH264RateControlInfoKHR(segment)
        );
    }
    
}