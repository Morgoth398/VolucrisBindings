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
/// 
/// @brief Defines how an UV channel is transformed.
/// 
/// This is just a helper structure for the #AI_MATKEY_UVTRANSFORM key.
/// See its documentation for more details.
/// 
/// Typically you'll want to build a matrix of this information. However,
/// we keep separate scaling/translation/rotation values to make it
/// easier to process and optimize UV transformations internally.
/// ```
public final class AiUVTransform
		implements Struct<AiUVTransform> {

	public static final StructLayout LAYOUT;

	public static final VarHandle M_ROTATION_HANDLE;

	public static final long M_TRANSLATION_BYTE_OFFSET;
	public static final long M_SCALING_BYTE_OFFSET;
	public static final long M_ROTATION_BYTE_OFFSET;

	private final MemorySegment segment;

	private final AiVector2D mTranslation;
	private final AiVector2D mScaling;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    AiVector2D.LAYOUT.withName("mTranslation"),
		    AiVector2D.LAYOUT.withName("mScaling"),
		    JAVA_FLOAT.withName("mRotation")
		).withName("aiUVTransform").withByteAlignment(4);
		
		M_ROTATION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mRotation"));
		
		M_TRANSLATION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mTranslation"));
		M_SCALING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mScaling"));
		M_ROTATION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mRotation"));
		//@formatter:on
	}

	public AiUVTransform() {
	    this(Arena.ofAuto());
	}
	
	public AiUVTransform(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public AiUVTransform(MemorySegment segment) {
	    this.segment = segment;
	
	    mTranslation = new AiVector2D(segment.asSlice(M_TRANSLATION_BYTE_OFFSET, AiVector2D.LAYOUT));
	    mScaling = new AiVector2D(segment.asSlice(M_SCALING_BYTE_OFFSET, AiVector2D.LAYOUT));
	}

    /// @see #mTranslation()
    public AiUVTransform mTranslation(Consumer<AiVector2D> consumer) {
    	consumer.accept(mTranslation);
    	return this;
    }
    
    /// @see #mTranslation()
    public AiUVTransform mTranslation(AiVector2D other) {
    	mTranslation.set(other);
    	return this;
    }
    
    /// ```
    /// Translation on the u and v axes.
    /// 
    /// The default value is (0|0).
    /// ```
    public AiVector2D mTranslation() {
    	return mTranslation;
    }
    
    /// @see #mScaling()
    public AiUVTransform mScaling(Consumer<AiVector2D> consumer) {
    	consumer.accept(mScaling);
    	return this;
    }
    
    /// @see #mScaling()
    public AiUVTransform mScaling(AiVector2D other) {
    	mScaling.set(other);
    	return this;
    }
    
    /// ```
    /// Scaling on the u and v axes.
    /// 
    /// The default value is (1|1).
    /// ```
    public AiVector2D mScaling() {
    	return mScaling;
    }
    
    /// @see #mRotation()
    public AiUVTransform mRotation(float mRotation) {
    	M_ROTATION_HANDLE.set(segment, 0L, mRotation);
    	return this;
    }
    
    /// ```
    /// Rotation - in counter-clockwise direction.
    /// 
    /// The rotation angle is specified in radians. The
    /// rotation center is 0.5f|0.5f. The default value
    /// 0.f.
    /// ```
    public float mRotation() {
    	return (float) M_ROTATION_HANDLE.get(segment, 0L);
    }
    
    @Override
    public AiUVTransform set(AiUVTransform other) {
        return set(other.segment);
    }
    
    @Override
    public AiUVTransform set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<AiUVTransform> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<AiUVTransform> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new AiUVTransform(segment),
            count
        );
    }
    
    public static NativeStructArray<AiUVTransform> array(Arena arena, AiUVTransform... structs) {
        NativeStructArray<AiUVTransform> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new AiUVTransform(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<AiUVTransform> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new AiUVTransform(segment)
        );
    }

}