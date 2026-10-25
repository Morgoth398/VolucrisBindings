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

public final class MaBpfNode
		implements Struct<MaBpfNode> {

	public static final StructLayout LAYOUT;

	public static final long BASE_NODE_BYTE_OFFSET;
	public static final long BPF_BYTE_OFFSET;

	private final MemorySegment segment;

	private final MaNodeBase baseNode;
	private final MaBpf bpf;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    MaNodeBase.LAYOUT.withName("baseNode"),
		    MaBpf.LAYOUT.withName("bpf")
		).withName("ma_bpf_node").withByteAlignment(8);
		
		BASE_NODE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("baseNode"));
		BPF_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("bpf"));
		//@formatter:on
	}

	public MaBpfNode() {
	    this(Arena.ofAuto());
	}
	
	public MaBpfNode(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public MaBpfNode(MemorySegment segment) {
	    this.segment = segment;
	
	    baseNode = new MaNodeBase(segment.asSlice(BASE_NODE_BYTE_OFFSET, MaNodeBase.LAYOUT));
	    bpf = new MaBpf(segment.asSlice(BPF_BYTE_OFFSET, MaBpf.LAYOUT));
	}

    /// @see #baseNode()
    public MaBpfNode baseNode(Consumer<MaNodeBase> consumer) {
    	consumer.accept(baseNode);
    	return this;
    }
    
    /// @see #baseNode()
    public MaBpfNode baseNode(MaNodeBase other) {
    	baseNode.set(other);
    	return this;
    }
    
    public MaNodeBase baseNode() {
    	return baseNode;
    }
    
    /// @see #bpf()
    public MaBpfNode bpf(Consumer<MaBpf> consumer) {
    	consumer.accept(bpf);
    	return this;
    }
    
    /// @see #bpf()
    public MaBpfNode bpf(MaBpf other) {
    	bpf.set(other);
    	return this;
    }
    
    public MaBpf bpf() {
    	return bpf;
    }
    
    @Override
    public MaBpfNode set(MaBpfNode other) {
        return set(other.segment);
    }
    
    @Override
    public MaBpfNode set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaBpfNode> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaBpfNode> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaBpfNode(segment),
            count
        );
    }
    
    public static NativeStructArray<MaBpfNode> array(SegmentAllocator allocator, MaBpfNode... structs) {
        NativeStructArray<MaBpfNode> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaBpfNode(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaBpfNode> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaBpfNode(segment)
        );
    }

}