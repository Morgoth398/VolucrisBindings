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

public final class VkPhysicalDeviceFragmentDensityMap2PropertiesEXT
		implements Struct<VkPhysicalDeviceFragmentDensityMap2PropertiesEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle SUBSAMPLED_LOADS_HANDLE;
	public static final VarHandle SUBSAMPLED_COARSE_RECONSTRUCTION_EARLY_ACCESS_HANDLE;
	public static final VarHandle MAX_SUBSAMPLED_ARRAY_LAYERS_HANDLE;
	public static final VarHandle MAX_DESCRIPTOR_SET_SUBSAMPLED_SAMPLERS_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long SUBSAMPLED_LOADS_BYTE_OFFSET;
	public static final long SUBSAMPLED_COARSE_RECONSTRUCTION_EARLY_ACCESS_BYTE_OFFSET;
	public static final long MAX_SUBSAMPLED_ARRAY_LAYERS_BYTE_OFFSET;
	public static final long MAX_DESCRIPTOR_SET_SUBSAMPLED_SAMPLERS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("subsampledLoads"),
		    JAVA_INT.withName("subsampledCoarseReconstructionEarlyAccess"),
		    JAVA_INT.withName("maxSubsampledArrayLayers"),
		    JAVA_INT.withName("maxDescriptorSetSubsampledSamplers")
		).withName("VkPhysicalDeviceFragmentDensityMap2PropertiesEXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		SUBSAMPLED_LOADS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("subsampledLoads"));
		SUBSAMPLED_COARSE_RECONSTRUCTION_EARLY_ACCESS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("subsampledCoarseReconstructionEarlyAccess"));
		MAX_SUBSAMPLED_ARRAY_LAYERS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxSubsampledArrayLayers"));
		MAX_DESCRIPTOR_SET_SUBSAMPLED_SAMPLERS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxDescriptorSetSubsampledSamplers"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		SUBSAMPLED_LOADS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("subsampledLoads"));
		SUBSAMPLED_COARSE_RECONSTRUCTION_EARLY_ACCESS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("subsampledCoarseReconstructionEarlyAccess"));
		MAX_SUBSAMPLED_ARRAY_LAYERS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxSubsampledArrayLayers"));
		MAX_DESCRIPTOR_SET_SUBSAMPLED_SAMPLERS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetSubsampledSamplers"));
		//@formatter:on
	}

	public VkPhysicalDeviceFragmentDensityMap2PropertiesEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceFragmentDensityMap2PropertiesEXT(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceFragmentDensityMap2PropertiesEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceFragmentDensityMap2PropertiesEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceFragmentDensityMap2PropertiesEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #subsampledLoads()
    public VkPhysicalDeviceFragmentDensityMap2PropertiesEXT subsampledLoads(int subsampledLoads) {
    	SUBSAMPLED_LOADS_HANDLE.set(segment, 0L, subsampledLoads);
    	return this;
    }
    
    public int subsampledLoads() {
    	return (int) SUBSAMPLED_LOADS_HANDLE.get(segment, 0L);
    }
    
    /// @see #subsampledCoarseReconstructionEarlyAccess()
    public VkPhysicalDeviceFragmentDensityMap2PropertiesEXT subsampledCoarseReconstructionEarlyAccess(int subsampledCoarseReconstructionEarlyAccess) {
    	SUBSAMPLED_COARSE_RECONSTRUCTION_EARLY_ACCESS_HANDLE.set(segment, 0L, subsampledCoarseReconstructionEarlyAccess);
    	return this;
    }
    
    public int subsampledCoarseReconstructionEarlyAccess() {
    	return (int) SUBSAMPLED_COARSE_RECONSTRUCTION_EARLY_ACCESS_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxSubsampledArrayLayers()
    public VkPhysicalDeviceFragmentDensityMap2PropertiesEXT maxSubsampledArrayLayers(int maxSubsampledArrayLayers) {
    	MAX_SUBSAMPLED_ARRAY_LAYERS_HANDLE.set(segment, 0L, maxSubsampledArrayLayers);
    	return this;
    }
    
    public int maxSubsampledArrayLayers() {
    	return (int) MAX_SUBSAMPLED_ARRAY_LAYERS_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxDescriptorSetSubsampledSamplers()
    public VkPhysicalDeviceFragmentDensityMap2PropertiesEXT maxDescriptorSetSubsampledSamplers(int maxDescriptorSetSubsampledSamplers) {
    	MAX_DESCRIPTOR_SET_SUBSAMPLED_SAMPLERS_HANDLE.set(segment, 0L, maxDescriptorSetSubsampledSamplers);
    	return this;
    }
    
    public int maxDescriptorSetSubsampledSamplers() {
    	return (int) MAX_DESCRIPTOR_SET_SUBSAMPLED_SAMPLERS_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceFragmentDensityMap2PropertiesEXT set(VkPhysicalDeviceFragmentDensityMap2PropertiesEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceFragmentDensityMap2PropertiesEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceFragmentDensityMap2PropertiesEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceFragmentDensityMap2PropertiesEXT> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceFragmentDensityMap2PropertiesEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceFragmentDensityMap2PropertiesEXT> array(SegmentAllocator allocator, VkPhysicalDeviceFragmentDensityMap2PropertiesEXT... structs) {
        NativeStructArray<VkPhysicalDeviceFragmentDensityMap2PropertiesEXT> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceFragmentDensityMap2PropertiesEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceFragmentDensityMap2PropertiesEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceFragmentDensityMap2PropertiesEXT(segment)
        );
    }

}