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

public final class VkCommandBufferInheritanceInfo
		implements Struct<VkCommandBufferInheritanceInfo> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle RENDER_PASS_HANDLE;
    public static final VarHandle SUBPASS_HANDLE;
    public static final VarHandle FRAMEBUFFER_HANDLE;
    public static final VarHandle OCCLUSION_QUERY_ENABLE_HANDLE;
    public static final VarHandle QUERY_FLAGS_HANDLE;
    public static final VarHandle PIPELINE_STATISTICS_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long RENDER_PASS_BYTE_OFFSET;
    public static final long SUBPASS_BYTE_OFFSET;
    public static final long FRAMEBUFFER_BYTE_OFFSET;
    public static final long OCCLUSION_QUERY_ENABLE_BYTE_OFFSET;
    public static final long QUERY_FLAGS_BYTE_OFFSET;
    public static final long PIPELINE_STATISTICS_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            UNBOUNDED_ADDRESS.withName("renderPass"),
            JAVA_INT.withName("subpass"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("framebuffer"),
            JAVA_INT.withName("occlusionQueryEnable"),
            JAVA_INT.withName("queryFlags"),
            JAVA_INT.withName("pipelineStatistics"),
            MemoryLayout.paddingLayout(4)
        ).withName("VkCommandBufferInheritanceInfo").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        RENDER_PASS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("renderPass"));
        SUBPASS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("subpass"));
        FRAMEBUFFER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("framebuffer"));
        OCCLUSION_QUERY_ENABLE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("occlusionQueryEnable"));
        QUERY_FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("queryFlags"));
        PIPELINE_STATISTICS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pipelineStatistics"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        RENDER_PASS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("renderPass"));
        SUBPASS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("subpass"));
        FRAMEBUFFER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("framebuffer"));
        OCCLUSION_QUERY_ENABLE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("occlusionQueryEnable"));
        QUERY_FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("queryFlags"));
        PIPELINE_STATISTICS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pipelineStatistics"));
        //@formatter:on
    }

    public VkCommandBufferInheritanceInfo() {
        this(Arena.ofAuto());
    }
    
    public VkCommandBufferInheritanceInfo(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkCommandBufferInheritanceInfo(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkCommandBufferInheritanceInfo sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkCommandBufferInheritanceInfo pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #renderPass()
    public VkCommandBufferInheritanceInfo renderPass(VkRenderPass renderPass) {
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
    public VkCommandBufferInheritanceInfo subpass(int subpass) {
    	SUBPASS_HANDLE.set(segment, 0L, subpass);
    	return this;
    }
    
    public int subpass() {
    	return (int) SUBPASS_HANDLE.get(segment, 0L);
    }
    
    /// @see #framebuffer()
    public VkCommandBufferInheritanceInfo framebuffer(VkFramebuffer framebuffer) {
    	FRAMEBUFFER_HANDLE.set(segment, 0L, framebuffer.memorySegment());
    	return this;
    }
    
    public @Nullable VkFramebuffer framebuffer() {
    	MemorySegment segment = (MemorySegment) FRAMEBUFFER_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkFramebuffer(segment);
    }
    
    /// @see #occlusionQueryEnable()
    public VkCommandBufferInheritanceInfo occlusionQueryEnable(int occlusionQueryEnable) {
    	OCCLUSION_QUERY_ENABLE_HANDLE.set(segment, 0L, occlusionQueryEnable);
    	return this;
    }
    
    public int occlusionQueryEnable() {
    	return (int) OCCLUSION_QUERY_ENABLE_HANDLE.get(segment, 0L);
    }
    
    /// @see #queryFlags()
    public VkCommandBufferInheritanceInfo queryFlags(int queryFlags) {
    	QUERY_FLAGS_HANDLE.set(segment, 0L, queryFlags);
    	return this;
    }
    
    public int queryFlags() {
    	return (int) QUERY_FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #pipelineStatistics()
    public VkCommandBufferInheritanceInfo pipelineStatistics(int pipelineStatistics) {
    	PIPELINE_STATISTICS_HANDLE.set(segment, 0L, pipelineStatistics);
    	return this;
    }
    
    public int pipelineStatistics() {
    	return (int) PIPELINE_STATISTICS_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkCommandBufferInheritanceInfo set(VkCommandBufferInheritanceInfo other) {
        return set(other.segment);
    }
    
    @Override
    public VkCommandBufferInheritanceInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkCommandBufferInheritanceInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkCommandBufferInheritanceInfo> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkCommandBufferInheritanceInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<VkCommandBufferInheritanceInfo> array(Arena arena, VkCommandBufferInheritanceInfo... structs) {
        NativeStructArray<VkCommandBufferInheritanceInfo> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkCommandBufferInheritanceInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkCommandBufferInheritanceInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkCommandBufferInheritanceInfo(segment)
        );
    }
    
}