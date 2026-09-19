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

public final class VkPhysicalDeviceFragmentShadingRateFeaturesKHR
		implements Struct<VkPhysicalDeviceFragmentShadingRateFeaturesKHR> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle PIPELINE_FRAGMENT_SHADING_RATE_HANDLE;
    public static final VarHandle PRIMITIVE_FRAGMENT_SHADING_RATE_HANDLE;
    public static final VarHandle ATTACHMENT_FRAGMENT_SHADING_RATE_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long PIPELINE_FRAGMENT_SHADING_RATE_BYTE_OFFSET;
    public static final long PRIMITIVE_FRAGMENT_SHADING_RATE_BYTE_OFFSET;
    public static final long ATTACHMENT_FRAGMENT_SHADING_RATE_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("pipelineFragmentShadingRate"),
            JAVA_INT.withName("primitiveFragmentShadingRate"),
            JAVA_INT.withName("attachmentFragmentShadingRate"),
            MemoryLayout.paddingLayout(4)
        ).withName("VkPhysicalDeviceFragmentShadingRateFeaturesKHR").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        PIPELINE_FRAGMENT_SHADING_RATE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pipelineFragmentShadingRate"));
        PRIMITIVE_FRAGMENT_SHADING_RATE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("primitiveFragmentShadingRate"));
        ATTACHMENT_FRAGMENT_SHADING_RATE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("attachmentFragmentShadingRate"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        PIPELINE_FRAGMENT_SHADING_RATE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pipelineFragmentShadingRate"));
        PRIMITIVE_FRAGMENT_SHADING_RATE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("primitiveFragmentShadingRate"));
        ATTACHMENT_FRAGMENT_SHADING_RATE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("attachmentFragmentShadingRate"));
        //@formatter:on
    }

    public VkPhysicalDeviceFragmentShadingRateFeaturesKHR() {
        this(Arena.ofAuto());
    }
    
    public VkPhysicalDeviceFragmentShadingRateFeaturesKHR(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkPhysicalDeviceFragmentShadingRateFeaturesKHR(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkPhysicalDeviceFragmentShadingRateFeaturesKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceFragmentShadingRateFeaturesKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #pipelineFragmentShadingRate()
    public VkPhysicalDeviceFragmentShadingRateFeaturesKHR pipelineFragmentShadingRate(int pipelineFragmentShadingRate) {
    	PIPELINE_FRAGMENT_SHADING_RATE_HANDLE.set(segment, 0L, pipelineFragmentShadingRate);
    	return this;
    }
    
    public int pipelineFragmentShadingRate() {
    	return (int) PIPELINE_FRAGMENT_SHADING_RATE_HANDLE.get(segment, 0L);
    }
    
    /// @see #primitiveFragmentShadingRate()
    public VkPhysicalDeviceFragmentShadingRateFeaturesKHR primitiveFragmentShadingRate(int primitiveFragmentShadingRate) {
    	PRIMITIVE_FRAGMENT_SHADING_RATE_HANDLE.set(segment, 0L, primitiveFragmentShadingRate);
    	return this;
    }
    
    public int primitiveFragmentShadingRate() {
    	return (int) PRIMITIVE_FRAGMENT_SHADING_RATE_HANDLE.get(segment, 0L);
    }
    
    /// @see #attachmentFragmentShadingRate()
    public VkPhysicalDeviceFragmentShadingRateFeaturesKHR attachmentFragmentShadingRate(int attachmentFragmentShadingRate) {
    	ATTACHMENT_FRAGMENT_SHADING_RATE_HANDLE.set(segment, 0L, attachmentFragmentShadingRate);
    	return this;
    }
    
    public int attachmentFragmentShadingRate() {
    	return (int) ATTACHMENT_FRAGMENT_SHADING_RATE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceFragmentShadingRateFeaturesKHR set(VkPhysicalDeviceFragmentShadingRateFeaturesKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceFragmentShadingRateFeaturesKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceFragmentShadingRateFeaturesKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceFragmentShadingRateFeaturesKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceFragmentShadingRateFeaturesKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceFragmentShadingRateFeaturesKHR> array(Arena arena, VkPhysicalDeviceFragmentShadingRateFeaturesKHR... structs) {
        NativeStructArray<VkPhysicalDeviceFragmentShadingRateFeaturesKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceFragmentShadingRateFeaturesKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceFragmentShadingRateFeaturesKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceFragmentShadingRateFeaturesKHR(segment)
        );
    }
    
}