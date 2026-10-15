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

public final class VkSurfaceCapabilities2EXT
		implements Struct<VkSurfaceCapabilities2EXT> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle MIN_IMAGE_COUNT_HANDLE;
	public static final VarHandle MAX_IMAGE_COUNT_HANDLE;
	public static final VarHandle MAX_IMAGE_ARRAY_LAYERS_HANDLE;
	public static final VarHandle SUPPORTED_TRANSFORMS_HANDLE;
	public static final VarHandle CURRENT_TRANSFORM_HANDLE;
	public static final VarHandle SUPPORTED_COMPOSITE_ALPHA_HANDLE;
	public static final VarHandle SUPPORTED_USAGE_FLAGS_HANDLE;
	public static final VarHandle SUPPORTED_SURFACE_COUNTERS_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long MIN_IMAGE_COUNT_BYTE_OFFSET;
	public static final long MAX_IMAGE_COUNT_BYTE_OFFSET;
	public static final long CURRENT_EXTENT_BYTE_OFFSET;
	public static final long MIN_IMAGE_EXTENT_BYTE_OFFSET;
	public static final long MAX_IMAGE_EXTENT_BYTE_OFFSET;
	public static final long MAX_IMAGE_ARRAY_LAYERS_BYTE_OFFSET;
	public static final long SUPPORTED_TRANSFORMS_BYTE_OFFSET;
	public static final long CURRENT_TRANSFORM_BYTE_OFFSET;
	public static final long SUPPORTED_COMPOSITE_ALPHA_BYTE_OFFSET;
	public static final long SUPPORTED_USAGE_FLAGS_BYTE_OFFSET;
	public static final long SUPPORTED_SURFACE_COUNTERS_BYTE_OFFSET;

	private final MemorySegment segment;

	private final VkExtent2D currentExtent;
	private final VkExtent2D minImageExtent;
	private final VkExtent2D maxImageExtent;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("minImageCount"),
		    JAVA_INT.withName("maxImageCount"),
		    VkExtent2D.LAYOUT.withName("currentExtent"),
		    VkExtent2D.LAYOUT.withName("minImageExtent"),
		    VkExtent2D.LAYOUT.withName("maxImageExtent"),
		    JAVA_INT.withName("maxImageArrayLayers"),
		    JAVA_INT.withName("supportedTransforms"),
		    JAVA_INT.withName("currentTransform"),
		    JAVA_INT.withName("supportedCompositeAlpha"),
		    JAVA_INT.withName("supportedUsageFlags"),
		    JAVA_INT.withName("supportedSurfaceCounters")
		).withName("VkSurfaceCapabilities2EXT").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		MIN_IMAGE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("minImageCount"));
		MAX_IMAGE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxImageCount"));
		MAX_IMAGE_ARRAY_LAYERS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxImageArrayLayers"));
		SUPPORTED_TRANSFORMS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("supportedTransforms"));
		CURRENT_TRANSFORM_HANDLE = LAYOUT.varHandle(PathElement.groupElement("currentTransform"));
		SUPPORTED_COMPOSITE_ALPHA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("supportedCompositeAlpha"));
		SUPPORTED_USAGE_FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("supportedUsageFlags"));
		SUPPORTED_SURFACE_COUNTERS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("supportedSurfaceCounters"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		MIN_IMAGE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("minImageCount"));
		MAX_IMAGE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxImageCount"));
		CURRENT_EXTENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("currentExtent"));
		MIN_IMAGE_EXTENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("minImageExtent"));
		MAX_IMAGE_EXTENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxImageExtent"));
		MAX_IMAGE_ARRAY_LAYERS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("maxImageArrayLayers"));
		SUPPORTED_TRANSFORMS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("supportedTransforms"));
		CURRENT_TRANSFORM_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("currentTransform"));
		SUPPORTED_COMPOSITE_ALPHA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("supportedCompositeAlpha"));
		SUPPORTED_USAGE_FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("supportedUsageFlags"));
		SUPPORTED_SURFACE_COUNTERS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("supportedSurfaceCounters"));
		//@formatter:on
	}

	public VkSurfaceCapabilities2EXT() {
	    this(Arena.ofAuto());
	}
	
	public VkSurfaceCapabilities2EXT(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkSurfaceCapabilities2EXT(MemorySegment segment) {
	    this.segment = segment;
	
	    currentExtent = new VkExtent2D(segment.asSlice(CURRENT_EXTENT_BYTE_OFFSET, VkExtent2D.LAYOUT));
	    minImageExtent = new VkExtent2D(segment.asSlice(MIN_IMAGE_EXTENT_BYTE_OFFSET, VkExtent2D.LAYOUT));
	    maxImageExtent = new VkExtent2D(segment.asSlice(MAX_IMAGE_EXTENT_BYTE_OFFSET, VkExtent2D.LAYOUT));
	}

    /// @see #sType()
    public VkSurfaceCapabilities2EXT sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkSurfaceCapabilities2EXT pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #minImageCount()
    public VkSurfaceCapabilities2EXT minImageCount(int minImageCount) {
    	MIN_IMAGE_COUNT_HANDLE.set(segment, 0L, minImageCount);
    	return this;
    }
    
    public int minImageCount() {
    	return (int) MIN_IMAGE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxImageCount()
    public VkSurfaceCapabilities2EXT maxImageCount(int maxImageCount) {
    	MAX_IMAGE_COUNT_HANDLE.set(segment, 0L, maxImageCount);
    	return this;
    }
    
    public int maxImageCount() {
    	return (int) MAX_IMAGE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #currentExtent()
    public VkSurfaceCapabilities2EXT currentExtent(Consumer<VkExtent2D> consumer) {
    	consumer.accept(currentExtent);
    	return this;
    }
    
    /// @see #currentExtent()
    public VkSurfaceCapabilities2EXT currentExtent(VkExtent2D other) {
    	currentExtent.set(other);
    	return this;
    }
    
    public VkExtent2D currentExtent() {
    	return currentExtent;
    }
    
    /// @see #minImageExtent()
    public VkSurfaceCapabilities2EXT minImageExtent(Consumer<VkExtent2D> consumer) {
    	consumer.accept(minImageExtent);
    	return this;
    }
    
    /// @see #minImageExtent()
    public VkSurfaceCapabilities2EXT minImageExtent(VkExtent2D other) {
    	minImageExtent.set(other);
    	return this;
    }
    
    public VkExtent2D minImageExtent() {
    	return minImageExtent;
    }
    
    /// @see #maxImageExtent()
    public VkSurfaceCapabilities2EXT maxImageExtent(Consumer<VkExtent2D> consumer) {
    	consumer.accept(maxImageExtent);
    	return this;
    }
    
    /// @see #maxImageExtent()
    public VkSurfaceCapabilities2EXT maxImageExtent(VkExtent2D other) {
    	maxImageExtent.set(other);
    	return this;
    }
    
    public VkExtent2D maxImageExtent() {
    	return maxImageExtent;
    }
    
    /// @see #maxImageArrayLayers()
    public VkSurfaceCapabilities2EXT maxImageArrayLayers(int maxImageArrayLayers) {
    	MAX_IMAGE_ARRAY_LAYERS_HANDLE.set(segment, 0L, maxImageArrayLayers);
    	return this;
    }
    
    public int maxImageArrayLayers() {
    	return (int) MAX_IMAGE_ARRAY_LAYERS_HANDLE.get(segment, 0L);
    }
    
    /// @see #supportedTransforms()
    public VkSurfaceCapabilities2EXT supportedTransforms(int supportedTransforms) {
    	SUPPORTED_TRANSFORMS_HANDLE.set(segment, 0L, supportedTransforms);
    	return this;
    }
    
    public int supportedTransforms() {
    	return (int) SUPPORTED_TRANSFORMS_HANDLE.get(segment, 0L);
    }
    
    /// @see #currentTransform()
    public VkSurfaceCapabilities2EXT currentTransform(int currentTransform) {
    	CURRENT_TRANSFORM_HANDLE.set(segment, 0L, currentTransform);
    	return this;
    }
    
    public int currentTransform() {
    	return (int) CURRENT_TRANSFORM_HANDLE.get(segment, 0L);
    }
    
    /// @see #supportedCompositeAlpha()
    public VkSurfaceCapabilities2EXT supportedCompositeAlpha(int supportedCompositeAlpha) {
    	SUPPORTED_COMPOSITE_ALPHA_HANDLE.set(segment, 0L, supportedCompositeAlpha);
    	return this;
    }
    
    public int supportedCompositeAlpha() {
    	return (int) SUPPORTED_COMPOSITE_ALPHA_HANDLE.get(segment, 0L);
    }
    
    /// @see #supportedUsageFlags()
    public VkSurfaceCapabilities2EXT supportedUsageFlags(int supportedUsageFlags) {
    	SUPPORTED_USAGE_FLAGS_HANDLE.set(segment, 0L, supportedUsageFlags);
    	return this;
    }
    
    public int supportedUsageFlags() {
    	return (int) SUPPORTED_USAGE_FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #supportedSurfaceCounters()
    public VkSurfaceCapabilities2EXT supportedSurfaceCounters(int supportedSurfaceCounters) {
    	SUPPORTED_SURFACE_COUNTERS_HANDLE.set(segment, 0L, supportedSurfaceCounters);
    	return this;
    }
    
    public int supportedSurfaceCounters() {
    	return (int) SUPPORTED_SURFACE_COUNTERS_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkSurfaceCapabilities2EXT set(VkSurfaceCapabilities2EXT other) {
        return set(other.segment);
    }
    
    @Override
    public VkSurfaceCapabilities2EXT set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkSurfaceCapabilities2EXT> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkSurfaceCapabilities2EXT> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkSurfaceCapabilities2EXT(segment),
            count
        );
    }
    
    public static NativeStructArray<VkSurfaceCapabilities2EXT> array(Arena arena, VkSurfaceCapabilities2EXT... structs) {
        NativeStructArray<VkSurfaceCapabilities2EXT> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkSurfaceCapabilities2EXT(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkSurfaceCapabilities2EXT> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkSurfaceCapabilities2EXT(segment)
        );
    }

}