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

public final class VkDrawIndirectCommand
		implements Struct<VkDrawIndirectCommand> {

    public static final StructLayout LAYOUT;

    public static final VarHandle VERTEX_COUNT_HANDLE;
    public static final VarHandle INSTANCE_COUNT_HANDLE;
    public static final VarHandle FIRST_VERTEX_HANDLE;
    public static final VarHandle FIRST_INSTANCE_HANDLE;

    public static final long VERTEX_COUNT_BYTE_OFFSET;
    public static final long INSTANCE_COUNT_BYTE_OFFSET;
    public static final long FIRST_VERTEX_BYTE_OFFSET;
    public static final long FIRST_INSTANCE_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("vertexCount"),
            JAVA_INT.withName("instanceCount"),
            JAVA_INT.withName("firstVertex"),
            JAVA_INT.withName("firstInstance")
        ).withName("VkDrawIndirectCommand").withByteAlignment(4);
        
        VERTEX_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("vertexCount"));
        INSTANCE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("instanceCount"));
        FIRST_VERTEX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("firstVertex"));
        FIRST_INSTANCE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("firstInstance"));
        
        VERTEX_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vertexCount"));
        INSTANCE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("instanceCount"));
        FIRST_VERTEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("firstVertex"));
        FIRST_INSTANCE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("firstInstance"));
        //@formatter:on
    }

    public VkDrawIndirectCommand() {
        this(Arena.ofAuto());
    }
    
    public VkDrawIndirectCommand(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkDrawIndirectCommand(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #vertexCount()
    public VkDrawIndirectCommand vertexCount(int vertexCount) {
    	VERTEX_COUNT_HANDLE.set(segment, 0L, vertexCount);
    	return this;
    }
    
    public int vertexCount() {
    	return (int) VERTEX_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #instanceCount()
    public VkDrawIndirectCommand instanceCount(int instanceCount) {
    	INSTANCE_COUNT_HANDLE.set(segment, 0L, instanceCount);
    	return this;
    }
    
    public int instanceCount() {
    	return (int) INSTANCE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #firstVertex()
    public VkDrawIndirectCommand firstVertex(int firstVertex) {
    	FIRST_VERTEX_HANDLE.set(segment, 0L, firstVertex);
    	return this;
    }
    
    public int firstVertex() {
    	return (int) FIRST_VERTEX_HANDLE.get(segment, 0L);
    }
    
    /// @see #firstInstance()
    public VkDrawIndirectCommand firstInstance(int firstInstance) {
    	FIRST_INSTANCE_HANDLE.set(segment, 0L, firstInstance);
    	return this;
    }
    
    public int firstInstance() {
    	return (int) FIRST_INSTANCE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkDrawIndirectCommand set(VkDrawIndirectCommand other) {
        return set(other.segment);
    }
    
    @Override
    public VkDrawIndirectCommand set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDrawIndirectCommand> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDrawIndirectCommand> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDrawIndirectCommand(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDrawIndirectCommand> array(Arena arena, VkDrawIndirectCommand... structs) {
        NativeStructArray<VkDrawIndirectCommand> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDrawIndirectCommand(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDrawIndirectCommand> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDrawIndirectCommand(segment)
        );
    }
    
}