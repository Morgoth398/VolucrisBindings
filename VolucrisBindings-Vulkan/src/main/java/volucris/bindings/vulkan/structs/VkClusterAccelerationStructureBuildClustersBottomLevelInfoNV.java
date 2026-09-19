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

public final class VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV
		implements Struct<VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV> {

    public static final StructLayout LAYOUT;

    public static final VarHandle CLUSTER_REFERENCES_COUNT_HANDLE;
    public static final VarHandle CLUSTER_REFERENCES_STRIDE_HANDLE;
    public static final VarHandle CLUSTER_REFERENCES_HANDLE;

    public static final long CLUSTER_REFERENCES_COUNT_BYTE_OFFSET;
    public static final long CLUSTER_REFERENCES_STRIDE_BYTE_OFFSET;
    public static final long CLUSTER_REFERENCES_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("clusterReferencesCount"),
            JAVA_INT.withName("clusterReferencesStride"),
            JAVA_LONG.withName("clusterReferences")
        ).withName("VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV").withByteAlignment(8);
        
        CLUSTER_REFERENCES_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("clusterReferencesCount"));
        CLUSTER_REFERENCES_STRIDE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("clusterReferencesStride"));
        CLUSTER_REFERENCES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("clusterReferences"));
        
        CLUSTER_REFERENCES_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("clusterReferencesCount"));
        CLUSTER_REFERENCES_STRIDE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("clusterReferencesStride"));
        CLUSTER_REFERENCES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("clusterReferences"));
        //@formatter:on
    }

    public VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV() {
        this(Arena.ofAuto());
    }
    
    public VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #clusterReferencesCount()
    public VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV clusterReferencesCount(int clusterReferencesCount) {
    	CLUSTER_REFERENCES_COUNT_HANDLE.set(segment, 0L, clusterReferencesCount);
    	return this;
    }
    
    public int clusterReferencesCount() {
    	return (int) CLUSTER_REFERENCES_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #clusterReferencesStride()
    public VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV clusterReferencesStride(int clusterReferencesStride) {
    	CLUSTER_REFERENCES_STRIDE_HANDLE.set(segment, 0L, clusterReferencesStride);
    	return this;
    }
    
    public int clusterReferencesStride() {
    	return (int) CLUSTER_REFERENCES_STRIDE_HANDLE.get(segment, 0L);
    }
    
    /// @see #clusterReferences()
    public VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV clusterReferences(long clusterReferences) {
    	CLUSTER_REFERENCES_HANDLE.set(segment, 0L, clusterReferences);
    	return this;
    }
    
    public long clusterReferences() {
    	return (long) CLUSTER_REFERENCES_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV set(VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV> array(Arena arena, VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV... structs) {
        NativeStructArray<VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkClusterAccelerationStructureBuildClustersBottomLevelInfoNV(segment)
        );
    }
    
}