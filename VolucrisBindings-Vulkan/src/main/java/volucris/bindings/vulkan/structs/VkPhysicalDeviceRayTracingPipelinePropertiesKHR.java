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

public final class VkPhysicalDeviceRayTracingPipelinePropertiesKHR
		implements Struct<VkPhysicalDeviceRayTracingPipelinePropertiesKHR> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle SHADER_GROUP_HANDLE_SIZE_HANDLE;
    public static final VarHandle MAX_RAY_RECURSION_DEPTH_HANDLE;
    public static final VarHandle MAX_SHADER_GROUP_STRIDE_HANDLE;
    public static final VarHandle SHADER_GROUP_BASE_ALIGNMENT_HANDLE;
    public static final VarHandle SHADER_GROUP_HANDLE_CAPTURE_REPLAY_SIZE_HANDLE;
    public static final VarHandle MAX_RAY_DISPATCH_INVOCATION_COUNT_HANDLE;
    public static final VarHandle SHADER_GROUP_HANDLE_ALIGNMENT_HANDLE;
    public static final VarHandle MAX_RAY_HIT_ATTRIBUTE_SIZE_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long SHADER_GROUP_HANDLE_SIZE_BYTE_OFFSET;
    public static final long MAX_RAY_RECURSION_DEPTH_BYTE_OFFSET;
    public static final long MAX_SHADER_GROUP_STRIDE_BYTE_OFFSET;
    public static final long SHADER_GROUP_BASE_ALIGNMENT_BYTE_OFFSET;
    public static final long SHADER_GROUP_HANDLE_CAPTURE_REPLAY_SIZE_BYTE_OFFSET;
    public static final long MAX_RAY_DISPATCH_INVOCATION_COUNT_BYTE_OFFSET;
    public static final long SHADER_GROUP_HANDLE_ALIGNMENT_BYTE_OFFSET;
    public static final long MAX_RAY_HIT_ATTRIBUTE_SIZE_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("shaderGroupHandleSize"),
            JAVA_INT.withName("maxRayRecursionDepth"),
            JAVA_INT.withName("maxShaderGroupStride"),
            JAVA_INT.withName("shaderGroupBaseAlignment"),
            JAVA_INT.withName("shaderGroupHandleCaptureReplaySize"),
            JAVA_INT.withName("maxRayDispatchInvocationCount"),
            JAVA_INT.withName("shaderGroupHandleAlignment"),
            JAVA_INT.withName("maxRayHitAttributeSize")
        ).withName("VkPhysicalDeviceRayTracingPipelinePropertiesKHR").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        SHADER_GROUP_HANDLE_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderGroupHandleSize"));
        MAX_RAY_RECURSION_DEPTH_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxRayRecursionDepth"));
        MAX_SHADER_GROUP_STRIDE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxShaderGroupStride"));
        SHADER_GROUP_BASE_ALIGNMENT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderGroupBaseAlignment"));
        SHADER_GROUP_HANDLE_CAPTURE_REPLAY_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderGroupHandleCaptureReplaySize"));
        MAX_RAY_DISPATCH_INVOCATION_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxRayDispatchInvocationCount"));
        SHADER_GROUP_HANDLE_ALIGNMENT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shaderGroupHandleAlignment"));
        MAX_RAY_HIT_ATTRIBUTE_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxRayHitAttributeSize"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        SHADER_GROUP_HANDLE_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderGroupHandleSize"));
        MAX_RAY_RECURSION_DEPTH_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxRayRecursionDepth"));
        MAX_SHADER_GROUP_STRIDE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxShaderGroupStride"));
        SHADER_GROUP_BASE_ALIGNMENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderGroupBaseAlignment"));
        SHADER_GROUP_HANDLE_CAPTURE_REPLAY_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderGroupHandleCaptureReplaySize"));
        MAX_RAY_DISPATCH_INVOCATION_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxRayDispatchInvocationCount"));
        SHADER_GROUP_HANDLE_ALIGNMENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shaderGroupHandleAlignment"));
        MAX_RAY_HIT_ATTRIBUTE_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxRayHitAttributeSize"));
        //@formatter:on
    }

    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR() {
        this(Arena.ofAuto());
    }
    
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #shaderGroupHandleSize()
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR shaderGroupHandleSize(int shaderGroupHandleSize) {
    	SHADER_GROUP_HANDLE_SIZE_HANDLE.set(segment, 0L, shaderGroupHandleSize);
    	return this;
    }
    
    public int shaderGroupHandleSize() {
    	return (int) SHADER_GROUP_HANDLE_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxRayRecursionDepth()
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR maxRayRecursionDepth(int maxRayRecursionDepth) {
    	MAX_RAY_RECURSION_DEPTH_HANDLE.set(segment, 0L, maxRayRecursionDepth);
    	return this;
    }
    
    public int maxRayRecursionDepth() {
    	return (int) MAX_RAY_RECURSION_DEPTH_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxShaderGroupStride()
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR maxShaderGroupStride(int maxShaderGroupStride) {
    	MAX_SHADER_GROUP_STRIDE_HANDLE.set(segment, 0L, maxShaderGroupStride);
    	return this;
    }
    
    public int maxShaderGroupStride() {
    	return (int) MAX_SHADER_GROUP_STRIDE_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderGroupBaseAlignment()
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR shaderGroupBaseAlignment(int shaderGroupBaseAlignment) {
    	SHADER_GROUP_BASE_ALIGNMENT_HANDLE.set(segment, 0L, shaderGroupBaseAlignment);
    	return this;
    }
    
    public int shaderGroupBaseAlignment() {
    	return (int) SHADER_GROUP_BASE_ALIGNMENT_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderGroupHandleCaptureReplaySize()
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR shaderGroupHandleCaptureReplaySize(int shaderGroupHandleCaptureReplaySize) {
    	SHADER_GROUP_HANDLE_CAPTURE_REPLAY_SIZE_HANDLE.set(segment, 0L, shaderGroupHandleCaptureReplaySize);
    	return this;
    }
    
    public int shaderGroupHandleCaptureReplaySize() {
    	return (int) SHADER_GROUP_HANDLE_CAPTURE_REPLAY_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxRayDispatchInvocationCount()
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR maxRayDispatchInvocationCount(int maxRayDispatchInvocationCount) {
    	MAX_RAY_DISPATCH_INVOCATION_COUNT_HANDLE.set(segment, 0L, maxRayDispatchInvocationCount);
    	return this;
    }
    
    public int maxRayDispatchInvocationCount() {
    	return (int) MAX_RAY_DISPATCH_INVOCATION_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #shaderGroupHandleAlignment()
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR shaderGroupHandleAlignment(int shaderGroupHandleAlignment) {
    	SHADER_GROUP_HANDLE_ALIGNMENT_HANDLE.set(segment, 0L, shaderGroupHandleAlignment);
    	return this;
    }
    
    public int shaderGroupHandleAlignment() {
    	return (int) SHADER_GROUP_HANDLE_ALIGNMENT_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxRayHitAttributeSize()
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR maxRayHitAttributeSize(int maxRayHitAttributeSize) {
    	MAX_RAY_HIT_ATTRIBUTE_SIZE_HANDLE.set(segment, 0L, maxRayHitAttributeSize);
    	return this;
    }
    
    public int maxRayHitAttributeSize() {
    	return (int) MAX_RAY_HIT_ATTRIBUTE_SIZE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR set(VkPhysicalDeviceRayTracingPipelinePropertiesKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceRayTracingPipelinePropertiesKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceRayTracingPipelinePropertiesKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceRayTracingPipelinePropertiesKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceRayTracingPipelinePropertiesKHR> array(Arena arena, VkPhysicalDeviceRayTracingPipelinePropertiesKHR... structs) {
        NativeStructArray<VkPhysicalDeviceRayTracingPipelinePropertiesKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceRayTracingPipelinePropertiesKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceRayTracingPipelinePropertiesKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceRayTracingPipelinePropertiesKHR(segment)
        );
    }
    
}