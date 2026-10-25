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

public final class VkImageFormatListCreateInfo
		implements Struct<VkImageFormatListCreateInfo> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle VIEW_FORMAT_COUNT_HANDLE;
	public static final VarHandle P_VIEW_FORMATS_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long VIEW_FORMAT_COUNT_BYTE_OFFSET;
	public static final long P_VIEW_FORMATS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("viewFormatCount"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pViewFormats")
		).withName("VkImageFormatListCreateInfo").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		VIEW_FORMAT_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("viewFormatCount"));
		P_VIEW_FORMATS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pViewFormats"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		VIEW_FORMAT_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("viewFormatCount"));
		P_VIEW_FORMATS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pViewFormats"));
		//@formatter:on
	}

	public VkImageFormatListCreateInfo() {
	    this(Arena.ofAuto());
	}
	
	public VkImageFormatListCreateInfo(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkImageFormatListCreateInfo(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkImageFormatListCreateInfo sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkImageFormatListCreateInfo pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #viewFormatCount()
    public VkImageFormatListCreateInfo viewFormatCount(int viewFormatCount) {
    	VIEW_FORMAT_COUNT_HANDLE.set(segment, 0L, viewFormatCount);
    	return this;
    }
    
    public int viewFormatCount() {
    	return (int) VIEW_FORMAT_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pViewFormats()
    public VkImageFormatListCreateInfo pViewFormats(NativeIntArray pViewFormats) {
    	P_VIEW_FORMATS_HANDLE.set(segment, 0L, pViewFormats.memorySegment());
    	return this;
    }
    
    public @Nullable NativeIntArray pViewFormats() {
    	MemorySegment segment = (MemorySegment) P_VIEW_FORMATS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeIntArray(segment);
    }
    
    @Override
    public VkImageFormatListCreateInfo set(VkImageFormatListCreateInfo other) {
        return set(other.segment);
    }
    
    @Override
    public VkImageFormatListCreateInfo set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkImageFormatListCreateInfo> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkImageFormatListCreateInfo> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkImageFormatListCreateInfo(segment),
            count
        );
    }
    
    public static NativeStructArray<VkImageFormatListCreateInfo> array(SegmentAllocator allocator, VkImageFormatListCreateInfo... structs) {
        NativeStructArray<VkImageFormatListCreateInfo> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkImageFormatListCreateInfo(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkImageFormatListCreateInfo> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkImageFormatListCreateInfo(segment)
        );
    }

}