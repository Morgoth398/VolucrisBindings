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

public final class VkTensorMemoryBarrierARM
		implements Struct<VkTensorMemoryBarrierARM> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle SRC_STAGE_MASK_HANDLE;
	public static final VarHandle SRC_ACCESS_MASK_HANDLE;
	public static final VarHandle DST_STAGE_MASK_HANDLE;
	public static final VarHandle DST_ACCESS_MASK_HANDLE;
	public static final VarHandle SRC_QUEUE_FAMILY_INDEX_HANDLE;
	public static final VarHandle DST_QUEUE_FAMILY_INDEX_HANDLE;
	public static final VarHandle TENSOR_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long SRC_STAGE_MASK_BYTE_OFFSET;
	public static final long SRC_ACCESS_MASK_BYTE_OFFSET;
	public static final long DST_STAGE_MASK_BYTE_OFFSET;
	public static final long DST_ACCESS_MASK_BYTE_OFFSET;
	public static final long SRC_QUEUE_FAMILY_INDEX_BYTE_OFFSET;
	public static final long DST_QUEUE_FAMILY_INDEX_BYTE_OFFSET;
	public static final long TENSOR_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_LONG.withName("srcStageMask"),
		    JAVA_LONG.withName("srcAccessMask"),
		    JAVA_LONG.withName("dstStageMask"),
		    JAVA_LONG.withName("dstAccessMask"),
		    JAVA_INT.withName("srcQueueFamilyIndex"),
		    JAVA_INT.withName("dstQueueFamilyIndex"),
		    UNBOUNDED_ADDRESS.withName("tensor")
		).withName("VkTensorMemoryBarrierARM").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		SRC_STAGE_MASK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("srcStageMask"));
		SRC_ACCESS_MASK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("srcAccessMask"));
		DST_STAGE_MASK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("dstStageMask"));
		DST_ACCESS_MASK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("dstAccessMask"));
		SRC_QUEUE_FAMILY_INDEX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("srcQueueFamilyIndex"));
		DST_QUEUE_FAMILY_INDEX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("dstQueueFamilyIndex"));
		TENSOR_HANDLE = LAYOUT.varHandle(PathElement.groupElement("tensor"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		SRC_STAGE_MASK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("srcStageMask"));
		SRC_ACCESS_MASK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("srcAccessMask"));
		DST_STAGE_MASK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dstStageMask"));
		DST_ACCESS_MASK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dstAccessMask"));
		SRC_QUEUE_FAMILY_INDEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("srcQueueFamilyIndex"));
		DST_QUEUE_FAMILY_INDEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dstQueueFamilyIndex"));
		TENSOR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("tensor"));
		//@formatter:on
	}

	public VkTensorMemoryBarrierARM() {
	    this(Arena.ofAuto());
	}
	
	public VkTensorMemoryBarrierARM(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkTensorMemoryBarrierARM(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkTensorMemoryBarrierARM sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkTensorMemoryBarrierARM pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #srcStageMask()
    public VkTensorMemoryBarrierARM srcStageMask(long srcStageMask) {
    	SRC_STAGE_MASK_HANDLE.set(segment, 0L, srcStageMask);
    	return this;
    }
    
    public long srcStageMask() {
    	return (long) SRC_STAGE_MASK_HANDLE.get(segment, 0L);
    }
    
    /// @see #srcAccessMask()
    public VkTensorMemoryBarrierARM srcAccessMask(long srcAccessMask) {
    	SRC_ACCESS_MASK_HANDLE.set(segment, 0L, srcAccessMask);
    	return this;
    }
    
    public long srcAccessMask() {
    	return (long) SRC_ACCESS_MASK_HANDLE.get(segment, 0L);
    }
    
    /// @see #dstStageMask()
    public VkTensorMemoryBarrierARM dstStageMask(long dstStageMask) {
    	DST_STAGE_MASK_HANDLE.set(segment, 0L, dstStageMask);
    	return this;
    }
    
    public long dstStageMask() {
    	return (long) DST_STAGE_MASK_HANDLE.get(segment, 0L);
    }
    
    /// @see #dstAccessMask()
    public VkTensorMemoryBarrierARM dstAccessMask(long dstAccessMask) {
    	DST_ACCESS_MASK_HANDLE.set(segment, 0L, dstAccessMask);
    	return this;
    }
    
    public long dstAccessMask() {
    	return (long) DST_ACCESS_MASK_HANDLE.get(segment, 0L);
    }
    
    /// @see #srcQueueFamilyIndex()
    public VkTensorMemoryBarrierARM srcQueueFamilyIndex(int srcQueueFamilyIndex) {
    	SRC_QUEUE_FAMILY_INDEX_HANDLE.set(segment, 0L, srcQueueFamilyIndex);
    	return this;
    }
    
    public int srcQueueFamilyIndex() {
    	return (int) SRC_QUEUE_FAMILY_INDEX_HANDLE.get(segment, 0L);
    }
    
    /// @see #dstQueueFamilyIndex()
    public VkTensorMemoryBarrierARM dstQueueFamilyIndex(int dstQueueFamilyIndex) {
    	DST_QUEUE_FAMILY_INDEX_HANDLE.set(segment, 0L, dstQueueFamilyIndex);
    	return this;
    }
    
    public int dstQueueFamilyIndex() {
    	return (int) DST_QUEUE_FAMILY_INDEX_HANDLE.get(segment, 0L);
    }
    
    /// @see #tensor()
    public VkTensorMemoryBarrierARM tensor(VkTensorARM tensor) {
    	TENSOR_HANDLE.set(segment, 0L, tensor.memorySegment());
    	return this;
    }
    
    public @Nullable VkTensorARM tensor() {
    	MemorySegment segment = (MemorySegment) TENSOR_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkTensorARM(segment);
    }
    
    @Override
    public VkTensorMemoryBarrierARM set(VkTensorMemoryBarrierARM other) {
        return set(other.segment);
    }
    
    @Override
    public VkTensorMemoryBarrierARM set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkTensorMemoryBarrierARM> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkTensorMemoryBarrierARM> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkTensorMemoryBarrierARM(segment),
            count
        );
    }
    
    public static NativeStructArray<VkTensorMemoryBarrierARM> array(SegmentAllocator allocator, VkTensorMemoryBarrierARM... structs) {
        NativeStructArray<VkTensorMemoryBarrierARM> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkTensorMemoryBarrierARM(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkTensorMemoryBarrierARM> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkTensorMemoryBarrierARM(segment)
        );
    }

}