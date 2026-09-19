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

public final class VkFenceGetFdInfoKHR
		implements Struct<VkFenceGetFdInfoKHR> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle FENCE_HANDLE;
    public static final VarHandle HANDLE_TYPE_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long FENCE_BYTE_OFFSET;
    public static final long HANDLE_TYPE_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            UNBOUNDED_ADDRESS.withName("fence"),
            JAVA_INT.withName("handleType"),
            MemoryLayout.paddingLayout(4)
        ).withName("VkFenceGetFdInfoKHR").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        FENCE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("fence"));
        HANDLE_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("handleType"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        FENCE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("fence"));
        HANDLE_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("handleType"));
        //@formatter:on
    }

    public VkFenceGetFdInfoKHR() {
        this(Arena.ofAuto());
    }
    
    public VkFenceGetFdInfoKHR(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkFenceGetFdInfoKHR(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkFenceGetFdInfoKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkFenceGetFdInfoKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #fence()
    public VkFenceGetFdInfoKHR fence(VkFence fence) {
    	FENCE_HANDLE.set(segment, 0L, fence.memorySegment());
    	return this;
    }
    
    public @Nullable VkFence fence() {
    	MemorySegment segment = (MemorySegment) FENCE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkFence(segment);
    }
    
    /// @see #handleType()
    public VkFenceGetFdInfoKHR handleType(int handleType) {
    	HANDLE_TYPE_HANDLE.set(segment, 0L, handleType);
    	return this;
    }
    
    public int handleType() {
    	return (int) HANDLE_TYPE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkFenceGetFdInfoKHR set(VkFenceGetFdInfoKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkFenceGetFdInfoKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkFenceGetFdInfoKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkFenceGetFdInfoKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkFenceGetFdInfoKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkFenceGetFdInfoKHR> array(Arena arena, VkFenceGetFdInfoKHR... structs) {
        NativeStructArray<VkFenceGetFdInfoKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkFenceGetFdInfoKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkFenceGetFdInfoKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkFenceGetFdInfoKHR(segment)
        );
    }
    
}