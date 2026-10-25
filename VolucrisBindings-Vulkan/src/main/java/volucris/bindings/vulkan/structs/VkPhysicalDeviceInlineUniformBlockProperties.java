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
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkPhysicalDeviceInlineUniformBlockProperties
		implements Struct<VkPhysicalDeviceInlineUniformBlockProperties> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle MAX_INLINE_UNIFORM_BLOCK_SIZE_HANDLE;
	public static final VarHandle MAX_PER_STAGE_DESCRIPTOR_INLINE_UNIFORM_BLOCKS_HANDLE;
	public static final VarHandle MAX_PER_STAGE_DESCRIPTOR_UPDATE_AFTER_BIND_INLINE_UNIFORM_BLOCKS_HANDLE;
	public static final VarHandle MAX_DESCRIPTOR_SET_INLINE_UNIFORM_BLOCKS_HANDLE;
	public static final VarHandle MAX_DESCRIPTOR_SET_UPDATE_AFTER_BIND_INLINE_UNIFORM_BLOCKS_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long MAX_INLINE_UNIFORM_BLOCK_SIZE_BYTE_OFFSET;
	public static final long MAX_PER_STAGE_DESCRIPTOR_INLINE_UNIFORM_BLOCKS_BYTE_OFFSET;
	public static final long MAX_PER_STAGE_DESCRIPTOR_UPDATE_AFTER_BIND_INLINE_UNIFORM_BLOCKS_BYTE_OFFSET;
	public static final long MAX_DESCRIPTOR_SET_INLINE_UNIFORM_BLOCKS_BYTE_OFFSET;
	public static final long MAX_DESCRIPTOR_SET_UPDATE_AFTER_BIND_INLINE_UNIFORM_BLOCKS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("maxInlineUniformBlockSize"),
		    JAVA_INT.withName("maxPerStageDescriptorInlineUniformBlocks"),
		    JAVA_INT.withName("maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks"),
		    JAVA_INT.withName("maxDescriptorSetInlineUniformBlocks"),
		    JAVA_INT.withName("maxDescriptorSetUpdateAfterBindInlineUniformBlocks"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPhysicalDeviceInlineUniformBlockProperties").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		MAX_INLINE_UNIFORM_BLOCK_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxInlineUniformBlockSize"));
		MAX_PER_STAGE_DESCRIPTOR_INLINE_UNIFORM_BLOCKS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxPerStageDescriptorInlineUniformBlocks"));
		MAX_PER_STAGE_DESCRIPTOR_UPDATE_AFTER_BIND_INLINE_UNIFORM_BLOCKS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks"));
		MAX_DESCRIPTOR_SET_INLINE_UNIFORM_BLOCKS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxDescriptorSetInlineUniformBlocks"));
		MAX_DESCRIPTOR_SET_UPDATE_AFTER_BIND_INLINE_UNIFORM_BLOCKS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxDescriptorSetUpdateAfterBindInlineUniformBlocks"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		MAX_INLINE_UNIFORM_BLOCK_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxInlineUniformBlockSize"));
		MAX_PER_STAGE_DESCRIPTOR_INLINE_UNIFORM_BLOCKS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxPerStageDescriptorInlineUniformBlocks"));
		MAX_PER_STAGE_DESCRIPTOR_UPDATE_AFTER_BIND_INLINE_UNIFORM_BLOCKS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks"));
		MAX_DESCRIPTOR_SET_INLINE_UNIFORM_BLOCKS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetInlineUniformBlocks"));
		MAX_DESCRIPTOR_SET_UPDATE_AFTER_BIND_INLINE_UNIFORM_BLOCKS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetUpdateAfterBindInlineUniformBlocks"));
		//@formatter:on
	}

	public VkPhysicalDeviceInlineUniformBlockProperties() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceInlineUniformBlockProperties(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceInlineUniformBlockProperties(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceInlineUniformBlockProperties sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceInlineUniformBlockProperties pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #maxInlineUniformBlockSize()
    public VkPhysicalDeviceInlineUniformBlockProperties maxInlineUniformBlockSize(int maxInlineUniformBlockSize) {
    	MAX_INLINE_UNIFORM_BLOCK_SIZE_HANDLE.set(segment, 0L, maxInlineUniformBlockSize);
    	return this;
    }
    
    public int maxInlineUniformBlockSize() {
    	return (int) MAX_INLINE_UNIFORM_BLOCK_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxPerStageDescriptorInlineUniformBlocks()
    public VkPhysicalDeviceInlineUniformBlockProperties maxPerStageDescriptorInlineUniformBlocks(int maxPerStageDescriptorInlineUniformBlocks) {
    	MAX_PER_STAGE_DESCRIPTOR_INLINE_UNIFORM_BLOCKS_HANDLE.set(segment, 0L, maxPerStageDescriptorInlineUniformBlocks);
    	return this;
    }
    
    public int maxPerStageDescriptorInlineUniformBlocks() {
    	return (int) MAX_PER_STAGE_DESCRIPTOR_INLINE_UNIFORM_BLOCKS_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks()
    public VkPhysicalDeviceInlineUniformBlockProperties maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks(int maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks) {
    	MAX_PER_STAGE_DESCRIPTOR_UPDATE_AFTER_BIND_INLINE_UNIFORM_BLOCKS_HANDLE.set(segment, 0L, maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks);
    	return this;
    }
    
    public int maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks() {
    	return (int) MAX_PER_STAGE_DESCRIPTOR_UPDATE_AFTER_BIND_INLINE_UNIFORM_BLOCKS_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxDescriptorSetInlineUniformBlocks()
    public VkPhysicalDeviceInlineUniformBlockProperties maxDescriptorSetInlineUniformBlocks(int maxDescriptorSetInlineUniformBlocks) {
    	MAX_DESCRIPTOR_SET_INLINE_UNIFORM_BLOCKS_HANDLE.set(segment, 0L, maxDescriptorSetInlineUniformBlocks);
    	return this;
    }
    
    public int maxDescriptorSetInlineUniformBlocks() {
    	return (int) MAX_DESCRIPTOR_SET_INLINE_UNIFORM_BLOCKS_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxDescriptorSetUpdateAfterBindInlineUniformBlocks()
    public VkPhysicalDeviceInlineUniformBlockProperties maxDescriptorSetUpdateAfterBindInlineUniformBlocks(int maxDescriptorSetUpdateAfterBindInlineUniformBlocks) {
    	MAX_DESCRIPTOR_SET_UPDATE_AFTER_BIND_INLINE_UNIFORM_BLOCKS_HANDLE.set(segment, 0L, maxDescriptorSetUpdateAfterBindInlineUniformBlocks);
    	return this;
    }
    
    public int maxDescriptorSetUpdateAfterBindInlineUniformBlocks() {
    	return (int) MAX_DESCRIPTOR_SET_UPDATE_AFTER_BIND_INLINE_UNIFORM_BLOCKS_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceInlineUniformBlockProperties set(VkPhysicalDeviceInlineUniformBlockProperties other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceInlineUniformBlockProperties set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceInlineUniformBlockProperties> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceInlineUniformBlockProperties> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceInlineUniformBlockProperties(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceInlineUniformBlockProperties> array(SegmentAllocator allocator, VkPhysicalDeviceInlineUniformBlockProperties... structs) {
        NativeStructArray<VkPhysicalDeviceInlineUniformBlockProperties> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceInlineUniformBlockProperties(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceInlineUniformBlockProperties> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceInlineUniformBlockProperties(segment)
        );
    }

}