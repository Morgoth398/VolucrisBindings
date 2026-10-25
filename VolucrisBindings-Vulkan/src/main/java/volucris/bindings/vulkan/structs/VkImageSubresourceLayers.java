/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;

public final class VkImageSubresourceLayers
		implements Struct<VkImageSubresourceLayers> {

	public static final StructLayout LAYOUT;

	public static final VarHandle ASPECT_MASK_HANDLE;
	public static final VarHandle MIP_LEVEL_HANDLE;
	public static final VarHandle BASE_ARRAY_LAYER_HANDLE;
	public static final VarHandle LAYER_COUNT_HANDLE;

	public static final long ASPECT_MASK_BYTE_OFFSET;
	public static final long MIP_LEVEL_BYTE_OFFSET;
	public static final long BASE_ARRAY_LAYER_BYTE_OFFSET;
	public static final long LAYER_COUNT_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("aspectMask"),
		    JAVA_INT.withName("mipLevel"),
		    JAVA_INT.withName("baseArrayLayer"),
		    JAVA_INT.withName("layerCount")
		).withName("VkImageSubresourceLayers").withByteAlignment(4);
		
		ASPECT_MASK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("aspectMask"));
		MIP_LEVEL_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mipLevel"));
		BASE_ARRAY_LAYER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("baseArrayLayer"));
		LAYER_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("layerCount"));
		
		ASPECT_MASK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("aspectMask"));
		MIP_LEVEL_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mipLevel"));
		BASE_ARRAY_LAYER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("baseArrayLayer"));
		LAYER_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("layerCount"));
		//@formatter:on
	}

	public VkImageSubresourceLayers() {
	    this(Arena.ofAuto());
	}
	
	public VkImageSubresourceLayers(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkImageSubresourceLayers(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #aspectMask()
    public VkImageSubresourceLayers aspectMask(int aspectMask) {
    	ASPECT_MASK_HANDLE.set(segment, 0L, aspectMask);
    	return this;
    }
    
    public int aspectMask() {
    	return (int) ASPECT_MASK_HANDLE.get(segment, 0L);
    }
    
    /// @see #mipLevel()
    public VkImageSubresourceLayers mipLevel(int mipLevel) {
    	MIP_LEVEL_HANDLE.set(segment, 0L, mipLevel);
    	return this;
    }
    
    public int mipLevel() {
    	return (int) MIP_LEVEL_HANDLE.get(segment, 0L);
    }
    
    /// @see #baseArrayLayer()
    public VkImageSubresourceLayers baseArrayLayer(int baseArrayLayer) {
    	BASE_ARRAY_LAYER_HANDLE.set(segment, 0L, baseArrayLayer);
    	return this;
    }
    
    public int baseArrayLayer() {
    	return (int) BASE_ARRAY_LAYER_HANDLE.get(segment, 0L);
    }
    
    /// @see #layerCount()
    public VkImageSubresourceLayers layerCount(int layerCount) {
    	LAYER_COUNT_HANDLE.set(segment, 0L, layerCount);
    	return this;
    }
    
    public int layerCount() {
    	return (int) LAYER_COUNT_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkImageSubresourceLayers set(VkImageSubresourceLayers other) {
        return set(other.segment);
    }
    
    @Override
    public VkImageSubresourceLayers set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkImageSubresourceLayers> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkImageSubresourceLayers> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkImageSubresourceLayers(segment),
            count
        );
    }
    
    public static NativeStructArray<VkImageSubresourceLayers> array(SegmentAllocator allocator, VkImageSubresourceLayers... structs) {
        NativeStructArray<VkImageSubresourceLayers> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkImageSubresourceLayers(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkImageSubresourceLayers> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkImageSubresourceLayers(segment)
        );
    }

}