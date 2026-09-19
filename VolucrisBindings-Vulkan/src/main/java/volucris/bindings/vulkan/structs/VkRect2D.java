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

public final class VkRect2D
		implements Struct<VkRect2D> {

    public static final StructLayout LAYOUT;

    public static final long OFFSET_BYTE_OFFSET;
    public static final long EXTENT_BYTE_OFFSET;

    private final MemorySegment segment;

    private final VkOffset2D offset;
    private final VkExtent2D extent;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            VkOffset2D.LAYOUT.withName("offset"),
            VkExtent2D.LAYOUT.withName("extent")
        ).withName("VkRect2D").withByteAlignment(4);
        
        OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("offset"));
        EXTENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("extent"));
        //@formatter:on
    }

    public VkRect2D() {
        this(Arena.ofAuto());
    }
    
    public VkRect2D(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkRect2D(MemorySegment segment) {
        this.segment = segment;
    
        offset = new VkOffset2D(segment.asSlice(OFFSET_BYTE_OFFSET, VkOffset2D.LAYOUT));
        extent = new VkExtent2D(segment.asSlice(EXTENT_BYTE_OFFSET, VkExtent2D.LAYOUT));
    }

    /// @see #offset()
    public VkRect2D offset(Consumer<VkOffset2D> consumer) {
    	consumer.accept(offset);
    	return this;
    }
    
    /// @see #offset()
    public VkRect2D offset(VkOffset2D other) {
    	offset.set(other);
    	return this;
    }
    
    public VkOffset2D offset() {
    	return offset;
    }
    
    /// @see #extent()
    public VkRect2D extent(Consumer<VkExtent2D> consumer) {
    	consumer.accept(extent);
    	return this;
    }
    
    /// @see #extent()
    public VkRect2D extent(VkExtent2D other) {
    	extent.set(other);
    	return this;
    }
    
    public VkExtent2D extent() {
    	return extent;
    }
    
    @Override
    public VkRect2D set(VkRect2D other) {
        return set(other.segment);
    }
    
    @Override
    public VkRect2D set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkRect2D> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkRect2D> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkRect2D(segment),
            count
        );
    }
    
    public static NativeStructArray<VkRect2D> array(Arena arena, VkRect2D... structs) {
        NativeStructArray<VkRect2D> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkRect2D(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkRect2D> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkRect2D(segment)
        );
    }
    
}