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

public final class VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV
		implements Struct<VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle DESCRIPTOR_POOL_OVERALLOCATION_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long DESCRIPTOR_POOL_OVERALLOCATION_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("descriptorPoolOverallocation"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		DESCRIPTOR_POOL_OVERALLOCATION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("descriptorPoolOverallocation"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		DESCRIPTOR_POOL_OVERALLOCATION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("descriptorPoolOverallocation"));
		//@formatter:on
	}

	public VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #descriptorPoolOverallocation()
    public VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV descriptorPoolOverallocation(int descriptorPoolOverallocation) {
    	DESCRIPTOR_POOL_OVERALLOCATION_HANDLE.set(segment, 0L, descriptorPoolOverallocation);
    	return this;
    }
    
    public int descriptorPoolOverallocation() {
    	return (int) DESCRIPTOR_POOL_OVERALLOCATION_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV set(VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV> array(Arena arena, VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV... structs) {
        NativeStructArray<VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV(segment)
        );
    }

}