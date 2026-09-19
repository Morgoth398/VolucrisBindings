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

public final class VkDrawMeshTasksIndirectCommandNV
		implements Struct<VkDrawMeshTasksIndirectCommandNV> {

    public static final StructLayout LAYOUT;

    public static final VarHandle TASK_COUNT_HANDLE;
    public static final VarHandle FIRST_TASK_HANDLE;

    public static final long TASK_COUNT_BYTE_OFFSET;
    public static final long FIRST_TASK_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("taskCount"),
            JAVA_INT.withName("firstTask")
        ).withName("VkDrawMeshTasksIndirectCommandNV").withByteAlignment(4);
        
        TASK_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("taskCount"));
        FIRST_TASK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("firstTask"));
        
        TASK_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("taskCount"));
        FIRST_TASK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("firstTask"));
        //@formatter:on
    }

    public VkDrawMeshTasksIndirectCommandNV() {
        this(Arena.ofAuto());
    }
    
    public VkDrawMeshTasksIndirectCommandNV(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkDrawMeshTasksIndirectCommandNV(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #taskCount()
    public VkDrawMeshTasksIndirectCommandNV taskCount(int taskCount) {
    	TASK_COUNT_HANDLE.set(segment, 0L, taskCount);
    	return this;
    }
    
    public int taskCount() {
    	return (int) TASK_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #firstTask()
    public VkDrawMeshTasksIndirectCommandNV firstTask(int firstTask) {
    	FIRST_TASK_HANDLE.set(segment, 0L, firstTask);
    	return this;
    }
    
    public int firstTask() {
    	return (int) FIRST_TASK_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkDrawMeshTasksIndirectCommandNV set(VkDrawMeshTasksIndirectCommandNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkDrawMeshTasksIndirectCommandNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDrawMeshTasksIndirectCommandNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDrawMeshTasksIndirectCommandNV> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDrawMeshTasksIndirectCommandNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDrawMeshTasksIndirectCommandNV> array(Arena arena, VkDrawMeshTasksIndirectCommandNV... structs) {
        NativeStructArray<VkDrawMeshTasksIndirectCommandNV> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkDrawMeshTasksIndirectCommandNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDrawMeshTasksIndirectCommandNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDrawMeshTasksIndirectCommandNV(segment)
        );
    }
    
}