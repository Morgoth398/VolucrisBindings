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
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkDebugUtilsMessengerCallbackDataEXT
		implements Struct<VkDebugUtilsMessengerCallbackDataEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle FLAGS_HANDLE;
	public static final VarHandle P_MESSAGE_ID_NAME_HANDLE;
	public static final VarHandle MESSAGE_ID_NUMBER_HANDLE;
	public static final VarHandle P_MESSAGE_HANDLE;
	public static final VarHandle QUEUE_LABEL_COUNT_HANDLE;
	public static final VarHandle P_QUEUE_LABELS_HANDLE;
	public static final VarHandle CMD_BUF_LABEL_COUNT_HANDLE;
	public static final VarHandle P_CMD_BUF_LABELS_HANDLE;
	public static final VarHandle OBJECT_COUNT_HANDLE;
	public static final VarHandle P_OBJECTS_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long FLAGS_BYTE_OFFSET;
	public static final long P_MESSAGE_ID_NAME_BYTE_OFFSET;
	public static final long MESSAGE_ID_NUMBER_BYTE_OFFSET;
	public static final long P_MESSAGE_BYTE_OFFSET;
	public static final long QUEUE_LABEL_COUNT_BYTE_OFFSET;
	public static final long P_QUEUE_LABELS_BYTE_OFFSET;
	public static final long CMD_BUF_LABEL_COUNT_BYTE_OFFSET;
	public static final long P_CMD_BUF_LABELS_BYTE_OFFSET;
	public static final long OBJECT_COUNT_BYTE_OFFSET;
	public static final long P_OBJECTS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("flags"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pMessageIdName"),
		    JAVA_INT.withName("messageIdNumber"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pMessage"),
		    JAVA_INT.withName("queueLabelCount"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pQueueLabels"),
		    JAVA_INT.withName("cmdBufLabelCount"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pCmdBufLabels"),
		    JAVA_INT.withName("objectCount"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pObjects")
		).withName("VkDebugUtilsMessengerCallbackDataEXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
		P_MESSAGE_ID_NAME_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pMessageIdName"));
		MESSAGE_ID_NUMBER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("messageIdNumber"));
		P_MESSAGE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pMessage"));
		QUEUE_LABEL_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("queueLabelCount"));
		P_QUEUE_LABELS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pQueueLabels"));
		CMD_BUF_LABEL_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("cmdBufLabelCount"));
		P_CMD_BUF_LABELS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pCmdBufLabels"));
		OBJECT_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("objectCount"));
		P_OBJECTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pObjects"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
		P_MESSAGE_ID_NAME_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pMessageIdName"));
		MESSAGE_ID_NUMBER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("messageIdNumber"));
		P_MESSAGE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pMessage"));
		QUEUE_LABEL_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("queueLabelCount"));
		P_QUEUE_LABELS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pQueueLabels"));
		CMD_BUF_LABEL_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("cmdBufLabelCount"));
		P_CMD_BUF_LABELS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pCmdBufLabels"));
		OBJECT_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("objectCount"));
		P_OBJECTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pObjects"));
		//@formatter:on
	}

	public VkDebugUtilsMessengerCallbackDataEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkDebugUtilsMessengerCallbackDataEXT(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkDebugUtilsMessengerCallbackDataEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkDebugUtilsMessengerCallbackDataEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkDebugUtilsMessengerCallbackDataEXT pNext(MemorySegment pNext) {
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
    public VkDebugUtilsMessengerCallbackDataEXT flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #pMessageIdName()
    public VkDebugUtilsMessengerCallbackDataEXT pMessageIdName(SegmentAllocator allocator, String pMessageIdName) {
    	P_MESSAGE_ID_NAME_HANDLE.set(segment, 0L, allocator.allocateFrom(pMessageIdName));
    	return this;
    }
    
    public @Nullable String pMessageIdName() {
    	MemorySegment segment = (MemorySegment) P_MESSAGE_ID_NAME_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment.getString(0);
    }
    
    /// @see #messageIdNumber()
    public VkDebugUtilsMessengerCallbackDataEXT messageIdNumber(int messageIdNumber) {
    	MESSAGE_ID_NUMBER_HANDLE.set(segment, 0L, messageIdNumber);
    	return this;
    }
    
    public int messageIdNumber() {
    	return (int) MESSAGE_ID_NUMBER_HANDLE.get(segment, 0L);
    }
    
    /// @see #pMessage()
    public VkDebugUtilsMessengerCallbackDataEXT pMessage(SegmentAllocator allocator, String pMessage) {
    	P_MESSAGE_HANDLE.set(segment, 0L, allocator.allocateFrom(pMessage));
    	return this;
    }
    
    public @Nullable String pMessage() {
    	MemorySegment segment = (MemorySegment) P_MESSAGE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment.getString(0);
    }
    
    /// @see #queueLabelCount()
    public VkDebugUtilsMessengerCallbackDataEXT queueLabelCount(int queueLabelCount) {
    	QUEUE_LABEL_COUNT_HANDLE.set(segment, 0L, queueLabelCount);
    	return this;
    }
    
    public int queueLabelCount() {
    	return (int) QUEUE_LABEL_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pQueueLabels()
    public VkDebugUtilsMessengerCallbackDataEXT pQueueLabels(NativeStructArray<VkDebugUtilsLabelEXT> pQueueLabels) {
    	P_QUEUE_LABELS_HANDLE.set(segment, 0L, pQueueLabels.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkDebugUtilsLabelEXT> pQueueLabels() {
    	MemorySegment segment = (MemorySegment) P_QUEUE_LABELS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkDebugUtilsLabelEXT.array(segment);
    }
    
    /// @see #cmdBufLabelCount()
    public VkDebugUtilsMessengerCallbackDataEXT cmdBufLabelCount(int cmdBufLabelCount) {
    	CMD_BUF_LABEL_COUNT_HANDLE.set(segment, 0L, cmdBufLabelCount);
    	return this;
    }
    
    public int cmdBufLabelCount() {
    	return (int) CMD_BUF_LABEL_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pCmdBufLabels()
    public VkDebugUtilsMessengerCallbackDataEXT pCmdBufLabels(NativeStructArray<VkDebugUtilsLabelEXT> pCmdBufLabels) {
    	P_CMD_BUF_LABELS_HANDLE.set(segment, 0L, pCmdBufLabels.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkDebugUtilsLabelEXT> pCmdBufLabels() {
    	MemorySegment segment = (MemorySegment) P_CMD_BUF_LABELS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkDebugUtilsLabelEXT.array(segment);
    }
    
    /// @see #objectCount()
    public VkDebugUtilsMessengerCallbackDataEXT objectCount(int objectCount) {
    	OBJECT_COUNT_HANDLE.set(segment, 0L, objectCount);
    	return this;
    }
    
    public int objectCount() {
    	return (int) OBJECT_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pObjects()
    public VkDebugUtilsMessengerCallbackDataEXT pObjects(NativeStructArray<VkDebugUtilsObjectNameInfoEXT> pObjects) {
    	P_OBJECTS_HANDLE.set(segment, 0L, pObjects.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkDebugUtilsObjectNameInfoEXT> pObjects() {
    	MemorySegment segment = (MemorySegment) P_OBJECTS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkDebugUtilsObjectNameInfoEXT.array(segment);
    }
    
    @Override
    public VkDebugUtilsMessengerCallbackDataEXT set(VkDebugUtilsMessengerCallbackDataEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkDebugUtilsMessengerCallbackDataEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkDebugUtilsMessengerCallbackDataEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkDebugUtilsMessengerCallbackDataEXT> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkDebugUtilsMessengerCallbackDataEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkDebugUtilsMessengerCallbackDataEXT> array(SegmentAllocator allocator, VkDebugUtilsMessengerCallbackDataEXT... structs) {
        NativeStructArray<VkDebugUtilsMessengerCallbackDataEXT> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkDebugUtilsMessengerCallbackDataEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkDebugUtilsMessengerCallbackDataEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkDebugUtilsMessengerCallbackDataEXT(segment)
        );
    }

}