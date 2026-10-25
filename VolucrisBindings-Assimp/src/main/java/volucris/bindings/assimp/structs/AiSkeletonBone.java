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
/// 
/// @brief  A skeleton bone represents a single bone is a skeleton structure.
/// 
/// Skeleton-Animations can be represented via a skeleton struct, which describes
/// a hierarchical tree assembled from skeleton bones. A bone is linked to a mesh.
/// The bone knows its parent bone. If there is no parent bone the parent id is
/// marked with -1.
/// The skeleton-bone stores a pointer to its used armature. If there is no
/// armature this value if set to nullptr.
/// A skeleton bone stores its offset-matrix, which is the absolute transformation
/// for the bone. The bone stores the locale transformation to its parent as well.
/// You can compute the offset matrix by multiplying the hierarchy like:
/// Tree: s1 -> s2 -> s3
/// Offset-Matrix s3 = locale-s3 * locale-s2 * locale-s1
/// ```
public final class AiSkeletonBone
		implements Struct<AiSkeletonBone> {

	public static final StructLayout LAYOUT;

	public static final VarHandle M_PARENT_HANDLE;
	public static final VarHandle M_ARMATURE_HANDLE;
	public static final VarHandle M_NODE_HANDLE;
	public static final VarHandle M_NUMN_WEIGHTS_HANDLE;
	public static final VarHandle M_MESH_ID_HANDLE;
	public static final VarHandle M_WEIGHTS_HANDLE;

	public static final long M_PARENT_BYTE_OFFSET;
	public static final long M_ARMATURE_BYTE_OFFSET;
	public static final long M_NODE_BYTE_OFFSET;
	public static final long M_NUMN_WEIGHTS_BYTE_OFFSET;
	public static final long M_MESH_ID_BYTE_OFFSET;
	public static final long M_WEIGHTS_BYTE_OFFSET;
	public static final long M_OFFSET_MATRIX_BYTE_OFFSET;
	public static final long M_LOCAL_MATRIX_BYTE_OFFSET;

	private final MemorySegment segment;

	private final AiMatrix4x4 mOffsetMatrix;
	private final AiMatrix4x4 mLocalMatrix;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("mParent"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("mArmature"),
		    UNBOUNDED_ADDRESS.withName("mNode"),
		    JAVA_INT.withName("mNumnWeights"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("mMeshId"),
		    UNBOUNDED_ADDRESS.withName("mWeights"),
		    AiMatrix4x4.LAYOUT.withName("mOffsetMatrix"),
		    AiMatrix4x4.LAYOUT.withName("mLocalMatrix")
		).withName("aiSkeletonBone").withByteAlignment(8);
		
		M_PARENT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mParent"));
		M_ARMATURE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mArmature"));
		M_NODE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mNode"));
		M_NUMN_WEIGHTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mNumnWeights"));
		M_MESH_ID_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mMeshId"));
		M_WEIGHTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mWeights"));
		
		M_PARENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mParent"));
		M_ARMATURE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mArmature"));
		M_NODE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mNode"));
		M_NUMN_WEIGHTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mNumnWeights"));
		M_MESH_ID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mMeshId"));
		M_WEIGHTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mWeights"));
		M_OFFSET_MATRIX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mOffsetMatrix"));
		M_LOCAL_MATRIX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mLocalMatrix"));
		//@formatter:on
	}

	public AiSkeletonBone() {
	    this(Arena.ofAuto());
	}
	
	public AiSkeletonBone(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public AiSkeletonBone(MemorySegment segment) {
	    this.segment = segment;
	
	    mOffsetMatrix = new AiMatrix4x4(segment.asSlice(M_OFFSET_MATRIX_BYTE_OFFSET, AiMatrix4x4.LAYOUT));
	    mLocalMatrix = new AiMatrix4x4(segment.asSlice(M_LOCAL_MATRIX_BYTE_OFFSET, AiMatrix4x4.LAYOUT));
	}

    /// @see #mParent()
    public AiSkeletonBone mParent(int mParent) {
    	M_PARENT_HANDLE.set(segment, 0L, mParent);
    	return this;
    }
    
    /// ```
    /// The parent bone index, is -1 one if this bone represents the root bone.
    /// ```
    public int mParent() {
    	return (int) M_PARENT_HANDLE.get(segment, 0L);
    }
    
    /// @see #mArmature()
    public AiSkeletonBone mArmature(AiNode mArmature) {
    	M_ARMATURE_HANDLE.set(segment, 0L, mArmature.memorySegment());
    	return this;
    }
    
    /// ```
    /// @brief The bone armature node - used for skeleton conversion
    /// you must enable aiProcess_PopulateArmatureData to populate this
    /// ```
    public @Nullable AiNode mArmature() {
    	MemorySegment segment = (MemorySegment) M_ARMATURE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new AiNode(segment);
    }
    
    /// @see #mNode()
    public AiSkeletonBone mNode(AiNode mNode) {
    	M_NODE_HANDLE.set(segment, 0L, mNode.memorySegment());
    	return this;
    }
    
    /// ```
    /// @brief The bone node in the scene - used for skeleton conversion
    /// you must enable aiProcess_PopulateArmatureData to populate this
    /// ```
    public @Nullable AiNode mNode() {
    	MemorySegment segment = (MemorySegment) M_NODE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new AiNode(segment);
    }
    
    /// @see #mNumnWeights()
    public AiSkeletonBone mNumnWeights(int mNumnWeights) {
    	M_NUMN_WEIGHTS_HANDLE.set(segment, 0L, mNumnWeights);
    	return this;
    }
    
    /// ```
    /// @brief The number of weights
    /// ```
    public int mNumnWeights() {
    	return (int) M_NUMN_WEIGHTS_HANDLE.get(segment, 0L);
    }
    
    /// @see #mMeshId()
    public AiSkeletonBone mMeshId(AiMesh mMeshId) {
    	M_MESH_ID_HANDLE.set(segment, 0L, mMeshId.memorySegment());
    	return this;
    }
    
    /// ```
    /// The mesh index, which will get influenced by the weight.
    /// ```
    public @Nullable AiMesh mMeshId() {
    	MemorySegment segment = (MemorySegment) M_MESH_ID_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new AiMesh(segment);
    }
    
    /// @see #mWeights()
    public AiSkeletonBone mWeights(AiVertexWeight mWeights) {
    	M_WEIGHTS_HANDLE.set(segment, 0L, mWeights.memorySegment());
    	return this;
    }
    
    /// ```
    /// The influence weights of this bone, by vertex index.
    /// ```
    public @Nullable AiVertexWeight mWeights() {
    	MemorySegment segment = (MemorySegment) M_WEIGHTS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new AiVertexWeight(segment);
    }
    
    /// @see #mOffsetMatrix()
    public AiSkeletonBone mOffsetMatrix(Consumer<AiMatrix4x4> consumer) {
    	consumer.accept(mOffsetMatrix);
    	return this;
    }
    
    /// @see #mOffsetMatrix()
    public AiSkeletonBone mOffsetMatrix(AiMatrix4x4 other) {
    	mOffsetMatrix.set(other);
    	return this;
    }
    
    /// ```
    /// Matrix that transforms from bone space to mesh space in bind pose.
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
    
    /// @see #mLocalMatrix()
    public AiSkeletonBone mLocalMatrix(Consumer<AiMatrix4x4> consumer) {
    	consumer.accept(mLocalMatrix);
    	return this;
    }
    
    /// @see #mLocalMatrix()
    public AiSkeletonBone mLocalMatrix(AiMatrix4x4 other) {
    	mLocalMatrix.set(other);
    	return this;
    }
    
    /// ```
    /// Matrix that transforms the locale bone in bind pose.
    /// ```
    public AiMatrix4x4 mLocalMatrix() {
    	return mLocalMatrix;
    }
    
    @Override
    public AiSkeletonBone set(AiSkeletonBone other) {
        return set(other.segment);
    }
    
    @Override
    public AiSkeletonBone set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<AiSkeletonBone> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<AiSkeletonBone> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new AiSkeletonBone(segment),
            count
        );
    }
    
    public static NativeStructArray<AiSkeletonBone> array(Arena arena, AiSkeletonBone... structs) {
        NativeStructArray<AiSkeletonBone> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new AiSkeletonBone(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<AiSkeletonBone> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new AiSkeletonBone(segment)
        );
    }

}