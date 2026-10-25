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
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkBindImageMemorySwapchainInfoKHR
		implements Struct<VkBindImageMemorySwapchainInfoKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle SWAPCHAIN_HANDLE;
	public static final VarHandle IMAGE_INDEX_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long SWAPCHAIN_BYTE_OFFSET;
	public static final long IMAGE_INDEX_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    UNBOUNDED_ADDRESS.withName("swapchain"),
		    JAVA_INT.withName("imageIndex"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkBindImageMemorySwapchainInfoKHR").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		SWAPCHAIN_HANDLE = LAYOUT.varHandle(PathElement.groupElement("swapchain"));
		IMAGE_INDEX_HANDLE = LAYOUT.varHandle(PathElement.groupElement("imageIndex"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		SWAPCHAIN_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("swapchain"));
		IMAGE_INDEX_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("imageIndex"));
		//@formatter:on
	}

	public VkBindImageMemorySwapchainInfoKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkBindImageMemorySwapchainInfoKHR(SegmentAllocator allocator) {
	    this(allocator.allocate(LAYOUT));
	}
	
	public VkBindImageMemorySwapchainInfoKHR(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkBindImageMemorySwapchainInfoKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkBindImageMemorySwapchainInfoKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #swapchain()
    public VkBindImageMemorySwapchainInfoKHR swapchain(VkSwapchainKHR swapchain) {
    	SWAPCHAIN_HANDLE.set(segment, 0L, swapchain.memorySegment());
    	return this;
    }
    
    public @Nullable VkSwapchainKHR swapchain() {
    	MemorySegment segment = (MemorySegment) SWAPCHAIN_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkSwapchainKHR(segment);
    }
    
    /// @see #imageIndex()
    public VkBindImageMemorySwapchainInfoKHR imageIndex(int imageIndex) {
    	IMAGE_INDEX_HANDLE.set(segment, 0L, imageIndex);
    	return this;
    }
    
    public int imageIndex() {
    	return (int) IMAGE_INDEX_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkBindImageMemorySwapchainInfoKHR set(VkBindImageMemorySwapchainInfoKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkBindImageMemorySwapchainInfoKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkBindImageMemorySwapchainInfoKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkBindImageMemorySwapchainInfoKHR> array(SegmentAllocator allocator, int count) {
        return new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkBindImageMemorySwapchainInfoKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkBindImageMemorySwapchainInfoKHR> array(SegmentAllocator allocator, VkBindImageMemorySwapchainInfoKHR... structs) {
        NativeStructArray<VkBindImageMemorySwapchainInfoKHR> array = new NativeStructArray<>(
            allocator,
            LAYOUT,
            segment -> new VkBindImageMemorySwapchainInfoKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkBindImageMemorySwapchainInfoKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkBindImageMemorySwapchainInfoKHR(segment)
        );
    }

}