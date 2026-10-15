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

public final class VkSurfacePresentModeCompatibilityKHR
		implements Struct<VkSurfacePresentModeCompatibilityKHR> {

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
		).withName("VkSurfacePresentModeCompatibilityKHR").withByteAlignment(8);
		
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

	public VkSurfacePresentModeCompatibilityKHR() {
	    this(Arena.ofAuto());
	}
	
	public VkSurfacePresentModeCompatibilityKHR(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkSurfacePresentModeCompatibilityKHR(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkSurfacePresentModeCompatibilityKHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkSurfacePresentModeCompatibilityKHR pNext(MemorySegment pNext) {
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
    public VkSurfacePresentModeCompatibilityKHR presentModeCount(int presentModeCount) {
    	PRESENT_MODE_COUNT_HANDLE.set(segment, 0L, presentModeCount);
    	return this;
    }
    
    public int presentModeCount() {
    	return (int) PRESENT_MODE_COUNT_HANDLE.get(segment, 0L);
    }
    
    /// @see #pPresentModes()
    public VkSurfacePresentModeCompatibilityKHR pPresentModes(NativeIntArray pPresentModes) {
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
    public VkSurfacePresentModeCompatibilityKHR set(VkSurfacePresentModeCompatibilityKHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkSurfacePresentModeCompatibilityKHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkSurfacePresentModeCompatibilityKHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkSurfacePresentModeCompatibilityKHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkSurfacePresentModeCompatibilityKHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkSurfacePresentModeCompatibilityKHR> array(Arena arena, VkSurfacePresentModeCompatibilityKHR... structs) {
        NativeStructArray<VkSurfacePresentModeCompatibilityKHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkSurfacePresentModeCompatibilityKHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkSurfacePresentModeCompatibilityKHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkSurfacePresentModeCompatibilityKHR(segment)
        );
    }

}