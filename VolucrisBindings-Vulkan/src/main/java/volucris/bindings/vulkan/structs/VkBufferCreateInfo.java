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

public final class VkBufferCreateInfo
		implements Struct<VkBufferCreateInfo> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle FLAGS_HANDLE;
	public static final VarHandle SIZE_HANDLE;
	public static final VarHandle USAGE_HANDLE;
	public static final VarHandle SHARING_MODE_HANDLE;
	public static final VarHandle QUEUE_FAMILY_INDEX_COUNT_HANDLE;
	public static final VarHandle P_QUEUE_FAMILY_INDICES_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long FLAGS_BYTE_OFFSET;
	public static final long SIZE_BYTE_OFFSET;
	public static final long USAGE_BYTE_OFFSET;
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
		    JAVA_INT.withName("flags"),
		    MemoryLayout.paddingLayout(4),
		    JAVA_LONG.withName("size"),
		    JAVA_INT.withName("usage"),
		    JAVA_INT.withName("sharingMode"),
		    JAVA_INT.withName("queueFamilyIndexCount"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pQueueFamilyIndices")
		).withName("VkBufferCreateInfo").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
		SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("size"));
		USAGE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("usage"));
		SHARING_MODE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sharingMode"));
		QUEUE_FAMILY_INDEX_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("queueFamilyIndexCount"));
		P_QUEUE_FAMILY_INDICES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pQueueFamilyIndices"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
		SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("size"));
		USAGE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("usage"));
		SHARING_MODE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sharingMode"));
		QUEUE_FAMILY_INDEX_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("queueFamilyIndexCount"));
		P_QUEUE_FAMILY_INDICES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pQueueFamilyIndices"));
		//@formatter:on
	}

	public VkBufferCreateInfo() {
	    this(Arena.ofAuto());
	}
	
	public VkBufferCreateInfo(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkBufferCreateInfo(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkBufferCreateInfo sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkBufferCreateInfo pNext(MemorySegment pNext) {
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
    public VkBufferCreateInfo flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #size()
    public VkBufferCreateInfo size(long size) {
    	SIZE_HANDLE.set(segment, 0L, size);
    	return this;
    }
    
    public long size() {
    	return (long) SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #usage()
    public VkBufferCreateInfo usage(int usage) {
    	USAGE_HANDLE.set(segment, 0L, usage);
    	return this;
    }
    
    public int usage() {
    	return (int) USAGE_HANDLE.get(segment, 0L);
    }
    
    /// @see #sharingMode()
    public VkBufferCreateInfo sharingMode(int sharingMode) {
    	SHARING_MODE_HANDLE.set(segment, 0L, sharingMode);
    	return this;
    }
    
    public int sharingMode() {
    	return (int) SHARING_MODE_HANDLE.get(segment, 0L);
    }
    
    /// @see #queueFamilyIndexCount()
    public VkBufferCreateInfo queueFamilyIndexCount(int queueFamilyIndexCount) {
    	QUEUE_FAMILY_INDEX_COUNT_HANDLE.set(segment, 0L, queueFamilyIndexCount);
    	return this;
    }
    
    public int queueFamilyIndexCount() {
    	return (int) QUEUE_FAMILY_INDEX_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pQueueFamilyIndices()
    public VkBufferCreateInfo pQueueFamilyIndices(NativeIntArray pQueueFamilyIndices) {
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
    public VkBufferCreateInfo set(VkBufferCreateInfo other) {
        return set(other.segment);
    }
    
    @Override
    public VkBufferCreateInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkBufferCreateInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkBufferCreateInfo> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkBufferCreateInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<VkBufferCreateInfo> array(SegmentAllocator allocator, VkBufferCreateInfo... structs) {
        NativeStructArray<VkBufferCreateInfo> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkBufferCreateInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkBufferCreateInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkBufferCreateInfo(segment)
        );
    }

}