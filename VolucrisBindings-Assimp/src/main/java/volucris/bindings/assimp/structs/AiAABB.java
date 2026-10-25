/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.assimp.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.util.function.Consumer;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;

/// ```
/// 
/// An axis-aligned bounding box.
/// ```
public final class AiAABB
		implements Struct<AiAABB> {

	public static final StructLayout LAYOUT;

	public static final long M_MIN_BYTE_OFFSET;
	public static final long M_MAX_BYTE_OFFSET;

	private final MemorySegment segment;

	private final AiVector3D mMin;
	private final AiVector3D mMax;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    AiVector3D.LAYOUT.withName("mMin"),
		    AiVector3D.LAYOUT.withName("mMax")
		).withName("aiAABB").withByteAlignment(4);
		
		M_MIN_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mMin"));
		M_MAX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mMax"));
		//@formatter:on
	}

	public AiAABB() {
	    this(Arena.ofAuto());
	}
	
	public AiAABB(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public AiAABB(MemorySegment segment) {
	    this.segment = segment;
	
	    mMin = new AiVector3D(segment.asSlice(M_MIN_BYTE_OFFSET, AiVector3D.LAYOUT));
	    mMax = new AiVector3D(segment.asSlice(M_MAX_BYTE_OFFSET, AiVector3D.LAYOUT));
	}

    /// @see #mMin()
    public AiAABB mMin(Consumer<AiVector3D> consumer) {
    	consumer.accept(mMin);
    	return this;
    }
    
    /// @see #mMin()
    public AiAABB mMin(AiVector3D other) {
    	mMin.set(other);
    	return this;
    }
    
    public AiVector3D mMin() {
    	return mMin;
    }
    
    /// @see #mMax()
    public AiAABB mMax(Consumer<AiVector3D> consumer) {
    	consumer.accept(mMax);
    	return this;
    }
    
    /// @see #mMax()
    public AiAABB mMax(AiVector3D other) {
    	mMax.set(other);
    	return this;
    }
    
    public AiVector3D mMax() {
    	return mMax;
    }
    
    @Override
    public AiAABB set(AiAABB other) {
        return set(other.segment);
    }
    
    @Override
    public AiAABB set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<AiAABB> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<AiAABB> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new AiAABB(segment),
            count
        );
    }
    
    public static NativeStructArray<AiAABB> array(Arena arena, AiAABB... structs) {
        NativeStructArray<AiAABB> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new AiAABB(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<AiAABB> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new AiAABB(segment)
        );
    }

}