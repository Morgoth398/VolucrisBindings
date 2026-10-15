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

public final class VkPhysicalDeviceFaultFeaturesKHR
		implements Struct<VkPhysicalDeviceFaultFeaturesKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle DEVICE_FAULT_HANDLE;
	public static final VarHandle DEVICE_FAULT_VENDOR_BINARY_HANDLE;
	public static final VarHandle DEVICE_FAULT_REPORT_MASKED_HANDLE;
	public static final VarHandle DEVICE_FAULT_DEVICE_LOST_ON_MASKED_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long DEVICE_FAULT_BYTE_OFFSET;
	public static final long DEVICE_FAULT_VENDOR_BINARY_BYTE_OFFSET;
	public static final long DEVICE_FAULT_REPORT_MASKED_BYTE_OFFSET;
	public static final long DEVICE_FAULT_DEVICE_LOST_ON_MASKED_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("deviceFault"),
		    JAVA_INT.withName("deviceFaultVendorBinary"),
		    JAVA_INT.withName("deviceFaultReportMasked"),
		    JAVA_INT.withName("deviceFaultDeviceLostOnMasked")
		).withName("VkPhysicalDeviceFaultFeaturesKHR").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		DEVICE_FAULT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("deviceFault"));
		DEVICE_FAULT_VENDOR_BINARY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("deviceFaultVendorBinary"));
		DEVICE_FAULT_REPORT_MASKED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("deviceFaultReportMasked"));
		DEVICE_FAULT_DEVICE_LOST_ON_MASKED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("deviceFaultDeviceLostOnMasked"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		DEVICE_FAULT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("deviceFault"));
		DEVICE_FAULT_VENDOR_BINARY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("deviceFaultVendorBinary"));
		DEVICE_FAULT_REPORT_MASKED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("deviceFaultReportMasked"));
		DEVICE_FAULT_DEVICE_LOST_ON_MASKED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("deviceFaultDeviceLostOnMasked"));
		//@formatter:on
	}

	public VkPhysicalDeviceFaultFeaturesKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceFaultFeaturesKHR(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceFaultFeaturesKHR(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceFaultFeaturesKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceFaultFeaturesKHR pNext(MemorySegment pNext) {
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
    public VkPhysicalDeviceFaultFeaturesKHR deviceFault(int deviceFault) {
    	DEVICE_FAULT_HANDLE.set(segment, 0L, deviceFault);
    	return this;
    }
    
    public int deviceFault() {
    	return (int) DEVICE_FAULT_HANDLE.get(segment, 0L);
    }
    
    /// @see #deviceFaultVendorBinary()
    public VkPhysicalDeviceFaultFeaturesKHR deviceFaultVendorBinary(int deviceFaultVendorBinary) {
    	DEVICE_FAULT_VENDOR_BINARY_HANDLE.set(segment, 0L, deviceFaultVendorBinary);
    	return this;
    }
    
    public int deviceFaultVendorBinary() {
    	return (int) DEVICE_FAULT_VENDOR_BINARY_HANDLE.get(segment, 0L);
    }
    
    /// @see #deviceFaultReportMasked()
    public VkPhysicalDeviceFaultFeaturesKHR deviceFaultReportMasked(int deviceFaultReportMasked) {
    	DEVICE_FAULT_REPORT_MASKED_HANDLE.set(segment, 0L, deviceFaultReportMasked);
    	return this;
    }
    
    public int deviceFaultReportMasked() {
    	return (int) DEVICE_FAULT_REPORT_MASKED_HANDLE.get(segment, 0L);
    }
    
    /// @see #deviceFaultDeviceLostOnMasked()
    public VkPhysicalDeviceFaultFeaturesKHR deviceFaultDeviceLostOnMasked(int deviceFaultDeviceLostOnMasked) {
    	DEVICE_FAULT_DEVICE_LOST_ON_MASKED_HANDLE.set(segment, 0L, deviceFaultDeviceLostOnMasked);
    	return this;
    }
    
    public int deviceFaultDeviceLostOnMasked() {
    	return (int) DEVICE_FAULT_DEVICE_LOST_ON_MASKED_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceFaultFeaturesKHR set(VkPhysicalDeviceFaultFeaturesKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceFaultFeaturesKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceFaultFeaturesKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceFaultFeaturesKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceFaultFeaturesKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceFaultFeaturesKHR> array(Arena arena, VkPhysicalDeviceFaultFeaturesKHR... structs) {
        NativeStructArray<VkPhysicalDeviceFaultFeaturesKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceFaultFeaturesKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceFaultFeaturesKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceFaultFeaturesKHR(segment)
        );
    }

}