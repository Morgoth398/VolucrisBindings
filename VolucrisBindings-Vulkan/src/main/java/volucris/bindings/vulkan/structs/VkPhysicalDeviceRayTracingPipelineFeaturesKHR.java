/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
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

public final class VkPhysicalDeviceRayTracingPipelineFeaturesKHR
		implements Struct<VkPhysicalDeviceRayTracingPipelineFeaturesKHR> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle RAY_TRACING_PIPELINE_HANDLE;
    public static final VarHandle RAY_TRACING_PIPELINE_SHADER_GROUP_HANDLE_CAPTURE_REPLAY_HANDLE;
    public static final VarHandle RAY_TRACING_PIPELINE_SHADER_GROUP_HANDLE_CAPTURE_REPLAY_MIXED_HANDLE;
    public static final VarHandle RAY_TRACING_PIPELINE_TRACE_RAYS_INDIRECT_HANDLE;
    public static final VarHandle RAY_TRAVERSAL_PRIMITIVE_CULLING_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long RAY_TRACING_PIPELINE_BYTE_OFFSET;
    public static final long RAY_TRACING_PIPELINE_SHADER_GROUP_HANDLE_CAPTURE_REPLAY_BYTE_OFFSET;
    public static final long RAY_TRACING_PIPELINE_SHADER_GROUP_HANDLE_CAPTURE_REPLAY_MIXED_BYTE_OFFSET;
    public static final long RAY_TRACING_PIPELINE_TRACE_RAYS_INDIRECT_BYTE_OFFSET;
    public static final long RAY_TRAVERSAL_PRIMITIVE_CULLING_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("rayTracingPipeline"),
            JAVA_INT.withName("rayTracingPipelineShaderGroupHandleCaptureReplay"),
            JAVA_INT.withName("rayTracingPipelineShaderGroupHandleCaptureReplayMixed"),
            JAVA_INT.withName("rayTracingPipelineTraceRaysIndirect"),
            JAVA_INT.withName("rayTraversalPrimitiveCulling"),
            MemoryLayout.paddingLayout(4)
        ).withName("VkPhysicalDeviceRayTracingPipelineFeaturesKHR").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        RAY_TRACING_PIPELINE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("rayTracingPipeline"));
        RAY_TRACING_PIPELINE_SHADER_GROUP_HANDLE_CAPTURE_REPLAY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("rayTracingPipelineShaderGroupHandleCaptureReplay"));
        RAY_TRACING_PIPELINE_SHADER_GROUP_HANDLE_CAPTURE_REPLAY_MIXED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("rayTracingPipelineShaderGroupHandleCaptureReplayMixed"));
        RAY_TRACING_PIPELINE_TRACE_RAYS_INDIRECT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("rayTracingPipelineTraceRaysIndirect"));
        RAY_TRAVERSAL_PRIMITIVE_CULLING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("rayTraversalPrimitiveCulling"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        RAY_TRACING_PIPELINE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("rayTracingPipeline"));
        RAY_TRACING_PIPELINE_SHADER_GROUP_HANDLE_CAPTURE_REPLAY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("rayTracingPipelineShaderGroupHandleCaptureReplay"));
        RAY_TRACING_PIPELINE_SHADER_GROUP_HANDLE_CAPTURE_REPLAY_MIXED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("rayTracingPipelineShaderGroupHandleCaptureReplayMixed"));
        RAY_TRACING_PIPELINE_TRACE_RAYS_INDIRECT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("rayTracingPipelineTraceRaysIndirect"));
        RAY_TRAVERSAL_PRIMITIVE_CULLING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("rayTraversalPrimitiveCulling"));
        //@formatter:on
    }

    public VkPhysicalDeviceRayTracingPipelineFeaturesKHR() {
        this(Arena.ofAuto());
    }
    
    public VkPhysicalDeviceRayTracingPipelineFeaturesKHR(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkPhysicalDeviceRayTracingPipelineFeaturesKHR(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkPhysicalDeviceRayTracingPipelineFeaturesKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceRayTracingPipelineFeaturesKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #rayTracingPipeline()
    public VkPhysicalDeviceRayTracingPipelineFeaturesKHR rayTracingPipeline(int rayTracingPipeline) {
    	RAY_TRACING_PIPELINE_HANDLE.set(segment, 0L, rayTracingPipeline);
    	return this;
    }
    
    public int rayTracingPipeline() {
    	return (int) RAY_TRACING_PIPELINE_HANDLE.get(segment, 0L);
    }
    
    /// @see #rayTracingPipelineShaderGroupHandleCaptureReplay()
    public VkPhysicalDeviceRayTracingPipelineFeaturesKHR rayTracingPipelineShaderGroupHandleCaptureReplay(int rayTracingPipelineShaderGroupHandleCaptureReplay) {
    	RAY_TRACING_PIPELINE_SHADER_GROUP_HANDLE_CAPTURE_REPLAY_HANDLE.set(segment, 0L, rayTracingPipelineShaderGroupHandleCaptureReplay);
    	return this;
    }
    
    public int rayTracingPipelineShaderGroupHandleCaptureReplay() {
    	return (int) RAY_TRACING_PIPELINE_SHADER_GROUP_HANDLE_CAPTURE_REPLAY_HANDLE.get(segment, 0L);
    }
    
    /// @see #rayTracingPipelineShaderGroupHandleCaptureReplayMixed()
    public VkPhysicalDeviceRayTracingPipelineFeaturesKHR rayTracingPipelineShaderGroupHandleCaptureReplayMixed(int rayTracingPipelineShaderGroupHandleCaptureReplayMixed) {
    	RAY_TRACING_PIPELINE_SHADER_GROUP_HANDLE_CAPTURE_REPLAY_MIXED_HANDLE.set(segment, 0L, rayTracingPipelineShaderGroupHandleCaptureReplayMixed);
    	return this;
    }
    
    public int rayTracingPipelineShaderGroupHandleCaptureReplayMixed() {
    	return (int) RAY_TRACING_PIPELINE_SHADER_GROUP_HANDLE_CAPTURE_REPLAY_MIXED_HANDLE.get(segment, 0L);
    }
    
    /// @see #rayTracingPipelineTraceRaysIndirect()
    public VkPhysicalDeviceRayTracingPipelineFeaturesKHR rayTracingPipelineTraceRaysIndirect(int rayTracingPipelineTraceRaysIndirect) {
    	RAY_TRACING_PIPELINE_TRACE_RAYS_INDIRECT_HANDLE.set(segment, 0L, rayTracingPipelineTraceRaysIndirect);
    	return this;
    }
    
    public int rayTracingPipelineTraceRaysIndirect() {
    	return (int) RAY_TRACING_PIPELINE_TRACE_RAYS_INDIRECT_HANDLE.get(segment, 0L);
    }
    
    /// @see #rayTraversalPrimitiveCulling()
    public VkPhysicalDeviceRayTracingPipelineFeaturesKHR rayTraversalPrimitiveCulling(int rayTraversalPrimitiveCulling) {
    	RAY_TRAVERSAL_PRIMITIVE_CULLING_HANDLE.set(segment, 0L, rayTraversalPrimitiveCulling);
    	return this;
    }
    
    public int rayTraversalPrimitiveCulling() {
    	return (int) RAY_TRAVERSAL_PRIMITIVE_CULLING_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceRayTracingPipelineFeaturesKHR set(VkPhysicalDeviceRayTracingPipelineFeaturesKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceRayTracingPipelineFeaturesKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceRayTracingPipelineFeaturesKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceRayTracingPipelineFeaturesKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceRayTracingPipelineFeaturesKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceRayTracingPipelineFeaturesKHR> array(Arena arena, VkPhysicalDeviceRayTracingPipelineFeaturesKHR... structs) {
        NativeStructArray<VkPhysicalDeviceRayTracingPipelineFeaturesKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceRayTracingPipelineFeaturesKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceRayTracingPipelineFeaturesKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceRayTracingPipelineFeaturesKHR(segment)
        );
    }
    
}