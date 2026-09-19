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

public final class VkRayTracingPipelineInterfaceCreateInfoKHR
		implements Struct<VkRayTracingPipelineInterfaceCreateInfoKHR> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle MAX_PIPELINE_RAY_PAYLOAD_SIZE_HANDLE;
    public static final VarHandle MAX_PIPELINE_RAY_HIT_ATTRIBUTE_SIZE_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long MAX_PIPELINE_RAY_PAYLOAD_SIZE_BYTE_OFFSET;
    public static final long MAX_PIPELINE_RAY_HIT_ATTRIBUTE_SIZE_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("maxPipelineRayPayloadSize"),
            JAVA_INT.withName("maxPipelineRayHitAttributeSize")
        ).withName("VkRayTracingPipelineInterfaceCreateInfoKHR").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        MAX_PIPELINE_RAY_PAYLOAD_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxPipelineRayPayloadSize"));
        MAX_PIPELINE_RAY_HIT_ATTRIBUTE_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxPipelineRayHitAttributeSize"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        MAX_PIPELINE_RAY_PAYLOAD_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxPipelineRayPayloadSize"));
        MAX_PIPELINE_RAY_HIT_ATTRIBUTE_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxPipelineRayHitAttributeSize"));
        //@formatter:on
    }

    public VkRayTracingPipelineInterfaceCreateInfoKHR() {
        this(Arena.ofAuto());
    }
    
    public VkRayTracingPipelineInterfaceCreateInfoKHR(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkRayTracingPipelineInterfaceCreateInfoKHR(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkRayTracingPipelineInterfaceCreateInfoKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkRayTracingPipelineInterfaceCreateInfoKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #maxPipelineRayPayloadSize()
    public VkRayTracingPipelineInterfaceCreateInfoKHR maxPipelineRayPayloadSize(int maxPipelineRayPayloadSize) {
    	MAX_PIPELINE_RAY_PAYLOAD_SIZE_HANDLE.set(segment, 0L, maxPipelineRayPayloadSize);
    	return this;
    }
    
    public int maxPipelineRayPayloadSize() {
    	return (int) MAX_PIPELINE_RAY_PAYLOAD_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxPipelineRayHitAttributeSize()
    public VkRayTracingPipelineInterfaceCreateInfoKHR maxPipelineRayHitAttributeSize(int maxPipelineRayHitAttributeSize) {
    	MAX_PIPELINE_RAY_HIT_ATTRIBUTE_SIZE_HANDLE.set(segment, 0L, maxPipelineRayHitAttributeSize);
    	return this;
    }
    
    public int maxPipelineRayHitAttributeSize() {
    	return (int) MAX_PIPELINE_RAY_HIT_ATTRIBUTE_SIZE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkRayTracingPipelineInterfaceCreateInfoKHR set(VkRayTracingPipelineInterfaceCreateInfoKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkRayTracingPipelineInterfaceCreateInfoKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkRayTracingPipelineInterfaceCreateInfoKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkRayTracingPipelineInterfaceCreateInfoKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkRayTracingPipelineInterfaceCreateInfoKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkRayTracingPipelineInterfaceCreateInfoKHR> array(Arena arena, VkRayTracingPipelineInterfaceCreateInfoKHR... structs) {
        NativeStructArray<VkRayTracingPipelineInterfaceCreateInfoKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkRayTracingPipelineInterfaceCreateInfoKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkRayTracingPipelineInterfaceCreateInfoKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkRayTracingPipelineInterfaceCreateInfoKHR(segment)
        );
    }
    
}