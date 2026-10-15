/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.yoga;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.MethodHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeByteArray;
import volucris.bindings.core.NativePointerArray;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class Yoga {

	private static final LazyConstant<MethodHandle> YGALIGN_TO_STRING;
	private static final LazyConstant<MethodHandle> YGBOX_SIZING_TO_STRING;
	private static final LazyConstant<MethodHandle> YGDIMENSION_TO_STRING;
	private static final LazyConstant<MethodHandle> YGDIRECTION_TO_STRING;
	private static final LazyConstant<MethodHandle> YGDISPLAY_TO_STRING;
	private static final LazyConstant<MethodHandle> YGEDGE_TO_STRING;
	private static final LazyConstant<MethodHandle> YGERRATA_TO_STRING;
	private static final LazyConstant<MethodHandle> YGEXPERIMENTAL_FEATURE_TO_STRING;
	private static final LazyConstant<MethodHandle> YGFLEX_DIRECTION_TO_STRING;
	private static final LazyConstant<MethodHandle> YGGUTTER_TO_STRING;
	private static final LazyConstant<MethodHandle> YGJUSTIFY_TO_STRING;
	private static final LazyConstant<MethodHandle> YGLOG_LEVEL_TO_STRING;
	private static final LazyConstant<MethodHandle> YGMEASURE_MODE_TO_STRING;
	private static final LazyConstant<MethodHandle> YGNODE_TYPE_TO_STRING;
	private static final LazyConstant<MethodHandle> YGOVERFLOW_TO_STRING;
	private static final LazyConstant<MethodHandle> YGPOSITION_TYPE_TO_STRING;
	private static final LazyConstant<MethodHandle> YGUNIT_TO_STRING;
	private static final LazyConstant<MethodHandle> YGWRAP_TO_STRING;
	private static final LazyConstant<MethodHandle> YGCONFIG_NEW;
	private static final LazyConstant<MethodHandle> YGCONFIG_FREE;
	private static final LazyConstant<MethodHandle> YGCONFIG_GET_DEFAULT;
	private static final LazyConstant<MethodHandle> YGCONFIG_SET_USE_WEB_DEFAULTS;
	private static final LazyConstant<MethodHandle> YGCONFIG_GET_USE_WEB_DEFAULTS;
	private static final LazyConstant<MethodHandle> YGCONFIG_SET_POINT_SCALE_FACTOR;
	private static final LazyConstant<MethodHandle> YGCONFIG_GET_POINT_SCALE_FACTOR;
	private static final LazyConstant<MethodHandle> YGCONFIG_SET_ERRATA;
	private static final LazyConstant<MethodHandle> YGCONFIG_GET_ERRATA;
	private static final LazyConstant<MethodHandle> YGCONFIG_SET_LOGGER;
	private static final LazyConstant<MethodHandle> YGCONFIG_SET_CONTEXT;
	private static final LazyConstant<MethodHandle> YGCONFIG_GET_CONTEXT;
	private static final LazyConstant<MethodHandle> YGCONFIG_SET_EXPERIMENTAL_FEATURE_ENABLED;
	private static final LazyConstant<MethodHandle> YGCONFIG_IS_EXPERIMENTAL_FEATURE_ENABLED;
	private static final LazyConstant<MethodHandle> YGCONFIG_SET_CLONE_NODE_FUNC;
	private static final LazyConstant<MethodHandle> YGNODE_NEW;
	private static final LazyConstant<MethodHandle> YGNODE_NEW_WITH_CONFIG;
	private static final LazyConstant<MethodHandle> YGNODE_CLONE;
	private static final LazyConstant<MethodHandle> YGNODE_FREE;
	private static final LazyConstant<MethodHandle> YGNODE_FREE_RECURSIVE;
	private static final LazyConstant<MethodHandle> YGNODE_FINALIZE;
	private static final LazyConstant<MethodHandle> YGNODE_RESET;
	private static final LazyConstant<MethodHandle> YGNODE_CALCULATE_LAYOUT;
	private static final LazyConstant<MethodHandle> YGNODE_GET_HAS_NEW_LAYOUT;
	private static final LazyConstant<MethodHandle> YGNODE_SET_HAS_NEW_LAYOUT;
	private static final LazyConstant<MethodHandle> YGNODE_IS_DIRTY;
	private static final LazyConstant<MethodHandle> YGNODE_MARK_DIRTY;
	private static final LazyConstant<MethodHandle> YGNODE_SET_DIRTIED_FUNC;
	private static final LazyConstant<MethodHandle> YGNODE_GET_DIRTIED_FUNC;
	private static final LazyConstant<MethodHandle> YGNODE_INSERT_CHILD;
	private static final LazyConstant<MethodHandle> YGNODE_SWAP_CHILD;
	private static final LazyConstant<MethodHandle> YGNODE_REMOVE_CHILD;
	private static final LazyConstant<MethodHandle> YGNODE_REMOVE_ALL_CHILDREN;
	private static final LazyConstant<MethodHandle> YGNODE_SET_CHILDREN;
	private static final LazyConstant<MethodHandle> YGNODE_GET_CHILD;
	private static final LazyConstant<MethodHandle> YGNODE_GET_CHILD_COUNT;
	private static final LazyConstant<MethodHandle> YGNODE_GET_OWNER;
	private static final LazyConstant<MethodHandle> YGNODE_GET_PARENT;
	private static final LazyConstant<MethodHandle> YGNODE_SET_CONFIG;
	private static final LazyConstant<MethodHandle> YGNODE_GET_CONFIG;
	private static final LazyConstant<MethodHandle> YGNODE_SET_CONTEXT;
	private static final LazyConstant<MethodHandle> YGNODE_GET_CONTEXT;
	private static final LazyConstant<MethodHandle> YGNODE_SET_MEASURE_FUNC;
	private static final LazyConstant<MethodHandle> YGNODE_HAS_MEASURE_FUNC;
	private static final LazyConstant<MethodHandle> YGNODE_SET_BASELINE_FUNC;
	private static final LazyConstant<MethodHandle> YGNODE_HAS_BASELINE_FUNC;
	private static final LazyConstant<MethodHandle> YGNODE_SET_IS_REFERENCE_BASELINE;
	private static final LazyConstant<MethodHandle> YGNODE_IS_REFERENCE_BASELINE;
	private static final LazyConstant<MethodHandle> YGNODE_SET_NODE_TYPE;
	private static final LazyConstant<MethodHandle> YGNODE_GET_NODE_TYPE;
	private static final LazyConstant<MethodHandle> YGNODE_SET_ALWAYS_FORMS_CONTAINING_BLOCK;
	private static final LazyConstant<MethodHandle> YGNODE_GET_ALWAYS_FORMS_CONTAINING_BLOCK;
	private static final LazyConstant<MethodHandle> YGNODE_CAN_USE_CACHED_MEASUREMENT;
	private static final LazyConstant<MethodHandle> YGNODE_LAYOUT_GET_LEFT;
	private static final LazyConstant<MethodHandle> YGNODE_LAYOUT_GET_TOP;
	private static final LazyConstant<MethodHandle> YGNODE_LAYOUT_GET_RIGHT;
	private static final LazyConstant<MethodHandle> YGNODE_LAYOUT_GET_BOTTOM;
	private static final LazyConstant<MethodHandle> YGNODE_LAYOUT_GET_WIDTH;
	private static final LazyConstant<MethodHandle> YGNODE_LAYOUT_GET_HEIGHT;
	private static final LazyConstant<MethodHandle> YGNODE_LAYOUT_GET_DIRECTION;
	private static final LazyConstant<MethodHandle> YGNODE_LAYOUT_GET_HAD_OVERFLOW;
	private static final LazyConstant<MethodHandle> YGNODE_LAYOUT_GET_MARGIN;
	private static final LazyConstant<MethodHandle> YGNODE_LAYOUT_GET_BORDER;
	private static final LazyConstant<MethodHandle> YGNODE_LAYOUT_GET_PADDING;
	private static final LazyConstant<MethodHandle> YGFLOAT_IS_UNDEFINED;
	private static final LazyConstant<MethodHandle> YGNODE_COPY_STYLE;
	private static final LazyConstant<MethodHandle> YGNODE_STYLE_SET_DIRECTION;
	private static final LazyConstant<MethodHandle> YGNODE_STYLE_GET_DIRECTION;
	private static final LazyConstant<MethodHandle> YGNODE_STYLE_SET_FLEX_DIRECTION;
	private static final LazyConstant<MethodHandle> YGNODE_STYLE_GET_FLEX_DIRECTION;
	private static final LazyConstant<MethodHandle> YGNODE_STYLE_SET_JUSTIFY_CONTENT;
	private static final LazyConstant<MethodHandle> YGNODE_STYLE_GET_JUSTIFY_CONTENT;
	private static final LazyConstant<MethodHandle> YGNODE_STYLE_SET_ALIGN_CONTENT;
	private static final LazyConstant<MethodHandle> YGNODE_STYLE_GET_ALIGN_CONTENT;
	private static final LazyConstant<MethodHandle> YGNODE_STYLE_SET_ALIGN_ITEMS;
	private static final LazyConstant<MethodHandle> YGNODE_STYLE_GET_ALIGN_ITEMS;
	private static final LazyConstant<MethodHandle> YGNODE_STYLE_SET_ALIGN_SELF;
	private static final LazyConstant<MethodHandle> YGNODE_STYLE_GET_ALIGN_SELF;
	private static final LazyConstant<MethodHandle> YGNODE_STYLE_SET_POSITION_TYPE;
	private static final LazyConstant<MethodHandle> YGNODE_STYLE_GET_POSITION_TYPE;
	private static final LazyConstant<MethodHandle> YGNODE_STYLE_SET_FLEX_WRAP;
	private static final LazyConstant<MethodHandle> YGNODE_STYLE_GET_FLEX_WRAP;
	private static final LazyConstant<MethodHandle> YGNODE_STYLE_SET_OVERFLOW;
	private static final LazyConstant<MethodHandle> YGNODE_STYLE_GET_OVERFLOW;
	private static final LazyConstant<MethodHandle> YGNODE_STYLE_SET_DISPLAY;
	private static final LazyConstant<MethodHandle> YGNODE_STYLE_GET_DISPLAY;
	private static final LazyConstant<MethodHandle> YGNODE_STYLE_SET_FLEX;
	private static final LazyConstant<MethodHandle> YGNODE_STYLE_GET_FLEX;
	private static final LazyConstant<MethodHandle> YGNODE_STYLE_SET_FLEX_GROW;
	private static final LazyConstant<MethodHandle> YGNODE_STYLE_GET_FLEX_GROW;
	private static final LazyConstant<MethodHandle> YGNODE_STYLE_SET_FLEX_SHRINK;
	private static final LazyConstant<MethodHandle> YGNODE_STYLE_GET_FLEX_SHRINK;
	private static final LazyConstant<MethodHandle> YGNODE_STYLE_SET_FLEX_BASIS;
	private static final LazyConstant<MethodHandle> YGNODE_STYLE_SET_FLEX_BASIS_PERCENT;
	private static final LazyConstant<MethodHandle> YGNODE_STYLE_SET_FLEX_BASIS_AUTO;
	private static final LazyConstant<MethodHandle> YGNODE_STYLE_GET_FLEX_BASIS;
	private static final LazyConstant<MethodHandle> YGNODE_STYLE_SET_POSITION;
	private static final LazyConstant<MethodHandle> YGNODE_STYLE_SET_POSITION_PERCENT;
	private static final LazyConstant<MethodHandle> YGNODE_STYLE_GET_POSITION;
	private static final LazyConstant<MethodHandle> YGNODE_STYLE_SET_POSITION_AUTO;
	private static final LazyConstant<MethodHandle> YGNODE_STYLE_SET_MARGIN;
	private static final LazyConstant<MethodHandle> YGNODE_STYLE_SET_MARGIN_PERCENT;
	private static final LazyConstant<MethodHandle> YGNODE_STYLE_SET_MARGIN_AUTO;
	private static final LazyConstant<MethodHandle> YGNODE_STYLE_GET_MARGIN;
	private static final LazyConstant<MethodHandle> YGNODE_STYLE_SET_PADDING;
	private static final LazyConstant<MethodHandle> YGNODE_STYLE_SET_PADDING_PERCENT;
	private static final LazyConstant<MethodHandle> YGNODE_STYLE_GET_PADDING;
	private static final LazyConstant<MethodHandle> YGNODE_STYLE_SET_BORDER;
	private static final LazyConstant<MethodHandle> YGNODE_STYLE_GET_BORDER;
	private static final LazyConstant<MethodHandle> YGNODE_STYLE_SET_GAP;
	private static final LazyConstant<MethodHandle> YGNODE_STYLE_SET_GAP_PERCENT;
	private static final LazyConstant<MethodHandle> YGNODE_STYLE_GET_GAP;
	private static final LazyConstant<MethodHandle> YGNODE_STYLE_SET_BOX_SIZING;
	private static final LazyConstant<MethodHandle> YGNODE_STYLE_GET_BOX_SIZING;
	private static final LazyConstant<MethodHandle> YGNODE_STYLE_SET_WIDTH;
	private static final LazyConstant<MethodHandle> YGNODE_STYLE_SET_WIDTH_PERCENT;
	private static final LazyConstant<MethodHandle> YGNODE_STYLE_SET_WIDTH_AUTO;
	private static final LazyConstant<MethodHandle> YGNODE_STYLE_GET_WIDTH;
	private static final LazyConstant<MethodHandle> YGNODE_STYLE_SET_HEIGHT;
	private static final LazyConstant<MethodHandle> YGNODE_STYLE_SET_HEIGHT_PERCENT;
	private static final LazyConstant<MethodHandle> YGNODE_STYLE_SET_HEIGHT_AUTO;
	private static final LazyConstant<MethodHandle> YGNODE_STYLE_GET_HEIGHT;
	private static final LazyConstant<MethodHandle> YGNODE_STYLE_SET_MIN_WIDTH;
	private static final LazyConstant<MethodHandle> YGNODE_STYLE_SET_MIN_WIDTH_PERCENT;
	private static final LazyConstant<MethodHandle> YGNODE_STYLE_GET_MIN_WIDTH;
	private static final LazyConstant<MethodHandle> YGNODE_STYLE_SET_MIN_HEIGHT;
	private static final LazyConstant<MethodHandle> YGNODE_STYLE_SET_MIN_HEIGHT_PERCENT;
	private static final LazyConstant<MethodHandle> YGNODE_STYLE_GET_MIN_HEIGHT;
	private static final LazyConstant<MethodHandle> YGNODE_STYLE_SET_MAX_WIDTH;
	private static final LazyConstant<MethodHandle> YGNODE_STYLE_SET_MAX_WIDTH_PERCENT;
	private static final LazyConstant<MethodHandle> YGNODE_STYLE_GET_MAX_WIDTH;
	private static final LazyConstant<MethodHandle> YGNODE_STYLE_SET_MAX_HEIGHT;
	private static final LazyConstant<MethodHandle> YGNODE_STYLE_SET_MAX_HEIGHT_PERCENT;
	private static final LazyConstant<MethodHandle> YGNODE_STYLE_GET_MAX_HEIGHT;
	private static final LazyConstant<MethodHandle> YGNODE_STYLE_SET_ASPECT_RATIO;
	private static final LazyConstant<MethodHandle> YGNODE_STYLE_GET_ASPECT_RATIO;
	private static final LazyConstant<MethodHandle> YGROUND_VALUE_TO_PIXEL_GRID;
	private static final LazyConstant<MethodHandle> YGLOGGER;
	private static final LazyConstant<MethodHandle> YGCLONE_NODE_FUNC;
	private static final LazyConstant<MethodHandle> YGDIRTIED_FUNC;
	private static final LazyConstant<MethodHandle> YGMEASURE_FUNC;
	private static final LazyConstant<MethodHandle> YGBASELINE_FUNC;

	static {
		//@formatter:off
		YGALIGN_TO_STRING = downcallHandle("YGAlignToString", UNBOUNDED_ADDRESS, JAVA_INT);
		YGBOX_SIZING_TO_STRING = downcallHandle("YGBoxSizingToString", UNBOUNDED_ADDRESS, JAVA_INT);
		YGDIMENSION_TO_STRING = downcallHandle("YGDimensionToString", UNBOUNDED_ADDRESS, JAVA_INT);
		YGDIRECTION_TO_STRING = downcallHandle("YGDirectionToString", UNBOUNDED_ADDRESS, JAVA_INT);
		YGDISPLAY_TO_STRING = downcallHandle("YGDisplayToString", UNBOUNDED_ADDRESS, JAVA_INT);
		YGEDGE_TO_STRING = downcallHandle("YGEdgeToString", UNBOUNDED_ADDRESS, JAVA_INT);
		YGERRATA_TO_STRING = downcallHandle("YGErrataToString", UNBOUNDED_ADDRESS, JAVA_INT);
		YGEXPERIMENTAL_FEATURE_TO_STRING = downcallHandle("YGExperimentalFeatureToString", UNBOUNDED_ADDRESS, JAVA_INT);
		YGFLEX_DIRECTION_TO_STRING = downcallHandle("YGFlexDirectionToString", UNBOUNDED_ADDRESS, JAVA_INT);
		YGGUTTER_TO_STRING = downcallHandle("YGGutterToString", UNBOUNDED_ADDRESS, JAVA_INT);
		YGJUSTIFY_TO_STRING = downcallHandle("YGJustifyToString", UNBOUNDED_ADDRESS, JAVA_INT);
		YGLOG_LEVEL_TO_STRING = downcallHandle("YGLogLevelToString", UNBOUNDED_ADDRESS, JAVA_INT);
		YGMEASURE_MODE_TO_STRING = downcallHandle("YGMeasureModeToString", UNBOUNDED_ADDRESS, JAVA_INT);
		YGNODE_TYPE_TO_STRING = downcallHandle("YGNodeTypeToString", UNBOUNDED_ADDRESS, JAVA_INT);
		YGOVERFLOW_TO_STRING = downcallHandle("YGOverflowToString", UNBOUNDED_ADDRESS, JAVA_INT);
		YGPOSITION_TYPE_TO_STRING = downcallHandle("YGPositionTypeToString", UNBOUNDED_ADDRESS, JAVA_INT);
		YGUNIT_TO_STRING = downcallHandle("YGUnitToString", UNBOUNDED_ADDRESS, JAVA_INT);
		YGWRAP_TO_STRING = downcallHandle("YGWrapToString", UNBOUNDED_ADDRESS, JAVA_INT);
		YGCONFIG_NEW = downcallHandle("YGConfigNew", UNBOUNDED_ADDRESS);
		YGCONFIG_FREE = downcallHandleVoid("YGConfigFree", UNBOUNDED_ADDRESS);
		YGCONFIG_GET_DEFAULT = downcallHandle("YGConfigGetDefault", UNBOUNDED_ADDRESS);
		YGCONFIG_SET_USE_WEB_DEFAULTS = downcallHandleVoid("YGConfigSetUseWebDefaults", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		YGCONFIG_GET_USE_WEB_DEFAULTS = downcallHandle("YGConfigGetUseWebDefaults", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		YGCONFIG_SET_POINT_SCALE_FACTOR = downcallHandleVoid("YGConfigSetPointScaleFactor", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		YGCONFIG_GET_POINT_SCALE_FACTOR = downcallHandle("YGConfigGetPointScaleFactor", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		YGCONFIG_SET_ERRATA = downcallHandleVoid("YGConfigSetErrata", UNBOUNDED_ADDRESS, JAVA_INT);
		YGCONFIG_GET_ERRATA = downcallHandle("YGConfigGetErrata", JAVA_INT, UNBOUNDED_ADDRESS);
		YGCONFIG_SET_LOGGER = downcallHandleVoid("YGConfigSetLogger", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		YGCONFIG_SET_CONTEXT = downcallHandleVoid("YGConfigSetContext", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		YGCONFIG_GET_CONTEXT = downcallHandle("YGConfigGetContext", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		YGCONFIG_SET_EXPERIMENTAL_FEATURE_ENABLED = downcallHandleVoid("YGConfigSetExperimentalFeatureEnabled", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_BOOLEAN);
		YGCONFIG_IS_EXPERIMENTAL_FEATURE_ENABLED = downcallHandle("YGConfigIsExperimentalFeatureEnabled", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, JAVA_INT);
		YGCONFIG_SET_CLONE_NODE_FUNC = downcallHandleVoid("YGConfigSetCloneNodeFunc", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		YGNODE_NEW = downcallHandle("YGNodeNew", UNBOUNDED_ADDRESS);
		YGNODE_NEW_WITH_CONFIG = downcallHandle("YGNodeNewWithConfig", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		YGNODE_CLONE = downcallHandle("YGNodeClone", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		YGNODE_FREE = downcallHandleVoid("YGNodeFree", UNBOUNDED_ADDRESS);
		YGNODE_FREE_RECURSIVE = downcallHandleVoid("YGNodeFreeRecursive", UNBOUNDED_ADDRESS);
		YGNODE_FINALIZE = downcallHandleVoid("YGNodeFinalize", UNBOUNDED_ADDRESS);
		YGNODE_RESET = downcallHandleVoid("YGNodeReset", UNBOUNDED_ADDRESS);
		YGNODE_CALCULATE_LAYOUT = downcallHandleVoid("YGNodeCalculateLayout", UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT, JAVA_INT);
		YGNODE_GET_HAS_NEW_LAYOUT = downcallHandle("YGNodeGetHasNewLayout", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		YGNODE_SET_HAS_NEW_LAYOUT = downcallHandleVoid("YGNodeSetHasNewLayout", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		YGNODE_IS_DIRTY = downcallHandle("YGNodeIsDirty", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		YGNODE_MARK_DIRTY = downcallHandleVoid("YGNodeMarkDirty", UNBOUNDED_ADDRESS);
		YGNODE_SET_DIRTIED_FUNC = downcallHandleVoid("YGNodeSetDirtiedFunc", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		YGNODE_GET_DIRTIED_FUNC = downcallHandle("YGNodeGetDirtiedFunc", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		YGNODE_INSERT_CHILD = downcallHandleVoid("YGNodeInsertChild", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG);
		YGNODE_SWAP_CHILD = downcallHandleVoid("YGNodeSwapChild", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG);
		YGNODE_REMOVE_CHILD = downcallHandleVoid("YGNodeRemoveChild", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		YGNODE_REMOVE_ALL_CHILDREN = downcallHandleVoid("YGNodeRemoveAllChildren", UNBOUNDED_ADDRESS);
		YGNODE_SET_CHILDREN = downcallHandleVoid("YGNodeSetChildren", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG);
		YGNODE_GET_CHILD = downcallHandle("YGNodeGetChild", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG);
		YGNODE_GET_CHILD_COUNT = downcallHandle("YGNodeGetChildCount", JAVA_LONG, UNBOUNDED_ADDRESS);
		YGNODE_GET_OWNER = downcallHandle("YGNodeGetOwner", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		YGNODE_GET_PARENT = downcallHandle("YGNodeGetParent", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		YGNODE_SET_CONFIG = downcallHandleVoid("YGNodeSetConfig", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		YGNODE_GET_CONFIG = downcallHandle("YGNodeGetConfig", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		YGNODE_SET_CONTEXT = downcallHandleVoid("YGNodeSetContext", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		YGNODE_GET_CONTEXT = downcallHandle("YGNodeGetContext", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		YGNODE_SET_MEASURE_FUNC = downcallHandleVoid("YGNodeSetMeasureFunc", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		YGNODE_HAS_MEASURE_FUNC = downcallHandle("YGNodeHasMeasureFunc", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		YGNODE_SET_BASELINE_FUNC = downcallHandleVoid("YGNodeSetBaselineFunc", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		YGNODE_HAS_BASELINE_FUNC = downcallHandle("YGNodeHasBaselineFunc", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		YGNODE_SET_IS_REFERENCE_BASELINE = downcallHandleVoid("YGNodeSetIsReferenceBaseline", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		YGNODE_IS_REFERENCE_BASELINE = downcallHandle("YGNodeIsReferenceBaseline", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		YGNODE_SET_NODE_TYPE = downcallHandleVoid("YGNodeSetNodeType", UNBOUNDED_ADDRESS, JAVA_INT);
		YGNODE_GET_NODE_TYPE = downcallHandle("YGNodeGetNodeType", JAVA_INT, UNBOUNDED_ADDRESS);
		YGNODE_SET_ALWAYS_FORMS_CONTAINING_BLOCK = downcallHandleVoid("YGNodeSetAlwaysFormsContainingBlock", UNBOUNDED_ADDRESS, JAVA_BOOLEAN);
		YGNODE_GET_ALWAYS_FORMS_CONTAINING_BLOCK = downcallHandle("YGNodeGetAlwaysFormsContainingBlock", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		YGNODE_CAN_USE_CACHED_MEASUREMENT = downcallHandle("YGNodeCanUseCachedMeasurement", JAVA_BOOLEAN, JAVA_INT, JAVA_FLOAT, JAVA_INT, JAVA_FLOAT, JAVA_INT, JAVA_FLOAT, JAVA_INT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, UNBOUNDED_ADDRESS);
		YGNODE_LAYOUT_GET_LEFT = downcallHandle("YGNodeLayoutGetLeft", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		YGNODE_LAYOUT_GET_TOP = downcallHandle("YGNodeLayoutGetTop", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		YGNODE_LAYOUT_GET_RIGHT = downcallHandle("YGNodeLayoutGetRight", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		YGNODE_LAYOUT_GET_BOTTOM = downcallHandle("YGNodeLayoutGetBottom", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		YGNODE_LAYOUT_GET_WIDTH = downcallHandle("YGNodeLayoutGetWidth", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		YGNODE_LAYOUT_GET_HEIGHT = downcallHandle("YGNodeLayoutGetHeight", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		YGNODE_LAYOUT_GET_DIRECTION = downcallHandle("YGNodeLayoutGetDirection", JAVA_INT, UNBOUNDED_ADDRESS);
		YGNODE_LAYOUT_GET_HAD_OVERFLOW = downcallHandle("YGNodeLayoutGetHadOverflow", JAVA_BOOLEAN, UNBOUNDED_ADDRESS);
		YGNODE_LAYOUT_GET_MARGIN = downcallHandle("YGNodeLayoutGetMargin", JAVA_FLOAT, UNBOUNDED_ADDRESS, JAVA_INT);
		YGNODE_LAYOUT_GET_BORDER = downcallHandle("YGNodeLayoutGetBorder", JAVA_FLOAT, UNBOUNDED_ADDRESS, JAVA_INT);
		YGNODE_LAYOUT_GET_PADDING = downcallHandle("YGNodeLayoutGetPadding", JAVA_FLOAT, UNBOUNDED_ADDRESS, JAVA_INT);
		YGFLOAT_IS_UNDEFINED = downcallHandle("YGFloatIsUndefined", JAVA_BOOLEAN, JAVA_FLOAT);
		YGNODE_COPY_STYLE = downcallHandleVoid("YGNodeCopyStyle", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		YGNODE_STYLE_SET_DIRECTION = downcallHandleVoid("YGNodeStyleSetDirection", UNBOUNDED_ADDRESS, JAVA_INT);
		YGNODE_STYLE_GET_DIRECTION = downcallHandle("YGNodeStyleGetDirection", JAVA_INT, UNBOUNDED_ADDRESS);
		YGNODE_STYLE_SET_FLEX_DIRECTION = downcallHandleVoid("YGNodeStyleSetFlexDirection", UNBOUNDED_ADDRESS, JAVA_INT);
		YGNODE_STYLE_GET_FLEX_DIRECTION = downcallHandle("YGNodeStyleGetFlexDirection", JAVA_INT, UNBOUNDED_ADDRESS);
		YGNODE_STYLE_SET_JUSTIFY_CONTENT = downcallHandleVoid("YGNodeStyleSetJustifyContent", UNBOUNDED_ADDRESS, JAVA_INT);
		YGNODE_STYLE_GET_JUSTIFY_CONTENT = downcallHandle("YGNodeStyleGetJustifyContent", JAVA_INT, UNBOUNDED_ADDRESS);
		YGNODE_STYLE_SET_ALIGN_CONTENT = downcallHandleVoid("YGNodeStyleSetAlignContent", UNBOUNDED_ADDRESS, JAVA_INT);
		YGNODE_STYLE_GET_ALIGN_CONTENT = downcallHandle("YGNodeStyleGetAlignContent", JAVA_INT, UNBOUNDED_ADDRESS);
		YGNODE_STYLE_SET_ALIGN_ITEMS = downcallHandleVoid("YGNodeStyleSetAlignItems", UNBOUNDED_ADDRESS, JAVA_INT);
		YGNODE_STYLE_GET_ALIGN_ITEMS = downcallHandle("YGNodeStyleGetAlignItems", JAVA_INT, UNBOUNDED_ADDRESS);
		YGNODE_STYLE_SET_ALIGN_SELF = downcallHandleVoid("YGNodeStyleSetAlignSelf", UNBOUNDED_ADDRESS, JAVA_INT);
		YGNODE_STYLE_GET_ALIGN_SELF = downcallHandle("YGNodeStyleGetAlignSelf", JAVA_INT, UNBOUNDED_ADDRESS);
		YGNODE_STYLE_SET_POSITION_TYPE = downcallHandleVoid("YGNodeStyleSetPositionType", UNBOUNDED_ADDRESS, JAVA_INT);
		YGNODE_STYLE_GET_POSITION_TYPE = downcallHandle("YGNodeStyleGetPositionType", JAVA_INT, UNBOUNDED_ADDRESS);
		YGNODE_STYLE_SET_FLEX_WRAP = downcallHandleVoid("YGNodeStyleSetFlexWrap", UNBOUNDED_ADDRESS, JAVA_INT);
		YGNODE_STYLE_GET_FLEX_WRAP = downcallHandle("YGNodeStyleGetFlexWrap", JAVA_INT, UNBOUNDED_ADDRESS);
		YGNODE_STYLE_SET_OVERFLOW = downcallHandleVoid("YGNodeStyleSetOverflow", UNBOUNDED_ADDRESS, JAVA_INT);
		YGNODE_STYLE_GET_OVERFLOW = downcallHandle("YGNodeStyleGetOverflow", JAVA_INT, UNBOUNDED_ADDRESS);
		YGNODE_STYLE_SET_DISPLAY = downcallHandleVoid("YGNodeStyleSetDisplay", UNBOUNDED_ADDRESS, JAVA_INT);
		YGNODE_STYLE_GET_DISPLAY = downcallHandle("YGNodeStyleGetDisplay", JAVA_INT, UNBOUNDED_ADDRESS);
		YGNODE_STYLE_SET_FLEX = downcallHandleVoid("YGNodeStyleSetFlex", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		YGNODE_STYLE_GET_FLEX = downcallHandle("YGNodeStyleGetFlex", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		YGNODE_STYLE_SET_FLEX_GROW = downcallHandleVoid("YGNodeStyleSetFlexGrow", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		YGNODE_STYLE_GET_FLEX_GROW = downcallHandle("YGNodeStyleGetFlexGrow", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		YGNODE_STYLE_SET_FLEX_SHRINK = downcallHandleVoid("YGNodeStyleSetFlexShrink", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		YGNODE_STYLE_GET_FLEX_SHRINK = downcallHandle("YGNodeStyleGetFlexShrink", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		YGNODE_STYLE_SET_FLEX_BASIS = downcallHandleVoid("YGNodeStyleSetFlexBasis", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		YGNODE_STYLE_SET_FLEX_BASIS_PERCENT = downcallHandleVoid("YGNodeStyleSetFlexBasisPercent", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		YGNODE_STYLE_SET_FLEX_BASIS_AUTO = downcallHandleVoid("YGNodeStyleSetFlexBasisAuto", UNBOUNDED_ADDRESS);
		YGNODE_STYLE_GET_FLEX_BASIS = downcallHandle("YGNodeStyleGetFlexBasis", YGValue.LAYOUT, UNBOUNDED_ADDRESS);
		YGNODE_STYLE_SET_POSITION = downcallHandleVoid("YGNodeStyleSetPosition", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_FLOAT);
		YGNODE_STYLE_SET_POSITION_PERCENT = downcallHandleVoid("YGNodeStyleSetPositionPercent", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_FLOAT);
		YGNODE_STYLE_GET_POSITION = downcallHandle("YGNodeStyleGetPosition", YGValue.LAYOUT, UNBOUNDED_ADDRESS, JAVA_INT);
		YGNODE_STYLE_SET_POSITION_AUTO = downcallHandleVoid("YGNodeStyleSetPositionAuto", UNBOUNDED_ADDRESS, JAVA_INT);
		YGNODE_STYLE_SET_MARGIN = downcallHandleVoid("YGNodeStyleSetMargin", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_FLOAT);
		YGNODE_STYLE_SET_MARGIN_PERCENT = downcallHandleVoid("YGNodeStyleSetMarginPercent", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_FLOAT);
		YGNODE_STYLE_SET_MARGIN_AUTO = downcallHandleVoid("YGNodeStyleSetMarginAuto", UNBOUNDED_ADDRESS, JAVA_INT);
		YGNODE_STYLE_GET_MARGIN = downcallHandle("YGNodeStyleGetMargin", YGValue.LAYOUT, UNBOUNDED_ADDRESS, JAVA_INT);
		YGNODE_STYLE_SET_PADDING = downcallHandleVoid("YGNodeStyleSetPadding", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_FLOAT);
		YGNODE_STYLE_SET_PADDING_PERCENT = downcallHandleVoid("YGNodeStyleSetPaddingPercent", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_FLOAT);
		YGNODE_STYLE_GET_PADDING = downcallHandle("YGNodeStyleGetPadding", YGValue.LAYOUT, UNBOUNDED_ADDRESS, JAVA_INT);
		YGNODE_STYLE_SET_BORDER = downcallHandleVoid("YGNodeStyleSetBorder", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_FLOAT);
		YGNODE_STYLE_GET_BORDER = downcallHandle("YGNodeStyleGetBorder", JAVA_FLOAT, UNBOUNDED_ADDRESS, JAVA_INT);
		YGNODE_STYLE_SET_GAP = downcallHandleVoid("YGNodeStyleSetGap", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_FLOAT);
		YGNODE_STYLE_SET_GAP_PERCENT = downcallHandleVoid("YGNodeStyleSetGapPercent", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_FLOAT);
		YGNODE_STYLE_GET_GAP = downcallHandle("YGNodeStyleGetGap", JAVA_FLOAT, UNBOUNDED_ADDRESS, JAVA_INT);
		YGNODE_STYLE_SET_BOX_SIZING = downcallHandleVoid("YGNodeStyleSetBoxSizing", UNBOUNDED_ADDRESS, JAVA_INT);
		YGNODE_STYLE_GET_BOX_SIZING = downcallHandle("YGNodeStyleGetBoxSizing", JAVA_INT, UNBOUNDED_ADDRESS);
		YGNODE_STYLE_SET_WIDTH = downcallHandleVoid("YGNodeStyleSetWidth", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		YGNODE_STYLE_SET_WIDTH_PERCENT = downcallHandleVoid("YGNodeStyleSetWidthPercent", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		YGNODE_STYLE_SET_WIDTH_AUTO = downcallHandleVoid("YGNodeStyleSetWidthAuto", UNBOUNDED_ADDRESS);
		YGNODE_STYLE_GET_WIDTH = downcallHandle("YGNodeStyleGetWidth", YGValue.LAYOUT, UNBOUNDED_ADDRESS);
		YGNODE_STYLE_SET_HEIGHT = downcallHandleVoid("YGNodeStyleSetHeight", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		YGNODE_STYLE_SET_HEIGHT_PERCENT = downcallHandleVoid("YGNodeStyleSetHeightPercent", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		YGNODE_STYLE_SET_HEIGHT_AUTO = downcallHandleVoid("YGNodeStyleSetHeightAuto", UNBOUNDED_ADDRESS);
		YGNODE_STYLE_GET_HEIGHT = downcallHandle("YGNodeStyleGetHeight", YGValue.LAYOUT, UNBOUNDED_ADDRESS);
		YGNODE_STYLE_SET_MIN_WIDTH = downcallHandleVoid("YGNodeStyleSetMinWidth", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		YGNODE_STYLE_SET_MIN_WIDTH_PERCENT = downcallHandleVoid("YGNodeStyleSetMinWidthPercent", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		YGNODE_STYLE_GET_MIN_WIDTH = downcallHandle("YGNodeStyleGetMinWidth", YGValue.LAYOUT, UNBOUNDED_ADDRESS);
		YGNODE_STYLE_SET_MIN_HEIGHT = downcallHandleVoid("YGNodeStyleSetMinHeight", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		YGNODE_STYLE_SET_MIN_HEIGHT_PERCENT = downcallHandleVoid("YGNodeStyleSetMinHeightPercent", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		YGNODE_STYLE_GET_MIN_HEIGHT = downcallHandle("YGNodeStyleGetMinHeight", YGValue.LAYOUT, UNBOUNDED_ADDRESS);
		YGNODE_STYLE_SET_MAX_WIDTH = downcallHandleVoid("YGNodeStyleSetMaxWidth", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		YGNODE_STYLE_SET_MAX_WIDTH_PERCENT = downcallHandleVoid("YGNodeStyleSetMaxWidthPercent", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		YGNODE_STYLE_GET_MAX_WIDTH = downcallHandle("YGNodeStyleGetMaxWidth", YGValue.LAYOUT, UNBOUNDED_ADDRESS);
		YGNODE_STYLE_SET_MAX_HEIGHT = downcallHandleVoid("YGNodeStyleSetMaxHeight", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		YGNODE_STYLE_SET_MAX_HEIGHT_PERCENT = downcallHandleVoid("YGNodeStyleSetMaxHeightPercent", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		YGNODE_STYLE_GET_MAX_HEIGHT = downcallHandle("YGNodeStyleGetMaxHeight", YGValue.LAYOUT, UNBOUNDED_ADDRESS);
		YGNODE_STYLE_SET_ASPECT_RATIO = downcallHandleVoid("YGNodeStyleSetAspectRatio", UNBOUNDED_ADDRESS, JAVA_FLOAT);
		YGNODE_STYLE_GET_ASPECT_RATIO = downcallHandle("YGNodeStyleGetAspectRatio", JAVA_FLOAT, UNBOUNDED_ADDRESS);
		YGROUND_VALUE_TO_PIXEL_GRID = downcallHandle("YGRoundValueToPixelGrid", JAVA_FLOAT, JAVA_DOUBLE, JAVA_DOUBLE, JAVA_BOOLEAN, JAVA_BOOLEAN);
		YGLOGGER = downcallHandle(true, "YGLogger", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		YGCLONE_NODE_FUNC = downcallHandle(true, "YGCloneNodeFunc", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG);
		YGDIRTIED_FUNC = downcallHandleVoid(true, "YGDirtiedFunc", UNBOUNDED_ADDRESS);
		YGMEASURE_FUNC = downcallHandle(true, "YGMeasureFunc", YGSize.LAYOUT, UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_INT, JAVA_FLOAT, JAVA_INT);
		YGBASELINE_FUNC = downcallHandle(true, "YGBaselineFunc", JAVA_FLOAT, UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT);
		//@formatter:on
	}

	private Yoga() {
	}

    public static MemorySegment nalignToString(
    	int param0
    ) {
    	MethodHandle method = YGALIGN_TO_STRING.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			param0
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nalignToString].
    public static @Nullable NativeByteArray alignToString(
    	int param0
    ) {
    	MemorySegment segment = nalignToString(
    		param0
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeByteArray(segment);
    }
    
    public static MemorySegment nboxSizingToString(
    	int param0
    ) {
    	MethodHandle method = YGBOX_SIZING_TO_STRING.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			param0
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nboxSizingToString].
    public static @Nullable NativeByteArray boxSizingToString(
    	int param0
    ) {
    	MemorySegment segment = nboxSizingToString(
    		param0
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeByteArray(segment);
    }
    
    public static MemorySegment ndimensionToString(
    	int param0
    ) {
    	MethodHandle method = YGDIMENSION_TO_STRING.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			param0
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ndimensionToString].
    public static @Nullable NativeByteArray dimensionToString(
    	int param0
    ) {
    	MemorySegment segment = ndimensionToString(
    		param0
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeByteArray(segment);
    }
    
    public static MemorySegment ndirectionToString(
    	int param0
    ) {
    	MethodHandle method = YGDIRECTION_TO_STRING.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			param0
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ndirectionToString].
    public static @Nullable NativeByteArray directionToString(
    	int param0
    ) {
    	MemorySegment segment = ndirectionToString(
    		param0
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeByteArray(segment);
    }
    
    public static MemorySegment ndisplayToString(
    	int param0
    ) {
    	MethodHandle method = YGDISPLAY_TO_STRING.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			param0
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ndisplayToString].
    public static @Nullable NativeByteArray displayToString(
    	int param0
    ) {
    	MemorySegment segment = ndisplayToString(
    		param0
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeByteArray(segment);
    }
    
    public static MemorySegment nedgeToString(
    	int param0
    ) {
    	MethodHandle method = YGEDGE_TO_STRING.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			param0
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nedgeToString].
    public static @Nullable NativeByteArray edgeToString(
    	int param0
    ) {
    	MemorySegment segment = nedgeToString(
    		param0
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeByteArray(segment);
    }
    
    public static MemorySegment nerrataToString(
    	int param0
    ) {
    	MethodHandle method = YGERRATA_TO_STRING.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			param0
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nerrataToString].
    public static @Nullable NativeByteArray errataToString(
    	int param0
    ) {
    	MemorySegment segment = nerrataToString(
    		param0
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeByteArray(segment);
    }
    
    public static MemorySegment nexperimentalFeatureToString(
    	int param0
    ) {
    	MethodHandle method = YGEXPERIMENTAL_FEATURE_TO_STRING.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			param0
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nexperimentalFeatureToString].
    public static @Nullable NativeByteArray experimentalFeatureToString(
    	int param0
    ) {
    	MemorySegment segment = nexperimentalFeatureToString(
    		param0
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeByteArray(segment);
    }
    
    public static MemorySegment nflexDirectionToString(
    	int param0
    ) {
    	MethodHandle method = YGFLEX_DIRECTION_TO_STRING.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			param0
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nflexDirectionToString].
    public static @Nullable NativeByteArray flexDirectionToString(
    	int param0
    ) {
    	MemorySegment segment = nflexDirectionToString(
    		param0
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeByteArray(segment);
    }
    
    public static MemorySegment ngutterToString(
    	int param0
    ) {
    	MethodHandle method = YGGUTTER_TO_STRING.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			param0
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ngutterToString].
    public static @Nullable NativeByteArray gutterToString(
    	int param0
    ) {
    	MemorySegment segment = ngutterToString(
    		param0
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeByteArray(segment);
    }
    
    public static MemorySegment njustifyToString(
    	int param0
    ) {
    	MethodHandle method = YGJUSTIFY_TO_STRING.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			param0
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#njustifyToString].
    public static @Nullable NativeByteArray justifyToString(
    	int param0
    ) {
    	MemorySegment segment = njustifyToString(
    		param0
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeByteArray(segment);
    }
    
    public static MemorySegment nlogLevelToString(
    	int param0
    ) {
    	MethodHandle method = YGLOG_LEVEL_TO_STRING.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			param0
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nlogLevelToString].
    public static @Nullable NativeByteArray logLevelToString(
    	int param0
    ) {
    	MemorySegment segment = nlogLevelToString(
    		param0
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeByteArray(segment);
    }
    
    public static MemorySegment nmeasureModeToString(
    	int param0
    ) {
    	MethodHandle method = YGMEASURE_MODE_TO_STRING.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			param0
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nmeasureModeToString].
    public static @Nullable NativeByteArray measureModeToString(
    	int param0
    ) {
    	MemorySegment segment = nmeasureModeToString(
    		param0
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeByteArray(segment);
    }
    
    public static MemorySegment nnodeTypeToString(
    	int param0
    ) {
    	MethodHandle method = YGNODE_TYPE_TO_STRING.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			param0
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nnodeTypeToString].
    public static @Nullable NativeByteArray nodeTypeToString(
    	int param0
    ) {
    	MemorySegment segment = nnodeTypeToString(
    		param0
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeByteArray(segment);
    }
    
    public static MemorySegment noverflowToString(
    	int param0
    ) {
    	MethodHandle method = YGOVERFLOW_TO_STRING.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			param0
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#noverflowToString].
    public static @Nullable NativeByteArray overflowToString(
    	int param0
    ) {
    	MemorySegment segment = noverflowToString(
    		param0
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeByteArray(segment);
    }
    
    public static MemorySegment npositionTypeToString(
    	int param0
    ) {
    	MethodHandle method = YGPOSITION_TYPE_TO_STRING.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			param0
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#npositionTypeToString].
    public static @Nullable NativeByteArray positionTypeToString(
    	int param0
    ) {
    	MemorySegment segment = npositionTypeToString(
    		param0
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeByteArray(segment);
    }
    
    public static MemorySegment nunitToString(
    	int param0
    ) {
    	MethodHandle method = YGUNIT_TO_STRING.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			param0
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nunitToString].
    public static @Nullable NativeByteArray unitToString(
    	int param0
    ) {
    	MemorySegment segment = nunitToString(
    		param0
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeByteArray(segment);
    }
    
    public static MemorySegment nwrapToString(
    	int param0
    ) {
    	MethodHandle method = YGWRAP_TO_STRING.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			param0
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nwrapToString].
    public static @Nullable NativeByteArray wrapToString(
    	int param0
    ) {
    	MemorySegment segment = nwrapToString(
    		param0
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeByteArray(segment);
    }
    
    /// ```
    /// 
    /// Allocates a set of configuration options. The configuration may be applied to
    /// multiple nodes (i.e. a single global config), or can be applied more
    /// granularly per-node.
    /// ```
    public static MemorySegment nconfigNew() {
    	MethodHandle method = YGCONFIG_NEW.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nconfigNew].
    public static @Nullable YGConfig configNew() {
    	MemorySegment segment = nconfigNew();
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    	
    	return new YGConfig(segment);
    }
    
    /// ```
    /// 
    /// Frees the associated Yoga configuration.
    /// ```
    public static void configFree(
    	MemorySegment config
    ) {
    	MethodHandle method = YGCONFIG_FREE.get();
    	try {
    		 method.invokeExact(
    			config
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#configFree].
    public static void configFree(
    	YGConfig config
    ) {
    	configFree(
    		config.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Returns the default config values set by Yoga.
    /// ```
    public static MemorySegment nconfigGetDefault() {
    	MethodHandle method = YGCONFIG_GET_DEFAULT.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nconfigGetDefault].
    public static @Nullable YGConfig configGetDefault() {
    	MemorySegment segment = nconfigGetDefault();
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    	
    	return new YGConfig(segment);
    }
    
    /// ```
    /// 
    /// Yoga by default creates new nodes with style defaults different from flexbox
    /// on web (e.g. `YGFlexDirectionColumn` and `YGPositionRelative`).
    /// `UseWebDefaults` instructs Yoga to instead use a default style consistent
    /// with the web.
    /// ```
    public static void configSetUseWebDefaults(
    	MemorySegment config,
    	boolean enabled
    ) {
    	MethodHandle method = YGCONFIG_SET_USE_WEB_DEFAULTS.get();
    	try {
    		 method.invokeExact(
    			config,
    			enabled
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#configSetUseWebDefaults].
    public static void configSetUseWebDefaults(
    	YGConfig config,
    	boolean enabled
    ) {
    	configSetUseWebDefaults(
    		config.memorySegment(),
    		enabled
    	);
    }
    
    /// ```
    /// 
    /// Whether the configuration is set to use web defaults.
    /// ```
    public static boolean configGetUseWebDefaults(
    	MemorySegment config
    ) {
    	MethodHandle method = YGCONFIG_GET_USE_WEB_DEFAULTS.get();
    	try {
    		return (boolean) method.invokeExact(
    			config
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#configGetUseWebDefaults].
    public static boolean configGetUseWebDefaults(
    	YGConfig config
    ) {
    	return configGetUseWebDefaults(
    		config.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Yoga will by default round final layout positions and dimensions to the
    /// nearst point. `pointScaleFactor` controls the density of the grid used for
    /// layout rounding (e.g. to round to the closest display pixel).
    /// 
    /// May be set to 0.0f to avoid rounding the layout results.
    /// ```
    public static void configSetPointScaleFactor(
    	MemorySegment config,
    	float pixelsInPoint
    ) {
    	MethodHandle method = YGCONFIG_SET_POINT_SCALE_FACTOR.get();
    	try {
    		 method.invokeExact(
    			config,
    			pixelsInPoint
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#configSetPointScaleFactor].
    public static void configSetPointScaleFactor(
    	YGConfig config,
    	float pixelsInPoint
    ) {
    	configSetPointScaleFactor(
    		config.memorySegment(),
    		pixelsInPoint
    	);
    }
    
    /// ```
    /// 
    /// Get the currently set point scale factor.
    /// ```
    public static float configGetPointScaleFactor(
    	MemorySegment config
    ) {
    	MethodHandle method = YGCONFIG_GET_POINT_SCALE_FACTOR.get();
    	try {
    		return (float) method.invokeExact(
    			config
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#configGetPointScaleFactor].
    public static float configGetPointScaleFactor(
    	YGConfig config
    ) {
    	return configGetPointScaleFactor(
    		config.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Configures how Yoga balances W3C conformance vs compatibility with layouts
    /// created against earlier versions of Yoga.
    /// 
    /// By default Yoga will prioritize W3C conformance. `Errata` may be set to ask
    /// Yoga to produce specific incorrect behaviors. E.g. `YGConfigSetErrata(config,
    /// YGErrataStretchFlexBasis)`.
    /// 
    /// YGErrata is a bitmask, and multiple errata may be set at once. Predefined
    /// constants exist for convenience:
    /// 1. YGErrataNone: No errata
    /// 2. YGErrataClassic: Match layout behaviors of Yoga 1.x
    /// 3. YGErrataAll: Match layout behaviors of Yoga 1.x, including
    /// `UseLegacyStretchBehaviour`
    /// ```
    public static void configSetErrata(
    	MemorySegment config,
    	int errata
    ) {
    	MethodHandle method = YGCONFIG_SET_ERRATA.get();
    	try {
    		 method.invokeExact(
    			config,
    			errata
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#configSetErrata].
    public static void configSetErrata(
    	YGConfig config,
    	int errata
    ) {
    	configSetErrata(
    		config.memorySegment(),
    		errata
    	);
    }
    
    /// ```
    /// 
    /// Get the currently set errata.
    /// ```
    public static int configGetErrata(
    	MemorySegment config
    ) {
    	MethodHandle method = YGCONFIG_GET_ERRATA.get();
    	try {
    		return (int) method.invokeExact(
    			config
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#configGetErrata].
    public static int configGetErrata(
    	YGConfig config
    ) {
    	return configGetErrata(
    		config.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Set a custom log function for to use when logging diagnostics or fatal.
    /// errors.
    /// ```
    public static void configSetLogger(
    	MemorySegment config,
    	MemorySegment logger
    ) {
    	MethodHandle method = YGCONFIG_SET_LOGGER.get();
    	try {
    		 method.invokeExact(
    			config,
    			logger
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#configSetLogger].
    public static void configSetLogger(
    	YGConfig config,
    	YGLogger logger
    ) {
    	configSetLogger(
    		config.memorySegment(),
    		logger.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Sets an arbitrary context pointer on the config which may be read from during
    /// callbacks.
    /// ```
    public static void configSetContext(
    	MemorySegment config,
    	MemorySegment context
    ) {
    	MethodHandle method = YGCONFIG_SET_CONTEXT.get();
    	try {
    		 method.invokeExact(
    			config,
    			context
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#configSetContext].
    public static void configSetContext(
    	YGConfig config,
    	MemorySegment context
    ) {
    	configSetContext(
    		config.memorySegment(),
    		context
    	);
    }
    
    /// ```
    /// 
    /// Gets the currently set context.
    /// ```
    public static MemorySegment configGetContext(
    	MemorySegment config
    ) {
    	MethodHandle method = YGCONFIG_GET_CONTEXT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			config
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#configGetContext].
    public static @Nullable MemorySegment configGetContext(
    	YGConfig config
    ) {
    	MemorySegment segment = configGetContext(
    		config.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// ```
    /// 
    /// Enable an experimental/unsupported feature in Yoga.
    /// ```
    public static void configSetExperimentalFeatureEnabled(
    	MemorySegment config,
    	int feature,
    	boolean enabled
    ) {
    	MethodHandle method = YGCONFIG_SET_EXPERIMENTAL_FEATURE_ENABLED.get();
    	try {
    		 method.invokeExact(
    			config,
    			feature,
    			enabled
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#configSetExperimentalFeatureEnabled].
    public static void configSetExperimentalFeatureEnabled(
    	YGConfig config,
    	int feature,
    	boolean enabled
    ) {
    	configSetExperimentalFeatureEnabled(
    		config.memorySegment(),
    		feature,
    		enabled
    	);
    }
    
    /// ```
    /// 
    /// Whether an experimental feature is set.
    /// ```
    public static boolean configIsExperimentalFeatureEnabled(
    	MemorySegment config,
    	int feature
    ) {
    	MethodHandle method = YGCONFIG_IS_EXPERIMENTAL_FEATURE_ENABLED.get();
    	try {
    		return (boolean) method.invokeExact(
    			config,
    			feature
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#configIsExperimentalFeatureEnabled].
    public static boolean configIsExperimentalFeatureEnabled(
    	YGConfig config,
    	int feature
    ) {
    	return configIsExperimentalFeatureEnabled(
    		config.memorySegment(),
    		feature
    	);
    }
    
    /// ```
    /// 
    /// Sets a callback, called during layout, to create a new mutable Yoga node if
    /// Yoga must write to it and its owner is not its parent observed during layout.
    /// ```
    public static void configSetCloneNodeFunc(
    	MemorySegment config,
    	MemorySegment callback
    ) {
    	MethodHandle method = YGCONFIG_SET_CLONE_NODE_FUNC.get();
    	try {
    		 method.invokeExact(
    			config,
    			callback
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#configSetCloneNodeFunc].
    public static void configSetCloneNodeFunc(
    	YGConfig config,
    	YGCloneNodeFunc callback
    ) {
    	configSetCloneNodeFunc(
    		config.memorySegment(),
    		callback.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Heap allocates and returns a new Yoga node using Yoga settings.
    /// ```
    public static MemorySegment nnodeNew() {
    	MethodHandle method = YGNODE_NEW.get();
    	try {
    		return (MemorySegment) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nnodeNew].
    public static @Nullable YGNode nodeNew() {
    	MemorySegment segment = nnodeNew();
    
        if (segment.equals(MemorySegment.NULL))
            return null;
    	
    	return new YGNode(segment);
    }
    
    /// ```
    /// 
    /// Heap allocates and returns a new Yoga node, with customized settings.
    /// ```
    public static MemorySegment nodeNewWithConfig(
    	MemorySegment config
    ) {
    	MethodHandle method = YGNODE_NEW_WITH_CONFIG.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			config
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeNewWithConfig].
    public static @Nullable YGNode nodeNewWithConfig(
    	YGConfig config
    ) {
    	MemorySegment segment = nodeNewWithConfig(
    		config.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new YGNode(segment);
    }
    
    /// ```
    /// 
    /// Returns a mutable copy of an existing node, with the same context and
    /// children, but no owner set. Does not call the function set by
    /// YGConfigSetCloneNodeFunc().
    /// ```
    public static MemorySegment nodeClone(
    	MemorySegment node
    ) {
    	MethodHandle method = YGNODE_CLONE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			node
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeClone].
    public static @Nullable YGNode nodeClone(
    	YGNode node
    ) {
    	MemorySegment segment = nodeClone(
    		node.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new YGNode(segment);
    }
    
    /// ```
    /// 
    /// Frees the Yoga node, disconnecting it from its owner and children.
    /// ```
    public static void nodeFree(
    	MemorySegment node
    ) {
    	MethodHandle method = YGNODE_FREE.get();
    	try {
    		 method.invokeExact(
    			node
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeFree].
    public static void nodeFree(
    	YGNode node
    ) {
    	nodeFree(
    		node.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Frees the subtree of Yoga nodes rooted at the given node.
    /// ```
    public static void nodeFreeRecursive(
    	MemorySegment node
    ) {
    	MethodHandle method = YGNODE_FREE_RECURSIVE.get();
    	try {
    		 method.invokeExact(
    			node
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeFreeRecursive].
    public static void nodeFreeRecursive(
    	YGNode node
    ) {
    	nodeFreeRecursive(
    		node.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Frees the Yoga node without disconnecting it from its owner or children.
    /// Allows garbage collecting Yoga nodes in parallel when the entire tree is
    /// unreachable.
    /// ```
    public static void nodeFinalize(
    	MemorySegment node
    ) {
    	MethodHandle method = YGNODE_FINALIZE.get();
    	try {
    		 method.invokeExact(
    			node
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeFinalize].
    public static void nodeFinalize(
    	YGNode node
    ) {
    	nodeFinalize(
    		node.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Resets the node to its default state.
    /// ```
    public static void nodeReset(
    	MemorySegment node
    ) {
    	MethodHandle method = YGNODE_RESET.get();
    	try {
    		 method.invokeExact(
    			node
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeReset].
    public static void nodeReset(
    	YGNode node
    ) {
    	nodeReset(
    		node.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Calculates the layout of the tree rooted at the given node.
    /// 
    /// Layout results may be read after calling YGNodeCalculateLayout() using
    /// functions like YGNodeLayoutGetLeft(), YGNodeLayoutGetTop(), etc.
    /// 
    /// YGNodeGetHasNewLayout() may be read to know if the layout of the node or its
    /// subtrees may have changed since the last time YGNodeCalculate() was called.
    /// ```
    public static void nodeCalculateLayout(
    	MemorySegment node,
    	float availableWidth,
    	float availableHeight,
    	int ownerDirection
    ) {
    	MethodHandle method = YGNODE_CALCULATE_LAYOUT.get();
    	try {
    		 method.invokeExact(
    			node,
    			availableWidth,
    			availableHeight,
    			ownerDirection
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeCalculateLayout].
    public static void nodeCalculateLayout(
    	YGNode node,
    	float availableWidth,
    	float availableHeight,
    	int ownerDirection
    ) {
    	nodeCalculateLayout(
    		node.memorySegment(),
    		availableWidth,
    		availableHeight,
    		ownerDirection
    	);
    }
    
    /// ```
    /// 
    /// Whether the given node may have new layout results. Must be reset by calling
    /// YGNodeSetHasNewLayout().
    /// ```
    public static boolean nodeGetHasNewLayout(
    	MemorySegment node
    ) {
    	MethodHandle method = YGNODE_GET_HAS_NEW_LAYOUT.get();
    	try {
    		return (boolean) method.invokeExact(
    			node
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeGetHasNewLayout].
    public static boolean nodeGetHasNewLayout(
    	YGNode node
    ) {
    	return nodeGetHasNewLayout(
    		node.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Sets whether a nodes layout is considered new.
    /// ```
    public static void nodeSetHasNewLayout(
    	MemorySegment node,
    	boolean hasNewLayout
    ) {
    	MethodHandle method = YGNODE_SET_HAS_NEW_LAYOUT.get();
    	try {
    		 method.invokeExact(
    			node,
    			hasNewLayout
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeSetHasNewLayout].
    public static void nodeSetHasNewLayout(
    	YGNode node,
    	boolean hasNewLayout
    ) {
    	nodeSetHasNewLayout(
    		node.memorySegment(),
    		hasNewLayout
    	);
    }
    
    /// ```
    /// 
    /// Whether the node's layout results are dirty due to it or its children
    /// changing.
    /// ```
    public static boolean nodeIsDirty(
    	MemorySegment node
    ) {
    	MethodHandle method = YGNODE_IS_DIRTY.get();
    	try {
    		return (boolean) method.invokeExact(
    			node
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeIsDirty].
    public static boolean nodeIsDirty(
    	YGNode node
    ) {
    	return nodeIsDirty(
    		node.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Marks a node with custom measure function as dirty.
    /// ```
    public static void nodeMarkDirty(
    	MemorySegment node
    ) {
    	MethodHandle method = YGNODE_MARK_DIRTY.get();
    	try {
    		 method.invokeExact(
    			node
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeMarkDirty].
    public static void nodeMarkDirty(
    	YGNode node
    ) {
    	nodeMarkDirty(
    		node.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Called when a change is made to the Yoga tree which dirties this node.
    /// ```
    public static void nodeSetDirtiedFunc(
    	MemorySegment node,
    	MemorySegment dirtiedFunc
    ) {
    	MethodHandle method = YGNODE_SET_DIRTIED_FUNC.get();
    	try {
    		 method.invokeExact(
    			node,
    			dirtiedFunc
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeSetDirtiedFunc].
    public static void nodeSetDirtiedFunc(
    	YGNode node,
    	YGDirtiedFunc dirtiedFunc
    ) {
    	nodeSetDirtiedFunc(
    		node.memorySegment(),
    		dirtiedFunc.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Returns a dirtied func if set.
    /// ```
    public static MemorySegment nodeGetDirtiedFunc(
    	MemorySegment node
    ) {
    	MethodHandle method = YGNODE_GET_DIRTIED_FUNC.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			node
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeGetDirtiedFunc].
    public static @Nullable YGDirtiedFunc nodeGetDirtiedFunc(
    	YGNode node
    ) {
    	MemorySegment segment = nodeGetDirtiedFunc(
    		node.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return YGDirtiedFunc.get(segment);
    }
    
    /// ```
    /// 
    /// Inserts a child node at the given index.
    /// ```
    public static void nodeInsertChild(
    	MemorySegment node,
    	MemorySegment child,
    	long index
    ) {
    	MethodHandle method = YGNODE_INSERT_CHILD.get();
    	try {
    		 method.invokeExact(
    			node,
    			child,
    			index
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeInsertChild].
    public static void nodeInsertChild(
    	YGNode node,
    	YGNode child,
    	long index
    ) {
    	nodeInsertChild(
    		node.memorySegment(),
    		child.memorySegment(),
    		index
    	);
    }
    
    /// ```
    /// 
    /// Replaces the child node at a given index with a new one.
    /// ```
    public static void nodeSwapChild(
    	MemorySegment node,
    	MemorySegment child,
    	long index
    ) {
    	MethodHandle method = YGNODE_SWAP_CHILD.get();
    	try {
    		 method.invokeExact(
    			node,
    			child,
    			index
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeSwapChild].
    public static void nodeSwapChild(
    	YGNode node,
    	YGNode child,
    	long index
    ) {
    	nodeSwapChild(
    		node.memorySegment(),
    		child.memorySegment(),
    		index
    	);
    }
    
    /// ```
    /// 
    /// Removes the given child node.
    /// ```
    public static void nodeRemoveChild(
    	MemorySegment node,
    	MemorySegment child
    ) {
    	MethodHandle method = YGNODE_REMOVE_CHILD.get();
    	try {
    		 method.invokeExact(
    			node,
    			child
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeRemoveChild].
    public static void nodeRemoveChild(
    	YGNode node,
    	YGNode child
    ) {
    	nodeRemoveChild(
    		node.memorySegment(),
    		child.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Removes all children nodes.
    /// ```
    public static void nodeRemoveAllChildren(
    	MemorySegment node
    ) {
    	MethodHandle method = YGNODE_REMOVE_ALL_CHILDREN.get();
    	try {
    		 method.invokeExact(
    			node
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeRemoveAllChildren].
    public static void nodeRemoveAllChildren(
    	YGNode node
    ) {
    	nodeRemoveAllChildren(
    		node.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Sets children according to the given list of nodes.
    /// ```
    public static void nodeSetChildren(
    	MemorySegment owner,
    	MemorySegment children,
    	long count
    ) {
    	MethodHandle method = YGNODE_SET_CHILDREN.get();
    	try {
    		 method.invokeExact(
    			owner,
    			children,
    			count
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeSetChildren].
    public static void nodeSetChildren(
    	YGNode owner,
    	NativePointerArray children,
    	long count
    ) {
    	nodeSetChildren(
    		owner.memorySegment(),
    		children.memorySegment(),
    		count
    	);
    }
    
    /// ```
    /// 
    /// Get the child node at a given index.
    /// ```
    public static MemorySegment nodeGetChild(
    	MemorySegment node,
    	long index
    ) {
    	MethodHandle method = YGNODE_GET_CHILD.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			node,
    			index
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeGetChild].
    public static @Nullable YGNode nodeGetChild(
    	YGNode node,
    	long index
    ) {
    	MemorySegment segment = nodeGetChild(
    		node.memorySegment(),
    		index
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new YGNode(segment);
    }
    
    /// ```
    /// 
    /// The number of child nodes.
    /// ```
    public static long nodeGetChildCount(
    	MemorySegment node
    ) {
    	MethodHandle method = YGNODE_GET_CHILD_COUNT.get();
    	try {
    		return (long) method.invokeExact(
    			node
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeGetChildCount].
    public static long nodeGetChildCount(
    	YGNode node
    ) {
    	return nodeGetChildCount(
    		node.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Get the parent/owner currently set for a node.
    /// ```
    public static MemorySegment nodeGetOwner(
    	MemorySegment node
    ) {
    	MethodHandle method = YGNODE_GET_OWNER.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			node
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeGetOwner].
    public static @Nullable YGNode nodeGetOwner(
    	YGNode node
    ) {
    	MemorySegment segment = nodeGetOwner(
    		node.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new YGNode(segment);
    }
    
    /// ```
    /// 
    /// Get the parent/owner currently set for a node.
    /// ```
    public static MemorySegment nodeGetParent(
    	MemorySegment node
    ) {
    	MethodHandle method = YGNODE_GET_PARENT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			node
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeGetParent].
    public static @Nullable YGNode nodeGetParent(
    	YGNode node
    ) {
    	MemorySegment segment = nodeGetParent(
    		node.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new YGNode(segment);
    }
    
    /// ```
    /// 
    /// Set a new config for the node after creation.
    /// ```
    public static void nodeSetConfig(
    	MemorySegment node,
    	MemorySegment config
    ) {
    	MethodHandle method = YGNODE_SET_CONFIG.get();
    	try {
    		 method.invokeExact(
    			node,
    			config
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeSetConfig].
    public static void nodeSetConfig(
    	YGNode node,
    	YGConfig config
    ) {
    	nodeSetConfig(
    		node.memorySegment(),
    		config.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Get the config currently set on the node.
    /// ```
    public static MemorySegment nodeGetConfig(
    	MemorySegment node
    ) {
    	MethodHandle method = YGNODE_GET_CONFIG.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			node
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeGetConfig].
    public static @Nullable YGConfig nodeGetConfig(
    	YGNode node
    ) {
    	MemorySegment segment = nodeGetConfig(
    		node.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new YGConfig(segment);
    }
    
    /// ```
    /// 
    /// Sets extra data on the Yoga node which may be read from during callbacks.
    /// ```
    public static void nodeSetContext(
    	MemorySegment node,
    	MemorySegment context
    ) {
    	MethodHandle method = YGNODE_SET_CONTEXT.get();
    	try {
    		 method.invokeExact(
    			node,
    			context
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeSetContext].
    public static void nodeSetContext(
    	YGNode node,
    	MemorySegment context
    ) {
    	nodeSetContext(
    		node.memorySegment(),
    		context
    	);
    }
    
    /// ```
    /// 
    /// Returns the context or NULL if no context has been set.
    /// ```
    public static MemorySegment nodeGetContext(
    	MemorySegment node
    ) {
    	MethodHandle method = YGNODE_GET_CONTEXT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			node
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeGetContext].
    public static @Nullable MemorySegment nodeGetContext(
    	YGNode node
    ) {
    	MemorySegment segment = nodeGetContext(
    		node.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// ```
    /// 
    /// Allows providing custom measurements for a Yoga leaf node (usually for
    /// measuring text). YGNodeMarkDirty() must be set if content effecting the
    /// measurements of the node changes.
    /// ```
    public static void nodeSetMeasureFunc(
    	MemorySegment node,
    	MemorySegment measureFunc
    ) {
    	MethodHandle method = YGNODE_SET_MEASURE_FUNC.get();
    	try {
    		 method.invokeExact(
    			node,
    			measureFunc
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeSetMeasureFunc].
    public static void nodeSetMeasureFunc(
    	YGNode node,
    	YGMeasureFunc measureFunc
    ) {
    	nodeSetMeasureFunc(
    		node.memorySegment(),
    		measureFunc.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Whether a measure function is set.
    /// ```
    public static boolean nodeHasMeasureFunc(
    	MemorySegment node
    ) {
    	MethodHandle method = YGNODE_HAS_MEASURE_FUNC.get();
    	try {
    		return (boolean) method.invokeExact(
    			node
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeHasMeasureFunc].
    public static boolean nodeHasMeasureFunc(
    	YGNode node
    ) {
    	return nodeHasMeasureFunc(
    		node.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Set a custom function for determining the text baseline for use in baseline
    /// alignment.
    /// ```
    public static void nodeSetBaselineFunc(
    	MemorySegment node,
    	MemorySegment baselineFunc
    ) {
    	MethodHandle method = YGNODE_SET_BASELINE_FUNC.get();
    	try {
    		 method.invokeExact(
    			node,
    			baselineFunc
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeSetBaselineFunc].
    public static void nodeSetBaselineFunc(
    	YGNode node,
    	YGBaselineFunc baselineFunc
    ) {
    	nodeSetBaselineFunc(
    		node.memorySegment(),
    		baselineFunc.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Whether a baseline function is set.
    /// ```
    public static boolean nodeHasBaselineFunc(
    	MemorySegment node
    ) {
    	MethodHandle method = YGNODE_HAS_BASELINE_FUNC.get();
    	try {
    		return (boolean) method.invokeExact(
    			node
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeHasBaselineFunc].
    public static boolean nodeHasBaselineFunc(
    	YGNode node
    ) {
    	return nodeHasBaselineFunc(
    		node.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Sets this node should be considered the reference baseline among siblings.
    /// ```
    public static void nodeSetIsReferenceBaseline(
    	MemorySegment node,
    	boolean isReferenceBaseline
    ) {
    	MethodHandle method = YGNODE_SET_IS_REFERENCE_BASELINE.get();
    	try {
    		 method.invokeExact(
    			node,
    			isReferenceBaseline
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeSetIsReferenceBaseline].
    public static void nodeSetIsReferenceBaseline(
    	YGNode node,
    	boolean isReferenceBaseline
    ) {
    	nodeSetIsReferenceBaseline(
    		node.memorySegment(),
    		isReferenceBaseline
    	);
    }
    
    /// ```
    /// 
    /// Whether this node is set as the reference baseline.
    /// ```
    public static boolean nodeIsReferenceBaseline(
    	MemorySegment node
    ) {
    	MethodHandle method = YGNODE_IS_REFERENCE_BASELINE.get();
    	try {
    		return (boolean) method.invokeExact(
    			node
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeIsReferenceBaseline].
    public static boolean nodeIsReferenceBaseline(
    	YGNode node
    ) {
    	return nodeIsReferenceBaseline(
    		node.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Sets whether a leaf node's layout results may be truncated during layout
    /// rounding.
    /// ```
    public static void nodeSetNodeType(
    	MemorySegment node,
    	int nodeType
    ) {
    	MethodHandle method = YGNODE_SET_NODE_TYPE.get();
    	try {
    		 method.invokeExact(
    			node,
    			nodeType
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeSetNodeType].
    public static void nodeSetNodeType(
    	YGNode node,
    	int nodeType
    ) {
    	nodeSetNodeType(
    		node.memorySegment(),
    		nodeType
    	);
    }
    
    /// ```
    /// 
    /// Wwhether a leaf node's layout results may be truncated during layout
    /// rounding.
    /// ```
    public static int nodeGetNodeType(
    	MemorySegment node
    ) {
    	MethodHandle method = YGNODE_GET_NODE_TYPE.get();
    	try {
    		return (int) method.invokeExact(
    			node
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeGetNodeType].
    public static int nodeGetNodeType(
    	YGNode node
    ) {
    	return nodeGetNodeType(
    		node.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Make it so that this node will always form a containing block for any
    /// descendant nodes. This is useful for when a node has a property outside of
    /// of Yoga that will form a containing block. For example, transforms or some of
    /// the others listed in
    /// https://developer.mozilla.org/en-US/docs/Web/CSS/Containing_block
    /// ```
    public static void nodeSetAlwaysFormsContainingBlock(
    	MemorySegment node,
    	boolean alwaysFormsContainingBlock
    ) {
    	MethodHandle method = YGNODE_SET_ALWAYS_FORMS_CONTAINING_BLOCK.get();
    	try {
    		 method.invokeExact(
    			node,
    			alwaysFormsContainingBlock
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeSetAlwaysFormsContainingBlock].
    public static void nodeSetAlwaysFormsContainingBlock(
    	YGNode node,
    	boolean alwaysFormsContainingBlock
    ) {
    	nodeSetAlwaysFormsContainingBlock(
    		node.memorySegment(),
    		alwaysFormsContainingBlock
    	);
    }
    
    /// ```
    /// 
    /// Whether the node will always form a containing block for any descendant. This
    /// can happen in situation where the client implements something like a
    /// transform that can affect containing blocks but is not handled by Yoga
    /// directly.
    /// ```
    public static boolean nodeGetAlwaysFormsContainingBlock(
    	MemorySegment node
    ) {
    	MethodHandle method = YGNODE_GET_ALWAYS_FORMS_CONTAINING_BLOCK.get();
    	try {
    		return (boolean) method.invokeExact(
    			node
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeGetAlwaysFormsContainingBlock].
    public static boolean nodeGetAlwaysFormsContainingBlock(
    	YGNode node
    ) {
    	return nodeGetAlwaysFormsContainingBlock(
    		node.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// @deprecated
    /// ```
    public static boolean nodeCanUseCachedMeasurement(
    	int widthMode,
    	float availableWidth,
    	int heightMode,
    	float availableHeight,
    	int lastWidthMode,
    	float lastAvailableWidth,
    	int lastHeightMode,
    	float lastAvailableHeight,
    	float lastComputedWidth,
    	float lastComputedHeight,
    	float marginRow,
    	float marginColumn,
    	MemorySegment config
    ) {
    	MethodHandle method = YGNODE_CAN_USE_CACHED_MEASUREMENT.get();
    	try {
    		return (boolean) method.invokeExact(
    			widthMode,
    			availableWidth,
    			heightMode,
    			availableHeight,
    			lastWidthMode,
    			lastAvailableWidth,
    			lastHeightMode,
    			lastAvailableHeight,
    			lastComputedWidth,
    			lastComputedHeight,
    			marginRow,
    			marginColumn,
    			config
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeCanUseCachedMeasurement].
    public static boolean nodeCanUseCachedMeasurement(
    	int widthMode,
    	float availableWidth,
    	int heightMode,
    	float availableHeight,
    	int lastWidthMode,
    	float lastAvailableWidth,
    	int lastHeightMode,
    	float lastAvailableHeight,
    	float lastComputedWidth,
    	float lastComputedHeight,
    	float marginRow,
    	float marginColumn,
    	YGConfig config
    ) {
    	return nodeCanUseCachedMeasurement(
    		widthMode,
    		availableWidth,
    		heightMode,
    		availableHeight,
    		lastWidthMode,
    		lastAvailableWidth,
    		lastHeightMode,
    		lastAvailableHeight,
    		lastComputedWidth,
    		lastComputedHeight,
    		marginRow,
    		marginColumn,
    		config.memorySegment()
    	);
    }
    
    public static float nodeLayoutGetLeft(
    	MemorySegment node
    ) {
    	MethodHandle method = YGNODE_LAYOUT_GET_LEFT.get();
    	try {
    		return (float) method.invokeExact(
    			node
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeLayoutGetLeft].
    public static float nodeLayoutGetLeft(
    	YGNode node
    ) {
    	return nodeLayoutGetLeft(
    		node.memorySegment()
    	);
    }
    
    public static float nodeLayoutGetTop(
    	MemorySegment node
    ) {
    	MethodHandle method = YGNODE_LAYOUT_GET_TOP.get();
    	try {
    		return (float) method.invokeExact(
    			node
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeLayoutGetTop].
    public static float nodeLayoutGetTop(
    	YGNode node
    ) {
    	return nodeLayoutGetTop(
    		node.memorySegment()
    	);
    }
    
    public static float nodeLayoutGetRight(
    	MemorySegment node
    ) {
    	MethodHandle method = YGNODE_LAYOUT_GET_RIGHT.get();
    	try {
    		return (float) method.invokeExact(
    			node
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeLayoutGetRight].
    public static float nodeLayoutGetRight(
    	YGNode node
    ) {
    	return nodeLayoutGetRight(
    		node.memorySegment()
    	);
    }
    
    public static float nodeLayoutGetBottom(
    	MemorySegment node
    ) {
    	MethodHandle method = YGNODE_LAYOUT_GET_BOTTOM.get();
    	try {
    		return (float) method.invokeExact(
    			node
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeLayoutGetBottom].
    public static float nodeLayoutGetBottom(
    	YGNode node
    ) {
    	return nodeLayoutGetBottom(
    		node.memorySegment()
    	);
    }
    
    public static float nodeLayoutGetWidth(
    	MemorySegment node
    ) {
    	MethodHandle method = YGNODE_LAYOUT_GET_WIDTH.get();
    	try {
    		return (float) method.invokeExact(
    			node
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeLayoutGetWidth].
    public static float nodeLayoutGetWidth(
    	YGNode node
    ) {
    	return nodeLayoutGetWidth(
    		node.memorySegment()
    	);
    }
    
    public static float nodeLayoutGetHeight(
    	MemorySegment node
    ) {
    	MethodHandle method = YGNODE_LAYOUT_GET_HEIGHT.get();
    	try {
    		return (float) method.invokeExact(
    			node
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeLayoutGetHeight].
    public static float nodeLayoutGetHeight(
    	YGNode node
    ) {
    	return nodeLayoutGetHeight(
    		node.memorySegment()
    	);
    }
    
    public static int nodeLayoutGetDirection(
    	MemorySegment node
    ) {
    	MethodHandle method = YGNODE_LAYOUT_GET_DIRECTION.get();
    	try {
    		return (int) method.invokeExact(
    			node
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeLayoutGetDirection].
    public static int nodeLayoutGetDirection(
    	YGNode node
    ) {
    	return nodeLayoutGetDirection(
    		node.memorySegment()
    	);
    }
    
    public static boolean nodeLayoutGetHadOverflow(
    	MemorySegment node
    ) {
    	MethodHandle method = YGNODE_LAYOUT_GET_HAD_OVERFLOW.get();
    	try {
    		return (boolean) method.invokeExact(
    			node
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeLayoutGetHadOverflow].
    public static boolean nodeLayoutGetHadOverflow(
    	YGNode node
    ) {
    	return nodeLayoutGetHadOverflow(
    		node.memorySegment()
    	);
    }
    
    public static float nodeLayoutGetMargin(
    	MemorySegment node,
    	int edge
    ) {
    	MethodHandle method = YGNODE_LAYOUT_GET_MARGIN.get();
    	try {
    		return (float) method.invokeExact(
    			node,
    			edge
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeLayoutGetMargin].
    public static float nodeLayoutGetMargin(
    	YGNode node,
    	int edge
    ) {
    	return nodeLayoutGetMargin(
    		node.memorySegment(),
    		edge
    	);
    }
    
    public static float nodeLayoutGetBorder(
    	MemorySegment node,
    	int edge
    ) {
    	MethodHandle method = YGNODE_LAYOUT_GET_BORDER.get();
    	try {
    		return (float) method.invokeExact(
    			node,
    			edge
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeLayoutGetBorder].
    public static float nodeLayoutGetBorder(
    	YGNode node,
    	int edge
    ) {
    	return nodeLayoutGetBorder(
    		node.memorySegment(),
    		edge
    	);
    }
    
    public static float nodeLayoutGetPadding(
    	MemorySegment node,
    	int edge
    ) {
    	MethodHandle method = YGNODE_LAYOUT_GET_PADDING.get();
    	try {
    		return (float) method.invokeExact(
    			node,
    			edge
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeLayoutGetPadding].
    public static float nodeLayoutGetPadding(
    	YGNode node,
    	int edge
    ) {
    	return nodeLayoutGetPadding(
    		node.memorySegment(),
    		edge
    	);
    }
    
    /// ```
    /// 
    /// Whether a dimension represented as a float is defined.
    /// ```
    public static boolean floatIsUndefined(
    	float value
    ) {
    	MethodHandle method = YGFLOAT_IS_UNDEFINED.get();
    	try {
    		return (boolean) method.invokeExact(
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void nodeCopyStyle(
    	MemorySegment dstNode,
    	MemorySegment srcNode
    ) {
    	MethodHandle method = YGNODE_COPY_STYLE.get();
    	try {
    		 method.invokeExact(
    			dstNode,
    			srcNode
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeCopyStyle].
    public static void nodeCopyStyle(
    	YGNode dstNode,
    	YGNode srcNode
    ) {
    	nodeCopyStyle(
    		dstNode.memorySegment(),
    		srcNode.memorySegment()
    	);
    }
    
    public static void nodeStyleSetDirection(
    	MemorySegment node,
    	int direction
    ) {
    	MethodHandle method = YGNODE_STYLE_SET_DIRECTION.get();
    	try {
    		 method.invokeExact(
    			node,
    			direction
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeStyleSetDirection].
    public static void nodeStyleSetDirection(
    	YGNode node,
    	int direction
    ) {
    	nodeStyleSetDirection(
    		node.memorySegment(),
    		direction
    	);
    }
    
    public static int nodeStyleGetDirection(
    	MemorySegment node
    ) {
    	MethodHandle method = YGNODE_STYLE_GET_DIRECTION.get();
    	try {
    		return (int) method.invokeExact(
    			node
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeStyleGetDirection].
    public static int nodeStyleGetDirection(
    	YGNode node
    ) {
    	return nodeStyleGetDirection(
    		node.memorySegment()
    	);
    }
    
    public static void nodeStyleSetFlexDirection(
    	MemorySegment node,
    	int flexDirection
    ) {
    	MethodHandle method = YGNODE_STYLE_SET_FLEX_DIRECTION.get();
    	try {
    		 method.invokeExact(
    			node,
    			flexDirection
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeStyleSetFlexDirection].
    public static void nodeStyleSetFlexDirection(
    	YGNode node,
    	int flexDirection
    ) {
    	nodeStyleSetFlexDirection(
    		node.memorySegment(),
    		flexDirection
    	);
    }
    
    public static int nodeStyleGetFlexDirection(
    	MemorySegment node
    ) {
    	MethodHandle method = YGNODE_STYLE_GET_FLEX_DIRECTION.get();
    	try {
    		return (int) method.invokeExact(
    			node
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeStyleGetFlexDirection].
    public static int nodeStyleGetFlexDirection(
    	YGNode node
    ) {
    	return nodeStyleGetFlexDirection(
    		node.memorySegment()
    	);
    }
    
    public static void nodeStyleSetJustifyContent(
    	MemorySegment node,
    	int justifyContent
    ) {
    	MethodHandle method = YGNODE_STYLE_SET_JUSTIFY_CONTENT.get();
    	try {
    		 method.invokeExact(
    			node,
    			justifyContent
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeStyleSetJustifyContent].
    public static void nodeStyleSetJustifyContent(
    	YGNode node,
    	int justifyContent
    ) {
    	nodeStyleSetJustifyContent(
    		node.memorySegment(),
    		justifyContent
    	);
    }
    
    public static int nodeStyleGetJustifyContent(
    	MemorySegment node
    ) {
    	MethodHandle method = YGNODE_STYLE_GET_JUSTIFY_CONTENT.get();
    	try {
    		return (int) method.invokeExact(
    			node
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeStyleGetJustifyContent].
    public static int nodeStyleGetJustifyContent(
    	YGNode node
    ) {
    	return nodeStyleGetJustifyContent(
    		node.memorySegment()
    	);
    }
    
    public static void nodeStyleSetAlignContent(
    	MemorySegment node,
    	int alignContent
    ) {
    	MethodHandle method = YGNODE_STYLE_SET_ALIGN_CONTENT.get();
    	try {
    		 method.invokeExact(
    			node,
    			alignContent
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeStyleSetAlignContent].
    public static void nodeStyleSetAlignContent(
    	YGNode node,
    	int alignContent
    ) {
    	nodeStyleSetAlignContent(
    		node.memorySegment(),
    		alignContent
    	);
    }
    
    public static int nodeStyleGetAlignContent(
    	MemorySegment node
    ) {
    	MethodHandle method = YGNODE_STYLE_GET_ALIGN_CONTENT.get();
    	try {
    		return (int) method.invokeExact(
    			node
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeStyleGetAlignContent].
    public static int nodeStyleGetAlignContent(
    	YGNode node
    ) {
    	return nodeStyleGetAlignContent(
    		node.memorySegment()
    	);
    }
    
    public static void nodeStyleSetAlignItems(
    	MemorySegment node,
    	int alignItems
    ) {
    	MethodHandle method = YGNODE_STYLE_SET_ALIGN_ITEMS.get();
    	try {
    		 method.invokeExact(
    			node,
    			alignItems
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeStyleSetAlignItems].
    public static void nodeStyleSetAlignItems(
    	YGNode node,
    	int alignItems
    ) {
    	nodeStyleSetAlignItems(
    		node.memorySegment(),
    		alignItems
    	);
    }
    
    public static int nodeStyleGetAlignItems(
    	MemorySegment node
    ) {
    	MethodHandle method = YGNODE_STYLE_GET_ALIGN_ITEMS.get();
    	try {
    		return (int) method.invokeExact(
    			node
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeStyleGetAlignItems].
    public static int nodeStyleGetAlignItems(
    	YGNode node
    ) {
    	return nodeStyleGetAlignItems(
    		node.memorySegment()
    	);
    }
    
    public static void nodeStyleSetAlignSelf(
    	MemorySegment node,
    	int alignSelf
    ) {
    	MethodHandle method = YGNODE_STYLE_SET_ALIGN_SELF.get();
    	try {
    		 method.invokeExact(
    			node,
    			alignSelf
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeStyleSetAlignSelf].
    public static void nodeStyleSetAlignSelf(
    	YGNode node,
    	int alignSelf
    ) {
    	nodeStyleSetAlignSelf(
    		node.memorySegment(),
    		alignSelf
    	);
    }
    
    public static int nodeStyleGetAlignSelf(
    	MemorySegment node
    ) {
    	MethodHandle method = YGNODE_STYLE_GET_ALIGN_SELF.get();
    	try {
    		return (int) method.invokeExact(
    			node
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeStyleGetAlignSelf].
    public static int nodeStyleGetAlignSelf(
    	YGNode node
    ) {
    	return nodeStyleGetAlignSelf(
    		node.memorySegment()
    	);
    }
    
    public static void nodeStyleSetPositionType(
    	MemorySegment node,
    	int positionType
    ) {
    	MethodHandle method = YGNODE_STYLE_SET_POSITION_TYPE.get();
    	try {
    		 method.invokeExact(
    			node,
    			positionType
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeStyleSetPositionType].
    public static void nodeStyleSetPositionType(
    	YGNode node,
    	int positionType
    ) {
    	nodeStyleSetPositionType(
    		node.memorySegment(),
    		positionType
    	);
    }
    
    public static int nodeStyleGetPositionType(
    	MemorySegment node
    ) {
    	MethodHandle method = YGNODE_STYLE_GET_POSITION_TYPE.get();
    	try {
    		return (int) method.invokeExact(
    			node
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeStyleGetPositionType].
    public static int nodeStyleGetPositionType(
    	YGNode node
    ) {
    	return nodeStyleGetPositionType(
    		node.memorySegment()
    	);
    }
    
    public static void nodeStyleSetFlexWrap(
    	MemorySegment node,
    	int flexWrap
    ) {
    	MethodHandle method = YGNODE_STYLE_SET_FLEX_WRAP.get();
    	try {
    		 method.invokeExact(
    			node,
    			flexWrap
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeStyleSetFlexWrap].
    public static void nodeStyleSetFlexWrap(
    	YGNode node,
    	int flexWrap
    ) {
    	nodeStyleSetFlexWrap(
    		node.memorySegment(),
    		flexWrap
    	);
    }
    
    public static int nodeStyleGetFlexWrap(
    	MemorySegment node
    ) {
    	MethodHandle method = YGNODE_STYLE_GET_FLEX_WRAP.get();
    	try {
    		return (int) method.invokeExact(
    			node
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeStyleGetFlexWrap].
    public static int nodeStyleGetFlexWrap(
    	YGNode node
    ) {
    	return nodeStyleGetFlexWrap(
    		node.memorySegment()
    	);
    }
    
    public static void nodeStyleSetOverflow(
    	MemorySegment node,
    	int overflow
    ) {
    	MethodHandle method = YGNODE_STYLE_SET_OVERFLOW.get();
    	try {
    		 method.invokeExact(
    			node,
    			overflow
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeStyleSetOverflow].
    public static void nodeStyleSetOverflow(
    	YGNode node,
    	int overflow
    ) {
    	nodeStyleSetOverflow(
    		node.memorySegment(),
    		overflow
    	);
    }
    
    public static int nodeStyleGetOverflow(
    	MemorySegment node
    ) {
    	MethodHandle method = YGNODE_STYLE_GET_OVERFLOW.get();
    	try {
    		return (int) method.invokeExact(
    			node
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeStyleGetOverflow].
    public static int nodeStyleGetOverflow(
    	YGNode node
    ) {
    	return nodeStyleGetOverflow(
    		node.memorySegment()
    	);
    }
    
    public static void nodeStyleSetDisplay(
    	MemorySegment node,
    	int display
    ) {
    	MethodHandle method = YGNODE_STYLE_SET_DISPLAY.get();
    	try {
    		 method.invokeExact(
    			node,
    			display
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeStyleSetDisplay].
    public static void nodeStyleSetDisplay(
    	YGNode node,
    	int display
    ) {
    	nodeStyleSetDisplay(
    		node.memorySegment(),
    		display
    	);
    }
    
    public static int nodeStyleGetDisplay(
    	MemorySegment node
    ) {
    	MethodHandle method = YGNODE_STYLE_GET_DISPLAY.get();
    	try {
    		return (int) method.invokeExact(
    			node
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeStyleGetDisplay].
    public static int nodeStyleGetDisplay(
    	YGNode node
    ) {
    	return nodeStyleGetDisplay(
    		node.memorySegment()
    	);
    }
    
    public static void nodeStyleSetFlex(
    	MemorySegment node,
    	float flex
    ) {
    	MethodHandle method = YGNODE_STYLE_SET_FLEX.get();
    	try {
    		 method.invokeExact(
    			node,
    			flex
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeStyleSetFlex].
    public static void nodeStyleSetFlex(
    	YGNode node,
    	float flex
    ) {
    	nodeStyleSetFlex(
    		node.memorySegment(),
    		flex
    	);
    }
    
    public static float nodeStyleGetFlex(
    	MemorySegment node
    ) {
    	MethodHandle method = YGNODE_STYLE_GET_FLEX.get();
    	try {
    		return (float) method.invokeExact(
    			node
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeStyleGetFlex].
    public static float nodeStyleGetFlex(
    	YGNode node
    ) {
    	return nodeStyleGetFlex(
    		node.memorySegment()
    	);
    }
    
    public static void nodeStyleSetFlexGrow(
    	MemorySegment node,
    	float flexGrow
    ) {
    	MethodHandle method = YGNODE_STYLE_SET_FLEX_GROW.get();
    	try {
    		 method.invokeExact(
    			node,
    			flexGrow
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeStyleSetFlexGrow].
    public static void nodeStyleSetFlexGrow(
    	YGNode node,
    	float flexGrow
    ) {
    	nodeStyleSetFlexGrow(
    		node.memorySegment(),
    		flexGrow
    	);
    }
    
    public static float nodeStyleGetFlexGrow(
    	MemorySegment node
    ) {
    	MethodHandle method = YGNODE_STYLE_GET_FLEX_GROW.get();
    	try {
    		return (float) method.invokeExact(
    			node
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeStyleGetFlexGrow].
    public static float nodeStyleGetFlexGrow(
    	YGNode node
    ) {
    	return nodeStyleGetFlexGrow(
    		node.memorySegment()
    	);
    }
    
    public static void nodeStyleSetFlexShrink(
    	MemorySegment node,
    	float flexShrink
    ) {
    	MethodHandle method = YGNODE_STYLE_SET_FLEX_SHRINK.get();
    	try {
    		 method.invokeExact(
    			node,
    			flexShrink
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeStyleSetFlexShrink].
    public static void nodeStyleSetFlexShrink(
    	YGNode node,
    	float flexShrink
    ) {
    	nodeStyleSetFlexShrink(
    		node.memorySegment(),
    		flexShrink
    	);
    }
    
    public static float nodeStyleGetFlexShrink(
    	MemorySegment node
    ) {
    	MethodHandle method = YGNODE_STYLE_GET_FLEX_SHRINK.get();
    	try {
    		return (float) method.invokeExact(
    			node
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeStyleGetFlexShrink].
    public static float nodeStyleGetFlexShrink(
    	YGNode node
    ) {
    	return nodeStyleGetFlexShrink(
    		node.memorySegment()
    	);
    }
    
    public static void nodeStyleSetFlexBasis(
    	MemorySegment node,
    	float flexBasis
    ) {
    	MethodHandle method = YGNODE_STYLE_SET_FLEX_BASIS.get();
    	try {
    		 method.invokeExact(
    			node,
    			flexBasis
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeStyleSetFlexBasis].
    public static void nodeStyleSetFlexBasis(
    	YGNode node,
    	float flexBasis
    ) {
    	nodeStyleSetFlexBasis(
    		node.memorySegment(),
    		flexBasis
    	);
    }
    
    public static void nodeStyleSetFlexBasisPercent(
    	MemorySegment node,
    	float flexBasis
    ) {
    	MethodHandle method = YGNODE_STYLE_SET_FLEX_BASIS_PERCENT.get();
    	try {
    		 method.invokeExact(
    			node,
    			flexBasis
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeStyleSetFlexBasisPercent].
    public static void nodeStyleSetFlexBasisPercent(
    	YGNode node,
    	float flexBasis
    ) {
    	nodeStyleSetFlexBasisPercent(
    		node.memorySegment(),
    		flexBasis
    	);
    }
    
    public static void nodeStyleSetFlexBasisAuto(
    	MemorySegment node
    ) {
    	MethodHandle method = YGNODE_STYLE_SET_FLEX_BASIS_AUTO.get();
    	try {
    		 method.invokeExact(
    			node
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeStyleSetFlexBasisAuto].
    public static void nodeStyleSetFlexBasisAuto(
    	YGNode node
    ) {
    	nodeStyleSetFlexBasisAuto(
    		node.memorySegment()
    	);
    }
    
    public static MemorySegment nodeStyleGetFlexBasis(
    	SegmentAllocator allocator,
    	MemorySegment node
    ) {
    	MethodHandle method = YGNODE_STYLE_GET_FLEX_BASIS.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			node
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeStyleGetFlexBasis].
    public static @Nullable YGValue nodeStyleGetFlexBasis(
    	SegmentAllocator allocator,
    	YGNode node
    ) {
    	MemorySegment segment = nodeStyleGetFlexBasis(
    		allocator,
    		node.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new YGValue(segment);
    }
    
    public static void nodeStyleSetPosition(
    	MemorySegment node,
    	int edge,
    	float position
    ) {
    	MethodHandle method = YGNODE_STYLE_SET_POSITION.get();
    	try {
    		 method.invokeExact(
    			node,
    			edge,
    			position
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeStyleSetPosition].
    public static void nodeStyleSetPosition(
    	YGNode node,
    	int edge,
    	float position
    ) {
    	nodeStyleSetPosition(
    		node.memorySegment(),
    		edge,
    		position
    	);
    }
    
    public static void nodeStyleSetPositionPercent(
    	MemorySegment node,
    	int edge,
    	float position
    ) {
    	MethodHandle method = YGNODE_STYLE_SET_POSITION_PERCENT.get();
    	try {
    		 method.invokeExact(
    			node,
    			edge,
    			position
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeStyleSetPositionPercent].
    public static void nodeStyleSetPositionPercent(
    	YGNode node,
    	int edge,
    	float position
    ) {
    	nodeStyleSetPositionPercent(
    		node.memorySegment(),
    		edge,
    		position
    	);
    }
    
    public static MemorySegment nodeStyleGetPosition(
    	SegmentAllocator allocator,
    	MemorySegment node,
    	int edge
    ) {
    	MethodHandle method = YGNODE_STYLE_GET_POSITION.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			node,
    			edge
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeStyleGetPosition].
    public static @Nullable YGValue nodeStyleGetPosition(
    	SegmentAllocator allocator,
    	YGNode node,
    	int edge
    ) {
    	MemorySegment segment = nodeStyleGetPosition(
    		allocator,
    		node.memorySegment(),
    		edge
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new YGValue(segment);
    }
    
    public static void nodeStyleSetPositionAuto(
    	MemorySegment node,
    	int edge
    ) {
    	MethodHandle method = YGNODE_STYLE_SET_POSITION_AUTO.get();
    	try {
    		 method.invokeExact(
    			node,
    			edge
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeStyleSetPositionAuto].
    public static void nodeStyleSetPositionAuto(
    	YGNode node,
    	int edge
    ) {
    	nodeStyleSetPositionAuto(
    		node.memorySegment(),
    		edge
    	);
    }
    
    public static void nodeStyleSetMargin(
    	MemorySegment node,
    	int edge,
    	float margin
    ) {
    	MethodHandle method = YGNODE_STYLE_SET_MARGIN.get();
    	try {
    		 method.invokeExact(
    			node,
    			edge,
    			margin
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeStyleSetMargin].
    public static void nodeStyleSetMargin(
    	YGNode node,
    	int edge,
    	float margin
    ) {
    	nodeStyleSetMargin(
    		node.memorySegment(),
    		edge,
    		margin
    	);
    }
    
    public static void nodeStyleSetMarginPercent(
    	MemorySegment node,
    	int edge,
    	float margin
    ) {
    	MethodHandle method = YGNODE_STYLE_SET_MARGIN_PERCENT.get();
    	try {
    		 method.invokeExact(
    			node,
    			edge,
    			margin
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeStyleSetMarginPercent].
    public static void nodeStyleSetMarginPercent(
    	YGNode node,
    	int edge,
    	float margin
    ) {
    	nodeStyleSetMarginPercent(
    		node.memorySegment(),
    		edge,
    		margin
    	);
    }
    
    public static void nodeStyleSetMarginAuto(
    	MemorySegment node,
    	int edge
    ) {
    	MethodHandle method = YGNODE_STYLE_SET_MARGIN_AUTO.get();
    	try {
    		 method.invokeExact(
    			node,
    			edge
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeStyleSetMarginAuto].
    public static void nodeStyleSetMarginAuto(
    	YGNode node,
    	int edge
    ) {
    	nodeStyleSetMarginAuto(
    		node.memorySegment(),
    		edge
    	);
    }
    
    public static MemorySegment nodeStyleGetMargin(
    	SegmentAllocator allocator,
    	MemorySegment node,
    	int edge
    ) {
    	MethodHandle method = YGNODE_STYLE_GET_MARGIN.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			node,
    			edge
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeStyleGetMargin].
    public static @Nullable YGValue nodeStyleGetMargin(
    	SegmentAllocator allocator,
    	YGNode node,
    	int edge
    ) {
    	MemorySegment segment = nodeStyleGetMargin(
    		allocator,
    		node.memorySegment(),
    		edge
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new YGValue(segment);
    }
    
    public static void nodeStyleSetPadding(
    	MemorySegment node,
    	int edge,
    	float padding
    ) {
    	MethodHandle method = YGNODE_STYLE_SET_PADDING.get();
    	try {
    		 method.invokeExact(
    			node,
    			edge,
    			padding
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeStyleSetPadding].
    public static void nodeStyleSetPadding(
    	YGNode node,
    	int edge,
    	float padding
    ) {
    	nodeStyleSetPadding(
    		node.memorySegment(),
    		edge,
    		padding
    	);
    }
    
    public static void nodeStyleSetPaddingPercent(
    	MemorySegment node,
    	int edge,
    	float padding
    ) {
    	MethodHandle method = YGNODE_STYLE_SET_PADDING_PERCENT.get();
    	try {
    		 method.invokeExact(
    			node,
    			edge,
    			padding
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeStyleSetPaddingPercent].
    public static void nodeStyleSetPaddingPercent(
    	YGNode node,
    	int edge,
    	float padding
    ) {
    	nodeStyleSetPaddingPercent(
    		node.memorySegment(),
    		edge,
    		padding
    	);
    }
    
    public static MemorySegment nodeStyleGetPadding(
    	SegmentAllocator allocator,
    	MemorySegment node,
    	int edge
    ) {
    	MethodHandle method = YGNODE_STYLE_GET_PADDING.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			node,
    			edge
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeStyleGetPadding].
    public static @Nullable YGValue nodeStyleGetPadding(
    	SegmentAllocator allocator,
    	YGNode node,
    	int edge
    ) {
    	MemorySegment segment = nodeStyleGetPadding(
    		allocator,
    		node.memorySegment(),
    		edge
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new YGValue(segment);
    }
    
    public static void nodeStyleSetBorder(
    	MemorySegment node,
    	int edge,
    	float border
    ) {
    	MethodHandle method = YGNODE_STYLE_SET_BORDER.get();
    	try {
    		 method.invokeExact(
    			node,
    			edge,
    			border
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeStyleSetBorder].
    public static void nodeStyleSetBorder(
    	YGNode node,
    	int edge,
    	float border
    ) {
    	nodeStyleSetBorder(
    		node.memorySegment(),
    		edge,
    		border
    	);
    }
    
    public static float nodeStyleGetBorder(
    	MemorySegment node,
    	int edge
    ) {
    	MethodHandle method = YGNODE_STYLE_GET_BORDER.get();
    	try {
    		return (float) method.invokeExact(
    			node,
    			edge
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeStyleGetBorder].
    public static float nodeStyleGetBorder(
    	YGNode node,
    	int edge
    ) {
    	return nodeStyleGetBorder(
    		node.memorySegment(),
    		edge
    	);
    }
    
    public static void nodeStyleSetGap(
    	MemorySegment node,
    	int gutter,
    	float gapLength
    ) {
    	MethodHandle method = YGNODE_STYLE_SET_GAP.get();
    	try {
    		 method.invokeExact(
    			node,
    			gutter,
    			gapLength
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeStyleSetGap].
    public static void nodeStyleSetGap(
    	YGNode node,
    	int gutter,
    	float gapLength
    ) {
    	nodeStyleSetGap(
    		node.memorySegment(),
    		gutter,
    		gapLength
    	);
    }
    
    public static void nodeStyleSetGapPercent(
    	MemorySegment node,
    	int gutter,
    	float gapLength
    ) {
    	MethodHandle method = YGNODE_STYLE_SET_GAP_PERCENT.get();
    	try {
    		 method.invokeExact(
    			node,
    			gutter,
    			gapLength
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeStyleSetGapPercent].
    public static void nodeStyleSetGapPercent(
    	YGNode node,
    	int gutter,
    	float gapLength
    ) {
    	nodeStyleSetGapPercent(
    		node.memorySegment(),
    		gutter,
    		gapLength
    	);
    }
    
    public static float nodeStyleGetGap(
    	MemorySegment node,
    	int gutter
    ) {
    	MethodHandle method = YGNODE_STYLE_GET_GAP.get();
    	try {
    		return (float) method.invokeExact(
    			node,
    			gutter
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeStyleGetGap].
    public static float nodeStyleGetGap(
    	YGNode node,
    	int gutter
    ) {
    	return nodeStyleGetGap(
    		node.memorySegment(),
    		gutter
    	);
    }
    
    public static void nodeStyleSetBoxSizing(
    	MemorySegment node,
    	int boxSizing
    ) {
    	MethodHandle method = YGNODE_STYLE_SET_BOX_SIZING.get();
    	try {
    		 method.invokeExact(
    			node,
    			boxSizing
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeStyleSetBoxSizing].
    public static void nodeStyleSetBoxSizing(
    	YGNode node,
    	int boxSizing
    ) {
    	nodeStyleSetBoxSizing(
    		node.memorySegment(),
    		boxSizing
    	);
    }
    
    public static int nodeStyleGetBoxSizing(
    	MemorySegment node
    ) {
    	MethodHandle method = YGNODE_STYLE_GET_BOX_SIZING.get();
    	try {
    		return (int) method.invokeExact(
    			node
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeStyleGetBoxSizing].
    public static int nodeStyleGetBoxSizing(
    	YGNode node
    ) {
    	return nodeStyleGetBoxSizing(
    		node.memorySegment()
    	);
    }
    
    public static void nodeStyleSetWidth(
    	MemorySegment node,
    	float width
    ) {
    	MethodHandle method = YGNODE_STYLE_SET_WIDTH.get();
    	try {
    		 method.invokeExact(
    			node,
    			width
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeStyleSetWidth].
    public static void nodeStyleSetWidth(
    	YGNode node,
    	float width
    ) {
    	nodeStyleSetWidth(
    		node.memorySegment(),
    		width
    	);
    }
    
    public static void nodeStyleSetWidthPercent(
    	MemorySegment node,
    	float width
    ) {
    	MethodHandle method = YGNODE_STYLE_SET_WIDTH_PERCENT.get();
    	try {
    		 method.invokeExact(
    			node,
    			width
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeStyleSetWidthPercent].
    public static void nodeStyleSetWidthPercent(
    	YGNode node,
    	float width
    ) {
    	nodeStyleSetWidthPercent(
    		node.memorySegment(),
    		width
    	);
    }
    
    public static void nodeStyleSetWidthAuto(
    	MemorySegment node
    ) {
    	MethodHandle method = YGNODE_STYLE_SET_WIDTH_AUTO.get();
    	try {
    		 method.invokeExact(
    			node
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeStyleSetWidthAuto].
    public static void nodeStyleSetWidthAuto(
    	YGNode node
    ) {
    	nodeStyleSetWidthAuto(
    		node.memorySegment()
    	);
    }
    
    public static MemorySegment nodeStyleGetWidth(
    	SegmentAllocator allocator,
    	MemorySegment node
    ) {
    	MethodHandle method = YGNODE_STYLE_GET_WIDTH.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			node
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeStyleGetWidth].
    public static @Nullable YGValue nodeStyleGetWidth(
    	SegmentAllocator allocator,
    	YGNode node
    ) {
    	MemorySegment segment = nodeStyleGetWidth(
    		allocator,
    		node.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new YGValue(segment);
    }
    
    public static void nodeStyleSetHeight(
    	MemorySegment node,
    	float height
    ) {
    	MethodHandle method = YGNODE_STYLE_SET_HEIGHT.get();
    	try {
    		 method.invokeExact(
    			node,
    			height
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeStyleSetHeight].
    public static void nodeStyleSetHeight(
    	YGNode node,
    	float height
    ) {
    	nodeStyleSetHeight(
    		node.memorySegment(),
    		height
    	);
    }
    
    public static void nodeStyleSetHeightPercent(
    	MemorySegment node,
    	float height
    ) {
    	MethodHandle method = YGNODE_STYLE_SET_HEIGHT_PERCENT.get();
    	try {
    		 method.invokeExact(
    			node,
    			height
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeStyleSetHeightPercent].
    public static void nodeStyleSetHeightPercent(
    	YGNode node,
    	float height
    ) {
    	nodeStyleSetHeightPercent(
    		node.memorySegment(),
    		height
    	);
    }
    
    public static void nodeStyleSetHeightAuto(
    	MemorySegment node
    ) {
    	MethodHandle method = YGNODE_STYLE_SET_HEIGHT_AUTO.get();
    	try {
    		 method.invokeExact(
    			node
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeStyleSetHeightAuto].
    public static void nodeStyleSetHeightAuto(
    	YGNode node
    ) {
    	nodeStyleSetHeightAuto(
    		node.memorySegment()
    	);
    }
    
    public static MemorySegment nodeStyleGetHeight(
    	SegmentAllocator allocator,
    	MemorySegment node
    ) {
    	MethodHandle method = YGNODE_STYLE_GET_HEIGHT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			node
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeStyleGetHeight].
    public static @Nullable YGValue nodeStyleGetHeight(
    	SegmentAllocator allocator,
    	YGNode node
    ) {
    	MemorySegment segment = nodeStyleGetHeight(
    		allocator,
    		node.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new YGValue(segment);
    }
    
    public static void nodeStyleSetMinWidth(
    	MemorySegment node,
    	float minWidth
    ) {
    	MethodHandle method = YGNODE_STYLE_SET_MIN_WIDTH.get();
    	try {
    		 method.invokeExact(
    			node,
    			minWidth
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeStyleSetMinWidth].
    public static void nodeStyleSetMinWidth(
    	YGNode node,
    	float minWidth
    ) {
    	nodeStyleSetMinWidth(
    		node.memorySegment(),
    		minWidth
    	);
    }
    
    public static void nodeStyleSetMinWidthPercent(
    	MemorySegment node,
    	float minWidth
    ) {
    	MethodHandle method = YGNODE_STYLE_SET_MIN_WIDTH_PERCENT.get();
    	try {
    		 method.invokeExact(
    			node,
    			minWidth
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeStyleSetMinWidthPercent].
    public static void nodeStyleSetMinWidthPercent(
    	YGNode node,
    	float minWidth
    ) {
    	nodeStyleSetMinWidthPercent(
    		node.memorySegment(),
    		minWidth
    	);
    }
    
    public static MemorySegment nodeStyleGetMinWidth(
    	SegmentAllocator allocator,
    	MemorySegment node
    ) {
    	MethodHandle method = YGNODE_STYLE_GET_MIN_WIDTH.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			node
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeStyleGetMinWidth].
    public static @Nullable YGValue nodeStyleGetMinWidth(
    	SegmentAllocator allocator,
    	YGNode node
    ) {
    	MemorySegment segment = nodeStyleGetMinWidth(
    		allocator,
    		node.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new YGValue(segment);
    }
    
    public static void nodeStyleSetMinHeight(
    	MemorySegment node,
    	float minHeight
    ) {
    	MethodHandle method = YGNODE_STYLE_SET_MIN_HEIGHT.get();
    	try {
    		 method.invokeExact(
    			node,
    			minHeight
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeStyleSetMinHeight].
    public static void nodeStyleSetMinHeight(
    	YGNode node,
    	float minHeight
    ) {
    	nodeStyleSetMinHeight(
    		node.memorySegment(),
    		minHeight
    	);
    }
    
    public static void nodeStyleSetMinHeightPercent(
    	MemorySegment node,
    	float minHeight
    ) {
    	MethodHandle method = YGNODE_STYLE_SET_MIN_HEIGHT_PERCENT.get();
    	try {
    		 method.invokeExact(
    			node,
    			minHeight
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeStyleSetMinHeightPercent].
    public static void nodeStyleSetMinHeightPercent(
    	YGNode node,
    	float minHeight
    ) {
    	nodeStyleSetMinHeightPercent(
    		node.memorySegment(),
    		minHeight
    	);
    }
    
    public static MemorySegment nodeStyleGetMinHeight(
    	SegmentAllocator allocator,
    	MemorySegment node
    ) {
    	MethodHandle method = YGNODE_STYLE_GET_MIN_HEIGHT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			node
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeStyleGetMinHeight].
    public static @Nullable YGValue nodeStyleGetMinHeight(
    	SegmentAllocator allocator,
    	YGNode node
    ) {
    	MemorySegment segment = nodeStyleGetMinHeight(
    		allocator,
    		node.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new YGValue(segment);
    }
    
    public static void nodeStyleSetMaxWidth(
    	MemorySegment node,
    	float maxWidth
    ) {
    	MethodHandle method = YGNODE_STYLE_SET_MAX_WIDTH.get();
    	try {
    		 method.invokeExact(
    			node,
    			maxWidth
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeStyleSetMaxWidth].
    public static void nodeStyleSetMaxWidth(
    	YGNode node,
    	float maxWidth
    ) {
    	nodeStyleSetMaxWidth(
    		node.memorySegment(),
    		maxWidth
    	);
    }
    
    public static void nodeStyleSetMaxWidthPercent(
    	MemorySegment node,
    	float maxWidth
    ) {
    	MethodHandle method = YGNODE_STYLE_SET_MAX_WIDTH_PERCENT.get();
    	try {
    		 method.invokeExact(
    			node,
    			maxWidth
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeStyleSetMaxWidthPercent].
    public static void nodeStyleSetMaxWidthPercent(
    	YGNode node,
    	float maxWidth
    ) {
    	nodeStyleSetMaxWidthPercent(
    		node.memorySegment(),
    		maxWidth
    	);
    }
    
    public static MemorySegment nodeStyleGetMaxWidth(
    	SegmentAllocator allocator,
    	MemorySegment node
    ) {
    	MethodHandle method = YGNODE_STYLE_GET_MAX_WIDTH.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			node
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeStyleGetMaxWidth].
    public static @Nullable YGValue nodeStyleGetMaxWidth(
    	SegmentAllocator allocator,
    	YGNode node
    ) {
    	MemorySegment segment = nodeStyleGetMaxWidth(
    		allocator,
    		node.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new YGValue(segment);
    }
    
    public static void nodeStyleSetMaxHeight(
    	MemorySegment node,
    	float maxHeight
    ) {
    	MethodHandle method = YGNODE_STYLE_SET_MAX_HEIGHT.get();
    	try {
    		 method.invokeExact(
    			node,
    			maxHeight
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeStyleSetMaxHeight].
    public static void nodeStyleSetMaxHeight(
    	YGNode node,
    	float maxHeight
    ) {
    	nodeStyleSetMaxHeight(
    		node.memorySegment(),
    		maxHeight
    	);
    }
    
    public static void nodeStyleSetMaxHeightPercent(
    	MemorySegment node,
    	float maxHeight
    ) {
    	MethodHandle method = YGNODE_STYLE_SET_MAX_HEIGHT_PERCENT.get();
    	try {
    		 method.invokeExact(
    			node,
    			maxHeight
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeStyleSetMaxHeightPercent].
    public static void nodeStyleSetMaxHeightPercent(
    	YGNode node,
    	float maxHeight
    ) {
    	nodeStyleSetMaxHeightPercent(
    		node.memorySegment(),
    		maxHeight
    	);
    }
    
    public static MemorySegment nodeStyleGetMaxHeight(
    	SegmentAllocator allocator,
    	MemorySegment node
    ) {
    	MethodHandle method = YGNODE_STYLE_GET_MAX_HEIGHT.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			node
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeStyleGetMaxHeight].
    public static @Nullable YGValue nodeStyleGetMaxHeight(
    	SegmentAllocator allocator,
    	YGNode node
    ) {
    	MemorySegment segment = nodeStyleGetMaxHeight(
    		allocator,
    		node.memorySegment()
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new YGValue(segment);
    }
    
    public static void nodeStyleSetAspectRatio(
    	MemorySegment node,
    	float aspectRatio
    ) {
    	MethodHandle method = YGNODE_STYLE_SET_ASPECT_RATIO.get();
    	try {
    		 method.invokeExact(
    			node,
    			aspectRatio
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeStyleSetAspectRatio].
    public static void nodeStyleSetAspectRatio(
    	YGNode node,
    	float aspectRatio
    ) {
    	nodeStyleSetAspectRatio(
    		node.memorySegment(),
    		aspectRatio
    	);
    }
    
    public static float nodeStyleGetAspectRatio(
    	MemorySegment node
    ) {
    	MethodHandle method = YGNODE_STYLE_GET_ASPECT_RATIO.get();
    	try {
    		return (float) method.invokeExact(
    			node
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#nodeStyleGetAspectRatio].
    public static float nodeStyleGetAspectRatio(
    	YGNode node
    ) {
    	return nodeStyleGetAspectRatio(
    		node.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Rounds a point value to the nearest whole pixel, given a pointScaleFactor
    /// describing pixel density.
    /// @returns the rounded value in points
    /// ```
    public static float roundValueToPixelGrid(
    	double value,
    	double pointScaleFactor,
    	boolean forceCeil,
    	boolean forceFloor
    ) {
    	MethodHandle method = YGROUND_VALUE_TO_PIXEL_GRID.get();
    	try {
    		return (float) method.invokeExact(
    			value,
    			pointScaleFactor,
    			forceCeil,
    			forceFloor
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// 
    /// Function pointer type for YGConfigSetLogger.
    /// ```
    public static int logger(
    	MemorySegment config,
    	MemorySegment node,
    	int level,
    	MemorySegment format,
    	MemorySegment args
    ) {
    	MethodHandle method = YGLOGGER.get();
    	try {
    		return (int) method.invokeExact(
    			config,
    			node,
    			level,
    			format,
    			args
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#logger].
    public static int logger(
    	YGConfig config,
    	YGNode node,
    	int level,
    	NativeByteArray format,
    	NativeByteArray args
    ) {
    	return logger(
    		config.memorySegment(),
    		node.memorySegment(),
    		level,
    		format.memorySegment(),
    		args.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Function pointer type for YGConfigSetCloneNodeFunc.
    /// ```
    public static MemorySegment cloneNodeFunc(
    	MemorySegment oldNode,
    	MemorySegment owner,
    	long childIndex
    ) {
    	MethodHandle method = YGCLONE_NODE_FUNC.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			oldNode,
    			owner,
    			childIndex
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#cloneNodeFunc].
    public static @Nullable YGNode cloneNodeFunc(
    	YGNode oldNode,
    	YGNode owner,
    	long childIndex
    ) {
    	MemorySegment segment = cloneNodeFunc(
    		oldNode.memorySegment(),
    		owner.memorySegment(),
    		childIndex
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new YGNode(segment);
    }
    
    public static void dirtiedFunc(
    	MemorySegment node
    ) {
    	MethodHandle method = YGDIRTIED_FUNC.get();
    	try {
    		 method.invokeExact(
    			node
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#dirtiedFunc].
    public static void dirtiedFunc(
    	YGNode node
    ) {
    	dirtiedFunc(
    		node.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Returns the computed dimensions of the node, following the constraints of
    /// `widthMode` and `heightMode`:
    /// 
    /// YGMeasureModeUndefined: The parent has not imposed any constraint on the
    /// child. It can be whatever size it wants.
    /// 
    /// YGMeasureModeAtMost: The child can be as large as it wants up to the
    /// specified size.
    /// 
    /// YGMeasureModeExactly: The parent has determined an exact size for the
    /// child. The child is going to be given those bounds regardless of how big it
    /// wants to be.
    /// 
    /// @returns the size of the leaf node, measured under the given constraints.
    /// ```
    public static MemorySegment measureFunc(
    	SegmentAllocator allocator,
    	MemorySegment node,
    	float width,
    	int widthMode,
    	float height,
    	int heightMode
    ) {
    	MethodHandle method = YGMEASURE_FUNC.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			node,
    			width,
    			widthMode,
    			height,
    			heightMode
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#measureFunc].
    public static @Nullable YGSize measureFunc(
    	SegmentAllocator allocator,
    	YGNode node,
    	float width,
    	int widthMode,
    	float height,
    	int heightMode
    ) {
    	MemorySegment segment = measureFunc(
    		allocator,
    		node.memorySegment(),
    		width,
    		widthMode,
    		height,
    		heightMode
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new YGSize(segment);
    }
    
    /// ```
    /// 
    /// @returns a defined offset to baseline (ascent).
    /// ```
    public static float baselineFunc(
    	MemorySegment node,
    	float width,
    	float height
    ) {
    	MethodHandle method = YGBASELINE_FUNC.get();
    	try {
    		return (float) method.invokeExact(
    			node,
    			width,
    			height
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#baselineFunc].
    public static float baselineFunc(
    	YGNode node,
    	float width,
    	float height
    ) {
    	return baselineFunc(
    		node.memorySegment(),
    		width,
    		height
    	);
    }

}