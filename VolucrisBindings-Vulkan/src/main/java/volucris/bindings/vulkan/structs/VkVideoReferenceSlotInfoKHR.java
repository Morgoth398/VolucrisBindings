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

public final class VkVideoReferenceSlotInfoKHR
		implements Struct<VkVideoReferenceSlotInfoKHR> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle SLOT_INDEX_HANDLE;
    public static final VarHandle P_PICTURE_RESOURCE_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long SLOT_INDEX_BYTE_OFFSET;
    public static final long P_PICTURE_RESOURCE_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("slotIndex"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pPictureResource")
        ).withName("VkVideoReferenceSlotInfoKHR").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        SLOT_INDEX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("slotIndex"));
        P_PICTURE_RESOURCE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pPictureResource"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        SLOT_INDEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("slotIndex"));
        P_PICTURE_RESOURCE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pPictureResource"));
        //@formatter:on
    }

    public VkVideoReferenceSlotInfoKHR() {
        this(Arena.ofAuto());
    }
    
    public VkVideoReferenceSlotInfoKHR(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkVideoReferenceSlotInfoKHR(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkVideoReferenceSlotInfoKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkVideoReferenceSlotInfoKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #slotIndex()
    public VkVideoReferenceSlotInfoKHR slotIndex(int slotIndex) {
    	SLOT_INDEX_HANDLE.set(segment, 0L, slotIndex);
    	return this;
    }
    
    public int slotIndex() {
    	return (int) SLOT_INDEX_HANDLE.get(segment, 0L);
    }
    
    /// @see #pPictureResource()
    public VkVideoReferenceSlotInfoKHR pPictureResource(VkVideoPictureResourceInfoKHR pPictureResource) {
    	P_PICTURE_RESOURCE_HANDLE.set(segment, 0L, pPictureResource.memorySegment());
    	return this;
    }
    
    public @Nullable VkVideoPictureResourceInfoKHR pPictureResource() {
    	MemorySegment segment = (MemorySegment) P_PICTURE_RESOURCE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkVideoPictureResourceInfoKHR(segment);
    }
    
    @Override
    public VkVideoReferenceSlotInfoKHR set(VkVideoReferenceSlotInfoKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkVideoReferenceSlotInfoKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkVideoReferenceSlotInfoKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkVideoReferenceSlotInfoKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkVideoReferenceSlotInfoKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkVideoReferenceSlotInfoKHR> array(Arena arena, VkVideoReferenceSlotInfoKHR... structs) {
        NativeStructArray<VkVideoReferenceSlotInfoKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkVideoReferenceSlotInfoKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkVideoReferenceSlotInfoKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkVideoReferenceSlotInfoKHR(segment)
        );
    }
    
}