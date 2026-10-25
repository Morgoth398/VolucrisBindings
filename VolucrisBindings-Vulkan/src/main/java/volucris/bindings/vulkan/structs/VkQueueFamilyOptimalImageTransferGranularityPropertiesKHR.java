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

public final class VkQueueFamilyOptimalImageTransferGranularityPropertiesKHR
		implements Struct<VkQueueFamilyOptimalImageTransferGranularityPropertiesKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long OPTIMAL_IMAGE_TRANSFER_GRANULARITY_BYTE_OFFSET;

	private final MemorySegment segment;

	private final VkExtent3D optimalImageTransferGranularity;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    VkExtent3D.LAYOUT.withName("optimalImageTransferGranularity"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkQueueFamilyOptimalImageTransferGranularityPropertiesKHR").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		OPTIMAL_IMAGE_TRANSFER_GRANULARITY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("optimalImageTransferGranularity"));
		//@formatter:on
	}

	public VkQueueFamilyOptimalImageTransferGranularityPropertiesKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkQueueFamilyOptimalImageTransferGranularityPropertiesKHR(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkQueueFamilyOptimalImageTransferGranularityPropertiesKHR(MemorySegment segment) {
	    this.segment = segment;
	
	    optimalImageTransferGranularity = new VkExtent3D(segment.asSlice(OPTIMAL_IMAGE_TRANSFER_GRANULARITY_BYTE_OFFSET, VkExtent3D.LAYOUT));
	}

    /// @see #sType()
    public VkQueueFamilyOptimalImageTransferGranularityPropertiesKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkQueueFamilyOptimalImageTransferGranularityPropertiesKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #optimalImageTransferGranularity()
    public VkQueueFamilyOptimalImageTransferGranularityPropertiesKHR optimalImageTransferGranularity(Consumer<VkExtent3D> consumer) {
    	consumer.accept(optimalImageTransferGranularity);
    	return this;
    }
    
    /// @see #optimalImageTransferGranularity()
    public VkQueueFamilyOptimalImageTransferGranularityPropertiesKHR optimalImageTransferGranularity(VkExtent3D other) {
    	optimalImageTransferGranularity.set(other);
    	return this;
    }
    
    public VkExtent3D optimalImageTransferGranularity() {
    	return optimalImageTransferGranularity;
    }
    
    @Override
    public VkQueueFamilyOptimalImageTransferGranularityPropertiesKHR set(VkQueueFamilyOptimalImageTransferGranularityPropertiesKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkQueueFamilyOptimalImageTransferGranularityPropertiesKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkQueueFamilyOptimalImageTransferGranularityPropertiesKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkQueueFamilyOptimalImageTransferGranularityPropertiesKHR> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkQueueFamilyOptimalImageTransferGranularityPropertiesKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkQueueFamilyOptimalImageTransferGranularityPropertiesKHR> array(SegmentAllocator allocator, VkQueueFamilyOptimalImageTransferGranularityPropertiesKHR... structs) {
        NativeStructArray<VkQueueFamilyOptimalImageTransferGranularityPropertiesKHR> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkQueueFamilyOptimalImageTransferGranularityPropertiesKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkQueueFamilyOptimalImageTransferGranularityPropertiesKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkQueueFamilyOptimalImageTransferGranularityPropertiesKHR(segment)
        );
    }

}