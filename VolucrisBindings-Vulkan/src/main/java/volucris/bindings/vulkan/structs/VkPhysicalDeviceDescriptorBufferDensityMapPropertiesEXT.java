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

public final class VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT
		implements Struct<VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle COMBINED_IMAGE_SAMPLER_DENSITY_MAP_DESCRIPTOR_SIZE_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long COMBINED_IMAGE_SAMPLER_DENSITY_MAP_DESCRIPTOR_SIZE_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_LONG.withName("combinedImageSamplerDensityMapDescriptorSize")
		).withName("VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		COMBINED_IMAGE_SAMPLER_DENSITY_MAP_DESCRIPTOR_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("combinedImageSamplerDensityMapDescriptorSize"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		COMBINED_IMAGE_SAMPLER_DENSITY_MAP_DESCRIPTOR_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("combinedImageSamplerDensityMapDescriptorSize"));
		//@formatter:on
	}

	public VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #combinedImageSamplerDensityMapDescriptorSize()
    public VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT combinedImageSamplerDensityMapDescriptorSize(long combinedImageSamplerDensityMapDescriptorSize) {
    	COMBINED_IMAGE_SAMPLER_DENSITY_MAP_DESCRIPTOR_SIZE_HANDLE.set(segment, 0L, combinedImageSamplerDensityMapDescriptorSize);
    	return this;
    }
    
    public long combinedImageSamplerDensityMapDescriptorSize() {
    	return (long) COMBINED_IMAGE_SAMPLER_DENSITY_MAP_DESCRIPTOR_SIZE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT set(VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT> array(Arena arena, VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT... structs) {
        NativeStructArray<VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT(segment)
        );
    }

}