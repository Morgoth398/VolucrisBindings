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

public final class VkBufferMemoryBarrier2
		implements Struct<VkBufferMemoryBarrier2> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle SRC_STAGE_MASK_HANDLE;
	public static final VarHandle SRC_ACCESS_MASK_HANDLE;
	public static final VarHandle DST_STAGE_MASK_HANDLE;
	public static final VarHandle DST_ACCESS_MASK_HANDLE;
	public static final VarHandle SRC_QUEUE_FAMILY_INDEX_HANDLE;
	public static final VarHandle DST_QUEUE_FAMILY_INDEX_HANDLE;
	public static final VarHandle BUFFER_HANDLE;
	public static final VarHandle OFFSET_HANDLE;
	public static final VarHandle SIZE_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long SRC_STAGE_MASK_BYTE_OFFSET;
	public static final long SRC_ACCESS_MASK_BYTE_OFFSET;
	public static final long DST_STAGE_MASK_BYTE_OFFSET;
	public static final long DST_ACCESS_MASK_BYTE_OFFSET;
	public static final long SRC_QUEUE_FAMILY_INDEX_BYTE_OFFSET;
	public static final long DST_QUEUE_FAMILY_INDEX_BYTE_OFFSET;
	public static final long BUFFER_BYTE_OFFSET;
	public static final long OFFSET_BYTE_OFFSET;
	public static final long SIZE_BYTE_OFFSET;

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
		    UNBOUNDED_ADDRESS.withName("buffer"),
		    JAVA_LONG.withName("offset"),
		    JAVA_LONG.withName("size")
		).withName("VkBufferMemoryBarrier2").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		SRC_STAGE_MASK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("srcStageMask"));
		SRC_ACCESS_MASK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("srcAccessMask"));
		DST_STAGE_MASK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("dstStageMask"));
		DST_ACCESS_MASK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("dstAccessMask"));
		SRC_QUEUE_FAMILY_INDEX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("srcQueueFamilyIndex"));
		DST_QUEUE_FAMILY_INDEX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("dstQueueFamilyIndex"));
		BUFFER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("buffer"));
		OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("offset"));
		SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("size"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		SRC_STAGE_MASK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("srcStageMask"));
		SRC_ACCESS_MASK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("srcAccessMask"));
		DST_STAGE_MASK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dstStageMask"));
		DST_ACCESS_MASK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dstAccessMask"));
		SRC_QUEUE_FAMILY_INDEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("srcQueueFamilyIndex"));
		DST_QUEUE_FAMILY_INDEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dstQueueFamilyIndex"));
		BUFFER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("buffer"));
		OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("offset"));
		SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("size"));
		//@formatter:on
	}

	public VkBufferMemoryBarrier2() {
	    this(Arena.ofAuto());
	}
	
	public VkBufferMemoryBarrier2(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkBufferMemoryBarrier2(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkBufferMemoryBarrier2 sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkBufferMemoryBarrier2 pNext(MemorySegment pNext) {
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
    public VkBufferMemoryBarrier2 srcStageMask(long srcStageMask) {
    	SRC_STAGE_MASK_HANDLE.set(segment, 0L, srcStageMask);
    	return this;
    }
    
    public long srcStageMask() {
    	return (long) SRC_STAGE_MASK_HANDLE.get(segment, 0L);
    }
    
    /// @see #srcAccessMask()
    public VkBufferMemoryBarrier2 srcAccessMask(long srcAccessMask) {
    	SRC_ACCESS_MASK_HANDLE.set(segment, 0L, srcAccessMask);
    	return this;
    }
    
    public long srcAccessMask() {
    	return (long) SRC_ACCESS_MASK_HANDLE.get(segment, 0L);
    }
    
    /// @see #dstStageMask()
    public VkBufferMemoryBarrier2 dstStageMask(long dstStageMask) {
    	DST_STAGE_MASK_HANDLE.set(segment, 0L, dstStageMask);
    	return this;
    }
    
    public long dstStageMask() {
    	return (long) DST_STAGE_MASK_HANDLE.get(segment, 0L);
    }
    
    /// @see #dstAccessMask()
    public VkBufferMemoryBarrier2 dstAccessMask(long dstAccessMask) {
    	DST_ACCESS_MASK_HANDLE.set(segment, 0L, dstAccessMask);
    	return this;
    }
    
    public long dstAccessMask() {
    	return (long) DST_ACCESS_MASK_HANDLE.get(segment, 0L);
    }
    
    /// @see #srcQueueFamilyIndex()
    public VkBufferMemoryBarrier2 srcQueueFamilyIndex(int srcQueueFamilyIndex) {
    	SRC_QUEUE_FAMILY_INDEX_HANDLE.set(segment, 0L, srcQueueFamilyIndex);
    	return this;
    }
    
    public int srcQueueFamilyIndex() {
    	return (int) SRC_QUEUE_FAMILY_INDEX_HANDLE.get(segment, 0L);
    }
    
    /// @see #dstQueueFamilyIndex()
    public VkBufferMemoryBarrier2 dstQueueFamilyIndex(int dstQueueFamilyIndex) {
    	DST_QUEUE_FAMILY_INDEX_HANDLE.set(segment, 0L, dstQueueFamilyIndex);
    	return this;
    }
    
    public int dstQueueFamilyIndex() {
    	return (int) DST_QUEUE_FAMILY_INDEX_HANDLE.get(segment, 0L);
    }
    
    /// @see #buffer()
    public VkBufferMemoryBarrier2 buffer(VkBuffer buffer) {
    	BUFFER_HANDLE.set(segment, 0L, buffer.memorySegment());
    	return this;
    }
    
    public @Nullable VkBuffer buffer() {
    	MemorySegment segment = (MemorySegment) BUFFER_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkBuffer(segment);
    }
    
    /// @see #offset()
    public VkBufferMemoryBarrier2 offset(long offset) {
    	OFFSET_HANDLE.set(segment, 0L, offset);
    	return this;
    }
    
    public long offset() {
    	return (long) OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #size()
    public VkBufferMemoryBarrier2 size(long size) {
    	SIZE_HANDLE.set(segment, 0L, size);
    	return this;
    }
    
    public long size() {
    	return (long) SIZE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkBufferMemoryBarrier2 set(VkBufferMemoryBarrier2 other) {
        return set(other.segment);
    }
    
    @Override
    public VkBufferMemoryBarrier2 set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkBufferMemoryBarrier2> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkBufferMemoryBarrier2> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkBufferMemoryBarrier2(segment),
            count
        );
    }
    
    public static NativeStructArray<VkBufferMemoryBarrier2> array(SegmentAllocator allocator, VkBufferMemoryBarrier2... structs) {
        NativeStructArray<VkBufferMemoryBarrier2> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkBufferMemoryBarrier2(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkBufferMemoryBarrier2> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkBufferMemoryBarrier2(segment)
        );
    }

}