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

public final class MaLoshelfNode
		implements Struct<MaLoshelfNode> {

	public static final StructLayout LAYOUT;

	public static final long BASE_NODE_BYTE_OFFSET;
	public static final long LOSHELF_BYTE_OFFSET;

	private final MemorySegment segment;

	private final MaNodeBase baseNode;
	private final MaLoshelf2 loshelf;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    MaNodeBase.LAYOUT.withName("baseNode"),
		    MaLoshelf2.LAYOUT.withName("loshelf")
		).withName("ma_loshelf_node").withByteAlignment(8);
		
		BASE_NODE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("baseNode"));
		LOSHELF_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("loshelf"));
		//@formatter:on
	}

	public MaLoshelfNode() {
	    this(Arena.ofAuto());
	}
	
	public MaLoshelfNode(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public MaLoshelfNode(MemorySegment segment) {
	    this.segment = segment;
	
	    baseNode = new MaNodeBase(segment.asSlice(BASE_NODE_BYTE_OFFSET, MaNodeBase.LAYOUT));
	    loshelf = new MaLoshelf2(segment.asSlice(LOSHELF_BYTE_OFFSET, MaLoshelf2.LAYOUT));
	}

    /// @see #baseNode()
    public MaLoshelfNode baseNode(Consumer<MaNodeBase> consumer) {
    	consumer.accept(baseNode);
    	return this;
    }
    
    /// @see #baseNode()
    public MaLoshelfNode baseNode(MaNodeBase other) {
    	baseNode.set(other);
    	return this;
    }
    
    public MaNodeBase baseNode() {
    	return baseNode;
    }
    
    /// @see #loshelf()
    public MaLoshelfNode loshelf(Consumer<MaLoshelf2> consumer) {
    	consumer.accept(loshelf);
    	return this;
    }
    
    /// @see #loshelf()
    public MaLoshelfNode loshelf(MaLoshelf2 other) {
    	loshelf.set(other);
    	return this;
    }
    
    public MaLoshelf2 loshelf() {
    	return loshelf;
    }
    
    @Override
    public MaLoshelfNode set(MaLoshelfNode other) {
        return set(other.segment);
    }
    
    @Override
    public MaLoshelfNode set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaLoshelfNode> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaLoshelfNode> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaLoshelfNode(segment),
            count
        );
    }
    
    public static NativeStructArray<MaLoshelfNode> array(SegmentAllocator allocator, MaLoshelfNode... structs) {
        NativeStructArray<MaLoshelfNode> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaLoshelfNode(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaLoshelfNode> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaLoshelfNode(segment)
        );
    }

}