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

public final class VkTensorExplicitTilingFormatPropertiesARM
		implements Struct<VkTensorExplicitTilingFormatPropertiesARM> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle BRICK16_TILING_TENSOR_FEATURES_HANDLE;
	public static final VarHandle BRICK8_TILING_TENSOR_FEATURES_HANDLE;
	public static final VarHandle BRICK4_TILING_TENSOR_FEATURES_HANDLE;
	public static final VarHandle BLOCK_UTILING_TENSOR_FEATURES_HANDLE;
	public static final VarHandle BLOCK_U64K_TILING_TENSOR_FEATURES_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long BRICK16_TILING_TENSOR_FEATURES_BYTE_OFFSET;
	public static final long BRICK8_TILING_TENSOR_FEATURES_BYTE_OFFSET;
	public static final long BRICK4_TILING_TENSOR_FEATURES_BYTE_OFFSET;
	public static final long BLOCK_UTILING_TENSOR_FEATURES_BYTE_OFFSET;
	public static final long BLOCK_U64K_TILING_TENSOR_FEATURES_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_LONG.withName("brick16TilingTensorFeatures"),
		    JAVA_LONG.withName("brick8TilingTensorFeatures"),
		    JAVA_LONG.withName("brick4TilingTensorFeatures"),
		    JAVA_LONG.withName("blockUTilingTensorFeatures"),
		    JAVA_LONG.withName("blockU64kTilingTensorFeatures")
		).withName("VkTensorExplicitTilingFormatPropertiesARM").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		BRICK16_TILING_TENSOR_FEATURES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("brick16TilingTensorFeatures"));
		BRICK8_TILING_TENSOR_FEATURES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("brick8TilingTensorFeatures"));
		BRICK4_TILING_TENSOR_FEATURES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("brick4TilingTensorFeatures"));
		BLOCK_UTILING_TENSOR_FEATURES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("blockUTilingTensorFeatures"));
		BLOCK_U64K_TILING_TENSOR_FEATURES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("blockU64kTilingTensorFeatures"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		BRICK16_TILING_TENSOR_FEATURES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("brick16TilingTensorFeatures"));
		BRICK8_TILING_TENSOR_FEATURES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("brick8TilingTensorFeatures"));
		BRICK4_TILING_TENSOR_FEATURES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("brick4TilingTensorFeatures"));
		BLOCK_UTILING_TENSOR_FEATURES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("blockUTilingTensorFeatures"));
		BLOCK_U64K_TILING_TENSOR_FEATURES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("blockU64kTilingTensorFeatures"));
		//@formatter:on
	}

	public VkTensorExplicitTilingFormatPropertiesARM() {
	    this(Arena.ofAuto());
	}
	
	public VkTensorExplicitTilingFormatPropertiesARM(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkTensorExplicitTilingFormatPropertiesARM(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkTensorExplicitTilingFormatPropertiesARM sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkTensorExplicitTilingFormatPropertiesARM pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #brick16TilingTensorFeatures()
    public VkTensorExplicitTilingFormatPropertiesARM brick16TilingTensorFeatures(long brick16TilingTensorFeatures) {
    	BRICK16_TILING_TENSOR_FEATURES_HANDLE.set(segment, 0L, brick16TilingTensorFeatures);
    	return this;
    }
    
    public long brick16TilingTensorFeatures() {
    	return (long) BRICK16_TILING_TENSOR_FEATURES_HANDLE.get(segment, 0L);
    }
    
    /// @see #brick8TilingTensorFeatures()
    public VkTensorExplicitTilingFormatPropertiesARM brick8TilingTensorFeatures(long brick8TilingTensorFeatures) {
    	BRICK8_TILING_TENSOR_FEATURES_HANDLE.set(segment, 0L, brick8TilingTensorFeatures);
    	return this;
    }
    
    public long brick8TilingTensorFeatures() {
    	return (long) BRICK8_TILING_TENSOR_FEATURES_HANDLE.get(segment, 0L);
    }
    
    /// @see #brick4TilingTensorFeatures()
    public VkTensorExplicitTilingFormatPropertiesARM brick4TilingTensorFeatures(long brick4TilingTensorFeatures) {
    	BRICK4_TILING_TENSOR_FEATURES_HANDLE.set(segment, 0L, brick4TilingTensorFeatures);
    	return this;
    }
    
    public long brick4TilingTensorFeatures() {
    	return (long) BRICK4_TILING_TENSOR_FEATURES_HANDLE.get(segment, 0L);
    }
    
    /// @see #blockUTilingTensorFeatures()
    public VkTensorExplicitTilingFormatPropertiesARM blockUTilingTensorFeatures(long blockUTilingTensorFeatures) {
    	BLOCK_UTILING_TENSOR_FEATURES_HANDLE.set(segment, 0L, blockUTilingTensorFeatures);
    	return this;
    }
    
    public long blockUTilingTensorFeatures() {
    	return (long) BLOCK_UTILING_TENSOR_FEATURES_HANDLE.get(segment, 0L);
    }
    
    /// @see #blockU64kTilingTensorFeatures()
    public VkTensorExplicitTilingFormatPropertiesARM blockU64kTilingTensorFeatures(long blockU64kTilingTensorFeatures) {
    	BLOCK_U64K_TILING_TENSOR_FEATURES_HANDLE.set(segment, 0L, blockU64kTilingTensorFeatures);
    	return this;
    }
    
    public long blockU64kTilingTensorFeatures() {
    	return (long) BLOCK_U64K_TILING_TENSOR_FEATURES_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkTensorExplicitTilingFormatPropertiesARM set(VkTensorExplicitTilingFormatPropertiesARM other) {
        return set(other.segment);
    }
    
    @Override
    public VkTensorExplicitTilingFormatPropertiesARM set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkTensorExplicitTilingFormatPropertiesARM> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkTensorExplicitTilingFormatPropertiesARM> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkTensorExplicitTilingFormatPropertiesARM(segment),
            count
        );
    }
    
    public static NativeStructArray<VkTensorExplicitTilingFormatPropertiesARM> array(Arena arena, VkTensorExplicitTilingFormatPropertiesARM... structs) {
        NativeStructArray<VkTensorExplicitTilingFormatPropertiesARM> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkTensorExplicitTilingFormatPropertiesARM(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkTensorExplicitTilingFormatPropertiesARM> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkTensorExplicitTilingFormatPropertiesARM(segment)
        );
    }

}