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

public final class VkPhysicalDeviceFragmentDensityMapFeaturesEXT
		implements Struct<VkPhysicalDeviceFragmentDensityMapFeaturesEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle FRAGMENT_DENSITY_MAP_HANDLE;
	public static final VarHandle FRAGMENT_DENSITY_MAP_DYNAMIC_HANDLE;
	public static final VarHandle FRAGMENT_DENSITY_MAP_NON_SUBSAMPLED_IMAGES_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long FRAGMENT_DENSITY_MAP_BYTE_OFFSET;
	public static final long FRAGMENT_DENSITY_MAP_DYNAMIC_BYTE_OFFSET;
	public static final long FRAGMENT_DENSITY_MAP_NON_SUBSAMPLED_IMAGES_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("fragmentDensityMap"),
		    JAVA_INT.withName("fragmentDensityMapDynamic"),
		    JAVA_INT.withName("fragmentDensityMapNonSubsampledImages"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPhysicalDeviceFragmentDensityMapFeaturesEXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		FRAGMENT_DENSITY_MAP_HANDLE = LAYOUT.varHandle(PathElement.groupElement("fragmentDensityMap"));
		FRAGMENT_DENSITY_MAP_DYNAMIC_HANDLE = LAYOUT.varHandle(PathElement.groupElement("fragmentDensityMapDynamic"));
		FRAGMENT_DENSITY_MAP_NON_SUBSAMPLED_IMAGES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("fragmentDensityMapNonSubsampledImages"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		FRAGMENT_DENSITY_MAP_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("fragmentDensityMap"));
		FRAGMENT_DENSITY_MAP_DYNAMIC_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("fragmentDensityMapDynamic"));
		FRAGMENT_DENSITY_MAP_NON_SUBSAMPLED_IMAGES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("fragmentDensityMapNonSubsampledImages"));
		//@formatter:on
	}

	public VkPhysicalDeviceFragmentDensityMapFeaturesEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceFragmentDensityMapFeaturesEXT(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceFragmentDensityMapFeaturesEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceFragmentDensityMapFeaturesEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceFragmentDensityMapFeaturesEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #fragmentDensityMap()
    public VkPhysicalDeviceFragmentDensityMapFeaturesEXT fragmentDensityMap(int fragmentDensityMap) {
    	FRAGMENT_DENSITY_MAP_HANDLE.set(segment, 0L, fragmentDensityMap);
    	return this;
    }
    
    public int fragmentDensityMap() {
    	return (int) FRAGMENT_DENSITY_MAP_HANDLE.get(segment, 0L);
    }
    
    /// @see #fragmentDensityMapDynamic()
    public VkPhysicalDeviceFragmentDensityMapFeaturesEXT fragmentDensityMapDynamic(int fragmentDensityMapDynamic) {
    	FRAGMENT_DENSITY_MAP_DYNAMIC_HANDLE.set(segment, 0L, fragmentDensityMapDynamic);
    	return this;
    }
    
    public int fragmentDensityMapDynamic() {
    	return (int) FRAGMENT_DENSITY_MAP_DYNAMIC_HANDLE.get(segment, 0L);
    }
    
    /// @see #fragmentDensityMapNonSubsampledImages()
    public VkPhysicalDeviceFragmentDensityMapFeaturesEXT fragmentDensityMapNonSubsampledImages(int fragmentDensityMapNonSubsampledImages) {
    	FRAGMENT_DENSITY_MAP_NON_SUBSAMPLED_IMAGES_HANDLE.set(segment, 0L, fragmentDensityMapNonSubsampledImages);
    	return this;
    }
    
    public int fragmentDensityMapNonSubsampledImages() {
    	return (int) FRAGMENT_DENSITY_MAP_NON_SUBSAMPLED_IMAGES_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceFragmentDensityMapFeaturesEXT set(VkPhysicalDeviceFragmentDensityMapFeaturesEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceFragmentDensityMapFeaturesEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceFragmentDensityMapFeaturesEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceFragmentDensityMapFeaturesEXT> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceFragmentDensityMapFeaturesEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceFragmentDensityMapFeaturesEXT> array(SegmentAllocator allocator, VkPhysicalDeviceFragmentDensityMapFeaturesEXT... structs) {
        NativeStructArray<VkPhysicalDeviceFragmentDensityMapFeaturesEXT> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceFragmentDensityMapFeaturesEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceFragmentDensityMapFeaturesEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceFragmentDensityMapFeaturesEXT(segment)
        );
    }

}