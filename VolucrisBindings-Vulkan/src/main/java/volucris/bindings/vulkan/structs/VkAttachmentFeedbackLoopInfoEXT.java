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

public final class VkAttachmentFeedbackLoopInfoEXT
		implements Struct<VkAttachmentFeedbackLoopInfoEXT> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle FEEDBACK_LOOP_ENABLE_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long FEEDBACK_LOOP_ENABLE_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("feedbackLoopEnable"),
            MemoryLayout.paddingLayout(4)
        ).withName("VkAttachmentFeedbackLoopInfoEXT").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        FEEDBACK_LOOP_ENABLE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("feedbackLoopEnable"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        FEEDBACK_LOOP_ENABLE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("feedbackLoopEnable"));
        //@formatter:on
    }

    public VkAttachmentFeedbackLoopInfoEXT() {
        this(Arena.ofAuto());
    }
    
    public VkAttachmentFeedbackLoopInfoEXT(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkAttachmentFeedbackLoopInfoEXT(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkAttachmentFeedbackLoopInfoEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkAttachmentFeedbackLoopInfoEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #feedbackLoopEnable()
    public VkAttachmentFeedbackLoopInfoEXT feedbackLoopEnable(int feedbackLoopEnable) {
    	FEEDBACK_LOOP_ENABLE_HANDLE.set(segment, 0L, feedbackLoopEnable);
    	return this;
    }
    
    public int feedbackLoopEnable() {
    	return (int) FEEDBACK_LOOP_ENABLE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkAttachmentFeedbackLoopInfoEXT set(VkAttachmentFeedbackLoopInfoEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkAttachmentFeedbackLoopInfoEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkAttachmentFeedbackLoopInfoEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkAttachmentFeedbackLoopInfoEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkAttachmentFeedbackLoopInfoEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkAttachmentFeedbackLoopInfoEXT> array(Arena arena, VkAttachmentFeedbackLoopInfoEXT... structs) {
        NativeStructArray<VkAttachmentFeedbackLoopInfoEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkAttachmentFeedbackLoopInfoEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkAttachmentFeedbackLoopInfoEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkAttachmentFeedbackLoopInfoEXT(segment)
        );
    }
    
}