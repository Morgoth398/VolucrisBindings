/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.msdfgen;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import volucris.bindings.core.MemoryStack;
import volucris.bindings.core.NativeDoubleArray;
import volucris.bindings.core.NativeIntArray;
import volucris.bindings.core.NativeLongArray;
import volucris.bindings.core.NativePointerArray;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class Msdfgen {

    public static final int MSDF_FALSE = 0;
    public static final int MSDF_TRUE = 1;
    public static final int MSDF_SUCCESS = 0;
    public static final int MSDF_ERR_FAILED = 1;
    public static final int MSDF_ERR_INVALID_ARG = 2;
    public static final int MSDF_ERR_INVALID_TYPE = 3;
    public static final int MSDF_ERR_INVALID_SIZE = 4;
    public static final int MSDF_ERR_INVALID_INDEX = 5;
    public static final int MSDF_BITMAP_TYPE_SDF = 0;
    public static final int MSDF_BITMAP_TYPE_PSDF = 1;
    public static final int MSDF_BITMAP_TYPE_MSDF = 2;
    public static final int MSDF_BITMAP_TYPE_MTSDF = 3;
    public static final int MSDF_BITMAP_TYPE_MAX = MSDF_BITMAP_TYPE_MTSDF;
    public static final int MSDF_SEGMENT_TYPE_LINEAR = 0;
    public static final int MSDF_SEGMENT_TYPE_QUADRATIC = 1;
    public static final int MSDF_SEGMENT_TYPE_CUBIC = 2;
    public static final int MSDF_SEGMENT_TYPE_MAX = MSDF_SEGMENT_TYPE_CUBIC;
    public static final int MSDF_EDGE_COLOR_BLACK = 0;
    public static final int MSDF_EDGE_COLOR_RED = 1;
    public static final int MSDF_EDGE_COLOR_GREEN = 2;
    public static final int MSDF_EDGE_COLOR_YELLOW = 3;
    public static final int MSDF_EDGE_COLOR_BLUE = 4;
    public static final int MSDF_EDGE_COLOR_MAGENTA = 5;
    public static final int MSDF_EDGE_COLOR_CYAN = 6;
    public static final int MSDF_EDGE_COLOR_WHITE = 7;
    public static final int MSDF_ORIENTATION_Y_UPWARD = 0;
    public static final int MSDF_ORIENTATION_Y_DOWNWARD = 1;
    public static final int MSDF_ERROR_CORRECTION_MODE_DISABLED = 0;
    public static final int MSDF_ERROR_CORRECTION_MODE_INDISCRIMINATE = 1;
    public static final int MSDF_ERROR_CORRECTION_MODE_EDGE_PRIORITY = 2;
    public static final int MSDF_ERROR_CORRECTION_MODE_EDGE_ONLY = 3;
    public static final int MSDF_DISTANCE_CHECK_MODE_NONE = 0;
    public static final int MSDF_DISTANCE_CHECK_MODE_AT_EDGE = 1;
    public static final int MSDF_DISTANCE_CHECK_MODE_ALWAYS = 2;

    private static final LazyConstant<MethodHandle> MSDF_BITMAP_ALLOC;
    private static final LazyConstant<MethodHandle> MSDF_BITMAP_GET_CHANNEL_COUNT;
    private static final LazyConstant<MethodHandle> MSDF_BITMAP_GET_PIXELS;
    private static final LazyConstant<MethodHandle> MSDF_BITMAP_GET_BYTE_SIZE;
    private static final LazyConstant<MethodHandle> MSDF_BITMAP_FREE;
    private static final LazyConstant<MethodHandle> MSDF_SHAPE_ALLOC;
    private static final LazyConstant<MethodHandle> MSDF_SHAPE_GET_BOUNDS;
    private static final LazyConstant<MethodHandle> MSDF_SHAPE_ADD_CONTOUR;
    private static final LazyConstant<MethodHandle> MSDF_SHAPE_REMOVE_CONTOUR;
    private static final LazyConstant<MethodHandle> MSDF_SHAPE_GET_CONTOUR_COUNT;
    private static final LazyConstant<MethodHandle> MSDF_SHAPE_GET_CONTOUR;
    private static final LazyConstant<MethodHandle> MSDF_SHAPE_GET_EDGE_COUNT;
    private static final LazyConstant<MethodHandle> MSDF_SHAPE_GET_Y_AXIS_ORIENTATION;
    private static final LazyConstant<MethodHandle> MSDF_SHAPE_SET_Y_AXIS_ORIENTATION;
    private static final LazyConstant<MethodHandle> MSDF_SHAPE_NORMALIZE;
    private static final LazyConstant<MethodHandle> MSDF_SHAPE_VALIDATE;
    private static final LazyConstant<MethodHandle> MSDF_SHAPE_BOUND;
    private static final LazyConstant<MethodHandle> MSDF_SHAPE_BOUND_MITERS;
    private static final LazyConstant<MethodHandle> MSDF_SHAPE_ORIENT_CONTOURS;
    private static final LazyConstant<MethodHandle> MSDF_SHAPE_EDGE_COLORS_SIMPLE;
    private static final LazyConstant<MethodHandle> MSDF_SHAPE_EDGE_COLORS_INK_TRAP;
    private static final LazyConstant<MethodHandle> MSDF_SHAPE_EDGE_COLORS_BY_DISTANCE;
    private static final LazyConstant<MethodHandle> MSDF_SHAPE_ONE_SHOT_DISTANCE;
    private static final LazyConstant<MethodHandle> MSDF_SHAPE_FREE;
    private static final LazyConstant<MethodHandle> MSDF_CONTOUR_ALLOC;
    private static final LazyConstant<MethodHandle> MSDF_CONTOUR_ADD_EDGE;
    private static final LazyConstant<MethodHandle> MSDF_CONTOUR_REMOVE_EDGE;
    private static final LazyConstant<MethodHandle> MSDF_CONTOUR_GET_EDGE_COUNT;
    private static final LazyConstant<MethodHandle> MSDF_CONTOUR_GET_EDGE;
    private static final LazyConstant<MethodHandle> MSDF_CONTOUR_BOUND;
    private static final LazyConstant<MethodHandle> MSDF_CONTOUR_BOUND_MITERS;
    private static final LazyConstant<MethodHandle> MSDF_CONTOUR_GET_WINDING;
    private static final LazyConstant<MethodHandle> MSDF_CONTOUR_REVERSE;
    private static final LazyConstant<MethodHandle> MSDF_CONTOUR_FREE;
    private static final LazyConstant<MethodHandle> MSDF_SEGMENT_ALLOC;
    private static final LazyConstant<MethodHandle> MSDF_SEGMENT_GET_TYPE;
    private static final LazyConstant<MethodHandle> MSDF_SEGMENT_GET_POINT_COUNT;
    private static final LazyConstant<MethodHandle> MSDF_SEGMENT_GET_POINT;
    private static final LazyConstant<MethodHandle> MSDF_SEGMENT_SET_POINT;
    private static final LazyConstant<MethodHandle> MSDF_SEGMENT_SET_COLOR;
    private static final LazyConstant<MethodHandle> MSDF_SEGMENT_GET_COLOR;
    private static final LazyConstant<MethodHandle> MSDF_SEGMENT_GET_DIRECTION;
    private static final LazyConstant<MethodHandle> MSDF_SEGMENT_GET_DIRECTION_CHANGE;
    private static final LazyConstant<MethodHandle> MSDF_SEGMENT_POINT;
    private static final LazyConstant<MethodHandle> MSDF_SEGMENT_BOUND;
    private static final LazyConstant<MethodHandle> MSDF_SEGMENT_MOVE_START_POINT;
    private static final LazyConstant<MethodHandle> MSDF_SEGMENT_MOVE_END_POINT;
    private static final LazyConstant<MethodHandle> MSDF_SEGMENT_FREE;
    private static final LazyConstant<MethodHandle> MSDF_ERROR_CORRECTION;
    private static final LazyConstant<MethodHandle> MSDF_ERROR_CORRECTION_FAST_DISTANCE;
    private static final LazyConstant<MethodHandle> MSDF_ERROR_CORRECTION_FAST_EDGE;
    private static final LazyConstant<MethodHandle> MSDF_GENERATE_SDF;
    private static final LazyConstant<MethodHandle> MSDF_GENERATE_PSDF;
    private static final LazyConstant<MethodHandle> MSDF_GENERATE_MSDF;
    private static final LazyConstant<MethodHandle> MSDF_GENERATE_MTSDF;
    private static final LazyConstant<MethodHandle> MSDF_GENERATE_SDF_WITH_CONFIG;
    private static final LazyConstant<MethodHandle> MSDF_GENERATE_PSDF_WITH_CONFIG;
    private static final LazyConstant<MethodHandle> MSDF_GENERATE_MSDF_WITH_CONFIG;
    private static final LazyConstant<MethodHandle> MSDF_GENERATE_MTSDF_WITH_CONFIG;
    private static final LazyConstant<MethodHandle> MSDF_RENDER_SDF;
    private static final LazyConstant<MethodHandle> MSDF_FT_INIT;
    private static final LazyConstant<MethodHandle> MSDF_FT_LOAD_FONT;
    private static final LazyConstant<MethodHandle> MSDF_FT_ADOPT_FONT;
    private static final LazyConstant<MethodHandle> MSDF_FT_LOAD_FONT_DATA;
    private static final LazyConstant<MethodHandle> MSDF_FT_FONT_LOAD_GLYPH;
    private static final LazyConstant<MethodHandle> MSDF_FT_FONT_LOAD_GLYPH_BY_INDEX;
    private static final LazyConstant<MethodHandle> MSDF_FT_FONT_GET_GLYPH_INDEX;
    private static final LazyConstant<MethodHandle> MSDF_FT_FONT_GET_KERNING_BY_INDEX;
    private static final LazyConstant<MethodHandle> MSDF_FT_FONT_GET_KERNING;
    private static final LazyConstant<MethodHandle> MSDF_FT_FONT_DESTROY;
    private static final LazyConstant<MethodHandle> MSDF_FT_DEINIT;

    static {
        //@formatter:off
        MSDF_BITMAP_ALLOC = downcallHandle("msdf_bitmap_alloc", JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
        MSDF_BITMAP_GET_CHANNEL_COUNT = downcallHandle("msdf_bitmap_get_channel_count", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        MSDF_BITMAP_GET_PIXELS = downcallHandle("msdf_bitmap_get_pixels", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        MSDF_BITMAP_GET_BYTE_SIZE = downcallHandle("msdf_bitmap_get_byte_size", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        MSDF_BITMAP_FREE = downcallHandleVoid("msdf_bitmap_free", UNBOUNDED_ADDRESS);
        MSDF_SHAPE_ALLOC = downcallHandle("msdf_shape_alloc", JAVA_INT, UNBOUNDED_ADDRESS);
        MSDF_SHAPE_GET_BOUNDS = downcallHandle("msdf_shape_get_bounds", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        MSDF_SHAPE_ADD_CONTOUR = downcallHandle("msdf_shape_add_contour", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        MSDF_SHAPE_REMOVE_CONTOUR = downcallHandle("msdf_shape_remove_contour", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        MSDF_SHAPE_GET_CONTOUR_COUNT = downcallHandle("msdf_shape_get_contour_count", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        MSDF_SHAPE_GET_CONTOUR = downcallHandle("msdf_shape_get_contour", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS);
        MSDF_SHAPE_GET_EDGE_COUNT = downcallHandle("msdf_shape_get_edge_count", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        MSDF_SHAPE_GET_Y_AXIS_ORIENTATION = downcallHandle("msdf_shape_get_y_axis_orientation", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        MSDF_SHAPE_SET_Y_AXIS_ORIENTATION = downcallHandle("msdf_shape_set_y_axis_orientation", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT);
        MSDF_SHAPE_NORMALIZE = downcallHandle("msdf_shape_normalize", JAVA_INT, UNBOUNDED_ADDRESS);
        MSDF_SHAPE_VALIDATE = downcallHandle("msdf_shape_validate", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        MSDF_SHAPE_BOUND = downcallHandle("msdf_shape_bound", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        MSDF_SHAPE_BOUND_MITERS = downcallHandle("msdf_shape_bound_miters", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_INT);
        MSDF_SHAPE_ORIENT_CONTOURS = downcallHandle("msdf_shape_orient_contours", JAVA_INT, UNBOUNDED_ADDRESS);
        MSDF_SHAPE_EDGE_COLORS_SIMPLE = downcallHandle("msdf_shape_edge_colors_simple", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_DOUBLE);
        MSDF_SHAPE_EDGE_COLORS_INK_TRAP = downcallHandle("msdf_shape_edge_colors_ink_trap", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_DOUBLE);
        MSDF_SHAPE_EDGE_COLORS_BY_DISTANCE = downcallHandle("msdf_shape_edge_colors_by_distance", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_DOUBLE);
        MSDF_SHAPE_ONE_SHOT_DISTANCE = downcallHandle("msdf_shape_one_shot_distance", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        MSDF_SHAPE_FREE = downcallHandleVoid("msdf_shape_free", UNBOUNDED_ADDRESS);
        MSDF_CONTOUR_ALLOC = downcallHandle("msdf_contour_alloc", JAVA_INT, UNBOUNDED_ADDRESS);
        MSDF_CONTOUR_ADD_EDGE = downcallHandle("msdf_contour_add_edge", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        MSDF_CONTOUR_REMOVE_EDGE = downcallHandle("msdf_contour_remove_edge", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        MSDF_CONTOUR_GET_EDGE_COUNT = downcallHandle("msdf_contour_get_edge_count", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        MSDF_CONTOUR_GET_EDGE = downcallHandle("msdf_contour_get_edge", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS);
        MSDF_CONTOUR_BOUND = downcallHandle("msdf_contour_bound", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        MSDF_CONTOUR_BOUND_MITERS = downcallHandle("msdf_contour_bound_miters", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_INT);
        MSDF_CONTOUR_GET_WINDING = downcallHandle("msdf_contour_get_winding", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        MSDF_CONTOUR_REVERSE = downcallHandle("msdf_contour_reverse", JAVA_INT, UNBOUNDED_ADDRESS);
        MSDF_CONTOUR_FREE = downcallHandleVoid("msdf_contour_free", UNBOUNDED_ADDRESS);
        MSDF_SEGMENT_ALLOC = downcallHandle("msdf_segment_alloc", JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
        MSDF_SEGMENT_GET_TYPE = downcallHandle("msdf_segment_get_type", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        MSDF_SEGMENT_GET_POINT_COUNT = downcallHandle("msdf_segment_get_point_count", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        MSDF_SEGMENT_GET_POINT = downcallHandle("msdf_segment_get_point", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS);
        MSDF_SEGMENT_SET_POINT = downcallHandle("msdf_segment_set_point", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS);
        MSDF_SEGMENT_SET_COLOR = downcallHandle("msdf_segment_set_color", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT);
        MSDF_SEGMENT_GET_COLOR = downcallHandle("msdf_segment_get_color", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        MSDF_SEGMENT_GET_DIRECTION = downcallHandle("msdf_segment_get_direction", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_DOUBLE, UNBOUNDED_ADDRESS);
        MSDF_SEGMENT_GET_DIRECTION_CHANGE = downcallHandle("msdf_segment_get_direction_change", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_DOUBLE, UNBOUNDED_ADDRESS);
        MSDF_SEGMENT_POINT = downcallHandle("msdf_segment_point", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_DOUBLE, UNBOUNDED_ADDRESS);
        MSDF_SEGMENT_BOUND = downcallHandle("msdf_segment_bound", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        MSDF_SEGMENT_MOVE_START_POINT = downcallHandle("msdf_segment_move_start_point", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        MSDF_SEGMENT_MOVE_END_POINT = downcallHandle("msdf_segment_move_end_point", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        MSDF_SEGMENT_FREE = downcallHandleVoid("msdf_segment_free", UNBOUNDED_ADDRESS);
        MSDF_ERROR_CORRECTION = downcallHandle("msdf_error_correction", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        MSDF_ERROR_CORRECTION_FAST_DISTANCE = downcallHandle("msdf_error_correction_fast_distance", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        MSDF_ERROR_CORRECTION_FAST_EDGE = downcallHandle("msdf_error_correction_fast_edge", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        MSDF_GENERATE_SDF = downcallHandle("msdf_generate_sdf", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        MSDF_GENERATE_PSDF = downcallHandle("msdf_generate_psdf", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        MSDF_GENERATE_MSDF = downcallHandle("msdf_generate_msdf", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        MSDF_GENERATE_MTSDF = downcallHandle("msdf_generate_mtsdf", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        MSDF_GENERATE_SDF_WITH_CONFIG = downcallHandle("msdf_generate_sdf_with_config", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        MSDF_GENERATE_PSDF_WITH_CONFIG = downcallHandle("msdf_generate_psdf_with_config", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        MSDF_GENERATE_MSDF_WITH_CONFIG = downcallHandle("msdf_generate_msdf_with_config", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        MSDF_GENERATE_MTSDF_WITH_CONFIG = downcallHandle("msdf_generate_mtsdf_with_config", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        MSDF_RENDER_SDF = downcallHandle("msdf_render_sdf", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        MSDF_FT_INIT = downcallHandle("msdf_ft_init", JAVA_INT, UNBOUNDED_ADDRESS);
        MSDF_FT_LOAD_FONT = downcallHandle("msdf_ft_load_font", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        MSDF_FT_ADOPT_FONT = downcallHandle("msdf_ft_adopt_font", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        MSDF_FT_LOAD_FONT_DATA = downcallHandle("msdf_ft_load_font_data", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS);
        MSDF_FT_FONT_LOAD_GLYPH = downcallHandle("msdf_ft_font_load_glyph", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        MSDF_FT_FONT_LOAD_GLYPH_BY_INDEX = downcallHandle("msdf_ft_font_load_glyph_by_index", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
        MSDF_FT_FONT_GET_GLYPH_INDEX = downcallHandle("msdf_ft_font_get_glyph_index", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
        MSDF_FT_FONT_GET_KERNING_BY_INDEX = downcallHandle("msdf_ft_font_get_kerning_by_index", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
        MSDF_FT_FONT_GET_KERNING = downcallHandle("msdf_ft_font_get_kerning", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS);
        MSDF_FT_FONT_DESTROY = downcallHandleVoid("msdf_ft_font_destroy", UNBOUNDED_ADDRESS);
        MSDF_FT_DEINIT = downcallHandleVoid("msdf_ft_deinit", UNBOUNDED_ADDRESS);
        //@formatter:on
    }

    private Msdfgen() {
    }

    /// ```
    /// 
    /// Allocates a new MSDF bitmap object to render a shape into using the internal allocator.
    /// @param type The type of bitmap to allocate. Can be one of @code MSDF_BITMAP_TYPE_SDF@endcode, @code MSDF_BITMAP_TYPE_PSDF@endcode,
    /// @code MSDF_BITMAP_TYPE_MSDF@endcode or @code MSDF_BITMAP_TYPE_MTSDF@endcode.
    /// @param width The width of the bitmap in pixels.
    /// @param height The height of the bitmap in pixels.
    /// @param bitmap A pointer to an @code msdf_bitmap_t@endcode structure to allocate a new bitmap into.
    /// @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
    /// ```
    public static int bitmap_alloc(
    	int type,
    	int width,
    	int height,
    	MemorySegment bitmap
    ) {
    	MethodHandle method = MSDF_BITMAP_ALLOC.get();
    	try {
    		return (int) method.invokeExact(
    			type,
    			width,
    			height,
    			bitmap
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#bitmap_alloc].
    public static int bitmap_alloc(
    	int type,
    	int width,
    	int height,
    	MsdfBitmap bitmap
    ) {
    	return bitmap_alloc(
    		type,
    		width,
    		height,
    		bitmap.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Retrieves the number of color channels used by the given bitmap.
    /// @param bitmap A pointer to an @code msdf_bitmap_t@endcode structure to retrieve the channel count from.
    /// @param channel_count A pointer to a variable which is populated with the number of color channels used by the given bitmap.
    /// @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
    /// ```
    public static int bitmap_get_channel_count(
    	MemorySegment bitmap,
    	MemorySegment channel_count
    ) {
    	MethodHandle method = MSDF_BITMAP_GET_CHANNEL_COUNT.get();
    	try {
    		return (int) method.invokeExact(
    			bitmap,
    			channel_count
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#bitmap_get_channel_count].
    public static int bitmap_get_channel_count(
    	MsdfBitmap bitmap,
    	NativeIntArray channel_count
    ) {
    	return bitmap_get_channel_count(
    		bitmap.memorySegment(),
    		channel_count.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Retrieves the address of the raw pixel data of the given bitmap.
    /// @param bitmap A pointer to an @code msdf_bitmap_t@endcode structure to retrieve the raw pixel data from.
    /// @param pixels A pointer to an address which is populated with the raw pixel data of the given bitmap.
    /// @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
    /// ```
    public static int bitmap_get_pixels(
    	MemorySegment bitmap,
    	MemorySegment pixels
    ) {
    	MethodHandle method = MSDF_BITMAP_GET_PIXELS.get();
    	try {
    		return (int) method.invokeExact(
    			bitmap,
    			pixels
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#bitmap_get_pixels].
    public static int bitmap_get_pixels(
    	MsdfBitmap bitmap,
    	NativePointerArray pixels
    ) {
    	return bitmap_get_pixels(
    		bitmap.memorySegment(),
    		pixels.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Retrieves the size of the pixel data of the given bitmap in bytes.
    /// @param bitmap A pointer to an @code msdf_bitmap_t@endcode structure to retrieve the size of the raw pixel data from.
    /// @param size A pointer to a variable which is populated with the byte size of the raw pixel data of the given bitmap.
    /// @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
    /// ```
    public static int bitmap_get_byte_size(
    	MemorySegment bitmap,
    	MemorySegment size
    ) {
    	MethodHandle method = MSDF_BITMAP_GET_BYTE_SIZE.get();
    	try {
    		return (int) method.invokeExact(
    			bitmap,
    			size
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#bitmap_get_byte_size].
    public static int bitmap_get_byte_size(
    	MsdfBitmap bitmap,
    	NativeLongArray size
    ) {
    	return bitmap_get_byte_size(
    		bitmap.memorySegment(),
    		size.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Calls the destructor of the given bitmap and frees its memory using the
    /// internal allocator.
    /// @param bitmap A pointer to an @code msdf_bitmap_t@endcode structure to be freed.
    /// ```
    public static void bitmap_free(
    	MemorySegment bitmap
    ) {
    	MethodHandle method = MSDF_BITMAP_FREE.get();
    	try {
    		 method.invokeExact(
    			bitmap
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#bitmap_free].
    public static void bitmap_free(
    	MsdfBitmap bitmap
    ) {
    	bitmap_free(
    		bitmap.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Allocates a new MSDF shape object using the internal allocator.
    /// @param shape A pointer to an address which is populated with the address of the newly allocated shape.
    /// @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
    /// ```
    public static int shape_alloc(
    	MemorySegment shape
    ) {
    	MethodHandle method = MSDF_SHAPE_ALLOC.get();
    	try {
    		return (int) method.invokeExact(
    			shape
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#shape_alloc].
    public static int shape_alloc(
    	NativePointerArray shape
    ) {
    	return shape_alloc(
    		shape.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Retrieves the bounds of the given shape.
    /// @param shape A pointer to a shape object to retrieve the bounds from.
    /// @param bounds A pointer to a variable which is populated with the bounds of the given shape.
    /// @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
    /// ```
    public static int shape_get_bounds(
    	MemorySegment shape,
    	MemorySegment bounds
    ) {
    	MethodHandle method = MSDF_SHAPE_GET_BOUNDS.get();
    	try {
    		return (int) method.invokeExact(
    			shape,
    			bounds
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#shape_get_bounds].
    public static int shape_get_bounds(
    	MsdfShape shape,
    	MsdfBounds bounds
    ) {
    	return shape_get_bounds(
    		shape.memorySegment(),
    		bounds.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Adds a new contour to the given shape.
    /// @param shape A pointer to a shape object to add a new contour to.
    /// @param contour A pointer to a contour handle to be populated with a new contour that was added to the shape.
    /// @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
    /// ```
    public static int shape_add_contour(
    	MemorySegment shape,
    	MemorySegment contour
    ) {
    	MethodHandle method = MSDF_SHAPE_ADD_CONTOUR.get();
    	try {
    		return (int) method.invokeExact(
    			shape,
    			contour
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#shape_add_contour].
    public static int shape_add_contour(
    	MsdfShape shape,
    	NativePointerArray contour
    ) {
    	return shape_add_contour(
    		shape.memorySegment(),
    		contour.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Removes the given contour from the given shape if present.
    /// @param shape A pointer to a shape object to remove the given contour from.
    /// @param contour A pointer to the contour to remove from the shape.
    /// @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
    /// ```
    public static int shape_remove_contour(
    	MemorySegment shape,
    	MemorySegment contour
    ) {
    	MethodHandle method = MSDF_SHAPE_REMOVE_CONTOUR.get();
    	try {
    		return (int) method.invokeExact(
    			shape,
    			contour
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#shape_remove_contour].
    public static int shape_remove_contour(
    	MsdfShape shape,
    	MsdfContour contour
    ) {
    	return shape_remove_contour(
    		shape.memorySegment(),
    		contour.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Retrieves the number of contours allocated within the given shape object.
    /// @param shape A pointer to a shape object from which to retrieve the contour count.
    /// @param contour_count A pointer to a variable which is populated with the number of contours of the given shape.
    /// @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
    /// ```
    public static int shape_get_contour_count(
    	MemorySegment shape,
    	MemorySegment contour_count
    ) {
    	MethodHandle method = MSDF_SHAPE_GET_CONTOUR_COUNT.get();
    	try {
    		return (int) method.invokeExact(
    			shape,
    			contour_count
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#shape_get_contour_count].
    public static int shape_get_contour_count(
    	MsdfShape shape,
    	NativeLongArray contour_count
    ) {
    	return shape_get_contour_count(
    		shape.memorySegment(),
    		contour_count.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Retrieves a contour at a given index from the given shape.
    /// @param shape A pointer to a shape object from which to retrieve a contour.
    /// @param index The index of the contour to retrieve.
    /// @param contour A pointer to an address which is populated with the address of the contour at the given index if present.
    /// @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
    /// ```
    public static int shape_get_contour(
    	MemorySegment shape,
    	long index,
    	MemorySegment contour
    ) {
    	MethodHandle method = MSDF_SHAPE_GET_CONTOUR.get();
    	try {
    		return (int) method.invokeExact(
    			shape,
    			index,
    			contour
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#shape_get_contour].
    public static int shape_get_contour(
    	MsdfShape shape,
    	long index,
    	NativePointerArray contour
    ) {
    	return shape_get_contour(
    		shape.memorySegment(),
    		index,
    		contour.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Retrieves the number of edges of the given shape.
    /// @param shape A pointer to a shape from which to retrieve the edge count.
    /// @param edge_count A pointer to a variable which is populated with the number of edges defined by the given shape.
    /// @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
    /// ```
    public static int shape_get_edge_count(
    	MemorySegment shape,
    	MemorySegment edge_count
    ) {
    	MethodHandle method = MSDF_SHAPE_GET_EDGE_COUNT.get();
    	try {
    		return (int) method.invokeExact(
    			shape,
    			edge_count
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#shape_get_edge_count].
    public static int shape_get_edge_count(
    	MsdfShape shape,
    	NativeLongArray edge_count
    ) {
    	return shape_get_edge_count(
    		shape.memorySegment(),
    		edge_count.memorySegment()
    	);
    }
    
    public static int shape_get_y_axis_orientation(
    	MemorySegment shape,
    	MemorySegment yAxisOrientation
    ) {
    	MethodHandle method = MSDF_SHAPE_GET_Y_AXIS_ORIENTATION.get();
    	try {
    		return (int) method.invokeExact(
    			shape,
    			yAxisOrientation
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#shape_get_y_axis_orientation].
    public static int shape_get_y_axis_orientation(
    	MsdfShape shape,
    	NativeIntArray yAxisOrientation
    ) {
    	return shape_get_y_axis_orientation(
    		shape.memorySegment(),
    		yAxisOrientation.memorySegment()
    	);
    }
    
    public static int shape_set_y_axis_orientation(
    	MemorySegment shape,
    	int yAxisOrientation
    ) {
    	MethodHandle method = MSDF_SHAPE_SET_Y_AXIS_ORIENTATION.get();
    	try {
    		return (int) method.invokeExact(
    			shape,
    			yAxisOrientation
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#shape_set_y_axis_orientation].
    public static int shape_set_y_axis_orientation(
    	MsdfShape shape,
    	int yAxisOrientation
    ) {
    	return shape_set_y_axis_orientation(
    		shape.memorySegment(),
    		yAxisOrientation
    	);
    }
    
    /// ```
    /// 
    /// Normalizes the given shape.
    /// @param shape A pointer to a shape to normalize.
    /// @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
    /// ```
    public static int shape_normalize(
    	MemorySegment shape
    ) {
    	MethodHandle method = MSDF_SHAPE_NORMALIZE.get();
    	try {
    		return (int) method.invokeExact(
    			shape
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#shape_normalize].
    public static int shape_normalize(
    	MsdfShape shape
    ) {
    	return shape_normalize(
    		shape.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Validates the given shape.
    /// @param shape A pointer to a shape to validate.
    /// @param result A pointer to a variable which is populated with @code MSDF_TRUE@endcode when the
    /// validation was successful. Otherwise the variable will be set to @code MSDF_FALSE@endcode.
    /// @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
    /// ```
    public static int shape_validate(
    	MemorySegment shape,
    	MemorySegment result
    ) {
    	MethodHandle method = MSDF_SHAPE_VALIDATE.get();
    	try {
    		return (int) method.invokeExact(
    			shape,
    			result
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#shape_validate].
    public static int shape_validate(
    	MsdfShape shape,
    	NativeIntArray result
    ) {
    	return shape_validate(
    		shape.memorySegment(),
    		result.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Adjusts the given bounding box to fit the given shape.
    /// @param shape A pointer to a shape to fit into the given bounding box.
    /// @param bounds A pointer to a bounding box which should at least fit the given shape.
    /// @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
    /// ```
    public static int shape_bound(
    	MemorySegment shape,
    	MemorySegment bounds
    ) {
    	MethodHandle method = MSDF_SHAPE_BOUND.get();
    	try {
    		return (int) method.invokeExact(
    			shape,
    			bounds
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#shape_bound].
    public static int shape_bound(
    	MsdfShape shape,
    	MsdfBounds bounds
    ) {
    	return shape_bound(
    		shape.memorySegment(),
    		bounds.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Adjusts the given bounding box to fit the given shape including a mitered border.
    /// @param shape A pointer to a shape to fit into the given bounding box.
    /// @param bounds A pointer to a bounding box which should at least fit the given shape including the specified border.
    /// @param border The size of the border.
    /// @param miter_limit The miter limit value.
    /// @param polarity The miter polarity.
    /// @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
    /// ```
    public static int shape_bound_miters(
    	MemorySegment shape,
    	MemorySegment bounds,
    	double border,
    	double miter_limit,
    	int polarity
    ) {
    	MethodHandle method = MSDF_SHAPE_BOUND_MITERS.get();
    	try {
    		return (int) method.invokeExact(
    			shape,
    			bounds,
    			border,
    			miter_limit,
    			polarity
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#shape_bound_miters].
    public static int shape_bound_miters(
    	MsdfShape shape,
    	MsdfBounds bounds,
    	double border,
    	double miter_limit,
    	int polarity
    ) {
    	return shape_bound_miters(
    		shape.memorySegment(),
    		bounds.memorySegment(),
    		border,
    		miter_limit,
    		polarity
    	);
    }
    
    /// ```
    /// 
    /// Orients all contours associated with the given shape before rendering.
    /// @param shape A pointer to a shape whose contours to orient.
    /// @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
    /// ```
    public static int shape_orient_contours(
    	MemorySegment shape
    ) {
    	MethodHandle method = MSDF_SHAPE_ORIENT_CONTOURS.get();
    	try {
    		return (int) method.invokeExact(
    			shape
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#shape_orient_contours].
    public static int shape_orient_contours(
    	MsdfShape shape
    ) {
    	return shape_orient_contours(
    		shape.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Colors the edges of the given shape using the default MSDF colors specified by the
    /// MSDF_COLOR_ prefixed constants.
    /// @param shape A pointer to a shape whose edges to color with the default MSDF colors.
    /// @param angle_threshold The threshold angle in degrees.
    /// @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
    /// ```
    public static int shape_edge_colors_simple(
    	MemorySegment shape,
    	double angle_threshold
    ) {
    	MethodHandle method = MSDF_SHAPE_EDGE_COLORS_SIMPLE.get();
    	try {
    		return (int) method.invokeExact(
    			shape,
    			angle_threshold
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#shape_edge_colors_simple].
    public static int shape_edge_colors_simple(
    	MsdfShape shape,
    	double angle_threshold
    ) {
    	return shape_edge_colors_simple(
    		shape.memorySegment(),
    		angle_threshold
    	);
    }
    
    /// ```
    /// 
    /// Colors the edges of the given shape using the default MSDF colors specified by the
    /// MSDF_COLOR_ prefixed constants using the ink trap algorithm.
    /// @param shape A pointer to a shape whose edges to color with the default MSDF colors.
    /// @param angle_threshold The threshold angle in degrees.
    /// @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
    /// ```
    public static int shape_edge_colors_ink_trap(
    	MemorySegment shape,
    	double angle_threshold
    ) {
    	MethodHandle method = MSDF_SHAPE_EDGE_COLORS_INK_TRAP.get();
    	try {
    		return (int) method.invokeExact(
    			shape,
    			angle_threshold
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#shape_edge_colors_ink_trap].
    public static int shape_edge_colors_ink_trap(
    	MsdfShape shape,
    	double angle_threshold
    ) {
    	return shape_edge_colors_ink_trap(
    		shape.memorySegment(),
    		angle_threshold
    	);
    }
    
    /// ```
    /// 
    /// Colors the edges of the given shape using the default MSDF colors specified by the
    /// MSDF_COLOR_ prefixed constants using the distance.
    /// @param shape A pointer to a shape whose edges to color with the default MSDF colors.
    /// @param angle_threshold The threshold angle in degrees.
    /// @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
    /// ```
    public static int shape_edge_colors_by_distance(
    	MemorySegment shape,
    	double angle_threshold
    ) {
    	MethodHandle method = MSDF_SHAPE_EDGE_COLORS_BY_DISTANCE.get();
    	try {
    		return (int) method.invokeExact(
    			shape,
    			angle_threshold
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#shape_edge_colors_by_distance].
    public static int shape_edge_colors_by_distance(
    	MsdfShape shape,
    	double angle_threshold
    ) {
    	return shape_edge_colors_by_distance(
    		shape.memorySegment(),
    		angle_threshold
    	);
    }
    
    /// ```
    /// 
    /// Finds the distance between shape and origin.
    /// Does not allocate result cache used to optimize performance of multiple queries.
    /// @param shape A pointer to the shape to find the distance to.
    /// @param origin The point to find the distance relative to the given shape to.
    /// @param distance A pointer to a variable to be populated with the calculated distance to the given shape.
    /// @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
    /// ```
    public static int shape_one_shot_distance(
    	MemorySegment shape,
    	MemorySegment origin,
    	MemorySegment distance
    ) {
    	MethodHandle method = MSDF_SHAPE_ONE_SHOT_DISTANCE.get();
    	try {
    		return (int) method.invokeExact(
    			shape,
    			origin,
    			distance
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#shape_one_shot_distance].
    public static int shape_one_shot_distance(
    	MsdfShape shape,
    	MsdfVector2 origin,
    	NativeDoubleArray distance
    ) {
    	return shape_one_shot_distance(
    		shape.memorySegment(),
    		origin.memorySegment(),
    		distance.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Calls the destructor of the given bitmap and frees its memory using the
    /// internal allocator.
    /// @param shape A pointer to a shape object to be freed.
    /// ```
    public static void shape_free(
    	MemorySegment shape
    ) {
    	MethodHandle method = MSDF_SHAPE_FREE.get();
    	try {
    		 method.invokeExact(
    			shape
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#shape_free].
    public static void shape_free(
    	MsdfShape shape
    ) {
    	shape_free(
    		shape.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Allocates a new contour object using the internal allocator.
    /// @param contour A pointer to an address which is populated with the address of the newly allocated contour object.
    /// @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
    /// ```
    public static int contour_alloc(
    	MemorySegment contour
    ) {
    	MethodHandle method = MSDF_CONTOUR_ALLOC.get();
    	try {
    		return (int) method.invokeExact(
    			contour
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#contour_alloc].
    public static int contour_alloc(
    	NativePointerArray contour
    ) {
    	return contour_alloc(
    		contour.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Adds a new edge to the given contour and returns its associated segment handle.
    /// @param contour A pointer to the contour to add a new edge (segment) to.
    /// @param segment A pointer to the segment to add as an edge. This segment must be heap-allocated
    /// and may not be freed before the contour object that owns it.
    /// @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
    /// ```
    public static int contour_add_edge(
    	MemorySegment contour,
    	MemorySegment paramSegment
    ) {
    	MethodHandle method = MSDF_CONTOUR_ADD_EDGE.get();
    	try {
    		return (int) method.invokeExact(
    			contour,
    			paramSegment
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#contour_add_edge].
    public static int contour_add_edge(
    	MsdfContour contour,
    	MsdfSegment paramSegment
    ) {
    	return contour_add_edge(
    		contour.memorySegment(),
    		paramSegment.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Removes the given edge from the given contour if present.
    /// @param contour A pointer to the contour to remove the given edge (segment) from.
    /// @param segment A pointer to the segment to remove from the given contour.
    /// @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
    /// ```
    public static int contour_remove_edge(
    	MemorySegment contour,
    	MemorySegment paramSegment
    ) {
    	MethodHandle method = MSDF_CONTOUR_REMOVE_EDGE.get();
    	try {
    		return (int) method.invokeExact(
    			contour,
    			paramSegment
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#contour_remove_edge].
    public static int contour_remove_edge(
    	MsdfContour contour,
    	MsdfSegment paramSegment
    ) {
    	return contour_remove_edge(
    		contour.memorySegment(),
    		paramSegment.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Retrieves the edge count of the given contour.
    /// @param contour A pointer to the contour to retrieve the edge count from.
    /// @param edge_count A pointer to a variable which is populated with the edge count of the given contour.
    /// @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
    /// ```
    public static int contour_get_edge_count(
    	MemorySegment contour,
    	MemorySegment edge_count
    ) {
    	MethodHandle method = MSDF_CONTOUR_GET_EDGE_COUNT.get();
    	try {
    		return (int) method.invokeExact(
    			contour,
    			edge_count
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#contour_get_edge_count].
    public static int contour_get_edge_count(
    	MsdfContour contour,
    	NativeLongArray edge_count
    ) {
    	return contour_get_edge_count(
    		contour.memorySegment(),
    		edge_count.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Retrieves an edge (segment) from the given contour at the given index.
    /// @param contour A pointer to the contour from which to retrieve the given edge segment.
    /// @param index The index from which to retrieve the edge segment.
    /// @param segment A pointer to an address which is populated with the address of the
    /// edge segment at the given index if present.
    /// @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
    /// ```
    public static int contour_get_edge(
    	MemorySegment contour,
    	long index,
    	MemorySegment paramSegment
    ) {
    	MethodHandle method = MSDF_CONTOUR_GET_EDGE.get();
    	try {
    		return (int) method.invokeExact(
    			contour,
    			index,
    			paramSegment
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#contour_get_edge].
    public static int contour_get_edge(
    	MsdfContour contour,
    	long index,
    	NativePointerArray paramSegment
    ) {
    	return contour_get_edge(
    		contour.memorySegment(),
    		index,
    		paramSegment.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Adjusts the given bounding box to fit at least the given contour.
    /// @param contour A pointer to the contour which should at least fit into the given bounding box.
    /// @param bounds A pointer to the bounding box to fit the given contour into.
    /// @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
    /// ```
    public static int contour_bound(
    	MemorySegment contour,
    	MemorySegment bounds
    ) {
    	MethodHandle method = MSDF_CONTOUR_BOUND.get();
    	try {
    		return (int) method.invokeExact(
    			contour,
    			bounds
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#contour_bound].
    public static int contour_bound(
    	MsdfContour contour,
    	MsdfBounds bounds
    ) {
    	return contour_bound(
    		contour.memorySegment(),
    		bounds.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Adjust the given bounding box to fit at least the given contour including a specified border.
    /// @param contour A pointer to the contour which should at least fit into the given bounding box.
    /// @param bounds A pointer to the bounding box to fit the given contour including the specified border.
    /// @param border The size of the border.
    /// @param miter_limit The miter limit value.
    /// @param polarity The miter polarity.
    /// @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
    /// ```
    public static int contour_bound_miters(
    	MemorySegment contour,
    	MemorySegment bounds,
    	double border,
    	double miter_limit,
    	int polarity
    ) {
    	MethodHandle method = MSDF_CONTOUR_BOUND_MITERS.get();
    	try {
    		return (int) method.invokeExact(
    			contour,
    			bounds,
    			border,
    			miter_limit,
    			polarity
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#contour_bound_miters].
    public static int contour_bound_miters(
    	MsdfContour contour,
    	MsdfBounds bounds,
    	double border,
    	double miter_limit,
    	int polarity
    ) {
    	return contour_bound_miters(
    		contour.memorySegment(),
    		bounds.memorySegment(),
    		border,
    		miter_limit,
    		polarity
    	);
    }
    
    /// ```
    /// 
    /// Retrieves the winding direction of the given contour.
    /// @param contour A pointer to the contour of which to retrieve the winding direction.
    /// @param winding A pointer to a variables which is populated with the winding direction of the given contour.
    /// @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
    /// ```
    public static int contour_get_winding(
    	MemorySegment contour,
    	MemorySegment winding
    ) {
    	MethodHandle method = MSDF_CONTOUR_GET_WINDING.get();
    	try {
    		return (int) method.invokeExact(
    			contour,
    			winding
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#contour_get_winding].
    public static int contour_get_winding(
    	MsdfContour contour,
    	NativeIntArray winding
    ) {
    	return contour_get_winding(
    		contour.memorySegment(),
    		winding.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Reverses the order of edges in the given contour.
    /// @param contour A pointer to the contour which to reverse the edge order for.
    /// @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
    /// ```
    public static int contour_reverse(
    	MemorySegment contour
    ) {
    	MethodHandle method = MSDF_CONTOUR_REVERSE.get();
    	try {
    		return (int) method.invokeExact(
    			contour
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#contour_reverse].
    public static int contour_reverse(
    	MsdfContour contour
    ) {
    	return contour_reverse(
    		contour.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Calls the destructor of the given bitmap and frees its memory using the
    /// internal allocator.
    /// @param contour A pointer to the contour to free.
    /// ```
    public static void contour_free(
    	MemorySegment contour
    ) {
    	MethodHandle method = MSDF_CONTOUR_FREE.get();
    	try {
    		 method.invokeExact(
    			contour
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#contour_free].
    public static void contour_free(
    	MsdfContour contour
    ) {
    	contour_free(
    		contour.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Allocates a new segment of the given type and populates the given address
    /// with the address of the newly allocated segment.
    /// @param type The type of segment to allocate. Can be one of @code MSDF_SEGMENT_TYPE_LINEAR@endcode,
    /// @code MSDF_SEGMENT_TYPE_QUADRATIC@endcode or @code MSDF_SEGMENT_TYPE_CUBIC@endcode.
    /// @param segment A pointer to an address which is populated with the address of the newly
    /// allocated segment.
    /// @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
    /// ```
    public static int segment_alloc(
    	int type,
    	MemorySegment paramSegment
    ) {
    	MethodHandle method = MSDF_SEGMENT_ALLOC.get();
    	try {
    		return (int) method.invokeExact(
    			type,
    			paramSegment
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#segment_alloc].
    public static int segment_alloc(
    	int type,
    	NativePointerArray paramSegment
    ) {
    	return segment_alloc(
    		type,
    		paramSegment.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Retrieves the type of the given segment.
    /// @param segment A pointer to the segment of which to retrieve the type.
    /// @param type A pointer to a variable which is populated with the type of the given segment.
    /// @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
    /// ```
    public static int segment_get_type(
    	MemorySegment paramSegment,
    	MemorySegment type
    ) {
    	MethodHandle method = MSDF_SEGMENT_GET_TYPE.get();
    	try {
    		return (int) method.invokeExact(
    			paramSegment,
    			type
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#segment_get_type].
    public static int segment_get_type(
    	MsdfSegment paramSegment,
    	NativeIntArray type
    ) {
    	return segment_get_type(
    		paramSegment.memorySegment(),
    		type.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Retrieves the point count of the given segment.
    /// @param segment A pointer to the segment of which to retrieve the number of points.
    /// @param point_count A pointer to a variable which is populated with the number of points of the given segment.
    /// @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
    /// ```
    public static int segment_get_point_count(
    	MemorySegment paramSegment,
    	MemorySegment point_count
    ) {
    	MethodHandle method = MSDF_SEGMENT_GET_POINT_COUNT.get();
    	try {
    		return (int) method.invokeExact(
    			paramSegment,
    			point_count
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#segment_get_point_count].
    public static int segment_get_point_count(
    	MsdfSegment paramSegment,
    	NativeLongArray point_count
    ) {
    	return segment_get_point_count(
    		paramSegment.memorySegment(),
    		point_count.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Retrieves a point at the given index from the given segment.
    /// @param segment A pointer to the segment from which to retrieve a point.
    /// @param index The index of the point to retrieve.
    /// @param point A pointer to a point which is populated with the coordinates of the point
    /// at the given index if present.
    /// @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
    /// ```
    public static int segment_get_point(
    	MemorySegment paramSegment,
    	long index,
    	MemorySegment point
    ) {
    	MethodHandle method = MSDF_SEGMENT_GET_POINT.get();
    	try {
    		return (int) method.invokeExact(
    			paramSegment,
    			index,
    			point
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#segment_get_point].
    public static int segment_get_point(
    	MsdfSegment paramSegment,
    	long index,
    	MsdfVector2 point
    ) {
    	return segment_get_point(
    		paramSegment.memorySegment(),
    		index,
    		point.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Sets the coordinates of a point at the given index in the given segment.
    /// @param segment A pointer to the segment of which to set the point.
    /// @param index The index of the point to set.
    /// @param point A pointer to a point which is copied to the given index within the segment.
    /// @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
    /// ```
    public static int segment_set_point(
    	MemorySegment paramSegment,
    	long index,
    	MemorySegment point
    ) {
    	MethodHandle method = MSDF_SEGMENT_SET_POINT.get();
    	try {
    		return (int) method.invokeExact(
    			paramSegment,
    			index,
    			point
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#segment_set_point].
    public static int segment_set_point(
    	MsdfSegment paramSegment,
    	long index,
    	MsdfVector2 point
    ) {
    	return segment_set_point(
    		paramSegment.memorySegment(),
    		index,
    		point.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Sets the color of the given segment.
    /// @param segment A pointer to the segment of which to set the color.
    /// @param color The color to set. Can be any @code MSDF_COLOR_@endcode value.
    /// @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
    /// ```
    public static int segment_set_color(
    	MemorySegment paramSegment,
    	int color
    ) {
    	MethodHandle method = MSDF_SEGMENT_SET_COLOR.get();
    	try {
    		return (int) method.invokeExact(
    			paramSegment,
    			color
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#segment_set_color].
    public static int segment_set_color(
    	MsdfSegment paramSegment,
    	int color
    ) {
    	return segment_set_color(
    		paramSegment.memorySegment(),
    		color
    	);
    }
    
    /// ```
    /// 
    /// Retrieves the color of the given segment.
    /// @param segment A pointer to the segment of which to retrieve the color.
    /// @param color A pointer to a variable which is populated with the color of the given segment.
    /// Will be one of the constants prefixed with @code MSDF_COLOR_@endcode.
    /// @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
    /// ```
    public static int segment_get_color(
    	MemorySegment paramSegment,
    	MemorySegment color
    ) {
    	MethodHandle method = MSDF_SEGMENT_GET_COLOR.get();
    	try {
    		return (int) method.invokeExact(
    			paramSegment,
    			color
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#segment_get_color].
    public static int segment_get_color(
    	MsdfSegment paramSegment,
    	NativeIntArray color
    ) {
    	return segment_get_color(
    		paramSegment.memorySegment(),
    		color.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Retrieves the direction of the given segment at the given point.
    /// @param segment A pointer to the segment of which to retrieve the direction.
    /// @param param The point at which to retrieve the segment direction.
    /// @param direction A pointer to a variable which is populated with the direction of the given
    /// segment at the given point.
    /// @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
    /// ```
    public static int segment_get_direction(
    	MemorySegment paramSegment,
    	double param,
    	MemorySegment direction
    ) {
    	MethodHandle method = MSDF_SEGMENT_GET_DIRECTION.get();
    	try {
    		return (int) method.invokeExact(
    			paramSegment,
    			param,
    			direction
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#segment_get_direction].
    public static int segment_get_direction(
    	MsdfSegment paramSegment,
    	double param,
    	MsdfVector2 direction
    ) {
    	return segment_get_direction(
    		paramSegment.memorySegment(),
    		param,
    		direction.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Retrieves the direction change of the given segment at the given point.
    /// @param segment A pointer to the segment of which to retrieve the direction change.
    /// @param param The point at which to retrieve the segment direction change.
    /// @param direction_change A pointer to a variable which is populated with the direction change
    /// of the given segment at the given point.
    /// @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
    /// ```
    public static int segment_get_direction_change(
    	MemorySegment paramSegment,
    	double param,
    	MemorySegment direction_change
    ) {
    	MethodHandle method = MSDF_SEGMENT_GET_DIRECTION_CHANGE.get();
    	try {
    		return (int) method.invokeExact(
    			paramSegment,
    			param,
    			direction_change
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#segment_get_direction_change].
    public static int segment_get_direction_change(
    	MsdfSegment paramSegment,
    	double param,
    	MsdfVector2 direction_change
    ) {
    	return segment_get_direction_change(
    		paramSegment.memorySegment(),
    		param,
    		direction_change.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Retrieves the point on the given edge segment specified by the given parameter.
    /// @param segment A pointer to the segment of which to retrieve the edge point.
    /// @param param The point at which to sample.
    /// @param point A pointer to a variable which is populated with the edge point
    /// at the given location from the given segment.
    /// @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
    /// ```
    public static int segment_point(
    	MemorySegment paramSegment,
    	double param,
    	MemorySegment point
    ) {
    	MethodHandle method = MSDF_SEGMENT_POINT.get();
    	try {
    		return (int) method.invokeExact(
    			paramSegment,
    			param,
    			point
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#segment_point].
    public static int segment_point(
    	MsdfSegment paramSegment,
    	double param,
    	MsdfVector2 point
    ) {
    	return segment_point(
    		paramSegment.memorySegment(),
    		param,
    		point.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Adjusts the given bounding box to fit at least the given segment.
    /// @param segment A pointer to the segment which should at least fit in the given bounding box.
    /// @param bounds A pointer to the bounding box which should at least fit the given segment.
    /// @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
    /// ```
    public static int segment_bound(
    	MemorySegment paramSegment,
    	MemorySegment bounds
    ) {
    	MethodHandle method = MSDF_SEGMENT_BOUND.get();
    	try {
    		return (int) method.invokeExact(
    			paramSegment,
    			bounds
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#segment_bound].
    public static int segment_bound(
    	MsdfSegment paramSegment,
    	MsdfBounds bounds
    ) {
    	return segment_bound(
    		paramSegment.memorySegment(),
    		bounds.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Moves the start point of the given segment.
    /// @param segment A pointer to the segment of which to adjust the start point.
    /// @param point A pointer to the new start point of the given segment.
    /// @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
    /// ```
    public static int segment_move_start_point(
    	MemorySegment paramSegment,
    	MemorySegment point
    ) {
    	MethodHandle method = MSDF_SEGMENT_MOVE_START_POINT.get();
    	try {
    		return (int) method.invokeExact(
    			paramSegment,
    			point
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#segment_move_start_point].
    public static int segment_move_start_point(
    	MsdfSegment paramSegment,
    	MsdfVector2 point
    ) {
    	return segment_move_start_point(
    		paramSegment.memorySegment(),
    		point.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Moves the end point of the given segment.
    /// @param segment A pointer to the segment of which to adjust the end point.
    /// @param point A pointer to the new end point of the given segment.
    /// @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
    /// ```
    public static int segment_move_end_point(
    	MemorySegment paramSegment,
    	MemorySegment point
    ) {
    	MethodHandle method = MSDF_SEGMENT_MOVE_END_POINT.get();
    	try {
    		return (int) method.invokeExact(
    			paramSegment,
    			point
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#segment_move_end_point].
    public static int segment_move_end_point(
    	MsdfSegment paramSegment,
    	MsdfVector2 point
    ) {
    	return segment_move_end_point(
    		paramSegment.memorySegment(),
    		point.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Calls the destructor of the given segment and frees its memory using the
    /// internal allocator.
    /// @param segment A pointer to the segment to free.
    /// ```
    public static void segment_free(
    	MemorySegment paramSegment
    ) {
    	MethodHandle method = MSDF_SEGMENT_FREE.get();
    	try {
    		 method.invokeExact(
    			paramSegment
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#segment_free].
    public static void segment_free(
    	MsdfSegment paramSegment
    ) {
    	segment_free(
    		paramSegment.memorySegment()
    	);
    }
    
    public static int error_correction(
    	MemorySegment bitmap,
    	MemorySegment shape,
    	MemorySegment transform
    ) {
    	MethodHandle method = MSDF_ERROR_CORRECTION.get();
    	try {
    		return (int) method.invokeExact(
    			bitmap,
    			shape,
    			transform
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#error_correction].
    public static int error_correction(
    	MsdfBitmap bitmap,
    	MsdfShape shape,
    	MsdfTransform transform
    ) {
    	return error_correction(
    		bitmap.memorySegment(),
    		shape.memorySegment(),
    		transform.memorySegment()
    	);
    }
    
    public static int error_correction_fast_distance(
    	MemorySegment bitmap,
    	MemorySegment transform
    ) {
    	MethodHandle method = MSDF_ERROR_CORRECTION_FAST_DISTANCE.get();
    	try {
    		return (int) method.invokeExact(
    			bitmap,
    			transform
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#error_correction_fast_distance].
    public static int error_correction_fast_distance(
    	MsdfBitmap bitmap,
    	MsdfTransform transform
    ) {
    	return error_correction_fast_distance(
    		bitmap.memorySegment(),
    		transform.memorySegment()
    	);
    }
    
    public static int error_correction_fast_edge(
    	MemorySegment bitmap,
    	MemorySegment transform
    ) {
    	MethodHandle method = MSDF_ERROR_CORRECTION_FAST_EDGE.get();
    	try {
    		return (int) method.invokeExact(
    			bitmap,
    			transform
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#error_correction_fast_edge].
    public static int error_correction_fast_edge(
    	MsdfBitmap bitmap,
    	MsdfTransform transform
    ) {
    	return error_correction_fast_edge(
    		bitmap.memorySegment(),
    		transform.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// @param output A pointer to a bitmap that was allocated with @code msdf_bitmap_alloc@endcode to which
    /// the given shape is rendered. The bitmap must be of type @code MSDF_BITMAP_TYPE_SDF@endcode.
    /// @param shape A pointer to the shape to render to the given bitmap.
    /// @param transform The transform which is applied to the given shape during rendering.
    /// @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
    /// ```
    public static int generate_sdf(
    	MemorySegment output,
    	MemorySegment shape,
    	MemorySegment transform
    ) {
    	MethodHandle method = MSDF_GENERATE_SDF.get();
    	try {
    		return (int) method.invokeExact(
    			output,
    			shape,
    			transform
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#generate_sdf].
    public static int generate_sdf(
    	MsdfBitmap output,
    	MsdfShape shape,
    	MsdfTransform transform
    ) {
    	return generate_sdf(
    		output.memorySegment(),
    		shape.memorySegment(),
    		transform.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// @param output A pointer to a bitmap that was allocated with @code msdf_bitmap_alloc@endcode to which
    /// the given shape is rendered. The bitmap must be of type @code MSDF_BITMAP_TYPE_PSDF@endcode.
    /// @param shape A pointer to the shape to render to the given bitmap.
    /// @param transform The transform which is applied to the given shape during rendering.
    /// @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
    /// ```
    public static int generate_psdf(
    	MemorySegment output,
    	MemorySegment shape,
    	MemorySegment transform
    ) {
    	MethodHandle method = MSDF_GENERATE_PSDF.get();
    	try {
    		return (int) method.invokeExact(
    			output,
    			shape,
    			transform
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#generate_psdf].
    public static int generate_psdf(
    	MsdfBitmap output,
    	MsdfShape shape,
    	MsdfTransform transform
    ) {
    	return generate_psdf(
    		output.memorySegment(),
    		shape.memorySegment(),
    		transform.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// @param output A pointer to a bitmap that was allocated with @code msdf_bitmap_alloc@endcode to which
    /// the given shape is rendered. The bitmap must be of type @code MSDF_BITMAP_TYPE_MSDF@endcode.
    /// @param shape A pointer to the shape to render to the given bitmap.
    /// @param transform The transform which is applied to the given shape during rendering.
    /// @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
    /// ```
    public static int generate_msdf(
    	MemorySegment output,
    	MemorySegment shape,
    	MemorySegment transform
    ) {
    	MethodHandle method = MSDF_GENERATE_MSDF.get();
    	try {
    		return (int) method.invokeExact(
    			output,
    			shape,
    			transform
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#generate_msdf].
    public static int generate_msdf(
    	MsdfBitmap output,
    	MsdfShape shape,
    	MsdfTransform transform
    ) {
    	return generate_msdf(
    		output.memorySegment(),
    		shape.memorySegment(),
    		transform.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// @param output A pointer to a bitmap that was allocated with @code msdf_bitmap_alloc@endcode to which
    /// the given shape is rendered. The bitmap must be of type @code MSDF_BITMAP_TYPE_MTSDF@endcode.
    /// @param shape A pointer to the shape to render to the given bitmap.
    /// @param transform The transform which is applied to the given shape during rendering.
    /// @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
    /// ```
    public static int generate_mtsdf(
    	MemorySegment output,
    	MemorySegment shape,
    	MemorySegment transform
    ) {
    	MethodHandle method = MSDF_GENERATE_MTSDF.get();
    	try {
    		return (int) method.invokeExact(
    			output,
    			shape,
    			transform
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#generate_mtsdf].
    public static int generate_mtsdf(
    	MsdfBitmap output,
    	MsdfShape shape,
    	MsdfTransform transform
    ) {
    	return generate_mtsdf(
    		output.memorySegment(),
    		shape.memorySegment(),
    		transform.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// @param output A pointer to a bitmap that was allocated with @code msdf_bitmap_alloc@endcode to which
    /// the given shape is rendered. The bitmap must be of type @code MSDF_BITMAP_TYPE_SDF@endcode.
    /// @param shape A pointer to the shape to render to the given bitmap.
    /// @param transform The transform which is applied to the given shape during rendering.
    /// @param config A pointer to the config which is applied to the sprite generator before rendering.
    /// @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
    /// ```
    public static int generate_sdf_with_config(
    	MemorySegment output,
    	MemorySegment shape,
    	MemorySegment transform,
    	MemorySegment config
    ) {
    	MethodHandle method = MSDF_GENERATE_SDF_WITH_CONFIG.get();
    	try {
    		return (int) method.invokeExact(
    			output,
    			shape,
    			transform,
    			config
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#generate_sdf_with_config].
    public static int generate_sdf_with_config(
    	MsdfBitmap output,
    	MsdfShape shape,
    	MsdfTransform transform,
    	MsdfConfig config
    ) {
    	return generate_sdf_with_config(
    		output.memorySegment(),
    		shape.memorySegment(),
    		transform.memorySegment(),
    		config.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// @param output A pointer to a bitmap that was allocated with @code msdf_bitmap_alloc@endcode to which
    /// the given shape is rendered. The bitmap must be of type @code MSDF_BITMAP_TYPE_PSDF@endcode.
    /// @param shape A pointer to the shape to render to the given bitmap.
    /// @param transform The transform which is applied to the given shape during rendering.
    /// @param config A pointer to the config which is applied to the sprite generator before rendering.
    /// @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
    /// ```
    public static int generate_psdf_with_config(
    	MemorySegment output,
    	MemorySegment shape,
    	MemorySegment transform,
    	MemorySegment config
    ) {
    	MethodHandle method = MSDF_GENERATE_PSDF_WITH_CONFIG.get();
    	try {
    		return (int) method.invokeExact(
    			output,
    			shape,
    			transform,
    			config
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#generate_psdf_with_config].
    public static int generate_psdf_with_config(
    	MsdfBitmap output,
    	MsdfShape shape,
    	MsdfTransform transform,
    	MsdfConfig config
    ) {
    	return generate_psdf_with_config(
    		output.memorySegment(),
    		shape.memorySegment(),
    		transform.memorySegment(),
    		config.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// @param output A pointer to a bitmap that was allocated with @code msdf_bitmap_alloc@endcode to which
    /// the given shape is rendered. The bitmap must be of type @code MSDF_BITMAP_TYPE_MSDF@endcode.
    /// @param shape A pointer to the shape to render to the given bitmap.
    /// @param transform The transform which is applied to the given shape during rendering.
    /// @param config A pointer to the config which is applied to the sprite generator before rendering.
    /// @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
    /// ```
    public static int generate_msdf_with_config(
    	MemorySegment output,
    	MemorySegment shape,
    	MemorySegment transform,
    	MemorySegment config
    ) {
    	MethodHandle method = MSDF_GENERATE_MSDF_WITH_CONFIG.get();
    	try {
    		return (int) method.invokeExact(
    			output,
    			shape,
    			transform,
    			config
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#generate_msdf_with_config].
    public static int generate_msdf_with_config(
    	MsdfBitmap output,
    	MsdfShape shape,
    	MsdfTransform transform,
    	MsdfMultichannelConfig config
    ) {
    	return generate_msdf_with_config(
    		output.memorySegment(),
    		shape.memorySegment(),
    		transform.memorySegment(),
    		config.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// @param output A pointer to a bitmap that was allocated with @code msdf_bitmap_alloc@endcode to which
    /// the given shape is rendered. The bitmap must be of type @code MSDF_BITMAP_TYPE_MTSDF@endcode.
    /// @param shape A pointer to the shape to render to the given bitmap.
    /// @param transform The transform which is applied to the given shape during rendering.
    /// @param config A pointer to the config which is applied to the sprite generator before rendering.
    /// @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
    /// ```
    public static int generate_mtsdf_with_config(
    	MemorySegment output,
    	MemorySegment shape,
    	MemorySegment transform,
    	MemorySegment config
    ) {
    	MethodHandle method = MSDF_GENERATE_MTSDF_WITH_CONFIG.get();
    	try {
    		return (int) method.invokeExact(
    			output,
    			shape,
    			transform,
    			config
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#generate_mtsdf_with_config].
    public static int generate_mtsdf_with_config(
    	MsdfBitmap output,
    	MsdfShape shape,
    	MsdfTransform transform,
    	MsdfMultichannelConfig config
    ) {
    	return generate_mtsdf_with_config(
    		output.memorySegment(),
    		shape.memorySegment(),
    		transform.memorySegment(),
    		config.memorySegment()
    	);
    }
    
    public static int render_sdf(
    	MemorySegment output,
    	MemorySegment sdf
    ) {
    	MethodHandle method = MSDF_RENDER_SDF.get();
    	try {
    		return (int) method.invokeExact(
    			output,
    			sdf
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#render_sdf].
    public static int render_sdf(
    	MsdfBitmap output,
    	MsdfBitmap sdf
    ) {
    	return render_sdf(
    		output.memorySegment(),
    		sdf.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Initializes a new FreeType instance to be used with msdfgen.
    /// @param handle A pointer to a handle to be populated with a new FreeType context.
    /// @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
    /// ```
    public static int ft_init(
    	MemorySegment handle
    ) {
    	MethodHandle method = MSDF_FT_INIT.get();
    	try {
    		return (int) method.invokeExact(
    			handle
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ft_init].
    public static int ft_init(
    	NativePointerArray handle
    ) {
    	return ft_init(
    		handle.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Loads a TrueType font from the given file(path) and populates
    /// the given font handle with the address of the newly loaded font.
    /// @param handle The handle to the FreeType context to use for loading the font.
    /// @param filename The name or path of/to the font file to load.
    /// @param font A pointer to a font handle to be populated with the address of the newly loaded font.
    /// @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
    /// ```
    public static int ft_load_font(
    	MemorySegment handle,
    	MemorySegment filename,
    	MemorySegment font
    ) {
    	MethodHandle method = MSDF_FT_LOAD_FONT.get();
    	try {
    		return (int) method.invokeExact(
    			handle,
    			filename,
    			font
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ft_load_font].
    public static int ft_load_font(
    	MsdfFreetype handle,
    	String filename,
    	NativePointerArray font
    ) {
    	try (Arena arena = MemoryStack.stackPush()) {
    		return ft_load_font(
    			handle.memorySegment(),
    			arena.allocateFrom(filename),
    			font.memorySegment()
    		);
    	}
    }
    
    /// ```
    /// 
    /// Adopts the given FreeType FT_Face pointer as a font handle.
    /// @param face An opaque pointer to the FT_Face to adopt.
    /// @param font A pointer to an address to be populated with the newly allocated font handle.
    /// @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
    /// ```
    public static int ft_adopt_font(
    	MemorySegment face,
    	MemorySegment font
    ) {
    	MethodHandle method = MSDF_FT_ADOPT_FONT.get();
    	try {
    		return (int) method.invokeExact(
    			face,
    			font
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ft_adopt_font].
    public static int ft_adopt_font(
    	MemorySegment face,
    	NativePointerArray font
    ) {
    	return ft_adopt_font(
    		face,
    		font.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Loads a TrueType font from the given buffer and populates
    /// the given font handle with the address of the newly loaded font.
    /// @param handle The handle to the FreeType context to use for loading the font.
    /// @param data A pointer to the raw data of the TrueType font to load.
    /// @param size The size of the data buffer in bytes.
    /// @param font A pointer to a font handle to be populated with the address of the newly loaded font.
    /// @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
    /// ```
    public static int ft_load_font_data(
    	MemorySegment handle,
    	MemorySegment data,
    	long size,
    	MemorySegment font
    ) {
    	MethodHandle method = MSDF_FT_LOAD_FONT_DATA.get();
    	try {
    		return (int) method.invokeExact(
    			handle,
    			data,
    			size,
    			font
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ft_load_font_data].
    public static int ft_load_font_data(
    	MsdfFreetype handle,
    	MemorySegment data,
    	long size,
    	NativePointerArray font
    ) {
    	return ft_load_font_data(
    		handle.memorySegment(),
    		data,
    		size,
    		font.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Loads a single glyph from the given font and converts it into a vector shape
    /// for rendering glyph sprites.
    /// @param font A handle to the font to use for generating the glyph shape.
    /// @param cp The codepoint to generate a shape for.
    /// @param coordinateScaling The type of coordinate transform applied to the shape.
    /// @param advance A pointer to a double to be populated with the glyph advance value.
    /// @param shape A pointer to a handle to be populated with the address of the newly created shape.
    /// This shape must later be freed using msdf_shape_free!
    /// @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
    /// ```
    public static int ft_font_load_glyph(
    	MemorySegment font,
    	int cp,
    	int coordinateScaling,
    	MemorySegment advance,
    	MemorySegment shape
    ) {
    	MethodHandle method = MSDF_FT_FONT_LOAD_GLYPH.get();
    	try {
    		return (int) method.invokeExact(
    			font,
    			cp,
    			coordinateScaling,
    			advance,
    			shape
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ft_font_load_glyph].
    public static int ft_font_load_glyph(
    	MsdfFreetypeFont font,
    	int cp,
    	int coordinateScaling,
    	NativeDoubleArray advance,
    	NativePointerArray shape
    ) {
    	return ft_font_load_glyph(
    		font.memorySegment(),
    		cp,
    		coordinateScaling,
    		advance.memorySegment(),
    		shape.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Loads a single glyph from the given font and converts it into a vector shape
    /// for rendering glyph sprites.
    /// @param font A handle to the font to load the glyph shape from.
    /// @param index The glyph index to generate a shape for.
    /// @param coordinateScaling The type of coordinate transform applied to the shape.
    /// @param advance A pointer to a double to be populated with the glyph advance value.
    /// @param shape A pointer to a handle to be populated with the address of the newly created shape.
    /// This shape must later be freed using msdf_shape_free!
    /// @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
    /// ```
    public static int ft_font_load_glyph_by_index(
    	MemorySegment font,
    	int index,
    	int coordinateScaling,
    	MemorySegment advance,
    	MemorySegment shape
    ) {
    	MethodHandle method = MSDF_FT_FONT_LOAD_GLYPH_BY_INDEX.get();
    	try {
    		return (int) method.invokeExact(
    			font,
    			index,
    			coordinateScaling,
    			advance,
    			shape
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ft_font_load_glyph_by_index].
    public static int ft_font_load_glyph_by_index(
    	MsdfFreetypeFont font,
    	int index,
    	int coordinateScaling,
    	NativeDoubleArray advance,
    	NativePointerArray shape
    ) {
    	return ft_font_load_glyph_by_index(
    		font.memorySegment(),
    		index,
    		coordinateScaling,
    		advance.memorySegment(),
    		shape.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Retrieves the glyph index of the given unicode codepoint.
    /// @param font A handle to the font to retrieve the glyph index from.
    /// @param cp The codepoint to retrieve the glyph index for.
    /// @param index A pointer to the glyph index to be retrieved.
    /// @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
    /// ```
    public static int ft_font_get_glyph_index(
    	MemorySegment font,
    	int cp,
    	MemorySegment index
    ) {
    	MethodHandle method = MSDF_FT_FONT_GET_GLYPH_INDEX.get();
    	try {
    		return (int) method.invokeExact(
    			font,
    			cp,
    			index
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ft_font_get_glyph_index].
    public static int ft_font_get_glyph_index(
    	MsdfFreetypeFont font,
    	int cp,
    	NativeIntArray index
    ) {
    	return ft_font_get_glyph_index(
    		font.memorySegment(),
    		cp,
    		index.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Retrieves the kerning between the two given glyphs.
    /// @param font A handle to the font to retrieve the kerning from.
    /// @param index1 The glyph index of the left glyph.
    /// @param index2 The glyph index of the right glyph.
    /// @param kerning A pointer to the kerning value to be retrieved.
    /// @returns @code MSDF_SUCCESS@endcode on success, otherwise one of the constants prefixed with @code MSDF_ERR_@endcode.
    /// ```
    public static int ft_font_get_kerning_by_index(
    	MemorySegment font,
    	int index1,
    	int index2,
    	MemorySegment kerning
    ) {
    	MethodHandle method = MSDF_FT_FONT_GET_KERNING_BY_INDEX.get();
    	try {
    		return (int) method.invokeExact(
    			font,
    			index1,
    			index2,
    			kerning
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ft_font_get_kerning_by_index].
    public static int ft_font_get_kerning_by_index(
    	MsdfFreetypeFont font,
    	int index1,
    	int index2,
    	NativeDoubleArray kerning
    ) {
    	return ft_font_get_kerning_by_index(
    		font.memorySegment(),
    		index1,
    		index2,
    		kerning.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Retrieves the kerning between the two given codepoints.
    /// @param font A handle to the font to retrieve the kerning from.
    /// @param cp1 The left codepoint.
    /// @param cp2 The right codepoint.
    /// @param kerning A pointer to the kerning value to be retrieved.
    /// ```
    public static int ft_font_get_kerning(
    	MemorySegment font,
    	int cp1,
    	int cp2,
    	MemorySegment kerning
    ) {
    	MethodHandle method = MSDF_FT_FONT_GET_KERNING.get();
    	try {
    		return (int) method.invokeExact(
    			font,
    			cp1,
    			cp2,
    			kerning
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ft_font_get_kerning].
    public static int ft_font_get_kerning(
    	MsdfFreetypeFont font,
    	int cp1,
    	int cp2,
    	NativeDoubleArray kerning
    ) {
    	return ft_font_get_kerning(
    		font.memorySegment(),
    		cp1,
    		cp2,
    		kerning.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Frees the underlying instance of the given FreeType font.
    /// @param handle The handle to the font to free.
    /// ```
    public static void ft_font_destroy(
    	MemorySegment handle
    ) {
    	MethodHandle method = MSDF_FT_FONT_DESTROY.get();
    	try {
    		 method.invokeExact(
    			handle
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ft_font_destroy].
    public static void ft_font_destroy(
    	MsdfFreetypeFont handle
    ) {
    	ft_font_destroy(
    		handle.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Frees the underlying FreeType instance of the given context.
    /// @param handle The handle to the FreeType context to free.
    /// ```
    public static void ft_deinit(
    	MemorySegment handle
    ) {
    	MethodHandle method = MSDF_FT_DEINIT.get();
    	try {
    		 method.invokeExact(
    			handle
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ft_deinit].
    public static void ft_deinit(
    	MsdfFreetype handle
    ) {
    	ft_deinit(
    		handle.memorySegment()
    	);
    }
    
}