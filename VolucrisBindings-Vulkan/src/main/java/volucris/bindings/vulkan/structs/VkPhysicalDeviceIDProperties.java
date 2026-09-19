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

public final class VkPhysicalDeviceIDProperties
		implements Struct<VkPhysicalDeviceIDProperties> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle DEVICE_UUID_HANDLE;
    public static final VarHandle DRIVER_UUID_HANDLE;
    public static final VarHandle DEVICE_LUID_HANDLE;
    public static final VarHandle DEVICE_NODE_MASK_HANDLE;
    public static final VarHandle DEVICE_LUIDVALID_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long DEVICE_UUID_BYTE_OFFSET;
    public static final long DRIVER_UUID_BYTE_OFFSET;
    public static final long DEVICE_LUID_BYTE_OFFSET;
    public static final long DEVICE_NODE_MASK_BYTE_OFFSET;
    public static final long DEVICE_LUIDVALID_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            MemoryLayout.sequenceLayout(16, JAVA_BYTE).withName("deviceUUID"),
            MemoryLayout.sequenceLayout(16, JAVA_BYTE).withName("driverUUID"),
            MemoryLayout.sequenceLayout(8, JAVA_BYTE).withName("deviceLUID"),
            JAVA_INT.withName("deviceNodeMask"),
            JAVA_INT.withName("deviceLUIDValid")
        ).withName("VkPhysicalDeviceIDProperties").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        DEVICE_UUID_HANDLE = LAYOUT.varHandle(PathElement.groupElement("deviceUUID"), PathElement.sequenceElement());
        DRIVER_UUID_HANDLE = LAYOUT.varHandle(PathElement.groupElement("driverUUID"), PathElement.sequenceElement());
        DEVICE_LUID_HANDLE = LAYOUT.varHandle(PathElement.groupElement("deviceLUID"), PathElement.sequenceElement());
        DEVICE_NODE_MASK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("deviceNodeMask"));
        DEVICE_LUIDVALID_HANDLE = LAYOUT.varHandle(PathElement.groupElement("deviceLUIDValid"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        DEVICE_UUID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("deviceUUID"));
        DRIVER_UUID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("driverUUID"));
        DEVICE_LUID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("deviceLUID"));
        DEVICE_NODE_MASK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("deviceNodeMask"));
        DEVICE_LUIDVALID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("deviceLUIDValid"));
        //@formatter:on
    }

    public VkPhysicalDeviceIDProperties() {
        this(Arena.ofAuto());
    }
    
    public VkPhysicalDeviceIDProperties(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkPhysicalDeviceIDProperties(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkPhysicalDeviceIDProperties sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceIDProperties pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #deviceUUID(int)
    public VkPhysicalDeviceIDProperties deviceUUID(byte deviceUUID, int index0) {
    	DEVICE_UUID_HANDLE.set(segment, 0L, index0, deviceUUID);
    	return this;
    }
    
    public byte deviceUUID(int index0) {
    	return (byte) DEVICE_UUID_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #driverUUID(int)
    public VkPhysicalDeviceIDProperties driverUUID(byte driverUUID, int index0) {
    	DRIVER_UUID_HANDLE.set(segment, 0L, index0, driverUUID);
    	return this;
    }
    
    public byte driverUUID(int index0) {
    	return (byte) DRIVER_UUID_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #deviceLUID(int)
    public VkPhysicalDeviceIDProperties deviceLUID(byte deviceLUID, int index0) {
    	DEVICE_LUID_HANDLE.set(segment, 0L, index0, deviceLUID);
    	return this;
    }
    
    public byte deviceLUID(int index0) {
    	return (byte) DEVICE_LUID_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #deviceNodeMask()
    public VkPhysicalDeviceIDProperties deviceNodeMask(int deviceNodeMask) {
    	DEVICE_NODE_MASK_HANDLE.set(segment, 0L, deviceNodeMask);
    	return this;
    }
    
    public int deviceNodeMask() {
    	return (int) DEVICE_NODE_MASK_HANDLE.get(segment, 0L);
    }
    
    /// @see #deviceLUIDValid()
    public VkPhysicalDeviceIDProperties deviceLUIDValid(int deviceLUIDValid) {
    	DEVICE_LUIDVALID_HANDLE.set(segment, 0L, deviceLUIDValid);
    	return this;
    }
    
    public int deviceLUIDValid() {
    	return (int) DEVICE_LUIDVALID_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceIDProperties set(VkPhysicalDeviceIDProperties other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceIDProperties set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceIDProperties> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceIDProperties> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceIDProperties(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceIDProperties> array(Arena arena, VkPhysicalDeviceIDProperties... structs) {
        NativeStructArray<VkPhysicalDeviceIDProperties> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceIDProperties(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceIDProperties> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceIDProperties(segment)
        );
    }
    
}