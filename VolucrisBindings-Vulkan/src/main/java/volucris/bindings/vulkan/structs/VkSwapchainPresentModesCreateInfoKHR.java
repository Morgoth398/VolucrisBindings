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

public final class VkSwapchainPresentModesCreateInfoKHR
		implements Struct<VkSwapchainPresentModesCreateInfoKHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle PRESENT_MODE_COUNT_HANDLE;
	public static final VarHandle P_PRESENT_MODES_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long PRESENT_MODE_COUNT_BYTE_OFFSET;
	public static final long P_PRESENT_MODES_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("presentModeCount"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pPresentModes")
		).withName("VkSwapchainPresentModesCreateInfoKHR").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		PRESENT_MODE_COUNT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("presentModeCount"));
		P_PRESENT_MODES_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pPresentModes"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		PRESENT_MODE_COUNT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("presentModeCount"));
		P_PRESENT_MODES_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pPresentModes"));
		//@formatter:on
	}

	public VkSwapchainPresentModesCreateInfoKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkSwapchainPresentModesCreateInfoKHR(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkSwapchainPresentModesCreateInfoKHR(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkSwapchainPresentModesCreateInfoKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkSwapchainPresentModesCreateInfoKHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #presentModeCount()
    public VkSwapchainPresentModesCreateInfoKHR presentModeCount(int presentModeCount) {
    	PRESENT_MODE_COUNT_HANDLE.set(segment, 0L, presentModeCount);
    	return this;
    }
    
    public int presentModeCount() {
    	return (int) PRESENT_MODE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pPresentModes()
    public VkSwapchainPresentModesCreateInfoKHR pPresentModes(NativeIntArray pPresentModes) {
    	P_PRESENT_MODES_HANDLE.set(segment, 0L, pPresentModes.memorySegment());
    	return this;
    }
    
    public @Nullable NativeIntArray pPresentModes() {
    	MemorySegment segment = (MemorySegment) P_PRESENT_MODES_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new NativeIntArray(segment);
    }
    
    @Override
    public VkSwapchainPresentModesCreateInfoKHR set(VkSwapchainPresentModesCreateInfoKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkSwapchainPresentModesCreateInfoKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkSwapchainPresentModesCreateInfoKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkSwapchainPresentModesCreateInfoKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkSwapchainPresentModesCreateInfoKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkSwapchainPresentModesCreateInfoKHR> array(Arena arena, VkSwapchainPresentModesCreateInfoKHR... structs) {
        NativeStructArray<VkSwapchainPresentModesCreateInfoKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkSwapchainPresentModesCreateInfoKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkSwapchainPresentModesCreateInfoKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkSwapchainPresentModesCreateInfoKHR(segment)
        );
    }

}