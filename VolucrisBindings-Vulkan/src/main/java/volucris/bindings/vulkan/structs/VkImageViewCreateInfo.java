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

public final class VkImageViewCreateInfo
		implements Struct<VkImageViewCreateInfo> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle FLAGS_HANDLE;
	public static final VarHandle IMAGE_HANDLE;
	public static final VarHandle VIEW_TYPE_HANDLE;
	public static final VarHandle FORMAT_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long FLAGS_BYTE_OFFSET;
	public static final long IMAGE_BYTE_OFFSET;
	public static final long VIEW_TYPE_BYTE_OFFSET;
	public static final long FORMAT_BYTE_OFFSET;
	public static final long COMPONENTS_BYTE_OFFSET;
	public static final long SUBRESOURCE_RANGE_BYTE_OFFSET;

	private final MemorySegment segment;

	private final VkComponentMapping components;
	private final VkImageSubresourceRange subresourceRange;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("flags"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("image"),
		    JAVA_INT.withName("viewType"),
		    JAVA_INT.withName("format"),
		    VkComponentMapping.LAYOUT.withName("components"),
		    VkImageSubresourceRange.LAYOUT.withName("subresourceRange"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkImageViewCreateInfo").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
		IMAGE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("image"));
		VIEW_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("viewType"));
		FORMAT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("format"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
		IMAGE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("image"));
		VIEW_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("viewType"));
		FORMAT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("format"));
		COMPONENTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("components"));
		SUBRESOURCE_RANGE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("subresourceRange"));
		//@formatter:on
	}

	public VkImageViewCreateInfo() {
	    this(Arena.ofAuto());
	}
	
	public VkImageViewCreateInfo(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkImageViewCreateInfo(MemorySegment segment) {
	    this.segment = segment;
	
	    components = new VkComponentMapping(segment.asSlice(COMPONENTS_BYTE_OFFSET, VkComponentMapping.LAYOUT));
	    subresourceRange = new VkImageSubresourceRange(segment.asSlice(SUBRESOURCE_RANGE_BYTE_OFFSET, VkImageSubresourceRange.LAYOUT));
	}

    /// @see #sType()
    public VkImageViewCreateInfo sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkImageViewCreateInfo pNext(MemorySegment pNext) {
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
    public VkImageViewCreateInfo flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    /// @see #image()
    public VkImageViewCreateInfo image(VkImage image) {
    	IMAGE_HANDLE.set(segment, 0L, image.memorySegment());
    	return this;
    }
    
    public @Nullable VkImage image() {
    	MemorySegment segment = (MemorySegment) IMAGE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkImage(segment);
    }
    
    /// @see #viewType()
    public VkImageViewCreateInfo viewType(int viewType) {
    	VIEW_TYPE_HANDLE.set(segment, 0L, viewType);
    	return this;
    }
    
    public int viewType() {
    	return (int) VIEW_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #format()
    public VkImageViewCreateInfo format(int format) {
    	FORMAT_HANDLE.set(segment, 0L, format);
    	return this;
    }
    
    public int format() {
    	return (int) FORMAT_HANDLE.get(segment, 0L);
    }
    
    /// @see #components()
    public VkImageViewCreateInfo components(Consumer<VkComponentMapping> consumer) {
    	consumer.accept(components);
    	return this;
    }
    
    /// @see #components()
    public VkImageViewCreateInfo components(VkComponentMapping other) {
    	components.set(other);
    	return this;
    }
    
    public VkComponentMapping components() {
    	return components;
    }
    
    /// @see #subresourceRange()
    public VkImageViewCreateInfo subresourceRange(Consumer<VkImageSubresourceRange> consumer) {
    	consumer.accept(subresourceRange);
    	return this;
    }
    
    /// @see #subresourceRange()
    public VkImageViewCreateInfo subresourceRange(VkImageSubresourceRange other) {
    	subresourceRange.set(other);
    	return this;
    }
    
    public VkImageSubresourceRange subresourceRange() {
    	return subresourceRange;
    }
    
    @Override
    public VkImageViewCreateInfo set(VkImageViewCreateInfo other) {
        return set(other.segment);
    }
    
    @Override
    public VkImageViewCreateInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkImageViewCreateInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkImageViewCreateInfo> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkImageViewCreateInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<VkImageViewCreateInfo> array(Arena arena, VkImageViewCreateInfo... structs) {
        NativeStructArray<VkImageViewCreateInfo> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkImageViewCreateInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkImageViewCreateInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkImageViewCreateInfo(segment)
        );
    }

}