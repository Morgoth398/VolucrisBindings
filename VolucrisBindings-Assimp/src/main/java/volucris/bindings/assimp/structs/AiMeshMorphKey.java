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
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeDoubleArray;
import volucris.bindings.core.NativeIntArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/// ```
/// Binds a morph anim mesh to a specific point in time.
/// ```
public final class AiMeshMorphKey
		implements Struct<AiMeshMorphKey> {

	public static final StructLayout LAYOUT;

	public static final VarHandle M_TIME_HANDLE;
	public static final VarHandle M_VALUES_HANDLE;
	public static final VarHandle M_WEIGHTS_HANDLE;
	public static final VarHandle M_NUM_VALUES_AND_WEIGHTS_HANDLE;

	public static final long M_TIME_BYTE_OFFSET;
	public static final long M_VALUES_BYTE_OFFSET;
	public static final long M_WEIGHTS_BYTE_OFFSET;
	public static final long M_NUM_VALUES_AND_WEIGHTS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_DOUBLE.withName("mTime"),
		    UNBOUNDED_ADDRESS.withName("mValues"),
		    UNBOUNDED_ADDRESS.withName("mWeights"),
		    JAVA_INT.withName("mNumValuesAndWeights"),
		    MemoryLayout.paddingLayout(4)
		).withName("aiMeshMorphKey").withByteAlignment(8);
		
		M_TIME_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mTime"));
		M_VALUES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mValues"));
		M_WEIGHTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mWeights"));
		M_NUM_VALUES_AND_WEIGHTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mNumValuesAndWeights"));
		
		M_TIME_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mTime"));
		M_VALUES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mValues"));
		M_WEIGHTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mWeights"));
		M_NUM_VALUES_AND_WEIGHTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mNumValuesAndWeights"));
		//@formatter:on
	}

	public AiMeshMorphKey() {
	    this(Arena.ofAuto());
	}
	
	public AiMeshMorphKey(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public AiMeshMorphKey(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #mTime()
    public AiMeshMorphKey mTime(double mTime) {
    	M_TIME_HANDLE.set(segment, 0L, mTime);
    	return this;
    }
    
    /// ```
    /// The time of this key
    /// ```
    public double mTime() {
    	return (double) M_TIME_HANDLE.get(segment, 0L);
    }
    
    /// @see #mValues()
    public AiMeshMorphKey mValues(NativeIntArray mValues) {
    	M_VALUES_HANDLE.set(segment, 0L, mValues.memorySegment());
    	return this;
    }
    
    /// ```
    /// The values and weights at the time of this key
    /// - mValues: index of attachment mesh to apply weight at the same position in mWeights
    /// - mWeights: weight to apply to the blend shape index at the same position in mValues
    /// ```
    public @Nullable NativeIntArray mValues() {
    	MemorySegment segment = (MemorySegment) M_VALUES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeIntArray(segment);
    }
    
    /// @see #mWeights()
    public AiMeshMorphKey mWeights(NativeDoubleArray mWeights) {
    	M_WEIGHTS_HANDLE.set(segment, 0L, mWeights.memorySegment());
    	return this;
    }
    
    public @Nullable NativeDoubleArray mWeights() {
    	MemorySegment segment = (MemorySegment) M_WEIGHTS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeDoubleArray(segment);
    }
    
    /// @see #mNumValuesAndWeights()
    public AiMeshMorphKey mNumValuesAndWeights(int mNumValuesAndWeights) {
    	M_NUM_VALUES_AND_WEIGHTS_HANDLE.set(segment, 0L, mNumValuesAndWeights);
    	return this;
    }
    
    /// ```
    /// The number of values and weights
    /// ```
    public int mNumValuesAndWeights() {
    	return (int) M_NUM_VALUES_AND_WEIGHTS_HANDLE.get(segment, 0L);
    }
    
    @Override
    public AiMeshMorphKey set(AiMeshMorphKey other) {
        return set(other.segment);
    }
    
    @Override
    public AiMeshMorphKey set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<AiMeshMorphKey> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<AiMeshMorphKey> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new AiMeshMorphKey(segment),
            count
        );
    }
    
    public static NativeStructArray<AiMeshMorphKey> array(Arena arena, AiMeshMorphKey... structs) {
        NativeStructArray<AiMeshMorphKey> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new AiMeshMorphKey(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<AiMeshMorphKey> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new AiMeshMorphKey(segment)
        );
    }

}