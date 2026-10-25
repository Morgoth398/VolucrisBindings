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

public final class VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT
		implements Struct<VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle FORMAT_RGBA10X6_WITHOUT_YCB_CR_SAMPLER_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long FORMAT_RGBA10X6_WITHOUT_YCB_CR_SAMPLER_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("formatRgba10x6WithoutYCbCrSampler"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		FORMAT_RGBA10X6_WITHOUT_YCB_CR_SAMPLER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("formatRgba10x6WithoutYCbCrSampler"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		FORMAT_RGBA10X6_WITHOUT_YCB_CR_SAMPLER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("formatRgba10x6WithoutYCbCrSampler"));
		//@formatter:on
	}

	public VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #formatRgba10x6WithoutYCbCrSampler()
    public VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT formatRgba10x6WithoutYCbCrSampler(int formatRgba10x6WithoutYCbCrSampler) {
    	FORMAT_RGBA10X6_WITHOUT_YCB_CR_SAMPLER_HANDLE.set(segment, 0L, formatRgba10x6WithoutYCbCrSampler);
    	return this;
    }
    
    public int formatRgba10x6WithoutYCbCrSampler() {
    	return (int) FORMAT_RGBA10X6_WITHOUT_YCB_CR_SAMPLER_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT set(VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT> array(SegmentAllocator allocator, VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT... structs) {
        NativeStructArray<VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT(segment)
        );
    }

}