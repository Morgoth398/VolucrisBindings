/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.unions;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.UnionLayout;
import java.lang.invoke.VarHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.structs.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkClusterAccelerationStructureOpInputNV
		implements Struct<VkClusterAccelerationStructureOpInputNV> {

    public static final UnionLayout LAYOUT;

    public static final VarHandle P_CLUSTERS_BOTTOM_LEVEL_HANDLE;
    public static final VarHandle P_TRIANGLE_CLUSTERS_HANDLE;
    public static final VarHandle P_MOVE_OBJECTS_HANDLE;

    public static final long P_CLUSTERS_BOTTOM_LEVEL_BYTE_OFFSET;
    public static final long P_TRIANGLE_CLUSTERS_BYTE_OFFSET;
    public static final long P_MOVE_OBJECTS_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.unionLayout(
            UNBOUNDED_ADDRESS.withName("pClustersBottomLevel"),
            UNBOUNDED_ADDRESS.withName("pTriangleClusters"),
            UNBOUNDED_ADDRESS.withName("pMoveObjects")
        ).withName("VkClusterAccelerationStructureOpInputNV").withByteAlignment(8);
        
        P_CLUSTERS_BOTTOM_LEVEL_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pClustersBottomLevel"));
        P_TRIANGLE_CLUSTERS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pTriangleClusters"));
        P_MOVE_OBJECTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pMoveObjects"));
        
        P_CLUSTERS_BOTTOM_LEVEL_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pClustersBottomLevel"));
        P_TRIANGLE_CLUSTERS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pTriangleClusters"));
        P_MOVE_OBJECTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pMoveObjects"));
        //@formatter:on
    }

    public VkClusterAccelerationStructureOpInputNV() {
        this(Arena.ofAuto());
    }
    
    public VkClusterAccelerationStructureOpInputNV(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkClusterAccelerationStructureOpInputNV(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #pClustersBottomLevel()
    public VkClusterAccelerationStructureOpInputNV pClustersBottomLevel(VkClusterAccelerationStructureClustersBottomLevelInputNV pClustersBottomLevel) {
    	P_CLUSTERS_BOTTOM_LEVEL_HANDLE.set(segment, 0L, pClustersBottomLevel.memorySegment());
    	return this;
    }
    
    public @Nullable VkClusterAccelerationStructureClustersBottomLevelInputNV pClustersBottomLevel() {
    	MemorySegment segment = (MemorySegment) P_CLUSTERS_BOTTOM_LEVEL_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkClusterAccelerationStructureClustersBottomLevelInputNV(segment);
    }
    
    /// @see #pTriangleClusters()
    public VkClusterAccelerationStructureOpInputNV pTriangleClusters(VkClusterAccelerationStructureTriangleClusterInputNV pTriangleClusters) {
    	P_TRIANGLE_CLUSTERS_HANDLE.set(segment, 0L, pTriangleClusters.memorySegment());
    	return this;
    }
    
    public @Nullable VkClusterAccelerationStructureTriangleClusterInputNV pTriangleClusters() {
    	MemorySegment segment = (MemorySegment) P_TRIANGLE_CLUSTERS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkClusterAccelerationStructureTriangleClusterInputNV(segment);
    }
    
    /// @see #pMoveObjects()
    public VkClusterAccelerationStructureOpInputNV pMoveObjects(VkClusterAccelerationStructureMoveObjectsInputNV pMoveObjects) {
    	P_MOVE_OBJECTS_HANDLE.set(segment, 0L, pMoveObjects.memorySegment());
    	return this;
    }
    
    public @Nullable VkClusterAccelerationStructureMoveObjectsInputNV pMoveObjects() {
    	MemorySegment segment = (MemorySegment) P_MOVE_OBJECTS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkClusterAccelerationStructureMoveObjectsInputNV(segment);
    }
    
    @Override
    public VkClusterAccelerationStructureOpInputNV set(VkClusterAccelerationStructureOpInputNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkClusterAccelerationStructureOpInputNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkClusterAccelerationStructureOpInputNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkClusterAccelerationStructureOpInputNV> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkClusterAccelerationStructureOpInputNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkClusterAccelerationStructureOpInputNV> array(Arena arena, VkClusterAccelerationStructureOpInputNV... structs) {
        NativeStructArray<VkClusterAccelerationStructureOpInputNV> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkClusterAccelerationStructureOpInputNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkClusterAccelerationStructureOpInputNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkClusterAccelerationStructureOpInputNV(segment)
        );
    }
    
}