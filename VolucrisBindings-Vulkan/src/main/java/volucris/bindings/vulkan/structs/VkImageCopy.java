/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.util.function.Consumer;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;

public final class VkImageCopy
		implements Struct<VkImageCopy> {

	public static final StructLayout LAYOUT;

	public static final long SRC_SUBRESOURCE_BYTE_OFFSET;
	public static final long SRC_OFFSET_BYTE_OFFSET;
	public static final long DST_SUBRESOURCE_BYTE_OFFSET;
	public static final long DST_OFFSET_BYTE_OFFSET;
	public static final long EXTENT_BYTE_OFFSET;

	private final MemorySegment segment;

	private final VkImageSubresourceLayers srcSubresource;
	private final VkOffset3D srcOffset;
	private final VkImageSubresourceLayers dstSubresource;
	private final VkOffset3D dstOffset;
	private final VkExtent3D extent;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    VkImageSubresourceLayers.LAYOUT.withName("srcSubresource"),
		    VkOffset3D.LAYOUT.withName("srcOffset"),
		    VkImageSubresourceLayers.LAYOUT.withName("dstSubresource"),
		    VkOffset3D.LAYOUT.withName("dstOffset"),
		    VkExtent3D.LAYOUT.withName("extent")
		).withName("VkImageCopy").withByteAlignment(4);
		
		SRC_SUBRESOURCE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("srcSubresource"));
		SRC_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("srcOffset"));
		DST_SUBRESOURCE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dstSubresource"));
		DST_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dstOffset"));
		EXTENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("extent"));
		//@formatter:on
	}

	public VkImageCopy() {
	    this(Arena.ofAuto());
	}
	
	public VkImageCopy(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkImageCopy(MemorySegment segment) {
	    this.segment = segment;
	
	    srcSubresource = new VkImageSubresourceLayers(segment.asSlice(SRC_SUBRESOURCE_BYTE_OFFSET, VkImageSubresourceLayers.LAYOUT));
	    srcOffset = new VkOffset3D(segment.asSlice(SRC_OFFSET_BYTE_OFFSET, VkOffset3D.LAYOUT));
	    dstSubresource = new VkImageSubresourceLayers(segment.asSlice(DST_SUBRESOURCE_BYTE_OFFSET, VkImageSubresourceLayers.LAYOUT));
	    dstOffset = new VkOffset3D(segment.asSlice(DST_OFFSET_BYTE_OFFSET, VkOffset3D.LAYOUT));
	    extent = new VkExtent3D(segment.asSlice(EXTENT_BYTE_OFFSET, VkExtent3D.LAYOUT));
	}

    /// @see #srcSubresource()
    public VkImageCopy srcSubresource(Consumer<VkImageSubresourceLayers> consumer) {
    	consumer.accept(srcSubresource);
    	return this;
    }
    
    /// @see #srcSubresource()
    public VkImageCopy srcSubresource(VkImageSubresourceLayers other) {
    	srcSubresource.set(other);
    	return this;
    }
    
    public VkImageSubresourceLayers srcSubresource() {
    	return srcSubresource;
    }
    
    /// @see #srcOffset()
    public VkImageCopy srcOffset(Consumer<VkOffset3D> consumer) {
    	consumer.accept(srcOffset);
    	return this;
    }
    
    /// @see #srcOffset()
    public VkImageCopy srcOffset(VkOffset3D other) {
    	srcOffset.set(other);
    	return this;
    }
    
    public VkOffset3D srcOffset() {
    	return srcOffset;
    }
    
    /// @see #dstSubresource()
    public VkImageCopy dstSubresource(Consumer<VkImageSubresourceLayers> consumer) {
    	consumer.accept(dstSubresource);
    	return this;
    }
    
    /// @see #dstSubresource()
    public VkImageCopy dstSubresource(VkImageSubresourceLayers other) {
    	dstSubresource.set(other);
    	return this;
    }
    
    public VkImageSubresourceLayers dstSubresource() {
    	return dstSubresource;
    }
    
    /// @see #dstOffset()
    public VkImageCopy dstOffset(Consumer<VkOffset3D> consumer) {
    	consumer.accept(dstOffset);
    	return this;
    }
    
    /// @see #dstOffset()
    public VkImageCopy dstOffset(VkOffset3D other) {
    	dstOffset.set(other);
    	return this;
    }
    
    public VkOffset3D dstOffset() {
    	return dstOffset;
    }
    
    /// @see #extent()
    public VkImageCopy extent(Consumer<VkExtent3D> consumer) {
    	consumer.accept(extent);
    	return this;
    }
    
    /// @see #extent()
    public VkImageCopy extent(VkExtent3D other) {
    	extent.set(other);
    	return this;
    }
    
    public VkExtent3D extent() {
    	return extent;
    }
    
    @Override
    public VkImageCopy set(VkImageCopy other) {
        return set(other.segment);
    }
    
    @Override
    public VkImageCopy set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkImageCopy> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkImageCopy> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkImageCopy(segment),
            count
        );
    }
    
    public static NativeStructArray<VkImageCopy> array(Arena arena, VkImageCopy... structs) {
        NativeStructArray<VkImageCopy> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkImageCopy(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkImageCopy> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkImageCopy(segment)
        );
    }

}