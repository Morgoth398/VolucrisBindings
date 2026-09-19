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

public final class VkFramebufferCreateInfo
		implements Struct<VkFramebufferCreateInfo> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle FLAGS_HANDLE;
    public static final VarHandle RENDER_PASS_HANDLE;
    public static final VarHandle ATTACHMENT_COUNT_HANDLE;
    public static final VarHandle P_ATTACHMENTS_HANDLE;
    public static final VarHandle WIDTH_HANDLE;
    public static final VarHandle HEIGHT_HANDLE;
    public static final VarHandle LAYERS_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long FLAGS_BYTE_OFFSET;
    public static final long RENDER_PASS_BYTE_OFFSET;
    public static final long ATTACHMENT_COUNT_BYTE_OFFSET;
    public static final long P_ATTACHMENTS_BYTE_OFFSET;
    public static final long WIDTH_BYTE_OFFSET;
    public static final long HEIGHT_BYTE_OFFSET;
    public static final long LAYERS_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("flags"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("renderPass"),
            JAVA_INT.withName("attachmentCount"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pAttachments"),
            JAVA_INT.withName("width"),
            JAVA_INT.withName("height"),
            JAVA_INT.withName("layers"),
            MemoryLayout.paddingLayout(4)
        ).withName("VkFramebufferCreateInfo").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
        RENDER_PASS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("renderPass"));
        ATTACHMENT_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("attachmentCount"));
        P_ATTACHMENTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pAttachments"));
        WIDTH_HANDLE = LAYOUT.varHandle(PathElement.groupElement("width"));
        HEIGHT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("height"));
        LAYERS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("layers"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
        RENDER_PASS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("renderPass"));
        ATTACHMENT_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("attachmentCount"));
        P_ATTACHMENTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pAttachments"));
        WIDTH_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("width"));
        HEIGHT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("height"));
        LAYERS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("layers"));
        //@formatter:on
    }

    public VkFramebufferCreateInfo() {
        this(Arena.ofAuto());
    }
    
    public VkFramebufferCreateInfo(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkFramebufferCreateInfo(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkFramebufferCreateInfo sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkFramebufferCreateInfo pNext(MemorySegment pNext) {
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
    public VkFramebufferCreateInfo flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #renderPass()
    public VkFramebufferCreateInfo renderPass(VkRenderPass renderPass) {
    	RENDER_PASS_HANDLE.set(segment, 0L, renderPass.memorySegment());
    	return this;
    }
    
    public @Nullable VkRenderPass renderPass() {
    	MemorySegment segment = (MemorySegment) RENDER_PASS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkRenderPass(segment);
    }
    
    /// @see #attachmentCount()
    public VkFramebufferCreateInfo attachmentCount(int attachmentCount) {
    	ATTACHMENT_COUNT_HANDLE.set(segment, 0L, attachmentCount);
    	return this;
    }
    
    public int attachmentCount() {
    	return (int) ATTACHMENT_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pAttachments()
    public VkFramebufferCreateInfo pAttachments(NativePointerArray pAttachments) {
    	P_ATTACHMENTS_HANDLE.set(segment, 0L, pAttachments.memorySegment());
    	return this;
    }
    
    public @Nullable NativePointerArray pAttachments() {
    	MemorySegment segment = (MemorySegment) P_ATTACHMENTS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativePointerArray(segment);
    }
    
    /// @see #width()
    public VkFramebufferCreateInfo width(int width) {
    	WIDTH_HANDLE.set(segment, 0L, width);
    	return this;
    }
    
    public int width() {
    	return (int) WIDTH_HANDLE.get(segment, 0L);
    }
    
    /// @see #height()
    public VkFramebufferCreateInfo height(int height) {
    	HEIGHT_HANDLE.set(segment, 0L, height);
    	return this;
    }
    
    public int height() {
    	return (int) HEIGHT_HANDLE.get(segment, 0L);
    }
    
    /// @see #layers()
    public VkFramebufferCreateInfo layers(int layers) {
    	LAYERS_HANDLE.set(segment, 0L, layers);
    	return this;
    }
    
    public int layers() {
    	return (int) LAYERS_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkFramebufferCreateInfo set(VkFramebufferCreateInfo other) {
        return set(other.segment);
    }
    
    @Override
    public VkFramebufferCreateInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkFramebufferCreateInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkFramebufferCreateInfo> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkFramebufferCreateInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<VkFramebufferCreateInfo> array(Arena arena, VkFramebufferCreateInfo... structs) {
        NativeStructArray<VkFramebufferCreateInfo> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkFramebufferCreateInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkFramebufferCreateInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkFramebufferCreateInfo(segment)
        );
    }
    
}