/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.assimp.enums;

public final class AiComponent {

    public static final int AI_COMPONENT_NORMALS = 2;
    public static final int AI_COMPONENT_TANGENTS_AND_BITANGENTS = 4;
    /// ```ALL color sets Use aiComponent_COLORn(N) to specify the N'th set```
    public static final int AI_COMPONENT_COLORS = 8;
    /// ```ALL texture UV sets aiComponent_TEXCOORDn(N) to specify the N'th set```
    public static final int AI_COMPONENT_TEXCOORDS = 16;
    /// ```Removes all bone weights from all meshes. The scenegraph nodes corresponding to the bones are NOT removed. use the #aiProcess_OptimizeGraph step to do this```
    public static final int AI_COMPONENT_BONEWEIGHTS = 32;
    /// ```Removes all node animations (aiScene::mAnimations). The corresponding scenegraph nodes are NOT removed. use the #aiProcess_OptimizeGraph step to do this```
    public static final int AI_COMPONENT_ANIMATIONS = 64;
    /// ```Removes all embedded textures (aiScene::mTextures)```
    public static final int AI_COMPONENT_TEXTURES = 128;
    /// ```Removes all light sources (aiScene::mLights). The corresponding scenegraph nodes are NOT removed. use the #aiProcess_OptimizeGraph step to do this```
    public static final int AI_COMPONENT_LIGHTS = 256;
    /// ```Removes all cameras (aiScene::mCameras). The corresponding scenegraph nodes are NOT removed. use the #aiProcess_OptimizeGraph step to do this```
    public static final int AI_COMPONENT_CAMERAS = 512;
    /// ```Removes all meshes (aiScene::mMeshes).```
    public static final int AI_COMPONENT_MESHES = 1024;
    /// ```Removes all materials. One default material will be generated, so aiScene::mNumMaterials will be 1.```
    public static final int AI_COMPONENT_MATERIALS = 2048;

}