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

public final class VkVideoEncodeH264RateControlLayerInfoKHR
		implements Struct<VkVideoEncodeH264RateControlLayerInfoKHR> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle USE_MIN_QP_HANDLE;
    public static final VarHandle USE_MAX_QP_HANDLE;
    public static final VarHandle USE_MAX_FRAME_SIZE_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long USE_MIN_QP_BYTE_OFFSET;
    public static final long MIN_QP_BYTE_OFFSET;
    public static final long USE_MAX_QP_BYTE_OFFSET;
    public static final long MAX_QP_BYTE_OFFSET;
    public static final long USE_MAX_FRAME_SIZE_BYTE_OFFSET;
    public static final long MAX_FRAME_SIZE_BYTE_OFFSET;

    private final MemorySegment segment;

    private final VkVideoEncodeH264QpKHR minQp;
    private final VkVideoEncodeH264QpKHR maxQp;
    private final VkVideoEncodeH264FrameSizeKHR maxFrameSize;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("useMinQp"),
            VkVideoEncodeH264QpKHR.LAYOUT.withName("minQp"),
            JAVA_INT.withName("useMaxQp"),
            VkVideoEncodeH264QpKHR.LAYOUT.withName("maxQp"),
            JAVA_INT.withName("useMaxFrameSize"),
            VkVideoEncodeH264FrameSizeKHR.LAYOUT.withName("maxFrameSize")
        ).withName("VkVideoEncodeH264RateControlLayerInfoKHR").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        USE_MIN_QP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("useMinQp"));
        USE_MAX_QP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("useMaxQp"));
        USE_MAX_FRAME_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("useMaxFrameSize"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        USE_MIN_QP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("useMinQp"));
        MIN_QP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("minQp"));
        USE_MAX_QP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("useMaxQp"));
        MAX_QP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxQp"));
        USE_MAX_FRAME_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("useMaxFrameSize"));
        MAX_FRAME_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxFrameSize"));
        //@formatter:on
    }

    public VkVideoEncodeH264RateControlLayerInfoKHR() {
        this(Arena.ofAuto());
    }
    
    public VkVideoEncodeH264RateControlLayerInfoKHR(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkVideoEncodeH264RateControlLayerInfoKHR(MemorySegment segment) {
        this.segment = segment;
    
        minQp = new VkVideoEncodeH264QpKHR(segment.asSlice(MIN_QP_BYTE_OFFSET, VkVideoEncodeH264QpKHR.LAYOUT));
        maxQp = new VkVideoEncodeH264QpKHR(segment.asSlice(MAX_QP_BYTE_OFFSET, VkVideoEncodeH264QpKHR.LAYOUT));
        maxFrameSize = new VkVideoEncodeH264FrameSizeKHR(segment.asSlice(MAX_FRAME_SIZE_BYTE_OFFSET, VkVideoEncodeH264FrameSizeKHR.LAYOUT));
    }

    /// @see #sType()
    public VkVideoEncodeH264RateControlLayerInfoKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkVideoEncodeH264RateControlLayerInfoKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #useMinQp()
    public VkVideoEncodeH264RateControlLayerInfoKHR useMinQp(int useMinQp) {
    	USE_MIN_QP_HANDLE.set(segment, 0L, useMinQp);
    	return this;
    }
    
    public int useMinQp() {
    	return (int) USE_MIN_QP_HANDLE.get(segment, 0L);
    }
    
    /// @see #useMaxQp()
    public VkVideoEncodeH264RateControlLayerInfoKHR useMaxQp(int useMaxQp) {
    	USE_MAX_QP_HANDLE.set(segment, 0L, useMaxQp);
    	return this;
    }
    
    public int useMaxQp() {
    	return (int) USE_MAX_QP_HANDLE.get(segment, 0L);
    }
    
    /// @see #useMaxFrameSize()
    public VkVideoEncodeH264RateControlLayerInfoKHR useMaxFrameSize(int useMaxFrameSize) {
    	USE_MAX_FRAME_SIZE_HANDLE.set(segment, 0L, useMaxFrameSize);
    	return this;
    }
    
    public int useMaxFrameSize() {
    	return (int) USE_MAX_FRAME_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #minQp()
    public VkVideoEncodeH264RateControlLayerInfoKHR minQp(Consumer<VkVideoEncodeH264QpKHR> consumer) {
    	consumer.accept(minQp);
    	return this;
    }
    
    /// @see #minQp()
    public VkVideoEncodeH264RateControlLayerInfoKHR minQp(VkVideoEncodeH264QpKHR other) {
    	minQp.set(other);
    	return this;
    }
    
    public VkVideoEncodeH264QpKHR minQp() {
    	return minQp;
    }
    
    /// @see #maxQp()
    public VkVideoEncodeH264RateControlLayerInfoKHR maxQp(Consumer<VkVideoEncodeH264QpKHR> consumer) {
    	consumer.accept(maxQp);
    	return this;
    }
    
    /// @see #maxQp()
    public VkVideoEncodeH264RateControlLayerInfoKHR maxQp(VkVideoEncodeH264QpKHR other) {
    	maxQp.set(other);
    	return this;
    }
    
    public VkVideoEncodeH264QpKHR maxQp() {
    	return maxQp;
    }
    
    /// @see #maxFrameSize()
    public VkVideoEncodeH264RateControlLayerInfoKHR maxFrameSize(Consumer<VkVideoEncodeH264FrameSizeKHR> consumer) {
    	consumer.accept(maxFrameSize);
    	return this;
    }
    
    /// @see #maxFrameSize()
    public VkVideoEncodeH264RateControlLayerInfoKHR maxFrameSize(VkVideoEncodeH264FrameSizeKHR other) {
    	maxFrameSize.set(other);
    	return this;
    }
    
    public VkVideoEncodeH264FrameSizeKHR maxFrameSize() {
    	return maxFrameSize;
    }
    
    @Override
    public VkVideoEncodeH264RateControlLayerInfoKHR set(VkVideoEncodeH264RateControlLayerInfoKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkVideoEncodeH264RateControlLayerInfoKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkVideoEncodeH264RateControlLayerInfoKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkVideoEncodeH264RateControlLayerInfoKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkVideoEncodeH264RateControlLayerInfoKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkVideoEncodeH264RateControlLayerInfoKHR> array(Arena arena, VkVideoEncodeH264RateControlLayerInfoKHR... structs) {
        NativeStructArray<VkVideoEncodeH264RateControlLayerInfoKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkVideoEncodeH264RateControlLayerInfoKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkVideoEncodeH264RateControlLayerInfoKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkVideoEncodeH264RateControlLayerInfoKHR(segment)
        );
    }
    
}