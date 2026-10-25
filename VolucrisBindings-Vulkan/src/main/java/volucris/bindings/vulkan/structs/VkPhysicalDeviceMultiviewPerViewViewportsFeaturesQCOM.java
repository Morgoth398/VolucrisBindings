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

public final class VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM
		implements Struct<VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle MULTIVIEW_PER_VIEW_VIEWPORTS_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long MULTIVIEW_PER_VIEW_VIEWPORTS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("multiviewPerViewViewports"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		MULTIVIEW_PER_VIEW_VIEWPORTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("multiviewPerViewViewports"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		MULTIVIEW_PER_VIEW_VIEWPORTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("multiviewPerViewViewports"));
		//@formatter:on
	}

	public VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #multiviewPerViewViewports()
    public VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM multiviewPerViewViewports(int multiviewPerViewViewports) {
    	MULTIVIEW_PER_VIEW_VIEWPORTS_HANDLE.set(segment, 0L, multiviewPerViewViewports);
    	return this;
    }
    
    public int multiviewPerViewViewports() {
    	return (int) MULTIVIEW_PER_VIEW_VIEWPORTS_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM set(VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM> array(SegmentAllocator allocator, VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM... structs) {
        NativeStructArray<VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM(segment)
        );
    }

}