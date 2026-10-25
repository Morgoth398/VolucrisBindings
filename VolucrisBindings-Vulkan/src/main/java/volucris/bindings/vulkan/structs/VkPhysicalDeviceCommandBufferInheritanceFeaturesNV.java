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

public final class VkPhysicalDeviceCommandBufferInheritanceFeaturesNV
		implements Struct<VkPhysicalDeviceCommandBufferInheritanceFeaturesNV> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle COMMAND_BUFFER_INHERITANCE_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long COMMAND_BUFFER_INHERITANCE_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("commandBufferInheritance"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPhysicalDeviceCommandBufferInheritanceFeaturesNV").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		COMMAND_BUFFER_INHERITANCE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("commandBufferInheritance"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		COMMAND_BUFFER_INHERITANCE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("commandBufferInheritance"));
		//@formatter:on
	}

	public VkPhysicalDeviceCommandBufferInheritanceFeaturesNV() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceCommandBufferInheritanceFeaturesNV(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceCommandBufferInheritanceFeaturesNV(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceCommandBufferInheritanceFeaturesNV sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceCommandBufferInheritanceFeaturesNV pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #commandBufferInheritance()
    public VkPhysicalDeviceCommandBufferInheritanceFeaturesNV commandBufferInheritance(int commandBufferInheritance) {
    	COMMAND_BUFFER_INHERITANCE_HANDLE.set(segment, 0L, commandBufferInheritance);
    	return this;
    }
    
    public int commandBufferInheritance() {
    	return (int) COMMAND_BUFFER_INHERITANCE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceCommandBufferInheritanceFeaturesNV set(VkPhysicalDeviceCommandBufferInheritanceFeaturesNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceCommandBufferInheritanceFeaturesNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceCommandBufferInheritanceFeaturesNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceCommandBufferInheritanceFeaturesNV> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceCommandBufferInheritanceFeaturesNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceCommandBufferInheritanceFeaturesNV> array(SegmentAllocator allocator, VkPhysicalDeviceCommandBufferInheritanceFeaturesNV... structs) {
        NativeStructArray<VkPhysicalDeviceCommandBufferInheritanceFeaturesNV> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceCommandBufferInheritanceFeaturesNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceCommandBufferInheritanceFeaturesNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceCommandBufferInheritanceFeaturesNV(segment)
        );
    }

}