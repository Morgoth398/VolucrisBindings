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

public final class VkMutableDescriptorTypeCreateInfoEXT
		implements Struct<VkMutableDescriptorTypeCreateInfoEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle MUTABLE_DESCRIPTOR_TYPE_LIST_COUNT_HANDLE;
	public static final VarHandle P_MUTABLE_DESCRIPTOR_TYPE_LISTS_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long MUTABLE_DESCRIPTOR_TYPE_LIST_COUNT_BYTE_OFFSET;
	public static final long P_MUTABLE_DESCRIPTOR_TYPE_LISTS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("mutableDescriptorTypeListCount"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pMutableDescriptorTypeLists")
		).withName("VkMutableDescriptorTypeCreateInfoEXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		MUTABLE_DESCRIPTOR_TYPE_LIST_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mutableDescriptorTypeListCount"));
		P_MUTABLE_DESCRIPTOR_TYPE_LISTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pMutableDescriptorTypeLists"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		MUTABLE_DESCRIPTOR_TYPE_LIST_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mutableDescriptorTypeListCount"));
		P_MUTABLE_DESCRIPTOR_TYPE_LISTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pMutableDescriptorTypeLists"));
		//@formatter:on
	}

	public VkMutableDescriptorTypeCreateInfoEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkMutableDescriptorTypeCreateInfoEXT(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkMutableDescriptorTypeCreateInfoEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkMutableDescriptorTypeCreateInfoEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkMutableDescriptorTypeCreateInfoEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #mutableDescriptorTypeListCount()
    public VkMutableDescriptorTypeCreateInfoEXT mutableDescriptorTypeListCount(int mutableDescriptorTypeListCount) {
    	MUTABLE_DESCRIPTOR_TYPE_LIST_COUNT_HANDLE.set(segment, 0L, mutableDescriptorTypeListCount);
    	return this;
    }
    
    public int mutableDescriptorTypeListCount() {
    	return (int) MUTABLE_DESCRIPTOR_TYPE_LIST_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pMutableDescriptorTypeLists()
    public VkMutableDescriptorTypeCreateInfoEXT pMutableDescriptorTypeLists(NativeStructArray<VkMutableDescriptorTypeListEXT> pMutableDescriptorTypeLists) {
    	P_MUTABLE_DESCRIPTOR_TYPE_LISTS_HANDLE.set(segment, 0L, pMutableDescriptorTypeLists.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkMutableDescriptorTypeListEXT> pMutableDescriptorTypeLists() {
    	MemorySegment segment = (MemorySegment) P_MUTABLE_DESCRIPTOR_TYPE_LISTS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkMutableDescriptorTypeListEXT.array(segment);
    }
    
    @Override
    public VkMutableDescriptorTypeCreateInfoEXT set(VkMutableDescriptorTypeCreateInfoEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkMutableDescriptorTypeCreateInfoEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkMutableDescriptorTypeCreateInfoEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkMutableDescriptorTypeCreateInfoEXT> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkMutableDescriptorTypeCreateInfoEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkMutableDescriptorTypeCreateInfoEXT> array(SegmentAllocator allocator, VkMutableDescriptorTypeCreateInfoEXT... structs) {
        NativeStructArray<VkMutableDescriptorTypeCreateInfoEXT> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkMutableDescriptorTypeCreateInfoEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkMutableDescriptorTypeCreateInfoEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkMutableDescriptorTypeCreateInfoEXT(segment)
        );
    }

}