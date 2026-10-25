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

public final class VkVideoFormatPropertiesKHR
		implements Struct<VkVideoFormatPropertiesKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle FORMAT_HANDLE;
	public static final VarHandle IMAGE_CREATE_FLAGS_HANDLE;
	public static final VarHandle IMAGE_TYPE_HANDLE;
	public static final VarHandle IMAGE_TILING_HANDLE;
	public static final VarHandle IMAGE_USAGE_FLAGS_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long FORMAT_BYTE_OFFSET;
	public static final long COMPONENT_MAPPING_BYTE_OFFSET;
	public static final long IMAGE_CREATE_FLAGS_BYTE_OFFSET;
	public static final long IMAGE_TYPE_BYTE_OFFSET;
	public static final long IMAGE_TILING_BYTE_OFFSET;
	public static final long IMAGE_USAGE_FLAGS_BYTE_OFFSET;

	private final MemorySegment segment;

	private final VkComponentMapping componentMapping;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("format"),
		    VkComponentMapping.LAYOUT.withName("componentMapping"),
		    JAVA_INT.withName("imageCreateFlags"),
		    JAVA_INT.withName("imageType"),
		    JAVA_INT.withName("imageTiling"),
		    JAVA_INT.withName("imageUsageFlags"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkVideoFormatPropertiesKHR").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		FORMAT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("format"));
		IMAGE_CREATE_FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("imageCreateFlags"));
		IMAGE_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("imageType"));
		IMAGE_TILING_HANDLE = LAYOUT.varHandle(PathElement.groupElement("imageTiling"));
		IMAGE_USAGE_FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("imageUsageFlags"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		FORMAT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("format"));
		COMPONENT_MAPPING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("componentMapping"));
		IMAGE_CREATE_FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("imageCreateFlags"));
		IMAGE_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("imageType"));
		IMAGE_TILING_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("imageTiling"));
		IMAGE_USAGE_FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("imageUsageFlags"));
		//@formatter:on
	}

	public VkVideoFormatPropertiesKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkVideoFormatPropertiesKHR(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkVideoFormatPropertiesKHR(MemorySegment segment) {
	    this.segment = segment;
	
	    componentMapping = new VkComponentMapping(segment.asSlice(COMPONENT_MAPPING_BYTE_OFFSET, VkComponentMapping.LAYOUT));
	}

    /// @see #sType()
    public VkVideoFormatPropertiesKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkVideoFormatPropertiesKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #format()
    public VkVideoFormatPropertiesKHR format(int format) {
    	FORMAT_HANDLE.set(segment, 0L, format);
    	return this;
    }
    
    public int format() {
    	return (int) FORMAT_HANDLE.get(segment, 0L);
    }
    
    /// @see #componentMapping()
    public VkVideoFormatPropertiesKHR componentMapping(Consumer<VkComponentMapping> consumer) {
    	consumer.accept(componentMapping);
    	return this;
    }
    
    /// @see #componentMapping()
    public VkVideoFormatPropertiesKHR componentMapping(VkComponentMapping other) {
    	componentMapping.set(other);
    	return this;
    }
    
    public VkComponentMapping componentMapping() {
    	return componentMapping;
    }
    
    /// @see #imageCreateFlags()
    public VkVideoFormatPropertiesKHR imageCreateFlags(int imageCreateFlags) {
    	IMAGE_CREATE_FLAGS_HANDLE.set(segment, 0L, imageCreateFlags);
    	return this;
    }
    
    public int imageCreateFlags() {
    	return (int) IMAGE_CREATE_FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #imageType()
    public VkVideoFormatPropertiesKHR imageType(int imageType) {
    	IMAGE_TYPE_HANDLE.set(segment, 0L, imageType);
    	return this;
    }
    
    public int imageType() {
    	return (int) IMAGE_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #imageTiling()
    public VkVideoFormatPropertiesKHR imageTiling(int imageTiling) {
    	IMAGE_TILING_HANDLE.set(segment, 0L, imageTiling);
    	return this;
    }
    
    public int imageTiling() {
    	return (int) IMAGE_TILING_HANDLE.get(segment, 0L);
    }
    
    /// @see #imageUsageFlags()
    public VkVideoFormatPropertiesKHR imageUsageFlags(int imageUsageFlags) {
    	IMAGE_USAGE_FLAGS_HANDLE.set(segment, 0L, imageUsageFlags);
    	return this;
    }
    
    public int imageUsageFlags() {
    	return (int) IMAGE_USAGE_FLAGS_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkVideoFormatPropertiesKHR set(VkVideoFormatPropertiesKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkVideoFormatPropertiesKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkVideoFormatPropertiesKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkVideoFormatPropertiesKHR> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkVideoFormatPropertiesKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkVideoFormatPropertiesKHR> array(SegmentAllocator allocator, VkVideoFormatPropertiesKHR... structs) {
        NativeStructArray<VkVideoFormatPropertiesKHR> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkVideoFormatPropertiesKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkVideoFormatPropertiesKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkVideoFormatPropertiesKHR(segment)
        );
    }

}