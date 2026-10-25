/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.util.function.Consumer;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;

public final class VkImageResolve
		implements Struct<VkImageResolve> {

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
		).withName("VkImageResolve").withByteAlignment(4);
		
		SRC_SUBRESOURCE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("srcSubresource"));
		SRC_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("srcOffset"));
		DST_SUBRESOURCE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dstSubresource"));
		DST_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dstOffset"));
		EXTENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("extent"));
		//@formatter:on
	}

	public VkImageResolve() {
	    this(Arena.ofAuto());
	}
	
	public VkImageResolve(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkImageResolve(MemorySegment segment) {
	    this.segment = segment;
	
	    srcSubresource = new VkImageSubresourceLayers(segment.asSlice(SRC_SUBRESOURCE_BYTE_OFFSET, VkImageSubresourceLayers.LAYOUT));
	    srcOffset = new VkOffset3D(segment.asSlice(SRC_OFFSET_BYTE_OFFSET, VkOffset3D.LAYOUT));
	    dstSubresource = new VkImageSubresourceLayers(segment.asSlice(DST_SUBRESOURCE_BYTE_OFFSET, VkImageSubresourceLayers.LAYOUT));
	    dstOffset = new VkOffset3D(segment.asSlice(DST_OFFSET_BYTE_OFFSET, VkOffset3D.LAYOUT));
	    extent = new VkExtent3D(segment.asSlice(EXTENT_BYTE_OFFSET, VkExtent3D.LAYOUT));
	}

    /// @see #srcSubresource()
    public VkImageResolve srcSubresource(Consumer<VkImageSubresourceLayers> consumer) {
    	consumer.accept(srcSubresource);
    	return this;
    }
    
    /// @see #srcSubresource()
    public VkImageResolve srcSubresource(VkImageSubresourceLayers other) {
    	srcSubresource.set(other);
    	return this;
    }
    
    public VkImageSubresourceLayers srcSubresource() {
    	return srcSubresource;
    }
    
    /// @see #srcOffset()
    public VkImageResolve srcOffset(Consumer<VkOffset3D> consumer) {
    	consumer.accept(srcOffset);
    	return this;
    }
    
    /// @see #srcOffset()
    public VkImageResolve srcOffset(VkOffset3D other) {
    	srcOffset.set(other);
    	return this;
    }
    
    public VkOffset3D srcOffset() {
    	return srcOffset;
    }
    
    /// @see #dstSubresource()
    public VkImageResolve dstSubresource(Consumer<VkImageSubresourceLayers> consumer) {
    	consumer.accept(dstSubresource);
    	return this;
    }
    
    /// @see #dstSubresource()
    public VkImageResolve dstSubresource(VkImageSubresourceLayers other) {
    	dstSubresource.set(other);
    	return this;
    }
    
    public VkImageSubresourceLayers dstSubresource() {
    	return dstSubresource;
    }
    
    /// @see #dstOffset()
    public VkImageResolve dstOffset(Consumer<VkOffset3D> consumer) {
    	consumer.accept(dstOffset);
    	return this;
    }
    
    /// @see #dstOffset()
    public VkImageResolve dstOffset(VkOffset3D other) {
    	dstOffset.set(other);
    	return this;
    }
    
    public VkOffset3D dstOffset() {
    	return dstOffset;
    }
    
    /// @see #extent()
    public VkImageResolve extent(Consumer<VkExtent3D> consumer) {
    	consumer.accept(extent);
    	return this;
    }
    
    /// @see #extent()
    public VkImageResolve extent(VkExtent3D other) {
    	extent.set(other);
    	return this;
    }
    
    public VkExtent3D extent() {
    	return extent;
    }
    
    @Override
    public VkImageResolve set(VkImageResolve other) {
        return set(other.segment);
    }
    
    @Override
    public VkImageResolve set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkImageResolve> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkImageResolve> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkImageResolve(segment),
            count
        );
    }
    
    public static NativeStructArray<VkImageResolve> array(SegmentAllocator allocator, VkImageResolve... structs) {
        NativeStructArray<VkImageResolve> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkImageResolve(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkImageResolve> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkImageResolve(segment)
        );
    }

}