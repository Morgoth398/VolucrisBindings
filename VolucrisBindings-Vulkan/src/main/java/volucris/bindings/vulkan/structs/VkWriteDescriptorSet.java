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
import volucris.bindings.core.NativePointerArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkWriteDescriptorSet
		implements Struct<VkWriteDescriptorSet> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle DST_SET_HANDLE;
    public static final VarHandle DST_BINDING_HANDLE;
    public static final VarHandle DST_ARRAY_ELEMENT_HANDLE;
    public static final VarHandle DESCRIPTOR_COUNT_HANDLE;
    public static final VarHandle DESCRIPTOR_TYPE_HANDLE;
    public static final VarHandle P_IMAGE_INFO_HANDLE;
    public static final VarHandle P_BUFFER_INFO_HANDLE;
    public static final VarHandle P_TEXEL_BUFFER_VIEW_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long DST_SET_BYTE_OFFSET;
    public static final long DST_BINDING_BYTE_OFFSET;
    public static final long DST_ARRAY_ELEMENT_BYTE_OFFSET;
    public static final long DESCRIPTOR_COUNT_BYTE_OFFSET;
    public static final long DESCRIPTOR_TYPE_BYTE_OFFSET;
    public static final long P_IMAGE_INFO_BYTE_OFFSET;
    public static final long P_BUFFER_INFO_BYTE_OFFSET;
    public static final long P_TEXEL_BUFFER_VIEW_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            UNBOUNDED_ADDRESS.withName("dstSet"),
            JAVA_INT.withName("dstBinding"),
            JAVA_INT.withName("dstArrayElement"),
            JAVA_INT.withName("descriptorCount"),
            JAVA_INT.withName("descriptorType"),
            UNBOUNDED_ADDRESS.withName("pImageInfo"),
            UNBOUNDED_ADDRESS.withName("pBufferInfo"),
            UNBOUNDED_ADDRESS.withName("pTexelBufferView")
        ).withName("VkWriteDescriptorSet").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        DST_SET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("dstSet"));
        DST_BINDING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("dstBinding"));
        DST_ARRAY_ELEMENT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("dstArrayElement"));
        DESCRIPTOR_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("descriptorCount"));
        DESCRIPTOR_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("descriptorType"));
        P_IMAGE_INFO_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pImageInfo"));
        P_BUFFER_INFO_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pBufferInfo"));
        P_TEXEL_BUFFER_VIEW_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pTexelBufferView"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        DST_SET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dstSet"));
        DST_BINDING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dstBinding"));
        DST_ARRAY_ELEMENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dstArrayElement"));
        DESCRIPTOR_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("descriptorCount"));
        DESCRIPTOR_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("descriptorType"));
        P_IMAGE_INFO_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pImageInfo"));
        P_BUFFER_INFO_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pBufferInfo"));
        P_TEXEL_BUFFER_VIEW_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pTexelBufferView"));
        //@formatter:on
    }

    public VkWriteDescriptorSet() {
        this(Arena.ofAuto());
    }
    
    public VkWriteDescriptorSet(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkWriteDescriptorSet(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkWriteDescriptorSet sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkWriteDescriptorSet pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #dstSet()
    public VkWriteDescriptorSet dstSet(VkDescriptorSet dstSet) {
    	DST_SET_HANDLE.set(segment, 0L, dstSet.memorySegment());
    	return this;
    }
    
    public @Nullable VkDescriptorSet dstSet() {
    	MemorySegment segment = (MemorySegment) DST_SET_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkDescriptorSet(segment);
    }
    
    /// @see #dstBinding()
    public VkWriteDescriptorSet dstBinding(int dstBinding) {
    	DST_BINDING_HANDLE.set(segment, 0L, dstBinding);
    	return this;
    }
    
    public int dstBinding() {
    	return (int) DST_BINDING_HANDLE.get(segment, 0L);
    }
    
    /// @see #dstArrayElement()
    public VkWriteDescriptorSet dstArrayElement(int dstArrayElement) {
    	DST_ARRAY_ELEMENT_HANDLE.set(segment, 0L, dstArrayElement);
    	return this;
    }
    
    public int dstArrayElement() {
    	return (int) DST_ARRAY_ELEMENT_HANDLE.get(segment, 0L);
    }
    
    /// @see #descriptorCount()
    public VkWriteDescriptorSet descriptorCount(int descriptorCount) {
    	DESCRIPTOR_COUNT_HANDLE.set(segment, 0L, descriptorCount);
    	return this;
    }
    
    public int descriptorCount() {
    	return (int) DESCRIPTOR_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #descriptorType()
    public VkWriteDescriptorSet descriptorType(int descriptorType) {
    	DESCRIPTOR_TYPE_HANDLE.set(segment, 0L, descriptorType);
    	return this;
    }
    
    public int descriptorType() {
    	return (int) DESCRIPTOR_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pImageInfo()
    public VkWriteDescriptorSet pImageInfo(NativeStructArray<VkDescriptorImageInfo> pImageInfo) {
    	P_IMAGE_INFO_HANDLE.set(segment, 0L, pImageInfo.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkDescriptorImageInfo> pImageInfo() {
    	MemorySegment segment = (MemorySegment) P_IMAGE_INFO_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkDescriptorImageInfo.array(segment);
    }
    
    /// @see #pBufferInfo()
    public VkWriteDescriptorSet pBufferInfo(NativeStructArray<VkDescriptorBufferInfo> pBufferInfo) {
    	P_BUFFER_INFO_HANDLE.set(segment, 0L, pBufferInfo.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkDescriptorBufferInfo> pBufferInfo() {
    	MemorySegment segment = (MemorySegment) P_BUFFER_INFO_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkDescriptorBufferInfo.array(segment);
    }
    
    /// @see #pTexelBufferView()
    public VkWriteDescriptorSet pTexelBufferView(NativePointerArray pTexelBufferView) {
    	P_TEXEL_BUFFER_VIEW_HANDLE.set(segment, 0L, pTexelBufferView.memorySegment());
    	return this;
    }
    
    public @Nullable NativePointerArray pTexelBufferView() {
    	MemorySegment segment = (MemorySegment) P_TEXEL_BUFFER_VIEW_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativePointerArray(segment);
    }
    
    @Override
    public VkWriteDescriptorSet set(VkWriteDescriptorSet other) {
        return set(other.segment);
    }
    
    @Override
    public VkWriteDescriptorSet set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkWriteDescriptorSet> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkWriteDescriptorSet> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkWriteDescriptorSet(segment),
            count
        );
    }
    
    public static NativeStructArray<VkWriteDescriptorSet> array(Arena arena, VkWriteDescriptorSet... structs) {
        NativeStructArray<VkWriteDescriptorSet> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkWriteDescriptorSet(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkWriteDescriptorSet> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkWriteDescriptorSet(segment)
        );
    }
    
}