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

public final class VkPhysicalDeviceSamplerFilterMinmaxProperties
		implements Struct<VkPhysicalDeviceSamplerFilterMinmaxProperties> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle FILTER_MINMAX_SINGLE_COMPONENT_FORMATS_HANDLE;
	public static final VarHandle FILTER_MINMAX_IMAGE_COMPONENT_MAPPING_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long FILTER_MINMAX_SINGLE_COMPONENT_FORMATS_BYTE_OFFSET;
	public static final long FILTER_MINMAX_IMAGE_COMPONENT_MAPPING_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("filterMinmaxSingleComponentFormats"),
		    JAVA_INT.withName("filterMinmaxImageComponentMapping")
		).withName("VkPhysicalDeviceSamplerFilterMinmaxProperties").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		FILTER_MINMAX_SINGLE_COMPONENT_FORMATS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("filterMinmaxSingleComponentFormats"));
		FILTER_MINMAX_IMAGE_COMPONENT_MAPPING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("filterMinmaxImageComponentMapping"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		FILTER_MINMAX_SINGLE_COMPONENT_FORMATS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("filterMinmaxSingleComponentFormats"));
		FILTER_MINMAX_IMAGE_COMPONENT_MAPPING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("filterMinmaxImageComponentMapping"));
		//@formatter:on
	}

	public VkPhysicalDeviceSamplerFilterMinmaxProperties() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceSamplerFilterMinmaxProperties(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceSamplerFilterMinmaxProperties(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceSamplerFilterMinmaxProperties sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceSamplerFilterMinmaxProperties pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #filterMinmaxSingleComponentFormats()
    public VkPhysicalDeviceSamplerFilterMinmaxProperties filterMinmaxSingleComponentFormats(int filterMinmaxSingleComponentFormats) {
    	FILTER_MINMAX_SINGLE_COMPONENT_FORMATS_HANDLE.set(segment, 0L, filterMinmaxSingleComponentFormats);
    	return this;
    }
    
    public int filterMinmaxSingleComponentFormats() {
    	return (int) FILTER_MINMAX_SINGLE_COMPONENT_FORMATS_HANDLE.get(segment, 0L);
    }
    
    /// @see #filterMinmaxImageComponentMapping()
    public VkPhysicalDeviceSamplerFilterMinmaxProperties filterMinmaxImageComponentMapping(int filterMinmaxImageComponentMapping) {
    	FILTER_MINMAX_IMAGE_COMPONENT_MAPPING_HANDLE.set(segment, 0L, filterMinmaxImageComponentMapping);
    	return this;
    }
    
    public int filterMinmaxImageComponentMapping() {
    	return (int) FILTER_MINMAX_IMAGE_COMPONENT_MAPPING_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceSamplerFilterMinmaxProperties set(VkPhysicalDeviceSamplerFilterMinmaxProperties other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceSamplerFilterMinmaxProperties set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceSamplerFilterMinmaxProperties> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceSamplerFilterMinmaxProperties> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceSamplerFilterMinmaxProperties(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceSamplerFilterMinmaxProperties> array(SegmentAllocator allocator, VkPhysicalDeviceSamplerFilterMinmaxProperties... structs) {
        NativeStructArray<VkPhysicalDeviceSamplerFilterMinmaxProperties> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceSamplerFilterMinmaxProperties(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceSamplerFilterMinmaxProperties> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceSamplerFilterMinmaxProperties(segment)
        );
    }

}