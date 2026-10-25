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

public final class VkCopyImageToImageInfo
		implements Struct<VkCopyImageToImageInfo> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle FLAGS_HANDLE;
	public static final VarHandle SRC_IMAGE_HANDLE;
	public static final VarHandle SRC_IMAGE_LAYOUT_HANDLE;
	public static final VarHandle DST_IMAGE_HANDLE;
	public static final VarHandle DST_IMAGE_LAYOUT_HANDLE;
	public static final VarHandle REGION_COUNT_HANDLE;
	public static final VarHandle P_REGIONS_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long FLAGS_BYTE_OFFSET;
	public static final long SRC_IMAGE_BYTE_OFFSET;
	public static final long SRC_IMAGE_LAYOUT_BYTE_OFFSET;
	public static final long DST_IMAGE_BYTE_OFFSET;
	public static final long DST_IMAGE_LAYOUT_BYTE_OFFSET;
	public static final long REGION_COUNT_BYTE_OFFSET;
	public static final long P_REGIONS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("flags"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("srcImage"),
		    JAVA_INT.withName("srcImageLayout"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("dstImage"),
		    JAVA_INT.withName("dstImageLayout"),
		    JAVA_INT.withName("regionCount"),
		    UNBOUNDED_ADDRESS.withName("pRegions")
		).withName("VkCopyImageToImageInfo").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
		SRC_IMAGE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("srcImage"));
		SRC_IMAGE_LAYOUT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("srcImageLayout"));
		DST_IMAGE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("dstImage"));
		DST_IMAGE_LAYOUT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("dstImageLayout"));
		REGION_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("regionCount"));
		P_REGIONS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pRegions"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
		SRC_IMAGE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("srcImage"));
		SRC_IMAGE_LAYOUT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("srcImageLayout"));
		DST_IMAGE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dstImage"));
		DST_IMAGE_LAYOUT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dstImageLayout"));
		REGION_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("regionCount"));
		P_REGIONS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pRegions"));
		//@formatter:on
	}

	public VkCopyImageToImageInfo() {
	    this(Arena.ofAuto());
	}
	
	public VkCopyImageToImageInfo(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkCopyImageToImageInfo(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkCopyImageToImageInfo sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkCopyImageToImageInfo pNext(MemorySegment pNext) {
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
    public VkCopyImageToImageInfo flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #srcImage()
    public VkCopyImageToImageInfo srcImage(VkImage srcImage) {
    	SRC_IMAGE_HANDLE.set(segment, 0L, srcImage.memorySegment());
    	return this;
    }
    
    public @Nullable VkImage srcImage() {
    	MemorySegment segment = (MemorySegment) SRC_IMAGE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkImage(segment);
    }
    
    /// @see #srcImageLayout()
    public VkCopyImageToImageInfo srcImageLayout(int srcImageLayout) {
    	SRC_IMAGE_LAYOUT_HANDLE.set(segment, 0L, srcImageLayout);
    	return this;
    }
    
    public int srcImageLayout() {
    	return (int) SRC_IMAGE_LAYOUT_HANDLE.get(segment, 0L);
    }
    
    /// @see #dstImage()
    public VkCopyImageToImageInfo dstImage(VkImage dstImage) {
    	DST_IMAGE_HANDLE.set(segment, 0L, dstImage.memorySegment());
    	return this;
    }
    
    public @Nullable VkImage dstImage() {
    	MemorySegment segment = (MemorySegment) DST_IMAGE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkImage(segment);
    }
    
    /// @see #dstImageLayout()
    public VkCopyImageToImageInfo dstImageLayout(int dstImageLayout) {
    	DST_IMAGE_LAYOUT_HANDLE.set(segment, 0L, dstImageLayout);
    	return this;
    }
    
    public int dstImageLayout() {
    	return (int) DST_IMAGE_LAYOUT_HANDLE.get(segment, 0L);
    }
    
    /// @see #regionCount()
    public VkCopyImageToImageInfo regionCount(int regionCount) {
    	REGION_COUNT_HANDLE.set(segment, 0L, regionCount);
    	return this;
    }
    
    public int regionCount() {
    	return (int) REGION_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pRegions()
    public VkCopyImageToImageInfo pRegions(NativeStructArray<VkImageCopy2> pRegions) {
    	P_REGIONS_HANDLE.set(segment, 0L, pRegions.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkImageCopy2> pRegions() {
    	MemorySegment segment = (MemorySegment) P_REGIONS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkImageCopy2.array(segment);
    }
    
    @Override
    public VkCopyImageToImageInfo set(VkCopyImageToImageInfo other) {
        return set(other.segment);
    }
    
    @Override
    public VkCopyImageToImageInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkCopyImageToImageInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkCopyImageToImageInfo> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkCopyImageToImageInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<VkCopyImageToImageInfo> array(SegmentAllocator allocator, VkCopyImageToImageInfo... structs) {
        NativeStructArray<VkCopyImageToImageInfo> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkCopyImageToImageInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkCopyImageToImageInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkCopyImageToImageInfo(segment)
        );
    }

}