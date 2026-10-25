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
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkVideoEncodeInfoKHR
		implements Struct<VkVideoEncodeInfoKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle FLAGS_HANDLE;
	public static final VarHandle DST_BUFFER_HANDLE;
	public static final VarHandle DST_BUFFER_OFFSET_HANDLE;
	public static final VarHandle DST_BUFFER_RANGE_HANDLE;
	public static final VarHandle P_SETUP_REFERENCE_SLOT_HANDLE;
	public static final VarHandle REFERENCE_SLOT_COUNT_HANDLE;
	public static final VarHandle P_REFERENCE_SLOTS_HANDLE;
	public static final VarHandle PRECEDING_EXTERNALLY_ENCODED_BYTES_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long FLAGS_BYTE_OFFSET;
	public static final long DST_BUFFER_BYTE_OFFSET;
	public static final long DST_BUFFER_OFFSET_BYTE_OFFSET;
	public static final long DST_BUFFER_RANGE_BYTE_OFFSET;
	public static final long SRC_PICTURE_RESOURCE_BYTE_OFFSET;
	public static final long P_SETUP_REFERENCE_SLOT_BYTE_OFFSET;
	public static final long REFERENCE_SLOT_COUNT_BYTE_OFFSET;
	public static final long P_REFERENCE_SLOTS_BYTE_OFFSET;
	public static final long PRECEDING_EXTERNALLY_ENCODED_BYTES_BYTE_OFFSET;

	private final MemorySegment segment;

	private final VkVideoPictureResourceInfoKHR srcPictureResource;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("flags"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("dstBuffer"),
		    JAVA_LONG.withName("dstBufferOffset"),
		    JAVA_LONG.withName("dstBufferRange"),
		    VkVideoPictureResourceInfoKHR.LAYOUT.withName("srcPictureResource"),
		    UNBOUNDED_ADDRESS.withName("pSetupReferenceSlot"),
		    JAVA_INT.withName("referenceSlotCount"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pReferenceSlots"),
		    JAVA_INT.withName("precedingExternallyEncodedBytes"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkVideoEncodeInfoKHR").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
		DST_BUFFER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("dstBuffer"));
		DST_BUFFER_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("dstBufferOffset"));
		DST_BUFFER_RANGE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("dstBufferRange"));
		P_SETUP_REFERENCE_SLOT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pSetupReferenceSlot"));
		REFERENCE_SLOT_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("referenceSlotCount"));
		P_REFERENCE_SLOTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pReferenceSlots"));
		PRECEDING_EXTERNALLY_ENCODED_BYTES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("precedingExternallyEncodedBytes"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
		DST_BUFFER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dstBuffer"));
		DST_BUFFER_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dstBufferOffset"));
		DST_BUFFER_RANGE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dstBufferRange"));
		SRC_PICTURE_RESOURCE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("srcPictureResource"));
		P_SETUP_REFERENCE_SLOT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pSetupReferenceSlot"));
		REFERENCE_SLOT_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("referenceSlotCount"));
		P_REFERENCE_SLOTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pReferenceSlots"));
		PRECEDING_EXTERNALLY_ENCODED_BYTES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("precedingExternallyEncodedBytes"));
		//@formatter:on
	}

	public VkVideoEncodeInfoKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkVideoEncodeInfoKHR(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkVideoEncodeInfoKHR(MemorySegment segment) {
	    this.segment = segment;
	
	    srcPictureResource = new VkVideoPictureResourceInfoKHR(segment.asSlice(SRC_PICTURE_RESOURCE_BYTE_OFFSET, VkVideoPictureResourceInfoKHR.LAYOUT));
	}

    /// @see #sType()
    public VkVideoEncodeInfoKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkVideoEncodeInfoKHR pNext(MemorySegment pNext) {
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
    public VkVideoEncodeInfoKHR flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #dstBuffer()
    public VkVideoEncodeInfoKHR dstBuffer(VkBuffer dstBuffer) {
    	DST_BUFFER_HANDLE.set(segment, 0L, dstBuffer.memorySegment());
    	return this;
    }
    
    public @Nullable VkBuffer dstBuffer() {
    	MemorySegment segment = (MemorySegment) DST_BUFFER_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkBuffer(segment);
    }
    
    /// @see #dstBufferOffset()
    public VkVideoEncodeInfoKHR dstBufferOffset(long dstBufferOffset) {
    	DST_BUFFER_OFFSET_HANDLE.set(segment, 0L, dstBufferOffset);
    	return this;
    }
    
    public long dstBufferOffset() {
    	return (long) DST_BUFFER_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #dstBufferRange()
    public VkVideoEncodeInfoKHR dstBufferRange(long dstBufferRange) {
    	DST_BUFFER_RANGE_HANDLE.set(segment, 0L, dstBufferRange);
    	return this;
    }
    
    public long dstBufferRange() {
    	return (long) DST_BUFFER_RANGE_HANDLE.get(segment, 0L);
    }
    
    /// @see #srcPictureResource()
    public VkVideoEncodeInfoKHR srcPictureResource(Consumer<VkVideoPictureResourceInfoKHR> consumer) {
    	consumer.accept(srcPictureResource);
    	return this;
    }
    
    /// @see #srcPictureResource()
    public VkVideoEncodeInfoKHR srcPictureResource(VkVideoPictureResourceInfoKHR other) {
    	srcPictureResource.set(other);
    	return this;
    }
    
    public VkVideoPictureResourceInfoKHR srcPictureResource() {
    	return srcPictureResource;
    }
    
    /// @see #pSetupReferenceSlot()
    public VkVideoEncodeInfoKHR pSetupReferenceSlot(VkVideoReferenceSlotInfoKHR pSetupReferenceSlot) {
    	P_SETUP_REFERENCE_SLOT_HANDLE.set(segment, 0L, pSetupReferenceSlot.memorySegment());
    	return this;
    }
    
    public @Nullable VkVideoReferenceSlotInfoKHR pSetupReferenceSlot() {
    	MemorySegment segment = (MemorySegment) P_SETUP_REFERENCE_SLOT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkVideoReferenceSlotInfoKHR(segment);
    }
    
    /// @see #referenceSlotCount()
    public VkVideoEncodeInfoKHR referenceSlotCount(int referenceSlotCount) {
    	REFERENCE_SLOT_COUNT_HANDLE.set(segment, 0L, referenceSlotCount);
    	return this;
    }
    
    public int referenceSlotCount() {
    	return (int) REFERENCE_SLOT_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pReferenceSlots()
    public VkVideoEncodeInfoKHR pReferenceSlots(NativeStructArray<VkVideoReferenceSlotInfoKHR> pReferenceSlots) {
    	P_REFERENCE_SLOTS_HANDLE.set(segment, 0L, pReferenceSlots.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkVideoReferenceSlotInfoKHR> pReferenceSlots() {
    	MemorySegment segment = (MemorySegment) P_REFERENCE_SLOTS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkVideoReferenceSlotInfoKHR.array(segment);
    }
    
    /// @see #precedingExternallyEncodedBytes()
    public VkVideoEncodeInfoKHR precedingExternallyEncodedBytes(int precedingExternallyEncodedBytes) {
    	PRECEDING_EXTERNALLY_ENCODED_BYTES_HANDLE.set(segment, 0L, precedingExternallyEncodedBytes);
    	return this;
    }
    
    public int precedingExternallyEncodedBytes() {
    	return (int) PRECEDING_EXTERNALLY_ENCODED_BYTES_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkVideoEncodeInfoKHR set(VkVideoEncodeInfoKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkVideoEncodeInfoKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkVideoEncodeInfoKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkVideoEncodeInfoKHR> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkVideoEncodeInfoKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkVideoEncodeInfoKHR> array(SegmentAllocator allocator, VkVideoEncodeInfoKHR... structs) {
        NativeStructArray<VkVideoEncodeInfoKHR> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkVideoEncodeInfoKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkVideoEncodeInfoKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkVideoEncodeInfoKHR(segment)
        );
    }

}