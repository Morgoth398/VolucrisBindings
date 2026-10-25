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

public final class StdVideoAV1Segmentation
		implements Struct<StdVideoAV1Segmentation> {

	public static final StructLayout LAYOUT;

	public static final VarHandle FEATURE_ENABLED_HANDLE;
	public static final VarHandle FEATURE_DATA_HANDLE;

	public static final long FEATURE_ENABLED_BYTE_OFFSET;
	public static final long FEATURE_DATA_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    MemoryLayout.sequenceLayout(8, JAVA_BYTE).withName("FeatureEnabled"),
		    MemoryLayout.sequenceLayout(8, MemoryLayout.sequenceLayout(8, JAVA_SHORT)).withName("FeatureData")
		).withName("StdVideoAV1Segmentation").withByteAlignment(2);
		
		FEATURE_ENABLED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("FeatureEnabled"), PathElement.sequenceElement());
		FEATURE_DATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("FeatureData"), PathElement.sequenceElement(), PathElement.sequenceElement());
		
		FEATURE_ENABLED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("FeatureEnabled"));
		FEATURE_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("FeatureData"));
		//@formatter:on
	}

	public StdVideoAV1Segmentation() {
	    this(Arena.ofAuto());
	}
	
	public StdVideoAV1Segmentation(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public StdVideoAV1Segmentation(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #featureEnabled(int)
    public StdVideoAV1Segmentation featureEnabled(byte featureEnabled, int index0) {
    	FEATURE_ENABLED_HANDLE.set(segment, 0L, index0, featureEnabled);
    	return this;
    }
    
    public byte featureEnabled(int index0) {
    	return (byte) FEATURE_ENABLED_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #featureData(int, int)
    public StdVideoAV1Segmentation featureData(short featureData, int index0, int index1) {
    	FEATURE_DATA_HANDLE.set(segment, 0L, index0, index1, featureData);
    	return this;
    }
    
    public short featureData(int index0, int index1) {
    	return (short) FEATURE_DATA_HANDLE.get(segment, 0L, index0, index1);
    }
    
    @Override
    public StdVideoAV1Segmentation set(StdVideoAV1Segmentation other) {
        return set(other.segment);
    }
    
    @Override
    public StdVideoAV1Segmentation set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<StdVideoAV1Segmentation> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<StdVideoAV1Segmentation> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new StdVideoAV1Segmentation(segment),
            count
        );
    }
    
    public static NativeStructArray<StdVideoAV1Segmentation> array(SegmentAllocator allocator, StdVideoAV1Segmentation... structs) {
        NativeStructArray<StdVideoAV1Segmentation> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new StdVideoAV1Segmentation(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<StdVideoAV1Segmentation> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new StdVideoAV1Segmentation(segment)
        );
    }

}