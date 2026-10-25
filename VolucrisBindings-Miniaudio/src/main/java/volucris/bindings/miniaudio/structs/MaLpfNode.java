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

public final class MaLpfNode
		implements Struct<MaLpfNode> {

	public static final StructLayout LAYOUT;

	public static final long BASE_NODE_BYTE_OFFSET;
	public static final long LPF_BYTE_OFFSET;

	private final MemorySegment segment;

	private final MaNodeBase baseNode;
	private final MaLpf lpf;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    MaNodeBase.LAYOUT.withName("baseNode"),
		    MaLpf.LAYOUT.withName("lpf")
		).withName("ma_lpf_node").withByteAlignment(8);
		
		BASE_NODE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("baseNode"));
		LPF_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("lpf"));
		//@formatter:on
	}

	public MaLpfNode() {
	    this(Arena.ofAuto());
	}
	
	public MaLpfNode(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public MaLpfNode(MemorySegment segment) {
	    this.segment = segment;
	
	    baseNode = new MaNodeBase(segment.asSlice(BASE_NODE_BYTE_OFFSET, MaNodeBase.LAYOUT));
	    lpf = new MaLpf(segment.asSlice(LPF_BYTE_OFFSET, MaLpf.LAYOUT));
	}

    /// @see #baseNode()
    public MaLpfNode baseNode(Consumer<MaNodeBase> consumer) {
    	consumer.accept(baseNode);
    	return this;
    }
    
    /// @see #baseNode()
    public MaLpfNode baseNode(MaNodeBase other) {
    	baseNode.set(other);
    	return this;
    }
    
    public MaNodeBase baseNode() {
    	return baseNode;
    }
    
    /// @see #lpf()
    public MaLpfNode lpf(Consumer<MaLpf> consumer) {
    	consumer.accept(lpf);
    	return this;
    }
    
    /// @see #lpf()
    public MaLpfNode lpf(MaLpf other) {
    	lpf.set(other);
    	return this;
    }
    
    public MaLpf lpf() {
    	return lpf;
    }
    
    @Override
    public MaLpfNode set(MaLpfNode other) {
        return set(other.segment);
    }
    
    @Override
    public MaLpfNode set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaLpfNode> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaLpfNode> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaLpfNode(segment),
            count
        );
    }
    
    public static NativeStructArray<MaLpfNode> array(SegmentAllocator allocator, MaLpfNode... structs) {
        NativeStructArray<MaLpfNode> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaLpfNode(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaLpfNode> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaLpfNode(segment)
        );
    }

}