/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;

public final class VkDeviceFaultAddressInfoKHR
		implements Struct<VkDeviceFaultAddressInfoKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle ADDRESS_TYPE_HANDLE;
	public static final VarHandle REPORTED_ADDRESS_HANDLE;
	public static final VarHandle ADDRESS_PRECISION_HANDLE;

	public static final long ADDRESS_TYPE_BYTE_OFFSET;
	public static final long REPORTED_ADDRESS_BYTE_OFFSET;
	public static final long ADDRESS_PRECISION_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("addressType"),
		    MemoryLayout.paddingLayout(4),
		    JAVA_LONG.withName("reportedAddress"),
		    JAVA_LONG.withName("addressPrecision")
		).withName("VkDeviceFaultAddressInfoKHR").withByteAlignment(8);
		
		ADDRESS_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("addressType"));
		REPORTED_ADDRESS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("reportedAddress"));
		ADDRESS_PRECISION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("addressPrecision"));
		
		ADDRESS_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("addressType"));
		REPORTED_ADDRESS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("reportedAddress"));
		ADDRESS_PRECISION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("addressPrecision"));
		//@formatter:on
	}

	public VkDeviceFaultAddressInfoKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkDeviceFaultAddressInfoKHR(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkDeviceFaultAddressInfoKHR(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #addressType()
    public VkDeviceFaultAddressInfoKHR addressType(int addressType) {
    	ADDRESS_TYPE_HANDLE.set(segment, 0L, addressType);
    	return this;
    }
    
    public int addressType() {
    	return (int) ADDRESS_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #reportedAddress()
    public VkDeviceFaultAddressInfoKHR reportedAddress(long reportedAddress) {
    	REPORTED_ADDRESS_HANDLE.set(segment, 0L, reportedAddress);
    	return this;
    }
    
    public long reportedAddress() {
    	return (long) REPORTED_ADDRESS_HANDLE.get(segment, 0L);
    }
    
    /// @see #addressPrecision()
    public VkDeviceFaultAddressInfoKHR addressPrecision(long addressPrecision) {
    	ADDRESS_PRECISION_HANDLE.set(segment, 0L, addressPrecision);
    	return this;
    }
    
    public long addressPrecision() {
    	return (long) ADDRESS_PRECISION_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkDeviceFaultAddressInfoKHR set(VkDeviceFaultAddressInfoKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkDeviceFaultAddressInfoKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDeviceFaultAddressInfoKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDeviceFaultAddressInfoKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDeviceFaultAddressInfoKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDeviceFaultAddressInfoKHR> array(Arena arena, VkDeviceFaultAddressInfoKHR... structs) {
        NativeStructArray<VkDeviceFaultAddressInfoKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDeviceFaultAddressInfoKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDeviceFaultAddressInfoKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDeviceFaultAddressInfoKHR(segment)
        );
    }

}