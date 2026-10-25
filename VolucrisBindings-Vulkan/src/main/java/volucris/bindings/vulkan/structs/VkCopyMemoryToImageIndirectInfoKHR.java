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

public final class VkCopyMemoryToImageIndirectInfoKHR
		implements Struct<VkCopyMemoryToImageIndirectInfoKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle SRC_COPY_FLAGS_HANDLE;
	public static final VarHandle COPY_COUNT_HANDLE;
	public static final VarHandle DST_IMAGE_HANDLE;
	public static final VarHandle DST_IMAGE_LAYOUT_HANDLE;
	public static final VarHandle P_IMAGE_SUBRESOURCES_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long SRC_COPY_FLAGS_BYTE_OFFSET;
	public static final long COPY_COUNT_BYTE_OFFSET;
	public static final long COPY_ADDRESS_RANGE_BYTE_OFFSET;
	public static final long DST_IMAGE_BYTE_OFFSET;
	public static final long DST_IMAGE_LAYOUT_BYTE_OFFSET;
	public static final long P_IMAGE_SUBRESOURCES_BYTE_OFFSET;

	private final MemorySegment segment;

	private final VkStridedDeviceAddressRangeKHR copyAddressRange;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("srcCopyFlags"),
		    JAVA_INT.withName("copyCount"),
		    VkStridedDeviceAddressRangeKHR.LAYOUT.withName("copyAddressRange"),
		    UNBOUNDED_ADDRESS.withName("dstImage"),
		    JAVA_INT.withName("dstImageLayout"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pImageSubresources")
		).withName("VkCopyMemoryToImageIndirectInfoKHR").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		SRC_COPY_FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("srcCopyFlags"));
		COPY_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("copyCount"));
		DST_IMAGE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("dstImage"));
		DST_IMAGE_LAYOUT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("dstImageLayout"));
		P_IMAGE_SUBRESOURCES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pImageSubresources"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		SRC_COPY_FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("srcCopyFlags"));
		COPY_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("copyCount"));
		COPY_ADDRESS_RANGE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("copyAddressRange"));
		DST_IMAGE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dstImage"));
		DST_IMAGE_LAYOUT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dstImageLayout"));
		P_IMAGE_SUBRESOURCES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pImageSubresources"));
		//@formatter:on
	}

	public VkCopyMemoryToImageIndirectInfoKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkCopyMemoryToImageIndirectInfoKHR(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkCopyMemoryToImageIndirectInfoKHR(MemorySegment segment) {
	    this.segment = segment;
	
	    copyAddressRange = new VkStridedDeviceAddressRangeKHR(segment.asSlice(COPY_ADDRESS_RANGE_BYTE_OFFSET, VkStridedDeviceAddressRangeKHR.LAYOUT));
	}

    /// @see #sType()
    public VkCopyMemoryToImageIndirectInfoKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkCopyMemoryToImageIndirectInfoKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #srcCopyFlags()
    public VkCopyMemoryToImageIndirectInfoKHR srcCopyFlags(int srcCopyFlags) {
    	SRC_COPY_FLAGS_HANDLE.set(segment, 0L, srcCopyFlags);
    	return this;
    }
    
    public int srcCopyFlags() {
    	return (int) SRC_COPY_FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #copyCount()
    public VkCopyMemoryToImageIndirectInfoKHR copyCount(int copyCount) {
    	COPY_COUNT_HANDLE.set(segment, 0L, copyCount);
    	return this;
    }
    
    public int copyCount() {
    	return (int) COPY_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #copyAddressRange()
    public VkCopyMemoryToImageIndirectInfoKHR copyAddressRange(Consumer<VkStridedDeviceAddressRangeKHR> consumer) {
    	consumer.accept(copyAddressRange);
    	return this;
    }
    
    /// @see #copyAddressRange()
    public VkCopyMemoryToImageIndirectInfoKHR copyAddressRange(VkStridedDeviceAddressRangeKHR other) {
    	copyAddressRange.set(other);
    	return this;
    }
    
    public VkStridedDeviceAddressRangeKHR copyAddressRange() {
    	return copyAddressRange;
    }
    
    /// @see #dstImage()
    public VkCopyMemoryToImageIndirectInfoKHR dstImage(VkImage dstImage) {
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
    public VkCopyMemoryToImageIndirectInfoKHR dstImageLayout(int dstImageLayout) {
    	DST_IMAGE_LAYOUT_HANDLE.set(segment, 0L, dstImageLayout);
    	return this;
    }
    
    public int dstImageLayout() {
    	return (int) DST_IMAGE_LAYOUT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pImageSubresources()
    public VkCopyMemoryToImageIndirectInfoKHR pImageSubresources(NativeStructArray<VkImageSubresourceLayers> pImageSubresources) {
    	P_IMAGE_SUBRESOURCES_HANDLE.set(segment, 0L, pImageSubresources.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkImageSubresourceLayers> pImageSubresources() {
    	MemorySegment segment = (MemorySegment) P_IMAGE_SUBRESOURCES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkImageSubresourceLayers.array(segment);
    }
    
    @Override
    public VkCopyMemoryToImageIndirectInfoKHR set(VkCopyMemoryToImageIndirectInfoKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkCopyMemoryToImageIndirectInfoKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkCopyMemoryToImageIndirectInfoKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkCopyMemoryToImageIndirectInfoKHR> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkCopyMemoryToImageIndirectInfoKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkCopyMemoryToImageIndirectInfoKHR> array(SegmentAllocator allocator, VkCopyMemoryToImageIndirectInfoKHR... structs) {
        NativeStructArray<VkCopyMemoryToImageIndirectInfoKHR> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkCopyMemoryToImageIndirectInfoKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkCopyMemoryToImageIndirectInfoKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkCopyMemoryToImageIndirectInfoKHR(segment)
        );
    }

}