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

public final class VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT
		implements Struct<VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle IMAGE_SLICED_VIEW_OF3_D_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long IMAGE_SLICED_VIEW_OF3_D_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("imageSlicedViewOf3D"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		IMAGE_SLICED_VIEW_OF3_D_HANDLE = LAYOUT.varHandle(PathElement.groupElement("imageSlicedViewOf3D"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		IMAGE_SLICED_VIEW_OF3_D_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("imageSlicedViewOf3D"));
		//@formatter:on
	}

	public VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #imageSlicedViewOf3D()
    public VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT imageSlicedViewOf3D(int imageSlicedViewOf3D) {
    	IMAGE_SLICED_VIEW_OF3_D_HANDLE.set(segment, 0L, imageSlicedViewOf3D);
    	return this;
    }
    
    public int imageSlicedViewOf3D() {
    	return (int) IMAGE_SLICED_VIEW_OF3_D_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT set(VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT> array(SegmentAllocator allocator, VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT... structs) {
        NativeStructArray<VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT(segment)
        );
    }

}