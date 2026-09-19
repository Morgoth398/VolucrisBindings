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

public final class VkPresentTimingsInfoEXT
		implements Struct<VkPresentTimingsInfoEXT> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle SWAPCHAIN_COUNT_HANDLE;
    public static final VarHandle P_TIMING_INFOS_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long SWAPCHAIN_COUNT_BYTE_OFFSET;
    public static final long P_TIMING_INFOS_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("swapchainCount"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pTimingInfos")
        ).withName("VkPresentTimingsInfoEXT").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        SWAPCHAIN_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("swapchainCount"));
        P_TIMING_INFOS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pTimingInfos"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        SWAPCHAIN_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("swapchainCount"));
        P_TIMING_INFOS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pTimingInfos"));
        //@formatter:on
    }

    public VkPresentTimingsInfoEXT() {
        this(Arena.ofAuto());
    }
    
    public VkPresentTimingsInfoEXT(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkPresentTimingsInfoEXT(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkPresentTimingsInfoEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPresentTimingsInfoEXT pNext(MemorySegment pNext) {
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
    public VkPresentTimingsInfoEXT swapchainCount(int swapchainCount) {
    	SWAPCHAIN_COUNT_HANDLE.set(segment, 0L, swapchainCount);
    	return this;
    }
    
    public int swapchainCount() {
    	return (int) SWAPCHAIN_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pTimingInfos()
    public VkPresentTimingsInfoEXT pTimingInfos(NativeStructArray<VkPresentTimingInfoEXT> pTimingInfos) {
    	P_TIMING_INFOS_HANDLE.set(segment, 0L, pTimingInfos.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkPresentTimingInfoEXT> pTimingInfos() {
    	MemorySegment segment = (MemorySegment) P_TIMING_INFOS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkPresentTimingInfoEXT.array(segment);
    }
    
    @Override
    public VkPresentTimingsInfoEXT set(VkPresentTimingsInfoEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkPresentTimingsInfoEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPresentTimingsInfoEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPresentTimingsInfoEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPresentTimingsInfoEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPresentTimingsInfoEXT> array(Arena arena, VkPresentTimingsInfoEXT... structs) {
        NativeStructArray<VkPresentTimingsInfoEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPresentTimingsInfoEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPresentTimingsInfoEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPresentTimingsInfoEXT(segment)
        );
    }
    
}