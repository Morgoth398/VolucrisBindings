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

public final class MaDelayNode
		implements Struct<MaDelayNode> {

	public static final StructLayout LAYOUT;

	public static final long BASE_NODE_BYTE_OFFSET;
	public static final long DELAY_BYTE_OFFSET;

	private final MemorySegment segment;

	private final MaNodeBase baseNode;
	private final MaDelay delay;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    MaNodeBase.LAYOUT.withName("baseNode"),
		    MaDelay.LAYOUT.withName("delay")
		).withName("ma_delay_node").withByteAlignment(8);
		
		BASE_NODE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("baseNode"));
		DELAY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("delay"));
		//@formatter:on
	}

	public MaDelayNode() {
	    this(Arena.ofAuto());
	}
	
	public MaDelayNode(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public MaDelayNode(MemorySegment segment) {
	    this.segment = segment;
	
	    baseNode = new MaNodeBase(segment.asSlice(BASE_NODE_BYTE_OFFSET, MaNodeBase.LAYOUT));
	    delay = new MaDelay(segment.asSlice(DELAY_BYTE_OFFSET, MaDelay.LAYOUT));
	}

    /// @see #baseNode()
    public MaDelayNode baseNode(Consumer<MaNodeBase> consumer) {
    	consumer.accept(baseNode);
    	return this;
    }
    
    /// @see #baseNode()
    public MaDelayNode baseNode(MaNodeBase other) {
    	baseNode.set(other);
    	return this;
    }
    
    public MaNodeBase baseNode() {
    	return baseNode;
    }
    
    /// @see #delay()
    public MaDelayNode delay(Consumer<MaDelay> consumer) {
    	consumer.accept(delay);
    	return this;
    }
    
    /// @see #delay()
    public MaDelayNode delay(MaDelay other) {
    	delay.set(other);
    	return this;
    }
    
    public MaDelay delay() {
    	return delay;
    }
    
    @Override
    public MaDelayNode set(MaDelayNode other) {
        return set(other.segment);
    }
    
    @Override
    public MaDelayNode set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaDelayNode> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaDelayNode> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaDelayNode(segment),
            count
        );
    }
    
    public static NativeStructArray<MaDelayNode> array(SegmentAllocator allocator, MaDelayNode... structs) {
        NativeStructArray<MaDelayNode> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaDelayNode(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaDelayNode> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaDelayNode(segment)
        );
    }

}