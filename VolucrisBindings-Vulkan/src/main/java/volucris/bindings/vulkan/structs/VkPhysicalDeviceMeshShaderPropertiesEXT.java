/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
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

public final class VkPhysicalDeviceMeshShaderPropertiesEXT
		implements Struct<VkPhysicalDeviceMeshShaderPropertiesEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle MAX_TASK_WORK_GROUP_TOTAL_COUNT_HANDLE;
	public static final VarHandle MAX_TASK_WORK_GROUP_COUNT_HANDLE;
	public static final VarHandle MAX_TASK_WORK_GROUP_INVOCATIONS_HANDLE;
	public static final VarHandle MAX_TASK_WORK_GROUP_SIZE_HANDLE;
	public static final VarHandle MAX_TASK_PAYLOAD_SIZE_HANDLE;
	public static final VarHandle MAX_TASK_SHARED_MEMORY_SIZE_HANDLE;
	public static final VarHandle MAX_TASK_PAYLOAD_AND_SHARED_MEMORY_SIZE_HANDLE;
	public static final VarHandle MAX_MESH_WORK_GROUP_TOTAL_COUNT_HANDLE;
	public static final VarHandle MAX_MESH_WORK_GROUP_COUNT_HANDLE;
	public static final VarHandle MAX_MESH_WORK_GROUP_INVOCATIONS_HANDLE;
	public static final VarHandle MAX_MESH_WORK_GROUP_SIZE_HANDLE;
	public static final VarHandle MAX_MESH_SHARED_MEMORY_SIZE_HANDLE;
	public static final VarHandle MAX_MESH_PAYLOAD_AND_SHARED_MEMORY_SIZE_HANDLE;
	public static final VarHandle MAX_MESH_OUTPUT_MEMORY_SIZE_HANDLE;
	public static final VarHandle MAX_MESH_PAYLOAD_AND_OUTPUT_MEMORY_SIZE_HANDLE;
	public static final VarHandle MAX_MESH_OUTPUT_COMPONENTS_HANDLE;
	public static final VarHandle MAX_MESH_OUTPUT_VERTICES_HANDLE;
	public static final VarHandle MAX_MESH_OUTPUT_PRIMITIVES_HANDLE;
	public static final VarHandle MAX_MESH_OUTPUT_LAYERS_HANDLE;
	public static final VarHandle MAX_MESH_MULTIVIEW_VIEW_COUNT_HANDLE;
	public static final VarHandle MESH_OUTPUT_PER_VERTEX_GRANULARITY_HANDLE;
	public static final VarHandle MESH_OUTPUT_PER_PRIMITIVE_GRANULARITY_HANDLE;
	public static final VarHandle MAX_PREFERRED_TASK_WORK_GROUP_INVOCATIONS_HANDLE;
	public static final VarHandle MAX_PREFERRED_MESH_WORK_GROUP_INVOCATIONS_HANDLE;
	public static final VarHandle PREFERS_LOCAL_INVOCATION_VERTEX_OUTPUT_HANDLE;
	public static final VarHandle PREFERS_LOCAL_INVOCATION_PRIMITIVE_OUTPUT_HANDLE;
	public static final VarHandle PREFERS_COMPACT_VERTEX_OUTPUT_HANDLE;
	public static final VarHandle PREFERS_COMPACT_PRIMITIVE_OUTPUT_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long MAX_TASK_WORK_GROUP_TOTAL_COUNT_BYTE_OFFSET;
	public static final long MAX_TASK_WORK_GROUP_COUNT_BYTE_OFFSET;
	public static final long MAX_TASK_WORK_GROUP_INVOCATIONS_BYTE_OFFSET;
	public static final long MAX_TASK_WORK_GROUP_SIZE_BYTE_OFFSET;
	public static final long MAX_TASK_PAYLOAD_SIZE_BYTE_OFFSET;
	public static final long MAX_TASK_SHARED_MEMORY_SIZE_BYTE_OFFSET;
	public static final long MAX_TASK_PAYLOAD_AND_SHARED_MEMORY_SIZE_BYTE_OFFSET;
	public static final long MAX_MESH_WORK_GROUP_TOTAL_COUNT_BYTE_OFFSET;
	public static final long MAX_MESH_WORK_GROUP_COUNT_BYTE_OFFSET;
	public static final long MAX_MESH_WORK_GROUP_INVOCATIONS_BYTE_OFFSET;
	public static final long MAX_MESH_WORK_GROUP_SIZE_BYTE_OFFSET;
	public static final long MAX_MESH_SHARED_MEMORY_SIZE_BYTE_OFFSET;
	public static final long MAX_MESH_PAYLOAD_AND_SHARED_MEMORY_SIZE_BYTE_OFFSET;
	public static final long MAX_MESH_OUTPUT_MEMORY_SIZE_BYTE_OFFSET;
	public static final long MAX_MESH_PAYLOAD_AND_OUTPUT_MEMORY_SIZE_BYTE_OFFSET;
	public static final long MAX_MESH_OUTPUT_COMPONENTS_BYTE_OFFSET;
	public static final long MAX_MESH_OUTPUT_VERTICES_BYTE_OFFSET;
	public static final long MAX_MESH_OUTPUT_PRIMITIVES_BYTE_OFFSET;
	public static final long MAX_MESH_OUTPUT_LAYERS_BYTE_OFFSET;
	public static final long MAX_MESH_MULTIVIEW_VIEW_COUNT_BYTE_OFFSET;
	public static final long MESH_OUTPUT_PER_VERTEX_GRANULARITY_BYTE_OFFSET;
	public static final long MESH_OUTPUT_PER_PRIMITIVE_GRANULARITY_BYTE_OFFSET;
	public static final long MAX_PREFERRED_TASK_WORK_GROUP_INVOCATIONS_BYTE_OFFSET;
	public static final long MAX_PREFERRED_MESH_WORK_GROUP_INVOCATIONS_BYTE_OFFSET;
	public static final long PREFERS_LOCAL_INVOCATION_VERTEX_OUTPUT_BYTE_OFFSET;
	public static final long PREFERS_LOCAL_INVOCATION_PRIMITIVE_OUTPUT_BYTE_OFFSET;
	public static final long PREFERS_COMPACT_VERTEX_OUTPUT_BYTE_OFFSET;
	public static final long PREFERS_COMPACT_PRIMITIVE_OUTPUT_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("maxTaskWorkGroupTotalCount"),
		    MemoryLayout.sequenceLayout(3, JAVA_INT).withName("maxTaskWorkGroupCount"),
		    JAVA_INT.withName("maxTaskWorkGroupInvocations"),
		    MemoryLayout.sequenceLayout(3, JAVA_INT).withName("maxTaskWorkGroupSize"),
		    JAVA_INT.withName("maxTaskPayloadSize"),
		    JAVA_INT.withName("maxTaskSharedMemorySize"),
		    JAVA_INT.withName("maxTaskPayloadAndSharedMemorySize"),
		    JAVA_INT.withName("maxMeshWorkGroupTotalCount"),
		    MemoryLayout.sequenceLayout(3, JAVA_INT).withName("maxMeshWorkGroupCount"),
		    JAVA_INT.withName("maxMeshWorkGroupInvocations"),
		    MemoryLayout.sequenceLayout(3, JAVA_INT).withName("maxMeshWorkGroupSize"),
		    JAVA_INT.withName("maxMeshSharedMemorySize"),
		    JAVA_INT.withName("maxMeshPayloadAndSharedMemorySize"),
		    JAVA_INT.withName("maxMeshOutputMemorySize"),
		    JAVA_INT.withName("maxMeshPayloadAndOutputMemorySize"),
		    JAVA_INT.withName("maxMeshOutputComponents"),
		    JAVA_INT.withName("maxMeshOutputVertices"),
		    JAVA_INT.withName("maxMeshOutputPrimitives"),
		    JAVA_INT.withName("maxMeshOutputLayers"),
		    JAVA_INT.withName("maxMeshMultiviewViewCount"),
		    JAVA_INT.withName("meshOutputPerVertexGranularity"),
		    JAVA_INT.withName("meshOutputPerPrimitiveGranularity"),
		    JAVA_INT.withName("maxPreferredTaskWorkGroupInvocations"),
		    JAVA_INT.withName("maxPreferredMeshWorkGroupInvocations"),
		    JAVA_INT.withName("prefersLocalInvocationVertexOutput"),
		    JAVA_INT.withName("prefersLocalInvocationPrimitiveOutput"),
		    JAVA_INT.withName("prefersCompactVertexOutput"),
		    JAVA_INT.withName("prefersCompactPrimitiveOutput")
		).withName("VkPhysicalDeviceMeshShaderPropertiesEXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		MAX_TASK_WORK_GROUP_TOTAL_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxTaskWorkGroupTotalCount"));
		MAX_TASK_WORK_GROUP_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxTaskWorkGroupCount"), PathElement.sequenceElement());
		MAX_TASK_WORK_GROUP_INVOCATIONS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxTaskWorkGroupInvocations"));
		MAX_TASK_WORK_GROUP_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxTaskWorkGroupSize"), PathElement.sequenceElement());
		MAX_TASK_PAYLOAD_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxTaskPayloadSize"));
		MAX_TASK_SHARED_MEMORY_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxTaskSharedMemorySize"));
		MAX_TASK_PAYLOAD_AND_SHARED_MEMORY_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxTaskPayloadAndSharedMemorySize"));
		MAX_MESH_WORK_GROUP_TOTAL_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxMeshWorkGroupTotalCount"));
		MAX_MESH_WORK_GROUP_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxMeshWorkGroupCount"), PathElement.sequenceElement());
		MAX_MESH_WORK_GROUP_INVOCATIONS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxMeshWorkGroupInvocations"));
		MAX_MESH_WORK_GROUP_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxMeshWorkGroupSize"), PathElement.sequenceElement());
		MAX_MESH_SHARED_MEMORY_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxMeshSharedMemorySize"));
		MAX_MESH_PAYLOAD_AND_SHARED_MEMORY_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxMeshPayloadAndSharedMemorySize"));
		MAX_MESH_OUTPUT_MEMORY_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxMeshOutputMemorySize"));
		MAX_MESH_PAYLOAD_AND_OUTPUT_MEMORY_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxMeshPayloadAndOutputMemorySize"));
		MAX_MESH_OUTPUT_COMPONENTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxMeshOutputComponents"));
		MAX_MESH_OUTPUT_VERTICES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxMeshOutputVertices"));
		MAX_MESH_OUTPUT_PRIMITIVES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxMeshOutputPrimitives"));
		MAX_MESH_OUTPUT_LAYERS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxMeshOutputLayers"));
		MAX_MESH_MULTIVIEW_VIEW_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxMeshMultiviewViewCount"));
		MESH_OUTPUT_PER_VERTEX_GRANULARITY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("meshOutputPerVertexGranularity"));
		MESH_OUTPUT_PER_PRIMITIVE_GRANULARITY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("meshOutputPerPrimitiveGranularity"));
		MAX_PREFERRED_TASK_WORK_GROUP_INVOCATIONS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxPreferredTaskWorkGroupInvocations"));
		MAX_PREFERRED_MESH_WORK_GROUP_INVOCATIONS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxPreferredMeshWorkGroupInvocations"));
		PREFERS_LOCAL_INVOCATION_VERTEX_OUTPUT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("prefersLocalInvocationVertexOutput"));
		PREFERS_LOCAL_INVOCATION_PRIMITIVE_OUTPUT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("prefersLocalInvocationPrimitiveOutput"));
		PREFERS_COMPACT_VERTEX_OUTPUT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("prefersCompactVertexOutput"));
		PREFERS_COMPACT_PRIMITIVE_OUTPUT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("prefersCompactPrimitiveOutput"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		MAX_TASK_WORK_GROUP_TOTAL_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxTaskWorkGroupTotalCount"));
		MAX_TASK_WORK_GROUP_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxTaskWorkGroupCount"));
		MAX_TASK_WORK_GROUP_INVOCATIONS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxTaskWorkGroupInvocations"));
		MAX_TASK_WORK_GROUP_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxTaskWorkGroupSize"));
		MAX_TASK_PAYLOAD_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxTaskPayloadSize"));
		MAX_TASK_SHARED_MEMORY_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxTaskSharedMemorySize"));
		MAX_TASK_PAYLOAD_AND_SHARED_MEMORY_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxTaskPayloadAndSharedMemorySize"));
		MAX_MESH_WORK_GROUP_TOTAL_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxMeshWorkGroupTotalCount"));
		MAX_MESH_WORK_GROUP_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxMeshWorkGroupCount"));
		MAX_MESH_WORK_GROUP_INVOCATIONS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxMeshWorkGroupInvocations"));
		MAX_MESH_WORK_GROUP_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxMeshWorkGroupSize"));
		MAX_MESH_SHARED_MEMORY_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxMeshSharedMemorySize"));
		MAX_MESH_PAYLOAD_AND_SHARED_MEMORY_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxMeshPayloadAndSharedMemorySize"));
		MAX_MESH_OUTPUT_MEMORY_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxMeshOutputMemorySize"));
		MAX_MESH_PAYLOAD_AND_OUTPUT_MEMORY_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxMeshPayloadAndOutputMemorySize"));
		MAX_MESH_OUTPUT_COMPONENTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxMeshOutputComponents"));
		MAX_MESH_OUTPUT_VERTICES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxMeshOutputVertices"));
		MAX_MESH_OUTPUT_PRIMITIVES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxMeshOutputPrimitives"));
		MAX_MESH_OUTPUT_LAYERS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxMeshOutputLayers"));
		MAX_MESH_MULTIVIEW_VIEW_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxMeshMultiviewViewCount"));
		MESH_OUTPUT_PER_VERTEX_GRANULARITY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("meshOutputPerVertexGranularity"));
		MESH_OUTPUT_PER_PRIMITIVE_GRANULARITY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("meshOutputPerPrimitiveGranularity"));
		MAX_PREFERRED_TASK_WORK_GROUP_INVOCATIONS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxPreferredTaskWorkGroupInvocations"));
		MAX_PREFERRED_MESH_WORK_GROUP_INVOCATIONS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxPreferredMeshWorkGroupInvocations"));
		PREFERS_LOCAL_INVOCATION_VERTEX_OUTPUT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("prefersLocalInvocationVertexOutput"));
		PREFERS_LOCAL_INVOCATION_PRIMITIVE_OUTPUT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("prefersLocalInvocationPrimitiveOutput"));
		PREFERS_COMPACT_VERTEX_OUTPUT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("prefersCompactVertexOutput"));
		PREFERS_COMPACT_PRIMITIVE_OUTPUT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("prefersCompactPrimitiveOutput"));
		//@formatter:on
	}

	public VkPhysicalDeviceMeshShaderPropertiesEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceMeshShaderPropertiesEXT(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceMeshShaderPropertiesEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceMeshShaderPropertiesEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceMeshShaderPropertiesEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #maxTaskWorkGroupTotalCount()
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxTaskWorkGroupTotalCount(int maxTaskWorkGroupTotalCount) {
    	MAX_TASK_WORK_GROUP_TOTAL_COUNT_HANDLE.set(segment, 0L, maxTaskWorkGroupTotalCount);
    	return this;
    }
    
    public int maxTaskWorkGroupTotalCount() {
    	return (int) MAX_TASK_WORK_GROUP_TOTAL_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxTaskWorkGroupCount(int)
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxTaskWorkGroupCount(int maxTaskWorkGroupCount, int index0) {
    	MAX_TASK_WORK_GROUP_COUNT_HANDLE.set(segment, 0L, index0, maxTaskWorkGroupCount);
    	return this;
    }
    
    public int maxTaskWorkGroupCount(int index0) {
    	return (int) MAX_TASK_WORK_GROUP_COUNT_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #maxTaskWorkGroupInvocations()
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxTaskWorkGroupInvocations(int maxTaskWorkGroupInvocations) {
    	MAX_TASK_WORK_GROUP_INVOCATIONS_HANDLE.set(segment, 0L, maxTaskWorkGroupInvocations);
    	return this;
    }
    
    public int maxTaskWorkGroupInvocations() {
    	return (int) MAX_TASK_WORK_GROUP_INVOCATIONS_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxTaskWorkGroupSize(int)
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxTaskWorkGroupSize(int maxTaskWorkGroupSize, int index0) {
    	MAX_TASK_WORK_GROUP_SIZE_HANDLE.set(segment, 0L, index0, maxTaskWorkGroupSize);
    	return this;
    }
    
    public int maxTaskWorkGroupSize(int index0) {
    	return (int) MAX_TASK_WORK_GROUP_SIZE_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #maxTaskPayloadSize()
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxTaskPayloadSize(int maxTaskPayloadSize) {
    	MAX_TASK_PAYLOAD_SIZE_HANDLE.set(segment, 0L, maxTaskPayloadSize);
    	return this;
    }
    
    public int maxTaskPayloadSize() {
    	return (int) MAX_TASK_PAYLOAD_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxTaskSharedMemorySize()
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxTaskSharedMemorySize(int maxTaskSharedMemorySize) {
    	MAX_TASK_SHARED_MEMORY_SIZE_HANDLE.set(segment, 0L, maxTaskSharedMemorySize);
    	return this;
    }
    
    public int maxTaskSharedMemorySize() {
    	return (int) MAX_TASK_SHARED_MEMORY_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxTaskPayloadAndSharedMemorySize()
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxTaskPayloadAndSharedMemorySize(int maxTaskPayloadAndSharedMemorySize) {
    	MAX_TASK_PAYLOAD_AND_SHARED_MEMORY_SIZE_HANDLE.set(segment, 0L, maxTaskPayloadAndSharedMemorySize);
    	return this;
    }
    
    public int maxTaskPayloadAndSharedMemorySize() {
    	return (int) MAX_TASK_PAYLOAD_AND_SHARED_MEMORY_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxMeshWorkGroupTotalCount()
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxMeshWorkGroupTotalCount(int maxMeshWorkGroupTotalCount) {
    	MAX_MESH_WORK_GROUP_TOTAL_COUNT_HANDLE.set(segment, 0L, maxMeshWorkGroupTotalCount);
    	return this;
    }
    
    public int maxMeshWorkGroupTotalCount() {
    	return (int) MAX_MESH_WORK_GROUP_TOTAL_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxMeshWorkGroupCount(int)
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxMeshWorkGroupCount(int maxMeshWorkGroupCount, int index0) {
    	MAX_MESH_WORK_GROUP_COUNT_HANDLE.set(segment, 0L, index0, maxMeshWorkGroupCount);
    	return this;
    }
    
    public int maxMeshWorkGroupCount(int index0) {
    	return (int) MAX_MESH_WORK_GROUP_COUNT_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #maxMeshWorkGroupInvocations()
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxMeshWorkGroupInvocations(int maxMeshWorkGroupInvocations) {
    	MAX_MESH_WORK_GROUP_INVOCATIONS_HANDLE.set(segment, 0L, maxMeshWorkGroupInvocations);
    	return this;
    }
    
    public int maxMeshWorkGroupInvocations() {
    	return (int) MAX_MESH_WORK_GROUP_INVOCATIONS_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxMeshWorkGroupSize(int)
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxMeshWorkGroupSize(int maxMeshWorkGroupSize, int index0) {
    	MAX_MESH_WORK_GROUP_SIZE_HANDLE.set(segment, 0L, index0, maxMeshWorkGroupSize);
    	return this;
    }
    
    public int maxMeshWorkGroupSize(int index0) {
    	return (int) MAX_MESH_WORK_GROUP_SIZE_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #maxMeshSharedMemorySize()
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxMeshSharedMemorySize(int maxMeshSharedMemorySize) {
    	MAX_MESH_SHARED_MEMORY_SIZE_HANDLE.set(segment, 0L, maxMeshSharedMemorySize);
    	return this;
    }
    
    public int maxMeshSharedMemorySize() {
    	return (int) MAX_MESH_SHARED_MEMORY_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxMeshPayloadAndSharedMemorySize()
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxMeshPayloadAndSharedMemorySize(int maxMeshPayloadAndSharedMemorySize) {
    	MAX_MESH_PAYLOAD_AND_SHARED_MEMORY_SIZE_HANDLE.set(segment, 0L, maxMeshPayloadAndSharedMemorySize);
    	return this;
    }
    
    public int maxMeshPayloadAndSharedMemorySize() {
    	return (int) MAX_MESH_PAYLOAD_AND_SHARED_MEMORY_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxMeshOutputMemorySize()
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxMeshOutputMemorySize(int maxMeshOutputMemorySize) {
    	MAX_MESH_OUTPUT_MEMORY_SIZE_HANDLE.set(segment, 0L, maxMeshOutputMemorySize);
    	return this;
    }
    
    public int maxMeshOutputMemorySize() {
    	return (int) MAX_MESH_OUTPUT_MEMORY_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxMeshPayloadAndOutputMemorySize()
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxMeshPayloadAndOutputMemorySize(int maxMeshPayloadAndOutputMemorySize) {
    	MAX_MESH_PAYLOAD_AND_OUTPUT_MEMORY_SIZE_HANDLE.set(segment, 0L, maxMeshPayloadAndOutputMemorySize);
    	return this;
    }
    
    public int maxMeshPayloadAndOutputMemorySize() {
    	return (int) MAX_MESH_PAYLOAD_AND_OUTPUT_MEMORY_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxMeshOutputComponents()
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxMeshOutputComponents(int maxMeshOutputComponents) {
    	MAX_MESH_OUTPUT_COMPONENTS_HANDLE.set(segment, 0L, maxMeshOutputComponents);
    	return this;
    }
    
    public int maxMeshOutputComponents() {
    	return (int) MAX_MESH_OUTPUT_COMPONENTS_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxMeshOutputVertices()
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxMeshOutputVertices(int maxMeshOutputVertices) {
    	MAX_MESH_OUTPUT_VERTICES_HANDLE.set(segment, 0L, maxMeshOutputVertices);
    	return this;
    }
    
    public int maxMeshOutputVertices() {
    	return (int) MAX_MESH_OUTPUT_VERTICES_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxMeshOutputPrimitives()
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxMeshOutputPrimitives(int maxMeshOutputPrimitives) {
    	MAX_MESH_OUTPUT_PRIMITIVES_HANDLE.set(segment, 0L, maxMeshOutputPrimitives);
    	return this;
    }
    
    public int maxMeshOutputPrimitives() {
    	return (int) MAX_MESH_OUTPUT_PRIMITIVES_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxMeshOutputLayers()
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxMeshOutputLayers(int maxMeshOutputLayers) {
    	MAX_MESH_OUTPUT_LAYERS_HANDLE.set(segment, 0L, maxMeshOutputLayers);
    	return this;
    }
    
    public int maxMeshOutputLayers() {
    	return (int) MAX_MESH_OUTPUT_LAYERS_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxMeshMultiviewViewCount()
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxMeshMultiviewViewCount(int maxMeshMultiviewViewCount) {
    	MAX_MESH_MULTIVIEW_VIEW_COUNT_HANDLE.set(segment, 0L, maxMeshMultiviewViewCount);
    	return this;
    }
    
    public int maxMeshMultiviewViewCount() {
    	return (int) MAX_MESH_MULTIVIEW_VIEW_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #meshOutputPerVertexGranularity()
    public VkPhysicalDeviceMeshShaderPropertiesEXT meshOutputPerVertexGranularity(int meshOutputPerVertexGranularity) {
    	MESH_OUTPUT_PER_VERTEX_GRANULARITY_HANDLE.set(segment, 0L, meshOutputPerVertexGranularity);
    	return this;
    }
    
    public int meshOutputPerVertexGranularity() {
    	return (int) MESH_OUTPUT_PER_VERTEX_GRANULARITY_HANDLE.get(segment, 0L);
    }
    
    /// @see #meshOutputPerPrimitiveGranularity()
    public VkPhysicalDeviceMeshShaderPropertiesEXT meshOutputPerPrimitiveGranularity(int meshOutputPerPrimitiveGranularity) {
    	MESH_OUTPUT_PER_PRIMITIVE_GRANULARITY_HANDLE.set(segment, 0L, meshOutputPerPrimitiveGranularity);
    	return this;
    }
    
    public int meshOutputPerPrimitiveGranularity() {
    	return (int) MESH_OUTPUT_PER_PRIMITIVE_GRANULARITY_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxPreferredTaskWorkGroupInvocations()
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxPreferredTaskWorkGroupInvocations(int maxPreferredTaskWorkGroupInvocations) {
    	MAX_PREFERRED_TASK_WORK_GROUP_INVOCATIONS_HANDLE.set(segment, 0L, maxPreferredTaskWorkGroupInvocations);
    	return this;
    }
    
    public int maxPreferredTaskWorkGroupInvocations() {
    	return (int) MAX_PREFERRED_TASK_WORK_GROUP_INVOCATIONS_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxPreferredMeshWorkGroupInvocations()
    public VkPhysicalDeviceMeshShaderPropertiesEXT maxPreferredMeshWorkGroupInvocations(int maxPreferredMeshWorkGroupInvocations) {
    	MAX_PREFERRED_MESH_WORK_GROUP_INVOCATIONS_HANDLE.set(segment, 0L, maxPreferredMeshWorkGroupInvocations);
    	return this;
    }
    
    public int maxPreferredMeshWorkGroupInvocations() {
    	return (int) MAX_PREFERRED_MESH_WORK_GROUP_INVOCATIONS_HANDLE.get(segment, 0L);
    }
    
    /// @see #prefersLocalInvocationVertexOutput()
    public VkPhysicalDeviceMeshShaderPropertiesEXT prefersLocalInvocationVertexOutput(int prefersLocalInvocationVertexOutput) {
    	PREFERS_LOCAL_INVOCATION_VERTEX_OUTPUT_HANDLE.set(segment, 0L, prefersLocalInvocationVertexOutput);
    	return this;
    }
    
    public int prefersLocalInvocationVertexOutput() {
    	return (int) PREFERS_LOCAL_INVOCATION_VERTEX_OUTPUT_HANDLE.get(segment, 0L);
    }
    
    /// @see #prefersLocalInvocationPrimitiveOutput()
    public VkPhysicalDeviceMeshShaderPropertiesEXT prefersLocalInvocationPrimitiveOutput(int prefersLocalInvocationPrimitiveOutput) {
    	PREFERS_LOCAL_INVOCATION_PRIMITIVE_OUTPUT_HANDLE.set(segment, 0L, prefersLocalInvocationPrimitiveOutput);
    	return this;
    }
    
    public int prefersLocalInvocationPrimitiveOutput() {
    	return (int) PREFERS_LOCAL_INVOCATION_PRIMITIVE_OUTPUT_HANDLE.get(segment, 0L);
    }
    
    /// @see #prefersCompactVertexOutput()
    public VkPhysicalDeviceMeshShaderPropertiesEXT prefersCompactVertexOutput(int prefersCompactVertexOutput) {
    	PREFERS_COMPACT_VERTEX_OUTPUT_HANDLE.set(segment, 0L, prefersCompactVertexOutput);
    	return this;
    }
    
    public int prefersCompactVertexOutput() {
    	return (int) PREFERS_COMPACT_VERTEX_OUTPUT_HANDLE.get(segment, 0L);
    }
    
    /// @see #prefersCompactPrimitiveOutput()
    public VkPhysicalDeviceMeshShaderPropertiesEXT prefersCompactPrimitiveOutput(int prefersCompactPrimitiveOutput) {
    	PREFERS_COMPACT_PRIMITIVE_OUTPUT_HANDLE.set(segment, 0L, prefersCompactPrimitiveOutput);
    	return this;
    }
    
    public int prefersCompactPrimitiveOutput() {
    	return (int) PREFERS_COMPACT_PRIMITIVE_OUTPUT_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceMeshShaderPropertiesEXT set(VkPhysicalDeviceMeshShaderPropertiesEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceMeshShaderPropertiesEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceMeshShaderPropertiesEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceMeshShaderPropertiesEXT> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceMeshShaderPropertiesEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceMeshShaderPropertiesEXT> array(SegmentAllocator allocator, VkPhysicalDeviceMeshShaderPropertiesEXT... structs) {
        NativeStructArray<VkPhysicalDeviceMeshShaderPropertiesEXT> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceMeshShaderPropertiesEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceMeshShaderPropertiesEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceMeshShaderPropertiesEXT(segment)
        );
    }

}