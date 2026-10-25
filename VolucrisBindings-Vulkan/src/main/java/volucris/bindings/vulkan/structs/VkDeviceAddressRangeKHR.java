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
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;

public final class VkDeviceAddressRangeKHR
		implements Struct<VkDeviceAddressRangeKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle ADDRESS_HANDLE;
	public static final VarHandle SIZE_HANDLE;

	public static final long ADDRESS_BYTE_OFFSET;
	public static final long SIZE_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_LONG.withName("address"),
		    JAVA_LONG.withName("size")
		).withName("VkDeviceAddressRangeKHR").withByteAlignment(8);
		
		ADDRESS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("address"));
		SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("size"));
		
		ADDRESS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("address"));
		SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("size"));
		//@formatter:on
	}

	public VkDeviceAddressRangeKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkDeviceAddressRangeKHR(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkDeviceAddressRangeKHR(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #address()
    public VkDeviceAddressRangeKHR address(long address) {
    	ADDRESS_HANDLE.set(segment, 0L, address);
    	return this;
    }
    
    public long address() {
    	return (long) ADDRESS_HANDLE.get(segment, 0L);
    }
    
    /// @see #size()
    public VkDeviceAddressRangeKHR size(long size) {
    	SIZE_HANDLE.set(segment, 0L, size);
    	return this;
    }
    
    public long size() {
    	return (long) SIZE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkDeviceAddressRangeKHR set(VkDeviceAddressRangeKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkDeviceAddressRangeKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDeviceAddressRangeKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDeviceAddressRangeKHR> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkDeviceAddressRangeKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDeviceAddressRangeKHR> array(SegmentAllocator allocator, VkDeviceAddressRangeKHR... structs) {
        NativeStructArray<VkDeviceAddressRangeKHR> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkDeviceAddressRangeKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDeviceAddressRangeKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDeviceAddressRangeKHR(segment)
        );
    }

}