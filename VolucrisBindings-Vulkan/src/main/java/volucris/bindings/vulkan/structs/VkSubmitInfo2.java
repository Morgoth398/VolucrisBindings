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

public final class VkSubmitInfo2
		implements Struct<VkSubmitInfo2> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle FLAGS_HANDLE;
    public static final VarHandle WAIT_SEMAPHORE_INFO_COUNT_HANDLE;
    public static final VarHandle P_WAIT_SEMAPHORE_INFOS_HANDLE;
    public static final VarHandle COMMAND_BUFFER_INFO_COUNT_HANDLE;
    public static final VarHandle P_COMMAND_BUFFER_INFOS_HANDLE;
    public static final VarHandle SIGNAL_SEMAPHORE_INFO_COUNT_HANDLE;
    public static final VarHandle P_SIGNAL_SEMAPHORE_INFOS_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long FLAGS_BYTE_OFFSET;
    public static final long WAIT_SEMAPHORE_INFO_COUNT_BYTE_OFFSET;
    public static final long P_WAIT_SEMAPHORE_INFOS_BYTE_OFFSET;
    public static final long COMMAND_BUFFER_INFO_COUNT_BYTE_OFFSET;
    public static final long P_COMMAND_BUFFER_INFOS_BYTE_OFFSET;
    public static final long SIGNAL_SEMAPHORE_INFO_COUNT_BYTE_OFFSET;
    public static final long P_SIGNAL_SEMAPHORE_INFOS_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("flags"),
            JAVA_INT.withName("waitSemaphoreInfoCount"),
            UNBOUNDED_ADDRESS.withName("pWaitSemaphoreInfos"),
            JAVA_INT.withName("commandBufferInfoCount"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pCommandBufferInfos"),
            JAVA_INT.withName("signalSemaphoreInfoCount"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pSignalSemaphoreInfos")
        ).withName("VkSubmitInfo2").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
        WAIT_SEMAPHORE_INFO_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("waitSemaphoreInfoCount"));
        P_WAIT_SEMAPHORE_INFOS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pWaitSemaphoreInfos"));
        COMMAND_BUFFER_INFO_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("commandBufferInfoCount"));
        P_COMMAND_BUFFER_INFOS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pCommandBufferInfos"));
        SIGNAL_SEMAPHORE_INFO_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("signalSemaphoreInfoCount"));
        P_SIGNAL_SEMAPHORE_INFOS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pSignalSemaphoreInfos"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
        WAIT_SEMAPHORE_INFO_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("waitSemaphoreInfoCount"));
        P_WAIT_SEMAPHORE_INFOS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pWaitSemaphoreInfos"));
        COMMAND_BUFFER_INFO_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("commandBufferInfoCount"));
        P_COMMAND_BUFFER_INFOS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pCommandBufferInfos"));
        SIGNAL_SEMAPHORE_INFO_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("signalSemaphoreInfoCount"));
        P_SIGNAL_SEMAPHORE_INFOS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pSignalSemaphoreInfos"));
        //@formatter:on
    }

    public VkSubmitInfo2() {
        this(Arena.ofAuto());
    }
    
    public VkSubmitInfo2(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkSubmitInfo2(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkSubmitInfo2 sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkSubmitInfo2 pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #flags()
    public VkSubmitInfo2 flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #waitSemaphoreInfoCount()
    public VkSubmitInfo2 waitSemaphoreInfoCount(int waitSemaphoreInfoCount) {
    	WAIT_SEMAPHORE_INFO_COUNT_HANDLE.set(segment, 0L, waitSemaphoreInfoCount);
    	return this;
    }
    
    public int waitSemaphoreInfoCount() {
    	return (int) WAIT_SEMAPHORE_INFO_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pWaitSemaphoreInfos()
    public VkSubmitInfo2 pWaitSemaphoreInfos(NativeStructArray<VkSemaphoreSubmitInfo> pWaitSemaphoreInfos) {
    	P_WAIT_SEMAPHORE_INFOS_HANDLE.set(segment, 0L, pWaitSemaphoreInfos.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkSemaphoreSubmitInfo> pWaitSemaphoreInfos() {
    	MemorySegment segment = (MemorySegment) P_WAIT_SEMAPHORE_INFOS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkSemaphoreSubmitInfo.array(segment);
    }
    
    /// @see #commandBufferInfoCount()
    public VkSubmitInfo2 commandBufferInfoCount(int commandBufferInfoCount) {
    	COMMAND_BUFFER_INFO_COUNT_HANDLE.set(segment, 0L, commandBufferInfoCount);
    	return this;
    }
    
    public int commandBufferInfoCount() {
    	return (int) COMMAND_BUFFER_INFO_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pCommandBufferInfos()
    public VkSubmitInfo2 pCommandBufferInfos(NativeStructArray<VkCommandBufferSubmitInfo> pCommandBufferInfos) {
    	P_COMMAND_BUFFER_INFOS_HANDLE.set(segment, 0L, pCommandBufferInfos.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkCommandBufferSubmitInfo> pCommandBufferInfos() {
    	MemorySegment segment = (MemorySegment) P_COMMAND_BUFFER_INFOS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkCommandBufferSubmitInfo.array(segment);
    }
    
    /// @see #signalSemaphoreInfoCount()
    public VkSubmitInfo2 signalSemaphoreInfoCount(int signalSemaphoreInfoCount) {
    	SIGNAL_SEMAPHORE_INFO_COUNT_HANDLE.set(segment, 0L, signalSemaphoreInfoCount);
    	return this;
    }
    
    public int signalSemaphoreInfoCount() {
    	return (int) SIGNAL_SEMAPHORE_INFO_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pSignalSemaphoreInfos()
    public VkSubmitInfo2 pSignalSemaphoreInfos(NativeStructArray<VkSemaphoreSubmitInfo> pSignalSemaphoreInfos) {
    	P_SIGNAL_SEMAPHORE_INFOS_HANDLE.set(segment, 0L, pSignalSemaphoreInfos.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkSemaphoreSubmitInfo> pSignalSemaphoreInfos() {
    	MemorySegment segment = (MemorySegment) P_SIGNAL_SEMAPHORE_INFOS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkSemaphoreSubmitInfo.array(segment);
    }
    
    @Override
    public VkSubmitInfo2 set(VkSubmitInfo2 other) {
        return set(other.segment);
    }
    
    @Override
    public VkSubmitInfo2 set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkSubmitInfo2> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkSubmitInfo2> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkSubmitInfo2(segment),
            count
        );
    }
    
    public static NativeStructArray<VkSubmitInfo2> array(Arena arena, VkSubmitInfo2... structs) {
        NativeStructArray<VkSubmitInfo2> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkSubmitInfo2(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkSubmitInfo2> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkSubmitInfo2(segment)
        );
    }
    
}