/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.msdfgen;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

public final class MsdfRange
		implements Struct<MsdfRange> {

	public static final StructLayout LAYOUT;

	public static final VarHandle LOWER_HANDLE;
	public static final VarHandle UPPER_HANDLE;

	public static final long LOWER_BYTE_OFFSET;
	public static final long UPPER_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_DOUBLE.withName("lower"),
		    JAVA_DOUBLE.withName("upper")
		).withName("msdf_range").withByteAlignment(8);
		
		LOWER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("lower"));
		UPPER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("upper"));
		
		LOWER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("lower"));
		UPPER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("upper"));
		//@formatter:on
	}

	public MsdfRange() {
	    this(Arena.ofAuto());
	}
	
	public MsdfRange(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public MsdfRange(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #lower()
    public MsdfRange lower(double lower) {
    	LOWER_HANDLE.set(segment, 0L, lower);
    	return this;
    }
    
    public double lower() {
    	return (double) LOWER_HANDLE.get(segment, 0L);
    }
    
    /// @see #upper()
    public MsdfRange upper(double upper) {
    	UPPER_HANDLE.set(segment, 0L, upper);
    	return this;
    }
    
    public double upper() {
    	return (double) UPPER_HANDLE.get(segment, 0L);
    }
    
    @Override
    public MsdfRange set(MsdfRange other) {
        return set(other.segment);
    }
    
    @Override
    public MsdfRange set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MsdfRange> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MsdfRange> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MsdfRange(segment),
            count
        );
    }
    
    public static NativeStructArray<MsdfRange> array(SegmentAllocator allocator, MsdfRange... structs) {
        NativeStructArray<MsdfRange> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MsdfRange(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MsdfRange> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MsdfRange(segment)
        );
    }

}