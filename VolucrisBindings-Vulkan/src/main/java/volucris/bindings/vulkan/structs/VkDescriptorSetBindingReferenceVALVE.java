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

public final class VkDescriptorSetBindingReferenceVALVE
		implements Struct<VkDescriptorSetBindingReferenceVALVE> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle DESCRIPTOR_SET_LAYOUT_HANDLE;
	public static final VarHandle BINDING_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long DESCRIPTOR_SET_LAYOUT_BYTE_OFFSET;
	public static final long BINDING_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    UNBOUNDED_ADDRESS.withName("descriptorSetLayout"),
		    JAVA_INT.withName("binding"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkDescriptorSetBindingReferenceVALVE").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		DESCRIPTOR_SET_LAYOUT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("descriptorSetLayout"));
		BINDING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("binding"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		DESCRIPTOR_SET_LAYOUT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("descriptorSetLayout"));
		BINDING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("binding"));
		//@formatter:on
	}

	public VkDescriptorSetBindingReferenceVALVE() {
	    this(Arena.ofAuto());
	}
	
	public VkDescriptorSetBindingReferenceVALVE(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkDescriptorSetBindingReferenceVALVE(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkDescriptorSetBindingReferenceVALVE sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkDescriptorSetBindingReferenceVALVE pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #descriptorSetLayout()
    public VkDescriptorSetBindingReferenceVALVE descriptorSetLayout(VkDescriptorSetLayout descriptorSetLayout) {
    	DESCRIPTOR_SET_LAYOUT_HANDLE.set(segment, 0L, descriptorSetLayout.memorySegment());
    	return this;
    }
    
    public @Nullable VkDescriptorSetLayout descriptorSetLayout() {
    	MemorySegment segment = (MemorySegment) DESCRIPTOR_SET_LAYOUT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkDescriptorSetLayout(segment);
    }
    
    /// @see #binding()
    public VkDescriptorSetBindingReferenceVALVE binding(int binding) {
    	BINDING_HANDLE.set(segment, 0L, binding);
    	return this;
    }
    
    public int binding() {
    	return (int) BINDING_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkDescriptorSetBindingReferenceVALVE set(VkDescriptorSetBindingReferenceVALVE other) {
        return set(other.segment);
    }
    
    @Override
    public VkDescriptorSetBindingReferenceVALVE set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDescriptorSetBindingReferenceVALVE> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDescriptorSetBindingReferenceVALVE> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkDescriptorSetBindingReferenceVALVE(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDescriptorSetBindingReferenceVALVE> array(SegmentAllocator allocator, VkDescriptorSetBindingReferenceVALVE... structs) {
        NativeStructArray<VkDescriptorSetBindingReferenceVALVE> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkDescriptorSetBindingReferenceVALVE(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDescriptorSetBindingReferenceVALVE> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDescriptorSetBindingReferenceVALVE(segment)
        );
    }

}