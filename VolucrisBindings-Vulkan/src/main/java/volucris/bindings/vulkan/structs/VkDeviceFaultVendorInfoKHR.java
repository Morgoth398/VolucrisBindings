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

public final class VkDeviceFaultVendorInfoKHR
		implements Struct<VkDeviceFaultVendorInfoKHR> {

    public static final StructLayout LAYOUT;

    public static final VarHandle DESCRIPTION_HANDLE;
    public static final VarHandle VENDOR_FAULT_CODE_HANDLE;
    public static final VarHandle VENDOR_FAULT_DATA_HANDLE;

    public static final long DESCRIPTION_BYTE_OFFSET;
    public static final long VENDOR_FAULT_CODE_BYTE_OFFSET;
    public static final long VENDOR_FAULT_DATA_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(256, JAVA_BYTE).withName("description"),
            JAVA_LONG.withName("vendorFaultCode"),
            JAVA_LONG.withName("vendorFaultData")
        ).withName("VkDeviceFaultVendorInfoKHR").withByteAlignment(8);
        
        DESCRIPTION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("description"), PathElement.sequenceElement());
        VENDOR_FAULT_CODE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("vendorFaultCode"));
        VENDOR_FAULT_DATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("vendorFaultData"));
        
        DESCRIPTION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("description"));
        VENDOR_FAULT_CODE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vendorFaultCode"));
        VENDOR_FAULT_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vendorFaultData"));
        //@formatter:on
    }

    public VkDeviceFaultVendorInfoKHR() {
        this(Arena.ofAuto());
    }
    
    public VkDeviceFaultVendorInfoKHR(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkDeviceFaultVendorInfoKHR(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #description(int)
    public VkDeviceFaultVendorInfoKHR description(byte description, int index0) {
    	DESCRIPTION_HANDLE.set(segment, 0L, index0, description);
    	return this;
    }
    
    public byte description(int index0) {
    	return (byte) DESCRIPTION_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #vendorFaultCode()
    public VkDeviceFaultVendorInfoKHR vendorFaultCode(long vendorFaultCode) {
    	VENDOR_FAULT_CODE_HANDLE.set(segment, 0L, vendorFaultCode);
    	return this;
    }
    
    public long vendorFaultCode() {
    	return (long) VENDOR_FAULT_CODE_HANDLE.get(segment, 0L);
    }
    
    /// @see #vendorFaultData()
    public VkDeviceFaultVendorInfoKHR vendorFaultData(long vendorFaultData) {
    	VENDOR_FAULT_DATA_HANDLE.set(segment, 0L, vendorFaultData);
    	return this;
    }
    
    public long vendorFaultData() {
    	return (long) VENDOR_FAULT_DATA_HANDLE.get(segment, 0L);
    }
    
    public String description() {
        return segment.getString(DESCRIPTION_BYTE_OFFSET);
    }
    
    @Override
    public VkDeviceFaultVendorInfoKHR set(VkDeviceFaultVendorInfoKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkDeviceFaultVendorInfoKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDeviceFaultVendorInfoKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDeviceFaultVendorInfoKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDeviceFaultVendorInfoKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDeviceFaultVendorInfoKHR> array(Arena arena, VkDeviceFaultVendorInfoKHR... structs) {
        NativeStructArray<VkDeviceFaultVendorInfoKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDeviceFaultVendorInfoKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDeviceFaultVendorInfoKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDeviceFaultVendorInfoKHR(segment)
        );
    }
    
}