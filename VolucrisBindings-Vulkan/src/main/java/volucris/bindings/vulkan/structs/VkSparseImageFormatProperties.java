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

public final class VkSparseImageFormatProperties
		implements Struct<VkSparseImageFormatProperties> {

    public static final StructLayout LAYOUT;

    public static final VarHandle ASPECT_MASK_HANDLE;
    public static final VarHandle FLAGS_HANDLE;

    public static final long ASPECT_MASK_BYTE_OFFSET;
    public static final long IMAGE_GRANULARITY_BYTE_OFFSET;
    public static final long FLAGS_BYTE_OFFSET;

    private final MemorySegment segment;

    private final VkExtent3D imageGranularity;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("aspectMask"),
            VkExtent3D.LAYOUT.withName("imageGranularity"),
            JAVA_INT.withName("flags")
        ).withName("VkSparseImageFormatProperties").withByteAlignment(4);
        
        ASPECT_MASK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("aspectMask"));
        FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
        
        ASPECT_MASK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("aspectMask"));
        IMAGE_GRANULARITY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("imageGranularity"));
        FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
        //@formatter:on
    }

    public VkSparseImageFormatProperties() {
        this(Arena.ofAuto());
    }
    
    public VkSparseImageFormatProperties(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkSparseImageFormatProperties(MemorySegment segment) {
        this.segment = segment;
    
        imageGranularity = new VkExtent3D(segment.asSlice(IMAGE_GRANULARITY_BYTE_OFFSET, VkExtent3D.LAYOUT));
    }

    /// @see #aspectMask()
    public VkSparseImageFormatProperties aspectMask(int aspectMask) {
    	ASPECT_MASK_HANDLE.set(segment, 0L, aspectMask);
    	return this;
    }
    
    public int aspectMask() {
    	return (int) ASPECT_MASK_HANDLE.get(segment, 0L);
    }
    
    /// @see #flags()
    public VkSparseImageFormatProperties flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #imageGranularity()
    public VkSparseImageFormatProperties imageGranularity(Consumer<VkExtent3D> consumer) {
    	consumer.accept(imageGranularity);
    	return this;
    }
    
    /// @see #imageGranularity()
    public VkSparseImageFormatProperties imageGranularity(VkExtent3D other) {
    	imageGranularity.set(other);
    	return this;
    }
    
    public VkExtent3D imageGranularity() {
    	return imageGranularity;
    }
    
    @Override
    public VkSparseImageFormatProperties set(VkSparseImageFormatProperties other) {
        return set(other.segment);
    }
    
    @Override
    public VkSparseImageFormatProperties set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkSparseImageFormatProperties> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkSparseImageFormatProperties> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkSparseImageFormatProperties(segment),
            count
        );
    }
    
    public static NativeStructArray<VkSparseImageFormatProperties> array(Arena arena, VkSparseImageFormatProperties... structs) {
        NativeStructArray<VkSparseImageFormatProperties> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkSparseImageFormatProperties(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkSparseImageFormatProperties> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkSparseImageFormatProperties(segment)
        );
    }
    
}