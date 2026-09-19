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

public final class VkPhysicalDeviceShadingRateImageFeaturesNV
		implements Struct<VkPhysicalDeviceShadingRateImageFeaturesNV> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle SHADING_RATE_IMAGE_HANDLE;
    public static final VarHandle SHADING_RATE_COARSE_SAMPLE_ORDER_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long SHADING_RATE_IMAGE_BYTE_OFFSET;
    public static final long SHADING_RATE_COARSE_SAMPLE_ORDER_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("shadingRateImage"),
            JAVA_INT.withName("shadingRateCoarseSampleOrder")
        ).withName("VkPhysicalDeviceShadingRateImageFeaturesNV").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        SHADING_RATE_IMAGE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shadingRateImage"));
        SHADING_RATE_COARSE_SAMPLE_ORDER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shadingRateCoarseSampleOrder"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        SHADING_RATE_IMAGE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shadingRateImage"));
        SHADING_RATE_COARSE_SAMPLE_ORDER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shadingRateCoarseSampleOrder"));
        //@formatter:on
    }

    public VkPhysicalDeviceShadingRateImageFeaturesNV() {
        this(Arena.ofAuto());
    }
    
    public VkPhysicalDeviceShadingRateImageFeaturesNV(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkPhysicalDeviceShadingRateImageFeaturesNV(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkPhysicalDeviceShadingRateImageFeaturesNV sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceShadingRateImageFeaturesNV pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #shadingRateImage()
    public VkPhysicalDeviceShadingRateImageFeaturesNV shadingRateImage(int shadingRateImage) {
    	SHADING_RATE_IMAGE_HANDLE.set(segment, 0L, shadingRateImage);
    	return this;
    }
    
    public int shadingRateImage() {
    	return (int) SHADING_RATE_IMAGE_HANDLE.get(segment, 0L);
    }
    
    /// @see #shadingRateCoarseSampleOrder()
    public VkPhysicalDeviceShadingRateImageFeaturesNV shadingRateCoarseSampleOrder(int shadingRateCoarseSampleOrder) {
    	SHADING_RATE_COARSE_SAMPLE_ORDER_HANDLE.set(segment, 0L, shadingRateCoarseSampleOrder);
    	return this;
    }
    
    public int shadingRateCoarseSampleOrder() {
    	return (int) SHADING_RATE_COARSE_SAMPLE_ORDER_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceShadingRateImageFeaturesNV set(VkPhysicalDeviceShadingRateImageFeaturesNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceShadingRateImageFeaturesNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceShadingRateImageFeaturesNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceShadingRateImageFeaturesNV> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceShadingRateImageFeaturesNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceShadingRateImageFeaturesNV> array(Arena arena, VkPhysicalDeviceShadingRateImageFeaturesNV... structs) {
        NativeStructArray<VkPhysicalDeviceShadingRateImageFeaturesNV> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceShadingRateImageFeaturesNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceShadingRateImageFeaturesNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceShadingRateImageFeaturesNV(segment)
        );
    }
    
}