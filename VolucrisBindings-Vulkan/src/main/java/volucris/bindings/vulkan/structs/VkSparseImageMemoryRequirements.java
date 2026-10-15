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
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;

public final class VkSparseImageMemoryRequirements
		implements Struct<VkSparseImageMemoryRequirements> {

	public static final StructLayout LAYOUT;

	public static final VarHandle IMAGE_MIP_TAIL_FIRST_LOD_HANDLE;
	public static final VarHandle IMAGE_MIP_TAIL_SIZE_HANDLE;
	public static final VarHandle IMAGE_MIP_TAIL_OFFSET_HANDLE;
	public static final VarHandle IMAGE_MIP_TAIL_STRIDE_HANDLE;

	public static final long FORMAT_PROPERTIES_BYTE_OFFSET;
	public static final long IMAGE_MIP_TAIL_FIRST_LOD_BYTE_OFFSET;
	public static final long IMAGE_MIP_TAIL_SIZE_BYTE_OFFSET;
	public static final long IMAGE_MIP_TAIL_OFFSET_BYTE_OFFSET;
	public static final long IMAGE_MIP_TAIL_STRIDE_BYTE_OFFSET;

	private final MemorySegment segment;

	private final VkSparseImageFormatProperties formatProperties;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    VkSparseImageFormatProperties.LAYOUT.withName("formatProperties"),
		    JAVA_INT.withName("imageMipTailFirstLod"),
		    JAVA_LONG.withName("imageMipTailSize"),
		    JAVA_LONG.withName("imageMipTailOffset"),
		    JAVA_LONG.withName("imageMipTailStride")
		).withName("VkSparseImageMemoryRequirements").withByteAlignment(8);
		
		IMAGE_MIP_TAIL_FIRST_LOD_HANDLE = LAYOUT.varHandle(PathElement.groupElement("imageMipTailFirstLod"));
		IMAGE_MIP_TAIL_SIZE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("imageMipTailSize"));
		IMAGE_MIP_TAIL_OFFSET_HANDLE = LAYOUT.varHandle(PathElement.groupElement("imageMipTailOffset"));
		IMAGE_MIP_TAIL_STRIDE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("imageMipTailStride"));
		
		FORMAT_PROPERTIES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("formatProperties"));
		IMAGE_MIP_TAIL_FIRST_LOD_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("imageMipTailFirstLod"));
		IMAGE_MIP_TAIL_SIZE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("imageMipTailSize"));
		IMAGE_MIP_TAIL_OFFSET_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("imageMipTailOffset"));
		IMAGE_MIP_TAIL_STRIDE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("imageMipTailStride"));
		//@formatter:on
	}

	public VkSparseImageMemoryRequirements() {
	    this(Arena.ofAuto());
	}
	
	public VkSparseImageMemoryRequirements(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkSparseImageMemoryRequirements(MemorySegment segment) {
	    this.segment = segment;
	
	    formatProperties = new VkSparseImageFormatProperties(segment.asSlice(FORMAT_PROPERTIES_BYTE_OFFSET, VkSparseImageFormatProperties.LAYOUT));
	}

    /// @see #formatProperties()
    public VkSparseImageMemoryRequirements formatProperties(Consumer<VkSparseImageFormatProperties> consumer) {
    	consumer.accept(formatProperties);
    	return this;
    }
    
    /// @see #formatProperties()
    public VkSparseImageMemoryRequirements formatProperties(VkSparseImageFormatProperties other) {
    	formatProperties.set(other);
    	return this;
    }
    
    public VkSparseImageFormatProperties formatProperties() {
    	return formatProperties;
    }
    
    /// @see #imageMipTailFirstLod()
    public VkSparseImageMemoryRequirements imageMipTailFirstLod(int imageMipTailFirstLod) {
    	IMAGE_MIP_TAIL_FIRST_LOD_HANDLE.set(segment, 0L, imageMipTailFirstLod);
    	return this;
    }
    
    public int imageMipTailFirstLod() {
    	return (int) IMAGE_MIP_TAIL_FIRST_LOD_HANDLE.get(segment, 0L);
    }
    
    /// @see #imageMipTailSize()
    public VkSparseImageMemoryRequirements imageMipTailSize(long imageMipTailSize) {
    	IMAGE_MIP_TAIL_SIZE_HANDLE.set(segment, 0L, imageMipTailSize);
    	return this;
    }
    
    public long imageMipTailSize() {
    	return (long) IMAGE_MIP_TAIL_SIZE_HANDLE.get(segment, 0L);
    }
    
    /// @see #imageMipTailOffset()
    public VkSparseImageMemoryRequirements imageMipTailOffset(long imageMipTailOffset) {
    	IMAGE_MIP_TAIL_OFFSET_HANDLE.set(segment, 0L, imageMipTailOffset);
    	return this;
    }
    
    public long imageMipTailOffset() {
    	return (long) IMAGE_MIP_TAIL_OFFSET_HANDLE.get(segment, 0L);
    }
    
    /// @see #imageMipTailStride()
    public VkSparseImageMemoryRequirements imageMipTailStride(long imageMipTailStride) {
    	IMAGE_MIP_TAIL_STRIDE_HANDLE.set(segment, 0L, imageMipTailStride);
    	return this;
    }
    
    public long imageMipTailStride() {
    	return (long) IMAGE_MIP_TAIL_STRIDE_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkSparseImageMemoryRequirements set(VkSparseImageMemoryRequirements other) {
        return set(other.segment);
    }
    
    @Override
    public VkSparseImageMemoryRequirements set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkSparseImageMemoryRequirements> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkSparseImageMemoryRequirements> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkSparseImageMemoryRequirements(segment),
            count
        );
    }
    
    public static NativeStructArray<VkSparseImageMemoryRequirements> array(Arena arena, VkSparseImageMemoryRequirements... structs) {
        NativeStructArray<VkSparseImageMemoryRequirements> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkSparseImageMemoryRequirements(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkSparseImageMemoryRequirements> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkSparseImageMemoryRequirements(segment)
        );
    }

}