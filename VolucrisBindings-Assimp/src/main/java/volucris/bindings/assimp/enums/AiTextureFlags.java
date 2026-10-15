/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.assimp.enums;

public final class AiTextureFlags {

    /// ```
    /// The texture's color values have to be inverted (component-wise 1-n)
    /// ```
    public static final int AI_TEXTURE_FLAGS_INVERT = 1;
    /// ```
    /// Explicit request to the application to process the alpha channel
    /// of the texture.
    /// 
    /// Mutually exclusive with #aiTextureFlags_IgnoreAlpha. These
    /// flags are set if the library can say for sure that the alpha
    /// channel is used/is not used. If the model format does not
    /// define this, it is left to the application to decide whether
    /// the texture alpha channel - if any - is evaluated or not.
    /// ```
    public static final int AI_TEXTURE_FLAGS_USE_ALPHA = 2;
    /// ```
    /// Explicit request to the application to ignore the alpha channel
    /// of the texture.
    /// 
    /// Mutually exclusive with #aiTextureFlags_UseAlpha.
    /// ```
    public static final int AI_TEXTURE_FLAGS_IGNORE_ALPHA = 4;

}