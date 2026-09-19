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
import volucris.bindings.core.NativeIntArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkVideoDecodeH265PictureInfoKHR
		implements Struct<VkVideoDecodeH265PictureInfoKHR> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle P_STD_PICTURE_INFO_HANDLE;
    public static final VarHandle SLICE_SEGMENT_COUNT_HANDLE;
    public static final VarHandle P_SLICE_SEGMENT_OFFSETS_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long P_STD_PICTURE_INFO_BYTE_OFFSET;
    public static final long SLICE_SEGMENT_COUNT_BYTE_OFFSET;
    public static final long P_SLICE_SEGMENT_OFFSETS_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            UNBOUNDED_ADDRESS.withName("pStdPictureInfo"),
            JAVA_INT.withName("sliceSegmentCount"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pSliceSegmentOffsets")
        ).withName("VkVideoDecodeH265PictureInfoKHR").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        P_STD_PICTURE_INFO_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pStdPictureInfo"));
        SLICE_SEGMENT_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sliceSegmentCount"));
        P_SLICE_SEGMENT_OFFSETS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pSliceSegmentOffsets"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        P_STD_PICTURE_INFO_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pStdPictureInfo"));
        SLICE_SEGMENT_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sliceSegmentCount"));
        P_SLICE_SEGMENT_OFFSETS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pSliceSegmentOffsets"));
        //@formatter:on
    }

    public VkVideoDecodeH265PictureInfoKHR() {
        this(Arena.ofAuto());
    }
    
    public VkVideoDecodeH265PictureInfoKHR(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkVideoDecodeH265PictureInfoKHR(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #sType()
    public VkVideoDecodeH265PictureInfoKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkVideoDecodeH265PictureInfoKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #pStdPictureInfo()
    public VkVideoDecodeH265PictureInfoKHR pStdPictureInfo(StdVideoDecodeH265PictureInfo pStdPictureInfo) {
    	P_STD_PICTURE_INFO_HANDLE.set(segment, 0L, pStdPictureInfo.memorySegment());
    	return this;
    }
    
    public @Nullable StdVideoDecodeH265PictureInfo pStdPictureInfo() {
    	MemorySegment segment = (MemorySegment) P_STD_PICTURE_INFO_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new StdVideoDecodeH265PictureInfo(segment);
    }
    
    /// @see #sliceSegmentCount()
    public VkVideoDecodeH265PictureInfoKHR sliceSegmentCount(int sliceSegmentCount) {
    	SLICE_SEGMENT_COUNT_HANDLE.set(segment, 0L, sliceSegmentCount);
    	return this;
    }
    
    public int sliceSegmentCount() {
    	return (int) SLICE_SEGMENT_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pSliceSegmentOffsets()
    public VkVideoDecodeH265PictureInfoKHR pSliceSegmentOffsets(NativeIntArray pSliceSegmentOffsets) {
    	P_SLICE_SEGMENT_OFFSETS_HANDLE.set(segment, 0L, pSliceSegmentOffsets.memorySegment());
    	return this;
    }
    
    public @Nullable NativeIntArray pSliceSegmentOffsets() {
    	MemorySegment segment = (MemorySegment) P_SLICE_SEGMENT_OFFSETS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeIntArray(segment);
    }
    
    @Override
    public VkVideoDecodeH265PictureInfoKHR set(VkVideoDecodeH265PictureInfoKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkVideoDecodeH265PictureInfoKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkVideoDecodeH265PictureInfoKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkVideoDecodeH265PictureInfoKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkVideoDecodeH265PictureInfoKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkVideoDecodeH265PictureInfoKHR> array(Arena arena, VkVideoDecodeH265PictureInfoKHR... structs) {
        NativeStructArray<VkVideoDecodeH265PictureInfoKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkVideoDecodeH265PictureInfoKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkVideoDecodeH265PictureInfoKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkVideoDecodeH265PictureInfoKHR(segment)
        );
    }
    
}