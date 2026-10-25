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
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;

public final class VkSurfaceCapabilitiesKHR
		implements Struct<VkSurfaceCapabilitiesKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle MIN_IMAGE_COUNT_HANDLE;
	public static final VarHandle MAX_IMAGE_COUNT_HANDLE;
	public static final VarHandle MAX_IMAGE_ARRAY_LAYERS_HANDLE;
	public static final VarHandle SUPPORTED_TRANSFORMS_HANDLE;
	public static final VarHandle CURRENT_TRANSFORM_HANDLE;
	public static final VarHandle SUPPORTED_COMPOSITE_ALPHA_HANDLE;
	public static final VarHandle SUPPORTED_USAGE_FLAGS_HANDLE;

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

	private final MemorySegment segment;

	private final VkExtent2D currentExtent;
	private final VkExtent2D minImageExtent;
	private final VkExtent2D maxImageExtent;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("minImageCount"),
		    JAVA_INT.withName("maxImageCount"),
		    VkExtent2D.LAYOUT.withName("currentExtent"),
		    VkExtent2D.LAYOUT.withName("minImageExtent"),
		    VkExtent2D.LAYOUT.withName("maxImageExtent"),
		    JAVA_INT.withName("maxImageArrayLayers"),
		    JAVA_INT.withName("supportedTransforms"),
		    JAVA_INT.withName("currentTransform"),
		    JAVA_INT.withName("supportedCompositeAlpha"),
		    JAVA_INT.withName("supportedUsageFlags")
		).withName("VkSurfaceCapabilitiesKHR").withByteAlignment(4);
		
		MIN_IMAGE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("minImageCount"));
		MAX_IMAGE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxImageCount"));
		MAX_IMAGE_ARRAY_LAYERS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("maxImageArrayLayers"));
		SUPPORTED_TRANSFORMS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("supportedTransforms"));
		CURRENT_TRANSFORM_HANDLE = LAYOUT.varHandle(PathElement.groupElement("currentTransform"));
		SUPPORTED_COMPOSITE_ALPHA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("supportedCompositeAlpha"));
		SUPPORTED_USAGE_FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("supportedUsageFlags"));
		
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
		//@formatter:on
	}

	public VkSurfaceCapabilitiesKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkSurfaceCapabilitiesKHR(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkSurfaceCapabilitiesKHR(MemorySegment segment) {
	    this.segment = segment;
	
	    currentExtent = new VkExtent2D(segment.asSlice(CURRENT_EXTENT_BYTE_OFFSET, VkExtent2D.LAYOUT));
	    minImageExtent = new VkExtent2D(segment.asSlice(MIN_IMAGE_EXTENT_BYTE_OFFSET, VkExtent2D.LAYOUT));
	    maxImageExtent = new VkExtent2D(segment.asSlice(MAX_IMAGE_EXTENT_BYTE_OFFSET, VkExtent2D.LAYOUT));
	}

    /// @see #minImageCount()
    public VkSurfaceCapabilitiesKHR minImageCount(int minImageCount) {
    	MIN_IMAGE_COUNT_HANDLE.set(segment, 0L, minImageCount);
    	return this;
    }
    
    public int minImageCount() {
    	return (int) MIN_IMAGE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #maxImageCount()
    public VkSurfaceCapabilitiesKHR maxImageCount(int maxImageCount) {
    	MAX_IMAGE_COUNT_HANDLE.set(segment, 0L, maxImageCount);
    	return this;
    }
    
    public int maxImageCount() {
    	return (int) MAX_IMAGE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #currentExtent()
    public VkSurfaceCapabilitiesKHR currentExtent(Consumer<VkExtent2D> consumer) {
    	consumer.accept(currentExtent);
    	return this;
    }
    
    /// @see #currentExtent()
    public VkSurfaceCapabilitiesKHR currentExtent(VkExtent2D other) {
    	currentExtent.set(other);
    	return this;
    }
    
    public VkExtent2D currentExtent() {
    	return currentExtent;
    }
    
    /// @see #minImageExtent()
    public VkSurfaceCapabilitiesKHR minImageExtent(Consumer<VkExtent2D> consumer) {
    	consumer.accept(minImageExtent);
    	return this;
    }
    
    /// @see #minImageExtent()
    public VkSurfaceCapabilitiesKHR minImageExtent(VkExtent2D other) {
    	minImageExtent.set(other);
    	return this;
    }
    
    public VkExtent2D minImageExtent() {
    	return minImageExtent;
    }
    
    /// @see #maxImageExtent()
    public VkSurfaceCapabilitiesKHR maxImageExtent(Consumer<VkExtent2D> consumer) {
    	consumer.accept(maxImageExtent);
    	return this;
    }
    
    /// @see #maxImageExtent()
    public VkSurfaceCapabilitiesKHR maxImageExtent(VkExtent2D other) {
    	maxImageExtent.set(other);
    	return this;
    }
    
    public VkExtent2D maxImageExtent() {
    	return maxImageExtent;
    }
    
    /// @see #maxImageArrayLayers()
    public VkSurfaceCapabilitiesKHR maxImageArrayLayers(int maxImageArrayLayers) {
    	MAX_IMAGE_ARRAY_LAYERS_HANDLE.set(segment, 0L, maxImageArrayLayers);
    	return this;
    }
    
    public int maxImageArrayLayers() {
    	return (int) MAX_IMAGE_ARRAY_LAYERS_HANDLE.get(segment, 0L);
    }
    
    /// @see #supportedTransforms()
    public VkSurfaceCapabilitiesKHR supportedTransforms(int supportedTransforms) {
    	SUPPORTED_TRANSFORMS_HANDLE.set(segment, 0L, supportedTransforms);
    	return this;
    }
    
    public int supportedTransforms() {
    	return (int) SUPPORTED_TRANSFORMS_HANDLE.get(segment, 0L);
    }
    
    /// @see #currentTransform()
    public VkSurfaceCapabilitiesKHR currentTransform(int currentTransform) {
    	CURRENT_TRANSFORM_HANDLE.set(segment, 0L, currentTransform);
    	return this;
    }
    
    public int currentTransform() {
    	return (int) CURRENT_TRANSFORM_HANDLE.get(segment, 0L);
    }
    
    /// @see #supportedCompositeAlpha()
    public VkSurfaceCapabilitiesKHR supportedCompositeAlpha(int supportedCompositeAlpha) {
    	SUPPORTED_COMPOSITE_ALPHA_HANDLE.set(segment, 0L, supportedCompositeAlpha);
    	return this;
    }
    
    public int supportedCompositeAlpha() {
    	return (int) SUPPORTED_COMPOSITE_ALPHA_HANDLE.get(segment, 0L);
    }
    
    /// @see #supportedUsageFlags()
    public VkSurfaceCapabilitiesKHR supportedUsageFlags(int supportedUsageFlags) {
    	SUPPORTED_USAGE_FLAGS_HANDLE.set(segment, 0L, supportedUsageFlags);
    	return this;
    }
    
    public int supportedUsageFlags() {
    	return (int) SUPPORTED_USAGE_FLAGS_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkSurfaceCapabilitiesKHR set(VkSurfaceCapabilitiesKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkSurfaceCapabilitiesKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkSurfaceCapabilitiesKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkSurfaceCapabilitiesKHR> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkSurfaceCapabilitiesKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkSurfaceCapabilitiesKHR> array(SegmentAllocator allocator, VkSurfaceCapabilitiesKHR... structs) {
        NativeStructArray<VkSurfaceCapabilitiesKHR> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkSurfaceCapabilitiesKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkSurfaceCapabilitiesKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkSurfaceCapabilitiesKHR(segment)
        );
    }

}