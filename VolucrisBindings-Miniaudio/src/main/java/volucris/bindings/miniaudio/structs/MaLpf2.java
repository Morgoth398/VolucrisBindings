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

public final class MaLpf2
		implements Struct<MaLpf2> {

	public static final StructLayout LAYOUT;

	public static final long BQ_BYTE_OFFSET;

	private final MemorySegment segment;

	private final MaBiquad bq;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    MaBiquad.LAYOUT.withName("bq")
		).withName("ma_lpf2").withByteAlignment(8);
		
		BQ_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("bq"));
		//@formatter:on
	}

	public MaLpf2() {
	    this(Arena.ofAuto());
	}
	
	public MaLpf2(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public MaLpf2(MemorySegment segment) {
	    this.segment = segment;
	
	    bq = new MaBiquad(segment.asSlice(BQ_BYTE_OFFSET, MaBiquad.LAYOUT));
	}

    /// @see #bq()
    public MaLpf2 bq(Consumer<MaBiquad> consumer) {
    	consumer.accept(bq);
    	return this;
    }
    
    /// @see #bq()
    public MaLpf2 bq(MaBiquad other) {
    	bq.set(other);
    	return this;
    }
    
    public MaBiquad bq() {
    	return bq;
    }
    
    @Override
    public MaLpf2 set(MaLpf2 other) {
        return set(other.segment);
    }
    
    @Override
    public MaLpf2 set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaLpf2> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaLpf2> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaLpf2(segment),
            count
        );
    }
    
    public static NativeStructArray<MaLpf2> array(Arena arena, MaLpf2... structs) {
        NativeStructArray<MaLpf2> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new MaLpf2(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaLpf2> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaLpf2(segment)
        );
    }

}