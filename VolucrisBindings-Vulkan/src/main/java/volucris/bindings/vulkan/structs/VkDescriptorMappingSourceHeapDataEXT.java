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

public final class VkDescriptorMappingSourceHeapDataEXT
		implements Struct<VkDescriptorMappingSourceHeapDataEXT> {

    public static final StructLayout LAYOUT;

    public static final VarHandle HEAP_OFFSET_HANDLE;
    public static final VarHandle PUSH_OFFSET_HANDLE;

    public static final long HEAP_OFFSET_BYTE_OFFSET;
    public static final long PUSH_OFFSET_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("heapOffset"),
            JAVA_INT.withName("pushOffset")
        ).withName("VkDescriptorMappingSourceHeapDataEXT").withByteAlignment(4);
        
        HEAP_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("heapOffset"));
        PUSH_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pushOffset"));
        
        HEAP_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("heapOffset"));
        PUSH_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pushOffset"));
        //@formatter:on
    }

    public VkDescriptorMappingSourceHeapDataEXT() {
        this(Arena.ofAuto());
    }
    
    public VkDescriptorMappingSourceHeapDataEXT(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkDescriptorMappingSourceHeapDataEXT(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #heapOffset()
    public VkDescriptorMappingSourceHeapDataEXT heapOffset(int heapOffset) {
    	HEAP_OFFSET_HANDLE.set(segment, 0L, heapOffset);
    	return this;
    }
    
    public int heapOffset() {
    	return (int) HEAP_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #pushOffset()
    public VkDescriptorMappingSourceHeapDataEXT pushOffset(int pushOffset) {
    	PUSH_OFFSET_HANDLE.set(segment, 0L, pushOffset);
    	return this;
    }
    
    public int pushOffset() {
    	return (int) PUSH_OFFSET_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkDescriptorMappingSourceHeapDataEXT set(VkDescriptorMappingSourceHeapDataEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkDescriptorMappingSourceHeapDataEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDescriptorMappingSourceHeapDataEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDescriptorMappingSourceHeapDataEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDescriptorMappingSourceHeapDataEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDescriptorMappingSourceHeapDataEXT> array(Arena arena, VkDescriptorMappingSourceHeapDataEXT... structs) {
        NativeStructArray<VkDescriptorMappingSourceHeapDataEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDescriptorMappingSourceHeapDataEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDescriptorMappingSourceHeapDataEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDescriptorMappingSourceHeapDataEXT(segment)
        );
    }
    
}