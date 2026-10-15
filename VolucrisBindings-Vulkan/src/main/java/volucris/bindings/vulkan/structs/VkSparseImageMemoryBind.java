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

public final class VkSparseImageMemoryBind
		implements Struct<VkSparseImageMemoryBind> {

	public static final StructLayout LAYOUT;

	public static final VarHandle MEMORY_HANDLE;
	public static final VarHandle MEMORY_OFFSET_HANDLE;
	public static final VarHandle FLAGS_HANDLE;

	public static final long SUBRESOURCE_BYTE_OFFSET;
	public static final long OFFSET_BYTE_OFFSET;
	public static final long EXTENT_BYTE_OFFSET;
	public static final long MEMORY_BYTE_OFFSET;
	public static final long MEMORY_OFFSET_BYTE_OFFSET;
	public static final long FLAGS_BYTE_OFFSET;

	private final MemorySegment segment;

	private final VkImageSubresource subresource;
	private final VkOffset3D offset;
	private final VkExtent3D extent;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    VkImageSubresource.LAYOUT.withName("subresource"),
		    VkOffset3D.LAYOUT.withName("offset"),
		    VkExtent3D.LAYOUT.withName("extent"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("memory"),
		    JAVA_LONG.withName("memoryOffset"),
		    JAVA_INT.withName("flags"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkSparseImageMemoryBind").withByteAlignment(8);
		
		MEMORY_HANDLE = LAYOUT.varHandle(PathElement.groupElement("memory"));
		MEMORY_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("memoryOffset"));
		FLAGS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("flags"));
		
		SUBRESOURCE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("subresource"));
		OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("offset"));
		EXTENT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("extent"));
		MEMORY_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("memory"));
		MEMORY_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("memoryOffset"));
		FLAGS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("flags"));
		//@formatter:on
	}

	public VkSparseImageMemoryBind() {
	    this(Arena.ofAuto());
	}
	
	public VkSparseImageMemoryBind(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkSparseImageMemoryBind(MemorySegment segment) {
	    this.segment = segment;
	
	    subresource = new VkImageSubresource(segment.asSlice(SUBRESOURCE_BYTE_OFFSET, VkImageSubresource.LAYOUT));
	    offset = new VkOffset3D(segment.asSlice(OFFSET_BYTE_OFFSET, VkOffset3D.LAYOUT));
	    extent = new VkExtent3D(segment.asSlice(EXTENT_BYTE_OFFSET, VkExtent3D.LAYOUT));
	}

    /// @see #subresource()
    public VkSparseImageMemoryBind subresource(Consumer<VkImageSubresource> consumer) {
    	consumer.accept(subresource);
    	return this;
    }
    
    /// @see #subresource()
    public VkSparseImageMemoryBind subresource(VkImageSubresource other) {
    	subresource.set(other);
    	return this;
    }
    
    public VkImageSubresource subresource() {
    	return subresource;
    }
    
    /// @see #offset()
    public VkSparseImageMemoryBind offset(Consumer<VkOffset3D> consumer) {
    	consumer.accept(offset);
    	return this;
    }
    
    /// @see #offset()
    public VkSparseImageMemoryBind offset(VkOffset3D other) {
    	offset.set(other);
    	return this;
    }
    
    public VkOffset3D offset() {
    	return offset;
    }
    
    /// @see #extent()
    public VkSparseImageMemoryBind extent(Consumer<VkExtent3D> consumer) {
    	consumer.accept(extent);
    	return this;
    }
    
    /// @see #extent()
    public VkSparseImageMemoryBind extent(VkExtent3D other) {
    	extent.set(other);
    	return this;
    }
    
    public VkExtent3D extent() {
    	return extent;
    }
    
    /// @see #memory()
    public VkSparseImageMemoryBind memory(VkDeviceMemory memory) {
    	MEMORY_HANDLE.set(segment, 0L, memory.memorySegment());
    	return this;
    }
    
    public @Nullable VkDeviceMemory memory() {
    	MemorySegment segment = (MemorySegment) MEMORY_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkDeviceMemory(segment);
    }
    
    /// @see #memoryOffset()
    public VkSparseImageMemoryBind memoryOffset(long memoryOffset) {
    	MEMORY_OFFSET_HANDLE.set(segment, 0L, memoryOffset);
    	return this;
    }
    
    public long memoryOffset() {
    	return (long) MEMORY_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #flags()
    public VkSparseImageMemoryBind flags(int flags) {
    	FLAGS_HANDLE.set(segment, 0L, flags);
    	return this;
    }
    
    public int flags() {
    	return (int) FLAGS_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkSparseImageMemoryBind set(VkSparseImageMemoryBind other) {
        return set(other.segment);
    }
    
    @Override
    public VkSparseImageMemoryBind set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkSparseImageMemoryBind> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkSparseImageMemoryBind> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkSparseImageMemoryBind(segment),
            count
        );
    }
    
    public static NativeStructArray<VkSparseImageMemoryBind> array(Arena arena, VkSparseImageMemoryBind... structs) {
        NativeStructArray<VkSparseImageMemoryBind> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkSparseImageMemoryBind(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkSparseImageMemoryBind> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkSparseImageMemoryBind(segment)
        );
    }

}