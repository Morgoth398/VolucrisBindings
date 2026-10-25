/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.assimp.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

/// ```
/// A time-value pair specifying a rotation for the given time.
/// Rotations are expressed with quaternions.
/// ```
public final class AiQuatKey
		implements Struct<AiQuatKey> {

	public static final StructLayout LAYOUT;

	public static final VarHandle M_TIME_HANDLE;
	public static final VarHandle M_INTERPOLATION_HANDLE;

	public static final long M_TIME_BYTE_OFFSET;
	public static final long M_VALUE_BYTE_OFFSET;
	public static final long M_INTERPOLATION_BYTE_OFFSET;

	private final MemorySegment segment;

	private final AiQuaternion mValue;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_DOUBLE.withName("mTime"),
		    AiQuaternion.LAYOUT.withName("mValue"),
		    JAVA_INT.withName("mInterpolation"),
		    MemoryLayout.paddingLayout(4)
		).withName("aiQuatKey").withByteAlignment(8);
		
		M_TIME_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mTime"));
		M_INTERPOLATION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mInterpolation"));
		
		M_TIME_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mTime"));
		M_VALUE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mValue"));
		M_INTERPOLATION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mInterpolation"));
		//@formatter:on
	}

	public AiQuatKey() {
	    this(Arena.ofAuto());
	}
	
	public AiQuatKey(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public AiQuatKey(MemorySegment segment) {
	    this.segment = segment;
	
	    mValue = new AiQuaternion(segment.asSlice(M_VALUE_BYTE_OFFSET, AiQuaternion.LAYOUT));
	}

    /// @see #mTime()
    public AiQuatKey mTime(double mTime) {
    	M_TIME_HANDLE.set(segment, 0L, mTime);
    	return this;
    }
    
    /// ```
    /// The time of this key
    /// ```
    public double mTime() {
    	return (double) M_TIME_HANDLE.get(segment, 0L);
    }
    
    /// @see #mValue()
    public AiQuatKey mValue(Consumer<AiQuaternion> consumer) {
    	consumer.accept(mValue);
    	return this;
    }
    
    /// @see #mValue()
    public AiQuatKey mValue(AiQuaternion other) {
    	mValue.set(other);
    	return this;
    }
    
    /// ```
    /// The value of this key
    /// ```
    public AiQuaternion mValue() {
    	return mValue;
    }
    
    /// @see #mInterpolation()
    public AiQuatKey mInterpolation(int mInterpolation) {
    	M_INTERPOLATION_HANDLE.set(segment, 0L, mInterpolation);
    	return this;
    }
    
    /// ```
    /// The interpolation setting of this key
    /// ```
    public int mInterpolation() {
    	return (int) M_INTERPOLATION_HANDLE.get(segment, 0L);
    }
    
    @Override
    public AiQuatKey set(AiQuatKey other) {
        return set(other.segment);
    }
    
    @Override
    public AiQuatKey set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<AiQuatKey> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<AiQuatKey> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new AiQuatKey(segment),
            count
        );
    }
    
    public static NativeStructArray<AiQuatKey> array(Arena arena, AiQuatKey... structs) {
        NativeStructArray<AiQuatKey> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new AiQuatKey(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<AiQuatKey> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new AiQuatKey(segment)
        );
    }

}