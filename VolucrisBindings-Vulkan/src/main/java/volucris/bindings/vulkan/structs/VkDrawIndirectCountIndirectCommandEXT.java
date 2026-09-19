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

public final class VkDrawIndirectCountIndirectCommandEXT
		implements Struct<VkDrawIndirectCountIndirectCommandEXT> {

    public static final StructLayout LAYOUT;

    public static final VarHandle BUFFER_ADDRESS_HANDLE;
    public static final VarHandle STRIDE_HANDLE;
    public static final VarHandle COMMAND_COUNT_HANDLE;

    public static final long BUFFER_ADDRESS_BYTE_OFFSET;
    public static final long STRIDE_BYTE_OFFSET;
    public static final long COMMAND_COUNT_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_LONG.withName("bufferAddress"),
            JAVA_INT.withName("stride"),
            JAVA_INT.withName("commandCount")
        ).withName("VkDrawIndirectCountIndirectCommandEXT").withByteAlignment(8);
        
        BUFFER_ADDRESS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("bufferAddress"));
        STRIDE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("stride"));
        COMMAND_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("commandCount"));
        
        BUFFER_ADDRESS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("bufferAddress"));
        STRIDE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("stride"));
        COMMAND_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("commandCount"));
        //@formatter:on
    }

    public VkDrawIndirectCountIndirectCommandEXT() {
        this(Arena.ofAuto());
    }
    
    public VkDrawIndirectCountIndirectCommandEXT(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkDrawIndirectCountIndirectCommandEXT(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #bufferAddress()
    public VkDrawIndirectCountIndirectCommandEXT bufferAddress(long bufferAddress) {
    	BUFFER_ADDRESS_HANDLE.set(segment, 0L, bufferAddress);
    	return this;
    }
    
    public long bufferAddress() {
    	return (long) BUFFER_ADDRESS_HANDLE.get(segment, 0L);
    }
    
    /// @see #stride()
    public VkDrawIndirectCountIndirectCommandEXT stride(int stride) {
    	STRIDE_HANDLE.set(segment, 0L, stride);
    	return this;
    }
    
    public int stride() {
    	return (int) STRIDE_HANDLE.get(segment, 0L);
    }
    
    /// @see #commandCount()
    public VkDrawIndirectCountIndirectCommandEXT commandCount(int commandCount) {
    	COMMAND_COUNT_HANDLE.set(segment, 0L, commandCount);
    	return this;
    }
    
    public int commandCount() {
    	return (int) COMMAND_COUNT_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkDrawIndirectCountIndirectCommandEXT set(VkDrawIndirectCountIndirectCommandEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkDrawIndirectCountIndirectCommandEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDrawIndirectCountIndirectCommandEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDrawIndirectCountIndirectCommandEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDrawIndirectCountIndirectCommandEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDrawIndirectCountIndirectCommandEXT> array(Arena arena, VkDrawIndirectCountIndirectCommandEXT... structs) {
        NativeStructArray<VkDrawIndirectCountIndirectCommandEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDrawIndirectCountIndirectCommandEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDrawIndirectCountIndirectCommandEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDrawIndirectCountIndirectCommandEXT(segment)
        );
    }
    
}