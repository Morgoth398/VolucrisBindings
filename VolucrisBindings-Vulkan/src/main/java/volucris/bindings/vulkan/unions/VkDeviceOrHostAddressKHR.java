/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.unions;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.UnionLayout;
import java.lang.invoke.VarHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.structs.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkDeviceOrHostAddressKHR
		implements Struct<VkDeviceOrHostAddressKHR> {

	public static final UnionLayout LAYOUT;

	public static final VarHandle DEVICE_ADDRESS_HANDLE;
	public static final VarHandle HOST_ADDRESS_HANDLE;

	public static final long DEVICE_ADDRESS_BYTE_OFFSET;
	public static final long HOST_ADDRESS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.unionLayout(
		    JAVA_LONG.withName("deviceAddress"),
		    UNBOUNDED_ADDRESS.withName("hostAddress")
		).withName("VkDeviceOrHostAddressKHR").withByteAlignment(8);
		
		DEVICE_ADDRESS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("deviceAddress"));
		HOST_ADDRESS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("hostAddress"));
		
		DEVICE_ADDRESS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("deviceAddress"));
		HOST_ADDRESS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("hostAddress"));
		//@formatter:on
	}

	public VkDeviceOrHostAddressKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkDeviceOrHostAddressKHR(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkDeviceOrHostAddressKHR(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #deviceAddress()
    public VkDeviceOrHostAddressKHR deviceAddress(long deviceAddress) {
    	DEVICE_ADDRESS_HANDLE.set(segment, 0L, deviceAddress);
    	return this;
    }
    
    public long deviceAddress() {
    	return (long) DEVICE_ADDRESS_HANDLE.get(segment, 0L);
    }
    
    /// @see #hostAddress()
    public VkDeviceOrHostAddressKHR hostAddress(MemorySegment hostAddress) {
    	HOST_ADDRESS_HANDLE.set(segment, 0L, hostAddress);
    	return this;
    }
    
    public @Nullable MemorySegment hostAddress() {
    	MemorySegment segment = (MemorySegment) HOST_ADDRESS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    @Override
    public VkDeviceOrHostAddressKHR set(VkDeviceOrHostAddressKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkDeviceOrHostAddressKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDeviceOrHostAddressKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDeviceOrHostAddressKHR> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkDeviceOrHostAddressKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDeviceOrHostAddressKHR> array(SegmentAllocator allocator, VkDeviceOrHostAddressKHR... structs) {
        NativeStructArray<VkDeviceOrHostAddressKHR> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkDeviceOrHostAddressKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDeviceOrHostAddressKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDeviceOrHostAddressKHR(segment)
        );
    }

}