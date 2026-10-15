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

public final class VkPhysicalDevicePCIBusInfoPropertiesEXT
		implements Struct<VkPhysicalDevicePCIBusInfoPropertiesEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle PCI_DOMAIN_HANDLE;
	public static final VarHandle PCI_BUS_HANDLE;
	public static final VarHandle PCI_DEVICE_HANDLE;
	public static final VarHandle PCI_FUNCTION_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long PCI_DOMAIN_BYTE_OFFSET;
	public static final long PCI_BUS_BYTE_OFFSET;
	public static final long PCI_DEVICE_BYTE_OFFSET;
	public static final long PCI_FUNCTION_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("pciDomain"),
		    JAVA_INT.withName("pciBus"),
		    JAVA_INT.withName("pciDevice"),
		    JAVA_INT.withName("pciFunction")
		).withName("VkPhysicalDevicePCIBusInfoPropertiesEXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		PCI_DOMAIN_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pciDomain"));
		PCI_BUS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pciBus"));
		PCI_DEVICE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pciDevice"));
		PCI_FUNCTION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pciFunction"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		PCI_DOMAIN_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pciDomain"));
		PCI_BUS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pciBus"));
		PCI_DEVICE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pciDevice"));
		PCI_FUNCTION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pciFunction"));
		//@formatter:on
	}

	public VkPhysicalDevicePCIBusInfoPropertiesEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDevicePCIBusInfoPropertiesEXT(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPhysicalDevicePCIBusInfoPropertiesEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDevicePCIBusInfoPropertiesEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDevicePCIBusInfoPropertiesEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #pciDomain()
    public VkPhysicalDevicePCIBusInfoPropertiesEXT pciDomain(int pciDomain) {
    	PCI_DOMAIN_HANDLE.set(segment, 0L, pciDomain);
    	return this;
    }
    
    public int pciDomain() {
    	return (int) PCI_DOMAIN_HANDLE.get(segment, 0L);
    }
    
    /// @see #pciBus()
    public VkPhysicalDevicePCIBusInfoPropertiesEXT pciBus(int pciBus) {
    	PCI_BUS_HANDLE.set(segment, 0L, pciBus);
    	return this;
    }
    
    public int pciBus() {
    	return (int) PCI_BUS_HANDLE.get(segment, 0L);
    }
    
    /// @see #pciDevice()
    public VkPhysicalDevicePCIBusInfoPropertiesEXT pciDevice(int pciDevice) {
    	PCI_DEVICE_HANDLE.set(segment, 0L, pciDevice);
    	return this;
    }
    
    public int pciDevice() {
    	return (int) PCI_DEVICE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pciFunction()
    public VkPhysicalDevicePCIBusInfoPropertiesEXT pciFunction(int pciFunction) {
    	PCI_FUNCTION_HANDLE.set(segment, 0L, pciFunction);
    	return this;
    }
    
    public int pciFunction() {
    	return (int) PCI_FUNCTION_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDevicePCIBusInfoPropertiesEXT set(VkPhysicalDevicePCIBusInfoPropertiesEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDevicePCIBusInfoPropertiesEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDevicePCIBusInfoPropertiesEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDevicePCIBusInfoPropertiesEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDevicePCIBusInfoPropertiesEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDevicePCIBusInfoPropertiesEXT> array(Arena arena, VkPhysicalDevicePCIBusInfoPropertiesEXT... structs) {
        NativeStructArray<VkPhysicalDevicePCIBusInfoPropertiesEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDevicePCIBusInfoPropertiesEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDevicePCIBusInfoPropertiesEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDevicePCIBusInfoPropertiesEXT(segment)
        );
    }

}