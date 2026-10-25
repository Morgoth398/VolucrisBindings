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
import volucris.bindings.core.NativeIntArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkPipelineColorWriteCreateInfoEXT
		implements Struct<VkPipelineColorWriteCreateInfoEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle ATTACHMENT_COUNT_HANDLE;
	public static final VarHandle P_COLOR_WRITE_ENABLES_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long ATTACHMENT_COUNT_BYTE_OFFSET;
	public static final long P_COLOR_WRITE_ENABLES_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("attachmentCount"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pColorWriteEnables")
		).withName("VkPipelineColorWriteCreateInfoEXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		ATTACHMENT_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("attachmentCount"));
		P_COLOR_WRITE_ENABLES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pColorWriteEnables"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		ATTACHMENT_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("attachmentCount"));
		P_COLOR_WRITE_ENABLES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pColorWriteEnables"));
		//@formatter:on
	}

	public VkPipelineColorWriteCreateInfoEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkPipelineColorWriteCreateInfoEXT(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPipelineColorWriteCreateInfoEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPipelineColorWriteCreateInfoEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPipelineColorWriteCreateInfoEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #attachmentCount()
    public VkPipelineColorWriteCreateInfoEXT attachmentCount(int attachmentCount) {
    	ATTACHMENT_COUNT_HANDLE.set(segment, 0L, attachmentCount);
    	return this;
    }
    
    public int attachmentCount() {
    	return (int) ATTACHMENT_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pColorWriteEnables()
    public VkPipelineColorWriteCreateInfoEXT pColorWriteEnables(NativeIntArray pColorWriteEnables) {
    	P_COLOR_WRITE_ENABLES_HANDLE.set(segment, 0L, pColorWriteEnables.memorySegment());
    	return this;
    }
    
    public @Nullable NativeIntArray pColorWriteEnables() {
    	MemorySegment segment = (MemorySegment) P_COLOR_WRITE_ENABLES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeIntArray(segment);
    }
    
    @Override
    public VkPipelineColorWriteCreateInfoEXT set(VkPipelineColorWriteCreateInfoEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkPipelineColorWriteCreateInfoEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPipelineColorWriteCreateInfoEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPipelineColorWriteCreateInfoEXT> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPipelineColorWriteCreateInfoEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPipelineColorWriteCreateInfoEXT> array(SegmentAllocator allocator, VkPipelineColorWriteCreateInfoEXT... structs) {
        NativeStructArray<VkPipelineColorWriteCreateInfoEXT> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPipelineColorWriteCreateInfoEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPipelineColorWriteCreateInfoEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPipelineColorWriteCreateInfoEXT(segment)
        );
    }

}