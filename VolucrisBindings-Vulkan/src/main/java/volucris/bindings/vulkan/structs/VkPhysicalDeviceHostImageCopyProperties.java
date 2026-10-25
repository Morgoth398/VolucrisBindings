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
import org.jspecify.annotations.Nullable;
import volucris.bindings.core.NativeIntArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkPhysicalDeviceHostImageCopyProperties
		implements Struct<VkPhysicalDeviceHostImageCopyProperties> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle COPY_SRC_LAYOUT_COUNT_HANDLE;
	public static final VarHandle P_COPY_SRC_LAYOUTS_HANDLE;
	public static final VarHandle COPY_DST_LAYOUT_COUNT_HANDLE;
	public static final VarHandle P_COPY_DST_LAYOUTS_HANDLE;
	public static final VarHandle OPTIMAL_TILING_LAYOUT_UUID_HANDLE;
	public static final VarHandle IDENTICAL_MEMORY_TYPE_REQUIREMENTS_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long COPY_SRC_LAYOUT_COUNT_BYTE_OFFSET;
	public static final long P_COPY_SRC_LAYOUTS_BYTE_OFFSET;
	public static final long COPY_DST_LAYOUT_COUNT_BYTE_OFFSET;
	public static final long P_COPY_DST_LAYOUTS_BYTE_OFFSET;
	public static final long OPTIMAL_TILING_LAYOUT_UUID_BYTE_OFFSET;
	public static final long IDENTICAL_MEMORY_TYPE_REQUIREMENTS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("copySrcLayoutCount"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pCopySrcLayouts"),
		    JAVA_INT.withName("copyDstLayoutCount"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pCopyDstLayouts"),
		    MemoryLayout.sequenceLayout(16, JAVA_BYTE).withName("optimalTilingLayoutUUID"),
		    JAVA_INT.withName("identicalMemoryTypeRequirements"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkPhysicalDeviceHostImageCopyProperties").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		COPY_SRC_LAYOUT_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("copySrcLayoutCount"));
		P_COPY_SRC_LAYOUTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pCopySrcLayouts"));
		COPY_DST_LAYOUT_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("copyDstLayoutCount"));
		P_COPY_DST_LAYOUTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pCopyDstLayouts"));
		OPTIMAL_TILING_LAYOUT_UUID_HANDLE = LAYOUT.varHandle(PathElement.groupElement("optimalTilingLayoutUUID"), PathElement.sequenceElement());
		IDENTICAL_MEMORY_TYPE_REQUIREMENTS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("identicalMemoryTypeRequirements"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		COPY_SRC_LAYOUT_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("copySrcLayoutCount"));
		P_COPY_SRC_LAYOUTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pCopySrcLayouts"));
		COPY_DST_LAYOUT_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("copyDstLayoutCount"));
		P_COPY_DST_LAYOUTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pCopyDstLayouts"));
		OPTIMAL_TILING_LAYOUT_UUID_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("optimalTilingLayoutUUID"));
		IDENTICAL_MEMORY_TYPE_REQUIREMENTS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("identicalMemoryTypeRequirements"));
		//@formatter:on
	}

	public VkPhysicalDeviceHostImageCopyProperties() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceHostImageCopyProperties(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceHostImageCopyProperties(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceHostImageCopyProperties sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceHostImageCopyProperties pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #copySrcLayoutCount()
    public VkPhysicalDeviceHostImageCopyProperties copySrcLayoutCount(int copySrcLayoutCount) {
    	COPY_SRC_LAYOUT_COUNT_HANDLE.set(segment, 0L, copySrcLayoutCount);
    	return this;
    }
    
    public int copySrcLayoutCount() {
    	return (int) COPY_SRC_LAYOUT_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pCopySrcLayouts()
    public VkPhysicalDeviceHostImageCopyProperties pCopySrcLayouts(NativeIntArray pCopySrcLayouts) {
    	P_COPY_SRC_LAYOUTS_HANDLE.set(segment, 0L, pCopySrcLayouts.memorySegment());
    	return this;
    }
    
    public @Nullable NativeIntArray pCopySrcLayouts() {
    	MemorySegment segment = (MemorySegment) P_COPY_SRC_LAYOUTS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeIntArray(segment);
    }
    
    /// @see #copyDstLayoutCount()
    public VkPhysicalDeviceHostImageCopyProperties copyDstLayoutCount(int copyDstLayoutCount) {
    	COPY_DST_LAYOUT_COUNT_HANDLE.set(segment, 0L, copyDstLayoutCount);
    	return this;
    }
    
    public int copyDstLayoutCount() {
    	return (int) COPY_DST_LAYOUT_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pCopyDstLayouts()
    public VkPhysicalDeviceHostImageCopyProperties pCopyDstLayouts(NativeIntArray pCopyDstLayouts) {
    	P_COPY_DST_LAYOUTS_HANDLE.set(segment, 0L, pCopyDstLayouts.memorySegment());
    	return this;
    }
    
    public @Nullable NativeIntArray pCopyDstLayouts() {
    	MemorySegment segment = (MemorySegment) P_COPY_DST_LAYOUTS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeIntArray(segment);
    }
    
    /// @see #optimalTilingLayoutUUID(int)
    public VkPhysicalDeviceHostImageCopyProperties optimalTilingLayoutUUID(byte optimalTilingLayoutUUID, int index0) {
    	OPTIMAL_TILING_LAYOUT_UUID_HANDLE.set(segment, 0L, index0, optimalTilingLayoutUUID);
    	return this;
    }
    
    public byte optimalTilingLayoutUUID(int index0) {
    	return (byte) OPTIMAL_TILING_LAYOUT_UUID_HANDLE.get(segment, 0L, index0);
    }
    
    /// @see #identicalMemoryTypeRequirements()
    public VkPhysicalDeviceHostImageCopyProperties identicalMemoryTypeRequirements(int identicalMemoryTypeRequirements) {
    	IDENTICAL_MEMORY_TYPE_REQUIREMENTS_HANDLE.set(segment, 0L, identicalMemoryTypeRequirements);
    	return this;
    }
    
    public int identicalMemoryTypeRequirements() {
    	return (int) IDENTICAL_MEMORY_TYPE_REQUIREMENTS_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkPhysicalDeviceHostImageCopyProperties set(VkPhysicalDeviceHostImageCopyProperties other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceHostImageCopyProperties set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceHostImageCopyProperties> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceHostImageCopyProperties> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceHostImageCopyProperties(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceHostImageCopyProperties> array(SegmentAllocator allocator, VkPhysicalDeviceHostImageCopyProperties... structs) {
        NativeStructArray<VkPhysicalDeviceHostImageCopyProperties> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkPhysicalDeviceHostImageCopyProperties(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceHostImageCopyProperties> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceHostImageCopyProperties(segment)
        );
    }

}