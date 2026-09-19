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

public final class VkSwapchainTimingPropertiesEXT
		implements Struct<VkSwapchainTimingPropertiesEXT> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle REFRESH_DURATION_HANDLE;
    public static final VarHandle REFRESH_INTERVAL_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long REFRESH_DURATION_BYTE_OFFSET;
    public static final long REFRESH_INTERVAL_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_LONG.withName("refreshDuration"),
            JAVA_LONG.withName("refreshInterval")
        ).withName("VkSwapchainTimingPropertiesEXT").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        REFRESH_DURATION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("refreshDuration"));
        REFRESH_INTERVAL_HANDLE = LAYOUT.varHandle(PathElement.groupElement("refreshInterval"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        REFRESH_DURATION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("refreshDuration"));
        REFRESH_INTERVAL_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("refreshInterval"));
        //@formatter:on
    }

    public VkSwapchainTimingPropertiesEXT() {
        this(Arena.ofAuto());
    }
    
    public VkSwapchainTimingPropertiesEXT(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkSwapchainTimingPropertiesEXT(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkSwapchainTimingPropertiesEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkSwapchainTimingPropertiesEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #refreshDuration()
    public VkSwapchainTimingPropertiesEXT refreshDuration(long refreshDuration) {
    	REFRESH_DURATION_HANDLE.set(segment, 0L, refreshDuration);
    	return this;
    }
    
    public long refreshDuration() {
    	return (long) REFRESH_DURATION_HANDLE.get(segment, 0L);
    }
    
    /// @see #refreshInterval()
    public VkSwapchainTimingPropertiesEXT refreshInterval(long refreshInterval) {
    	REFRESH_INTERVAL_HANDLE.set(segment, 0L, refreshInterval);
    	return this;
    }
    
    public long refreshInterval() {
    	return (long) REFRESH_INTERVAL_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkSwapchainTimingPropertiesEXT set(VkSwapchainTimingPropertiesEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkSwapchainTimingPropertiesEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkSwapchainTimingPropertiesEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkSwapchainTimingPropertiesEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkSwapchainTimingPropertiesEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkSwapchainTimingPropertiesEXT> array(Arena arena, VkSwapchainTimingPropertiesEXT... structs) {
        NativeStructArray<VkSwapchainTimingPropertiesEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkSwapchainTimingPropertiesEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkSwapchainTimingPropertiesEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkSwapchainTimingPropertiesEXT(segment)
        );
    }
    
}