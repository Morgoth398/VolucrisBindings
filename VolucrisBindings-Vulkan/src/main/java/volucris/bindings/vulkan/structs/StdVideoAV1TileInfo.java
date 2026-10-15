/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeShortArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class StdVideoAV1TileInfo
		implements Struct<StdVideoAV1TileInfo> {

	public static final StructLayout LAYOUT;

	public static final VarHandle TILE_COLS_HANDLE;
	public static final VarHandle TILE_ROWS_HANDLE;
	public static final VarHandle CONTEXT_UPDATE_TILE_ID_HANDLE;
	public static final VarHandle TILE_SIZE_BYTES_MINUS_1_HANDLE;
	public static final VarHandle RESERVED1_HANDLE;
	public static final VarHandle P_MI_COL_STARTS_HANDLE;
	public static final VarHandle P_MI_ROW_STARTS_HANDLE;
	public static final VarHandle P_WIDTH_IN_SBS_MINUS1_HANDLE;
	public static final VarHandle P_HEIGHT_IN_SBS_MINUS1_HANDLE;

	public static final long FLAGS_BYTE_OFFSET;
	public static final long TILE_COLS_BYTE_OFFSET;
	public static final long TILE_ROWS_BYTE_OFFSET;
	public static final long CONTEXT_UPDATE_TILE_ID_BYTE_OFFSET;
	public static final long TILE_SIZE_BYTES_MINUS_1_BYTE_OFFSET;
	public static final long RESERVED1_BYTE_OFFSET;
	public static final long P_MI_COL_STARTS_BYTE_OFFSET;
	public static final long P_MI_ROW_STARTS_BYTE_OFFSET;
	public static final long P_WIDTH_IN_SBS_MINUS1_BYTE_OFFSET;
	public static final long P_HEIGHT_IN_SBS_MINUS1_BYTE_OFFSET;

	private final MemorySegment segment;

	private final StdVideoAV1TileInfoFlags flags;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    StdVideoAV1TileInfoFlags.LAYOUT.withName("flags"),
		    JAVA_BYTE.withName("TileCols"),
		    JAVA_BYTE.withName("TileRows"),
		    JAVA_SHORT.withName("context_update_tile_id"),
		    JAVA_BYTE.withName("tile_size_bytes_minus_1"),
		    MemoryLayout.sequenceLayout(7, JAVA_BYTE).withName("reserved1"),
		    UNBOUNDED_ADDRESS.withName("pMiColStarts"),
		    UNBOUNDED_ADDRESS.withName("pMiRowStarts"),
		    UNBOUNDED_ADDRESS.withName("pWidthInSbsMinus1"),
		    UNBOUNDED_ADDRESS.withName("pHeightInSbsMinus1")
		).withName("StdVideoAV1TileInfo").withByteAlignment(8);
		
		TILE_COLS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("TileCols"));
		TILE_ROWS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("TileRows"));
		CONTEXT_UPDATE_TILE_ID_HANDLE = LAYOUT.varHandle(PathElement.groupElement("context_update_tile_id"));
		TILE_SIZE_BYTES_MINUS_1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("tile_size_bytes_minus_1"));
		RESERVED1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("reserved1"), PathElement.sequenceElement());
		P_MI_COL_STARTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pMiColStarts"));
		P_MI_ROW_STARTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pMiRowStarts"));
		P_WIDTH_IN_SBS_MINUS1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pWidthInSbsMinus1"));
		P_HEIGHT_IN_SBS_MINUS1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pHeightInSbsMinus1"));
		
		FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
		TILE_COLS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("TileCols"));
		TILE_ROWS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("TileRows"));
		CONTEXT_UPDATE_TILE_ID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("context_update_tile_id"));
		TILE_SIZE_BYTES_MINUS_1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("tile_size_bytes_minus_1"));
		RESERVED1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("reserved1"));
		P_MI_COL_STARTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pMiColStarts"));
		P_MI_ROW_STARTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pMiRowStarts"));
		P_WIDTH_IN_SBS_MINUS1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pWidthInSbsMinus1"));
		P_HEIGHT_IN_SBS_MINUS1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pHeightInSbsMinus1"));
		//@formatter:on
	}

	public StdVideoAV1TileInfo() {
	    this(Arena.ofAuto());
	}
	
	public StdVideoAV1TileInfo(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public StdVideoAV1TileInfo(MemorySegment segment) {
	    this.segment = segment;
	
	    flags = new StdVideoAV1TileInfoFlags(segment.asSlice(FLAGS_BYTE_OFFSET, StdVideoAV1TileInfoFlags.LAYOUT));
	}

    /// @see #flags()
    public StdVideoAV1TileInfo flags(Consumer<StdVideoAV1TileInfoFlags> consumer) {
    	consumer.accept(flags);
    	return this;
    }
    
    /// @see #flags()
    public StdVideoAV1TileInfo flags(StdVideoAV1TileInfoFlags other) {
    	flags.set(other);
    	return this;
    }
    
    public StdVideoAV1TileInfoFlags flags() {
    	return flags;
    }
    
    /// @see #tileCols()
    public StdVideoAV1TileInfo tileCols(byte tileCols) {
    	TILE_COLS_HANDLE.set(segment, 0L, tileCols);
    	return this;
    }
    
    public byte tileCols() {
    	return (byte) TILE_COLS_HANDLE.get(segment, 0L);
    }
    
    /// @see #tileRows()
    public StdVideoAV1TileInfo tileRows(byte tileRows) {
    	TILE_ROWS_HANDLE.set(segment, 0L, tileRows);
    	return this;
    }
    
    public byte tileRows() {
    	return (byte) TILE_ROWS_HANDLE.get(segment, 0L);
    }
    
    /// @see #context_update_tile_id()
    public StdVideoAV1TileInfo context_update_tile_id(short context_update_tile_id) {
    	CONTEXT_UPDATE_TILE_ID_HANDLE.set(segment, 0L, context_update_tile_id);
    	return this;
    }
    
    public short context_update_tile_id() {
    	return (short) CONTEXT_UPDATE_TILE_ID_HANDLE.get(segment, 0L);
    }
    
    /// @see #tile_size_bytes_minus_1()
    public StdVideoAV1TileInfo tile_size_bytes_minus_1(byte tile_size_bytes_minus_1) {
    	TILE_SIZE_BYTES_MINUS_1_HANDLE.set(segment, 0L, tile_size_bytes_minus_1);
    	return this;
    }
    
    public byte tile_size_bytes_minus_1() {
    	return (byte) TILE_SIZE_BYTES_MINUS_1_HANDLE.get(segment, 0L);
    }
    
    /// @see #reserved1(int)
    public StdVideoAV1TileInfo reserved1(byte reserved1, int index0) {
    	RESERVED1_HANDLE.set(segment, 0L, index0, reserved1);
    	return this;
    }
    
    public byte reserved1(int index0) {
    	return (byte) RESERVED1_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #pMiColStarts()
    public StdVideoAV1TileInfo pMiColStarts(NativeShortArray pMiColStarts) {
    	P_MI_COL_STARTS_HANDLE.set(segment, 0L, pMiColStarts.memorySegment());
    	return this;
    }
    
    public @Nullable NativeShortArray pMiColStarts() {
    	MemorySegment segment = (MemorySegment) P_MI_COL_STARTS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeShortArray(segment);
    }
    
    /// @see #pMiRowStarts()
    public StdVideoAV1TileInfo pMiRowStarts(NativeShortArray pMiRowStarts) {
    	P_MI_ROW_STARTS_HANDLE.set(segment, 0L, pMiRowStarts.memorySegment());
    	return this;
    }
    
    public @Nullable NativeShortArray pMiRowStarts() {
    	MemorySegment segment = (MemorySegment) P_MI_ROW_STARTS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeShortArray(segment);
    }
    
    /// @see #pWidthInSbsMinus1()
    public StdVideoAV1TileInfo pWidthInSbsMinus1(NativeShortArray pWidthInSbsMinus1) {
    	P_WIDTH_IN_SBS_MINUS1_HANDLE.set(segment, 0L, pWidthInSbsMinus1.memorySegment());
    	return this;
    }
    
    public @Nullable NativeShortArray pWidthInSbsMinus1() {
    	MemorySegment segment = (MemorySegment) P_WIDTH_IN_SBS_MINUS1_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeShortArray(segment);
    }
    
    /// @see #pHeightInSbsMinus1()
    public StdVideoAV1TileInfo pHeightInSbsMinus1(NativeShortArray pHeightInSbsMinus1) {
    	P_HEIGHT_IN_SBS_MINUS1_HANDLE.set(segment, 0L, pHeightInSbsMinus1.memorySegment());
    	return this;
    }
    
    public @Nullable NativeShortArray pHeightInSbsMinus1() {
    	MemorySegment segment = (MemorySegment) P_HEIGHT_IN_SBS_MINUS1_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeShortArray(segment);
    }
    
    @Override
    public StdVideoAV1TileInfo set(StdVideoAV1TileInfo other) {
        return set(other.segment);
    }
    
    @Override
    public StdVideoAV1TileInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<StdVideoAV1TileInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<StdVideoAV1TileInfo> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new StdVideoAV1TileInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<StdVideoAV1TileInfo> array(Arena arena, StdVideoAV1TileInfo... structs) {
        NativeStructArray<StdVideoAV1TileInfo> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new StdVideoAV1TileInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<StdVideoAV1TileInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new StdVideoAV1TileInfo(segment)
        );
    }

}