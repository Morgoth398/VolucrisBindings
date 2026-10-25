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

public final class VkImageSubresource2
		implements Struct<VkImageSubresource2> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long IMAGE_SUBRESOURCE_BYTE_OFFSET;

	private final MemorySegment segment;

	private final VkImageSubresource imageSubresource;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    VkImageSubresource.LAYOUT.withName("imageSubresource"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkImageSubresource2").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		IMAGE_SUBRESOURCE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("imageSubresource"));
		//@formatter:on
	}

	public VkImageSubresource2() {
	    this(Arena.ofAuto());
	}
	
	public VkImageSubresource2(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkImageSubresource2(MemorySegment segment) {
	    this.segment = segment;
	
	    imageSubresource = new VkImageSubresource(segment.asSlice(IMAGE_SUBRESOURCE_BYTE_OFFSET, VkImageSubresource.LAYOUT));
	}

    /// @see #sType()
    public VkImageSubresource2 sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkImageSubresource2 pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #imageSubresource()
    public VkImageSubresource2 imageSubresource(Consumer<VkImageSubresource> consumer) {
    	consumer.accept(imageSubresource);
    	return this;
    }
    
    /// @see #imageSubresource()
    public VkImageSubresource2 imageSubresource(VkImageSubresource other) {
    	imageSubresource.set(other);
    	return this;
    }
    
    public VkImageSubresource imageSubresource() {
    	return imageSubresource;
    }
    
    @Override
    public VkImageSubresource2 set(VkImageSubresource2 other) {
        return set(other.segment);
    }
    
    @Override
    public VkImageSubresource2 set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkImageSubresource2> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkImageSubresource2> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkImageSubresource2(segment),
            count
        );
    }
    
    public static NativeStructArray<VkImageSubresource2> array(SegmentAllocator allocator, VkImageSubresource2... structs) {
        NativeStructArray<VkImageSubresource2> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkImageSubresource2(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkImageSubresource2> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkImageSubresource2(segment)
        );
    }

}