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

public final class VkPhysicalDevicePerformanceQueryFeaturesKHR
		implements Struct<VkPhysicalDevicePerformanceQueryFeaturesKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle PERFORMANCE_COUNTER_QUERY_POOLS_HANDLE;
	public static final VarHandle PERFORMANCE_COUNTER_MULTIPLE_QUERY_POOLS_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long PERFORMANCE_COUNTER_QUERY_POOLS_BYTE_OFFSET;
	public static final long PERFORMANCE_COUNTER_MULTIPLE_QUERY_POOLS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("performanceCounterQueryPools"),
		    JAVA_INT.withName("performanceCounterMultipleQueryPools")
		).withName("VkPhysicalDevicePerformanceQueryFeaturesKHR").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		PERFORMANCE_COUNTER_QUERY_POOLS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("performanceCounterQueryPools"));
		PERFORMANCE_COUNTER_MULTIPLE_QUERY_POOLS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("performanceCounterMultipleQueryPools"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		PERFORMANCE_COUNTER_QUERY_POOLS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("performanceCounterQueryPools"));
		PERFORMANCE_COUNTER_MULTIPLE_QUERY_POOLS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("performanceCounterMultipleQueryPools"));
		//@formatter:on
	}

	public VkPhysicalDevicePerformanceQueryFeaturesKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDevicePerformanceQueryFeaturesKHR(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPhysicalDevicePerformanceQueryFeaturesKHR(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDevicePerformanceQueryFeaturesKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDevicePerformanceQueryFeaturesKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #performanceCounterQueryPools()
    public VkPhysicalDevicePerformanceQueryFeaturesKHR performanceCounterQueryPools(int performanceCounterQueryPools) {
    	PERFORMANCE_COUNTER_QUERY_POOLS_HANDLE.set(segment, 0L, performanceCounterQueryPools);
    	return this;
    }
    
    public int performanceCounterQueryPools() {
    	return (int) PERFORMANCE_COUNTER_QUERY_POOLS_HANDLE.get(segment, 0L);
    }
    
    /// @see #performanceCounterMultipleQueryPools()
    public VkPhysicalDevicePerformanceQueryFeaturesKHR performanceCounterMultipleQueryPools(int performanceCounterMultipleQueryPools) {
    	PERFORMANCE_COUNTER_MULTIPLE_QUERY_POOLS_HANDLE.set(segment, 0L, performanceCounterMultipleQueryPools);
    	return this;
    }
    
    public int performanceCounterMultipleQueryPools() {
    	return (int) PERFORMANCE_COUNTER_MULTIPLE_QUERY_POOLS_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDevicePerformanceQueryFeaturesKHR set(VkPhysicalDevicePerformanceQueryFeaturesKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDevicePerformanceQueryFeaturesKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDevicePerformanceQueryFeaturesKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDevicePerformanceQueryFeaturesKHR> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDevicePerformanceQueryFeaturesKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDevicePerformanceQueryFeaturesKHR> array(SegmentAllocator allocator, VkPhysicalDevicePerformanceQueryFeaturesKHR... structs) {
        NativeStructArray<VkPhysicalDevicePerformanceQueryFeaturesKHR> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDevicePerformanceQueryFeaturesKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDevicePerformanceQueryFeaturesKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDevicePerformanceQueryFeaturesKHR(segment)
        );
    }

}