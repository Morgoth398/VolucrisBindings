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

public final class VkFramebufferAttachmentsCreateInfo
		implements Struct<VkFramebufferAttachmentsCreateInfo> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle ATTACHMENT_IMAGE_INFO_COUNT_HANDLE;
	public static final VarHandle P_ATTACHMENT_IMAGE_INFOS_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long ATTACHMENT_IMAGE_INFO_COUNT_BYTE_OFFSET;
	public static final long P_ATTACHMENT_IMAGE_INFOS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("attachmentImageInfoCount"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pAttachmentImageInfos")
		).withName("VkFramebufferAttachmentsCreateInfo").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		ATTACHMENT_IMAGE_INFO_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("attachmentImageInfoCount"));
		P_ATTACHMENT_IMAGE_INFOS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pAttachmentImageInfos"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		ATTACHMENT_IMAGE_INFO_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("attachmentImageInfoCount"));
		P_ATTACHMENT_IMAGE_INFOS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pAttachmentImageInfos"));
		//@formatter:on
	}

	public VkFramebufferAttachmentsCreateInfo() {
	    this(Arena.ofAuto());
	}
	
	public VkFramebufferAttachmentsCreateInfo(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkFramebufferAttachmentsCreateInfo(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkFramebufferAttachmentsCreateInfo sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkFramebufferAttachmentsCreateInfo pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #attachmentImageInfoCount()
    public VkFramebufferAttachmentsCreateInfo attachmentImageInfoCount(int attachmentImageInfoCount) {
    	ATTACHMENT_IMAGE_INFO_COUNT_HANDLE.set(segment, 0L, attachmentImageInfoCount);
    	return this;
    }
    
    public int attachmentImageInfoCount() {
    	return (int) ATTACHMENT_IMAGE_INFO_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pAttachmentImageInfos()
    public VkFramebufferAttachmentsCreateInfo pAttachmentImageInfos(NativeStructArray<VkFramebufferAttachmentImageInfo> pAttachmentImageInfos) {
    	P_ATTACHMENT_IMAGE_INFOS_HANDLE.set(segment, 0L, pAttachmentImageInfos.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkFramebufferAttachmentImageInfo> pAttachmentImageInfos() {
    	MemorySegment segment = (MemorySegment) P_ATTACHMENT_IMAGE_INFOS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkFramebufferAttachmentImageInfo.array(segment);
    }
    
    @Override
    public VkFramebufferAttachmentsCreateInfo set(VkFramebufferAttachmentsCreateInfo other) {
        return set(other.segment);
    }
    
    @Override
    public VkFramebufferAttachmentsCreateInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkFramebufferAttachmentsCreateInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkFramebufferAttachmentsCreateInfo> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkFramebufferAttachmentsCreateInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<VkFramebufferAttachmentsCreateInfo> array(Arena arena, VkFramebufferAttachmentsCreateInfo... structs) {
        NativeStructArray<VkFramebufferAttachmentsCreateInfo> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkFramebufferAttachmentsCreateInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkFramebufferAttachmentsCreateInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkFramebufferAttachmentsCreateInfo(segment)
        );
    }

}