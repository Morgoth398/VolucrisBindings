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
import volucris.bindings.core.NativeLongArray;
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkPresentId2KHR
		implements Struct<VkPresentId2KHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle SWAPCHAIN_COUNT_HANDLE;
	public static final VarHandle P_PRESENT_IDS_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long SWAPCHAIN_COUNT_BYTE_OFFSET;
	public static final long P_PRESENT_IDS_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("swapchainCount"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pPresentIds")
		).withName("VkPresentId2KHR").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		SWAPCHAIN_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("swapchainCount"));
		P_PRESENT_IDS_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pPresentIds"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		SWAPCHAIN_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("swapchainCount"));
		P_PRESENT_IDS_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pPresentIds"));
		//@formatter:on
	}

	public VkPresentId2KHR() {
	    this(Arena.ofAuto());
	}
	
	public VkPresentId2KHR(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPresentId2KHR(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPresentId2KHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPresentId2KHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #swapchainCount()
    public VkPresentId2KHR swapchainCount(int swapchainCount) {
    	SWAPCHAIN_COUNT_HANDLE.set(segment, 0L, swapchainCount);
    	return this;
    }
    
    public int swapchainCount() {
    	return (int) SWAPCHAIN_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pPresentIds()
    public VkPresentId2KHR pPresentIds(NativeLongArray pPresentIds) {
    	P_PRESENT_IDS_HANDLE.set(segment, 0L, pPresentIds.memorySegment());
    	return this;
    }
    
    public @Nullable NativeLongArray pPresentIds() {
    	MemorySegment segment = (MemorySegment) P_PRESENT_IDS_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeLongArray(segment);
    }
    
    @Override
    public VkPresentId2KHR set(VkPresentId2KHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkPresentId2KHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPresentId2KHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPresentId2KHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPresentId2KHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPresentId2KHR> array(Arena arena, VkPresentId2KHR... structs) {
        NativeStructArray<VkPresentId2KHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPresentId2KHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPresentId2KHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPresentId2KHR(segment)
        );
    }

}