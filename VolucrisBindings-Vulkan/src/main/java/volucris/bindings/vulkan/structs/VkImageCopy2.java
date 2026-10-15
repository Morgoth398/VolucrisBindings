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

public final class VkImageCopy2
		implements Struct<VkImageCopy2> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
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
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    VkImageSubresourceLayers.LAYOUT.withName("srcSubresource"),
		    VkOffset3D.LAYOUT.withName("srcOffset"),
		    VkImageSubresourceLayers.LAYOUT.withName("dstSubresource"),
		    VkOffset3D.LAYOUT.withName("dstOffset"),
		    VkExtent3D.LAYOUT.withName("extent"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkImageCopy2").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		SRC_SUBRESOURCE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("srcSubresource"));
		SRC_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("srcOffset"));
		DST_SUBRESOURCE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dstSubresource"));
		DST_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dstOffset"));
		EXTENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("extent"));
		//@formatter:on
	}

	public VkImageCopy2() {
	    this(Arena.ofAuto());
	}
	
	public VkImageCopy2(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkImageCopy2(MemorySegment segment) {
	    this.segment = segment;
	
	    srcSubresource = new VkImageSubresourceLayers(segment.asSlice(SRC_SUBRESOURCE_BYTE_OFFSET, VkImageSubresourceLayers.LAYOUT));
	    srcOffset = new VkOffset3D(segment.asSlice(SRC_OFFSET_BYTE_OFFSET, VkOffset3D.LAYOUT));
	    dstSubresource = new VkImageSubresourceLayers(segment.asSlice(DST_SUBRESOURCE_BYTE_OFFSET, VkImageSubresourceLayers.LAYOUT));
	    dstOffset = new VkOffset3D(segment.asSlice(DST_OFFSET_BYTE_OFFSET, VkOffset3D.LAYOUT));
	    extent = new VkExtent3D(segment.asSlice(EXTENT_BYTE_OFFSET, VkExtent3D.LAYOUT));
	}

    /// @see #sType()
    public VkImageCopy2 sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkImageCopy2 pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #srcSubresource()
    public VkImageCopy2 srcSubresource(Consumer<VkImageSubresourceLayers> consumer) {
    	consumer.accept(srcSubresource);
    	return this;
    }
    
    /// @see #srcSubresource()
    public VkImageCopy2 srcSubresource(VkImageSubresourceLayers other) {
    	srcSubresource.set(other);
    	return this;
    }
    
    public VkImageSubresourceLayers srcSubresource() {
    	return srcSubresource;
    }
    
    /// @see #srcOffset()
    public VkImageCopy2 srcOffset(Consumer<VkOffset3D> consumer) {
    	consumer.accept(srcOffset);
    	return this;
    }
    
    /// @see #srcOffset()
    public VkImageCopy2 srcOffset(VkOffset3D other) {
    	srcOffset.set(other);
    	return this;
    }
    
    public VkOffset3D srcOffset() {
    	return srcOffset;
    }
    
    /// @see #dstSubresource()
    public VkImageCopy2 dstSubresource(Consumer<VkImageSubresourceLayers> consumer) {
    	consumer.accept(dstSubresource);
    	return this;
    }
    
    /// @see #dstSubresource()
    public VkImageCopy2 dstSubresource(VkImageSubresourceLayers other) {
    	dstSubresource.set(other);
    	return this;
    }
    
    public VkImageSubresourceLayers dstSubresource() {
    	return dstSubresource;
    }
    
    /// @see #dstOffset()
    public VkImageCopy2 dstOffset(Consumer<VkOffset3D> consumer) {
    	consumer.accept(dstOffset);
    	return this;
    }
    
    /// @see #dstOffset()
    public VkImageCopy2 dstOffset(VkOffset3D other) {
    	dstOffset.set(other);
    	return this;
    }
    
    public VkOffset3D dstOffset() {
    	return dstOffset;
    }
    
    /// @see #extent()
    public VkImageCopy2 extent(Consumer<VkExtent3D> consumer) {
    	consumer.accept(extent);
    	return this;
    }
    
    /// @see #extent()
    public VkImageCopy2 extent(VkExtent3D other) {
    	extent.set(other);
    	return this;
    }
    
    public VkExtent3D extent() {
    	return extent;
    }
    
    @Override
    public VkImageCopy2 set(VkImageCopy2 other) {
        return set(other.segment);
    }
    
    @Override
    public VkImageCopy2 set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkImageCopy2> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkImageCopy2> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkImageCopy2(segment),
            count
        );
    }
    
    public static NativeStructArray<VkImageCopy2> array(Arena arena, VkImageCopy2... structs) {
        NativeStructArray<VkImageCopy2> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkImageCopy2(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkImageCopy2> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkImageCopy2(segment)
        );
    }

}