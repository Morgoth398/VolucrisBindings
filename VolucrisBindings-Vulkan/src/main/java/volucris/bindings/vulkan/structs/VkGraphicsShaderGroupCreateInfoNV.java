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

public final class VkGraphicsShaderGroupCreateInfoNV
		implements Struct<VkGraphicsShaderGroupCreateInfoNV> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle STAGE_COUNT_HANDLE;
    public static final VarHandle P_STAGES_HANDLE;
    public static final VarHandle P_VERTEX_INPUT_STATE_HANDLE;
    public static final VarHandle P_TESSELLATION_STATE_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long STAGE_COUNT_BYTE_OFFSET;
    public static final long P_STAGES_BYTE_OFFSET;
    public static final long P_VERTEX_INPUT_STATE_BYTE_OFFSET;
    public static final long P_TESSELLATION_STATE_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("stageCount"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pStages"),
            UNBOUNDED_ADDRESS.withName("pVertexInputState"),
            UNBOUNDED_ADDRESS.withName("pTessellationState")
        ).withName("VkGraphicsShaderGroupCreateInfoNV").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        STAGE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("stageCount"));
        P_STAGES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pStages"));
        P_VERTEX_INPUT_STATE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pVertexInputState"));
        P_TESSELLATION_STATE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pTessellationState"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        STAGE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("stageCount"));
        P_STAGES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pStages"));
        P_VERTEX_INPUT_STATE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pVertexInputState"));
        P_TESSELLATION_STATE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pTessellationState"));
        //@formatter:on
    }

    public VkGraphicsShaderGroupCreateInfoNV() {
        this(Arena.ofAuto());
    }
    
    public VkGraphicsShaderGroupCreateInfoNV(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkGraphicsShaderGroupCreateInfoNV(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkGraphicsShaderGroupCreateInfoNV sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkGraphicsShaderGroupCreateInfoNV pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #stageCount()
    public VkGraphicsShaderGroupCreateInfoNV stageCount(int stageCount) {
    	STAGE_COUNT_HANDLE.set(segment, 0L, stageCount);
    	return this;
    }
    
    public int stageCount() {
    	return (int) STAGE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pStages()
    public VkGraphicsShaderGroupCreateInfoNV pStages(NativeStructArray<VkPipelineShaderStageCreateInfo> pStages) {
    	P_STAGES_HANDLE.set(segment, 0L, pStages.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkPipelineShaderStageCreateInfo> pStages() {
    	MemorySegment segment = (MemorySegment) P_STAGES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkPipelineShaderStageCreateInfo.array(segment);
    }
    
    /// @see #pVertexInputState()
    public VkGraphicsShaderGroupCreateInfoNV pVertexInputState(VkPipelineVertexInputStateCreateInfo pVertexInputState) {
    	P_VERTEX_INPUT_STATE_HANDLE.set(segment, 0L, pVertexInputState.memorySegment());
    	return this;
    }
    
    public @Nullable VkPipelineVertexInputStateCreateInfo pVertexInputState() {
    	MemorySegment segment = (MemorySegment) P_VERTEX_INPUT_STATE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkPipelineVertexInputStateCreateInfo(segment);
    }
    
    /// @see #pTessellationState()
    public VkGraphicsShaderGroupCreateInfoNV pTessellationState(VkPipelineTessellationStateCreateInfo pTessellationState) {
    	P_TESSELLATION_STATE_HANDLE.set(segment, 0L, pTessellationState.memorySegment());
    	return this;
    }
    
    public @Nullable VkPipelineTessellationStateCreateInfo pTessellationState() {
    	MemorySegment segment = (MemorySegment) P_TESSELLATION_STATE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkPipelineTessellationStateCreateInfo(segment);
    }
    
    @Override
    public VkGraphicsShaderGroupCreateInfoNV set(VkGraphicsShaderGroupCreateInfoNV other) {
        return set(other.segment);
    }
    
    @Override
    public VkGraphicsShaderGroupCreateInfoNV set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkGraphicsShaderGroupCreateInfoNV> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkGraphicsShaderGroupCreateInfoNV> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkGraphicsShaderGroupCreateInfoNV(segment),
            count
        );
    }
    
    public static NativeStructArray<VkGraphicsShaderGroupCreateInfoNV> array(Arena arena, VkGraphicsShaderGroupCreateInfoNV... structs) {
        NativeStructArray<VkGraphicsShaderGroupCreateInfoNV> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkGraphicsShaderGroupCreateInfoNV(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkGraphicsShaderGroupCreateInfoNV> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkGraphicsShaderGroupCreateInfoNV(segment)
        );
    }
    
}