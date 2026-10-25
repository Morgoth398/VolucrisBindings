/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.unions;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.UnionLayout;
import java.util.function.Consumer;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.structs.*;

import static java.lang.foreign.ValueLayout.*;

public final class VkClearValue
		implements Struct<VkClearValue> {

	public static final UnionLayout LAYOUT;

	public static final long COLOR_BYTE_OFFSET;
	public static final long DEPTH_STENCIL_BYTE_OFFSET;

	private final MemorySegment segment;

	private final VkClearColorValue color;
	private final VkClearDepthStencilValue depthStencil;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.unionLayout(
		    VkClearColorValue.LAYOUT.withName("color"),
		    VkClearDepthStencilValue.LAYOUT.withName("depthStencil")
		).withName("VkClearValue").withByteAlignment(4);
		
		COLOR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("color"));
		DEPTH_STENCIL_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("depthStencil"));
		//@formatter:on
	}

	public VkClearValue() {
	    this(Arena.ofAuto());
	}
	
	public VkClearValue(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkClearValue(MemorySegment segment) {
	    this.segment = segment;
	
	    color = new VkClearColorValue(segment.asSlice(COLOR_BYTE_OFFSET, VkClearColorValue.LAYOUT));
	    depthStencil = new VkClearDepthStencilValue(segment.asSlice(DEPTH_STENCIL_BYTE_OFFSET, VkClearDepthStencilValue.LAYOUT));
	}

    /// @see #color()
    public VkClearValue color(Consumer<VkClearColorValue> consumer) {
    	consumer.accept(color);
    	return this;
    }
    
    /// @see #color()
    public VkClearValue color(VkClearColorValue other) {
    	color.set(other);
    	return this;
    }
    
    public VkClearColorValue color() {
    	return color;
    }
    
    /// @see #depthStencil()
    public VkClearValue depthStencil(Consumer<VkClearDepthStencilValue> consumer) {
    	consumer.accept(depthStencil);
    	return this;
    }
    
    /// @see #depthStencil()
    public VkClearValue depthStencil(VkClearDepthStencilValue other) {
    	depthStencil.set(other);
    	return this;
    }
    
    public VkClearDepthStencilValue depthStencil() {
    	return depthStencil;
    }
    
    @Override
    public VkClearValue set(VkClearValue other) {
        return set(other.segment);
    }
    
    @Override
    public VkClearValue set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkClearValue> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkClearValue> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkClearValue(segment),
            count
        );
    }
    
    public static NativeStructArray<VkClearValue> array(SegmentAllocator allocator, VkClearValue... structs) {
        NativeStructArray<VkClearValue> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkClearValue(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkClearValue> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkClearValue(segment)
        );
    }

}