/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.assimp.enums;

public final class AiPostProcessSteps {

    /// ```Calculates the tangents and bitangents for the imported meshes.```
    public static final int AI_PROCESS_CALC_TANGENT_SPACE = 1;
    /// ```Identifies and joins identical vertex data sets within all imported meshes.```
    public static final int AI_PROCESS_JOIN_IDENTICAL_VERTICES = 2;
    /// ```Converts all the imported data to a left-handed coordinate space.```
    public static final int AI_PROCESS_MAKE_LEFT_HANDED = 4;
    /// ```Triangulates all faces of all meshes.```
    public static final int AI_PROCESS_TRIANGULATE = 8;
    /// ```Removes some parts of the data structure (animations, materials, light sources, cameras, textures, vertex components).```
    public static final int AI_PROCESS_REMOVE_COMPONENT = 16;
    /// ```Generates normals for all faces of all meshes.```
    public static final int AI_PROCESS_GEN_NORMALS = 32;
    /// ```Generates smooth normals for all vertices in the mesh.```
    public static final int AI_PROCESS_GEN_SMOOTH_NORMALS = 64;
    /// ```Splits large meshes into smaller sub-meshes.```
    public static final int AI_PROCESS_SPLIT_LARGE_MESHES = 128;
    /// ```Removes the node graph and pre-transforms all vertices with the local transformation matrices of their nodes.```
    public static final int AI_PROCESS_PRE_TRANSFORM_VERTICES = 256;
    /// ```Limits the number of bones simultaneously affecting a single vertex to a maximum value.```
    public static final int AI_PROCESS_LIMIT_BONE_WEIGHTS = 512;
    /// ```Validates the imported scene data structure. This makes sure that all indices are valid, all animations and bones are linked correctly, all material references are correct .. etc.```
    public static final int AI_PROCESS_VALIDATE_DATA_STRUCTURE = 1024;
    /// ```Reorders triangles for better vertex cache locality.```
    public static final int AI_PROCESS_IMPROVE_CACHE_LOCALITY = 2048;
    /// ```Searches for redundant/unreferenced materials and removes them.```
    public static final int AI_PROCESS_REMOVE_REDUNDANT_MATERIALS = 4096;
    /// ```This step tries to determine which meshes have normal vectors that are facing inwards and inverts them.```
    public static final int AI_PROCESS_FIX_INFACING_NORMALS = 8192;
    /// ```This step generically populates aiBone->mArmature and aiBone->mNode generically The point of these is it saves you later having to calculate these elements This is useful when handling rest information or skin information If you have multiple armatures on your models we strongly recommend enabling this Instead of writing your own multi-root, multi-armature lookups we have done the hard work for you :)```
    public static final int AI_PROCESS_POPULATE_ARMATURE_DATA = 16384;
    /// ```This step splits meshes with more than one primitive type in homogeneous sub-meshes.```
    public static final int AI_PROCESS_SORT_BY_PTYPE = 32768;
    /// ```This step searches all meshes for degenerate primitives and converts them to proper lines or points.```
    public static final int AI_PROCESS_FIND_DEGENERATES = 65536;
    /// ```This step searches all meshes for invalid data, such as zeroed normal vectors or invalid UV coords and removes/fixes them. This is intended to get rid of some common exporter errors.```
    public static final int AI_PROCESS_FIND_INVALID_DATA = 131072;
    /// ```This step converts non-UV mappings (such as spherical or cylindrical mapping) to proper texture coordinate channels.```
    public static final int AI_PROCESS_GEN_UVCOORDS = 262144;
    /// ```This step applies per-texture UV transformations and bakes them into stand-alone vtexture coordinate channels.```
    public static final int AI_PROCESS_TRANSFORM_UVCOORDS = 524288;
    /// ```This step searches for duplicate meshes and replaces them with references to the first mesh.```
    public static final int AI_PROCESS_FIND_INSTANCES = 1048576;
    /// ```A post-processing step to reduce the number of meshes.```
    public static final int AI_PROCESS_OPTIMIZE_MESHES = 2097152;
    /// ```A post-processing step to optimize the scene hierarchy.```
    public static final int AI_PROCESS_OPTIMIZE_GRAPH = 4194304;
    /// ```This step flips all UV coordinates along the y-axis and adjusts material settings and bitangents accordingly.```
    public static final int AI_PROCESS_FLIP_UVS = 8388608;
    /// ```This step adjusts the output face winding order to be CW.```
    public static final int AI_PROCESS_FLIP_WINDING_ORDER = 16777216;
    /// ```This step splits meshes with many bones into sub-meshes so that each sub-mesh has fewer or as many bones as a given limit.```
    public static final int AI_PROCESS_SPLIT_BY_BONE_COUNT = 33554432;
    /// ```This step removes bones losslessly or according to some threshold.```
    public static final int AI_PROCESS_DEBONE = 67108864;
    /// ```This step will perform a global scale of the model.```
    public static final int AI_PROCESS_GLOBAL_SCALE = 134217728;
    /// ```A postprocessing step to embed of textures.```
    public static final int AI_PROCESS_EMBED_TEXTURES = 268435456;
    /// ```A postprocessing step to embed of textures.```
    public static final int AI_PROCESS_FORCE_GEN_NORMALS = 536870912;
    /// ```Drops normals for all faces of all meshes.```
    public static final int AI_PROCESS_DROP_NORMALS = 1073741824;
    /// ``````
    public static final int AI_PROCESS_GEN_BOUNDING_BOXES = -2147483648;

}