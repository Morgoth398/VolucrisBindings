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

public final class VkBufferMemoryBarrier
		implements Struct<VkBufferMemoryBarrier> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle SRC_ACCESS_MASK_HANDLE;
	public static final VarHandle DST_ACCESS_MASK_HANDLE;
	public static final VarHandle SRC_QUEUE_FAMILY_INDEX_HANDLE;
	public static final VarHandle DST_QUEUE_FAMILY_INDEX_HANDLE;
	public static final VarHandle BUFFER_HANDLE;
	public static final VarHandle OFFSET_HANDLE;
	public static final VarHandle SIZE_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long SRC_ACCESS_MASK_BYTE_OFFSET;
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
		    JAVA_INT.withName("srcAccessMask"),
		    JAVA_INT.withName("dstAccessMask"),
		    JAVA_INT.withName("srcQueueFamilyIndex"),
		    JAVA_INT.withName("dstQueueFamilyIndex"),
		    UNBOUNDED_ADDRESS.withName("buffer"),
		    JAVA_LONG.withName("offset"),
		    JAVA_LONG.withName("size")
		).withName("VkBufferMemoryBarrier").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		SRC_ACCESS_MASK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("srcAccessMask"));
		DST_ACCESS_MASK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("dstAccessMask"));
		SRC_QUEUE_FAMILY_INDEX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("srcQueueFamilyIndex"));
		DST_QUEUE_FAMILY_INDEX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("dstQueueFamilyIndex"));
		BUFFER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("buffer"));
		OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("offset"));
		SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("size"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		SRC_ACCESS_MASK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("srcAccessMask"));
		DST_ACCESS_MASK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dstAccessMask"));
		SRC_QUEUE_FAMILY_INDEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("srcQueueFamilyIndex"));
		DST_QUEUE_FAMILY_INDEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dstQueueFamilyIndex"));
		BUFFER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("buffer"));
		OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("offset"));
		SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("size"));
		//@formatter:on
	}

	public VkBufferMemoryBarrier() {
	    this(Arena.ofAuto());
	}
	
	public VkBufferMemoryBarrier(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkBufferMemoryBarrier(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkBufferMemoryBarrier sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkBufferMemoryBarrier pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #srcAccessMask()
    public VkBufferMemoryBarrier srcAccessMask(int srcAccessMask) {
    	SRC_ACCESS_MASK_HANDLE.set(segment, 0L, srcAccessMask);
    	return this;
    }
    
    public int srcAccessMask() {
    	return (int) SRC_ACCESS_MASK_HANDLE.get(segment, 0L);
    }
    
    /// @see #dstAccessMask()
    public VkBufferMemoryBarrier dstAccessMask(int dstAccessMask) {
    	DST_ACCESS_MASK_HANDLE.set(segment, 0L, dstAccessMask);
    	return this;
    }
    
    public int dstAccessMask() {
    	return (int) DST_ACCESS_MASK_HANDLE.get(segment, 0L);
    }
    
    /// @see #srcQueueFamilyIndex()
    public VkBufferMemoryBarrier srcQueueFamilyIndex(int srcQueueFamilyIndex) {
    	SRC_QUEUE_FAMILY_INDEX_HANDLE.set(segment, 0L, srcQueueFamilyIndex);
    	return this;
    }
    
    public int srcQueueFamilyIndex() {
    	return (int) SRC_QUEUE_FAMILY_INDEX_HANDLE.get(segment, 0L);
    }
    
    /// @see #dstQueueFamilyIndex()
    public VkBufferMemoryBarrier dstQueueFamilyIndex(int dstQueueFamilyIndex) {
    	DST_QUEUE_FAMILY_INDEX_HANDLE.set(segment, 0L, dstQueueFamilyIndex);
    	return this;
    }
    
    public int dstQueueFamilyIndex() {
    	return (int) DST_QUEUE_FAMILY_INDEX_HANDLE.get(segment, 0L);
    }
    
    /// @see #buffer()
    public VkBufferMemoryBarrier buffer(VkBuffer buffer) {
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
    public VkBufferMemoryBarrier offset(long offset) {
    	OFFSET_HANDLE.set(segment, 0L, offset);
    	return this;
    }
    
    public long offset() {
    	return (long) OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #size()
    public VkBufferMemoryBarrier size(long size) {
    	SIZE_HANDLE.set(segment, 0L, size);
    	return this;
    }
    
    public long size() {
    	return (long) SIZE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkBufferMemoryBarrier set(VkBufferMemoryBarrier other) {
        return set(other.segment);
    }
    
    @Override
    public VkBufferMemoryBarrier set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkBufferMemoryBarrier> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkBufferMemoryBarrier> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkBufferMemoryBarrier(segment),
            count
        );
    }
    
    public static NativeStructArray<VkBufferMemoryBarrier> array(SegmentAllocator allocator, VkBufferMemoryBarrier... structs) {
        NativeStructArray<VkBufferMemoryBarrier> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkBufferMemoryBarrier(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkBufferMemoryBarrier> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkBufferMemoryBarrier(segment)
        );
    }

}