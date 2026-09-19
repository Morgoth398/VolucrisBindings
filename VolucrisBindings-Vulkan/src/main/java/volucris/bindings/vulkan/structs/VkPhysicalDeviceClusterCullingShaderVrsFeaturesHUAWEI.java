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

public final class VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI
		implements Struct<VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle CLUSTER_SHADING_RATE_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long CLUSTER_SHADING_RATE_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("clusterShadingRate"),
            MemoryLayout.paddingLayout(4)
        ).withName("VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        CLUSTER_SHADING_RATE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("clusterShadingRate"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        CLUSTER_SHADING_RATE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("clusterShadingRate"));
        //@formatter:on
    }

    public VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI() {
        this(Arena.ofAuto());
    }
    
    public VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #clusterShadingRate()
    public VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI clusterShadingRate(int clusterShadingRate) {
    	CLUSTER_SHADING_RATE_HANDLE.set(segment, 0L, clusterShadingRate);
    	return this;
    }
    
    public int clusterShadingRate() {
    	return (int) CLUSTER_SHADING_RATE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI set(VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI> array(Arena arena, VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI... structs) {
        NativeStructArray<VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceClusterCullingShaderVrsFeaturesHUAWEI(segment)
        );
    }
    
}