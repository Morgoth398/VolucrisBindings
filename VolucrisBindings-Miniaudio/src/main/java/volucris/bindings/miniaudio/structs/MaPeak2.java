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

public final class MaPeak2
		implements Struct<MaPeak2> {

	public static final StructLayout LAYOUT;

	public static final long BQ_BYTE_OFFSET;

	private final MemorySegment segment;

	private final MaBiquad bq;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    MaBiquad.LAYOUT.withName("bq")
		).withName("ma_peak2").withByteAlignment(8);
		
		BQ_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("bq"));
		//@formatter:on
	}

	public MaPeak2() {
	    this(Arena.ofAuto());
	}
	
	public MaPeak2(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public MaPeak2(MemorySegment segment) {
	    this.segment = segment;
	
	    bq = new MaBiquad(segment.asSlice(BQ_BYTE_OFFSET, MaBiquad.LAYOUT));
	}

    /// @see #bq()
    public MaPeak2 bq(Consumer<MaBiquad> consumer) {
    	consumer.accept(bq);
    	return this;
    }
    
    /// @see #bq()
    public MaPeak2 bq(MaBiquad other) {
    	bq.set(other);
    	return this;
    }
    
    public MaBiquad bq() {
    	return bq;
    }
    
    @Override
    public MaPeak2 set(MaPeak2 other) {
        return set(other.segment);
    }
    
    @Override
    public MaPeak2 set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaPeak2> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaPeak2> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaPeak2(segment),
            count
        );
    }
    
    public static NativeStructArray<MaPeak2> array(SegmentAllocator allocator, MaPeak2... structs) {
        NativeStructArray<MaPeak2> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaPeak2(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaPeak2> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaPeak2(segment)
        );
    }

}