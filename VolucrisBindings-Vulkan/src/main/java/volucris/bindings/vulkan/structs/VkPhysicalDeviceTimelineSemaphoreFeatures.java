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

public final class VkPhysicalDeviceTimelineSemaphoreFeatures
		implements Struct<VkPhysicalDeviceTimelineSemaphoreFeatures> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle TIMELINE_SEMAPHORE_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long TIMELINE_SEMAPHORE_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("timelineSemaphore"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPhysicalDeviceTimelineSemaphoreFeatures").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		TIMELINE_SEMAPHORE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("timelineSemaphore"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		TIMELINE_SEMAPHORE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("timelineSemaphore"));
		//@formatter:on
	}

	public VkPhysicalDeviceTimelineSemaphoreFeatures() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceTimelineSemaphoreFeatures(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceTimelineSemaphoreFeatures(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceTimelineSemaphoreFeatures sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceTimelineSemaphoreFeatures pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #timelineSemaphore()
    public VkPhysicalDeviceTimelineSemaphoreFeatures timelineSemaphore(int timelineSemaphore) {
    	TIMELINE_SEMAPHORE_HANDLE.set(segment, 0L, timelineSemaphore);
    	return this;
    }
    
    public int timelineSemaphore() {
    	return (int) TIMELINE_SEMAPHORE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceTimelineSemaphoreFeatures set(VkPhysicalDeviceTimelineSemaphoreFeatures other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceTimelineSemaphoreFeatures set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceTimelineSemaphoreFeatures> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceTimelineSemaphoreFeatures> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceTimelineSemaphoreFeatures(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceTimelineSemaphoreFeatures> array(SegmentAllocator allocator, VkPhysicalDeviceTimelineSemaphoreFeatures... structs) {
        NativeStructArray<VkPhysicalDeviceTimelineSemaphoreFeatures> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceTimelineSemaphoreFeatures(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceTimelineSemaphoreFeatures> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceTimelineSemaphoreFeatures(segment)
        );
    }

}