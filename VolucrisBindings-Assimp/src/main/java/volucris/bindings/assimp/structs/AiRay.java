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
/// Represents a ray
/// ```
public final class AiRay
		implements Struct<AiRay> {

	public static final StructLayout LAYOUT;

	public static final long POS_BYTE_OFFSET;
	public static final long DIR_BYTE_OFFSET;

	private final MemorySegment segment;

	private final AiVector3D pos;
	private final AiVector3D dir;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    AiVector3D.LAYOUT.withName("pos"),
		    AiVector3D.LAYOUT.withName("dir")
		).withName("aiRay").withByteAlignment(4);
		
		POS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pos"));
		DIR_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("dir"));
		//@formatter:on
	}

	public AiRay() {
	    this(Arena.ofAuto());
	}
	
	public AiRay(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public AiRay(MemorySegment segment) {
	    this.segment = segment;
	
	    pos = new AiVector3D(segment.asSlice(POS_BYTE_OFFSET, AiVector3D.LAYOUT));
	    dir = new AiVector3D(segment.asSlice(DIR_BYTE_OFFSET, AiVector3D.LAYOUT));
	}

    /// @see #pos()
    public AiRay pos(Consumer<AiVector3D> consumer) {
    	consumer.accept(pos);
    	return this;
    }
    
    /// @see #pos()
    public AiRay pos(AiVector3D other) {
    	pos.set(other);
    	return this;
    }
    
    /// ```
    /// Position and direction of the ray
    /// ```
    public AiVector3D pos() {
    	return pos;
    }
    
    /// @see #dir()
    public AiRay dir(Consumer<AiVector3D> consumer) {
    	consumer.accept(dir);
    	return this;
    }
    
    /// @see #dir()
    public AiRay dir(AiVector3D other) {
    	dir.set(other);
    	return this;
    }
    
    /// ```
    /// Position and direction of the ray
    /// ```
    public AiVector3D dir() {
    	return dir;
    }
    
    @Override
    public AiRay set(AiRay other) {
        return set(other.segment);
    }
    
    @Override
    public AiRay set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<AiRay> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<AiRay> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new AiRay(segment),
            count
        );
    }
    
    public static NativeStructArray<AiRay> array(Arena arena, AiRay... structs) {
        NativeStructArray<AiRay> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new AiRay(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<AiRay> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new AiRay(segment)
        );
    }

}