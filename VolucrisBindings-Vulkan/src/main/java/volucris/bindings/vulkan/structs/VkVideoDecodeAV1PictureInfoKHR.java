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

public final class VkVideoDecodeAV1PictureInfoKHR
		implements Struct<VkVideoDecodeAV1PictureInfoKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle P_STD_PICTURE_INFO_HANDLE;
	public static final VarHandle REFERENCE_NAME_SLOT_INDICES_HANDLE;
	public static final VarHandle FRAME_HEADER_OFFSET_HANDLE;
	public static final VarHandle TILE_COUNT_HANDLE;
	public static final VarHandle P_TILE_OFFSETS_HANDLE;
	public static final VarHandle P_TILE_SIZES_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long P_STD_PICTURE_INFO_BYTE_OFFSET;
	public static final long REFERENCE_NAME_SLOT_INDICES_BYTE_OFFSET;
	public static final long FRAME_HEADER_OFFSET_BYTE_OFFSET;
	public static final long TILE_COUNT_BYTE_OFFSET;
	public static final long P_TILE_OFFSETS_BYTE_OFFSET;
	public static final long P_TILE_SIZES_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    UNBOUNDED_ADDRESS.withName("pStdPictureInfo"),
		    MemoryLayout.sequenceLayout(7, JAVA_INT).withName("referenceNameSlotIndices"),
		    JAVA_INT.withName("frameHeaderOffset"),
		    JAVA_INT.withName("tileCount"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pTileOffsets"),
		    UNBOUNDED_ADDRESS.withName("pTileSizes")
		).withName("VkVideoDecodeAV1PictureInfoKHR").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		P_STD_PICTURE_INFO_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pStdPictureInfo"));
		REFERENCE_NAME_SLOT_INDICES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("referenceNameSlotIndices"), PathElement.sequenceElement());
		FRAME_HEADER_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("frameHeaderOffset"));
		TILE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("tileCount"));
		P_TILE_OFFSETS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pTileOffsets"));
		P_TILE_SIZES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pTileSizes"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		P_STD_PICTURE_INFO_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pStdPictureInfo"));
		REFERENCE_NAME_SLOT_INDICES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("referenceNameSlotIndices"));
		FRAME_HEADER_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("frameHeaderOffset"));
		TILE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("tileCount"));
		P_TILE_OFFSETS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pTileOffsets"));
		P_TILE_SIZES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pTileSizes"));
		//@formatter:on
	}

	public VkVideoDecodeAV1PictureInfoKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkVideoDecodeAV1PictureInfoKHR(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkVideoDecodeAV1PictureInfoKHR(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkVideoDecodeAV1PictureInfoKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkVideoDecodeAV1PictureInfoKHR pNext(MemorySegment pNext) {
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
    public VkVideoDecodeAV1PictureInfoKHR pStdPictureInfo(StdVideoDecodeAV1PictureInfo pStdPictureInfo) {
    	P_STD_PICTURE_INFO_HANDLE.set(segment, 0L, pStdPictureInfo.memorySegment());
    	return this;
    }
    
    public @Nullable StdVideoDecodeAV1PictureInfo pStdPictureInfo() {
    	MemorySegment segment = (MemorySegment) P_STD_PICTURE_INFO_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new StdVideoDecodeAV1PictureInfo(segment);
    }
    
    /// @see #referenceNameSlotIndices(int)
    public VkVideoDecodeAV1PictureInfoKHR referenceNameSlotIndices(int referenceNameSlotIndices, int index0) {
    	REFERENCE_NAME_SLOT_INDICES_HANDLE.set(segment, 0L, index0, referenceNameSlotIndices);
    	return this;
    }
    
    public int referenceNameSlotIndices(int index0) {
    	return (int) REFERENCE_NAME_SLOT_INDICES_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #frameHeaderOffset()
    public VkVideoDecodeAV1PictureInfoKHR frameHeaderOffset(int frameHeaderOffset) {
    	FRAME_HEADER_OFFSET_HANDLE.set(segment, 0L, frameHeaderOffset);
    	return this;
    }
    
    public int frameHeaderOffset() {
    	return (int) FRAME_HEADER_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #tileCount()
    public VkVideoDecodeAV1PictureInfoKHR tileCount(int tileCount) {
    	TILE_COUNT_HANDLE.set(segment, 0L, tileCount);
    	return this;
    }
    
    public int tileCount() {
    	return (int) TILE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pTileOffsets()
    public VkVideoDecodeAV1PictureInfoKHR pTileOffsets(NativeIntArray pTileOffsets) {
    	P_TILE_OFFSETS_HANDLE.set(segment, 0L, pTileOffsets.memorySegment());
    	return this;
    }
    
    public @Nullable NativeIntArray pTileOffsets() {
    	MemorySegment segment = (MemorySegment) P_TILE_OFFSETS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeIntArray(segment);
    }
    
    /// @see #pTileSizes()
    public VkVideoDecodeAV1PictureInfoKHR pTileSizes(NativeIntArray pTileSizes) {
    	P_TILE_SIZES_HANDLE.set(segment, 0L, pTileSizes.memorySegment());
    	return this;
    }
    
    public @Nullable NativeIntArray pTileSizes() {
    	MemorySegment segment = (MemorySegment) P_TILE_SIZES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeIntArray(segment);
    }
    
    @Override
    public VkVideoDecodeAV1PictureInfoKHR set(VkVideoDecodeAV1PictureInfoKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkVideoDecodeAV1PictureInfoKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkVideoDecodeAV1PictureInfoKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkVideoDecodeAV1PictureInfoKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkVideoDecodeAV1PictureInfoKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkVideoDecodeAV1PictureInfoKHR> array(Arena arena, VkVideoDecodeAV1PictureInfoKHR... structs) {
        NativeStructArray<VkVideoDecodeAV1PictureInfoKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkVideoDecodeAV1PictureInfoKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkVideoDecodeAV1PictureInfoKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkVideoDecodeAV1PictureInfoKHR(segment)
        );
    }

}