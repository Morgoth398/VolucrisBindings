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

public final class VkImageSubresourceRange
		implements Struct<VkImageSubresourceRange> {

	public static final StructLayout LAYOUT;

	public static final VarHandle ASPECT_MASK_HANDLE;
	public static final VarHandle BASE_MIP_LEVEL_HANDLE;
	public static final VarHandle LEVEL_COUNT_HANDLE;
	public static final VarHandle BASE_ARRAY_LAYER_HANDLE;
	public static final VarHandle LAYER_COUNT_HANDLE;

	public static final long ASPECT_MASK_BYTE_OFFSET;
	public static final long BASE_MIP_LEVEL_BYTE_OFFSET;
	public static final long LEVEL_COUNT_BYTE_OFFSET;
	public static final long BASE_ARRAY_LAYER_BYTE_OFFSET;
	public static final long LAYER_COUNT_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("aspectMask"),
		    JAVA_INT.withName("baseMipLevel"),
		    JAVA_INT.withName("levelCount"),
		    JAVA_INT.withName("baseArrayLayer"),
		    JAVA_INT.withName("layerCount")
		).withName("VkImageSubresourceRange").withByteAlignment(4);
		
		ASPECT_MASK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("aspectMask"));
		BASE_MIP_LEVEL_HANDLE = LAYOUT.varHandle(PathElement.groupElement("baseMipLevel"));
		LEVEL_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("levelCount"));
		BASE_ARRAY_LAYER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("baseArrayLayer"));
		LAYER_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("layerCount"));
		
		ASPECT_MASK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("aspectMask"));
		BASE_MIP_LEVEL_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("baseMipLevel"));
		LEVEL_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("levelCount"));
		BASE_ARRAY_LAYER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("baseArrayLayer"));
		LAYER_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("layerCount"));
		//@formatter:on
	}

	public VkImageSubresourceRange() {
	    this(Arena.ofAuto());
	}
	
	public VkImageSubresourceRange(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkImageSubresourceRange(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #aspectMask()
    public VkImageSubresourceRange aspectMask(int aspectMask) {
    	ASPECT_MASK_HANDLE.set(segment, 0L, aspectMask);
    	return this;
    }
    
    public int aspectMask() {
    	return (int) ASPECT_MASK_HANDLE.get(segment, 0L);
    }
    
    /// @see #baseMipLevel()
    public VkImageSubresourceRange baseMipLevel(int baseMipLevel) {
    	BASE_MIP_LEVEL_HANDLE.set(segment, 0L, baseMipLevel);
    	return this;
    }
    
    public int baseMipLevel() {
    	return (int) BASE_MIP_LEVEL_HANDLE.get(segment, 0L);
    }
    
    /// @see #levelCount()
    public VkImageSubresourceRange levelCount(int levelCount) {
    	LEVEL_COUNT_HANDLE.set(segment, 0L, levelCount);
    	return this;
    }
    
    public int levelCount() {
    	return (int) LEVEL_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #baseArrayLayer()
    public VkImageSubresourceRange baseArrayLayer(int baseArrayLayer) {
    	BASE_ARRAY_LAYER_HANDLE.set(segment, 0L, baseArrayLayer);
    	return this;
    }
    
    public int baseArrayLayer() {
    	return (int) BASE_ARRAY_LAYER_HANDLE.get(segment, 0L);
    }
    
    /// @see #layerCount()
    public VkImageSubresourceRange layerCount(int layerCount) {
    	LAYER_COUNT_HANDLE.set(segment, 0L, layerCount);
    	return this;
    }
    
    public int layerCount() {
    	return (int) LAYER_COUNT_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkImageSubresourceRange set(VkImageSubresourceRange other) {
        return set(other.segment);
    }
    
    @Override
    public VkImageSubresourceRange set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkImageSubresourceRange> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkImageSubresourceRange> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkImageSubresourceRange(segment),
            count
        );
    }
    
    public static NativeStructArray<VkImageSubresourceRange> array(Arena arena, VkImageSubresourceRange... structs) {
        NativeStructArray<VkImageSubresourceRange> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkImageSubresourceRange(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkImageSubresourceRange> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkImageSubresourceRange(segment)
        );
    }

}