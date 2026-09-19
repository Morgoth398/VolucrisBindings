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

public final class VkRectLayerKHR
		implements Struct<VkRectLayerKHR> {

    public static final StructLayout LAYOUT;

    public static final VarHandle LAYER_HANDLE;

    public static final long OFFSET_BYTE_OFFSET;
    public static final long EXTENT_BYTE_OFFSET;
    public static final long LAYER_BYTE_OFFSET;

    private final MemorySegment segment;

    private final VkOffset2D offset;
    private final VkExtent2D extent;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            VkOffset2D.LAYOUT.withName("offset"),
            VkExtent2D.LAYOUT.withName("extent"),
            JAVA_INT.withName("layer")
        ).withName("VkRectLayerKHR").withByteAlignment(4);
        
        LAYER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("layer"));
        
        OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("offset"));
        EXTENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("extent"));
        LAYER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("layer"));
        //@formatter:on
    }

    public VkRectLayerKHR() {
        this(Arena.ofAuto());
    }
    
    public VkRectLayerKHR(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkRectLayerKHR(MemorySegment segment) {
        this.segment = segment;
    
        offset = new VkOffset2D(segment.asSlice(OFFSET_BYTE_OFFSET, VkOffset2D.LAYOUT));
        extent = new VkExtent2D(segment.asSlice(EXTENT_BYTE_OFFSET, VkExtent2D.LAYOUT));
    }

    /// @see #layer()
    public VkRectLayerKHR layer(int layer) {
    	LAYER_HANDLE.set(segment, 0L, layer);
    	return this;
    }
    
    public int layer() {
    	return (int) LAYER_HANDLE.get(segment, 0L);
    }
    
    /// @see #offset()
    public VkRectLayerKHR offset(Consumer<VkOffset2D> consumer) {
    	consumer.accept(offset);
    	return this;
    }
    
    /// @see #offset()
    public VkRectLayerKHR offset(VkOffset2D other) {
    	offset.set(other);
    	return this;
    }
    
    public VkOffset2D offset() {
    	return offset;
    }
    
    /// @see #extent()
    public VkRectLayerKHR extent(Consumer<VkExtent2D> consumer) {
    	consumer.accept(extent);
    	return this;
    }
    
    /// @see #extent()
    public VkRectLayerKHR extent(VkExtent2D other) {
    	extent.set(other);
    	return this;
    }
    
    public VkExtent2D extent() {
    	return extent;
    }
    
    @Override
    public VkRectLayerKHR set(VkRectLayerKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkRectLayerKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkRectLayerKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkRectLayerKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkRectLayerKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkRectLayerKHR> array(Arena arena, VkRectLayerKHR... structs) {
        NativeStructArray<VkRectLayerKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkRectLayerKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkRectLayerKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkRectLayerKHR(segment)
        );
    }
    
}