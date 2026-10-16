/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.miniaudio.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.util.function.Consumer;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

public final class MaHpfNode
		implements Struct<MaHpfNode> {

	public static final StructLayout LAYOUT;

	public static final long BASE_NODE_BYTE_OFFSET;
	public static final long HPF_BYTE_OFFSET;

	private final MemorySegment segment;

	private final MaNodeBase baseNode;
	private final MaHpf hpf;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    MaNodeBase.LAYOUT.withName("baseNode"),
		    MaHpf.LAYOUT.withName("hpf")
		).withName("ma_hpf_node").withByteAlignment(8);
		
		BASE_NODE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("baseNode"));
		HPF_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("hpf"));
		//@formatter:on
	}

	public MaHpfNode() {
	    this(Arena.ofAuto());
	}
	
	public MaHpfNode(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public MaHpfNode(MemorySegment segment) {
	    this.segment = segment;
	
	    baseNode = new MaNodeBase(segment.asSlice(BASE_NODE_BYTE_OFFSET, MaNodeBase.LAYOUT));
	    hpf = new MaHpf(segment.asSlice(HPF_BYTE_OFFSET, MaHpf.LAYOUT));
	}

    /// @see #baseNode()
    public MaHpfNode baseNode(Consumer<MaNodeBase> consumer) {
    	consumer.accept(baseNode);
    	return this;
    }
    
    /// @see #baseNode()
    public MaHpfNode baseNode(MaNodeBase other) {
    	baseNode.set(other);
    	return this;
    }
    
    public MaNodeBase baseNode() {
    	return baseNode;
    }
    
    /// @see #hpf()
    public MaHpfNode hpf(Consumer<MaHpf> consumer) {
    	consumer.accept(hpf);
    	return this;
    }
    
    /// @see #hpf()
    public MaHpfNode hpf(MaHpf other) {
    	hpf.set(other);
    	return this;
    }
    
    public MaHpf hpf() {
    	return hpf;
    }
    
    @Override
    public MaHpfNode set(MaHpfNode other) {
        return set(other.segment);
    }
    
    @Override
    public MaHpfNode set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaHpfNode> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaHpfNode> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaHpfNode(segment),
            count
        );
    }
    
    public static NativeStructArray<MaHpfNode> array(Arena arena, MaHpfNode... structs) {
        NativeStructArray<MaHpfNode> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaHpfNode(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaHpfNode> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaHpfNode(segment)
        );
    }

}