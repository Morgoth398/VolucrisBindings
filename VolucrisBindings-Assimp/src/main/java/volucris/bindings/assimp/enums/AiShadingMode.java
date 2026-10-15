/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.assimp.enums;

public final class AiShadingMode {

    /// ```
    /// Flat shading. Shading is done on per-face base,
    /// diffuse only. Also known as 'faceted shading'.
    /// ```
    public static final int AI_SHADING_MODE_FLAT = 1;
    /// ```
    /// Simple Gouraud shading.
    /// ```
    public static final int AI_SHADING_MODE_GOURAUD = 2;
    /// ```
    /// Phong-Shading -
    /// ```
    public static final int AI_SHADING_MODE_PHONG = 3;
    /// ```
    /// Phong-Blinn-Shading
    /// ```
    public static final int AI_SHADING_MODE_BLINN = 4;
    /// ```
    /// Toon-Shading per pixel
    /// 
    /// Also known as 'comic' shader.
    /// ```
    public static final int AI_SHADING_MODE_TOON = 5;
    /// ```
    /// OrenNayar-Shading per pixel
    /// 
    /// Extension to standard Lambertian shading, taking the
    /// roughness of the material into account
    /// ```
    public static final int AI_SHADING_MODE_OREN_NAYAR = 6;
    /// ```
    /// Minnaert-Shading per pixel
    /// 
    /// Extension to standard Lambertian shading, taking the
    /// "darkness" of the material into account
    /// ```
    public static final int AI_SHADING_MODE_MINNAERT = 7;
    /// ```
    /// CookTorrance-Shading per pixel
    /// 
    /// Special shader for metallic surfaces.
    /// ```
    public static final int AI_SHADING_MODE_COOK_TORRANCE = 8;
    /// ```
    /// No shading at all. Constant light influence of 1.0.
    /// Also known as "Unlit"
    /// ```
    public static final int AI_SHADING_MODE_NO_SHADING = 9;
    public static final int AI_SHADING_MODE_UNLIT = 9;
    /// ```
    /// Fresnel shading
    /// ```
    public static final int AI_SHADING_MODE_FRESNEL = 10;
    /// ```
    /// Physically-Based Rendering (PBR) shading using
    /// Bidirectional scattering/reflectance distribution function (BSDF/BRDF)
    /// There are multiple methods under this banner, and model files may provide
    /// data for more than one PBR-BRDF method.
    /// Applications should use the set of provided properties to determine which
    /// of their preferred PBR rendering methods are likely to be available
    /// eg:
    /// - If AI_MATKEY_METALLIC_FACTOR is set, then a Metallic/Roughness is available
    /// - If AI_MATKEY_GLOSSINESS_FACTOR is set, then a Specular/Glossiness is available
    /// Note that some PBR methods allow layering of techniques
    /// ```
    public static final int AI_SHADING_MODE_PBR_BRDF = 11;

}