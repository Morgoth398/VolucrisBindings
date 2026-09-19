/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.fastNoise2;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.MemoryStack;
import volucris.bindings.core.NativeFloatArray;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class FastNoise2 {

    private static final LazyConstant<MethodHandle> FN_NEW_FROM_ENCODED_NODE_TREE;
    private static final LazyConstant<MethodHandle> FN_DELETE_NODE_REF;
    private static final LazyConstant<MethodHandle> FN_GET_ACTIVE_FEATURE_SET;
    private static final LazyConstant<MethodHandle> FN_GET_METADATA_ID;
    private static final LazyConstant<MethodHandle> FN_GEN_UNIFORM_GRID2_D;
    private static final LazyConstant<MethodHandle> FN_GEN_UNIFORM_GRID3_D;
    private static final LazyConstant<MethodHandle> FN_GEN_UNIFORM_GRID4_D;
    private static final LazyConstant<MethodHandle> FN_GEN_POSITION_ARRAY2_D;
    private static final LazyConstant<MethodHandle> FN_GEN_POSITION_ARRAY3_D;
    private static final LazyConstant<MethodHandle> FN_GEN_POSITION_ARRAY4_D;
    private static final LazyConstant<MethodHandle> FN_GEN_TILEABLE2_D;
    private static final LazyConstant<MethodHandle> FN_GEN_SINGLE2_D;
    private static final LazyConstant<MethodHandle> FN_GEN_SINGLE3_D;
    private static final LazyConstant<MethodHandle> FN_GEN_SINGLE4_D;
    private static final LazyConstant<MethodHandle> FN_GET_METADATA_COUNT;
    private static final LazyConstant<MethodHandle> FN_GET_METADATA_NAME;
    private static final LazyConstant<MethodHandle> FN_NEW_FROM_METADATA;
    private static final LazyConstant<MethodHandle> FN_GET_METADATA_VARIABLE_COUNT;
    private static final LazyConstant<MethodHandle> FN_GET_METADATA_VARIABLE_NAME;
    private static final LazyConstant<MethodHandle> FN_GET_METADATA_VARIABLE_TYPE;
    private static final LazyConstant<MethodHandle> FN_GET_METADATA_VARIABLE_DIMENSION_IDX;
    private static final LazyConstant<MethodHandle> FN_GET_METADATA_ENUM_COUNT;
    private static final LazyConstant<MethodHandle> FN_GET_METADATA_ENUM_NAME;
    private static final LazyConstant<MethodHandle> FN_SET_VARIABLE_FLOAT;
    private static final LazyConstant<MethodHandle> FN_SET_VARIABLE_INT_ENUM;
    private static final LazyConstant<MethodHandle> FN_GET_METADATA_NODE_LOOKUP_COUNT;
    private static final LazyConstant<MethodHandle> FN_GET_METADATA_NODE_LOOKUP_NAME;
    private static final LazyConstant<MethodHandle> FN_GET_METADATA_NODE_LOOKUP_DIMENSION_IDX;
    private static final LazyConstant<MethodHandle> FN_SET_NODE_LOOKUP;
    private static final LazyConstant<MethodHandle> FN_GET_METADATA_HYBRID_COUNT;
    private static final LazyConstant<MethodHandle> FN_GET_METADATA_HYBRID_NAME;
    private static final LazyConstant<MethodHandle> FN_GET_METADATA_HYBRID_DIMENSION_IDX;
    private static final LazyConstant<MethodHandle> FN_SET_HYBRID_NODE_LOOKUP;
    private static final LazyConstant<MethodHandle> FN_SET_HYBRID_FLOAT;
    private static final LazyConstant<MethodHandle> FN_GET_METADATA_DESCRIPTION;
    private static final LazyConstant<MethodHandle> FN_GET_METADATA_GROUP_COUNT;
    private static final LazyConstant<MethodHandle> FN_GET_METADATA_GROUP_NAME;
    private static final LazyConstant<MethodHandle> FN_GET_METADATA_VARIABLE_DESCRIPTION;
    private static final LazyConstant<MethodHandle> FN_GET_METADATA_VARIABLE_DEFAULT_FLOAT;
    private static final LazyConstant<MethodHandle> FN_GET_METADATA_VARIABLE_DEFAULT_INT_ENUM;
    private static final LazyConstant<MethodHandle> FN_GET_METADATA_VARIABLE_MIN_FLOAT;
    private static final LazyConstant<MethodHandle> FN_GET_METADATA_VARIABLE_MAX_FLOAT;
    private static final LazyConstant<MethodHandle> FN_GET_METADATA_NODE_LOOKUP_DESCRIPTION;
    private static final LazyConstant<MethodHandle> FN_GET_METADATA_HYBRID_DESCRIPTION;
    private static final LazyConstant<MethodHandle> FN_GET_METADATA_HYBRID_DEFAULT;

    static {
        //@formatter:off
        FN_NEW_FROM_ENCODED_NODE_TREE = downcallHandle("fnNewFromEncodedNodeTree", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT);
        FN_DELETE_NODE_REF = downcallHandleVoid("fnDeleteNodeRef", UNBOUNDED_ADDRESS);
        FN_GET_ACTIVE_FEATURE_SET = downcallHandle("fnGetActiveFeatureSet", JAVA_INT, UNBOUNDED_ADDRESS);
        FN_GET_METADATA_ID = downcallHandle("fnGetMetadataID", JAVA_INT, UNBOUNDED_ADDRESS);
        FN_GEN_UNIFORM_GRID2_D = downcallHandleVoid("fnGenUniformGrid2D", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT, JAVA_INT, JAVA_INT, JAVA_FLOAT, JAVA_FLOAT, JAVA_INT, UNBOUNDED_ADDRESS);
        FN_GEN_UNIFORM_GRID3_D = downcallHandleVoid("fnGenUniformGrid3D", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_INT, UNBOUNDED_ADDRESS);
        FN_GEN_UNIFORM_GRID4_D = downcallHandleVoid("fnGenUniformGrid4D", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_INT, UNBOUNDED_ADDRESS);
        FN_GEN_POSITION_ARRAY2_D = downcallHandleVoid("fnGenPositionArray2D", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT, JAVA_INT, UNBOUNDED_ADDRESS);
        FN_GEN_POSITION_ARRAY3_D = downcallHandleVoid("fnGenPositionArray3D", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_INT, UNBOUNDED_ADDRESS);
        FN_GEN_POSITION_ARRAY4_D = downcallHandleVoid("fnGenPositionArray4D", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_INT, UNBOUNDED_ADDRESS);
        FN_GEN_TILEABLE2_D = downcallHandleVoid("fnGenTileable2D", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, JAVA_FLOAT, JAVA_FLOAT, JAVA_INT, UNBOUNDED_ADDRESS);
        FN_GEN_SINGLE2_D = downcallHandle("fnGenSingle2D", JAVA_FLOAT, UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT, JAVA_INT);
        FN_GEN_SINGLE3_D = downcallHandle("fnGenSingle3D", JAVA_FLOAT, UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_INT);
        FN_GEN_SINGLE4_D = downcallHandle("fnGenSingle4D", JAVA_FLOAT, UNBOUNDED_ADDRESS, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_FLOAT, JAVA_INT);
        FN_GET_METADATA_COUNT = downcallHandle("fnGetMetadataCount", JAVA_INT);
        FN_GET_METADATA_NAME = downcallHandle("fnGetMetadataName", UNBOUNDED_ADDRESS, JAVA_INT);
        FN_NEW_FROM_METADATA = downcallHandle("fnNewFromMetadata", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
        FN_GET_METADATA_VARIABLE_COUNT = downcallHandle("fnGetMetadataVariableCount", JAVA_INT, JAVA_INT);
        FN_GET_METADATA_VARIABLE_NAME = downcallHandle("fnGetMetadataVariableName", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
        FN_GET_METADATA_VARIABLE_TYPE = downcallHandle("fnGetMetadataVariableType", JAVA_INT, JAVA_INT, JAVA_INT);
        FN_GET_METADATA_VARIABLE_DIMENSION_IDX = downcallHandle("fnGetMetadataVariableDimensionIdx", JAVA_INT, JAVA_INT, JAVA_INT);
        FN_GET_METADATA_ENUM_COUNT = downcallHandle("fnGetMetadataEnumCount", JAVA_INT, JAVA_INT, JAVA_INT);
        FN_GET_METADATA_ENUM_NAME = downcallHandle("fnGetMetadataEnumName", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, JAVA_INT);
        FN_SET_VARIABLE_FLOAT = downcallHandle("fnSetVariableFloat", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_FLOAT);
        FN_SET_VARIABLE_INT_ENUM = downcallHandle("fnSetVariableIntEnum", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
        FN_GET_METADATA_NODE_LOOKUP_COUNT = downcallHandle("fnGetMetadataNodeLookupCount", JAVA_INT, JAVA_INT);
        FN_GET_METADATA_NODE_LOOKUP_NAME = downcallHandle("fnGetMetadataNodeLookupName", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
        FN_GET_METADATA_NODE_LOOKUP_DIMENSION_IDX = downcallHandle("fnGetMetadataNodeLookupDimensionIdx", JAVA_INT, JAVA_INT, JAVA_INT);
        FN_SET_NODE_LOOKUP = downcallHandle("fnSetNodeLookup", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
        FN_GET_METADATA_HYBRID_COUNT = downcallHandle("fnGetMetadataHybridCount", JAVA_INT, JAVA_INT);
        FN_GET_METADATA_HYBRID_NAME = downcallHandle("fnGetMetadataHybridName", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
        FN_GET_METADATA_HYBRID_DIMENSION_IDX = downcallHandle("fnGetMetadataHybridDimensionIdx", JAVA_INT, JAVA_INT, JAVA_INT);
        FN_SET_HYBRID_NODE_LOOKUP = downcallHandle("fnSetHybridNodeLookup", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, JAVA_INT, UNBOUNDED_ADDRESS);
        FN_SET_HYBRID_FLOAT = downcallHandle("fnSetHybridFloat", JAVA_BOOLEAN, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_FLOAT);
        FN_GET_METADATA_DESCRIPTION = downcallHandle("fnGetMetadataDescription", UNBOUNDED_ADDRESS, JAVA_INT);
        FN_GET_METADATA_GROUP_COUNT = downcallHandle("fnGetMetadataGroupCount", JAVA_INT, JAVA_INT);
        FN_GET_METADATA_GROUP_NAME = downcallHandle("fnGetMetadataGroupName", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
        FN_GET_METADATA_VARIABLE_DESCRIPTION = downcallHandle("fnGetMetadataVariableDescription", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
        FN_GET_METADATA_VARIABLE_DEFAULT_FLOAT = downcallHandle("fnGetMetadataVariableDefaultFloat", JAVA_FLOAT, JAVA_INT, JAVA_INT);
        FN_GET_METADATA_VARIABLE_DEFAULT_INT_ENUM = downcallHandle("fnGetMetadataVariableDefaultIntEnum", JAVA_INT, JAVA_INT, JAVA_INT);
        FN_GET_METADATA_VARIABLE_MIN_FLOAT = downcallHandle("fnGetMetadataVariableMinFloat", JAVA_FLOAT, JAVA_INT, JAVA_INT);
        FN_GET_METADATA_VARIABLE_MAX_FLOAT = downcallHandle("fnGetMetadataVariableMaxFloat", JAVA_FLOAT, JAVA_INT, JAVA_INT);
        FN_GET_METADATA_NODE_LOOKUP_DESCRIPTION = downcallHandle("fnGetMetadataNodeLookupDescription", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
        FN_GET_METADATA_HYBRID_DESCRIPTION = downcallHandle("fnGetMetadataHybridDescription", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
        FN_GET_METADATA_HYBRID_DEFAULT = downcallHandle("fnGetMetadataHybridDefault", JAVA_FLOAT, JAVA_INT, JAVA_INT);
        //@formatter:on
    }

    private FastNoise2() {
    }

    /// ```
    /// @brief Create a node tree from an encoded string.
    /// 
    /// Equivalent to FastNoise::NewFromEncodedNodeTree() in the C++ API.
    /// The returned handle must be freed with fnDeleteNodeRef() when no longer needed.
    /// 
    /// @param encodedString  Encoded node tree string (e.g. from the Node Editor).
    /// @param maxFeatureSet  Maximum auto-detected SIMD feature set. Pass ~0u (uint32_max) for no limit.
    /// @return Opaque node handle, or NULL on failure.
    /// ```
    public static MemorySegment newFromEncodedNodeTree(
    	MemorySegment encodedString,
    	int maxFeatureSet
    ) {
    	MethodHandle method = FN_NEW_FROM_ENCODED_NODE_TREE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			encodedString,
    			maxFeatureSet
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#newFromEncodedNodeTree].
    public static @Nullable MemorySegment newFromEncodedNodeTree(
    	String encodedString,
    	int maxFeatureSet
    ) {
    	try (Arena arena = MemoryStack.stackPush()) {
    		MemorySegment segment = newFromEncodedNodeTree(
    			arena.allocateFrom(encodedString),
    			maxFeatureSet
    		);
    
    		if (segment.equals(MemorySegment.NULL))
    			return null;
    		
    		return segment;
    	}
    }
    
    /// ```
    /// @brief Release a node handle previously obtained from fnNewFromEncodedNodeTree() or fnNewFromMetadata().
    /// @param node  Node handle to release. May be NULL (no-op).
    /// ```
    public static void deleteNodeRef(
    	MemorySegment node
    ) {
    	MethodHandle method = FN_DELETE_NODE_REF.get();
    	try {
    		 method.invokeExact(
    			node
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// @brief Get the SIMD feature set level active for this node.
    /// @param node  Node handle.
    /// @return FastSIMD::FeatureSet value as a uint.
    /// ```
    public static int getActiveFeatureSet(
    	MemorySegment node
    ) {
    	MethodHandle method = FN_GET_ACTIVE_FEATURE_SET.get();
    	try {
    		return (int) method.invokeExact(
    			node
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// @brief Get the metadata ID for this node's type.
    /// @param node  Node handle.
    /// @return Metadata node_id that can be used with fnGetMetadataName() etc.
    /// ```
    public static int getMetadataID(
    	MemorySegment node
    ) {
    	MethodHandle method = FN_GET_METADATA_ID.get();
    	try {
    		return (int) method.invokeExact(
    			node
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// @brief Generate a 2D uniform grid of noise values.
    /// 
    /// Fills @p noiseOut with noise sampled on a regular 2D grid. Ideal for
    /// generating noise for 2D textures, heightmaps, or image buffers that
    /// require uniform spacing between sample positions.
    /// 
    /// Output values are written in row-major order with X as the inner loop:
    /// `noiseOut[y * xCount + x]`
    /// 
    /// @param node         Node handle (must be the root of the node tree).
    /// @param noiseOut     Pre-allocated output array. Must hold at least `xCount * yCount` floats.
    /// @param xOffset      Starting X position in world space.
    /// @param yOffset      Starting Y position in world space.
    /// @param xCount       Number of samples along the X axis.
    /// @param yCount       Number of samples along the Y axis.
    /// @param xStepSize    Distance between samples along X.
    /// @param yStepSize    Distance between samples along Y.
    /// @param seed         Seed value for the noise. Different seeds produce different patterns.
    /// @param outputMinMax Optional float[2] to receive {min, max} of generated values. Pass NULL to skip.
    /// ```
    public static void genUniformGrid2D(
    	MemorySegment node,
    	MemorySegment noiseOut,
    	float xOffset,
    	float yOffset,
    	int xCount,
    	int yCount,
    	float xStepSize,
    	float yStepSize,
    	int seed,
    	MemorySegment outputMinMax
    ) {
    	MethodHandle method = FN_GEN_UNIFORM_GRID2_D.get();
    	try {
    		 method.invokeExact(
    			node,
    			noiseOut,
    			xOffset,
    			yOffset,
    			xCount,
    			yCount,
    			xStepSize,
    			yStepSize,
    			seed,
    			outputMinMax
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#genUniformGrid2D].
    public static void genUniformGrid2D(
    	MemorySegment node,
    	NativeFloatArray noiseOut,
    	float xOffset,
    	float yOffset,
    	int xCount,
    	int yCount,
    	float xStepSize,
    	float yStepSize,
    	int seed,
    	@Nullable NativeFloatArray outputMinMax
    ) {
    	genUniformGrid2D(
    		node,
    		noiseOut.memorySegment(),
    		xOffset,
    		yOffset,
    		xCount,
    		yCount,
    		xStepSize,
    		yStepSize,
    		seed,
    		outputMinMax == null ? MemorySegment.NULL : outputMinMax.memorySegment()
    	);
    }
    
    /// ```
    /// @brief Generate a 3D uniform grid of noise values.
    /// 
    /// Fills @p noiseOut with noise sampled on a regular 3D grid. Ideal for volumetric
    /// data such as voxel terrain, 3D textures, or density fields that
    /// require uniform spacing between sample positions.
    /// 
    /// Try to avoid setting xCount = 1 if you want a slice of 3D noise, due to how
    /// the positions are generated a small xCount is bad for performance.
    /// Use y/zCount = 1 instead.
    /// 
    /// Output values are written with X as the innermost loop, then Y, then Z:
    /// `noiseOut[(z * yCount + y) * xCount + x]`
    /// 
    /// @param node         Node handle (must be the root of the node tree).
    /// @param noiseOut     Pre-allocated output array. Must hold at least `xCount * yCount * zCount` floats.
    /// @param xOffset      Starting X position in world space.
    /// @param yOffset      Starting Y position in world space.
    /// @param zOffset      Starting Z position in world space.
    /// @param xCount       Number of samples along the X axis.
    /// @param yCount       Number of samples along the Y axis.
    /// @param zCount       Number of samples along the Z axis.
    /// @param xStepSize    Distance between samples along X.
    /// @param yStepSize    Distance between samples along Y.
    /// @param zStepSize    Distance between samples along Z.
    /// @param seed         Seed value for the noise. Different seeds produce different patterns.
    /// @param outputMinMax Optional float[2] to receive {min, max} of generated values. Pass NULL to skip.
    /// ```
    public static void genUniformGrid3D(
    	MemorySegment node,
    	MemorySegment noiseOut,
    	float xOffset,
    	float yOffset,
    	float zOffset,
    	int xCount,
    	int yCount,
    	int zCount,
    	float xStepSize,
    	float yStepSize,
    	float zStepSize,
    	int seed,
    	MemorySegment outputMinMax
    ) {
    	MethodHandle method = FN_GEN_UNIFORM_GRID3_D.get();
    	try {
    		 method.invokeExact(
    			node,
    			noiseOut,
    			xOffset,
    			yOffset,
    			zOffset,
    			xCount,
    			yCount,
    			zCount,
    			xStepSize,
    			yStepSize,
    			zStepSize,
    			seed,
    			outputMinMax
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#genUniformGrid3D].
    public static void genUniformGrid3D(
    	MemorySegment node,
    	NativeFloatArray noiseOut,
    	float xOffset,
    	float yOffset,
    	float zOffset,
    	int xCount,
    	int yCount,
    	int zCount,
    	float xStepSize,
    	float yStepSize,
    	float zStepSize,
    	int seed,
    	@Nullable NativeFloatArray outputMinMax
    ) {
    	genUniformGrid3D(
    		node,
    		noiseOut.memorySegment(),
    		xOffset,
    		yOffset,
    		zOffset,
    		xCount,
    		yCount,
    		zCount,
    		xStepSize,
    		yStepSize,
    		zStepSize,
    		seed,
    		outputMinMax == null ? MemorySegment.NULL : outputMinMax.memorySegment()
    	);
    }
    
    /// ```
    /// @brief Generate a 4D uniform grid of noise values.
    /// 
    /// Fills @p noiseOut with noise sampled on a regular 4D grid. The fourth dimension can be
    /// used for animating 3D noise over time or other parametric effects.
    /// 
    /// Try to avoid setting xCount = 1 if you want a slice of 4D noise, due to how
    /// the positions are generated a small xCount is bad for performance.
    /// Use y/z/wCount = 1 instead.
    /// 
    /// Output values are written with X as the innermost loop, then Y, Z, W:
    /// `noiseOut[((w * zCount + z) * yCount + y) * xCount + x]`
    /// 
    /// @param node         Node handle (must be the root of the node tree).
    /// @param noiseOut     Pre-allocated output array. Must hold at least `xCount * yCount * zCount * wCount` floats.
    /// @param xOffset      Starting X position in world space.
    /// @param yOffset      Starting Y position in world space.
    /// @param zOffset      Starting Z position in world space.
    /// @param wOffset      Starting W position in world space.
    /// @param xCount       Number of samples along the X axis.
    /// @param yCount       Number of samples along the Y axis.
    /// @param zCount       Number of samples along the Z axis.
    /// @param wCount       Number of samples along the W axis.
    /// @param xStepSize    Distance between samples along X.
    /// @param yStepSize    Distance between samples along Y.
    /// @param zStepSize    Distance between samples along Z.
    /// @param wStepSize    Distance between samples along W.
    /// @param seed         Seed value for the noise. Different seeds produce different patterns.
    /// @param outputMinMax Optional float[2] to receive {min, max} of generated values. Pass NULL to skip.
    /// ```
    public static void genUniformGrid4D(
    	MemorySegment node,
    	MemorySegment noiseOut,
    	float xOffset,
    	float yOffset,
    	float zOffset,
    	float wOffset,
    	int xCount,
    	int yCount,
    	int zCount,
    	int wCount,
    	float xStepSize,
    	float yStepSize,
    	float zStepSize,
    	float wStepSize,
    	int seed,
    	MemorySegment outputMinMax
    ) {
    	MethodHandle method = FN_GEN_UNIFORM_GRID4_D.get();
    	try {
    		 method.invokeExact(
    			node,
    			noiseOut,
    			xOffset,
    			yOffset,
    			zOffset,
    			wOffset,
    			xCount,
    			yCount,
    			zCount,
    			wCount,
    			xStepSize,
    			yStepSize,
    			zStepSize,
    			wStepSize,
    			seed,
    			outputMinMax
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#genUniformGrid4D].
    public static void genUniformGrid4D(
    	MemorySegment node,
    	NativeFloatArray noiseOut,
    	float xOffset,
    	float yOffset,
    	float zOffset,
    	float wOffset,
    	int xCount,
    	int yCount,
    	int zCount,
    	int wCount,
    	float xStepSize,
    	float yStepSize,
    	float zStepSize,
    	float wStepSize,
    	int seed,
    	@Nullable NativeFloatArray outputMinMax
    ) {
    	genUniformGrid4D(
    		node,
    		noiseOut.memorySegment(),
    		xOffset,
    		yOffset,
    		zOffset,
    		wOffset,
    		xCount,
    		yCount,
    		zCount,
    		wCount,
    		xStepSize,
    		yStepSize,
    		zStepSize,
    		wStepSize,
    		seed,
    		outputMinMax == null ? MemorySegment.NULL : outputMinMax.memorySegment()
    	);
    }
    
    /// ```
    /// @brief Generate noise at arbitrary 2D positions.
    /// 
    /// Evaluates noise at a set of caller-supplied (x, y) positions. Use this when
    /// sampling at non-uniform or scattered locations (e.g. mesh vertices, particle
    /// positions, or any non-grid layout).
    /// 
    /// This is faster than using fnGenUniformGrid2D since the uniform grid positions
    /// don't need to be generated. So for maximum generation performance across many
    /// generation calls: pre generate your own uniform grid positions once and reuse
    /// them for all generation calls with x/yOffset as needed.
    /// 
    /// Each position is calculated as `(xPosArray[i] + xOffset, yPosArray[i] + yOffset)`.
    /// The offset parameters allow you to shift all positions without modifying the arrays.
    /// 
    /// @param node         Node handle (must be the root of the node tree).
    /// @param noiseOut     Pre-allocated output array. Must hold at least @p count floats.
    /// @param count        Number of positions to generate.
    /// @param xPosArray    Array of X coordinates in world space (length >= @p count).
    /// @param yPosArray    Array of Y coordinates in world space (length >= @p count).
    /// @param xOffset      Constant offset added to all X positions.
    /// @param yOffset      Constant offset added to all Y positions.
    /// @param seed         Seed value for the noise. Different seeds produce different patterns.
    /// @param outputMinMax Optional float[2] to receive {min, max} of generated values. Pass NULL to skip.
    /// ```
    public static void genPositionArray2D(
    	MemorySegment node,
    	MemorySegment noiseOut,
    	int count,
    	MemorySegment xPosArray,
    	MemorySegment yPosArray,
    	float xOffset,
    	float yOffset,
    	int seed,
    	MemorySegment outputMinMax
    ) {
    	MethodHandle method = FN_GEN_POSITION_ARRAY2_D.get();
    	try {
    		 method.invokeExact(
    			node,
    			noiseOut,
    			count,
    			xPosArray,
    			yPosArray,
    			xOffset,
    			yOffset,
    			seed,
    			outputMinMax
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#genPositionArray2D].
    public static void genPositionArray2D(
    	MemorySegment node,
    	NativeFloatArray noiseOut,
    	int count,
    	NativeFloatArray xPosArray,
    	NativeFloatArray yPosArray,
    	float xOffset,
    	float yOffset,
    	int seed,
    	@Nullable NativeFloatArray outputMinMax
    ) {
    	genPositionArray2D(
    		node,
    		noiseOut.memorySegment(),
    		count,
    		xPosArray.memorySegment(),
    		yPosArray.memorySegment(),
    		xOffset,
    		yOffset,
    		seed,
    		outputMinMax == null ? MemorySegment.NULL : outputMinMax.memorySegment()
    	);
    }
    
    /// ```
    /// @brief Generate noise at arbitrary 3D positions.
    /// 
    /// Evaluates noise at a set of caller-supplied (x, y, z) positions. Use this when
    /// sampling at non-uniform or scattered locations (e.g. mesh vertices, particle
    /// positions, or any non-grid layout).
    /// 
    /// This is faster than using fnGenUniformGrid3D since the uniform grid positions
    /// don't need to be generated. So for maximum generation performance across many
    /// generation calls: pre generate your own uniform grid positions once and reuse
    /// them for all generation calls with x/y/zOffset as needed.
    /// 
    /// Each position is calculated as `(xPosArray[i] + xOffset, yPosArray[i] + yOffset, zPosArray[i] + zOffset)`.
    /// The offset parameters allow you to shift all positions without modifying the arrays.
    /// 
    /// @param node         Node handle (must be the root of the node tree).
    /// @param noiseOut     Pre-allocated output array. Must hold at least @p count floats.
    /// @param count        Number of positions to generate.
    /// @param xPosArray    Array of X coordinates in world space (length >= @p count).
    /// @param yPosArray    Array of Y coordinates in world space (length >= @p count).
    /// @param zPosArray    Array of Z coordinates in world space (length >= @p count).
    /// @param xOffset      Constant offset added to all X positions.
    /// @param yOffset      Constant offset added to all Y positions.
    /// @param zOffset      Constant offset added to all Z positions.
    /// @param seed         Seed value for the noise. Different seeds produce different patterns.
    /// @param outputMinMax Optional float[2] to receive {min, max} of generated values. Pass NULL to skip.
    /// ```
    public static void genPositionArray3D(
    	MemorySegment node,
    	MemorySegment noiseOut,
    	int count,
    	MemorySegment xPosArray,
    	MemorySegment yPosArray,
    	MemorySegment zPosArray,
    	float xOffset,
    	float yOffset,
    	float zOffset,
    	int seed,
    	MemorySegment outputMinMax
    ) {
    	MethodHandle method = FN_GEN_POSITION_ARRAY3_D.get();
    	try {
    		 method.invokeExact(
    			node,
    			noiseOut,
    			count,
    			xPosArray,
    			yPosArray,
    			zPosArray,
    			xOffset,
    			yOffset,
    			zOffset,
    			seed,
    			outputMinMax
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#genPositionArray3D].
    public static void genPositionArray3D(
    	MemorySegment node,
    	NativeFloatArray noiseOut,
    	int count,
    	NativeFloatArray xPosArray,
    	NativeFloatArray yPosArray,
    	NativeFloatArray zPosArray,
    	float xOffset,
    	float yOffset,
    	float zOffset,
    	int seed,
    	@Nullable NativeFloatArray outputMinMax
    ) {
    	genPositionArray3D(
    		node,
    		noiseOut.memorySegment(),
    		count,
    		xPosArray.memorySegment(),
    		yPosArray.memorySegment(),
    		zPosArray.memorySegment(),
    		xOffset,
    		yOffset,
    		zOffset,
    		seed,
    		outputMinMax == null ? MemorySegment.NULL : outputMinMax.memorySegment()
    	);
    }
    
    /// ```
    /// @brief Generate noise at arbitrary 4D positions.
    /// 
    /// Evaluates noise at a set of caller-supplied (x, y, z, w) positions. Use this when
    /// sampling at non-uniform or scattered locations (e.g. mesh vertices, particle
    /// positions, or any non-grid layout).
    /// 
    /// This is faster than using fnGenUniformGrid4D since the uniform grid positions
    /// don't need to be generated. So for maximum generation performance across many
    /// generation calls: pre generate your own uniform grid positions once and reuse
    /// them for all generation calls with x/y/z/wOffset as needed.
    /// 
    /// Each position is calculated as `(xPosArray[i] + xOffset, yPosArray[i] + yOffset, zPosArray[i] + zOffset, wPosArray[i] + wOffset)`.
    /// The offset parameters allow you to shift all positions without modifying the arrays.
    /// 
    /// @param node         Node handle (must be the root of the node tree).
    /// @param noiseOut     Pre-allocated output array. Must hold at least @p count floats.
    /// @param count        Number of positions to generate.
    /// @param xPosArray    Array of X coordinates in world space (length >= @p count).
    /// @param yPosArray    Array of Y coordinates in world space (length >= @p count).
    /// @param zPosArray    Array of Z coordinates in world space (length >= @p count).
    /// @param wPosArray    Array of W coordinates in world space (length >= @p count).
    /// @param xOffset      Constant offset added to all X positions.
    /// @param yOffset      Constant offset added to all Y positions.
    /// @param zOffset      Constant offset added to all Z positions.
    /// @param wOffset      Constant offset added to all W positions.
    /// @param seed         Seed value for the noise. Different seeds produce different patterns.
    /// @param outputMinMax Optional float[2] to receive {min, max} of generated values. Pass NULL to skip.
    /// ```
    public static void genPositionArray4D(
    	MemorySegment node,
    	MemorySegment noiseOut,
    	int count,
    	MemorySegment xPosArray,
    	MemorySegment yPosArray,
    	MemorySegment zPosArray,
    	MemorySegment wPosArray,
    	float xOffset,
    	float yOffset,
    	float zOffset,
    	float wOffset,
    	int seed,
    	MemorySegment outputMinMax
    ) {
    	MethodHandle method = FN_GEN_POSITION_ARRAY4_D.get();
    	try {
    		 method.invokeExact(
    			node,
    			noiseOut,
    			count,
    			xPosArray,
    			yPosArray,
    			zPosArray,
    			wPosArray,
    			xOffset,
    			yOffset,
    			zOffset,
    			wOffset,
    			seed,
    			outputMinMax
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#genPositionArray4D].
    public static void genPositionArray4D(
    	MemorySegment node,
    	NativeFloatArray noiseOut,
    	int count,
    	NativeFloatArray xPosArray,
    	NativeFloatArray yPosArray,
    	NativeFloatArray zPosArray,
    	NativeFloatArray wPosArray,
    	float xOffset,
    	float yOffset,
    	float zOffset,
    	float wOffset,
    	int seed,
    	@Nullable NativeFloatArray outputMinMax
    ) {
    	genPositionArray4D(
    		node,
    		noiseOut.memorySegment(),
    		count,
    		xPosArray.memorySegment(),
    		yPosArray.memorySegment(),
    		zPosArray.memorySegment(),
    		wPosArray.memorySegment(),
    		xOffset,
    		yOffset,
    		zOffset,
    		wOffset,
    		seed,
    		outputMinMax == null ? MemorySegment.NULL : outputMinMax.memorySegment()
    	);
    }
    
    /// ```
    /// @brief Generate seamlessly tileable 2D noise.
    /// 
    /// Produces a 2D noise image that tiles perfectly when repeated in both X and Y.
    /// Internally this works by mapping the 2D grid onto a 4D hypertorus, so the
    /// underlying noise types will be using 4D generation.
    /// 
    /// Output is written in row-major order: `noiseOut[y * xSize + x]`
    /// 
    /// @param node         Node handle (must be the root of the node tree).
    /// @param noiseOut     Pre-allocated output array. Must hold at least `xSize * ySize` floats.
    /// @param xSize        Number of samples (and tile width) along the X axis.
    /// @param ySize        Number of samples (and tile height) along the Y axis.
    /// @param xStepSize    Distance between samples along X.
    /// @param yStepSize    Distance between samples along Y.
    /// @param seed         Seed value for the noise. Different seeds produce different patterns.
    /// @param outputMinMax Optional float[2] to receive {min, max} of generated values. Pass NULL to skip.
    /// ```
    public static void genTileable2D(
    	MemorySegment node,
    	MemorySegment noiseOut,
    	int xSize,
    	int ySize,
    	float xStepSize,
    	float yStepSize,
    	int seed,
    	MemorySegment outputMinMax
    ) {
    	MethodHandle method = FN_GEN_TILEABLE2_D.get();
    	try {
    		 method.invokeExact(
    			node,
    			noiseOut,
    			xSize,
    			ySize,
    			xStepSize,
    			yStepSize,
    			seed,
    			outputMinMax
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#genTileable2D].
    public static void genTileable2D(
    	MemorySegment node,
    	NativeFloatArray noiseOut,
    	int xSize,
    	int ySize,
    	float xStepSize,
    	float yStepSize,
    	int seed,
    	@Nullable NativeFloatArray outputMinMax
    ) {
    	genTileable2D(
    		node,
    		noiseOut.memorySegment(),
    		xSize,
    		ySize,
    		xStepSize,
    		yStepSize,
    		seed,
    		outputMinMax == null ? MemorySegment.NULL : outputMinMax.memorySegment()
    	);
    }
    
    /// ```
    /// @brief Generate a single 2D noise value at a specific position. VERY SLOW!!!
    /// 
    /// Avoid using this unless you only need a single sample, this is significantly slower
    /// per-sample than the batch methods (fnGenUniformGrid, fnGenPositionArray) because SIMD
    /// lanes are underutilised. Prefer batch methods for bulk generation.
    /// 
    /// @param node  Node handle (must be the root of the node tree).
    /// @param x     X position in world space.
    /// @param y     Y position in world space.
    /// @param seed  Seed value for the noise. Different seeds produce different patterns.
    /// @return The noise value at the given position.
    /// ```
    public static float genSingle2D(
    	MemorySegment node,
    	float x,
    	float y,
    	int seed
    ) {
    	MethodHandle method = FN_GEN_SINGLE2_D.get();
    	try {
    		return (float) method.invokeExact(
    			node,
    			x,
    			y,
    			seed
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// @brief Generate a single 3D noise value at a specific position. VERY SLOW!!!
    /// 
    /// Avoid using this unless you only need a single sample, this is significantly slower
    /// per-sample than the batch methods (fnGenUniformGrid, fnGenPositionArray) because SIMD
    /// lanes are underutilised. Prefer batch methods for bulk generation.
    /// 
    /// @param node  Node handle (must be the root of the node tree).
    /// @param x     X position in world space.
    /// @param y     Y position in world space.
    /// @param z     Z position in world space.
    /// @param seed  Seed value for the noise. Different seeds produce different patterns.
    /// @return The noise value at the given position.
    /// ```
    public static float genSingle3D(
    	MemorySegment node,
    	float x,
    	float y,
    	float z,
    	int seed
    ) {
    	MethodHandle method = FN_GEN_SINGLE3_D.get();
    	try {
    		return (float) method.invokeExact(
    			node,
    			x,
    			y,
    			z,
    			seed
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// @brief Generate a single 4D noise value at a specific position. VERY SLOW!!!
    /// 
    /// Avoid using this unless you only need a single sample, this is significantly slower
    /// per-sample than the batch methods (fnGenUniformGrid, fnGenPositionArray) because SIMD
    /// lanes are underutilised. Prefer batch methods for bulk generation.
    /// 
    /// @param node  Node handle (must be the root of the node tree).
    /// @param x     X position in world space.
    /// @param y     Y position in world space.
    /// @param z     Z position in world space.
    /// @param w     W position in world space.
    /// @param seed  Seed value for the noise. Different seeds produce different patterns.
    /// @return The noise value at the given position.
    /// ```
    public static float genSingle4D(
    	MemorySegment node,
    	float x,
    	float y,
    	float z,
    	float w,
    	int seed
    ) {
    	MethodHandle method = FN_GEN_SINGLE4_D.get();
    	try {
    		return (float) method.invokeExact(
    			node,
    			x,
    			y,
    			z,
    			w,
    			seed
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// @brief Get the total number of registered node types.
    /// 
    /// Each node type has a unique metadata ID. Use this to determine the valid
    /// range of IDs for functions like fnGetMetadataName() and fnNewFromMetadata().
    /// 
    /// @return Count of node metadata entries. Valid IDs range from 0 to count-1.
    /// ```
    public static int getMetadataCount() {
    	MethodHandle method = FN_GET_METADATA_COUNT.get();
    	try {
    		return (int) method.invokeExact();
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// @brief Get the name of a node type by metadata ID.
    /// 
    /// Returns the class name of the node (e.g. "Simplex", "FractalFBm", "DomainScale").
    /// This is the internal name, not formatted for display. Use
    /// Metadata::FormatMetadataNodeName() in C++ for a display-friendly version.
    /// 
    /// @param id  Metadata ID (0 to fnGetMetadataCount()-1).
    /// @return Node type name string, or "INVALID NODE ID" if the ID is out of range.
    /// ```
    public static MemorySegment ngetMetadataName(
    	int id
    ) {
    	MethodHandle method = FN_GET_METADATA_NAME.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			id
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ngetMetadataName].
    public static @Nullable String getMetadataName(
    	int id
    ) {
    	MemorySegment segment = ngetMetadataName(
    		id
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment.getString(0);
    }
    
    /// ```
    /// @brief Create a new node from a metadata ID.
    /// 
    /// Allows creating nodes dynamically at runtime without compile-time type knowledge.
    /// Configure the returned node by calling fnSetVariableFloat(), fnSetVariableIntEnum(),
    /// fnSetNodeLookup(), fnSetHybridFloat(), and fnSetHybridNodeLookup().
    /// 
    /// The returned handle must be freed with fnDeleteNodeRef() when no longer needed.
    /// 
    /// @param id         Metadata ID identifying the node type (0 to fnGetMetadataCount()-1).
    /// @param maxFeatureSet  Maximum auto-detected SIMD feature set. Pass ~0u (uint32_max) for no limit.
    /// @return Opaque node handle, or NULL if the ID is invalid. Must be freed with fnDeleteNodeRef().
    /// ```
    public static MemorySegment newFromMetadata(
    	int id,
    	int maxFeatureSet
    ) {
    	MethodHandle method = FN_NEW_FROM_METADATA.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			id,
    			maxFeatureSet
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// @brief Get the number of configurable variables on a node type.
    /// 
    /// Variables are float, int, or enum parameters that control the node's behaviour
    /// (e.g. fractal octaves, lacunarity, noise type). Use this to iterate over all
    /// variables with fnGetMetadataVariableName(), fnGetMetadataVariableType(), etc.
    /// 
    /// @param id  Metadata ID (0 to fnGetMetadataCount()-1).
    /// @return Number of member variables, or -1 if the ID is invalid.
    /// ```
    public static int getMetadataVariableCount(
    	int id
    ) {
    	MethodHandle method = FN_GET_METADATA_VARIABLE_COUNT.get();
    	try {
    		return (int) method.invokeExact(
    			id
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// @brief Get the name of a variable on a node type.
    /// 
    /// Returns the display name of the variable (e.g. "Octaves", "Lacunarity", "Gain").
    /// 
    /// @param id             Metadata ID (0 to fnGetMetadataCount()-1).
    /// @param variableIndex  Index into the variables list (0-based, up to fnGetMetadataVariableCount()-1).
    /// @return Variable name string, or an error string if either index is invalid.
    /// ```
    public static MemorySegment ngetMetadataVariableName(
    	int id,
    	int variableIndex
    ) {
    	MethodHandle method = FN_GET_METADATA_VARIABLE_NAME.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			id,
    			variableIndex
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ngetMetadataVariableName].
    public static @Nullable String getMetadataVariableName(
    	int id,
    	int variableIndex
    ) {
    	MemorySegment segment = ngetMetadataVariableName(
    		id,
    		variableIndex
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment.getString(0);
    }
    
    /// ```
    /// @brief Get the type of a variable on a node type.
    /// 
    /// The type determines which setter function to use:
    /// - 0 (EFloat): Use fnSetVariableFloat(). Has min/max bounds from
    /// fnGetMetadataVariableMinFloat() / fnGetMetadataVariableMaxFloat().
    /// - 1 (EInt): Use fnSetVariableIntEnum().
    /// - 2 (EEnum): Use fnSetVariableIntEnum(). Enum option names can be queried
    /// with fnGetMetadataEnumCount() and fnGetMetadataEnumName().
    /// 
    /// @param id             Metadata ID (0 to fnGetMetadataCount()-1).
    /// @param variableIndex  Index into the variables list (0-based, up to fnGetMetadataVariableCount()-1).
    /// @return Type code (0=float, 1=int, 2=enum), or -1 if either index is invalid.
    /// ```
    public static int getMetadataVariableType(
    	int id,
    	int variableIndex
    ) {
    	MethodHandle method = FN_GET_METADATA_VARIABLE_TYPE.get();
    	try {
    		return (int) method.invokeExact(
    			id,
    			variableIndex
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// @brief Get the dimension index for a per-dimension variable.
    /// 
    /// Some nodes have variables that are registered once per dimension (e.g. X/Y/Z scale).
    /// These share the same base name but differ in their dimension index (0=X, 1=Y, 2=Z, 3=W).
    /// Non-per-dimension variables return -1.
    /// 
    /// @param id             Metadata ID (0 to fnGetMetadataCount()-1).
    /// @param variableIndex  Index into the variables list (0-based, up to fnGetMetadataVariableCount()-1).
    /// @return Dimension index (0=X, 1=Y, 2=Z, 3=W), or -1 if not a per-dimension variable or if either index is invalid.
    /// ```
    public static int getMetadataVariableDimensionIdx(
    	int id,
    	int variableIndex
    ) {
    	MethodHandle method = FN_GET_METADATA_VARIABLE_DIMENSION_IDX.get();
    	try {
    		return (int) method.invokeExact(
    			id,
    			variableIndex
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// @brief Get the number of enum values for an enum variable.
    /// 
    /// Only meaningful for variables of type EEnum (see fnGetMetadataVariableType()).
    /// Use with fnGetMetadataEnumName() to query option names.
    /// 
    /// @param id             Metadata ID (0 to fnGetMetadataCount()-1).
    /// @param variableIndex  Index of the enum variable (0-based, up to fnGetMetadataVariableCount()-1).
    /// @return Number of enum options, or -1 if either index is invalid.
    /// ```
    public static int getMetadataEnumCount(
    	int id,
    	int variableIndex
    ) {
    	MethodHandle method = FN_GET_METADATA_ENUM_COUNT.get();
    	try {
    		return (int) method.invokeExact(
    			id,
    			variableIndex
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// @brief Get the name of an enum option.
    /// 
    /// Returns the display name for one option of an enum variable. The @p enumIndex
    /// corresponds to the integer value passed to fnSetVariableIntEnum().
    /// 
    /// @param id             Metadata ID (0 to fnGetMetadataCount()-1).
    /// @param variableIndex  Index of the enum variable (0-based, up to fnGetMetadataVariableCount()-1).
    /// @param enumIndex      Index of the enum option (0-based, up to fnGetMetadataEnumCount()-1).
    /// @return Enum option name string, or an error string if any index is invalid.
    /// ```
    public static MemorySegment ngetMetadataEnumName(
    	int id,
    	int variableIndex,
    	int enumIndex
    ) {
    	MethodHandle method = FN_GET_METADATA_ENUM_NAME.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			id,
    			variableIndex,
    			enumIndex
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ngetMetadataEnumName].
    public static @Nullable String getMetadataEnumName(
    	int id,
    	int variableIndex,
    	int enumIndex
    ) {
    	MemorySegment segment = ngetMetadataEnumName(
    		id,
    		variableIndex,
    		enumIndex
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment.getString(0);
    }
    
    /// ```
    /// @brief Set a float variable on a node instance.
    /// 
    /// Only valid for variables of type EFloat (see fnGetMetadataVariableType()).
    /// 
    /// @param node           Node handle created by fnNewFromMetadata() or fnNewFromEncodedNodeTree().
    /// @param variableIndex  Index of the variable to set (0-based, up to fnGetMetadataVariableCount()-1).
    /// @param value          Float value to set.
    /// @return true on success, false if the variable index is out of range or the node type is incorrect.
    /// ```
    public static boolean setVariableFloat(
    	MemorySegment node,
    	int variableIndex,
    	float value
    ) {
    	MethodHandle method = FN_SET_VARIABLE_FLOAT.get();
    	try {
    		return (boolean) method.invokeExact(
    			node,
    			variableIndex,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// @brief Set an int or enum variable on a node instance.
    /// 
    /// Valid for variables of type EInt or EEnum (see fnGetMetadataVariableType()).
    /// For enum variables, the value corresponds to the enum option index
    /// (0 to fnGetMetadataEnumCount()-1).
    /// 
    /// @param node           Node handle created by fnNewFromMetadata() or fnNewFromEncodedNodeTree().
    /// @param variableIndex  Index of the variable to set (0-based, up to fnGetMetadataVariableCount()-1).
    /// @param value          Integer or enum index value to set.
    /// @return true on success, false if the variable index is out of range or the node type is incorrect.
    /// ```
    public static boolean setVariableIntEnum(
    	MemorySegment node,
    	int variableIndex,
    	int value
    ) {
    	MethodHandle method = FN_SET_VARIABLE_INT_ENUM.get();
    	try {
    		return (boolean) method.invokeExact(
    			node,
    			variableIndex,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// @brief Get the number of required node lookup (source) inputs on a node type.
    /// 
    /// Node lookups are generator source inputs that MUST be connected to another node
    /// for the owning node to function (e.g. the "Source" input on a Fractal node).
    /// Use with fnGetMetadataNodeLookupName() and fnSetNodeLookup() to query and wire sources.
    /// 
    /// @param id  Metadata ID (0 to fnGetMetadataCount()-1).
    /// @return Number of node lookup inputs, or -1 if the ID is invalid.
    /// ```
    public static int getMetadataNodeLookupCount(
    	int id
    ) {
    	MethodHandle method = FN_GET_METADATA_NODE_LOOKUP_COUNT.get();
    	try {
    		return (int) method.invokeExact(
    			id
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// @brief Get the name of a node lookup input on a node type.
    /// 
    /// Returns the display name of a required generator source input (e.g. "Source", "Warp").
    /// 
    /// @param id               Metadata ID (0 to fnGetMetadataCount()-1).
    /// @param nodeLookupIndex  Index into the node lookups list (0-based, up to fnGetMetadataNodeLookupCount()-1).
    /// @return Node lookup name string, or an error string if either index is invalid.
    /// ```
    public static MemorySegment ngetMetadataNodeLookupName(
    	int id,
    	int nodeLookupIndex
    ) {
    	MethodHandle method = FN_GET_METADATA_NODE_LOOKUP_NAME.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			id,
    			nodeLookupIndex
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ngetMetadataNodeLookupName].
    public static @Nullable String getMetadataNodeLookupName(
    	int id,
    	int nodeLookupIndex
    ) {
    	MemorySegment segment = ngetMetadataNodeLookupName(
    		id,
    		nodeLookupIndex
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment.getString(0);
    }
    
    /// ```
    /// @brief Get the dimension index for a per-dimension node lookup.
    /// 
    /// Some nodes have source inputs registered once per dimension (e.g. per-axis warp sources).
    /// These share the same base name but differ in their dimension index (0=X, 1=Y, 2=Z, 3=W).
    /// Non-per-dimension node lookups return -1.
    /// 
    /// @param id               Metadata ID (0 to fnGetMetadataCount()-1).
    /// @param nodeLookupIndex  Index into the node lookups list (0-based, up to fnGetMetadataNodeLookupCount()-1).
    /// @return Dimension index (0=X, 1=Y, 2=Z, 3=W), or -1 if not a per-dimension lookup or if either index is invalid.
    /// ```
    public static int getMetadataNodeLookupDimensionIdx(
    	int id,
    	int nodeLookupIndex
    ) {
    	MethodHandle method = FN_GET_METADATA_NODE_LOOKUP_DIMENSION_IDX.get();
    	try {
    		return (int) method.invokeExact(
    			id,
    			nodeLookupIndex
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// @brief Connect a source node to a node lookup input.
    /// 
    /// Wires a generator node as the source for a required input on the target node.
    /// For example, connecting a Simplex node as the "Source" of a FractalFBm node.
    /// 
    /// @param node             Target node handle.
    /// @param nodeLookupIndex  Index of the node lookup to set (0-based, up to fnGetMetadataNodeLookupCount()-1).
    /// @param nodeLookup       Source node handle to connect.
    /// @return true on success, false if the index is out of range or the types are incompatible.
    /// ```
    public static boolean setNodeLookup(
    	MemorySegment node,
    	int nodeLookupIndex,
    	MemorySegment nodeLookup
    ) {
    	MethodHandle method = FN_SET_NODE_LOOKUP.get();
    	try {
    		return (boolean) method.invokeExact(
    			node,
    			nodeLookupIndex,
    			nodeLookup
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// @brief Get the number of hybrid (constant or node) inputs on a node type.
    /// 
    /// Hybrid inputs accept either a constant float value or a generator node as their source.
    /// When a generator node is connected it takes priority over the constant value, allowing
    /// parameters like fractal gain or warp amplitude to be driven by another noise source
    /// for spatial variation.
    /// 
    /// Use with fnGetMetadataHybridName(), fnSetHybridFloat(), and fnSetHybridNodeLookup().
    /// 
    /// @param id  Metadata ID (0 to fnGetMetadataCount()-1).
    /// @return Number of hybrid inputs, or -1 if the ID is invalid.
    /// ```
    public static int getMetadataHybridCount(
    	int id
    ) {
    	MethodHandle method = FN_GET_METADATA_HYBRID_COUNT.get();
    	try {
    		return (int) method.invokeExact(
    			id
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// @brief Get the name of a hybrid input on a node type.
    /// 
    /// Returns the display name of a hybrid (constant or node) input (e.g. "Gain", "Amplitude").
    /// 
    /// @param id          Metadata ID (0 to fnGetMetadataCount()-1).
    /// @param hybridIndex Index into the hybrids list (0-based, up to fnGetMetadataHybridCount()-1).
    /// @return Hybrid input name string, or an error string if either index is invalid.
    /// ```
    public static MemorySegment ngetMetadataHybridName(
    	int id,
    	int hybridIndex
    ) {
    	MethodHandle method = FN_GET_METADATA_HYBRID_NAME.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			id,
    			hybridIndex
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ngetMetadataHybridName].
    public static @Nullable String getMetadataHybridName(
    	int id,
    	int hybridIndex
    ) {
    	MemorySegment segment = ngetMetadataHybridName(
    		id,
    		hybridIndex
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment.getString(0);
    }
    
    /// ```
    /// @brief Get the dimension index for a per-dimension hybrid input.
    /// 
    /// Some nodes have hybrid inputs registered once per dimension (e.g. per-axis scale).
    /// These share the same base name but differ in their dimension index (0=X, 1=Y, 2=Z, 3=W).
    /// Non-per-dimension hybrids return -1.
    /// 
    /// @param id          Metadata ID (0 to fnGetMetadataCount()-1).
    /// @param hybridIndex Index into the hybrids list (0-based, up to fnGetMetadataHybridCount()-1).
    /// @return Dimension index (0=X, 1=Y, 2=Z, 3=W), or -1 if not a per-dimension hybrid or if either index is invalid.
    /// ```
    public static int getMetadataHybridDimensionIdx(
    	int id,
    	int hybridIndex
    ) {
    	MethodHandle method = FN_GET_METADATA_HYBRID_DIMENSION_IDX.get();
    	try {
    		return (int) method.invokeExact(
    			id,
    			hybridIndex
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// @brief Connect a generator node to a hybrid input (overrides the constant value).
    /// 
    /// When a generator node is connected, it provides spatially varying values instead
    /// of the constant set by fnSetHybridFloat(). To revert to the constant value
    /// pass NULL as the nodeLookup parameter.
    /// 
    /// @param node         Target node handle.
    /// @param hybridIndex  Index of the hybrid input (0-based, up to fnGetMetadataHybridCount()-1).
    /// @param nodeLookup   Source node handle to connect.
    /// @return true on success, false if the index is out of range or the types are incompatible.
    /// ```
    public static boolean setHybridNodeLookup(
    	MemorySegment node,
    	int hybridIndex,
    	MemorySegment nodeLookup
    ) {
    	MethodHandle method = FN_SET_HYBRID_NODE_LOOKUP.get();
    	try {
    		return (boolean) method.invokeExact(
    			node,
    			hybridIndex,
    			nodeLookup
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// @brief Set the constant float value on a hybrid input.
    /// 
    /// Sets the constant value used when no generator node is connected to this hybrid input.
    /// If a generator node is connected via fnSetHybridNodeLookup(), it takes priority
    /// over this constant value.
    /// 
    /// @param node         Target node handle.
    /// @param hybridIndex  Index of the hybrid input (0-based, up to fnGetMetadataHybridCount()-1).
    /// @param value        Constant float value to set.
    /// @return true on success, false if the index is out of range or the node type is incorrect.
    /// ```
    public static boolean setHybridFloat(
    	MemorySegment node,
    	int hybridIndex,
    	float value
    ) {
    	MethodHandle method = FN_SET_HYBRID_FLOAT.get();
    	try {
    		return (boolean) method.invokeExact(
    			node,
    			hybridIndex,
    			value
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// @brief Get the human-readable description of a node type.
    /// 
    /// Returns the description string from the node's metadata, which explains the
    /// node's behaviour. These descriptions are the same as those shown in the Node
    /// Editor UI and used to populate the wiki Node reference pages.
    /// 
    /// @param id  Metadata ID (0 to fnGetMetadataCount()-1).
    /// @return Description string, or an error string if the ID is invalid.
    /// ```
    public static MemorySegment ngetMetadataDescription(
    	int id
    ) {
    	MethodHandle method = FN_GET_METADATA_DESCRIPTION.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			id
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ngetMetadataDescription].
    public static @Nullable String getMetadataDescription(
    	int id
    ) {
    	MemorySegment segment = ngetMetadataDescription(
    		id
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment.getString(0);
    }
    
    /// ```
    /// @brief Get the number of category groups a node type belongs to.
    /// 
    /// Nodes are organised into a hierarchy of groups (e.g. "Coherent Noise", "Fractal").
    /// Use this with fnGetMetadataGroupName() to reconstruct the full group path.
    /// 
    /// @param id  Metadata ID (0 to fnGetMetadataCount()-1).
    /// @return Number of groups, or -1 if the ID is invalid or the node has no groups.
    /// ```
    public static int getMetadataGroupCount(
    	int id
    ) {
    	MethodHandle method = FN_GET_METADATA_GROUP_COUNT.get();
    	try {
    		return (int) method.invokeExact(
    			id
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// @brief Get the name of a category group for a node type.
    /// 
    /// Groups form a hierarchical path. For example, a node with two groups
    /// ["Coherent Noise", "Fractal"] would have groupIndex 0 = "Coherent Noise"
    /// and groupIndex 1 = "Fractal".
    /// 
    /// @param id          Metadata ID (0 to fnGetMetadataCount()-1).
    /// @param groupIndex  Index of the group (0-based, up to fnGetMetadataGroupCount()-1).
    /// @return Group name string, or an error string if either index is invalid.
    /// ```
    public static MemorySegment ngetMetadataGroupName(
    	int id,
    	int groupIndex
    ) {
    	MethodHandle method = FN_GET_METADATA_GROUP_NAME.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			id,
    			groupIndex
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ngetMetadataGroupName].
    public static @Nullable String getMetadataGroupName(
    	int id,
    	int groupIndex
    ) {
    	MemorySegment segment = ngetMetadataGroupName(
    		id,
    		groupIndex
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment.getString(0);
    }
    
    /// ```
    /// @brief Get the human-readable description of a variable on a node type.
    /// 
    /// Returns the description string for a member variable, as shown in the Node
    /// Editor UI tooltips and used to populate the wiki Node reference pages.
    /// 
    /// @param id             Metadata ID (0 to fnGetMetadataCount()-1).
    /// @param variableIndex  Index into the variables list (0-based).
    /// @return Description string, or an error string if either index is invalid.
    /// ```
    public static MemorySegment ngetMetadataVariableDescription(
    	int id,
    	int variableIndex
    ) {
    	MethodHandle method = FN_GET_METADATA_VARIABLE_DESCRIPTION.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			id,
    			variableIndex
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ngetMetadataVariableDescription].
    public static @Nullable String getMetadataVariableDescription(
    	int id,
    	int variableIndex
    ) {
    	MemorySegment segment = ngetMetadataVariableDescription(
    		id,
    		variableIndex
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment.getString(0);
    }
    
    /// ```
    /// @brief Get the default float value of a variable on a node type.
    /// 
    /// Only meaningful for variables of type EFloat (see fnGetMetadataVariableType()).
    /// For int/enum variables, use fnGetMetadataVariableDefaultInt() instead.
    /// 
    /// @param id             Metadata ID (0 to fnGetMetadataCount()-1).
    /// @param variableIndex  Index into the variables list (0-based).
    /// @return Default float value, or 0 if either index is invalid.
    /// ```
    public static float getMetadataVariableDefaultFloat(
    	int id,
    	int variableIndex
    ) {
    	MethodHandle method = FN_GET_METADATA_VARIABLE_DEFAULT_FLOAT.get();
    	try {
    		return (float) method.invokeExact(
    			id,
    			variableIndex
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// @brief Get the default int/enum value of a variable on a node type.
    /// 
    /// Only meaningful for variables of type EInt or EEnum (see fnGetMetadataVariableType()).
    /// For float variables, use fnGetMetadataVariableDefaultFloat() instead.
    /// 
    /// @param id             Metadata ID (0 to fnGetMetadataCount()-1).
    /// @param variableIndex  Index into the variables list (0-based).
    /// @return Default int value, or 0 if either index is invalid.
    /// ```
    public static int getMetadataVariableDefaultIntEnum(
    	int id,
    	int variableIndex
    ) {
    	MethodHandle method = FN_GET_METADATA_VARIABLE_DEFAULT_INT_ENUM.get();
    	try {
    		return (int) method.invokeExact(
    			id,
    			variableIndex
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// @brief Get the minimum allowed float value of a variable on a node type.
    /// 
    /// Returns the lower bound for float variables, used for UI clamping and validation.
    /// Only meaningful for variables of type EFloat (see fnGetMetadataVariableType()).
    /// 
    /// @param id             Metadata ID (0 to fnGetMetadataCount()-1).
    /// @param variableIndex  Index into the variables list (0-based).
    /// @return Minimum float value, or 0 if either index is invalid.
    /// ```
    public static float getMetadataVariableMinFloat(
    	int id,
    	int variableIndex
    ) {
    	MethodHandle method = FN_GET_METADATA_VARIABLE_MIN_FLOAT.get();
    	try {
    		return (float) method.invokeExact(
    			id,
    			variableIndex
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// @brief Get the maximum allowed float value of a variable on a node type.
    /// 
    /// Returns the upper bound for float variables, used for UI clamping and validation.
    /// Only meaningful for variables of type EFloat (see fnGetMetadataVariableType()).
    /// 
    /// @param id             Metadata ID (0 to fnGetMetadataCount()-1).
    /// @param variableIndex  Index into the variables list (0-based).
    /// @return Maximum float value, or 0 if either index is invalid.
    /// ```
    public static float getMetadataVariableMaxFloat(
    	int id,
    	int variableIndex
    ) {
    	MethodHandle method = FN_GET_METADATA_VARIABLE_MAX_FLOAT.get();
    	try {
    		return (float) method.invokeExact(
    			id,
    			variableIndex
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// @brief Get the human-readable description of a node lookup input on a node type.
    /// 
    /// Returns the description string for a required generator source input, as shown
    /// in the Node Editor UI tooltips and used to populate the wiki Node reference pages.
    /// 
    /// @param id               Metadata ID (0 to fnGetMetadataCount()-1).
    /// @param nodeLookupIndex  Index into the node lookups list (0-based).
    /// @return Description string, or an error string if either index is invalid.
    /// ```
    public static MemorySegment ngetMetadataNodeLookupDescription(
    	int id,
    	int nodeLookupIndex
    ) {
    	MethodHandle method = FN_GET_METADATA_NODE_LOOKUP_DESCRIPTION.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			id,
    			nodeLookupIndex
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ngetMetadataNodeLookupDescription].
    public static @Nullable String getMetadataNodeLookupDescription(
    	int id,
    	int nodeLookupIndex
    ) {
    	MemorySegment segment = ngetMetadataNodeLookupDescription(
    		id,
    		nodeLookupIndex
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment.getString(0);
    }
    
    /// ```
    /// @brief Get the human-readable description of a hybrid input on a node type.
    /// 
    /// Returns the description string for a hybrid (constant or node) input, as shown
    /// in the Node Editor UI tooltips and used to populate the wiki Node reference pages.
    /// 
    /// @param id          Metadata ID (0 to fnGetMetadataCount()-1).
    /// @param hybridIndex Index into the hybrids list (0-based).
    /// @return Description string, or an error string if either index is invalid.
    /// ```
    public static MemorySegment ngetMetadataHybridDescription(
    	int id,
    	int hybridIndex
    ) {
    	MethodHandle method = FN_GET_METADATA_HYBRID_DESCRIPTION.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			id,
    			hybridIndex
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#ngetMetadataHybridDescription].
    public static @Nullable String getMetadataHybridDescription(
    	int id,
    	int hybridIndex
    ) {
    	MemorySegment segment = ngetMetadataHybridDescription(
    		id,
    		hybridIndex
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment.getString(0);
    }
    
    /// ```
    /// @brief Get the default constant float value of a hybrid input on a node type.
    /// @param id          Metadata ID (0 to fnGetMetadataCount()-1).
    /// @param hybridIndex Index into the hybrids list (0-based).
    /// @return Default float value, or 0 if either index is invalid.
    /// ```
    public static float getMetadataHybridDefault(
    	int id,
    	int hybridIndex
    ) {
    	MethodHandle method = FN_GET_METADATA_HYBRID_DEFAULT.get();
    	try {
    		return (float) method.invokeExact(
    			id,
    			hybridIndex
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
}