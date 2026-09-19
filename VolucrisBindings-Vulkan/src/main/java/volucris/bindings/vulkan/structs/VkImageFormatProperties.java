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

public final class VkImageFormatProperties
		implements Struct<VkImageFormatProperties> {

    public static final StructLayout LAYOUT;

    public static final VarHandle MAX_MIP_LEVELS_HANDLE;
    public static final VarHandle MAX_ARRAY_LAYERS_HANDLE;
    public static final VarHandle SAMPLE_COUNTS_HANDLE;
    public static final VarHandle MAX_RESOURCE_SIZE_HANDLE;

    public static final long MAX_EXTENT_BYTE_OFFSET;
    public static final long MAX_MIP_LEVELS_BYTE_OFFSET;
    public static final long MAX_ARRAY_LAYERS_BYTE_OFFSET;
    public static final long SAMPLE_COUNTS_BYTE_OFFSET;
    public static final long MAX_RESOURCE_SIZE_BYTE_OFFSET;

    private final MemorySegment segment;

    private final VkExtent3D maxExtent;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            VkExtent3D.LAYOUT.withName("maxExtent"),
            JAVA_INT.withName("maxMipLevels"),
            JAVA_INT.withName("maxArrayLayers"),
            JAVA_INT.withName("sampleCounts"),
            JAVA_LONG.withName("maxResourceSize")
        ).withName("VkImageFormatProperties").withByteAlignment(8);
        
        MAX_MIP_LEVELS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxMipLevels"));
        MAX_ARRAY_LAYERS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxArrayLayers"));
        SAMPLE_COUNTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sampleCounts"));
        MAX_RESOURCE_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxResourceSize"));
        
        MAX_EXTENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxExtent"));
        MAX_MIP_LEVELS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxMipLevels"));
        MAX_ARRAY_LAYERS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxArrayLayers"));
        SAMPLE_COUNTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sampleCounts"));
        MAX_RESOURCE_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxResourceSize"));
        //@formatter:on
    }

    public VkImageFormatProperties() {
        this(Arena.ofAuto());
    }
    
    public VkImageFormatProperties(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkImageFormatProperties(MemorySegment segment) {
        this.segment = segment;
    
        maxExtent = new VkExtent3D(segment.asSlice(MAX_EXTENT_BYTE_OFFSET, VkExtent3D.LAYOUT));
    }

    /// @see #maxMipLevels()
    public VkImageFormatProperties maxMipLevels(int maxMipLevels) {
    	MAX_MIP_LEVELS_HANDLE.set(segment, 0L, maxMipLevels);
    	return this;
    }
    
    public int maxMipLevels() {
    	return (int) MAX_MIP_LEVELS_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxArrayLayers()
    public VkImageFormatProperties maxArrayLayers(int maxArrayLayers) {
    	MAX_ARRAY_LAYERS_HANDLE.set(segment, 0L, maxArrayLayers);
    	return this;
    }
    
    public int maxArrayLayers() {
    	return (int) MAX_ARRAY_LAYERS_HANDLE.get(segment, 0L);
    }
    
    /// @see #sampleCounts()
    public VkImageFormatProperties sampleCounts(int sampleCounts) {
    	SAMPLE_COUNTS_HANDLE.set(segment, 0L, sampleCounts);
    	return this;
    }
    
    public int sampleCounts() {
    	return (int) SAMPLE_COUNTS_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxResourceSize()
    public VkImageFormatProperties maxResourceSize(long maxResourceSize) {
    	MAX_RESOURCE_SIZE_HANDLE.set(segment, 0L, maxResourceSize);
    	return this;
    }
    
    public long maxResourceSize() {
    	return (long) MAX_RESOURCE_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxExtent()
    public VkImageFormatProperties maxExtent(Consumer<VkExtent3D> consumer) {
    	consumer.accept(maxExtent);
    	return this;
    }
    
    /// @see #maxExtent()
    public VkImageFormatProperties maxExtent(VkExtent3D other) {
    	maxExtent.set(other);
    	return this;
    }
    
    public VkExtent3D maxExtent() {
    	return maxExtent;
    }
    
    @Override
    public VkImageFormatProperties set(VkImageFormatProperties other) {
        return set(other.segment);
    }
    
    @Override
    public VkImageFormatProperties set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkImageFormatProperties> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkImageFormatProperties> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkImageFormatProperties(segment),
            count
        );
    }
    
    public static NativeStructArray<VkImageFormatProperties> array(Arena arena, VkImageFormatProperties... structs) {
        NativeStructArray<VkImageFormatProperties> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkImageFormatProperties(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkImageFormatProperties> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkImageFormatProperties(segment)
        );
    }
    
}