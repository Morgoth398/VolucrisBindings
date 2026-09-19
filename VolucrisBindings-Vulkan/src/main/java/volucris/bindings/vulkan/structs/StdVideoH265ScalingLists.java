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

public final class StdVideoH265ScalingLists
		implements Struct<StdVideoH265ScalingLists> {

    public static final StructLayout LAYOUT;

    public static final VarHandle SCALING_LIST4X4_HANDLE;
    public static final VarHandle SCALING_LIST8X8_HANDLE;
    public static final VarHandle SCALING_LIST16X16_HANDLE;
    public static final VarHandle SCALING_LIST32X32_HANDLE;
    public static final VarHandle SCALING_LIST_DCCOEF16X16_HANDLE;
    public static final VarHandle SCALING_LIST_DCCOEF32X32_HANDLE;

    public static final long SCALING_LIST4X4_BYTE_OFFSET;
    public static final long SCALING_LIST8X8_BYTE_OFFSET;
    public static final long SCALING_LIST16X16_BYTE_OFFSET;
    public static final long SCALING_LIST32X32_BYTE_OFFSET;
    public static final long SCALING_LIST_DCCOEF16X16_BYTE_OFFSET;
    public static final long SCALING_LIST_DCCOEF32X32_BYTE_OFFSET;

    private final MemorySegment segment;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(6, MemoryLayout.sequenceLayout(16, JAVA_BYTE)).withName("ScalingList4x4"),
            MemoryLayout.sequenceLayout(6, MemoryLayout.sequenceLayout(64, JAVA_BYTE)).withName("ScalingList8x8"),
            MemoryLayout.sequenceLayout(6, MemoryLayout.sequenceLayout(64, JAVA_BYTE)).withName("ScalingList16x16"),
            MemoryLayout.sequenceLayout(2, MemoryLayout.sequenceLayout(64, JAVA_BYTE)).withName("ScalingList32x32"),
            MemoryLayout.sequenceLayout(6, JAVA_BYTE).withName("ScalingListDCCoef16x16"),
            MemoryLayout.sequenceLayout(2, JAVA_BYTE).withName("ScalingListDCCoef32x32")
        ).withName("StdVideoH265ScalingLists").withByteAlignment(1);
        
        SCALING_LIST4X4_HANDLE = LAYOUT.varHandle(PathElement.groupElement("ScalingList4x4"), PathElement.sequenceElement(), PathElement.sequenceElement());
        SCALING_LIST8X8_HANDLE = LAYOUT.varHandle(PathElement.groupElement("ScalingList8x8"), PathElement.sequenceElement(), PathElement.sequenceElement());
        SCALING_LIST16X16_HANDLE = LAYOUT.varHandle(PathElement.groupElement("ScalingList16x16"), PathElement.sequenceElement(), PathElement.sequenceElement());
        SCALING_LIST32X32_HANDLE = LAYOUT.varHandle(PathElement.groupElement("ScalingList32x32"), PathElement.sequenceElement(), PathElement.sequenceElement());
        SCALING_LIST_DCCOEF16X16_HANDLE = LAYOUT.varHandle(PathElement.groupElement("ScalingListDCCoef16x16"), PathElement.sequenceElement());
        SCALING_LIST_DCCOEF32X32_HANDLE = LAYOUT.varHandle(PathElement.groupElement("ScalingListDCCoef32x32"), PathElement.sequenceElement());
        
        SCALING_LIST4X4_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("ScalingList4x4"));
        SCALING_LIST8X8_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("ScalingList8x8"));
        SCALING_LIST16X16_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("ScalingList16x16"));
        SCALING_LIST32X32_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("ScalingList32x32"));
        SCALING_LIST_DCCOEF16X16_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("ScalingListDCCoef16x16"));
        SCALING_LIST_DCCOEF32X32_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("ScalingListDCCoef32x32"));
        //@formatter:on
    }

    public StdVideoH265ScalingLists() {
        this(Arena.ofAuto());
    }
    
    public StdVideoH265ScalingLists(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public StdVideoH265ScalingLists(MemorySegment segment) {
        this.segment = segment;
    
    }

    /// @see #scalingList4x4(int, int)
    public StdVideoH265ScalingLists scalingList4x4(byte scalingList4x4, int index0, int index1) {
    	SCALING_LIST4X4_HANDLE.set(segment, 0L, index0, index1, scalingList4x4);
    	return this;
    }
    
    public byte scalingList4x4(int index0, int index1) {
    	return (byte) SCALING_LIST4X4_HANDLE.get(segment, 0L, index0, index1);
    }
    
    /// @see #scalingList8x8(int, int)
    public StdVideoH265ScalingLists scalingList8x8(byte scalingList8x8, int index0, int index1) {
    	SCALING_LIST8X8_HANDLE.set(segment, 0L, index0, index1, scalingList8x8);
    	return this;
    }
    
    public byte scalingList8x8(int index0, int index1) {
    	return (byte) SCALING_LIST8X8_HANDLE.get(segment, 0L, index0, index1);
    }
    
    /// @see #scalingList16x16(int, int)
    public StdVideoH265ScalingLists scalingList16x16(byte scalingList16x16, int index0, int index1) {
    	SCALING_LIST16X16_HANDLE.set(segment, 0L, index0, index1, scalingList16x16);
    	return this;
    }
    
    public byte scalingList16x16(int index0, int index1) {
    	return (byte) SCALING_LIST16X16_HANDLE.get(segment, 0L, index0, index1);
    }
    
    /// @see #scalingList32x32(int, int)
    public StdVideoH265ScalingLists scalingList32x32(byte scalingList32x32, int index0, int index1) {
    	SCALING_LIST32X32_HANDLE.set(segment, 0L, index0, index1, scalingList32x32);
    	return this;
    }
    
    public byte scalingList32x32(int index0, int index1) {
    	return (byte) SCALING_LIST32X32_HANDLE.get(segment, 0L, index0, index1);
    }
    
    /// @see #scalingListDCCoef16x16(int)
    public StdVideoH265ScalingLists scalingListDCCoef16x16(byte scalingListDCCoef16x16, int index0) {
    	SCALING_LIST_DCCOEF16X16_HANDLE.set(segment, 0L, index0, scalingListDCCoef16x16);
    	return this;
    }
    
    public byte scalingListDCCoef16x16(int index0) {
    	return (byte) SCALING_LIST_DCCOEF16X16_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #scalingListDCCoef32x32(int)
    public StdVideoH265ScalingLists scalingListDCCoef32x32(byte scalingListDCCoef32x32, int index0) {
    	SCALING_LIST_DCCOEF32X32_HANDLE.set(segment, 0L, index0, scalingListDCCoef32x32);
    	return this;
    }
    
    public byte scalingListDCCoef32x32(int index0) {
    	return (byte) SCALING_LIST_DCCOEF32X32_HANDLE.get(segment, 0L, index0);
    }
    
    @Override
    public StdVideoH265ScalingLists set(StdVideoH265ScalingLists other) {
        return set(other.segment);
    }
    
    @Override
    public StdVideoH265ScalingLists set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<StdVideoH265ScalingLists> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<StdVideoH265ScalingLists> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new StdVideoH265ScalingLists(segment),
            count
        );
    }
    
    public static NativeStructArray<StdVideoH265ScalingLists> array(Arena arena, StdVideoH265ScalingLists... structs) {
        NativeStructArray<StdVideoH265ScalingLists> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new StdVideoH265ScalingLists(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<StdVideoH265ScalingLists> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new StdVideoH265ScalingLists(segment)
        );
    }
    
}