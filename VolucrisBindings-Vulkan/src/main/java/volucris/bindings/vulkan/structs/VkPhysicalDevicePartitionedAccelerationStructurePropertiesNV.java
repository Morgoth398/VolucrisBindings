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

public final class VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV
		implements Struct<VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle MAX_PARTITION_COUNT_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long MAX_PARTITION_COUNT_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("maxPartitionCount"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		MAX_PARTITION_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxPartitionCount"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		MAX_PARTITION_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxPartitionCount"));
		//@formatter:on
	}

	public VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #maxPartitionCount()
    public VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV maxPartitionCount(int maxPartitionCount) {
    	MAX_PARTITION_COUNT_HANDLE.set(segment, 0L, maxPartitionCount);
    	return this;
    }
    
    public int maxPartitionCount() {
    	return (int) MAX_PARTITION_COUNT_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV set(VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV> array(SegmentAllocator allocator, VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV... structs) {
        NativeStructArray<VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDevicePartitionedAccelerationStructurePropertiesNV(segment)
        );
    }

}