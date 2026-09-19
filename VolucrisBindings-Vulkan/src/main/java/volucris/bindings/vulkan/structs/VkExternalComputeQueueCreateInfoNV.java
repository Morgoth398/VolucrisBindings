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

public final class VkExternalComputeQueueCreateInfoNV
		implements Struct<VkExternalComputeQueueCreateInfoNV> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle PREFERRED_QUEUE_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long PREFERRED_QUEUE_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            UNBOUNDED_ADDRESS.withName("preferredQueue")
        ).withName("VkExternalComputeQueueCreateInfoNV").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        PREFERRED_QUEUE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("preferredQueue"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        PREFERRED_QUEUE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("preferredQueue"));
        //@formatter:on
    }

    public VkExternalComputeQueueCreateInfoNV() {
        this(Arena.ofAuto());
    }
    
    public VkExternalComputeQueueCreateInfoNV(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkExternalComputeQueueCreateInfoNV(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkExternalComputeQueueCreateInfoNV sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkExternalComputeQueueCreateInfoNV pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #preferredQueue()
    public VkExternalComputeQueueCreateInfoNV preferredQueue(VkQueue preferredQueue) {
    	PREFERRED_QUEUE_HANDLE.set(segment, 0L, preferredQueue.memorySegment());
    	return this;
    }
    
    public @Nullable VkQueue preferredQueue() {
    	MemorySegment segment = (MemorySegment) PREFERRED_QUEUE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkQueue(segment);
    }
    
    @Override
    public VkExternalComputeQueueCreateInfoNV set(VkExternalComputeQueueCreateInfoNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkExternalComputeQueueCreateInfoNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkExternalComputeQueueCreateInfoNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkExternalComputeQueueCreateInfoNV> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkExternalComputeQueueCreateInfoNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkExternalComputeQueueCreateInfoNV> array(Arena arena, VkExternalComputeQueueCreateInfoNV... structs) {
        NativeStructArray<VkExternalComputeQueueCreateInfoNV> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkExternalComputeQueueCreateInfoNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkExternalComputeQueueCreateInfoNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkExternalComputeQueueCreateInfoNV(segment)
        );
    }
    
}