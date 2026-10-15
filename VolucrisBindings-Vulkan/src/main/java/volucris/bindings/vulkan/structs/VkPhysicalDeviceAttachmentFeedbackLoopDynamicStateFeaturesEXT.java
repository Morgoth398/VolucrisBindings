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

public final class VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT
		implements Struct<VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle ATTACHMENT_FEEDBACK_LOOP_DYNAMIC_STATE_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long ATTACHMENT_FEEDBACK_LOOP_DYNAMIC_STATE_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("attachmentFeedbackLoopDynamicState"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		ATTACHMENT_FEEDBACK_LOOP_DYNAMIC_STATE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("attachmentFeedbackLoopDynamicState"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		ATTACHMENT_FEEDBACK_LOOP_DYNAMIC_STATE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("attachmentFeedbackLoopDynamicState"));
		//@formatter:on
	}

	public VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #attachmentFeedbackLoopDynamicState()
    public VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT attachmentFeedbackLoopDynamicState(int attachmentFeedbackLoopDynamicState) {
    	ATTACHMENT_FEEDBACK_LOOP_DYNAMIC_STATE_HANDLE.set(segment, 0L, attachmentFeedbackLoopDynamicState);
    	return this;
    }
    
    public int attachmentFeedbackLoopDynamicState() {
    	return (int) ATTACHMENT_FEEDBACK_LOOP_DYNAMIC_STATE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT set(VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT> array(Arena arena, VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT... structs) {
        NativeStructArray<VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT(segment)
        );
    }

}