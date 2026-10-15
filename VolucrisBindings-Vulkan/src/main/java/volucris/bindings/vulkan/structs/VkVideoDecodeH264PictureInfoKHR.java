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

public final class VkVideoDecodeH264PictureInfoKHR
		implements Struct<VkVideoDecodeH264PictureInfoKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle P_STD_PICTURE_INFO_HANDLE;
	public static final VarHandle SLICE_COUNT_HANDLE;
	public static final VarHandle P_SLICE_OFFSETS_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long P_STD_PICTURE_INFO_BYTE_OFFSET;
	public static final long SLICE_COUNT_BYTE_OFFSET;
	public static final long P_SLICE_OFFSETS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    UNBOUNDED_ADDRESS.withName("pStdPictureInfo"),
		    JAVA_INT.withName("sliceCount"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pSliceOffsets")
		).withName("VkVideoDecodeH264PictureInfoKHR").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		P_STD_PICTURE_INFO_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pStdPictureInfo"));
		SLICE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sliceCount"));
		P_SLICE_OFFSETS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pSliceOffsets"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		P_STD_PICTURE_INFO_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pStdPictureInfo"));
		SLICE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sliceCount"));
		P_SLICE_OFFSETS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pSliceOffsets"));
		//@formatter:on
	}

	public VkVideoDecodeH264PictureInfoKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkVideoDecodeH264PictureInfoKHR(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkVideoDecodeH264PictureInfoKHR(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkVideoDecodeH264PictureInfoKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkVideoDecodeH264PictureInfoKHR pNext(MemorySegment pNext) {
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
    public VkVideoDecodeH264PictureInfoKHR pStdPictureInfo(StdVideoDecodeH264PictureInfo pStdPictureInfo) {
    	P_STD_PICTURE_INFO_HANDLE.set(segment, 0L, pStdPictureInfo.memorySegment());
    	return this;
    }
    
    public @Nullable StdVideoDecodeH264PictureInfo pStdPictureInfo() {
    	MemorySegment segment = (MemorySegment) P_STD_PICTURE_INFO_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new StdVideoDecodeH264PictureInfo(segment);
    }
    
    /// @see #sliceCount()
    public VkVideoDecodeH264PictureInfoKHR sliceCount(int sliceCount) {
    	SLICE_COUNT_HANDLE.set(segment, 0L, sliceCount);
    	return this;
    }
    
    public int sliceCount() {
    	return (int) SLICE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pSliceOffsets()
    public VkVideoDecodeH264PictureInfoKHR pSliceOffsets(NativeIntArray pSliceOffsets) {
    	P_SLICE_OFFSETS_HANDLE.set(segment, 0L, pSliceOffsets.memorySegment());
    	return this;
    }
    
    public @Nullable NativeIntArray pSliceOffsets() {
    	MemorySegment segment = (MemorySegment) P_SLICE_OFFSETS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeIntArray(segment);
    }
    
    @Override
    public VkVideoDecodeH264PictureInfoKHR set(VkVideoDecodeH264PictureInfoKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkVideoDecodeH264PictureInfoKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkVideoDecodeH264PictureInfoKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkVideoDecodeH264PictureInfoKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkVideoDecodeH264PictureInfoKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkVideoDecodeH264PictureInfoKHR> array(Arena arena, VkVideoDecodeH264PictureInfoKHR... structs) {
        NativeStructArray<VkVideoDecodeH264PictureInfoKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkVideoDecodeH264PictureInfoKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkVideoDecodeH264PictureInfoKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkVideoDecodeH264PictureInfoKHR(segment)
        );
    }

}