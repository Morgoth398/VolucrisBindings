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
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkPhysicalDeviceFragmentShadingRateKHR
		implements Struct<VkPhysicalDeviceFragmentShadingRateKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle SAMPLE_COUNTS_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long SAMPLE_COUNTS_BYTE_OFFSET;
	public static final long FRAGMENT_SIZE_BYTE_OFFSET;

	private final MemorySegment segment;

	private final VkExtent2D fragmentSize;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("sampleCounts"),
		    VkExtent2D.LAYOUT.withName("fragmentSize"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPhysicalDeviceFragmentShadingRateKHR").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		SAMPLE_COUNTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sampleCounts"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		SAMPLE_COUNTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sampleCounts"));
		FRAGMENT_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("fragmentSize"));
		//@formatter:on
	}

	public VkPhysicalDeviceFragmentShadingRateKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceFragmentShadingRateKHR(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceFragmentShadingRateKHR(MemorySegment segment) {
	    this.segment = segment;
	
	    fragmentSize = new VkExtent2D(segment.asSlice(FRAGMENT_SIZE_BYTE_OFFSET, VkExtent2D.LAYOUT));
	}

    /// @see #sType()
    public VkPhysicalDeviceFragmentShadingRateKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceFragmentShadingRateKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #sampleCounts()
    public VkPhysicalDeviceFragmentShadingRateKHR sampleCounts(int sampleCounts) {
    	SAMPLE_COUNTS_HANDLE.set(segment, 0L, sampleCounts);
    	return this;
    }
    
    public int sampleCounts() {
    	return (int) SAMPLE_COUNTS_HANDLE.get(segment, 0L);
    }
    
    /// @see #fragmentSize()
    public VkPhysicalDeviceFragmentShadingRateKHR fragmentSize(Consumer<VkExtent2D> consumer) {
    	consumer.accept(fragmentSize);
    	return this;
    }
    
    /// @see #fragmentSize()
    public VkPhysicalDeviceFragmentShadingRateKHR fragmentSize(VkExtent2D other) {
    	fragmentSize.set(other);
    	return this;
    }
    
    public VkExtent2D fragmentSize() {
    	return fragmentSize;
    }
    
    @Override
    public VkPhysicalDeviceFragmentShadingRateKHR set(VkPhysicalDeviceFragmentShadingRateKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceFragmentShadingRateKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceFragmentShadingRateKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceFragmentShadingRateKHR> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceFragmentShadingRateKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceFragmentShadingRateKHR> array(SegmentAllocator allocator, VkPhysicalDeviceFragmentShadingRateKHR... structs) {
        NativeStructArray<VkPhysicalDeviceFragmentShadingRateKHR> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceFragmentShadingRateKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceFragmentShadingRateKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceFragmentShadingRateKHR(segment)
        );
    }

}