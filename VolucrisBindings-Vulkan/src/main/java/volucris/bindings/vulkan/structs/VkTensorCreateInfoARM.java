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
import volucris.bindings.core.NativeIntArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkTensorCreateInfoARM
		implements Struct<VkTensorCreateInfoARM> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle FLAGS_HANDLE;
	public static final VarHandle P_DESCRIPTION_HANDLE;
	public static final VarHandle SHARING_MODE_HANDLE;
	public static final VarHandle QUEUE_FAMILY_INDEX_COUNT_HANDLE;
	public static final VarHandle P_QUEUE_FAMILY_INDICES_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long FLAGS_BYTE_OFFSET;
	public static final long P_DESCRIPTION_BYTE_OFFSET;
	public static final long SHARING_MODE_BYTE_OFFSET;
	public static final long QUEUE_FAMILY_INDEX_COUNT_BYTE_OFFSET;
	public static final long P_QUEUE_FAMILY_INDICES_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_LONG.withName("flags"),
		    UNBOUNDED_ADDRESS.withName("pDescription"),
		    JAVA_INT.withName("sharingMode"),
		    JAVA_INT.withName("queueFamilyIndexCount"),
		    UNBOUNDED_ADDRESS.withName("pQueueFamilyIndices")
		).withName("VkTensorCreateInfoARM").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
		P_DESCRIPTION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pDescription"));
		SHARING_MODE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sharingMode"));
		QUEUE_FAMILY_INDEX_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("queueFamilyIndexCount"));
		P_QUEUE_FAMILY_INDICES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pQueueFamilyIndices"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
		P_DESCRIPTION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pDescription"));
		SHARING_MODE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sharingMode"));
		QUEUE_FAMILY_INDEX_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("queueFamilyIndexCount"));
		P_QUEUE_FAMILY_INDICES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pQueueFamilyIndices"));
		//@formatter:on
	}

	public VkTensorCreateInfoARM() {
	    this(Arena.ofAuto());
	}
	
	public VkTensorCreateInfoARM(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkTensorCreateInfoARM(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkTensorCreateInfoARM sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkTensorCreateInfoARM pNext(MemorySegment pNext) {
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
    public VkTensorCreateInfoARM flags(long flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public long flags() {
    	return (long) FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #pDescription()
    public VkTensorCreateInfoARM pDescription(VkTensorDescriptionARM pDescription) {
    	P_DESCRIPTION_HANDLE.set(segment, 0L, pDescription.memorySegment());
    	return this;
    }
    
    public @Nullable VkTensorDescriptionARM pDescription() {
    	MemorySegment segment = (MemorySegment) P_DESCRIPTION_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkTensorDescriptionARM(segment);
    }
    
    /// @see #sharingMode()
    public VkTensorCreateInfoARM sharingMode(int sharingMode) {
    	SHARING_MODE_HANDLE.set(segment, 0L, sharingMode);
    	return this;
    }
    
    public int sharingMode() {
    	return (int) SHARING_MODE_HANDLE.get(segment, 0L);
    }
    
    /// @see #queueFamilyIndexCount()
    public VkTensorCreateInfoARM queueFamilyIndexCount(int queueFamilyIndexCount) {
    	QUEUE_FAMILY_INDEX_COUNT_HANDLE.set(segment, 0L, queueFamilyIndexCount);
    	return this;
    }
    
    public int queueFamilyIndexCount() {
    	return (int) QUEUE_FAMILY_INDEX_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pQueueFamilyIndices()
    public VkTensorCreateInfoARM pQueueFamilyIndices(NativeIntArray pQueueFamilyIndices) {
    	P_QUEUE_FAMILY_INDICES_HANDLE.set(segment, 0L, pQueueFamilyIndices.memorySegment());
    	return this;
    }
    
    public @Nullable NativeIntArray pQueueFamilyIndices() {
    	MemorySegment segment = (MemorySegment) P_QUEUE_FAMILY_INDICES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeIntArray(segment);
    }
    
    @Override
    public VkTensorCreateInfoARM set(VkTensorCreateInfoARM other) {
        return set(other.segment);
    }
    
    @Override
    public VkTensorCreateInfoARM set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkTensorCreateInfoARM> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkTensorCreateInfoARM> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkTensorCreateInfoARM(segment),
            count
        );
    }
    
    public static NativeStructArray<VkTensorCreateInfoARM> array(SegmentAllocator allocator, VkTensorCreateInfoARM... structs) {
        NativeStructArray<VkTensorCreateInfoARM> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkTensorCreateInfoARM(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkTensorCreateInfoARM> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkTensorCreateInfoARM(segment)
        );
    }

}