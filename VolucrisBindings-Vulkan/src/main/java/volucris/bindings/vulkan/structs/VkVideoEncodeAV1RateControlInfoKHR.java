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

public final class VkVideoEncodeAV1RateControlInfoKHR
		implements Struct<VkVideoEncodeAV1RateControlInfoKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle FLAGS_HANDLE;
	public static final VarHandle GOP_FRAME_COUNT_HANDLE;
	public static final VarHandle KEY_FRAME_PERIOD_HANDLE;
	public static final VarHandle CONSECUTIVE_BIPREDICTIVE_FRAME_COUNT_HANDLE;
	public static final VarHandle TEMPORAL_LAYER_COUNT_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long FLAGS_BYTE_OFFSET;
	public static final long GOP_FRAME_COUNT_BYTE_OFFSET;
	public static final long KEY_FRAME_PERIOD_BYTE_OFFSET;
	public static final long CONSECUTIVE_BIPREDICTIVE_FRAME_COUNT_BYTE_OFFSET;
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
		    JAVA_INT.withName("keyFramePeriod"),
		    JAVA_INT.withName("consecutiveBipredictiveFrameCount"),
		    JAVA_INT.withName("temporalLayerCount"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkVideoEncodeAV1RateControlInfoKHR").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
		GOP_FRAME_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("gopFrameCount"));
		KEY_FRAME_PERIOD_HANDLE = LAYOUT.varHandle(PathElement.groupElement("keyFramePeriod"));
		CONSECUTIVE_BIPREDICTIVE_FRAME_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("consecutiveBipredictiveFrameCount"));
		TEMPORAL_LAYER_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("temporalLayerCount"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
		GOP_FRAME_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("gopFrameCount"));
		KEY_FRAME_PERIOD_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("keyFramePeriod"));
		CONSECUTIVE_BIPREDICTIVE_FRAME_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("consecutiveBipredictiveFrameCount"));
		TEMPORAL_LAYER_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("temporalLayerCount"));
		//@formatter:on
	}

	public VkVideoEncodeAV1RateControlInfoKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkVideoEncodeAV1RateControlInfoKHR(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkVideoEncodeAV1RateControlInfoKHR(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkVideoEncodeAV1RateControlInfoKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkVideoEncodeAV1RateControlInfoKHR pNext(MemorySegment pNext) {
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
    public VkVideoEncodeAV1RateControlInfoKHR flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #gopFrameCount()
    public VkVideoEncodeAV1RateControlInfoKHR gopFrameCount(int gopFrameCount) {
    	GOP_FRAME_COUNT_HANDLE.set(segment, 0L, gopFrameCount);
    	return this;
    }
    
    public int gopFrameCount() {
    	return (int) GOP_FRAME_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #keyFramePeriod()
    public VkVideoEncodeAV1RateControlInfoKHR keyFramePeriod(int keyFramePeriod) {
    	KEY_FRAME_PERIOD_HANDLE.set(segment, 0L, keyFramePeriod);
    	return this;
    }
    
    public int keyFramePeriod() {
    	return (int) KEY_FRAME_PERIOD_HANDLE.get(segment, 0L);
    }
    
    /// @see #consecutiveBipredictiveFrameCount()
    public VkVideoEncodeAV1RateControlInfoKHR consecutiveBipredictiveFrameCount(int consecutiveBipredictiveFrameCount) {
    	CONSECUTIVE_BIPREDICTIVE_FRAME_COUNT_HANDLE.set(segment, 0L, consecutiveBipredictiveFrameCount);
    	return this;
    }
    
    public int consecutiveBipredictiveFrameCount() {
    	return (int) CONSECUTIVE_BIPREDICTIVE_FRAME_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #temporalLayerCount()
    public VkVideoEncodeAV1RateControlInfoKHR temporalLayerCount(int temporalLayerCount) {
    	TEMPORAL_LAYER_COUNT_HANDLE.set(segment, 0L, temporalLayerCount);
    	return this;
    }
    
    public int temporalLayerCount() {
    	return (int) TEMPORAL_LAYER_COUNT_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkVideoEncodeAV1RateControlInfoKHR set(VkVideoEncodeAV1RateControlInfoKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkVideoEncodeAV1RateControlInfoKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkVideoEncodeAV1RateControlInfoKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkVideoEncodeAV1RateControlInfoKHR> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkVideoEncodeAV1RateControlInfoKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkVideoEncodeAV1RateControlInfoKHR> array(SegmentAllocator allocator, VkVideoEncodeAV1RateControlInfoKHR... structs) {
        NativeStructArray<VkVideoEncodeAV1RateControlInfoKHR> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkVideoEncodeAV1RateControlInfoKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkVideoEncodeAV1RateControlInfoKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkVideoEncodeAV1RateControlInfoKHR(segment)
        );
    }

}