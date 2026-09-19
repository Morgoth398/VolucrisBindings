/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;

public final class VkBindVertexBufferIndirectCommandNV
		implements Struct<VkBindVertexBufferIndirectCommandNV> {

    public static final StructLayout LAYOUT;

    public static final VarHandle BUFFER_ADDRESS_HANDLE;
    public static final VarHandle SIZE_HANDLE;
    public static final VarHandle STRIDE_HANDLE;

    public static final long BUFFER_ADDRESS_BYTE_OFFSET;
    public static final long SIZE_BYTE_OFFSET;
    public static final long STRIDE_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_LONG.withName("bufferAddress"),
            JAVA_INT.withName("size"),
            JAVA_INT.withName("stride")
        ).withName("VkBindVertexBufferIndirectCommandNV").withByteAlignment(8);
        
        BUFFER_ADDRESS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("bufferAddress"));
        SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("size"));
        STRIDE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("stride"));
        
        BUFFER_ADDRESS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("bufferAddress"));
        SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("size"));
        STRIDE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("stride"));
        //@formatter:on
    }

    public VkBindVertexBufferIndirectCommandNV() {
        this(Arena.ofAuto());
    }
    
    public VkBindVertexBufferIndirectCommandNV(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkBindVertexBufferIndirectCommandNV(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #bufferAddress()
    public VkBindVertexBufferIndirectCommandNV bufferAddress(long bufferAddress) {
    	BUFFER_ADDRESS_HANDLE.set(segment, 0L, bufferAddress);
    	return this;
    }
    
    public long bufferAddress() {
    	return (long) BUFFER_ADDRESS_HANDLE.get(segment, 0L);
    }
    
    /// @see #size()
    public VkBindVertexBufferIndirectCommandNV size(int size) {
    	SIZE_HANDLE.set(segment, 0L, size);
    	return this;
    }
    
    public int size() {
    	return (int) SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #stride()
    public VkBindVertexBufferIndirectCommandNV stride(int stride) {
    	STRIDE_HANDLE.set(segment, 0L, stride);
    	return this;
    }
    
    public int stride() {
    	return (int) STRIDE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkBindVertexBufferIndirectCommandNV set(VkBindVertexBufferIndirectCommandNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkBindVertexBufferIndirectCommandNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkBindVertexBufferIndirectCommandNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkBindVertexBufferIndirectCommandNV> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkBindVertexBufferIndirectCommandNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkBindVertexBufferIndirectCommandNV> array(Arena arena, VkBindVertexBufferIndirectCommandNV... structs) {
        NativeStructArray<VkBindVertexBufferIndirectCommandNV> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkBindVertexBufferIndirectCommandNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkBindVertexBufferIndirectCommandNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkBindVertexBufferIndirectCommandNV(segment)
        );
    }
    
}