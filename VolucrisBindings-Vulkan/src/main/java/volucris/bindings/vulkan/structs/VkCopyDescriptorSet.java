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

public final class VkCopyDescriptorSet
		implements Struct<VkCopyDescriptorSet> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle SRC_SET_HANDLE;
    public static final VarHandle SRC_BINDING_HANDLE;
    public static final VarHandle SRC_ARRAY_ELEMENT_HANDLE;
    public static final VarHandle DST_SET_HANDLE;
    public static final VarHandle DST_BINDING_HANDLE;
    public static final VarHandle DST_ARRAY_ELEMENT_HANDLE;
    public static final VarHandle DESCRIPTOR_COUNT_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long SRC_SET_BYTE_OFFSET;
    public static final long SRC_BINDING_BYTE_OFFSET;
    public static final long SRC_ARRAY_ELEMENT_BYTE_OFFSET;
    public static final long DST_SET_BYTE_OFFSET;
    public static final long DST_BINDING_BYTE_OFFSET;
    public static final long DST_ARRAY_ELEMENT_BYTE_OFFSET;
    public static final long DESCRIPTOR_COUNT_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            UNBOUNDED_ADDRESS.withName("srcSet"),
            JAVA_INT.withName("srcBinding"),
            JAVA_INT.withName("srcArrayElement"),
            UNBOUNDED_ADDRESS.withName("dstSet"),
            JAVA_INT.withName("dstBinding"),
            JAVA_INT.withName("dstArrayElement"),
            JAVA_INT.withName("descriptorCount"),
            MemoryLayout.paddingLayout(4)
        ).withName("VkCopyDescriptorSet").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        SRC_SET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("srcSet"));
        SRC_BINDING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("srcBinding"));
        SRC_ARRAY_ELEMENT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("srcArrayElement"));
        DST_SET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("dstSet"));
        DST_BINDING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("dstBinding"));
        DST_ARRAY_ELEMENT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("dstArrayElement"));
        DESCRIPTOR_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("descriptorCount"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        SRC_SET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("srcSet"));
        SRC_BINDING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("srcBinding"));
        SRC_ARRAY_ELEMENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("srcArrayElement"));
        DST_SET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dstSet"));
        DST_BINDING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dstBinding"));
        DST_ARRAY_ELEMENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dstArrayElement"));
        DESCRIPTOR_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("descriptorCount"));
        //@formatter:on
    }

    public VkCopyDescriptorSet() {
        this(Arena.ofAuto());
    }
    
    public VkCopyDescriptorSet(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkCopyDescriptorSet(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkCopyDescriptorSet sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkCopyDescriptorSet pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #srcSet()
    public VkCopyDescriptorSet srcSet(VkDescriptorSet srcSet) {
    	SRC_SET_HANDLE.set(segment, 0L, srcSet.memorySegment());
    	return this;
    }
    
    public @Nullable VkDescriptorSet srcSet() {
    	MemorySegment segment = (MemorySegment) SRC_SET_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkDescriptorSet(segment);
    }
    
    /// @see #srcBinding()
    public VkCopyDescriptorSet srcBinding(int srcBinding) {
    	SRC_BINDING_HANDLE.set(segment, 0L, srcBinding);
    	return this;
    }
    
    public int srcBinding() {
    	return (int) SRC_BINDING_HANDLE.get(segment, 0L);
    }
    
    /// @see #srcArrayElement()
    public VkCopyDescriptorSet srcArrayElement(int srcArrayElement) {
    	SRC_ARRAY_ELEMENT_HANDLE.set(segment, 0L, srcArrayElement);
    	return this;
    }
    
    public int srcArrayElement() {
    	return (int) SRC_ARRAY_ELEMENT_HANDLE.get(segment, 0L);
    }
    
    /// @see #dstSet()
    public VkCopyDescriptorSet dstSet(VkDescriptorSet dstSet) {
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
    public VkCopyDescriptorSet dstBinding(int dstBinding) {
    	DST_BINDING_HANDLE.set(segment, 0L, dstBinding);
    	return this;
    }
    
    public int dstBinding() {
    	return (int) DST_BINDING_HANDLE.get(segment, 0L);
    }
    
    /// @see #dstArrayElement()
    public VkCopyDescriptorSet dstArrayElement(int dstArrayElement) {
    	DST_ARRAY_ELEMENT_HANDLE.set(segment, 0L, dstArrayElement);
    	return this;
    }
    
    public int dstArrayElement() {
    	return (int) DST_ARRAY_ELEMENT_HANDLE.get(segment, 0L);
    }
    
    /// @see #descriptorCount()
    public VkCopyDescriptorSet descriptorCount(int descriptorCount) {
    	DESCRIPTOR_COUNT_HANDLE.set(segment, 0L, descriptorCount);
    	return this;
    }
    
    public int descriptorCount() {
    	return (int) DESCRIPTOR_COUNT_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkCopyDescriptorSet set(VkCopyDescriptorSet other) {
        return set(other.segment);
    }
    
    @Override
    public VkCopyDescriptorSet set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkCopyDescriptorSet> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkCopyDescriptorSet> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkCopyDescriptorSet(segment),
            count
        );
    }
    
    public static NativeStructArray<VkCopyDescriptorSet> array(Arena arena, VkCopyDescriptorSet... structs) {
        NativeStructArray<VkCopyDescriptorSet> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkCopyDescriptorSet(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkCopyDescriptorSet> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkCopyDescriptorSet(segment)
        );
    }
    
}