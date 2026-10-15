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

public final class VkVideoEncodeH265PictureInfoKHR
		implements Struct<VkVideoEncodeH265PictureInfoKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle NALU_SLICE_SEGMENT_ENTRY_COUNT_HANDLE;
	public static final VarHandle P_NALU_SLICE_SEGMENT_ENTRIES_HANDLE;
	public static final VarHandle P_STD_PICTURE_INFO_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long NALU_SLICE_SEGMENT_ENTRY_COUNT_BYTE_OFFSET;
	public static final long P_NALU_SLICE_SEGMENT_ENTRIES_BYTE_OFFSET;
	public static final long P_STD_PICTURE_INFO_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("naluSliceSegmentEntryCount"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNaluSliceSegmentEntries"),
		    UNBOUNDED_ADDRESS.withName("pStdPictureInfo")
		).withName("VkVideoEncodeH265PictureInfoKHR").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		NALU_SLICE_SEGMENT_ENTRY_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("naluSliceSegmentEntryCount"));
		P_NALU_SLICE_SEGMENT_ENTRIES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNaluSliceSegmentEntries"));
		P_STD_PICTURE_INFO_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pStdPictureInfo"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		NALU_SLICE_SEGMENT_ENTRY_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("naluSliceSegmentEntryCount"));
		P_NALU_SLICE_SEGMENT_ENTRIES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNaluSliceSegmentEntries"));
		P_STD_PICTURE_INFO_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pStdPictureInfo"));
		//@formatter:on
	}

	public VkVideoEncodeH265PictureInfoKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkVideoEncodeH265PictureInfoKHR(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkVideoEncodeH265PictureInfoKHR(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkVideoEncodeH265PictureInfoKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkVideoEncodeH265PictureInfoKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #naluSliceSegmentEntryCount()
    public VkVideoEncodeH265PictureInfoKHR naluSliceSegmentEntryCount(int naluSliceSegmentEntryCount) {
    	NALU_SLICE_SEGMENT_ENTRY_COUNT_HANDLE.set(segment, 0L, naluSliceSegmentEntryCount);
    	return this;
    }
    
    public int naluSliceSegmentEntryCount() {
    	return (int) NALU_SLICE_SEGMENT_ENTRY_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNaluSliceSegmentEntries()
    public VkVideoEncodeH265PictureInfoKHR pNaluSliceSegmentEntries(NativeStructArray<VkVideoEncodeH265NaluSliceSegmentInfoKHR> pNaluSliceSegmentEntries) {
    	P_NALU_SLICE_SEGMENT_ENTRIES_HANDLE.set(segment, 0L, pNaluSliceSegmentEntries.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkVideoEncodeH265NaluSliceSegmentInfoKHR> pNaluSliceSegmentEntries() {
    	MemorySegment segment = (MemorySegment) P_NALU_SLICE_SEGMENT_ENTRIES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkVideoEncodeH265NaluSliceSegmentInfoKHR.array(segment);
    }
    
    /// @see #pStdPictureInfo()
    public VkVideoEncodeH265PictureInfoKHR pStdPictureInfo(StdVideoEncodeH265PictureInfo pStdPictureInfo) {
    	P_STD_PICTURE_INFO_HANDLE.set(segment, 0L, pStdPictureInfo.memorySegment());
    	return this;
    }
    
    public @Nullable StdVideoEncodeH265PictureInfo pStdPictureInfo() {
    	MemorySegment segment = (MemorySegment) P_STD_PICTURE_INFO_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new StdVideoEncodeH265PictureInfo(segment);
    }
    
    @Override
    public VkVideoEncodeH265PictureInfoKHR set(VkVideoEncodeH265PictureInfoKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkVideoEncodeH265PictureInfoKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkVideoEncodeH265PictureInfoKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkVideoEncodeH265PictureInfoKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkVideoEncodeH265PictureInfoKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkVideoEncodeH265PictureInfoKHR> array(Arena arena, VkVideoEncodeH265PictureInfoKHR... structs) {
        NativeStructArray<VkVideoEncodeH265PictureInfoKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkVideoEncodeH265PictureInfoKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkVideoEncodeH265PictureInfoKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkVideoEncodeH265PictureInfoKHR(segment)
        );
    }

}