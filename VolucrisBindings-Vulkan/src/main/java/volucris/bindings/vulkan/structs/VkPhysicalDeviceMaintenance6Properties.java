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

public final class VkPhysicalDeviceMaintenance6Properties
		implements Struct<VkPhysicalDeviceMaintenance6Properties> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle BLOCK_TEXEL_VIEW_COMPATIBLE_MULTIPLE_LAYERS_HANDLE;
	public static final VarHandle MAX_COMBINED_IMAGE_SAMPLER_DESCRIPTOR_COUNT_HANDLE;
	public static final VarHandle FRAGMENT_SHADING_RATE_CLAMP_COMBINER_INPUTS_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long BLOCK_TEXEL_VIEW_COMPATIBLE_MULTIPLE_LAYERS_BYTE_OFFSET;
	public static final long MAX_COMBINED_IMAGE_SAMPLER_DESCRIPTOR_COUNT_BYTE_OFFSET;
	public static final long FRAGMENT_SHADING_RATE_CLAMP_COMBINER_INPUTS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("blockTexelViewCompatibleMultipleLayers"),
		    JAVA_INT.withName("maxCombinedImageSamplerDescriptorCount"),
		    JAVA_INT.withName("fragmentShadingRateClampCombinerInputs"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPhysicalDeviceMaintenance6Properties").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		BLOCK_TEXEL_VIEW_COMPATIBLE_MULTIPLE_LAYERS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("blockTexelViewCompatibleMultipleLayers"));
		MAX_COMBINED_IMAGE_SAMPLER_DESCRIPTOR_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxCombinedImageSamplerDescriptorCount"));
		FRAGMENT_SHADING_RATE_CLAMP_COMBINER_INPUTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("fragmentShadingRateClampCombinerInputs"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		BLOCK_TEXEL_VIEW_COMPATIBLE_MULTIPLE_LAYERS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("blockTexelViewCompatibleMultipleLayers"));
		MAX_COMBINED_IMAGE_SAMPLER_DESCRIPTOR_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxCombinedImageSamplerDescriptorCount"));
		FRAGMENT_SHADING_RATE_CLAMP_COMBINER_INPUTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("fragmentShadingRateClampCombinerInputs"));
		//@formatter:on
	}

	public VkPhysicalDeviceMaintenance6Properties() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceMaintenance6Properties(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceMaintenance6Properties(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceMaintenance6Properties sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceMaintenance6Properties pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #blockTexelViewCompatibleMultipleLayers()
    public VkPhysicalDeviceMaintenance6Properties blockTexelViewCompatibleMultipleLayers(int blockTexelViewCompatibleMultipleLayers) {
    	BLOCK_TEXEL_VIEW_COMPATIBLE_MULTIPLE_LAYERS_HANDLE.set(segment, 0L, blockTexelViewCompatibleMultipleLayers);
    	return this;
    }
    
    public int blockTexelViewCompatibleMultipleLayers() {
    	return (int) BLOCK_TEXEL_VIEW_COMPATIBLE_MULTIPLE_LAYERS_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxCombinedImageSamplerDescriptorCount()
    public VkPhysicalDeviceMaintenance6Properties maxCombinedImageSamplerDescriptorCount(int maxCombinedImageSamplerDescriptorCount) {
    	MAX_COMBINED_IMAGE_SAMPLER_DESCRIPTOR_COUNT_HANDLE.set(segment, 0L, maxCombinedImageSamplerDescriptorCount);
    	return this;
    }
    
    public int maxCombinedImageSamplerDescriptorCount() {
    	return (int) MAX_COMBINED_IMAGE_SAMPLER_DESCRIPTOR_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #fragmentShadingRateClampCombinerInputs()
    public VkPhysicalDeviceMaintenance6Properties fragmentShadingRateClampCombinerInputs(int fragmentShadingRateClampCombinerInputs) {
    	FRAGMENT_SHADING_RATE_CLAMP_COMBINER_INPUTS_HANDLE.set(segment, 0L, fragmentShadingRateClampCombinerInputs);
    	return this;
    }
    
    public int fragmentShadingRateClampCombinerInputs() {
    	return (int) FRAGMENT_SHADING_RATE_CLAMP_COMBINER_INPUTS_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceMaintenance6Properties set(VkPhysicalDeviceMaintenance6Properties other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceMaintenance6Properties set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceMaintenance6Properties> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceMaintenance6Properties> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceMaintenance6Properties(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceMaintenance6Properties> array(Arena arena, VkPhysicalDeviceMaintenance6Properties... structs) {
        NativeStructArray<VkPhysicalDeviceMaintenance6Properties> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceMaintenance6Properties(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceMaintenance6Properties> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceMaintenance6Properties(segment)
        );
    }

}