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
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;

public final class VkBufferImageCopy
		implements Struct<VkBufferImageCopy> {

    public static final StructLayout LAYOUT;

    public static final VarHandle BUFFER_OFFSET_HANDLE;
    public static final VarHandle BUFFER_ROW_LENGTH_HANDLE;
    public static final VarHandle BUFFER_IMAGE_HEIGHT_HANDLE;

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
            JAVA_LONG.withName("bufferOffset"),
            JAVA_INT.withName("bufferRowLength"),
            JAVA_INT.withName("bufferImageHeight"),
            VkImageSubresourceLayers.LAYOUT.withName("imageSubresource"),
            VkOffset3D.LAYOUT.withName("imageOffset"),
            VkExtent3D.LAYOUT.withName("imageExtent")
        ).withName("VkBufferImageCopy").withByteAlignment(8);
        
        BUFFER_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("bufferOffset"));
        BUFFER_ROW_LENGTH_HANDLE = LAYOUT.varHandle(PathElement.groupElement("bufferRowLength"));
        BUFFER_IMAGE_HEIGHT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("bufferImageHeight"));
        
        BUFFER_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("bufferOffset"));
        BUFFER_ROW_LENGTH_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("bufferRowLength"));
        BUFFER_IMAGE_HEIGHT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("bufferImageHeight"));
        IMAGE_SUBRESOURCE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("imageSubresource"));
        IMAGE_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("imageOffset"));
        IMAGE_EXTENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("imageExtent"));
        //@formatter:on
    }

    public VkBufferImageCopy() {
        this(Arena.ofAuto());
    }
    
    public VkBufferImageCopy(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkBufferImageCopy(MemorySegment segment) {
        this.segment = segment;
    
        imageSubresource = new VkImageSubresourceLayers(segment.asSlice(IMAGE_SUBRESOURCE_BYTE_OFFSET, VkImageSubresourceLayers.LAYOUT));
        imageOffset = new VkOffset3D(segment.asSlice(IMAGE_OFFSET_BYTE_OFFSET, VkOffset3D.LAYOUT));
        imageExtent = new VkExtent3D(segment.asSlice(IMAGE_EXTENT_BYTE_OFFSET, VkExtent3D.LAYOUT));
    }

    /// @see #bufferOffset()
    public VkBufferImageCopy bufferOffset(long bufferOffset) {
    	BUFFER_OFFSET_HANDLE.set(segment, 0L, bufferOffset);
    	return this;
    }
    
    public long bufferOffset() {
    	return (long) BUFFER_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #bufferRowLength()
    public VkBufferImageCopy bufferRowLength(int bufferRowLength) {
    	BUFFER_ROW_LENGTH_HANDLE.set(segment, 0L, bufferRowLength);
    	return this;
    }
    
    public int bufferRowLength() {
    	return (int) BUFFER_ROW_LENGTH_HANDLE.get(segment, 0L);
    }
    
    /// @see #bufferImageHeight()
    public VkBufferImageCopy bufferImageHeight(int bufferImageHeight) {
    	BUFFER_IMAGE_HEIGHT_HANDLE.set(segment, 0L, bufferImageHeight);
    	return this;
    }
    
    public int bufferImageHeight() {
    	return (int) BUFFER_IMAGE_HEIGHT_HANDLE.get(segment, 0L);
    }
    
    /// @see #imageSubresource()
    public VkBufferImageCopy imageSubresource(Consumer<VkImageSubresourceLayers> consumer) {
    	consumer.accept(imageSubresource);
    	return this;
    }
    
    /// @see #imageSubresource()
    public VkBufferImageCopy imageSubresource(VkImageSubresourceLayers other) {
    	imageSubresource.set(other);
    	return this;
    }
    
    public VkImageSubresourceLayers imageSubresource() {
    	return imageSubresource;
    }
    
    /// @see #imageOffset()
    public VkBufferImageCopy imageOffset(Consumer<VkOffset3D> consumer) {
    	consumer.accept(imageOffset);
    	return this;
    }
    
    /// @see #imageOffset()
    public VkBufferImageCopy imageOffset(VkOffset3D other) {
    	imageOffset.set(other);
    	return this;
    }
    
    public VkOffset3D imageOffset() {
    	return imageOffset;
    }
    
    /// @see #imageExtent()
    public VkBufferImageCopy imageExtent(Consumer<VkExtent3D> consumer) {
    	consumer.accept(imageExtent);
    	return this;
    }
    
    /// @see #imageExtent()
    public VkBufferImageCopy imageExtent(VkExtent3D other) {
    	imageExtent.set(other);
    	return this;
    }
    
    public VkExtent3D imageExtent() {
    	return imageExtent;
    }
    
    @Override
    public VkBufferImageCopy set(VkBufferImageCopy other) {
        return set(other.segment);
    }
    
    @Override
    public VkBufferImageCopy set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkBufferImageCopy> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkBufferImageCopy> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkBufferImageCopy(segment),
            count
        );
    }
    
    public static NativeStructArray<VkBufferImageCopy> array(Arena arena, VkBufferImageCopy... structs) {
        NativeStructArray<VkBufferImageCopy> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkBufferImageCopy(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkBufferImageCopy> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkBufferImageCopy(segment)
        );
    }
    
}