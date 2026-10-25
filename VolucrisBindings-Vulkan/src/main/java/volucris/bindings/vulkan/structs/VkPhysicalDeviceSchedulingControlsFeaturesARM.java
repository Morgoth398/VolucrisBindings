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

public final class VkPhysicalDeviceSchedulingControlsFeaturesARM
		implements Struct<VkPhysicalDeviceSchedulingControlsFeaturesARM> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle SCHEDULING_CONTROLS_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long SCHEDULING_CONTROLS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("schedulingControls"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPhysicalDeviceSchedulingControlsFeaturesARM").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		SCHEDULING_CONTROLS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("schedulingControls"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		SCHEDULING_CONTROLS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("schedulingControls"));
		//@formatter:on
	}

	public VkPhysicalDeviceSchedulingControlsFeaturesARM() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceSchedulingControlsFeaturesARM(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceSchedulingControlsFeaturesARM(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceSchedulingControlsFeaturesARM sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceSchedulingControlsFeaturesARM pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #schedulingControls()
    public VkPhysicalDeviceSchedulingControlsFeaturesARM schedulingControls(int schedulingControls) {
    	SCHEDULING_CONTROLS_HANDLE.set(segment, 0L, schedulingControls);
    	return this;
    }
    
    public int schedulingControls() {
    	return (int) SCHEDULING_CONTROLS_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceSchedulingControlsFeaturesARM set(VkPhysicalDeviceSchedulingControlsFeaturesARM other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceSchedulingControlsFeaturesARM set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceSchedulingControlsFeaturesARM> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceSchedulingControlsFeaturesARM> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceSchedulingControlsFeaturesARM(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceSchedulingControlsFeaturesARM> array(SegmentAllocator allocator, VkPhysicalDeviceSchedulingControlsFeaturesARM... structs) {
        NativeStructArray<VkPhysicalDeviceSchedulingControlsFeaturesARM> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceSchedulingControlsFeaturesARM(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceSchedulingControlsFeaturesARM> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceSchedulingControlsFeaturesARM(segment)
        );
    }

}