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

public final class VkPhysicalDeviceGroupProperties
		implements Struct<VkPhysicalDeviceGroupProperties> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle PHYSICAL_DEVICE_COUNT_HANDLE;
	public static final VarHandle PHYSICAL_DEVICES_HANDLE;
	public static final VarHandle SUBSET_ALLOCATION_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long PHYSICAL_DEVICE_COUNT_BYTE_OFFSET;
	public static final long PHYSICAL_DEVICES_BYTE_OFFSET;
	public static final long SUBSET_ALLOCATION_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("physicalDeviceCount"),
		    MemoryLayout.paddingLayout(4),
		    MemoryLayout.sequenceLayout(32, UNBOUNDED_ADDRESS).withName("physicalDevices"),
		    JAVA_INT.withName("subsetAllocation"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPhysicalDeviceGroupProperties").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		PHYSICAL_DEVICE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("physicalDeviceCount"));
		PHYSICAL_DEVICES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("physicalDevices"), PathElement.sequenceElement());
		SUBSET_ALLOCATION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("subsetAllocation"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		PHYSICAL_DEVICE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("physicalDeviceCount"));
		PHYSICAL_DEVICES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("physicalDevices"));
		SUBSET_ALLOCATION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("subsetAllocation"));
		//@formatter:on
	}

	public VkPhysicalDeviceGroupProperties() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceGroupProperties(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceGroupProperties(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceGroupProperties sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceGroupProperties pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #physicalDeviceCount()
    public VkPhysicalDeviceGroupProperties physicalDeviceCount(int physicalDeviceCount) {
    	PHYSICAL_DEVICE_COUNT_HANDLE.set(segment, 0L, physicalDeviceCount);
    	return this;
    }
    
    public int physicalDeviceCount() {
    	return (int) PHYSICAL_DEVICE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #physicalDevices(int)
    public VkPhysicalDeviceGroupProperties physicalDevices(VkPhysicalDevice physicalDevices, int index0) {
    	PHYSICAL_DEVICES_HANDLE.set(segment, 0L, index0, physicalDevices.memorySegment());
    	return this;
    }
    
    public @Nullable VkPhysicalDevice physicalDevices(int index0) {
    	MemorySegment segment = (MemorySegment) PHYSICAL_DEVICES_HANDLE.get(this.segment, 0L, index0);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkPhysicalDevice(segment);
    }
    
    /// @see #subsetAllocation()
    public VkPhysicalDeviceGroupProperties subsetAllocation(int subsetAllocation) {
    	SUBSET_ALLOCATION_HANDLE.set(segment, 0L, subsetAllocation);
    	return this;
    }
    
    public int subsetAllocation() {
    	return (int) SUBSET_ALLOCATION_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceGroupProperties set(VkPhysicalDeviceGroupProperties other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceGroupProperties set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceGroupProperties> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceGroupProperties> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceGroupProperties(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceGroupProperties> array(SegmentAllocator allocator, VkPhysicalDeviceGroupProperties... structs) {
        NativeStructArray<VkPhysicalDeviceGroupProperties> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceGroupProperties(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceGroupProperties> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceGroupProperties(segment)
        );
    }

}