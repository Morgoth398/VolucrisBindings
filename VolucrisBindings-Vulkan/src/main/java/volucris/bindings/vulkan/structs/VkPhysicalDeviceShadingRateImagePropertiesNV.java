/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
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

public final class VkPhysicalDeviceShadingRateImagePropertiesNV
		implements Struct<VkPhysicalDeviceShadingRateImagePropertiesNV> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle SHADING_RATE_PALETTE_SIZE_HANDLE;
    public static final VarHandle SHADING_RATE_MAX_COARSE_SAMPLES_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long SHADING_RATE_TEXEL_SIZE_BYTE_OFFSET;
    public static final long SHADING_RATE_PALETTE_SIZE_BYTE_OFFSET;
    public static final long SHADING_RATE_MAX_COARSE_SAMPLES_BYTE_OFFSET;

    private final MemorySegment segment;

    private final VkExtent2D shadingRateTexelSize;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            VkExtent2D.LAYOUT.withName("shadingRateTexelSize"),
            JAVA_INT.withName("shadingRatePaletteSize"),
            JAVA_INT.withName("shadingRateMaxCoarseSamples")
        ).withName("VkPhysicalDeviceShadingRateImagePropertiesNV").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        SHADING_RATE_PALETTE_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shadingRatePaletteSize"));
        SHADING_RATE_MAX_COARSE_SAMPLES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("shadingRateMaxCoarseSamples"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        SHADING_RATE_TEXEL_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shadingRateTexelSize"));
        SHADING_RATE_PALETTE_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shadingRatePaletteSize"));
        SHADING_RATE_MAX_COARSE_SAMPLES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("shadingRateMaxCoarseSamples"));
        //@formatter:on
    }

    public VkPhysicalDeviceShadingRateImagePropertiesNV() {
        this(Arena.ofAuto());
    }
    
    public VkPhysicalDeviceShadingRateImagePropertiesNV(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkPhysicalDeviceShadingRateImagePropertiesNV(MemorySegment segment) {
        this.segment = segment;
    
        shadingRateTexelSize = new VkExtent2D(segment.asSlice(SHADING_RATE_TEXEL_SIZE_BYTE_OFFSET, VkExtent2D.LAYOUT));
    }

    /// @see #sType()
    public VkPhysicalDeviceShadingRateImagePropertiesNV sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceShadingRateImagePropertiesNV pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #shadingRatePaletteSize()
    public VkPhysicalDeviceShadingRateImagePropertiesNV shadingRatePaletteSize(int shadingRatePaletteSize) {
    	SHADING_RATE_PALETTE_SIZE_HANDLE.set(segment, 0L, shadingRatePaletteSize);
    	return this;
    }
    
    public int shadingRatePaletteSize() {
    	return (int) SHADING_RATE_PALETTE_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #shadingRateMaxCoarseSamples()
    public VkPhysicalDeviceShadingRateImagePropertiesNV shadingRateMaxCoarseSamples(int shadingRateMaxCoarseSamples) {
    	SHADING_RATE_MAX_COARSE_SAMPLES_HANDLE.set(segment, 0L, shadingRateMaxCoarseSamples);
    	return this;
    }
    
    public int shadingRateMaxCoarseSamples() {
    	return (int) SHADING_RATE_MAX_COARSE_SAMPLES_HANDLE.get(segment, 0L);
    }
    
    /// @see #shadingRateTexelSize()
    public VkPhysicalDeviceShadingRateImagePropertiesNV shadingRateTexelSize(Consumer<VkExtent2D> consumer) {
    	consumer.accept(shadingRateTexelSize);
    	return this;
    }
    
    /// @see #shadingRateTexelSize()
    public VkPhysicalDeviceShadingRateImagePropertiesNV shadingRateTexelSize(VkExtent2D other) {
    	shadingRateTexelSize.set(other);
    	return this;
    }
    
    public VkExtent2D shadingRateTexelSize() {
    	return shadingRateTexelSize;
    }
    
    @Override
    public VkPhysicalDeviceShadingRateImagePropertiesNV set(VkPhysicalDeviceShadingRateImagePropertiesNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceShadingRateImagePropertiesNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceShadingRateImagePropertiesNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceShadingRateImagePropertiesNV> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceShadingRateImagePropertiesNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceShadingRateImagePropertiesNV> array(Arena arena, VkPhysicalDeviceShadingRateImagePropertiesNV... structs) {
        NativeStructArray<VkPhysicalDeviceShadingRateImagePropertiesNV> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceShadingRateImagePropertiesNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceShadingRateImagePropertiesNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceShadingRateImagePropertiesNV(segment)
        );
    }
    
}