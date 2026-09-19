/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkPresentRegionKHR
		implements Struct<VkPresentRegionKHR> {

    public static final StructLayout LAYOUT;

    public static final VarHandle RECTANGLE_COUNT_HANDLE;
    public static final VarHandle P_RECTANGLES_HANDLE;

    public static final long RECTANGLE_COUNT_BYTE_OFFSET;
    public static final long P_RECTANGLES_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("rectangleCount"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pRectangles")
        ).withName("VkPresentRegionKHR").withByteAlignment(8);
        
        RECTANGLE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("rectangleCount"));
        P_RECTANGLES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pRectangles"));
        
        RECTANGLE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("rectangleCount"));
        P_RECTANGLES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pRectangles"));
        //@formatter:on
    }

    public VkPresentRegionKHR() {
        this(Arena.ofAuto());
    }
    
    public VkPresentRegionKHR(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkPresentRegionKHR(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #rectangleCount()
    public VkPresentRegionKHR rectangleCount(int rectangleCount) {
    	RECTANGLE_COUNT_HANDLE.set(segment, 0L, rectangleCount);
    	return this;
    }
    
    public int rectangleCount() {
    	return (int) RECTANGLE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pRectangles()
    public VkPresentRegionKHR pRectangles(NativeStructArray<VkRectLayerKHR> pRectangles) {
    	P_RECTANGLES_HANDLE.set(segment, 0L, pRectangles.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkRectLayerKHR> pRectangles() {
    	MemorySegment segment = (MemorySegment) P_RECTANGLES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkRectLayerKHR.array(segment);
    }
    
    @Override
    public VkPresentRegionKHR set(VkPresentRegionKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkPresentRegionKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPresentRegionKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPresentRegionKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPresentRegionKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPresentRegionKHR> array(Arena arena, VkPresentRegionKHR... structs) {
        NativeStructArray<VkPresentRegionKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPresentRegionKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPresentRegionKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPresentRegionKHR(segment)
        );
    }
    
}