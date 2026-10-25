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

public final class VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT
		implements Struct<VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle FRAGMENT_DENSITY_MAP_OFFSET_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long FRAGMENT_DENSITY_MAP_OFFSET_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("fragmentDensityMapOffset"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		FRAGMENT_DENSITY_MAP_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("fragmentDensityMapOffset"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		FRAGMENT_DENSITY_MAP_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("fragmentDensityMapOffset"));
		//@formatter:on
	}

	public VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #fragmentDensityMapOffset()
    public VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT fragmentDensityMapOffset(int fragmentDensityMapOffset) {
    	FRAGMENT_DENSITY_MAP_OFFSET_HANDLE.set(segment, 0L, fragmentDensityMapOffset);
    	return this;
    }
    
    public int fragmentDensityMapOffset() {
    	return (int) FRAGMENT_DENSITY_MAP_OFFSET_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT set(VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT> array(SegmentAllocator allocator, VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT... structs) {
        NativeStructArray<VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceFragmentDensityMapOffsetFeaturesEXT(segment)
        );
    }

}