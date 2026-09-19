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
import volucris.bindings.core.NativeIntArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkDeviceGroupPresentInfoKHR
		implements Struct<VkDeviceGroupPresentInfoKHR> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle SWAPCHAIN_COUNT_HANDLE;
    public static final VarHandle P_DEVICE_MASKS_HANDLE;
    public static final VarHandle MODE_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long SWAPCHAIN_COUNT_BYTE_OFFSET;
    public static final long P_DEVICE_MASKS_BYTE_OFFSET;
    public static final long MODE_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("swapchainCount"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pDeviceMasks"),
            JAVA_INT.withName("mode"),
            MemoryLayout.paddingLayout(4)
        ).withName("VkDeviceGroupPresentInfoKHR").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        SWAPCHAIN_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("swapchainCount"));
        P_DEVICE_MASKS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pDeviceMasks"));
        MODE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mode"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        SWAPCHAIN_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("swapchainCount"));
        P_DEVICE_MASKS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pDeviceMasks"));
        MODE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mode"));
        //@formatter:on
    }

    public VkDeviceGroupPresentInfoKHR() {
        this(Arena.ofAuto());
    }
    
    public VkDeviceGroupPresentInfoKHR(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkDeviceGroupPresentInfoKHR(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkDeviceGroupPresentInfoKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkDeviceGroupPresentInfoKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #swapchainCount()
    public VkDeviceGroupPresentInfoKHR swapchainCount(int swapchainCount) {
    	SWAPCHAIN_COUNT_HANDLE.set(segment, 0L, swapchainCount);
    	return this;
    }
    
    public int swapchainCount() {
    	return (int) SWAPCHAIN_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pDeviceMasks()
    public VkDeviceGroupPresentInfoKHR pDeviceMasks(NativeIntArray pDeviceMasks) {
    	P_DEVICE_MASKS_HANDLE.set(segment, 0L, pDeviceMasks.memorySegment());
    	return this;
    }
    
    public @Nullable NativeIntArray pDeviceMasks() {
    	MemorySegment segment = (MemorySegment) P_DEVICE_MASKS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeIntArray(segment);
    }
    
    /// @see #mode()
    public VkDeviceGroupPresentInfoKHR mode(int mode) {
    	MODE_HANDLE.set(segment, 0L, mode);
    	return this;
    }
    
    public int mode() {
    	return (int) MODE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkDeviceGroupPresentInfoKHR set(VkDeviceGroupPresentInfoKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkDeviceGroupPresentInfoKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDeviceGroupPresentInfoKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDeviceGroupPresentInfoKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDeviceGroupPresentInfoKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDeviceGroupPresentInfoKHR> array(Arena arena, VkDeviceGroupPresentInfoKHR... structs) {
        NativeStructArray<VkDeviceGroupPresentInfoKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDeviceGroupPresentInfoKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDeviceGroupPresentInfoKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDeviceGroupPresentInfoKHR(segment)
        );
    }
    
}