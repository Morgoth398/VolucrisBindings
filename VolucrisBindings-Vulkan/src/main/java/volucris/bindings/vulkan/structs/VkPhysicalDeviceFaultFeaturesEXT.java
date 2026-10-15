/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
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

public final class VkPhysicalDeviceFaultFeaturesEXT
		implements Struct<VkPhysicalDeviceFaultFeaturesEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle DEVICE_FAULT_HANDLE;
	public static final VarHandle DEVICE_FAULT_VENDOR_BINARY_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long DEVICE_FAULT_BYTE_OFFSET;
	public static final long DEVICE_FAULT_VENDOR_BINARY_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("deviceFault"),
		    JAVA_INT.withName("deviceFaultVendorBinary")
		).withName("VkPhysicalDeviceFaultFeaturesEXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		DEVICE_FAULT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("deviceFault"));
		DEVICE_FAULT_VENDOR_BINARY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("deviceFaultVendorBinary"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		DEVICE_FAULT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("deviceFault"));
		DEVICE_FAULT_VENDOR_BINARY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("deviceFaultVendorBinary"));
		//@formatter:on
	}

	public VkPhysicalDeviceFaultFeaturesEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceFaultFeaturesEXT(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceFaultFeaturesEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceFaultFeaturesEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceFaultFeaturesEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #deviceFault()
    public VkPhysicalDeviceFaultFeaturesEXT deviceFault(int deviceFault) {
    	DEVICE_FAULT_HANDLE.set(segment, 0L, deviceFault);
    	return this;
    }
    
    public int deviceFault() {
    	return (int) DEVICE_FAULT_HANDLE.get(segment, 0L);
    }
    
    /// @see #deviceFaultVendorBinary()
    public VkPhysicalDeviceFaultFeaturesEXT deviceFaultVendorBinary(int deviceFaultVendorBinary) {
    	DEVICE_FAULT_VENDOR_BINARY_HANDLE.set(segment, 0L, deviceFaultVendorBinary);
    	return this;
    }
    
    public int deviceFaultVendorBinary() {
    	return (int) DEVICE_FAULT_VENDOR_BINARY_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceFaultFeaturesEXT set(VkPhysicalDeviceFaultFeaturesEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceFaultFeaturesEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceFaultFeaturesEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceFaultFeaturesEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceFaultFeaturesEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceFaultFeaturesEXT> array(Arena arena, VkPhysicalDeviceFaultFeaturesEXT... structs) {
        NativeStructArray<VkPhysicalDeviceFaultFeaturesEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceFaultFeaturesEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceFaultFeaturesEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceFaultFeaturesEXT(segment)
        );
    }

}