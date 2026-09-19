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

public final class VkDescriptorPoolSize
		implements Struct<VkDescriptorPoolSize> {

    public static final StructLayout LAYOUT;

    public static final VarHandle TYPE_HANDLE;
    public static final VarHandle DESCRIPTOR_COUNT_HANDLE;

    public static final long TYPE_BYTE_OFFSET;
    public static final long DESCRIPTOR_COUNT_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("type"),
            JAVA_INT.withName("descriptorCount")
        ).withName("VkDescriptorPoolSize").withByteAlignment(4);
        
        TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("type"));
        DESCRIPTOR_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("descriptorCount"));
        
        TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("type"));
        DESCRIPTOR_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("descriptorCount"));
        //@formatter:on
    }

    public VkDescriptorPoolSize() {
        this(Arena.ofAuto());
    }
    
    public VkDescriptorPoolSize(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkDescriptorPoolSize(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #type()
    public VkDescriptorPoolSize type(int type) {
    	TYPE_HANDLE.set(segment, 0L, type);
    	return this;
    }
    
    public int type() {
    	return (int) TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #descriptorCount()
    public VkDescriptorPoolSize descriptorCount(int descriptorCount) {
    	DESCRIPTOR_COUNT_HANDLE.set(segment, 0L, descriptorCount);
    	return this;
    }
    
    public int descriptorCount() {
    	return (int) DESCRIPTOR_COUNT_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkDescriptorPoolSize set(VkDescriptorPoolSize other) {
        return set(other.segment);
    }
    
    @Override
    public VkDescriptorPoolSize set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDescriptorPoolSize> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDescriptorPoolSize> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDescriptorPoolSize(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDescriptorPoolSize> array(Arena arena, VkDescriptorPoolSize... structs) {
        NativeStructArray<VkDescriptorPoolSize> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDescriptorPoolSize(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDescriptorPoolSize> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDescriptorPoolSize(segment)
        );
    }
    
}