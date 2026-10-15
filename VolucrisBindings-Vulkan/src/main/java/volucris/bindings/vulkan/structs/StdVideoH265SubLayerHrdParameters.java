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

public final class StdVideoH265SubLayerHrdParameters
		implements Struct<StdVideoH265SubLayerHrdParameters> {

	public static final StructLayout LAYOUT;

	public static final VarHandle BIT_RATE_VALUE_MINUS1_HANDLE;
	public static final VarHandle CPB_SIZE_VALUE_MINUS1_HANDLE;
	public static final VarHandle CPB_SIZE_DU_VALUE_MINUS1_HANDLE;
	public static final VarHandle BIT_RATE_DU_VALUE_MINUS1_HANDLE;
	public static final VarHandle CBR_FLAG_HANDLE;

	public static final long BIT_RATE_VALUE_MINUS1_BYTE_OFFSET;
	public static final long CPB_SIZE_VALUE_MINUS1_BYTE_OFFSET;
	public static final long CPB_SIZE_DU_VALUE_MINUS1_BYTE_OFFSET;
	public static final long BIT_RATE_DU_VALUE_MINUS1_BYTE_OFFSET;
	public static final long CBR_FLAG_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    MemoryLayout.sequenceLayout(32, JAVA_INT).withName("bit_rate_value_minus1"),
		    MemoryLayout.sequenceLayout(32, JAVA_INT).withName("cpb_size_value_minus1"),
		    MemoryLayout.sequenceLayout(32, JAVA_INT).withName("cpb_size_du_value_minus1"),
		    MemoryLayout.sequenceLayout(32, JAVA_INT).withName("bit_rate_du_value_minus1"),
		    JAVA_INT.withName("cbr_flag")
		).withName("StdVideoH265SubLayerHrdParameters").withByteAlignment(4);
		
		BIT_RATE_VALUE_MINUS1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("bit_rate_value_minus1"), PathElement.sequenceElement());
		CPB_SIZE_VALUE_MINUS1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("cpb_size_value_minus1"), PathElement.sequenceElement());
		CPB_SIZE_DU_VALUE_MINUS1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("cpb_size_du_value_minus1"), PathElement.sequenceElement());
		BIT_RATE_DU_VALUE_MINUS1_HANDLE = LAYOUT.varHandle(PathElement.groupElement("bit_rate_du_value_minus1"), PathElement.sequenceElement());
		CBR_FLAG_HANDLE = LAYOUT.varHandle(PathElement.groupElement("cbr_flag"));
		
		BIT_RATE_VALUE_MINUS1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("bit_rate_value_minus1"));
		CPB_SIZE_VALUE_MINUS1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("cpb_size_value_minus1"));
		CPB_SIZE_DU_VALUE_MINUS1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("cpb_size_du_value_minus1"));
		BIT_RATE_DU_VALUE_MINUS1_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("bit_rate_du_value_minus1"));
		CBR_FLAG_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("cbr_flag"));
		//@formatter:on
	}

	public StdVideoH265SubLayerHrdParameters() {
	    this(Arena.ofAuto());
	}
	
	public StdVideoH265SubLayerHrdParameters(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public StdVideoH265SubLayerHrdParameters(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #bit_rate_value_minus1(int)
    public StdVideoH265SubLayerHrdParameters bit_rate_value_minus1(int bit_rate_value_minus1, int index0) {
    	BIT_RATE_VALUE_MINUS1_HANDLE.set(segment, 0L, index0, bit_rate_value_minus1);
    	return this;
    }
    
    public int bit_rate_value_minus1(int index0) {
    	return (int) BIT_RATE_VALUE_MINUS1_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #cpb_size_value_minus1(int)
    public StdVideoH265SubLayerHrdParameters cpb_size_value_minus1(int cpb_size_value_minus1, int index0) {
    	CPB_SIZE_VALUE_MINUS1_HANDLE.set(segment, 0L, index0, cpb_size_value_minus1);
    	return this;
    }
    
    public int cpb_size_value_minus1(int index0) {
    	return (int) CPB_SIZE_VALUE_MINUS1_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #cpb_size_du_value_minus1(int)
    public StdVideoH265SubLayerHrdParameters cpb_size_du_value_minus1(int cpb_size_du_value_minus1, int index0) {
    	CPB_SIZE_DU_VALUE_MINUS1_HANDLE.set(segment, 0L, index0, cpb_size_du_value_minus1);
    	return this;
    }
    
    public int cpb_size_du_value_minus1(int index0) {
    	return (int) CPB_SIZE_DU_VALUE_MINUS1_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #bit_rate_du_value_minus1(int)
    public StdVideoH265SubLayerHrdParameters bit_rate_du_value_minus1(int bit_rate_du_value_minus1, int index0) {
    	BIT_RATE_DU_VALUE_MINUS1_HANDLE.set(segment, 0L, index0, bit_rate_du_value_minus1);
    	return this;
    }
    
    public int bit_rate_du_value_minus1(int index0) {
    	return (int) BIT_RATE_DU_VALUE_MINUS1_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #cbr_flag()
    public StdVideoH265SubLayerHrdParameters cbr_flag(int cbr_flag) {
    	CBR_FLAG_HANDLE.set(segment, 0L, cbr_flag);
    	return this;
    }
    
    public int cbr_flag() {
    	return (int) CBR_FLAG_HANDLE.get(segment, 0L);
    }
    
    @Override
    public StdVideoH265SubLayerHrdParameters set(StdVideoH265SubLayerHrdParameters other) {
        return set(other.segment);
    }
    
    @Override
    public StdVideoH265SubLayerHrdParameters set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<StdVideoH265SubLayerHrdParameters> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<StdVideoH265SubLayerHrdParameters> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new StdVideoH265SubLayerHrdParameters(segment),
            count
        );
    }
    
    public static NativeStructArray<StdVideoH265SubLayerHrdParameters> array(Arena arena, StdVideoH265SubLayerHrdParameters... structs) {
        NativeStructArray<StdVideoH265SubLayerHrdParameters> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new StdVideoH265SubLayerHrdParameters(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<StdVideoH265SubLayerHrdParameters> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new StdVideoH265SubLayerHrdParameters(segment)
        );
    }

}