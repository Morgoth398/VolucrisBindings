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
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;

public final class StdVideoVP9Segmentation
		implements Struct<StdVideoVP9Segmentation> {

	public static final StructLayout LAYOUT;

	public static final VarHandle SEGMENTATION_TREE_PROBS_HANDLE;
	public static final VarHandle SEGMENTATION_PRED_PROB_HANDLE;
	public static final VarHandle FEATURE_ENABLED_HANDLE;
	public static final VarHandle FEATURE_DATA_HANDLE;

	public static final long FLAGS_BYTE_OFFSET;
	public static final long SEGMENTATION_TREE_PROBS_BYTE_OFFSET;
	public static final long SEGMENTATION_PRED_PROB_BYTE_OFFSET;
	public static final long FEATURE_ENABLED_BYTE_OFFSET;
	public static final long FEATURE_DATA_BYTE_OFFSET;

	private final MemorySegment segment;

	private final StdVideoVP9SegmentationFlags flags;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    StdVideoVP9SegmentationFlags.LAYOUT.withName("flags"),
		    MemoryLayout.sequenceLayout(7, JAVA_BYTE).withName("segmentation_tree_probs"),
		    MemoryLayout.sequenceLayout(3, JAVA_BYTE).withName("segmentation_pred_prob"),
		    MemoryLayout.sequenceLayout(8, JAVA_BYTE).withName("FeatureEnabled"),
		    MemoryLayout.sequenceLayout(8, MemoryLayout.sequenceLayout(4, JAVA_SHORT)).withName("FeatureData"),
		    MemoryLayout.paddingLayout(2)
		).withName("StdVideoVP9Segmentation").withByteAlignment(4);
		
		SEGMENTATION_TREE_PROBS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("segmentation_tree_probs"), PathElement.sequenceElement());
		SEGMENTATION_PRED_PROB_HANDLE = LAYOUT.varHandle(PathElement.groupElement("segmentation_pred_prob"), PathElement.sequenceElement());
		FEATURE_ENABLED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("FeatureEnabled"), PathElement.sequenceElement());
		FEATURE_DATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("FeatureData"), PathElement.sequenceElement(), PathElement.sequenceElement());
		
		FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
		SEGMENTATION_TREE_PROBS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("segmentation_tree_probs"));
		SEGMENTATION_PRED_PROB_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("segmentation_pred_prob"));
		FEATURE_ENABLED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("FeatureEnabled"));
		FEATURE_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("FeatureData"));
		//@formatter:on
	}

	public StdVideoVP9Segmentation() {
	    this(Arena.ofAuto());
	}
	
	public StdVideoVP9Segmentation(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public StdVideoVP9Segmentation(MemorySegment segment) {
	    this.segment = segment;
	
	    flags = new StdVideoVP9SegmentationFlags(segment.asSlice(FLAGS_BYTE_OFFSET, StdVideoVP9SegmentationFlags.LAYOUT));
	}

    /// @see #flags()
    public StdVideoVP9Segmentation flags(Consumer<StdVideoVP9SegmentationFlags> consumer) {
    	consumer.accept(flags);
    	return this;
    }
    
    /// @see #flags()
    public StdVideoVP9Segmentation flags(StdVideoVP9SegmentationFlags other) {
    	flags.set(other);
    	return this;
    }
    
    public StdVideoVP9SegmentationFlags flags() {
    	return flags;
    }
    
    /// @see #segmentation_tree_probs(int)
    public StdVideoVP9Segmentation segmentation_tree_probs(byte segmentation_tree_probs, int index0) {
    	SEGMENTATION_TREE_PROBS_HANDLE.set(segment, 0L, index0, segmentation_tree_probs);
    	return this;
    }
    
    public byte segmentation_tree_probs(int index0) {
    	return (byte) SEGMENTATION_TREE_PROBS_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #segmentation_pred_prob(int)
    public StdVideoVP9Segmentation segmentation_pred_prob(byte segmentation_pred_prob, int index0) {
    	SEGMENTATION_PRED_PROB_HANDLE.set(segment, 0L, index0, segmentation_pred_prob);
    	return this;
    }
    
    public byte segmentation_pred_prob(int index0) {
    	return (byte) SEGMENTATION_PRED_PROB_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #featureEnabled(int)
    public StdVideoVP9Segmentation featureEnabled(byte featureEnabled, int index0) {
    	FEATURE_ENABLED_HANDLE.set(segment, 0L, index0, featureEnabled);
    	return this;
    }
    
    public byte featureEnabled(int index0) {
    	return (byte) FEATURE_ENABLED_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #featureData(int, int)
    public StdVideoVP9Segmentation featureData(short featureData, int index0, int index1) {
    	FEATURE_DATA_HANDLE.set(segment, 0L, index0, index1, featureData);
    	return this;
    }
    
    public short featureData(int index0, int index1) {
    	return (short) FEATURE_DATA_HANDLE.get(segment, 0L, index0, index1);
    }
    
    @Override
    public StdVideoVP9Segmentation set(StdVideoVP9Segmentation other) {
        return set(other.segment);
    }
    
    @Override
    public StdVideoVP9Segmentation set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<StdVideoVP9Segmentation> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<StdVideoVP9Segmentation> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new StdVideoVP9Segmentation(segment),
            count
        );
    }
    
    public static NativeStructArray<StdVideoVP9Segmentation> array(Arena arena, StdVideoVP9Segmentation... structs) {
        NativeStructArray<StdVideoVP9Segmentation> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new StdVideoVP9Segmentation(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<StdVideoVP9Segmentation> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new StdVideoVP9Segmentation(segment)
        );
    }

}