/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;

public final class StdVideoH264ScalingLists
		implements Struct<StdVideoH264ScalingLists> {

	public static final StructLayout LAYOUT;

	public static final VarHandle SCALING_LIST_PRESENT_MASK_HANDLE;
	public static final VarHandle USE_DEFAULT_SCALING_MATRIX_MASK_HANDLE;
	public static final VarHandle SCALING_LIST4X4_HANDLE;
	public static final VarHandle SCALING_LIST8X8_HANDLE;

	public static final long SCALING_LIST_PRESENT_MASK_BYTE_OFFSET;
	public static final long USE_DEFAULT_SCALING_MATRIX_MASK_BYTE_OFFSET;
	public static final long SCALING_LIST4X4_BYTE_OFFSET;
	public static final long SCALING_LIST8X8_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_SHORT.withName("scaling_list_present_mask"),
		    JAVA_SHORT.withName("use_default_scaling_matrix_mask"),
		    MemoryLayout.sequenceLayout(6, MemoryLayout.sequenceLayout(16, JAVA_BYTE)).withName("ScalingList4x4"),
		    MemoryLayout.sequenceLayout(6, MemoryLayout.sequenceLayout(64, JAVA_BYTE)).withName("ScalingList8x8")
		).withName("StdVideoH264ScalingLists").withByteAlignment(2);
		
		SCALING_LIST_PRESENT_MASK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("scaling_list_present_mask"));
		USE_DEFAULT_SCALING_MATRIX_MASK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("use_default_scaling_matrix_mask"));
		SCALING_LIST4X4_HANDLE = LAYOUT.varHandle(PathElement.groupElement("ScalingList4x4"), PathElement.sequenceElement(), PathElement.sequenceElement());
		SCALING_LIST8X8_HANDLE = LAYOUT.varHandle(PathElement.groupElement("ScalingList8x8"), PathElement.sequenceElement(), PathElement.sequenceElement());
		
		SCALING_LIST_PRESENT_MASK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("scaling_list_present_mask"));
		USE_DEFAULT_SCALING_MATRIX_MASK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("use_default_scaling_matrix_mask"));
		SCALING_LIST4X4_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("ScalingList4x4"));
		SCALING_LIST8X8_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("ScalingList8x8"));
		//@formatter:on
	}

	public StdVideoH264ScalingLists() {
	    this(Arena.ofAuto());
	}
	
	public StdVideoH264ScalingLists(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public StdVideoH264ScalingLists(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #scaling_list_present_mask()
    public StdVideoH264ScalingLists scaling_list_present_mask(short scaling_list_present_mask) {
    	SCALING_LIST_PRESENT_MASK_HANDLE.set(segment, 0L, scaling_list_present_mask);
    	return this;
    }
    
    public short scaling_list_present_mask() {
    	return (short) SCALING_LIST_PRESENT_MASK_HANDLE.get(segment, 0L);
    }
    
    /// @see #use_default_scaling_matrix_mask()
    public StdVideoH264ScalingLists use_default_scaling_matrix_mask(short use_default_scaling_matrix_mask) {
    	USE_DEFAULT_SCALING_MATRIX_MASK_HANDLE.set(segment, 0L, use_default_scaling_matrix_mask);
    	return this;
    }
    
    public short use_default_scaling_matrix_mask() {
    	return (short) USE_DEFAULT_SCALING_MATRIX_MASK_HANDLE.get(segment, 0L);
    }
    
    /// @see #scalingList4x4(int, int)
    public StdVideoH264ScalingLists scalingList4x4(byte scalingList4x4, int index0, int index1) {
    	SCALING_LIST4X4_HANDLE.set(segment, 0L, index0, index1, scalingList4x4);
    	return this;
    }
    
    public byte scalingList4x4(int index0, int index1) {
    	return (byte) SCALING_LIST4X4_HANDLE.get(segment, 0L, index0, index1);
    }
    
    /// @see #scalingList8x8(int, int)
    public StdVideoH264ScalingLists scalingList8x8(byte scalingList8x8, int index0, int index1) {
    	SCALING_LIST8X8_HANDLE.set(segment, 0L, index0, index1, scalingList8x8);
    	return this;
    }
    
    public byte scalingList8x8(int index0, int index1) {
    	return (byte) SCALING_LIST8X8_HANDLE.get(segment, 0L, index0, index1);
    }
    
    @Override
    public StdVideoH264ScalingLists set(StdVideoH264ScalingLists other) {
        return set(other.segment);
    }
    
    @Override
    public StdVideoH264ScalingLists set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<StdVideoH264ScalingLists> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<StdVideoH264ScalingLists> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new StdVideoH264ScalingLists(segment),
            count
        );
    }
    
    public static NativeStructArray<StdVideoH264ScalingLists> array(SegmentAllocator allocator, StdVideoH264ScalingLists... structs) {
        NativeStructArray<StdVideoH264ScalingLists> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new StdVideoH264ScalingLists(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<StdVideoH264ScalingLists> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new StdVideoH264ScalingLists(segment)
        );
    }

}