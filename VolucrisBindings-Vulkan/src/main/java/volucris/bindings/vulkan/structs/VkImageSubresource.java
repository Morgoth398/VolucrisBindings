/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;

public final class VkImageSubresource
		implements Struct<VkImageSubresource> {

    public static final StructLayout LAYOUT;

    public static final VarHandle ASPECT_MASK_HANDLE;
    public static final VarHandle MIP_LEVEL_HANDLE;
    public static final VarHandle ARRAY_LAYER_HANDLE;

    public static final long ASPECT_MASK_BYTE_OFFSET;
    public static final long MIP_LEVEL_BYTE_OFFSET;
    public static final long ARRAY_LAYER_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("aspectMask"),
            JAVA_INT.withName("mipLevel"),
            JAVA_INT.withName("arrayLayer")
        ).withName("VkImageSubresource").withByteAlignment(4);
        
        ASPECT_MASK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("aspectMask"));
        MIP_LEVEL_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mipLevel"));
        ARRAY_LAYER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("arrayLayer"));
        
        ASPECT_MASK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("aspectMask"));
        MIP_LEVEL_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mipLevel"));
        ARRAY_LAYER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("arrayLayer"));
        //@formatter:on
    }

    public VkImageSubresource() {
        this(Arena.ofAuto());
    }
    
    public VkImageSubresource(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkImageSubresource(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #aspectMask()
    public VkImageSubresource aspectMask(int aspectMask) {
    	ASPECT_MASK_HANDLE.set(segment, 0L, aspectMask);
    	return this;
    }
    
    public int aspectMask() {
    	return (int) ASPECT_MASK_HANDLE.get(segment, 0L);
    }
    
    /// @see #mipLevel()
    public VkImageSubresource mipLevel(int mipLevel) {
    	MIP_LEVEL_HANDLE.set(segment, 0L, mipLevel);
    	return this;
    }
    
    public int mipLevel() {
    	return (int) MIP_LEVEL_HANDLE.get(segment, 0L);
    }
    
    /// @see #arrayLayer()
    public VkImageSubresource arrayLayer(int arrayLayer) {
    	ARRAY_LAYER_HANDLE.set(segment, 0L, arrayLayer);
    	return this;
    }
    
    public int arrayLayer() {
    	return (int) ARRAY_LAYER_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkImageSubresource set(VkImageSubresource other) {
        return set(other.segment);
    }
    
    @Override
    public VkImageSubresource set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkImageSubresource> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkImageSubresource> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkImageSubresource(segment),
            count
        );
    }
    
    public static NativeStructArray<VkImageSubresource> array(Arena arena, VkImageSubresource... structs) {
        NativeStructArray<VkImageSubresource> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkImageSubresource(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkImageSubresource> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkImageSubresource(segment)
        );
    }
    
}