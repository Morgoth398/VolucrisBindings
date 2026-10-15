/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;

public final class StdVideoEncodeH264WeightTableFlags
		implements Struct<StdVideoEncodeH264WeightTableFlags> {

	public static final StructLayout LAYOUT;

	public static final VarHandle LUMA_WEIGHT_L0_FLAG_HANDLE;
	public static final VarHandle CHROMA_WEIGHT_L0_FLAG_HANDLE;
	public static final VarHandle LUMA_WEIGHT_L1_FLAG_HANDLE;
	public static final VarHandle CHROMA_WEIGHT_L1_FLAG_HANDLE;

	public static final long LUMA_WEIGHT_L0_FLAG_BYTE_OFFSET;
	public static final long CHROMA_WEIGHT_L0_FLAG_BYTE_OFFSET;
	public static final long LUMA_WEIGHT_L1_FLAG_BYTE_OFFSET;
	public static final long CHROMA_WEIGHT_L1_FLAG_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("luma_weight_l0_flag"),
		    JAVA_INT.withName("chroma_weight_l0_flag"),
		    JAVA_INT.withName("luma_weight_l1_flag"),
		    JAVA_INT.withName("chroma_weight_l1_flag")
		).withName("StdVideoEncodeH264WeightTableFlags").withByteAlignment(4);
		
		LUMA_WEIGHT_L0_FLAG_HANDLE = LAYOUT.varHandle(PathElement.groupElement("luma_weight_l0_flag"));
		CHROMA_WEIGHT_L0_FLAG_HANDLE = LAYOUT.varHandle(PathElement.groupElement("chroma_weight_l0_flag"));
		LUMA_WEIGHT_L1_FLAG_HANDLE = LAYOUT.varHandle(PathElement.groupElement("luma_weight_l1_flag"));
		CHROMA_WEIGHT_L1_FLAG_HANDLE = LAYOUT.varHandle(PathElement.groupElement("chroma_weight_l1_flag"));
		
		LUMA_WEIGHT_L0_FLAG_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("luma_weight_l0_flag"));
		CHROMA_WEIGHT_L0_FLAG_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("chroma_weight_l0_flag"));
		LUMA_WEIGHT_L1_FLAG_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("luma_weight_l1_flag"));
		CHROMA_WEIGHT_L1_FLAG_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("chroma_weight_l1_flag"));
		//@formatter:on
	}

	public StdVideoEncodeH264WeightTableFlags() {
	    this(Arena.ofAuto());
	}
	
	public StdVideoEncodeH264WeightTableFlags(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public StdVideoEncodeH264WeightTableFlags(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #luma_weight_l0_flag()
    public StdVideoEncodeH264WeightTableFlags luma_weight_l0_flag(int luma_weight_l0_flag) {
    	LUMA_WEIGHT_L0_FLAG_HANDLE.set(segment, 0L, luma_weight_l0_flag);
    	return this;
    }
    
    public int luma_weight_l0_flag() {
    	return (int) LUMA_WEIGHT_L0_FLAG_HANDLE.get(segment, 0L);
    }
    
    /// @see #chroma_weight_l0_flag()
    public StdVideoEncodeH264WeightTableFlags chroma_weight_l0_flag(int chroma_weight_l0_flag) {
    	CHROMA_WEIGHT_L0_FLAG_HANDLE.set(segment, 0L, chroma_weight_l0_flag);
    	return this;
    }
    
    public int chroma_weight_l0_flag() {
    	return (int) CHROMA_WEIGHT_L0_FLAG_HANDLE.get(segment, 0L);
    }
    
    /// @see #luma_weight_l1_flag()
    public StdVideoEncodeH264WeightTableFlags luma_weight_l1_flag(int luma_weight_l1_flag) {
    	LUMA_WEIGHT_L1_FLAG_HANDLE.set(segment, 0L, luma_weight_l1_flag);
    	return this;
    }
    
    public int luma_weight_l1_flag() {
    	return (int) LUMA_WEIGHT_L1_FLAG_HANDLE.get(segment, 0L);
    }
    
    /// @see #chroma_weight_l1_flag()
    public StdVideoEncodeH264WeightTableFlags chroma_weight_l1_flag(int chroma_weight_l1_flag) {
    	CHROMA_WEIGHT_L1_FLAG_HANDLE.set(segment, 0L, chroma_weight_l1_flag);
    	return this;
    }
    
    public int chroma_weight_l1_flag() {
    	return (int) CHROMA_WEIGHT_L1_FLAG_HANDLE.get(segment, 0L);
    }
    
    @Override
    public StdVideoEncodeH264WeightTableFlags set(StdVideoEncodeH264WeightTableFlags other) {
        return set(other.segment);
    }
    
    @Override
    public StdVideoEncodeH264WeightTableFlags set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<StdVideoEncodeH264WeightTableFlags> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<StdVideoEncodeH264WeightTableFlags> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new StdVideoEncodeH264WeightTableFlags(segment),
            count
        );
    }
    
    public static NativeStructArray<StdVideoEncodeH264WeightTableFlags> array(Arena arena, StdVideoEncodeH264WeightTableFlags... structs) {
        NativeStructArray<StdVideoEncodeH264WeightTableFlags> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new StdVideoEncodeH264WeightTableFlags(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<StdVideoEncodeH264WeightTableFlags> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new StdVideoEncodeH264WeightTableFlags(segment)
        );
    }

}