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

public final class MaSplitterNode
		implements Struct<MaSplitterNode> {

	public static final StructLayout LAYOUT;

	public static final long BASE_BYTE_OFFSET;

	private final MemorySegment segment;

	private final MaNodeBase base;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    MaNodeBase.LAYOUT.withName("base")
		).withName("ma_splitter_node").withByteAlignment(8);
		
		BASE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("base"));
		//@formatter:on
	}

	public MaSplitterNode() {
	    this(Arena.ofAuto());
	}
	
	public MaSplitterNode(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public MaSplitterNode(MemorySegment segment) {
	    this.segment = segment;
	
	    base = new MaNodeBase(segment.asSlice(BASE_BYTE_OFFSET, MaNodeBase.LAYOUT));
	}

    /// @see #base()
    public MaSplitterNode base(Consumer<MaNodeBase> consumer) {
    	consumer.accept(base);
    	return this;
    }
    
    /// @see #base()
    public MaSplitterNode base(MaNodeBase other) {
    	base.set(other);
    	return this;
    }
    
    public MaNodeBase base() {
    	return base;
    }
    
    @Override
    public MaSplitterNode set(MaSplitterNode other) {
        return set(other.segment);
    }
    
    @Override
    public MaSplitterNode set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaSplitterNode> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaSplitterNode> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaSplitterNode(segment),
            count
        );
    }
    
    public static NativeStructArray<MaSplitterNode> array(Arena arena, MaSplitterNode... structs) {
        NativeStructArray<MaSplitterNode> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaSplitterNode(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaSplitterNode> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaSplitterNode(segment)
        );
    }

}