/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.meshoptimizer;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.MethodHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeByteArray;
import volucris.bindings.core.NativeFloatArray;
import volucris.bindings.core.NativeIntArray;
import volucris.bindings.core.NativeStructArray;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class Meshoptimizer {

	private static final LazyConstant<MethodHandle> MESHOPT_GENERATE_VERTEX_REMAP;
	private static final LazyConstant<MethodHandle> MESHOPT_GENERATE_VERTEX_REMAP_MULTI;
	private static final LazyConstant<MethodHandle> MESHOPT_GENERATE_VERTEX_REMAP_CUSTOM;
	private static final LazyConstant<MethodHandle> MESHOPT_REMAP_VERTEX_BUFFER;
	private static final LazyConstant<MethodHandle> MESHOPT_REMAP_INDEX_BUFFER;
	private static final LazyConstant<MethodHandle> MESHOPT_FILTER_INDEX_BUFFER;
	private static final LazyConstant<MethodHandle> MESHOPT_FILTER_INDEX_BUFFER_MULTI;
	private static final LazyConstant<MethodHandle> MESHOPT_GENERATE_SHADOW_INDEX_BUFFER;
	private static final LazyConstant<MethodHandle> MESHOPT_GENERATE_SHADOW_INDEX_BUFFER_MULTI;
	private static final LazyConstant<MethodHandle> MESHOPT_GENERATE_POSITION_REMAP;
	private static final LazyConstant<MethodHandle> MESHOPT_GENERATE_ADJACENCY_INDEX_BUFFER;
	private static final LazyConstant<MethodHandle> MESHOPT_GENERATE_TESSELLATION_INDEX_BUFFER;
	private static final LazyConstant<MethodHandle> MESHOPT_GENERATE_PROVOKING_INDEX_BUFFER;
	private static final LazyConstant<MethodHandle> MESHOPT_OPTIMIZE_VERTEX_CACHE;
	private static final LazyConstant<MethodHandle> MESHOPT_OPTIMIZE_VERTEX_CACHE_STRIP;
	private static final LazyConstant<MethodHandle> MESHOPT_OPTIMIZE_VERTEX_CACHE_FIFO;
	private static final LazyConstant<MethodHandle> MESHOPT_OPTIMIZE_OVERDRAW;
	private static final LazyConstant<MethodHandle> MESHOPT_OPTIMIZE_VERTEX_FETCH;
	private static final LazyConstant<MethodHandle> MESHOPT_OPTIMIZE_VERTEX_FETCH_REMAP;
	private static final LazyConstant<MethodHandle> MESHOPT_ENCODE_INDEX_BUFFER;
	private static final LazyConstant<MethodHandle> MESHOPT_ENCODE_INDEX_BUFFER_BOUND;
	private static final LazyConstant<MethodHandle> MESHOPT_ENCODE_INDEX_VERSION;
	private static final LazyConstant<MethodHandle> MESHOPT_DECODE_INDEX_BUFFER;
	private static final LazyConstant<MethodHandle> MESHOPT_DECODE_INDEX_VERSION;
	private static final LazyConstant<MethodHandle> MESHOPT_ENCODE_INDEX_SEQUENCE;
	private static final LazyConstant<MethodHandle> MESHOPT_ENCODE_INDEX_SEQUENCE_BOUND;
	private static final LazyConstant<MethodHandle> MESHOPT_DECODE_INDEX_SEQUENCE;
	private static final LazyConstant<MethodHandle> MESHOPT_ENCODE_MESHLET;
	private static final LazyConstant<MethodHandle> MESHOPT_ENCODE_MESHLET_BOUND;
	private static final LazyConstant<MethodHandle> MESHOPT_DECODE_MESHLET;
	private static final LazyConstant<MethodHandle> MESHOPT_DECODE_MESHLET_RAW;
	private static final LazyConstant<MethodHandle> MESHOPT_ENCODE_VERTEX_BUFFER;
	private static final LazyConstant<MethodHandle> MESHOPT_ENCODE_VERTEX_BUFFER_BOUND;
	private static final LazyConstant<MethodHandle> MESHOPT_ENCODE_VERTEX_BUFFER_LEVEL;
	private static final LazyConstant<MethodHandle> MESHOPT_ENCODE_VERTEX_VERSION;
	private static final LazyConstant<MethodHandle> MESHOPT_DECODE_VERTEX_BUFFER;
	private static final LazyConstant<MethodHandle> MESHOPT_DECODE_VERTEX_VERSION;
	private static final LazyConstant<MethodHandle> MESHOPT_DECODE_FILTER_OCT;
	private static final LazyConstant<MethodHandle> MESHOPT_DECODE_FILTER_QUAT;
	private static final LazyConstant<MethodHandle> MESHOPT_DECODE_FILTER_EXP;
	private static final LazyConstant<MethodHandle> MESHOPT_DECODE_FILTER_COLOR;
	private static final LazyConstant<MethodHandle> MESHOPT_ENCODE_FILTER_OCT;
	private static final LazyConstant<MethodHandle> MESHOPT_ENCODE_FILTER_QUAT;
	private static final LazyConstant<MethodHandle> MESHOPT_ENCODE_FILTER_EXP;
	private static final LazyConstant<MethodHandle> MESHOPT_ENCODE_FILTER_COLOR;
	private static final LazyConstant<MethodHandle> MESHOPT_SIMPLIFY;
	private static final LazyConstant<MethodHandle> MESHOPT_SIMPLIFY_WITH_ATTRIBUTES;
	private static final LazyConstant<MethodHandle> MESHOPT_SIMPLIFY_WITH_UPDATE;
	private static final LazyConstant<MethodHandle> MESHOPT_SIMPLIFY_SLOPPY;
	private static final LazyConstant<MethodHandle> MESHOPT_SIMPLIFY_PRUNE;
	private static final LazyConstant<MethodHandle> MESHOPT_SIMPLIFY_POINTS;
	private static final LazyConstant<MethodHandle> MESHOPT_SIMPLIFY_SCALE;
	private static final LazyConstant<MethodHandle> MESHOPT_STRIPIFY;
	private static final LazyConstant<MethodHandle> MESHOPT_STRIPIFY_BOUND;
	private static final LazyConstant<MethodHandle> MESHOPT_UNSTRIPIFY;
	private static final LazyConstant<MethodHandle> MESHOPT_UNSTRIPIFY_BOUND;
	private static final LazyConstant<MethodHandle> MESHOPT_ANALYZE_VERTEX_CACHE;
	private static final LazyConstant<MethodHandle> MESHOPT_ANALYZE_VERTEX_FETCH;
	private static final LazyConstant<MethodHandle> MESHOPT_ANALYZE_OVERDRAW;
	private static final LazyConstant<MethodHandle> MESHOPT_ANALYZE_COVERAGE;
	private static final LazyConstant<MethodHandle> MESHOPT_BUILD_MESHLETS;
	private static final LazyConstant<MethodHandle> MESHOPT_BUILD_MESHLETS_SCAN;
	private static final LazyConstant<MethodHandle> MESHOPT_BUILD_MESHLETS_BOUND;
	private static final LazyConstant<MethodHandle> MESHOPT_BUILD_MESHLETS_FLEX;
	private static final LazyConstant<MethodHandle> MESHOPT_BUILD_MESHLETS_SPATIAL;
	private static final LazyConstant<MethodHandle> MESHOPT_OPTIMIZE_MESHLET;
	private static final LazyConstant<MethodHandle> MESHOPT_OPTIMIZE_MESHLET_LEVEL;
	private static final LazyConstant<MethodHandle> MESHOPT_COMPUTE_CLUSTER_BOUNDS;
	private static final LazyConstant<MethodHandle> MESHOPT_COMPUTE_MESHLET_BOUNDS;
	private static final LazyConstant<MethodHandle> MESHOPT_COMPUTE_SPHERE_BOUNDS;
	private static final LazyConstant<MethodHandle> MESHOPT_EXTRACT_MESHLET_INDICES;
	private static final LazyConstant<MethodHandle> MESHOPT_PARTITION_CLUSTERS;
	private static final LazyConstant<MethodHandle> MESHOPT_SPATIAL_SORT_REMAP;
	private static final LazyConstant<MethodHandle> MESHOPT_SPATIAL_SORT_TRIANGLES;
	private static final LazyConstant<MethodHandle> MESHOPT_SPATIAL_CLUSTER_POINTS;
	private static final LazyConstant<MethodHandle> MESHOPT_OPACITY_MAP_MEASURE;
	private static final LazyConstant<MethodHandle> MESHOPT_OPACITY_MAP_RASTERIZE;
	private static final LazyConstant<MethodHandle> MESHOPT_OPACITY_MAP_ENTRY_SIZE;
	private static final LazyConstant<MethodHandle> MESHOPT_OPACITY_MAP_COMPACT;
	private static final LazyConstant<MethodHandle> MESHOPT_GENERATE_TANGENTS;
	private static final LazyConstant<MethodHandle> MESHOPT_GENERATE_NORMALS;
	private static final LazyConstant<MethodHandle> MESHOPT_REMESH;
	private static final LazyConstant<MethodHandle> MESHOPT_QUANTIZE_HALF;
	private static final LazyConstant<MethodHandle> MESHOPT_QUANTIZE_FLOAT;
	private static final LazyConstant<MethodHandle> MESHOPT_DEQUANTIZE_HALF;
	private static final LazyConstant<MethodHandle> MESHOPT_COMPUTE_POSITION_EXPONENT;
	private static final LazyConstant<MethodHandle> MESHOPT_SET_ALLOCATOR;

	static {
		//@formatter:off
		MESHOPT_GENERATE_VERTEX_REMAP = downcallHandle("meshopt_generateVertexRemap", JAVA_LONG, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG);
		MESHOPT_GENERATE_VERTEX_REMAP_MULTI = downcallHandle("meshopt_generateVertexRemapMulti", JAVA_LONG, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG, UNBOUNDED_ADDRESS, JAVA_LONG);
		MESHOPT_GENERATE_VERTEX_REMAP_CUSTOM = downcallHandle("meshopt_generateVertexRemapCustom", JAVA_LONG, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		MESHOPT_REMAP_VERTEX_BUFFER = downcallHandleVoid("meshopt_remapVertexBuffer", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG, UNBOUNDED_ADDRESS);
		MESHOPT_REMAP_INDEX_BUFFER = downcallHandleVoid("meshopt_remapIndexBuffer", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS);
		MESHOPT_FILTER_INDEX_BUFFER = downcallHandle("meshopt_filterIndexBuffer", JAVA_LONG, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG, JAVA_LONG);
		MESHOPT_FILTER_INDEX_BUFFER_MULTI = downcallHandle("meshopt_filterIndexBufferMulti", JAVA_LONG, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG, UNBOUNDED_ADDRESS, JAVA_LONG);
		MESHOPT_GENERATE_SHADOW_INDEX_BUFFER = downcallHandleVoid("meshopt_generateShadowIndexBuffer", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG, JAVA_LONG);
		MESHOPT_GENERATE_SHADOW_INDEX_BUFFER_MULTI = downcallHandleVoid("meshopt_generateShadowIndexBufferMulti", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG, UNBOUNDED_ADDRESS, JAVA_LONG);
		MESHOPT_GENERATE_POSITION_REMAP = downcallHandleVoid("meshopt_generatePositionRemap", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG);
		MESHOPT_GENERATE_ADJACENCY_INDEX_BUFFER = downcallHandleVoid("meshopt_generateAdjacencyIndexBuffer", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG);
		MESHOPT_GENERATE_TESSELLATION_INDEX_BUFFER = downcallHandleVoid("meshopt_generateTessellationIndexBuffer", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG);
		MESHOPT_GENERATE_PROVOKING_INDEX_BUFFER = downcallHandle("meshopt_generateProvokingIndexBuffer", JAVA_LONG, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG);
		MESHOPT_OPTIMIZE_VERTEX_CACHE = downcallHandleVoid("meshopt_optimizeVertexCache", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG);
		MESHOPT_OPTIMIZE_VERTEX_CACHE_STRIP = downcallHandleVoid("meshopt_optimizeVertexCacheStrip", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG);
		MESHOPT_OPTIMIZE_VERTEX_CACHE_FIFO = downcallHandleVoid("meshopt_optimizeVertexCacheFifo", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG, JAVA_INT);
		MESHOPT_OPTIMIZE_OVERDRAW = downcallHandleVoid("meshopt_optimizeOverdraw", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG, JAVA_FLOAT);
		MESHOPT_OPTIMIZE_VERTEX_FETCH = downcallHandle("meshopt_optimizeVertexFetch", JAVA_LONG, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG);
		MESHOPT_OPTIMIZE_VERTEX_FETCH_REMAP = downcallHandle("meshopt_optimizeVertexFetchRemap", JAVA_LONG, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG);
		MESHOPT_ENCODE_INDEX_BUFFER = downcallHandle("meshopt_encodeIndexBuffer", JAVA_LONG, UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS, JAVA_LONG);
		MESHOPT_ENCODE_INDEX_BUFFER_BOUND = downcallHandle("meshopt_encodeIndexBufferBound", JAVA_LONG, JAVA_LONG, JAVA_LONG);
		MESHOPT_ENCODE_INDEX_VERSION = downcallHandleVoid("meshopt_encodeIndexVersion", JAVA_INT);
		MESHOPT_DECODE_INDEX_BUFFER = downcallHandle("meshopt_decodeIndexBuffer", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG, UNBOUNDED_ADDRESS, JAVA_LONG);
		MESHOPT_DECODE_INDEX_VERSION = downcallHandle("meshopt_decodeIndexVersion", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_LONG);
		MESHOPT_ENCODE_INDEX_SEQUENCE = downcallHandle("meshopt_encodeIndexSequence", JAVA_LONG, UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS, JAVA_LONG);
		MESHOPT_ENCODE_INDEX_SEQUENCE_BOUND = downcallHandle("meshopt_encodeIndexSequenceBound", JAVA_LONG, JAVA_LONG, JAVA_LONG);
		MESHOPT_DECODE_INDEX_SEQUENCE = downcallHandle("meshopt_decodeIndexSequence", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG, UNBOUNDED_ADDRESS, JAVA_LONG);
		MESHOPT_ENCODE_MESHLET = downcallHandle("meshopt_encodeMeshlet", JAVA_LONG, UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS, JAVA_LONG);
		MESHOPT_ENCODE_MESHLET_BOUND = downcallHandle("meshopt_encodeMeshletBound", JAVA_LONG, JAVA_LONG, JAVA_LONG);
		MESHOPT_DECODE_MESHLET = downcallHandle("meshopt_decodeMeshlet", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG, UNBOUNDED_ADDRESS, JAVA_LONG);
		MESHOPT_DECODE_MESHLET_RAW = downcallHandle("meshopt_decodeMeshletRaw", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS, JAVA_LONG);
		MESHOPT_ENCODE_VERTEX_BUFFER = downcallHandle("meshopt_encodeVertexBuffer", JAVA_LONG, UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG);
		MESHOPT_ENCODE_VERTEX_BUFFER_BOUND = downcallHandle("meshopt_encodeVertexBufferBound", JAVA_LONG, JAVA_LONG, JAVA_LONG);
		MESHOPT_ENCODE_VERTEX_BUFFER_LEVEL = downcallHandle("meshopt_encodeVertexBufferLevel", JAVA_LONG, UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG, JAVA_INT, JAVA_INT);
		MESHOPT_ENCODE_VERTEX_VERSION = downcallHandleVoid("meshopt_encodeVertexVersion", JAVA_INT);
		MESHOPT_DECODE_VERTEX_BUFFER = downcallHandle("meshopt_decodeVertexBuffer", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG, UNBOUNDED_ADDRESS, JAVA_LONG);
		MESHOPT_DECODE_VERTEX_VERSION = downcallHandle("meshopt_decodeVertexVersion", JAVA_INT, UNBOUNDED_ADDRESS, JAVA_LONG);
		MESHOPT_DECODE_FILTER_OCT = downcallHandleVoid("meshopt_decodeFilterOct", UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG);
		MESHOPT_DECODE_FILTER_QUAT = downcallHandleVoid("meshopt_decodeFilterQuat", UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG);
		MESHOPT_DECODE_FILTER_EXP = downcallHandleVoid("meshopt_decodeFilterExp", UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG);
		MESHOPT_DECODE_FILTER_COLOR = downcallHandleVoid("meshopt_decodeFilterColor", UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG);
		MESHOPT_ENCODE_FILTER_OCT = downcallHandleVoid("meshopt_encodeFilterOct", UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG, JAVA_INT, UNBOUNDED_ADDRESS);
		MESHOPT_ENCODE_FILTER_QUAT = downcallHandleVoid("meshopt_encodeFilterQuat", UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG, JAVA_INT, UNBOUNDED_ADDRESS);
		MESHOPT_ENCODE_FILTER_EXP = downcallHandleVoid("meshopt_encodeFilterExp", UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG, JAVA_INT, UNBOUNDED_ADDRESS, JAVA_INT);
		MESHOPT_ENCODE_FILTER_COLOR = downcallHandleVoid("meshopt_encodeFilterColor", UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG, JAVA_INT, UNBOUNDED_ADDRESS);
		MESHOPT_SIMPLIFY = downcallHandle("meshopt_simplify", JAVA_LONG, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_FLOAT, JAVA_INT, UNBOUNDED_ADDRESS);
		MESHOPT_SIMPLIFY_WITH_ATTRIBUTES = downcallHandle("meshopt_simplifyWithAttributes", JAVA_LONG, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG, UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_FLOAT, JAVA_INT, UNBOUNDED_ADDRESS);
		MESHOPT_SIMPLIFY_WITH_UPDATE = downcallHandle("meshopt_simplifyWithUpdate", JAVA_LONG, UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG, UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_FLOAT, JAVA_INT, UNBOUNDED_ADDRESS);
		MESHOPT_SIMPLIFY_SLOPPY = downcallHandle("meshopt_simplifySloppy", JAVA_LONG, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_FLOAT, UNBOUNDED_ADDRESS);
		MESHOPT_SIMPLIFY_PRUNE = downcallHandle("meshopt_simplifyPrune", JAVA_LONG, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG, JAVA_FLOAT);
		MESHOPT_SIMPLIFY_POINTS = downcallHandle("meshopt_simplifyPoints", JAVA_LONG, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_FLOAT, JAVA_LONG);
		MESHOPT_SIMPLIFY_SCALE = downcallHandle("meshopt_simplifyScale", JAVA_FLOAT, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG);
		MESHOPT_STRIPIFY = downcallHandle("meshopt_stripify", JAVA_LONG, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG, JAVA_INT);
		MESHOPT_STRIPIFY_BOUND = downcallHandle("meshopt_stripifyBound", JAVA_LONG, JAVA_LONG);
		MESHOPT_UNSTRIPIFY = downcallHandle("meshopt_unstripify", JAVA_LONG, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_INT);
		MESHOPT_UNSTRIPIFY_BOUND = downcallHandle("meshopt_unstripifyBound", JAVA_LONG, JAVA_LONG);
		MESHOPT_ANALYZE_VERTEX_CACHE = downcallHandle("meshopt_analyzeVertexCache", MeshoptVertexCacheStatistics.LAYOUT, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG, JAVA_INT, JAVA_INT, JAVA_INT);
		MESHOPT_ANALYZE_VERTEX_FETCH = downcallHandle("meshopt_analyzeVertexFetch", MeshoptVertexFetchStatistics.LAYOUT, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG, JAVA_LONG);
		MESHOPT_ANALYZE_OVERDRAW = downcallHandle("meshopt_analyzeOverdraw", MeshoptOverdrawStatistics.LAYOUT, UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG);
		MESHOPT_ANALYZE_COVERAGE = downcallHandle("meshopt_analyzeCoverage", MeshoptCoverageStatistics.LAYOUT, UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG);
		MESHOPT_BUILD_MESHLETS = downcallHandle("meshopt_buildMeshlets", JAVA_LONG, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_FLOAT);
		MESHOPT_BUILD_MESHLETS_SCAN = downcallHandle("meshopt_buildMeshletsScan", JAVA_LONG, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG);
		MESHOPT_BUILD_MESHLETS_BOUND = downcallHandle("meshopt_buildMeshletsBound", JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG);
		MESHOPT_BUILD_MESHLETS_FLEX = downcallHandle("meshopt_buildMeshletsFlex", JAVA_LONG, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_FLOAT, JAVA_FLOAT);
		MESHOPT_BUILD_MESHLETS_SPATIAL = downcallHandle("meshopt_buildMeshletsSpatial", JAVA_LONG, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_LONG, JAVA_FLOAT);
		MESHOPT_OPTIMIZE_MESHLET = downcallHandleVoid("meshopt_optimizeMeshlet", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG);
		MESHOPT_OPTIMIZE_MESHLET_LEVEL = downcallHandleVoid("meshopt_optimizeMeshletLevel", UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_INT);
		MESHOPT_COMPUTE_CLUSTER_BOUNDS = downcallHandle("meshopt_computeClusterBounds", MeshoptBounds.LAYOUT, UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG);
		MESHOPT_COMPUTE_MESHLET_BOUNDS = downcallHandle("meshopt_computeMeshletBounds", MeshoptBounds.LAYOUT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG);
		MESHOPT_COMPUTE_SPHERE_BOUNDS = downcallHandle("meshopt_computeSphereBounds", MeshoptBounds.LAYOUT, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG, UNBOUNDED_ADDRESS, JAVA_LONG);
		MESHOPT_EXTRACT_MESHLET_INDICES = downcallHandle("meshopt_extractMeshletIndices", JAVA_LONG, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG);
		MESHOPT_PARTITION_CLUSTERS = downcallHandle("meshopt_partitionClusters", JAVA_LONG, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG, JAVA_LONG);
		MESHOPT_SPATIAL_SORT_REMAP = downcallHandleVoid("meshopt_spatialSortRemap", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG);
		MESHOPT_SPATIAL_SORT_TRIANGLES = downcallHandleVoid("meshopt_spatialSortTriangles", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG);
		MESHOPT_SPATIAL_CLUSTER_POINTS = downcallHandleVoid("meshopt_spatialClusterPoints", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG, JAVA_LONG);
		MESHOPT_OPACITY_MAP_MEASURE = downcallHandle("meshopt_opacityMapMeasure", JAVA_LONG, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG, JAVA_INT, JAVA_INT, JAVA_INT, JAVA_FLOAT);
		MESHOPT_OPACITY_MAP_RASTERIZE = downcallHandleVoid("meshopt_opacityMapRasterize", UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG, JAVA_INT, JAVA_INT);
		MESHOPT_OPACITY_MAP_ENTRY_SIZE = downcallHandle("meshopt_opacityMapEntrySize", JAVA_LONG, JAVA_INT, JAVA_INT);
		MESHOPT_OPACITY_MAP_COMPACT = downcallHandle("meshopt_opacityMapCompact", JAVA_LONG, UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_INT);
		MESHOPT_GENERATE_TANGENTS = downcallHandleVoid("meshopt_generateTangents", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG, UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_INT);
		MESHOPT_GENERATE_NORMALS = downcallHandleVoid("meshopt_generateNormals", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG, JAVA_FLOAT, JAVA_FLOAT);
		MESHOPT_REMESH = downcallHandle("meshopt_remesh", JAVA_LONG, UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS, JAVA_LONG, UNBOUNDED_ADDRESS, JAVA_LONG, JAVA_LONG, JAVA_INT, JAVA_INT);
		MESHOPT_QUANTIZE_HALF = downcallHandle("meshopt_quantizeHalf", JAVA_SHORT, JAVA_FLOAT);
		MESHOPT_QUANTIZE_FLOAT = downcallHandle("meshopt_quantizeFloat", JAVA_FLOAT, JAVA_FLOAT, JAVA_INT);
		MESHOPT_DEQUANTIZE_HALF = downcallHandle("meshopt_dequantizeHalf", JAVA_FLOAT, JAVA_SHORT);
		MESHOPT_COMPUTE_POSITION_EXPONENT = downcallHandle("meshopt_computePositionExponent", JAVA_INT, UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS, JAVA_INT, JAVA_INT);
		MESHOPT_SET_ALLOCATOR = downcallHandleVoid("meshopt_setAllocator", UNBOUNDED_ADDRESS, UNBOUNDED_ADDRESS);
		//@formatter:on
	}

	private Meshoptimizer() {
	}

    /// ```
    /// 
    /// Generates a vertex remap table from the vertex buffer and an optional index buffer and returns number of unique vertices
    /// As a result, all vertices that are binary equivalent map to the same (new) location, with no gaps in the resulting sequence.
    /// Resulting remap table maps old vertices to new vertices and can be used in meshopt_remapVertexBuffer/meshopt_remapIndexBuffer.
    /// Note that binary equivalence considers all vertex_size bytes, including padding which should be zero-initialized.
    /// 
    /// destination must contain enough space for the resulting remap table (vertex_count elements)
    /// indices can be NULL if the input is unindexed
    /// ```
    public static long meshopt_generateVertexRemap(
    	MemorySegment destination,
    	MemorySegment indices,
    	long index_count,
    	MemorySegment vertices,
    	long vertex_count,
    	long vertex_size
    ) {
    	MethodHandle method = MESHOPT_GENERATE_VERTEX_REMAP.get();
    	try {
    		return (long) method.invokeExact(
    			destination,
    			indices,
    			index_count,
    			vertices,
    			vertex_count,
    			vertex_size
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#meshopt_generateVertexRemap].
    public static long meshopt_generateVertexRemap(
    	NativeIntArray destination,
    	@Nullable NativeIntArray indices,
    	long index_count,
    	MemorySegment vertices,
    	long vertex_count,
    	long vertex_size
    ) {
    	return meshopt_generateVertexRemap(
    		destination.memorySegment(),
    		indices == null ? MemorySegment.NULL : indices.memorySegment(),
    		index_count,
    		vertices,
    		vertex_count,
    		vertex_size
    	);
    }
    
    /// ```
    /// 
    /// Generates a vertex remap table from multiple vertex streams and an optional index buffer and returns number of unique vertices
    /// As a result, all vertices that are binary equivalent map to the same (new) location, with no gaps in the resulting sequence.
    /// Resulting remap table maps old vertices to new vertices and can be used in meshopt_remapVertexBuffer/meshopt_remapIndexBuffer.
    /// To remap vertex buffers, you will need to call meshopt_remapVertexBuffer for each vertex stream.
    /// Note that binary equivalence considers all size bytes in each stream, including padding which should be zero-initialized.
    /// 
    /// destination must contain enough space for the resulting remap table (vertex_count elements)
    /// indices can be NULL if the input is unindexed
    /// stream_count must be <= 16
    /// ```
    public static long meshopt_generateVertexRemapMulti(
    	MemorySegment destination,
    	MemorySegment indices,
    	long index_count,
    	long vertex_count,
    	MemorySegment streams,
    	long stream_count
    ) {
    	MethodHandle method = MESHOPT_GENERATE_VERTEX_REMAP_MULTI.get();
    	try {
    		return (long) method.invokeExact(
    			destination,
    			indices,
    			index_count,
    			vertex_count,
    			streams,
    			stream_count
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#meshopt_generateVertexRemapMulti].
    public static long meshopt_generateVertexRemapMulti(
    	NativeIntArray destination,
    	@Nullable NativeIntArray indices,
    	long index_count,
    	long vertex_count,
    	NativeStructArray<MeshoptStream> streams,
    	long stream_count
    ) {
    	return meshopt_generateVertexRemapMulti(
    		destination.memorySegment(),
    		indices == null ? MemorySegment.NULL : indices.memorySegment(),
    		index_count,
    		vertex_count,
    		streams.memorySegment(),
    		stream_count
    	);
    }
    
    /// ```
    /// 
    /// Generates a vertex remap table from the vertex buffer and an optional index buffer and returns number of unique vertices
    /// As a result, all vertices that are equivalent map to the same (new) location, with no gaps in the resulting sequence.
    /// Equivalence is checked in two steps: vertex positions are compared for equality, and then the user-specified equality function is called (if provided).
    /// Resulting remap table maps old vertices to new vertices and can be used in meshopt_remapVertexBuffer/meshopt_remapIndexBuffer.
    /// 
    /// destination must contain enough space for the resulting remap table (vertex_count elements)
    /// indices can be NULL if the input is unindexed
    /// vertex_positions should have float3 position in the first 12 bytes of each vertex
    /// callback can be NULL if no additional equality check is needed; otherwise, it should return 1 if vertices with specified indices are equivalent and 0 if they are not
    /// ```
    public static long meshopt_generateVertexRemapCustom(
    	MemorySegment destination,
    	MemorySegment indices,
    	long index_count,
    	MemorySegment vertex_positions,
    	long vertex_count,
    	long vertex_positions_stride,
    	MemorySegment callback,
    	MemorySegment context
    ) {
    	MethodHandle method = MESHOPT_GENERATE_VERTEX_REMAP_CUSTOM.get();
    	try {
    		return (long) method.invokeExact(
    			destination,
    			indices,
    			index_count,
    			vertex_positions,
    			vertex_count,
    			vertex_positions_stride,
    			callback,
    			context
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#meshopt_generateVertexRemapCustom].
    public static long meshopt_generateVertexRemapCustom(
    	NativeIntArray destination,
    	@Nullable NativeIntArray indices,
    	long index_count,
    	NativeFloatArray vertex_positions,
    	long vertex_count,
    	long vertex_positions_stride,
    	@Nullable MeshoptVertexRemapCallback callback,
    	MemorySegment context
    ) {
    	return meshopt_generateVertexRemapCustom(
    		destination.memorySegment(),
    		indices == null ? MemorySegment.NULL : indices.memorySegment(),
    		index_count,
    		vertex_positions.memorySegment(),
    		vertex_count,
    		vertex_positions_stride,
    		callback == null ? MemorySegment.NULL : callback.memorySegment(),
    		context
    	);
    }
    
    /// ```
    /// 
    /// Generates vertex buffer from the source vertex buffer and remap table generated by meshopt_generateVertexRemap
    /// 
    /// destination must contain enough space for the resulting vertex buffer (unique_vertex_count elements, returned by meshopt_generateVertexRemap)
    /// vertex_count should be the initial vertex count and not the value returned by meshopt_generateVertexRemap
    /// ```
    public static void meshopt_remapVertexBuffer(
    	MemorySegment destination,
    	MemorySegment vertices,
    	long vertex_count,
    	long vertex_size,
    	MemorySegment remap
    ) {
    	MethodHandle method = MESHOPT_REMAP_VERTEX_BUFFER.get();
    	try {
    		 method.invokeExact(
    			destination,
    			vertices,
    			vertex_count,
    			vertex_size,
    			remap
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#meshopt_remapVertexBuffer].
    public static void meshopt_remapVertexBuffer(
    	MemorySegment destination,
    	MemorySegment vertices,
    	long vertex_count,
    	long vertex_size,
    	NativeIntArray remap
    ) {
    	meshopt_remapVertexBuffer(
    		destination,
    		vertices,
    		vertex_count,
    		vertex_size,
    		remap.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Generate index buffer from the source index buffer and remap table generated by meshopt_generateVertexRemap
    /// 
    /// destination must contain enough space for the resulting index buffer (index_count elements)
    /// indices can be NULL if the input is unindexed
    /// ```
    public static void meshopt_remapIndexBuffer(
    	MemorySegment destination,
    	MemorySegment indices,
    	long index_count,
    	MemorySegment remap
    ) {
    	MethodHandle method = MESHOPT_REMAP_INDEX_BUFFER.get();
    	try {
    		 method.invokeExact(
    			destination,
    			indices,
    			index_count,
    			remap
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#meshopt_remapIndexBuffer].
    public static void meshopt_remapIndexBuffer(
    	NativeIntArray destination,
    	@Nullable NativeIntArray indices,
    	long index_count,
    	NativeIntArray remap
    ) {
    	meshopt_remapIndexBuffer(
    		destination.memorySegment(),
    		indices == null ? MemorySegment.NULL : indices.memorySegment(),
    		index_count,
    		remap.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Filter out redundant triangles from the index buffer and return the number of remaining indices
    /// Triangles are considered redundant if they are degenerate (two vertices have the same vertex key) or duplicate (matching triangle was present earlier).
    /// First vertex_size bytes of every vertex are compared for equality; typically vertex_size should be set to the size of the position attribute.
    /// Note that duplicate triangles with opposite windings are preserved, as they may be needed for double-sided rendering.
    /// 
    /// destination must contain enough space for the resulting index buffer (index_count elements)
    /// ```
    public static long meshopt_filterIndexBuffer(
    	MemorySegment destination,
    	MemorySegment indices,
    	long index_count,
    	MemorySegment vertices,
    	long vertex_count,
    	long vertex_size,
    	long vertex_stride
    ) {
    	MethodHandle method = MESHOPT_FILTER_INDEX_BUFFER.get();
    	try {
    		return (long) method.invokeExact(
    			destination,
    			indices,
    			index_count,
    			vertices,
    			vertex_count,
    			vertex_size,
    			vertex_stride
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#meshopt_filterIndexBuffer].
    public static long meshopt_filterIndexBuffer(
    	NativeIntArray destination,
    	NativeIntArray indices,
    	long index_count,
    	MemorySegment vertices,
    	long vertex_count,
    	long vertex_size,
    	long vertex_stride
    ) {
    	return meshopt_filterIndexBuffer(
    		destination.memorySegment(),
    		indices.memorySegment(),
    		index_count,
    		vertices,
    		vertex_count,
    		vertex_size,
    		vertex_stride
    	);
    }
    
    /// ```
    /// 
    /// Filter out redundant triangles from the index buffer and return the number of remaining indices
    /// Triangles are considered redundant if they are degenerate (two vertices have the same vertex key) or duplicate (matching triangle was present earlier).
    /// All bytes in specified streams are compared for equality; streams should include attributes relevant for position transform (e.g. bone influences).
    /// Note that duplicate triangles with opposite windings are preserved, as they may be needed for double-sided rendering.
    /// 
    /// destination must contain enough space for the resulting index buffer (index_count elements)
    /// stream_count must be <= 16
    /// ```
    public static long meshopt_filterIndexBufferMulti(
    	MemorySegment destination,
    	MemorySegment indices,
    	long index_count,
    	long vertex_count,
    	MemorySegment streams,
    	long stream_count
    ) {
    	MethodHandle method = MESHOPT_FILTER_INDEX_BUFFER_MULTI.get();
    	try {
    		return (long) method.invokeExact(
    			destination,
    			indices,
    			index_count,
    			vertex_count,
    			streams,
    			stream_count
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#meshopt_filterIndexBufferMulti].
    public static long meshopt_filterIndexBufferMulti(
    	NativeIntArray destination,
    	NativeIntArray indices,
    	long index_count,
    	long vertex_count,
    	NativeStructArray<MeshoptStream> streams,
    	long stream_count
    ) {
    	return meshopt_filterIndexBufferMulti(
    		destination.memorySegment(),
    		indices.memorySegment(),
    		index_count,
    		vertex_count,
    		streams.memorySegment(),
    		stream_count
    	);
    }
    
    /// ```
    /// 
    /// Generate index buffer that can be used for more efficient rendering when only a subset of the vertex attributes is necessary
    /// All vertices that are binary equivalent (wrt first vertex_size bytes) map to the first vertex in the original vertex buffer.
    /// This makes it possible to use the index buffer for Z pre-pass or shadowmap rendering, while using the original index buffer for regular rendering.
    /// Note that binary equivalence considers all vertex_size bytes, including padding which should be zero-initialized.
    /// 
    /// destination must contain enough space for the resulting index buffer (index_count elements)
    /// ```
    public static void meshopt_generateShadowIndexBuffer(
    	MemorySegment destination,
    	MemorySegment indices,
    	long index_count,
    	MemorySegment vertices,
    	long vertex_count,
    	long vertex_size,
    	long vertex_stride
    ) {
    	MethodHandle method = MESHOPT_GENERATE_SHADOW_INDEX_BUFFER.get();
    	try {
    		 method.invokeExact(
    			destination,
    			indices,
    			index_count,
    			vertices,
    			vertex_count,
    			vertex_size,
    			vertex_stride
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#meshopt_generateShadowIndexBuffer].
    public static void meshopt_generateShadowIndexBuffer(
    	NativeIntArray destination,
    	NativeIntArray indices,
    	long index_count,
    	MemorySegment vertices,
    	long vertex_count,
    	long vertex_size,
    	long vertex_stride
    ) {
    	meshopt_generateShadowIndexBuffer(
    		destination.memorySegment(),
    		indices.memorySegment(),
    		index_count,
    		vertices,
    		vertex_count,
    		vertex_size,
    		vertex_stride
    	);
    }
    
    /// ```
    /// 
    /// Generate index buffer that can be used for more efficient rendering when only a subset of the vertex attributes is necessary
    /// All vertices that are binary equivalent (wrt specified streams) map to the first vertex in the original vertex buffer.
    /// This makes it possible to use the index buffer for Z pre-pass or shadowmap rendering, while using the original index buffer for regular rendering.
    /// Note that binary equivalence considers all size bytes in each stream, including padding which should be zero-initialized.
    /// 
    /// destination must contain enough space for the resulting index buffer (index_count elements)
    /// stream_count must be <= 16
    /// ```
    public static void meshopt_generateShadowIndexBufferMulti(
    	MemorySegment destination,
    	MemorySegment indices,
    	long index_count,
    	long vertex_count,
    	MemorySegment streams,
    	long stream_count
    ) {
    	MethodHandle method = MESHOPT_GENERATE_SHADOW_INDEX_BUFFER_MULTI.get();
    	try {
    		 method.invokeExact(
    			destination,
    			indices,
    			index_count,
    			vertex_count,
    			streams,
    			stream_count
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#meshopt_generateShadowIndexBufferMulti].
    public static void meshopt_generateShadowIndexBufferMulti(
    	NativeIntArray destination,
    	NativeIntArray indices,
    	long index_count,
    	long vertex_count,
    	NativeStructArray<MeshoptStream> streams,
    	long stream_count
    ) {
    	meshopt_generateShadowIndexBufferMulti(
    		destination.memorySegment(),
    		indices.memorySegment(),
    		index_count,
    		vertex_count,
    		streams.memorySegment(),
    		stream_count
    	);
    }
    
    /// ```
    /// 
    /// Generates a remap table that maps all vertices with the same position to the same (existing) index.
    /// Similarly to meshopt_generateShadowIndexBuffer, this can be helpful to pre-process meshes for position-only rendering.
    /// This can also be used to implement algorithms that require positional-only connectivity, such as hierarchical simplification.
    /// 
    /// destination must contain enough space for the resulting remap table (vertex_count elements)
    /// vertex_positions should have float3 position in the first 12 bytes of each vertex
    /// ```
    public static void meshopt_generatePositionRemap(
    	MemorySegment destination,
    	MemorySegment vertex_positions,
    	long vertex_count,
    	long vertex_positions_stride
    ) {
    	MethodHandle method = MESHOPT_GENERATE_POSITION_REMAP.get();
    	try {
    		 method.invokeExact(
    			destination,
    			vertex_positions,
    			vertex_count,
    			vertex_positions_stride
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#meshopt_generatePositionRemap].
    public static void meshopt_generatePositionRemap(
    	NativeIntArray destination,
    	NativeFloatArray vertex_positions,
    	long vertex_count,
    	long vertex_positions_stride
    ) {
    	meshopt_generatePositionRemap(
    		destination.memorySegment(),
    		vertex_positions.memorySegment(),
    		vertex_count,
    		vertex_positions_stride
    	);
    }
    
    /// ```
    /// 
    /// Generate index buffer that can be used as a geometry shader input with triangle adjacency topology
    /// Each triangle is converted into a 6-vertex patch with the following layout:
    /// - 0, 2, 4: original triangle vertices
    /// - 1, 3, 5: vertices adjacent to edges 02, 24 and 40
    /// The resulting patch can be rendered with geometry shaders using e.g. VK_PRIMITIVE_TOPOLOGY_TRIANGLE_LIST_WITH_ADJACENCY.
    /// This can be used to implement algorithms like silhouette detection/expansion and other forms of GS-driven rendering.
    /// 
    /// destination must contain enough space for the resulting index buffer (index_count*2 elements)
    /// vertex_positions should have float3 position in the first 12 bytes of each vertex
    /// ```
    public static void meshopt_generateAdjacencyIndexBuffer(
    	MemorySegment destination,
    	MemorySegment indices,
    	long index_count,
    	MemorySegment vertex_positions,
    	long vertex_count,
    	long vertex_positions_stride
    ) {
    	MethodHandle method = MESHOPT_GENERATE_ADJACENCY_INDEX_BUFFER.get();
    	try {
    		 method.invokeExact(
    			destination,
    			indices,
    			index_count,
    			vertex_positions,
    			vertex_count,
    			vertex_positions_stride
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#meshopt_generateAdjacencyIndexBuffer].
    public static void meshopt_generateAdjacencyIndexBuffer(
    	NativeIntArray destination,
    	NativeIntArray indices,
    	long index_count,
    	NativeFloatArray vertex_positions,
    	long vertex_count,
    	long vertex_positions_stride
    ) {
    	meshopt_generateAdjacencyIndexBuffer(
    		destination.memorySegment(),
    		indices.memorySegment(),
    		index_count,
    		vertex_positions.memorySegment(),
    		vertex_count,
    		vertex_positions_stride
    	);
    }
    
    /// ```
    /// 
    /// Generate index buffer that can be used for PN-AEN tessellation with crack-free displacement
    /// Each triangle is converted into a 12-vertex patch with the following layout:
    /// - 0, 1, 2: original triangle vertices
    /// - 3, 4: opposing edge for edge 0, 1
    /// - 5, 6: opposing edge for edge 1, 2
    /// - 7, 8: opposing edge for edge 2, 0
    /// - 9, 10, 11: dominant vertices for corners 0, 1, 2
    /// The resulting patch can be rendered with hardware tessellation using PN-AEN and displacement mapping.
    /// See "Tessellation on Any Budget" (John McDonald, GDC 2011) for implementation details.
    /// 
    /// destination must contain enough space for the resulting index buffer (index_count*4 elements)
    /// vertex_positions should have float3 position in the first 12 bytes of each vertex
    /// ```
    public static void meshopt_generateTessellationIndexBuffer(
    	MemorySegment destination,
    	MemorySegment indices,
    	long index_count,
    	MemorySegment vertex_positions,
    	long vertex_count,
    	long vertex_positions_stride
    ) {
    	MethodHandle method = MESHOPT_GENERATE_TESSELLATION_INDEX_BUFFER.get();
    	try {
    		 method.invokeExact(
    			destination,
    			indices,
    			index_count,
    			vertex_positions,
    			vertex_count,
    			vertex_positions_stride
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#meshopt_generateTessellationIndexBuffer].
    public static void meshopt_generateTessellationIndexBuffer(
    	NativeIntArray destination,
    	NativeIntArray indices,
    	long index_count,
    	NativeFloatArray vertex_positions,
    	long vertex_count,
    	long vertex_positions_stride
    ) {
    	meshopt_generateTessellationIndexBuffer(
    		destination.memorySegment(),
    		indices.memorySegment(),
    		index_count,
    		vertex_positions.memorySegment(),
    		vertex_count,
    		vertex_positions_stride
    	);
    }
    
    /// ```
    /// 
    /// Generate index buffer that can be used for visibility buffer rendering and returns the size of the reorder table
    /// Each triangle's provoking vertex index is equal to primitive id; this allows passing it to the fragment shader using flat/nointerpolation attribute.
    /// This is important for performance on hardware where primitive id can't be accessed efficiently in fragment shader.
    /// The reorder table stores the original vertex id for each vertex in the new index buffer, and should be used in the vertex shader to load vertex data.
    /// The provoking vertex is assumed to be the first vertex in the triangle; if this is not the case (OpenGL), rotate each triangle (abc -> bca) before rendering.
    /// For maximum efficiency the input index buffer should be optimized for vertex cache first.
    /// 
    /// destination must contain enough space for the resulting index buffer (index_count elements)
    /// reorder must contain enough space for the worst case reorder table (vertex_count + index_count/3 elements)
    /// ```
    public static long meshopt_generateProvokingIndexBuffer(
    	MemorySegment destination,
    	MemorySegment reorder,
    	MemorySegment indices,
    	long index_count,
    	long vertex_count
    ) {
    	MethodHandle method = MESHOPT_GENERATE_PROVOKING_INDEX_BUFFER.get();
    	try {
    		return (long) method.invokeExact(
    			destination,
    			reorder,
    			indices,
    			index_count,
    			vertex_count
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#meshopt_generateProvokingIndexBuffer].
    public static long meshopt_generateProvokingIndexBuffer(
    	NativeIntArray destination,
    	NativeIntArray reorder,
    	NativeIntArray indices,
    	long index_count,
    	long vertex_count
    ) {
    	return meshopt_generateProvokingIndexBuffer(
    		destination.memorySegment(),
    		reorder.memorySegment(),
    		indices.memorySegment(),
    		index_count,
    		vertex_count
    	);
    }
    
    /// ```
    /// 
    /// Vertex transform cache optimizer
    /// Reorders indices to reduce the number of GPU vertex shader invocations
    /// If index buffer contains multiple ranges for multiple draw calls, this function needs to be called on each range individually.
    /// 
    /// destination must contain enough space for the resulting index buffer (index_count elements)
    /// ```
    public static void meshopt_optimizeVertexCache(
    	MemorySegment destination,
    	MemorySegment indices,
    	long index_count,
    	long vertex_count
    ) {
    	MethodHandle method = MESHOPT_OPTIMIZE_VERTEX_CACHE.get();
    	try {
    		 method.invokeExact(
    			destination,
    			indices,
    			index_count,
    			vertex_count
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#meshopt_optimizeVertexCache].
    public static void meshopt_optimizeVertexCache(
    	NativeIntArray destination,
    	NativeIntArray indices,
    	long index_count,
    	long vertex_count
    ) {
    	meshopt_optimizeVertexCache(
    		destination.memorySegment(),
    		indices.memorySegment(),
    		index_count,
    		vertex_count
    	);
    }
    
    /// ```
    /// 
    /// Vertex transform cache optimizer for strip-like caches
    /// Produces inferior results to meshopt_optimizeVertexCache from the GPU vertex cache perspective
    /// However, the resulting index order is more optimal if the goal is to reduce the triangle strip length or improve compression efficiency
    /// 
    /// destination must contain enough space for the resulting index buffer (index_count elements)
    /// ```
    public static void meshopt_optimizeVertexCacheStrip(
    	MemorySegment destination,
    	MemorySegment indices,
    	long index_count,
    	long vertex_count
    ) {
    	MethodHandle method = MESHOPT_OPTIMIZE_VERTEX_CACHE_STRIP.get();
    	try {
    		 method.invokeExact(
    			destination,
    			indices,
    			index_count,
    			vertex_count
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#meshopt_optimizeVertexCacheStrip].
    public static void meshopt_optimizeVertexCacheStrip(
    	NativeIntArray destination,
    	NativeIntArray indices,
    	long index_count,
    	long vertex_count
    ) {
    	meshopt_optimizeVertexCacheStrip(
    		destination.memorySegment(),
    		indices.memorySegment(),
    		index_count,
    		vertex_count
    	);
    }
    
    /// ```
    /// 
    /// Vertex transform cache optimizer for FIFO caches
    /// Reorders indices to reduce the number of GPU vertex shader invocations
    /// Generally takes ~3x less time to optimize meshes but produces inferior results compared to meshopt_optimizeVertexCache
    /// If index buffer contains multiple ranges for multiple draw calls, this function needs to be called on each range individually.
    /// 
    /// destination must contain enough space for the resulting index buffer (index_count elements)
    /// cache_size should be less than the actual GPU cache size to avoid cache thrashing
    /// ```
    public static void meshopt_optimizeVertexCacheFifo(
    	MemorySegment destination,
    	MemorySegment indices,
    	long index_count,
    	long vertex_count,
    	int cache_size
    ) {
    	MethodHandle method = MESHOPT_OPTIMIZE_VERTEX_CACHE_FIFO.get();
    	try {
    		 method.invokeExact(
    			destination,
    			indices,
    			index_count,
    			vertex_count,
    			cache_size
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#meshopt_optimizeVertexCacheFifo].
    public static void meshopt_optimizeVertexCacheFifo(
    	NativeIntArray destination,
    	NativeIntArray indices,
    	long index_count,
    	long vertex_count,
    	int cache_size
    ) {
    	meshopt_optimizeVertexCacheFifo(
    		destination.memorySegment(),
    		indices.memorySegment(),
    		index_count,
    		vertex_count,
    		cache_size
    	);
    }
    
    /// ```
    /// 
    /// Overdraw optimizer
    /// Reorders indices to reduce the number of GPU vertex shader invocations and the pixel overdraw
    /// If index buffer contains multiple ranges for multiple draw calls, this function needs to be called on each range individually.
    /// 
    /// destination must contain enough space for the resulting index buffer (index_count elements)
    /// indices must contain index data that is the result of meshopt_optimizeVertexCache (*not* the original mesh indices!)
    /// vertex_positions should have float3 position in the first 12 bytes of each vertex
    /// threshold indicates how much the overdraw optimizer can degrade vertex cache efficiency (1.05 = up to 5%) to reduce overdraw more efficiently
    /// ```
    public static void meshopt_optimizeOverdraw(
    	MemorySegment destination,
    	MemorySegment indices,
    	long index_count,
    	MemorySegment vertex_positions,
    	long vertex_count,
    	long vertex_positions_stride,
    	float threshold
    ) {
    	MethodHandle method = MESHOPT_OPTIMIZE_OVERDRAW.get();
    	try {
    		 method.invokeExact(
    			destination,
    			indices,
    			index_count,
    			vertex_positions,
    			vertex_count,
    			vertex_positions_stride,
    			threshold
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#meshopt_optimizeOverdraw].
    public static void meshopt_optimizeOverdraw(
    	NativeIntArray destination,
    	NativeIntArray indices,
    	long index_count,
    	NativeFloatArray vertex_positions,
    	long vertex_count,
    	long vertex_positions_stride,
    	float threshold
    ) {
    	meshopt_optimizeOverdraw(
    		destination.memorySegment(),
    		indices.memorySegment(),
    		index_count,
    		vertex_positions.memorySegment(),
    		vertex_count,
    		vertex_positions_stride,
    		threshold
    	);
    }
    
    /// ```
    /// 
    /// Vertex fetch cache optimizer
    /// Reorders vertices and changes indices to reduce the amount of GPU memory fetches during vertex processing
    /// Returns the number of unique vertices, which is the same as input vertex count unless some vertices are unused
    /// This function works for a single vertex stream; for multiple vertex streams, use meshopt_optimizeVertexFetchRemap + meshopt_remapVertexBuffer for each stream.
    /// 
    /// destination must contain enough space for the resulting vertex buffer (vertex_count elements)
    /// indices is used both as an input and as an output index buffer
    /// ```
    public static long meshopt_optimizeVertexFetch(
    	MemorySegment destination,
    	MemorySegment indices,
    	long index_count,
    	MemorySegment vertices,
    	long vertex_count,
    	long vertex_size
    ) {
    	MethodHandle method = MESHOPT_OPTIMIZE_VERTEX_FETCH.get();
    	try {
    		return (long) method.invokeExact(
    			destination,
    			indices,
    			index_count,
    			vertices,
    			vertex_count,
    			vertex_size
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#meshopt_optimizeVertexFetch].
    public static long meshopt_optimizeVertexFetch(
    	MemorySegment destination,
    	NativeIntArray indices,
    	long index_count,
    	MemorySegment vertices,
    	long vertex_count,
    	long vertex_size
    ) {
    	return meshopt_optimizeVertexFetch(
    		destination,
    		indices.memorySegment(),
    		index_count,
    		vertices,
    		vertex_count,
    		vertex_size
    	);
    }
    
    /// ```
    /// 
    /// Vertex fetch cache optimizer
    /// Generates vertex remap to reduce the amount of GPU memory fetches during vertex processing
    /// Returns the number of unique vertices, which is the same as input vertex count unless some vertices are unused
    /// The resulting remap table should be used to reorder vertex/index buffers using meshopt_remapVertexBuffer/meshopt_remapIndexBuffer
    /// 
    /// destination must contain enough space for the resulting remap table (vertex_count elements)
    /// ```
    public static long meshopt_optimizeVertexFetchRemap(
    	MemorySegment destination,
    	MemorySegment indices,
    	long index_count,
    	long vertex_count
    ) {
    	MethodHandle method = MESHOPT_OPTIMIZE_VERTEX_FETCH_REMAP.get();
    	try {
    		return (long) method.invokeExact(
    			destination,
    			indices,
    			index_count,
    			vertex_count
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#meshopt_optimizeVertexFetchRemap].
    public static long meshopt_optimizeVertexFetchRemap(
    	NativeIntArray destination,
    	NativeIntArray indices,
    	long index_count,
    	long vertex_count
    ) {
    	return meshopt_optimizeVertexFetchRemap(
    		destination.memorySegment(),
    		indices.memorySegment(),
    		index_count,
    		vertex_count
    	);
    }
    
    /// ```
    /// 
    /// Index buffer encoder
    /// Encodes index data into an array of bytes that is generally much smaller (<1.5 bytes/triangle) and compresses better (<1 bytes/triangle) compared to original.
    /// Input index buffer must represent a triangle list.
    /// Returns encoded data size on success, 0 on error; the only error condition is if buffer doesn't have enough space
    /// For maximum efficiency the index buffer being encoded has to be optimized for vertex cache and vertex fetch first.
    /// 
    /// buffer must contain enough space for the encoded index buffer (use meshopt_encodeIndexBufferBound to compute worst case size)
    /// ```
    public static long meshopt_encodeIndexBuffer(
    	MemorySegment buffer,
    	long buffer_size,
    	MemorySegment indices,
    	long index_count
    ) {
    	MethodHandle method = MESHOPT_ENCODE_INDEX_BUFFER.get();
    	try {
    		return (long) method.invokeExact(
    			buffer,
    			buffer_size,
    			indices,
    			index_count
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#meshopt_encodeIndexBuffer].
    public static long meshopt_encodeIndexBuffer(
    	NativeByteArray buffer,
    	long buffer_size,
    	NativeIntArray indices,
    	long index_count
    ) {
    	return meshopt_encodeIndexBuffer(
    		buffer.memorySegment(),
    		buffer_size,
    		indices.memorySegment(),
    		index_count
    	);
    }
    
    public static long meshopt_encodeIndexBufferBound(
    	long index_count,
    	long vertex_count
    ) {
    	MethodHandle method = MESHOPT_ENCODE_INDEX_BUFFER_BOUND.get();
    	try {
    		return (long) method.invokeExact(
    			index_count,
    			vertex_count
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// 
    /// Set index encoder format version (defaults to 1)
    /// This function is not thread safe and must not be called concurrently with meshopt_encodeIndexBuffer/meshopt_encodeIndexSequence.
    /// 
    /// version must specify the data format version to encode; valid values are 0 (decodable by all library versions) and 1 (decodable by 0.14+)
    /// ```
    public static void meshopt_encodeIndexVersion(
    	int version
    ) {
    	MethodHandle method = MESHOPT_ENCODE_INDEX_VERSION.get();
    	try {
    		 method.invokeExact(
    			version
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// 
    /// Index buffer decoder
    /// Decodes index data from an array of bytes generated by meshopt_encodeIndexBuffer
    /// Returns 0 if decoding was successful, and an error code otherwise
    /// The decoder is safe to use for untrusted input, but it may produce garbage data (e.g. out of range indices).
    /// 
    /// destination must contain enough space for the resulting index buffer (index_count elements)
    /// ```
    public static int meshopt_decodeIndexBuffer(
    	MemorySegment destination,
    	long index_count,
    	long index_size,
    	MemorySegment buffer,
    	long buffer_size
    ) {
    	MethodHandle method = MESHOPT_DECODE_INDEX_BUFFER.get();
    	try {
    		return (int) method.invokeExact(
    			destination,
    			index_count,
    			index_size,
    			buffer,
    			buffer_size
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#meshopt_decodeIndexBuffer].
    public static int meshopt_decodeIndexBuffer(
    	MemorySegment destination,
    	long index_count,
    	long index_size,
    	NativeByteArray buffer,
    	long buffer_size
    ) {
    	return meshopt_decodeIndexBuffer(
    		destination,
    		index_count,
    		index_size,
    		buffer.memorySegment(),
    		buffer_size
    	);
    }
    
    /// ```
    /// 
    /// Get encoded index format version
    /// Returns format version of the encoded index buffer/sequence, or -1 if the buffer header is invalid
    /// Note that a non-negative value doesn't guarantee that the buffer will be decoded correctly if the input is malformed.
    /// ```
    public static int meshopt_decodeIndexVersion(
    	MemorySegment buffer,
    	long buffer_size
    ) {
    	MethodHandle method = MESHOPT_DECODE_INDEX_VERSION.get();
    	try {
    		return (int) method.invokeExact(
    			buffer,
    			buffer_size
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#meshopt_decodeIndexVersion].
    public static int meshopt_decodeIndexVersion(
    	NativeByteArray buffer,
    	long buffer_size
    ) {
    	return meshopt_decodeIndexVersion(
    		buffer.memorySegment(),
    		buffer_size
    	);
    }
    
    /// ```
    /// 
    /// Index sequence encoder
    /// Encodes index sequence into an array of bytes that is generally smaller and compresses better compared to original.
    /// Input index sequence can represent arbitrary topology; for triangle lists meshopt_encodeIndexBuffer is likely to be better.
    /// Returns encoded data size on success, 0 on error; the only error condition is if buffer doesn't have enough space
    /// 
    /// buffer must contain enough space for the encoded index sequence (use meshopt_encodeIndexSequenceBound to compute worst case size)
    /// ```
    public static long meshopt_encodeIndexSequence(
    	MemorySegment buffer,
    	long buffer_size,
    	MemorySegment indices,
    	long index_count
    ) {
    	MethodHandle method = MESHOPT_ENCODE_INDEX_SEQUENCE.get();
    	try {
    		return (long) method.invokeExact(
    			buffer,
    			buffer_size,
    			indices,
    			index_count
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#meshopt_encodeIndexSequence].
    public static long meshopt_encodeIndexSequence(
    	NativeByteArray buffer,
    	long buffer_size,
    	NativeIntArray indices,
    	long index_count
    ) {
    	return meshopt_encodeIndexSequence(
    		buffer.memorySegment(),
    		buffer_size,
    		indices.memorySegment(),
    		index_count
    	);
    }
    
    public static long meshopt_encodeIndexSequenceBound(
    	long index_count,
    	long vertex_count
    ) {
    	MethodHandle method = MESHOPT_ENCODE_INDEX_SEQUENCE_BOUND.get();
    	try {
    		return (long) method.invokeExact(
    			index_count,
    			vertex_count
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// 
    /// Index sequence decoder
    /// Decodes index data from an array of bytes generated by meshopt_encodeIndexSequence
    /// Returns 0 if decoding was successful, and an error code otherwise
    /// The decoder is safe to use for untrusted input, but it may produce garbage data (e.g. out of range indices).
    /// 
    /// destination must contain enough space for the resulting index sequence (index_count elements)
    /// ```
    public static int meshopt_decodeIndexSequence(
    	MemorySegment destination,
    	long index_count,
    	long index_size,
    	MemorySegment buffer,
    	long buffer_size
    ) {
    	MethodHandle method = MESHOPT_DECODE_INDEX_SEQUENCE.get();
    	try {
    		return (int) method.invokeExact(
    			destination,
    			index_count,
    			index_size,
    			buffer,
    			buffer_size
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#meshopt_decodeIndexSequence].
    public static int meshopt_decodeIndexSequence(
    	MemorySegment destination,
    	long index_count,
    	long index_size,
    	NativeByteArray buffer,
    	long buffer_size
    ) {
    	return meshopt_decodeIndexSequence(
    		destination,
    		index_count,
    		index_size,
    		buffer.memorySegment(),
    		buffer_size
    	);
    }
    
    /// ```
    /// 
    /// Meshlet encoder
    /// Encodes meshlet data into an array of bytes that is generally smaller and compresses better compared to original.
    /// Returns encoded data size on success, 0 on error; the only error condition is if buffer doesn't have enough space
    /// This function encodes a single meshlet; when encoding multiple meshlets, additional headers may be necessary to store vertex/triangle count and encoded size.
    /// For maximum efficiency the meshlet being encoded should be optimized using meshopt_optimizeMeshletLevel with level 1+ (3 recommended); additionally, vertex reference data should be optimized for locality (fetch).
    /// 
    /// buffer must contain enough space for the encoded meshlet (use meshopt_encodeMeshletBound to compute worst case size)
    /// vertices may be NULL, in which case vertex_count must be 0 and only triangle data is encoded
    /// vertex_count and triangle_count must be <= 256.
    /// ```
    public static long meshopt_encodeMeshlet(
    	MemorySegment buffer,
    	long buffer_size,
    	MemorySegment vertices,
    	long vertex_count,
    	MemorySegment triangles,
    	long triangle_count
    ) {
    	MethodHandle method = MESHOPT_ENCODE_MESHLET.get();
    	try {
    		return (long) method.invokeExact(
    			buffer,
    			buffer_size,
    			vertices,
    			vertex_count,
    			triangles,
    			triangle_count
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#meshopt_encodeMeshlet].
    public static long meshopt_encodeMeshlet(
    	NativeByteArray buffer,
    	long buffer_size,
    	@Nullable NativeIntArray vertices,
    	long vertex_count,
    	NativeByteArray triangles,
    	long triangle_count
    ) {
    	return meshopt_encodeMeshlet(
    		buffer.memorySegment(),
    		buffer_size,
    		vertices == null ? MemorySegment.NULL : vertices.memorySegment(),
    		vertex_count,
    		triangles.memorySegment(),
    		triangle_count
    	);
    }
    
    public static long meshopt_encodeMeshletBound(
    	long max_vertices,
    	long max_triangles
    ) {
    	MethodHandle method = MESHOPT_ENCODE_MESHLET_BOUND.get();
    	try {
    		return (long) method.invokeExact(
    			max_vertices,
    			max_triangles
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// 
    /// Meshlet decoder
    /// Decodes meshlet data from an array of bytes generated by meshopt_encodeMeshlet
    /// Returns 0 if decoding was successful, and an error code otherwise
    /// The decoder is safe to use for untrusted input, but it may produce garbage data.
    /// 
    /// vertices must contain enough space for the resulting vertex data, aligned to 4 bytes (align(vertex_count * vertex_size, 4) bytes)
    /// vertex_size must be 2 (16-bit vertex references) or 4 (32-bit vertex references)
    /// triangles must contain enough space for the resulting triangle data, aligned to 4 bytes (align(triangle_count * triangle_size, 4) bytes)
    /// triangle_size must be 3 (8-bit triangle indices) or 4 (32-bit packed triangles, stored as (a) | (b << 8) | (c << 16))
    /// vertex_count, triangle_count match those used during encoding exactly; buffer_size must be equal to the encoded size returned by meshopt_encodeMeshlet.
    /// vertices may be NULL, in which case vertex_count must be 0 and the meshlet must contain just triangle data
    /// 
    /// When using "raw" decoding (meshopt_decodeMeshletRaw), both vertices and triangles should have available space further aligned to 16 bytes for efficient SIMD decoding.
    /// ```
    public static int meshopt_decodeMeshlet(
    	MemorySegment vertices,
    	long vertex_count,
    	long vertex_size,
    	MemorySegment triangles,
    	long triangle_count,
    	long triangle_size,
    	MemorySegment buffer,
    	long buffer_size
    ) {
    	MethodHandle method = MESHOPT_DECODE_MESHLET.get();
    	try {
    		return (int) method.invokeExact(
    			vertices,
    			vertex_count,
    			vertex_size,
    			triangles,
    			triangle_count,
    			triangle_size,
    			buffer,
    			buffer_size
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#meshopt_decodeMeshlet].
    public static int meshopt_decodeMeshlet(
    	MemorySegment vertices,
    	long vertex_count,
    	long vertex_size,
    	MemorySegment triangles,
    	long triangle_count,
    	long triangle_size,
    	NativeByteArray buffer,
    	long buffer_size
    ) {
    	return meshopt_decodeMeshlet(
    		vertices,
    		vertex_count,
    		vertex_size,
    		triangles,
    		triangle_count,
    		triangle_size,
    		buffer.memorySegment(),
    		buffer_size
    	);
    }
    
    public static int meshopt_decodeMeshletRaw(
    	MemorySegment vertices,
    	long vertex_count,
    	MemorySegment triangles,
    	long triangle_count,
    	MemorySegment buffer,
    	long buffer_size
    ) {
    	MethodHandle method = MESHOPT_DECODE_MESHLET_RAW.get();
    	try {
    		return (int) method.invokeExact(
    			vertices,
    			vertex_count,
    			triangles,
    			triangle_count,
    			buffer,
    			buffer_size
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#meshopt_decodeMeshletRaw].
    public static int meshopt_decodeMeshletRaw(
    	@Nullable NativeIntArray vertices,
    	long vertex_count,
    	NativeIntArray triangles,
    	long triangle_count,
    	NativeByteArray buffer,
    	long buffer_size
    ) {
    	return meshopt_decodeMeshletRaw(
    		vertices == null ? MemorySegment.NULL : vertices.memorySegment(),
    		vertex_count,
    		triangles.memorySegment(),
    		triangle_count,
    		buffer.memorySegment(),
    		buffer_size
    	);
    }
    
    /// ```
    /// 
    /// Vertex buffer encoder
    /// Encodes vertex data into an array of bytes that is generally smaller and compresses better compared to original.
    /// Returns encoded data size on success, 0 on error; the only error condition is if buffer doesn't have enough space
    /// This function works for a single vertex stream; for multiple vertex streams, call meshopt_encodeVertexBuffer for each stream.
    /// Note that all vertex_size bytes of each vertex are encoded verbatim, including padding which should be zero-initialized.
    /// For maximum efficiency the vertex buffer being encoded has to be quantized and optimized for locality of reference (cache/fetch) first.
    /// 
    /// buffer must contain enough space for the encoded vertex buffer (use meshopt_encodeVertexBufferBound to compute worst case size)
    /// vertex_size must be a multiple of 4 (and <= 256)
    /// ```
    public static long meshopt_encodeVertexBuffer(
    	MemorySegment buffer,
    	long buffer_size,
    	MemorySegment vertices,
    	long vertex_count,
    	long vertex_size
    ) {
    	MethodHandle method = MESHOPT_ENCODE_VERTEX_BUFFER.get();
    	try {
    		return (long) method.invokeExact(
    			buffer,
    			buffer_size,
    			vertices,
    			vertex_count,
    			vertex_size
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#meshopt_encodeVertexBuffer].
    public static long meshopt_encodeVertexBuffer(
    	NativeByteArray buffer,
    	long buffer_size,
    	MemorySegment vertices,
    	long vertex_count,
    	long vertex_size
    ) {
    	return meshopt_encodeVertexBuffer(
    		buffer.memorySegment(),
    		buffer_size,
    		vertices,
    		vertex_count,
    		vertex_size
    	);
    }
    
    public static long meshopt_encodeVertexBufferBound(
    	long vertex_count,
    	long vertex_size
    ) {
    	MethodHandle method = MESHOPT_ENCODE_VERTEX_BUFFER_BOUND.get();
    	try {
    		return (long) method.invokeExact(
    			vertex_count,
    			vertex_size
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// 
    /// Vertex buffer encoder
    /// Encodes vertex data just like meshopt_encodeVertexBuffer, but allows to override compression level.
    /// For compression level to take effect, the vertex encoding version must be set to 1.
    /// The default compression level implied by meshopt_encodeVertexBuffer is 2.
    /// 
    /// buffer must contain enough space for the encoded vertex buffer (use meshopt_encodeVertexBufferBound to compute worst case size)
    /// vertex_size must be a multiple of 4 (and <= 256)
    /// level should be in the range [0, 3] with 0 being the fastest and 3 being the slowest and producing the best compression ratio.
    /// version should be -1 to use the default version (specified via meshopt_encodeVertexVersion), or 0/1 to override the version; per above, level won't take effect if version is 0.
    /// ```
    public static long meshopt_encodeVertexBufferLevel(
    	MemorySegment buffer,
    	long buffer_size,
    	MemorySegment vertices,
    	long vertex_count,
    	long vertex_size,
    	int level,
    	int version
    ) {
    	MethodHandle method = MESHOPT_ENCODE_VERTEX_BUFFER_LEVEL.get();
    	try {
    		return (long) method.invokeExact(
    			buffer,
    			buffer_size,
    			vertices,
    			vertex_count,
    			vertex_size,
    			level,
    			version
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#meshopt_encodeVertexBufferLevel].
    public static long meshopt_encodeVertexBufferLevel(
    	NativeByteArray buffer,
    	long buffer_size,
    	MemorySegment vertices,
    	long vertex_count,
    	long vertex_size,
    	int level,
    	int version
    ) {
    	return meshopt_encodeVertexBufferLevel(
    		buffer.memorySegment(),
    		buffer_size,
    		vertices,
    		vertex_count,
    		vertex_size,
    		level,
    		version
    	);
    }
    
    /// ```
    /// 
    /// Set vertex encoder format version (defaults to 1)
    /// This function is not thread safe and must not be called concurrently with meshopt_encodeVertexBuffer/meshopt_encodeVertexBufferLevel.
    /// 
    /// version must specify the data format version to encode; valid values are 0 (decodable by all library versions) and 1 (decodable by 0.23+)
    /// ```
    public static void meshopt_encodeVertexVersion(
    	int version
    ) {
    	MethodHandle method = MESHOPT_ENCODE_VERTEX_VERSION.get();
    	try {
    		 method.invokeExact(
    			version
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// 
    /// Vertex buffer decoder
    /// Decodes vertex data from an array of bytes generated by meshopt_encodeVertexBuffer
    /// Returns 0 if decoding was successful, and an error code otherwise
    /// The decoder is safe to use for untrusted input, but it may produce garbage data.
    /// 
    /// destination must contain enough space for the resulting vertex buffer (vertex_count * vertex_size bytes)
    /// vertex_size must be a multiple of 4 (and <= 256)
    /// ```
    public static int meshopt_decodeVertexBuffer(
    	MemorySegment destination,
    	long vertex_count,
    	long vertex_size,
    	MemorySegment buffer,
    	long buffer_size
    ) {
    	MethodHandle method = MESHOPT_DECODE_VERTEX_BUFFER.get();
    	try {
    		return (int) method.invokeExact(
    			destination,
    			vertex_count,
    			vertex_size,
    			buffer,
    			buffer_size
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#meshopt_decodeVertexBuffer].
    public static int meshopt_decodeVertexBuffer(
    	MemorySegment destination,
    	long vertex_count,
    	long vertex_size,
    	NativeByteArray buffer,
    	long buffer_size
    ) {
    	return meshopt_decodeVertexBuffer(
    		destination,
    		vertex_count,
    		vertex_size,
    		buffer.memorySegment(),
    		buffer_size
    	);
    }
    
    /// ```
    /// 
    /// Get encoded vertex format version
    /// Returns format version of the encoded vertex buffer, or -1 if the buffer header is invalid
    /// Note that a non-negative value doesn't guarantee that the buffer will be decoded correctly if the input is malformed.
    /// ```
    public static int meshopt_decodeVertexVersion(
    	MemorySegment buffer,
    	long buffer_size
    ) {
    	MethodHandle method = MESHOPT_DECODE_VERTEX_VERSION.get();
    	try {
    		return (int) method.invokeExact(
    			buffer,
    			buffer_size
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#meshopt_decodeVertexVersion].
    public static int meshopt_decodeVertexVersion(
    	NativeByteArray buffer,
    	long buffer_size
    ) {
    	return meshopt_decodeVertexVersion(
    		buffer.memorySegment(),
    		buffer_size
    	);
    }
    
    /// ```
    /// 
    /// Vertex buffer filters
    /// These functions can be used to filter output of meshopt_decodeVertexBuffer in-place.
    /// 
    /// meshopt_decodeFilterOct decodes octahedral encoding of a unit vector with K-bit signed X/Y as an input; Z must store 1.0f.
    /// Each component is stored as an 8-bit or 16-bit normalized integer; stride must be equal to 4 or 8. W is preserved as is.
    /// 
    /// meshopt_decodeFilterQuat decodes 3-component quaternion encoding with K-bit component encoding and a 2-bit component index indicating which component to reconstruct.
    /// Each component is stored as a 16-bit integer; stride must be equal to 8.
    /// 
    /// meshopt_decodeFilterExp decodes exponential encoding of floating-point data with 8-bit exponent and 24-bit integer mantissa as 2^E*M.
    /// Each 32-bit component is decoded in isolation; stride must be divisible by 4.
    /// 
    /// meshopt_decodeFilterColor decodes RGBA colors from YCoCg (+A) color encoding where RGB is converted to YCoCg space with K-bit component encoding, and A is stored using K-1 bits.
    /// Each component is stored as an 8-bit or 16-bit normalized integer; stride must be equal to 4 or 8.
    /// ```
    public static void meshopt_decodeFilterOct(
    	MemorySegment buffer,
    	long count,
    	long stride
    ) {
    	MethodHandle method = MESHOPT_DECODE_FILTER_OCT.get();
    	try {
    		 method.invokeExact(
    			buffer,
    			count,
    			stride
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void meshopt_decodeFilterQuat(
    	MemorySegment buffer,
    	long count,
    	long stride
    ) {
    	MethodHandle method = MESHOPT_DECODE_FILTER_QUAT.get();
    	try {
    		 method.invokeExact(
    			buffer,
    			count,
    			stride
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void meshopt_decodeFilterExp(
    	MemorySegment buffer,
    	long count,
    	long stride
    ) {
    	MethodHandle method = MESHOPT_DECODE_FILTER_EXP.get();
    	try {
    		 method.invokeExact(
    			buffer,
    			count,
    			stride
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void meshopt_decodeFilterColor(
    	MemorySegment buffer,
    	long count,
    	long stride
    ) {
    	MethodHandle method = MESHOPT_DECODE_FILTER_COLOR.get();
    	try {
    		 method.invokeExact(
    			buffer,
    			count,
    			stride
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    public static void meshopt_encodeFilterOct(
    	MemorySegment destination,
    	long count,
    	long stride,
    	int bits,
    	MemorySegment data
    ) {
    	MethodHandle method = MESHOPT_ENCODE_FILTER_OCT.get();
    	try {
    		 method.invokeExact(
    			destination,
    			count,
    			stride,
    			bits,
    			data
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#meshopt_encodeFilterOct].
    public static void meshopt_encodeFilterOct(
    	MemorySegment destination,
    	long count,
    	long stride,
    	int bits,
    	NativeFloatArray data
    ) {
    	meshopt_encodeFilterOct(
    		destination,
    		count,
    		stride,
    		bits,
    		data.memorySegment()
    	);
    }
    
    public static void meshopt_encodeFilterQuat(
    	MemorySegment destination,
    	long count,
    	long stride,
    	int bits,
    	MemorySegment data
    ) {
    	MethodHandle method = MESHOPT_ENCODE_FILTER_QUAT.get();
    	try {
    		 method.invokeExact(
    			destination,
    			count,
    			stride,
    			bits,
    			data
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#meshopt_encodeFilterQuat].
    public static void meshopt_encodeFilterQuat(
    	MemorySegment destination,
    	long count,
    	long stride,
    	int bits,
    	NativeFloatArray data
    ) {
    	meshopt_encodeFilterQuat(
    		destination,
    		count,
    		stride,
    		bits,
    		data.memorySegment()
    	);
    }
    
    public static void meshopt_encodeFilterExp(
    	MemorySegment destination,
    	long count,
    	long stride,
    	int bits,
    	MemorySegment data,
    	int mode
    ) {
    	MethodHandle method = MESHOPT_ENCODE_FILTER_EXP.get();
    	try {
    		 method.invokeExact(
    			destination,
    			count,
    			stride,
    			bits,
    			data,
    			mode
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#meshopt_encodeFilterExp].
    public static void meshopt_encodeFilterExp(
    	MemorySegment destination,
    	long count,
    	long stride,
    	int bits,
    	NativeFloatArray data,
    	int mode
    ) {
    	meshopt_encodeFilterExp(
    		destination,
    		count,
    		stride,
    		bits,
    		data.memorySegment(),
    		mode
    	);
    }
    
    public static void meshopt_encodeFilterColor(
    	MemorySegment destination,
    	long count,
    	long stride,
    	int bits,
    	MemorySegment data
    ) {
    	MethodHandle method = MESHOPT_ENCODE_FILTER_COLOR.get();
    	try {
    		 method.invokeExact(
    			destination,
    			count,
    			stride,
    			bits,
    			data
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#meshopt_encodeFilterColor].
    public static void meshopt_encodeFilterColor(
    	MemorySegment destination,
    	long count,
    	long stride,
    	int bits,
    	NativeFloatArray data
    ) {
    	meshopt_encodeFilterColor(
    		destination,
    		count,
    		stride,
    		bits,
    		data.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Mesh simplifier
    /// Reduces the number of triangles in the mesh, attempting to preserve mesh appearance as much as possible
    /// The algorithm tries to preserve mesh topology and can stop short of the target goal based on topology constraints or target error.
    /// If not all attributes from the input mesh are needed, it's recommended to reindex the mesh without them prior to simplification.
    /// Returns the number of indices after simplification, with destination containing new index data
    /// 
    /// The resulting index buffer references vertices from the original vertex buffer.
    /// If the original vertex data isn't needed, creating a compact vertex buffer using meshopt_optimizeVertexFetch is recommended.
    /// 
    /// destination must contain enough space for the target index buffer, worst case is index_count elements (*not* target_index_count)!
    /// vertex_positions should have float3 position in the first 12 bytes of each vertex
    /// target_error represents the error relative to mesh extents that can be tolerated, e.g. 0.01 = 1% deformation (unless absolute error option is used)
    /// options must be a bitmask composed of meshopt_SimplifyX options; 0 is a safe default
    /// result_error can be NULL; when it's not NULL, it will contain the resulting (relative/absolute) error after simplification
    /// ```
    public static long meshopt_simplify(
    	MemorySegment destination,
    	MemorySegment indices,
    	long index_count,
    	MemorySegment vertex_positions,
    	long vertex_count,
    	long vertex_positions_stride,
    	long target_index_count,
    	float target_error,
    	int options,
    	MemorySegment result_error
    ) {
    	MethodHandle method = MESHOPT_SIMPLIFY.get();
    	try {
    		return (long) method.invokeExact(
    			destination,
    			indices,
    			index_count,
    			vertex_positions,
    			vertex_count,
    			vertex_positions_stride,
    			target_index_count,
    			target_error,
    			options,
    			result_error
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#meshopt_simplify].
    public static long meshopt_simplify(
    	NativeIntArray destination,
    	NativeIntArray indices,
    	long index_count,
    	NativeFloatArray vertex_positions,
    	long vertex_count,
    	long vertex_positions_stride,
    	long target_index_count,
    	float target_error,
    	int options,
    	@Nullable NativeFloatArray result_error
    ) {
    	return meshopt_simplify(
    		destination.memorySegment(),
    		indices.memorySegment(),
    		index_count,
    		vertex_positions.memorySegment(),
    		vertex_count,
    		vertex_positions_stride,
    		target_index_count,
    		target_error,
    		options,
    		result_error == null ? MemorySegment.NULL : result_error.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Mesh simplifier with attribute metric
    /// Reduces the number of triangles in the mesh, attempting to preserve mesh appearance as much as possible.
    /// Similar to meshopt_simplify, but incorporates attribute values into the error metric used to prioritize simplification order.
    /// The algorithm tries to preserve mesh topology and can stop short of the target goal based on topology constraints or target error.
    /// If not all attributes from the input mesh are needed, it's recommended to reindex the mesh without them prior to simplification.
    /// Returns the number of indices after simplification, with destination containing new index data
    /// 
    /// The resulting index buffer references vertices from the original vertex buffer.
    /// If the original vertex data isn't needed, creating a compact vertex buffer using meshopt_optimizeVertexFetch is recommended.
    /// Note that the number of attributes with non-zero weights affects memory requirements and running time.
    /// 
    /// destination must contain enough space for the target index buffer, worst case is index_count elements (*not* target_index_count)!
    /// vertex_positions should have float3 position in the first 12 bytes of each vertex
    /// vertex_attributes should have attribute_count floats for each vertex
    /// attribute_weights should have attribute_count floats in total; the weights determine relative priority of attributes between each other and wrt position
    /// attribute_count must be <= 32
    /// vertex_lock can be NULL; when it's not NULL, it should have a value for each vertex composed of meshopt_SimplifyVertex_* flags
    /// target_error represents the error relative to mesh extents that can be tolerated, e.g. 0.01 = 1% deformation (unless absolute error option is used)
    /// options must be a bitmask composed of meshopt_SimplifyX options; 0 is a safe default
    /// result_error can be NULL; when it's not NULL, it will contain the resulting (relative/absolute) error after simplification
    /// ```
    public static long meshopt_simplifyWithAttributes(
    	MemorySegment destination,
    	MemorySegment indices,
    	long index_count,
    	MemorySegment vertex_positions,
    	long vertex_count,
    	long vertex_positions_stride,
    	MemorySegment vertex_attributes,
    	long vertex_attributes_stride,
    	MemorySegment attribute_weights,
    	long attribute_count,
    	MemorySegment vertex_lock,
    	long target_index_count,
    	float target_error,
    	int options,
    	MemorySegment result_error
    ) {
    	MethodHandle method = MESHOPT_SIMPLIFY_WITH_ATTRIBUTES.get();
    	try {
    		return (long) method.invokeExact(
    			destination,
    			indices,
    			index_count,
    			vertex_positions,
    			vertex_count,
    			vertex_positions_stride,
    			vertex_attributes,
    			vertex_attributes_stride,
    			attribute_weights,
    			attribute_count,
    			vertex_lock,
    			target_index_count,
    			target_error,
    			options,
    			result_error
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#meshopt_simplifyWithAttributes].
    public static long meshopt_simplifyWithAttributes(
    	NativeIntArray destination,
    	NativeIntArray indices,
    	long index_count,
    	NativeFloatArray vertex_positions,
    	long vertex_count,
    	long vertex_positions_stride,
    	NativeFloatArray vertex_attributes,
    	long vertex_attributes_stride,
    	NativeFloatArray attribute_weights,
    	long attribute_count,
    	@Nullable NativeByteArray vertex_lock,
    	long target_index_count,
    	float target_error,
    	int options,
    	@Nullable NativeFloatArray result_error
    ) {
    	return meshopt_simplifyWithAttributes(
    		destination.memorySegment(),
    		indices.memorySegment(),
    		index_count,
    		vertex_positions.memorySegment(),
    		vertex_count,
    		vertex_positions_stride,
    		vertex_attributes.memorySegment(),
    		vertex_attributes_stride,
    		attribute_weights.memorySegment(),
    		attribute_count,
    		vertex_lock == null ? MemorySegment.NULL : vertex_lock.memorySegment(),
    		target_index_count,
    		target_error,
    		options,
    		result_error == null ? MemorySegment.NULL : result_error.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Mesh simplifier with position/attribute update
    /// Reduces the number of triangles in the mesh, attempting to preserve mesh appearance as much as possible.
    /// Similar to meshopt_simplifyWithAttributes, but destructively updates positions and attribute values for optimal appearance.
    /// The algorithm tries to preserve mesh topology and can stop short of the target goal based on topology constraints or target error.
    /// If not all attributes from the input mesh are needed, it's recommended to reindex the mesh without them prior to simplification.
    /// Returns the number of indices after simplification, indices are destructively updated with new index data
    /// 
    /// The updated index buffer references vertices from the original vertex buffer, however the vertex positions and attributes are updated in-place.
    /// Creating a compact vertex buffer using meshopt_optimizeVertexFetch is recommended; if the original vertex data is needed, it should be copied before simplification.
    /// Note that the number of attributes with non-zero weights affects memory requirements and running time. Attributes with zero weights are not updated.
    /// 
    /// vertex_positions should have float3 position in the first 12 bytes of each vertex
    /// vertex_attributes should have attribute_count floats for each vertex
    /// attribute_weights should have attribute_count floats in total; the weights determine relative priority of attributes between each other and wrt position
    /// attribute_count must be <= 32
    /// vertex_lock can be NULL; when it's not NULL, it should have a value for each vertex composed of meshopt_SimplifyVertex_* flags
    /// target_error represents the error relative to mesh extents that can be tolerated, e.g. 0.01 = 1% deformation (unless absolute error option is used)
    /// options must be a bitmask composed of meshopt_SimplifyX options; 0 is a safe default
    /// result_error can be NULL; when it's not NULL, it will contain the resulting (relative/absolute) error after simplification
    /// ```
    public static long meshopt_simplifyWithUpdate(
    	MemorySegment indices,
    	long index_count,
    	MemorySegment vertex_positions,
    	long vertex_count,
    	long vertex_positions_stride,
    	MemorySegment vertex_attributes,
    	long vertex_attributes_stride,
    	MemorySegment attribute_weights,
    	long attribute_count,
    	MemorySegment vertex_lock,
    	long target_index_count,
    	float target_error,
    	int options,
    	MemorySegment result_error
    ) {
    	MethodHandle method = MESHOPT_SIMPLIFY_WITH_UPDATE.get();
    	try {
    		return (long) method.invokeExact(
    			indices,
    			index_count,
    			vertex_positions,
    			vertex_count,
    			vertex_positions_stride,
    			vertex_attributes,
    			vertex_attributes_stride,
    			attribute_weights,
    			attribute_count,
    			vertex_lock,
    			target_index_count,
    			target_error,
    			options,
    			result_error
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#meshopt_simplifyWithUpdate].
    public static long meshopt_simplifyWithUpdate(
    	NativeIntArray indices,
    	long index_count,
    	NativeFloatArray vertex_positions,
    	long vertex_count,
    	long vertex_positions_stride,
    	NativeFloatArray vertex_attributes,
    	long vertex_attributes_stride,
    	NativeFloatArray attribute_weights,
    	long attribute_count,
    	@Nullable NativeByteArray vertex_lock,
    	long target_index_count,
    	float target_error,
    	int options,
    	@Nullable NativeFloatArray result_error
    ) {
    	return meshopt_simplifyWithUpdate(
    		indices.memorySegment(),
    		index_count,
    		vertex_positions.memorySegment(),
    		vertex_count,
    		vertex_positions_stride,
    		vertex_attributes.memorySegment(),
    		vertex_attributes_stride,
    		attribute_weights.memorySegment(),
    		attribute_count,
    		vertex_lock == null ? MemorySegment.NULL : vertex_lock.memorySegment(),
    		target_index_count,
    		target_error,
    		options,
    		result_error == null ? MemorySegment.NULL : result_error.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Mesh simplifier (sloppy)
    /// Reduces the number of triangles in the mesh, sacrificing mesh appearance for simplification performance
    /// The algorithm doesn't preserve mesh topology but can stop short of the target goal based on target error.
    /// Returns the number of indices after simplification, with destination containing new index data
    /// The resulting index buffer references vertices from the original vertex buffer.
    /// If the original vertex data isn't needed, creating a compact vertex buffer using meshopt_optimizeVertexFetch is recommended.
    /// 
    /// destination must contain enough space for the target index buffer, worst case is index_count elements (*not* target_index_count)!
    /// vertex_positions should have float3 position in the first 12 bytes of each vertex
    /// vertex_lock can be NULL; when it's not NULL, it should have a value for each vertex; vertices that can't be moved should set 1 consistently for all indices with the same position
    /// target_error represents the error relative to mesh extents that can be tolerated, e.g. 0.01 = 1% deformation; value range [0..1]
    /// result_error can be NULL; when it's not NULL, it will contain the resulting (relative) error after simplification
    /// ```
    public static long meshopt_simplifySloppy(
    	MemorySegment destination,
    	MemorySegment indices,
    	long index_count,
    	MemorySegment vertex_positions,
    	long vertex_count,
    	long vertex_positions_stride,
    	MemorySegment vertex_lock,
    	long target_index_count,
    	float target_error,
    	MemorySegment result_error
    ) {
    	MethodHandle method = MESHOPT_SIMPLIFY_SLOPPY.get();
    	try {
    		return (long) method.invokeExact(
    			destination,
    			indices,
    			index_count,
    			vertex_positions,
    			vertex_count,
    			vertex_positions_stride,
    			vertex_lock,
    			target_index_count,
    			target_error,
    			result_error
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#meshopt_simplifySloppy].
    public static long meshopt_simplifySloppy(
    	NativeIntArray destination,
    	NativeIntArray indices,
    	long index_count,
    	NativeFloatArray vertex_positions,
    	long vertex_count,
    	long vertex_positions_stride,
    	@Nullable NativeByteArray vertex_lock,
    	long target_index_count,
    	float target_error,
    	@Nullable NativeFloatArray result_error
    ) {
    	return meshopt_simplifySloppy(
    		destination.memorySegment(),
    		indices.memorySegment(),
    		index_count,
    		vertex_positions.memorySegment(),
    		vertex_count,
    		vertex_positions_stride,
    		vertex_lock == null ? MemorySegment.NULL : vertex_lock.memorySegment(),
    		target_index_count,
    		target_error,
    		result_error == null ? MemorySegment.NULL : result_error.memorySegment()
    	);
    }
    
    /// ```
    /// 
    /// Mesh simplifier (pruner)
    /// Reduces the number of triangles in the mesh by removing small isolated parts of the mesh
    /// Returns the number of indices after simplification, with destination containing new index data
    /// The resulting index buffer references vertices from the original vertex buffer.
    /// If the original vertex data isn't needed, creating a compact vertex buffer using meshopt_optimizeVertexFetch is recommended.
    /// 
    /// destination must contain enough space for the target index buffer, worst case is index_count elements
    /// vertex_positions should have float3 position in the first 12 bytes of each vertex
    /// target_error represents the error relative to mesh extents that can be tolerated, e.g. 0.01 = 1% deformation; value range [0..1]
    /// ```
    public static long meshopt_simplifyPrune(
    	MemorySegment destination,
    	MemorySegment indices,
    	long index_count,
    	MemorySegment vertex_positions,
    	long vertex_count,
    	long vertex_positions_stride,
    	float target_error
    ) {
    	MethodHandle method = MESHOPT_SIMPLIFY_PRUNE.get();
    	try {
    		return (long) method.invokeExact(
    			destination,
    			indices,
    			index_count,
    			vertex_positions,
    			vertex_count,
    			vertex_positions_stride,
    			target_error
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#meshopt_simplifyPrune].
    public static long meshopt_simplifyPrune(
    	NativeIntArray destination,
    	NativeIntArray indices,
    	long index_count,
    	NativeFloatArray vertex_positions,
    	long vertex_count,
    	long vertex_positions_stride,
    	float target_error
    ) {
    	return meshopt_simplifyPrune(
    		destination.memorySegment(),
    		indices.memorySegment(),
    		index_count,
    		vertex_positions.memorySegment(),
    		vertex_count,
    		vertex_positions_stride,
    		target_error
    	);
    }
    
    /// ```
    /// 
    /// Point cloud simplifier
    /// Reduces the number of points in the cloud to reach the given target
    /// Returns the number of points after simplification, with destination containing new index data
    /// The resulting index buffer references vertices from the original vertex buffer.
    /// If the original vertex data isn't needed, creating a compact vertex buffer using meshopt_optimizeVertexFetch is recommended.
    /// 
    /// destination must contain enough space for the target index buffer (target_vertex_count elements)
    /// vertex_positions should have float3 position in the first 12 bytes of each vertex
    /// vertex_colors can be NULL; when it's not NULL, it should have float3 color in the first 12 bytes of each vertex
    /// color_weight determines relative priority of color wrt position; 1.0 is a safe default
    /// ```
    public static long meshopt_simplifyPoints(
    	MemorySegment destination,
    	MemorySegment vertex_positions,
    	long vertex_count,
    	long vertex_positions_stride,
    	MemorySegment vertex_colors,
    	long vertex_colors_stride,
    	float color_weight,
    	long target_vertex_count
    ) {
    	MethodHandle method = MESHOPT_SIMPLIFY_POINTS.get();
    	try {
    		return (long) method.invokeExact(
    			destination,
    			vertex_positions,
    			vertex_count,
    			vertex_positions_stride,
    			vertex_colors,
    			vertex_colors_stride,
    			color_weight,
    			target_vertex_count
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#meshopt_simplifyPoints].
    public static long meshopt_simplifyPoints(
    	NativeIntArray destination,
    	NativeFloatArray vertex_positions,
    	long vertex_count,
    	long vertex_positions_stride,
    	@Nullable NativeFloatArray vertex_colors,
    	long vertex_colors_stride,
    	float color_weight,
    	long target_vertex_count
    ) {
    	return meshopt_simplifyPoints(
    		destination.memorySegment(),
    		vertex_positions.memorySegment(),
    		vertex_count,
    		vertex_positions_stride,
    		vertex_colors == null ? MemorySegment.NULL : vertex_colors.memorySegment(),
    		vertex_colors_stride,
    		color_weight,
    		target_vertex_count
    	);
    }
    
    /// ```
    /// 
    /// Returns the error scaling factor used by the simplifier to convert between absolute and relative extents
    /// 
    /// Absolute error must be *divided* by the scaling factor before passing it to meshopt_simplify as target_error
    /// Relative error returned by meshopt_simplify via result_error must be *multiplied* by the scaling factor to get absolute error.
    /// ```
    public static float meshopt_simplifyScale(
    	MemorySegment vertex_positions,
    	long vertex_count,
    	long vertex_positions_stride
    ) {
    	MethodHandle method = MESHOPT_SIMPLIFY_SCALE.get();
    	try {
    		return (float) method.invokeExact(
    			vertex_positions,
    			vertex_count,
    			vertex_positions_stride
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#meshopt_simplifyScale].
    public static float meshopt_simplifyScale(
    	NativeFloatArray vertex_positions,
    	long vertex_count,
    	long vertex_positions_stride
    ) {
    	return meshopt_simplifyScale(
    		vertex_positions.memorySegment(),
    		vertex_count,
    		vertex_positions_stride
    	);
    }
    
    /// ```
    /// 
    /// Mesh stripifier
    /// Converts a previously vertex cache optimized triangle list to triangle strip, stitching strips using restart index or degenerate triangles
    /// Returns the number of indices in the resulting strip, with destination containing new index data
    /// For maximum efficiency the index buffer being converted has to be optimized for vertex cache first.
    /// Using restart indices can result in ~10% smaller index buffers, but on some GPUs restart indices may result in decreased performance.
    /// 
    /// destination must contain enough space for the target index buffer, worst case can be computed with meshopt_stripifyBound
    /// restart_index should be 0xffff or 0xffffffff depending on index size, or 0 to use degenerate triangles
    /// ```
    public static long meshopt_stripify(
    	MemorySegment destination,
    	MemorySegment indices,
    	long index_count,
    	long vertex_count,
    	int restart_index
    ) {
    	MethodHandle method = MESHOPT_STRIPIFY.get();
    	try {
    		return (long) method.invokeExact(
    			destination,
    			indices,
    			index_count,
    			vertex_count,
    			restart_index
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#meshopt_stripify].
    public static long meshopt_stripify(
    	NativeIntArray destination,
    	NativeIntArray indices,
    	long index_count,
    	long vertex_count,
    	int restart_index
    ) {
    	return meshopt_stripify(
    		destination.memorySegment(),
    		indices.memorySegment(),
    		index_count,
    		vertex_count,
    		restart_index
    	);
    }
    
    public static long meshopt_stripifyBound(
    	long index_count
    ) {
    	MethodHandle method = MESHOPT_STRIPIFY_BOUND.get();
    	try {
    		return (long) method.invokeExact(
    			index_count
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// 
    /// Mesh unstripifier
    /// Converts a triangle strip to a triangle list
    /// Returns the number of indices in the resulting list, with destination containing new index data
    /// 
    /// destination must contain enough space for the target index buffer, worst case can be computed with meshopt_unstripifyBound
    /// ```
    public static long meshopt_unstripify(
    	MemorySegment destination,
    	MemorySegment indices,
    	long index_count,
    	int restart_index
    ) {
    	MethodHandle method = MESHOPT_UNSTRIPIFY.get();
    	try {
    		return (long) method.invokeExact(
    			destination,
    			indices,
    			index_count,
    			restart_index
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#meshopt_unstripify].
    public static long meshopt_unstripify(
    	NativeIntArray destination,
    	NativeIntArray indices,
    	long index_count,
    	int restart_index
    ) {
    	return meshopt_unstripify(
    		destination.memorySegment(),
    		indices.memorySegment(),
    		index_count,
    		restart_index
    	);
    }
    
    public static long meshopt_unstripifyBound(
    	long index_count
    ) {
    	MethodHandle method = MESHOPT_UNSTRIPIFY_BOUND.get();
    	try {
    		return (long) method.invokeExact(
    			index_count
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// 
    /// Vertex transform cache analyzer
    /// Returns cache hit statistics using a simplified FIFO model
    /// Results may not match actual GPU performance
    /// ```
    public static MemorySegment meshopt_analyzeVertexCache(
    	SegmentAllocator allocator,
    	MemorySegment indices,
    	long index_count,
    	long vertex_count,
    	int cache_size,
    	int warp_size,
    	int primgroup_size
    ) {
    	MethodHandle method = MESHOPT_ANALYZE_VERTEX_CACHE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			indices,
    			index_count,
    			vertex_count,
    			cache_size,
    			warp_size,
    			primgroup_size
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#meshopt_analyzeVertexCache].
    public static @Nullable MeshoptVertexCacheStatistics meshopt_analyzeVertexCache(
    	SegmentAllocator allocator,
    	NativeIntArray indices,
    	long index_count,
    	long vertex_count,
    	int cache_size,
    	int warp_size,
    	int primgroup_size
    ) {
    	MemorySegment segment = meshopt_analyzeVertexCache(
    		allocator,
    		indices.memorySegment(),
    		index_count,
    		vertex_count,
    		cache_size,
    		warp_size,
    		primgroup_size
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MeshoptVertexCacheStatistics(segment);
    }
    
    /// ```
    /// 
    /// Vertex fetch cache analyzer
    /// Returns cache hit statistics using a simplified direct mapped model
    /// Results may not match actual GPU performance
    /// ```
    public static MemorySegment meshopt_analyzeVertexFetch(
    	SegmentAllocator allocator,
    	MemorySegment indices,
    	long index_count,
    	long vertex_count,
    	long vertex_size
    ) {
    	MethodHandle method = MESHOPT_ANALYZE_VERTEX_FETCH.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			indices,
    			index_count,
    			vertex_count,
    			vertex_size
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#meshopt_analyzeVertexFetch].
    public static @Nullable MeshoptVertexFetchStatistics meshopt_analyzeVertexFetch(
    	SegmentAllocator allocator,
    	NativeIntArray indices,
    	long index_count,
    	long vertex_count,
    	long vertex_size
    ) {
    	MemorySegment segment = meshopt_analyzeVertexFetch(
    		allocator,
    		indices.memorySegment(),
    		index_count,
    		vertex_count,
    		vertex_size
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MeshoptVertexFetchStatistics(segment);
    }
    
    /// ```
    /// 
    /// Overdraw analyzer
    /// Returns overdraw statistics using a software rasterizer
    /// Results may not match actual GPU performance
    /// 
    /// vertex_positions should have float3 position in the first 12 bytes of each vertex
    /// ```
    public static MemorySegment meshopt_analyzeOverdraw(
    	SegmentAllocator allocator,
    	MemorySegment indices,
    	long index_count,
    	MemorySegment vertex_positions,
    	long vertex_count,
    	long vertex_positions_stride
    ) {
    	MethodHandle method = MESHOPT_ANALYZE_OVERDRAW.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			indices,
    			index_count,
    			vertex_positions,
    			vertex_count,
    			vertex_positions_stride
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#meshopt_analyzeOverdraw].
    public static @Nullable MeshoptOverdrawStatistics meshopt_analyzeOverdraw(
    	SegmentAllocator allocator,
    	NativeIntArray indices,
    	long index_count,
    	NativeFloatArray vertex_positions,
    	long vertex_count,
    	long vertex_positions_stride
    ) {
    	MemorySegment segment = meshopt_analyzeOverdraw(
    		allocator,
    		indices.memorySegment(),
    		index_count,
    		vertex_positions.memorySegment(),
    		vertex_count,
    		vertex_positions_stride
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MeshoptOverdrawStatistics(segment);
    }
    
    /// ```
    /// 
    /// Coverage analyzer
    /// Returns coverage statistics (ratio of viewport pixels covered from each axis) using a software rasterizer
    /// 
    /// vertex_positions should have float3 position in the first 12 bytes of each vertex
    /// ```
    public static MemorySegment meshopt_analyzeCoverage(
    	SegmentAllocator allocator,
    	MemorySegment indices,
    	long index_count,
    	MemorySegment vertex_positions,
    	long vertex_count,
    	long vertex_positions_stride
    ) {
    	MethodHandle method = MESHOPT_ANALYZE_COVERAGE.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			indices,
    			index_count,
    			vertex_positions,
    			vertex_count,
    			vertex_positions_stride
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#meshopt_analyzeCoverage].
    public static @Nullable MeshoptCoverageStatistics meshopt_analyzeCoverage(
    	SegmentAllocator allocator,
    	NativeIntArray indices,
    	long index_count,
    	NativeFloatArray vertex_positions,
    	long vertex_count,
    	long vertex_positions_stride
    ) {
    	MemorySegment segment = meshopt_analyzeCoverage(
    		allocator,
    		indices.memorySegment(),
    		index_count,
    		vertex_positions.memorySegment(),
    		vertex_count,
    		vertex_positions_stride
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MeshoptCoverageStatistics(segment);
    }
    
    /// ```
    /// 
    /// Meshlet builder
    /// Splits the mesh into a set of meshlets where each meshlet has a micro index buffer indexing into meshlet vertices that refer to the original vertex buffer
    /// The resulting data can be used to render meshes using NVidia programmable mesh shading pipeline, or in other cluster-based renderers.
    /// When targeting mesh shading hardware, for maximum efficiency meshlets should be further optimized using meshopt_optimizeMeshlet.
    /// When using buildMeshlets, vertex positions need to be provided to minimize the size of the resulting clusters.
    /// When using buildMeshletsScan, for maximum efficiency the index buffer being converted has to be optimized for vertex cache first.
    /// 
    /// meshlets must contain enough space for all meshlets, worst case size can be computed with meshopt_buildMeshletsBound
    /// meshlet_vertices must contain enough space for all meshlets, worst case is index_count elements (*not* vertex_count!)
    /// meshlet_triangles must contain enough space for all meshlets, worst case is index_count elements
    /// vertex_positions should have float3 position in the first 12 bytes of each vertex
    /// max_vertices and max_triangles must not exceed implementation limits (max_vertices <= 256, max_triangles <= 512)
    /// cone_weight should be set to 0 when cone culling is not used, and a value between 0 and 1 otherwise to balance between cluster size and cone culling efficiency
    /// ```
    public static long meshopt_buildMeshlets(
    	MemorySegment meshlets,
    	MemorySegment meshlet_vertices,
    	MemorySegment meshlet_triangles,
    	MemorySegment indices,
    	long index_count,
    	MemorySegment vertex_positions,
    	long vertex_count,
    	long vertex_positions_stride,
    	long max_vertices,
    	long max_triangles,
    	float cone_weight
    ) {
    	MethodHandle method = MESHOPT_BUILD_MESHLETS.get();
    	try {
    		return (long) method.invokeExact(
    			meshlets,
    			meshlet_vertices,
    			meshlet_triangles,
    			indices,
    			index_count,
    			vertex_positions,
    			vertex_count,
    			vertex_positions_stride,
    			max_vertices,
    			max_triangles,
    			cone_weight
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#meshopt_buildMeshlets].
    public static long meshopt_buildMeshlets(
    	NativeStructArray<MeshoptMeshlet> meshlets,
    	NativeIntArray meshlet_vertices,
    	NativeByteArray meshlet_triangles,
    	NativeIntArray indices,
    	long index_count,
    	NativeFloatArray vertex_positions,
    	long vertex_count,
    	long vertex_positions_stride,
    	long max_vertices,
    	long max_triangles,
    	float cone_weight
    ) {
    	return meshopt_buildMeshlets(
    		meshlets.memorySegment(),
    		meshlet_vertices.memorySegment(),
    		meshlet_triangles.memorySegment(),
    		indices.memorySegment(),
    		index_count,
    		vertex_positions.memorySegment(),
    		vertex_count,
    		vertex_positions_stride,
    		max_vertices,
    		max_triangles,
    		cone_weight
    	);
    }
    
    public static long meshopt_buildMeshletsScan(
    	MemorySegment meshlets,
    	MemorySegment meshlet_vertices,
    	MemorySegment meshlet_triangles,
    	MemorySegment indices,
    	long index_count,
    	long vertex_count,
    	long max_vertices,
    	long max_triangles
    ) {
    	MethodHandle method = MESHOPT_BUILD_MESHLETS_SCAN.get();
    	try {
    		return (long) method.invokeExact(
    			meshlets,
    			meshlet_vertices,
    			meshlet_triangles,
    			indices,
    			index_count,
    			vertex_count,
    			max_vertices,
    			max_triangles
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#meshopt_buildMeshletsScan].
    public static long meshopt_buildMeshletsScan(
    	NativeStructArray<MeshoptMeshlet> meshlets,
    	NativeIntArray meshlet_vertices,
    	NativeByteArray meshlet_triangles,
    	NativeIntArray indices,
    	long index_count,
    	long vertex_count,
    	long max_vertices,
    	long max_triangles
    ) {
    	return meshopt_buildMeshletsScan(
    		meshlets.memorySegment(),
    		meshlet_vertices.memorySegment(),
    		meshlet_triangles.memorySegment(),
    		indices.memorySegment(),
    		index_count,
    		vertex_count,
    		max_vertices,
    		max_triangles
    	);
    }
    
    public static long meshopt_buildMeshletsBound(
    	long index_count,
    	long max_vertices,
    	long max_triangles
    ) {
    	MethodHandle method = MESHOPT_BUILD_MESHLETS_BOUND.get();
    	try {
    		return (long) method.invokeExact(
    			index_count,
    			max_vertices,
    			max_triangles
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// 
    /// Meshlet builder with flexible cluster sizes
    /// Splits the mesh into a set of meshlets, similarly to meshopt_buildMeshlets, but allows to specify minimum and maximum number of triangles per meshlet.
    /// Clusters between min and max triangle counts are split when the cluster size would have exceeded the expected cluster size by more than split_factor.
    /// 
    /// meshlets must contain enough space for all meshlets, worst case size can be computed with meshopt_buildMeshletsBound using min_triangles (*not* max!)
    /// meshlet_vertices must contain enough space for all meshlets, worst case is index_count elements (*not* vertex_count!)
    /// meshlet_triangles must contain enough space for all meshlets, worst case is index_count elements
    /// vertex_positions should have float3 position in the first 12 bytes of each vertex
    /// max_vertices, min_triangles and max_triangles must not exceed implementation limits (max_vertices <= 256, max_triangles <= 512; min_triangles <= max_triangles)
    /// cone_weight should be set to 0 when cone culling is not used, and a value between 0 and 1 otherwise to balance between cluster size and cone culling efficiency
    /// split_factor should be set to a non-negative value; when greater than 0, clusters that have large bounds may be split unless they are under the min_triangles threshold
    /// ```
    public static long meshopt_buildMeshletsFlex(
    	MemorySegment meshlets,
    	MemorySegment meshlet_vertices,
    	MemorySegment meshlet_triangles,
    	MemorySegment indices,
    	long index_count,
    	MemorySegment vertex_positions,
    	long vertex_count,
    	long vertex_positions_stride,
    	long max_vertices,
    	long min_triangles,
    	long max_triangles,
    	float cone_weight,
    	float split_factor
    ) {
    	MethodHandle method = MESHOPT_BUILD_MESHLETS_FLEX.get();
    	try {
    		return (long) method.invokeExact(
    			meshlets,
    			meshlet_vertices,
    			meshlet_triangles,
    			indices,
    			index_count,
    			vertex_positions,
    			vertex_count,
    			vertex_positions_stride,
    			max_vertices,
    			min_triangles,
    			max_triangles,
    			cone_weight,
    			split_factor
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#meshopt_buildMeshletsFlex].
    public static long meshopt_buildMeshletsFlex(
    	NativeStructArray<MeshoptMeshlet> meshlets,
    	NativeIntArray meshlet_vertices,
    	NativeByteArray meshlet_triangles,
    	NativeIntArray indices,
    	long index_count,
    	NativeFloatArray vertex_positions,
    	long vertex_count,
    	long vertex_positions_stride,
    	long max_vertices,
    	long min_triangles,
    	long max_triangles,
    	float cone_weight,
    	float split_factor
    ) {
    	return meshopt_buildMeshletsFlex(
    		meshlets.memorySegment(),
    		meshlet_vertices.memorySegment(),
    		meshlet_triangles.memorySegment(),
    		indices.memorySegment(),
    		index_count,
    		vertex_positions.memorySegment(),
    		vertex_count,
    		vertex_positions_stride,
    		max_vertices,
    		min_triangles,
    		max_triangles,
    		cone_weight,
    		split_factor
    	);
    }
    
    /// ```
    /// 
    /// Meshlet builder that produces clusters optimized for raytracing
    /// Splits the mesh into a set of meshlets, similarly to meshopt_buildMeshlets, but optimizes cluster subdivision for raytracing and allows to specify minimum and maximum number of triangles per meshlet.
    /// 
    /// meshlets must contain enough space for all meshlets, worst case size can be computed with meshopt_buildMeshletsBound using min_triangles (*not* max!)
    /// meshlet_vertices must contain enough space for all meshlets, worst case is index_count elements (*not* vertex_count!)
    /// meshlet_triangles must contain enough space for all meshlets, worst case is index_count elements
    /// vertex_positions should have float3 position in the first 12 bytes of each vertex
    /// max_vertices, min_triangles and max_triangles must not exceed implementation limits (max_vertices <= 256, max_triangles <= 512; min_triangles <= max_triangles)
    /// fill_weight allows to prioritize clusters that are closer to maximum size at some cost to SAH quality; 0.5 is a safe default
    /// ```
    public static long meshopt_buildMeshletsSpatial(
    	MemorySegment meshlets,
    	MemorySegment meshlet_vertices,
    	MemorySegment meshlet_triangles,
    	MemorySegment indices,
    	long index_count,
    	MemorySegment vertex_positions,
    	long vertex_count,
    	long vertex_positions_stride,
    	long max_vertices,
    	long min_triangles,
    	long max_triangles,
    	float fill_weight
    ) {
    	MethodHandle method = MESHOPT_BUILD_MESHLETS_SPATIAL.get();
    	try {
    		return (long) method.invokeExact(
    			meshlets,
    			meshlet_vertices,
    			meshlet_triangles,
    			indices,
    			index_count,
    			vertex_positions,
    			vertex_count,
    			vertex_positions_stride,
    			max_vertices,
    			min_triangles,
    			max_triangles,
    			fill_weight
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#meshopt_buildMeshletsSpatial].
    public static long meshopt_buildMeshletsSpatial(
    	NativeStructArray<MeshoptMeshlet> meshlets,
    	NativeIntArray meshlet_vertices,
    	NativeByteArray meshlet_triangles,
    	NativeIntArray indices,
    	long index_count,
    	NativeFloatArray vertex_positions,
    	long vertex_count,
    	long vertex_positions_stride,
    	long max_vertices,
    	long min_triangles,
    	long max_triangles,
    	float fill_weight
    ) {
    	return meshopt_buildMeshletsSpatial(
    		meshlets.memorySegment(),
    		meshlet_vertices.memorySegment(),
    		meshlet_triangles.memorySegment(),
    		indices.memorySegment(),
    		index_count,
    		vertex_positions.memorySegment(),
    		vertex_count,
    		vertex_positions_stride,
    		max_vertices,
    		min_triangles,
    		max_triangles,
    		fill_weight
    	);
    }
    
    /// ```
    /// 
    /// Meshlet optimizer
    /// Reorders meshlet vertices and triangles to maximize locality which can improve rasterizer throughput or ray tracing performance when using fast-build modes.
    /// 
    /// meshlet_triangles and meshlet_vertices must refer to meshlet data; when buildMeshlets* is used, these need to be computed from meshlet's vertex_offset and triangle_offset
    /// triangle_count and vertex_count must not exceed implementation limits (vertex_count <= 256, triangle_count <= 512)
    /// ```
    public static void meshopt_optimizeMeshlet(
    	MemorySegment meshlet_vertices,
    	MemorySegment meshlet_triangles,
    	long triangle_count,
    	long vertex_count
    ) {
    	MethodHandle method = MESHOPT_OPTIMIZE_MESHLET.get();
    	try {
    		 method.invokeExact(
    			meshlet_vertices,
    			meshlet_triangles,
    			triangle_count,
    			vertex_count
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#meshopt_optimizeMeshlet].
    public static void meshopt_optimizeMeshlet(
    	NativeIntArray meshlet_vertices,
    	NativeByteArray meshlet_triangles,
    	long triangle_count,
    	long vertex_count
    ) {
    	meshopt_optimizeMeshlet(
    		meshlet_vertices.memorySegment(),
    		meshlet_triangles.memorySegment(),
    		triangle_count,
    		vertex_count
    	);
    }
    
    /// ```
    /// 
    /// Meshlet optimizer
    /// Reorders meshlet vertices and triangles to maximize locality, with higher levels resulting in smaller compressed size at the cost of optimization time.
    /// At level 0 the result is equivalent to meshopt_optimizeMeshlet; levels >= 1 may rotate triangle corners to improve compression (which can change provoking vertex and affect OMM data).
    /// 
    /// level should be in the range [0, 9] with 0 equivalent to meshopt_optimizeMeshlet and 9 being the slowest; the sweet spot for compression ratio is around 3
    /// ```
    public static void meshopt_optimizeMeshletLevel(
    	MemorySegment meshlet_vertices,
    	long vertex_count,
    	MemorySegment meshlet_triangles,
    	long triangle_count,
    	int level
    ) {
    	MethodHandle method = MESHOPT_OPTIMIZE_MESHLET_LEVEL.get();
    	try {
    		 method.invokeExact(
    			meshlet_vertices,
    			vertex_count,
    			meshlet_triangles,
    			triangle_count,
    			level
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#meshopt_optimizeMeshletLevel].
    public static void meshopt_optimizeMeshletLevel(
    	NativeIntArray meshlet_vertices,
    	long vertex_count,
    	NativeByteArray meshlet_triangles,
    	long triangle_count,
    	int level
    ) {
    	meshopt_optimizeMeshletLevel(
    		meshlet_vertices.memorySegment(),
    		vertex_count,
    		meshlet_triangles.memorySegment(),
    		triangle_count,
    		level
    	);
    }
    
    /// ```
    /// 
    /// Cluster bounds generator
    /// Creates bounding volumes that can be used for frustum, backface and occlusion culling.
    /// 
    /// For backface culling with orthographic projection, use the following formula to reject backfacing clusters:
    /// dot(view, cone_axis) >= cone_cutoff
    /// 
    /// For perspective projection, you can use the formula that needs cone apex in addition to axis & cutoff:
    /// dot(normalize(cone_apex - camera_position), cone_axis) >= cone_cutoff
    /// 
    /// Alternatively, you can use the formula that doesn't need cone apex and uses bounding sphere instead:
    /// dot(normalize(center - camera_position), cone_axis) >= cone_cutoff + radius / length(center - camera_position)
    /// or an equivalent formula that doesn't have a singularity at center = camera_position:
    /// dot(center - camera_position, cone_axis) >= cone_cutoff * length(center - camera_position) + radius
    /// 
    /// The formula that uses the apex is slightly more accurate but needs the apex; if you are already using bounding sphere
    /// to do frustum/occlusion culling, the formula that doesn't use the apex may be preferable (for derivation see
    /// Real-Time Rendering 4th Edition, section 19.3).
    /// 
    /// vertex_positions should have float3 position in the first 12 bytes of each vertex
    /// vertex_count should specify the number of vertices in the entire mesh, not cluster or meshlet
    /// indices should have at most 256 unique vertex indices
    /// index_count/3 and triangle_count must not exceed implementation limits (<= 512)
    /// ```
    public static MemorySegment meshopt_computeClusterBounds(
    	SegmentAllocator allocator,
    	MemorySegment indices,
    	long index_count,
    	MemorySegment vertex_positions,
    	long vertex_count,
    	long vertex_positions_stride
    ) {
    	MethodHandle method = MESHOPT_COMPUTE_CLUSTER_BOUNDS.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			indices,
    			index_count,
    			vertex_positions,
    			vertex_count,
    			vertex_positions_stride
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#meshopt_computeClusterBounds].
    public static @Nullable MeshoptBounds meshopt_computeClusterBounds(
    	SegmentAllocator allocator,
    	NativeIntArray indices,
    	long index_count,
    	NativeFloatArray vertex_positions,
    	long vertex_count,
    	long vertex_positions_stride
    ) {
    	MemorySegment segment = meshopt_computeClusterBounds(
    		allocator,
    		indices.memorySegment(),
    		index_count,
    		vertex_positions.memorySegment(),
    		vertex_count,
    		vertex_positions_stride
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MeshoptBounds(segment);
    }
    
    public static MemorySegment meshopt_computeMeshletBounds(
    	SegmentAllocator allocator,
    	MemorySegment meshlet_vertices,
    	MemorySegment meshlet_triangles,
    	long triangle_count,
    	MemorySegment vertex_positions,
    	long vertex_count,
    	long vertex_positions_stride
    ) {
    	MethodHandle method = MESHOPT_COMPUTE_MESHLET_BOUNDS.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			meshlet_vertices,
    			meshlet_triangles,
    			triangle_count,
    			vertex_positions,
    			vertex_count,
    			vertex_positions_stride
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#meshopt_computeMeshletBounds].
    public static @Nullable MeshoptBounds meshopt_computeMeshletBounds(
    	SegmentAllocator allocator,
    	NativeIntArray meshlet_vertices,
    	NativeByteArray meshlet_triangles,
    	long triangle_count,
    	NativeFloatArray vertex_positions,
    	long vertex_count,
    	long vertex_positions_stride
    ) {
    	MemorySegment segment = meshopt_computeMeshletBounds(
    		allocator,
    		meshlet_vertices.memorySegment(),
    		meshlet_triangles.memorySegment(),
    		triangle_count,
    		vertex_positions.memorySegment(),
    		vertex_count,
    		vertex_positions_stride
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MeshoptBounds(segment);
    }
    
    /// ```
    /// 
    /// Sphere bounds generator
    /// Creates bounding sphere around a set of points or a set of spheres; returns the center and radius of the sphere, with other fields of the result set to 0.
    /// 
    /// positions should have float3 position in the first 12 bytes of each element
    /// radii can be NULL; when it's not NULL, it should have a non-negative float radius in the first 4 bytes of each element
    /// ```
    public static MemorySegment meshopt_computeSphereBounds(
    	SegmentAllocator allocator,
    	MemorySegment positions,
    	long count,
    	long positions_stride,
    	MemorySegment radii,
    	long radii_stride
    ) {
    	MethodHandle method = MESHOPT_COMPUTE_SPHERE_BOUNDS.get();
    	try {
    		return (MemorySegment) method.invokeExact(
    			allocator,
    			positions,
    			count,
    			positions_stride,
    			radii,
    			radii_stride
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#meshopt_computeSphereBounds].
    public static @Nullable MeshoptBounds meshopt_computeSphereBounds(
    	SegmentAllocator allocator,
    	NativeFloatArray positions,
    	long count,
    	long positions_stride,
    	@Nullable NativeFloatArray radii,
    	long radii_stride
    ) {
    	MemorySegment segment = meshopt_computeSphereBounds(
    		allocator,
    		positions.memorySegment(),
    		count,
    		positions_stride,
    		radii == null ? MemorySegment.NULL : radii.memorySegment(),
    		radii_stride
    	);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new MeshoptBounds(segment);
    }
    
    /// ```
    /// 
    /// Extract meshlet-local vertex and triangle indices from absolute cluster indices.
    /// Fills triangles[] and vertices[] such that vertices[triangles[i]] == indices[i], and returns the number of unique vertices.
    /// 
    /// vertices must contain enough space for the resulting references (up to 256 elements)
    /// triangles must contain enough space for local indices (index_count elements)
    /// indices should have at most 256 unique vertex indices
    /// index_count/3 must not exceed implementation limits (<= 512)
    /// ```
    public static long meshopt_extractMeshletIndices(
    	MemorySegment vertices,
    	MemorySegment triangles,
    	MemorySegment indices,
    	long index_count
    ) {
    	MethodHandle method = MESHOPT_EXTRACT_MESHLET_INDICES.get();
    	try {
    		return (long) method.invokeExact(
    			vertices,
    			triangles,
    			indices,
    			index_count
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#meshopt_extractMeshletIndices].
    public static long meshopt_extractMeshletIndices(
    	NativeIntArray vertices,
    	NativeByteArray triangles,
    	NativeIntArray indices,
    	long index_count
    ) {
    	return meshopt_extractMeshletIndices(
    		vertices.memorySegment(),
    		triangles.memorySegment(),
    		indices.memorySegment(),
    		index_count
    	);
    }
    
    /// ```
    /// 
    /// Cluster partitioner
    /// Partitions clusters into groups of similar size, prioritizing grouping clusters that share vertices or are close to each other.
    /// When vertex positions are not provided, only clusters that share vertices will be grouped together, which may result in small partitions for some inputs.
    /// 
    /// destination must contain enough space for the resulting partition data (cluster_count elements)
    /// destination[i] will contain the partition id for cluster i, with the total number of partitions returned by the function
    /// cluster_indices should have the vertex indices referenced by each cluster, stored sequentially
    /// cluster_index_counts should have the number of indices in each cluster; sum of all cluster_index_counts must be equal to total_index_count
    /// vertex_positions can be NULL; when it's not NULL, it should have float3 position in the first 12 bytes of each vertex
    /// target_partition_size is a target size for each partition, in clusters; the resulting partitions may be smaller or larger (up to target + target/3)
    /// ```
    public static long meshopt_partitionClusters(
    	MemorySegment destination,
    	MemorySegment cluster_indices,
    	long total_index_count,
    	MemorySegment cluster_index_counts,
    	long cluster_count,
    	MemorySegment vertex_positions,
    	long vertex_count,
    	long vertex_positions_stride,
    	long target_partition_size
    ) {
    	MethodHandle method = MESHOPT_PARTITION_CLUSTERS.get();
    	try {
    		return (long) method.invokeExact(
    			destination,
    			cluster_indices,
    			total_index_count,
    			cluster_index_counts,
    			cluster_count,
    			vertex_positions,
    			vertex_count,
    			vertex_positions_stride,
    			target_partition_size
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#meshopt_partitionClusters].
    public static long meshopt_partitionClusters(
    	NativeIntArray destination,
    	NativeIntArray cluster_indices,
    	long total_index_count,
    	NativeIntArray cluster_index_counts,
    	long cluster_count,
    	NativeFloatArray vertex_positions,
    	long vertex_count,
    	long vertex_positions_stride,
    	long target_partition_size
    ) {
    	return meshopt_partitionClusters(
    		destination.memorySegment(),
    		cluster_indices.memorySegment(),
    		total_index_count,
    		cluster_index_counts.memorySegment(),
    		cluster_count,
    		vertex_positions.memorySegment(),
    		vertex_count,
    		vertex_positions_stride,
    		target_partition_size
    	);
    }
    
    /// ```
    /// 
    /// Spatial sorter
    /// Generates a remap table that can be used to reorder points for spatial locality.
    /// Resulting remap table maps old vertices to new vertices and can be used in meshopt_remapVertexBuffer.
    /// 
    /// destination must contain enough space for the resulting remap table (vertex_count elements)
    /// vertex_positions should have float3 position in the first 12 bytes of each vertex
    /// ```
    public static void meshopt_spatialSortRemap(
    	MemorySegment destination,
    	MemorySegment vertex_positions,
    	long vertex_count,
    	long vertex_positions_stride
    ) {
    	MethodHandle method = MESHOPT_SPATIAL_SORT_REMAP.get();
    	try {
    		 method.invokeExact(
    			destination,
    			vertex_positions,
    			vertex_count,
    			vertex_positions_stride
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#meshopt_spatialSortRemap].
    public static void meshopt_spatialSortRemap(
    	NativeIntArray destination,
    	NativeFloatArray vertex_positions,
    	long vertex_count,
    	long vertex_positions_stride
    ) {
    	meshopt_spatialSortRemap(
    		destination.memorySegment(),
    		vertex_positions.memorySegment(),
    		vertex_count,
    		vertex_positions_stride
    	);
    }
    
    /// ```
    /// 
    /// Spatial sorter
    /// Reorders triangles for spatial locality, and generates a new index buffer. The resulting index buffer can be used with other functions like optimizeVertexCache.
    /// 
    /// destination must contain enough space for the resulting index buffer (index_count elements)
    /// vertex_positions should have float3 position in the first 12 bytes of each vertex
    /// ```
    public static void meshopt_spatialSortTriangles(
    	MemorySegment destination,
    	MemorySegment indices,
    	long index_count,
    	MemorySegment vertex_positions,
    	long vertex_count,
    	long vertex_positions_stride
    ) {
    	MethodHandle method = MESHOPT_SPATIAL_SORT_TRIANGLES.get();
    	try {
    		 method.invokeExact(
    			destination,
    			indices,
    			index_count,
    			vertex_positions,
    			vertex_count,
    			vertex_positions_stride
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#meshopt_spatialSortTriangles].
    public static void meshopt_spatialSortTriangles(
    	NativeIntArray destination,
    	NativeIntArray indices,
    	long index_count,
    	NativeFloatArray vertex_positions,
    	long vertex_count,
    	long vertex_positions_stride
    ) {
    	meshopt_spatialSortTriangles(
    		destination.memorySegment(),
    		indices.memorySegment(),
    		index_count,
    		vertex_positions.memorySegment(),
    		vertex_count,
    		vertex_positions_stride
    	);
    }
    
    /// ```
    /// 
    /// Spatial clusterizer
    /// Reorders points into clusters optimized for spatial locality, and generates a new index buffer.
    /// Ensures the output can be split into cluster_size chunks where each chunk has good positional locality. Only the last chunk will be smaller than cluster_size.
    /// 
    /// destination must contain enough space for the resulting index buffer (vertex_count elements)
    /// vertex_positions should have float3 position in the first 12 bytes of each vertex
    /// ```
    public static void meshopt_spatialClusterPoints(
    	MemorySegment destination,
    	MemorySegment vertex_positions,
    	long vertex_count,
    	long vertex_positions_stride,
    	long cluster_size
    ) {
    	MethodHandle method = MESHOPT_SPATIAL_CLUSTER_POINTS.get();
    	try {
    		 method.invokeExact(
    			destination,
    			vertex_positions,
    			vertex_count,
    			vertex_positions_stride,
    			cluster_size
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#meshopt_spatialClusterPoints].
    public static void meshopt_spatialClusterPoints(
    	NativeIntArray destination,
    	NativeFloatArray vertex_positions,
    	long vertex_count,
    	long vertex_positions_stride,
    	long cluster_size
    ) {
    	meshopt_spatialClusterPoints(
    		destination.memorySegment(),
    		vertex_positions.memorySegment(),
    		vertex_count,
    		vertex_positions_stride,
    		cluster_size
    	);
    }
    
    /// ```
    /// 
    /// Opacity micromap generator (measure)
    /// Computes a subdivision level for each input triangle, as well as deduplicating the triangles that reference the same UVs to reduce rasterization requests.
    /// Returns the number of OMM entries.
    /// 
    /// levels and sources must contain enough space for the worst case output (index_count/3 elements, one per resulting OMM entry)
    /// levels[i] will contain the subdivision level for entry i, with the total number of entries returned by the function; each entry should be rasterized from triangle index sources[i]
    /// omm_indices must contain enough space for the resulting OMM indices (index_count/3 elements, one per triangle)
    /// vertex_uvs should have float2 texture coordinate in the first 8 bytes of each vertex
    /// max_level specifies the maximum subdivision level (0..12)
    /// target_edge can be 0; when >0, triangle subdivision is adaptive and targets target_edge^2 texel area
    /// ```
    public static long meshopt_opacityMapMeasure(
    	MemorySegment levels,
    	MemorySegment sources,
    	MemorySegment omm_indices,
    	MemorySegment indices,
    	long index_count,
    	MemorySegment vertex_uvs,
    	long vertex_count,
    	long vertex_uvs_stride,
    	int texture_width,
    	int texture_height,
    	int max_level,
    	float target_edge
    ) {
    	MethodHandle method = MESHOPT_OPACITY_MAP_MEASURE.get();
    	try {
    		return (long) method.invokeExact(
    			levels,
    			sources,
    			omm_indices,
    			indices,
    			index_count,
    			vertex_uvs,
    			vertex_count,
    			vertex_uvs_stride,
    			texture_width,
    			texture_height,
    			max_level,
    			target_edge
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#meshopt_opacityMapMeasure].
    public static long meshopt_opacityMapMeasure(
    	NativeByteArray levels,
    	NativeIntArray sources,
    	NativeIntArray omm_indices,
    	NativeIntArray indices,
    	long index_count,
    	NativeFloatArray vertex_uvs,
    	long vertex_count,
    	long vertex_uvs_stride,
    	int texture_width,
    	int texture_height,
    	int max_level,
    	float target_edge
    ) {
    	return meshopt_opacityMapMeasure(
    		levels.memorySegment(),
    		sources.memorySegment(),
    		omm_indices.memorySegment(),
    		indices.memorySegment(),
    		index_count,
    		vertex_uvs.memorySegment(),
    		vertex_count,
    		vertex_uvs_stride,
    		texture_width,
    		texture_height,
    		max_level,
    		target_edge
    	);
    }
    
    /// ```
    /// 
    /// Opacity micromap generator (rasterize)
    /// Rasterizes opacity state for a single triangle entry by sampling the alpha texture, using bilinear filtering and 0.5 alpha cutoff.
    /// 
    /// result should contain enough space for the output opacity data (which can be computed using meshopt_opacityMapEntrySize)
    /// level specifies the subdivision level (0..12)
    /// states should be 2 for 2-state format (opaque/transparent) and 4 for 4-state format (opaque/transparent/unknown)
    /// uv0/uv1/uv2 should refer to a float2 texture coordinate for each triangle corner; note that micromap data is sensitive to the corner order
    /// texture_data should point to the alpha channel of the first pixel, encoded as UNORM8
    /// texture_stride specifies the distance in bytes between consecutive pixels, e.g. 4 for RGBA input
    /// texture_pitch specifies the distance in bytes between consecutive rows, e.g. 4*texture_width for tightly packed RGBA input
    /// ```
    public static void meshopt_opacityMapRasterize(
    	MemorySegment result,
    	int level,
    	int states,
    	MemorySegment uv0,
    	MemorySegment uv1,
    	MemorySegment uv2,
    	MemorySegment texture_data,
    	long texture_stride,
    	long texture_pitch,
    	int texture_width,
    	int texture_height
    ) {
    	MethodHandle method = MESHOPT_OPACITY_MAP_RASTERIZE.get();
    	try {
    		 method.invokeExact(
    			result,
    			level,
    			states,
    			uv0,
    			uv1,
    			uv2,
    			texture_data,
    			texture_stride,
    			texture_pitch,
    			texture_width,
    			texture_height
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#meshopt_opacityMapRasterize].
    public static void meshopt_opacityMapRasterize(
    	NativeByteArray result,
    	int level,
    	int states,
    	NativeFloatArray uv0,
    	NativeFloatArray uv1,
    	NativeFloatArray uv2,
    	NativeByteArray texture_data,
    	long texture_stride,
    	long texture_pitch,
    	int texture_width,
    	int texture_height
    ) {
    	meshopt_opacityMapRasterize(
    		result.memorySegment(),
    		level,
    		states,
    		uv0.memorySegment(),
    		uv1.memorySegment(),
    		uv2.memorySegment(),
    		texture_data.memorySegment(),
    		texture_stride,
    		texture_pitch,
    		texture_width,
    		texture_height
    	);
    }
    
    public static long meshopt_opacityMapEntrySize(
    	int level,
    	int states
    ) {
    	MethodHandle method = MESHOPT_OPACITY_MAP_ENTRY_SIZE.get();
    	try {
    		return (long) method.invokeExact(
    			level,
    			states
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// 
    /// Opacity micromap generator (compact)
    /// Compacts and deduplicates opacity data, merging identical micromap entries and replacing micromap states with special indices (-4..-1) when possible.
    /// Returns the number of OMM entries after compaction; the data array should be trimmed using the last offset/size.
    /// 
    /// data should contain opacity data for all input/output entries
    /// levels should contain subdivision levels for all input/output entries
    /// offsets should contain offset into data[] for each entry
    /// levels[i] and offsets[i] will be updated with post-compaction level/offset for entry i, with the total number of entries returned by the function
    /// omm_indices should contain indices into the original OMM data, and will be updated with a new index or a special index (-4..-1) when possible
    /// states should be 2 for 2-state format (opaque/transparent) and 4 for 4-state format (opaque/transparent/unknown)
    /// ```
    public static long meshopt_opacityMapCompact(
    	MemorySegment data,
    	long data_size,
    	MemorySegment levels,
    	MemorySegment offsets,
    	long omm_count,
    	MemorySegment omm_indices,
    	long triangle_count,
    	int states
    ) {
    	MethodHandle method = MESHOPT_OPACITY_MAP_COMPACT.get();
    	try {
    		return (long) method.invokeExact(
    			data,
    			data_size,
    			levels,
    			offsets,
    			omm_count,
    			omm_indices,
    			triangle_count,
    			states
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#meshopt_opacityMapCompact].
    public static long meshopt_opacityMapCompact(
    	NativeByteArray data,
    	long data_size,
    	NativeByteArray levels,
    	NativeIntArray offsets,
    	long omm_count,
    	NativeIntArray omm_indices,
    	long triangle_count,
    	int states
    ) {
    	return meshopt_opacityMapCompact(
    		data.memorySegment(),
    		data_size,
    		levels.memorySegment(),
    		offsets.memorySegment(),
    		omm_count,
    		omm_indices.memorySegment(),
    		triangle_count,
    		states
    	);
    }
    
    /// ```
    /// 
    /// Tangent space generator
    /// Computes per-corner tangent vectors; for each corner, computes normalized tangent vector (xyz) and orientation (w, +/-1).
    /// Bitangent can be reconstructed via cross(normal, tangent.xyz) * tangent.w.
    /// To apply tangents to the mesh, either deindex and reindex it with the tangent stream, or copy tangents to existing vertex data while duplicating
    /// vertices with different tangent vectors (e.g. on UV mirror seams).
    /// Input can be indexed or unindexed (indices=NULL); this does not affect the resulting tangents, but indexed inputs are faster to process.
    /// 
    /// result must contain enough space for the output tangent data (index_count*4 elements)
    /// indices can be NULL if the input is unindexed
    /// vertex_positions should have float3 position in the first 12 bytes of each vertex
    /// vertex_normals should have unit float3 normal in the first 12 bytes of each vertex
    /// vertex_uvs should have float2 texture coordinate in the first 8 bytes of each vertex
    /// ```
    public static void meshopt_generateTangents(
    	MemorySegment result,
    	MemorySegment indices,
    	long index_count,
    	MemorySegment vertex_positions,
    	long vertex_count,
    	long vertex_positions_stride,
    	MemorySegment vertex_normals,
    	long vertex_normals_stride,
    	MemorySegment vertex_uvs,
    	long vertex_uvs_stride,
    	int options
    ) {
    	MethodHandle method = MESHOPT_GENERATE_TANGENTS.get();
    	try {
    		 method.invokeExact(
    			result,
    			indices,
    			index_count,
    			vertex_positions,
    			vertex_count,
    			vertex_positions_stride,
    			vertex_normals,
    			vertex_normals_stride,
    			vertex_uvs,
    			vertex_uvs_stride,
    			options
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#meshopt_generateTangents].
    public static void meshopt_generateTangents(
    	NativeFloatArray result,
    	@Nullable NativeIntArray indices,
    	long index_count,
    	NativeFloatArray vertex_positions,
    	long vertex_count,
    	long vertex_positions_stride,
    	NativeFloatArray vertex_normals,
    	long vertex_normals_stride,
    	NativeFloatArray vertex_uvs,
    	long vertex_uvs_stride,
    	int options
    ) {
    	meshopt_generateTangents(
    		result.memorySegment(),
    		indices == null ? MemorySegment.NULL : indices.memorySegment(),
    		index_count,
    		vertex_positions.memorySegment(),
    		vertex_count,
    		vertex_positions_stride,
    		vertex_normals.memorySegment(),
    		vertex_normals_stride,
    		vertex_uvs.memorySegment(),
    		vertex_uvs_stride,
    		options
    	);
    }
    
    /// ```
    /// 
    /// Experimental: Normal generator
    /// Computes per-corner normal vectors; normals are averaged across soft edges, using crease angle to determine which edges are hard.
    /// To apply normals to the mesh, either deindex and reindex it with the normal stream, or copy normals to existing vertex data while duplicating
    /// vertices with different normal vectors (on normal seams).
    /// Input can be indexed or unindexed (indices=NULL); this does not affect the resulting normals, but indexed inputs are faster to process.
    /// 
    /// result must contain enough space for the output normal data (index_count*3 elements)
    /// indices can be NULL if the input is unindexed
    /// vertex_positions should have float3 position in the first 12 bytes of each vertex
    /// crease_angle specifies the angle in radians below which normals are averaged across edges
    /// smoothing specifies the amount of smoothing to apply to resulting normals as a post-process; larger smoothing values take longer, with the recommended range being [0..5].
    /// ```
    public static void meshopt_generateNormals(
    	MemorySegment result,
    	MemorySegment indices,
    	long index_count,
    	MemorySegment vertex_positions,
    	long vertex_count,
    	long vertex_positions_stride,
    	float crease_angle,
    	float smoothing
    ) {
    	MethodHandle method = MESHOPT_GENERATE_NORMALS.get();
    	try {
    		 method.invokeExact(
    			result,
    			indices,
    			index_count,
    			vertex_positions,
    			vertex_count,
    			vertex_positions_stride,
    			crease_angle,
    			smoothing
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#meshopt_generateNormals].
    public static void meshopt_generateNormals(
    	NativeFloatArray result,
    	NativeIntArray indices,
    	long index_count,
    	NativeFloatArray vertex_positions,
    	long vertex_count,
    	long vertex_positions_stride,
    	float crease_angle,
    	float smoothing
    ) {
    	meshopt_generateNormals(
    		result.memorySegment(),
    		indices.memorySegment(),
    		index_count,
    		vertex_positions.memorySegment(),
    		vertex_count,
    		vertex_positions_stride,
    		crease_angle,
    		smoothing
    	);
    }
    
    /// ```
    /// 
    /// Experimental: Voxel remesher
    /// Generates a new mesh that approximates or refines the original mesh, attempting to preserve mesh appearance at a given voxel resolution.
    /// The original topology is not preserved; features that are closer than the voxel size may be merged, and small gaps in the original mesh may be closed.
    /// Returns the number of triangles in the new mesh, with destination containing a vertex position for each triangle corner.
    /// 
    /// destination can be NULL; when it's not NULL, it must contain enough space for the resulting triangle buffer (max_triangle_count * 3 vertices, 3 floats per vertex)
    /// max_triangle_count is the number of triangles that can be written; when destination is NULL or insufficiently large, the returned value is an upper bound on the number of triangles
    /// vertex_positions should have float3 position in the first 12 bytes of each vertex
    /// resolution is the dimension of the internal voxel grid and should be in the range [4, 256]
    /// options must be a bitmask composed of meshopt_RemeshX options; 0 is a safe default
    /// ```
    public static long meshopt_remesh(
    	MemorySegment destination,
    	long max_triangle_count,
    	MemorySegment indices,
    	long index_count,
    	MemorySegment vertex_positions,
    	long vertex_count,
    	long vertex_positions_stride,
    	int resolution,
    	int options
    ) {
    	MethodHandle method = MESHOPT_REMESH.get();
    	try {
    		return (long) method.invokeExact(
    			destination,
    			max_triangle_count,
    			indices,
    			index_count,
    			vertex_positions,
    			vertex_count,
    			vertex_positions_stride,
    			resolution,
    			options
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#meshopt_remesh].
    public static long meshopt_remesh(
    	@Nullable NativeFloatArray destination,
    	long max_triangle_count,
    	NativeIntArray indices,
    	long index_count,
    	NativeFloatArray vertex_positions,
    	long vertex_count,
    	long vertex_positions_stride,
    	int resolution,
    	int options
    ) {
    	return meshopt_remesh(
    		destination == null ? MemorySegment.NULL : destination.memorySegment(),
    		max_triangle_count,
    		indices.memorySegment(),
    		index_count,
    		vertex_positions.memorySegment(),
    		vertex_count,
    		vertex_positions_stride,
    		resolution,
    		options
    	);
    }
    
    /// ```
    /// 
    /// Quantize a float into half-precision (as defined by IEEE-754 fp16) floating point value
    /// Generates +-inf for overflow, preserves NaN, flushes denormals to zero, rounds to nearest
    /// Representable magnitude range: [6e-5; 65504]
    /// Maximum relative reconstruction error: 5e-4
    /// ```
    public static short meshopt_quantizeHalf(
    	float v
    ) {
    	MethodHandle method = MESHOPT_QUANTIZE_HALF.get();
    	try {
    		return (short) method.invokeExact(
    			v
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// 
    /// Quantize a float into a floating point value with a limited number of significant mantissa bits, preserving the IEEE-754 fp32 binary representation
    /// Preserves infinities/NaN, flushes denormals to zero, rounds to nearest
    /// Assumes N is in a valid mantissa precision range, which is 1..23
    /// ```
    public static float meshopt_quantizeFloat(
    	float v,
    	int N
    ) {
    	MethodHandle method = MESHOPT_QUANTIZE_FLOAT.get();
    	try {
    		return (float) method.invokeExact(
    			v,
    			N
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// 
    /// Reverse quantization of a half-precision (as defined by IEEE-754 fp16) floating point value
    /// Preserves Inf/NaN, flushes denormals to zero
    /// ```
    public static float meshopt_dequantizeHalf(
    	short h
    ) {
    	MethodHandle method = MESHOPT_DEQUANTIZE_HALF.get();
    	try {
    		return (float) method.invokeExact(
    			h
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// ```
    /// 
    /// Compute shared exponent suitable for mesh/cluster position quantization
    /// Given mesh or cluster bounds, compute a shared exponent that can be used to quantize any position inside the bounds to a 24-bit integer grid.
    /// The resulting output can be stored as a compact bit-stream to be decoded directly in shaders, or to be used as an input to RT BVH builders,
    /// for example via D3D12_VERTEX_FORMAT_COMPRESSED1 in DXR2 (max_bits=16).
    /// 
    /// To quantize positions, compute:
    /// scale = pow(2, exponent)
    /// iv = int(round(v / scale))
    /// The resulting integer can be stored as signed 24-bit, or as an unsigned offset from a signed 24-bit anchor value, shared between all positions.
    /// 
    /// minv/maxv specify the axis-aligned bounding box of the mesh or cluster; each should refer to a float3 value
    /// min_exp specifies the minimum value for the returned exponent, limiting precision to reduce size; e.g. min_exp = -10 limits precision to 1mm given metric units
    /// max_bits specifies the maximum allowed number of bits for the quantized integer range (offset from anchor is an unsigned integer up to 2^max_bits-1)
    /// ```
    public static int meshopt_computePositionExponent(
    	MemorySegment minv,
    	MemorySegment maxv,
    	int min_exp,
    	int max_bits
    ) {
    	MethodHandle method = MESHOPT_COMPUTE_POSITION_EXPONENT.get();
    	try {
    		return (int) method.invokeExact(
    			minv,
    			maxv,
    			min_exp,
    			max_bits
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#meshopt_computePositionExponent].
    public static int meshopt_computePositionExponent(
    	NativeFloatArray minv,
    	NativeFloatArray maxv,
    	int min_exp,
    	int max_bits
    ) {
    	return meshopt_computePositionExponent(
    		minv.memorySegment(),
    		maxv.memorySegment(),
    		min_exp,
    		max_bits
    	);
    }
    
    /// ```
    /// 
    /// Set allocation callbacks
    /// These callbacks will be used instead of the default operator new/operator delete for all temporary allocations in the library.
    /// Note that all algorithms only allocate memory for temporary use.
    /// allocate/deallocate are always called in a stack-like order - last pointer to be allocated is deallocated first.
    /// This function is not thread safe and must not be called concurrently with any other meshopt_ function.
    /// 
    /// In shared library builds, allocations from templated index wrappers in this header will only be redirected if MESHOPTIMIZER_ALLOC_EXPORT is defined.
    /// ```
    public static void meshopt_setAllocator(
    	MemorySegment allocate,
    	MemorySegment deallocate
    ) {
    	MethodHandle method = MESHOPT_SET_ALLOCATOR.get();
    	try {
    		 method.invokeExact(
    			allocate,
    			deallocate
    		);
    	} catch (Throwable e) {
    		throw new RuntimeException(e);
    	}
    }
    
    /// Typed method of [#meshopt_setAllocator].
    public static void meshopt_setAllocator(
    	MeshoptAllocateFunction allocate,
    	MeshoptDeallocateFunction deallocate
    ) {
    	meshopt_setAllocator(
    		allocate.memorySegment(),
    		deallocate.memorySegment()
    	);
    }

}