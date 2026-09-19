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

public final class VkCommandBufferInheritanceViewportScissorInfoNV
		implements Struct<VkCommandBufferInheritanceViewportScissorInfoNV> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle VIEWPORT_SCISSOR2_D_HANDLE;
    public static final VarHandle VIEWPORT_DEPTH_COUNT_HANDLE;
    public static final VarHandle P_VIEWPORT_DEPTHS_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long VIEWPORT_SCISSOR2_D_BYTE_OFFSET;
    public static final long VIEWPORT_DEPTH_COUNT_BYTE_OFFSET;
    public static final long P_VIEWPORT_DEPTHS_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("viewportScissor2D"),
            JAVA_INT.withName("viewportDepthCount"),
            UNBOUNDED_ADDRESS.withName("pViewportDepths")
        ).withName("VkCommandBufferInheritanceViewportScissorInfoNV").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        VIEWPORT_SCISSOR2_D_HANDLE = LAYOUT.varHandle(PathElement.groupElement("viewportScissor2D"));
        VIEWPORT_DEPTH_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("viewportDepthCount"));
        P_VIEWPORT_DEPTHS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pViewportDepths"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        VIEWPORT_SCISSOR2_D_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("viewportScissor2D"));
        VIEWPORT_DEPTH_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("viewportDepthCount"));
        P_VIEWPORT_DEPTHS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pViewportDepths"));
        //@formatter:on
    }

    public VkCommandBufferInheritanceViewportScissorInfoNV() {
        this(Arena.ofAuto());
    }
    
    public VkCommandBufferInheritanceViewportScissorInfoNV(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkCommandBufferInheritanceViewportScissorInfoNV(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkCommandBufferInheritanceViewportScissorInfoNV sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkCommandBufferInheritanceViewportScissorInfoNV pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #viewportScissor2D()
    public VkCommandBufferInheritanceViewportScissorInfoNV viewportScissor2D(int viewportScissor2D) {
    	VIEWPORT_SCISSOR2_D_HANDLE.set(segment, 0L, viewportScissor2D);
    	return this;
    }
    
    public int viewportScissor2D() {
    	return (int) VIEWPORT_SCISSOR2_D_HANDLE.get(segment, 0L);
    }
    
    /// @see #viewportDepthCount()
    public VkCommandBufferInheritanceViewportScissorInfoNV viewportDepthCount(int viewportDepthCount) {
    	VIEWPORT_DEPTH_COUNT_HANDLE.set(segment, 0L, viewportDepthCount);
    	return this;
    }
    
    public int viewportDepthCount() {
    	return (int) VIEWPORT_DEPTH_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pViewportDepths()
    public VkCommandBufferInheritanceViewportScissorInfoNV pViewportDepths(VkViewport pViewportDepths) {
    	P_VIEWPORT_DEPTHS_HANDLE.set(segment, 0L, pViewportDepths.memorySegment());
    	return this;
    }
    
    public @Nullable VkViewport pViewportDepths() {
    	MemorySegment segment = (MemorySegment) P_VIEWPORT_DEPTHS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkViewport(segment);
    }
    
    @Override
    public VkCommandBufferInheritanceViewportScissorInfoNV set(VkCommandBufferInheritanceViewportScissorInfoNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkCommandBufferInheritanceViewportScissorInfoNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkCommandBufferInheritanceViewportScissorInfoNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkCommandBufferInheritanceViewportScissorInfoNV> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkCommandBufferInheritanceViewportScissorInfoNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkCommandBufferInheritanceViewportScissorInfoNV> array(Arena arena, VkCommandBufferInheritanceViewportScissorInfoNV... structs) {
        NativeStructArray<VkCommandBufferInheritanceViewportScissorInfoNV> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkCommandBufferInheritanceViewportScissorInfoNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkCommandBufferInheritanceViewportScissorInfoNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkCommandBufferInheritanceViewportScissorInfoNV(segment)
        );
    }
    
}