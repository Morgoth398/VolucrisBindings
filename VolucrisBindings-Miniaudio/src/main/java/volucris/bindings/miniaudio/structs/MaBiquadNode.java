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

public final class MaBiquadNode
		implements Struct<MaBiquadNode> {

	public static final StructLayout LAYOUT;

	public static final long BASE_NODE_BYTE_OFFSET;
	public static final long BIQUAD_BYTE_OFFSET;

	private final MemorySegment segment;

	private final MaNodeBase baseNode;
	private final MaBiquad biquad;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    MaNodeBase.LAYOUT.withName("baseNode"),
		    MaBiquad.LAYOUT.withName("biquad")
		).withName("ma_biquad_node").withByteAlignment(8);
		
		BASE_NODE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("baseNode"));
		BIQUAD_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("biquad"));
		//@formatter:on
	}

	public MaBiquadNode() {
	    this(Arena.ofAuto());
	}
	
	public MaBiquadNode(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public MaBiquadNode(MemorySegment segment) {
	    this.segment = segment;
	
	    baseNode = new MaNodeBase(segment.asSlice(BASE_NODE_BYTE_OFFSET, MaNodeBase.LAYOUT));
	    biquad = new MaBiquad(segment.asSlice(BIQUAD_BYTE_OFFSET, MaBiquad.LAYOUT));
	}

    /// @see #baseNode()
    public MaBiquadNode baseNode(Consumer<MaNodeBase> consumer) {
    	consumer.accept(baseNode);
    	return this;
    }
    
    /// @see #baseNode()
    public MaBiquadNode baseNode(MaNodeBase other) {
    	baseNode.set(other);
    	return this;
    }
    
    public MaNodeBase baseNode() {
    	return baseNode;
    }
    
    /// @see #biquad()
    public MaBiquadNode biquad(Consumer<MaBiquad> consumer) {
    	consumer.accept(biquad);
    	return this;
    }
    
    /// @see #biquad()
    public MaBiquadNode biquad(MaBiquad other) {
    	biquad.set(other);
    	return this;
    }
    
    public MaBiquad biquad() {
    	return biquad;
    }
    
    @Override
    public MaBiquadNode set(MaBiquadNode other) {
        return set(other.segment);
    }
    
    @Override
    public MaBiquadNode set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaBiquadNode> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaBiquadNode> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaBiquadNode(segment),
            count
        );
    }
    
    public static NativeStructArray<MaBiquadNode> array(SegmentAllocator allocator, MaBiquadNode... structs) {
        NativeStructArray<MaBiquadNode> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaBiquadNode(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaBiquadNode> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaBiquadNode(segment)
        );
    }

}