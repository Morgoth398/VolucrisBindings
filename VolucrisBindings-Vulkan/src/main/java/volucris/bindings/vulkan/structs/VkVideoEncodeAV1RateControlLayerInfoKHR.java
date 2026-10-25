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

public final class VkVideoEncodeAV1RateControlLayerInfoKHR
		implements Struct<VkVideoEncodeAV1RateControlLayerInfoKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle USE_MIN_QINDEX_HANDLE;
	public static final VarHandle USE_MAX_QINDEX_HANDLE;
	public static final VarHandle USE_MAX_FRAME_SIZE_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long USE_MIN_QINDEX_BYTE_OFFSET;
	public static final long MIN_QINDEX_BYTE_OFFSET;
	public static final long USE_MAX_QINDEX_BYTE_OFFSET;
	public static final long MAX_QINDEX_BYTE_OFFSET;
	public static final long USE_MAX_FRAME_SIZE_BYTE_OFFSET;
	public static final long MAX_FRAME_SIZE_BYTE_OFFSET;

	private final MemorySegment segment;

	private final VkVideoEncodeAV1QIndexKHR minQIndex;
	private final VkVideoEncodeAV1QIndexKHR maxQIndex;
	private final VkVideoEncodeAV1FrameSizeKHR maxFrameSize;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("useMinQIndex"),
		    VkVideoEncodeAV1QIndexKHR.LAYOUT.withName("minQIndex"),
		    JAVA_INT.withName("useMaxQIndex"),
		    VkVideoEncodeAV1QIndexKHR.LAYOUT.withName("maxQIndex"),
		    JAVA_INT.withName("useMaxFrameSize"),
		    VkVideoEncodeAV1FrameSizeKHR.LAYOUT.withName("maxFrameSize")
		).withName("VkVideoEncodeAV1RateControlLayerInfoKHR").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		USE_MIN_QINDEX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("useMinQIndex"));
		USE_MAX_QINDEX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("useMaxQIndex"));
		USE_MAX_FRAME_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("useMaxFrameSize"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		USE_MIN_QINDEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("useMinQIndex"));
		MIN_QINDEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("minQIndex"));
		USE_MAX_QINDEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("useMaxQIndex"));
		MAX_QINDEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxQIndex"));
		USE_MAX_FRAME_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("useMaxFrameSize"));
		MAX_FRAME_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxFrameSize"));
		//@formatter:on
	}

	public VkVideoEncodeAV1RateControlLayerInfoKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkVideoEncodeAV1RateControlLayerInfoKHR(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkVideoEncodeAV1RateControlLayerInfoKHR(MemorySegment segment) {
	    this.segment = segment;
	
	    minQIndex = new VkVideoEncodeAV1QIndexKHR(segment.asSlice(MIN_QINDEX_BYTE_OFFSET, VkVideoEncodeAV1QIndexKHR.LAYOUT));
	    maxQIndex = new VkVideoEncodeAV1QIndexKHR(segment.asSlice(MAX_QINDEX_BYTE_OFFSET, VkVideoEncodeAV1QIndexKHR.LAYOUT));
	    maxFrameSize = new VkVideoEncodeAV1FrameSizeKHR(segment.asSlice(MAX_FRAME_SIZE_BYTE_OFFSET, VkVideoEncodeAV1FrameSizeKHR.LAYOUT));
	}

    /// @see #sType()
    public VkVideoEncodeAV1RateControlLayerInfoKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkVideoEncodeAV1RateControlLayerInfoKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #useMinQIndex()
    public VkVideoEncodeAV1RateControlLayerInfoKHR useMinQIndex(int useMinQIndex) {
    	USE_MIN_QINDEX_HANDLE.set(segment, 0L, useMinQIndex);
    	return this;
    }
    
    public int useMinQIndex() {
    	return (int) USE_MIN_QINDEX_HANDLE.get(segment, 0L);
    }
    
    /// @see #minQIndex()
    public VkVideoEncodeAV1RateControlLayerInfoKHR minQIndex(Consumer<VkVideoEncodeAV1QIndexKHR> consumer) {
    	consumer.accept(minQIndex);
    	return this;
    }
    
    /// @see #minQIndex()
    public VkVideoEncodeAV1RateControlLayerInfoKHR minQIndex(VkVideoEncodeAV1QIndexKHR other) {
    	minQIndex.set(other);
    	return this;
    }
    
    public VkVideoEncodeAV1QIndexKHR minQIndex() {
    	return minQIndex;
    }
    
    /// @see #useMaxQIndex()
    public VkVideoEncodeAV1RateControlLayerInfoKHR useMaxQIndex(int useMaxQIndex) {
    	USE_MAX_QINDEX_HANDLE.set(segment, 0L, useMaxQIndex);
    	return this;
    }
    
    public int useMaxQIndex() {
    	return (int) USE_MAX_QINDEX_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxQIndex()
    public VkVideoEncodeAV1RateControlLayerInfoKHR maxQIndex(Consumer<VkVideoEncodeAV1QIndexKHR> consumer) {
    	consumer.accept(maxQIndex);
    	return this;
    }
    
    /// @see #maxQIndex()
    public VkVideoEncodeAV1RateControlLayerInfoKHR maxQIndex(VkVideoEncodeAV1QIndexKHR other) {
    	maxQIndex.set(other);
    	return this;
    }
    
    public VkVideoEncodeAV1QIndexKHR maxQIndex() {
    	return maxQIndex;
    }
    
    /// @see #useMaxFrameSize()
    public VkVideoEncodeAV1RateControlLayerInfoKHR useMaxFrameSize(int useMaxFrameSize) {
    	USE_MAX_FRAME_SIZE_HANDLE.set(segment, 0L, useMaxFrameSize);
    	return this;
    }
    
    public int useMaxFrameSize() {
    	return (int) USE_MAX_FRAME_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxFrameSize()
    public VkVideoEncodeAV1RateControlLayerInfoKHR maxFrameSize(Consumer<VkVideoEncodeAV1FrameSizeKHR> consumer) {
    	consumer.accept(maxFrameSize);
    	return this;
    }
    
    /// @see #maxFrameSize()
    public VkVideoEncodeAV1RateControlLayerInfoKHR maxFrameSize(VkVideoEncodeAV1FrameSizeKHR other) {
    	maxFrameSize.set(other);
    	return this;
    }
    
    public VkVideoEncodeAV1FrameSizeKHR maxFrameSize() {
    	return maxFrameSize;
    }
    
    @Override
    public VkVideoEncodeAV1RateControlLayerInfoKHR set(VkVideoEncodeAV1RateControlLayerInfoKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkVideoEncodeAV1RateControlLayerInfoKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkVideoEncodeAV1RateControlLayerInfoKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkVideoEncodeAV1RateControlLayerInfoKHR> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkVideoEncodeAV1RateControlLayerInfoKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkVideoEncodeAV1RateControlLayerInfoKHR> array(SegmentAllocator allocator, VkVideoEncodeAV1RateControlLayerInfoKHR... structs) {
        NativeStructArray<VkVideoEncodeAV1RateControlLayerInfoKHR> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkVideoEncodeAV1RateControlLayerInfoKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkVideoEncodeAV1RateControlLayerInfoKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkVideoEncodeAV1RateControlLayerInfoKHR(segment)
        );
    }

}