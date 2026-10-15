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

public final class VkVideoEncodeH264PictureInfoKHR
		implements Struct<VkVideoEncodeH264PictureInfoKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle NALU_SLICE_ENTRY_COUNT_HANDLE;
	public static final VarHandle P_NALU_SLICE_ENTRIES_HANDLE;
	public static final VarHandle P_STD_PICTURE_INFO_HANDLE;
	public static final VarHandle GENERATE_PREFIX_NALU_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long NALU_SLICE_ENTRY_COUNT_BYTE_OFFSET;
	public static final long P_NALU_SLICE_ENTRIES_BYTE_OFFSET;
	public static final long P_STD_PICTURE_INFO_BYTE_OFFSET;
	public static final long GENERATE_PREFIX_NALU_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("naluSliceEntryCount"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNaluSliceEntries"),
		    UNBOUNDED_ADDRESS.withName("pStdPictureInfo"),
		    JAVA_INT.withName("generatePrefixNalu"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkVideoEncodeH264PictureInfoKHR").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		NALU_SLICE_ENTRY_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("naluSliceEntryCount"));
		P_NALU_SLICE_ENTRIES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNaluSliceEntries"));
		P_STD_PICTURE_INFO_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pStdPictureInfo"));
		GENERATE_PREFIX_NALU_HANDLE = LAYOUT.varHandle(PathElement.groupElement("generatePrefixNalu"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		NALU_SLICE_ENTRY_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("naluSliceEntryCount"));
		P_NALU_SLICE_ENTRIES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNaluSliceEntries"));
		P_STD_PICTURE_INFO_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pStdPictureInfo"));
		GENERATE_PREFIX_NALU_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("generatePrefixNalu"));
		//@formatter:on
	}

	public VkVideoEncodeH264PictureInfoKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkVideoEncodeH264PictureInfoKHR(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkVideoEncodeH264PictureInfoKHR(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkVideoEncodeH264PictureInfoKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkVideoEncodeH264PictureInfoKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #naluSliceEntryCount()
    public VkVideoEncodeH264PictureInfoKHR naluSliceEntryCount(int naluSliceEntryCount) {
    	NALU_SLICE_ENTRY_COUNT_HANDLE.set(segment, 0L, naluSliceEntryCount);
    	return this;
    }
    
    public int naluSliceEntryCount() {
    	return (int) NALU_SLICE_ENTRY_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNaluSliceEntries()
    public VkVideoEncodeH264PictureInfoKHR pNaluSliceEntries(NativeStructArray<VkVideoEncodeH264NaluSliceInfoKHR> pNaluSliceEntries) {
    	P_NALU_SLICE_ENTRIES_HANDLE.set(segment, 0L, pNaluSliceEntries.memorySegment());
    	return this;
    }
    
    public @Nullable NativeStructArray<VkVideoEncodeH264NaluSliceInfoKHR> pNaluSliceEntries() {
    	MemorySegment segment = (MemorySegment) P_NALU_SLICE_ENTRIES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return VkVideoEncodeH264NaluSliceInfoKHR.array(segment);
    }
    
    /// @see #pStdPictureInfo()
    public VkVideoEncodeH264PictureInfoKHR pStdPictureInfo(StdVideoEncodeH264PictureInfo pStdPictureInfo) {
    	P_STD_PICTURE_INFO_HANDLE.set(segment, 0L, pStdPictureInfo.memorySegment());
    	return this;
    }
    
    public @Nullable StdVideoEncodeH264PictureInfo pStdPictureInfo() {
    	MemorySegment segment = (MemorySegment) P_STD_PICTURE_INFO_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new StdVideoEncodeH264PictureInfo(segment);
    }
    
    /// @see #generatePrefixNalu()
    public VkVideoEncodeH264PictureInfoKHR generatePrefixNalu(int generatePrefixNalu) {
    	GENERATE_PREFIX_NALU_HANDLE.set(segment, 0L, generatePrefixNalu);
    	return this;
    }
    
    public int generatePrefixNalu() {
    	return (int) GENERATE_PREFIX_NALU_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkVideoEncodeH264PictureInfoKHR set(VkVideoEncodeH264PictureInfoKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkVideoEncodeH264PictureInfoKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkVideoEncodeH264PictureInfoKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkVideoEncodeH264PictureInfoKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkVideoEncodeH264PictureInfoKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkVideoEncodeH264PictureInfoKHR> array(Arena arena, VkVideoEncodeH264PictureInfoKHR... structs) {
        NativeStructArray<VkVideoEncodeH264PictureInfoKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkVideoEncodeH264PictureInfoKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkVideoEncodeH264PictureInfoKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkVideoEncodeH264PictureInfoKHR(segment)
        );
    }

}