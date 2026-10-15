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

public final class VkImageMemoryBarrier
		implements Struct<VkImageMemoryBarrier> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle SRC_ACCESS_MASK_HANDLE;
	public static final VarHandle DST_ACCESS_MASK_HANDLE;
	public static final VarHandle OLD_LAYOUT_HANDLE;
	public static final VarHandle NEW_LAYOUT_HANDLE;
	public static final VarHandle SRC_QUEUE_FAMILY_INDEX_HANDLE;
	public static final VarHandle DST_QUEUE_FAMILY_INDEX_HANDLE;
	public static final VarHandle IMAGE_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long SRC_ACCESS_MASK_BYTE_OFFSET;
	public static final long DST_ACCESS_MASK_BYTE_OFFSET;
	public static final long OLD_LAYOUT_BYTE_OFFSET;
	public static final long NEW_LAYOUT_BYTE_OFFSET;
	public static final long SRC_QUEUE_FAMILY_INDEX_BYTE_OFFSET;
	public static final long DST_QUEUE_FAMILY_INDEX_BYTE_OFFSET;
	public static final long IMAGE_BYTE_OFFSET;
	public static final long SUBRESOURCE_RANGE_BYTE_OFFSET;

	private final MemorySegment segment;

	private final VkImageSubresourceRange subresourceRange;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("srcAccessMask"),
		    JAVA_INT.withName("dstAccessMask"),
		    JAVA_INT.withName("oldLayout"),
		    JAVA_INT.withName("newLayout"),
		    JAVA_INT.withName("srcQueueFamilyIndex"),
		    JAVA_INT.withName("dstQueueFamilyIndex"),
		    UNBOUNDED_ADDRESS.withName("image"),
		    VkImageSubresourceRange.LAYOUT.withName("subresourceRange"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkImageMemoryBarrier").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		SRC_ACCESS_MASK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("srcAccessMask"));
		DST_ACCESS_MASK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("dstAccessMask"));
		OLD_LAYOUT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("oldLayout"));
		NEW_LAYOUT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("newLayout"));
		SRC_QUEUE_FAMILY_INDEX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("srcQueueFamilyIndex"));
		DST_QUEUE_FAMILY_INDEX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("dstQueueFamilyIndex"));
		IMAGE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("image"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		SRC_ACCESS_MASK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("srcAccessMask"));
		DST_ACCESS_MASK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dstAccessMask"));
		OLD_LAYOUT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("oldLayout"));
		NEW_LAYOUT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("newLayout"));
		SRC_QUEUE_FAMILY_INDEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("srcQueueFamilyIndex"));
		DST_QUEUE_FAMILY_INDEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dstQueueFamilyIndex"));
		IMAGE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("image"));
		SUBRESOURCE_RANGE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("subresourceRange"));
		//@formatter:on
	}

	public VkImageMemoryBarrier() {
	    this(Arena.ofAuto());
	}
	
	public VkImageMemoryBarrier(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkImageMemoryBarrier(MemorySegment segment) {
	    this.segment = segment;
	
	    subresourceRange = new VkImageSubresourceRange(segment.asSlice(SUBRESOURCE_RANGE_BYTE_OFFSET, VkImageSubresourceRange.LAYOUT));
	}

    /// @see #sType()
    public VkImageMemoryBarrier sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkImageMemoryBarrier pNext(MemorySegment pNext) {
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
    public VkImageMemoryBarrier srcAccessMask(int srcAccessMask) {
    	SRC_ACCESS_MASK_HANDLE.set(segment, 0L, srcAccessMask);
    	return this;
    }
    
    public int srcAccessMask() {
    	return (int) SRC_ACCESS_MASK_HANDLE.get(segment, 0L);
    }
    
    /// @see #dstAccessMask()
    public VkImageMemoryBarrier dstAccessMask(int dstAccessMask) {
    	DST_ACCESS_MASK_HANDLE.set(segment, 0L, dstAccessMask);
    	return this;
    }
    
    public int dstAccessMask() {
    	return (int) DST_ACCESS_MASK_HANDLE.get(segment, 0L);
    }
    
    /// @see #oldLayout()
    public VkImageMemoryBarrier oldLayout(int oldLayout) {
    	OLD_LAYOUT_HANDLE.set(segment, 0L, oldLayout);
    	return this;
    }
    
    public int oldLayout() {
    	return (int) OLD_LAYOUT_HANDLE.get(segment, 0L);
    }
    
    /// @see #newLayout()
    public VkImageMemoryBarrier newLayout(int newLayout) {
    	NEW_LAYOUT_HANDLE.set(segment, 0L, newLayout);
    	return this;
    }
    
    public int newLayout() {
    	return (int) NEW_LAYOUT_HANDLE.get(segment, 0L);
    }
    
    /// @see #srcQueueFamilyIndex()
    public VkImageMemoryBarrier srcQueueFamilyIndex(int srcQueueFamilyIndex) {
    	SRC_QUEUE_FAMILY_INDEX_HANDLE.set(segment, 0L, srcQueueFamilyIndex);
    	return this;
    }
    
    public int srcQueueFamilyIndex() {
    	return (int) SRC_QUEUE_FAMILY_INDEX_HANDLE.get(segment, 0L);
    }
    
    /// @see #dstQueueFamilyIndex()
    public VkImageMemoryBarrier dstQueueFamilyIndex(int dstQueueFamilyIndex) {
    	DST_QUEUE_FAMILY_INDEX_HANDLE.set(segment, 0L, dstQueueFamilyIndex);
    	return this;
    }
    
    public int dstQueueFamilyIndex() {
    	return (int) DST_QUEUE_FAMILY_INDEX_HANDLE.get(segment, 0L);
    }
    
    /// @see #image()
    public VkImageMemoryBarrier image(VkImage image) {
    	IMAGE_HANDLE.set(segment, 0L, image.memorySegment());
    	return this;
    }
    
    public @Nullable VkImage image() {
    	MemorySegment segment = (MemorySegment) IMAGE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkImage(segment);
    }
    
    /// @see #subresourceRange()
    public VkImageMemoryBarrier subresourceRange(Consumer<VkImageSubresourceRange> consumer) {
    	consumer.accept(subresourceRange);
    	return this;
    }
    
    /// @see #subresourceRange()
    public VkImageMemoryBarrier subresourceRange(VkImageSubresourceRange other) {
    	subresourceRange.set(other);
    	return this;
    }
    
    public VkImageSubresourceRange subresourceRange() {
    	return subresourceRange;
    }
    
    @Override
    public VkImageMemoryBarrier set(VkImageMemoryBarrier other) {
        return set(other.segment);
    }
    
    @Override
    public VkImageMemoryBarrier set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkImageMemoryBarrier> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkImageMemoryBarrier> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkImageMemoryBarrier(segment),
            count
        );
    }
    
    public static NativeStructArray<VkImageMemoryBarrier> array(Arena arena, VkImageMemoryBarrier... structs) {
        NativeStructArray<VkImageMemoryBarrier> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkImageMemoryBarrier(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkImageMemoryBarrier> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkImageMemoryBarrier(segment)
        );
    }

}