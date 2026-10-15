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

public final class VkClearRect
		implements Struct<VkClearRect> {

	public static final StructLayout LAYOUT;

	public static final VarHandle BASE_ARRAY_LAYER_HANDLE;
	public static final VarHandle LAYER_COUNT_HANDLE;

	public static final long RECT_BYTE_OFFSET;
	public static final long BASE_ARRAY_LAYER_BYTE_OFFSET;
	public static final long LAYER_COUNT_BYTE_OFFSET;

	private final MemorySegment segment;

	private final VkRect2D rect;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    VkRect2D.LAYOUT.withName("rect"),
		    JAVA_INT.withName("baseArrayLayer"),
		    JAVA_INT.withName("layerCount")
		).withName("VkClearRect").withByteAlignment(4);
		
		BASE_ARRAY_LAYER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("baseArrayLayer"));
		LAYER_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("layerCount"));
		
		RECT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("rect"));
		BASE_ARRAY_LAYER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("baseArrayLayer"));
		LAYER_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("layerCount"));
		//@formatter:on
	}

	public VkClearRect() {
	    this(Arena.ofAuto());
	}
	
	public VkClearRect(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkClearRect(MemorySegment segment) {
	    this.segment = segment;
	
	    rect = new VkRect2D(segment.asSlice(RECT_BYTE_OFFSET, VkRect2D.LAYOUT));
	}

    /// @see #rect()
    public VkClearRect rect(Consumer<VkRect2D> consumer) {
    	consumer.accept(rect);
    	return this;
    }
    
    /// @see #rect()
    public VkClearRect rect(VkRect2D other) {
    	rect.set(other);
    	return this;
    }
    
    public VkRect2D rect() {
    	return rect;
    }
    
    /// @see #baseArrayLayer()
    public VkClearRect baseArrayLayer(int baseArrayLayer) {
    	BASE_ARRAY_LAYER_HANDLE.set(segment, 0L, baseArrayLayer);
    	return this;
    }
    
    public int baseArrayLayer() {
    	return (int) BASE_ARRAY_LAYER_HANDLE.get(segment, 0L);
    }
    
    /// @see #layerCount()
    public VkClearRect layerCount(int layerCount) {
    	LAYER_COUNT_HANDLE.set(segment, 0L, layerCount);
    	return this;
    }
    
    public int layerCount() {
    	return (int) LAYER_COUNT_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkClearRect set(VkClearRect other) {
        return set(other.segment);
    }
    
    @Override
    public VkClearRect set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkClearRect> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkClearRect> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkClearRect(segment),
            count
        );
    }
    
    public static NativeStructArray<VkClearRect> array(Arena arena, VkClearRect... structs) {
        NativeStructArray<VkClearRect> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkClearRect(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkClearRect> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkClearRect(segment)
        );
    }

}