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
import volucris.bindings.core.NativeStructArray;
import volucris.bindings.core.Struct;
import volucris.bindings.vulkan.*;
import volucris.bindings.vulkan.handles.*;
import volucris.bindings.vulkan.unions.*;

import static java.lang.foreign.ValueLayout.*;
import static volucris.bindings.core.FFMUtils.*;

public final class VkPhysicalDeviceSurfaceInfo2KHR
		implements Struct<VkPhysicalDeviceSurfaceInfo2KHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle SURFACE_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long SURFACE_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    UNBOUNDED_ADDRESS.withName("surface")
		).withName("VkPhysicalDeviceSurfaceInfo2KHR").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		SURFACE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("surface"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		SURFACE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("surface"));
		//@formatter:on
	}

	public VkPhysicalDeviceSurfaceInfo2KHR() {
	    this(Arena.ofAuto());
	}
	
	public VkPhysicalDeviceSurfaceInfo2KHR(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkPhysicalDeviceSurfaceInfo2KHR(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkPhysicalDeviceSurfaceInfo2KHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkPhysicalDeviceSurfaceInfo2KHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #surface()
    public VkPhysicalDeviceSurfaceInfo2KHR surface(VkSurfaceKHR surface) {
    	SURFACE_HANDLE.set(segment, 0L, surface.memorySegment());
    	return this;
    }
    
    public @Nullable VkSurfaceKHR surface() {
    	MemorySegment segment = (MemorySegment) SURFACE_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return new VkSurfaceKHR(segment);
    }
    
    @Override
    public VkPhysicalDeviceSurfaceInfo2KHR set(VkPhysicalDeviceSurfaceInfo2KHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkPhysicalDeviceSurfaceInfo2KHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkPhysicalDeviceSurfaceInfo2KHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkPhysicalDeviceSurfaceInfo2KHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceSurfaceInfo2KHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkPhysicalDeviceSurfaceInfo2KHR> array(Arena arena, VkPhysicalDeviceSurfaceInfo2KHR... structs) {
        NativeStructArray<VkPhysicalDeviceSurfaceInfo2KHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkPhysicalDeviceSurfaceInfo2KHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkPhysicalDeviceSurfaceInfo2KHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkPhysicalDeviceSurfaceInfo2KHR(segment)
        );
    }

}