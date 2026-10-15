/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkPhysicalDeviceVulkan13Properties
		implements Struct<VkPhysicalDeviceVulkan13Properties> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle MIN_SUBGROUP_SIZE_HANDLE;
	public static final VarHandle MAX_SUBGROUP_SIZE_HANDLE;
	public static final VarHandle MAX_COMPUTE_WORKGROUP_SUBGROUPS_HANDLE;
	public static final VarHandle REQUIRED_SUBGROUP_SIZE_STAGES_HANDLE;
	public static final VarHandle MAX_INLINE_UNIFORM_BLOCK_SIZE_HANDLE;
	public static final VarHandle MAX_PER_STAGE_DESCRIPTOR_INLINE_UNIFORM_BLOCKS_HANDLE;
	public static final VarHandle MAX_PER_STAGE_DESCRIPTOR_UPDATE_AFTER_BIND_INLINE_UNIFORM_BLOCKS_HANDLE;
	public static final VarHandle MAX_DESCRIPTOR_SET_INLINE_UNIFORM_BLOCKS_HANDLE;
	public static final VarHandle MAX_DESCRIPTOR_SET_UPDATE_AFTER_BIND_INLINE_UNIFORM_BLOCKS_HANDLE;
	public static final VarHandle MAX_INLINE_UNIFORM_TOTAL_SIZE_HANDLE;
	public static final VarHandle INTEGER_DOT_PRODUCT8_BIT_UNSIGNED_ACCELERATED_HANDLE;
	public static final VarHandle INTEGER_DOT_PRODUCT8_BIT_SIGNED_ACCELERATED_HANDLE;
	public static final VarHandle INTEGER_DOT_PRODUCT8_BIT_MIXED_SIGNEDNESS_ACCELERATED_HANDLE;
	public static final VarHandle INTEGER_DOT_PRODUCT4X8_BIT_PACKED_UNSIGNED_ACCELERATED_HANDLE;
	public static final VarHandle INTEGER_DOT_PRODUCT4X8_BIT_PACKED_SIGNED_ACCELERATED_HANDLE;
	public static final VarHandle INTEGER_DOT_PRODUCT4X8_BIT_PACKED_MIXED_SIGNEDNESS_ACCELERATED_HANDLE;
	public static final VarHandle INTEGER_DOT_PRODUCT16_BIT_UNSIGNED_ACCELERATED_HANDLE;
	public static final VarHandle INTEGER_DOT_PRODUCT16_BIT_SIGNED_ACCELERATED_HANDLE;
	public static final VarHandle INTEGER_DOT_PRODUCT16_BIT_MIXED_SIGNEDNESS_ACCELERATED_HANDLE;
	public static final VarHandle INTEGER_DOT_PRODUCT32_BIT_UNSIGNED_ACCELERATED_HANDLE;
	public static final VarHandle INTEGER_DOT_PRODUCT32_BIT_SIGNED_ACCELERATED_HANDLE;
	public static final VarHandle INTEGER_DOT_PRODUCT32_BIT_MIXED_SIGNEDNESS_ACCELERATED_HANDLE;
	public static final VarHandle INTEGER_DOT_PRODUCT64_BIT_UNSIGNED_ACCELERATED_HANDLE;
	public static final VarHandle INTEGER_DOT_PRODUCT64_BIT_SIGNED_ACCELERATED_HANDLE;
	public static final VarHandle INTEGER_DOT_PRODUCT64_BIT_MIXED_SIGNEDNESS_ACCELERATED_HANDLE;
	public static final VarHandle INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING8_BIT_UNSIGNED_ACCELERATED_HANDLE;
	public static final VarHandle INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING8_BIT_SIGNED_ACCELERATED_HANDLE;
	public static final VarHandle INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING8_BIT_MIXED_SIGNEDNESS_ACCELERATED_HANDLE;
	public static final VarHandle INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING4X8_BIT_PACKED_UNSIGNED_ACCELERATED_HANDLE;
	public static final VarHandle INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING4X8_BIT_PACKED_SIGNED_ACCELERATED_HANDLE;
	public static final VarHandle INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING4X8_BIT_PACKED_MIXED_SIGNEDNESS_ACCELERATED_HANDLE;
	public static final VarHandle INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING16_BIT_UNSIGNED_ACCELERATED_HANDLE;
	public static final VarHandle INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING16_BIT_SIGNED_ACCELERATED_HANDLE;
	public static final VarHandle INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING16_BIT_MIXED_SIGNEDNESS_ACCELERATED_HANDLE;
	public static final VarHandle INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING32_BIT_UNSIGNED_ACCELERATED_HANDLE;
	public static final VarHandle INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING32_BIT_SIGNED_ACCELERATED_HANDLE;
	public static final VarHandle INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING32_BIT_MIXED_SIGNEDNESS_ACCELERATED_HANDLE;
	public static final VarHandle INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING64_BIT_UNSIGNED_ACCELERATED_HANDLE;
	public static final VarHandle INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING64_BIT_SIGNED_ACCELERATED_HANDLE;
	public static final VarHandle INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING64_BIT_MIXED_SIGNEDNESS_ACCELERATED_HANDLE;
	public static final VarHandle STORAGE_TEXEL_BUFFER_OFFSET_ALIGNMENT_BYTES_HANDLE;
	public static final VarHandle STORAGE_TEXEL_BUFFER_OFFSET_SINGLE_TEXEL_ALIGNMENT_HANDLE;
	public static final VarHandle UNIFORM_TEXEL_BUFFER_OFFSET_ALIGNMENT_BYTES_HANDLE;
	public static final VarHandle UNIFORM_TEXEL_BUFFER_OFFSET_SINGLE_TEXEL_ALIGNMENT_HANDLE;
	public static final VarHandle MAX_BUFFER_SIZE_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long MIN_SUBGROUP_SIZE_BYTE_OFFSET;
	public static final long MAX_SUBGROUP_SIZE_BYTE_OFFSET;
	public static final long MAX_COMPUTE_WORKGROUP_SUBGROUPS_BYTE_OFFSET;
	public static final long REQUIRED_SUBGROUP_SIZE_STAGES_BYTE_OFFSET;
	public static final long MAX_INLINE_UNIFORM_BLOCK_SIZE_BYTE_OFFSET;
	public static final long MAX_PER_STAGE_DESCRIPTOR_INLINE_UNIFORM_BLOCKS_BYTE_OFFSET;
	public static final long MAX_PER_STAGE_DESCRIPTOR_UPDATE_AFTER_BIND_INLINE_UNIFORM_BLOCKS_BYTE_OFFSET;
	public static final long MAX_DESCRIPTOR_SET_INLINE_UNIFORM_BLOCKS_BYTE_OFFSET;
	public static final long MAX_DESCRIPTOR_SET_UPDATE_AFTER_BIND_INLINE_UNIFORM_BLOCKS_BYTE_OFFSET;
	public static final long MAX_INLINE_UNIFORM_TOTAL_SIZE_BYTE_OFFSET;
	public static final long INTEGER_DOT_PRODUCT8_BIT_UNSIGNED_ACCELERATED_BYTE_OFFSET;
	public static final long INTEGER_DOT_PRODUCT8_BIT_SIGNED_ACCELERATED_BYTE_OFFSET;
	public static final long INTEGER_DOT_PRODUCT8_BIT_MIXED_SIGNEDNESS_ACCELERATED_BYTE_OFFSET;
	public static final long INTEGER_DOT_PRODUCT4X8_BIT_PACKED_UNSIGNED_ACCELERATED_BYTE_OFFSET;
	public static final long INTEGER_DOT_PRODUCT4X8_BIT_PACKED_SIGNED_ACCELERATED_BYTE_OFFSET;
	public static final long INTEGER_DOT_PRODUCT4X8_BIT_PACKED_MIXED_SIGNEDNESS_ACCELERATED_BYTE_OFFSET;
	public static final long INTEGER_DOT_PRODUCT16_BIT_UNSIGNED_ACCELERATED_BYTE_OFFSET;
	public static final long INTEGER_DOT_PRODUCT16_BIT_SIGNED_ACCELERATED_BYTE_OFFSET;
	public static final long INTEGER_DOT_PRODUCT16_BIT_MIXED_SIGNEDNESS_ACCELERATED_BYTE_OFFSET;
	public static final long INTEGER_DOT_PRODUCT32_BIT_UNSIGNED_ACCELERATED_BYTE_OFFSET;
	public static final long INTEGER_DOT_PRODUCT32_BIT_SIGNED_ACCELERATED_BYTE_OFFSET;
	public static final long INTEGER_DOT_PRODUCT32_BIT_MIXED_SIGNEDNESS_ACCELERATED_BYTE_OFFSET;
	public static final long INTEGER_DOT_PRODUCT64_BIT_UNSIGNED_ACCELERATED_BYTE_OFFSET;
	public static final long INTEGER_DOT_PRODUCT64_BIT_SIGNED_ACCELERATED_BYTE_OFFSET;
	public static final long INTEGER_DOT_PRODUCT64_BIT_MIXED_SIGNEDNESS_ACCELERATED_BYTE_OFFSET;
	public static final long INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING8_BIT_UNSIGNED_ACCELERATED_BYTE_OFFSET;
	public static final long INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING8_BIT_SIGNED_ACCELERATED_BYTE_OFFSET;
	public static final long INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING8_BIT_MIXED_SIGNEDNESS_ACCELERATED_BYTE_OFFSET;
	public static final long INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING4X8_BIT_PACKED_UNSIGNED_ACCELERATED_BYTE_OFFSET;
	public static final long INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING4X8_BIT_PACKED_SIGNED_ACCELERATED_BYTE_OFFSET;
	public static final long INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING4X8_BIT_PACKED_MIXED_SIGNEDNESS_ACCELERATED_BYTE_OFFSET;
	public static final long INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING16_BIT_UNSIGNED_ACCELERATED_BYTE_OFFSET;
	public static final long INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING16_BIT_SIGNED_ACCELERATED_BYTE_OFFSET;
	public static final long INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING16_BIT_MIXED_SIGNEDNESS_ACCELERATED_BYTE_OFFSET;
	public static final long INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING32_BIT_UNSIGNED_ACCELERATED_BYTE_OFFSET;
	public static final long INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING32_BIT_SIGNED_ACCELERATED_BYTE_OFFSET;
	public static final long INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING32_BIT_MIXED_SIGNEDNESS_ACCELERATED_BYTE_OFFSET;
	public static final long INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING64_BIT_UNSIGNED_ACCELERATED_BYTE_OFFSET;
	public static final long INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING64_BIT_SIGNED_ACCELERATED_BYTE_OFFSET;
	public static final long INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING64_BIT_MIXED_SIGNEDNESS_ACCELERATED_BYTE_OFFSET;
	public static final long STORAGE_TEXEL_BUFFER_OFFSET_ALIGNMENT_BYTES_BYTE_OFFSET;
	public static final long STORAGE_TEXEL_BUFFER_OFFSET_SINGLE_TEXEL_ALIGNMENT_BYTE_OFFSET;
	public static final long UNIFORM_TEXEL_BUFFER_OFFSET_ALIGNMENT_BYTES_BYTE_OFFSET;
	public static final long UNIFORM_TEXEL_BUFFER_OFFSET_SINGLE_TEXEL_ALIGNMENT_BYTE_OFFSET;
	public static final long MAX_BUFFER_SIZE_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("minSubgroupSize"),
		    JAVA_INT.withName("maxSubgroupSize"),
		    JAVA_INT.withName("maxComputeWorkgroupSubgroups"),
		    JAVA_INT.withName("requiredSubgroupSizeStages"),
		    JAVA_INT.withName("maxInlineUniformBlockSize"),
		    JAVA_INT.withName("maxPerStageDescriptorInlineUniformBlocks"),
		    JAVA_INT.withName("maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks"),
		    JAVA_INT.withName("maxDescriptorSetInlineUniformBlocks"),
		    JAVA_INT.withName("maxDescriptorSetUpdateAfterBindInlineUniformBlocks"),
		    JAVA_INT.withName("maxInlineUniformTotalSize"),
		    JAVA_INT.withName("integerDotProduct8BitUnsignedAccelerated"),
		    JAVA_INT.withName("integerDotProduct8BitSignedAccelerated"),
		    JAVA_INT.withName("integerDotProduct8BitMixedSignednessAccelerated"),
		    JAVA_INT.withName("integerDotProduct4x8BitPackedUnsignedAccelerated"),
		    JAVA_INT.withName("integerDotProduct4x8BitPackedSignedAccelerated"),
		    JAVA_INT.withName("integerDotProduct4x8BitPackedMixedSignednessAccelerated"),
		    JAVA_INT.withName("integerDotProduct16BitUnsignedAccelerated"),
		    JAVA_INT.withName("integerDotProduct16BitSignedAccelerated"),
		    JAVA_INT.withName("integerDotProduct16BitMixedSignednessAccelerated"),
		    JAVA_INT.withName("integerDotProduct32BitUnsignedAccelerated"),
		    JAVA_INT.withName("integerDotProduct32BitSignedAccelerated"),
		    JAVA_INT.withName("integerDotProduct32BitMixedSignednessAccelerated"),
		    JAVA_INT.withName("integerDotProduct64BitUnsignedAccelerated"),
		    JAVA_INT.withName("integerDotProduct64BitSignedAccelerated"),
		    JAVA_INT.withName("integerDotProduct64BitMixedSignednessAccelerated"),
		    JAVA_INT.withName("integerDotProductAccumulatingSaturating8BitUnsignedAccelerated"),
		    JAVA_INT.withName("integerDotProductAccumulatingSaturating8BitSignedAccelerated"),
		    JAVA_INT.withName("integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated"),
		    JAVA_INT.withName("integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated"),
		    JAVA_INT.withName("integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated"),
		    JAVA_INT.withName("integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated"),
		    JAVA_INT.withName("integerDotProductAccumulatingSaturating16BitUnsignedAccelerated"),
		    JAVA_INT.withName("integerDotProductAccumulatingSaturating16BitSignedAccelerated"),
		    JAVA_INT.withName("integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated"),
		    JAVA_INT.withName("integerDotProductAccumulatingSaturating32BitUnsignedAccelerated"),
		    JAVA_INT.withName("integerDotProductAccumulatingSaturating32BitSignedAccelerated"),
		    JAVA_INT.withName("integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated"),
		    JAVA_INT.withName("integerDotProductAccumulatingSaturating64BitUnsignedAccelerated"),
		    JAVA_INT.withName("integerDotProductAccumulatingSaturating64BitSignedAccelerated"),
		    JAVA_INT.withName("integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated"),
		    JAVA_LONG.withName("storageTexelBufferOffsetAlignmentBytes"),
		    JAVA_INT.withName("storageTexelBufferOffsetSingleTexelAlignment"),
		    MemoryLayout.paddingLayout(4),
		    JAVA_LONG.withName("uniformTexelBufferOffsetAlignmentBytes"),
		    JAVA_INT.withName("uniformTexelBufferOffsetSingleTexelAlignment"),
		    MemoryLayout.paddingLayout(4),
		    JAVA_LONG.withName("maxBufferSize")
		).withName("VkPhysicalDeviceVulkan13Properties").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		MIN_SUBGROUP_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("minSubgroupSize"));
		MAX_SUBGROUP_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxSubgroupSize"));
		MAX_COMPUTE_WORKGROUP_SUBGROUPS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxComputeWorkgroupSubgroups"));
		REQUIRED_SUBGROUP_SIZE_STAGES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("requiredSubgroupSizeStages"));
		MAX_INLINE_UNIFORM_BLOCK_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxInlineUniformBlockSize"));
		MAX_PER_STAGE_DESCRIPTOR_INLINE_UNIFORM_BLOCKS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxPerStageDescriptorInlineUniformBlocks"));
		MAX_PER_STAGE_DESCRIPTOR_UPDATE_AFTER_BIND_INLINE_UNIFORM_BLOCKS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks"));
		MAX_DESCRIPTOR_SET_INLINE_UNIFORM_BLOCKS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxDescriptorSetInlineUniformBlocks"));
		MAX_DESCRIPTOR_SET_UPDATE_AFTER_BIND_INLINE_UNIFORM_BLOCKS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxDescriptorSetUpdateAfterBindInlineUniformBlocks"));
		MAX_INLINE_UNIFORM_TOTAL_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxInlineUniformTotalSize"));
		INTEGER_DOT_PRODUCT8_BIT_UNSIGNED_ACCELERATED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("integerDotProduct8BitUnsignedAccelerated"));
		INTEGER_DOT_PRODUCT8_BIT_SIGNED_ACCELERATED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("integerDotProduct8BitSignedAccelerated"));
		INTEGER_DOT_PRODUCT8_BIT_MIXED_SIGNEDNESS_ACCELERATED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("integerDotProduct8BitMixedSignednessAccelerated"));
		INTEGER_DOT_PRODUCT4X8_BIT_PACKED_UNSIGNED_ACCELERATED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("integerDotProduct4x8BitPackedUnsignedAccelerated"));
		INTEGER_DOT_PRODUCT4X8_BIT_PACKED_SIGNED_ACCELERATED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("integerDotProduct4x8BitPackedSignedAccelerated"));
		INTEGER_DOT_PRODUCT4X8_BIT_PACKED_MIXED_SIGNEDNESS_ACCELERATED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("integerDotProduct4x8BitPackedMixedSignednessAccelerated"));
		INTEGER_DOT_PRODUCT16_BIT_UNSIGNED_ACCELERATED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("integerDotProduct16BitUnsignedAccelerated"));
		INTEGER_DOT_PRODUCT16_BIT_SIGNED_ACCELERATED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("integerDotProduct16BitSignedAccelerated"));
		INTEGER_DOT_PRODUCT16_BIT_MIXED_SIGNEDNESS_ACCELERATED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("integerDotProduct16BitMixedSignednessAccelerated"));
		INTEGER_DOT_PRODUCT32_BIT_UNSIGNED_ACCELERATED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("integerDotProduct32BitUnsignedAccelerated"));
		INTEGER_DOT_PRODUCT32_BIT_SIGNED_ACCELERATED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("integerDotProduct32BitSignedAccelerated"));
		INTEGER_DOT_PRODUCT32_BIT_MIXED_SIGNEDNESS_ACCELERATED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("integerDotProduct32BitMixedSignednessAccelerated"));
		INTEGER_DOT_PRODUCT64_BIT_UNSIGNED_ACCELERATED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("integerDotProduct64BitUnsignedAccelerated"));
		INTEGER_DOT_PRODUCT64_BIT_SIGNED_ACCELERATED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("integerDotProduct64BitSignedAccelerated"));
		INTEGER_DOT_PRODUCT64_BIT_MIXED_SIGNEDNESS_ACCELERATED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("integerDotProduct64BitMixedSignednessAccelerated"));
		INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING8_BIT_UNSIGNED_ACCELERATED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating8BitUnsignedAccelerated"));
		INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING8_BIT_SIGNED_ACCELERATED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating8BitSignedAccelerated"));
		INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING8_BIT_MIXED_SIGNEDNESS_ACCELERATED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated"));
		INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING4X8_BIT_PACKED_UNSIGNED_ACCELERATED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated"));
		INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING4X8_BIT_PACKED_SIGNED_ACCELERATED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated"));
		INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING4X8_BIT_PACKED_MIXED_SIGNEDNESS_ACCELERATED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated"));
		INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING16_BIT_UNSIGNED_ACCELERATED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating16BitUnsignedAccelerated"));
		INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING16_BIT_SIGNED_ACCELERATED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating16BitSignedAccelerated"));
		INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING16_BIT_MIXED_SIGNEDNESS_ACCELERATED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated"));
		INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING32_BIT_UNSIGNED_ACCELERATED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating32BitUnsignedAccelerated"));
		INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING32_BIT_SIGNED_ACCELERATED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating32BitSignedAccelerated"));
		INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING32_BIT_MIXED_SIGNEDNESS_ACCELERATED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated"));
		INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING64_BIT_UNSIGNED_ACCELERATED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating64BitUnsignedAccelerated"));
		INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING64_BIT_SIGNED_ACCELERATED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating64BitSignedAccelerated"));
		INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING64_BIT_MIXED_SIGNEDNESS_ACCELERATED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated"));
		STORAGE_TEXEL_BUFFER_OFFSET_ALIGNMENT_BYTES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("storageTexelBufferOffsetAlignmentBytes"));
		STORAGE_TEXEL_BUFFER_OFFSET_SINGLE_TEXEL_ALIGNMENT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("storageTexelBufferOffsetSingleTexelAlignment"));
		UNIFORM_TEXEL_BUFFER_OFFSET_ALIGNMENT_BYTES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("uniformTexelBufferOffsetAlignmentBytes"));
		UNIFORM_TEXEL_BUFFER_OFFSET_SINGLE_TEXEL_ALIGNMENT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("uniformTexelBufferOffsetSingleTexelAlignment"));
		MAX_BUFFER_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxBufferSize"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		MIN_SUBGROUP_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("minSubgroupSize"));
		MAX_SUBGROUP_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxSubgroupSize"));
		MAX_COMPUTE_WORKGROUP_SUBGROUPS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxComputeWorkgroupSubgroups"));
		REQUIRED_SUBGROUP_SIZE_STAGES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("requiredSubgroupSizeStages"));
		MAX_INLINE_UNIFORM_BLOCK_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxInlineUniformBlockSize"));
		MAX_PER_STAGE_DESCRIPTOR_INLINE_UNIFORM_BLOCKS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxPerStageDescriptorInlineUniformBlocks"));
		MAX_PER_STAGE_DESCRIPTOR_UPDATE_AFTER_BIND_INLINE_UNIFORM_BLOCKS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks"));
		MAX_DESCRIPTOR_SET_INLINE_UNIFORM_BLOCKS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetInlineUniformBlocks"));
		MAX_DESCRIPTOR_SET_UPDATE_AFTER_BIND_INLINE_UNIFORM_BLOCKS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxDescriptorSetUpdateAfterBindInlineUniformBlocks"));
		MAX_INLINE_UNIFORM_TOTAL_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxInlineUniformTotalSize"));
		INTEGER_DOT_PRODUCT8_BIT_UNSIGNED_ACCELERATED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("integerDotProduct8BitUnsignedAccelerated"));
		INTEGER_DOT_PRODUCT8_BIT_SIGNED_ACCELERATED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("integerDotProduct8BitSignedAccelerated"));
		INTEGER_DOT_PRODUCT8_BIT_MIXED_SIGNEDNESS_ACCELERATED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("integerDotProduct8BitMixedSignednessAccelerated"));
		INTEGER_DOT_PRODUCT4X8_BIT_PACKED_UNSIGNED_ACCELERATED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("integerDotProduct4x8BitPackedUnsignedAccelerated"));
		INTEGER_DOT_PRODUCT4X8_BIT_PACKED_SIGNED_ACCELERATED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("integerDotProduct4x8BitPackedSignedAccelerated"));
		INTEGER_DOT_PRODUCT4X8_BIT_PACKED_MIXED_SIGNEDNESS_ACCELERATED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("integerDotProduct4x8BitPackedMixedSignednessAccelerated"));
		INTEGER_DOT_PRODUCT16_BIT_UNSIGNED_ACCELERATED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("integerDotProduct16BitUnsignedAccelerated"));
		INTEGER_DOT_PRODUCT16_BIT_SIGNED_ACCELERATED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("integerDotProduct16BitSignedAccelerated"));
		INTEGER_DOT_PRODUCT16_BIT_MIXED_SIGNEDNESS_ACCELERATED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("integerDotProduct16BitMixedSignednessAccelerated"));
		INTEGER_DOT_PRODUCT32_BIT_UNSIGNED_ACCELERATED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("integerDotProduct32BitUnsignedAccelerated"));
		INTEGER_DOT_PRODUCT32_BIT_SIGNED_ACCELERATED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("integerDotProduct32BitSignedAccelerated"));
		INTEGER_DOT_PRODUCT32_BIT_MIXED_SIGNEDNESS_ACCELERATED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("integerDotProduct32BitMixedSignednessAccelerated"));
		INTEGER_DOT_PRODUCT64_BIT_UNSIGNED_ACCELERATED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("integerDotProduct64BitUnsignedAccelerated"));
		INTEGER_DOT_PRODUCT64_BIT_SIGNED_ACCELERATED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("integerDotProduct64BitSignedAccelerated"));
		INTEGER_DOT_PRODUCT64_BIT_MIXED_SIGNEDNESS_ACCELERATED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("integerDotProduct64BitMixedSignednessAccelerated"));
		INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING8_BIT_UNSIGNED_ACCELERATED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("integerDotProductAccumulatingSaturating8BitUnsignedAccelerated"));
		INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING8_BIT_SIGNED_ACCELERATED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("integerDotProductAccumulatingSaturating8BitSignedAccelerated"));
		INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING8_BIT_MIXED_SIGNEDNESS_ACCELERATED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated"));
		INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING4X8_BIT_PACKED_UNSIGNED_ACCELERATED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated"));
		INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING4X8_BIT_PACKED_SIGNED_ACCELERATED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated"));
		INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING4X8_BIT_PACKED_MIXED_SIGNEDNESS_ACCELERATED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated"));
		INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING16_BIT_UNSIGNED_ACCELERATED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("integerDotProductAccumulatingSaturating16BitUnsignedAccelerated"));
		INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING16_BIT_SIGNED_ACCELERATED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("integerDotProductAccumulatingSaturating16BitSignedAccelerated"));
		INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING16_BIT_MIXED_SIGNEDNESS_ACCELERATED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated"));
		INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING32_BIT_UNSIGNED_ACCELERATED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("integerDotProductAccumulatingSaturating32BitUnsignedAccelerated"));
		INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING32_BIT_SIGNED_ACCELERATED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("integerDotProductAccumulatingSaturating32BitSignedAccelerated"));
		INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING32_BIT_MIXED_SIGNEDNESS_ACCELERATED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated"));
		INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING64_BIT_UNSIGNED_ACCELERATED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("integerDotProductAccumulatingSaturating64BitUnsignedAccelerated"));
		INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING64_BIT_SIGNED_ACCELERATED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("integerDotProductAccumulatingSaturating64BitSignedAccelerated"));
		INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING64_BIT_MIXED_SIGNEDNESS_ACCELERATED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated"));
		STORAGE_TEXEL_BUFFER_OFFSET_ALIGNMENT_BYTES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("storageTexelBufferOffsetAlignmentBytes"));
		STORAGE_TEXEL_BUFFER_OFFSET_SINGLE_TEXEL_ALIGNMENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("storageTexelBufferOffsetSingleTexelAlignment"));
		UNIFORM_TEXEL_BUFFER_OFFSET_ALIGNMENT_BYTES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("uniformTexelBufferOffsetAlignmentBytes"));
		UNIFORM_TEXEL_BUFFER_OFFSET_SINGLE_TEXEL_ALIGNMENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("uniformTexelBufferOffsetSingleTexelAlignment"));
		MAX_BUFFER_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxBufferSize"));
		//@formatter:on
	}

	public VkPhysicalDeviceVulkan13Properties() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceVulkan13Properties(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceVulkan13Properties(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceVulkan13Properties sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceVulkan13Properties pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #minSubgroupSize()
    public VkPhysicalDeviceVulkan13Properties minSubgroupSize(int minSubgroupSize) {
    	MIN_SUBGROUP_SIZE_HANDLE.set(segment, 0L, minSubgroupSize);
    	return this;
    }
    
    public int minSubgroupSize() {
    	return (int) MIN_SUBGROUP_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxSubgroupSize()
    public VkPhysicalDeviceVulkan13Properties maxSubgroupSize(int maxSubgroupSize) {
    	MAX_SUBGROUP_SIZE_HANDLE.set(segment, 0L, maxSubgroupSize);
    	return this;
    }
    
    public int maxSubgroupSize() {
    	return (int) MAX_SUBGROUP_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxComputeWorkgroupSubgroups()
    public VkPhysicalDeviceVulkan13Properties maxComputeWorkgroupSubgroups(int maxComputeWorkgroupSubgroups) {
    	MAX_COMPUTE_WORKGROUP_SUBGROUPS_HANDLE.set(segment, 0L, maxComputeWorkgroupSubgroups);
    	return this;
    }
    
    public int maxComputeWorkgroupSubgroups() {
    	return (int) MAX_COMPUTE_WORKGROUP_SUBGROUPS_HANDLE.get(segment, 0L);
    }
    
    /// @see #requiredSubgroupSizeStages()
    public VkPhysicalDeviceVulkan13Properties requiredSubgroupSizeStages(int requiredSubgroupSizeStages) {
    	REQUIRED_SUBGROUP_SIZE_STAGES_HANDLE.set(segment, 0L, requiredSubgroupSizeStages);
    	return this;
    }
    
    public int requiredSubgroupSizeStages() {
    	return (int) REQUIRED_SUBGROUP_SIZE_STAGES_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxInlineUniformBlockSize()
    public VkPhysicalDeviceVulkan13Properties maxInlineUniformBlockSize(int maxInlineUniformBlockSize) {
    	MAX_INLINE_UNIFORM_BLOCK_SIZE_HANDLE.set(segment, 0L, maxInlineUniformBlockSize);
    	return this;
    }
    
    public int maxInlineUniformBlockSize() {
    	return (int) MAX_INLINE_UNIFORM_BLOCK_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxPerStageDescriptorInlineUniformBlocks()
    public VkPhysicalDeviceVulkan13Properties maxPerStageDescriptorInlineUniformBlocks(int maxPerStageDescriptorInlineUniformBlocks) {
    	MAX_PER_STAGE_DESCRIPTOR_INLINE_UNIFORM_BLOCKS_HANDLE.set(segment, 0L, maxPerStageDescriptorInlineUniformBlocks);
    	return this;
    }
    
    public int maxPerStageDescriptorInlineUniformBlocks() {
    	return (int) MAX_PER_STAGE_DESCRIPTOR_INLINE_UNIFORM_BLOCKS_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks()
    public VkPhysicalDeviceVulkan13Properties maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks(int maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks) {
    	MAX_PER_STAGE_DESCRIPTOR_UPDATE_AFTER_BIND_INLINE_UNIFORM_BLOCKS_HANDLE.set(segment, 0L, maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks);
    	return this;
    }
    
    public int maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks() {
    	return (int) MAX_PER_STAGE_DESCRIPTOR_UPDATE_AFTER_BIND_INLINE_UNIFORM_BLOCKS_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxDescriptorSetInlineUniformBlocks()
    public VkPhysicalDeviceVulkan13Properties maxDescriptorSetInlineUniformBlocks(int maxDescriptorSetInlineUniformBlocks) {
    	MAX_DESCRIPTOR_SET_INLINE_UNIFORM_BLOCKS_HANDLE.set(segment, 0L, maxDescriptorSetInlineUniformBlocks);
    	return this;
    }
    
    public int maxDescriptorSetInlineUniformBlocks() {
    	return (int) MAX_DESCRIPTOR_SET_INLINE_UNIFORM_BLOCKS_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxDescriptorSetUpdateAfterBindInlineUniformBlocks()
    public VkPhysicalDeviceVulkan13Properties maxDescriptorSetUpdateAfterBindInlineUniformBlocks(int maxDescriptorSetUpdateAfterBindInlineUniformBlocks) {
    	MAX_DESCRIPTOR_SET_UPDATE_AFTER_BIND_INLINE_UNIFORM_BLOCKS_HANDLE.set(segment, 0L, maxDescriptorSetUpdateAfterBindInlineUniformBlocks);
    	return this;
    }
    
    public int maxDescriptorSetUpdateAfterBindInlineUniformBlocks() {
    	return (int) MAX_DESCRIPTOR_SET_UPDATE_AFTER_BIND_INLINE_UNIFORM_BLOCKS_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxInlineUniformTotalSize()
    public VkPhysicalDeviceVulkan13Properties maxInlineUniformTotalSize(int maxInlineUniformTotalSize) {
    	MAX_INLINE_UNIFORM_TOTAL_SIZE_HANDLE.set(segment, 0L, maxInlineUniformTotalSize);
    	return this;
    }
    
    public int maxInlineUniformTotalSize() {
    	return (int) MAX_INLINE_UNIFORM_TOTAL_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #integerDotProduct8BitUnsignedAccelerated()
    public VkPhysicalDeviceVulkan13Properties integerDotProduct8BitUnsignedAccelerated(int integerDotProduct8BitUnsignedAccelerated) {
    	INTEGER_DOT_PRODUCT8_BIT_UNSIGNED_ACCELERATED_HANDLE.set(segment, 0L, integerDotProduct8BitUnsignedAccelerated);
    	return this;
    }
    
    public int integerDotProduct8BitUnsignedAccelerated() {
    	return (int) INTEGER_DOT_PRODUCT8_BIT_UNSIGNED_ACCELERATED_HANDLE.get(segment, 0L);
    }
    
    /// @see #integerDotProduct8BitSignedAccelerated()
    public VkPhysicalDeviceVulkan13Properties integerDotProduct8BitSignedAccelerated(int integerDotProduct8BitSignedAccelerated) {
    	INTEGER_DOT_PRODUCT8_BIT_SIGNED_ACCELERATED_HANDLE.set(segment, 0L, integerDotProduct8BitSignedAccelerated);
    	return this;
    }
    
    public int integerDotProduct8BitSignedAccelerated() {
    	return (int) INTEGER_DOT_PRODUCT8_BIT_SIGNED_ACCELERATED_HANDLE.get(segment, 0L);
    }
    
    /// @see #integerDotProduct8BitMixedSignednessAccelerated()
    public VkPhysicalDeviceVulkan13Properties integerDotProduct8BitMixedSignednessAccelerated(int integerDotProduct8BitMixedSignednessAccelerated) {
    	INTEGER_DOT_PRODUCT8_BIT_MIXED_SIGNEDNESS_ACCELERATED_HANDLE.set(segment, 0L, integerDotProduct8BitMixedSignednessAccelerated);
    	return this;
    }
    
    public int integerDotProduct8BitMixedSignednessAccelerated() {
    	return (int) INTEGER_DOT_PRODUCT8_BIT_MIXED_SIGNEDNESS_ACCELERATED_HANDLE.get(segment, 0L);
    }
    
    /// @see #integerDotProduct4x8BitPackedUnsignedAccelerated()
    public VkPhysicalDeviceVulkan13Properties integerDotProduct4x8BitPackedUnsignedAccelerated(int integerDotProduct4x8BitPackedUnsignedAccelerated) {
    	INTEGER_DOT_PRODUCT4X8_BIT_PACKED_UNSIGNED_ACCELERATED_HANDLE.set(segment, 0L, integerDotProduct4x8BitPackedUnsignedAccelerated);
    	return this;
    }
    
    public int integerDotProduct4x8BitPackedUnsignedAccelerated() {
    	return (int) INTEGER_DOT_PRODUCT4X8_BIT_PACKED_UNSIGNED_ACCELERATED_HANDLE.get(segment, 0L);
    }
    
    /// @see #integerDotProduct4x8BitPackedSignedAccelerated()
    public VkPhysicalDeviceVulkan13Properties integerDotProduct4x8BitPackedSignedAccelerated(int integerDotProduct4x8BitPackedSignedAccelerated) {
    	INTEGER_DOT_PRODUCT4X8_BIT_PACKED_SIGNED_ACCELERATED_HANDLE.set(segment, 0L, integerDotProduct4x8BitPackedSignedAccelerated);
    	return this;
    }
    
    public int integerDotProduct4x8BitPackedSignedAccelerated() {
    	return (int) INTEGER_DOT_PRODUCT4X8_BIT_PACKED_SIGNED_ACCELERATED_HANDLE.get(segment, 0L);
    }
    
    /// @see #integerDotProduct4x8BitPackedMixedSignednessAccelerated()
    public VkPhysicalDeviceVulkan13Properties integerDotProduct4x8BitPackedMixedSignednessAccelerated(int integerDotProduct4x8BitPackedMixedSignednessAccelerated) {
    	INTEGER_DOT_PRODUCT4X8_BIT_PACKED_MIXED_SIGNEDNESS_ACCELERATED_HANDLE.set(segment, 0L, integerDotProduct4x8BitPackedMixedSignednessAccelerated);
    	return this;
    }
    
    public int integerDotProduct4x8BitPackedMixedSignednessAccelerated() {
    	return (int) INTEGER_DOT_PRODUCT4X8_BIT_PACKED_MIXED_SIGNEDNESS_ACCELERATED_HANDLE.get(segment, 0L);
    }
    
    /// @see #integerDotProduct16BitUnsignedAccelerated()
    public VkPhysicalDeviceVulkan13Properties integerDotProduct16BitUnsignedAccelerated(int integerDotProduct16BitUnsignedAccelerated) {
    	INTEGER_DOT_PRODUCT16_BIT_UNSIGNED_ACCELERATED_HANDLE.set(segment, 0L, integerDotProduct16BitUnsignedAccelerated);
    	return this;
    }
    
    public int integerDotProduct16BitUnsignedAccelerated() {
    	return (int) INTEGER_DOT_PRODUCT16_BIT_UNSIGNED_ACCELERATED_HANDLE.get(segment, 0L);
    }
    
    /// @see #integerDotProduct16BitSignedAccelerated()
    public VkPhysicalDeviceVulkan13Properties integerDotProduct16BitSignedAccelerated(int integerDotProduct16BitSignedAccelerated) {
    	INTEGER_DOT_PRODUCT16_BIT_SIGNED_ACCELERATED_HANDLE.set(segment, 0L, integerDotProduct16BitSignedAccelerated);
    	return this;
    }
    
    public int integerDotProduct16BitSignedAccelerated() {
    	return (int) INTEGER_DOT_PRODUCT16_BIT_SIGNED_ACCELERATED_HANDLE.get(segment, 0L);
    }
    
    /// @see #integerDotProduct16BitMixedSignednessAccelerated()
    public VkPhysicalDeviceVulkan13Properties integerDotProduct16BitMixedSignednessAccelerated(int integerDotProduct16BitMixedSignednessAccelerated) {
    	INTEGER_DOT_PRODUCT16_BIT_MIXED_SIGNEDNESS_ACCELERATED_HANDLE.set(segment, 0L, integerDotProduct16BitMixedSignednessAccelerated);
    	return this;
    }
    
    public int integerDotProduct16BitMixedSignednessAccelerated() {
    	return (int) INTEGER_DOT_PRODUCT16_BIT_MIXED_SIGNEDNESS_ACCELERATED_HANDLE.get(segment, 0L);
    }
    
    /// @see #integerDotProduct32BitUnsignedAccelerated()
    public VkPhysicalDeviceVulkan13Properties integerDotProduct32BitUnsignedAccelerated(int integerDotProduct32BitUnsignedAccelerated) {
    	INTEGER_DOT_PRODUCT32_BIT_UNSIGNED_ACCELERATED_HANDLE.set(segment, 0L, integerDotProduct32BitUnsignedAccelerated);
    	return this;
    }
    
    public int integerDotProduct32BitUnsignedAccelerated() {
    	return (int) INTEGER_DOT_PRODUCT32_BIT_UNSIGNED_ACCELERATED_HANDLE.get(segment, 0L);
    }
    
    /// @see #integerDotProduct32BitSignedAccelerated()
    public VkPhysicalDeviceVulkan13Properties integerDotProduct32BitSignedAccelerated(int integerDotProduct32BitSignedAccelerated) {
    	INTEGER_DOT_PRODUCT32_BIT_SIGNED_ACCELERATED_HANDLE.set(segment, 0L, integerDotProduct32BitSignedAccelerated);
    	return this;
    }
    
    public int integerDotProduct32BitSignedAccelerated() {
    	return (int) INTEGER_DOT_PRODUCT32_BIT_SIGNED_ACCELERATED_HANDLE.get(segment, 0L);
    }
    
    /// @see #integerDotProduct32BitMixedSignednessAccelerated()
    public VkPhysicalDeviceVulkan13Properties integerDotProduct32BitMixedSignednessAccelerated(int integerDotProduct32BitMixedSignednessAccelerated) {
    	INTEGER_DOT_PRODUCT32_BIT_MIXED_SIGNEDNESS_ACCELERATED_HANDLE.set(segment, 0L, integerDotProduct32BitMixedSignednessAccelerated);
    	return this;
    }
    
    public int integerDotProduct32BitMixedSignednessAccelerated() {
    	return (int) INTEGER_DOT_PRODUCT32_BIT_MIXED_SIGNEDNESS_ACCELERATED_HANDLE.get(segment, 0L);
    }
    
    /// @see #integerDotProduct64BitUnsignedAccelerated()
    public VkPhysicalDeviceVulkan13Properties integerDotProduct64BitUnsignedAccelerated(int integerDotProduct64BitUnsignedAccelerated) {
    	INTEGER_DOT_PRODUCT64_BIT_UNSIGNED_ACCELERATED_HANDLE.set(segment, 0L, integerDotProduct64BitUnsignedAccelerated);
    	return this;
    }
    
    public int integerDotProduct64BitUnsignedAccelerated() {
    	return (int) INTEGER_DOT_PRODUCT64_BIT_UNSIGNED_ACCELERATED_HANDLE.get(segment, 0L);
    }
    
    /// @see #integerDotProduct64BitSignedAccelerated()
    public VkPhysicalDeviceVulkan13Properties integerDotProduct64BitSignedAccelerated(int integerDotProduct64BitSignedAccelerated) {
    	INTEGER_DOT_PRODUCT64_BIT_SIGNED_ACCELERATED_HANDLE.set(segment, 0L, integerDotProduct64BitSignedAccelerated);
    	return this;
    }
    
    public int integerDotProduct64BitSignedAccelerated() {
    	return (int) INTEGER_DOT_PRODUCT64_BIT_SIGNED_ACCELERATED_HANDLE.get(segment, 0L);
    }
    
    /// @see #integerDotProduct64BitMixedSignednessAccelerated()
    public VkPhysicalDeviceVulkan13Properties integerDotProduct64BitMixedSignednessAccelerated(int integerDotProduct64BitMixedSignednessAccelerated) {
    	INTEGER_DOT_PRODUCT64_BIT_MIXED_SIGNEDNESS_ACCELERATED_HANDLE.set(segment, 0L, integerDotProduct64BitMixedSignednessAccelerated);
    	return this;
    }
    
    public int integerDotProduct64BitMixedSignednessAccelerated() {
    	return (int) INTEGER_DOT_PRODUCT64_BIT_MIXED_SIGNEDNESS_ACCELERATED_HANDLE.get(segment, 0L);
    }
    
    /// @see #integerDotProductAccumulatingSaturating8BitUnsignedAccelerated()
    public VkPhysicalDeviceVulkan13Properties integerDotProductAccumulatingSaturating8BitUnsignedAccelerated(int integerDotProductAccumulatingSaturating8BitUnsignedAccelerated) {
    	INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING8_BIT_UNSIGNED_ACCELERATED_HANDLE.set(segment, 0L, integerDotProductAccumulatingSaturating8BitUnsignedAccelerated);
    	return this;
    }
    
    public int integerDotProductAccumulatingSaturating8BitUnsignedAccelerated() {
    	return (int) INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING8_BIT_UNSIGNED_ACCELERATED_HANDLE.get(segment, 0L);
    }
    
    /// @see #integerDotProductAccumulatingSaturating8BitSignedAccelerated()
    public VkPhysicalDeviceVulkan13Properties integerDotProductAccumulatingSaturating8BitSignedAccelerated(int integerDotProductAccumulatingSaturating8BitSignedAccelerated) {
    	INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING8_BIT_SIGNED_ACCELERATED_HANDLE.set(segment, 0L, integerDotProductAccumulatingSaturating8BitSignedAccelerated);
    	return this;
    }
    
    public int integerDotProductAccumulatingSaturating8BitSignedAccelerated() {
    	return (int) INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING8_BIT_SIGNED_ACCELERATED_HANDLE.get(segment, 0L);
    }
    
    /// @see #integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated()
    public VkPhysicalDeviceVulkan13Properties integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated(int integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated) {
    	INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING8_BIT_MIXED_SIGNEDNESS_ACCELERATED_HANDLE.set(segment, 0L, integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated);
    	return this;
    }
    
    public int integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated() {
    	return (int) INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING8_BIT_MIXED_SIGNEDNESS_ACCELERATED_HANDLE.get(segment, 0L);
    }
    
    /// @see #integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated()
    public VkPhysicalDeviceVulkan13Properties integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated(int integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated) {
    	INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING4X8_BIT_PACKED_UNSIGNED_ACCELERATED_HANDLE.set(segment, 0L, integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated);
    	return this;
    }
    
    public int integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated() {
    	return (int) INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING4X8_BIT_PACKED_UNSIGNED_ACCELERATED_HANDLE.get(segment, 0L);
    }
    
    /// @see #integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated()
    public VkPhysicalDeviceVulkan13Properties integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated(int integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated) {
    	INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING4X8_BIT_PACKED_SIGNED_ACCELERATED_HANDLE.set(segment, 0L, integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated);
    	return this;
    }
    
    public int integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated() {
    	return (int) INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING4X8_BIT_PACKED_SIGNED_ACCELERATED_HANDLE.get(segment, 0L);
    }
    
    /// @see #integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated()
    public VkPhysicalDeviceVulkan13Properties integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated(int integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated) {
    	INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING4X8_BIT_PACKED_MIXED_SIGNEDNESS_ACCELERATED_HANDLE.set(segment, 0L, integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated);
    	return this;
    }
    
    public int integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated() {
    	return (int) INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING4X8_BIT_PACKED_MIXED_SIGNEDNESS_ACCELERATED_HANDLE.get(segment, 0L);
    }
    
    /// @see #integerDotProductAccumulatingSaturating16BitUnsignedAccelerated()
    public VkPhysicalDeviceVulkan13Properties integerDotProductAccumulatingSaturating16BitUnsignedAccelerated(int integerDotProductAccumulatingSaturating16BitUnsignedAccelerated) {
    	INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING16_BIT_UNSIGNED_ACCELERATED_HANDLE.set(segment, 0L, integerDotProductAccumulatingSaturating16BitUnsignedAccelerated);
    	return this;
    }
    
    public int integerDotProductAccumulatingSaturating16BitUnsignedAccelerated() {
    	return (int) INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING16_BIT_UNSIGNED_ACCELERATED_HANDLE.get(segment, 0L);
    }
    
    /// @see #integerDotProductAccumulatingSaturating16BitSignedAccelerated()
    public VkPhysicalDeviceVulkan13Properties integerDotProductAccumulatingSaturating16BitSignedAccelerated(int integerDotProductAccumulatingSaturating16BitSignedAccelerated) {
    	INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING16_BIT_SIGNED_ACCELERATED_HANDLE.set(segment, 0L, integerDotProductAccumulatingSaturating16BitSignedAccelerated);
    	return this;
    }
    
    public int integerDotProductAccumulatingSaturating16BitSignedAccelerated() {
    	return (int) INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING16_BIT_SIGNED_ACCELERATED_HANDLE.get(segment, 0L);
    }
    
    /// @see #integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated()
    public VkPhysicalDeviceVulkan13Properties integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated(int integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated) {
    	INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING16_BIT_MIXED_SIGNEDNESS_ACCELERATED_HANDLE.set(segment, 0L, integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated);
    	return this;
    }
    
    public int integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated() {
    	return (int) INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING16_BIT_MIXED_SIGNEDNESS_ACCELERATED_HANDLE.get(segment, 0L);
    }
    
    /// @see #integerDotProductAccumulatingSaturating32BitUnsignedAccelerated()
    public VkPhysicalDeviceVulkan13Properties integerDotProductAccumulatingSaturating32BitUnsignedAccelerated(int integerDotProductAccumulatingSaturating32BitUnsignedAccelerated) {
    	INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING32_BIT_UNSIGNED_ACCELERATED_HANDLE.set(segment, 0L, integerDotProductAccumulatingSaturating32BitUnsignedAccelerated);
    	return this;
    }
    
    public int integerDotProductAccumulatingSaturating32BitUnsignedAccelerated() {
    	return (int) INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING32_BIT_UNSIGNED_ACCELERATED_HANDLE.get(segment, 0L);
    }
    
    /// @see #integerDotProductAccumulatingSaturating32BitSignedAccelerated()
    public VkPhysicalDeviceVulkan13Properties integerDotProductAccumulatingSaturating32BitSignedAccelerated(int integerDotProductAccumulatingSaturating32BitSignedAccelerated) {
    	INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING32_BIT_SIGNED_ACCELERATED_HANDLE.set(segment, 0L, integerDotProductAccumulatingSaturating32BitSignedAccelerated);
    	return this;
    }
    
    public int integerDotProductAccumulatingSaturating32BitSignedAccelerated() {
    	return (int) INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING32_BIT_SIGNED_ACCELERATED_HANDLE.get(segment, 0L);
    }
    
    /// @see #integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated()
    public VkPhysicalDeviceVulkan13Properties integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated(int integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated) {
    	INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING32_BIT_MIXED_SIGNEDNESS_ACCELERATED_HANDLE.set(segment, 0L, integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated);
    	return this;
    }
    
    public int integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated() {
    	return (int) INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING32_BIT_MIXED_SIGNEDNESS_ACCELERATED_HANDLE.get(segment, 0L);
    }
    
    /// @see #integerDotProductAccumulatingSaturating64BitUnsignedAccelerated()
    public VkPhysicalDeviceVulkan13Properties integerDotProductAccumulatingSaturating64BitUnsignedAccelerated(int integerDotProductAccumulatingSaturating64BitUnsignedAccelerated) {
    	INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING64_BIT_UNSIGNED_ACCELERATED_HANDLE.set(segment, 0L, integerDotProductAccumulatingSaturating64BitUnsignedAccelerated);
    	return this;
    }
    
    public int integerDotProductAccumulatingSaturating64BitUnsignedAccelerated() {
    	return (int) INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING64_BIT_UNSIGNED_ACCELERATED_HANDLE.get(segment, 0L);
    }
    
    /// @see #integerDotProductAccumulatingSaturating64BitSignedAccelerated()
    public VkPhysicalDeviceVulkan13Properties integerDotProductAccumulatingSaturating64BitSignedAccelerated(int integerDotProductAccumulatingSaturating64BitSignedAccelerated) {
    	INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING64_BIT_SIGNED_ACCELERATED_HANDLE.set(segment, 0L, integerDotProductAccumulatingSaturating64BitSignedAccelerated);
    	return this;
    }
    
    public int integerDotProductAccumulatingSaturating64BitSignedAccelerated() {
    	return (int) INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING64_BIT_SIGNED_ACCELERATED_HANDLE.get(segment, 0L);
    }
    
    /// @see #integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated()
    public VkPhysicalDeviceVulkan13Properties integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated(int integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated) {
    	INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING64_BIT_MIXED_SIGNEDNESS_ACCELERATED_HANDLE.set(segment, 0L, integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated);
    	return this;
    }
    
    public int integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated() {
    	return (int) INTEGER_DOT_PRODUCT_ACCUMULATING_SATURATING64_BIT_MIXED_SIGNEDNESS_ACCELERATED_HANDLE.get(segment, 0L);
    }
    
    /// @see #storageTexelBufferOffsetAlignmentBytes()
    public VkPhysicalDeviceVulkan13Properties storageTexelBufferOffsetAlignmentBytes(long storageTexelBufferOffsetAlignmentBytes) {
    	STORAGE_TEXEL_BUFFER_OFFSET_ALIGNMENT_BYTES_HANDLE.set(segment, 0L, storageTexelBufferOffsetAlignmentBytes);
    	return this;
    }
    
    public long storageTexelBufferOffsetAlignmentBytes() {
    	return (long) STORAGE_TEXEL_BUFFER_OFFSET_ALIGNMENT_BYTES_HANDLE.get(segment, 0L);
    }
    
    /// @see #storageTexelBufferOffsetSingleTexelAlignment()
    public VkPhysicalDeviceVulkan13Properties storageTexelBufferOffsetSingleTexelAlignment(int storageTexelBufferOffsetSingleTexelAlignment) {
    	STORAGE_TEXEL_BUFFER_OFFSET_SINGLE_TEXEL_ALIGNMENT_HANDLE.set(segment, 0L, storageTexelBufferOffsetSingleTexelAlignment);
    	return this;
    }
    
    public int storageTexelBufferOffsetSingleTexelAlignment() {
    	return (int) STORAGE_TEXEL_BUFFER_OFFSET_SINGLE_TEXEL_ALIGNMENT_HANDLE.get(segment, 0L);
    }
    
    /// @see #uniformTexelBufferOffsetAlignmentBytes()
    public VkPhysicalDeviceVulkan13Properties uniformTexelBufferOffsetAlignmentBytes(long uniformTexelBufferOffsetAlignmentBytes) {
    	UNIFORM_TEXEL_BUFFER_OFFSET_ALIGNMENT_BYTES_HANDLE.set(segment, 0L, uniformTexelBufferOffsetAlignmentBytes);
    	return this;
    }
    
    public long uniformTexelBufferOffsetAlignmentBytes() {
    	return (long) UNIFORM_TEXEL_BUFFER_OFFSET_ALIGNMENT_BYTES_HANDLE.get(segment, 0L);
    }
    
    /// @see #uniformTexelBufferOffsetSingleTexelAlignment()
    public VkPhysicalDeviceVulkan13Properties uniformTexelBufferOffsetSingleTexelAlignment(int uniformTexelBufferOffsetSingleTexelAlignment) {
    	UNIFORM_TEXEL_BUFFER_OFFSET_SINGLE_TEXEL_ALIGNMENT_HANDLE.set(segment, 0L, uniformTexelBufferOffsetSingleTexelAlignment);
    	return this;
    }
    
    public int uniformTexelBufferOffsetSingleTexelAlignment() {
    	return (int) UNIFORM_TEXEL_BUFFER_OFFSET_SINGLE_TEXEL_ALIGNMENT_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxBufferSize()
    public VkPhysicalDeviceVulkan13Properties maxBufferSize(long maxBufferSize) {
    	MAX_BUFFER_SIZE_HANDLE.set(segment, 0L, maxBufferSize);
    	return this;
    }
    
    public long maxBufferSize() {
    	return (long) MAX_BUFFER_SIZE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceVulkan13Properties set(VkPhysicalDeviceVulkan13Properties other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceVulkan13Properties set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceVulkan13Properties> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceVulkan13Properties> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceVulkan13Properties(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceVulkan13Properties> array(Arena arena, VkPhysicalDeviceVulkan13Properties... structs) {
        NativeStructArray<VkPhysicalDeviceVulkan13Properties> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceVulkan13Properties(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceVulkan13Properties> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceVulkan13Properties(segment)
        );
    }

}