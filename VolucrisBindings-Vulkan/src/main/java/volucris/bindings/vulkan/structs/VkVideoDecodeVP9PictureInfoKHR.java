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

public final class VkVideoDecodeVP9PictureInfoKHR
		implements Struct<VkVideoDecodeVP9PictureInfoKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle P_STD_PICTURE_INFO_HANDLE;
	public static final VarHandle REFERENCE_NAME_SLOT_INDICES_HANDLE;
	public static final VarHandle UNCOMPRESSED_HEADER_OFFSET_HANDLE;
	public static final VarHandle COMPRESSED_HEADER_OFFSET_HANDLE;
	public static final VarHandle TILES_OFFSET_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long P_STD_PICTURE_INFO_BYTE_OFFSET;
	public static final long REFERENCE_NAME_SLOT_INDICES_BYTE_OFFSET;
	public static final long UNCOMPRESSED_HEADER_OFFSET_BYTE_OFFSET;
	public static final long COMPRESSED_HEADER_OFFSET_BYTE_OFFSET;
	public static final long TILES_OFFSET_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    UNBOUNDED_ADDRESS.withName("pStdPictureInfo"),
		    MemoryLayout.sequenceLayout(3, JAVA_INT).withName("referenceNameSlotIndices"),
		    JAVA_INT.withName("uncompressedHeaderOffset"),
		    JAVA_INT.withName("compressedHeaderOffset"),
		    JAVA_INT.withName("tilesOffset")
		).withName("VkVideoDecodeVP9PictureInfoKHR").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		P_STD_PICTURE_INFO_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pStdPictureInfo"));
		REFERENCE_NAME_SLOT_INDICES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("referenceNameSlotIndices"), PathElement.sequenceElement());
		UNCOMPRESSED_HEADER_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("uncompressedHeaderOffset"));
		COMPRESSED_HEADER_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("compressedHeaderOffset"));
		TILES_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("tilesOffset"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		P_STD_PICTURE_INFO_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pStdPictureInfo"));
		REFERENCE_NAME_SLOT_INDICES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("referenceNameSlotIndices"));
		UNCOMPRESSED_HEADER_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("uncompressedHeaderOffset"));
		COMPRESSED_HEADER_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("compressedHeaderOffset"));
		TILES_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("tilesOffset"));
		//@formatter:on
	}

	public VkVideoDecodeVP9PictureInfoKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkVideoDecodeVP9PictureInfoKHR(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkVideoDecodeVP9PictureInfoKHR(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkVideoDecodeVP9PictureInfoKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkVideoDecodeVP9PictureInfoKHR pNext(MemorySegment pNext) {
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
    public VkVideoDecodeVP9PictureInfoKHR pStdPictureInfo(StdVideoDecodeVP9PictureInfo pStdPictureInfo) {
    	P_STD_PICTURE_INFO_HANDLE.set(segment, 0L, pStdPictureInfo.memorySegment());
    	return this;
    }
    
    public @Nullable StdVideoDecodeVP9PictureInfo pStdPictureInfo() {
    	MemorySegment segment = (MemorySegment) P_STD_PICTURE_INFO_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new StdVideoDecodeVP9PictureInfo(segment);
    }
    
    /// @see #referenceNameSlotIndices(int)
    public VkVideoDecodeVP9PictureInfoKHR referenceNameSlotIndices(int referenceNameSlotIndices, int index0) {
    	REFERENCE_NAME_SLOT_INDICES_HANDLE.set(segment, 0L, index0, referenceNameSlotIndices);
    	return this;
    }
    
    public int referenceNameSlotIndices(int index0) {
    	return (int) REFERENCE_NAME_SLOT_INDICES_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #uncompressedHeaderOffset()
    public VkVideoDecodeVP9PictureInfoKHR uncompressedHeaderOffset(int uncompressedHeaderOffset) {
    	UNCOMPRESSED_HEADER_OFFSET_HANDLE.set(segment, 0L, uncompressedHeaderOffset);
    	return this;
    }
    
    public int uncompressedHeaderOffset() {
    	return (int) UNCOMPRESSED_HEADER_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #compressedHeaderOffset()
    public VkVideoDecodeVP9PictureInfoKHR compressedHeaderOffset(int compressedHeaderOffset) {
    	COMPRESSED_HEADER_OFFSET_HANDLE.set(segment, 0L, compressedHeaderOffset);
    	return this;
    }
    
    public int compressedHeaderOffset() {
    	return (int) COMPRESSED_HEADER_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #tilesOffset()
    public VkVideoDecodeVP9PictureInfoKHR tilesOffset(int tilesOffset) {
    	TILES_OFFSET_HANDLE.set(segment, 0L, tilesOffset);
    	return this;
    }
    
    public int tilesOffset() {
    	return (int) TILES_OFFSET_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkVideoDecodeVP9PictureInfoKHR set(VkVideoDecodeVP9PictureInfoKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkVideoDecodeVP9PictureInfoKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkVideoDecodeVP9PictureInfoKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkVideoDecodeVP9PictureInfoKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkVideoDecodeVP9PictureInfoKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkVideoDecodeVP9PictureInfoKHR> array(Arena arena, VkVideoDecodeVP9PictureInfoKHR... structs) {
        NativeStructArray<VkVideoDecodeVP9PictureInfoKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkVideoDecodeVP9PictureInfoKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkVideoDecodeVP9PictureInfoKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkVideoDecodeVP9PictureInfoKHR(segment)
        );
    }

}