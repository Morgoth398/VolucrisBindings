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
/// @brief An AnimMesh is an attachment to an #aiMesh stores per-vertex
/// animations for a particular frame.
/// 
/// You may think of an #aiAnimMesh as a `patch` for the host mesh, which
/// replaces only certain vertex data streams at a particular time.
/// Each mesh stores n attached attached meshes (#aiMesh::mAnimMeshes).
/// The actual relationship between the time line and anim meshes is
/// established by #aiMeshAnim, which references singular mesh attachments
/// by their ID and binds them to a time offset.
/// ```
public final class AiAnimMesh
		implements Struct<AiAnimMesh> {

    public static final StructLayout LAYOUT;

    public static final VarHandle M_VERTICES_HANDLE;
    public static final VarHandle M_NORMALS_HANDLE;
    public static final VarHandle M_TANGENTS_HANDLE;
    public static final VarHandle M_BITANGENTS_HANDLE;
    public static final VarHandle M_COLORS_HANDLE;
    public static final VarHandle M_TEXTURE_COORDS_HANDLE;
    public static final VarHandle M_NUM_VERTICES_HANDLE;
    public static final VarHandle M_WEIGHT_HANDLE;

    public static final long M_NAME_BYTE_OFFSET;
    public static final long M_VERTICES_BYTE_OFFSET;
    public static final long M_NORMALS_BYTE_OFFSET;
    public static final long M_TANGENTS_BYTE_OFFSET;
    public static final long M_BITANGENTS_BYTE_OFFSET;
    public static final long M_COLORS_BYTE_OFFSET;
    public static final long M_TEXTURE_COORDS_BYTE_OFFSET;
    public static final long M_NUM_VERTICES_BYTE_OFFSET;
    public static final long M_WEIGHT_BYTE_OFFSET;

    private final MemorySegment segment;

    private final AiString mName;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            AiString.LAYOUT.withName("mName"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("mVertices"),
            UNBOUNDED_ADDRESS.withName("mNormals"),
            UNBOUNDED_ADDRESS.withName("mTangents"),
            UNBOUNDED_ADDRESS.withName("mBitangents"),
            MemoryLayout.sequenceLayout(8, UNBOUNDED_ADDRESS).withName("mColors"),
            MemoryLayout.sequenceLayout(8, UNBOUNDED_ADDRESS).withName("mTextureCoords"),
            JAVA_INT.withName("mNumVertices"),
            JAVA_FLOAT.withName("mWeight")
        ).withName("aiAnimMesh").withByteAlignment(8);
        
        M_VERTICES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mVertices"));
        M_NORMALS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mNormals"));
        M_TANGENTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mTangents"));
        M_BITANGENTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mBitangents"));
        M_COLORS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mColors"), PathElement.sequenceElement());
        M_TEXTURE_COORDS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mTextureCoords"), PathElement.sequenceElement());
        M_NUM_VERTICES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mNumVertices"));
        M_WEIGHT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mWeight"));
        
        M_NAME_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mName"));
        M_VERTICES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mVertices"));
        M_NORMALS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mNormals"));
        M_TANGENTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mTangents"));
        M_BITANGENTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mBitangents"));
        M_COLORS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mColors"));
        M_TEXTURE_COORDS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mTextureCoords"));
        M_NUM_VERTICES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mNumVertices"));
        M_WEIGHT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mWeight"));
        //@formatter:on
    }

    public AiAnimMesh() {
        this(Arena.ofAuto());
    }
    
    public AiAnimMesh(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public AiAnimMesh(MemorySegment segment) {
        this.segment = segment;
    
        mName = new AiString(segment.asSlice(M_NAME_BYTE_OFFSET, AiString.LAYOUT));
    }

    /// @see #mVertices()
    public AiAnimMesh mVertices(NativeStructArray<AiVector3D> mVertices) {
    	M_VERTICES_HANDLE.set(segment, 0L, mVertices.memorySegment());
    	return this;
    }
    
    /// ```
    /// Replacement for aiMesh::mVertices. If this array is non-nullptr,
    /// it *must* contain mNumVertices entries. The corresponding
    /// array in the host mesh must be non-nullptr as well - animation
    /// meshes may neither add or nor remove vertex components (if
    /// a replacement array is nullptr and the corresponding source
    /// array is not, the source data is taken instead)
    /// ```
    public @Nullable NativeStructArray<AiVector3D> mVertices() {
    	MemorySegment segment = (MemorySegment) M_VERTICES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return AiVector3D.array(segment);
    }
    
    /// @see #mNormals()
    public AiAnimMesh mNormals(NativeStructArray<AiVector3D> mNormals) {
    	M_NORMALS_HANDLE.set(segment, 0L, mNormals.memorySegment());
    	return this;
    }
    
    /// ```
    /// Replacement for aiMesh::mNormals.
    /// ```
    public @Nullable NativeStructArray<AiVector3D> mNormals() {
    	MemorySegment segment = (MemorySegment) M_NORMALS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return AiVector3D.array(segment);
    }
    
    /// @see #mTangents()
    public AiAnimMesh mTangents(NativeStructArray<AiVector3D> mTangents) {
    	M_TANGENTS_HANDLE.set(segment, 0L, mTangents.memorySegment());
    	return this;
    }
    
    /// ```
    /// Replacement for aiMesh::mTangents.
    /// ```
    public @Nullable NativeStructArray<AiVector3D> mTangents() {
    	MemorySegment segment = (MemorySegment) M_TANGENTS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return AiVector3D.array(segment);
    }
    
    /// @see #mBitangents()
    public AiAnimMesh mBitangents(NativeStructArray<AiVector3D> mBitangents) {
    	M_BITANGENTS_HANDLE.set(segment, 0L, mBitangents.memorySegment());
    	return this;
    }
    
    /// ```
    /// Replacement for aiMesh::mBitangents.
    /// ```
    public @Nullable NativeStructArray<AiVector3D> mBitangents() {
    	MemorySegment segment = (MemorySegment) M_BITANGENTS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return AiVector3D.array(segment);
    }
    
    /// @see #mColors(int)
    public AiAnimMesh mColors(NativeStructArray<AiColor4D> mColors, int index0) {
    	M_COLORS_HANDLE.set(segment, 0L, index0, mColors.memorySegment());
    	return this;
    }
    
    /// ```
    /// Replacement for aiMesh::mColors
    /// ```
    public @Nullable NativeStructArray<AiColor4D> mColors(int index0) {
    	MemorySegment segment = (MemorySegment) M_COLORS_HANDLE.get(this.segment, 0L, index0);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return AiColor4D.array(segment);
    }
    
    /// @see #mTextureCoords(int)
    public AiAnimMesh mTextureCoords(NativeStructArray<AiVector3D> mTextureCoords, int index0) {
    	M_TEXTURE_COORDS_HANDLE.set(segment, 0L, index0, mTextureCoords.memorySegment());
    	return this;
    }
    
    /// ```
    /// Replacement for aiMesh::mTextureCoords
    /// ```
    public @Nullable NativeStructArray<AiVector3D> mTextureCoords(int index0) {
    	MemorySegment segment = (MemorySegment) M_TEXTURE_COORDS_HANDLE.get(this.segment, 0L, index0);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return AiVector3D.array(segment);
    }
    
    /// @see #mNumVertices()
    public AiAnimMesh mNumVertices(int mNumVertices) {
    	M_NUM_VERTICES_HANDLE.set(segment, 0L, mNumVertices);
    	return this;
    }
    
    /// ```
    /// The number of vertices in the aiAnimMesh, and thus the length of all
    /// the member arrays.
    /// 
    /// This has always the same value as the mNumVertices property in the
    /// corresponding aiMesh. It is duplicated here merely to make the length
    /// of the member arrays accessible even if the aiMesh is not known, e.g.
    /// from language bindings.
    /// ```
    public int mNumVertices() {
    	return (int) M_NUM_VERTICES_HANDLE.get(segment, 0L);
    }
    
    /// @see #mWeight()
    public AiAnimMesh mWeight(float mWeight) {
    	M_WEIGHT_HANDLE.set(segment, 0L, mWeight);
    	return this;
    }
    
    /// ```
    /// 
    /// Weight of the AnimMesh.
    /// ```
    public float mWeight() {
    	return (float) M_WEIGHT_HANDLE.get(segment, 0L);
    }
    
    /// @see #mName()
    public AiAnimMesh mName(Consumer<AiString> consumer) {
    	consumer.accept(mName);
    	return this;
    }
    
    /// @see #mName()
    public AiAnimMesh mName(AiString other) {
    	mName.set(other);
    	return this;
    }
    
    /// ```
    /// Anim Mesh name
    /// ```
    public AiString mName() {
    	return mName;
    }
    
    @Override
    public AiAnimMesh set(AiAnimMesh other) {
        return set(other.segment);
    }
    
    @Override
    public AiAnimMesh set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<AiAnimMesh> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<AiAnimMesh> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new AiAnimMesh(segment),
            count
        );
    }
    
    public static NativeStructArray<AiAnimMesh> array(Arena arena, AiAnimMesh... structs) {
        NativeStructArray<AiAnimMesh> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new AiAnimMesh(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<AiAnimMesh> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new AiAnimMesh(segment)
        );
    }
    
}