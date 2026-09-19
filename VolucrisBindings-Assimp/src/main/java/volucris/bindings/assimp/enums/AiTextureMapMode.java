/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.assimp.enums;

public final class AiTextureMapMode {

    /// ```A texture coordinate u|v is translated to u%1|v%1```
    public static final int AI_TEXTURE_MAP_MODE_WRAP = 0;
    /// ```Texture coordinates outside [0...1] are clamped to the nearest valid value.```
    public static final int AI_TEXTURE_MAP_MODE_CLAMP = 1;
    /// ```If the texture coordinates for a pixel are outside [0...1] the texture is not applied to that pixel```
    public static final int AI_TEXTURE_MAP_MODE_DECAL = 3;
    /// ```A texture coordinate u|v becomes u%1|v%1 if (u-(u%1))%2 is zero and 1-(u%1)|1-(v%1) otherwise```
    public static final int AI_TEXTURE_MAP_MODE_MIRROR = 2;

}