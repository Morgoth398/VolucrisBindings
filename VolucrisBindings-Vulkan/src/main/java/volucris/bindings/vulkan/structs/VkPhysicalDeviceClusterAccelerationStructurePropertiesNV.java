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

public final class VkPhysicalDeviceClusterAccelerationStructurePropertiesNV
		implements Struct<VkPhysicalDeviceClusterAccelerationStructurePropertiesNV> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle MAX_VERTICES_PER_CLUSTER_HANDLE;
    public static final VarHandle MAX_TRIANGLES_PER_CLUSTER_HANDLE;
    public static final VarHandle CLUSTER_SCRATCH_BYTE_ALIGNMENT_HANDLE;
    public static final VarHandle CLUSTER_BYTE_ALIGNMENT_HANDLE;
    public static final VarHandle CLUSTER_TEMPLATE_BYTE_ALIGNMENT_HANDLE;
    public static final VarHandle CLUSTER_BOTTOM_LEVEL_BYTE_ALIGNMENT_HANDLE;
    public static final VarHandle CLUSTER_TEMPLATE_BOUNDS_BYTE_ALIGNMENT_HANDLE;
    public static final VarHandle MAX_CLUSTER_GEOMETRY_INDEX_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long MAX_VERTICES_PER_CLUSTER_BYTE_OFFSET;
    public static final long MAX_TRIANGLES_PER_CLUSTER_BYTE_OFFSET;
    public static final long CLUSTER_SCRATCH_BYTE_ALIGNMENT_BYTE_OFFSET;
    public static final long CLUSTER_BYTE_ALIGNMENT_BYTE_OFFSET;
    public static final long CLUSTER_TEMPLATE_BYTE_ALIGNMENT_BYTE_OFFSET;
    public static final long CLUSTER_BOTTOM_LEVEL_BYTE_ALIGNMENT_BYTE_OFFSET;
    public static final long CLUSTER_TEMPLATE_BOUNDS_BYTE_ALIGNMENT_BYTE_OFFSET;
    public static final long MAX_CLUSTER_GEOMETRY_INDEX_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("maxVerticesPerCluster"),
            JAVA_INT.withName("maxTrianglesPerCluster"),
            JAVA_INT.withName("clusterScratchByteAlignment"),
            JAVA_INT.withName("clusterByteAlignment"),
            JAVA_INT.withName("clusterTemplateByteAlignment"),
            JAVA_INT.withName("clusterBottomLevelByteAlignment"),
            JAVA_INT.withName("clusterTemplateBoundsByteAlignment"),
            JAVA_INT.withName("maxClusterGeometryIndex")
        ).withName("VkPhysicalDeviceClusterAccelerationStructurePropertiesNV").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        MAX_VERTICES_PER_CLUSTER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxVerticesPerCluster"));
        MAX_TRIANGLES_PER_CLUSTER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxTrianglesPerCluster"));
        CLUSTER_SCRATCH_BYTE_ALIGNMENT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("clusterScratchByteAlignment"));
        CLUSTER_BYTE_ALIGNMENT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("clusterByteAlignment"));
        CLUSTER_TEMPLATE_BYTE_ALIGNMENT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("clusterTemplateByteAlignment"));
        CLUSTER_BOTTOM_LEVEL_BYTE_ALIGNMENT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("clusterBottomLevelByteAlignment"));
        CLUSTER_TEMPLATE_BOUNDS_BYTE_ALIGNMENT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("clusterTemplateBoundsByteAlignment"));
        MAX_CLUSTER_GEOMETRY_INDEX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxClusterGeometryIndex"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        MAX_VERTICES_PER_CLUSTER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxVerticesPerCluster"));
        MAX_TRIANGLES_PER_CLUSTER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxTrianglesPerCluster"));
        CLUSTER_SCRATCH_BYTE_ALIGNMENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("clusterScratchByteAlignment"));
        CLUSTER_BYTE_ALIGNMENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("clusterByteAlignment"));
        CLUSTER_TEMPLATE_BYTE_ALIGNMENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("clusterTemplateByteAlignment"));
        CLUSTER_BOTTOM_LEVEL_BYTE_ALIGNMENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("clusterBottomLevelByteAlignment"));
        CLUSTER_TEMPLATE_BOUNDS_BYTE_ALIGNMENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("clusterTemplateBoundsByteAlignment"));
        MAX_CLUSTER_GEOMETRY_INDEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxClusterGeometryIndex"));
        //@formatter:on
    }

    public VkPhysicalDeviceClusterAccelerationStructurePropertiesNV() {
        this(Arena.ofAuto());
    }
    
    public VkPhysicalDeviceClusterAccelerationStructurePropertiesNV(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkPhysicalDeviceClusterAccelerationStructurePropertiesNV(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkPhysicalDeviceClusterAccelerationStructurePropertiesNV sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceClusterAccelerationStructurePropertiesNV pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #maxVerticesPerCluster()
    public VkPhysicalDeviceClusterAccelerationStructurePropertiesNV maxVerticesPerCluster(int maxVerticesPerCluster) {
    	MAX_VERTICES_PER_CLUSTER_HANDLE.set(segment, 0L, maxVerticesPerCluster);
    	return this;
    }
    
    public int maxVerticesPerCluster() {
    	return (int) MAX_VERTICES_PER_CLUSTER_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxTrianglesPerCluster()
    public VkPhysicalDeviceClusterAccelerationStructurePropertiesNV maxTrianglesPerCluster(int maxTrianglesPerCluster) {
    	MAX_TRIANGLES_PER_CLUSTER_HANDLE.set(segment, 0L, maxTrianglesPerCluster);
    	return this;
    }
    
    public int maxTrianglesPerCluster() {
    	return (int) MAX_TRIANGLES_PER_CLUSTER_HANDLE.get(segment, 0L);
    }
    
    /// @see #clusterScratchByteAlignment()
    public VkPhysicalDeviceClusterAccelerationStructurePropertiesNV clusterScratchByteAlignment(int clusterScratchByteAlignment) {
    	CLUSTER_SCRATCH_BYTE_ALIGNMENT_HANDLE.set(segment, 0L, clusterScratchByteAlignment);
    	return this;
    }
    
    public int clusterScratchByteAlignment() {
    	return (int) CLUSTER_SCRATCH_BYTE_ALIGNMENT_HANDLE.get(segment, 0L);
    }
    
    /// @see #clusterByteAlignment()
    public VkPhysicalDeviceClusterAccelerationStructurePropertiesNV clusterByteAlignment(int clusterByteAlignment) {
    	CLUSTER_BYTE_ALIGNMENT_HANDLE.set(segment, 0L, clusterByteAlignment);
    	return this;
    }
    
    public int clusterByteAlignment() {
    	return (int) CLUSTER_BYTE_ALIGNMENT_HANDLE.get(segment, 0L);
    }
    
    /// @see #clusterTemplateByteAlignment()
    public VkPhysicalDeviceClusterAccelerationStructurePropertiesNV clusterTemplateByteAlignment(int clusterTemplateByteAlignment) {
    	CLUSTER_TEMPLATE_BYTE_ALIGNMENT_HANDLE.set(segment, 0L, clusterTemplateByteAlignment);
    	return this;
    }
    
    public int clusterTemplateByteAlignment() {
    	return (int) CLUSTER_TEMPLATE_BYTE_ALIGNMENT_HANDLE.get(segment, 0L);
    }
    
    /// @see #clusterBottomLevelByteAlignment()
    public VkPhysicalDeviceClusterAccelerationStructurePropertiesNV clusterBottomLevelByteAlignment(int clusterBottomLevelByteAlignment) {
    	CLUSTER_BOTTOM_LEVEL_BYTE_ALIGNMENT_HANDLE.set(segment, 0L, clusterBottomLevelByteAlignment);
    	return this;
    }
    
    public int clusterBottomLevelByteAlignment() {
    	return (int) CLUSTER_BOTTOM_LEVEL_BYTE_ALIGNMENT_HANDLE.get(segment, 0L);
    }
    
    /// @see #clusterTemplateBoundsByteAlignment()
    public VkPhysicalDeviceClusterAccelerationStructurePropertiesNV clusterTemplateBoundsByteAlignment(int clusterTemplateBoundsByteAlignment) {
    	CLUSTER_TEMPLATE_BOUNDS_BYTE_ALIGNMENT_HANDLE.set(segment, 0L, clusterTemplateBoundsByteAlignment);
    	return this;
    }
    
    public int clusterTemplateBoundsByteAlignment() {
    	return (int) CLUSTER_TEMPLATE_BOUNDS_BYTE_ALIGNMENT_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxClusterGeometryIndex()
    public VkPhysicalDeviceClusterAccelerationStructurePropertiesNV maxClusterGeometryIndex(int maxClusterGeometryIndex) {
    	MAX_CLUSTER_GEOMETRY_INDEX_HANDLE.set(segment, 0L, maxClusterGeometryIndex);
    	return this;
    }
    
    public int maxClusterGeometryIndex() {
    	return (int) MAX_CLUSTER_GEOMETRY_INDEX_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceClusterAccelerationStructurePropertiesNV set(VkPhysicalDeviceClusterAccelerationStructurePropertiesNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceClusterAccelerationStructurePropertiesNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceClusterAccelerationStructurePropertiesNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceClusterAccelerationStructurePropertiesNV> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceClusterAccelerationStructurePropertiesNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceClusterAccelerationStructurePropertiesNV> array(Arena arena, VkPhysicalDeviceClusterAccelerationStructurePropertiesNV... structs) {
        NativeStructArray<VkPhysicalDeviceClusterAccelerationStructurePropertiesNV> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceClusterAccelerationStructurePropertiesNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceClusterAccelerationStructurePropertiesNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceClusterAccelerationStructurePropertiesNV(segment)
        );
    }
    
}