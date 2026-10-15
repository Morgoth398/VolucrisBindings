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

public final class VkPhysicalDeviceSamplerYcbcrConversionFeatures
		implements Struct<VkPhysicalDeviceSamplerYcbcrConversionFeatures> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle SAMPLER_YCBCR_CONVERSION_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long SAMPLER_YCBCR_CONVERSION_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("samplerYcbcrConversion"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPhysicalDeviceSamplerYcbcrConversionFeatures").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		SAMPLER_YCBCR_CONVERSION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("samplerYcbcrConversion"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		SAMPLER_YCBCR_CONVERSION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("samplerYcbcrConversion"));
		//@formatter:on
	}

	public VkPhysicalDeviceSamplerYcbcrConversionFeatures() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceSamplerYcbcrConversionFeatures(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceSamplerYcbcrConversionFeatures(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceSamplerYcbcrConversionFeatures sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceSamplerYcbcrConversionFeatures pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #samplerYcbcrConversion()
    public VkPhysicalDeviceSamplerYcbcrConversionFeatures samplerYcbcrConversion(int samplerYcbcrConversion) {
    	SAMPLER_YCBCR_CONVERSION_HANDLE.set(segment, 0L, samplerYcbcrConversion);
    	return this;
    }
    
    public int samplerYcbcrConversion() {
    	return (int) SAMPLER_YCBCR_CONVERSION_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceSamplerYcbcrConversionFeatures set(VkPhysicalDeviceSamplerYcbcrConversionFeatures other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceSamplerYcbcrConversionFeatures set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceSamplerYcbcrConversionFeatures> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceSamplerYcbcrConversionFeatures> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceSamplerYcbcrConversionFeatures(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceSamplerYcbcrConversionFeatures> array(Arena arena, VkPhysicalDeviceSamplerYcbcrConversionFeatures... structs) {
        NativeStructArray<VkPhysicalDeviceSamplerYcbcrConversionFeatures> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceSamplerYcbcrConversionFeatures(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceSamplerYcbcrConversionFeatures> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceSamplerYcbcrConversionFeatures(segment)
        );
    }

}