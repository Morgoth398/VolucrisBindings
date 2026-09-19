/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
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

public final class VkVideoDecodeInfoKHR
		implements Struct<VkVideoDecodeInfoKHR> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle FLAGS_HANDLE;
    public static final VarHandle SRC_BUFFER_HANDLE;
    public static final VarHandle SRC_BUFFER_OFFSET_HANDLE;
    public static final VarHandle SRC_BUFFER_RANGE_HANDLE;
    public static final VarHandle P_SETUP_REFERENCE_SLOT_HANDLE;
    public static final VarHandle REFERENCE_SLOT_COUNT_HANDLE;
    public static final VarHandle P_REFERENCE_SLOTS_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long FLAGS_BYTE_OFFSET;
    public static final long SRC_BUFFER_BYTE_OFFSET;
    public static final long SRC_BUFFER_OFFSET_BYTE_OFFSET;
    public static final long SRC_BUFFER_RANGE_BYTE_OFFSET;
    public static final long DST_PICTURE_RESOURCE_BYTE_OFFSET;
    public static final long P_SETUP_REFERENCE_SLOT_BYTE_OFFSET;
    public static final long REFERENCE_SLOT_COUNT_BYTE_OFFSET;
    public static final long P_REFERENCE_SLOTS_BYTE_OFFSET;

    private final MemorySegment segment;

    private final VkVideoPictureResourceInfoKHR dstPictureResource;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("flags"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("srcBuffer"),
            JAVA_LONG.withName("srcBufferOffset"),
            JAVA_LONG.withName("srcBufferRange"),
            VkVideoPictureResourceInfoKHR.LAYOUT.withName("dstPictureResource"),
            UNBOUNDED_ADDRESS.withName("pSetupReferenceSlot"),
            JAVA_INT.withName("referenceSlotCount"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pReferenceSlots")
        ).withName("VkVideoDecodeInfoKHR").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
        SRC_BUFFER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("srcBuffer"));
        SRC_BUFFER_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("srcBufferOffset"));
        SRC_BUFFER_RANGE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("srcBufferRange"));
        P_SETUP_REFERENCE_SLOT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pSetupReferenceSlot"));
        REFERENCE_SLOT_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("referenceSlotCount"));
        P_REFERENCE_SLOTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pReferenceSlots"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
        SRC_BUFFER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("srcBuffer"));
        SRC_BUFFER_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("srcBufferOffset"));
        SRC_BUFFER_RANGE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("srcBufferRange"));
        DST_PICTURE_RESOURCE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dstPictureResource"));
        P_SETUP_REFERENCE_SLOT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pSetupReferenceSlot"));
        REFERENCE_SLOT_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("referenceSlotCount"));
        P_REFERENCE_SLOTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pReferenceSlots"));
        //@formatter:on
    }

    public VkVideoDecodeInfoKHR() {
        this(Arena.ofAuto());
    }
    
    public VkVideoDecodeInfoKHR(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkVideoDecodeInfoKHR(MemorySegment segment) {
        this.segment = segment;
    
        dstPictureResource = new VkVideoPictureResourceInfoKHR(segment.asSlice(DST_PICTURE_RESOURCE_BYTE_OFFSET, VkVideoPictureResourceInfoKHR.LAYOUT));
    }

    /// @see #sType()
    public VkVideoDecodeInfoKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkVideoDecodeInfoKHR pNext(MemorySegment pNext) {
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
    public VkVideoDecodeInfoKHR flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #srcBuffer()
    public VkVideoDecodeInfoKHR srcBuffer(VkBuffer srcBuffer) {
    	SRC_BUFFER_HANDLE.set(segment, 0L, srcBuffer.memorySegment());
    	return this;
    }
    
    public @Nullable VkBuffer srcBuffer() {
    	MemorySegment segment = (MemorySegment) SRC_BUFFER_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkBuffer(segment);
    }
    
    /// @see #srcBufferOffset()
    public VkVideoDecodeInfoKHR srcBufferOffset(long srcBufferOffset) {
    	SRC_BUFFER_OFFSET_HANDLE.set(segment, 0L, srcBufferOffset);
    	return this;
    }
    
    public long srcBufferOffset() {
    	return (long) SRC_BUFFER_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #srcBufferRange()
    public VkVideoDecodeInfoKHR srcBufferRange(long srcBufferRange) {
    	SRC_BUFFER_RANGE_HANDLE.set(segment, 0L, srcBufferRange);
    	return this;
    }
    
    public long srcBufferRange() {
    	return (long) SRC_BUFFER_RANGE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pSetupReferenceSlot()
    public VkVideoDecodeInfoKHR pSetupReferenceSlot(VkVideoReferenceSlotInfoKHR pSetupReferenceSlot) {
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
    public VkVideoDecodeInfoKHR referenceSlotCount(int referenceSlotCount) {
    	REFERENCE_SLOT_COUNT_HANDLE.set(segment, 0L, referenceSlotCount);
    	return this;
    }
    
    public int referenceSlotCount() {
    	return (int) REFERENCE_SLOT_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pReferenceSlots()
    public VkVideoDecodeInfoKHR pReferenceSlots(NativeStructArray<VkVideoReferenceSlotInfoKHR> pReferenceSlots) {
    	P_REFERENCE_SLOTS_HANDLE.set(segment, 0L, pReferenceSlots.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkVideoReferenceSlotInfoKHR> pReferenceSlots() {
    	MemorySegment segment = (MemorySegment) P_REFERENCE_SLOTS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkVideoReferenceSlotInfoKHR.array(segment);
    }
    
    /// @see #dstPictureResource()
    public VkVideoDecodeInfoKHR dstPictureResource(Consumer<VkVideoPictureResourceInfoKHR> consumer) {
    	consumer.accept(dstPictureResource);
    	return this;
    }
    
    /// @see #dstPictureResource()
    public VkVideoDecodeInfoKHR dstPictureResource(VkVideoPictureResourceInfoKHR other) {
    	dstPictureResource.set(other);
    	return this;
    }
    
    public VkVideoPictureResourceInfoKHR dstPictureResource() {
    	return dstPictureResource;
    }
    
    @Override
    public VkVideoDecodeInfoKHR set(VkVideoDecodeInfoKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkVideoDecodeInfoKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkVideoDecodeInfoKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkVideoDecodeInfoKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkVideoDecodeInfoKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkVideoDecodeInfoKHR> array(Arena arena, VkVideoDecodeInfoKHR... structs) {
        NativeStructArray<VkVideoDecodeInfoKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkVideoDecodeInfoKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkVideoDecodeInfoKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkVideoDecodeInfoKHR(segment)
        );
    }
    
}