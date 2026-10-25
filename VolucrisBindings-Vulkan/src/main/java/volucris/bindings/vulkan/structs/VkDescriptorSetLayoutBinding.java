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
import volucris.bindings.core.NativePointerArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkDescriptorSetLayoutBinding
		implements Struct<VkDescriptorSetLayoutBinding> {

	public static final StructLayout LAYOUT;

	public static final VarHandle BINDING_HANDLE;
	public static final VarHandle DESCRIPTOR_TYPE_HANDLE;
	public static final VarHandle DESCRIPTOR_COUNT_HANDLE;
	public static final VarHandle STAGE_FLAGS_HANDLE;
	public static final VarHandle P_IMMUTABLE_SAMPLERS_HANDLE;

	public static final long BINDING_BYTE_OFFSET;
	public static final long DESCRIPTOR_TYPE_BYTE_OFFSET;
	public static final long DESCRIPTOR_COUNT_BYTE_OFFSET;
	public static final long STAGE_FLAGS_BYTE_OFFSET;
	public static final long P_IMMUTABLE_SAMPLERS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("binding"),
		    JAVA_INT.withName("descriptorType"),
		    JAVA_INT.withName("descriptorCount"),
		    JAVA_INT.withName("stageFlags"),
		    UNBOUNDED_ADDRESS.withName("pImmutableSamplers")
		).withName("VkDescriptorSetLayoutBinding").withByteAlignment(8);
		
		BINDING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("binding"));
		DESCRIPTOR_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("descriptorType"));
		DESCRIPTOR_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("descriptorCount"));
		STAGE_FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("stageFlags"));
		P_IMMUTABLE_SAMPLERS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pImmutableSamplers"));
		
		BINDING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("binding"));
		DESCRIPTOR_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("descriptorType"));
		DESCRIPTOR_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("descriptorCount"));
		STAGE_FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("stageFlags"));
		P_IMMUTABLE_SAMPLERS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pImmutableSamplers"));
		//@formatter:on
	}

	public VkDescriptorSetLayoutBinding() {
	    this(Arena.ofAuto());
	}
	
	public VkDescriptorSetLayoutBinding(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkDescriptorSetLayoutBinding(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #binding()
    public VkDescriptorSetLayoutBinding binding(int binding) {
    	BINDING_HANDLE.set(segment, 0L, binding);
    	return this;
    }
    
    public int binding() {
    	return (int) BINDING_HANDLE.get(segment, 0L);
    }
    
    /// @see #descriptorType()
    public VkDescriptorSetLayoutBinding descriptorType(int descriptorType) {
    	DESCRIPTOR_TYPE_HANDLE.set(segment, 0L, descriptorType);
    	return this;
    }
    
    public int descriptorType() {
    	return (int) DESCRIPTOR_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #descriptorCount()
    public VkDescriptorSetLayoutBinding descriptorCount(int descriptorCount) {
    	DESCRIPTOR_COUNT_HANDLE.set(segment, 0L, descriptorCount);
    	return this;
    }
    
    public int descriptorCount() {
    	return (int) DESCRIPTOR_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #stageFlags()
    public VkDescriptorSetLayoutBinding stageFlags(int stageFlags) {
    	STAGE_FLAGS_HANDLE.set(segment, 0L, stageFlags);
    	return this;
    }
    
    public int stageFlags() {
    	return (int) STAGE_FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #pImmutableSamplers()
    public VkDescriptorSetLayoutBinding pImmutableSamplers(NativePointerArray pImmutableSamplers) {
    	P_IMMUTABLE_SAMPLERS_HANDLE.set(segment, 0L, pImmutableSamplers.memorySegment());
    	return this;
    }
    
    public @Nullable NativePointerArray pImmutableSamplers() {
    	MemorySegment segment = (MemorySegment) P_IMMUTABLE_SAMPLERS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativePointerArray(segment);
    }
    
    @Override
    public VkDescriptorSetLayoutBinding set(VkDescriptorSetLayoutBinding other) {
        return set(other.segment);
    }
    
    @Override
    public VkDescriptorSetLayoutBinding set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDescriptorSetLayoutBinding> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDescriptorSetLayoutBinding> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkDescriptorSetLayoutBinding(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDescriptorSetLayoutBinding> array(SegmentAllocator allocator, VkDescriptorSetLayoutBinding... structs) {
        NativeStructArray<VkDescriptorSetLayoutBinding> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkDescriptorSetLayoutBinding(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDescriptorSetLayoutBinding> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDescriptorSetLayoutBinding(segment)
        );
    }

}