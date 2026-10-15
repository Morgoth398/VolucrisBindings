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

public final class VkGraphicsPipelineCreateInfo
		implements Struct<VkGraphicsPipelineCreateInfo> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle FLAGS_HANDLE;
	public static final VarHandle STAGE_COUNT_HANDLE;
	public static final VarHandle P_STAGES_HANDLE;
	public static final VarHandle P_VERTEX_INPUT_STATE_HANDLE;
	public static final VarHandle P_INPUT_ASSEMBLY_STATE_HANDLE;
	public static final VarHandle P_TESSELLATION_STATE_HANDLE;
	public static final VarHandle P_VIEWPORT_STATE_HANDLE;
	public static final VarHandle P_RASTERIZATION_STATE_HANDLE;
	public static final VarHandle P_MULTISAMPLE_STATE_HANDLE;
	public static final VarHandle P_DEPTH_STENCIL_STATE_HANDLE;
	public static final VarHandle P_COLOR_BLEND_STATE_HANDLE;
	public static final VarHandle P_DYNAMIC_STATE_HANDLE;
	public static final VarHandle LAYOUT_HANDLE;
	public static final VarHandle RENDER_PASS_HANDLE;
	public static final VarHandle SUBPASS_HANDLE;
	public static final VarHandle BASE_PIPELINE_HANDLE_HANDLE;
	public static final VarHandle BASE_PIPELINE_INDEX_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long FLAGS_BYTE_OFFSET;
	public static final long STAGE_COUNT_BYTE_OFFSET;
	public static final long P_STAGES_BYTE_OFFSET;
	public static final long P_VERTEX_INPUT_STATE_BYTE_OFFSET;
	public static final long P_INPUT_ASSEMBLY_STATE_BYTE_OFFSET;
	public static final long P_TESSELLATION_STATE_BYTE_OFFSET;
	public static final long P_VIEWPORT_STATE_BYTE_OFFSET;
	public static final long P_RASTERIZATION_STATE_BYTE_OFFSET;
	public static final long P_MULTISAMPLE_STATE_BYTE_OFFSET;
	public static final long P_DEPTH_STENCIL_STATE_BYTE_OFFSET;
	public static final long P_COLOR_BLEND_STATE_BYTE_OFFSET;
	public static final long P_DYNAMIC_STATE_BYTE_OFFSET;
	public static final long LAYOUT_BYTE_OFFSET;
	public static final long RENDER_PASS_BYTE_OFFSET;
	public static final long SUBPASS_BYTE_OFFSET;
	public static final long BASE_PIPELINE_HANDLE_BYTE_OFFSET;
	public static final long BASE_PIPELINE_INDEX_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("flags"),
		    JAVA_INT.withName("stageCount"),
		    UNBOUNDED_ADDRESS.withName("pStages"),
		    UNBOUNDED_ADDRESS.withName("pVertexInputState"),
		    UNBOUNDED_ADDRESS.withName("pInputAssemblyState"),
		    UNBOUNDED_ADDRESS.withName("pTessellationState"),
		    UNBOUNDED_ADDRESS.withName("pViewportState"),
		    UNBOUNDED_ADDRESS.withName("pRasterizationState"),
		    UNBOUNDED_ADDRESS.withName("pMultisampleState"),
		    UNBOUNDED_ADDRESS.withName("pDepthStencilState"),
		    UNBOUNDED_ADDRESS.withName("pColorBlendState"),
		    UNBOUNDED_ADDRESS.withName("pDynamicState"),
		    UNBOUNDED_ADDRESS.withName("layout"),
		    UNBOUNDED_ADDRESS.withName("renderPass"),
		    JAVA_INT.withName("subpass"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("basePipelineHandle"),
		    JAVA_INT.withName("basePipelineIndex"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkGraphicsPipelineCreateInfo").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
		STAGE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("stageCount"));
		P_STAGES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pStages"));
		P_VERTEX_INPUT_STATE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pVertexInputState"));
		P_INPUT_ASSEMBLY_STATE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pInputAssemblyState"));
		P_TESSELLATION_STATE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pTessellationState"));
		P_VIEWPORT_STATE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pViewportState"));
		P_RASTERIZATION_STATE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pRasterizationState"));
		P_MULTISAMPLE_STATE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pMultisampleState"));
		P_DEPTH_STENCIL_STATE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pDepthStencilState"));
		P_COLOR_BLEND_STATE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pColorBlendState"));
		P_DYNAMIC_STATE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pDynamicState"));
		LAYOUT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("layout"));
		RENDER_PASS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("renderPass"));
		SUBPASS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("subpass"));
		BASE_PIPELINE_HANDLE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("basePipelineHandle"));
		BASE_PIPELINE_INDEX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("basePipelineIndex"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
		STAGE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("stageCount"));
		P_STAGES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pStages"));
		P_VERTEX_INPUT_STATE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pVertexInputState"));
		P_INPUT_ASSEMBLY_STATE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pInputAssemblyState"));
		P_TESSELLATION_STATE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pTessellationState"));
		P_VIEWPORT_STATE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pViewportState"));
		P_RASTERIZATION_STATE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pRasterizationState"));
		P_MULTISAMPLE_STATE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pMultisampleState"));
		P_DEPTH_STENCIL_STATE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pDepthStencilState"));
		P_COLOR_BLEND_STATE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pColorBlendState"));
		P_DYNAMIC_STATE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pDynamicState"));
		LAYOUT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("layout"));
		RENDER_PASS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("renderPass"));
		SUBPASS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("subpass"));
		BASE_PIPELINE_HANDLE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("basePipelineHandle"));
		BASE_PIPELINE_INDEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("basePipelineIndex"));
		//@formatter:on
	}

	public VkGraphicsPipelineCreateInfo() {
	    this(Arena.ofAuto());
	}
	
	public VkGraphicsPipelineCreateInfo(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkGraphicsPipelineCreateInfo(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkGraphicsPipelineCreateInfo sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkGraphicsPipelineCreateInfo pNext(MemorySegment pNext) {
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
    public VkGraphicsPipelineCreateInfo flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #stageCount()
    public VkGraphicsPipelineCreateInfo stageCount(int stageCount) {
    	STAGE_COUNT_HANDLE.set(segment, 0L, stageCount);
    	return this;
    }
    
    public int stageCount() {
    	return (int) STAGE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pStages()
    public VkGraphicsPipelineCreateInfo pStages(NativeStructArray<VkPipelineShaderStageCreateInfo> pStages) {
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
    public VkGraphicsPipelineCreateInfo pVertexInputState(VkPipelineVertexInputStateCreateInfo pVertexInputState) {
    	P_VERTEX_INPUT_STATE_HANDLE.set(segment, 0L, pVertexInputState.memorySegment());
    	return this;
    }
    
    public @Nullable VkPipelineVertexInputStateCreateInfo pVertexInputState() {
    	MemorySegment segment = (MemorySegment) P_VERTEX_INPUT_STATE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkPipelineVertexInputStateCreateInfo(segment);
    }
    
    /// @see #pInputAssemblyState()
    public VkGraphicsPipelineCreateInfo pInputAssemblyState(VkPipelineInputAssemblyStateCreateInfo pInputAssemblyState) {
    	P_INPUT_ASSEMBLY_STATE_HANDLE.set(segment, 0L, pInputAssemblyState.memorySegment());
    	return this;
    }
    
    public @Nullable VkPipelineInputAssemblyStateCreateInfo pInputAssemblyState() {
    	MemorySegment segment = (MemorySegment) P_INPUT_ASSEMBLY_STATE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkPipelineInputAssemblyStateCreateInfo(segment);
    }
    
    /// @see #pTessellationState()
    public VkGraphicsPipelineCreateInfo pTessellationState(VkPipelineTessellationStateCreateInfo pTessellationState) {
    	P_TESSELLATION_STATE_HANDLE.set(segment, 0L, pTessellationState.memorySegment());
    	return this;
    }
    
    public @Nullable VkPipelineTessellationStateCreateInfo pTessellationState() {
    	MemorySegment segment = (MemorySegment) P_TESSELLATION_STATE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkPipelineTessellationStateCreateInfo(segment);
    }
    
    /// @see #pViewportState()
    public VkGraphicsPipelineCreateInfo pViewportState(VkPipelineViewportStateCreateInfo pViewportState) {
    	P_VIEWPORT_STATE_HANDLE.set(segment, 0L, pViewportState.memorySegment());
    	return this;
    }
    
    public @Nullable VkPipelineViewportStateCreateInfo pViewportState() {
    	MemorySegment segment = (MemorySegment) P_VIEWPORT_STATE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkPipelineViewportStateCreateInfo(segment);
    }
    
    /// @see #pRasterizationState()
    public VkGraphicsPipelineCreateInfo pRasterizationState(VkPipelineRasterizationStateCreateInfo pRasterizationState) {
    	P_RASTERIZATION_STATE_HANDLE.set(segment, 0L, pRasterizationState.memorySegment());
    	return this;
    }
    
    public @Nullable VkPipelineRasterizationStateCreateInfo pRasterizationState() {
    	MemorySegment segment = (MemorySegment) P_RASTERIZATION_STATE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkPipelineRasterizationStateCreateInfo(segment);
    }
    
    /// @see #pMultisampleState()
    public VkGraphicsPipelineCreateInfo pMultisampleState(VkPipelineMultisampleStateCreateInfo pMultisampleState) {
    	P_MULTISAMPLE_STATE_HANDLE.set(segment, 0L, pMultisampleState.memorySegment());
    	return this;
    }
    
    public @Nullable VkPipelineMultisampleStateCreateInfo pMultisampleState() {
    	MemorySegment segment = (MemorySegment) P_MULTISAMPLE_STATE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkPipelineMultisampleStateCreateInfo(segment);
    }
    
    /// @see #pDepthStencilState()
    public VkGraphicsPipelineCreateInfo pDepthStencilState(VkPipelineDepthStencilStateCreateInfo pDepthStencilState) {
    	P_DEPTH_STENCIL_STATE_HANDLE.set(segment, 0L, pDepthStencilState.memorySegment());
    	return this;
    }
    
    public @Nullable VkPipelineDepthStencilStateCreateInfo pDepthStencilState() {
    	MemorySegment segment = (MemorySegment) P_DEPTH_STENCIL_STATE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkPipelineDepthStencilStateCreateInfo(segment);
    }
    
    /// @see #pColorBlendState()
    public VkGraphicsPipelineCreateInfo pColorBlendState(VkPipelineColorBlendStateCreateInfo pColorBlendState) {
    	P_COLOR_BLEND_STATE_HANDLE.set(segment, 0L, pColorBlendState.memorySegment());
    	return this;
    }
    
    public @Nullable VkPipelineColorBlendStateCreateInfo pColorBlendState() {
    	MemorySegment segment = (MemorySegment) P_COLOR_BLEND_STATE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkPipelineColorBlendStateCreateInfo(segment);
    }
    
    /// @see #pDynamicState()
    public VkGraphicsPipelineCreateInfo pDynamicState(VkPipelineDynamicStateCreateInfo pDynamicState) {
    	P_DYNAMIC_STATE_HANDLE.set(segment, 0L, pDynamicState.memorySegment());
    	return this;
    }
    
    public @Nullable VkPipelineDynamicStateCreateInfo pDynamicState() {
    	MemorySegment segment = (MemorySegment) P_DYNAMIC_STATE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkPipelineDynamicStateCreateInfo(segment);
    }
    
    /// @see #layout()
    public VkGraphicsPipelineCreateInfo layout(VkPipelineLayout layout) {
    	LAYOUT_HANDLE.set(segment, 0L, layout.memorySegment());
    	return this;
    }
    
    public @Nullable VkPipelineLayout layout() {
    	MemorySegment segment = (MemorySegment) LAYOUT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkPipelineLayout(segment);
    }
    
    /// @see #renderPass()
    public VkGraphicsPipelineCreateInfo renderPass(VkRenderPass renderPass) {
    	RENDER_PASS_HANDLE.set(segment, 0L, renderPass.memorySegment());
    	return this;
    }
    
    public @Nullable VkRenderPass renderPass() {
    	MemorySegment segment = (MemorySegment) RENDER_PASS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkRenderPass(segment);
    }
    
    /// @see #subpass()
    public VkGraphicsPipelineCreateInfo subpass(int subpass) {
    	SUBPASS_HANDLE.set(segment, 0L, subpass);
    	return this;
    }
    
    public int subpass() {
    	return (int) SUBPASS_HANDLE.get(segment, 0L);
    }
    
    /// @see #basePipelineHandle()
    public VkGraphicsPipelineCreateInfo basePipelineHandle(VkPipeline basePipelineHandle) {
    	BASE_PIPELINE_HANDLE_HANDLE.set(segment, 0L, basePipelineHandle.memorySegment());
    	return this;
    }
    
    public @Nullable VkPipeline basePipelineHandle() {
    	MemorySegment segment = (MemorySegment) BASE_PIPELINE_HANDLE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkPipeline(segment);
    }
    
    /// @see #basePipelineIndex()
    public VkGraphicsPipelineCreateInfo basePipelineIndex(int basePipelineIndex) {
    	BASE_PIPELINE_INDEX_HANDLE.set(segment, 0L, basePipelineIndex);
    	return this;
    }
    
    public int basePipelineIndex() {
    	return (int) BASE_PIPELINE_INDEX_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkGraphicsPipelineCreateInfo set(VkGraphicsPipelineCreateInfo other) {
        return set(other.segment);
    }
    
    @Override
    public VkGraphicsPipelineCreateInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkGraphicsPipelineCreateInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkGraphicsPipelineCreateInfo> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkGraphicsPipelineCreateInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<VkGraphicsPipelineCreateInfo> array(Arena arena, VkGraphicsPipelineCreateInfo... structs) {
        NativeStructArray<VkGraphicsPipelineCreateInfo> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkGraphicsPipelineCreateInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkGraphicsPipelineCreateInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkGraphicsPipelineCreateInfo(segment)
        );
    }

}