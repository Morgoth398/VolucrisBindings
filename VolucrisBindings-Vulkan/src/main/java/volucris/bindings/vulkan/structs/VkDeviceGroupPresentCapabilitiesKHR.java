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

public final class VkDeviceGroupPresentCapabilitiesKHR
		implements Struct<VkDeviceGroupPresentCapabilitiesKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle PRESENT_MASK_HANDLE;
	public static final VarHandle MODES_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long PRESENT_MASK_BYTE_OFFSET;
	public static final long MODES_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    MemoryLayout.sequenceLayout(32, JAVA_INT).withName("presentMask"),
		    JAVA_INT.withName("modes"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkDeviceGroupPresentCapabilitiesKHR").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		PRESENT_MASK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("presentMask"), PathElement.sequenceElement());
		MODES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("modes"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		PRESENT_MASK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("presentMask"));
		MODES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("modes"));
		//@formatter:on
	}

	public VkDeviceGroupPresentCapabilitiesKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkDeviceGroupPresentCapabilitiesKHR(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkDeviceGroupPresentCapabilitiesKHR(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkDeviceGroupPresentCapabilitiesKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkDeviceGroupPresentCapabilitiesKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #presentMask(int)
    public VkDeviceGroupPresentCapabilitiesKHR presentMask(int presentMask, int index0) {
    	PRESENT_MASK_HANDLE.set(segment, 0L, index0, presentMask);
    	return this;
    }
    
    public int presentMask(int index0) {
    	return (int) PRESENT_MASK_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #modes()
    public VkDeviceGroupPresentCapabilitiesKHR modes(int modes) {
    	MODES_HANDLE.set(segment, 0L, modes);
    	return this;
    }
    
    public int modes() {
    	return (int) MODES_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkDeviceGroupPresentCapabilitiesKHR set(VkDeviceGroupPresentCapabilitiesKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkDeviceGroupPresentCapabilitiesKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDeviceGroupPresentCapabilitiesKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDeviceGroupPresentCapabilitiesKHR> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkDeviceGroupPresentCapabilitiesKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDeviceGroupPresentCapabilitiesKHR> array(SegmentAllocator allocator, VkDeviceGroupPresentCapabilitiesKHR... structs) {
        NativeStructArray<VkDeviceGroupPresentCapabilitiesKHR> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkDeviceGroupPresentCapabilitiesKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDeviceGroupPresentCapabilitiesKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDeviceGroupPresentCapabilitiesKHR(segment)
        );
    }

}