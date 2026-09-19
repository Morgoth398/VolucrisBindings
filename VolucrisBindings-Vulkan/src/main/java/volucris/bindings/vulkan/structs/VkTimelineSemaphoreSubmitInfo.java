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
import volucris.bindings.core.NativeLongArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkTimelineSemaphoreSubmitInfo
		implements Struct<VkTimelineSemaphoreSubmitInfo> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle WAIT_SEMAPHORE_VALUE_COUNT_HANDLE;
    public static final VarHandle P_WAIT_SEMAPHORE_VALUES_HANDLE;
    public static final VarHandle SIGNAL_SEMAPHORE_VALUE_COUNT_HANDLE;
    public static final VarHandle P_SIGNAL_SEMAPHORE_VALUES_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long WAIT_SEMAPHORE_VALUE_COUNT_BYTE_OFFSET;
    public static final long P_WAIT_SEMAPHORE_VALUES_BYTE_OFFSET;
    public static final long SIGNAL_SEMAPHORE_VALUE_COUNT_BYTE_OFFSET;
    public static final long P_SIGNAL_SEMAPHORE_VALUES_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("waitSemaphoreValueCount"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pWaitSemaphoreValues"),
            JAVA_INT.withName("signalSemaphoreValueCount"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pSignalSemaphoreValues")
        ).withName("VkTimelineSemaphoreSubmitInfo").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        WAIT_SEMAPHORE_VALUE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("waitSemaphoreValueCount"));
        P_WAIT_SEMAPHORE_VALUES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pWaitSemaphoreValues"));
        SIGNAL_SEMAPHORE_VALUE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("signalSemaphoreValueCount"));
        P_SIGNAL_SEMAPHORE_VALUES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pSignalSemaphoreValues"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        WAIT_SEMAPHORE_VALUE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("waitSemaphoreValueCount"));
        P_WAIT_SEMAPHORE_VALUES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pWaitSemaphoreValues"));
        SIGNAL_SEMAPHORE_VALUE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("signalSemaphoreValueCount"));
        P_SIGNAL_SEMAPHORE_VALUES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pSignalSemaphoreValues"));
        //@formatter:on
    }

    public VkTimelineSemaphoreSubmitInfo() {
        this(Arena.ofAuto());
    }
    
    public VkTimelineSemaphoreSubmitInfo(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkTimelineSemaphoreSubmitInfo(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkTimelineSemaphoreSubmitInfo sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkTimelineSemaphoreSubmitInfo pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #waitSemaphoreValueCount()
    public VkTimelineSemaphoreSubmitInfo waitSemaphoreValueCount(int waitSemaphoreValueCount) {
    	WAIT_SEMAPHORE_VALUE_COUNT_HANDLE.set(segment, 0L, waitSemaphoreValueCount);
    	return this;
    }
    
    public int waitSemaphoreValueCount() {
    	return (int) WAIT_SEMAPHORE_VALUE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pWaitSemaphoreValues()
    public VkTimelineSemaphoreSubmitInfo pWaitSemaphoreValues(NativeLongArray pWaitSemaphoreValues) {
    	P_WAIT_SEMAPHORE_VALUES_HANDLE.set(segment, 0L, pWaitSemaphoreValues.memorySegment());
    	return this;
    }
    
    public @Nullable NativeLongArray pWaitSemaphoreValues() {
    	MemorySegment segment = (MemorySegment) P_WAIT_SEMAPHORE_VALUES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeLongArray(segment);
    }
    
    /// @see #signalSemaphoreValueCount()
    public VkTimelineSemaphoreSubmitInfo signalSemaphoreValueCount(int signalSemaphoreValueCount) {
    	SIGNAL_SEMAPHORE_VALUE_COUNT_HANDLE.set(segment, 0L, signalSemaphoreValueCount);
    	return this;
    }
    
    public int signalSemaphoreValueCount() {
    	return (int) SIGNAL_SEMAPHORE_VALUE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pSignalSemaphoreValues()
    public VkTimelineSemaphoreSubmitInfo pSignalSemaphoreValues(NativeLongArray pSignalSemaphoreValues) {
    	P_SIGNAL_SEMAPHORE_VALUES_HANDLE.set(segment, 0L, pSignalSemaphoreValues.memorySegment());
    	return this;
    }
    
    public @Nullable NativeLongArray pSignalSemaphoreValues() {
    	MemorySegment segment = (MemorySegment) P_SIGNAL_SEMAPHORE_VALUES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeLongArray(segment);
    }
    
    @Override
    public VkTimelineSemaphoreSubmitInfo set(VkTimelineSemaphoreSubmitInfo other) {
        return set(other.segment);
    }
    
    @Override
    public VkTimelineSemaphoreSubmitInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkTimelineSemaphoreSubmitInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkTimelineSemaphoreSubmitInfo> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkTimelineSemaphoreSubmitInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<VkTimelineSemaphoreSubmitInfo> array(Arena arena, VkTimelineSemaphoreSubmitInfo... structs) {
        NativeStructArray<VkTimelineSemaphoreSubmitInfo> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkTimelineSemaphoreSubmitInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkTimelineSemaphoreSubmitInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkTimelineSemaphoreSubmitInfo(segment)
        );
    }
    
}