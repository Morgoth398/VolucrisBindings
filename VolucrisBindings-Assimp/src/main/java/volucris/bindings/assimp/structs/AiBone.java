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
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/// ```
/// @brief A single bone of a mesh.
/// 
/// A bone has a name by which it can be found in the frame hierarchy and by
/// which it can be addressed by animations. In addition it has a number of
/// influences on vertices, and a matrix relating the mesh position to the
/// position of the bone at the time of binding.
/// ```
public final class AiBone
		implements Struct<AiBone> {

	public static final StructLayout LAYOUT;

	public static final VarHandle M_NUM_WEIGHTS_HANDLE;
	public static final VarHandle M_ARMATURE_HANDLE;
	public static final VarHandle M_NODE_HANDLE;
	public static final VarHandle M_WEIGHTS_HANDLE;

	public static final long M_NAME_BYTE_OFFSET;
	public static final long M_NUM_WEIGHTS_BYTE_OFFSET;
	public static final long M_ARMATURE_BYTE_OFFSET;
	public static final long M_NODE_BYTE_OFFSET;
	public static final long M_WEIGHTS_BYTE_OFFSET;
	public static final long M_OFFSET_MATRIX_BYTE_OFFSET;

	private final MemorySegment segment;

	private final AiString mName;
	private final AiMatrix4x4 mOffsetMatrix;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    AiString.LAYOUT.withName("mName"),
		    JAVA_INT.withName("mNumWeights"),
		    UNBOUNDED_ADDRESS.withName("mArmature"),
		    UNBOUNDED_ADDRESS.withName("mNode"),
		    UNBOUNDED_ADDRESS.withName("mWeights"),
		    AiMatrix4x4.LAYOUT.withName("mOffsetMatrix")
		).withName("aiBone").withByteAlignment(8);
		
		M_NUM_WEIGHTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mNumWeights"));
		M_ARMATURE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mArmature"));
		M_NODE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mNode"));
		M_WEIGHTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mWeights"));
		
		M_NAME_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mName"));
		M_NUM_WEIGHTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mNumWeights"));
		M_ARMATURE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mArmature"));
		M_NODE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mNode"));
		M_WEIGHTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mWeights"));
		M_OFFSET_MATRIX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mOffsetMatrix"));
		//@formatter:on
	}

	public AiBone() {
	    this(Arena.ofAuto());
	}
	
	public AiBone(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public AiBone(MemorySegment segment) {
	    this.segment = segment;
	
	    mName = new AiString(segment.asSlice(M_NAME_BYTE_OFFSET, AiString.LAYOUT));
	    mOffsetMatrix = new AiMatrix4x4(segment.asSlice(M_OFFSET_MATRIX_BYTE_OFFSET, AiMatrix4x4.LAYOUT));
	}

    /// @see #mName()
    public AiBone mName(Consumer<AiString> consumer) {
    	consumer.accept(mName);
    	return this;
    }
    
    /// @see #mName()
    public AiBone mName(AiString other) {
    	mName.set(other);
    	return this;
    }
    
    /// ```
    /// 
    /// The name of the bone.
    /// ```
    public AiString mName() {
    	return mName;
    }
    
    /// @see #mNumWeights()
    public AiBone mNumWeights(int mNumWeights) {
    	M_NUM_WEIGHTS_HANDLE.set(segment, 0L, mNumWeights);
    	return this;
    }
    
    /// ```
    /// 
    /// The number of vertices affected by this bone.
    /// The maximum value for this member is #AI_MAX_BONE_WEIGHTS.
    /// ```
    public int mNumWeights() {
    	return (int) M_NUM_WEIGHTS_HANDLE.get(segment, 0L);
    }
    
    /// @see #mArmature()
    public AiBone mArmature(AiNode mArmature) {
    	M_ARMATURE_HANDLE.set(segment, 0L, mArmature.memorySegment());
    	return this;
    }
    
    /// ```
    /// 
    /// The bone armature node - used for skeleton conversion
    /// you must enable aiProcess_PopulateArmatureData to populate this
    /// ```
    public @Nullable AiNode mArmature() {
    	MemorySegment segment = (MemorySegment) M_ARMATURE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new AiNode(segment);
    }
    
    /// @see #mNode()
    public AiBone mNode(AiNode mNode) {
    	M_NODE_HANDLE.set(segment, 0L, mNode.memorySegment());
    	return this;
    }
    
    /// ```
    /// 
    /// The bone node in the scene - used for skeleton conversion
    /// you must enable aiProcess_PopulateArmatureData to populate this
    /// ```
    public @Nullable AiNode mNode() {
    	MemorySegment segment = (MemorySegment) M_NODE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new AiNode(segment);
    }
    
    /// @see #mWeights()
    public AiBone mWeights(NativeStructArray<AiVertexWeight> mWeights) {
    	M_WEIGHTS_HANDLE.set(segment, 0L, mWeights.memorySegment());
    	return this;
    }
    
    /// ```
    /// 
    /// The influence weights of this bone, by vertex index.
    /// ```
    public @Nullable NativeStructArray<AiVertexWeight> mWeights() {
    	MemorySegment segment = (MemorySegment) M_WEIGHTS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return AiVertexWeight.array(segment);
    }
    
    /// @see #mOffsetMatrix()
    public AiBone mOffsetMatrix(Consumer<AiMatrix4x4> consumer) {
    	consumer.accept(mOffsetMatrix);
    	return this;
    }
    
    /// @see #mOffsetMatrix()
    public AiBone mOffsetMatrix(AiMatrix4x4 other) {
    	mOffsetMatrix.set(other);
    	return this;
    }
    
    /// ```
    /// 
    /// Matrix that transforms from mesh space to bone space in bind pose.
    /// 
    /// This matrix describes the position of the mesh
    /// in the local space of this bone when the skeleton was bound.
    /// Thus it can be used directly to determine a desired vertex position,
    /// given the world-space transform of the bone when animated,
    /// and the position of the vertex in mesh space.
    /// 
    /// It is sometimes called an inverse-bind matrix,
    /// or inverse bind pose matrix.
    /// ```
    public AiMatrix4x4 mOffsetMatrix() {
    	return mOffsetMatrix;
    }
    
    @Override
    public AiBone set(AiBone other) {
        return set(other.segment);
    }
    
    @Override
    public AiBone set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<AiBone> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<AiBone> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new AiBone(segment),
            count
        );
    }
    
    public static NativeStructArray<AiBone> array(Arena arena, AiBone... structs) {
        NativeStructArray<AiBone> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new AiBone(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<AiBone> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new AiBone(segment)
        );
    }

}