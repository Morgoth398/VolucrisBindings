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

public final class VkPipelineVertexInputStateCreateInfo
		implements Struct<VkPipelineVertexInputStateCreateInfo> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle FLAGS_HANDLE;
    public static final VarHandle VERTEX_BINDING_DESCRIPTION_COUNT_HANDLE;
    public static final VarHandle P_VERTEX_BINDING_DESCRIPTIONS_HANDLE;
    public static final VarHandle VERTEX_ATTRIBUTE_DESCRIPTION_COUNT_HANDLE;
    public static final VarHandle P_VERTEX_ATTRIBUTE_DESCRIPTIONS_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long FLAGS_BYTE_OFFSET;
    public static final long VERTEX_BINDING_DESCRIPTION_COUNT_BYTE_OFFSET;
    public static final long P_VERTEX_BINDING_DESCRIPTIONS_BYTE_OFFSET;
    public static final long VERTEX_ATTRIBUTE_DESCRIPTION_COUNT_BYTE_OFFSET;
    public static final long P_VERTEX_ATTRIBUTE_DESCRIPTIONS_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("flags"),
            JAVA_INT.withName("vertexBindingDescriptionCount"),
            UNBOUNDED_ADDRESS.withName("pVertexBindingDescriptions"),
            JAVA_INT.withName("vertexAttributeDescriptionCount"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pVertexAttributeDescriptions")
        ).withName("VkPipelineVertexInputStateCreateInfo").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
        VERTEX_BINDING_DESCRIPTION_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("vertexBindingDescriptionCount"));
        P_VERTEX_BINDING_DESCRIPTIONS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pVertexBindingDescriptions"));
        VERTEX_ATTRIBUTE_DESCRIPTION_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("vertexAttributeDescriptionCount"));
        P_VERTEX_ATTRIBUTE_DESCRIPTIONS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pVertexAttributeDescriptions"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
        VERTEX_BINDING_DESCRIPTION_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vertexBindingDescriptionCount"));
        P_VERTEX_BINDING_DESCRIPTIONS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pVertexBindingDescriptions"));
        VERTEX_ATTRIBUTE_DESCRIPTION_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("vertexAttributeDescriptionCount"));
        P_VERTEX_ATTRIBUTE_DESCRIPTIONS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pVertexAttributeDescriptions"));
        //@formatter:on
    }

    public VkPipelineVertexInputStateCreateInfo() {
        this(Arena.ofAuto());
    }
    
    public VkPipelineVertexInputStateCreateInfo(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkPipelineVertexInputStateCreateInfo(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkPipelineVertexInputStateCreateInfo sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPipelineVertexInputStateCreateInfo pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #flags()
    public VkPipelineVertexInputStateCreateInfo flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #vertexBindingDescriptionCount()
    public VkPipelineVertexInputStateCreateInfo vertexBindingDescriptionCount(int vertexBindingDescriptionCount) {
    	VERTEX_BINDING_DESCRIPTION_COUNT_HANDLE.set(segment, 0L, vertexBindingDescriptionCount);
    	return this;
    }
    
    public int vertexBindingDescriptionCount() {
    	return (int) VERTEX_BINDING_DESCRIPTION_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pVertexBindingDescriptions()
    public VkPipelineVertexInputStateCreateInfo pVertexBindingDescriptions(NativeStructArray<VkVertexInputBindingDescription> pVertexBindingDescriptions) {
    	P_VERTEX_BINDING_DESCRIPTIONS_HANDLE.set(segment, 0L, pVertexBindingDescriptions.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkVertexInputBindingDescription> pVertexBindingDescriptions() {
    	MemorySegment segment = (MemorySegment) P_VERTEX_BINDING_DESCRIPTIONS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkVertexInputBindingDescription.array(segment);
    }
    
    /// @see #vertexAttributeDescriptionCount()
    public VkPipelineVertexInputStateCreateInfo vertexAttributeDescriptionCount(int vertexAttributeDescriptionCount) {
    	VERTEX_ATTRIBUTE_DESCRIPTION_COUNT_HANDLE.set(segment, 0L, vertexAttributeDescriptionCount);
    	return this;
    }
    
    public int vertexAttributeDescriptionCount() {
    	return (int) VERTEX_ATTRIBUTE_DESCRIPTION_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pVertexAttributeDescriptions()
    public VkPipelineVertexInputStateCreateInfo pVertexAttributeDescriptions(NativeStructArray<VkVertexInputAttributeDescription> pVertexAttributeDescriptions) {
    	P_VERTEX_ATTRIBUTE_DESCRIPTIONS_HANDLE.set(segment, 0L, pVertexAttributeDescriptions.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkVertexInputAttributeDescription> pVertexAttributeDescriptions() {
    	MemorySegment segment = (MemorySegment) P_VERTEX_ATTRIBUTE_DESCRIPTIONS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkVertexInputAttributeDescription.array(segment);
    }
    
    @Override
    public VkPipelineVertexInputStateCreateInfo set(VkPipelineVertexInputStateCreateInfo other) {
        return set(other.segment);
    }
    
    @Override
    public VkPipelineVertexInputStateCreateInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPipelineVertexInputStateCreateInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPipelineVertexInputStateCreateInfo> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPipelineVertexInputStateCreateInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPipelineVertexInputStateCreateInfo> array(Arena arena, VkPipelineVertexInputStateCreateInfo... structs) {
        NativeStructArray<VkPipelineVertexInputStateCreateInfo> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPipelineVertexInputStateCreateInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPipelineVertexInputStateCreateInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPipelineVertexInputStateCreateInfo(segment)
        );
    }
    
}