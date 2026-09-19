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
import volucris.bindings.core.NativePointerArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkDeviceGroupDeviceCreateInfo
		implements Struct<VkDeviceGroupDeviceCreateInfo> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle PHYSICAL_DEVICE_COUNT_HANDLE;
    public static final VarHandle P_PHYSICAL_DEVICES_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long PHYSICAL_DEVICE_COUNT_BYTE_OFFSET;
    public static final long P_PHYSICAL_DEVICES_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("physicalDeviceCount"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pPhysicalDevices")
        ).withName("VkDeviceGroupDeviceCreateInfo").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        PHYSICAL_DEVICE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("physicalDeviceCount"));
        P_PHYSICAL_DEVICES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pPhysicalDevices"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        PHYSICAL_DEVICE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("physicalDeviceCount"));
        P_PHYSICAL_DEVICES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pPhysicalDevices"));
        //@formatter:on
    }

    public VkDeviceGroupDeviceCreateInfo() {
        this(Arena.ofAuto());
    }
    
    public VkDeviceGroupDeviceCreateInfo(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkDeviceGroupDeviceCreateInfo(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkDeviceGroupDeviceCreateInfo sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkDeviceGroupDeviceCreateInfo pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #physicalDeviceCount()
    public VkDeviceGroupDeviceCreateInfo physicalDeviceCount(int physicalDeviceCount) {
    	PHYSICAL_DEVICE_COUNT_HANDLE.set(segment, 0L, physicalDeviceCount);
    	return this;
    }
    
    public int physicalDeviceCount() {
    	return (int) PHYSICAL_DEVICE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pPhysicalDevices()
    public VkDeviceGroupDeviceCreateInfo pPhysicalDevices(NativePointerArray pPhysicalDevices) {
    	P_PHYSICAL_DEVICES_HANDLE.set(segment, 0L, pPhysicalDevices.memorySegment());
    	return this;
    }
    
    public @Nullable NativePointerArray pPhysicalDevices() {
    	MemorySegment segment = (MemorySegment) P_PHYSICAL_DEVICES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativePointerArray(segment);
    }
    
    @Override
    public VkDeviceGroupDeviceCreateInfo set(VkDeviceGroupDeviceCreateInfo other) {
        return set(other.segment);
    }
    
    @Override
    public VkDeviceGroupDeviceCreateInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDeviceGroupDeviceCreateInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDeviceGroupDeviceCreateInfo> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDeviceGroupDeviceCreateInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDeviceGroupDeviceCreateInfo> array(Arena arena, VkDeviceGroupDeviceCreateInfo... structs) {
        NativeStructArray<VkDeviceGroupDeviceCreateInfo> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDeviceGroupDeviceCreateInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDeviceGroupDeviceCreateInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDeviceGroupDeviceCreateInfo(segment)
        );
    }
    
}