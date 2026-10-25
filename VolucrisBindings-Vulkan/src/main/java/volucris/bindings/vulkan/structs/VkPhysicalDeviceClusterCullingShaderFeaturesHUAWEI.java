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

public final class VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI
		implements Struct<VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle CLUSTERCULLING_SHADER_HANDLE;
	public static final VarHandle MULTIVIEW_CLUSTER_CULLING_SHADER_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long CLUSTERCULLING_SHADER_BYTE_OFFSET;
	public static final long MULTIVIEW_CLUSTER_CULLING_SHADER_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("clustercullingShader"),
		    JAVA_INT.withName("multiviewClusterCullingShader")
		).withName("VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		CLUSTERCULLING_SHADER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("clustercullingShader"));
		MULTIVIEW_CLUSTER_CULLING_SHADER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("multiviewClusterCullingShader"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		CLUSTERCULLING_SHADER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("clustercullingShader"));
		MULTIVIEW_CLUSTER_CULLING_SHADER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("multiviewClusterCullingShader"));
		//@formatter:on
	}

	public VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #clustercullingShader()
    public VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI clustercullingShader(int clustercullingShader) {
    	CLUSTERCULLING_SHADER_HANDLE.set(segment, 0L, clustercullingShader);
    	return this;
    }
    
    public int clustercullingShader() {
    	return (int) CLUSTERCULLING_SHADER_HANDLE.get(segment, 0L);
    }
    
    /// @see #multiviewClusterCullingShader()
    public VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI multiviewClusterCullingShader(int multiviewClusterCullingShader) {
    	MULTIVIEW_CLUSTER_CULLING_SHADER_HANDLE.set(segment, 0L, multiviewClusterCullingShader);
    	return this;
    }
    
    public int multiviewClusterCullingShader() {
    	return (int) MULTIVIEW_CLUSTER_CULLING_SHADER_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI set(VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI> array(SegmentAllocator allocator, VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI... structs) {
        NativeStructArray<VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI(segment)
        );
    }

}