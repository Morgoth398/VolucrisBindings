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

public final class VkDeviceGroupBindSparseInfo
		implements Struct<VkDeviceGroupBindSparseInfo> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle RESOURCE_DEVICE_INDEX_HANDLE;
	public static final VarHandle MEMORY_DEVICE_INDEX_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long RESOURCE_DEVICE_INDEX_BYTE_OFFSET;
	public static final long MEMORY_DEVICE_INDEX_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("resourceDeviceIndex"),
		    JAVA_INT.withName("memoryDeviceIndex")
		).withName("VkDeviceGroupBindSparseInfo").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		RESOURCE_DEVICE_INDEX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("resourceDeviceIndex"));
		MEMORY_DEVICE_INDEX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("memoryDeviceIndex"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		RESOURCE_DEVICE_INDEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("resourceDeviceIndex"));
		MEMORY_DEVICE_INDEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("memoryDeviceIndex"));
		//@formatter:on
	}

	public VkDeviceGroupBindSparseInfo() {
	    this(Arena.ofAuto());
	}
	
	public VkDeviceGroupBindSparseInfo(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkDeviceGroupBindSparseInfo(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkDeviceGroupBindSparseInfo sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkDeviceGroupBindSparseInfo pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #resourceDeviceIndex()
    public VkDeviceGroupBindSparseInfo resourceDeviceIndex(int resourceDeviceIndex) {
    	RESOURCE_DEVICE_INDEX_HANDLE.set(segment, 0L, resourceDeviceIndex);
    	return this;
    }
    
    public int resourceDeviceIndex() {
    	return (int) RESOURCE_DEVICE_INDEX_HANDLE.get(segment, 0L);
    }
    
    /// @see #memoryDeviceIndex()
    public VkDeviceGroupBindSparseInfo memoryDeviceIndex(int memoryDeviceIndex) {
    	MEMORY_DEVICE_INDEX_HANDLE.set(segment, 0L, memoryDeviceIndex);
    	return this;
    }
    
    public int memoryDeviceIndex() {
    	return (int) MEMORY_DEVICE_INDEX_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkDeviceGroupBindSparseInfo set(VkDeviceGroupBindSparseInfo other) {
        return set(other.segment);
    }
    
    @Override
    public VkDeviceGroupBindSparseInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDeviceGroupBindSparseInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDeviceGroupBindSparseInfo> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkDeviceGroupBindSparseInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDeviceGroupBindSparseInfo> array(SegmentAllocator allocator, VkDeviceGroupBindSparseInfo... structs) {
        NativeStructArray<VkDeviceGroupBindSparseInfo> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkDeviceGroupBindSparseInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDeviceGroupBindSparseInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDeviceGroupBindSparseInfo(segment)
        );
    }

}