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

public final class StdVideoVP9SegmentationFlags
		implements Struct<StdVideoVP9SegmentationFlags> {

	public static final StructLayout LAYOUT;

	public static final VarHandle BIT_FIELDS0_HANDLE;

	public static final long BIT_FIELDS0_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("bitFields0")
		).withName("StdVideoVP9SegmentationFlags").withByteAlignment(4);
		
		BIT_FIELDS0_HANDLE = LAYOUT.varHandle(PathElement.groupElement("bitFields0"));
		
		BIT_FIELDS0_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("bitFields0"));
		//@formatter:on
	}

	public StdVideoVP9SegmentationFlags() {
	    this(Arena.ofAuto());
	}
	
	public StdVideoVP9SegmentationFlags(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public StdVideoVP9SegmentationFlags(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #bitFields0()
    public StdVideoVP9SegmentationFlags bitFields0(int bitFields0) {
    	BIT_FIELDS0_HANDLE.set(segment, 0L, bitFields0);
    	return this;
    }
    
    /// ```
    /// All bit fields contained in this field with their bit width:
    /// segmentation_update_map : 1
    /// segmentation_temporal_update : 1
    /// segmentation_update_data : 1
    /// segmentation_abs_or_delta_update : 1
    /// reserved : 28
    /// ```
    public int bitFields0() {
    	return (int) BIT_FIELDS0_HANDLE.get(segment, 0L);
    }
    
    @Override
    public StdVideoVP9SegmentationFlags set(StdVideoVP9SegmentationFlags other) {
        return set(other.segment);
    }
    
    @Override
    public StdVideoVP9SegmentationFlags set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<StdVideoVP9SegmentationFlags> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<StdVideoVP9SegmentationFlags> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new StdVideoVP9SegmentationFlags(segment),
            count
        );
    }
    
    public static NativeStructArray<StdVideoVP9SegmentationFlags> array(Arena arena, StdVideoVP9SegmentationFlags... structs) {
        NativeStructArray<StdVideoVP9SegmentationFlags> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new StdVideoVP9SegmentationFlags(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<StdVideoVP9SegmentationFlags> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new StdVideoVP9SegmentationFlags(segment)
        );
    }

}