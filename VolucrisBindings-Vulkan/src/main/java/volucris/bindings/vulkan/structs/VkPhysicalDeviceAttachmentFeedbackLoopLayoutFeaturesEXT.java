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

public final class VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT
		implements Struct<VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle ATTACHMENT_FEEDBACK_LOOP_LAYOUT_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long ATTACHMENT_FEEDBACK_LOOP_LAYOUT_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("attachmentFeedbackLoopLayout"),
            MemoryLayout.paddingLayout(4)
        ).withName("VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        ATTACHMENT_FEEDBACK_LOOP_LAYOUT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("attachmentFeedbackLoopLayout"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        ATTACHMENT_FEEDBACK_LOOP_LAYOUT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("attachmentFeedbackLoopLayout"));
        //@formatter:on
    }

    public VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT() {
        this(Arena.ofAuto());
    }
    
    public VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #attachmentFeedbackLoopLayout()
    public VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT attachmentFeedbackLoopLayout(int attachmentFeedbackLoopLayout) {
    	ATTACHMENT_FEEDBACK_LOOP_LAYOUT_HANDLE.set(segment, 0L, attachmentFeedbackLoopLayout);
    	return this;
    }
    
    public int attachmentFeedbackLoopLayout() {
    	return (int) ATTACHMENT_FEEDBACK_LOOP_LAYOUT_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT set(VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT> array(Arena arena, VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT... structs) {
        NativeStructArray<VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT(segment)
        );
    }
    
}