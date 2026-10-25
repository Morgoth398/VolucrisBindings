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
import volucris.bindings.core.NativePointerArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkFrameBoundaryEXT
		implements Struct<VkFrameBoundaryEXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle FLAGS_HANDLE;
	public static final VarHandle FRAME_ID_HANDLE;
	public static final VarHandle IMAGE_COUNT_HANDLE;
	public static final VarHandle P_IMAGES_HANDLE;
	public static final VarHandle BUFFER_COUNT_HANDLE;
	public static final VarHandle P_BUFFERS_HANDLE;
	public static final VarHandle TAG_NAME_HANDLE;
	public static final VarHandle TAG_SIZE_HANDLE;
	public static final VarHandle P_TAG_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long FLAGS_BYTE_OFFSET;
	public static final long FRAME_ID_BYTE_OFFSET;
	public static final long IMAGE_COUNT_BYTE_OFFSET;
	public static final long P_IMAGES_BYTE_OFFSET;
	public static final long BUFFER_COUNT_BYTE_OFFSET;
	public static final long P_BUFFERS_BYTE_OFFSET;
	public static final long TAG_NAME_BYTE_OFFSET;
	public static final long TAG_SIZE_BYTE_OFFSET;
	public static final long P_TAG_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("flags"),
		    MemoryLayout.paddingLayout(4),
		    JAVA_LONG.withName("frameID"),
		    JAVA_INT.withName("imageCount"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pImages"),
		    JAVA_INT.withName("bufferCount"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pBuffers"),
		    JAVA_LONG.withName("tagName"),
		    JAVA_LONG.withName("tagSize"),
		    UNBOUNDED_ADDRESS.withName("pTag")
		).withName("VkFrameBoundaryEXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
		FRAME_ID_HANDLE = LAYOUT.varHandle(PathElement.groupElement("frameID"));
		IMAGE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("imageCount"));
		P_IMAGES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pImages"));
		BUFFER_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("bufferCount"));
		P_BUFFERS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pBuffers"));
		TAG_NAME_HANDLE = LAYOUT.varHandle(PathElement.groupElement("tagName"));
		TAG_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("tagSize"));
		P_TAG_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pTag"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
		FRAME_ID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("frameID"));
		IMAGE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("imageCount"));
		P_IMAGES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pImages"));
		BUFFER_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("bufferCount"));
		P_BUFFERS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pBuffers"));
		TAG_NAME_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("tagName"));
		TAG_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("tagSize"));
		P_TAG_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pTag"));
		//@formatter:on
	}

	public VkFrameBoundaryEXT() {
	    this(Arena.ofAuto());
	}
	
	public VkFrameBoundaryEXT(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkFrameBoundaryEXT(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkFrameBoundaryEXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkFrameBoundaryEXT pNext(MemorySegment pNext) {
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
    public VkFrameBoundaryEXT flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #frameID()
    public VkFrameBoundaryEXT frameID(long frameID) {
    	FRAME_ID_HANDLE.set(segment, 0L, frameID);
    	return this;
    }
    
    public long frameID() {
    	return (long) FRAME_ID_HANDLE.get(segment, 0L);
    }
    
    /// @see #imageCount()
    public VkFrameBoundaryEXT imageCount(int imageCount) {
    	IMAGE_COUNT_HANDLE.set(segment, 0L, imageCount);
    	return this;
    }
    
    public int imageCount() {
    	return (int) IMAGE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pImages()
    public VkFrameBoundaryEXT pImages(NativePointerArray pImages) {
    	P_IMAGES_HANDLE.set(segment, 0L, pImages.memorySegment());
    	return this;
    }
    
    public @Nullable NativePointerArray pImages() {
    	MemorySegment segment = (MemorySegment) P_IMAGES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativePointerArray(segment);
    }
    
    /// @see #bufferCount()
    public VkFrameBoundaryEXT bufferCount(int bufferCount) {
    	BUFFER_COUNT_HANDLE.set(segment, 0L, bufferCount);
    	return this;
    }
    
    public int bufferCount() {
    	return (int) BUFFER_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pBuffers()
    public VkFrameBoundaryEXT pBuffers(NativePointerArray pBuffers) {
    	P_BUFFERS_HANDLE.set(segment, 0L, pBuffers.memorySegment());
    	return this;
    }
    
    public @Nullable NativePointerArray pBuffers() {
    	MemorySegment segment = (MemorySegment) P_BUFFERS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativePointerArray(segment);
    }
    
    /// @see #tagName()
    public VkFrameBoundaryEXT tagName(long tagName) {
    	TAG_NAME_HANDLE.set(segment, 0L, tagName);
    	return this;
    }
    
    public long tagName() {
    	return (long) TAG_NAME_HANDLE.get(segment, 0L);
    }
    
    /// @see #tagSize()
    public VkFrameBoundaryEXT tagSize(long tagSize) {
    	TAG_SIZE_HANDLE.set(segment, 0L, tagSize);
    	return this;
    }
    
    public long tagSize() {
    	return (long) TAG_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pTag()
    public VkFrameBoundaryEXT pTag(MemorySegment pTag) {
    	P_TAG_HANDLE.set(segment, 0L, pTag);
    	return this;
    }
    
    public @Nullable MemorySegment pTag() {
    	MemorySegment segment = (MemorySegment) P_TAG_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    @Override
    public VkFrameBoundaryEXT set(VkFrameBoundaryEXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkFrameBoundaryEXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkFrameBoundaryEXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkFrameBoundaryEXT> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkFrameBoundaryEXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkFrameBoundaryEXT> array(SegmentAllocator allocator, VkFrameBoundaryEXT... structs) {
        NativeStructArray<VkFrameBoundaryEXT> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkFrameBoundaryEXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkFrameBoundaryEXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkFrameBoundaryEXT(segment)
        );
    }

}