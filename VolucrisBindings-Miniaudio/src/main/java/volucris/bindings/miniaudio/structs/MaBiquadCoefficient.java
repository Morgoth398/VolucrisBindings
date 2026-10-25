/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.miniaudio.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.UnionLayout;
import java.lang.invoke.VarHandle;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

/// ```
/// ***********************************************************************************************************************************************************
/// 
/// Biquad Filtering
/// 
/// ************************************************************************************************************************************************************
/// ```
public final class MaBiquadCoefficient
		implements Struct<MaBiquadCoefficient> {

	public static final UnionLayout LAYOUT;

	public static final VarHandle F32_HANDLE;
	public static final VarHandle S32_HANDLE;

	public static final long F32_BYTE_OFFSET;
	public static final long S32_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.unionLayout(
		    JAVA_FLOAT.withName("f32"),
		    JAVA_INT.withName("s32")
		).withName("ma_biquad_coefficient").withByteAlignment(4);
		
		F32_HANDLE = LAYOUT.varHandle(PathElement.groupElement("f32"));
		S32_HANDLE = LAYOUT.varHandle(PathElement.groupElement("s32"));
		
		F32_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("f32"));
		S32_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("s32"));
		//@formatter:on
	}

	public MaBiquadCoefficient() {
	    this(Arena.ofAuto());
	}
	
	public MaBiquadCoefficient(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public MaBiquadCoefficient(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #f32()
    public MaBiquadCoefficient f32(float f32) {
    	F32_HANDLE.set(segment, 0L, f32);
    	return this;
    }
    
    public float f32() {
    	return (float) F32_HANDLE.get(segment, 0L);
    }
    
    /// @see #s32()
    public MaBiquadCoefficient s32(int s32) {
    	S32_HANDLE.set(segment, 0L, s32);
    	return this;
    }
    
    public int s32() {
    	return (int) S32_HANDLE.get(segment, 0L);
    }
    
    @Override
    public MaBiquadCoefficient set(MaBiquadCoefficient other) {
        return set(other.segment);
    }
    
    @Override
    public MaBiquadCoefficient set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<MaBiquadCoefficient> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<MaBiquadCoefficient> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaBiquadCoefficient(segment),
            count
        );
    }
    
    public static NativeStructArray<MaBiquadCoefficient> array(SegmentAllocator allocator, MaBiquadCoefficient... structs) {
        NativeStructArray<MaBiquadCoefficient> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new MaBiquadCoefficient(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<MaBiquadCoefficient> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new MaBiquadCoefficient(segment)
        );
    }

}