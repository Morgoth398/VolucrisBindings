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

public final class VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT
		implements Struct<VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle GRAPHICS_PIPELINE_LIBRARY_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long GRAPHICS_PIPELINE_LIBRARY_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("graphicsPipelineLibrary"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		GRAPHICS_PIPELINE_LIBRARY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("graphicsPipelineLibrary"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		GRAPHICS_PIPELINE_LIBRARY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("graphicsPipelineLibrary"));
		//@formatter:on
	}

	public VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #graphicsPipelineLibrary()
    public VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT graphicsPipelineLibrary(int graphicsPipelineLibrary) {
    	GRAPHICS_PIPELINE_LIBRARY_HANDLE.set(segment, 0L, graphicsPipelineLibrary);
    	return this;
    }
    
    public int graphicsPipelineLibrary() {
    	return (int) GRAPHICS_PIPELINE_LIBRARY_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT set(VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT> array(SegmentAllocator allocator, VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT... structs) {
        NativeStructArray<VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT(segment)
        );
    }

}