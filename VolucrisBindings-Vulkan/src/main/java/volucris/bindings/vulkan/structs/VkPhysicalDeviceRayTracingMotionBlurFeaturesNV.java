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

public final class VkPhysicalDeviceRayTracingMotionBlurFeaturesNV
		implements Struct<VkPhysicalDeviceRayTracingMotionBlurFeaturesNV> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle RAY_TRACING_MOTION_BLUR_HANDLE;
	public static final VarHandle RAY_TRACING_MOTION_BLUR_PIPELINE_TRACE_RAYS_INDIRECT_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long RAY_TRACING_MOTION_BLUR_BYTE_OFFSET;
	public static final long RAY_TRACING_MOTION_BLUR_PIPELINE_TRACE_RAYS_INDIRECT_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("rayTracingMotionBlur"),
		    JAVA_INT.withName("rayTracingMotionBlurPipelineTraceRaysIndirect")
		).withName("VkPhysicalDeviceRayTracingMotionBlurFeaturesNV").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		RAY_TRACING_MOTION_BLUR_HANDLE = LAYOUT.varHandle(PathElement.groupElement("rayTracingMotionBlur"));
		RAY_TRACING_MOTION_BLUR_PIPELINE_TRACE_RAYS_INDIRECT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("rayTracingMotionBlurPipelineTraceRaysIndirect"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		RAY_TRACING_MOTION_BLUR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("rayTracingMotionBlur"));
		RAY_TRACING_MOTION_BLUR_PIPELINE_TRACE_RAYS_INDIRECT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("rayTracingMotionBlurPipelineTraceRaysIndirect"));
		//@formatter:on
	}

	public VkPhysicalDeviceRayTracingMotionBlurFeaturesNV() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceRayTracingMotionBlurFeaturesNV(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceRayTracingMotionBlurFeaturesNV(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceRayTracingMotionBlurFeaturesNV sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceRayTracingMotionBlurFeaturesNV pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #rayTracingMotionBlur()
    public VkPhysicalDeviceRayTracingMotionBlurFeaturesNV rayTracingMotionBlur(int rayTracingMotionBlur) {
    	RAY_TRACING_MOTION_BLUR_HANDLE.set(segment, 0L, rayTracingMotionBlur);
    	return this;
    }
    
    public int rayTracingMotionBlur() {
    	return (int) RAY_TRACING_MOTION_BLUR_HANDLE.get(segment, 0L);
    }
    
    /// @see #rayTracingMotionBlurPipelineTraceRaysIndirect()
    public VkPhysicalDeviceRayTracingMotionBlurFeaturesNV rayTracingMotionBlurPipelineTraceRaysIndirect(int rayTracingMotionBlurPipelineTraceRaysIndirect) {
    	RAY_TRACING_MOTION_BLUR_PIPELINE_TRACE_RAYS_INDIRECT_HANDLE.set(segment, 0L, rayTracingMotionBlurPipelineTraceRaysIndirect);
    	return this;
    }
    
    public int rayTracingMotionBlurPipelineTraceRaysIndirect() {
    	return (int) RAY_TRACING_MOTION_BLUR_PIPELINE_TRACE_RAYS_INDIRECT_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceRayTracingMotionBlurFeaturesNV set(VkPhysicalDeviceRayTracingMotionBlurFeaturesNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceRayTracingMotionBlurFeaturesNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceRayTracingMotionBlurFeaturesNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceRayTracingMotionBlurFeaturesNV> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceRayTracingMotionBlurFeaturesNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceRayTracingMotionBlurFeaturesNV> array(SegmentAllocator allocator, VkPhysicalDeviceRayTracingMotionBlurFeaturesNV... structs) {
        NativeStructArray<VkPhysicalDeviceRayTracingMotionBlurFeaturesNV> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceRayTracingMotionBlurFeaturesNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceRayTracingMotionBlurFeaturesNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceRayTracingMotionBlurFeaturesNV(segment)
        );
    }

}