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

public final class VkVertexInputBindingDescription
		implements Struct<VkVertexInputBindingDescription> {

    public static final StructLayout LAYOUT;

    public static final VarHandle BINDING_HANDLE;
    public static final VarHandle STRIDE_HANDLE;
    public static final VarHandle INPUT_RATE_HANDLE;

    public static final long BINDING_BYTE_OFFSET;
    public static final long STRIDE_BYTE_OFFSET;
    public static final long INPUT_RATE_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("binding"),
            JAVA_INT.withName("stride"),
            JAVA_INT.withName("inputRate")
        ).withName("VkVertexInputBindingDescription").withByteAlignment(4);
        
        BINDING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("binding"));
        STRIDE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("stride"));
        INPUT_RATE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("inputRate"));
        
        BINDING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("binding"));
        STRIDE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("stride"));
        INPUT_RATE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("inputRate"));
        //@formatter:on
    }

    public VkVertexInputBindingDescription() {
        this(Arena.ofAuto());
    }
    
    public VkVertexInputBindingDescription(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkVertexInputBindingDescription(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #binding()
    public VkVertexInputBindingDescription binding(int binding) {
    	BINDING_HANDLE.set(segment, 0L, binding);
    	return this;
    }
    
    public int binding() {
    	return (int) BINDING_HANDLE.get(segment, 0L);
    }
    
    /// @see #stride()
    public VkVertexInputBindingDescription stride(int stride) {
    	STRIDE_HANDLE.set(segment, 0L, stride);
    	return this;
    }
    
    public int stride() {
    	return (int) STRIDE_HANDLE.get(segment, 0L);
    }
    
    /// @see #inputRate()
    public VkVertexInputBindingDescription inputRate(int inputRate) {
    	INPUT_RATE_HANDLE.set(segment, 0L, inputRate);
    	return this;
    }
    
    public int inputRate() {
    	return (int) INPUT_RATE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkVertexInputBindingDescription set(VkVertexInputBindingDescription other) {
        return set(other.segment);
    }
    
    @Override
    public VkVertexInputBindingDescription set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkVertexInputBindingDescription> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkVertexInputBindingDescription> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkVertexInputBindingDescription(segment),
            count
        );
    }
    
    public static NativeStructArray<VkVertexInputBindingDescription> array(Arena arena, VkVertexInputBindingDescription... structs) {
        NativeStructArray<VkVertexInputBindingDescription> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkVertexInputBindingDescription(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkVertexInputBindingDescription> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkVertexInputBindingDescription(segment)
        );
    }
    
}