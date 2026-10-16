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

public final class MaNotchNode
		implements Struct<MaNotchNode> {

	public static final StructLayout LAYOUT;

	public static final long BASE_NODE_BYTE_OFFSET;
	public static final long NOTCH_BYTE_OFFSET;

	private final MemorySegment segment;

	private final MaNodeBase baseNode;
	private final MaNotch2 notch;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    MaNodeBase.LAYOUT.withName("baseNode"),
		    MaNotch2.LAYOUT.withName("notch")
		).withName("ma_notch_node").withByteAlignment(8);
		
		BASE_NODE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("baseNode"));
		NOTCH_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("notch"));
		//@formatter:on
	}

	public MaNotchNode() {
	    this(Arena.ofAuto());
	}
	
	public MaNotchNode(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public MaNotchNode(MemorySegment segment) {
	    this.segment = segment;
	
	    baseNode = new MaNodeBase(segment.asSlice(BASE_NODE_BYTE_OFFSET, MaNodeBase.LAYOUT));
	    notch = new MaNotch2(segment.asSlice(NOTCH_BYTE_OFFSET, MaNotch2.LAYOUT));
	}

    /// @see #baseNode()
    public MaNotchNode baseNode(Consumer<MaNodeBase> consumer) {
    	consumer.accept(baseNode);
    	return this;
    }
    
    /// @see #baseNode()
    public MaNotchNode baseNode(MaNodeBase other) {
    	baseNode.set(other);
    	return this;
    }
    
    public MaNodeBase baseNode() {
    	return baseNode;
    }
    
    /// @see #notch()
    public MaNotchNode notch(Consumer<MaNotch2> consumer) {
    	consumer.accept(notch);
    	return this;
    }
    
    /// @see #notch()
    public MaNotchNode notch(MaNotch2 other) {
    	notch.set(other);
    	return this;
    }
    
    public MaNotch2 notch() {
    	return notch;
    }
    
    @Override
    public MaNotchNode set(MaNotchNode other) {
        return set(other.segment);
    }
    
    @Override
    public MaNotchNode set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaNotchNode> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaNotchNode> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaNotchNode(segment),
            count
        );
    }
    
    public static NativeStructArray<MaNotchNode> array(Arena arena, MaNotchNode... structs) {
        NativeStructArray<MaNotchNode> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaNotchNode(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaNotchNode> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaNotchNode(segment)
        );
    }

}