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

public final class VkPhysicalDeviceLayeredApiPropertiesKHR
		implements Struct<VkPhysicalDeviceLayeredApiPropertiesKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle VENDOR_ID_HANDLE;
	public static final VarHandle DEVICE_ID_HANDLE;
	public static final VarHandle LAYERED_API_HANDLE;
	public static final VarHandle DEVICE_NAME_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long VENDOR_ID_BYTE_OFFSET;
	public static final long DEVICE_ID_BYTE_OFFSET;
	public static final long LAYERED_API_BYTE_OFFSET;
	public static final long DEVICE_NAME_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("vendorID"),
		    JAVA_INT.withName("deviceID"),
		    JAVA_INT.withName("layeredAPI"),
		    MemoryLayout.sequenceLayout(256, JAVA_BYTE).withName("deviceName"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPhysicalDeviceLayeredApiPropertiesKHR").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		VENDOR_ID_HANDLE = LAYOUT.varHandle(PathElement.groupElement("vendorID"));
		DEVICE_ID_HANDLE = LAYOUT.varHandle(PathElement.groupElement("deviceID"));
		LAYERED_API_HANDLE = LAYOUT.varHandle(PathElement.groupElement("layeredAPI"));
		DEVICE_NAME_HANDLE = LAYOUT.varHandle(PathElement.groupElement("deviceName"), PathElement.sequenceElement());
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		VENDOR_ID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vendorID"));
		DEVICE_ID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("deviceID"));
		LAYERED_API_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("layeredAPI"));
		DEVICE_NAME_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("deviceName"));
		//@formatter:on
	}

	public VkPhysicalDeviceLayeredApiPropertiesKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceLayeredApiPropertiesKHR(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceLayeredApiPropertiesKHR(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceLayeredApiPropertiesKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceLayeredApiPropertiesKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #vendorID()
    public VkPhysicalDeviceLayeredApiPropertiesKHR vendorID(int vendorID) {
    	VENDOR_ID_HANDLE.set(segment, 0L, vendorID);
    	return this;
    }
    
    public int vendorID() {
    	return (int) VENDOR_ID_HANDLE.get(segment, 0L);
    }
    
    /// @see #deviceID()
    public VkPhysicalDeviceLayeredApiPropertiesKHR deviceID(int deviceID) {
    	DEVICE_ID_HANDLE.set(segment, 0L, deviceID);
    	return this;
    }
    
    public int deviceID() {
    	return (int) DEVICE_ID_HANDLE.get(segment, 0L);
    }
    
    /// @see #layeredAPI()
    public VkPhysicalDeviceLayeredApiPropertiesKHR layeredAPI(int layeredAPI) {
    	LAYERED_API_HANDLE.set(segment, 0L, layeredAPI);
    	return this;
    }
    
    public int layeredAPI() {
    	return (int) LAYERED_API_HANDLE.get(segment, 0L);
    }
    
    /// @see #deviceName(int)
    public VkPhysicalDeviceLayeredApiPropertiesKHR deviceName(byte deviceName, int index0) {
    	DEVICE_NAME_HANDLE.set(segment, 0L, index0, deviceName);
    	return this;
    }
    
    public byte deviceName(int index0) {
    	return (byte) DEVICE_NAME_HANDLE.get(segment, 0L, index0);
    }
    
    @Override
    public VkPhysicalDeviceLayeredApiPropertiesKHR set(VkPhysicalDeviceLayeredApiPropertiesKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceLayeredApiPropertiesKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceLayeredApiPropertiesKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceLayeredApiPropertiesKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceLayeredApiPropertiesKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceLayeredApiPropertiesKHR> array(Arena arena, VkPhysicalDeviceLayeredApiPropertiesKHR... structs) {
        NativeStructArray<VkPhysicalDeviceLayeredApiPropertiesKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceLayeredApiPropertiesKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceLayeredApiPropertiesKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceLayeredApiPropertiesKHR(segment)
        );
    }

}