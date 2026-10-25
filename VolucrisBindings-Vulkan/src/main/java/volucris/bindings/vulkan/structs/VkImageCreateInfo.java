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
import volucris.bindings.core.NativeIntArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkImageCreateInfo
		implements Struct<VkImageCreateInfo> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle FLAGS_HANDLE;
	public static final VarHandle IMAGE_TYPE_HANDLE;
	public static final VarHandle FORMAT_HANDLE;
	public static final VarHandle MIP_LEVELS_HANDLE;
	public static final VarHandle ARRAY_LAYERS_HANDLE;
	public static final VarHandle SAMPLES_HANDLE;
	public static final VarHandle TILING_HANDLE;
	public static final VarHandle USAGE_HANDLE;
	public static final VarHandle SHARING_MODE_HANDLE;
	public static final VarHandle QUEUE_FAMILY_INDEX_COUNT_HANDLE;
	public static final VarHandle P_QUEUE_FAMILY_INDICES_HANDLE;
	public static final VarHandle INITIAL_LAYOUT_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long FLAGS_BYTE_OFFSET;
	public static final long IMAGE_TYPE_BYTE_OFFSET;
	public static final long FORMAT_BYTE_OFFSET;
	public static final long EXTENT_BYTE_OFFSET;
	public static final long MIP_LEVELS_BYTE_OFFSET;
	public static final long ARRAY_LAYERS_BYTE_OFFSET;
	public static final long SAMPLES_BYTE_OFFSET;
	public static final long TILING_BYTE_OFFSET;
	public static final long USAGE_BYTE_OFFSET;
	public static final long SHARING_MODE_BYTE_OFFSET;
	public static final long QUEUE_FAMILY_INDEX_COUNT_BYTE_OFFSET;
	public static final long P_QUEUE_FAMILY_INDICES_BYTE_OFFSET;
	public static final long INITIAL_LAYOUT_BYTE_OFFSET;

	private final MemorySegment segment;

	private final VkExtent3D extent;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("flags"),
		    JAVA_INT.withName("imageType"),
		    JAVA_INT.withName("format"),
		    VkExtent3D.LAYOUT.withName("extent"),
		    JAVA_INT.withName("mipLevels"),
		    JAVA_INT.withName("arrayLayers"),
		    JAVA_INT.withName("samples"),
		    JAVA_INT.withName("tiling"),
		    JAVA_INT.withName("usage"),
		    JAVA_INT.withName("sharingMode"),
		    JAVA_INT.withName("queueFamilyIndexCount"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pQueueFamilyIndices"),
		    JAVA_INT.withName("initialLayout"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkImageCreateInfo").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
		IMAGE_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("imageType"));
		FORMAT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("format"));
		MIP_LEVELS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("mipLevels"));
		ARRAY_LAYERS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("arrayLayers"));
		SAMPLES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("samples"));
		TILING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("tiling"));
		USAGE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("usage"));
		SHARING_MODE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sharingMode"));
		QUEUE_FAMILY_INDEX_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("queueFamilyIndexCount"));
		P_QUEUE_FAMILY_INDICES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pQueueFamilyIndices"));
		INITIAL_LAYOUT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("initialLayout"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
		IMAGE_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("imageType"));
		FORMAT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("format"));
		EXTENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("extent"));
		MIP_LEVELS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("mipLevels"));
		ARRAY_LAYERS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("arrayLayers"));
		SAMPLES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("samples"));
		TILING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("tiling"));
		USAGE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("usage"));
		SHARING_MODE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sharingMode"));
		QUEUE_FAMILY_INDEX_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("queueFamilyIndexCount"));
		P_QUEUE_FAMILY_INDICES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pQueueFamilyIndices"));
		INITIAL_LAYOUT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("initialLayout"));
		//@formatter:on
	}

	public VkImageCreateInfo() {
	    this(Arena.ofAuto());
	}
	
	public VkImageCreateInfo(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkImageCreateInfo(MemorySegment segment) {
	    this.segment = segment;
	
	    extent = new VkExtent3D(segment.asSlice(EXTENT_BYTE_OFFSET, VkExtent3D.LAYOUT));
	}

    /// @see #sType()
    public VkImageCreateInfo sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkImageCreateInfo pNext(MemorySegment pNext) {
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
    public VkImageCreateInfo flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #imageType()
    public VkImageCreateInfo imageType(int imageType) {
    	IMAGE_TYPE_HANDLE.set(segment, 0L, imageType);
    	return this;
    }
    
    public int imageType() {
    	return (int) IMAGE_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #format()
    public VkImageCreateInfo format(int format) {
    	FORMAT_HANDLE.set(segment, 0L, format);
    	return this;
    }
    
    public int format() {
    	return (int) FORMAT_HANDLE.get(segment, 0L);
    }
    
    /// @see #extent()
    public VkImageCreateInfo extent(Consumer<VkExtent3D> consumer) {
    	consumer.accept(extent);
    	return this;
    }
    
    /// @see #extent()
    public VkImageCreateInfo extent(VkExtent3D other) {
    	extent.set(other);
    	return this;
    }
    
    public VkExtent3D extent() {
    	return extent;
    }
    
    /// @see #mipLevels()
    public VkImageCreateInfo mipLevels(int mipLevels) {
    	MIP_LEVELS_HANDLE.set(segment, 0L, mipLevels);
    	return this;
    }
    
    public int mipLevels() {
    	return (int) MIP_LEVELS_HANDLE.get(segment, 0L);
    }
    
    /// @see #arrayLayers()
    public VkImageCreateInfo arrayLayers(int arrayLayers) {
    	ARRAY_LAYERS_HANDLE.set(segment, 0L, arrayLayers);
    	return this;
    }
    
    public int arrayLayers() {
    	return (int) ARRAY_LAYERS_HANDLE.get(segment, 0L);
    }
    
    /// @see #samples()
    public VkImageCreateInfo samples(int samples) {
    	SAMPLES_HANDLE.set(segment, 0L, samples);
    	return this;
    }
    
    public int samples() {
    	return (int) SAMPLES_HANDLE.get(segment, 0L);
    }
    
    /// @see #tiling()
    public VkImageCreateInfo tiling(int tiling) {
    	TILING_HANDLE.set(segment, 0L, tiling);
    	return this;
    }
    
    public int tiling() {
    	return (int) TILING_HANDLE.get(segment, 0L);
    }
    
    /// @see #usage()
    public VkImageCreateInfo usage(int usage) {
    	USAGE_HANDLE.set(segment, 0L, usage);
    	return this;
    }
    
    public int usage() {
    	return (int) USAGE_HANDLE.get(segment, 0L);
    }
    
    /// @see #sharingMode()
    public VkImageCreateInfo sharingMode(int sharingMode) {
    	SHARING_MODE_HANDLE.set(segment, 0L, sharingMode);
    	return this;
    }
    
    public int sharingMode() {
    	return (int) SHARING_MODE_HANDLE.get(segment, 0L);
    }
    
    /// @see #queueFamilyIndexCount()
    public VkImageCreateInfo queueFamilyIndexCount(int queueFamilyIndexCount) {
    	QUEUE_FAMILY_INDEX_COUNT_HANDLE.set(segment, 0L, queueFamilyIndexCount);
    	return this;
    }
    
    public int queueFamilyIndexCount() {
    	return (int) QUEUE_FAMILY_INDEX_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pQueueFamilyIndices()
    public VkImageCreateInfo pQueueFamilyIndices(NativeIntArray pQueueFamilyIndices) {
    	P_QUEUE_FAMILY_INDICES_HANDLE.set(segment, 0L, pQueueFamilyIndices.memorySegment());
    	return this;
    }
    
    public @Nullable NativeIntArray pQueueFamilyIndices() {
    	MemorySegment segment = (MemorySegment) P_QUEUE_FAMILY_INDICES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeIntArray(segment);
    }
    
    /// @see #initialLayout()
    public VkImageCreateInfo initialLayout(int initialLayout) {
    	INITIAL_LAYOUT_HANDLE.set(segment, 0L, initialLayout);
    	return this;
    }
    
    public int initialLayout() {
    	return (int) INITIAL_LAYOUT_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkImageCreateInfo set(VkImageCreateInfo other) {
        return set(other.segment);
    }
    
    @Override
    public VkImageCreateInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkImageCreateInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkImageCreateInfo> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkImageCreateInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<VkImageCreateInfo> array(SegmentAllocator allocator, VkImageCreateInfo... structs) {
        NativeStructArray<VkImageCreateInfo> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkImageCreateInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkImageCreateInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkImageCreateInfo(segment)
        );
    }

}