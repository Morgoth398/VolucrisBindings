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

public final class VkMultiDrawIndexedInfoEXT
		implements Struct<VkMultiDrawIndexedInfoEXT> {

    public static final StructLayout LAYOUT;

    public static final VarHandle FIRST_INDEX_HANDLE;
    public static final VarHandle INDEX_COUNT_HANDLE;
    public static final VarHandle VERTEX_OFFSET_HANDLE;

    public static final long FIRST_INDEX_BYTE_OFFSET;
    public static final long INDEX_COUNT_BYTE_OFFSET;
    public static final long VERTEX_OFFSET_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("firstIndex"),
            JAVA_INT.withName("indexCount"),
            JAVA_INT.withName("vertexOffset")
        ).withName("VkMultiDrawIndexedInfoEXT").withByteAlignment(4);
        
        FIRST_INDEX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("firstIndex"));
        INDEX_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("indexCount"));
        VERTEX_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("vertexOffset"));
        
        FIRST_INDEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("firstIndex"));
        INDEX_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("indexCount"));
        VERTEX_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vertexOffset"));
        //@formatter:on
    }

    public VkMultiDrawIndexedInfoEXT() {
        this(Arena.ofAuto());
    }
    
    public VkMultiDrawIndexedInfoEXT(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkMultiDrawIndexedInfoEXT(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #firstIndex()
    public VkMultiDrawIndexedInfoEXT firstIndex(int firstIndex) {
    	FIRST_INDEX_HANDLE.set(segment, 0L, firstIndex);
    	return this;
    }
    
    public int firstIndex() {
    	return (int) FIRST_INDEX_HANDLE.get(segment, 0L);
    }
    
    /// @see #indexCount()
    public VkMultiDrawIndexedInfoEXT indexCount(int indexCount) {
    	INDEX_COUNT_HANDLE.set(segment, 0L, indexCount);
    	return this;
    }
    
    public int indexCount() {
    	return (int) INDEX_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #vertexOffset()
    public VkMultiDrawIndexedInfoEXT vertexOffset(int vertexOffset) {
    	VERTEX_OFFSET_HANDLE.set(segment, 0L, vertexOffset);
    	return this;
    }
    
    public int vertexOffset() {
    	return (int) VERTEX_OFFSET_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkMultiDrawIndexedInfoEXT set(VkMultiDrawIndexedInfoEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkMultiDrawIndexedInfoEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkMultiDrawIndexedInfoEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkMultiDrawIndexedInfoEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkMultiDrawIndexedInfoEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkMultiDrawIndexedInfoEXT> array(Arena arena, VkMultiDrawIndexedInfoEXT... structs) {
        NativeStructArray<VkMultiDrawIndexedInfoEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkMultiDrawIndexedInfoEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkMultiDrawIndexedInfoEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkMultiDrawIndexedInfoEXT(segment)
        );
    }
    
}