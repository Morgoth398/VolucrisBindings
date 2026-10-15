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

public final class VkSurfaceCapabilitiesPresentWait2KHR
		implements Struct<VkSurfaceCapabilitiesPresentWait2KHR> {

	public static final StructLayout LAYOUT;

	public static final VarHandle S_TYPE_HANDLE;
	public static final VarHandle P_NEXT_HANDLE;
	public static final VarHandle PRESENT_WAIT2_SUPPORTED_HANDLE;

	public static final long S_TYPE_BYTE_OFFSET;
	public static final long P_NEXT_BYTE_OFFSET;
	public static final long PRESENT_WAIT2_SUPPORTED_BYTE_OFFSET;

	private final MemorySegment segment;

	static {
		//@formatter:off
		LAYOUT = MemoryLayout.structLayout(
		    JAVA_INT.withName("sType"),
		    MemoryLayout.paddingLayout(4),
		    UNBOUNDED_ADDRESS.withName("pNext"),
		    JAVA_INT.withName("presentWait2Supported"),
		    MemoryLayout.paddingLayout(4)
		).withName("VkSurfaceCapabilitiesPresentWait2KHR").withByteAlignment(8);
		
		S_TYPE_HANDLE = LAYOUT.varHandle(PathElement.groupElement("sType"));
		P_NEXT_HANDLE = LAYOUT.varHandle(PathElement.groupElement("pNext"));
		PRESENT_WAIT2_SUPPORTED_HANDLE = LAYOUT.varHandle(PathElement.groupElement("presentWait2Supported"));
		
		S_TYPE_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("sType"));
		P_NEXT_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("pNext"));
		PRESENT_WAIT2_SUPPORTED_BYTE_OFFSET = LAYOUT.byteOffset(PathElement.groupElement("presentWait2Supported"));
		//@formatter:on
	}

	public VkSurfaceCapabilitiesPresentWait2KHR() {
	    this(Arena.ofAuto());
	}
	
	public VkSurfaceCapabilitiesPresentWait2KHR(Arena arena) {
	    this(arena.allocate(LAYOUT));
	}
	
	public VkSurfaceCapabilitiesPresentWait2KHR(MemorySegment segment) {
	    this.segment = segment;
	
	}

    /// @see #sType()
    public VkSurfaceCapabilitiesPresentWait2KHR sType(int sType) {
    	S_TYPE_HANDLE.set(segment, 0L, sType);
    	return this;
    }
    
    public int sType() {
    	return (int) S_TYPE_HANDLE.get(segment, 0L);
    }
    
    /// @see #pNext()
    public VkSurfaceCapabilitiesPresentWait2KHR pNext(MemorySegment pNext) {
    	P_NEXT_HANDLE.set(segment, 0L, pNext);
    	return this;
    }
    
    public @Nullable MemorySegment pNext() {
    	MemorySegment segment = (MemorySegment) P_NEXT_HANDLE.get(this.segment, 0L);
    
    	if (segment.equals(MemorySegment.NULL))
    		return null;
    	
    	return segment;
    }
    
    /// @see #presentWait2Supported()
    public VkSurfaceCapabilitiesPresentWait2KHR presentWait2Supported(int presentWait2Supported) {
    	PRESENT_WAIT2_SUPPORTED_HANDLE.set(segment, 0L, presentWait2Supported);
    	return this;
    }
    
    public int presentWait2Supported() {
    	return (int) PRESENT_WAIT2_SUPPORTED_HANDLE.get(segment, 0L);
    }
    
    @Override
    public VkSurfaceCapabilitiesPresentWait2KHR set(VkSurfaceCapabilitiesPresentWait2KHR other) {
        return set(other.segment);
    }
    
    @Override
    public VkSurfaceCapabilitiesPresentWait2KHR set(MemorySegment src) {
        MemorySegment.copy(src, 0L, segment, 0L, LAYOUT.byteSize());
        return this;
    }
    
    @Override
    public MemorySegment memorySegment() {
        return segment;
    }
    
    public NativeStructArray<VkSurfaceCapabilitiesPresentWait2KHR> asArray() {
        return new NativeStructArray<>(this);
    }
    
    public static NativeStructArray<VkSurfaceCapabilitiesPresentWait2KHR> array(Arena arena, int count) {
        return new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkSurfaceCapabilitiesPresentWait2KHR(segment),
            count
        );
    }
    
    public static NativeStructArray<VkSurfaceCapabilitiesPresentWait2KHR> array(Arena arena, VkSurfaceCapabilitiesPresentWait2KHR... structs) {
        NativeStructArray<VkSurfaceCapabilitiesPresentWait2KHR> array = new NativeStructArray<>(
            arena,
            LAYOUT,
            segment -> new VkSurfaceCapabilitiesPresentWait2KHR(segment),
            structs.length
        );
    
        for (int i = 0; i < structs.length; i++) {
            array.set(i, structs[i]);
        }
    
        return array;
    }
    
    public static NativeStructArray<VkSurfaceCapabilitiesPresentWait2KHR> array(MemorySegment array) {
        return new NativeStructArray<>(
            array,
            LAYOUT,
            segment -> new VkSurfaceCapabilitiesPresentWait2KHR(segment)
        );
    }

}