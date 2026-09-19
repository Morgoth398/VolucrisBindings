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

public final class VkImageBlit
		implements Struct<VkImageBlit> {

    public static final StructLayout LAYOUT;

    public static final long SRC_SUBRESOURCE_BYTE_OFFSET;
    public static final long SRC_OFFSETS_BYTE_OFFSET;
    public static final long DST_SUBRESOURCE_BYTE_OFFSET;
    public static final long DST_OFFSETS_BYTE_OFFSET;

    private final MemorySegment segment;

    private final VkImageSubresourceLayers srcSubresource;
    private final VkOffset3D[] srcOffsets;
    private final VkImageSubresourceLayers dstSubresource;
    private final VkOffset3D[] dstOffsets;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            VkImageSubresourceLayers.LAYOUT.withName("srcSubresource"),
            MemoryLayout.sequenceLayout(2, VkOffset3D.LAYOUT).withName("srcOffsets"),
            VkImageSubresourceLayers.LAYOUT.withName("dstSubresource"),
            MemoryLayout.sequenceLayout(2, VkOffset3D.LAYOUT).withName("dstOffsets")
        ).withName("VkImageBlit").withByteAlignment(4);
        
        SRC_SUBRESOURCE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("srcSubresource"));
        SRC_OFFSETS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("srcOffsets"));
        DST_SUBRESOURCE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dstSubresource"));
        DST_OFFSETS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dstOffsets"));
        //@formatter:on
    }

    public VkImageBlit() {
        this(Arena.ofAuto());
    }
    
    public VkImageBlit(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkImageBlit(MemorySegment segment) {
        this.segment = segment;
    
        srcSubresource = new VkImageSubresourceLayers(segment.asSlice(SRC_SUBRESOURCE_BYTE_OFFSET, VkImageSubresourceLayers.LAYOUT));
        srcOffsets = new VkOffset3D[2];
        for (int i = 0; i < 2; i++) {
            long offset = SRC_OFFSETS_BYTE_OFFSET + i * VkOffset3D.LAYOUT.byteSize();
            srcOffsets[i] = new VkOffset3D(segment.asSlice(offset, VkOffset3D.LAYOUT));
        }
    
        dstSubresource = new VkImageSubresourceLayers(segment.asSlice(DST_SUBRESOURCE_BYTE_OFFSET, VkImageSubresourceLayers.LAYOUT));
        dstOffsets = new VkOffset3D[2];
        for (int i = 0; i < 2; i++) {
            long offset = DST_OFFSETS_BYTE_OFFSET + i * VkOffset3D.LAYOUT.byteSize();
            dstOffsets[i] = new VkOffset3D(segment.asSlice(offset, VkOffset3D.LAYOUT));
        }
    
    }

    /// @see #srcSubresource()
    public VkImageBlit srcSubresource(Consumer<VkImageSubresourceLayers> consumer) {
    	consumer.accept(srcSubresource);
    	return this;
    }
    
    /// @see #srcSubresource()
    public VkImageBlit srcSubresource(VkImageSubresourceLayers other) {
    	srcSubresource.set(other);
    	return this;
    }
    
    public VkImageSubresourceLayers srcSubresource() {
    	return srcSubresource;
    }
    
    /// @see #srcOffsets(int)
    public VkImageBlit srcOffsets(Consumer<VkOffset3D> consumer, int index) {
    	consumer.accept(srcOffsets[index]);
    	return this;
    }
    
    /// @see #srcOffsets(int)
    public VkImageBlit srcOffsets(VkOffset3D other, int index) {
    	srcOffsets[index].set(other);
    	return this;
    }
    
    public VkOffset3D srcOffsets(int index) {
    	return srcOffsets[index];
    }
    
    /// @see #dstSubresource()
    public VkImageBlit dstSubresource(Consumer<VkImageSubresourceLayers> consumer) {
    	consumer.accept(dstSubresource);
    	return this;
    }
    
    /// @see #dstSubresource()
    public VkImageBlit dstSubresource(VkImageSubresourceLayers other) {
    	dstSubresource.set(other);
    	return this;
    }
    
    public VkImageSubresourceLayers dstSubresource() {
    	return dstSubresource;
    }
    
    /// @see #dstOffsets(int)
    public VkImageBlit dstOffsets(Consumer<VkOffset3D> consumer, int index) {
    	consumer.accept(dstOffsets[index]);
    	return this;
    }
    
    /// @see #dstOffsets(int)
    public VkImageBlit dstOffsets(VkOffset3D other, int index) {
    	dstOffsets[index].set(other);
    	return this;
    }
    
    public VkOffset3D dstOffsets(int index) {
    	return dstOffsets[index];
    }
    
    @Override
    public VkImageBlit set(VkImageBlit other) {
        return set(other.segment);
    }
    
    @Override
    public VkImageBlit set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkImageBlit> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkImageBlit> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkImageBlit(segment),
            count
        );
    }
    
    public static NativeStructArray<VkImageBlit> array(Arena arena, VkImageBlit... structs) {
        NativeStructArray<VkImageBlit> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkImageBlit(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkImageBlit> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkImageBlit(segment)
        );
    }
    
}