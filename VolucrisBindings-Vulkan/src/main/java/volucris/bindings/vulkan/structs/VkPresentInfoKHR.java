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
import volucris.bindings.core.NativePointerArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkPresentInfoKHR
		implements Struct<VkPresentInfoKHR> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle WAIT_SEMAPHORE_COUNT_HANDLE;
    public static final VarHandle P_WAIT_SEMAPHORES_HANDLE;
    public static final VarHandle SWAPCHAIN_COUNT_HANDLE;
    public static final VarHandle P_SWAPCHAINS_HANDLE;
    public static final VarHandle P_IMAGE_INDICES_HANDLE;
    public static final VarHandle P_RESULTS_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long WAIT_SEMAPHORE_COUNT_BYTE_OFFSET;
    public static final long P_WAIT_SEMAPHORES_BYTE_OFFSET;
    public static final long SWAPCHAIN_COUNT_BYTE_OFFSET;
    public static final long P_SWAPCHAINS_BYTE_OFFSET;
    public static final long P_IMAGE_INDICES_BYTE_OFFSET;
    public static final long P_RESULTS_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("waitSemaphoreCount"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pWaitSemaphores"),
            JAVA_INT.withName("swapchainCount"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pSwapchains"),
            UNBOUNDED_ADDRESS.withName("pImageIndices"),
            UNBOUNDED_ADDRESS.withName("pResults")
        ).withName("VkPresentInfoKHR").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        WAIT_SEMAPHORE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("waitSemaphoreCount"));
        P_WAIT_SEMAPHORES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pWaitSemaphores"));
        SWAPCHAIN_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("swapchainCount"));
        P_SWAPCHAINS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pSwapchains"));
        P_IMAGE_INDICES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pImageIndices"));
        P_RESULTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pResults"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        WAIT_SEMAPHORE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("waitSemaphoreCount"));
        P_WAIT_SEMAPHORES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pWaitSemaphores"));
        SWAPCHAIN_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("swapchainCount"));
        P_SWAPCHAINS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pSwapchains"));
        P_IMAGE_INDICES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pImageIndices"));
        P_RESULTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pResults"));
        //@formatter:on
    }

    public VkPresentInfoKHR() {
        this(Arena.ofAuto());
    }
    
    public VkPresentInfoKHR(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkPresentInfoKHR(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkPresentInfoKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPresentInfoKHR pNext(MemorySegment pNext) {
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
    public VkPresentInfoKHR waitSemaphoreCount(int waitSemaphoreCount) {
    	WAIT_SEMAPHORE_COUNT_HANDLE.set(segment, 0L, waitSemaphoreCount);
    	return this;
    }
    
    public int waitSemaphoreCount() {
    	return (int) WAIT_SEMAPHORE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pWaitSemaphores()
    public VkPresentInfoKHR pWaitSemaphores(NativePointerArray pWaitSemaphores) {
    	P_WAIT_SEMAPHORES_HANDLE.set(segment, 0L, pWaitSemaphores.memorySegment());
    	return this;
    }
    
    public @Nullable NativePointerArray pWaitSemaphores() {
    	MemorySegment segment = (MemorySegment) P_WAIT_SEMAPHORES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativePointerArray(segment);
    }
    
    /// @see #swapchainCount()
    public VkPresentInfoKHR swapchainCount(int swapchainCount) {
    	SWAPCHAIN_COUNT_HANDLE.set(segment, 0L, swapchainCount);
    	return this;
    }
    
    public int swapchainCount() {
    	return (int) SWAPCHAIN_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pSwapchains()
    public VkPresentInfoKHR pSwapchains(NativePointerArray pSwapchains) {
    	P_SWAPCHAINS_HANDLE.set(segment, 0L, pSwapchains.memorySegment());
    	return this;
    }
    
    public @Nullable NativePointerArray pSwapchains() {
    	MemorySegment segment = (MemorySegment) P_SWAPCHAINS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativePointerArray(segment);
    }
    
    /// @see #pImageIndices()
    public VkPresentInfoKHR pImageIndices(NativeIntArray pImageIndices) {
    	P_IMAGE_INDICES_HANDLE.set(segment, 0L, pImageIndices.memorySegment());
    	return this;
    }
    
    public @Nullable NativeIntArray pImageIndices() {
    	MemorySegment segment = (MemorySegment) P_IMAGE_INDICES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeIntArray(segment);
    }
    
    /// @see #pResults()
    public VkPresentInfoKHR pResults(NativeIntArray pResults) {
    	P_RESULTS_HANDLE.set(segment, 0L, pResults.memorySegment());
    	return this;
    }
    
    public @Nullable NativeIntArray pResults() {
    	MemorySegment segment = (MemorySegment) P_RESULTS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeIntArray(segment);
    }
    
    @Override
    public VkPresentInfoKHR set(VkPresentInfoKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkPresentInfoKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPresentInfoKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPresentInfoKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPresentInfoKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPresentInfoKHR> array(Arena arena, VkPresentInfoKHR... structs) {
        NativeStructArray<VkPresentInfoKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPresentInfoKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPresentInfoKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPresentInfoKHR(segment)
        );
    }
    
}