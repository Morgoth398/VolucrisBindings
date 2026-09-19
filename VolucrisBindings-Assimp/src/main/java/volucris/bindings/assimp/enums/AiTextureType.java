/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.assimp.enums;

public final class AiTextureType {

    /// ```Dummy value.```
    public static final int AI_TEXTURE_TYPE_NONE = 0;
    /// ```The texture is combined with the result of the diffuse lighting equation. OR PBR Specular/Glossiness```
    public static final int AI_TEXTURE_TYPE_DIFFUSE = 1;
    /// ```The texture is combined with the result of the specular lighting equation. OR PBR Specular/Glossiness```
    public static final int AI_TEXTURE_TYPE_SPECULAR = 2;
    /// ```The texture is combined with the result of the ambient lighting equation.```
    public static final int AI_TEXTURE_TYPE_AMBIENT = 3;
    /// ```The texture is added to the result of the lighting calculation. It isn't influenced by incoming light.```
    public static final int AI_TEXTURE_TYPE_EMISSIVE = 4;
    /// ```The texture is a height map.```
    public static final int AI_TEXTURE_TYPE_HEIGHT = 5;
    /// ```The texture is a (tangent space) normal-map.```
    public static final int AI_TEXTURE_TYPE_NORMALS = 6;
    /// ```The texture defines the glossiness of the material.```
    public static final int AI_TEXTURE_TYPE_SHININESS = 7;
    /// ```The texture defines per-pixel opacity.```
    public static final int AI_TEXTURE_TYPE_OPACITY = 8;
    /// ```Displacement texture```
    public static final int AI_TEXTURE_TYPE_DISPLACEMENT = 9;
    /// ```Lightmap texture (aka Ambient Occlusion)```
    public static final int AI_TEXTURE_TYPE_LIGHTMAP = 10;
    /// ```Reflection texture```
    public static final int AI_TEXTURE_TYPE_REFLECTION = 11;
    /// ```PBR Materials PBR definitions from maya and other modelling packages now use this standard. This was originally introduced around 2012. Support for this is in game engines like Godot, Unreal or Unity3D. Modelling packages which use this are very common now.```
    public static final int AI_TEXTURE_TYPE_BASE_COLOR = 12;
    /// ```PBR Materials PBR definitions from maya and other modelling packages now use this standard. This was originally introduced around 2012. Support for this is in game engines like Godot, Unreal or Unity3D. Modelling packages which use this are very common now.```
    public static final int AI_TEXTURE_TYPE_NORMAL_CAMERA = 13;
    /// ```PBR Materials PBR definitions from maya and other modelling packages now use this standard. This was originally introduced around 2012. Support for this is in game engines like Godot, Unreal or Unity3D. Modelling packages which use this are very common now.```
    public static final int AI_TEXTURE_TYPE_EMISSION_COLOR = 14;
    /// ```PBR Materials PBR definitions from maya and other modelling packages now use this standard. This was originally introduced around 2012. Support for this is in game engines like Godot, Unreal or Unity3D. Modelling packages which use this are very common now.```
    public static final int AI_TEXTURE_TYPE_METALNESS = 15;
    /// ```PBR Materials PBR definitions from maya and other modelling packages now use this standard. This was originally introduced around 2012. Support for this is in game engines like Godot, Unreal or Unity3D. Modelling packages which use this are very common now.```
    public static final int AI_TEXTURE_TYPE_DIFFUSE_ROUGHNESS = 16;
    /// ```PBR Materials PBR definitions from maya and other modelling packages now use this standard. This was originally introduced around 2012. Support for this is in game engines like Godot, Unreal or Unity3D. Modelling packages which use this are very common now.```
    public static final int AI_TEXTURE_TYPE_AMBIENT_OCCLUSION = 17;
    /// ```Unknown texture```
    public static final int AI_TEXTURE_TYPE_UNKNOWN = 18;
    /// ```Sheen Generally used to simulate textiles that are covered in a layer of microfibers eg velvet https://github.com/KhronosGroup/glTF/tree/master/extensions/2.0/Khronos/KHR_materials_sheen```
    public static final int AI_TEXTURE_TYPE_SHEEN = 19;
    /// ```Clearcoat Simulates a layer of 'polish' or 'lacquer' layered on top of a PBR substrate https://autodesk.github.io/standard-surface/#closures/coating https://github.com/KhronosGroup/glTF/tree/master/extensions/2.0/Khronos/KHR_materials_clearcoat```
    public static final int AI_TEXTURE_TYPE_CLEARCOAT = 20;
    /// ```Transmission Simulates transmission through the surface May include further information such as wall thickness```
    public static final int AI_TEXTURE_TYPE_TRANSMISSION = 21;
    /// ```Maya material declarations```
    public static final int AI_TEXTURE_TYPE_MAYA_BASE = 22;
    /// ```Maya material declarations```
    public static final int AI_TEXTURE_TYPE_MAYA_SPECULAR = 23;
    /// ```Maya material declarations```
    public static final int AI_TEXTURE_TYPE_MAYA_SPECULAR_COLOR = 24;
    /// ```Maya material declarations```
    public static final int AI_TEXTURE_TYPE_MAYA_SPECULAR_ROUGHNESS = 25;
    /// ```Anisotropy Simulates a surface with directional properties```
    public static final int AI_TEXTURE_TYPE_ANISOTROPY = 26;
    /// ```gltf material declarations Refs: https://registry.khronos.org/glTF/specs/2.0/glTF-2.0.html#metallic-roughness-material "textures for metalness and roughness properties are packed together in a single texture called metallicRoughnessTexture. Its green channel contains roughness values and its blue channel contains metalness values..." https://registry.khronos.org/glTF/specs/2.0/glTF-2.0.html#_material_pbrmetallicroughness_metallicroughnesstexture "The metalness values are sampled from the B channel. The roughness values are sampled from the G channel..."```
    public static final int AI_TEXTURE_TYPE_GLTF_METALLIC_ROUGHNESS = 27;

}