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

public final class MaHishelfNode
		implements Struct<MaHishelfNode> {

	public static final StructLayout LAYOUT;

	public static final long BASE_NODE_BYTE_OFFSET;
	public static final long HISHELF_BYTE_OFFSET;

	private final MemorySegment segment;

	private final MaNodeBase baseNode;
	private final MaHishelf2 hishelf;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    MaNodeBase.LAYOUT.withName("baseNode"),
		    MaHishelf2.LAYOUT.withName("hishelf")
		).withName("ma_hishelf_node").withByteAlignment(8);
		
		BASE_NODE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("baseNode"));
		HISHELF_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("hishelf"));
		//@formatter:on
	}

	public MaHishelfNode() {
	    this(Arena.ofAuto());
	}
	
	public MaHishelfNode(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public MaHishelfNode(MemorySegment segment) {
	    this.segment = segment;
	
	    baseNode = new MaNodeBase(segment.asSlice(BASE_NODE_BYTE_OFFSET, MaNodeBase.LAYOUT));
	    hishelf = new MaHishelf2(segment.asSlice(HISHELF_BYTE_OFFSET, MaHishelf2.LAYOUT));
	}

    /// @see #baseNode()
    public MaHishelfNode baseNode(Consumer<MaNodeBase> consumer) {
    	consumer.accept(baseNode);
    	return this;
    }
    
    /// @see #baseNode()
    public MaHishelfNode baseNode(MaNodeBase other) {
    	baseNode.set(other);
    	return this;
    }
    
    public MaNodeBase baseNode() {
    	return baseNode;
    }
    
    /// @see #hishelf()
    public MaHishelfNode hishelf(Consumer<MaHishelf2> consumer) {
    	consumer.accept(hishelf);
    	return this;
    }
    
    /// @see #hishelf()
    public MaHishelfNode hishelf(MaHishelf2 other) {
    	hishelf.set(other);
    	return this;
    }
    
    public MaHishelf2 hishelf() {
    	return hishelf;
    }
    
    @Override
    public MaHishelfNode set(MaHishelfNode other) {
        return set(other.segment);
    }
    
    @Override
    public MaHishelfNode set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaHishelfNode> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaHishelfNode> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaHishelfNode(segment),
            count
        );
    }
    
    public static NativeStructArray<MaHishelfNode> array(SegmentAllocator allocator, MaHishelfNode... structs) {
        NativeStructArray<MaHishelfNode> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaHishelfNode(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaHishelfNode> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaHishelfNode(segment)
        );
    }

}