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

public final class VkBufferImageCopy2
		implements Struct<VkBufferImageCopy2> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle BUFFER_OFFSET_HANDLE;
	public static final VarHandle BUFFER_ROW_LENGTH_HANDLE;
	public static final VarHandle BUFFER_IMAGE_HEIGHT_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long BUFFER_OFFSET_BYTE_OFFSET;
	public static final long BUFFER_ROW_LENGTH_BYTE_OFFSET;
	public static final long BUFFER_IMAGE_HEIGHT_BYTE_OFFSET;
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
		    JAVA_LONG.withName("bufferOffset"),
		    JAVA_INT.withName("bufferRowLength"),
		    JAVA_INT.withName("bufferImageHeight"),
		    VkImageSubresourceLayers.LAYOUT.withName("imageSubresource"),
		    VkOffset3D.LAYOUT.withName("imageOffset"),
		    VkExtent3D.LAYOUT.withName("imageExtent")
		).withName("VkBufferImageCopy2").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		BUFFER_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("bufferOffset"));
		BUFFER_ROW_LENGTH_HANDLE = LAYOUT.varHandle(PathElement.groupElement("bufferRowLength"));
		BUFFER_IMAGE_HEIGHT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("bufferImageHeight"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		BUFFER_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("bufferOffset"));
		BUFFER_ROW_LENGTH_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("bufferRowLength"));
		BUFFER_IMAGE_HEIGHT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("bufferImageHeight"));
		IMAGE_SUBRESOURCE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("imageSubresource"));
		IMAGE_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("imageOffset"));
		IMAGE_EXTENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("imageExtent"));
		//@formatter:on
	}

	public VkBufferImageCopy2() {
	    this(Arena.ofAuto());
	}
	
	public VkBufferImageCopy2(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkBufferImageCopy2(MemorySegment segment) {
	    this.segment = segment;
	
	    imageSubresource = new VkImageSubresourceLayers(segment.asSlice(IMAGE_SUBRESOURCE_BYTE_OFFSET, VkImageSubresourceLayers.LAYOUT));
	    imageOffset = new VkOffset3D(segment.asSlice(IMAGE_OFFSET_BYTE_OFFSET, VkOffset3D.LAYOUT));
	    imageExtent = new VkExtent3D(segment.asSlice(IMAGE_EXTENT_BYTE_OFFSET, VkExtent3D.LAYOUT));
	}

    /// @see #sType()
    public VkBufferImageCopy2 sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkBufferImageCopy2 pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #bufferOffset()
    public VkBufferImageCopy2 bufferOffset(long bufferOffset) {
    	BUFFER_OFFSET_HANDLE.set(segment, 0L, bufferOffset);
    	return this;
    }
    
    public long bufferOffset() {
    	return (long) BUFFER_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #bufferRowLength()
    public VkBufferImageCopy2 bufferRowLength(int bufferRowLength) {
    	BUFFER_ROW_LENGTH_HANDLE.set(segment, 0L, bufferRowLength);
    	return this;
    }
    
    public int bufferRowLength() {
    	return (int) BUFFER_ROW_LENGTH_HANDLE.get(segment, 0L);
    }
    
    /// @see #bufferImageHeight()
    public VkBufferImageCopy2 bufferImageHeight(int bufferImageHeight) {
    	BUFFER_IMAGE_HEIGHT_HANDLE.set(segment, 0L, bufferImageHeight);
    	return this;
    }
    
    public int bufferImageHeight() {
    	return (int) BUFFER_IMAGE_HEIGHT_HANDLE.get(segment, 0L);
    }
    
    /// @see #imageSubresource()
    public VkBufferImageCopy2 imageSubresource(Consumer<VkImageSubresourceLayers> consumer) {
    	consumer.accept(imageSubresource);
    	return this;
    }
    
    /// @see #imageSubresource()
    public VkBufferImageCopy2 imageSubresource(VkImageSubresourceLayers other) {
    	imageSubresource.set(other);
    	return this;
    }
    
    public VkImageSubresourceLayers imageSubresource() {
    	return imageSubresource;
    }
    
    /// @see #imageOffset()
    public VkBufferImageCopy2 imageOffset(Consumer<VkOffset3D> consumer) {
    	consumer.accept(imageOffset);
    	return this;
    }
    
    /// @see #imageOffset()
    public VkBufferImageCopy2 imageOffset(VkOffset3D other) {
    	imageOffset.set(other);
    	return this;
    }
    
    public VkOffset3D imageOffset() {
    	return imageOffset;
    }
    
    /// @see #imageExtent()
    public VkBufferImageCopy2 imageExtent(Consumer<VkExtent3D> consumer) {
    	consumer.accept(imageExtent);
    	return this;
    }
    
    /// @see #imageExtent()
    public VkBufferImageCopy2 imageExtent(VkExtent3D other) {
    	imageExtent.set(other);
    	return this;
    }
    
    public VkExtent3D imageExtent() {
    	return imageExtent;
    }
    
    @Override
    public VkBufferImageCopy2 set(VkBufferImageCopy2 other) {
        return set(other.segment);
    }
    
    @Override
    public VkBufferImageCopy2 set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkBufferImageCopy2> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkBufferImageCopy2> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkBufferImageCopy2(segment),
            count
        );
    }
    
    public static NativeStructArray<VkBufferImageCopy2> array(Arena arena, VkBufferImageCopy2... structs) {
        NativeStructArray<VkBufferImageCopy2> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkBufferImageCopy2(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkBufferImageCopy2> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkBufferImageCopy2(segment)
        );
    }

}