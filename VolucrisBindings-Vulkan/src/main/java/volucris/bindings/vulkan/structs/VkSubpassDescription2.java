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
import volucris.bindings.core.NativeIntArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkSubpassDescription2
		implements Struct<VkSubpassDescription2> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle FLAGS_HANDLE;
    public static final VarHandle PIPELINE_BIND_POINT_HANDLE;
    public static final VarHandle VIEW_MASK_HANDLE;
    public static final VarHandle INPUT_ATTACHMENT_COUNT_HANDLE;
    public static final VarHandle P_INPUT_ATTACHMENTS_HANDLE;
    public static final VarHandle COLOR_ATTACHMENT_COUNT_HANDLE;
    public static final VarHandle P_COLOR_ATTACHMENTS_HANDLE;
    public static final VarHandle P_RESOLVE_ATTACHMENTS_HANDLE;
    public static final VarHandle P_DEPTH_STENCIL_ATTACHMENT_HANDLE;
    public static final VarHandle PRESERVE_ATTACHMENT_COUNT_HANDLE;
    public static final VarHandle P_PRESERVE_ATTACHMENTS_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long FLAGS_BYTE_OFFSET;
    public static final long PIPELINE_BIND_POINT_BYTE_OFFSET;
    public static final long VIEW_MASK_BYTE_OFFSET;
    public static final long INPUT_ATTACHMENT_COUNT_BYTE_OFFSET;
    public static final long P_INPUT_ATTACHMENTS_BYTE_OFFSET;
    public static final long COLOR_ATTACHMENT_COUNT_BYTE_OFFSET;
    public static final long P_COLOR_ATTACHMENTS_BYTE_OFFSET;
    public static final long P_RESOLVE_ATTACHMENTS_BYTE_OFFSET;
    public static final long P_DEPTH_STENCIL_ATTACHMENT_BYTE_OFFSET;
    public static final long PRESERVE_ATTACHMENT_COUNT_BYTE_OFFSET;
    public static final long P_PRESERVE_ATTACHMENTS_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("flags"),
            JAVA_INT.withName("pipelineBindPoint"),
            JAVA_INT.withName("viewMask"),
            JAVA_INT.withName("inputAttachmentCount"),
            UNBOUNDED_ADDRESS.withName("pInputAttachments"),
            JAVA_INT.withName("colorAttachmentCount"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pColorAttachments"),
            UNBOUNDED_ADDRESS.withName("pResolveAttachments"),
            UNBOUNDED_ADDRESS.withName("pDepthStencilAttachment"),
            JAVA_INT.withName("preserveAttachmentCount"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pPreserveAttachments")
        ).withName("VkSubpassDescription2").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
        PIPELINE_BIND_POINT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pipelineBindPoint"));
        VIEW_MASK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("viewMask"));
        INPUT_ATTACHMENT_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("inputAttachmentCount"));
        P_INPUT_ATTACHMENTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pInputAttachments"));
        COLOR_ATTACHMENT_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("colorAttachmentCount"));
        P_COLOR_ATTACHMENTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pColorAttachments"));
        P_RESOLVE_ATTACHMENTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pResolveAttachments"));
        P_DEPTH_STENCIL_ATTACHMENT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pDepthStencilAttachment"));
        PRESERVE_ATTACHMENT_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("preserveAttachmentCount"));
        P_PRESERVE_ATTACHMENTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pPreserveAttachments"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
        PIPELINE_BIND_POINT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pipelineBindPoint"));
        VIEW_MASK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("viewMask"));
        INPUT_ATTACHMENT_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("inputAttachmentCount"));
        P_INPUT_ATTACHMENTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pInputAttachments"));
        COLOR_ATTACHMENT_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("colorAttachmentCount"));
        P_COLOR_ATTACHMENTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pColorAttachments"));
        P_RESOLVE_ATTACHMENTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pResolveAttachments"));
        P_DEPTH_STENCIL_ATTACHMENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pDepthStencilAttachment"));
        PRESERVE_ATTACHMENT_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("preserveAttachmentCount"));
        P_PRESERVE_ATTACHMENTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pPreserveAttachments"));
        //@formatter:on
    }

    public VkSubpassDescription2() {
        this(Arena.ofAuto());
    }
    
    public VkSubpassDescription2(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkSubpassDescription2(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkSubpassDescription2 sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkSubpassDescription2 pNext(MemorySegment pNext) {
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
    public VkSubpassDescription2 flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #pipelineBindPoint()
    public VkSubpassDescription2 pipelineBindPoint(int pipelineBindPoint) {
    	PIPELINE_BIND_POINT_HANDLE.set(segment, 0L, pipelineBindPoint);
    	return this;
    }
    
    public int pipelineBindPoint() {
    	return (int) PIPELINE_BIND_POINT_HANDLE.get(segment, 0L);
    }
    
    /// @see #viewMask()
    public VkSubpassDescription2 viewMask(int viewMask) {
    	VIEW_MASK_HANDLE.set(segment, 0L, viewMask);
    	return this;
    }
    
    public int viewMask() {
    	return (int) VIEW_MASK_HANDLE.get(segment, 0L);
    }
    
    /// @see #inputAttachmentCount()
    public VkSubpassDescription2 inputAttachmentCount(int inputAttachmentCount) {
    	INPUT_ATTACHMENT_COUNT_HANDLE.set(segment, 0L, inputAttachmentCount);
    	return this;
    }
    
    public int inputAttachmentCount() {
    	return (int) INPUT_ATTACHMENT_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pInputAttachments()
    public VkSubpassDescription2 pInputAttachments(NativeStructArray<VkAttachmentReference2> pInputAttachments) {
    	P_INPUT_ATTACHMENTS_HANDLE.set(segment, 0L, pInputAttachments.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkAttachmentReference2> pInputAttachments() {
    	MemorySegment segment = (MemorySegment) P_INPUT_ATTACHMENTS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkAttachmentReference2.array(segment);
    }
    
    /// @see #colorAttachmentCount()
    public VkSubpassDescription2 colorAttachmentCount(int colorAttachmentCount) {
    	COLOR_ATTACHMENT_COUNT_HANDLE.set(segment, 0L, colorAttachmentCount);
    	return this;
    }
    
    public int colorAttachmentCount() {
    	return (int) COLOR_ATTACHMENT_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pColorAttachments()
    public VkSubpassDescription2 pColorAttachments(NativeStructArray<VkAttachmentReference2> pColorAttachments) {
    	P_COLOR_ATTACHMENTS_HANDLE.set(segment, 0L, pColorAttachments.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkAttachmentReference2> pColorAttachments() {
    	MemorySegment segment = (MemorySegment) P_COLOR_ATTACHMENTS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkAttachmentReference2.array(segment);
    }
    
    /// @see #pResolveAttachments()
    public VkSubpassDescription2 pResolveAttachments(NativeStructArray<VkAttachmentReference2> pResolveAttachments) {
    	P_RESOLVE_ATTACHMENTS_HANDLE.set(segment, 0L, pResolveAttachments.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkAttachmentReference2> pResolveAttachments() {
    	MemorySegment segment = (MemorySegment) P_RESOLVE_ATTACHMENTS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkAttachmentReference2.array(segment);
    }
    
    /// @see #pDepthStencilAttachment()
    public VkSubpassDescription2 pDepthStencilAttachment(VkAttachmentReference2 pDepthStencilAttachment) {
    	P_DEPTH_STENCIL_ATTACHMENT_HANDLE.set(segment, 0L, pDepthStencilAttachment.memorySegment());
    	return this;
    }
    
    public @Nullable VkAttachmentReference2 pDepthStencilAttachment() {
    	MemorySegment segment = (MemorySegment) P_DEPTH_STENCIL_ATTACHMENT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkAttachmentReference2(segment);
    }
    
    /// @see #preserveAttachmentCount()
    public VkSubpassDescription2 preserveAttachmentCount(int preserveAttachmentCount) {
    	PRESERVE_ATTACHMENT_COUNT_HANDLE.set(segment, 0L, preserveAttachmentCount);
    	return this;
    }
    
    public int preserveAttachmentCount() {
    	return (int) PRESERVE_ATTACHMENT_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pPreserveAttachments()
    public VkSubpassDescription2 pPreserveAttachments(NativeIntArray pPreserveAttachments) {
    	P_PRESERVE_ATTACHMENTS_HANDLE.set(segment, 0L, pPreserveAttachments.memorySegment());
    	return this;
    }
    
    public @Nullable NativeIntArray pPreserveAttachments() {
    	MemorySegment segment = (MemorySegment) P_PRESERVE_ATTACHMENTS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeIntArray(segment);
    }
    
    @Override
    public VkSubpassDescription2 set(VkSubpassDescription2 other) {
        return set(other.segment);
    }
    
    @Override
    public VkSubpassDescription2 set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkSubpassDescription2> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkSubpassDescription2> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkSubpassDescription2(segment),
            count
        );
    }
    
    public static NativeStructArray<VkSubpassDescription2> array(Arena arena, VkSubpassDescription2... structs) {
        NativeStructArray<VkSubpassDescription2> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkSubpassDescription2(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkSubpassDescription2> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkSubpassDescription2(segment)
        );
    }
    
}