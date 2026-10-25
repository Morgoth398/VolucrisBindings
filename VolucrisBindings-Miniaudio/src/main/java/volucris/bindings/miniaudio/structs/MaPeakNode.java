/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.miniaudio.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.util.function.Consumer;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

public final class MaPeakNode
		implements Struct<MaPeakNode> {

	public static final StructLayout LAYOUT;

	public static final long BASE_NODE_BYTE_OFFSET;
	public static final long PEAK_BYTE_OFFSET;

	private final MemorySegment segment;

	private final MaNodeBase baseNode;
	private final MaPeak2 peak;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    MaNodeBase.LAYOUT.withName("baseNode"),
		    MaPeak2.LAYOUT.withName("peak")
		).withName("ma_peak_node").withByteAlignment(8);
		
		BASE_NODE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("baseNode"));
		PEAK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("peak"));
		//@formatter:on
	}

	public MaPeakNode() {
	    this(Arena.ofAuto());
	}
	
	public MaPeakNode(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public MaPeakNode(MemorySegment segment) {
	    this.segment = segment;
	
	    baseNode = new MaNodeBase(segment.asSlice(BASE_NODE_BYTE_OFFSET, MaNodeBase.LAYOUT));
	    peak = new MaPeak2(segment.asSlice(PEAK_BYTE_OFFSET, MaPeak2.LAYOUT));
	}

    /// @see #baseNode()
    public MaPeakNode baseNode(Consumer<MaNodeBase> consumer) {
    	consumer.accept(baseNode);
    	return this;
    }
    
    /// @see #baseNode()
    public MaPeakNode baseNode(MaNodeBase other) {
    	baseNode.set(other);
    	return this;
    }
    
    public MaNodeBase baseNode() {
    	return baseNode;
    }
    
    /// @see #peak()
    public MaPeakNode peak(Consumer<MaPeak2> consumer) {
    	consumer.accept(peak);
    	return this;
    }
    
    /// @see #peak()
    public MaPeakNode peak(MaPeak2 other) {
    	peak.set(other);
    	return this;
    }
    
    public MaPeak2 peak() {
    	return peak;
    }
    
    @Override
    public MaPeakNode set(MaPeakNode other) {
        return set(other.segment);
    }
    
    @Override
    public MaPeakNode set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaPeakNode> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaPeakNode> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaPeakNode(segment),
            count
        );
    }
    
    public static NativeStructArray<MaPeakNode> array(SegmentAllocator allocator, MaPeakNode... structs) {
        NativeStructArray<MaPeakNode> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaPeakNode(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaPeakNode> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaPeakNode(segment)
        );
    }

}