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

public final class MaDuplexRb
		implements Struct<MaDuplexRb> {

	public static final StructLayout LAYOUT;

	public static final long RB_BYTE_OFFSET;

	private final MemorySegment segment;

	private final MaPcmRb rb;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    MaPcmRb.LAYOUT.withName("rb")
		).withName("ma_duplex_rb").withByteAlignment(8);
		
		RB_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("rb"));
		//@formatter:on
	}

	public MaDuplexRb() {
	    this(Arena.ofAuto());
	}
	
	public MaDuplexRb(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public MaDuplexRb(MemorySegment segment) {
	    this.segment = segment;
	
	    rb = new MaPcmRb(segment.asSlice(RB_BYTE_OFFSET, MaPcmRb.LAYOUT));
	}

    /// @see #rb()
    public MaDuplexRb rb(Consumer<MaPcmRb> consumer) {
    	consumer.accept(rb);
    	return this;
    }
    
    /// @see #rb()
    public MaDuplexRb rb(MaPcmRb other) {
    	rb.set(other);
    	return this;
    }
    
    public MaPcmRb rb() {
    	return rb;
    }
    
    @Override
    public MaDuplexRb set(MaDuplexRb other) {
        return set(other.segment);
    }
    
    @Override
    public MaDuplexRb set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaDuplexRb> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaDuplexRb> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaDuplexRb(segment),
            count
        );
    }
    
    public static NativeStructArray<MaDuplexRb> array(SegmentAllocator allocator, MaDuplexRb... structs) {
        NativeStructArray<MaDuplexRb> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaDuplexRb(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaDuplexRb> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaDuplexRb(segment)
        );
    }

}