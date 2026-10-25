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

public final class VkCopyBufferToImageInfo2
		implements Struct<VkCopyBufferToImageInfo2> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle SRC_BUFFER_HANDLE;
	public static final VarHandle DST_IMAGE_HANDLE;
	public static final VarHandle DST_IMAGE_LAYOUT_HANDLE;
	public static final VarHandle REGION_COUNT_HANDLE;
	public static final VarHandle P_REGIONS_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long SRC_BUFFER_BYTE_OFFSET;
	public static final long DST_IMAGE_BYTE_OFFSET;
	public static final long DST_IMAGE_LAYOUT_BYTE_OFFSET;
	public static final long REGION_COUNT_BYTE_OFFSET;
	public static final long P_REGIONS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    UNBOUNDED_ADDRESS.withName("srcBuffer"),
		    UNBOUNDED_ADDRESS.withName("dstImage"),
		    JAVA_INT.withName("dstImageLayout"),
		    JAVA_INT.withName("regionCount"),
		    UNBOUNDED_ADDRESS.withName("pRegions")
		).withName("VkCopyBufferToImageInfo2").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		SRC_BUFFER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("srcBuffer"));
		DST_IMAGE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("dstImage"));
		DST_IMAGE_LAYOUT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("dstImageLayout"));
		REGION_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("regionCount"));
		P_REGIONS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pRegions"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		SRC_BUFFER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("srcBuffer"));
		DST_IMAGE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dstImage"));
		DST_IMAGE_LAYOUT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dstImageLayout"));
		REGION_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("regionCount"));
		P_REGIONS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pRegions"));
		//@formatter:on
	}

	public VkCopyBufferToImageInfo2() {
	    this(Arena.ofAuto());
	}
	
	public VkCopyBufferToImageInfo2(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkCopyBufferToImageInfo2(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkCopyBufferToImageInfo2 sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkCopyBufferToImageInfo2 pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #srcBuffer()
    public VkCopyBufferToImageInfo2 srcBuffer(VkBuffer srcBuffer) {
    	SRC_BUFFER_HANDLE.set(segment, 0L, srcBuffer.memorySegment());
    	return this;
    }
    
    public @Nullable VkBuffer srcBuffer() {
    	MemorySegment segment = (MemorySegment) SRC_BUFFER_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkBuffer(segment);
    }
    
    /// @see #dstImage()
    public VkCopyBufferToImageInfo2 dstImage(VkImage dstImage) {
    	DST_IMAGE_HANDLE.set(segment, 0L, dstImage.memorySegment());
    	return this;
    }
    
    public @Nullable VkImage dstImage() {
    	MemorySegment segment = (MemorySegment) DST_IMAGE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkImage(segment);
    }
    
    /// @see #dstImageLayout()
    public VkCopyBufferToImageInfo2 dstImageLayout(int dstImageLayout) {
    	DST_IMAGE_LAYOUT_HANDLE.set(segment, 0L, dstImageLayout);
    	return this;
    }
    
    public int dstImageLayout() {
    	return (int) DST_IMAGE_LAYOUT_HANDLE.get(segment, 0L);
    }
    
    /// @see #regionCount()
    public VkCopyBufferToImageInfo2 regionCount(int regionCount) {
    	REGION_COUNT_HANDLE.set(segment, 0L, regionCount);
    	return this;
    }
    
    public int regionCount() {
    	return (int) REGION_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pRegions()
    public VkCopyBufferToImageInfo2 pRegions(NativeStructArray<VkBufferImageCopy2> pRegions) {
    	P_REGIONS_HANDLE.set(segment, 0L, pRegions.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkBufferImageCopy2> pRegions() {
    	MemorySegment segment = (MemorySegment) P_REGIONS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkBufferImageCopy2.array(segment);
    }
    
    @Override
    public VkCopyBufferToImageInfo2 set(VkCopyBufferToImageInfo2 other) {
        return set(other.segment);
    }
    
    @Override
    public VkCopyBufferToImageInfo2 set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkCopyBufferToImageInfo2> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkCopyBufferToImageInfo2> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkCopyBufferToImageInfo2(segment),
            count
        );
    }
    
    public static NativeStructArray<VkCopyBufferToImageInfo2> array(SegmentAllocator allocator, VkCopyBufferToImageInfo2... structs) {
        NativeStructArray<VkCopyBufferToImageInfo2> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkCopyBufferToImageInfo2(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkCopyBufferToImageInfo2> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkCopyBufferToImageInfo2(segment)
        );
    }

}