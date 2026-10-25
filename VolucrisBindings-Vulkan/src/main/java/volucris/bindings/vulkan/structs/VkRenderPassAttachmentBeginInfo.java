/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
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

public final class VkRenderPassAttachmentBeginInfo
		implements Struct<VkRenderPassAttachmentBeginInfo> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle ATTACHMENT_COUNT_HANDLE;
	public static final VarHandle P_ATTACHMENTS_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long ATTACHMENT_COUNT_BYTE_OFFSET;
	public static final long P_ATTACHMENTS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("attachmentCount"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pAttachments")
		).withName("VkRenderPassAttachmentBeginInfo").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		ATTACHMENT_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("attachmentCount"));
		P_ATTACHMENTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pAttachments"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		ATTACHMENT_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("attachmentCount"));
		P_ATTACHMENTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pAttachments"));
		//@formatter:on
	}

	public VkRenderPassAttachmentBeginInfo() {
	    this(Arena.ofAuto());
	}
	
	public VkRenderPassAttachmentBeginInfo(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkRenderPassAttachmentBeginInfo(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkRenderPassAttachmentBeginInfo sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkRenderPassAttachmentBeginInfo pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #attachmentCount()
    public VkRenderPassAttachmentBeginInfo attachmentCount(int attachmentCount) {
    	ATTACHMENT_COUNT_HANDLE.set(segment, 0L, attachmentCount);
    	return this;
    }
    
    public int attachmentCount() {
    	return (int) ATTACHMENT_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pAttachments()
    public VkRenderPassAttachmentBeginInfo pAttachments(NativePointerArray pAttachments) {
    	P_ATTACHMENTS_HANDLE.set(segment, 0L, pAttachments.memorySegment());
    	return this;
    }
    
    public @Nullable NativePointerArray pAttachments() {
    	MemorySegment segment = (MemorySegment) P_ATTACHMENTS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativePointerArray(segment);
    }
    
    @Override
    public VkRenderPassAttachmentBeginInfo set(VkRenderPassAttachmentBeginInfo other) {
        return set(other.segment);
    }
    
    @Override
    public VkRenderPassAttachmentBeginInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkRenderPassAttachmentBeginInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkRenderPassAttachmentBeginInfo> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkRenderPassAttachmentBeginInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<VkRenderPassAttachmentBeginInfo> array(SegmentAllocator allocator, VkRenderPassAttachmentBeginInfo... structs) {
        NativeStructArray<VkRenderPassAttachmentBeginInfo> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkRenderPassAttachmentBeginInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkRenderPassAttachmentBeginInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkRenderPassAttachmentBeginInfo(segment)
        );
    }

}