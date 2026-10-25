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

public final class VkAccelerationStructureDeviceAddressInfoKHR
		implements Struct<VkAccelerationStructureDeviceAddressInfoKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle ACCELERATION_STRUCTURE_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long ACCELERATION_STRUCTURE_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    UNBOUNDED_ADDRESS.withName("accelerationStructure")
		).withName("VkAccelerationStructureDeviceAddressInfoKHR").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		ACCELERATION_STRUCTURE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("accelerationStructure"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		ACCELERATION_STRUCTURE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("accelerationStructure"));
		//@formatter:on
	}

	public VkAccelerationStructureDeviceAddressInfoKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkAccelerationStructureDeviceAddressInfoKHR(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkAccelerationStructureDeviceAddressInfoKHR(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkAccelerationStructureDeviceAddressInfoKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkAccelerationStructureDeviceAddressInfoKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #accelerationStructure()
    public VkAccelerationStructureDeviceAddressInfoKHR accelerationStructure(VkAccelerationStructureKHR accelerationStructure) {
    	ACCELERATION_STRUCTURE_HANDLE.set(segment, 0L, accelerationStructure.memorySegment());
    	return this;
    }
    
    public @Nullable VkAccelerationStructureKHR accelerationStructure() {
    	MemorySegment segment = (MemorySegment) ACCELERATION_STRUCTURE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkAccelerationStructureKHR(segment);
    }
    
    @Override
    public VkAccelerationStructureDeviceAddressInfoKHR set(VkAccelerationStructureDeviceAddressInfoKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkAccelerationStructureDeviceAddressInfoKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkAccelerationStructureDeviceAddressInfoKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkAccelerationStructureDeviceAddressInfoKHR> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkAccelerationStructureDeviceAddressInfoKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkAccelerationStructureDeviceAddressInfoKHR> array(SegmentAllocator allocator, VkAccelerationStructureDeviceAddressInfoKHR... structs) {
        NativeStructArray<VkAccelerationStructureDeviceAddressInfoKHR> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkAccelerationStructureDeviceAddressInfoKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkAccelerationStructureDeviceAddressInfoKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkAccelerationStructureDeviceAddressInfoKHR(segment)
        );
    }

}