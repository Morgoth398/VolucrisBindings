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
import volucris.bindings.core.NativeByteArray;
import volucris.bindings.core.NativePointerArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

/// ```
/// The root structure of the imported data.
/// 
/// Everything that was imported from the given file can be accessed from here.
/// Objects of this class are generally maintained and owned by Assimp, not
/// by the caller. You shouldn't want to instance it, nor should you ever try to
/// delete a given scene on your own.
/// ```
public final class AiScene
		implements Struct<AiScene> {

    public static final StructLayout LAYOUT;

    public static final VarHandle M_FLAGS_HANDLE;
    public static final VarHandle M_ROOT_NODE_HANDLE;
    public static final VarHandle M_NUM_MESHES_HANDLE;
    public static final VarHandle M_MESHES_HANDLE;
    public static final VarHandle M_NUM_MATERIALS_HANDLE;
    public static final VarHandle M_MATERIALS_HANDLE;
    public static final VarHandle M_NUM_ANIMATIONS_HANDLE;
    public static final VarHandle M_ANIMATIONS_HANDLE;
    public static final VarHandle M_NUM_TEXTURES_HANDLE;
    public static final VarHandle M_TEXTURES_HANDLE;
    public static final VarHandle M_NUM_LIGHTS_HANDLE;
    public static final VarHandle M_LIGHTS_HANDLE;
    public static final VarHandle M_NUM_CAMERAS_HANDLE;
    public static final VarHandle M_CAMERAS_HANDLE;
    public static final VarHandle M_META_DATA_HANDLE;
    public static final VarHandle M_NUM_SKELETONS_HANDLE;
    public static final VarHandle M_SKELETONS_HANDLE;
    public static final VarHandle M_PRIVATE_HANDLE;

    public static final long M_FLAGS_BYTE_OFFSET;
    public static final long M_ROOT_NODE_BYTE_OFFSET;
    public static final long M_NUM_MESHES_BYTE_OFFSET;
    public static final long M_MESHES_BYTE_OFFSET;
    public static final long M_NUM_MATERIALS_BYTE_OFFSET;
    public static final long M_MATERIALS_BYTE_OFFSET;
    public static final long M_NUM_ANIMATIONS_BYTE_OFFSET;
    public static final long M_ANIMATIONS_BYTE_OFFSET;
    public static final long M_NUM_TEXTURES_BYTE_OFFSET;
    public static final long M_TEXTURES_BYTE_OFFSET;
    public static final long M_NUM_LIGHTS_BYTE_OFFSET;
    public static final long M_LIGHTS_BYTE_OFFSET;
    public static final long M_NUM_CAMERAS_BYTE_OFFSET;
    public static final long M_CAMERAS_BYTE_OFFSET;
    public static final long M_META_DATA_BYTE_OFFSET;
    public static final long M_NAME_BYTE_OFFSET;
    public static final long M_NUM_SKELETONS_BYTE_OFFSET;
    public static final long M_SKELETONS_BYTE_OFFSET;
    public static final long M_PRIVATE_BYTE_OFFSET;

    private final MemorySegment segment;

    private final AiString mName;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("mFlags"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("mRootNode"),
            JAVA_INT.withName("mNumMeshes"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("mMeshes"),
            JAVA_INT.withName("mNumMaterials"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("mMaterials"),
            JAVA_INT.withName("mNumAnimations"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("mAnimations"),
            JAVA_INT.withName("mNumTextures"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("mTextures"),
            JAVA_INT.withName("mNumLights"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("mLights"),
            JAVA_INT.withName("mNumCameras"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("mCameras"),
            UNBOUNDED_ADDRESS.withName("mMetaData"),
            AiString.LAYOUT.withName("mName"),
            JAVA_INT.withName("mNumSkeletons"),
            UNBOUNDED_ADDRESS.withName("mSkeletons"),
            UNBOUNDED_ADDRESS.withName("mPrivate")
        ).withName("aiScene").withByteAlignment(8);
        
        M_FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mFlags"));
        M_ROOT_NODE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mRootNode"));
        M_NUM_MESHES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mNumMeshes"));
        M_MESHES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mMeshes"));
        M_NUM_MATERIALS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mNumMaterials"));
        M_MATERIALS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mMaterials"));
        M_NUM_ANIMATIONS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mNumAnimations"));
        M_ANIMATIONS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mAnimations"));
        M_NUM_TEXTURES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mNumTextures"));
        M_TEXTURES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mTextures"));
        M_NUM_LIGHTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mNumLights"));
        M_LIGHTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mLights"));
        M_NUM_CAMERAS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mNumCameras"));
        M_CAMERAS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mCameras"));
        M_META_DATA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mMetaData"));
        M_NUM_SKELETONS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mNumSkeletons"));
        M_SKELETONS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mSkeletons"));
        M_PRIVATE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mPrivate"));
        
        M_FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mFlags"));
        M_ROOT_NODE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mRootNode"));
        M_NUM_MESHES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mNumMeshes"));
        M_MESHES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mMeshes"));
        M_NUM_MATERIALS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mNumMaterials"));
        M_MATERIALS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mMaterials"));
        M_NUM_ANIMATIONS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mNumAnimations"));
        M_ANIMATIONS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mAnimations"));
        M_NUM_TEXTURES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mNumTextures"));
        M_TEXTURES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mTextures"));
        M_NUM_LIGHTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mNumLights"));
        M_LIGHTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mLights"));
        M_NUM_CAMERAS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mNumCameras"));
        M_CAMERAS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mCameras"));
        M_META_DATA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mMetaData"));
        M_NAME_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mName"));
        M_NUM_SKELETONS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mNumSkeletons"));
        M_SKELETONS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mSkeletons"));
        M_PRIVATE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mPrivate"));
        //@formatter:on
    }

    public AiScene() {
        this(Arena.ofAuto());
    }
    
    public AiScene(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public AiScene(MemorySegment segment) {
        this.segment = segment;
    
        mName = new AiString(segment.asSlice(M_NAME_BYTE_OFFSET, AiString.LAYOUT));
    }

    /// @see #mFlags()
    public AiScene mFlags(int mFlags) {
    	M_FLAGS_HANDLE.set(segment, 0L, mFlags);
    	return this;
    }
    
    /// ```
    /// Any combination of the AI_SCENE_FLAGS_XXX flags. By default
    /// this value is 0, no flags are set. Most applications will
    /// want to reject all scenes with the AI_SCENE_FLAGS_INCOMPLETE
    /// bit set.
    /// ```
    public int mFlags() {
    	return (int) M_FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #mRootNode()
    public AiScene mRootNode(AiNode mRootNode) {
    	M_ROOT_NODE_HANDLE.set(segment, 0L, mRootNode.memorySegment());
    	return this;
    }
    
    /// ```
    /// The root node of the hierarchy.
    /// 
    /// There will always be at least the root node if the import
    /// was successful (and no special flags have been set).
    /// Presence of further nodes depends on the format and content
    /// of the imported file.
    /// ```
    public @Nullable AiNode mRootNode() {
    	MemorySegment segment = (MemorySegment) M_ROOT_NODE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new AiNode(segment);
    }
    
    /// @see #mNumMeshes()
    public AiScene mNumMeshes(int mNumMeshes) {
    	M_NUM_MESHES_HANDLE.set(segment, 0L, mNumMeshes);
    	return this;
    }
    
    /// ```
    /// The number of meshes in the scene.
    /// ```
    public int mNumMeshes() {
    	return (int) M_NUM_MESHES_HANDLE.get(segment, 0L);
    }
    
    /// @see #mMeshes()
    public AiScene mMeshes(NativePointerArray mMeshes) {
    	M_MESHES_HANDLE.set(segment, 0L, mMeshes.memorySegment());
    	return this;
    }
    
    /// ```
    /// The array of meshes.
    /// 
    /// Use the indices given in the aiNode structure to access
    /// this array. The array is mNumMeshes in size. If the
    /// AI_SCENE_FLAGS_INCOMPLETE flag is not set there will always
    /// be at least ONE material.
    /// ```
    public @Nullable NativePointerArray mMeshes() {
    	MemorySegment segment = (MemorySegment) M_MESHES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativePointerArray(segment);
    }
    
    /// @see #mNumMaterials()
    public AiScene mNumMaterials(int mNumMaterials) {
    	M_NUM_MATERIALS_HANDLE.set(segment, 0L, mNumMaterials);
    	return this;
    }
    
    /// ```
    /// The number of materials in the scene.
    /// ```
    public int mNumMaterials() {
    	return (int) M_NUM_MATERIALS_HANDLE.get(segment, 0L);
    }
    
    /// @see #mMaterials()
    public AiScene mMaterials(NativePointerArray mMaterials) {
    	M_MATERIALS_HANDLE.set(segment, 0L, mMaterials.memorySegment());
    	return this;
    }
    
    /// ```
    /// The array of materials.
    /// 
    /// Use the index given in each aiMesh structure to access this
    /// array. The array is mNumMaterials in size. If the
    /// AI_SCENE_FLAGS_INCOMPLETE flag is not set there will always
    /// be at least ONE material.
    /// ```
    public @Nullable NativePointerArray mMaterials() {
    	MemorySegment segment = (MemorySegment) M_MATERIALS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativePointerArray(segment);
    }
    
    /// @see #mNumAnimations()
    public AiScene mNumAnimations(int mNumAnimations) {
    	M_NUM_ANIMATIONS_HANDLE.set(segment, 0L, mNumAnimations);
    	return this;
    }
    
    /// ```
    /// The number of animations in the scene.
    /// ```
    public int mNumAnimations() {
    	return (int) M_NUM_ANIMATIONS_HANDLE.get(segment, 0L);
    }
    
    /// @see #mAnimations()
    public AiScene mAnimations(NativePointerArray mAnimations) {
    	M_ANIMATIONS_HANDLE.set(segment, 0L, mAnimations.memorySegment());
    	return this;
    }
    
    /// ```
    /// The array of animations.
    /// 
    /// All animations imported from the given file are listed here.
    /// The array is mNumAnimations in size.
    /// ```
    public @Nullable NativePointerArray mAnimations() {
    	MemorySegment segment = (MemorySegment) M_ANIMATIONS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativePointerArray(segment);
    }
    
    /// @see #mNumTextures()
    public AiScene mNumTextures(int mNumTextures) {
    	M_NUM_TEXTURES_HANDLE.set(segment, 0L, mNumTextures);
    	return this;
    }
    
    /// ```
    /// The number of textures embedded into the file
    /// ```
    public int mNumTextures() {
    	return (int) M_NUM_TEXTURES_HANDLE.get(segment, 0L);
    }
    
    /// @see #mTextures()
    public AiScene mTextures(NativePointerArray mTextures) {
    	M_TEXTURES_HANDLE.set(segment, 0L, mTextures.memorySegment());
    	return this;
    }
    
    /// ```
    /// The array of embedded textures.
    /// 
    /// Not many file formats embed their textures into the file.
    /// An example is Quake's MDL format (which is also used by
    /// some GameStudio versions)
    /// ```
    public @Nullable NativePointerArray mTextures() {
    	MemorySegment segment = (MemorySegment) M_TEXTURES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativePointerArray(segment);
    }
    
    /// @see #mNumLights()
    public AiScene mNumLights(int mNumLights) {
    	M_NUM_LIGHTS_HANDLE.set(segment, 0L, mNumLights);
    	return this;
    }
    
    /// ```
    /// The number of light sources in the scene. Light sources
    /// are fully optional, in most cases this attribute will be 0
    /// ```
    public int mNumLights() {
    	return (int) M_NUM_LIGHTS_HANDLE.get(segment, 0L);
    }
    
    /// @see #mLights()
    public AiScene mLights(NativePointerArray mLights) {
    	M_LIGHTS_HANDLE.set(segment, 0L, mLights.memorySegment());
    	return this;
    }
    
    /// ```
    /// The array of light sources.
    /// 
    /// All light sources imported from the given file are
    /// listed here. The array is mNumLights in size.
    /// ```
    public @Nullable NativePointerArray mLights() {
    	MemorySegment segment = (MemorySegment) M_LIGHTS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativePointerArray(segment);
    }
    
    /// @see #mNumCameras()
    public AiScene mNumCameras(int mNumCameras) {
    	M_NUM_CAMERAS_HANDLE.set(segment, 0L, mNumCameras);
    	return this;
    }
    
    /// ```
    /// The number of cameras in the scene. Cameras
    /// are fully optional, in most cases this attribute will be 0
    /// ```
    public int mNumCameras() {
    	return (int) M_NUM_CAMERAS_HANDLE.get(segment, 0L);
    }
    
    /// @see #mCameras()
    public AiScene mCameras(NativePointerArray mCameras) {
    	M_CAMERAS_HANDLE.set(segment, 0L, mCameras.memorySegment());
    	return this;
    }
    
    /// ```
    /// The array of cameras.
    /// 
    /// All cameras imported from the given file are listed here.
    /// The array is mNumCameras in size. The first camera in the
    /// array (if existing) is the default camera view into
    /// the scene.
    /// ```
    public @Nullable NativePointerArray mCameras() {
    	MemorySegment segment = (MemorySegment) M_CAMERAS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativePointerArray(segment);
    }
    
    /// @see #mMetaData()
    public AiScene mMetaData(AiMetadata mMetaData) {
    	M_META_DATA_HANDLE.set(segment, 0L, mMetaData.memorySegment());
    	return this;
    }
    
    /// ```
    /// 
    /// @brief  The global metadata assigned to the scene itself.
    /// 
    /// This data contains global metadata which belongs to the scene like
    /// unit-conversions, versions, vendors or other model-specific data. This
    /// can be used to store format-specific metadata as well.
    /// ```
    public @Nullable AiMetadata mMetaData() {
    	MemorySegment segment = (MemorySegment) M_META_DATA_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new AiMetadata(segment);
    }
    
    /// @see #mNumSkeletons()
    public AiScene mNumSkeletons(int mNumSkeletons) {
    	M_NUM_SKELETONS_HANDLE.set(segment, 0L, mNumSkeletons);
    	return this;
    }
    
    /// ```
    /// 
    /// 
    /// ```
    public int mNumSkeletons() {
    	return (int) M_NUM_SKELETONS_HANDLE.get(segment, 0L);
    }
    
    /// @see #mSkeletons()
    public AiScene mSkeletons(NativePointerArray mSkeletons) {
    	M_SKELETONS_HANDLE.set(segment, 0L, mSkeletons.memorySegment());
    	return this;
    }
    
    /// ```
    /// 
    /// 
    /// ```
    public @Nullable NativePointerArray mSkeletons() {
    	MemorySegment segment = (MemorySegment) M_SKELETONS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativePointerArray(segment);
    }
    
    /// @see #mPrivate()
    public AiScene mPrivate(NativeByteArray mPrivate) {
    	M_PRIVATE_HANDLE.set(segment, 0L, mPrivate.memorySegment());
    	return this;
    }
    
    public @Nullable NativeByteArray mPrivate() {
    	MemorySegment segment = (MemorySegment) M_PRIVATE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeByteArray(segment);
    }
    
    /// @see #mName()
    public AiScene mName(Consumer<AiString> consumer) {
    	consumer.accept(mName);
    	return this;
    }
    
    /// @see #mName()
    public AiScene mName(AiString other) {
    	mName.set(other);
    	return this;
    }
    
    /// ```
    /// The name of the scene itself.
    /// ```
    public AiString mName() {
    	return mName;
    }
    
    @Override
    public AiScene set(AiScene other) {
        return set(other.segment);
    }
    
    @Override
    public AiScene set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<AiScene> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<AiScene> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new AiScene(segment),
            count
        );
    }
    
    public static NativeStructArray<AiScene> array(Arena arena, AiScene... structs) {
        NativeStructArray<AiScene> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new AiScene(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<AiScene> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new AiScene(segment)
        );
    }
    
}