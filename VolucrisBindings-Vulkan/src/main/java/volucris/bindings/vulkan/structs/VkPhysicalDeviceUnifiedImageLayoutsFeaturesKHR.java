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

public final class VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR
		implements Struct<VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle UNIFIED_IMAGE_LAYOUTS_HANDLE;
	public static final VarHandle UNIFIED_IMAGE_LAYOUTS_VIDEO_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long UNIFIED_IMAGE_LAYOUTS_BYTE_OFFSET;
	public static final long UNIFIED_IMAGE_LAYOUTS_VIDEO_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("unifiedImageLayouts"),
		    JAVA_INT.withName("unifiedImageLayoutsVideo")
		).withName("VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		UNIFIED_IMAGE_LAYOUTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("unifiedImageLayouts"));
		UNIFIED_IMAGE_LAYOUTS_VIDEO_HANDLE = LAYOUT.varHandle(PathElement.groupElement("unifiedImageLayoutsVideo"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		UNIFIED_IMAGE_LAYOUTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("unifiedImageLayouts"));
		UNIFIED_IMAGE_LAYOUTS_VIDEO_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("unifiedImageLayoutsVideo"));
		//@formatter:on
	}

	public VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #unifiedImageLayouts()
    public VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR unifiedImageLayouts(int unifiedImageLayouts) {
    	UNIFIED_IMAGE_LAYOUTS_HANDLE.set(segment, 0L, unifiedImageLayouts);
    	return this;
    }
    
    public int unifiedImageLayouts() {
    	return (int) UNIFIED_IMAGE_LAYOUTS_HANDLE.get(segment, 0L);
    }
    
    /// @see #unifiedImageLayoutsVideo()
    public VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR unifiedImageLayoutsVideo(int unifiedImageLayoutsVideo) {
    	UNIFIED_IMAGE_LAYOUTS_VIDEO_HANDLE.set(segment, 0L, unifiedImageLayoutsVideo);
    	return this;
    }
    
    public int unifiedImageLayoutsVideo() {
    	return (int) UNIFIED_IMAGE_LAYOUTS_VIDEO_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR set(VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR> array(SegmentAllocator allocator, VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR... structs) {
        NativeStructArray<VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceUnifiedImageLayoutsFeaturesKHR(segment)
        );
    }

}