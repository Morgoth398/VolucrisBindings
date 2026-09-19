/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
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

public final class VkPhysicalDeviceFragmentShadingRatePropertiesKHR
		implements Struct<VkPhysicalDeviceFragmentShadingRatePropertiesKHR> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle MAX_FRAGMENT_SHADING_RATE_ATTACHMENT_TEXEL_SIZE_ASPECT_RATIO_HANDLE;
    public static final VarHandle PRIMITIVE_FRAGMENT_SHADING_RATE_WITH_MULTIPLE_VIEWPORTS_HANDLE;
    public static final VarHandle LAYERED_SHADING_RATE_ATTACHMENTS_HANDLE;
    public static final VarHandle FRAGMENT_SHADING_RATE_NON_TRIVIAL_COMBINER_OPS_HANDLE;
    public static final VarHandle MAX_FRAGMENT_SIZE_ASPECT_RATIO_HANDLE;
    public static final VarHandle MAX_FRAGMENT_SHADING_RATE_COVERAGE_SAMPLES_HANDLE;
    public static final VarHandle MAX_FRAGMENT_SHADING_RATE_RASTERIZATION_SAMPLES_HANDLE;
    public static final VarHandle FRAGMENT_SHADING_RATE_WITH_SHADER_DEPTH_STENCIL_WRITES_HANDLE;
    public static final VarHandle FRAGMENT_SHADING_RATE_WITH_SAMPLE_MASK_HANDLE;
    public static final VarHandle FRAGMENT_SHADING_RATE_WITH_SHADER_SAMPLE_MASK_HANDLE;
    public static final VarHandle FRAGMENT_SHADING_RATE_WITH_CONSERVATIVE_RASTERIZATION_HANDLE;
    public static final VarHandle FRAGMENT_SHADING_RATE_WITH_FRAGMENT_SHADER_INTERLOCK_HANDLE;
    public static final VarHandle FRAGMENT_SHADING_RATE_WITH_CUSTOM_SAMPLE_LOCATIONS_HANDLE;
    public static final VarHandle FRAGMENT_SHADING_RATE_STRICT_MULTIPLY_COMBINER_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long MIN_FRAGMENT_SHADING_RATE_ATTACHMENT_TEXEL_SIZE_BYTE_OFFSET;
    public static final long MAX_FRAGMENT_SHADING_RATE_ATTACHMENT_TEXEL_SIZE_BYTE_OFFSET;
    public static final long MAX_FRAGMENT_SHADING_RATE_ATTACHMENT_TEXEL_SIZE_ASPECT_RATIO_BYTE_OFFSET;
    public static final long PRIMITIVE_FRAGMENT_SHADING_RATE_WITH_MULTIPLE_VIEWPORTS_BYTE_OFFSET;
    public static final long LAYERED_SHADING_RATE_ATTACHMENTS_BYTE_OFFSET;
    public static final long FRAGMENT_SHADING_RATE_NON_TRIVIAL_COMBINER_OPS_BYTE_OFFSET;
    public static final long MAX_FRAGMENT_SIZE_BYTE_OFFSET;
    public static final long MAX_FRAGMENT_SIZE_ASPECT_RATIO_BYTE_OFFSET;
    public static final long MAX_FRAGMENT_SHADING_RATE_COVERAGE_SAMPLES_BYTE_OFFSET;
    public static final long MAX_FRAGMENT_SHADING_RATE_RASTERIZATION_SAMPLES_BYTE_OFFSET;
    public static final long FRAGMENT_SHADING_RATE_WITH_SHADER_DEPTH_STENCIL_WRITES_BYTE_OFFSET;
    public static final long FRAGMENT_SHADING_RATE_WITH_SAMPLE_MASK_BYTE_OFFSET;
    public static final long FRAGMENT_SHADING_RATE_WITH_SHADER_SAMPLE_MASK_BYTE_OFFSET;
    public static final long FRAGMENT_SHADING_RATE_WITH_CONSERVATIVE_RASTERIZATION_BYTE_OFFSET;
    public static final long FRAGMENT_SHADING_RATE_WITH_FRAGMENT_SHADER_INTERLOCK_BYTE_OFFSET;
    public static final long FRAGMENT_SHADING_RATE_WITH_CUSTOM_SAMPLE_LOCATIONS_BYTE_OFFSET;
    public static final long FRAGMENT_SHADING_RATE_STRICT_MULTIPLY_COMBINER_BYTE_OFFSET;

    private final MemorySegment segment;

    private final VkExtent2D minFragmentShadingRateAttachmentTexelSize;
    private final VkExtent2D maxFragmentShadingRateAttachmentTexelSize;
    private final VkExtent2D maxFragmentSize;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            VkExtent2D.LAYOUT.withName("minFragmentShadingRateAttachmentTexelSize"),
            VkExtent2D.LAYOUT.withName("maxFragmentShadingRateAttachmentTexelSize"),
            JAVA_INT.withName("maxFragmentShadingRateAttachmentTexelSizeAspectRatio"),
            JAVA_INT.withName("primitiveFragmentShadingRateWithMultipleViewports"),
            JAVA_INT.withName("layeredShadingRateAttachments"),
            JAVA_INT.withName("fragmentShadingRateNonTrivialCombinerOps"),
            VkExtent2D.LAYOUT.withName("maxFragmentSize"),
            JAVA_INT.withName("maxFragmentSizeAspectRatio"),
            JAVA_INT.withName("maxFragmentShadingRateCoverageSamples"),
            JAVA_INT.withName("maxFragmentShadingRateRasterizationSamples"),
            JAVA_INT.withName("fragmentShadingRateWithShaderDepthStencilWrites"),
            JAVA_INT.withName("fragmentShadingRateWithSampleMask"),
            JAVA_INT.withName("fragmentShadingRateWithShaderSampleMask"),
            JAVA_INT.withName("fragmentShadingRateWithConservativeRasterization"),
            JAVA_INT.withName("fragmentShadingRateWithFragmentShaderInterlock"),
            JAVA_INT.withName("fragmentShadingRateWithCustomSampleLocations"),
            JAVA_INT.withName("fragmentShadingRateStrictMultiplyCombiner")
        ).withName("VkPhysicalDeviceFragmentShadingRatePropertiesKHR").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        MAX_FRAGMENT_SHADING_RATE_ATTACHMENT_TEXEL_SIZE_ASPECT_RATIO_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxFragmentShadingRateAttachmentTexelSizeAspectRatio"));
        PRIMITIVE_FRAGMENT_SHADING_RATE_WITH_MULTIPLE_VIEWPORTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("primitiveFragmentShadingRateWithMultipleViewports"));
        LAYERED_SHADING_RATE_ATTACHMENTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("layeredShadingRateAttachments"));
        FRAGMENT_SHADING_RATE_NON_TRIVIAL_COMBINER_OPS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("fragmentShadingRateNonTrivialCombinerOps"));
        MAX_FRAGMENT_SIZE_ASPECT_RATIO_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxFragmentSizeAspectRatio"));
        MAX_FRAGMENT_SHADING_RATE_COVERAGE_SAMPLES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxFragmentShadingRateCoverageSamples"));
        MAX_FRAGMENT_SHADING_RATE_RASTERIZATION_SAMPLES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxFragmentShadingRateRasterizationSamples"));
        FRAGMENT_SHADING_RATE_WITH_SHADER_DEPTH_STENCIL_WRITES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("fragmentShadingRateWithShaderDepthStencilWrites"));
        FRAGMENT_SHADING_RATE_WITH_SAMPLE_MASK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("fragmentShadingRateWithSampleMask"));
        FRAGMENT_SHADING_RATE_WITH_SHADER_SAMPLE_MASK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("fragmentShadingRateWithShaderSampleMask"));
        FRAGMENT_SHADING_RATE_WITH_CONSERVATIVE_RASTERIZATION_HANDLE = LAYOUT.varHandle(PathElement.groupElement("fragmentShadingRateWithConservativeRasterization"));
        FRAGMENT_SHADING_RATE_WITH_FRAGMENT_SHADER_INTERLOCK_HANDLE = LAYOUT.varHandle(PathElement.groupElement("fragmentShadingRateWithFragmentShaderInterlock"));
        FRAGMENT_SHADING_RATE_WITH_CUSTOM_SAMPLE_LOCATIONS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("fragmentShadingRateWithCustomSampleLocations"));
        FRAGMENT_SHADING_RATE_STRICT_MULTIPLY_COMBINER_HANDLE = LAYOUT.varHandle(PathElement.groupElement("fragmentShadingRateStrictMultiplyCombiner"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        MIN_FRAGMENT_SHADING_RATE_ATTACHMENT_TEXEL_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("minFragmentShadingRateAttachmentTexelSize"));
        MAX_FRAGMENT_SHADING_RATE_ATTACHMENT_TEXEL_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxFragmentShadingRateAttachmentTexelSize"));
        MAX_FRAGMENT_SHADING_RATE_ATTACHMENT_TEXEL_SIZE_ASPECT_RATIO_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxFragmentShadingRateAttachmentTexelSizeAspectRatio"));
        PRIMITIVE_FRAGMENT_SHADING_RATE_WITH_MULTIPLE_VIEWPORTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("primitiveFragmentShadingRateWithMultipleViewports"));
        LAYERED_SHADING_RATE_ATTACHMENTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("layeredShadingRateAttachments"));
        FRAGMENT_SHADING_RATE_NON_TRIVIAL_COMBINER_OPS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("fragmentShadingRateNonTrivialCombinerOps"));
        MAX_FRAGMENT_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxFragmentSize"));
        MAX_FRAGMENT_SIZE_ASPECT_RATIO_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxFragmentSizeAspectRatio"));
        MAX_FRAGMENT_SHADING_RATE_COVERAGE_SAMPLES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxFragmentShadingRateCoverageSamples"));
        MAX_FRAGMENT_SHADING_RATE_RASTERIZATION_SAMPLES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxFragmentShadingRateRasterizationSamples"));
        FRAGMENT_SHADING_RATE_WITH_SHADER_DEPTH_STENCIL_WRITES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("fragmentShadingRateWithShaderDepthStencilWrites"));
        FRAGMENT_SHADING_RATE_WITH_SAMPLE_MASK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("fragmentShadingRateWithSampleMask"));
        FRAGMENT_SHADING_RATE_WITH_SHADER_SAMPLE_MASK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("fragmentShadingRateWithShaderSampleMask"));
        FRAGMENT_SHADING_RATE_WITH_CONSERVATIVE_RASTERIZATION_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("fragmentShadingRateWithConservativeRasterization"));
        FRAGMENT_SHADING_RATE_WITH_FRAGMENT_SHADER_INTERLOCK_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("fragmentShadingRateWithFragmentShaderInterlock"));
        FRAGMENT_SHADING_RATE_WITH_CUSTOM_SAMPLE_LOCATIONS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("fragmentShadingRateWithCustomSampleLocations"));
        FRAGMENT_SHADING_RATE_STRICT_MULTIPLY_COMBINER_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("fragmentShadingRateStrictMultiplyCombiner"));
        //@formatter:on
    }

    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR() {
        this(Arena.ofAuto());
    }
    
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR(MemorySegment segment) {
        this.segment = segment;
    
        minFragmentShadingRateAttachmentTexelSize = new VkExtent2D(segment.asSlice(MIN_FRAGMENT_SHADING_RATE_ATTACHMENT_TEXEL_SIZE_BYTE_OFFSET, VkExtent2D.LAYOUT));
        maxFragmentShadingRateAttachmentTexelSize = new VkExtent2D(segment.asSlice(MAX_FRAGMENT_SHADING_RATE_ATTACHMENT_TEXEL_SIZE_BYTE_OFFSET, VkExtent2D.LAYOUT));
        maxFragmentSize = new VkExtent2D(segment.asSlice(MAX_FRAGMENT_SIZE_BYTE_OFFSET, VkExtent2D.LAYOUT));
    }

    /// @see #sType()
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #maxFragmentShadingRateAttachmentTexelSizeAspectRatio()
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR maxFragmentShadingRateAttachmentTexelSizeAspectRatio(int maxFragmentShadingRateAttachmentTexelSizeAspectRatio) {
    	MAX_FRAGMENT_SHADING_RATE_ATTACHMENT_TEXEL_SIZE_ASPECT_RATIO_HANDLE.set(segment, 0L, maxFragmentShadingRateAttachmentTexelSizeAspectRatio);
    	return this;
    }
    
    public int maxFragmentShadingRateAttachmentTexelSizeAspectRatio() {
    	return (int) MAX_FRAGMENT_SHADING_RATE_ATTACHMENT_TEXEL_SIZE_ASPECT_RATIO_HANDLE.get(segment, 0L);
    }
    
    /// @see #primitiveFragmentShadingRateWithMultipleViewports()
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR primitiveFragmentShadingRateWithMultipleViewports(int primitiveFragmentShadingRateWithMultipleViewports) {
    	PRIMITIVE_FRAGMENT_SHADING_RATE_WITH_MULTIPLE_VIEWPORTS_HANDLE.set(segment, 0L, primitiveFragmentShadingRateWithMultipleViewports);
    	return this;
    }
    
    public int primitiveFragmentShadingRateWithMultipleViewports() {
    	return (int) PRIMITIVE_FRAGMENT_SHADING_RATE_WITH_MULTIPLE_VIEWPORTS_HANDLE.get(segment, 0L);
    }
    
    /// @see #layeredShadingRateAttachments()
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR layeredShadingRateAttachments(int layeredShadingRateAttachments) {
    	LAYERED_SHADING_RATE_ATTACHMENTS_HANDLE.set(segment, 0L, layeredShadingRateAttachments);
    	return this;
    }
    
    public int layeredShadingRateAttachments() {
    	return (int) LAYERED_SHADING_RATE_ATTACHMENTS_HANDLE.get(segment, 0L);
    }
    
    /// @see #fragmentShadingRateNonTrivialCombinerOps()
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR fragmentShadingRateNonTrivialCombinerOps(int fragmentShadingRateNonTrivialCombinerOps) {
    	FRAGMENT_SHADING_RATE_NON_TRIVIAL_COMBINER_OPS_HANDLE.set(segment, 0L, fragmentShadingRateNonTrivialCombinerOps);
    	return this;
    }
    
    public int fragmentShadingRateNonTrivialCombinerOps() {
    	return (int) FRAGMENT_SHADING_RATE_NON_TRIVIAL_COMBINER_OPS_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxFragmentSizeAspectRatio()
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR maxFragmentSizeAspectRatio(int maxFragmentSizeAspectRatio) {
    	MAX_FRAGMENT_SIZE_ASPECT_RATIO_HANDLE.set(segment, 0L, maxFragmentSizeAspectRatio);
    	return this;
    }
    
    public int maxFragmentSizeAspectRatio() {
    	return (int) MAX_FRAGMENT_SIZE_ASPECT_RATIO_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxFragmentShadingRateCoverageSamples()
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR maxFragmentShadingRateCoverageSamples(int maxFragmentShadingRateCoverageSamples) {
    	MAX_FRAGMENT_SHADING_RATE_COVERAGE_SAMPLES_HANDLE.set(segment, 0L, maxFragmentShadingRateCoverageSamples);
    	return this;
    }
    
    public int maxFragmentShadingRateCoverageSamples() {
    	return (int) MAX_FRAGMENT_SHADING_RATE_COVERAGE_SAMPLES_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxFragmentShadingRateRasterizationSamples()
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR maxFragmentShadingRateRasterizationSamples(int maxFragmentShadingRateRasterizationSamples) {
    	MAX_FRAGMENT_SHADING_RATE_RASTERIZATION_SAMPLES_HANDLE.set(segment, 0L, maxFragmentShadingRateRasterizationSamples);
    	return this;
    }
    
    public int maxFragmentShadingRateRasterizationSamples() {
    	return (int) MAX_FRAGMENT_SHADING_RATE_RASTERIZATION_SAMPLES_HANDLE.get(segment, 0L);
    }
    
    /// @see #fragmentShadingRateWithShaderDepthStencilWrites()
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR fragmentShadingRateWithShaderDepthStencilWrites(int fragmentShadingRateWithShaderDepthStencilWrites) {
    	FRAGMENT_SHADING_RATE_WITH_SHADER_DEPTH_STENCIL_WRITES_HANDLE.set(segment, 0L, fragmentShadingRateWithShaderDepthStencilWrites);
    	return this;
    }
    
    public int fragmentShadingRateWithShaderDepthStencilWrites() {
    	return (int) FRAGMENT_SHADING_RATE_WITH_SHADER_DEPTH_STENCIL_WRITES_HANDLE.get(segment, 0L);
    }
    
    /// @see #fragmentShadingRateWithSampleMask()
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR fragmentShadingRateWithSampleMask(int fragmentShadingRateWithSampleMask) {
    	FRAGMENT_SHADING_RATE_WITH_SAMPLE_MASK_HANDLE.set(segment, 0L, fragmentShadingRateWithSampleMask);
    	return this;
    }
    
    public int fragmentShadingRateWithSampleMask() {
    	return (int) FRAGMENT_SHADING_RATE_WITH_SAMPLE_MASK_HANDLE.get(segment, 0L);
    }
    
    /// @see #fragmentShadingRateWithShaderSampleMask()
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR fragmentShadingRateWithShaderSampleMask(int fragmentShadingRateWithShaderSampleMask) {
    	FRAGMENT_SHADING_RATE_WITH_SHADER_SAMPLE_MASK_HANDLE.set(segment, 0L, fragmentShadingRateWithShaderSampleMask);
    	return this;
    }
    
    public int fragmentShadingRateWithShaderSampleMask() {
    	return (int) FRAGMENT_SHADING_RATE_WITH_SHADER_SAMPLE_MASK_HANDLE.get(segment, 0L);
    }
    
    /// @see #fragmentShadingRateWithConservativeRasterization()
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR fragmentShadingRateWithConservativeRasterization(int fragmentShadingRateWithConservativeRasterization) {
    	FRAGMENT_SHADING_RATE_WITH_CONSERVATIVE_RASTERIZATION_HANDLE.set(segment, 0L, fragmentShadingRateWithConservativeRasterization);
    	return this;
    }
    
    public int fragmentShadingRateWithConservativeRasterization() {
    	return (int) FRAGMENT_SHADING_RATE_WITH_CONSERVATIVE_RASTERIZATION_HANDLE.get(segment, 0L);
    }
    
    /// @see #fragmentShadingRateWithFragmentShaderInterlock()
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR fragmentShadingRateWithFragmentShaderInterlock(int fragmentShadingRateWithFragmentShaderInterlock) {
    	FRAGMENT_SHADING_RATE_WITH_FRAGMENT_SHADER_INTERLOCK_HANDLE.set(segment, 0L, fragmentShadingRateWithFragmentShaderInterlock);
    	return this;
    }
    
    public int fragmentShadingRateWithFragmentShaderInterlock() {
    	return (int) FRAGMENT_SHADING_RATE_WITH_FRAGMENT_SHADER_INTERLOCK_HANDLE.get(segment, 0L);
    }
    
    /// @see #fragmentShadingRateWithCustomSampleLocations()
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR fragmentShadingRateWithCustomSampleLocations(int fragmentShadingRateWithCustomSampleLocations) {
    	FRAGMENT_SHADING_RATE_WITH_CUSTOM_SAMPLE_LOCATIONS_HANDLE.set(segment, 0L, fragmentShadingRateWithCustomSampleLocations);
    	return this;
    }
    
    public int fragmentShadingRateWithCustomSampleLocations() {
    	return (int) FRAGMENT_SHADING_RATE_WITH_CUSTOM_SAMPLE_LOCATIONS_HANDLE.get(segment, 0L);
    }
    
    /// @see #fragmentShadingRateStrictMultiplyCombiner()
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR fragmentShadingRateStrictMultiplyCombiner(int fragmentShadingRateStrictMultiplyCombiner) {
    	FRAGMENT_SHADING_RATE_STRICT_MULTIPLY_COMBINER_HANDLE.set(segment, 0L, fragmentShadingRateStrictMultiplyCombiner);
    	return this;
    }
    
    public int fragmentShadingRateStrictMultiplyCombiner() {
    	return (int) FRAGMENT_SHADING_RATE_STRICT_MULTIPLY_COMBINER_HANDLE.get(segment, 0L);
    }
    
    /// @see #minFragmentShadingRateAttachmentTexelSize()
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR minFragmentShadingRateAttachmentTexelSize(Consumer<VkExtent2D> consumer) {
    	consumer.accept(minFragmentShadingRateAttachmentTexelSize);
    	return this;
    }
    
    /// @see #minFragmentShadingRateAttachmentTexelSize()
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR minFragmentShadingRateAttachmentTexelSize(VkExtent2D other) {
    	minFragmentShadingRateAttachmentTexelSize.set(other);
    	return this;
    }
    
    public VkExtent2D minFragmentShadingRateAttachmentTexelSize() {
    	return minFragmentShadingRateAttachmentTexelSize;
    }
    
    /// @see #maxFragmentShadingRateAttachmentTexelSize()
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR maxFragmentShadingRateAttachmentTexelSize(Consumer<VkExtent2D> consumer) {
    	consumer.accept(maxFragmentShadingRateAttachmentTexelSize);
    	return this;
    }
    
    /// @see #maxFragmentShadingRateAttachmentTexelSize()
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR maxFragmentShadingRateAttachmentTexelSize(VkExtent2D other) {
    	maxFragmentShadingRateAttachmentTexelSize.set(other);
    	return this;
    }
    
    public VkExtent2D maxFragmentShadingRateAttachmentTexelSize() {
    	return maxFragmentShadingRateAttachmentTexelSize;
    }
    
    /// @see #maxFragmentSize()
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR maxFragmentSize(Consumer<VkExtent2D> consumer) {
    	consumer.accept(maxFragmentSize);
    	return this;
    }
    
    /// @see #maxFragmentSize()
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR maxFragmentSize(VkExtent2D other) {
    	maxFragmentSize.set(other);
    	return this;
    }
    
    public VkExtent2D maxFragmentSize() {
    	return maxFragmentSize;
    }
    
    @Override
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR set(VkPhysicalDeviceFragmentShadingRatePropertiesKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceFragmentShadingRatePropertiesKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceFragmentShadingRatePropertiesKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceFragmentShadingRatePropertiesKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceFragmentShadingRatePropertiesKHR> array(Arena arena, VkPhysicalDeviceFragmentShadingRatePropertiesKHR... structs) {
        NativeStructArray<VkPhysicalDeviceFragmentShadingRatePropertiesKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceFragmentShadingRatePropertiesKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceFragmentShadingRatePropertiesKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceFragmentShadingRatePropertiesKHR(segment)
        );
    }
    
}