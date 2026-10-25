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

public final class VkPhysicalDeviceMaintenance3Properties
		implements Struct<VkPhysicalDeviceMaintenance3Properties> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle MAX_PER_SET_DESCRIPTORS_HANDLE;
	public static final VarHandle MAX_MEMORY_ALLOCATION_SIZE_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long MAX_PER_SET_DESCRIPTORS_BYTE_OFFSET;
	public static final long MAX_MEMORY_ALLOCATION_SIZE_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("maxPerSetDescriptors"),
		    MemoryLayout.paddingLayout(4),
		    JAVA_LONG.withName("maxMemoryAllocationSize")
		).withName("VkPhysicalDeviceMaintenance3Properties").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		MAX_PER_SET_DESCRIPTORS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxPerSetDescriptors"));
		MAX_MEMORY_ALLOCATION_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxMemoryAllocationSize"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		MAX_PER_SET_DESCRIPTORS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxPerSetDescriptors"));
		MAX_MEMORY_ALLOCATION_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxMemoryAllocationSize"));
		//@formatter:on
	}

	public VkPhysicalDeviceMaintenance3Properties() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceMaintenance3Properties(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceMaintenance3Properties(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceMaintenance3Properties sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceMaintenance3Properties pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #maxPerSetDescriptors()
    public VkPhysicalDeviceMaintenance3Properties maxPerSetDescriptors(int maxPerSetDescriptors) {
    	MAX_PER_SET_DESCRIPTORS_HANDLE.set(segment, 0L, maxPerSetDescriptors);
    	return this;
    }
    
    public int maxPerSetDescriptors() {
    	return (int) MAX_PER_SET_DESCRIPTORS_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxMemoryAllocationSize()
    public VkPhysicalDeviceMaintenance3Properties maxMemoryAllocationSize(long maxMemoryAllocationSize) {
    	MAX_MEMORY_ALLOCATION_SIZE_HANDLE.set(segment, 0L, maxMemoryAllocationSize);
    	return this;
    }
    
    public long maxMemoryAllocationSize() {
    	return (long) MAX_MEMORY_ALLOCATION_SIZE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceMaintenance3Properties set(VkPhysicalDeviceMaintenance3Properties other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceMaintenance3Properties set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceMaintenance3Properties> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceMaintenance3Properties> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceMaintenance3Properties(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceMaintenance3Properties> array(SegmentAllocator allocator, VkPhysicalDeviceMaintenance3Properties... structs) {
        NativeStructArray<VkPhysicalDeviceMaintenance3Properties> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceMaintenance3Properties(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceMaintenance3Properties> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceMaintenance3Properties(segment)
        );
    }

}