/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkRenderingInfo
		implements Struct<VkRenderingInfo> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle FLAGS_HANDLE;
    public static final VarHandle LAYER_COUNT_HANDLE;
    public static final VarHandle VIEW_MASK_HANDLE;
    public static final VarHandle COLOR_ATTACHMENT_COUNT_HANDLE;
    public static final VarHandle P_COLOR_ATTACHMENTS_HANDLE;
    public static final VarHandle P_DEPTH_ATTACHMENT_HANDLE;
    public static final VarHandle P_STENCIL_ATTACHMENT_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long FLAGS_BYTE_OFFSET;
    public static final long RENDER_AREA_BYTE_OFFSET;
    public static final long LAYER_COUNT_BYTE_OFFSET;
    public static final long VIEW_MASK_BYTE_OFFSET;
    public static final long COLOR_ATTACHMENT_COUNT_BYTE_OFFSET;
    public static final long P_COLOR_ATTACHMENTS_BYTE_OFFSET;
    public static final long P_DEPTH_ATTACHMENT_BYTE_OFFSET;
    public static final long P_STENCIL_ATTACHMENT_BYTE_OFFSET;

    private final MemorySegment segment;

    private final VkRect2D renderArea;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("flags"),
            VkRect2D.LAYOUT.withName("renderArea"),
            JAVA_INT.withName("layerCount"),
            JAVA_INT.withName("viewMask"),
            JAVA_INT.withName("colorAttachmentCount"),
            UNBOUNDED_ADDRESS.withName("pColorAttachments"),
            UNBOUNDED_ADDRESS.withName("pDepthAttachment"),
            UNBOUNDED_ADDRESS.withName("pStencilAttachment")
        ).withName("VkRenderingInfo").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
        LAYER_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("layerCount"));
        VIEW_MASK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("viewMask"));
        COLOR_ATTACHMENT_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("colorAttachmentCount"));
        P_COLOR_ATTACHMENTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pColorAttachments"));
        P_DEPTH_ATTACHMENT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pDepthAttachment"));
        P_STENCIL_ATTACHMENT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pStencilAttachment"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
        RENDER_AREA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("renderArea"));
        LAYER_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("layerCount"));
        VIEW_MASK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("viewMask"));
        COLOR_ATTACHMENT_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("colorAttachmentCount"));
        P_COLOR_ATTACHMENTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pColorAttachments"));
        P_DEPTH_ATTACHMENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pDepthAttachment"));
        P_STENCIL_ATTACHMENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pStencilAttachment"));
        //@formatter:on
    }

    public VkRenderingInfo() {
        this(Arena.ofAuto());
    }
    
    public VkRenderingInfo(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkRenderingInfo(MemorySegment segment) {
        this.segment = segment;
    
        renderArea = new VkRect2D(segment.asSlice(RENDER_AREA_BYTE_OFFSET, VkRect2D.LAYOUT));
    }

    /// @see #sType()
    public VkRenderingInfo sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkRenderingInfo pNext(MemorySegment pNext) {
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
    public VkRenderingInfo flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #layerCount()
    public VkRenderingInfo layerCount(int layerCount) {
    	LAYER_COUNT_HANDLE.set(segment, 0L, layerCount);
    	return this;
    }
    
    public int layerCount() {
    	return (int) LAYER_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #viewMask()
    public VkRenderingInfo viewMask(int viewMask) {
    	VIEW_MASK_HANDLE.set(segment, 0L, viewMask);
    	return this;
    }
    
    public int viewMask() {
    	return (int) VIEW_MASK_HANDLE.get(segment, 0L);
    }
    
    /// @see #colorAttachmentCount()
    public VkRenderingInfo colorAttachmentCount(int colorAttachmentCount) {
    	COLOR_ATTACHMENT_COUNT_HANDLE.set(segment, 0L, colorAttachmentCount);
    	return this;
    }
    
    public int colorAttachmentCount() {
    	return (int) COLOR_ATTACHMENT_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pColorAttachments()
    public VkRenderingInfo pColorAttachments(NativeStructArray<VkRenderingAttachmentInfo> pColorAttachments) {
    	P_COLOR_ATTACHMENTS_HANDLE.set(segment, 0L, pColorAttachments.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkRenderingAttachmentInfo> pColorAttachments() {
    	MemorySegment segment = (MemorySegment) P_COLOR_ATTACHMENTS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkRenderingAttachmentInfo.array(segment);
    }
    
    /// @see #pDepthAttachment()
    public VkRenderingInfo pDepthAttachment(VkRenderingAttachmentInfo pDepthAttachment) {
    	P_DEPTH_ATTACHMENT_HANDLE.set(segment, 0L, pDepthAttachment.memorySegment());
    	return this;
    }
    
    public @Nullable VkRenderingAttachmentInfo pDepthAttachment() {
    	MemorySegment segment = (MemorySegment) P_DEPTH_ATTACHMENT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkRenderingAttachmentInfo(segment);
    }
    
    /// @see #pStencilAttachment()
    public VkRenderingInfo pStencilAttachment(VkRenderingAttachmentInfo pStencilAttachment) {
    	P_STENCIL_ATTACHMENT_HANDLE.set(segment, 0L, pStencilAttachment.memorySegment());
    	return this;
    }
    
    public @Nullable VkRenderingAttachmentInfo pStencilAttachment() {
    	MemorySegment segment = (MemorySegment) P_STENCIL_ATTACHMENT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkRenderingAttachmentInfo(segment);
    }
    
    /// @see #renderArea()
    public VkRenderingInfo renderArea(Consumer<VkRect2D> consumer) {
    	consumer.accept(renderArea);
    	return this;
    }
    
    /// @see #renderArea()
    public VkRenderingInfo renderArea(VkRect2D other) {
    	renderArea.set(other);
    	return this;
    }
    
    public VkRect2D renderArea() {
    	return renderArea;
    }
    
    @Override
    public VkRenderingInfo set(VkRenderingInfo other) {
        return set(other.segment);
    }
    
    @Override
    public VkRenderingInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkRenderingInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkRenderingInfo> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkRenderingInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<VkRenderingInfo> array(Arena arena, VkRenderingInfo... structs) {
        NativeStructArray<VkRenderingInfo> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkRenderingInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkRenderingInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkRenderingInfo(segment)
        );
    }
    
}