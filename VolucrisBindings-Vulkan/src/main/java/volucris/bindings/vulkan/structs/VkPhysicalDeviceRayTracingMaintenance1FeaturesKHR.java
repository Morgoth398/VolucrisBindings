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

public final class VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR
		implements Struct<VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle RAY_TRACING_MAINTENANCE1_HANDLE;
	public static final VarHandle RAY_TRACING_PIPELINE_TRACE_RAYS_INDIRECT2_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long RAY_TRACING_MAINTENANCE1_BYTE_OFFSET;
	public static final long RAY_TRACING_PIPELINE_TRACE_RAYS_INDIRECT2_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("rayTracingMaintenance1"),
		    JAVA_INT.withName("rayTracingPipelineTraceRaysIndirect2")
		).withName("VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		RAY_TRACING_MAINTENANCE1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("rayTracingMaintenance1"));
		RAY_TRACING_PIPELINE_TRACE_RAYS_INDIRECT2_HANDLE = LAYOUT.varHandle(PathElement.groupElement("rayTracingPipelineTraceRaysIndirect2"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		RAY_TRACING_MAINTENANCE1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("rayTracingMaintenance1"));
		RAY_TRACING_PIPELINE_TRACE_RAYS_INDIRECT2_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("rayTracingPipelineTraceRaysIndirect2"));
		//@formatter:on
	}

	public VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #rayTracingMaintenance1()
    public VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR rayTracingMaintenance1(int rayTracingMaintenance1) {
    	RAY_TRACING_MAINTENANCE1_HANDLE.set(segment, 0L, rayTracingMaintenance1);
    	return this;
    }
    
    public int rayTracingMaintenance1() {
    	return (int) RAY_TRACING_MAINTENANCE1_HANDLE.get(segment, 0L);
    }
    
    /// @see #rayTracingPipelineTraceRaysIndirect2()
    public VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR rayTracingPipelineTraceRaysIndirect2(int rayTracingPipelineTraceRaysIndirect2) {
    	RAY_TRACING_PIPELINE_TRACE_RAYS_INDIRECT2_HANDLE.set(segment, 0L, rayTracingPipelineTraceRaysIndirect2);
    	return this;
    }
    
    public int rayTracingPipelineTraceRaysIndirect2() {
    	return (int) RAY_TRACING_PIPELINE_TRACE_RAYS_INDIRECT2_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR set(VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR> array(SegmentAllocator allocator, VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR... structs) {
        NativeStructArray<VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR(segment)
        );
    }

}