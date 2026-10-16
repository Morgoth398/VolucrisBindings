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

public final class MaHpf2
		implements Struct<MaHpf2> {

	public static final StructLayout LAYOUT;

	public static final long BQ_BYTE_OFFSET;

	private final MemorySegment segment;

	private final MaBiquad bq;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    MaBiquad.LAYOUT.withName("bq")
		).withName("ma_hpf2").withByteAlignment(8);
		
		BQ_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("bq"));
		//@formatter:on
	}

	public MaHpf2() {
	    this(Arena.ofAuto());
	}
	
	public MaHpf2(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public MaHpf2(MemorySegment segment) {
	    this.segment = segment;
	
	    bq = new MaBiquad(segment.asSlice(BQ_BYTE_OFFSET, MaBiquad.LAYOUT));
	}

    /// @see #bq()
    public MaHpf2 bq(Consumer<MaBiquad> consumer) {
    	consumer.accept(bq);
    	return this;
    }
    
    /// @see #bq()
    public MaHpf2 bq(MaBiquad other) {
    	bq.set(other);
    	return this;
    }
    
    public MaBiquad bq() {
    	return bq;
    }
    
    @Override
    public MaHpf2 set(MaHpf2 other) {
        return set(other.segment);
    }
    
    @Override
    public MaHpf2 set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaHpf2> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaHpf2> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaHpf2(segment),
            count
        );
    }
    
    public static NativeStructArray<MaHpf2> array(Arena arena, MaHpf2... structs) {
        NativeStructArray<MaHpf2> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaHpf2(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaHpf2> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaHpf2(segment)
        );
    }

}