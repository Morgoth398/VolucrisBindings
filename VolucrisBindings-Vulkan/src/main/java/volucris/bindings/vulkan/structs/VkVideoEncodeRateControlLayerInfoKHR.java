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

public final class VkVideoEncodeRateControlLayerInfoKHR
		implements Struct<VkVideoEncodeRateControlLayerInfoKHR> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle AVERAGE_BITRATE_HANDLE;
    public static final VarHandle MAX_BITRATE_HANDLE;
    public static final VarHandle FRAME_RATE_NUMERATOR_HANDLE;
    public static final VarHandle FRAME_RATE_DENOMINATOR_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long AVERAGE_BITRATE_BYTE_OFFSET;
    public static final long MAX_BITRATE_BYTE_OFFSET;
    public static final long FRAME_RATE_NUMERATOR_BYTE_OFFSET;
    public static final long FRAME_RATE_DENOMINATOR_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_LONG.withName("averageBitrate"),
            JAVA_LONG.withName("maxBitrate"),
            JAVA_INT.withName("frameRateNumerator"),
            JAVA_INT.withName("frameRateDenominator")
        ).withName("VkVideoEncodeRateControlLayerInfoKHR").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        AVERAGE_BITRATE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("averageBitrate"));
        MAX_BITRATE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxBitrate"));
        FRAME_RATE_NUMERATOR_HANDLE = LAYOUT.varHandle(PathElement.groupElement("frameRateNumerator"));
        FRAME_RATE_DENOMINATOR_HANDLE = LAYOUT.varHandle(PathElement.groupElement("frameRateDenominator"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        AVERAGE_BITRATE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("averageBitrate"));
        MAX_BITRATE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxBitrate"));
        FRAME_RATE_NUMERATOR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("frameRateNumerator"));
        FRAME_RATE_DENOMINATOR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("frameRateDenominator"));
        //@formatter:on
    }

    public VkVideoEncodeRateControlLayerInfoKHR() {
        this(Arena.ofAuto());
    }
    
    public VkVideoEncodeRateControlLayerInfoKHR(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkVideoEncodeRateControlLayerInfoKHR(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkVideoEncodeRateControlLayerInfoKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkVideoEncodeRateControlLayerInfoKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #averageBitrate()
    public VkVideoEncodeRateControlLayerInfoKHR averageBitrate(long averageBitrate) {
    	AVERAGE_BITRATE_HANDLE.set(segment, 0L, averageBitrate);
    	return this;
    }
    
    public long averageBitrate() {
    	return (long) AVERAGE_BITRATE_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxBitrate()
    public VkVideoEncodeRateControlLayerInfoKHR maxBitrate(long maxBitrate) {
    	MAX_BITRATE_HANDLE.set(segment, 0L, maxBitrate);
    	return this;
    }
    
    public long maxBitrate() {
    	return (long) MAX_BITRATE_HANDLE.get(segment, 0L);
    }
    
    /// @see #frameRateNumerator()
    public VkVideoEncodeRateControlLayerInfoKHR frameRateNumerator(int frameRateNumerator) {
    	FRAME_RATE_NUMERATOR_HANDLE.set(segment, 0L, frameRateNumerator);
    	return this;
    }
    
    public int frameRateNumerator() {
    	return (int) FRAME_RATE_NUMERATOR_HANDLE.get(segment, 0L);
    }
    
    /// @see #frameRateDenominator()
    public VkVideoEncodeRateControlLayerInfoKHR frameRateDenominator(int frameRateDenominator) {
    	FRAME_RATE_DENOMINATOR_HANDLE.set(segment, 0L, frameRateDenominator);
    	return this;
    }
    
    public int frameRateDenominator() {
    	return (int) FRAME_RATE_DENOMINATOR_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkVideoEncodeRateControlLayerInfoKHR set(VkVideoEncodeRateControlLayerInfoKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkVideoEncodeRateControlLayerInfoKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkVideoEncodeRateControlLayerInfoKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkVideoEncodeRateControlLayerInfoKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkVideoEncodeRateControlLayerInfoKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkVideoEncodeRateControlLayerInfoKHR> array(Arena arena, VkVideoEncodeRateControlLayerInfoKHR... structs) {
        NativeStructArray<VkVideoEncodeRateControlLayerInfoKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkVideoEncodeRateControlLayerInfoKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkVideoEncodeRateControlLayerInfoKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkVideoEncodeRateControlLayerInfoKHR(segment)
        );
    }
    
}