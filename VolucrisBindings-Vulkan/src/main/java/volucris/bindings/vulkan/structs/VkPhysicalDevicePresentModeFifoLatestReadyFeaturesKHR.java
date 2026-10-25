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

public final class VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR
		implements Struct<VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle PRESENT_MODE_FIFO_LATEST_READY_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long PRESENT_MODE_FIFO_LATEST_READY_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("presentModeFifoLatestReady"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		PRESENT_MODE_FIFO_LATEST_READY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("presentModeFifoLatestReady"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		PRESENT_MODE_FIFO_LATEST_READY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("presentModeFifoLatestReady"));
		//@formatter:on
	}

	public VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #presentModeFifoLatestReady()
    public VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR presentModeFifoLatestReady(int presentModeFifoLatestReady) {
    	PRESENT_MODE_FIFO_LATEST_READY_HANDLE.set(segment, 0L, presentModeFifoLatestReady);
    	return this;
    }
    
    public int presentModeFifoLatestReady() {
    	return (int) PRESENT_MODE_FIFO_LATEST_READY_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR set(VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR> array(SegmentAllocator allocator, VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR... structs) {
        NativeStructArray<VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDevicePresentModeFifoLatestReadyFeaturesKHR(segment)
        );
    }

}