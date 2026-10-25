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

public final class VkCopyDeviceMemoryInfoKHR
		implements Struct<VkCopyDeviceMemoryInfoKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle REGION_COUNT_HANDLE;
	public static final VarHandle P_REGIONS_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long REGION_COUNT_BYTE_OFFSET;
	public static final long P_REGIONS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("regionCount"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pRegions")
		).withName("VkCopyDeviceMemoryInfoKHR").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		REGION_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("regionCount"));
		P_REGIONS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pRegions"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		REGION_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("regionCount"));
		P_REGIONS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pRegions"));
		//@formatter:on
	}

	public VkCopyDeviceMemoryInfoKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkCopyDeviceMemoryInfoKHR(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkCopyDeviceMemoryInfoKHR(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkCopyDeviceMemoryInfoKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkCopyDeviceMemoryInfoKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #regionCount()
    public VkCopyDeviceMemoryInfoKHR regionCount(int regionCount) {
    	REGION_COUNT_HANDLE.set(segment, 0L, regionCount);
    	return this;
    }
    
    public int regionCount() {
    	return (int) REGION_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pRegions()
    public VkCopyDeviceMemoryInfoKHR pRegions(NativeStructArray<VkDeviceMemoryCopyKHR> pRegions) {
    	P_REGIONS_HANDLE.set(segment, 0L, pRegions.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkDeviceMemoryCopyKHR> pRegions() {
    	MemorySegment segment = (MemorySegment) P_REGIONS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkDeviceMemoryCopyKHR.array(segment);
    }
    
    @Override
    public VkCopyDeviceMemoryInfoKHR set(VkCopyDeviceMemoryInfoKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkCopyDeviceMemoryInfoKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkCopyDeviceMemoryInfoKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkCopyDeviceMemoryInfoKHR> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkCopyDeviceMemoryInfoKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkCopyDeviceMemoryInfoKHR> array(SegmentAllocator allocator, VkCopyDeviceMemoryInfoKHR... structs) {
        NativeStructArray<VkCopyDeviceMemoryInfoKHR> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkCopyDeviceMemoryInfoKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkCopyDeviceMemoryInfoKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkCopyDeviceMemoryInfoKHR(segment)
        );
    }

}