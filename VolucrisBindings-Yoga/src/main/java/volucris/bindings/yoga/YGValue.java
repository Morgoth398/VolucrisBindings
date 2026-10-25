/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.yoga;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

/// ```
/// 
/// Structure used to represent a dimension in a style.
/// ```
public final class YGValue
		implements Struct<YGValue> {

	public static final StructLayout LAYOUT;

	public static final VarHandle VALUE_HANDLE;
	public static final VarHandle UNIT_HANDLE;

	public static final long VALUE_BYTE_OFFSET;
	public static final long UNIT_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_FLOAT.withName("value"),
		    JAVA_INT.withName("unit")
		).withName("YGValue").withByteAlignment(4);
		
		VALUE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("value"));
		UNIT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("unit"));
		
		VALUE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("value"));
		UNIT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("unit"));
		//@formatter:on
	}

	public YGValue() {
	    this(Arena.ofAuto());
	}
	
	public YGValue(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public YGValue(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #value()
    public YGValue value(float value) {
    	VALUE_HANDLE.set(segment, 0L, value);
    	return this;
    }
    
    public float value() {
    	return (float) VALUE_HANDLE.get(segment, 0L);
    }
    
    /// @see #unit()
    public YGValue unit(int unit) {
    	UNIT_HANDLE.set(segment, 0L, unit);
    	return this;
    }
    
    public int unit() {
    	return (int) UNIT_HANDLE.get(segment, 0L);
    }
    
    @Override
    public YGValue set(YGValue other) {
        return set(other.segment);
    }
    
    @Override
    public YGValue set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<YGValue> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<YGValue> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new YGValue(segment),
            count
        );
    }
    
    public static NativeStructArray<YGValue> array(SegmentAllocator allocator, YGValue... structs) {
        NativeStructArray<YGValue> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new YGValue(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<YGValue> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new YGValue(segment)
        );
    }

}