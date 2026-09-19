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

public final class VkDeviceMemoryImageCopyKHR
		implements Struct<VkDeviceMemoryImageCopyKHR> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle ADDRESS_FLAGS_HANDLE;
    public static final VarHandle ADDRESS_ROW_LENGTH_HANDLE;
    public static final VarHandle ADDRESS_IMAGE_HEIGHT_HANDLE;
    public static final VarHandle IMAGE_LAYOUT_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long ADDRESS_RANGE_BYTE_OFFSET;
    public static final long ADDRESS_FLAGS_BYTE_OFFSET;
    public static final long ADDRESS_ROW_LENGTH_BYTE_OFFSET;
    public static final long ADDRESS_IMAGE_HEIGHT_BYTE_OFFSET;
    public static final long IMAGE_SUBRESOURCE_BYTE_OFFSET;
    public static final long IMAGE_LAYOUT_BYTE_OFFSET;
    public static final long IMAGE_OFFSET_BYTE_OFFSET;
    public static final long IMAGE_EXTENT_BYTE_OFFSET;

    private final MemorySegment segment;

    private final VkDeviceAddressRangeKHR addressRange;
    private final VkImageSubresourceLayers imageSubresource;
    private final VkOffset3D imageOffset;
    private final VkExtent3D imageExtent;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            VkDeviceAddressRangeKHR.LAYOUT.withName("addressRange"),
            JAVA_INT.withName("addressFlags"),
            JAVA_INT.withName("addressRowLength"),
            JAVA_INT.withName("addressImageHeight"),
            VkImageSubresourceLayers.LAYOUT.withName("imageSubresource"),
            JAVA_INT.withName("imageLayout"),
            VkOffset3D.LAYOUT.withName("imageOffset"),
            VkExtent3D.LAYOUT.withName("imageExtent")
        ).withName("VkDeviceMemoryImageCopyKHR").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        ADDRESS_FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("addressFlags"));
        ADDRESS_ROW_LENGTH_HANDLE = LAYOUT.varHandle(PathElement.groupElement("addressRowLength"));
        ADDRESS_IMAGE_HEIGHT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("addressImageHeight"));
        IMAGE_LAYOUT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("imageLayout"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        ADDRESS_RANGE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("addressRange"));
        ADDRESS_FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("addressFlags"));
        ADDRESS_ROW_LENGTH_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("addressRowLength"));
        ADDRESS_IMAGE_HEIGHT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("addressImageHeight"));
        IMAGE_SUBRESOURCE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("imageSubresource"));
        IMAGE_LAYOUT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("imageLayout"));
        IMAGE_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("imageOffset"));
        IMAGE_EXTENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("imageExtent"));
        //@formatter:on
    }

    public VkDeviceMemoryImageCopyKHR() {
        this(Arena.ofAuto());
    }
    
    public VkDeviceMemoryImageCopyKHR(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkDeviceMemoryImageCopyKHR(MemorySegment segment) {
        this.segment = segment;
    
        addressRange = new VkDeviceAddressRangeKHR(segment.asSlice(ADDRESS_RANGE_BYTE_OFFSET, VkDeviceAddressRangeKHR.LAYOUT));
        imageSubresource = new VkImageSubresourceLayers(segment.asSlice(IMAGE_SUBRESOURCE_BYTE_OFFSET, VkImageSubresourceLayers.LAYOUT));
        imageOffset = new VkOffset3D(segment.asSlice(IMAGE_OFFSET_BYTE_OFFSET, VkOffset3D.LAYOUT));
        imageExtent = new VkExtent3D(segment.asSlice(IMAGE_EXTENT_BYTE_OFFSET, VkExtent3D.LAYOUT));
    }

    /// @see #sType()
    public VkDeviceMemoryImageCopyKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkDeviceMemoryImageCopyKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #addressFlags()
    public VkDeviceMemoryImageCopyKHR addressFlags(int addressFlags) {
    	ADDRESS_FLAGS_HANDLE.set(segment, 0L, addressFlags);
    	return this;
    }
    
    public int addressFlags() {
    	return (int) ADDRESS_FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #addressRowLength()
    public VkDeviceMemoryImageCopyKHR addressRowLength(int addressRowLength) {
    	ADDRESS_ROW_LENGTH_HANDLE.set(segment, 0L, addressRowLength);
    	return this;
    }
    
    public int addressRowLength() {
    	return (int) ADDRESS_ROW_LENGTH_HANDLE.get(segment, 0L);
    }
    
    /// @see #addressImageHeight()
    public VkDeviceMemoryImageCopyKHR addressImageHeight(int addressImageHeight) {
    	ADDRESS_IMAGE_HEIGHT_HANDLE.set(segment, 0L, addressImageHeight);
    	return this;
    }
    
    public int addressImageHeight() {
    	return (int) ADDRESS_IMAGE_HEIGHT_HANDLE.get(segment, 0L);
    }
    
    /// @see #imageLayout()
    public VkDeviceMemoryImageCopyKHR imageLayout(int imageLayout) {
    	IMAGE_LAYOUT_HANDLE.set(segment, 0L, imageLayout);
    	return this;
    }
    
    public int imageLayout() {
    	return (int) IMAGE_LAYOUT_HANDLE.get(segment, 0L);
    }
    
    /// @see #addressRange()
    public VkDeviceMemoryImageCopyKHR addressRange(Consumer<VkDeviceAddressRangeKHR> consumer) {
    	consumer.accept(addressRange);
    	return this;
    }
    
    /// @see #addressRange()
    public VkDeviceMemoryImageCopyKHR addressRange(VkDeviceAddressRangeKHR other) {
    	addressRange.set(other);
    	return this;
    }
    
    public VkDeviceAddressRangeKHR addressRange() {
    	return addressRange;
    }
    
    /// @see #imageSubresource()
    public VkDeviceMemoryImageCopyKHR imageSubresource(Consumer<VkImageSubresourceLayers> consumer) {
    	consumer.accept(imageSubresource);
    	return this;
    }
    
    /// @see #imageSubresource()
    public VkDeviceMemoryImageCopyKHR imageSubresource(VkImageSubresourceLayers other) {
    	imageSubresource.set(other);
    	return this;
    }
    
    public VkImageSubresourceLayers imageSubresource() {
    	return imageSubresource;
    }
    
    /// @see #imageOffset()
    public VkDeviceMemoryImageCopyKHR imageOffset(Consumer<VkOffset3D> consumer) {
    	consumer.accept(imageOffset);
    	return this;
    }
    
    /// @see #imageOffset()
    public VkDeviceMemoryImageCopyKHR imageOffset(VkOffset3D other) {
    	imageOffset.set(other);
    	return this;
    }
    
    public VkOffset3D imageOffset() {
    	return imageOffset;
    }
    
    /// @see #imageExtent()
    public VkDeviceMemoryImageCopyKHR imageExtent(Consumer<VkExtent3D> consumer) {
    	consumer.accept(imageExtent);
    	return this;
    }
    
    /// @see #imageExtent()
    public VkDeviceMemoryImageCopyKHR imageExtent(VkExtent3D other) {
    	imageExtent.set(other);
    	return this;
    }
    
    public VkExtent3D imageExtent() {
    	return imageExtent;
    }
    
    @Override
    public VkDeviceMemoryImageCopyKHR set(VkDeviceMemoryImageCopyKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkDeviceMemoryImageCopyKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDeviceMemoryImageCopyKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDeviceMemoryImageCopyKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDeviceMemoryImageCopyKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDeviceMemoryImageCopyKHR> array(Arena arena, VkDeviceMemoryImageCopyKHR... structs) {
        NativeStructArray<VkDeviceMemoryImageCopyKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDeviceMemoryImageCopyKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDeviceMemoryImageCopyKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDeviceMemoryImageCopyKHR(segment)
        );
    }
    
}