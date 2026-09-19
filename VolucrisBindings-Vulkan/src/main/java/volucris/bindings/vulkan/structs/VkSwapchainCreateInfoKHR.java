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
import volucris.bindings.core.NativeIntArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkSwapchainCreateInfoKHR
		implements Struct<VkSwapchainCreateInfoKHR> {

    public static final StructLayout LAYOUT;

    public static final VarHandle S_TYPE_HANDLE;
    public static final VarHandle P_NEXT_HANDLE;
    public static final VarHandle FLAGS_HANDLE;
    public static final VarHandle SURFACE_HANDLE;
    public static final VarHandle MIN_IMAGE_COUNT_HANDLE;
    public static final VarHandle IMAGE_FORMAT_HANDLE;
    public static final VarHandle IMAGE_COLOR_SPACE_HANDLE;
    public static final VarHandle IMAGE_ARRAY_LAYERS_HANDLE;
    public static final VarHandle IMAGE_USAGE_HANDLE;
    public static final VarHandle IMAGE_SHARING_MODE_HANDLE;
    public static final VarHandle QUEUE_FAMILY_INDEX_COUNT_HANDLE;
    public static final VarHandle P_QUEUE_FAMILY_INDICES_HANDLE;
    public static final VarHandle PRE_TRANSFORM_HANDLE;
    public static final VarHandle COMPOSITE_ALPHA_HANDLE;
    public static final VarHandle PRESENT_MODE_HANDLE;
    public static final VarHandle CLIPPED_HANDLE;
    public static final VarHandle OLD_SWAPCHAIN_HANDLE;

    public static final long S_TYPE_BYTE_OFFSET;
    public static final long P_NEXT_BYTE_OFFSET;
    public static final long FLAGS_BYTE_OFFSET;
    public static final long SURFACE_BYTE_OFFSET;
    public static final long MIN_IMAGE_COUNT_BYTE_OFFSET;
    public static final long IMAGE_FORMAT_BYTE_OFFSET;
    public static final long IMAGE_COLOR_SPACE_BYTE_OFFSET;
    public static final long IMAGE_EXTENT_BYTE_OFFSET;
    public static final long IMAGE_ARRAY_LAYERS_BYTE_OFFSET;
    public static final long IMAGE_USAGE_BYTE_OFFSET;
    public static final long IMAGE_SHARING_MODE_BYTE_OFFSET;
    public static final long QUEUE_FAMILY_INDEX_COUNT_BYTE_OFFSET;
    public static final long P_QUEUE_FAMILY_INDICES_BYTE_OFFSET;
    public static final long PRE_TRANSFORM_BYTE_OFFSET;
    public static final long COMPOSITE_ALPHA_BYTE_OFFSET;
    public static final long PRESENT_MODE_BYTE_OFFSET;
    public static final long CLIPPED_BYTE_OFFSET;
    public static final long OLD_SWAPCHAIN_BYTE_OFFSET;

    private final MemorySegment segment;

    private final VkExtent2D imageExtent;

    static {
        //@formatter:off
        LAYOUT = MemoryLayout.structLayout(
            JAVA_INT.withName("sType"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pNext"),
            JAVA_INT.withName("flags"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("surface"),
            JAVA_INT.withName("minImageCount"),
            JAVA_INT.withName("imageFormat"),
            JAVA_INT.withName("imageColorSpace"),
            VkExtent2D.LAYOUT.withName("imageExtent"),
            JAVA_INT.withName("imageArrayLayers"),
            JAVA_INT.withName("imageUsage"),
            JAVA_INT.withName("imageSharingMode"),
            JAVA_INT.withName("queueFamilyIndexCount"),
            MemoryLayout.paddingLayout(4),
            UNBOUNDED_ADDRESS.withName("pQueueFamilyIndices"),
            JAVA_INT.withName("preTransform"),
            JAVA_INT.withName("compositeAlpha"),
            JAVA_INT.withName("presentMode"),
            JAVA_INT.withName("clipped"),
            UNBOUNDED_ADDRESS.withName("oldSwapchain")
        ).withName("VkSwapchainCreateInfoKHR").withByteAlignment(8);
        
        S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
        P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
        FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
        SURFACE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("surface"));
        MIN_IMAGE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("minImageCount"));
        IMAGE_FORMAT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("imageFormat"));
        IMAGE_COLOR_SPACE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("imageColorSpace"));
        IMAGE_ARRAY_LAYERS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("imageArrayLayers"));
        IMAGE_USAGE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("imageUsage"));
        IMAGE_SHARING_MODE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("imageSharingMode"));
        QUEUE_FAMILY_INDEX_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("queueFamilyIndexCount"));
        P_QUEUE_FAMILY_INDICES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pQueueFamilyIndices"));
        PRE_TRANSFORM_HANDLE = LAYOUT.varHandle(PathElement.groupElement("preTransform"));
        COMPOSITE_ALPHA_HANDLE = LAYOUT.varHandle(PathElement.groupElement("compositeAlpha"));
        PRESENT_MODE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("presentMode"));
        CLIPPED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("clipped"));
        OLD_SWAPCHAIN_HANDLE = LAYOUT.varHandle(PathElement.groupElement("oldSwapchain"));
        
        S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
        P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
        FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
        SURFACE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("surface"));
        MIN_IMAGE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("minImageCount"));
        IMAGE_FORMAT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("imageFormat"));
        IMAGE_COLOR_SPACE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("imageColorSpace"));
        IMAGE_EXTENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("imageExtent"));
        IMAGE_ARRAY_LAYERS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("imageArrayLayers"));
        IMAGE_USAGE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("imageUsage"));
        IMAGE_SHARING_MODE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("imageSharingMode"));
        QUEUE_FAMILY_INDEX_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("queueFamilyIndexCount"));
        P_QUEUE_FAMILY_INDICES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pQueueFamilyIndices"));
        PRE_TRANSFORM_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("preTransform"));
        COMPOSITE_ALPHA_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("compositeAlpha"));
        PRESENT_MODE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("presentMode"));
        CLIPPED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("clipped"));
        OLD_SWAPCHAIN_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("oldSwapchain"));
        //@formatter:on
    }

    public VkSwapchainCreateInfoKHR() {
        this(Arena.ofAuto());
    }
    
    public VkSwapchainCreateInfoKHR(Arena arena) {
        this(arena.allocate(LAYOUT));
    }
    
    public VkSwapchainCreateInfoKHR(MemorySegment segment) {
        this.segment = segment;
    
        imageExtent = new VkExtent2D(segment.asSlice(IMAGE_EXTENT_BYTE_OFFSET, VkExtent2D.LAYOUT));
    }

    /// @see #sType()
    public VkSwapchainCreateInfoKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkSwapchainCreateInfoKHR pNext(MemorySegment pNext) {
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
    public VkSwapchainCreateInfoKHR flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #surface()
    public VkSwapchainCreateInfoKHR surface(VkSurfaceKHR surface) {
    	SURFACE_HANDLE.set(segment, 0L, surface.memorySegment());
    	return this;
    }
    
    public @Nullable VkSurfaceKHR surface() {
    	MemorySegment segment = (MemorySegment) SURFACE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkSurfaceKHR(segment);
    }
    
    /// @see #minImageCount()
    public VkSwapchainCreateInfoKHR minImageCount(int minImageCount) {
    	MIN_IMAGE_COUNT_HANDLE.set(segment, 0L, minImageCount);
    	return this;
    }
    
    public int minImageCount() {
    	return (int) MIN_IMAGE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #imageFormat()
    public VkSwapchainCreateInfoKHR imageFormat(int imageFormat) {
    	IMAGE_FORMAT_HANDLE.set(segment, 0L, imageFormat);
    	return this;
    }
    
    public int imageFormat() {
    	return (int) IMAGE_FORMAT_HANDLE.get(segment, 0L);
    }
    
    /// @see #imageColorSpace()
    public VkSwapchainCreateInfoKHR imageColorSpace(int imageColorSpace) {
    	IMAGE_COLOR_SPACE_HANDLE.set(segment, 0L, imageColorSpace);
    	return this;
    }
    
    public int imageColorSpace() {
    	return (int) IMAGE_COLOR_SPACE_HANDLE.get(segment, 0L);
    }
    
    /// @see #imageArrayLayers()
    public VkSwapchainCreateInfoKHR imageArrayLayers(int imageArrayLayers) {
    	IMAGE_ARRAY_LAYERS_HANDLE.set(segment, 0L, imageArrayLayers);
    	return this;
    }
    
    public int imageArrayLayers() {
    	return (int) IMAGE_ARRAY_LAYERS_HANDLE.get(segment, 0L);
    }
    
    /// @see #imageUsage()
    public VkSwapchainCreateInfoKHR imageUsage(int imageUsage) {
    	IMAGE_USAGE_HANDLE.set(segment, 0L, imageUsage);
    	return this;
    }
    
    public int imageUsage() {
    	return (int) IMAGE_USAGE_HANDLE.get(segment, 0L);
    }
    
    /// @see #imageSharingMode()
    public VkSwapchainCreateInfoKHR imageSharingMode(int imageSharingMode) {
    	IMAGE_SHARING_MODE_HANDLE.set(segment, 0L, imageSharingMode);
    	return this;
    }
    
    public int imageSharingMode() {
    	return (int) IMAGE_SHARING_MODE_HANDLE.get(segment, 0L);
    }
    
    /// @see #queueFamilyIndexCount()
    public VkSwapchainCreateInfoKHR queueFamilyIndexCount(int queueFamilyIndexCount) {
    	QUEUE_FAMILY_INDEX_COUNT_HANDLE.set(segment, 0L, queueFamilyIndexCount);
    	return this;
    }
    
    public int queueFamilyIndexCount() {
    	return (int) QUEUE_FAMILY_INDEX_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pQueueFamilyIndices()
    public VkSwapchainCreateInfoKHR pQueueFamilyIndices(NativeIntArray pQueueFamilyIndices) {
    	P_QUEUE_FAMILY_INDICES_HANDLE.set(segment, 0L, pQueueFamilyIndices.memorySegment());
    	return this;
    }
    
    public @Nullable NativeIntArray pQueueFamilyIndices() {
    	MemorySegment segment = (MemorySegment) P_QUEUE_FAMILY_INDICES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeIntArray(segment);
    }
    
    /// @see #preTransform()
    public VkSwapchainCreateInfoKHR preTransform(int preTransform) {
    	PRE_TRANSFORM_HANDLE.set(segment, 0L, preTransform);
    	return this;
    }
    
    public int preTransform() {
    	return (int) PRE_TRANSFORM_HANDLE.get(segment, 0L);
    }
    
    /// @see #compositeAlpha()
    public VkSwapchainCreateInfoKHR compositeAlpha(int compositeAlpha) {
    	COMPOSITE_ALPHA_HANDLE.set(segment, 0L, compositeAlpha);
    	return this;
    }
    
    public int compositeAlpha() {
    	return (int) COMPOSITE_ALPHA_HANDLE.get(segment, 0L);
    }
    
    /// @see #presentMode()
    public VkSwapchainCreateInfoKHR presentMode(int presentMode) {
    	PRESENT_MODE_HANDLE.set(segment, 0L, presentMode);
    	return this;
    }
    
    public int presentMode() {
    	return (int) PRESENT_MODE_HANDLE.get(segment, 0L);
    }
    
    /// @see #clipped()
    public VkSwapchainCreateInfoKHR clipped(int clipped) {
    	CLIPPED_HANDLE.set(segment, 0L, clipped);
    	return this;
    }
    
    public int clipped() {
    	return (int) CLIPPED_HANDLE.get(segment, 0L);
    }
    
    /// @see #oldSwapchain()
    public VkSwapchainCreateInfoKHR oldSwapchain(VkSwapchainKHR oldSwapchain) {
    	OLD_SWAPCHAIN_HANDLE.set(segment, 0L, oldSwapchain.memorySegment());
    	return this;
    }
    
    public @Nullable VkSwapchainKHR oldSwapchain() {
    	MemorySegment segment = (MemorySegment) OLD_SWAPCHAIN_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkSwapchainKHR(segment);
    }
    
    /// @see #imageExtent()
    public VkSwapchainCreateInfoKHR imageExtent(Consumer<VkExtent2D> consumer) {
    	consumer.accept(imageExtent);
    	return this;
    }
    
    /// @see #imageExtent()
    public VkSwapchainCreateInfoKHR imageExtent(VkExtent2D other) {
    	imageExtent.set(other);
    	return this;
    }
    
    public VkExtent2D imageExtent() {
    	return imageExtent;
    }
    
    @Override
    public VkSwapchainCreateInfoKHR set(VkSwapchainCreateInfoKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkSwapchainCreateInfoKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkSwapchainCreateInfoKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkSwapchainCreateInfoKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkSwapchainCreateInfoKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkSwapchainCreateInfoKHR> array(Arena arena, VkSwapchainCreateInfoKHR... structs) {
        NativeStructArray<VkSwapchainCreateInfoKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkSwapchainCreateInfoKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkSwapchainCreateInfoKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkSwapchainCreateInfoKHR(segment)
        );
    }
    
}