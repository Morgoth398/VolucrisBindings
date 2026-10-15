/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.opengl;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.MemoryStack;
import volucris.bindings.core.NativeByteArray;
import volucris.bindings.core.NativeDoubleArray;
import volucris.bindings.core.NativeFloatArray;
import volucris.bindings.core.NativeIntArray;
import volucris.bindings.core.NativeLongArray;
import volucris.bindings.core.NativePointerArray;
import volucris.bindings.core.NativeShortArray;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class GL {

	public static final int GL_DEPTH_BUFFER_BIT = 0x00000100;
	public static final int GL_STENCIL_BUFFER_BIT = 0x00000400;
	public static final int GL_COLOR_BUFFER_BIT = 0x00004000;
	public static final int GL_FALSE = 0;
	public static final int GL_TRUE = 1;
	public static final int GL_POINTS = 0x0000;
	public static final int GL_LINES = 0x0001;
	public static final int GL_LINE_LOOP = 0x0002;
	public static final int GL_LINE_STRIP = 0x0003;
	public static final int GL_TRIANGLES = 0x0004;
	public static final int GL_TRIANGLE_STRIP = 0x0005;
	public static final int GL_TRIANGLE_FAN = 0x0006;
	public static final int GL_NEVER = 0x0200;
	public static final int GL_LESS = 0x0201;
	public static final int GL_EQUAL = 0x0202;
	public static final int GL_LEQUAL = 0x0203;
	public static final int GL_GREATER = 0x0204;
	public static final int GL_NOTEQUAL = 0x0205;
	public static final int GL_GEQUAL = 0x0206;
	public static final int GL_ALWAYS = 0x0207;
	public static final int GL_ZERO = 0;
	public static final int GL_ONE = 1;
	public static final int GL_SRC_COLOR = 0x0300;
	public static final int GL_ONE_MINUS_SRC_COLOR = 0x0301;
	public static final int GL_SRC_ALPHA = 0x0302;
	public static final int GL_ONE_MINUS_SRC_ALPHA = 0x0303;
	public static final int GL_DST_ALPHA = 0x0304;
	public static final int GL_ONE_MINUS_DST_ALPHA = 0x0305;
	public static final int GL_DST_COLOR = 0x0306;
	public static final int GL_ONE_MINUS_DST_COLOR = 0x0307;
	public static final int GL_SRC_ALPHA_SATURATE = 0x0308;
	public static final int GL_NONE = 0;
	public static final int GL_FRONT_LEFT = 0x0400;
	public static final int GL_FRONT_RIGHT = 0x0401;
	public static final int GL_BACK_LEFT = 0x0402;
	public static final int GL_BACK_RIGHT = 0x0403;
	public static final int GL_FRONT = 0x0404;
	public static final int GL_BACK = 0x0405;
	public static final int GL_LEFT = 0x0406;
	public static final int GL_RIGHT = 0x0407;
	public static final int GL_FRONT_AND_BACK = 0x0408;
	public static final int GL_NO_ERROR = 0;
	public static final int GL_INVALID_ENUM = 0x0500;
	public static final int GL_INVALID_VALUE = 0x0501;
	public static final int GL_INVALID_OPERATION = 0x0502;
	public static final int GL_OUT_OF_MEMORY = 0x0505;
	public static final int GL_CW = 0x0900;
	public static final int GL_CCW = 0x0901;
	public static final int GL_POINT_SIZE = 0x0B11;
	public static final int GL_POINT_SIZE_RANGE = 0x0B12;
	public static final int GL_POINT_SIZE_GRANULARITY = 0x0B13;
	public static final int GL_LINE_SMOOTH = 0x0B20;
	public static final int GL_LINE_WIDTH = 0x0B21;
	public static final int GL_LINE_WIDTH_RANGE = 0x0B22;
	public static final int GL_LINE_WIDTH_GRANULARITY = 0x0B23;
	public static final int GL_POLYGON_MODE = 0x0B40;
	public static final int GL_POLYGON_SMOOTH = 0x0B41;
	public static final int GL_CULL_FACE = 0x0B44;
	public static final int GL_CULL_FACE_MODE = 0x0B45;
	public static final int GL_FRONT_FACE = 0x0B46;
	public static final int GL_DEPTH_RANGE = 0x0B70;
	public static final int GL_DEPTH_TEST = 0x0B71;
	public static final int GL_DEPTH_WRITEMASK = 0x0B72;
	public static final int GL_DEPTH_CLEAR_VALUE = 0x0B73;
	public static final int GL_DEPTH_FUNC = 0x0B74;
	public static final int GL_STENCIL_TEST = 0x0B90;
	public static final int GL_STENCIL_CLEAR_VALUE = 0x0B91;
	public static final int GL_STENCIL_FUNC = 0x0B92;
	public static final int GL_STENCIL_VALUE_MASK = 0x0B93;
	public static final int GL_STENCIL_FAIL = 0x0B94;
	public static final int GL_STENCIL_PASS_DEPTH_FAIL = 0x0B95;
	public static final int GL_STENCIL_PASS_DEPTH_PASS = 0x0B96;
	public static final int GL_STENCIL_REF = 0x0B97;
	public static final int GL_STENCIL_WRITEMASK = 0x0B98;
	public static final int GL_VIEWPORT = 0x0BA2;
	public static final int GL_DITHER = 0x0BD0;
	public static final int GL_BLEND_DST = 0x0BE0;
	public static final int GL_BLEND_SRC = 0x0BE1;
	public static final int GL_BLEND = 0x0BE2;
	public static final int GL_LOGIC_OP_MODE = 0x0BF0;
	public static final int GL_DRAW_BUFFER = 0x0C01;
	public static final int GL_READ_BUFFER = 0x0C02;
	public static final int GL_SCISSOR_BOX = 0x0C10;
	public static final int GL_SCISSOR_TEST = 0x0C11;
	public static final int GL_COLOR_CLEAR_VALUE = 0x0C22;
	public static final int GL_COLOR_WRITEMASK = 0x0C23;
	public static final int GL_DOUBLEBUFFER = 0x0C32;
	public static final int GL_STEREO = 0x0C33;
	public static final int GL_LINE_SMOOTH_HINT = 0x0C52;
	public static final int GL_POLYGON_SMOOTH_HINT = 0x0C53;
	public static final int GL_UNPACK_SWAP_BYTES = 0x0CF0;
	public static final int GL_UNPACK_LSB_FIRST = 0x0CF1;
	public static final int GL_UNPACK_ROW_LENGTH = 0x0CF2;
	public static final int GL_UNPACK_SKIP_ROWS = 0x0CF3;
	public static final int GL_UNPACK_SKIP_PIXELS = 0x0CF4;
	public static final int GL_UNPACK_ALIGNMENT = 0x0CF5;
	public static final int GL_PACK_SWAP_BYTES = 0x0D00;
	public static final int GL_PACK_LSB_FIRST = 0x0D01;
	public static final int GL_PACK_ROW_LENGTH = 0x0D02;
	public static final int GL_PACK_SKIP_ROWS = 0x0D03;
	public static final int GL_PACK_SKIP_PIXELS = 0x0D04;
	public static final int GL_PACK_ALIGNMENT = 0x0D05;
	public static final int GL_MAX_TEXTURE_SIZE = 0x0D33;
	public static final int GL_MAX_VIEWPORT_DIMS = 0x0D3A;
	public static final int GL_SUBPIXEL_BITS = 0x0D50;
	public static final int GL_TEXTURE_1D = 0x0DE0;
	public static final int GL_TEXTURE_2D = 0x0DE1;
	public static final int GL_TEXTURE_WIDTH = 0x1000;
	public static final int GL_TEXTURE_HEIGHT = 0x1001;
	public static final int GL_TEXTURE_BORDER_COLOR = 0x1004;
	public static final int GL_DONT_CARE = 0x1100;
	public static final int GL_FASTEST = 0x1101;
	public static final int GL_NICEST = 0x1102;
	public static final int GL_BYTE = 0x1400;
	public static final int GL_UNSIGNED_BYTE = 0x1401;
	public static final int GL_SHORT = 0x1402;
	public static final int GL_UNSIGNED_SHORT = 0x1403;
	public static final int GL_INT = 0x1404;
	public static final int GL_UNSIGNED_INT = 0x1405;
	public static final int GL_FLOAT = 0x1406;
	public static final int GL_CLEAR = 0x1500;
	public static final int GL_AND = 0x1501;
	public static final int GL_AND_REVERSE = 0x1502;
	public static final int GL_COPY = 0x1503;
	public static final int GL_AND_INVERTED = 0x1504;
	public static final int GL_NOOP = 0x1505;
	public static final int GL_XOR = 0x1506;
	public static final int GL_OR = 0x1507;
	public static final int GL_NOR = 0x1508;
	public static final int GL_EQUIV = 0x1509;
	public static final int GL_INVERT = 0x150A;
	public static final int GL_OR_REVERSE = 0x150B;
	public static final int GL_COPY_INVERTED = 0x150C;
	public static final int GL_OR_INVERTED = 0x150D;
	public static final int GL_NAND = 0x150E;
	public static final int GL_SET = 0x150F;
	public static final int GL_TEXTURE = 0x1702;
	public static final int GL_COLOR = 0x1800;
	public static final int GL_DEPTH = 0x1801;
	public static final int GL_STENCIL = 0x1802;
	public static final int GL_STENCIL_INDEX = 0x1901;
	public static final int GL_DEPTH_COMPONENT = 0x1902;
	public static final int GL_RED = 0x1903;
	public static final int GL_GREEN = 0x1904;
	public static final int GL_BLUE = 0x1905;
	public static final int GL_ALPHA = 0x1906;
	public static final int GL_RGB = 0x1907;
	public static final int GL_RGBA = 0x1908;
	public static final int GL_POINT = 0x1B00;
	public static final int GL_LINE = 0x1B01;
	public static final int GL_FILL = 0x1B02;
	public static final int GL_KEEP = 0x1E00;
	public static final int GL_REPLACE = 0x1E01;
	public static final int GL_INCR = 0x1E02;
	public static final int GL_DECR = 0x1E03;
	public static final int GL_VENDOR = 0x1F00;
	public static final int GL_RENDERER = 0x1F01;
	public static final int GL_VERSION = 0x1F02;
	public static final int GL_EXTENSIONS = 0x1F03;
	public static final int GL_NEAREST = 0x2600;
	public static final int GL_LINEAR = 0x2601;
	public static final int GL_NEAREST_MIPMAP_NEAREST = 0x2700;
	public static final int GL_LINEAR_MIPMAP_NEAREST = 0x2701;
	public static final int GL_NEAREST_MIPMAP_LINEAR = 0x2702;
	public static final int GL_LINEAR_MIPMAP_LINEAR = 0x2703;
	public static final int GL_TEXTURE_MAG_FILTER = 0x2800;
	public static final int GL_TEXTURE_MIN_FILTER = 0x2801;
	public static final int GL_TEXTURE_WRAP_S = 0x2802;
	public static final int GL_TEXTURE_WRAP_T = 0x2803;
	public static final int GL_REPEAT = 0x2901;
	public static final int GL_COLOR_LOGIC_OP = 0x0BF2;
	public static final int GL_POLYGON_OFFSET_UNITS = 0x2A00;
	public static final int GL_POLYGON_OFFSET_POINT = 0x2A01;
	public static final int GL_POLYGON_OFFSET_LINE = 0x2A02;
	public static final int GL_POLYGON_OFFSET_FILL = 0x8037;
	public static final int GL_POLYGON_OFFSET_FACTOR = 0x8038;
	public static final int GL_TEXTURE_BINDING_1D = 0x8068;
	public static final int GL_TEXTURE_BINDING_2D = 0x8069;
	public static final int GL_TEXTURE_INTERNAL_FORMAT = 0x1003;
	public static final int GL_TEXTURE_RED_SIZE = 0x805C;
	public static final int GL_TEXTURE_GREEN_SIZE = 0x805D;
	public static final int GL_TEXTURE_BLUE_SIZE = 0x805E;
	public static final int GL_TEXTURE_ALPHA_SIZE = 0x805F;
	public static final int GL_DOUBLE = 0x140A;
	public static final int GL_PROXY_TEXTURE_1D = 0x8063;
	public static final int GL_PROXY_TEXTURE_2D = 0x8064;
	public static final int GL_R3_G3_B2 = 0x2A10;
	public static final int GL_RGB4 = 0x804F;
	public static final int GL_RGB5 = 0x8050;
	public static final int GL_RGB8 = 0x8051;
	public static final int GL_RGB10 = 0x8052;
	public static final int GL_RGB12 = 0x8053;
	public static final int GL_RGB16 = 0x8054;
	public static final int GL_RGBA2 = 0x8055;
	public static final int GL_RGBA4 = 0x8056;
	public static final int GL_RGB5_A1 = 0x8057;
	public static final int GL_RGBA8 = 0x8058;
	public static final int GL_RGB10_A2 = 0x8059;
	public static final int GL_RGBA12 = 0x805A;
	public static final int GL_RGBA16 = 0x805B;
	public static final int GL_UNSIGNED_BYTE_3_3_2 = 0x8032;
	public static final int GL_UNSIGNED_SHORT_4_4_4_4 = 0x8033;
	public static final int GL_UNSIGNED_SHORT_5_5_5_1 = 0x8034;
	public static final int GL_UNSIGNED_INT_8_8_8_8 = 0x8035;
	public static final int GL_UNSIGNED_INT_10_10_10_2 = 0x8036;
	public static final int GL_TEXTURE_BINDING_3D = 0x806A;
	public static final int GL_PACK_SKIP_IMAGES = 0x806B;
	public static final int GL_PACK_IMAGE_HEIGHT = 0x806C;
	public static final int GL_UNPACK_SKIP_IMAGES = 0x806D;
	public static final int GL_UNPACK_IMAGE_HEIGHT = 0x806E;
	public static final int GL_TEXTURE_3D = 0x806F;
	public static final int GL_PROXY_TEXTURE_3D = 0x8070;
	public static final int GL_TEXTURE_DEPTH = 0x8071;
	public static final int GL_TEXTURE_WRAP_R = 0x8072;
	public static final int GL_MAX_3D_TEXTURE_SIZE = 0x8073;
	public static final int GL_UNSIGNED_BYTE_2_3_3_REV = 0x8362;
	public static final int GL_UNSIGNED_SHORT_5_6_5 = 0x8363;
	public static final int GL_UNSIGNED_SHORT_5_6_5_REV = 0x8364;
	public static final int GL_UNSIGNED_SHORT_4_4_4_4_REV = 0x8365;
	public static final int GL_UNSIGNED_SHORT_1_5_5_5_REV = 0x8366;
	public static final int GL_UNSIGNED_INT_8_8_8_8_REV = 0x8367;
	public static final int GL_UNSIGNED_INT_2_10_10_10_REV = 0x8368;
	public static final int GL_BGR = 0x80E0;
	public static final int GL_BGRA = 0x80E1;
	public static final int GL_MAX_ELEMENTS_VERTICES = 0x80E8;
	public static final int GL_MAX_ELEMENTS_INDICES = 0x80E9;
	public static final int GL_CLAMP_TO_EDGE = 0x812F;
	public static final int GL_TEXTURE_MIN_LOD = 0x813A;
	public static final int GL_TEXTURE_MAX_LOD = 0x813B;
	public static final int GL_TEXTURE_BASE_LEVEL = 0x813C;
	public static final int GL_TEXTURE_MAX_LEVEL = 0x813D;
	public static final int GL_SMOOTH_POINT_SIZE_RANGE = 0x0B12;
	public static final int GL_SMOOTH_POINT_SIZE_GRANULARITY = 0x0B13;
	public static final int GL_SMOOTH_LINE_WIDTH_RANGE = 0x0B22;
	public static final int GL_SMOOTH_LINE_WIDTH_GRANULARITY = 0x0B23;
	public static final int GL_ALIASED_LINE_WIDTH_RANGE = 0x846E;
	public static final int GL_TEXTURE0 = 0x84C0;
	public static final int GL_TEXTURE1 = 0x84C1;
	public static final int GL_TEXTURE2 = 0x84C2;
	public static final int GL_TEXTURE3 = 0x84C3;
	public static final int GL_TEXTURE4 = 0x84C4;
	public static final int GL_TEXTURE5 = 0x84C5;
	public static final int GL_TEXTURE6 = 0x84C6;
	public static final int GL_TEXTURE7 = 0x84C7;
	public static final int GL_TEXTURE8 = 0x84C8;
	public static final int GL_TEXTURE9 = 0x84C9;
	public static final int GL_TEXTURE10 = 0x84CA;
	public static final int GL_TEXTURE11 = 0x84CB;
	public static final int GL_TEXTURE12 = 0x84CC;
	public static final int GL_TEXTURE13 = 0x84CD;
	public static final int GL_TEXTURE14 = 0x84CE;
	public static final int GL_TEXTURE15 = 0x84CF;
	public static final int GL_TEXTURE16 = 0x84D0;
	public static final int GL_TEXTURE17 = 0x84D1;
	public static final int GL_TEXTURE18 = 0x84D2;
	public static final int GL_TEXTURE19 = 0x84D3;
	public static final int GL_TEXTURE20 = 0x84D4;
	public static final int GL_TEXTURE21 = 0x84D5;
	public static final int GL_TEXTURE22 = 0x84D6;
	public static final int GL_TEXTURE23 = 0x84D7;
	public static final int GL_TEXTURE24 = 0x84D8;
	public static final int GL_TEXTURE25 = 0x84D9;
	public static final int GL_TEXTURE26 = 0x84DA;
	public static final int GL_TEXTURE27 = 0x84DB;
	public static final int GL_TEXTURE28 = 0x84DC;
	public static final int GL_TEXTURE29 = 0x84DD;
	public static final int GL_TEXTURE30 = 0x84DE;
	public static final int GL_TEXTURE31 = 0x84DF;
	public static final int GL_ACTIVE_TEXTURE = 0x84E0;
	public static final int GL_MULTISAMPLE = 0x809D;
	public static final int GL_SAMPLE_ALPHA_TO_COVERAGE = 0x809E;
	public static final int GL_SAMPLE_ALPHA_TO_ONE = 0x809F;
	public static final int GL_SAMPLE_COVERAGE = 0x80A0;
	public static final int GL_SAMPLE_BUFFERS = 0x80A8;
	public static final int GL_SAMPLES = 0x80A9;
	public static final int GL_SAMPLE_COVERAGE_VALUE = 0x80AA;
	public static final int GL_SAMPLE_COVERAGE_INVERT = 0x80AB;
	public static final int GL_TEXTURE_CUBE_MAP = 0x8513;
	public static final int GL_TEXTURE_BINDING_CUBE_MAP = 0x8514;
	public static final int GL_TEXTURE_CUBE_MAP_POSITIVE_X = 0x8515;
	public static final int GL_TEXTURE_CUBE_MAP_NEGATIVE_X = 0x8516;
	public static final int GL_TEXTURE_CUBE_MAP_POSITIVE_Y = 0x8517;
	public static final int GL_TEXTURE_CUBE_MAP_NEGATIVE_Y = 0x8518;
	public static final int GL_TEXTURE_CUBE_MAP_POSITIVE_Z = 0x8519;
	public static final int GL_TEXTURE_CUBE_MAP_NEGATIVE_Z = 0x851A;
	public static final int GL_PROXY_TEXTURE_CUBE_MAP = 0x851B;
	public static final int GL_MAX_CUBE_MAP_TEXTURE_SIZE = 0x851C;
	public static final int GL_COMPRESSED_RGB = 0x84ED;
	public static final int GL_COMPRESSED_RGBA = 0x84EE;
	public static final int GL_TEXTURE_COMPRESSION_HINT = 0x84EF;
	public static final int GL_TEXTURE_COMPRESSED_IMAGE_SIZE = 0x86A0;
	public static final int GL_TEXTURE_COMPRESSED = 0x86A1;
	public static final int GL_NUM_COMPRESSED_TEXTURE_FORMATS = 0x86A2;
	public static final int GL_COMPRESSED_TEXTURE_FORMATS = 0x86A3;
	public static final int GL_CLAMP_TO_BORDER = 0x812D;
	public static final int GL_BLEND_DST_RGB = 0x80C8;
	public static final int GL_BLEND_SRC_RGB = 0x80C9;
	public static final int GL_BLEND_DST_ALPHA = 0x80CA;
	public static final int GL_BLEND_SRC_ALPHA = 0x80CB;
	public static final int GL_POINT_FADE_THRESHOLD_SIZE = 0x8128;
	public static final int GL_DEPTH_COMPONENT16 = 0x81A5;
	public static final int GL_DEPTH_COMPONENT24 = 0x81A6;
	public static final int GL_DEPTH_COMPONENT32 = 0x81A7;
	public static final int GL_MIRRORED_REPEAT = 0x8370;
	public static final int GL_MAX_TEXTURE_LOD_BIAS = 0x84FD;
	public static final int GL_TEXTURE_LOD_BIAS = 0x8501;
	public static final int GL_INCR_WRAP = 0x8507;
	public static final int GL_DECR_WRAP = 0x8508;
	public static final int GL_TEXTURE_DEPTH_SIZE = 0x884A;
	public static final int GL_TEXTURE_COMPARE_MODE = 0x884C;
	public static final int GL_TEXTURE_COMPARE_FUNC = 0x884D;
	public static final int GL_BLEND_COLOR = 0x8005;
	public static final int GL_BLEND_EQUATION = 0x8009;
	public static final int GL_CONSTANT_COLOR = 0x8001;
	public static final int GL_ONE_MINUS_CONSTANT_COLOR = 0x8002;
	public static final int GL_CONSTANT_ALPHA = 0x8003;
	public static final int GL_ONE_MINUS_CONSTANT_ALPHA = 0x8004;
	public static final int GL_FUNC_ADD = 0x8006;
	public static final int GL_FUNC_REVERSE_SUBTRACT = 0x800B;
	public static final int GL_FUNC_SUBTRACT = 0x800A;
	public static final int GL_MIN = 0x8007;
	public static final int GL_MAX = 0x8008;
	public static final int GL_BUFFER_SIZE = 0x8764;
	public static final int GL_BUFFER_USAGE = 0x8765;
	public static final int GL_QUERY_COUNTER_BITS = 0x8864;
	public static final int GL_CURRENT_QUERY = 0x8865;
	public static final int GL_QUERY_RESULT = 0x8866;
	public static final int GL_QUERY_RESULT_AVAILABLE = 0x8867;
	public static final int GL_ARRAY_BUFFER = 0x8892;
	public static final int GL_ELEMENT_ARRAY_BUFFER = 0x8893;
	public static final int GL_ARRAY_BUFFER_BINDING = 0x8894;
	public static final int GL_ELEMENT_ARRAY_BUFFER_BINDING = 0x8895;
	public static final int GL_VERTEX_ATTRIB_ARRAY_BUFFER_BINDING = 0x889F;
	public static final int GL_READ_ONLY = 0x88B8;
	public static final int GL_WRITE_ONLY = 0x88B9;
	public static final int GL_READ_WRITE = 0x88BA;
	public static final int GL_BUFFER_ACCESS = 0x88BB;
	public static final int GL_BUFFER_MAPPED = 0x88BC;
	public static final int GL_BUFFER_MAP_POINTER = 0x88BD;
	public static final int GL_STREAM_DRAW = 0x88E0;
	public static final int GL_STREAM_READ = 0x88E1;
	public static final int GL_STREAM_COPY = 0x88E2;
	public static final int GL_STATIC_DRAW = 0x88E4;
	public static final int GL_STATIC_READ = 0x88E5;
	public static final int GL_STATIC_COPY = 0x88E6;
	public static final int GL_DYNAMIC_DRAW = 0x88E8;
	public static final int GL_DYNAMIC_READ = 0x88E9;
	public static final int GL_DYNAMIC_COPY = 0x88EA;
	public static final int GL_SAMPLES_PASSED = 0x8914;
	public static final int GL_SRC1_ALPHA = 0x8589;
	public static final int GL_BLEND_EQUATION_RGB = 0x8009;
	public static final int GL_VERTEX_ATTRIB_ARRAY_ENABLED = 0x8622;
	public static final int GL_VERTEX_ATTRIB_ARRAY_SIZE = 0x8623;
	public static final int GL_VERTEX_ATTRIB_ARRAY_STRIDE = 0x8624;
	public static final int GL_VERTEX_ATTRIB_ARRAY_TYPE = 0x8625;
	public static final int GL_CURRENT_VERTEX_ATTRIB = 0x8626;
	public static final int GL_VERTEX_PROGRAM_POINT_SIZE = 0x8642;
	public static final int GL_VERTEX_ATTRIB_ARRAY_POINTER = 0x8645;
	public static final int GL_STENCIL_BACK_FUNC = 0x8800;
	public static final int GL_STENCIL_BACK_FAIL = 0x8801;
	public static final int GL_STENCIL_BACK_PASS_DEPTH_FAIL = 0x8802;
	public static final int GL_STENCIL_BACK_PASS_DEPTH_PASS = 0x8803;
	public static final int GL_MAX_DRAW_BUFFERS = 0x8824;
	public static final int GL_DRAW_BUFFER0 = 0x8825;
	public static final int GL_DRAW_BUFFER1 = 0x8826;
	public static final int GL_DRAW_BUFFER2 = 0x8827;
	public static final int GL_DRAW_BUFFER3 = 0x8828;
	public static final int GL_DRAW_BUFFER4 = 0x8829;
	public static final int GL_DRAW_BUFFER5 = 0x882A;
	public static final int GL_DRAW_BUFFER6 = 0x882B;
	public static final int GL_DRAW_BUFFER7 = 0x882C;
	public static final int GL_DRAW_BUFFER8 = 0x882D;
	public static final int GL_DRAW_BUFFER9 = 0x882E;
	public static final int GL_DRAW_BUFFER10 = 0x882F;
	public static final int GL_DRAW_BUFFER11 = 0x8830;
	public static final int GL_DRAW_BUFFER12 = 0x8831;
	public static final int GL_DRAW_BUFFER13 = 0x8832;
	public static final int GL_DRAW_BUFFER14 = 0x8833;
	public static final int GL_DRAW_BUFFER15 = 0x8834;
	public static final int GL_BLEND_EQUATION_ALPHA = 0x883D;
	public static final int GL_MAX_VERTEX_ATTRIBS = 0x8869;
	public static final int GL_VERTEX_ATTRIB_ARRAY_NORMALIZED = 0x886A;
	public static final int GL_MAX_TEXTURE_IMAGE_UNITS = 0x8872;
	public static final int GL_FRAGMENT_SHADER = 0x8B30;
	public static final int GL_VERTEX_SHADER = 0x8B31;
	public static final int GL_MAX_FRAGMENT_UNIFORM_COMPONENTS = 0x8B49;
	public static final int GL_MAX_VERTEX_UNIFORM_COMPONENTS = 0x8B4A;
	public static final int GL_MAX_VARYING_FLOATS = 0x8B4B;
	public static final int GL_MAX_VERTEX_TEXTURE_IMAGE_UNITS = 0x8B4C;
	public static final int GL_MAX_COMBINED_TEXTURE_IMAGE_UNITS = 0x8B4D;
	public static final int GL_SHADER_TYPE = 0x8B4F;
	public static final int GL_FLOAT_VEC2 = 0x8B50;
	public static final int GL_FLOAT_VEC3 = 0x8B51;
	public static final int GL_FLOAT_VEC4 = 0x8B52;
	public static final int GL_INT_VEC2 = 0x8B53;
	public static final int GL_INT_VEC3 = 0x8B54;
	public static final int GL_INT_VEC4 = 0x8B55;
	public static final int GL_BOOL = 0x8B56;
	public static final int GL_BOOL_VEC2 = 0x8B57;
	public static final int GL_BOOL_VEC3 = 0x8B58;
	public static final int GL_BOOL_VEC4 = 0x8B59;
	public static final int GL_FLOAT_MAT2 = 0x8B5A;
	public static final int GL_FLOAT_MAT3 = 0x8B5B;
	public static final int GL_FLOAT_MAT4 = 0x8B5C;
	public static final int GL_SAMPLER_1D = 0x8B5D;
	public static final int GL_SAMPLER_2D = 0x8B5E;
	public static final int GL_SAMPLER_3D = 0x8B5F;
	public static final int GL_SAMPLER_CUBE = 0x8B60;
	public static final int GL_SAMPLER_1D_SHADOW = 0x8B61;
	public static final int GL_SAMPLER_2D_SHADOW = 0x8B62;
	public static final int GL_DELETE_STATUS = 0x8B80;
	public static final int GL_COMPILE_STATUS = 0x8B81;
	public static final int GL_LINK_STATUS = 0x8B82;
	public static final int GL_VALIDATE_STATUS = 0x8B83;
	public static final int GL_INFO_LOG_LENGTH = 0x8B84;
	public static final int GL_ATTACHED_SHADERS = 0x8B85;
	public static final int GL_ACTIVE_UNIFORMS = 0x8B86;
	public static final int GL_ACTIVE_UNIFORM_MAX_LENGTH = 0x8B87;
	public static final int GL_SHADER_SOURCE_LENGTH = 0x8B88;
	public static final int GL_ACTIVE_ATTRIBUTES = 0x8B89;
	public static final int GL_ACTIVE_ATTRIBUTE_MAX_LENGTH = 0x8B8A;
	public static final int GL_FRAGMENT_SHADER_DERIVATIVE_HINT = 0x8B8B;
	public static final int GL_SHADING_LANGUAGE_VERSION = 0x8B8C;
	public static final int GL_CURRENT_PROGRAM = 0x8B8D;
	public static final int GL_POINT_SPRITE_COORD_ORIGIN = 0x8CA0;
	public static final int GL_LOWER_LEFT = 0x8CA1;
	public static final int GL_UPPER_LEFT = 0x8CA2;
	public static final int GL_STENCIL_BACK_REF = 0x8CA3;
	public static final int GL_STENCIL_BACK_VALUE_MASK = 0x8CA4;
	public static final int GL_STENCIL_BACK_WRITEMASK = 0x8CA5;
	public static final int GL_PIXEL_PACK_BUFFER = 0x88EB;
	public static final int GL_PIXEL_UNPACK_BUFFER = 0x88EC;
	public static final int GL_PIXEL_PACK_BUFFER_BINDING = 0x88ED;
	public static final int GL_PIXEL_UNPACK_BUFFER_BINDING = 0x88EF;
	public static final int GL_FLOAT_MAT2x3 = 0x8B65;
	public static final int GL_FLOAT_MAT2x4 = 0x8B66;
	public static final int GL_FLOAT_MAT3x2 = 0x8B67;
	public static final int GL_FLOAT_MAT3x4 = 0x8B68;
	public static final int GL_FLOAT_MAT4x2 = 0x8B69;
	public static final int GL_FLOAT_MAT4x3 = 0x8B6A;
	public static final int GL_SRGB = 0x8C40;
	public static final int GL_SRGB8 = 0x8C41;
	public static final int GL_SRGB_ALPHA = 0x8C42;
	public static final int GL_SRGB8_ALPHA8 = 0x8C43;
	public static final int GL_COMPRESSED_SRGB = 0x8C48;
	public static final int GL_COMPRESSED_SRGB_ALPHA = 0x8C49;
	public static final int GL_COMPARE_REF_TO_TEXTURE = 0x884E;
	public static final int GL_CLIP_DISTANCE0 = 0x3000;
	public static final int GL_CLIP_DISTANCE1 = 0x3001;
	public static final int GL_CLIP_DISTANCE2 = 0x3002;
	public static final int GL_CLIP_DISTANCE3 = 0x3003;
	public static final int GL_CLIP_DISTANCE4 = 0x3004;
	public static final int GL_CLIP_DISTANCE5 = 0x3005;
	public static final int GL_CLIP_DISTANCE6 = 0x3006;
	public static final int GL_CLIP_DISTANCE7 = 0x3007;
	public static final int GL_MAX_CLIP_DISTANCES = 0x0D32;
	public static final int GL_MAJOR_VERSION = 0x821B;
	public static final int GL_MINOR_VERSION = 0x821C;
	public static final int GL_NUM_EXTENSIONS = 0x821D;
	public static final int GL_CONTEXT_FLAGS = 0x821E;
	public static final int GL_COMPRESSED_RED = 0x8225;
	public static final int GL_COMPRESSED_RG = 0x8226;
	public static final int GL_CONTEXT_FLAG_FORWARD_COMPATIBLE_BIT = 0x00000001;
	public static final int GL_RGBA32F = 0x8814;
	public static final int GL_RGB32F = 0x8815;
	public static final int GL_RGBA16F = 0x881A;
	public static final int GL_RGB16F = 0x881B;
	public static final int GL_VERTEX_ATTRIB_ARRAY_INTEGER = 0x88FD;
	public static final int GL_MAX_ARRAY_TEXTURE_LAYERS = 0x88FF;
	public static final int GL_MIN_PROGRAM_TEXEL_OFFSET = 0x8904;
	public static final int GL_MAX_PROGRAM_TEXEL_OFFSET = 0x8905;
	public static final int GL_CLAMP_READ_COLOR = 0x891C;
	public static final int GL_FIXED_ONLY = 0x891D;
	public static final int GL_MAX_VARYING_COMPONENTS = 0x8B4B;
	public static final int GL_TEXTURE_1D_ARRAY = 0x8C18;
	public static final int GL_PROXY_TEXTURE_1D_ARRAY = 0x8C19;
	public static final int GL_TEXTURE_2D_ARRAY = 0x8C1A;
	public static final int GL_PROXY_TEXTURE_2D_ARRAY = 0x8C1B;
	public static final int GL_TEXTURE_BINDING_1D_ARRAY = 0x8C1C;
	public static final int GL_TEXTURE_BINDING_2D_ARRAY = 0x8C1D;
	public static final int GL_R11F_G11F_B10F = 0x8C3A;
	public static final int GL_UNSIGNED_INT_10F_11F_11F_REV = 0x8C3B;
	public static final int GL_RGB9_E5 = 0x8C3D;
	public static final int GL_UNSIGNED_INT_5_9_9_9_REV = 0x8C3E;
	public static final int GL_TEXTURE_SHARED_SIZE = 0x8C3F;
	public static final int GL_TRANSFORM_FEEDBACK_VARYING_MAX_LENGTH = 0x8C76;
	public static final int GL_TRANSFORM_FEEDBACK_BUFFER_MODE = 0x8C7F;
	public static final int GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_COMPONENTS = 0x8C80;
	public static final int GL_TRANSFORM_FEEDBACK_VARYINGS = 0x8C83;
	public static final int GL_TRANSFORM_FEEDBACK_BUFFER_START = 0x8C84;
	public static final int GL_TRANSFORM_FEEDBACK_BUFFER_SIZE = 0x8C85;
	public static final int GL_PRIMITIVES_GENERATED = 0x8C87;
	public static final int GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN = 0x8C88;
	public static final int GL_RASTERIZER_DISCARD = 0x8C89;
	public static final int GL_MAX_TRANSFORM_FEEDBACK_INTERLEAVED_COMPONENTS = 0x8C8A;
	public static final int GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_ATTRIBS = 0x8C8B;
	public static final int GL_INTERLEAVED_ATTRIBS = 0x8C8C;
	public static final int GL_SEPARATE_ATTRIBS = 0x8C8D;
	public static final int GL_TRANSFORM_FEEDBACK_BUFFER = 0x8C8E;
	public static final int GL_TRANSFORM_FEEDBACK_BUFFER_BINDING = 0x8C8F;
	public static final int GL_RGBA32UI = 0x8D70;
	public static final int GL_RGB32UI = 0x8D71;
	public static final int GL_RGBA16UI = 0x8D76;
	public static final int GL_RGB16UI = 0x8D77;
	public static final int GL_RGBA8UI = 0x8D7C;
	public static final int GL_RGB8UI = 0x8D7D;
	public static final int GL_RGBA32I = 0x8D82;
	public static final int GL_RGB32I = 0x8D83;
	public static final int GL_RGBA16I = 0x8D88;
	public static final int GL_RGB16I = 0x8D89;
	public static final int GL_RGBA8I = 0x8D8E;
	public static final int GL_RGB8I = 0x8D8F;
	public static final int GL_RED_INTEGER = 0x8D94;
	public static final int GL_GREEN_INTEGER = 0x8D95;
	public static final int GL_BLUE_INTEGER = 0x8D96;
	public static final int GL_RGB_INTEGER = 0x8D98;
	public static final int GL_RGBA_INTEGER = 0x8D99;
	public static final int GL_BGR_INTEGER = 0x8D9A;
	public static final int GL_BGRA_INTEGER = 0x8D9B;
	public static final int GL_SAMPLER_1D_ARRAY = 0x8DC0;
	public static final int GL_SAMPLER_2D_ARRAY = 0x8DC1;
	public static final int GL_SAMPLER_1D_ARRAY_SHADOW = 0x8DC3;
	public static final int GL_SAMPLER_2D_ARRAY_SHADOW = 0x8DC4;
	public static final int GL_SAMPLER_CUBE_SHADOW = 0x8DC5;
	public static final int GL_UNSIGNED_INT_VEC2 = 0x8DC6;
	public static final int GL_UNSIGNED_INT_VEC3 = 0x8DC7;
	public static final int GL_UNSIGNED_INT_VEC4 = 0x8DC8;
	public static final int GL_INT_SAMPLER_1D = 0x8DC9;
	public static final int GL_INT_SAMPLER_2D = 0x8DCA;
	public static final int GL_INT_SAMPLER_3D = 0x8DCB;
	public static final int GL_INT_SAMPLER_CUBE = 0x8DCC;
	public static final int GL_INT_SAMPLER_1D_ARRAY = 0x8DCE;
	public static final int GL_INT_SAMPLER_2D_ARRAY = 0x8DCF;
	public static final int GL_UNSIGNED_INT_SAMPLER_1D = 0x8DD1;
	public static final int GL_UNSIGNED_INT_SAMPLER_2D = 0x8DD2;
	public static final int GL_UNSIGNED_INT_SAMPLER_3D = 0x8DD3;
	public static final int GL_UNSIGNED_INT_SAMPLER_CUBE = 0x8DD4;
	public static final int GL_UNSIGNED_INT_SAMPLER_1D_ARRAY = 0x8DD6;
	public static final int GL_UNSIGNED_INT_SAMPLER_2D_ARRAY = 0x8DD7;
	public static final int GL_QUERY_WAIT = 0x8E13;
	public static final int GL_QUERY_NO_WAIT = 0x8E14;
	public static final int GL_QUERY_BY_REGION_WAIT = 0x8E15;
	public static final int GL_QUERY_BY_REGION_NO_WAIT = 0x8E16;
	public static final int GL_BUFFER_ACCESS_FLAGS = 0x911F;
	public static final int GL_BUFFER_MAP_LENGTH = 0x9120;
	public static final int GL_BUFFER_MAP_OFFSET = 0x9121;
	public static final int GL_DEPTH_COMPONENT32F = 0x8CAC;
	public static final int GL_DEPTH32F_STENCIL8 = 0x8CAD;
	public static final int GL_FLOAT_32_UNSIGNED_INT_24_8_REV = 0x8DAD;
	public static final int GL_INVALID_FRAMEBUFFER_OPERATION = 0x0506;
	public static final int GL_FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING = 0x8210;
	public static final int GL_FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE = 0x8211;
	public static final int GL_FRAMEBUFFER_ATTACHMENT_RED_SIZE = 0x8212;
	public static final int GL_FRAMEBUFFER_ATTACHMENT_GREEN_SIZE = 0x8213;
	public static final int GL_FRAMEBUFFER_ATTACHMENT_BLUE_SIZE = 0x8214;
	public static final int GL_FRAMEBUFFER_ATTACHMENT_ALPHA_SIZE = 0x8215;
	public static final int GL_FRAMEBUFFER_ATTACHMENT_DEPTH_SIZE = 0x8216;
	public static final int GL_FRAMEBUFFER_ATTACHMENT_STENCIL_SIZE = 0x8217;
	public static final int GL_FRAMEBUFFER_DEFAULT = 0x8218;
	public static final int GL_FRAMEBUFFER_UNDEFINED = 0x8219;
	public static final int GL_DEPTH_STENCIL_ATTACHMENT = 0x821A;
	public static final int GL_MAX_RENDERBUFFER_SIZE = 0x84E8;
	public static final int GL_DEPTH_STENCIL = 0x84F9;
	public static final int GL_UNSIGNED_INT_24_8 = 0x84FA;
	public static final int GL_DEPTH24_STENCIL8 = 0x88F0;
	public static final int GL_TEXTURE_STENCIL_SIZE = 0x88F1;
	public static final int GL_TEXTURE_RED_TYPE = 0x8C10;
	public static final int GL_TEXTURE_GREEN_TYPE = 0x8C11;
	public static final int GL_TEXTURE_BLUE_TYPE = 0x8C12;
	public static final int GL_TEXTURE_ALPHA_TYPE = 0x8C13;
	public static final int GL_TEXTURE_DEPTH_TYPE = 0x8C16;
	public static final int GL_UNSIGNED_NORMALIZED = 0x8C17;
	public static final int GL_FRAMEBUFFER_BINDING = 0x8CA6;
	public static final int GL_DRAW_FRAMEBUFFER_BINDING = 0x8CA6;
	public static final int GL_RENDERBUFFER_BINDING = 0x8CA7;
	public static final int GL_READ_FRAMEBUFFER = 0x8CA8;
	public static final int GL_DRAW_FRAMEBUFFER = 0x8CA9;
	public static final int GL_READ_FRAMEBUFFER_BINDING = 0x8CAA;
	public static final int GL_RENDERBUFFER_SAMPLES = 0x8CAB;
	public static final int GL_FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE = 0x8CD0;
	public static final int GL_FRAMEBUFFER_ATTACHMENT_OBJECT_NAME = 0x8CD1;
	public static final int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL = 0x8CD2;
	public static final int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE = 0x8CD3;
	public static final int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER = 0x8CD4;
	public static final int GL_FRAMEBUFFER_COMPLETE = 0x8CD5;
	public static final int GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT = 0x8CD6;
	public static final int GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT = 0x8CD7;
	public static final int GL_FRAMEBUFFER_INCOMPLETE_DRAW_BUFFER = 0x8CDB;
	public static final int GL_FRAMEBUFFER_INCOMPLETE_READ_BUFFER = 0x8CDC;
	public static final int GL_FRAMEBUFFER_UNSUPPORTED = 0x8CDD;
	public static final int GL_MAX_COLOR_ATTACHMENTS = 0x8CDF;
	public static final int GL_COLOR_ATTACHMENT0 = 0x8CE0;
	public static final int GL_COLOR_ATTACHMENT1 = 0x8CE1;
	public static final int GL_COLOR_ATTACHMENT2 = 0x8CE2;
	public static final int GL_COLOR_ATTACHMENT3 = 0x8CE3;
	public static final int GL_COLOR_ATTACHMENT4 = 0x8CE4;
	public static final int GL_COLOR_ATTACHMENT5 = 0x8CE5;
	public static final int GL_COLOR_ATTACHMENT6 = 0x8CE6;
	public static final int GL_COLOR_ATTACHMENT7 = 0x8CE7;
	public static final int GL_COLOR_ATTACHMENT8 = 0x8CE8;
	public static final int GL_COLOR_ATTACHMENT9 = 0x8CE9;
	public static final int GL_COLOR_ATTACHMENT10 = 0x8CEA;
	public static final int GL_COLOR_ATTACHMENT11 = 0x8CEB;
	public static final int GL_COLOR_ATTACHMENT12 = 0x8CEC;
	public static final int GL_COLOR_ATTACHMENT13 = 0x8CED;
	public static final int GL_COLOR_ATTACHMENT14 = 0x8CEE;
	public static final int GL_COLOR_ATTACHMENT15 = 0x8CEF;
	public static final int GL_COLOR_ATTACHMENT16 = 0x8CF0;
	public static final int GL_COLOR_ATTACHMENT17 = 0x8CF1;
	public static final int GL_COLOR_ATTACHMENT18 = 0x8CF2;
	public static final int GL_COLOR_ATTACHMENT19 = 0x8CF3;
	public static final int GL_COLOR_ATTACHMENT20 = 0x8CF4;
	public static final int GL_COLOR_ATTACHMENT21 = 0x8CF5;
	public static final int GL_COLOR_ATTACHMENT22 = 0x8CF6;
	public static final int GL_COLOR_ATTACHMENT23 = 0x8CF7;
	public static final int GL_COLOR_ATTACHMENT24 = 0x8CF8;
	public static final int GL_COLOR_ATTACHMENT25 = 0x8CF9;
	public static final int GL_COLOR_ATTACHMENT26 = 0x8CFA;
	public static final int GL_COLOR_ATTACHMENT27 = 0x8CFB;
	public static final int GL_COLOR_ATTACHMENT28 = 0x8CFC;
	public static final int GL_COLOR_ATTACHMENT29 = 0x8CFD;
	public static final int GL_COLOR_ATTACHMENT30 = 0x8CFE;
	public static final int GL_COLOR_ATTACHMENT31 = 0x8CFF;
	public static final int GL_DEPTH_ATTACHMENT = 0x8D00;
	public static final int GL_STENCIL_ATTACHMENT = 0x8D20;
	public static final int GL_FRAMEBUFFER = 0x8D40;
	public static final int GL_RENDERBUFFER = 0x8D41;
	public static final int GL_RENDERBUFFER_WIDTH = 0x8D42;
	public static final int GL_RENDERBUFFER_HEIGHT = 0x8D43;
	public static final int GL_RENDERBUFFER_INTERNAL_FORMAT = 0x8D44;
	public static final int GL_STENCIL_INDEX1 = 0x8D46;
	public static final int GL_STENCIL_INDEX4 = 0x8D47;
	public static final int GL_STENCIL_INDEX8 = 0x8D48;
	public static final int GL_STENCIL_INDEX16 = 0x8D49;
	public static final int GL_RENDERBUFFER_RED_SIZE = 0x8D50;
	public static final int GL_RENDERBUFFER_GREEN_SIZE = 0x8D51;
	public static final int GL_RENDERBUFFER_BLUE_SIZE = 0x8D52;
	public static final int GL_RENDERBUFFER_ALPHA_SIZE = 0x8D53;
	public static final int GL_RENDERBUFFER_DEPTH_SIZE = 0x8D54;
	public static final int GL_RENDERBUFFER_STENCIL_SIZE = 0x8D55;
	public static final int GL_FRAMEBUFFER_INCOMPLETE_MULTISAMPLE = 0x8D56;
	public static final int GL_MAX_SAMPLES = 0x8D57;
	public static final int GL_FRAMEBUFFER_SRGB = 0x8DB9;
	public static final int GL_HALF_FLOAT = 0x140B;
	public static final int GL_MAP_READ_BIT = 0x0001;
	public static final int GL_MAP_WRITE_BIT = 0x0002;
	public static final int GL_MAP_INVALIDATE_RANGE_BIT = 0x0004;
	public static final int GL_MAP_INVALIDATE_BUFFER_BIT = 0x0008;
	public static final int GL_MAP_FLUSH_EXPLICIT_BIT = 0x0010;
	public static final int GL_MAP_UNSYNCHRONIZED_BIT = 0x0020;
	public static final int GL_COMPRESSED_RED_RGTC1 = 0x8DBB;
	public static final int GL_COMPRESSED_SIGNED_RED_RGTC1 = 0x8DBC;
	public static final int GL_COMPRESSED_RG_RGTC2 = 0x8DBD;
	public static final int GL_COMPRESSED_SIGNED_RG_RGTC2 = 0x8DBE;
	public static final int GL_RG = 0x8227;
	public static final int GL_RG_INTEGER = 0x8228;
	public static final int GL_R8 = 0x8229;
	public static final int GL_R16 = 0x822A;
	public static final int GL_RG8 = 0x822B;
	public static final int GL_RG16 = 0x822C;
	public static final int GL_R16F = 0x822D;
	public static final int GL_R32F = 0x822E;
	public static final int GL_RG16F = 0x822F;
	public static final int GL_RG32F = 0x8230;
	public static final int GL_R8I = 0x8231;
	public static final int GL_R8UI = 0x8232;
	public static final int GL_R16I = 0x8233;
	public static final int GL_R16UI = 0x8234;
	public static final int GL_R32I = 0x8235;
	public static final int GL_R32UI = 0x8236;
	public static final int GL_RG8I = 0x8237;
	public static final int GL_RG8UI = 0x8238;
	public static final int GL_RG16I = 0x8239;
	public static final int GL_RG16UI = 0x823A;
	public static final int GL_RG32I = 0x823B;
	public static final int GL_RG32UI = 0x823C;
	public static final int GL_VERTEX_ARRAY_BINDING = 0x85B5;
	public static final int GL_SAMPLER_2D_RECT = 0x8B63;
	public static final int GL_SAMPLER_2D_RECT_SHADOW = 0x8B64;
	public static final int GL_SAMPLER_BUFFER = 0x8DC2;
	public static final int GL_INT_SAMPLER_2D_RECT = 0x8DCD;
	public static final int GL_INT_SAMPLER_BUFFER = 0x8DD0;
	public static final int GL_UNSIGNED_INT_SAMPLER_2D_RECT = 0x8DD5;
	public static final int GL_UNSIGNED_INT_SAMPLER_BUFFER = 0x8DD8;
	public static final int GL_TEXTURE_BUFFER = 0x8C2A;
	public static final int GL_MAX_TEXTURE_BUFFER_SIZE = 0x8C2B;
	public static final int GL_TEXTURE_BINDING_BUFFER = 0x8C2C;
	public static final int GL_TEXTURE_BUFFER_DATA_STORE_BINDING = 0x8C2D;
	public static final int GL_TEXTURE_RECTANGLE = 0x84F5;
	public static final int GL_TEXTURE_BINDING_RECTANGLE = 0x84F6;
	public static final int GL_PROXY_TEXTURE_RECTANGLE = 0x84F7;
	public static final int GL_MAX_RECTANGLE_TEXTURE_SIZE = 0x84F8;
	public static final int GL_R8_SNORM = 0x8F94;
	public static final int GL_RG8_SNORM = 0x8F95;
	public static final int GL_RGB8_SNORM = 0x8F96;
	public static final int GL_RGBA8_SNORM = 0x8F97;
	public static final int GL_R16_SNORM = 0x8F98;
	public static final int GL_RG16_SNORM = 0x8F99;
	public static final int GL_RGB16_SNORM = 0x8F9A;
	public static final int GL_RGBA16_SNORM = 0x8F9B;
	public static final int GL_SIGNED_NORMALIZED = 0x8F9C;
	public static final int GL_PRIMITIVE_RESTART = 0x8F9D;
	public static final int GL_PRIMITIVE_RESTART_INDEX = 0x8F9E;
	public static final int GL_COPY_READ_BUFFER = 0x8F36;
	public static final int GL_COPY_WRITE_BUFFER = 0x8F37;
	public static final int GL_UNIFORM_BUFFER = 0x8A11;
	public static final int GL_UNIFORM_BUFFER_BINDING = 0x8A28;
	public static final int GL_UNIFORM_BUFFER_START = 0x8A29;
	public static final int GL_UNIFORM_BUFFER_SIZE = 0x8A2A;
	public static final int GL_MAX_VERTEX_UNIFORM_BLOCKS = 0x8A2B;
	public static final int GL_MAX_GEOMETRY_UNIFORM_BLOCKS = 0x8A2C;
	public static final int GL_MAX_FRAGMENT_UNIFORM_BLOCKS = 0x8A2D;
	public static final int GL_MAX_COMBINED_UNIFORM_BLOCKS = 0x8A2E;
	public static final int GL_MAX_UNIFORM_BUFFER_BINDINGS = 0x8A2F;
	public static final int GL_MAX_UNIFORM_BLOCK_SIZE = 0x8A30;
	public static final int GL_MAX_COMBINED_VERTEX_UNIFORM_COMPONENTS = 0x8A31;
	public static final int GL_MAX_COMBINED_GEOMETRY_UNIFORM_COMPONENTS = 0x8A32;
	public static final int GL_MAX_COMBINED_FRAGMENT_UNIFORM_COMPONENTS = 0x8A33;
	public static final int GL_UNIFORM_BUFFER_OFFSET_ALIGNMENT = 0x8A34;
	public static final int GL_ACTIVE_UNIFORM_BLOCK_MAX_NAME_LENGTH = 0x8A35;
	public static final int GL_ACTIVE_UNIFORM_BLOCKS = 0x8A36;
	public static final int GL_UNIFORM_TYPE = 0x8A37;
	public static final int GL_UNIFORM_SIZE = 0x8A38;
	public static final int GL_UNIFORM_NAME_LENGTH = 0x8A39;
	public static final int GL_UNIFORM_BLOCK_INDEX = 0x8A3A;
	public static final int GL_UNIFORM_OFFSET = 0x8A3B;
	public static final int GL_UNIFORM_ARRAY_STRIDE = 0x8A3C;
	public static final int GL_UNIFORM_MATRIX_STRIDE = 0x8A3D;
	public static final int GL_UNIFORM_IS_ROW_MAJOR = 0x8A3E;
	public static final int GL_UNIFORM_BLOCK_BINDING = 0x8A3F;
	public static final int GL_UNIFORM_BLOCK_DATA_SIZE = 0x8A40;
	public static final int GL_UNIFORM_BLOCK_NAME_LENGTH = 0x8A41;
	public static final int GL_UNIFORM_BLOCK_ACTIVE_UNIFORMS = 0x8A42;
	public static final int GL_UNIFORM_BLOCK_ACTIVE_UNIFORM_INDICES = 0x8A43;
	public static final int GL_UNIFORM_BLOCK_REFERENCED_BY_VERTEX_SHADER = 0x8A44;
	public static final int GL_UNIFORM_BLOCK_REFERENCED_BY_GEOMETRY_SHADER = 0x8A45;
	public static final int GL_UNIFORM_BLOCK_REFERENCED_BY_FRAGMENT_SHADER = 0x8A46;
	public static final int GL_INVALID_INDEX = 0xFFFFFFFF;
	public static final int GL_CONTEXT_CORE_PROFILE_BIT = 0x00000001;
	public static final int GL_CONTEXT_COMPATIBILITY_PROFILE_BIT = 0x00000002;
	public static final int GL_LINES_ADJACENCY = 0x000A;
	public static final int GL_LINE_STRIP_ADJACENCY = 0x000B;
	public static final int GL_TRIANGLES_ADJACENCY = 0x000C;
	public static final int GL_TRIANGLE_STRIP_ADJACENCY = 0x000D;
	public static final int GL_PROGRAM_POINT_SIZE = 0x8642;
	public static final int GL_MAX_GEOMETRY_TEXTURE_IMAGE_UNITS = 0x8C29;
	public static final int GL_FRAMEBUFFER_ATTACHMENT_LAYERED = 0x8DA7;
	public static final int GL_FRAMEBUFFER_INCOMPLETE_LAYER_TARGETS = 0x8DA8;
	public static final int GL_GEOMETRY_SHADER = 0x8DD9;
	public static final int GL_GEOMETRY_VERTICES_OUT = 0x8916;
	public static final int GL_GEOMETRY_INPUT_TYPE = 0x8917;
	public static final int GL_GEOMETRY_OUTPUT_TYPE = 0x8918;
	public static final int GL_MAX_GEOMETRY_UNIFORM_COMPONENTS = 0x8DDF;
	public static final int GL_MAX_GEOMETRY_OUTPUT_VERTICES = 0x8DE0;
	public static final int GL_MAX_GEOMETRY_TOTAL_OUTPUT_COMPONENTS = 0x8DE1;
	public static final int GL_MAX_VERTEX_OUTPUT_COMPONENTS = 0x9122;
	public static final int GL_MAX_GEOMETRY_INPUT_COMPONENTS = 0x9123;
	public static final int GL_MAX_GEOMETRY_OUTPUT_COMPONENTS = 0x9124;
	public static final int GL_MAX_FRAGMENT_INPUT_COMPONENTS = 0x9125;
	public static final int GL_CONTEXT_PROFILE_MASK = 0x9126;
	public static final int GL_DEPTH_CLAMP = 0x864F;
	public static final int GL_QUADS_FOLLOW_PROVOKING_VERTEX_CONVENTION = 0x8E4C;
	public static final int GL_FIRST_VERTEX_CONVENTION = 0x8E4D;
	public static final int GL_LAST_VERTEX_CONVENTION = 0x8E4E;
	public static final int GL_PROVOKING_VERTEX = 0x8E4F;
	public static final int GL_TEXTURE_CUBE_MAP_SEAMLESS = 0x884F;
	public static final int GL_MAX_SERVER_WAIT_TIMEOUT = 0x9111;
	public static final int GL_OBJECT_TYPE = 0x9112;
	public static final int GL_SYNC_CONDITION = 0x9113;
	public static final int GL_SYNC_STATUS = 0x9114;
	public static final int GL_SYNC_FLAGS = 0x9115;
	public static final int GL_SYNC_FENCE = 0x9116;
	public static final int GL_SYNC_GPU_COMMANDS_COMPLETE = 0x9117;
	public static final int GL_UNSIGNALED = 0x9118;
	public static final int GL_SIGNALED = 0x9119;
	public static final int GL_ALREADY_SIGNALED = 0x911A;
	public static final int GL_TIMEOUT_EXPIRED = 0x911B;
	public static final int GL_CONDITION_SATISFIED = 0x911C;
	public static final int GL_WAIT_FAILED = 0x911D;
	public static final long GL_TIMEOUT_IGNORED = 0xFFFFFFFFFFFFFFFFL;
	public static final int GL_SYNC_FLUSH_COMMANDS_BIT = 0x00000001;
	public static final int GL_SAMPLE_POSITION = 0x8E50;
	public static final int GL_SAMPLE_MASK = 0x8E51;
	public static final int GL_SAMPLE_MASK_VALUE = 0x8E52;
	public static final int GL_MAX_SAMPLE_MASK_WORDS = 0x8E59;
	public static final int GL_TEXTURE_2D_MULTISAMPLE = 0x9100;
	public static final int GL_PROXY_TEXTURE_2D_MULTISAMPLE = 0x9101;
	public static final int GL_TEXTURE_2D_MULTISAMPLE_ARRAY = 0x9102;
	public static final int GL_PROXY_TEXTURE_2D_MULTISAMPLE_ARRAY = 0x9103;
	public static final int GL_TEXTURE_BINDING_2D_MULTISAMPLE = 0x9104;
	public static final int GL_TEXTURE_BINDING_2D_MULTISAMPLE_ARRAY = 0x9105;
	public static final int GL_TEXTURE_SAMPLES = 0x9106;
	public static final int GL_TEXTURE_FIXED_SAMPLE_LOCATIONS = 0x9107;
	public static final int GL_SAMPLER_2D_MULTISAMPLE = 0x9108;
	public static final int GL_INT_SAMPLER_2D_MULTISAMPLE = 0x9109;
	public static final int GL_UNSIGNED_INT_SAMPLER_2D_MULTISAMPLE = 0x910A;
	public static final int GL_SAMPLER_2D_MULTISAMPLE_ARRAY = 0x910B;
	public static final int GL_INT_SAMPLER_2D_MULTISAMPLE_ARRAY = 0x910C;
	public static final int GL_UNSIGNED_INT_SAMPLER_2D_MULTISAMPLE_ARRAY = 0x910D;
	public static final int GL_MAX_COLOR_TEXTURE_SAMPLES = 0x910E;
	public static final int GL_MAX_DEPTH_TEXTURE_SAMPLES = 0x910F;
	public static final int GL_MAX_INTEGER_SAMPLES = 0x9110;
	public static final int GL_VERTEX_ATTRIB_ARRAY_DIVISOR = 0x88FE;
	public static final int GL_SRC1_COLOR = 0x88F9;
	public static final int GL_ONE_MINUS_SRC1_COLOR = 0x88FA;
	public static final int GL_ONE_MINUS_SRC1_ALPHA = 0x88FB;
	public static final int GL_MAX_DUAL_SOURCE_DRAW_BUFFERS = 0x88FC;
	public static final int GL_ANY_SAMPLES_PASSED = 0x8C2F;
	public static final int GL_SAMPLER_BINDING = 0x8919;
	public static final int GL_RGB10_A2UI = 0x906F;
	public static final int GL_TEXTURE_SWIZZLE_R = 0x8E42;
	public static final int GL_TEXTURE_SWIZZLE_G = 0x8E43;
	public static final int GL_TEXTURE_SWIZZLE_B = 0x8E44;
	public static final int GL_TEXTURE_SWIZZLE_A = 0x8E45;
	public static final int GL_TEXTURE_SWIZZLE_RGBA = 0x8E46;
	public static final int GL_TIME_ELAPSED = 0x88BF;
	public static final int GL_TIMESTAMP = 0x8E28;
	public static final int GL_INT_2_10_10_10_REV = 0x8D9F;
	public static final int GL_SAMPLE_SHADING = 0x8C36;
	public static final int GL_MIN_SAMPLE_SHADING_VALUE = 0x8C37;
	public static final int GL_MIN_PROGRAM_TEXTURE_GATHER_OFFSET = 0x8E5E;
	public static final int GL_MAX_PROGRAM_TEXTURE_GATHER_OFFSET = 0x8E5F;
	public static final int GL_TEXTURE_CUBE_MAP_ARRAY = 0x9009;
	public static final int GL_TEXTURE_BINDING_CUBE_MAP_ARRAY = 0x900A;
	public static final int GL_PROXY_TEXTURE_CUBE_MAP_ARRAY = 0x900B;
	public static final int GL_SAMPLER_CUBE_MAP_ARRAY = 0x900C;
	public static final int GL_SAMPLER_CUBE_MAP_ARRAY_SHADOW = 0x900D;
	public static final int GL_INT_SAMPLER_CUBE_MAP_ARRAY = 0x900E;
	public static final int GL_UNSIGNED_INT_SAMPLER_CUBE_MAP_ARRAY = 0x900F;
	public static final int GL_DRAW_INDIRECT_BUFFER = 0x8F3F;
	public static final int GL_DRAW_INDIRECT_BUFFER_BINDING = 0x8F43;
	public static final int GL_GEOMETRY_SHADER_INVOCATIONS = 0x887F;
	public static final int GL_MAX_GEOMETRY_SHADER_INVOCATIONS = 0x8E5A;
	public static final int GL_MIN_FRAGMENT_INTERPOLATION_OFFSET = 0x8E5B;
	public static final int GL_MAX_FRAGMENT_INTERPOLATION_OFFSET = 0x8E5C;
	public static final int GL_FRAGMENT_INTERPOLATION_OFFSET_BITS = 0x8E5D;
	public static final int GL_MAX_VERTEX_STREAMS = 0x8E71;
	public static final int GL_DOUBLE_VEC2 = 0x8FFC;
	public static final int GL_DOUBLE_VEC3 = 0x8FFD;
	public static final int GL_DOUBLE_VEC4 = 0x8FFE;
	public static final int GL_DOUBLE_MAT2 = 0x8F46;
	public static final int GL_DOUBLE_MAT3 = 0x8F47;
	public static final int GL_DOUBLE_MAT4 = 0x8F48;
	public static final int GL_DOUBLE_MAT2x3 = 0x8F49;
	public static final int GL_DOUBLE_MAT2x4 = 0x8F4A;
	public static final int GL_DOUBLE_MAT3x2 = 0x8F4B;
	public static final int GL_DOUBLE_MAT3x4 = 0x8F4C;
	public static final int GL_DOUBLE_MAT4x2 = 0x8F4D;
	public static final int GL_DOUBLE_MAT4x3 = 0x8F4E;
	public static final int GL_ACTIVE_SUBROUTINES = 0x8DE5;
	public static final int GL_ACTIVE_SUBROUTINE_UNIFORMS = 0x8DE6;
	public static final int GL_ACTIVE_SUBROUTINE_UNIFORM_LOCATIONS = 0x8E47;
	public static final int GL_ACTIVE_SUBROUTINE_MAX_LENGTH = 0x8E48;
	public static final int GL_ACTIVE_SUBROUTINE_UNIFORM_MAX_LENGTH = 0x8E49;
	public static final int GL_MAX_SUBROUTINES = 0x8DE7;
	public static final int GL_MAX_SUBROUTINE_UNIFORM_LOCATIONS = 0x8DE8;
	public static final int GL_NUM_COMPATIBLE_SUBROUTINES = 0x8E4A;
	public static final int GL_COMPATIBLE_SUBROUTINES = 0x8E4B;
	public static final int GL_PATCHES = 0x000E;
	public static final int GL_PATCH_VERTICES = 0x8E72;
	public static final int GL_PATCH_DEFAULT_INNER_LEVEL = 0x8E73;
	public static final int GL_PATCH_DEFAULT_OUTER_LEVEL = 0x8E74;
	public static final int GL_TESS_CONTROL_OUTPUT_VERTICES = 0x8E75;
	public static final int GL_TESS_GEN_MODE = 0x8E76;
	public static final int GL_TESS_GEN_SPACING = 0x8E77;
	public static final int GL_TESS_GEN_VERTEX_ORDER = 0x8E78;
	public static final int GL_TESS_GEN_POINT_MODE = 0x8E79;
	public static final int GL_ISOLINES = 0x8E7A;
	public static final int GL_QUADS = 0x0007;
	public static final int GL_FRACTIONAL_ODD = 0x8E7B;
	public static final int GL_FRACTIONAL_EVEN = 0x8E7C;
	public static final int GL_MAX_PATCH_VERTICES = 0x8E7D;
	public static final int GL_MAX_TESS_GEN_LEVEL = 0x8E7E;
	public static final int GL_MAX_TESS_CONTROL_UNIFORM_COMPONENTS = 0x8E7F;
	public static final int GL_MAX_TESS_EVALUATION_UNIFORM_COMPONENTS = 0x8E80;
	public static final int GL_MAX_TESS_CONTROL_TEXTURE_IMAGE_UNITS = 0x8E81;
	public static final int GL_MAX_TESS_EVALUATION_TEXTURE_IMAGE_UNITS = 0x8E82;
	public static final int GL_MAX_TESS_CONTROL_OUTPUT_COMPONENTS = 0x8E83;
	public static final int GL_MAX_TESS_PATCH_COMPONENTS = 0x8E84;
	public static final int GL_MAX_TESS_CONTROL_TOTAL_OUTPUT_COMPONENTS = 0x8E85;
	public static final int GL_MAX_TESS_EVALUATION_OUTPUT_COMPONENTS = 0x8E86;
	public static final int GL_MAX_TESS_CONTROL_UNIFORM_BLOCKS = 0x8E89;
	public static final int GL_MAX_TESS_EVALUATION_UNIFORM_BLOCKS = 0x8E8A;
	public static final int GL_MAX_TESS_CONTROL_INPUT_COMPONENTS = 0x886C;
	public static final int GL_MAX_TESS_EVALUATION_INPUT_COMPONENTS = 0x886D;
	public static final int GL_MAX_COMBINED_TESS_CONTROL_UNIFORM_COMPONENTS = 0x8E1E;
	public static final int GL_MAX_COMBINED_TESS_EVALUATION_UNIFORM_COMPONENTS = 0x8E1F;
	public static final int GL_UNIFORM_BLOCK_REFERENCED_BY_TESS_CONTROL_SHADER = 0x84F0;
	public static final int GL_UNIFORM_BLOCK_REFERENCED_BY_TESS_EVALUATION_SHADER = 0x84F1;
	public static final int GL_TESS_EVALUATION_SHADER = 0x8E87;
	public static final int GL_TESS_CONTROL_SHADER = 0x8E88;
	public static final int GL_TRANSFORM_FEEDBACK = 0x8E22;
	public static final int GL_TRANSFORM_FEEDBACK_BUFFER_PAUSED = 0x8E23;
	public static final int GL_TRANSFORM_FEEDBACK_BUFFER_ACTIVE = 0x8E24;
	public static final int GL_TRANSFORM_FEEDBACK_BINDING = 0x8E25;
	public static final int GL_MAX_TRANSFORM_FEEDBACK_BUFFERS = 0x8E70;
	public static final int GL_FIXED = 0x140C;
	public static final int GL_IMPLEMENTATION_COLOR_READ_TYPE = 0x8B9A;
	public static final int GL_IMPLEMENTATION_COLOR_READ_FORMAT = 0x8B9B;
	public static final int GL_LOW_FLOAT = 0x8DF0;
	public static final int GL_MEDIUM_FLOAT = 0x8DF1;
	public static final int GL_HIGH_FLOAT = 0x8DF2;
	public static final int GL_LOW_INT = 0x8DF3;
	public static final int GL_MEDIUM_INT = 0x8DF4;
	public static final int GL_HIGH_INT = 0x8DF5;
	public static final int GL_SHADER_COMPILER = 0x8DFA;
	public static final int GL_SHADER_BINARY_FORMATS = 0x8DF8;
	public static final int GL_NUM_SHADER_BINARY_FORMATS = 0x8DF9;
	public static final int GL_MAX_VERTEX_UNIFORM_VECTORS = 0x8DFB;
	public static final int GL_MAX_VARYING_VECTORS = 0x8DFC;
	public static final int GL_MAX_FRAGMENT_UNIFORM_VECTORS = 0x8DFD;
	public static final int GL_RGB565 = 0x8D62;
	public static final int GL_PROGRAM_BINARY_RETRIEVABLE_HINT = 0x8257;
	public static final int GL_PROGRAM_BINARY_LENGTH = 0x8741;
	public static final int GL_NUM_PROGRAM_BINARY_FORMATS = 0x87FE;
	public static final int GL_PROGRAM_BINARY_FORMATS = 0x87FF;
	public static final int GL_VERTEX_SHADER_BIT = 0x00000001;
	public static final int GL_FRAGMENT_SHADER_BIT = 0x00000002;
	public static final int GL_GEOMETRY_SHADER_BIT = 0x00000004;
	public static final int GL_TESS_CONTROL_SHADER_BIT = 0x00000008;
	public static final int GL_TESS_EVALUATION_SHADER_BIT = 0x00000010;
	public static final int GL_ALL_SHADER_BITS = 0xFFFFFFFF;
	public static final int GL_PROGRAM_SEPARABLE = 0x8258;
	public static final int GL_ACTIVE_PROGRAM = 0x8259;
	public static final int GL_PROGRAM_PIPELINE_BINDING = 0x825A;
	public static final int GL_MAX_VIEWPORTS = 0x825B;
	public static final int GL_VIEWPORT_SUBPIXEL_BITS = 0x825C;
	public static final int GL_VIEWPORT_BOUNDS_RANGE = 0x825D;
	public static final int GL_LAYER_PROVOKING_VERTEX = 0x825E;
	public static final int GL_VIEWPORT_INDEX_PROVOKING_VERTEX = 0x825F;
	public static final int GL_UNDEFINED_VERTEX = 0x8260;
	public static final int GL_COPY_READ_BUFFER_BINDING = 0x8F36;
	public static final int GL_COPY_WRITE_BUFFER_BINDING = 0x8F37;
	public static final int GL_TRANSFORM_FEEDBACK_ACTIVE = 0x8E24;
	public static final int GL_TRANSFORM_FEEDBACK_PAUSED = 0x8E23;
	public static final int GL_UNPACK_COMPRESSED_BLOCK_WIDTH = 0x9127;
	public static final int GL_UNPACK_COMPRESSED_BLOCK_HEIGHT = 0x9128;
	public static final int GL_UNPACK_COMPRESSED_BLOCK_DEPTH = 0x9129;
	public static final int GL_UNPACK_COMPRESSED_BLOCK_SIZE = 0x912A;
	public static final int GL_PACK_COMPRESSED_BLOCK_WIDTH = 0x912B;
	public static final int GL_PACK_COMPRESSED_BLOCK_HEIGHT = 0x912C;
	public static final int GL_PACK_COMPRESSED_BLOCK_DEPTH = 0x912D;
	public static final int GL_PACK_COMPRESSED_BLOCK_SIZE = 0x912E;
	public static final int GL_NUM_SAMPLE_COUNTS = 0x9380;
	public static final int GL_MIN_MAP_BUFFER_ALIGNMENT = 0x90BC;
	public static final int GL_ATOMIC_COUNTER_BUFFER = 0x92C0;
	public static final int GL_ATOMIC_COUNTER_BUFFER_BINDING = 0x92C1;
	public static final int GL_ATOMIC_COUNTER_BUFFER_START = 0x92C2;
	public static final int GL_ATOMIC_COUNTER_BUFFER_SIZE = 0x92C3;
	public static final int GL_ATOMIC_COUNTER_BUFFER_DATA_SIZE = 0x92C4;
	public static final int GL_ATOMIC_COUNTER_BUFFER_ACTIVE_ATOMIC_COUNTERS = 0x92C5;
	public static final int GL_ATOMIC_COUNTER_BUFFER_ACTIVE_ATOMIC_COUNTER_INDICES = 0x92C6;
	public static final int GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_VERTEX_SHADER = 0x92C7;
	public static final int GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_TESS_CONTROL_SHADER = 0x92C8;
	public static final int GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_TESS_EVALUATION_SHADER = 0x92C9;
	public static final int GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_GEOMETRY_SHADER = 0x92CA;
	public static final int GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_FRAGMENT_SHADER = 0x92CB;
	public static final int GL_MAX_VERTEX_ATOMIC_COUNTER_BUFFERS = 0x92CC;
	public static final int GL_MAX_TESS_CONTROL_ATOMIC_COUNTER_BUFFERS = 0x92CD;
	public static final int GL_MAX_TESS_EVALUATION_ATOMIC_COUNTER_BUFFERS = 0x92CE;
	public static final int GL_MAX_GEOMETRY_ATOMIC_COUNTER_BUFFERS = 0x92CF;
	public static final int GL_MAX_FRAGMENT_ATOMIC_COUNTER_BUFFERS = 0x92D0;
	public static final int GL_MAX_COMBINED_ATOMIC_COUNTER_BUFFERS = 0x92D1;
	public static final int GL_MAX_VERTEX_ATOMIC_COUNTERS = 0x92D2;
	public static final int GL_MAX_TESS_CONTROL_ATOMIC_COUNTERS = 0x92D3;
	public static final int GL_MAX_TESS_EVALUATION_ATOMIC_COUNTERS = 0x92D4;
	public static final int GL_MAX_GEOMETRY_ATOMIC_COUNTERS = 0x92D5;
	public static final int GL_MAX_FRAGMENT_ATOMIC_COUNTERS = 0x92D6;
	public static final int GL_MAX_COMBINED_ATOMIC_COUNTERS = 0x92D7;
	public static final int GL_MAX_ATOMIC_COUNTER_BUFFER_SIZE = 0x92D8;
	public static final int GL_MAX_ATOMIC_COUNTER_BUFFER_BINDINGS = 0x92DC;
	public static final int GL_ACTIVE_ATOMIC_COUNTER_BUFFERS = 0x92D9;
	public static final int GL_UNIFORM_ATOMIC_COUNTER_BUFFER_INDEX = 0x92DA;
	public static final int GL_UNSIGNED_INT_ATOMIC_COUNTER = 0x92DB;
	public static final int GL_VERTEX_ATTRIB_ARRAY_BARRIER_BIT = 0x00000001;
	public static final int GL_ELEMENT_ARRAY_BARRIER_BIT = 0x00000002;
	public static final int GL_UNIFORM_BARRIER_BIT = 0x00000004;
	public static final int GL_TEXTURE_FETCH_BARRIER_BIT = 0x00000008;
	public static final int GL_SHADER_IMAGE_ACCESS_BARRIER_BIT = 0x00000020;
	public static final int GL_COMMAND_BARRIER_BIT = 0x00000040;
	public static final int GL_PIXEL_BUFFER_BARRIER_BIT = 0x00000080;
	public static final int GL_TEXTURE_UPDATE_BARRIER_BIT = 0x00000100;
	public static final int GL_BUFFER_UPDATE_BARRIER_BIT = 0x00000200;
	public static final int GL_FRAMEBUFFER_BARRIER_BIT = 0x00000400;
	public static final int GL_TRANSFORM_FEEDBACK_BARRIER_BIT = 0x00000800;
	public static final int GL_ATOMIC_COUNTER_BARRIER_BIT = 0x00001000;
	public static final int GL_ALL_BARRIER_BITS = 0xFFFFFFFF;
	public static final int GL_MAX_IMAGE_UNITS = 0x8F38;
	public static final int GL_MAX_COMBINED_IMAGE_UNITS_AND_FRAGMENT_OUTPUTS = 0x8F39;
	public static final int GL_IMAGE_BINDING_NAME = 0x8F3A;
	public static final int GL_IMAGE_BINDING_LEVEL = 0x8F3B;
	public static final int GL_IMAGE_BINDING_LAYERED = 0x8F3C;
	public static final int GL_IMAGE_BINDING_LAYER = 0x8F3D;
	public static final int GL_IMAGE_BINDING_ACCESS = 0x8F3E;
	public static final int GL_IMAGE_1D = 0x904C;
	public static final int GL_IMAGE_2D = 0x904D;
	public static final int GL_IMAGE_3D = 0x904E;
	public static final int GL_IMAGE_2D_RECT = 0x904F;
	public static final int GL_IMAGE_CUBE = 0x9050;
	public static final int GL_IMAGE_BUFFER = 0x9051;
	public static final int GL_IMAGE_1D_ARRAY = 0x9052;
	public static final int GL_IMAGE_2D_ARRAY = 0x9053;
	public static final int GL_IMAGE_CUBE_MAP_ARRAY = 0x9054;
	public static final int GL_IMAGE_2D_MULTISAMPLE = 0x9055;
	public static final int GL_IMAGE_2D_MULTISAMPLE_ARRAY = 0x9056;
	public static final int GL_INT_IMAGE_1D = 0x9057;
	public static final int GL_INT_IMAGE_2D = 0x9058;
	public static final int GL_INT_IMAGE_3D = 0x9059;
	public static final int GL_INT_IMAGE_2D_RECT = 0x905A;
	public static final int GL_INT_IMAGE_CUBE = 0x905B;
	public static final int GL_INT_IMAGE_BUFFER = 0x905C;
	public static final int GL_INT_IMAGE_1D_ARRAY = 0x905D;
	public static final int GL_INT_IMAGE_2D_ARRAY = 0x905E;
	public static final int GL_INT_IMAGE_CUBE_MAP_ARRAY = 0x905F;
	public static final int GL_INT_IMAGE_2D_MULTISAMPLE = 0x9060;
	public static final int GL_INT_IMAGE_2D_MULTISAMPLE_ARRAY = 0x9061;
	public static final int GL_UNSIGNED_INT_IMAGE_1D = 0x9062;
	public static final int GL_UNSIGNED_INT_IMAGE_2D = 0x9063;
	public static final int GL_UNSIGNED_INT_IMAGE_3D = 0x9064;
	public static final int GL_UNSIGNED_INT_IMAGE_2D_RECT = 0x9065;
	public static final int GL_UNSIGNED_INT_IMAGE_CUBE = 0x9066;
	public static final int GL_UNSIGNED_INT_IMAGE_BUFFER = 0x9067;
	public static final int GL_UNSIGNED_INT_IMAGE_1D_ARRAY = 0x9068;
	public static final int GL_UNSIGNED_INT_IMAGE_2D_ARRAY = 0x9069;
	public static final int GL_UNSIGNED_INT_IMAGE_CUBE_MAP_ARRAY = 0x906A;
	public static final int GL_UNSIGNED_INT_IMAGE_2D_MULTISAMPLE = 0x906B;
	public static final int GL_UNSIGNED_INT_IMAGE_2D_MULTISAMPLE_ARRAY = 0x906C;
	public static final int GL_MAX_IMAGE_SAMPLES = 0x906D;
	public static final int GL_IMAGE_BINDING_FORMAT = 0x906E;
	public static final int GL_IMAGE_FORMAT_COMPATIBILITY_TYPE = 0x90C7;
	public static final int GL_IMAGE_FORMAT_COMPATIBILITY_BY_SIZE = 0x90C8;
	public static final int GL_IMAGE_FORMAT_COMPATIBILITY_BY_CLASS = 0x90C9;
	public static final int GL_MAX_VERTEX_IMAGE_UNIFORMS = 0x90CA;
	public static final int GL_MAX_TESS_CONTROL_IMAGE_UNIFORMS = 0x90CB;
	public static final int GL_MAX_TESS_EVALUATION_IMAGE_UNIFORMS = 0x90CC;
	public static final int GL_MAX_GEOMETRY_IMAGE_UNIFORMS = 0x90CD;
	public static final int GL_MAX_FRAGMENT_IMAGE_UNIFORMS = 0x90CE;
	public static final int GL_MAX_COMBINED_IMAGE_UNIFORMS = 0x90CF;
	public static final int GL_COMPRESSED_RGBA_BPTC_UNORM = 0x8E8C;
	public static final int GL_COMPRESSED_SRGB_ALPHA_BPTC_UNORM = 0x8E8D;
	public static final int GL_COMPRESSED_RGB_BPTC_SIGNED_FLOAT = 0x8E8E;
	public static final int GL_COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT = 0x8E8F;
	public static final int GL_TEXTURE_IMMUTABLE_FORMAT = 0x912F;
	public static final int GL_NUM_SHADING_LANGUAGE_VERSIONS = 0x82E9;
	public static final int GL_VERTEX_ATTRIB_ARRAY_LONG = 0x874E;
	public static final int GL_COMPRESSED_RGB8_ETC2 = 0x9274;
	public static final int GL_COMPRESSED_SRGB8_ETC2 = 0x9275;
	public static final int GL_COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2 = 0x9276;
	public static final int GL_COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2 = 0x9277;
	public static final int GL_COMPRESSED_RGBA8_ETC2_EAC = 0x9278;
	public static final int GL_COMPRESSED_SRGB8_ALPHA8_ETC2_EAC = 0x9279;
	public static final int GL_COMPRESSED_R11_EAC = 0x9270;
	public static final int GL_COMPRESSED_SIGNED_R11_EAC = 0x9271;
	public static final int GL_COMPRESSED_RG11_EAC = 0x9272;
	public static final int GL_COMPRESSED_SIGNED_RG11_EAC = 0x9273;
	public static final int GL_PRIMITIVE_RESTART_FIXED_INDEX = 0x8D69;
	public static final int GL_ANY_SAMPLES_PASSED_CONSERVATIVE = 0x8D6A;
	public static final int GL_MAX_ELEMENT_INDEX = 0x8D6B;
	public static final int GL_COMPUTE_SHADER = 0x91B9;
	public static final int GL_MAX_COMPUTE_UNIFORM_BLOCKS = 0x91BB;
	public static final int GL_MAX_COMPUTE_TEXTURE_IMAGE_UNITS = 0x91BC;
	public static final int GL_MAX_COMPUTE_IMAGE_UNIFORMS = 0x91BD;
	public static final int GL_MAX_COMPUTE_SHARED_MEMORY_SIZE = 0x8262;
	public static final int GL_MAX_COMPUTE_UNIFORM_COMPONENTS = 0x8263;
	public static final int GL_MAX_COMPUTE_ATOMIC_COUNTER_BUFFERS = 0x8264;
	public static final int GL_MAX_COMPUTE_ATOMIC_COUNTERS = 0x8265;
	public static final int GL_MAX_COMBINED_COMPUTE_UNIFORM_COMPONENTS = 0x8266;
	public static final int GL_MAX_COMPUTE_WORK_GROUP_INVOCATIONS = 0x90EB;
	public static final int GL_MAX_COMPUTE_WORK_GROUP_COUNT = 0x91BE;
	public static final int GL_MAX_COMPUTE_WORK_GROUP_SIZE = 0x91BF;
	public static final int GL_COMPUTE_WORK_GROUP_SIZE = 0x8267;
	public static final int GL_UNIFORM_BLOCK_REFERENCED_BY_COMPUTE_SHADER = 0x90EC;
	public static final int GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_COMPUTE_SHADER = 0x90ED;
	public static final int GL_DISPATCH_INDIRECT_BUFFER = 0x90EE;
	public static final int GL_DISPATCH_INDIRECT_BUFFER_BINDING = 0x90EF;
	public static final int GL_COMPUTE_SHADER_BIT = 0x00000020;
	public static final int GL_DEBUG_OUTPUT_SYNCHRONOUS = 0x8242;
	public static final int GL_DEBUG_NEXT_LOGGED_MESSAGE_LENGTH = 0x8243;
	public static final int GL_DEBUG_CALLBACK_FUNCTION = 0x8244;
	public static final int GL_DEBUG_CALLBACK_USER_PARAM = 0x8245;
	public static final int GL_DEBUG_SOURCE_API = 0x8246;
	public static final int GL_DEBUG_SOURCE_WINDOW_SYSTEM = 0x8247;
	public static final int GL_DEBUG_SOURCE_SHADER_COMPILER = 0x8248;
	public static final int GL_DEBUG_SOURCE_THIRD_PARTY = 0x8249;
	public static final int GL_DEBUG_SOURCE_APPLICATION = 0x824A;
	public static final int GL_DEBUG_SOURCE_OTHER = 0x824B;
	public static final int GL_DEBUG_TYPE_ERROR = 0x824C;
	public static final int GL_DEBUG_TYPE_DEPRECATED_BEHAVIOR = 0x824D;
	public static final int GL_DEBUG_TYPE_UNDEFINED_BEHAVIOR = 0x824E;
	public static final int GL_DEBUG_TYPE_PORTABILITY = 0x824F;
	public static final int GL_DEBUG_TYPE_PERFORMANCE = 0x8250;
	public static final int GL_DEBUG_TYPE_OTHER = 0x8251;
	public static final int GL_MAX_DEBUG_MESSAGE_LENGTH = 0x9143;
	public static final int GL_MAX_DEBUG_LOGGED_MESSAGES = 0x9144;
	public static final int GL_DEBUG_LOGGED_MESSAGES = 0x9145;
	public static final int GL_DEBUG_SEVERITY_HIGH = 0x9146;
	public static final int GL_DEBUG_SEVERITY_MEDIUM = 0x9147;
	public static final int GL_DEBUG_SEVERITY_LOW = 0x9148;
	public static final int GL_DEBUG_TYPE_MARKER = 0x8268;
	public static final int GL_DEBUG_TYPE_PUSH_GROUP = 0x8269;
	public static final int GL_DEBUG_TYPE_POP_GROUP = 0x826A;
	public static final int GL_DEBUG_SEVERITY_NOTIFICATION = 0x826B;
	public static final int GL_MAX_DEBUG_GROUP_STACK_DEPTH = 0x826C;
	public static final int GL_DEBUG_GROUP_STACK_DEPTH = 0x826D;
	public static final int GL_BUFFER = 0x82E0;
	public static final int GL_SHADER = 0x82E1;
	public static final int GL_PROGRAM = 0x82E2;
	public static final int GL_VERTEX_ARRAY = 0x8074;
	public static final int GL_QUERY = 0x82E3;
	public static final int GL_PROGRAM_PIPELINE = 0x82E4;
	public static final int GL_SAMPLER = 0x82E6;
	public static final int GL_MAX_LABEL_LENGTH = 0x82E8;
	public static final int GL_DEBUG_OUTPUT = 0x92E0;
	public static final int GL_CONTEXT_FLAG_DEBUG_BIT = 0x00000002;
	public static final int GL_MAX_UNIFORM_LOCATIONS = 0x826E;
	public static final int GL_FRAMEBUFFER_DEFAULT_WIDTH = 0x9310;
	public static final int GL_FRAMEBUFFER_DEFAULT_HEIGHT = 0x9311;
	public static final int GL_FRAMEBUFFER_DEFAULT_LAYERS = 0x9312;
	public static final int GL_FRAMEBUFFER_DEFAULT_SAMPLES = 0x9313;
	public static final int GL_FRAMEBUFFER_DEFAULT_FIXED_SAMPLE_LOCATIONS = 0x9314;
	public static final int GL_MAX_FRAMEBUFFER_WIDTH = 0x9315;
	public static final int GL_MAX_FRAMEBUFFER_HEIGHT = 0x9316;
	public static final int GL_MAX_FRAMEBUFFER_LAYERS = 0x9317;
	public static final int GL_MAX_FRAMEBUFFER_SAMPLES = 0x9318;
	public static final int GL_INTERNALFORMAT_SUPPORTED = 0x826F;
	public static final int GL_INTERNALFORMAT_PREFERRED = 0x8270;
	public static final int GL_INTERNALFORMAT_RED_SIZE = 0x8271;
	public static final int GL_INTERNALFORMAT_GREEN_SIZE = 0x8272;
	public static final int GL_INTERNALFORMAT_BLUE_SIZE = 0x8273;
	public static final int GL_INTERNALFORMAT_ALPHA_SIZE = 0x8274;
	public static final int GL_INTERNALFORMAT_DEPTH_SIZE = 0x8275;
	public static final int GL_INTERNALFORMAT_STENCIL_SIZE = 0x8276;
	public static final int GL_INTERNALFORMAT_SHARED_SIZE = 0x8277;
	public static final int GL_INTERNALFORMAT_RED_TYPE = 0x8278;
	public static final int GL_INTERNALFORMAT_GREEN_TYPE = 0x8279;
	public static final int GL_INTERNALFORMAT_BLUE_TYPE = 0x827A;
	public static final int GL_INTERNALFORMAT_ALPHA_TYPE = 0x827B;
	public static final int GL_INTERNALFORMAT_DEPTH_TYPE = 0x827C;
	public static final int GL_INTERNALFORMAT_STENCIL_TYPE = 0x827D;
	public static final int GL_MAX_WIDTH = 0x827E;
	public static final int GL_MAX_HEIGHT = 0x827F;
	public static final int GL_MAX_DEPTH = 0x8280;
	public static final int GL_MAX_LAYERS = 0x8281;
	public static final int GL_MAX_COMBINED_DIMENSIONS = 0x8282;
	public static final int GL_COLOR_COMPONENTS = 0x8283;
	public static final int GL_DEPTH_COMPONENTS = 0x8284;
	public static final int GL_STENCIL_COMPONENTS = 0x8285;
	public static final int GL_COLOR_RENDERABLE = 0x8286;
	public static final int GL_DEPTH_RENDERABLE = 0x8287;
	public static final int GL_STENCIL_RENDERABLE = 0x8288;
	public static final int GL_FRAMEBUFFER_RENDERABLE = 0x8289;
	public static final int GL_FRAMEBUFFER_RENDERABLE_LAYERED = 0x828A;
	public static final int GL_FRAMEBUFFER_BLEND = 0x828B;
	public static final int GL_READ_PIXELS = 0x828C;
	public static final int GL_READ_PIXELS_FORMAT = 0x828D;
	public static final int GL_READ_PIXELS_TYPE = 0x828E;
	public static final int GL_TEXTURE_IMAGE_FORMAT = 0x828F;
	public static final int GL_TEXTURE_IMAGE_TYPE = 0x8290;
	public static final int GL_GET_TEXTURE_IMAGE_FORMAT = 0x8291;
	public static final int GL_GET_TEXTURE_IMAGE_TYPE = 0x8292;
	public static final int GL_MIPMAP = 0x8293;
	public static final int GL_MANUAL_GENERATE_MIPMAP = 0x8294;
	public static final int GL_AUTO_GENERATE_MIPMAP = 0x8295;
	public static final int GL_COLOR_ENCODING = 0x8296;
	public static final int GL_SRGB_READ = 0x8297;
	public static final int GL_SRGB_WRITE = 0x8298;
	public static final int GL_FILTER = 0x829A;
	public static final int GL_VERTEX_TEXTURE = 0x829B;
	public static final int GL_TESS_CONTROL_TEXTURE = 0x829C;
	public static final int GL_TESS_EVALUATION_TEXTURE = 0x829D;
	public static final int GL_GEOMETRY_TEXTURE = 0x829E;
	public static final int GL_FRAGMENT_TEXTURE = 0x829F;
	public static final int GL_COMPUTE_TEXTURE = 0x82A0;
	public static final int GL_TEXTURE_SHADOW = 0x82A1;
	public static final int GL_TEXTURE_GATHER = 0x82A2;
	public static final int GL_TEXTURE_GATHER_SHADOW = 0x82A3;
	public static final int GL_SHADER_IMAGE_LOAD = 0x82A4;
	public static final int GL_SHADER_IMAGE_STORE = 0x82A5;
	public static final int GL_SHADER_IMAGE_ATOMIC = 0x82A6;
	public static final int GL_IMAGE_TEXEL_SIZE = 0x82A7;
	public static final int GL_IMAGE_COMPATIBILITY_CLASS = 0x82A8;
	public static final int GL_IMAGE_PIXEL_FORMAT = 0x82A9;
	public static final int GL_IMAGE_PIXEL_TYPE = 0x82AA;
	public static final int GL_SIMULTANEOUS_TEXTURE_AND_DEPTH_TEST = 0x82AC;
	public static final int GL_SIMULTANEOUS_TEXTURE_AND_STENCIL_TEST = 0x82AD;
	public static final int GL_SIMULTANEOUS_TEXTURE_AND_DEPTH_WRITE = 0x82AE;
	public static final int GL_SIMULTANEOUS_TEXTURE_AND_STENCIL_WRITE = 0x82AF;
	public static final int GL_TEXTURE_COMPRESSED_BLOCK_WIDTH = 0x82B1;
	public static final int GL_TEXTURE_COMPRESSED_BLOCK_HEIGHT = 0x82B2;
	public static final int GL_TEXTURE_COMPRESSED_BLOCK_SIZE = 0x82B3;
	public static final int GL_CLEAR_BUFFER = 0x82B4;
	public static final int GL_TEXTURE_VIEW = 0x82B5;
	public static final int GL_VIEW_COMPATIBILITY_CLASS = 0x82B6;
	public static final int GL_FULL_SUPPORT = 0x82B7;
	public static final int GL_CAVEAT_SUPPORT = 0x82B8;
	public static final int GL_IMAGE_CLASS_4_X_32 = 0x82B9;
	public static final int GL_IMAGE_CLASS_2_X_32 = 0x82BA;
	public static final int GL_IMAGE_CLASS_1_X_32 = 0x82BB;
	public static final int GL_IMAGE_CLASS_4_X_16 = 0x82BC;
	public static final int GL_IMAGE_CLASS_2_X_16 = 0x82BD;
	public static final int GL_IMAGE_CLASS_1_X_16 = 0x82BE;
	public static final int GL_IMAGE_CLASS_4_X_8 = 0x82BF;
	public static final int GL_IMAGE_CLASS_2_X_8 = 0x82C0;
	public static final int GL_IMAGE_CLASS_1_X_8 = 0x82C1;
	public static final int GL_IMAGE_CLASS_11_11_10 = 0x82C2;
	public static final int GL_IMAGE_CLASS_10_10_10_2 = 0x82C3;
	public static final int GL_VIEW_CLASS_128_BITS = 0x82C4;
	public static final int GL_VIEW_CLASS_96_BITS = 0x82C5;
	public static final int GL_VIEW_CLASS_64_BITS = 0x82C6;
	public static final int GL_VIEW_CLASS_48_BITS = 0x82C7;
	public static final int GL_VIEW_CLASS_32_BITS = 0x82C8;
	public static final int GL_VIEW_CLASS_24_BITS = 0x82C9;
	public static final int GL_VIEW_CLASS_16_BITS = 0x82CA;
	public static final int GL_VIEW_CLASS_8_BITS = 0x82CB;
	public static final int GL_VIEW_CLASS_S3TC_DXT1_RGB = 0x82CC;
	public static final int GL_VIEW_CLASS_S3TC_DXT1_RGBA = 0x82CD;
	public static final int GL_VIEW_CLASS_S3TC_DXT3_RGBA = 0x82CE;
	public static final int GL_VIEW_CLASS_S3TC_DXT5_RGBA = 0x82CF;
	public static final int GL_VIEW_CLASS_RGTC1_RED = 0x82D0;
	public static final int GL_VIEW_CLASS_RGTC2_RG = 0x82D1;
	public static final int GL_VIEW_CLASS_BPTC_UNORM = 0x82D2;
	public static final int GL_VIEW_CLASS_BPTC_FLOAT = 0x82D3;
	public static final int GL_UNIFORM = 0x92E1;
	public static final int GL_UNIFORM_BLOCK = 0x92E2;
	public static final int GL_PROGRAM_INPUT = 0x92E3;
	public static final int GL_PROGRAM_OUTPUT = 0x92E4;
	public static final int GL_BUFFER_VARIABLE = 0x92E5;
	public static final int GL_SHADER_STORAGE_BLOCK = 0x92E6;
	public static final int GL_VERTEX_SUBROUTINE = 0x92E8;
	public static final int GL_TESS_CONTROL_SUBROUTINE = 0x92E9;
	public static final int GL_TESS_EVALUATION_SUBROUTINE = 0x92EA;
	public static final int GL_GEOMETRY_SUBROUTINE = 0x92EB;
	public static final int GL_FRAGMENT_SUBROUTINE = 0x92EC;
	public static final int GL_COMPUTE_SUBROUTINE = 0x92ED;
	public static final int GL_VERTEX_SUBROUTINE_UNIFORM = 0x92EE;
	public static final int GL_TESS_CONTROL_SUBROUTINE_UNIFORM = 0x92EF;
	public static final int GL_TESS_EVALUATION_SUBROUTINE_UNIFORM = 0x92F0;
	public static final int GL_GEOMETRY_SUBROUTINE_UNIFORM = 0x92F1;
	public static final int GL_FRAGMENT_SUBROUTINE_UNIFORM = 0x92F2;
	public static final int GL_COMPUTE_SUBROUTINE_UNIFORM = 0x92F3;
	public static final int GL_TRANSFORM_FEEDBACK_VARYING = 0x92F4;
	public static final int GL_ACTIVE_RESOURCES = 0x92F5;
	public static final int GL_MAX_NAME_LENGTH = 0x92F6;
	public static final int GL_MAX_NUM_ACTIVE_VARIABLES = 0x92F7;
	public static final int GL_MAX_NUM_COMPATIBLE_SUBROUTINES = 0x92F8;
	public static final int GL_NAME_LENGTH = 0x92F9;
	public static final int GL_TYPE = 0x92FA;
	public static final int GL_ARRAY_SIZE = 0x92FB;
	public static final int GL_OFFSET = 0x92FC;
	public static final int GL_BLOCK_INDEX = 0x92FD;
	public static final int GL_ARRAY_STRIDE = 0x92FE;
	public static final int GL_MATRIX_STRIDE = 0x92FF;
	public static final int GL_IS_ROW_MAJOR = 0x9300;
	public static final int GL_ATOMIC_COUNTER_BUFFER_INDEX = 0x9301;
	public static final int GL_BUFFER_BINDING = 0x9302;
	public static final int GL_BUFFER_DATA_SIZE = 0x9303;
	public static final int GL_NUM_ACTIVE_VARIABLES = 0x9304;
	public static final int GL_ACTIVE_VARIABLES = 0x9305;
	public static final int GL_REFERENCED_BY_VERTEX_SHADER = 0x9306;
	public static final int GL_REFERENCED_BY_TESS_CONTROL_SHADER = 0x9307;
	public static final int GL_REFERENCED_BY_TESS_EVALUATION_SHADER = 0x9308;
	public static final int GL_REFERENCED_BY_GEOMETRY_SHADER = 0x9309;
	public static final int GL_REFERENCED_BY_FRAGMENT_SHADER = 0x930A;
	public static final int GL_REFERENCED_BY_COMPUTE_SHADER = 0x930B;
	public static final int GL_TOP_LEVEL_ARRAY_SIZE = 0x930C;
	public static final int GL_TOP_LEVEL_ARRAY_STRIDE = 0x930D;
	public static final int GL_LOCATION = 0x930E;
	public static final int GL_LOCATION_INDEX = 0x930F;
	public static final int GL_IS_PER_PATCH = 0x92E7;
	public static final int GL_SHADER_STORAGE_BUFFER = 0x90D2;
	public static final int GL_SHADER_STORAGE_BUFFER_BINDING = 0x90D3;
	public static final int GL_SHADER_STORAGE_BUFFER_START = 0x90D4;
	public static final int GL_SHADER_STORAGE_BUFFER_SIZE = 0x90D5;
	public static final int GL_MAX_VERTEX_SHADER_STORAGE_BLOCKS = 0x90D6;
	public static final int GL_MAX_GEOMETRY_SHADER_STORAGE_BLOCKS = 0x90D7;
	public static final int GL_MAX_TESS_CONTROL_SHADER_STORAGE_BLOCKS = 0x90D8;
	public static final int GL_MAX_TESS_EVALUATION_SHADER_STORAGE_BLOCKS = 0x90D9;
	public static final int GL_MAX_FRAGMENT_SHADER_STORAGE_BLOCKS = 0x90DA;
	public static final int GL_MAX_COMPUTE_SHADER_STORAGE_BLOCKS = 0x90DB;
	public static final int GL_MAX_COMBINED_SHADER_STORAGE_BLOCKS = 0x90DC;
	public static final int GL_MAX_SHADER_STORAGE_BUFFER_BINDINGS = 0x90DD;
	public static final int GL_MAX_SHADER_STORAGE_BLOCK_SIZE = 0x90DE;
	public static final int GL_SHADER_STORAGE_BUFFER_OFFSET_ALIGNMENT = 0x90DF;
	public static final int GL_SHADER_STORAGE_BARRIER_BIT = 0x00002000;
	public static final int GL_MAX_COMBINED_SHADER_OUTPUT_RESOURCES = 0x8F39;
	public static final int GL_DEPTH_STENCIL_TEXTURE_MODE = 0x90EA;
	public static final int GL_TEXTURE_BUFFER_OFFSET = 0x919D;
	public static final int GL_TEXTURE_BUFFER_SIZE = 0x919E;
	public static final int GL_TEXTURE_BUFFER_OFFSET_ALIGNMENT = 0x919F;
	public static final int GL_TEXTURE_VIEW_MIN_LEVEL = 0x82DB;
	public static final int GL_TEXTURE_VIEW_NUM_LEVELS = 0x82DC;
	public static final int GL_TEXTURE_VIEW_MIN_LAYER = 0x82DD;
	public static final int GL_TEXTURE_VIEW_NUM_LAYERS = 0x82DE;
	public static final int GL_TEXTURE_IMMUTABLE_LEVELS = 0x82DF;
	public static final int GL_VERTEX_ATTRIB_BINDING = 0x82D4;
	public static final int GL_VERTEX_ATTRIB_RELATIVE_OFFSET = 0x82D5;
	public static final int GL_VERTEX_BINDING_DIVISOR = 0x82D6;
	public static final int GL_VERTEX_BINDING_OFFSET = 0x82D7;
	public static final int GL_VERTEX_BINDING_STRIDE = 0x82D8;
	public static final int GL_MAX_VERTEX_ATTRIB_RELATIVE_OFFSET = 0x82D9;
	public static final int GL_MAX_VERTEX_ATTRIB_BINDINGS = 0x82DA;
	public static final int GL_VERTEX_BINDING_BUFFER = 0x8F4F;
	public static final int GL_DISPLAY_LIST = 0x82E7;
	public static final int GL_STACK_UNDERFLOW = 0x0504;
	public static final int GL_STACK_OVERFLOW = 0x0503;
	public static final int GL_MAX_VERTEX_ATTRIB_STRIDE = 0x82E5;
	public static final int GL_PRIMITIVE_RESTART_FOR_PATCHES_SUPPORTED = 0x8221;
	public static final int GL_TEXTURE_BUFFER_BINDING = 0x8C2A;
	public static final int GL_MAP_PERSISTENT_BIT = 0x0040;
	public static final int GL_MAP_COHERENT_BIT = 0x0080;
	public static final int GL_DYNAMIC_STORAGE_BIT = 0x0100;
	public static final int GL_CLIENT_STORAGE_BIT = 0x0200;
	public static final int GL_CLIENT_MAPPED_BUFFER_BARRIER_BIT = 0x00004000;
	public static final int GL_BUFFER_IMMUTABLE_STORAGE = 0x821F;
	public static final int GL_BUFFER_STORAGE_FLAGS = 0x8220;
	public static final int GL_CLEAR_TEXTURE = 0x9365;
	public static final int GL_LOCATION_COMPONENT = 0x934A;
	public static final int GL_TRANSFORM_FEEDBACK_BUFFER_INDEX = 0x934B;
	public static final int GL_TRANSFORM_FEEDBACK_BUFFER_STRIDE = 0x934C;
	public static final int GL_QUERY_BUFFER = 0x9192;
	public static final int GL_QUERY_BUFFER_BARRIER_BIT = 0x00008000;
	public static final int GL_QUERY_BUFFER_BINDING = 0x9193;
	public static final int GL_QUERY_RESULT_NO_WAIT = 0x9194;
	public static final int GL_MIRROR_CLAMP_TO_EDGE = 0x8743;
	public static final int GL_CONTEXT_LOST = 0x0507;
	public static final int GL_NEGATIVE_ONE_TO_ONE = 0x935E;
	public static final int GL_ZERO_TO_ONE = 0x935F;
	public static final int GL_CLIP_ORIGIN = 0x935C;
	public static final int GL_CLIP_DEPTH_MODE = 0x935D;
	public static final int GL_QUERY_WAIT_INVERTED = 0x8E17;
	public static final int GL_QUERY_NO_WAIT_INVERTED = 0x8E18;
	public static final int GL_QUERY_BY_REGION_WAIT_INVERTED = 0x8E19;
	public static final int GL_QUERY_BY_REGION_NO_WAIT_INVERTED = 0x8E1A;
	public static final int GL_MAX_CULL_DISTANCES = 0x82F9;
	public static final int GL_MAX_COMBINED_CLIP_AND_CULL_DISTANCES = 0x82FA;
	public static final int GL_TEXTURE_TARGET = 0x1006;
	public static final int GL_QUERY_TARGET = 0x82EA;
	public static final int GL_GUILTY_CONTEXT_RESET = 0x8253;
	public static final int GL_INNOCENT_CONTEXT_RESET = 0x8254;
	public static final int GL_UNKNOWN_CONTEXT_RESET = 0x8255;
	public static final int GL_RESET_NOTIFICATION_STRATEGY = 0x8256;
	public static final int GL_LOSE_CONTEXT_ON_RESET = 0x8252;
	public static final int GL_NO_RESET_NOTIFICATION = 0x8261;
	public static final int GL_CONTEXT_FLAG_ROBUST_ACCESS_BIT = 0x00000004;
	public static final int GL_COLOR_TABLE = 0x80D0;
	public static final int GL_POST_CONVOLUTION_COLOR_TABLE = 0x80D1;
	public static final int GL_POST_COLOR_MATRIX_COLOR_TABLE = 0x80D2;
	public static final int GL_PROXY_COLOR_TABLE = 0x80D3;
	public static final int GL_PROXY_POST_CONVOLUTION_COLOR_TABLE = 0x80D4;
	public static final int GL_PROXY_POST_COLOR_MATRIX_COLOR_TABLE = 0x80D5;
	public static final int GL_CONVOLUTION_1D = 0x8010;
	public static final int GL_CONVOLUTION_2D = 0x8011;
	public static final int GL_SEPARABLE_2D = 0x8012;
	public static final int GL_HISTOGRAM = 0x8024;
	public static final int GL_PROXY_HISTOGRAM = 0x8025;
	public static final int GL_MINMAX = 0x802E;
	public static final int GL_CONTEXT_RELEASE_BEHAVIOR = 0x82FB;
	public static final int GL_CONTEXT_RELEASE_BEHAVIOR_FLUSH = 0x82FC;
	public static final int GL_SHADER_BINARY_FORMAT_SPIR_V = 0x9551;
	public static final int GL_SPIR_V_BINARY = 0x9552;
	public static final int GL_PARAMETER_BUFFER = 0x80EE;
	public static final int GL_PARAMETER_BUFFER_BINDING = 0x80EF;
	public static final int GL_CONTEXT_FLAG_NO_ERROR_BIT = 0x00000008;
	public static final int GL_VERTICES_SUBMITTED = 0x82EE;
	public static final int GL_PRIMITIVES_SUBMITTED = 0x82EF;
	public static final int GL_VERTEX_SHADER_INVOCATIONS = 0x82F0;
	public static final int GL_TESS_CONTROL_SHADER_PATCHES = 0x82F1;
	public static final int GL_TESS_EVALUATION_SHADER_INVOCATIONS = 0x82F2;
	public static final int GL_GEOMETRY_SHADER_PRIMITIVES_EMITTED = 0x82F3;
	public static final int GL_FRAGMENT_SHADER_INVOCATIONS = 0x82F4;
	public static final int GL_COMPUTE_SHADER_INVOCATIONS = 0x82F5;
	public static final int GL_CLIPPING_INPUT_PRIMITIVES = 0x82F6;
	public static final int GL_CLIPPING_OUTPUT_PRIMITIVES = 0x82F7;
	public static final int GL_POLYGON_OFFSET_CLAMP = 0x8E1B;
	public static final int GL_SPIR_V_EXTENSIONS = 0x9553;
	public static final int GL_NUM_SPIR_V_EXTENSIONS = 0x9554;
	public static final int GL_TEXTURE_MAX_ANISOTROPY = 0x84FE;
	public static final int GL_MAX_TEXTURE_MAX_ANISOTROPY = 0x84FF;
	public static final int GL_TRANSFORM_FEEDBACK_OVERFLOW = 0x82EC;
	public static final int GL_TRANSFORM_FEEDBACK_STREAM_OVERFLOW = 0x82ED;

	private static final LazyConstant<Boolean> GL_VERSION_1_0;
	private static final LazyConstant<Boolean> GL_VERSION_1_1;
	private static final LazyConstant<Boolean> GL_VERSION_1_2;
	private static final LazyConstant<Boolean> GL_VERSION_1_3;
	private static final LazyConstant<Boolean> GL_VERSION_1_4;
	private static final LazyConstant<Boolean> GL_VERSION_1_5;
	private static final LazyConstant<Boolean> GL_VERSION_2_0;
	private static final LazyConstant<Boolean> GL_VERSION_2_1;
	private static final LazyConstant<Boolean> GL_VERSION_3_0;
	private static final LazyConstant<Boolean> GL_VERSION_3_1;
	private static final LazyConstant<Boolean> GL_VERSION_3_2;
	private static final LazyConstant<Boolean> GL_VERSION_3_3;
	private static final LazyConstant<Boolean> GL_VERSION_4_0;
	private static final LazyConstant<Boolean> GL_VERSION_4_1;
	private static final LazyConstant<Boolean> GL_VERSION_4_2;
	private static final LazyConstant<Boolean> GL_VERSION_4_3;
	private static final LazyConstant<Boolean> GL_VERSION_4_4;
	private static final LazyConstant<Boolean> GL_VERSION_4_5;
	private static final LazyConstant<Boolean> GL_VERSION_4_6;

	private static final LazyConstant<MethodHandle> GLAD_LOAD_GL;
	private static final LazyConstant<MethodHandle> GLAD_LOAD_GLLOADER;
	private static final LazyConstant<MethodHandle> GLAD_GL_CULL_FACE;
	private static final LazyConstant<MethodHandle> GLAD_GL_FRONT_FACE;
	private static final LazyConstant<MethodHandle> GLAD_GL_HINT;
	private static final LazyConstant<MethodHandle> GLAD_GL_LINE_WIDTH;
	private static final LazyConstant<MethodHandle> GLAD_GL_POINT_SIZE;
	private static final LazyConstant<MethodHandle> GLAD_GL_POLYGON_MODE;
	private static final LazyConstant<MethodHandle> GLAD_GL_SCISSOR;
	private static final LazyConstant<MethodHandle> GLAD_GL_TEX_PARAMETERF;
	private static final LazyConstant<MethodHandle> GLAD_GL_TEX_PARAMETERFV;
	private static final LazyConstant<MethodHandle> GLAD_GL_TEX_PARAMETERI;
	private static final LazyConstant<MethodHandle> GLAD_GL_TEX_PARAMETERIV;
	private static final LazyConstant<MethodHandle> GLAD_GL_TEX_IMAGE1_D;
	private static final LazyConstant<MethodHandle> GLAD_GL_TEX_IMAGE2_D;
	private static final LazyConstant<MethodHandle> GLAD_GL_DRAW_BUFFER;
	private static final LazyConstant<MethodHandle> GLAD_GL_CLEAR;
	private static final LazyConstant<MethodHandle> GLAD_GL_CLEAR_COLOR;
	private static final LazyConstant<MethodHandle> GLAD_GL_CLEAR_STENCIL;
	private static final LazyConstant<MethodHandle> GLAD_GL_CLEAR_DEPTH;
	private static final LazyConstant<MethodHandle> GLAD_GL_STENCIL_MASK;
	private static final LazyConstant<MethodHandle> GLAD_GL_COLOR_MASK;
	private static final LazyConstant<MethodHandle> GLAD_GL_DEPTH_MASK;
	private static final LazyConstant<MethodHandle> GLAD_GL_DISABLE;
	private static final LazyConstant<MethodHandle> GLAD_GL_ENABLE;
	private static final LazyConstant<MethodHandle> GLAD_GL_FINISH;
	private static final LazyConstant<MethodHandle> GLAD_GL_FLUSH;
	private static final LazyConstant<MethodHandle> GLAD_GL_BLEND_FUNC;
	private static final LazyConstant<MethodHandle> GLAD_GL_LOGIC_OP;
	private static final LazyConstant<MethodHandle> GLAD_GL_STENCIL_FUNC;
	private static final LazyConstant<MethodHandle> GLAD_GL_STENCIL_OP;
	private static final LazyConstant<MethodHandle> GLAD_GL_DEPTH_FUNC;
	private static final LazyConstant<MethodHandle> GLAD_GL_PIXEL_STOREF;
	private static final LazyConstant<MethodHandle> GLAD_GL_PIXEL_STOREI;
	private static final LazyConstant<MethodHandle> GLAD_GL_READ_BUFFER;
	private static final LazyConstant<MethodHandle> GLAD_GL_READ_PIXELS;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_BOOLEANV;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_DOUBLEV;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_ERROR;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_FLOATV;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_INTEGERV;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_STRING;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_TEX_IMAGE;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_TEX_PARAMETERFV;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_TEX_PARAMETERIV;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_TEX_LEVEL_PARAMETERFV;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_TEX_LEVEL_PARAMETERIV;
	private static final LazyConstant<MethodHandle> GLAD_GL_IS_ENABLED;
	private static final LazyConstant<MethodHandle> GLAD_GL_DEPTH_RANGE;
	private static final LazyConstant<MethodHandle> GLAD_GL_VIEWPORT;
	private static final LazyConstant<MethodHandle> GLAD_GL_DRAW_ARRAYS;
	private static final LazyConstant<MethodHandle> GLAD_GL_DRAW_ELEMENTS;
	private static final LazyConstant<MethodHandle> GLAD_GL_POLYGON_OFFSET;
	private static final LazyConstant<MethodHandle> GLAD_GL_COPY_TEX_IMAGE1_D;
	private static final LazyConstant<MethodHandle> GLAD_GL_COPY_TEX_IMAGE2_D;
	private static final LazyConstant<MethodHandle> GLAD_GL_COPY_TEX_SUB_IMAGE1_D;
	private static final LazyConstant<MethodHandle> GLAD_GL_COPY_TEX_SUB_IMAGE2_D;
	private static final LazyConstant<MethodHandle> GLAD_GL_TEX_SUB_IMAGE1_D;
	private static final LazyConstant<MethodHandle> GLAD_GL_TEX_SUB_IMAGE2_D;
	private static final LazyConstant<MethodHandle> GLAD_GL_BIND_TEXTURE;
	private static final LazyConstant<MethodHandle> GLAD_GL_DELETE_TEXTURES;
	private static final LazyConstant<MethodHandle> GLAD_GL_GEN_TEXTURES;
	private static final LazyConstant<MethodHandle> GLAD_GL_IS_TEXTURE;
	private static final LazyConstant<MethodHandle> GLAD_GL_DRAW_RANGE_ELEMENTS;
	private static final LazyConstant<MethodHandle> GLAD_GL_TEX_IMAGE3_D;
	private static final LazyConstant<MethodHandle> GLAD_GL_TEX_SUB_IMAGE3_D;
	private static final LazyConstant<MethodHandle> GLAD_GL_COPY_TEX_SUB_IMAGE3_D;
	private static final LazyConstant<MethodHandle> GLAD_GL_ACTIVE_TEXTURE;
	private static final LazyConstant<MethodHandle> GLAD_GL_SAMPLE_COVERAGE;
	private static final LazyConstant<MethodHandle> GLAD_GL_COMPRESSED_TEX_IMAGE3_D;
	private static final LazyConstant<MethodHandle> GLAD_GL_COMPRESSED_TEX_IMAGE2_D;
	private static final LazyConstant<MethodHandle> GLAD_GL_COMPRESSED_TEX_IMAGE1_D;
	private static final LazyConstant<MethodHandle> GLAD_GL_COMPRESSED_TEX_SUB_IMAGE3_D;
	private static final LazyConstant<MethodHandle> GLAD_GL_COMPRESSED_TEX_SUB_IMAGE2_D;
	private static final LazyConstant<MethodHandle> GLAD_GL_COMPRESSED_TEX_SUB_IMAGE1_D;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_COMPRESSED_TEX_IMAGE;
	private static final LazyConstant<MethodHandle> GLAD_GL_BLEND_FUNC_SEPARATE;
	private static final LazyConstant<MethodHandle> GLAD_GL_MULTI_DRAW_ARRAYS;
	private static final LazyConstant<MethodHandle> GLAD_GL_MULTI_DRAW_ELEMENTS;
	private static final LazyConstant<MethodHandle> GLAD_GL_POINT_PARAMETERF;
	private static final LazyConstant<MethodHandle> GLAD_GL_POINT_PARAMETERFV;
	private static final LazyConstant<MethodHandle> GLAD_GL_POINT_PARAMETERI;
	private static final LazyConstant<MethodHandle> GLAD_GL_POINT_PARAMETERIV;
	private static final LazyConstant<MethodHandle> GLAD_GL_BLEND_COLOR;
	private static final LazyConstant<MethodHandle> GLAD_GL_BLEND_EQUATION;
	private static final LazyConstant<MethodHandle> GLAD_GL_GEN_QUERIES;
	private static final LazyConstant<MethodHandle> GLAD_GL_DELETE_QUERIES;
	private static final LazyConstant<MethodHandle> GLAD_GL_IS_QUERY;
	private static final LazyConstant<MethodHandle> GLAD_GL_BEGIN_QUERY;
	private static final LazyConstant<MethodHandle> GLAD_GL_END_QUERY;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_QUERYIV;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_QUERY_OBJECTIV;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_QUERY_OBJECTUIV;
	private static final LazyConstant<MethodHandle> GLAD_GL_BIND_BUFFER;
	private static final LazyConstant<MethodHandle> GLAD_GL_DELETE_BUFFERS;
	private static final LazyConstant<MethodHandle> GLAD_GL_GEN_BUFFERS;
	private static final LazyConstant<MethodHandle> GLAD_GL_IS_BUFFER;
	private static final LazyConstant<MethodHandle> GLAD_GL_BUFFER_DATA;
	private static final LazyConstant<MethodHandle> GLAD_GL_BUFFER_SUB_DATA;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_BUFFER_SUB_DATA;
	private static final LazyConstant<MethodHandle> GLAD_GL_MAP_BUFFER;
	private static final LazyConstant<MethodHandle> GLAD_GL_UNMAP_BUFFER;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_BUFFER_PARAMETERIV;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_BUFFER_POINTERV;
	private static final LazyConstant<MethodHandle> GLAD_GL_BLEND_EQUATION_SEPARATE;
	private static final LazyConstant<MethodHandle> GLAD_GL_DRAW_BUFFERS;
	private static final LazyConstant<MethodHandle> GLAD_GL_STENCIL_OP_SEPARATE;
	private static final LazyConstant<MethodHandle> GLAD_GL_STENCIL_FUNC_SEPARATE;
	private static final LazyConstant<MethodHandle> GLAD_GL_STENCIL_MASK_SEPARATE;
	private static final LazyConstant<MethodHandle> GLAD_GL_ATTACH_SHADER;
	private static final LazyConstant<MethodHandle> GLAD_GL_BIND_ATTRIB_LOCATION;
	private static final LazyConstant<MethodHandle> GLAD_GL_COMPILE_SHADER;
	private static final LazyConstant<MethodHandle> GLAD_GL_CREATE_PROGRAM;
	private static final LazyConstant<MethodHandle> GLAD_GL_CREATE_SHADER;
	private static final LazyConstant<MethodHandle> GLAD_GL_DELETE_PROGRAM;
	private static final LazyConstant<MethodHandle> GLAD_GL_DELETE_SHADER;
	private static final LazyConstant<MethodHandle> GLAD_GL_DETACH_SHADER;
	private static final LazyConstant<MethodHandle> GLAD_GL_DISABLE_VERTEX_ATTRIB_ARRAY;
	private static final LazyConstant<MethodHandle> GLAD_GL_ENABLE_VERTEX_ATTRIB_ARRAY;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_ACTIVE_ATTRIB;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_ACTIVE_UNIFORM;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_ATTACHED_SHADERS;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_ATTRIB_LOCATION;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_PROGRAMIV;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_PROGRAM_INFO_LOG;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_SHADERIV;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_SHADER_INFO_LOG;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_SHADER_SOURCE;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_UNIFORM_LOCATION;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_UNIFORMFV;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_UNIFORMIV;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_VERTEX_ATTRIBDV;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_VERTEX_ATTRIBFV;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_VERTEX_ATTRIBIV;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_VERTEX_ATTRIB_POINTERV;
	private static final LazyConstant<MethodHandle> GLAD_GL_IS_PROGRAM;
	private static final LazyConstant<MethodHandle> GLAD_GL_IS_SHADER;
	private static final LazyConstant<MethodHandle> GLAD_GL_LINK_PROGRAM;
	private static final LazyConstant<MethodHandle> GLAD_GL_SHADER_SOURCE;
	private static final LazyConstant<MethodHandle> GLAD_GL_USE_PROGRAM;
	private static final LazyConstant<MethodHandle> GLAD_GL_UNIFORM1F;
	private static final LazyConstant<MethodHandle> GLAD_GL_UNIFORM2F;
	private static final LazyConstant<MethodHandle> GLAD_GL_UNIFORM3F;
	private static final LazyConstant<MethodHandle> GLAD_GL_UNIFORM4F;
	private static final LazyConstant<MethodHandle> GLAD_GL_UNIFORM1I;
	private static final LazyConstant<MethodHandle> GLAD_GL_UNIFORM2I;
	private static final LazyConstant<MethodHandle> GLAD_GL_UNIFORM3I;
	private static final LazyConstant<MethodHandle> GLAD_GL_UNIFORM4I;
	private static final LazyConstant<MethodHandle> GLAD_GL_UNIFORM1FV;
	private static final LazyConstant<MethodHandle> GLAD_GL_UNIFORM2FV;
	private static final LazyConstant<MethodHandle> GLAD_GL_UNIFORM3FV;
	private static final LazyConstant<MethodHandle> GLAD_GL_UNIFORM4FV;
	private static final LazyConstant<MethodHandle> GLAD_GL_UNIFORM1IV;
	private static final LazyConstant<MethodHandle> GLAD_GL_UNIFORM2IV;
	private static final LazyConstant<MethodHandle> GLAD_GL_UNIFORM3IV;
	private static final LazyConstant<MethodHandle> GLAD_GL_UNIFORM4IV;
	private static final LazyConstant<MethodHandle> GLAD_GL_UNIFORM_MATRIX2FV;
	private static final LazyConstant<MethodHandle> GLAD_GL_UNIFORM_MATRIX3FV;
	private static final LazyConstant<MethodHandle> GLAD_GL_UNIFORM_MATRIX4FV;
	private static final LazyConstant<MethodHandle> GLAD_GL_VALIDATE_PROGRAM;
	private static final LazyConstant<MethodHandle> GLAD_GL_VERTEX_ATTRIB1D;
	private static final LazyConstant<MethodHandle> GLAD_GL_VERTEX_ATTRIB1DV;
	private static final LazyConstant<MethodHandle> GLAD_GL_VERTEX_ATTRIB1F;
	private static final LazyConstant<MethodHandle> GLAD_GL_VERTEX_ATTRIB1FV;
	private static final LazyConstant<MethodHandle> GLAD_GL_VERTEX_ATTRIB1S;
	private static final LazyConstant<MethodHandle> GLAD_GL_VERTEX_ATTRIB1SV;
	private static final LazyConstant<MethodHandle> GLAD_GL_VERTEX_ATTRIB2D;
	private static final LazyConstant<MethodHandle> GLAD_GL_VERTEX_ATTRIB2DV;
	private static final LazyConstant<MethodHandle> GLAD_GL_VERTEX_ATTRIB2F;
	private static final LazyConstant<MethodHandle> GLAD_GL_VERTEX_ATTRIB2FV;
	private static final LazyConstant<MethodHandle> GLAD_GL_VERTEX_ATTRIB2S;
	private static final LazyConstant<MethodHandle> GLAD_GL_VERTEX_ATTRIB2SV;
	private static final LazyConstant<MethodHandle> GLAD_GL_VERTEX_ATTRIB3D;
	private static final LazyConstant<MethodHandle> GLAD_GL_VERTEX_ATTRIB3DV;
	private static final LazyConstant<MethodHandle> GLAD_GL_VERTEX_ATTRIB3F;
	private static final LazyConstant<MethodHandle> GLAD_GL_VERTEX_ATTRIB3FV;
	private static final LazyConstant<MethodHandle> GLAD_GL_VERTEX_ATTRIB3S;
	private static final LazyConstant<MethodHandle> GLAD_GL_VERTEX_ATTRIB3SV;
	private static final LazyConstant<MethodHandle> GLAD_GL_VERTEX_ATTRIB4_NBV;
	private static final LazyConstant<MethodHandle> GLAD_GL_VERTEX_ATTRIB4_NIV;
	private static final LazyConstant<MethodHandle> GLAD_GL_VERTEX_ATTRIB4_NSV;
	private static final LazyConstant<MethodHandle> GLAD_GL_VERTEX_ATTRIB4_NUB;
	private static final LazyConstant<MethodHandle> GLAD_GL_VERTEX_ATTRIB4_NUBV;
	private static final LazyConstant<MethodHandle> GLAD_GL_VERTEX_ATTRIB4_NUIV;
	private static final LazyConstant<MethodHandle> GLAD_GL_VERTEX_ATTRIB4_NUSV;
	private static final LazyConstant<MethodHandle> GLAD_GL_VERTEX_ATTRIB4BV;
	private static final LazyConstant<MethodHandle> GLAD_GL_VERTEX_ATTRIB4D;
	private static final LazyConstant<MethodHandle> GLAD_GL_VERTEX_ATTRIB4DV;
	private static final LazyConstant<MethodHandle> GLAD_GL_VERTEX_ATTRIB4F;
	private static final LazyConstant<MethodHandle> GLAD_GL_VERTEX_ATTRIB4FV;
	private static final LazyConstant<MethodHandle> GLAD_GL_VERTEX_ATTRIB4IV;
	private static final LazyConstant<MethodHandle> GLAD_GL_VERTEX_ATTRIB4S;
	private static final LazyConstant<MethodHandle> GLAD_GL_VERTEX_ATTRIB4SV;
	private static final LazyConstant<MethodHandle> GLAD_GL_VERTEX_ATTRIB4UBV;
	private static final LazyConstant<MethodHandle> GLAD_GL_VERTEX_ATTRIB4UIV;
	private static final LazyConstant<MethodHandle> GLAD_GL_VERTEX_ATTRIB4USV;
	private static final LazyConstant<MethodHandle> GLAD_GL_VERTEX_ATTRIB_POINTER;
	private static final LazyConstant<MethodHandle> GLAD_GL_UNIFORM_MATRIX2X3FV;
	private static final LazyConstant<MethodHandle> GLAD_GL_UNIFORM_MATRIX3X2FV;
	private static final LazyConstant<MethodHandle> GLAD_GL_UNIFORM_MATRIX2X4FV;
	private static final LazyConstant<MethodHandle> GLAD_GL_UNIFORM_MATRIX4X2FV;
	private static final LazyConstant<MethodHandle> GLAD_GL_UNIFORM_MATRIX3X4FV;
	private static final LazyConstant<MethodHandle> GLAD_GL_UNIFORM_MATRIX4X3FV;
	private static final LazyConstant<MethodHandle> GLAD_GL_COLOR_MASKI;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_BOOLEANI_V;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_INTEGERI_V;
	private static final LazyConstant<MethodHandle> GLAD_GL_ENABLEI;
	private static final LazyConstant<MethodHandle> GLAD_GL_DISABLEI;
	private static final LazyConstant<MethodHandle> GLAD_GL_IS_ENABLEDI;
	private static final LazyConstant<MethodHandle> GLAD_GL_BEGIN_TRANSFORM_FEEDBACK;
	private static final LazyConstant<MethodHandle> GLAD_GL_END_TRANSFORM_FEEDBACK;
	private static final LazyConstant<MethodHandle> GLAD_GL_BIND_BUFFER_RANGE;
	private static final LazyConstant<MethodHandle> GLAD_GL_BIND_BUFFER_BASE;
	private static final LazyConstant<MethodHandle> GLAD_GL_TRANSFORM_FEEDBACK_VARYINGS;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_TRANSFORM_FEEDBACK_VARYING;
	private static final LazyConstant<MethodHandle> GLAD_GL_CLAMP_COLOR;
	private static final LazyConstant<MethodHandle> GLAD_GL_BEGIN_CONDITIONAL_RENDER;
	private static final LazyConstant<MethodHandle> GLAD_GL_END_CONDITIONAL_RENDER;
	private static final LazyConstant<MethodHandle> GLAD_GL_VERTEX_ATTRIB_IPOINTER;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_VERTEX_ATTRIB_IIV;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_VERTEX_ATTRIB_IUIV;
	private static final LazyConstant<MethodHandle> GLAD_GL_VERTEX_ATTRIB_I1I;
	private static final LazyConstant<MethodHandle> GLAD_GL_VERTEX_ATTRIB_I2I;
	private static final LazyConstant<MethodHandle> GLAD_GL_VERTEX_ATTRIB_I3I;
	private static final LazyConstant<MethodHandle> GLAD_GL_VERTEX_ATTRIB_I4I;
	private static final LazyConstant<MethodHandle> GLAD_GL_VERTEX_ATTRIB_I1UI;
	private static final LazyConstant<MethodHandle> GLAD_GL_VERTEX_ATTRIB_I2UI;
	private static final LazyConstant<MethodHandle> GLAD_GL_VERTEX_ATTRIB_I3UI;
	private static final LazyConstant<MethodHandle> GLAD_GL_VERTEX_ATTRIB_I4UI;
	private static final LazyConstant<MethodHandle> GLAD_GL_VERTEX_ATTRIB_I1IV;
	private static final LazyConstant<MethodHandle> GLAD_GL_VERTEX_ATTRIB_I2IV;
	private static final LazyConstant<MethodHandle> GLAD_GL_VERTEX_ATTRIB_I3IV;
	private static final LazyConstant<MethodHandle> GLAD_GL_VERTEX_ATTRIB_I4IV;
	private static final LazyConstant<MethodHandle> GLAD_GL_VERTEX_ATTRIB_I1UIV;
	private static final LazyConstant<MethodHandle> GLAD_GL_VERTEX_ATTRIB_I2UIV;
	private static final LazyConstant<MethodHandle> GLAD_GL_VERTEX_ATTRIB_I3UIV;
	private static final LazyConstant<MethodHandle> GLAD_GL_VERTEX_ATTRIB_I4UIV;
	private static final LazyConstant<MethodHandle> GLAD_GL_VERTEX_ATTRIB_I4BV;
	private static final LazyConstant<MethodHandle> GLAD_GL_VERTEX_ATTRIB_I4SV;
	private static final LazyConstant<MethodHandle> GLAD_GL_VERTEX_ATTRIB_I4UBV;
	private static final LazyConstant<MethodHandle> GLAD_GL_VERTEX_ATTRIB_I4USV;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_UNIFORMUIV;
	private static final LazyConstant<MethodHandle> GLAD_GL_BIND_FRAG_DATA_LOCATION;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_FRAG_DATA_LOCATION;
	private static final LazyConstant<MethodHandle> GLAD_GL_UNIFORM1UI;
	private static final LazyConstant<MethodHandle> GLAD_GL_UNIFORM2UI;
	private static final LazyConstant<MethodHandle> GLAD_GL_UNIFORM3UI;
	private static final LazyConstant<MethodHandle> GLAD_GL_UNIFORM4UI;
	private static final LazyConstant<MethodHandle> GLAD_GL_UNIFORM1UIV;
	private static final LazyConstant<MethodHandle> GLAD_GL_UNIFORM2UIV;
	private static final LazyConstant<MethodHandle> GLAD_GL_UNIFORM3UIV;
	private static final LazyConstant<MethodHandle> GLAD_GL_UNIFORM4UIV;
	private static final LazyConstant<MethodHandle> GLAD_GL_TEX_PARAMETER_IIV;
	private static final LazyConstant<MethodHandle> GLAD_GL_TEX_PARAMETER_IUIV;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_TEX_PARAMETER_IIV;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_TEX_PARAMETER_IUIV;
	private static final LazyConstant<MethodHandle> GLAD_GL_CLEAR_BUFFERIV;
	private static final LazyConstant<MethodHandle> GLAD_GL_CLEAR_BUFFERUIV;
	private static final LazyConstant<MethodHandle> GLAD_GL_CLEAR_BUFFERFV;
	private static final LazyConstant<MethodHandle> GLAD_GL_CLEAR_BUFFERFI;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_STRINGI;
	private static final LazyConstant<MethodHandle> GLAD_GL_IS_RENDERBUFFER;
	private static final LazyConstant<MethodHandle> GLAD_GL_BIND_RENDERBUFFER;
	private static final LazyConstant<MethodHandle> GLAD_GL_DELETE_RENDERBUFFERS;
	private static final LazyConstant<MethodHandle> GLAD_GL_GEN_RENDERBUFFERS;
	private static final LazyConstant<MethodHandle> GLAD_GL_RENDERBUFFER_STORAGE;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_RENDERBUFFER_PARAMETERIV;
	private static final LazyConstant<MethodHandle> GLAD_GL_IS_FRAMEBUFFER;
	private static final LazyConstant<MethodHandle> GLAD_GL_BIND_FRAMEBUFFER;
	private static final LazyConstant<MethodHandle> GLAD_GL_DELETE_FRAMEBUFFERS;
	private static final LazyConstant<MethodHandle> GLAD_GL_GEN_FRAMEBUFFERS;
	private static final LazyConstant<MethodHandle> GLAD_GL_CHECK_FRAMEBUFFER_STATUS;
	private static final LazyConstant<MethodHandle> GLAD_GL_FRAMEBUFFER_TEXTURE1_D;
	private static final LazyConstant<MethodHandle> GLAD_GL_FRAMEBUFFER_TEXTURE2_D;
	private static final LazyConstant<MethodHandle> GLAD_GL_FRAMEBUFFER_TEXTURE3_D;
	private static final LazyConstant<MethodHandle> GLAD_GL_FRAMEBUFFER_RENDERBUFFER;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_FRAMEBUFFER_ATTACHMENT_PARAMETERIV;
	private static final LazyConstant<MethodHandle> GLAD_GL_GENERATE_MIPMAP;
	private static final LazyConstant<MethodHandle> GLAD_GL_BLIT_FRAMEBUFFER;
	private static final LazyConstant<MethodHandle> GLAD_GL_RENDERBUFFER_STORAGE_MULTISAMPLE;
	private static final LazyConstant<MethodHandle> GLAD_GL_FRAMEBUFFER_TEXTURE_LAYER;
	private static final LazyConstant<MethodHandle> GLAD_GL_MAP_BUFFER_RANGE;
	private static final LazyConstant<MethodHandle> GLAD_GL_FLUSH_MAPPED_BUFFER_RANGE;
	private static final LazyConstant<MethodHandle> GLAD_GL_BIND_VERTEX_ARRAY;
	private static final LazyConstant<MethodHandle> GLAD_GL_DELETE_VERTEX_ARRAYS;
	private static final LazyConstant<MethodHandle> GLAD_GL_GEN_VERTEX_ARRAYS;
	private static final LazyConstant<MethodHandle> GLAD_GL_IS_VERTEX_ARRAY;
	private static final LazyConstant<MethodHandle> GLAD_GL_DRAW_ARRAYS_INSTANCED;
	private static final LazyConstant<MethodHandle> GLAD_GL_DRAW_ELEMENTS_INSTANCED;
	private static final LazyConstant<MethodHandle> GLAD_GL_TEX_BUFFER;
	private static final LazyConstant<MethodHandle> GLAD_GL_PRIMITIVE_RESTART_INDEX;
	private static final LazyConstant<MethodHandle> GLAD_GL_COPY_BUFFER_SUB_DATA;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_UNIFORM_INDICES;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_ACTIVE_UNIFORMSIV;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_ACTIVE_UNIFORM_NAME;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_UNIFORM_BLOCK_INDEX;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_ACTIVE_UNIFORM_BLOCKIV;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_ACTIVE_UNIFORM_BLOCK_NAME;
	private static final LazyConstant<MethodHandle> GLAD_GL_UNIFORM_BLOCK_BINDING;
	private static final LazyConstant<MethodHandle> GLAD_GL_DRAW_ELEMENTS_BASE_VERTEX;
	private static final LazyConstant<MethodHandle> GLAD_GL_DRAW_RANGE_ELEMENTS_BASE_VERTEX;
	private static final LazyConstant<MethodHandle> GLAD_GL_DRAW_ELEMENTS_INSTANCED_BASE_VERTEX;
	private static final LazyConstant<MethodHandle> GLAD_GL_MULTI_DRAW_ELEMENTS_BASE_VERTEX;
	private static final LazyConstant<MethodHandle> GLAD_GL_PROVOKING_VERTEX;
	private static final LazyConstant<MethodHandle> GLAD_GL_FENCE_SYNC;
	private static final LazyConstant<MethodHandle> GLAD_GL_IS_SYNC;
	private static final LazyConstant<MethodHandle> GLAD_GL_DELETE_SYNC;
	private static final LazyConstant<MethodHandle> GLAD_GL_CLIENT_WAIT_SYNC;
	private static final LazyConstant<MethodHandle> GLAD_GL_WAIT_SYNC;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_INTEGER64V;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_SYNCIV;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_INTEGER64I_V;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_BUFFER_PARAMETERI64V;
	private static final LazyConstant<MethodHandle> GLAD_GL_FRAMEBUFFER_TEXTURE;
	private static final LazyConstant<MethodHandle> GLAD_GL_TEX_IMAGE2_DMULTISAMPLE;
	private static final LazyConstant<MethodHandle> GLAD_GL_TEX_IMAGE3_DMULTISAMPLE;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_MULTISAMPLEFV;
	private static final LazyConstant<MethodHandle> GLAD_GL_SAMPLE_MASKI;
	private static final LazyConstant<MethodHandle> GLAD_GL_BIND_FRAG_DATA_LOCATION_INDEXED;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_FRAG_DATA_INDEX;
	private static final LazyConstant<MethodHandle> GLAD_GL_GEN_SAMPLERS;
	private static final LazyConstant<MethodHandle> GLAD_GL_DELETE_SAMPLERS;
	private static final LazyConstant<MethodHandle> GLAD_GL_IS_SAMPLER;
	private static final LazyConstant<MethodHandle> GLAD_GL_BIND_SAMPLER;
	private static final LazyConstant<MethodHandle> GLAD_GL_SAMPLER_PARAMETERI;
	private static final LazyConstant<MethodHandle> GLAD_GL_SAMPLER_PARAMETERIV;
	private static final LazyConstant<MethodHandle> GLAD_GL_SAMPLER_PARAMETERF;
	private static final LazyConstant<MethodHandle> GLAD_GL_SAMPLER_PARAMETERFV;
	private static final LazyConstant<MethodHandle> GLAD_GL_SAMPLER_PARAMETER_IIV;
	private static final LazyConstant<MethodHandle> GLAD_GL_SAMPLER_PARAMETER_IUIV;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_SAMPLER_PARAMETERIV;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_SAMPLER_PARAMETER_IIV;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_SAMPLER_PARAMETERFV;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_SAMPLER_PARAMETER_IUIV;
	private static final LazyConstant<MethodHandle> GLAD_GL_QUERY_COUNTER;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_QUERY_OBJECTI64V;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_QUERY_OBJECTUI64V;
	private static final LazyConstant<MethodHandle> GLAD_GL_VERTEX_ATTRIB_DIVISOR;
	private static final LazyConstant<MethodHandle> GLAD_GL_VERTEX_ATTRIB_P1UI;
	private static final LazyConstant<MethodHandle> GLAD_GL_VERTEX_ATTRIB_P1UIV;
	private static final LazyConstant<MethodHandle> GLAD_GL_VERTEX_ATTRIB_P2UI;
	private static final LazyConstant<MethodHandle> GLAD_GL_VERTEX_ATTRIB_P2UIV;
	private static final LazyConstant<MethodHandle> GLAD_GL_VERTEX_ATTRIB_P3UI;
	private static final LazyConstant<MethodHandle> GLAD_GL_VERTEX_ATTRIB_P3UIV;
	private static final LazyConstant<MethodHandle> GLAD_GL_VERTEX_ATTRIB_P4UI;
	private static final LazyConstant<MethodHandle> GLAD_GL_VERTEX_ATTRIB_P4UIV;
	private static final LazyConstant<MethodHandle> GLAD_GL_VERTEX_P2UI;
	private static final LazyConstant<MethodHandle> GLAD_GL_VERTEX_P2UIV;
	private static final LazyConstant<MethodHandle> GLAD_GL_VERTEX_P3UI;
	private static final LazyConstant<MethodHandle> GLAD_GL_VERTEX_P3UIV;
	private static final LazyConstant<MethodHandle> GLAD_GL_VERTEX_P4UI;
	private static final LazyConstant<MethodHandle> GLAD_GL_VERTEX_P4UIV;
	private static final LazyConstant<MethodHandle> GLAD_GL_TEX_COORD_P1UI;
	private static final LazyConstant<MethodHandle> GLAD_GL_TEX_COORD_P1UIV;
	private static final LazyConstant<MethodHandle> GLAD_GL_TEX_COORD_P2UI;
	private static final LazyConstant<MethodHandle> GLAD_GL_TEX_COORD_P2UIV;
	private static final LazyConstant<MethodHandle> GLAD_GL_TEX_COORD_P3UI;
	private static final LazyConstant<MethodHandle> GLAD_GL_TEX_COORD_P3UIV;
	private static final LazyConstant<MethodHandle> GLAD_GL_TEX_COORD_P4UI;
	private static final LazyConstant<MethodHandle> GLAD_GL_TEX_COORD_P4UIV;
	private static final LazyConstant<MethodHandle> GLAD_GL_MULTI_TEX_COORD_P1UI;
	private static final LazyConstant<MethodHandle> GLAD_GL_MULTI_TEX_COORD_P1UIV;
	private static final LazyConstant<MethodHandle> GLAD_GL_MULTI_TEX_COORD_P2UI;
	private static final LazyConstant<MethodHandle> GLAD_GL_MULTI_TEX_COORD_P2UIV;
	private static final LazyConstant<MethodHandle> GLAD_GL_MULTI_TEX_COORD_P3UI;
	private static final LazyConstant<MethodHandle> GLAD_GL_MULTI_TEX_COORD_P3UIV;
	private static final LazyConstant<MethodHandle> GLAD_GL_MULTI_TEX_COORD_P4UI;
	private static final LazyConstant<MethodHandle> GLAD_GL_MULTI_TEX_COORD_P4UIV;
	private static final LazyConstant<MethodHandle> GLAD_GL_NORMAL_P3UI;
	private static final LazyConstant<MethodHandle> GLAD_GL_NORMAL_P3UIV;
	private static final LazyConstant<MethodHandle> GLAD_GL_COLOR_P3UI;
	private static final LazyConstant<MethodHandle> GLAD_GL_COLOR_P3UIV;
	private static final LazyConstant<MethodHandle> GLAD_GL_COLOR_P4UI;
	private static final LazyConstant<MethodHandle> GLAD_GL_COLOR_P4UIV;
	private static final LazyConstant<MethodHandle> GLAD_GL_SECONDARY_COLOR_P3UI;
	private static final LazyConstant<MethodHandle> GLAD_GL_SECONDARY_COLOR_P3UIV;
	private static final LazyConstant<MethodHandle> GLAD_GL_MIN_SAMPLE_SHADING;
	private static final LazyConstant<MethodHandle> GLAD_GL_BLEND_EQUATIONI;
	private static final LazyConstant<MethodHandle> GLAD_GL_BLEND_EQUATION_SEPARATEI;
	private static final LazyConstant<MethodHandle> GLAD_GL_BLEND_FUNCI;
	private static final LazyConstant<MethodHandle> GLAD_GL_BLEND_FUNC_SEPARATEI;
	private static final LazyConstant<MethodHandle> GLAD_GL_DRAW_ARRAYS_INDIRECT;
	private static final LazyConstant<MethodHandle> GLAD_GL_DRAW_ELEMENTS_INDIRECT;
	private static final LazyConstant<MethodHandle> GLAD_GL_UNIFORM1D;
	private static final LazyConstant<MethodHandle> GLAD_GL_UNIFORM2D;
	private static final LazyConstant<MethodHandle> GLAD_GL_UNIFORM3D;
	private static final LazyConstant<MethodHandle> GLAD_GL_UNIFORM4D;
	private static final LazyConstant<MethodHandle> GLAD_GL_UNIFORM1DV;
	private static final LazyConstant<MethodHandle> GLAD_GL_UNIFORM2DV;
	private static final LazyConstant<MethodHandle> GLAD_GL_UNIFORM3DV;
	private static final LazyConstant<MethodHandle> GLAD_GL_UNIFORM4DV;
	private static final LazyConstant<MethodHandle> GLAD_GL_UNIFORM_MATRIX2DV;
	private static final LazyConstant<MethodHandle> GLAD_GL_UNIFORM_MATRIX3DV;
	private static final LazyConstant<MethodHandle> GLAD_GL_UNIFORM_MATRIX4DV;
	private static final LazyConstant<MethodHandle> GLAD_GL_UNIFORM_MATRIX2X3DV;
	private static final LazyConstant<MethodHandle> GLAD_GL_UNIFORM_MATRIX2X4DV;
	private static final LazyConstant<MethodHandle> GLAD_GL_UNIFORM_MATRIX3X2DV;
	private static final LazyConstant<MethodHandle> GLAD_GL_UNIFORM_MATRIX3X4DV;
	private static final LazyConstant<MethodHandle> GLAD_GL_UNIFORM_MATRIX4X2DV;
	private static final LazyConstant<MethodHandle> GLAD_GL_UNIFORM_MATRIX4X3DV;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_UNIFORMDV;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_SUBROUTINE_UNIFORM_LOCATION;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_SUBROUTINE_INDEX;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_ACTIVE_SUBROUTINE_UNIFORMIV;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_ACTIVE_SUBROUTINE_UNIFORM_NAME;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_ACTIVE_SUBROUTINE_NAME;
	private static final LazyConstant<MethodHandle> GLAD_GL_UNIFORM_SUBROUTINESUIV;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_UNIFORM_SUBROUTINEUIV;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_PROGRAM_STAGEIV;
	private static final LazyConstant<MethodHandle> GLAD_GL_PATCH_PARAMETERI;
	private static final LazyConstant<MethodHandle> GLAD_GL_PATCH_PARAMETERFV;
	private static final LazyConstant<MethodHandle> GLAD_GL_BIND_TRANSFORM_FEEDBACK;
	private static final LazyConstant<MethodHandle> GLAD_GL_DELETE_TRANSFORM_FEEDBACKS;
	private static final LazyConstant<MethodHandle> GLAD_GL_GEN_TRANSFORM_FEEDBACKS;
	private static final LazyConstant<MethodHandle> GLAD_GL_IS_TRANSFORM_FEEDBACK;
	private static final LazyConstant<MethodHandle> GLAD_GL_PAUSE_TRANSFORM_FEEDBACK;
	private static final LazyConstant<MethodHandle> GLAD_GL_RESUME_TRANSFORM_FEEDBACK;
	private static final LazyConstant<MethodHandle> GLAD_GL_DRAW_TRANSFORM_FEEDBACK;
	private static final LazyConstant<MethodHandle> GLAD_GL_DRAW_TRANSFORM_FEEDBACK_STREAM;
	private static final LazyConstant<MethodHandle> GLAD_GL_BEGIN_QUERY_INDEXED;
	private static final LazyConstant<MethodHandle> GLAD_GL_END_QUERY_INDEXED;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_QUERY_INDEXEDIV;
	private static final LazyConstant<MethodHandle> GLAD_GL_RELEASE_SHADER_COMPILER;
	private static final LazyConstant<MethodHandle> GLAD_GL_SHADER_BINARY;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_SHADER_PRECISION_FORMAT;
	private static final LazyConstant<MethodHandle> GLAD_GL_DEPTH_RANGEF;
	private static final LazyConstant<MethodHandle> GLAD_GL_CLEAR_DEPTHF;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_PROGRAM_BINARY;
	private static final LazyConstant<MethodHandle> GLAD_GL_PROGRAM_BINARY;
	private static final LazyConstant<MethodHandle> GLAD_GL_PROGRAM_PARAMETERI;
	private static final LazyConstant<MethodHandle> GLAD_GL_USE_PROGRAM_STAGES;
	private static final LazyConstant<MethodHandle> GLAD_GL_ACTIVE_SHADER_PROGRAM;
	private static final LazyConstant<MethodHandle> GLAD_GL_CREATE_SHADER_PROGRAMV;
	private static final LazyConstant<MethodHandle> GLAD_GL_BIND_PROGRAM_PIPELINE;
	private static final LazyConstant<MethodHandle> GLAD_GL_DELETE_PROGRAM_PIPELINES;
	private static final LazyConstant<MethodHandle> GLAD_GL_GEN_PROGRAM_PIPELINES;
	private static final LazyConstant<MethodHandle> GLAD_GL_IS_PROGRAM_PIPELINE;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_PROGRAM_PIPELINEIV;
	private static final LazyConstant<MethodHandle> GLAD_GL_PROGRAM_UNIFORM1I;
	private static final LazyConstant<MethodHandle> GLAD_GL_PROGRAM_UNIFORM1IV;
	private static final LazyConstant<MethodHandle> GLAD_GL_PROGRAM_UNIFORM1F;
	private static final LazyConstant<MethodHandle> GLAD_GL_PROGRAM_UNIFORM1FV;
	private static final LazyConstant<MethodHandle> GLAD_GL_PROGRAM_UNIFORM1D;
	private static final LazyConstant<MethodHandle> GLAD_GL_PROGRAM_UNIFORM1DV;
	private static final LazyConstant<MethodHandle> GLAD_GL_PROGRAM_UNIFORM1UI;
	private static final LazyConstant<MethodHandle> GLAD_GL_PROGRAM_UNIFORM1UIV;
	private static final LazyConstant<MethodHandle> GLAD_GL_PROGRAM_UNIFORM2I;
	private static final LazyConstant<MethodHandle> GLAD_GL_PROGRAM_UNIFORM2IV;
	private static final LazyConstant<MethodHandle> GLAD_GL_PROGRAM_UNIFORM2F;
	private static final LazyConstant<MethodHandle> GLAD_GL_PROGRAM_UNIFORM2FV;
	private static final LazyConstant<MethodHandle> GLAD_GL_PROGRAM_UNIFORM2D;
	private static final LazyConstant<MethodHandle> GLAD_GL_PROGRAM_UNIFORM2DV;
	private static final LazyConstant<MethodHandle> GLAD_GL_PROGRAM_UNIFORM2UI;
	private static final LazyConstant<MethodHandle> GLAD_GL_PROGRAM_UNIFORM2UIV;
	private static final LazyConstant<MethodHandle> GLAD_GL_PROGRAM_UNIFORM3I;
	private static final LazyConstant<MethodHandle> GLAD_GL_PROGRAM_UNIFORM3IV;
	private static final LazyConstant<MethodHandle> GLAD_GL_PROGRAM_UNIFORM3F;
	private static final LazyConstant<MethodHandle> GLAD_GL_PROGRAM_UNIFORM3FV;
	private static final LazyConstant<MethodHandle> GLAD_GL_PROGRAM_UNIFORM3D;
	private static final LazyConstant<MethodHandle> GLAD_GL_PROGRAM_UNIFORM3DV;
	private static final LazyConstant<MethodHandle> GLAD_GL_PROGRAM_UNIFORM3UI;
	private static final LazyConstant<MethodHandle> GLAD_GL_PROGRAM_UNIFORM3UIV;
	private static final LazyConstant<MethodHandle> GLAD_GL_PROGRAM_UNIFORM4I;
	private static final LazyConstant<MethodHandle> GLAD_GL_PROGRAM_UNIFORM4IV;
	private static final LazyConstant<MethodHandle> GLAD_GL_PROGRAM_UNIFORM4F;
	private static final LazyConstant<MethodHandle> GLAD_GL_PROGRAM_UNIFORM4FV;
	private static final LazyConstant<MethodHandle> GLAD_GL_PROGRAM_UNIFORM4D;
	private static final LazyConstant<MethodHandle> GLAD_GL_PROGRAM_UNIFORM4DV;
	private static final LazyConstant<MethodHandle> GLAD_GL_PROGRAM_UNIFORM4UI;
	private static final LazyConstant<MethodHandle> GLAD_GL_PROGRAM_UNIFORM4UIV;
	private static final LazyConstant<MethodHandle> GLAD_GL_PROGRAM_UNIFORM_MATRIX2FV;
	private static final LazyConstant<MethodHandle> GLAD_GL_PROGRAM_UNIFORM_MATRIX3FV;
	private static final LazyConstant<MethodHandle> GLAD_GL_PROGRAM_UNIFORM_MATRIX4FV;
	private static final LazyConstant<MethodHandle> GLAD_GL_PROGRAM_UNIFORM_MATRIX2DV;
	private static final LazyConstant<MethodHandle> GLAD_GL_PROGRAM_UNIFORM_MATRIX3DV;
	private static final LazyConstant<MethodHandle> GLAD_GL_PROGRAM_UNIFORM_MATRIX4DV;
	private static final LazyConstant<MethodHandle> GLAD_GL_PROGRAM_UNIFORM_MATRIX2X3FV;
	private static final LazyConstant<MethodHandle> GLAD_GL_PROGRAM_UNIFORM_MATRIX3X2FV;
	private static final LazyConstant<MethodHandle> GLAD_GL_PROGRAM_UNIFORM_MATRIX2X4FV;
	private static final LazyConstant<MethodHandle> GLAD_GL_PROGRAM_UNIFORM_MATRIX4X2FV;
	private static final LazyConstant<MethodHandle> GLAD_GL_PROGRAM_UNIFORM_MATRIX3X4FV;
	private static final LazyConstant<MethodHandle> GLAD_GL_PROGRAM_UNIFORM_MATRIX4X3FV;
	private static final LazyConstant<MethodHandle> GLAD_GL_PROGRAM_UNIFORM_MATRIX2X3DV;
	private static final LazyConstant<MethodHandle> GLAD_GL_PROGRAM_UNIFORM_MATRIX3X2DV;
	private static final LazyConstant<MethodHandle> GLAD_GL_PROGRAM_UNIFORM_MATRIX2X4DV;
	private static final LazyConstant<MethodHandle> GLAD_GL_PROGRAM_UNIFORM_MATRIX4X2DV;
	private static final LazyConstant<MethodHandle> GLAD_GL_PROGRAM_UNIFORM_MATRIX3X4DV;
	private static final LazyConstant<MethodHandle> GLAD_GL_PROGRAM_UNIFORM_MATRIX4X3DV;
	private static final LazyConstant<MethodHandle> GLAD_GL_VALIDATE_PROGRAM_PIPELINE;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_PROGRAM_PIPELINE_INFO_LOG;
	private static final LazyConstant<MethodHandle> GLAD_GL_VERTEX_ATTRIB_L1D;
	private static final LazyConstant<MethodHandle> GLAD_GL_VERTEX_ATTRIB_L2D;
	private static final LazyConstant<MethodHandle> GLAD_GL_VERTEX_ATTRIB_L3D;
	private static final LazyConstant<MethodHandle> GLAD_GL_VERTEX_ATTRIB_L4D;
	private static final LazyConstant<MethodHandle> GLAD_GL_VERTEX_ATTRIB_L1DV;
	private static final LazyConstant<MethodHandle> GLAD_GL_VERTEX_ATTRIB_L2DV;
	private static final LazyConstant<MethodHandle> GLAD_GL_VERTEX_ATTRIB_L3DV;
	private static final LazyConstant<MethodHandle> GLAD_GL_VERTEX_ATTRIB_L4DV;
	private static final LazyConstant<MethodHandle> GLAD_GL_VERTEX_ATTRIB_LPOINTER;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_VERTEX_ATTRIB_LDV;
	private static final LazyConstant<MethodHandle> GLAD_GL_VIEWPORT_ARRAYV;
	private static final LazyConstant<MethodHandle> GLAD_GL_VIEWPORT_INDEXEDF;
	private static final LazyConstant<MethodHandle> GLAD_GL_VIEWPORT_INDEXEDFV;
	private static final LazyConstant<MethodHandle> GLAD_GL_SCISSOR_ARRAYV;
	private static final LazyConstant<MethodHandle> GLAD_GL_SCISSOR_INDEXED;
	private static final LazyConstant<MethodHandle> GLAD_GL_SCISSOR_INDEXEDV;
	private static final LazyConstant<MethodHandle> GLAD_GL_DEPTH_RANGE_ARRAYV;
	private static final LazyConstant<MethodHandle> GLAD_GL_DEPTH_RANGE_INDEXED;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_FLOATI_V;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_DOUBLEI_V;
	private static final LazyConstant<MethodHandle> GLAD_GL_DRAW_ARRAYS_INSTANCED_BASE_INSTANCE;
	private static final LazyConstant<MethodHandle> GLAD_GL_DRAW_ELEMENTS_INSTANCED_BASE_INSTANCE;
	private static final LazyConstant<MethodHandle> GLAD_GL_DRAW_ELEMENTS_INSTANCED_BASE_VERTEX_BASE_INSTANCE;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_INTERNALFORMATIV;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_ACTIVE_ATOMIC_COUNTER_BUFFERIV;
	private static final LazyConstant<MethodHandle> GLAD_GL_BIND_IMAGE_TEXTURE;
	private static final LazyConstant<MethodHandle> GLAD_GL_MEMORY_BARRIER;
	private static final LazyConstant<MethodHandle> GLAD_GL_TEX_STORAGE1_D;
	private static final LazyConstant<MethodHandle> GLAD_GL_TEX_STORAGE2_D;
	private static final LazyConstant<MethodHandle> GLAD_GL_TEX_STORAGE3_D;
	private static final LazyConstant<MethodHandle> GLAD_GL_DRAW_TRANSFORM_FEEDBACK_INSTANCED;
	private static final LazyConstant<MethodHandle> GLAD_GL_DRAW_TRANSFORM_FEEDBACK_STREAM_INSTANCED;
	private static final LazyConstant<MethodHandle> GLAD_GL_CLEAR_BUFFER_DATA;
	private static final LazyConstant<MethodHandle> GLAD_GL_CLEAR_BUFFER_SUB_DATA;
	private static final LazyConstant<MethodHandle> GLAD_GL_DISPATCH_COMPUTE;
	private static final LazyConstant<MethodHandle> GLAD_GL_DISPATCH_COMPUTE_INDIRECT;
	private static final LazyConstant<MethodHandle> GLAD_GL_COPY_IMAGE_SUB_DATA;
	private static final LazyConstant<MethodHandle> GLAD_GL_FRAMEBUFFER_PARAMETERI;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_FRAMEBUFFER_PARAMETERIV;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_INTERNALFORMATI64V;
	private static final LazyConstant<MethodHandle> GLAD_GL_INVALIDATE_TEX_SUB_IMAGE;
	private static final LazyConstant<MethodHandle> GLAD_GL_INVALIDATE_TEX_IMAGE;
	private static final LazyConstant<MethodHandle> GLAD_GL_INVALIDATE_BUFFER_SUB_DATA;
	private static final LazyConstant<MethodHandle> GLAD_GL_INVALIDATE_BUFFER_DATA;
	private static final LazyConstant<MethodHandle> GLAD_GL_INVALIDATE_FRAMEBUFFER;
	private static final LazyConstant<MethodHandle> GLAD_GL_INVALIDATE_SUB_FRAMEBUFFER;
	private static final LazyConstant<MethodHandle> GLAD_GL_MULTI_DRAW_ARRAYS_INDIRECT;
	private static final LazyConstant<MethodHandle> GLAD_GL_MULTI_DRAW_ELEMENTS_INDIRECT;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_PROGRAM_INTERFACEIV;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_PROGRAM_RESOURCE_INDEX;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_PROGRAM_RESOURCE_NAME;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_PROGRAM_RESOURCEIV;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_PROGRAM_RESOURCE_LOCATION;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_PROGRAM_RESOURCE_LOCATION_INDEX;
	private static final LazyConstant<MethodHandle> GLAD_GL_SHADER_STORAGE_BLOCK_BINDING;
	private static final LazyConstant<MethodHandle> GLAD_GL_TEX_BUFFER_RANGE;
	private static final LazyConstant<MethodHandle> GLAD_GL_TEX_STORAGE2_DMULTISAMPLE;
	private static final LazyConstant<MethodHandle> GLAD_GL_TEX_STORAGE3_DMULTISAMPLE;
	private static final LazyConstant<MethodHandle> GLAD_GL_TEXTURE_VIEW;
	private static final LazyConstant<MethodHandle> GLAD_GL_BIND_VERTEX_BUFFER;
	private static final LazyConstant<MethodHandle> GLAD_GL_VERTEX_ATTRIB_FORMAT;
	private static final LazyConstant<MethodHandle> GLAD_GL_VERTEX_ATTRIB_IFORMAT;
	private static final LazyConstant<MethodHandle> GLAD_GL_VERTEX_ATTRIB_LFORMAT;
	private static final LazyConstant<MethodHandle> GLAD_GL_VERTEX_ATTRIB_BINDING;
	private static final LazyConstant<MethodHandle> GLAD_GL_VERTEX_BINDING_DIVISOR;
	private static final LazyConstant<MethodHandle> GLAD_GL_DEBUG_MESSAGE_CONTROL;
	private static final LazyConstant<MethodHandle> GLAD_GL_DEBUG_MESSAGE_INSERT;
	private static final LazyConstant<MethodHandle> GLAD_GL_DEBUG_MESSAGE_CALLBACK;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_DEBUG_MESSAGE_LOG;
	private static final LazyConstant<MethodHandle> GLAD_GL_PUSH_DEBUG_GROUP;
	private static final LazyConstant<MethodHandle> GLAD_GL_POP_DEBUG_GROUP;
	private static final LazyConstant<MethodHandle> GLAD_GL_OBJECT_LABEL;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_OBJECT_LABEL;
	private static final LazyConstant<MethodHandle> GLAD_GL_OBJECT_PTR_LABEL;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_OBJECT_PTR_LABEL;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_POINTERV;
	private static final LazyConstant<MethodHandle> GLAD_GL_BUFFER_STORAGE;
	private static final LazyConstant<MethodHandle> GLAD_GL_CLEAR_TEX_IMAGE;
	private static final LazyConstant<MethodHandle> GLAD_GL_CLEAR_TEX_SUB_IMAGE;
	private static final LazyConstant<MethodHandle> GLAD_GL_BIND_BUFFERS_BASE;
	private static final LazyConstant<MethodHandle> GLAD_GL_BIND_BUFFERS_RANGE;
	private static final LazyConstant<MethodHandle> GLAD_GL_BIND_TEXTURES;
	private static final LazyConstant<MethodHandle> GLAD_GL_BIND_SAMPLERS;
	private static final LazyConstant<MethodHandle> GLAD_GL_BIND_IMAGE_TEXTURES;
	private static final LazyConstant<MethodHandle> GLAD_GL_BIND_VERTEX_BUFFERS;
	private static final LazyConstant<MethodHandle> GLAD_GL_CLIP_CONTROL;
	private static final LazyConstant<MethodHandle> GLAD_GL_CREATE_TRANSFORM_FEEDBACKS;
	private static final LazyConstant<MethodHandle> GLAD_GL_TRANSFORM_FEEDBACK_BUFFER_BASE;
	private static final LazyConstant<MethodHandle> GLAD_GL_TRANSFORM_FEEDBACK_BUFFER_RANGE;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_TRANSFORM_FEEDBACKIV;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_TRANSFORM_FEEDBACKI_V;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_TRANSFORM_FEEDBACKI64_V;
	private static final LazyConstant<MethodHandle> GLAD_GL_CREATE_BUFFERS;
	private static final LazyConstant<MethodHandle> GLAD_GL_NAMED_BUFFER_STORAGE;
	private static final LazyConstant<MethodHandle> GLAD_GL_NAMED_BUFFER_DATA;
	private static final LazyConstant<MethodHandle> GLAD_GL_NAMED_BUFFER_SUB_DATA;
	private static final LazyConstant<MethodHandle> GLAD_GL_COPY_NAMED_BUFFER_SUB_DATA;
	private static final LazyConstant<MethodHandle> GLAD_GL_CLEAR_NAMED_BUFFER_DATA;
	private static final LazyConstant<MethodHandle> GLAD_GL_CLEAR_NAMED_BUFFER_SUB_DATA;
	private static final LazyConstant<MethodHandle> GLAD_GL_MAP_NAMED_BUFFER;
	private static final LazyConstant<MethodHandle> GLAD_GL_MAP_NAMED_BUFFER_RANGE;
	private static final LazyConstant<MethodHandle> GLAD_GL_UNMAP_NAMED_BUFFER;
	private static final LazyConstant<MethodHandle> GLAD_GL_FLUSH_MAPPED_NAMED_BUFFER_RANGE;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_NAMED_BUFFER_PARAMETERIV;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_NAMED_BUFFER_PARAMETERI64V;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_NAMED_BUFFER_POINTERV;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_NAMED_BUFFER_SUB_DATA;
	private static final LazyConstant<MethodHandle> GLAD_GL_CREATE_FRAMEBUFFERS;
	private static final LazyConstant<MethodHandle> GLAD_GL_NAMED_FRAMEBUFFER_RENDERBUFFER;
	private static final LazyConstant<MethodHandle> GLAD_GL_NAMED_FRAMEBUFFER_PARAMETERI;
	private static final LazyConstant<MethodHandle> GLAD_GL_NAMED_FRAMEBUFFER_TEXTURE;
	private static final LazyConstant<MethodHandle> GLAD_GL_NAMED_FRAMEBUFFER_TEXTURE_LAYER;
	private static final LazyConstant<MethodHandle> GLAD_GL_NAMED_FRAMEBUFFER_DRAW_BUFFER;
	private static final LazyConstant<MethodHandle> GLAD_GL_NAMED_FRAMEBUFFER_DRAW_BUFFERS;
	private static final LazyConstant<MethodHandle> GLAD_GL_NAMED_FRAMEBUFFER_READ_BUFFER;
	private static final LazyConstant<MethodHandle> GLAD_GL_INVALIDATE_NAMED_FRAMEBUFFER_DATA;
	private static final LazyConstant<MethodHandle> GLAD_GL_INVALIDATE_NAMED_FRAMEBUFFER_SUB_DATA;
	private static final LazyConstant<MethodHandle> GLAD_GL_CLEAR_NAMED_FRAMEBUFFERIV;
	private static final LazyConstant<MethodHandle> GLAD_GL_CLEAR_NAMED_FRAMEBUFFERUIV;
	private static final LazyConstant<MethodHandle> GLAD_GL_CLEAR_NAMED_FRAMEBUFFERFV;
	private static final LazyConstant<MethodHandle> GLAD_GL_CLEAR_NAMED_FRAMEBUFFERFI;
	private static final LazyConstant<MethodHandle> GLAD_GL_BLIT_NAMED_FRAMEBUFFER;
	private static final LazyConstant<MethodHandle> GLAD_GL_CHECK_NAMED_FRAMEBUFFER_STATUS;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_NAMED_FRAMEBUFFER_PARAMETERIV;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_NAMED_FRAMEBUFFER_ATTACHMENT_PARAMETERIV;
	private static final LazyConstant<MethodHandle> GLAD_GL_CREATE_RENDERBUFFERS;
	private static final LazyConstant<MethodHandle> GLAD_GL_NAMED_RENDERBUFFER_STORAGE;
	private static final LazyConstant<MethodHandle> GLAD_GL_NAMED_RENDERBUFFER_STORAGE_MULTISAMPLE;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_NAMED_RENDERBUFFER_PARAMETERIV;
	private static final LazyConstant<MethodHandle> GLAD_GL_CREATE_TEXTURES;
	private static final LazyConstant<MethodHandle> GLAD_GL_TEXTURE_BUFFER;
	private static final LazyConstant<MethodHandle> GLAD_GL_TEXTURE_BUFFER_RANGE;
	private static final LazyConstant<MethodHandle> GLAD_GL_TEXTURE_STORAGE1_D;
	private static final LazyConstant<MethodHandle> GLAD_GL_TEXTURE_STORAGE2_D;
	private static final LazyConstant<MethodHandle> GLAD_GL_TEXTURE_STORAGE3_D;
	private static final LazyConstant<MethodHandle> GLAD_GL_TEXTURE_STORAGE2_DMULTISAMPLE;
	private static final LazyConstant<MethodHandle> GLAD_GL_TEXTURE_STORAGE3_DMULTISAMPLE;
	private static final LazyConstant<MethodHandle> GLAD_GL_TEXTURE_SUB_IMAGE1_D;
	private static final LazyConstant<MethodHandle> GLAD_GL_TEXTURE_SUB_IMAGE2_D;
	private static final LazyConstant<MethodHandle> GLAD_GL_TEXTURE_SUB_IMAGE3_D;
	private static final LazyConstant<MethodHandle> GLAD_GL_COMPRESSED_TEXTURE_SUB_IMAGE1_D;
	private static final LazyConstant<MethodHandle> GLAD_GL_COMPRESSED_TEXTURE_SUB_IMAGE2_D;
	private static final LazyConstant<MethodHandle> GLAD_GL_COMPRESSED_TEXTURE_SUB_IMAGE3_D;
	private static final LazyConstant<MethodHandle> GLAD_GL_COPY_TEXTURE_SUB_IMAGE1_D;
	private static final LazyConstant<MethodHandle> GLAD_GL_COPY_TEXTURE_SUB_IMAGE2_D;
	private static final LazyConstant<MethodHandle> GLAD_GL_COPY_TEXTURE_SUB_IMAGE3_D;
	private static final LazyConstant<MethodHandle> GLAD_GL_TEXTURE_PARAMETERF;
	private static final LazyConstant<MethodHandle> GLAD_GL_TEXTURE_PARAMETERFV;
	private static final LazyConstant<MethodHandle> GLAD_GL_TEXTURE_PARAMETERI;
	private static final LazyConstant<MethodHandle> GLAD_GL_TEXTURE_PARAMETER_IIV;
	private static final LazyConstant<MethodHandle> GLAD_GL_TEXTURE_PARAMETER_IUIV;
	private static final LazyConstant<MethodHandle> GLAD_GL_TEXTURE_PARAMETERIV;
	private static final LazyConstant<MethodHandle> GLAD_GL_GENERATE_TEXTURE_MIPMAP;
	private static final LazyConstant<MethodHandle> GLAD_GL_BIND_TEXTURE_UNIT;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_TEXTURE_IMAGE;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_COMPRESSED_TEXTURE_IMAGE;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_TEXTURE_LEVEL_PARAMETERFV;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_TEXTURE_LEVEL_PARAMETERIV;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_TEXTURE_PARAMETERFV;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_TEXTURE_PARAMETER_IIV;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_TEXTURE_PARAMETER_IUIV;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_TEXTURE_PARAMETERIV;
	private static final LazyConstant<MethodHandle> GLAD_GL_CREATE_VERTEX_ARRAYS;
	private static final LazyConstant<MethodHandle> GLAD_GL_DISABLE_VERTEX_ARRAY_ATTRIB;
	private static final LazyConstant<MethodHandle> GLAD_GL_ENABLE_VERTEX_ARRAY_ATTRIB;
	private static final LazyConstant<MethodHandle> GLAD_GL_VERTEX_ARRAY_ELEMENT_BUFFER;
	private static final LazyConstant<MethodHandle> GLAD_GL_VERTEX_ARRAY_VERTEX_BUFFER;
	private static final LazyConstant<MethodHandle> GLAD_GL_VERTEX_ARRAY_VERTEX_BUFFERS;
	private static final LazyConstant<MethodHandle> GLAD_GL_VERTEX_ARRAY_ATTRIB_BINDING;
	private static final LazyConstant<MethodHandle> GLAD_GL_VERTEX_ARRAY_ATTRIB_FORMAT;
	private static final LazyConstant<MethodHandle> GLAD_GL_VERTEX_ARRAY_ATTRIB_IFORMAT;
	private static final LazyConstant<MethodHandle> GLAD_GL_VERTEX_ARRAY_ATTRIB_LFORMAT;
	private static final LazyConstant<MethodHandle> GLAD_GL_VERTEX_ARRAY_BINDING_DIVISOR;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_VERTEX_ARRAYIV;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_VERTEX_ARRAY_INDEXEDIV;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_VERTEX_ARRAY_INDEXED64IV;
	private static final LazyConstant<MethodHandle> GLAD_GL_CREATE_SAMPLERS;
	private static final LazyConstant<MethodHandle> GLAD_GL_CREATE_PROGRAM_PIPELINES;
	private static final LazyConstant<MethodHandle> GLAD_GL_CREATE_QUERIES;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_QUERY_BUFFER_OBJECTI64V;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_QUERY_BUFFER_OBJECTIV;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_QUERY_BUFFER_OBJECTUI64V;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_QUERY_BUFFER_OBJECTUIV;
	private static final LazyConstant<MethodHandle> GLAD_GL_MEMORY_BARRIER_BY_REGION;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_TEXTURE_SUB_IMAGE;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_COMPRESSED_TEXTURE_SUB_IMAGE;
	private static final LazyConstant<MethodHandle> GLAD_GL_GET_GRAPHICS_RESET_STATUS;
	private static final LazyConstant<MethodHandle> GLAD_GL_GETN_COMPRESSED_TEX_IMAGE;
	private static final LazyConstant<MethodHandle> GLAD_GL_GETN_TEX_IMAGE;
	private static final LazyConstant<MethodHandle> GLAD_GL_GETN_UNIFORMDV;
	private static final LazyConstant<MethodHandle> GLAD_GL_GETN_UNIFORMFV;
	private static final LazyConstant<MethodHandle> GLAD_GL_GETN_UNIFORMIV;
	private static final LazyConstant<MethodHandle> GLAD_GL_GETN_UNIFORMUIV;
	private static final LazyConstant<MethodHandle> GLAD_GL_READN_PIXELS;
	private static final LazyConstant<MethodHandle> GLAD_GL_GETN_MAPDV;
	private static final LazyConstant<MethodHandle> GLAD_GL_GETN_MAPFV;
	private static final LazyConstant<MethodHandle> GLAD_GL_GETN_MAPIV;
	private static final LazyConstant<MethodHandle> GLAD_GL_GETN_PIXEL_MAPFV;
	private static final LazyConstant<MethodHandle> GLAD_GL_GETN_PIXEL_MAPUIV;
	private static final LazyConstant<MethodHandle> GLAD_GL_GETN_PIXEL_MAPUSV;
	private static final LazyConstant<MethodHandle> GLAD_GL_GETN_POLYGON_STIPPLE;
	private static final LazyConstant<MethodHandle> GLAD_GL_GETN_COLOR_TABLE;
	private static final LazyConstant<MethodHandle> GLAD_GL_GETN_CONVOLUTION_FILTER;
	private static final LazyConstant<MethodHandle> GLAD_GL_GETN_SEPARABLE_FILTER;
	private static final LazyConstant<MethodHandle> GLAD_GL_GETN_HISTOGRAM;
	private static final LazyConstant<MethodHandle> GLAD_GL_GETN_MINMAX;
	private static final LazyConstant<MethodHandle> GLAD_GL_TEXTURE_BARRIER;
	private static final LazyConstant<MethodHandle> GLAD_GL_SPECIALIZE_SHADER;
	private static final LazyConstant<MethodHandle> GLAD_GL_MULTI_DRAW_ARRAYS_INDIRECT_COUNT;
	private static final LazyConstant<MethodHandle> GLAD_GL_MULTI_DRAW_ELEMENTS_INDIRECT_COUNT;
	private static final LazyConstant<MethodHandle> GLAD_GL_POLYGON_OFFSET_CLAMP;

	static {
		//@formatter:off
		GL_VERSION_1_0 = booleanSymbol("GLAD_GL_VERSION_1_0", true);
		GL_VERSION_1_1 = booleanSymbol("GLAD_GL_VERSION_1_1", true);
		GL_VERSION_1_2 = booleanSymbol("GLAD_GL_VERSION_1_2", true);
		GL_VERSION_1_3 = booleanSymbol("GLAD_GL_VERSION_1_3", true);
		GL_VERSION_1_4 = booleanSymbol("GLAD_GL_VERSION_1_4", true);
		GL_VERSION_1_5 = booleanSymbol("GLAD_GL_VERSION_1_5", true);
		GL_VERSION_2_0 = booleanSymbol("GLAD_GL_VERSION_2_0", true);
		GL_VERSION_2_1 = booleanSymbol("GLAD_GL_VERSION_2_1", true);
		GL_VERSION_3_0 = booleanSymbol("GLAD_GL_VERSION_3_0", true);
		GL_VERSION_3_1 = booleanSymbol("GLAD_GL_VERSION_3_1", true);
		GL_VERSION_3_2 = booleanSymbol("GLAD_GL_VERSION_3_2", true);
		GL_VERSION_3_3 = booleanSymbol("GLAD_GL_VERSION_3_3", true);
		GL_VERSION_4_0 = booleanSymbol("GLAD_GL_VERSION_4_0", true);
		GL_VERSION_4_1 = booleanSymbol("GLAD_GL_VERSION_4_1", true);
		GL_VERSION_4_2 = booleanSymbol("GLAD_GL_VERSION_4_2", true);
		GL_VERSION_4_3 = booleanSymbol("GLAD_GL_VERSION_4_3", true);
		GL_VERSION_4_4 = booleanSymbol("GLAD_GL_VERSION_4_4", true);
		GL_VERSION_4_5 = booleanSymbol("GLAD_GL_VERSION_4_5", true);
		GL_VERSION_4_6 = booleanSymbol("GLAD_GL_VERSION_4_6", true);
		
		GLAD_LOAD_GL = downcallHandle("gladLoadGL", JAVA_INT);
		GLAD_LOAD_GLLOADER = downcallHandle("gladLoadGLLoader", JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_CULL_FACE = downcallHandleVoid(true, "glad_glCullFace", JAVA_INT);
		GLAD_GL_FRONT_FACE = downcallHandleVoid(true, "glad_glFrontFace", JAVA_INT);
		GLAD_GL_HINT = downcallHandleVoid(true, "glad_glHint", JAVA_INT, JAVA_INT);
		GLAD_GL_LINE_WIDTH = downcallHandleVoid(true, "glad_glLineWidth", JAVA_FLOAT);
		GLAD_GL_POINT_SIZE = downcallHandleVoid(true, "glad_glPointSize", JAVA_FLOAT);
		GLAD_GL_POLYGON_MODE = downcallHandleVoid(true, "glad_glPolygonMode", JAVA_INT, JAVA_INT);
		GLAD_GL_SCISSOR = downcallHandleVoid(true, "glad_glScissor", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT);
		GLAD_GL_TEX_PARAMETERF = downcallHandleVoid(true, "glad_glTexParameterf", JAVA_INT, JAVA_INT, JAVA_FLOAT);
		GLAD_GL_TEX_PARAMETERFV = downcallHandleVoid(true, "glad_glTexParameterfv", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_TEX_PARAMETERI = downcallHandleVoid(true, "glad_glTexParameteri", JAVA_INT, JAVA_INT, JAVA_INT);
		GLAD_GL_TEX_PARAMETERIV = downcallHandleVoid(true, "glad_glTexParameteriv", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_TEX_IMAGE1_D = downcallHandleVoid(true, "glad_glTexImage1D", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_TEX_IMAGE2_D = downcallHandleVoid(true, "glad_glTexImage2D", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_DRAW_BUFFER = downcallHandleVoid(true, "glad_glDrawBuffer", JAVA_INT);
		GLAD_GL_CLEAR = downcallHandleVoid(true, "glad_glClear", JAVA_INT);
		GLAD_GL_CLEAR_COLOR = downcallHandleVoid(true, "glad_glClearColor", JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT);
		GLAD_GL_CLEAR_STENCIL = downcallHandleVoid(true, "glad_glClearStencil", JAVA_INT);
		GLAD_GL_CLEAR_DEPTH = downcallHandleVoid(true, "glad_glClearDepth", JAVA_DOUBLE);
		GLAD_GL_STENCIL_MASK = downcallHandleVoid(true, "glad_glStencilMask", JAVA_INT);
		GLAD_GL_COLOR_MASK = downcallHandleVoid(true, "glad_glColorMask", JAVA_BYTE, JAVA_BYTE, JAVA_BYTE, JAVA_BYTE);
		GLAD_GL_DEPTH_MASK = downcallHandleVoid(true, "glad_glDepthMask", JAVA_BYTE);
		GLAD_GL_DISABLE = downcallHandleVoid(true, "glad_glDisable", JAVA_INT);
		GLAD_GL_ENABLE = downcallHandleVoid(true, "glad_glEnable", JAVA_INT);
		GLAD_GL_FINISH = downcallHandleVoid(true, "glad_glFinish");
		GLAD_GL_FLUSH = downcallHandleVoid(true, "glad_glFlush");
		GLAD_GL_BLEND_FUNC = downcallHandleVoid(true, "glad_glBlendFunc", JAVA_INT, JAVA_INT);
		GLAD_GL_LOGIC_OP = downcallHandleVoid(true, "glad_glLogicOp", JAVA_INT);
		GLAD_GL_STENCIL_FUNC = downcallHandleVoid(true, "glad_glStencilFunc", JAVA_INT, JAVA_INT, JAVA_INT);
		GLAD_GL_STENCIL_OP = downcallHandleVoid(true, "glad_glStencilOp", JAVA_INT, JAVA_INT, JAVA_INT);
		GLAD_GL_DEPTH_FUNC = downcallHandleVoid(true, "glad_glDepthFunc", JAVA_INT);
		GLAD_GL_PIXEL_STOREF = downcallHandleVoid(true, "glad_glPixelStoref", JAVA_INT, JAVA_FLOAT);
		GLAD_GL_PIXEL_STOREI = downcallHandleVoid(true, "glad_glPixelStorei", JAVA_INT, JAVA_INT);
		GLAD_GL_READ_BUFFER = downcallHandleVoid(true, "glad_glReadBuffer", JAVA_INT);
		GLAD_GL_READ_PIXELS = downcallHandleVoid(true, "glad_glReadPixels", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_GET_BOOLEANV = downcallHandleVoid(true, "glad_glGetBooleanv", JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_GET_DOUBLEV = downcallHandleVoid(true, "glad_glGetDoublev", JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_GET_ERROR = downcallHandle(true, "glad_glGetError", JAVA_INT);
		GLAD_GL_GET_FLOATV = downcallHandleVoid(true, "glad_glGetFloatv", JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_GET_INTEGERV = downcallHandleVoid(true, "glad_glGetIntegerv", JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_GET_STRING = downcallHandle(true, "glad_glGetString", UNBOUNDED_ADDRESS, JAVA_INT);
		GLAD_GL_GET_TEX_IMAGE = downcallHandleVoid(true, "glad_glGetTexImage", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_GET_TEX_PARAMETERFV = downcallHandleVoid(true, "glad_glGetTexParameterfv", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_GET_TEX_PARAMETERIV = downcallHandleVoid(true, "glad_glGetTexParameteriv", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_GET_TEX_LEVEL_PARAMETERFV = downcallHandleVoid(true, "glad_glGetTexLevelParameterfv", JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_GET_TEX_LEVEL_PARAMETERIV = downcallHandleVoid(true, "glad_glGetTexLevelParameteriv", JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_IS_ENABLED = downcallHandle(true, "glad_glIsEnabled", JAVA_BYTE, JAVA_INT);
		GLAD_GL_DEPTH_RANGE = downcallHandleVoid(true, "glad_glDepthRange", JAVA_DOUBLE, JAVA_DOUBLE);
		GLAD_GL_VIEWPORT = downcallHandleVoid(true, "glad_glViewport", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT);
		GLAD_GL_DRAW_ARRAYS = downcallHandleVoid(true, "glad_glDrawArrays", JAVA_INT, JAVA_INT, JAVA_INT);
		GLAD_GL_DRAW_ELEMENTS = downcallHandleVoid(true, "glad_glDrawElements", JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_POLYGON_OFFSET = downcallHandleVoid(true, "glad_glPolygonOffset", JAVA_FLOAT, JAVA_FLOAT);
		GLAD_GL_COPY_TEX_IMAGE1_D = downcallHandleVoid(true, "glad_glCopyTexImage1D", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT);
		GLAD_GL_COPY_TEX_IMAGE2_D = downcallHandleVoid(true, "glad_glCopyTexImage2D", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT);
		GLAD_GL_COPY_TEX_SUB_IMAGE1_D = downcallHandleVoid(true, "glad_glCopyTexSubImage1D", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT);
		GLAD_GL_COPY_TEX_SUB_IMAGE2_D = downcallHandleVoid(true, "glad_glCopyTexSubImage2D", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT);
		GLAD_GL_TEX_SUB_IMAGE1_D = downcallHandleVoid(true, "glad_glTexSubImage1D", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_TEX_SUB_IMAGE2_D = downcallHandleVoid(true, "glad_glTexSubImage2D", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_BIND_TEXTURE = downcallHandleVoid(true, "glad_glBindTexture", JAVA_INT, JAVA_INT);
		GLAD_GL_DELETE_TEXTURES = downcallHandleVoid(true, "glad_glDeleteTextures", JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_GEN_TEXTURES = downcallHandleVoid(true, "glad_glGenTextures", JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_IS_TEXTURE = downcallHandle(true, "glad_glIsTexture", JAVA_BYTE, JAVA_INT);
		GLAD_GL_DRAW_RANGE_ELEMENTS = downcallHandleVoid(true, "glad_glDrawRangeElements", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_TEX_IMAGE3_D = downcallHandleVoid(true, "glad_glTexImage3D", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_TEX_SUB_IMAGE3_D = downcallHandleVoid(true, "glad_glTexSubImage3D", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_COPY_TEX_SUB_IMAGE3_D = downcallHandleVoid(true, "glad_glCopyTexSubImage3D", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT);
		GLAD_GL_ACTIVE_TEXTURE = downcallHandleVoid(true, "glad_glActiveTexture", JAVA_INT);
		GLAD_GL_SAMPLE_COVERAGE = downcallHandleVoid(true, "glad_glSampleCoverage", JAVA_FLOAT, JAVA_BYTE);
		GLAD_GL_COMPRESSED_TEX_IMAGE3_D = downcallHandleVoid(true, "glad_glCompressedTexImage3D", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_COMPRESSED_TEX_IMAGE2_D = downcallHandleVoid(true, "glad_glCompressedTexImage2D", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_COMPRESSED_TEX_IMAGE1_D = downcallHandleVoid(true, "glad_glCompressedTexImage1D", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_COMPRESSED_TEX_SUB_IMAGE3_D = downcallHandleVoid(true, "glad_glCompressedTexSubImage3D", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_COMPRESSED_TEX_SUB_IMAGE2_D = downcallHandleVoid(true, "glad_glCompressedTexSubImage2D", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_COMPRESSED_TEX_SUB_IMAGE1_D = downcallHandleVoid(true, "glad_glCompressedTexSubImage1D", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_GET_COMPRESSED_TEX_IMAGE = downcallHandleVoid(true, "glad_glGetCompressedTexImage", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_BLEND_FUNC_SEPARATE = downcallHandleVoid(true, "glad_glBlendFuncSeparate", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT);
		GLAD_GL_MULTI_DRAW_ARRAYS = downcallHandleVoid(true, "glad_glMultiDrawArrays", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
		GLAD_GL_MULTI_DRAW_ELEMENTS = downcallHandleVoid(true, "glad_glMultiDrawElements", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT);
		GLAD_GL_POINT_PARAMETERF = downcallHandleVoid(true, "glad_glPointParameterf", JAVA_INT, JAVA_FLOAT);
		GLAD_GL_POINT_PARAMETERFV = downcallHandleVoid(true, "glad_glPointParameterfv", JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_POINT_PARAMETERI = downcallHandleVoid(true, "glad_glPointParameteri", JAVA_INT, JAVA_INT);
		GLAD_GL_POINT_PARAMETERIV = downcallHandleVoid(true, "glad_glPointParameteriv", JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_BLEND_COLOR = downcallHandleVoid(true, "glad_glBlendColor", JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT);
		GLAD_GL_BLEND_EQUATION = downcallHandleVoid(true, "glad_glBlendEquation", JAVA_INT);
		GLAD_GL_GEN_QUERIES = downcallHandleVoid(true, "glad_glGenQueries", JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_DELETE_QUERIES = downcallHandleVoid(true, "glad_glDeleteQueries", JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_IS_QUERY = downcallHandle(true, "glad_glIsQuery", JAVA_BYTE, JAVA_INT);
		GLAD_GL_BEGIN_QUERY = downcallHandleVoid(true, "glad_glBeginQuery", JAVA_INT, JAVA_INT);
		GLAD_GL_END_QUERY = downcallHandleVoid(true, "glad_glEndQuery", JAVA_INT);
		GLAD_GL_GET_QUERYIV = downcallHandleVoid(true, "glad_glGetQueryiv", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_GET_QUERY_OBJECTIV = downcallHandleVoid(true, "glad_glGetQueryObjectiv", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_GET_QUERY_OBJECTUIV = downcallHandleVoid(true, "glad_glGetQueryObjectuiv", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_BIND_BUFFER = downcallHandleVoid(true, "glad_glBindBuffer", JAVA_INT, JAVA_INT);
		GLAD_GL_DELETE_BUFFERS = downcallHandleVoid(true, "glad_glDeleteBuffers", JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_GEN_BUFFERS = downcallHandleVoid(true, "glad_glGenBuffers", JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_IS_BUFFER = downcallHandle(true, "glad_glIsBuffer", JAVA_BYTE, JAVA_INT);
		GLAD_GL_BUFFER_DATA = downcallHandleVoid(true, "glad_glBufferData", JAVA_INT, JAVA_LONG, UNBOUNDED_ADDRESS, JAVA_INT);
		GLAD_GL_BUFFER_SUB_DATA = downcallHandleVoid(true, "glad_glBufferSubData", JAVA_INT, JAVA_LONG, JAVA_LONG, UNBOUNDED_ADDRESS);
		GLAD_GL_GET_BUFFER_SUB_DATA = downcallHandleVoid(true, "glad_glGetBufferSubData", JAVA_INT, JAVA_LONG, JAVA_LONG, UNBOUNDED_ADDRESS);
		GLAD_GL_MAP_BUFFER = downcallHandle(true, "glad_glMapBuffer", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
		GLAD_GL_UNMAP_BUFFER = downcallHandle(true, "glad_glUnmapBuffer", JAVA_BYTE, JAVA_INT);
		GLAD_GL_GET_BUFFER_PARAMETERIV = downcallHandleVoid(true, "glad_glGetBufferParameteriv", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_GET_BUFFER_POINTERV = downcallHandleVoid(true, "glad_glGetBufferPointerv", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_BLEND_EQUATION_SEPARATE = downcallHandleVoid(true, "glad_glBlendEquationSeparate", JAVA_INT, JAVA_INT);
		GLAD_GL_DRAW_BUFFERS = downcallHandleVoid(true, "glad_glDrawBuffers", JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_STENCIL_OP_SEPARATE = downcallHandleVoid(true, "glad_glStencilOpSeparate", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT);
		GLAD_GL_STENCIL_FUNC_SEPARATE = downcallHandleVoid(true, "glad_glStencilFuncSeparate", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT);
		GLAD_GL_STENCIL_MASK_SEPARATE = downcallHandleVoid(true, "glad_glStencilMaskSeparate", JAVA_INT, JAVA_INT);
		GLAD_GL_ATTACH_SHADER = downcallHandleVoid(true, "glad_glAttachShader", JAVA_INT, JAVA_INT);
		GLAD_GL_BIND_ATTRIB_LOCATION = downcallHandleVoid(true, "glad_glBindAttribLocation", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_COMPILE_SHADER = downcallHandleVoid(true, "glad_glCompileShader", JAVA_INT);
		GLAD_GL_CREATE_PROGRAM = downcallHandle(true, "glad_glCreateProgram", JAVA_INT);
		GLAD_GL_CREATE_SHADER = downcallHandle(true, "glad_glCreateShader", JAVA_INT, JAVA_INT);
		GLAD_GL_DELETE_PROGRAM = downcallHandleVoid(true, "glad_glDeleteProgram", JAVA_INT);
		GLAD_GL_DELETE_SHADER = downcallHandleVoid(true, "glad_glDeleteShader", JAVA_INT);
		GLAD_GL_DETACH_SHADER = downcallHandleVoid(true, "glad_glDetachShader", JAVA_INT, JAVA_INT);
		GLAD_GL_DISABLE_VERTEX_ATTRIB_ARRAY = downcallHandleVoid(true, "glad_glDisableVertexAttribArray", JAVA_INT);
		GLAD_GL_ENABLE_VERTEX_ATTRIB_ARRAY = downcallHandleVoid(true, "glad_glEnableVertexAttribArray", JAVA_INT);
		GLAD_GL_GET_ACTIVE_ATTRIB = downcallHandleVoid(true, "glad_glGetActiveAttrib", JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		GLAD_GL_GET_ACTIVE_UNIFORM = downcallHandleVoid(true, "glad_glGetActiveUniform", JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		GLAD_GL_GET_ATTACHED_SHADERS = downcallHandleVoid(true, "glad_glGetAttachedShaders", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		GLAD_GL_GET_ATTRIB_LOCATION = downcallHandle(true, "glad_glGetAttribLocation", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_GET_PROGRAMIV = downcallHandleVoid(true, "glad_glGetProgramiv", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_GET_PROGRAM_INFO_LOG = downcallHandleVoid(true, "glad_glGetProgramInfoLog", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		GLAD_GL_GET_SHADERIV = downcallHandleVoid(true, "glad_glGetShaderiv", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_GET_SHADER_INFO_LOG = downcallHandleVoid(true, "glad_glGetShaderInfoLog", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		GLAD_GL_GET_SHADER_SOURCE = downcallHandleVoid(true, "glad_glGetShaderSource", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		GLAD_GL_GET_UNIFORM_LOCATION = downcallHandle(true, "glad_glGetUniformLocation", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_GET_UNIFORMFV = downcallHandleVoid(true, "glad_glGetUniformfv", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_GET_UNIFORMIV = downcallHandleVoid(true, "glad_glGetUniformiv", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_GET_VERTEX_ATTRIBDV = downcallHandleVoid(true, "glad_glGetVertexAttribdv", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_GET_VERTEX_ATTRIBFV = downcallHandleVoid(true, "glad_glGetVertexAttribfv", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_GET_VERTEX_ATTRIBIV = downcallHandleVoid(true, "glad_glGetVertexAttribiv", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_GET_VERTEX_ATTRIB_POINTERV = downcallHandleVoid(true, "glad_glGetVertexAttribPointerv", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_IS_PROGRAM = downcallHandle(true, "glad_glIsProgram", JAVA_BYTE, JAVA_INT);
		GLAD_GL_IS_SHADER = downcallHandle(true, "glad_glIsShader", JAVA_BYTE, JAVA_INT);
		GLAD_GL_LINK_PROGRAM = downcallHandleVoid(true, "glad_glLinkProgram", JAVA_INT);
		GLAD_GL_SHADER_SOURCE = downcallHandleVoid(true, "glad_glShaderSource", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		GLAD_GL_USE_PROGRAM = downcallHandleVoid(true, "glad_glUseProgram", JAVA_INT);
		GLAD_GL_UNIFORM1F = downcallHandleVoid(true, "glad_glUniform1f", JAVA_INT, JAVA_FLOAT);
		GLAD_GL_UNIFORM2F = downcallHandleVoid(true, "glad_glUniform2f", JAVA_INT, JAVA_FLOAT, JAVA_FLOAT);
		GLAD_GL_UNIFORM3F = downcallHandleVoid(true, "glad_glUniform3f", JAVA_INT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT);
		GLAD_GL_UNIFORM4F = downcallHandleVoid(true, "glad_glUniform4f", JAVA_INT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT);
		GLAD_GL_UNIFORM1I = downcallHandleVoid(true, "glad_glUniform1i", JAVA_INT, JAVA_INT);
		GLAD_GL_UNIFORM2I = downcallHandleVoid(true, "glad_glUniform2i", JAVA_INT, JAVA_INT, JAVA_INT);
		GLAD_GL_UNIFORM3I = downcallHandleVoid(true, "glad_glUniform3i", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT);
		GLAD_GL_UNIFORM4I = downcallHandleVoid(true, "glad_glUniform4i", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT);
		GLAD_GL_UNIFORM1FV = downcallHandleVoid(true, "glad_glUniform1fv", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_UNIFORM2FV = downcallHandleVoid(true, "glad_glUniform2fv", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_UNIFORM3FV = downcallHandleVoid(true, "glad_glUniform3fv", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_UNIFORM4FV = downcallHandleVoid(true, "glad_glUniform4fv", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_UNIFORM1IV = downcallHandleVoid(true, "glad_glUniform1iv", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_UNIFORM2IV = downcallHandleVoid(true, "glad_glUniform2iv", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_UNIFORM3IV = downcallHandleVoid(true, "glad_glUniform3iv", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_UNIFORM4IV = downcallHandleVoid(true, "glad_glUniform4iv", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_UNIFORM_MATRIX2FV = downcallHandleVoid(true, "glad_glUniformMatrix2fv", JAVA_INT, JAVA_INT, JAVA_BYTE, UNBOUNDED_ADDRESS);
		GLAD_GL_UNIFORM_MATRIX3FV = downcallHandleVoid(true, "glad_glUniformMatrix3fv", JAVA_INT, JAVA_INT, JAVA_BYTE, UNBOUNDED_ADDRESS);
		GLAD_GL_UNIFORM_MATRIX4FV = downcallHandleVoid(true, "glad_glUniformMatrix4fv", JAVA_INT, JAVA_INT, JAVA_BYTE, UNBOUNDED_ADDRESS);
		GLAD_GL_VALIDATE_PROGRAM = downcallHandleVoid(true, "glad_glValidateProgram", JAVA_INT);
		GLAD_GL_VERTEX_ATTRIB1D = downcallHandleVoid(true, "glad_glVertexAttrib1d", JAVA_INT, JAVA_DOUBLE);
		GLAD_GL_VERTEX_ATTRIB1DV = downcallHandleVoid(true, "glad_glVertexAttrib1dv", JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_VERTEX_ATTRIB1F = downcallHandleVoid(true, "glad_glVertexAttrib1f", JAVA_INT, JAVA_FLOAT);
		GLAD_GL_VERTEX_ATTRIB1FV = downcallHandleVoid(true, "glad_glVertexAttrib1fv", JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_VERTEX_ATTRIB1S = downcallHandleVoid(true, "glad_glVertexAttrib1s", JAVA_INT, JAVA_SHORT);
		GLAD_GL_VERTEX_ATTRIB1SV = downcallHandleVoid(true, "glad_glVertexAttrib1sv", JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_VERTEX_ATTRIB2D = downcallHandleVoid(true, "glad_glVertexAttrib2d", JAVA_INT, JAVA_DOUBLE, JAVA_DOUBLE);
		GLAD_GL_VERTEX_ATTRIB2DV = downcallHandleVoid(true, "glad_glVertexAttrib2dv", JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_VERTEX_ATTRIB2F = downcallHandleVoid(true, "glad_glVertexAttrib2f", JAVA_INT, JAVA_FLOAT, JAVA_FLOAT);
		GLAD_GL_VERTEX_ATTRIB2FV = downcallHandleVoid(true, "glad_glVertexAttrib2fv", JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_VERTEX_ATTRIB2S = downcallHandleVoid(true, "glad_glVertexAttrib2s", JAVA_INT, JAVA_SHORT, JAVA_SHORT);
		GLAD_GL_VERTEX_ATTRIB2SV = downcallHandleVoid(true, "glad_glVertexAttrib2sv", JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_VERTEX_ATTRIB3D = downcallHandleVoid(true, "glad_glVertexAttrib3d", JAVA_INT, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE);
		GLAD_GL_VERTEX_ATTRIB3DV = downcallHandleVoid(true, "glad_glVertexAttrib3dv", JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_VERTEX_ATTRIB3F = downcallHandleVoid(true, "glad_glVertexAttrib3f", JAVA_INT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT);
		GLAD_GL_VERTEX_ATTRIB3FV = downcallHandleVoid(true, "glad_glVertexAttrib3fv", JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_VERTEX_ATTRIB3S = downcallHandleVoid(true, "glad_glVertexAttrib3s", JAVA_INT, JAVA_SHORT, JAVA_SHORT, JAVA_SHORT);
		GLAD_GL_VERTEX_ATTRIB3SV = downcallHandleVoid(true, "glad_glVertexAttrib3sv", JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_VERTEX_ATTRIB4_NBV = downcallHandleVoid(true, "glad_glVertexAttrib4Nbv", JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_VERTEX_ATTRIB4_NIV = downcallHandleVoid(true, "glad_glVertexAttrib4Niv", JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_VERTEX_ATTRIB4_NSV = downcallHandleVoid(true, "glad_glVertexAttrib4Nsv", JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_VERTEX_ATTRIB4_NUB = downcallHandleVoid(true, "glad_glVertexAttrib4Nub", JAVA_INT, JAVA_BYTE, JAVA_BYTE, JAVA_BYTE, JAVA_BYTE);
		GLAD_GL_VERTEX_ATTRIB4_NUBV = downcallHandleVoid(true, "glad_glVertexAttrib4Nubv", JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_VERTEX_ATTRIB4_NUIV = downcallHandleVoid(true, "glad_glVertexAttrib4Nuiv", JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_VERTEX_ATTRIB4_NUSV = downcallHandleVoid(true, "glad_glVertexAttrib4Nusv", JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_VERTEX_ATTRIB4BV = downcallHandleVoid(true, "glad_glVertexAttrib4bv", JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_VERTEX_ATTRIB4D = downcallHandleVoid(true, "glad_glVertexAttrib4d", JAVA_INT, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE);
		GLAD_GL_VERTEX_ATTRIB4DV = downcallHandleVoid(true, "glad_glVertexAttrib4dv", JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_VERTEX_ATTRIB4F = downcallHandleVoid(true, "glad_glVertexAttrib4f", JAVA_INT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT);
		GLAD_GL_VERTEX_ATTRIB4FV = downcallHandleVoid(true, "glad_glVertexAttrib4fv", JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_VERTEX_ATTRIB4IV = downcallHandleVoid(true, "glad_glVertexAttrib4iv", JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_VERTEX_ATTRIB4S = downcallHandleVoid(true, "glad_glVertexAttrib4s", JAVA_INT, JAVA_SHORT, JAVA_SHORT, JAVA_SHORT, JAVA_SHORT);
		GLAD_GL_VERTEX_ATTRIB4SV = downcallHandleVoid(true, "glad_glVertexAttrib4sv", JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_VERTEX_ATTRIB4UBV = downcallHandleVoid(true, "glad_glVertexAttrib4ubv", JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_VERTEX_ATTRIB4UIV = downcallHandleVoid(true, "glad_glVertexAttrib4uiv", JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_VERTEX_ATTRIB4USV = downcallHandleVoid(true, "glad_glVertexAttrib4usv", JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_VERTEX_ATTRIB_POINTER = downcallHandleVoid(true, "glad_glVertexAttribPointer", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_BYTE, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_UNIFORM_MATRIX2X3FV = downcallHandleVoid(true, "glad_glUniformMatrix2x3fv", JAVA_INT, JAVA_INT, JAVA_BYTE, UNBOUNDED_ADDRESS);
		GLAD_GL_UNIFORM_MATRIX3X2FV = downcallHandleVoid(true, "glad_glUniformMatrix3x2fv", JAVA_INT, JAVA_INT, JAVA_BYTE, UNBOUNDED_ADDRESS);
		GLAD_GL_UNIFORM_MATRIX2X4FV = downcallHandleVoid(true, "glad_glUniformMatrix2x4fv", JAVA_INT, JAVA_INT, JAVA_BYTE, UNBOUNDED_ADDRESS);
		GLAD_GL_UNIFORM_MATRIX4X2FV = downcallHandleVoid(true, "glad_glUniformMatrix4x2fv", JAVA_INT, JAVA_INT, JAVA_BYTE, UNBOUNDED_ADDRESS);
		GLAD_GL_UNIFORM_MATRIX3X4FV = downcallHandleVoid(true, "glad_glUniformMatrix3x4fv", JAVA_INT, JAVA_INT, JAVA_BYTE, UNBOUNDED_ADDRESS);
		GLAD_GL_UNIFORM_MATRIX4X3FV = downcallHandleVoid(true, "glad_glUniformMatrix4x3fv", JAVA_INT, JAVA_INT, JAVA_BYTE, UNBOUNDED_ADDRESS);
		GLAD_GL_COLOR_MASKI = downcallHandleVoid(true, "glad_glColorMaski", JAVA_INT, JAVA_BYTE, JAVA_BYTE, JAVA_BYTE, JAVA_BYTE);
		GLAD_GL_GET_BOOLEANI_V = downcallHandleVoid(true, "glad_glGetBooleani_v", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_GET_INTEGERI_V = downcallHandleVoid(true, "glad_glGetIntegeri_v", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_ENABLEI = downcallHandleVoid(true, "glad_glEnablei", JAVA_INT, JAVA_INT);
		GLAD_GL_DISABLEI = downcallHandleVoid(true, "glad_glDisablei", JAVA_INT, JAVA_INT);
		GLAD_GL_IS_ENABLEDI = downcallHandle(true, "glad_glIsEnabledi", JAVA_BYTE, JAVA_INT, JAVA_INT);
		GLAD_GL_BEGIN_TRANSFORM_FEEDBACK = downcallHandleVoid(true, "glad_glBeginTransformFeedback", JAVA_INT);
		GLAD_GL_END_TRANSFORM_FEEDBACK = downcallHandleVoid(true, "glad_glEndTransformFeedback");
		GLAD_GL_BIND_BUFFER_RANGE = downcallHandleVoid(true, "glad_glBindBufferRange", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_LONG, JAVA_LONG);
		GLAD_GL_BIND_BUFFER_BASE = downcallHandleVoid(true, "glad_glBindBufferBase", JAVA_INT, JAVA_INT, JAVA_INT);
		GLAD_GL_TRANSFORM_FEEDBACK_VARYINGS = downcallHandleVoid(true, "glad_glTransformFeedbackVaryings", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT);
		GLAD_GL_GET_TRANSFORM_FEEDBACK_VARYING = downcallHandleVoid(true, "glad_glGetTransformFeedbackVarying", JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		GLAD_GL_CLAMP_COLOR = downcallHandleVoid(true, "glad_glClampColor", JAVA_INT, JAVA_INT);
		GLAD_GL_BEGIN_CONDITIONAL_RENDER = downcallHandleVoid(true, "glad_glBeginConditionalRender", JAVA_INT, JAVA_INT);
		GLAD_GL_END_CONDITIONAL_RENDER = downcallHandleVoid(true, "glad_glEndConditionalRender");
		GLAD_GL_VERTEX_ATTRIB_IPOINTER = downcallHandleVoid(true, "glad_glVertexAttribIPointer", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_GET_VERTEX_ATTRIB_IIV = downcallHandleVoid(true, "glad_glGetVertexAttribIiv", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_GET_VERTEX_ATTRIB_IUIV = downcallHandleVoid(true, "glad_glGetVertexAttribIuiv", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_VERTEX_ATTRIB_I1I = downcallHandleVoid(true, "glad_glVertexAttribI1i", JAVA_INT, JAVA_INT);
		GLAD_GL_VERTEX_ATTRIB_I2I = downcallHandleVoid(true, "glad_glVertexAttribI2i", JAVA_INT, JAVA_INT, JAVA_INT);
		GLAD_GL_VERTEX_ATTRIB_I3I = downcallHandleVoid(true, "glad_glVertexAttribI3i", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT);
		GLAD_GL_VERTEX_ATTRIB_I4I = downcallHandleVoid(true, "glad_glVertexAttribI4i", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT);
		GLAD_GL_VERTEX_ATTRIB_I1UI = downcallHandleVoid(true, "glad_glVertexAttribI1ui", JAVA_INT, JAVA_INT);
		GLAD_GL_VERTEX_ATTRIB_I2UI = downcallHandleVoid(true, "glad_glVertexAttribI2ui", JAVA_INT, JAVA_INT, JAVA_INT);
		GLAD_GL_VERTEX_ATTRIB_I3UI = downcallHandleVoid(true, "glad_glVertexAttribI3ui", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT);
		GLAD_GL_VERTEX_ATTRIB_I4UI = downcallHandleVoid(true, "glad_glVertexAttribI4ui", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT);
		GLAD_GL_VERTEX_ATTRIB_I1IV = downcallHandleVoid(true, "glad_glVertexAttribI1iv", JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_VERTEX_ATTRIB_I2IV = downcallHandleVoid(true, "glad_glVertexAttribI2iv", JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_VERTEX_ATTRIB_I3IV = downcallHandleVoid(true, "glad_glVertexAttribI3iv", JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_VERTEX_ATTRIB_I4IV = downcallHandleVoid(true, "glad_glVertexAttribI4iv", JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_VERTEX_ATTRIB_I1UIV = downcallHandleVoid(true, "glad_glVertexAttribI1uiv", JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_VERTEX_ATTRIB_I2UIV = downcallHandleVoid(true, "glad_glVertexAttribI2uiv", JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_VERTEX_ATTRIB_I3UIV = downcallHandleVoid(true, "glad_glVertexAttribI3uiv", JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_VERTEX_ATTRIB_I4UIV = downcallHandleVoid(true, "glad_glVertexAttribI4uiv", JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_VERTEX_ATTRIB_I4BV = downcallHandleVoid(true, "glad_glVertexAttribI4bv", JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_VERTEX_ATTRIB_I4SV = downcallHandleVoid(true, "glad_glVertexAttribI4sv", JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_VERTEX_ATTRIB_I4UBV = downcallHandleVoid(true, "glad_glVertexAttribI4ubv", JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_VERTEX_ATTRIB_I4USV = downcallHandleVoid(true, "glad_glVertexAttribI4usv", JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_GET_UNIFORMUIV = downcallHandleVoid(true, "glad_glGetUniformuiv", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_BIND_FRAG_DATA_LOCATION = downcallHandleVoid(true, "glad_glBindFragDataLocation", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_GET_FRAG_DATA_LOCATION = downcallHandle(true, "glad_glGetFragDataLocation", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_UNIFORM1UI = downcallHandleVoid(true, "glad_glUniform1ui", JAVA_INT, JAVA_INT);
		GLAD_GL_UNIFORM2UI = downcallHandleVoid(true, "glad_glUniform2ui", JAVA_INT, JAVA_INT, JAVA_INT);
		GLAD_GL_UNIFORM3UI = downcallHandleVoid(true, "glad_glUniform3ui", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT);
		GLAD_GL_UNIFORM4UI = downcallHandleVoid(true, "glad_glUniform4ui", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT);
		GLAD_GL_UNIFORM1UIV = downcallHandleVoid(true, "glad_glUniform1uiv", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_UNIFORM2UIV = downcallHandleVoid(true, "glad_glUniform2uiv", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_UNIFORM3UIV = downcallHandleVoid(true, "glad_glUniform3uiv", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_UNIFORM4UIV = downcallHandleVoid(true, "glad_glUniform4uiv", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_TEX_PARAMETER_IIV = downcallHandleVoid(true, "glad_glTexParameterIiv", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_TEX_PARAMETER_IUIV = downcallHandleVoid(true, "glad_glTexParameterIuiv", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_GET_TEX_PARAMETER_IIV = downcallHandleVoid(true, "glad_glGetTexParameterIiv", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_GET_TEX_PARAMETER_IUIV = downcallHandleVoid(true, "glad_glGetTexParameterIuiv", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_CLEAR_BUFFERIV = downcallHandleVoid(true, "glad_glClearBufferiv", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_CLEAR_BUFFERUIV = downcallHandleVoid(true, "glad_glClearBufferuiv", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_CLEAR_BUFFERFV = downcallHandleVoid(true, "glad_glClearBufferfv", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_CLEAR_BUFFERFI = downcallHandleVoid(true, "glad_glClearBufferfi", JAVA_INT, JAVA_INT, JAVA_FLOAT, JAVA_INT);
		GLAD_GL_GET_STRINGI = downcallHandle(true, "glad_glGetStringi", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
		GLAD_GL_IS_RENDERBUFFER = downcallHandle(true, "glad_glIsRenderbuffer", JAVA_BYTE, JAVA_INT);
		GLAD_GL_BIND_RENDERBUFFER = downcallHandleVoid(true, "glad_glBindRenderbuffer", JAVA_INT, JAVA_INT);
		GLAD_GL_DELETE_RENDERBUFFERS = downcallHandleVoid(true, "glad_glDeleteRenderbuffers", JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_GEN_RENDERBUFFERS = downcallHandleVoid(true, "glad_glGenRenderbuffers", JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_RENDERBUFFER_STORAGE = downcallHandleVoid(true, "glad_glRenderbufferStorage", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT);
		GLAD_GL_GET_RENDERBUFFER_PARAMETERIV = downcallHandleVoid(true, "glad_glGetRenderbufferParameteriv", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_IS_FRAMEBUFFER = downcallHandle(true, "glad_glIsFramebuffer", JAVA_BYTE, JAVA_INT);
		GLAD_GL_BIND_FRAMEBUFFER = downcallHandleVoid(true, "glad_glBindFramebuffer", JAVA_INT, JAVA_INT);
		GLAD_GL_DELETE_FRAMEBUFFERS = downcallHandleVoid(true, "glad_glDeleteFramebuffers", JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_GEN_FRAMEBUFFERS = downcallHandleVoid(true, "glad_glGenFramebuffers", JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_CHECK_FRAMEBUFFER_STATUS = downcallHandle(true, "glad_glCheckFramebufferStatus", JAVA_INT, JAVA_INT);
		GLAD_GL_FRAMEBUFFER_TEXTURE1_D = downcallHandleVoid(true, "glad_glFramebufferTexture1D", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT);
		GLAD_GL_FRAMEBUFFER_TEXTURE2_D = downcallHandleVoid(true, "glad_glFramebufferTexture2D", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT);
		GLAD_GL_FRAMEBUFFER_TEXTURE3_D = downcallHandleVoid(true, "glad_glFramebufferTexture3D", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT);
		GLAD_GL_FRAMEBUFFER_RENDERBUFFER = downcallHandleVoid(true, "glad_glFramebufferRenderbuffer", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT);
		GLAD_GL_GET_FRAMEBUFFER_ATTACHMENT_PARAMETERIV = downcallHandleVoid(true, "glad_glGetFramebufferAttachmentParameteriv", JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_GENERATE_MIPMAP = downcallHandleVoid(true, "glad_glGenerateMipmap", JAVA_INT);
		GLAD_GL_BLIT_FRAMEBUFFER = downcallHandleVoid(true, "glad_glBlitFramebuffer", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT);
		GLAD_GL_RENDERBUFFER_STORAGE_MULTISAMPLE = downcallHandleVoid(true, "glad_glRenderbufferStorageMultisample", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT);
		GLAD_GL_FRAMEBUFFER_TEXTURE_LAYER = downcallHandleVoid(true, "glad_glFramebufferTextureLayer", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT);
		GLAD_GL_MAP_BUFFER_RANGE = downcallHandle(true, "glad_glMapBufferRange", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_LONG, JAVA_LONG, JAVA_INT);
		GLAD_GL_FLUSH_MAPPED_BUFFER_RANGE = downcallHandleVoid(true, "glad_glFlushMappedBufferRange", JAVA_INT, JAVA_LONG, JAVA_LONG);
		GLAD_GL_BIND_VERTEX_ARRAY = downcallHandleVoid(true, "glad_glBindVertexArray", JAVA_INT);
		GLAD_GL_DELETE_VERTEX_ARRAYS = downcallHandleVoid(true, "glad_glDeleteVertexArrays", JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_GEN_VERTEX_ARRAYS = downcallHandleVoid(true, "glad_glGenVertexArrays", JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_IS_VERTEX_ARRAY = downcallHandle(true, "glad_glIsVertexArray", JAVA_BYTE, JAVA_INT);
		GLAD_GL_DRAW_ARRAYS_INSTANCED = downcallHandleVoid(true, "glad_glDrawArraysInstanced", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT);
		GLAD_GL_DRAW_ELEMENTS_INSTANCED = downcallHandleVoid(true, "glad_glDrawElementsInstanced", JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT);
		GLAD_GL_TEX_BUFFER = downcallHandleVoid(true, "glad_glTexBuffer", JAVA_INT, JAVA_INT, JAVA_INT);
		GLAD_GL_PRIMITIVE_RESTART_INDEX = downcallHandleVoid(true, "glad_glPrimitiveRestartIndex", JAVA_INT);
		GLAD_GL_COPY_BUFFER_SUB_DATA = downcallHandleVoid(true, "glad_glCopyBufferSubData", JAVA_INT, JAVA_INT, JAVA_LONG, JAVA_LONG, JAVA_LONG);
		GLAD_GL_GET_UNIFORM_INDICES = downcallHandleVoid(true, "glad_glGetUniformIndices", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		GLAD_GL_GET_ACTIVE_UNIFORMSIV = downcallHandleVoid(true, "glad_glGetActiveUniformsiv", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_GET_ACTIVE_UNIFORM_NAME = downcallHandleVoid(true, "glad_glGetActiveUniformName", JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		GLAD_GL_GET_UNIFORM_BLOCK_INDEX = downcallHandle(true, "glad_glGetUniformBlockIndex", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_GET_ACTIVE_UNIFORM_BLOCKIV = downcallHandleVoid(true, "glad_glGetActiveUniformBlockiv", JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_GET_ACTIVE_UNIFORM_BLOCK_NAME = downcallHandleVoid(true, "glad_glGetActiveUniformBlockName", JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		GLAD_GL_UNIFORM_BLOCK_BINDING = downcallHandleVoid(true, "glad_glUniformBlockBinding", JAVA_INT, JAVA_INT, JAVA_INT);
		GLAD_GL_DRAW_ELEMENTS_BASE_VERTEX = downcallHandleVoid(true, "glad_glDrawElementsBaseVertex", JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT);
		GLAD_GL_DRAW_RANGE_ELEMENTS_BASE_VERTEX = downcallHandleVoid(true, "glad_glDrawRangeElementsBaseVertex", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT);
		GLAD_GL_DRAW_ELEMENTS_INSTANCED_BASE_VERTEX = downcallHandleVoid(true, "glad_glDrawElementsInstancedBaseVertex", JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
		GLAD_GL_MULTI_DRAW_ELEMENTS_BASE_VERTEX = downcallHandleVoid(true, "glad_glMultiDrawElementsBaseVertex", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_PROVOKING_VERTEX = downcallHandleVoid(true, "glad_glProvokingVertex", JAVA_INT);
		GLAD_GL_FENCE_SYNC = downcallHandle(true, "glad_glFenceSync", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
		GLAD_GL_IS_SYNC = downcallHandle(true, "glad_glIsSync", JAVA_BYTE, UNBOUNDED_ADDRESS);
		GLAD_GL_DELETE_SYNC = downcallHandleVoid(true, "glad_glDeleteSync", UNBOUNDED_ADDRESS);
		GLAD_GL_CLIENT_WAIT_SYNC = downcallHandle(true, "glad_glClientWaitSync", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_LONG);
		GLAD_GL_WAIT_SYNC = downcallHandleVoid(true, "glad_glWaitSync", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_LONG);
		GLAD_GL_GET_INTEGER64V = downcallHandleVoid(true, "glad_glGetInteger64v", JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_GET_SYNCIV = downcallHandleVoid(true, "glad_glGetSynciv", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		GLAD_GL_GET_INTEGER64I_V = downcallHandleVoid(true, "glad_glGetInteger64i_v", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_GET_BUFFER_PARAMETERI64V = downcallHandleVoid(true, "glad_glGetBufferParameteri64v", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_FRAMEBUFFER_TEXTURE = downcallHandleVoid(true, "glad_glFramebufferTexture", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT);
		GLAD_GL_TEX_IMAGE2_DMULTISAMPLE = downcallHandleVoid(true, "glad_glTexImage2DMultisample", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_BYTE);
		GLAD_GL_TEX_IMAGE3_DMULTISAMPLE = downcallHandleVoid(true, "glad_glTexImage3DMultisample", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_BYTE);
		GLAD_GL_GET_MULTISAMPLEFV = downcallHandleVoid(true, "glad_glGetMultisamplefv", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_SAMPLE_MASKI = downcallHandleVoid(true, "glad_glSampleMaski", JAVA_INT, JAVA_INT);
		GLAD_GL_BIND_FRAG_DATA_LOCATION_INDEXED = downcallHandleVoid(true, "glad_glBindFragDataLocationIndexed", JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_GET_FRAG_DATA_INDEX = downcallHandle(true, "glad_glGetFragDataIndex", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_GEN_SAMPLERS = downcallHandleVoid(true, "glad_glGenSamplers", JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_DELETE_SAMPLERS = downcallHandleVoid(true, "glad_glDeleteSamplers", JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_IS_SAMPLER = downcallHandle(true, "glad_glIsSampler", JAVA_BYTE, JAVA_INT);
		GLAD_GL_BIND_SAMPLER = downcallHandleVoid(true, "glad_glBindSampler", JAVA_INT, JAVA_INT);
		GLAD_GL_SAMPLER_PARAMETERI = downcallHandleVoid(true, "glad_glSamplerParameteri", JAVA_INT, JAVA_INT, JAVA_INT);
		GLAD_GL_SAMPLER_PARAMETERIV = downcallHandleVoid(true, "glad_glSamplerParameteriv", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_SAMPLER_PARAMETERF = downcallHandleVoid(true, "glad_glSamplerParameterf", JAVA_INT, JAVA_INT, JAVA_FLOAT);
		GLAD_GL_SAMPLER_PARAMETERFV = downcallHandleVoid(true, "glad_glSamplerParameterfv", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_SAMPLER_PARAMETER_IIV = downcallHandleVoid(true, "glad_glSamplerParameterIiv", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_SAMPLER_PARAMETER_IUIV = downcallHandleVoid(true, "glad_glSamplerParameterIuiv", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_GET_SAMPLER_PARAMETERIV = downcallHandleVoid(true, "glad_glGetSamplerParameteriv", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_GET_SAMPLER_PARAMETER_IIV = downcallHandleVoid(true, "glad_glGetSamplerParameterIiv", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_GET_SAMPLER_PARAMETERFV = downcallHandleVoid(true, "glad_glGetSamplerParameterfv", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_GET_SAMPLER_PARAMETER_IUIV = downcallHandleVoid(true, "glad_glGetSamplerParameterIuiv", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_QUERY_COUNTER = downcallHandleVoid(true, "glad_glQueryCounter", JAVA_INT, JAVA_INT);
		GLAD_GL_GET_QUERY_OBJECTI64V = downcallHandleVoid(true, "glad_glGetQueryObjecti64v", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_GET_QUERY_OBJECTUI64V = downcallHandleVoid(true, "glad_glGetQueryObjectui64v", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_VERTEX_ATTRIB_DIVISOR = downcallHandleVoid(true, "glad_glVertexAttribDivisor", JAVA_INT, JAVA_INT);
		GLAD_GL_VERTEX_ATTRIB_P1UI = downcallHandleVoid(true, "glad_glVertexAttribP1ui", JAVA_INT, JAVA_INT, JAVA_BYTE, JAVA_INT);
		GLAD_GL_VERTEX_ATTRIB_P1UIV = downcallHandleVoid(true, "glad_glVertexAttribP1uiv", JAVA_INT, JAVA_INT, JAVA_BYTE, UNBOUNDED_ADDRESS);
		GLAD_GL_VERTEX_ATTRIB_P2UI = downcallHandleVoid(true, "glad_glVertexAttribP2ui", JAVA_INT, JAVA_INT, JAVA_BYTE, JAVA_INT);
		GLAD_GL_VERTEX_ATTRIB_P2UIV = downcallHandleVoid(true, "glad_glVertexAttribP2uiv", JAVA_INT, JAVA_INT, JAVA_BYTE, UNBOUNDED_ADDRESS);
		GLAD_GL_VERTEX_ATTRIB_P3UI = downcallHandleVoid(true, "glad_glVertexAttribP3ui", JAVA_INT, JAVA_INT, JAVA_BYTE, JAVA_INT);
		GLAD_GL_VERTEX_ATTRIB_P3UIV = downcallHandleVoid(true, "glad_glVertexAttribP3uiv", JAVA_INT, JAVA_INT, JAVA_BYTE, UNBOUNDED_ADDRESS);
		GLAD_GL_VERTEX_ATTRIB_P4UI = downcallHandleVoid(true, "glad_glVertexAttribP4ui", JAVA_INT, JAVA_INT, JAVA_BYTE, JAVA_INT);
		GLAD_GL_VERTEX_ATTRIB_P4UIV = downcallHandleVoid(true, "glad_glVertexAttribP4uiv", JAVA_INT, JAVA_INT, JAVA_BYTE, UNBOUNDED_ADDRESS);
		GLAD_GL_VERTEX_P2UI = downcallHandleVoid(true, "glad_glVertexP2ui", JAVA_INT, JAVA_INT);
		GLAD_GL_VERTEX_P2UIV = downcallHandleVoid(true, "glad_glVertexP2uiv", JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_VERTEX_P3UI = downcallHandleVoid(true, "glad_glVertexP3ui", JAVA_INT, JAVA_INT);
		GLAD_GL_VERTEX_P3UIV = downcallHandleVoid(true, "glad_glVertexP3uiv", JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_VERTEX_P4UI = downcallHandleVoid(true, "glad_glVertexP4ui", JAVA_INT, JAVA_INT);
		GLAD_GL_VERTEX_P4UIV = downcallHandleVoid(true, "glad_glVertexP4uiv", JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_TEX_COORD_P1UI = downcallHandleVoid(true, "glad_glTexCoordP1ui", JAVA_INT, JAVA_INT);
		GLAD_GL_TEX_COORD_P1UIV = downcallHandleVoid(true, "glad_glTexCoordP1uiv", JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_TEX_COORD_P2UI = downcallHandleVoid(true, "glad_glTexCoordP2ui", JAVA_INT, JAVA_INT);
		GLAD_GL_TEX_COORD_P2UIV = downcallHandleVoid(true, "glad_glTexCoordP2uiv", JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_TEX_COORD_P3UI = downcallHandleVoid(true, "glad_glTexCoordP3ui", JAVA_INT, JAVA_INT);
		GLAD_GL_TEX_COORD_P3UIV = downcallHandleVoid(true, "glad_glTexCoordP3uiv", JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_TEX_COORD_P4UI = downcallHandleVoid(true, "glad_glTexCoordP4ui", JAVA_INT, JAVA_INT);
		GLAD_GL_TEX_COORD_P4UIV = downcallHandleVoid(true, "glad_glTexCoordP4uiv", JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_MULTI_TEX_COORD_P1UI = downcallHandleVoid(true, "glad_glMultiTexCoordP1ui", JAVA_INT, JAVA_INT, JAVA_INT);
		GLAD_GL_MULTI_TEX_COORD_P1UIV = downcallHandleVoid(true, "glad_glMultiTexCoordP1uiv", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_MULTI_TEX_COORD_P2UI = downcallHandleVoid(true, "glad_glMultiTexCoordP2ui", JAVA_INT, JAVA_INT, JAVA_INT);
		GLAD_GL_MULTI_TEX_COORD_P2UIV = downcallHandleVoid(true, "glad_glMultiTexCoordP2uiv", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_MULTI_TEX_COORD_P3UI = downcallHandleVoid(true, "glad_glMultiTexCoordP3ui", JAVA_INT, JAVA_INT, JAVA_INT);
		GLAD_GL_MULTI_TEX_COORD_P3UIV = downcallHandleVoid(true, "glad_glMultiTexCoordP3uiv", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_MULTI_TEX_COORD_P4UI = downcallHandleVoid(true, "glad_glMultiTexCoordP4ui", JAVA_INT, JAVA_INT, JAVA_INT);
		GLAD_GL_MULTI_TEX_COORD_P4UIV = downcallHandleVoid(true, "glad_glMultiTexCoordP4uiv", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_NORMAL_P3UI = downcallHandleVoid(true, "glad_glNormalP3ui", JAVA_INT, JAVA_INT);
		GLAD_GL_NORMAL_P3UIV = downcallHandleVoid(true, "glad_glNormalP3uiv", JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_COLOR_P3UI = downcallHandleVoid(true, "glad_glColorP3ui", JAVA_INT, JAVA_INT);
		GLAD_GL_COLOR_P3UIV = downcallHandleVoid(true, "glad_glColorP3uiv", JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_COLOR_P4UI = downcallHandleVoid(true, "glad_glColorP4ui", JAVA_INT, JAVA_INT);
		GLAD_GL_COLOR_P4UIV = downcallHandleVoid(true, "glad_glColorP4uiv", JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_SECONDARY_COLOR_P3UI = downcallHandleVoid(true, "glad_glSecondaryColorP3ui", JAVA_INT, JAVA_INT);
		GLAD_GL_SECONDARY_COLOR_P3UIV = downcallHandleVoid(true, "glad_glSecondaryColorP3uiv", JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_MIN_SAMPLE_SHADING = downcallHandleVoid(true, "glad_glMinSampleShading", JAVA_FLOAT);
		GLAD_GL_BLEND_EQUATIONI = downcallHandleVoid(true, "glad_glBlendEquationi", JAVA_INT, JAVA_INT);
		GLAD_GL_BLEND_EQUATION_SEPARATEI = downcallHandleVoid(true, "glad_glBlendEquationSeparatei", JAVA_INT, JAVA_INT, JAVA_INT);
		GLAD_GL_BLEND_FUNCI = downcallHandleVoid(true, "glad_glBlendFunci", JAVA_INT, JAVA_INT, JAVA_INT);
		GLAD_GL_BLEND_FUNC_SEPARATEI = downcallHandleVoid(true, "glad_glBlendFuncSeparatei", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT);
		GLAD_GL_DRAW_ARRAYS_INDIRECT = downcallHandleVoid(true, "glad_glDrawArraysIndirect", JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_DRAW_ELEMENTS_INDIRECT = downcallHandleVoid(true, "glad_glDrawElementsIndirect", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_UNIFORM1D = downcallHandleVoid(true, "glad_glUniform1d", JAVA_INT, JAVA_DOUBLE);
		GLAD_GL_UNIFORM2D = downcallHandleVoid(true, "glad_glUniform2d", JAVA_INT, JAVA_DOUBLE, JAVA_DOUBLE);
		GLAD_GL_UNIFORM3D = downcallHandleVoid(true, "glad_glUniform3d", JAVA_INT, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE);
		GLAD_GL_UNIFORM4D = downcallHandleVoid(true, "glad_glUniform4d", JAVA_INT, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE);
		GLAD_GL_UNIFORM1DV = downcallHandleVoid(true, "glad_glUniform1dv", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_UNIFORM2DV = downcallHandleVoid(true, "glad_glUniform2dv", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_UNIFORM3DV = downcallHandleVoid(true, "glad_glUniform3dv", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_UNIFORM4DV = downcallHandleVoid(true, "glad_glUniform4dv", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_UNIFORM_MATRIX2DV = downcallHandleVoid(true, "glad_glUniformMatrix2dv", JAVA_INT, JAVA_INT, JAVA_BYTE, UNBOUNDED_ADDRESS);
		GLAD_GL_UNIFORM_MATRIX3DV = downcallHandleVoid(true, "glad_glUniformMatrix3dv", JAVA_INT, JAVA_INT, JAVA_BYTE, UNBOUNDED_ADDRESS);
		GLAD_GL_UNIFORM_MATRIX4DV = downcallHandleVoid(true, "glad_glUniformMatrix4dv", JAVA_INT, JAVA_INT, JAVA_BYTE, UNBOUNDED_ADDRESS);
		GLAD_GL_UNIFORM_MATRIX2X3DV = downcallHandleVoid(true, "glad_glUniformMatrix2x3dv", JAVA_INT, JAVA_INT, JAVA_BYTE, UNBOUNDED_ADDRESS);
		GLAD_GL_UNIFORM_MATRIX2X4DV = downcallHandleVoid(true, "glad_glUniformMatrix2x4dv", JAVA_INT, JAVA_INT, JAVA_BYTE, UNBOUNDED_ADDRESS);
		GLAD_GL_UNIFORM_MATRIX3X2DV = downcallHandleVoid(true, "glad_glUniformMatrix3x2dv", JAVA_INT, JAVA_INT, JAVA_BYTE, UNBOUNDED_ADDRESS);
		GLAD_GL_UNIFORM_MATRIX3X4DV = downcallHandleVoid(true, "glad_glUniformMatrix3x4dv", JAVA_INT, JAVA_INT, JAVA_BYTE, UNBOUNDED_ADDRESS);
		GLAD_GL_UNIFORM_MATRIX4X2DV = downcallHandleVoid(true, "glad_glUniformMatrix4x2dv", JAVA_INT, JAVA_INT, JAVA_BYTE, UNBOUNDED_ADDRESS);
		GLAD_GL_UNIFORM_MATRIX4X3DV = downcallHandleVoid(true, "glad_glUniformMatrix4x3dv", JAVA_INT, JAVA_INT, JAVA_BYTE, UNBOUNDED_ADDRESS);
		GLAD_GL_GET_UNIFORMDV = downcallHandleVoid(true, "glad_glGetUniformdv", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_GET_SUBROUTINE_UNIFORM_LOCATION = downcallHandle(true, "glad_glGetSubroutineUniformLocation", JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_GET_SUBROUTINE_INDEX = downcallHandle(true, "glad_glGetSubroutineIndex", JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_GET_ACTIVE_SUBROUTINE_UNIFORMIV = downcallHandleVoid(true, "glad_glGetActiveSubroutineUniformiv", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_GET_ACTIVE_SUBROUTINE_UNIFORM_NAME = downcallHandleVoid(true, "glad_glGetActiveSubroutineUniformName", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		GLAD_GL_GET_ACTIVE_SUBROUTINE_NAME = downcallHandleVoid(true, "glad_glGetActiveSubroutineName", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		GLAD_GL_UNIFORM_SUBROUTINESUIV = downcallHandleVoid(true, "glad_glUniformSubroutinesuiv", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_GET_UNIFORM_SUBROUTINEUIV = downcallHandleVoid(true, "glad_glGetUniformSubroutineuiv", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_GET_PROGRAM_STAGEIV = downcallHandleVoid(true, "glad_glGetProgramStageiv", JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_PATCH_PARAMETERI = downcallHandleVoid(true, "glad_glPatchParameteri", JAVA_INT, JAVA_INT);
		GLAD_GL_PATCH_PARAMETERFV = downcallHandleVoid(true, "glad_glPatchParameterfv", JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_BIND_TRANSFORM_FEEDBACK = downcallHandleVoid(true, "glad_glBindTransformFeedback", JAVA_INT, JAVA_INT);
		GLAD_GL_DELETE_TRANSFORM_FEEDBACKS = downcallHandleVoid(true, "glad_glDeleteTransformFeedbacks", JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_GEN_TRANSFORM_FEEDBACKS = downcallHandleVoid(true, "glad_glGenTransformFeedbacks", JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_IS_TRANSFORM_FEEDBACK = downcallHandle(true, "glad_glIsTransformFeedback", JAVA_BYTE, JAVA_INT);
		GLAD_GL_PAUSE_TRANSFORM_FEEDBACK = downcallHandleVoid(true, "glad_glPauseTransformFeedback");
		GLAD_GL_RESUME_TRANSFORM_FEEDBACK = downcallHandleVoid(true, "glad_glResumeTransformFeedback");
		GLAD_GL_DRAW_TRANSFORM_FEEDBACK = downcallHandleVoid(true, "glad_glDrawTransformFeedback", JAVA_INT, JAVA_INT);
		GLAD_GL_DRAW_TRANSFORM_FEEDBACK_STREAM = downcallHandleVoid(true, "glad_glDrawTransformFeedbackStream", JAVA_INT, JAVA_INT, JAVA_INT);
		GLAD_GL_BEGIN_QUERY_INDEXED = downcallHandleVoid(true, "glad_glBeginQueryIndexed", JAVA_INT, JAVA_INT, JAVA_INT);
		GLAD_GL_END_QUERY_INDEXED = downcallHandleVoid(true, "glad_glEndQueryIndexed", JAVA_INT, JAVA_INT);
		GLAD_GL_GET_QUERY_INDEXEDIV = downcallHandleVoid(true, "glad_glGetQueryIndexediv", JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_RELEASE_SHADER_COMPILER = downcallHandleVoid(true, "glad_glReleaseShaderCompiler");
		GLAD_GL_SHADER_BINARY = downcallHandleVoid(true, "glad_glShaderBinary", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT);
		GLAD_GL_GET_SHADER_PRECISION_FORMAT = downcallHandleVoid(true, "glad_glGetShaderPrecisionFormat", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		GLAD_GL_DEPTH_RANGEF = downcallHandleVoid(true, "glad_glDepthRangef", JAVA_FLOAT, JAVA_FLOAT);
		GLAD_GL_CLEAR_DEPTHF = downcallHandleVoid(true, "glad_glClearDepthf", JAVA_FLOAT);
		GLAD_GL_GET_PROGRAM_BINARY = downcallHandleVoid(true, "glad_glGetProgramBinary", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		GLAD_GL_PROGRAM_BINARY = downcallHandleVoid(true, "glad_glProgramBinary", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT);
		GLAD_GL_PROGRAM_PARAMETERI = downcallHandleVoid(true, "glad_glProgramParameteri", JAVA_INT, JAVA_INT, JAVA_INT);
		GLAD_GL_USE_PROGRAM_STAGES = downcallHandleVoid(true, "glad_glUseProgramStages", JAVA_INT, JAVA_INT, JAVA_INT);
		GLAD_GL_ACTIVE_SHADER_PROGRAM = downcallHandleVoid(true, "glad_glActiveShaderProgram", JAVA_INT, JAVA_INT);
		GLAD_GL_CREATE_SHADER_PROGRAMV = downcallHandle(true, "glad_glCreateShaderProgramv", JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_BIND_PROGRAM_PIPELINE = downcallHandleVoid(true, "glad_glBindProgramPipeline", JAVA_INT);
		GLAD_GL_DELETE_PROGRAM_PIPELINES = downcallHandleVoid(true, "glad_glDeleteProgramPipelines", JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_GEN_PROGRAM_PIPELINES = downcallHandleVoid(true, "glad_glGenProgramPipelines", JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_IS_PROGRAM_PIPELINE = downcallHandle(true, "glad_glIsProgramPipeline", JAVA_BYTE, JAVA_INT);
		GLAD_GL_GET_PROGRAM_PIPELINEIV = downcallHandleVoid(true, "glad_glGetProgramPipelineiv", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_PROGRAM_UNIFORM1I = downcallHandleVoid(true, "glad_glProgramUniform1i", JAVA_INT, JAVA_INT, JAVA_INT);
		GLAD_GL_PROGRAM_UNIFORM1IV = downcallHandleVoid(true, "glad_glProgramUniform1iv", JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_PROGRAM_UNIFORM1F = downcallHandleVoid(true, "glad_glProgramUniform1f", JAVA_INT, JAVA_INT, JAVA_FLOAT);
		GLAD_GL_PROGRAM_UNIFORM1FV = downcallHandleVoid(true, "glad_glProgramUniform1fv", JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_PROGRAM_UNIFORM1D = downcallHandleVoid(true, "glad_glProgramUniform1d", JAVA_INT, JAVA_INT, JAVA_DOUBLE);
		GLAD_GL_PROGRAM_UNIFORM1DV = downcallHandleVoid(true, "glad_glProgramUniform1dv", JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_PROGRAM_UNIFORM1UI = downcallHandleVoid(true, "glad_glProgramUniform1ui", JAVA_INT, JAVA_INT, JAVA_INT);
		GLAD_GL_PROGRAM_UNIFORM1UIV = downcallHandleVoid(true, "glad_glProgramUniform1uiv", JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_PROGRAM_UNIFORM2I = downcallHandleVoid(true, "glad_glProgramUniform2i", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT);
		GLAD_GL_PROGRAM_UNIFORM2IV = downcallHandleVoid(true, "glad_glProgramUniform2iv", JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_PROGRAM_UNIFORM2F = downcallHandleVoid(true, "glad_glProgramUniform2f", JAVA_INT, JAVA_INT, JAVA_FLOAT, JAVA_FLOAT);
		GLAD_GL_PROGRAM_UNIFORM2FV = downcallHandleVoid(true, "glad_glProgramUniform2fv", JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_PROGRAM_UNIFORM2D = downcallHandleVoid(true, "glad_glProgramUniform2d", JAVA_INT, JAVA_INT, JAVA_DOUBLE, JAVA_DOUBLE);
		GLAD_GL_PROGRAM_UNIFORM2DV = downcallHandleVoid(true, "glad_glProgramUniform2dv", JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_PROGRAM_UNIFORM2UI = downcallHandleVoid(true, "glad_glProgramUniform2ui", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT);
		GLAD_GL_PROGRAM_UNIFORM2UIV = downcallHandleVoid(true, "glad_glProgramUniform2uiv", JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_PROGRAM_UNIFORM3I = downcallHandleVoid(true, "glad_glProgramUniform3i", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT);
		GLAD_GL_PROGRAM_UNIFORM3IV = downcallHandleVoid(true, "glad_glProgramUniform3iv", JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_PROGRAM_UNIFORM3F = downcallHandleVoid(true, "glad_glProgramUniform3f", JAVA_INT, JAVA_INT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT);
		GLAD_GL_PROGRAM_UNIFORM3FV = downcallHandleVoid(true, "glad_glProgramUniform3fv", JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_PROGRAM_UNIFORM3D = downcallHandleVoid(true, "glad_glProgramUniform3d", JAVA_INT, JAVA_INT, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE);
		GLAD_GL_PROGRAM_UNIFORM3DV = downcallHandleVoid(true, "glad_glProgramUniform3dv", JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_PROGRAM_UNIFORM3UI = downcallHandleVoid(true, "glad_glProgramUniform3ui", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT);
		GLAD_GL_PROGRAM_UNIFORM3UIV = downcallHandleVoid(true, "glad_glProgramUniform3uiv", JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_PROGRAM_UNIFORM4I = downcallHandleVoid(true, "glad_glProgramUniform4i", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT);
		GLAD_GL_PROGRAM_UNIFORM4IV = downcallHandleVoid(true, "glad_glProgramUniform4iv", JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_PROGRAM_UNIFORM4F = downcallHandleVoid(true, "glad_glProgramUniform4f", JAVA_INT, JAVA_INT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT);
		GLAD_GL_PROGRAM_UNIFORM4FV = downcallHandleVoid(true, "glad_glProgramUniform4fv", JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_PROGRAM_UNIFORM4D = downcallHandleVoid(true, "glad_glProgramUniform4d", JAVA_INT, JAVA_INT, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE);
		GLAD_GL_PROGRAM_UNIFORM4DV = downcallHandleVoid(true, "glad_glProgramUniform4dv", JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_PROGRAM_UNIFORM4UI = downcallHandleVoid(true, "glad_glProgramUniform4ui", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT);
		GLAD_GL_PROGRAM_UNIFORM4UIV = downcallHandleVoid(true, "glad_glProgramUniform4uiv", JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_PROGRAM_UNIFORM_MATRIX2FV = downcallHandleVoid(true, "glad_glProgramUniformMatrix2fv", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_BYTE, UNBOUNDED_ADDRESS);
		GLAD_GL_PROGRAM_UNIFORM_MATRIX3FV = downcallHandleVoid(true, "glad_glProgramUniformMatrix3fv", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_BYTE, UNBOUNDED_ADDRESS);
		GLAD_GL_PROGRAM_UNIFORM_MATRIX4FV = downcallHandleVoid(true, "glad_glProgramUniformMatrix4fv", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_BYTE, UNBOUNDED_ADDRESS);
		GLAD_GL_PROGRAM_UNIFORM_MATRIX2DV = downcallHandleVoid(true, "glad_glProgramUniformMatrix2dv", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_BYTE, UNBOUNDED_ADDRESS);
		GLAD_GL_PROGRAM_UNIFORM_MATRIX3DV = downcallHandleVoid(true, "glad_glProgramUniformMatrix3dv", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_BYTE, UNBOUNDED_ADDRESS);
		GLAD_GL_PROGRAM_UNIFORM_MATRIX4DV = downcallHandleVoid(true, "glad_glProgramUniformMatrix4dv", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_BYTE, UNBOUNDED_ADDRESS);
		GLAD_GL_PROGRAM_UNIFORM_MATRIX2X3FV = downcallHandleVoid(true, "glad_glProgramUniformMatrix2x3fv", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_BYTE, UNBOUNDED_ADDRESS);
		GLAD_GL_PROGRAM_UNIFORM_MATRIX3X2FV = downcallHandleVoid(true, "glad_glProgramUniformMatrix3x2fv", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_BYTE, UNBOUNDED_ADDRESS);
		GLAD_GL_PROGRAM_UNIFORM_MATRIX2X4FV = downcallHandleVoid(true, "glad_glProgramUniformMatrix2x4fv", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_BYTE, UNBOUNDED_ADDRESS);
		GLAD_GL_PROGRAM_UNIFORM_MATRIX4X2FV = downcallHandleVoid(true, "glad_glProgramUniformMatrix4x2fv", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_BYTE, UNBOUNDED_ADDRESS);
		GLAD_GL_PROGRAM_UNIFORM_MATRIX3X4FV = downcallHandleVoid(true, "glad_glProgramUniformMatrix3x4fv", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_BYTE, UNBOUNDED_ADDRESS);
		GLAD_GL_PROGRAM_UNIFORM_MATRIX4X3FV = downcallHandleVoid(true, "glad_glProgramUniformMatrix4x3fv", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_BYTE, UNBOUNDED_ADDRESS);
		GLAD_GL_PROGRAM_UNIFORM_MATRIX2X3DV = downcallHandleVoid(true, "glad_glProgramUniformMatrix2x3dv", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_BYTE, UNBOUNDED_ADDRESS);
		GLAD_GL_PROGRAM_UNIFORM_MATRIX3X2DV = downcallHandleVoid(true, "glad_glProgramUniformMatrix3x2dv", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_BYTE, UNBOUNDED_ADDRESS);
		GLAD_GL_PROGRAM_UNIFORM_MATRIX2X4DV = downcallHandleVoid(true, "glad_glProgramUniformMatrix2x4dv", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_BYTE, UNBOUNDED_ADDRESS);
		GLAD_GL_PROGRAM_UNIFORM_MATRIX4X2DV = downcallHandleVoid(true, "glad_glProgramUniformMatrix4x2dv", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_BYTE, UNBOUNDED_ADDRESS);
		GLAD_GL_PROGRAM_UNIFORM_MATRIX3X4DV = downcallHandleVoid(true, "glad_glProgramUniformMatrix3x4dv", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_BYTE, UNBOUNDED_ADDRESS);
		GLAD_GL_PROGRAM_UNIFORM_MATRIX4X3DV = downcallHandleVoid(true, "glad_glProgramUniformMatrix4x3dv", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_BYTE, UNBOUNDED_ADDRESS);
		GLAD_GL_VALIDATE_PROGRAM_PIPELINE = downcallHandleVoid(true, "glad_glValidateProgramPipeline", JAVA_INT);
		GLAD_GL_GET_PROGRAM_PIPELINE_INFO_LOG = downcallHandleVoid(true, "glad_glGetProgramPipelineInfoLog", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		GLAD_GL_VERTEX_ATTRIB_L1D = downcallHandleVoid(true, "glad_glVertexAttribL1d", JAVA_INT, JAVA_DOUBLE);
		GLAD_GL_VERTEX_ATTRIB_L2D = downcallHandleVoid(true, "glad_glVertexAttribL2d", JAVA_INT, JAVA_DOUBLE, JAVA_DOUBLE);
		GLAD_GL_VERTEX_ATTRIB_L3D = downcallHandleVoid(true, "glad_glVertexAttribL3d", JAVA_INT, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE);
		GLAD_GL_VERTEX_ATTRIB_L4D = downcallHandleVoid(true, "glad_glVertexAttribL4d", JAVA_INT, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_DOUBLE);
		GLAD_GL_VERTEX_ATTRIB_L1DV = downcallHandleVoid(true, "glad_glVertexAttribL1dv", JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_VERTEX_ATTRIB_L2DV = downcallHandleVoid(true, "glad_glVertexAttribL2dv", JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_VERTEX_ATTRIB_L3DV = downcallHandleVoid(true, "glad_glVertexAttribL3dv", JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_VERTEX_ATTRIB_L4DV = downcallHandleVoid(true, "glad_glVertexAttribL4dv", JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_VERTEX_ATTRIB_LPOINTER = downcallHandleVoid(true, "glad_glVertexAttribLPointer", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_GET_VERTEX_ATTRIB_LDV = downcallHandleVoid(true, "glad_glGetVertexAttribLdv", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_VIEWPORT_ARRAYV = downcallHandleVoid(true, "glad_glViewportArrayv", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_VIEWPORT_INDEXEDF = downcallHandleVoid(true, "glad_glViewportIndexedf", JAVA_INT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT);
		GLAD_GL_VIEWPORT_INDEXEDFV = downcallHandleVoid(true, "glad_glViewportIndexedfv", JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_SCISSOR_ARRAYV = downcallHandleVoid(true, "glad_glScissorArrayv", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_SCISSOR_INDEXED = downcallHandleVoid(true, "glad_glScissorIndexed", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT);
		GLAD_GL_SCISSOR_INDEXEDV = downcallHandleVoid(true, "glad_glScissorIndexedv", JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_DEPTH_RANGE_ARRAYV = downcallHandleVoid(true, "glad_glDepthRangeArrayv", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_DEPTH_RANGE_INDEXED = downcallHandleVoid(true, "glad_glDepthRangeIndexed", JAVA_INT, JAVA_DOUBLE, JAVA_DOUBLE);
		GLAD_GL_GET_FLOATI_V = downcallHandleVoid(true, "glad_glGetFloati_v", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_GET_DOUBLEI_V = downcallHandleVoid(true, "glad_glGetDoublei_v", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_DRAW_ARRAYS_INSTANCED_BASE_INSTANCE = downcallHandleVoid(true, "glad_glDrawArraysInstancedBaseInstance", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT);
		GLAD_GL_DRAW_ELEMENTS_INSTANCED_BASE_INSTANCE = downcallHandleVoid(true, "glad_glDrawElementsInstancedBaseInstance", JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
		GLAD_GL_DRAW_ELEMENTS_INSTANCED_BASE_VERTEX_BASE_INSTANCE = downcallHandleVoid(true, "glad_glDrawElementsInstancedBaseVertexBaseInstance", JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, JAVA_INT);
		GLAD_GL_GET_INTERNALFORMATIV = downcallHandleVoid(true, "glad_glGetInternalformativ", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_GET_ACTIVE_ATOMIC_COUNTER_BUFFERIV = downcallHandleVoid(true, "glad_glGetActiveAtomicCounterBufferiv", JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_BIND_IMAGE_TEXTURE = downcallHandleVoid(true, "glad_glBindImageTexture", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_BYTE, JAVA_INT, JAVA_INT, JAVA_INT);
		GLAD_GL_MEMORY_BARRIER = downcallHandleVoid(true, "glad_glMemoryBarrier", JAVA_INT);
		GLAD_GL_TEX_STORAGE1_D = downcallHandleVoid(true, "glad_glTexStorage1D", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT);
		GLAD_GL_TEX_STORAGE2_D = downcallHandleVoid(true, "glad_glTexStorage2D", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT);
		GLAD_GL_TEX_STORAGE3_D = downcallHandleVoid(true, "glad_glTexStorage3D", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT);
		GLAD_GL_DRAW_TRANSFORM_FEEDBACK_INSTANCED = downcallHandleVoid(true, "glad_glDrawTransformFeedbackInstanced", JAVA_INT, JAVA_INT, JAVA_INT);
		GLAD_GL_DRAW_TRANSFORM_FEEDBACK_STREAM_INSTANCED = downcallHandleVoid(true, "glad_glDrawTransformFeedbackStreamInstanced", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT);
		GLAD_GL_CLEAR_BUFFER_DATA = downcallHandleVoid(true, "glad_glClearBufferData", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_CLEAR_BUFFER_SUB_DATA = downcallHandleVoid(true, "glad_glClearBufferSubData", JAVA_INT, JAVA_INT, JAVA_LONG, JAVA_LONG, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_DISPATCH_COMPUTE = downcallHandleVoid(true, "glad_glDispatchCompute", JAVA_INT, JAVA_INT, JAVA_INT);
		GLAD_GL_DISPATCH_COMPUTE_INDIRECT = downcallHandleVoid(true, "glad_glDispatchComputeIndirect", JAVA_LONG);
		GLAD_GL_COPY_IMAGE_SUB_DATA = downcallHandleVoid(true, "glad_glCopyImageSubData", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT);
		GLAD_GL_FRAMEBUFFER_PARAMETERI = downcallHandleVoid(true, "glad_glFramebufferParameteri", JAVA_INT, JAVA_INT, JAVA_INT);
		GLAD_GL_GET_FRAMEBUFFER_PARAMETERIV = downcallHandleVoid(true, "glad_glGetFramebufferParameteriv", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_GET_INTERNALFORMATI64V = downcallHandleVoid(true, "glad_glGetInternalformati64v", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_INVALIDATE_TEX_SUB_IMAGE = downcallHandleVoid(true, "glad_glInvalidateTexSubImage", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT);
		GLAD_GL_INVALIDATE_TEX_IMAGE = downcallHandleVoid(true, "glad_glInvalidateTexImage", JAVA_INT, JAVA_INT);
		GLAD_GL_INVALIDATE_BUFFER_SUB_DATA = downcallHandleVoid(true, "glad_glInvalidateBufferSubData", JAVA_INT, JAVA_LONG, JAVA_LONG);
		GLAD_GL_INVALIDATE_BUFFER_DATA = downcallHandleVoid(true, "glad_glInvalidateBufferData", JAVA_INT);
		GLAD_GL_INVALIDATE_FRAMEBUFFER = downcallHandleVoid(true, "glad_glInvalidateFramebuffer", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_INVALIDATE_SUB_FRAMEBUFFER = downcallHandleVoid(true, "glad_glInvalidateSubFramebuffer", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT);
		GLAD_GL_MULTI_DRAW_ARRAYS_INDIRECT = downcallHandleVoid(true, "glad_glMultiDrawArraysIndirect", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
		GLAD_GL_MULTI_DRAW_ELEMENTS_INDIRECT = downcallHandleVoid(true, "glad_glMultiDrawElementsIndirect", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
		GLAD_GL_GET_PROGRAM_INTERFACEIV = downcallHandleVoid(true, "glad_glGetProgramInterfaceiv", JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_GET_PROGRAM_RESOURCE_INDEX = downcallHandle(true, "glad_glGetProgramResourceIndex", JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_GET_PROGRAM_RESOURCE_NAME = downcallHandleVoid(true, "glad_glGetProgramResourceName", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		GLAD_GL_GET_PROGRAM_RESOURCEIV = downcallHandleVoid(true, "glad_glGetProgramResourceiv", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		GLAD_GL_GET_PROGRAM_RESOURCE_LOCATION = downcallHandle(true, "glad_glGetProgramResourceLocation", JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_GET_PROGRAM_RESOURCE_LOCATION_INDEX = downcallHandle(true, "glad_glGetProgramResourceLocationIndex", JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_SHADER_STORAGE_BLOCK_BINDING = downcallHandleVoid(true, "glad_glShaderStorageBlockBinding", JAVA_INT, JAVA_INT, JAVA_INT);
		GLAD_GL_TEX_BUFFER_RANGE = downcallHandleVoid(true, "glad_glTexBufferRange", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_LONG, JAVA_LONG);
		GLAD_GL_TEX_STORAGE2_DMULTISAMPLE = downcallHandleVoid(true, "glad_glTexStorage2DMultisample", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_BYTE);
		GLAD_GL_TEX_STORAGE3_DMULTISAMPLE = downcallHandleVoid(true, "glad_glTexStorage3DMultisample", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_BYTE);
		GLAD_GL_TEXTURE_VIEW = downcallHandleVoid(true, "glad_glTextureView", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT);
		GLAD_GL_BIND_VERTEX_BUFFER = downcallHandleVoid(true, "glad_glBindVertexBuffer", JAVA_INT, JAVA_INT, JAVA_LONG, JAVA_INT);
		GLAD_GL_VERTEX_ATTRIB_FORMAT = downcallHandleVoid(true, "glad_glVertexAttribFormat", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_BYTE, JAVA_INT);
		GLAD_GL_VERTEX_ATTRIB_IFORMAT = downcallHandleVoid(true, "glad_glVertexAttribIFormat", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT);
		GLAD_GL_VERTEX_ATTRIB_LFORMAT = downcallHandleVoid(true, "glad_glVertexAttribLFormat", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT);
		GLAD_GL_VERTEX_ATTRIB_BINDING = downcallHandleVoid(true, "glad_glVertexAttribBinding", JAVA_INT, JAVA_INT);
		GLAD_GL_VERTEX_BINDING_DIVISOR = downcallHandleVoid(true, "glad_glVertexBindingDivisor", JAVA_INT, JAVA_INT);
		GLAD_GL_DEBUG_MESSAGE_CONTROL = downcallHandleVoid(true, "glad_glDebugMessageControl", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_BYTE);
		GLAD_GL_DEBUG_MESSAGE_INSERT = downcallHandleVoid(true, "glad_glDebugMessageInsert", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_DEBUG_MESSAGE_CALLBACK = downcallHandleVoid(true, "glad_glDebugMessageCallback", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		GLAD_GL_GET_DEBUG_MESSAGE_LOG = downcallHandle(true, "glad_glGetDebugMessageLog", JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		GLAD_GL_PUSH_DEBUG_GROUP = downcallHandleVoid(true, "glad_glPushDebugGroup", JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_POP_DEBUG_GROUP = downcallHandleVoid(true, "glad_glPopDebugGroup");
		GLAD_GL_OBJECT_LABEL = downcallHandleVoid(true, "glad_glObjectLabel", JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_GET_OBJECT_LABEL = downcallHandleVoid(true, "glad_glGetObjectLabel", JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		GLAD_GL_OBJECT_PTR_LABEL = downcallHandleVoid(true, "glad_glObjectPtrLabel", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_GET_OBJECT_PTR_LABEL = downcallHandleVoid(true, "glad_glGetObjectPtrLabel", UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		GLAD_GL_GET_POINTERV = downcallHandleVoid(true, "glad_glGetPointerv", JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_BUFFER_STORAGE = downcallHandleVoid(true, "glad_glBufferStorage", JAVA_INT, JAVA_LONG, UNBOUNDED_ADDRESS, JAVA_INT);
		GLAD_GL_CLEAR_TEX_IMAGE = downcallHandleVoid(true, "glad_glClearTexImage", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_CLEAR_TEX_SUB_IMAGE = downcallHandleVoid(true, "glad_glClearTexSubImage", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_BIND_BUFFERS_BASE = downcallHandleVoid(true, "glad_glBindBuffersBase", JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_BIND_BUFFERS_RANGE = downcallHandleVoid(true, "glad_glBindBuffersRange", JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		GLAD_GL_BIND_TEXTURES = downcallHandleVoid(true, "glad_glBindTextures", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_BIND_SAMPLERS = downcallHandleVoid(true, "glad_glBindSamplers", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_BIND_IMAGE_TEXTURES = downcallHandleVoid(true, "glad_glBindImageTextures", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_BIND_VERTEX_BUFFERS = downcallHandleVoid(true, "glad_glBindVertexBuffers", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		GLAD_GL_CLIP_CONTROL = downcallHandleVoid(true, "glad_glClipControl", JAVA_INT, JAVA_INT);
		GLAD_GL_CREATE_TRANSFORM_FEEDBACKS = downcallHandleVoid(true, "glad_glCreateTransformFeedbacks", JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_TRANSFORM_FEEDBACK_BUFFER_BASE = downcallHandleVoid(true, "glad_glTransformFeedbackBufferBase", JAVA_INT, JAVA_INT, JAVA_INT);
		GLAD_GL_TRANSFORM_FEEDBACK_BUFFER_RANGE = downcallHandleVoid(true, "glad_glTransformFeedbackBufferRange", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_LONG, JAVA_LONG);
		GLAD_GL_GET_TRANSFORM_FEEDBACKIV = downcallHandleVoid(true, "glad_glGetTransformFeedbackiv", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_GET_TRANSFORM_FEEDBACKI_V = downcallHandleVoid(true, "glad_glGetTransformFeedbacki_v", JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_GET_TRANSFORM_FEEDBACKI64_V = downcallHandleVoid(true, "glad_glGetTransformFeedbacki64_v", JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_CREATE_BUFFERS = downcallHandleVoid(true, "glad_glCreateBuffers", JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_NAMED_BUFFER_STORAGE = downcallHandleVoid(true, "glad_glNamedBufferStorage", JAVA_INT, JAVA_LONG, UNBOUNDED_ADDRESS, JAVA_INT);
		GLAD_GL_NAMED_BUFFER_DATA = downcallHandleVoid(true, "glad_glNamedBufferData", JAVA_INT, JAVA_LONG, UNBOUNDED_ADDRESS, JAVA_INT);
		GLAD_GL_NAMED_BUFFER_SUB_DATA = downcallHandleVoid(true, "glad_glNamedBufferSubData", JAVA_INT, JAVA_LONG, JAVA_LONG, UNBOUNDED_ADDRESS);
		GLAD_GL_COPY_NAMED_BUFFER_SUB_DATA = downcallHandleVoid(true, "glad_glCopyNamedBufferSubData", JAVA_INT, JAVA_INT, JAVA_LONG, JAVA_LONG, JAVA_LONG);
		GLAD_GL_CLEAR_NAMED_BUFFER_DATA = downcallHandleVoid(true, "glad_glClearNamedBufferData", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_CLEAR_NAMED_BUFFER_SUB_DATA = downcallHandleVoid(true, "glad_glClearNamedBufferSubData", JAVA_INT, JAVA_INT, JAVA_LONG, JAVA_LONG, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_MAP_NAMED_BUFFER = downcallHandle(true, "glad_glMapNamedBuffer", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
		GLAD_GL_MAP_NAMED_BUFFER_RANGE = downcallHandle(true, "glad_glMapNamedBufferRange", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_LONG, JAVA_LONG, JAVA_INT);
		GLAD_GL_UNMAP_NAMED_BUFFER = downcallHandle(true, "glad_glUnmapNamedBuffer", JAVA_BYTE, JAVA_INT);
		GLAD_GL_FLUSH_MAPPED_NAMED_BUFFER_RANGE = downcallHandleVoid(true, "glad_glFlushMappedNamedBufferRange", JAVA_INT, JAVA_LONG, JAVA_LONG);
		GLAD_GL_GET_NAMED_BUFFER_PARAMETERIV = downcallHandleVoid(true, "glad_glGetNamedBufferParameteriv", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_GET_NAMED_BUFFER_PARAMETERI64V = downcallHandleVoid(true, "glad_glGetNamedBufferParameteri64v", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_GET_NAMED_BUFFER_POINTERV = downcallHandleVoid(true, "glad_glGetNamedBufferPointerv", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_GET_NAMED_BUFFER_SUB_DATA = downcallHandleVoid(true, "glad_glGetNamedBufferSubData", JAVA_INT, JAVA_LONG, JAVA_LONG, UNBOUNDED_ADDRESS);
		GLAD_GL_CREATE_FRAMEBUFFERS = downcallHandleVoid(true, "glad_glCreateFramebuffers", JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_NAMED_FRAMEBUFFER_RENDERBUFFER = downcallHandleVoid(true, "glad_glNamedFramebufferRenderbuffer", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT);
		GLAD_GL_NAMED_FRAMEBUFFER_PARAMETERI = downcallHandleVoid(true, "glad_glNamedFramebufferParameteri", JAVA_INT, JAVA_INT, JAVA_INT);
		GLAD_GL_NAMED_FRAMEBUFFER_TEXTURE = downcallHandleVoid(true, "glad_glNamedFramebufferTexture", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT);
		GLAD_GL_NAMED_FRAMEBUFFER_TEXTURE_LAYER = downcallHandleVoid(true, "glad_glNamedFramebufferTextureLayer", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT);
		GLAD_GL_NAMED_FRAMEBUFFER_DRAW_BUFFER = downcallHandleVoid(true, "glad_glNamedFramebufferDrawBuffer", JAVA_INT, JAVA_INT);
		GLAD_GL_NAMED_FRAMEBUFFER_DRAW_BUFFERS = downcallHandleVoid(true, "glad_glNamedFramebufferDrawBuffers", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_NAMED_FRAMEBUFFER_READ_BUFFER = downcallHandleVoid(true, "glad_glNamedFramebufferReadBuffer", JAVA_INT, JAVA_INT);
		GLAD_GL_INVALIDATE_NAMED_FRAMEBUFFER_DATA = downcallHandleVoid(true, "glad_glInvalidateNamedFramebufferData", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_INVALIDATE_NAMED_FRAMEBUFFER_SUB_DATA = downcallHandleVoid(true, "glad_glInvalidateNamedFramebufferSubData", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT);
		GLAD_GL_CLEAR_NAMED_FRAMEBUFFERIV = downcallHandleVoid(true, "glad_glClearNamedFramebufferiv", JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_CLEAR_NAMED_FRAMEBUFFERUIV = downcallHandleVoid(true, "glad_glClearNamedFramebufferuiv", JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_CLEAR_NAMED_FRAMEBUFFERFV = downcallHandleVoid(true, "glad_glClearNamedFramebufferfv", JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_CLEAR_NAMED_FRAMEBUFFERFI = downcallHandleVoid(true, "glad_glClearNamedFramebufferfi", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_FLOAT, JAVA_INT);
		GLAD_GL_BLIT_NAMED_FRAMEBUFFER = downcallHandleVoid(true, "glad_glBlitNamedFramebuffer", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT);
		GLAD_GL_CHECK_NAMED_FRAMEBUFFER_STATUS = downcallHandle(true, "glad_glCheckNamedFramebufferStatus", JAVA_INT, JAVA_INT, JAVA_INT);
		GLAD_GL_GET_NAMED_FRAMEBUFFER_PARAMETERIV = downcallHandleVoid(true, "glad_glGetNamedFramebufferParameteriv", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_GET_NAMED_FRAMEBUFFER_ATTACHMENT_PARAMETERIV = downcallHandleVoid(true, "glad_glGetNamedFramebufferAttachmentParameteriv", JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_CREATE_RENDERBUFFERS = downcallHandleVoid(true, "glad_glCreateRenderbuffers", JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_NAMED_RENDERBUFFER_STORAGE = downcallHandleVoid(true, "glad_glNamedRenderbufferStorage", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT);
		GLAD_GL_NAMED_RENDERBUFFER_STORAGE_MULTISAMPLE = downcallHandleVoid(true, "glad_glNamedRenderbufferStorageMultisample", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT);
		GLAD_GL_GET_NAMED_RENDERBUFFER_PARAMETERIV = downcallHandleVoid(true, "glad_glGetNamedRenderbufferParameteriv", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_CREATE_TEXTURES = downcallHandleVoid(true, "glad_glCreateTextures", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_TEXTURE_BUFFER = downcallHandleVoid(true, "glad_glTextureBuffer", JAVA_INT, JAVA_INT, JAVA_INT);
		GLAD_GL_TEXTURE_BUFFER_RANGE = downcallHandleVoid(true, "glad_glTextureBufferRange", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_LONG, JAVA_LONG);
		GLAD_GL_TEXTURE_STORAGE1_D = downcallHandleVoid(true, "glad_glTextureStorage1D", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT);
		GLAD_GL_TEXTURE_STORAGE2_D = downcallHandleVoid(true, "glad_glTextureStorage2D", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT);
		GLAD_GL_TEXTURE_STORAGE3_D = downcallHandleVoid(true, "glad_glTextureStorage3D", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT);
		GLAD_GL_TEXTURE_STORAGE2_DMULTISAMPLE = downcallHandleVoid(true, "glad_glTextureStorage2DMultisample", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_BYTE);
		GLAD_GL_TEXTURE_STORAGE3_DMULTISAMPLE = downcallHandleVoid(true, "glad_glTextureStorage3DMultisample", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_BYTE);
		GLAD_GL_TEXTURE_SUB_IMAGE1_D = downcallHandleVoid(true, "glad_glTextureSubImage1D", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_TEXTURE_SUB_IMAGE2_D = downcallHandleVoid(true, "glad_glTextureSubImage2D", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_TEXTURE_SUB_IMAGE3_D = downcallHandleVoid(true, "glad_glTextureSubImage3D", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_COMPRESSED_TEXTURE_SUB_IMAGE1_D = downcallHandleVoid(true, "glad_glCompressedTextureSubImage1D", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_COMPRESSED_TEXTURE_SUB_IMAGE2_D = downcallHandleVoid(true, "glad_glCompressedTextureSubImage2D", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_COMPRESSED_TEXTURE_SUB_IMAGE3_D = downcallHandleVoid(true, "glad_glCompressedTextureSubImage3D", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_COPY_TEXTURE_SUB_IMAGE1_D = downcallHandleVoid(true, "glad_glCopyTextureSubImage1D", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT);
		GLAD_GL_COPY_TEXTURE_SUB_IMAGE2_D = downcallHandleVoid(true, "glad_glCopyTextureSubImage2D", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT);
		GLAD_GL_COPY_TEXTURE_SUB_IMAGE3_D = downcallHandleVoid(true, "glad_glCopyTextureSubImage3D", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT);
		GLAD_GL_TEXTURE_PARAMETERF = downcallHandleVoid(true, "glad_glTextureParameterf", JAVA_INT, JAVA_INT, JAVA_FLOAT);
		GLAD_GL_TEXTURE_PARAMETERFV = downcallHandleVoid(true, "glad_glTextureParameterfv", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_TEXTURE_PARAMETERI = downcallHandleVoid(true, "glad_glTextureParameteri", JAVA_INT, JAVA_INT, JAVA_INT);
		GLAD_GL_TEXTURE_PARAMETER_IIV = downcallHandleVoid(true, "glad_glTextureParameterIiv", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_TEXTURE_PARAMETER_IUIV = downcallHandleVoid(true, "glad_glTextureParameterIuiv", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_TEXTURE_PARAMETERIV = downcallHandleVoid(true, "glad_glTextureParameteriv", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_GENERATE_TEXTURE_MIPMAP = downcallHandleVoid(true, "glad_glGenerateTextureMipmap", JAVA_INT);
		GLAD_GL_BIND_TEXTURE_UNIT = downcallHandleVoid(true, "glad_glBindTextureUnit", JAVA_INT, JAVA_INT);
		GLAD_GL_GET_TEXTURE_IMAGE = downcallHandleVoid(true, "glad_glGetTextureImage", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_GET_COMPRESSED_TEXTURE_IMAGE = downcallHandleVoid(true, "glad_glGetCompressedTextureImage", JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_GET_TEXTURE_LEVEL_PARAMETERFV = downcallHandleVoid(true, "glad_glGetTextureLevelParameterfv", JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_GET_TEXTURE_LEVEL_PARAMETERIV = downcallHandleVoid(true, "glad_glGetTextureLevelParameteriv", JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_GET_TEXTURE_PARAMETERFV = downcallHandleVoid(true, "glad_glGetTextureParameterfv", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_GET_TEXTURE_PARAMETER_IIV = downcallHandleVoid(true, "glad_glGetTextureParameterIiv", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_GET_TEXTURE_PARAMETER_IUIV = downcallHandleVoid(true, "glad_glGetTextureParameterIuiv", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_GET_TEXTURE_PARAMETERIV = downcallHandleVoid(true, "glad_glGetTextureParameteriv", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_CREATE_VERTEX_ARRAYS = downcallHandleVoid(true, "glad_glCreateVertexArrays", JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_DISABLE_VERTEX_ARRAY_ATTRIB = downcallHandleVoid(true, "glad_glDisableVertexArrayAttrib", JAVA_INT, JAVA_INT);
		GLAD_GL_ENABLE_VERTEX_ARRAY_ATTRIB = downcallHandleVoid(true, "glad_glEnableVertexArrayAttrib", JAVA_INT, JAVA_INT);
		GLAD_GL_VERTEX_ARRAY_ELEMENT_BUFFER = downcallHandleVoid(true, "glad_glVertexArrayElementBuffer", JAVA_INT, JAVA_INT);
		GLAD_GL_VERTEX_ARRAY_VERTEX_BUFFER = downcallHandleVoid(true, "glad_glVertexArrayVertexBuffer", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_LONG, JAVA_INT);
		GLAD_GL_VERTEX_ARRAY_VERTEX_BUFFERS = downcallHandleVoid(true, "glad_glVertexArrayVertexBuffers", JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		GLAD_GL_VERTEX_ARRAY_ATTRIB_BINDING = downcallHandleVoid(true, "glad_glVertexArrayAttribBinding", JAVA_INT, JAVA_INT, JAVA_INT);
		GLAD_GL_VERTEX_ARRAY_ATTRIB_FORMAT = downcallHandleVoid(true, "glad_glVertexArrayAttribFormat", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_BYTE, JAVA_INT);
		GLAD_GL_VERTEX_ARRAY_ATTRIB_IFORMAT = downcallHandleVoid(true, "glad_glVertexArrayAttribIFormat", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT);
		GLAD_GL_VERTEX_ARRAY_ATTRIB_LFORMAT = downcallHandleVoid(true, "glad_glVertexArrayAttribLFormat", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT);
		GLAD_GL_VERTEX_ARRAY_BINDING_DIVISOR = downcallHandleVoid(true, "glad_glVertexArrayBindingDivisor", JAVA_INT, JAVA_INT, JAVA_INT);
		GLAD_GL_GET_VERTEX_ARRAYIV = downcallHandleVoid(true, "glad_glGetVertexArrayiv", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_GET_VERTEX_ARRAY_INDEXEDIV = downcallHandleVoid(true, "glad_glGetVertexArrayIndexediv", JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_GET_VERTEX_ARRAY_INDEXED64IV = downcallHandleVoid(true, "glad_glGetVertexArrayIndexed64iv", JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_CREATE_SAMPLERS = downcallHandleVoid(true, "glad_glCreateSamplers", JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_CREATE_PROGRAM_PIPELINES = downcallHandleVoid(true, "glad_glCreateProgramPipelines", JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_CREATE_QUERIES = downcallHandleVoid(true, "glad_glCreateQueries", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_GET_QUERY_BUFFER_OBJECTI64V = downcallHandleVoid(true, "glad_glGetQueryBufferObjecti64v", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_LONG);
		GLAD_GL_GET_QUERY_BUFFER_OBJECTIV = downcallHandleVoid(true, "glad_glGetQueryBufferObjectiv", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_LONG);
		GLAD_GL_GET_QUERY_BUFFER_OBJECTUI64V = downcallHandleVoid(true, "glad_glGetQueryBufferObjectui64v", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_LONG);
		GLAD_GL_GET_QUERY_BUFFER_OBJECTUIV = downcallHandleVoid(true, "glad_glGetQueryBufferObjectuiv", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_LONG);
		GLAD_GL_MEMORY_BARRIER_BY_REGION = downcallHandleVoid(true, "glad_glMemoryBarrierByRegion", JAVA_INT);
		GLAD_GL_GET_TEXTURE_SUB_IMAGE = downcallHandleVoid(true, "glad_glGetTextureSubImage", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_GET_COMPRESSED_TEXTURE_SUB_IMAGE = downcallHandleVoid(true, "glad_glGetCompressedTextureSubImage", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_GET_GRAPHICS_RESET_STATUS = downcallHandle(true, "glad_glGetGraphicsResetStatus", JAVA_INT);
		GLAD_GL_GETN_COMPRESSED_TEX_IMAGE = downcallHandleVoid(true, "glad_glGetnCompressedTexImage", JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_GETN_TEX_IMAGE = downcallHandleVoid(true, "glad_glGetnTexImage", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_GETN_UNIFORMDV = downcallHandleVoid(true, "glad_glGetnUniformdv", JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_GETN_UNIFORMFV = downcallHandleVoid(true, "glad_glGetnUniformfv", JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_GETN_UNIFORMIV = downcallHandleVoid(true, "glad_glGetnUniformiv", JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_GETN_UNIFORMUIV = downcallHandleVoid(true, "glad_glGetnUniformuiv", JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_READN_PIXELS = downcallHandleVoid(true, "glad_glReadnPixels", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_GETN_MAPDV = downcallHandleVoid(true, "glad_glGetnMapdv", JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_GETN_MAPFV = downcallHandleVoid(true, "glad_glGetnMapfv", JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_GETN_MAPIV = downcallHandleVoid(true, "glad_glGetnMapiv", JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_GETN_PIXEL_MAPFV = downcallHandleVoid(true, "glad_glGetnPixelMapfv", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_GETN_PIXEL_MAPUIV = downcallHandleVoid(true, "glad_glGetnPixelMapuiv", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_GETN_PIXEL_MAPUSV = downcallHandleVoid(true, "glad_glGetnPixelMapusv", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_GETN_POLYGON_STIPPLE = downcallHandleVoid(true, "glad_glGetnPolygonStipple", JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_GETN_COLOR_TABLE = downcallHandleVoid(true, "glad_glGetnColorTable", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_GETN_CONVOLUTION_FILTER = downcallHandleVoid(true, "glad_glGetnConvolutionFilter", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_GETN_SEPARABLE_FILTER = downcallHandleVoid(true, "glad_glGetnSeparableFilter", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		GLAD_GL_GETN_HISTOGRAM = downcallHandleVoid(true, "glad_glGetnHistogram", JAVA_INT, JAVA_BYTE, JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_GETN_MINMAX = downcallHandleVoid(true, "glad_glGetnMinmax", JAVA_INT, JAVA_BYTE, JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
		GLAD_GL_TEXTURE_BARRIER = downcallHandleVoid(true, "glad_glTextureBarrier");
		GLAD_GL_SPECIALIZE_SHADER = downcallHandleVoid(true, "glad_glSpecializeShader", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		GLAD_GL_MULTI_DRAW_ARRAYS_INDIRECT_COUNT = downcallHandleVoid(true, "glad_glMultiDrawArraysIndirectCount", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_INT, JAVA_INT);
		GLAD_GL_MULTI_DRAW_ELEMENTS_INDIRECT_COUNT = downcallHandleVoid(true, "glad_glMultiDrawElementsIndirectCount", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_INT, JAVA_INT);
		GLAD_GL_POLYGON_OFFSET_CLAMP = downcallHandleVoid(true, "glad_glPolygonOffsetClamp", JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT);
		//@formatter:on
	}

	private GL() {
	}

    public static final boolean GL_VERSION_1_0() {
        return GL_VERSION_1_0.get();
    }
    
    public static final boolean GL_VERSION_1_1() {
        return GL_VERSION_1_1.get();
    }
    
    public static final boolean GL_VERSION_1_2() {
        return GL_VERSION_1_2.get();
    }
    
    public static final boolean GL_VERSION_1_3() {
        return GL_VERSION_1_3.get();
    }
    
    public static final boolean GL_VERSION_1_4() {
        return GL_VERSION_1_4.get();
    }
    
    public static final boolean GL_VERSION_1_5() {
        return GL_VERSION_1_5.get();
    }
    
    public static final boolean GL_VERSION_2_0() {
        return GL_VERSION_2_0.get();
    }
    
    public static final boolean GL_VERSION_2_1() {
        return GL_VERSION_2_1.get();
    }
    
    public static final boolean GL_VERSION_3_0() {
        return GL_VERSION_3_0.get();
    }
    
    public static final boolean GL_VERSION_3_1() {
        return GL_VERSION_3_1.get();
    }
    
    public static final boolean GL_VERSION_3_2() {
        return GL_VERSION_3_2.get();
    }
    
    public static final boolean GL_VERSION_3_3() {
        return GL_VERSION_3_3.get();
    }
    
    public static final boolean GL_VERSION_4_0() {
        return GL_VERSION_4_0.get();
    }
    
    public static final boolean GL_VERSION_4_1() {
        return GL_VERSION_4_1.get();
    }
    
    public static final boolean GL_VERSION_4_2() {
        return GL_VERSION_4_2.get();
    }
    
    public static final boolean GL_VERSION_4_3() {
        return GL_VERSION_4_3.get();
    }
    
    public static final boolean GL_VERSION_4_4() {
        return GL_VERSION_4_4.get();
    }
    
    public static final boolean GL_VERSION_4_5() {
        return GL_VERSION_4_5.get();
    }
    
    public static final boolean GL_VERSION_4_6() {
        return GL_VERSION_4_6.get();
    }
    
    public static int gladLoadGL() {
    	MethodHandle method = GLAD_LOAD_GL.get();
    	try {
    		return (int) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static int gladLoadGLLoader(
    	MemorySegment param0
    ) {
    	MethodHandle method = GLAD_LOAD_GLLOADER.get();
    	try {
    		return (int) method.invokeExact(
    			param0
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glCullFace(
    	int mode
    ) {
    	MethodHandle method = GLAD_GL_CULL_FACE.get();
    	try {
    		 method.invokeExact(
    			mode
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glFrontFace(
    	int mode
    ) {
    	MethodHandle method = GLAD_GL_FRONT_FACE.get();
    	try {
    		 method.invokeExact(
    			mode
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glHint(
    	int target,
    	int mode
    ) {
    	MethodHandle method = GLAD_GL_HINT.get();
    	try {
    		 method.invokeExact(
    			target,
    			mode
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glLineWidth(
    	float width
    ) {
    	MethodHandle method = GLAD_GL_LINE_WIDTH.get();
    	try {
    		 method.invokeExact(
    			width
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glPointSize(
    	float size
    ) {
    	MethodHandle method = GLAD_GL_POINT_SIZE.get();
    	try {
    		 method.invokeExact(
    			size
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glPolygonMode(
    	int face,
    	int mode
    ) {
    	MethodHandle method = GLAD_GL_POLYGON_MODE.get();
    	try {
    		 method.invokeExact(
    			face,
    			mode
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glScissor(
    	int x,
    	int y,
    	int width,
    	int height
    ) {
    	MethodHandle method = GLAD_GL_SCISSOR.get();
    	try {
    		 method.invokeExact(
    			x,
    			y,
    			width,
    			height
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glTexParameterf(
    	int target,
    	int pname,
    	float param
    ) {
    	MethodHandle method = GLAD_GL_TEX_PARAMETERF.get();
    	try {
    		 method.invokeExact(
    			target,
    			pname,
    			param
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glTexParameterfv(
    	int target,
    	int pname,
    	MemorySegment params
    ) {
    	MethodHandle method = GLAD_GL_TEX_PARAMETERFV.get();
    	try {
    		 method.invokeExact(
    			target,
    			pname,
    			params
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glTexParameterfv].
    public static void glTexParameterfv(
    	int target,
    	int pname,
    	NativeFloatArray params
    ) {
    	glTexParameterfv(
    		target,
    		pname,
    		params.memorySegment()
    	);
    }
    
    public static void glTexParameteri(
    	int target,
    	int pname,
    	int param
    ) {
    	MethodHandle method = GLAD_GL_TEX_PARAMETERI.get();
    	try {
    		 method.invokeExact(
    			target,
    			pname,
    			param
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glTexParameteriv(
    	int target,
    	int pname,
    	MemorySegment params
    ) {
    	MethodHandle method = GLAD_GL_TEX_PARAMETERIV.get();
    	try {
    		 method.invokeExact(
    			target,
    			pname,
    			params
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glTexParameteriv].
    public static void glTexParameteriv(
    	int target,
    	int pname,
    	NativeIntArray params
    ) {
    	glTexParameteriv(
    		target,
    		pname,
    		params.memorySegment()
    	);
    }
    
    public static void glTexImage1D(
    	int target,
    	int level,
    	int internalformat,
    	int width,
    	int border,
    	int format,
    	int type,
    	MemorySegment pixels
    ) {
    	MethodHandle method = GLAD_GL_TEX_IMAGE1_D.get();
    	try {
    		 method.invokeExact(
    			target,
    			level,
    			internalformat,
    			width,
    			border,
    			format,
    			type,
    			pixels
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glTexImage2D(
    	int target,
    	int level,
    	int internalformat,
    	int width,
    	int height,
    	int border,
    	int format,
    	int type,
    	MemorySegment pixels
    ) {
    	MethodHandle method = GLAD_GL_TEX_IMAGE2_D.get();
    	try {
    		 method.invokeExact(
    			target,
    			level,
    			internalformat,
    			width,
    			height,
    			border,
    			format,
    			type,
    			pixels
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glDrawBuffer(
    	int buf
    ) {
    	MethodHandle method = GLAD_GL_DRAW_BUFFER.get();
    	try {
    		 method.invokeExact(
    			buf
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glClear(
    	int mask
    ) {
    	MethodHandle method = GLAD_GL_CLEAR.get();
    	try {
    		 method.invokeExact(
    			mask
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glClearColor(
    	float red,
    	float green,
    	float blue,
    	float alpha
    ) {
    	MethodHandle method = GLAD_GL_CLEAR_COLOR.get();
    	try {
    		 method.invokeExact(
    			red,
    			green,
    			blue,
    			alpha
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glClearStencil(
    	int s
    ) {
    	MethodHandle method = GLAD_GL_CLEAR_STENCIL.get();
    	try {
    		 method.invokeExact(
    			s
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glClearDepth(
    	double depth
    ) {
    	MethodHandle method = GLAD_GL_CLEAR_DEPTH.get();
    	try {
    		 method.invokeExact(
    			depth
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glStencilMask(
    	int mask
    ) {
    	MethodHandle method = GLAD_GL_STENCIL_MASK.get();
    	try {
    		 method.invokeExact(
    			mask
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glColorMask(
    	byte red,
    	byte green,
    	byte blue,
    	byte alpha
    ) {
    	MethodHandle method = GLAD_GL_COLOR_MASK.get();
    	try {
    		 method.invokeExact(
    			red,
    			green,
    			blue,
    			alpha
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glDepthMask(
    	byte flag
    ) {
    	MethodHandle method = GLAD_GL_DEPTH_MASK.get();
    	try {
    		 method.invokeExact(
    			flag
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glDisable(
    	int cap
    ) {
    	MethodHandle method = GLAD_GL_DISABLE.get();
    	try {
    		 method.invokeExact(
    			cap
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glEnable(
    	int cap
    ) {
    	MethodHandle method = GLAD_GL_ENABLE.get();
    	try {
    		 method.invokeExact(
    			cap
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glFinish() {
    	MethodHandle method = GLAD_GL_FINISH.get();
    	try {
    		 method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glFlush() {
    	MethodHandle method = GLAD_GL_FLUSH.get();
    	try {
    		 method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glBlendFunc(
    	int sfactor,
    	int dfactor
    ) {
    	MethodHandle method = GLAD_GL_BLEND_FUNC.get();
    	try {
    		 method.invokeExact(
    			sfactor,
    			dfactor
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glLogicOp(
    	int opcode
    ) {
    	MethodHandle method = GLAD_GL_LOGIC_OP.get();
    	try {
    		 method.invokeExact(
    			opcode
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glStencilFunc(
    	int func,
    	int ref,
    	int mask
    ) {
    	MethodHandle method = GLAD_GL_STENCIL_FUNC.get();
    	try {
    		 method.invokeExact(
    			func,
    			ref,
    			mask
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glStencilOp(
    	int fail,
    	int zfail,
    	int zpass
    ) {
    	MethodHandle method = GLAD_GL_STENCIL_OP.get();
    	try {
    		 method.invokeExact(
    			fail,
    			zfail,
    			zpass
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glDepthFunc(
    	int func
    ) {
    	MethodHandle method = GLAD_GL_DEPTH_FUNC.get();
    	try {
    		 method.invokeExact(
    			func
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glPixelStoref(
    	int pname,
    	float param
    ) {
    	MethodHandle method = GLAD_GL_PIXEL_STOREF.get();
    	try {
    		 method.invokeExact(
    			pname,
    			param
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glPixelStorei(
    	int pname,
    	int param
    ) {
    	MethodHandle method = GLAD_GL_PIXEL_STOREI.get();
    	try {
    		 method.invokeExact(
    			pname,
    			param
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glReadBuffer(
    	int src
    ) {
    	MethodHandle method = GLAD_GL_READ_BUFFER.get();
    	try {
    		 method.invokeExact(
    			src
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glReadPixels(
    	int x,
    	int y,
    	int width,
    	int height,
    	int format,
    	int type,
    	MemorySegment pixels
    ) {
    	MethodHandle method = GLAD_GL_READ_PIXELS.get();
    	try {
    		 method.invokeExact(
    			x,
    			y,
    			width,
    			height,
    			format,
    			type,
    			pixels
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glGetBooleanv(
    	int pname,
    	MemorySegment data
    ) {
    	MethodHandle method = GLAD_GL_GET_BOOLEANV.get();
    	try {
    		 method.invokeExact(
    			pname,
    			data
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetBooleanv].
    public static void glGetBooleanv(
    	int pname,
    	NativeByteArray data
    ) {
    	glGetBooleanv(
    		pname,
    		data.memorySegment()
    	);
    }
    
    public static void glGetDoublev(
    	int pname,
    	MemorySegment data
    ) {
    	MethodHandle method = GLAD_GL_GET_DOUBLEV.get();
    	try {
    		 method.invokeExact(
    			pname,
    			data
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetDoublev].
    public static void glGetDoublev(
    	int pname,
    	NativeDoubleArray data
    ) {
    	glGetDoublev(
    		pname,
    		data.memorySegment()
    	);
    }
    
    public static int glGetError() {
    	MethodHandle method = GLAD_GL_GET_ERROR.get();
    	try {
    		return (int) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glGetFloatv(
    	int pname,
    	MemorySegment data
    ) {
    	MethodHandle method = GLAD_GL_GET_FLOATV.get();
    	try {
    		 method.invokeExact(
    			pname,
    			data
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetFloatv].
    public static void glGetFloatv(
    	int pname,
    	NativeFloatArray data
    ) {
    	glGetFloatv(
    		pname,
    		data.memorySegment()
    	);
    }
    
    public static void glGetIntegerv(
    	int pname,
    	MemorySegment data
    ) {
    	MethodHandle method = GLAD_GL_GET_INTEGERV.get();
    	try {
    		 method.invokeExact(
    			pname,
    			data
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetIntegerv].
    public static void glGetIntegerv(
    	int pname,
    	NativeIntArray data
    ) {
    	glGetIntegerv(
    		pname,
    		data.memorySegment()
    	);
    }
    
    public static MemorySegment nglGetString(
    	int name
    ) {
    	MethodHandle method = GLAD_GL_GET_STRING.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			name
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nglGetString].
    public static @Nullable String glGetString(
    	int name
    ) {
    	MemorySegment segment = nglGetString(
    		name
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment.getString(0);
    }
    
    public static void glGetTexImage(
    	int target,
    	int level,
    	int format,
    	int type,
    	MemorySegment pixels
    ) {
    	MethodHandle method = GLAD_GL_GET_TEX_IMAGE.get();
    	try {
    		 method.invokeExact(
    			target,
    			level,
    			format,
    			type,
    			pixels
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glGetTexParameterfv(
    	int target,
    	int pname,
    	MemorySegment params
    ) {
    	MethodHandle method = GLAD_GL_GET_TEX_PARAMETERFV.get();
    	try {
    		 method.invokeExact(
    			target,
    			pname,
    			params
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetTexParameterfv].
    public static void glGetTexParameterfv(
    	int target,
    	int pname,
    	NativeFloatArray params
    ) {
    	glGetTexParameterfv(
    		target,
    		pname,
    		params.memorySegment()
    	);
    }
    
    public static void glGetTexParameteriv(
    	int target,
    	int pname,
    	MemorySegment params
    ) {
    	MethodHandle method = GLAD_GL_GET_TEX_PARAMETERIV.get();
    	try {
    		 method.invokeExact(
    			target,
    			pname,
    			params
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetTexParameteriv].
    public static void glGetTexParameteriv(
    	int target,
    	int pname,
    	NativeIntArray params
    ) {
    	glGetTexParameteriv(
    		target,
    		pname,
    		params.memorySegment()
    	);
    }
    
    public static void glGetTexLevelParameterfv(
    	int target,
    	int level,
    	int pname,
    	MemorySegment params
    ) {
    	MethodHandle method = GLAD_GL_GET_TEX_LEVEL_PARAMETERFV.get();
    	try {
    		 method.invokeExact(
    			target,
    			level,
    			pname,
    			params
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetTexLevelParameterfv].
    public static void glGetTexLevelParameterfv(
    	int target,
    	int level,
    	int pname,
    	NativeFloatArray params
    ) {
    	glGetTexLevelParameterfv(
    		target,
    		level,
    		pname,
    		params.memorySegment()
    	);
    }
    
    public static void glGetTexLevelParameteriv(
    	int target,
    	int level,
    	int pname,
    	MemorySegment params
    ) {
    	MethodHandle method = GLAD_GL_GET_TEX_LEVEL_PARAMETERIV.get();
    	try {
    		 method.invokeExact(
    			target,
    			level,
    			pname,
    			params
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetTexLevelParameteriv].
    public static void glGetTexLevelParameteriv(
    	int target,
    	int level,
    	int pname,
    	NativeIntArray params
    ) {
    	glGetTexLevelParameteriv(
    		target,
    		level,
    		pname,
    		params.memorySegment()
    	);
    }
    
    public static byte glIsEnabled(
    	int cap
    ) {
    	MethodHandle method = GLAD_GL_IS_ENABLED.get();
    	try {
    		return (byte) method.invokeExact(
    			cap
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glDepthRange(
    	double n,
    	double f
    ) {
    	MethodHandle method = GLAD_GL_DEPTH_RANGE.get();
    	try {
    		 method.invokeExact(
    			n,
    			f
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glViewport(
    	int x,
    	int y,
    	int width,
    	int height
    ) {
    	MethodHandle method = GLAD_GL_VIEWPORT.get();
    	try {
    		 method.invokeExact(
    			x,
    			y,
    			width,
    			height
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glDrawArrays(
    	int mode,
    	int first,
    	int count
    ) {
    	MethodHandle method = GLAD_GL_DRAW_ARRAYS.get();
    	try {
    		 method.invokeExact(
    			mode,
    			first,
    			count
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glDrawElements(
    	int mode,
    	int count,
    	int type,
    	MemorySegment indices
    ) {
    	MethodHandle method = GLAD_GL_DRAW_ELEMENTS.get();
    	try {
    		 method.invokeExact(
    			mode,
    			count,
    			type,
    			indices
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glPolygonOffset(
    	float factor,
    	float units
    ) {
    	MethodHandle method = GLAD_GL_POLYGON_OFFSET.get();
    	try {
    		 method.invokeExact(
    			factor,
    			units
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glCopyTexImage1D(
    	int target,
    	int level,
    	int internalformat,
    	int x,
    	int y,
    	int width,
    	int border
    ) {
    	MethodHandle method = GLAD_GL_COPY_TEX_IMAGE1_D.get();
    	try {
    		 method.invokeExact(
    			target,
    			level,
    			internalformat,
    			x,
    			y,
    			width,
    			border
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glCopyTexImage2D(
    	int target,
    	int level,
    	int internalformat,
    	int x,
    	int y,
    	int width,
    	int height,
    	int border
    ) {
    	MethodHandle method = GLAD_GL_COPY_TEX_IMAGE2_D.get();
    	try {
    		 method.invokeExact(
    			target,
    			level,
    			internalformat,
    			x,
    			y,
    			width,
    			height,
    			border
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glCopyTexSubImage1D(
    	int target,
    	int level,
    	int xoffset,
    	int x,
    	int y,
    	int width
    ) {
    	MethodHandle method = GLAD_GL_COPY_TEX_SUB_IMAGE1_D.get();
    	try {
    		 method.invokeExact(
    			target,
    			level,
    			xoffset,
    			x,
    			y,
    			width
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glCopyTexSubImage2D(
    	int target,
    	int level,
    	int xoffset,
    	int yoffset,
    	int x,
    	int y,
    	int width,
    	int height
    ) {
    	MethodHandle method = GLAD_GL_COPY_TEX_SUB_IMAGE2_D.get();
    	try {
    		 method.invokeExact(
    			target,
    			level,
    			xoffset,
    			yoffset,
    			x,
    			y,
    			width,
    			height
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glTexSubImage1D(
    	int target,
    	int level,
    	int xoffset,
    	int width,
    	int format,
    	int type,
    	MemorySegment pixels
    ) {
    	MethodHandle method = GLAD_GL_TEX_SUB_IMAGE1_D.get();
    	try {
    		 method.invokeExact(
    			target,
    			level,
    			xoffset,
    			width,
    			format,
    			type,
    			pixels
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glTexSubImage2D(
    	int target,
    	int level,
    	int xoffset,
    	int yoffset,
    	int width,
    	int height,
    	int format,
    	int type,
    	MemorySegment pixels
    ) {
    	MethodHandle method = GLAD_GL_TEX_SUB_IMAGE2_D.get();
    	try {
    		 method.invokeExact(
    			target,
    			level,
    			xoffset,
    			yoffset,
    			width,
    			height,
    			format,
    			type,
    			pixels
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glBindTexture(
    	int target,
    	int texture
    ) {
    	MethodHandle method = GLAD_GL_BIND_TEXTURE.get();
    	try {
    		 method.invokeExact(
    			target,
    			texture
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glDeleteTextures(
    	int n,
    	MemorySegment textures
    ) {
    	MethodHandle method = GLAD_GL_DELETE_TEXTURES.get();
    	try {
    		 method.invokeExact(
    			n,
    			textures
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glDeleteTextures].
    public static void glDeleteTextures(
    	int n,
    	NativeIntArray textures
    ) {
    	glDeleteTextures(
    		n,
    		textures.memorySegment()
    	);
    }
    
    public static void glGenTextures(
    	int n,
    	MemorySegment textures
    ) {
    	MethodHandle method = GLAD_GL_GEN_TEXTURES.get();
    	try {
    		 method.invokeExact(
    			n,
    			textures
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGenTextures].
    public static void glGenTextures(
    	int n,
    	NativeIntArray textures
    ) {
    	glGenTextures(
    		n,
    		textures.memorySegment()
    	);
    }
    
    public static byte glIsTexture(
    	int texture
    ) {
    	MethodHandle method = GLAD_GL_IS_TEXTURE.get();
    	try {
    		return (byte) method.invokeExact(
    			texture
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glDrawRangeElements(
    	int mode,
    	int start,
    	int end,
    	int count,
    	int type,
    	MemorySegment indices
    ) {
    	MethodHandle method = GLAD_GL_DRAW_RANGE_ELEMENTS.get();
    	try {
    		 method.invokeExact(
    			mode,
    			start,
    			end,
    			count,
    			type,
    			indices
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glTexImage3D(
    	int target,
    	int level,
    	int internalformat,
    	int width,
    	int height,
    	int depth,
    	int border,
    	int format,
    	int type,
    	MemorySegment pixels
    ) {
    	MethodHandle method = GLAD_GL_TEX_IMAGE3_D.get();
    	try {
    		 method.invokeExact(
    			target,
    			level,
    			internalformat,
    			width,
    			height,
    			depth,
    			border,
    			format,
    			type,
    			pixels
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glTexSubImage3D(
    	int target,
    	int level,
    	int xoffset,
    	int yoffset,
    	int zoffset,
    	int width,
    	int height,
    	int depth,
    	int format,
    	int type,
    	MemorySegment pixels
    ) {
    	MethodHandle method = GLAD_GL_TEX_SUB_IMAGE3_D.get();
    	try {
    		 method.invokeExact(
    			target,
    			level,
    			xoffset,
    			yoffset,
    			zoffset,
    			width,
    			height,
    			depth,
    			format,
    			type,
    			pixels
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glCopyTexSubImage3D(
    	int target,
    	int level,
    	int xoffset,
    	int yoffset,
    	int zoffset,
    	int x,
    	int y,
    	int width,
    	int height
    ) {
    	MethodHandle method = GLAD_GL_COPY_TEX_SUB_IMAGE3_D.get();
    	try {
    		 method.invokeExact(
    			target,
    			level,
    			xoffset,
    			yoffset,
    			zoffset,
    			x,
    			y,
    			width,
    			height
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glActiveTexture(
    	int texture
    ) {
    	MethodHandle method = GLAD_GL_ACTIVE_TEXTURE.get();
    	try {
    		 method.invokeExact(
    			texture
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glSampleCoverage(
    	float value,
    	byte invert
    ) {
    	MethodHandle method = GLAD_GL_SAMPLE_COVERAGE.get();
    	try {
    		 method.invokeExact(
    			value,
    			invert
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glCompressedTexImage3D(
    	int target,
    	int level,
    	int internalformat,
    	int width,
    	int height,
    	int depth,
    	int border,
    	int imageSize,
    	MemorySegment data
    ) {
    	MethodHandle method = GLAD_GL_COMPRESSED_TEX_IMAGE3_D.get();
    	try {
    		 method.invokeExact(
    			target,
    			level,
    			internalformat,
    			width,
    			height,
    			depth,
    			border,
    			imageSize,
    			data
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glCompressedTexImage2D(
    	int target,
    	int level,
    	int internalformat,
    	int width,
    	int height,
    	int border,
    	int imageSize,
    	MemorySegment data
    ) {
    	MethodHandle method = GLAD_GL_COMPRESSED_TEX_IMAGE2_D.get();
    	try {
    		 method.invokeExact(
    			target,
    			level,
    			internalformat,
    			width,
    			height,
    			border,
    			imageSize,
    			data
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glCompressedTexImage1D(
    	int target,
    	int level,
    	int internalformat,
    	int width,
    	int border,
    	int imageSize,
    	MemorySegment data
    ) {
    	MethodHandle method = GLAD_GL_COMPRESSED_TEX_IMAGE1_D.get();
    	try {
    		 method.invokeExact(
    			target,
    			level,
    			internalformat,
    			width,
    			border,
    			imageSize,
    			data
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glCompressedTexSubImage3D(
    	int target,
    	int level,
    	int xoffset,
    	int yoffset,
    	int zoffset,
    	int width,
    	int height,
    	int depth,
    	int format,
    	int imageSize,
    	MemorySegment data
    ) {
    	MethodHandle method = GLAD_GL_COMPRESSED_TEX_SUB_IMAGE3_D.get();
    	try {
    		 method.invokeExact(
    			target,
    			level,
    			xoffset,
    			yoffset,
    			zoffset,
    			width,
    			height,
    			depth,
    			format,
    			imageSize,
    			data
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glCompressedTexSubImage2D(
    	int target,
    	int level,
    	int xoffset,
    	int yoffset,
    	int width,
    	int height,
    	int format,
    	int imageSize,
    	MemorySegment data
    ) {
    	MethodHandle method = GLAD_GL_COMPRESSED_TEX_SUB_IMAGE2_D.get();
    	try {
    		 method.invokeExact(
    			target,
    			level,
    			xoffset,
    			yoffset,
    			width,
    			height,
    			format,
    			imageSize,
    			data
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glCompressedTexSubImage1D(
    	int target,
    	int level,
    	int xoffset,
    	int width,
    	int format,
    	int imageSize,
    	MemorySegment data
    ) {
    	MethodHandle method = GLAD_GL_COMPRESSED_TEX_SUB_IMAGE1_D.get();
    	try {
    		 method.invokeExact(
    			target,
    			level,
    			xoffset,
    			width,
    			format,
    			imageSize,
    			data
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glGetCompressedTexImage(
    	int target,
    	int level,
    	MemorySegment img
    ) {
    	MethodHandle method = GLAD_GL_GET_COMPRESSED_TEX_IMAGE.get();
    	try {
    		 method.invokeExact(
    			target,
    			level,
    			img
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glBlendFuncSeparate(
    	int sfactorRGB,
    	int dfactorRGB,
    	int sfactorAlpha,
    	int dfactorAlpha
    ) {
    	MethodHandle method = GLAD_GL_BLEND_FUNC_SEPARATE.get();
    	try {
    		 method.invokeExact(
    			sfactorRGB,
    			dfactorRGB,
    			sfactorAlpha,
    			dfactorAlpha
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glMultiDrawArrays(
    	int mode,
    	MemorySegment first,
    	MemorySegment count,
    	int drawcount
    ) {
    	MethodHandle method = GLAD_GL_MULTI_DRAW_ARRAYS.get();
    	try {
    		 method.invokeExact(
    			mode,
    			first,
    			count,
    			drawcount
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glMultiDrawArrays].
    public static void glMultiDrawArrays(
    	int mode,
    	NativeIntArray first,
    	NativeIntArray count,
    	int drawcount
    ) {
    	glMultiDrawArrays(
    		mode,
    		first.memorySegment(),
    		count.memorySegment(),
    		drawcount
    	);
    }
    
    public static void glMultiDrawElements(
    	int mode,
    	MemorySegment count,
    	int type,
    	MemorySegment indices,
    	int drawcount
    ) {
    	MethodHandle method = GLAD_GL_MULTI_DRAW_ELEMENTS.get();
    	try {
    		 method.invokeExact(
    			mode,
    			count,
    			type,
    			indices,
    			drawcount
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glMultiDrawElements].
    public static void glMultiDrawElements(
    	int mode,
    	NativeIntArray count,
    	int type,
    	NativePointerArray indices,
    	int drawcount
    ) {
    	glMultiDrawElements(
    		mode,
    		count.memorySegment(),
    		type,
    		indices.memorySegment(),
    		drawcount
    	);
    }
    
    public static void glPointParameterf(
    	int pname,
    	float param
    ) {
    	MethodHandle method = GLAD_GL_POINT_PARAMETERF.get();
    	try {
    		 method.invokeExact(
    			pname,
    			param
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glPointParameterfv(
    	int pname,
    	MemorySegment params
    ) {
    	MethodHandle method = GLAD_GL_POINT_PARAMETERFV.get();
    	try {
    		 method.invokeExact(
    			pname,
    			params
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glPointParameterfv].
    public static void glPointParameterfv(
    	int pname,
    	NativeFloatArray params
    ) {
    	glPointParameterfv(
    		pname,
    		params.memorySegment()
    	);
    }
    
    public static void glPointParameteri(
    	int pname,
    	int param
    ) {
    	MethodHandle method = GLAD_GL_POINT_PARAMETERI.get();
    	try {
    		 method.invokeExact(
    			pname,
    			param
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glPointParameteriv(
    	int pname,
    	MemorySegment params
    ) {
    	MethodHandle method = GLAD_GL_POINT_PARAMETERIV.get();
    	try {
    		 method.invokeExact(
    			pname,
    			params
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glPointParameteriv].
    public static void glPointParameteriv(
    	int pname,
    	NativeIntArray params
    ) {
    	glPointParameteriv(
    		pname,
    		params.memorySegment()
    	);
    }
    
    public static void glBlendColor(
    	float red,
    	float green,
    	float blue,
    	float alpha
    ) {
    	MethodHandle method = GLAD_GL_BLEND_COLOR.get();
    	try {
    		 method.invokeExact(
    			red,
    			green,
    			blue,
    			alpha
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glBlendEquation(
    	int mode
    ) {
    	MethodHandle method = GLAD_GL_BLEND_EQUATION.get();
    	try {
    		 method.invokeExact(
    			mode
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glGenQueries(
    	int n,
    	MemorySegment ids
    ) {
    	MethodHandle method = GLAD_GL_GEN_QUERIES.get();
    	try {
    		 method.invokeExact(
    			n,
    			ids
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGenQueries].
    public static void glGenQueries(
    	int n,
    	NativeIntArray ids
    ) {
    	glGenQueries(
    		n,
    		ids.memorySegment()
    	);
    }
    
    public static void glDeleteQueries(
    	int n,
    	MemorySegment ids
    ) {
    	MethodHandle method = GLAD_GL_DELETE_QUERIES.get();
    	try {
    		 method.invokeExact(
    			n,
    			ids
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glDeleteQueries].
    public static void glDeleteQueries(
    	int n,
    	NativeIntArray ids
    ) {
    	glDeleteQueries(
    		n,
    		ids.memorySegment()
    	);
    }
    
    public static byte glIsQuery(
    	int id
    ) {
    	MethodHandle method = GLAD_GL_IS_QUERY.get();
    	try {
    		return (byte) method.invokeExact(
    			id
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glBeginQuery(
    	int target,
    	int id
    ) {
    	MethodHandle method = GLAD_GL_BEGIN_QUERY.get();
    	try {
    		 method.invokeExact(
    			target,
    			id
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glEndQuery(
    	int target
    ) {
    	MethodHandle method = GLAD_GL_END_QUERY.get();
    	try {
    		 method.invokeExact(
    			target
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glGetQueryiv(
    	int target,
    	int pname,
    	MemorySegment params
    ) {
    	MethodHandle method = GLAD_GL_GET_QUERYIV.get();
    	try {
    		 method.invokeExact(
    			target,
    			pname,
    			params
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetQueryiv].
    public static void glGetQueryiv(
    	int target,
    	int pname,
    	NativeIntArray params
    ) {
    	glGetQueryiv(
    		target,
    		pname,
    		params.memorySegment()
    	);
    }
    
    public static void glGetQueryObjectiv(
    	int id,
    	int pname,
    	MemorySegment params
    ) {
    	MethodHandle method = GLAD_GL_GET_QUERY_OBJECTIV.get();
    	try {
    		 method.invokeExact(
    			id,
    			pname,
    			params
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetQueryObjectiv].
    public static void glGetQueryObjectiv(
    	int id,
    	int pname,
    	NativeIntArray params
    ) {
    	glGetQueryObjectiv(
    		id,
    		pname,
    		params.memorySegment()
    	);
    }
    
    public static void glGetQueryObjectuiv(
    	int id,
    	int pname,
    	MemorySegment params
    ) {
    	MethodHandle method = GLAD_GL_GET_QUERY_OBJECTUIV.get();
    	try {
    		 method.invokeExact(
    			id,
    			pname,
    			params
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetQueryObjectuiv].
    public static void glGetQueryObjectuiv(
    	int id,
    	int pname,
    	NativeIntArray params
    ) {
    	glGetQueryObjectuiv(
    		id,
    		pname,
    		params.memorySegment()
    	);
    }
    
    public static void glBindBuffer(
    	int target,
    	int buffer
    ) {
    	MethodHandle method = GLAD_GL_BIND_BUFFER.get();
    	try {
    		 method.invokeExact(
    			target,
    			buffer
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glDeleteBuffers(
    	int n,
    	MemorySegment buffers
    ) {
    	MethodHandle method = GLAD_GL_DELETE_BUFFERS.get();
    	try {
    		 method.invokeExact(
    			n,
    			buffers
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glDeleteBuffers].
    public static void glDeleteBuffers(
    	int n,
    	NativeIntArray buffers
    ) {
    	glDeleteBuffers(
    		n,
    		buffers.memorySegment()
    	);
    }
    
    public static void glGenBuffers(
    	int n,
    	MemorySegment buffers
    ) {
    	MethodHandle method = GLAD_GL_GEN_BUFFERS.get();
    	try {
    		 method.invokeExact(
    			n,
    			buffers
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGenBuffers].
    public static void glGenBuffers(
    	int n,
    	NativeIntArray buffers
    ) {
    	glGenBuffers(
    		n,
    		buffers.memorySegment()
    	);
    }
    
    public static byte glIsBuffer(
    	int buffer
    ) {
    	MethodHandle method = GLAD_GL_IS_BUFFER.get();
    	try {
    		return (byte) method.invokeExact(
    			buffer
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glBufferData(
    	int target,
    	long size,
    	MemorySegment data,
    	int usage
    ) {
    	MethodHandle method = GLAD_GL_BUFFER_DATA.get();
    	try {
    		 method.invokeExact(
    			target,
    			size,
    			data,
    			usage
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glBufferSubData(
    	int target,
    	long offset,
    	long size,
    	MemorySegment data
    ) {
    	MethodHandle method = GLAD_GL_BUFFER_SUB_DATA.get();
    	try {
    		 method.invokeExact(
    			target,
    			offset,
    			size,
    			data
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glGetBufferSubData(
    	int target,
    	long offset,
    	long size,
    	MemorySegment data
    ) {
    	MethodHandle method = GLAD_GL_GET_BUFFER_SUB_DATA.get();
    	try {
    		 method.invokeExact(
    			target,
    			offset,
    			size,
    			data
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment glMapBuffer(
    	int target,
    	int access
    ) {
    	MethodHandle method = GLAD_GL_MAP_BUFFER.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			target,
    			access
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static byte glUnmapBuffer(
    	int target
    ) {
    	MethodHandle method = GLAD_GL_UNMAP_BUFFER.get();
    	try {
    		return (byte) method.invokeExact(
    			target
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glGetBufferParameteriv(
    	int target,
    	int pname,
    	MemorySegment params
    ) {
    	MethodHandle method = GLAD_GL_GET_BUFFER_PARAMETERIV.get();
    	try {
    		 method.invokeExact(
    			target,
    			pname,
    			params
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetBufferParameteriv].
    public static void glGetBufferParameteriv(
    	int target,
    	int pname,
    	NativeIntArray params
    ) {
    	glGetBufferParameteriv(
    		target,
    		pname,
    		params.memorySegment()
    	);
    }
    
    public static void glGetBufferPointerv(
    	int target,
    	int pname,
    	MemorySegment params
    ) {
    	MethodHandle method = GLAD_GL_GET_BUFFER_POINTERV.get();
    	try {
    		 method.invokeExact(
    			target,
    			pname,
    			params
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetBufferPointerv].
    public static void glGetBufferPointerv(
    	int target,
    	int pname,
    	NativePointerArray params
    ) {
    	glGetBufferPointerv(
    		target,
    		pname,
    		params.memorySegment()
    	);
    }
    
    public static void glBlendEquationSeparate(
    	int modeRGB,
    	int modeAlpha
    ) {
    	MethodHandle method = GLAD_GL_BLEND_EQUATION_SEPARATE.get();
    	try {
    		 method.invokeExact(
    			modeRGB,
    			modeAlpha
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glDrawBuffers(
    	int n,
    	MemorySegment bufs
    ) {
    	MethodHandle method = GLAD_GL_DRAW_BUFFERS.get();
    	try {
    		 method.invokeExact(
    			n,
    			bufs
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glDrawBuffers].
    public static void glDrawBuffers(
    	int n,
    	NativeIntArray bufs
    ) {
    	glDrawBuffers(
    		n,
    		bufs.memorySegment()
    	);
    }
    
    public static void glStencilOpSeparate(
    	int face,
    	int sfail,
    	int dpfail,
    	int dppass
    ) {
    	MethodHandle method = GLAD_GL_STENCIL_OP_SEPARATE.get();
    	try {
    		 method.invokeExact(
    			face,
    			sfail,
    			dpfail,
    			dppass
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glStencilFuncSeparate(
    	int face,
    	int func,
    	int ref,
    	int mask
    ) {
    	MethodHandle method = GLAD_GL_STENCIL_FUNC_SEPARATE.get();
    	try {
    		 method.invokeExact(
    			face,
    			func,
    			ref,
    			mask
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glStencilMaskSeparate(
    	int face,
    	int mask
    ) {
    	MethodHandle method = GLAD_GL_STENCIL_MASK_SEPARATE.get();
    	try {
    		 method.invokeExact(
    			face,
    			mask
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glAttachShader(
    	int program,
    	int shader
    ) {
    	MethodHandle method = GLAD_GL_ATTACH_SHADER.get();
    	try {
    		 method.invokeExact(
    			program,
    			shader
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glBindAttribLocation(
    	int program,
    	int index,
    	MemorySegment name
    ) {
    	MethodHandle method = GLAD_GL_BIND_ATTRIB_LOCATION.get();
    	try {
    		 method.invokeExact(
    			program,
    			index,
    			name
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glBindAttribLocation].
    public static void glBindAttribLocation(
    	int program,
    	int index,
    	String name
    ) {
    	try (Arena arena = MemoryStack.stackPush()) {
    		glBindAttribLocation(
    			program,
    			index,
    			arena.allocateFrom(name)
    		);
    	}
    }
    
    public static void glCompileShader(
    	int shader
    ) {
    	MethodHandle method = GLAD_GL_COMPILE_SHADER.get();
    	try {
    		 method.invokeExact(
    			shader
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static int glCreateProgram() {
    	MethodHandle method = GLAD_GL_CREATE_PROGRAM.get();
    	try {
    		return (int) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static int glCreateShader(
    	int type
    ) {
    	MethodHandle method = GLAD_GL_CREATE_SHADER.get();
    	try {
    		return (int) method.invokeExact(
    			type
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glDeleteProgram(
    	int program
    ) {
    	MethodHandle method = GLAD_GL_DELETE_PROGRAM.get();
    	try {
    		 method.invokeExact(
    			program
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glDeleteShader(
    	int shader
    ) {
    	MethodHandle method = GLAD_GL_DELETE_SHADER.get();
    	try {
    		 method.invokeExact(
    			shader
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glDetachShader(
    	int program,
    	int shader
    ) {
    	MethodHandle method = GLAD_GL_DETACH_SHADER.get();
    	try {
    		 method.invokeExact(
    			program,
    			shader
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glDisableVertexAttribArray(
    	int index
    ) {
    	MethodHandle method = GLAD_GL_DISABLE_VERTEX_ATTRIB_ARRAY.get();
    	try {
    		 method.invokeExact(
    			index
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glEnableVertexAttribArray(
    	int index
    ) {
    	MethodHandle method = GLAD_GL_ENABLE_VERTEX_ATTRIB_ARRAY.get();
    	try {
    		 method.invokeExact(
    			index
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glGetActiveAttrib(
    	int program,
    	int index,
    	int bufSize,
    	MemorySegment length,
    	MemorySegment size,
    	MemorySegment type,
    	MemorySegment name
    ) {
    	MethodHandle method = GLAD_GL_GET_ACTIVE_ATTRIB.get();
    	try {
    		 method.invokeExact(
    			program,
    			index,
    			bufSize,
    			length,
    			size,
    			type,
    			name
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetActiveAttrib].
    public static void glGetActiveAttrib(
    	int program,
    	int index,
    	int bufSize,
    	@Nullable NativeIntArray length,
    	NativeIntArray size,
    	NativeIntArray type,
    	NativeByteArray name
    ) {
    	glGetActiveAttrib(
    		program,
    		index,
    		bufSize,
    		length == null ? MemorySegment.NULL : length.memorySegment(),
    		size.memorySegment(),
    		type.memorySegment(),
    		name.memorySegment()
    	);
    }
    
    public static void glGetActiveUniform(
    	int program,
    	int index,
    	int bufSize,
    	MemorySegment length,
    	MemorySegment size,
    	MemorySegment type,
    	MemorySegment name
    ) {
    	MethodHandle method = GLAD_GL_GET_ACTIVE_UNIFORM.get();
    	try {
    		 method.invokeExact(
    			program,
    			index,
    			bufSize,
    			length,
    			size,
    			type,
    			name
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetActiveUniform].
    public static void glGetActiveUniform(
    	int program,
    	int index,
    	int bufSize,
    	@Nullable NativeIntArray length,
    	NativeIntArray size,
    	NativeIntArray type,
    	NativeByteArray name
    ) {
    	glGetActiveUniform(
    		program,
    		index,
    		bufSize,
    		length == null ? MemorySegment.NULL : length.memorySegment(),
    		size.memorySegment(),
    		type.memorySegment(),
    		name.memorySegment()
    	);
    }
    
    public static void glGetAttachedShaders(
    	int program,
    	int maxCount,
    	MemorySegment count,
    	MemorySegment shaders
    ) {
    	MethodHandle method = GLAD_GL_GET_ATTACHED_SHADERS.get();
    	try {
    		 method.invokeExact(
    			program,
    			maxCount,
    			count,
    			shaders
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetAttachedShaders].
    public static void glGetAttachedShaders(
    	int program,
    	int maxCount,
    	NativeIntArray count,
    	NativeIntArray shaders
    ) {
    	glGetAttachedShaders(
    		program,
    		maxCount,
    		count.memorySegment(),
    		shaders.memorySegment()
    	);
    }
    
    public static int glGetAttribLocation(
    	int program,
    	MemorySegment name
    ) {
    	MethodHandle method = GLAD_GL_GET_ATTRIB_LOCATION.get();
    	try {
    		return (int) method.invokeExact(
    			program,
    			name
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetAttribLocation].
    public static int glGetAttribLocation(
    	int program,
    	String name
    ) {
    	try (Arena arena = MemoryStack.stackPush()) {
    		return glGetAttribLocation(
    			program,
    			arena.allocateFrom(name)
    		);
    	}
    }
    
    public static void glGetProgramiv(
    	int program,
    	int pname,
    	MemorySegment params
    ) {
    	MethodHandle method = GLAD_GL_GET_PROGRAMIV.get();
    	try {
    		 method.invokeExact(
    			program,
    			pname,
    			params
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetProgramiv].
    public static void glGetProgramiv(
    	int program,
    	int pname,
    	NativeIntArray params
    ) {
    	glGetProgramiv(
    		program,
    		pname,
    		params.memorySegment()
    	);
    }
    
    public static void glGetProgramInfoLog(
    	int program,
    	int bufSize,
    	MemorySegment length,
    	MemorySegment infoLog
    ) {
    	MethodHandle method = GLAD_GL_GET_PROGRAM_INFO_LOG.get();
    	try {
    		 method.invokeExact(
    			program,
    			bufSize,
    			length,
    			infoLog
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetProgramInfoLog].
    public static void glGetProgramInfoLog(
    	int program,
    	int bufSize,
    	@Nullable NativeIntArray length,
    	NativeByteArray infoLog
    ) {
    	glGetProgramInfoLog(
    		program,
    		bufSize,
    		length == null ? MemorySegment.NULL : length.memorySegment(),
    		infoLog.memorySegment()
    	);
    }
    
    public static void glGetShaderiv(
    	int shader,
    	int pname,
    	MemorySegment params
    ) {
    	MethodHandle method = GLAD_GL_GET_SHADERIV.get();
    	try {
    		 method.invokeExact(
    			shader,
    			pname,
    			params
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetShaderiv].
    public static void glGetShaderiv(
    	int shader,
    	int pname,
    	NativeIntArray params
    ) {
    	glGetShaderiv(
    		shader,
    		pname,
    		params.memorySegment()
    	);
    }
    
    public static void glGetShaderInfoLog(
    	int shader,
    	int bufSize,
    	MemorySegment length,
    	MemorySegment infoLog
    ) {
    	MethodHandle method = GLAD_GL_GET_SHADER_INFO_LOG.get();
    	try {
    		 method.invokeExact(
    			shader,
    			bufSize,
    			length,
    			infoLog
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetShaderInfoLog].
    public static void glGetShaderInfoLog(
    	int shader,
    	int bufSize,
    	@Nullable NativeIntArray length,
    	NativeByteArray infoLog
    ) {
    	glGetShaderInfoLog(
    		shader,
    		bufSize,
    		length == null ? MemorySegment.NULL : length.memorySegment(),
    		infoLog.memorySegment()
    	);
    }
    
    public static void glGetShaderSource(
    	int shader,
    	int bufSize,
    	MemorySegment length,
    	MemorySegment source
    ) {
    	MethodHandle method = GLAD_GL_GET_SHADER_SOURCE.get();
    	try {
    		 method.invokeExact(
    			shader,
    			bufSize,
    			length,
    			source
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetShaderSource].
    public static void glGetShaderSource(
    	int shader,
    	int bufSize,
    	@Nullable NativeIntArray length,
    	NativeByteArray source
    ) {
    	glGetShaderSource(
    		shader,
    		bufSize,
    		length == null ? MemorySegment.NULL : length.memorySegment(),
    		source.memorySegment()
    	);
    }
    
    public static int glGetUniformLocation(
    	int program,
    	MemorySegment name
    ) {
    	MethodHandle method = GLAD_GL_GET_UNIFORM_LOCATION.get();
    	try {
    		return (int) method.invokeExact(
    			program,
    			name
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetUniformLocation].
    public static int glGetUniformLocation(
    	int program,
    	String name
    ) {
    	try (Arena arena = MemoryStack.stackPush()) {
    		return glGetUniformLocation(
    			program,
    			arena.allocateFrom(name)
    		);
    	}
    }
    
    public static void glGetUniformfv(
    	int program,
    	int location,
    	MemorySegment params
    ) {
    	MethodHandle method = GLAD_GL_GET_UNIFORMFV.get();
    	try {
    		 method.invokeExact(
    			program,
    			location,
    			params
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetUniformfv].
    public static void glGetUniformfv(
    	int program,
    	int location,
    	NativeFloatArray params
    ) {
    	glGetUniformfv(
    		program,
    		location,
    		params.memorySegment()
    	);
    }
    
    public static void glGetUniformiv(
    	int program,
    	int location,
    	MemorySegment params
    ) {
    	MethodHandle method = GLAD_GL_GET_UNIFORMIV.get();
    	try {
    		 method.invokeExact(
    			program,
    			location,
    			params
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetUniformiv].
    public static void glGetUniformiv(
    	int program,
    	int location,
    	NativeIntArray params
    ) {
    	glGetUniformiv(
    		program,
    		location,
    		params.memorySegment()
    	);
    }
    
    public static void glGetVertexAttribdv(
    	int index,
    	int pname,
    	MemorySegment params
    ) {
    	MethodHandle method = GLAD_GL_GET_VERTEX_ATTRIBDV.get();
    	try {
    		 method.invokeExact(
    			index,
    			pname,
    			params
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetVertexAttribdv].
    public static void glGetVertexAttribdv(
    	int index,
    	int pname,
    	NativeDoubleArray params
    ) {
    	glGetVertexAttribdv(
    		index,
    		pname,
    		params.memorySegment()
    	);
    }
    
    public static void glGetVertexAttribfv(
    	int index,
    	int pname,
    	MemorySegment params
    ) {
    	MethodHandle method = GLAD_GL_GET_VERTEX_ATTRIBFV.get();
    	try {
    		 method.invokeExact(
    			index,
    			pname,
    			params
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetVertexAttribfv].
    public static void glGetVertexAttribfv(
    	int index,
    	int pname,
    	NativeFloatArray params
    ) {
    	glGetVertexAttribfv(
    		index,
    		pname,
    		params.memorySegment()
    	);
    }
    
    public static void glGetVertexAttribiv(
    	int index,
    	int pname,
    	MemorySegment params
    ) {
    	MethodHandle method = GLAD_GL_GET_VERTEX_ATTRIBIV.get();
    	try {
    		 method.invokeExact(
    			index,
    			pname,
    			params
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetVertexAttribiv].
    public static void glGetVertexAttribiv(
    	int index,
    	int pname,
    	NativeIntArray params
    ) {
    	glGetVertexAttribiv(
    		index,
    		pname,
    		params.memorySegment()
    	);
    }
    
    public static void glGetVertexAttribPointerv(
    	int index,
    	int pname,
    	MemorySegment pointer
    ) {
    	MethodHandle method = GLAD_GL_GET_VERTEX_ATTRIB_POINTERV.get();
    	try {
    		 method.invokeExact(
    			index,
    			pname,
    			pointer
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetVertexAttribPointerv].
    public static void glGetVertexAttribPointerv(
    	int index,
    	int pname,
    	NativePointerArray pointer
    ) {
    	glGetVertexAttribPointerv(
    		index,
    		pname,
    		pointer.memorySegment()
    	);
    }
    
    public static byte glIsProgram(
    	int program
    ) {
    	MethodHandle method = GLAD_GL_IS_PROGRAM.get();
    	try {
    		return (byte) method.invokeExact(
    			program
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static byte glIsShader(
    	int shader
    ) {
    	MethodHandle method = GLAD_GL_IS_SHADER.get();
    	try {
    		return (byte) method.invokeExact(
    			shader
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glLinkProgram(
    	int program
    ) {
    	MethodHandle method = GLAD_GL_LINK_PROGRAM.get();
    	try {
    		 method.invokeExact(
    			program
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glShaderSource(
    	int shader,
    	int count,
    	MemorySegment string,
    	MemorySegment length
    ) {
    	MethodHandle method = GLAD_GL_SHADER_SOURCE.get();
    	try {
    		 method.invokeExact(
    			shader,
    			count,
    			string,
    			length
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glShaderSource].
    public static void glShaderSource(
    	int shader,
    	int count,
    	NativePointerArray string,
    	@Nullable NativeIntArray length
    ) {
    	glShaderSource(
    		shader,
    		count,
    		string.memorySegment(),
    		length == null ? MemorySegment.NULL : length.memorySegment()
    	);
    }
    
    public static void glUseProgram(
    	int program
    ) {
    	MethodHandle method = GLAD_GL_USE_PROGRAM.get();
    	try {
    		 method.invokeExact(
    			program
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glUniform1f(
    	int location,
    	float v0
    ) {
    	MethodHandle method = GLAD_GL_UNIFORM1F.get();
    	try {
    		 method.invokeExact(
    			location,
    			v0
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glUniform2f(
    	int location,
    	float v0,
    	float v1
    ) {
    	MethodHandle method = GLAD_GL_UNIFORM2F.get();
    	try {
    		 method.invokeExact(
    			location,
    			v0,
    			v1
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glUniform3f(
    	int location,
    	float v0,
    	float v1,
    	float v2
    ) {
    	MethodHandle method = GLAD_GL_UNIFORM3F.get();
    	try {
    		 method.invokeExact(
    			location,
    			v0,
    			v1,
    			v2
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glUniform4f(
    	int location,
    	float v0,
    	float v1,
    	float v2,
    	float v3
    ) {
    	MethodHandle method = GLAD_GL_UNIFORM4F.get();
    	try {
    		 method.invokeExact(
    			location,
    			v0,
    			v1,
    			v2,
    			v3
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glUniform1i(
    	int location,
    	int v0
    ) {
    	MethodHandle method = GLAD_GL_UNIFORM1I.get();
    	try {
    		 method.invokeExact(
    			location,
    			v0
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glUniform2i(
    	int location,
    	int v0,
    	int v1
    ) {
    	MethodHandle method = GLAD_GL_UNIFORM2I.get();
    	try {
    		 method.invokeExact(
    			location,
    			v0,
    			v1
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glUniform3i(
    	int location,
    	int v0,
    	int v1,
    	int v2
    ) {
    	MethodHandle method = GLAD_GL_UNIFORM3I.get();
    	try {
    		 method.invokeExact(
    			location,
    			v0,
    			v1,
    			v2
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glUniform4i(
    	int location,
    	int v0,
    	int v1,
    	int v2,
    	int v3
    ) {
    	MethodHandle method = GLAD_GL_UNIFORM4I.get();
    	try {
    		 method.invokeExact(
    			location,
    			v0,
    			v1,
    			v2,
    			v3
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glUniform1fv(
    	int location,
    	int count,
    	MemorySegment value
    ) {
    	MethodHandle method = GLAD_GL_UNIFORM1FV.get();
    	try {
    		 method.invokeExact(
    			location,
    			count,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glUniform1fv].
    public static void glUniform1fv(
    	int location,
    	int count,
    	NativeFloatArray value
    ) {
    	glUniform1fv(
    		location,
    		count,
    		value.memorySegment()
    	);
    }
    
    public static void glUniform2fv(
    	int location,
    	int count,
    	MemorySegment value
    ) {
    	MethodHandle method = GLAD_GL_UNIFORM2FV.get();
    	try {
    		 method.invokeExact(
    			location,
    			count,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glUniform2fv].
    public static void glUniform2fv(
    	int location,
    	int count,
    	NativeFloatArray value
    ) {
    	glUniform2fv(
    		location,
    		count,
    		value.memorySegment()
    	);
    }
    
    public static void glUniform3fv(
    	int location,
    	int count,
    	MemorySegment value
    ) {
    	MethodHandle method = GLAD_GL_UNIFORM3FV.get();
    	try {
    		 method.invokeExact(
    			location,
    			count,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glUniform3fv].
    public static void glUniform3fv(
    	int location,
    	int count,
    	NativeFloatArray value
    ) {
    	glUniform3fv(
    		location,
    		count,
    		value.memorySegment()
    	);
    }
    
    public static void glUniform4fv(
    	int location,
    	int count,
    	MemorySegment value
    ) {
    	MethodHandle method = GLAD_GL_UNIFORM4FV.get();
    	try {
    		 method.invokeExact(
    			location,
    			count,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glUniform4fv].
    public static void glUniform4fv(
    	int location,
    	int count,
    	NativeFloatArray value
    ) {
    	glUniform4fv(
    		location,
    		count,
    		value.memorySegment()
    	);
    }
    
    public static void glUniform1iv(
    	int location,
    	int count,
    	MemorySegment value
    ) {
    	MethodHandle method = GLAD_GL_UNIFORM1IV.get();
    	try {
    		 method.invokeExact(
    			location,
    			count,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glUniform1iv].
    public static void glUniform1iv(
    	int location,
    	int count,
    	NativeIntArray value
    ) {
    	glUniform1iv(
    		location,
    		count,
    		value.memorySegment()
    	);
    }
    
    public static void glUniform2iv(
    	int location,
    	int count,
    	MemorySegment value
    ) {
    	MethodHandle method = GLAD_GL_UNIFORM2IV.get();
    	try {
    		 method.invokeExact(
    			location,
    			count,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glUniform2iv].
    public static void glUniform2iv(
    	int location,
    	int count,
    	NativeIntArray value
    ) {
    	glUniform2iv(
    		location,
    		count,
    		value.memorySegment()
    	);
    }
    
    public static void glUniform3iv(
    	int location,
    	int count,
    	MemorySegment value
    ) {
    	MethodHandle method = GLAD_GL_UNIFORM3IV.get();
    	try {
    		 method.invokeExact(
    			location,
    			count,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glUniform3iv].
    public static void glUniform3iv(
    	int location,
    	int count,
    	NativeIntArray value
    ) {
    	glUniform3iv(
    		location,
    		count,
    		value.memorySegment()
    	);
    }
    
    public static void glUniform4iv(
    	int location,
    	int count,
    	MemorySegment value
    ) {
    	MethodHandle method = GLAD_GL_UNIFORM4IV.get();
    	try {
    		 method.invokeExact(
    			location,
    			count,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glUniform4iv].
    public static void glUniform4iv(
    	int location,
    	int count,
    	NativeIntArray value
    ) {
    	glUniform4iv(
    		location,
    		count,
    		value.memorySegment()
    	);
    }
    
    public static void glUniformMatrix2fv(
    	int location,
    	int count,
    	byte transpose,
    	MemorySegment value
    ) {
    	MethodHandle method = GLAD_GL_UNIFORM_MATRIX2FV.get();
    	try {
    		 method.invokeExact(
    			location,
    			count,
    			transpose,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glUniformMatrix2fv].
    public static void glUniformMatrix2fv(
    	int location,
    	int count,
    	byte transpose,
    	NativeFloatArray value
    ) {
    	glUniformMatrix2fv(
    		location,
    		count,
    		transpose,
    		value.memorySegment()
    	);
    }
    
    public static void glUniformMatrix3fv(
    	int location,
    	int count,
    	byte transpose,
    	MemorySegment value
    ) {
    	MethodHandle method = GLAD_GL_UNIFORM_MATRIX3FV.get();
    	try {
    		 method.invokeExact(
    			location,
    			count,
    			transpose,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glUniformMatrix3fv].
    public static void glUniformMatrix3fv(
    	int location,
    	int count,
    	byte transpose,
    	NativeFloatArray value
    ) {
    	glUniformMatrix3fv(
    		location,
    		count,
    		transpose,
    		value.memorySegment()
    	);
    }
    
    public static void glUniformMatrix4fv(
    	int location,
    	int count,
    	byte transpose,
    	MemorySegment value
    ) {
    	MethodHandle method = GLAD_GL_UNIFORM_MATRIX4FV.get();
    	try {
    		 method.invokeExact(
    			location,
    			count,
    			transpose,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glUniformMatrix4fv].
    public static void glUniformMatrix4fv(
    	int location,
    	int count,
    	byte transpose,
    	NativeFloatArray value
    ) {
    	glUniformMatrix4fv(
    		location,
    		count,
    		transpose,
    		value.memorySegment()
    	);
    }
    
    public static void glValidateProgram(
    	int program
    ) {
    	MethodHandle method = GLAD_GL_VALIDATE_PROGRAM.get();
    	try {
    		 method.invokeExact(
    			program
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glVertexAttrib1d(
    	int index,
    	double x
    ) {
    	MethodHandle method = GLAD_GL_VERTEX_ATTRIB1D.get();
    	try {
    		 method.invokeExact(
    			index,
    			x
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glVertexAttrib1dv(
    	int index,
    	MemorySegment v
    ) {
    	MethodHandle method = GLAD_GL_VERTEX_ATTRIB1DV.get();
    	try {
    		 method.invokeExact(
    			index,
    			v
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glVertexAttrib1dv].
    public static void glVertexAttrib1dv(
    	int index,
    	NativeDoubleArray v
    ) {
    	glVertexAttrib1dv(
    		index,
    		v.memorySegment()
    	);
    }
    
    public static void glVertexAttrib1f(
    	int index,
    	float x
    ) {
    	MethodHandle method = GLAD_GL_VERTEX_ATTRIB1F.get();
    	try {
    		 method.invokeExact(
    			index,
    			x
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glVertexAttrib1fv(
    	int index,
    	MemorySegment v
    ) {
    	MethodHandle method = GLAD_GL_VERTEX_ATTRIB1FV.get();
    	try {
    		 method.invokeExact(
    			index,
    			v
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glVertexAttrib1fv].
    public static void glVertexAttrib1fv(
    	int index,
    	NativeFloatArray v
    ) {
    	glVertexAttrib1fv(
    		index,
    		v.memorySegment()
    	);
    }
    
    public static void glVertexAttrib1s(
    	int index,
    	short x
    ) {
    	MethodHandle method = GLAD_GL_VERTEX_ATTRIB1S.get();
    	try {
    		 method.invokeExact(
    			index,
    			x
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glVertexAttrib1sv(
    	int index,
    	MemorySegment v
    ) {
    	MethodHandle method = GLAD_GL_VERTEX_ATTRIB1SV.get();
    	try {
    		 method.invokeExact(
    			index,
    			v
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glVertexAttrib1sv].
    public static void glVertexAttrib1sv(
    	int index,
    	NativeShortArray v
    ) {
    	glVertexAttrib1sv(
    		index,
    		v.memorySegment()
    	);
    }
    
    public static void glVertexAttrib2d(
    	int index,
    	double x,
    	double y
    ) {
    	MethodHandle method = GLAD_GL_VERTEX_ATTRIB2D.get();
    	try {
    		 method.invokeExact(
    			index,
    			x,
    			y
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glVertexAttrib2dv(
    	int index,
    	MemorySegment v
    ) {
    	MethodHandle method = GLAD_GL_VERTEX_ATTRIB2DV.get();
    	try {
    		 method.invokeExact(
    			index,
    			v
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glVertexAttrib2dv].
    public static void glVertexAttrib2dv(
    	int index,
    	NativeDoubleArray v
    ) {
    	glVertexAttrib2dv(
    		index,
    		v.memorySegment()
    	);
    }
    
    public static void glVertexAttrib2f(
    	int index,
    	float x,
    	float y
    ) {
    	MethodHandle method = GLAD_GL_VERTEX_ATTRIB2F.get();
    	try {
    		 method.invokeExact(
    			index,
    			x,
    			y
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glVertexAttrib2fv(
    	int index,
    	MemorySegment v
    ) {
    	MethodHandle method = GLAD_GL_VERTEX_ATTRIB2FV.get();
    	try {
    		 method.invokeExact(
    			index,
    			v
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glVertexAttrib2fv].
    public static void glVertexAttrib2fv(
    	int index,
    	NativeFloatArray v
    ) {
    	glVertexAttrib2fv(
    		index,
    		v.memorySegment()
    	);
    }
    
    public static void glVertexAttrib2s(
    	int index,
    	short x,
    	short y
    ) {
    	MethodHandle method = GLAD_GL_VERTEX_ATTRIB2S.get();
    	try {
    		 method.invokeExact(
    			index,
    			x,
    			y
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glVertexAttrib2sv(
    	int index,
    	MemorySegment v
    ) {
    	MethodHandle method = GLAD_GL_VERTEX_ATTRIB2SV.get();
    	try {
    		 method.invokeExact(
    			index,
    			v
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glVertexAttrib2sv].
    public static void glVertexAttrib2sv(
    	int index,
    	NativeShortArray v
    ) {
    	glVertexAttrib2sv(
    		index,
    		v.memorySegment()
    	);
    }
    
    public static void glVertexAttrib3d(
    	int index,
    	double x,
    	double y,
    	double z
    ) {
    	MethodHandle method = GLAD_GL_VERTEX_ATTRIB3D.get();
    	try {
    		 method.invokeExact(
    			index,
    			x,
    			y,
    			z
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glVertexAttrib3dv(
    	int index,
    	MemorySegment v
    ) {
    	MethodHandle method = GLAD_GL_VERTEX_ATTRIB3DV.get();
    	try {
    		 method.invokeExact(
    			index,
    			v
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glVertexAttrib3dv].
    public static void glVertexAttrib3dv(
    	int index,
    	NativeDoubleArray v
    ) {
    	glVertexAttrib3dv(
    		index,
    		v.memorySegment()
    	);
    }
    
    public static void glVertexAttrib3f(
    	int index,
    	float x,
    	float y,
    	float z
    ) {
    	MethodHandle method = GLAD_GL_VERTEX_ATTRIB3F.get();
    	try {
    		 method.invokeExact(
    			index,
    			x,
    			y,
    			z
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glVertexAttrib3fv(
    	int index,
    	MemorySegment v
    ) {
    	MethodHandle method = GLAD_GL_VERTEX_ATTRIB3FV.get();
    	try {
    		 method.invokeExact(
    			index,
    			v
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glVertexAttrib3fv].
    public static void glVertexAttrib3fv(
    	int index,
    	NativeFloatArray v
    ) {
    	glVertexAttrib3fv(
    		index,
    		v.memorySegment()
    	);
    }
    
    public static void glVertexAttrib3s(
    	int index,
    	short x,
    	short y,
    	short z
    ) {
    	MethodHandle method = GLAD_GL_VERTEX_ATTRIB3S.get();
    	try {
    		 method.invokeExact(
    			index,
    			x,
    			y,
    			z
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glVertexAttrib3sv(
    	int index,
    	MemorySegment v
    ) {
    	MethodHandle method = GLAD_GL_VERTEX_ATTRIB3SV.get();
    	try {
    		 method.invokeExact(
    			index,
    			v
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glVertexAttrib3sv].
    public static void glVertexAttrib3sv(
    	int index,
    	NativeShortArray v
    ) {
    	glVertexAttrib3sv(
    		index,
    		v.memorySegment()
    	);
    }
    
    public static void glVertexAttrib4Nbv(
    	int index,
    	MemorySegment v
    ) {
    	MethodHandle method = GLAD_GL_VERTEX_ATTRIB4_NBV.get();
    	try {
    		 method.invokeExact(
    			index,
    			v
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glVertexAttrib4Nbv].
    public static void glVertexAttrib4Nbv(
    	int index,
    	NativeByteArray v
    ) {
    	glVertexAttrib4Nbv(
    		index,
    		v.memorySegment()
    	);
    }
    
    public static void glVertexAttrib4Niv(
    	int index,
    	MemorySegment v
    ) {
    	MethodHandle method = GLAD_GL_VERTEX_ATTRIB4_NIV.get();
    	try {
    		 method.invokeExact(
    			index,
    			v
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glVertexAttrib4Niv].
    public static void glVertexAttrib4Niv(
    	int index,
    	NativeIntArray v
    ) {
    	glVertexAttrib4Niv(
    		index,
    		v.memorySegment()
    	);
    }
    
    public static void glVertexAttrib4Nsv(
    	int index,
    	MemorySegment v
    ) {
    	MethodHandle method = GLAD_GL_VERTEX_ATTRIB4_NSV.get();
    	try {
    		 method.invokeExact(
    			index,
    			v
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glVertexAttrib4Nsv].
    public static void glVertexAttrib4Nsv(
    	int index,
    	NativeShortArray v
    ) {
    	glVertexAttrib4Nsv(
    		index,
    		v.memorySegment()
    	);
    }
    
    public static void glVertexAttrib4Nub(
    	int index,
    	byte x,
    	byte y,
    	byte z,
    	byte w
    ) {
    	MethodHandle method = GLAD_GL_VERTEX_ATTRIB4_NUB.get();
    	try {
    		 method.invokeExact(
    			index,
    			x,
    			y,
    			z,
    			w
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glVertexAttrib4Nubv(
    	int index,
    	MemorySegment v
    ) {
    	MethodHandle method = GLAD_GL_VERTEX_ATTRIB4_NUBV.get();
    	try {
    		 method.invokeExact(
    			index,
    			v
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glVertexAttrib4Nubv].
    public static void glVertexAttrib4Nubv(
    	int index,
    	NativeByteArray v
    ) {
    	glVertexAttrib4Nubv(
    		index,
    		v.memorySegment()
    	);
    }
    
    public static void glVertexAttrib4Nuiv(
    	int index,
    	MemorySegment v
    ) {
    	MethodHandle method = GLAD_GL_VERTEX_ATTRIB4_NUIV.get();
    	try {
    		 method.invokeExact(
    			index,
    			v
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glVertexAttrib4Nuiv].
    public static void glVertexAttrib4Nuiv(
    	int index,
    	NativeIntArray v
    ) {
    	glVertexAttrib4Nuiv(
    		index,
    		v.memorySegment()
    	);
    }
    
    public static void glVertexAttrib4Nusv(
    	int index,
    	MemorySegment v
    ) {
    	MethodHandle method = GLAD_GL_VERTEX_ATTRIB4_NUSV.get();
    	try {
    		 method.invokeExact(
    			index,
    			v
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glVertexAttrib4Nusv].
    public static void glVertexAttrib4Nusv(
    	int index,
    	NativeShortArray v
    ) {
    	glVertexAttrib4Nusv(
    		index,
    		v.memorySegment()
    	);
    }
    
    public static void glVertexAttrib4bv(
    	int index,
    	MemorySegment v
    ) {
    	MethodHandle method = GLAD_GL_VERTEX_ATTRIB4BV.get();
    	try {
    		 method.invokeExact(
    			index,
    			v
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glVertexAttrib4bv].
    public static void glVertexAttrib4bv(
    	int index,
    	NativeByteArray v
    ) {
    	glVertexAttrib4bv(
    		index,
    		v.memorySegment()
    	);
    }
    
    public static void glVertexAttrib4d(
    	int index,
    	double x,
    	double y,
    	double z,
    	double w
    ) {
    	MethodHandle method = GLAD_GL_VERTEX_ATTRIB4D.get();
    	try {
    		 method.invokeExact(
    			index,
    			x,
    			y,
    			z,
    			w
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glVertexAttrib4dv(
    	int index,
    	MemorySegment v
    ) {
    	MethodHandle method = GLAD_GL_VERTEX_ATTRIB4DV.get();
    	try {
    		 method.invokeExact(
    			index,
    			v
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glVertexAttrib4dv].
    public static void glVertexAttrib4dv(
    	int index,
    	NativeDoubleArray v
    ) {
    	glVertexAttrib4dv(
    		index,
    		v.memorySegment()
    	);
    }
    
    public static void glVertexAttrib4f(
    	int index,
    	float x,
    	float y,
    	float z,
    	float w
    ) {
    	MethodHandle method = GLAD_GL_VERTEX_ATTRIB4F.get();
    	try {
    		 method.invokeExact(
    			index,
    			x,
    			y,
    			z,
    			w
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glVertexAttrib4fv(
    	int index,
    	MemorySegment v
    ) {
    	MethodHandle method = GLAD_GL_VERTEX_ATTRIB4FV.get();
    	try {
    		 method.invokeExact(
    			index,
    			v
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glVertexAttrib4fv].
    public static void glVertexAttrib4fv(
    	int index,
    	NativeFloatArray v
    ) {
    	glVertexAttrib4fv(
    		index,
    		v.memorySegment()
    	);
    }
    
    public static void glVertexAttrib4iv(
    	int index,
    	MemorySegment v
    ) {
    	MethodHandle method = GLAD_GL_VERTEX_ATTRIB4IV.get();
    	try {
    		 method.invokeExact(
    			index,
    			v
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glVertexAttrib4iv].
    public static void glVertexAttrib4iv(
    	int index,
    	NativeIntArray v
    ) {
    	glVertexAttrib4iv(
    		index,
    		v.memorySegment()
    	);
    }
    
    public static void glVertexAttrib4s(
    	int index,
    	short x,
    	short y,
    	short z,
    	short w
    ) {
    	MethodHandle method = GLAD_GL_VERTEX_ATTRIB4S.get();
    	try {
    		 method.invokeExact(
    			index,
    			x,
    			y,
    			z,
    			w
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glVertexAttrib4sv(
    	int index,
    	MemorySegment v
    ) {
    	MethodHandle method = GLAD_GL_VERTEX_ATTRIB4SV.get();
    	try {
    		 method.invokeExact(
    			index,
    			v
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glVertexAttrib4sv].
    public static void glVertexAttrib4sv(
    	int index,
    	NativeShortArray v
    ) {
    	glVertexAttrib4sv(
    		index,
    		v.memorySegment()
    	);
    }
    
    public static void glVertexAttrib4ubv(
    	int index,
    	MemorySegment v
    ) {
    	MethodHandle method = GLAD_GL_VERTEX_ATTRIB4UBV.get();
    	try {
    		 method.invokeExact(
    			index,
    			v
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glVertexAttrib4ubv].
    public static void glVertexAttrib4ubv(
    	int index,
    	NativeByteArray v
    ) {
    	glVertexAttrib4ubv(
    		index,
    		v.memorySegment()
    	);
    }
    
    public static void glVertexAttrib4uiv(
    	int index,
    	MemorySegment v
    ) {
    	MethodHandle method = GLAD_GL_VERTEX_ATTRIB4UIV.get();
    	try {
    		 method.invokeExact(
    			index,
    			v
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glVertexAttrib4uiv].
    public static void glVertexAttrib4uiv(
    	int index,
    	NativeIntArray v
    ) {
    	glVertexAttrib4uiv(
    		index,
    		v.memorySegment()
    	);
    }
    
    public static void glVertexAttrib4usv(
    	int index,
    	MemorySegment v
    ) {
    	MethodHandle method = GLAD_GL_VERTEX_ATTRIB4USV.get();
    	try {
    		 method.invokeExact(
    			index,
    			v
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glVertexAttrib4usv].
    public static void glVertexAttrib4usv(
    	int index,
    	NativeShortArray v
    ) {
    	glVertexAttrib4usv(
    		index,
    		v.memorySegment()
    	);
    }
    
    public static void glVertexAttribPointer(
    	int index,
    	int size,
    	int type,
    	byte normalized,
    	int stride,
    	MemorySegment pointer
    ) {
    	MethodHandle method = GLAD_GL_VERTEX_ATTRIB_POINTER.get();
    	try {
    		 method.invokeExact(
    			index,
    			size,
    			type,
    			normalized,
    			stride,
    			pointer
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glUniformMatrix2x3fv(
    	int location,
    	int count,
    	byte transpose,
    	MemorySegment value
    ) {
    	MethodHandle method = GLAD_GL_UNIFORM_MATRIX2X3FV.get();
    	try {
    		 method.invokeExact(
    			location,
    			count,
    			transpose,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glUniformMatrix2x3fv].
    public static void glUniformMatrix2x3fv(
    	int location,
    	int count,
    	byte transpose,
    	NativeFloatArray value
    ) {
    	glUniformMatrix2x3fv(
    		location,
    		count,
    		transpose,
    		value.memorySegment()
    	);
    }
    
    public static void glUniformMatrix3x2fv(
    	int location,
    	int count,
    	byte transpose,
    	MemorySegment value
    ) {
    	MethodHandle method = GLAD_GL_UNIFORM_MATRIX3X2FV.get();
    	try {
    		 method.invokeExact(
    			location,
    			count,
    			transpose,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glUniformMatrix3x2fv].
    public static void glUniformMatrix3x2fv(
    	int location,
    	int count,
    	byte transpose,
    	NativeFloatArray value
    ) {
    	glUniformMatrix3x2fv(
    		location,
    		count,
    		transpose,
    		value.memorySegment()
    	);
    }
    
    public static void glUniformMatrix2x4fv(
    	int location,
    	int count,
    	byte transpose,
    	MemorySegment value
    ) {
    	MethodHandle method = GLAD_GL_UNIFORM_MATRIX2X4FV.get();
    	try {
    		 method.invokeExact(
    			location,
    			count,
    			transpose,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glUniformMatrix2x4fv].
    public static void glUniformMatrix2x4fv(
    	int location,
    	int count,
    	byte transpose,
    	NativeFloatArray value
    ) {
    	glUniformMatrix2x4fv(
    		location,
    		count,
    		transpose,
    		value.memorySegment()
    	);
    }
    
    public static void glUniformMatrix4x2fv(
    	int location,
    	int count,
    	byte transpose,
    	MemorySegment value
    ) {
    	MethodHandle method = GLAD_GL_UNIFORM_MATRIX4X2FV.get();
    	try {
    		 method.invokeExact(
    			location,
    			count,
    			transpose,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glUniformMatrix4x2fv].
    public static void glUniformMatrix4x2fv(
    	int location,
    	int count,
    	byte transpose,
    	NativeFloatArray value
    ) {
    	glUniformMatrix4x2fv(
    		location,
    		count,
    		transpose,
    		value.memorySegment()
    	);
    }
    
    public static void glUniformMatrix3x4fv(
    	int location,
    	int count,
    	byte transpose,
    	MemorySegment value
    ) {
    	MethodHandle method = GLAD_GL_UNIFORM_MATRIX3X4FV.get();
    	try {
    		 method.invokeExact(
    			location,
    			count,
    			transpose,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glUniformMatrix3x4fv].
    public static void glUniformMatrix3x4fv(
    	int location,
    	int count,
    	byte transpose,
    	NativeFloatArray value
    ) {
    	glUniformMatrix3x4fv(
    		location,
    		count,
    		transpose,
    		value.memorySegment()
    	);
    }
    
    public static void glUniformMatrix4x3fv(
    	int location,
    	int count,
    	byte transpose,
    	MemorySegment value
    ) {
    	MethodHandle method = GLAD_GL_UNIFORM_MATRIX4X3FV.get();
    	try {
    		 method.invokeExact(
    			location,
    			count,
    			transpose,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glUniformMatrix4x3fv].
    public static void glUniformMatrix4x3fv(
    	int location,
    	int count,
    	byte transpose,
    	NativeFloatArray value
    ) {
    	glUniformMatrix4x3fv(
    		location,
    		count,
    		transpose,
    		value.memorySegment()
    	);
    }
    
    public static void glColorMaski(
    	int index,
    	byte r,
    	byte g,
    	byte b,
    	byte a
    ) {
    	MethodHandle method = GLAD_GL_COLOR_MASKI.get();
    	try {
    		 method.invokeExact(
    			index,
    			r,
    			g,
    			b,
    			a
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glGetBooleani_v(
    	int target,
    	int index,
    	MemorySegment data
    ) {
    	MethodHandle method = GLAD_GL_GET_BOOLEANI_V.get();
    	try {
    		 method.invokeExact(
    			target,
    			index,
    			data
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetBooleani_v].
    public static void glGetBooleani_v(
    	int target,
    	int index,
    	NativeByteArray data
    ) {
    	glGetBooleani_v(
    		target,
    		index,
    		data.memorySegment()
    	);
    }
    
    public static void glGetIntegeri_v(
    	int target,
    	int index,
    	MemorySegment data
    ) {
    	MethodHandle method = GLAD_GL_GET_INTEGERI_V.get();
    	try {
    		 method.invokeExact(
    			target,
    			index,
    			data
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetIntegeri_v].
    public static void glGetIntegeri_v(
    	int target,
    	int index,
    	NativeIntArray data
    ) {
    	glGetIntegeri_v(
    		target,
    		index,
    		data.memorySegment()
    	);
    }
    
    public static void glEnablei(
    	int target,
    	int index
    ) {
    	MethodHandle method = GLAD_GL_ENABLEI.get();
    	try {
    		 method.invokeExact(
    			target,
    			index
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glDisablei(
    	int target,
    	int index
    ) {
    	MethodHandle method = GLAD_GL_DISABLEI.get();
    	try {
    		 method.invokeExact(
    			target,
    			index
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static byte glIsEnabledi(
    	int target,
    	int index
    ) {
    	MethodHandle method = GLAD_GL_IS_ENABLEDI.get();
    	try {
    		return (byte) method.invokeExact(
    			target,
    			index
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glBeginTransformFeedback(
    	int primitiveMode
    ) {
    	MethodHandle method = GLAD_GL_BEGIN_TRANSFORM_FEEDBACK.get();
    	try {
    		 method.invokeExact(
    			primitiveMode
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glEndTransformFeedback() {
    	MethodHandle method = GLAD_GL_END_TRANSFORM_FEEDBACK.get();
    	try {
    		 method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glBindBufferRange(
    	int target,
    	int index,
    	int buffer,
    	long offset,
    	long size
    ) {
    	MethodHandle method = GLAD_GL_BIND_BUFFER_RANGE.get();
    	try {
    		 method.invokeExact(
    			target,
    			index,
    			buffer,
    			offset,
    			size
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glBindBufferBase(
    	int target,
    	int index,
    	int buffer
    ) {
    	MethodHandle method = GLAD_GL_BIND_BUFFER_BASE.get();
    	try {
    		 method.invokeExact(
    			target,
    			index,
    			buffer
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glTransformFeedbackVaryings(
    	int program,
    	int count,
    	MemorySegment varyings,
    	int bufferMode
    ) {
    	MethodHandle method = GLAD_GL_TRANSFORM_FEEDBACK_VARYINGS.get();
    	try {
    		 method.invokeExact(
    			program,
    			count,
    			varyings,
    			bufferMode
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glTransformFeedbackVaryings].
    public static void glTransformFeedbackVaryings(
    	int program,
    	int count,
    	NativePointerArray varyings,
    	int bufferMode
    ) {
    	glTransformFeedbackVaryings(
    		program,
    		count,
    		varyings.memorySegment(),
    		bufferMode
    	);
    }
    
    public static void glGetTransformFeedbackVarying(
    	int program,
    	int index,
    	int bufSize,
    	MemorySegment length,
    	MemorySegment size,
    	MemorySegment type,
    	MemorySegment name
    ) {
    	MethodHandle method = GLAD_GL_GET_TRANSFORM_FEEDBACK_VARYING.get();
    	try {
    		 method.invokeExact(
    			program,
    			index,
    			bufSize,
    			length,
    			size,
    			type,
    			name
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetTransformFeedbackVarying].
    public static void glGetTransformFeedbackVarying(
    	int program,
    	int index,
    	int bufSize,
    	@Nullable NativeIntArray length,
    	NativeIntArray size,
    	NativeIntArray type,
    	NativeByteArray name
    ) {
    	glGetTransformFeedbackVarying(
    		program,
    		index,
    		bufSize,
    		length == null ? MemorySegment.NULL : length.memorySegment(),
    		size.memorySegment(),
    		type.memorySegment(),
    		name.memorySegment()
    	);
    }
    
    public static void glClampColor(
    	int target,
    	int clamp
    ) {
    	MethodHandle method = GLAD_GL_CLAMP_COLOR.get();
    	try {
    		 method.invokeExact(
    			target,
    			clamp
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glBeginConditionalRender(
    	int id,
    	int mode
    ) {
    	MethodHandle method = GLAD_GL_BEGIN_CONDITIONAL_RENDER.get();
    	try {
    		 method.invokeExact(
    			id,
    			mode
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glEndConditionalRender() {
    	MethodHandle method = GLAD_GL_END_CONDITIONAL_RENDER.get();
    	try {
    		 method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glVertexAttribIPointer(
    	int index,
    	int size,
    	int type,
    	int stride,
    	MemorySegment pointer
    ) {
    	MethodHandle method = GLAD_GL_VERTEX_ATTRIB_IPOINTER.get();
    	try {
    		 method.invokeExact(
    			index,
    			size,
    			type,
    			stride,
    			pointer
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glGetVertexAttribIiv(
    	int index,
    	int pname,
    	MemorySegment params
    ) {
    	MethodHandle method = GLAD_GL_GET_VERTEX_ATTRIB_IIV.get();
    	try {
    		 method.invokeExact(
    			index,
    			pname,
    			params
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetVertexAttribIiv].
    public static void glGetVertexAttribIiv(
    	int index,
    	int pname,
    	NativeIntArray params
    ) {
    	glGetVertexAttribIiv(
    		index,
    		pname,
    		params.memorySegment()
    	);
    }
    
    public static void glGetVertexAttribIuiv(
    	int index,
    	int pname,
    	MemorySegment params
    ) {
    	MethodHandle method = GLAD_GL_GET_VERTEX_ATTRIB_IUIV.get();
    	try {
    		 method.invokeExact(
    			index,
    			pname,
    			params
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetVertexAttribIuiv].
    public static void glGetVertexAttribIuiv(
    	int index,
    	int pname,
    	NativeIntArray params
    ) {
    	glGetVertexAttribIuiv(
    		index,
    		pname,
    		params.memorySegment()
    	);
    }
    
    public static void glVertexAttribI1i(
    	int index,
    	int x
    ) {
    	MethodHandle method = GLAD_GL_VERTEX_ATTRIB_I1I.get();
    	try {
    		 method.invokeExact(
    			index,
    			x
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glVertexAttribI2i(
    	int index,
    	int x,
    	int y
    ) {
    	MethodHandle method = GLAD_GL_VERTEX_ATTRIB_I2I.get();
    	try {
    		 method.invokeExact(
    			index,
    			x,
    			y
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glVertexAttribI3i(
    	int index,
    	int x,
    	int y,
    	int z
    ) {
    	MethodHandle method = GLAD_GL_VERTEX_ATTRIB_I3I.get();
    	try {
    		 method.invokeExact(
    			index,
    			x,
    			y,
    			z
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glVertexAttribI4i(
    	int index,
    	int x,
    	int y,
    	int z,
    	int w
    ) {
    	MethodHandle method = GLAD_GL_VERTEX_ATTRIB_I4I.get();
    	try {
    		 method.invokeExact(
    			index,
    			x,
    			y,
    			z,
    			w
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glVertexAttribI1ui(
    	int index,
    	int x
    ) {
    	MethodHandle method = GLAD_GL_VERTEX_ATTRIB_I1UI.get();
    	try {
    		 method.invokeExact(
    			index,
    			x
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glVertexAttribI2ui(
    	int index,
    	int x,
    	int y
    ) {
    	MethodHandle method = GLAD_GL_VERTEX_ATTRIB_I2UI.get();
    	try {
    		 method.invokeExact(
    			index,
    			x,
    			y
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glVertexAttribI3ui(
    	int index,
    	int x,
    	int y,
    	int z
    ) {
    	MethodHandle method = GLAD_GL_VERTEX_ATTRIB_I3UI.get();
    	try {
    		 method.invokeExact(
    			index,
    			x,
    			y,
    			z
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glVertexAttribI4ui(
    	int index,
    	int x,
    	int y,
    	int z,
    	int w
    ) {
    	MethodHandle method = GLAD_GL_VERTEX_ATTRIB_I4UI.get();
    	try {
    		 method.invokeExact(
    			index,
    			x,
    			y,
    			z,
    			w
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glVertexAttribI1iv(
    	int index,
    	MemorySegment v
    ) {
    	MethodHandle method = GLAD_GL_VERTEX_ATTRIB_I1IV.get();
    	try {
    		 method.invokeExact(
    			index,
    			v
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glVertexAttribI1iv].
    public static void glVertexAttribI1iv(
    	int index,
    	NativeIntArray v
    ) {
    	glVertexAttribI1iv(
    		index,
    		v.memorySegment()
    	);
    }
    
    public static void glVertexAttribI2iv(
    	int index,
    	MemorySegment v
    ) {
    	MethodHandle method = GLAD_GL_VERTEX_ATTRIB_I2IV.get();
    	try {
    		 method.invokeExact(
    			index,
    			v
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glVertexAttribI2iv].
    public static void glVertexAttribI2iv(
    	int index,
    	NativeIntArray v
    ) {
    	glVertexAttribI2iv(
    		index,
    		v.memorySegment()
    	);
    }
    
    public static void glVertexAttribI3iv(
    	int index,
    	MemorySegment v
    ) {
    	MethodHandle method = GLAD_GL_VERTEX_ATTRIB_I3IV.get();
    	try {
    		 method.invokeExact(
    			index,
    			v
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glVertexAttribI3iv].
    public static void glVertexAttribI3iv(
    	int index,
    	NativeIntArray v
    ) {
    	glVertexAttribI3iv(
    		index,
    		v.memorySegment()
    	);
    }
    
    public static void glVertexAttribI4iv(
    	int index,
    	MemorySegment v
    ) {
    	MethodHandle method = GLAD_GL_VERTEX_ATTRIB_I4IV.get();
    	try {
    		 method.invokeExact(
    			index,
    			v
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glVertexAttribI4iv].
    public static void glVertexAttribI4iv(
    	int index,
    	NativeIntArray v
    ) {
    	glVertexAttribI4iv(
    		index,
    		v.memorySegment()
    	);
    }
    
    public static void glVertexAttribI1uiv(
    	int index,
    	MemorySegment v
    ) {
    	MethodHandle method = GLAD_GL_VERTEX_ATTRIB_I1UIV.get();
    	try {
    		 method.invokeExact(
    			index,
    			v
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glVertexAttribI1uiv].
    public static void glVertexAttribI1uiv(
    	int index,
    	NativeIntArray v
    ) {
    	glVertexAttribI1uiv(
    		index,
    		v.memorySegment()
    	);
    }
    
    public static void glVertexAttribI2uiv(
    	int index,
    	MemorySegment v
    ) {
    	MethodHandle method = GLAD_GL_VERTEX_ATTRIB_I2UIV.get();
    	try {
    		 method.invokeExact(
    			index,
    			v
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glVertexAttribI2uiv].
    public static void glVertexAttribI2uiv(
    	int index,
    	NativeIntArray v
    ) {
    	glVertexAttribI2uiv(
    		index,
    		v.memorySegment()
    	);
    }
    
    public static void glVertexAttribI3uiv(
    	int index,
    	MemorySegment v
    ) {
    	MethodHandle method = GLAD_GL_VERTEX_ATTRIB_I3UIV.get();
    	try {
    		 method.invokeExact(
    			index,
    			v
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glVertexAttribI3uiv].
    public static void glVertexAttribI3uiv(
    	int index,
    	NativeIntArray v
    ) {
    	glVertexAttribI3uiv(
    		index,
    		v.memorySegment()
    	);
    }
    
    public static void glVertexAttribI4uiv(
    	int index,
    	MemorySegment v
    ) {
    	MethodHandle method = GLAD_GL_VERTEX_ATTRIB_I4UIV.get();
    	try {
    		 method.invokeExact(
    			index,
    			v
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glVertexAttribI4uiv].
    public static void glVertexAttribI4uiv(
    	int index,
    	NativeIntArray v
    ) {
    	glVertexAttribI4uiv(
    		index,
    		v.memorySegment()
    	);
    }
    
    public static void glVertexAttribI4bv(
    	int index,
    	MemorySegment v
    ) {
    	MethodHandle method = GLAD_GL_VERTEX_ATTRIB_I4BV.get();
    	try {
    		 method.invokeExact(
    			index,
    			v
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glVertexAttribI4bv].
    public static void glVertexAttribI4bv(
    	int index,
    	NativeByteArray v
    ) {
    	glVertexAttribI4bv(
    		index,
    		v.memorySegment()
    	);
    }
    
    public static void glVertexAttribI4sv(
    	int index,
    	MemorySegment v
    ) {
    	MethodHandle method = GLAD_GL_VERTEX_ATTRIB_I4SV.get();
    	try {
    		 method.invokeExact(
    			index,
    			v
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glVertexAttribI4sv].
    public static void glVertexAttribI4sv(
    	int index,
    	NativeShortArray v
    ) {
    	glVertexAttribI4sv(
    		index,
    		v.memorySegment()
    	);
    }
    
    public static void glVertexAttribI4ubv(
    	int index,
    	MemorySegment v
    ) {
    	MethodHandle method = GLAD_GL_VERTEX_ATTRIB_I4UBV.get();
    	try {
    		 method.invokeExact(
    			index,
    			v
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glVertexAttribI4ubv].
    public static void glVertexAttribI4ubv(
    	int index,
    	NativeByteArray v
    ) {
    	glVertexAttribI4ubv(
    		index,
    		v.memorySegment()
    	);
    }
    
    public static void glVertexAttribI4usv(
    	int index,
    	MemorySegment v
    ) {
    	MethodHandle method = GLAD_GL_VERTEX_ATTRIB_I4USV.get();
    	try {
    		 method.invokeExact(
    			index,
    			v
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glVertexAttribI4usv].
    public static void glVertexAttribI4usv(
    	int index,
    	NativeShortArray v
    ) {
    	glVertexAttribI4usv(
    		index,
    		v.memorySegment()
    	);
    }
    
    public static void glGetUniformuiv(
    	int program,
    	int location,
    	MemorySegment params
    ) {
    	MethodHandle method = GLAD_GL_GET_UNIFORMUIV.get();
    	try {
    		 method.invokeExact(
    			program,
    			location,
    			params
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetUniformuiv].
    public static void glGetUniformuiv(
    	int program,
    	int location,
    	NativeIntArray params
    ) {
    	glGetUniformuiv(
    		program,
    		location,
    		params.memorySegment()
    	);
    }
    
    public static void glBindFragDataLocation(
    	int program,
    	int color,
    	MemorySegment name
    ) {
    	MethodHandle method = GLAD_GL_BIND_FRAG_DATA_LOCATION.get();
    	try {
    		 method.invokeExact(
    			program,
    			color,
    			name
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glBindFragDataLocation].
    public static void glBindFragDataLocation(
    	int program,
    	int color,
    	String name
    ) {
    	try (Arena arena = MemoryStack.stackPush()) {
    		glBindFragDataLocation(
    			program,
    			color,
    			arena.allocateFrom(name)
    		);
    	}
    }
    
    public static int glGetFragDataLocation(
    	int program,
    	MemorySegment name
    ) {
    	MethodHandle method = GLAD_GL_GET_FRAG_DATA_LOCATION.get();
    	try {
    		return (int) method.invokeExact(
    			program,
    			name
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetFragDataLocation].
    public static int glGetFragDataLocation(
    	int program,
    	String name
    ) {
    	try (Arena arena = MemoryStack.stackPush()) {
    		return glGetFragDataLocation(
    			program,
    			arena.allocateFrom(name)
    		);
    	}
    }
    
    public static void glUniform1ui(
    	int location,
    	int v0
    ) {
    	MethodHandle method = GLAD_GL_UNIFORM1UI.get();
    	try {
    		 method.invokeExact(
    			location,
    			v0
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glUniform2ui(
    	int location,
    	int v0,
    	int v1
    ) {
    	MethodHandle method = GLAD_GL_UNIFORM2UI.get();
    	try {
    		 method.invokeExact(
    			location,
    			v0,
    			v1
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glUniform3ui(
    	int location,
    	int v0,
    	int v1,
    	int v2
    ) {
    	MethodHandle method = GLAD_GL_UNIFORM3UI.get();
    	try {
    		 method.invokeExact(
    			location,
    			v0,
    			v1,
    			v2
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glUniform4ui(
    	int location,
    	int v0,
    	int v1,
    	int v2,
    	int v3
    ) {
    	MethodHandle method = GLAD_GL_UNIFORM4UI.get();
    	try {
    		 method.invokeExact(
    			location,
    			v0,
    			v1,
    			v2,
    			v3
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glUniform1uiv(
    	int location,
    	int count,
    	MemorySegment value
    ) {
    	MethodHandle method = GLAD_GL_UNIFORM1UIV.get();
    	try {
    		 method.invokeExact(
    			location,
    			count,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glUniform1uiv].
    public static void glUniform1uiv(
    	int location,
    	int count,
    	NativeIntArray value
    ) {
    	glUniform1uiv(
    		location,
    		count,
    		value.memorySegment()
    	);
    }
    
    public static void glUniform2uiv(
    	int location,
    	int count,
    	MemorySegment value
    ) {
    	MethodHandle method = GLAD_GL_UNIFORM2UIV.get();
    	try {
    		 method.invokeExact(
    			location,
    			count,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glUniform2uiv].
    public static void glUniform2uiv(
    	int location,
    	int count,
    	NativeIntArray value
    ) {
    	glUniform2uiv(
    		location,
    		count,
    		value.memorySegment()
    	);
    }
    
    public static void glUniform3uiv(
    	int location,
    	int count,
    	MemorySegment value
    ) {
    	MethodHandle method = GLAD_GL_UNIFORM3UIV.get();
    	try {
    		 method.invokeExact(
    			location,
    			count,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glUniform3uiv].
    public static void glUniform3uiv(
    	int location,
    	int count,
    	NativeIntArray value
    ) {
    	glUniform3uiv(
    		location,
    		count,
    		value.memorySegment()
    	);
    }
    
    public static void glUniform4uiv(
    	int location,
    	int count,
    	MemorySegment value
    ) {
    	MethodHandle method = GLAD_GL_UNIFORM4UIV.get();
    	try {
    		 method.invokeExact(
    			location,
    			count,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glUniform4uiv].
    public static void glUniform4uiv(
    	int location,
    	int count,
    	NativeIntArray value
    ) {
    	glUniform4uiv(
    		location,
    		count,
    		value.memorySegment()
    	);
    }
    
    public static void glTexParameterIiv(
    	int target,
    	int pname,
    	MemorySegment params
    ) {
    	MethodHandle method = GLAD_GL_TEX_PARAMETER_IIV.get();
    	try {
    		 method.invokeExact(
    			target,
    			pname,
    			params
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glTexParameterIiv].
    public static void glTexParameterIiv(
    	int target,
    	int pname,
    	NativeIntArray params
    ) {
    	glTexParameterIiv(
    		target,
    		pname,
    		params.memorySegment()
    	);
    }
    
    public static void glTexParameterIuiv(
    	int target,
    	int pname,
    	MemorySegment params
    ) {
    	MethodHandle method = GLAD_GL_TEX_PARAMETER_IUIV.get();
    	try {
    		 method.invokeExact(
    			target,
    			pname,
    			params
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glTexParameterIuiv].
    public static void glTexParameterIuiv(
    	int target,
    	int pname,
    	NativeIntArray params
    ) {
    	glTexParameterIuiv(
    		target,
    		pname,
    		params.memorySegment()
    	);
    }
    
    public static void glGetTexParameterIiv(
    	int target,
    	int pname,
    	MemorySegment params
    ) {
    	MethodHandle method = GLAD_GL_GET_TEX_PARAMETER_IIV.get();
    	try {
    		 method.invokeExact(
    			target,
    			pname,
    			params
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetTexParameterIiv].
    public static void glGetTexParameterIiv(
    	int target,
    	int pname,
    	NativeIntArray params
    ) {
    	glGetTexParameterIiv(
    		target,
    		pname,
    		params.memorySegment()
    	);
    }
    
    public static void glGetTexParameterIuiv(
    	int target,
    	int pname,
    	MemorySegment params
    ) {
    	MethodHandle method = GLAD_GL_GET_TEX_PARAMETER_IUIV.get();
    	try {
    		 method.invokeExact(
    			target,
    			pname,
    			params
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetTexParameterIuiv].
    public static void glGetTexParameterIuiv(
    	int target,
    	int pname,
    	NativeIntArray params
    ) {
    	glGetTexParameterIuiv(
    		target,
    		pname,
    		params.memorySegment()
    	);
    }
    
    public static void glClearBufferiv(
    	int buffer,
    	int drawbuffer,
    	MemorySegment value
    ) {
    	MethodHandle method = GLAD_GL_CLEAR_BUFFERIV.get();
    	try {
    		 method.invokeExact(
    			buffer,
    			drawbuffer,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glClearBufferiv].
    public static void glClearBufferiv(
    	int buffer,
    	int drawbuffer,
    	NativeIntArray value
    ) {
    	glClearBufferiv(
    		buffer,
    		drawbuffer,
    		value.memorySegment()
    	);
    }
    
    public static void glClearBufferuiv(
    	int buffer,
    	int drawbuffer,
    	MemorySegment value
    ) {
    	MethodHandle method = GLAD_GL_CLEAR_BUFFERUIV.get();
    	try {
    		 method.invokeExact(
    			buffer,
    			drawbuffer,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glClearBufferuiv].
    public static void glClearBufferuiv(
    	int buffer,
    	int drawbuffer,
    	NativeIntArray value
    ) {
    	glClearBufferuiv(
    		buffer,
    		drawbuffer,
    		value.memorySegment()
    	);
    }
    
    public static void glClearBufferfv(
    	int buffer,
    	int drawbuffer,
    	MemorySegment value
    ) {
    	MethodHandle method = GLAD_GL_CLEAR_BUFFERFV.get();
    	try {
    		 method.invokeExact(
    			buffer,
    			drawbuffer,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glClearBufferfv].
    public static void glClearBufferfv(
    	int buffer,
    	int drawbuffer,
    	NativeFloatArray value
    ) {
    	glClearBufferfv(
    		buffer,
    		drawbuffer,
    		value.memorySegment()
    	);
    }
    
    public static void glClearBufferfi(
    	int buffer,
    	int drawbuffer,
    	float depth,
    	int stencil
    ) {
    	MethodHandle method = GLAD_GL_CLEAR_BUFFERFI.get();
    	try {
    		 method.invokeExact(
    			buffer,
    			drawbuffer,
    			depth,
    			stencil
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment nglGetStringi(
    	int name,
    	int index
    ) {
    	MethodHandle method = GLAD_GL_GET_STRINGI.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			name,
    			index
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nglGetStringi].
    public static @Nullable String glGetStringi(
    	int name,
    	int index
    ) {
    	MemorySegment segment = nglGetStringi(
    		name,
    		index
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment.getString(0);
    }
    
    public static byte glIsRenderbuffer(
    	int renderbuffer
    ) {
    	MethodHandle method = GLAD_GL_IS_RENDERBUFFER.get();
    	try {
    		return (byte) method.invokeExact(
    			renderbuffer
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glBindRenderbuffer(
    	int target,
    	int renderbuffer
    ) {
    	MethodHandle method = GLAD_GL_BIND_RENDERBUFFER.get();
    	try {
    		 method.invokeExact(
    			target,
    			renderbuffer
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glDeleteRenderbuffers(
    	int n,
    	MemorySegment renderbuffers
    ) {
    	MethodHandle method = GLAD_GL_DELETE_RENDERBUFFERS.get();
    	try {
    		 method.invokeExact(
    			n,
    			renderbuffers
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glDeleteRenderbuffers].
    public static void glDeleteRenderbuffers(
    	int n,
    	NativeIntArray renderbuffers
    ) {
    	glDeleteRenderbuffers(
    		n,
    		renderbuffers.memorySegment()
    	);
    }
    
    public static void glGenRenderbuffers(
    	int n,
    	MemorySegment renderbuffers
    ) {
    	MethodHandle method = GLAD_GL_GEN_RENDERBUFFERS.get();
    	try {
    		 method.invokeExact(
    			n,
    			renderbuffers
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGenRenderbuffers].
    public static void glGenRenderbuffers(
    	int n,
    	NativeIntArray renderbuffers
    ) {
    	glGenRenderbuffers(
    		n,
    		renderbuffers.memorySegment()
    	);
    }
    
    public static void glRenderbufferStorage(
    	int target,
    	int internalformat,
    	int width,
    	int height
    ) {
    	MethodHandle method = GLAD_GL_RENDERBUFFER_STORAGE.get();
    	try {
    		 method.invokeExact(
    			target,
    			internalformat,
    			width,
    			height
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glGetRenderbufferParameteriv(
    	int target,
    	int pname,
    	MemorySegment params
    ) {
    	MethodHandle method = GLAD_GL_GET_RENDERBUFFER_PARAMETERIV.get();
    	try {
    		 method.invokeExact(
    			target,
    			pname,
    			params
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetRenderbufferParameteriv].
    public static void glGetRenderbufferParameteriv(
    	int target,
    	int pname,
    	NativeIntArray params
    ) {
    	glGetRenderbufferParameteriv(
    		target,
    		pname,
    		params.memorySegment()
    	);
    }
    
    public static byte glIsFramebuffer(
    	int framebuffer
    ) {
    	MethodHandle method = GLAD_GL_IS_FRAMEBUFFER.get();
    	try {
    		return (byte) method.invokeExact(
    			framebuffer
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glBindFramebuffer(
    	int target,
    	int framebuffer
    ) {
    	MethodHandle method = GLAD_GL_BIND_FRAMEBUFFER.get();
    	try {
    		 method.invokeExact(
    			target,
    			framebuffer
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glDeleteFramebuffers(
    	int n,
    	MemorySegment framebuffers
    ) {
    	MethodHandle method = GLAD_GL_DELETE_FRAMEBUFFERS.get();
    	try {
    		 method.invokeExact(
    			n,
    			framebuffers
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glDeleteFramebuffers].
    public static void glDeleteFramebuffers(
    	int n,
    	NativeIntArray framebuffers
    ) {
    	glDeleteFramebuffers(
    		n,
    		framebuffers.memorySegment()
    	);
    }
    
    public static void glGenFramebuffers(
    	int n,
    	MemorySegment framebuffers
    ) {
    	MethodHandle method = GLAD_GL_GEN_FRAMEBUFFERS.get();
    	try {
    		 method.invokeExact(
    			n,
    			framebuffers
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGenFramebuffers].
    public static void glGenFramebuffers(
    	int n,
    	NativeIntArray framebuffers
    ) {
    	glGenFramebuffers(
    		n,
    		framebuffers.memorySegment()
    	);
    }
    
    public static int glCheckFramebufferStatus(
    	int target
    ) {
    	MethodHandle method = GLAD_GL_CHECK_FRAMEBUFFER_STATUS.get();
    	try {
    		return (int) method.invokeExact(
    			target
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glFramebufferTexture1D(
    	int target,
    	int attachment,
    	int textarget,
    	int texture,
    	int level
    ) {
    	MethodHandle method = GLAD_GL_FRAMEBUFFER_TEXTURE1_D.get();
    	try {
    		 method.invokeExact(
    			target,
    			attachment,
    			textarget,
    			texture,
    			level
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glFramebufferTexture2D(
    	int target,
    	int attachment,
    	int textarget,
    	int texture,
    	int level
    ) {
    	MethodHandle method = GLAD_GL_FRAMEBUFFER_TEXTURE2_D.get();
    	try {
    		 method.invokeExact(
    			target,
    			attachment,
    			textarget,
    			texture,
    			level
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glFramebufferTexture3D(
    	int target,
    	int attachment,
    	int textarget,
    	int texture,
    	int level,
    	int zoffset
    ) {
    	MethodHandle method = GLAD_GL_FRAMEBUFFER_TEXTURE3_D.get();
    	try {
    		 method.invokeExact(
    			target,
    			attachment,
    			textarget,
    			texture,
    			level,
    			zoffset
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glFramebufferRenderbuffer(
    	int target,
    	int attachment,
    	int renderbuffertarget,
    	int renderbuffer
    ) {
    	MethodHandle method = GLAD_GL_FRAMEBUFFER_RENDERBUFFER.get();
    	try {
    		 method.invokeExact(
    			target,
    			attachment,
    			renderbuffertarget,
    			renderbuffer
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glGetFramebufferAttachmentParameteriv(
    	int target,
    	int attachment,
    	int pname,
    	MemorySegment params
    ) {
    	MethodHandle method = GLAD_GL_GET_FRAMEBUFFER_ATTACHMENT_PARAMETERIV.get();
    	try {
    		 method.invokeExact(
    			target,
    			attachment,
    			pname,
    			params
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetFramebufferAttachmentParameteriv].
    public static void glGetFramebufferAttachmentParameteriv(
    	int target,
    	int attachment,
    	int pname,
    	NativeIntArray params
    ) {
    	glGetFramebufferAttachmentParameteriv(
    		target,
    		attachment,
    		pname,
    		params.memorySegment()
    	);
    }
    
    public static void glGenerateMipmap(
    	int target
    ) {
    	MethodHandle method = GLAD_GL_GENERATE_MIPMAP.get();
    	try {
    		 method.invokeExact(
    			target
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glBlitFramebuffer(
    	int srcX0,
    	int srcY0,
    	int srcX1,
    	int srcY1,
    	int dstX0,
    	int dstY0,
    	int dstX1,
    	int dstY1,
    	int mask,
    	int filter
    ) {
    	MethodHandle method = GLAD_GL_BLIT_FRAMEBUFFER.get();
    	try {
    		 method.invokeExact(
    			srcX0,
    			srcY0,
    			srcX1,
    			srcY1,
    			dstX0,
    			dstY0,
    			dstX1,
    			dstY1,
    			mask,
    			filter
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glRenderbufferStorageMultisample(
    	int target,
    	int samples,
    	int internalformat,
    	int width,
    	int height
    ) {
    	MethodHandle method = GLAD_GL_RENDERBUFFER_STORAGE_MULTISAMPLE.get();
    	try {
    		 method.invokeExact(
    			target,
    			samples,
    			internalformat,
    			width,
    			height
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glFramebufferTextureLayer(
    	int target,
    	int attachment,
    	int texture,
    	int level,
    	int layer
    ) {
    	MethodHandle method = GLAD_GL_FRAMEBUFFER_TEXTURE_LAYER.get();
    	try {
    		 method.invokeExact(
    			target,
    			attachment,
    			texture,
    			level,
    			layer
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment glMapBufferRange(
    	int target,
    	long offset,
    	long length,
    	int access
    ) {
    	MethodHandle method = GLAD_GL_MAP_BUFFER_RANGE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			target,
    			offset,
    			length,
    			access
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glFlushMappedBufferRange(
    	int target,
    	long offset,
    	long length
    ) {
    	MethodHandle method = GLAD_GL_FLUSH_MAPPED_BUFFER_RANGE.get();
    	try {
    		 method.invokeExact(
    			target,
    			offset,
    			length
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glBindVertexArray(
    	int array
    ) {
    	MethodHandle method = GLAD_GL_BIND_VERTEX_ARRAY.get();
    	try {
    		 method.invokeExact(
    			array
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glDeleteVertexArrays(
    	int n,
    	MemorySegment arrays
    ) {
    	MethodHandle method = GLAD_GL_DELETE_VERTEX_ARRAYS.get();
    	try {
    		 method.invokeExact(
    			n,
    			arrays
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glDeleteVertexArrays].
    public static void glDeleteVertexArrays(
    	int n,
    	NativeIntArray arrays
    ) {
    	glDeleteVertexArrays(
    		n,
    		arrays.memorySegment()
    	);
    }
    
    public static void glGenVertexArrays(
    	int n,
    	MemorySegment arrays
    ) {
    	MethodHandle method = GLAD_GL_GEN_VERTEX_ARRAYS.get();
    	try {
    		 method.invokeExact(
    			n,
    			arrays
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGenVertexArrays].
    public static void glGenVertexArrays(
    	int n,
    	NativeIntArray arrays
    ) {
    	glGenVertexArrays(
    		n,
    		arrays.memorySegment()
    	);
    }
    
    public static byte glIsVertexArray(
    	int array
    ) {
    	MethodHandle method = GLAD_GL_IS_VERTEX_ARRAY.get();
    	try {
    		return (byte) method.invokeExact(
    			array
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glDrawArraysInstanced(
    	int mode,
    	int first,
    	int count,
    	int instancecount
    ) {
    	MethodHandle method = GLAD_GL_DRAW_ARRAYS_INSTANCED.get();
    	try {
    		 method.invokeExact(
    			mode,
    			first,
    			count,
    			instancecount
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glDrawElementsInstanced(
    	int mode,
    	int count,
    	int type,
    	MemorySegment indices,
    	int instancecount
    ) {
    	MethodHandle method = GLAD_GL_DRAW_ELEMENTS_INSTANCED.get();
    	try {
    		 method.invokeExact(
    			mode,
    			count,
    			type,
    			indices,
    			instancecount
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glTexBuffer(
    	int target,
    	int internalformat,
    	int buffer
    ) {
    	MethodHandle method = GLAD_GL_TEX_BUFFER.get();
    	try {
    		 method.invokeExact(
    			target,
    			internalformat,
    			buffer
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glPrimitiveRestartIndex(
    	int index
    ) {
    	MethodHandle method = GLAD_GL_PRIMITIVE_RESTART_INDEX.get();
    	try {
    		 method.invokeExact(
    			index
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glCopyBufferSubData(
    	int readTarget,
    	int writeTarget,
    	long readOffset,
    	long writeOffset,
    	long size
    ) {
    	MethodHandle method = GLAD_GL_COPY_BUFFER_SUB_DATA.get();
    	try {
    		 method.invokeExact(
    			readTarget,
    			writeTarget,
    			readOffset,
    			writeOffset,
    			size
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glGetUniformIndices(
    	int program,
    	int uniformCount,
    	MemorySegment uniformNames,
    	MemorySegment uniformIndices
    ) {
    	MethodHandle method = GLAD_GL_GET_UNIFORM_INDICES.get();
    	try {
    		 method.invokeExact(
    			program,
    			uniformCount,
    			uniformNames,
    			uniformIndices
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetUniformIndices].
    public static void glGetUniformIndices(
    	int program,
    	int uniformCount,
    	NativePointerArray uniformNames,
    	NativeIntArray uniformIndices
    ) {
    	glGetUniformIndices(
    		program,
    		uniformCount,
    		uniformNames.memorySegment(),
    		uniformIndices.memorySegment()
    	);
    }
    
    public static void glGetActiveUniformsiv(
    	int program,
    	int uniformCount,
    	MemorySegment uniformIndices,
    	int pname,
    	MemorySegment params
    ) {
    	MethodHandle method = GLAD_GL_GET_ACTIVE_UNIFORMSIV.get();
    	try {
    		 method.invokeExact(
    			program,
    			uniformCount,
    			uniformIndices,
    			pname,
    			params
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetActiveUniformsiv].
    public static void glGetActiveUniformsiv(
    	int program,
    	int uniformCount,
    	NativeIntArray uniformIndices,
    	int pname,
    	NativeIntArray params
    ) {
    	glGetActiveUniformsiv(
    		program,
    		uniformCount,
    		uniformIndices.memorySegment(),
    		pname,
    		params.memorySegment()
    	);
    }
    
    public static void glGetActiveUniformName(
    	int program,
    	int uniformIndex,
    	int bufSize,
    	MemorySegment length,
    	MemorySegment uniformName
    ) {
    	MethodHandle method = GLAD_GL_GET_ACTIVE_UNIFORM_NAME.get();
    	try {
    		 method.invokeExact(
    			program,
    			uniformIndex,
    			bufSize,
    			length,
    			uniformName
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetActiveUniformName].
    public static void glGetActiveUniformName(
    	int program,
    	int uniformIndex,
    	int bufSize,
    	NativeIntArray length,
    	NativeByteArray uniformName
    ) {
    	glGetActiveUniformName(
    		program,
    		uniformIndex,
    		bufSize,
    		length.memorySegment(),
    		uniformName.memorySegment()
    	);
    }
    
    public static int glGetUniformBlockIndex(
    	int program,
    	MemorySegment uniformBlockName
    ) {
    	MethodHandle method = GLAD_GL_GET_UNIFORM_BLOCK_INDEX.get();
    	try {
    		return (int) method.invokeExact(
    			program,
    			uniformBlockName
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetUniformBlockIndex].
    public static int glGetUniformBlockIndex(
    	int program,
    	String uniformBlockName
    ) {
    	try (Arena arena = MemoryStack.stackPush()) {
    		return glGetUniformBlockIndex(
    			program,
    			arena.allocateFrom(uniformBlockName)
    		);
    	}
    }
    
    public static void glGetActiveUniformBlockiv(
    	int program,
    	int uniformBlockIndex,
    	int pname,
    	MemorySegment params
    ) {
    	MethodHandle method = GLAD_GL_GET_ACTIVE_UNIFORM_BLOCKIV.get();
    	try {
    		 method.invokeExact(
    			program,
    			uniformBlockIndex,
    			pname,
    			params
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetActiveUniformBlockiv].
    public static void glGetActiveUniformBlockiv(
    	int program,
    	int uniformBlockIndex,
    	int pname,
    	NativeIntArray params
    ) {
    	glGetActiveUniformBlockiv(
    		program,
    		uniformBlockIndex,
    		pname,
    		params.memorySegment()
    	);
    }
    
    public static void glGetActiveUniformBlockName(
    	int program,
    	int uniformBlockIndex,
    	int bufSize,
    	MemorySegment length,
    	MemorySegment uniformBlockName
    ) {
    	MethodHandle method = GLAD_GL_GET_ACTIVE_UNIFORM_BLOCK_NAME.get();
    	try {
    		 method.invokeExact(
    			program,
    			uniformBlockIndex,
    			bufSize,
    			length,
    			uniformBlockName
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetActiveUniformBlockName].
    public static void glGetActiveUniformBlockName(
    	int program,
    	int uniformBlockIndex,
    	int bufSize,
    	@Nullable NativeIntArray length,
    	NativeByteArray uniformBlockName
    ) {
    	glGetActiveUniformBlockName(
    		program,
    		uniformBlockIndex,
    		bufSize,
    		length == null ? MemorySegment.NULL : length.memorySegment(),
    		uniformBlockName.memorySegment()
    	);
    }
    
    public static void glUniformBlockBinding(
    	int program,
    	int uniformBlockIndex,
    	int uniformBlockBinding
    ) {
    	MethodHandle method = GLAD_GL_UNIFORM_BLOCK_BINDING.get();
    	try {
    		 method.invokeExact(
    			program,
    			uniformBlockIndex,
    			uniformBlockBinding
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glDrawElementsBaseVertex(
    	int mode,
    	int count,
    	int type,
    	MemorySegment indices,
    	int basevertex
    ) {
    	MethodHandle method = GLAD_GL_DRAW_ELEMENTS_BASE_VERTEX.get();
    	try {
    		 method.invokeExact(
    			mode,
    			count,
    			type,
    			indices,
    			basevertex
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glDrawRangeElementsBaseVertex(
    	int mode,
    	int start,
    	int end,
    	int count,
    	int type,
    	MemorySegment indices,
    	int basevertex
    ) {
    	MethodHandle method = GLAD_GL_DRAW_RANGE_ELEMENTS_BASE_VERTEX.get();
    	try {
    		 method.invokeExact(
    			mode,
    			start,
    			end,
    			count,
    			type,
    			indices,
    			basevertex
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glDrawElementsInstancedBaseVertex(
    	int mode,
    	int count,
    	int type,
    	MemorySegment indices,
    	int instancecount,
    	int basevertex
    ) {
    	MethodHandle method = GLAD_GL_DRAW_ELEMENTS_INSTANCED_BASE_VERTEX.get();
    	try {
    		 method.invokeExact(
    			mode,
    			count,
    			type,
    			indices,
    			instancecount,
    			basevertex
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glMultiDrawElementsBaseVertex(
    	int mode,
    	MemorySegment count,
    	int type,
    	MemorySegment indices,
    	int drawcount,
    	MemorySegment basevertex
    ) {
    	MethodHandle method = GLAD_GL_MULTI_DRAW_ELEMENTS_BASE_VERTEX.get();
    	try {
    		 method.invokeExact(
    			mode,
    			count,
    			type,
    			indices,
    			drawcount,
    			basevertex
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glMultiDrawElementsBaseVertex].
    public static void glMultiDrawElementsBaseVertex(
    	int mode,
    	NativeIntArray count,
    	int type,
    	NativePointerArray indices,
    	int drawcount,
    	NativeIntArray basevertex
    ) {
    	glMultiDrawElementsBaseVertex(
    		mode,
    		count.memorySegment(),
    		type,
    		indices.memorySegment(),
    		drawcount,
    		basevertex.memorySegment()
    	);
    }
    
    public static void glProvokingVertex(
    	int mode
    ) {
    	MethodHandle method = GLAD_GL_PROVOKING_VERTEX.get();
    	try {
    		 method.invokeExact(
    			mode
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment nglFenceSync(
    	int condition,
    	int flags
    ) {
    	MethodHandle method = GLAD_GL_FENCE_SYNC.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			condition,
    			flags
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nglFenceSync].
    public static @Nullable GLsync glFenceSync(
    	int condition,
    	int flags
    ) {
    	MemorySegment segment = nglFenceSync(
    		condition,
    		flags
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new GLsync(segment);
    }
    
    public static byte glIsSync(
    	MemorySegment sync
    ) {
    	MethodHandle method = GLAD_GL_IS_SYNC.get();
    	try {
    		return (byte) method.invokeExact(
    			sync
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glIsSync].
    public static byte glIsSync(
    	GLsync sync
    ) {
    	return glIsSync(
    		sync.memorySegment()
    	);
    }
    
    public static void glDeleteSync(
    	MemorySegment sync
    ) {
    	MethodHandle method = GLAD_GL_DELETE_SYNC.get();
    	try {
    		 method.invokeExact(
    			sync
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glDeleteSync].
    public static void glDeleteSync(
    	GLsync sync
    ) {
    	glDeleteSync(
    		sync.memorySegment()
    	);
    }
    
    public static int glClientWaitSync(
    	MemorySegment sync,
    	int flags,
    	long timeout
    ) {
    	MethodHandle method = GLAD_GL_CLIENT_WAIT_SYNC.get();
    	try {
    		return (int) method.invokeExact(
    			sync,
    			flags,
    			timeout
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glClientWaitSync].
    public static int glClientWaitSync(
    	GLsync sync,
    	int flags,
    	long timeout
    ) {
    	return glClientWaitSync(
    		sync.memorySegment(),
    		flags,
    		timeout
    	);
    }
    
    public static void glWaitSync(
    	MemorySegment sync,
    	int flags,
    	long timeout
    ) {
    	MethodHandle method = GLAD_GL_WAIT_SYNC.get();
    	try {
    		 method.invokeExact(
    			sync,
    			flags,
    			timeout
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glWaitSync].
    public static void glWaitSync(
    	GLsync sync,
    	int flags,
    	long timeout
    ) {
    	glWaitSync(
    		sync.memorySegment(),
    		flags,
    		timeout
    	);
    }
    
    public static void glGetInteger64v(
    	int pname,
    	MemorySegment data
    ) {
    	MethodHandle method = GLAD_GL_GET_INTEGER64V.get();
    	try {
    		 method.invokeExact(
    			pname,
    			data
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetInteger64v].
    public static void glGetInteger64v(
    	int pname,
    	NativeLongArray data
    ) {
    	glGetInteger64v(
    		pname,
    		data.memorySegment()
    	);
    }
    
    public static void glGetSynciv(
    	MemorySegment sync,
    	int pname,
    	int count,
    	MemorySegment length,
    	MemorySegment values
    ) {
    	MethodHandle method = GLAD_GL_GET_SYNCIV.get();
    	try {
    		 method.invokeExact(
    			sync,
    			pname,
    			count,
    			length,
    			values
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetSynciv].
    public static void glGetSynciv(
    	GLsync sync,
    	int pname,
    	int count,
    	@Nullable NativeIntArray length,
    	NativeIntArray values
    ) {
    	glGetSynciv(
    		sync.memorySegment(),
    		pname,
    		count,
    		length == null ? MemorySegment.NULL : length.memorySegment(),
    		values.memorySegment()
    	);
    }
    
    public static void glGetInteger64i_v(
    	int target,
    	int index,
    	MemorySegment data
    ) {
    	MethodHandle method = GLAD_GL_GET_INTEGER64I_V.get();
    	try {
    		 method.invokeExact(
    			target,
    			index,
    			data
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetInteger64i_v].
    public static void glGetInteger64i_v(
    	int target,
    	int index,
    	NativeLongArray data
    ) {
    	glGetInteger64i_v(
    		target,
    		index,
    		data.memorySegment()
    	);
    }
    
    public static void glGetBufferParameteri64v(
    	int target,
    	int pname,
    	MemorySegment params
    ) {
    	MethodHandle method = GLAD_GL_GET_BUFFER_PARAMETERI64V.get();
    	try {
    		 method.invokeExact(
    			target,
    			pname,
    			params
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetBufferParameteri64v].
    public static void glGetBufferParameteri64v(
    	int target,
    	int pname,
    	NativeLongArray params
    ) {
    	glGetBufferParameteri64v(
    		target,
    		pname,
    		params.memorySegment()
    	);
    }
    
    public static void glFramebufferTexture(
    	int target,
    	int attachment,
    	int texture,
    	int level
    ) {
    	MethodHandle method = GLAD_GL_FRAMEBUFFER_TEXTURE.get();
    	try {
    		 method.invokeExact(
    			target,
    			attachment,
    			texture,
    			level
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glTexImage2DMultisample(
    	int target,
    	int samples,
    	int internalformat,
    	int width,
    	int height,
    	byte fixedsamplelocations
    ) {
    	MethodHandle method = GLAD_GL_TEX_IMAGE2_DMULTISAMPLE.get();
    	try {
    		 method.invokeExact(
    			target,
    			samples,
    			internalformat,
    			width,
    			height,
    			fixedsamplelocations
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glTexImage3DMultisample(
    	int target,
    	int samples,
    	int internalformat,
    	int width,
    	int height,
    	int depth,
    	byte fixedsamplelocations
    ) {
    	MethodHandle method = GLAD_GL_TEX_IMAGE3_DMULTISAMPLE.get();
    	try {
    		 method.invokeExact(
    			target,
    			samples,
    			internalformat,
    			width,
    			height,
    			depth,
    			fixedsamplelocations
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glGetMultisamplefv(
    	int pname,
    	int index,
    	MemorySegment val
    ) {
    	MethodHandle method = GLAD_GL_GET_MULTISAMPLEFV.get();
    	try {
    		 method.invokeExact(
    			pname,
    			index,
    			val
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetMultisamplefv].
    public static void glGetMultisamplefv(
    	int pname,
    	int index,
    	NativeFloatArray val
    ) {
    	glGetMultisamplefv(
    		pname,
    		index,
    		val.memorySegment()
    	);
    }
    
    public static void glSampleMaski(
    	int maskNumber,
    	int mask
    ) {
    	MethodHandle method = GLAD_GL_SAMPLE_MASKI.get();
    	try {
    		 method.invokeExact(
    			maskNumber,
    			mask
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glBindFragDataLocationIndexed(
    	int program,
    	int colorNumber,
    	int index,
    	MemorySegment name
    ) {
    	MethodHandle method = GLAD_GL_BIND_FRAG_DATA_LOCATION_INDEXED.get();
    	try {
    		 method.invokeExact(
    			program,
    			colorNumber,
    			index,
    			name
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glBindFragDataLocationIndexed].
    public static void glBindFragDataLocationIndexed(
    	int program,
    	int colorNumber,
    	int index,
    	String name
    ) {
    	try (Arena arena = MemoryStack.stackPush()) {
    		glBindFragDataLocationIndexed(
    			program,
    			colorNumber,
    			index,
    			arena.allocateFrom(name)
    		);
    	}
    }
    
    public static int glGetFragDataIndex(
    	int program,
    	MemorySegment name
    ) {
    	MethodHandle method = GLAD_GL_GET_FRAG_DATA_INDEX.get();
    	try {
    		return (int) method.invokeExact(
    			program,
    			name
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetFragDataIndex].
    public static int glGetFragDataIndex(
    	int program,
    	String name
    ) {
    	try (Arena arena = MemoryStack.stackPush()) {
    		return glGetFragDataIndex(
    			program,
    			arena.allocateFrom(name)
    		);
    	}
    }
    
    public static void glGenSamplers(
    	int count,
    	MemorySegment samplers
    ) {
    	MethodHandle method = GLAD_GL_GEN_SAMPLERS.get();
    	try {
    		 method.invokeExact(
    			count,
    			samplers
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGenSamplers].
    public static void glGenSamplers(
    	int count,
    	NativeIntArray samplers
    ) {
    	glGenSamplers(
    		count,
    		samplers.memorySegment()
    	);
    }
    
    public static void glDeleteSamplers(
    	int count,
    	MemorySegment samplers
    ) {
    	MethodHandle method = GLAD_GL_DELETE_SAMPLERS.get();
    	try {
    		 method.invokeExact(
    			count,
    			samplers
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glDeleteSamplers].
    public static void glDeleteSamplers(
    	int count,
    	NativeIntArray samplers
    ) {
    	glDeleteSamplers(
    		count,
    		samplers.memorySegment()
    	);
    }
    
    public static byte glIsSampler(
    	int sampler
    ) {
    	MethodHandle method = GLAD_GL_IS_SAMPLER.get();
    	try {
    		return (byte) method.invokeExact(
    			sampler
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glBindSampler(
    	int unit,
    	int sampler
    ) {
    	MethodHandle method = GLAD_GL_BIND_SAMPLER.get();
    	try {
    		 method.invokeExact(
    			unit,
    			sampler
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glSamplerParameteri(
    	int sampler,
    	int pname,
    	int param
    ) {
    	MethodHandle method = GLAD_GL_SAMPLER_PARAMETERI.get();
    	try {
    		 method.invokeExact(
    			sampler,
    			pname,
    			param
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glSamplerParameteriv(
    	int sampler,
    	int pname,
    	MemorySegment param
    ) {
    	MethodHandle method = GLAD_GL_SAMPLER_PARAMETERIV.get();
    	try {
    		 method.invokeExact(
    			sampler,
    			pname,
    			param
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glSamplerParameteriv].
    public static void glSamplerParameteriv(
    	int sampler,
    	int pname,
    	NativeIntArray param
    ) {
    	glSamplerParameteriv(
    		sampler,
    		pname,
    		param.memorySegment()
    	);
    }
    
    public static void glSamplerParameterf(
    	int sampler,
    	int pname,
    	float param
    ) {
    	MethodHandle method = GLAD_GL_SAMPLER_PARAMETERF.get();
    	try {
    		 method.invokeExact(
    			sampler,
    			pname,
    			param
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glSamplerParameterfv(
    	int sampler,
    	int pname,
    	MemorySegment param
    ) {
    	MethodHandle method = GLAD_GL_SAMPLER_PARAMETERFV.get();
    	try {
    		 method.invokeExact(
    			sampler,
    			pname,
    			param
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glSamplerParameterfv].
    public static void glSamplerParameterfv(
    	int sampler,
    	int pname,
    	NativeFloatArray param
    ) {
    	glSamplerParameterfv(
    		sampler,
    		pname,
    		param.memorySegment()
    	);
    }
    
    public static void glSamplerParameterIiv(
    	int sampler,
    	int pname,
    	MemorySegment param
    ) {
    	MethodHandle method = GLAD_GL_SAMPLER_PARAMETER_IIV.get();
    	try {
    		 method.invokeExact(
    			sampler,
    			pname,
    			param
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glSamplerParameterIiv].
    public static void glSamplerParameterIiv(
    	int sampler,
    	int pname,
    	NativeIntArray param
    ) {
    	glSamplerParameterIiv(
    		sampler,
    		pname,
    		param.memorySegment()
    	);
    }
    
    public static void glSamplerParameterIuiv(
    	int sampler,
    	int pname,
    	MemorySegment param
    ) {
    	MethodHandle method = GLAD_GL_SAMPLER_PARAMETER_IUIV.get();
    	try {
    		 method.invokeExact(
    			sampler,
    			pname,
    			param
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glSamplerParameterIuiv].
    public static void glSamplerParameterIuiv(
    	int sampler,
    	int pname,
    	NativeIntArray param
    ) {
    	glSamplerParameterIuiv(
    		sampler,
    		pname,
    		param.memorySegment()
    	);
    }
    
    public static void glGetSamplerParameteriv(
    	int sampler,
    	int pname,
    	MemorySegment params
    ) {
    	MethodHandle method = GLAD_GL_GET_SAMPLER_PARAMETERIV.get();
    	try {
    		 method.invokeExact(
    			sampler,
    			pname,
    			params
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetSamplerParameteriv].
    public static void glGetSamplerParameteriv(
    	int sampler,
    	int pname,
    	NativeIntArray params
    ) {
    	glGetSamplerParameteriv(
    		sampler,
    		pname,
    		params.memorySegment()
    	);
    }
    
    public static void glGetSamplerParameterIiv(
    	int sampler,
    	int pname,
    	MemorySegment params
    ) {
    	MethodHandle method = GLAD_GL_GET_SAMPLER_PARAMETER_IIV.get();
    	try {
    		 method.invokeExact(
    			sampler,
    			pname,
    			params
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetSamplerParameterIiv].
    public static void glGetSamplerParameterIiv(
    	int sampler,
    	int pname,
    	NativeIntArray params
    ) {
    	glGetSamplerParameterIiv(
    		sampler,
    		pname,
    		params.memorySegment()
    	);
    }
    
    public static void glGetSamplerParameterfv(
    	int sampler,
    	int pname,
    	MemorySegment params
    ) {
    	MethodHandle method = GLAD_GL_GET_SAMPLER_PARAMETERFV.get();
    	try {
    		 method.invokeExact(
    			sampler,
    			pname,
    			params
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetSamplerParameterfv].
    public static void glGetSamplerParameterfv(
    	int sampler,
    	int pname,
    	NativeFloatArray params
    ) {
    	glGetSamplerParameterfv(
    		sampler,
    		pname,
    		params.memorySegment()
    	);
    }
    
    public static void glGetSamplerParameterIuiv(
    	int sampler,
    	int pname,
    	MemorySegment params
    ) {
    	MethodHandle method = GLAD_GL_GET_SAMPLER_PARAMETER_IUIV.get();
    	try {
    		 method.invokeExact(
    			sampler,
    			pname,
    			params
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetSamplerParameterIuiv].
    public static void glGetSamplerParameterIuiv(
    	int sampler,
    	int pname,
    	NativeIntArray params
    ) {
    	glGetSamplerParameterIuiv(
    		sampler,
    		pname,
    		params.memorySegment()
    	);
    }
    
    public static void glQueryCounter(
    	int id,
    	int target
    ) {
    	MethodHandle method = GLAD_GL_QUERY_COUNTER.get();
    	try {
    		 method.invokeExact(
    			id,
    			target
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glGetQueryObjecti64v(
    	int id,
    	int pname,
    	MemorySegment params
    ) {
    	MethodHandle method = GLAD_GL_GET_QUERY_OBJECTI64V.get();
    	try {
    		 method.invokeExact(
    			id,
    			pname,
    			params
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetQueryObjecti64v].
    public static void glGetQueryObjecti64v(
    	int id,
    	int pname,
    	NativeLongArray params
    ) {
    	glGetQueryObjecti64v(
    		id,
    		pname,
    		params.memorySegment()
    	);
    }
    
    public static void glGetQueryObjectui64v(
    	int id,
    	int pname,
    	MemorySegment params
    ) {
    	MethodHandle method = GLAD_GL_GET_QUERY_OBJECTUI64V.get();
    	try {
    		 method.invokeExact(
    			id,
    			pname,
    			params
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetQueryObjectui64v].
    public static void glGetQueryObjectui64v(
    	int id,
    	int pname,
    	NativeLongArray params
    ) {
    	glGetQueryObjectui64v(
    		id,
    		pname,
    		params.memorySegment()
    	);
    }
    
    public static void glVertexAttribDivisor(
    	int index,
    	int divisor
    ) {
    	MethodHandle method = GLAD_GL_VERTEX_ATTRIB_DIVISOR.get();
    	try {
    		 method.invokeExact(
    			index,
    			divisor
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glVertexAttribP1ui(
    	int index,
    	int type,
    	byte normalized,
    	int value
    ) {
    	MethodHandle method = GLAD_GL_VERTEX_ATTRIB_P1UI.get();
    	try {
    		 method.invokeExact(
    			index,
    			type,
    			normalized,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glVertexAttribP1uiv(
    	int index,
    	int type,
    	byte normalized,
    	MemorySegment value
    ) {
    	MethodHandle method = GLAD_GL_VERTEX_ATTRIB_P1UIV.get();
    	try {
    		 method.invokeExact(
    			index,
    			type,
    			normalized,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glVertexAttribP1uiv].
    public static void glVertexAttribP1uiv(
    	int index,
    	int type,
    	byte normalized,
    	NativeIntArray value
    ) {
    	glVertexAttribP1uiv(
    		index,
    		type,
    		normalized,
    		value.memorySegment()
    	);
    }
    
    public static void glVertexAttribP2ui(
    	int index,
    	int type,
    	byte normalized,
    	int value
    ) {
    	MethodHandle method = GLAD_GL_VERTEX_ATTRIB_P2UI.get();
    	try {
    		 method.invokeExact(
    			index,
    			type,
    			normalized,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glVertexAttribP2uiv(
    	int index,
    	int type,
    	byte normalized,
    	MemorySegment value
    ) {
    	MethodHandle method = GLAD_GL_VERTEX_ATTRIB_P2UIV.get();
    	try {
    		 method.invokeExact(
    			index,
    			type,
    			normalized,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glVertexAttribP2uiv].
    public static void glVertexAttribP2uiv(
    	int index,
    	int type,
    	byte normalized,
    	NativeIntArray value
    ) {
    	glVertexAttribP2uiv(
    		index,
    		type,
    		normalized,
    		value.memorySegment()
    	);
    }
    
    public static void glVertexAttribP3ui(
    	int index,
    	int type,
    	byte normalized,
    	int value
    ) {
    	MethodHandle method = GLAD_GL_VERTEX_ATTRIB_P3UI.get();
    	try {
    		 method.invokeExact(
    			index,
    			type,
    			normalized,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glVertexAttribP3uiv(
    	int index,
    	int type,
    	byte normalized,
    	MemorySegment value
    ) {
    	MethodHandle method = GLAD_GL_VERTEX_ATTRIB_P3UIV.get();
    	try {
    		 method.invokeExact(
    			index,
    			type,
    			normalized,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glVertexAttribP3uiv].
    public static void glVertexAttribP3uiv(
    	int index,
    	int type,
    	byte normalized,
    	NativeIntArray value
    ) {
    	glVertexAttribP3uiv(
    		index,
    		type,
    		normalized,
    		value.memorySegment()
    	);
    }
    
    public static void glVertexAttribP4ui(
    	int index,
    	int type,
    	byte normalized,
    	int value
    ) {
    	MethodHandle method = GLAD_GL_VERTEX_ATTRIB_P4UI.get();
    	try {
    		 method.invokeExact(
    			index,
    			type,
    			normalized,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glVertexAttribP4uiv(
    	int index,
    	int type,
    	byte normalized,
    	MemorySegment value
    ) {
    	MethodHandle method = GLAD_GL_VERTEX_ATTRIB_P4UIV.get();
    	try {
    		 method.invokeExact(
    			index,
    			type,
    			normalized,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glVertexAttribP4uiv].
    public static void glVertexAttribP4uiv(
    	int index,
    	int type,
    	byte normalized,
    	NativeIntArray value
    ) {
    	glVertexAttribP4uiv(
    		index,
    		type,
    		normalized,
    		value.memorySegment()
    	);
    }
    
    public static void glVertexP2ui(
    	int type,
    	int value
    ) {
    	MethodHandle method = GLAD_GL_VERTEX_P2UI.get();
    	try {
    		 method.invokeExact(
    			type,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glVertexP2uiv(
    	int type,
    	MemorySegment value
    ) {
    	MethodHandle method = GLAD_GL_VERTEX_P2UIV.get();
    	try {
    		 method.invokeExact(
    			type,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glVertexP2uiv].
    public static void glVertexP2uiv(
    	int type,
    	NativeIntArray value
    ) {
    	glVertexP2uiv(
    		type,
    		value.memorySegment()
    	);
    }
    
    public static void glVertexP3ui(
    	int type,
    	int value
    ) {
    	MethodHandle method = GLAD_GL_VERTEX_P3UI.get();
    	try {
    		 method.invokeExact(
    			type,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glVertexP3uiv(
    	int type,
    	MemorySegment value
    ) {
    	MethodHandle method = GLAD_GL_VERTEX_P3UIV.get();
    	try {
    		 method.invokeExact(
    			type,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glVertexP3uiv].
    public static void glVertexP3uiv(
    	int type,
    	NativeIntArray value
    ) {
    	glVertexP3uiv(
    		type,
    		value.memorySegment()
    	);
    }
    
    public static void glVertexP4ui(
    	int type,
    	int value
    ) {
    	MethodHandle method = GLAD_GL_VERTEX_P4UI.get();
    	try {
    		 method.invokeExact(
    			type,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glVertexP4uiv(
    	int type,
    	MemorySegment value
    ) {
    	MethodHandle method = GLAD_GL_VERTEX_P4UIV.get();
    	try {
    		 method.invokeExact(
    			type,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glVertexP4uiv].
    public static void glVertexP4uiv(
    	int type,
    	NativeIntArray value
    ) {
    	glVertexP4uiv(
    		type,
    		value.memorySegment()
    	);
    }
    
    public static void glTexCoordP1ui(
    	int type,
    	int coords
    ) {
    	MethodHandle method = GLAD_GL_TEX_COORD_P1UI.get();
    	try {
    		 method.invokeExact(
    			type,
    			coords
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glTexCoordP1uiv(
    	int type,
    	MemorySegment coords
    ) {
    	MethodHandle method = GLAD_GL_TEX_COORD_P1UIV.get();
    	try {
    		 method.invokeExact(
    			type,
    			coords
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glTexCoordP1uiv].
    public static void glTexCoordP1uiv(
    	int type,
    	NativeIntArray coords
    ) {
    	glTexCoordP1uiv(
    		type,
    		coords.memorySegment()
    	);
    }
    
    public static void glTexCoordP2ui(
    	int type,
    	int coords
    ) {
    	MethodHandle method = GLAD_GL_TEX_COORD_P2UI.get();
    	try {
    		 method.invokeExact(
    			type,
    			coords
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glTexCoordP2uiv(
    	int type,
    	MemorySegment coords
    ) {
    	MethodHandle method = GLAD_GL_TEX_COORD_P2UIV.get();
    	try {
    		 method.invokeExact(
    			type,
    			coords
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glTexCoordP2uiv].
    public static void glTexCoordP2uiv(
    	int type,
    	NativeIntArray coords
    ) {
    	glTexCoordP2uiv(
    		type,
    		coords.memorySegment()
    	);
    }
    
    public static void glTexCoordP3ui(
    	int type,
    	int coords
    ) {
    	MethodHandle method = GLAD_GL_TEX_COORD_P3UI.get();
    	try {
    		 method.invokeExact(
    			type,
    			coords
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glTexCoordP3uiv(
    	int type,
    	MemorySegment coords
    ) {
    	MethodHandle method = GLAD_GL_TEX_COORD_P3UIV.get();
    	try {
    		 method.invokeExact(
    			type,
    			coords
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glTexCoordP3uiv].
    public static void glTexCoordP3uiv(
    	int type,
    	NativeIntArray coords
    ) {
    	glTexCoordP3uiv(
    		type,
    		coords.memorySegment()
    	);
    }
    
    public static void glTexCoordP4ui(
    	int type,
    	int coords
    ) {
    	MethodHandle method = GLAD_GL_TEX_COORD_P4UI.get();
    	try {
    		 method.invokeExact(
    			type,
    			coords
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glTexCoordP4uiv(
    	int type,
    	MemorySegment coords
    ) {
    	MethodHandle method = GLAD_GL_TEX_COORD_P4UIV.get();
    	try {
    		 method.invokeExact(
    			type,
    			coords
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glTexCoordP4uiv].
    public static void glTexCoordP4uiv(
    	int type,
    	NativeIntArray coords
    ) {
    	glTexCoordP4uiv(
    		type,
    		coords.memorySegment()
    	);
    }
    
    public static void glMultiTexCoordP1ui(
    	int texture,
    	int type,
    	int coords
    ) {
    	MethodHandle method = GLAD_GL_MULTI_TEX_COORD_P1UI.get();
    	try {
    		 method.invokeExact(
    			texture,
    			type,
    			coords
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glMultiTexCoordP1uiv(
    	int texture,
    	int type,
    	MemorySegment coords
    ) {
    	MethodHandle method = GLAD_GL_MULTI_TEX_COORD_P1UIV.get();
    	try {
    		 method.invokeExact(
    			texture,
    			type,
    			coords
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glMultiTexCoordP1uiv].
    public static void glMultiTexCoordP1uiv(
    	int texture,
    	int type,
    	NativeIntArray coords
    ) {
    	glMultiTexCoordP1uiv(
    		texture,
    		type,
    		coords.memorySegment()
    	);
    }
    
    public static void glMultiTexCoordP2ui(
    	int texture,
    	int type,
    	int coords
    ) {
    	MethodHandle method = GLAD_GL_MULTI_TEX_COORD_P2UI.get();
    	try {
    		 method.invokeExact(
    			texture,
    			type,
    			coords
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glMultiTexCoordP2uiv(
    	int texture,
    	int type,
    	MemorySegment coords
    ) {
    	MethodHandle method = GLAD_GL_MULTI_TEX_COORD_P2UIV.get();
    	try {
    		 method.invokeExact(
    			texture,
    			type,
    			coords
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glMultiTexCoordP2uiv].
    public static void glMultiTexCoordP2uiv(
    	int texture,
    	int type,
    	NativeIntArray coords
    ) {
    	glMultiTexCoordP2uiv(
    		texture,
    		type,
    		coords.memorySegment()
    	);
    }
    
    public static void glMultiTexCoordP3ui(
    	int texture,
    	int type,
    	int coords
    ) {
    	MethodHandle method = GLAD_GL_MULTI_TEX_COORD_P3UI.get();
    	try {
    		 method.invokeExact(
    			texture,
    			type,
    			coords
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glMultiTexCoordP3uiv(
    	int texture,
    	int type,
    	MemorySegment coords
    ) {
    	MethodHandle method = GLAD_GL_MULTI_TEX_COORD_P3UIV.get();
    	try {
    		 method.invokeExact(
    			texture,
    			type,
    			coords
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glMultiTexCoordP3uiv].
    public static void glMultiTexCoordP3uiv(
    	int texture,
    	int type,
    	NativeIntArray coords
    ) {
    	glMultiTexCoordP3uiv(
    		texture,
    		type,
    		coords.memorySegment()
    	);
    }
    
    public static void glMultiTexCoordP4ui(
    	int texture,
    	int type,
    	int coords
    ) {
    	MethodHandle method = GLAD_GL_MULTI_TEX_COORD_P4UI.get();
    	try {
    		 method.invokeExact(
    			texture,
    			type,
    			coords
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glMultiTexCoordP4uiv(
    	int texture,
    	int type,
    	MemorySegment coords
    ) {
    	MethodHandle method = GLAD_GL_MULTI_TEX_COORD_P4UIV.get();
    	try {
    		 method.invokeExact(
    			texture,
    			type,
    			coords
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glMultiTexCoordP4uiv].
    public static void glMultiTexCoordP4uiv(
    	int texture,
    	int type,
    	NativeIntArray coords
    ) {
    	glMultiTexCoordP4uiv(
    		texture,
    		type,
    		coords.memorySegment()
    	);
    }
    
    public static void glNormalP3ui(
    	int type,
    	int coords
    ) {
    	MethodHandle method = GLAD_GL_NORMAL_P3UI.get();
    	try {
    		 method.invokeExact(
    			type,
    			coords
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glNormalP3uiv(
    	int type,
    	MemorySegment coords
    ) {
    	MethodHandle method = GLAD_GL_NORMAL_P3UIV.get();
    	try {
    		 method.invokeExact(
    			type,
    			coords
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glNormalP3uiv].
    public static void glNormalP3uiv(
    	int type,
    	NativeIntArray coords
    ) {
    	glNormalP3uiv(
    		type,
    		coords.memorySegment()
    	);
    }
    
    public static void glColorP3ui(
    	int type,
    	int color
    ) {
    	MethodHandle method = GLAD_GL_COLOR_P3UI.get();
    	try {
    		 method.invokeExact(
    			type,
    			color
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glColorP3uiv(
    	int type,
    	MemorySegment color
    ) {
    	MethodHandle method = GLAD_GL_COLOR_P3UIV.get();
    	try {
    		 method.invokeExact(
    			type,
    			color
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glColorP3uiv].
    public static void glColorP3uiv(
    	int type,
    	NativeIntArray color
    ) {
    	glColorP3uiv(
    		type,
    		color.memorySegment()
    	);
    }
    
    public static void glColorP4ui(
    	int type,
    	int color
    ) {
    	MethodHandle method = GLAD_GL_COLOR_P4UI.get();
    	try {
    		 method.invokeExact(
    			type,
    			color
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glColorP4uiv(
    	int type,
    	MemorySegment color
    ) {
    	MethodHandle method = GLAD_GL_COLOR_P4UIV.get();
    	try {
    		 method.invokeExact(
    			type,
    			color
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glColorP4uiv].
    public static void glColorP4uiv(
    	int type,
    	NativeIntArray color
    ) {
    	glColorP4uiv(
    		type,
    		color.memorySegment()
    	);
    }
    
    public static void glSecondaryColorP3ui(
    	int type,
    	int color
    ) {
    	MethodHandle method = GLAD_GL_SECONDARY_COLOR_P3UI.get();
    	try {
    		 method.invokeExact(
    			type,
    			color
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glSecondaryColorP3uiv(
    	int type,
    	MemorySegment color
    ) {
    	MethodHandle method = GLAD_GL_SECONDARY_COLOR_P3UIV.get();
    	try {
    		 method.invokeExact(
    			type,
    			color
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glSecondaryColorP3uiv].
    public static void glSecondaryColorP3uiv(
    	int type,
    	NativeIntArray color
    ) {
    	glSecondaryColorP3uiv(
    		type,
    		color.memorySegment()
    	);
    }
    
    public static void glMinSampleShading(
    	float value
    ) {
    	MethodHandle method = GLAD_GL_MIN_SAMPLE_SHADING.get();
    	try {
    		 method.invokeExact(
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glBlendEquationi(
    	int buf,
    	int mode
    ) {
    	MethodHandle method = GLAD_GL_BLEND_EQUATIONI.get();
    	try {
    		 method.invokeExact(
    			buf,
    			mode
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glBlendEquationSeparatei(
    	int buf,
    	int modeRGB,
    	int modeAlpha
    ) {
    	MethodHandle method = GLAD_GL_BLEND_EQUATION_SEPARATEI.get();
    	try {
    		 method.invokeExact(
    			buf,
    			modeRGB,
    			modeAlpha
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glBlendFunci(
    	int buf,
    	int src,
    	int dst
    ) {
    	MethodHandle method = GLAD_GL_BLEND_FUNCI.get();
    	try {
    		 method.invokeExact(
    			buf,
    			src,
    			dst
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glBlendFuncSeparatei(
    	int buf,
    	int srcRGB,
    	int dstRGB,
    	int srcAlpha,
    	int dstAlpha
    ) {
    	MethodHandle method = GLAD_GL_BLEND_FUNC_SEPARATEI.get();
    	try {
    		 method.invokeExact(
    			buf,
    			srcRGB,
    			dstRGB,
    			srcAlpha,
    			dstAlpha
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glDrawArraysIndirect(
    	int mode,
    	MemorySegment indirect
    ) {
    	MethodHandle method = GLAD_GL_DRAW_ARRAYS_INDIRECT.get();
    	try {
    		 method.invokeExact(
    			mode,
    			indirect
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glDrawElementsIndirect(
    	int mode,
    	int type,
    	MemorySegment indirect
    ) {
    	MethodHandle method = GLAD_GL_DRAW_ELEMENTS_INDIRECT.get();
    	try {
    		 method.invokeExact(
    			mode,
    			type,
    			indirect
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glUniform1d(
    	int location,
    	double x
    ) {
    	MethodHandle method = GLAD_GL_UNIFORM1D.get();
    	try {
    		 method.invokeExact(
    			location,
    			x
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glUniform2d(
    	int location,
    	double x,
    	double y
    ) {
    	MethodHandle method = GLAD_GL_UNIFORM2D.get();
    	try {
    		 method.invokeExact(
    			location,
    			x,
    			y
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glUniform3d(
    	int location,
    	double x,
    	double y,
    	double z
    ) {
    	MethodHandle method = GLAD_GL_UNIFORM3D.get();
    	try {
    		 method.invokeExact(
    			location,
    			x,
    			y,
    			z
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glUniform4d(
    	int location,
    	double x,
    	double y,
    	double z,
    	double w
    ) {
    	MethodHandle method = GLAD_GL_UNIFORM4D.get();
    	try {
    		 method.invokeExact(
    			location,
    			x,
    			y,
    			z,
    			w
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glUniform1dv(
    	int location,
    	int count,
    	MemorySegment value
    ) {
    	MethodHandle method = GLAD_GL_UNIFORM1DV.get();
    	try {
    		 method.invokeExact(
    			location,
    			count,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glUniform1dv].
    public static void glUniform1dv(
    	int location,
    	int count,
    	NativeDoubleArray value
    ) {
    	glUniform1dv(
    		location,
    		count,
    		value.memorySegment()
    	);
    }
    
    public static void glUniform2dv(
    	int location,
    	int count,
    	MemorySegment value
    ) {
    	MethodHandle method = GLAD_GL_UNIFORM2DV.get();
    	try {
    		 method.invokeExact(
    			location,
    			count,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glUniform2dv].
    public static void glUniform2dv(
    	int location,
    	int count,
    	NativeDoubleArray value
    ) {
    	glUniform2dv(
    		location,
    		count,
    		value.memorySegment()
    	);
    }
    
    public static void glUniform3dv(
    	int location,
    	int count,
    	MemorySegment value
    ) {
    	MethodHandle method = GLAD_GL_UNIFORM3DV.get();
    	try {
    		 method.invokeExact(
    			location,
    			count,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glUniform3dv].
    public static void glUniform3dv(
    	int location,
    	int count,
    	NativeDoubleArray value
    ) {
    	glUniform3dv(
    		location,
    		count,
    		value.memorySegment()
    	);
    }
    
    public static void glUniform4dv(
    	int location,
    	int count,
    	MemorySegment value
    ) {
    	MethodHandle method = GLAD_GL_UNIFORM4DV.get();
    	try {
    		 method.invokeExact(
    			location,
    			count,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glUniform4dv].
    public static void glUniform4dv(
    	int location,
    	int count,
    	NativeDoubleArray value
    ) {
    	glUniform4dv(
    		location,
    		count,
    		value.memorySegment()
    	);
    }
    
    public static void glUniformMatrix2dv(
    	int location,
    	int count,
    	byte transpose,
    	MemorySegment value
    ) {
    	MethodHandle method = GLAD_GL_UNIFORM_MATRIX2DV.get();
    	try {
    		 method.invokeExact(
    			location,
    			count,
    			transpose,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glUniformMatrix2dv].
    public static void glUniformMatrix2dv(
    	int location,
    	int count,
    	byte transpose,
    	NativeDoubleArray value
    ) {
    	glUniformMatrix2dv(
    		location,
    		count,
    		transpose,
    		value.memorySegment()
    	);
    }
    
    public static void glUniformMatrix3dv(
    	int location,
    	int count,
    	byte transpose,
    	MemorySegment value
    ) {
    	MethodHandle method = GLAD_GL_UNIFORM_MATRIX3DV.get();
    	try {
    		 method.invokeExact(
    			location,
    			count,
    			transpose,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glUniformMatrix3dv].
    public static void glUniformMatrix3dv(
    	int location,
    	int count,
    	byte transpose,
    	NativeDoubleArray value
    ) {
    	glUniformMatrix3dv(
    		location,
    		count,
    		transpose,
    		value.memorySegment()
    	);
    }
    
    public static void glUniformMatrix4dv(
    	int location,
    	int count,
    	byte transpose,
    	MemorySegment value
    ) {
    	MethodHandle method = GLAD_GL_UNIFORM_MATRIX4DV.get();
    	try {
    		 method.invokeExact(
    			location,
    			count,
    			transpose,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glUniformMatrix4dv].
    public static void glUniformMatrix4dv(
    	int location,
    	int count,
    	byte transpose,
    	NativeDoubleArray value
    ) {
    	glUniformMatrix4dv(
    		location,
    		count,
    		transpose,
    		value.memorySegment()
    	);
    }
    
    public static void glUniformMatrix2x3dv(
    	int location,
    	int count,
    	byte transpose,
    	MemorySegment value
    ) {
    	MethodHandle method = GLAD_GL_UNIFORM_MATRIX2X3DV.get();
    	try {
    		 method.invokeExact(
    			location,
    			count,
    			transpose,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glUniformMatrix2x3dv].
    public static void glUniformMatrix2x3dv(
    	int location,
    	int count,
    	byte transpose,
    	NativeDoubleArray value
    ) {
    	glUniformMatrix2x3dv(
    		location,
    		count,
    		transpose,
    		value.memorySegment()
    	);
    }
    
    public static void glUniformMatrix2x4dv(
    	int location,
    	int count,
    	byte transpose,
    	MemorySegment value
    ) {
    	MethodHandle method = GLAD_GL_UNIFORM_MATRIX2X4DV.get();
    	try {
    		 method.invokeExact(
    			location,
    			count,
    			transpose,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glUniformMatrix2x4dv].
    public static void glUniformMatrix2x4dv(
    	int location,
    	int count,
    	byte transpose,
    	NativeDoubleArray value
    ) {
    	glUniformMatrix2x4dv(
    		location,
    		count,
    		transpose,
    		value.memorySegment()
    	);
    }
    
    public static void glUniformMatrix3x2dv(
    	int location,
    	int count,
    	byte transpose,
    	MemorySegment value
    ) {
    	MethodHandle method = GLAD_GL_UNIFORM_MATRIX3X2DV.get();
    	try {
    		 method.invokeExact(
    			location,
    			count,
    			transpose,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glUniformMatrix3x2dv].
    public static void glUniformMatrix3x2dv(
    	int location,
    	int count,
    	byte transpose,
    	NativeDoubleArray value
    ) {
    	glUniformMatrix3x2dv(
    		location,
    		count,
    		transpose,
    		value.memorySegment()
    	);
    }
    
    public static void glUniformMatrix3x4dv(
    	int location,
    	int count,
    	byte transpose,
    	MemorySegment value
    ) {
    	MethodHandle method = GLAD_GL_UNIFORM_MATRIX3X4DV.get();
    	try {
    		 method.invokeExact(
    			location,
    			count,
    			transpose,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glUniformMatrix3x4dv].
    public static void glUniformMatrix3x4dv(
    	int location,
    	int count,
    	byte transpose,
    	NativeDoubleArray value
    ) {
    	glUniformMatrix3x4dv(
    		location,
    		count,
    		transpose,
    		value.memorySegment()
    	);
    }
    
    public static void glUniformMatrix4x2dv(
    	int location,
    	int count,
    	byte transpose,
    	MemorySegment value
    ) {
    	MethodHandle method = GLAD_GL_UNIFORM_MATRIX4X2DV.get();
    	try {
    		 method.invokeExact(
    			location,
    			count,
    			transpose,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glUniformMatrix4x2dv].
    public static void glUniformMatrix4x2dv(
    	int location,
    	int count,
    	byte transpose,
    	NativeDoubleArray value
    ) {
    	glUniformMatrix4x2dv(
    		location,
    		count,
    		transpose,
    		value.memorySegment()
    	);
    }
    
    public static void glUniformMatrix4x3dv(
    	int location,
    	int count,
    	byte transpose,
    	MemorySegment value
    ) {
    	MethodHandle method = GLAD_GL_UNIFORM_MATRIX4X3DV.get();
    	try {
    		 method.invokeExact(
    			location,
    			count,
    			transpose,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glUniformMatrix4x3dv].
    public static void glUniformMatrix4x3dv(
    	int location,
    	int count,
    	byte transpose,
    	NativeDoubleArray value
    ) {
    	glUniformMatrix4x3dv(
    		location,
    		count,
    		transpose,
    		value.memorySegment()
    	);
    }
    
    public static void glGetUniformdv(
    	int program,
    	int location,
    	MemorySegment params
    ) {
    	MethodHandle method = GLAD_GL_GET_UNIFORMDV.get();
    	try {
    		 method.invokeExact(
    			program,
    			location,
    			params
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetUniformdv].
    public static void glGetUniformdv(
    	int program,
    	int location,
    	NativeDoubleArray params
    ) {
    	glGetUniformdv(
    		program,
    		location,
    		params.memorySegment()
    	);
    }
    
    public static int glGetSubroutineUniformLocation(
    	int program,
    	int shadertype,
    	MemorySegment name
    ) {
    	MethodHandle method = GLAD_GL_GET_SUBROUTINE_UNIFORM_LOCATION.get();
    	try {
    		return (int) method.invokeExact(
    			program,
    			shadertype,
    			name
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetSubroutineUniformLocation].
    public static int glGetSubroutineUniformLocation(
    	int program,
    	int shadertype,
    	String name
    ) {
    	try (Arena arena = MemoryStack.stackPush()) {
    		return glGetSubroutineUniformLocation(
    			program,
    			shadertype,
    			arena.allocateFrom(name)
    		);
    	}
    }
    
    public static int glGetSubroutineIndex(
    	int program,
    	int shadertype,
    	MemorySegment name
    ) {
    	MethodHandle method = GLAD_GL_GET_SUBROUTINE_INDEX.get();
    	try {
    		return (int) method.invokeExact(
    			program,
    			shadertype,
    			name
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetSubroutineIndex].
    public static int glGetSubroutineIndex(
    	int program,
    	int shadertype,
    	String name
    ) {
    	try (Arena arena = MemoryStack.stackPush()) {
    		return glGetSubroutineIndex(
    			program,
    			shadertype,
    			arena.allocateFrom(name)
    		);
    	}
    }
    
    public static void glGetActiveSubroutineUniformiv(
    	int program,
    	int shadertype,
    	int index,
    	int pname,
    	MemorySegment values
    ) {
    	MethodHandle method = GLAD_GL_GET_ACTIVE_SUBROUTINE_UNIFORMIV.get();
    	try {
    		 method.invokeExact(
    			program,
    			shadertype,
    			index,
    			pname,
    			values
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetActiveSubroutineUniformiv].
    public static void glGetActiveSubroutineUniformiv(
    	int program,
    	int shadertype,
    	int index,
    	int pname,
    	NativeIntArray values
    ) {
    	glGetActiveSubroutineUniformiv(
    		program,
    		shadertype,
    		index,
    		pname,
    		values.memorySegment()
    	);
    }
    
    public static void glGetActiveSubroutineUniformName(
    	int program,
    	int shadertype,
    	int index,
    	int bufSize,
    	MemorySegment length,
    	MemorySegment name
    ) {
    	MethodHandle method = GLAD_GL_GET_ACTIVE_SUBROUTINE_UNIFORM_NAME.get();
    	try {
    		 method.invokeExact(
    			program,
    			shadertype,
    			index,
    			bufSize,
    			length,
    			name
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetActiveSubroutineUniformName].
    public static void glGetActiveSubroutineUniformName(
    	int program,
    	int shadertype,
    	int index,
    	int bufSize,
    	@Nullable NativeIntArray length,
    	NativeByteArray name
    ) {
    	glGetActiveSubroutineUniformName(
    		program,
    		shadertype,
    		index,
    		bufSize,
    		length == null ? MemorySegment.NULL : length.memorySegment(),
    		name.memorySegment()
    	);
    }
    
    public static void glGetActiveSubroutineName(
    	int program,
    	int shadertype,
    	int index,
    	int bufSize,
    	MemorySegment length,
    	MemorySegment name
    ) {
    	MethodHandle method = GLAD_GL_GET_ACTIVE_SUBROUTINE_NAME.get();
    	try {
    		 method.invokeExact(
    			program,
    			shadertype,
    			index,
    			bufSize,
    			length,
    			name
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetActiveSubroutineName].
    public static void glGetActiveSubroutineName(
    	int program,
    	int shadertype,
    	int index,
    	int bufSize,
    	@Nullable NativeIntArray length,
    	NativeByteArray name
    ) {
    	glGetActiveSubroutineName(
    		program,
    		shadertype,
    		index,
    		bufSize,
    		length == null ? MemorySegment.NULL : length.memorySegment(),
    		name.memorySegment()
    	);
    }
    
    public static void glUniformSubroutinesuiv(
    	int shadertype,
    	int count,
    	MemorySegment indices
    ) {
    	MethodHandle method = GLAD_GL_UNIFORM_SUBROUTINESUIV.get();
    	try {
    		 method.invokeExact(
    			shadertype,
    			count,
    			indices
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glUniformSubroutinesuiv].
    public static void glUniformSubroutinesuiv(
    	int shadertype,
    	int count,
    	NativeIntArray indices
    ) {
    	glUniformSubroutinesuiv(
    		shadertype,
    		count,
    		indices.memorySegment()
    	);
    }
    
    public static void glGetUniformSubroutineuiv(
    	int shadertype,
    	int location,
    	MemorySegment params
    ) {
    	MethodHandle method = GLAD_GL_GET_UNIFORM_SUBROUTINEUIV.get();
    	try {
    		 method.invokeExact(
    			shadertype,
    			location,
    			params
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetUniformSubroutineuiv].
    public static void glGetUniformSubroutineuiv(
    	int shadertype,
    	int location,
    	NativeIntArray params
    ) {
    	glGetUniformSubroutineuiv(
    		shadertype,
    		location,
    		params.memorySegment()
    	);
    }
    
    public static void glGetProgramStageiv(
    	int program,
    	int shadertype,
    	int pname,
    	MemorySegment values
    ) {
    	MethodHandle method = GLAD_GL_GET_PROGRAM_STAGEIV.get();
    	try {
    		 method.invokeExact(
    			program,
    			shadertype,
    			pname,
    			values
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetProgramStageiv].
    public static void glGetProgramStageiv(
    	int program,
    	int shadertype,
    	int pname,
    	NativeIntArray values
    ) {
    	glGetProgramStageiv(
    		program,
    		shadertype,
    		pname,
    		values.memorySegment()
    	);
    }
    
    public static void glPatchParameteri(
    	int pname,
    	int value
    ) {
    	MethodHandle method = GLAD_GL_PATCH_PARAMETERI.get();
    	try {
    		 method.invokeExact(
    			pname,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glPatchParameterfv(
    	int pname,
    	MemorySegment values
    ) {
    	MethodHandle method = GLAD_GL_PATCH_PARAMETERFV.get();
    	try {
    		 method.invokeExact(
    			pname,
    			values
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glPatchParameterfv].
    public static void glPatchParameterfv(
    	int pname,
    	NativeFloatArray values
    ) {
    	glPatchParameterfv(
    		pname,
    		values.memorySegment()
    	);
    }
    
    public static void glBindTransformFeedback(
    	int target,
    	int id
    ) {
    	MethodHandle method = GLAD_GL_BIND_TRANSFORM_FEEDBACK.get();
    	try {
    		 method.invokeExact(
    			target,
    			id
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glDeleteTransformFeedbacks(
    	int n,
    	MemorySegment ids
    ) {
    	MethodHandle method = GLAD_GL_DELETE_TRANSFORM_FEEDBACKS.get();
    	try {
    		 method.invokeExact(
    			n,
    			ids
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glDeleteTransformFeedbacks].
    public static void glDeleteTransformFeedbacks(
    	int n,
    	NativeIntArray ids
    ) {
    	glDeleteTransformFeedbacks(
    		n,
    		ids.memorySegment()
    	);
    }
    
    public static void glGenTransformFeedbacks(
    	int n,
    	MemorySegment ids
    ) {
    	MethodHandle method = GLAD_GL_GEN_TRANSFORM_FEEDBACKS.get();
    	try {
    		 method.invokeExact(
    			n,
    			ids
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGenTransformFeedbacks].
    public static void glGenTransformFeedbacks(
    	int n,
    	NativeIntArray ids
    ) {
    	glGenTransformFeedbacks(
    		n,
    		ids.memorySegment()
    	);
    }
    
    public static byte glIsTransformFeedback(
    	int id
    ) {
    	MethodHandle method = GLAD_GL_IS_TRANSFORM_FEEDBACK.get();
    	try {
    		return (byte) method.invokeExact(
    			id
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glPauseTransformFeedback() {
    	MethodHandle method = GLAD_GL_PAUSE_TRANSFORM_FEEDBACK.get();
    	try {
    		 method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glResumeTransformFeedback() {
    	MethodHandle method = GLAD_GL_RESUME_TRANSFORM_FEEDBACK.get();
    	try {
    		 method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glDrawTransformFeedback(
    	int mode,
    	int id
    ) {
    	MethodHandle method = GLAD_GL_DRAW_TRANSFORM_FEEDBACK.get();
    	try {
    		 method.invokeExact(
    			mode,
    			id
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glDrawTransformFeedbackStream(
    	int mode,
    	int id,
    	int stream
    ) {
    	MethodHandle method = GLAD_GL_DRAW_TRANSFORM_FEEDBACK_STREAM.get();
    	try {
    		 method.invokeExact(
    			mode,
    			id,
    			stream
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glBeginQueryIndexed(
    	int target,
    	int index,
    	int id
    ) {
    	MethodHandle method = GLAD_GL_BEGIN_QUERY_INDEXED.get();
    	try {
    		 method.invokeExact(
    			target,
    			index,
    			id
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glEndQueryIndexed(
    	int target,
    	int index
    ) {
    	MethodHandle method = GLAD_GL_END_QUERY_INDEXED.get();
    	try {
    		 method.invokeExact(
    			target,
    			index
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glGetQueryIndexediv(
    	int target,
    	int index,
    	int pname,
    	MemorySegment params
    ) {
    	MethodHandle method = GLAD_GL_GET_QUERY_INDEXEDIV.get();
    	try {
    		 method.invokeExact(
    			target,
    			index,
    			pname,
    			params
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetQueryIndexediv].
    public static void glGetQueryIndexediv(
    	int target,
    	int index,
    	int pname,
    	NativeIntArray params
    ) {
    	glGetQueryIndexediv(
    		target,
    		index,
    		pname,
    		params.memorySegment()
    	);
    }
    
    public static void glReleaseShaderCompiler() {
    	MethodHandle method = GLAD_GL_RELEASE_SHADER_COMPILER.get();
    	try {
    		 method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glShaderBinary(
    	int count,
    	MemorySegment shaders,
    	int binaryFormat,
    	MemorySegment binary,
    	int length
    ) {
    	MethodHandle method = GLAD_GL_SHADER_BINARY.get();
    	try {
    		 method.invokeExact(
    			count,
    			shaders,
    			binaryFormat,
    			binary,
    			length
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glShaderBinary].
    public static void glShaderBinary(
    	int count,
    	NativeIntArray shaders,
    	int binaryFormat,
    	MemorySegment binary,
    	int length
    ) {
    	glShaderBinary(
    		count,
    		shaders.memorySegment(),
    		binaryFormat,
    		binary,
    		length
    	);
    }
    
    public static void glGetShaderPrecisionFormat(
    	int shadertype,
    	int precisiontype,
    	MemorySegment range,
    	MemorySegment precision
    ) {
    	MethodHandle method = GLAD_GL_GET_SHADER_PRECISION_FORMAT.get();
    	try {
    		 method.invokeExact(
    			shadertype,
    			precisiontype,
    			range,
    			precision
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetShaderPrecisionFormat].
    public static void glGetShaderPrecisionFormat(
    	int shadertype,
    	int precisiontype,
    	NativeIntArray range,
    	NativeIntArray precision
    ) {
    	glGetShaderPrecisionFormat(
    		shadertype,
    		precisiontype,
    		range.memorySegment(),
    		precision.memorySegment()
    	);
    }
    
    public static void glDepthRangef(
    	float n,
    	float f
    ) {
    	MethodHandle method = GLAD_GL_DEPTH_RANGEF.get();
    	try {
    		 method.invokeExact(
    			n,
    			f
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glClearDepthf(
    	float d
    ) {
    	MethodHandle method = GLAD_GL_CLEAR_DEPTHF.get();
    	try {
    		 method.invokeExact(
    			d
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glGetProgramBinary(
    	int program,
    	int bufSize,
    	MemorySegment length,
    	MemorySegment binaryFormat,
    	MemorySegment binary
    ) {
    	MethodHandle method = GLAD_GL_GET_PROGRAM_BINARY.get();
    	try {
    		 method.invokeExact(
    			program,
    			bufSize,
    			length,
    			binaryFormat,
    			binary
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetProgramBinary].
    public static void glGetProgramBinary(
    	int program,
    	int bufSize,
    	NativeIntArray length,
    	NativeIntArray binaryFormat,
    	MemorySegment binary
    ) {
    	glGetProgramBinary(
    		program,
    		bufSize,
    		length.memorySegment(),
    		binaryFormat.memorySegment(),
    		binary
    	);
    }
    
    public static void glProgramBinary(
    	int program,
    	int binaryFormat,
    	MemorySegment binary,
    	int length
    ) {
    	MethodHandle method = GLAD_GL_PROGRAM_BINARY.get();
    	try {
    		 method.invokeExact(
    			program,
    			binaryFormat,
    			binary,
    			length
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glProgramParameteri(
    	int program,
    	int pname,
    	int value
    ) {
    	MethodHandle method = GLAD_GL_PROGRAM_PARAMETERI.get();
    	try {
    		 method.invokeExact(
    			program,
    			pname,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glUseProgramStages(
    	int pipeline,
    	int stages,
    	int program
    ) {
    	MethodHandle method = GLAD_GL_USE_PROGRAM_STAGES.get();
    	try {
    		 method.invokeExact(
    			pipeline,
    			stages,
    			program
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glActiveShaderProgram(
    	int pipeline,
    	int program
    ) {
    	MethodHandle method = GLAD_GL_ACTIVE_SHADER_PROGRAM.get();
    	try {
    		 method.invokeExact(
    			pipeline,
    			program
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static int glCreateShaderProgramv(
    	int type,
    	int count,
    	MemorySegment strings
    ) {
    	MethodHandle method = GLAD_GL_CREATE_SHADER_PROGRAMV.get();
    	try {
    		return (int) method.invokeExact(
    			type,
    			count,
    			strings
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glCreateShaderProgramv].
    public static int glCreateShaderProgramv(
    	int type,
    	int count,
    	NativePointerArray strings
    ) {
    	return glCreateShaderProgramv(
    		type,
    		count,
    		strings.memorySegment()
    	);
    }
    
    public static void glBindProgramPipeline(
    	int pipeline
    ) {
    	MethodHandle method = GLAD_GL_BIND_PROGRAM_PIPELINE.get();
    	try {
    		 method.invokeExact(
    			pipeline
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glDeleteProgramPipelines(
    	int n,
    	MemorySegment pipelines
    ) {
    	MethodHandle method = GLAD_GL_DELETE_PROGRAM_PIPELINES.get();
    	try {
    		 method.invokeExact(
    			n,
    			pipelines
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glDeleteProgramPipelines].
    public static void glDeleteProgramPipelines(
    	int n,
    	NativeIntArray pipelines
    ) {
    	glDeleteProgramPipelines(
    		n,
    		pipelines.memorySegment()
    	);
    }
    
    public static void glGenProgramPipelines(
    	int n,
    	MemorySegment pipelines
    ) {
    	MethodHandle method = GLAD_GL_GEN_PROGRAM_PIPELINES.get();
    	try {
    		 method.invokeExact(
    			n,
    			pipelines
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGenProgramPipelines].
    public static void glGenProgramPipelines(
    	int n,
    	NativeIntArray pipelines
    ) {
    	glGenProgramPipelines(
    		n,
    		pipelines.memorySegment()
    	);
    }
    
    public static byte glIsProgramPipeline(
    	int pipeline
    ) {
    	MethodHandle method = GLAD_GL_IS_PROGRAM_PIPELINE.get();
    	try {
    		return (byte) method.invokeExact(
    			pipeline
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glGetProgramPipelineiv(
    	int pipeline,
    	int pname,
    	MemorySegment params
    ) {
    	MethodHandle method = GLAD_GL_GET_PROGRAM_PIPELINEIV.get();
    	try {
    		 method.invokeExact(
    			pipeline,
    			pname,
    			params
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetProgramPipelineiv].
    public static void glGetProgramPipelineiv(
    	int pipeline,
    	int pname,
    	NativeIntArray params
    ) {
    	glGetProgramPipelineiv(
    		pipeline,
    		pname,
    		params.memorySegment()
    	);
    }
    
    public static void glProgramUniform1i(
    	int program,
    	int location,
    	int v0
    ) {
    	MethodHandle method = GLAD_GL_PROGRAM_UNIFORM1I.get();
    	try {
    		 method.invokeExact(
    			program,
    			location,
    			v0
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glProgramUniform1iv(
    	int program,
    	int location,
    	int count,
    	MemorySegment value
    ) {
    	MethodHandle method = GLAD_GL_PROGRAM_UNIFORM1IV.get();
    	try {
    		 method.invokeExact(
    			program,
    			location,
    			count,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glProgramUniform1iv].
    public static void glProgramUniform1iv(
    	int program,
    	int location,
    	int count,
    	NativeIntArray value
    ) {
    	glProgramUniform1iv(
    		program,
    		location,
    		count,
    		value.memorySegment()
    	);
    }
    
    public static void glProgramUniform1f(
    	int program,
    	int location,
    	float v0
    ) {
    	MethodHandle method = GLAD_GL_PROGRAM_UNIFORM1F.get();
    	try {
    		 method.invokeExact(
    			program,
    			location,
    			v0
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glProgramUniform1fv(
    	int program,
    	int location,
    	int count,
    	MemorySegment value
    ) {
    	MethodHandle method = GLAD_GL_PROGRAM_UNIFORM1FV.get();
    	try {
    		 method.invokeExact(
    			program,
    			location,
    			count,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glProgramUniform1fv].
    public static void glProgramUniform1fv(
    	int program,
    	int location,
    	int count,
    	NativeFloatArray value
    ) {
    	glProgramUniform1fv(
    		program,
    		location,
    		count,
    		value.memorySegment()
    	);
    }
    
    public static void glProgramUniform1d(
    	int program,
    	int location,
    	double v0
    ) {
    	MethodHandle method = GLAD_GL_PROGRAM_UNIFORM1D.get();
    	try {
    		 method.invokeExact(
    			program,
    			location,
    			v0
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glProgramUniform1dv(
    	int program,
    	int location,
    	int count,
    	MemorySegment value
    ) {
    	MethodHandle method = GLAD_GL_PROGRAM_UNIFORM1DV.get();
    	try {
    		 method.invokeExact(
    			program,
    			location,
    			count,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glProgramUniform1dv].
    public static void glProgramUniform1dv(
    	int program,
    	int location,
    	int count,
    	NativeDoubleArray value
    ) {
    	glProgramUniform1dv(
    		program,
    		location,
    		count,
    		value.memorySegment()
    	);
    }
    
    public static void glProgramUniform1ui(
    	int program,
    	int location,
    	int v0
    ) {
    	MethodHandle method = GLAD_GL_PROGRAM_UNIFORM1UI.get();
    	try {
    		 method.invokeExact(
    			program,
    			location,
    			v0
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glProgramUniform1uiv(
    	int program,
    	int location,
    	int count,
    	MemorySegment value
    ) {
    	MethodHandle method = GLAD_GL_PROGRAM_UNIFORM1UIV.get();
    	try {
    		 method.invokeExact(
    			program,
    			location,
    			count,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glProgramUniform1uiv].
    public static void glProgramUniform1uiv(
    	int program,
    	int location,
    	int count,
    	NativeIntArray value
    ) {
    	glProgramUniform1uiv(
    		program,
    		location,
    		count,
    		value.memorySegment()
    	);
    }
    
    public static void glProgramUniform2i(
    	int program,
    	int location,
    	int v0,
    	int v1
    ) {
    	MethodHandle method = GLAD_GL_PROGRAM_UNIFORM2I.get();
    	try {
    		 method.invokeExact(
    			program,
    			location,
    			v0,
    			v1
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glProgramUniform2iv(
    	int program,
    	int location,
    	int count,
    	MemorySegment value
    ) {
    	MethodHandle method = GLAD_GL_PROGRAM_UNIFORM2IV.get();
    	try {
    		 method.invokeExact(
    			program,
    			location,
    			count,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glProgramUniform2iv].
    public static void glProgramUniform2iv(
    	int program,
    	int location,
    	int count,
    	NativeIntArray value
    ) {
    	glProgramUniform2iv(
    		program,
    		location,
    		count,
    		value.memorySegment()
    	);
    }
    
    public static void glProgramUniform2f(
    	int program,
    	int location,
    	float v0,
    	float v1
    ) {
    	MethodHandle method = GLAD_GL_PROGRAM_UNIFORM2F.get();
    	try {
    		 method.invokeExact(
    			program,
    			location,
    			v0,
    			v1
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glProgramUniform2fv(
    	int program,
    	int location,
    	int count,
    	MemorySegment value
    ) {
    	MethodHandle method = GLAD_GL_PROGRAM_UNIFORM2FV.get();
    	try {
    		 method.invokeExact(
    			program,
    			location,
    			count,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glProgramUniform2fv].
    public static void glProgramUniform2fv(
    	int program,
    	int location,
    	int count,
    	NativeFloatArray value
    ) {
    	glProgramUniform2fv(
    		program,
    		location,
    		count,
    		value.memorySegment()
    	);
    }
    
    public static void glProgramUniform2d(
    	int program,
    	int location,
    	double v0,
    	double v1
    ) {
    	MethodHandle method = GLAD_GL_PROGRAM_UNIFORM2D.get();
    	try {
    		 method.invokeExact(
    			program,
    			location,
    			v0,
    			v1
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glProgramUniform2dv(
    	int program,
    	int location,
    	int count,
    	MemorySegment value
    ) {
    	MethodHandle method = GLAD_GL_PROGRAM_UNIFORM2DV.get();
    	try {
    		 method.invokeExact(
    			program,
    			location,
    			count,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glProgramUniform2dv].
    public static void glProgramUniform2dv(
    	int program,
    	int location,
    	int count,
    	NativeDoubleArray value
    ) {
    	glProgramUniform2dv(
    		program,
    		location,
    		count,
    		value.memorySegment()
    	);
    }
    
    public static void glProgramUniform2ui(
    	int program,
    	int location,
    	int v0,
    	int v1
    ) {
    	MethodHandle method = GLAD_GL_PROGRAM_UNIFORM2UI.get();
    	try {
    		 method.invokeExact(
    			program,
    			location,
    			v0,
    			v1
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glProgramUniform2uiv(
    	int program,
    	int location,
    	int count,
    	MemorySegment value
    ) {
    	MethodHandle method = GLAD_GL_PROGRAM_UNIFORM2UIV.get();
    	try {
    		 method.invokeExact(
    			program,
    			location,
    			count,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glProgramUniform2uiv].
    public static void glProgramUniform2uiv(
    	int program,
    	int location,
    	int count,
    	NativeIntArray value
    ) {
    	glProgramUniform2uiv(
    		program,
    		location,
    		count,
    		value.memorySegment()
    	);
    }
    
    public static void glProgramUniform3i(
    	int program,
    	int location,
    	int v0,
    	int v1,
    	int v2
    ) {
    	MethodHandle method = GLAD_GL_PROGRAM_UNIFORM3I.get();
    	try {
    		 method.invokeExact(
    			program,
    			location,
    			v0,
    			v1,
    			v2
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glProgramUniform3iv(
    	int program,
    	int location,
    	int count,
    	MemorySegment value
    ) {
    	MethodHandle method = GLAD_GL_PROGRAM_UNIFORM3IV.get();
    	try {
    		 method.invokeExact(
    			program,
    			location,
    			count,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glProgramUniform3iv].
    public static void glProgramUniform3iv(
    	int program,
    	int location,
    	int count,
    	NativeIntArray value
    ) {
    	glProgramUniform3iv(
    		program,
    		location,
    		count,
    		value.memorySegment()
    	);
    }
    
    public static void glProgramUniform3f(
    	int program,
    	int location,
    	float v0,
    	float v1,
    	float v2
    ) {
    	MethodHandle method = GLAD_GL_PROGRAM_UNIFORM3F.get();
    	try {
    		 method.invokeExact(
    			program,
    			location,
    			v0,
    			v1,
    			v2
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glProgramUniform3fv(
    	int program,
    	int location,
    	int count,
    	MemorySegment value
    ) {
    	MethodHandle method = GLAD_GL_PROGRAM_UNIFORM3FV.get();
    	try {
    		 method.invokeExact(
    			program,
    			location,
    			count,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glProgramUniform3fv].
    public static void glProgramUniform3fv(
    	int program,
    	int location,
    	int count,
    	NativeFloatArray value
    ) {
    	glProgramUniform3fv(
    		program,
    		location,
    		count,
    		value.memorySegment()
    	);
    }
    
    public static void glProgramUniform3d(
    	int program,
    	int location,
    	double v0,
    	double v1,
    	double v2
    ) {
    	MethodHandle method = GLAD_GL_PROGRAM_UNIFORM3D.get();
    	try {
    		 method.invokeExact(
    			program,
    			location,
    			v0,
    			v1,
    			v2
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glProgramUniform3dv(
    	int program,
    	int location,
    	int count,
    	MemorySegment value
    ) {
    	MethodHandle method = GLAD_GL_PROGRAM_UNIFORM3DV.get();
    	try {
    		 method.invokeExact(
    			program,
    			location,
    			count,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glProgramUniform3dv].
    public static void glProgramUniform3dv(
    	int program,
    	int location,
    	int count,
    	NativeDoubleArray value
    ) {
    	glProgramUniform3dv(
    		program,
    		location,
    		count,
    		value.memorySegment()
    	);
    }
    
    public static void glProgramUniform3ui(
    	int program,
    	int location,
    	int v0,
    	int v1,
    	int v2
    ) {
    	MethodHandle method = GLAD_GL_PROGRAM_UNIFORM3UI.get();
    	try {
    		 method.invokeExact(
    			program,
    			location,
    			v0,
    			v1,
    			v2
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glProgramUniform3uiv(
    	int program,
    	int location,
    	int count,
    	MemorySegment value
    ) {
    	MethodHandle method = GLAD_GL_PROGRAM_UNIFORM3UIV.get();
    	try {
    		 method.invokeExact(
    			program,
    			location,
    			count,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glProgramUniform3uiv].
    public static void glProgramUniform3uiv(
    	int program,
    	int location,
    	int count,
    	NativeIntArray value
    ) {
    	glProgramUniform3uiv(
    		program,
    		location,
    		count,
    		value.memorySegment()
    	);
    }
    
    public static void glProgramUniform4i(
    	int program,
    	int location,
    	int v0,
    	int v1,
    	int v2,
    	int v3
    ) {
    	MethodHandle method = GLAD_GL_PROGRAM_UNIFORM4I.get();
    	try {
    		 method.invokeExact(
    			program,
    			location,
    			v0,
    			v1,
    			v2,
    			v3
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glProgramUniform4iv(
    	int program,
    	int location,
    	int count,
    	MemorySegment value
    ) {
    	MethodHandle method = GLAD_GL_PROGRAM_UNIFORM4IV.get();
    	try {
    		 method.invokeExact(
    			program,
    			location,
    			count,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glProgramUniform4iv].
    public static void glProgramUniform4iv(
    	int program,
    	int location,
    	int count,
    	NativeIntArray value
    ) {
    	glProgramUniform4iv(
    		program,
    		location,
    		count,
    		value.memorySegment()
    	);
    }
    
    public static void glProgramUniform4f(
    	int program,
    	int location,
    	float v0,
    	float v1,
    	float v2,
    	float v3
    ) {
    	MethodHandle method = GLAD_GL_PROGRAM_UNIFORM4F.get();
    	try {
    		 method.invokeExact(
    			program,
    			location,
    			v0,
    			v1,
    			v2,
    			v3
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glProgramUniform4fv(
    	int program,
    	int location,
    	int count,
    	MemorySegment value
    ) {
    	MethodHandle method = GLAD_GL_PROGRAM_UNIFORM4FV.get();
    	try {
    		 method.invokeExact(
    			program,
    			location,
    			count,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glProgramUniform4fv].
    public static void glProgramUniform4fv(
    	int program,
    	int location,
    	int count,
    	NativeFloatArray value
    ) {
    	glProgramUniform4fv(
    		program,
    		location,
    		count,
    		value.memorySegment()
    	);
    }
    
    public static void glProgramUniform4d(
    	int program,
    	int location,
    	double v0,
    	double v1,
    	double v2,
    	double v3
    ) {
    	MethodHandle method = GLAD_GL_PROGRAM_UNIFORM4D.get();
    	try {
    		 method.invokeExact(
    			program,
    			location,
    			v0,
    			v1,
    			v2,
    			v3
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glProgramUniform4dv(
    	int program,
    	int location,
    	int count,
    	MemorySegment value
    ) {
    	MethodHandle method = GLAD_GL_PROGRAM_UNIFORM4DV.get();
    	try {
    		 method.invokeExact(
    			program,
    			location,
    			count,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glProgramUniform4dv].
    public static void glProgramUniform4dv(
    	int program,
    	int location,
    	int count,
    	NativeDoubleArray value
    ) {
    	glProgramUniform4dv(
    		program,
    		location,
    		count,
    		value.memorySegment()
    	);
    }
    
    public static void glProgramUniform4ui(
    	int program,
    	int location,
    	int v0,
    	int v1,
    	int v2,
    	int v3
    ) {
    	MethodHandle method = GLAD_GL_PROGRAM_UNIFORM4UI.get();
    	try {
    		 method.invokeExact(
    			program,
    			location,
    			v0,
    			v1,
    			v2,
    			v3
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glProgramUniform4uiv(
    	int program,
    	int location,
    	int count,
    	MemorySegment value
    ) {
    	MethodHandle method = GLAD_GL_PROGRAM_UNIFORM4UIV.get();
    	try {
    		 method.invokeExact(
    			program,
    			location,
    			count,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glProgramUniform4uiv].
    public static void glProgramUniform4uiv(
    	int program,
    	int location,
    	int count,
    	NativeIntArray value
    ) {
    	glProgramUniform4uiv(
    		program,
    		location,
    		count,
    		value.memorySegment()
    	);
    }
    
    public static void glProgramUniformMatrix2fv(
    	int program,
    	int location,
    	int count,
    	byte transpose,
    	MemorySegment value
    ) {
    	MethodHandle method = GLAD_GL_PROGRAM_UNIFORM_MATRIX2FV.get();
    	try {
    		 method.invokeExact(
    			program,
    			location,
    			count,
    			transpose,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glProgramUniformMatrix2fv].
    public static void glProgramUniformMatrix2fv(
    	int program,
    	int location,
    	int count,
    	byte transpose,
    	NativeFloatArray value
    ) {
    	glProgramUniformMatrix2fv(
    		program,
    		location,
    		count,
    		transpose,
    		value.memorySegment()
    	);
    }
    
    public static void glProgramUniformMatrix3fv(
    	int program,
    	int location,
    	int count,
    	byte transpose,
    	MemorySegment value
    ) {
    	MethodHandle method = GLAD_GL_PROGRAM_UNIFORM_MATRIX3FV.get();
    	try {
    		 method.invokeExact(
    			program,
    			location,
    			count,
    			transpose,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glProgramUniformMatrix3fv].
    public static void glProgramUniformMatrix3fv(
    	int program,
    	int location,
    	int count,
    	byte transpose,
    	NativeFloatArray value
    ) {
    	glProgramUniformMatrix3fv(
    		program,
    		location,
    		count,
    		transpose,
    		value.memorySegment()
    	);
    }
    
    public static void glProgramUniformMatrix4fv(
    	int program,
    	int location,
    	int count,
    	byte transpose,
    	MemorySegment value
    ) {
    	MethodHandle method = GLAD_GL_PROGRAM_UNIFORM_MATRIX4FV.get();
    	try {
    		 method.invokeExact(
    			program,
    			location,
    			count,
    			transpose,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glProgramUniformMatrix4fv].
    public static void glProgramUniformMatrix4fv(
    	int program,
    	int location,
    	int count,
    	byte transpose,
    	NativeFloatArray value
    ) {
    	glProgramUniformMatrix4fv(
    		program,
    		location,
    		count,
    		transpose,
    		value.memorySegment()
    	);
    }
    
    public static void glProgramUniformMatrix2dv(
    	int program,
    	int location,
    	int count,
    	byte transpose,
    	MemorySegment value
    ) {
    	MethodHandle method = GLAD_GL_PROGRAM_UNIFORM_MATRIX2DV.get();
    	try {
    		 method.invokeExact(
    			program,
    			location,
    			count,
    			transpose,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glProgramUniformMatrix2dv].
    public static void glProgramUniformMatrix2dv(
    	int program,
    	int location,
    	int count,
    	byte transpose,
    	NativeDoubleArray value
    ) {
    	glProgramUniformMatrix2dv(
    		program,
    		location,
    		count,
    		transpose,
    		value.memorySegment()
    	);
    }
    
    public static void glProgramUniformMatrix3dv(
    	int program,
    	int location,
    	int count,
    	byte transpose,
    	MemorySegment value
    ) {
    	MethodHandle method = GLAD_GL_PROGRAM_UNIFORM_MATRIX3DV.get();
    	try {
    		 method.invokeExact(
    			program,
    			location,
    			count,
    			transpose,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glProgramUniformMatrix3dv].
    public static void glProgramUniformMatrix3dv(
    	int program,
    	int location,
    	int count,
    	byte transpose,
    	NativeDoubleArray value
    ) {
    	glProgramUniformMatrix3dv(
    		program,
    		location,
    		count,
    		transpose,
    		value.memorySegment()
    	);
    }
    
    public static void glProgramUniformMatrix4dv(
    	int program,
    	int location,
    	int count,
    	byte transpose,
    	MemorySegment value
    ) {
    	MethodHandle method = GLAD_GL_PROGRAM_UNIFORM_MATRIX4DV.get();
    	try {
    		 method.invokeExact(
    			program,
    			location,
    			count,
    			transpose,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glProgramUniformMatrix4dv].
    public static void glProgramUniformMatrix4dv(
    	int program,
    	int location,
    	int count,
    	byte transpose,
    	NativeDoubleArray value
    ) {
    	glProgramUniformMatrix4dv(
    		program,
    		location,
    		count,
    		transpose,
    		value.memorySegment()
    	);
    }
    
    public static void glProgramUniformMatrix2x3fv(
    	int program,
    	int location,
    	int count,
    	byte transpose,
    	MemorySegment value
    ) {
    	MethodHandle method = GLAD_GL_PROGRAM_UNIFORM_MATRIX2X3FV.get();
    	try {
    		 method.invokeExact(
    			program,
    			location,
    			count,
    			transpose,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glProgramUniformMatrix2x3fv].
    public static void glProgramUniformMatrix2x3fv(
    	int program,
    	int location,
    	int count,
    	byte transpose,
    	NativeFloatArray value
    ) {
    	glProgramUniformMatrix2x3fv(
    		program,
    		location,
    		count,
    		transpose,
    		value.memorySegment()
    	);
    }
    
    public static void glProgramUniformMatrix3x2fv(
    	int program,
    	int location,
    	int count,
    	byte transpose,
    	MemorySegment value
    ) {
    	MethodHandle method = GLAD_GL_PROGRAM_UNIFORM_MATRIX3X2FV.get();
    	try {
    		 method.invokeExact(
    			program,
    			location,
    			count,
    			transpose,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glProgramUniformMatrix3x2fv].
    public static void glProgramUniformMatrix3x2fv(
    	int program,
    	int location,
    	int count,
    	byte transpose,
    	NativeFloatArray value
    ) {
    	glProgramUniformMatrix3x2fv(
    		program,
    		location,
    		count,
    		transpose,
    		value.memorySegment()
    	);
    }
    
    public static void glProgramUniformMatrix2x4fv(
    	int program,
    	int location,
    	int count,
    	byte transpose,
    	MemorySegment value
    ) {
    	MethodHandle method = GLAD_GL_PROGRAM_UNIFORM_MATRIX2X4FV.get();
    	try {
    		 method.invokeExact(
    			program,
    			location,
    			count,
    			transpose,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glProgramUniformMatrix2x4fv].
    public static void glProgramUniformMatrix2x4fv(
    	int program,
    	int location,
    	int count,
    	byte transpose,
    	NativeFloatArray value
    ) {
    	glProgramUniformMatrix2x4fv(
    		program,
    		location,
    		count,
    		transpose,
    		value.memorySegment()
    	);
    }
    
    public static void glProgramUniformMatrix4x2fv(
    	int program,
    	int location,
    	int count,
    	byte transpose,
    	MemorySegment value
    ) {
    	MethodHandle method = GLAD_GL_PROGRAM_UNIFORM_MATRIX4X2FV.get();
    	try {
    		 method.invokeExact(
    			program,
    			location,
    			count,
    			transpose,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glProgramUniformMatrix4x2fv].
    public static void glProgramUniformMatrix4x2fv(
    	int program,
    	int location,
    	int count,
    	byte transpose,
    	NativeFloatArray value
    ) {
    	glProgramUniformMatrix4x2fv(
    		program,
    		location,
    		count,
    		transpose,
    		value.memorySegment()
    	);
    }
    
    public static void glProgramUniformMatrix3x4fv(
    	int program,
    	int location,
    	int count,
    	byte transpose,
    	MemorySegment value
    ) {
    	MethodHandle method = GLAD_GL_PROGRAM_UNIFORM_MATRIX3X4FV.get();
    	try {
    		 method.invokeExact(
    			program,
    			location,
    			count,
    			transpose,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glProgramUniformMatrix3x4fv].
    public static void glProgramUniformMatrix3x4fv(
    	int program,
    	int location,
    	int count,
    	byte transpose,
    	NativeFloatArray value
    ) {
    	glProgramUniformMatrix3x4fv(
    		program,
    		location,
    		count,
    		transpose,
    		value.memorySegment()
    	);
    }
    
    public static void glProgramUniformMatrix4x3fv(
    	int program,
    	int location,
    	int count,
    	byte transpose,
    	MemorySegment value
    ) {
    	MethodHandle method = GLAD_GL_PROGRAM_UNIFORM_MATRIX4X3FV.get();
    	try {
    		 method.invokeExact(
    			program,
    			location,
    			count,
    			transpose,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glProgramUniformMatrix4x3fv].
    public static void glProgramUniformMatrix4x3fv(
    	int program,
    	int location,
    	int count,
    	byte transpose,
    	NativeFloatArray value
    ) {
    	glProgramUniformMatrix4x3fv(
    		program,
    		location,
    		count,
    		transpose,
    		value.memorySegment()
    	);
    }
    
    public static void glProgramUniformMatrix2x3dv(
    	int program,
    	int location,
    	int count,
    	byte transpose,
    	MemorySegment value
    ) {
    	MethodHandle method = GLAD_GL_PROGRAM_UNIFORM_MATRIX2X3DV.get();
    	try {
    		 method.invokeExact(
    			program,
    			location,
    			count,
    			transpose,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glProgramUniformMatrix2x3dv].
    public static void glProgramUniformMatrix2x3dv(
    	int program,
    	int location,
    	int count,
    	byte transpose,
    	NativeDoubleArray value
    ) {
    	glProgramUniformMatrix2x3dv(
    		program,
    		location,
    		count,
    		transpose,
    		value.memorySegment()
    	);
    }
    
    public static void glProgramUniformMatrix3x2dv(
    	int program,
    	int location,
    	int count,
    	byte transpose,
    	MemorySegment value
    ) {
    	MethodHandle method = GLAD_GL_PROGRAM_UNIFORM_MATRIX3X2DV.get();
    	try {
    		 method.invokeExact(
    			program,
    			location,
    			count,
    			transpose,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glProgramUniformMatrix3x2dv].
    public static void glProgramUniformMatrix3x2dv(
    	int program,
    	int location,
    	int count,
    	byte transpose,
    	NativeDoubleArray value
    ) {
    	glProgramUniformMatrix3x2dv(
    		program,
    		location,
    		count,
    		transpose,
    		value.memorySegment()
    	);
    }
    
    public static void glProgramUniformMatrix2x4dv(
    	int program,
    	int location,
    	int count,
    	byte transpose,
    	MemorySegment value
    ) {
    	MethodHandle method = GLAD_GL_PROGRAM_UNIFORM_MATRIX2X4DV.get();
    	try {
    		 method.invokeExact(
    			program,
    			location,
    			count,
    			transpose,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glProgramUniformMatrix2x4dv].
    public static void glProgramUniformMatrix2x4dv(
    	int program,
    	int location,
    	int count,
    	byte transpose,
    	NativeDoubleArray value
    ) {
    	glProgramUniformMatrix2x4dv(
    		program,
    		location,
    		count,
    		transpose,
    		value.memorySegment()
    	);
    }
    
    public static void glProgramUniformMatrix4x2dv(
    	int program,
    	int location,
    	int count,
    	byte transpose,
    	MemorySegment value
    ) {
    	MethodHandle method = GLAD_GL_PROGRAM_UNIFORM_MATRIX4X2DV.get();
    	try {
    		 method.invokeExact(
    			program,
    			location,
    			count,
    			transpose,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glProgramUniformMatrix4x2dv].
    public static void glProgramUniformMatrix4x2dv(
    	int program,
    	int location,
    	int count,
    	byte transpose,
    	NativeDoubleArray value
    ) {
    	glProgramUniformMatrix4x2dv(
    		program,
    		location,
    		count,
    		transpose,
    		value.memorySegment()
    	);
    }
    
    public static void glProgramUniformMatrix3x4dv(
    	int program,
    	int location,
    	int count,
    	byte transpose,
    	MemorySegment value
    ) {
    	MethodHandle method = GLAD_GL_PROGRAM_UNIFORM_MATRIX3X4DV.get();
    	try {
    		 method.invokeExact(
    			program,
    			location,
    			count,
    			transpose,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glProgramUniformMatrix3x4dv].
    public static void glProgramUniformMatrix3x4dv(
    	int program,
    	int location,
    	int count,
    	byte transpose,
    	NativeDoubleArray value
    ) {
    	glProgramUniformMatrix3x4dv(
    		program,
    		location,
    		count,
    		transpose,
    		value.memorySegment()
    	);
    }
    
    public static void glProgramUniformMatrix4x3dv(
    	int program,
    	int location,
    	int count,
    	byte transpose,
    	MemorySegment value
    ) {
    	MethodHandle method = GLAD_GL_PROGRAM_UNIFORM_MATRIX4X3DV.get();
    	try {
    		 method.invokeExact(
    			program,
    			location,
    			count,
    			transpose,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glProgramUniformMatrix4x3dv].
    public static void glProgramUniformMatrix4x3dv(
    	int program,
    	int location,
    	int count,
    	byte transpose,
    	NativeDoubleArray value
    ) {
    	glProgramUniformMatrix4x3dv(
    		program,
    		location,
    		count,
    		transpose,
    		value.memorySegment()
    	);
    }
    
    public static void glValidateProgramPipeline(
    	int pipeline
    ) {
    	MethodHandle method = GLAD_GL_VALIDATE_PROGRAM_PIPELINE.get();
    	try {
    		 method.invokeExact(
    			pipeline
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glGetProgramPipelineInfoLog(
    	int pipeline,
    	int bufSize,
    	MemorySegment length,
    	MemorySegment infoLog
    ) {
    	MethodHandle method = GLAD_GL_GET_PROGRAM_PIPELINE_INFO_LOG.get();
    	try {
    		 method.invokeExact(
    			pipeline,
    			bufSize,
    			length,
    			infoLog
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetProgramPipelineInfoLog].
    public static void glGetProgramPipelineInfoLog(
    	int pipeline,
    	int bufSize,
    	NativeIntArray length,
    	NativeByteArray infoLog
    ) {
    	glGetProgramPipelineInfoLog(
    		pipeline,
    		bufSize,
    		length.memorySegment(),
    		infoLog.memorySegment()
    	);
    }
    
    public static void glVertexAttribL1d(
    	int index,
    	double x
    ) {
    	MethodHandle method = GLAD_GL_VERTEX_ATTRIB_L1D.get();
    	try {
    		 method.invokeExact(
    			index,
    			x
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glVertexAttribL2d(
    	int index,
    	double x,
    	double y
    ) {
    	MethodHandle method = GLAD_GL_VERTEX_ATTRIB_L2D.get();
    	try {
    		 method.invokeExact(
    			index,
    			x,
    			y
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glVertexAttribL3d(
    	int index,
    	double x,
    	double y,
    	double z
    ) {
    	MethodHandle method = GLAD_GL_VERTEX_ATTRIB_L3D.get();
    	try {
    		 method.invokeExact(
    			index,
    			x,
    			y,
    			z
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glVertexAttribL4d(
    	int index,
    	double x,
    	double y,
    	double z,
    	double w
    ) {
    	MethodHandle method = GLAD_GL_VERTEX_ATTRIB_L4D.get();
    	try {
    		 method.invokeExact(
    			index,
    			x,
    			y,
    			z,
    			w
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glVertexAttribL1dv(
    	int index,
    	MemorySegment v
    ) {
    	MethodHandle method = GLAD_GL_VERTEX_ATTRIB_L1DV.get();
    	try {
    		 method.invokeExact(
    			index,
    			v
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glVertexAttribL1dv].
    public static void glVertexAttribL1dv(
    	int index,
    	NativeDoubleArray v
    ) {
    	glVertexAttribL1dv(
    		index,
    		v.memorySegment()
    	);
    }
    
    public static void glVertexAttribL2dv(
    	int index,
    	MemorySegment v
    ) {
    	MethodHandle method = GLAD_GL_VERTEX_ATTRIB_L2DV.get();
    	try {
    		 method.invokeExact(
    			index,
    			v
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glVertexAttribL2dv].
    public static void glVertexAttribL2dv(
    	int index,
    	NativeDoubleArray v
    ) {
    	glVertexAttribL2dv(
    		index,
    		v.memorySegment()
    	);
    }
    
    public static void glVertexAttribL3dv(
    	int index,
    	MemorySegment v
    ) {
    	MethodHandle method = GLAD_GL_VERTEX_ATTRIB_L3DV.get();
    	try {
    		 method.invokeExact(
    			index,
    			v
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glVertexAttribL3dv].
    public static void glVertexAttribL3dv(
    	int index,
    	NativeDoubleArray v
    ) {
    	glVertexAttribL3dv(
    		index,
    		v.memorySegment()
    	);
    }
    
    public static void glVertexAttribL4dv(
    	int index,
    	MemorySegment v
    ) {
    	MethodHandle method = GLAD_GL_VERTEX_ATTRIB_L4DV.get();
    	try {
    		 method.invokeExact(
    			index,
    			v
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glVertexAttribL4dv].
    public static void glVertexAttribL4dv(
    	int index,
    	NativeDoubleArray v
    ) {
    	glVertexAttribL4dv(
    		index,
    		v.memorySegment()
    	);
    }
    
    public static void glVertexAttribLPointer(
    	int index,
    	int size,
    	int type,
    	int stride,
    	MemorySegment pointer
    ) {
    	MethodHandle method = GLAD_GL_VERTEX_ATTRIB_LPOINTER.get();
    	try {
    		 method.invokeExact(
    			index,
    			size,
    			type,
    			stride,
    			pointer
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glGetVertexAttribLdv(
    	int index,
    	int pname,
    	MemorySegment params
    ) {
    	MethodHandle method = GLAD_GL_GET_VERTEX_ATTRIB_LDV.get();
    	try {
    		 method.invokeExact(
    			index,
    			pname,
    			params
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetVertexAttribLdv].
    public static void glGetVertexAttribLdv(
    	int index,
    	int pname,
    	NativeDoubleArray params
    ) {
    	glGetVertexAttribLdv(
    		index,
    		pname,
    		params.memorySegment()
    	);
    }
    
    public static void glViewportArrayv(
    	int first,
    	int count,
    	MemorySegment v
    ) {
    	MethodHandle method = GLAD_GL_VIEWPORT_ARRAYV.get();
    	try {
    		 method.invokeExact(
    			first,
    			count,
    			v
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glViewportArrayv].
    public static void glViewportArrayv(
    	int first,
    	int count,
    	NativeFloatArray v
    ) {
    	glViewportArrayv(
    		first,
    		count,
    		v.memorySegment()
    	);
    }
    
    public static void glViewportIndexedf(
    	int index,
    	float x,
    	float y,
    	float w,
    	float h
    ) {
    	MethodHandle method = GLAD_GL_VIEWPORT_INDEXEDF.get();
    	try {
    		 method.invokeExact(
    			index,
    			x,
    			y,
    			w,
    			h
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glViewportIndexedfv(
    	int index,
    	MemorySegment v
    ) {
    	MethodHandle method = GLAD_GL_VIEWPORT_INDEXEDFV.get();
    	try {
    		 method.invokeExact(
    			index,
    			v
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glViewportIndexedfv].
    public static void glViewportIndexedfv(
    	int index,
    	NativeFloatArray v
    ) {
    	glViewportIndexedfv(
    		index,
    		v.memorySegment()
    	);
    }
    
    public static void glScissorArrayv(
    	int first,
    	int count,
    	MemorySegment v
    ) {
    	MethodHandle method = GLAD_GL_SCISSOR_ARRAYV.get();
    	try {
    		 method.invokeExact(
    			first,
    			count,
    			v
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glScissorArrayv].
    public static void glScissorArrayv(
    	int first,
    	int count,
    	NativeIntArray v
    ) {
    	glScissorArrayv(
    		first,
    		count,
    		v.memorySegment()
    	);
    }
    
    public static void glScissorIndexed(
    	int index,
    	int left,
    	int bottom,
    	int width,
    	int height
    ) {
    	MethodHandle method = GLAD_GL_SCISSOR_INDEXED.get();
    	try {
    		 method.invokeExact(
    			index,
    			left,
    			bottom,
    			width,
    			height
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glScissorIndexedv(
    	int index,
    	MemorySegment v
    ) {
    	MethodHandle method = GLAD_GL_SCISSOR_INDEXEDV.get();
    	try {
    		 method.invokeExact(
    			index,
    			v
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glScissorIndexedv].
    public static void glScissorIndexedv(
    	int index,
    	NativeIntArray v
    ) {
    	glScissorIndexedv(
    		index,
    		v.memorySegment()
    	);
    }
    
    public static void glDepthRangeArrayv(
    	int first,
    	int count,
    	MemorySegment v
    ) {
    	MethodHandle method = GLAD_GL_DEPTH_RANGE_ARRAYV.get();
    	try {
    		 method.invokeExact(
    			first,
    			count,
    			v
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glDepthRangeArrayv].
    public static void glDepthRangeArrayv(
    	int first,
    	int count,
    	NativeDoubleArray v
    ) {
    	glDepthRangeArrayv(
    		first,
    		count,
    		v.memorySegment()
    	);
    }
    
    public static void glDepthRangeIndexed(
    	int index,
    	double n,
    	double f
    ) {
    	MethodHandle method = GLAD_GL_DEPTH_RANGE_INDEXED.get();
    	try {
    		 method.invokeExact(
    			index,
    			n,
    			f
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glGetFloati_v(
    	int target,
    	int index,
    	MemorySegment data
    ) {
    	MethodHandle method = GLAD_GL_GET_FLOATI_V.get();
    	try {
    		 method.invokeExact(
    			target,
    			index,
    			data
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetFloati_v].
    public static void glGetFloati_v(
    	int target,
    	int index,
    	NativeFloatArray data
    ) {
    	glGetFloati_v(
    		target,
    		index,
    		data.memorySegment()
    	);
    }
    
    public static void glGetDoublei_v(
    	int target,
    	int index,
    	MemorySegment data
    ) {
    	MethodHandle method = GLAD_GL_GET_DOUBLEI_V.get();
    	try {
    		 method.invokeExact(
    			target,
    			index,
    			data
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetDoublei_v].
    public static void glGetDoublei_v(
    	int target,
    	int index,
    	NativeDoubleArray data
    ) {
    	glGetDoublei_v(
    		target,
    		index,
    		data.memorySegment()
    	);
    }
    
    public static void glDrawArraysInstancedBaseInstance(
    	int mode,
    	int first,
    	int count,
    	int instancecount,
    	int baseinstance
    ) {
    	MethodHandle method = GLAD_GL_DRAW_ARRAYS_INSTANCED_BASE_INSTANCE.get();
    	try {
    		 method.invokeExact(
    			mode,
    			first,
    			count,
    			instancecount,
    			baseinstance
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glDrawElementsInstancedBaseInstance(
    	int mode,
    	int count,
    	int type,
    	MemorySegment indices,
    	int instancecount,
    	int baseinstance
    ) {
    	MethodHandle method = GLAD_GL_DRAW_ELEMENTS_INSTANCED_BASE_INSTANCE.get();
    	try {
    		 method.invokeExact(
    			mode,
    			count,
    			type,
    			indices,
    			instancecount,
    			baseinstance
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glDrawElementsInstancedBaseVertexBaseInstance(
    	int mode,
    	int count,
    	int type,
    	MemorySegment indices,
    	int instancecount,
    	int basevertex,
    	int baseinstance
    ) {
    	MethodHandle method = GLAD_GL_DRAW_ELEMENTS_INSTANCED_BASE_VERTEX_BASE_INSTANCE.get();
    	try {
    		 method.invokeExact(
    			mode,
    			count,
    			type,
    			indices,
    			instancecount,
    			basevertex,
    			baseinstance
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glGetInternalformativ(
    	int target,
    	int internalformat,
    	int pname,
    	int count,
    	MemorySegment params
    ) {
    	MethodHandle method = GLAD_GL_GET_INTERNALFORMATIV.get();
    	try {
    		 method.invokeExact(
    			target,
    			internalformat,
    			pname,
    			count,
    			params
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetInternalformativ].
    public static void glGetInternalformativ(
    	int target,
    	int internalformat,
    	int pname,
    	int count,
    	NativeIntArray params
    ) {
    	glGetInternalformativ(
    		target,
    		internalformat,
    		pname,
    		count,
    		params.memorySegment()
    	);
    }
    
    public static void glGetActiveAtomicCounterBufferiv(
    	int program,
    	int bufferIndex,
    	int pname,
    	MemorySegment params
    ) {
    	MethodHandle method = GLAD_GL_GET_ACTIVE_ATOMIC_COUNTER_BUFFERIV.get();
    	try {
    		 method.invokeExact(
    			program,
    			bufferIndex,
    			pname,
    			params
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetActiveAtomicCounterBufferiv].
    public static void glGetActiveAtomicCounterBufferiv(
    	int program,
    	int bufferIndex,
    	int pname,
    	NativeIntArray params
    ) {
    	glGetActiveAtomicCounterBufferiv(
    		program,
    		bufferIndex,
    		pname,
    		params.memorySegment()
    	);
    }
    
    public static void glBindImageTexture(
    	int unit,
    	int texture,
    	int level,
    	byte layered,
    	int layer,
    	int access,
    	int format
    ) {
    	MethodHandle method = GLAD_GL_BIND_IMAGE_TEXTURE.get();
    	try {
    		 method.invokeExact(
    			unit,
    			texture,
    			level,
    			layered,
    			layer,
    			access,
    			format
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glMemoryBarrier(
    	int barriers
    ) {
    	MethodHandle method = GLAD_GL_MEMORY_BARRIER.get();
    	try {
    		 method.invokeExact(
    			barriers
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glTexStorage1D(
    	int target,
    	int levels,
    	int internalformat,
    	int width
    ) {
    	MethodHandle method = GLAD_GL_TEX_STORAGE1_D.get();
    	try {
    		 method.invokeExact(
    			target,
    			levels,
    			internalformat,
    			width
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glTexStorage2D(
    	int target,
    	int levels,
    	int internalformat,
    	int width,
    	int height
    ) {
    	MethodHandle method = GLAD_GL_TEX_STORAGE2_D.get();
    	try {
    		 method.invokeExact(
    			target,
    			levels,
    			internalformat,
    			width,
    			height
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glTexStorage3D(
    	int target,
    	int levels,
    	int internalformat,
    	int width,
    	int height,
    	int depth
    ) {
    	MethodHandle method = GLAD_GL_TEX_STORAGE3_D.get();
    	try {
    		 method.invokeExact(
    			target,
    			levels,
    			internalformat,
    			width,
    			height,
    			depth
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glDrawTransformFeedbackInstanced(
    	int mode,
    	int id,
    	int instancecount
    ) {
    	MethodHandle method = GLAD_GL_DRAW_TRANSFORM_FEEDBACK_INSTANCED.get();
    	try {
    		 method.invokeExact(
    			mode,
    			id,
    			instancecount
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glDrawTransformFeedbackStreamInstanced(
    	int mode,
    	int id,
    	int stream,
    	int instancecount
    ) {
    	MethodHandle method = GLAD_GL_DRAW_TRANSFORM_FEEDBACK_STREAM_INSTANCED.get();
    	try {
    		 method.invokeExact(
    			mode,
    			id,
    			stream,
    			instancecount
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glClearBufferData(
    	int target,
    	int internalformat,
    	int format,
    	int type,
    	MemorySegment data
    ) {
    	MethodHandle method = GLAD_GL_CLEAR_BUFFER_DATA.get();
    	try {
    		 method.invokeExact(
    			target,
    			internalformat,
    			format,
    			type,
    			data
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glClearBufferSubData(
    	int target,
    	int internalformat,
    	long offset,
    	long size,
    	int format,
    	int type,
    	MemorySegment data
    ) {
    	MethodHandle method = GLAD_GL_CLEAR_BUFFER_SUB_DATA.get();
    	try {
    		 method.invokeExact(
    			target,
    			internalformat,
    			offset,
    			size,
    			format,
    			type,
    			data
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glDispatchCompute(
    	int num_groups_x,
    	int num_groups_y,
    	int num_groups_z
    ) {
    	MethodHandle method = GLAD_GL_DISPATCH_COMPUTE.get();
    	try {
    		 method.invokeExact(
    			num_groups_x,
    			num_groups_y,
    			num_groups_z
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glDispatchComputeIndirect(
    	long indirect
    ) {
    	MethodHandle method = GLAD_GL_DISPATCH_COMPUTE_INDIRECT.get();
    	try {
    		 method.invokeExact(
    			indirect
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glCopyImageSubData(
    	int srcName,
    	int srcTarget,
    	int srcLevel,
    	int srcX,
    	int srcY,
    	int srcZ,
    	int dstName,
    	int dstTarget,
    	int dstLevel,
    	int dstX,
    	int dstY,
    	int dstZ,
    	int srcWidth,
    	int srcHeight,
    	int srcDepth
    ) {
    	MethodHandle method = GLAD_GL_COPY_IMAGE_SUB_DATA.get();
    	try {
    		 method.invokeExact(
    			srcName,
    			srcTarget,
    			srcLevel,
    			srcX,
    			srcY,
    			srcZ,
    			dstName,
    			dstTarget,
    			dstLevel,
    			dstX,
    			dstY,
    			dstZ,
    			srcWidth,
    			srcHeight,
    			srcDepth
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glFramebufferParameteri(
    	int target,
    	int pname,
    	int param
    ) {
    	MethodHandle method = GLAD_GL_FRAMEBUFFER_PARAMETERI.get();
    	try {
    		 method.invokeExact(
    			target,
    			pname,
    			param
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glGetFramebufferParameteriv(
    	int target,
    	int pname,
    	MemorySegment params
    ) {
    	MethodHandle method = GLAD_GL_GET_FRAMEBUFFER_PARAMETERIV.get();
    	try {
    		 method.invokeExact(
    			target,
    			pname,
    			params
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetFramebufferParameteriv].
    public static void glGetFramebufferParameteriv(
    	int target,
    	int pname,
    	NativeIntArray params
    ) {
    	glGetFramebufferParameteriv(
    		target,
    		pname,
    		params.memorySegment()
    	);
    }
    
    public static void glGetInternalformati64v(
    	int target,
    	int internalformat,
    	int pname,
    	int count,
    	MemorySegment params
    ) {
    	MethodHandle method = GLAD_GL_GET_INTERNALFORMATI64V.get();
    	try {
    		 method.invokeExact(
    			target,
    			internalformat,
    			pname,
    			count,
    			params
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetInternalformati64v].
    public static void glGetInternalformati64v(
    	int target,
    	int internalformat,
    	int pname,
    	int count,
    	NativeLongArray params
    ) {
    	glGetInternalformati64v(
    		target,
    		internalformat,
    		pname,
    		count,
    		params.memorySegment()
    	);
    }
    
    public static void glInvalidateTexSubImage(
    	int texture,
    	int level,
    	int xoffset,
    	int yoffset,
    	int zoffset,
    	int width,
    	int height,
    	int depth
    ) {
    	MethodHandle method = GLAD_GL_INVALIDATE_TEX_SUB_IMAGE.get();
    	try {
    		 method.invokeExact(
    			texture,
    			level,
    			xoffset,
    			yoffset,
    			zoffset,
    			width,
    			height,
    			depth
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glInvalidateTexImage(
    	int texture,
    	int level
    ) {
    	MethodHandle method = GLAD_GL_INVALIDATE_TEX_IMAGE.get();
    	try {
    		 method.invokeExact(
    			texture,
    			level
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glInvalidateBufferSubData(
    	int buffer,
    	long offset,
    	long length
    ) {
    	MethodHandle method = GLAD_GL_INVALIDATE_BUFFER_SUB_DATA.get();
    	try {
    		 method.invokeExact(
    			buffer,
    			offset,
    			length
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glInvalidateBufferData(
    	int buffer
    ) {
    	MethodHandle method = GLAD_GL_INVALIDATE_BUFFER_DATA.get();
    	try {
    		 method.invokeExact(
    			buffer
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glInvalidateFramebuffer(
    	int target,
    	int numAttachments,
    	MemorySegment attachments
    ) {
    	MethodHandle method = GLAD_GL_INVALIDATE_FRAMEBUFFER.get();
    	try {
    		 method.invokeExact(
    			target,
    			numAttachments,
    			attachments
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glInvalidateFramebuffer].
    public static void glInvalidateFramebuffer(
    	int target,
    	int numAttachments,
    	NativeIntArray attachments
    ) {
    	glInvalidateFramebuffer(
    		target,
    		numAttachments,
    		attachments.memorySegment()
    	);
    }
    
    public static void glInvalidateSubFramebuffer(
    	int target,
    	int numAttachments,
    	MemorySegment attachments,
    	int x,
    	int y,
    	int width,
    	int height
    ) {
    	MethodHandle method = GLAD_GL_INVALIDATE_SUB_FRAMEBUFFER.get();
    	try {
    		 method.invokeExact(
    			target,
    			numAttachments,
    			attachments,
    			x,
    			y,
    			width,
    			height
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glInvalidateSubFramebuffer].
    public static void glInvalidateSubFramebuffer(
    	int target,
    	int numAttachments,
    	NativeIntArray attachments,
    	int x,
    	int y,
    	int width,
    	int height
    ) {
    	glInvalidateSubFramebuffer(
    		target,
    		numAttachments,
    		attachments.memorySegment(),
    		x,
    		y,
    		width,
    		height
    	);
    }
    
    public static void glMultiDrawArraysIndirect(
    	int mode,
    	MemorySegment indirect,
    	int drawcount,
    	int stride
    ) {
    	MethodHandle method = GLAD_GL_MULTI_DRAW_ARRAYS_INDIRECT.get();
    	try {
    		 method.invokeExact(
    			mode,
    			indirect,
    			drawcount,
    			stride
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glMultiDrawElementsIndirect(
    	int mode,
    	int type,
    	MemorySegment indirect,
    	int drawcount,
    	int stride
    ) {
    	MethodHandle method = GLAD_GL_MULTI_DRAW_ELEMENTS_INDIRECT.get();
    	try {
    		 method.invokeExact(
    			mode,
    			type,
    			indirect,
    			drawcount,
    			stride
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glGetProgramInterfaceiv(
    	int program,
    	int programInterface,
    	int pname,
    	MemorySegment params
    ) {
    	MethodHandle method = GLAD_GL_GET_PROGRAM_INTERFACEIV.get();
    	try {
    		 method.invokeExact(
    			program,
    			programInterface,
    			pname,
    			params
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetProgramInterfaceiv].
    public static void glGetProgramInterfaceiv(
    	int program,
    	int programInterface,
    	int pname,
    	NativeIntArray params
    ) {
    	glGetProgramInterfaceiv(
    		program,
    		programInterface,
    		pname,
    		params.memorySegment()
    	);
    }
    
    public static int glGetProgramResourceIndex(
    	int program,
    	int programInterface,
    	MemorySegment name
    ) {
    	MethodHandle method = GLAD_GL_GET_PROGRAM_RESOURCE_INDEX.get();
    	try {
    		return (int) method.invokeExact(
    			program,
    			programInterface,
    			name
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetProgramResourceIndex].
    public static int glGetProgramResourceIndex(
    	int program,
    	int programInterface,
    	String name
    ) {
    	try (Arena arena = MemoryStack.stackPush()) {
    		return glGetProgramResourceIndex(
    			program,
    			programInterface,
    			arena.allocateFrom(name)
    		);
    	}
    }
    
    public static void glGetProgramResourceName(
    	int program,
    	int programInterface,
    	int index,
    	int bufSize,
    	MemorySegment length,
    	MemorySegment name
    ) {
    	MethodHandle method = GLAD_GL_GET_PROGRAM_RESOURCE_NAME.get();
    	try {
    		 method.invokeExact(
    			program,
    			programInterface,
    			index,
    			bufSize,
    			length,
    			name
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetProgramResourceName].
    public static void glGetProgramResourceName(
    	int program,
    	int programInterface,
    	int index,
    	int bufSize,
    	@Nullable NativeIntArray length,
    	NativeByteArray name
    ) {
    	glGetProgramResourceName(
    		program,
    		programInterface,
    		index,
    		bufSize,
    		length == null ? MemorySegment.NULL : length.memorySegment(),
    		name.memorySegment()
    	);
    }
    
    public static void glGetProgramResourceiv(
    	int program,
    	int programInterface,
    	int index,
    	int propCount,
    	MemorySegment props,
    	int count,
    	MemorySegment length,
    	MemorySegment params
    ) {
    	MethodHandle method = GLAD_GL_GET_PROGRAM_RESOURCEIV.get();
    	try {
    		 method.invokeExact(
    			program,
    			programInterface,
    			index,
    			propCount,
    			props,
    			count,
    			length,
    			params
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetProgramResourceiv].
    public static void glGetProgramResourceiv(
    	int program,
    	int programInterface,
    	int index,
    	int propCount,
    	NativeIntArray props,
    	int count,
    	NativeIntArray length,
    	NativeIntArray params
    ) {
    	glGetProgramResourceiv(
    		program,
    		programInterface,
    		index,
    		propCount,
    		props.memorySegment(),
    		count,
    		length.memorySegment(),
    		params.memorySegment()
    	);
    }
    
    public static int glGetProgramResourceLocation(
    	int program,
    	int programInterface,
    	MemorySegment name
    ) {
    	MethodHandle method = GLAD_GL_GET_PROGRAM_RESOURCE_LOCATION.get();
    	try {
    		return (int) method.invokeExact(
    			program,
    			programInterface,
    			name
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetProgramResourceLocation].
    public static int glGetProgramResourceLocation(
    	int program,
    	int programInterface,
    	String name
    ) {
    	try (Arena arena = MemoryStack.stackPush()) {
    		return glGetProgramResourceLocation(
    			program,
    			programInterface,
    			arena.allocateFrom(name)
    		);
    	}
    }
    
    public static int glGetProgramResourceLocationIndex(
    	int program,
    	int programInterface,
    	MemorySegment name
    ) {
    	MethodHandle method = GLAD_GL_GET_PROGRAM_RESOURCE_LOCATION_INDEX.get();
    	try {
    		return (int) method.invokeExact(
    			program,
    			programInterface,
    			name
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetProgramResourceLocationIndex].
    public static int glGetProgramResourceLocationIndex(
    	int program,
    	int programInterface,
    	String name
    ) {
    	try (Arena arena = MemoryStack.stackPush()) {
    		return glGetProgramResourceLocationIndex(
    			program,
    			programInterface,
    			arena.allocateFrom(name)
    		);
    	}
    }
    
    public static void glShaderStorageBlockBinding(
    	int program,
    	int storageBlockIndex,
    	int storageBlockBinding
    ) {
    	MethodHandle method = GLAD_GL_SHADER_STORAGE_BLOCK_BINDING.get();
    	try {
    		 method.invokeExact(
    			program,
    			storageBlockIndex,
    			storageBlockBinding
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glTexBufferRange(
    	int target,
    	int internalformat,
    	int buffer,
    	long offset,
    	long size
    ) {
    	MethodHandle method = GLAD_GL_TEX_BUFFER_RANGE.get();
    	try {
    		 method.invokeExact(
    			target,
    			internalformat,
    			buffer,
    			offset,
    			size
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glTexStorage2DMultisample(
    	int target,
    	int samples,
    	int internalformat,
    	int width,
    	int height,
    	byte fixedsamplelocations
    ) {
    	MethodHandle method = GLAD_GL_TEX_STORAGE2_DMULTISAMPLE.get();
    	try {
    		 method.invokeExact(
    			target,
    			samples,
    			internalformat,
    			width,
    			height,
    			fixedsamplelocations
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glTexStorage3DMultisample(
    	int target,
    	int samples,
    	int internalformat,
    	int width,
    	int height,
    	int depth,
    	byte fixedsamplelocations
    ) {
    	MethodHandle method = GLAD_GL_TEX_STORAGE3_DMULTISAMPLE.get();
    	try {
    		 method.invokeExact(
    			target,
    			samples,
    			internalformat,
    			width,
    			height,
    			depth,
    			fixedsamplelocations
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glTextureView(
    	int texture,
    	int target,
    	int origtexture,
    	int internalformat,
    	int minlevel,
    	int numlevels,
    	int minlayer,
    	int numlayers
    ) {
    	MethodHandle method = GLAD_GL_TEXTURE_VIEW.get();
    	try {
    		 method.invokeExact(
    			texture,
    			target,
    			origtexture,
    			internalformat,
    			minlevel,
    			numlevels,
    			minlayer,
    			numlayers
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glBindVertexBuffer(
    	int bindingindex,
    	int buffer,
    	long offset,
    	int stride
    ) {
    	MethodHandle method = GLAD_GL_BIND_VERTEX_BUFFER.get();
    	try {
    		 method.invokeExact(
    			bindingindex,
    			buffer,
    			offset,
    			stride
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glVertexAttribFormat(
    	int attribindex,
    	int size,
    	int type,
    	byte normalized,
    	int relativeoffset
    ) {
    	MethodHandle method = GLAD_GL_VERTEX_ATTRIB_FORMAT.get();
    	try {
    		 method.invokeExact(
    			attribindex,
    			size,
    			type,
    			normalized,
    			relativeoffset
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glVertexAttribIFormat(
    	int attribindex,
    	int size,
    	int type,
    	int relativeoffset
    ) {
    	MethodHandle method = GLAD_GL_VERTEX_ATTRIB_IFORMAT.get();
    	try {
    		 method.invokeExact(
    			attribindex,
    			size,
    			type,
    			relativeoffset
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glVertexAttribLFormat(
    	int attribindex,
    	int size,
    	int type,
    	int relativeoffset
    ) {
    	MethodHandle method = GLAD_GL_VERTEX_ATTRIB_LFORMAT.get();
    	try {
    		 method.invokeExact(
    			attribindex,
    			size,
    			type,
    			relativeoffset
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glVertexAttribBinding(
    	int attribindex,
    	int bindingindex
    ) {
    	MethodHandle method = GLAD_GL_VERTEX_ATTRIB_BINDING.get();
    	try {
    		 method.invokeExact(
    			attribindex,
    			bindingindex
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glVertexBindingDivisor(
    	int bindingindex,
    	int divisor
    ) {
    	MethodHandle method = GLAD_GL_VERTEX_BINDING_DIVISOR.get();
    	try {
    		 method.invokeExact(
    			bindingindex,
    			divisor
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glDebugMessageControl(
    	int source,
    	int type,
    	int severity,
    	int count,
    	MemorySegment ids,
    	byte enabled
    ) {
    	MethodHandle method = GLAD_GL_DEBUG_MESSAGE_CONTROL.get();
    	try {
    		 method.invokeExact(
    			source,
    			type,
    			severity,
    			count,
    			ids,
    			enabled
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glDebugMessageControl].
    public static void glDebugMessageControl(
    	int source,
    	int type,
    	int severity,
    	int count,
    	NativeIntArray ids,
    	byte enabled
    ) {
    	glDebugMessageControl(
    		source,
    		type,
    		severity,
    		count,
    		ids.memorySegment(),
    		enabled
    	);
    }
    
    public static void glDebugMessageInsert(
    	int source,
    	int type,
    	int id,
    	int severity,
    	int length,
    	MemorySegment buf
    ) {
    	MethodHandle method = GLAD_GL_DEBUG_MESSAGE_INSERT.get();
    	try {
    		 method.invokeExact(
    			source,
    			type,
    			id,
    			severity,
    			length,
    			buf
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glDebugMessageInsert].
    public static void glDebugMessageInsert(
    	int source,
    	int type,
    	int id,
    	int severity,
    	int length,
    	String buf
    ) {
    	try (Arena arena = MemoryStack.stackPush()) {
    		glDebugMessageInsert(
    			source,
    			type,
    			id,
    			severity,
    			length,
    			arena.allocateFrom(buf)
    		);
    	}
    }
    
    public static void glDebugMessageCallback(
    	MemorySegment callback,
    	MemorySegment userParam
    ) {
    	MethodHandle method = GLAD_GL_DEBUG_MESSAGE_CALLBACK.get();
    	try {
    		 method.invokeExact(
    			callback,
    			userParam
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glDebugMessageCallback].
    public static void glDebugMessageCallback(
    	GLDebugMessageCallback callback,
    	MemorySegment userParam
    ) {
    	glDebugMessageCallback(
    		callback.memorySegment(),
    		userParam
    	);
    }
    
    public static int glGetDebugMessageLog(
    	int count,
    	int bufSize,
    	MemorySegment sources,
    	MemorySegment types,
    	MemorySegment ids,
    	MemorySegment severities,
    	MemorySegment lengths,
    	MemorySegment messageLog
    ) {
    	MethodHandle method = GLAD_GL_GET_DEBUG_MESSAGE_LOG.get();
    	try {
    		return (int) method.invokeExact(
    			count,
    			bufSize,
    			sources,
    			types,
    			ids,
    			severities,
    			lengths,
    			messageLog
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetDebugMessageLog].
    public static int glGetDebugMessageLog(
    	int count,
    	int bufSize,
    	@Nullable NativeIntArray sources,
    	@Nullable NativeIntArray types,
    	@Nullable NativeIntArray ids,
    	@Nullable NativeIntArray severities,
    	@Nullable NativeIntArray lengths,
    	@Nullable NativeByteArray messageLog
    ) {
    	return glGetDebugMessageLog(
    		count,
    		bufSize,
    		sources == null ? MemorySegment.NULL : sources.memorySegment(),
    		types == null ? MemorySegment.NULL : types.memorySegment(),
    		ids == null ? MemorySegment.NULL : ids.memorySegment(),
    		severities == null ? MemorySegment.NULL : severities.memorySegment(),
    		lengths == null ? MemorySegment.NULL : lengths.memorySegment(),
    		messageLog == null ? MemorySegment.NULL : messageLog.memorySegment()
    	);
    }
    
    public static void glPushDebugGroup(
    	int source,
    	int id,
    	int length,
    	MemorySegment message
    ) {
    	MethodHandle method = GLAD_GL_PUSH_DEBUG_GROUP.get();
    	try {
    		 method.invokeExact(
    			source,
    			id,
    			length,
    			message
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glPushDebugGroup].
    public static void glPushDebugGroup(
    	int source,
    	int id,
    	int length,
    	String message
    ) {
    	try (Arena arena = MemoryStack.stackPush()) {
    		glPushDebugGroup(
    			source,
    			id,
    			length,
    			arena.allocateFrom(message)
    		);
    	}
    }
    
    public static void glPopDebugGroup() {
    	MethodHandle method = GLAD_GL_POP_DEBUG_GROUP.get();
    	try {
    		 method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glObjectLabel(
    	int identifier,
    	int name,
    	int length,
    	MemorySegment label
    ) {
    	MethodHandle method = GLAD_GL_OBJECT_LABEL.get();
    	try {
    		 method.invokeExact(
    			identifier,
    			name,
    			length,
    			label
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glObjectLabel].
    public static void glObjectLabel(
    	int identifier,
    	int name,
    	int length,
    	@Nullable NativeByteArray label
    ) {
    	glObjectLabel(
    		identifier,
    		name,
    		length,
    		label == null ? MemorySegment.NULL : label.memorySegment()
    	);
    }
    
    public static void glGetObjectLabel(
    	int identifier,
    	int name,
    	int bufSize,
    	MemorySegment length,
    	MemorySegment label
    ) {
    	MethodHandle method = GLAD_GL_GET_OBJECT_LABEL.get();
    	try {
    		 method.invokeExact(
    			identifier,
    			name,
    			bufSize,
    			length,
    			label
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetObjectLabel].
    public static void glGetObjectLabel(
    	int identifier,
    	int name,
    	int bufSize,
    	NativeIntArray length,
    	NativeByteArray label
    ) {
    	glGetObjectLabel(
    		identifier,
    		name,
    		bufSize,
    		length.memorySegment(),
    		label.memorySegment()
    	);
    }
    
    public static void glObjectPtrLabel(
    	MemorySegment ptr,
    	int length,
    	MemorySegment label
    ) {
    	MethodHandle method = GLAD_GL_OBJECT_PTR_LABEL.get();
    	try {
    		 method.invokeExact(
    			ptr,
    			length,
    			label
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glObjectPtrLabel].
    public static void glObjectPtrLabel(
    	MemorySegment ptr,
    	int length,
    	String label
    ) {
    	try (Arena arena = MemoryStack.stackPush()) {
    		glObjectPtrLabel(
    			ptr,
    			length,
    			arena.allocateFrom(label)
    		);
    	}
    }
    
    public static void glGetObjectPtrLabel(
    	MemorySegment ptr,
    	int bufSize,
    	MemorySegment length,
    	MemorySegment label
    ) {
    	MethodHandle method = GLAD_GL_GET_OBJECT_PTR_LABEL.get();
    	try {
    		 method.invokeExact(
    			ptr,
    			bufSize,
    			length,
    			label
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetObjectPtrLabel].
    public static void glGetObjectPtrLabel(
    	MemorySegment ptr,
    	int bufSize,
    	NativeIntArray length,
    	NativeByteArray label
    ) {
    	glGetObjectPtrLabel(
    		ptr,
    		bufSize,
    		length.memorySegment(),
    		label.memorySegment()
    	);
    }
    
    public static void glGetPointerv(
    	int pname,
    	MemorySegment params
    ) {
    	MethodHandle method = GLAD_GL_GET_POINTERV.get();
    	try {
    		 method.invokeExact(
    			pname,
    			params
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetPointerv].
    public static void glGetPointerv(
    	int pname,
    	NativePointerArray params
    ) {
    	glGetPointerv(
    		pname,
    		params.memorySegment()
    	);
    }
    
    public static void glBufferStorage(
    	int target,
    	long size,
    	MemorySegment data,
    	int flags
    ) {
    	MethodHandle method = GLAD_GL_BUFFER_STORAGE.get();
    	try {
    		 method.invokeExact(
    			target,
    			size,
    			data,
    			flags
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glClearTexImage(
    	int texture,
    	int level,
    	int format,
    	int type,
    	MemorySegment data
    ) {
    	MethodHandle method = GLAD_GL_CLEAR_TEX_IMAGE.get();
    	try {
    		 method.invokeExact(
    			texture,
    			level,
    			format,
    			type,
    			data
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glClearTexSubImage(
    	int texture,
    	int level,
    	int xoffset,
    	int yoffset,
    	int zoffset,
    	int width,
    	int height,
    	int depth,
    	int format,
    	int type,
    	MemorySegment data
    ) {
    	MethodHandle method = GLAD_GL_CLEAR_TEX_SUB_IMAGE.get();
    	try {
    		 method.invokeExact(
    			texture,
    			level,
    			xoffset,
    			yoffset,
    			zoffset,
    			width,
    			height,
    			depth,
    			format,
    			type,
    			data
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glBindBuffersBase(
    	int target,
    	int first,
    	int count,
    	MemorySegment buffers
    ) {
    	MethodHandle method = GLAD_GL_BIND_BUFFERS_BASE.get();
    	try {
    		 method.invokeExact(
    			target,
    			first,
    			count,
    			buffers
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glBindBuffersBase].
    public static void glBindBuffersBase(
    	int target,
    	int first,
    	int count,
    	NativeIntArray buffers
    ) {
    	glBindBuffersBase(
    		target,
    		first,
    		count,
    		buffers.memorySegment()
    	);
    }
    
    public static void glBindBuffersRange(
    	int target,
    	int first,
    	int count,
    	MemorySegment buffers,
    	MemorySegment offsets,
    	MemorySegment sizes
    ) {
    	MethodHandle method = GLAD_GL_BIND_BUFFERS_RANGE.get();
    	try {
    		 method.invokeExact(
    			target,
    			first,
    			count,
    			buffers,
    			offsets,
    			sizes
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glBindBuffersRange].
    public static void glBindBuffersRange(
    	int target,
    	int first,
    	int count,
    	NativeIntArray buffers,
    	NativeLongArray offsets,
    	NativeLongArray sizes
    ) {
    	glBindBuffersRange(
    		target,
    		first,
    		count,
    		buffers.memorySegment(),
    		offsets.memorySegment(),
    		sizes.memorySegment()
    	);
    }
    
    public static void glBindTextures(
    	int first,
    	int count,
    	MemorySegment textures
    ) {
    	MethodHandle method = GLAD_GL_BIND_TEXTURES.get();
    	try {
    		 method.invokeExact(
    			first,
    			count,
    			textures
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glBindTextures].
    public static void glBindTextures(
    	int first,
    	int count,
    	NativeIntArray textures
    ) {
    	glBindTextures(
    		first,
    		count,
    		textures.memorySegment()
    	);
    }
    
    public static void glBindSamplers(
    	int first,
    	int count,
    	MemorySegment samplers
    ) {
    	MethodHandle method = GLAD_GL_BIND_SAMPLERS.get();
    	try {
    		 method.invokeExact(
    			first,
    			count,
    			samplers
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glBindSamplers].
    public static void glBindSamplers(
    	int first,
    	int count,
    	NativeIntArray samplers
    ) {
    	glBindSamplers(
    		first,
    		count,
    		samplers.memorySegment()
    	);
    }
    
    public static void glBindImageTextures(
    	int first,
    	int count,
    	MemorySegment textures
    ) {
    	MethodHandle method = GLAD_GL_BIND_IMAGE_TEXTURES.get();
    	try {
    		 method.invokeExact(
    			first,
    			count,
    			textures
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glBindImageTextures].
    public static void glBindImageTextures(
    	int first,
    	int count,
    	NativeIntArray textures
    ) {
    	glBindImageTextures(
    		first,
    		count,
    		textures.memorySegment()
    	);
    }
    
    public static void glBindVertexBuffers(
    	int first,
    	int count,
    	MemorySegment buffers,
    	MemorySegment offsets,
    	MemorySegment strides
    ) {
    	MethodHandle method = GLAD_GL_BIND_VERTEX_BUFFERS.get();
    	try {
    		 method.invokeExact(
    			first,
    			count,
    			buffers,
    			offsets,
    			strides
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glBindVertexBuffers].
    public static void glBindVertexBuffers(
    	int first,
    	int count,
    	NativeIntArray buffers,
    	NativeLongArray offsets,
    	NativeIntArray strides
    ) {
    	glBindVertexBuffers(
    		first,
    		count,
    		buffers.memorySegment(),
    		offsets.memorySegment(),
    		strides.memorySegment()
    	);
    }
    
    public static void glClipControl(
    	int origin,
    	int depth
    ) {
    	MethodHandle method = GLAD_GL_CLIP_CONTROL.get();
    	try {
    		 method.invokeExact(
    			origin,
    			depth
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glCreateTransformFeedbacks(
    	int n,
    	MemorySegment ids
    ) {
    	MethodHandle method = GLAD_GL_CREATE_TRANSFORM_FEEDBACKS.get();
    	try {
    		 method.invokeExact(
    			n,
    			ids
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glCreateTransformFeedbacks].
    public static void glCreateTransformFeedbacks(
    	int n,
    	NativeIntArray ids
    ) {
    	glCreateTransformFeedbacks(
    		n,
    		ids.memorySegment()
    	);
    }
    
    public static void glTransformFeedbackBufferBase(
    	int xfb,
    	int index,
    	int buffer
    ) {
    	MethodHandle method = GLAD_GL_TRANSFORM_FEEDBACK_BUFFER_BASE.get();
    	try {
    		 method.invokeExact(
    			xfb,
    			index,
    			buffer
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glTransformFeedbackBufferRange(
    	int xfb,
    	int index,
    	int buffer,
    	long offset,
    	long size
    ) {
    	MethodHandle method = GLAD_GL_TRANSFORM_FEEDBACK_BUFFER_RANGE.get();
    	try {
    		 method.invokeExact(
    			xfb,
    			index,
    			buffer,
    			offset,
    			size
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glGetTransformFeedbackiv(
    	int xfb,
    	int pname,
    	MemorySegment param
    ) {
    	MethodHandle method = GLAD_GL_GET_TRANSFORM_FEEDBACKIV.get();
    	try {
    		 method.invokeExact(
    			xfb,
    			pname,
    			param
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetTransformFeedbackiv].
    public static void glGetTransformFeedbackiv(
    	int xfb,
    	int pname,
    	NativeIntArray param
    ) {
    	glGetTransformFeedbackiv(
    		xfb,
    		pname,
    		param.memorySegment()
    	);
    }
    
    public static void glGetTransformFeedbacki_v(
    	int xfb,
    	int pname,
    	int index,
    	MemorySegment param
    ) {
    	MethodHandle method = GLAD_GL_GET_TRANSFORM_FEEDBACKI_V.get();
    	try {
    		 method.invokeExact(
    			xfb,
    			pname,
    			index,
    			param
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetTransformFeedbacki_v].
    public static void glGetTransformFeedbacki_v(
    	int xfb,
    	int pname,
    	int index,
    	NativeIntArray param
    ) {
    	glGetTransformFeedbacki_v(
    		xfb,
    		pname,
    		index,
    		param.memorySegment()
    	);
    }
    
    public static void glGetTransformFeedbacki64_v(
    	int xfb,
    	int pname,
    	int index,
    	MemorySegment param
    ) {
    	MethodHandle method = GLAD_GL_GET_TRANSFORM_FEEDBACKI64_V.get();
    	try {
    		 method.invokeExact(
    			xfb,
    			pname,
    			index,
    			param
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetTransformFeedbacki64_v].
    public static void glGetTransformFeedbacki64_v(
    	int xfb,
    	int pname,
    	int index,
    	NativeLongArray param
    ) {
    	glGetTransformFeedbacki64_v(
    		xfb,
    		pname,
    		index,
    		param.memorySegment()
    	);
    }
    
    public static void glCreateBuffers(
    	int n,
    	MemorySegment buffers
    ) {
    	MethodHandle method = GLAD_GL_CREATE_BUFFERS.get();
    	try {
    		 method.invokeExact(
    			n,
    			buffers
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glCreateBuffers].
    public static void glCreateBuffers(
    	int n,
    	NativeIntArray buffers
    ) {
    	glCreateBuffers(
    		n,
    		buffers.memorySegment()
    	);
    }
    
    public static void glNamedBufferStorage(
    	int buffer,
    	long size,
    	MemorySegment data,
    	int flags
    ) {
    	MethodHandle method = GLAD_GL_NAMED_BUFFER_STORAGE.get();
    	try {
    		 method.invokeExact(
    			buffer,
    			size,
    			data,
    			flags
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glNamedBufferData(
    	int buffer,
    	long size,
    	MemorySegment data,
    	int usage
    ) {
    	MethodHandle method = GLAD_GL_NAMED_BUFFER_DATA.get();
    	try {
    		 method.invokeExact(
    			buffer,
    			size,
    			data,
    			usage
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glNamedBufferSubData(
    	int buffer,
    	long offset,
    	long size,
    	MemorySegment data
    ) {
    	MethodHandle method = GLAD_GL_NAMED_BUFFER_SUB_DATA.get();
    	try {
    		 method.invokeExact(
    			buffer,
    			offset,
    			size,
    			data
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glCopyNamedBufferSubData(
    	int readBuffer,
    	int writeBuffer,
    	long readOffset,
    	long writeOffset,
    	long size
    ) {
    	MethodHandle method = GLAD_GL_COPY_NAMED_BUFFER_SUB_DATA.get();
    	try {
    		 method.invokeExact(
    			readBuffer,
    			writeBuffer,
    			readOffset,
    			writeOffset,
    			size
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glClearNamedBufferData(
    	int buffer,
    	int internalformat,
    	int format,
    	int type,
    	MemorySegment data
    ) {
    	MethodHandle method = GLAD_GL_CLEAR_NAMED_BUFFER_DATA.get();
    	try {
    		 method.invokeExact(
    			buffer,
    			internalformat,
    			format,
    			type,
    			data
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glClearNamedBufferSubData(
    	int buffer,
    	int internalformat,
    	long offset,
    	long size,
    	int format,
    	int type,
    	MemorySegment data
    ) {
    	MethodHandle method = GLAD_GL_CLEAR_NAMED_BUFFER_SUB_DATA.get();
    	try {
    		 method.invokeExact(
    			buffer,
    			internalformat,
    			offset,
    			size,
    			format,
    			type,
    			data
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment glMapNamedBuffer(
    	int buffer,
    	int access
    ) {
    	MethodHandle method = GLAD_GL_MAP_NAMED_BUFFER.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			buffer,
    			access
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static MemorySegment glMapNamedBufferRange(
    	int buffer,
    	long offset,
    	long length,
    	int access
    ) {
    	MethodHandle method = GLAD_GL_MAP_NAMED_BUFFER_RANGE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			buffer,
    			offset,
    			length,
    			access
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static byte glUnmapNamedBuffer(
    	int buffer
    ) {
    	MethodHandle method = GLAD_GL_UNMAP_NAMED_BUFFER.get();
    	try {
    		return (byte) method.invokeExact(
    			buffer
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glFlushMappedNamedBufferRange(
    	int buffer,
    	long offset,
    	long length
    ) {
    	MethodHandle method = GLAD_GL_FLUSH_MAPPED_NAMED_BUFFER_RANGE.get();
    	try {
    		 method.invokeExact(
    			buffer,
    			offset,
    			length
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glGetNamedBufferParameteriv(
    	int buffer,
    	int pname,
    	MemorySegment params
    ) {
    	MethodHandle method = GLAD_GL_GET_NAMED_BUFFER_PARAMETERIV.get();
    	try {
    		 method.invokeExact(
    			buffer,
    			pname,
    			params
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetNamedBufferParameteriv].
    public static void glGetNamedBufferParameteriv(
    	int buffer,
    	int pname,
    	NativeIntArray params
    ) {
    	glGetNamedBufferParameteriv(
    		buffer,
    		pname,
    		params.memorySegment()
    	);
    }
    
    public static void glGetNamedBufferParameteri64v(
    	int buffer,
    	int pname,
    	MemorySegment params
    ) {
    	MethodHandle method = GLAD_GL_GET_NAMED_BUFFER_PARAMETERI64V.get();
    	try {
    		 method.invokeExact(
    			buffer,
    			pname,
    			params
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetNamedBufferParameteri64v].
    public static void glGetNamedBufferParameteri64v(
    	int buffer,
    	int pname,
    	NativeLongArray params
    ) {
    	glGetNamedBufferParameteri64v(
    		buffer,
    		pname,
    		params.memorySegment()
    	);
    }
    
    public static void glGetNamedBufferPointerv(
    	int buffer,
    	int pname,
    	MemorySegment params
    ) {
    	MethodHandle method = GLAD_GL_GET_NAMED_BUFFER_POINTERV.get();
    	try {
    		 method.invokeExact(
    			buffer,
    			pname,
    			params
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetNamedBufferPointerv].
    public static void glGetNamedBufferPointerv(
    	int buffer,
    	int pname,
    	NativePointerArray params
    ) {
    	glGetNamedBufferPointerv(
    		buffer,
    		pname,
    		params.memorySegment()
    	);
    }
    
    public static void glGetNamedBufferSubData(
    	int buffer,
    	long offset,
    	long size,
    	MemorySegment data
    ) {
    	MethodHandle method = GLAD_GL_GET_NAMED_BUFFER_SUB_DATA.get();
    	try {
    		 method.invokeExact(
    			buffer,
    			offset,
    			size,
    			data
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glCreateFramebuffers(
    	int n,
    	MemorySegment framebuffers
    ) {
    	MethodHandle method = GLAD_GL_CREATE_FRAMEBUFFERS.get();
    	try {
    		 method.invokeExact(
    			n,
    			framebuffers
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glCreateFramebuffers].
    public static void glCreateFramebuffers(
    	int n,
    	NativeIntArray framebuffers
    ) {
    	glCreateFramebuffers(
    		n,
    		framebuffers.memorySegment()
    	);
    }
    
    public static void glNamedFramebufferRenderbuffer(
    	int framebuffer,
    	int attachment,
    	int renderbuffertarget,
    	int renderbuffer
    ) {
    	MethodHandle method = GLAD_GL_NAMED_FRAMEBUFFER_RENDERBUFFER.get();
    	try {
    		 method.invokeExact(
    			framebuffer,
    			attachment,
    			renderbuffertarget,
    			renderbuffer
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glNamedFramebufferParameteri(
    	int framebuffer,
    	int pname,
    	int param
    ) {
    	MethodHandle method = GLAD_GL_NAMED_FRAMEBUFFER_PARAMETERI.get();
    	try {
    		 method.invokeExact(
    			framebuffer,
    			pname,
    			param
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glNamedFramebufferTexture(
    	int framebuffer,
    	int attachment,
    	int texture,
    	int level
    ) {
    	MethodHandle method = GLAD_GL_NAMED_FRAMEBUFFER_TEXTURE.get();
    	try {
    		 method.invokeExact(
    			framebuffer,
    			attachment,
    			texture,
    			level
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glNamedFramebufferTextureLayer(
    	int framebuffer,
    	int attachment,
    	int texture,
    	int level,
    	int layer
    ) {
    	MethodHandle method = GLAD_GL_NAMED_FRAMEBUFFER_TEXTURE_LAYER.get();
    	try {
    		 method.invokeExact(
    			framebuffer,
    			attachment,
    			texture,
    			level,
    			layer
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glNamedFramebufferDrawBuffer(
    	int framebuffer,
    	int buf
    ) {
    	MethodHandle method = GLAD_GL_NAMED_FRAMEBUFFER_DRAW_BUFFER.get();
    	try {
    		 method.invokeExact(
    			framebuffer,
    			buf
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glNamedFramebufferDrawBuffers(
    	int framebuffer,
    	int n,
    	MemorySegment bufs
    ) {
    	MethodHandle method = GLAD_GL_NAMED_FRAMEBUFFER_DRAW_BUFFERS.get();
    	try {
    		 method.invokeExact(
    			framebuffer,
    			n,
    			bufs
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glNamedFramebufferDrawBuffers].
    public static void glNamedFramebufferDrawBuffers(
    	int framebuffer,
    	int n,
    	NativeIntArray bufs
    ) {
    	glNamedFramebufferDrawBuffers(
    		framebuffer,
    		n,
    		bufs.memorySegment()
    	);
    }
    
    public static void glNamedFramebufferReadBuffer(
    	int framebuffer,
    	int src
    ) {
    	MethodHandle method = GLAD_GL_NAMED_FRAMEBUFFER_READ_BUFFER.get();
    	try {
    		 method.invokeExact(
    			framebuffer,
    			src
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glInvalidateNamedFramebufferData(
    	int framebuffer,
    	int numAttachments,
    	MemorySegment attachments
    ) {
    	MethodHandle method = GLAD_GL_INVALIDATE_NAMED_FRAMEBUFFER_DATA.get();
    	try {
    		 method.invokeExact(
    			framebuffer,
    			numAttachments,
    			attachments
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glInvalidateNamedFramebufferData].
    public static void glInvalidateNamedFramebufferData(
    	int framebuffer,
    	int numAttachments,
    	NativeIntArray attachments
    ) {
    	glInvalidateNamedFramebufferData(
    		framebuffer,
    		numAttachments,
    		attachments.memorySegment()
    	);
    }
    
    public static void glInvalidateNamedFramebufferSubData(
    	int framebuffer,
    	int numAttachments,
    	MemorySegment attachments,
    	int x,
    	int y,
    	int width,
    	int height
    ) {
    	MethodHandle method = GLAD_GL_INVALIDATE_NAMED_FRAMEBUFFER_SUB_DATA.get();
    	try {
    		 method.invokeExact(
    			framebuffer,
    			numAttachments,
    			attachments,
    			x,
    			y,
    			width,
    			height
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glInvalidateNamedFramebufferSubData].
    public static void glInvalidateNamedFramebufferSubData(
    	int framebuffer,
    	int numAttachments,
    	NativeIntArray attachments,
    	int x,
    	int y,
    	int width,
    	int height
    ) {
    	glInvalidateNamedFramebufferSubData(
    		framebuffer,
    		numAttachments,
    		attachments.memorySegment(),
    		x,
    		y,
    		width,
    		height
    	);
    }
    
    public static void glClearNamedFramebufferiv(
    	int framebuffer,
    	int buffer,
    	int drawbuffer,
    	MemorySegment value
    ) {
    	MethodHandle method = GLAD_GL_CLEAR_NAMED_FRAMEBUFFERIV.get();
    	try {
    		 method.invokeExact(
    			framebuffer,
    			buffer,
    			drawbuffer,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glClearNamedFramebufferiv].
    public static void glClearNamedFramebufferiv(
    	int framebuffer,
    	int buffer,
    	int drawbuffer,
    	NativeIntArray value
    ) {
    	glClearNamedFramebufferiv(
    		framebuffer,
    		buffer,
    		drawbuffer,
    		value.memorySegment()
    	);
    }
    
    public static void glClearNamedFramebufferuiv(
    	int framebuffer,
    	int buffer,
    	int drawbuffer,
    	MemorySegment value
    ) {
    	MethodHandle method = GLAD_GL_CLEAR_NAMED_FRAMEBUFFERUIV.get();
    	try {
    		 method.invokeExact(
    			framebuffer,
    			buffer,
    			drawbuffer,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glClearNamedFramebufferuiv].
    public static void glClearNamedFramebufferuiv(
    	int framebuffer,
    	int buffer,
    	int drawbuffer,
    	NativeIntArray value
    ) {
    	glClearNamedFramebufferuiv(
    		framebuffer,
    		buffer,
    		drawbuffer,
    		value.memorySegment()
    	);
    }
    
    public static void glClearNamedFramebufferfv(
    	int framebuffer,
    	int buffer,
    	int drawbuffer,
    	MemorySegment value
    ) {
    	MethodHandle method = GLAD_GL_CLEAR_NAMED_FRAMEBUFFERFV.get();
    	try {
    		 method.invokeExact(
    			framebuffer,
    			buffer,
    			drawbuffer,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glClearNamedFramebufferfv].
    public static void glClearNamedFramebufferfv(
    	int framebuffer,
    	int buffer,
    	int drawbuffer,
    	NativeFloatArray value
    ) {
    	glClearNamedFramebufferfv(
    		framebuffer,
    		buffer,
    		drawbuffer,
    		value.memorySegment()
    	);
    }
    
    public static void glClearNamedFramebufferfi(
    	int framebuffer,
    	int buffer,
    	int drawbuffer,
    	float depth,
    	int stencil
    ) {
    	MethodHandle method = GLAD_GL_CLEAR_NAMED_FRAMEBUFFERFI.get();
    	try {
    		 method.invokeExact(
    			framebuffer,
    			buffer,
    			drawbuffer,
    			depth,
    			stencil
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glBlitNamedFramebuffer(
    	int readFramebuffer,
    	int drawFramebuffer,
    	int srcX0,
    	int srcY0,
    	int srcX1,
    	int srcY1,
    	int dstX0,
    	int dstY0,
    	int dstX1,
    	int dstY1,
    	int mask,
    	int filter
    ) {
    	MethodHandle method = GLAD_GL_BLIT_NAMED_FRAMEBUFFER.get();
    	try {
    		 method.invokeExact(
    			readFramebuffer,
    			drawFramebuffer,
    			srcX0,
    			srcY0,
    			srcX1,
    			srcY1,
    			dstX0,
    			dstY0,
    			dstX1,
    			dstY1,
    			mask,
    			filter
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static int glCheckNamedFramebufferStatus(
    	int framebuffer,
    	int target
    ) {
    	MethodHandle method = GLAD_GL_CHECK_NAMED_FRAMEBUFFER_STATUS.get();
    	try {
    		return (int) method.invokeExact(
    			framebuffer,
    			target
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glGetNamedFramebufferParameteriv(
    	int framebuffer,
    	int pname,
    	MemorySegment param
    ) {
    	MethodHandle method = GLAD_GL_GET_NAMED_FRAMEBUFFER_PARAMETERIV.get();
    	try {
    		 method.invokeExact(
    			framebuffer,
    			pname,
    			param
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetNamedFramebufferParameteriv].
    public static void glGetNamedFramebufferParameteriv(
    	int framebuffer,
    	int pname,
    	NativeIntArray param
    ) {
    	glGetNamedFramebufferParameteriv(
    		framebuffer,
    		pname,
    		param.memorySegment()
    	);
    }
    
    public static void glGetNamedFramebufferAttachmentParameteriv(
    	int framebuffer,
    	int attachment,
    	int pname,
    	MemorySegment params
    ) {
    	MethodHandle method = GLAD_GL_GET_NAMED_FRAMEBUFFER_ATTACHMENT_PARAMETERIV.get();
    	try {
    		 method.invokeExact(
    			framebuffer,
    			attachment,
    			pname,
    			params
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetNamedFramebufferAttachmentParameteriv].
    public static void glGetNamedFramebufferAttachmentParameteriv(
    	int framebuffer,
    	int attachment,
    	int pname,
    	NativeIntArray params
    ) {
    	glGetNamedFramebufferAttachmentParameteriv(
    		framebuffer,
    		attachment,
    		pname,
    		params.memorySegment()
    	);
    }
    
    public static void glCreateRenderbuffers(
    	int n,
    	MemorySegment renderbuffers
    ) {
    	MethodHandle method = GLAD_GL_CREATE_RENDERBUFFERS.get();
    	try {
    		 method.invokeExact(
    			n,
    			renderbuffers
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glCreateRenderbuffers].
    public static void glCreateRenderbuffers(
    	int n,
    	NativeIntArray renderbuffers
    ) {
    	glCreateRenderbuffers(
    		n,
    		renderbuffers.memorySegment()
    	);
    }
    
    public static void glNamedRenderbufferStorage(
    	int renderbuffer,
    	int internalformat,
    	int width,
    	int height
    ) {
    	MethodHandle method = GLAD_GL_NAMED_RENDERBUFFER_STORAGE.get();
    	try {
    		 method.invokeExact(
    			renderbuffer,
    			internalformat,
    			width,
    			height
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glNamedRenderbufferStorageMultisample(
    	int renderbuffer,
    	int samples,
    	int internalformat,
    	int width,
    	int height
    ) {
    	MethodHandle method = GLAD_GL_NAMED_RENDERBUFFER_STORAGE_MULTISAMPLE.get();
    	try {
    		 method.invokeExact(
    			renderbuffer,
    			samples,
    			internalformat,
    			width,
    			height
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glGetNamedRenderbufferParameteriv(
    	int renderbuffer,
    	int pname,
    	MemorySegment params
    ) {
    	MethodHandle method = GLAD_GL_GET_NAMED_RENDERBUFFER_PARAMETERIV.get();
    	try {
    		 method.invokeExact(
    			renderbuffer,
    			pname,
    			params
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetNamedRenderbufferParameteriv].
    public static void glGetNamedRenderbufferParameteriv(
    	int renderbuffer,
    	int pname,
    	NativeIntArray params
    ) {
    	glGetNamedRenderbufferParameteriv(
    		renderbuffer,
    		pname,
    		params.memorySegment()
    	);
    }
    
    public static void glCreateTextures(
    	int target,
    	int n,
    	MemorySegment textures
    ) {
    	MethodHandle method = GLAD_GL_CREATE_TEXTURES.get();
    	try {
    		 method.invokeExact(
    			target,
    			n,
    			textures
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glCreateTextures].
    public static void glCreateTextures(
    	int target,
    	int n,
    	NativeIntArray textures
    ) {
    	glCreateTextures(
    		target,
    		n,
    		textures.memorySegment()
    	);
    }
    
    public static void glTextureBuffer(
    	int texture,
    	int internalformat,
    	int buffer
    ) {
    	MethodHandle method = GLAD_GL_TEXTURE_BUFFER.get();
    	try {
    		 method.invokeExact(
    			texture,
    			internalformat,
    			buffer
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glTextureBufferRange(
    	int texture,
    	int internalformat,
    	int buffer,
    	long offset,
    	long size
    ) {
    	MethodHandle method = GLAD_GL_TEXTURE_BUFFER_RANGE.get();
    	try {
    		 method.invokeExact(
    			texture,
    			internalformat,
    			buffer,
    			offset,
    			size
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glTextureStorage1D(
    	int texture,
    	int levels,
    	int internalformat,
    	int width
    ) {
    	MethodHandle method = GLAD_GL_TEXTURE_STORAGE1_D.get();
    	try {
    		 method.invokeExact(
    			texture,
    			levels,
    			internalformat,
    			width
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glTextureStorage2D(
    	int texture,
    	int levels,
    	int internalformat,
    	int width,
    	int height
    ) {
    	MethodHandle method = GLAD_GL_TEXTURE_STORAGE2_D.get();
    	try {
    		 method.invokeExact(
    			texture,
    			levels,
    			internalformat,
    			width,
    			height
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glTextureStorage3D(
    	int texture,
    	int levels,
    	int internalformat,
    	int width,
    	int height,
    	int depth
    ) {
    	MethodHandle method = GLAD_GL_TEXTURE_STORAGE3_D.get();
    	try {
    		 method.invokeExact(
    			texture,
    			levels,
    			internalformat,
    			width,
    			height,
    			depth
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glTextureStorage2DMultisample(
    	int texture,
    	int samples,
    	int internalformat,
    	int width,
    	int height,
    	byte fixedsamplelocations
    ) {
    	MethodHandle method = GLAD_GL_TEXTURE_STORAGE2_DMULTISAMPLE.get();
    	try {
    		 method.invokeExact(
    			texture,
    			samples,
    			internalformat,
    			width,
    			height,
    			fixedsamplelocations
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glTextureStorage3DMultisample(
    	int texture,
    	int samples,
    	int internalformat,
    	int width,
    	int height,
    	int depth,
    	byte fixedsamplelocations
    ) {
    	MethodHandle method = GLAD_GL_TEXTURE_STORAGE3_DMULTISAMPLE.get();
    	try {
    		 method.invokeExact(
    			texture,
    			samples,
    			internalformat,
    			width,
    			height,
    			depth,
    			fixedsamplelocations
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glTextureSubImage1D(
    	int texture,
    	int level,
    	int xoffset,
    	int width,
    	int format,
    	int type,
    	MemorySegment pixels
    ) {
    	MethodHandle method = GLAD_GL_TEXTURE_SUB_IMAGE1_D.get();
    	try {
    		 method.invokeExact(
    			texture,
    			level,
    			xoffset,
    			width,
    			format,
    			type,
    			pixels
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glTextureSubImage2D(
    	int texture,
    	int level,
    	int xoffset,
    	int yoffset,
    	int width,
    	int height,
    	int format,
    	int type,
    	MemorySegment pixels
    ) {
    	MethodHandle method = GLAD_GL_TEXTURE_SUB_IMAGE2_D.get();
    	try {
    		 method.invokeExact(
    			texture,
    			level,
    			xoffset,
    			yoffset,
    			width,
    			height,
    			format,
    			type,
    			pixels
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glTextureSubImage3D(
    	int texture,
    	int level,
    	int xoffset,
    	int yoffset,
    	int zoffset,
    	int width,
    	int height,
    	int depth,
    	int format,
    	int type,
    	MemorySegment pixels
    ) {
    	MethodHandle method = GLAD_GL_TEXTURE_SUB_IMAGE3_D.get();
    	try {
    		 method.invokeExact(
    			texture,
    			level,
    			xoffset,
    			yoffset,
    			zoffset,
    			width,
    			height,
    			depth,
    			format,
    			type,
    			pixels
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glCompressedTextureSubImage1D(
    	int texture,
    	int level,
    	int xoffset,
    	int width,
    	int format,
    	int imageSize,
    	MemorySegment data
    ) {
    	MethodHandle method = GLAD_GL_COMPRESSED_TEXTURE_SUB_IMAGE1_D.get();
    	try {
    		 method.invokeExact(
    			texture,
    			level,
    			xoffset,
    			width,
    			format,
    			imageSize,
    			data
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glCompressedTextureSubImage2D(
    	int texture,
    	int level,
    	int xoffset,
    	int yoffset,
    	int width,
    	int height,
    	int format,
    	int imageSize,
    	MemorySegment data
    ) {
    	MethodHandle method = GLAD_GL_COMPRESSED_TEXTURE_SUB_IMAGE2_D.get();
    	try {
    		 method.invokeExact(
    			texture,
    			level,
    			xoffset,
    			yoffset,
    			width,
    			height,
    			format,
    			imageSize,
    			data
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glCompressedTextureSubImage3D(
    	int texture,
    	int level,
    	int xoffset,
    	int yoffset,
    	int zoffset,
    	int width,
    	int height,
    	int depth,
    	int format,
    	int imageSize,
    	MemorySegment data
    ) {
    	MethodHandle method = GLAD_GL_COMPRESSED_TEXTURE_SUB_IMAGE3_D.get();
    	try {
    		 method.invokeExact(
    			texture,
    			level,
    			xoffset,
    			yoffset,
    			zoffset,
    			width,
    			height,
    			depth,
    			format,
    			imageSize,
    			data
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glCopyTextureSubImage1D(
    	int texture,
    	int level,
    	int xoffset,
    	int x,
    	int y,
    	int width
    ) {
    	MethodHandle method = GLAD_GL_COPY_TEXTURE_SUB_IMAGE1_D.get();
    	try {
    		 method.invokeExact(
    			texture,
    			level,
    			xoffset,
    			x,
    			y,
    			width
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glCopyTextureSubImage2D(
    	int texture,
    	int level,
    	int xoffset,
    	int yoffset,
    	int x,
    	int y,
    	int width,
    	int height
    ) {
    	MethodHandle method = GLAD_GL_COPY_TEXTURE_SUB_IMAGE2_D.get();
    	try {
    		 method.invokeExact(
    			texture,
    			level,
    			xoffset,
    			yoffset,
    			x,
    			y,
    			width,
    			height
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glCopyTextureSubImage3D(
    	int texture,
    	int level,
    	int xoffset,
    	int yoffset,
    	int zoffset,
    	int x,
    	int y,
    	int width,
    	int height
    ) {
    	MethodHandle method = GLAD_GL_COPY_TEXTURE_SUB_IMAGE3_D.get();
    	try {
    		 method.invokeExact(
    			texture,
    			level,
    			xoffset,
    			yoffset,
    			zoffset,
    			x,
    			y,
    			width,
    			height
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glTextureParameterf(
    	int texture,
    	int pname,
    	float param
    ) {
    	MethodHandle method = GLAD_GL_TEXTURE_PARAMETERF.get();
    	try {
    		 method.invokeExact(
    			texture,
    			pname,
    			param
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glTextureParameterfv(
    	int texture,
    	int pname,
    	MemorySegment param
    ) {
    	MethodHandle method = GLAD_GL_TEXTURE_PARAMETERFV.get();
    	try {
    		 method.invokeExact(
    			texture,
    			pname,
    			param
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glTextureParameterfv].
    public static void glTextureParameterfv(
    	int texture,
    	int pname,
    	NativeFloatArray param
    ) {
    	glTextureParameterfv(
    		texture,
    		pname,
    		param.memorySegment()
    	);
    }
    
    public static void glTextureParameteri(
    	int texture,
    	int pname,
    	int param
    ) {
    	MethodHandle method = GLAD_GL_TEXTURE_PARAMETERI.get();
    	try {
    		 method.invokeExact(
    			texture,
    			pname,
    			param
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glTextureParameterIiv(
    	int texture,
    	int pname,
    	MemorySegment params
    ) {
    	MethodHandle method = GLAD_GL_TEXTURE_PARAMETER_IIV.get();
    	try {
    		 method.invokeExact(
    			texture,
    			pname,
    			params
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glTextureParameterIiv].
    public static void glTextureParameterIiv(
    	int texture,
    	int pname,
    	NativeIntArray params
    ) {
    	glTextureParameterIiv(
    		texture,
    		pname,
    		params.memorySegment()
    	);
    }
    
    public static void glTextureParameterIuiv(
    	int texture,
    	int pname,
    	MemorySegment params
    ) {
    	MethodHandle method = GLAD_GL_TEXTURE_PARAMETER_IUIV.get();
    	try {
    		 method.invokeExact(
    			texture,
    			pname,
    			params
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glTextureParameterIuiv].
    public static void glTextureParameterIuiv(
    	int texture,
    	int pname,
    	NativeIntArray params
    ) {
    	glTextureParameterIuiv(
    		texture,
    		pname,
    		params.memorySegment()
    	);
    }
    
    public static void glTextureParameteriv(
    	int texture,
    	int pname,
    	MemorySegment param
    ) {
    	MethodHandle method = GLAD_GL_TEXTURE_PARAMETERIV.get();
    	try {
    		 method.invokeExact(
    			texture,
    			pname,
    			param
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glTextureParameteriv].
    public static void glTextureParameteriv(
    	int texture,
    	int pname,
    	NativeIntArray param
    ) {
    	glTextureParameteriv(
    		texture,
    		pname,
    		param.memorySegment()
    	);
    }
    
    public static void glGenerateTextureMipmap(
    	int texture
    ) {
    	MethodHandle method = GLAD_GL_GENERATE_TEXTURE_MIPMAP.get();
    	try {
    		 method.invokeExact(
    			texture
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glBindTextureUnit(
    	int unit,
    	int texture
    ) {
    	MethodHandle method = GLAD_GL_BIND_TEXTURE_UNIT.get();
    	try {
    		 method.invokeExact(
    			unit,
    			texture
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glGetTextureImage(
    	int texture,
    	int level,
    	int format,
    	int type,
    	int bufSize,
    	MemorySegment pixels
    ) {
    	MethodHandle method = GLAD_GL_GET_TEXTURE_IMAGE.get();
    	try {
    		 method.invokeExact(
    			texture,
    			level,
    			format,
    			type,
    			bufSize,
    			pixels
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glGetCompressedTextureImage(
    	int texture,
    	int level,
    	int bufSize,
    	MemorySegment pixels
    ) {
    	MethodHandle method = GLAD_GL_GET_COMPRESSED_TEXTURE_IMAGE.get();
    	try {
    		 method.invokeExact(
    			texture,
    			level,
    			bufSize,
    			pixels
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glGetTextureLevelParameterfv(
    	int texture,
    	int level,
    	int pname,
    	MemorySegment params
    ) {
    	MethodHandle method = GLAD_GL_GET_TEXTURE_LEVEL_PARAMETERFV.get();
    	try {
    		 method.invokeExact(
    			texture,
    			level,
    			pname,
    			params
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetTextureLevelParameterfv].
    public static void glGetTextureLevelParameterfv(
    	int texture,
    	int level,
    	int pname,
    	NativeFloatArray params
    ) {
    	glGetTextureLevelParameterfv(
    		texture,
    		level,
    		pname,
    		params.memorySegment()
    	);
    }
    
    public static void glGetTextureLevelParameteriv(
    	int texture,
    	int level,
    	int pname,
    	MemorySegment params
    ) {
    	MethodHandle method = GLAD_GL_GET_TEXTURE_LEVEL_PARAMETERIV.get();
    	try {
    		 method.invokeExact(
    			texture,
    			level,
    			pname,
    			params
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetTextureLevelParameteriv].
    public static void glGetTextureLevelParameteriv(
    	int texture,
    	int level,
    	int pname,
    	NativeIntArray params
    ) {
    	glGetTextureLevelParameteriv(
    		texture,
    		level,
    		pname,
    		params.memorySegment()
    	);
    }
    
    public static void glGetTextureParameterfv(
    	int texture,
    	int pname,
    	MemorySegment params
    ) {
    	MethodHandle method = GLAD_GL_GET_TEXTURE_PARAMETERFV.get();
    	try {
    		 method.invokeExact(
    			texture,
    			pname,
    			params
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetTextureParameterfv].
    public static void glGetTextureParameterfv(
    	int texture,
    	int pname,
    	NativeFloatArray params
    ) {
    	glGetTextureParameterfv(
    		texture,
    		pname,
    		params.memorySegment()
    	);
    }
    
    public static void glGetTextureParameterIiv(
    	int texture,
    	int pname,
    	MemorySegment params
    ) {
    	MethodHandle method = GLAD_GL_GET_TEXTURE_PARAMETER_IIV.get();
    	try {
    		 method.invokeExact(
    			texture,
    			pname,
    			params
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetTextureParameterIiv].
    public static void glGetTextureParameterIiv(
    	int texture,
    	int pname,
    	NativeIntArray params
    ) {
    	glGetTextureParameterIiv(
    		texture,
    		pname,
    		params.memorySegment()
    	);
    }
    
    public static void glGetTextureParameterIuiv(
    	int texture,
    	int pname,
    	MemorySegment params
    ) {
    	MethodHandle method = GLAD_GL_GET_TEXTURE_PARAMETER_IUIV.get();
    	try {
    		 method.invokeExact(
    			texture,
    			pname,
    			params
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetTextureParameterIuiv].
    public static void glGetTextureParameterIuiv(
    	int texture,
    	int pname,
    	NativeIntArray params
    ) {
    	glGetTextureParameterIuiv(
    		texture,
    		pname,
    		params.memorySegment()
    	);
    }
    
    public static void glGetTextureParameteriv(
    	int texture,
    	int pname,
    	MemorySegment params
    ) {
    	MethodHandle method = GLAD_GL_GET_TEXTURE_PARAMETERIV.get();
    	try {
    		 method.invokeExact(
    			texture,
    			pname,
    			params
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetTextureParameteriv].
    public static void glGetTextureParameteriv(
    	int texture,
    	int pname,
    	NativeIntArray params
    ) {
    	glGetTextureParameteriv(
    		texture,
    		pname,
    		params.memorySegment()
    	);
    }
    
    public static void glCreateVertexArrays(
    	int n,
    	MemorySegment arrays
    ) {
    	MethodHandle method = GLAD_GL_CREATE_VERTEX_ARRAYS.get();
    	try {
    		 method.invokeExact(
    			n,
    			arrays
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glCreateVertexArrays].
    public static void glCreateVertexArrays(
    	int n,
    	NativeIntArray arrays
    ) {
    	glCreateVertexArrays(
    		n,
    		arrays.memorySegment()
    	);
    }
    
    public static void glDisableVertexArrayAttrib(
    	int vaobj,
    	int index
    ) {
    	MethodHandle method = GLAD_GL_DISABLE_VERTEX_ARRAY_ATTRIB.get();
    	try {
    		 method.invokeExact(
    			vaobj,
    			index
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glEnableVertexArrayAttrib(
    	int vaobj,
    	int index
    ) {
    	MethodHandle method = GLAD_GL_ENABLE_VERTEX_ARRAY_ATTRIB.get();
    	try {
    		 method.invokeExact(
    			vaobj,
    			index
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glVertexArrayElementBuffer(
    	int vaobj,
    	int buffer
    ) {
    	MethodHandle method = GLAD_GL_VERTEX_ARRAY_ELEMENT_BUFFER.get();
    	try {
    		 method.invokeExact(
    			vaobj,
    			buffer
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glVertexArrayVertexBuffer(
    	int vaobj,
    	int bindingindex,
    	int buffer,
    	long offset,
    	int stride
    ) {
    	MethodHandle method = GLAD_GL_VERTEX_ARRAY_VERTEX_BUFFER.get();
    	try {
    		 method.invokeExact(
    			vaobj,
    			bindingindex,
    			buffer,
    			offset,
    			stride
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glVertexArrayVertexBuffers(
    	int vaobj,
    	int first,
    	int count,
    	MemorySegment buffers,
    	MemorySegment offsets,
    	MemorySegment strides
    ) {
    	MethodHandle method = GLAD_GL_VERTEX_ARRAY_VERTEX_BUFFERS.get();
    	try {
    		 method.invokeExact(
    			vaobj,
    			first,
    			count,
    			buffers,
    			offsets,
    			strides
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glVertexArrayVertexBuffers].
    public static void glVertexArrayVertexBuffers(
    	int vaobj,
    	int first,
    	int count,
    	NativeIntArray buffers,
    	NativeLongArray offsets,
    	NativeIntArray strides
    ) {
    	glVertexArrayVertexBuffers(
    		vaobj,
    		first,
    		count,
    		buffers.memorySegment(),
    		offsets.memorySegment(),
    		strides.memorySegment()
    	);
    }
    
    public static void glVertexArrayAttribBinding(
    	int vaobj,
    	int attribindex,
    	int bindingindex
    ) {
    	MethodHandle method = GLAD_GL_VERTEX_ARRAY_ATTRIB_BINDING.get();
    	try {
    		 method.invokeExact(
    			vaobj,
    			attribindex,
    			bindingindex
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glVertexArrayAttribFormat(
    	int vaobj,
    	int attribindex,
    	int size,
    	int type,
    	byte normalized,
    	int relativeoffset
    ) {
    	MethodHandle method = GLAD_GL_VERTEX_ARRAY_ATTRIB_FORMAT.get();
    	try {
    		 method.invokeExact(
    			vaobj,
    			attribindex,
    			size,
    			type,
    			normalized,
    			relativeoffset
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glVertexArrayAttribIFormat(
    	int vaobj,
    	int attribindex,
    	int size,
    	int type,
    	int relativeoffset
    ) {
    	MethodHandle method = GLAD_GL_VERTEX_ARRAY_ATTRIB_IFORMAT.get();
    	try {
    		 method.invokeExact(
    			vaobj,
    			attribindex,
    			size,
    			type,
    			relativeoffset
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glVertexArrayAttribLFormat(
    	int vaobj,
    	int attribindex,
    	int size,
    	int type,
    	int relativeoffset
    ) {
    	MethodHandle method = GLAD_GL_VERTEX_ARRAY_ATTRIB_LFORMAT.get();
    	try {
    		 method.invokeExact(
    			vaobj,
    			attribindex,
    			size,
    			type,
    			relativeoffset
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glVertexArrayBindingDivisor(
    	int vaobj,
    	int bindingindex,
    	int divisor
    ) {
    	MethodHandle method = GLAD_GL_VERTEX_ARRAY_BINDING_DIVISOR.get();
    	try {
    		 method.invokeExact(
    			vaobj,
    			bindingindex,
    			divisor
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glGetVertexArrayiv(
    	int vaobj,
    	int pname,
    	MemorySegment param
    ) {
    	MethodHandle method = GLAD_GL_GET_VERTEX_ARRAYIV.get();
    	try {
    		 method.invokeExact(
    			vaobj,
    			pname,
    			param
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetVertexArrayiv].
    public static void glGetVertexArrayiv(
    	int vaobj,
    	int pname,
    	NativeIntArray param
    ) {
    	glGetVertexArrayiv(
    		vaobj,
    		pname,
    		param.memorySegment()
    	);
    }
    
    public static void glGetVertexArrayIndexediv(
    	int vaobj,
    	int index,
    	int pname,
    	MemorySegment param
    ) {
    	MethodHandle method = GLAD_GL_GET_VERTEX_ARRAY_INDEXEDIV.get();
    	try {
    		 method.invokeExact(
    			vaobj,
    			index,
    			pname,
    			param
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetVertexArrayIndexediv].
    public static void glGetVertexArrayIndexediv(
    	int vaobj,
    	int index,
    	int pname,
    	NativeIntArray param
    ) {
    	glGetVertexArrayIndexediv(
    		vaobj,
    		index,
    		pname,
    		param.memorySegment()
    	);
    }
    
    public static void glGetVertexArrayIndexed64iv(
    	int vaobj,
    	int index,
    	int pname,
    	MemorySegment param
    ) {
    	MethodHandle method = GLAD_GL_GET_VERTEX_ARRAY_INDEXED64IV.get();
    	try {
    		 method.invokeExact(
    			vaobj,
    			index,
    			pname,
    			param
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetVertexArrayIndexed64iv].
    public static void glGetVertexArrayIndexed64iv(
    	int vaobj,
    	int index,
    	int pname,
    	NativeLongArray param
    ) {
    	glGetVertexArrayIndexed64iv(
    		vaobj,
    		index,
    		pname,
    		param.memorySegment()
    	);
    }
    
    public static void glCreateSamplers(
    	int n,
    	MemorySegment samplers
    ) {
    	MethodHandle method = GLAD_GL_CREATE_SAMPLERS.get();
    	try {
    		 method.invokeExact(
    			n,
    			samplers
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glCreateSamplers].
    public static void glCreateSamplers(
    	int n,
    	NativeIntArray samplers
    ) {
    	glCreateSamplers(
    		n,
    		samplers.memorySegment()
    	);
    }
    
    public static void glCreateProgramPipelines(
    	int n,
    	MemorySegment pipelines
    ) {
    	MethodHandle method = GLAD_GL_CREATE_PROGRAM_PIPELINES.get();
    	try {
    		 method.invokeExact(
    			n,
    			pipelines
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glCreateProgramPipelines].
    public static void glCreateProgramPipelines(
    	int n,
    	NativeIntArray pipelines
    ) {
    	glCreateProgramPipelines(
    		n,
    		pipelines.memorySegment()
    	);
    }
    
    public static void glCreateQueries(
    	int target,
    	int n,
    	MemorySegment ids
    ) {
    	MethodHandle method = GLAD_GL_CREATE_QUERIES.get();
    	try {
    		 method.invokeExact(
    			target,
    			n,
    			ids
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glCreateQueries].
    public static void glCreateQueries(
    	int target,
    	int n,
    	NativeIntArray ids
    ) {
    	glCreateQueries(
    		target,
    		n,
    		ids.memorySegment()
    	);
    }
    
    public static void glGetQueryBufferObjecti64v(
    	int id,
    	int buffer,
    	int pname,
    	long offset
    ) {
    	MethodHandle method = GLAD_GL_GET_QUERY_BUFFER_OBJECTI64V.get();
    	try {
    		 method.invokeExact(
    			id,
    			buffer,
    			pname,
    			offset
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glGetQueryBufferObjectiv(
    	int id,
    	int buffer,
    	int pname,
    	long offset
    ) {
    	MethodHandle method = GLAD_GL_GET_QUERY_BUFFER_OBJECTIV.get();
    	try {
    		 method.invokeExact(
    			id,
    			buffer,
    			pname,
    			offset
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glGetQueryBufferObjectui64v(
    	int id,
    	int buffer,
    	int pname,
    	long offset
    ) {
    	MethodHandle method = GLAD_GL_GET_QUERY_BUFFER_OBJECTUI64V.get();
    	try {
    		 method.invokeExact(
    			id,
    			buffer,
    			pname,
    			offset
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glGetQueryBufferObjectuiv(
    	int id,
    	int buffer,
    	int pname,
    	long offset
    ) {
    	MethodHandle method = GLAD_GL_GET_QUERY_BUFFER_OBJECTUIV.get();
    	try {
    		 method.invokeExact(
    			id,
    			buffer,
    			pname,
    			offset
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glMemoryBarrierByRegion(
    	int barriers
    ) {
    	MethodHandle method = GLAD_GL_MEMORY_BARRIER_BY_REGION.get();
    	try {
    		 method.invokeExact(
    			barriers
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glGetTextureSubImage(
    	int texture,
    	int level,
    	int xoffset,
    	int yoffset,
    	int zoffset,
    	int width,
    	int height,
    	int depth,
    	int format,
    	int type,
    	int bufSize,
    	MemorySegment pixels
    ) {
    	MethodHandle method = GLAD_GL_GET_TEXTURE_SUB_IMAGE.get();
    	try {
    		 method.invokeExact(
    			texture,
    			level,
    			xoffset,
    			yoffset,
    			zoffset,
    			width,
    			height,
    			depth,
    			format,
    			type,
    			bufSize,
    			pixels
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glGetCompressedTextureSubImage(
    	int texture,
    	int level,
    	int xoffset,
    	int yoffset,
    	int zoffset,
    	int width,
    	int height,
    	int depth,
    	int bufSize,
    	MemorySegment pixels
    ) {
    	MethodHandle method = GLAD_GL_GET_COMPRESSED_TEXTURE_SUB_IMAGE.get();
    	try {
    		 method.invokeExact(
    			texture,
    			level,
    			xoffset,
    			yoffset,
    			zoffset,
    			width,
    			height,
    			depth,
    			bufSize,
    			pixels
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static int glGetGraphicsResetStatus() {
    	MethodHandle method = GLAD_GL_GET_GRAPHICS_RESET_STATUS.get();
    	try {
    		return (int) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glGetnCompressedTexImage(
    	int target,
    	int lod,
    	int bufSize,
    	MemorySegment pixels
    ) {
    	MethodHandle method = GLAD_GL_GETN_COMPRESSED_TEX_IMAGE.get();
    	try {
    		 method.invokeExact(
    			target,
    			lod,
    			bufSize,
    			pixels
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glGetnTexImage(
    	int target,
    	int level,
    	int format,
    	int type,
    	int bufSize,
    	MemorySegment pixels
    ) {
    	MethodHandle method = GLAD_GL_GETN_TEX_IMAGE.get();
    	try {
    		 method.invokeExact(
    			target,
    			level,
    			format,
    			type,
    			bufSize,
    			pixels
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glGetnUniformdv(
    	int program,
    	int location,
    	int bufSize,
    	MemorySegment params
    ) {
    	MethodHandle method = GLAD_GL_GETN_UNIFORMDV.get();
    	try {
    		 method.invokeExact(
    			program,
    			location,
    			bufSize,
    			params
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetnUniformdv].
    public static void glGetnUniformdv(
    	int program,
    	int location,
    	int bufSize,
    	NativeDoubleArray params
    ) {
    	glGetnUniformdv(
    		program,
    		location,
    		bufSize,
    		params.memorySegment()
    	);
    }
    
    public static void glGetnUniformfv(
    	int program,
    	int location,
    	int bufSize,
    	MemorySegment params
    ) {
    	MethodHandle method = GLAD_GL_GETN_UNIFORMFV.get();
    	try {
    		 method.invokeExact(
    			program,
    			location,
    			bufSize,
    			params
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetnUniformfv].
    public static void glGetnUniformfv(
    	int program,
    	int location,
    	int bufSize,
    	NativeFloatArray params
    ) {
    	glGetnUniformfv(
    		program,
    		location,
    		bufSize,
    		params.memorySegment()
    	);
    }
    
    public static void glGetnUniformiv(
    	int program,
    	int location,
    	int bufSize,
    	MemorySegment params
    ) {
    	MethodHandle method = GLAD_GL_GETN_UNIFORMIV.get();
    	try {
    		 method.invokeExact(
    			program,
    			location,
    			bufSize,
    			params
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetnUniformiv].
    public static void glGetnUniformiv(
    	int program,
    	int location,
    	int bufSize,
    	NativeIntArray params
    ) {
    	glGetnUniformiv(
    		program,
    		location,
    		bufSize,
    		params.memorySegment()
    	);
    }
    
    public static void glGetnUniformuiv(
    	int program,
    	int location,
    	int bufSize,
    	MemorySegment params
    ) {
    	MethodHandle method = GLAD_GL_GETN_UNIFORMUIV.get();
    	try {
    		 method.invokeExact(
    			program,
    			location,
    			bufSize,
    			params
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetnUniformuiv].
    public static void glGetnUniformuiv(
    	int program,
    	int location,
    	int bufSize,
    	NativeIntArray params
    ) {
    	glGetnUniformuiv(
    		program,
    		location,
    		bufSize,
    		params.memorySegment()
    	);
    }
    
    public static void glReadnPixels(
    	int x,
    	int y,
    	int width,
    	int height,
    	int format,
    	int type,
    	int bufSize,
    	MemorySegment data
    ) {
    	MethodHandle method = GLAD_GL_READN_PIXELS.get();
    	try {
    		 method.invokeExact(
    			x,
    			y,
    			width,
    			height,
    			format,
    			type,
    			bufSize,
    			data
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glGetnMapdv(
    	int target,
    	int query,
    	int bufSize,
    	MemorySegment v
    ) {
    	MethodHandle method = GLAD_GL_GETN_MAPDV.get();
    	try {
    		 method.invokeExact(
    			target,
    			query,
    			bufSize,
    			v
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetnMapdv].
    public static void glGetnMapdv(
    	int target,
    	int query,
    	int bufSize,
    	NativeDoubleArray v
    ) {
    	glGetnMapdv(
    		target,
    		query,
    		bufSize,
    		v.memorySegment()
    	);
    }
    
    public static void glGetnMapfv(
    	int target,
    	int query,
    	int bufSize,
    	MemorySegment v
    ) {
    	MethodHandle method = GLAD_GL_GETN_MAPFV.get();
    	try {
    		 method.invokeExact(
    			target,
    			query,
    			bufSize,
    			v
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetnMapfv].
    public static void glGetnMapfv(
    	int target,
    	int query,
    	int bufSize,
    	NativeFloatArray v
    ) {
    	glGetnMapfv(
    		target,
    		query,
    		bufSize,
    		v.memorySegment()
    	);
    }
    
    public static void glGetnMapiv(
    	int target,
    	int query,
    	int bufSize,
    	MemorySegment v
    ) {
    	MethodHandle method = GLAD_GL_GETN_MAPIV.get();
    	try {
    		 method.invokeExact(
    			target,
    			query,
    			bufSize,
    			v
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetnMapiv].
    public static void glGetnMapiv(
    	int target,
    	int query,
    	int bufSize,
    	NativeIntArray v
    ) {
    	glGetnMapiv(
    		target,
    		query,
    		bufSize,
    		v.memorySegment()
    	);
    }
    
    public static void glGetnPixelMapfv(
    	int map,
    	int bufSize,
    	MemorySegment values
    ) {
    	MethodHandle method = GLAD_GL_GETN_PIXEL_MAPFV.get();
    	try {
    		 method.invokeExact(
    			map,
    			bufSize,
    			values
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetnPixelMapfv].
    public static void glGetnPixelMapfv(
    	int map,
    	int bufSize,
    	NativeFloatArray values
    ) {
    	glGetnPixelMapfv(
    		map,
    		bufSize,
    		values.memorySegment()
    	);
    }
    
    public static void glGetnPixelMapuiv(
    	int map,
    	int bufSize,
    	MemorySegment values
    ) {
    	MethodHandle method = GLAD_GL_GETN_PIXEL_MAPUIV.get();
    	try {
    		 method.invokeExact(
    			map,
    			bufSize,
    			values
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetnPixelMapuiv].
    public static void glGetnPixelMapuiv(
    	int map,
    	int bufSize,
    	NativeIntArray values
    ) {
    	glGetnPixelMapuiv(
    		map,
    		bufSize,
    		values.memorySegment()
    	);
    }
    
    public static void glGetnPixelMapusv(
    	int map,
    	int bufSize,
    	MemorySegment values
    ) {
    	MethodHandle method = GLAD_GL_GETN_PIXEL_MAPUSV.get();
    	try {
    		 method.invokeExact(
    			map,
    			bufSize,
    			values
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetnPixelMapusv].
    public static void glGetnPixelMapusv(
    	int map,
    	int bufSize,
    	NativeShortArray values
    ) {
    	glGetnPixelMapusv(
    		map,
    		bufSize,
    		values.memorySegment()
    	);
    }
    
    public static void glGetnPolygonStipple(
    	int bufSize,
    	MemorySegment pattern
    ) {
    	MethodHandle method = GLAD_GL_GETN_POLYGON_STIPPLE.get();
    	try {
    		 method.invokeExact(
    			bufSize,
    			pattern
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glGetnPolygonStipple].
    public static void glGetnPolygonStipple(
    	int bufSize,
    	NativeByteArray pattern
    ) {
    	glGetnPolygonStipple(
    		bufSize,
    		pattern.memorySegment()
    	);
    }
    
    public static void glGetnColorTable(
    	int target,
    	int format,
    	int type,
    	int bufSize,
    	MemorySegment table
    ) {
    	MethodHandle method = GLAD_GL_GETN_COLOR_TABLE.get();
    	try {
    		 method.invokeExact(
    			target,
    			format,
    			type,
    			bufSize,
    			table
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glGetnConvolutionFilter(
    	int target,
    	int format,
    	int type,
    	int bufSize,
    	MemorySegment image
    ) {
    	MethodHandle method = GLAD_GL_GETN_CONVOLUTION_FILTER.get();
    	try {
    		 method.invokeExact(
    			target,
    			format,
    			type,
    			bufSize,
    			image
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glGetnSeparableFilter(
    	int target,
    	int format,
    	int type,
    	int rowBufSize,
    	MemorySegment row,
    	int columnBufSize,
    	MemorySegment column,
    	MemorySegment span
    ) {
    	MethodHandle method = GLAD_GL_GETN_SEPARABLE_FILTER.get();
    	try {
    		 method.invokeExact(
    			target,
    			format,
    			type,
    			rowBufSize,
    			row,
    			columnBufSize,
    			column,
    			span
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glGetnHistogram(
    	int target,
    	byte reset,
    	int format,
    	int type,
    	int bufSize,
    	MemorySegment values
    ) {
    	MethodHandle method = GLAD_GL_GETN_HISTOGRAM.get();
    	try {
    		 method.invokeExact(
    			target,
    			reset,
    			format,
    			type,
    			bufSize,
    			values
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glGetnMinmax(
    	int target,
    	byte reset,
    	int format,
    	int type,
    	int bufSize,
    	MemorySegment values
    ) {
    	MethodHandle method = GLAD_GL_GETN_MINMAX.get();
    	try {
    		 method.invokeExact(
    			target,
    			reset,
    			format,
    			type,
    			bufSize,
    			values
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glTextureBarrier() {
    	MethodHandle method = GLAD_GL_TEXTURE_BARRIER.get();
    	try {
    		 method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glSpecializeShader(
    	int shader,
    	MemorySegment pEntryPoint,
    	int numSpecializationConstants,
    	MemorySegment pConstantIndex,
    	MemorySegment pConstantValue
    ) {
    	MethodHandle method = GLAD_GL_SPECIALIZE_SHADER.get();
    	try {
    		 method.invokeExact(
    			shader,
    			pEntryPoint,
    			numSpecializationConstants,
    			pConstantIndex,
    			pConstantValue
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#glSpecializeShader].
    public static void glSpecializeShader(
    	int shader,
    	String pEntryPoint,
    	int numSpecializationConstants,
    	NativeIntArray pConstantIndex,
    	NativeIntArray pConstantValue
    ) {
    	try (Arena arena = MemoryStack.stackPush()) {
    		glSpecializeShader(
    			shader,
    			arena.allocateFrom(pEntryPoint),
    			numSpecializationConstants,
    			pConstantIndex.memorySegment(),
    			pConstantValue.memorySegment()
    		);
    	}
    }
    
    public static void glMultiDrawArraysIndirectCount(
    	int mode,
    	MemorySegment indirect,
    	long drawcount,
    	int maxdrawcount,
    	int stride
    ) {
    	MethodHandle method = GLAD_GL_MULTI_DRAW_ARRAYS_INDIRECT_COUNT.get();
    	try {
    		 method.invokeExact(
    			mode,
    			indirect,
    			drawcount,
    			maxdrawcount,
    			stride
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glMultiDrawElementsIndirectCount(
    	int mode,
    	int type,
    	MemorySegment indirect,
    	long drawcount,
    	int maxdrawcount,
    	int stride
    ) {
    	MethodHandle method = GLAD_GL_MULTI_DRAW_ELEMENTS_INDIRECT_COUNT.get();
    	try {
    		 method.invokeExact(
    			mode,
    			type,
    			indirect,
    			drawcount,
    			maxdrawcount,
    			stride
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void glPolygonOffsetClamp(
    	float factor,
    	float units,
    	float clamp
    ) {
    	MethodHandle method = GLAD_GL_POLYGON_OFFSET_CLAMP.get();
    	try {
    		 method.invokeExact(
    			factor,
    			units,
    			clamp
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }

}