/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkVideoEncodeAV1CapabilitiesKHR
		implements Struct<VkVideoEncodeAV1CapabilitiesKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle FLAGS_HANDLE;
	public static final VarHandle MAX_LEVEL_HANDLE;
	public static final VarHandle SUPERBLOCK_SIZES_HANDLE;
	public static final VarHandle MAX_SINGLE_REFERENCE_COUNT_HANDLE;
	public static final VarHandle SINGLE_REFERENCE_NAME_MASK_HANDLE;
	public static final VarHandle MAX_UNIDIRECTIONAL_COMPOUND_REFERENCE_COUNT_HANDLE;
	public static final VarHandle MAX_UNIDIRECTIONAL_COMPOUND_GROUP1_REFERENCE_COUNT_HANDLE;
	public static final VarHandle UNIDIRECTIONAL_COMPOUND_REFERENCE_NAME_MASK_HANDLE;
	public static final VarHandle MAX_BIDIRECTIONAL_COMPOUND_REFERENCE_COUNT_HANDLE;
	public static final VarHandle MAX_BIDIRECTIONAL_COMPOUND_GROUP1_REFERENCE_COUNT_HANDLE;
	public static final VarHandle MAX_BIDIRECTIONAL_COMPOUND_GROUP2_REFERENCE_COUNT_HANDLE;
	public static final VarHandle BIDIRECTIONAL_COMPOUND_REFERENCE_NAME_MASK_HANDLE;
	public static final VarHandle MAX_TEMPORAL_LAYER_COUNT_HANDLE;
	public static final VarHandle MAX_SPATIAL_LAYER_COUNT_HANDLE;
	public static final VarHandle MAX_OPERATING_POINTS_HANDLE;
	public static final VarHandle MIN_QINDEX_HANDLE;
	public static final VarHandle MAX_QINDEX_HANDLE;
	public static final VarHandle PREFERS_GOP_REMAINING_FRAMES_HANDLE;
	public static final VarHandle REQUIRES_GOP_REMAINING_FRAMES_HANDLE;
	public static final VarHandle STD_SYNTAX_FLAGS_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long FLAGS_BYTE_OFFSET;
	public static final long MAX_LEVEL_BYTE_OFFSET;
	public static final long CODED_PICTURE_ALIGNMENT_BYTE_OFFSET;
	public static final long MAX_TILES_BYTE_OFFSET;
	public static final long MIN_TILE_SIZE_BYTE_OFFSET;
	public static final long MAX_TILE_SIZE_BYTE_OFFSET;
	public static final long SUPERBLOCK_SIZES_BYTE_OFFSET;
	public static final long MAX_SINGLE_REFERENCE_COUNT_BYTE_OFFSET;
	public static final long SINGLE_REFERENCE_NAME_MASK_BYTE_OFFSET;
	public static final long MAX_UNIDIRECTIONAL_COMPOUND_REFERENCE_COUNT_BYTE_OFFSET;
	public static final long MAX_UNIDIRECTIONAL_COMPOUND_GROUP1_REFERENCE_COUNT_BYTE_OFFSET;
	public static final long UNIDIRECTIONAL_COMPOUND_REFERENCE_NAME_MASK_BYTE_OFFSET;
	public static final long MAX_BIDIRECTIONAL_COMPOUND_REFERENCE_COUNT_BYTE_OFFSET;
	public static final long MAX_BIDIRECTIONAL_COMPOUND_GROUP1_REFERENCE_COUNT_BYTE_OFFSET;
	public static final long MAX_BIDIRECTIONAL_COMPOUND_GROUP2_REFERENCE_COUNT_BYTE_OFFSET;
	public static final long BIDIRECTIONAL_COMPOUND_REFERENCE_NAME_MASK_BYTE_OFFSET;
	public static final long MAX_TEMPORAL_LAYER_COUNT_BYTE_OFFSET;
	public static final long MAX_SPATIAL_LAYER_COUNT_BYTE_OFFSET;
	public static final long MAX_OPERATING_POINTS_BYTE_OFFSET;
	public static final long MIN_QINDEX_BYTE_OFFSET;
	public static final long MAX_QINDEX_BYTE_OFFSET;
	public static final long PREFERS_GOP_REMAINING_FRAMES_BYTE_OFFSET;
	public static final long REQUIRES_GOP_REMAINING_FRAMES_BYTE_OFFSET;
	public static final long STD_SYNTAX_FLAGS_BYTE_OFFSET;

	private final MemorySegment segment;

	private final VkExtent2D codedPictureAlignment;
	private final VkExtent2D maxTiles;
	private final VkExtent2D minTileSize;
	private final VkExtent2D maxTileSize;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("flags"),
		    JAVA_INT.withName("maxLevel"),
		    VkExtent2D.LAYOUT.withName("codedPictureAlignment"),
		    VkExtent2D.LAYOUT.withName("maxTiles"),
		    VkExtent2D.LAYOUT.withName("minTileSize"),
		    VkExtent2D.LAYOUT.withName("maxTileSize"),
		    JAVA_INT.withName("superblockSizes"),
		    JAVA_INT.withName("maxSingleReferenceCount"),
		    JAVA_INT.withName("singleReferenceNameMask"),
		    JAVA_INT.withName("maxUnidirectionalCompoundReferenceCount"),
		    JAVA_INT.withName("maxUnidirectionalCompoundGroup1ReferenceCount"),
		    JAVA_INT.withName("unidirectionalCompoundReferenceNameMask"),
		    JAVA_INT.withName("maxBidirectionalCompoundReferenceCount"),
		    JAVA_INT.withName("maxBidirectionalCompoundGroup1ReferenceCount"),
		    JAVA_INT.withName("maxBidirectionalCompoundGroup2ReferenceCount"),
		    JAVA_INT.withName("bidirectionalCompoundReferenceNameMask"),
		    JAVA_INT.withName("maxTemporalLayerCount"),
		    JAVA_INT.withName("maxSpatialLayerCount"),
		    JAVA_INT.withName("maxOperatingPoints"),
		    JAVA_INT.withName("minQIndex"),
		    JAVA_INT.withName("maxQIndex"),
		    JAVA_INT.withName("prefersGopRemainingFrames"),
		    JAVA_INT.withName("requiresGopRemainingFrames"),
		    JAVA_INT.withName("stdSyntaxFlags")
		).withName("VkVideoEncodeAV1CapabilitiesKHR").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
		MAX_LEVEL_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxLevel"));
		SUPERBLOCK_SIZES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("superblockSizes"));
		MAX_SINGLE_REFERENCE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxSingleReferenceCount"));
		SINGLE_REFERENCE_NAME_MASK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("singleReferenceNameMask"));
		MAX_UNIDIRECTIONAL_COMPOUND_REFERENCE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxUnidirectionalCompoundReferenceCount"));
		MAX_UNIDIRECTIONAL_COMPOUND_GROUP1_REFERENCE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxUnidirectionalCompoundGroup1ReferenceCount"));
		UNIDIRECTIONAL_COMPOUND_REFERENCE_NAME_MASK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("unidirectionalCompoundReferenceNameMask"));
		MAX_BIDIRECTIONAL_COMPOUND_REFERENCE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxBidirectionalCompoundReferenceCount"));
		MAX_BIDIRECTIONAL_COMPOUND_GROUP1_REFERENCE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxBidirectionalCompoundGroup1ReferenceCount"));
		MAX_BIDIRECTIONAL_COMPOUND_GROUP2_REFERENCE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxBidirectionalCompoundGroup2ReferenceCount"));
		BIDIRECTIONAL_COMPOUND_REFERENCE_NAME_MASK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("bidirectionalCompoundReferenceNameMask"));
		MAX_TEMPORAL_LAYER_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxTemporalLayerCount"));
		MAX_SPATIAL_LAYER_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxSpatialLayerCount"));
		MAX_OPERATING_POINTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxOperatingPoints"));
		MIN_QINDEX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("minQIndex"));
		MAX_QINDEX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxQIndex"));
		PREFERS_GOP_REMAINING_FRAMES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("prefersGopRemainingFrames"));
		REQUIRES_GOP_REMAINING_FRAMES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("requiresGopRemainingFrames"));
		STD_SYNTAX_FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("stdSyntaxFlags"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
		MAX_LEVEL_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxLevel"));
		CODED_PICTURE_ALIGNMENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("codedPictureAlignment"));
		MAX_TILES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxTiles"));
		MIN_TILE_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("minTileSize"));
		MAX_TILE_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxTileSize"));
		SUPERBLOCK_SIZES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("superblockSizes"));
		MAX_SINGLE_REFERENCE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxSingleReferenceCount"));
		SINGLE_REFERENCE_NAME_MASK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("singleReferenceNameMask"));
		MAX_UNIDIRECTIONAL_COMPOUND_REFERENCE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxUnidirectionalCompoundReferenceCount"));
		MAX_UNIDIRECTIONAL_COMPOUND_GROUP1_REFERENCE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxUnidirectionalCompoundGroup1ReferenceCount"));
		UNIDIRECTIONAL_COMPOUND_REFERENCE_NAME_MASK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("unidirectionalCompoundReferenceNameMask"));
		MAX_BIDIRECTIONAL_COMPOUND_REFERENCE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxBidirectionalCompoundReferenceCount"));
		MAX_BIDIRECTIONAL_COMPOUND_GROUP1_REFERENCE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxBidirectionalCompoundGroup1ReferenceCount"));
		MAX_BIDIRECTIONAL_COMPOUND_GROUP2_REFERENCE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxBidirectionalCompoundGroup2ReferenceCount"));
		BIDIRECTIONAL_COMPOUND_REFERENCE_NAME_MASK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("bidirectionalCompoundReferenceNameMask"));
		MAX_TEMPORAL_LAYER_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxTemporalLayerCount"));
		MAX_SPATIAL_LAYER_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxSpatialLayerCount"));
		MAX_OPERATING_POINTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxOperatingPoints"));
		MIN_QINDEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("minQIndex"));
		MAX_QINDEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxQIndex"));
		PREFERS_GOP_REMAINING_FRAMES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("prefersGopRemainingFrames"));
		REQUIRES_GOP_REMAINING_FRAMES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("requiresGopRemainingFrames"));
		STD_SYNTAX_FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("stdSyntaxFlags"));
		//@formatter:on
	}

	public VkVideoEncodeAV1CapabilitiesKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkVideoEncodeAV1CapabilitiesKHR(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkVideoEncodeAV1CapabilitiesKHR(MemorySegment segment) {
	    this.segment = segment;
	
	    codedPictureAlignment = new VkExtent2D(segment.asSlice(CODED_PICTURE_ALIGNMENT_BYTE_OFFSET, VkExtent2D.LAYOUT));
	    maxTiles = new VkExtent2D(segment.asSlice(MAX_TILES_BYTE_OFFSET, VkExtent2D.LAYOUT));
	    minTileSize = new VkExtent2D(segment.asSlice(MIN_TILE_SIZE_BYTE_OFFSET, VkExtent2D.LAYOUT));
	    maxTileSize = new VkExtent2D(segment.asSlice(MAX_TILE_SIZE_BYTE_OFFSET, VkExtent2D.LAYOUT));
	}

    /// @see #sType()
    public VkVideoEncodeAV1CapabilitiesKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkVideoEncodeAV1CapabilitiesKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #flags()
    public VkVideoEncodeAV1CapabilitiesKHR flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxLevel()
    public VkVideoEncodeAV1CapabilitiesKHR maxLevel(int maxLevel) {
    	MAX_LEVEL_HANDLE.set(segment, 0L, maxLevel);
    	return this;
    }
    
    public int maxLevel() {
    	return (int) MAX_LEVEL_HANDLE.get(segment, 0L);
    }
    
    /// @see #codedPictureAlignment()
    public VkVideoEncodeAV1CapabilitiesKHR codedPictureAlignment(Consumer<VkExtent2D> consumer) {
    	consumer.accept(codedPictureAlignment);
    	return this;
    }
    
    /// @see #codedPictureAlignment()
    public VkVideoEncodeAV1CapabilitiesKHR codedPictureAlignment(VkExtent2D other) {
    	codedPictureAlignment.set(other);
    	return this;
    }
    
    public VkExtent2D codedPictureAlignment() {
    	return codedPictureAlignment;
    }
    
    /// @see #maxTiles()
    public VkVideoEncodeAV1CapabilitiesKHR maxTiles(Consumer<VkExtent2D> consumer) {
    	consumer.accept(maxTiles);
    	return this;
    }
    
    /// @see #maxTiles()
    public VkVideoEncodeAV1CapabilitiesKHR maxTiles(VkExtent2D other) {
    	maxTiles.set(other);
    	return this;
    }
    
    public VkExtent2D maxTiles() {
    	return maxTiles;
    }
    
    /// @see #minTileSize()
    public VkVideoEncodeAV1CapabilitiesKHR minTileSize(Consumer<VkExtent2D> consumer) {
    	consumer.accept(minTileSize);
    	return this;
    }
    
    /// @see #minTileSize()
    public VkVideoEncodeAV1CapabilitiesKHR minTileSize(VkExtent2D other) {
    	minTileSize.set(other);
    	return this;
    }
    
    public VkExtent2D minTileSize() {
    	return minTileSize;
    }
    
    /// @see #maxTileSize()
    public VkVideoEncodeAV1CapabilitiesKHR maxTileSize(Consumer<VkExtent2D> consumer) {
    	consumer.accept(maxTileSize);
    	return this;
    }
    
    /// @see #maxTileSize()
    public VkVideoEncodeAV1CapabilitiesKHR maxTileSize(VkExtent2D other) {
    	maxTileSize.set(other);
    	return this;
    }
    
    public VkExtent2D maxTileSize() {
    	return maxTileSize;
    }
    
    /// @see #superblockSizes()
    public VkVideoEncodeAV1CapabilitiesKHR superblockSizes(int superblockSizes) {
    	SUPERBLOCK_SIZES_HANDLE.set(segment, 0L, superblockSizes);
    	return this;
    }
    
    public int superblockSizes() {
    	return (int) SUPERBLOCK_SIZES_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxSingleReferenceCount()
    public VkVideoEncodeAV1CapabilitiesKHR maxSingleReferenceCount(int maxSingleReferenceCount) {
    	MAX_SINGLE_REFERENCE_COUNT_HANDLE.set(segment, 0L, maxSingleReferenceCount);
    	return this;
    }
    
    public int maxSingleReferenceCount() {
    	return (int) MAX_SINGLE_REFERENCE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #singleReferenceNameMask()
    public VkVideoEncodeAV1CapabilitiesKHR singleReferenceNameMask(int singleReferenceNameMask) {
    	SINGLE_REFERENCE_NAME_MASK_HANDLE.set(segment, 0L, singleReferenceNameMask);
    	return this;
    }
    
    public int singleReferenceNameMask() {
    	return (int) SINGLE_REFERENCE_NAME_MASK_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxUnidirectionalCompoundReferenceCount()
    public VkVideoEncodeAV1CapabilitiesKHR maxUnidirectionalCompoundReferenceCount(int maxUnidirectionalCompoundReferenceCount) {
    	MAX_UNIDIRECTIONAL_COMPOUND_REFERENCE_COUNT_HANDLE.set(segment, 0L, maxUnidirectionalCompoundReferenceCount);
    	return this;
    }
    
    public int maxUnidirectionalCompoundReferenceCount() {
    	return (int) MAX_UNIDIRECTIONAL_COMPOUND_REFERENCE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxUnidirectionalCompoundGroup1ReferenceCount()
    public VkVideoEncodeAV1CapabilitiesKHR maxUnidirectionalCompoundGroup1ReferenceCount(int maxUnidirectionalCompoundGroup1ReferenceCount) {
    	MAX_UNIDIRECTIONAL_COMPOUND_GROUP1_REFERENCE_COUNT_HANDLE.set(segment, 0L, maxUnidirectionalCompoundGroup1ReferenceCount);
    	return this;
    }
    
    public int maxUnidirectionalCompoundGroup1ReferenceCount() {
    	return (int) MAX_UNIDIRECTIONAL_COMPOUND_GROUP1_REFERENCE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #unidirectionalCompoundReferenceNameMask()
    public VkVideoEncodeAV1CapabilitiesKHR unidirectionalCompoundReferenceNameMask(int unidirectionalCompoundReferenceNameMask) {
    	UNIDIRECTIONAL_COMPOUND_REFERENCE_NAME_MASK_HANDLE.set(segment, 0L, unidirectionalCompoundReferenceNameMask);
    	return this;
    }
    
    public int unidirectionalCompoundReferenceNameMask() {
    	return (int) UNIDIRECTIONAL_COMPOUND_REFERENCE_NAME_MASK_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxBidirectionalCompoundReferenceCount()
    public VkVideoEncodeAV1CapabilitiesKHR maxBidirectionalCompoundReferenceCount(int maxBidirectionalCompoundReferenceCount) {
    	MAX_BIDIRECTIONAL_COMPOUND_REFERENCE_COUNT_HANDLE.set(segment, 0L, maxBidirectionalCompoundReferenceCount);
    	return this;
    }
    
    public int maxBidirectionalCompoundReferenceCount() {
    	return (int) MAX_BIDIRECTIONAL_COMPOUND_REFERENCE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxBidirectionalCompoundGroup1ReferenceCount()
    public VkVideoEncodeAV1CapabilitiesKHR maxBidirectionalCompoundGroup1ReferenceCount(int maxBidirectionalCompoundGroup1ReferenceCount) {
    	MAX_BIDIRECTIONAL_COMPOUND_GROUP1_REFERENCE_COUNT_HANDLE.set(segment, 0L, maxBidirectionalCompoundGroup1ReferenceCount);
    	return this;
    }
    
    public int maxBidirectionalCompoundGroup1ReferenceCount() {
    	return (int) MAX_BIDIRECTIONAL_COMPOUND_GROUP1_REFERENCE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxBidirectionalCompoundGroup2ReferenceCount()
    public VkVideoEncodeAV1CapabilitiesKHR maxBidirectionalCompoundGroup2ReferenceCount(int maxBidirectionalCompoundGroup2ReferenceCount) {
    	MAX_BIDIRECTIONAL_COMPOUND_GROUP2_REFERENCE_COUNT_HANDLE.set(segment, 0L, maxBidirectionalCompoundGroup2ReferenceCount);
    	return this;
    }
    
    public int maxBidirectionalCompoundGroup2ReferenceCount() {
    	return (int) MAX_BIDIRECTIONAL_COMPOUND_GROUP2_REFERENCE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #bidirectionalCompoundReferenceNameMask()
    public VkVideoEncodeAV1CapabilitiesKHR bidirectionalCompoundReferenceNameMask(int bidirectionalCompoundReferenceNameMask) {
    	BIDIRECTIONAL_COMPOUND_REFERENCE_NAME_MASK_HANDLE.set(segment, 0L, bidirectionalCompoundReferenceNameMask);
    	return this;
    }
    
    public int bidirectionalCompoundReferenceNameMask() {
    	return (int) BIDIRECTIONAL_COMPOUND_REFERENCE_NAME_MASK_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxTemporalLayerCount()
    public VkVideoEncodeAV1CapabilitiesKHR maxTemporalLayerCount(int maxTemporalLayerCount) {
    	MAX_TEMPORAL_LAYER_COUNT_HANDLE.set(segment, 0L, maxTemporalLayerCount);
    	return this;
    }
    
    public int maxTemporalLayerCount() {
    	return (int) MAX_TEMPORAL_LAYER_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxSpatialLayerCount()
    public VkVideoEncodeAV1CapabilitiesKHR maxSpatialLayerCount(int maxSpatialLayerCount) {
    	MAX_SPATIAL_LAYER_COUNT_HANDLE.set(segment, 0L, maxSpatialLayerCount);
    	return this;
    }
    
    public int maxSpatialLayerCount() {
    	return (int) MAX_SPATIAL_LAYER_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxOperatingPoints()
    public VkVideoEncodeAV1CapabilitiesKHR maxOperatingPoints(int maxOperatingPoints) {
    	MAX_OPERATING_POINTS_HANDLE.set(segment, 0L, maxOperatingPoints);
    	return this;
    }
    
    public int maxOperatingPoints() {
    	return (int) MAX_OPERATING_POINTS_HANDLE.get(segment, 0L);
    }
    
    /// @see #minQIndex()
    public VkVideoEncodeAV1CapabilitiesKHR minQIndex(int minQIndex) {
    	MIN_QINDEX_HANDLE.set(segment, 0L, minQIndex);
    	return this;
    }
    
    public int minQIndex() {
    	return (int) MIN_QINDEX_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxQIndex()
    public VkVideoEncodeAV1CapabilitiesKHR maxQIndex(int maxQIndex) {
    	MAX_QINDEX_HANDLE.set(segment, 0L, maxQIndex);
    	return this;
    }
    
    public int maxQIndex() {
    	return (int) MAX_QINDEX_HANDLE.get(segment, 0L);
    }
    
    /// @see #prefersGopRemainingFrames()
    public VkVideoEncodeAV1CapabilitiesKHR prefersGopRemainingFrames(int prefersGopRemainingFrames) {
    	PREFERS_GOP_REMAINING_FRAMES_HANDLE.set(segment, 0L, prefersGopRemainingFrames);
    	return this;
    }
    
    public int prefersGopRemainingFrames() {
    	return (int) PREFERS_GOP_REMAINING_FRAMES_HANDLE.get(segment, 0L);
    }
    
    /// @see #requiresGopRemainingFrames()
    public VkVideoEncodeAV1CapabilitiesKHR requiresGopRemainingFrames(int requiresGopRemainingFrames) {
    	REQUIRES_GOP_REMAINING_FRAMES_HANDLE.set(segment, 0L, requiresGopRemainingFrames);
    	return this;
    }
    
    public int requiresGopRemainingFrames() {
    	return (int) REQUIRES_GOP_REMAINING_FRAMES_HANDLE.get(segment, 0L);
    }
    
    /// @see #stdSyntaxFlags()
    public VkVideoEncodeAV1CapabilitiesKHR stdSyntaxFlags(int stdSyntaxFlags) {
    	STD_SYNTAX_FLAGS_HANDLE.set(segment, 0L, stdSyntaxFlags);
    	return this;
    }
    
    public int stdSyntaxFlags() {
    	return (int) STD_SYNTAX_FLAGS_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkVideoEncodeAV1CapabilitiesKHR set(VkVideoEncodeAV1CapabilitiesKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkVideoEncodeAV1CapabilitiesKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkVideoEncodeAV1CapabilitiesKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkVideoEncodeAV1CapabilitiesKHR> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkVideoEncodeAV1CapabilitiesKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkVideoEncodeAV1CapabilitiesKHR> array(SegmentAllocator allocator, VkVideoEncodeAV1CapabilitiesKHR... structs) {
        NativeStructArray<VkVideoEncodeAV1CapabilitiesKHR> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkVideoEncodeAV1CapabilitiesKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkVideoEncodeAV1CapabilitiesKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkVideoEncodeAV1CapabilitiesKHR(segment)
        );
    }

}