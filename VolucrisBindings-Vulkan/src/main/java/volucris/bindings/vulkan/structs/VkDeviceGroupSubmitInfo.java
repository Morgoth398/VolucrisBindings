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

public final class VkDeviceGroupSubmitInfo
		implements Struct<VkDeviceGroupSubmitInfo> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle WAIT_SEMAPHORE_COUNT_HANDLE;
    public static final VarHandle P_WAIT_SEMAPHORE_DEVICE_INDICES_HANDLE;
    public static final VarHandle COMMAND_BUFFER_COUNT_HANDLE;
    public static final VarHandle P_COMMAND_BUFFER_DEVICE_MASKS_HANDLE;
    public static final VarHandle SIGNAL_SEMAPHORE_COUNT_HANDLE;
    public static final VarHandle P_SIGNAL_SEMAPHORE_DEVICE_INDICES_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long WAIT_SEMAPHORE_COUNT_BYTE_OFFSET;
    public static final long P_WAIT_SEMAPHORE_DEVICE_INDICES_BYTE_OFFSET;
    public static final long COMMAND_BUFFER_COUNT_BYTE_OFFSET;
    public static final long P_COMMAND_BUFFER_DEVICE_MASKS_BYTE_OFFSET;
    public static final long SIGNAL_SEMAPHORE_COUNT_BYTE_OFFSET;
    public static final long P_SIGNAL_SEMAPHORE_DEVICE_INDICES_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("waitSemaphoreCount"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pWaitSemaphoreDeviceIndices"),
            JAVA_INT.withName("commandBufferCount"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pCommandBufferDeviceMasks"),
            JAVA_INT.withName("signalSemaphoreCount"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pSignalSemaphoreDeviceIndices")
        ).withName("VkDeviceGroupSubmitInfo").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        WAIT_SEMAPHORE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("waitSemaphoreCount"));
        P_WAIT_SEMAPHORE_DEVICE_INDICES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pWaitSemaphoreDeviceIndices"));
        COMMAND_BUFFER_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("commandBufferCount"));
        P_COMMAND_BUFFER_DEVICE_MASKS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pCommandBufferDeviceMasks"));
        SIGNAL_SEMAPHORE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("signalSemaphoreCount"));
        P_SIGNAL_SEMAPHORE_DEVICE_INDICES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pSignalSemaphoreDeviceIndices"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        WAIT_SEMAPHORE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("waitSemaphoreCount"));
        P_WAIT_SEMAPHORE_DEVICE_INDICES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pWaitSemaphoreDeviceIndices"));
        COMMAND_BUFFER_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("commandBufferCount"));
        P_COMMAND_BUFFER_DEVICE_MASKS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pCommandBufferDeviceMasks"));
        SIGNAL_SEMAPHORE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("signalSemaphoreCount"));
        P_SIGNAL_SEMAPHORE_DEVICE_INDICES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pSignalSemaphoreDeviceIndices"));
        //@formatter:on
    }

    public VkDeviceGroupSubmitInfo() {
        this(Arena.ofAuto());
    }
    
    public VkDeviceGroupSubmitInfo(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkDeviceGroupSubmitInfo(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkDeviceGroupSubmitInfo sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkDeviceGroupSubmitInfo pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #waitSemaphoreCount()
    public VkDeviceGroupSubmitInfo waitSemaphoreCount(int waitSemaphoreCount) {
    	WAIT_SEMAPHORE_COUNT_HANDLE.set(segment, 0L, waitSemaphoreCount);
    	return this;
    }
    
    public int waitSemaphoreCount() {
    	return (int) WAIT_SEMAPHORE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pWaitSemaphoreDeviceIndices()
    public VkDeviceGroupSubmitInfo pWaitSemaphoreDeviceIndices(NativeIntArray pWaitSemaphoreDeviceIndices) {
    	P_WAIT_SEMAPHORE_DEVICE_INDICES_HANDLE.set(segment, 0L, pWaitSemaphoreDeviceIndices.memorySegment());
    	return this;
    }
    
    public @Nullable NativeIntArray pWaitSemaphoreDeviceIndices() {
    	MemorySegment segment = (MemorySegment) P_WAIT_SEMAPHORE_DEVICE_INDICES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeIntArray(segment);
    }
    
    /// @see #commandBufferCount()
    public VkDeviceGroupSubmitInfo commandBufferCount(int commandBufferCount) {
    	COMMAND_BUFFER_COUNT_HANDLE.set(segment, 0L, commandBufferCount);
    	return this;
    }
    
    public int commandBufferCount() {
    	return (int) COMMAND_BUFFER_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pCommandBufferDeviceMasks()
    public VkDeviceGroupSubmitInfo pCommandBufferDeviceMasks(NativeIntArray pCommandBufferDeviceMasks) {
    	P_COMMAND_BUFFER_DEVICE_MASKS_HANDLE.set(segment, 0L, pCommandBufferDeviceMasks.memorySegment());
    	return this;
    }
    
    public @Nullable NativeIntArray pCommandBufferDeviceMasks() {
    	MemorySegment segment = (MemorySegment) P_COMMAND_BUFFER_DEVICE_MASKS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeIntArray(segment);
    }
    
    /// @see #signalSemaphoreCount()
    public VkDeviceGroupSubmitInfo signalSemaphoreCount(int signalSemaphoreCount) {
    	SIGNAL_SEMAPHORE_COUNT_HANDLE.set(segment, 0L, signalSemaphoreCount);
    	return this;
    }
    
    public int signalSemaphoreCount() {
    	return (int) SIGNAL_SEMAPHORE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pSignalSemaphoreDeviceIndices()
    public VkDeviceGroupSubmitInfo pSignalSemaphoreDeviceIndices(NativeIntArray pSignalSemaphoreDeviceIndices) {
    	P_SIGNAL_SEMAPHORE_DEVICE_INDICES_HANDLE.set(segment, 0L, pSignalSemaphoreDeviceIndices.memorySegment());
    	return this;
    }
    
    public @Nullable NativeIntArray pSignalSemaphoreDeviceIndices() {
    	MemorySegment segment = (MemorySegment) P_SIGNAL_SEMAPHORE_DEVICE_INDICES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeIntArray(segment);
    }
    
    @Override
    public VkDeviceGroupSubmitInfo set(VkDeviceGroupSubmitInfo other) {
        return set(other.segment);
    }
    
    @Override
    public VkDeviceGroupSubmitInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDeviceGroupSubmitInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDeviceGroupSubmitInfo> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDeviceGroupSubmitInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDeviceGroupSubmitInfo> array(Arena arena, VkDeviceGroupSubmitInfo... structs) {
        NativeStructArray<VkDeviceGroupSubmitInfo> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDeviceGroupSubmitInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDeviceGroupSubmitInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDeviceGroupSubmitInfo(segment)
        );
    }
    
}