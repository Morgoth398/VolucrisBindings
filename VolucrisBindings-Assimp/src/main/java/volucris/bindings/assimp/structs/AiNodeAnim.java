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
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/// ```
/// Describes the animation of a single node. The name specifies the
/// bone/node which is affected by this animation channel. The keyframes
/// are given in three separate series of values, one each for position,
/// rotation and scaling. The transformation matrix computed from these
/// values replaces the node's original transformation matrix at a
/// specific time.
/// This means all keys are absolute and not relative to the bone default pose.
/// The order in which the transformations are applied is
/// - as usual - scaling, rotation, translation.
/// 
/// @note All keys are returned in their correct, chronological order.
/// Duplicate keys don't pass the validation step. Most likely there
/// will be no negative time values, but they are not forbidden also ( so
/// implementations need to cope with them! )
/// ```
public final class AiNodeAnim
		implements Struct<AiNodeAnim> {

	public static final StructLayout LAYOUT;

	public static final VarHandle M_NUM_POSITION_KEYS_HANDLE;
	public static final VarHandle M_POSITION_KEYS_HANDLE;
	public static final VarHandle M_NUM_ROTATION_KEYS_HANDLE;
	public static final VarHandle M_ROTATION_KEYS_HANDLE;
	public static final VarHandle M_NUM_SCALING_KEYS_HANDLE;
	public static final VarHandle M_SCALING_KEYS_HANDLE;
	public static final VarHandle M_PRE_STATE_HANDLE;
	public static final VarHandle M_POST_STATE_HANDLE;

	public static final long M_NODE_NAME_BYTE_OFFSET;
	public static final long M_NUM_POSITION_KEYS_BYTE_OFFSET;
	public static final long M_POSITION_KEYS_BYTE_OFFSET;
	public static final long M_NUM_ROTATION_KEYS_BYTE_OFFSET;
	public static final long M_ROTATION_KEYS_BYTE_OFFSET;
	public static final long M_NUM_SCALING_KEYS_BYTE_OFFSET;
	public static final long M_SCALING_KEYS_BYTE_OFFSET;
	public static final long M_PRE_STATE_BYTE_OFFSET;
	public static final long M_POST_STATE_BYTE_OFFSET;

	private final MemorySegment segment;

	private final AiString mNodeName;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    AiString.LAYOUT.withName("mNodeName"),
		    JAVA_INT.withName("mNumPositionKeys"),
		    UNBOUNDED_ADDRESS.withName("mPositionKeys"),
		    JAVA_INT.withName("mNumRotationKeys"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("mRotationKeys"),
		    JAVA_INT.withName("mNumScalingKeys"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("mScalingKeys"),
		    JAVA_INT.withName("mPreState"),
		    JAVA_INT.withName("mPostState")
		).withName("aiNodeAnim").withByteAlignment(8);
		
		M_NUM_POSITION_KEYS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mNumPositionKeys"));
		M_POSITION_KEYS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mPositionKeys"));
		M_NUM_ROTATION_KEYS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mNumRotationKeys"));
		M_ROTATION_KEYS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mRotationKeys"));
		M_NUM_SCALING_KEYS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mNumScalingKeys"));
		M_SCALING_KEYS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mScalingKeys"));
		M_PRE_STATE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mPreState"));
		M_POST_STATE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mPostState"));
		
		M_NODE_NAME_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mNodeName"));
		M_NUM_POSITION_KEYS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mNumPositionKeys"));
		M_POSITION_KEYS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mPositionKeys"));
		M_NUM_ROTATION_KEYS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mNumRotationKeys"));
		M_ROTATION_KEYS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mRotationKeys"));
		M_NUM_SCALING_KEYS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mNumScalingKeys"));
		M_SCALING_KEYS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mScalingKeys"));
		M_PRE_STATE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mPreState"));
		M_POST_STATE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mPostState"));
		//@formatter:on
	}

	public AiNodeAnim() {
	    this(Arena.ofAuto());
	}
	
	public AiNodeAnim(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public AiNodeAnim(MemorySegment segment) {
	    this.segment = segment;
	
	    mNodeName = new AiString(segment.asSlice(M_NODE_NAME_BYTE_OFFSET, AiString.LAYOUT));
	}

    /// @see #mNodeName()
    public AiNodeAnim mNodeName(Consumer<AiString> consumer) {
    	consumer.accept(mNodeName);
    	return this;
    }
    
    /// @see #mNodeName()
    public AiNodeAnim mNodeName(AiString other) {
    	mNodeName.set(other);
    	return this;
    }
    
    /// ```
    /// The name of the node affected by this animation. The node
    /// must exist and it must be unique.
    /// ```
    public AiString mNodeName() {
    	return mNodeName;
    }
    
    /// @see #mNumPositionKeys()
    public AiNodeAnim mNumPositionKeys(int mNumPositionKeys) {
    	M_NUM_POSITION_KEYS_HANDLE.set(segment, 0L, mNumPositionKeys);
    	return this;
    }
    
    /// ```
    /// The number of position keys
    /// ```
    public int mNumPositionKeys() {
    	return (int) M_NUM_POSITION_KEYS_HANDLE.get(segment, 0L);
    }
    
    /// @see #mPositionKeys()
    public AiNodeAnim mPositionKeys(NativeStructArray<AiVectorKey> mPositionKeys) {
    	M_POSITION_KEYS_HANDLE.set(segment, 0L, mPositionKeys.memorySegment());
    	return this;
    }
    
    /// ```
    /// The position keys of this animation channel. Positions are
    /// specified as 3D vector. The array is mNumPositionKeys in size.
    /// 
    /// If there are position keys, there will also be at least one
    /// scaling and one rotation key.
    /// ```
    public @Nullable NativeStructArray<AiVectorKey> mPositionKeys() {
    	MemorySegment segment = (MemorySegment) M_POSITION_KEYS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return AiVectorKey.array(segment);
    }
    
    /// @see #mNumRotationKeys()
    public AiNodeAnim mNumRotationKeys(int mNumRotationKeys) {
    	M_NUM_ROTATION_KEYS_HANDLE.set(segment, 0L, mNumRotationKeys);
    	return this;
    }
    
    /// ```
    /// The number of rotation keys
    /// ```
    public int mNumRotationKeys() {
    	return (int) M_NUM_ROTATION_KEYS_HANDLE.get(segment, 0L);
    }
    
    /// @see #mRotationKeys()
    public AiNodeAnim mRotationKeys(NativeStructArray<AiQuatKey> mRotationKeys) {
    	M_ROTATION_KEYS_HANDLE.set(segment, 0L, mRotationKeys.memorySegment());
    	return this;
    }
    
    /// ```
    /// The rotation keys of this animation channel. Rotations are
    /// given as quaternions,  which are 4D vectors. The array is
    /// mNumRotationKeys in size.
    /// 
    /// If there are rotation keys, there will also be at least one
    /// scaling and one position key.
    /// ```
    public @Nullable NativeStructArray<AiQuatKey> mRotationKeys() {
    	MemorySegment segment = (MemorySegment) M_ROTATION_KEYS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return AiQuatKey.array(segment);
    }
    
    /// @see #mNumScalingKeys()
    public AiNodeAnim mNumScalingKeys(int mNumScalingKeys) {
    	M_NUM_SCALING_KEYS_HANDLE.set(segment, 0L, mNumScalingKeys);
    	return this;
    }
    
    /// ```
    /// The number of scaling keys
    /// ```
    public int mNumScalingKeys() {
    	return (int) M_NUM_SCALING_KEYS_HANDLE.get(segment, 0L);
    }
    
    /// @see #mScalingKeys()
    public AiNodeAnim mScalingKeys(NativeStructArray<AiVectorKey> mScalingKeys) {
    	M_SCALING_KEYS_HANDLE.set(segment, 0L, mScalingKeys.memorySegment());
    	return this;
    }
    
    /// ```
    /// The scaling keys of this animation channel. Scalings are
    /// specified as 3D vector. The array is mNumScalingKeys in size.
    /// 
    /// If there are scaling keys, there will also be at least one
    /// position and one rotation key.
    /// ```
    public @Nullable NativeStructArray<AiVectorKey> mScalingKeys() {
    	MemorySegment segment = (MemorySegment) M_SCALING_KEYS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return AiVectorKey.array(segment);
    }
    
    /// @see #mPreState()
    public AiNodeAnim mPreState(int mPreState) {
    	M_PRE_STATE_HANDLE.set(segment, 0L, mPreState);
    	return this;
    }
    
    /// ```
    /// Defines how the animation behaves before the first
    /// key is encountered.
    /// 
    /// The default value is aiAnimBehaviour_DEFAULT (the original
    /// transformation matrix of the affected node is used).
    /// ```
    public int mPreState() {
    	return (int) M_PRE_STATE_HANDLE.get(segment, 0L);
    }
    
    /// @see #mPostState()
    public AiNodeAnim mPostState(int mPostState) {
    	M_POST_STATE_HANDLE.set(segment, 0L, mPostState);
    	return this;
    }
    
    /// ```
    /// Defines how the animation behaves after the last
    /// key was processed.
    /// 
    /// The default value is aiAnimBehaviour_DEFAULT (the original
    /// transformation matrix of the affected node is taken).
    /// ```
    public int mPostState() {
    	return (int) M_POST_STATE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public AiNodeAnim set(AiNodeAnim other) {
        return set(other.segment);
    }
    
    @Override
    public AiNodeAnim set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<AiNodeAnim> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<AiNodeAnim> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new AiNodeAnim(segment),
            count
        );
    }
    
    public static NativeStructArray<AiNodeAnim> array(Arena arena, AiNodeAnim... structs) {
        NativeStructArray<AiNodeAnim> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new AiNodeAnim(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<AiNodeAnim> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new AiNodeAnim(segment)
        );
    }

}