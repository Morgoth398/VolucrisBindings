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

public final class VkWriteDescriptorSetInlineUniformBlock
		implements Struct<VkWriteDescriptorSetInlineUniformBlock> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle DATA_SIZE_HANDLE;
	public static final VarHandle P_DATA_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long DATA_SIZE_BYTE_OFFSET;
	public static final long P_DATA_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("dataSize"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pData")
		).withName("VkWriteDescriptorSetInlineUniformBlock").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		DATA_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("dataSize"));
		P_DATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pData"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		DATA_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dataSize"));
		P_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pData"));
		//@formatter:on
	}

	public VkWriteDescriptorSetInlineUniformBlock() {
	    this(Arena.ofAuto());
	}
	
	public VkWriteDescriptorSetInlineUniformBlock(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkWriteDescriptorSetInlineUniformBlock(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkWriteDescriptorSetInlineUniformBlock sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkWriteDescriptorSetInlineUniformBlock pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #dataSize()
    public VkWriteDescriptorSetInlineUniformBlock dataSize(int dataSize) {
    	DATA_SIZE_HANDLE.set(segment, 0L, dataSize);
    	return this;
    }
    
    public int dataSize() {
    	return (int) DATA_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pData()
    public VkWriteDescriptorSetInlineUniformBlock pData(MemorySegment pData) {
    	P_DATA_HANDLE.set(segment, 0L, pData);
    	return this;
    }
    
    public @Nullable MemorySegment pData() {
    	MemorySegment segment = (MemorySegment) P_DATA_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    @Override
    public VkWriteDescriptorSetInlineUniformBlock set(VkWriteDescriptorSetInlineUniformBlock other) {
        return set(other.segment);
    }
    
    @Override
    public VkWriteDescriptorSetInlineUniformBlock set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkWriteDescriptorSetInlineUniformBlock> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkWriteDescriptorSetInlineUniformBlock> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkWriteDescriptorSetInlineUniformBlock(segment),
            count
        );
    }
    
    public static NativeStructArray<VkWriteDescriptorSetInlineUniformBlock> array(SegmentAllocator allocator, VkWriteDescriptorSetInlineUniformBlock... structs) {
        NativeStructArray<VkWriteDescriptorSetInlineUniformBlock> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkWriteDescriptorSetInlineUniformBlock(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkWriteDescriptorSetInlineUniformBlock> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkWriteDescriptorSetInlineUniformBlock(segment)
        );
    }

}