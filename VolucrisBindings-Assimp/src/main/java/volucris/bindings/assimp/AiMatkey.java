package volucris.bindings.assimp;

public record AiMatkey(String key, int type, int index) {

	public static final AiMatkey AI_MATKEY_NAME = new AiMatkey("?mat.name", 0, 0);
	public static final AiMatkey AI_MATKEY_TWOSIDED = new AiMatkey("$mat.twosided", 0, 0);
	public static final AiMatkey AI_MATKEY_SHADING_MODEL = new AiMatkey("$mat.shadingm", 0, 0);
	public static final AiMatkey AI_MATKEY_ENABLE_WIREFRAME = new AiMatkey("$mat.wireframe", 0, 0);
	public static final AiMatkey AI_MATKEY_BLEND_FUNC = new AiMatkey("$mat.blend", 0, 0);
	public static final AiMatkey AI_MATKEY_OPACITY = new AiMatkey("$mat.opacity", 0, 0);
	public static final AiMatkey AI_MATKEY_TRANSPARENCYFACTOR = new AiMatkey("$mat.transparencyfactor", 0, 0);
	public static final AiMatkey AI_MATKEY_BUMPSCALING = new AiMatkey("$mat.bumpscaling", 0, 0);
	public static final AiMatkey AI_MATKEY_SHININESS = new AiMatkey("$mat.shininess", 0, 0);
	public static final AiMatkey AI_MATKEY_REFLECTIVITY = new AiMatkey("$mat.reflectivity", 0, 0);
	public static final AiMatkey AI_MATKEY_SHININESS_STRENGTH = new AiMatkey("$mat.shinpercent", 0, 0);
	public static final AiMatkey AI_MATKEY_REFRACTI = new AiMatkey("$mat.refracti", 0, 0);
	public static final AiMatkey AI_MATKEY_COLOR_DIFFUSE = new AiMatkey("$clr.diffuse", 0, 0);
	public static final AiMatkey AI_MATKEY_COLOR_AMBIENT = new AiMatkey("$clr.ambient", 0, 0);
	public static final AiMatkey AI_MATKEY_COLOR_SPECULAR = new AiMatkey("$clr.specular", 0, 0);
	public static final AiMatkey AI_MATKEY_COLOR_EMISSIVE = new AiMatkey("$clr.emissive", 0, 0);
	public static final AiMatkey AI_MATKEY_COLOR_TRANSPARENT = new AiMatkey("$clr.transparent", 0, 0);
	public static final AiMatkey AI_MATKEY_COLOR_REFLECTIVE = new AiMatkey("$clr.reflective", 0, 0);
	public static final AiMatkey AI_MATKEY_GLOBAL_BACKGROUND_IMAGE = new AiMatkey("?bg.global", 0, 0);
	public static final AiMatkey AI_MATKEY_GLOBAL_SHADERLANG = new AiMatkey("?sh.lang", 0, 0);
	public static final AiMatkey AI_MATKEY_SHADER_VERTEX = new AiMatkey("?sh.vs", 0, 0);
	public static final AiMatkey AI_MATKEY_SHADER_FRAGMENT = new AiMatkey("?sh.fs", 0, 0);
	public static final AiMatkey AI_MATKEY_SHADER_GEO = new AiMatkey("?sh.gs", 0, 0);
	public static final AiMatkey AI_MATKEY_SHADER_TESSELATION = new AiMatkey("?sh.ts", 0, 0);
	public static final AiMatkey AI_MATKEY_SHADER_PRIMITIVE = new AiMatkey("?sh.ps", 0, 0);
	public static final AiMatkey AI_MATKEY_SHADER_COMPUTE = new AiMatkey("?sh.cs", 0, 0);
	public static final AiMatkey AI_MATKEY_USE_COLOR_MAP = new AiMatkey("$mat.useColorMap", 0, 0);
	public static final AiMatkey AI_MATKEY_BASE_COLOR = new AiMatkey("$clr.base", 0, 0);
	public static final AiMatkey AI_MATKEY_USE_METALLIC_MAP = new AiMatkey("$mat.useMetallicMap", 0, 0);
	public static final AiMatkey AI_MATKEY_METALLIC_FACTOR = new AiMatkey("$mat.metallicFactor", 0, 0);
	public static final AiMatkey AI_MATKEY_USE_ROUGHNESS_MAP = new AiMatkey("$mat.useRoughnessMap", 0, 0);
	public static final AiMatkey AI_MATKEY_ROUGHNESS_FACTOR = new AiMatkey("$mat.roughnessFactor", 0, 0);
	public static final AiMatkey AI_MATKEY_ANISOTROPY_FACTOR = new AiMatkey("$mat.anisotropyFactor", 0, 0);
	public static final AiMatkey AI_MATKEY_SPECULAR_FACTOR = new AiMatkey("$mat.specularFactor", 0, 0);
	public static final AiMatkey AI_MATKEY_GLOSSINESS_FACTOR = new AiMatkey("$mat.glossinessFactor", 0, 0);
	public static final AiMatkey AI_MATKEY_SHEEN_COLOR_FACTOR = new AiMatkey("$clr.sheen.factor", 0, 0);
	public static final AiMatkey AI_MATKEY_SHEEN_ROUGHNESS_FACTOR = new AiMatkey("$mat.sheen.roughnessFactor", 0, 0);
	public static final AiMatkey AI_MATKEY_CLEARCOAT_FACTOR = new AiMatkey("$mat.clearcoat.factor", 0, 0);
	public static final AiMatkey AI_MATKEY_CLEARCOAT_ROUGHNESS_FACTOR = new AiMatkey("$mat.clearcoat.roughnessFactor", 0, 0);
	public static final AiMatkey AI_MATKEY_TRANSMISSION_FACTOR = new AiMatkey("$mat.transmission.factor", 0, 0);
	public static final AiMatkey AI_MATKEY_VOLUME_THICKNESS_FACTOR = new AiMatkey("$mat.volume.thicknessFactor", 0, 0);
	public static final AiMatkey AI_MATKEY_VOLUME_ATTENUATION_DISTANCE = new AiMatkey("$mat.volume.attenuationDistance", 0, 0);
	public static final AiMatkey AI_MATKEY_VOLUME_ATTENUATION_COLOR = new AiMatkey("$mat.volume.attenuationColor", 0, 0);
	public static final AiMatkey AI_MATKEY_USE_EMISSIVE_MAP = new AiMatkey("$mat.useEmissiveMap", 0, 0);
	public static final AiMatkey AI_MATKEY_EMISSIVE_INTENSITY = new AiMatkey("$mat.emissiveIntensity", 0, 0);
	public static final AiMatkey AI_MATKEY_USE_AO_MAP = new AiMatkey("$mat.useAOMap", 0, 0);
	public static final AiMatkey AI_MATKEY_ANISOTROPY_ROTATION = new AiMatkey("$mat.anisotropyRotation", 0, 0);
	public static final AiMatkey AI_MATKEY_GLTF_ALPHAMODE = new AiMatkey("$mat.gltf.alphaMode", 0, 0);
	public static final AiMatkey AI_MATKEY_GLTF_ALPHACUTOFF = new AiMatkey("$mat.gltf.alphaCutoff", 0, 0);

}
