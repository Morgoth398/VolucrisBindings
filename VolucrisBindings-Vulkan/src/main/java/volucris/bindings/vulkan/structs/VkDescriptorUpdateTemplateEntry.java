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
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;

public final class VkDescriptorUpdateTemplateEntry
		implements Struct<VkDescriptorUpdateTemplateEntry> {

	public static final StructLayout LAYOUT;

	public static final VarHandle DST_BINDING_HANDLE;
	public static final VarHandle DST_ARRAY_ELEMENT_HANDLE;
	public static final VarHandle DESCRIPTOR_COUNT_HANDLE;
	public static final VarHandle DESCRIPTOR_TYPE_HANDLE;
	public static final VarHandle OFFSET_HANDLE;
	public static final VarHandle STRIDE_HANDLE;

	public static final long DST_BINDING_BYTE_OFFSET;
	public static final long DST_ARRAY_ELEMENT_BYTE_OFFSET;
	public static final long DESCRIPTOR_COUNT_BYTE_OFFSET;
	public static final long DESCRIPTOR_TYPE_BYTE_OFFSET;
	public static final long OFFSET_BYTE_OFFSET;
	public static final long STRIDE_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("dstBinding"),
		    JAVA_INT.withName("dstArrayElement"),
		    JAVA_INT.withName("descriptorCount"),
		    JAVA_INT.withName("descriptorType"),
		    JAVA_LONG.withName("offset"),
		    JAVA_LONG.withName("stride")
		).withName("VkDescriptorUpdateTemplateEntry").withByteAlignment(8);
		
		DST_BINDING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("dstBinding"));
		DST_ARRAY_ELEMENT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("dstArrayElement"));
		DESCRIPTOR_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("descriptorCount"));
		DESCRIPTOR_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("descriptorType"));
		OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("offset"));
		STRIDE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("stride"));
		
		DST_BINDING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dstBinding"));
		DST_ARRAY_ELEMENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dstArrayElement"));
		DESCRIPTOR_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("descriptorCount"));
		DESCRIPTOR_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("descriptorType"));
		OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("offset"));
		STRIDE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("stride"));
		//@formatter:on
	}

	public VkDescriptorUpdateTemplateEntry() {
	    this(Arena.ofAuto());
	}
	
	public VkDescriptorUpdateTemplateEntry(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkDescriptorUpdateTemplateEntry(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #dstBinding()
    public VkDescriptorUpdateTemplateEntry dstBinding(int dstBinding) {
    	DST_BINDING_HANDLE.set(segment, 0L, dstBinding);
    	return this;
    }
    
    public int dstBinding() {
    	return (int) DST_BINDING_HANDLE.get(segment, 0L);
    }
    
    /// @see #dstArrayElement()
    public VkDescriptorUpdateTemplateEntry dstArrayElement(int dstArrayElement) {
    	DST_ARRAY_ELEMENT_HANDLE.set(segment, 0L, dstArrayElement);
    	return this;
    }
    
    public int dstArrayElement() {
    	return (int) DST_ARRAY_ELEMENT_HANDLE.get(segment, 0L);
    }
    
    /// @see #descriptorCount()
    public VkDescriptorUpdateTemplateEntry descriptorCount(int descriptorCount) {
    	DESCRIPTOR_COUNT_HANDLE.set(segment, 0L, descriptorCount);
    	return this;
    }
    
    public int descriptorCount() {
    	return (int) DESCRIPTOR_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #descriptorType()
    public VkDescriptorUpdateTemplateEntry descriptorType(int descriptorType) {
    	DESCRIPTOR_TYPE_HANDLE.set(segment, 0L, descriptorType);
    	return this;
    }
    
    public int descriptorType() {
    	return (int) DESCRIPTOR_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #offset()
    public VkDescriptorUpdateTemplateEntry offset(long offset) {
    	OFFSET_HANDLE.set(segment, 0L, offset);
    	return this;
    }
    
    public long offset() {
    	return (long) OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #stride()
    public VkDescriptorUpdateTemplateEntry stride(long stride) {
    	STRIDE_HANDLE.set(segment, 0L, stride);
    	return this;
    }
    
    public long stride() {
    	return (long) STRIDE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkDescriptorUpdateTemplateEntry set(VkDescriptorUpdateTemplateEntry other) {
        return set(other.segment);
    }
    
    @Override
    public VkDescriptorUpdateTemplateEntry set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDescriptorUpdateTemplateEntry> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDescriptorUpdateTemplateEntry> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkDescriptorUpdateTemplateEntry(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDescriptorUpdateTemplateEntry> array(SegmentAllocator allocator, VkDescriptorUpdateTemplateEntry... structs) {
        NativeStructArray<VkDescriptorUpdateTemplateEntry> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkDescriptorUpdateTemplateEntry(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDescriptorUpdateTemplateEntry> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDescriptorUpdateTemplateEntry(segment)
        );
    }

}