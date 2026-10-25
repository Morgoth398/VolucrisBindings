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
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;

public final class VkRenderPassSubpassFeedbackInfoEXT
		implements Struct<VkRenderPassSubpassFeedbackInfoEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle SUBPASS_MERGE_STATUS_HANDLE;
	public static final VarHandle DESCRIPTION_HANDLE;
	public static final VarHandle POST_MERGE_INDEX_HANDLE;

	public static final long SUBPASS_MERGE_STATUS_BYTE_OFFSET;
	public static final long DESCRIPTION_BYTE_OFFSET;
	public static final long POST_MERGE_INDEX_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("subpassMergeStatus"),
		    MemoryLayout.sequenceLayout(256, JAVA_BYTE).withName("description"),
		    JAVA_INT.withName("postMergeIndex")
		).withName("VkRenderPassSubpassFeedbackInfoEXT").withByteAlignment(4);
		
		SUBPASS_MERGE_STATUS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("subpassMergeStatus"));
		DESCRIPTION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("description"), PathElement.sequenceElement());
		POST_MERGE_INDEX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("postMergeIndex"));
		
		SUBPASS_MERGE_STATUS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("subpassMergeStatus"));
		DESCRIPTION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("description"));
		POST_MERGE_INDEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("postMergeIndex"));
		//@formatter:on
	}

	public VkRenderPassSubpassFeedbackInfoEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkRenderPassSubpassFeedbackInfoEXT(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkRenderPassSubpassFeedbackInfoEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #subpassMergeStatus()
    public VkRenderPassSubpassFeedbackInfoEXT subpassMergeStatus(int subpassMergeStatus) {
    	SUBPASS_MERGE_STATUS_HANDLE.set(segment, 0L, subpassMergeStatus);
    	return this;
    }
    
    public int subpassMergeStatus() {
    	return (int) SUBPASS_MERGE_STATUS_HANDLE.get(segment, 0L);
    }
    
    /// @see #description(int)
    public VkRenderPassSubpassFeedbackInfoEXT description(byte description, int index0) {
    	DESCRIPTION_HANDLE.set(segment, 0L, index0, description);
    	return this;
    }
    
    public byte description(int index0) {
    	return (byte) DESCRIPTION_HANDLE.get(segment, 0L, index0);
    }
    
    public String description() {
        return segment.getString(DESCRIPTION_BYTE_OFFSET);
    }
    
    /// @see #postMergeIndex()
    public VkRenderPassSubpassFeedbackInfoEXT postMergeIndex(int postMergeIndex) {
    	POST_MERGE_INDEX_HANDLE.set(segment, 0L, postMergeIndex);
    	return this;
    }
    
    public int postMergeIndex() {
    	return (int) POST_MERGE_INDEX_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkRenderPassSubpassFeedbackInfoEXT set(VkRenderPassSubpassFeedbackInfoEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkRenderPassSubpassFeedbackInfoEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkRenderPassSubpassFeedbackInfoEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkRenderPassSubpassFeedbackInfoEXT> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkRenderPassSubpassFeedbackInfoEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkRenderPassSubpassFeedbackInfoEXT> array(SegmentAllocator allocator, VkRenderPassSubpassFeedbackInfoEXT... structs) {
        NativeStructArray<VkRenderPassSubpassFeedbackInfoEXT> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkRenderPassSubpassFeedbackInfoEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkRenderPassSubpassFeedbackInfoEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkRenderPassSubpassFeedbackInfoEXT(segment)
        );
    }

}