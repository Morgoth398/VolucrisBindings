/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.assimp.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

/// ```
/// A time-value pair specifying a certain 3D vector for the given time.
/// ```
public final class AiVectorKey
		implements Struct<AiVectorKey> {

    public static final StructLayout LAYOUT;

    public static final VarHandle M_TIME_HANDLE;
    public static final VarHandle M_INTERPOLATION_HANDLE;

    public static final long M_TIME_BYTE_OFFSET;
    public static final long M_VALUE_BYTE_OFFSET;
    public static final long M_INTERPOLATION_BYTE_OFFSET;

    private final MemorySegment segment;

    private final AiVector3D mValue;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_DOUBLE.withName("mTime"),
            AiVector3D.LAYOUT.withName("mValue"),
            JAVA_INT.withName("mInterpolation")
        ).withName("aiVectorKey").withByteAlignment(8);
        
        M_TIME_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mTime"));
        M_INTERPOLATION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mInterpolation"));
        
        M_TIME_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mTime"));
        M_VALUE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mValue"));
        M_INTERPOLATION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mInterpolation"));
        //@formatter:on
    }

    public AiVectorKey() {
        this(Arena.ofAuto());
    }
    
    public AiVectorKey(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public AiVectorKey(MemorySegment segment) {
        this.segment = segment;
    
        mValue = new AiVector3D(segment.asSlice(M_VALUE_BYTE_OFFSET, AiVector3D.LAYOUT));
    }

    /// @see #mTime()
    public AiVectorKey mTime(double mTime) {
    	M_TIME_HANDLE.set(segment, 0L, mTime);
    	return this;
    }
    
    /// ```
    /// The time of this key
    /// ```
    public double mTime() {
    	return (double) M_TIME_HANDLE.get(segment, 0L);
    }
    
    /// @see #mInterpolation()
    public AiVectorKey mInterpolation(int mInterpolation) {
    	M_INTERPOLATION_HANDLE.set(segment, 0L, mInterpolation);
    	return this;
    }
    
    /// ```
    /// The interpolation setting of this key
    /// ```
    public int mInterpolation() {
    	return (int) M_INTERPOLATION_HANDLE.get(segment, 0L);
    }
    
    /// @see #mValue()
    public AiVectorKey mValue(Consumer<AiVector3D> consumer) {
    	consumer.accept(mValue);
    	return this;
    }
    
    /// @see #mValue()
    public AiVectorKey mValue(AiVector3D other) {
    	mValue.set(other);
    	return this;
    }
    
    /// ```
    /// The value of this key
    /// ```
    public AiVector3D mValue() {
    	return mValue;
    }
    
    @Override
    public AiVectorKey set(AiVectorKey other) {
        return set(other.segment);
    }
    
    @Override
    public AiVectorKey set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<AiVectorKey> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<AiVectorKey> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new AiVectorKey(segment),
            count
        );
    }
    
    public static NativeStructArray<AiVectorKey> array(Arena arena, AiVectorKey... structs) {
        NativeStructArray<AiVectorKey> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new AiVectorKey(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<AiVectorKey> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new AiVectorKey(segment)
        );
    }
    
}