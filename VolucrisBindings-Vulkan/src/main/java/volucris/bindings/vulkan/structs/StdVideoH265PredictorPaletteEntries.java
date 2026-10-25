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

public final class StdVideoH265PredictorPaletteEntries
		implements Struct<StdVideoH265PredictorPaletteEntries> {

	public static final StructLayout LAYOUT;

	public static final VarHandle PREDICTOR_PALETTE_ENTRIES_HANDLE;

	public static final long PREDICTOR_PALETTE_ENTRIES_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    MemoryLayout.sequenceLayout(3, MemoryLayout.sequenceLayout(128, JAVA_SHORT)).withName("PredictorPaletteEntries")
		).withName("StdVideoH265PredictorPaletteEntries").withByteAlignment(2);
		
		PREDICTOR_PALETTE_ENTRIES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("PredictorPaletteEntries"), PathElement.sequenceElement(), PathElement.sequenceElement());
		
		PREDICTOR_PALETTE_ENTRIES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("PredictorPaletteEntries"));
		//@formatter:on
	}

	public StdVideoH265PredictorPaletteEntries() {
	    this(Arena.ofAuto());
	}
	
	public StdVideoH265PredictorPaletteEntries(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public StdVideoH265PredictorPaletteEntries(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #predictorPaletteEntries(int, int)
    public StdVideoH265PredictorPaletteEntries predictorPaletteEntries(short predictorPaletteEntries, int index0, int index1) {
    	PREDICTOR_PALETTE_ENTRIES_HANDLE.set(segment, 0L, index0, index1, predictorPaletteEntries);
    	return this;
    }
    
    public short predictorPaletteEntries(int index0, int index1) {
    	return (short) PREDICTOR_PALETTE_ENTRIES_HANDLE.get(segment, 0L, index0, index1);
    }
    
    @Override
    public StdVideoH265PredictorPaletteEntries set(StdVideoH265PredictorPaletteEntries other) {
        return set(other.segment);
    }
    
    @Override
    public StdVideoH265PredictorPaletteEntries set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<StdVideoH265PredictorPaletteEntries> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<StdVideoH265PredictorPaletteEntries> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new StdVideoH265PredictorPaletteEntries(segment),
            count
        );
    }
    
    public static NativeStructArray<StdVideoH265PredictorPaletteEntries> array(SegmentAllocator allocator, StdVideoH265PredictorPaletteEntries... structs) {
        NativeStructArray<StdVideoH265PredictorPaletteEntries> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new StdVideoH265PredictorPaletteEntries(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<StdVideoH265PredictorPaletteEntries> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new StdVideoH265PredictorPaletteEntries(segment)
        );
    }

}