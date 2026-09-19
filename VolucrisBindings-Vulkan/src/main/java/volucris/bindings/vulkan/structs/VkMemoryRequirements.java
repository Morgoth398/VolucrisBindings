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

public final class VkMemoryRequirements
		implements Struct<VkMemoryRequirements> {

    public static final StructLayout LAYOUT;

    public static final VarHandle SIZE_HANDLE;
    public static final VarHandle ALIGNMENT_HANDLE;
    public static final VarHandle MEMORY_TYPE_BITS_HANDLE;

    public static final long SIZE_BYTE_OFFSET;
    public static final long ALIGNMENT_BYTE_OFFSET;
    public static final long MEMORY_TYPE_BITS_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_LONG.withName("size"),
            JAVA_LONG.withName("alignment"),
            JAVA_INT.withName("memoryTypeBits"),
            MemoryLayout.paddingLayout(4)
        ).withName("VkMemoryRequirements").withByteAlignment(8);
        
        SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("size"));
        ALIGNMENT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("alignment"));
        MEMORY_TYPE_BITS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("memoryTypeBits"));
        
        SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("size"));
        ALIGNMENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("alignment"));
        MEMORY_TYPE_BITS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("memoryTypeBits"));
        //@formatter:on
    }

    public VkMemoryRequirements() {
        this(Arena.ofAuto());
    }
    
    public VkMemoryRequirements(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkMemoryRequirements(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #size()
    public VkMemoryRequirements size(long size) {
    	SIZE_HANDLE.set(segment, 0L, size);
    	return this;
    }
    
    public long size() {
    	return (long) SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #alignment()
    public VkMemoryRequirements alignment(long alignment) {
    	ALIGNMENT_HANDLE.set(segment, 0L, alignment);
    	return this;
    }
    
    public long alignment() {
    	return (long) ALIGNMENT_HANDLE.get(segment, 0L);
    }
    
    /// @see #memoryTypeBits()
    public VkMemoryRequirements memoryTypeBits(int memoryTypeBits) {
    	MEMORY_TYPE_BITS_HANDLE.set(segment, 0L, memoryTypeBits);
    	return this;
    }
    
    public int memoryTypeBits() {
    	return (int) MEMORY_TYPE_BITS_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkMemoryRequirements set(VkMemoryRequirements other) {
        return set(other.segment);
    }
    
    @Override
    public VkMemoryRequirements set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkMemoryRequirements> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkMemoryRequirements> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkMemoryRequirements(segment),
            count
        );
    }
    
    public static NativeStructArray<VkMemoryRequirements> array(Arena arena, VkMemoryRequirements... structs) {
        NativeStructArray<VkMemoryRequirements> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkMemoryRequirements(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkMemoryRequirements> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkMemoryRequirements(segment)
        );
    }
    
}