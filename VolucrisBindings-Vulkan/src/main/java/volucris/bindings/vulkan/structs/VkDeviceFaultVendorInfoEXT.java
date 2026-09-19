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
import static volucris.bindings.core.FFMUtils.UNBOUNDED_ADDRESS;

/**
 * 
 */
public final class VkDeviceFaultVendorInfoEXT
		implements Struct<VkDeviceFaultVendorInfoEXT> {

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
        ).withName("VkDeviceFaultVendorInfoEXT").withByteAlignment(8);
        
        DESCRIPTION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("description"), PathElement.sequenceElement());
        VENDOR_FAULT_CODE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("vendorFaultCode"));
        VENDOR_FAULT_DATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("vendorFaultData"));
        
        DESCRIPTION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("description"));
        VENDOR_FAULT_CODE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vendorFaultCode"));
        VENDOR_FAULT_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vendorFaultData"));
        //@formatter:on
    }

    public VkDeviceFaultVendorInfoEXT() {
        this(Arena.ofAuto());
    }
    
    public VkDeviceFaultVendorInfoEXT(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkDeviceFaultVendorInfoEXT(MemorySegment segment) {
        this.segment = segment;
    
    }

    public VkDeviceFaultVendorInfoEXT description(byte description, long index) {
        DESCRIPTION_HANDLE.set(segment, 0L, index, description);
        return this;
    }
    
    public byte description(long index) {
        return (byte) DESCRIPTION_HANDLE.get(segment, 0L, index);
    }
    
    public String description() {
        return segment.getString(DESCRIPTION_BYTE_OFFSET);
    }
    
    public VkDeviceFaultVendorInfoEXT vendorFaultCode(long vendorFaultCode) {
        VENDOR_FAULT_CODE_HANDLE.set(segment, 0L, vendorFaultCode);
        return this;
    }
    
    public long vendorFaultCode() {
        return (long) VENDOR_FAULT_CODE_HANDLE.get(segment, 0L);
    }
    
    public VkDeviceFaultVendorInfoEXT vendorFaultData(long vendorFaultData) {
        VENDOR_FAULT_DATA_HANDLE.set(segment, 0L, vendorFaultData);
        return this;
    }
    
    public long vendorFaultData() {
        return (long) VENDOR_FAULT_DATA_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkDeviceFaultVendorInfoEXT set(VkDeviceFaultVendorInfoEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkDeviceFaultVendorInfoEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDeviceFaultVendorInfoEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDeviceFaultVendorInfoEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDeviceFaultVendorInfoEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDeviceFaultVendorInfoEXT> array(Arena arena, VkDeviceFaultVendorInfoEXT... structs) {
        NativeStructArray<VkDeviceFaultVendorInfoEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDeviceFaultVendorInfoEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDeviceFaultVendorInfoEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDeviceFaultVendorInfoEXT(segment)
        );
    }
    
}