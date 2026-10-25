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

public final class VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE
		implements Struct<VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle DESCRIPTOR_SET_HOST_MAPPING_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long DESCRIPTOR_SET_HOST_MAPPING_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("descriptorSetHostMapping"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		DESCRIPTOR_SET_HOST_MAPPING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("descriptorSetHostMapping"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		DESCRIPTOR_SET_HOST_MAPPING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("descriptorSetHostMapping"));
		//@formatter:on
	}

	public VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #descriptorSetHostMapping()
    public VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE descriptorSetHostMapping(int descriptorSetHostMapping) {
    	DESCRIPTOR_SET_HOST_MAPPING_HANDLE.set(segment, 0L, descriptorSetHostMapping);
    	return this;
    }
    
    public int descriptorSetHostMapping() {
    	return (int) DESCRIPTOR_SET_HOST_MAPPING_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE set(VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE> array(SegmentAllocator allocator, VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE... structs) {
        NativeStructArray<VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE(segment)
        );
    }

}