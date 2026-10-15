/*
 * MACHINE GENERATED FILE, DO NOT EDIT.
 */
package volucris.bindings.vulkan.structs;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
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

public final class VkReleaseSwapchainImagesInfoKHR
		implements Struct<VkReleaseSwapchainImagesInfoKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle SWAPCHAIN_HANDLE;
	public static final VarHandle IMAGE_INDEX_COUNT_HANDLE;
	public static final VarHandle P_IMAGE_INDICES_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long SWAPCHAIN_BYTE_OFFSET;
	public static final long IMAGE_INDEX_COUNT_BYTE_OFFSET;
	public static final long P_IMAGE_INDICES_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    UNBOUNDED_ADDRESS.withName("swapchain"),
		    JAVA_INT.withName("imageIndexCount"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pImageIndices")
		).withName("VkReleaseSwapchainImagesInfoKHR").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		SWAPCHAIN_HANDLE = LAYOUT.varHandle(PathElement.groupElement("swapchain"));
		IMAGE_INDEX_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("imageIndexCount"));
		P_IMAGE_INDICES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pImageIndices"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		SWAPCHAIN_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("swapchain"));
		IMAGE_INDEX_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("imageIndexCount"));
		P_IMAGE_INDICES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pImageIndices"));
		//@formatter:on
	}

	public VkReleaseSwapchainImagesInfoKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkReleaseSwapchainImagesInfoKHR(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkReleaseSwapchainImagesInfoKHR(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkReleaseSwapchainImagesInfoKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkReleaseSwapchainImagesInfoKHR pNext(MemorySegment pNext) {
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
    public VkReleaseSwapchainImagesInfoKHR swapchain(VkSwapchainKHR swapchain) {
    	SWAPCHAIN_HANDLE.set(segment, 0L, swapchain.memorySegment());
    	return this;
    }
    
    public @Nullable VkSwapchainKHR swapchain() {
    	MemorySegment segment = (MemorySegment) SWAPCHAIN_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkSwapchainKHR(segment);
    }
    
    /// @see #imageIndexCount()
    public VkReleaseSwapchainImagesInfoKHR imageIndexCount(int imageIndexCount) {
    	IMAGE_INDEX_COUNT_HANDLE.set(segment, 0L, imageIndexCount);
    	return this;
    }
    
    public int imageIndexCount() {
    	return (int) IMAGE_INDEX_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pImageIndices()
    public VkReleaseSwapchainImagesInfoKHR pImageIndices(NativeIntArray pImageIndices) {
    	P_IMAGE_INDICES_HANDLE.set(segment, 0L, pImageIndices.memorySegment());
    	return this;
    }
    
    public @Nullable NativeIntArray pImageIndices() {
    	MemorySegment segment = (MemorySegment) P_IMAGE_INDICES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeIntArray(segment);
    }
    
    @Override
    public VkReleaseSwapchainImagesInfoKHR set(VkReleaseSwapchainImagesInfoKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkReleaseSwapchainImagesInfoKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkReleaseSwapchainImagesInfoKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkReleaseSwapchainImagesInfoKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkReleaseSwapchainImagesInfoKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkReleaseSwapchainImagesInfoKHR> array(Arena arena, VkReleaseSwapchainImagesInfoKHR... structs) {
        NativeStructArray<VkReleaseSwapchainImagesInfoKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkReleaseSwapchainImagesInfoKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkReleaseSwapchainImagesInfoKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkReleaseSwapchainImagesInfoKHR(segment)
        );
    }

}