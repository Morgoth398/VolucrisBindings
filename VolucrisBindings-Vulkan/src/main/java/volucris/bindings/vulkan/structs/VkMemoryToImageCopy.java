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

public final class VkMemoryToImageCopy
		implements Struct<VkMemoryToImageCopy> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle P_HOST_POINTER_HANDLE;
	public static final VarHandle MEMORY_ROW_LENGTH_HANDLE;
	public static final VarHandle MEMORY_IMAGE_HEIGHT_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long P_HOST_POINTER_BYTE_OFFSET;
	public static final long MEMORY_ROW_LENGTH_BYTE_OFFSET;
	public static final long MEMORY_IMAGE_HEIGHT_BYTE_OFFSET;
	public static final long IMAGE_SUBRESOURCE_BYTE_OFFSET;
	public static final long IMAGE_OFFSET_BYTE_OFFSET;
	public static final long IMAGE_EXTENT_BYTE_OFFSET;

	private final MemorySegment segment;

	private final VkImageSubresourceLayers imageSubresource;
	private final VkOffset3D imageOffset;
	private final VkExtent3D imageExtent;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    UNBOUNDED_ADDRESS.withName("pHostPointer"),
		    JAVA_INT.withName("memoryRowLength"),
		    JAVA_INT.withName("memoryImageHeight"),
		    VkImageSubresourceLayers.LAYOUT.withName("imageSubresource"),
		    VkOffset3D.LAYOUT.withName("imageOffset"),
		    VkExtent3D.LAYOUT.withName("imageExtent")
		).withName("VkMemoryToImageCopy").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		P_HOST_POINTER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pHostPointer"));
		MEMORY_ROW_LENGTH_HANDLE = LAYOUT.varHandle(PathElement.groupElement("memoryRowLength"));
		MEMORY_IMAGE_HEIGHT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("memoryImageHeight"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		P_HOST_POINTER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pHostPointer"));
		MEMORY_ROW_LENGTH_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("memoryRowLength"));
		MEMORY_IMAGE_HEIGHT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("memoryImageHeight"));
		IMAGE_SUBRESOURCE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("imageSubresource"));
		IMAGE_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("imageOffset"));
		IMAGE_EXTENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("imageExtent"));
		//@formatter:on
	}

	public VkMemoryToImageCopy() {
	    this(Arena.ofAuto());
	}
	
	public VkMemoryToImageCopy(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkMemoryToImageCopy(MemorySegment segment) {
	    this.segment = segment;
	
	    imageSubresource = new VkImageSubresourceLayers(segment.asSlice(IMAGE_SUBRESOURCE_BYTE_OFFSET, VkImageSubresourceLayers.LAYOUT));
	    imageOffset = new VkOffset3D(segment.asSlice(IMAGE_OFFSET_BYTE_OFFSET, VkOffset3D.LAYOUT));
	    imageExtent = new VkExtent3D(segment.asSlice(IMAGE_EXTENT_BYTE_OFFSET, VkExtent3D.LAYOUT));
	}

    /// @see #sType()
    public VkMemoryToImageCopy sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkMemoryToImageCopy pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #pHostPointer()
    public VkMemoryToImageCopy pHostPointer(MemorySegment pHostPointer) {
    	P_HOST_POINTER_HANDLE.set(segment, 0L, pHostPointer);
    	return this;
    }
    
    public @Nullable MemorySegment pHostPointer() {
    	MemorySegment segment = (MemorySegment) P_HOST_POINTER_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #memoryRowLength()
    public VkMemoryToImageCopy memoryRowLength(int memoryRowLength) {
    	MEMORY_ROW_LENGTH_HANDLE.set(segment, 0L, memoryRowLength);
    	return this;
    }
    
    public int memoryRowLength() {
    	return (int) MEMORY_ROW_LENGTH_HANDLE.get(segment, 0L);
    }
    
    /// @see #memoryImageHeight()
    public VkMemoryToImageCopy memoryImageHeight(int memoryImageHeight) {
    	MEMORY_IMAGE_HEIGHT_HANDLE.set(segment, 0L, memoryImageHeight);
    	return this;
    }
    
    public int memoryImageHeight() {
    	return (int) MEMORY_IMAGE_HEIGHT_HANDLE.get(segment, 0L);
    }
    
    /// @see #imageSubresource()
    public VkMemoryToImageCopy imageSubresource(Consumer<VkImageSubresourceLayers> consumer) {
    	consumer.accept(imageSubresource);
    	return this;
    }
    
    /// @see #imageSubresource()
    public VkMemoryToImageCopy imageSubresource(VkImageSubresourceLayers other) {
    	imageSubresource.set(other);
    	return this;
    }
    
    public VkImageSubresourceLayers imageSubresource() {
    	return imageSubresource;
    }
    
    /// @see #imageOffset()
    public VkMemoryToImageCopy imageOffset(Consumer<VkOffset3D> consumer) {
    	consumer.accept(imageOffset);
    	return this;
    }
    
    /// @see #imageOffset()
    public VkMemoryToImageCopy imageOffset(VkOffset3D other) {
    	imageOffset.set(other);
    	return this;
    }
    
    public VkOffset3D imageOffset() {
    	return imageOffset;
    }
    
    /// @see #imageExtent()
    public VkMemoryToImageCopy imageExtent(Consumer<VkExtent3D> consumer) {
    	consumer.accept(imageExtent);
    	return this;
    }
    
    /// @see #imageExtent()
    public VkMemoryToImageCopy imageExtent(VkExtent3D other) {
    	imageExtent.set(other);
    	return this;
    }
    
    public VkExtent3D imageExtent() {
    	return imageExtent;
    }
    
    @Override
    public VkMemoryToImageCopy set(VkMemoryToImageCopy other) {
        return set(other.segment);
    }
    
    @Override
    public VkMemoryToImageCopy set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkMemoryToImageCopy> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkMemoryToImageCopy> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkMemoryToImageCopy(segment),
            count
        );
    }
    
    public static NativeStructArray<VkMemoryToImageCopy> array(SegmentAllocator allocator, VkMemoryToImageCopy... structs) {
        NativeStructArray<VkMemoryToImageCopy> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkMemoryToImageCopy(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkMemoryToImageCopy> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkMemoryToImageCopy(segment)
        );
    }

}