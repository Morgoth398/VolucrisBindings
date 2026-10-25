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

public final class VkRenderPassCreationFeedbackInfoEXT
		implements Struct<VkRenderPassCreationFeedbackInfoEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle POST_MERGE_SUBPASS_COUNT_HANDLE;

	public static final long POST_MERGE_SUBPASS_COUNT_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("postMergeSubpassCount")
		).withName("VkRenderPassCreationFeedbackInfoEXT").withByteAlignment(4);
		
		POST_MERGE_SUBPASS_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("postMergeSubpassCount"));
		
		POST_MERGE_SUBPASS_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("postMergeSubpassCount"));
		//@formatter:on
	}

	public VkRenderPassCreationFeedbackInfoEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkRenderPassCreationFeedbackInfoEXT(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkRenderPassCreationFeedbackInfoEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #postMergeSubpassCount()
    public VkRenderPassCreationFeedbackInfoEXT postMergeSubpassCount(int postMergeSubpassCount) {
    	POST_MERGE_SUBPASS_COUNT_HANDLE.set(segment, 0L, postMergeSubpassCount);
    	return this;
    }
    
    public int postMergeSubpassCount() {
    	return (int) POST_MERGE_SUBPASS_COUNT_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkRenderPassCreationFeedbackInfoEXT set(VkRenderPassCreationFeedbackInfoEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkRenderPassCreationFeedbackInfoEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkRenderPassCreationFeedbackInfoEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkRenderPassCreationFeedbackInfoEXT> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkRenderPassCreationFeedbackInfoEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkRenderPassCreationFeedbackInfoEXT> array(SegmentAllocator allocator, VkRenderPassCreationFeedbackInfoEXT... structs) {
        NativeStructArray<VkRenderPassCreationFeedbackInfoEXT> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkRenderPassCreationFeedbackInfoEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkRenderPassCreationFeedbackInfoEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkRenderPassCreationFeedbackInfoEXT(segment)
        );
    }

}