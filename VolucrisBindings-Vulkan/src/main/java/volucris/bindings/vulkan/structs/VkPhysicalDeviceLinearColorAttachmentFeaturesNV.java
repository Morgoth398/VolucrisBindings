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

public final class VkPhysicalDeviceLinearColorAttachmentFeaturesNV
		implements Struct<VkPhysicalDeviceLinearColorAttachmentFeaturesNV> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle LINEAR_COLOR_ATTACHMENT_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long LINEAR_COLOR_ATTACHMENT_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("linearColorAttachment"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPhysicalDeviceLinearColorAttachmentFeaturesNV").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		LINEAR_COLOR_ATTACHMENT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("linearColorAttachment"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		LINEAR_COLOR_ATTACHMENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("linearColorAttachment"));
		//@formatter:on
	}

	public VkPhysicalDeviceLinearColorAttachmentFeaturesNV() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceLinearColorAttachmentFeaturesNV(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceLinearColorAttachmentFeaturesNV(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceLinearColorAttachmentFeaturesNV sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceLinearColorAttachmentFeaturesNV pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #linearColorAttachment()
    public VkPhysicalDeviceLinearColorAttachmentFeaturesNV linearColorAttachment(int linearColorAttachment) {
    	LINEAR_COLOR_ATTACHMENT_HANDLE.set(segment, 0L, linearColorAttachment);
    	return this;
    }
    
    public int linearColorAttachment() {
    	return (int) LINEAR_COLOR_ATTACHMENT_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceLinearColorAttachmentFeaturesNV set(VkPhysicalDeviceLinearColorAttachmentFeaturesNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceLinearColorAttachmentFeaturesNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceLinearColorAttachmentFeaturesNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceLinearColorAttachmentFeaturesNV> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceLinearColorAttachmentFeaturesNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceLinearColorAttachmentFeaturesNV> array(SegmentAllocator allocator, VkPhysicalDeviceLinearColorAttachmentFeaturesNV... structs) {
        NativeStructArray<VkPhysicalDeviceLinearColorAttachmentFeaturesNV> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceLinearColorAttachmentFeaturesNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceLinearColorAttachmentFeaturesNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceLinearColorAttachmentFeaturesNV(segment)
        );
    }

}