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
import volucris.bindings.core.NativePointerArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/// ```
/// @brief A mesh represents a geometry or model with a single material.
/// 
/// It usually consists of a number of vertices and a series of primitives/faces
/// referencing the vertices. In addition there might be a series of bones, each
/// of them addressing a number of vertices with a certain weight. Vertex data
/// is presented in channels with each channel containing a single per-vertex
/// information such as a set of texture coordinates or a normal vector.
/// If a data pointer is non-null, the corresponding data stream is present.
/// From C++-programs you can also use the comfort functions Has*() to
/// test for the presence of various data streams.
/// 
/// A Mesh uses only a single material which is referenced by a material ID.
/// @note The mPositions member is usually not optional. However, vertex positions
/// *could* be missing if the #AI_SCENE_FLAGS_INCOMPLETE flag is set in
/// @code
/// aiScene::mFlags
/// @endcode
/// ```
public final class AiMesh
		implements Struct<AiMesh> {

    public static final StructLayout LAYOUT;

    public static final VarHandle M_PRIMITIVE_TYPES_HANDLE;
    public static final VarHandle M_NUM_VERTICES_HANDLE;
    public static final VarHandle M_NUM_FACES_HANDLE;
    public static final VarHandle M_VERTICES_HANDLE;
    public static final VarHandle M_NORMALS_HANDLE;
    public static final VarHandle M_TANGENTS_HANDLE;
    public static final VarHandle M_BITANGENTS_HANDLE;
    public static final VarHandle M_COLORS_HANDLE;
    public static final VarHandle M_TEXTURE_COORDS_HANDLE;
    public static final VarHandle M_NUM_UVCOMPONENTS_HANDLE;
    public static final VarHandle M_FACES_HANDLE;
    public static final VarHandle M_NUM_BONES_HANDLE;
    public static final VarHandle M_BONES_HANDLE;
    public static final VarHandle M_MATERIAL_INDEX_HANDLE;
    public static final VarHandle M_NUM_ANIM_MESHES_HANDLE;
    public static final VarHandle M_ANIM_MESHES_HANDLE;
    public static final VarHandle M_METHOD_HANDLE;
    public static final VarHandle M_TEXTURE_COORDS_NAMES_HANDLE;

    public static final long M_PRIMITIVE_TYPES_BYTE_OFFSET;
    public static final long M_NUM_VERTICES_BYTE_OFFSET;
    public static final long M_NUM_FACES_BYTE_OFFSET;
    public static final long M_VERTICES_BYTE_OFFSET;
    public static final long M_NORMALS_BYTE_OFFSET;
    public static final long M_TANGENTS_BYTE_OFFSET;
    public static final long M_BITANGENTS_BYTE_OFFSET;
    public static final long M_COLORS_BYTE_OFFSET;
    public static final long M_TEXTURE_COORDS_BYTE_OFFSET;
    public static final long M_NUM_UVCOMPONENTS_BYTE_OFFSET;
    public static final long M_FACES_BYTE_OFFSET;
    public static final long M_NUM_BONES_BYTE_OFFSET;
    public static final long M_BONES_BYTE_OFFSET;
    public static final long M_MATERIAL_INDEX_BYTE_OFFSET;
    public static final long M_NAME_BYTE_OFFSET;
    public static final long M_NUM_ANIM_MESHES_BYTE_OFFSET;
    public static final long M_ANIM_MESHES_BYTE_OFFSET;
    public static final long M_METHOD_BYTE_OFFSET;
    public static final long M_AABB_BYTE_OFFSET;
    public static final long M_TEXTURE_COORDS_NAMES_BYTE_OFFSET;

    private final MemorySegment segment;

    private final AiString mName;
    private final AiAABB mAABB;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("mPrimitiveTypes"),
            JAVA_INT.withName("mNumVertices"),
            JAVA_INT.withName("mNumFaces"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("mVertices"),
            UNBOUNDED_ADDRESS.withName("mNormals"),
            UNBOUNDED_ADDRESS.withName("mTangents"),
            UNBOUNDED_ADDRESS.withName("mBitangents"),
            MemoryLayout.sequenceLayout(8, UNBOUNDED_ADDRESS).withName("mColors"),
            MemoryLayout.sequenceLayout(8, UNBOUNDED_ADDRESS).withName("mTextureCoords"),
            MemoryLayout.sequenceLayout(8, JAVA_INT).withName("mNumUVComponents"),
            UNBOUNDED_ADDRESS.withName("mFaces"),
            JAVA_INT.withName("mNumBones"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("mBones"),
            JAVA_INT.withName("mMaterialIndex"),
            AiString.LAYOUT.withName("mName"),
            JAVA_INT.withName("mNumAnimMeshes"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("mAnimMeshes"),
            JAVA_INT.withName("mMethod"),
            AiAABB.LAYOUT.withName("mAABB"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("mTextureCoordsNames")
        ).withName("aiMesh").withByteAlignment(8);
        
        M_PRIMITIVE_TYPES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mPrimitiveTypes"));
        M_NUM_VERTICES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mNumVertices"));
        M_NUM_FACES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mNumFaces"));
        M_VERTICES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mVertices"));
        M_NORMALS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mNormals"));
        M_TANGENTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mTangents"));
        M_BITANGENTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mBitangents"));
        M_COLORS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mColors"), PathElement.sequenceElement());
        M_TEXTURE_COORDS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mTextureCoords"), PathElement.sequenceElement());
        M_NUM_UVCOMPONENTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mNumUVComponents"), PathElement.sequenceElement());
        M_FACES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mFaces"));
        M_NUM_BONES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mNumBones"));
        M_BONES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mBones"));
        M_MATERIAL_INDEX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mMaterialIndex"));
        M_NUM_ANIM_MESHES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mNumAnimMeshes"));
        M_ANIM_MESHES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mAnimMeshes"));
        M_METHOD_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mMethod"));
        M_TEXTURE_COORDS_NAMES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mTextureCoordsNames"));
        
        M_PRIMITIVE_TYPES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mPrimitiveTypes"));
        M_NUM_VERTICES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mNumVertices"));
        M_NUM_FACES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mNumFaces"));
        M_VERTICES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mVertices"));
        M_NORMALS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mNormals"));
        M_TANGENTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mTangents"));
        M_BITANGENTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mBitangents"));
        M_COLORS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mColors"));
        M_TEXTURE_COORDS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mTextureCoords"));
        M_NUM_UVCOMPONENTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mNumUVComponents"));
        M_FACES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mFaces"));
        M_NUM_BONES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mNumBones"));
        M_BONES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mBones"));
        M_MATERIAL_INDEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mMaterialIndex"));
        M_NAME_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mName"));
        M_NUM_ANIM_MESHES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mNumAnimMeshes"));
        M_ANIM_MESHES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mAnimMeshes"));
        M_METHOD_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mMethod"));
        M_AABB_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mAABB"));
        M_TEXTURE_COORDS_NAMES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mTextureCoordsNames"));
        //@formatter:on
    }

    public AiMesh() {
        this(Arena.ofAuto());
    }
    
    public AiMesh(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public AiMesh(MemorySegment segment) {
        this.segment = segment;
    
        mName = new AiString(segment.asSlice(M_NAME_BYTE_OFFSET, AiString.LAYOUT));
        mAABB = new AiAABB(segment.asSlice(M_AABB_BYTE_OFFSET, AiAABB.LAYOUT));
    }

    /// @see #mPrimitiveTypes()
    public AiMesh mPrimitiveTypes(int mPrimitiveTypes) {
    	M_PRIMITIVE_TYPES_HANDLE.set(segment, 0L, mPrimitiveTypes);
    	return this;
    }
    
    /// ```
    /// 
    /// Bitwise combination of the members of the #aiPrimitiveType enum.
    /// This specifies which types of primitives are present in the mesh.
    /// The "SortByPrimitiveType"-Step can be used to make sure the
    /// output meshes consist of one primitive type each.
    /// ```
    public int mPrimitiveTypes() {
    	return (int) M_PRIMITIVE_TYPES_HANDLE.get(segment, 0L);
    }
    
    /// @see #mNumVertices()
    public AiMesh mNumVertices(int mNumVertices) {
    	M_NUM_VERTICES_HANDLE.set(segment, 0L, mNumVertices);
    	return this;
    }
    
    /// ```
    /// 
    /// The number of vertices in this mesh.
    /// This is also the size of all of the per-vertex data arrays.
    /// The maximum value for this member is #AI_MAX_VERTICES.
    /// ```
    public int mNumVertices() {
    	return (int) M_NUM_VERTICES_HANDLE.get(segment, 0L);
    }
    
    /// @see #mNumFaces()
    public AiMesh mNumFaces(int mNumFaces) {
    	M_NUM_FACES_HANDLE.set(segment, 0L, mNumFaces);
    	return this;
    }
    
    /// ```
    /// 
    /// The number of primitives (triangles, polygons, lines) in this  mesh.
    /// This is also the size of the mFaces array.
    /// The maximum value for this member is #AI_MAX_FACES.
    /// ```
    public int mNumFaces() {
    	return (int) M_NUM_FACES_HANDLE.get(segment, 0L);
    }
    
    /// @see #mVertices()
    public AiMesh mVertices(NativeStructArray<AiVector3D> mVertices) {
    	M_VERTICES_HANDLE.set(segment, 0L, mVertices.memorySegment());
    	return this;
    }
    
    /// ```
    /// 
    /// @brief Vertex positions.
    /// 
    /// This array is always present in a mesh. The array is
    /// mNumVertices in size.
    /// ```
    public @Nullable NativeStructArray<AiVector3D> mVertices() {
    	MemorySegment segment = (MemorySegment) M_VERTICES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return AiVector3D.array(segment);
    }
    
    /// @see #mNormals()
    public AiMesh mNormals(NativeStructArray<AiVector3D> mNormals) {
    	M_NORMALS_HANDLE.set(segment, 0L, mNormals.memorySegment());
    	return this;
    }
    
    /// ```
    /// 
    /// @brief Vertex normals.
    /// 
    /// The array contains normalized vectors, nullptr if not present.
    /// The array is mNumVertices in size. Normals are undefined for
    /// point and line primitives. A mesh consisting of points and
    /// lines only may not have normal vectors. Meshes with mixed
    /// primitive types (i.e. lines and triangles) may have normals,
    /// but the normals for vertices that are only referenced by
    /// point or line primitives are undefined and set to QNaN (WARN:
    /// qNaN compares to inequal to *everything*, even to qNaN itself.
    /// Using code like this to check whether a field is qnan is:
    /// @code
    /// #define IS_QNAN(f) (f != f)
    /// @endcode
    /// still dangerous because even 1.f == 1.f could evaluate to false! (
    /// remember the subtleties of IEEE754 artithmetics). Use stuff like
    /// @c fpclassify instead.
    /// @note Normal vectors computed by Assimp are always unit-length.
    /// However, this needn't apply for normals that have been taken
    /// directly from the model file.
    /// ```
    public @Nullable NativeStructArray<AiVector3D> mNormals() {
    	MemorySegment segment = (MemorySegment) M_NORMALS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return AiVector3D.array(segment);
    }
    
    /// @see #mTangents()
    public AiMesh mTangents(NativeStructArray<AiVector3D> mTangents) {
    	M_TANGENTS_HANDLE.set(segment, 0L, mTangents.memorySegment());
    	return this;
    }
    
    /// ```
    /// 
    /// @brief Vertex tangents.
    /// 
    /// The tangent of a vertex points in the direction of the positive
    /// X texture axis. The array contains normalized vectors, nullptr if
    /// not present. The array is mNumVertices in size. A mesh consisting
    /// of points and lines only may not have normal vectors. Meshes with
    /// mixed primitive types (i.e. lines and triangles) may have
    /// normals, but the normals for vertices that are only referenced by
    /// point or line primitives are undefined and set to qNaN.  See
    /// the #mNormals member for a detailed discussion of qNaNs.
    /// @note If the mesh contains tangents, it automatically also
    /// contains bitangents.
    /// ```
    public @Nullable NativeStructArray<AiVector3D> mTangents() {
    	MemorySegment segment = (MemorySegment) M_TANGENTS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return AiVector3D.array(segment);
    }
    
    /// @see #mBitangents()
    public AiMesh mBitangents(NativeStructArray<AiVector3D> mBitangents) {
    	M_BITANGENTS_HANDLE.set(segment, 0L, mBitangents.memorySegment());
    	return this;
    }
    
    /// ```
    /// 
    /// @brief Vertex bitangents.
    /// 
    /// The bitangent of a vertex points in the direction of the positive
    /// Y texture axis. The array contains normalized vectors, nullptr if not
    /// present. The array is mNumVertices in size.
    /// @note If the mesh contains tangents, it automatically also contains
    /// bitangents.
    /// ```
    public @Nullable NativeStructArray<AiVector3D> mBitangents() {
    	MemorySegment segment = (MemorySegment) M_BITANGENTS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return AiVector3D.array(segment);
    }
    
    /// @see #mColors(int)
    public AiMesh mColors(NativeStructArray<AiColor4D> mColors, int index0) {
    	M_COLORS_HANDLE.set(segment, 0L, index0, mColors.memorySegment());
    	return this;
    }
    
    /// ```
    /// 
    /// @brief Vertex color sets.
    /// 
    /// A mesh may contain 0 to #AI_MAX_NUMBER_OF_COLOR_SETS vertex
    /// colors per vertex. nullptr if not present. Each array is
    /// mNumVertices in size if present.
    /// ```
    public @Nullable NativeStructArray<AiColor4D> mColors(int index0) {
    	MemorySegment segment = (MemorySegment) M_COLORS_HANDLE.get(this.segment, 0L, index0);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return AiColor4D.array(segment);
    }
    
    /// @see #mTextureCoords(int)
    public AiMesh mTextureCoords(NativeStructArray<AiVector3D> mTextureCoords, int index0) {
    	M_TEXTURE_COORDS_HANDLE.set(segment, 0L, index0, mTextureCoords.memorySegment());
    	return this;
    }
    
    /// ```
    /// 
    /// @brief Vertex texture coordinates, also known as UV channels.
    /// 
    /// A mesh may contain 0 to AI_MAX_NUMBER_OF_TEXTURECOORDS channels per
    /// vertex. Used and unused (nullptr) channels may go in any order.
    /// The array is mNumVertices in size.
    /// ```
    public @Nullable NativeStructArray<AiVector3D> mTextureCoords(int index0) {
    	MemorySegment segment = (MemorySegment) M_TEXTURE_COORDS_HANDLE.get(this.segment, 0L, index0);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return AiVector3D.array(segment);
    }
    
    /// @see #mNumUVComponents(int)
    public AiMesh mNumUVComponents(int mNumUVComponents, int index0) {
    	M_NUM_UVCOMPONENTS_HANDLE.set(segment, 0L, index0, mNumUVComponents);
    	return this;
    }
    
    /// ```
    /// 
    /// @brief Specifies the number of components for a given UV channel.
    /// 
    /// Up to three channels are supported (UVW, for accessing volume
    /// or cube maps). If the value is 2 for a given channel n, the
    /// component p.z of mTextureCoords[n][p] is set to 0.0f.
    /// If the value is 1 for a given channel, p.y is set to 0.0f, too.
    /// @note 4D coordinates are not supported
    /// ```
    public int mNumUVComponents(int index0) {
    	return (int) M_NUM_UVCOMPONENTS_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #mFaces()
    public AiMesh mFaces(NativeStructArray<AiFace> mFaces) {
    	M_FACES_HANDLE.set(segment, 0L, mFaces.memorySegment());
    	return this;
    }
    
    /// ```
    /// 
    /// @brief The faces the mesh is constructed from.
    /// 
    /// Each face refers to a number of vertices by their indices.
    /// This array is always present in a mesh, its size is given
    /// in mNumFaces. If the #AI_SCENE_FLAGS_NON_VERBOSE_FORMAT
    /// is NOT set each face references an unique set of vertices.
    /// ```
    public @Nullable NativeStructArray<AiFace> mFaces() {
    	MemorySegment segment = (MemorySegment) M_FACES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    
    	return AiFace.array(segment);
    }
    
    /// @see #mNumBones()
    public AiMesh mNumBones(int mNumBones) {
    	M_NUM_BONES_HANDLE.set(segment, 0L, mNumBones);
    	return this;
    }
    
    /// ```
    /// 
    /// The number of bones this mesh contains. Can be 0, in which case the mBones array is nullptr.
    /// ```
    public int mNumBones() {
    	return (int) M_NUM_BONES_HANDLE.get(segment, 0L);
    }
    
    /// @see #mBones()
    public AiMesh mBones(NativePointerArray mBones) {
    	M_BONES_HANDLE.set(segment, 0L, mBones.memorySegment());
    	return this;
    }
    
    /// ```
    /// 
    /// @brief The bones of this mesh.
    /// 
    /// A bone consists of a name by which it can be found in the
    /// frame hierarchy and a set of vertex weights.
    /// ```
    public @Nullable NativePointerArray mBones() {
    	MemorySegment segment = (MemorySegment) M_BONES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativePointerArray(segment);
    }
    
    /// @see #mMaterialIndex()
    public AiMesh mMaterialIndex(int mMaterialIndex) {
    	M_MATERIAL_INDEX_HANDLE.set(segment, 0L, mMaterialIndex);
    	return this;
    }
    
    /// ```
    /// 
    /// @brief The material used by this mesh.
    /// 
    /// A mesh uses only a single material. If an imported model uses
    /// multiple materials, the import splits up the mesh. Use this value
    /// as index into the scene's material list.
    /// ```
    public int mMaterialIndex() {
    	return (int) M_MATERIAL_INDEX_HANDLE.get(segment, 0L);
    }
    
    /// @see #mNumAnimMeshes()
    public AiMesh mNumAnimMeshes(int mNumAnimMeshes) {
    	M_NUM_ANIM_MESHES_HANDLE.set(segment, 0L, mNumAnimMeshes);
    	return this;
    }
    
    /// ```
    /// 
    /// The number of attachment meshes.
    /// Currently known to work with loaders:
    /// - Collada
    /// - gltf
    /// ```
    public int mNumAnimMeshes() {
    	return (int) M_NUM_ANIM_MESHES_HANDLE.get(segment, 0L);
    }
    
    /// @see #mAnimMeshes()
    public AiMesh mAnimMeshes(NativePointerArray mAnimMeshes) {
    	M_ANIM_MESHES_HANDLE.set(segment, 0L, mAnimMeshes.memorySegment());
    	return this;
    }
    
    /// ```
    /// 
    /// Attachment meshes for this mesh, for vertex-based animation.
    /// Attachment meshes carry replacement data for some of the
    /// mesh'es vertex components (usually positions, normals).
    /// Currently known to work with loaders:
    /// - Collada
    /// - gltf
    /// ```
    public @Nullable NativePointerArray mAnimMeshes() {
    	MemorySegment segment = (MemorySegment) M_ANIM_MESHES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativePointerArray(segment);
    }
    
    /// @see #mMethod()
    public AiMesh mMethod(int mMethod) {
    	M_METHOD_HANDLE.set(segment, 0L, mMethod);
    	return this;
    }
    
    /// ```
    /// 
    /// Method of morphing when anim-meshes are specified.
    /// @see aiMorphingMethod to learn more about the provided morphing targets.
    /// ```
    public int mMethod() {
    	return (int) M_METHOD_HANDLE.get(segment, 0L);
    }
    
    /// @see #mTextureCoordsNames()
    public AiMesh mTextureCoordsNames(NativePointerArray mTextureCoordsNames) {
    	M_TEXTURE_COORDS_NAMES_HANDLE.set(segment, 0L, mTextureCoordsNames.memorySegment());
    	return this;
    }
    
    /// ```
    /// 
    /// Vertex UV stream names. Pointer to array of size AI_MAX_NUMBER_OF_TEXTURECOORDS
    /// ```
    public @Nullable NativePointerArray mTextureCoordsNames() {
    	MemorySegment segment = (MemorySegment) M_TEXTURE_COORDS_NAMES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativePointerArray(segment);
    }
    
    /// @see #mName()
    public AiMesh mName(Consumer<AiString> consumer) {
    	consumer.accept(mName);
    	return this;
    }
    
    /// @see #mName()
    public AiMesh mName(AiString other) {
    	mName.set(other);
    	return this;
    }
    
    /// ```
    /// 
    /// Name of the mesh. Meshes can be named, but this is not a
    /// requirement and leaving this field empty is totally fine.
    /// There are mainly three uses for mesh names:
    /// - some formats name nodes and meshes independently.
    /// - importers tend to split meshes up to meet the
    /// one-material-per-mesh requirement. Assigning
    /// the same (dummy) name to each of the result meshes
    /// aids the caller at recovering the original mesh
    /// partitioning.
    /// - Vertex animations refer to meshes by their names.
    /// ```
    public AiString mName() {
    	return mName;
    }
    
    /// @see #mAABB()
    public AiMesh mAABB(Consumer<AiAABB> consumer) {
    	consumer.accept(mAABB);
    	return this;
    }
    
    /// @see #mAABB()
    public AiMesh mAABB(AiAABB other) {
    	mAABB.set(other);
    	return this;
    }
    
    /// ```
    /// 
    /// The bounding box.
    /// ```
    public AiAABB mAABB() {
    	return mAABB;
    }
    
    @Override
    public AiMesh set(AiMesh other) {
        return set(other.segment);
    }
    
    @Override
    public AiMesh set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<AiMesh> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<AiMesh> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new AiMesh(segment),
            count
        );
    }
    
    public static NativeStructArray<AiMesh> array(Arena arena, AiMesh... structs) {
        NativeStructArray<AiMesh> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new AiMesh(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<AiMesh> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new AiMesh(segment)
        );
    }
    
}