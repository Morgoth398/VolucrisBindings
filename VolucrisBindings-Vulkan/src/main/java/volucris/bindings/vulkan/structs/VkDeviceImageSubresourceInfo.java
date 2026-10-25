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

public final class VkDeviceImageSubresourceInfo
		implements Struct<VkDeviceImageSubresourceInfo> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle P_CREATE_INFO_HANDLE;
	public static final VarHandle P_SUBRESOURCE_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long P_CREATE_INFO_BYTE_OFFSET;
	public static final long P_SUBRESOURCE_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    UNBOUNDED_ADDRESS.withName("pCreateInfo"),
		    UNBOUNDED_ADDRESS.withName("pSubresource")
		).withName("VkDeviceImageSubresourceInfo").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		P_CREATE_INFO_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pCreateInfo"));
		P_SUBRESOURCE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pSubresource"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		P_CREATE_INFO_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pCreateInfo"));
		P_SUBRESOURCE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pSubresource"));
		//@formatter:on
	}

	public VkDeviceImageSubresourceInfo() {
	    this(Arena.ofAuto());
	}
	
	public VkDeviceImageSubresourceInfo(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkDeviceImageSubresourceInfo(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkDeviceImageSubresourceInfo sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkDeviceImageSubresourceInfo pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #pCreateInfo()
    public VkDeviceImageSubresourceInfo pCreateInfo(VkImageCreateInfo pCreateInfo) {
    	P_CREATE_INFO_HANDLE.set(segment, 0L, pCreateInfo.memorySegment());
    	return this;
    }
    
    public @Nullable VkImageCreateInfo pCreateInfo() {
    	MemorySegment segment = (MemorySegment) P_CREATE_INFO_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkImageCreateInfo(segment);
    }
    
    /// @see #pSubresource()
    public VkDeviceImageSubresourceInfo pSubresource(VkImageSubresource2 pSubresource) {
    	P_SUBRESOURCE_HANDLE.set(segment, 0L, pSubresource.memorySegment());
    	return this;
    }
    
    public @Nullable VkImageSubresource2 pSubresource() {
    	MemorySegment segment = (MemorySegment) P_SUBRESOURCE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkImageSubresource2(segment);
    }
    
    @Override
    public VkDeviceImageSubresourceInfo set(VkDeviceImageSubresourceInfo other) {
        return set(other.segment);
    }
    
    @Override
    public VkDeviceImageSubresourceInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDeviceImageSubresourceInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDeviceImageSubresourceInfo> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkDeviceImageSubresourceInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDeviceImageSubresourceInfo> array(SegmentAllocator allocator, VkDeviceImageSubresourceInfo... structs) {
        NativeStructArray<VkDeviceImageSubresourceInfo> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkDeviceImageSubresourceInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDeviceImageSubresourceInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDeviceImageSubresourceInfo(segment)
        );
    }

}