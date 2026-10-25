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

public final class VkPhysicalDeviceImageAlignmentControlFeaturesMESA
		implements Struct<VkPhysicalDeviceImageAlignmentControlFeaturesMESA> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle IMAGE_ALIGNMENT_CONTROL_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long IMAGE_ALIGNMENT_CONTROL_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("imageAlignmentControl"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPhysicalDeviceImageAlignmentControlFeaturesMESA").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		IMAGE_ALIGNMENT_CONTROL_HANDLE = LAYOUT.varHandle(PathElement.groupElement("imageAlignmentControl"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		IMAGE_ALIGNMENT_CONTROL_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("imageAlignmentControl"));
		//@formatter:on
	}

	public VkPhysicalDeviceImageAlignmentControlFeaturesMESA() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceImageAlignmentControlFeaturesMESA(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceImageAlignmentControlFeaturesMESA(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceImageAlignmentControlFeaturesMESA sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceImageAlignmentControlFeaturesMESA pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #imageAlignmentControl()
    public VkPhysicalDeviceImageAlignmentControlFeaturesMESA imageAlignmentControl(int imageAlignmentControl) {
    	IMAGE_ALIGNMENT_CONTROL_HANDLE.set(segment, 0L, imageAlignmentControl);
    	return this;
    }
    
    public int imageAlignmentControl() {
    	return (int) IMAGE_ALIGNMENT_CONTROL_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceImageAlignmentControlFeaturesMESA set(VkPhysicalDeviceImageAlignmentControlFeaturesMESA other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceImageAlignmentControlFeaturesMESA set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceImageAlignmentControlFeaturesMESA> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceImageAlignmentControlFeaturesMESA> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceImageAlignmentControlFeaturesMESA(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceImageAlignmentControlFeaturesMESA> array(SegmentAllocator allocator, VkPhysicalDeviceImageAlignmentControlFeaturesMESA... structs) {
        NativeStructArray<VkPhysicalDeviceImageAlignmentControlFeaturesMESA> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceImageAlignmentControlFeaturesMESA(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceImageAlignmentControlFeaturesMESA> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceImageAlignmentControlFeaturesMESA(segment)
        );
    }

}