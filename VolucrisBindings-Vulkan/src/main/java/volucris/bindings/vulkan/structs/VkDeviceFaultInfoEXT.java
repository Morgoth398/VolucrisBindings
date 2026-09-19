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

public final class VkDeviceFaultInfoEXT
		implements Struct<VkDeviceFaultInfoEXT> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle DESCRIPTION_HANDLE;
    public static final VarHandle P_ADDRESS_INFOS_HANDLE;
    public static final VarHandle P_VENDOR_INFOS_HANDLE;
    public static final VarHandle P_VENDOR_BINARY_DATA_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long DESCRIPTION_BYTE_OFFSET;
    public static final long P_ADDRESS_INFOS_BYTE_OFFSET;
    public static final long P_VENDOR_INFOS_BYTE_OFFSET;
    public static final long P_VENDOR_BINARY_DATA_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            MemoryLayout.sequenceLayout(256, JAVA_BYTE).withName("description"),
            UNBOUNDED_ADDRESS.withName("pAddressInfos"),
            UNBOUNDED_ADDRESS.withName("pVendorInfos"),
            UNBOUNDED_ADDRESS.withName("pVendorBinaryData")
        ).withName("VkDeviceFaultInfoEXT").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        DESCRIPTION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("description"), PathElement.sequenceElement());
        P_ADDRESS_INFOS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pAddressInfos"));
        P_VENDOR_INFOS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pVendorInfos"));
        P_VENDOR_BINARY_DATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pVendorBinaryData"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        DESCRIPTION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("description"));
        P_ADDRESS_INFOS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pAddressInfos"));
        P_VENDOR_INFOS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pVendorInfos"));
        P_VENDOR_BINARY_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pVendorBinaryData"));
        //@formatter:on
    }

    public VkDeviceFaultInfoEXT() {
        this(Arena.ofAuto());
    }
    
    public VkDeviceFaultInfoEXT(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkDeviceFaultInfoEXT(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkDeviceFaultInfoEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkDeviceFaultInfoEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #description(int)
    public VkDeviceFaultInfoEXT description(byte description, int index0) {
    	DESCRIPTION_HANDLE.set(segment, 0L, index0, description);
    	return this;
    }
    
    public byte description(int index0) {
    	return (byte) DESCRIPTION_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #pAddressInfos()
    public VkDeviceFaultInfoEXT pAddressInfos(VkDeviceFaultAddressInfoKHR pAddressInfos) {
    	P_ADDRESS_INFOS_HANDLE.set(segment, 0L, pAddressInfos.memorySegment());
    	return this;
    }
    
    public @Nullable VkDeviceFaultAddressInfoKHR pAddressInfos() {
    	MemorySegment segment = (MemorySegment) P_ADDRESS_INFOS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkDeviceFaultAddressInfoKHR(segment);
    }
    
    /// @see #pVendorInfos()
    public VkDeviceFaultInfoEXT pVendorInfos(VkDeviceFaultVendorInfoKHR pVendorInfos) {
    	P_VENDOR_INFOS_HANDLE.set(segment, 0L, pVendorInfos.memorySegment());
    	return this;
    }
    
    public @Nullable VkDeviceFaultVendorInfoKHR pVendorInfos() {
    	MemorySegment segment = (MemorySegment) P_VENDOR_INFOS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkDeviceFaultVendorInfoKHR(segment);
    }
    
    /// @see #pVendorBinaryData()
    public VkDeviceFaultInfoEXT pVendorBinaryData(MemorySegment pVendorBinaryData) {
    	P_VENDOR_BINARY_DATA_HANDLE.set(segment, 0L, pVendorBinaryData);
    	return this;
    }
    
    public @Nullable MemorySegment pVendorBinaryData() {
    	MemorySegment segment = (MemorySegment) P_VENDOR_BINARY_DATA_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    public String description() {
        return segment.getString(DESCRIPTION_BYTE_OFFSET);
    }
    
    @Override
    public VkDeviceFaultInfoEXT set(VkDeviceFaultInfoEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkDeviceFaultInfoEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDeviceFaultInfoEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDeviceFaultInfoEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDeviceFaultInfoEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDeviceFaultInfoEXT> array(Arena arena, VkDeviceFaultInfoEXT... structs) {
        NativeStructArray<VkDeviceFaultInfoEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDeviceFaultInfoEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDeviceFaultInfoEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDeviceFaultInfoEXT(segment)
        );
    }
    
}