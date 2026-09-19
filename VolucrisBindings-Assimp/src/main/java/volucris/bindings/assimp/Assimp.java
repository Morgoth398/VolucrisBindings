/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.assimp;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.MethodHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.assimp.structs.*;
import volucris.bindings.core.MemoryStack;
import volucris.bindings.core.NativeByteArray;
import volucris.bindings.core.NativeFloatArray;
import volucris.bindings.core.NativeIntArray;
import volucris.bindings.core.NativePointerArray;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class Assimp {

    public static final String AI_CONFIG_GLOB_MEASURE_TIME = "GLOB_MEASURE_TIME";
    public static final String AI_CONFIG_IMPORT_NO_SKELETON_MESHES = "IMPORT_NO_SKELETON_MESHES";
    public static final String AI_CONFIG_PP_SBBC_MAX_BONES = "PP_SBBC_MAX_BONES";
    public static final String AI_CONFIG_PP_CT_MAX_SMOOTHING_ANGLE = "PP_CT_MAX_SMOOTHING_ANGLE";
    public static final String AI_CONFIG_PP_CT_TEXTURE_CHANNEL_INDEX = "PP_CT_TEXTURE_CHANNEL_INDEX";
    public static final String AI_CONFIG_PP_GSN_MAX_SMOOTHING_ANGLE = "PP_GSN_MAX_SMOOTHING_ANGLE";
    public static final String AI_CONFIG_IMPORT_MDL_COLORMAP = "IMPORT_MDL_COLORMAP";
    public static final String AI_CONFIG_PP_RRM_EXCLUDE_LIST = "PP_RRM_EXCLUDE_LIST";
    public static final String AI_CONFIG_PP_PTV_KEEP_HIERARCHY = "PP_PTV_KEEP_HIERARCHY";
    public static final String AI_CONFIG_PP_PTV_NORMALIZE = "PP_PTV_NORMALIZE";
    public static final String AI_CONFIG_PP_PTV_ADD_ROOT_TRANSFORMATION = "PP_PTV_ADD_ROOT_TRANSFORMATION";
    public static final String AI_CONFIG_PP_PTV_ROOT_TRANSFORMATION = "PP_PTV_ROOT_TRANSFORMATION";
    public static final String AI_CONFIG_CHECK_IDENTITY_MATRIX_EPSILON = "CHECK_IDENTITY_MATRIX_EPSILON";
    public static final String AI_CONFIG_CHECK_IDENTITY_MATRIX_EPSILON_DEFAULT = "10e-3f";
    public static final String AI_CONFIG_PP_FD_REMOVE = "PP_FD_REMOVE";
    public static final String AI_CONFIG_PP_FD_CHECKAREA = "PP_FD_CHECKAREA";
    public static final String AI_CONFIG_PP_OG_EXCLUDE_LIST = "PP_OG_EXCLUDE_LIST";
    public static final String AI_CONFIG_PP_SLM_TRIANGLE_LIMIT = "PP_SLM_TRIANGLE_LIMIT";
    public static final String AI_CONFIG_PP_SLM_VERTEX_LIMIT = "PP_SLM_VERTEX_LIMIT";
    public static final String AI_CONFIG_PP_LBW_MAX_WEIGHTS = "PP_LBW_MAX_WEIGHTS";
    public static final String AI_CONFIG_PP_DB_THRESHOLD = "PP_DB_THRESHOLD";
    public static final String AI_CONFIG_PP_DB_ALL_OR_NONE = "PP_DB_ALL_OR_NONE";
    public static final String AI_CONFIG_PP_ICL_PTCACHE_SIZE = "PP_ICL_PTCACHE_SIZE";
    public static final String AI_CONFIG_PP_RVC_FLAGS = "PP_RVC_FLAGS";
    public static final String AI_CONFIG_PP_SBP_REMOVE = "PP_SBP_REMOVE";
    public static final String AI_CONFIG_PP_FID_ANIM_ACCURACY = "PP_FID_ANIM_ACCURACY";
    public static final String AI_CONFIG_PP_FID_IGNORE_TEXTURECOORDS = "PP_FID_IGNORE_TEXTURECOORDS";
    public static final String AI_CONFIG_PP_TUV_EVALUATE = "PP_TUV_EVALUATE";
    public static final String AI_CONFIG_FAVOUR_SPEED = "FAVOUR_SPEED";
    public static final String AI_CONFIG_IMPORT_SCHEMA_DOCUMENT_PROVIDER = "IMPORT_SCHEMA_DOCUMENT_PROVIDER";
    public static final String AI_CONFIG_IMPORT_FBX_READ_ALL_GEOMETRY_LAYERS = "IMPORT_FBX_READ_ALL_GEOMETRY_LAYERS";
    public static final String AI_CONFIG_IMPORT_FBX_READ_ALL_MATERIALS = "IMPORT_FBX_READ_ALL_MATERIALS";
    public static final String AI_CONFIG_IMPORT_FBX_READ_MATERIALS = "IMPORT_FBX_READ_MATERIALS";
    public static final String AI_CONFIG_IMPORT_FBX_READ_TEXTURES = "IMPORT_FBX_READ_TEXTURES";
    public static final String AI_CONFIG_IMPORT_FBX_READ_CAMERAS = "IMPORT_FBX_READ_CAMERAS";
    public static final String AI_CONFIG_IMPORT_FBX_READ_LIGHTS = "IMPORT_FBX_READ_LIGHTS";
    public static final String AI_CONFIG_IMPORT_FBX_READ_ANIMATIONS = "IMPORT_FBX_READ_ANIMATIONS";
    public static final String AI_CONFIG_IMPORT_FBX_READ_WEIGHTS = "IMPORT_FBX_READ_WEIGHTS";
    public static final String AI_CONFIG_IMPORT_FBX_STRICT_MODE = "IMPORT_FBX_STRICT_MODE";
    public static final String AI_CONFIG_IMPORT_FBX_PRESERVE_PIVOTS = "IMPORT_FBX_PRESERVE_PIVOTS";
    public static final String AI_CONFIG_IMPORT_FBX_OPTIMIZE_EMPTY_ANIMATION_CURVES = "IMPORT_FBX_OPTIMIZE_EMPTY_ANIMATION_CURVES";
    public static final String AI_CONFIG_IMPORT_FBX_EMBEDDED_TEXTURES_LEGACY_NAMING = "AI_CONFIG_IMPORT_FBX_EMBEDDED_TEXTURES_LEGACY_NAMING";
    public static final String AI_CONFIG_IMPORT_REMOVE_EMPTY_BONES = "AI_CONFIG_IMPORT_REMOVE_EMPTY_BONES";
    public static final String AI_CONFIG_FBX_CONVERT_TO_M = "AI_CONFIG_FBX_CONVERT_TO_M";
    public static final String AI_CONFIG_IMPORT_FBX_IGNORE_UP_DIRECTION = "AI_CONFIG_IMPORT_FBX_IGNORE_UP_DIRECTION";
    public static final String AI_CONFIG_FBX_USE_SKELETON_BONE_CONTAINER = "AI_CONFIG_FBX_USE_SKELETON_BONE_CONTAINER";
    public static final String AI_CONFIG_IMPORT_GLOBAL_KEYFRAME = "IMPORT_GLOBAL_KEYFRAME";
    public static final String AI_CONFIG_IMPORT_MD3_KEYFRAME = "IMPORT_MD3_KEYFRAME";
    public static final String AI_CONFIG_IMPORT_MD2_KEYFRAME = "IMPORT_MD2_KEYFRAME";
    public static final String AI_CONFIG_IMPORT_MDL_KEYFRAME = "IMPORT_MDL_KEYFRAME";
    public static final String AI_CONFIG_IMPORT_MDC_KEYFRAME = "IMPORT_MDC_KEYFRAME";
    public static final String AI_CONFIG_IMPORT_SMD_KEYFRAME = "IMPORT_SMD_KEYFRAME";
    public static final String AI_CONFIG_IMPORT_UNREAL_KEYFRAME = "IMPORT_UNREAL_KEYFRAME";
    public static final String AI_CONFIG_IMPORT_MDL_HL1_READ_ANIMATIONS = "IMPORT_MDL_HL1_READ_ANIMATIONS";
    public static final String AI_CONFIG_IMPORT_MDL_HL1_READ_ANIMATION_EVENTS = "IMPORT_MDL_HL1_READ_ANIMATION_EVENTS";
    public static final String AI_CONFIG_IMPORT_MDL_HL1_TRANSFORM_COORD_SYSTEM = "TRANSFORM COORDSYSTEM FOR HS! MODELS";
    public static final String AI_CONFIG_IMPORT_MDL_HL1_READ_BLEND_CONTROLLERS = "IMPORT_MDL_HL1_READ_BLEND_CONTROLLERS";
    public static final String AI_CONFIG_IMPORT_MDL_HL1_READ_SEQUENCE_TRANSITIONS = "IMPORT_MDL_HL1_READ_SEQUENCE_TRANSITIONS";
    public static final String AI_CONFIG_IMPORT_MDL_HL1_READ_ATTACHMENTS = "IMPORT_MDL_HL1_READ_ATTACHMENTS";
    public static final String AI_CONFIG_IMPORT_MDL_HL1_READ_BONE_CONTROLLERS = "IMPORT_MDL_HL1_READ_BONE_CONTROLLERS";
    public static final String AI_CONFIG_IMPORT_MDL_HL1_READ_HITBOXES = "IMPORT_MDL_HL1_READ_HITBOXES";
    public static final String AI_CONFIG_IMPORT_MDL_HL1_READ_MISC_GLOBAL_INFO = "IMPORT_MDL_HL1_READ_MISC_GLOBAL_INFO";
    public static final String AI_CONFIG_IMPORT_SMD_LOAD_ANIMATION_LIST = "IMPORT_SMD_LOAD_ANIMATION_LIST";
    public static final String AI_CONFIG_IMPORT_AC_SEPARATE_BFCULL = "IMPORT_AC_SEPARATE_BFCULL";
    public static final String AI_CONFIG_IMPORT_AC_EVAL_SUBDIVISION = "IMPORT_AC_EVAL_SUBDIVISION";
    public static final String AI_CONFIG_IMPORT_UNREAL_HANDLE_FLAGS = "UNREAL_HANDLE_FLAGS";
    public static final String AI_CONFIG_IMPORT_TER_MAKE_UVS = "IMPORT_TER_MAKE_UVS";
    public static final String AI_CONFIG_IMPORT_ASE_RECONSTRUCT_NORMALS = "IMPORT_ASE_RECONSTRUCT_NORMALS";
    public static final String AI_CONFIG_IMPORT_MD3_HANDLE_MULTIPART = "IMPORT_MD3_HANDLE_MULTIPART";
    public static final String AI_CONFIG_IMPORT_MD3_SKIN_NAME = "IMPORT_MD3_SKIN_NAME";
    public static final String AI_CONFIG_IMPORT_MD3_LOAD_SHADERS = "IMPORT_MD3_LOAD_SHADERS";
    public static final String AI_CONFIG_IMPORT_MD3_SHADER_SRC = "IMPORT_MD3_SHADER_SRC";
    public static final String AI_CONFIG_IMPORT_LWO_ONE_LAYER_ONLY = "IMPORT_LWO_ONE_LAYER_ONLY";
    public static final String AI_CONFIG_IMPORT_MD5_NO_ANIM_AUTOLOAD = "IMPORT_MD5_NO_ANIM_AUTOLOAD";
    public static final String AI_CONFIG_IMPORT_LWS_ANIM_START = "IMPORT_LWS_ANIM_START";
    public static final String AI_CONFIG_IMPORT_LWS_ANIM_END = "IMPORT_LWS_ANIM_END";
    public static final String AI_CONFIG_IMPORT_IRR_ANIM_FPS = "IMPORT_IRR_ANIM_FPS";
    public static final String AI_CONFIG_IMPORT_OGRE_MATERIAL_FILE = "IMPORT_OGRE_MATERIAL_FILE";
    public static final String AI_CONFIG_IMPORT_OGRE_TEXTURETYPE_FROM_FILENAME = "IMPORT_OGRE_TEXTURETYPE_FROM_FILENAME";
    public static final String AI_CONFIG_ANDROID_JNI_ASSIMP_MANAGER_SUPPORT = "AI_CONFIG_ANDROID_JNI_ASSIMP_MANAGER_SUPPORT";
    public static final String AI_CONFIG_IMPORT_IFC_SKIP_SPACE_REPRESENTATIONS = "IMPORT_IFC_SKIP_SPACE_REPRESENTATIONS";
    public static final String AI_CONFIG_IMPORT_IFC_CUSTOM_TRIANGULATION = "IMPORT_IFC_CUSTOM_TRIANGULATION";
    public static final String AI_CONFIG_IMPORT_IFC_SMOOTHING_ANGLE = "IMPORT_IFC_SMOOTHING_ANGLE";
    public static final String AI_CONFIG_IMPORT_IFC_CYLINDRICAL_TESSELLATION = "IMPORT_IFC_CYLINDRICAL_TESSELLATION";
    public static final String AI_CONFIG_IMPORT_COLLADA_IGNORE_UP_DIRECTION = "IMPORT_COLLADA_IGNORE_UP_DIRECTION";
    public static final String AI_CONFIG_IMPORT_COLLADA_IGNORE_UNIT_SIZE = "IMPORT_COLLADA_IGNORE_UNIT_SIZE";
    public static final String AI_CONFIG_IMPORT_COLLADA_USE_COLLADA_NAMES = "IMPORT_COLLADA_USE_COLLADA_NAMES";
    public static final String AI_CONFIG_EXPORT_XFILE_64BIT = "EXPORT_XFILE_64BIT";
    public static final String AI_CONFIG_EXPORT_POINT_CLOUDS = "EXPORT_POINT_CLOUDS";
    public static final String AI_CONFIG_USE_GLTF_PBR_SPECULAR_GLOSSINESS = "USE_GLTF_PBR_SPECULAR_GLOSSINESS";
    public static final String AI_CONFIG_EXPORT_GLTF_UNLIMITED_SKINNING_BONES_PER_VERTEX = "USE_UNLIMITED_BONES_PER VERTEX";
    public static final String AI_CONFIG_EXPORT_FBX_TRANSPARENCY_FACTOR_REFER_TO_OPACITY = "EXPORT_FBX_TRANSPARENCY_FACTOR_REFER_TO_OPACITY";
    public static final String AI_CONFIG_EXPORT_BLOB_NAME = "EXPORT_BLOB_NAME";
    public static final String AI_CONFIG_GLOBAL_SCALE_FACTOR_KEY = "GLOBAL_SCALE_FACTOR";
    public static final String AI_CONFIG_GLOBAL_SCALE_FACTOR_DEFAULT = "1.0f";
    public static final String AI_CONFIG_APP_SCALE_KEY = "APP_SCALE_FACTOR";
    public static final int AI_MAX_FACE_INDICES = 0x7fff;
    public static final int AI_MAX_BONE_WEIGHTS = 0x7fffffff;
    public static final int AI_MAX_VERTICES = 0x7fffffff;
    public static final int AI_MAX_FACES = 0x7fffffff;
    public static final int AI_MAX_NUMBER_OF_COLOR_SETS = 0x8;
    public static final int AI_MAX_NUMBER_OF_TEXTURECOORDS = 0x8;
    public static final String _AI_MATKEY_TEXTURE_BASE = "$tex.file";
    public static final String _AI_MATKEY_UVWSRC_BASE = "$tex.uvwsrc";
    public static final String _AI_MATKEY_TEXOP_BASE = "$tex.op";
    public static final String _AI_MATKEY_MAPPING_BASE = "$tex.mapping";
    public static final String _AI_MATKEY_TEXBLEND_BASE = "$tex.blend";
    public static final String _AI_MATKEY_MAPPINGMODE_U_BASE = "$tex.mapmodeu";
    public static final String _AI_MATKEY_MAPPINGMODE_V_BASE = "$tex.mapmodev";
    public static final String _AI_MATKEY_TEXMAP_AXIS_BASE = "$tex.mapaxis";
    public static final String _AI_MATKEY_UVTRANSFORM_BASE = "$tex.uvtrafo";
    public static final String _AI_MATKEY_TEXFLAGS_BASE = "$tex.flags";
    public static final int AI_SCENE_FLAGS_INCOMPLETE = 0x1;
    public static final int AI_SCENE_FLAGS_VALIDATED = 0x2;
    public static final int AI_SCENE_FLAGS_VALIDATION_WARNING = 0x4;
    public static final int AI_SCENE_FLAGS_NON_VERBOSE_FORMAT = 0x8;
    public static final int AI_SCENE_FLAGS_TERRAIN = 0x10;
    public static final int AI_SCENE_FLAGS_ALLOW_SHARED = 0x20;
    public static final int ASSIMP_CFLAGS_SHARED = 0x1;
    public static final int ASSIMP_CFLAGS_STLPORT = 0x2;
    public static final int ASSIMP_CFLAGS_DEBUG = 0x4;
    public static final int ASSIMP_CFLAGS_NOBOOST = 0x8;
    public static final int ASSIMP_CFLAGS_SINGLETHREADED = 0x10;
    public static final int ASSIMP_CFLAGS_DOUBLE_SUPPORT = 0x20;
    public static final String _AI_MATKEY_GLTF_MAPPINGNAME_BASE = "$tex.mappingname";
    public static final String _AI_MATKEY_GLTF_MAPPINGID_BASE = "$tex.mappingid";
    public static final String _AI_MATKEY_GLTF_MAPPINGFILTER_MAG_BASE = "$tex.mappingfiltermag";
    public static final String _AI_MATKEY_GLTF_MAPPINGFILTER_MIN_BASE = "$tex.mappingfiltermin";
    public static final String _AI_MATKEY_GLTF_SCALE_BASE = "$tex.scale";
    public static final String _AI_MATKEY_GLTF_STRENGTH_BASE = "$tex.strength";

    private static final LazyConstant<MethodHandle> AI_GET_IMPORTER_DESC;
    private static final LazyConstant<MethodHandle> AI_IMPORT_FILE;
    private static final LazyConstant<MethodHandle> AI_IMPORT_FILE_EX;
    private static final LazyConstant<MethodHandle> AI_IMPORT_FILE_EX_WITH_PROPERTIES;
    private static final LazyConstant<MethodHandle> AI_IMPORT_FILE_FROM_MEMORY;
    private static final LazyConstant<MethodHandle> AI_IMPORT_FILE_FROM_MEMORY_WITH_PROPERTIES;
    private static final LazyConstant<MethodHandle> AI_APPLY_POST_PROCESSING;
    private static final LazyConstant<MethodHandle> AI_GET_PREDEFINED_LOG_STREAM;
    private static final LazyConstant<MethodHandle> AI_ATTACH_LOG_STREAM;
    private static final LazyConstant<MethodHandle> AI_ENABLE_VERBOSE_LOGGING;
    private static final LazyConstant<MethodHandle> AI_DETACH_LOG_STREAM;
    private static final LazyConstant<MethodHandle> AI_DETACH_ALL_LOG_STREAMS;
    private static final LazyConstant<MethodHandle> AI_RELEASE_IMPORT;
    private static final LazyConstant<MethodHandle> AI_GET_ERROR_STRING;
    private static final LazyConstant<MethodHandle> AI_IS_EXTENSION_SUPPORTED;
    private static final LazyConstant<MethodHandle> AI_GET_EXTENSION_LIST;
    private static final LazyConstant<MethodHandle> AI_GET_MEMORY_REQUIREMENTS;
    private static final LazyConstant<MethodHandle> AI_GET_EMBEDDED_TEXTURE;
    private static final LazyConstant<MethodHandle> AI_CREATE_PROPERTY_STORE;
    private static final LazyConstant<MethodHandle> AI_RELEASE_PROPERTY_STORE;
    private static final LazyConstant<MethodHandle> AI_SET_IMPORT_PROPERTY_INTEGER;
    private static final LazyConstant<MethodHandle> AI_SET_IMPORT_PROPERTY_FLOAT;
    private static final LazyConstant<MethodHandle> AI_SET_IMPORT_PROPERTY_STRING;
    private static final LazyConstant<MethodHandle> AI_SET_IMPORT_PROPERTY_MATRIX;
    private static final LazyConstant<MethodHandle> AI_CREATE_QUATERNION_FROM_MATRIX;
    private static final LazyConstant<MethodHandle> AI_DECOMPOSE_MATRIX;
    private static final LazyConstant<MethodHandle> AI_TRANSPOSE_MATRIX4;
    private static final LazyConstant<MethodHandle> AI_TRANSPOSE_MATRIX3;
    private static final LazyConstant<MethodHandle> AI_TRANSFORM_VEC_BY_MATRIX3;
    private static final LazyConstant<MethodHandle> AI_TRANSFORM_VEC_BY_MATRIX4;
    private static final LazyConstant<MethodHandle> AI_MULTIPLY_MATRIX4;
    private static final LazyConstant<MethodHandle> AI_MULTIPLY_MATRIX3;
    private static final LazyConstant<MethodHandle> AI_IDENTITY_MATRIX3;
    private static final LazyConstant<MethodHandle> AI_IDENTITY_MATRIX4;
    private static final LazyConstant<MethodHandle> AI_GET_IMPORT_FORMAT_COUNT;
    private static final LazyConstant<MethodHandle> AI_GET_IMPORT_FORMAT_DESCRIPTION;
    private static final LazyConstant<MethodHandle> AI_VECTOR2_ARE_EQUAL;
    private static final LazyConstant<MethodHandle> AI_VECTOR2_ARE_EQUAL_EPSILON;
    private static final LazyConstant<MethodHandle> AI_VECTOR2_ADD;
    private static final LazyConstant<MethodHandle> AI_VECTOR2_SUBTRACT;
    private static final LazyConstant<MethodHandle> AI_VECTOR2_SCALE;
    private static final LazyConstant<MethodHandle> AI_VECTOR2_SYM_MUL;
    private static final LazyConstant<MethodHandle> AI_VECTOR2_DIVIDE_BY_SCALAR;
    private static final LazyConstant<MethodHandle> AI_VECTOR2_DIVIDE_BY_VECTOR;
    private static final LazyConstant<MethodHandle> AI_VECTOR2_LENGTH;
    private static final LazyConstant<MethodHandle> AI_VECTOR2_SQUARE_LENGTH;
    private static final LazyConstant<MethodHandle> AI_VECTOR2_NEGATE;
    private static final LazyConstant<MethodHandle> AI_VECTOR2_DOT_PRODUCT;
    private static final LazyConstant<MethodHandle> AI_VECTOR2_NORMALIZE;
    private static final LazyConstant<MethodHandle> AI_VECTOR3_ARE_EQUAL;
    private static final LazyConstant<MethodHandle> AI_VECTOR3_ARE_EQUAL_EPSILON;
    private static final LazyConstant<MethodHandle> AI_VECTOR3_LESS_THAN;
    private static final LazyConstant<MethodHandle> AI_VECTOR3_ADD;
    private static final LazyConstant<MethodHandle> AI_VECTOR3_SUBTRACT;
    private static final LazyConstant<MethodHandle> AI_VECTOR3_SCALE;
    private static final LazyConstant<MethodHandle> AI_VECTOR3_SYM_MUL;
    private static final LazyConstant<MethodHandle> AI_VECTOR3_DIVIDE_BY_SCALAR;
    private static final LazyConstant<MethodHandle> AI_VECTOR3_DIVIDE_BY_VECTOR;
    private static final LazyConstant<MethodHandle> AI_VECTOR3_LENGTH;
    private static final LazyConstant<MethodHandle> AI_VECTOR3_SQUARE_LENGTH;
    private static final LazyConstant<MethodHandle> AI_VECTOR3_NEGATE;
    private static final LazyConstant<MethodHandle> AI_VECTOR3_DOT_PRODUCT;
    private static final LazyConstant<MethodHandle> AI_VECTOR3_CROSS_PRODUCT;
    private static final LazyConstant<MethodHandle> AI_VECTOR3_NORMALIZE;
    private static final LazyConstant<MethodHandle> AI_VECTOR3_NORMALIZE_SAFE;
    private static final LazyConstant<MethodHandle> AI_VECTOR3_ROTATE_BY_QUATERNION;
    private static final LazyConstant<MethodHandle> AI_MATRIX3_FROM_MATRIX4;
    private static final LazyConstant<MethodHandle> AI_MATRIX3_FROM_QUATERNION;
    private static final LazyConstant<MethodHandle> AI_MATRIX3_ARE_EQUAL;
    private static final LazyConstant<MethodHandle> AI_MATRIX3_ARE_EQUAL_EPSILON;
    private static final LazyConstant<MethodHandle> AI_MATRIX3_INVERSE;
    private static final LazyConstant<MethodHandle> AI_MATRIX3_DETERMINANT;
    private static final LazyConstant<MethodHandle> AI_MATRIX3_ROTATION_Z;
    private static final LazyConstant<MethodHandle> AI_MATRIX3_FROM_ROTATION_AROUND_AXIS;
    private static final LazyConstant<MethodHandle> AI_MATRIX3_TRANSLATION;
    private static final LazyConstant<MethodHandle> AI_MATRIX3_FROM_TO;
    private static final LazyConstant<MethodHandle> AI_MATRIX4_FROM_MATRIX3;
    private static final LazyConstant<MethodHandle> AI_MATRIX4_FROM_SCALING_QUATERNION_POSITION;
    private static final LazyConstant<MethodHandle> AI_MATRIX4_ADD;
    private static final LazyConstant<MethodHandle> AI_MATRIX4_ARE_EQUAL;
    private static final LazyConstant<MethodHandle> AI_MATRIX4_ARE_EQUAL_EPSILON;
    private static final LazyConstant<MethodHandle> AI_MATRIX4_INVERSE;
    private static final LazyConstant<MethodHandle> AI_MATRIX4_DETERMINANT;
    private static final LazyConstant<MethodHandle> AI_MATRIX4_IS_IDENTITY;
    private static final LazyConstant<MethodHandle> AI_MATRIX4_DECOMPOSE_INTO_SCALING_EULER_ANGLES_POSITION;
    private static final LazyConstant<MethodHandle> AI_MATRIX4_DECOMPOSE_INTO_SCALING_AXIS_ANGLE_POSITION;
    private static final LazyConstant<MethodHandle> AI_MATRIX4_DECOMPOSE_NO_SCALING;
    private static final LazyConstant<MethodHandle> AI_MATRIX4_FROM_EULER_ANGLES;
    private static final LazyConstant<MethodHandle> AI_MATRIX4_ROTATION_X;
    private static final LazyConstant<MethodHandle> AI_MATRIX4_ROTATION_Y;
    private static final LazyConstant<MethodHandle> AI_MATRIX4_ROTATION_Z;
    private static final LazyConstant<MethodHandle> AI_MATRIX4_FROM_ROTATION_AROUND_AXIS;
    private static final LazyConstant<MethodHandle> AI_MATRIX4_TRANSLATION;
    private static final LazyConstant<MethodHandle> AI_MATRIX4_SCALING;
    private static final LazyConstant<MethodHandle> AI_MATRIX4_FROM_TO;
    private static final LazyConstant<MethodHandle> AI_QUATERNION_FROM_EULER_ANGLES;
    private static final LazyConstant<MethodHandle> AI_QUATERNION_FROM_AXIS_ANGLE;
    private static final LazyConstant<MethodHandle> AI_QUATERNION_FROM_NORMALIZED_QUATERNION;
    private static final LazyConstant<MethodHandle> AI_QUATERNION_ARE_EQUAL;
    private static final LazyConstant<MethodHandle> AI_QUATERNION_ARE_EQUAL_EPSILON;
    private static final LazyConstant<MethodHandle> AI_QUATERNION_NORMALIZE;
    private static final LazyConstant<MethodHandle> AI_QUATERNION_CONJUGATE;
    private static final LazyConstant<MethodHandle> AI_QUATERNION_MULTIPLY;
    private static final LazyConstant<MethodHandle> AI_QUATERNION_INTERPOLATE;
    private static final LazyConstant<MethodHandle> AI_TEXTURE_TYPE_TO_STRING;
    private static final LazyConstant<MethodHandle> AI_GET_MATERIAL_PROPERTY;
    private static final LazyConstant<MethodHandle> AI_GET_MATERIAL_FLOAT_ARRAY;
    private static final LazyConstant<MethodHandle> AI_GET_MATERIAL_INTEGER_ARRAY;
    private static final LazyConstant<MethodHandle> AI_GET_MATERIAL_COLOR;
    private static final LazyConstant<MethodHandle> AI_GET_MATERIAL_UVTRANSFORM;
    private static final LazyConstant<MethodHandle> AI_GET_MATERIAL_STRING;
    private static final LazyConstant<MethodHandle> AI_GET_MATERIAL_TEXTURE_COUNT;
    private static final LazyConstant<MethodHandle> AI_GET_MATERIAL_TEXTURE;
    private static final LazyConstant<MethodHandle> AI_GET_LEGAL_STRING;
    private static final LazyConstant<MethodHandle> AI_GET_VERSION_PATCH;
    private static final LazyConstant<MethodHandle> AI_GET_VERSION_MINOR;
    private static final LazyConstant<MethodHandle> AI_GET_VERSION_MAJOR;
    private static final LazyConstant<MethodHandle> AI_GET_VERSION_REVISION;
    private static final LazyConstant<MethodHandle> AI_GET_BRANCH_NAME;
    private static final LazyConstant<MethodHandle> AI_GET_COMPILE_FLAGS;

    static {
        //@formatter:off
        AI_GET_IMPORTER_DESC = downcallHandle("aiGetImporterDesc", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        AI_IMPORT_FILE = downcallHandle("aiImportFile", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
        AI_IMPORT_FILE_EX = downcallHandle("aiImportFileEx", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
        AI_IMPORT_FILE_EX_WITH_PROPERTIES = downcallHandle("aiImportFileExWithProperties", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        AI_IMPORT_FILE_FROM_MEMORY = downcallHandle("aiImportFileFromMemory", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
        AI_IMPORT_FILE_FROM_MEMORY_WITH_PROPERTIES = downcallHandle("aiImportFileFromMemoryWithProperties", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        AI_APPLY_POST_PROCESSING = downcallHandle("aiApplyPostProcessing", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
        AI_GET_PREDEFINED_LOG_STREAM = downcallHandle("aiGetPredefinedLogStream", AiLogStream.LAYOUT, JAVA_INT, UNBOUNDED_ADDRESS);
        AI_ATTACH_LOG_STREAM = downcallHandleVoid("aiAttachLogStream", UNBOUNDED_ADDRESS);
        AI_ENABLE_VERBOSE_LOGGING = downcallHandleVoid("aiEnableVerboseLogging", JAVA_INT);
        AI_DETACH_LOG_STREAM = downcallHandle("aiDetachLogStream", JAVA_INT, UNBOUNDED_ADDRESS);
        AI_DETACH_ALL_LOG_STREAMS = downcallHandleVoid("aiDetachAllLogStreams");
        AI_RELEASE_IMPORT = downcallHandleVoid("aiReleaseImport", UNBOUNDED_ADDRESS);
        AI_GET_ERROR_STRING = downcallHandle("aiGetErrorString", UNBOUNDED_ADDRESS);
        AI_IS_EXTENSION_SUPPORTED = downcallHandle("aiIsExtensionSupported", JAVA_INT, UNBOUNDED_ADDRESS);
        AI_GET_EXTENSION_LIST = downcallHandleVoid("aiGetExtensionList", UNBOUNDED_ADDRESS);
        AI_GET_MEMORY_REQUIREMENTS = downcallHandleVoid("aiGetMemoryRequirements", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        AI_GET_EMBEDDED_TEXTURE = downcallHandle("aiGetEmbeddedTexture", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        AI_CREATE_PROPERTY_STORE = downcallHandle("aiCreatePropertyStore", UNBOUNDED_ADDRESS);
        AI_RELEASE_PROPERTY_STORE = downcallHandleVoid("aiReleasePropertyStore", UNBOUNDED_ADDRESS);
        AI_SET_IMPORT_PROPERTY_INTEGER = downcallHandleVoid("aiSetImportPropertyInteger", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
        AI_SET_IMPORT_PROPERTY_FLOAT = downcallHandleVoid("aiSetImportPropertyFloat", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT);
        AI_SET_IMPORT_PROPERTY_STRING = downcallHandleVoid("aiSetImportPropertyString", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        AI_SET_IMPORT_PROPERTY_MATRIX = downcallHandleVoid("aiSetImportPropertyMatrix", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        AI_CREATE_QUATERNION_FROM_MATRIX = downcallHandleVoid("aiCreateQuaternionFromMatrix", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        AI_DECOMPOSE_MATRIX = downcallHandleVoid("aiDecomposeMatrix", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        AI_TRANSPOSE_MATRIX4 = downcallHandleVoid("aiTransposeMatrix4", UNBOUNDED_ADDRESS);
        AI_TRANSPOSE_MATRIX3 = downcallHandleVoid("aiTransposeMatrix3", UNBOUNDED_ADDRESS);
        AI_TRANSFORM_VEC_BY_MATRIX3 = downcallHandleVoid("aiTransformVecByMatrix3", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        AI_TRANSFORM_VEC_BY_MATRIX4 = downcallHandleVoid("aiTransformVecByMatrix4", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        AI_MULTIPLY_MATRIX4 = downcallHandleVoid("aiMultiplyMatrix4", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        AI_MULTIPLY_MATRIX3 = downcallHandleVoid("aiMultiplyMatrix3", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        AI_IDENTITY_MATRIX3 = downcallHandleVoid("aiIdentityMatrix3", UNBOUNDED_ADDRESS);
        AI_IDENTITY_MATRIX4 = downcallHandleVoid("aiIdentityMatrix4", UNBOUNDED_ADDRESS);
        AI_GET_IMPORT_FORMAT_COUNT = downcallHandle("aiGetImportFormatCount", JAVA_LONG);
        AI_GET_IMPORT_FORMAT_DESCRIPTION = downcallHandle("aiGetImportFormatDescription", UNBOUNDED_ADDRESS, JAVA_LONG);
        AI_VECTOR2_ARE_EQUAL = downcallHandle("aiVector2AreEqual", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        AI_VECTOR2_ARE_EQUAL_EPSILON = downcallHandle("aiVector2AreEqualEpsilon", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT);
        AI_VECTOR2_ADD = downcallHandleVoid("aiVector2Add", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        AI_VECTOR2_SUBTRACT = downcallHandleVoid("aiVector2Subtract", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        AI_VECTOR2_SCALE = downcallHandleVoid("aiVector2Scale", UNBOUNDED_ADDRESS, JAVA_FLOAT);
        AI_VECTOR2_SYM_MUL = downcallHandleVoid("aiVector2SymMul", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        AI_VECTOR2_DIVIDE_BY_SCALAR = downcallHandleVoid("aiVector2DivideByScalar", UNBOUNDED_ADDRESS, JAVA_FLOAT);
        AI_VECTOR2_DIVIDE_BY_VECTOR = downcallHandleVoid("aiVector2DivideByVector", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        AI_VECTOR2_LENGTH = downcallHandle("aiVector2Length", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        AI_VECTOR2_SQUARE_LENGTH = downcallHandle("aiVector2SquareLength", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        AI_VECTOR2_NEGATE = downcallHandleVoid("aiVector2Negate", UNBOUNDED_ADDRESS);
        AI_VECTOR2_DOT_PRODUCT = downcallHandle("aiVector2DotProduct", JAVA_FLOAT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        AI_VECTOR2_NORMALIZE = downcallHandleVoid("aiVector2Normalize", UNBOUNDED_ADDRESS);
        AI_VECTOR3_ARE_EQUAL = downcallHandle("aiVector3AreEqual", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        AI_VECTOR3_ARE_EQUAL_EPSILON = downcallHandle("aiVector3AreEqualEpsilon", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT);
        AI_VECTOR3_LESS_THAN = downcallHandle("aiVector3LessThan", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        AI_VECTOR3_ADD = downcallHandleVoid("aiVector3Add", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        AI_VECTOR3_SUBTRACT = downcallHandleVoid("aiVector3Subtract", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        AI_VECTOR3_SCALE = downcallHandleVoid("aiVector3Scale", UNBOUNDED_ADDRESS, JAVA_FLOAT);
        AI_VECTOR3_SYM_MUL = downcallHandleVoid("aiVector3SymMul", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        AI_VECTOR3_DIVIDE_BY_SCALAR = downcallHandleVoid("aiVector3DivideByScalar", UNBOUNDED_ADDRESS, JAVA_FLOAT);
        AI_VECTOR3_DIVIDE_BY_VECTOR = downcallHandleVoid("aiVector3DivideByVector", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        AI_VECTOR3_LENGTH = downcallHandle("aiVector3Length", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        AI_VECTOR3_SQUARE_LENGTH = downcallHandle("aiVector3SquareLength", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        AI_VECTOR3_NEGATE = downcallHandleVoid("aiVector3Negate", UNBOUNDED_ADDRESS);
        AI_VECTOR3_DOT_PRODUCT = downcallHandle("aiVector3DotProduct", JAVA_FLOAT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        AI_VECTOR3_CROSS_PRODUCT = downcallHandleVoid("aiVector3CrossProduct", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        AI_VECTOR3_NORMALIZE = downcallHandleVoid("aiVector3Normalize", UNBOUNDED_ADDRESS);
        AI_VECTOR3_NORMALIZE_SAFE = downcallHandleVoid("aiVector3NormalizeSafe", UNBOUNDED_ADDRESS);
        AI_VECTOR3_ROTATE_BY_QUATERNION = downcallHandleVoid("aiVector3RotateByQuaternion", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        AI_MATRIX3_FROM_MATRIX4 = downcallHandleVoid("aiMatrix3FromMatrix4", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        AI_MATRIX3_FROM_QUATERNION = downcallHandleVoid("aiMatrix3FromQuaternion", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        AI_MATRIX3_ARE_EQUAL = downcallHandle("aiMatrix3AreEqual", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        AI_MATRIX3_ARE_EQUAL_EPSILON = downcallHandle("aiMatrix3AreEqualEpsilon", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT);
        AI_MATRIX3_INVERSE = downcallHandleVoid("aiMatrix3Inverse", UNBOUNDED_ADDRESS);
        AI_MATRIX3_DETERMINANT = downcallHandle("aiMatrix3Determinant", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        AI_MATRIX3_ROTATION_Z = downcallHandleVoid("aiMatrix3RotationZ", UNBOUNDED_ADDRESS, JAVA_FLOAT);
        AI_MATRIX3_FROM_ROTATION_AROUND_AXIS = downcallHandleVoid("aiMatrix3FromRotationAroundAxis", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT);
        AI_MATRIX3_TRANSLATION = downcallHandleVoid("aiMatrix3Translation", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        AI_MATRIX3_FROM_TO = downcallHandleVoid("aiMatrix3FromTo", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        AI_MATRIX4_FROM_MATRIX3 = downcallHandleVoid("aiMatrix4FromMatrix3", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        AI_MATRIX4_FROM_SCALING_QUATERNION_POSITION = downcallHandleVoid("aiMatrix4FromScalingQuaternionPosition", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        AI_MATRIX4_ADD = downcallHandleVoid("aiMatrix4Add", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        AI_MATRIX4_ARE_EQUAL = downcallHandle("aiMatrix4AreEqual", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        AI_MATRIX4_ARE_EQUAL_EPSILON = downcallHandle("aiMatrix4AreEqualEpsilon", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT);
        AI_MATRIX4_INVERSE = downcallHandleVoid("aiMatrix4Inverse", UNBOUNDED_ADDRESS);
        AI_MATRIX4_DETERMINANT = downcallHandle("aiMatrix4Determinant", JAVA_FLOAT, UNBOUNDED_ADDRESS);
        AI_MATRIX4_IS_IDENTITY = downcallHandle("aiMatrix4IsIdentity", JAVA_INT, UNBOUNDED_ADDRESS);
        AI_MATRIX4_DECOMPOSE_INTO_SCALING_EULER_ANGLES_POSITION = downcallHandleVoid("aiMatrix4DecomposeIntoScalingEulerAnglesPosition", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        AI_MATRIX4_DECOMPOSE_INTO_SCALING_AXIS_ANGLE_POSITION = downcallHandleVoid("aiMatrix4DecomposeIntoScalingAxisAnglePosition", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        AI_MATRIX4_DECOMPOSE_NO_SCALING = downcallHandleVoid("aiMatrix4DecomposeNoScaling", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        AI_MATRIX4_FROM_EULER_ANGLES = downcallHandleVoid("aiMatrix4FromEulerAngles", UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT);
        AI_MATRIX4_ROTATION_X = downcallHandleVoid("aiMatrix4RotationX", UNBOUNDED_ADDRESS, JAVA_FLOAT);
        AI_MATRIX4_ROTATION_Y = downcallHandleVoid("aiMatrix4RotationY", UNBOUNDED_ADDRESS, JAVA_FLOAT);
        AI_MATRIX4_ROTATION_Z = downcallHandleVoid("aiMatrix4RotationZ", UNBOUNDED_ADDRESS, JAVA_FLOAT);
        AI_MATRIX4_FROM_ROTATION_AROUND_AXIS = downcallHandleVoid("aiMatrix4FromRotationAroundAxis", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT);
        AI_MATRIX4_TRANSLATION = downcallHandleVoid("aiMatrix4Translation", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        AI_MATRIX4_SCALING = downcallHandleVoid("aiMatrix4Scaling", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        AI_MATRIX4_FROM_TO = downcallHandleVoid("aiMatrix4FromTo", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        AI_QUATERNION_FROM_EULER_ANGLES = downcallHandleVoid("aiQuaternionFromEulerAngles", UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT);
        AI_QUATERNION_FROM_AXIS_ANGLE = downcallHandleVoid("aiQuaternionFromAxisAngle", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT);
        AI_QUATERNION_FROM_NORMALIZED_QUATERNION = downcallHandleVoid("aiQuaternionFromNormalizedQuaternion", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        AI_QUATERNION_ARE_EQUAL = downcallHandle("aiQuaternionAreEqual", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        AI_QUATERNION_ARE_EQUAL_EPSILON = downcallHandle("aiQuaternionAreEqualEpsilon", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT);
        AI_QUATERNION_NORMALIZE = downcallHandleVoid("aiQuaternionNormalize", UNBOUNDED_ADDRESS);
        AI_QUATERNION_CONJUGATE = downcallHandleVoid("aiQuaternionConjugate", UNBOUNDED_ADDRESS);
        AI_QUATERNION_MULTIPLY = downcallHandleVoid("aiQuaternionMultiply", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        AI_QUATERNION_INTERPOLATE = downcallHandleVoid("aiQuaternionInterpolate", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT);
        AI_TEXTURE_TYPE_TO_STRING = downcallHandle("aiTextureTypeToString", UNBOUNDED_ADDRESS, JAVA_INT);
        AI_GET_MATERIAL_PROPERTY = downcallHandle("aiGetMaterialProperty", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
        AI_GET_MATERIAL_FLOAT_ARRAY = downcallHandle("aiGetMaterialFloatArray", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        AI_GET_MATERIAL_INTEGER_ARRAY = downcallHandle("aiGetMaterialIntegerArray", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        AI_GET_MATERIAL_COLOR = downcallHandle("aiGetMaterialColor", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
        AI_GET_MATERIAL_UVTRANSFORM = downcallHandle("aiGetMaterialUVTransform", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
        AI_GET_MATERIAL_STRING = downcallHandle("aiGetMaterialString", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
        AI_GET_MATERIAL_TEXTURE_COUNT = downcallHandle("aiGetMaterialTextureCount", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT);
        AI_GET_MATERIAL_TEXTURE = downcallHandle("aiGetMaterialTexture", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        AI_GET_LEGAL_STRING = downcallHandle("aiGetLegalString", UNBOUNDED_ADDRESS);
        AI_GET_VERSION_PATCH = downcallHandle("aiGetVersionPatch", JAVA_INT);
        AI_GET_VERSION_MINOR = downcallHandle("aiGetVersionMinor", JAVA_INT);
        AI_GET_VERSION_MAJOR = downcallHandle("aiGetVersionMajor", JAVA_INT);
        AI_GET_VERSION_REVISION = downcallHandle("aiGetVersionRevision", JAVA_INT);
        AI_GET_BRANCH_NAME = downcallHandle("aiGetBranchName", UNBOUNDED_ADDRESS);
        AI_GET_COMPILE_FLAGS = downcallHandle("aiGetCompileFlags", JAVA_INT);
        //@formatter:on
    }

    private Assimp() {
    }

    /// ```
    /// \brief  Returns the Importer description for a given extension.
    /// 
    /// Will return a nullptr if no assigned importer desc. was found for the given extension
    ///     \param  extension   [in] The extension to look for
    ///     \return A pointer showing to the ImporterDesc, \see aiImporterDesc.
    /// ```
    public static MemorySegment aiGetImporterDesc(
    	MemorySegment extension
    ) {
    	MethodHandle method = AI_GET_IMPORTER_DESC.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			extension
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aiGetImporterDesc].
    public static @Nullable AiImporterDesc aiGetImporterDesc(
    	String extension
    ) {
    	try (Arena arena = MemoryStack.stackPush()) {
    		MemorySegment segment = aiGetImporterDesc(
    			arena.allocateFrom(extension)
    		);
    
    		if (segment.equals(MemorySegment.NULL))
    			return null;
    		
    		return new AiImporterDesc(segment);
    	}
    }
    
    /// ```
    /// Reads the given file and returns its content.
    /// 
    /// If the call succeeds, the imported data is returned in an aiScene structure.
    /// The data is intended to be read-only, it stays property of the ASSIMP
    /// library and will be stable until aiReleaseImport() is called. After you're
    /// done with it, call aiReleaseImport() to free the resources associated with
    /// this file. If the import fails, NULL is returned instead. Call
    /// aiGetErrorString() to retrieve a human-readable error text.
    /// @param pFile Path and filename of the file to be imported,
    /// expected to be a null-terminated c-string. NULL is not a valid value.
    /// @param pFlags Optional post processing steps to be executed after
    /// a successful import. Provide a bitwise combination of the
    /// #aiPostProcessSteps flags.
    /// @return Pointer to the imported data or NULL if the import failed.
    /// ```
    public static MemorySegment aiImportFile(
    	MemorySegment pFile,
    	int pFlags
    ) {
    	MethodHandle method = AI_IMPORT_FILE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			pFile,
    			pFlags
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aiImportFile].
    public static @Nullable AiScene aiImportFile(
    	String pFile,
    	int pFlags
    ) {
    	try (Arena arena = MemoryStack.stackPush()) {
    		MemorySegment segment = aiImportFile(
    			arena.allocateFrom(pFile),
    			pFlags
    		);
    
    		if (segment.equals(MemorySegment.NULL))
    			return null;
    		
    		return new AiScene(segment);
    	}
    }
    
    /// ```
    /// Reads the given file using user-defined I/O functions and returns
    /// its content.
    /// 
    /// If the call succeeds, the imported data is returned in an aiScene structure.
    /// The data is intended to be read-only, it stays property of the ASSIMP
    /// library and will be stable until aiReleaseImport() is called. After you're
    /// done with it, call aiReleaseImport() to free the resources associated with
    /// this file. If the import fails, NULL is returned instead. Call
    /// aiGetErrorString() to retrieve a human-readable error text.
    /// @param pFile Path and filename of the file to be imported,
    /// expected to be a null-terminated c-string. NULL is not a valid value.
    /// @param pFlags Optional post processing steps to be executed after
    /// a successful import. Provide a bitwise combination of the
    /// #aiPostProcessSteps flags.
    /// @param pFS aiFileIO structure. Will be used to open the model file itself
    /// and any other files the loader needs to open.  Pass NULL to use the default
    /// implementation.
    /// @return Pointer to the imported data or NULL if the import failed.
    /// @note Include <aiFileIO.h> for the definition of #aiFileIO.
    /// ```
    public static MemorySegment aiImportFileEx(
    	MemorySegment pFile,
    	int pFlags,
    	MemorySegment pFS
    ) {
    	MethodHandle method = AI_IMPORT_FILE_EX.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			pFile,
    			pFlags,
    			pFS
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aiImportFileEx].
    public static @Nullable AiScene aiImportFileEx(
    	String pFile,
    	int pFlags,
    	AiFileIO pFS
    ) {
    	try (Arena arena = MemoryStack.stackPush()) {
    		MemorySegment segment = aiImportFileEx(
    			arena.allocateFrom(pFile),
    			pFlags,
    			pFS.memorySegment()
    		);
    
    		if (segment.equals(MemorySegment.NULL))
    			return null;
    		
    		return new AiScene(segment);
    	}
    }
    
    /// ```
    /// Same as #aiImportFileEx, but adds an extra parameter containing importer settings.
    /// 
    /// @param pFile Path and filename of the file to be imported,
    /// expected to be a null-terminated c-string. NULL is not a valid value.
    /// @param pFlags Optional post processing steps to be executed after
    /// a successful import. Provide a bitwise combination of the
    /// #aiPostProcessSteps flags.
    /// @param pFS aiFileIO structure. Will be used to open the model file itself
    /// and any other files the loader needs to open.  Pass NULL to use the default
    /// implementation.
    /// @param pProps #aiPropertyStore instance containing import settings.
    /// @return Pointer to the imported data or NULL if the import failed.
    /// @note Include <aiFileIO.h> for the definition of #aiFileIO.
    /// @see aiImportFileEx
    /// ```
    public static MemorySegment aiImportFileExWithProperties(
    	MemorySegment pFile,
    	int pFlags,
    	MemorySegment pFS,
    	MemorySegment pProps
    ) {
    	MethodHandle method = AI_IMPORT_FILE_EX_WITH_PROPERTIES.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			pFile,
    			pFlags,
    			pFS,
    			pProps
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aiImportFileExWithProperties].
    public static @Nullable AiScene aiImportFileExWithProperties(
    	String pFile,
    	int pFlags,
    	AiFileIO pFS,
    	AiPropertyStore pProps
    ) {
    	try (Arena arena = MemoryStack.stackPush()) {
    		MemorySegment segment = aiImportFileExWithProperties(
    			arena.allocateFrom(pFile),
    			pFlags,
    			pFS.memorySegment(),
    			pProps.memorySegment()
    		);
    
    		if (segment.equals(MemorySegment.NULL))
    			return null;
    		
    		return new AiScene(segment);
    	}
    }
    
    /// ```
    /// Reads the given file from a given memory buffer,
    /// 
    /// If the call succeeds, the imported data is returned in an aiScene structure.
    /// The data is intended to be read-only, it stays property of the ASSIMP
    /// library and will be stable until aiReleaseImport() is called. After you're
    /// done with it, call aiReleaseImport() to free the resources associated with
    /// this file. If the import fails, NULL is returned.
    /// A human-readable error description can be retrieved by calling aiGetErrorString().
    /// @param pBuffer Pointer to the file data
    /// @param pLength Length of pBuffer, in bytes
    /// @param pFlags Optional post processing steps to be executed after
    /// a successful import. Provide a bitwise combination of the
    /// #aiPostProcessSteps flags. If you wish to inspect the imported
    /// scene first in order to fine-tune your post-processing setup,
    /// consider to use #aiApplyPostProcessing().
    /// @param pHint An additional hint to the library. If this is a non empty string,
    /// the library looks for a loader to support the file extension specified by pHint
    /// and passes the file to the first matching loader. If this loader is unable to
    /// completely the request, the library continues and tries to determine the file
    /// format on its own, a task that may or may not be successful.
    /// Check the return value, and you'll know ...
    /// @return A pointer to the imported data, NULL if the import failed.
    /// 
    /// @note This is a straightforward way to decode models from memory
    /// buffers, but it doesn't handle model formats that spread their
    /// data across multiple files or even directories. Examples include
    /// OBJ or MD3, which outsource parts of their material info into
    /// external scripts. If you need full functionality, provide
    /// a custom IOSystem to make Assimp find these files and use
    /// the regular aiImportFileEx()/aiImportFileExWithProperties() API.
    /// ```
    public static MemorySegment aiImportFileFromMemory(
    	MemorySegment pBuffer,
    	int pLength,
    	int pFlags,
    	MemorySegment pHint
    ) {
    	MethodHandle method = AI_IMPORT_FILE_FROM_MEMORY.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			pBuffer,
    			pLength,
    			pFlags,
    			pHint
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aiImportFileFromMemory].
    public static @Nullable AiScene aiImportFileFromMemory(
    	NativeByteArray pBuffer,
    	int pLength,
    	int pFlags,
    	String pHint
    ) {
    	try (Arena arena = MemoryStack.stackPush()) {
    		MemorySegment segment = aiImportFileFromMemory(
    			pBuffer.memorySegment(),
    			pLength,
    			pFlags,
    			arena.allocateFrom(pHint)
    		);
    
    		if (segment.equals(MemorySegment.NULL))
    			return null;
    		
    		return new AiScene(segment);
    	}
    }
    
    /// ```
    /// Same as #aiImportFileFromMemory, but adds an extra parameter containing importer settings.
    /// 
    /// @param pBuffer Pointer to the file data
    /// @param pLength Length of pBuffer, in bytes
    /// @param pFlags Optional post processing steps to be executed after
    /// a successful import. Provide a bitwise combination of the
    /// #aiPostProcessSteps flags. If you wish to inspect the imported
    /// scene first in order to fine-tune your post-processing setup,
    /// consider to use #aiApplyPostProcessing().
    /// @param pHint An additional hint to the library. If this is a non empty string,
    /// the library looks for a loader to support the file extension specified by pHint
    /// and passes the file to the first matching loader. If this loader is unable to
    /// completely the request, the library continues and tries to determine the file
    /// format on its own, a task that may or may not be successful.
    /// Check the return value, and you'll know ...
    /// @param pProps #aiPropertyStore instance containing import settings.
    /// @return A pointer to the imported data, NULL if the import failed.
    /// 
    /// @note This is a straightforward way to decode models from memory
    /// buffers, but it doesn't handle model formats that spread their
    /// data across multiple files or even directories. Examples include
    /// OBJ or MD3, which outsource parts of their material info into
    /// external scripts. If you need full functionality, provide
    /// a custom IOSystem to make Assimp find these files and use
    /// the regular aiImportFileEx()/aiImportFileExWithProperties() API.
    /// @see aiImportFileFromMemory
    /// ```
    public static MemorySegment aiImportFileFromMemoryWithProperties(
    	MemorySegment pBuffer,
    	int pLength,
    	int pFlags,
    	MemorySegment pHint,
    	MemorySegment pProps
    ) {
    	MethodHandle method = AI_IMPORT_FILE_FROM_MEMORY_WITH_PROPERTIES.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			pBuffer,
    			pLength,
    			pFlags,
    			pHint,
    			pProps
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aiImportFileFromMemoryWithProperties].
    public static @Nullable AiScene aiImportFileFromMemoryWithProperties(
    	NativeByteArray pBuffer,
    	int pLength,
    	int pFlags,
    	String pHint,
    	AiPropertyStore pProps
    ) {
    	try (Arena arena = MemoryStack.stackPush()) {
    		MemorySegment segment = aiImportFileFromMemoryWithProperties(
    			pBuffer.memorySegment(),
    			pLength,
    			pFlags,
    			arena.allocateFrom(pHint),
    			pProps.memorySegment()
    		);
    
    		if (segment.equals(MemorySegment.NULL))
    			return null;
    		
    		return new AiScene(segment);
    	}
    }
    
    /// ```
    /// Apply post-processing to an already-imported scene.
    /// 
    /// This is strictly equivalent to calling #aiImportFile()/#aiImportFileEx with the
    /// same flags. However, you can use this separate function to inspect the imported
    /// scene first to fine-tune your post-processing setup.
    /// @param pScene Scene to work on.
    /// @param pFlags Provide a bitwise combination of the #aiPostProcessSteps flags.
    /// @return A pointer to the post-processed data. Post processing is done in-place,
    /// meaning this is still the same #aiScene which you passed for pScene. However,
    /// _if_ post-processing failed, the scene could now be NULL. That's quite a rare
    /// case, post processing steps are not really designed to 'fail'. To be exact,
    /// the #aiProcess_ValidateDataStructure flag is currently the only post processing step
    /// which can actually cause the scene to be reset to NULL.
    /// ```
    public static MemorySegment aiApplyPostProcessing(
    	MemorySegment pScene,
    	int pFlags
    ) {
    	MethodHandle method = AI_APPLY_POST_PROCESSING.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			pScene,
    			pFlags
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aiApplyPostProcessing].
    public static @Nullable AiScene aiApplyPostProcessing(
    	AiScene pScene,
    	int pFlags
    ) {
    	MemorySegment segment = aiApplyPostProcessing(
    		pScene.memorySegment(),
    		pFlags
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new AiScene(segment);
    }
    
    /// ```
    /// Get one of the predefine log streams. This is the quick'n'easy solution to
    /// access Assimp's log system. Attaching a log stream can slightly reduce Assimp's
    /// overall import performance.
    /// 
    /// Usage is rather simple (this will stream the log to a file, named log.txt, and
    /// the stdout stream of the process:
    /// @code
    /// struct aiLogStream c;
    /// c = aiGetPredefinedLogStream(aiDefaultLogStream_FILE,"log.txt");
    /// aiAttachLogStream(&c);
    /// c = aiGetPredefinedLogStream(aiDefaultLogStream_STDOUT,NULL);
    /// aiAttachLogStream(&c);
    /// @endcode
    /// 
    /// @param pStreams One of the #aiDefaultLogStream enumerated values.
    /// @param file Solely for the #aiDefaultLogStream_FILE flag: specifies the file to write to.
    /// Pass NULL for all other flags.
    /// @return The log stream. callback is set to NULL if something went wrong.
    /// ```
    public static MemorySegment aiGetPredefinedLogStream(
    	SegmentAllocator allocator,
    	int pStreams,
    	MemorySegment file
    ) {
    	MethodHandle method = AI_GET_PREDEFINED_LOG_STREAM.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			pStreams,
    			file
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aiGetPredefinedLogStream].
    public static @Nullable AiLogStream aiGetPredefinedLogStream(
    	SegmentAllocator allocator,
    	int pStreams,
    	NativeByteArray file
    ) {
    	MemorySegment segment = aiGetPredefinedLogStream(
    		allocator,
    		pStreams,
    		file.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new AiLogStream(segment);
    }
    
    /// ```
    /// Attach a custom log stream to the libraries' logging system.
    /// 
    /// Attaching a log stream can slightly reduce Assimp's overall import
    /// performance. Multiple log-streams can be attached.
    /// @param stream Describes the new log stream.
    /// @note To ensure proper destruction of the logging system, you need to manually
    /// call aiDetachLogStream() on every single log stream you attach.
    /// Alternatively (for the lazy folks) #aiDetachAllLogStreams is provided.
    /// ```
    public static void aiAttachLogStream(
    	MemorySegment stream
    ) {
    	MethodHandle method = AI_ATTACH_LOG_STREAM.get();
    	try {
    		 method.invokeExact(
    			stream
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aiAttachLogStream].
    public static void aiAttachLogStream(
    	AiLogStream stream
    ) {
    	aiAttachLogStream(
    		stream.memorySegment()
    	);
    }
    
    /// ```
    /// Enable verbose logging. Verbose logging includes debug-related stuff and
    /// detailed import statistics. This can have severe impact on import performance
    /// and memory consumption. However, it might be useful to find out why a file
    /// didn't read correctly.
    /// @param d AI_TRUE or AI_FALSE, your decision.
    /// ```
    public static void aiEnableVerboseLogging(
    	int d
    ) {
    	MethodHandle method = AI_ENABLE_VERBOSE_LOGGING.get();
    	try {
    		 method.invokeExact(
    			d
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Detach a custom log stream from the libraries' logging system.
    /// 
    /// This is the counterpart of #aiAttachLogStream. If you attached a stream,
    /// don't forget to detach it again.
    /// @param stream The log stream to be detached.
    /// @return AI_SUCCESS if the log stream has been detached successfully.
    /// @see aiDetachAllLogStreams
    /// ```
    public static int aiDetachLogStream(
    	MemorySegment stream
    ) {
    	MethodHandle method = AI_DETACH_LOG_STREAM.get();
    	try {
    		return (int) method.invokeExact(
    			stream
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aiDetachLogStream].
    public static int aiDetachLogStream(
    	AiLogStream stream
    ) {
    	return aiDetachLogStream(
    		stream.memorySegment()
    	);
    }
    
    /// ```
    /// Detach all active log streams from the libraries' logging system.
    /// This ensures that the logging system is terminated properly and all
    /// resources allocated by it are actually freed. If you attached a stream,
    /// don't forget to detach it again.
    /// @see aiAttachLogStream
    /// @see aiDetachLogStream
    /// ```
    public static void aiDetachAllLogStreams() {
    	MethodHandle method = AI_DETACH_ALL_LOG_STREAMS.get();
    	try {
    		 method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Releases all resources associated with the given import process.
    /// 
    /// Call this function after you're done with the imported data.
    /// @param pScene The imported data to release. NULL is a valid value.
    /// ```
    public static void aiReleaseImport(
    	MemorySegment pScene
    ) {
    	MethodHandle method = AI_RELEASE_IMPORT.get();
    	try {
    		 method.invokeExact(
    			pScene
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aiReleaseImport].
    public static void aiReleaseImport(
    	AiScene pScene
    ) {
    	aiReleaseImport(
    		pScene.memorySegment()
    	);
    }
    
    /// ```
    /// Returns the error text of the last failed import process.
    /// 
    /// @return A textual description of the error that occurred at the last
    /// import process. NULL if there was no error. There can't be an error if you
    /// got a non-NULL #aiScene from #aiImportFile/#aiImportFileEx/#aiApplyPostProcessing.
    /// ```
    public static MemorySegment naiGetErrorString() {
    	MethodHandle method = AI_GET_ERROR_STRING.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#naiGetErrorString].
    public static @Nullable String aiGetErrorString() {
    	MemorySegment segment = naiGetErrorString();
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    	
    	return segment.getString(0);
    }
    
    /// ```
    /// Returns whether a given file extension is supported by ASSIMP
    /// 
    /// @param szExtension Extension for which the function queries support for.
    /// Must include a leading dot '.'. Example: ".3ds", ".md3"
    /// @return AI_TRUE if the file extension is supported.
    /// ```
    public static int aiIsExtensionSupported(
    	MemorySegment szExtension
    ) {
    	MethodHandle method = AI_IS_EXTENSION_SUPPORTED.get();
    	try {
    		return (int) method.invokeExact(
    			szExtension
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aiIsExtensionSupported].
    public static int aiIsExtensionSupported(
    	String szExtension
    ) {
    	try (Arena arena = MemoryStack.stackPush()) {
    		return aiIsExtensionSupported(
    			arena.allocateFrom(szExtension)
    		);
    	}
    }
    
    /// ```
    /// Get a list of all file extensions supported by ASSIMP.
    /// 
    /// If a file extension is contained in the list this does, of course, not
    /// mean that ASSIMP is able to load all files with this extension.
    /// @param szOut String to receive the extension list.
    /// Format of the list: "*.3ds;*.obj;*.dae". NULL is not a valid parameter.
    /// ```
    public static void aiGetExtensionList(
    	MemorySegment szOut
    ) {
    	MethodHandle method = AI_GET_EXTENSION_LIST.get();
    	try {
    		 method.invokeExact(
    			szOut
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aiGetExtensionList].
    public static void aiGetExtensionList(
    	AiString szOut
    ) {
    	aiGetExtensionList(
    		szOut.memorySegment()
    	);
    }
    
    /// ```
    /// Get the approximated storage required by an imported asset
    /// @param pIn Input asset.
    /// @param in Data structure to be filled.
    /// ```
    public static void aiGetMemoryRequirements(
    	MemorySegment pIn,
    	MemorySegment in
    ) {
    	MethodHandle method = AI_GET_MEMORY_REQUIREMENTS.get();
    	try {
    		 method.invokeExact(
    			pIn,
    			in
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aiGetMemoryRequirements].
    public static void aiGetMemoryRequirements(
    	AiScene pIn,
    	AiMemoryInfo in
    ) {
    	aiGetMemoryRequirements(
    		pIn.memorySegment(),
    		in.memorySegment()
    	);
    }
    
    /// ```
    /// Returns an embedded texture, or nullptr.
    /// @param pIn Input asset.
    /// @param filename Texture path extracted from aiGetMaterialString.
    /// ```
    public static MemorySegment aiGetEmbeddedTexture(
    	MemorySegment pIn,
    	MemorySegment filename
    ) {
    	MethodHandle method = AI_GET_EMBEDDED_TEXTURE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			pIn,
    			filename
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aiGetEmbeddedTexture].
    public static @Nullable AiTexture aiGetEmbeddedTexture(
    	AiScene pIn,
    	String filename
    ) {
    	try (Arena arena = MemoryStack.stackPush()) {
    		MemorySegment segment = aiGetEmbeddedTexture(
    			pIn.memorySegment(),
    			arena.allocateFrom(filename)
    		);
    
    		if (segment.equals(MemorySegment.NULL))
    			return null;
    		
    		return new AiTexture(segment);
    	}
    }
    
    /// ```
    /// Create an empty property store. Property stores are used to collect import
    /// settings.
    /// @return New property store. Property stores need to be manually destroyed using
    /// the #aiReleasePropertyStore API function.
    /// ```
    public static MemorySegment naiCreatePropertyStore() {
    	MethodHandle method = AI_CREATE_PROPERTY_STORE.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#naiCreatePropertyStore].
    public static @Nullable AiPropertyStore aiCreatePropertyStore() {
    	MemorySegment segment = naiCreatePropertyStore();
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    	
    	return new AiPropertyStore(segment);
    }
    
    /// ```
    /// Delete a property store.
    /// @param p Property store to be deleted.
    /// ```
    public static void aiReleasePropertyStore(
    	MemorySegment p
    ) {
    	MethodHandle method = AI_RELEASE_PROPERTY_STORE.get();
    	try {
    		 method.invokeExact(
    			p
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aiReleasePropertyStore].
    public static void aiReleasePropertyStore(
    	AiPropertyStore p
    ) {
    	aiReleasePropertyStore(
    		p.memorySegment()
    	);
    }
    
    /// ```
    /// Set an integer property.
    /// 
    /// This is the C-version of #Assimp::Importer::SetPropertyInteger(). In the C
    /// interface, properties are always shared by all imports. It is not possible to
    /// specify them per import.
    /// 
    /// @param store Store to modify. Use #aiCreatePropertyStore to obtain a store.
    /// @param szName Name of the configuration property to be set. All supported
    /// public properties are defined in the config.h header file (AI_CONFIG_XXX).
    /// @param value New value for the property
    /// ```
    public static void aiSetImportPropertyInteger(
    	MemorySegment store,
    	MemorySegment szName,
    	int value
    ) {
    	MethodHandle method = AI_SET_IMPORT_PROPERTY_INTEGER.get();
    	try {
    		 method.invokeExact(
    			store,
    			szName,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aiSetImportPropertyInteger].
    public static void aiSetImportPropertyInteger(
    	AiPropertyStore store,
    	String szName,
    	int value
    ) {
    	try (Arena arena = MemoryStack.stackPush()) {
    		aiSetImportPropertyInteger(
    			store.memorySegment(),
    			arena.allocateFrom(szName),
    			value
    		);
    	}
    }
    
    /// ```
    /// Set a floating-point property.
    /// 
    /// This is the C-version of #Assimp::Importer::SetPropertyFloat(). In the C
    /// interface, properties are always shared by all imports. It is not possible to
    /// specify them per import.
    /// 
    /// @param store Store to modify. Use #aiCreatePropertyStore to obtain a store.
    /// @param szName Name of the configuration property to be set. All supported
    /// public properties are defined in the config.h header file (AI_CONFIG_XXX).
    /// @param value New value for the property
    /// ```
    public static void aiSetImportPropertyFloat(
    	MemorySegment store,
    	MemorySegment szName,
    	float value
    ) {
    	MethodHandle method = AI_SET_IMPORT_PROPERTY_FLOAT.get();
    	try {
    		 method.invokeExact(
    			store,
    			szName,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aiSetImportPropertyFloat].
    public static void aiSetImportPropertyFloat(
    	AiPropertyStore store,
    	String szName,
    	float value
    ) {
    	try (Arena arena = MemoryStack.stackPush()) {
    		aiSetImportPropertyFloat(
    			store.memorySegment(),
    			arena.allocateFrom(szName),
    			value
    		);
    	}
    }
    
    /// ```
    /// Set a string property.
    /// 
    /// This is the C-version of #Assimp::Importer::SetPropertyString(). In the C
    /// interface, properties are always shared by all imports. It is not possible to
    /// specify them per import.
    /// 
    /// @param store Store to modify. Use #aiCreatePropertyStore to obtain a store.
    /// @param szName Name of the configuration property to be set. All supported
    /// public properties are defined in the config.h header file (AI_CONFIG_XXX).
    /// @param st New value for the property
    /// ```
    public static void aiSetImportPropertyString(
    	MemorySegment store,
    	MemorySegment szName,
    	MemorySegment st
    ) {
    	MethodHandle method = AI_SET_IMPORT_PROPERTY_STRING.get();
    	try {
    		 method.invokeExact(
    			store,
    			szName,
    			st
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aiSetImportPropertyString].
    public static void aiSetImportPropertyString(
    	AiPropertyStore store,
    	String szName,
    	AiString st
    ) {
    	try (Arena arena = MemoryStack.stackPush()) {
    		aiSetImportPropertyString(
    			store.memorySegment(),
    			arena.allocateFrom(szName),
    			st.memorySegment()
    		);
    	}
    }
    
    /// ```
    /// Set a matrix property.
    /// 
    /// This is the C-version of #Assimp::Importer::SetPropertyMatrix(). In the C
    /// interface, properties are always shared by all imports. It is not possible to
    /// specify them per import.
    /// 
    /// @param store Store to modify. Use #aiCreatePropertyStore to obtain a store.
    /// @param szName Name of the configuration property to be set. All supported
    /// public properties are defined in the config.h header file (AI_CONFIG_XXX).
    /// @param mat New value for the property
    /// ```
    public static void aiSetImportPropertyMatrix(
    	MemorySegment store,
    	MemorySegment szName,
    	MemorySegment mat
    ) {
    	MethodHandle method = AI_SET_IMPORT_PROPERTY_MATRIX.get();
    	try {
    		 method.invokeExact(
    			store,
    			szName,
    			mat
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aiSetImportPropertyMatrix].
    public static void aiSetImportPropertyMatrix(
    	AiPropertyStore store,
    	String szName,
    	AiMatrix4x4 mat
    ) {
    	try (Arena arena = MemoryStack.stackPush()) {
    		aiSetImportPropertyMatrix(
    			store.memorySegment(),
    			arena.allocateFrom(szName),
    			mat.memorySegment()
    		);
    	}
    }
    
    /// ```
    /// Construct a quaternion from a 3x3 rotation matrix.
    /// @param quat Receives the output quaternion.
    /// @param mat Matrix to 'quaternionize'.
    /// @see aiQuaternion(const aiMatrix3x3& pRotMatrix)
    /// ```
    public static void aiCreateQuaternionFromMatrix(
    	MemorySegment quat,
    	MemorySegment mat
    ) {
    	MethodHandle method = AI_CREATE_QUATERNION_FROM_MATRIX.get();
    	try {
    		 method.invokeExact(
    			quat,
    			mat
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aiCreateQuaternionFromMatrix].
    public static void aiCreateQuaternionFromMatrix(
    	AiQuaternion quat,
    	AiMatrix3x3 mat
    ) {
    	aiCreateQuaternionFromMatrix(
    		quat.memorySegment(),
    		mat.memorySegment()
    	);
    }
    
    /// ```
    /// Decompose a transformation matrix into its rotational, translational and
    /// scaling components.
    /// 
    /// @param mat Matrix to decompose
    /// @param scaling Receives the scaling component
    /// @param rotation Receives the rotational component
    /// @param position Receives the translational component.
    /// @see aiMatrix4x4::Decompose (aiVector3D&, aiQuaternion&, aiVector3D&) const;
    /// ```
    public static void aiDecomposeMatrix(
    	MemorySegment mat,
    	MemorySegment scaling,
    	MemorySegment rotation,
    	MemorySegment position
    ) {
    	MethodHandle method = AI_DECOMPOSE_MATRIX.get();
    	try {
    		 method.invokeExact(
    			mat,
    			scaling,
    			rotation,
    			position
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aiDecomposeMatrix].
    public static void aiDecomposeMatrix(
    	AiMatrix4x4 mat,
    	AiVector3D scaling,
    	AiQuaternion rotation,
    	AiVector3D position
    ) {
    	aiDecomposeMatrix(
    		mat.memorySegment(),
    		scaling.memorySegment(),
    		rotation.memorySegment(),
    		position.memorySegment()
    	);
    }
    
    /// ```
    /// Transpose a 4x4 matrix.
    /// @param mat Pointer to the matrix to be transposed
    /// ```
    public static void aiTransposeMatrix4(
    	MemorySegment mat
    ) {
    	MethodHandle method = AI_TRANSPOSE_MATRIX4.get();
    	try {
    		 method.invokeExact(
    			mat
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aiTransposeMatrix4].
    public static void aiTransposeMatrix4(
    	AiMatrix4x4 mat
    ) {
    	aiTransposeMatrix4(
    		mat.memorySegment()
    	);
    }
    
    /// ```
    /// Transpose a 3x3 matrix.
    /// @param mat Pointer to the matrix to be transposed
    /// ```
    public static void aiTransposeMatrix3(
    	MemorySegment mat
    ) {
    	MethodHandle method = AI_TRANSPOSE_MATRIX3.get();
    	try {
    		 method.invokeExact(
    			mat
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aiTransposeMatrix3].
    public static void aiTransposeMatrix3(
    	AiMatrix3x3 mat
    ) {
    	aiTransposeMatrix3(
    		mat.memorySegment()
    	);
    }
    
    /// ```
    /// Transform a vector by a 3x3 matrix
    /// @param vec Vector to be transformed.
    /// @param mat Matrix to transform the vector with.
    /// ```
    public static void aiTransformVecByMatrix3(
    	MemorySegment vec,
    	MemorySegment mat
    ) {
    	MethodHandle method = AI_TRANSFORM_VEC_BY_MATRIX3.get();
    	try {
    		 method.invokeExact(
    			vec,
    			mat
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aiTransformVecByMatrix3].
    public static void aiTransformVecByMatrix3(
    	AiVector3D vec,
    	AiMatrix3x3 mat
    ) {
    	aiTransformVecByMatrix3(
    		vec.memorySegment(),
    		mat.memorySegment()
    	);
    }
    
    /// ```
    /// Transform a vector by a 4x4 matrix
    /// @param vec Vector to be transformed.
    /// @param mat Matrix to transform the vector with.
    /// ```
    public static void aiTransformVecByMatrix4(
    	MemorySegment vec,
    	MemorySegment mat
    ) {
    	MethodHandle method = AI_TRANSFORM_VEC_BY_MATRIX4.get();
    	try {
    		 method.invokeExact(
    			vec,
    			mat
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aiTransformVecByMatrix4].
    public static void aiTransformVecByMatrix4(
    	AiVector3D vec,
    	AiMatrix4x4 mat
    ) {
    	aiTransformVecByMatrix4(
    		vec.memorySegment(),
    		mat.memorySegment()
    	);
    }
    
    /// ```
    /// Multiply two 4x4 matrices.
    /// @param dst First factor, receives result.
    /// @param src Matrix to be multiplied with 'dst'.
    /// ```
    public static void aiMultiplyMatrix4(
    	MemorySegment dst,
    	MemorySegment src
    ) {
    	MethodHandle method = AI_MULTIPLY_MATRIX4.get();
    	try {
    		 method.invokeExact(
    			dst,
    			src
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aiMultiplyMatrix4].
    public static void aiMultiplyMatrix4(
    	AiMatrix4x4 dst,
    	AiMatrix4x4 src
    ) {
    	aiMultiplyMatrix4(
    		dst.memorySegment(),
    		src.memorySegment()
    	);
    }
    
    /// ```
    /// Multiply two 3x3 matrices.
    /// @param dst First factor, receives result.
    /// @param src Matrix to be multiplied with 'dst'.
    /// ```
    public static void aiMultiplyMatrix3(
    	MemorySegment dst,
    	MemorySegment src
    ) {
    	MethodHandle method = AI_MULTIPLY_MATRIX3.get();
    	try {
    		 method.invokeExact(
    			dst,
    			src
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aiMultiplyMatrix3].
    public static void aiMultiplyMatrix3(
    	AiMatrix3x3 dst,
    	AiMatrix3x3 src
    ) {
    	aiMultiplyMatrix3(
    		dst.memorySegment(),
    		src.memorySegment()
    	);
    }
    
    /// ```
    /// Get a 3x3 identity matrix.
    /// @param mat Matrix to receive its personal identity
    /// ```
    public static void aiIdentityMatrix3(
    	MemorySegment mat
    ) {
    	MethodHandle method = AI_IDENTITY_MATRIX3.get();
    	try {
    		 method.invokeExact(
    			mat
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aiIdentityMatrix3].
    public static void aiIdentityMatrix3(
    	AiMatrix3x3 mat
    ) {
    	aiIdentityMatrix3(
    		mat.memorySegment()
    	);
    }
    
    /// ```
    /// Get a 4x4 identity matrix.
    /// @param mat Matrix to receive its personal identity
    /// ```
    public static void aiIdentityMatrix4(
    	MemorySegment mat
    ) {
    	MethodHandle method = AI_IDENTITY_MATRIX4.get();
    	try {
    		 method.invokeExact(
    			mat
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aiIdentityMatrix4].
    public static void aiIdentityMatrix4(
    	AiMatrix4x4 mat
    ) {
    	aiIdentityMatrix4(
    		mat.memorySegment()
    	);
    }
    
    /// ```
    /// Returns the number of import file formats available in the current Assimp build.
    /// Use aiGetImportFormatDescription() to retrieve infos of a specific import format.
    /// ```
    public static long aiGetImportFormatCount() {
    	MethodHandle method = AI_GET_IMPORT_FORMAT_COUNT.get();
    	try {
    		return (long) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// Returns a description of the nth import file format. Use #aiGetImportFormatCount()
    /// to learn how many import formats are supported.
    /// @param pIndex Index of the import format to retrieve information for. Valid range is
    /// 0 to #aiGetImportFormatCount()
    /// @return A description of that specific import format. NULL if pIndex is out of range.
    /// ```
    public static MemorySegment naiGetImportFormatDescription(
    	long pIndex
    ) {
    	MethodHandle method = AI_GET_IMPORT_FORMAT_DESCRIPTION.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			pIndex
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#naiGetImportFormatDescription].
    public static @Nullable AiImporterDesc aiGetImportFormatDescription(
    	long pIndex
    ) {
    	MemorySegment segment = naiGetImportFormatDescription(
    		pIndex
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new AiImporterDesc(segment);
    }
    
    /// ```
    /// Check if 2D vectors are equal.
    /// @param a First vector to compare
    /// @param b Second vector to compare
    /// @return 1 if the vectors are equal
    /// @return 0 if the vectors are not equal
    /// ```
    public static int aiVector2AreEqual(
    	MemorySegment a,
    	MemorySegment b
    ) {
    	MethodHandle method = AI_VECTOR2_ARE_EQUAL.get();
    	try {
    		return (int) method.invokeExact(
    			a,
    			b
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aiVector2AreEqual].
    public static int aiVector2AreEqual(
    	AiVector2D a,
    	AiVector2D b
    ) {
    	return aiVector2AreEqual(
    		a.memorySegment(),
    		b.memorySegment()
    	);
    }
    
    /// ```
    /// Check if 2D vectors are equal using epsilon.
    /// @param a First vector to compare
    /// @param b Second vector to compare
    /// @param epsilon Epsilon
    /// @return 1 if the vectors are equal
    /// @return 0 if the vectors are not equal
    /// ```
    public static int aiVector2AreEqualEpsilon(
    	MemorySegment a,
    	MemorySegment b,
    	float epsilon
    ) {
    	MethodHandle method = AI_VECTOR2_ARE_EQUAL_EPSILON.get();
    	try {
    		return (int) method.invokeExact(
    			a,
    			b,
    			epsilon
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aiVector2AreEqualEpsilon].
    public static int aiVector2AreEqualEpsilon(
    	AiVector2D a,
    	AiVector2D b,
    	float epsilon
    ) {
    	return aiVector2AreEqualEpsilon(
    		a.memorySegment(),
    		b.memorySegment(),
    		epsilon
    	);
    }
    
    /// ```
    /// Add 2D vectors.
    /// @param dst First addend, receives result.
    /// @param src Vector to be added to 'dst'.
    /// ```
    public static void aiVector2Add(
    	MemorySegment dst,
    	MemorySegment src
    ) {
    	MethodHandle method = AI_VECTOR2_ADD.get();
    	try {
    		 method.invokeExact(
    			dst,
    			src
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aiVector2Add].
    public static void aiVector2Add(
    	AiVector2D dst,
    	AiVector2D src
    ) {
    	aiVector2Add(
    		dst.memorySegment(),
    		src.memorySegment()
    	);
    }
    
    /// ```
    /// Subtract 2D vectors.
    /// @param dst Minuend, receives result.
    /// @param src Vector to be subtracted from 'dst'.
    /// ```
    public static void aiVector2Subtract(
    	MemorySegment dst,
    	MemorySegment src
    ) {
    	MethodHandle method = AI_VECTOR2_SUBTRACT.get();
    	try {
    		 method.invokeExact(
    			dst,
    			src
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aiVector2Subtract].
    public static void aiVector2Subtract(
    	AiVector2D dst,
    	AiVector2D src
    ) {
    	aiVector2Subtract(
    		dst.memorySegment(),
    		src.memorySegment()
    	);
    }
    
    /// ```
    /// Multiply a 2D vector by a scalar.
    /// @param dst Vector to be scaled by \p s
    /// @param s Scale factor
    /// ```
    public static void aiVector2Scale(
    	MemorySegment dst,
    	float s
    ) {
    	MethodHandle method = AI_VECTOR2_SCALE.get();
    	try {
    		 method.invokeExact(
    			dst,
    			s
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aiVector2Scale].
    public static void aiVector2Scale(
    	AiVector2D dst,
    	float s
    ) {
    	aiVector2Scale(
    		dst.memorySegment(),
    		s
    	);
    }
    
    /// ```
    /// Multiply each component of a 2D vector with
    /// the components of another vector.
    /// @param dst First vector, receives result
    /// @param other Second vector
    /// ```
    public static void aiVector2SymMul(
    	MemorySegment dst,
    	MemorySegment other
    ) {
    	MethodHandle method = AI_VECTOR2_SYM_MUL.get();
    	try {
    		 method.invokeExact(
    			dst,
    			other
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aiVector2SymMul].
    public static void aiVector2SymMul(
    	AiVector2D dst,
    	AiVector2D other
    ) {
    	aiVector2SymMul(
    		dst.memorySegment(),
    		other.memorySegment()
    	);
    }
    
    /// ```
    /// Divide a 2D vector by a scalar.
    /// @param dst Vector to be divided by \p s
    /// @param s Scalar divisor
    /// ```
    public static void aiVector2DivideByScalar(
    	MemorySegment dst,
    	float s
    ) {
    	MethodHandle method = AI_VECTOR2_DIVIDE_BY_SCALAR.get();
    	try {
    		 method.invokeExact(
    			dst,
    			s
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aiVector2DivideByScalar].
    public static void aiVector2DivideByScalar(
    	AiVector2D dst,
    	float s
    ) {
    	aiVector2DivideByScalar(
    		dst.memorySegment(),
    		s
    	);
    }
    
    /// ```
    /// Divide each component of a 2D vector by
    /// the components of another vector.
    /// @param dst Vector as the dividend
    /// @param v Vector as the divisor
    /// ```
    public static void aiVector2DivideByVector(
    	MemorySegment dst,
    	MemorySegment v
    ) {
    	MethodHandle method = AI_VECTOR2_DIVIDE_BY_VECTOR.get();
    	try {
    		 method.invokeExact(
    			dst,
    			v
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aiVector2DivideByVector].
    public static void aiVector2DivideByVector(
    	AiVector2D dst,
    	AiVector2D v
    ) {
    	aiVector2DivideByVector(
    		dst.memorySegment(),
    		v.memorySegment()
    	);
    }
    
    /// ```
    /// Get the length of a 2D vector.
    /// @return v Vector to evaluate
    /// ```
    public static float aiVector2Length(
    	MemorySegment v
    ) {
    	MethodHandle method = AI_VECTOR2_LENGTH.get();
    	try {
    		return (float) method.invokeExact(
    			v
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aiVector2Length].
    public static float aiVector2Length(
    	AiVector2D v
    ) {
    	return aiVector2Length(
    		v.memorySegment()
    	);
    }
    
    /// ```
    /// Get the squared length of a 2D vector.
    /// @return v Vector to evaluate
    /// ```
    public static float aiVector2SquareLength(
    	MemorySegment v
    ) {
    	MethodHandle method = AI_VECTOR2_SQUARE_LENGTH.get();
    	try {
    		return (float) method.invokeExact(
    			v
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aiVector2SquareLength].
    public static float aiVector2SquareLength(
    	AiVector2D v
    ) {
    	return aiVector2SquareLength(
    		v.memorySegment()
    	);
    }
    
    /// ```
    /// Negate a 2D vector.
    /// @param dst Vector to be negated
    /// ```
    public static void aiVector2Negate(
    	MemorySegment dst
    ) {
    	MethodHandle method = AI_VECTOR2_NEGATE.get();
    	try {
    		 method.invokeExact(
    			dst
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aiVector2Negate].
    public static void aiVector2Negate(
    	AiVector2D dst
    ) {
    	aiVector2Negate(
    		dst.memorySegment()
    	);
    }
    
    /// ```
    /// Get the dot product of 2D vectors.
    /// @param a First vector
    /// @param b Second vector
    /// @return The dot product of vectors
    /// ```
    public static float aiVector2DotProduct(
    	MemorySegment a,
    	MemorySegment b
    ) {
    	MethodHandle method = AI_VECTOR2_DOT_PRODUCT.get();
    	try {
    		return (float) method.invokeExact(
    			a,
    			b
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aiVector2DotProduct].
    public static float aiVector2DotProduct(
    	AiVector2D a,
    	AiVector2D b
    ) {
    	return aiVector2DotProduct(
    		a.memorySegment(),
    		b.memorySegment()
    	);
    }
    
    /// ```
    /// Normalize a 2D vector.
    /// @param v Vector to normalize
    /// ```
    public static void aiVector2Normalize(
    	MemorySegment v
    ) {
    	MethodHandle method = AI_VECTOR2_NORMALIZE.get();
    	try {
    		 method.invokeExact(
    			v
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aiVector2Normalize].
    public static void aiVector2Normalize(
    	AiVector2D v
    ) {
    	aiVector2Normalize(
    		v.memorySegment()
    	);
    }
    
    /// ```
    /// Check if 3D vectors are equal.
    /// @param a First vector to compare
    /// @param b Second vector to compare
    /// @return 1 if the vectors are equal
    /// @return 0 if the vectors are not equal
    /// ```
    public static int aiVector3AreEqual(
    	MemorySegment a,
    	MemorySegment b
    ) {
    	MethodHandle method = AI_VECTOR3_ARE_EQUAL.get();
    	try {
    		return (int) method.invokeExact(
    			a,
    			b
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aiVector3AreEqual].
    public static int aiVector3AreEqual(
    	AiVector3D a,
    	AiVector3D b
    ) {
    	return aiVector3AreEqual(
    		a.memorySegment(),
    		b.memorySegment()
    	);
    }
    
    /// ```
    /// Check if 3D vectors are equal using epsilon.
    /// @param a First vector to compare
    /// @param b Second vector to compare
    /// @param epsilon Epsilon
    /// @return 1 if the vectors are equal
    /// @return 0 if the vectors are not equal
    /// ```
    public static int aiVector3AreEqualEpsilon(
    	MemorySegment a,
    	MemorySegment b,
    	float epsilon
    ) {
    	MethodHandle method = AI_VECTOR3_ARE_EQUAL_EPSILON.get();
    	try {
    		return (int) method.invokeExact(
    			a,
    			b,
    			epsilon
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aiVector3AreEqualEpsilon].
    public static int aiVector3AreEqualEpsilon(
    	AiVector3D a,
    	AiVector3D b,
    	float epsilon
    ) {
    	return aiVector3AreEqualEpsilon(
    		a.memorySegment(),
    		b.memorySegment(),
    		epsilon
    	);
    }
    
    /// ```
    /// Check if vector \p a is less than vector \p b.
    /// @param a First vector to compare
    /// @param b Second vector to compare
    /// @param epsilon Epsilon
    /// @return 1 if \p a is less than \p b
    /// @return 0 if \p a is equal or greater than \p b
    /// ```
    public static int aiVector3LessThan(
    	MemorySegment a,
    	MemorySegment b
    ) {
    	MethodHandle method = AI_VECTOR3_LESS_THAN.get();
    	try {
    		return (int) method.invokeExact(
    			a,
    			b
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aiVector3LessThan].
    public static int aiVector3LessThan(
    	AiVector3D a,
    	AiVector3D b
    ) {
    	return aiVector3LessThan(
    		a.memorySegment(),
    		b.memorySegment()
    	);
    }
    
    /// ```
    /// Add 3D vectors.
    /// @param dst First addend, receives result.
    /// @param src Vector to be added to 'dst'.
    /// ```
    public static void aiVector3Add(
    	MemorySegment dst,
    	MemorySegment src
    ) {
    	MethodHandle method = AI_VECTOR3_ADD.get();
    	try {
    		 method.invokeExact(
    			dst,
    			src
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aiVector3Add].
    public static void aiVector3Add(
    	AiVector3D dst,
    	AiVector3D src
    ) {
    	aiVector3Add(
    		dst.memorySegment(),
    		src.memorySegment()
    	);
    }
    
    /// ```
    /// Subtract 3D vectors.
    /// @param dst Minuend, receives result.
    /// @param src Vector to be subtracted from 'dst'.
    /// ```
    public static void aiVector3Subtract(
    	MemorySegment dst,
    	MemorySegment src
    ) {
    	MethodHandle method = AI_VECTOR3_SUBTRACT.get();
    	try {
    		 method.invokeExact(
    			dst,
    			src
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aiVector3Subtract].
    public static void aiVector3Subtract(
    	AiVector3D dst,
    	AiVector3D src
    ) {
    	aiVector3Subtract(
    		dst.memorySegment(),
    		src.memorySegment()
    	);
    }
    
    /// ```
    /// Multiply a 3D vector by a scalar.
    /// @param dst Vector to be scaled by \p s
    /// @param s Scale factor
    /// ```
    public static void aiVector3Scale(
    	MemorySegment dst,
    	float s
    ) {
    	MethodHandle method = AI_VECTOR3_SCALE.get();
    	try {
    		 method.invokeExact(
    			dst,
    			s
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aiVector3Scale].
    public static void aiVector3Scale(
    	AiVector3D dst,
    	float s
    ) {
    	aiVector3Scale(
    		dst.memorySegment(),
    		s
    	);
    }
    
    /// ```
    /// Multiply each component of a 3D vector with
    /// the components of another vector.
    /// @param dst First vector, receives result
    /// @param other Second vector
    /// ```
    public static void aiVector3SymMul(
    	MemorySegment dst,
    	MemorySegment other
    ) {
    	MethodHandle method = AI_VECTOR3_SYM_MUL.get();
    	try {
    		 method.invokeExact(
    			dst,
    			other
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aiVector3SymMul].
    public static void aiVector3SymMul(
    	AiVector3D dst,
    	AiVector3D other
    ) {
    	aiVector3SymMul(
    		dst.memorySegment(),
    		other.memorySegment()
    	);
    }
    
    /// ```
    /// Divide a 3D vector by a scalar.
    /// @param dst Vector to be divided by \p s
    /// @param s Scalar divisor
    /// ```
    public static void aiVector3DivideByScalar(
    	MemorySegment dst,
    	float s
    ) {
    	MethodHandle method = AI_VECTOR3_DIVIDE_BY_SCALAR.get();
    	try {
    		 method.invokeExact(
    			dst,
    			s
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aiVector3DivideByScalar].
    public static void aiVector3DivideByScalar(
    	AiVector3D dst,
    	float s
    ) {
    	aiVector3DivideByScalar(
    		dst.memorySegment(),
    		s
    	);
    }
    
    /// ```
    /// Divide each component of a 3D vector by
    /// the components of another vector.
    /// @param dst Vector as the dividend
    /// @param v Vector as the divisor
    /// ```
    public static void aiVector3DivideByVector(
    	MemorySegment dst,
    	MemorySegment v
    ) {
    	MethodHandle method = AI_VECTOR3_DIVIDE_BY_VECTOR.get();
    	try {
    		 method.invokeExact(
    			dst,
    			v
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aiVector3DivideByVector].
    public static void aiVector3DivideByVector(
    	AiVector3D dst,
    	AiVector3D v
    ) {
    	aiVector3DivideByVector(
    		dst.memorySegment(),
    		v.memorySegment()
    	);
    }
    
    /// ```
    /// Get the length of a 3D vector.
    /// @return v Vector to evaluate
    /// ```
    public static float aiVector3Length(
    	MemorySegment v
    ) {
    	MethodHandle method = AI_VECTOR3_LENGTH.get();
    	try {
    		return (float) method.invokeExact(
    			v
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aiVector3Length].
    public static float aiVector3Length(
    	AiVector3D v
    ) {
    	return aiVector3Length(
    		v.memorySegment()
    	);
    }
    
    /// ```
    /// Get the squared length of a 3D vector.
    /// @return v Vector to evaluate
    /// ```
    public static float aiVector3SquareLength(
    	MemorySegment v
    ) {
    	MethodHandle method = AI_VECTOR3_SQUARE_LENGTH.get();
    	try {
    		return (float) method.invokeExact(
    			v
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aiVector3SquareLength].
    public static float aiVector3SquareLength(
    	AiVector3D v
    ) {
    	return aiVector3SquareLength(
    		v.memorySegment()
    	);
    }
    
    /// ```
    /// Negate a 3D vector.
    /// @param dst Vector to be negated
    /// ```
    public static void aiVector3Negate(
    	MemorySegment dst
    ) {
    	MethodHandle method = AI_VECTOR3_NEGATE.get();
    	try {
    		 method.invokeExact(
    			dst
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aiVector3Negate].
    public static void aiVector3Negate(
    	AiVector3D dst
    ) {
    	aiVector3Negate(
    		dst.memorySegment()
    	);
    }
    
    /// ```
    /// Get the dot product of 3D vectors.
    /// @param a First vector
    /// @param b Second vector
    /// @return The dot product of vectors
    /// ```
    public static float aiVector3DotProduct(
    	MemorySegment a,
    	MemorySegment b
    ) {
    	MethodHandle method = AI_VECTOR3_DOT_PRODUCT.get();
    	try {
    		return (float) method.invokeExact(
    			a,
    			b
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aiVector3DotProduct].
    public static float aiVector3DotProduct(
    	AiVector3D a,
    	AiVector3D b
    ) {
    	return aiVector3DotProduct(
    		a.memorySegment(),
    		b.memorySegment()
    	);
    }
    
    /// ```
    /// Get cross product of 3D vectors.
    /// @param dst Vector to receive the result.
    /// @param a First vector
    /// @param b Second vector
    /// @return The dot product of vectors
    /// ```
    public static void aiVector3CrossProduct(
    	MemorySegment dst,
    	MemorySegment a,
    	MemorySegment b
    ) {
    	MethodHandle method = AI_VECTOR3_CROSS_PRODUCT.get();
    	try {
    		 method.invokeExact(
    			dst,
    			a,
    			b
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aiVector3CrossProduct].
    public static void aiVector3CrossProduct(
    	AiVector3D dst,
    	AiVector3D a,
    	AiVector3D b
    ) {
    	aiVector3CrossProduct(
    		dst.memorySegment(),
    		a.memorySegment(),
    		b.memorySegment()
    	);
    }
    
    /// ```
    /// Normalize a 3D vector.
    /// @param v Vector to normalize
    /// ```
    public static void aiVector3Normalize(
    	MemorySegment v
    ) {
    	MethodHandle method = AI_VECTOR3_NORMALIZE.get();
    	try {
    		 method.invokeExact(
    			v
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aiVector3Normalize].
    public static void aiVector3Normalize(
    	AiVector3D v
    ) {
    	aiVector3Normalize(
    		v.memorySegment()
    	);
    }
    
    /// ```
    /// Check for division by zero and normalize a 3D vector.
    /// @param v Vector to normalize
    /// ```
    public static void aiVector3NormalizeSafe(
    	MemorySegment v
    ) {
    	MethodHandle method = AI_VECTOR3_NORMALIZE_SAFE.get();
    	try {
    		 method.invokeExact(
    			v
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aiVector3NormalizeSafe].
    public static void aiVector3NormalizeSafe(
    	AiVector3D v
    ) {
    	aiVector3NormalizeSafe(
    		v.memorySegment()
    	);
    }
    
    /// ```
    /// Rotate a 3D vector by a quaternion.
    /// @param v The vector to rotate by \p q
    /// @param q Quaternion to use to rotate \p v
    /// ```
    public static void aiVector3RotateByQuaternion(
    	MemorySegment v,
    	MemorySegment q
    ) {
    	MethodHandle method = AI_VECTOR3_ROTATE_BY_QUATERNION.get();
    	try {
    		 method.invokeExact(
    			v,
    			q
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aiVector3RotateByQuaternion].
    public static void aiVector3RotateByQuaternion(
    	AiVector3D v,
    	AiQuaternion q
    ) {
    	aiVector3RotateByQuaternion(
    		v.memorySegment(),
    		q.memorySegment()
    	);
    }
    
    /// ```
    /// Construct a 3x3 matrix from a 4x4 matrix.
    /// @param dst Receives the output matrix
    /// @param mat The 4x4 matrix to use
    /// ```
    public static void aiMatrix3FromMatrix4(
    	MemorySegment dst,
    	MemorySegment mat
    ) {
    	MethodHandle method = AI_MATRIX3_FROM_MATRIX4.get();
    	try {
    		 method.invokeExact(
    			dst,
    			mat
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aiMatrix3FromMatrix4].
    public static void aiMatrix3FromMatrix4(
    	AiMatrix3x3 dst,
    	AiMatrix4x4 mat
    ) {
    	aiMatrix3FromMatrix4(
    		dst.memorySegment(),
    		mat.memorySegment()
    	);
    }
    
    /// ```
    /// Construct a 3x3 matrix from a quaternion.
    /// @param mat Receives the output matrix
    /// @param q The quaternion matrix to use
    /// ```
    public static void aiMatrix3FromQuaternion(
    	MemorySegment mat,
    	MemorySegment q
    ) {
    	MethodHandle method = AI_MATRIX3_FROM_QUATERNION.get();
    	try {
    		 method.invokeExact(
    			mat,
    			q
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aiMatrix3FromQuaternion].
    public static void aiMatrix3FromQuaternion(
    	AiMatrix3x3 mat,
    	AiQuaternion q
    ) {
    	aiMatrix3FromQuaternion(
    		mat.memorySegment(),
    		q.memorySegment()
    	);
    }
    
    /// ```
    /// Check if 3x3 matrices are equal.
    /// @param a First matrix to compare
    /// @param b Second matrix to compare
    /// @return 1 if the matrices are equal
    /// @return 0 if the matrices are not equal
    /// ```
    public static int aiMatrix3AreEqual(
    	MemorySegment a,
    	MemorySegment b
    ) {
    	MethodHandle method = AI_MATRIX3_ARE_EQUAL.get();
    	try {
    		return (int) method.invokeExact(
    			a,
    			b
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aiMatrix3AreEqual].
    public static int aiMatrix3AreEqual(
    	AiMatrix3x3 a,
    	AiMatrix3x3 b
    ) {
    	return aiMatrix3AreEqual(
    		a.memorySegment(),
    		b.memorySegment()
    	);
    }
    
    /// ```
    /// Check if 3x3 matrices are equal.
    /// @param a First matrix to compare
    /// @param b Second matrix to compare
    /// @param epsilon Epsilon
    /// @return 1 if the matrices are equal
    /// @return 0 if the matrices are not equal
    /// ```
    public static int aiMatrix3AreEqualEpsilon(
    	MemorySegment a,
    	MemorySegment b,
    	float epsilon
    ) {
    	MethodHandle method = AI_MATRIX3_ARE_EQUAL_EPSILON.get();
    	try {
    		return (int) method.invokeExact(
    			a,
    			b,
    			epsilon
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aiMatrix3AreEqualEpsilon].
    public static int aiMatrix3AreEqualEpsilon(
    	AiMatrix3x3 a,
    	AiMatrix3x3 b,
    	float epsilon
    ) {
    	return aiMatrix3AreEqualEpsilon(
    		a.memorySegment(),
    		b.memorySegment(),
    		epsilon
    	);
    }
    
    /// ```
    /// Invert a 3x3 matrix.
    /// @param mat Matrix to invert
    /// ```
    public static void aiMatrix3Inverse(
    	MemorySegment mat
    ) {
    	MethodHandle method = AI_MATRIX3_INVERSE.get();
    	try {
    		 method.invokeExact(
    			mat
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aiMatrix3Inverse].
    public static void aiMatrix3Inverse(
    	AiMatrix3x3 mat
    ) {
    	aiMatrix3Inverse(
    		mat.memorySegment()
    	);
    }
    
    /// ```
    /// Get the determinant of a 3x3 matrix.
    /// @param mat Matrix to get the determinant from
    /// ```
    public static float aiMatrix3Determinant(
    	MemorySegment mat
    ) {
    	MethodHandle method = AI_MATRIX3_DETERMINANT.get();
    	try {
    		return (float) method.invokeExact(
    			mat
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aiMatrix3Determinant].
    public static float aiMatrix3Determinant(
    	AiMatrix3x3 mat
    ) {
    	return aiMatrix3Determinant(
    		mat.memorySegment()
    	);
    }
    
    /// ```
    /// Get a 3x3 rotation matrix around the Z axis.
    /// @param mat Receives the output matrix
    /// @param angle Rotation angle, in radians
    /// ```
    public static void aiMatrix3RotationZ(
    	MemorySegment mat,
    	float angle
    ) {
    	MethodHandle method = AI_MATRIX3_ROTATION_Z.get();
    	try {
    		 method.invokeExact(
    			mat,
    			angle
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aiMatrix3RotationZ].
    public static void aiMatrix3RotationZ(
    	AiMatrix3x3 mat,
    	float angle
    ) {
    	aiMatrix3RotationZ(
    		mat.memorySegment(),
    		angle
    	);
    }
    
    /// ```
    /// Returns a 3x3 rotation matrix for a rotation around an arbitrary axis.
    /// @param mat Receives the output matrix
    /// @param axis Rotation axis, should be a normalized vector
    /// @param angle Rotation angle, in radians
    /// ```
    public static void aiMatrix3FromRotationAroundAxis(
    	MemorySegment mat,
    	MemorySegment axis,
    	float angle
    ) {
    	MethodHandle method = AI_MATRIX3_FROM_ROTATION_AROUND_AXIS.get();
    	try {
    		 method.invokeExact(
    			mat,
    			axis,
    			angle
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aiMatrix3FromRotationAroundAxis].
    public static void aiMatrix3FromRotationAroundAxis(
    	AiMatrix3x3 mat,
    	AiVector3D axis,
    	float angle
    ) {
    	aiMatrix3FromRotationAroundAxis(
    		mat.memorySegment(),
    		axis.memorySegment(),
    		angle
    	);
    }
    
    /// ```
    /// Get a 3x3 translation matrix.
    /// @param mat Receives the output matrix
    /// @param translation The translation vector
    /// ```
    public static void aiMatrix3Translation(
    	MemorySegment mat,
    	MemorySegment translation
    ) {
    	MethodHandle method = AI_MATRIX3_TRANSLATION.get();
    	try {
    		 method.invokeExact(
    			mat,
    			translation
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aiMatrix3Translation].
    public static void aiMatrix3Translation(
    	AiMatrix3x3 mat,
    	AiVector2D translation
    ) {
    	aiMatrix3Translation(
    		mat.memorySegment(),
    		translation.memorySegment()
    	);
    }
    
    /// ```
    /// Create a 3x3 matrix that rotates one vector to another vector.
    /// @param mat Receives the output matrix
    /// @param from Vector to rotate from
    /// @param to Vector to rotate to
    /// ```
    public static void aiMatrix3FromTo(
    	MemorySegment mat,
    	MemorySegment from,
    	MemorySegment to
    ) {
    	MethodHandle method = AI_MATRIX3_FROM_TO.get();
    	try {
    		 method.invokeExact(
    			mat,
    			from,
    			to
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aiMatrix3FromTo].
    public static void aiMatrix3FromTo(
    	AiMatrix3x3 mat,
    	AiVector3D from,
    	AiVector3D to
    ) {
    	aiMatrix3FromTo(
    		mat.memorySegment(),
    		from.memorySegment(),
    		to.memorySegment()
    	);
    }
    
    /// ```
    /// Construct a 4x4 matrix from a 3x3 matrix.
    /// @param dst Receives the output matrix
    /// @param mat The 3x3 matrix to use
    /// ```
    public static void aiMatrix4FromMatrix3(
    	MemorySegment dst,
    	MemorySegment mat
    ) {
    	MethodHandle method = AI_MATRIX4_FROM_MATRIX3.get();
    	try {
    		 method.invokeExact(
    			dst,
    			mat
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aiMatrix4FromMatrix3].
    public static void aiMatrix4FromMatrix3(
    	AiMatrix4x4 dst,
    	AiMatrix3x3 mat
    ) {
    	aiMatrix4FromMatrix3(
    		dst.memorySegment(),
    		mat.memorySegment()
    	);
    }
    
    /// ```
    /// Construct a 4x4 matrix from scaling, rotation and position.
    /// @param mat Receives the output matrix.
    /// @param scaling The scaling for the x,y,z axes
    /// @param rotation The rotation as a hamilton quaternion
    /// @param position The position for the x,y,z axes
    /// ```
    public static void aiMatrix4FromScalingQuaternionPosition(
    	MemorySegment mat,
    	MemorySegment scaling,
    	MemorySegment rotation,
    	MemorySegment position
    ) {
    	MethodHandle method = AI_MATRIX4_FROM_SCALING_QUATERNION_POSITION.get();
    	try {
    		 method.invokeExact(
    			mat,
    			scaling,
    			rotation,
    			position
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aiMatrix4FromScalingQuaternionPosition].
    public static void aiMatrix4FromScalingQuaternionPosition(
    	AiMatrix4x4 mat,
    	AiVector3D scaling,
    	AiQuaternion rotation,
    	AiVector3D position
    ) {
    	aiMatrix4FromScalingQuaternionPosition(
    		mat.memorySegment(),
    		scaling.memorySegment(),
    		rotation.memorySegment(),
    		position.memorySegment()
    	);
    }
    
    /// ```
    /// Add 4x4 matrices.
    /// @param dst First addend, receives result.
    /// @param src Matrix to be added to 'dst'.
    /// ```
    public static void aiMatrix4Add(
    	MemorySegment dst,
    	MemorySegment src
    ) {
    	MethodHandle method = AI_MATRIX4_ADD.get();
    	try {
    		 method.invokeExact(
    			dst,
    			src
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aiMatrix4Add].
    public static void aiMatrix4Add(
    	AiMatrix4x4 dst,
    	AiMatrix4x4 src
    ) {
    	aiMatrix4Add(
    		dst.memorySegment(),
    		src.memorySegment()
    	);
    }
    
    /// ```
    /// Check if 4x4 matrices are equal.
    /// @param a First matrix to compare
    /// @param b Second matrix to compare
    /// @return 1 if the matrices are equal
    /// @return 0 if the matrices are not equal
    /// ```
    public static int aiMatrix4AreEqual(
    	MemorySegment a,
    	MemorySegment b
    ) {
    	MethodHandle method = AI_MATRIX4_ARE_EQUAL.get();
    	try {
    		return (int) method.invokeExact(
    			a,
    			b
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aiMatrix4AreEqual].
    public static int aiMatrix4AreEqual(
    	AiMatrix4x4 a,
    	AiMatrix4x4 b
    ) {
    	return aiMatrix4AreEqual(
    		a.memorySegment(),
    		b.memorySegment()
    	);
    }
    
    /// ```
    /// Check if 4x4 matrices are equal.
    /// @param a First matrix to compare
    /// @param b Second matrix to compare
    /// @param epsilon Epsilon
    /// @return 1 if the matrices are equal
    /// @return 0 if the matrices are not equal
    /// ```
    public static int aiMatrix4AreEqualEpsilon(
    	MemorySegment a,
    	MemorySegment b,
    	float epsilon
    ) {
    	MethodHandle method = AI_MATRIX4_ARE_EQUAL_EPSILON.get();
    	try {
    		return (int) method.invokeExact(
    			a,
    			b,
    			epsilon
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aiMatrix4AreEqualEpsilon].
    public static int aiMatrix4AreEqualEpsilon(
    	AiMatrix4x4 a,
    	AiMatrix4x4 b,
    	float epsilon
    ) {
    	return aiMatrix4AreEqualEpsilon(
    		a.memorySegment(),
    		b.memorySegment(),
    		epsilon
    	);
    }
    
    /// ```
    /// Invert a 4x4 matrix.
    /// @param result Matrix to invert
    /// ```
    public static void aiMatrix4Inverse(
    	MemorySegment mat
    ) {
    	MethodHandle method = AI_MATRIX4_INVERSE.get();
    	try {
    		 method.invokeExact(
    			mat
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aiMatrix4Inverse].
    public static void aiMatrix4Inverse(
    	AiMatrix4x4 mat
    ) {
    	aiMatrix4Inverse(
    		mat.memorySegment()
    	);
    }
    
    /// ```
    /// Get the determinant of a 4x4 matrix.
    /// @param mat Matrix to get the determinant from
    /// @return The determinant of the matrix
    /// ```
    public static float aiMatrix4Determinant(
    	MemorySegment mat
    ) {
    	MethodHandle method = AI_MATRIX4_DETERMINANT.get();
    	try {
    		return (float) method.invokeExact(
    			mat
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aiMatrix4Determinant].
    public static float aiMatrix4Determinant(
    	AiMatrix4x4 mat
    ) {
    	return aiMatrix4Determinant(
    		mat.memorySegment()
    	);
    }
    
    /// ```
    /// Returns true of the matrix is the identity matrix.
    /// @param mat Matrix to get the determinant from
    /// @return 1 if \p mat is an identity matrix.
    /// @return 0 if \p mat is not an identity matrix.
    /// ```
    public static int aiMatrix4IsIdentity(
    	MemorySegment mat
    ) {
    	MethodHandle method = AI_MATRIX4_IS_IDENTITY.get();
    	try {
    		return (int) method.invokeExact(
    			mat
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aiMatrix4IsIdentity].
    public static int aiMatrix4IsIdentity(
    	AiMatrix4x4 mat
    ) {
    	return aiMatrix4IsIdentity(
    		mat.memorySegment()
    	);
    }
    
    /// ```
    /// Decompose a transformation matrix into its scaling,
    /// rotational as euler angles, and translational components.
    /// 
    /// @param mat Matrix to decompose
    /// @param scaling Receives the output scaling for the x,y,z axes
    /// @param rotation Receives the output rotation as a Euler angles
    /// @param position Receives the output position for the x,y,z axes
    /// ```
    public static void aiMatrix4DecomposeIntoScalingEulerAnglesPosition(
    	MemorySegment mat,
    	MemorySegment scaling,
    	MemorySegment rotation,
    	MemorySegment position
    ) {
    	MethodHandle method = AI_MATRIX4_DECOMPOSE_INTO_SCALING_EULER_ANGLES_POSITION.get();
    	try {
    		 method.invokeExact(
    			mat,
    			scaling,
    			rotation,
    			position
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aiMatrix4DecomposeIntoScalingEulerAnglesPosition].
    public static void aiMatrix4DecomposeIntoScalingEulerAnglesPosition(
    	AiMatrix4x4 mat,
    	AiVector3D scaling,
    	AiVector3D rotation,
    	AiVector3D position
    ) {
    	aiMatrix4DecomposeIntoScalingEulerAnglesPosition(
    		mat.memorySegment(),
    		scaling.memorySegment(),
    		rotation.memorySegment(),
    		position.memorySegment()
    	);
    }
    
    /// ```
    /// Decompose a transformation matrix into its scaling,
    /// rotational split into an axis and rotational angle,
    /// and it's translational components.
    /// 
    /// @param mat Matrix to decompose
    /// @param rotation Receives the rotational component
    /// @param axis Receives the output rotation axis
    /// @param angle Receives the output rotation angle
    /// @param position Receives the output position for the x,y,z axes.
    /// ```
    public static void aiMatrix4DecomposeIntoScalingAxisAnglePosition(
    	MemorySegment mat,
    	MemorySegment scaling,
    	MemorySegment axis,
    	MemorySegment angle,
    	MemorySegment position
    ) {
    	MethodHandle method = AI_MATRIX4_DECOMPOSE_INTO_SCALING_AXIS_ANGLE_POSITION.get();
    	try {
    		 method.invokeExact(
    			mat,
    			scaling,
    			axis,
    			angle,
    			position
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aiMatrix4DecomposeIntoScalingAxisAnglePosition].
    public static void aiMatrix4DecomposeIntoScalingAxisAnglePosition(
    	AiMatrix4x4 mat,
    	AiVector3D scaling,
    	AiVector3D axis,
    	NativeFloatArray angle,
    	AiVector3D position
    ) {
    	aiMatrix4DecomposeIntoScalingAxisAnglePosition(
    		mat.memorySegment(),
    		scaling.memorySegment(),
    		axis.memorySegment(),
    		angle.memorySegment(),
    		position.memorySegment()
    	);
    }
    
    /// ```
    /// Decompose a transformation matrix into its rotational and
    /// translational components.
    /// 
    /// @param mat Matrix to decompose
    /// @param rotation Receives the rotational component
    /// @param position Receives the translational component.
    /// ```
    public static void aiMatrix4DecomposeNoScaling(
    	MemorySegment mat,
    	MemorySegment rotation,
    	MemorySegment position
    ) {
    	MethodHandle method = AI_MATRIX4_DECOMPOSE_NO_SCALING.get();
    	try {
    		 method.invokeExact(
    			mat,
    			rotation,
    			position
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aiMatrix4DecomposeNoScaling].
    public static void aiMatrix4DecomposeNoScaling(
    	AiMatrix4x4 mat,
    	AiQuaternion rotation,
    	AiVector3D position
    ) {
    	aiMatrix4DecomposeNoScaling(
    		mat.memorySegment(),
    		rotation.memorySegment(),
    		position.memorySegment()
    	);
    }
    
    /// ```
    /// Creates a 4x4 matrix from a set of euler angles.
    /// @param mat Receives the output matrix
    /// @param x Rotation angle for the x-axis, in radians
    /// @param y Rotation angle for the y-axis, in radians
    /// @param z Rotation angle for the z-axis, in radians
    /// ```
    public static void aiMatrix4FromEulerAngles(
    	MemorySegment mat,
    	float x,
    	float y,
    	float z
    ) {
    	MethodHandle method = AI_MATRIX4_FROM_EULER_ANGLES.get();
    	try {
    		 method.invokeExact(
    			mat,
    			x,
    			y,
    			z
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aiMatrix4FromEulerAngles].
    public static void aiMatrix4FromEulerAngles(
    	AiMatrix4x4 mat,
    	float x,
    	float y,
    	float z
    ) {
    	aiMatrix4FromEulerAngles(
    		mat.memorySegment(),
    		x,
    		y,
    		z
    	);
    }
    
    /// ```
    /// Get a 4x4 rotation matrix around the X axis.
    /// @param mat Receives the output matrix
    /// @param angle Rotation angle, in radians
    /// ```
    public static void aiMatrix4RotationX(
    	MemorySegment mat,
    	float angle
    ) {
    	MethodHandle method = AI_MATRIX4_ROTATION_X.get();
    	try {
    		 method.invokeExact(
    			mat,
    			angle
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aiMatrix4RotationX].
    public static void aiMatrix4RotationX(
    	AiMatrix4x4 mat,
    	float angle
    ) {
    	aiMatrix4RotationX(
    		mat.memorySegment(),
    		angle
    	);
    }
    
    /// ```
    /// Get a 4x4 rotation matrix around the Y axis.
    /// @param mat Receives the output matrix
    /// @param angle Rotation angle, in radians
    /// ```
    public static void aiMatrix4RotationY(
    	MemorySegment mat,
    	float angle
    ) {
    	MethodHandle method = AI_MATRIX4_ROTATION_Y.get();
    	try {
    		 method.invokeExact(
    			mat,
    			angle
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aiMatrix4RotationY].
    public static void aiMatrix4RotationY(
    	AiMatrix4x4 mat,
    	float angle
    ) {
    	aiMatrix4RotationY(
    		mat.memorySegment(),
    		angle
    	);
    }
    
    /// ```
    /// Get a 4x4 rotation matrix around the Z axis.
    /// @param mat Receives the output matrix
    /// @param angle Rotation angle, in radians
    /// ```
    public static void aiMatrix4RotationZ(
    	MemorySegment mat,
    	float angle
    ) {
    	MethodHandle method = AI_MATRIX4_ROTATION_Z.get();
    	try {
    		 method.invokeExact(
    			mat,
    			angle
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aiMatrix4RotationZ].
    public static void aiMatrix4RotationZ(
    	AiMatrix4x4 mat,
    	float angle
    ) {
    	aiMatrix4RotationZ(
    		mat.memorySegment(),
    		angle
    	);
    }
    
    /// ```
    /// Returns a 4x4 rotation matrix for a rotation around an arbitrary axis.
    /// @param mat Receives the output matrix
    /// @param axis Rotation axis, should be a normalized vector
    /// @param angle Rotation angle, in radians
    /// ```
    public static void aiMatrix4FromRotationAroundAxis(
    	MemorySegment mat,
    	MemorySegment axis,
    	float angle
    ) {
    	MethodHandle method = AI_MATRIX4_FROM_ROTATION_AROUND_AXIS.get();
    	try {
    		 method.invokeExact(
    			mat,
    			axis,
    			angle
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aiMatrix4FromRotationAroundAxis].
    public static void aiMatrix4FromRotationAroundAxis(
    	AiMatrix4x4 mat,
    	AiVector3D axis,
    	float angle
    ) {
    	aiMatrix4FromRotationAroundAxis(
    		mat.memorySegment(),
    		axis.memorySegment(),
    		angle
    	);
    }
    
    /// ```
    /// Get a 4x4 translation matrix.
    /// @param mat Receives the output matrix
    /// @param translation The translation vector
    /// ```
    public static void aiMatrix4Translation(
    	MemorySegment mat,
    	MemorySegment translation
    ) {
    	MethodHandle method = AI_MATRIX4_TRANSLATION.get();
    	try {
    		 method.invokeExact(
    			mat,
    			translation
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aiMatrix4Translation].
    public static void aiMatrix4Translation(
    	AiMatrix4x4 mat,
    	AiVector3D translation
    ) {
    	aiMatrix4Translation(
    		mat.memorySegment(),
    		translation.memorySegment()
    	);
    }
    
    /// ```
    /// Get a 4x4 scaling matrix.
    /// @param mat Receives the output matrix
    /// @param scaling The scaling vector
    /// ```
    public static void aiMatrix4Scaling(
    	MemorySegment mat,
    	MemorySegment scaling
    ) {
    	MethodHandle method = AI_MATRIX4_SCALING.get();
    	try {
    		 method.invokeExact(
    			mat,
    			scaling
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aiMatrix4Scaling].
    public static void aiMatrix4Scaling(
    	AiMatrix4x4 mat,
    	AiVector3D scaling
    ) {
    	aiMatrix4Scaling(
    		mat.memorySegment(),
    		scaling.memorySegment()
    	);
    }
    
    /// ```
    /// Create a 4x4 matrix that rotates one vector to another vector.
    /// @param mat Receives the output matrix
    /// @param from Vector to rotate from
    /// @param to Vector to rotate to
    /// ```
    public static void aiMatrix4FromTo(
    	MemorySegment mat,
    	MemorySegment from,
    	MemorySegment to
    ) {
    	MethodHandle method = AI_MATRIX4_FROM_TO.get();
    	try {
    		 method.invokeExact(
    			mat,
    			from,
    			to
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aiMatrix4FromTo].
    public static void aiMatrix4FromTo(
    	AiMatrix4x4 mat,
    	AiVector3D from,
    	AiVector3D to
    ) {
    	aiMatrix4FromTo(
    		mat.memorySegment(),
    		from.memorySegment(),
    		to.memorySegment()
    	);
    }
    
    /// ```
    /// Create a Quaternion from euler angles.
    /// @param q Receives the output quaternion
    /// @param x Rotation angle for the x-axis, in radians
    /// @param y Rotation angle for the y-axis, in radians
    /// @param z Rotation angle for the z-axis, in radians
    /// ```
    public static void aiQuaternionFromEulerAngles(
    	MemorySegment q,
    	float x,
    	float y,
    	float z
    ) {
    	MethodHandle method = AI_QUATERNION_FROM_EULER_ANGLES.get();
    	try {
    		 method.invokeExact(
    			q,
    			x,
    			y,
    			z
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aiQuaternionFromEulerAngles].
    public static void aiQuaternionFromEulerAngles(
    	AiQuaternion q,
    	float x,
    	float y,
    	float z
    ) {
    	aiQuaternionFromEulerAngles(
    		q.memorySegment(),
    		x,
    		y,
    		z
    	);
    }
    
    /// ```
    /// Create a Quaternion from an axis angle pair.
    /// @param q Receives the output quaternion
    /// @param axis The orientation axis
    /// @param angle The rotation angle, in radians
    /// ```
    public static void aiQuaternionFromAxisAngle(
    	MemorySegment q,
    	MemorySegment axis,
    	float angle
    ) {
    	MethodHandle method = AI_QUATERNION_FROM_AXIS_ANGLE.get();
    	try {
    		 method.invokeExact(
    			q,
    			axis,
    			angle
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aiQuaternionFromAxisAngle].
    public static void aiQuaternionFromAxisAngle(
    	AiQuaternion q,
    	AiVector3D axis,
    	float angle
    ) {
    	aiQuaternionFromAxisAngle(
    		q.memorySegment(),
    		axis.memorySegment(),
    		angle
    	);
    }
    
    /// ```
    /// Create a Quaternion from a normalized quaternion stored
    /// in a 3D vector.
    /// @param q Receives the output quaternion
    /// @param normalized The vector that stores the quaternion
    /// ```
    public static void aiQuaternionFromNormalizedQuaternion(
    	MemorySegment q,
    	MemorySegment normalized
    ) {
    	MethodHandle method = AI_QUATERNION_FROM_NORMALIZED_QUATERNION.get();
    	try {
    		 method.invokeExact(
    			q,
    			normalized
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aiQuaternionFromNormalizedQuaternion].
    public static void aiQuaternionFromNormalizedQuaternion(
    	AiQuaternion q,
    	AiVector3D normalized
    ) {
    	aiQuaternionFromNormalizedQuaternion(
    		q.memorySegment(),
    		normalized.memorySegment()
    	);
    }
    
    /// ```
    /// Check if quaternions are equal.
    /// @param a First quaternion to compare
    /// @param b Second quaternion to compare
    /// @return 1 if the quaternions are equal
    /// @return 0 if the quaternions are not equal
    /// ```
    public static int aiQuaternionAreEqual(
    	MemorySegment a,
    	MemorySegment b
    ) {
    	MethodHandle method = AI_QUATERNION_ARE_EQUAL.get();
    	try {
    		return (int) method.invokeExact(
    			a,
    			b
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aiQuaternionAreEqual].
    public static int aiQuaternionAreEqual(
    	AiQuaternion a,
    	AiQuaternion b
    ) {
    	return aiQuaternionAreEqual(
    		a.memorySegment(),
    		b.memorySegment()
    	);
    }
    
    /// ```
    /// Check if quaternions are equal using epsilon.
    /// @param a First quaternion to compare
    /// @param b Second quaternion to compare
    /// @param epsilon Epsilon
    /// @return 1 if the quaternions are equal
    /// @return 0 if the quaternions are not equal
    /// ```
    public static int aiQuaternionAreEqualEpsilon(
    	MemorySegment a,
    	MemorySegment b,
    	float epsilon
    ) {
    	MethodHandle method = AI_QUATERNION_ARE_EQUAL_EPSILON.get();
    	try {
    		return (int) method.invokeExact(
    			a,
    			b,
    			epsilon
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aiQuaternionAreEqualEpsilon].
    public static int aiQuaternionAreEqualEpsilon(
    	AiQuaternion a,
    	AiQuaternion b,
    	float epsilon
    ) {
    	return aiQuaternionAreEqualEpsilon(
    		a.memorySegment(),
    		b.memorySegment(),
    		epsilon
    	);
    }
    
    /// ```
    /// Normalize a quaternion.
    /// @param q Quaternion to normalize
    /// ```
    public static void aiQuaternionNormalize(
    	MemorySegment q
    ) {
    	MethodHandle method = AI_QUATERNION_NORMALIZE.get();
    	try {
    		 method.invokeExact(
    			q
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aiQuaternionNormalize].
    public static void aiQuaternionNormalize(
    	AiQuaternion q
    ) {
    	aiQuaternionNormalize(
    		q.memorySegment()
    	);
    }
    
    /// ```
    /// Compute quaternion conjugate.
    /// @param q Quaternion to compute conjugate,
    /// receives the output quaternion
    /// ```
    public static void aiQuaternionConjugate(
    	MemorySegment q
    ) {
    	MethodHandle method = AI_QUATERNION_CONJUGATE.get();
    	try {
    		 method.invokeExact(
    			q
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aiQuaternionConjugate].
    public static void aiQuaternionConjugate(
    	AiQuaternion q
    ) {
    	aiQuaternionConjugate(
    		q.memorySegment()
    	);
    }
    
    /// ```
    /// Multiply quaternions.
    /// @param dst First quaternion, receives the output quaternion
    /// @param q Second quaternion
    /// ```
    public static void aiQuaternionMultiply(
    	MemorySegment dst,
    	MemorySegment q
    ) {
    	MethodHandle method = AI_QUATERNION_MULTIPLY.get();
    	try {
    		 method.invokeExact(
    			dst,
    			q
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aiQuaternionMultiply].
    public static void aiQuaternionMultiply(
    	AiQuaternion dst,
    	AiQuaternion q
    ) {
    	aiQuaternionMultiply(
    		dst.memorySegment(),
    		q.memorySegment()
    	);
    }
    
    /// ```
    /// Performs a spherical interpolation between two quaternions.
    /// @param dst Receives the quaternion resulting from the interpolation.
    /// @param start Quaternion when factor == 0
    /// @param end Quaternion when factor == 1
    /// @param factor Interpolation factor between 0 and 1
    /// ```
    public static void aiQuaternionInterpolate(
    	MemorySegment dst,
    	MemorySegment start,
    	MemorySegment end,
    	float factor
    ) {
    	MethodHandle method = AI_QUATERNION_INTERPOLATE.get();
    	try {
    		 method.invokeExact(
    			dst,
    			start,
    			end,
    			factor
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aiQuaternionInterpolate].
    public static void aiQuaternionInterpolate(
    	AiQuaternion dst,
    	AiQuaternion start,
    	AiQuaternion end,
    	float factor
    ) {
    	aiQuaternionInterpolate(
    		dst.memorySegment(),
    		start.memorySegment(),
    		end.memorySegment(),
    		factor
    	);
    }
    
    /// ```
    /// 
    /// @brief  Get a string for a given aiTextureType
    /// 
    /// @param  in  The texture type
    /// @return The description string for the texture type.
    /// ```
    public static MemorySegment naiTextureTypeToString(
    	int in
    ) {
    	MethodHandle method = AI_TEXTURE_TYPE_TO_STRING.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			in
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#naiTextureTypeToString].
    public static @Nullable String aiTextureTypeToString(
    	int in
    ) {
    	MemorySegment segment = naiTextureTypeToString(
    		in
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment.getString(0);
    }
    
    /// ```
    /// @brief Retrieve a material property with a specific key from the material
    /// 
    /// @param pMat Pointer to the input material. May not be NULL
    /// @param pKey Key to search for. One of the AI_MATKEY_XXX constants.
    /// @param type Specifies the type of the texture to be retrieved (
    /// e.g. diffuse, specular, height map ...)
    /// @param index Index of the texture to be retrieved.
    /// @param pPropOut Pointer to receive a pointer to a valid aiMaterialProperty
    /// structure or NULL if the key has not been found.
    /// ```
    public static int aiGetMaterialProperty(
    	MemorySegment pMat,
    	MemorySegment pKey,
    	int type,
    	int index,
    	MemorySegment pPropOut
    ) {
    	MethodHandle method = AI_GET_MATERIAL_PROPERTY.get();
    	try {
    		return (int) method.invokeExact(
    			pMat,
    			pKey,
    			type,
    			index,
    			pPropOut
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aiGetMaterialProperty].
    public static int aiGetMaterialProperty(
    	AiMaterial pMat,
    	String pKey,
    	int type,
    	int index,
    	NativePointerArray pPropOut
    ) {
    	try (Arena arena = MemoryStack.stackPush()) {
    		return aiGetMaterialProperty(
    			pMat.memorySegment(),
    			arena.allocateFrom(pKey),
    			type,
    			index,
    			pPropOut.memorySegment()
    		);
    	}
    }
    
    /// ```
    /// @brief Retrieve an array of float values with a specific key
    /// from the material
    /// 
    /// Pass one of the AI_MATKEY_XXX constants for the last three parameters (the
    /// example reads the #AI_MATKEY_UVTRANSFORM property of the first diffuse texture)
    /// @code
    /// aiUVTransform trafo;
    /// unsigned int max = sizeof(aiUVTransform);
    /// if (AI_SUCCESS != aiGetMaterialFloatArray(mat, AI_MATKEY_UVTRANSFORM(aiTextureType_DIFFUSE,0),
    /// (float*)&trafo, &max) || sizeof(aiUVTransform) != max)
    /// {
    /// // error handling
    /// }
    /// @endcode
    /// 
    /// @param pMat Pointer to the input material. May not be NULL
    /// @param pKey Key to search for. One of the AI_MATKEY_XXX constants.
    /// @param pOut Pointer to a buffer to receive the result.
    /// @param pMax Specifies the size of the given buffer, in float's.
    /// Receives the number of values (not bytes!) read.
    /// @param type (see the code sample above)
    /// @param index (see the code sample above)
    /// @return Specifies whether the key has been found. If not, the output
    /// arrays remains unmodified and pMax is set to 0.
    /// ```
    public static int aiGetMaterialFloatArray(
    	MemorySegment pMat,
    	MemorySegment pKey,
    	int type,
    	int index,
    	MemorySegment pOut,
    	MemorySegment pMax
    ) {
    	MethodHandle method = AI_GET_MATERIAL_FLOAT_ARRAY.get();
    	try {
    		return (int) method.invokeExact(
    			pMat,
    			pKey,
    			type,
    			index,
    			pOut,
    			pMax
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aiGetMaterialFloatArray].
    public static int aiGetMaterialFloatArray(
    	AiMaterial pMat,
    	String pKey,
    	int type,
    	int index,
    	NativeFloatArray pOut,
    	NativeIntArray pMax
    ) {
    	try (Arena arena = MemoryStack.stackPush()) {
    		return aiGetMaterialFloatArray(
    			pMat.memorySegment(),
    			arena.allocateFrom(pKey),
    			type,
    			index,
    			pOut.memorySegment(),
    			pMax.memorySegment()
    		);
    	}
    }
    
    /// ```
    /// @brief Retrieve an array of integer values with a specific key
    /// from a material
    /// 
    /// See the sample for aiGetMaterialFloatArray for more information.
    /// ```
    public static int aiGetMaterialIntegerArray(
    	MemorySegment pMat,
    	MemorySegment pKey,
    	int type,
    	int index,
    	MemorySegment pOut,
    	MemorySegment pMax
    ) {
    	MethodHandle method = AI_GET_MATERIAL_INTEGER_ARRAY.get();
    	try {
    		return (int) method.invokeExact(
    			pMat,
    			pKey,
    			type,
    			index,
    			pOut,
    			pMax
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aiGetMaterialIntegerArray].
    public static int aiGetMaterialIntegerArray(
    	AiMaterial pMat,
    	String pKey,
    	int type,
    	int index,
    	NativeIntArray pOut,
    	NativeIntArray pMax
    ) {
    	try (Arena arena = MemoryStack.stackPush()) {
    		return aiGetMaterialIntegerArray(
    			pMat.memorySegment(),
    			arena.allocateFrom(pKey),
    			type,
    			index,
    			pOut.memorySegment(),
    			pMax.memorySegment()
    		);
    	}
    }
    
    /// ```
    /// @brief Retrieve a color value from the material property table
    /// 
    /// See the sample for aiGetMaterialFloat for more information
    /// ```
    public static int aiGetMaterialColor(
    	MemorySegment pMat,
    	MemorySegment pKey,
    	int type,
    	int index,
    	MemorySegment pOut
    ) {
    	MethodHandle method = AI_GET_MATERIAL_COLOR.get();
    	try {
    		return (int) method.invokeExact(
    			pMat,
    			pKey,
    			type,
    			index,
    			pOut
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aiGetMaterialColor].
    public static int aiGetMaterialColor(
    	AiMaterial pMat,
    	String pKey,
    	int type,
    	int index,
    	AiColor4D pOut
    ) {
    	try (Arena arena = MemoryStack.stackPush()) {
    		return aiGetMaterialColor(
    			pMat.memorySegment(),
    			arena.allocateFrom(pKey),
    			type,
    			index,
    			pOut.memorySegment()
    		);
    	}
    }
    
    /// ```
    /// @brief Retrieve a aiUVTransform value from the material property table
    /// 
    /// See the sample for aiGetMaterialFloat for more information
    /// ```
    public static int aiGetMaterialUVTransform(
    	MemorySegment pMat,
    	MemorySegment pKey,
    	int type,
    	int index,
    	MemorySegment pOut
    ) {
    	MethodHandle method = AI_GET_MATERIAL_UVTRANSFORM.get();
    	try {
    		return (int) method.invokeExact(
    			pMat,
    			pKey,
    			type,
    			index,
    			pOut
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aiGetMaterialUVTransform].
    public static int aiGetMaterialUVTransform(
    	AiMaterial pMat,
    	String pKey,
    	int type,
    	int index,
    	AiUVTransform pOut
    ) {
    	try (Arena arena = MemoryStack.stackPush()) {
    		return aiGetMaterialUVTransform(
    			pMat.memorySegment(),
    			arena.allocateFrom(pKey),
    			type,
    			index,
    			pOut.memorySegment()
    		);
    	}
    }
    
    /// ```
    /// @brief Retrieve a string from the material property table
    /// 
    /// See the sample for aiGetMaterialFloat for more information.
    /// ```
    public static int aiGetMaterialString(
    	MemorySegment pMat,
    	MemorySegment pKey,
    	int type,
    	int index,
    	MemorySegment pOut
    ) {
    	MethodHandle method = AI_GET_MATERIAL_STRING.get();
    	try {
    		return (int) method.invokeExact(
    			pMat,
    			pKey,
    			type,
    			index,
    			pOut
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aiGetMaterialString].
    public static int aiGetMaterialString(
    	AiMaterial pMat,
    	String pKey,
    	int type,
    	int index,
    	AiString pOut
    ) {
    	try (Arena arena = MemoryStack.stackPush()) {
    		return aiGetMaterialString(
    			pMat.memorySegment(),
    			arena.allocateFrom(pKey),
    			type,
    			index,
    			pOut.memorySegment()
    		);
    	}
    }
    
    /// ```
    /// Get the number of textures for a particular texture type.
    /// @param[in] pMat Pointer to the input material. May not be NULL
    /// @param type Texture type to check for
    /// @return Number of textures for this type.
    /// @note A texture can be easily queried using #aiGetMaterialTexture()
    /// ```
    public static int aiGetMaterialTextureCount(
    	MemorySegment pMat,
    	int type
    ) {
    	MethodHandle method = AI_GET_MATERIAL_TEXTURE_COUNT.get();
    	try {
    		return (int) method.invokeExact(
    			pMat,
    			type
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aiGetMaterialTextureCount].
    public static int aiGetMaterialTextureCount(
    	AiMaterial pMat,
    	int type
    ) {
    	return aiGetMaterialTextureCount(
    		pMat.memorySegment(),
    		type
    	);
    }
    
    public static int aiGetMaterialTexture(
    	MemorySegment mat,
    	int type,
    	int index,
    	MemorySegment path,
    	MemorySegment mapping,
    	MemorySegment uvindex,
    	MemorySegment blend,
    	MemorySegment op,
    	MemorySegment mapmode,
    	MemorySegment flags
    ) {
    	MethodHandle method = AI_GET_MATERIAL_TEXTURE.get();
    	try {
    		return (int) method.invokeExact(
    			mat,
    			type,
    			index,
    			path,
    			mapping,
    			uvindex,
    			blend,
    			op,
    			mapmode,
    			flags
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#aiGetMaterialTexture].
    public static int aiGetMaterialTexture(
    	AiMaterial mat,
    	int type,
    	int index,
    	AiString path,
    	@Nullable NativeIntArray mapping,
    	@Nullable NativeIntArray uvindex,
    	@Nullable NativeFloatArray blend,
    	@Nullable NativeIntArray op,
    	@Nullable NativeIntArray mapmode,
    	@Nullable NativeIntArray flags
    ) {
    	return aiGetMaterialTexture(
    		mat.memorySegment(),
    		type,
    		index,
    		path.memorySegment(),
    		mapping == null ? MemorySegment.NULL : mapping.memorySegment(),
    		uvindex == null ? MemorySegment.NULL : uvindex.memorySegment(),
    		blend == null ? MemorySegment.NULL : blend.memorySegment(),
    		op == null ? MemorySegment.NULL : op.memorySegment(),
    		mapmode == null ? MemorySegment.NULL : mapmode.memorySegment(),
    		flags == null ? MemorySegment.NULL : flags.memorySegment()
    	);
    }
    
    /// ```
    /// @brief Returns a string with legal copyright and licensing information
    /// about Assimp. The string may include multiple lines.
    /// @return Pointer to static string.
    /// ```
    public static MemorySegment naiGetLegalString() {
    	MethodHandle method = AI_GET_LEGAL_STRING.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#naiGetLegalString].
    public static @Nullable String aiGetLegalString() {
    	MemorySegment segment = naiGetLegalString();
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    	
    	return segment.getString(0);
    }
    
    /// ```
    /// @brief Returns the current patch version number of Assimp.
    /// @return Patch version of the Assimp runtime the application was
    /// linked/built against
    /// ```
    public static int aiGetVersionPatch() {
    	MethodHandle method = AI_GET_VERSION_PATCH.get();
    	try {
    		return (int) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// @brief Returns the current minor version number of Assimp.
    /// @return Minor version of the Assimp runtime the application was
    /// linked/built against
    /// ```
    public static int aiGetVersionMinor() {
    	MethodHandle method = AI_GET_VERSION_MINOR.get();
    	try {
    		return (int) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// @brief Returns the current major version number of Assimp.
    /// @return Major version of the Assimp runtime the application was
    /// linked/built against
    /// ```
    public static int aiGetVersionMajor() {
    	MethodHandle method = AI_GET_VERSION_MAJOR.get();
    	try {
    		return (int) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// @brief Returns the repository revision of the Assimp runtime.
    /// @return SVN Repository revision number of the Assimp runtime the
    /// application was linked/built against.
    /// ```
    public static int aiGetVersionRevision() {
    	MethodHandle method = AI_GET_VERSION_REVISION.get();
    	try {
    		return (int) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// @brief Returns the branch-name of the Assimp runtime.
    /// @return The current branch name.
    /// ```
    public static MemorySegment naiGetBranchName() {
    	MethodHandle method = AI_GET_BRANCH_NAME.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#naiGetBranchName].
    public static @Nullable String aiGetBranchName() {
    	MemorySegment segment = naiGetBranchName();
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    	
    	return segment.getString(0);
    }
    
    /// ```
    /// @brief Returns assimp's compile flags
    /// @return Any bitwise combination of the ASSIMP_CFLAGS_xxx constants.
    /// ```
    public static int aiGetCompileFlags() {
    	MethodHandle method = AI_GET_COMPILE_FLAGS.get();
    	try {
    		return (int) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
}