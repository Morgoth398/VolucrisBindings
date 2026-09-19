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

public final class VkOutOfBandQueueTypeInfoNV
		implements Struct<VkOutOfBandQueueTypeInfoNV> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle QUEUE_TYPE_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long QUEUE_TYPE_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("queueType"),
            MemoryLayout.paddingLayout(4)
        ).withName("VkOutOfBandQueueTypeInfoNV").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        QUEUE_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("queueType"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        QUEUE_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("queueType"));
        //@formatter:on
    }

    public VkOutOfBandQueueTypeInfoNV() {
        this(Arena.ofAuto());
    }
    
    public VkOutOfBandQueueTypeInfoNV(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkOutOfBandQueueTypeInfoNV(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkOutOfBandQueueTypeInfoNV sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkOutOfBandQueueTypeInfoNV pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #queueType()
    public VkOutOfBandQueueTypeInfoNV queueType(int queueType) {
    	QUEUE_TYPE_HANDLE.set(segment, 0L, queueType);
    	return this;
    }
    
    public int queueType() {
    	return (int) QUEUE_TYPE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkOutOfBandQueueTypeInfoNV set(VkOutOfBandQueueTypeInfoNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkOutOfBandQueueTypeInfoNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkOutOfBandQueueTypeInfoNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkOutOfBandQueueTypeInfoNV> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkOutOfBandQueueTypeInfoNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkOutOfBandQueueTypeInfoNV> array(Arena arena, VkOutOfBandQueueTypeInfoNV... structs) {
        NativeStructArray<VkOutOfBandQueueTypeInfoNV> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkOutOfBandQueueTypeInfoNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkOutOfBandQueueTypeInfoNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkOutOfBandQueueTypeInfoNV(segment)
        );
    }
    
}