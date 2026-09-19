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

public final class VkPhysicalDeviceMeshShaderPropertiesNV
		implements Struct<VkPhysicalDeviceMeshShaderPropertiesNV> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle MAX_DRAW_MESH_TASKS_COUNT_HANDLE;
    public static final VarHandle MAX_TASK_WORK_GROUP_INVOCATIONS_HANDLE;
    public static final VarHandle MAX_TASK_WORK_GROUP_SIZE_HANDLE;
    public static final VarHandle MAX_TASK_TOTAL_MEMORY_SIZE_HANDLE;
    public static final VarHandle MAX_TASK_OUTPUT_COUNT_HANDLE;
    public static final VarHandle MAX_MESH_WORK_GROUP_INVOCATIONS_HANDLE;
    public static final VarHandle MAX_MESH_WORK_GROUP_SIZE_HANDLE;
    public static final VarHandle MAX_MESH_TOTAL_MEMORY_SIZE_HANDLE;
    public static final VarHandle MAX_MESH_OUTPUT_VERTICES_HANDLE;
    public static final VarHandle MAX_MESH_OUTPUT_PRIMITIVES_HANDLE;
    public static final VarHandle MAX_MESH_MULTIVIEW_VIEW_COUNT_HANDLE;
    public static final VarHandle MESH_OUTPUT_PER_VERTEX_GRANULARITY_HANDLE;
    public static final VarHandle MESH_OUTPUT_PER_PRIMITIVE_GRANULARITY_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long MAX_DRAW_MESH_TASKS_COUNT_BYTE_OFFSET;
    public static final long MAX_TASK_WORK_GROUP_INVOCATIONS_BYTE_OFFSET;
    public static final long MAX_TASK_WORK_GROUP_SIZE_BYTE_OFFSET;
    public static final long MAX_TASK_TOTAL_MEMORY_SIZE_BYTE_OFFSET;
    public static final long MAX_TASK_OUTPUT_COUNT_BYTE_OFFSET;
    public static final long MAX_MESH_WORK_GROUP_INVOCATIONS_BYTE_OFFSET;
    public static final long MAX_MESH_WORK_GROUP_SIZE_BYTE_OFFSET;
    public static final long MAX_MESH_TOTAL_MEMORY_SIZE_BYTE_OFFSET;
    public static final long MAX_MESH_OUTPUT_VERTICES_BYTE_OFFSET;
    public static final long MAX_MESH_OUTPUT_PRIMITIVES_BYTE_OFFSET;
    public static final long MAX_MESH_MULTIVIEW_VIEW_COUNT_BYTE_OFFSET;
    public static final long MESH_OUTPUT_PER_VERTEX_GRANULARITY_BYTE_OFFSET;
    public static final long MESH_OUTPUT_PER_PRIMITIVE_GRANULARITY_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("maxDrawMeshTasksCount"),
            JAVA_INT.withName("maxTaskWorkGroupInvocations"),
            MemoryLayout.sequenceLayout(3, JAVA_INT).withName("maxTaskWorkGroupSize"),
            JAVA_INT.withName("maxTaskTotalMemorySize"),
            JAVA_INT.withName("maxTaskOutputCount"),
            JAVA_INT.withName("maxMeshWorkGroupInvocations"),
            MemoryLayout.sequenceLayout(3, JAVA_INT).withName("maxMeshWorkGroupSize"),
            JAVA_INT.withName("maxMeshTotalMemorySize"),
            JAVA_INT.withName("maxMeshOutputVertices"),
            JAVA_INT.withName("maxMeshOutputPrimitives"),
            JAVA_INT.withName("maxMeshMultiviewViewCount"),
            JAVA_INT.withName("meshOutputPerVertexGranularity"),
            JAVA_INT.withName("meshOutputPerPrimitiveGranularity"),
            MemoryLayout.paddingLayout(4)
        ).withName("VkPhysicalDeviceMeshShaderPropertiesNV").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        MAX_DRAW_MESH_TASKS_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxDrawMeshTasksCount"));
        MAX_TASK_WORK_GROUP_INVOCATIONS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxTaskWorkGroupInvocations"));
        MAX_TASK_WORK_GROUP_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxTaskWorkGroupSize"), PathElement.sequenceElement());
        MAX_TASK_TOTAL_MEMORY_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxTaskTotalMemorySize"));
        MAX_TASK_OUTPUT_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxTaskOutputCount"));
        MAX_MESH_WORK_GROUP_INVOCATIONS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxMeshWorkGroupInvocations"));
        MAX_MESH_WORK_GROUP_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxMeshWorkGroupSize"), PathElement.sequenceElement());
        MAX_MESH_TOTAL_MEMORY_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxMeshTotalMemorySize"));
        MAX_MESH_OUTPUT_VERTICES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxMeshOutputVertices"));
        MAX_MESH_OUTPUT_PRIMITIVES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxMeshOutputPrimitives"));
        MAX_MESH_MULTIVIEW_VIEW_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxMeshMultiviewViewCount"));
        MESH_OUTPUT_PER_VERTEX_GRANULARITY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("meshOutputPerVertexGranularity"));
        MESH_OUTPUT_PER_PRIMITIVE_GRANULARITY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("meshOutputPerPrimitiveGranularity"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        MAX_DRAW_MESH_TASKS_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxDrawMeshTasksCount"));
        MAX_TASK_WORK_GROUP_INVOCATIONS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxTaskWorkGroupInvocations"));
        MAX_TASK_WORK_GROUP_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxTaskWorkGroupSize"));
        MAX_TASK_TOTAL_MEMORY_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxTaskTotalMemorySize"));
        MAX_TASK_OUTPUT_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxTaskOutputCount"));
        MAX_MESH_WORK_GROUP_INVOCATIONS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxMeshWorkGroupInvocations"));
        MAX_MESH_WORK_GROUP_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxMeshWorkGroupSize"));
        MAX_MESH_TOTAL_MEMORY_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxMeshTotalMemorySize"));
        MAX_MESH_OUTPUT_VERTICES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxMeshOutputVertices"));
        MAX_MESH_OUTPUT_PRIMITIVES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxMeshOutputPrimitives"));
        MAX_MESH_MULTIVIEW_VIEW_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxMeshMultiviewViewCount"));
        MESH_OUTPUT_PER_VERTEX_GRANULARITY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("meshOutputPerVertexGranularity"));
        MESH_OUTPUT_PER_PRIMITIVE_GRANULARITY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("meshOutputPerPrimitiveGranularity"));
        //@formatter:on
    }

    public VkPhysicalDeviceMeshShaderPropertiesNV() {
        this(Arena.ofAuto());
    }
    
    public VkPhysicalDeviceMeshShaderPropertiesNV(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkPhysicalDeviceMeshShaderPropertiesNV(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkPhysicalDeviceMeshShaderPropertiesNV sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceMeshShaderPropertiesNV pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #maxDrawMeshTasksCount()
    public VkPhysicalDeviceMeshShaderPropertiesNV maxDrawMeshTasksCount(int maxDrawMeshTasksCount) {
    	MAX_DRAW_MESH_TASKS_COUNT_HANDLE.set(segment, 0L, maxDrawMeshTasksCount);
    	return this;
    }
    
    public int maxDrawMeshTasksCount() {
    	return (int) MAX_DRAW_MESH_TASKS_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxTaskWorkGroupInvocations()
    public VkPhysicalDeviceMeshShaderPropertiesNV maxTaskWorkGroupInvocations(int maxTaskWorkGroupInvocations) {
    	MAX_TASK_WORK_GROUP_INVOCATIONS_HANDLE.set(segment, 0L, maxTaskWorkGroupInvocations);
    	return this;
    }
    
    public int maxTaskWorkGroupInvocations() {
    	return (int) MAX_TASK_WORK_GROUP_INVOCATIONS_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxTaskWorkGroupSize(int)
    public VkPhysicalDeviceMeshShaderPropertiesNV maxTaskWorkGroupSize(int maxTaskWorkGroupSize, int index0) {
    	MAX_TASK_WORK_GROUP_SIZE_HANDLE.set(segment, 0L, index0, maxTaskWorkGroupSize);
    	return this;
    }
    
    public int maxTaskWorkGroupSize(int index0) {
    	return (int) MAX_TASK_WORK_GROUP_SIZE_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #maxTaskTotalMemorySize()
    public VkPhysicalDeviceMeshShaderPropertiesNV maxTaskTotalMemorySize(int maxTaskTotalMemorySize) {
    	MAX_TASK_TOTAL_MEMORY_SIZE_HANDLE.set(segment, 0L, maxTaskTotalMemorySize);
    	return this;
    }
    
    public int maxTaskTotalMemorySize() {
    	return (int) MAX_TASK_TOTAL_MEMORY_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxTaskOutputCount()
    public VkPhysicalDeviceMeshShaderPropertiesNV maxTaskOutputCount(int maxTaskOutputCount) {
    	MAX_TASK_OUTPUT_COUNT_HANDLE.set(segment, 0L, maxTaskOutputCount);
    	return this;
    }
    
    public int maxTaskOutputCount() {
    	return (int) MAX_TASK_OUTPUT_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxMeshWorkGroupInvocations()
    public VkPhysicalDeviceMeshShaderPropertiesNV maxMeshWorkGroupInvocations(int maxMeshWorkGroupInvocations) {
    	MAX_MESH_WORK_GROUP_INVOCATIONS_HANDLE.set(segment, 0L, maxMeshWorkGroupInvocations);
    	return this;
    }
    
    public int maxMeshWorkGroupInvocations() {
    	return (int) MAX_MESH_WORK_GROUP_INVOCATIONS_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxMeshWorkGroupSize(int)
    public VkPhysicalDeviceMeshShaderPropertiesNV maxMeshWorkGroupSize(int maxMeshWorkGroupSize, int index0) {
    	MAX_MESH_WORK_GROUP_SIZE_HANDLE.set(segment, 0L, index0, maxMeshWorkGroupSize);
    	return this;
    }
    
    public int maxMeshWorkGroupSize(int index0) {
    	return (int) MAX_MESH_WORK_GROUP_SIZE_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #maxMeshTotalMemorySize()
    public VkPhysicalDeviceMeshShaderPropertiesNV maxMeshTotalMemorySize(int maxMeshTotalMemorySize) {
    	MAX_MESH_TOTAL_MEMORY_SIZE_HANDLE.set(segment, 0L, maxMeshTotalMemorySize);
    	return this;
    }
    
    public int maxMeshTotalMemorySize() {
    	return (int) MAX_MESH_TOTAL_MEMORY_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxMeshOutputVertices()
    public VkPhysicalDeviceMeshShaderPropertiesNV maxMeshOutputVertices(int maxMeshOutputVertices) {
    	MAX_MESH_OUTPUT_VERTICES_HANDLE.set(segment, 0L, maxMeshOutputVertices);
    	return this;
    }
    
    public int maxMeshOutputVertices() {
    	return (int) MAX_MESH_OUTPUT_VERTICES_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxMeshOutputPrimitives()
    public VkPhysicalDeviceMeshShaderPropertiesNV maxMeshOutputPrimitives(int maxMeshOutputPrimitives) {
    	MAX_MESH_OUTPUT_PRIMITIVES_HANDLE.set(segment, 0L, maxMeshOutputPrimitives);
    	return this;
    }
    
    public int maxMeshOutputPrimitives() {
    	return (int) MAX_MESH_OUTPUT_PRIMITIVES_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxMeshMultiviewViewCount()
    public VkPhysicalDeviceMeshShaderPropertiesNV maxMeshMultiviewViewCount(int maxMeshMultiviewViewCount) {
    	MAX_MESH_MULTIVIEW_VIEW_COUNT_HANDLE.set(segment, 0L, maxMeshMultiviewViewCount);
    	return this;
    }
    
    public int maxMeshMultiviewViewCount() {
    	return (int) MAX_MESH_MULTIVIEW_VIEW_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #meshOutputPerVertexGranularity()
    public VkPhysicalDeviceMeshShaderPropertiesNV meshOutputPerVertexGranularity(int meshOutputPerVertexGranularity) {
    	MESH_OUTPUT_PER_VERTEX_GRANULARITY_HANDLE.set(segment, 0L, meshOutputPerVertexGranularity);
    	return this;
    }
    
    public int meshOutputPerVertexGranularity() {
    	return (int) MESH_OUTPUT_PER_VERTEX_GRANULARITY_HANDLE.get(segment, 0L);
    }
    
    /// @see #meshOutputPerPrimitiveGranularity()
    public VkPhysicalDeviceMeshShaderPropertiesNV meshOutputPerPrimitiveGranularity(int meshOutputPerPrimitiveGranularity) {
    	MESH_OUTPUT_PER_PRIMITIVE_GRANULARITY_HANDLE.set(segment, 0L, meshOutputPerPrimitiveGranularity);
    	return this;
    }
    
    public int meshOutputPerPrimitiveGranularity() {
    	return (int) MESH_OUTPUT_PER_PRIMITIVE_GRANULARITY_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceMeshShaderPropertiesNV set(VkPhysicalDeviceMeshShaderPropertiesNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceMeshShaderPropertiesNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceMeshShaderPropertiesNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceMeshShaderPropertiesNV> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceMeshShaderPropertiesNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceMeshShaderPropertiesNV> array(Arena arena, VkPhysicalDeviceMeshShaderPropertiesNV... structs) {
        NativeStructArray<VkPhysicalDeviceMeshShaderPropertiesNV> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceMeshShaderPropertiesNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceMeshShaderPropertiesNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceMeshShaderPropertiesNV(segment)
        );
    }
    
}