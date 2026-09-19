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

public final class VkVideoEncodeCapabilitiesKHR
		implements Struct<VkVideoEncodeCapabilitiesKHR> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle FLAGS_HANDLE;
    public static final VarHandle RATE_CONTROL_MODES_HANDLE;
    public static final VarHandle MAX_RATE_CONTROL_LAYERS_HANDLE;
    public static final VarHandle MAX_BITRATE_HANDLE;
    public static final VarHandle MAX_QUALITY_LEVELS_HANDLE;
    public static final VarHandle SUPPORTED_ENCODE_FEEDBACK_FLAGS_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long FLAGS_BYTE_OFFSET;
    public static final long RATE_CONTROL_MODES_BYTE_OFFSET;
    public static final long MAX_RATE_CONTROL_LAYERS_BYTE_OFFSET;
    public static final long MAX_BITRATE_BYTE_OFFSET;
    public static final long MAX_QUALITY_LEVELS_BYTE_OFFSET;
    public static final long ENCODE_INPUT_PICTURE_GRANULARITY_BYTE_OFFSET;
    public static final long SUPPORTED_ENCODE_FEEDBACK_FLAGS_BYTE_OFFSET;

    private final MemorySegment segment;

    private final VkExtent2D encodeInputPictureGranularity;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("flags"),
            JAVA_INT.withName("rateControlModes"),
            JAVA_INT.withName("maxRateControlLayers"),
            MemoryLayout.paddingLayout(4),
            JAVA_LONG.withName("maxBitrate"),
            JAVA_INT.withName("maxQualityLevels"),
            VkExtent2D.LAYOUT.withName("encodeInputPictureGranularity"),
            JAVA_INT.withName("supportedEncodeFeedbackFlags")
        ).withName("VkVideoEncodeCapabilitiesKHR").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
        RATE_CONTROL_MODES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("rateControlModes"));
        MAX_RATE_CONTROL_LAYERS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxRateControlLayers"));
        MAX_BITRATE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxBitrate"));
        MAX_QUALITY_LEVELS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxQualityLevels"));
        SUPPORTED_ENCODE_FEEDBACK_FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("supportedEncodeFeedbackFlags"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
        RATE_CONTROL_MODES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("rateControlModes"));
        MAX_RATE_CONTROL_LAYERS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxRateControlLayers"));
        MAX_BITRATE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxBitrate"));
        MAX_QUALITY_LEVELS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxQualityLevels"));
        ENCODE_INPUT_PICTURE_GRANULARITY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("encodeInputPictureGranularity"));
        SUPPORTED_ENCODE_FEEDBACK_FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("supportedEncodeFeedbackFlags"));
        //@formatter:on
    }

    public VkVideoEncodeCapabilitiesKHR() {
        this(Arena.ofAuto());
    }
    
    public VkVideoEncodeCapabilitiesKHR(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkVideoEncodeCapabilitiesKHR(MemorySegment segment) {
        this.segment = segment;
    
        encodeInputPictureGranularity = new VkExtent2D(segment.asSlice(ENCODE_INPUT_PICTURE_GRANULARITY_BYTE_OFFSET, VkExtent2D.LAYOUT));
    }

    /// @see #sType()
    public VkVideoEncodeCapabilitiesKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkVideoEncodeCapabilitiesKHR pNext(MemorySegment pNext) {
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
    public VkVideoEncodeCapabilitiesKHR flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #rateControlModes()
    public VkVideoEncodeCapabilitiesKHR rateControlModes(int rateControlModes) {
    	RATE_CONTROL_MODES_HANDLE.set(segment, 0L, rateControlModes);
    	return this;
    }
    
    public int rateControlModes() {
    	return (int) RATE_CONTROL_MODES_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxRateControlLayers()
    public VkVideoEncodeCapabilitiesKHR maxRateControlLayers(int maxRateControlLayers) {
    	MAX_RATE_CONTROL_LAYERS_HANDLE.set(segment, 0L, maxRateControlLayers);
    	return this;
    }
    
    public int maxRateControlLayers() {
    	return (int) MAX_RATE_CONTROL_LAYERS_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxBitrate()
    public VkVideoEncodeCapabilitiesKHR maxBitrate(long maxBitrate) {
    	MAX_BITRATE_HANDLE.set(segment, 0L, maxBitrate);
    	return this;
    }
    
    public long maxBitrate() {
    	return (long) MAX_BITRATE_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxQualityLevels()
    public VkVideoEncodeCapabilitiesKHR maxQualityLevels(int maxQualityLevels) {
    	MAX_QUALITY_LEVELS_HANDLE.set(segment, 0L, maxQualityLevels);
    	return this;
    }
    
    public int maxQualityLevels() {
    	return (int) MAX_QUALITY_LEVELS_HANDLE.get(segment, 0L);
    }
    
    /// @see #supportedEncodeFeedbackFlags()
    public VkVideoEncodeCapabilitiesKHR supportedEncodeFeedbackFlags(int supportedEncodeFeedbackFlags) {
    	SUPPORTED_ENCODE_FEEDBACK_FLAGS_HANDLE.set(segment, 0L, supportedEncodeFeedbackFlags);
    	return this;
    }
    
    public int supportedEncodeFeedbackFlags() {
    	return (int) SUPPORTED_ENCODE_FEEDBACK_FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #encodeInputPictureGranularity()
    public VkVideoEncodeCapabilitiesKHR encodeInputPictureGranularity(Consumer<VkExtent2D> consumer) {
    	consumer.accept(encodeInputPictureGranularity);
    	return this;
    }
    
    /// @see #encodeInputPictureGranularity()
    public VkVideoEncodeCapabilitiesKHR encodeInputPictureGranularity(VkExtent2D other) {
    	encodeInputPictureGranularity.set(other);
    	return this;
    }
    
    public VkExtent2D encodeInputPictureGranularity() {
    	return encodeInputPictureGranularity;
    }
    
    @Override
    public VkVideoEncodeCapabilitiesKHR set(VkVideoEncodeCapabilitiesKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkVideoEncodeCapabilitiesKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkVideoEncodeCapabilitiesKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkVideoEncodeCapabilitiesKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkVideoEncodeCapabilitiesKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkVideoEncodeCapabilitiesKHR> array(Arena arena, VkVideoEncodeCapabilitiesKHR... structs) {
        NativeStructArray<VkVideoEncodeCapabilitiesKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkVideoEncodeCapabilitiesKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkVideoEncodeCapabilitiesKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkVideoEncodeCapabilitiesKHR(segment)
        );
    }
    
}